package tcgwars.logic.impl.gen;

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
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries2 implements LogicCardInfo {

  ENTEI_1 ("Entei", 1, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  PIDGEOT_2 ("Pidgeot", 2, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  RAIKOU_3 ("Raikou", 3, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  SUICUNE_4 ("Suicune", 4, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  TAUROS_5 ("Tauros", 5, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  VENUSAUR_6 ("Venusaur", 6, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  IVYSAUR_7 ("Ivysaur", 7, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MR_BRINEY_S_COMPASSION_8 ("Mr. Briney's Compassion", 8, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MULTI_TECHNICAL_MACHINE_01_9 ("Multi Technical Machine 01", 9, Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  POKEMON_PARK_10 ("Pokémon Park", 10, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TV_REPORTER_11 ("TV Reporter", 11, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BULBASAUR_12 ("Bulbasaur", 12, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CACNEA_13 ("Cacnea", 13, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LUVDISC_14 ("Luvdisc", 14, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PHANPY_15 ("Phanpy", 15, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PIKACHU_16 ("Pikachu", 16, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CELEBI_EX_17 ("Celebi ex", 17, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries2(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  public int getCollectionLineNo() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.POP_SERIES_2;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case ENTEI_1:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Stomp", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fire Spin", {
          text "50 damage. Discard 2 basic Energy cards attached to Entei or this attack does nothing."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PIDGEOT_2:
      return evolution (this, from:"Pidgeotto", hp:HP080, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Beating Wings", {
          text "Once during your turn (before your attack), If Pidgeot is your Active Pokémon, you may shuffle 1 of your Benched Pokémon and all cards attached to it in your deck. This power can't be used if Pidgeot is affected by a Special Condition."
          actionA {
          }
        }
        move "Sharp Beak", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RAIKOU_3:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Roar", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunder", {
          text "50 damage. Flip a coin. If tails, Raikou does 20 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SUICUNE_4:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Mirror Coat", {
          text "If Suicune is Burned or Poisoned by an opponent's attack (even if Suicune is Knocked Out), the Attacking Pokémon is now affected by the same Special Conditions (1 if there is only 1)."
          delayedA {
          }
        }
        move "Bubblebeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TAUROS_5:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Tauros."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "40 damage. Tauros does 10 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VENUSAUR_6:
      return evolution (this, from:"Ivysaur", hp:HP120, type:G, retreatCost:3) {
        weakness R
        move "Wide Solarbeam", {
          text "20 damage. Does 20 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hard Plant", {
          text "80 damage. Venusaur can't use Hard Plant during your next turn."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case IVYSAUR_7:
      return evolution (this, from:"Bulbasaur", hp:HP080, type:G, retreatCost:1) {
        weakness P
        move "Poison Seed", {
          text "The Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "50 damage. "
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MR_BRINEY_S_COMPASSION_8:
      return supporter (this) {
        text "Choose 1 of your Pokémon in play (excluding Pokémon ex). Return that Pokémon and all cards attached to it to your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case MULTI_TECHNICAL_MACHINE_01_9:
      return basicTrainer (this) {
        text "The Defending Pokémon is now Paralyzed."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_PARK_10:
      return stadium (this) {
        text "Once during each player's turn, when that player attaches an Energy card from his or her hand to 1 of his or her Benched Pokémon, he or she removes 1 damage counter from that Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case TV_REPORTER_11:
      return supporter (this) {
        text "Draw 3 cards. Then discard any 1 card from your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case BULBASAUR_12:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Razor Leaf", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CACNEA_13:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Sand Attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LUVDISC_14:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Paralyzing Kiss", {
          text "If there are 2 Defending Pokémon in play, choose 1 of the Defending Pokémon. That Pokémon is now Paralyzed. (If there is only 1 Defending Pokémon, this attack does nothing.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fast Stream", {
          text "20 damage. Move 1 Energy card attached to the Defending Pokémon to the other Defending Pokémon. (Ignore this effect if your opponent has only 1 Defending Pokémon.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PHANPY_15:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Double Spin", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Body Slam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIKACHU_16:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Gnaw", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunder Jolt", {
          text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CELEBI_EX_17:
      return basic (this, hp:HP080, type:P, retreatCost:1) {
        weakness P
        pokePower "Time Reversal", {
          text "Once during your turn, when you put Celebi ex from your hand onto your Bench, you may search your discard pile for a card, show it to your opponent, and put it on top of your deck."
          actionA {
          }
        }
        move "Psychic Shield", {
          text "30 damage. Prevent all effects of attacks, including damage, done to Celebi ex by your opponent's Pokémon"
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
        default:
      return null;
    }
  }
}