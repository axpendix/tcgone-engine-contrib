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
public enum PopSeries6 implements LogicCardInfo {

  BASTIODON_1 ("Bastiodon", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  LUCARIO_2 ("Lucario", 2, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MANAPHY_3 ("Manaphy", 3, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PACHIRISU_4 ("Pachirisu", 4, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  RAMPARDOS_5 ("Rampardos", 5, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DRIFLOON_6 ("Drifloon", 6, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GIBLE_7 ("Gible", 7, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  RIOLU_8 ("Riolu", 8, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIKACHU_9 ("Pikachu", 9, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  STARAVIA_10 ("Staravia", 10, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BIDOOF_11 ("Bidoof", 11, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BUNEARY_12 ("Buneary", 12, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHERUBI_13 ("Cherubi", 13, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHIMCHAR_14 ("Chimchar", 14, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PIPLUP_15 ("Piplup", 15, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARLY_16 ("Starly", 16, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TURTWIG_17 ("Turtwig", 17, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries6(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_6;
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
      case BASTIODON_1:
        return evolution (this, from:"Shieldon", hp:HP130, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          pokeBody "Protective Wall", {
            text "Prevent all damage done to your Benched Pokémon by your opponent’s attacks."
            delayedA {
            }
          }
          move "Anger Revenge", {
            text "60 damage. If Bastiodon was damaged by an attack during your opponent’s last turn, this attack does 40 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUCARIO_2:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Feint", {
            text "30 damage. This attack’s damage isn’t affected by Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aura Sphere", {
            text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANAPHY_3:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Aqua Ring", {
            text "30 damage. Switch Manaphy with 1 of your Benched Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PACHIRISU_4:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Minor Errand-Running", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunder Jolt", {
            text "20 damage. Flip a coin. If tails, Pachirisu does 10 damage to itself."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAMPARDOS_5:
        return evolution (this, from:"Cranidos", hp:HP120, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS30
          move "Assurance", {
            text "30 damage. As long as the Defending Pokémon’s remaining HP is 60 or less, this attack’s base damage is 60 instead of 30."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hasty Headbutt", {
            text "100 damage. Rampardos does 20 damage to itself. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFLOON_6:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Blowing Wind", {
            text "Flip a coin. If heads, put 1 of your Benched Pokémon and all cards attached to it on top of your deck. Shuffle your deck afterward."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ominous Wind", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIBLE_7:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          move "", {
            text "Oran Berry. Remove 1 damage counter from Gible at the end of your turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surprise Attack", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RIOLU_8:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Wild Kick", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIKACHU_9:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "", {
            text "Oran Berry. Remove 1 damage counter from Pikachu at the end of your turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spark", {
            text "10 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARAVIA_10:
        return evolution (this, from:"Starly", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Whirlwind", {
            text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              whirlwind()
            }
          }
          move "Clutch", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BIDOOF_11:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Amnesia", {
            text "Choose 1 of the Defending Pokémon’s attack’s. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              amnesia delegate
            }
          }
          move "Scavenge", {
            text "Search your discard pile for a Trainer card, show it to your opponent, an put it into your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BUNEARY_12:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Splash", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Jump Kick", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHERUBI_13:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sleep Powder", {
            text "The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Leech Seed", {
            text "20 damage. , remove 1 damage counter from Cherubi."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHIMCHAR_14:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Scratch", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ember", {
            text "30 damage. Energy attached to Chimchar."
            energyCost R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIPLUP_15:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Peck", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Water Spash", {
            text "20+ damage. Flip a coin. If heads, this, attack does 20 damage plus 10 more damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARLY_16:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Gust", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TURTWIG_17:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Tackle", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Razor Leaf", {
            text "20 damage. "
            energyCost G
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
