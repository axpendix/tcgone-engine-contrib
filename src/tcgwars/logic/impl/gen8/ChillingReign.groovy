package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.gm.AttachEnergy
import tcgwars.logic.groovy.TcgStatics
import tcgwars.logic.impl.gen5.PlasmaBlast;

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
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author Lithogenn@gmail.com
 */
public enum ChillingReign implements LogicCardInfo {

  WEEDLE_1 ("Weedle", "1", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _GRASS_]),
  KAKUNA_2 ("Kakuna", "2", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _GRASS_]),
  BEEDRILL_3 ("Beedrill", "3", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, SINGLE_STRIKE, _GRASS_]),
  LEDYBA_4 ("Ledyba", "4", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  LEDIAN_5 ("Ledian", "5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HERACROSS_6 ("Heracross", "6", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _GRASS_]),
  CELEBI_V_7 ("Celebi V", "7", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  CELEBI_VMAX_8 ("Celebi VMAX", "8", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  SNOVER_9 ("Snover", "9", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _GRASS_]),
  ABOMASNOW_10 ("Abomasnow", "10", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _GRASS_]),
  DEERLING_11 ("Deerling", "11", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SAWSBUCK_12 ("Sawsbuck", "12", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BOUNSWEET_13 ("Bounsweet", "13", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  STEENEE_14 ("Steenee", "14", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TSAREENA_15 ("Tsareena", "15", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GROOKEY_16 ("Grookey", "16", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _GRASS_]),
  THWACKEY_17 ("Thwackey", "17", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _GRASS_]),
  RILLABOOM_18 ("Rillaboom", "18", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, RAPID_STRIKE, _GRASS_]),
  ZARUDE_19 ("Zarude", "19", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  BLAZIKEN_V_20 ("Blaziken V", "20", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _FIRE_]),
  BLAZIKEN_VMAX_21 ("Blaziken VMAX", "21", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _FIRE_]),
  CASTFORM_SUNNY_FORM_22 ("Castform Sunny Form", "22", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  LARVESTA_23 ("Larvesta", "23", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_24 ("Volcarona", "24", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VOLCANION_V_25 ("Volcanion V", "25", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _FIRE_]),
  SCORBUNNY_26 ("Scorbunny", "26", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIRE_]),
  RABOOT_27 ("Raboot", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _FIRE_]),
  CINDERACE_28 ("Cinderace", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, SINGLE_STRIKE, _FIRE_]),
  LAPRAS_29 ("Lapras", "29", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  SNEASEL_30 ("Sneasel", "30", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  WEAVILE_31 ("Weavile", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _WATER_]),
  DELIBIRD_32 ("Delibird", "32", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  CASTFORM_RAINY_FORM_33 ("Castform Rainy Form", "33", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  CASTFORM_SNOWY_FORM_34 ("Castform Snowy Form", "34", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  SNORUNT_35 ("Snorunt", "35", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  FROSLASS_36 ("Froslass", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SPHEAL_37 ("Spheal", "37", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  SEALEO_38 ("Sealeo", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WALREIN_39 ("Walrein", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  TAPU_FINI_40 ("Tapu Fini", "40", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  SOBBLE_41 ("Sobble", "41", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  DRIZZILE_42 ("Drizzile", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _WATER_]),
  INTELEON_43 ("Inteleon", "43", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, RAPID_STRIKE, _WATER_]),
  RAPID_STRIKE_URSHIFU_44 ("Rapid Strike Urshifu", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _WATER_]),
  ICE_RIDER_CALYREX_V_45 ("Ice Rider Calyrex V", "45", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  ICE_RIDER_CALYREX_VMAX_46 ("Ice Rider Calyrex VMAX", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  MAREEP_47 ("Mareep", "47", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_48 ("Flaaffy", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  AMPHAROS_49 ("Ampharos", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  BLITZLE_50 ("Blitzle", "50", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE]),
  ZEBSTRIKA_51 ("Zebstrika", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _LIGHTNING_]),
  THUNDURUS_52 ("Thundurus", "52", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ZERAORA_V_53 ("Zeraora V", "53", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _LIGHTNING_]),
  GALARIAN_SLOWPOKE_54 ("Galarian Slowpoke", "54", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GASTLY_55 ("Gastly", "55", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HAUNTER_56 ("Haunter", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GENGAR_57 ("Gengar", "57", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GALARIAN_ARTICUNO_V_58 ("Galarian Articuno V", "58", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  RALTS_59 ("Ralts", "59", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KIRLIA_60 ("Kirlia", "60", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GARDEVOIR_61 ("Gardevoir", "61", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  SHUPPET_62 ("Shuppet", "62", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _PSYCHIC_]),
  BANETTE_63 ("Banette", "63", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _PSYCHIC_]),
  CRESSELIA_64 ("Cresselia", "64", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLETT_65 ("Golett", "65", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_66 ("Golurk", "66", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SWIRLIX_67 ("Swirlix", "67", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SLURPUFF_68 ("Slurpuff", "68", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  INKAY_69 ("Inkay", "69", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _PSYCHIC_]),
  MALAMAR_70 ("Malamar", "70", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _PSYCHIC_]),
  HATENNA_71 ("Hatenna", "71", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HATTREM_72 ("Hattrem", "72", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATTERENE_73 ("Hatterene", "73", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_V_74 ("Shadow Rider Calyrex V", "74", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_VMAX_75 ("Shadow Rider Calyrex VMAX", "75", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  DIGLETT_76 ("Diglett", "76", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _FIGHTING_]),
  DUGTRIO_77 ("Dugtrio", "77", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, RAPID_STRIKE, _FIGHTING_]),
  GALARIAN_FARFETCH_D_78 ("Galarian Farfetch'd", "78", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_79 ("Galarian Sirfetch'd", "79", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _FIGHTING_]),
  GALARIAN_ZAPDOS_V_80 ("Galarian Zapdos V", "80", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  GALLADE_81 ("Gallade", "81", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  GALARIAN_YAMASK_82 ("Galarian Yamask", "82", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_RUNERIGUS_83 ("Galarian Runerigus", "83", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CRABRAWLER_84 ("Crabrawler", "84", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  CRABOMINABLE_85 ("Crabominable", "85", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ROCKRUFF_86 ("Rockruff", "86", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIGHTING_]),
  LYCANROC_87 ("Lycanroc", "87", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _FIGHTING_]),
  PASSIMIAN_88 ("Passimian", "88", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _FIGHTING_]),
  SANDACONDA_V_89 ("Sandaconda V", "89", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  SANDACONDA_VMAX_90 ("Sandaconda VMAX", "90", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  CLOBBOPUS_91 ("Clobbopus", "91", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_92 ("Grapploct", "92", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  KUBFU_93 ("Kubfu", "93", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_94 ("Koffing", "94", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  WEEZING_95 ("Weezing", "95", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_WEEZING_96 ("Galarian Weezing", "96", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MOLTRES_V_97 ("Galarian Moltres V", "97", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  GALARIAN_SLOWKING_98 ("Galarian Slowking", "98", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_SLOWKING_V_99 ("Galarian Slowking V", "99", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  GALARIAN_SLOWKING_VMAX_100 ("Galarian Slowking VMAX", "100", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  QWILFISH_101 ("Qwilfish", "101", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  SEVIPER_102 ("Seviper", "102", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  SPIRITOMB_103 ("Spiritomb", "103", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  LIEPARD_V_104 ("Liepard V", "104", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  VENIPEDE_105 ("Venipede", "105", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  WHIRLIPEDE_106 ("Whirlipede", "106", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SCOLIPEDE_107 ("Scolipede", "107", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  SINGLE_STRIKE_URSHIFU_108 ("Single Strike Urshifu", "108", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, SINGLE_STRIKE, _DARKNESS_]),
  ARON_109 ("Aron", "109", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  LAIRON_110 ("Lairon", "110", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AGGRON_111 ("Aggron", "111", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  METAGROSS_V_112 ("Metagross V", "112", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _METAL_]),
  METAGROSS_VMAX_113 ("Metagross VMAX", "113", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _METAL_]),
  COBALION_114 ("Cobalion", "114", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  TAUROS_115 ("Tauros", "115", Rarity.UNCOMMON, [POKEMON, BASIC, SINGLE_STRIKE, _COLORLESS_]),
  PORYGON_116 ("Porygon", "116", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  PORYGON2_117 ("Porygon2", "117", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PORYGON_Z_118 ("Porygon-Z", "118", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  BLISSEY_V_119 ("Blissey V", "119", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  ZANGOOSE_120 ("Zangoose", "120", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _COLORLESS_]),
  CASTFORM_121 ("Castform", "121", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  KECLEON_122 ("Kecleon", "122", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _COLORLESS_]),
  SHAYMIN_123 ("Shaymin", "123", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  TORNADUS_V_124 ("Tornadus V", "124", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _COLORLESS_]),
  TORNADUS_VMAX_125 ("Tornadus VMAX", "125", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _COLORLESS_]),
  FURFROU_126 ("Furfrou", "126", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  SKWOVET_127 ("Skwovet", "127", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_128 ("Greedent", "128", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  AGATHA_129 ("Agatha", "129", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AVERY_130 ("Avery", "130", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BRAWLY_131 ("Brawly", "131", Rarity.UNCOMMON, [TRAINER, RAPID_STRIKE, SUPPORTER]),
  CAITLIN_132 ("Caitlin", "132", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRUSHING_GLOVES_133 ("Crushing Gloves", "133", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  DOCTOR_134 ("Doctor", "134", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DYNA_TREE_HILL_135 ("Dyna Tree Hill", "135", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ECHOING_HORN_136 ("Echoing Horn", "136", Rarity.UNCOMMON, [TRAINER, RAPID_STRIKE, ITEM]),
  EXPEDITION_UNIFORM_137 ("Expedition Uniform", "137", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FIRE_RESISTANT_GLOVES_138 ("Fire-Resistant Gloves", "138", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FLANNERY_139 ("Flannery", "139", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  FOG_CRYSTAL_140 ("Fog Crystal", "140", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GALARIAN_CHESTPLATE_141 ("Galarian Chestplate", "141", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  HONEY_142 ("Honey", "142", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  JUSTIFIED_GLOVES_143 ("Justified Gloves", "143", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  KAREN_S_CONVICTION_144 ("Karen's Conviction", "144", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  KLARA_145 ("Klara", "145", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_146 ("Melony", "146", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OLD_CEMETERY_147 ("Old Cemetery", "147", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PATH_TO_THE_PEAK_148 ("Path to the Peak", "148", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PEONIA_149 ("Peonia", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_150 ("Peony", "150", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_SCROLL_OF_THE_SKIES_151 ("Rapid Strike Scroll of the Skies", "151", Rarity.UNCOMMON, [TRAINER, ITEM, RAPID_STRIKE, POKEMON_TOOL]),
  RUGGED_HELMET_152 ("Rugged Helmet", "152", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SIEBOLD_153 ("Siebold", "153", Rarity.UNCOMMON, [TRAINER, RAPID_STRIKE, SUPPORTER]),
  SINGLE_STRIKE_SCROLL_OF_PIERCING_154 ("Single Strike Scroll of Piercing", "154", Rarity.UNCOMMON, [TRAINER, ITEM, SINGLE_STRIKE, POKEMON_TOOL]),
  WEEDING_GLOVES_155 ("Weeding Gloves", "155", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  WELCOMING_LANTERN_156 ("Welcoming Lantern", "156", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, ITEM]),
  IMPACT_ENERGY_157 ("Impact Energy", "157", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY, SINGLE_STRIKE]),
  LUCKY_ENERGY_158 ("Lucky Energy", "158", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  SPIRAL_ENERGY_159 ("Spiral Energy", "159", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY, RAPID_STRIKE]),
  CELEBI_V_160 ("Celebi V", "160", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  BLAZIKEN_V_161 ("Blaziken V", "161", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _FIRE_]),
  VOLCANION_V_162 ("Volcanion V", "162", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _FIRE_]),
  ICE_RIDER_CALYREX_V_163 ("Ice Rider Calyrex V", "163", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  ICE_RIDER_CALYREX_V_164 ("Ice Rider Calyrex V", "164", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  ZERAORA_V_165 ("Zeraora V", "165", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _LIGHTNING_]),
  ZERAORA_V_166 ("Zeraora V", "166", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _LIGHTNING_]),
  GALARIAN_RAPIDASH_V_167 ("Galarian Rapidash V", "167", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_RAPIDASH_V_168 ("Galarian Rapidash V", "168", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_ARTICUNO_V_169 ("Galarian Articuno V", "169", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  GALARIAN_ARTICUNO_V_170 ("Galarian Articuno V", "170", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_V_171 ("Shadow Rider Calyrex V", "171", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_V_172 ("Shadow Rider Calyrex V", "172", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  GALARIAN_ZAPDOS_V_173 ("Galarian Zapdos V", "173", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  GALARIAN_ZAPDOS_V_174 ("Galarian Zapdos V", "174", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  SANDACONDA_V_175 ("Sandaconda V", "175", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  GALARIAN_MOLTRES_V_176 ("Galarian Moltres V", "176", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  GALARIAN_MOLTRES_V_177 ("Galarian Moltres V", "177", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  GALARIAN_SLOWKING_V_178 ("Galarian Slowking V", "178", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  GALARIAN_SLOWKING_V_179 ("Galarian Slowking V", "179", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  LIEPARD_V_180 ("Liepard V", "180", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  METAGROSS_V_181 ("Metagross V", "181", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, RAPID_STRIKE, _METAL_]),
  BLISSEY_V_182 ("Blissey V", "182", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  BLISSEY_V_183 ("Blissey V", "183", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  TORNADUS_V_184 ("Tornadus V", "184", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _COLORLESS_]),
  TORNADUS_V_185 ("Tornadus V", "185", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _COLORLESS_]),
  AGATHA_186 ("Agatha", "186", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AVERY_187 ("Avery", "187", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BRAWLY_188 ("Brawly", "188", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  CAITLIN_189 ("Caitlin", "189", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DOCTOR_190 ("Doctor", "190", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FLANNERY_191 ("Flannery", "191", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  HONEY_192 ("Honey", "192", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KAREN_S_CONVICTION_193 ("Karen's Conviction", "193", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  KLARA_194 ("Klara", "194", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_195 ("Melony", "195", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONIA_196 ("Peonia", "196", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_197 ("Peony", "197", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SIEBOLD_198 ("Siebold", "198", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  CELEBI_VMAX_199 ("Celebi VMAX", "199", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  BLAZIKEN_VMAX_200 ("Blaziken VMAX", "200", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _FIRE_]),
  BLAZIKEN_VMAX_201 ("Blaziken VMAX", "201", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _FIRE_]),
  ICE_RIDER_CALYREX_VMAX_202 ("Ice Rider Calyrex VMAX", "202", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  ICE_RIDER_CALYREX_VMAX_203 ("Ice Rider Calyrex VMAX", "203", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  SHADOW_RIDER_CALYREX_VMAX_204 ("Shadow Rider Calyrex VMAX", "204", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_VMAX_205 ("Shadow Rider Calyrex VMAX", "205", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  SANDACONDA_VMAX_206 ("Sandaconda VMAX", "206", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  GALARIAN_SLOWKING_VMAX_207 ("Galarian Slowking VMAX", "207", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  METAGROSS_VMAX_208 ("Metagross VMAX", "208", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, RAPID_STRIKE, _METAL_]),
  TORNADUS_VMAX_209 ("Tornadus VMAX", "209", Rarity.UNCOMMON, [POKEMON, EVOLUTION, POKEMON_V, VMAX, SINGLE_STRIKE, _COLORLESS_]),
  AGATHA_210 ("Agatha", "210", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AVERY_211 ("Avery", "211", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BRAWLY_212 ("Brawly", "212", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  CAITLIN_213 ("Caitlin", "213", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DOCTOR_214 ("Doctor", "214", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FLANNERY_215 ("Flannery", "215", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  KAREN_S_CONVICTION_216 ("Karen's Conviction", "216", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, SUPPORTER]),
  KLARA_217 ("Klara", "217", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_218 ("Melony", "218", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONIA_219 ("Peonia", "219", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_220 ("Peony", "220", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SIEBOLD_221 ("Siebold", "221", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  ELECTRODE_222 ("Electrode", "222", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  BRONZONG_223 ("Bronzong", "223", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SNORLAX_224 ("Snorlax", "224", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  ECHOING_HORN_225 ("Echoing Horn", "225", Rarity.UNCOMMON, [TRAINER, RAPID_STRIKE, ITEM]),
  FAN_OF_WAVES_226 ("Fan of Waves", "226", Rarity.UNCOMMON, [TRAINER, RAPID_STRIKE, ITEM]),
  FOG_CRYSTAL_227 ("Fog Crystal", "227", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RUGGED_HELMET_228 ("Rugged Helmet", "228", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  URN_OF_VITALITY_229 ("Urn of Vitality", "229", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, ITEM]),
  WELCOMING_LANTERN_230 ("Welcoming Lantern", "230", Rarity.UNCOMMON, [TRAINER, SINGLE_STRIKE, ITEM]),
  WATER_ENERGY_231 ("Water Energy", "231", Rarity.UNCOMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_232 ("Psychic Energy", "232", Rarity.UNCOMMON, [ENERGY, BASIC_ENERGY]),
  FIGHTING_ENERGY_233 ("Fighting Energy", "233", Rarity.UNCOMMON, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  ChillingReign(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.CHILLING_REIGN;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case WEEDLE_1:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness FIRE
          move "Pierce", {
            text "20 damage."
            energyCost GRASS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case KAKUNA_2:
        return evolution (this, from:"Weedle", hp:HP080, type:G, retreatCost:3) {
          weakness FIRE
          move "Stiffen", {
            text "During your opponent's next turn, this Pokémon takes 40 less damage from attacks (after applying Weakness and Resistance)."
            energyCost GRASS
            attackRequirement {}
            onAttack {
              reduceDamageNextTurn(hp(40), thisMove)
            }
          }
        };
      case BEEDRILL_3:
        return evolution (this, from:"Kakuna", hp:HP130, type:G, retreatCost:1) {
          weakness FIRE
          move "Persist Sting", {
            text "If your opponent's Active Pokémon has any Special Energy attached to it, it is now Knocked Out."
            energyCost GRASS
            attackRequirement {}
            onAttack {
              if (defending.cards.filterByType(SPECIAL_ENERGY)) {
                targeted (defending) {
                  new Knockout(defending).run(bg)
                }
              }
            }
          }
          move "Jet Spear", {
            text "110 damage. Discard an Energy from this Pokémon."
            energyCost GRASS
            attackRequirement {}
            onAttack {
              damage 110
              discardSelfEnergyAfterDamage C
            }
          }
        };
      case LEDYBA_4:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness FIRE
          move "Collect", {
            text "Draw a card."
            energyCost COLORLESS
            attackRequirement { assert my.deck : "Deck is empty" }
            onAttack {
              draw 1
            }
          }
          move "Punch", {
            text "20 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case LEDIAN_5:
        return evolution (this, from:"Ledyba", hp:HP090, type:G, retreatCost:1) {
          weakness FIRE
          move "Rapid Draw", {
            text "20 damage. Draw 2 cards."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
              draw 2
            }
          }
          move "Air Slash", {
            text "100 damage. Discard an Energy from this Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage C
            }
          }
        };
      case HERACROSS_6:
        return basic (this, hp:HP120, type:G, retreatCost:2) {
          weakness FIRE
          move "Horn Attack", {
            text "20 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Single-Horn Throw", {
            text "40 damage+. Flip 2 coins. If both are heads, this attack does 160 more damage."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
              flip 2, {}, {}, [2:{ damage 160 }]
            }
          }
        };
      case CELEBI_V_7:
        return basic (this, hp:HP190, type:G, retreatCost:1) {
          weakness FIRE
          move "Leaflet Dance", {
            text "Attach any number of [G] Energy from your hand to your Pokémon in any way you like."
            energyCost GRASS
            attackRequirement {
              assert my.hand.filterByEnergyType(G) : "No [G] Energy in hand"
            }
            onAttack {
              def tar = my.hand.filterByEnergyType(G)
              if (tar) {
                tar.select(min:0, max:tar.size(), "Select the ones you want to attach").each {
                  attachEnergy(my.all.select("Attach $it to?"), it)
                }
              }
            }
          }
          move "Slash Back", {
            text "60 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
              switchYourActive()
            }
          }
        };
      case CELEBI_VMAX_8:
        return evolution (this, from:"Celebi V", hp:HP310, type:G, retreatCost:1) {
          weakness FIRE
          bwAbility "Curative Forest", {
            text "Once during your turn you may heal 20 damage from each of your [G] Pokémon."
            actionA {
              checkLastTurn()
              assert my.all.find { it.numberOfDamageCounters && it.types.contains(G) } : "No damaged [G] Pokémon"
              powerUsed()

              my.all.each {
                if (it.types.contains(G))
                  heal(20, it, SRC_ABILITY)
              }
            }
          }
          move "Max Plant", {
            text "130 damage. Search your deck for up to 2 Pokémon and put them into your hand. Then, shuffle your deck."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130

              my.deck.search(max:2,"Search your deck for up to 2 Pokémon.", cardTypeFilter(POKEMON)).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
        };
      case SNOVER_9:
        return basic (this, hp:HP080, type:G, retreatCost:2) {
          weakness FIRE
          move "Whap Down", {
            text "60 damage."
            energyCost GRASS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case ABOMASNOW_10:
        return evolution (this, from:"Snover", hp:HP140, type:G, retreatCost:3) {
          weakness FIRE
          bwAbility "Toughness Boost", {
            text "As long as this Pokémon is in play, the maximum HP of your Single Strike Pokémon in play (excluding any Abomasnow) is increased by 50. You can't apply more than 1 Toughness Up Ability at a time."
            def target = []
            def source = []
            bg.em().storeObject("Toughness_Boost_target", target)
            bg.em().storeObject("Toughness_Boost_source", source)

            getterA (GET_FULL_HP) { h->
              def pcs = h.effect.target
              if (pcs.owner == self.owner && pcs.singleStrike && pcs.topPokemonCard.name != "Abomasnow"){
                target = bg.em().retrieveObject("Toughness_Boost_target")
                source = bg.em().retrieveObject("Toughness_Boost_source")
                if (!target.contains(pcs)) {
                  h.object += hp(50)
                  target.add(pcs)
                  bg.em().storeObject("Toughness_Boost_target", target)
                  source.add(self)
                  bg.em().storeObject("Toughness_Boost_source", source)
                } else if (source.get(target.indexOf(pcs)) == self) {
                  h.object += hp(50)
                }
              }
            }
          }
          move "Mega Punch", {
            text "90 damage."
            energyCost GRASS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case DEERLING_11:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness FIRE
          move "Growl", {
            text "During your opponent's next turn, damage done by the Defending Pokémon's attacks is reduced by 20."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Rear Kick", {
            text "20 damage."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SAWSBUCK_12:
        return evolution (this, from:"Deerling", hp:HP110, type:G, retreatCost:1) {
          weakness FIRE
          move "Tackle", {
            text "30 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Winter Horn", {
            text "80+ damage. If you have a Stadium in play, this attack does 80 more damage."
            energyCost GRASS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                damage 80
              }
            }
          }
        };
      case BOUNSWEET_13:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness FIRE
          move "Splash", {
            text "30 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case STEENEE_14:
        return evolution (this, from:"Bounsweet", hp:HP080, type:G, retreatCost:1) {
          weakness FIRE
          move "Splash", {
            text "20 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Stomp", {
            text "50+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost GRASS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
              flip { damage 30 }
            }
          }
        };
      case TSAREENA_15:
        return evolution (this, from:"Steenee", hp:HP140, type:G, retreatCost:2) {
          weakness FIRE
          move "Tread On", {
            text "10+ damage. This attack does 50 more damage for each Energy in the Retreat Cost of your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
              damage opp.active.retreatCost * 50
            }
          }
          move "Solar Beam", {
            text "120 damage."
            energyCost GRASS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
            }
          }
        };
      case GROOKEY_16:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness FIRE
          move "Hit Twice", {
            text "30x damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              flip 2, { damage 30 }
            }
          }
        };
      case THWACKEY_17:
        return evolution (this, from:"Grookey", hp:HP100, type:G, retreatCost:2) {
          weakness FIRE
          move "Knock Off", {
            text "30 damage. Discard a random card from your opponent's hand."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                discardRandomCardFromOpponentsHand()
              }
            }
          }
        };
      case RILLABOOM_18:
        return evolution (this, from:"Thwackey", hp:HP180, type:G, retreatCost:3) {
          weakness FIRE
          move "Wood Drain", {
            text "60 damage. Heal 30 damage from this Pokémon."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                heal 30, self
              }
            }
          }
          move "Raging Repeated Strike", {
            text "120+ damage. You may discard any number of Energy cards attached to your Pokémon in play. If you do, this attack does 30 more damage for each card discarded in this way."
            energyCost GRASS, GRASS, COLORLESS
            attackRequirement {
              assert my.all.any { it.cards.energyCount() } : "No Pokémon with energy cards attached"
            }
            onAttack {
              damage 120
              additionalDamageByDiscardingCardTypeFromPokemon 30, ENERGY
            }
          }
        };
      case ZARUDE_19:
        return basic (this, hp:HP130, type:G, retreatCost:2) {
          weakness FIRE
          move "Pack Call", {
            text "Search your deck for a [G] Pokémon, reveal it, and put it in your hand. Then, shuffle your deck. If you go second, on your first turn you may search for up to 3 [G] Pokémon instead."
            energyCost GRASS
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              def maxSearch = (bg.turnCount == 2) ? 3 : 1

              my.deck.search(min: 0, max: maxSearch, {
                it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(G)
              }).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Repeated Whip", {
            text "60+ damage. Does 20 additional damage for each [G] Energy attached to this Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60 + 20 * self.cards.energyCount(G)
            }
          }
        };
      case BLAZIKEN_V_20:
        return basic (this, hp:HP210, type:R, retreatCost:2) {
          weakness WATER
          move "High Jump Kick", {
            text "50 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Fire Spin", {
            text "210 damage. Discard 2 Energy from this Pokémon."
            energyCost FIRE, FIRE, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 210
              discardSelfEnergyAfterDamage(C, C)
            }
          }
        };
      case BLAZIKEN_VMAX_21:
        return evolution (this, from:"Blaziken V", hp:HP320, type:R, retreatCost:2) {
          weakness WATER
          move "Clutch", {
            text "60 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost FIRE
            attackRequirement {}
            onAttack {
              damage 60
              cantRetreat defending
            }
          }
          move "Max Blaze", {
            text "130 damage. Attach an Energy card from your discard pile to up to 2 of your Benched Rapid Strike Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130

              afterDamage {
                def rapidStrikes = my.bench.findAll { it.rapidStrike }
                if (rapidStrikes && my.discard.filterByType(ENERGY)) {
                  def max = Math.min(my.discard.filterByType(ENERGY).size(), 2)
                  def targets = multiSelect(rapidStrikes, 1, max, "Attach to?")
                  targets.each {
                    if (my.discard.filterByType(ENERGY)) {
                      attachEnergyFrom(my.discard, it)
                    }
                  }
                }
              }
            }
          }
        };
      case CASTFORM_SUNNY_FORM_22:
        return basic (this, hp:HP070, type:R, retreatCost:0) {
          weakness WATER
          bwAbility "Weather Reading", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon's attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, { h->
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                if (my.discard.filterByType(STADIUM).size() >= 8){
                  copy.energyCost.retainAll()
                }
                list.add(copy)
              }
              h.object=list
            }
          }
          move "High-Pressure Blast", {
            text "150 damage. You must discard a Stadium card in play in order to use this attack."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {
              assert bg.stadiumInfoStruct : "No Stadium in play"
            }
            onAttack {
              if (bg.stadiumInfoStruct) {
                damage 150
                afterDamage {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
        };
      case LARVESTA_23:
        return basic (this, hp:HP080, type:R, retreatCost:3) {
          weakness WATER
          move "Flame Charge", {
            text "10 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost FIRE
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                attachEnergyFrom(type:R, my.deck, self)
                shuffleDeck()
              }
            }
          }
        };
      case VOLCARONA_24:
        return evolution (this, from:"Larvesta", hp:HP130, type:R, retreatCost:2) {
          weakness WATER
          move "Combustion", {
            text "50 damage."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Fire Spin", {
            text "170 damage. Discard 2 Energy from this Pokémon."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 170
              discardSelfEnergyAfterDamage(C, C)
            }
          }
        };
      case VOLCANION_V_25:
        return basic (this, hp:HP220, type:R, retreatCost:3) {
          weakness WATER
          move "Heat Blast", {
            text "50 damage."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Dynamite Tackle", {
            text "100+ damage. If this Pokémon has 10 damage counters or more on it, this attack does 150 more damage."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
              if (self.numberOfDamageCounters >= 10) {
                damage 150
              }
            }
          }
        };
      case SCORBUNNY_26:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness WATER
          move "Headbutt", {
            text "20 damage."
            energyCost FIRE
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case RABOOT_27:
        return evolution (this, from:"Scorbunny", hp:HP090, type:R, retreatCost:1) {
          weakness WATER
          move "Volley Kick", {
            text "60 damage. During your next turn, this Pokémon can't attack."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
              cantAttackNextTurn self
            }
          }
        };
      case CINDERACE_28:
        return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
          weakness WATER
          bwAbility "Crisis Power", {
            text "This Pokémon's attacks do 30 more damage to your opponent's Active Pokémon for each Prize card your opponent has already taken."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self && opp.prizeCardSet.takenCount) {
                  bg.dm().each {
                    if (it.to != self.owner && it.to.active && it.notNoEffect && it.dmg.value) {
                      def bonus = opp.prizeCardSet.takenCount * 30
                      bc "$thisAbility +$bonus"
                      it.dmg += hp(bonus)
                    }
                  }
                }
              }
            }
          }
          move "Fireball Shot", {
            text "150 damage. This Pokémon can't attack during your next turn."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 150
              cantAttackNextTurn self
            }
          }
        };
      case LAPRAS_29:
        return basic (this, hp:HP110, type:W, retreatCost:1) {
          weakness METAL
          move "Wintry Call", {
            text "Search your deck for up to 2 Melony cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              my.deck.search (min: 0, max: 2, "Search your deck for up to 2 Melony cards and put them onto your hand", {
                it.name == "Melony"
              }).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Icy Wind", {
            text "50 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
              applyAfterDamage(ASLEEP)
            }
          }
        };
      case SNEASEL_30:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness METAL
          move "Cut Down", {
            text "Flip a coin. If heads, discard an Energy attached to your opponent's Active Pokémon."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              flip { discardDefendingEnergy() }
            }
          }
        };
      case WEAVILE_31:
        return evolution (this, from:"Sneasel", hp:HP110, type:W, retreatCost:1) {
          weakness METAL
          move "Two-Hit KO", {
            text "If the Defending Pokémon takes damage from 1 of your Rapid Strike Pokémon during your next turn, it is Knocked Out."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              targeted (defending) {
                bc "During ${self.owner}'s next turn, if $defending is damaged by an attack from a Rapid Strike Pokémon, it will be Knocked Out. (This effect can be removed by benching/evolving $defending)"
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    if (bg.currentTurn == self.owner) {
                      bg.dm().each {
                        if (it.to == defending && it.dmg.value && it.notNoEffect && it.from.rapidStrike) {
                          bc "$thisMove activates"
                          new Knockout(opp.active).run(bg)
                        }
                      }
                    }
                  }
                  after CHANGE_STAGE, defending, { unregister() }
                  after FALL_BACK, defending, { unregister() }
                  unregisterAfter 3
                }
              }
            }
          }
          move "Nasty Plot", {
            text "Search your deck for up to 2 cards and put them in your hand. Then, shuffle your deck."
            energyCost WATER
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              if (my.deck) {
                my.deck.search(min:1, max: 2, "Select up to 2 cards", { true }).moveTo(hidden: true, my.hand)
                shuffleDeck()
              }
            }
          }
        };
      case DELIBIRD_32:
        return basic (this, hp:HP090, type:W, retreatCost:1) {
          weakness METAL
          move "Icy Snow", {
            text "10 damage."
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Package Delivery", {
            text "Return this Pokémon and all cards attached to it to your deck. Then search your deck for any card, put it in your hand, and shuffle your deck."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              self.cards.moveTo(my.deck)
              removePCS(self)

              my.deck.select(count: 1).moveTo(hidden:true, my.hand)
              shuffleDeck()
            }
          }
        };
      case CASTFORM_RAINY_FORM_33:
        return basic (this, hp:HP070, type:W, retreatCost:0) {
          weakness LIGHTNING
          bwAbility "Weather Reading", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon's attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, { h->
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                if (my.discard.filterByType(STADIUM).size() >= 8){
                  copy.energyCost.retainAll()
                }
                list.add(copy)
              }
              h.object=list
            }
          }
          move "Rainfall", {
            text "This attack does 20 damage to each of your opponent's Pokémon."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              opp.all.each {
                damage 20, it
              }
            }
          }
        };
      case CASTFORM_SNOWY_FORM_34:
        return basic (this, hp:HP070, type:W, retreatCost:0) {
          weakness METAL
          bwAbility "Weather Reading", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon's attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, { h->
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                if (my.discard.filterByType(STADIUM).size() >= 8){
                  copy.energyCost.retainAll()
                }
                list.add(copy)
              }
              h.object=list
            }
          }
          move "Frosty Typhoon", {
            text "120 damage. This Pokémon can't use Frost Typhoon during your next turn."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
              cantUseAttack(thisMove, self)
            }
          }
        };
      case SNORUNT_35:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness METAL
          move "Headbutt", {
            text "30 damage."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case FROSLASS_36:
        return evolution (this, from:"Snorunt", hp:HP090, type:W, retreatCost:1) {
          weakness METAL
          bwAbility "Frost Over", {
            text "Once during your turn when you play this card from your hand to evolve a Pokémon, you may search your discard pile for a [W] Energy and attach it to 1 of your Pokémon."
            onActivate { reason->
              if (reason == PLAY_FROM_HAND && my.discard.filterByEnergyType(W) && confirm("Use Snowfall?")) {
                powerUsed()
                attachEnergyFrom(count:1, type: W, my.discard, my.all.select("Attach to?"))
              }
            }
          }
          move "Crystal Breath", {
            text "90 damage. This Pokémon can't attack during your next turn."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
              cantAttackNextTurn self
            }
          }
        };
      case SPHEAL_37:
        return basic (this, hp:HP070, type:W, retreatCost:2) {
          weakness METAL
          move "Ram", {
            text "10 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case SEALEO_38:
        return evolution (this, from:"Spheal", hp:HP110, type:W, retreatCost:4) {
          weakness METAL
          move "Ram", {
            text "30 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Aurora Beam", {
            text "70 damage."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {TAUROS_115
              damage 70
            }
          }
        };
      case WALREIN_39:
        return evolution (this, from:"Sealeo", hp:HP170, type:W, retreatCost:4) {
          weakness METAL
          move "Aurora Beam", {
            text "70 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
          move "Hail Prison", {
            text "160 damage. Discard 2 Energy from this Pokémon. If you do, the opponent's Active Pokémon is now Paralyzed."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 160
              discardSelfEnergyAfterDamage(C, C)
              applyAfterDamage(PARALYZED)
            }
          }
        };
      case TAPU_FINI_40:
        return basic (this, hp:HP120, type:W, retreatCost:1) {
          weakness LIGHTNING
          move "Smash Turn", {
            text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                switchYourActive(may: true)
              }
            }
          }
          move "Ocean Loop", {
            text "120 damage. Return an Energy from this Pokémon to your hand."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
              moveSelfEnergyAfterDamage(my.hand)
            }
          }
        };
      case SOBBLE_41:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness LIGHTNING
          move "Keep Calling", {
            text "Search your deck for up to 3 Rapid Strike Basic Pokémon and put them on your Bench. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert my.deck : "Deck is empty"
              assert my.bench.notFull : "Bench is full"
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount, 3)
              if (maxSpace > 0) {
                my.deck.search(min: 0, max: maxSpace, "Search your deck for up to $maxSpace Rapid Strike Basic Pokémon", {
                  it.cardTypes.pokemon && it.cardTypes.is(RAPID_STRIKE) && it.cardTypes.is(BASIC)
                }).each {
                  benchPCS(it)
                }
                shuffleDeck()
              }
            }
          }
          move "Double Spin", {
            text "Flip 2 coins, this attack does 20 damage times the number of heads."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }
        };
      case DRIZZILE_42:
        return evolution (this, from:"Sobble", hp:HP090, type:W, retreatCost:1) {
          weakness LIGHTNING
          move "Bounce", {
            text "40 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
              switchYourActive()
            }
          }
        };
      case INTELEON_43:
        return evolution (this, from:"Drizzile", hp:HP150, type:W, retreatCost:1) {
          weakness LIGHTNING
          bwAbility "Quick Shooting", {
            text "Once during your turn, you may place 2 damage counters on 1 of your opponent's Pokémon."
            actionA {
              checkLastTurn()
              if (confirm("Use Quick Shooting?")) {
                powerUsed()
                def pcs = opp.all.select("Place 2 damage counters on which Pokémon?")
                directDamage 20, pcs, SRC_ABILITY
              }
            }
          }
          move "Waterfall", {
            text "70 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
        };
      case RAPID_STRIKE_URSHIFU_44:
        return evolution (this, from:"Kubfu", hp:HP140, type:W, retreatCost:2) {
          weakness LIGHTNING
          move "Slashing Claw", {
            text "40 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Rapid-Fisted Rush", {
            text "Does 30 damage for each of your Rapid Strike Pokémon in play."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30 * my.all.count { it.rapidStrike }
            }
          }
        };
      case ICE_RIDER_CALYREX_V_45:
        return basic (this, hp:HP210, type:W, retreatCost:2) {
          weakness METAL
          move "Pierce", {
            text "40 damage."
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Glacial Lance", {
            text "200 damage. Discard 2 Energy from this Pokémon."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 200
              discardSelfEnergyAfterDamage(C, C)
            }
          }
        };
      case ICE_RIDER_CALYREX_VMAX_46:
        return evolution (this, from:"Ice Rider Calyrex V", hp:HP320, type:W, retreatCost:2) {
          weakness METAL
          move "Ride of the High King", {
            text "10+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10 + 30 * opp.bench.size()
            }
          }
          move "Max Lance", {
            text "10+ damage. You may discard up to 2 Energy cards from this Pokémon. If you do, this attack does 120 more damage for each Energy card discarded in this way."
            energyCost WATER, WATER
            attackRequirement {}
            onAttack {
              def cards = self.cards.filterByType(ENERGY).select(min: 0, max: 2, "For each energy discarded, do +120")
              damage 10 + 120 * cards.size()
              afterDamage {
                cards.discard()
              }
            }
          }
        };
      case MAREEP_47:
        return basic (this, hp:HP070, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Growl", {
            text "During your opponent's next turn, any damage done by the Defending Pokémon is reduced by 20."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Static Shock", {
            text "20 damage."
            energyCost LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case FLAAFFY_48:
        return evolution (this, from:"Mareep", hp:HP100, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Electro Ball", {
            text "50 damage."
            energyCost LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case AMPHAROS_49:
        return evolution (this, from:"Flaaffy", hp:HP160, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Thunder Shock", {
            text "50 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {
              damage 50
              flipThenApplySC(PARALYZED)
            }
          }
          move "Searchlight Tail", {
            text "90+ damage. Look at your opponent's hand. If you find any Energy there, this attack does 90 more damage."
            energyCost LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90

              if (opp.hand) {
                opp.hand.showToMe("Your opponent's hand")
                if (opp.hand.filterByType(ENERGY)) {
                  bc "Energy was found in Opponent's hand"
                  damage 90
                }
              }
            }
          }
        };
      case BLITZLE_50:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness FIGHTING
          move "Thunder Spear", {
            text "This attack does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon)"
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select("Deal damage to?")
            }
          }
        };
      case ZEBSTRIKA_51:
        return evolution (this, from:"Blitzle", hp:HP120, type:L, retreatCost:1) {
          weakness FIGHTING
          initHook { Card thisCard ->
            delayed (priority: LAST) {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker.owner == thisCard.player && ef.attacker.rapidStrike) {
                  bg.em().storeObject("Coordinated_Bolt_${thisCard.player}", bg.turnCount)
                  bg.em().storeObject("Coordinated_Bolt_Attacker_${thisCard.player}", ef.attacker.hashCode())
                }
              }
            }
          }
          move "Coordinated Bolt", {
            text "30+ damage. If any of your other Rapid Strike Pokémon used an attack during your last turn, this attack does 90 more damage."
            energyCost COLORLESS
            onAttack {
              damage 30

              def tc = bg.em().retrieveObject("Coordinated_Bolt_${thisCard.player}") ?: -1
              def attacker = bg.em().retrieveObject("Coordinated_Bolt_Attacker_${thisCard.player}")
              if (tc == bg.turnCount - 2 && attacker != self.hashCode() && opp.bench) {
                damage 90
              }
            }
          }
          move "Spark Rush", {
            text "90x damage. Flip a coin until you get tails. This attack does 90 damage for each heads."
            energyCost LIGHTNING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              flipUntilTails { damage 90 }
            }
          }
        };
      case THUNDURUS_52:
        return basic (this, hp:HP120, type:L, retreatCost:1) {
          weakness FIGHTING
          move "Assisting Spark", {
            text "30 damage. You may attach a [L] from your hand to 1 of your Benched Pokémon."
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                attachEnergyFrom(type:L, may:true, my.hand, my.bench)
              }
            }
          }
          move "Thunder", {
            text "130 damage. This Pokémon does 30 damage to itself."
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
              damage 30, self
            }
          }
        };
      case ZERAORA_V_53:
        return basic (this, hp:HP210, type:L, retreatCost:2) {
          weakness FIGHTING
          initHook { Card thisCard ->
            delayed (priority: LAST) {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker.owner == thisCard.player && ef.attacker.rapidStrike) {
                  bg.em().storeObject("Cross_Fist_${thisCard.player}", bg.turnCount)
                  bg.em().storeObject("Cross_Fist_Attacker_${thisCard.player}", ef.attacker.hashCode())
                }
              }
            }
          }
          move "Cross Fist", {
            text "100 damage. If any of your other Rapid Strike Pokémon used an attack during your last turn, this attack does 160 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon)"
            energyCost LIGHTNING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100

              def tc = bg.em().retrieveObject("Cross_Fist_${thisCard.player}") ?: -1
              def attacker = bg.em().retrieveObject("Cross_Fist_Attacker_${thisCard.player}")
              if (tc == bg.turnCount - 2 && attacker != self.hashCode() && opp.bench) {
                damage 160, opp.bench.select("Deal damage to?")
              }
            }
          }
        };
      case GALARIAN_SLOWPOKE_54:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Sharpness", {
            text "10 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Headbutt", {
            text "20 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case GASTLY_55:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Sleep Pulse", {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Asleep."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC(ASLEEP)
            }
          }
        };
      case HAUNTER_56:
        return evolution (this, from:"Gastly", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Will-O-Wisp", {
            text "30 damage"
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GENGAR_57:
        return evolution (this, from:"Haunter", hp:HP130, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Last Gift", {
            text "If this Pokémon is Knocked Out by damage from an attack from your opponent’s Pokémon, search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            delayedA (priority: LAST) {
              before (KNOCKOUT, self) {
                if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite && self.owner.pbg.deck) {
                  bc "$thisAbility activates"
                  self.owner.pbg.deck.select(min: 1, max: 2, "Search for up to 2 cards").moveTo(self.owner.pbg.hand, hidden: true)
                  shuffleDeck(null, self.owner.toTargetPlayer())
                }
              }
            }
          }
          move "Pain Burst", {
            text "10+ damage. This attack does 40 more damage for each damage counter on your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10 + 40 * defending.numberOfDamageCounters
            }
          }
        };
      case GALARIAN_ARTICUNO_V_58:
        return basic (this, hp:HP210, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Reconstitute", {
            text "Once during your turn, you may discard 2 cards from your hand. If you do, draw 1 card."
            actionA {
              checkLastTurn()
              assert my.hand.size() >= 2 : "Need at least 2 cards in hand"
              assert my.deck : "Deck is empty"
              powerUsed()

              my.hand.select(count: 2, "Discard 2 cards").discard()
              draw 1
            }
          }
          move "Psyray", {
            text "110 damage. Your opponent's Active Pokémon is now Confused."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 110
              applyAfterDamage(CONFUSED)
            }
          }
        };
      case RALTS_59:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness METAL
          move "Confuse Ray", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              apply(CONFUSED)
            }
          }
        };
      case KIRLIA_60:
        return evolution (this, from:"Ralts", hp:HP080, type:P, retreatCost:1) {
          weakness METAL
          move "Mirage Step", {
            text "Search your deck for up to 3 Pokemon named 'Kirlia' and put them on your Bench. Then, shuffle your deck"
            energyCost PSYCHIC
            attackRequirement {
              assert my.deck: "Deck is empty"
              assert my.bench.notFull: "Bench is full"
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount, 3)
              if (maxSpace > 0) {
                my.deck.search(min: 0, max: maxSpace, "Search your deck for up to $maxSpace Kirlia cards and put them onto your hand", {
                  it.name == "Kirlia"
                }).each {
                  benchPCS(it)
                }
                shuffleDeck()
              }
            }
          }
        };
      case GARDEVOIR_61:
        return evolution (this, from:"Kirlia", hp:HP140, type:P, retreatCost:2) {
          weakness METAL
          bwAbility "Shining Arcana", {
            text "Once during your turn you may look at the top 2 cards of your deck. Choose any number of basic Energy you find there and attach them to your Pokémon in any way you like. Put the other cards into your hand."
            actionA {
              checkLastTurn()
              assert my.deck : "Deck is empty"
              powerUsed()

              def maxSize = Math.min(my.deck.size(), 2)
              def topCards = my.deck.subList(0, maxSize)
              def selectedEnergies = topCards.select(min: 0, max: topCards.filterByType(BASIC_ENERGY).size(), "Which Basic Energies to attach?", cardTypeFilter(BASIC_ENERGY))

              selectedEnergies.each {
                attachEnergy(my.all.select("Attach $it to which Pokémon"), it)
              }
              def nonSelectedSize = maxSize - selectedEnergies.size()
              if (nonSelectedSize) {
                my.deck.subList(0, nonSelectedSize).moveTo(hidden: true, my.hand)
              }
            }
          }
          move "Brainwave", {
            text "60+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60 + 30 * self.cards.energyCount(P)
            }
          }
        };
      case SHUPPET_62:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Will-O-Wisp", {
            text "20 damage"
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BANETTE_63:
        return evolution (this, from:"Shuppet", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Resolute Spite", {
            text "20x damage. Put up to 7 damage counters on this Pokémon. This attack does 20 damage for each damage counter you placed in this way."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              def count = choose([1, 2, 3, 4, 5, 6, 7], "How many damage counters would you like to put on $self? Does 20 damage for each") as Integer
              damage 20 * count
              afterDamage {
                directDamage 10 * count, self
              }
            }
          }
          move "Eerie Light", {
            text "50 damage. Your opponent's Active Pokémon is now Confused."
            energyCost PSYCHIC, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
              applyAfterDamage(CONFUSED)
            }
          }
        };
      case CRESSELIA_64:
        return basic (this, hp:HP120, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Crescent Glow", {
            text "Search your deck for a [P] Energy and attach it to 1 of your Pokémon. Then, shuffle your deck. If you go second, on your first turn you may attach up to 3 [P] Energy to 1 of your Pokémon instead."
            energyCost PSYCHIC
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              def maxSearch = (bg.turnCount == 2) ? 3 : 1

              def cards = my.deck.search(min: 0, max: maxSearch, {
                it.cardTypes.is(ENERGY) && it.asEnergyCard().containsType(P)
              })
              def target = my.all.select("Attach energies to?")
              cards.each {
                attachEnergy(target, it)
              }
              shuffleDeck()
            }
          }
          move "Photon Laser", {
            text "30+ damage. If you have 5 or more Energy in play, this attack does 90 more damage."
            energyCost PSYCHIC, PSYCHIC
            attackRequirement {}
            onAttack {
              damage 30
              def energyInPlay = thisCard.player.pbg.all.sum { it.cards.energyCount() }
              if (energyInPlay >= 5) {
                damage 90
              }
            }
          }
        };
      case GOLETT_65:
        return basic (this, hp:HP090, type:P, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Pound", {
            text "10 damage."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Punch", {
            text "30 damage."
            energyCost PSYCHIC, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GOLURK_66:
        return evolution (this, from:"Golett", hp:HP150, type:P, retreatCost:4) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Reinforced Punch", {
            text "60+ damage. If this Pokémon has a Pokémon Tool attached to it, this attack does 90 more damage."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
              if (self.cards.filterByType(POKEMON_TOOL)) {
                damage 90
              }
            }
          }
          move "Megaton Fall", {
            text "190 damage. This Pokémon does 30 damage to itself."
            energyCost PSYCHIC, PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 190
              damage 30, self
            }
          }
        };
      case SWIRLIX_67:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness METAL
          move "Draining Kiss", {
            text "20 damage. Heal 10 damage from this Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
              heal 10, self
            }
          }
        };
      case SLURPUFF_68:
        return evolution (this, from:"Swirlix", hp:HP110, type:P, retreatCost:2) {
          weakness METAL
          move "Follow the Scent", {
            text "Flip 3 coins. For each heads, choose a card from your discard pile, show it to your opponent, and put it into your hand."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assert my.discard : "No cards in discard"
            }
            onAttack {
              def count = 0
              flip 3, {
                count += 1
              }
              if (count > 0) {
                my.discard.select(min: 1, max: count).showToOpponent("Cards to be placed into hand").moveTo(my.hand)
              }
            }
          }
          move "Fairy Wind", {
            text "80 damage."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
            }
          }
        };
      case INKAY_69:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Spinning Attack", {
            text "20 damage."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case MALAMAR_70:
        return evolution (this, from:"Inkay", hp:HP120, type:P, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Rapid Strike Tentacles", {
            text "40x damage. You may reveal as many Rapid Strike cards from you hand as you like. This attack does 40 damage times the number of cards you revealed. Then, shuffle those cards into your deck."
            energyCost PSYCHIC
            attackRequirement {
              assert my.hand.filterByType(RAPID_STRIKE) : "No Rapid Strike cards in hand"
            }
            onAttack {
              def rapidStrike = my.hand.select(min: 0, max:my.hand.filterByType(RAPID_STRIKE).size(),"Choose Rapid Strike cards to shuffle into deck", cardTypeFilter(RAPID_STRIKE))
              if (rapidStrike) {
                rapidStrike.showToOpponent("Cards to shuffle into deck, does 40x damage for each")
                damage 40 * rapidStrike.size()
                afterDamage {
                  rapidStrike.moveTo(my.deck)
                  shuffleDeck()
                }
              }
            }
          }
        };
      case HATENNA_71:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Psyshot", {
            text "20 damage."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case HATTREM_72:
        return evolution (this, from:"Hatenna", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Spiral Drain", {
            text "30 damage. Heal 30 damage from this Pokémon."
            energyCost PSYCHIC
            onAttack {
              damage 30
              heal 30, self
            }
          }
        };
      case HATTERENE_73:
        return evolution (this, from:"Hattrem", hp:HP130, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Witch Rondo", {
            text "Once during your turn, you may switch your Active Pokémon with 1 of your Benched Pokémon, then have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
            actionA {
              checkLastTurn()
              assert my.bench.notEmpty || opp.bench.notEmpty : "Neither player has Benched Pokémon"
              powerUsed()
              if (my.bench.notEmpty) {
                sw my.active, my.bench.select("New active")
              }

              if (opp.bench.notEmpty) {
                sw opp.active, opp.bench.oppSelect("New active")
              }
            }
          }
          move "Psychic", {
            text "30+ damage. This attack does 50 more damage for each Energy attached to your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30 + 50 * defending.cards.energyCount(C)
            }
          }
        };
      case SHADOW_RIDER_CALYREX_V_74:
        return basic (this, hp:HP210, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Shadow Mist", {
            text "10 damage. Your opponent can't play any Special Energy cards or Stadium cards from their hand during their next turn."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10

              delayed {
                before ATTACH_ENERGY, {
                  if (ef.reason == PLAY_FROM_HAND && ef.card.cardTypes.is(SPECIAL_ENERGY) && bg.currentTurn == self.owner.opposite) {
                    wcu "$thisMove prevents playing Special Energy Cards this turn"
                    prevent()
                  }
                }
                before PLAY_TRAINER, {
                  if (ef.cardToPlay.cardTypes.is(STADIUM) && bg.currentTurn == self.owner.opposite) {
                    wcu "$thisMove prevents playing Stadium cards this turn"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Astral Barrage", {
            text "Put 5 damage counters on 2 of your opponent's Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              ( opp.all.size() > 2 ? multiSelect(opp.all, 2, text) : opp.all ).each {
                directDamage 50, it
              }
            }
          }
        };
      case SHADOW_RIDER_CALYREX_VMAX_75:
        return evolution (this, from:"Shadow Rider Calyrex V", hp:HP320, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Underworld Door", {
            text "Once during your turn you may attach a [P] Energy card from your hand to 1 of your Benched [P] Pokémon. Then, draw 2 cards."
            actionA {
              checkLastTurn()
              assert my.hand.hasEnergyType(P) : "You have no [P] Energy cards in your hand"
              assertMyBench(hasType: P)
              powerUsed()
              attachEnergyFrom(type:P, my.hand, my.bench.findAll { it.types.contains(P) })
              draw 2
            }
          }
          move "Max Geist", {
            text "10+ damage. This attack does 30 more damage for each [P] Energy attached to your Pokémon in play."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10 + 30 * my.all.sum { it.cards.energyCount(P) }
            }
          }
        };
      case DIGLETT_76:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness GRASS
          move "Dig", {
            text "10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to this Pokémon."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
        };
      case DUGTRIO_77:
        return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
          weakness GRASS
          move "Triple Heads", {
            text "60x damage. Flip 3 coins. This attack does 60 damage times the number of heads. If all of the coins are heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost FIGHTING, COLORLESS
            attackRequirement {}
            onAttack {
              def count = 0
              flip 3, {
                count += 1
                damage 60
              }
              if (count == 3) {
                preventAllEffectsNextTurn()
              }
            }
          }
        };
      case GALARIAN_FARFETCH_D_78:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness PSYCHIC
          move "Puncture", {
            text "20 damage. This attack's damage isn't affected by Resistance."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 20
              dontApplyResistance()
            }
          }
        };
      case GALARIAN_SIRFETCH_D_79:
        return evolution (this, from:"Galarian Farfetch'd", hp:HP130, type:F, retreatCost:2) {
          weakness PSYCHIC
          move "Peck", {
            text "40 damage."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Leek Strike", {
            text "70+ damage. If this Pokémon has a Pokémon Tool attached, this attack does 90 more damage and this attack's damage isn't affected by Resistance."
            energyCost FIGHTING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
              if (self.cards.hasType(POKEMON_TOOL)) {
                damage 90
                dontApplyResistance()
              }
            }
          }
        };
      case GALARIAN_ZAPDOS_V_80:
        return basic (this, hp:HP200, type:F, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Fighting Instinct", {
            text "For each Pokémon V your opponent has in play, this Pokémon's attacks cost [C] less."
            getterA (GET_MOVE_LIST, BEFORE_LAST, self) { h->
              if (self.owner.opposite.pbg.all.find { it.pokemonV || it.pokemonVMAX }) {
                if (h.effect.target.owner) {
                  def list = []
                  for (move in h.object) {
                    def copy = move.shallowCopy()

                    self.owner.opposite.pbg.all.findAll { it.pokemonV || it.pokemonVMAX }.each {
                      copy.energyCost.remove(C)
                    }

                    list.add(copy)
                  }
                  h.object=list
                }
              }
            }
          }
          move "Thunderous Kick", {
            text "170 damage. Before doing damage, discard a Special Energy from your opponent's Active Pokémon."
            energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              targeted (defending) {
                if (defending.cards.filterByType(SPECIAL_ENERGY)){
                  defending.cards.filterByType(SPECIAL_ENERGY).select("Discard").discard()
                }
              }
              damage 170
            }
          }
        };
      case GALLADE_81:
        return evolution (this, from:"Kirlia", hp:HP170, type:F, retreatCost:2) {
          weakness PSYCHIC
          move "Feint", {
            text "60 damage. This attack isn't affected by Resistance."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 60
              dontApplyResistance()
            }
          }
          move "Dynablade", {
            text "This attack does 60 damage times the number of your opponent's Pokémon V in play."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assertOppAll(hasVariants: POKEMON_V)
            }
            onAttack {
              damage 60 * opp.all.count { it.pokemonV }
            }
          }
        };
      case GALARIAN_YAMASK_82:
        return basic (this, hp:HP060, type:F, retreatCost:2) {
          weakness GRASS
          move "Brutal Swing", {
            text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }
        };
      case GALARIAN_RUNERIGUS_83:
        return evolution (this, from:"Galarian Yamask", hp:HP120, type:F, retreatCost:2) {
          weakness GRASS
          bwAbility "Spiteful Slate", {
            text "If this Pokémon is in the Active Spot and is damaged by an attack from your opponent's Pokémon VMAX (even if this Pokémon is Knocked Out), put damage counters on the Attacking Pokémon equal to the damage done to this Pokémon."
            delayedA (priority:LAST) {
              def counterDmg = 0
              before APPLY_ATTACK_DAMAGES, {
                if (self.active && ef.attacker.owner != self.owner && (ef.attacker.topPokemonCard.cardTypes.is(VMAX))) {
                  bg.dm().each {
                    if (it.to == self && it.dmg.value) {
                      counterDmg = it.dmg.value
                    }
                  }
                }
              }
              after APPLY_ATTACK_DAMAGES, {
                if (counterDmg) {
                  bc "Spiteful Lithograph countered ${ef.attacker}'s attack"
                  directDamage(counterDmg, ef.attacker, Source.SRC_ABILITY)
                  counterDmg = 0
                }
              }
            }
          }
          move "Energy Press", {
            text "60+ damage. This attack does 20 more damage for each Energy attached to your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60 + 20 * defending.cards.energyCount(C)
            }
          }
        };
      case CRABRAWLER_84:
        return basic (this, hp:HP080, type:F, retreatCost:3) {
          weakness PSYCHIC
          move "Light Punch", {
            text "20 damage."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Double Lariat", {
            text "Flip 2 coins. This attack does 40 damage times the number of heads."
            energyCost FIGHTING, COLORLESS
            attackRequirement {}
            onAttack {
              flip 2, { damage 40 }
            }
          }
        };
      case CRABOMINABLE_85:
        return evolution (this, from:"Crabrawler", hp:HP150, type:F, retreatCost:4) {
          weakness PSYCHIC
          move "Double Lariat", {
            text "90x damage. Flip 2 coins. This attack does 90 damage for each heads."
            energyCost FIGHTING, COLORLESS, COLORLESS
            onAttack {
              flip 2, { damage 90 }
            }
          }
          move "Crabhammer", {
            text "130 damage."
            energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
            }
          }
        };
      case ROCKRUFF_86:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness GRASS
          move "Crunch", {
            text "30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
            energyCost FIGHTING, FIGHTING
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                discardDefendingEnergyAfterDamage()
              }
            }
          }
        };
      case LYCANROC_87:
        return evolution (this, from:"Rockruff", hp:HP120, type:F, retreatCost:2) {
          weakness GRASS
          move "Rogue Fang", {
            text "80+ damage. This attack does 10 more damage for each Single Strike Pokémon in your discard pile."
            energyCost FIGHTING, FIGHTING
            attackRequirement {}
            onAttack {
              damage 80 + 10 * my.discard.count { it.cardTypes.is(POKEMON) && it.cardTypes.is(SINGLE_STRIKE) }
            }
          }
        };
      case PASSIMIAN_88:
        return basic (this, hp:HP110, type:F, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Throwing Coach", {
            text "All of your Rapid Strike Pokémon's attacks do 30 more damage to your opponent's Benched Pokémon V and Pokémon-GX. You can't use more than 1 Throwing Coach Ability at a time."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(bg.em().retrieveObject("Throwing_Coach") != bg.turnCount) {
                  bg.dm().each {
                    if (it.from.owner == self.owner && it.from.rapidStrike && it.to.benched && (it.to.pokemonV || it.to.pokemonGX) && it.dmg.value) {
                      it.dmg += hp(30)
                      bc "$thisAbility +30"
                    }
                  }
                  bg.em().storeObject("Throwing_Coach", bg.turnCount)
                }
              }
            }
          }
          move "Fling", {
            text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon)"
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 20, opp.all.select("Deal damage to?")
            }
          }
        };
      case SANDACONDA_V_89:
        return basic (this, hp:HP220, type:F, retreatCost:2) {
          weakness GRASS
          bwAbility "Wall of Sand", {
            text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Land Crush", {
            text "140 damage."
            energyCost FIGHTING, FIGHTING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 140
            }
          }
        };
      case SANDACONDA_VMAX_90:
        return evolution (this, from:"Sandaconda V", hp:HP320, type:F, retreatCost:3) {
          weakness GRASS
          move "Sand Pulse", {
            text "60 damage. This attack also does 20 damage to each of your opponent's Benched Pokémon."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 60
              opp.bench.each {
                damage 20, it
              }
            }
          }
          move "G-Max Cyclone", {
            text "180 damage. Move any amount of Energy from your Pokémon to your other Pokémon in any way you like."
            energyCost FIGHTING, FIGHTING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 180
              afterDamage {
                if (my.bench && confirm("Do you want to move any amount of Energy from your Pokémon to your other Pokémon in any way you like?"))
                  while (true) {
                    def pl = (my.all.findAll { it.cards.filterByType(ENERGY) })
                    if (!pl) break;
                    def src = pl.select("Source for energy (cancel to stop)", false)
                    if (!src) break;
                    def card = src.cards.filterByType(ENERGY).select("Energy to move").first()

                    def tar = my.all.findAll{it != src}.select("Target for energy (cancel to stop)", false)
                    if (!tar) break;
                    energySwitch(src, tar, card)
                  }
              }
            }
          }
        };
      case CLOBBOPUS_91:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness PSYCHIC
          move "Beat", {
            text "30 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GRAPPLOCT_92:
        return evolution (this, from:"Clobbopus", hp:HP140, type:F, retreatCost:3) {
          weakness PSYCHIC
          bwAbility "Stranglehold Master", {
            text "If this Pokémon is your Active Pokémon, your opponent's Active Pokémon's Retreat Cost is increased by 2."
            getterA (GET_RETREAT_COST) { h->
              if (h.effect.target.owner == self.owner.opposite && h.effect.target.active && self.active) {
                h.object += 2
              }
            }
          }
          move "Synchro Buster", {
            text "80+ damage. If you and your opponent have the same number of cards in your hands, this attack does 80 more damage."
            energyCost FIGHTING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
              if (my.hand.size() == opp.hand.size()) {
                damage 80
              }
            }
          }
        };
      case KUBFU_93:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness PSYCHIC
          move "Training", {
            text "Search your deck for a basic Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              attachEnergyFrom(basic: true, my.deck, self)
              shuffleDeck()
            }
          }
          move "Elbow Strike", {
            text "60 damage."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case KOFFING_94:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness FIGHTING
          move "Smog", {
            text "20 damage."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage(POISONED)
            }
          }
        };
      case WEEZING_95:
        return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Mixin' Toxin", {
            text "Your opponent's Active Pokémon is now Confused. Attach a [D] Energy from your discard pile to this Pokémon."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              apply(CONFUSED)
              attachEnergyFrom(type: D, my.discard, self)
            }
          }
          move "Smog Burst", {
            text "20+ damage. This attack does 20 more damage for each [D] Energy attached to your Pokémon in play."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              def count = my.all.sum { it.cards.energyCount(D) }
              damage 20 + 20 * count
            }
          }
        };
      case GALARIAN_WEEZING_96:
        return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Energy Factory", {
            text "Each basic [D] Energy attached to your Pokémon with “Weezing” in its name provides [D][D] Energy. You can't apply more than 1 Energy Factory Ability at a time."
            getterA GET_ENERGY_TYPES, { holder->
              if (holder.effect.target.owner == self.owner
                && holder.effect.card.containsTypePlain(D)
                && holder.effect.card.cardTypes.is(BASIC_ENERGY)
                && holder.effect.target.name.contains("Weezing")) {
                holder.object = [[D] as Set, [D] as Set]
              }
            }
          }
          move "Suffocating Gas", {
            text "50 damage."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case GALARIAN_MOLTRES_V_97:
        return basic (this, hp:HP220, type:D, retreatCost:2) {
          weakness GRASS
          bwAbility "Direflame Wings", {
            text "Once during your turn, you may attach a [D] Energy from your discard pile to this Pokémon. You can't use more than 1 Bolstered Wings Ability per turn."
            actionA {
              assert bg.em().retrieveObject("Direflame_Wings") != bg.turnCount : "You can't use more than 1 $thisAbility ability per turn."
              assert my.discard.filterByEnergyType(D) : "No [D] Energy in discard"
              powerUsed()
              bg.em().storeObject("Direflame_Wings", bg.turnCount)

              def list = my.discard.filterByEnergyType(D).select("Choose a [D] Energy Card to attach")
              attachEnergy(self, list.first())
            }
          }
          move "Aura Burn", {
            text "190 damage. This Pokémon does 30 damage to itself."
            energyCost DARKNESS, DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 190
              damage 30, self
            }
          }
        };
      case GALARIAN_SLOWKING_98:
        return evolution (this, from:"Galarian Slowpoke", hp:HP120, type:D, retreatCost:3) {
          weakness FIGHTING
          bwAbility "Mysterious Potion", {
            text "Once during your turn, you may choose 1 of your Pokémon. Flip a coin, if heads restore 90 HP to that Pokémon. If tails, place 3 damage counters on that Pokémon."
            actionA {
              checkLastTurn()
              powerUsed()

              def target = my.all.select("Which Pokémon to use $thisAbility on?")
              flip 1, {
                heal 90, target
              }, {
                directDamage 30, target, Source.SRC_ABILITY
              }
            }
          }
          move "Spray Fluid", {
            text "90 damage."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case GALARIAN_SLOWKING_V_99:
        return basic (this, hp:HP220, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Concoction", {
            text "Discard a card from your hand. Then, draw 3 cards from your deck."
            energyCost COLORLESS
            attackRequirement {
              assert my.hand : "Hand is empty"
              assert my.deck : "Deck is empty"
            }
            onAttack {
              my.hand.select("Choose a card to discard").discard()
              draw 3
            }
          }
          move "Word of Ruin", {
            text "The Defending Pokémon is Knocked Out at the end of your opponent's next turn."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              def pcs = defending
              targeted(pcs) {
                bc "At the end of ${self.owner.opposite}'s next turn, the Defending ${defending} will be Knocked Out. (This effect can be removed by benching/evolving ${defending}.)"
                delayed {
                  before BETWEEN_TURNS, {
                    if (bg.currentTurn == self.owner.opposite && all.contains(pcs)) {
                      bc "Word of Ruin effect activates."
                      new Knockout(pcs).run(bg)
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, pcs, {unregister()}
                  after CHANGE_STAGE, pcs, {unregister()}
                }
              }
            }
          }
        };
      case GALARIAN_SLOWKING_VMAX_100:
        return evolution (this, from:"Galarian Slowking V", hp:HP320, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Max Toxify", {
            text "10 damage. Your opponent's Active Pokémon is now Poisoned. During Pokémon Checkup, put 12 damage counters on that Pokémon instead of 1."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage(POISONED)
              extraPoison(11)
            }
          }
        };
      case QWILFISH_101:
        return basic (this, hp:HP090, type:D, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Bursting Needles", {
            text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, put 6 damage counters on the Attacking Pokémon."
            def attacker
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                attacker = self.owner.opposite.pbg.active
              }
              before (KNOCKOUT, self) {
                if ((ef as Knockout).byDamageFromAttack && self.active && bg.currentTurn == self.owner.opposite && self.owner.opposite.pbg.all.find { it == attacker as PokemonCardSet }) {
                  targeted (attacker as PokemonCardSet, SRC_ABILITY) {
                    bc "$thisAbility activates"
                    directDamage(60, attacker as PokemonCardSet, SRC_ABILITY)
                  }
                }
              }
            }
          }
          move "Poison Jab", {
            text "30 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage(POISONED)
            }
          }
        };
      case SEVIPER_102:
        return basic (this, hp:HP110, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Strong Tail", {
            text "90+ damage. If you played a 'Single Strike' Supporter card from your hand during this turn, this attack does 90 more damage."
            energyCost DARKNESS, DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90

              if (bg.em().retrieveObject("last_single_strike_supporter_play_turn") == bg.turnCount) {
                damage 90
              }
            }
            initHook {
              def flag
              delayed {
                before PLAY_TRAINER, {
                  if (ef.supporter && ef.cardToPlay.cardTypes.is(SINGLE_STRIKE) && bg.currentTurn == thisCard.player && hand.contains(ef.cardToPlay)) {
                    flag = true
                  }
                }
                after PLAY_TRAINER, {
                  if (flag) {
                    bg.em().storeObject("last_single_strike_supporter_play_turn", bg.turnCount)
                    flag = false
                  }
                }
              }
            }
          }
        };
      case SPIRITOMB_103:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness GRASS
          move "Ghostly Cries", {
            text "Count the number of Pokémon cards in your opponent's discard pile. Put that many damage counters on your opponent's Pokémon in any way you like. Then, your opponent shuffles all of the Pokémon cards from their discard pile into their deck."
            energyCost COLORLESS
            attackRequirement {
              assert opp.discard.filterByType(POKEMON) : "Opponent has no Pokémon in discard pile"
            }
            onAttack {
              def totalCountersBefore = opp.all.sum { it.numberOfDamageCounters }
              def discardedPokemon = opp.discard.filterByType(POKEMON)
              putDamageCountersOnOpponentsPokemon(discardedPokemon.size())

              if (totalCountersBefore != opp.all.sum { it.numberOfDamageCounters }) {
                discardedPokemon.moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
          move "Will-O-Wisp", {
            text "20 damage."
            energyCost DARKNESS
            onAttack {
              damage 20
            }
          }
        };
      case LIEPARD_V_104:
        return basic (this, hp:HP190, type:D, retreatCost:1) {
          weakness GRASS
          bwAbility "Hidden Claw", {
            text "Once during your turn when you play this Pokémon from your hand onto your Bench, you may discard 1 Pokémon Tool card attached to any Pokémon in play (yours or your opponent's)."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && all.any { it.cards.filterByType(POKEMON_TOOL) } && confirm("Use Concealing Claw?")) {
                powerUsed()
                def target = all.findAll { it.cards.filterByType(POKEMON_TOOL) }.select("Which Pokémon to remove a Pokémon Tool card from?")
                target.cards.filterByType(POKEMON_TOOL).select("Discard").discard()
              }
            }
          }
          move "Shadow Ripper", {
            text "110 damage. You may return this Pokémon and all cards attached to it to your hand."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 110
              afterDamage {
                if (confirm("You may return this Pokémon and all cards attached to it to your hand.")) {
                  scoopUpPokemon(self, delegate)
                }
              }
            }
          }
        };
      case VENIPEDE_105:
        return basic (this, hp:HP070, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Poison Sting", {
            text "10 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage(POISONED)
            }
          }
        };
      case WHIRLIPEDE_106:
        return evolution (this, from:"Venipede", hp:HP090, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Poison Sting", {
            text "20 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage(POISONED)
            }
          }
          move "Rolling Tackle", {
            text "50 damage."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case SCOLIPEDE_107:
        return evolution (this, from:"Whirlipede", hp:HP160, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Poison Sting", {
            text "50 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 50
              applyAfterDamage(POISONED)
            }
          }
          move "Venoshock", {
            text "100+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 120 more damage."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
              if (defending.isSPC(POISONED)) {
                damage 120
              }
            }
          }
        };
      case SINGLE_STRIKE_URSHIFU_108:
        return evolution (this, from:"Kubfu", hp:HP140, type:D, retreatCost:2) {
          weakness GRASS
          move "Field Crush", {
            text "50 damage. If your opponent has any Stadium in play, discard it."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
          move "Fists of Strife", {
            text "100+ damage. If this Pokémon has any damage counters on it, this attack does 100 more damage."
            energyCost DARKNESS, DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
              if (self.numberOfDamageCounters) {
                damage 100
              }
            }
          }
        };
      case ARON_109:
        return basic (this, hp:HP070, type:M, retreatCost:2) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Gnaw", {
            text "20 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Rolling Tackle", {
            text "50 damage."
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case LAIRON_110:
        return evolution (this, from:"Aron", hp:HP100, type:M, retreatCost:3) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Tackle", {
            text "50 damage."
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Metal Claw", {
            text "90 damage."
            energyCost METAL, METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case AGGRON_111:
        return evolution (this, from:"Lairon", hp:HP180, type:M, retreatCost:4) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Guard Press", {
            text "100 damage. During your opponent's next turn, any damage done to this Pokémon by attacks is reduced by 30."
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
              reduceDamageNextTurn(hp(30), thisMove)
            }
          }
          move "Seismic Rift", {
            text "240 damage. This attack does 30 damage to each of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon)."
            energyCost METAL, METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 240
              my.all.each {
                damage 30, it
              }
            }
          }
        };
      case METAGROSS_V_112:
        return basic (this, hp:HP220, type:M, retreatCost:3) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Bullet Punch", {
            text "20+ damage. Flip 2 coins. This attack does 20 more damage for each heads."
            energyCost METAL
            attackRequirement {}
            onAttack {
              damage 20
              flip 2, { damage 20 }
            }
          }
          move "Synchro Hammer", {
            text "60+ damage. If this Pokémon and the Defending Pokémon have the same number of Energy attached, this attack does 90 more damage."
            energyCost METAL, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
              if (self.getEnergyCount(bg) == defending.getEnergyCount(bg)) {
                damage 90
              }
            }
          }
        };
      case METAGROSS_VMAX_113:
        return evolution (this, from:"Metagross V", hp:HP330, type:M, retreatCost:3) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Zap Traction", {
            text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            energyCost METAL
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.select(min: 1, max: 2).moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Max Rush", {
            text "100 damage. During your next turn, this Pokémon’s Max Rush attack does 150 more damage."
            energyCost METAL, COLORLESS
            onAttack {
              damage 100
              increasedBaseDamageNextTurn thisMove.name, hp(150)
            }
          }
        };
      case COBALION_114:
        return basic (this, hp:HP120, type:M, retreatCost:2) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Headbang", {
            text "40 damage."
            energyCost METAL, COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Metal Slash", {
            text "130 damage. This Pokémon can't attack during your next turn."
            energyCost METAL, METAL, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
              cantAttackNextTurn self
            }
          }
        };
      case TAUROS_115:
        return basic (this, hp:HP130, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Raging Bull", {
            text "20+ damage. This attack does 20 more damage for each damage counter on this Pokémon. This Pokémon is now Confused."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20 + self.numberOfDamageCounters * 20
              afterDamage { apply(CONFUSED, self) }
            }
          }
          move "Take Down", {
            text "80 damage. This Pokémon also does 30 damage to itself."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
              damage 30, self
            }
          }
        };
      case PORYGON_116:
        return basic (this, hp:HP060, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Sharpen", {
            text "20 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case PORYGON2_117:
        return evolution (this, from:"Porygon", hp:HP090, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Tri Attack", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              flip 3, { damage 30 }
            }
          }
        };
      case PORYGON_Z_118:
        return evolution (this, from:"Porygon2", hp:HP140, type:C, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Bug Transmission", {
            text "Once during your turn when you attach an Energy from your hand to this Pokémon, you may leave the opponent's Active Pokémon Confused."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND && bg.currentThreadPlayerType == self.owner && confirm("Use $thisAbility?")) {
                  apply CONFUSED, self.owner.opposite.pbg.active, SRC_ABILITY
                }
              }
            }
          }
          move "Superbeam", {
            text "170 damage. Discard 2 Energy from this Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 170
              discardSelfEnergyAfterDamage(C, C)
            }
          }
        };
      case BLISSEY_V_119:
        return basic (this, hp:HP250, type:C, retreatCost:4) {
          weakness FIGHTING
          bwAbility "Natural Cure", {
            text "Whenever you attach an Energy from your hand to this Pokémon, remove all Special Conditions from this Pokémon."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND && ef.card instanceof EnergyCard) {
                  clearSpecialCondition(self, SRC_ABILITY)
                }
              }
            }
          }
          move "Blissful Blast", {
            text "10+ damage. This attack does 30 more damage for each Energy attached to this Pokémon. After doing damage, you may attach up to 3 Energy cards from your discard pile to this Pokémon."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              def oldHp = defending.damage
              damage 10 + 30 * self.cards.energyCount(C)
              afterDamage {
                if (oldHp != defending.damage && my.discard.filterByType(ENERGY)) { // Did damage with the attack
                  my.discard.filterByType(ENERGY).select(min: 0, max: 3).each {
                    attachEnergy(self, it)
                  }
                }
              }
            }
          }
        };
      case ZANGOOSE_120:
        return basic (this, hp:HP110, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Gale Claw", {
            text "50 damage. If you played a “Rapid Strike” Supporter card from your hand during this turn, this attack also does 50 damage to 2 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50

              if (bg.em().retrieveObject("last_rapid_strike_supporter_play_turn") == bg.turnCount && opp.bench) {
                multiSelect(opp.bench, 2, "Deal damage to which?").each {
                  targeted(it) {
                    damage 50, it
                  }
                }
              }
            }
            initHook {
              def flag
              delayed {
                before PLAY_TRAINER, {
                  if (ef.supporter && ef.cardToPlay.cardTypes.is(RAPID_STRIKE) && bg.currentTurn == thisCard.player && hand.contains(ef.cardToPlay)) {
                    flag = true
                  }
                }
                after PLAY_TRAINER, {
                  if (flag) {
                    bg.em().storeObject("last_rapid_strike_supporter_play_turn", bg.turnCount)
                    flag = false
                  }
                }
              }
            }
          }
        };
      case CASTFORM_121:
        return basic (this, hp:HP070, type:C, retreatCost:0) {
          weakness FIGHTING
          bwAbility "Weather Reading", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon's attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, { h->
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                if (my.discard.filterByType(STADIUM).size() >= 8){
                  copy.energyCost.retainAll()
                }
                list.add(copy)
              }
              h.object=list
            }
          }
          move "Weather Force", {
            text "80 damage. Draw cards until you have 6 cards in your hand."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
              draw 6 - my.hand.size()
            }
          }
        };
      case KECLEON_122:
        return basic (this, hp:HP090, type:C, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Chromashift", {
            text "This Pokémon is the same type as any basic Energy attached to it. (If it has 2 or more different types of basic Energy attached, this Pokémon is each of those types.)"
            getterA (GET_POKEMON_TYPE, LAST, self) { h->
              if (self.cards.hasType(BASIC_ENERGY)) {
                h.object.clear()

                self.cards.filterByType(BASIC_ENERGY).each {
                  h.object.add(it.asEnergyCard().asBasicEnergyCard().basicType)
                }
              }
            }
          }
          move "Spinning Attack", {
            text "90 damage."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case SHAYMIN_123:
        return basic (this, hp:HP070, type:C, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Return", {
            text "10 damage. You may draw cards until you have 6 cards in your hand."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
              draw 6 - my.hand.size()
            }
          }
          move "Sky Return", {
            text "30 damage. Return this Pokémon and all cards attached to it to your hand."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                scoopUpPokemon(self, delegate)
              }
            }
          }
        };
      case TORNADUS_V_124:
        return basic (this, hp:HP210, type:C, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Blow Through", {
            text "20+ damage. If there is a Stadium in play, this attack does 20 more damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
              if (bg.stadiumInfoStruct) {
                damage 20
              }
            }
          }
          move "Blasting Hammer", {
            text "180 damage. Discard an Energy from this Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 180
              discardSelfEnergyAfterDamage()
            }
          }
        };
      case TORNADUS_VMAX_125:
        return evolution (this, from:"Tornadus V", hp:HP320, type:C, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Blasting Wind", {
            text "60 damage."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Max Wind Spirit", {
            text "120+ damage. If there is a Stadium card in play, this attack does 120 more damage. Then discard that Stadium."
            energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
              if (bg.stadiumInfoStruct) {
                damage 120
                afterDamage {
                  discardStadium()
                }
              }
            }
          }
        };
      case FURFROU_126:
        return basic (this, hp:HP090, type:C, retreatCost:1) {
          weakness FIGHTING
          move "Find a Friend", {
            text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {
              assert deck.notEmpty : "Deck is empty"
            }
            onAttack {
              my.deck.search(min: 0, max: 1, cardTypeFilter(POKEMON)).showToOpponent("Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Fur Attack", {
            text "90 damage. During your opponent's next turn, any damage done to this Pokémon by attacks is reduced by 20."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }
        };
      case SKWOVET_127:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness FIGHTING
          move "Scavenge", {
            text "Put a Pokémon Tool card from your discard pile into your hand."
            energyCost COLORLESS
            attackRequirement {
              assert my.discard.filterByType(POKEMON_TOOL) : "No Pokémon Tool cards in your discard."
            }
            onAttack {
              my.discard.filterByType(POKEMON_TOOL).select(count: 1, "Select a Pokémon Tool card to move to your hand.").showToOpponent("Opponent's selected Pokémon Tool").moveTo(my.hand)
            }
          }
          move "Gnaw", {
            text "10 damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case GREEDENT_128:
        return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Brazen Tail", {
            text "Prevent all effects of your opponent's Item and Supporter cards that would discard Energy from your Pokémon or return Energy from your Pokémon to your hand or deck."
            actionA {
              // TODO
            }
          }
          move "Gnaw", {
            text "90 damage."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case AGATHA_129:
        return supporter (this) {
          text "Move up to 3 damage counters from your Active Pokémon to your opponent's Active Pokémon. You may play only 1 Supporter card during your turn."
          onPlay {
            def maxCount = Math.min(my.active.numberOfDamageCounters, 3)
            def count = choose(1..maxCount,"Move how many damage counters?", maxCount) as Integer
            my.active.damage -= hp(10 * count)
            opp.active.damage += hp(10 * count)
            bc "Moved $count damage counters from $my.active to $opp.active"
          }
          playRequirement {
            assert my.active.numberOfDamageCounters : "Active Pokémon does not have damage counters"
          }
        };
      case AVERY_130:
        return supporter (this) {
          text "Draw 3 cards. If you drew any cards in this way, your opponent discards Pokémon from their Bench until they have 3. You may play only 1 Supporter card during your turn."
          def eff
          onPlay {
            def deckBefore = my.deck.size()
            draw 3

            if (my.deck.size() != deckBefore && opp.bench.size() > 3) {
              eff = getter(GET_BENCH_SIZE) { h ->
                h.object = 3
              }

              thisCard.player.opposite.pbg.triggerBenchSizeCheck()
              eff.unregister()
              thisCard.player.opposite.pbg.triggerBenchSizeCheck()
              new CheckAbilities().run(bg)
            }
          }
          playRequirement {
            assert (my.deck || opp.bench.size() > 3) : "No cards in deck or opponent's bench is not more than 3"
          }
        };
      case BRAWLY_131:
        return supporter (this) {
          text "Search your deck for up to 3 Rapid Strike Basic Pokémon and put them on your Bench. Then, shuffle your deck. You may play only 1 Supporter card during your turn."
          onPlay {
            def maxSpace = Math.min(my.bench.freeBenchCount, 3)
            deck.search(min:0, max: maxSpace, "Search your deck for up to 3 Rapid Strike Basic Pokémon", {
              it.cardTypes.pokemon && it.cardTypes.is(BASIC) && it.cardTypes.is(RAPID_STRIKE)
            }).each {
              benchPCS(it)
            }
            shuffleDeck()
          }
          playRequirement {
            assert my.deck : "No cards in deck"
            assert my.bench.notFull : "No space on bench"
          }
        };
      case CAITLIN_132:
        return supporter (this) {
          text "Put any number of cards from your hand on the bottom of your deck in any order. Then, draw that many cards."
          onPlay {
            def list = hand.getExcludedList(thisCard)
            list = list.select(max: list.size(), "Put as many cards from your hand as you like on the bottom of your deck in any order. Then, draw a card for each card you put on the bottom of your deck")
            def rearranged = rearrange(list)
            rearranged.moveTo(hidden:true, my.deck)
            draw list.size()
          }
          playRequirement {
            assert hand.getExcludedList(thisCard).size() >= 1 : "Not enough cards in hand to use"
          }
        };
      case CRUSHING_GLOVES_133:
        return pokemonTool (this) {
          text "The Pokémon this card is attached to does 30 more damage to your opponent's Active [M] Pokémon."
          def eff
          onPlay { reason ->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  def plusDmg = 30
                  if (it.from == self && it.to.active && it.to.owner != self.owner && it.to.types.contains(M) && it.dmg.value) {
                    bc "Crushing Gloves +$plusDmg"
                    it.dmg += hp(plusDmg)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case DOCTOR_134:
        return supporter (this) {
          text "Draw 2 cards. If your opponent's Active Pokémon is a Pokémon VMAX, draw 2 more cards. You may play only 1 Supporter card during your turn."
          onPlay {
            draw 2
            if (opp.active.pokemonVMAX) {
              draw 2
            }
          }
          playRequirement {
            assert my.deck : "Deck is empty"
          }
        };
      case DYNA_TREE_HILL_135:
        return stadium (this) {
          text "Pokémon in play (both yours and your opponent's) can't be healed. Note Pokémon uses the word recover when referring to Special Conditions, so although Pokémon in play can't have their HP healed, they can still recover from Special Conditions."
          def eff
          onPlay {
            eff = delayed {
              before REMOVE_DAMAGE_COUNTER, {
                bc "Dyna Tree Hill prevents heal"
                prevent()
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case ECHOING_HORN_136:
        return itemCard (this) {
          text "Put a Basic Pokémon from your opponent's discard pile onto their Bench. You may play any number of Item cards during your turn."
          onPlay {
            def pcs = opp.discard.filterByType(BASIC).select("Select the pokémon to put on the bench").first()
            benchPCS(pcs)
          }
          playRequirement {
            assert opp.bench.notFull && opp.discard.filterByType(BASIC) : "Opponent's discard Pile has no Basic Pokémon or their bench is full"
          }
        };
      case EXPEDITION_UNIFORM_137:
        return itemCard (this) {
          text "Look at the bottom 3 cards from your deck and place them on top of your deck in any order. You may play any number of Item cards during your turn."
          onPlay {
            def drawStart = Math.max(0, my.deck.size() - 3)
            def list = my.deck.subList(drawStart, my.deck.size())

            if (list.size() >= 2) {
              list = rearrange(list, "Rearrange to put to the top of the deck, left = topmost card")
              list = list.reverse()
              list.moveTo(my.deck, hidden: true, addToTop: true)
            }

            bc "Put ${list.size()} cards from the bottom of their deck, rearranged and put it to the top of their deck."
          }
          playRequirement {
            assert my.deck : "Deck is empty"
          }
        };
      case FIRE_RESISTANT_GLOVES_138:
        return pokemonTool (this) {
          text "When the Pokémon this card is attached to attacks, damage done to your opponent's Active [R] Pokémon is increased by 30. You may play any number of Item cards during your turn."
          def eff
          onPlay {
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self) {
                  bg.dm().each {
                    if (it.to.owner == self.owner.opposite && it.to.active && it.to.types.contains(R)) {
                      bc "$thisCard +30"
                      it.dmg += hp(30)
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
      case FLANNERY_139:
        return supporter (this) {
          text "Choose a Special Energy card attached to 1 of your opponent's Pokémon, and any Stadium card in play, and discard them. You may play only 1 Supporter card during your turn."
          onPlay {
            if (opp.all.any { it.cards.filterByType(SPECIAL_ENERGY) }) {
              def pcs = opp.all.findAll {
                it.cards.filterByType(SPECIAL_ENERGY)
              }.select("Which Pokémon to remove a Special Energy from?")

              pcs.cards.select("Remove which Special Energy?", cardTypeFilter(SPECIAL_ENERGY)).discard()
            }

            if (bg.stadiumInfoStruct) {
              discard bg.stadiumInfoStruct.stadiumCard
            }
          }
          playRequirement {
            assert bg.stadiumInfoStruct || opp.all.any { it.cards.filterByType(SPECIAL_ENERGY) } : "No Stadium in play or Special Energy attached"
          }
        };
      case FOG_CRYSTAL_140:
        return itemCard (this) {
          text "Search your deck for either a Basic [P] Pokémon or [P] Energy, reveal it, and put it into your hand. Then, shuffle your deck. You may play as many Item cards as you like during your turn."
          onPlay {
            my.deck.search {
              (it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(P)) || (it.cardTypes.energy && it.containsTypePlain(P))
            }.moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement {
            assert my.deck : "Deck is empty"
          }
        };
      case GALARIAN_CHESTPLATE_141:
        return pokemonTool (this) {
          text "If the Pokémon this card is attached to has 'Galarian' in its name, it takes 30 less damage from attacks from your opponent’s Pokémon (after applying Weakness and Resistance)."
          def eff
          onPlay {
            eff = delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.from.owner == self.owner.opposite && it.to == self && self.name.contains("Galarian") && it.dmg.value && it.notNoEffect) {
                    bc "Galarian Chestplate -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case HONEY_142:
        return supporter (this) {
          text "Draw a card for each of your opponent’s Benched Pokémon V."
          onPlay {
            def cards = opp.bench.count { it.pokemonV } as Integer
            draw cards
          }
          playRequirement {
            assert opp.bench.any { it.pokemonV } : "No Pokémon V on your opponent's bench"
          }
        };
      case JUSTIFIED_GLOVES_143:
        return pokemonTool (this) {
          text "When the Pokémon this card is attached to attacks, damage done to your opponent's Active [D] Pokémon is increased by 30. You may play any number of Item cards during your turn."
          def eff
          onPlay {
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self) {
                  bg.dm().each {
                    if (it.to.owner == self.owner.opposite && it.to.active && it.to.types.contains(D)) {
                      bc "$thisCard +30"
                      it.dmg += hp(30)
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
      case KAREN_S_CONVICTION_144:
        return supporter (this) {
          text "During this turn, your Single Strike Pokémon's attacks do 20 more damage to your opponent's Active Pokémon for each Prize Card your opponent has already taken. You may play only 1 Supporter card during your turn."
          onPlay {
            delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.to.active && it.from.owner == thisCard.player && it.to.owner != it.from.owner && it.dmg.value && it.from.singleStrike) {
                    def bonusDamage = opp.prizeCardSet.takenCount * 20
                    bc "$thisCard +$bonusDamage"
                    it.dmg += hp(bonusDamage)
                  }
                }
              }
              unregisterAfter 1
            }
          }
        };
      case KLARA_145:
        return supporter (this) {
          text "Choose up to 2 Pokémon and up to 2 Basic Energy from your discard pile, show them to your opponent, and put them into your hand. You may play only 1 Supporter card during your turn."
          onPlay {
            def cards = my.discard.select(min: 1, max: 4, "Choose up to 2 Pokémon and up to 2 Basic Energy from your discard pile", {
              it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)
            }, bg.currentThreadPlayerType, { CardList list ->
              list.filterByType(BASIC_ENERGY).size() <= 2 && list.filterByType(POKEMON).size() <= 2
            })
            cards.showToOpponent("$thisCard: Chosen cards to be put into hand")
            cards.moveTo(my.hand)
          }
          playRequirement {
            assert my.discard.filterByType(BASIC_ENERGY) || my.discard.filterByType(POKEMON) : "No Basic Energies or Pokémon in discard"
          }
        };
      case MELONY_146:
        return supporter (this) {
          text "Attach a [W] Energy from your discard pile to 1 of your Pokémon V. Then, draw 3 cards. You may play only 1 Supporter card during your turn."
          onPlay {
            my.discard.filterByType(ENERGY).filterByEnergyType(W).select("Select a [W] energy to attach").each {
              attachEnergy(my.all.findAll { it.pokemonV }.select("Attach to?"), it)
            }
            draw 3
          }
          playRequirement {
            assert my.all.any { it.pokemonV } : "No Pokémon V available"
            assert my.discard.filterByType(ENERGY).filterByEnergyType(W) : "No [W] energies in discard"
          }
        };
      case OLD_CEMETERY_147:
        return stadium (this) {
          text "Whenever a player attaches an Energy from their hand to 1 of their Pokémon (excluding [P] Pokémon), put 2 damage counters on that Pokémon. This Stadium stays in play when you play it. Discard it if another Stadium comes into play. If a Stadium with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = delayed {
              after ATTACH_ENERGY, {
                def target = e.getTarget(bg)
                if (target && ef.reason==PLAY_FROM_HAND && !target.types.contains(P)) {
                  bc "Old Cemetery activates"
                  directDamage(20, target, TRAINER_CARD)
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case PATH_TO_THE_PEAK_148:
        return stadium (this) {
          text "Each player's Pokémon in play with a Rule Box has no Abilities. This Stadium stays in play when you play it. Discard it if another Stadium comes into play. If a Stadium with the same name is in play, you can't play this card."
          def effect1
          def effect2
          onPlay {
            effect1 = getter(GET_ABILITIES, BEFORE_LAST) { h->
              if (h.effect.target.ruleBox) {
                h.object.keySet().removeIf { it instanceof BwAbility }
              }
            }
            effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, { Holder h ->
              if ((h.effect.target.cardTypes.contains(POKEMON) && h.effect.target.cardTypes.isIn(POKEMON_EX, BREAK, MEGA_POKEMON,
                PRISM_STAR, POKEMON_GX, TAG_TEAM, POKEMON_V, VMAX))) {
                h.object=true
              }
            }
            new CheckAbilities().run(bg)
          }
          onRemoveFromPlay{
            effect1.unregister()
            effect2.unregister()
            new CheckAbilities().run(bg)
          }
        };
      case PEONIA_149:
        return supporter (this) {
          text "Choose up to 3 of your Prize cards and put them into your hand. Then, place the same number of cards from your hand face-down as Prize cards. You may play only 1 Supporter card during your turn."
          onPlay {
            def maxPrizes = Math.max(my.prizeCardSet.size(), my.hand.size())
            maxPrizes = Math.min(3, maxPrizes)
            def prizes = my.prizeCardSet.select(min: 1, max: maxPrizes, hidden:true, "Choose up to $maxPrizes prize cards to move to your hand")
            prizes.moveTo(hidden: true, my.hand)

            def cards = my.hand.getExcludedList(thisCard).select(count: prizes.size(), "Choose cards to put back as prize cards")
            cards.moveTo(hidden:true, my.prizeCardSet)
          }
        };
      case PEONY_150:
        return supporter (this) {
          text "Discard your hand and search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn."
          onPlay {
            my.hand.getExcludedList(thisCard).discard()
            def card = my.deck.search(min:0, max: 2, cardTypeFilter(TRAINER))
            if (card) {
              card.showToOpponent("$thisCard: Chose this card to move to hand")
              card.moveTo(my.hand)
            }
            shuffleDeck()
          }
          playRequirement {
            assert my.deck : "Deck is empty"
          }
        };
      case RAPID_STRIKE_SCROLL_OF_THE_SKIES_151:
        return pokemonTool (this) {
          text "The Rapid Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)" +
            "[L] [C] Gravdrop 10+" +
            "This attack does 50 more damage for each Energy attached to your opponent’s Active Pokémon."
          def newMove
          onPlay { reason ->
            def moveBody = {
              text "10+ damage. This attack does 50 more damage for each Energy attached to your opponent’s Active Pokémon."
              energyCost L, C
              onAttack {
                damage 10 + 50 * opp.active.cards.energyCount(C)
              }
            }
            Move move = new Move("Gravdrop")
            moveBody.delegate = new MoveBuilder(thisMove: move)
            moveBody.call()
            newMove = getter GET_MOVE_LIST, self, { h ->
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
        }
      case RUGGED_HELMET_152:
        return pokemonTool (this) {
          text "When the Pokémon this card is attached to is your Active Pokémon and is damaged by an opponent's attack, choose an Energy attached to the Attacking Pokémon and return it to your opponent's hand. You may play as many Item cards as you like during your turn."
          ifActiveAndDamagedByAttackAttached(delegate) {
            bc "Rugged Helmet activates"
            def opponent = self.owner.opposite.pbg
            def attacker = opponent.active
            if (attacker.cards.filterByType(ENERGY)) {
              def card = attacker.cards.filterByType(ENERGY).select("Energy card to move to hand", { true }, self.owner)
              card.moveTo(opponent.hand)
            }
          }
        };
      case SIEBOLD_153:
        return supporter (this) {
          text "Choose up to 2 of your Rapid Strike Pokémon in play and heal 60 damage from each of them. You may play only 1 Supporter card during your turn."
          onPlay {
            def eligible = my.all.findAll { it.rapidStrike && it.numberOfDamageCounters }
            def max = Math.min(2, eligible.size())
            def targets = multiSelect(eligible, 1, max, "Select Rapid Strike Pokémon to heal")
            targets.each {
              heal 60, it
            }
          }
          playRequirement {
            assert my.all.find { it.rapidStrike } : "Couldn't find any Rapid Strike Pokémon with damage counters"
          }
        };
      case SINGLE_STRIKE_SCROLL_OF_PIERCING_154:
        return pokemonTool (this) {
          text "The Single Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.) " +
            "[R] [C] [C] Bullet Breakthrough 120" +
            "This attack’s damage isn’t affected by Weakness or Resistance, or by any effects on your opponent’s Active Pokémon."
          def newMove
          onPlay { reason->
            def moveBody = {
              text "120 damage. This attack’s damage isn’t affected by Weakness or Resistance, or by any effects on your opponent’s Active Pokémon."
              attackRequirement {
                // self is not set properly creating a move like this, use bg.ownActive() instead
                assert bg.ownActive().singleStrike : "${bg.ownActive()} is not a $SINGLE_STRIKE Pokémon"
              }
              energyCost R, C, C
              onAttack {
                swiftDamage 120, defending
              }
            }
            Move move = new Move("Bullet Breakthrough")
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
      case WEEDING_GLOVES_155:
        return pokemonTool (this) {
          text "When the Pokémon this card is attached to attacks, damage done to your opponent's Active [G] Pokémon is increased by 30. You may play any number of Item cards during your turn."
          def eff
          onPlay {
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self) {
                  bg.dm().each {
                    if (it.to.owner == self.owner.opposite && it.to.active && it.to.types.contains(G)) {
                      bc "$thisCard +30"
                      it.dmg += hp(30)
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
      case WELCOMING_LANTERN_156:
        return itemCard (this) {
          text "Choose a Single Strike Supporter card from your discard pile and put it into your hand. You may play any number of Item cards during your turn."
          onPlay {
            my.discard.findAll { it.cardTypes.is(SINGLE_STRIKE) && it.cardTypes.is(SUPPORTER) }.select("Which to move to hand").moveTo(my.hand)
          }
          playRequirement {
            assert my.discard.any { it.cardTypes.is(SINGLE_STRIKE) && it.cardTypes.is(SUPPORTER) } : "No Single Strike Supporter cards in discard"
          }
        };
      case IMPACT_ENERGY_157:
        return specialEnergy (this, [[C]]) {
          text "This card can only be attached to a Single Strike Pokémon. If this card is attached to anything other than a Single Strike Pokémon, discard this card. As long as this card is attached to a Pokémon, this card provides every type of Energy but provides only 1 Energy at a time. If this Pokémon is Poisoned, it is no longer Poisoned and cannot be Poisoned."
          def eff
          onPlay { reason->
            if (self.isSPC(POISONED)) {
              clearSpecialCondition(self, SRC_SPENERGY, [POISONED])
            }
            eff = delayed {
              before APPLY_SPECIAL_CONDITION, self, {
                if (ef.type == POISONED) {
                  bc "$thisCard prevents $self from being Poisoned"
                  prevent()
                }
              }
              after ATTACH_ENERGY, self, {
                if (!self.singleStrike) {
                  discard thisCard
                }
              }
              before BETWEEN_TURNS, {
                if (!self.singleStrike) {
                  discard thisCard
                }
              }
            }
          }
          getEnergyTypesOverride {
            if (self) return [[R, D, F, G, W, Y, L, M, P, C] as Set]
            else return [[] as Set]
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          allowAttach { to ->
            to.topPokemonCard.cardTypes.is(SINGLE_STRIKE)
          }
        };
      case LUCKY_ENERGY_158:
        return specialEnergy (this, [[C]]) {
          text "This card provides 1 [C] Energy while attached to a Pokémon. If the Pokémon this card is attached to is your Active Pokémon and is damaged by an opponent's attack, draw 1 card."
          def eff
          onPlay { reason->
            eff = delayed (priority: BEFORE_LAST) {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && it.from.owner != self.owner && self.active && it.dmg.value && it.notNoEffect) {
                    bc "Lucky Energy activates"
                    draw 1, TargetPlayer.OPPONENT // Targets the player being attacked (holding the lucky energy)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case SPIRAL_ENERGY_159:
        return specialEnergy (this, [[]]) {
          text "This card can only be attached to a Rapid Strike Pokémon. If this card is attached to anything other than a Rapid Strike Pokémon, discard this card. As long as this card is attached to a Pokémon, this card provides every type of Energy but provides only 1 Energy at a time. If this Pokémon is Paralyzed, it is no longer Paralyzed and cannot be Paralyzed."
          def eff
          onPlay { reason->
            if (self.isSPC(PARALYZED)) {
              clearSpecialCondition(self, SRC_SPENERGY, [PARALYZED])
            }
            eff = delayed {
              before APPLY_SPECIAL_CONDITION, self, {
                if (ef.type == PARALYZED) {
                  bc "$thisCard prevents $self from being Paralyzed"
                  prevent()
                }
              }
              after ATTACH_ENERGY, self, {
                if (!self.rapidStrike) {
                  discard thisCard
                }
              }
              before BETWEEN_TURNS, {
                if (!self.rapidStrike) {
                  discard thisCard
                }
              }
            }
          }
          getEnergyTypesOverride {
            if (self) return [[R, D, F, G, W, Y, L, M, P, C] as Set]
            else return [[] as Set]
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          allowAttach { to ->
            to.topPokemonCard.cardTypes.is(RAPID_STRIKE)
          }
        };
      case CELEBI_V_160:
        return copy (CELEBI_V_7, this);
      case BLAZIKEN_V_161:
        return copy (BLAZIKEN_V_20, this);
      case VOLCANION_V_162:
        return copy (VOLCANION_V_25, this);
      case ICE_RIDER_CALYREX_V_163:
        return copy (ICE_RIDER_CALYREX_V_45, this);
      case ICE_RIDER_CALYREX_V_164:
        return copy (ICE_RIDER_CALYREX_V_45, this);
      case ZERAORA_V_165:
        return copy (ZERAORA_V_53, this);
      case ZERAORA_V_166:
        return copy (ZERAORA_V_53, this);
      case GALARIAN_RAPIDASH_V_167:
        return basic (this, hp:HP210, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Psychic", {
            text "60+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon."
            energyCost PSYCHIC, PSYCHIC
            attackRequirement {}
            onAttack {
              damage 60 + 30 * defending.cards.energyCount(C)
            }
          }
          move "Libra Horn", {
            text "Put damage counters on 1 of your opponent’s Pokémon until its remaining HP is 100."
            energyCost COLORLESS, COLORLESS
            attackRequirement {
              assert opp.all.any { it.getRemainingHP().value > 100 } : "No Pokémon with HP over 100"
            }
            onAttack {
              def targets = opp.all.findAll { it.getRemainingHP().value > 100 }
              def target = targets.first()
              if (targets.size() > 1) {
                target = targets.select("Which Pokémon to reduce HP to 100?")
              }
              def dmg = target.getRemainingHP().value - 100
              directDamage dmg, target
            }
          }
        };
      case GALARIAN_RAPIDASH_V_168:
        return copy (GALARIAN_RAPIDASH_V_167, this);
      case GALARIAN_ARTICUNO_V_169:
        return copy (GALARIAN_ARTICUNO_V_58, this);
      case GALARIAN_ARTICUNO_V_170:
        return copy (GALARIAN_ARTICUNO_V_58, this);
      case SHADOW_RIDER_CALYREX_V_171:
        return copy (SHADOW_RIDER_CALYREX_V_74, this);
      case SHADOW_RIDER_CALYREX_V_172:
        return copy (SHADOW_RIDER_CALYREX_V_74, this);
      case GALARIAN_ZAPDOS_V_173:
        return copy (GALARIAN_ZAPDOS_V_80, this);
      case GALARIAN_ZAPDOS_V_174:
        return copy (GALARIAN_ZAPDOS_V_80, this);
      case SANDACONDA_V_175:
        return copy (SANDACONDA_V_89, this);
      case GALARIAN_MOLTRES_V_176:
        return copy (GALARIAN_MOLTRES_V_97, this);
      case GALARIAN_MOLTRES_V_177:
        return copy (GALARIAN_MOLTRES_V_97, this);
      case GALARIAN_SLOWKING_V_178:
        return copy (GALARIAN_SLOWKING_V_99, this);
      case GALARIAN_SLOWKING_V_179:
        return copy (GALARIAN_SLOWKING_V_99, this);
      case LIEPARD_V_180:
        return copy (LIEPARD_V_104, this);
      case METAGROSS_V_181:
        return copy (METAGROSS_V_112, this);
      case BLISSEY_V_182:
        return copy (BLISSEY_V_119, this);
      case BLISSEY_V_183:
        return copy (BLISSEY_V_119, this);
      case TORNADUS_V_184:
        return copy (TORNADUS_V_124, this);
      case TORNADUS_V_185:
        return copy (TORNADUS_V_124, this);
      case AGATHA_186:
        return copy (AGATHA_129, this);
      case AVERY_187:
        return copy (AVERY_130, this);
      case BRAWLY_188:
        return copy (BRAWLY_131, this);
      case CAITLIN_189:
        return copy (CAITLIN_132, this);
      case DOCTOR_190:
        return copy (DOCTOR_134, this);
      case FLANNERY_191:
        return copy (FLANNERY_139, this);
      case HONEY_192:
        return copy (HONEY_142, this);
      case KAREN_S_CONVICTION_193:
        return copy (KAREN_S_CONVICTION_144, this);
      case KLARA_194:
        return copy (KLARA_145, this);
      case MELONY_195:
        return copy (MELONY_146, this);
      case PEONIA_196:
        return copy (PEONIA_149, this);
      case PEONY_197:
        return copy (PEONY_150, this);
      case SIEBOLD_198:
        return copy (SIEBOLD_153, this);
      case CELEBI_VMAX_199:
        return copy (CELEBI_VMAX_8, this);
      case BLAZIKEN_VMAX_200:
        return copy (BLAZIKEN_VMAX_21, this);
      case BLAZIKEN_VMAX_201:
        return copy (BLAZIKEN_VMAX_21, this);
      case ICE_RIDER_CALYREX_VMAX_202:
        return copy (ICE_RIDER_CALYREX_VMAX_46, this);
      case ICE_RIDER_CALYREX_VMAX_203:
        return copy (ICE_RIDER_CALYREX_VMAX_46, this);
      case SHADOW_RIDER_CALYREX_VMAX_204:
        return copy (SHADOW_RIDER_CALYREX_VMAX_75, this);
      case SHADOW_RIDER_CALYREX_VMAX_205:
        return copy (SHADOW_RIDER_CALYREX_VMAX_75, this);
      case SANDACONDA_VMAX_206:
        return copy (SANDACONDA_VMAX_90, this);
      case GALARIAN_SLOWKING_VMAX_207:
        return copy (GALARIAN_SLOWKING_VMAX_100, this);
      case METAGROSS_VMAX_208:
        return copy (METAGROSS_VMAX_113, this);
      case TORNADUS_VMAX_209:
        return copy (TORNADUS_VMAX_125, this);
      case AGATHA_210:
        return copy (AGATHA_129, this);
      case AVERY_211:
        return copy (AVERY_130, this);
      case BRAWLY_212:
        return copy (BRAWLY_131, this);
      case CAITLIN_213:
        return copy (CAITLIN_132, this);
      case DOCTOR_214:
        return copy (DOCTOR_134, this);
      case FLANNERY_215:
        return copy (FLANNERY_139, this);
      case KAREN_S_CONVICTION_216:
        return copy (KAREN_S_CONVICTION_144, this);
      case KLARA_217:
        return copy (KLARA_145, this);
      case MELONY_218:
        return copy (MELONY_146, this);
      case PEONIA_219:
        return copy (PEONIA_149, this);
      case PEONY_220:
        return copy (PEONY_150, this);
      case SIEBOLD_221:
        return copy (SIEBOLD_153, this);
      case ELECTRODE_222:
        return copy (VividVoltage.ELECTRODE_46, this);
      case BRONZONG_223:
        return copy (BattleStyles.BRONZONG_102, this);
      case SNORLAX_224:
        return copy (AmazingVoltTackle.SNORLAX_84, this);
      case ECHOING_HORN_225:
        return copy (ECHOING_HORN_136, this);
      case FAN_OF_WAVES_226:
        return copy (BattleStyles.FAN_OF_WAVES_127, this);
      case FOG_CRYSTAL_227:
        return copy (FOG_CRYSTAL_140, this);
      case RUGGED_HELMET_228:
        return copy (RUGGED_HELMET_152, this);
      case URN_OF_VITALITY_229:
        return copy (BattleStyles.URN_OF_VITALITY_139, this);
      case WELCOMING_LANTERN_230:
        return copy (WELCOMING_LANTERN_156, this);
      case WATER_ENERGY_231:
        return basicEnergy (this, WATER);
      case PSYCHIC_ENERGY_232:
        return basicEnergy (this, PSYCHIC);
      case FIGHTING_ENERGY_233:
        return basicEnergy (this, FIGHTING);
      default:
        return null;
    }
  }
}
