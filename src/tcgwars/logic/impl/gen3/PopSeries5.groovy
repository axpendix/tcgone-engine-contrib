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
public enum PopSeries5 implements LogicCardInfo {

  HO_OH_1 ("Ho-oh", 1, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  LUGIA_2 ("Lugia", 2, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_DELTA_SPECIES__3 ("Mew (Delta Species)", 3, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  DOUBLE_RAINBOW_ENERGY_4 ("Double Rainbow Energy", 4, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  CHARMELEON_DELTA_SPECIES__5 ("Charmeleon (Delta Species)", 5, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  BILL_S_MAINTENANCE_6 ("Bill's Maintenance", 6, Rarity.UNCOMMON, [TRAINER]),
  RARE_CANDY_7 ("Rare Candy", 7, Rarity.UNCOMMON, [TRAINER]),
  BOOST_ENERGY_8 ("Boost Energy", 8, Rarity.UNCOMMON, [TRAINER]),
  DELTA_SPECIES_RAINBOW_ENERGY_9 ("Delta Species Rainbow Energy", 9, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CHARMANDER_DELTA_SPECIES__10 ("Charmander (Delta Species)", 10, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MEOWTH_DELTA_SPECIES__11 ("Meowth (Delta Species)", 11, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  PIKACHU_12 ("Pikachu", 12, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_DELTA_SPECIES__13 ("Pikachu (Delta Species)", 13, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  PELIPPER_DELTA_SPECIES__14 ("Pelipper (Delta Species)", 14, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ZANGOOSE_DELTA_SPECIES__15 ("Zangoose (Delta Species)", 15, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  ESPEON_STAR_16 ("Espeon Star", 16, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UMBREON_STAR_17 ("Umbreon Star", 17, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries5(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_5;
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
      case HO_OH_1:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Fire Wing", {
          text "20 damage. "
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fire Blast", {
          text "60 damage. Discard a Energy attached to Ho-oh."
          energyCost R, R, R, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case LUGIA_2:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Super Psy Bolt", {
          text "20 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Aerowing", {
          text "Before doing damage, you may flip a coin. If tails, this attack does nothing. If heads, this attack does 60 damage instead."
          energyCost P, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEW_DELTA_SPECIES__3:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness P
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Mew doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Mew performs that attack."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Extra Draw", {
          text "If your opponent has any Pokémon-ex in play, search your deck for up to 2 basic Energy cards and attach them to Mew. Shuffle your deck afterward."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DOUBLE_RAINBOW_ENERGY_4:
      return specialEnergy (this, [[C]]) {
        text "Double Rainbow Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). While in play, Double Rainbow Energy provides every type of Energy but provides 2 Energy at a time. (Has no effect other than providing Energy.) Damage done to your opponent's Pokémon by the Pokémon Double Rainbow Energy is attached to is reduced by 10 (before applying Weakness and Resistance). When the Pokémon Double Rainbow Energy is attached to is no longer an Evolved Pokémon, discard Double Rainbow Energy. (Major text change in Emerald. Using earlier versions requires reference.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CHARMELEON_DELTA_SPECIES__5:
      return evolution (this, from:"Charmander", hp:HP070, type:L, retreatCost:1) {
        weakness W
        move "Slash", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder Jolt", {
          text "50 damage. Flip a coin. If tails, Charmeleon does 10 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case BILL_S_MAINTENANCE_6:
      return basicTrainer (this) {
        text "If you have any cards in your hand, shuffle 1 of them into your deck, then draw 3 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case RARE_CANDY_7:
      return basicTrainer (this) {
        text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolves from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case BOOST_ENERGY_8:
      return basicTrainer (this) {
        text "Boost Energy can be attached only to an Evolved Pokémon. Discard Boost Energy at the end of the turn it was attached. Boost Energy provides Energy. The Pokémon Boost Energy is attached to can't retreat. If the Pokémon Boost Energy is attached to isn't an Evolved Pokémon, discard Boost Energy."
        onPlay {
        }
        playRequirement{
        }
      };
      case DELTA_SPECIES_RAINBOW_ENERGY_9:
      return specialEnergy (this, [[C]]) {
        text "Delta Species Rainbow Energy provides Energy. While attached to a Pokémon that has Delta Species on its card, Delta Species Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CHARMANDER_DELTA_SPECIES__10:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEOWTH_DELTA_SPECIES__11:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIKACHU_12:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Lightning Ball", {
          text "10 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunderbolt", {
          text "50 damage. Discard all Energy cards attached to Pikachu."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PIKACHU_DELTA_SPECIES__13:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness F
        move "Electric Punch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Heavy Metal", {
          text "10+ damage. Flip a coin for each Energy attached to Pikachu. This attack does 10 damage plus 20 more damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PELIPPER_DELTA_SPECIES__14:
      return evolution (this, from:"Wingull", hp:HP070, type:L, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokeBody "Mist", {
          text "Any damage done to Pelipper by attacks from Stage 2 Evolved Pokémon (both yours and your opponent's) is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Lightning Wing", {
          text "50 damage. Does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ZANGOOSE_DELTA_SPECIES__15:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness F
        move "Detect", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Zangoose during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metal Claw", {
          text "40 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ESPEON_STAR_16:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokePower "Purple Ray", {
          text "Once during your turn, when you put Espeon * from your hand onto your Bench, you may use this power. Each Active Pokémon (both yours and your opponent's) is now Confused."
          actionA {
          }
        }
        move "Psychic Boom", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case UMBREON_STAR_17:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Dark Ray", {
          text "Once during your turn, when you put Umbreon * from your hand onto your Bench, you may choose 1 card from your opponent's hand without looking and discard it."
          actionA {
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké"
          energyCost D, D
          attackRequirement {}
          onAttack {

          }
        }
      };
        default:
      return null;
    }
  }
}