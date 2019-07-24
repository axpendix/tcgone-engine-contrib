package tcgwars.logic.impl.pokemod;

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
public enum PokemodTeamRocket implements CardInfo {

  DARK_ALAKAZAM_1 ("Dark Alakazam", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_ARBOK_2 ("Dark Arbok", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_BLASTOISE_3 ("Dark Blastoise", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  DARK_CHARIZARD_4 ("Dark Charizard", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONITE_5 ("Dark Dragonite", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_DUGTRIO_6 ("Dark Dugtrio", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_GOLBAT_7 ("Dark Golbat", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GYARADOS_8 ("Dark Gyarados", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_HYPNO_9 ("Dark Hypno", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHAMP_10 ("Dark Machamp", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MAGNETON_11 ("Dark Magneton", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_SLOWBRO_12 ("Dark Slowbro", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_VILEPLUME_13 ("Dark Vileplume", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_WEEZING_14 ("Dark Weezing", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HERE_COMES_TEAM_ROCKET_15 ("Here Comes Team Rocket!", 15, Rarity.HOLORARE, [TRAINER]),
  ROCKETS_SNEAK_ATTACK_16 ("Rocket's Sneak Attack", 16, Rarity.HOLORARE, [TRAINER]),
  RAINBOW_ENERGY_17 ("Rainbow Energy", 17, Rarity.HOLORARE, [SPECIAL_ENERGY, ENERGY]),

  DARK_ALAKAZAM_18 ("Dark Alakazam", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_ARBOK_19 ("Dark Arbok", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_BLASTOISE_20 ("Dark Blastoise", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  DARK_CHARIZARD_21 ("Dark Charizard", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONITE_22 ("Dark Dragonite", 22, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_DUGTRIO_23 ("Dark Dugtrio", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_GOLBAT_24 ("Dark Golbat", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GYARADOS_25 ("Dark Gyarados", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_HYPNO_26 ("Dark Hypno", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHAMP_27 ("Dark Machamp", 27, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MAGNETON_28 ("Dark Magneton", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_SLOWBRO_29 ("Dark Slowbro", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_VILEPLUME_30 ("Dark Vileplume", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_WEEZING_31 ("Dark Weezing", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_CHARMELEON_32 ("Dark Charmeleon", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONAIR_33 ("Dark Dragonair", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_ELECTRODE_34 ("Dark Electrode", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_FLAREON_35 ("Dark Flareon", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_GLOOM_36 ("Dark Gloom", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GOLDUCK_37 ("Dark Golduck", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_JOLTEON_38 ("Dark Jolteon", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_KADABRA_39 ("Dark Kadabra", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHOKE_40 ("Dark Machoke", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MUK_41 ("Dark Muk", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_PERSIAN_42 ("Dark Persian", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_PRIMEAPE_43 ("Dark Primeape", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_RAPIDASH_44 ("Dark Rapidash", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_VAPOREON_45 ("Dark Vaporeon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_WARTORTLE_46 ("Dark Wartortle", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGIKARP_47 ("Magikarp", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  PORYGON_48 ("Porygon", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  ABRA_49 ("Abra", 49, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CHARMANDER_50 ("Charmander", 50, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  DARK_RATICATE_51 ("Dark Raticate", 51, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIGLETT_52 ("Diglett", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DRATINI_53 ("Dratini", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DROWZEE_54 ("Drowzee", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_55 ("Eevee", 55, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EKANS_56 ("Ekans", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GRIMER_57 ("Grimer", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  KOFFING_58 ("Koffing", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MACHOP_59 ("Machop", 59, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEMITE_60 ("Magnemite", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MANKEY_61 ("Mankey", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEOWTH_62 ("Meowth", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ODDISH_63 ("Oddish", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PONYTA_64 ("Ponyta", 64, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PSYDUCK_65 ("Psyduck", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RATTATA_66 ("Rattata", 66, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SLOWPOKE_67 ("Slowpoke", 67, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SQUIRTLE_68 ("Squirtle", 68, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VOLTORB_69 ("Voltorb", 69, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ZUBAT_70 ("Zubat", 70, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HERE_COMES_TEAM_ROCKET_71 ("Here Comes Team Rocket!", 71, Rarity.RARE, [TRAINER]),
  ROCKETS_SNEAK_ATTACK_72 ("Rocket's Sneak Attack", 72, Rarity.RARE, [TRAINER]),
  THE_BOSSS_WAY_73 ("The Boss's Way", 73, Rarity.UNCOMMON, [TRAINER]),
  CHALLENGE_74 ("Challenge!", 74, Rarity.UNCOMMON, [TRAINER]),
  DIGGER_75 ("Digger", 75, Rarity.UNCOMMON, [TRAINER]),
  IMPOSTER_OAKS_REVENGE_76 ("Imposter Oak's Revenge", 76, Rarity.UNCOMMON, [TRAINER]),
  NIGHTLY_GARBAGE_RUN_77 ("Nightly Garbage Run", 77, Rarity.UNCOMMON, [TRAINER]),
  GOOP_GAS_ATTACK_78 ("Goop Gas Attack", 78, Rarity.COMMON, [TRAINER]),
  SLEEP_79 ("Sleep!", 79, Rarity.COMMON, [TRAINER]),
  RAINBOW_ENERGY_80 ("Rainbow Energy", 80, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  FULL_HEAL_ENERGY_81 ("Full Heal Energy", 81, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  POTION_ENERGY_82 ("Potion Energy", 82, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DARK_RAICHU_83 ("Dark Raichu", 83, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodTeamRocket(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_TEAM_ROCKET;
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
      case DARK_ALAKAZAM_1:
        break
      case DARK_ARBOK_2:
        break
      case DARK_BLASTOISE_3:
        break
      case DARK_CHARIZARD_4:
        break
      case DARK_DRAGONITE_5:
        break
      case DARK_DUGTRIO_6:
        break
      case DARK_GOLBAT_7:
        break
      case DARK_GYARADOS_8:
        break
      case DARK_HYPNO_9:
        break
      case DARK_MACHAMP_10:
        break
      case DARK_MAGNETON_11:
        break
      case DARK_SLOWBRO_12:
        break
      case DARK_VILEPLUME_13:
        break
      case DARK_WEEZING_14:
        break
      case HERE_COMES_TEAM_ROCKET_15:
        break
      case ROCKETS_SNEAK_ATTACK_16:
        break
      case RAINBOW_ENERGY_17:
        break
      case DARK_ALAKAZAM_18:
        break
      case DARK_ARBOK_19:
        break
      case DARK_BLASTOISE_20:
        break
      case DARK_CHARIZARD_21:
        break
      case DARK_DRAGONITE_22:
        break
      case DARK_DUGTRIO_23:
        break
      case DARK_GOLBAT_24:
        break
      case DARK_GYARADOS_25:
        break
      case DARK_HYPNO_26:
        break
      case DARK_MACHAMP_27:
        break
      case DARK_MAGNETON_28:
        break
      case DARK_SLOWBRO_29:
        break
      case DARK_VILEPLUME_30:
        break
      case DARK_WEEZING_31:
        break
      case DARK_CHARMELEON_32:
        break
      case DARK_DRAGONAIR_33:
        break
      case DARK_ELECTRODE_34:
        break
      case DARK_FLAREON_35:
        break
      case DARK_GLOOM_36:
        break
      case DARK_GOLDUCK_37:
        break
      case DARK_JOLTEON_38:
        break
      case DARK_KADABRA_39:
        break
      case DARK_MACHOKE_40:
        break
      case DARK_MUK_41:
        break
      case DARK_PERSIAN_42:
        break
      case DARK_PRIMEAPE_43:
        break
      case DARK_RAPIDASH_44:
        break
      case DARK_VAPOREON_45:
        break
      case DARK_WARTORTLE_46:
        break
      case MAGIKARP_47:
        break
      case PORYGON_48:
        break
      case ABRA_49:
        break
      case CHARMANDER_50:
        break
      case DARK_RATICATE_51:
        break
      case DIGLETT_52:
        break
      case DRATINI_53:
        break
      case DROWZEE_54:
        break
      case EEVEE_55:
        break
      case EKANS_56:
        break
      case GRIMER_57:
        break
      case KOFFING_58:
        break
      case MACHOP_59:
        break
      case MAGNEMITE_60:
        break
      case MANKEY_61:
        break
      case MEOWTH_62:
        break
      case ODDISH_63:
        break
      case PONYTA_64:
        break
      case PSYDUCK_65:
        break
      case RATTATA_66:
        break
      case SLOWPOKE_67:
        break
      case SQUIRTLE_68:
        break
      case VOLTORB_69:
        break
      case ZUBAT_70:
        break
      case HERE_COMES_TEAM_ROCKET_71:
        break
      case ROCKETS_SNEAK_ATTACK_72:
        break
      case THE_BOSSS_WAY_73:
        break
      case CHALLENGE_74:
        break
      case DIGGER_75:
        break
      case IMPOSTER_OAKS_REVENGE_76:
        break
      case NIGHTLY_GARBAGE_RUN_77:
        break
      case GOOP_GAS_ATTACK_78:
        break
      case SLEEP_79:
        break
      case RAINBOW_ENERGY_80:
        break
      case FULL_HEAL_ENERGY_81:
        break
      case POTION_ENERGY_82:
        break
      case DARK_RAICHU_83:
        break
      default:
        return null;
    }
  }

}
