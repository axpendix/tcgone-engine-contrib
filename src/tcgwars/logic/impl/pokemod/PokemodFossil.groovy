package tcgwars.logic.impl.pokemod

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
public enum PokemodFossil implements CardInfo {

  AERODACTYL_1 ("Aerodactyl", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ARTICUNO_2 ("Articuno", 2, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  DITTO_3 ("Ditto", 3, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  DRAGONITE_4 ("Dragonite", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GENGAR_5 ("Gengar", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HAUNTER_6 ("Haunter", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HITMONLEE_7 ("Hitmonlee", 7, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  HYPNO_8 ("Hypno", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KABUTOPS_9 ("Kabutops", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LAPRAS_10 ("Lapras", 10, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MAGNETON_11 ("Magneton", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MOLTRES_12 ("Moltres", 12, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  MUK_13 ("Muk", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  RAICHU_14 ("Raichu", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ZAPDOS_15 ("Zapdos", 15, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),

  AERODACTYL_16 ("Aerodactyl", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ARTICUNO_17 ("Articuno", 17, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  DITTO_18 ("Ditto", 18, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  DRAGONITE_19 ("Dragonite", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GENGAR_20 ("Gengar", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HAUNTER_21 ("Haunter", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HITMONLEE_22 ("Hitmonlee", 22, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  HYPNO_23 ("Hypno", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KABUTOPS_24 ("Kabutops", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LAPRAS_25 ("Lapras", 25, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MAGNETON_26 ("Magneton", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MOLTRES_27 ("Moltres", 27, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  MUK_28 ("Muk", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  RAICHU_29 ("Raichu", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ZAPDOS_30 ("Zapdos", 30, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ARBOK_31 ("Arbok", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CLOYSTER_32 ("Cloyster", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GASTLY_33 ("Gastly", 33, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GOLBAT_34 ("Golbat", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GOLDUCK_35 ("Golduck", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOLEM_36 ("Golem", 36, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  GRAVELER_37 ("Graveler", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  KINGLER_38 ("Kingler", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGMAR_39 ("Magmar", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  OMASTAR_40 ("Omastar", 40, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  SANDSLASH_41 ("Sandslash", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEADRA_42 ("Seadra", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SLOWBRO_43 ("Slowbro", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  TENTACRUEL_44 ("Tentacruel", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WEEZING_45 ("Weezing", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  EKANS_46 ("Ekans", 46, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GEODUDE_47 ("Geodude", 47, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GRIMER_48 ("Grimer", 48, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HORSEA_49 ("Horsea", 49, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  KABUTO_50 ("Kabuto", 50, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  KRABBY_51 ("Krabby", 51, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  OMANYTE_52 ("Omanyte", 52, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PSYDUCK_53 ("Psyduck", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLDER_54 ("Shellder", 54, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLOWPOKE_55 ("Slowpoke", 55, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  TENTACOOL_56 ("Tentacool", 56, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ZUBAT_57 ("Zubat", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),

  MR_FUJI_58 ("Mr. Fuji", 58, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_SEARCH_59 ("Energy Search", 59, Rarity.COMMON, [TRAINER]),
  GAMBLER_60 ("Gambler", 60, Rarity.COMMON, [TRAINER]),
  RECYCLE_61 ("Recycle", 61, Rarity.COMMON, [TRAINER]),
  MYSTERIOUS_FOSSIL_62 ("Mysterious Fossil", 62, Rarity.COMMON, [TRAINER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodFossil(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_FOSSIL;
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
      case AERODACTYL_1:
        break
      case ARTICUNO_2:
        break
      case DITTO_3:
        break
      case DRAGONITE_4:
        break
      case GENGAR_5:
        break
      case HAUNTER_6:
        break
      case HITMONLEE_7:
        break
      case HYPNO_8:
        break
      case KABUTOPS_9:
        break
      case LAPRAS_10:
        break
      case MAGNETON_11:
        break
      case MOLTRES_12:
        break
      case MUK_13:
        break
      case RAICHU_14:
        break
      case ZAPDOS_15:
        break
      case AERODACTYL_16:
        break
      case ARTICUNO_17:
        break
      case DITTO_18:
        break
      case DRAGONITE_19:
        break
      case GENGAR_20:
        break
      case HAUNTER_21:
        break
      case HITMONLEE_22:
        break
      case HYPNO_23:
        break
      case KABUTOPS_24:
        break
      case LAPRAS_25:
        break
      case MAGNETON_26:
        break
      case MOLTRES_27:
        break
      case MUK_28:
        break
      case RAICHU_29:
        break
      case ZAPDOS_30:
        break
      case ARBOK_31:
        break
      case CLOYSTER_32:
        break
      case GASTLY_33:
        break
      case GOLBAT_34:
        break
      case GOLDUCK_35:
        break
      case GOLEM_36:
        break
      case GRAVELER_37:
        break
      case KINGLER_38:
        break
      case MAGMAR_39:
        break
      case OMASTAR_40:
        break
      case SANDSLASH_41:
        break
      case SEADRA_42:
        break
      case SLOWBRO_43:
        break
      case TENTACRUEL_44:
        break
      case WEEZING_45:
        break
      case EKANS_46:
        break
      case GEODUDE_47:
        break
      case GRIMER_48:
        break
      case HORSEA_49:
        break
      case KABUTO_50:
        break
      case KRABBY_51:
        break
      case OMANYTE_52:
        break
      case PSYDUCK_53:
        break
      case SHELLDER_54:
        break
      case SLOWPOKE_55:
        break
      case TENTACOOL_56:
        break
      case ZUBAT_57:
        break
      case MR_FUJI_58:
        break
      case ENERGY_SEARCH_59:
        break
      case GAMBLER_60:
        break
      case RECYCLE_61:
        break
      case MYSTERIOUS_FOSSIL_62:
        break
      default:
        return null;
    }
  }

}
