package tcgwars.logic.impl.gen1;

import tcgwars.logic.impl.gen1.BaseSetNG;
import tcgwars.logic.impl.gen1.GymHeroes;
import tcgwars.logic.impl.gen1.GymChallenge;
import tcgwars.logic.impl.gen2.NeoGenesis;

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.effect.gm.PlayCard;

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

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author piplup
 */
public enum BestOfGame implements LogicCardInfo {

  ELECTABUZZ_1 ("Electabuzz", "1", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  HITMONCHAN_2 ("Hitmonchan", "2", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
  PROFESSOR_ELM_3 ("Professor Elm", "3", Rarity.PROMO, [TRAINER]),
  ROCKETS_SCIZOR_4 ("Rocket's Scizor", "4", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  ROCKETS_SNEASEL_5 ("Rocket's Sneasal", "5", Rarity.PROMO, [POKEMON, BASIC, _DARKNESS_]),
  DARK_IVYSAUR_6 ("Dark Ivysaur", "6", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DARK_VENUSAUR_7  ("Dark Venusaur", "7", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ROCKETS_MEWTWO_8 ("Rocket's Mewtwo", "8", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  ROCKETS_HITMONCHAN_9 ("Rocket's Hitmonchan", "9", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  BestOfGame(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.BEST_OF_GAME;
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
      case ELECTABUZZ_1:
        return copy (BaseSetNG.ELECTABUZZ, this);
      case HITMONCHAN_2:
        return copy (BaseSetNG.HITMONCHAN, this);
      case PROFESSOR_ELM_3:
        return copy (NeoGenesis.PROFESSOR_ELM_96, this);
      case ROCKETS_SCIZOR_4:
        return basic (this, hp:HP060, type:METAL, retreatCost:2) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Focus", {
            text "During your next turn, Rocket's Scizor's Agility attack's base damage is doubled."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Agility", hp(20))
            }
          }
          move "Agility", {
            text "Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Rocket's Scizor."
            energyCost M, C, C
            onAttack {
              damage 20
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
        };
      case ROCKETS_SNEASEL_5:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Entrap", {
            text "The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost D
            onAttack {
              cantRetreat defending
            }
          }
          move "Continuous Scratch", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 4, {damage 10}
            }
          }
        };
      case DARK_IVYSAUR_6:
        return evolution (this, hp:HP050, from: "Bulbasaur", type:GRASS, retreatCost:2) {
          weakness FIRE
          pokeBody "Vine Pull", {
            text "Once during your turn when Dark Ivysaur retreats, choose 1 of your opponent's Benched Pokémon and switch it with his or her Active Pokémon."
            delayedA {
              after RETREAT, {
                if (ef.retreater == self) {
                  switchYourOpponentsBenchedWithActive()
                }
              }
            }
          }
          move "Fury Strikes", {
            text "Your opponent puts 3 markers onto his or her Pokémon (divided as he or she chooses). (More than 1 marker can be put on the same Pokémon.) Then, this attack does 10 damage to each Pokémon for each marker on it. Don't apply Weakness and Resistance. Remove the markers at the end of the turn."
            energyCost G, G
            onAttack {
              3.times {
                noWrDamage 10, opp.all.oppSelect("Choose a Pokémon to put a marker on")
              }
            }
          }
        };
      case DARK_VENUSAUR_7:
        return evolution (this, from: "Dark Ivysaur", hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Horrid Pollen", {
            text "30 damage. Flip 2 coins. If 1 is heads, the Defending Pokémon is now Asleep and Poisoned. If both are heads, the Defending Pokémon is now Confused and Poisoned. If both are tails, the Defending Pokémon is now Paralyzed and Poisoned. "
            energyCost G, G, G
            onAttack {
              damage 30
              afterDamage {
                flip 2,{},{}, [0:{
                  apply PARALYZED
                  apply POISONED
                }, 1: {
                  apply ASLEEP
                  apply POISONED
                }, 2: {
                  apply CONFUSED
                  apply POISONED
                }]
              }
            }
          }
        };
      case ROCKETS_MEWTWO_8:
        return copy (GymChallenge.ROCKET_S_MEWTWO_14, this);
      case ROCKETS_HITMONCHAN_9:
        return copy (GymHeroes.ROCKET_S_HITMONCHAN_11, this);
      default:
        return null;
    }
  }
}
