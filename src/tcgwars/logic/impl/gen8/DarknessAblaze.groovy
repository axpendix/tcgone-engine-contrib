package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.gm.PlayEvolution
import tcgwars.logic.effect.gm.PlayTrainer

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

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author lithogenn@gmail.com
 * 		     thezipcompany@gmail.com
 *         & flagrama
 */

public enum DarknessAblaze implements LogicCardInfo {

  BUTTERFREE_V_1 ("Butterfree V", "1", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  BUTTERFREE_VMAX_2 ("Butterfree VMAX", "2", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  PARAS_3 ("Paras", "3", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PARASECT_4 ("Parasect", "4", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CARNIVINE_5 ("Carnivine", "5", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  PANSAGE_6 ("Pansage", "6", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SIMISAGE_7 ("Simisage", "7", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  KARRABLAST_8 ("Karrablast", "8", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SHELMET_9 ("Shelmet", "9", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ACCELGOR_10 ("Accelgor", "10", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ROWLET_11 ("Rowlet", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_12 ("Dartrix", "12", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_13 ("Decidueye", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BOUNSWEET_14 ("Bounsweet", "14", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  STEENEE_15 ("Steenee", "15", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TSAREENA_16 ("Tsareena", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WIMPOD_17 ("Wimpod", "17", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GOLISOPOD_18 ("Golisopod", "18", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CHARIZARD_V_19 ("Charizard V", "19", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CHARIZARD_VMAX_20 ("Charizard VMAX", "20", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  HOUNDOOM_V_21 ("Houndoom V", "21", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  TORCHIC_22 ("Torchic", "22", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  COMBUSKEN_23 ("Combusken", "23", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BLAZIKEN_24 ("Blaziken", "24", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  HEATRAN_25 ("Heatran", "25", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  PANSEAR_26 ("Pansear", "26", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SIMISEAR_27 ("Simisear", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GALARIAN_DARMANITAN_28 ("Galarian Darmanitan", "28", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  LARVESTA_29 ("Larvesta", "29", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_30 ("Volcarona", "30", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FLETCHINDER_31 ("Fletchinder", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TALONFLAME_32 ("Talonflame", "32", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CENTISKORCH_V_33 ("Centiskorch V", "33", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CENTISKORCH_VMAX_34 ("Centiskorch VMAX", "34", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  GALARIAN_MR_MIME_35 ("Galarian Mr. Mime", "35", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_36 ("Galarian Mr. Rime", "36", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SUICUNE_37 ("Suicune", "37", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  FEEBAS_38 ("Feebas", "38", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MILOTIC_39 ("Milotic", "39", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RELICANTH_40 ("Relicanth", "40", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  PANPOUR_41 ("Panpour", "41", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SIMIPOUR_42 ("Simipour", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GALARIAN_DARUMAKA_43 ("Galarian Darumaka", "43", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_44 ("Galarian Darmanitan", "44", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VANILLITE_45 ("Vanillite", "45", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  VANILLISH_46 ("Vanillish", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VANILLUXE_47 ("Vanilluxe", "47", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CUBCHOO_48 ("Cubchoo", "48", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BEARTIC_49 ("Beartic", "49", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WISHIWASHI_50 ("Wishiwashi", "50", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAREANIE_51 ("Mareanie", "51", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOXAPEX_52 ("Toxapex", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRACOVISH_53 ("Dracovish", "53", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ARCTOVISH_54 ("Arctovish", "54", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MAREEP_55 ("Mareep", "55", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_56 ("Flaaffy", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  AMPHAROS_57 ("Ampharos", "57", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ELECTRIKE_58 ("Electrike", "58", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MANECTRIC_59 ("Manectric", "59", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VIKAVOLT_V_60 ("Vikavolt V", "60", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TAPU_KOKO_61 ("Tapu Koko", "61", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXEL_62 ("Toxel", "62", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_63 ("Toxtricity", "63", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PINCURCHIN_64 ("Pincurchin", "64", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  DRACOZOLT_65 ("Dracozolt", "65", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ARCTOZOLT_66 ("Arctozolt", "66", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JIGGLYPUFF_67 ("Jigglypuff", "67", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WIGGLYTUFF_68 ("Wigglytuff", "68", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MEW_V_69 ("Mew V", "69", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SNUBBULL_70 ("Snubbull", "70", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GRANBULL_71 ("Granbull", "71", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LUNATONE_72 ("Lunatone", "72", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOTHITA_73 ("Gothita", "73", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOTHORITA_74 ("Gothorita", "74", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOTHITELLE_75 ("Gothitelle", "75", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GOLETT_76 ("Golett", "76", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_77 ("Golurk", "77", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DEDENNE_78 ("Dedenne", "78", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MORELULL_79 ("Morelull", "79", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SHIINOTIC_80 ("Shiinotic", "80", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MIMIKYU_81 ("Mimikyu", "81", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  SINISTEA_82 ("Sinistea", "82", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_83 ("Polteageist", "83", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DIGLETT_84 ("Diglett", "84", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_85 ("Dugtrio", "85", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LARVITAR_86 ("Larvitar", "86", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PUPITAR_87 ("Pupitar", "87", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TYRANITAR_88 ("Tyranitar", "88", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  TRAPINCH_89 ("Trapinch", "89", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  VIBRAVA_90 ("Vibrava", "90", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FLYGON_91 ("Flygon", "91", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SOLROCK_92 ("Solrock", "92", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOPOTAS_93 ("Hippopotas", "93", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOWDON_94 ("Hippowdon", "94", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYPERIOR_V_95 ("Rhyperior V", "95", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  DIGGERSBY_96 ("Diggersby", "96", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PASSIMIAN_97 ("Passimian", "97", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_98 ("Galarian Sirfetch'd", "98", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_SLOWBRO_V_99 ("Galarian Slowbro V", "99", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  GRIMER_100 ("Grimer", "100", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MUK_101 ("Muk", "101", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPINARAK_102 ("Spinarak", "102", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ARIADOS_103 ("Ariados", "103", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CROBAT_V_104 ("Crobat V", "104", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  DARKRAI_105 ("Darkrai", "105", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  PURRLOIN_106 ("Purrloin", "106", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  LIEPARD_107 ("Liepard", "107", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  DEINO_108 ("Deino", "108", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ZWEILOUS_109 ("Zweilous", "109", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HYDREIGON_110 ("Hydreigon", "110", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  HOOPA_111 ("Hoopa", "111", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_112 ("Nickit", "112", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_113 ("Thievul", "113", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_V_114 ("Grimmsnarl V", "114", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GRIMMSNARL_VMAX_115 ("Grimmsnarl VMAX", "115", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  ETERNATUS_V_116 ("Eternatus V", "116", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  ETERNATUS_VMAX_117 ("Eternatus VMAX", "117", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  SCIZOR_V_118 ("Scizor V", "118", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _METAL_]),
  SCIZOR_VMAX_119 ("Scizor VMAX", "119", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  SKARMORY_120 ("Skarmory", "120", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  ARON_121 ("Aron", "121", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  LAIRON_122 ("Lairon", "122", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AGGRON_123 ("Aggron", "123", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  ESCAVALIER_124 ("Escavalier", "124", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINK_125 ("Klink", "125", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  KLANG_126 ("Klang", "126", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINKLANG_127 ("Klinklang", "127", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  GALARIAN_STUNFISK_V_128 ("Galarian Stunfisk V", "128", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  MELTAN_129 ("Meltan", "129", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  MELMETAL_130 ("Melmetal", "130", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CUFANT_131 ("Cufant", "131", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_132 ("Copperajah", "132", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KANGASKHAN_133 ("Kangaskhan", "133", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TAUROS_134 ("Tauros", "134", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SENTRET_135 ("Sentret", "135", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FURRET_136 ("Furret", "136", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUNSPARCE_137 ("Dunsparce", "137", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TEDDIURSA_138 ("Teddiursa", "138", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_139 ("Ursaring", "139", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LUGIA_140 ("Lugia", "140", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  SKITTY_141 ("Skitty", "141", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DELCATTY_142 ("Delcatty", "142", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SALAMENCE_V_143 ("Salamence V", "143", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  SALAMENCE_VMAX_144 ("Salamence VMAX", "144", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  STARLY_145 ("Starly", "145", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  STARAVIA_146 ("Staravia", "146", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STARAPTOR_147 ("Staraptor", "147", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUCKLETT_148 ("Ducklett", "148", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SWANNA_149 ("Swanna", "149", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BUNNELBY_150 ("Bunnelby", "150", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FLETCHLING_151 ("Fletchling", "151", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SKWOVET_152 ("Skwovet", "152", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_153 ("Greedent", "153", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ROOKIDEE_154 ("Rookidee", "154", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CORVISQUIRE_155 ("Corvisquire", "155", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CORVIKNIGHT_156 ("Corviknight", "156", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  BIG_PARASOL_157 ("Big Parasol", "157", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BILLOWING_SMOKE_158 ("Billowing Smoke", "158", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BIRD_KEEPER_159 ("Bird Keeper", "159", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CAPE_OF_TOUGHNESS_160 ("Cape of Toughness", "160", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FAMILIAR_BELL_161 ("Familiar Bell", "161", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GLIMWOOD_TANGLE_162 ("Glimwood Tangle", "162", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  KABU_163 ("Kabu", "163", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OLD_PC_164 ("Old PC", "164", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PIERS_165 ("Piers", "165", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_166 ("Pokémon Breeder's Nurturing", "166", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_FOSSIL_167 ("Rare Fossil", "167", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ROSE_168 ("Rose", "168", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ROSE_TOWER_169 ("Rose Tower", "169", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SPIKEMUTH_170 ("Spikemuth", "170", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  STRUGGLE_GLOVES_171 ("Struggle Gloves", "171", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  TURBO_PATCH_172 ("Turbo Patch", "172", Rarity.UNCOMMON, [TRAINER, ITEM]),
  YELL_HORN_173 ("Yell Horn", "173", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HEAT_FIRE_ENERGY_174 ("Heat Fire Energy", "174", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  HIDING_DARKNESS_ENERGY_175 ("Hiding Darkness Energy", "175", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  POWERFUL_COLORLESS_ENERGY_176 ("Powerful Colorless Energy", "176", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  BUTTERFREE_V_177 ("Butterfree V", "177", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  HOUNDOOM_V_178 ("Houndoom V", "178", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  CENTISKORCH_V_179 ("Centiskorch V", "179", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VIKAVOLT_V_180 ("Vikavolt V", "180", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  RHYPERIOR_V_181 ("Rhyperior V", "181", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  CROBAT_V_182 ("Crobat V", "182", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  SCIZOR_V_183 ("Scizor V", "183", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _METAL_]),
  GALARIAN_STUNFISK_V_184 ("Galarian Stunfisk V", "184", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  SALAMENCE_V_185 ("Salamence V", "185", Rarity.ULTRARARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  KABU_186 ("Kabu", "186", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  PIERS_187 ("Piers", "187", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_188 ("Pokémon Breeder's Nurturing", "188", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  ROSE_189 ("Rose", "189", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  BUTTERFREE_VMAX_190 ("Butterfree VMAX", "190", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  CENTISKORCH_VMAX_191 ("Centiskorch VMAX", "191", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  ETERNATUS_VMAX_192 ("Eternatus VMAX", "192", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  SCIZOR_VMAX_193 ("Scizor VMAX", "193", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  SALAMENCE_VMAX_194 ("Salamence VMAX", "194", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  POKEMON_BREEDER_S_NURTURING_195 ("Pokémon Breeder's Nurturing", "195", Rarity.SECRET, [TRAINER, SUPPORTER]),
  ROSE_196 ("Rose", "196", Rarity.SECRET, [TRAINER, SUPPORTER]),
  RILLABOOM_197 ("Rillaboom", "197", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  COALOSSAL_198 ("Coalossal", "198", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  BIG_PARASOL_199 ("Big Parasol", "199", Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  TURBO_PATCH_200 ("Turbo Patch", "200", Rarity.SECRET, [TRAINER, ITEM]),
  CAPTURE_ENERGY_201 ("Capture Energy", "201", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DarknessAblaze(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DARKNESS_ABLAZE;
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
      case BUTTERFREE_V_1:
      return basic (this, hp:HP190, type:G, retreatCost:1) {
        weakness R
        move "Dizzying Poison", {
          text "Your opponent’s Active Pokémon is now Poisoned and Confused."
          energyCost G
          attackRequirement {}
          onAttack {
            apply POISONED
            apply CONFUSED
          }
        }
        move "Blasting Wind", {
          text "130 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case BUTTERFREE_VMAX_2:
      return evolution (this, from:"Butterfree V", hp:HP300, type:G, retreatCost:0) {
        weakness R
        move "G-Max Toxbreeze", {
          text "150 damage. Your opponent’s Active Pokémon is now Poisoned and Confused."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 150
            apply POISONED
            apply CONFUSED
          }
        }
      };
      case PARAS_3:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "20 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PARASECT_4:
      return evolution (this, from:"Paras", hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Mushroom Tackle", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
            flip {apply PARALYZED}
          }
        }
        move "Solar Beam", {
          text "110 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case CARNIVINE_5:
      return basic (this, hp:HP090, type:G, retreatCost:1) {
        weakness R
        move "Return", {
          text "20 damage. You may draw cards until you have 5 cards in your hand."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            def toDraw = 5 - hand.size()
            if (toDraw > 0 && confirm("Draw until you have 5 cards in your hand?")) {
              draw toDraw
            }
          }
        }
        move "Giga Drain", {
          text "40 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 40
            removeDamageCounterEqualToDamageDone()
          }
        }
      };
      case PANSAGE_6:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Seed Bomb", {
          text "10 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMISAGE_7:
      return evolution (this, from:"Pansage", hp:HP100, type:G, retreatCost:1) {
        weakness R
        move "Seed Bomb", {
          text "30 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. During your next turn, this Pokémon can’t attack."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
            cantAttackNextTurn self
          }
        }
      };
      case KARRABLAST_8:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Continuous Headbutt", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
          energyCost C
          attackRequirement {}
          onAttack {
            flipUntilTails {damage 20}
          }
        }
      };
      case SHELMET_9:
      return basic (this, hp:HP070, type:G, retreatCost:3) {
        weakness R
        move "Spray Fluid", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ACCELGOR_10:
      return evolution (this, from:"Shelmet", hp:HP090, type:G, retreatCost:0) {
        weakness R
        move "Jet Headbutt", {
          text "70 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ROWLET_11:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in this Pokémon’s attack costs."
          delayedA {
            before ENERGY_COST_CALCULATOR, {
              if (self.active && bg.currentTurn == self.owner && bg.em().retrieveObject("Sky_Circus_$self.owner") == bg.turnCount) {
                bc "Sky Circus ignores Energy cost for Rowlet's $ef.move"
                prevent()
              }
            }
          }
        }
        move "Wind Shred", {
          text "This attack does 60 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {
            assert opp.bench : "Your opponent has no benched Pokémon"
          }
          onAttack {
            damage 60, opp.bench.select("Select a Pokémon to deal 60 damage to.")
          }
        }
      };
      case DARTRIX_12:
      return evolution (this, from:"Rowlet", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Razor Leaf", {
          text "40 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DECIDUEYE_13:
      return evolution (this, from:"Dartrix", hp:HP140, type:G, retreatCost:2) {
        weakness R
        bwAbility "Deep Forest Camo", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent’s Pokémon V and Pokémon-GX."
          // TODO: This could be made a static that takes a closure that gets evaluated in the if statement.
          // Similar to part of Safeguards effect. Safeguard could possibly use it as well.
          // Ex: abilityPreventsDamage(String info, Object delegate, Closure filter={true}, def target=self)
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                def info = "Deep Forest Camo prevents all damage from Pokémon V and Pokémon-GX"
                def filter = { attacker -> attacker.pokemonGX || attacker.pokemonV }
                if (it.to == self && it.from.owner != self.owner && filter(it.from) && it.notNoEffect && it.dmg.value) {
                  bc info
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Splitting Arrow", {
          text "90 damage. This attack also does 20 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 90
            if (opp.bench) {
              def info = "Select a Pokémon to deal 20 damage to."
              def selected = multiSelect opp.bench, 2, info
              selected.each{
                damage 20, it
              }
            }
          }
        }
      };
      case BOUNSWEET_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Synthesis", {
          text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            attachEnergyFrom type:G, my.deck, my.all
          }
        }
        move "Flop", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case STEENEE_15:
      return evolution (this, from:"Bounsweet", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Captivate", {
          text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
          energyCost C
          attackRequirement {
            assert opp.bench : "Your opponent has no benched Pokémon"
          }
          onAttack {
            switchYourOpponentsBenchedWithActive()
          }
        }
        move "Smack", {
          text "40 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TSAREENA_16:
      return evolution (this, from:"Steenee", hp:HP150, type:G, retreatCost:2) {
        weakness R
        move "Power Whip", {
          text "This attack does 20 damage to 1 of your opponent’s Pokémon for each Energy attached to this Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {
            assert self.cards.energyCount(C) : "$self.name has no Energy attached"
          }
          onAttack {
            def damageAmount = 20 * self.cards.energyCount(C)
            def info = "Select Pokémon to deal $damageAmount damage to."
            def selectedPokemon = opp.all.select info
            damage damageAmount, selectedPokemon
          }
        }
        move "Time Out Kick", {
          text "100 damage. You may put an Energy attached to your opponent’s Active Pokémon into their hand."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 100
            if (defending.cards.filterByType(ENERGY)) {
              def info = "You may select the Energy to return to the opponent's hand."
              def selectedEnergy = defending.cards.filterByType(ENERGY).select min:0, info
              if (selectedEnergy) selectedEnergy.moveTo opp.hand
            }
          }
        }
      };
      case WIMPOD_17:
      return basic (this, hp:HP070, type:G, retreatCost:3) {
        weakness R
        move "Gnaw and Run", {
          text "10 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            switchYourActive()
          }
        }
      };
      case GOLISOPOD_18:
      return evolution (this, from:"Wimpod", hp:HP130, type:G, retreatCost:2) {
        weakness R
        move "Hard Times Slash", {
          text "30+ damage. This attack does 50 more damage for each of your opponent’s Pokémon V and Pokémon-GX in play."
          energyCost C, C
          attackRequirement {}
          onAttack {
            def gxAndV = opp.all.findAll{ it.pokemonGX || it.pokemonV }
            damage 30 + 50 * gxAndV.size()
          }
        }
        move "Smash Turn", {
          text "70 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 70
            switchYourActive()
          }
        }
      };
      case CHARIZARD_V_19:
      return basic (this, hp:HP220, type:R, retreatCost:3) {
        weakness W
        move "Claw Slash", {
          text "80 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Fire Spin", {
          text "220 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 220
            afterDamage {
              discardSelfEnergy C, C
            }
          }
        }
      };
      case CHARIZARD_VMAX_20:
      return evolution (this, from:"Charizard V", hp:HP330, type:R, retreatCost:3) {
        weakness W
        move "Claw Slash", {
          text "100 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
        move "G-Max Wildfire", {
          text "300 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, R, C, C
          attackRequirement {}
          onAttack {
            damage 300
            afterDamage {
              discardSelfEnergy C, C
            }
          }
        }
      };
      case HOUNDOOM_V_21:
      return basic (this, hp:HP210, type:R, retreatCost:1) {
        weakness W
        move "Searing Flame", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
            apply BURNED
          }
        }
        move "Vengeful Flame", {
          text "100+ damage. If your Benched [R] Pokémon have any damage counters on them, this attack does 100 more damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 100
            def cond = my.all.any {myPokemon -> myPokemon.types.contains(R) && myPokemon.numberOfDamageCounters}
            if (cond) damage 100
          }
        }
      };
      case TORCHIC_22:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily basic:true, 1, delegate
        }
        move "Live Coal", {
          text "10 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case COMBUSKEN_23:
      return evolution (this, from:"Torchic", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Smash Kick", {
          text "20 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Heat Beak", {
          text "40 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
            apply BURNED
          }
        }
      };
      case BLAZIKEN_24:
      return evolution (this, from:"Combusken", hp:HP170, type:R, retreatCost:2) {
        weakness W
        bwAbility "Double Type", {
          text "As long as this Pokémon is in play, it is [R] and [F] type."
          getterA GET_POKEMON_TYPE, self, { h->
            h.object.add(F)
          }
        }
        move "Turbo Drive", {
          text "130 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage {
              attachEnergyFrom basic:true, my.discard, my.bench
            }
          }
        }
      };
      case HEATRAN_25:
      return basic (this, hp:HP130, type:R, retreatCost:4) {
        weakness W
        move "Fire Fang", {
          text "30 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            apply BURNED
          }
        }
        move "Raging Flare", {
          text "80+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 80 + 10 * self.numberOfDamageCounters
          }
        }
      };
      case PANSEAR_26:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Live Coal", {
          text "10 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMISEAR_27:
      return evolution (this, from:"Pansear", hp:HP100, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "30 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. During your next turn, this Pokémon can’t attack."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
            cantAttackNextTurn self
          }
        }
      };
      case GALARIAN_DARMANITAN_28:
      return evolution (this, from:"Galarian Darumaka", hp:HP140, type:R, retreatCost:3) {
        weakness W
        move "Headbutt", {
          text "40 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Frozen Heat", {
          text "110+ damage. You may discard all [W] Energy from this Pokémon. If you do, this attack does 60 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 110
            def info = "Discard all [W] Energy from this Pokémon to do 60 more damage?"
            if (self.cards.energyCount(W) && confirm(info)) {
              afterDamage {
                discardAllSelfEnergy W
              }
              damage 60
            }
          }
        }
      };
      case LARVESTA_29:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            apply BURNED
          }
        }
      };
      case VOLCARONA_30:
      return evolution (this, from:"Larvesta", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Cauterize", {
          text "80 damage. If your opponent’s Active Pokémon has no damage counters on it before this attack does damage, this attack does nothing."
          energyCost R
          attackRequirement {
            assert opp.active.numberOfDamageCounters : "The defending Pokémon has no damage counters on it"
          }
          onAttack {
            damage 80
          }
        }
        move "Fire Wing", {
          text "110 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case FLETCHINDER_31:
      return evolution (this, from:"Fletchling", hp:HP070, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Searing Flame", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            apply BURNED
          }
        }
      };
      case TALONFLAME_32:
      return evolution (this, from:"Fletchinder", hp:HP140, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Scorching Feathers", {
          text "If this Pokémon is in the Active Spot and is damaged by an attack from your opponent’s Pokémon (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Burned."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})) {
                bc "Scorching Feather activates"
                apply BURNED, ef.attacker, SRC_ABILITY
              }
            }
          }
        }
        move "Mach Flight", {
          text "120 damage. During your opponent’s next turn, the Defending Pokémon can’t retreat."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 120
            cantRetreat defending
          }
        }
      };
      case CENTISKORCH_V_33:
      return basic (this, hp:HP210, type:R, retreatCost:3) {
        weakness W
        move "Radiating Heat", {
          text "20 damage. You may discard an Energy from this Pokémon. If you do, discard an Energy from your opponent’s Active Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
            if (self.cards.energyCount(C) && confirm("Discard an Energy from $self.name to discard an energy from $defending.name?")) {
              afterDamage {
                discardSelfEnergy C
                discardDefendingEnergy()
              }
            }
          }
        }
        move "Burning Train", {
          text "180 damage."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case CENTISKORCH_VMAX_34:
      return evolution (this, from:"Centiskorch V", hp:HP320, type:R, retreatCost:3) {
        weakness W
        move "G-Max Centiferno", {
          text "40+ damage. This attack does 40 more damage for each [R] Energy attached to this Pokémon. If you did any damage with this attack, you may attach a [R] Energy card from your discard pile to this Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40 + 40 * self.cards.energyCount(R)
            def oldHp = defending.damage
            afterDamage {
              if (oldHp != defending.damage) { // Did damage with the attack
                attachEnergyFrom type: R, may: true, my.discard, self
              }
            }
          }
        }
      };
      case GALARIAN_MR_MIME_35:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness M
        move "Reflect", {
          text "During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost W
          attackRequirement {}
          onAttack {
            reduceDamageNextTurn(hp(30), thisMove)
          }
        }
        move "Icy Snow", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_MR_RIME_36:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Shuffle Dance", {
          text "Once during your turn, you may switch 1 of your opponent’s face-down Prize cards with the top card of their deck. (The cards stay face down.)"
          actionA {
            checkLastTurn()
            assert opp.deck : "Your opponent's deck is empty"
            assert opp.prizeCardSet.faceDownCards : "Your opponent has no face down Prize cards"
            powerUsed()

            def info = "Select opponent's Prize card to switch with the top card from their deck."
            def oppPrize = opp.prizeCardSet.faceDownCards.select(hidden: true, info).first()
            opp.prizeCardSet.set opp.prizeCardSet.indexOf(oppPrize), opp.deck.remove(0)
            opp.deck.add 0, oppPrize
          }
        }
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case SUICUNE_37:
      return basic (this, hp:HP120, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Aurora Loop", {
          text "130 damage. Put 2 [W] Energy attached to this Pokémon into your hand."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage {
              // TODO: Make a static method to do this
              if (self.cards.energyCount(W) <= 2) {
                self.cards.filterByEnergyType(W).moveTo my.hand
              } else {
                def targetCount = Math.min self.cards.energyCount(W), 2
                def finalCount = 0
                while (self.cards.energyCount(W) > 0 && finalCount < targetCount) {
                  def info = "Select [W] Energy to return to your hand."
                  def energy = self.cards.filterByType(ENERGY).select(info, energyFilter(W))
                  def energyCount = 1
                  if (energy.energyCount(W) > 1) {
                    def choices = 1..energy.energyCount(W)
                    def choiceInfo = "How many Energy do you want this card to count as?"
                    energyCount = choose(choices, choiceInfo)
                  }
                  finalCount += energyCount
                  energy.moveTo my.hand
                }
              }
            }
          }
        }
      };
      case FEEBAS_38:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Nap", {
          text "Heal 20 damage from this Pokémon."
          energyCost C
          attackRequirement {
            assert self.numberOfDamageCounters : "$self.name has taken no damage"
          }
          onAttack {
            heal 20, self
          }
        }
      };
      case MILOTIC_39:
      return evolution (this, from:"Feebas", hp:HP120, type:W, retreatCost:2) {
        weakness L
        bwAbility "Bright Heal", {
          text "Once during your turn, you may heal 20 damage from each of your Pokémon."
          actionA {
            checkLastTurn()
            assert my.all.any {it.numberOfDamageCounters} : "None of your Pokémon have taken damage"
            powerUsed()
            my.all.findAll {it.numberOfDamageCounters}.each {damagedPokemon ->
              heal 20, damagedPokemon, SRC_ABILITY
            }
          }
        }
        move "Surf", {
          text "80 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case RELICANTH_40:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Fossil Search", {
          text "Search your deck for up to 2 Rare Fossil cards and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            def info = "Select up to 2 Rare Fossil cards to put on your bench."
            my.deck.search(max:2, info, {it.name == "Rare Fossil"}).each {fossil ->
              my.deck.remove(fossil)
              bg.em().run(new PlayTrainer(fossil))
            }
            shuffleDeck()
          }
        }
        move "Surf", {
          text "40 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PANPOUR_41:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMIPOUR_42:
      return evolution (this, from:"Panpour", hp:HP100, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "30 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. During your next turn, this Pokémon can’t attack."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
            cantAttackNextTurn self
          }
        }
      };
      case GALARIAN_DARUMAKA_43:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness M
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GALARIAN_DARMANITAN_44:
      return copy(RebelClash.GALARIAN_DARMANITAN_48, this);
      case VANILLITE_45:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness M
        move "Ice Over", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
            flip {apply PARALYZED}
          }
        }
      };
      case VANILLISH_46:
      return evolution (this, from:"Vanillite", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Freezing Headbutt", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
            flip {apply PARALYZED}
          }
        }
      };
      case VANILLUXE_47:
      return evolution (this, from:"Vanillish", hp:HP150, type:W, retreatCost:2) {
        weakness M
        bwAbility "Bitter Cold", {
          text "Once during your turn, if this Pokémon is your Active Pokémon, you may flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          actionA {
            checkLastTurn()
            assert self.active : "$self.name is not your Active Pokémon"
            powerUsed()
            flip {apply PARALYZED, opp.active, SRC_ABILITY}
          }
        }
        move "Frost Smash", {
          text "90 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case CUBCHOO_48:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness M
        move "Chop", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Icicle", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BEARTIC_49:
      return evolution (this, from:"Cubchoo", hp:HP140, type:W, retreatCost:3) {
        weakness M
        move "Slash", {
          text "40 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Frozen Slice", {
          text "150 damage. This Pokémon also does 50 damage to itself."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 150
            damage 50, self
          }
        }
      };
      case WISHIWASHI_50:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Deep Sea Swirl", {
          text "Shuffle your hand into your deck. Then, draw 8 cards."
          energyCost C
          attackRequirement {
            assert my.deck || my.hand : "There are no cards in your hand or deck"
          }
          onAttack {
            my.hand.moveTo hidden:true, my.deck
            shuffleDeck()
            draw 8
          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAREANIE_51:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness L
        move "Regeneration", {
          text "Heal 30 damage from this Pokémon."
          energyCost C
          attackRequirement {
            assert self.numberOfDamageCounters : "$self.name has not taken any damage"
          }
          onAttack {
            heal 30, self
          }
        }
        move "Poison Tentacles", {
          text "20 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
            apply POISONED
          }
        }
      };
      case TOXAPEX_52:
      return evolution (this, from:"Mareanie", hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Recover", {
          text "Discard an Energy from this Pokémon and heal all damage from it."
          energyCost C
          attackRequirement {
            assert self.cards.energyCount(C) : "$self.name has no Energy attached"
            assert self.numberOfDamageCounters : "$self.name has no damage counters on it"
          }
          onAttack {
            if (self.cards.energyCount(C)) {
              self.cards.filterByType(ENERGY).findAll { energyFilter C }.select("Select Energy to discard from $self.name.").discard()
              healAll self
            }
          }
        }
        move "Poison Whip", {
          text "80 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
            apply POISONED
          }
        }
      };
      case DRACOVISH_53:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:3) {
        weakness L
        bwAbility "Primal Law", {
          text "As long as this Pokémon is in the Active Spot, your opponent can’t play any Pokémon from their hand to evolve their Pokémon."
          delayedA {
            def warnAndPrevent = {
              if (self.active && bg.currentTurn == self.owner.opposite) {
                wcu "$self's Primal Law prevents playing Pokémon from your hand to evolve your Pokémon"
                prevent()
              }
            }
            before EVOLVE_STANDARD, {
              if ((ef as EvolveStandard).evolutionCard.player.pbg.hand.contains(ef.evolutionCard)) {
                warnAndPrevent()
              }
            }
            before PLAY_EVOLUTION, {
              if ((ef as PlayEvolution).cardToPlay.player.pbg.hand.contains(ef.cardToPlay)) {
                warnAndPrevent()
              }
            }
          }
        }
        move "Hammer In", {
          text "120 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ARCTOVISH_54:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:2) {
        weakness L
        move "Hard Face", {
          text "90 damage. During your opponent’s next turn, this Pokémon takes 60 less damage from attacks (after applying Weakness and Resistance)."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 90
            reduceDamageNextTurn(hp(60), thisMove)
          }
        }
        move "Cold Breath", {
          text "130 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
            apply ASLEEP
          }
        }
      };
      case MAREEP_55:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Static Shock", {
          text "20 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLAAFFY_56:
      return evolution (this, from:"Mareep", hp:HP090, type:L, retreatCost:1) {
        weakness F
        move "Static Shock", {
          text "40 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case AMPHAROS_57:
      return evolution (this, from:"Flaaffy", hp:HP150, type:L, retreatCost:2) {
        weakness F
        move "Dazzle Blast", {
          text "50 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 50
            applyAfterDamage CONFUSED
          }
        }
        move "Electric Ball", {
          text "130 damage."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case ELECTRIKE_58:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Thunderbolt", {
          text "50 damage. Discard all Energy from this Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
            afterDamage {
              discardAllSelfEnergy()
            }
          }
        }
      };
      case MANECTRIC_59:
      return evolution (this, from:"Electrike", hp:HP110, type:L, retreatCost:1) {
        weakness F
        move "Strafe", {
          text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
            switchYourActive may:true
          }
        }
        move "Flash Impact", {
          text "150 damage. This attack also does 30 damage to 1 of your Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 150
            if (my.bench) {
              damage 30, my.bench.select("Select Pokémon to deal 30 damage to.")
            }
          }
        }
      };
      case VIKAVOLT_V_60:
      return basic (this, hp:HP210, type:L, retreatCost:3) {
        weakness F
        move "Paralyzing Bolt", {
          text "50 damage. During your opponent’s next turn, they can’t play any Item cards from their hand."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
            // TODO: Could make a configurable Trainer Lock static out of this
            delayed {
              before PLAY_TRAINER, {
                def fromHand = bg.currentTurn.pbg.hand.contains(ef.cardToPlay)
                if (bg.currentTurn == self.owner.opposite && ef.cardToPlay.cardTypes.is(ITEM) && fromHand) {
                  wcu "$thisMove prevents playing Item Cards this turn"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }
        move "Super Zap Cannon", {
          text "190 damage. Discard 2 Energy from this Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 190
            afterDamage {
              discardSelfEnergy C, C
            }
          }
        }
      };
      case TAPU_KOKO_61:
      return basic (this, hp:HP110, type:L, retreatCost:0) {
        weakness F
        move "Allure", {
          text "Draw 2 cards."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            draw 2
          }
        }
        move "Electric Ball", {
          text "110 damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case TOXEL_62:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Slap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Static Shock", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOXTRICITY_63:
      return evolution (this, from:"Toxel", hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Risk Taker", {
          text "Flip a coin. If heads, discard the top 5 cards of your opponent’s deck. If tails, discard the top 5 cards of your deck."
          energyCost C, C
          attackRequirement {
            assert my.deck || opp.deck : "Both decks are empty"
          }
          onAttack {
            flip 1, {if (opp.deck) opp.deck.subList(0, 5).discard()}, {if (my.deck) my.deck.subList(0, 5).discard()}
          }
        }
        move "Thunder Jolt", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
            damage 30, self
          }
        }
      };
      case PINCURCHIN_64:
      return basic (this, hp:HP080, type:L, retreatCost:2) {
        weakness F
        move "Double Draw", {
          text "Draw 2 cards."
          energyCost L
          onAttack {
            draw 2
          }
        }
        move "Zing Zap", {
          text "50 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost L, C, C
          onAttack {
            damage 50
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case DRACOZOLT_65:
      return evolution (this, from:"Rare Fossil", hp:HP160, type:L, retreatCost:4) {
        weakness F
        move "Amping Up", {
          text "30 damage. During your next turn, this Pokémon’s Amping Up attack does 90 more damage (before applying Weakness and Resistance)."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
            increasedBaseDamageNextTurn thisMove.name, hp(90)
          }
        }
        move "Giga Impact", {
          text "200 damage. During your next turn, this Pokémon can’t attack."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 200
            cantAttackNextTurn self
          }
        }
      };
      case ARCTOZOLT_66:
      return evolution (this, from:"Rare Fossil", hp:HP130, type:L, retreatCost:2) {
        weakness F
        bwAbility "Biting Whirlpool", {
          text "Whenever your opponent attaches an Energy card from their hand to 1 of their Pokémon, put 2 damage counters on that Pokémon."
          delayedA {
            after ATTACH_ENERGY, {
              if (ef.resolvedTarget && ef.resolvedTarget.owner != self.owner && ef.reason == PLAY_FROM_HAND) {
                bc "$thisAbility.name - $ef.resolvedTarget.name receives 2 damage counters."
                directDamage 20, ef.resolvedTarget, SRC_ABILITY
              }
            }
          }
        }
        move "Electro Ball", {
          text "70 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case JIGGLYPUFF_67:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mumble", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Moon Kick", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WIGGLYTUFF_68:
      return evolution (this, from:"Jigglypuff", hp:HP120, type:P, retreatCost:2) {
        weakness M
        move "Sleep Pulse", {
          text "30 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage{
              apply ASLEEP
            }
          }
        }
        move "Double Smash", {
          text "90x damage. Flip 2 coins. This attack does 90 damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip 2, {
              damage 90
            }
          }
        }
      };
      case MEW_V_69:
      return basic (this, hp:HP180, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        move "X Ball", {
          text "30x damage. This attack does 30 damage for each Energy attached to both Active Pokémon."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 30 * ( self.cards.energyCount(C) + defending.cards.energyCount(C) )
          }
        }
      };
      case SNUBBULL_70:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness M
        move "Sharp Fang", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRANBULL_71:
      return evolution (this, from:"Snubbull", hp:HP130, type:P, retreatCost:2) {
        weakness M
        move "Jaw Lock", {
          text "50 damage. During your opponent’s next turn, the Defending Pokémon can’t retreat."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 50
            cantRetreat(defending)
          }
        }
        move "Headbutt Bounce", {
          text "130 damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case LUNATONE_72:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Future Sight", {
          text "Look at the top 4 cards of either player’s deck and put them back in any order."
          energyCost C
          foresight(4, delegate)
        }
        move "Psychic", {
          text "20+ damage. This attack does 20 more damage for each Energy attached to your opponent’s Active Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20*(1+ defending.cards.energyCount(C))
          }
        }
      };
      case GOTHITA_73:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Fortunate Eye", {
          text "Look at the top 5 cards of your opponent’s deck and put them back on top of their deck in any order."
          energyCost P
          attackRequirement {
            assert opp.deck
          }
          onAttack {
            def deck=opp.deck
            if (deck) {
              def deck2 = rearrange(deck.subList(0, 5))
              deck.setSubList(0, deck2)
              bc "Rearranged top 5 cards of opponent's deck."
            }
          }
        }
        move "Gentle Slap", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GOTHORITA_74:
      return evolution (this, from:"Gothita", hp:HP080, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Whiny Voice", {
          text "Choose a random card from your opponent’s hand. Your opponent reveals that card and shuffles it into their deck."
          energyCost P
          attackRequirement {
            assert opp.hand : "Your opponent's hand is empty"
          }
          onAttack {
            if (opp.hand) {
              opp.hand.shuffledCopy().select(hidden: true, count: 1, "Choose a random card from your opponent's hand").showToMe("Selected card").showToOpponent("this card will be shuffled into your deck").moveTo(opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
        }
        move "Double Spin", {
          text "30x damage. Flip 2 coins. This attack does 30 damage for each heads."
          energyCost P, C
          attackRequirement {}
          onAttack {
            flip 2, {
              damage 30
            }
          }
        }
      };
      case GOTHITELLE_75:
      return evolution (this, from:"Gothorita", hp:HP140, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Mind Bend", {
          text "40 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage{
              apply CONFUSED
            }
          }
        }
        move "Bend", {
          text "90 damage. Choose 2 random cards from your opponent’s hand. Your opponent reveals those cards and shuffles them into their deck."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 90
            afterDamage{
              if (opp.hand){
                opp.hand.shuffledCopy().select(hidden: true, count: 2, "Choose 2 random cards from your opponent's hand").showToMe("Selected cards").showToOpponent("These cards will be shuffled into your deck").moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
        }
      };
      case GOLETT_76:
      return basic (this, hp:HP090, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Rollout", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hammer In", {
          text "50 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GOLURK_77:
      return evolution (this, from:"Golett", hp:HP150, type:P, retreatCost:4) {
        weakness D
        resistance F, MINUS30
        move "Dynamic Chop", {
          text "80 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Golurk Hammer", {
          text "180 damage."
          energyCost P, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case DEDENNE_78:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case MORELULL_79:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Spore", {
          text "Your opponent’s Active Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Flop", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHIINOTIC_80:
      return evolution (this, from:"Morelull", hp:HP110, type:P, retreatCost:2) {
        weakness M
        move "Flickering Light", {
          text "30 damage. Flip a coin. If heads, during your opponent’s next turn, the Defending Pokémon can’t attack."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            flip {
              cantAttackNextTurn(defending)
            }
          }
        }
        move "Fear the Forest", {
          text "60+ damage. If Glimwood Tangle is in play, this attack does 60 more damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
            if(bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Glimwood Tangle"){
              damage 60
            }
          }
        }
      };
      case MIMIKYU_81:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Heal Jamming", {
          text "Your opponent’s Benched Pokémon can’t be healed."
          delayedA {
            before REMOVE_DAMAGE_COUNTER, {
              if(ef.lastTarget.owner == self.owner.opposite && ef.lastTarget.benched){
                prevent()
                bc "Heal Jamming prevents healing"
              }
            }
          }
        }
        move "Claw Slash", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SINISTEA_82:
      return basic (this, hp:HP030, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Furtive Drop", {
          text "Put 2 damage counters on your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            directDamage 20, defending
          }
        }
      };
      case POLTEAGEIST_83:
      return evolution (this, from:"Sinistea", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Tea Break", {
          text "You must discard a Pokémon that has the Mad Party attack from your hand in order to use this Ability. Once during your turn, you may draw 2 cards."
          actionA {
            assert my.hand.any{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} } : "You have no Pokémon with Mad Party in your hand"
            assert my.deck : "Your deck is empty"
            checkLastTurn()
            powerUsed()
            my.hand.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.select("Choose a Pokémon with Mad Party to discard").discard()
            draw 2
          }
        }
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case DIGLETT_84:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Scratch", {
          text "20 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DUGTRIO_85:
      return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
        weakness G
        move "Dig", {
          text "30 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all damage from and effects of attacks done to this Pokémon."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
            flip{
              preventAllEffectsNextTurn()
            }
          }
        }
        move "Mud Bomb", {
          text "70 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case LARVITAR_86:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Sand Spray", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pierce", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PUPITAR_87:
      return evolution (this, from:"Larvitar", hp:HP080, type:F, retreatCost:3) {
        weakness G
        move "Sand Spray", {
          text "20 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rocket Evolution", {
          text "40 damage. Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage{
              if (my.deck) {
                def tar = my.deck.search("Evolves from ${self.name}", { it.cardTypes.is(EVOLUTION) && it.predecessor == self.name })
                if (tar) {
                  evolve(self, tar.first(), OTHER)
                }
                shuffleDeck()
              }
            }
          }
        }
      };
      case TYRANITAR_88:
      return evolution (this, from:"Pupitar", hp:HP180, type:F, retreatCost:4) {
        weakness G
        move "Bedrock Breaker", {
          text "120 damage. Discard a Stadium in play."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 120
            afterDamage{
              if (bg.stadiumInfoStruct) {
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
        }
        move "Mountain Swing", {
          text "250 damage. Discard the top 5 cards of your deck."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 250
            afterDamage{
              if(my.deck){
                my.deck.subList(0, 5).discard()
              }
            }
          }
        }
      };
      case TRAPINCH_89:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Land's Pulse", {
          text "10+ damage. If a Stadium is in play, this attack does 10 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
            if (bg.stadiumInfoStruct) {
              damage 10
            }
          }
        }
      };
      case VIBRAVA_90:
      return evolution (this, from:"Trapinch", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Sand Pulse", {
          text "20 damage. This attack also does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
            opp.bench.each{
              damage 10, it
            }
          }
        }
      };
      case FLYGON_91:
      return evolution (this, from:"Vibrava", hp:HP150, type:F, retreatCost:1) {
        weakness G
        bwAbility "Labyrinth of Sand", {
          text "As long as this Pokémon is in the Active Spot, your opponent’s Active Pokémon can’t Retreat."
          delayedA {
            before RETREAT, {
              if(ef.retreater.owner==self.owner.opposite && self.active){
                wcu "Labyrinth of Sand prevents retreating"
                prevent()
              }
            }
          }
        }
        move "Desert Geizer", {
          text "130 damage. If your opponent has a Stadium in play, discard it. If you discarded a Stadium in this way, during your opponent’s next turn, prevent all damage from and effects of attacks done to this Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage{
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
                discard bg.stadiumInfoStruct.stadiumCard
                preventAllEffectsNextTurn()
              }
            }
          }
        }
      };
      case SOLROCK_92:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness G
        bwAbility "Resistance Shade", {
          text "If you have Lunatone in play, your opponent’s Pokémon in play have no Resistance."
          getterA (GET_RESISTANCES) {h->
            if(h.effect.target.owner == self.owner.opposite && my.all.find({it.name == "Lunatone"})) {
              h.object.clear()
            }
          }
        }
        move "Rock Throw", {
          text "30 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HIPPOPOTAS_93:
      return basic (this, hp:HP100, type:F, retreatCost:4) {
        weakness G
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Stomp", {
          text "70+ damage. Flip 2 coins. This attack does 30 more damage for each heads."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 70
            flip 2, {
              damage 30
            }
          }
        }
      };
      case HIPPOWDON_94:
      return evolution (this, from:"Hippopotas", hp:HP150, type:F, retreatCost:4) {
        weakness G
        move "Triple Smash", {
          text "80x damage. Flip 3 coins. This attack does 80 damage for each heads."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            flip 3, {
              damage 80
            }
          }
        }
        move "Land Crush", {
          text "150 damage."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case RHYPERIOR_V_95:
      return basic (this, hp:HP230, type:F, retreatCost:4) {
        weakness G
        move "Drill Run", {
          text "80 damage. Discard an Energy from your opponent’s Active Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 80
            afterDamage {
              discardDefendingEnergy()
            }
          }
        }
        move "Heavy Rock Artillery", {
          text "210 damage. During your next turn, this Pokémon can’t use Heavy Rock Artillery."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 210
            cantUseAttack(thisMove, self)
          }
        }
      };
      case DIGGERSBY_96:
      return evolution (this, from:"Bunnelby", hp:HP130, type:F, retreatCost:3) {
        weakness G
        move "Hammer In", {
          text "90 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Land Crush", {
          text "140 damage."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case PASSIMIAN_97:
      return basic (this, hp:HP110, type:F, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily(basic:true,2,delegate)
        }
        move "Rock Hurl", {
          text "70 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 70
            dontApplyResistance()
          }
        }
      };
      case GALARIAN_SIRFETCH_D_98:
      return copy(RebelClash.GALARIAN_SIRFETCH_D_95, this);
      case GALARIAN_SLOWBRO_V_99:
      return basic (this, hp:HP210, type:D, retreatCost:3) {
        weakness F
        bwAbility "Rapid-Fire Poison" , {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may make your opponent's Active Pokémon Poisoned."
          actionA{
            checkLastTurn()
            assert self.active : "$self is not your active Pokémon."
            powerUsed()
            apply POISONED, opp.active, SRC_ABILITY
          }
        }
        move "Tripping Shot", {
          text "130 damage. During your opponent’s next turn, the Defending Pokémon can’t retreat"
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 130
            cantRetreat(defending)
          }
        }
      };
      case GRIMER_100:
      return basic (this, hp:HP080, type:D, retreatCost:3) {
        weakness F
        move "Stomp Off", {
          text "Discard the top card of your opponent’s deck."
          energyCost D
          attackRequirement {
            assert opp.deck : "Your opponent's deck is empty"
          }
          onAttack {
            if (opp.deck) {
              opp.deck.subList(0, 1).discard()
            }
          }
        }
        move "Sludge Whirlpool", {
          text "50 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MUK_101:
      return evolution (this, from:"Grimer", hp:HP140, type:D, retreatCost:4) {
        weakness F
        move "Triple Poison", {
          text "Your opponent’s Active Pokémon is now Poisoned. During Pokémon Checkup, put 3 damage counters on that Pokémon instead of 1."
          energyCost D
          attackRequirement {}
          onAttack {
            apply POISONED
            extraPoison(2)
          }
        }
        move "Sludge Whirlpool", {
          text "120 damage."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case SPINARAK_102:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Hang Down", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sting", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ARIADOS_103:
      return evolution (this, from:"Spinarak", hp:HP110, type:D, retreatCost:2) {
        weakness F
        bwAbility "Spider Net", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may switch 1 of your opponent’s Benched Evolution Pokémon with their Active Pokémon."
          onActivate {r->
            if(r==Ability.ActivationReason.PLAY_FROM_HAND && opp.bench.findAll{it.realEvolution} && confirm("Use Spider Net")){
              powerUsed()
              def pcs = opp.bench.findAll{it.realEvolution}.select("New active")
              if(pcs){
                targeted (pcs, SRC_ABILITY) {
                  sw(opp.active, pcs, SRC_ABILITY)
                }
              }
            }
          }
        }
        move "Poison Sting", {
          text "30 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage{
              apply POISONED
            }
          }
        }
      };
      case CROBAT_V_104:
      return basic (this, hp:HP180, type:D, retreatCost:1) {
        weakness F
        bwAbility "Dark Asset", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may draw cards until you have 6 cards in your hand. You can’t use more than 1 Dark Asset Ability each turn."
          onActivate {
            def drawCount = 6 - hand.getExcludedList(thisCard).size()
            if(it==PLAY_FROM_HAND && bg.em().retrieveObject("Dark_Asset")!=bg.turnCount && drawCount > 0 && confirm("Use Dark Asset?")){
              bg.em().storeObject("Dark_Asset",bg.turnCount)
              powerUsed()
              draw drawCount
            }
          }
        }
        move "Venomous Fang", {
          text "70 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 70
            afterDamage{
              apply POISONED
            }
          }
        }
      };
      case DARKRAI_105:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        bwAbility "Darkness Guard", {
          text "If this Pokémon has any [D] Energy attached, it takes 20 less damage from attacks (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(self.cards.energyCount(D)) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Darkness Guard -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
        }
        move "Vortex of Darkness", {
          text "60+ damage. This attack does 20 more damage for each [D] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60 + 20*self.cards.energyCount(D)
          }
        }
      };
      case PURRLOIN_106:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Dig Claws", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fake Out", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage{
              flip{
                apply PARALYZED
              }
            }
          }
        }
      };
      case LIEPARD_107:
      return evolution (this, from:"Purrloin", hp:HP100, type:D, retreatCost:1) {
        weakness G
        bwAbility "Limber", {
          text "This Pokémon can’t be Paralyzed."
          delayedA{
            before APPLY_SPECIAL_CONDITION, self, {
              if(ef.type == Paralyzed){
                bc "$self's Limber pervents it from being Paralyzed"
                prevent()
              }
            }
          }
          onActivate {
            clearSpecialCondition(self, SRC_ABILITY, [PARALYZED])
          }
        }
        move "Slashing Claw", {
          text "90 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case DEINO_108:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness G
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ZWEILOUS_109:
      return evolution (this, from:"Deino", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Corkscrew Punch", {
          text "30 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Darkness Fang", {
          text "70 damage."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case HYDREIGON_110:
      return evolution (this, from:"Zweilous", hp:HP160, type:D, retreatCost:3) {
        weakness G
        bwAbility "Dark Squall", {
          text "As often as you like during your turn, you may attach a [D] Energy from your hand to one of your Pokémon in play."
          actionA {
            assert my.hand.filterByEnergyType(D) : "No [D] Energy in hand"
            powerUsed()
            def list = my.hand.filterByEnergyType(D).select("Choose a [D] Energy Card to attach")
            def pcs = my.all.select("Attach to?")
            attachEnergy(pcs, list.first(), PLAY_FROM_HAND)
          }
        }
        move "Pitch-Black Fangs", {
          text "130 damage."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case HOOPA_111:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Assault Gate", {
          text "90 damage. If this Pokémon didn’t move from the Bench to the Active Spot this turn, this attack does nothing. This attack’ damage isn’t affected by Weakness."
          energyCost D
          attackRequirement {}
          onAttack {
            if(wasSwitchedOutThisTurn(self)){
              noWeaknessDamage(90,defending)
            }
          }
        }
      };
      case NICKIT_112:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Tail Whip", {
          text "Flip a coin. If heads, during your opponent’s next turn, the Defending Pokémon can’t attack."
          energyCost D
          attackRequirement {}
          onAttack {
            flip{
              cantAttackNextTurn defending
            }
          }
        }
      };
      case THIEVUL_113:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Nasty Plot", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost D
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            if (my.deck) {
              my.deck.search(max: 2, "Select up to 2 cards", { true }).moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
        }
        move "Sharp Fang", {
          text "70 damage."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GRIMMSNARL_V_114:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness G
        move "Bite", {
          text "40 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Spiky Knuckle", {
          text "200 damage. Put 2 [D] Energy attached to this Pokémon into your hand."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 200
            afterDamage {
              // TODO: Make a static method to do this
              if (self.cards.energyCount(D) <= 2) {
                self.cards.filterByEnergyType(D).moveTo my.hand
              } else {
                def targetCount = Math.min self.cards.energyCount(D), 2
                def finalCount = 0
                while (self.cards.energyCount(D) > 0 && finalCount < targetCount) {
                  def info = "Select [D] Energy to return to your hand."
                  def energy = self.cards.filterByType(ENERGY).select(info, energyFilter(D))
                  def energyCount = 1
                  if (energy.energyCount(D) > 1) {
                    def choices = 1..energy.energyCount(D)
                    def choiceInfo = "How many Energy do you want this card to count as?"
                    energyCount = choose(choices, choiceInfo)
                  }
                  finalCount += energyCount
                  energy.moveTo my.hand
                }
              }
            }
          }
        }
      };
      case GRIMMSNARL_VMAX_115:
      return evolution (this, from:"Grimmsnarl V", hp:HP330, type:D, retreatCost:3) {
        weakness G
        move "G-Max Drill", {
          text "170+ damage. This attack does 50 more damage for each extra [D] Energy attached to this Pokémon (in addition to this attack’ cost). You can’t add more than 100 damage in this way."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 170
            extraEnergyDamage(2,hp(50),D,thisMove)
          }
        }
      };
      case ETERNATUS_V_116:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness F
        move "Power Accelerator", {
          text "30 damage. You may attach a [D] Energy card from your hand to 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage{
              def potentialEnergy = my.hand.filterByEnergyType(D)
              if (my.bench && potentialEnergy){
                def sel = potentialEnergy.select(min:0, "Select a [D] Energy to attach from your hand.")
                if (sel) {
                  def tar = my.bench.select("To?")
                  attachEnergy(tar, sel.first(), PLAY_FROM_HAND)
                }
              }
            }
          }
        }
        move "Dynamax Cannon", {
          text "120+ damage. If your opponent’s Active Pokémon is a Pokémon VMAX, this attack does 120 more damage."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            if(opp.active.pokemonVMAX){
              damage 120
            }
          }
        }
      };
      case ETERNATUS_VMAX_117:
      return evolution (this, from:"Eternatus V", hp:HP340, type:D, retreatCost:3) {
        weakness F
        bwAbility "Eternal Zone", {
          text "If all of your Pokémon in play are [D] type, you can have up to 8 Pokémon on your Bench, and can’t put non-[D] Pokémon into play. (If this Ability stops working, discard Pokémon from your Bench until you have 5.)"
          def isOwnerPokemonAllDark = {
            return !self.owner.pbg.all.find {
              it.cards().first() &&
              it.cards.first().cardTypes.contains(POKEMON) &&
              !it.types.contains(D)
            }
          }
          def checkNewAbilities = { Effect ef ->
            if (ef.cardToPlay != thisCard && ef.cardToPlay.player == self.owner &&
              self.owner.pbg.all.find { !it.types.contains(D) }
            ) {
              self.owner.pbg.triggerBenchSizeCheck()
              new CheckAbilities().run(bg)
            }
          }
          def updateActiveInfinityZoneCount = { Boolean isAbilityActive ->
            def isInfinityZoneActive = bg.em().retrieveObject("Infinity_Zone_" + self.hashCode()) ?: false

            if (isAbilityActive && isOwnerPokemonAllDark() && !isInfinityZoneActive) {
              bg.em().storeObject("Infinity_Zone_"+self.hashCode(), true)
            }
            else if (!isAbilityActive && isInfinityZoneActive) {
              bg.em().storeObject("Infinity_Zone_"+self.hashCode(), false)
            }
            bg.em().retrieveObject("Infinity_Zone_" + self.hashCode())
          }

          def isPokemonPlayable = { Effect ef ->
            def isInfinityZoneActive = bg.em().retrieveObject("Infinity_Zone_" + self.hashCode())

            if (ef.cardToPlay.player == self.owner &&
              isInfinityZoneActive && !ef.cardToPlay.types.contains(D)) {
              return false
            }
            return true
          }

          getterA (GET_BENCH_SIZE) {h->
            if (h.effect.playerType == self.owner && isOwnerPokemonAllDark()) {
              updateActiveInfinityZoneCount(true)
              h.object = 8
            } else {
              updateActiveInfinityZoneCount(false)
            }
          }

          delayedA (priority: BEFORE_LAST) {
            after PLAY_BASIC_POKEMON, {
              checkNewAbilities(ef)
            }
            after PLAY_EVOLUTION, {
              checkNewAbilities(ef)
            }
            after SWITCH, {
              if (ef.switchedOut && ef.switchedOut.owner == self.owner || ef.fallenBack && ef.fallenBack.owner == self.owner) {
                self.owner.pbg.triggerBenchSizeCheck()
              }
            }
            after REMOVE_FROM_PLAY, {
              if (ef.resolvedTarget && ef.resolvedTarget.owner == self.owner) {
                self.owner.pbg.triggerBenchSizeCheck()
              }
            }
            after DEVOLVE, {
              if (ef.resolvedTarget.owner == self.owner) {
                self.owner.pbg.triggerBenchSizeCheck()
              }
            }
            after EVOLVE, {
              if (ef.pokemonToBeEvolved.owner == self.owner) {
                self.owner.pbg.triggerBenchSizeCheck()
              }
            }
            before PLAY_BASIC_POKEMON, {
              if (!isPokemonPlayable(ef)) {
                wcu "Cannot play non-Darkness Pokemon"
                prevent()
              }
            }
            before PLAY_EVOLUTION, {
              if (!isPokemonPlayable(ef)) {
                wcu "Cannot play non-Darkness Pokemon"
                prevent()
              }
            }
            before EVOLVE_STANDARD, {
              if (bg.em().retrieveObject("Infinity_Zone_" + self.hashCode()) && ef.evolutionCard.player == self.owner && !ef.evolutionCard.types.contains(D)) {
                wcu "Cannot play non-Darkness Pokemon"
                prevent()
              }
            }
            before EVOLVE, {
              if (bg.em().retrieveObject("Infinity_Zone_" + self.hashCode()) && ef.evolutionCard.player == self.owner  && !ef.evolutionCard.types.contains(D)) {
                wcu "Cannot play non-Darkness Pokemon"
                prevent()
              }
            }
            before PUT_ON_BENCH, {
              if (!isPokemonPlayable(ef)) {
                wcu "Cannot play non-Darkness Pokemon"
                prevent()
              }
            }
          }
          onActivate {
            self.owner.pbg.triggerBenchSizeCheck()
            new CheckAbilities().run(bg)
          }
          onDeactivate {
            self.owner.pbg.triggerBenchSizeCheck()
            new CheckAbilities().run(bg)
          }
        }
        move "Dread End", {
          text "30x damage. This attack does 30 damage for each of your [D] Pokémon in play."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30 * my.all.findAll{it.types.contains(D)}.size()
          }
        }
      };
      case SCIZOR_V_118:
      return basic (this, hp:HP210, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Hack Off", {
          text "30 damage. Discard a Pokémon Tool and a Special Energy from your opponent’s Active Pokémon."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 30
            discardDefendingSpecialEnergy(delegate)
            afterDamage{
              targeted (defending){
                def attachedTools = defending.cards.filterByType(POKEMON_TOOL)
                if (attachedTools) {
                  attachedTools.select("Discard a Pokémon Tool from $defending.").discard()
                }
              }
            }
          }
        }
        move "Slashing Claw", {
          text "140 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case SCIZOR_VMAX_119:
      return evolution (this, from:"Scizor V", hp:HP320, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Hard Scissors", {
          text "90 damage. During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 90
            reduceDamageNextTurn(hp(30),thisMove)
          }
        }
        move "Max Steelspike", {
          text "190 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 190
          }
        }
      };
      case SKARMORY_120:
      return basic (this, hp:HP120, type:M, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Metal Arms", {
          text "10+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 40 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
            if(self.cards.filterByType(POKEMON_TOOL)) damage 40
          }
        }
        move "Cutting Wind", {
          text "80 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case ARON_121:
      return basic (this, hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LAIRON_122:
      return evolution (this, from:"Aron", hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Knock Away", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 30 }
          }
        }
        move "Lunge Out", {
          text "50 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case AGGRON_123:
      return evolution (this, from:"Lairon", hp:HP160, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Sturdy", {
          text "If this Pokémon has full HP and would be Knocked Out by damage from an attack, it is not Knocked Out, and its remaining HP becomes 10."
            delayedA {
              // Taken from Donphan LOT
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner != self.owner) {
                  bg.dm().each{
                    if(it.to == self && it.notNoEffect && self.damage == hp(0) && it.dmg.value >= self.fullHP.value) {
                      bc "Sturdy saved $self!"
                      it.dmg = self.fullHP - hp(10)
                    }
                  }
                }
              }
            }
        }
        move "Gigaton Stomp", {
          text "160 damage."
          energyCost M, C, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case ESCAVALIER_124:
      return evolution (this, from:"Karrablast", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Fury Cutter", {
          text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 20 more damage. If 2 of them are heads, this attack does 70 more damage. If all of them are heads, this attack does 140 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
            flip 3,{},{},[1:{damage 20},2:{damage 70},3:{damage 140}]
          }
        }
        move "Seashell Attack", {
          text "60 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KLINK_125:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Call for Backup", {
          text "Search your deck for a [M] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost M
          attackRequirement {}
          onAttack {
            deck.search(max: 1, "Choose a [M] Pokémon", pokemonTypeFilter(M)).showToOpponent("Call for Backup - [M] Pokémon chosen by your opponent").moveTo(my.hand)
            shuffleDeck()
          }
        }
      };
      case KLANG_126:
      return evolution (this, from:"Klink", hp:HP090, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Call for Backup", {
          text "Search your deck for a [M] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost M
          attackRequirement {}
          onAttack {
            deck.search(max: 1, "Choose a [M] Pokémon", pokemonTypeFilter(M)).showToOpponent("Call for Backup - [M] Pokémon chosen by your opponent").moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Spinning Attack", {
          text "60 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KLINKLANG_127:
      return evolution (this, from:"Klang", hp:HP150, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Beam", {
          text "60 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Clockwork", {
          text "200 damage. If you don't have Klink and Klang on your Bench, this attack does nothing."
          energyCost M, C, C
          attackRequirement {
            assert my.bench.any({ it.name == "Klink" }) : "You have no Klink on your bench."
            assert my.bench.any({ it.name == "Klang" }) : "You have no Klang on your bench."
          }
          onAttack {
            if ( my.bench.any({ it.name == "Klink" }) && my.bench.any({ it.name == "Klang" }) ) {
              damage 200
            }
          }
        }
      };
      case GALARIAN_STUNFISK_V_128:
      return basic (this, hp:HP200, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Metal Skin", {
          text "This Pokémon gets +20 HP for each [M] Energy attached to it."
          getterA (GET_FULL_HP, self) {h->
            h.object += hp(20 * self.cards.energyCount(M))
          }
        }
        move "Trapping Bite", {
          text "60 damage. During your opponent’s next turn, if this Pokémon is damaged by an attack (even if it is Knocked Out), put 12 damage counters on the Attacking Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Trap Bite activates"
                  directDamage(120, ef.attacker as PokemonCardSet)
                }
              }
              unregisterAfter 2
              after FALL_BACK, self, {unregister()}
              after EVOLVE, self, {unregister()}
              after DEVOLVE, self, {unregister()}
            }
          }
        }
      };
      case MELTAN_129:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Beam", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MELMETAL_130:
      return evolution (this, from:"Meltan", hp:HP150, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Energy Link", {
          text "30 damage. Attach an Energy card from your discard pile to this Pokémon."
          energyCost M
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(my.discard, self)
            }
          }
        }
        move "Heavy Impact", {
          text "130 damage."
          energyCost M, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case CUFANT_131:
      return basic (this, hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Strength", {
          text "60 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case COPPERAJAH_132:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Antibacterial Skin", {
          text "This Pokémon can’t be affected by any Special Conditions."
          delayedA {
            before APPLY_SPECIAL_CONDITION, self, {
              bc "Antibacterial Skin prevents $self from being ${ef.type}"
              prevent()
            }
          }
          onActivate {
            bc "Antibacterial Skin removes existing Special Conditions from $self."
            clearSpecialCondition(self, SRC_ABILITY)
          }
        }
        move "Vengeful Stomp", {
          text "120+ damage. If your Benched Pokémon have any damage counters on them, this attack does 120 more damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 120
            if (my.bench.find{ it.numberOfDamageCounters }) damage 120
          }
        }
      };
      case KANGASKHAN_133:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Rally Back", {
          text "30+ damage. If any of your Pokémon were Knocked Out by damage from an attack from your opponent’s Pokémon during their last turn, this attack does 90 more damage."
          energyCost C, C
          onAttack {
            damage 30
            if (my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1) damage 90
          }
        }
        move "Hammer In", {
          text "100 damage."
          energyCost C, C, C
          onAttack {
            damage 100
          }
        }
      };
      case TAUROS_134:
      return basic (this, hp:HP110, type:C, retreatCost:2) {
        weakness F
        move "Horn Attack", {
          text "60 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SENTRET_135:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily basic:true, 1, delegate
        }
      };
      case FURRET_136:
      return evolution (this, from:"Sentret", hp:HP110, type:C, retreatCost:1) {
        weakness F
        move "Feelin’ Fine", {
          text "Draw 3 cards."
          energyCost C
          attackRequirement {
            assert my.deck : "There are no cards left in your deck"
          }
          onAttack {
            draw 3
          }
        }
        move "Tail Smash", {
          text "90 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { damage 90 }
          }
        }
      };
      case DUNSPARCE_137:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        bwAbility "Final Dig", {
          text "If this Pokémon is Knocked Out by damage from an attack from your opponent’s Pokémon, discard the top 2 cards of your opponent’s deck."
          delayedA (priority: LAST) {
            before (KNOCKOUT, self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && opp.deck) {
                bc "One Last Dig - 2 cards will be discarded from the top of the opponent's deck"
                self.owner.opposite.pbg.deck.subList(0,2).discard()
              }
            }
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEDDIURSA_138:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        move "Baby-Doll Eyes", {
          text "During your opponent’s next turn, the Defending Pokémon can’t retreat."
          energyCost C
          attackRequirement {}
          onAttack {
            cantRetreat defending
          }
        }
        move "Dig Claws", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case URSARING_139:
      return evolution (this, from:"Teddiursa", hp:HP140, type:C, retreatCost:3) {
        weakness F
        move "Hammer Arm", {
          text "70 damage. Discard the top card of your opponent’s deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
            if (opp.deck) {
              opp.deck.subList(0,1).discard()
            }
          }
        }
        move "Claw Slash", {
          text "120 damage."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case LUGIA_140:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Gust", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Energy Loop", {
          text "120 damage. Put an Energy attached to this Pokémon into your hand."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            afterDamage{
              self.cards.filterByType(ENERGY).select("Select an Energy to put back into your hand.").moveTo(my.hand)
            }
          }
        }
      };
      case SKITTY_141:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Draw Up", {
          text "Search your deck for an Energy card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "You have no cards left in your deck"
          }
          onAttack {
            if (my.deck) {
              my.deck.search("Put Energy Card into your hand", cardTypeFilter(ENERGY)).showToOpponent("Opponent's chosen Energy card").moveTo(my.hand)
              shuffleDeck()
            }
          }
        }
        move "Cat Kick", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DELCATTY_142:
      return evolution (this, from:"Skitty", hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Captivating Tail", {
          text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Confused."
          energyCost C
          attackRequirement {
            assert opp.bench : "Opponent has no Benched Pokémon."
          }
          onAttack {
            def target = opp.bench.select("Select the new Active Pokémon.")
            if ( sw2(target) ) { apply CONFUSED, target }
          }
        }
        move "Moon Impact", {
          text "90 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case SALAMENCE_V_143:
      return basic (this, hp:HP220, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Swoop Across", {
          text "This attack does 30 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            opp.all.each{ damage 30 }
          }
        }
        move "Heavy Storm", {
          text "160 damage."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case SALAMENCE_VMAX_144:
      return evolution (this, from:"Salamence V", hp:HP320, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Sonic Double", {
          text "This attack does 40 damage to 2 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            multiDamage(opp.all,2,40)
          }
        }
        move "Max Wings", {
          text "240 damage. During your next turn, this Pokémon can’t use Max Wings."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 240
            cantUseAttack(thisMove, self)
          }
        }
      };
      case STARLY_145:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          delayedA {
            before ENERGY_COST_CALCULATOR, {
              if (self.active && bg.currentTurn == self.owner && bg.em().retrieveObject("Sky_Circus_$self.owner") == bg.turnCount) {
                bc "Sky Circus ignores Energy cost for Rowlet's $ef.move"
                prevent()
              }
            }
          }
        }
        move "Sharp Eyes", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C, C
          attackRequirement {
            assert my.deck : "There are no cards left in your deck"
          }
          onAttack {
            my.deck.select(min:1, max:2, "Put up to 2 cards into your hand").moveTo(hidden: true, my.hand)
            shuffleDeck()
          }
        }
      };
      case STARAVIA_146:
      return evolution (this, from:"Starly", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Ambush", {
          text "20 damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
        move "Wing Attack", {
          text "40 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case STARAPTOR_147:
      return evolution (this, from:"Staravia", hp:HP150, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Hurricane Blender", {
          text "70 damage. Move any amount of Energy from your Pokémon to your other Pokémon in any way you like."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 70
            afterDamage{
              if (my.bench && confirm("Do you want to move any amount of Energy from your Pokémon to your other Pokémon in any way you like?"))
              while (true) {
                def pl = (my.all.findAll {it.cards.filterByType(ENERGY)})
                if (!pl) break;
                def src = pl.select("Source for energy (cancel to stop)", false)
                if (!src) break;
                def card=src.cards.filterByType(ENERGY).select("Energy to move").first()

                def tar=my.all.findAll{it != src}.select("Target for energy (cancel to stop)", false)
                if (!tar) break;
                energySwitch(src, tar, card)
              }
            }
          }
        }
        move "Brave Bird", {
          text "170 damage. This Pokémon also does 30 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 170
            damage 30, self
          }
        }
      };
      case DUCKLETT_148:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Flap", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SWANNA_149:
      return evolution (this, from:"Ducklett", hp:HP110, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          delayedA {
            before ENERGY_COST_CALCULATOR, {
              if (self.active && bg.currentTurn == self.owner && bg.em().retrieveObject("Sky_Circus_$self.owner") == bg.turnCount) {
                bc "Sky Circus ignores Energy cost for Rowlet's $ef.move"
                prevent()
              }
            }
          }
        }
        move "Feather Slice", {
          text "70+ damage. You may discard a card from your hand. If you do, this attack does 70 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
            if (my.hand && confirm("Discard a card from your hand? If you do, $thisMove will do 70 more damage.")) {
              my.hand.select("Choose which card to discard").discard()
              damage 70
            }
          }
        }
      };
      case BUNNELBY_150:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case FLETCHLING_151:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Tackle", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SKWOVET_152:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Whimsy Tackle", {
          text "40 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { damage 40 }
          }
        }
      };
      case GREEDENT_153:
      return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
        weakness F
        move "Scrape Off", {
          text "20 damage. Before doing damage, discard all Pokémon Tools from your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            targeted(defending) {
              defending.cards.filterByType(POKEMON_TOOL).discard()
            }
            damage 20
          }
        }
        move "Hit and Run", {
          text "100 damage. Put this Pokémon and all attached cards into your hand."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 100
            afterDamage{
              self.cards.moveTo(hand)
              removePCS(self)
            }
          }
        }
      };
      case ROOKIDEE_154:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "10 damage. Before doing damage, discard all Pokémon Tools from your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            targeted(defending) {
              defending.cards.filterByType(POKEMON_TOOL).discard()
            }
            damage 10
          }
        }
      };
      case CORVISQUIRE_155:
      return evolution (this, from:"Rookidee", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Fury Attack", {
          text "40x damage. Flip 3 coins. This attack does 40 damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 40 }
          }
        }
      };
      case CORVIKNIGHT_156:
      return evolution (this, from:"Corvisquire", hp:HP160, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        bwAbility "Flying Taxi", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 1 of your Pokémon, except any Corviknight, and all attached cards into your hand."
          onActivate { r->
            if (r==PLAY_FROM_HAND) {
              //TODO: Handle Scoop-Up Block on this.
              if (my.all.any{ it.name != "Corviknight" } && confirm("Flying Taxi - Return one of your Pokémon (and all cards attached to it) back to your hand?")){
                def pcs = my.all.findAll { it.name != "Corviknight" }.select("Which Pokémon to bring back to your hand?")

                targeted (pcs, SRC_ABILITY) {
                  pcs.cards.moveTo(my.hand)
                  removePCS(pcs)
                }
              }
            }
          }
        }
        move "Blasting Wind", {
          text "120 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case BIG_PARASOL_157:
      return pokemonTool (this) {
        text "As long as the Pokémon this card is attached to is in the Active Spot, prevent all effects of attacks from your opponent’s Pokémon done to all of your Pokémon. (Existing effects are not removed. Damage is not an effect.)"
        def eff
        onPlay {reason->
          eff = delayed {
            before null, null, Source.ATTACK, {
              if (self.active) {
                def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
                if (pcs && pcs.owner == self.owner && bg.currentTurn == self.owner.opposite) {
                  if (ef.effectType != DAMAGE) {
                    bc "Big Parasol prevents effect"
                    prevent()
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
      case BILLOWING_SMOKE_158:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to is Knocked Out by damage from an attack from your opponent’s Pokémon, that player discards any Prize cards they would take for that Knock Out instead of putting those cards into their hand."
        def eff1, eff2
        def itemActive = false
        onPlay {reason->
          //
          // Code following current compendium rulings
          //
          eff1 = delayed {
            before KNOCKOUT, self, {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite) {
                bc "Billowing Smoke activates."
                itemActive = true
              }
            }
          }
          eff2 = delayed {
            before TAKE_PRIZE, {
              if (itemActive && ef.pcs==self) {
                prevent()
                def tar = self.owner.opposite.pbg.prizeCardSet.oppSelect(hidden: true, count: 1, "The knocked out Pokémon had Billowing Smoke attached. Select a prize card, and it'll be discarded instead of taken and put into your hand.")
                moveCard(suppressLog: true, tar.first(), self.owner.opposite.pbg.discard)
                bc "$tar was discarded instead of taken as a Prize." // custom log entry
                TakePrize.checkPrizes(bg)
              }
            }
            after KNOCKOUT, self, {
              if (itemActive) {
                itemActive = false
                unregister()
              }
            }
          }
          //
          // TODO: Use this code (and update Jirachi Prism Star) if the rulings on this card are updated/fixed (JP says they counts as taken prizes, Compendium currently says they don't)
          //
          /* eff1 = delayed {
            before KNOCKOUT, self, {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite) {
                bc "Billowing Smoke activates."
                bg.em().storeObject("Billowing_Smoke", true)
                delayed {
                  after TAKE_PRIZE, {
                    if(self.owner.opposite.prizeCardSet.notEmpty && ef.card != null && ef.card.player == self.owner.opposite){
                      bc "${ef.card} gets discarded due to Billowing Smoke's effect."
                      def prizeOwner = ef.card.player
                      prizeOwner.pbg.hand.remove(ef.card)
                      prizeOwner.pbg.discard.add(ef.card)
                    }
                  }
                  after KNOCKOUT, self, {
                    bg.em().storeObject("Billowing_Smoke", false)
                    unregister()
                  }
                }
              }
            }
          } */
        }
        onRemoveFromPlay {
          eff1.unregister()
        }
      };
      case BIRD_KEEPER_159:
      return supporter (this) {
        text "Switch your Active Pokémon with 1 of your Benched Pokémon. If you do, draw 3 cards."
        onPlay {
          switchYourActive now:true, source:TRAINER_CARD
          draw 3
        }
        playRequirement{
          assert my.bench : "You have no benched Pokémon"
        }
        globalAbility {Card thisCard->
          def flag
          delayed {
            before PLAY_TRAINER, {
              if (ef.supporter && ef.cardToPlay == thisCard && bg.currentTurn == thisCard.player && hand.contains(ef.cardToPlay)) {
                flag = true
              }
            }
            after PLAY_TRAINER, {
              if (flag) {
                bg.em().storeObject("Sky_Circus_$thisCard.player", bg.turnCount)
                flag = false
              }
            }
          }
        }
      };
      case CAPE_OF_TOUGHNESS_160:
      return pokemonTool (this) {
        text "The Basic Pokémon this card is attached to gets +50 HP, except Pokémon-GX."
        def eff
        onPlay {reason->
          eff = getter (GET_FULL_HP, self) {h->
            def selfTopCardTypes = self.topPokemonCard.cardTypes
            if(selfTopCardTypes.is(BASIC) && !(selfTopCardTypes.is(POKEMON_GX))) {
              h.object += hp(50)
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case FAMILIAR_BELL_161:
      return itemCard (this) {
        text "Search your deck for a Pokémon with the same name as a Pokémon in your discard pile, reveal it, and put it into your hand. Then, shuffle your deck."
        onPlay {
          def pokeNamesInDiscard = []
          my.discard.filterByType(POKEMON).each{
            pokeNamesInDiscard.add(it.name)
          }
          my.deck.search("Pokémon with same name as a Pokémon in your discard pile. Possible options: $pokeNamesInDiscard", {it.cardTypes.is(POKEMON) && pokeNamesInDiscard.contains(it.name)}).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "You have no cards in your deck"
          assert my.discard.filterByType(POKEMON) : "You have no Pokémon in your discard pile"
        }
      };
      case GLIMWOOD_TANGLE_162:
      return stadium (this) {
        text "Once during each player’s turn, after that player flips any coins for an attack, they may ignore all results of those coin flips and begin flipping those coins again."
        // Heavy reference to Victini's Victory Star
        def lastTurn = 0
        def eff
        onPlay {
          eff = delayed {
            def act = false
            def key = "VICTINI_14 Victory Star"
            before PROCESS_ATTACK_EFFECTS, {
              if(ef.attacker.owner == my.owner){
                act = true
              }
            }
            before BETWEEN_TURNS, {
              act = false
            }
            before COIN_FLIP_BETWEEN_EXECUTION, {
              if (act && ef.object.player == bg.getCurrentTurn() && lastTurn != bg.turnCount && confirm("Glimwood Tangle: Result: $ef.object.lastResultString. Do you want to reflip?")) {
                lastTurn = bg.turnCount
                bg.em().storeObject(key, bg.turnCount)
                bc "${bg().getCurrentTurn().pbg.active} used Glimwood Tangle and discarded those flips"
                ef.object.run(bg) //flip again
                prevent()
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case KABU_163:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, draw 4 cards. If your Active Pokémon if your only Pokémon in play, draw 8 cards instead."
        onPlay {
          shuffleDeck(my.hand.getExcludedList(thisCard))
          my.hand.removeAll(my.hand.getExcludedList(thisCard))
          draw(my.bench ? 4 : 8)
        }
        playRequirement{
          assert my.hand || my.deck : "No cards in hand or in deck"
        }
      };
      case OLD_PC_164:
      return itemCard (this) {
        text "Flip 2 coins. If both are heads, put a card from your discard pile into your hand."
        onPlay {
          def bringCardFromDiscard = {
            my.discard.select("Which card will you put back into your hand?").moveTo(my.hand)
          }

          flip 2, {}, {}, [2: bringCardFromDiscard]
        }
        playRequirement{
          assert my.discard : "You have no cards in your discard pile"
        }
      };
      case PIERS_165:
      return supporter (this) {
        text "Search your deck for an Energy card and a [D] Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
          onPlay {

            def darkPokeFilter = {card -> card.cardTypes.is(POKEMON) && card.asPokemonCard().types.contains(D)}

            def tar = my.deck.search(max: 2, "Search your deck for an Energy card and a [D] Pokémon.", {darkPokeFilter(it) || it.cardTypes.is(ENERGY)}, { CardList list ->
              list.findAll{darkPokeFilter(it)}.size() <= 1 && list.filterByType(ENERGY).size() <= 1
            })

            if (tar) { tar.showToOpponent("Opponent's selected Energy card and [D] Pokémon.").moveTo(my.hand) }
            shuffleDeck()
            bg.em().storeObject("Piers", bg.turnCount)
          }
          playRequirement{
            assert my.deck.notEmpty : "Deck is empty"
          }
      };
      case POKEMON_BREEDER_S_NURTURING_166:
      return supporter (this) {
        text "Choose up to 2 of your Pokémon in play. For each of those Pokémon, search your deck for a card that evolves from that Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck. You can’t use this card during your first turn or on a Pokémon that was put into play this turn."
        onPlay {
          def tar = my.all.findAll{it.turnCount < bg.turnCount && it.lastEvolved < bg.turnCount && bg().gm().hasEvolution(it.name)}
          def pl = new PcsList()
          def pcs

          while (tar && pl.size() < 2){
            pcs = tar.select("Pokémon Breeder's Nurturing - Choose which Pokémon you want to search an evolution of. (${pl.size() + 1}/2) ${pl.notEmpty ? " [You can hit cancel and search for only an evolution of " + pl.first() + "]" : ""}", pl.size() == 0)

            if (pcs) {
              pl.add(pcs)
              tar.remove(pcs)
            } else {
              tar.clear()
            }
          }

          def preEvoNames = pl.collect{it.name}.unique(false)

          def info = "Select ${ (preEvoNames.size() == 1 && pl.size() == 2) ? "up to 2" : "a"} Pokémon that evolves from ${preEvoNames[0] + (preEvoNames.size() == 2 ? " and a Pokémon that evolves from " + preEvoNames[1] : "")}:"

          def sel = my.deck.search(max: pl.size(), info, { it.cardTypes.is(EVOLUTION) &&  preEvoNames.contains(it.predecessor) }, { CardList list -> preEvoNames.size() == 1 || ( list.findAll{it.predecessor == preEvoNames[0]}.size() <= 1 && list.findAll{it.predecessor == preEvoNames[1]}.size() <= 1 )})

          sel.each{ evoCard ->
            def toEvolve
            if (preEvoNames.size() == 1 && pl.size() > 1){
              toEvolve = pl.select("Which of these Pokémon will evolve into ${evoCard.name}?")
            } else {
              toEvolve = pl.find{it.name == evoCard.predecessor}
            }
            evolve(toEvolve, evoCard, OTHER)
            pl.remove(toEvolve)
          }

          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Your deck is empty."
          assert bg.turnCount > 2 : "Cannot use this card during your first turn."
          assert my.all.any{bg().gm().hasEvolution(it.name)} : "No Pokemon with evolutions in play"
          assert my.all.any{it.turnCount < bg.turnCount && it.lastEvolved < bg.turnCount && bg().gm().hasEvolution(it.name)} : "Cannot use this on Pokémon put into play this turn"
        }
      };
      case RARE_FOSSIL_167:
      return itemCard (this) {
        text "Play this card as if it were a 70-HP Basic [C] Pokémon. At any time during your turn, you may discard this card from play. This card can’t be affected by any Special Conditions, and it can’t retreat."
        onPlay {
          Card pokemonCard, trainerCard = thisCard
          pokemonCard = basic (new CustomCardInfo(this[thisCard.enumName] as CardInfo).setCardTypes(BASIC, POKEMON), hp:HP070, type:COLORLESS, retreatCost:0) {
            customAbility{
              def ef2, acl
              onActivate{
                delayed {
                  before RETREAT, self, {
                    if(self.topPokemonCard == thisCard){
                      wcu "Cannot retreat"
                      prevent()
                    }
                  }
                  before APPLY_SPECIAL_CONDITION, self, {
                    bc "Rare Fossil can't be affected by Special Conditions"
                    prevent()
                  }
                }
                if(!ef2){
                  ef2 = delayed {
                    after REMOVE_FROM_PLAY, {
                      if(ef.removedCards.contains(pokemonCard)){
                        bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                        unregister()
                        ef2 = null
                      }
                    }
                  }
                }
                acl = action("Discard Rare Fossil", [TargetPlayer.SELF]){
                  delayed{
                    before TAKE_PRIZE, {
                      if(ef.pcs==self){
                        prevent()
                      }
                    }
                  }
                  new Knockout(self).run(bg)
                }
              }
              onDeactivate{
                acl.each{bg.gm().unregisterAction(it)}
              }
            }
          }
          pokemonCard.player = trainerCard.player
          bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
          hand.remove(pokemonCard)
          benchPCS(pokemonCard)
        }
        playRequirement{
          assert bench.notFull
        }
      };
      case ROSE_168:
      return supporter (this) {
        text "Attach up to 2 basic Energy cards from your discard pile to 1 of your Pokémon VMAX. If you attached any Energy cards in this way, discard your hand."
        onPlay {
          attachEnergyFrom(max:2, basic: true, my.discard, my.all.findAll{it.pokemonVMAX}.select("Attach Energy to which Pokémon VMAX?"))
          my.hand.discard()
        }
        playRequirement{
          assertMyAll(hasVariants: VMAX)
          assert my.discard.filterByType(BASIC_ENERGY) : "No Basic Energy in your discard pile"
        }
      };
      case ROSE_TOWER_169:
      return stadium (this) {
        text "Once during each player’s turn, that player may draw cards until they have 3 cards in their hand."
        def lastTurn=0
        def actions=[]
        onPlay {
          actions = action("Stadium: Rose Tower") {
            assert lastTurn != bg().turnCount : "Already used"
            assert my.deck : "You don't have any cards left in your deck"
            assert (my.hand.size() < 3) : "You have 3 or more cards in your hand"
            bc "Used Rose Tower"
            lastTurn = bg().turnCount
            draw (3 - my.hand.size())
          }
        }
        onRemoveFromPlay{
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case SPIKEMUTH_170:
      return stadium (this) {
        text "Whenever a player’s Active Pokémon moves to the Bench during their turn, put 2 damage counters on that Pokémon."
        def eff, switchedFromActive
        onPlay {
          eff = delayed{
            before SWITCH, {
              if (ef.fallenBack && ef.fallenBack.owner == my.owner){
                switchedFromActive = ef.fallenBack
              }
            }
            after SWITCH, {
              if (switchedFromActive){
                directDamage 20, ef.fallenBack, TRAINER_CARD //TODO: Cover Omega Barrier
                switchedFromActive = null
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case STRUGGLE_GLOVES_171:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has Weakness to your opponent’s Active Pokémon’s type, its attacks do 30 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
        def increasedDmgEff
        onPlay {reason->
          increasedDmgEff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              if (bg.currentTurn == self.owner && ef.attacker == self && self.active) {
                def flag = self.getWeaknesses().any {weakness ->
                  opp.active.types.contains(weakness.type)
                }
                if (flag){
                  bg.dm().each {
                    if (it.to.active && it.to.owner == self.owner.opposite) {
                      bc "Struggle Gloves +30"
                      it.dmg += hp(30)
                    }
                  }
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          increasedDmgEff.unregister()
        }
      };
      case TURBO_PATCH_172:
      return itemCard (this) {
        text "Flip a coin. If heads, attach a basic Energy card from your discard pile to 1 of your Basic Pokémon that isn’t a Pokémon-GX."
        onPlay {
          flip {
            attachEnergyFrom(basic:true, tostrOverride: "one of your Basic, non-GX Pokémon", my.discard, my.all.findAll{it.basic && !(it.pokemonGX)})
          }
        }
        playRequirement{
          assert my.all.findAll{it.basic && !(it.pokemonGX)} : "You have no Basic Pokémon that aren't Pokémon-GX"
          assert my.discard.filterByType(BASIC_ENERGY) : "There are no basic Energy cards in your discard pile"
        }
      };
      case YELL_HORN_173:
      return itemCard (this) {
        text "Both Active Pokémon are now Confused."
        onPlay {
          apply CONFUSED, opp.active, Source.TRAINER_CARD
          apply CONFUSED, my.active, Source.TRAINER_CARD
        }
        playRequirement{
          assert !(opp.active.isSPC(CONFUSED) && my.active.isSPC(CONFUSED)) : "Both Active Pokémon are already confused"
        }
      };
      case HEAT_FIRE_ENERGY_174:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [R] Energy. The [R] Pokémon this card is attached to gets +20 HP."
        def eff
        onPlay { reason->
          eff = getter (GET_FULL_HP, self) {h->
            if (self.types.contains(R)) {
              h.object += hp(20)
            }
          }
        }
        getEnergyTypesOverride {
          if (self) return [[R] as Set]
          else return [[] as Set]
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case HIDING_DARKNESS_ENERGY_175:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [D] Energy. The [D] Pokémon this card is attached to has no Retreat Cost."
        def eff
        onPlay { reason->
          eff = getter (GET_RETREAT_COST, BEFORE_LAST, self) {h->
            if (self.types.contains(D)) {
              h.object = 0
            }
          }
        }
        getEnergyTypesOverride {
          if (self) return [[D] as Set]
          else return [[] as Set]
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case POWERFUL_COLORLESS_ENERGY_176:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [C] Energy. The attacks of the [C] Pokémon this card is attached to do 20 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay { reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each{
                if(it.from == self && it.to.active && it.to.owner != self.owner && self.types.contains(C) && it.dmg.value) {
                  bc "Powerful [C] Energy +20"
                  it.dmg += hp(20)
                }
              }
            }
          }
        }
        getEnergyTypesOverride {
          if (self) return [[C] as Set]
          else return [[] as Set]
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case BUTTERFREE_V_177:
      return copy (BUTTERFREE_V_1, this);
      case HOUNDOOM_V_178:
      return copy (HOUNDOOM_V_21, this);
      case CENTISKORCH_V_179:
      return copy (CENTISKORCH_V_33, this);
      case VIKAVOLT_V_180:
      return copy (VIKAVOLT_V_60, this);
      case RHYPERIOR_V_181:
      return copy (RHYPERIOR_V_95, this);
      case CROBAT_V_182:
      return copy (CROBAT_V_104, this);
      case SCIZOR_V_183:
      return copy (SCIZOR_V_118, this);
      case GALARIAN_STUNFISK_V_184:
      return copy (GALARIAN_STUNFISK_V_128, this);
      case SALAMENCE_V_185:
      return copy (SALAMENCE_V_143, this);
      case KABU_186:
      return copy (KABU_163, this);
      case PIERS_187:
      return copy (PIERS_165, this);
      case POKEMON_BREEDER_S_NURTURING_188:
      return copy (POKEMON_BREEDER_S_NURTURING_166, this);
      case ROSE_189:
      return copy (ROSE_168, this);
      case BUTTERFREE_VMAX_190:
      return copy (BUTTERFREE_VMAX_2, this);
      case CENTISKORCH_VMAX_191:
      return copy (CENTISKORCH_VMAX_34, this);
      case ETERNATUS_VMAX_192:
      return copy (ETERNATUS_VMAX_117, this);
      case SCIZOR_VMAX_193:
      return copy (SCIZOR_VMAX_119, this);
      case SALAMENCE_VMAX_194:
      return copy (SALAMENCE_VMAX_144, this);
      case POKEMON_BREEDER_S_NURTURING_195:
      return copy (POKEMON_BREEDER_S_NURTURING_166, this);
      case ROSE_196:
      return copy (ROSE_168, this);
      case RILLABOOM_197:
      return copy (SwordShield.RILLABOOM_14, this);
      case COALOSSAL_198:
      return copy (RebelClash.COALOSSAL_107, this);
      case BIG_PARASOL_199:
      return copy (BIG_PARASOL_157, this);
      case TURBO_PATCH_200:
      return copy (TURBO_PATCH_172, this);
      case CAPTURE_ENERGY_201:
      return copy (RebelClash.CAPTURE_ENERGY_171, this);
        default:
      return null;
    }
  }
}
