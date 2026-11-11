package tcgwars.logic.impl.gen8

import tcgwars.logic.TargetPlayer
import tcgwars.logic.effect.Source
import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.impl.gen3.TeamRocketReturns;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.EffectPriority.*
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
  LEAFEON_VMAX_8("Leafeon VMAX", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  PETILIL_9("Petilil", "9", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LILLIGANT_10("Lilligant", "10", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  DWEBBLE_11("Dwebble", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CRUSTLE_12("Crustle", "12", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  TREVENANT_V_13("Trevenant V", "13", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TREVENANT_VMAX_14("Trevenant VMAX", "14", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  GOSSIFLEUR_15("Gossifleur", "15", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_16("Eldegoss", "16", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  APPLIN_17("Applin", "17", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  FLAREON_VMAX_18("Flareon VMAX", "18", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _FIRE_]),
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
  GYARADOS_VMAX_29("Gyarados VMAX", "29", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  VAPOREON_VMAX_30("Vaporeon VMAX", "30", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _WATER_]),
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
  GLACEON_VMAX_41("Glaceon VMAX", "41", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  TYMPOLE_42("Tympole", "42", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CRYOGONAL_43("Cryogonal", "43", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BERGMITE_44("Bergmite", "44", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  AVALUGG_45("Avalugg", "45", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  WISHIWASHI_46("Wishiwashi", "46", Rarity.RARE, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  EISCUE_47("Eiscue", "47", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  ARCTOVISH_V_48("Arctovish V", "48", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  PIKACHU_49("Pikachu", "49", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_50("Raichu", "50", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  JOLTEON_VMAX_51("Jolteon VMAX", "51", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  CHINCHOU_52("Chinchou", "52", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  LANTURN_53("Lanturn", "53", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  MAREEP_54("Mareep", "54", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_55("Flaaffy", "55", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  AMPHAROS_56("Ampharos", "56", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _LIGHTNING_]),
  EMOLGA_57("Emolga", "57", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DRACOZOLT_V_58("Dracozolt V", "58", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  DRACOZOLT_VMAX_59("Dracozolt VMAX", "59", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  REGIELEKI_60("Regieleki", "60", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  DROWZEE_61("Drowzee", "61", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HYPNO_62("Hypno", "62", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  GALARIAN_ARTICUNO_63("Galarian Articuno", "63", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  ESPEON_V_64("Espeon V", "64", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ESPEON_VMAX_65("Espeon VMAX", "65", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  WOBBUFFET_66("Wobbuffet", "66", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _PSYCHIC_]),
  SABLEYE_67("Sableye", "67", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOOBAT_68("Woobat", "68", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWOOBAT_69("Swoobat", "69", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  GOLURK_V_70("Golurk V", "70", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _PSYCHIC_]),
  FLABEBE_71("Flabébé", "71", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _PSYCHIC_]),
  FLOETTE_72("Floette", "72", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _PSYCHIC_]),
  FLORGES_73("Florges", "73", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_V_74("Sylveon V", "74", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_VMAX_75("Sylveon VMAX", "75", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _PSYCHIC_]),
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
  LYCANROC_VMAX_92("Lycanroc VMAX", "92", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  GALARIAN_MOLTRES_93("Galarian Moltres", "93", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  UMBREON_V_94("Umbreon V", "94", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  UMBREON_VMAX_95("Umbreon VMAX", "95", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  NUZLEAF_96("Nuzleaf", "96", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  SHIFTRY_97("Shiftry", "97", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _DARKNESS_]),
  SCRAGGY_98("Scraggy", "98", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SCRAFTY_99("Scrafty", "99", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  GARBODOR_V_100("Garbodor V", "100", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GARBODOR_VMAX_101("Garbodor VMAX", "101", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  ZORUA_102("Zorua", "102", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ZOROARK_103("Zoroark", "103", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  NICKIT_104("Nickit", "104", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_105("Thievul", "105", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  ALTARIA_106("Altaria", "106", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  BAGON_107("Bagon", "107", Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  SHELGON_108("Shelgon", "108", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DRAGON_]),
  SALAMENCE_109("Salamence", "109", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _DRAGON_]),
  RAYQUAZA_V_110("Rayquaza V", "110", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _DRAGON_]),
  RAYQUAZA_VMAX_111("Rayquaza VMAX", "111", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _DRAGON_]),
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
  DURALUDON_VMAX_123("Duraludon VMAX", "123", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DRAGON_]),
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
  DIGGING_GLOVES_145("Digging Gloves", "145", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  DREAM_BALL_146("Dream Ball", "146", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ELEMENTAL_BADGE_147("Elemental Badge", "147", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FULL_FACE_GUARD_148("Full Face Guard", "148", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  GORDIE_149("Gordie", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LUCKY_ICE_POP_150("Lucky Ice Pop", "150", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MOON_SUN_BADGE_151("Moon & Sun Badge", "151", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  RAIHAN_152("Raihan", "152", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_153("Rapid Strike Scroll of the Flying Dragon", "153", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL, RAPID_STRIKE]),
  RESCUE_CARRIER_154("Rescue Carrier", "154", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RIBBON_BADGE_155("Ribbon Badge", "155", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  RUBBER_GLOVES_156("Rubber Gloves", "156", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SHOPPING_CENTER_157("Shopping Center", "157", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SINGLE_STRIKE_SCROLL_OF_THE_FANGED_DRAGON_158("Single Strike Scroll of the Fanged Dragon", "158", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL, SINGLE_STRIKE]),
  SNOW_LEAF_BADGE_159("Snow Leaf Badge", "159", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SPIRIT_MASK_160("Spirit Mask", "160", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
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
  LEAFEON_VMAX_204("Leafeon VMAX", "204", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  LEAFEON_VMAX_205("Leafeon VMAX", "205", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  TREVENANT_VMAX_206("Trevenant VMAX", "206", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  GYARADOS_VMAX_207("Gyarados VMAX", "207", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  GLACEON_VMAX_208("Glaceon VMAX", "208", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  GLACEON_VMAX_209("Glaceon VMAX", "209", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  DRACOZOLT_VMAX_210("Dracozolt VMAX", "210", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  SYLVEON_VMAX_211("Sylveon VMAX", "211", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _PSYCHIC_]),
  SYLVEON_VMAX_212("Sylveon VMAX", "212", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _PSYCHIC_]),
  LYCANROC_VMAX_213("Lycanroc VMAX", "213", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  UMBREON_VMAX_214("Umbreon VMAX", "214", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  UMBREON_VMAX_215("Umbreon VMAX", "215", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  GARBODOR_VMAX_216("Garbodor VMAX", "216", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  RAYQUAZA_VMAX_217("Rayquaza VMAX", "217", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _DRAGON_]),
  RAYQUAZA_VMAX_218("Rayquaza VMAX", "218", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _DRAGON_]),
  DURALUDON_VMAX_219("Duraludon VMAX", "219", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DRAGON_]),
  DURALUDON_VMAX_220("Duraludon VMAX", "220", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DRAGON_]),
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
  FULL_FACE_GUARD_231("Full Face Guard", "231", Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
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
    return this.name();
  }

  @Override
  Card getImplementation() {
    switch (this) {
      case PINSIR_1:
        return basic(this, hp: HP120, type: G, retreatCost: 2) {
          weakness FIRE
          bwAbility "Vise Coach", {
            text "Damage from your Single Strike Pokémon's attacks isn't affected by your opponent's Active Pokémon's Resistance."
            delayedA {
              before APPLY_RESISTANCE, {
                if (ef.attacker.owner == self.owner && ef.attacker.singleStrike) {
                  bc text
                  prevent()
                }
              }
            }
          }
          move "Seismic Toss", {
            text "110 damage. "
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 110
            }
          }
        };
      case HOPPIP_2:
        return basic(this, hp: HP040, type: G, retreatCost: 0) {
          weakness FIRE
          move "Continuous Spin", {
            text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
            energyCost GRASS
            onAttack {
              flipUntilTails {
                damage 20
              }
            }
          }
        };
      case SKIPLOOM_3:
        return evolution(this, from: "Hoppip", hp: HP060, type: G, retreatCost: 0) {
          weakness FIRE
          bwAbility "Solar Evolution", {
            text "When you attach an Energy card from your hand to this Pokémon during your turn, you may search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND
                  && bg.currentTurn == self.owner
                  && self.owner.pbg.deck
                  && confirm("Use $thisAbility?")) {
                  powerUsed()
                  def list = deck.search text, {
                    it.cardTypes.is(EVOLUTION) && it.predecessor == self.name
                  }
                  list.each {
                    evolve self, it
                  }
                  shuffleDeck()
                }
              }
            }
          }
          move "Spinning Attack", {
            text "20 damage. "
            energyCost GRASS
            onAttack {
              damage 20
            }
          }
        };
      case JUMPLUFF_4:
        return evolution(this, from: "Skiploom", hp: HP090, type: G, retreatCost: 0) {
          weakness FIRE
          bwAbility "Fluffy Barrage", {
            text "This Pokémon may attack twice each turn. If the first attack Knocks Out your opponent's Active Pokémon, you may attack again after your opponent chooses a new Active Pokémon."
            ancient_trait_omega_barrage self, delegate
          }
          move "Spinning Attack", {
            text "60 damage. "
            energyCost GRASS
            onAttack {
              damage 60
            }
          }
        };
      case SEEDOT_5:
        return basic(this, hp: HP050, type: G, retreatCost: 1) {
          weakness FIRE
          move "Astonish", {
            text "10 damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 10
              afterDamage {
                astonish()
              }
            }
          }
        };
      case TROPIUS_6:
        return basic(this, hp: HP110, type: G, retreatCost: 1) {
          weakness FIRE
          move "Rally Back", {
            text "30+ damage. If any of your Pokémon were Knocked Out by damage from an attack from your opponent's Pokémon during their last turn, this attack does 90 more damage."
            energyCost GRASS, COLORLESS
            onAttack {
              damage 30
              if (my.lastKnockoutByOpponentDamageTurn == opp.lastTurnCount)
                damage 90
            }
          }
          move "Solar Beam", {
            text "100 damage. "
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 100
            }
          }
        };
      case LEAFEON_V_7:
        return basic(this, hp: HP200, type: G, retreatCost: 1) {
          weakness FIRE
          bwAbility "Greening Cells", {
            text "Once during your turn, you may search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              assert deck : "Your deck is empty"
              powerUsed()
              attachEnergyFrom type:G, deck, my.all
              usingThisAbilityEndsTurn delegate
            }
          }
          move "Leaf Blade", {
            text "90+ damage. Flip a coin. If heads, this attack does 60 more damage."
            energyCost GRASS, COLORLESS, COLORLESS
            onAttack {
              damage 90
              flip { damage 60 }
            }
          }
        };
      case LEAFEON_VMAX_8:
        return evolution(this, from: "Leafeon V", hp: HP310, type: G, retreatCost: 2) {
          weakness FIRE
          move "Grass Knot", {
            text "60× damage. This attack does 60 damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost GRASS, COLORLESS
            attackRequirement {
              assert defending.retreatCost : "Opponent's Active Pokémon has no Retreat Cost"
            }
            onAttack {
              damage 60 * defending.retreatCost
            }
          }
          move "Max Leaf", {
            text "170 damage. Heal 30 damage from this Pokémon."
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 170
              heal 30, self
            }
          }
        };
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
        return basic(this, hp: HP210, type: G, retreatCost: 2) {
          weakness FIRE
          move "Absorb Life", {
            text "30 damage. Heal 30 damage from this Pokémon."
            energyCost GRASS, COLORLESS
            onAttack {
              damage 30
              heal 30, self
            }
          }
          move "Shadow Claw", {
            text "120 damage. Discard a random card from your opponent's hand."
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 120
              afterDamage {
                discardRandomCardFromOpponentsHand()
              }
            }
          }
        };
      case TREVENANT_VMAX_14:
        return evolution(this, from: "Trevenant V", hp: HP320, type: G, retreatCost: 3) {
          weakness FIRE
          move "Missing in the Forest", {
            text "40× damage. This attack does 40 damage for each Supporter card in your opponent's discard pile."
            energyCost GRASS, COLORLESS
            attackRequirement {
              assert opp.discard.any { it.cardTypes.is(SUPPORTER) } : "No Supporter cards in your opponent's discard pile"
            }
            onAttack {
              damage 40 * opp.discard.findAll({ it.cardTypes.is(SUPPORTER) }).size()
            }
          }
          move "Max Tree", {
            text "180 damage. "
            energyCost GRASS, GRASS, COLORLESS
            onAttack {
              damage 180
            }
          }
        };
      case GOSSIFLEUR_15:
        return basic(this, hp: HP050, type: G, retreatCost: 1) {
          weakness FIRE
          move "Blot", {
            text "10 damage. Heal 10 damage from this Pokémon."
            energyCost GRASS
            onAttack {
              damage 10
              heal 10, self
            }
          }
        };
      case ELDEGOSS_16:
        return evolution(this, from: "Gossifleur", hp: HP080, type: G, retreatCost: 1) {
          weakness FIRE
          bwAbility "Cotton Lift", {
            text "Once during your turn, you may search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            actionA {
              checkLastTurn()
              assert deck : "Your deck is empty"
              powerUsed()
              def cards = deck.search max:2, cardTypeFilter(BASIC_ENERGY)
              cards.showToOpponent bg, text
              cards.moveTo hand
            }
          }
          move "Cotton Guard", {
            text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost GRASS
            onAttack {
              damage 30
              reduceDamageNextTurn hp(30), thisMove
            }
          }
        };
      case APPLIN_17:
        return basic(this, hp: HP040, type: G, retreatCost: 1) {
          weakness FIRE
          move "Rollout", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
        };
      case FLAREON_VMAX_18:
        return evolution(this, from: "Flareon V", hp: HP320, type: R, retreatCost: 2) {
          weakness WATER
          move "Max Detonate", {
            text "100× damage. Discard the top 5 cards of your deck. This attack does 100 damage for each Energy card you discarded in this way."
            energyCost FIRE, COLORLESS, COLORLESS
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def list = my.deck.subList(0, 5).discard()
              damage 100 * list.filterByType(ENERGY).size()
            }
          }
        };
      case ENTEI_19:
        return basic(this, hp: HP120, type: R, retreatCost: 2) {
          weakness WATER
          move "Angry Fang", {
            text "10× damage. This attack does 10 damage for each damage counter on all of your Benched Single Strike Pokémon."
            energyCost FIRE, COLORLESS
            attackRequirement {
              assert my.bench.any { it.singleStrike && it.numberOfDamageCounters } : "No Single Strike Pokémon on your Bench have damage counters on them"
            }
            onAttack {
              damage 10 * my.bench.sum { it.singleStrike ? it.numberOfDamageCounters : 0 }
            }
          }
          move "Heat Tackle", {
            text "120 damage. This Pokémon also does 30 damage to itself."
            energyCost FIRE, FIRE, COLORLESS
            onAttack {
              damage 120
              damage 30, self
            }
          }
        };
      case VICTINI_20:
        return basic(this, hp: HP060, type: R, retreatCost: 1) {
          weakness WATER
          move "Victory Dive", {
            text "30 damage. You may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
              if (my.deck && confirm("Search your deck for up to 2 cards?")) {
                def list = deck.search min:1, max:2, { true }
                list.moveTo hidden:true, my.hand
                shuffleDeck()
              }
            }
          }
        };
      case VOLCARONA_V_21:
        return basic(this, hp: HP210, type: R, retreatCost: 2) {
          weakness WATER
          move "Surging Flames", {
            text "20+ damage. This attack does 20 more damage for each basic Energy card in your discard pile. Then, shuffle those Energy cards into your deck."
            energyCost FIRE
            onAttack {
              def list = my.discard.findAll { BASIC_ENERGY in it.cardTypes }
              damage 20 + 20 * list.size()
              afterDamage {
                if (list.notEmpty()) {
                  list.moveTo my.deck
                  shuffleDeck()
                }
              }
            }
          }
          move "Fire Blast", {
            text "160 damage. Discard an Energy from this Pokémon."
            energyCost FIRE, FIRE, COLORLESS
            onAttack {
              damage 160
              discardSelfEnergyAfterDamage()
            }
          }
        };
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
        return basic(this, hp: HP220, type: W, retreatCost: 3) {
          weakness LIGHTNING
          move "Get Angry", {
            text "20× damage. This attack does 20 damage for each damage counter on this Pokémon."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {
              assert self.numberOfDamageCounters : "No damage counters on $self"
            }
            onAttack {
              damage 20 * self.numberOfDamageCounters
            }
          }
          move "Heavy Storm", {
            text "180 damage. "
            energyCost WATER, WATER, WATER, COLORLESS
            onAttack {
              damage 180
            }
          }
        };
      case GYARADOS_VMAX_29:
        return evolution(this, from: "Gyarados V", hp: HP330, type: W, retreatCost: 4) {
          weakness LIGHTNING
          move "Hyper Beam", {
            text "120 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost WATER, WATER, COLORLESS
            onAttack {
              damage 120
              discardDefendingEnergyAfterDamage()
            }
          }
          move "Max Tyrant", {
            text "240 damage. "
            energyCost WATER, WATER, WATER, COLORLESS
            onAttack {
              damage 240
            }
          }
        };
      case VAPOREON_VMAX_30:
        return evolution(this, from: "Vaporeon V", hp: HP320, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Bubble Pod", {
            text "Put a [W] Pokémon from your discard pile onto your Bench. If you do, attach up to 3 [W] Energy cards from your discard pile to that Pokémon."
            energyCost COLORLESS
            def cl1 = {
              my.discard.findAll{it.cardTypes.is(POKEMON) && !it.cardTypes.isIn(BREAK, LVL_X, LEGEND, V_UNION) && it.types.contains(W)}
            }
            attackRequirement {
              assert cl1() : "No [W] Pokémon in your discard pile"
              assert my.bench.notFull : "Bench full"
            }
            onAttack {
              def pcs = benchPCS(cl1().select("Put to bench").first())
              if (pcs) {
                attachEnergyFrom(max: 3, may: true, type: W, my.discard, pcs)
              }
            }
          }
          move "Max Torrent", {
            text "100+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 100 more damage."
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 100
              if (opp.active.numberOfDamageCounters) damage 100
            }
          }
        };
      case SUICUNE_V_31:
        return basic(this, hp: HP210, type: W, retreatCost: 2) {
          weakness LIGHTNING
          bwAbility "Fleet-Footed", {
            text "Once during your turn, if this Pokémon is in the Active Spot, you may draw a card."
            actionA {
              checkLastTurn()
              assert self.active : "$self must be in the Active Spot"
              assert deck : "Deck is empty"
              powerUsed()
              draw 1
            }
          }
          move "Blizzard Rondo", {
            text "20+ damage. This attack does 20 more damage for each Benched Pokémon (both yours and your opponent's)."
            energyCost WATER, COLORLESS
            onAttack {
              damage 20 + 20 * all.findAll { it.benched }.size()
            }
          }
        };
      case LOTAD_32:
        return basic(this, hp: HP060, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
            energyCost COLORLESS
            callForFamily basic: true, 2, delegate
          }
          move "Rain Splash", {
            text "20 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case LOMBRE_33:
        return evolution(this, from: "Lotad", hp: HP090, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Wave Splash", {
            text "50 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 50
            }
          }
        };
      case LUDICOLO_34:
        return evolution(this, from: "Lombre", hp: HP140, type: W, retreatCost: 2) {
          weakness LIGHTNING
          bwAbility "Enthusiastic Dance", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may use this Ability. During this turn, your Basic Pokémon's attacks do 100 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
            onActivate {r->
              if(r == PLAY_FROM_HAND && confirm("Use Enthusiastic Dance?")) {
                powerUsed()
                delayed {
                  after PROCESS_ATTACK_EFFECTS, {
                    bg.dm().each {if (
                    it.to.active
                      && it.from.basic
                      && it.from.owner == thisCard.player
                      && it.to.owner != it.from.owner
                      && it.dmg.value) {
                      bc "$thisAbility.name +100"
                      it.dmg += hp 100
                    }}
                  }
                  unregisterAfter 1
                }
              }
            }
          }
          move "Wave Splash", {
            text "120 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 120
            }
          }
        };
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
        return basic(this, hp: HP030, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Flail Around", {
            text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
            energyCost WATER
            onAttack {
              flip 3, { damage 10 }
            }
          }
        };
      case MILOTIC_38:
        return evolution(this, from: "Feebas", hp: HP120, type: W, retreatCost: 2) {
          weakness LIGHTNING
          bwAbility "Dew Guard", {
            text "Whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to you or your hand."
            def messageDisplayed = false
            onActivate {
              if (!messageDisplayed) {
                bc "$thisAbility is not impelmented."
                messageDisplayed = true
              }
            }
          }
          move "Double Smash", {
            text "70× damage. Flip 2 coins. This attack does 70 damage for each heads."
            energyCost WATER, COLORLESS
            onAttack {
              flip 2, { damage 70 }
            }
          }
        };
      case LUVDISC_39:
        return basic(this, hp: HP070, type: W, retreatCost: 1) {
          weakness LIGHTNING
          move "Synchrodraw", {
            text "Shuffle your hand into your deck. Then, draw a card for each card in your opponent's hand."
            energyCost COLORLESS
            attackRequirement {
              assert hand || deck : "Hand and deck are empty"
            }
            onAttack {
              hand.moveTo hidden:true, deck
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
        return basic(this, hp: HP210, type: W, retreatCost: 2) {
          weakness METAL
          move "Frozen Awakening", {
            text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            energyCost WATER
            ascension delegate
          }
          move "Heavy Snow", {
            text "120 damage. Discard a Stadium in play."
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 120
              afterDamage {
                discardStadium()
              }
            }
          }
        };
      case GLACEON_VMAX_41:
        return evolution(this, from: "Glaceon V", hp: HP310, type: W, retreatCost: 2) {
          weakness METAL
          bwAbility "Crystal Veil", {
            text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon VMAX, except any Glaceon VMAX."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  def info = "$thisAbility prevents all damage from Pokémon VMAX, except Glaceon VMAX"
                  def filter = { attacker -> attacker.pokemonVMAX && !attacker.name.equals("Glaceon VMAX") }
                  if (it.to == self && it.from.owner != self.owner && filter(it.from) && it.notNoEffect && it.dmg.value) {
                    bc info
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Max Icicle", {
            text "150 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 150
              if (opp.bench) {
                damage 30, opp.bench.select(text)
              }
            }
          }
        };
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
        return basic(this, hp: HP090, type: W, retreatCost: 1) {
          weakness METAL
          move "Element Chain", {
            text "Look at the top 6 cards of your deck and attach any number of basic Energy cards you find there to your Pokémon in any way you like. Shuffle the other cards back into your deck."
            energyCost WATER
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def top6List = my.deck.subList 0, 6
              def numberOfBasicEnergy = top6List.findAll { BASIC_ENERGY in it.cardTypes }.size()
              def selectedEnergyList = top6List.select text, 0, numberOfBasicEnergy, null, { BASIC_ENERGY in it.cardTypes }, { true}
              selectedEnergyList.each {
                attachEnergy my.all.select("Attach $it.name to?"), it
              }
              shuffleDeck()
            }
          }
          move "Icy Snow", {
            text "30 damage. "
            energyCost WATER, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
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
        return basic(this, hp: HP030, type: W, retreatCost: 1) {
          weakness LIGHTNING
          bwAbility "Group Power", {
            text "If this Pokémon has 3 or more [W] Energy attached, it gets +150 HP."
            getterA GET_FULL_HP, self, { holder ->
              if (self.cards.energyCount(W) >= 3) {
                holder.object += hp 150
              }
            }
          }
          move "Schooling Shot", {
            text "30+ damage. This attack does 30 more damage for each basic Energy attached to this Pokémon."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
              damage 30 * self.cards.basicEnergyCardCount()
            }
          }
        };
      case EISCUE_47:
        return basic(this, hp: HP120, type: W, retreatCost: 2) {
          weakness METAL
          move "Icy Snow", {
            text "20 damage. "
            energyCost WATER
            onAttack {
              damage 20
            }
          }
          move "Blockface", {
            text "70 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon."
            energyCost WATER, COLORLESS, COLORLESS
            onAttack {
              damage 70
              preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.basic }
            }
          }
        };
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
        return basic(this, hp: HP060, type: L, retreatCost: 1) {
          weakness FIGHTING
          move "Energize", {
            text "Attach a [L] Energy card from your discard pile to this Pokémon."
            energyCost LIGHTNING
            attackRequirement {
              assert my.discard.energyCount(L) : "Your discard pile has no [L] Energy cards"
            }
            onAttack {
              attachEnergyFrom type:L, my.discard, self
            }
          }
          move "Electro Ball", {
            text "30 damage. "
            energyCost LIGHTNING, COLORLESS, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
      case RAICHU_50:
        return evolution(this, from: "Pikachu", hp: HP130, type: L, retreatCost: 2) {
          weakness FIGHTING
          move "Big Sparking", {
            text "This attack does 50 damage to each Pokémon V and Pokémon-GX (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost LIGHTNING
            attackRequirement {
              assert all.any { it.pokemonV || it.pokemonGX } : "No Pokémon V or Pokémon-GX in play"
            }
            onAttack {
              all.findAll { it.pokemonV || it.pokemonGX }.each {
                damage 50, it
              }
            }
          }
          move "Thunderbolt", {
            text "180 damage. Discard all Energy from this Pokémon."
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            onAttack {
              damage 180
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }
        };
      case JOLTEON_VMAX_51:
        return evolution(this, from: "Jolteon V", hp: HP300, type: L, retreatCost: 0) {
          weakness FIGHTING
          move "Max Thunder Rumble", {
            text "100 damage. This attack also does 100 damage to 1 of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost LIGHTNING, COLORLESS
            onAttack {
              damage 100
              def targets = opp.bench.findAll{ it.numberOfDamageCounters }
              if (targets) {
                damage 100, targets.select("Deal 100 damage to?")
              }
            }
          }
        };
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
        return basic(this, hp: HP060, type: L, retreatCost: 1) {
          weakness FIGHTING
          move "Rear Kick", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
          move "Electro Ball", {
            text "30 damage. "
            energyCost LIGHTNING, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
      case FLAAFFY_55:
        return evolution(this, from: "Mareep", hp: HP090, type: L, retreatCost: 2) {
          weakness FIGHTING
          bwAbility "Dynamotor", {
            text "Once during your turn (before your attack), you may attach a [L] Energy card from your discard pile to 1 of your Benched Pokémon."
            actionA {
              checkLastTurn()
              assert my.discard.filterByEnergyType(L) : "No [L] Energy card in your discard pile"
              assert my.bench : "You have no Benched Pokémon"
              powerUsed()
              def list = my.discard.filterByEnergyType(L).select("Choose a [L] Energy Card to attach")
              attachEnergy(my.bench.select(), list.first())
            }
          }
          move "Electro Ball", {
            text "50 damage. "
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            onAttack {
              damage 50
            }
          }
        };
      case AMPHAROS_56:
        return evolution(this, from: "Flaaffy", hp: HP150, type: L, retreatCost: 2) {
          weakness FIGHTING
          move "Thunder Shock", {
            text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost LIGHTNING
            onAttack {
              damage 40
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Electron Crush", {
            text "100+ damage. You may discard 3 [L] Energy from this Pokémon. If you do, this attack does 120 more damage."
            energyCost LIGHTNING, LIGHTNING, LIGHTNING, COLORLESS
            onAttack {
              damage 100
              if(self.cards.energyCount(L) >= 3 && confirm ("Discard 3 [L] Energy from $self to deal 120 more damage?")) {
                damage 120
                discardSelfEnergyAfterDamage L, L, L
              }
            }
          }
        };
      case EMOLGA_57:
        return basic(this, hp: HP070, type: L, retreatCost: 0) {
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
                  after CHANGE_STAGE, pcs, {unregister()}
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
        return basic(this, hp: HP120, type: L, retreatCost: 2) {
          weakness FIGHTING
          move "Static Shock", {
            text "20 damage. "
            energyCost COLORLESS
            onAttack {
              damage 20
            }
          }
          move "Teraspark", {
            text "120 damage. Discard all [L] Energy from this Pokémon. This attack also does 40 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
              multiDamage(opp.bench, 2, 40)
              afterDamage {
                discardAllSelfEnergy(L)
              }
            }
          }
        };
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
        return basic(this, hp: HP120, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Cruel Charge", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [P] Energy cards from your hand to this Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(P) && confirm("Use $thisAbility.name?")) {
                powerUsed()
                attachEnergyFrom max:2, type: P, my.hand, self
              }
            }
          }
          move "Psylaser", {
            text "Discard all [P] Energy from this Pokémon. This attack does 120 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost PSYCHIC, PSYCHIC, COLORLESS
            onAttack {
              damage 120, opp.all.select("This attack does 120 damage to 1 of your opponent's Pokémon.")
              afterDamage {
                self.cards.filterByEnergyType(P).discard()
              }
            }
          }
        };
      case ESPEON_V_64:
        return basic(this, hp: HP200, type: P, retreatCost: 1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Zen Shot", {
            text "This attack does 60 damage to 1 of your opponent's Pokémon V. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost PSYCHIC
            attackRequirement {
              assert opp.all.any { it.pokemonV } : "Opponent has no Pokémon V"
            }
            onAttack {
              damage 60, opp.all.findAll { it.pokemonV }.select(text)
            }
          }
          move "Super Psy Bolt", {
            text "120 damage. "
            energyCost PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              damage 120
            }
          }
        };
      case ESPEON_VMAX_65:
        return evolution(this, from: "Espeon V", hp: HP310, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Solar Revelation", {
            text "Prevent all effects of attacks from your opponent's Pokémon done to all of your Pokémon that have Energy attached.(Existing effects are not removed. Damage is not an effect.)"
            // The opponent's attacks used while Solar Revelation works, each with the Pokémon that had Energy attached then: it
            // goes on preventing their lasting effects on those Pokémon (a getter is only judged later). A lasting effect done to
            // a Pokémon without Energy, or while Solar Revelation didn't work, stays ("Existing effects are not removed"), like
            // Photon Barrier (Mewtwo V-UNION SWSH159).
            def protectedFrom = [:]
            delayedA {
              before ATTACK_MAIN, {
                if (ef.attacker.owner == self.owner.opposite) protectedFrom[ef] = self.owner.pbg.all.findAll { it.cards.energyCount(C) } as Set
              }
              before null, null, Source.ATTACK, {
                def pcs = e.getTargetPokemon()
                def attack = e.sourceAttack
                // only the opponent's attacks: your own attacks (their use included) aren't stopped
                if (pcs && pcs.owner == self.owner && ef.effectType != DAMAGE && attack?.attacker?.owner == self.owner.opposite
                  && (attack == bg.em().findAttack() ? pcs.cards.energyCount(C) : protectedFrom[attack]?.contains(pcs))) {
                  if (!(ef instanceof tcgwars.logic.effect.getter.GetterEffect)) bc "Espeon VMAX's Solar Revelation prevents effect."
                  prevent()
                }
              }
            }
          }
          move "Max Mindstorm", {
            text "60× damage. This attack does 60 damage for each Energy attached to all of your opponent's Pokémon."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              int count = opp.all.sum { it.cards.energyCount(C) }
              damage 60 * count
            }
          }
        };
      case WOBBUFFET_66:
        return basic(this, hp: HP120, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Mirror Pain", {
            text "Put damage counters on your opponent's Active Pokémon equal to the number of damage counters on 1 of your Benched Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assert my.bench.any { it.numberOfDamageCounters } : "No damage counters on your Benched Pokémon"
            }
            onAttack {
              def info = "Pokémon with damage counters on your bench. That number of damage counters will be put on your opponent's Active Pokémon."
              def source = bench.findAll { it.numberOfDamageCounters }.select info
              directDamage source.numberOfDamageCounters * 10, defending
            }
          }
          move "Headbutt Bounce", {
            text "70 damage. "
            energyCost PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              damage 70
            }
          }
        };
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
        return basic(this, hp: HP220, type: P, retreatCost: 3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Mega Punch", {
            text "80 damage. "
            energyCost PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              damage 80
            }
          }
          move "Rewind Beam", {
            text "180 damage. If your opponent's Active Pokémon is an evolved Pokémon, devolve it by putting the highest Stage Evolution card on it into your opponent's hand."
            energyCost PSYCHIC, PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              damage 180
              afterDamage {
                if (defending.evolution) {
                  devolve defending, defending.owner.pbg.hand
                }
              }
            }
          }
        };
      case FLABEBE_71:
        return basic(this, hp: HP040, type: P, retreatCost: 1) {
          weakness METAL
          move "Hypnotic Gaze", {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost PSYCHIC
            attackRequirement {
              assert !defending.specialConditions.contains(ASLEEP) : "Opponent's Active Pokémon is already Asleep"
            }
            onAttack {
              apply ASLEEP
            }
          }
        };
      case FLOETTE_72:
        return evolution(this, from: "Flabébé", hp: HP070, type: P, retreatCost: 1) {
          weakness METAL
          move "Fairy Wind", {
            text "20 damage. "
            energyCost PSYCHIC
            onAttack {
              damage 20
            }
          }
          move "Double Spin", {
            text "50× damage. Flip 2 coins. This attack does 50 damage for each heads."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              flip 2, { damage 50 }
            }
          }
        };
      case FLORGES_73:
        return evolution(this, from: "Floette", hp: HP130, type: P, retreatCost: 2) {
          weakness METAL
          bwAbility "Rapid Strike Connection", {
            text "As often as you like during your turn, you may move an Energy from 1 of your Pokémon to 1 of your Rapid Strike Pokémon."
            actionA {
              assert my.all.any { it.rapidStrike } : "You have no Rapid Strike Pokémon in play"
              assert my.all.any { it.cards.energyCount C } : "You have no Pokémon with Energy attached"
              powerUsed()
              moveEnergy my.all.findAll { it.cards.energyCount C }, my.all.findAll { it.rapidStrike }
            }
          }
          move "Wonder Shine", {
            text "110 damage. Your opponent's Active Pokémon is now Confused."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            onAttack {
              damage 110
              applyAfterDamage CONFUSED
            }
          }
        };
      case SYLVEON_V_74:
        return basic(this, hp: HP200, type: P, retreatCost: 1) {
          weakness METAL
          bwAbility "Dream Gift", {
            text "Once during your turn, you may search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              assert deck : "Your deck is empty"
              powerUsed()
              def card = deck.search text, { it.cardTypes.is ITEM }
              card.showToOpponent bg, text
              card.moveTo hand
              usingThisAbilityEndsTurn delegate
            }
          }
          move "Magical Shot", {
            text "60 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 60
            }
          }
        };
      case SYLVEON_VMAX_75:
        return evolution(this, from: "Sylveon V", hp: HP310, type: P, retreatCost: 2) {
          weakness METAL
          move "Precious Touch", {
            text "Attach an Energy card from your hand to 1 of your Benched Pokémon. If you do, heal 120 damage from that Pokémon."
            energyCost PSYCHIC
            attackRequirement {
              assert hand.any { it.cardTypes.is ENERGY } : "No Energy in hand"
            }
            onAttack {
              // "If you do": nothing is healed when no Energy card was attached (no Benched Pokémon, or the attachment was
              // prevented, e.g. by Honchkrow-GX UNB 109's Ruler of the Night)
              def attached = attachEnergyFrom(hand, my.bench)
              if (attached) {
                def (energy, pcs) = attached
                if (energy && pcs instanceof PokemonCardSet && pcs.cards.containsAll(energy)) {
                  heal 120, pcs
                }
              }
            }
          }
          move "Max Harmony", {
            text "70+ damage. This attack does 30 more damage for each different type of Pokémon on your Bench."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 70
              def types = [] as TypeSet
              bench.each {
                def currentTypes = it.types.findAll { !types.contains(it) }
                if (currentTypes) {
                  damage 30 * currentTypes.size()
                  types.addAll currentTypes
                }
              }
            }
          }
        };
      case PUMPKABOO_76:
        return basic(this, hp: HP060, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Pumpkin Pit", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard a Stadium in play."
            onActivate {reason ->
              if (reason == PLAY_FROM_HAND && bg().stadiumInfoStruct?.stadiumCard && confirm("Use $thisAbility.name?")) {
                powerUsed()
                discardStadium()
              }
            }
          }
          move "Stampede", {
            text "20 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
      case GOURGEIST_77:
        return evolution(this, from: "Pumpkaboo", hp: HP120, type: P, retreatCost: 2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Pandemonium", {
            text "60× damage. Reveal the top 6 cards of your deck. This attack does 60 damage for each [P] Pokémon you find there. Then, shuffle those Pokémon back into your deck and discard the other cards."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assert deck : "Deck is empty"
            }
            onAttack {
              def revealedCards = deck.subList 0, 6
              revealedCards.showToOpponent("Top 6 cards of your opponent's Deck.").showToMe("Top 6 cards of your Deck")
              def pokemonCards = revealedCards.filterByAllType POKEMON, _PSYCHIC_
              damage 60 * pokemonCards.size()
              revealedCards.getExcludedList(pokemonCards).discard()
              pokemonCards.moveTo deck
              shuffleDeck()
            }
          }
        };
      case CUTIEFLY_78:
        return basic(this, hp: HP030, type: P, retreatCost: 0) {
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
        return basic(this, hp: HP080, type: P, retreatCost: 1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Rapid Hunt", {
            text "Search your deck for up to 2 Rapid Strike cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              def cards = deck.search max:2, { it.cardTypes.is RAPID_STRIKE }
              cards.showToOpponent bg, text
              cards.moveTo hand
            }
          }
          move "Shadow Flicker", {
            text "10 damage. If the Defending Pokémon is Knocked Out during your next turn, take 1 more Prize card."
            energyCost COLORLESS
            onAttack {
              damage 10
              additionalPrizesIfDefendingKnockedOutNextTurn 1, delegate
            }
          }
        };
      case HITMONCHAN_81:
        return basic(this, hp: HP110, type: F, retreatCost: 1) {
          weakness PSYCHIC
          move "Clean Hit", {
            text "20+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 50 more damage."
            energyCost FIGHTING
            onAttack {
              damage 20
              if (defending.realEvolution) damage 50
            }
          }
          move "Bullet Straight Punch", {
            text "40 damage. This attack's damage isn't affected by Resistance."
            energyCost FIGHTING, COLORLESS
            onAttack {
              noResistanceDamage 40, defending
            }
          }
        };
      case GALARIAN_ZAPDOS_82:
        return basic(this, hp: HP110, type: F, retreatCost: 0) {
          weakness PSYCHIC
          bwAbility "Strong Legs Charge", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [F] Energy cards from your hand to this Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(F) && confirm("Use $thisAbility.name?")) {
                powerUsed()
                attachEnergyFrom max:2, type: F, my.hand, self
              }
            }
          }
          move "Zapper Kick", {
            text "70 damage. You may discard all Energy from this Pokémon. If you do, your opponent's Active Pokémon is now Paralyzed."
            energyCost FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 70
              if (self.cards.filterByType(ENERGY) && confirm("Discard all Energy from this Pokémon to paralyze the defending Pokémon?")) {
                afterDamage {
                  discardAllSelfEnergy()
                  apply PARALYZED
                }
              }
            }
          }
        };
      case MEDICHAM_V_83:
        return basic(this, hp: HP210, type: F, retreatCost: 2) {
          weakness PSYCHIC
          move "Yoga Loop", {
            text "Put 2 damage counters on 1 of your opponent's Pokémon. If your opponent's Pokémon is Knocked Out by this attack, take another turn after this one. (Skip Pokémon Checkup.) If 1 of your Pokémon used Yoga Loop during your last turn, this attack can't be used."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assert self.owner.pbg.lastTurnMove != thisMove.name : "If 1 of your Pokémon used $thisMove.name during your last turn, this attack can't be used"
            }
            onAttack {
              def tar = opp.all.select "Put 2 damage counters on 1 of your opponent's Pokemon"
              directDamage 20, tar
              afterDamage {
                if (tar.slatedToKO) {
                  delayed(priority: FIRST) {
                    before BEGIN_TURN, {
                      // BetweenTurns has already recorded the attack used this turn (lastTurnMove): Yoga Loop, or the
                      // attack that copied it, which doesn't count as Yoga Loop (official Japanese Q&A; F584)
                      takeTurnAsCurrentPlayer(delegate, ef, "$thisMove.name started a new turn!")
                    }
                  }
                }
              }
            }
          }
          move "Smash Uppercut", {
            text "100 damage. This attack's damage isn't affected by Resistance."
            energyCost FIGHTING, COLORLESS, COLORLESS
            onAttack {
              noResistanceDamage 100, defending
            }
          }
        };
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
              defendingRetreatsCostsMore defending, 1
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
        return basic(this, hp: HP200, type: F, retreatCost: 1) {
          weakness GRASS
          move "Rock Throw", {
            text "40 damage. "
            energyCost FIGHTING
            onAttack {
              damage 40
            }
          }
          move "Crashing Fangs", {
            text "200 damage. During your next turn, this Pokémon can't attack."
            energyCost FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 200
              cantAttackNextTurn self
            }
          }
        };
      case LYCANROC_VMAX_92:
        return evolution(this, from: "Lycanroc V", hp: HP320, type: F, retreatCost: 1) {
          weakness GRASS
          move "Hunting Claw", {
            text "Knock Out 1 of your opponent's Pokémon in play that has 60 HP or less remaining."
            energyCost FIGHTING
            attackRequirement {
              assert opp.all.any { it.remainingHP.value <= 60 } : "No opponent Pokémon with 60 HP or less remaining"
            }
            onAttack {
              def target = opp.all.findAll { it.remainingHP.value <= 60 }.select text
              new Knockout(target).run(bg)
            }
          }
          move "Max Edge", {
            text "190 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost FIGHTING, FIGHTING, COLORLESS
            onAttack {
              damage 190
              if (opp.bench) damage 30, opp.bench.select("This attack also does 30 damage to 1 of your opponent's Benched Pokémon.")
            }
          }
        };
      case GALARIAN_MOLTRES_93:
        return basic(this, hp: HP120, type: D, retreatCost: 2) {
          weakness GRASS
          bwAbility "Malevolent Charge", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [D] Energy cards from your hand to this Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(D) && confirm("Use $thisAbility.name?")) {
                powerUsed()
                attachEnergyFrom max:2, type: D, my.hand, self
              }
            }
          }
          move "Fiery Wrath", {
            text "20+ damage. This attack does 50 more damage for each Prize card your opponent has taken."
            energyCost DARKNESS, DARKNESS, COLORLESS
            onAttack {
              damage 20
              damage 50 * opp.prizeCardSet.takenCount
            }
          }
        };
      case UMBREON_V_94:
        return basic(this, hp: HP200, type: D, retreatCost: 2) {
          weakness GRASS
          move "Mean Look", {
            text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
            energyCost DARKNESS
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Moonlight Blade", {
            text "80+ damage. If this Pokémon has any damage counters on it, this attack does 80 more damage."
            energyCost DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 80
              if (self.numberOfDamageCounters) damage 80
            }
          }
        };
      case UMBREON_VMAX_95:
        return evolution(this, from: "Umbreon V", hp: HP310, type: D, retreatCost: 2) {
          weakness GRASS
          bwAbility "Dark Signal", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            onActivate {r->
              if (r==PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner) {
                def tar = opp.bench.select text + " Cancel to keep $opp.active the Active Pokémon.", false
                if (tar) {
                  powerUsed()
                  sw opp.active, tar, SRC_ABILITY
                }
              }
            }
          }
          move "Max Darkness", {
            text "160 damage. "
            energyCost DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 160
            }
          }
        };
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
        return basic(this, hp: HP210, type: D, retreatCost: 3) {
          weakness FIGHTING
          move "Trash Stench", {
            text "40 damage. Your opponent's Active Pokémon is now Poisoned. During your opponent's next turn, that Pokémon can't retreat."
            energyCost DARKNESS, COLORLESS
            onAttack {
              damage 40
              applyAfterDamage POISONED
              cantRetreat defending
            }
          }
          move "Sludge Bomb", {
            text "130 damage. "
            energyCost DARKNESS, DARKNESS, COLORLESS
            onAttack {
              damage 130
            }
          }
        };
      case GARBODOR_VMAX_101:
        return evolution(this, from: "Garbodor V", hp: HP330, type: D, retreatCost: 3) {
          weakness FIGHTING
          bwAbility "Rubbish Collecting", {
            text "This Pokémon may have up to 2 Pokémon Tools attached to it. If it loses this Ability, discard Pokémon Tools from it until only 1 remains."
            def key = "OMEGA_DOUBLE_"
            onActivate {
              bg.em().storeObject(key + self.hashCode(), 1) //logic is in PlayPokemonTool
            }
            onDeactivate {
              bg.em().storeObject(key + self.hashCode(), null)
              while (self.cards.filterByType(POKEMON_TOOL).size() > 1) {
                self.cards.filterByType(POKEMON_TOOL).select("Select to discard", { true }, self.owner).discard()
              }
            }
          }
          move "G-Max Malodor", {
            text "120 damage. Your opponent's Active Pokémon is now Poisoned. During your opponent's next turn, that Pokémon can't retreat."
            energyCost DARKNESS, COLORLESS
            onAttack {
              damage 120
              applyAfterDamage POISONED
              cantRetreat defending
            }
          }
        };
      case ZORUA_102:
        return basic(this, hp: HP070, type: D, retreatCost: 1) {
          weakness GRASS
          move "Rear Kick", {
            text "30 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
      case ZOROARK_103:
        return evolution(this, from: "Zorua", hp: HP120, type: D, retreatCost: 2) {
          weakness GRASS
          bwAbility "Phantom Transformation", {
            text "Once during your turn, you may choose a Stage 1 Pokémon, except any Zoroark, from your discard pile. If you do, discard this Pokémon and all attached cards, and put the chosen Pokémon in its place."
            actionA {
              checkLastTurn()
              assert my.discard.any { it.cardTypes.is(STAGE1) && it.name != "Zoroark" } : "No Stage 1 Pokémon in your discard pile"
              powerUsed()
              def newPcs = my.discard.select text, { it.cardTypes.is(STAGE1) && it.name != "Zoroark" }
              self.cards.discard()
              newPcs.moveTo self.cards
            }
          }
          move "Night Daze", {
            text "70 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 70
            }
          }
        };
      case NICKIT_104:
        return basic(this, hp: HP070, type: D, retreatCost: 1) {
          weakness GRASS
          move "Tail Whap", {
            text "30 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
            }
          }
        };
      case THIEVUL_105:
        return evolution(this, from: "Nickit", hp: HP100, type: D, retreatCost: 1) {
          weakness GRASS
          bwAbility "Fumbling Hands", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may have each player shuffle their hand and put it on the bottom of their deck. If either player put any cards on the bottom of their deck in this way, each player draws 4 cards."
            onActivate { reason ->
              def handWithoutThisCard = my.hand.getExcludedList(thisCard)
              if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && (handWithoutThisCard.notEmpty || opp.hand.notEmpty) && confirm("Use $thisAbility?")) {
                if (opp.hand){
                  bc "${opp.owner.getPlayerUsername(bg)} shuffled their hand of ${opp.hand.size()} cards, and put it at the bottom of their deck."
                  opp.hand.shuffledCopy().moveTo(suppressLog: true, opp.deck)
                } else {
                  bc "${opp.owner.getPlayerUsername(bg)} doesn't have any cards in hand, only needs to draw."
                }
                draw 4, TargetPlayer.OPPONENT

                if (handWithoutThisCard) {
                  bc "${my.owner.getPlayerUsername(bg)} shuffled their hand of ${handWithoutThisCard.size()} cards, and put it at the bottom of their deck."
                  my.hand.getExcludedList(thisCard).shuffledCopy().moveTo(suppressLog: true, my.deck)
                } else {
                  bc "${my.owner.getPlayerUsername(bg)} doesn't have any cards in hand, only needs to draw."
                }
                draw 4
              }
            }
          }
          move "Tail Smack", {
            text "60 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 60
            }
          }
        };
      case ALTARIA_106:
        return evolution(this, from: "Swablu", hp: HP090, type: N, retreatCost: 0) {
          bwAbility "Tempting Tune", {
            text "Once during your turn, you may search your deck for a Supporter card, reveal it, shuffle your deck, then put that card on top of it."
            actionA {
              checkLastTurn()
              assert deck : "Deck is empty"
              powerUsed()
              def tar = deck.search { it.cardTypes.is SUPPORTER }
              tar.showToOpponent(bg, "Supporter Card placed on top of opponent's deck")
              tar.moveTo addToTop:true, deck
            }
          }
          move "Glide", {
            text "60 damage. "
            energyCost WATER, METAL
            onAttack {
              damage 60
            }
          }
        };
      case BAGON_107:
        return basic(this, hp: HP070, type: N, retreatCost: 2) {
          move "Gnaw", {
            text "10 damage. "
            energyCost COLORLESS
            onAttack {
              damage 10
            }
          }
          move "Headbutt", {
            text "30 damage. "
            energyCost FIRE, WATER
            onAttack {
              damage 30
            }
          }
        };
      case SHELGON_108:
        return evolution(this, from: "Bagon", hp: HP090, type: N, retreatCost: 3) {
          move "Hard Roll", {
            text "50 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon."
            energyCost FIRE, WATER
            onAttack {
              damage 50
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
        };
      case SALAMENCE_109:
        return evolution(this, from: "Shelgon", hp: HP170, type: N, retreatCost: 2) {
          bwAbility "Intimidating Roar", {
            text "Once during your turn, you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
            actionA {
              checkLastTurn()
              assert opp.bench
              powerUsed()
              sw opp.active, opp.bench.oppSelect("Select new Active Pokémon."), SRC_ABILITY
            }
          }
          move "Fierce Dragon", {
            text "100+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 120 more damage."
            energyCost FIRE, WATER
            onAttack {
              damage 100
              if (defending.numberOfDamageCounters) damage 120
            }
          }
        };
      case RAYQUAZA_V_110:
        return basic(this, hp: HP210, type: N, retreatCost: 2) {
          move "Dragon Pulse", {
            text "40 damage. Discard the top 2 cards of your deck."
            energyCost LIGHTNING
            onAttack {
              damage 40
              deck.subList(0, 2).discard()
            }
          }
          move "Spiral Burst", {
            text "20+ damage. You may discard up to 2 basic [R] Energy or up to 2 basic [L] Energy from this Pokémon. This attack does 80 more damage for each card you discarded in this way."
            energyCost FIRE, LIGHTNING
            onAttack {
              damage 20
              def selectedEnergy = self.cards.select(min:0, max:2, "You may discard up to 2 basic [R] Energy or up to 2 basic [L] Energy from this Pokémon", { Card card ->
                card.cardTypes.basicEnergy && (card.containsType(R) || card.containsType(L))
              }, bg.currentTurn, { CardList list ->
                def typeMap = ["R": 0, "L": 0]
                list.each {
                  if(it.containsType(R)) typeMap.R += 1
                  else if (it.containsType(L)) typeMap.L += 1
                }
                // Cannot discard both R and L Energy https://compendium.pokegym.net/ruling/1596/
                (!typeMap.R && !typeMap.L) || (typeMap.R && !typeMap.L) || (!typeMap.R && typeMap.L)
              })

              if (selectedEnergy) {
                damage 80 * selectedEnergy.size()
                afterDamage {
                  selectedEnergy.discard()
                }
              }
            }
          }
        };
      case RAYQUAZA_VMAX_111:
        return evolution(this, from: "Rayquaza V", hp: HP320, type: N, retreatCost: 2) {
          bwAbility "Azure Pulse", {
            text "Once during your turn, you may discard your hand and draw 3 cards."
            actionA {
              checkLastTurn()
              powerUsed()
              my.hand.discard()
              draw 3
            }
          }
          move "Max Burst", {
            text "20+ damage. You may discard any amount of basic [R] Energy or any amount of basic [L] Energy from this Pokémon. This attack does 80 more damage for each card you discarded in this way."
            energyCost FIRE, LIGHTNING
            onAttack {
              damage 20
              def selectedEnergy = self.cards.select(min:0, max:self.cards.filterByType(BASIC_ENERGY).size(),
                "You may discard any amount of basic [R] Energy or any amount of basic [L] Energy from this Pokémon",
                { Card card ->
                card.cardTypes.basicEnergy && (card.containsType(R) || card.containsType(L))
              }, bg.currentTurn, { CardList list ->
                def typeMap = ["R": 0, "L": 0]
                list.each {
                  if(it.containsType(R)) typeMap.R += 1
                  else if (it.containsType(L)) typeMap.L += 1
                }
                // Cannot discard both R and L Energy https://compendium.pokegym.net/ruling/1596/
                (!typeMap.R && !typeMap.L) || (typeMap.R && !typeMap.L) || (!typeMap.R && typeMap.L)
              })

              if (selectedEnergy) {
                damage 80 * selectedEnergy.size()
                afterDamage {
                  selectedEnergy.discard()
                }
              }
            }
          }
        };
      case DIALGA_112:
        return basic(this, hp: HP130, type: N, retreatCost: 2) {
          move "Chrono Wind", {
            text "80 damage. If the Defending Pokémon is a Pokémon V, it can't attack during your opponent's next turn."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 80
              if (defending.pokemonV) {
                cantAttackNextTurn defending
              }
            }
          }
          move "Heavy Impact", {
            text "210 damage. "
            energyCost PSYCHIC, METAL, METAL, COLORLESS
            onAttack {
              damage 210
            }
          }
        };
      case DEINO_113:
        return basic(this, hp: HP060, type: N, retreatCost: 1) {
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
            energyCost DARKNESS
            callForFamily basic:true, 1, delegate
          }
          move "Bite", {
            text "30 damage. "
            energyCost PSYCHIC, DARKNESS
            onAttack {
              damage 30
            }
          }
        };
      case ZWEILOUS_114:
        return evolution(this, from: "Deino", hp: HP100, type: N, retreatCost: 2) {
          move "Bite", {
            text "40 damage. "
            energyCost PSYCHIC, DARKNESS
            onAttack {
              damage 40
            }
          }
          move "Dragon Headbutt", {
            text "100 damage. "
            energyCost PSYCHIC, DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 100
            }
          }
        };
      case HYDREIGON_115:
        return evolution(this, from: "Zweilous", hp: HP170, type: N, retreatCost: 3) {
          move "Dragon Counter", {
            text "20+ damage. This attack does 100 more damage for each Prize card your opponent took during their last turn."
            energyCost PSYCHIC, DARKNESS
            onAttack {
              damage 20
              damage 100 * bg.lastTurnTakePrize
            }
          }
          move "Pitch-Black Fangs", {
            text "210 damage. "
            energyCost PSYCHIC, DARKNESS, COLORLESS, COLORLESS
            onAttack {
              damage 210
            }
          }
        };
      case KYUREM_116:
        return basic(this, hp: HP120, type: N, retreatCost: 2) {
          move "Extreme Freeze", {
            text "60× damage. Discard any amount of [W] Energy from your Pokémon. This attack does 60 damage for each card you discarded in this way."
            energyCost WATER, WATER, METAL
            attackRequirement {
              assert my.all.any { it.cards.energyCount W } : "No Pokémon with [W] Energy attached"
            }
            onAttack {
              // the chosen Energy stays attached until it's discarded after the damage
              def chosen = new CardList()
              while (1) {
                def tar = my.all.findAll { it.cards.filterByEnergyType(W).any { !chosen.contains(it) } }
                if (!tar) break
                def pcs = tar.select("Pokémon that has [W] energy to discard. Cancel to stop", false)
                if (!pcs) break
                chosen.addAll(pcs.cards.filterByEnergyType(W).findAll { !chosen.contains(it) }.select("[W] Energy to discard"))
              }
              damage 60 * chosen.size()
              discardAfterDamage chosen
            }
          }
        };
      case NOIVERN_V_117:
        return basic(this, hp: HP200, type: N, retreatCost: 0) {
          move "Boomburst", {
            text "This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost PSYCHIC
            onAttack {
              damage 20, opp.all
            }
          }
          move "Synchro Loud", {
            text "60+ damage. If you have the same number of cards in your hand as your opponent, this attack does 120 more damage."
            energyCost PSYCHIC, DARKNESS
            onAttack {
              damage 60
              if (my.hand.size() == opp.hand.size()) damage 120
            }
          }
        };
      case ZYGARDE_118:
        return basic(this, hp: HP130, type: N, retreatCost: 2) {
          move "Bite", {
            text "30 damage. "
            energyCost COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Judgment Surge", {
            text "This attack does 40 damage to 1 of your opponent's Pokémon for each Prize card your opponent has taken. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost GRASS, FIGHTING, COLORLESS
            attackRequirement {
              assert opp.prizeCardSet.takenCount : "Opponent has not taken any Prize cards yet"
            }
            onAttack {
              def tar = opp.all.select text
              damage 40 * opp.prizeCardSet.takenCount, tar
            }
          }
        };
      case DRAMPA_119:
        return basic(this, hp: HP120, type: N, retreatCost: 2) {
          move "Corkscrew Punch", {
            text "30 damage. "
            energyCost COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Berserk", {
            text "70+ damage. If your Benched Pokémon have any damage counters on them, this attack does 90 more damage."
            energyCost WATER, FIGHTING
            onAttack {
              damage 70
              if (bench.any { it.numberOfDamageCounters }) damage 90
            }
          }
        };
      case FLAPPLE_120:
        return evolution(this, from: "Applin", hp: HP080, type: N, retreatCost: 1) {
          move "Acidic Mucus", {
            text "50× damage. This attack does 50 damage for each of your opponent's Pokémon in play that has an Ability."
            energyCost COLORLESS
            attackRequirement {
              assert opp.all.any { it.hasModernAbility() } : "None of your opponent's Pokémon has an Ability"
            }
            onAttack {
              damage 50 * opp.all.count { it.hasModernAbility() }
            }
          }
          move "Fighting Tackle", {
            text "80+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 80 more damage."
            energyCost GRASS, FIRE
            onAttack {
              damage 80
              if (defending.pokemonV) damage 80
            }
          }
        };
      case APPLETUN_121:
        return evolution(this, from: "Applin", hp: HP090, type: N, retreatCost: 3) {
          move "Thick Mucus", {
            text "70× damage. This attack does 70 damage for each Special Energy card attached to your opponent's Pokémon."
            energyCost COLORLESS
            attackRequirement {
              assert opp.all.any { it.cards.filterByType(SPECIAL_ENERGY) } : "None of your opponent's Pokémon has Special Energy attached"
            }
            onAttack {
              // each Special Energy card counts, not each Pokémon that has one
              damage 70 * opp.all.sum { it.cards.filterByType(SPECIAL_ENERGY).size() }
            }
          }
          move "Fighting Tackle", {
            text "80+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 80 more damage."
            energyCost GRASS, FIRE
            onAttack {
              damage 80
              if (defending.pokemonV) damage 80
            }
          }
        };
      case DURALUDON_V_122:
        return basic(this, hp: HP220, type: N, retreatCost: 2) {
          move "Metal Claw", {
            text "70 damage. "
            energyCost FIGHTING, METAL
            onAttack {
              damage 70
            }
          }
          move "Breaking Swipe", {
            text "140 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance)."
            energyCost FIGHTING, METAL, METAL
            onAttack {
              damage 140
              reduceDamageFromDefendingNextTurn hp(30), thisMove, defending
            }
          }
        };
      case DURALUDON_VMAX_123:
        return evolution(this, from: "Duraludon V", hp: HP330, type: N, retreatCost: 3) {
          bwAbility "Skyscraper", {
            text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon that have Special Energy attached."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.from.cards.filterByType(SPECIAL_ENERGY) && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility.name prevents damage from Pokémon with Special Energy attached."
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "G-Max Pulverization", {
            text "220 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
            energyCost FIGHTING, METAL, METAL
            onAttack {
              shredDamage 220
            }
          }
        };
      case REGIDRAGO_124:
        return basic(this, hp: HP130, type: N, retreatCost: 3) {
          move "Hammer In", {
            text "30 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
            }
          }
          move "Dragon Energy", {
            text "240- damage. This attack does 20 less damage for each damage counter on this Pokémon."
            energyCost GRASS, GRASS, FIRE
            onAttack {
              damage 240 - 20 * self.numberOfDamageCounters
            }
          }
        };
      case EEVEE_125:
        return basic(this, hp: HP070, type: C, retreatCost: 1) {
          weakness FIGHTING
          move "Vee-Search", {
            text "Search your deck for up to 3 Pokémon V, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              // deck.search shuffles the deck; the log reveals the cards put into the hand (forum 17511)
              deck.search(max: 3, { (it as Card).cardTypes.isIn POKEMON_V, VMAX, POKEMON_VSTAR }).moveTo(hand)
            }
          }
          move "Stampede", {
            text "20 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 20
            }
          }
        };
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
        return basic(this, hp: HP080, type: C, retreatCost: 1) {
          weakness FIGHTING
          move "Live Painting", {
            text "30+ damage. Reveal any number of basic Energy cards from your hand. This attack does 30 more damage for each type of basic Energy you revealed in this way."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
              def targets = my.hand.filterByType(BASIC_ENERGY)
              def cards = targets.select min:0, max:targets.size(), text
              if (cards) {
                cards.showToOpponent(bg, "Cards revealed to increase damage $thisMove does.")
                def types = [] as TypeSet
                cards.each {
                  def energyType = it.basicType
                  if (!types.contains(energyType)) {
                    damage 30
                    types.add energyType
                  }
                }
              }
            }
          }
        };
      case SLAKOTH_129:
        return basic(this, hp: HP070, type: C, retreatCost: 2) {
          weakness FIGHTING
          move "Smack 'n' Slack", {
            text "30 damage. This Pokémon is now Asleep."
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 30
              afterDamage {
                apply ASLEEP, self
              }
            }
          }
        };
      case VIGOROTH_130:
        return evolution(this, from: "Slakoth", hp: HP090, type: C, retreatCost: 1) {
          weakness FIGHTING
          move "Shatter", {
            text "20 damage. Discard a Stadium in play."
            energyCost COLORLESS
            onAttack {
              damage 20
              afterDamage {
                discardStadium()
              }
            }
          }
          move "Slash", {
            text "50 damage. "
            energyCost COLORLESS, COLORLESS
            onAttack {
              damage 50
            }
          }
        };
      case SLAKING_131:
        return evolution(this, from: "Vigoroth", hp: HP180, type: C, retreatCost: 4) {
          weakness FIGHTING
          bwAbility "Act Freely", {
            text "If a Stadium is in play, this Pokémon can't attack."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if (self.active && bg.currentTurn == self.owner && bg.stadiumInfoStruct) {
                  wcu "Act Freely prevents attacking."
                  prevent()
                }
              }
            }
          }
          move "Rout", {
            text "120+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            onAttack {
              damage 120
              damage 30 * opp.bench.size()
            }
          }
        };
      case SWABLU_132:
        return basic(this, hp: HP050, type: C, retreatCost: 1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Surprise Attack", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost COLORLESS
            onAttack {
              flip {
                damage 30
              }
            }
          }
        };
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
            delayedA (priority: BEFORE_LAST) {
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
        return supporter (this) {
          text "Draw 2 cards. If you do, your Active Pokémon recovers from all Special Conditions.\nYou may play only 1 Supporter card during your turn."
          onPlay {
            draw 2
            clearSpecialCondition active
          }
          playRequirement{
            assert deck : "Your deck is empty"
          }
        };
      case BOOST_SHAKE_142:
        return itemCard (this) {
          text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck. You can use this card during your first turn or on a Pokémon that was put into play this turn. Your turn ends.\nYou may play any number of Item cards during your turn."
          onPlay {
            def names = my.all.findAll { bg.gm().hasEvolution(it.name) }.collect { it.name }.toSet()
            def card = deck.search "Select card that evolves from any of $names", { card -> card.cardTypes.is(EVOLUTION) && card.predecessors.find {names.contains(it)} }
            if(card) {
              def list = my.all.findAll { card.first().predecessors.contains(it.name) }
              def pcs = (list.size() == 1) ? list.first() : list.select("Evolve which Pokeémon?")
              evolve pcs, card.first()
            }
            bc "${thisCard.player.getPlayerUsername(bg)}'s turn ends due to using ${thisCard}."
            bg.gm().betweenTurns()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
            assert my.all.any { bg().gm().hasEvolution it.name } : "No Pokémon that evolve in play"
          }
        };
      case COPYCAT_143:
        return copy(TeamRocketReturns.COPYCAT_83, this);
      case CRYSTAL_CAVE_144:
        return stadium (this) {
          text "Once during each player's turn, that player may heal 30 damage from each of their [M] Pokémon and [N] Pokémon."
          def lastTurn = 0
          def actions = []
          onPlay {
            actions = action(thisCard, "Stadium: $thisCard") {
              assert lastTurn != bg.turnCount : "You have already used $thisCard this turn"
              def targets = my.all.findAll { it.types.containsAny([M, N] as TypeSet) && it.numberOfDamageCounters }
              assert targets : "You have no [M] or [N] Pokémon with damage counters"
              bc "Used $thisCard"
              lastTurn = bg.turnCount
              targets.each {
                heal 30, it
              }
            }
          }
          onRemoveFromPlay{
            actions.each { bg.gm().unregisterAction(it) }
          }
        };
      case DIGGING_GLOVES_145:
        return pokemonTool (this) {
          text "The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [F] Pokémon (before applying Weakness and Resistance).\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from == self && it.to.active && it.to.owner == self.owner.opposite && it.dmg.value && it.to.types.contains(F)) {
                    it.dmg += hp(30)
                    bc "$thisCard +30"
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case DREAM_BALL_146:
        return itemCard (this) {
          text "You can play this card only if you took it as a face-down Prize card, before you put it into your hand. Search your deck for a Pokémon and put it onto your Bench. Then, shuffle your deck.\nYou may play any number of Item cards during your turn."
          initHook { Card thisCard ->
            delayed (priority: LAST) {
              after TAKE_PRIZE, {
                def owner = thisCard.player
                if (ef.card == thisCard && ef.playerType == owner && ef.takenAsFaceDown && !bg.ended
                  && owner.pbg.prizeCardSet.notEmpty && owner.pbg.hand.contains(thisCard)
                  && owner.pbg.deck.notEmpty && owner.pbg.bench.notFull
                  && confirm("You took $thisCard as a face-down Prize card. Play it before you put it into your hand?", owner)) {
                  // a Prize card can be taken during the opponent's turn too: the owner makes the choices
                  tryWithDeterministicCurrentThreadPlayerType(owner) {
                    bc "${owner.getPlayerUsername(bg)} played $thisCard"
                    // any Pokémon, Evolution Pokémon included; BREAK, LV.X, LEGEND and V-UNION cards can't be a Pokémon on their own
                    my.deck.search("Search your deck for a Pokémon and put it onto your Bench", { it.cardTypes.is(POKEMON) && !it.cardTypes.isIn(BREAK, LVL_X, LEGEND, V_UNION) }).each { benchPCS(it) }
                    shuffleDeck()
                    discard thisCard
                  }
                }
              }
            }
          }
          onPlay {}
          playRequirement {
            assert false : "You can play this card only if you took it as a face-down Prize card, before you put it into your hand"
          }
        };
      case ELEMENTAL_BADGE_147:
        return pokemonTool (this) {
          text "If the Pokémon V this card is attached to has \"Vaporeon,\" \"Jolteon,\" or \"Flareon\" in its name, its attacks cost [C] less.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = getter GET_MOVE_LIST, BEFORE_LAST, self, { h ->
              if ( self.pokemonV && ["Flareon", "Vaporeon", "Jolteon"].any{self.name.contains(it)} ) {
                def list = []
                for (move in h.object) {
                  def copy = move.shallowCopy()
                  copy.energyCost.remove C
                  list.add copy
                }
                h.object = list
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case FULL_FACE_GUARD_148:
        return pokemonTool (this) {
          text "If the Pokémon this card is attached to has no Abilities, it takes 20 less damage from attacks from your opponent's Pokémon (after applying Weakness and Resistance).\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = delayed {
              before APPLY_ATTACK_DAMAGES, {
                if(!self.hasModernAbility()) {
                  bg.dm().each{
                    if(it.to == self && it.from.owner == self.owner.opposite && it.notNoEffect && it.dmg.value) {
                      bc "$thisCard -20"
                      it.dmg -= hp(20)
                    }
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case GORDIE_149:
        return supporter (this) {
          text "Look at the top 7 cards of your deck. You may reveal any number of Energy cards you find there and put them into your hand. Shuffle the other cards back into your deck.\nYou may play only 1 Supporter card during your turn."
          onPlay {
            def top = my.deck.subList(0, 7)
            top.select(min: 0, max: top.size(), "Top 7 cards of your deck. You may reveal any number of Energy cards you find there and put them into your hand", cardTypeFilter(ENERGY))
              .showToOpponent("Gordie: Your opponent put these cards into their hand").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement {
            assert my.deck : "Your deck is empty"
          }
        };
      case LUCKY_ICE_POP_150:
        return itemCard (this) {
          text "Heal 20 damage from your Active Pokémon. If you healed any damage in this way, flip a coin. If heads, put this Lucky Ice Pop into your hand instead of the discard pile.\nYou may play any number of Item cards during your turn."
          onPlay {
            def damageBefore = my.active.damage.value
            heal 20, active
            // "If you healed any damage in this way": no coin flip when the heal was prevented (Dyna Tree Hill CRE 135)
            if (my.active.damage.value < damageBefore) {
              flip {
                delayed {
                  before DISCARD, {
                    if (ef.card == thisCard) {
                      prevent()
                      moveCard thisCard, my.hand
                      unregister()
                    }
                  }
                }
              }
            }
          }
          playRequirement {
            assert my.active.numberOfDamageCounters : "Active Pokémon has no damage counters on it"
          }
        };
      case MOON_SUN_BADGE_151:
        return pokemonTool (this) {
          text "If the Pokémon V this card is attached to has \"Espeon\" or \"Umbreon\" in its name, whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to that Pokémon.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = delayed {
              def power = false
              before PLAY_TRAINER, {
                if (ef.probe) return
                if (ef.supporter
                && bg.currentTurn == self.owner.opposite
                && bg.currentTurn.pbg.hand.contains(ef.cardToPlay)
                && (self.name.contains("Espeon") || self.name.contains("Umbreon"))
                && self.pokemonV) {
                  power = true
                }
              }
              after PLAY_TRAINER, {
                power = false
              }
              before null, self, TRAINER_CARD, {
                if (power) {
                  if (!(ef instanceof tcgwars.logic.effect.getter.GetterEffect)) bc "$thisCard.name prevents effects from Supporter cards done to $self"
                  prevent()
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case RAIHAN_152:
        return supporter (this) {
          text "You can play this card only if any of your Pokémon were Knocked Out during your opponent's last turn. Attach a basic Energy card from your discard pile to 1 of your Pokémon. If you do, search your deck for a card and put it into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn."
          onPlay {
            def (attached, to) = attachEnergyFrom(basic: true, my.discard, my.all)
            if (attached) {
              def card = deck.search count:1, { true }
              card.moveTo hidden:true, hand
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.knockoutsDuringOpponentsTurn(opp.lastTurnCount) : "None of your Pokémon were Knocked Out during your opponent's last turn"
            assert my.discard.any { it.cardTypes.is(BASIC_ENERGY) } : "No basic Energy cards in your discard pile"
          }
        };
      case RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_153:
        return pokemonTool (this) {
          text "The Rapid Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)\n[R][L] Meteor\nDiscard 2 Energy from this Pokémon. This attack does 90 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def newMove
          onPlay {reason->
            def moveBody = {
              text "Discard 2 Energy from this Pokémon. This attack does 90 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
              attackRequirement {
                // self is not set properly creating a move like this, use bg.ownActive() instead
                assert bg.ownActive().rapidStrike : "${bg.ownActive()} is not a $RAPID_STRIKE Pokémon"
              }
              energyCost FIRE, LIGHTNING
              onAttack {
                discardSelfEnergyAfterDamage C, C
                damage 90, opp.all.select text
              }
            }
            Move move = new Move("Meteor")
            moveBody.delegate = new MoveBuilder(thisMove: move)
            moveBody.call()
            newMove = getter GET_MOVE_LIST, self, {h->
              if (h.effect.target.rapidStrike) {
                def moveList = []
                moveList.addAll h.object
                moveList.add move
                h.object = moveList
              }
            }
          }
          onRemoveFromPlay {
            newMove.unregister()
          }
        };
      case RESCUE_CARRIER_154:
        return itemCard (this) {
          text "Put up to 2 Pokémon, each with 90 HP or less, from your discard pile into your hand.\nYou may play any number of Item cards during your turn."
          onPlay {
            def cards = my.discard.select(min: 1, max: 2, thisCard.cardText, { it.cardTypes.is(POKEMON) && it.hp <= 90 })
            cards.moveTo hand
          }
          playRequirement{
            assert my.discard.any { it.cardTypes.is(POKEMON) && it.hp <= 90 } : "No Pokémon with 90 HP or less in your discard pile"
          }
        };
      case RIBBON_BADGE_155:
        return pokemonTool (this) {
          text "If the Pokémon V this card is attached to has \"Sylveon\" in its name and is Knocked Out by damage from an attack from your opponent's Pokémon, that player takes 1 fewer Prize card.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = getter GET_GIVEN_PRIZES, self, {holder->
              if (self.name.contains("Sylveon") && self.pokemonV && self.KOBYDMG == bg.turnCount) {
                bc "$thisCard.name reduces prizes taken from KOing ${self} by one."
                holder.object -= 1
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case RUBBER_GLOVES_156:
        return pokemonTool (this) {
          text "The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [L] Pokémon (before applying Weakness and Resistance).\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from == self && it.to.active && it.to.owner == self.owner.opposite && it.dmg.value && it.to.types.contains(L)) {
                    it.dmg += hp(30)
                    bc "$thisCard +30"
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case SHOPPING_CENTER_157:
        return stadium (this) {
          text "Once during each player's turn, that player may put a Pokémon Tool attached to 1 of their Pokémon into their hand."
          def lastTurn
          def actions = []
          onPlay {
            actions = action (thisCard, "Stadium: $thisCard.name") {
              assert lastTurn != bg.turnCount : "You have already used $thisCard this turn"
              assert my.all.any { it.cards.filterByType POKEMON_TOOL } : "You have no Pokémon with a Pokémon Tool attached"
              bc "Used $thisCard"
              lastTurn = bg.turnCount
              def tar = my.all.findAll { it.cards.filterByType POKEMON_TOOL }.select thisCard.cardText
              def toolCard
              if (tar.cards.filterByType(POKEMON_TOOL).size() > 1) {
                def card = tar.cards.filterByType(POKEMON_TOOL).select "Return which Pokémon Tool to your hand?"
                toolCard = card
              } else {
                toolCard = tar.cards.filterByType(POKEMON_TOOL)
              }
              toolCard.moveTo hand
            }
          }
          onRemoveFromPlay{
            actions.each { bg.gm().unregisterAction it }
          }
        };
      case SINGLE_STRIKE_SCROLL_OF_THE_FANGED_DRAGON_158:
        return pokemonTool (this) {
          text "The Single Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)\n[F][M][M][C][C] Superstrong Slash 300\nDiscard all Energy from this Pokémon.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def newMove
          onPlay {reason->
            def moveBody = {
              text "300 damage. Discard all Energy from this Pokémon."
              attackRequirement {
                // self is not set properly creating a move like this, use bg.ownActive() instead
                assert bg.ownActive().singleStrike : "${bg.ownActive()} is not a $SINGLE_STRIKE Pokémon"
              }
              energyCost F, M, M, C, C
              onAttack {
                damage 300
                afterDamage {
                  discardAllSelfEnergy()
                }
              }
            }
            Move move = new Move("Superstrong Slash")
            moveBody.delegate = new MoveBuilder(thisMove: move)
            moveBody.call()
            newMove = getter GET_MOVE_LIST, self, {h->
              if (h.effect.target.singleStrike) {
                def moveList = []
                moveList.addAll h.object
                moveList.add move
                h.object = moveList
              }
            }
          }
          onRemoveFromPlay {
            newMove.unregister()
          }
        };
      case SNOW_LEAF_BADGE_159:
        return pokemonTool (this) {
          text "If the Pokémon V this card is attached to has \"Leafeon\" or \"Glaceon\" in its name, it has no Retreat Cost and no Weakness.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff1, eff2
          def snowLeafBadgeCond = { PokemonCardSet target -> target.pokemonV && ["Leafeon", "Glaceon"].any{target.name.contains(it)} }
          onPlay {reason->
            eff1 = getter(GET_WEAKNESSES, self){h->
              if ( snowLeafBadgeCond.call(self) ) {
                h.object.clear()
              }
            }
            eff2 =getter(GET_RETREAT_COST, LAST, self){h->
              if ( snowLeafBadgeCond.call(self) ) {
                h.object=0
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
            eff2.unregister()
          }
        };
      case SPIRIT_MASK_160:
        return pokemonTool (this) {
          text "If the Pokémon this card is attached to is in the Active Spot and is damaged by an attack from your opponent's Pokémon (even if it is Knocked Out), your opponent discards a card from their hand.\nYou may play any number of Item cards during your turn. Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached."
          def eff
          onPlay {reason->
            eff = delayed {
              def applyEffect
              before APPLY_ATTACK_DAMAGES, {
                applyEffect = bg.currentTurn == self.owner.opposite && self.active && bg.dm().find { it.to == self && it.dmg.value }
              }
              after APPLY_ATTACK_DAMAGES, {
                if (applyEffect && self.owner.opposite.pbg.hand) {
                  self.owner.opposite.pbg.hand.select({ true }, self.owner.opposite).discard()
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case STORMY_MOUNTAINS_161:
        return stadium (this) {
          text "Once during each player's turn, that player may search their deck for a Basic [L] Pokémon or Basic [N] Pokémon and put it onto their Bench. Then, that player shuffles their deck."
          def lastTurn
          def actions = []
          onPlay {
            actions = action(thisCard, "Stadium: $thisCard") {
              assert lastTurn != bg.turnCount : "You have already used $thisCard this turn"
              assert my.bench.notFull : "You do not have any room on your bench"
              assert deck : "Your deck is empty"
              bc "Used $thisCard"
              lastTurn = bg.turnCount
              def card = deck.search {Card c->
                c.cardTypes.is(BASIC) && (c.types.contains(L) || c.types.contains(N))
              }
              card.each {
                benchPCS it
              }
            }
          }
          onRemoveFromPlay{
            actions.each { bg.gm().unregisterAction it }
          }
        };
      case SWITCHING_CUPS_162:
        return itemCard (this) {
          text "Switch a card from your hand with the top card of your deck.\nYou may play any number of Item cards during your turn."
          onPlay {
            hand.getExcludedList(thisCard).select().moveTo(addToTop: true, hidden: true, my.deck)
            deck.subList(1,2).moveTo(hidden: true, my.hand) // Card placed on top, get the one underneath
          }
          playRequirement{
            assert hand.getExcludedList(thisCard) : "You have no other cards in your hand"
            assert deck : "Your deck is empty"
          }
        };
      case TOY_CATCHER_163:
        return itemCard (this) {
          text "Switch 1 of your opponent's Benched Pokémon that has 50 HP or less remaining with your opponent's Active Pokémon.\nYou may play any number of Item cards during your turn."
          onPlay {
            sw opp.active, opp.bench.findAll { it.remainingHP.value <= 50 }.select("Switch which of your opponent's Benched Pokémon with 50 HP or less remaining with their Active Pokémon?")
          }
          playRequirement {
            assert opp.bench.any { it.remainingHP.value <= 50 } : "Opponent has no Benched Pokémon with 50 HP or less remaining"
          }
        };
      case ZINNIA_S_RESOLVE_164:
        return supporter (this) {
          text "You can play this card only if you discard 2 other cards from your hand. Draw a card for each of your opponent's Pokémon in play.\nYou may play only 1 Supporter card during your turn."
          onPlay {
            my.hand.getExcludedList(thisCard).select(min:2,max:2,"To discard").discard()
            draw opp.all.size()
          }
          playRequirement{
            assert hand.getExcludedList(thisCard).size() >= 2 : "You do not have 2 other cards to discard from your hand"
            assert deck : "Your deck is empty"
          }
        };
      case TREASURE_ENERGY_165:
        return specialEnergy (this, [[C]]) {
          text "As long as this card is attached to a Pokémon, it provides [C] Energy. If you took this card as a face-down Prize card during your turn, before you put it into your hand, you may attach this card to 1 of your Pokémon."
          initHook { Card thisCard ->
            delayed (priority: LAST) {
              after TAKE_PRIZE, {
                def owner = thisCard.player
                // Prize cards taken in Pokémon Checkup (BeginTurn) are not taken during anyone's turn
                if (ef.card == thisCard && ef.playerType == owner && ef.takenAsFaceDown && !bg.ended
                  && bg.currentTurn == owner && !bg.em().findMostRecentEffect(BeginTurn).present
                  && owner.pbg.prizeCardSet.notEmpty && owner.pbg.hand.contains(thisCard) && owner.pbg.all
                  && confirm("You took $thisCard as a face-down Prize card. Attach it to 1 of your Pokémon before you put it into your hand?", owner)) {
                  def pcs = owner.pbg.all.select("Attach $thisCard to which Pokémon?", owner)
                  attachEnergy pcs, thisCard
                }
              }
            }
          }
          onPlay {}
          onRemoveFromPlay {}
        };
      case LEAFEON_V_166:
        return copy(LEAFEON_V_7, this);
      case LEAFEON_V_167:
        return copy(LEAFEON_V_7, this);
      case TREVENANT_V_168:
        return copy(TREVENANT_V_13, this);
      case FLAREON_V_169:
        return basic(this, hp: HP210, type: R, retreatCost: 2) {
          weakness WATER
          move "Flaming Breath", {
            text "20 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost COLORLESS
            onAttack {
              damage 20
              afterDamage {
                attachEnergyFrom type:R, deck, self
              }
            }
          }
          move "Scorching Column", {
            text "120 damage. Your opponent's Active Pokémon is now Burned."
            energyCost FIRE, FIRE, COLORLESS
            onAttack {
              damage 120
              applyAfterDamage BURNED
            }
          }
        };
      case VOLCARONA_V_170:
        return copy(VOLCARONA_V_21, this);
      case GYARADOS_V_171:
        return copy(GYARADOS_V_28, this);
      case VAPOREON_V_172:
        return basic(this, hp: HP210, type: W, retreatCost: 2) {
          weakness LIGHTNING
          move "Triple Draw", {
            text "Draw 3 cards."
            energyCost COLORLESS
            attackRequirement {
              assert deck : "Your deck is empty"
            }
            onAttack {
              draw 3
            }
          }
          move "Splash Jump", {
            text "90 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost WATER, WATER, COLORLESS
            onAttack {
              damage 90
              switchYourActive()
            }
          }
        };
      case SUICUNE_V_173:
        return copy(SUICUNE_V_31, this);
      case GLACEON_V_174:
        return copy(GLACEON_V_40, this);
      case GLACEON_V_175:
        return copy(GLACEON_V_40, this);
      case ARCTOVISH_V_176:
        return copy(ARCTOVISH_V_48, this);
      case JOLTEON_V_177:
        return basic(this, hp: HP190, type: L, retreatCost: 0) {
          weakness FIGHTING
          move "Thunder Spear", {
            text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost COLORLESS
            onAttack {
              damage 20, opp.all.select(text)
            }
          }
          move "Pin Missile", {
            text "60× damage. Flip 4 coins. This attack does 60 damage for each heads."
            energyCost LIGHTNING, COLORLESS, COLORLESS
            onAttack {
              flip 4, { damage 60 }
            }
          }
        };
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
        return basic(this, hp: HP230, type: N, retreatCost: 3) {
          move "Shred", {
            text "50 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS
            onAttack {
              shredDamage 50
            }
          }
          move "Dragon Gale", {
            text "250 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost WATER, WATER, LIGHTNING
            onAttack {
              damage 250
              my.bench.each {
                damage 20, it
              }
            }
          }
        };
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