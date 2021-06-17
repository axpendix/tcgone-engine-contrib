package tcgwars.logic.impl.gen8;

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
  CELEBI_VMAX_8 ("Celebi VMAX", "8", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
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
  BLAZIKEN_VMAX_21 ("Blaziken VMAX", "21", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIRE_]),
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
  ICE_RIDER_CALYREX_VMAX_46 ("Ice Rider Calyrex VMAX", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _WATER_]),
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
  SHADOW_RIDER_CALYREX_VMAX_75 ("Shadow Rider Calyrex VMAX", "75", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
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
  SANDACONDA_VMAX_90 ("Sandaconda VMAX", "90", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  CLOBBOPUS_91 ("Clobbopus", "91", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_92 ("Grapploct", "92", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  KUBFU_93 ("Kubfu", "93", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_94 ("Koffing", "94", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  WEEZING_95 ("Weezing", "95", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_WEEZING_96 ("Galarian Weezing", "96", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MOLTRES_V_97 ("Galarian Moltres V", "97", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  GALARIAN_SLOWKING_98 ("Galarian Slowking", "98", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_SLOWKING_V_99 ("Galarian Slowking V", "99", Rarity.UNCOMMON, [POKEMON, POKEMON_V, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  GALARIAN_SLOWKING_VMAX_100 ("Galarian Slowking VMAX", "100", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DARKNESS_]),
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
  METAGROSS_VMAX_113 ("Metagross VMAX", "113", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _METAL_]),
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
  TORNADUS_VMAX_125 ("Tornadus VMAX", "125", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _COLORLESS_]),
  FURFROU_126 ("Furfrou", "126", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  SKWOVET_127 ("Skwovet", "127", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_128 ("Greedent", "128", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  AGATHA_129 ("Agatha", "129", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AVERY_130 ("Avery", "130", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BRAWLY_131 ("Brawly", "131", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CAITLIN_132 ("Caitlin", "132", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRUSHING_GLOVES_133 ("Crushing Gloves", "133", Rarity.UNCOMMON, [TRAINER, ITEM]),
  DOCTOR_134 ("Doctor", "134", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DYNA_TREE_HILL_135 ("Dyna Tree Hill", "135", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ECHOING_HORN_136 ("Echoing Horn", "136", Rarity.UNCOMMON, [TRAINER, ITEM]),
  EXPEDITION_UNIFORM_137 ("Expedition Uniform", "137", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FIRE_RESISTANT_GLOVES_138 ("Fire-Resistant Gloves", "138", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FLANNERY_139 ("Flannery", "139", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FOG_CRYSTAL_140 ("Fog Crystal", "140", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GALARIAN_BREASTPLATE_141 ("Galarian Breastplate", "141", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HONEY_142 ("Honey", "142", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  JUSTIFIED_GLOVES_143 ("Justified Gloves", "143", Rarity.UNCOMMON, [TRAINER, ITEM]),
  KAREN_S_CONVICTION_144 ("Karen's Conviction", "144", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KLARA_145 ("Klara", "145", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_146 ("Melony", "146", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OLD_CEMETERY_147 ("Old Cemetery", "147", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PATH_TO_THE_PEAK_148 ("Path to the Peak", "148", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PEONIA_149 ("Peonia", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_150 ("Peony", "150", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_SCROLL_OF_THE_SKIES_151 ("Rapid Strike Scroll of the Skies", "151", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RUGGED_HELMET_152 ("Rugged Helmet", "152", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SIEBOLD_153 ("Siebold", "153", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SINGLE_STRIKE_SCROLL_OF_PIERCING_154 ("Single Strike Scroll of Piercing", "154", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WEEDING_GLOVES_155 ("Weeding Gloves", "155", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WELCOMING_LANTERN_156 ("Welcoming Lantern", "156", Rarity.UNCOMMON, [TRAINER, ITEM]),
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
  BRAWLY_188 ("Brawly", "188", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CAITLIN_189 ("Caitlin", "189", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DOCTOR_190 ("Doctor", "190", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FLANNERY_191 ("Flannery", "191", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HONEY_192 ("Honey", "192", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KAREN_S_CONVICTION_193 ("Karen's Conviction", "193", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KLARA_194 ("Klara", "194", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_195 ("Melony", "195", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONIA_196 ("Peonia", "196", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_197 ("Peony", "197", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SIEBOLD_198 ("Siebold", "198", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CELEBI_VMAX_199 ("Celebi VMAX", "199", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  BLAZIKEN_VMAX_200 ("Blaziken VMAX", "200", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIRE_]),
  BLAZIKEN_VMAX_201 ("Blaziken VMAX", "201", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIRE_]),
  ICE_RIDER_CALYREX_VMAX_202 ("Ice Rider Calyrex VMAX", "202", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  ICE_RIDER_CALYREX_VMAX_203 ("Ice Rider Calyrex VMAX", "203", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  SHADOW_RIDER_CALYREX_VMAX_204 ("Shadow Rider Calyrex VMAX", "204", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  SHADOW_RIDER_CALYREX_VMAX_205 ("Shadow Rider Calyrex VMAX", "205", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  SANDACONDA_VMAX_206 ("Sandaconda VMAX", "206", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  GALARIAN_SLOWKING_VMAX_207 ("Galarian Slowking VMAX", "207", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _DARKNESS_]),
  METAGROSS_VMAX_208 ("Metagross VMAX", "208", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _METAL_]),
  TORNADUS_VMAX_209 ("Tornadus VMAX", "209", Rarity.UNCOMMON, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _COLORLESS_]),
  AGATHA_210 ("Agatha", "210", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AVERY_211 ("Avery", "211", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BRAWLY_212 ("Brawly", "212", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CAITLIN_213 ("Caitlin", "213", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DOCTOR_214 ("Doctor", "214", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FLANNERY_215 ("Flannery", "215", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KAREN_S_CONVICTION_216 ("Karen's Conviction", "216", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KLARA_217 ("Klara", "217", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MELONY_218 ("Melony", "218", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONIA_219 ("Peonia", "219", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PEONY_220 ("Peony", "220", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SIEBOLD_221 ("Siebold", "221", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ELECTRODE_222 ("Electrode", "222", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  BRONZONG_223 ("Bronzong", "223", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SNORLAX_224 ("Snorlax", "224", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  ECHOING_HORN_225 ("Echoing Horn", "225", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FAN_OF_WAVES_226 ("Fan of Waves", "226", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FOG_CRYSTAL_227 ("Fog Crystal", "227", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RUGGED_HELMET_228 ("Rugged Helmet", "228", Rarity.UNCOMMON, [TRAINER, ITEM]),
  URN_OF_VITALITY_229 ("Urn of Vitality", "229", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WELCOMING_LANTERN_230 ("Welcoming Lantern", "230", Rarity.UNCOMMON, [TRAINER, ITEM]),
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
    return name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case WEEDLE_1:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness FIRE
          move "Pierce", {
            text "20 damage. "
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
            text "During your opponent's next turn, this Pokemon takes 40 less damage from attacks (after applying Weakness and Resistance)."
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
          move "Persistent Sting", {
            text "If your opponent's Active Pokemon has any Special Energy attached to it, it is now Knocked Out."
            energyCost GRASS
            attackRequirement {}
            onAttack {
              // TODO
            }
          }
          move "Jet Spear", {
            text "110 damage. Discard an Energy from this Pokemon."
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
            text "20 damage. "
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
          move "Quick Draw", {
            text "20 damage. Draw 2 cards."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
              draw 2
            }
          }
          move "Air Slash", {
            text "100 damage. Discard an Energy from this Pokemon."
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
          weakness GRASS
          move "Horn Attack", {
            text "20 damage. "
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Ippon Throw", {
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
          move "Lew Leaf Dance", {
            text "Attach any number of [G] Energy from your hand to your Pokemon in any way you like."
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
            text "60 damage. Switch this Pokemon with 1 of your Benched Pokemon."
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
          bwAbility "Healing Forest", {
            text "Once during your turn you may heal 20 damage from each of your [G] Pokemon."
            actionA {
              checkLastTurn()
              assert my.all.find { it.numberOfDamageCounters && it.types.contains(G) } : "No damaged [G] Pokemon"
              powerUsed()

              my.all.each {
                if (it.types.contains(G))
                  heal(30, it, SRC_ABILITY)
              }
            }
          }
          move "Max Plant", {
            text "130 damage. Search your deck for up to 2 Pokemon and put them into your hand. Then, shuffle your deck."
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
            text "60 damage. "
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
          bwAbility "Toughness Up", {
            text "As long as this Pokemon is in play, the maximum HP of your Single Strike Pokemon in play (excluding any Abomasnow) is increased by 50. You can't apply more than 1 Toughness Up Ability at a time."
            actionA {
            }
          }
          move "Mega Punch", {
            text "90 damage. "
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
            text "During your opponent's next turn, damage done by the Defending Pokemon's attacks is reduced by 20."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Rear Kick", {
            text "20 damage. "
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
            text "30 damage. "
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

            }
          }
        };
      case BOUNSWEET_13:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness FIRE
          move "Hop", {
            text "30 damage. "
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
          move "Hop", {
            text "20 damage. "
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

            }
          }
        };
      case TSAREENA_15:
        return evolution (this, from:"Steenee", hp:HP140, type:G, retreatCost:2) {
          weakness FIRE
          move "Trod On", {
            text "10+ damage. This attack does 50 more damage for each Energy in the Retreat Cost of your opponent's Active Pokemon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Solar Beam", {
            text "120 damage. "
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
          move "Double Bash", {
            text "30x damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {

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
            }
          }
        };
      case RILLABOOM_18:
        return evolution (this, from:"Thwackey", hp:HP180, type:G, retreatCost:3) {
          weakness FIRE
          move "Wood Drain", {
            text "60 damage. Heal 30 damage from this Pokemon."
            energyCost GRASS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Surging Beat", {
            text "120+ damage. You may discard any number of Energy cards attached to your Pokemon in play. If you do, this attack does 30 more damage for each card discarded in this way."
            energyCost GRASS, GRASS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case ZARUDE_19:
        return basic (this, hp:HP130, type:G, retreatCost:2) {
          weakness FIRE
          move "Clan Summoning Song", {
            text "Search your deck for a [G] Pokemon, reveal it, and put it in your hand. Then, shuffle your deck. If you go second, on your first turn you may search for up to 3 [G] Pokemon instead."
            energyCost GRASS
            attackRequirement {}
            onAttack {

            }
          }
          move "Spring Rain Whip", {
            text "60+ damage. Does 20 additional damage for each [G] Energy attached to this Pokemon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case BLAZIKEN_V_20:
        return basic (this, hp:HP210, type:R, retreatCost:2) {
          weakness WATER
          move "High Jump Kick", {
            text "50 damage. "
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Fire Spin", {
            text "210 damage. Discard 2 Energy from this Pokemon."
            energyCost FIRE, FIRE, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 210
            }
          }
        };
      case BLAZIKEN_VMAX_21:
        return evolution (this, from:"Blaziken V", hp:HP320, type:R, retreatCost:2) {
          weakness WATER
          move "Clutch", {
            text "60 damage. The Defending Pokemon can't retreat during your opponent's next turn."
            energyCost FIRE
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Max Blaze", {
            text "130 damage. Attach an Energy card from your discard pile to up to 2 of your Benched Rapid Strike Pokemon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
            }
          }
        };
      case CASTFORM_SUNNY_FORM_22:
        return basic (this, hp:HP070, type:R, retreatCost:0) {
          weakness WATER
          bwAbility "Forecast", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokemon's attacks."
            actionA {
            }
          }
          move "Anticyclone Blast", {
            text "150 damage. You must discard a Stadium card in play in order to use this attack."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 150
            }
          }
        };
      case LARVESTA_23:
        return basic (this, hp:HP080, type:R, retreatCost:3) {
          weakness WATER
          move "Flame Charge", {
            text "10 damage. Search your deck for a [R] Energy card and attach it to this Pokemon. Then, shuffle your deck."
            energyCost FIRE
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case VOLCARONA_24:
        return evolution (this, from:"Larvesta", hp:HP130, type:R, retreatCost:2) {
          weakness WATER
          move "Combustion", {
            text "50 damage. "
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Fire Spin", {
            text "170 damage. Discard 2 Energy from this Pokemon."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 170
            }
          }
        };
      case VOLCANION_V_25:
        return basic (this, hp:HP220, type:R, retreatCost:3) {
          weakness WATER
          move "Heat Blast", {
            text "50 damage. "
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Dynamite Tackle", {
            text "100+ damage. If this Pokemon has 10 damage counters or more on it, this attack does 150 more damage."
            energyCost FIRE, FIRE, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case SCORBUNNY_26:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness WATER
          move "Headbutt", {
            text "20 damage. "
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
            text "60 damage. During your next turn, this Pokemon can't attack."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case CINDERACE_28:
        return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
          weakness WATER
          bwAbility "Crisis Power", {
            text "This Pokemon's attacks do 30 more damage to your opponent's Active Pokemon for each Prize card your opponent has already taken."
            actionA {
            }
          }
          move "Fireball Shoot", {
            text "150 damage. This Pokemon can't attack during your next turn."
            energyCost FIRE, COLORLESS
            attackRequirement {}
            onAttack {
              damage 150
            }
          }
        };
      case LAPRAS_29:
        return basic (this, hp:HP110, type:W, retreatCost:1) {
          weakness METAL
          move "White Call", {
            text "Search your deck for up to 2 Melony cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Icy Wind", {
            text "50 damage. Your opponent's Active Pokemon is now Asleep."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case SNEASEL_30:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness METAL
          move "Lop Off", {
            text "Flip a coin. If heads, discard an Energy attached to your opponent's Active Pokemon."
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
          move "Two Hit KO", {
            text "If the Defending Pokemon takes damage from 1 of your Rapid Strike Pokemon during your next turn, it is Knocked Out."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Nasty Plot", {
            text "Search your deck for up to 2 cards and put them in your hand. Then, shuffle your deck."
            energyCost WATER
            attackRequirement {}
            onAttack {

            }
          }
        };
      case DELIBIRD_32:
        return basic (this, hp:HP090, type:W, retreatCost:1) {
          weakness METAL
          move "Icy Snow", {
            text "10 damage. "
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Delivery", {
            text "Return this Pokemon and all cards attached to it to your deck. Then search your deck for any card, put it in your hand, and shuffle your deck."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case CASTFORM_RAINY_FORM_33:
        return basic (this, hp:HP070, type:W, retreatCost:0) {
          weakness LIGHTNING
          bwAbility "Forecast", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokemon's attacks."
            actionA {
            }
          }
          move "Rain Shower", {
            text "This attack does 20 damage to each of your opponent's Pokemon."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case CASTFORM_SNOWY_FORM_34:
        return basic (this, hp:HP070, type:W, retreatCost:0) {
          weakness METAL
          bwAbility "Forecast", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokemon's attacks."
            actionA {
            }
          }
          move "Frost Typhoon", {
            text "120 damage. This Pokemon can't use Frost Typhoon during your next turn."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
            }
          }
        };
      case SNORUNT_35:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness METAL
          move "Headbutt", {
            text "30 damage. "
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
          bwAbility "Snowfall", {
            text "Once during your turn when you play this card from your hand to evolve a Pokemon, you may search your discard pile for a [W] Energy and attach it to 1 of your Pokemon."
            actionA {
            }
          }
          move "Crystal Breath", {
            text "90 damage. This Pokemon can't attack during your next turn."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case SPHEAL_37:
        return basic (this, hp:HP070, type:W, retreatCost:2) {
          weakness METAL
          move "Ram", {
            text "10 damage. "
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
            text "30 damage. "
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Aurora Beam", {
            text "70 damage. "
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
        };
      case WALREIN_39:
        return evolution (this, from:"Sealeo", hp:HP170, type:W, retreatCost:4) {
          weakness METAL
          move "Aurora Beam", {
            text "70 damage. "
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
          move "Hail Prison", {
            text "160 damage. Discard 2 Energy from this Pokemon. If you do, the opponent's Active Pokemon is now Paralyzed."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 160
            }
          }
        };
      case TAPU_FINI_40:
        return basic (this, hp:HP120, type:W, retreatCost:1) {
          weakness LIGHTNING
          move "Smash Turn", {
            text "30 damage. You may switch this Pokemon with 1 of your Benched Pokemon."
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Ocean Loop", {
            text "120 damage. Return an Energy from this Pokemon to your hand."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 120
            }
          }
        };
      case SOBBLE_41:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness LIGHTNING
          move "Continuous Call", {
            text "Search your deck for up to 3 Rapid Strike Basic Pokemon and put them on your Bench. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Double Spin", {
            text "Flip 2 coins, this attack does 20 damage times the number of heads."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

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
            }
          }
        };
      case INTELEON_43:
        return evolution (this, from:"Drizzile", hp:HP150, type:W, retreatCost:1) {
          weakness LIGHTNING
          bwAbility "Quick Shooter", {
            text "Once during your turn, you may place 2 damage counters on 1 of your opponent's Pokemon."
            actionA {
            }
          }
          move "Waterfall", {
            text "70 damage. "
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
            text "40 damage. "
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Slash Rapid Bullet", {
            text "Does 30 damage for each of your Rapid Strike Pokemon in play."
            energyCost WATER, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case ICE_RIDER_CALYREX_V_45:
        return basic (this, hp:HP210, type:W, retreatCost:2) {
          weakness METAL
          move "Pierce", {
            text "40 damage. "
            energyCost WATER
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Glacial Lance", {
            text "200 damage. Discard 2 Energy from this Pokemon."
            energyCost WATER, WATER, COLORLESS
            attackRequirement {}
            onAttack {
              damage 200
            }
          }
        };
      case ICE_RIDER_CALYREX_VMAX_46:
        return evolution (this, from:"Ice Rider Calyrex V", hp:HP320, type:W, retreatCost:2) {
          weakness METAL
          move "Ride of the High King", {
            text "10+ damage. This attack does 30 more damage for each of your opponent's Benched Pokemon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Max Lance", {
            text "10+ damage. You may discard up to 2 Energy cards from this Pokemon. If you do, this attack does 120 more damage for each Energy card discarded in this way."
            energyCost WATER, WATER
            attackRequirement {}
            onAttack {

            }
          }
        };
      case MAREEP_47:
        return basic (this, hp:HP070, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Growl", {
            text "During your opponent's next turn, any damage done by the Defending Pokemon is reduced by 20."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Static Shock", {
            text "20 damage. "
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

        };
      case AMPHAROS_49:
        return evolution (this, from:"Flaaffy", hp:HP160, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Thundershock", {
            text "50 damage. Flip a coin. If heads, your opponent's Active Pokemon is now Paralyzed."
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Searchlight Tail", {
            text "90+ damage. Look at your opponent's hand. If you find any Energy there, this attack does 90 more damage."
            energyCost LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case BLITZLE_50:
        return basic (this, hp:HP060, type:[], retreatCost:1) {
          weakness FIGHTING
          move "Thunder Spear", {
            text "This attack does 10 damage to 1 of your opponent's Benched Pokemon. (Don't apply Weakness and Resistance for Benched Pokemon)"
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {

            }
          }
        };
      case ZEBSTRIKA_51:
        return evolution (this, from:"Blitzle", hp:HP120, type:L, retreatCost:1) {
          weakness FIGHTING
          move "Link Bolt", {
            text "30+ damage. If any of your other Rapid Strike Pokemon used an attack during your last turn, this attack does 90 more damage."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Spark Rush", {
            text "90x damage. Flip a coin until you get tails. This attack does 90 damage for each heads."
            energyCost LIGHTNING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case THUNDURUS_52:
        return basic (this, hp:HP120, type:L, retreatCost:1) {
          weakness FIGHTING
          move "Assist Spark", {
            text "30 damage. You may attach a [L] from your hand to 1 of your Benched Pokemon."
            energyCost LIGHTNING
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Thunder", {
            text "130 damage. This Pokemon does 30 damage to itself."
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
            }
          }
        };
      case ZERAORA_V_53:
        return basic (this, hp:HP210, type:L, retreatCost:2) {
          weakness FIGHTING
          move "Cross Fist", {
            text "100 damage. If any of your other Rapid Strike Pokemon used an attack during your last turn, this attack does 160 damage to 1 of your opponent's Benched Pokemon. (Don't apply Weakness and Resistance for Benched Pokemon)"
            energyCost LIGHTNING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case GALARIAN_SLOWPOKE_54:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Sting", {
            text "10 damage. "
            energyCost COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Headbutt", {
            text "20 damage. "
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
          move "Sleep Wave", {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokemon is now Asleep."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case HAUNTER_56:
        return evolution (this, from:"Gastly", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30

        };
      case GENGAR_57:
        return evolution (this, from:"Haunter", hp:HP130, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Dying Gift", {
            text "When this Pokemon is Knocked Out by damage from an opponent's attack, you may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            actionA {
            }
          }
          move "Pain Burst", {
            text "10+ damage. This attack does 40 more damage for each damage counter on your opponent's Active Pokemon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GALARIAN_ARTICUNO_V_58:
        return basic (this, hp:HP210, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Psychic Construct", {
            text "Once during your turn, you may discard 2 cards from your hand. If you do, draw 1 card."
            actionA {
            }
          }
          move "Psychic Beam", {
            text "110 damage. Your opponent's Active Pokemon is now Confused."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 110
            }
          }
        };
      case RALTS_59:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness METAL
          move "Confuse Ray", {
            text "Your opponent's Active Pokemon is now Confused."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
        };
      case KIRLIA_60:
        return evolution (this, from:"Kirlia", hp:HP080, type:P, retreatCost:1) {
          weakness METAL
          move "Mirage Step", {
            text "Search your deck for up to 3 Pokemon named"
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GARDEVOIR_61:
        return evolution (this, from:"Kirlia", hp:HP140, type:P, retreatCost:2) {
          weakness METAL
          bwAbility "Arcana Shine", {
            text "Once during your turn you may look at the top 2 cards of your deck. Choose any number of basic Energy you find there and attach them to your Pokemon in any way you like. Put the other cards into your hand."
            actionA {
            }
          }
          move "Brain Wave", {
            text "60+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokemon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case SHUPPET_62:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30

        };
      case BANETTE_63:
        return evolution (this, from:"Shuppet", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Spiteful Resolve", {
            text "20x damage. Put up to 7 damage counters on this Pokemon. This attack does 20 damage for each damage counter you placed in this way."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
          move "Eerie Light", {
            text "50 damage. Your opponent's Active Pokemon is now Confused."
            energyCost PSYCHIC, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case CRESSELIA_64:
        return basic (this, hp:HP120, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Crescent Growth", {
            text "Search your deck for a [P] Energy and attach it to 1 of your Pokemon. Then, shuffle your deck. If you go second, on your first turn you may attach up to 3 [P] Energy to 1 of your Pokemon instead."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
          move "Photon Laser", {
            text "30+ damage. If you have 5 or more Energy in play, this attack does 90 more damage."
            energyCost PSYCHIC, PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GOLETT_65:
        return basic (this, hp:HP090, type:P, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Pound", {
            text "10 damage. "
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Punch", {
            text "30 damage. "
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
          move "Enhanced Punch", {
            text "60+ damage. If this Pokemon has a Pokemon Tool attached to it, this attack does 90 more damage."
            energyCost PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Megaton Fall", {
            text "190 damage. This Pokemon does 30 damage to itself."
            energyCost PSYCHIC, PSYCHIC, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 190
            }
          }
        };
      case SWIRLIX_67:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness METAL
          move "Draining Kiss", {
            text "20 damage. Heal 10 damage from this Pokemon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SLURPUFF_68:
        return evolution (this, from:"Swirlix", hp:HP110, type:P, retreatCost:2) {
          weakness METAL
          move "Follow the Smell", {
            text "Flip 3 coins. For each heads, choose a card from your discard pile, show it to your opponent, and put it into your hand."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Fairy Wind", {
            text "80 damage. "
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
            text "20 damage. "
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
          move "Rapid Tentacles", {
            text "40x damage. You may reveal as many Rapid Strike cards from you hand as you like. This attack does 40 damage times the number of cards you revealed. Then, shuffle those cards into your deck."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
        };
      case HATENNA_71:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Psyshot", {
            text "10 damage. "
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case HATTREM_72:
        return evolution (this, from:"null", hp:HP080, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Spiral Drain", {
            text "Heal 30 damage from this Pokemon."
            energyCost PSYCHIC
            attackRequirement {}
            onAttack {

            }
          }
        };
      case HATTERENE_73:
        return evolution (this, from:"Hattrem", hp:HP130, type:P, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Witch's Sonata", {
            text "Once during your turn, you may switch your Active Pokemon with 1 of your Benched Pokemon, then have your opponent switch their Active Pokemon with 1 of their Benched Pokemon."
            actionA {
            }
          }
          move "Psychic", {
            text "30+ damage. This attack does 50 more damage for each Energy attached to your opponent's Active Pokemon."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

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
            }
          }
          move "Astral Barrage", {
            text "Put 5 damage counters on 2 of your opponent's Pokemon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case SHADOW_RIDER_CALYREX_VMAX_75:
        return evolution (this, from:"Shadow Rider Calyrex V", hp:HP320, type:P, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          bwAbility "Underworld Door", {
            text "Once during your turn you may attach a [P] Energy card from your hand to 1 of your Benched [P] Pokemon. Then, draw 2 cards."
            actionA {
            }
          }
          move "Max Geist", {
            text "10+ damage. This attack does 30 more damage for each [P] Energy attached to your Pokemon in play."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case DIGLETT_76:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness GRASS
          move "Dig", {
            text "10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to this Pokemon."
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case DUGTRIO_77:
        return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
          weakness GRASS
          move "Triple Head", {
            text "60x damage. Flip 3 coins. This attack does 60 damage times the number of heads. If all of the coins are heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent's next turn."
            energyCost FIGHTING, COLORLESS
            attackRequirement {}
            onAttack {

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
            }
          }
        };
      case GALARIAN_SIRFETCH_D_79:
        return evolution (this, from:"Galarian Farfetch'd", hp:HP130, type:F, retreatCost:2) {
          weakness PSYCHIC
          move "Peck", {
            text "40 damage. "
            energyCost FIGHTING
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Leek Strike", {
            text "70+ damage. If this Pokemon has a Pokemon Tool attached, this attack does 90 more damage and this attack's damage isn't affected by Resistance."
            energyCost FIGHTING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GALARIAN_ZAPDOS_V_80:
        return basic (this, hp:HP200, type:F, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Fighting Instinct", {
            text "For each Pokemon V your opponent has in play, this Pokemon's attacks cost [C] less."
            actionA {
            }
          }
          move "Thunderclap Kick", {
            text "170 damage. Before doing damage, discard a Special Energy from your opponent's Active Pokemon."
            energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
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
            }
          }
          move "Dynablade", {
            text "This attack does 60 damage times the number of your opponent's Pokemon V in play."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

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

            }
          }
        };
      case GALARIAN_RUNERIGUS_83:
        return evolution (this, from:"Galarian Yamask", hp:HP120, type:F, retreatCost:2) {
          weakness GRASS
          bwAbility "Spiteful Lithograph", {
            text "If this Pokemon is in the Active Spot and is damaged by an attack from your opponent's Pokemon VMAX (even if this Pokemon is Knocked Out), put damage counters on the Attacking Pokemon equal to the damage done to this Pokémon."
            actionA {
            }
          }
          move "Energy Press", {
            text "60+ damage. This attack does 20 more damage for each Energy attached to your opponent's Active Pokémon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case CRABRAWLER_84:
        return basic (this, hp:HP080, type:F, retreatCost:3) {
          weakness PSYCHIC
          move "Toss", {
            text "20 damage. "
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

            }
          }
        };
      case CRABOMINABLE_85:
        return evolution (this, from:"Crabrawler", hp:HP150, type:F, retreatCost:4) {
          weakness PSYCHIC
          move "Crabhammer", {
            text "130 damage. "
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
            text "30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokemon."
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
            text "80+ damage. This attack does 10 more damage for each Single Strike Pokemon in your discard pile."
            energyCost FIGHTING, FIGHTING
            attackRequirement {}
            onAttack {

            }
          }
        };
      case PASSIMIAN_88:
        return basic (this, hp:HP110, type:F, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Throwing Coach", {
            text "All of your Rapid Strike Pokemon's attacks do 30 more damage to your opponent's Benched Pokemon V and Pokemon-GX. You can't use more than 1 Throwing Coach Ability at a time."
            actionA {
            }
          }
          move "Fling", {
            text "This attack does 20 damage to 1 of your opponent's Pokemon. (Don't apply Weakness and Resistance for Benched Pokemon)"
            energyCost FIGHTING
            attackRequirement {}
            onAttack {

            }
          }
        };
      case SANDACONDA_V_89:
        return basic (this, hp:HP220, type:F, retreatCost:2) {
          weakness GRASS
          bwAbility "Sand Barricade", {
            text "This Pokemon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            actionA {
            }
          }
          move "Land Crush", {
            text "140 damage. "
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
            }
          }
        };
      case CLOBBOPUS_91:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness PSYCHIC
          move "Slap", {
            text "30 damage. "
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
          bwAbility "Grappling Master", {
            text "If this Pokemon is your Active Pokemon, your opponent's Active Pokemon's Retreat Cost is increased by 2."
            actionA {
            }
          }
          move "Synchro Buster", {
            text "80+ damage. If you and your opponent have the same number of cards in your hands, this attack does 80 more damage."
            energyCost FIGHTING, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case KUBFU_93:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness PSYCHIC
          move "Discipline", {
            text "Search your deck for a basic Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Elbow Strike", {
            text "60 damage. "
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
            text "20 damage. "
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case WEEZING_95:
        return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Blend Toxin", {
            text "Your opponent's Active Pokemon is now Confused. Attach a [D] Energy from your discard pile to this Pokemon."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Smog Burst", {
            text "20+ damage. This attack does 20 more damage for each [D] Energy attached to your Pokemon in play."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GALARIAN_WEEZING_96:
        return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Energy Factory", {
            text "Each basic [D] Energy attached to your Pokemon with “Weezing” in its name provides [D][D] Energy. You can't apply more than 1 Energy Factory Ability at a time."
            actionA {
            }
          }
          move "Suffocating Gas", {
            text "50 damage"
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GALARIAN_MOLTRES_V_97:
        return basic (this, hp:HP220, type:D, retreatCost:2) {
          weakness GRASS
          bwAbility "Bolstered Wings", {
            text "Once during your turn, you may attach a [D] Energy from your discard pile to this Pokemon. You can't use more than 1 Bolstered Wings Ability per turn."
            actionA {
            }
          }
          move "Aura Burn", {
            text "190 damage. This Pokemon does 30 damage to itself."
            energyCost DARKNESS, DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 190
            }
          }
        };
      case GALARIAN_SLOWKING_98:
        return evolution (this, from:"Galarian Slowpoke", hp:HP120, type:D, retreatCost:3) {
          weakness FIGHTING
          bwAbility "Secret Medicine", {
            text "Once during your turn, you may choose 1 of your Pokemon. Flip a coin, if heads restore 90 HP to that Pokemon. If tails, place 3 damage counters on that Pokemon."
            actionA {
            }
          }
          move "Spray Fluid", {
            text "90 damage. "
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
          move "Mixing", {
            text "Discard a card from your hand. Then, draw 3 cards from your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Doom Word", {
            text "The Defending Pokemon is Knocked Out at the end of your opponent's next turn."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case GALARIAN_SLOWKING_VMAX_100:
        return evolution (this, from:"Galarian Slowking V", hp:HP320, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Max Toxin", {
            text "10 damage. Your opponent's Active Pokemon is now Poisoned. During Pokemon Checkup, put 12 damage counters on that Pokemon instead of 1."
            energyCost DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case QWILFISH_101:
        return basic (this, hp:HP090, type:D, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Burst Needle", {
            text "If this Pokemon is your Active Pokemon and is Knocked Out by damage from an opponent's attack, put 6 damage counters on the Attacking Pokemon."
            actionA {
            }
          }
          move "Poison Job", {
            text "30 damage. Your opponent's Active Pokemon is now Poisoned."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case SEVIPER_102:
        return basic (this, hp:HP110, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Strength Tail", {
            text "90+ damage. If you played a 'Single Strike' Supporter card from your hand during this turn, this attack does 90 more damage."
            energyCost DARKNESS, DARKNESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case SPIRITOMB_103:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness GRASS
          move "Ghostly Scream", {
            text "Count the number of Pokemon cards in your opponent's discard pile. Put that many damage counters on your opponent's Pokemon in any way you like. Then, your opponent shuffles all of the Pokemon cards from their discard pile into their deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case LIEPARD_V_104:
        return basic (this, hp:HP190, type:D, retreatCost:1) {
          weakness GRASS
          bwAbility "Concealing Claw", {
            text "Once during your turn when you play this Pokemon from your hand onto your Bench, you may discard 1 Pokemon Tool card attached to any Pokemon in play (yours or your opponent's)."
            actionA {
            }
          }
          move "Shadow Reaper", {
            text "110 damage. You may return this Pokemon and all cards attached to it to your hand."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 110
            }
          }
        };
      case VENIPEDE_105:
        return basic (this, hp:HP070, type:D, retreatCost:2) {
          weakness FIGHTING
          move "Poison Sting", {
            text "10 damage. Your opponent's Active Pokemon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case WHIRLIPEDE_106:
        return evolution (this, from:"Venipede", hp:HP070, type:D, retreatCost:3) {
          weakness FIGHTING
          move "Poison Sting", {
            text "20 damage. Your opponent's Active Pokemon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Rolling Tackle", {
            text "50 damage. "
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
            text "50 damage. Your opponent's Active Pokemon is now Poisoned."
            energyCost DARKNESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Venoshock", {
            text "100+ damage. If your opponent's Active Pokemon is Poisoned, this attack does 120 more damage."
            energyCost DARKNESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

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
            }
          }
        };
      case ARON_109:
        return basic (this, hp:HP070, type:M, retreatCost:2) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Gnaw", {
            text "20 damage. "
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Rolling Tackle", {
            text "50 damage. "
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
            text "50 damage. "
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Metal Claw", {
            text "90 damage. "
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
            text "100 damage. During your opponent's next turn, any damage done to this Pokemon by attacks is reduced by 30."
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
          move "Ground Split", {
            text "240 damage. This attack does 30 damage to each of your Pokemon. (Don't apply Weakness and Resistance for Benched Pokemon)."
            energyCost METAL, METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 240
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

            }
          }
          move "Syncrohammer", {
            text "60+ damage. If this Pokemon and the Defending Pokemon have the same number of Energy attached, this attack does 90 more damage."
            energyCost METAL, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case METAGROSS_VMAX_113:
        return evolution (this, from:"Metagross V", hp:HP330, type:M, retreatCost:3) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Magnetic Pull", {
            text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            energyCost METAL
            attackRequirement {}
            onAttack {

            }
          }
        };
      case COBALION_114:
        return basic (this, hp:HP120, type:M, retreatCost:2) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Headbang", {
            text "40 damage. "
            energyCost METAL, COLORLESS
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Metal Slash", {
            text "130 damage. This Pokemon can't attack during your next turn."
            energyCost METAL, METAL, COLORLESS
            attackRequirement {}
            onAttack {
              damage 130
            }
          }
        };
      case TAUROS_115:
        return basic (this, hp:HP130, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Raging Bull", {
            text "20+ damage. This attack does 20 more damage for each damage counter on this Pokemon. This Pokemon is now Confused."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case PORYGON_116:
        return basic (this, hp:HP060, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Sharpen", {
            text "20 damage. "
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

            }
          }
        };
      case PORYGON_Z_118:
        return evolution (this, from:"Porygon2", hp:HP140, type:C, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Bug Transmission", {
            text "Once during your turn when you attach an Energy from your hand to this Pokemon, you may leave the opponent's Active Pokemon Confused."
            actionA {
            }
          }
          move "Super Beam", {
            text "170 damage. Discard 2 Energy from this Pokemon."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 170
            }
          }
        };
      case BLISSEY_V_119:
        return basic (this, hp:HP250, type:C, retreatCost:4) {
          weakness FIGHTING
          bwAbility "Natural Cure", {
            text "Whenever you attach an Energy from your hand to this Pokemon, remove all Special Conditions from this Pokemon."
            actionA {
            }
          }
          move "Blissey Bomber", {
            text "10+ damage. This attack does 30 more damage for each Energy attached to this Pokemon. After doing damage, you may attach up to 3 Energy cards from your discard pile to this Pokemon."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case ZANGOOSE_120:
        return basic (this, hp:HP110, type:C, retreatCost:2) {
          weakness FIGHTING
          move "Gale Claw", {
            text "50 damage. If you played a"
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case CASTFORM_121:
        return basic (this, hp:HP070, type:C, retreatCost:0) {
          weakness FIGHTING
          bwAbility "Forecast", {
            text "If you have 8 or more Stadium cards in your discard pile, ignore all Energy in the attack cost of each of this Pokemon's attacks."
            actionA {
            }
          }
          move "Weather Force", {
            text "80 damage. Draw cards until you have 6 cards in your hand."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 80
            }
          }
        };
      case KECLEON_122:
        return basic (this, hp:HP090, type:C, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Colorful change", {
            text "This Pokemon is the same type as the Basic Energy attached to it. (If 2 or more types of Basic Energy are attached, it becomes all of those types)"
            actionA {
            }
          }
          move "Spinning Attack", {
            text "90 damage. "
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
            }
          }
          move "Sky Return", {
            text "30 damage. Return this Pokemon and all cards attached to it to your hand."
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 30
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

            }
          }
          move "Blast Hammer", {
            text "180 damage. Discard an Energy from this Pokemon."
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
          move "Blast Wind", {
            text "60 damage. "
            energyCost COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Max Fujin", {
            text "120+ damage. If there is a Stadium card in play, this attack does 120 more damage. Then discard that Stadium."
            energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
        };
      case FURFROU_126:
        return basic (this, hp:HP090, type:C, retreatCost:1) {
          weakness FIGHTING
          move "Find a Friend", {
            text "Search your deck for a Pokemon, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Fur Attack", {
            text "90 damage. During your opponent's next turn, any damage done to this Pokemon by attacks is reduced by 20."
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case SKWOVET_127:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness FIGHTING
          move "Scavenge", {
            text "Put a Pokemon Tool card from your discard pile into your hand."
            energyCost COLORLESS
            attackRequirement {}
            onAttack {

            }
          }
          move "Gnaw", {
            text "10 damage. "
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
            text "Prevent all effects of your opponent's Item and Supporter cards that would discard Energy from your Pokemon or return Energy from your Pokemon to your hand or deck."
            actionA {
            }
          }
          move "Gnaw", {
            text "90 damage. "
            energyCost COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case AGATHA_129:
        return supporter (this) {
          text "Move up to 3 damage counters from your Active Pokemon to your opponent's Active Pokemon. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case AVERY_130:
        return supporter (this) {
          text "Draw 3 cards. Then, your opponent discards their Benched Pokemon until they have 3 Benched Pokemon. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case BRAWLY_131:
        return supporter (this) {
          text "Search your deck for up to 3 Rapid Strike Basic Pokemon and put them on your Bench. Then, shuffle your deck. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case CAITLIN_132:
        return supporter (this) {
          text "Put as many cards from your hand as you like on the bottom of your deck in any order. Then, draw a card for each card you put on the bottom of your deck. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case CRUSHING_GLOVES_133:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. The Pokemon this card is attached to does 30 more damage to your opponent's Active M Pokemon. You may play as many Item cards as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case DOCTOR_134:
        return supporter (this) {
          text "Draw 2 cards. If your opponent's Active Pokemon is a Pokemon VMAX, draw 2 more cards. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case DYNA_TREE_HILL_135:
        return stadium (this) {
          text "Pokemon in play (both yours and your opponent's) can't be healed. Note Pokemon uses the word recover when referring to Special Conditions, so although Pokemon in play can't have their HP healed, they can still recover from Special Conditions."
          onPlay {
          }
          onRemoveFromPlay{
          }
        };
      case ECHOING_HORN_136:
        return itemCard (this) {
          text "Put a Basic Pokemon from your opponent's discard pile onto their Bench. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case EXPEDITION_UNIFORM_137:
        return itemCard (this) {
          text "Look at the bottom 3 cards from your deck and place them on top of your deck in any order. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case FIRE_RESISTANT_GLOVES_138:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. When the Pokemon this card is attached to attacks, damage done to your opponent's Active R Pokemon is increased by 30. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case FLANNERY_139:
        return supporter (this) {
          text "Choose a Special Energy card attached to 1 of your opponent's Pokemon, and any Stadium card in play, and discard them. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case FOG_CRYSTAL_140:
        return itemCard (this) {
          text "Search your deck for either a Basic P Pokemon or P Energy, reveal it, and put it into your hand. Then, shuffle your deck. You may play as many Item cards as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case GALARIAN_BREASTPLATE_141:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. If the Pokemon this card is attached to has Galarian in its name, it takes 30 less damage from your opponent's attacks (after applying Weakness and Resistance). You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case HONEY_142:
        return supporter (this) {
          text "Draw a card for each Pokemon V on your opponent's Bench. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case JUSTIFIED_GLOVES_143:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. When the Pokemon this card is attached to attacks, damage done to your opponent's Active D Pokemon is increased by 30. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case KAREN_S_CONVICTION_144:
        return supporter (this) {
          text "During this turn, your Single Strike Pokemon's attacks do 20 more damage to your opponent's Active Pokemon for each Prize Card your opponent has already taken. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case KLARA_145:
        return supporter (this) {
          text "Choose up to 2 Pokemon and up to 2 Basic Energy from your discard pile, show them to your opponent, and put them into your hand. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case MELONY_146:
        return supporter (this) {
          text "Attach a W Energy from your discard pile to 1 of your Pokemon V. Then, draw 3 cards. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case OLD_CEMETERY_147:
        return stadium (this) {
          text "Whenever a player attaches an Energy from their hand to 1 of their Pokemon (excluding P Pokemon), put 2 damage counters on that Pokemon. This Stadium stays in play when you play it. Discard it if another Stadium comes into play. If a Stadium with the same name is in play, you can't play this card."
          onPlay {
          }
          onRemoveFromPlay{
          }
        };
      case PATH_TO_THE_PEAK_148:
        return stadium (this) {
          text "Each player's Pokemon in play with a Rule Box has no Abilities. This Stadium stays in play when you play it. Discard it if another Stadium comes into play. If a Stadium with the same name is in play, you can't play this card."
          onPlay {
          }
          onRemoveFromPlay{
          }
        };
      case PEONIA_149:
        return supporter (this) {
          text "Choose up to 3 of your Prize cards and put them into your hand. Then, place the same number of cards from your hand face-down as Prize cards. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case PEONY_150:
        return supporter (this) {
          text "Discard your hand and search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case RAPID_STRIKE_SCROLL_OF_THE_SKIES_151:
        return itemCard (this) {
          text "Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. The Rapid Strike Pokemon this card is attached to can use the attack on this card. LC Flying Suplex 10 damage. This attack does 50 more damage for each Energy attached to your opponent's Active Pokemon. You may play as many Item cards as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case RUGGED_HELMET_152:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. When the Pokemon this card is attached to is your Active Pokemon and is damaged by an opponent's attack, choose an Energy attached to the Attacking Pokemon and return it to your opponent's hand. You may play as many Item cards as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case SIEBOLD_153:
        return supporter (this) {
          text "Choose up to 2 of your Rapid Strike Pokemon in play and heal 60 damage from each of them. You may play only 1 Supporter card during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case SINGLE_STRIKE_SCROLL_OF_PIERCING_154:
        return itemCard (this) {
          text "Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. The Single Strike Pokemon this card is attached to can use the attack on this card. RCC Overreach 120 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokemon. You may play as many Item cards as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case WEEDING_GLOVES_155:
        return itemCard (this) {
          text "Pokemon Tool Attach a Pokemon Tool to 1 of your Pokemon that doesn't already have a Pokemon Tool attached. When the Pokemon this card is attached to attacks, damage done to your opponent's Active G Pokemon is increased by 30. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case WELCOMING_LANTERN_156:
        return itemCard (this) {
          text "Choose a Single Strike Supporter card from your discard pile and put it into your hand. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case IMPACT_ENERGY_157:
        return specialEnergy (this, [[C]]) {
          text "This card can only be attached to a Single Strike Pokemon. If this card is attached to anything other than a Single Strike Pokemon, discard this card. As long as this card is attached to a Pokemon, this card provides every type of Energy but provides only 1 Energy at a time. If this Pokemon is Poisoned, it is no longer Poisoned and cannot be Poisoned. Editor's note ToineLay has commented on this card's translation with regard to whether or not it would be possible to accelerate Impact Energy with Houndoom BST's Single Strike Roar ability. The answer is no. Although Impact Energy is a Single Strike Energy, it is not Single Strike Energy. Similarly, it is not possible to recover Impact Energy using Urn of Vitality BST."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case LUCKY_ENERGY_158:
        return specialEnergy (this, [[C]]) {
          text "This card provides 1 C Energy while attached to a Pokemon. If the Pokemon this card is attached to is your Active Pokemon and is damaged by an opponent's attack, draw 1 card."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case SPIRAL_ENERGY_159:
        return specialEnergy (this, [[C]]) {
          text "This card can only be attached to a Rapid Strike Pokemon. If this card is attached to anything other than a Rapid Strike Pokemon, discard this card. As long as this card is attached to a Pokemon, this card provides every type of Energy but provides only 1 Energy at a time. If this Pokemon is Paralyzed, it is no longer Paralyzed and cannot be Paralyzed."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
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
          move "Psychokinesis", {
            text "60+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokemon."
            energyCost PSYCHIC, PSYCHIC
            attackRequirement {}
            onAttack {

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
        return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Buzzap Generator", {
            text "Once during your turn (before your attack), if this Pokemon is in your Bench, you may Knock Out this Pokemon. If you do, search your deck for up to 2 [L] Energy and attach them to your [L] Pokemon in play in any way you like. Then, shuffle your deck."
            actionA {
            }
          }
          move "Electric Ball", {
            text "100 damage. "
            energyCost LIGHTNING, LIGHTNING, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case BRONZONG_223:
        return evolution (this, from:"Bronzor", hp:HP110, type:M, retreatCost:3) {
          weakness FIRE
          resistance GRASS, MINUS30
          bwAbility "Metal Trans", {
            text "As often as you like during your turn, you may move a [M] Energy from 1 of your Pokemon to another.1 of your Pokemon."
            actionA {
            }
          }
          move "Zen Headbutt", {
            text "70 damage. "
            energyCost METAL, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
        };
      case SNORLAX_224:
        return basic (this, hp:HP130, type:C, retreatCost:3) {
          weakness FIGHTING
          bwAbility "Gormandize", {
            text "Once during your turn, if this Pokemon is your Active Pokemon, you may draw cards until you have 7 cards in your hand. If you use this Ability, your turn ends."
            actionA {
            }
          }
          move "Body Slam", {
            text "100 damage. Flip a coin. If heads, your opponent's Active Pokemon is now Paralyzed."
            energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case ECHOING_HORN_225:
        return copy (ECHOING_HORN_136, this);
      case FAN_OF_WAVES_226:
        return itemCard (this) {
          text "Return a Special Energy attached to 1 of your opponent's Pokemon to the bottom of your opponent's deck. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case FOG_CRYSTAL_227:
        return copy (FOG_CRYSTAL_140, this);
      case RUGGED_HELMET_228:
        return copy (RUGGED_HELMET_152, this);
      case URN_OF_VITALITY_229:
        return itemCard (this) {
          text "Choose up to 2 Single Strike Energy cards from your discard pile, reveal them, and shuffle them into your deck. You may play any number of Item cards during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
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
