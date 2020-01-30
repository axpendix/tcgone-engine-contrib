package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author wertcatt@gmail.com
 */
public enum PokemonRumble implements LogicCardInfo {

  VENUSAUR_1 ("Venusaur", 1, Rarity.COMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CHERRIM_2 ("Cherrim", 2, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NINETALES_3 ("Ninetales", 3, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  HEATRAN_4 ("Heatran", 4, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  STARMIE_5 ("Starmie", 5, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GYRADOS_6 ("Gyrados", 6, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PIKACHU_7 ("Pikachu", 7, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ZAPDOS_8 ("Zapdos", 8, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MEWTWO_9 ("Mewtwo", 9, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MEW_10 ("Mew", 10, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DIGLETT_11 ("Diglett", 11, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUCARIO_12 ("Lucario", 12, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SKUNTANK_13 ("Skuntank", 13, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  BASTIODON_14 ("Bastiodon", 14, Rarity.COMMON, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  RATTATA_15 ("Rattata", 15, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BIBAREL_16 ("Bibarel", 16, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemonRumble(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMON_RUMBLE;
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
      case VENUSAUR_1:
        return evolution (this, from:"Ivysaur", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R
          move "Giga Drain", {
            text "50 damage. Remove from Venusaur the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G, G, C, C
            onAttack {
              damage 50
              removeDamageCounterEqualToDamageDone()
            }
          }

        }
      case CHERRIM_2:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Solarbeam", {
            text "60 damage."
            energyCost G, C, C
            onAttack {
              damage 60
            }
          }

        }
      case NINETALES_3:
        return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:1) {
          weakness W
          move "Flame Tail", {
            text "60 damage."
            energyCost R, C, C
            onAttack {
              damage 60
            }
          }

        }
      case HEATRAN_4:
        return basic (this, hp:HP110, type:FIRE, retreatCost:4) {
          weakness W
          move "Heat Boiler", {
            text "60+ damage. If the Defending Pokémon is a Water Pokémon, this attack does 60 damage plus 40 more damage."
            energyCost R, C, C, C
            onAttack {
              damage 60
              if(defending.types.contains(W)) {
                damage 40
              }
            }
          }

        }
      case STARMIE_5:
        return evolution (this, from:"Staryu", hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Spiral Drain", {
            text "50 damage. Remove 1 damage counter from Starmie."
            energyCost W, C, C
            onAttack {
              damage 50
              heal 10
            }
          }

        }
      case GYRADOS_6:
        return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
          weakness L
          resistance F, MINUS20
          move "Thrash Tackle", {
            text "80 damage.  Gyarados does 20 damage to itself."
            energyCost W, C, C, C
            onAttack {
              damage 80
              damage 20, self
            }
          }

        }
      case PIKACHU_7:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Volt Tackle", {
            text "60 damage. Pikachu does 10 damage to itself"
            energyCost L, C, C
            onAttack {
              damage 60
              damage 10, self
            }
          }

        }
      case ZAPDOS_8:
        return basic (this, hp:HP100, type:LIGHTNING, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Drill Peck", {
            text "70 damage."
            energyCost L, C, C, C
            onAttack {
              damage 70
            }
          }

        }
      case MEWTWO_9:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Super Psy Bolt", {
            text "70 damage."
            energyCost P, P, C
            onAttack {
              damage 70
            }
          }

        }
      case MEW_10:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:0) {
          weakness P
          move "Cut", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Will-o'-the-Wisp", {
            text "60 damage."
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        }
      case DIGLETT_11:
        return basic (this, hp:HP30, type:FIGHTING, retreatCost:1) {
          weakness G
          resistance L, MINUS20
          move "Dig", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        }
      case LUCARIO_12:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Metal Claw", {
            text "40 damage."
            energyCost F, C, C
            onAttack {
              damage 40
            }
          }
          move "Pulse Blast", {
            text "80 damage."
            energyCost F, M, C, C
            onAttack {
              damage 80
            }
          }

        }
      case SKUNTANK_13:
        return evolution (this, from:"Stunky", hp:HP090, type:DARKNESS, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          move "Rage", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Skuntank"
            energyCost D, C, C
            onAttack {
              damage 20
              damage 10*ef.attacker.numberOfDamageCounters
            }
          }

        }
      case BASTIODON_14:
        return evolution (this, from:"Shieldon", hp:HP120, type:METAL, retreatCost:4) {
          weakness F
          resistance P, MINUS20
          move "Strength", {
            text "40 damage."
            energyCost M, C, C
            onAttack {
              damage 40
            }
          }

        }
      case RATTATA_15:
        return basic (this, hp:HP30, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Bite", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        }
      case BIBAREL_16:
        return evolution (this, from:"Bidoof", hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F
          move "Rollout", {
            text "50 damage."
            energyCost C, C, C, C
            onAttack {
              damage 50
            }
          }

        }
      default:
        return null
    }
  }

}
