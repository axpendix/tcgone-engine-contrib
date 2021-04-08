package tcgwars.logic.impl.gen8

import tcgwars.logic.impl.gen5.PlasmaStorm
import tcgwars.logic.impl.gen6.AncientOrigins
import tcgwars.logic.impl.gen7.GuardiansRising;

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
 * @author
 */
public enum BattleStyles implements LogicCardInfo {

  BELLSPROUT_1 ("Bellsprout", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WEEPINBELL_2 ("Weepinbell", "2", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  VICTREEBEL_3 ("Victreebel", "3", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _GRASS_]),
  CACNEA_4 ("Cacnea", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CACTURNE_5 ("Cacturne", "5", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  KRICKETUNE_V_6 ("Kricketune V", "6", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  CHERUBI_7 ("Cherubi", "7", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHERRIM_8 ("Cherrim", "8", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  CARNIVINE_9 ("Carnivine", "9", Rarity.UNCOMMON, [POKEMON, BASIC, RAPID_STRIKE, _GRASS_]),
  DURANT_10 ("Durant", "10", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SCATTERBUG_11 ("Scatterbug", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SPEWPA_12 ("Spewpa", "12", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  VIVILLON_13 ("Vivillon", "13", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _GRASS_]),
  FOMANTIS_14 ("Fomantis", "14", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LURANTIS_15 ("Lurantis", "15", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  TAPU_BULU_16 ("Tapu Bulu", "16", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  BLIPBUG_17 ("Blipbug", "17", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  FLAPPLE_V_18 ("Flapple V", "18", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  FLAPPLE_VMAX_19 ("Flapple VMAX", "19", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  ENTEI_20 ("Entei", "20", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VICTINI_V_21 ("Victini V", "21", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VICTINI_VMAX_22 ("Victini VMAX", "22", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  TEPIG_23 ("Tepig", "23", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIRE_]),
  PIGNITE_24 ("Pignite", "24", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _FIRE_]),
  EMBOAR_25 ("Emboar", "25", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, SINGLE_STRIKE, _FIRE_]),
  HEATMOR_26 ("Heatmor", "26", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  SALANDIT_27 ("Salandit", "27", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SALAZZLE_28 ("Salazzle", "28", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _FIRE_]),
  SIZZLIPEDE_29 ("Sizzlipede", "29", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CENTISKORCH_30 ("Centiskorch", "30", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _FIRE_]),
  HORSEA_31 ("Horsea", "31", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEADRA_32 ("Seadra", "32", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  KINGDRA_33 ("Kingdra", "33", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _WATER_]),
  GALARIAN_MR_MIME_34 ("Galarian Mr. Mime", "34", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_35 ("Galarian Mr. Rime", "35", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  REMORAID_36 ("Remoraid", "36", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _WATER_]),
  OCTILLERY_37 ("Octillery", "37", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _WATER_]),
  CORPHISH_38 ("Corphish", "38", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CRAWDAUNT_39 ("Crawdaunt", "39", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  EMPOLEON_V_40 ("Empoleon V", "40", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _WATER_]),
  FRILLISH_41 ("Frillish", "41", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  JELLICENT_42 ("Jellicent", "42", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _WATER_]),
  BRUXISH_43 ("Bruxish", "43", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  ELECTABUZZ_44 ("Electabuzz", "44", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTIVIRE_45 ("Electivire", "45", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  SHINX_46 ("Shinx", "46", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _LIGHTNING_]),
  LUXIO_47 ("Luxio", "47", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _LIGHTNING_]),
  LUXRAY_48 ("Luxray", "48", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, RAPID_STRIKE, _LIGHTNING_]),
  PACHIRISU_49 ("Pachirisu", "49", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TAPU_KOKO_V_50 ("Tapu Koko V", "50", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TAPU_KOKO_VMAX_51 ("Tapu Koko VMAX", "51", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  YAMPER_52 ("Yamper", "52", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  BOLTUND_53 ("Boltund", "53", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  GALARIAN_SLOWPOKE_54 ("Galarian Slowpoke", "54", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SPOINK_55 ("Spoink", "55", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GRUMPIG_56 ("Grumpig", "56", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  BALTOY_57 ("Baltoy", "57", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CLAYDOL_58 ("Claydol", "58", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  CHIMECHO_59 ("Chimecho", "59", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ESPURR_60 ("Espurr", "60", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MEOWSTIC_61 ("Meowstic", "61", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  MIMIKYU_V_62 ("Mimikyu V", "62", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  NECROZMA_V_63 ("Necrozma V", "63", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  DOTTLER_64 ("Dottler", "64", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _PSYCHIC_]),
  ORBEETLE_65 ("Orbeetle", "65", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _PSYCHIC_]),
  MANKEY_66 ("Mankey", "66", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _FIGHTING_]),
  PRIMEAPE_67 ("Primeape", "67", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _FIGHTING_]),
  ONIX_68 ("Onix", "68", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CUBONE_69 ("Cubone", "69", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAROWAK_70 ("Marowak", "70", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  GLIGAR_71 ("Gligar", "71", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLISCOR_72 ("Gliscor", "72", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  TIMBURR_73 ("Timburr", "73", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GURDURR_74 ("Gurdurr", "74", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  CONKELDURR_75 ("Conkeldurr", "75", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _FIGHTING_]),
  MIENFOO_76 ("Mienfoo", "76", Rarity.COMMON, [POKEMON, BASIC, RAPID_STRIKE, _FIGHTING_]),
  MIENSHAO_77 ("Mienshao", "77", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _FIGHTING_]),
  ROLYCOLY_78 ("Rolycoly", "78", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CARKOL_79 ("Carkol", "79", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  COALOSSAL_80 ("Coalossal", "80", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _FIGHTING_]),
  SILICOBRA_81 ("Silicobra", "81", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDACONDA_82 ("Sandaconda", "82", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _FIGHTING_]),
  FALINKS_83 ("Falinks", "83", Rarity.RARE, [POKEMON, BASIC, RAPID_STRIKE, _FIGHTING_]),
  STONJOURNER_84 ("Stonjourner", "84", Rarity.RARE, [POKEMON, BASIC, SINGLE_STRIKE, _FIGHTING_]),
  SINGLE_STRIKE_URSHIFU_V_85 ("Single Strike Urshifu V", "85", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _FIGHTING_]),
  SINGLE_STRIKE_URSHIFU_VMAX_86 ("Single Strike Urshifu VMAX", "86", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_V_87 ("Rapid Strike Urshifu V", "87", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_VMAX_88 ("Rapid Strike Urshifu VMAX", "88", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIGHTING_]),
  ZUBAT_89 ("Zubat", "89", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GOLBAT_90 ("Golbat", "90", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  CROBAT_91 ("Crobat", "91", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _DARKNESS_]),
  GALARIAN_SLOWBRO_92 ("Galarian Slowbro", "92", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  MURKROW_93 ("Murkrow", "93", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  HONCHKROW_94 ("Honchkrow", "94", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _DARKNESS_]),
  HOUNDOUR_95 ("Houndour", "95", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _DARKNESS_]),
  HOUNDOOM_96 ("Houndoom", "96", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _DARKNESS_]),
  TYRANITAR_V_97 ("Tyranitar V", "97", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  MORPEKO_98 ("Morpeko", "98", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  STEELIX_99 ("Steelix", "99", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _METAL_]),
  MAWILE_100 ("Mawile", "100", Rarity.COMMON, [POKEMON, BASIC, SINGLE_STRIKE, _METAL_]),
  BRONZOR_101 ("Bronzor", "101", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BRONZONG_102 ("Bronzong", "102", Rarity.HOLORARE, [POKEMON, STAGE1, EVOLUTION, _METAL_]),
  PAWNIARD_103 ("Pawniard", "103", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BISHARP_104 ("Bisharp", "104", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _METAL_]),
  HONEDGE_105 ("Honedge", "105", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  DOUBLADE_106 ("Doublade", "106", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _METAL_]),
  AEGISLASH_107 ("Aegislash", "107", Rarity.HOLORARE, [POKEMON, STAGE2, EVOLUTION, _METAL_]),
  AEGISLASH_108 ("Aegislash", "108", Rarity.RARE, [POKEMON, STAGE2, EVOLUTION, _METAL_]),
  CORVIKNIGHT_V_109 ("Corviknight V", "109", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  CORVIKNIGHT_VMAX_110 ("Corviknight VMAX", "110", Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  SPEAROW_111 ("Spearow", "111", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FEAROW_112 ("Fearow", "112", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  LICKITUNG_113 ("Lickitung", "113", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LICKILICKY_114 ("Lickilicky", "114", Rarity.RARE, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  GLAMEOW_115 ("Glameow", "115", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PURUGLY_116 ("Purugly", "116", Rarity.UNCOMMON, [POKEMON, STAGE1, EVOLUTION, _COLORLESS_]),
  STOUTLAND_V_117 ("Stoutland V", "117", Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  BOUFFALANT_118 ("Bouffalant", "118", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DRAMPA_119 ("Drampa", "119", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  INDEEDEE_120 ("Indeedee", "120", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  BRUNO_121 ("Bruno", "121", Rarity.UNCOMMON, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  CAMPING_GEAR_122 ("Camping Gear", "122", Rarity.UNCOMMON, [TRAINER, ITEM]),
  CHERYL_123 ("Cheryl", "123", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ENERGY_RECYCLER_124 ("Energy Recycler", "124", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ESCAPE_ROPE_125 ("Escape Rope", "125", Rarity.UNCOMMON, [TRAINER, ITEM]),
  EXP_SHARE_126 ("Exp. Share", "126", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FAN_OF_WAVES_127 ("Fan of Waves", "127", Rarity.UNCOMMON, [TRAINER, ITEM, RAPID_STRIKE]),
  KORRINA_S_FOCUS_128 ("Korrina's Focus", "128", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  LEVEL_BALL_129 ("Level Ball", "129", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PHOEBE_130 ("Phoebe", "130", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_SCROLL_OF_SWIRLS_131 ("Rapid Strike Scroll of Swirls", "131", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL, RAPID_STRIKE]),
  RAPID_STRIKE_STYLE_MUSTARD_132 ("Rapid Strike Style Mustard", "132", Rarity.UNCOMMON, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  SINGLE_STRIKE_SCROLL_OF_SCORN_133 ("Single Strike Scroll of Scorn", "133", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL, SINGLE_STRIKE]),
  SINGLE_STRIKE_STYLE_MUSTARD_134 ("Single Strike Style Mustard", "134", Rarity.UNCOMMON, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  SORDWARD_SHIELBERT_135 ("Sordward & Shielbert", "135", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TOOL_JAMMER_136 ("Tool Jammer", "136", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL, NOT_IMPLEMENTED]),
  TOWER_OF_DARKNESS_137 ("Tower of Darkness", "137", Rarity.UNCOMMON, [TRAINER, STADIUM, SINGLE_STRIKE]),
  TOWER_OF_WATERS_138 ("Tower of Waters", "138", Rarity.UNCOMMON, [TRAINER, STADIUM, RAPID_STRIKE]),
  URN_OF_VITALITY_139 ("Urn of Vitality", "139", Rarity.UNCOMMON, [TRAINER, ITEM, SINGLE_STRIKE]),
  RAPID_STRIKE_ENERGY_140 ("Rapid Strike Energy", "140", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY, RAPID_STRIKE]),
  SINGLE_STRIKE_ENERGY_141 ("Single Strike Energy", "141", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY, SINGLE_STRIKE]),
  KRICKETUNE_V_142 ("Kricketune V", "142", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  FLAPPLE_V_143 ("Flapple V", "143", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  VICTINI_V_144 ("Victini V", "144", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  EMPOLEON_V_145 ("Empoleon V", "145", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _WATER_]),
  EMPOLEON_V_146 ("Empoleon V", "146", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _WATER_]),
  TAPU_KOKO_V_147 ("Tapu Koko V", "147", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  MIMIKYU_V_148 ("Mimikyu V", "148", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  NECROZMA_V_149 ("Necrozma V", "149", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SINGLE_STRIKE_URSHIFU_V_150 ("Single Strike Urshifu V", "150", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _FIGHTING_]),
  SINGLE_STRIKE_URSHIFU_V_151 ("Single Strike Urshifu V", "151", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_V_152 ("Rapid Strike Urshifu V", "152", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_V_153 ("Rapid Strike Urshifu V", "153", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  TYRANITAR_V_154 ("Tyranitar V", "154", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  TYRANITAR_V_155 ("Tyranitar V", "155", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  CORVIKNIGHT_V_156 ("Corviknight V", "156", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  STOUTLAND_V_157 ("Stoutland V", "157", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  BRUNO_158 ("Bruno", "158", Rarity.ULTRARARE, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  CHERYL_159 ("Cheryl", "159", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  KORRINA_S_FOCUS_160 ("Korrina's Focus", "160", Rarity.ULTRARARE, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  PHOEBE_161 ("Phoebe", "161", Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_STYLE_MUSTARD_162 ("Rapid Strike Style Mustard", "162", Rarity.ULTRARARE, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  SINGLE_STRIKE_STYLE_MUSTARD_163 ("Single Strike Style Mustard", "163", Rarity.ULTRARARE, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  FLAPPLE_VMAX_164 ("Flapple VMAX", "164", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  VICTINI_VMAX_165 ("Victini VMAX", "165", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  TAPU_KOKO_VMAX_166 ("Tapu Koko VMAX", "166", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  SINGLE_STRIKE_URSHIFU_VMAX_167 ("Single Strike Urshifu VMAX", "167", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _FIGHTING_]),
  SINGLE_STRIKE_URSHIFU_VMAX_168 ("Single Strike Urshifu VMAX", "168", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, SINGLE_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_VMAX_169 ("Rapid Strike Urshifu VMAX", "169", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_VMAX_170 ("Rapid Strike Urshifu VMAX", "170", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, RAPID_STRIKE, _FIGHTING_]),
  CORVIKNIGHT_VMAX_171 ("Corviknight VMAX", "171", Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  BRUNO_172 ("Bruno", "172", Rarity.SECRET, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  CHERYL_173 ("Cheryl", "173", Rarity.SECRET, [TRAINER, SUPPORTER]),
  KORRINA_S_FOCUS_174 ("Korrina's Focus", "174", Rarity.SECRET, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  PHOEBE_175 ("Phoebe", "175", Rarity.SECRET, [TRAINER, SUPPORTER]),
  RAPID_STRIKE_STYLE_MUSTARD_176 ("Rapid Strike Style Mustard", "176", Rarity.SECRET, [TRAINER, SUPPORTER, RAPID_STRIKE]),
  SINGLE_STRIKE_STYLE_MUSTARD_177 ("Single Strike Style Mustard", "177", Rarity.SECRET, [TRAINER, SUPPORTER, SINGLE_STRIKE]),
  OCTILLERY_178 ("Octillery", "178", Rarity.SECRET, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _WATER_]),
  HOUNDOOM_179 ("Houndoom", "179", Rarity.SECRET, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _DARKNESS_]),
  EXP_SHARE_180 ("Exp. Share", "180", Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  LEVEL_BALL_181 ("Level Ball", "181", Rarity.SECRET, [TRAINER, ITEM]),
  RAPID_STRIKE_ENERGY_182 ("Rapid Strike Energy", "182", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY, RAPID_STRIKE]),
  SINGLE_STRIKE_ENERGY_183 ("Single Strike Energy", "183", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY, SINGLE_STRIKE]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  BattleStyles(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.BATTLE_STYLES;
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
      case BELLSPROUT_1:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness FIRE
        move "Venoshock", {
          text "10+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 40 more damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 10
            if (defending.isSPC(POISONED)) damage 40
          }
        }
      };
      case WEEPINBELL_2:
      return evolution (this, from:"Bellsprout", hp:HP080, type:G, retreatCost:2) {
        weakness FIRE
        bwAbility "Dangerous Mucus", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may make your opponent's Active Pokémon Burned and Poisoned."
          onActivate { r->
            if (r==PLAY_FROM_HAND && confirm("Make opponent's Active Pokémon Burned and Poisoned?")) {
              bc "Dangerous Mucus activates"
              apply BURNED, opp.active, SRC_ABILITY
              apply POISONED, opp.active, SRC_ABILITY
            }
          }
        }
        move "Vine Whip", {
          text "40 damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VICTREEBEL_3:
      return evolution (this, from:"Weepinbell", hp:HP150, type:G, retreatCost:3) {
        weakness FIRE
        move "Panic Vine", {
          text "40 damage. Your opponent's Active Pokémon is now Confused. During your opponent's next turn, that Pokémon can't retreat."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage {
              apply CONFUSED
              cantRetreat(defending)
            }
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
      case CACNEA_4:
      return basic (this, hp:HP070, type:G, retreatCost:2) {
        weakness FIRE
        move "Zzzt", {
          text "10 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Beat", {
          text "20 damage."
          energyCost GRASS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CACTURNE_5:
      return evolution (this, from:"Cacnea", hp:HP120, type:G, retreatCost:2) {
        weakness FIRE
        move "Pull", {
          text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
          energyCost COLORLESS
          attackRequirement {
            assertOppBench()
          }
          onAttack {
            switchYourOpponentsBenchedWithActive()
          }
        }
        move "Spiny Punch", {
          text "60+ damage. If this Pokémon has any [D] Energy attached, this attack does 70 more damage."
          energyCost GRASS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
            if (self.cards.energyCount(D)) damage 70
          }
        }
      };
      case KRICKETUNE_V_6:
      return basic (this, hp:HP180, type:G, retreatCost:1) {
        weakness FIRE
        bwAbility "Exciting Stage", {
          text "Once during your turn, you may draw cards until you have 3 cards in your hand. If this Pokémon is in the Active Spot, you may draw cards until you have 4 cards in your hand instead. You can't use more than 1 Exciting Stage Ability each turn."
          actionA {
            checkLastTurn()
            assert my.deck : "Deck is empty"
            def cardSize = 3
            if (self.active) {
              cardSize = 4
            }

            assert hand.size() < cardSize : "Requires a hand size of $cardSize or less to use"
            powerUsed()
            draw cardSize - hand.size()
          }
        }
        move "X-Scissor", {
          text "80+ damage. Flip a coin. If heads, this attack does 80 more damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 80
            flip { damage 80 }
          }
        }
      };
      case CHERUBI_7:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness FIRE
        move "Leafage", {
          text "10 damage."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHERRIM_8:
      return evolution (this, from:"Cherubi", hp:HP080, type:G, retreatCost:2) {
        weakness FIRE
        bwAbility "Spring Bloom", {
          text "As often as you like during your turn, you may attach a [G] Energy card from your hand to 1 of your Pokémon that doesn't have a Rule Box (Pokémon V, Pokémon-GX, etc. have Rule Boxes)."
          actionA {
            assert my.hand.filterByEnergyType(G) : "No [G] Energy in hand"
            def validTargets = my.all.findAll { !it.ruleBox }
            assert validTargets : "No valid targets"
            powerUsed()
            def selEnergy = my.hand.filterByBasicEnergyType(G).first()
            def pcs = validTargets.select("Attach to?")
            attachEnergy(pcs, selEnergy, PLAY_FROM_HAND)
          }
        }
        move "Seed Bomb", {
          text "70 damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case CARNIVINE_9:
      return basic (this, hp:HP110, type:G, retreatCost:2) {
        weakness FIRE
        move "Big Bite", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat(defending)
          }
        }
        move "Triple Whip", {
          text "60x damage. Flip 3 coins. This attack does 60 damage for each heads."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            flip 3, { damage 60 }
          }
        }
      };
      case DURANT_10:
      return basic (this, hp:HP090, type:G, retreatCost:1) {
        weakness FIRE
        move "Vise Grip", {
          text "20 damage."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Devour", {
          text "For each of your Durant in play, discard the top card of your opponent's deck."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            def count = my.all.count {it.name == "Durant" }
            (1..count).each {
              if (opp.deck.notEmpty) {
                discard(opp.deck.first())
              }
            }
          }
        }
      };
      case SCATTERBUG_11:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness FIRE
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            flip {
              damage 30
            }
          }
        }
      };
      case SPEWPA_12:
      return evolution (this, from:"Scatterbug", hp:HP080, type:G, retreatCost:3) {
        weakness FIRE
        move "Grass Cocooning", {
          text "Heal 40 damage from this Pokémon."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            heal 40, self
          }
        }
        move "Bug Bite", {
          text "40 damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VIVILLON_13:
      return evolution (this, from:"Spewpa", hp:HP120, type:G, retreatCost:1) {
        weakness FIRE
        move "Vital Powder", {
          text "Heal all damage from 2 of your Benched Pokémon."
          energyCost COLORLESS
          attackRequirement {
            assert my.bench.findAll { it.numberOfDamageCounters } : "None of your Benched is damaged"
          }
          onAttack {
            healAll my.bench.findAll {it.numberOfDamageCounters}.select("Fully heal")
            if (my.bench.findAll {it.numberOfDamageCounters}) {
              healAll my.bench.findAll {it.numberOfDamageCounters}.select("Fully heal")
            }
          }
        }
        move "Gust", {
          text "90 damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case FOMANTIS_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness FIRE
        move "Continuous Slash", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 20 }
          }
        }
      };
      case LURANTIS_15:
      return evolution (this, from:"Fomantis", hp:HP120, type:G, retreatCost:2) {
        weakness FIRE
        move "Leaf Drain", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 30
            healAfterDamage(30, self)
          }
        }
        move "Solar Cutter", {
          text "70 damage."
          energyCost GRASS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case TAPU_BULU_16:
      return basic (this, hp:HP130, type:G, retreatCost:2) {
        weakness FIRE
        move "Push Down", {
          text "20 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 20
            whirlwind()
          }
        }
        move "Nature's Judgment", {
          text "80+ damage. You may discard all Energy from this Pokémon. If you do, this attack does 80 more damage."
          energyCost GRASS, GRASS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 80
            if (confirm("Discard all Energy from $self to do 80 more damage?")) {
              damage 80
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }
        }
      };
      case BLIPBUG_17:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness FIRE
        move "Stampede", {
          text "10 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case FLAPPLE_V_18:
      return basic (this, hp:HP190, type:G, retreatCost:1) {
        weakness FIRE
        move "Sour Spit", {
          text "20 damage. During your opponent's next turn, the Defending Pokémon's attacks cost [C][C] more."
          energyCost GRASS
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage{
              defendingAttacksCostsMore (defending, [C, C])
            }
          }
        }
        move "Wing Attack", {
          text "120 damage."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case FLAPPLE_VMAX_19:
      return evolution (this, from:"Flapple V", hp:HP320, type:G, retreatCost:3) {
        weakness FIRE
        move "G-Max Rolling", {
          text "250- damage. This attack does 10 less damage for each damage counter on this Pokémon."
          energyCost GRASS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 250 - (10*self.numberOfDamageCounters)
          }
        }
      };
      case ENTEI_20:
      return basic (this, hp:HP130, type:R, retreatCost:2) {
        weakness WATER
        move "Heat Dash", {
          text "30 damage. You may attach a [R] Energy card from your hand to this Pokémon."
          energyCost FIRE
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type:R, may:true, my.hand, self)
            }
          }
        }
        move "Fire Fang", {
          text "90 damage. Your opponent's Active Pokémon is now Burned."
          energyCost FIRE, FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
            applyAfterDamage BURNED
          }
        }
      };
      case VICTINI_V_21:
      return basic (this, hp:HP190, type:R, retreatCost:1) {
        weakness WATER
        move "V Bullet", {
          text "10+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 50 more damage."
          energyCost FIRE
          attackRequirement {}
          onAttack {
            damage 10
            if (defending.pokemonV) {
              damage 50
            }
          }
        }
        move "Flare Shot", {
          text "120 damage. Discard all Energy from this Pokémon."
          energyCost FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
            afterDamage {
              discardAllSelfEnergy()
            }
          }
        }
      };
      case VICTINI_VMAX_22:
      return evolution (this, from:"Victini V", hp:HP310, type:R, retreatCost:2) {
        weakness WATER
        move "Spreading Flames", {
          text "Attach up to 3 [R] Energy cards from your discard pile to your Pokémon in any way you like."
          energyCost COLORLESS
          attackRequirement {
            assert discardPile.filterByEnergyType(R)
          }
          onAttack {
            discardPile.filterByEnergyType(R).select(count: 3).each { attachEnergy(my.all.select("Attach"), it) }
          }
        }
        move "Max Victory", {
          text "100+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 120 more damage."
          energyCost FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            if (defending.topPokemonCard.cardTypes.is(POKEMON_V)) {
              damage 120
            }
          }
        }
      };
      case TEPIG_23:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness WATER
        move "Ram", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Combustion", {
          text "50 damage."
          energyCost FIRE, FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PIGNITE_24:
      return evolution (this, from:"Tepig", hp:HP100, type:R, retreatCost:3) {
        weakness WATER
        move "Ram", {
          text "30 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Combustion", {
          text "90 damage."
          energyCost FIRE, FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case EMBOAR_25:
      return evolution (this, from:"Pignite", hp:HP180, type:R, retreatCost:4) {
        weakness WATER
        bwAbility "Fighting Fury Stance", {
          text "Your Single Strike Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == self.owner) {
                bg.dm().each {
                  if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner
                    && it.dmg.value && it.from.topPokemonCard.cardTypes.is(SINGLE_STRIKE)) {
                    bc "Fighting Fury Stance +30"
                    it.dmg += hp(30)
                  }
                }
              }
            }
          }
        }
        move "Heat Crash", {
          text "130 damage."
          energyCost FIRE, FIRE, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case HEATMOR_26:
      return basic (this, hp:HP120, type:R, retreatCost:2) {
        weakness WATER
        move "Flare", {
          text "20 damage."
          energyCost FIRE
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Burning Licks", {
          text "70 damage. Flip 2 coins. For each heads, discard an Energy from your opponent's Active Pokémon."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 70

            def count = 0
            flip 2, { count += 1 }
            afterDamage {
              count.times {
                discardDefendingEnergy()
              }
            }
          }
        }
      };
      case SALANDIT_27:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness WATER
        move "Call Sign", {
          text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost FIRE
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            my.deck.search(text, {
              it.cardTypes.is(POKEMON)
            }).each {
              deck.remove(it)
              hand.add(it)
              bc "Moved $it to hand"
            }
            shuffleDeck()
          }
        }
      };
      case SALAZZLE_28:
      return evolution (this, from:"Salandit", hp:HP090, type:R, retreatCost:1) {
        weakness WATER
        move "Perplex", {
          text "Your opponent's Active Pokémon is now Confused."
          energyCost FIRE
          attackRequirement {}
          onAttack {
            apply CONFUSED
          }
        }
        move "Derisive Roasting", {
          text "90x damage. This attack does 90 damage for each Special Condition affecting your opponent's Active Pokémon."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90 * defending.specialConditions.size()
          }
        }
      };
      case SIZZLIPEDE_29:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness WATER
        move "Searing Flame", {
          text "20 damage. Your opponent's Active Pokémon is now Burned."
          energyCost FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
            applyAfterDamage(BURNED)
          }
        }
      };
      case CENTISKORCH_30:
      return evolution (this, from:"Sizzlipede", hp:HP130, type:R, retreatCost:2) {
        weakness WATER
        bwAbility "Overheater", {
          text "Whenever your opponent flips a coin for their Burned Pokémon during Pokémon Checkup, it doesn't recover from that Special Condition even if the result is heads."
          def flag
          getterA COIN_FLIP_GETTER, { h->
            if (flag && h.effect.info == "Burned") {
              h.object = false
              flag = false
            }
          }
          delayedA {
            before BURNED_SPC, null, null, BEGIN_TURN, {
              if (ef.target.owner == self.owner.opposite) {
                flag = true
              }
            }
          }
        }
        move "Bursting Inferno", {
          text "130 damage. Your opponent's Active Pokémon is now Burned."
          energyCost FIRE, FIRE, FIRE, COLORLESS
          attackRequirement {}
          onAttack {
            damage 130
            applyAfterDamage(BURNED)
          }
        }
      };
      case HORSEA_31:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness LIGHTNING
        move "Smokescreen", {
          text "10 damage. During your opponent's next turn, if the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack doesn't happen."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 10
            sandAttack thisMove
          }
        }
      };
      case SEADRA_32:
      return evolution (this, from:"Horsea", hp:HP090, type:W, retreatCost:1) {
        weakness LIGHTNING
        move "Water Gun", {
          text "40 damage."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KINGDRA_33:
      return evolution (this, from:"Seadra", hp:HP150, type:W, retreatCost:1) {
        weakness LIGHTNING
        bwAbility "Deep Sea King", {
          text "When your Active Pokémon is Knocked Out by damage from an attack from your opponent's Pokémon, you may move any amount of [W] Energy from that Pokémon to this Pokémon."
          delayedA {
            before KNOCKOUT, {
              def energies = self.owner.pbg.active.cards.filterByEnergyType(W)
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite && !self.active && ef.pokemonToBeKnockedOut.owner == self.owner && ef.pokemonToBeKnockedOut.active && energies && confirm("Use $thisAbility?", self.owner)) {
                powerUsed()
                def energiesToMove = energies.select(max: energies.size(), playerType: self.owner, "Which Energies to move to Kingdra?")

                def pcsMap = [:]

                energiesToMove.each {
                  def pcs = it.findPCS()
                  if (pcsMap.containsKey(pcs)) (pcsMap[pcs] as CardList).add(it)
                  else pcsMap.put(pcs, new CardList(it))
                  energySwitch pcs, self, it, true
                }

                pcsMap.each { key, val ->
                  bc "$val moved from $key to $self"
                }
              }
            }
          }
        }
        move "Aqua Burst", {
          text "40x damage. This attack does 40 damage for each [W] Energy attached to this Pokémon."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 40 * self.cards.energyCount(W)
          }
        }
      };
      case GALARIAN_MR_MIME_34:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness METAL
        move "Pound", {
          text "10 damage."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Find It", {
          text "Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost COLORLESS, COLORLESS
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def chosenCard = my.deck.search { it.cardTypes.is ITEM }
            chosenCard.showToOpponent("Opponent's chosen Item card.").moveTo my.hand
            shuffleDeck()
          }
        }
      };
      case GALARIAN_MR_RIME_35:
      return evolution (this, from:"Galarian Mr Mime", hp:HP110, type:W, retreatCost:2) {
        weakness METAL
        move "Ball Juggling", {
          text "10+ damage. Discard any number of Item cards that have the word “Ball” in their name from your hand. This attack does 40 more damage for each card you discarded in this way."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 10

            def ballCards = my.hand.filterByType(ITEM).findAll { it.name.endsWith("Ball") }
            def selectedCards

            if (ballCards.size()) {
               selectedCards = ballCards.select(min:0, max:ballCards.size(), "Deal 40 more damage for each Ball card you choose to discard")
            }
            if (selectedCards) {
              selectedCards.each {
                damage 40
              }
            }
          }
        }
        move "Frost Smash", {
          text "80 damage."
          energyCost WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case REMORAID_36:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness LIGHTNING
        move "Water Gun", {
          text "10 damage."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sharp Fin", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case OCTILLERY_37:
      return evolution (this, from:"Remoraid", hp:HP110, type:W, retreatCost:2) {
        weakness LIGHTNING
        bwAbility "Rapid Strike Search", {
          text "Once during your turn, you may search your deck for a Rapid Strike card, reveal it, and put it into your hand. Then, shuffle your deck. You can't use more than 1 Rapid Strike Search Ability each turn."
          actionA {
            checkLastTurn()
            assert my.deck : "Your deck is empty"
            assert bg.em().retrieveObject("Rapid_Strike_Search") != bg.turnCount : "You can't use more than 1 $thisAbility Ability each turn."
            powerUsed()
            bg.em().storeObject("Rapid_Strike_Search", bg.turnCount)

            powerUsed()
            my.deck.search(count: 1, "Choose a Rapid Strike card", cardTypeFilter(RAPID_STRIKE)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Waterfall", {
          text "50 damage."
          energyCost WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CORPHISH_38:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness LIGHTNING
        move "Bubble Beam", {
          text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
            flipThenApplySC PARALYZED
          }
        }
      };
      case CRAWDAUNT_39:
      return evolution (this, from:"Corphish", hp:HP130, type:W, retreatCost:3) {
        weakness LIGHTNING
        move "Knock Off", {
          text "60 damage. Discard a random card from your opponent's hand."
          energyCost WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
            afterDamage {
              discardRandomCardFromOpponentsHand()
            }
          }
        }
        move "Crabhammer", {
          text "140 damage."
          energyCost WATER, WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case EMPOLEON_V_40:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness LIGHTNING
        bwAbility "Emperor's Eyes", {
          text "As long as this Pokémon is in the Active Spot, your opponent's Basic Pokémon in play have no Abilities, except for Pokémon with a Rule Box (Pokémon V, Pokémon-GX, etc. have Rule Boxes)."
          getterA IS_ABILITY_BLOCKED, { Holder h ->
            def tar = h.effect.target as PokemonCardSet
            if (self.active && h.effect.ability.name != thisAbility.name && h.effect.ability instanceof BwAbility
              && tar.owner != self.owner && tar.basic && !tar.ruleBox) {
              targeted(tar, SRC_ABILITY) {
                h.object = true
              }
            }
          }
          getterA IS_GLOBAL_ABILITY_BLOCKED, { Holder h ->
            def tar = h.effect.target as PokemonCardSet
            if (self.active && h.effect.ability instanceof BwAbility
              && tar.owner != self.owner && tar.basic && !tar.ruleBox) {
              targeted(tar, SRC_ABILITY) {
                h.object = true
              }
            }
          }
          onActivate {
            new CheckAbilities().run(bg)
          }
          onDeactivate {
            new CheckAbilities().run(bg)
          }
        }
        move "Swirling Slice", {
          text "130 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
          energyCost WATER, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage { moveEnergy(self, my.bench) }
          }
        }
      };
      case FRILLISH_41:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness LIGHTNING
        move "Recover", {
          text "Discard an Energy from this Pokémon and heal all damage from it."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            discardSelfEnergyInOrderTo(C)
            healAll self
          }
        }
        move "Rain Splash", {
          text "10 damage."
          energyCost WATER
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case JELLICENT_42:
      return evolution (this, from:"Frillish", hp:HP120, type:W, retreatCost:3) {
        weakness LIGHTNING
        move "Sediment Sink", {
          text "10x damage. This attack does 10 damage for each [W] Energy card in your discard pile."
          energyCost WATER, WATER
          attackRequirement {}
          onAttack {
            damage 10 * my.discard.filterByType(ENERGY).filterByEnergyType(W).size()
          }
        }
      };
      case BRUXISH_43:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness LIGHTNING
        move "Bite", {
          text "20 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Surf", {
          text "110 damage."
          energyCost WATER, WATER, COLORLESS
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case ELECTABUZZ_44:
      return basic (this, hp:HP080, type:L, retreatCost:2) {
        weakness FIGHTING
        move "Haymaker", {
          text "30 damage. During your next turn, this Pokémon can't use Haymaker."
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 30
            cantUseAttack(thisMove, self)
          }
        }
      };
      case ELECTIVIRE_45:
      return evolution (this, from:"Electabuzz", hp:HP140, type:L, retreatCost:3) {
        weakness FIGHTING
        move "Tumbling Attack", {
          text "60+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
            flip { damage 30 }
          }
        }
        move "Lightning Slam", {
          text "180 damage. During your next turn, this Pokémon can't use Lightning Slam."
          energyCost LIGHTNING, LIGHTNING, LIGHTNING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 180
            cantUseAttack(thisMove, self)
          }
        }
      };
      case SHINX_46:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Rear Kick", {
          text "20 damage."
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LUXIO_47:
      return evolution (this, from:"Shinx", hp:HP080, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Jumping Kick", {
          text "This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 30, opp.all.select(text)
          }
        }
        move "Head Bolt", {
          text "50 damage."
          energyCost LIGHTNING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LUXRAY_48:
      return evolution (this, from:"Luxio", hp:HP150, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Electrostep", {
          text "This attack does 40 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 40, opp.all.select(text)
            switchYourActive()
          }
        }
        move "Scar Strikes", {
          text "100+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 100 more damage."
          energyCost LIGHTNING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            if (defending.numberOfDamageCounters) damage 100
          }
        }
      };
      case PACHIRISU_49:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Find a Friend", {
          text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost COLORLESS
          attackRequirement {
            assert deck.notEmpty : "Deck is empty"
          }
          onAttack {
            my.deck.search(max: 1, cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Gnaw", {
          text "30 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TAPU_KOKO_V_50:
      return basic (this, hp:HP210, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Electro Ball", {
          text "40 damage."
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Spiral Thunder", {
          text "20+ damage. This attack does 40 more damage for each Energy attached to all of your opponent's Pokémon."
          energyCost LIGHTNING, LIGHTNING, COLORLESS
          attackRequirement {}
          onAttack {
            def addDmg = 0
            opp.all.each {
              addDmg += it.cards.energyCount(C)
            }
            damage 20 + 40 * addDmg
          }
        }
      };
      case TAPU_KOKO_VMAX_51:
      return evolution (this, from:"Tapu Koko V", hp:HP320, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Max Shock", {
          text "180 damage. If you have more Prize cards remaining than your opponent, their Active Pokémon is now Paralyzed."
          energyCost LIGHTNING, LIGHTNING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 180
            if (my.prizeCardSet.size() > opp.prizeCardSet.size()) {
              applyAfterDamage(PARALYZED)
            }
          }
        }
      };
      case YAMPER_52:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness FIGHTING
        bwAbility "Ball Search", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may put a Poké Ball card, a Great Ball card, or 1 of each from your discard pile into your hand."
          onActivate {
            if (it == PLAY_FROM_HAND && my.discard.findAll { it.name == "Poké Ball" || it.name == "Great Ball" } && confirm("Use Ball Search?")){
              powerUsed()
              if (my.discard.findAll { it.name == "Poké Ball" }) {
                my.discard.findAll { it.name == "Poké Ball" }.select("You may move a Poké Ball into your hand").moveTo(my.hand)
              }

              if (my.discard.findAll { it.name == "Great Ball" }) {
                my.discard.findAll { it.name == "Great Ball" }.select("You may move a Great Ball into your hand").moveTo(my.hand)
              }
            }
          }
        }
        move "Flop", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BOLTUND_53:
      return evolution (this, from:"Yamper", hp:HP130, type:L, retreatCost:1) {
        weakness FIGHTING
        move "Corner", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost LIGHTNING
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat(defending)
          }
        }
        move "Defiant Spark", {
          text "130 damage. If this Pokémon has any damage counters on it, this attack can be used for [L]."
          energyCost LIGHTNING
          attackRequirement {
            if (!self.numberOfDamageCounters)  {
              assert self.cards.energySufficient(L, L, C) : "Not enough Energy"
            }
          }
          onAttack {
            damage 130
          }
        }
      };
      case GALARIAN_SLOWPOKE_54:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Tantailizing", {
          text "Flip a coin. If heads, switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
          energyCost COLORLESS
          attackRequirement {
            assertOppBench()
          }
          onAttack {
            flip { switchYourOpponentsBenchedWithActive() }
          }
        }
      };
      case SPOINK_55:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Headbutt Bounce", {
          text "10 damage."
          energyCost PSYCHIC
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Power Gem", {
          text "30 damage."
          energyCost PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRUMPIG_56:
      return evolution (this, from:"Spoink", hp:HP130, type:P, retreatCost:3) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Dazzle Dance", {
          text "30 damage. Your opponent's Active Pokémon is now Confused."
          energyCost PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
            applyAfterDamage(CONFUSED)
          }
        }
        move "Power Gem", {
          text "120 damage."
          energyCost PSYCHIC, PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case BALTOY_57:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Self-Destruct", {
          text "60 damage. This Pokémon also does 60 damage to itself."
          energyCost PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
            damage 60, self
          }
        }
      };
      case CLAYDOL_58:
      return evolution (this, from:"Baltoy", hp:HP120, type:P, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Power Split", {
          text "Attach [P] Energy cards from your discard pile to your Pokémon in any way you like until your Pokémon and your opponent's Pokémon have the same total amount of Energy attached."
          energyCost COLORLESS
          attackRequirement {
            assert my.discard.filterByEnergyType(P)
          }
          onAttack {
            def numberOfEnergy = 0
            opp.all.each {
              numberOfEnergy += it.cards.energyCount(C)
            }
            my.discard.filterByEnergyType(P).select(max: numberOfEnergy).each {
              attachEnergy(my.all.select("Attach to"), it)
            }
          }
        }
        move "Psyshot", {
          text "100 damage."
          energyCost PSYCHIC, PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case CHIMECHO_59:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Minor Errand-Running", {
          text "Search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost COLORLESS
          attackRequirement {
            assert my.deck : "Your deck is empty."
          }
          onAttack {
            my.deck.search(max:2, text, cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Pleasant Tone", {
          text "20 damage. Your opponent's Active Pokémon is now Asleep."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
            applyAfterDamage(ASLEEP)
          }
        }
      };
      case ESPURR_60:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Focused Wish", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
      };
      case MEOWSTIC_61:
      return evolution (this, from:"Espurr", hp:HP090, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        bwAbility "Ear Moves", {
          text "Once during your turn, you may move 1 damage counter from 1 of your Pokémon to 1 of your opponent's Pokémon."
          actionA {
            checkLastTurn()
            assert opp.all.findAll { it.numberOfDamageCounters } : "Opponent's Pokémon have no damage"
            powerUsed()
            def pcs = opp.all.findAll { it.numberOfDamageCounters }.select("Choose the Pokémon to move the damage counter from")
            def tar = opp.all.findAll { it != pcs }.select("Select the Pokémon to recieve the damage counter")
            pcs.damage -= hp(10)
            directDamage 10, tar, SRC_ABILITY
            bc "Moved 1 damage counter from $pcs to $tar"
          }
        }
        move "Psychic Sphere", {
          text "50 damage."
          energyCost PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MIMIKYU_V_62:
      return basic (this, hp:HP160, type:P, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        bwAbility "Dummy Doll", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may prevent all damage done to this Mimikyu V by attacks from your opponent's Pokémon until the end of your opponent's next turn."
          onActivate { r->
            if (r == PLAY_FROM_HAND && self.benched && confirm('Use Dummy Doll?')) {
              powerUsed()

              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if (it.to == self) {
                      bc "Dummy Doll prevents damage to Mimikyu V"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }
        }
        move "Jealous Eyes", {
          text "Put 3 damage counters on your opponent's Active Pokémon for each Prize card your opponent has taken."
          energyCost PSYCHIC
          attackRequirement {}
          onAttack {
            directDamage 30 * opp.prizeCardSet.takenCount, defending
          }
        }
      };
      case NECROZMA_V_63:
      return basic (this, hp:HP220, type:P, retreatCost:3) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Prismatic Ray", {
          text "20 damage. This attack also does 20 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost PSYCHIC
          attackRequirement {}
          onAttack {
            damage 20
            multiDamage(opp.bench, 2, 20)
          }
        }
        move "Special Laser", {
          text "100+ damage. If this Pokémon has any Special Energy attached, this attack does 120 more damage."
          energyCost PSYCHIC, PSYCHIC, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            if (self.cards.filterByType(SPECIAL_ENERGY)) damage 120
          }
        }
      };
      case DOTTLER_64:
      return evolution (this, from:"Blipbug", hp:HP070, type:P, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Radar", {
          text "Look at the top 4 cards of your deck and put them back in any order."
          energyCost PSYCHIC
          attackRequirement {
            assert deck : "Deck is empty"
          }
          onAttack {
            def list = rearrange(deck.subList(0, 4), text)
            deck.setSubList(0, list)
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ORBEETLE_65:
      return evolution (this, from:"Dottler", hp:HP110, type:P, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS30
        move "Evomancy", {
          text "For each Energy attached to this Pokémon, search your deck for a Stage 2 Pokémon, except Orbeetle, and put it onto your Bench. Then, shuffle your deck."
          energyCost COLORLESS
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert bench.notFull : "Bench is full"
            assert self.cards.energyCount(C) : "No energies attached"
          }
          onAttack {
            int count = Math.min(self.cards.energyCount(C), bench.freeBenchCount)
            deck.search(max: count, text, {
              it.cardTypes.is(STAGE2) && it.name != "Orbeetle"
            }).each {
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Zen Headbutt", {
          text "120 damage."
          energyCost PSYCHIC, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case MANKEY_66:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness PSYCHIC
        move "Focus Fist", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            flip { damage 50 }
          }
        }
      };
      case PRIMEAPE_67:
      return evolution (this, from:"Mankey", hp:HP120, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Field Crush", {
          text "20 damage. If your opponent has a Stadium in play, discard it."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage {
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
        }
        move "Steamin' Mad Strike", {
          text "50x damage. This attack does 50 damage for each of your Benched Pokémon that has any damage counters on it."
          energyCost FIGHTING, FIGHTING
          attackRequirement {}
          onAttack {
            def count = my.bench.findAll { it.numberOfDamageCounters }.size()
            damage 50 * count
          }
        }
      };
      case ONIX_68:
      return basic (this, hp:HP110, type:F, retreatCost:4) {
        weakness GRASS
        move "Rock Throw", {
          text "60 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Rocky Tackle", {
          text "170 damage. This Pokémon also does 60 damage to itself."
          energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 170
            damage 60, self
          }
        }
      };
      case CUBONE_69:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness GRASS
        move "Beat", {
          text "10 damage."
          energyCost FIGHTING
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "30 damage."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MAROWAK_70:
      return evolution (this, from:"Cubone", hp:HP110, type:F, retreatCost:2) {
        weakness GRASS
        bwAbility "Battle Armor", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  bc "Battle Armor -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Bonemerang", {
          text "90x damage. Flip 2 coins. This attack does 90 damage for each heads."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            flip 2, { damage 90 }
          }
        }
      };
      case GLIGAR_71:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness GRASS
        move "Slash", {
          text "30 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GLISCOR_72:
      return evolution (this, from:"Gligar", hp:HP120, type:F, retreatCost:1) {
        weakness GRASS
        move "Acrobatics", {
          text "20+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
            flip 2, { damage 40 }
          }
        }
        move "Guillotine", {
          text "90 damage."
          energyCost FIGHTING, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TIMBURR_73:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Pound", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GURDURR_74:
      return evolution (this, from:"Timburr", hp:HP100, type:F, retreatCost:3) {
        weakness PSYCHIC
        move "Pound", {
          text "30 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hammer In", {
          text "60 damage."
          energyCost FIGHTING, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CONKELDURR_75:
      return evolution (this, from:"Gurdurr", hp:HP160, type:F, retreatCost:3) {
        weakness PSYCHIC
        move "Hammer Pressure", {
          text "90 damage. If the Defending Pokémon is an Evolution Pokémon, it can't attack during your opponent's next turn."
          energyCost FIGHTING, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
            if (defending.realEvolution) cantAttackNextTurn defending
          }
        }
        move "Mega Punch", {
          text "150 damage."
          energyCost FIGHTING, FIGHTING, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case MIENFOO_76:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness PSYCHIC
        move "Double Stab", {
          text "30x damage. Flip 2 coins. This attack does 30 damage for each heads."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            flip 2, { damage 30 }
          }
        }
      };
      case MIENSHAO_77:
      return evolution (this, from:"Mienfoo", hp:HP090, type:F, retreatCost:1) {
        weakness PSYCHIC
        move "Pound", {
          text "20 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spinning Whip", {
          text "90 damage. Your opponent's Active Pokémon is now Confused. Shuffle this Pokémon and all attached cards into your deck."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90

            afterDamage {
              apply CONFUSED
              self.cards.moveTo(my.deck)
              shuffleDeck()
              removePCS(self)
            }
          }
        }
      };
      case ROLYCOLY_78:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness GRASS
        move "Reckless Charge", {
          text "30 damage. This Pokémon also does 10 damage to itself."
          energyCost FIGHTING
          attackRequirement {}
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case CARKOL_79:
      return evolution (this, from:"Rolycoly", hp:HP100, type:F, retreatCost:3) {
        weakness GRASS
        move "Tackle", {
          text "50 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Wild Tackle", {
          text "100 damage. This Pokémon also does 10 damage to itself."
          energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            damage 10, self
          }
        }
      };
      case COALOSSAL_80:
      return evolution (this, from:"Carkol", hp:HP180, type:F, retreatCost:4) {
        weakness GRASS
        move "Coal Cannon", {
          text "90x damage. Flip a coin for each Energy attached to this Pokémon. This attack does 90 damage for each heads."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            flip self.cards.energyCount(C), { damage 90 }
          }
        }
        move "Wild Tackle", {
          text "200 damage. This Pokémon also does 50 damage to itself."
          energyCost FIGHTING, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 200
            damage 50, self
          }
        }
      };
      case SILICOBRA_81:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness GRASS
        move "Tail Whap", {
          text "10 damage."
          energyCost FIGHTING
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Shot", {
          text "60 damage."
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SANDACONDA_82:
      return evolution (this, from:"Silicobra", hp:HP130, type:F, retreatCost:3) {
        weakness GRASS
        move "Big Sand Cannon", {
          text "60x damage. Discard the top 6 cards of your deck. This attack does 60 damage for each [F] Energy card you discarded in this way."
          energyCost FIGHTING
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def top = my.deck.subList(0, 6)
            top.filterByType(ENERGY).each {
              if (it.asEnergyCard().containsType(F)) {
                damage 60
              }
            }
            top.discard()
          }
        }
        move "Skull Bash", {
          text "120 damage."
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case FALINKS_83:
      return basic (this, hp:HP110, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Rapid Strike Squad", {
          text "20x damage. This attack does 20 damage for each of your Rapid Strike Pokémon in play."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            my.all.each {
              if (it.topPokemonCard.cardTypes.is(RAPID_STRIKE)) damage 20
            }
          }
        }
      };
      case STONJOURNER_84:
      return basic (this, hp:HP130, type:F, retreatCost:3) {
        weakness GRASS
        move "Land's Pulse", {
          text "30+ damage. If a Stadium is in play, this attack does 30 more damage."
          energyCost FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
            if (bg.stadiumInfoStruct) {
              damage 30
            }
          }
        }
        move "Giga Hammer", {
          text "120 damage. During your next turn, this Pokémon can't use Giga Hammer."
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
            cantUseAttack(thisMove, self)
          }
        }
      };
      case SINGLE_STRIKE_URSHIFU_V_85:
      return basic (this, hp:HP220, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Laser Focus", {
          text "Search your deck for up to 2 [F] Energy cards and attach them to this Pokémon. Then, shuffle your deck."
          energyCost FIGHTING
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            attachEnergyFrom(basic: true, max: 2, type: F, my.deck, self)
            shuffleDeck()
          }
        }
        move "Impact Blow", {
          text "180 damage. During your next turn, this Pokémon can't use Impact Blow."
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 180
            cantUseAttack(thisMove, self)
          }
        }
      };
      case SINGLE_STRIKE_URSHIFU_VMAX_86:
      return evolution (this, from:"Single Strike Urshifu V", hp:HP330, type:F, retreatCost:3) {
        weakness PSYCHIC
        move "Beatdown", {
          text "100 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
        move "G-Max One Blow", {
          text "270 damage. Discard all Energy from this Pokémon. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
          energyCost FIGHTING, FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            shredDamage 270
            afterDamage {
              discardAllSelfEnergy(null)
            }
          }
        }
      };
      case RAPID_STRIKE_URSHIFU_V_87:
      return basic (this, hp:HP220, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Strafe", {
          text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost FIGHTING
          attackRequirement {}
          onAttack {
            damage 30
            switchYourActive(may: true)
          }
        }
        move "Hundred Furious Blows", {
          text "150 damage."
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case RAPID_STRIKE_URSHIFU_VMAX_88:
      return evolution (this, from:"Rapid Strike Urshifu V", hp:HP330, type:F, retreatCost:2) {
        weakness PSYCHIC
        move "Gale Thrust", {
          text "30+ damage. If this Pokémon moved from your Bench to the Active Spot this turn, this attack does 120 more damage."
          energyCost FIGHTING
          attackRequirement {}
          onAttack {
            damage 30
            if (wasSwitchedOutThisTurn(self)) {
              damage 120
            }
          }
        }
        move "G-Max Rapid Flow", {
          text "Discard all Energy from this Pokémon. This attack does 120 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost FIGHTING, FIGHTING, COLORLESS
          attackRequirement {}
          onAttack {
            multiDamage(opp.all, 2, 120)
            afterDamage {
              discardAllSelfEnergy(null)
            }
          }
        }
      };
      case ZUBAT_89:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness FIGHTING
        move "Hide in Shadows", {
          text "Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            switchYourActive()
          }
        }
        move "Speed Dive", {
          text "20 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLBAT_90:
      return evolution (this, from:"Zubat", hp:HP080, type:D, retreatCost:1) {
        weakness FIGHTING
        bwAbility "Discreet Draw", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may draw 2 cards."
          onActivate { r->
            if (r==PLAY_FROM_HAND && confirm('Use Discreet Draw?')) {
              powerUsed()
              draw 2
            }
          }
        }
        move "Air Slash", {
          text "50 damage. Discard an Energy from this Pokémon."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
            discardSelfEnergyAfterDamage(C)
          }
        }
      };
      case CROBAT_91:
      return evolution (this, from:"Golbat", hp:HP130, type:D, retreatCost:0) {
        weakness FIGHTING
        bwAbility "Drastic Draw", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may draw 3 cards."
          onActivate { r->
            if (r==PLAY_FROM_HAND && confirm('Use Drastic Draw?')) {
              powerUsed()
              draw 3
            }
          }
        }
        move "Wing Attack", {
          text "100 damage."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case GALARIAN_SLOWBRO_92:
      return evolution (this, from:"GalarianSlowpoke", hp:HP130, type:D, retreatCost:3) {
        weakness FIGHTING
        move "Splattering Poison", {
          text "Both Active Pokémon are now Poisoned."
          energyCost DARKNESS
          attackRequirement {}
          onAttack {
            apply POISONED, my.active
            apply POISONED, opp.active
          }
        }
        move "Unhinged Hammer", {
          text "100+ damage. If this Pokémon is affected by a Special Condition, this attack does 120 more damage."
          energyCost DARKNESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            if (self.specialConditions) damage 120
          }
        }
      };
      case MURKROW_93:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS30
        move "Scout", {
          text "Your opponent reveals their hand."
          energyCost COLORLESS
          attackRequirement {
            assert opp.hand : "Your opponent has no cards in hand"
          }
          onAttack {
            if (opp.hand) opp.hand.shuffledCopy().showToMe("Opponent's hand")
          }
        }
        move "Peck", {
          text "20 damage."
          energyCost DARKNESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HONCHKROW_94:
      return evolution (this, from:"Murkrow", hp:HP130, type:D, retreatCost:2) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS30
        bwAbility "Insomnia", {
          text "This Pokémon can't be Asleep."
          delayedA {
            before APPLY_SPECIAL_CONDITION, self, {
              if (ef.type == ASLEEP) {
                bc "Insomnia prevents $self from being Asleep."
                prevent()
              }
            }
          }
          onActivate {
            clearSpecialCondition(self, SRC_ABILITY, [ASLEEP])
          }
        }
        move "Voltage Dive", {
          text "80+ damage. If your opponent's Active Pokémon has any Special Energy attached, this attack does 80 more damage."
          energyCost DARKNESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 80
            if (defending.cards.filterByType(SPECIAL_ENERGY)) damage 80
          }
        }
      };
      case HOUNDOUR_95:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness GRASS
        move "Bite", {
          text "20 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOUNDOOM_96:
      return evolution (this, from:"Houndour", hp:HP130, type:D, retreatCost:2) {
        weakness GRASS
        bwAbility "Single Strike Roar", {
          text "Once during your turn, you may search your deck for a Single Strike Energy card and attach it to 1 of your Single Strike Pokémon. Then, shuffle your deck. If you attached Energy to a Pokémon in this way, put 2 damage counters on that Pokémon."
          actionA {
            checkLastTurn()
            assert my.deck : "Deck is empty"
            assert my.all.findAll { it.topPokemonCard.cardTypes.is(SINGLE_STRIKE) } : "No Single Strike Pokémon to attach an Energy card to"
            powerUsed()
            def card = my.deck.search(count: 1, "Search for a Single Strike Energy Card to attach to one of your Single Strike Pokémon", {
              it.cardTypes.is(SPECIAL_ENERGY) && it.cardTypes.is(SINGLE_STRIKE)
            }).first()
            shuffleDeck()
            if (card) {
              def tar = my.all.findAll{ it.topPokemonCard.cardTypes.is(SINGLE_STRIKE) }.select("Attach an Energy to?")
              attachEnergy(tar, card)
              directDamage 20, tar, SRC_ABILITY
            }
          }
        }
        move "Darkness Fang", {
          text "50 damage."
          energyCost DARKNESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TYRANITAR_V_97:
      return basic (this, hp:HP230, type:D, retreatCost:3) {
        weakness GRASS
        move "Cragalanche", {
          text "60 damage. Discard the top 2 cards of your opponent's deck."
          energyCost DARKNESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 60
            afterDamage {
              opp.deck.subList(0, 2).discard()
            }
          }
        }
        move "Single Strike Crush", {
          text "240 damage. Discard the top 4 cards of your deck."
          energyCost DARKNESS, DARKNESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 240
            afterDamage {
              my.deck.subList(0, 4).discard()
            }
          }
        }
      };
      case MORPEKO_98:
      return basic (this, hp:HP080, type:D, retreatCost:1) {
        weakness GRASS
        move "Gather Food", {
          text "Put an Item card from your discard pile into your hand."
          energyCost COLORLESS
          attackRequirement {
            assert my.discard.filterByType(ITEM) : "No Item cards in discard pile"
          }
          onAttack {
            my.discard.filterByType(ITEM).select(text).moveTo(my.hand)
          }
        }
        move "Hangry Tackle", {
          text "20+ damage. If you have no cards in your hand, this attack does 90 more damage."
          energyCost DARKNESS
          attackRequirement {}
          onAttack {
            damage 20
            if (my.hand.size() == 0) {
              damage 90
            }
          }
        }
      };
      case STEELIX_99:
      return evolution (this, from:"Onix", hp:HP190, type:M, retreatCost:4) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Steel Swing", {
          text "80x damage. Flip 2 coins. This attack does 80 damage for each heads."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            flip 2, { damage 80 }
          }
        }
        move "Heavy Impact", {
          text "200 damage."
          energyCost METAL, METAL, METAL, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case MAWILE_100:
      return basic (this, hp:HP090, type:M, retreatCost:1) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Powerful Vise", {
          text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost METAL
          attackRequirement {}
          onAttack {
            damage 20
            flipThenApplySC(PARALYZED)
          }
        }
        move "Piercing Strike", {
          text "100 damage. This attack's damage isn't affected by Weakness or Resistance, or by any effects on your opponent's Active Pokémon."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            swiftDamage(100, defending)
          }
        }
      };
      case BRONZOR_101:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Ram", {
          text "30 damage."
          energyCost METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BRONZONG_102:
      return evolution (this, from:"Bronzor", hp:HP110, type:M, retreatCost:3) {
        weakness FIRE
        resistance GRASS, MINUS30
        bwAbility "Metal Transfer", {
          text "As often as you like during your turn, you may move a [M] Energy from 1 of your Pokémon to another of your Pokémon."
          actionA {
            assert my.all.findAll { it.cards.energyCount(M) > 0 } : "No valid Energy cards to move"
            assert my.all.size() >= 2 : "Need at least 2 Pokémon to use"
            powerUsed()
            def src = my.all.findAll { it.cards.energyCount(M) > 0 }.select("Source for [M]")
            def card = src.cards.select("Energy to move", {
              it.cardTypes.is(ENERGY) && it.asEnergyCard().containsType(M)
            }).first()
            def tar = my.all
            tar.remove(src)
            tar = tar.select("Target for [M]")
            energySwitch(src, tar, card)
          }
        }
        move "Zen Headbutt", {
          text "70 damage."
          energyCost METAL, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case PAWNIARD_103:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Swords Dance", {
          text "During your next turn, this Pokémon's Slash attack does 70 more damage (before applying Weakness and Resistance)."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            increasedBaseDamageNextTurn("Slash", hp(70))
          }
        }
        move "Slash", {
          text "10 damage."
          energyCost METAL
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BISHARP_104:
      return evolution (this, from:"Pawniard", hp:HP110, type:M, retreatCost:1) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Slash", {
          text "30 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Steel Slice", {
          text "90+ damage. If your opponent's Active Pokémon is a [M] Pokémon, this attack does 90 more damage."
          energyCost METAL, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 90
            if (defending.types.contains(M)) damage 90
          }
        }
      };
      case HONEDGE_105:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Ambush", {
          text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost METAL
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 30 }
          }
        }
      };
      case DOUBLADE_106:
      return evolution (this, from:"Honedge", hp:HP080, type:M, retreatCost:2) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Cut Down", {
          text "40 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 40
            flip { discardDefendingEnergyAfterDamage() }
          }
        }
      };
      case AEGISLASH_107:
      return evolution (this, from:"Doublade", hp:HP150, type:M, retreatCost:3) {
        weakness FIRE
        resistance GRASS, MINUS30
        bwAbility "Stance Change", {
          text "Once during your turn (before your attack), you may switch this Pokémon with an Aegislash in your hand. (Any cards attached to this Pokémon, damage counters, Special Conditions, turns in play, and any other effects remain on the new Pokémon.)"
          actionA {
            checkLastTurn()
            assert !bg.em().retrieveObject("ScoopUpBlock_Count$self.owner.opposite") || !self.numberOfDamageCounters : "Scoop-Up Block prevents $thisAbility's effect"
            assert bg.em().retrieveObject("Stance_Change_" + self.hashCode()) != (bg.turnCount) : "Already used Stance Change"
            assert my.hand.filterByNameEquals("Aegislash") : "No Aegislash in hand"

            bg.em().storeObject("Stance_Change_" + self.hashCode(), bg.turnCount)
            powerUsed()

            def card = my.hand.filterByNameEquals("Aegislash").select("Stance Change").first()
            def pcs = self
            def top = pcs.topPokemonCard
            pcs.cards.remove(top)
            my.hand.add(top)
            my.hand.remove(card)
            pcs.cards.add(card)

            bc "Switched with $card"
            bg.em().run new CheckAbilities(OTHER, new PcsList(self))
            checkFaint()
          }
        }
        move "Full Metal Blade", {
          text "210 damage. Discard 2 [M] Energy from this Pokémon."
          energyCost METAL, METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 210
            discardSelfEnergyAfterDamage(M, M)
          }
        }
      };
      case AEGISLASH_108:
      return evolution (this, from:"Doublade", hp:HP150, type:M, retreatCost:3) {
        weakness FIRE
        resistance GRASS, MINUS30
        bwAbility "Stance Change", {
          text "Once during your turn (before your attack), you may switch this Pokémon with an Aegislash in your hand. (Any cards attached to this Pokémon, damage counters, Special Conditions, turns in play, and any other effects remain on the new Pokémon.)"
          actionA {
            checkLastTurn()
            assert !bg.em().retrieveObject("ScoopUpBlock_Count$self.owner.opposite") || !self.numberOfDamageCounters : "Scoop-Up Block prevents $thisAbility's effect"
            assert bg.em().retrieveObject("Stance_Change_" + self.hashCode()) != (bg.turnCount) : "Already used Stance Change"
            assert my.hand.filterByNameEquals("Aegislash") : "No Aegislash in hand"

            bg.em().storeObject("Stance_Change_" + self.hashCode(), bg.turnCount)
            powerUsed()

            def card = my.hand.filterByNameEquals("Aegislash").select("Stance Change").first()
            def pcs = self
            def top = pcs.topPokemonCard
            pcs.cards.remove(top)
            my.hand.add(top)
            my.hand.remove(card)
            pcs.cards.add(card)

            bc "Switched with $card"
            bg.em().run new CheckAbilities(OTHER, new PcsList(self))
            checkFaint()
          }
        }
        move "Gigaton Bash", {
          text "70 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Pokémon VMAX."
          energyCost METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 70
            preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.pokemonVMAX }
          }
        }
      };
      case CORVIKNIGHT_V_109:
      return basic (this, hp:HP210, type:M, retreatCost:1) {
        weakness FIRE
        resistance GRASS, MINUS30
        move "Clutch", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost METAL
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat(defending)
          }
        }
        move "Sky Hurricane", {
          text "190 damage. During your next turn, this Pokémon can't use Sky Hurricane."
          energyCost METAL, METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 190
            cantUseAttack(thisMove, self)
          }
        }
      };
      case CORVIKNIGHT_VMAX_110:
      return evolution (this, from:"Corviknight V", hp:HP320, type:M, retreatCost:0) {
        weakness FIRE
        resistance GRASS, MINUS30
        bwAbility "Lustrous Body", {
          text "Prevent all effects of your opponent's Pokémon's Abilities done to this Pokémon."
          // Unsure of how this will work if Ability effects are chained
          def fromSelf = false
          delayedA {
            before BW_ABILITY, {
              fromSelf = ef.self.owner == self.owner
            }
            before null, self, SRC_ABILITY, {
              if (fromSelf) {
                fromSelf = false
                return
              }
              bc "$thisAbility prevents effect"
              prevent()
            }
            after BW_ABILITY, {
              fromSelf = false
            }
          }
        }
        move "G-Max Hurricane", {
          text "240 damage. During your next turn, this Pokémon can't use G-Max Hurricane."
          energyCost METAL, METAL, COLORLESS
          attackRequirement {}
          onAttack {
            damage 240
            cantUseAttack(thisMove, self)
          }
        }
      };
      case SPEAROW_111:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS30
        move "Peck", {
          text "20 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FEAROW_112:
      return evolution (this, from:"Spearow", hp:HP090, type:C, retreatCost:0) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS30
        move "Drill Peck", {
          text "70 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case LICKITUNG_113:
      return basic (this, hp:HP110, type:C, retreatCost:4) {
        weakness FIGHTING
        move "Tongue Slap", {
          text "50 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Hammer In", {
          text "80 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case LICKILICKY_114:
      return evolution (this, from:"Lickitung", hp:HP140, type:C, retreatCost:4) {
        weakness FIGHTING
        move "Selickt", {
          text "Your opponent chooses to discard the top 3 cards of their deck or to discard 3 cards from their hand."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            def choice = oppChoose([0, 1], ["Top cards of your deck", "Cards from your hand"], "Discard 3 cards from which source?")

            if (choice == 0) {
              opp.deck.subList(0, 3).discard()
            } else if (opp.hand.size() <= 3) {
              opp.hand.discard()
            } else {
              opp.hand.oppSelect(count: 3, "Discard 3 cards from your hand").discard()
            }
          }
        }
        move "Pitch", {
          text "100 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 100
            afterDamage {
              whirlwind()
            }
          }
        }
      };
      case GLAMEOW_115:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness FIGHTING
        move "Cat Kick", {
          text "10 damage."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Claw Slash", {
          text "40 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PURUGLY_116:
      return evolution (this, from:"Glameow", hp:HP120, type:C, retreatCost:3) {
        weakness FIGHTING
        move "Caturday", {
          text "Draw 3 cards. If you do, this Pokémon is now Asleep."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            def currentHandSize = my.hand.size()
            draw 3
            if (my.hand.size() > currentHandSize) {
              apply ASLEEP, self
            }
          }
        }
        move "Claw Slash", {
          text "120 damage."
          energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case STOUTLAND_V_117:
      return basic (this, hp:HP210, type:C, retreatCost:3) {
        weakness FIGHTING
        move "Double Dip Fangs", {
          text "40 damage. If your opponent's Basic Pokémon is Knocked Out by damage from this attack, take 1 more Prize card."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            def pcs = defending
            delayed {
              def eff2
              register {
                eff2 = getter GET_GIVEN_PRIZES, BEFORE_LAST, pcs, { Holder holder ->
                  if (holder.object > 0 && pcs.KOBYDMG == bg.turnCount && defending.topPokemonCard.cardTypes.is(BASIC)) {
                    bc "Double Dip Fangs gives the player an additional prize"
                    holder.object += 1
                  }
                }
              }
              unregister {
                eff2.unregister()
              }
              after KNOCKOUT, pcs, {
                unregister()
              }
              unregisterAfter 1
            }
            damage 40
          }
        }
        move "Wild Tackle", {
          text "200 damage. This Pokémon also does 30 damage to itself."
          energyCost COLORLESS, COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 200
            damage 30, self
          }
        }
      };
      case BOUFFALANT_118:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness FIGHTING
        bwAbility "Sap Sipper", {
          text "This Pokémon's attacks do 60 more damage to your opponent's [G] Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if(it.from == self && it.to.owner == self.owner.opposite && it.to.types.contains(G) && it.dmg.value) {
                  bc "Sap Sipper +60"
                  it.dmg += hp(60)
                }
              }
            }
          }
        }
        move "Head Charge", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost COLORLESS, COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 120
            damage 30, self
          }
        }
      };
      case DRAMPA_119:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness FIGHTING
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost COLORLESS
          callForFamily(basic: true, 2, delegate)
        }
        move "Spiral Rush", {
          text "30+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 30
            flipUntilTails { damage 30 }
          }
        }
      };
      case INDEEDEE_120:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness FIGHTING
        move "Collect", {
          text "Draw 2 cards."
          energyCost COLORLESS
          attackRequirement {}
          onAttack {
            draw 2
          }
        }
        move "Hand Kinesis", {
          text "10x damage. This attack does 10 damage for each card in your hand."
          energyCost COLORLESS, COLORLESS
          attackRequirement {}
          onAttack {
            damage 10 * my.hand.size()
          }
        }
      };
      case BRUNO_121:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, draw 4 cards. If any of your Pokémon were Knocked Out during your opponent's last turn, draw 7 cards instead."
        globalAbility { Card thisCard->
          delayed {
            before KNOCKOUT, {
              if (ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite) {
                keyStore("Bruno_KO", thisCard, bg.turnCount)
              }
            }
          }
        }
        onPlay {
          shuffleDeck(hand.getExcludedList(thisCard))
          hand.removeAll(hand.getExcludedList(thisCard))

          if (keyStore("Bruno_KO", thisCard, null) == bg.turnCount - 1) {
            draw 7
          } else {
            draw 4
          }
        }
        playRequirement{
        }
      };
      case CAMPING_GEAR_122:
      return itemCard (this) {
        text "Search your deck for a card and put it into your hand. Then, shuffle your deck. Your turn ends."
        onPlay {
          my.deck.select(count: 1).moveTo(hidden: true, my.hand)
          shuffleDeck()
          bg.gm().betweenTurns()
        }
        playRequirement {
        }
      };
      case CHERYL_123:
      return supporter (this) {
        text "Heal all damage from each of your Evolution Pokémon. If you do, discard all Energy from the Pokémon that were healed in this way."
        onPlay {
          my.all.each {
            if (it.realEvolution && it.numberOfDamageCounters) {
              def previousDamage = it.numberOfDamageCounters
              heal it.damage.value, it, TRAINER_CARD

              if (previousDamage != it.numberOfDamageCounters) {
                it.cards.filterByType(ENERGY).discard()
              }
            }
          }
        }
        playRequirement{
          assert my.all.findAll {it.numberOfDamageCounters > 0 }
        }
      };
      case ENERGY_RECYCLER_124:
        return itemCard (this) {
          text "Shuffle up to 5 basic Energy cards from your discard pile into your deck. You may play any number of Item cards during your turn."
          onPlay {
            my.discard.filterByType(BASIC_ENERGY).select(min: 1, max: 5).moveTo(deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.filterByType(BASIC_ENERGY)
          }
        };
      case ESCAPE_ROPE_125:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case EXP_SHARE_126:
      return pokemonTool (this) {
        text "When your Active Pokémon is Knocked Out by damage from an opponent's attack, you may move 1 basic Energy card that was attached to that Pokémon to the Pokémon this card is attached to."
        def eff = null
        onPlay {
          eff = delayed (priority: LAST) {
            before KNOCKOUT, {
              if (ef.pokemonToBeKnockedOut.owner == self.owner && bg.currentTurn == self.owner.opposite
                && ef.pokemonToBeKnockedOut.active && ef.pokemonToBeKnockedOut != self
                && (ef as Knockout).byDamageFromAttack
                && ef.pokemonToBeKnockedOut.cards.filterByType(BASIC_ENERGY).notEmpty ) {
                if (confirm("Use Exp. Share on $self? ",self.owner)) {
                  CardList list = ef.pokemonToBeKnockedOut.cards.filterByType(BASIC_ENERGY)
                  list.select("Energy to move", {true}, self.owner).each {
                    energySwitch(ef.pokemonToBeKnockedOut, self, it)
                  }
                  bc "Exp. Share activated"
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case FAN_OF_WAVES_127:
      return itemCard (this) {
        text "Put a Special Energy attached to 1 of your opponent's Pokémon on the bottom of their deck."
        onPlay {
          def src = opp.all.findAll { it.cards.filterByType(SPECIAL_ENERGY) }.select("Select a Pokemon to move a Special Energy card to the bottom of the deck")
          def card = src.cards.filterByType(SPECIAL_ENERGY).select(count: 1)
          card.moveTo(opp.deck)
        }
        playRequirement{
          assert opp.all.find { it.cards.filterByType(SPECIAL_ENERGY) } : "Your opponent has no Special Energy cards attached"
        }
      };
      case KORRINA_S_FOCUS_128:
      return supporter (this) {
        text "Draw cards until you have 6 cards in your hand."
        onPlay {
          draw 6 - my.hand.getExcludedList(thisCard).size()
        }
        playRequirement {
          assert my.hand.getExcludedList(thisCard).size() < 6 : "You have 6 or more cards in your hand"
          assert my.deck : "Your deck is empty"
        }
      };
      case LEVEL_BALL_129:
        return copy(AncientOrigins.LEVEL_BALL_76, this)
      case PHOEBE_130:
      return supporter (this) {
        text "During this turn, damage from your Pokémon VMAX's attacks isn't affected by any effects on your opponent's Active Pokémon."
        onPlay {
          delayed {
            before PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.pokemonVMAX) {
                bg.dm().each {
                  if (it.to.owner != self.owner && it.to.active) {
                    bc "Phoebe's effect activated"
                    it.flags.add(DamageManager.DamageFlag.NO_DEFENDING_EFFECT)
                  }
                }
              }
            }
            unregister {
              bc "Phoebe's effect fades out"
            }
            unregisterAfter 1
          }
        }
      };
      case RAPID_STRIKE_SCROLL_OF_SWIRLS_131:
      return pokemonTool (this) {
        text "The Rapid Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)" +
          "Fighting[C][C] Matchless Maelstrom" +
          "This attack does 30 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
        def newMove
        onPlay { reason->
          def moveBody = {
            text "This attack does 30 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            attackRequirement {
              // self is not set properly creating a move like this, use bg.ownActive() instead
              assert bg.ownActive().rapidStrike : "${bg.ownActive()} is not a $RAPID_STRIKE Pokémon"
            }
            energyCost F, C, C
            onAttack {
              opp.all.each { damage 30, it }
            }
          }
          Move move = new Move("Matchless Maelstrom")
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
      case RAPID_STRIKE_STYLE_MUSTARD_132:
      return supporter (this) {
        text "You can play this card only when it is the last card in your hand." +
          "Put a Rapid Strike Pokémon from your discard pile onto your Bench. If you do, draw 5 cards."
        onPlay {
          def card = discardPile.findAll {it.cardTypes.is(POKEMON) && it.cardTypes.is(RAPID_STRIKE) }.select("Put on bench").first()
          def pcs = benchPCS(card)
          if (pcs) {
            draw 5
          }
        }
        playRequirement {
          assert hand.size() == 1 : "You can play this card only when it is the last card in your hand"
          assert discardPile.findAll {it.cardTypes.is(POKEMON) && it.cardTypes.is(RAPID_STRIKE)} : "No Rapid Strike Pokémon in discard pile"
          assert bench.notFull : "Bench is full"
        }
      };
      case SINGLE_STRIKE_SCROLL_OF_SCORN_133:
      return pokemonTool (this) {
        text "The Single Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)" +
          "Fighting Furious Anger 10+" +
          "This attack does 10 more damage for each damage counter on this Pokémon."
        def newMove
        onPlay { reason->
          def moveBody = {
            text "This attack does 10 more damage for each damage counter on this Pokémon."
            attackRequirement {
              // self is not set properly creating a move like this, use bg.ownActive() instead
              assert bg.ownActive().singleStrike : "${bg.ownActive()} is not a $SINGLE_STRIKE Pokémon"
            }
            energyCost F
            onAttack {
              damage 10
              damage 10 * self.numberOfDamageCounters
            }
          }
          Move move = new Move("Furious Anger")
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
      case SINGLE_STRIKE_STYLE_MUSTARD_134:
      return supporter (this) {
        text "You can play this card only when it is the last card in your hand." +
          "Search your deck for a Single Strike Pokémon and put it onto your Bench. Then, shuffle your deck. If you searched your deck in this way, draw 5 cards."
        onPlay {
          my.deck.search(count: 1, "Search for a Single Strike Pokémon to put onto the Bench", {
            it.cardTypes.is(POKEMON) && it.cardTypes.is(SINGLE_STRIKE)
          }).each {
            benchPCS(it)
          }
          shuffleDeck()
          draw 5
        }
        playRequirement {
          assert hand.size() == 1 : "You can play this card only when it is the last card in your hand"
          assert bench.notFull : "Bench is full"
        }
      };
      case SORDWARD_SHIELBERT_135:
      return supporter (this) {
        text "Choose a Trainer card from your discard pile. Then, ask your opponent if you may put it into your hand. If yes, put that card into your hand. If no, draw 3 cards."
        onPlay {
          def card = my.discard.filterByType(TRAINER).select("Choose a Trainer Card to put into your hand")
          card.showToOpponent("Sordward Shielbert: Your opponent wants to put this card into their hand")
          def oppChoice = oppChoose([0, 1], ["Accept", "Decline"], "Do you allow your Opponent to put the previous card into their hand?  If not, they draw 3 cards instead")

          if (oppChoice == 0) {
            card.moveTo(my.hand)
          } else {
            draw 3
          }
        }
        playRequirement {
          assert my.discard.hasType(TRAINER) : "There are no Trainer cards in your discard pile."
        }
      };
      case TOOL_JAMMER_136:
      return pokemonTool (this) {
        text "As long as the Pokémon this card is attached to is in the Active Spot, Pokémon Tools attached to your opponent's Active Pokémon have no effect, except for Tool Jammer."
        onPlay {reason->
          // TODO
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TOWER_OF_DARKNESS_137:
      return stadium (this) {
        text "Once during each player's turn, that player may draw 2 cards. In order to use this effect, that player must discard a Single Strike card from their hand."
        def lastTurn = 0
        def actions = []
        onPlay {
          actions = action("Stadium: Tower of Darkness") {
            assert my.deck : "Deck is empty"
            assert my.hand.filterByType(SINGLE_STRIKE) : "No Single Strike cards in hand"
            assert lastTurn != bg().turnCount : "Already used"
            bc "Used Tower of Darkness effect"
            lastTurn = bg().turnCount
            my.hand.filterByType(SINGLE_STRIKE).select("Discard a Single Strike card").discard()
            draw 2
          }
        }
        onRemoveFromPlay {
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case TOWER_OF_WATERS_138:
      return stadium (this) {
        text "The Retreat Cost of each Rapid Strike Pokémon in play (both yours and your opponent's) is [C][C] less."
        def eff
        onPlay {
          eff = getter (GET_RETREAT_COST) { holder ->
            if ((holder.effect.target as PokemonCardSet).rapidStrike) {
              holder.object -= 2
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case URN_OF_VITALITY_139:
      return itemCard (this) {
        text "Shuffle up to 2 Single Strike Energy cards from your discard pile into your deck."
        onPlay {
          my.discard.findAll (cardTypeFilter(SPECIAL_ENERGY, SINGLE_STRIKE)).select(min: 1, max: 2, "Shuffle to deck").moveTo(deck)
          shuffleDeck()
        }
        playRequirement{

          assert my.discard.any(cardTypeFilter(SPECIAL_ENERGY, SINGLE_STRIKE)) : "No Single Strike energy"
        }
      };
      case RAPID_STRIKE_ENERGY_140:
      return specialEnergy (this, [[C]]) {
        text "This card can only be attached to a Rapid Strike Pokémon. If this card is attached to anything other than a Rapid Strike Pokémon, discard this card." +
          "As long as this card is attached to a Pokémon, it provides 2 in any combination of [W] Energy and [F] Energy."
        def check = { PokemonCardSet pcs->
          if (!pcs.rapidStrike) {
            targeted null, SRC_SPENERGY, {
              discard thisCard
            }
          }
        }
        def checkEff
        onPlay {reason->
          checkEff = delayed {
            after EVOLVE, { check self }
            after DEVOLVE, { check self }
            after ATTACH_ENERGY, self, { check self }
          }
        }
        onRemoveFromPlay {
          checkEff.unregister()
        }
        onMove {to->
          check to
        }
        allowAttach {to->
          to.rapidStrike
        }
        getEnergyTypesOverride {
          self != null ? [[W, F] as Set, [W, F] as Set] : [[] as Set]
        }
      };
      case SINGLE_STRIKE_ENERGY_141:
      return specialEnergy (this, [[C]]) {
        text "This card can only be attached to a Single Strike Pokémon. If this card is attached to anything other than a Single Strike Pokémon, discard this card." +
          "As long as this card is attached to a Pokémon, it provides Fighting and [D] Energy but provides only 1 Energy at a time, and the attacks of the Pokémon this card is attached to do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
        def check = { PokemonCardSet pcs->
          if (!pcs.singleStrike) {
            targeted null, SRC_SPENERGY, {
              discard thisCard
            }
          }
        }
        def damageInc
        onPlay {reason->
          damageInc = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              targeted self, SRC_SPENERGY, {
                bg.dm().each {
                  if (ef.attacker == self && it.dmg.value && it.from == self && it.to.active && it.to.owner != self.owner) {
                    bc "Single Strike Energy +20"
                    it.dmg += hp 20
                  }
                }
              }
            }
            after EVOLVE, { check self }
            after DEVOLVE, { check self }
            after ATTACH_ENERGY, self, { check self }
          }
        }
        onRemoveFromPlay {
          damageInc.unregister()
        }
        onMove {to->
          check(to)
        }
        allowAttach {to->
          to.singleStrike
        }
        getEnergyTypesOverride {
          self != null ? [[F, D] as Set] : [[] as Set]
        }
      };
      case KRICKETUNE_V_142:
      return copy (KRICKETUNE_V_6, this);
      case FLAPPLE_V_143:
      return copy (FLAPPLE_V_18, this);
      case VICTINI_V_144:
      return copy (VICTINI_V_21, this);
      case EMPOLEON_V_145:
      return copy (EMPOLEON_V_40, this);
      case EMPOLEON_V_146:
      return copy (EMPOLEON_V_40, this);
      case TAPU_KOKO_V_147:
      return copy (TAPU_KOKO_V_50, this);
      case MIMIKYU_V_148:
      return copy (MIMIKYU_V_62, this);
      case NECROZMA_V_149:
      return copy (NECROZMA_V_63, this);
      case SINGLE_STRIKE_URSHIFU_V_150:
      return copy (SINGLE_STRIKE_URSHIFU_V_85, this);
      case SINGLE_STRIKE_URSHIFU_V_151:
      return copy (SINGLE_STRIKE_URSHIFU_V_85, this);
      case RAPID_STRIKE_URSHIFU_V_152:
      return copy (RAPID_STRIKE_URSHIFU_V_87, this);
      case RAPID_STRIKE_URSHIFU_V_153:
      return copy (RAPID_STRIKE_URSHIFU_V_87, this);
      case TYRANITAR_V_154:
      return copy (TYRANITAR_V_97, this);
      case TYRANITAR_V_155:
      return copy (TYRANITAR_V_97, this);
      case CORVIKNIGHT_V_156:
      return copy (CORVIKNIGHT_V_109, this);
      case STOUTLAND_V_157:
      return copy (STOUTLAND_V_117, this);
      case BRUNO_158:
      return copy (BRUNO_121, this);
      case CHERYL_159:
      return copy (CHERYL_123, this);
      case KORRINA_S_FOCUS_160:
      return copy (KORRINA_S_FOCUS_128, this);
      case PHOEBE_161:
      return copy (PHOEBE_130, this);
      case RAPID_STRIKE_STYLE_MUSTARD_162:
      return copy (RAPID_STRIKE_STYLE_MUSTARD_132, this);
      case SINGLE_STRIKE_STYLE_MUSTARD_163:
      return copy (SINGLE_STRIKE_STYLE_MUSTARD_134, this);
      case FLAPPLE_VMAX_164:
      return copy (FLAPPLE_VMAX_19, this);
      case VICTINI_VMAX_165:
      return copy (VICTINI_VMAX_22, this);
      case TAPU_KOKO_VMAX_166:
      return copy (TAPU_KOKO_VMAX_51, this);
      case SINGLE_STRIKE_URSHIFU_VMAX_167:
      return copy (SINGLE_STRIKE_URSHIFU_VMAX_86, this);
      case SINGLE_STRIKE_URSHIFU_VMAX_168:
      return copy (SINGLE_STRIKE_URSHIFU_VMAX_86, this);
      case RAPID_STRIKE_URSHIFU_VMAX_169:
      return copy (RAPID_STRIKE_URSHIFU_VMAX_88, this);
      case RAPID_STRIKE_URSHIFU_VMAX_170:
      return copy (RAPID_STRIKE_URSHIFU_VMAX_88, this);
      case CORVIKNIGHT_VMAX_171:
      return copy (CORVIKNIGHT_VMAX_110, this);
      case BRUNO_172:
      return copy (BRUNO_121, this);
      case CHERYL_173:
      return copy (CHERYL_123, this);
      case KORRINA_S_FOCUS_174:
      return copy (KORRINA_S_FOCUS_128, this);
      case PHOEBE_175:
      return copy (PHOEBE_130, this);
      case RAPID_STRIKE_STYLE_MUSTARD_176:
      return copy (RAPID_STRIKE_STYLE_MUSTARD_132, this);
      case SINGLE_STRIKE_STYLE_MUSTARD_177:
      return copy (SINGLE_STRIKE_STYLE_MUSTARD_134, this);
      case OCTILLERY_178:
      return copy (OCTILLERY_37, this);
      case HOUNDOOM_179:
      return copy (HOUNDOOM_96, this);
      case EXP_SHARE_180:
      return copy (EXP_SHARE_126, this);
      case LEVEL_BALL_181:
      return copy (LEVEL_BALL_129, this);
      case RAPID_STRIKE_ENERGY_182:
      return copy (RAPID_STRIKE_ENERGY_140, this);
      case SINGLE_STRIKE_ENERGY_183:
      return copy (SINGLE_STRIKE_ENERGY_141, this);
        default:
      return null;
    }
  }
}
