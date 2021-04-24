package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.NintendoBlackStarPromos
import tcgwars.logic.impl.gen8.SwordShield;

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
public enum HeartgoldSoulsilverPromos implements LogicCardInfo {

  HO_OH_HGSS01 ("Ho-Oh", "1", Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
  LUGIA_HGSS02 ("Lugia", "2", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  PIKACHU_HGSS03 ("Pikachu", "3", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  WOBBUFFET_HGSS04 ("Wobbuffet", "4", Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
  HOOTHOOT_HGSS05 ("Hoothoot", "5", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  NOCTOWL_HGSS06 ("Noctowl", "6", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FERALIGATR_HGSS07 ("Feraligatr", "7", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  MEGANIUM_HGSS08 ("Meganium", "8", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TYPHLOSION_HGSS09 ("Typhlosion", "9", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  LATIAS_HGSS10 ("Latias", "10", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  LATIOS_HGSS11 ("Latios", "11", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  CLEFFA_HGSS12 ("Cleffa", "12", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  SMOOCHUM_HGSS13 ("Smoochum", "13", Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
  LAPRAS_HGSS14 ("Lapras", "14", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  SHUCKLE_HGSS15 ("Shuckle", "15", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
  PLUSLE_HGSS16 ("Plusle", "16", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  MINUN_HGSS17 ("Minun", "17", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  TROPICAL_TIDAL_WAVE_HGSS18 ("Tropical Tidal Wave", "18", Rarity.PROMO, [TRAINER]),
  RAIKOU_HGSS19 ("Raikou", "19", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  ENTEI_HGSS20 ("Entei", "20", Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
  SUICUNE_HGSS21 ("Suicune", "21", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  PORYGON_HGSS22 ("Porygon", "22", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  PORYGON2_HGSS23 ("Porygon2", "23", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  HITMONCHAN_HGSS24 ("Hitmonchan", "24", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_HGSS25 ("Hitmonlee", "25", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  HeartgoldSoulsilverPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.HEARTGOLD_SOULSILVER_PROMOS;
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
      case HO_OH_HGSS01:
        return basic (this, hp:HP080, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          move "Combustion", {
            text "20 damage."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Sacred Fire", {
            text "Flip a coin. If heads, choose 1 of your opponent's Pokémon. This attack does 80 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
        };
      case LUGIA_HGSS02:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Wave Splash", {
            text "20 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aeroblast", {
            text "Flip 2 coins. This attack does 50 damage plus 20 more damage for each heads."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case PIKACHU_HGSS03:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Recharge", {
            text "Flip a coin. If heads, search your deck for a [L] Energy card and attach it to Pikachu. Shuffle your deck afterward."
            energyCost C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunderbolt", {
            text "100 damage. Discard all Energy attached to Pikachu."
            energyCost L, L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case WOBBUFFET_HGSS04:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P
          pokeBody "Tenacious Bind", {
            text "As long as Wobbuffet is your Active Pokémon, your opponent�s Active Pokémon�s Retreat Cost is [C][C] Energy more."
            delayedA {
            }
          }
          move "Trip Over", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 30 more damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 30 }
            }
          }
        };
      case HOOTHOOT_HGSS05:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokeBody "Insomnia", {
            text "Hoothoot can't be Asleep."
            delayedA {
            }
          }
          move "Peck", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case NOCTOWL_HGSS06:
        return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokePower "Night Scope", {
            text "Once during your turn (before you attack), you may look at your opponent's hand. This Power can't be used if Noctowl is affected by a Special Condition."
            actionA {
            }
          }
          move "Hypnoblast", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case FERALIGATR_HGSS07:
        return copy (HeartgoldSoulsilver.FERALIGATR_108, this);
      case MEGANIUM_HGSS08:
        return copy (HeartgoldSoulsilver.MEGANIUM_109, this);
      case TYPHLOSION_HGSS09:
        return copy (HeartgoldSoulsilver.TYPHLOSION_110, this);
      case LATIAS_HGSS10:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C
          move "Energy Assist", {
            text "10 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Infinite Wind", {
            text "40 damage. If Latios is on your Bench, remove 2 damage counters from each of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case LATIOS_HGSS11:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness C
          pokeBody "Luster Float", {
            text "If you have Latias in play, the Retreat Cost for Latios is 0."
            delayedA {
            }
          }
          move "Infinite Wing", {
            text "80 damage. Discard 2 Energy attached to Latios."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case CLEFFA_HGSS12:
        return copy (HeartgoldSoulsilver.CLEFFA_17, this);
      case SMOOCHUM_HGSS13:
        return copy (HeartgoldSoulsilver.SMOOCHUM_30, this);
      case LAPRAS_HGSS14:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness M
          move "Ferry", {
            text "Search your discard pile for a Supporter card, show it to your opponent, and put it into your hand."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surf", {
            text "40 damage."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case SHUCKLE_HGSS15:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W
          pokeBody "Fermenting Liquid", {
            text "Whenever you attach an Energy card from your hand to Shuckle, draw a card."
            delayedA {
            }
          }
          move "Shell Stunner", {
            text "20 damage. Flip a coin. If heads, prevent all damage done to Shuckle by attacks during your opponent's next turn."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case PLUSLE_HGSS16:
        return copy (Unleashed.PLUSLE_36, this);
      case MINUN_HGSS17:
        return copy (Unleashed.MINUN_34, this);
      case TROPICAL_TIDAL_WAVE_HGSS18:
        return copy (NintendoBlackStarPromos.TROPICAL_TIDAL_WAVE_27, this);
      case RAIKOU_HGSS19:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Zap Cannon", {
            text "70 damage. During your next turn, Raikou can't use Zap Cannon."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case ENTEI_HGSS20:
        return basic (this, hp:HP080, type:FIRE, retreatCost:1) {
          weakness W
          move "Flare Blitz", {
            text "80 damage. Discard all [R] Energy attached to Entei."
            energyCost R, R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case SUICUNE_HGSS21:
        return basic (this, hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Sheer Cold", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case PORYGON_HGSS22:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Stiffen", {
            text "During your opponent's next turn, any damage done to Porygon by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Version Update", {
            text "Search your deck for Porygon2, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case PORYGON2_HGSS23:
        return evolution (this, from:"Porygon", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness F
          pokeBody "Shortcut", {
            text "The Retreat Cost for each Porygon, Porygon2, and Porygon-Z you have in play is [C] less."
            delayedA {
            }
          }
          move "Reckless Charge", {
            text "50 damage. Porygon2 does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case HITMONCHAN_HGSS24:
        return copy (Undaunted.HITMONCHAN_51, this);
      case HITMONLEE_HGSS25:
        return copy (Undaunted.HITMONLEE_52, this);
      default:
        return null;
    }
  }

}
