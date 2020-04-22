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
public enum RebelClash implements LogicCardInfo {

  CATERPIE_1 ("Caterpie", 1, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  METAPOD_2 ("Metapod", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BUTTERFREE_3 ("Butterfree", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SCYTHER_4 ("Scyther", 4, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  HERACROSS_5 ("Heracross", 5, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHUCKLE_6 ("Shuckle", 6, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  LOTAD_7 ("Lotad", 7, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  LOMBRE_8 ("Lombre", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LUDICOLO_9 ("Ludicolo", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  SURSKIT_10 ("Surskit", 10, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  MASQUERAIN_11 ("Masquerain", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SNOVER_12 ("Snover", 12, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  ABOMASNOW_13 ("Abomasnow", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PHANTUMP_14 ("Phantump", 14, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  TREVENANT_15 ("Trevenant", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRUBBIN_16 ("Grubbin", 16, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  RILLABOOM_V_17 ("Rillaboom V", 17, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  RILLABOOM_VMAX_18 ("Rillaboom VMAX", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  ELDEGOSS_V_19 ("Eldegoss V", 19, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  APPLIN_20 ("Applin", 20, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  APPLIN_21 ("Applin", 21, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  FLAPPLE_22 ("Flapple", 22, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  APPLETUN_23 ("Appletun", 23, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VULPIX_24 ("Vulpix", 24, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  NINETALES_25 ("Ninetales", 25, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  NINETALES_V_26 ("Ninetales V", 26, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  GROWLITHE_27 ("Growlithe", 27, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  ARCANINE_28 ("Arcanine", 28, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MAGMAR_29 ("Magmar", 29, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  MAGMORTAR_30 ("Magmortar", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  LITWICK_31 ("Litwick", 31, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  LAMPENT_32 ("Lampent", 32, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHANDELURE_33 ("Chandelure", 33, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  HEATMOR_34 ("Heatmor", 34, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  CINDERACE_V_35 ("Cinderace V", 35, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  CINDERACE_VMAX_36 ("Cinderace VMAX", 36, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  GALARIAN_MR._MIME_37 ("Galarian Mr. Mime", 37, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR._RIME_38 ("Galarian Mr. Rime", 38, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MAGIKARP_39 ("Magikarp", 39, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GYARADOS_40 ("Gyarados", 40, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WINGULL_41 ("Wingull", 41, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  PELIPPER_42 ("Pelipper", 42, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MILOTIC_V_43 ("Milotic V", 43, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  TYMPOLE_44 ("Tympole", 44, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  PALPITOAD_45 ("Palpitoad", 45, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEISMITOAD_46 ("Seismitoad", 46, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  GALARIAN_DARUMAKA_47 ("Galarian Darumaka", 47, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_48 ("Galarian Darmanitan", 48, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  INTELEON_V_49 ("Inteleon V", 49, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  INTELEON_VMAX_50 ("Inteleon VMAX", 50, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  CRAMORANT_51 ("Cramorant", 51, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  ARROKUDA_52 ("Arrokuda", 52, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  BARRASKEWDA_53 ("Barraskewda", 53, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  EISCUE_54 ("Eiscue", 54, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  PIKACHU_55 ("Pikachu", 55, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  VOLTORB_56 ("Voltorb", 56, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_57 ("Electrode", 57, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ELECTABUZZ_58 ("Electabuzz", 58, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTIVIRE_59 ("Electivire", 59, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SHINX_60 ("Shinx", 60, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  LUXIO_61 ("Luxio", 61, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LUXRAY_62 ("Luxray", 62, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  HELIOPTILE_63 ("Helioptile", 63, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  HELIOLISK_64 ("Heliolisk", 64, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  CHARJABUG_65 ("Charjabug", 65, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VIKAVOLT_66 ("Vikavolt", 66, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  BOLTUND_V_67 ("Boltund V", 67, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  TOXEL_68 ("Toxel", 68, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_69 ("Toxtricity", 69, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TOXTRICITY_V_70 ("Toxtricity V", 70, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  TOXTRICITY_VMAX_71 ("Toxtricity VMAX", 71, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  PINCURCHIN_V_72 ("Pincurchin V", 72, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  MORPEKO_73 ("Morpeko", 73, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  CLEFAIRY_74 ("Clefairy", 74, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  CLEFABLE_75 ("Clefable", 75, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  NATU_76 ("Natu", 76, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  XATU_77 ("Xatu", 77, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_CORSOLA_78 ("Galarian Corsola", 78, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GALARIAN_CURSOLA_79 ("Galarian Cursola", 79, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SIGILYPH_80 ("Sigilyph", 80, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  SANDYGAST_81 ("Sandygast", 81, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  PALOSSAND_82 ("Palossand", 82, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATTENA_83 ("Hattena", 83, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  HATTREM_84 ("Hattrem", 84, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATTERENE_85 ("Hatterene", 85, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MILCERY_86 ("Milcery", 86, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  ALCREMIE_87 ("Alcremie", 87, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  INDEEDEE_88 ("Indeedee", 88, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  DREEPY_89 ("Dreepy", 89, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  DRAKLOAK_90 ("Drakloak", 90, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DRAGAPULT_91 ("Dragapult", 91, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DRAGAPULT_V_92 ("Dragapult V", 92, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  DRAGAPULT_VMAX_93 ("Dragapult VMAX", 93, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  GALARIAN_FARFETCH_D_94 ("Galarian Farfetch’d", 94, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_95 ("Galarian Sirfetch’d", 95, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  NOSEPASS_96 ("Nosepass", 96, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MEDITITE_97 ("Meditite", 97, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MEDICHAM_98 ("Medicham", 98, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  BARBOACH_99 ("Barboach", 99, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  WHISCASH_100 ("Whiscash", 100, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_YAMASK_101 ("Galarian Yamask", 101, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_RUNERIGUS_102 ("Galarian Runerigus", 102, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  BINACLE_103 ("Binacle", 103, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  BARBARACLE_104 ("Barbaracle", 104, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ROLYCOLY_105 ("Rolycoly", 105, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  CARKOAL_106 ("Carkoal", 106, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  COALOSSAL_107 ("Coalossal", 107, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SANDACONDA_V_108 ("Sandaconda V", 108, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  FALINKS_109 ("Falinks", 109, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  FALINKS_V_110 ("Falinks V", 110, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  STONJOURNER_111 ("Stonjourner", 111, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_112 ("Koffing", 112, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_WEEZING_113 ("Galarian Weezing", 113, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  STUNKY_114 ("Stunky", 114, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SKUNTANK_115 ("Skuntank", 115, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPIRITOMB_116 ("Spiritomb", 116, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  TRUBBISH_117 ("Trubbish", 117, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GARBODOR_118 ("Garbodor", 118, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VULLABY_119 ("Vullaby", 119, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MANDIBUZZ_120 ("Mandibuzz", 120, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  MALAMAR_V_121 ("Malamar V", 121, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  MALAMAR_VMAX_122 ("Malamar VMAX", 122, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  IMPIDIMP_123 ("Impidimp", 123, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MORGREM_124 ("Morgrem", 124, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_125 ("Grimmsnarl", 125, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  GALARIAN_MEOWTH_126 ("Galarian Meowth", 126, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_127 ("Galarian Perrserker", 127, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SCIZOR_128 ("Scizor", 128, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  BRONZOR_129 ("Bronzor", 129, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  BRONZONG_130 ("Bronzong", 130, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  PROBOPASS_131 ("Probopass", 131, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  DURANT_132 ("Durant", 132, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  HONEDGE_133 ("Honedge", 133, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  DOUBLADE_134 ("Doublade", 134, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AEGISLASH_135 ("Aegislash", 135, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  COPPERAJAH_V_136 ("Copperajah V", 136, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _METAL_]),
  COPPERAJAH_VMAX_137 ("Copperajah VMAX", 137, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  DURALUDON_138 ("Duraludon", 138, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  ZACIAN_139 ("Zacian", 139, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  ZAMAZENTA_140 ("Zamazenta", 140, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  SNORLAX_141 ("Snorlax", 141, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CHATOT_142 ("Chatot", 142, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  PIDOVE_143 ("Pidove", 143, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TRANQUIL_144 ("Tranquil", 144, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  UNFEZANT_145 ("Unfezant", 145, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  BUNNELBY_146 ("Bunnelby", 146, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  DIGGERSBY_147 ("Diggersby", 147, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  HAWLUCHA_148 ("Hawlucha", 148, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  STUFFUL_149 ("Stufful", 149, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  BEWEAR_150 ("Bewear", 150, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SKWOVET_151 ("Skwovet", 151, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_152 ("Greedent", 152, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUBWOOL_V_153 ("Dubwool V", 153, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  BOSS_S_ORDERS_154 ("Boss’s Orders", 154, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  BURNING_SCARF_155 ("Burning Scarf", 155, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  CURSED_SHOVEL_156 ("Cursed Shovel", 156, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  DAN_157 ("Dan", 157, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  FULL_BUCKET_158 ("Full Bucket", 158, Rarity.HOLORARE, [TRAINER, ITEM]),
  FULL_HEAL_159 ("Full Heal", 159, Rarity.HOLORARE, [TRAINER, ITEM]),
  GALAR_MINE_160 ("Galar Mine", 160, Rarity.HOLORARE, [TRAINER]),
  MILO_161 ("Milo", 161, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  NUGGET_162 ("Nugget", 162, Rarity.HOLORARE, [TRAINER, ITEM]),
  OLEANA_163 ("Oleana", 163, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  POKEBALL_164 ("PokeBall", 164, Rarity.HOLORARE, [TRAINER, ITEM]),
  SCOOP_UP_NET_165 ("Scoop Up Net", 165, Rarity.HOLORARE, [TRAINER, ITEM]),
  SKYLA_166 ("Skyla", 166, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  SONIA_167 ("Sonia", 167, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  TOOL_SCRAPPER_168 ("Tool Scrapper", 168, Rarity.HOLORARE, [TRAINER, ITEM]),
  TRAINING_COURT_169 ("Training Court", 169, Rarity.HOLORARE, [TRAINER]),
  TURRFIELD_170 ("Turrfield", 170, Rarity.HOLORARE, [TRAINER, ITEM]),
  CAPTURE_ENERGY_171 ("Capture Energy", 171, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
  HORROR_PSYCHIC_ENERGY_172 ("Horror Psychic Energy", 172, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
  SPEED_LIGHTNING_ENERGY_173 ("Speed Lightning Energy", 173, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
  TWIN_ENERGY_174 ("Twin Energy", 174, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
  RILLABOOM_V_175 ("Rillaboom V", 175, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  ELDEGOSS_V_176 ("Eldegoss V", 176, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  NINETALES_V_177 ("Ninetales V", 177, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  CINDERACE_V_178 ("Cinderace V", 178, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  MILOTIC_V_179 ("Milotic V", 179, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  INTELEON_V_180 ("Inteleon V", 180, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _WATER_]),
  BOLTUND_V_181 ("Boltund V", 181, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  TOXTRICITY_V_182 ("Toxtricity V", 182, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  DRAGAPULT_V_183 ("Dragapult V", 183, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  SANDACONDA_V_184 ("Sandaconda V", 184, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  FALINKS_V_185 ("Falinks V", 185, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  MALAMAR_V_186 ("Malamar V", 186, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  COPPERAJAH_V_187 ("Copperajah V", 187, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _METAL_]),
  DUBWOOL_V_188 ("Dubwool V", 188, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  BOSS_S_ORDERS_189 ("Boss’s Orders", 189, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  MILO_190 ("Milo", 190, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  OLEANA_191 ("Oleana", 191, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  SONIA_192 ("Sonia", 192, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  RILLABOOM_VMAX_193 ("Rillaboom VMAX", 193, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  CINDERACE_VMAX_194 ("Cinderace VMAX", 194, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  INTELEON_VMAX_195 ("Inteleon VMAX", 195, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  TOXTRICITY_VMAX_196 ("Toxtricity VMAX", 196, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  DRAGAPULT_VMAX_197 ("Dragapult VMAX", 197, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  MALAMAR_VMAX_198 ("Malamar VMAX", 198, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  COPPERAJAH_VMAX_199 ("Copperajah VMAX", 199, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  BOSS_S_ORDERS_200 ("Boss’s Orders", 200, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  MILO_201 ("Milo", 201, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  OLEANA_202 ("Oleana", 202, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  SONIA_203 ("Sonia", 203, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  FROSMOTH_204 ("Frosmoth", 204, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PERRSERKER_205 ("Perrserker", 205, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GIANT_CHARM_206 ("Giant Charm", 206, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  SCOOP_UP_NET_207 ("Scoop Up Net", 207, Rarity.HOLORARE, [TRAINER, ITEM]),
  TOOL_SCRAPPER_208 ("Tool Scrapper", 208, Rarity.HOLORARE, [TRAINER, ITEM]),
  TWIN_ENERGY_209 ("Twin Energy", 209, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  RebelClash(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.REBEL_CLASH;
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
      case CATERPIE_1:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
				bwAbility "Adaptive Evolution", {
					text "This Pokemon can evolve during your first turn or the turn you play it."
					actionA {
					}
				}
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case METAPOD_2:
      return evolution (this, from:"Caterpie", hp:HP080, type:G, retreatCost:3) {
				bwAbility "Adaptive Evolution", {
					text "This Pokemon can evolve during your first turn or the turn you play it."
					actionA {
					}
				}
				move "Ram", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case BUTTERFREE_3:
      return evolution (this, from:"Metapod", hp:HP140, type:G, retreatCost:1) {
				move "Panic Poison", {
					text "30 damage. Your opponent’s Active Pokemon is now Poisoned, Burned, and Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Cutting Wind", {
					text "80 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case SCYTHER_4:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
				move "Swords Dance", {
					text "During your next turn, the base damage of this Pokemon’s Speed Sickle is increased by 70."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Speed Sickle", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case HERACROSS_5:
      return basic (this, hp:HP130, type:G, retreatCost:2) {
				move "Push Down", {
					text "30 damage. Your opponent switches their Active Pokemon with 1 of their Benched Pokemon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Strong Horn", {
					text "110 damage."
					energyCost G, G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SHUCKLE_6:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
				move "Gather Berries", {
					text "Shuffle 5 basic Energy cards from your discard pile into your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Bind", {
					text "50 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case LOTAD_7:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
				move "Blot", {
					text "10 damage. Heal 10 damage from this Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Ram", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case LOMBRE_8:
      return evolution (this, from:"Lotad", hp:HP090, type:G, retreatCost:1) {
				bwAbility "Top Entry", {
					text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
					actionA {
					}
				}
				move "Fury Swipes", {
					text "40x damage. Flip 3 coins. This attack does 40 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case LUDICOLO_9:
      return evolution (this, from:"Lombre", hp:HP160, type:G, retreatCost:2) {
				move "Energized Rush", {
					text "60x damage. This attack does 60 damage for each Prize card you’ve taken."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Mega Drain", {
					text "120 damage. Heal 30 damage from this Pokemon.Weakness"
					energyCost G, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SURSKIT_10:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
				move "Agility", {
					text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case MASQUERAIN_11:
      return evolution (this, from:"Surskit", hp:HP090, type:G, retreatCost:1) {
				move "Pattern Menace", {
					text "30 damage. Your opponent can’t attach Energy from their hand to the Defending Pokemon during their next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case SNOVER_12:
      return basic (this, hp:HP090, type:G, retreatCost:3) {
				move "Beat", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Razor Leaf", {
					text "50 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case ABOMASNOW_13:
      return evolution (this, from:"Snover", hp:HP140, type:G, retreatCost:3) {
				move "Aroma Sleep", {
					text "80 damage. Your opponent’s Active Pokemon is now Asleep."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				move "Mega Lariat", {
					text "140 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case PHANTUMP_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
				move "Dark Guidance", {
					text "Choose a Basic Pokemon from your discard pile and play it onto your Bench."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Seed Bomb", {
					text "30 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case TREVENANT_15:
      return evolution (this, from:"Phantump", hp:HP130, type:G, retreatCost:3) {
				move "Seed Bomb", {
					text "40 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Shadow Cage", {
					text "120 damage. The Defending Pokemon can’t retreat during your opponent’s next turn."
					energyCost G, G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GRUBBIN_16:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case RILLABOOM_V_17:
      return basic (this, hp:HP220, type:G, retreatCost:3) {
				move "Forest Feast", {
					text "Search your deck for up to 2 Basic [G] Pokemon and put them onto your Bench. Then, shuffle your deck."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
				move "Wood Hammer", {
					text "220 damage. This Pokemon also does 30 damage to itself."
					energyCost G, G, G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case RILLABOOM_VMAX_18:
      return evolution (this, from:"Rillaboom V", hp:HP330, type:G, retreatCost:3) {
				move "Scratch", {
					text "50 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Max Barrage", {
					text "130+ damage. You may discard up to 3 [G] Energy from this Pokemon. This attack does 50 more damage for each Energy you discarded in this way."
					energyCost G, G, G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ELDEGOSS_V_19:
      return basic (this, hp:HP180, type:G, retreatCost:1) {
				bwAbility "Happy March", {
					text "Once during your turn, when you play this card from your hand to your Bench, you may put a Supporter card from your discard pile into your hand."
					actionA {
					}
				}
				move "Soar Upward", {
					text "50 damage. You may shuffle this Pokemon and all cards attached to it into your deck."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case APPLIN_20:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage from attacks done to this Pokemon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case APPLIN_21:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				move "Continuous Tumble", {
					text "10+ damage. Flip a coin until you get tails. This attack does 30 more damage times the number of heads."
					energyCost G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case FLAPPLE_22:
      return evolution (this, from:"Applin", hp:HP080, type:G, retreatCost:1) {
				bwAbility "Apple Drop", {
					text "Once during your turn, you may put 2 damage counters on 1 of your opponent’s Pokemon. Then, shuffle this Pokemon and all cards attached to it into your deck."
					actionA {
					}
				}

			};
      case APPLETUN_23:
      return evolution (this, from:"Applin", hp:HP090, type:G, retreatCost:3) {
				bwAbility "Delicious Scent", {
					text "Once during your turn, you may flip a coin. If heads, choose 1 of your opponent’s Benched Basic Pokemon and switch it with their Active Pokemon."
					actionA {
					}
				}
				move "Solar Beam", {
					text "70 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case VULPIX_24:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
				move "Confuse Ray", {
					text "Your opponent’s Active Pokemon is now Confused."
					energyCost R
					attackRequirement {}
					onAttack {

					}
				}
				move "Smash Kick", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case NINETALES_25:
      return evolution (this, from:"Vulpix", hp:HP120, type:R, retreatCost:1) {
				move "Hex", {
					text "30+ damage. If your opponent’s Active Pokemon has an Ability, this attack does 90 more damage."
					energyCost R
					attackRequirement {}
					onAttack {

					}
				}
				move "Flickering Flames", {
					text "90 damage. Your opponent’s Active Pokemon is now Asleep."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
			};
      case NINETALES_V_26:
      return basic (this, hp:HP200, type:R, retreatCost:2) {
				move "Nine Tailed Transformation", {
					text "Choose 1 of your opponent’s Active Pokemon’s attacks and use it as this attack."
					energyCost R, C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Flamethrower", {
					text "180 damage. Discard an Energy from this Pokemon."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GROWLITHE_27:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
				move "Odor Sleuth", {
					text "Flip a coin. If heads, put a card from your discard pile into your hand."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Fire Claws", {
					text "60 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case ARCANINE_28:
      return evolution (this, from:"Growlithe", hp:HP130, type:R, retreatCost:2) {
				bwAbility "Warmup", {
					text "If this Pokemon has Burning Scarf attached to it, it get +100 HP."
					actionA {
					}
				}
				move "Fire Mane", {
					text "130 damage."
					energyCost R, R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MAGMAR_29:
      return basic (this, hp:HP090, type:R, retreatCost:2) {
				move "Punch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Heat Breath", {
					text "20+ damage. Flip a coin. If heads, this attack does 30 more damage.Weakness"
					energyCost R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MAGMORTAR_30:
      return evolution (this, from:"Magmar", hp:HP140, type:R, retreatCost:3) {
				move "Ground Burn", {
					text "80+ damage. Each player discards a card from the top of their deck. This attack does 100 more damage for each Energy card discarded in this way."
					energyCost R, R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case LITWICK_31:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
				move "Scorch", {
					text "Your opponent’s Active Pokemon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {

					}
				}
			};
      case LAMPENT_32:
      return evolution (this, from:"Litwick", hp:HP080, type:R, retreatCost:1) {
				bwAbility "Top Entry", {
					text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
					actionA {
					}
				}
				move "Rekindle", {
					text "20 damage. Attach a [R] Energy card from your discard pile to this Pokemon."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case CHANDELURE_33:
      return evolution (this, from:"Lampent", hp:HP140, type:R, retreatCost:2) {
				bwAbility "Protection Lamp", {
					text "Each of your Pokemon that has any Energy attached to it has no Weakness."
					actionA {
					}
				}
				move "Mirage Flare", {
					text "110 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case HEATMOR_34:
      return basic (this, hp:HP120, type:R, retreatCost:2) {
				move "Lick", {
					text "20 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Flamethrower", {
					text "120 damage. Discard an Energy from this Pokemon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case CINDERACE_V_35:
      return basic (this, hp:HP210, type:R, retreatCost:2) {
				bwAbility "Field Runner", {
					text "If there is a Stadium card in play, this Pokemon has no Retreat Cost."
					actionA {
					}
				}
				move "Crimson Legs", {
					text "140 damage."
					energyCost R, R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case CINDERACE_VMAX_36:
      return evolution (this, from:"Cinderace V", hp:HP320, type:R, retreatCost:2) {
				move "Counter", {
					text "30+ damage. This attack does additional damage equal to the amount of damage done to this Pokemon by attacks from your opponent’s Pokemon during your opponent’s last turn."
					energyCost R, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Grand Fire Ball", {
					text "170 damage. Your opponent’s Active Pokemon is now Burned."
					energyCost R, R, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_MR._MIME_37:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
				move "Icy Wind", {
					text "10 damage. Your opponent’s Active Pokemon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Triple Spin", {
					text "20x damage. Flip 3 coins. This attack does 20 damage time the number of heads."
					energyCost W, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_MR._RIME_38:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP110, type:W, retreatCost:1) {
				bwAbility "Barrier Free", {
					text "As long as this Pokemon is in play, prevent effects of opponent’s attacks done to all of your Pokemon with Energy attached to them. (This does not remove existing effects.)"
					actionA {
					}
				}
				move "Triple Spin", {
					text "50x damage. Flip 3 coins. This attack does 50 damage times the number of heads."
					energyCost W, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MAGIKARP_39:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
				move "Leap Out", {
					text "Switch This Pokemon with 1 of your Benched Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GYARADOS_40:
      return evolution (this, from:"Magikarp", hp:HP180, type:W, retreatCost:4) {
				move "Wrack Down", {
					text "90 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				move "Big Storm", {
					text "200 damage. Discard any Stadium card in play."
					energyCost W, W, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case WINGULL_41:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Wave Splash", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case PELIPPER_42:
      return evolution (this, from:"Wingull", hp:HP120, type:W, retreatCost:2) {
				resistance F, MINUS20
				move "Wing Attack", {
					text "50 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Power Cyclone", {
					text "110 damage. Move an Energy from this Pokemon to 1 of your Benched Pokemon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MILOTIC_V_43:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
				move "Aqua Impact", {
					text "10+ damage. This attack does 50 more damage for each [C] in your opponent’s Active Pokemon’s Retreat Cost."
					energyCost W, C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Hypno Splash", {
					text "150 damage. Your opponent’s Active Pokemon is now Asleep."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case TYMPOLE_44:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
				move "Spin", {
					text "Your opponent’s Active Pokemon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case PALPITOAD_45:
      return evolution (this, from:"Tympole", hp:HP090, type:W, retreatCost:2) {
				move "Twirling Sign", {
					text "30 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case SEISMITOAD_46:
      return evolution (this, from:"Palpitoad", hp:HP170, type:W, retreatCost:3) {
				move "Split Spiral Punch", {
					text "30 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Resonance", {
					text "120 damage. If your opponent’s Active Pokemon is Confused, this attack does 120 more damage."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_DARUMAKA_47:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
				move "Ice Punch", {
					text "30 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case GALARIAN_DARMANITAN_48:
      return evolution (this, from:"Galarian Darumaka", hp:HP140, type:W, retreatCost:3) {
				move "Blizzard", {
					text "80 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				move "Crushed Ice Head", {
					text "170 damage. This Pokemon can’t use Crushed Ice Head during your next turn."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case INTELEON_V_49:
      return basic (this, hp:HP200, type:W, retreatCost:2) {
				move "Snipe Shot", {
					text "This attack does 40 damage to 1 of your opponent’s Pokemon. (Don’t apply Weakness or Resistance for Benched Pokemon.)"
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
				move "Aqua Report", {
					text "130 damage. Your opponent reveals their hand."
					energyCost W, W, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case INTELEON_VMAX_50:
      return evolution (this, from:"Inteleon V", hp:HP320, type:W, retreatCost:2) {
				move "Hydro Snipe", {
					text "60 damage. You may return an Energy card from your opponent’s Active Pokemon to their hand."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Grand Bullet", {
					text "160 damage. This attack does 60 damage to 1 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost W, W, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case CRAMORANT_51:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
				resistance F, MINUS20
				move "Diving", {
					text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent’s next turn."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Hydro Pump", {
					text "50+ damage. This attack does 20 more damage for each [W] Energy attached to this Pokemon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ARROKUDA_52:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
				move "Rain Splash", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case BARRASKEWDA_53:
      return evolution (this, from:"Arrokuda", hp:HP120, type:W, retreatCost:1) {
				move "Peck", {
					text "30 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Screw Jet", {
					text "130 damage. Discard 2 [W] Energy from your hand or this attack does nothing."
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
			};
      case EISCUE_54:
      return basic (this, hp:HP120, type:W, retreatCost:2) {
				bwAbility "Ice Face", {
					text "If this Pokemon’s HP is at max, any damage done to it by opponent’s attacks is reduced by 60."
					actionA {
					}
				}
				move "Blizzard", {
					text "70 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case PIKACHU_55:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
				move "Tail Whip", {
					text "Flip a coin. If heads, the Defending Pokemon can’t attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Pika Volt", {
					text "50 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case VOLTORB_56:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
				move "Continuous Tumble", {
					text "Flip a coin until you get tails. This attack does 20 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ELECTRODE_57:
      return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:0) {
				move "Orb Collection", {
					text "Search your deck for up to 3 Energy cards, reveal them, and put them in your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Ball Attack", {
					text "70 damage. "
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case ELECTABUZZ_58:
      return basic (this, hp:HP090, type:L, retreatCost:2) {
				move "Knuckle Punch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Electroslug", {
					text "70 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case ELECTIVIRE_59:
      return evolution (this, from:"Electabuzz", hp:HP140, type:L, retreatCost:3) {
				move "Thundershock", {
					text "50 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Powered Volt", {
					text "90 damage. If this Pokemon has a Special Energy card attached to it, this attack does 90 more damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
			};
      case SHINX_60:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
				move "Adversity", {
					text "10 damage. If your opponent has 3 or fewer Prize cards remaining, this attack does 50 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case LUXIO_61:
      return evolution (this, from:"Shinx", hp:HP090, type:L, retreatCost:1) {
				bwAbility "Top Entry", {
					text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
					actionA {
					}
				}
				move "Elekick", {
					text "30 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case LUXRAY_62:
      return evolution (this, from:"Luxio", hp:HP160, type:L, retreatCost:1) {
				move "Raid", {
					text "60 damage. If this Pokemon evolved from Luxio during your turn, this attack does 100 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Head Bolt", {
					text "120 damage."
					energyCost L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case HELIOPTILE_63:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
				move "Thunder Jolt", {
					text "30 damage. This Pokemon does 10 damage to itself."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case HELIOLISK_64:
      return evolution (this, from:"Helioptile", hp:HP110, type:L, retreatCost:1) {
				move "Eerie Impulse", {
					text "Flip a coin. If heads, discard an Energy from 1 of your opponent’s Pokemon."
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
				move "Thunder", {
					text "120 damage. This Pokemon does 30 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case CHARJABUG_65:
      return evolution (this, from:"Grubbin", hp:HP090, type:L, retreatCost:2) {
				move "Recharge", {
					text "Search your deck for up to 2 [L] Energy cards and attach them to this Pokemon. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Light Ball", {
					text "70 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case VIKAVOLT_66:
      return evolution (this, from:"Charjabug", hp:HP150, type:L, retreatCost:2) {
				move "Powerful Storm", {
					text "60+ damage. This attack does 20 more damage times the amount of Energy attached to all of your Pokemon."
					energyCost L, C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Electric Beam", {
					text "170 damage. This Pokemon does 30 damage to itself."
					energyCost L, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BOLTUND_V_67:
      return basic (this, hp:HP200, type:L, retreatCost:2) {
				move "Electrify", {
					text "Search your deck for up to 2 [L] Energy and attach them to your Benched Pokemon in any way you like. Then, shuffle your deck."
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
				move "Lightning Storm", {
					text "10+ damage. This attack does 30 more damage for each [L] Energy attached to your Pokemon in play."
					energyCost L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case TOXEL_68:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
				move "Tight Jaw", {
					text "10 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case TOXTRICITY_69:
      return evolution (this, from:"Toxel", hp:HP130, type:L, retreatCost:2) {
				move "Poison Shout", {
					text "This attack does 20 damage to each of your opponent’s Pokemon. Your opponent’s Active Pokemon is now Poisoned. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
				move "Hammer In", {
					text "90 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
			};
      case TOXTRICITY_V_70:
      return basic (this, hp:HP210, type:L, retreatCost:2) {
				move "Poison Jab", {
					text "20 damage. Your opponent’s Active Pokemon is now Poisoned."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Electric Riot", {
					text "90+ damage. This attack does 90 more damage if your opponent’s Active Pokemon is Poisoned."
					energyCost L, L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case TOXTRICITY_VMAX_71:
      return evolution (this, from:"Toxtricity V", hp:HP320, type:L, retreatCost:2) {
				move "Giganto Riot", {
					text "160+ damage. This attack does 80 more damage if your opponent’s Active Pokemon is Poisoned."
					energyCost L, L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case PINCURCHIN_V_72:
      return basic (this, hp:HP170, type:L, retreatCost:2) {
				bwAbility "Counterattack Crackle", {
					text "If this Pokemon is your Active Pokemon and is damaged by an opponent’s attack, flip 3 coins. For each heads, put 3 damage counters on the Attacking Pokemon."
					actionA {
					}
				}
				move "Sparking Attack", {
					text "120 damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MORPEKO_73:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
				move "Torment", {
					text "20 damage. Choose 1 of your opponent’s Active Pokemon’s attacks. The Defending Pokemon can’t use that attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Spark", {
					text "50 damage. This attack does 20 damage to 1 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case CLEFAIRY_74:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
				move "Glowing Finger", {
					text "Your opponent’s Active Pokemon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Magical Shot", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case CLEFABLE_75:
      return evolution (this, from:"Clefairy", hp:HP110, type:P, retreatCost:1) {
				bwAbility "Playful", {
					text "Once during your turn, when you play this card from your hand to evolve a Pokemon, you may choose an Energy attached to your opponent’s Active Pokemon and return it to the top of your opponent’s deck."
					actionA {
					}
				}
				move "Moon Kick", {
					text "60 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case NATU_76:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Me First", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case XATU_77:
      return evolution (this, from:"Natu", hp:HP120, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Energy Warp", {
					text "Move an Energy from 1 of your opponent’s Benched Pokemon to their Active Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Psychic", {
					text "10+ damage. This attack does 30 more damage for each Energy attached to the opponent’s Active Pokemon."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_CORSOLA_78:
      return basic (this, hp:HP080, type:P, retreatCost:null) {
				resistance F, MINUS20
				move "Cursed Droplets", {
					text "Put 3 pistachios on your opponent’s Pokemon in any way you like."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_CURSOLA_79:
      return evolution (this, from:"Galarian Corsola", hp:HP100, type:P, retreatCost:2) {
				resistance F, MINUS20
				bwAbility "Perish Body", {
					text "If this Pokemon is your Active Pokemon and is Knocked Out by damage from an opponent’s attack, flip a coin. If heads, the Attacking Pokemon is Knocked Out."
					actionA {
					}
				}
				move "Corner", {
					text "60 damage. The Defending Pokemon can’t retreat during your opponent’s next turn."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case SIGILYPH_80:
      return basic (this, hp:HP110, type:P, retreatCost:1) {
				resistance F, MINUS20
				bwAbility "Strikes Back", {
					text "If this Pokemon is your Active Pokemon and is damaged by an opponent’s attack, place 3 damage counters on the attacking Pokemon."
					actionA {
					}
				}
				move "Psychic Damage", {
					text "Does 30 damage plus 10 damage for each damage counter on the opponent’s Active Pokemon."
					energyCost P, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SANDYGAST_81:
      return basic (this, hp:HP080, type:P, retreatCost:3) {
				resistance F, MINUS20
				move "Sneaky Placement", {
					text "Put a damage counter on 1 of your opponent’s Pokemon."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case PALOSSAND_82:
      return evolution (this, from:"Sandygast", hp:HP140, type:P, retreatCost:4) {
				resistance F, MINUS20
				move "Sand Burial", {
					text "Discard a card from the top of your opponent’s deck. If this Pokemon has Cursed Shovel attached to it, discard 2 more cards."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Super Absorption", {
					text "90 damage. Heal 30 damage from this Pokemon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
			};
      case HATTENA_83:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Find a Friend", {
					text "Search your deck for a Pokemon, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Psychic Shot", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case HATTREM_84:
      return evolution (this, from:"Hattena", hp:HP080, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Calm Mind", {
					text "Heal 30 damage from this Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Brutal Swing", {
					text "30 damage. Flip a coin, If heads, this attack does 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case HATTERENE_85:
      return evolution (this, from:"Hattrem", hp:HP150, type:P, retreatCost:2) {
				resistance F, MINUS20
				bwAbility "Mind Hat", {
					text "Once during your turn, you may have each player discard 1 card from their hand. (Your opponent discards first. If either player has no cards in their hand, that player does not discard.)"
					actionA {
					}
				}
				move "Regretful Droplets", {
					text "Put damage counters on your opponent’s Active Pokemon equal to the number of Pokemon in your discard pile."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MILCERY_86:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
				move "Aromatherapy", {
					text "Heal 10 damage from each of your Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case ALCREMIE_87:
      return evolution (this, from:"Milcery", hp:HP110, type:P, retreatCost:1) {
				move "Decorate", {
					text "Attach any number of Basic Energy from your hand to your Pokemon in any way you like."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Draining Kiss", {
					text "50 damage. Heal 30 damage from this Pokemon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case INDEEDEE_88:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Refresh Time", {
					text "Heal 30 damage from to each of your Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Psybeam", {
					text "30 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case DREEPY_89:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Quick Attack", {
					text "10 damage. Flip a coin. If heads, this attack does 10 more damage."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case DRAKLOAK_90:
      return evolution (this, from:"Dreepy", hp:HP090, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Call Forth", {
					text "Search your deck for a Dreepy and put it on your Bench. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Bite", {
					text "40 damage. "
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case DRAGAPULT_91:
      return evolution (this, from:"Drakloak", hp:HP150, type:P, retreatCost:0) {
				resistance F, MINUS20
				bwAbility "Infiltrator", {
					text "If this Pokemon would be damaged by an attack, flip a coin. If heads, prevent all damage done to this Pokemon."
					actionA {
					}
				}
				move "Ghost Dive", {
					text "120 damage. Put 3 damage counters on your opponent’s Benched Pokemon in any way you like."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case DRAGAPULT_V_92:
      return basic (this, hp:HP210, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Bite", {
					text "30 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Assault Jet", {
					text "60+ damage. If this Pokemon was on your Bench and became your Active Pokemon during this turn, this attack does 80 more damage."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case DRAGAPULT_VMAX_93:
      return evolution (this, from:"Dragapult V", hp:HP320, type:P, retreatCost:1) {
				resistance F, MINUS20
				move "Shred", {
					text "60 damage. This attack’s damage isn’t affected by effects on your opponents Active Pokemon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Giganto Phantom", {
					text "130 damage. Put 5 damage counters on your opponent’s Benched Pokemon in any way you like."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_FARFETCH_D_94:
      return basic (this, hp:HP080, type:F, retreatCost:1) {
				move "Rock Smash", {
					text "10 damage. Flip a coin, if heads this attack does an additional 30 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Pierce", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case GALARIAN_SIRFETCH_D_95:
      return evolution (this, from:"Galarian Farfetch’d", hp:HP130, type:F, retreatCost:2) {
				move "Pierce", {
					text "40 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Meteor Assault", {
					text "180 damage. This Pokemon can’t use Meteor Assault again as long as it is the Active Pokemon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case NOSEPASS_96:
      return basic (this, hp:HP080, type:F, retreatCost:3) {
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Rolling Tackle", {
					text "50 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case MEDITITE_97:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
				move "Meditate", {
					text "10 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case MEDICHAM_98:
      return evolution (this, from:"Meditite", hp:HP110, type:F, retreatCost:1) {
				move "Yoga Kick", {
					text "40 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Psychic", {
					text "60+ damage. This attack does 20 more damage for each Energy attached to your opponent’s Active Pokemon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BARBOACH_99:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
				move "Razor Fin", {
					text "10 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case WHISCASH_100:
      return evolution (this, from:"Barboach", hp:HP140, type:F, retreatCost:3) {
				bwAbility "Submerge", {
					text "As long as this Pokemon is on your Bench, it takes no damage from attacks."
					actionA {
					}
				}
				move "Earthquake", {
					text "140 damage. This attack does 20 damage to each of your Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost F, F
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_YAMASK_101:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
				move "Reckless Charge", {
					text "50 damage. This Pokemon does 30 damage to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case GALARIAN_RUNERIGUS_102:
      return evolution (this, from:"Yamask", hp:HP100, type:F, retreatCost:2) {
				move "Grudge Distribution", {
					text "Count the number of damage counters on this Galarian Runerigus. Put twice as many damage counters on your opponent’s Active Pokemon."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Mad Hammer", {
					text "120 damage. This Pokemon does 30 damage to itself."
					energyCost F, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BINACLE_103:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
				move "Double Chop", {
					text "Flip 2 coins. This attack does 50 damage times the number of heads."
					energyCost F, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BARBARACLE_104:
      return evolution (this, from:"Binacle", hp:HP120, type:F, retreatCost:3) {
				move "Rock Hurl", {
					text "50 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Hand Press", {
					text "80 damage. If you have more cards in your hand than your opponent, this attack does 80 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case ROLYCOLY_105:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
				move "Ram", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case CARKOAL_106:
      return evolution (this, from:"Rolycoly", hp:HP100, type:F, retreatCost:3) {
				move "Ram", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Heat Stamp", {
					text "60 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case COALOSSAL_107:
      return evolution (this, from:"Carkoal", hp:HP160, type:F, retreatCost:4) {
				bwAbility "Tar Generator", {
					text "Once during your turn, you may search your discard pile for up to 1 [R] Energy and 1 [F] Energy and attach them to your Pokemon in any way you like."
					actionA {
					}
				}
				move "Burning Avalanche", {
					text "130 damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SANDACONDA_V_108:
      return basic (this, hp:HP220, type:F, retreatCost:3) {
				move "Sand Crown", {
					text "30 damage. Attach a [F] Energy from your discard pile to this Pokemon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Sand Breath", {
					text "220 damage. Discard 2 Energy from this Pokemon."
					energyCost F, F, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case FALINKS_109:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
				move "Call For Family", {
					text "Search your deck for up to 2 Basic Pokemon and put them on your Bench. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Team Attack", {
					text "This attack does 30 damage for each Pokemon on your Bench with"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case FALINKS_V_110:
      return basic (this, hp:HP160, type:F, retreatCost:2) {
				bwAbility "Iron Defender", {
					text "As long as this Pokemon is in play, damage done to any of your Pokemon with Falinks in its name by your opponent’s atacks is reduced by 20."
					actionA {
					}
				}
				move "Giga Impact", {
					text "210 damage. This Pokemon can’t attack during your next turn."
					energyCost F, F, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case STONJOURNER_111:
      return basic (this, hp:HP140, type:F, retreatCost:4) {
				move "Mega Kick", {
					text "80 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				move "Power Press", {
					text "120+ damage. If you have 1 more Energy attached to this Pokemon (but not used to pay for this attack), this attack does 60 more damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case KOFFING_112:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
				move "Suffocating Gas", {
					text "10 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case GALARIAN_WEEZING_113:
      return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:3) {
				bwAbility "Chemical Change Gas", {
					text "As long as this Pokemon is your Active Pokemon, each of your opponent’s Pokemon has no Abilities (excluding Chemical Change Gas)."
					actionA {
					}
				}
				move "Severe Poison", {
					text "Your opponent’s Active Pokemon is now Poisoned. Put 4 damage counters for Poison between turns."
					energyCost D
					attackRequirement {}
					onAttack {

					}
				}
			};
      case STUNKY_114:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
				move "Poison Gas", {
					text "10 damage. Your opponent’s Active Pokemon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case SKUNTANK_115:
      return evolution (this, from:"Stunky", hp:HP120, type:D, retreatCost:3) {
				move "Slash", {
					text "50 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Poison Circle", {
					text "80 damage. Your opponent’s Active Pokemon is now Poisoned. The Defending Pokemon can’t retreat during your opponent’s next turn."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case SPIRITOMB_116:
      return basic (this, hp:HP060, type:D, retreatCost:2) {
				move "Grudge Split", {
					text "Discard 1 card from the top of each player’s deck."
					energyCost D
					attackRequirement {}
					onAttack {

					}
				}
				move "Regretful Droplets", {
					text "Put damage counters on your opponent’s Active Pokemon equal to the number of Pokemon in your discard pile."
					energyCost D, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case TRUBBISH_117:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
				move "Venom Shock", {
					text "20+ damage. If your opponent’s Active Pokemon is Poisoned, this attack does 50 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GARBODOR_118:
      return evolution (this, from:"Trubbish", hp:HP120, type:D, retreatCost:2) {
				bwAbility "Poison Pool", {
					text "Once during your turn, if there is a Stadium in play, you may leave your opponents Active Pokemon Poisoned."
					actionA {
					}
				}
				move "Sludge Bomb", {
					text "80 damage. "
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case VULLABY_119:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
				resistance F, MINUS20
				move "Pluck", {
					text "10 damage. Before doing damage, discard all Pokemon Tools attached to your opponent’s Active Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case MANDIBUZZ_120:
      return evolution (this, from:"Vullaby", hp:HP120, type:D, retreatCost:2) {
				resistance F, MINUS20
				move "Bone Rush", {
					text "Flip a coin until you get tails. This attack does 30 damage times the number of heads."
					energyCost D
					attackRequirement {}
					onAttack {

					}
				}
				move "Blindside", {
					text "This attack does 100 damage to 1 of your opponent’s Pokemon that already has damage counters on it. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost D, D
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MALAMAR_V_121:
      return basic (this, hp:HP210, type:D, retreatCost:2) {
				move "Drag Off", {
					text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. This attack does 30 damage to the new Active Pokemon."
					energyCost D, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Brain Shake", {
					text "130 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost D, D, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case MALAMAR_VMAX_122:
      return evolution (this, from:"Malamar V", hp:HP310, type:D, retreatCost:2) {
				move "Giganto Jammer", {
					text "180 damage. Your opponent reveals their hand. Choose 1 card that you find there and put it on the bottom of your opponent’s deck.When your Pokemon VMAX is Knocked Out, your opponent takes 3 Prize cards."
					energyCost D, D, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case IMPIDIMP_123:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
				move "Beat", {
					text "10 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Stampede", {
					text "20 damage. "
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case MORGREM_124:
      return evolution (this, from:"Impidimp", hp:HP090, type:D, retreatCost:2) {
				move "Bite", {
					text "30 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "False Surrender", {
					text "60 damage. This damage isn’t affected by any effects on your opponent’s Active Pokemon."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case GRIMMSNARL_125:
      return evolution (this, from:"Morgrem", hp:HP170, type:D, retreatCost:3) {
				bwAbility "Dark Limitation", {
					text "As long as this Pokemon is your Active Pokemon, your opponent’s Active Pokemon pays [C] more to use its attacks."
					actionA {
					}
				}
				move "Energy Press", {
					text "100+ damage. This attack does 30 more damage for each Energy attached to your opponent’s Active Pokemon."
					energyCost D, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case GALARIAN_MEOWTH_126:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
				resistance G, MINUS20
				bwAbility "Evolution Roar", {
					text "Once during your turn (before your attack), you may discard 2 cards from your hand. If you do, search your deck for 1 Galarian Perrserker, reveal it, and put it into your hand. Then, shuffle your deck."
					actionA {
					}
				}
				move "Scratch", {
					text "20 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case GALARIAN_PERRSERKER_127:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
				resistance G, MINUS20
				move "Slash", {
					text "50 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Claw Daggers", {
					text "80x damage. Flip 3 coins. This attack does 80 damage for each heads."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SCIZOR_128:
      return evolution (this, from:"Scyther", hp:HP130, type:M, retreatCost:1) {
				resistance G, MINUS20
				move "Raid", {
					text "30+ damage. If this Pokemon evolved from Scyther during your turn, this attack does 90 more damage."
					energyCost M
					attackRequirement {}
					onAttack {

					}
				}
				move "Guard Claw", {
					text "90 damage. During your opponent’s next turn, any damage done to this Pokemon by attacks is reduced by 30."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
			};
      case BRONZOR_129:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
				resistance G, MINUS20
				move "Ram", {
					text "10 damage. "
					energyCost M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Speed Flight", {
					text "20 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case BRONZONG_130:
      return evolution (this, from:"Bronzor", hp:HP130, type:M, retreatCost:3) {
				resistance G, MINUS20
				move "Smack", {
					text "30 damage. "
					energyCost M
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Gyro Ball", {
					text "70 damage. Switch this Pokemon with 1 of your Benched Pokemon. Then, your opponent switches their Active Pokemon with 1 of their Benched Pokemon."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case PROBOPASS_131:
      return evolution (this, from:"Nosepass", hp:HP140, type:M, retreatCost:4) {
				resistance G, MINUS20
				move "Gravity Drop", {
					text "10+ damage. This attack does 30 more damage for each [C] in your opponent’s Active Pokemon’s Retreat Cost."
					energyCost M
					attackRequirement {}
					onAttack {

					}
				}
				move "Heavy Impact", {
					text "120 damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case DURANT_132:
      return basic (this, hp:HP100, type:M, retreatCost:1) {
				resistance G, MINUS20
				move "Gather Bait", {
					text "For each Energy attached to this Pokemon, search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Metal Claw", {
					text "80 damage. "
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case HONEDGE_133:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
				resistance G, MINUS20
				move "Slicing Blade", {
					text "30 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case DOUBLADE_134:
      return evolution (this, from:"Honedge", hp:HP090, type:M, retreatCost:2) {
				resistance G, MINUS20
				move "Slash", {
					text "30 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Double Slash", {
					text "Flip 2 coins. This attack does 80 damage times the number of heads."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case AEGISLASH_135:
      return evolution (this, from:"Doublade", hp:HP140, type:M, retreatCost:3) {
				resistance G, MINUS20
				bwAbility "Big Shield", {
					text "As long as this Pokemon is in play, any damage done to your Pokemon by opponent’s attacks is reduced by 30. You can’t use more than 1 Big Shield Ability."
					actionA {
					}
				}
				move "Power Edge", {
					text "130 damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case COPPERAJAH_V_136:
      return basic (this, hp:HP220, type:M, retreatCost:4) {
				move "Adamantine Press", {
					text "90 damage. During your opponent’s next turn, this Pokemon takes 30 less damage from attacks."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				move "Wrack Down", {
					text "180 damage.Weakness"
					energyCost M, M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case COPPERAJAH_VMAX_137:
      return evolution (this, from:"Copperajah V", hp:HP340, type:M, retreatCost:4) {
				resistance G, MINUS20
				move "Dangerous Nose", {
					text "100+ damage. If your opponent’s Active Pokemon is a Basic Pokemon, this attack does 100 more damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Giant Hammer", {
					text "240 damage."
					energyCost M, M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case DURALUDON_138:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
				resistance G, MINUS20
				move "Metal Sharpener", {
					text "30 damage. Attach a [M] Energy from your discard pile to 1 of your Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Power Beam", {
					text "110 damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ZACIAN_139:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
				resistance G, MINUS20
				move "Energy Stream", {
					text "30 damage. Attach a [M] Energy from your discard pile to 1 of your Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Smashing Edge", {
					text "120 damage. Flip a coin. If tails, discard 2 Energy from this Pokemon"
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ZAMAZENTA_140:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
				resistance G, MINUS20
				move "Guard Press", {
					text "During your opponent''s next turn, this Pokemon takes 20 less damage from attacks (after applying Weakness and Resistance)."
					energyCost M, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Power Rush", {
					text "120 damage. Flip a coin. If tails, during your next turn, this Pokemon can''t attack."
					energyCost M, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SNORLAX_141:
      return basic (this, hp:HP150, type:C, retreatCost:4) {
				move "Collect", {
					text "Draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Collapse", {
					text "120 damage. This Pokemon is now Asleep."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case CHATOT_142:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
				resistance F, MINUS20
				bwAbility "Lucky Match", {
					text "Once during your turn, when you play this card from your hand onto your Bench, you may flip a coin. If heads, choose a Supporter card from your discard pile, reveal it, and put it into your hand."
					actionA {
					}
				}
				move "Glide", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case PIDOVE_143:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
				resistance F, MINUS20
				move "Chirp", {
					text "Search your deck for up to 2 Pokemon with a [F] Resistance, reveal them, and put them into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Sharp Wing", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case TRANQUIL_144:
      return evolution (this, from:"Pidove", hp:HP080, type:C, retreatCost:1) {
				resistance F, MINUS20
				move "Sharp Wing", {
					text "40 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Gust", {
					text "60 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case UNFEZANT_145:
      return evolution (this, from:"Tranquil", hp:HP150, type:C, retreatCost:1) {
				resistance F, MINUS20
				move "Daunt", {
					text "50 damage. The attacks of the Defending Pokemon do 50 less damage during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Air Slash", {
					text "150 damage. Discard an Energy from this Pokemon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BUNNELBY_146:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
				move "Burrow", {
					text "Discard 1 card from the top of your opponent’s deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Headbutt Bounce", {
					text "50 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case DIGGERSBY_147:
      return evolution (this, from:"Bunnelby", hp:HP130, type:C, retreatCost:3) {
				move "Mountain Toss Rush", {
					text "Discard up to 6 cards from the top of your deck. This attack does 30 damage for each card discarded in this way."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Headbutt Bounce", {
					text "110 damage."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case HAWLUCHA_148:
      return basic (this, hp:HP090, type:C, retreatCost:1) {
				resistance F, MINUS20
				move "Windfall", {
					text "Shuffle your hand into your deck. Then, draw 5 cards."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Speed Attack", {
					text "30 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case STUFFUL_149:
      return basic (this, hp:HP080, type:C, retreatCost:2) {
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Jump On", {
					text "40 damage. Flip a coin. If heads, this attack does 40 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case BEWEAR_150:
      return evolution (this, from:"Stufful", hp:HP140, type:C, retreatCost:3) {
				move "Hammer Arm", {
					text "90 damage. Discard a card from the top of your opponent’s deck."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				move "Big Throw", {
					text "Flip a coin. If heads, toss your opponent across the room and discard your opponent’s Active Pokemon and all cards attached to it."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SKWOVET_151:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Bite", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case GREEDENT_152:
      return evolution (this, from:"Peter Griffin", hp:HP120, type:C, retreatCost:1) {
				bwAbility "Greedy Tail", {
					text "Once during your turn, you may search your deck for a Pokemon Tool card, reveal it, and put it into your hand. Then, shuffle your deck."
					actionA {
					}
				}
				move "Tail Slap", {
					text "80 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case DUBWOOL_V_153:
      return basic (this, hp:HP210, type:C, retreatCost:2) {
				bwAbility "Soft Wool", {
					text "Damage done to this Pokemon by attacks is reduced by 30."
					actionA {
					}
				}
				move "Revenge Burst", {
					text "120+ damage. This attack does 30 more damage for each Prize card your opponent has taken."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BOSS_S_ORDERS_154:
      return supporter (this) {
				text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case BURNING_SCARF_155:
      return pokemonTool (this) {
				text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. If the [R] Pokemon this card is attached to is your Active Pokemon and is damaged by an opponent’s attack, the Attacking Pokemon is now Burned. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
      case CURSED_SHOVEL_156:
      return pokemonTool (this) {
				text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. If the Pokemon this Tool is attached to is Knocked Out by damage from an opponent’s attack, discard the top 2 cards of your opponent’s deck. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
      case DAN_157:
      return supporter (this) {
				text "Draw 2 cards. Play Rock-Paper-Scissors with your opponent. If you win, draw 2 more cards. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case FULL_BUCKET_158:
      return itemCard (this) {
				text "Search your deck for 2 [W] Energy, reveal them, and put them into your hand. Then, shuffle your deck. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case FULL_HEAL_159:
      return itemCard (this) {
				text "Remove all Special Conditions from your Active Pokemon. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case GALAR_MINE_160:
      return basicTrainer (this) {
				text "Stadium The Retreat Cost of each Active Pokemon (both yours and your opponent’s) is [C][C] more. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				playRequirement{
				}
			};
      case MILO_161:
      return supporter (this) {
				text "Discard up to 2 cards from your hand. Then draw twice as many cards as you discarded. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case NUGGET_162:
      return itemCard (this) {
				text "Play this card when you draw it from your deck at the start of your turn (before putting it into your hand). Draw 3 cards. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case OLEANA_163:
      return supporter (this) {
				text "Discard 2 cards from your hand in order to play this card. Your opponent reveals their hand. Choose a Trainer you find there and put it at the bottom of your opponent’s deck. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKEBALL_164:
      return itemCard (this) {
				text "Flip a coin. If heads, search your deck for a Pokemon, reveal it, and put it into your hand. Then, shuffle your deck. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case SCOOP_UP_NET_165:
      return itemCard (this) {
				text "Put 1 of your Pokemon (excluding Pokemon V/GX) into your hand. (Discard all cards attached to that Pokemon.) You may play as many Item cards during your turn as you like (before your attack). (Note -  The term “Pokemon V” includes both Pokemon V and Pokemon VMAX.)"
				onPlay {
				}
				playRequirement{
				}
			};
      case SKYLA_166:
      return supporter (this) {
				text "Search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case SONIA_167:
      return supporter (this) {
				text "Search your deck for up to 2 Basic Pokemon or up to 2 Basic Energy, reveal them, and put them into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case TOOL_SCRAPPER_168:
      return itemCard (this) {
				text "Discard up to 2 Pokemon Tools from either player’s Pokemon. You may play as many Item cards during your turn as you like (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case TRAINING_COURT_169:
      return basicTrainer (this) {
				text "Stadium Once during each player’s turn, that player may choose a basic Energy card from their discard pile, reveal it, and put it into their hand. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				playRequirement{
				}
			};
      case TURRFIELD_170:
      return itemCard (this) {
				text "Once during each player’s turn, that player may search their deck for a [G] Evolution Pokemon, reveal it, and put it into their hand. Then, that player shuffles their deck. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				playRequirement{
				}
			};
      case CAPTURE_ENERGY_171:
      return specialEnergy (this, [[C]]) {
				text "This card provides [C] Energy only while attached to a Pokemon. When attaching this card from your hand to 1 of your Pokemon, search your deck for a Basic Pokemon and put it on your Bench. Then, shuffle your deck."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case HORROR_PSYCHIC_ENERGY_172:
      return specialEnergy (this, [[C]]) {
				text "This card provides 1 [P] Energy while it’s attached to a Pokemon. When the [P] Pokemon this card is attached to is your Active Pokemon and is damaged by an opponents attack, put 2 damage counters on the Attacking Pokemon."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case SPEED_LIGHTNING_ENERGY_173:
      return specialEnergy (this, [[C]]) {
				text "This card provides 1 [L] Energy while it’s attached to a Pokemon. When you attach this card from your hand to an [L] Pokemon, draw 2 cards"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case TWIN_ENERGY_174:
      return specialEnergy (this, [[C]]) {
				text "This card provides 2 [C] Energy. If this card is attached to a Pokemon V or Pokemon GX, this card provides 1 [C] Energy instead."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case RILLABOOM_V_175:
      return copy (RILLABOOM_V_17, this);
      case ELDEGOSS_V_176:
      return copy (ELDEGOSS_V_19, this);
      case NINETALES_V_177:
      return copy (NINETALES_V_26, this);
      case CINDERACE_V_178:
      return copy (CINDERACE_V_35, this);
      case MILOTIC_V_179:
      return copy (MILOTIC_V_43, this);
      case INTELEON_V_180:
      return copy (INTELEON_V_49, this);
      case BOLTUND_V_181:
      return copy (BOLTUND_V_67, this);
      case TOXTRICITY_V_182:
      return copy (TOXTRICITY_V_70, this);
      case DRAGAPULT_V_183:
      return copy (DRAGAPULT_V_92, this);
      case SANDACONDA_V_184:
      return copy (SANDACONDA_V_108, this);
      case FALINKS_V_185:
      return copy (FALINKS_V_110, this);
      case MALAMAR_V_186:
      return copy (MALAMAR_V_121, this);
      case COPPERAJAH_V_187:
      return copy (COPPERAJAH_V_136, this);
      case DUBWOOL_V_188:
      return copy (DUBWOOL_V_153, this);
      case BOSS_S_ORDERS_189:
      return copy (BOSS_S_ORDERS_154, this);
      case MILO_190:
      return copy (MILO_161, this);
      case OLEANA_191:
      return copy (OLEANA_163, this);
      case SONIA_192:
      return copy (SONIA_167, this);
      case RILLABOOM_VMAX_193:
      return copy (RILLABOOM_VMAX_18, this);
      case CINDERACE_VMAX_194:
      return copy (CINDERACE_VMAX_36, this);
      case INTELEON_VMAX_195:
      return copy (INTELEON_VMAX_50, this);
      case TOXTRICITY_VMAX_196:
      return copy (TOXTRICITY_VMAX_71, this);
      case DRAGAPULT_VMAX_197:
      return copy (DRAGAPULT_VMAX_93, this);
      case MALAMAR_VMAX_198:
      return copy (MALAMAR_VMAX_122, this);
      case COPPERAJAH_VMAX_199:
      return copy (COPPERAJAH_VMAX_137, this);
      case BOSS_S_ORDERS_200:
      return copy (BOSS_S_ORDERS_154, this);
      case MILO_201:
      return copy (MILO_161, this);
      case OLEANA_202:
      return copy (OLEANA_163, this);
      case SONIA_203:
      return copy (SONIA_167, this);
      case FROSMOTH_204:
      return evolution (this, from:"Snom", hp:HP090, type:W, retreatCost:2) {
				bwAbility "Ice Dance", {
					text "As often as you like during your turn (before your attack), you may attach a [W] Energy card from your hand to 1 of your Benched [W] Pokemon."
					actionA {
					}
				}
				move "Aurora Beam", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case PERRSERKER_205:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
				resistance G, MINUS20
				bwAbility "Steely Spirit", {
					text "The attacks of your [M] Pokemon do 20 more damage to your opponent’s Active Pokemon."
					actionA {
					}
				}
				move "Metal Claw", {
					text "70 damage. "
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case GIANT_CHARM_206:
      return pokemonTool (this) {
				text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. The Pokemon this card is attached to gets +30 HP. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
      case SCOOP_UP_NET_207:
      return itemCard (this) {
				text "Put 1 of your Pokemon (excluding Pokemon V/GX) into your hand. (Discard all cards attached to that Pokemon.) You may play as many Item cards during your turn as you like (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
      case TOOL_SCRAPPER_208:
      return copy (TOOL_SCRAPPER_168, this);
      case TWIN_ENERGY_209:
      return copy (TWIN_ENERGY_174, this);
        default:
      return null;
    }
  }
}