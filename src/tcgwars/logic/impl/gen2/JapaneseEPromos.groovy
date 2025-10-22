package tcgwars.logic.impl.gen2

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import java.util.*;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

public enum JapaneseEPromos implements LogicCardInfo {

  WARTORTLE_T12("Wartortle", "1", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DRATINI_T16("Dratini", "2", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  LARVITAR_P5("Larvitar", "3", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  JapaneseEPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
    this.name = name;
    this.rarity = rarity;
    this.collectionLineNo = collectionLineNo;
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Rarity getRarity() {
    return rarity;
  }

  @Override
  public String getNumber() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.JapaneseEPromos;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case WARTORTLE_T12:
        return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:1) {
          weakness L
          move "Wave Splash", {
            text "20 Damage."
            energyCost W
            onAttack {
              damage 20
              }
            }
          }
          move "Rapid Spin", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch Wartortle with 1 of your Benched Pokémon, if any."
            energyCost C, C, C
            onAttack {
              damage 30
              if(opp.bench) sw defending, opp.bench.oppSelect("Select new active.")
              switchYourActive()
            }
          }
        };
      case DRATINI_T16:
        return basic (this, hp:HP040, type:C, retreatCost:1) {
          move "Energy Draw", {
            text "Flip a coin. If heads, search your deck for a basic Energy card and attach it to Dratini. Shuffle your deck afterward."
            energyCost C
            onAttack {
              flip{attachEnergyFrom(basic : true, my.deck, self)}
            }
          }
          move "Dragon Bind", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, L
            onAttack {
              damage 10
              flip{applyAfterDamage POISONED}
            }
          }
        };
      case LARVITAR_P5:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness W
          move "Call for Friends", {
            text "Search your deck for a Baby Pokémon card or a Basic Pokémon card and put it onto your Bench. Shuffle your deck afterwar."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack{
              my.deck.search(max:1, "Search your deck for a Basic or Baby Pokemom",{it.cardTypes.isIn(BASIC,BABY)}).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Stomp", {
            text "Flip a coin. If heads, this attack does 20 damage plus 10 more damage. If tails, this attack does 20 damage."
            energyCost F, C
            onAttack {
              damage 20
              flip{damage 10}
            }
          }
        };
        default;
        return null;
      }
    }
  }
