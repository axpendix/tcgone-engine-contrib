package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.impl.gen3.TeamRocketReturns;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*

/**
 * @author
 */
enum EvolvingSkies implements LogicCardInfo {

  PINSIR_1("Pinsir", "1", Rarity.RARE, [POKEMON, BASIC, SINGLE_STRIKE, _GRASS_]),
  HOPPIP_2("Hoppip", "2", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _GRASS_]),
  SKIPLOOM_3("Skiploom", "3", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _GRASS_]),
  JUMPLUFF_4("Jumpluff", "4", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, RAPID_STRIKE, _GRASS_]),
  SEEDOT_5("Seedot", "5", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TROPIUS_6("Tropius", "6", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  LEAFEON_V_7("Leafeon V", "7", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  LEAFEON_VMAX_8("Leafeon VMAX", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  PETILIL_9("Petilil", "9", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LILLIGANT_10("Lilligant", "10", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  DWEBBLE_11("Dwebble", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CRUSTLE_12("Crustle", "12", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  TREVENANT_V_13("Trevenant V", "13", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TREVENANT_VMAX_14("Trevenant VMAX", "14", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  GOSSIFLEUR_15("Gossifleur", "15", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_16("Eldegoss", "16", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  APPLIN_17("Applin", "17", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  FLAREON_VMAX_18("Flareon VMAX", "18", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _FIRE_]),
  ENTEI_19("Entei", "19", Rarity.HOLORARE, [POKEMON, BASIC, SINGLE_STRIKE, _FIRE_]),
  VICTINI_20("Victini", "20", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_V_21("Volcarona V", "21", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  LITLEO_22("Litleo", "22", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  PYROAR_23("Pyroar", "23", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIRE_]),
  PSYDUCK_24("Psyduck", "24", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GOLDUCK_25("Golduck", "25", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  TENTACOOL_26("Tentacool", "26", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TENTACRUEL_27("Tentacruel", "27", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  GYARADOS_V_28("Gyarados V", "28", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GYARADOS_VMAX_29("Gyarados VMAX", "29", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  VAPOREON_VMAX_30("Vaporeon VMAX", "30", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _WATER_]),
  SUICUNE_V_31("Suicune V", "31", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  LOTAD_32("Lotad", "32", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LOMBRE_33("Lombre", "33", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  LUDICOLO_34("Ludicolo", "34", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _WATER_]),
  CARVANHA_35("Carvanha", "35", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SHARPEDO_36("Sharpedo", "36", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  FEEBAS_37("Feebas", "37", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  MILOTIC_38("Milotic", "38", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _WATER_]),
  LUVDISC_39("Luvdisc", "39", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GLACEON_V_40("Glaceon V", "40", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_VMAX_41("Glaceon VMAX", "41", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  TYMPOLE_42("Tympole", "42", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CRYOGONAL_43("Cryogonal", "43", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BERGMITE_44("Bergmite", "44", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  AVALUGG_45("Avalugg", "45", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  WISHIWASHI_46("Wishiwashi", "46", Rarity.RARE, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  EISCUE_47("Eiscue", "47", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  ARCTOVISH_V_48("Arctovish V", "48", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  PIKACHU_49("Pikachu", "49", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_50("Raichu", "50", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  JOLTEON_VMAX_51("Jolteon VMAX", "51", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  CHINCHOU_52("Chinchou", "52", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  LANTURN_53("Lanturn", "53", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  MAREEP_54("Mareep", "54", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_55("Flaaffy", "55", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  AMPHAROS_56("Ampharos", "56", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _LIGHTNING_]),
  EMOLGA_57("Emolga", "57", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DRACOZOLT_V_58("Dracozolt V", "58", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  DRACOZOLT_VMAX_59("Dracozolt VMAX", "59", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  REGIELEKI_60("Regieleki", "60", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  DROWZEE_61("Drowzee", "61", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HYPNO_62("Hypno", "62", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  GALARIAN_ARTICUNO_63("Galarian Articuno", "63", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  ESPEON_V_64("Espeon V", "64", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ESPEON_VMAX_65("Espeon VMAX", "65", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  WOBBUFFET_66("Wobbuffet", "66", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _PSYCHIC_]),
  SABLEYE_67("Sableye", "67", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOOBAT_68("Woobat", "68", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWOOBAT_69("Swoobat", "69", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  GOLURK_V_70("Golurk V", "70", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _PSYCHIC_]),
  FLABEBE_71("Flabébé", "71", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _PSYCHIC_]),
  FLOETTE_72("Floette", "72", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _PSYCHIC_]),
  FLORGES_73("Florges", "73", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_V_74("Sylveon V", "74", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_VMAX_75("Sylveon VMAX", "75", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _PSYCHIC_]),
  PUMPKABOO_76("Pumpkaboo", "76", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOURGEIST_77("Gourgeist", "77", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  CUTIEFLY_78("Cutiefly", "78", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  RIBOMBEE_79("Ribombee", "79", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  MARSHADOW_80("Marshadow", "80", Rarity.HOLORARE, [POKEMON, BASIC, RAPID_STRIKE, _PSYCHIC_]),
  HITMONCHAN_81("Hitmonchan", "81", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIGHTING_]),
  GALARIAN_ZAPDOS_82("Galarian Zapdos", "82", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MEDICHAM_V_83("Medicham V", "83", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  HIPPOPOTAS_84("Hippopotas", "84", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOWDON_85("Hippowdon", "85", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  ROGGENROLA_86("Roggenrola", "86", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  BOLDORE_87("Boldore", "87", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  GIGALITH_88("Gigalith", "88", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _FIGHTING_]),
  PALPITOAD_89("Palpitoad", "89", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  SEISMITOAD_90("Seismitoad", "90", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _FIGHTING_]),
  LYCANROC_V_91("Lycanroc V", "91", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  LYCANROC_VMAX_92("Lycanroc VMAX", "92", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  GALARIAN_MOLTRES_93("Galarian Moltres", "93", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  UMBREON_V_94("Umbreon V", "94", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  UMBREON_VMAX_95("Umbreon VMAX", "95", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  NUZLEAF_96("Nuzleaf", "96", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  SHIFTRY_97("Shiftry", "97", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _DARKNESS_]),
  SCRAGGY_98("Scraggy", "98", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SCRAFTY_99("Scrafty", "99", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  GARBODOR_V_100("Garbodor V", "100", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GARBODOR_VMAX_101("Garbodor VMAX", "101", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  ZORUA_102("Zorua", "102", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ZOROARK_103("Zoroark", "103", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  NICKIT_104("Nickit", "104", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_105("Thievul", "105", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  ALTARIA_106("Altaria", "106", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  BAGON_107("Bagon", "107", Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  SHELGON_108("Shelgon", "108", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  SALAMENCE_109("Salamence", "109", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _DRAGON_]),
  RAYQUAZA_V_110("Rayquaza V", "110", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _DRAGON_]),
  RAYQUAZA_VMAX_111("Rayquaza VMAX", "111", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _DRAGON_]),
  DIALGA_112("Dialga", "112", Rarity.HOLORARE, [POKEMON, BASIC, SINGLE_STRIKE, _DRAGON_]),
  DEINO_113("Deino", "113", Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  ZWEILOUS_114("Zweilous", "114", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  HYDREIGON_115("Hydreigon", "115", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _DRAGON_]),
  KYUREM_116("Kyurem", "116", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  NOIVERN_V_117("Noivern V", "117", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  ZYGARDE_118("Zygarde", "118", Rarity.HOLORARE, [POKEMON, BASIC, RAPID_STRIKE, _DRAGON_]),
  DRAMPA_119("Drampa", "119", Rarity.RARE, [POKEMON, BASIC, _DRAGON_]),
  FLAPPLE_120("Flapple", "120", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  APPLETUN_121("Appletun", "121", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  DURALUDON_V_122("Duraludon V", "122", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DRAGON_]),
  DURALUDON_VMAX_123("Duraludon VMAX", "123", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DRAGON_]),
  REGIDRAGO_124("Regidrago", "124", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  EEVEE_125("Eevee", "125", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TEDDIURSA_126("Teddiursa", "126", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_127("Ursaring", "127", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  SMEARGLE_128("Smeargle", "128", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  SLAKOTH_129("Slakoth", "129", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _COLORLESS_]),
  VIGOROTH_130("Vigoroth", "130", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _COLORLESS_]),
  SLAKING_131("Slaking", "131", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, SINGLE_STRIKE, _COLORLESS_]),
  SWABLU_132("Swablu", "132", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LILLIPUP_133("Lillipup", "133", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HERDIER_134("Herdier", "134", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  STOUTLAND_135("Stoutland", "135", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _COLORLESS_]),
  RUFFLET_136("Rufflet", "136", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BRAVIARY_137("Braviary", "137", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  FLETCHLING_138("Fletchling", "138", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FLETCHINDER_139("Fletchinder", "139", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  TALONFLAME_140("Talonflame", "140", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _COLORLESS_]),
  AROMA_LADY_141("Aroma Lady", "141", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BOOST_SHAKE_142("Boost Shake", "142", Rarity.UNCOMMON, [TRAINER, ITEM]),
  COPYCAT_143("Copycat", "143", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRYSTAL_CAVE_144("Crystal Cave", "144", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DIGGING_GLOVES_145("Digging Gloves", "145", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  DREAM_BALL_146("Dream Ball", "146", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ELEMENTAL_BADGE_147("Elemental Badge", "147", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  FULL_FACE_GUARD_148("Full Face Guard", "148", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  GORDIE_149("Gordie", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LUCKY_ICE_POP_150("Lucky Ice Pop", "150", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MOON_SUN_BADGE_151("Moon & Sun Badge", "151", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  RAIHAN_152("Raihan", "152", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_153("Rapid Strike Scroll of the Flying Dragon", "153", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL, RAPID_STRIKE]),
  RESCUE_CARRIER_154("Rescue Carrier", "154", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RIBBON_BADGE_155("Ribbon Badge", "155", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  RUBBER_GLOVES_156("Rubber Gloves", "156", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  SHOPPING_CENTER_157("Shopping Center", "157", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SINGLE_STRIKE_SCROLL_OF_THE_FANGED_DRAGON_158("Single Strike Scroll of the Fanged Dragon", "158", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL, SINGLE_STRIKE]),
  SNOW_LEAF_BADGE_159("Snow Leaf Badge", "159", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  SPIRIT_MASK_160("Spirit Mask", "160", Rarity.UNCOMMON, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  STORMY_MOUNTAINS_161("Stormy Mountains", "161", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SWITCHING_CUPS_162("Switching Cups", "162", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TOY_CATCHER_163("Toy Catcher", "163", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ZINNIA_S_RESOLVE_164("Zinnia's Resolve", "164", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TREASURE_ENERGY_165("Treasure Energy", "165", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  LEAFEON_V_166("Leafeon V", "166", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  LEAFEON_V_167("Leafeon V", "167", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TREVENANT_V_168("Trevenant V", "168", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  FLAREON_V_169("Flareon V", "169", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _FIRE_]),
  VOLCARONA_V_170("Volcarona V", "170", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  GYARADOS_V_171("Gyarados V", "171", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  VAPOREON_V_172("Vaporeon V", "172", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _WATER_]),
  SUICUNE_V_173("Suicune V", "173", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_V_174("Glaceon V", "174", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_V_175("Glaceon V", "175", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  ARCTOVISH_V_176("Arctovish V", "176", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  JOLTEON_V_177("Jolteon V", "177", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  DRACOZOLT_V_178("Dracozolt V", "178", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ESPEON_V_179("Espeon V", "179", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ESPEON_V_180("Espeon V", "180", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GOLURK_V_181("Golurk V", "181", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _PSYCHIC_]),
  GOLURK_V_182("Golurk V", "182", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _PSYCHIC_]),
  SYLVEON_V_183("Sylveon V", "183", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_V_184("Sylveon V", "184", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _PSYCHIC_]),
  MEDICHAM_V_185("Medicham V", "185", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  MEDICHAM_V_186("Medicham V", "186", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  LYCANROC_V_187("Lycanroc V", "187", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  UMBREON_V_188("Umbreon V", "188", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  UMBREON_V_189("Umbreon V", "189", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  GARBODOR_V_190("Garbodor V", "190", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  DRAGONITE_V_191("Dragonite V", "191", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DRAGONITE_V_192("Dragonite V", "192", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  RAYQUAZA_V_193("Rayquaza V", "193", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _DRAGON_]),
  RAYQUAZA_V_194("Rayquaza V", "194", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _DRAGON_]),
  NOIVERN_V_195("Noivern V", "195", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  NOIVERN_V_196("Noivern V", "196", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DURALUDON_V_197("Duraludon V", "197", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DRAGON_]),
  DURALUDON_V_198("Duraludon V", "198", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DRAGON_]),
  AROMA_LADY_199("Aroma Lady", "199", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  COPYCAT_200("Copycat", "200", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  GORDIE_201("Gordie", "201", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  RAIHAN_202("Raihan", "202", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  ZINNIA_S_RESOLVE_203("Zinnia's Resolve", "203", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  LEAFEON_VMAX_204("Leafeon VMAX", "204", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  LEAFEON_VMAX_205("Leafeon VMAX", "205", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  TREVENANT_VMAX_206("Trevenant VMAX", "206", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  GYARADOS_VMAX_207("Gyarados VMAX", "207", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  GLACEON_VMAX_208("Glaceon VMAX", "208", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  GLACEON_VMAX_209("Glaceon VMAX", "209", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  DRACOZOLT_VMAX_210("Dracozolt VMAX", "210", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  SYLVEON_VMAX_211("Sylveon VMAX", "211", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_VMAX_212("Sylveon VMAX", "212", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _PSYCHIC_]),
  LYCANROC_VMAX_213("Lycanroc VMAX", "213", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  UMBREON_VMAX_214("Umbreon VMAX", "214", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  UMBREON_VMAX_215("Umbreon VMAX", "215", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  GARBODOR_VMAX_216("Garbodor VMAX", "216", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  RAYQUAZA_VMAX_217("Rayquaza VMAX", "217", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _DRAGON_]),
  RAYQUAZA_VMAX_218("Rayquaza VMAX", "218", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _DRAGON_]),
  DURALUDON_VMAX_219("Duraludon VMAX", "219", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DRAGON_]),
  DURALUDON_VMAX_220("Duraludon VMAX", "220", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DRAGON_]),
  AROMA_LADY_221("Aroma Lady", "221", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  COPYCAT_222("Copycat", "222", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  GORDIE_223("Gordie", "223", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  RAIHAN_224("Raihan", "224", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  ZINNIA_S_RESOLVE_225("Zinnia's Resolve", "225", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  FROSLASS_226("Froslass", "226", Rarity.SECRET, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  INTELEON_227("Inteleon", "227", Rarity.SECRET, [POKEMON, STAGE2, EVOLUTION, RAPID_STRIKE, _WATER_]),
  CRESSELIA_228("Cresselia", "228", Rarity.SECRET, [POKEMON, BASIC, _PSYCHIC_]),
  BOOST_SHAKE_229("Boost Shake", "229", Rarity.SECRET, [TRAINER, ITEM]),
  CRYSTAL_CAVE_230("Crystal Cave", "230", Rarity.SECRET, [TRAINER, STADIUM]),
  FULL_FACE_GUARD_231("Full Face Guard", "231", Rarity.SECRET, [TRAINER, ITEM, ITEM, POKEMON_TOOL]),
  STORMY_MOUNTAINS_232("Stormy Mountains", "232", Rarity.SECRET, [TRAINER, STADIUM]),
  TOY_CATCHER_233("Toy Catcher", "233", Rarity.SECRET, [TRAINER, ITEM]),
  TURFFIELD_STADIUM_234("Turffield Stadium", "234", Rarity.SECRET, [TRAINER, STADIUM]),
  LIGHTNING_ENERGY_235("Lightning Energy", "235", Rarity.SECRET, [ENERGY, BASIC_ENERGY]),
  DARKNESS_ENERGY_236("Darkness Energy", "236", Rarity.SECRET, [ENERGY, BASIC_ENERGY]),
  METAL_ENERGY_237("Metal Energy", "237", Rarity.SECRET, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  EvolvingSkies(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
    this.name = name;
    this.rarity = rarity;
    this.collectionLineNo = collectionLineNo;
  }

  @Override
  CardTypeSet getCardTypes() {
    return cardTypes;
  }

  @Override
  String getName() {
    return name;
  }

  @Override
  Rarity getRarity() {
    return rarity;
  }

  @Override
  String getNumber() {
    return collectionLineNo;
  }

  @Override
  tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.EVOLVING_SKIES;
  }

  @Override
  String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  String getEnumName() {
    return name();
  }

  @Override
  Card getImplementation() {
    switch (this) {
      case PINSIR_1:
        return copy(EeveeHeroes.PINSIR_1, this);
      case HOPPIP_2:
        return copy(BlueSkyStream.HOPPIP_1, this);
      case SKIPLOOM_3:
        return copy(BlueSkyStream.SKIPLOOM_2, this);
      case JUMPLUFF_4:
        return copy(BlueSkyStream.JUMPLUFF_3, this);
      case SEEDOT_5:
        return basic(this, hp: HP050, type: G, retreatCost: 1) {
          weakness FIRE
          move "Astonish", {
            text "10 damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost COLORLESS, COLORLESS
            astonish()
          }
        };
      case TROPIUS_6:
        return copy(BlueSkyStream.TROPIUS_4, this);
      case LEAFEON_V_7:
        return copy(EeveeHeroes.LEAFEON_V_2, this);
      case LEAFEON_VMAX_8:
        return copy(EeveeHeroes.LEAFEON_VMAX_3, this);
      case PETILIL_9:
        return basic(this, hp: HP060, type: G, retreatCost: 1) {
          weakness FIRE
          move "Seed Bomb", {
            text "20 damage. "
            energyCost GRASS, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case LILLIGANT_10:
        return evolution(this, from: "Petilil", hp: HP100, type: G, retreatCost: 1) {
          weakness FIRE
          move "Dizzying Flower", {
            text "70 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Asleep. If tails, your opponent's Active Pokémon is now Confused."
            energyCost GRASS, COLORLESS
            onAttack {
              damage 70
              flip 1, { applyAfterDamage ASLEEP }, { applyAfterDamage CONFUSED }
            }
          }
        };
      case DWEBBLE_11:
        return basic(this, hp: HP060, type: G, retreatCost: 2) {
          weakness FIRE
          move "Ram", {
            text "10 damage. "
            energyCost GRASS
            onAttack {
              damage 10
            }
          }
          move "Sharp Claws", {
            text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost GRASS, COLORLESS
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }
        };
      case CRUSTLE_12:
        return evolution(this, from: "Dwebble", hp: HP130, type: G, retreatCost: 3) {
          weakness FIRE
          move "X-Scissor", {
            text "30+ damage. Flip a coin. If heads, this attack does 60 more damage."
            energyCost GRASS, COLORLESS
            onAttack {
              damage 30
              flip { damage 60 }
            }
          }
          move "Hammer In", {
            text "130 damage. "
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 130
            }
          }
        };
      case TREVENANT_V_13:
        return copy(BlueSkyStream.TREVENANT_V_7, this);
      case TREVENANT_VMAX_14:
        return copy(BlueSkyStream.TREVENANT_VMAX_8, this);
      case GOSSIFLEUR_15:
        return copy(EeveeHeroes.GOSSIFLEUR_9, this);
      case ELDEGOSS_16:
        return copy(EeveeHeroes.ELDEGOSS_10, this);
      case APPLIN_17:
        return copy(BlueSkyStream.APPLIN_9, this);
      case FLAREON_VMAX_18:
        return copy(EeveeHeroesVmaxSpecialSet.FLAREON_VMAX_1, this);
      case ENTEI_19:
        return copy(EeveeHeroes.ENTEI_14, this);
      case VICTINI_20:
        return copy(BlueSkyStream.VICTINI_12, this);
      case VOLCARONA_V_21:
        return copy(BlueSkyStream.VOLCARONA_V_15, this);
      case LITLEO_22:
        return basic(this, hp: HP060, type: R, retreatCost: 1) {
          weakness WATER
          move "Live Coal", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case PYROAR_23:
        return evolution(this, from: "Litleo", hp: HP130, type: R, retreatCost: 2) {
          weakness WATER
          move "Combustion", {
            text "30 damage. "
            energyCost COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Rip Claw", {
            text "70 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost FIRE, COLORLESS
            onAttack {
              damage 70
              discardDefendingEnergyAfterDamage()
            }
          }
        };
      case PSYDUCK_24:
        return basic(this, hp: HP070, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Rain Splash", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case GOLDUCK_25:
        return evolution(this, from: "Psyduck", hp: HP120, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Psybeam", {
            text "20 damage. Your opponent's Active Pokémon is now Confused."
            energyCost COLORLESS
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Surf", {
            text "70 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 70
            }
          }
        };
      case TENTACOOL_26:
        return basic(this, hp: HP060, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Gentle Slap", {
            text "30 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
      case TENTACRUEL_27:
        return evolution(this, from: "Tentacool", hp: HP120, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Wave Splash", {
            text "50 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 50
            }
          }
          move "Poisonous Prison", {
            text "100 damage. Your opponent's Active Pokémon is now Poisoned. During your opponent's next turn, that Pokémon can't retreat."
            energyCost WATER, WATER, COLORLESS
            onAttack {
              damage 100
              applyAfterDamage POISONED
              cantRetreat defending
            }
          }
        };
      case GYARADOS_V_28:
        return copy(BlueSkyStream.GYARADOS_V_20, this);
      case GYARADOS_VMAX_29:
        return copy(BlueSkyStream.GYARADOS_VMAX_21, this);
      case VAPOREON_VMAX_30:
        return copy(EeveeHeroesVmaxSpecialSet.VAPOREON_VMAX_2, this);
      case SUICUNE_V_31:
        return copy(SkyscrapingPerfection.SUICUNE_V_1, this);
      case LOTAD_32:
        return copy(SkyscrapingPerfection.LOTAD_2, this);
      case LOMBRE_33:
        return copy(SkyscrapingPerfection.LOMBRE_3, this);
      case LUDICOLO_34:
        return copy(SkyscrapingPerfection.LUDICOLO_4, this);
      case CARVANHA_35:
        return basic(this, hp: HP050, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Ram", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
          move "Razor Fin", {
            text "20 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case SHARPEDO_36:
        return evolution(this, from: "Carvanha", hp: HP120, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Taunt", {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            energyCost COLORLESS
            attackRequirement {
              assert opp.bench : "Opponent has no Benched Pokémon"
            }
            onAttack {
              switchYourOpponentsBenchedWithActive()
            }
          }
          move "Jet Bite", {
            text "120 damage. During your next turn, this Pokémon can't attack."
            energyCost WATER, COLORLESS
            onAttack {
              damage 120
              cantAttackNextTurn self
            }
          }
        };
      case FEEBAS_37:
        return copy(EeveeHeroes.FEEBAS_22, this);
      case MILOTIC_38:
        return copy(EeveeHeroes.MILOTIC_23, this);
      case LUVDISC_39:
        return basic(this, hp: HP070, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Synchrodraw", {
            text "Shuffle your hand into your deck. Then, draw a card for each card in your opponent's hand."
            energyCost COLORLESS
            attackRequirement {
              assert my.hand.getExcludedList(thisCard) || my.deck : "Hand and deck are empty"
            }
            onAttack {
              hand.moveTo hidden:true,my.deck
              shuffleDeck()
              draw opp.hand.size()
            }
          }
          move "Water Gun", {
            text "20 damage. "
            energyCost COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case GLACEON_V_40:
        return copy(EeveeHeroes.GLACEON_V_24, this);
      case GLACEON_VMAX_41:
        return copy(EeveeHeroes.GLACEON_VMAX_25, this);
      case TYMPOLE_42:
        return basic(this, hp: HP070, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Mud-Slap", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case CRYOGONAL_43:
        return copy(BlueSkyStream.CRYOGONAL_24, this);
      case BERGMITE_44:
        return basic(this, hp: HP070, type: W, retreatCost: 2) {
          weakness METAL
          move "Tackle", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
          move "Spinning Attack", {
            text "20 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case AVALUGG_45:
        return evolution(this, from: "Bergmite", hp: HP150, type: W, retreatCost: 4) {
          weakness METAL
          move "Frost Barrier", {
            text "80 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 80
              reduceDamageNextTurn hp(30), thisMove
            }
          }
          move "Hammer In", {
            text "140 damage. "
            energyCost WATER, WATER, COLORLESS, COLORLESS
            onAttack {
              damage 140
            }
          }
        };
      case WISHIWASHI_46:
        return copy(BlueSkyStream.WISHIWASHI_25, this);
      case EISCUE_47:
        return copy(SkyscrapingPerfection.EISCUE_9, this);
      case ARCTOVISH_V_48:
        return basic(this, hp: HP220, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Ancient Freeze", {
            text "80 damage. If the Defending Pokémon is a Pokémon V or a Pokémon-GX, it can't attack during your opponent's next turn."
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 80
              if (defending.pokemonV || defending.pokemonGX) {
                cantAttackNextTurn defending
              }
            }
          }
          move "Giga Impact", {
            text "220 damage. During your next turn, this Pokémon can't attack."
            energyCost WATER, WATER, COLORLESS, COLORLESS
            onAttack {
              damage 220
              cantAttackNextTurn self
            }
          }
        };
      case PIKACHU_49:
        return copy(EeveeHeroes.PIKACHU_26, this);
      case RAICHU_50:
        return copy(EeveeHeroes.RAICHU_27, this);
      case JOLTEON_VMAX_51:
        return copy(EeveeHeroesVmaxSpecialSet.JOLTEON_VMAX_3, this);
      case CHINCHOU_52:
        return basic(this, hp: HP070, type: L, retreatCost: 1) {
          weakness FIGHTING
          move "Electro Ball", {
            text "10 damage. "
            energyCost LIGHTNING
            onAttack {
              damage 10
            }
          }
        };
      case LANTURN_53:
        return evolution(this, from: "Chinchou", hp: HP120, type: L, retreatCost: 2) {
          weakness FIGHTING
          move "Blinding Beam", {
            text "40 damage. During your opponent's next turn, if the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack doesn't happen."
            energyCost LIGHTNING, COLORLESS
            onAttack {
              damage 40
              sandAttack thisMove
            }
          }
          move "Electro Ball", {
            text "120 damage. "
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            onAttack {
              damage 120
            }
          }
        };
      case MAREEP_54:
        return copy(BlueSkyStream.MAREEP_26, this);
      case FLAAFFY_55:
        return copy(BlueSkyStream.FLAAFFY_27, this);
      case AMPHAROS_56:
        return copy(BlueSkyStream.AMPHAROS_28, this);
      case EMOLGA_57:
        return basic(this, hp: HP070, type: L, retreatCost: null) {
          weakness FIGHTING
          move "Thunder Shock", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost LIGHTNING
            onAttack {
              damage 30
              afterDamage {
                flipThenApplySC PARALYZED
              }
            }
          }
        };
      case DRACOZOLT_V_58:
        return basic(this, hp: HP220, type: L, retreatCost: 3) {
          weakness FIGHTING
          move "Primeval Beak", {
            text "30 damage. During your opponent's next turn, Energy cards can't be attached from your opponent's hand to the Defending Pokémon."
            energyCost LIGHTNING
            onAttack {
              damage 30
              targeted (defending) {
                bc "During ${opp.owner.getPlayerUsername(bg)}'s next turn, Energy can't be attached from their hand to the Defending $defending. (This effect can be removed by evolving or benching ${defending}.)"
                def pcs = defending
                delayed {
                  before ATTACH_ENERGY, pcs, {
                    if (ef.reason == PLAY_FROM_HAND) {
                      wcu "$thisMove: Can't attach energy to $pcs"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, pcs, {unregister()}
                  after EVOLVE, pcs, {unregister()}
                  after DEVOLVE, pcs, {unregister()}
                }
              }
            }
          }
          move "Mountain Swing", {
            text "180 damage. Discard the top 3 cards of your deck."
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            onAttack {
              damage 180
              afterDamage {
                if (my.deck) {
                  def discardCount = Math.min 3, my.deck.size()
                  my.deck.subList(0, discardCount).discard()
                }
              }
            }
          }
        };
      case DRACOZOLT_VMAX_59:
        return evolution(this, from: "Dracozolt V", hp: HP330, type: L, retreatCost: 3) {
          weakness FIGHTING
          move "Spark Trap", {
            text "60 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if it is Knocked Out), put 12 damage counters on the Attacking Pokémon."
            energyCost LIGHTNING
            onAttack {
              damage 60
              ifDamagedByAttackNextTurn delegate, {
                directDamage 120, ef.attacker
              }
            }
          }
          move "Max Impact", {
            text "200 damage. "
            energyCost LIGHTNING, COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 200
            }
          }
        };
      case REGIELEKI_60:
        return copy(BlueSkyStream.REGIELEKI_33, this);
      case DROWZEE_61:
        return basic(this, hp: HP070, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Pound", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case HYPNO_62:
        return evolution(this, from: "Drowzee", hp: HP110, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Hypnosis", {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost PSYCHIC
            onAttack {
              apply ASLEEP
            }
          }
          move "Wake-Up Slap", {
            text "30+ damage. If your opponent's Active Pokémon is affected by a Special Condition, this attack does 90 more damage. Then, that Pokémon recovers from all Special Conditions."
            energyCost PSYCHIC
            onAttack {
              damage 30
              if (defending.specialConditions) {
                damage 90
                clearSpecialCondition defending
              }
            }
          }
        };
      case GALARIAN_ARTICUNO_63:
        return copy(SkyscrapingPerfection.GALARIAN_ARTICUNO_12, this);
      case ESPEON_V_64:
        return copy(EeveeHeroes.ESPEON_V_35, this);
      case ESPEON_VMAX_65:
        return copy(EeveeHeroesVmaxSpecialSet.ESPEON_VMAX_4, this);
      case WOBBUFFET_66:
        return copy(SkyscrapingPerfection.WOBBUFFET_13, this);
      case SABLEYE_67:
        return basic(this, hp: HP070, type: P, retreatCost: 1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Go and Collect", {
            text "Search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              def card = my.deck.search "Choose a Trainer card.", cardTypeFilter(TRAINER)
              card.moveTo(my.hand)
            }
          }
          move "Corner", {
            text "40 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
            energyCost PSYCHIC, COLORLESS
            onAttack {
              damage 40
              cantRetreat defending
            }
          }
        };
      case WOOBAT_68:
        return basic(this, hp: HP060, type: P, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Collect", {
            text "Draw a card."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Gnaw", {
            text "10 damage. "
            energyCost PSYCHIC
            onAttack {
              damage 10
            }
          }
        };
      case SWOOBAT_69:
        return evolution(this, from: "Woobat", hp: HP090, type: P, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Synchro Woofer", {
            text "30+ damage. If you have the same number of cards in your hand as your opponent, this attack does 80 more damage."
            energyCost PSYCHIC
            onAttack {
              damage 30
              if (opp.hand.size() == hand.size()) damage 80
            }
          }
        };
      case GOLURK_V_70:
        return copy(SkyscrapingPerfection.GOLURK_V_15, this);
      case FLABEBE_71:
        return copy(EeveeHeroes.FLABEBE_37, this);
      case FLOETTE_72:
        return copy(EeveeHeroes.FLOETTE_38, this);
      case FLORGES_73:
        return copy(EeveeHeroes.FLORGES_39, this);
      case SYLVEON_V_74:
        return copy(EeveeHeroes.SYLVEON_V_40, this);
      case SYLVEON_VMAX_75:
        return copy(EeveeHeroes.SYLVEON_VMAX_41, this);
      case PUMPKABOO_76:
        return copy(SkyscrapingPerfection.PUMPKABOO_16, this);
      case GOURGEIST_77:
        return copy(SkyscrapingPerfection.GOURGEIST_17, this);
      case CUTIEFLY_78:
        return basic(this, hp: HP030, type: P, retreatCost: null) {
          weakness METAL
          move "Flap", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case RIBOMBEE_79:
        return evolution(this, from: "Cutiefly", hp: HP070, type: P, retreatCost: null) {
          weakness METAL
          move "Tricky Steps", {
            text "30 damage. You may move an Energy from your opponent's Active Pokémon to 1 of their Benched Pokémon."
            energyCost COLORLESS
            onAttack {
              damage 30
              moveDefendingEnergyAfterDamage opp.bench
            }
          }
        };
      case MARSHADOW_80:
        return copy(EeveeHeroes.MARSHADOW_44, this);
      case HITMONCHAN_81:
        return copy(SkyscrapingPerfection.HITMONCHAN_18, this);
      case GALARIAN_ZAPDOS_82:
        return copy(SkyscrapingPerfection.GALARIAN_ZAPDOS_19, this);
      case MEDICHAM_V_83:
        return copy(BlueSkyStream.MEDICHAM_V_36, this);
      case HIPPOPOTAS_84:
        return basic(this, hp: HP100, type: F, retreatCost: 4) {
          weakness GRASS
          move "Tackle", {
            text "30 damage. "
            energyCost FIGHTING, COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Mud Shot", {
            text "50 damage. "
            energyCost FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 50
            }
          }
        };
      case HIPPOWDON_85:
        return evolution(this, from: "Hippopotas", hp: HP150, type: F, retreatCost: 4) {
          weakness GRASS
          move "Hammer In", {
            text "120 damage. "
            energyCost FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 120
            }
          }
          move "Sand Press", {
            text "220 damage. Discard 2 Energy from this Pokémon."
            energyCost FIGHTING, FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 220
              discardSelfEnergyAfterDamage C, C
            }
          }
        };
      case ROGGENROLA_86:
        return basic(this, hp: HP070, type: F, retreatCost: 3) {
          weakness GRASS
          move "Mud-Slap", {
            text "10 damage. "
            energyCost FIGHTING
            onAttack {
              damage 10
            }
          }
          move "Rolling Tackle", {
            text "20 damage. "
            energyCost FIGHTING, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case BOLDORE_87:
        return evolution(this, from: "Roggenrola", hp: HP110, type: F, retreatCost: 4) {
          weakness GRASS
          move "Protect", {
            text "Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Boulder Crush", {
            text "60 damage. "
            energyCost FIGHTING, COLORLESS, COLORLESS
            onAttack {
              damage 60
            }
          }
        };
      case GIGALITH_88:
        return evolution(this, from: "Boldore", hp: HP180, type: F, retreatCost: 4) {
          weakness GRASS
          move "Guard Press", {
            text "50 damage. During your opponent's next turn, this Pokémon takes 50 less damage from attacks (after applying Weakness and Resistance)."
            energyCost FIGHTING
            onAttack {
              damage 50
              reduceDamageNextTurn hp(50), thisMove
            }
          }
          move "Pressure Shot", {
            text "180 damage. This Pokémon also does 10 damage to itself for each damage counter on it."
            energyCost FIGHTING, COLORLESS, COLORLESS
            onAttack {
              damage 180
              damage 10 * self.numberOfDamageCounters, self
            }
          }
        };
      case PALPITOAD_89:
        return evolution(this, from: "Tympole", hp: HP100, type: F, retreatCost: 3) {
          weakness GRASS
          move "Stampede", {
            text "20 damage. "
            energyCost FIGHTING
            onAttack {
              damage 20
            }
          }
          move "Tongue Slap", {
            text "50 damage. "
            energyCost FIGHTING, COLORLESS, COLORLESS
            onAttack {
              damage 50
            }
          }
        };
      case SEISMITOAD_90:
        return evolution(this, from: "Palpitoad", hp: HP170, type: F, retreatCost: 3) {
          weakness GRASS
          move "Shaky Wave", {
            text "60 damage. During your opponent's next turn, the Defending Pokémon's attacks cost [C] more, and its Retreat Cost is [C] more."
            energyCost FIGHTING
            onAttack {
              damage 60
              defendingAttacksCostsMore defending, [C]
              defendingRetreatsCostsMore defending, [C]
            }
          }
          move "Hyper Voice", {
            text "160 damage. "
            energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 160
            }
          }
        };
      case LYCANROC_V_91:
        return copy(SkyscrapingPerfection.LYCANROC_V_24, this);
      case LYCANROC_VMAX_92:
        return copy(SkyscrapingPerfection.LYCANROC_VMAX_25, this);
      case GALARIAN_MOLTRES_93:
        return copy(SkyscrapingPerfection.GALARIAN_MOLTRES_26, this);
      case UMBREON_V_94:
        return copy(EeveeHeroes.UMBREON_V_47, this);
      case UMBREON_VMAX_95:
        return copy(EeveeHeroes.UMBREON_VMAX_48, this);
      case NUZLEAF_96:
        return evolution(this, from: "Seedot", hp: HP080, type: D, retreatCost: 1) {
          weakness GRASS
          move "Fake Out", {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost DARKNESS
            onAttack {
              damage 20
              afterDamage {
                flipThenApplySC PARALYZED
              }
            }
          }
        };
      case SHIFTRY_97:
        return evolution(this, from: "Nuzleaf", hp: HP150, type: D, retreatCost: 3) {
          weakness GRASS
          move "Shiftadieu", {
            text "If your opponent's Active Pokémon has any damage counters on it, put it and all attached cards into your opponent's hand."
            energyCost DARKNESS
            attackRequirement {
              assert defending.numberOfDamageCounters : "Opponent's Active Pokémon has no damage counters on it"
            }
            onAttack {
              defending.cards.moveTo opp.hand
            }
          }
          move "Nipping Cyclone", {
            text "130 damage. Discard a random card from your opponent's hand."
            energyCost DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 130
              if (opp.hand) {
                opp.hand.shuffledCopy().subList(0, 1).discard()
              }
            }
          }
        };
      case SCRAGGY_98:
        return basic(this, hp: HP070, type: D, retreatCost: 1) {
          weakness GRASS
          move "Hard Head", {
            text "10 damage. During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
            energyCost DARKNESS
            onAttack {
              damage 10
              reduceDamageNextTurn hp(10), thisMove
            }
          }
        };
      case SCRAFTY_99:
        return evolution(this, from: "Scraggy", hp: HP120, type: D, retreatCost: 2) {
          weakness GRASS
          move "Headbutt", {
            text "40 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 40
            }
          }
          move "Shakedown", {
            text "90 damage. Discard a random card from your opponent's hand."
            energyCost DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 90
              if (opp.hand) {
                opp.hand.shuffledCopy().subList(0, 1).discard()
              }
            }
          }
        };
      case GARBODOR_V_100:
        return copy(SkyscrapingPerfection.GARBODOR_V_30, this);
      case GARBODOR_VMAX_101:
        return copy(SkyscrapingPerfection.GARBODOR_VMAX_31, this);
      case ZORUA_102:
        return copy(EeveeHeroes.ZORUA_49, this);
      case ZOROARK_103:
        return copy(EeveeHeroes.ZOROARK_50, this);
      case NICKIT_104:
        return copy(SkyscrapingPerfection.NICKIT_32, this);
      case THIEVUL_105:
        return copy(SkyscrapingPerfection.THIEVUL_33, this);
      case ALTARIA_106:
        return copy(SkyscrapingPerfection.ALTARIA_40, this);
      case BAGON_107:
        return copy(BlueSkyStream.BAGON_43, this);
      case SHELGON_108:
        return copy(BlueSkyStream.SHELGON_44, this);
      case SALAMENCE_109:
        return copy(BlueSkyStream.SALAMENCE_45, this);
      case RAYQUAZA_V_110:
        return copy(BlueSkyStream.RAYQUAZA_V_46, this);
      case RAYQUAZA_VMAX_111:
        return copy(BlueSkyStream.RAYQUAZA_VMAX_47, this);
      case DIALGA_112:
        return copy(SkyscrapingPerfection.DIALGA_41, this);
      case DEINO_113:
        return copy(SkyscrapingPerfection.DEINO_42, this);
      case ZWEILOUS_114:
        return copy(SkyscrapingPerfection.ZWEILOUS_43, this);
      case HYDREIGON_115:
        return copy(SkyscrapingPerfection.HYDREIGON_44, this);
      case KYUREM_116:
        return copy(SkyscrapingPerfection.KYUREM_45, this);
      case NOIVERN_V_117:
        return copy(SkyscrapingPerfection.NOIVERN_V_46, this);
      case ZYGARDE_118:
        return copy(BlueSkyStream.ZYGARDE_48, this);
      case DRAMPA_119:
        return copy(SkyscrapingPerfection.DRAMPA_47, this);
      case FLAPPLE_120:
        return copy(BlueSkyStream.FLAPPLE_50, this);
      case APPLETUN_121:
        return copy(BlueSkyStream.APPLETUN_51, this);
      case DURALUDON_V_122:
        return copy(SkyscrapingPerfection.DURALUDON_V_48, this);
      case DURALUDON_VMAX_123:
        return copy(SkyscrapingPerfection.DURALUDON_VMAX_49, this);
      case REGIDRAGO_124:
        return copy(BlueSkyStream.REGIDRAGO_52, this);
      case EEVEE_125:
        return copy(EeveeHeroes.EEVEE_58, this);
      case TEDDIURSA_126:
        return basic(this, hp: HP070, type: C, retreatCost: 2) {
          weakness FIGHTING
          move "Scratch", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case URSARING_127:
        return evolution(this, from: "Teddiursa", hp: HP140, type: C, retreatCost: 3) {
          weakness FIGHTING
          move "Slash", {
            text "40 damage. "
            energyCost COLORLESS
            onAttack {
              damage 40
            }
          }
          move "Whap Down", {
            text "110 damage. "
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 110
            }
          }
        };
      case SMEARGLE_128:
        return copy(EeveeHeroes.SMEARGLE_59, this);
      case SLAKOTH_129:
        return copy(SkyscrapingPerfection.SLAKOTH_50, this);
      case VIGOROTH_130:
        return copy(SkyscrapingPerfection.VIGOROTH_51, this);
      case SLAKING_131:
        return copy(SkyscrapingPerfection.SLAKING_52, this);
      case SWABLU_132:
        return copy(SkyscrapingPerfection.SWABLU_53, this);
      case LILLIPUP_133:
        return basic(this, hp: HP060, type: C, retreatCost: 1) {
          weakness FIGHTING
          move "Lead", {
            text "Search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              def card = my.deck.search"Choose a Supporter card", cardTypeFilter(SUPPORTER)
              card.showToOpponent bg, text
              card.moveTo hand
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case HERDIER_134:
        return evolution(this, from: "Lillipup", hp: HP100, type: C, retreatCost: 2) {
          weakness FIGHTING
          move "Tackle", {
            text "30 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Take Down", {
            text "80 damage. This Pokémon also does 20 damage to itself."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 80
              damage 20, self
            }
          }
        };
      case STOUTLAND_135:
        return evolution(this, from: "Herdier", hp: HP160, type: C, retreatCost: 3) {
          weakness FIGHTING
          bwAbility "Intimidating Fang", {
            text "As long as this Pokémon is in the Active Spot, your opponent's Active Pokémon's attacks do 30 less damage (before applying Weakness and Resistance)."
            actionA {
              delayed {
                  after PROCESS_ATTACK_EFFECTS, {
                    bg.dm().each {
                      if (self.active && it.from.active && it.from.owner != self.owner && it.dmg.value && it.notNoEffect) {
                        bc "$thisAbility -30"
                        it.dmg -= hp(30)
                      }
                    }
                  }
                }
            }
          }
          move "Knock Away", {
            text "120+ damage. Flip a coin. If heads, this attack does 100 more damage."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 120
              flip { damage 100 }
            }
          }
        };
      case RUFFLET_136:
        return basic(this, hp: HP060, type: C, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Whirlwind", {
            text "10 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost COLORLESS
            onAttack {
              damage 10
              switchYourOpponentsBenchedWithActive()
            }
          }
        };
      case BRAVIARY_137:
        return evolution(this, from: "Rufflet", hp: HP130, type: C, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Valiant Talons", {
            text "30+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 60 more damage."
            energyCost COLORLESS
            onAttack {
              damage 30
              if (defending.realEvolution) {
                damage 60
              }
            }
          }
          move "Brave Bird", {
            text "150 damage. This Pokémon also does 50 damage to itself."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 150
              damage 50, self
            }
          }
        };
      case FLETCHLING_138:
        return basic(this, hp: HP040, type: C, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Tailwind Draw", {
            text "Draw a card. If you go second and it's your first turn, draw 3 more cards."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              draw 1
              if (bg.turnCount == 2) {
                draw 3
              }
            }
          }
          move "Surprise Attack", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost COLORLESS
            onAttack {
              flip { damage 20 }
            }
          }
        };
      case FLETCHINDER_139:
        return evolution(this, from: "Fletchling", hp: HP080, type: C, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost COLORLESS
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
        };
      case TALONFLAME_140:
        return evolution(this, from: "Fletchinder", hp: HP140, type: C, retreatCost: null) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Clutch", {
            text "40 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
            energyCost COLORLESS
            onAttack {
              damage 40
              cantRetreat defending
            }
          }
          move "Nitro Dive", {
            text "80+ damage. If this Pokémon has any [R] Energy attached, this attack does 80 more damage."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 80
              if (self.cards.energyCount(R)) damage 80
            }
          }
        };
      case AROMA_LADY_141:
        return copy(EeveeHeroes.AROMA_LADY_66, this);
      case BOOST_SHAKE_142:
        return copy(EeveeHeroes.RAPID_SHAKE_60, this);
      case COPYCAT_143:
        return copy(TeamRocketReturns.COPYCAT_83, this);
      case CRYSTAL_CAVE_144:
        return copy(SkyscrapingPerfection.CRYSTAL_CAVE_66, this);
      case DIGGING_GLOVES_145:
        return copy(SkyscrapingPerfection.DIGGING_GLOVES_60, this);
      case DREAM_BALL_146:
        return copy(EeveeHeroes.DREAM_BALL_61, this);
      case ELEMENTAL_BADGE_147:
        return copy(EeveeHeroes.ELEMENTAL_BADGE_62, this);
      case FULL_FACE_GUARD_148:
        return copy(SkyscrapingPerfection.FULL_FACE_GUARD_62, this);
      case GORDIE_149:
        return copy(EeveeHeroes.GORDIE_67, this);
      case LUCKY_ICE_POP_150:
        return copy(BlueSkyStream.LUCKY_ICE_POP_56, this);
      case MOON_SUN_BADGE_151:
        return copy(EeveeHeroes.MOON_AND_SUN_BADGE_64, this);
      case RAIHAN_152:
        return copy(SkyscrapingPerfection.RAIHAN_63, this);
      case RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_153:
        return copy(BlueSkyStream.RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_62, this);
      case RESCUE_CARRIER_154:
        return copy(SkyscrapingPerfection.RESCUE_TROLLEY_59, this);
      case RIBBON_BADGE_155:
        return copy(EeveeHeroes.RIBBON_BADGE_65, this);
      case RUBBER_GLOVES_156:
        return copy(BlueSkyStream.RUBBERY_GLOVES_60, this);
      case SHOPPING_CENTER_157:
        return copy(EeveeHeroes.FASHION_MALL_68, this);
      case SINGLE_STRIKE_SCROLL_OF_THE_FANGED_DRAGON_158:
        return copy(SkyscrapingPerfection.SINGLE_STRIKE_SCROLL_OF_THE_DRAGON_FANG_61, this);
      case SNOW_LEAF_BADGE_159:
        return copy(EeveeHeroes.SNOW_LEAF_BADGE_63, this);
      case SPIRIT_MASK_160:
        return copy(BlueSkyStream.NETHER_MASK_61, this);
      case STORMY_MOUNTAINS_161:
        return copy(BlueSkyStream.STORMY_MOUNTAIN_RANGE_66, this);
      case SWITCHING_CUPS_162:
        return copy(SkyscrapingPerfection.SWITCHEROO_CUP_58, this);
      case TOY_CATCHER_163:
        return copy(BlueSkyStream.TOY_CATCHER_58, this);
      case ZINNIA_S_RESOLVE_164:
        return copy(BlueSkyStream.ZINNIA_S_RESOLVE_65, this);
      case TREASURE_ENERGY_165:
        return copy(EeveeHeroes.TREASURE_ENERGY_69, this);
      case LEAFEON_V_166:
        return copy(LEAFEON_V_7, this);
      case LEAFEON_V_167:
        return copy(LEAFEON_V_7, this);
      case TREVENANT_V_168:
        return copy(TREVENANT_V_13, this);
      case FLAREON_V_169:
        return copy(EeveeHeroes.FLAREON_V_11, this);
      case VOLCARONA_V_170:
        return copy(VOLCARONA_V_21, this);
      case GYARADOS_V_171:
        return copy(GYARADOS_V_28, this);
      case VAPOREON_V_172:
        return copy(EeveeHeroes.VAPOREON_V_15, this);
      case SUICUNE_V_173:
        return copy(SUICUNE_V_31, this);
      case GLACEON_V_174:
        return copy(GLACEON_V_40, this);
      case GLACEON_V_175:
        return copy(GLACEON_V_40, this);
      case ARCTOVISH_V_176:
        return copy(ARCTOVISH_V_48, this);
      case JOLTEON_V_177:
        return copy(EeveeHeroes.JOLTEON_V_30, this);
      case DRACOZOLT_V_178:
        return copy(DRACOZOLT_V_58, this);
      case ESPEON_V_179:
        return copy(ESPEON_V_64, this);
      case ESPEON_V_180:
        return copy(ESPEON_V_64, this);
      case GOLURK_V_181:
        return copy(GOLURK_V_70, this);
      case GOLURK_V_182:
        return copy(GOLURK_V_70, this);
      case SYLVEON_V_183:
        return copy(SYLVEON_V_74, this);
      case SYLVEON_V_184:
        return copy(SYLVEON_V_74, this);
      case MEDICHAM_V_185:
        return copy(MEDICHAM_V_83, this);
      case MEDICHAM_V_186:
        return copy(MEDICHAM_V_83, this);
      case LYCANROC_V_187:
        return copy(LYCANROC_V_91, this);
      case UMBREON_V_188:
        return copy(UMBREON_V_94, this);
      case UMBREON_V_189:
        return copy(UMBREON_V_94, this);
      case GARBODOR_V_190:
        return copy(GARBODOR_V_100, this);
      case DRAGONITE_V_191:
        return copy(BlueSkyStream.DRAGONITE_V_42, this);
      case DRAGONITE_V_192:
        return copy(DRAGONITE_V_191, this);
      case RAYQUAZA_V_193:
        return copy(RAYQUAZA_V_110, this);
      case RAYQUAZA_V_194:
        return copy(RAYQUAZA_V_110, this);
      case NOIVERN_V_195:
        return copy(NOIVERN_V_117, this);
      case NOIVERN_V_196:
        return copy(NOIVERN_V_117, this);
      case DURALUDON_V_197:
        return copy(DURALUDON_V_122, this);
      case DURALUDON_V_198:
        return copy(DURALUDON_V_122, this);
      case AROMA_LADY_199:
        return copy(AROMA_LADY_141, this);
      case COPYCAT_200:
        return copy(COPYCAT_143, this);
      case GORDIE_201:
        return copy(GORDIE_149, this);
      case RAIHAN_202:
        return copy(RAIHAN_152, this);
      case ZINNIA_S_RESOLVE_203:
        return copy(ZINNIA_S_RESOLVE_164, this);
      case LEAFEON_VMAX_204:
        return copy(LEAFEON_VMAX_8, this);
      case LEAFEON_VMAX_205:
        return copy(LEAFEON_VMAX_8, this);
      case TREVENANT_VMAX_206:
        return copy(TREVENANT_VMAX_14, this);
      case GYARADOS_VMAX_207:
        return copy(GYARADOS_VMAX_29, this);
      case GLACEON_VMAX_208:
        return copy(GLACEON_VMAX_41, this);
      case GLACEON_VMAX_209:
        return copy(GLACEON_VMAX_41, this);
      case DRACOZOLT_VMAX_210:
        return copy(DRACOZOLT_VMAX_59, this);
      case SYLVEON_VMAX_211:
        return copy(SYLVEON_VMAX_75, this);
      case SYLVEON_VMAX_212:
        return copy(SYLVEON_VMAX_75, this);
      case LYCANROC_VMAX_213:
        return copy(LYCANROC_VMAX_92, this);
      case UMBREON_VMAX_214:
        return copy(UMBREON_VMAX_95, this);
      case UMBREON_VMAX_215:
        return copy(UMBREON_VMAX_95, this);
      case GARBODOR_VMAX_216:
        return copy(GARBODOR_VMAX_101, this);
      case RAYQUAZA_VMAX_217:
        return copy(RAYQUAZA_VMAX_111, this);
      case RAYQUAZA_VMAX_218:
        return copy(RAYQUAZA_VMAX_111, this);
      case DURALUDON_VMAX_219:
        return copy(DURALUDON_VMAX_123, this);
      case DURALUDON_VMAX_220:
        return copy(DURALUDON_VMAX_123, this);
      case AROMA_LADY_221:
        return copy(AROMA_LADY_141, this);
      case COPYCAT_222:
        return copy(COPYCAT_143, this);
      case GORDIE_223:
        return copy(GORDIE_149, this);
      case RAIHAN_224:
        return copy(RAIHAN_152, this);
      case ZINNIA_S_RESOLVE_225:
        return copy(ZINNIA_S_RESOLVE_164, this);
      case FROSLASS_226:
        return copy(ChillingReign.FROSLASS_36, this);
      case INTELEON_227:
        return copy(ChillingReign.INTELEON_43, this);
      case CRESSELIA_228:
        return copy(ChillingReign.CRESSELIA_64, this);
      case BOOST_SHAKE_229:
        return copy(BOOST_SHAKE_142, this);
      case CRYSTAL_CAVE_230:
        return copy(CRYSTAL_CAVE_144, this);
      case FULL_FACE_GUARD_231:
        return copy(FULL_FACE_GUARD_148, this);
      case STORMY_MOUNTAINS_232:
        return copy(STORMY_MOUNTAINS_161, this);
      case TOY_CATCHER_233:
        return copy(TOY_CATCHER_163, this);
      case TURFFIELD_STADIUM_234:
        return copy(RebelClash.TURRFIELD_170, this);
      case LIGHTNING_ENERGY_235:
        return basicEnergy(this, L);
      case DARKNESS_ENERGY_236:
        return basicEnergy(this, D);
      case METAL_ENERGY_237:
        return basicEnergy(this, M);
      default:
        return null;
    }
  }
}