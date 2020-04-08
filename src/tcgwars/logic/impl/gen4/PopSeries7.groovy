package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries7 implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  GALLADE_2 ("Gallade", 2, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LATIAS_3 ("Latias", 3, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  LATIOS_4 ("Latios", 4, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MOTHIM_5 ("Mothim", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DELIBIRD_6 ("Delibird", 6, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  FLAAFFY_7 ("Flaaffy", 7, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KIRLIA_8 ("Kirlia", 8, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  STANTLER_9 ("Stantler", 9, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WORMADAM_SANDY_CLOAK_10 ("Wormadam Sandy Cloak", 10, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  BURMY_PLANT_CLOAK_11 ("Burmy Plant Cloak", 11, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_SANDY_CLOAK_12 ("Burmy Sandy Cloak", 12, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CORSOLA_13 ("Corsola", 13, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAREEP_14 ("Mareep", 14, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RALTS_15 ("Ralts", 15, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SENTRET_16 ("Sentret", 16, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SPINDA_17 ("Spinda", 17, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries7(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_7;
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
      case AMPHAROS_1:
        return evolution (this, from:"Flaffy", hp:HP130, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Jamming", {
            text "After your opponent plays a Support card from his or her hand, put 1 damage counter on each of your opponent’s Pokémon. You can’t use more than 1 Jamming Poké-Body each turn."
            delayedA {
            }
          }
          move "Cluster Bolt", {
            text "70 damage. Energy attached to Ampharos. If you do, this attack does 20 damage to each of your opponent’s Benched Pokémon that has any Energy cards attached to it."
            energyCost L, C, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GALLADE_2:
        return evolution (this, from:"Kirlia", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS30
          move "Sonic Blade", {
            text "Put damage counters on the Defending Pokémon until it is 50 HP away from being Knocked Out. If you do, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psychic Cut", {
            text "60+ damage. You may choose as many of your face-down Prize cards as you like and put them face up. If you do, this attack does 60 damage plus 20 more damage for each Prize card you chose. (These cards remain face up for the rest of the game.)"
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LATIAS_3:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Miraculous Light", {
            text "10 damage. Remove 2 damage counters and all Special Conditions from Latias."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mist Ball", {
            text "80 damage. Energy attached to Latias."
            energyCost R, W, C, R, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LATIOS_4:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Energy Draw", {
            text "10 damage. Flip a coin. If heads, search your deck for a basic Energy card and attach it to Latios. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Luster Purge", {
            text "120 damage. Discard 3 Energy attached to Latios."
            energyCost G, L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MOTHIM_5:
        return evolution (this, from:"Burmy", hp:HP080, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Silver Wind", {
            text ", that attack does 40 more damage."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Raging Scales", {
            text "30+ damage. If Mothim has any damage counters on it, this attack does 30 damage plus 40 more damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DELIBIRD_6:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Present", {
            text "Flip a coin. If heads, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ice Ball", {
            text "20 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FLAAFFY_7:
        return evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Attract Current", {
            text "10 damage. Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Electromagnetic Kick", {
            text "60 damage. Flip a coin. If tails, Flaffy does 10 damage to itself."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KIRLIA_8:
        return evolution (this, from:"Ralts", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Psychic Research", {
            text "Search your discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your discard pile.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Telekinesis", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STANTLER_9:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Lead", {
            text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Frighten Horn", {
            text "20 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WORMADAM_SANDY_CLOAK_10:
        return evolution (this, from:"Burmy Sandy Cloak", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness R, PLUS20
          resistance L, MINUS20
          pokeBody "Sandy Cloak", {
            text "Prevent all effects, excluding damage, done to Wormadam Sandy Cloak."
            delayedA {
            }
          }
          move "Push Over", {
            text "40+ damage. Energy attached to Wormadam Sandy Cloak."
            energyCost F, C, C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BURMY_PLANT_CLOAK_11:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Wear Cloak", {
            text "Once during your turn , if Burmy Plant Cloak is your Active Pokémon, you may search your discard pile for a basic Energy card and attach it to Burmy Plant Cloak."
            actionA {
            }
          }
          move "Plant Cloak Tackle", {
            text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BURMY_SANDY_CLOAK_12:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Wear Cloak", {
            text "Once during your turn , if Burmy Sandy Cloak is your Active Pokémon, you may search your discard pile for a basic Energy card and attach it to Burmy Sandy Cloak."
            actionA {
            }
          }
          move "Sandy Cloak Tackle", {
            text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CORSOLA_13:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          move "Rally", {
            text "Search your deck for up to 3 different types of Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hook", {
            text "30 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAREEP_14:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply PARALYZED }
            }
          }
          move "Static Shock", {
            text "20 damage. "
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RALTS_15:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Smack", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Confuse Ray", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              flip { apply CONFUSED }
            }
          }

        };
      case SENTRET_16:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Grope", {
            text "Look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SPINDA_17:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Dish Out", {
            text "Draw a card from the top and the bottom of your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Synchro Punch", {
            text "10+ damage. If any basic Energy card attached to Spinda is the same type as any Energy attached to the Defending Pokémon, this attack does 10 damage plus 30 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      default:
        return null;
    }
  }

}
