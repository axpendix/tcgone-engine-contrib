package tcgwars.logic.impl.pokemod


import tcgwars.logic.card.*
import tcgwars.logic.util.*

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodGymHeroes implements LogicCardInfo {

  BLAINE_S_MOLTRES_1 ("Blaine's Moltres", 1, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_RHYDON_2 ("Brock's Rhydon", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  ERIKA_S_CLEFABLE_3 ("Erika's Clefable", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_DRAGONAIR_4 ("Erika's Dragonair", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_VILEPLUME_5 ("Erika's Vileplume", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_ELECTABUZZ_6 ("Lt. Surge's Electabuzz", 6, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_FEAROW_7 ("Lt. Surge's Fearow", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_MAGNETON_8 ("Lt. Surge's Magneton", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  MISTY_S_SEADRA_9 ("Misty's Seadra", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_TENTACRUEL_10 ("Misty's Tentacruel", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  ROCKET_S_HITMONCHAN_11 ("Rocket's Hitmonchan", 11, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  ROCKET_S_MOLTRES_12 ("Rocket's Moltres", 12, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  ROCKET_S_SCYTHER_13 ("Rocket's Scyther", 13, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  SABRINA_S_GENGAR_14 ("Sabrina's Gengar", 14, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  BROCK_15 ("Brock", 15, Rarity.HOLORARE, [TRAINER]),
  ERIKA_16 ("Erika", 16, Rarity.HOLORARE, [TRAINER]),
  LT__SURGE_17 ("Lt. Surge", 17, Rarity.HOLORARE, [TRAINER]),
  MISTY_18 ("Misty", 18, Rarity.HOLORARE, [TRAINER]),
  THE_ROCKET_S_TRAP_19 ("The Rocket's Trap", 19, Rarity.HOLORARE, [TRAINER]),
  BROCK_S_GOLEM_20 ("Brock's Golem", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_ONIX_21 ("Brock's Onix", 21, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_RHYHORN_22 ("Brock's Rhyhorn", 22, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_SANDSLASH_23 ("Brock's Sandslash", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_ZUBAT_24 ("Brock's Zubat", 24, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_CLEFAIRY_25 ("Erika's Clefairy", 25, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_VICTREEBEL_26 ("Erika's Victreebel", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_ELECTABUZZ_27 ("Lt. Surge's Electabuzz", 27, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_RAICHU_28 ("Lt. Surge's Raichu", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  MISTY_S_CLOYSTER_29 ("Misty's Cloyster", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_GOLDEEN_30 ("Misty's Goldeen", 30, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_POLIWRATH_31 ("Misty's Poliwrath", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_TENTACOOL_32 ("Misty's Tentacool", 32, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  ROCKET_S_SNORLAX_33 ("Rocket's Snorlax", 33, Rarity.RARE, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  SABRINA_S_VENOMOTH_34 ("Sabrina's Venomoth", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  BLAINE_S_GROWLITHE_35 ("Blaine's Growlithe", 35, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_KANGASKHAN_36 ("Blaine's Kangaskhan", 36, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  BLAINE_S_MAGMAR_37 ("Blaine's Magmar", 37, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_GEODUDE_38 ("Brock's Geodude", 38, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_GOLBAT_39 ("Brock's Golbat", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  BROCK_S_GRAVELER_40 ("Brock's Graveler", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_LICKITUNG_41 ("Brock's Lickitung", 41, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_DRATINI_42 ("Erika's Dratini", 42, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ERIKA_S_EXEGGCUTE_43 ("Erika's Exeggcute", 43, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_EXEGGUTOR_44 ("Erika's Exeggutor", 44, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_GLOOM_45 ("Erika's Gloom", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_GLOOM_46 ("Erika's Gloom", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_ODDISH_47 ("Erika's Oddish", 47, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_WEEPINBELL_48 ("Erika's Weepinbell", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_WEEPINBELL_49 ("Erika's Weepinbell", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_MAGNEMITE_50 ("Lt. Surge's Magnemite", 50, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_RATICATE_51 ("Lt. Surge's Raticate", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_SPEAROW_52 ("Lt. Surge's Spearow", 52, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  MISTY_S_POLIWHIRL_53 ("Misty's Poliwhirl", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_PSYDUCK_54 ("Misty's Psyduck", 54, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_SEAKING_55 ("Misty's Seaking", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_STARMIE_56 ("Misty's Starmie", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_TENTACOOL_57 ("Misty's Tentacool", 57, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  SABRINA_S_HAUNTER_58 ("Sabrina's Haunter", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_JYNX_59 ("Sabrina's Jynx", 59, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_SLOWBRO_60 ("Sabrina's Slowbro", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  BLAINE_S_CHARMANDER_61 ("Blaine's Charmander", 61, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_GROWLITHE_62 ("Blaine's Growlithe", 62, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_PONYTA_63 ("Blaine's Ponyta", 63, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BLAINE_S_TAUROS_64 ("Blaine's Tauros", 64, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  BLAINE_S_VULPIX_65 ("Blaine's Vulpix", 65, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_GEODUDE_66 ("Brock's Geodude", 66, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_MANKEY_67 ("Brock's Mankey", 67, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_MANKEY_68 ("Brock's Mankey", 68, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_ONIX_69 ("Brock's Onix", 69, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_RHYHORN_70 ("Brock's Rhyhorn", 70, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_SANDSHREW_71 ("Brock's Sandshrew", 71, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_SANDSHREW_72 ("Brock's Sandshrew", 72, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  BROCK_S_VULPIX_73 ("Brock's Vulpix", 73, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  BROCK_S_ZUBAT_74 ("Brock's Zubat", 74, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_BELLSPROUT_75 ("Erika's Bellsprout", 75, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_BELLSPROUT_76 ("Erika's Bellsprout", 76, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_EXEGGCUTE_77 ("Erika's Exeggcute", 77, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_ODDISH_78 ("Erika's Oddish", 78, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ERIKA_S_TANGELA_79 ("Erika's Tangela", 79, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  LT__SURGE_S_MAGNEMITE_80 ("Lt. Surge's Magnemite", 80, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_PIKACHU_81 ("Lt. Surge's Pikachu", 81, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  LT__SURGE_S_RATTATA_82 ("Lt. Surge's Rattata", 82, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_SPEAROW_83 ("Lt. Surge's Spearow", 83, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  LT__SURGE_S_VOLTORB_84 ("Lt. Surge's Voltorb", 84, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  MISTY_S_GOLDEEN_85 ("Misty's Goldeen", 85, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_HORSEA_86 ("Misty's Horsea", 86, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_POLIWAG_87 ("Misty's Poliwag", 87, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_SEEL_88 ("Misty's Seel", 88, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_SHELLDER_89 ("Misty's Shellder", 89, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  MISTY_S_STARYU_90 ("Misty's Staryu", 90, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  SABRINA_S_ABRA_91 ("Sabrina's Abra", 91, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_DROWZEE_92 ("Sabrina's Drowzee", 92, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_GASTLY_93 ("Sabrina's Gastly", 93, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_MR__MIME_94 ("Sabrina's Mr. Mime", 94, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_SLOWPOKE_95 ("Sabrina's Slowpoke", 95, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  SABRINA_S_VENONAT_96 ("Sabrina's Venonat", 96, Rarity.COMMON, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  BLAINE_S_QUIZ__1_97 ("Blaine's Quiz #1", 97, Rarity.RARE, [TRAINER, NOT_IMPLEMENTED]),
  BROCK_98 ("Brock", 98, Rarity.RARE, [TRAINER]),
  CHARITY_99 ("Charity", 99, Rarity.RARE, [TRAINER]),
  ERIKA_100 ("Erika", 100, Rarity.RARE, [TRAINER]),
  LT__SURGE_101 ("Lt. Surge", 101, Rarity.RARE, [TRAINER]),
  MISTY_102 ("Misty", 102, Rarity.RARE, [TRAINER]),
  NO_REMOVAL_GYM_103 ("No Removal Gym", 103, Rarity.RARE, [TRAINER, CardType.STADIUM]),
  THE_ROCKET_S_TRAINING_GYM_104 ("The Rocket's Training Gym", 104, Rarity.RARE, [TRAINER, CardType.STADIUM]),
  BLAINE_S_LAST_RESORT_105 ("Blaine's Last Resort", 105, Rarity.UNCOMMON, [TRAINER]),
  BROCK_S_TRAINING_METHOD_106 ("Brock's Training Method", 106, Rarity.UNCOMMON, [TRAINER]),
  CELADON_CITY_GYM_107 ("Celadon City Gym", 107, Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  CERULEAN_CITY_GYM_108 ("Cerulean City Gym", 108, Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  ERIKA_S_MAIDS_109 ("Erika's Maids", 109, Rarity.UNCOMMON, [TRAINER]),
  ERIKA_S_PERFUME_110 ("Erika's Perfume", 110, Rarity.UNCOMMON, [TRAINER]),
  GOOD_MANNERS_111 ("Good Manners", 111, Rarity.UNCOMMON, [TRAINER]),
  LT__SURGE_S_TREATY_112 ("Lt. Surge's Treaty", 112, Rarity.UNCOMMON, [TRAINER]),
  MINION_OF_TEAM_ROCKET_113 ("Minion of Team Rocket", 113, Rarity.UNCOMMON, [TRAINER]),
  MISTY_S_WRATH_114 ("Misty's Wrath", 114, Rarity.UNCOMMON, [TRAINER]),
  PEWTER_CITY_GYM_115 ("Pewter City Gym", 115, Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  RECALL_116 ("Recall", 116, Rarity.UNCOMMON, [TRAINER]),
  SABRINA_S_ESP_117 ("Sabrina's ESP", 117, Rarity.UNCOMMON, [TRAINER]),
  SECRET_MISSION_118 ("Secret Mission", 118, Rarity.UNCOMMON, [TRAINER]),
  TICKLING_MACHINE_119 ("Tickling Machine", 119, Rarity.UNCOMMON, [TRAINER]),
  VERMILION_CITY_GYM_120 ("Vermilion City Gym", 120, Rarity.UNCOMMON, [TRAINER, CardType.STADIUM]),
  BLAINE_S_GAMBLE_121 ("Blaine's Gamble", 121, Rarity.COMMON, [TRAINER]),
  ENERGY_FLOW_122 ("Energy Flow", 122, Rarity.COMMON, [TRAINER]),
  MISTY_S_DUEL_123 ("Misty's Duel", 123, Rarity.COMMON, [TRAINER]),
  NARROW_GYM_124 ("Narrow Gym", 124, Rarity.COMMON, [TRAINER, CardType.STADIUM]),
  SABRINA_S_GAZE_125 ("Sabrina's Gaze", 125, Rarity.COMMON, [TRAINER]),
  TRASH_EXCHANGE_126 ("Trash Exchange", 126, Rarity.COMMON, [TRAINER]),
  FIGHTING_ENERGY_127 ("Fighting Energy", 127, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_128 ("Fire Energy", 128, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  GRASS_ENERGY_129 ("Grass Energy", 129, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_130 ("Lightning Energy", 130, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_131 ("Psychic Energy", 131, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_132 ("Water Energy", 132, Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodGymHeroes(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_GYM_HEROES;
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
    return null;
    }
  }

}