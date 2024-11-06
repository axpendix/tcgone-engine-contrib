package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.gm.PlayTrainer;

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
import org.apache.commons.text.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
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
 * @author lithogenn@gmail.com
 */
public enum VividVoltage implements LogicCardInfo {

  WEEDLE_1 ("Weedle", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KAKUNA_2 ("Kakuna", "2", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BEEDRILL_3 ("Beedrill", "3", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  EXEGGCUTE_4 ("Exeggcute", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  EXEGGUTOR_5 ("Exeggutor", "5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  YANMA_6 ("Yanma", "6", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  YANMEGA_7 ("Yanmega", "7", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PINECO_8 ("Pineco", "8", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CELEBI_9 ("Celebi", "9", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SEEDOT_10 ("Seedot", "10", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NUZLEAF_11 ("Nuzleaf", "11", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SHIFTRY_12 ("Shiftry", "12", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NINCADA_13 ("Nincada", "13", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NINJASK_14 ("Ninjask", "14", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SHAYMIN_15 ("Shaymin", "15", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  GENESECT_16 ("Genesect", "16", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SKIDDO_17 ("Skiddo", "17", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GOGOAT_18 ("Gogoat", "18", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DHELMISE_19 ("Dhelmise", "19", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ORBEETLE_V_20 ("Orbeetle V", "20", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  ORBEETLE_VMAX_21 ("Orbeetle VMAX", "21", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  ZARUDE_V_22 ("Zarude V", "22", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  CHARMANDER_23 ("Charmander", "23", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMELEON_24 ("Charmeleon", "24", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_25 ("Charizard", "25", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  FLAREON_26 ("Flareon", "26", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SLUGMA_27 ("Slugma", "27", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MAGCARGO_28 ("Magcargo", "28", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TALONFLAME_V_29 ("Talonflame V", "29", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VAPOREON_30 ("Vaporeon", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WAILMER_31 ("Wailmer", "31", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WAILORD_32 ("Wailord", "32", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  OSHAWOTT_33 ("Oshawott", "33", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DEWOTT_34 ("Dewott", "34", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SAMUROTT_35 ("Samurott", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  GALARIAN_DARMANITAN_V_36 ("Galarian Darmanitan V", "36", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GALARIAN_DARMANITAN_VMAX_37 ("Galarian Darmanitan VMAX", "37", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  CHEWTLE_38 ("Chewtle", "38", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DREDNAW_39 ("Drednaw", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRAMORANT_40 ("Cramorant", "40", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  ARROKUDA_41 ("Arrokuda", "41", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BARRASKEWDA_42 ("Barraskewda", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_V_43 ("Pikachu V", "43", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  PIKACHU_VMAX_44 ("Pikachu VMAX", "44", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  VOLTORB_45 ("Voltorb", "45", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_46 ("Electrode", "46", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTEON_47 ("Jolteon", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ZAPDOS_48 ("Zapdos", "48", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  AMPHAROS_V_49 ("Ampharos V", "49", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  RAIKOU_50 ("Raikou", "50", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRIKE_51 ("Electrike", "51", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MANECTRIC_52 ("Manectric", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  BLITZLE_53 ("Blitzle", "53", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ZEBSTRIKA_54 ("Zebstrika", "54", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTIK_55 ("Joltik", "55", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  GALVANTULA_56 ("Galvantula", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TYNAMO_57 ("Tynamo", "57", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  EELEKTRIK_58 ("Eelektrik", "58", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  EELEKTROSS_59 ("Eelektross", "59", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ZEKROM_60 ("Zekrom", "60", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ZERAORA_61 ("Zeraora", "61", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  PINCURCHIN_62 ("Pincurchin", "62", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CLEFAIRY_63 ("Clefairy", "63", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CLEFABLE_64 ("Clefable", "64", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GIRAFARIG_65 ("Girafarig", "65", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SHEDINJA_66 ("Shedinja", "66", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SHUPPET_67 ("Shuppet", "67", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BANETTE_68 ("Banette", "68", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DUSKULL_69 ("Duskull", "69", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DUSCLOPS_70 ("Dusclops", "70", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DUSKNOIR_71 ("Dusknoir", "71", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  CHIMECHO_72 ("Chimecho", "72", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOOBAT_73 ("Woobat", "73", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWOOBAT_74 ("Swoobat", "74", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  COTTONEE_75 ("Cottonee", "75", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WHIMSICOTT_76 ("Whimsicott", "76", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DEDENNE_77 ("Dedenne", "77", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  XERNEAS_78 ("Xerneas", "78", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  DIANCIE_79 ("Diancie", "79", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MILCERY_80 ("Milcery", "80", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ALCREMIE_81 ("Alcremie", "81", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ZACIAN_82 ("Zacian", "82", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  WOOPER_83 ("Wooper", "83", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  QUAGSIRE_84 ("Quagsire", "84", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SHUCKLE_85 ("Shuckle", "85", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PHANPY_86 ("Phanpy", "86", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DONPHAN_87 ("Donphan", "87", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HITMONTOP_88 ("Hitmontop", "88", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  REGIROCK_89 ("Regirock", "89", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  RIOLU_90 ("Riolu", "90", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DRILBUR_91 ("Drilbur", "91", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TERRAKION_92 ("Terrakion", "92", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  ZYGARDE_93 ("Zygarde", "93", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  ROCKRUFF_94 ("Rockruff", "94", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LYCANROC_95 ("Lycanroc", "95", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MUDBRAY_96 ("Mudbray", "96", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MUDSDALE_97 ("Mudsdale", "97", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  COALOSSAL_V_98 ("Coalossal V", "98", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  COALOSSAL_VMAX_99 ("Coalossal VMAX", "99", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  CLOBBOPUS_100 ("Clobbopus", "100", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_101 ("Grapploct", "101", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ZAMAZENTA_102 ("Zamazenta", "102", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  POOCHYENA_103 ("Poochyena", "103", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MIGHTYENA_104 ("Mightyena", "104", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SABLEYE_105 ("Sableye", "105", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  DRAPION_V_106 ("Drapion V", "106", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  SANDILE_107 ("Sandile", "107", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  KROKOROK_108 ("Krokorok", "108", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  KROOKODILE_109 ("Krookodile", "109", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  TRUBBISH_110 ("Trubbish", "110", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GARBODOR_111 ("Garbodor", "111", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MEOWTH_112 ("Galarian Meowth", "112", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_113 ("Galarian Perrserker", "113", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  FORRETRESS_114 ("Forretress", "114", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  STEELIX_V_115 ("Steelix V", "115", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  BELDUM_116 ("Beldum", "116", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  METANG_117 ("Metang", "117", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  METAGROSS_118 ("Metagross", "118", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  JIRACHI_119 ("Jirachi", "119", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  LUCARIO_120 ("Lucario", "120", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  DIALGA_121 ("Dialga", "121", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  EXCADRILL_122 ("Excadrill", "122", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  FERROSEED_123 ("Ferroseed", "123", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  FERROTHORN_124 ("Ferrothorn", "124", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GALARIAN_STUNFISK_125 ("Galarian Stunfisk", "125", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  AEGISLASH_V_126 ("Aegislash V", "126", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  AEGISLASH_VMAX_127 ("Aegislash VMAX", "127", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _METAL_]),
  MAGEARNA_128 ("Magearna", "128", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  DURALUDON_129 ("Duraludon", "129", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  EEVEE_130 ("Eevee", "130", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNORLAX_131 ("Snorlax", "131", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  LUGIA_132 ("Lugia", "132", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TAILLOW_133 ("Taillow", "133", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SWELLOW_134 ("Swellow", "134", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WHISMUR_135 ("Whismur", "135", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LOUDRED_136 ("Loudred", "136", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  EXPLOUD_137 ("Exploud", "137", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  RAYQUAZA_138 ("Rayquaza", "138", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CHATOT_139 ("Chatot", "139", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TOGEKISS_V_140 ("Togekiss V", "140", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  TOGEKISS_VMAX_141 ("Togekiss VMAX", "141", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  TORNADUS_142 ("Tornadus", "142", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  PIKIPEK_143 ("Pikipek", "143", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TRUMBEAK_144 ("Trumbeak", "144", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TOUCANNON_145 ("Toucannon", "145", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  ALLISTER_146 ("Allister", "146", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEA_147 ("Bea", "147", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEAUTY_148 ("Beauty", "148", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CARA_LISS_149 ("Cara Liss", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CIRCHESTER_BATH_150 ("Circhester Bath", "150", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DRONE_ROTOM_151 ("Drone Rotom", "151", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HERO_S_MEDAL_152 ("Hero's Medal", "152", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  LEAGUE_STAFF_153 ("League Staff", "153", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_154 ("Leon", "154", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  MEMORY_CAPSULE_155 ("Memory Capsule", "155", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  MOOMOO_CHEESE_156 ("Moomoo Cheese", "156", Rarity.UNCOMMON, [TRAINER, ITEM]),
  NESSA_157 ("Nessa", "157", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_158 ("Opal", "158", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ROCKY_HELMET_159 ("Rocky Helmet", "159", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  TELESCOPIC_SIGHT_160 ("Telescopic Sight", "160", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  WYNDON_STADIUM_161 ("Wyndon Stadium", "161", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  AROMATIC_G_ENERGY_162 ("Aromatic G Energy", "162", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  COATING_M_ENERGY_163 ("Coating M Energy", "163", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  STONE_F_ENERGY_164 ("Stone F Energy", "164", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  WASH_W_ENERGY_165 ("Wash W Energy", "165", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ORBEETLE_V_166 ("Orbeetle V", "166", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  ZARUDE_V_167 ("Zarude V", "167", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TALONFLAME_V_168 ("Talonflame V", "168", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  GALARIAN_DARMANITAN_V_169 ("Galarian Darmanitan V", "169", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  PIKACHU_V_170 ("Pikachu V", "170", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  AMPHAROS_V_171 ("Ampharos V", "171", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ALAKAZAM_V_172 ("Alakazam V", "172", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  COALOSSAL_V_173 ("Coalossal V", "173", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_V_174 ("Galarian Sirfetch'd V", "174", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  DRAPION_V_175 ("Drapion V", "175", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  STEELIX_V_176 ("Steelix V", "176", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  AEGISLASH_V_177 ("Aegislash V", "177", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  TOGEKISS_V_178 ("Togekiss V", "178", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  ALLISTER_179 ("Allister", "179", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEA_180 ("Bea", "180", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEAUTY_181 ("Beauty", "181", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_182 ("Leon", "182", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  NESSA_183 ("Nessa", "183", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_184 ("Opal", "184", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_CENTER_LADY_185 ("Pokémon Center Lady", "185", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ORBEETLE_VMAX_186 ("Orbeetle VMAX", "186", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  GALARIAN_DARMANITAN_VMAX_187 ("Galarian Darmanitan VMAX", "187", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  PIKACHU_VMAX_188 ("Pikachu VMAX", "188", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  COALOSSAL_VMAX_189 ("Coalossal VMAX", "189", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  AEGISLASH_VMAX_190 ("Aegislash VMAX", "190", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _METAL_]),
  TOGEKISS_VMAX_191 ("Togekiss VMAX", "191", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  ALLISTER_192 ("Allister", "192", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEA_193 ("Bea", "193", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEAUTY_194 ("Beauty", "194", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_195 ("Leon", "195", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  NESSA_196 ("Nessa", "196", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_197 ("Opal", "197", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GALARIAN_OBSTAGOON_198 ("Galarian Obstagoon", "198", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  ORANGURU_199 ("Oranguru", "199", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CAPE_OF_TOUGHNESS_200 ("Cape of Toughness", "200", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  HERO_S_MEDAL_201 ("Hero's Medal", "201", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  MEMORY_CAPSULE_202 ("Memory Capsule", "202", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  TELESCOPIC_SIGHT_203 ("Telescopic Sight", "203", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  VividVoltage(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.VIVID_VOLTAGE;
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
      return copy (LegendaryHeartbeat.WEEDLE_1, this);
      case KAKUNA_2:
      return copy (LegendaryHeartbeat.KAKUNA_2, this);
      case BEEDRILL_3:
      return copy (LegendaryHeartbeat.BEEDRILL_3, this);
      case EXEGGCUTE_4:
      return copy (LegendaryHeartbeat.EXEGGCUTE_4, this);
      case EXEGGUTOR_5:
      return copy (LegendaryHeartbeat.EXEGGUTOR_5, this);
      case YANMA_6:
      return copy (LegendaryHeartbeat.YANMA_6, this);
      case YANMEGA_7:
      return copy (LegendaryHeartbeat.YANMEGA_7, this);
      case PINECO_8:
      return copy (LegendaryHeartbeat.PINECO_8, this);
      case CELEBI_9:
      return copy (LegendaryHeartbeat.CELEBI_9, this);
      case SEEDOT_10:
      return copy (AmazingVoltTackle.SEEDOT_1, this);
      case NUZLEAF_11:
      return copy (AmazingVoltTackle.NUZLEAF_2, this);
      case SHIFTRY_12:
      return copy (AmazingVoltTackle.SHIFTRY_3, this);
      case NINCADA_13:
      return copy (AmazingVoltTackle.NINCADA_4, this);
      case NINJASK_14:
      return copy (AmazingVoltTackle.NINJASK_5, this);
      case SHAYMIN_15:
      return copy (LegendaryHeartbeat.SHAYMIN_10, this);
      case GENESECT_16:
      return copy (LegendaryHeartbeat.GENESECT_11, this);
      case SKIDDO_17:
      return copy (AmazingVoltTackle.SKIDDO_6, this);
      case GOGOAT_18:
      return copy (AmazingVoltTackle.GOGOAT_7, this);
      case DHELMISE_19:
      return copy (LegendaryHeartbeat.DHELMISE_12, this);
      case ORBEETLE_V_20:
      return copy (AmazingVoltTackle.ORBEETLE_V_8, this);
      case ORBEETLE_VMAX_21:
      return copy (AmazingVoltTackle.ORBEETLE_VMAX_9, this);
      case ZARUDE_V_22:
      return copy (LegendaryHeartbeat.ZARUDE_V_13, this);
      case CHARMANDER_23:
      return copy (AmazingVoltTackle.CHARMANDER_10, this);
      case CHARMELEON_24:
      return copy (AmazingVoltTackle.CHARMELEON_11, this);
      case CHARIZARD_25:
      return copy (AmazingVoltTackle.CHARIZARD_12, this);
      case FLAREON_26:
      return copy (AmazingVoltTackle.FLAREON_13, this);
      case SLUGMA_27:
      return copy (AmazingVoltTackle.SLUGMA_14, this);
      case MAGCARGO_28:
      return copy (AmazingVoltTackle.MAGCARGO_15, this);
      case TALONFLAME_V_29:
      return copy (AmazingVoltTackle.TALONFLAME_V_16, this);
      case VAPOREON_30:
      return copy (AmazingVoltTackle.VAPOREON_17, this);
      case WAILMER_31:
      return copy (AmazingVoltTackle.WAILMER_18, this);
      case WAILORD_32:
      return copy (AmazingVoltTackle.WAILORD_19, this);
      case OSHAWOTT_33:
      return copy (AmazingVoltTackle.OSHAWOTT_20, this);
      case DEWOTT_34:
      return copy (AmazingVoltTackle.DEWOTT_21, this);
      case SAMUROTT_35:
      return copy (AmazingVoltTackle.SAMUROTT_22, this);
      case GALARIAN_DARMANITAN_V_36:
      return copy (AmazingVoltTackle.GALARIAN_DARMANITAN_V_23, this);
      case GALARIAN_DARMANITAN_VMAX_37:
      return copy (AmazingVoltTackle.GALARIAN_DARMANITAN_VMAX_24, this);
      case CHEWTLE_38:
      return copy (AmazingVoltTackle.CHEWTLE_25, this);
      case DREDNAW_39:
      return copy (AmazingVoltTackle.DREDNAW_26, this);
      case CRAMORANT_40:
      return copy (AmazingVoltTackle.CRAMORANT_27, this);
      case ARROKUDA_41:
      return copy (AmazingVoltTackle.ARROKUDA_28, this);
      case BARRASKEWDA_42:
      return copy (AmazingVoltTackle.BARRASKEWDA_29, this);
      case PIKACHU_V_43:
      return copy (AmazingVoltTackle.PIKACHU_V_30, this);
      case PIKACHU_VMAX_44:
      return copy (AmazingVoltTackle.PIKACHU_VMAX_31, this);
      case VOLTORB_45:
      return copy (AmazingVoltTackle.VOLTORB_32, this);
      case ELECTRODE_46:
      return copy (AmazingVoltTackle.ELECTRODE_33, this);
      case JOLTEON_47:
      return copy (AmazingVoltTackle.JOLTEON_34, this);
      case ZAPDOS_48:
      return copy (AmazingVoltTackle.ZAPDOS_35, this);
      case AMPHAROS_V_49:
      return copy (LegendaryHeartbeat.AMPHAROS_V_14, this);
      case RAIKOU_50:
      return copy (LegendaryHeartbeat.RAIKOU_15, this);
      case ELECTRIKE_51:
      return copy (LegendaryHeartbeat.ELECTRIKE_16, this);
      case MANECTRIC_52:
      return copy (LegendaryHeartbeat.MANECTRIC_17, this);
      case BLITZLE_53:
      return copy (AmazingVoltTackle.BLITZLE_36, this);
      case ZEBSTRIKA_54:
      return copy (AmazingVoltTackle.ZEBSTRIKA_37, this);
      case JOLTIK_55:
      return copy (LegendaryHeartbeat.JOLTIK_18, this);
      case GALVANTULA_56:
      return copy (LegendaryHeartbeat.GALVANTULA_19, this);
      case TYNAMO_57:
      return copy (AmazingVoltTackle.TYNAMO_38, this);
      case EELEKTRIK_58:
      return copy (AmazingVoltTackle.EELEKTRIK_39, this);
      case EELEKTROSS_59:
      return copy (AmazingVoltTackle.EELEKTROSS_40, this);
      case ZEKROM_60:
      return copy (LegendaryHeartbeat.ZEKROM_20, this);
      case ZERAORA_61:
      return copy (LegendaryHeartbeat.ZERAORA_21, this);
      case PINCURCHIN_62:
      return copy (LegendaryHeartbeat.PINCURCHIN_22, this);
      case CLEFAIRY_63:
      return copy (LegendaryHeartbeat.CLEFAIRY_23, this);
      case CLEFABLE_64:
      return copy (LegendaryHeartbeat.CLEFABLE_24, this);
      case GIRAFARIG_65:
      return copy (LegendaryHeartbeat.GIRAFARIG_25, this);
      case SHEDINJA_66:
      return copy (AmazingVoltTackle.SHEDINJA_42, this);
      case SHUPPET_67:
      return copy (LegendaryHeartbeat.SHUPPET_26, this);
      case BANETTE_68:
      return copy (LegendaryHeartbeat.BANETTE_27, this);
      case DUSKULL_69:
      return copy (AmazingVoltTackle.DUSKULL_43, this);
      case DUSCLOPS_70:
      return copy (AmazingVoltTackle.DUSCLOPS_44, this);
      case DUSKNOIR_71:
      return copy (AmazingVoltTackle.DUSKNOIR_45, this);
      case CHIMECHO_72:
      return copy (AmazingVoltTackle.CHIMECHO_46, this);
      case WOOBAT_73:
      return copy (AmazingVoltTackle.WOOBAT_47, this);
      case SWOOBAT_74:
      return copy (AmazingVoltTackle.SWOOBAT_48, this);
      case COTTONEE_75:
      return copy (AmazingVoltTackle.COTTONEE_49, this);
      case WHIMSICOTT_76:
      return copy (AmazingVoltTackle.WHIMSICOTT_50, this);
      case DEDENNE_77:
      return copy (LegendaryHeartbeat.DEDENNE_28, this);
      case XERNEAS_78:
      return copy (LegendaryHeartbeat.XERNEAS_29, this);
      case DIANCIE_79:
      return copy (LegendaryHeartbeat.DIANCIE_30, this);
      case MILCERY_80:
      return copy (AmazingVoltTackle.MILCERY_51, this);
      case ALCREMIE_81:
      return copy (AmazingVoltTackle.ALCREMIE_52, this);
      case ZACIAN_82:
      return copy (LegendaryHeartbeat.ZACIAN_33, this);
      case WOOPER_83:
      return copy (LegendaryHeartbeat.WOOPER_34, this);
      case QUAGSIRE_84:
      return copy (LegendaryHeartbeat.QUAGSIRE_35, this);
      case SHUCKLE_85:
      return copy (LegendaryHeartbeat.SHUCKLE_36, this);
      case PHANPY_86:
      return copy (AmazingVoltTackle.PHANPY_56, this);
      case DONPHAN_87:
      return copy (AmazingVoltTackle.DONPHAN_57, this);
      case HITMONTOP_88:
      return copy (AmazingVoltTackle.HITMONTOP_58, this);
      case REGIROCK_89:
      return copy (LegendaryHeartbeat.REGIROCK_37, this);
      case RIOLU_90:
      return copy (LegendaryHeartbeat.RIOLU_38, this);
      case DRILBUR_91:
      return copy (AmazingVoltTackle.DRILBUR_59, this);
      case TERRAKION_92:
      return copy (AmazingVoltTackle.TERRAKION_60, this);
      case ZYGARDE_93:
      return copy (LegendaryHeartbeat.ZYGARDE_39, this);
      case ROCKRUFF_94:
      return copy (LegendaryHeartbeat.ROCKRUFF_40, this);
      case LYCANROC_95:
      return copy (LegendaryHeartbeat.LYCANROC_41, this);
      case MUDBRAY_96:
      return copy (AmazingVoltTackle.MUDBRAY_61, this);
      case MUDSDALE_97:
      return copy (AmazingVoltTackle.MUDSDALE_62, this);
      case COALOSSAL_V_98:
      return copy (LegendaryHeartbeat.COALOSSAL_V_42, this);
      case COALOSSAL_VMAX_99:
      return copy (LegendaryHeartbeat.COALOSSAL_VMAX_43, this);
      case CLOBBOPUS_100:
      return copy (AmazingVoltTackle.CLOBBOPUS_63, this);
      case GRAPPLOCT_101:
      return copy (AmazingVoltTackle.GRAPPLOCT_64, this);
      case ZAMAZENTA_102:
      return copy (LegendaryHeartbeat.ZAMAZENTA_44, this);
      case POOCHYENA_103:
      return copy (AmazingVoltTackle.POOCHYENA_66, this);
      case MIGHTYENA_104:
      return copy (AmazingVoltTackle.MIGHTYENA_67, this);
      case SABLEYE_105:
      return copy (AmazingVoltTackle.SABLEYE_68, this);
      case DRAPION_V_106:
      return copy (AmazingVoltTackle.DRAPION_V_69, this);
      case SANDILE_107:
      return copy (AmazingVoltTackle.SANDILE_70, this);
      case KROKOROK_108:
      return copy (AmazingVoltTackle.KROKOROK_71, this);
      case KROOKODILE_109:
      return copy (AmazingVoltTackle.KROOKODILE_72, this);
      case TRUBBISH_110:
      return copy (AmazingVoltTackle.TRUBBISH_73, this);
      case GARBODOR_111:
      return copy (AmazingVoltTackle.GARBODOR_74, this);
      case GALARIAN_MEOWTH_112:
      return copy (AmazingVoltTackle.GALARIAN_MEOWTH_75, this);
      case GALARIAN_PERRSERKER_113:
      return copy (AmazingVoltTackle.GALARIAN_PERRSERKER_76, this);
      case FORRETRESS_114:
      return copy (LegendaryHeartbeat.FORRETRESS_45, this);
      case STEELIX_V_115:
      return copy (LegendaryHeartbeat.STEELIX_V_46, this);
      case BELDUM_116:
      return copy (LegendaryHeartbeat.BELDUM_47, this);
      case METANG_117:
      return copy (LegendaryHeartbeat.METANG_48, this);
      case METAGROSS_118:
      return copy (LegendaryHeartbeat.METAGROSS_49, this);
      case JIRACHI_119:
      return copy (LegendaryHeartbeat.JIRACHI_50, this);
      case LUCARIO_120:
      return copy (LegendaryHeartbeat.LUCARIO_51, this);
      case DIALGA_121:
      return copy (LegendaryHeartbeat.DIALGA_52, this);
      case EXCADRILL_122:
      return copy (AmazingVoltTackle.EXCADRILL_77, this);
      case FERROSEED_123:
      return copy (AmazingVoltTackle.FERROSEED_78, this);
      case FERROTHORN_124:
      return copy (AmazingVoltTackle.FERROTHORN_79, this);
      case GALARIAN_STUNFISK_125:
      return copy (LegendaryHeartbeat.GALARIAN_STUNFISK_53, this);
      case AEGISLASH_V_126:
      return copy (AmazingVoltTackle.AEGISLASH_V_80, this);
      case AEGISLASH_VMAX_127:
      return copy (AmazingVoltTackle.AEGISLASH_VMAX_81, this);
      case MAGEARNA_128:
      return copy (LegendaryHeartbeat.MAGEARNA_54, this);
      case DURALUDON_129:
      return copy (AmazingVoltTackle.DURALUDON_82, this);
      case EEVEE_130:
      return copy (AmazingVoltTackle.EEVEE_83, this);
      case SNORLAX_131:
      return copy (AmazingVoltTackle.SNORLAX_84, this);
      case LUGIA_132:
      return copy (LegendaryHeartbeat.LUGIA_55, this);
      case TAILLOW_133:
      return copy (AmazingVoltTackle.TAILLOW_85, this);
      case SWELLOW_134:
      return copy (AmazingVoltTackle.SWELLOW_86, this);
      case WHISMUR_135:
      return copy (AmazingVoltTackle.WHISMUR_87, this);
      case LOUDRED_136:
      return copy (AmazingVoltTackle.LOUDRED_88, this);
      case EXPLOUD_137:
      return copy (AmazingVoltTackle.EXPLOUD_89, this);
      case RAYQUAZA_138:
      return copy (LegendaryHeartbeat.RAYQUAZA_56, this);
      case CHATOT_139:
      return copy (LegendaryHeartbeat.CHATOT_57, this);
      case TOGEKISS_V_140:
      return copy (LegendaryHeartbeat.TOGEKISS_V_58, this);
      case TOGEKISS_VMAX_141:
      return copy (LegendaryHeartbeat.TOGEKISS_VMAX_59, this);
      case TORNADUS_142:
      return copy (LegendaryHeartbeat.TORNADUS_60, this);
      case PIKIPEK_143:
      return copy (LegendaryHeartbeat.PIKIPEK_61, this);
      case TRUMBEAK_144:
      return copy (LegendaryHeartbeat.TRUMBEAK_62, this);
      case TOUCANNON_145:
      return copy (LegendaryHeartbeat.TOUCANNON_63, this);
      case ALLISTER_146:
      return copy (LegendaryHeartbeat.ALLISTER_71, this);
      case BEA_147:
      return copy (AmazingVoltTackle.BEA_93, this);
      case BEAUTY_148:
      return copy (LegendaryHeartbeat.BEAUTY_70, this);
      case CARA_LISS_149:
      return supporter (this) {
        text "Search your deck for up to 2 Rare Fossil cards and put them onto your Bench. Then" +
          "shuffle your deck."
        onPlay {
          def info = "Select up to 2 Rare Fossil cards to put on your bench."
          my.deck.search(max:2, info, {it.name == "Rare Fossil"}).each {fossil ->
            my.deck.remove(fossil)
            bg.em().run(new PlayTrainer(fossil))
          }
          shuffleDeck()
        }
        playRequirement {
          assert my.bench.notFull : "Bench is already full"
          assert my.deck : "Deck is empty"
        }
      };
      case CIRCHESTER_BATH_150:
      return copy (AmazingVoltTackle.HERO_S_BATH_97, this)
      case DRONE_ROTOM_151:
      return copy (AmazingVoltTackle.DRONE_ROTOM_90, this);
      case HERO_S_MEDAL_152:
      return copy (LegendaryHeartbeat.HERO_S_MEDAL_68, this);
      case LEAGUE_STAFF_153:
      return copy (AmazingVoltTackle.LEAGUE_STAFF_95, this);
      case LEON_154:
      return copy (AmazingVoltTackle.LEON_94, this);
      case MEMORY_CAPSULE_155:
      return copy (AmazingVoltTackle.MEMORY_CAPSULE_92, this);
      case MOOMOO_CHEESE_156:
      return copy (LegendaryHeartbeat.MOOMOO_CHEESE_67, this);
      case NESSA_157:
      return copy (AmazingVoltTackle.NESSA_96, this);
      case OPAL_158:
      return copy (LegendaryHeartbeat.OPAL_72, this);
      case ROCKY_HELMET_159:
      return copy (LegendaryHeartbeat.ROCKY_HELMET_69, this);
      case TELESCOPIC_SIGHT_160:
      return copy (AmazingVoltTackle.TELEPHOTO_SCOPE_91, this);
      case WYNDON_STADIUM_161:
      return copy (AmazingVoltTackle.WYNDON_STADIUM_98, this);
      case AROMATIC_G_ENERGY_162:
      return copy (LegendaryHeartbeat.AROMA_G_ENERGY_74, this);
      case COATING_M_ENERGY_163:
      return copy (AmazingVoltTackle.COATING_M_ENERGY_100, this);
      case STONE_F_ENERGY_164:
      return copy (LegendaryHeartbeat.STONE_F_ENERGY_75, this);
      case WASH_W_ENERGY_165:
      return copy (AmazingVoltTackle.WASH_W_ENERGY_99, this);
      case ORBEETLE_V_166:
      return copy (ORBEETLE_V_20, this);
      case ZARUDE_V_167:
      return copy (ZARUDE_V_22, this);
      case TALONFLAME_V_168:
      return copy (TALONFLAME_V_29, this);
      case GALARIAN_DARMANITAN_V_169:
      return copy (GALARIAN_DARMANITAN_V_36, this);
      case PIKACHU_V_170:
      return copy (PIKACHU_V_43, this);
      case AMPHAROS_V_171:
      return copy (AMPHAROS_V_49, this);
      case ALAKAZAM_V_172:
      return copy (AmazingVoltTackle.ALAKAZAM_V_41, this);
      case COALOSSAL_V_173:
      return copy (COALOSSAL_V_98, this);
      case GALARIAN_SIRFETCH_D_V_174:
      return copy (AmazingVoltTackle.GALARIAN_SIRFETCH_D_V_106, this);
      case DRAPION_V_175:
      return copy (DRAPION_V_106, this);
      case STEELIX_V_176:
      return copy (STEELIX_V_115, this);
      case AEGISLASH_V_177:
      return copy (AEGISLASH_V_126, this);
      case TOGEKISS_V_178:
      return copy (TOGEKISS_V_140, this);
      case ALLISTER_179:
      return copy (ALLISTER_146, this);
      case BEA_180:
      return copy (BEA_147, this);
      case BEAUTY_181:
      return copy (BEAUTY_148, this);
      case LEON_182:
      return copy (LEON_154, this);
      case NESSA_183:
      return copy (NESSA_157, this);
      case OPAL_184:
      return copy (OPAL_158, this);
      case POKEMON_CENTER_LADY_185:
      return copy (SwordShield.POKEMON_CENTER_LADY_176, this);
      case ORBEETLE_VMAX_186:
      return copy (ORBEETLE_VMAX_21, this);
      case GALARIAN_DARMANITAN_VMAX_187:
      return copy (GALARIAN_DARMANITAN_VMAX_37, this);
      case PIKACHU_VMAX_188:
      return copy (PIKACHU_VMAX_44, this);
      case COALOSSAL_VMAX_189:
      return copy (COALOSSAL_VMAX_99, this);
      case AEGISLASH_VMAX_190:
      return copy (AEGISLASH_VMAX_127, this);
      case TOGEKISS_VMAX_191:
      return copy (TOGEKISS_VMAX_141, this);
      case ALLISTER_192:
      return copy (ALLISTER_146, this);
      case BEA_193:
      return copy (BEA_147, this);
      case BEAUTY_194:
      return copy (BEAUTY_148, this);
      case LEON_195:
      return copy (LEON_154, this);
      case NESSA_196:
      return copy (NESSA_157, this);
      case OPAL_197:
      return copy (OPAL_158, this);
      case GALARIAN_OBSTAGOON_198:
      return copy (SwordShield.GALARIAN_OBSTAGOON_119, this);
      case ORANGURU_199:
      return copy (LegendaryHeartbeat.ORANGURU_92, this);
      case CAPE_OF_TOUGHNESS_200:
      return copy (DarknessAblaze.CAPE_OF_TOUGHNESS_160, this);
      case HERO_S_MEDAL_201:
      return copy (HERO_S_MEDAL_152, this);
      case MEMORY_CAPSULE_202:
      return copy (MEMORY_CAPSULE_155, this);
      case TELESCOPIC_SIGHT_203:
      return copy (TELESCOPIC_SIGHT_160, this);
      default:
      return null;
    }
  }
}
