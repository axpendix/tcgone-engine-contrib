package tcgwars.logic.impl.pokemod


import tcgwars.logic.card.*
import tcgwars.logic.util.CardTypeSet

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodGymChallenge implements LogicCardInfo {

  BLAINE_S_ARCANINE_1 ("Blaine's Arcanine", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_CHARIZARD_2 ("Blaine's Charizard", "2", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_NINETALES_3 ("Brock's Ninetales", "3", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  ERIKA_S_VENUSAUR_4 ("Erika's Venusaur", "4", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_GYARADOS_5 ("Giovanni's Gyarados", "5", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  GIOVANNI_S_MACHAMP_6 ("Giovanni's Machamp", "6", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  GIOVANNI_S_NIDOKING_7 ("Giovanni's Nidoking", "7", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_PERSIAN_8 ("Giovanni's Persian", "8", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  KOGA_S_BEEDRILL_9 ("Koga's Beedrill", "9", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_DITTO_10 ("Koga's Ditto", "10", Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_RAICHU_11 ("Lt. Surge's Raichu", "11", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  MISTY_S_GOLDUCK_12 ("Misty's Golduck", "12", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_GYARADOS_13 ("Misty's Gyarados", "13", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  ROCKET_S_MEWTWO_14 ("Rocket's Mewtwo", "14", Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  ROCKET_S_ZAPDOS_15 ("Rocket's Zapdos", "15", Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  SABRINA_S_ALAKAZAM_16 ("Sabrina's Alakazam", "16", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  BLAINE_17 ("Blaine", "17", Rarity.HOLORARE, [TRAINER]),
  GIOVANNI_18 ("Giovanni", "18", Rarity.HOLORARE, [TRAINER]),
  KOGA_19 ("Koga", "19", Rarity.HOLORARE, [TRAINER]),
  SABRINA_20 ("Sabrina", "20", Rarity.HOLORARE, [TRAINER]),
  BLAINE_S_NINETALES_21 ("Blaine's Ninetales", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_DUGTRIO_22 ("Brock's Dugtrio", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  GIOVANNI_S_NIDOQUEEN_23 ("Giovanni's Nidoqueen", "23", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_PINSIR_24 ("Giovanni's Pinsir", "24", Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_ARBOK_25 ("Koga's Arbok", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_MUK_26 ("Koga's Muk", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_PIDGEOTTO_27 ("Koga's Pidgeotto", "27", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_JOLTEON_28 ("Lt. Surge's Jolteon", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  SABRINA_S_GENGAR_29 ("Sabrina's Gengar", "29", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_GOLDUCK_30 ("Sabrina's Golduck", "30", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  BLAINE_S_CHARMELEON_31 ("Blaine's Charmeleon", "31", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_DODRIO_32 ("Blaine's Dodrio", "32", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  BLAINE_S_RAPIDASH_33 ("Blaine's Rapidash", "33", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_GRAVELER_34 ("Brock's Graveler", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_PRIMEAPE_35 ("Brock's Primeape", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_SANDSLASH_36 ("Brock's Sandslash", "36", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_VULPIX_37 ("Brock's Vulpix", "37", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  ERIKA_S_BELLSPROUT_38 ("Erika's Bellsprout", "38", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_BULBASAUR_39 ("Erika's Bulbasaur", "39", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_CLEFAIRY_40 ("Erika's Clefairy", "40", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_IVYSAUR_41 ("Erika's Ivysaur", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_MACHOKE_42 ("Giovanni's Machoke", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  GIOVANNI_S_MEOWTH_43 ("Giovanni's Meowth", "43", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  GIOVANNI_S_NIDORINA_44 ("Giovanni's Nidorina", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_NIDORINO_45 ("Giovanni's Nidorino", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_GOLBAT_46 ("Koga's Golbat", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_KAKUNA_47 ("Koga's Kakuna", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_KOFFING_48 ("Koga's Koffing", "48", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_PIDGEY_49 ("Koga's Pidgey", "49", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  KOGA_S_WEEZING_50 ("Koga's Weezing", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_EEVEE_51 ("Lt. Surge's Eevee", "51", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_ELECTRODE_52 ("Lt. Surge's Electrode", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_RATICATE_53 ("Lt. Surge's Raticate", "53", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  MISTY_S_DEWGONG_54 ("Misty's Dewgong", "54", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  SABRINA_S_HAUNTER_55 ("Sabrina's Haunter", "55", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_HYPNO_56 ("Sabrina's Hypno", "56", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_JYNX_57 ("Sabrina's Jynx", "57", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_KADABRA_58 ("Sabrina's Kadabra", "58", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_MR__MIME_59 ("Sabrina's Mr. Mime", "59", Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  BLAINE_S_CHARMANDER_60 ("Blaine's Charmander", "60", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_DODUO_61 ("Blaine's Doduo", "61", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  BLAINE_S_GROWLITHE_62 ("Blaine's Growlithe", "62", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_MANKEY_63 ("Blaine's Mankey", "63", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BLAINE_S_PONYTA_64 ("Blaine's Ponyta", "64", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_RHYHORN_65 ("Blaine's Rhyhorn", "65", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BLAINE_S_VULPIX_66 ("Blaine's Vulpix", "66", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_DIGLETT_67 ("Brock's Diglett", "67", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_GEODUDE_68 ("Brock's Geodude", "68", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  ERIKA_S_JIGGLYPUFF_69 ("Erika's Jigglypuff", "69", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_ODDISH_70 ("Erika's Oddish", "70", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_PARAS_71 ("Erika's Paras", "71", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_MACHOP_72 ("Giovanni's Machop", "72", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  GIOVANNI_S_MAGIKARP_73 ("Giovanni's Magikarp", "73", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  GIOVANNI_S_MEOWTH_74 ("Giovanni's Meowth", "74", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  GIOVANNI_S_NIDORAN_FEMALE_75 ("Giovanni's Nidoran Female", "75", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  GIOVANNI_S_NIDORAN_MALE_76 ("Giovanni's Nidoran Male", "76", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_EKANS_77 ("Koga's Ekans", "77", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_GRIMER_78 ("Koga's Grimer", "78", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_KOFFING_79 ("Koga's Koffing", "79", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_PIDGEY_80 ("Koga's Pidgey", "80", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  KOGA_S_TANGELA_81 ("Koga's Tangela", "81", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_WEEDLE_82 ("Koga's Weedle", "82", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  KOGA_S_ZUBAT_83 ("Koga's Zubat", "83", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_PIKACHU_84 ("Lt. Surge's Pikachu", "84", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_RATTATA_85 ("Lt. Surge's Rattata", "85", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_VOLTORB_86 ("Lt. Surge's Voltorb", "86", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  MISTY_S_HORSEA_87 ("Misty's Horsea", "87", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_MAGIKARP_88 ("Misty's Magikarp", "88", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_POLIWAG_89 ("Misty's Poliwag", "89", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_PSYDUCK_90 ("Misty's Psyduck", "90", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_SEEL_91 ("Misty's Seel", "91", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_STARYU_92 ("Misty's Staryu", "92", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  SABRINA_S_ABRA_93 ("Sabrina's Abra", "93", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_ABRA_94 ("Sabrina's Abra", "94", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_DROWZEE_95 ("Sabrina's Drowzee", "95", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_GASTLY_96 ("Sabrina's Gastly", "96", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_GASTLY_97 ("Sabrina's Gastly", "97", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_PORYGON_98 ("Sabrina's Porygon", "98", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  SABRINA_S_PSYDUCK_99 ("Sabrina's Psyduck", "99", Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  BLAINE_100 ("Blaine", "100", Rarity.RARE, [TRAINER]),
  BROCK_S_PROTECTION_101 ("Brock's Protection", "101", Rarity.RARE, [TRAINER]),
  CHAOS_GYM_102 ("Chaos Gym", "102", Rarity.RARE, [TRAINER, CardType.STADIUM]),
  ERIKA_S_KINDNESS_103 ("Erika's Kindness", "103", Rarity.RARE, [TRAINER]),
  GIOVANNI_104 ("Giovanni", "104", Rarity.RARE, [TRAINER]),
  GIOVANNI_S_LAST_RESORT_105 ("Giovanni's Last Resort", "105", Rarity.RARE, [TRAINER]),
  KOGA_106 ("Koga", "106", Rarity.RARE, [TRAINER]),
  LT__SURGE_S_SECRET_PLAN_107 ("Lt. Surge's Secret Plan", "107", Rarity.RARE, [TRAINER, NOT_IMPLEMENTED]),
  MISTY_S_WISH_108 ("Misty's Wish", "108", Rarity.RARE, [TRAINER]),
  RESISTANCE_GYM_109 ("Resistance Gym", "109", Rarity.RARE, [TRAINER, CardType.STADIUM]),
  SABRINA_110 ("Sabrina", "110", Rarity.RARE, [TRAINER]),
  BLAINE_S_QUIZ__2_111 ("Blaine's Quiz #2", "111", Rarity.UNCOMMON, [TRAINER, NOT_IMPLEMENTED]),
  BLAINE_S_QUIZ__3_112 ("Blaine's Quiz #3", "112", Rarity.UNCOMMON, [TRAINER, NOT_IMPLEMENTED]),
  CINNABAR_CITY_GYM_113 ("Cinnabar City Gym", "113", Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  FUCHSIA_CITY_GYM_114 ("Fuchsia City Gym", "114", Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  KOGA_S_NINJA_TRICK_115 ("Koga's Ninja Trick", "115", Rarity.UNCOMMON, [TRAINER]),
  MASTER_BALL_116 ("Master Ball", "116", Rarity.UNCOMMON, [TRAINER]),
  MAX_REVIVE_117 ("Max Revive", "117", Rarity.UNCOMMON, [TRAINER]),
  MISTY_S_TEARS_118 ("Misty's Tears", "118", Rarity.UNCOMMON, [TRAINER]),
  ROCKET_S_MINEFIELD_GYM_119 ("Rocket's Minefield Gym", "119", Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  ROCKET_S_SECRET_EXPERIMENT_120 ("Rocket's Secret Experiment", "120", Rarity.UNCOMMON, [TRAINER]),
  SABRINA_S_PSYCHIC_CONTROL_121 ("Sabrina's Psychic Control", "121", Rarity.UNCOMMON, [TRAINER]),
  SAFFRON_CITY_GYM_122 ("Saffron City Gym", "122", Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  VIRIDIAN_CITY_GYM_123 ("Viridian City Gym", "123", Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  FERVOR_124 ("Fervor", "124", Rarity.COMMON, [TRAINER]),
  TRANSPARENT_WALLS_125 ("Transparent Walls", "125", Rarity.COMMON, [TRAINER]),
  WARP_POINT_126 ("Warp Point", "126", Rarity.COMMON, [TRAINER]),
  FIGHTING_ENERGY_127 ("Fighting Energy", "127", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_128 ("Fire Energy", "128", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  GRASS_ENERGY_129 ("Grass Energy", "129", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_130 ("Lightning Energy", "130", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_131 ("Psychic Energy", "131", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_132 ("Water Energy", "132", Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodGymChallenge(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_GYM_CHALLENGE;
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
    return null;
  }

}
