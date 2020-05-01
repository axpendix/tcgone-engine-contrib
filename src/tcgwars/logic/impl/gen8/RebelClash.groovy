package tcgwars.logic.impl.gen8;

import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen4.HeartgoldSoulsilver;
import tcgwars.logic.impl.gen8.SwordShield;

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
 * @author lithogenn@gmail.com
 */
public enum RebelClash implements LogicCardInfo {

  CATERPIE_1 ("Caterpie", 1, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  METAPOD_2 ("Metapod", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BUTTERFREE_3 ("Butterfree", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SCYTHER_4 ("Scyther", 4, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHUCKLE_5 ("Shuckle", 6, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  HERACROSS_6 ("Heracross", 5, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
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
  GALARIAN_MR_MIME_37 ("Galarian Mr. Mime", 37, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_38 ("Galarian Mr. Rime", 38, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
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
  TRANQUILL_144 ("Tranquill", 144, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
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
  TWIN_ENERGY_209 ("Twin Energy", 209, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]);

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
        weakness R
        bwAbility "Adaptive Evolution", {
          text "This Pokemon can evolve during your first turn or the turn you play it."
          delayedA {
            before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
              prevent()
            }
          }
        }
        move "Gnaw", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case METAPOD_2:
      return evolution (this, from:"Caterpie", hp:HP080, type:G, retreatCost:3) {
        weakness R
        bwAbility "Adaptive Evolution", {
          text "This Pokemon can evolve during your first turn or the turn you play it."
          delayedA {
            before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
              prevent()
            }
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BUTTERFREE_3:
      return evolution (this, from:"Metapod", hp:HP140, type:G, retreatCost:1) {
        weakness R
        move "Panic Poison", {
          text "30 damage. Your opponent’s Active Pokemon is now Poisoned, Burned, and Confused."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
            apply POISONED
            apply BURNED
            apply CONFUSED
          }
        }
        move "Cutting Wind", {
          text "80 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case SCYTHER_4:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Swords Dance", {
          text "During your next turn, the base damage of this Pokemon’s Blinding Scythe is increased by 70."
          energyCost C
          attackRequirement {}
          onAttack {
            increasedBaseDamageNextTurn("Blinding Scythe", hp(70))
          }
        }
        move "Blinding Scythe", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHUCKLE_5:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Berry Picking", {
          text "Shuffle 5 basic Energy cards from your discard pile into your deck."
          energyCost C
          attackRequirement {
            assert my.discard.filterByType(BASIC_ENERGY) : "Discard has no Basic Energies"
          }
          onAttack {
            def energies = my.discard.filterByType(BASIC_ENERGY).select(min: 0, max: 5, "Select up to 5 Basic Energy cards to shuffle into your deck.")
            energies.moveTo(my.deck)
            if (energies) {
              shuffleDeck()
            }
          }
        }
        move "Bind", {
          text "50 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
            flip { apply PARALYZED }
          }
        }
      };
      case HERACROSS_6:
      return basic (this, hp:HP130, type:G, retreatCost:2) {
        weakness R
        move "Push Down", {
          text "30 damage. Your opponent switches their Active Pokemon with 1 of their Benched Pokemon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            whirlwind()
          }
        }
        move "Superpowered Horns", {
          text "110 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case LOTAD_7:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Mini Drain", {
          text "10 damage. Heal 10 damage from this Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            heal 10, self
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LOMBRE_8:
      return evolution (this, from:"Lotad", hp:HP090, type:G, retreatCost:1) {
        weakness R
        bwAbility "Top Entry", {
          text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
          globalAbility {Card thisCard->
            delayed {
              after DRAW_CARD, {
                if (ef.card.is(thisCard) && bg.em().currentEffectStack.find{it instanceof BeginTurn} && thisCard.player.pbg.bench.notFull && checkGlobalAbility(thisCard) && confirm("Activate Lombre's Top Entry?", thisCard.player)) {
                  thisCard.player.pbg.hand.remove(thisCard)
                  bc "Lombre's Top Entry activated"
                  benchPCS(thisCard)
                }
              }
            }
          }
        }
        move "Fury Swipes", {
          text "40x damage. Flip 3 coins. This attack does 40 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 40 }
          }
        }
      };
      case LUDICOLO_9:
      return evolution (this, from:"Lombre", hp:HP160, type:G, retreatCost:2) {
        weakness R
        move "Spirited Rushdown", {
          text "60x damage. This attack does 60 damage for each Prize card you’ve taken."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60*my.prizeCardSet.takenCount
          }
        }
        move "Mega Drain", {
          text "120 damage. Heal 30 damage from this Pokemon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 120
            heal 30, self
          }
        }
      };
      case SURSKIT_10:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Agility", {
          text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case MASQUERAIN_11:
      return evolution (this, from:"Surskit", hp:HP090, type:G, retreatCost:1) {
        weakness R
        move "Threatening Pattern", {
          text "30 damage. Your opponent can’t attach Energy from their hand to the Defending Pokemon during their next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            delayed{
              before ATTACH_ENERGY, self.owner.opposite.pbg.active, {
                if(ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite && ef.resolvedTarget.active) {
                  wcu "Pattern Menace prevents attaching energy"
                  prevent()
                }
              }
              unregisterAfter 2
              after SWITCH, defending, {unregister()}
              after EVOLVE, defending, {unregister()}
            }
          }
        }
        move "U-turn", {
          text "40 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C, C
          onAttack{
            damage 40
            afterDamage {
              if(my.bench){
                sw self, my.bench.select("Choose your new active Pokémon.")
              }
            }
          }
        }
      };
      case SNOVER_12:
      return basic (this, hp:HP090, type:G, retreatCost:3) {
        weakness R
        move "Beat", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Razor Leaf", {
          text "50 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ABOMASNOW_13:
      return evolution (this, from:"Snover", hp:HP140, type:G, retreatCost:3) {
        weakness R
        move "Soothing Scent", {
          text "80 damage. Your opponent’s Active Pokemon is now Asleep."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 80
            apply ASLEEP
          }
        }
        move "Megaton Lariat", {
          text "140 damage."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case PHANTUMP_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Dark Guidance", {
          text "Choose a Basic Pokemon from your discard pile and play it onto your Bench."
          energyCost C
          attackRequirement {
            assert bench.notFull : "Bench full"
            assert my.discard.filterByType(BASIC) : "Discard has no Basics"
          }
          onAttack {
            def card = my.discard.filterByType(BASIC).select("Choose a Basic Pokémon to put onto your Bench").first()
            my.discard.remove(card)
            benchPCS(card)
          }
        }
        move "Seed Bomb", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TREVENANT_15:
      return evolution (this, from:"Phantump", hp:HP130, type:G, retreatCost:3) {
        weakness R
        move "Seed Bomb", {
          text "40 damage."
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
            damage 120
            cantRetreat(defending)
          }
        }
      };
      case GRUBBIN_16:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case RILLABOOM_V_17:
      return basic (this, hp:HP220, type:G, retreatCost:3) {
        weakness R
        move "Forest Feast", {
          text "Search your deck for up to 2 Basic [G] Pokemon and put them onto your Bench. Then, shuffle your deck."
          energyCost G
          callForFamily(basic:true, 2, delegate)
        }
        move "Wood Hammer", {
          text "220 damage. This Pokemon also does 30 damage to itself."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 220
            damage 30, self
          }
        }
      };
      case RILLABOOM_VMAX_18:
      return evolution (this, from:"Rillaboom V", hp:HP330, type:G, retreatCost:3) {
        weakness R
        move "Scratch", {
          text "50 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Max Beating", {
          text "130+ damage. You may discard up to 3 [G] Energy from this Pokemon. This attack does 50 more damage for each Energy you discarded in this way."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            def grassEnergies = self.cards.filterByEnergyType(G).select(min: 0, max: 3, "Discard [G]")
            damage 130+grassEnergies.size()*50
            grassEnergies.discard()
          }
        }
      };
      case ELDEGOSS_V_19:
      return basic (this, hp:HP180, type:G, retreatCost:1) {
        weakness R
        bwAbility "Happy March", {
          text "Once during your turn, when you play this card from your hand to your Bench, you may put a Supporter card from your discard pile into your hand."
          onActivate {
            if (it==PLAY_FROM_HAND && my.discard.filterByType(SUPPORTER) && confirm("Use Happy March?")) {
              powerUsed()
              my.discard.filterByType(SUPPORTER).select().moveTo(my.hand)
            }
          }
        }
        move "Float Up", {
          text "50 damage. You may shuffle this Pokemon and all cards attached to it into your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
            afterDamage {
              if (confirm("Shuffle this Pokemon and all cards back into deck?")) {
                self.cards.moveTo(my.deck)
                shuffleDeck()
                removePCS(self)
              }
            }
          }
        }
      };
      case APPLIN_20:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Continuous Tumble", {
          text "10+ damage. Flip a coin until you get tails. This attack does 30 more damage times the number of heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 30 }
          }
        }
      };
      case APPLIN_21:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Withdraw", {
          text "Flip a coin. If heads, prevent all damage from attacks done to this Pokemon during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
      };
      case FLAPPLE_22:
      return evolution (this, from:"Applin", hp:HP080, type:G, retreatCost:1) {
        weakness R
        bwAbility "Apple Drop", {
          text "Once during your turn, you may put 2 damage counters on 1 of your opponent’s Pokemon. Then, shuffle this Pokemon and all cards attached to it into your deck."
          actionA {
            if(confirm("Use Apple Drop?")){
              checkLastTurn()
              powerUsed()
              directDamage(20, opp.all.select())
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
            }
          }
        }
        move "Acid Spray", {
          text "60 damage. Flip a coin. If heads, discard an Energy from your opponent’s Active Pokemon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60

            afterDamage {
              flip { discardDefendingEnergy() }
            }
          }
        }
      };
      case APPLETUN_23:
      return evolution (this, from:"Applin", hp:HP090, type:G, retreatCost:3) {
        weakness R
        bwAbility "Delicious Aroma", {
          text "Once during your turn, you may flip a coin. If heads, choose 1 of your opponent’s Benched Basic Pokemon and switch it with their Active Pokemon."
          actionA {
            checkLastTurn()
            assert opp.bench.findAll { it.basic } : "Opponent's Bench has no Basic Pokemon"
            powerUsed()
            flip{
              def pcs = opp.bench.findAll { it.basic}.select("New active")
              targeted (pcs, SRC_ABILITY) {
              sw(opp.active, pcs, SRC_ABILITY)
              }
            }
          }
        }
        move "Solar Beam", {
          text "70 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case VULPIX_24:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Confuse Ray", {
          text "Your opponent’s Active Pokemon is now Confused."
          energyCost R
          attackRequirement {}
          onAttack {
            apply CONFUSED
          }
        }
        move "Smash Kick", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NINETALES_25:
      return evolution (this, from:"Vulpix", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Hex", {
          text "30+ damage. If your opponent's Active Pokemon is affected by a Special Condition, this attack does 90 more damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
            if (defending.hasModernAbility()) {
              damage 90
            }
          }
        }
        move "Flickering Flames", {
          text "90 damage. Your opponent’s Active Pokemon is now Asleep."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 90
            apply ASLEEP
          }
        }
      };
      case NINETALES_V_26:
      return basic (this, hp:HP200, type:R, retreatCost:2) {
        weakness W
        move "Nine-Tailed Shapeshifter", {
          text "Choose 1 of your opponent’s Active Pokemon’s attacks and use it as this attack."
          energyCost R, C, C
          attackRequirement {
            assert opp.active.topPokemonCard.moves : "No moves to perform"
          }
          onAttack {
            def list = defending.topPokemonCard.moves
            def selected = choose(list, "Choose a non-GX attack to use.")
            bc "$selected was chosen"
            def bef = blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
            attack (selected as Move)
            bef.unregisterItself(bg().em())
          }
        }
        move "Flamethrower", {
          text "180 damage. Discard an Energy from this Pokemon."
          energyCost R, C, C, C
          attackRequirement {}
          onAttack {
            damage 180
            discardSelfEnergy(C)
          }
        }
      };
      case GROWLITHE_27:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Odor Sleuth", {
          text "Flip a coin. If heads, put a card from your discard pile into your hand."
          energyCost C
          attackRequirement {
            assert my.discard : "Discard is empty"
          }
          onAttack {
            flip {
              if (my.discard) my.discard.select().moveTo(my.hand)
            }
          }
        }
        move "Fire Claws", {
          text "60 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ARCANINE_28:
      return evolution (this, from:"Growlithe", hp:HP130, type:R, retreatCost:2) {
        weakness W
        bwAbility "Warming Up", {
          text "If this Pokemon has Burning Scarf attached to it, it get +100 HP."
          getterA (GET_FULL_HP, self) {h->
            if (self.cards.findAll { it.name == "Burning Scarf" }) {
              h.object += hp(100)
            }
          }
        }
        move "Fire Mane", {
          text "130 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case MAGMAR_29:
      return basic (this, hp:HP090, type:R, retreatCost:2) {
        weakness W
        move "Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Heat Breath", {
          text "20+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 30 }
          }
        }
      };
      case MAGMORTAR_30:
      return evolution (this, from:"Magmar", hp:HP140, type:R, retreatCost:3) {
        weakness W
        move "Burst Punch", {
          text "30 damage. Your opponent’s Active Pokemon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            apply BURNED
          }
        }
        move "Ground Burn", {
          text "80+ damage. Each player discards a card from the top of their deck. This attack does 100 more damage for each Energy card discarded in this way."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 80
            if (opp.deck) {
              if (opp.deck.subList(0,1).filterByType(ENERGY)) damage 100
              opp.deck.subList(0,1).discard()
            }
            if (my.deck) {
              if (my.deck.subList(0,1).filterByType(ENERGY)) damage 100
              my.deck.subList(0,1).discard()
            }
          }
        }
      };
      case LITWICK_31:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Scorch", {
          text "Your opponent’s Active Pokemon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            apply BURNED
          }
        }
      };
      case LAMPENT_32:
      return evolution (this, from:"Litwick", hp:HP080, type:R, retreatCost:1) {
        weakness W
        bwAbility "Top Entry", {
          text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
          actionA {
            // TODO
          }
        }
        move "Reignite", {
          text "20 damage. Attach a [R] Energy card from your discard pile to this Pokemon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage {
              attachEnergyFrom(type: R, my.discard, self)
            }
          }
        }
      };
      case CHANDELURE_33:
      return evolution (this, from:"Lampent", hp:HP140, type:R, retreatCost:2) {
        weakness W
        bwAbility "Protective Glow", {
          text "Each of your Pokemon that has any Energy attached to it has no Weakness."
          getterA (GET_WEAKNESSES) { h->
            if (h.effect.target == self && self.cards.energyCount(C)) {
              def list = h.object as List<Weakness>
              list.clear()
            }
          }
        }
        move "Mirage Flare", {
          text "110 damage. Your opponent’s Active Pokemon is now Confused."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 110
            apply CONFUSED
          }
        }
      };
      case HEATMOR_34:
      return basic (this, hp:HP120, type:R, retreatCost:2) {
        weakness W
        move "Lick", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Flamethrower", {
          text "120 damage. Discard an Energy from this Pokemon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
            discardSelfEnergy(C)
          }
        }
      };
      case CINDERACE_V_35:
      return basic (this, hp:HP210, type:R, retreatCost:2) {
        weakness W
        bwAbility "Field Runner", {
          text "If there is a Stadium card in play, this Pokemon has no Retreat Cost."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) { h->
            if (bg.stadiumInfoStruct) {
              h.object = 0
            }
          }
        }
        move "Crimson Legs", {
          text "140 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case CINDERACE_VMAX_36:
      return evolution (this, from:"Cinderace V", hp:HP320, type:R, retreatCost:2) {
        weakness W
        def turnCount=-1
        HP lastDamage=null
        customAbility {
          delayed (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if(bg().currentTurn==self.owner.opposite) {
                turnCount=bg.turnCount
                lastDamage=bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
              }
            }
          }
        }
        move "Counter", {
          text "30+ damage. This attack does additional damage equal to the amount of damage done to this Pokemon by attacks from your opponent’s Pokemon during your opponent’s last turn."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            damage lastDamage.value
          }
        }
        move "Max Pyro Ball", {
          text "170 damage. Your opponent’s Active Pokemon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 170
            apply BURNED
          }
        }
      };
      case GALARIAN_MR_MIME_37:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness M
        move "Icy Wind", {
          text "10 damage. Your opponent’s Active Pokemon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            apply ASLEEP
          }
        }
        move "Triple Spin", {
          text "20x damage. Flip 3 coins. This attack does 20 damage time the number of heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 20 }
          }
        }
      };
      case GALARIAN_MR_RIME_38:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP110, type:W, retreatCost:1) {
        weakness M
        bwAbility "Screen Cleaner", {
          text "As long as this Pokemon is in play, prevent effects of opponent’s attacks done to all of your Pokemon with Energy attached to them. (This does not remove existing effects.)"
          delayedA {
            before null, null, Source.ATTACK, {
              def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
              if (pcs && pcs.cards.energyCount(C) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && pcs.owner==self.owner) {
                bc "$name prevents effect"
                prevent()
              }
            }
          }
        }
        move "Triple Spin", {
          text "50x damage. Flip 3 coins. This attack does 50 damage times the number of heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 50 }
          }
        }
      };
      case MAGIKARP_39:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Leap Out", {
          text "Switch This Pokemon with 1 of your Benched Pokemon."
          energyCost C
          attackRequirement {
            assert my.bench : "No Benched Pokemon"
          }
          onAttack {
            sw self, my.bench.select()
          }
        }
      };
      case GYARADOS_40:
      return evolution (this, from:"Magikarp", hp:HP180, type:W, retreatCost:4) {
        weakness L
        move "Wrack Down", {
          text "90 damage."
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
            damage 200
            if (bg.stadiumInfoStruct) {
              discard bg.stadiumInfoStruct.stadiumCard
            }
          }
        }
      };
      case WINGULL_41:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Collect", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            draw 1
          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PELIPPER_42:
      return evolution (this, from:"Wingull", hp:HP120, type:W, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Wing Attack", {
          text "50 damage."
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
            damage 110

            afterDamage {
              moveEnergy(self, my.bench)
            }
          }
        }
      };
      case MILOTIC_V_43:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        move "Aqua Impact", {
          text "10+ damage. This attack does 50 more damage for each [C] in your opponent’s Active Pokemon’s Retreat Cost."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 10+50*defending.retreatCost
          }
        }
        move "Hypno Splash", {
          text "150 damage. Your opponent’s Active Pokemon is now Asleep."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 150
            apply ASLEEP
          }
        }
      };
      case TYMPOLE_44:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Spiral Attack", {
          text "Your opponent’s Active Pokemon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            apply CONFUSED
          }
        }
      };
      case PALPITOAD_45:
      return evolution (this, from:"Tympole", hp:HP090, type:W, retreatCost:2) {
        weakness L
        move "Twirling Sign", {
          text "30 damage. Your opponent’s Active Pokemon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            apply CONFUSED
          }
        }
      };
      case SEISMITOAD_46:
      return evolution (this, from:"Palpitoad", hp:HP170, type:W, retreatCost:3) {
        weakness L
        move "Split Spiral Punch", {
          text "30 damage. Your opponent’s Active Pokemon is now Confused."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
            apply CONFUSED
          }
        }
        move "Resonance", {
          text "120 damage. If your opponent’s Active Pokemon is Confused, this attack does 120 more damage."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            if (opp.active.isSPC(CONFUSED)) damage 120
          }
        }
      };
      case GALARIAN_DARUMAKA_47:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Ice Punch", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { apply PARALYZED }
          }
        }
      };
      case GALARIAN_DARMANITAN_48:
      return evolution (this, from:"Galarian Darumaka", hp:HP140, type:W, retreatCost:3) {
        weakness M
        move "Blizzard", {
          text "80 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
            opp.bench.each {
              damage 10, it
            }
          }
        }
        move "Crushing Headbutt", {
          text "170 damage. This Pokemon can’t use Crushed Ice Head during your next turn."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 170
            cantUseAttack(thisMove, self)
          }
        }
      };
      case INTELEON_V_49:
      return basic (this, hp:HP200, type:W, retreatCost:2) {
        weakness L
        move "Snipe Shot", {
          text "This attack does 40 damage to 1 of your opponent’s Pokemon. (Don’t apply Weakness or Resistance for Benched Pokemon.)"
          energyCost W
          attackRequirement {}
          onAttack {
            damage 40, opp.all.select()
          }
        }
        move "Aqua Report", {
          text "130 damage. Your opponent reveals their hand."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
            opp.hand.showToMe("Opponent's hand")
          }
        }
      };
      case INTELEON_VMAX_50:
      return evolution (this, from:"Inteleon V", hp:HP320, type:W, retreatCost:2) {
        weakness L
        move "Hydro Snipe", {
          text "60 damage. You may return an Energy card from your opponent’s Active Pokemon to their hand."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 60

            afterDamage {
              if (defending.cards.energyCount(C) && confirm("Return an Energy from your Opponent's Active Pokemon to their hand?")) {
                defending.cards.filterByType(ENERGY).select(count:1).moveTo(opp.hand)
              }
            }
          }
        }
        move "Max Bullet", {
          text "160 damage. This attack does 60 damage to 1 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 160
            if (opp.bench) {
              damage 60, opp.bench.select()
            }
          }
        }
      };
      case CRAMORANT_51:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Dive", {
          text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent’s next turn."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Hydro Pump", {
          text "50+ damage. This attack does 20 more damage for each [W] Energy attached to this Pokemon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50+20*self.cards.energyCount(W)
          }
        }
      };
      case ARROKUDA_52:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Rain Splash", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BARRASKEWDA_53:
      return evolution (this, from:"Arrokuda", hp:HP120, type:W, retreatCost:1) {
        weakness L
        move "Peck", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Spiral Jet", {
          text "130 damage. Discard 2 [W] Energy from your hand or this attack does nothing."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 130
            discardSelfEnergy(W, W)
          }
        }
      };
      case EISCUE_54:
      return basic (this, hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Ice Face", {
          text "If this Pokemon’s HP is at max, any damage done to it by opponent’s attacks is reduced by 60."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.owner != self.owner) {
                bg.dm().each {
                  if (it.to == self && !self.numberOfDamageCounters) {
                    bc "Ice Face -60"
                    it.dmg -= hp(60)
                  }
                }
              }
            }
          }
        }
        move "Blizzard", {
          text "70 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 70
            opp.bench.each {
              damage 10, it
            }
          }
        }
      };
      case PIKACHU_55:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokemon can’t attack during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { cantAttackNextTurn defending }
          }
        }
        move "Pika Volt", {
          text "50 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case VOLTORB_56:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Continuous Tumble", {
          text "Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 20 }
          }
        }
      };
      case ELECTRODE_57:
      return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:0) {
        weakness F
        move "Orb Collector", {
          text "Search your deck for up to 3 Energy cards, reveal them, and put them in your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search(max: 3, cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
            shuffleDeck()
          }
        }
        move "Rolling Attack", {
          text "70 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ELECTABUZZ_58:
      return basic (this, hp:HP090, type:L, retreatCost:2) {
        weakness F
        move "Knuckle Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Electroslug", {
          text "70 damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ELECTIVIRE_59:
      return evolution (this, from:"Electabuzz", hp:HP140, type:L, retreatCost:3) {
        weakness F
        move "Thunder Shock", {
          text "50 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
            flip { apply PARALYZED }
          }
        }
        move "Electrified Bolt", {
          text "90 damage. If this Pokemon has a Special Energy card attached to it, this attack does 90 more damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 90
            if (self.findAll(cardTypeFilter(SPECIAL))) {
              damage 90
            }
          }
        }
      };
      case SHINX_60:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Under Pressure", {
          text "10 damage. If your opponent has 3 or fewer Prize cards remaining, this attack does 50 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            if (opp.prizeCardSet.size() <= 3) {
              damage 50
            }
          }
        }
      };
      case LUXIO_61:
      return evolution (this, from:"Shinx", hp:HP090, type:L, retreatCost:1) {
        weakness F
        bwAbility "Top Entry", {
          text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench."
          actionA {
            // TODO
            // def text="Once during your turn (before your attack), if this Pokémon is the last card in your hand, you may play it onto your Bench. If you do, draw 3 cards."
            // assert thisCard.player.pbg.hand.size() == 1 : "Hand size is not 1"
            // assert thisCard.player.pbg.hand.contains(thisCard) : "Not in hand"
            // assert thisCard.player.pbg.bench.notFull : "Bench full"
            // assert bg.turnCount!=lastTurn : "Already used ability"
            // assert checkGlobalAbility(thisCard) : "Blocked ability"
            // bc "$thisCard used Elusive Master"
            // my.hand.remove(thisCard)
            // def pcs = benchPCS(thisCard)
            // draw 3
          }
        }
        move "Zap Kick", {
          text "30 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LUXRAY_62:
      return evolution (this, from:"Luxio", hp:HP160, type:L, retreatCost:1) {
        weakness F
        move "Raid", {
          text "60 damage. If this Pokemon evolved from Luxio during your turn, this attack does 100 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 60

            if (self.lastEvolved == bg.turnCount) {
              damage 100
            }
          }
        }
        move "Head Bolt", {
          text "120 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case HELIOPTILE_63:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Thunder Jolt", {
          text "30 damage. This Pokemon does 10 damage to itself."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case HELIOLISK_64:
      return evolution (this, from:"Helioptile", hp:HP110, type:L, retreatCost:1) {
        weakness F
        move "Eerie Impulse", {
          text "Flip a coin. If heads, discard an Energy from 1 of your opponent’s Pokemon."
          energyCost L
          attackRequirement {
            assert opp.all.findAll { it.cards.energyCount(C) } : "Opponent has no Energies to Discard"
          }
          onAttack {
            flip {
              def validSources = opp.all.findAll { it.cards.energyCount(C) }
              def tar = validSources.select("Choose the Pokémon to discard an Energy from.")
              tar.cards.filterByType(ENERGY).select("Choose an energy to discard").discard()
            }
          }
        }
        move "Thunder", {
          text "120 damage. This Pokemon does 30 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 120
            damage 30, self
          }
        }
      };
      case CHARJABUG_65:
      return evolution (this, from:"Grubbin", hp:HP090, type:L, retreatCost:2) {
        weakness F
        move "Charge", {
          text "Search your deck for up to 2 [L] Energy cards and attach them to this Pokemon. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            attachEnergyFrom(type:L, my.deck, self)
            attachEnergyFrom(type:L, my.deck, self)
            shuffleDeck()
          }
        }
        move "Lightning Ball", {
          text "70 damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case VIKAVOLT_66:
      return evolution (this, from:"Charjabug", hp:HP150, type:L, retreatCost:2) {
        weakness F
        move "Powerful Storm", {
          text "60+ damage. This attack does 20 more damage times the amount of Energy attached to all of your Pokemon."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 60
            my.all.each { damage 20*it.cards.energyCount(C) }
          }
        }
        move "Thunder Jolt Beam", {
          text "170 damage. This Pokemon does 30 damage to itself."
          energyCost L, C, C, C
          attackRequirement {}
          onAttack {
            damage 170
            damage 30, self
          }
        }
      };
      case BOLTUND_V_67:
      return basic (this, hp:HP200, type:L, retreatCost:2) {
        weakness F
        move "Electrify", {
          text "Search your deck for up to 2 [L] Energy and attach them to your Benched Pokemon in any way you like. Then, shuffle your deck."
          energyCost L
          attackRequirement {}
          onAttack {
            attachEnergyFrom(type:L, my.deck, my.bench.select())
            attachEnergyFrom(type:L, my.deck, my.bench.select())
            shuffleDeck()
          }
        }
        move "Bolt Storm", {
          text "10+ damage. This attack does 30 more damage for each [L] Energy attached to your Pokemon in play."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 10
            my.all.each { damage 30*it.cards.energyCount(L) }
          }
        }
      };
      case TOXEL_68:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Tight Jaw", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case TOXTRICITY_69:
      return evolution (this, from:"Toxel", hp:HP130, type:L, retreatCost:2) {
        weakness F
        move "Poison Shout", {
          text "This attack does 20 damage to each of your opponent’s Pokemon. Your opponent’s Active Pokemon is now Poisoned. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost L
          attackRequirement {}
          onAttack {
            opp.all.each {
              damage 20, it
            }
            apply POISONED
          }
        }
        move "Hammer In", {
          text "90 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TOXTRICITY_V_70:
      return basic (this, hp:HP210, type:L, retreatCost:2) {
        weakness F
        move "Poison Jab", {
          text "20 damage. Your opponent’s Active Pokemon is now Poisoned."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
            apply POISONED
          }
        }
        move "Electric Riot", {
          text "90+ damage. This attack does 90 more damage if your opponent’s Active Pokemon is Poisoned."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 90
            if (opp.active.isSPC(POISONED)) damage 90
          }
        }
      };
      case TOXTRICITY_VMAX_71:
      return evolution (this, from:"Toxtricity V", hp:HP320, type:L, retreatCost:2) {
        weakness F
        move "G-Max Riot", {
          text "160+ damage. This attack does 80 more damage if your opponent’s Active Pokemon is Poisoned."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
            if (opp.active.isSPC(POISONED)) damage 80
          }
        }
      };
      case PINCURCHIN_V_72:
      return basic (this, hp:HP170, type:L, retreatCost:2) {
        weakness F
        bwAbility "Counterattack Kerzap", {
          text "If this Pokemon is your Active Pokemon and is damaged by an opponent’s attack, flip 3 coins. For each heads, put 3 damage counters on the Attacking Pokemon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.owner != self.owner) {
                bg.dm().each{
                  if (it.to == self && self.active && it.notNoEffect && it.dmg.value) {
                    bc "Counterattack Kerzap Activates"
                    directDamage 30, ef.attacker
                  }
                }
              }
            }
          }
        }
        move "Sparking Strike", {
          text "120 damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case MORPEKO_73:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Torment", {
          text "20 damage. Choose 1 of your opponent’s Active Pokemon’s attacks. The Defending Pokemon can’t use that attack during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage {
              amnesia(delegate)
            }
          }
        }
        move "Spark", {
          text "50 damage. This attack does 20 damage to 1 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
            if (opp.bench) {
              damage 20, opp.bench.select()
            }
          }
        }
      };
      case CLEFAIRY_74:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Shining Fingers", {
          text "Your opponent’s Active Pokemon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Magical Shot", {
          text "10 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CLEFABLE_75:
      return evolution (this, from:"Clefairy", hp:HP110, type:P, retreatCost:1) {
        weakness M
        bwAbility "Prankish", {
          text "Once during your turn, when you play this card from your hand to evolve a Pokemon, you may choose an Energy attached to your opponent’s Active Pokemon and return it to the top of your opponent’s deck."
          onActivate {r->
            if (r==PLAY_FROM_HAND && opp.active.cards.energyCount(C) && bg.em().retrieveObject("Prankish")!=bg.turnCount && confirm("Use Prankish?")) {
              powerUsed()
              bg.em().storeObject("Prankish", bg.turnCount)
              opp.active.cards.filterByType(ENERGY).select(count:1).moveTo(addToTop: true, opp.deck)
            }
          }
        }
        move "Moon Kick", {
          text "60 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case NATU_76:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Me First", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            draw 1
          }
        }
      };
      case XATU_77:
      return evolution (this, from:"Natu", hp:HP120, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Energy Warp", {
          text "Move an Energy from 1 of your opponent’s Benched Pokemon to their Active Pokemon."
          energyCost C
          attackRequirement {
            assert opp.all.findAll { it.cards.filterByType(ENERGY) } : "Opponent has no available Energies"
            assert opp.bench : "Opponent has no Benched Pokemon"
          }
          onAttack {
            def bothAll = new PcsList();
            opp.all.each{
              bothAll.add(it)
            }
            def pcs = bothAll.findAll{it.cards.filterByType(ENERGY)}.select("Choose the Pokémon to move the Energy from")
            def tar = bothAll.findAll{it != pcs}.select("Select the Pokémon to receive the Energy")
            energySwitch(pcs,tar, pcs.cards.filterByType(ENERGY).select("Choose the Energy to move").first())
          }
        }
        move "Psychic", {
          text "10+ damage. This attack does 30 more damage for each Energy attached to the opponent’s Active Pokemon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10+30*opp.active.cards.filterByType(ENERGY).size()
          }
        }
      };
      case GALARIAN_CORSOLA_78:
      return basic (this, hp:HP080, type:P, retreatCost:null) {
        weakness D
        resistance F, MINUS30
        move "Cursed Drop", {
          text "Put 3 damage counters on your opponent’s Pokemon in any way you like."
          energyCost P
          attackRequirement {}
          onAttack {
            (1..3).each {
              if (opp.all) {
                directDamage(10, opp.all.select("Place a Damage Counter ($it/3)"))
              }
            }
          }
        }
      };
      case GALARIAN_CURSOLA_79:
      return evolution (this, from:"Galarian Corsola", hp:HP100, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Perish Body", {
          text "If this Pokemon is your Active Pokemon and is Knocked Out by damage from an opponent’s attack, flip a coin. If heads, the Attacking Pokemon is Knocked Out."
          delayedA {
            before (KNOCKOUT, self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                delayed(inline: true){
                  after KNOCKOUT, self, {
                    flip {
                      new Knockout(ef.attacker).run(bg)
                      bc "Perish Body activates"
                    }
                  }
                }

              }
            }
          }
        }
        move "Corner", {
          text "60 damage. The Defending Pokemon can’t retreat during your opponent’s next turn."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
            cantRetreat defending
          }
        }
      };
      case SIGILYPH_80:
      return basic (this, hp:HP110, type:P, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Counterattack", {
          text "If this Pokemon is your Active Pokemon and is damaged by an opponent’s attack, place 3 damage counters on the attacking Pokemon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && bg.dm().find({ it.to==self && it.dmg.value }) && self.active) {
                directDamage(30, ef.attacker, Source.SRC_ABILITY)
              }
            }
          }
        }
        move "Psychic Assault", {
          text "Does 30 damage plus 10 damage for each damage counter on the opponent’s Active Pokemon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30+10*self.numberOfDamageCounters
          }
        }
      };
      case SANDYGAST_81:
      return basic (this, hp:HP080, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Sneaky Placement", {
          text "Put a damage counter on 1 of your opponent’s Pokemon."
          energyCost P
          attackRequirement {}
          onAttack {
            directDamage 10, opp.all.select()
          }
        }
      };
      case PALOSSAND_82:
      return evolution (this, from:"Sandygast", hp:HP140, type:P, retreatCost:4) {
        weakness D
        resistance F, MINUS30
        move "Sand Sink", {
          text "Discard a card from the top of your opponent’s deck. If this Pokemon has Cursed Shovel attached to it, discard 2 more cards."
          energyCost C, C
          attackRequirement {
            assert opp.deck : "Opponent's deck is empty"
          }
          onAttack {
            opp.deck.subList(0,1).discard()
            if (opp.deck && self.cards.findAll { it.name=="Cursed Shovel" }) {
              opp.deck.subList(0,2).discard()
            }
          }
        }
        move "Super Absorption", {
          text "90 damage. Heal 30 damage from this Pokemon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 90
            heal 30, self
          }
        }
      };
      case HATTENA_83:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Find a Friend", {
          text "Search your deck for a Pokemon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            my.deck.search(max: 1, cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Psyshot", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HATTREM_84:
      return evolution (this, from:"Hattena", hp:HP080, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Calm Mind", {
          text "Heal 30 damage from this Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            heal 30, self
          }
        }
        move "Brutal Swing", {
          text "30 damage. Flip a coin, If heads, this attack does 30 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 30 }
          }
        }
      };
      case HATTERENE_85:
      return evolution (this, from:"Hattrem", hp:HP150, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Mind Hat", {
          text "Once during your turn, you may have each player discard 1 card from their hand. (Your opponent discards first. If either player has no cards in their hand, that player does not discard.)"
          actionA {
            assert (my.hand || opp.hand): "Neither player have any cards in their hand."
            checkLastTurn()

            if (confirm("Use Mind Hat")) {
              powerUsed()
              if (opp.hand) {
                if (opp.hand.size() > 1) {
                  opp.hand.oppSelect(count:1, "Which card to discard?").discard()
                } else {
                  opp.hand.discard()
                }
              }

              if (my.hand) {
                if (my.hand.size() > 1) {
                  my.hand.select(count:1, "Which card to discard?").discard()
                } else {
                  my.hand.discard()
                }
              }
            }
          }
        }
        move "Dripping Grudge", {
          text "Put damage counters on your opponent’s Active Pokemon equal to the number of Pokemon in your discard pile."
          energyCost P
          attackRequirement {
            assert my.discard.filterByType(POKEMON) : "No Pokemon in Discard"
          }
          onAttack {
            directDamage my.discard.filterByType(POKEMON).size()*10
          }
        }
      };
      case MILCERY_86:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness M
        move "Aromatherapy", {
          text "Heal 10 damage from each of your Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            my.all.each {
              heal 10, it
            }
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ALCREMIE_87:
      return evolution (this, from:"Milcery", hp:HP110, type:P, retreatCost:1) {
        weakness M
        move "Decorate", {
          text "Attach any number of Basic Energy from your hand to your Pokemon in any way you like."
          energyCost C
          attackRequirement {
            assert my.hand.filterByType(BASIC_ENERGY) : "No Basic Energies in Hand"
          }
          onAttack {
            def tar = my.hand.filterByType(BASIC_ENERGY)
            if (tar) {
              tar.select(min:0, max:tar.size(), "Select the ones you want to attach").each {
                attachEnergy(my.all.select("Attach $it to?"), it)
              }
            }
          }
        }
        move "Draining Kiss", {
          text "50 damage. Heal 30 damage from this Pokemon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 50
            heal 30, self
          }
        }
      };
      case INDEEDEE_88:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Replenish Time", {
          text "Heal 30 damage from to each of your Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            my.all.each {
              heal 30, it
            }
          }
        }
        move "Psybeam", {
          text "30 damage. Your opponent’s Active Pokemon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
            apply CONFUSED
          }
        }
      };
      case DREEPY_89:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Quick Attack", {
          text "10 damage. Flip a coin. If heads, this attack does 10 more damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
      };
      case DRAKLOAK_90:
      return evolution (this, from:"Dreepy", hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Summon", {
          text "Search your deck for a Dreepy and put it on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search (count: 1, {it.name == "Dreepy"}).each {
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Bite", {
          text "40 damage."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DRAGAPULT_91:
      return evolution (this, from:"Drakloak", hp:HP150, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        bwAbility "Infiltrator", {
          text "If this Pokemon would be damaged by an attack, flip a coin. If heads, prevent all damage done to this Pokemon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.notNoEffect) {
                  flip {
                    bc "Infiltrator prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
        }
        move "Phantom Force", {
          text "120 damage. Put 3 damage counters on your opponent’s Benched Pokemon in any way you like."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 120
            (1..3).each {
              if (opp.bench) {
                directDamage(10, opp.bench.select("Place a Damage Counter ($it/3)"))
              }
            }
          }
        }
      };
      case DRAGAPULT_V_92:
      return basic (this, hp:HP210, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Bite", {
          text "30 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Jet Assault", {
          text "60+ damage. If this Pokemon was on your Bench and became your Active Pokemon during this turn, this attack does 80 more damage."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 60
            if (wasSwitchedOutThisTurn(self)) {
              damage 80
            }
          }
        }
      };
      case DRAGAPULT_VMAX_93:
      return evolution (this, from:"Dragapult V", hp:HP320, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Shred", {
          text "60 damage. This attack’s damage isn’t affected by effects on your opponents Active Pokemon."
          energyCost P
          attackRequirement {}
          onAttack {
            swiftDamage(60, defending)
          }
        }
        move "Max Phantom", {
          text "130 damage. Put 5 damage counters on your opponent’s Benched Pokemon in any way you like."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 130
            (1..5).each {
              if (opp.bench) {
                directDamage(10, opp.bench.select("Place a Damage Counter ($it/5)"))
              }
            }
          }
        }
      };
      case GALARIAN_FARFETCH_D_94:
      return basic (this, hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Rock Smash", {
          text "10 damage. Flip a coin, if heads this attack does an additional 30 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 30 }
          }
        }
        move "Pierce", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_SIRFETCH_D_95:
      return evolution (this, from:"Galarian Farfetch’d", hp:HP130, type:F, retreatCost:2) {
        weakness P
        move "Pierce", {
          text "40 damage."
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
            damage 180
            afterDamage {
              delayed {
                before CHECK_ATTACK_REQUIREMENTS, {
                  if (ef.attacker.owner == self && ef.move.name == "Meteor Assault") {
                    wcu "Meteor Assault prevent this attack from being used as long as $self is Active"
                    prevent()
                  }
                }

                after SWITCH, self, { unregister() }
                after EVOLVE, self, { unregister() }
              }
            }
          }
        }
      };
      case NOSEPASS_96:
      return basic (this, hp:HP080, type:F, retreatCost:3) {
        weakness G
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rolling Tackle", {
          text "50 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MEDITITE_97:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness P
        move "Yoga Shock", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case MEDICHAM_98:
      return evolution (this, from:"Meditite", hp:HP110, type:F, retreatCost:1) {
        weakness P
        move "Yoga Kick", {
          text "40 damage. This attack’s damage isn’t affected by Weakness or Resistance."
          energyCost F
          attackRequirement {}
          onAttack {
            noWrDamage 40
          }
        }
        move "Psychic", {
          text "60+ damage. This attack does 20 more damage for each Energy attached to your opponent’s Active Pokemon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60+20*opp.active.cards.filterByType(ENERGY).size()
          }
        }
      };
      case BARBOACH_99:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Razor Fin", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WHISCASH_100:
      return evolution (this, from:"Barboach", hp:HP140, type:F, retreatCost:3) {
        weakness G
        bwAbility "Submerge", {
          text "As long as this Pokemon is on your Bench, it takes no damage from attacks."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if (!self.active && it.to == self) {
                  bc "Submerge prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Earthquake", {
          text "140 damage. This attack does 20 damage to each of your Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 140
            my.bench.each {
              damage 20, it
            }
          }
        }
      };
      case GALARIAN_YAMASK_101:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Reckless Charge", {
          text "50 damage. This Pokemon does 30 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
            damage 30, self
          }
        }
      };
      case GALARIAN_RUNERIGUS_102:
      return evolution (this, from:"Galarian Yamask", hp:HP100, type:F, retreatCost:2) {
        weakness G
        move "Spreading Spite", {
          text "For each damage counter on this Galarian Runerigus, put 2 damage counters on your opponent's Pokemon in any way you like."
          energyCost C, C
          attackRequirement {}
          onAttack {
            (1..self.numberOfDamageCounters).each {
              directDamage 20, opp.all.select("Put 2 damage counter to which Pokémon? ($it/$self.numberOfDamageCounters")
            }
          }
        }
        move "Mad Hammer", {
          text "120 damage. This Pokemon does 30 damage to itself."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 120
            damage 30, self
          }
        }
      };
      case BINACLE_103:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Dual Chop", {
          text "Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            flip 2, { damage 50 }
          }
        }
      };
      case BARBARACLE_104:
      return evolution (this, from:"Binacle", hp:HP120, type:F, retreatCost:3) {
        weakness G
        move "Rock Hurl", {
          text "50 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 50
            dontApplyResistance()
          }
        }
        move "Hand Press", {
          text "80 damage. If you have more cards in your hand than your opponent, this attack does 80 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 80
            if (my.hand.size() > opp.hand.size()) {
              damage 80
            }
          }
        }
      };
      case ROLYCOLY_105:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
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
      case CARKOAL_106:
      return evolution (this, from:"Rolycoly", hp:HP100, type:F, retreatCost:3) {
        weakness G
        move "Ram", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Heat Crash", {
          text "60 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case COALOSSAL_107:
      return evolution (this, from:"Carkoal", hp:HP160, type:F, retreatCost:4) {
        weakness G
        bwAbility "Tar Generator", {
          text "Once during your turn, you may search your discard pile for up to 1 [R] Energy and 1 [F] Energy and attach them to your Pokemon in any way you like."
          actionA {
            checkLastTurn()
            powerUsed()
            if (my.discard.filterByEnergyType(R)) {
              my.discard.filterByEnergyType(R).select(min:0, max:1).each {
                def tar = my.all.select("Attach Energy to?")
                attachEnergy(tar, it)
              }
            }
            if (my.discard.filterByEnergyType(F)) {
              my.discard.filterByEnergyType(F).select(min:0, max:1).each {
                def tar = my.all.select("Attach Energy to?")
                attachEnergy(tar, it)
              }
            }
          }
        }
        move "Flaming Avalanche", {
          text "130 damage."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case SANDACONDA_V_108:
      return basic (this, hp:HP220, type:F, retreatCost:3) {
        weakness G
        move "Sand Eater", {
          text "30 damage. Attach a [F] Energy from your discard pile to this Pokemon."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type: F, my.discard, self)
            }
          }
        }
        move "Sand Breath", {
          text "220 damage. Discard 2 Energy from this Pokemon."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 220
            discardSelfEnergy(C, C)
          }
        }
      };
      case FALINKS_109:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokemon and put them on your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily(basic:true, 2, delegate)
        }
        move "Team Attack", {
          text "This attack does 30 damage for each Pokemon on your Bench with 'Falinks' in it's name."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30*my.bench.findAll { it.name.contains "Falinks" }.size()
          }
        }
      };
      case FALINKS_V_110:
      return basic (this, hp:HP160, type:F, retreatCost:2) {
        weakness P
        bwAbility "Iron Defense Formation", {
          text "As long as this Pokemon is in play, damage done to any of your Pokemon with Falinks in its name by your opponent’s atacks is reduced by 20."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.name.contains("Falinks")&& it.dmg.value && it.notNoEffect) {
                  bc "Iron Defense Formation -20"
                  it.dmg -= hp(20)
                }
              }
            }
          }
        }
        move "Giga Impact", {
          text "210 damage. This Pokemon can’t attack during your next turn."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 210
            cantAttackNextTurn self
          }
        }
      };
      case STONJOURNER_111:
      return basic (this, hp:HP140, type:F, retreatCost:4) {
        weakness G
        move "Mega Kick", {
          text "80 damage."
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
            damage 120
            if (self.cards.energySufficient( thisMove.energyCost + C )) {
              damage 60
            }
          }
        }
      };
      case KOFFING_112:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        move "Suffocating Gas", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GALARIAN_WEEZING_113:
      return evolution (this, from:"Galarian Koffing", hp:HP130, type:D, retreatCost:3) {
        weakness F
        bwAbility "Neutralizing Gas", {
          text "As long as this Pokemon is in the Active Spot, your opponent's Pokemon in play have no Abilities, except for Neutralizing Gas."
          def effect1
          onActivate {
            effect1 = getter IS_ABILITY_BLOCKED, { Holder h ->
              if (self.active && h.effect.ability.name != "Neutralizing Gas" && h.effect.ability instanceof BwAbility && h.effect.target.owner != self.owner) {
                targeted(h.effect.target, SRC_ABILITY) {
                  h.object = true
                }
              }
            }
            new CheckAbilities().run(bg)
          }
          onDeactivate {
            effect1.unregister()
            new CheckAbilities().run(bg)
          }
        }
        move "Severe Poison", {
          text "Your opponent's Active Pokemon is now Poisoned. Put 4 damage counters instead of 1 on that Pokemon during Pokemon Checkup."
          energyCost D
          attackRequirement {}
          onAttack {
            apply POISONED
            extraPoison 3
          }
        }
      };
      case STUNKY_114:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness F
        move "Poison Gas", {
          text "10 damage. Your opponent’s Active Pokemon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            apply POISONED
          }
        }
      };
      case SKUNTANK_115:
      return evolution (this, from:"Stunky", hp:HP120, type:D, retreatCost:3) {
        weakness F
        move "Slash", {
          text "50 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Poison Ring", {
          text "80 damage. Your opponent’s Active Pokemon is now Poisoned. The Defending Pokemon can’t retreat during your opponent’s next turn."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
            apply POISONED
            cantRetreat(defending)
          }
        }
      };
      case SPIRITOMB_116:
      return basic (this, hp:HP060, type:D, retreatCost:2) {
        weakness G
        move "Splitting Spite", {
          text "Discard 1 card from the top of each player’s deck."
          energyCost D
          attackRequirement {}
          onAttack {
            if (opp.deck) discard opp.deck.get(0)
            if (my.deck) discard my.deck.get(0)
          }
        }
        move "Dripping Grudge", {
          text "Put damage counters on your opponent’s Active Pokemon equal to the number of Pokemon in your discard pile."
          energyCost D, C
          attackRequirement {
            assert my.discard.filterByType(POKEMON) : "No Pokemon in Discard"
          }
          onAttack {
            directDamage my.discard.filterByType(POKEMON).size()*10
          }
        }
      };
      case TRUBBISH_117:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Venoshock", {
          text "20+ damage. If your opponent’s Active Pokemon is Poisoned, this attack does 50 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            if (opp.active.isSPC(POISONED)) damage 50
          }
        }
      };
      case GARBODOR_118:
      return evolution (this, from:"Trubbish", hp:HP120, type:D, retreatCost:2) {
        weakness F
        bwAbility "Poisonous Puddle", {
          text "Once during your turn, if there is a Stadium in play, you may leave your opponents Active Pokemon Poisoned."
          actionA {
            checkLastTurn()
            powerUsed()
            if (bg.stadiumInfoStruct) {
              apply POISONED, opp.active, SRC_ABILITY
            }
          }
        }
        move "Sludge Bomb", {
          text "80 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case VULLABY_119:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "10 damage. Before doing damage, discard all Pokemon Tools attached to your opponent’s Active Pokemon."
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
      case MANDIBUZZ_120:
      return evolution (this, from:"Vullaby", hp:HP120, type:D, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Bone Rush", {
          text "Flip a coin until you get tails. This attack does 30 damage times the number of heads."
          energyCost D
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 30 }
          }
        }
        move "Blindside", {
          text "This attack does 100 damage to 1 of your opponent’s Pokemon that already has damage counters on it. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 100, opp.all.findAll { it.numberOfDamageCounters }.select()
          }
        }
      };
      case MALAMAR_V_121:
      return basic (this, hp:HP210, type:D, retreatCost:2) {
        weakness G
        move "Drag Off", {
          text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. This attack does 30 damage to the new Active Pokemon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            def target = defending
            if (opp.bench) {
              target = opp.bench.select("Select the new active")
              sw defending, target
            }
            damage 30, target
          }
        }
        move "Brain Shake", {
          text "130 damage. Your opponent’s Active Pokemon is now Confused."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 130
            apply CONFUSED
          }
        }
      };
      case MALAMAR_VMAX_122:
      return evolution (this, from:"Malamar V", hp:HP310, type:D, retreatCost:2) {
        weakness G
        move "Max Jammer", {
          text "180 damage. Your opponent reveals their hand. Choose 1 card that you find there and put it on the bottom of your opponent’s deck."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 180

            afterDamage {
              if (opp.hand) {
                opp.hand.select("Choose 1 card to put on the bottom of their Deck").moveTo(opp.deck)
              }
            }
          }
        }
      };
      case IMPIDIMP_123:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Beat", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Stampede", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MORGREM_124:
      return evolution (this, from:"Impidimp", hp:HP090, type:D, retreatCost:2) {
        weakness G
        move "Bite", {
          text "30 damage."
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
            swiftDamage(60, defending)
          }
        }
      };
      case GRIMMSNARL_125:
      return evolution (this, from:"Morgrem", hp:HP170, type:D, retreatCost:3) {
        weakness G
        bwAbility "Dark Oath", {
          text "As long as this Pokemon is your Active Pokemon, your opponent’s Active Pokemon pays [C] more to use its attacks."
          getterA GET_MOVE_LIST, { h ->
            if (h.effect.target.active && self.active) {
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                copy.energyCost.add(C)
                list.add(copy)
              }
              h.object=list
            }
          }
        }
        move "Energy Press", {
          text "100+ damage. This attack does 30 more damage for each Energy attached to your opponent’s Active Pokemon."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            dammage 100+30*opp.active.cards.energyCount(C)
          }
        }
      };
      case GALARIAN_MEOWTH_126:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Evolution Roar", {
          text "Once during your turn (before your attack), you may discard 2 cards from your hand. If you do, search your deck for 1 Galarian Perrserker, reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
            checkLastTurn()
            powerUsed()
            assert my.deck : "Deck is empty"
            assert my.hand.size() >= 2 : "Requires 2 or more Cards in hand"

            my.hand.select(count: 2, "Select 2 cards to discard").discard()
            my.deck.search {
              it.name.contains("Galarian Perrserker")
            }.moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Scratch", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GALARIAN_PERRSERKER_127:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Slash", {
          text "50 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Claw Dagger", {
          text "80x damage. Flip 3 coins. This attack does 80 damage for each heads."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 80 }
          }
        }
      };
      case SCIZOR_128:
      return evolution (this, from:"Scyther", hp:HP130, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Raid", {
          text "30+ damage. If this Pokemon evolved from Scyther during your turn, this attack does 90 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 30

            if (self.lastEvolved == bg.turnCount) {
              damage 90
            }
          }
        }
        move "Guard Claw", {
          text "90 damage. During your opponent’s next turn, any damage done to this Pokemon by attacks is reduced by 30."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 90
            reduceDamageNextTurn(hp(30), thisMove)
          }
        }
      };
      case BRONZOR_129:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Ram", {
          text "10 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Speed Dive", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BRONZONG_130:
      return evolution (this, from:"Bronzor", hp:HP130, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Smack", {
          text "30 damage."
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

            if (my.bench) {
              sw self, my.bench.select("Choose the new active.")
            }

            if (opp.bench) {
              whirlwind()
            }
          }
        }
      };
      case PROBOPASS_131:
      return evolution (this, from:"Nosepass", hp:HP140, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Gravitational Drop", {
          text "10+ damage. This attack does 30 more damage for each [C] in your opponent’s Active Pokemon’s Retreat Cost."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10+30*defending.retreatCost
          }
        }
        move "Heavy Impact", {
          text "120 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case DURANT_132:
      return basic (this, hp:HP100, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Gathering Food", {
          text "For each Energy attached to this Pokemon, search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            def energyCount = self.cards.energyCount(C)
            my.deck.search(max:energyCount, "Choose up to $energyCount Trainer card(s)", cardTypeFilter(TRAINER)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Metal Claw", {
          text "80 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case HONEDGE_133:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Slicing Blade", {
          text "30 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DOUBLADE_134:
      return evolution (this, from:"Honedge", hp:HP090, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Slash", {
          text "30 damage."
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
            flip 2, { damage 80 }
          }
        }
      };
      case AEGISLASH_135:
      return evolution (this, from:"Doublade", hp:HP140, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Big Shield", {
          text "As long as this Pokemon is in play, any damage done to your Pokemon by opponent’s attacks is reduced by 30. You can’t use more than 1 Big Shield Ability."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.owner == self.owner && it.notNoEffect && it.dmg.value) {
                  bc "Big Shield -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Power Edge", {
          text "130 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case COPPERAJAH_V_136:
      return basic (this, hp:HP220, type:M, retreatCost:4) {
        weakness R
        move "Adamantine Press", {
          text "90 damage. During your opponent’s next turn, this Pokemon takes 30 less damage from attacks."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 90
            reduceDamageFromDefendingNextTurn(hp(30), thisMove, defending)
          }
        }
        move "Wrack Down", {
          text "180 damage."
          energyCost M, M, M, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case COPPERAJAH_VMAX_137:
      return evolution (this, from:"Copperajah V", hp:HP340, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Dangerous Nose", {
          text "100+ damage. If your opponent’s Active Pokemon is a Basic Pokemon, this attack does 100 more damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 100
            if (defending.basic) {
              damage 100
            }
          }
        }
        move "G-Max Hammer", {
          text "240 damage."
          energyCost M, M, M, C
          attackRequirement {}
          onAttack {
            damage 240
          }
        }
      };
      case DURALUDON_138:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Metal Sharpener", {
          text "30 damage. Attach a [M] Energy from your discard pile to 1 of your Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type: M, my.discard, my.all.select())
            }
          }
        }
        move "Power Beam", {
          text "110 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case ZACIAN_139:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Energy Stream", {
          text "30 damage. Attach a [M] Energy from your discard pile to 1 of your Pokemon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type: M, my.discard, my.all.select())
            }
          }
        }
        move "Smashing Edge", {
          text "120 damage. Flip a coin. If tails, discard 2 Energy from this Pokemon"
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 120
            flip 1, {}, {
              discardSelfEnergy(C, C)
            }
          }
        }
      };
      case ZAMAZENTA_140:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Guard Press", {
          text "During your opponent's next turn, this Pokemon takes 20 less damage from attacks (after applying Weakness and Resistance)."
          energyCost M, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Power Rush", {
          text "120 damage. Flip a coin. If tails, during your next turn, this Pokemon can't attack."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 120
            flip 1, {}, {
              cantAttackNextTurn self
            }
          }
        }
      };
      case SNORLAX_141:
      return basic (this, hp:HP150, type:C, retreatCost:4) {
        weakness F
        move "Collect", {
          text "Draw 2 cards."
          energyCost C
          attackRequirement {}
          onAttack {
            draw 2
          }
        }
        move "Collapse", {
          text "120 damage. This Pokemon is now Asleep."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            apply ASLEEP, self
          }
        }
      };
      case CHATOT_142:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Lucky Match", {
          text "Once during your turn, when you play this card from your hand onto your Bench, you may flip a coin. If heads, choose a Supporter card from your discard pile, reveal it, and put it into your hand."
          onActivate { r->
            if (r==PLAY_FROM_HAND && my.discard.filterByType(SUPPORTER) && bg.em().retrieveObject("Lucky Match")!=bg.turnCount && confirm("Use Lucky Match?")) {
              powerUsed()
              bg.em().storeObject("Lucky Match", bg.turnCount)
              my.discard.filterByType(SUPPORTER).select("Choose a Supporter to move to your hand.").moveTo(my.hand)
            }
          }
        }
        move "Glide", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PIDOVE_143:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Chirp", {
          text "Search your deck for up to 2 Pokemon with a [F] Resistance, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "There are no more cards in your deck."
          }
          onAttack {
            my.deck.search (max: 2, {
              it.cardTypes.is(POKEMON) && it.asPokemonCard().resistances.find{res-> res.type==F}
            }).showToOpponent("Chosen Pokémon cards.").moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Razor Wing", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TRANQUILL_144:
      return evolution (this, from:"Pidove", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Razor Wing", {
          text "40 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Gust", {
          text "60 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case UNFEZANT_145:
      return evolution (this, from:"Tranquill", hp:HP150, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Daunt", {
          text "50 damage. The attacks of the Defending Pokemon do 50 less damage during your opponent’s next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
            reduceDamageFromDefendingNextTurn(hp(50), thisMove, defending)
          }
        }
        move "Air Slash", {
          text "150 damage. Discard an Energy from this Pokemon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 150
            discardSelfEnergy(C)
          }
        }
      };
      case BUNNELBY_146:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Burrow", {
          text "Discard 1 card from the top of your opponent’s deck."
          energyCost C
          attackRequirement {
            assert opp.deck : "Opponent's Deck is empty"
          }
          onAttack {
            opp.deck.subList(0, 1).discard()
          }
        }
        move "Headbutt Bounce", {
          text "50 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DIGGERSBY_147:
      return evolution (this, from:"Bunnelby", hp:HP130, type:C, retreatCost:3) {
        weakness F
        move "Mining Rush", {
          text "Discard up to 6 cards from the top of your deck. This attack does 30 damage for each card discarded in this way."
          energyCost C, C, C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def num =  choose([0,1,2,3,4,5,6], ["0","1","2","3","4","5","6"], "Discard how many from the top of your deck?", 6)
            num = Math.min(num, deck.size())
            my.deck.subList(0,num).discard()
            damage 30*num
          }
        }
        move "Headbutt Bounce", {
          text "110 damage."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case HAWLUCHA_148:
      return basic (this, hp:HP090, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Windfall", {
          text "Shuffle your hand into your deck. Then, draw 5 cards."
          energyCost C
          attackRequirement {}
          onAttack {
            shuffleDeck(hand)
            hand.clear()
            draw 5
          }
        }
        move "Speed Attack", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case STUFFUL_149:
      return basic (this, hp:HP080, type:C, retreatCost:2) {
        weakness F
        move "Tackle", {
          text "10 damage."
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
            flip { damage 40 }
          }
        }
      };
      case BEWEAR_150:
      return evolution (this, from:"Stufful", hp:HP140, type:C, retreatCost:3) {
        weakness F
        move "Hammer Arm", {
          text "90 damage. Discard a card from the top of your opponent’s deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
            if (opp.deck) {
              opp.deck.subList(0,1).discard()
            }
          }
        }
        move "Big Throw", {
          text "Flip a coin. If heads, discard your opponent’s Active Pokemon and all cards attached to it."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            flip {
              targeted (defending) {
                defending.cards.reverse().discard()
                removePCS(defending)
              }
            }
          }
        }
      };
      case SKWOVET_151:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Tackle", {
          text "10 damage."
          energyCost C
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
      case GREEDENT_152:
      return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
        weakness F
        bwAbility "Greedy Tail", {
          text "Once during your turn, you may search your deck for a Pokemon Tool card, reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()
            my.deck.search(count:1, "Choose a Pokemon Tool card", cardTypeFilter(POKEMON_TOOL)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Tail Smack", {
          text "80 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case DUBWOOL_V_153:
      return basic (this, hp:HP210, type:C, retreatCost:2) {
        weakness F
        bwAbility "Soft Wool", {
          text "Damage done to this Pokemon by attacks is reduced by 30."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  bc "Soft Wool -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Revenge Blast", {
          text "120+ damage. This attack does 30 more damage for each Prize card your opponent has taken."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120+30*opp.prizeCardSet.takenCount
          }
        }
      };
      case BOSS_S_ORDERS_154:
      return supporter (this) {
        text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          sw opp.active, opp.bench.select("New Active")
        }
        playRequirement {
          assert opp.bench : "Opponent's Bench is empty"
        }
      };
      case BURNING_SCARF_155:
      return pokemonTool (this) {
        text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. If the [R] Pokemon this card is attached to is your Active Pokemon and is damaged by an opponent’s attack, the Attacking Pokemon is now Burned. You may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff = delayed(priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              bg().dm().each {
                if (it.to == self && self.active && self.types.contains(R) && it.dmg.value && bg.currentTurn==self.owner.opposite) {
                  bc "Burning Scarf activates"
                  apply BURNED, it.from, SRC_ABILITY
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case CURSED_SHOVEL_156:
      return pokemonTool (this) {
        text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. If the Pokemon this Tool is attached to is Knocked Out by damage from an opponent’s attack, discard the top 2 cards of your opponent’s deck. You may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff = delayed {
            before (KNOCKOUT,self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                bc "Cursed Shovel activates"
                if (opp.deck) {
                  opp.deck.subList(0, 2).discard()
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case DAN_157:
      return supporter (this) {
        text "Draw 2 cards. Play Rock-Paper-Scissors with your opponent. If you win, draw 2 more cards. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          draw 2

          def winnerDetermined = false
          def myWin = false

          while (!winnerDetermined) {
            def myChoice = choose([1,2,3], ['Rock', 'Paper', 'Scissors'], "Rock-Paper-Scissors")
            def opponentChoice = oppChoose([4,5,6], ['Rock', 'Paper', 'Scissors'], "Rock-Paper-Scissors")

            if (myChoice == 1) {
              if (opponentChoice == 5) {
                winnerDetermined = true
              } else if (opponentChoice == 6) {
                winnerDetermined = true
                myWin = true
              }
            } else if (myChoice == 2) {
              if (opponentChoice == 4) {
                winnerDetermined = true
                myWin = true
              } else if (opponentChoice == 6) {
                winnerDetermined = true
              }
            } else {
              if (opponentChoice == 4) {
                winnerDetermined = true
              } else if (opponentChoice == 5) {
                winnerDetermined = true
                myWin = true
              }
            }
          }

          if (myWin) {
            bc "Dan: Current Turn's player won Rock Paper Scissors and can draw 2 extra cards"
            draw 2
          }
        }
        playRequirement {
          assert my.deck : "Deck is empty"
        }
      };
      case FULL_BUCKET_158:
      return itemCard (this) {
        text "Search your deck for 2 [W] Energy, reveal them, and put them into your hand. Then, shuffle your deck. You may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          my.deck.search(max: 2, "Search for 2 [W] energy", energyFilter(W)).moveTo(my.hand)
        }
        playRequirement{
          assert my.deck : "Deck is empty"
        }
      };
      case FULL_HEAL_159:
      return copy(HeartgoldSoulsilver.FULL_HEAL_93, this);
      case GALAR_MINE_160:
      return basicTrainer (this) {
        text "The Retreat Cost of each Active Pokemon (both yours and your opponent’s) is [C][C] more. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
        def eff
        onPlay {
          eff = getter (GET_RETREAT_COST) { Holder h->
            h.object += 2
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case MILO_161:
      return supporter (this) {
        text "Discard up to 2 cards from your hand. Then draw twice as many cards as you discarded. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          def num = my.hand.getExcludedList(thisCard).select(min: 1, max:2, "Discard up to 2 cards and draw twice as many").discard().size()
          draw num*2
        }
        playRequirement {
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert (hand || my.deck) : "Not enough cards in Hand or Deck is empty."
        }
      };
      case NUGGET_162:
      return itemCard (this) {
        text "Play this card when you draw it from your deck at the start of your turn (before putting it into your hand). Draw 3 cards. You may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          // TODO
        }
        playRequirement {
        }
      };
      case OLEANA_163:
      return supporter (this) {
        text "Discard 2 cards from your hand in order to play this card. Your opponent reveals their hand. Choose a Trainer you find there and put it at the bottom of your opponent’s deck. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          my.hand.getExcludedList(thisCard).select(count:2, "Discard two cards to discard.").discard()
          opp.hand.showToMe("Opponent's hand")
          opp.hand.filterByType(TRAINER).select(count:1).moveTo(opp.deck)
        }
        playRequirement {
          def hand = my.hand.getExcludedList(thisCard).size() >= 2
          assert (hand || my.opp.hand) : "Not enough cards in Hand or Opponent's hand is empty."
        }
      };
      case POKEBALL_164:
      return copy(FireRedLeafGreen.POKE_BALL_95, this);
      case SCOOP_UP_NET_165:
      return itemCard (this) {
        text "Put 1 of your Pokemon (excluding Pokemon V/GX) into your hand. (Discard all cards attached to that Pokemon.) You may play as many Item cards during your turn as you like (before your attack). (Note -  The term “Pokemon V” includes both Pokemon V and Pokemon VMAX.)"
        onPlay {
          def validTargets = my.all.findAll { it.topPokemonCard.cardTypes.is(VMAX) || it.topPokemonCard.cardTypes.is(POKEMON_V) || it.topPokemonCard.cardTypes.is(POKEMON_GX) }
          def tar = validTargets.select("Which Pokemon to put back into your hand?")
          removePCS(tar)
          tar.moveTo(my.hand)
        }
        playRequirement {
          assert my.all.findAll { it.topPokemonCard.cardTypes.is(VMAX) || it.topPokemonCard.cardTypes.is(POKEMON_V) || it.topPokemonCard.cardTypes.is(POKEMON_GX) } : "No Pokemon V/VMAX/GX on Bench"
        }
      };
      case SKYLA_166:
      return supporter (this) {
        text "Search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          my.deck.search(max: 1, "Choose a Trainer card", cardTypeFilter(TRAINER)).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement {
          assert my.deck : "Deck is empty"
        }
      };
      case SONIA_167:
      return supporter (this) {
        text "Search your deck for up to 2 Basic Pokemon or up to 2 Basic Energy, reveal them, and put them into your hand. Then, shuffle your deck. You may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          def choice = choose([0,1],["Search deck for up to 2 Basic Pokemon","Search deck for up to 2 Basic Energy"],"What do you want to do?")
          if (choice == 0) {
            deck.search(max:2, cardTypeFilter(BASIC)).moveTo(hand)
          } else {
            deck.search(max:2, cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
          }
          shuffleDeck()
        }
        playRequirement {
          assert my.deck : "Deck is empty"
        }
      };
      case TOOL_SCRAPPER_168:
      return itemCard (this) {
        text "Discard up to 2 Pokemon Tools from either player’s Pokemon. You may play as many Item cards during your turn as you like (before your attack)."
        onPlay {
          def i = 2
          while (i-- > 0) {
            def tar = all.findAll {it.cards.hasType(POKEMON_TOOL)}
            if (tar) {
              def sel = tar.select("Select Pokemon to discard a Pokemon Tool from (cancel to stop)", i == 1)
              if (sel) {
                def list = sel.cards.filterByType(POKEMON_TOOL).select("Discard a Pokemon Tool from $sel")
                targeted (sel, TRAINER_CARD) {
                  list.discard()
                }
              }
            }
          }
        }
        playRequirement{
          assert all.findAll {it.cards.hasType(POKEMON_TOOL)} : "No Pokemon Tools in play"
        }
      };
      case TRAINING_COURT_169:
      return stadium (this) {
        text "Once during each player’s turn, that player may choose a basic Energy card from their discard pile, reveal it, and put it into their hand. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
        def lastTurn=0
        def actions=[]
        onPlay {
          actions=action("Stadium: Training Court") {
            assert my.deck : "Deck is empty"
            assert my.hand : "You don't have cards in your hand"
            assert my.discard.find(cardTypeFilter(BASIC_ENERGY)) : "No Basic Energies in Discard"
            assert lastTurn != bg().turnCount : "Already used"
            bc "Used Training Court effect"
            lastTurn = bg().turnCount
            my.discard.findAll(cardTypeFilter(BASIC_ENERGY)).select("Which to move to hand?").moveTo(my.hand)
          }
        }
        onRemoveFromPlay {
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case TURRFIELD_170:
      return stadium (this) {
        text "Once during each player’s turn, that player may search their deck for a [G] Evolution Pokemon, reveal it, and put it into their hand. Then, that player shuffles their deck. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
        def lastTurn=0
        def actions=[]
        onPlay {
          actions=action("Stadium: Turrfield") {
            assert my.deck : "Deck is empty"
            assert lastTurn != bg().turnCount : "Already used"
            bc "Used Turrfield effect"
            lastTurn = bg().turnCount
            my.deck.search("Choose a [G] Evolution Pokemon", {
              it.cardTypes.is(EVOLUTION) && it.cardTypes.contains(G)
            }).moveTo(my.hand)
            shuffleDeck()
          }
        }
        onRemoveFromPlay {
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case CAPTURE_ENERGY_171:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy only while attached to a Pokemon. When attaching this card from your hand to 1 of your Pokemon, search your deck for a Basic Pokemon and put it on your Bench. Then, shuffle your deck."
        onPlay {reason->
          if (my.deck && my.bench.notFull) {
            my.deck.search (count: 1, { it.cardTypes.is(BASIC) }).each {
              my.deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
      };
      case HORROR_PSYCHIC_ENERGY_172:
      return specialEnergy (this, [[P]]) {
        text "This card provides 1 [P] Energy while it’s attached to a Pokemon. When the [P] Pokemon this card is attached to is your Active Pokemon and is damaged by an opponents attack, put 2 damage counters on the Attacking Pokemon."
        def eff
        onPlay { reason->
          eff = delayed(priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              bg().dm().each {
                if (it.to == self && self.types.contains(P) && it.dmg.value && bg.currentTurn==self.owner.opposite
                  && self.active) {
                  bc "Horror Psychic Energy activates"
                  apply CONFUSED, it.from, SRC_ABILITY
                  directDamage(20, ef.attacker as PokemonCardSet)
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case SPEED_LIGHTNING_ENERGY_173:
      return specialEnergy (this, [[L]]) {
        text "This card provides 1 [L] Energy while it’s attached to a Pokemon. When you attach this card from your hand to an [L] Pokemon, draw 2 cards"
        onPlay {reason->
          if (reason == PLAY_FROM_HAND && self.types.contains(L)) {
            draw 2
          }
        }
      };
      case TWIN_ENERGY_174:
      return specialEnergy (this, [[C,C]]) {
        text "This card provides 2 [C] Energy. If this card is attached to a Pokemon V or Pokemon GX, this card provides 1 [C] Energy instead."
        getEnergyTypesOverride {
          if (self && (self.cardTypes.contains(POKEMON_V) || self.cardTypes.contains(VMAX) || self.cardTypes.contains(GX)) {
            return [[C] as Set]
          }
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
      return copy(SwordShield.FROSMOTH_64, this);
      case PERRSERKER_205:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Steely Spirit", {
          text "The attacks of your [M] Pokemon do 20 more damage to your opponent’s Active Pokemon."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == self.owner) {
                bg.dm().each {
                  if (it.from.types.contains(M) && it.to.active && it.to != self.owner && it.notNoEffect && it.dmg.value) {
                    bc "Steely Spirit +20"
                    it.dmg += hp(20)
                  }
                }
              }
            }
          }
        }
        move "Metal Claw", {
          text "70 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GIANT_CHARM_206:
      return copy(SwordShield.BIG_CHARM_158, this);
      case SCOOP_UP_NET_207:
      return copy(SCOOP_UP_NET_165, this);
      case TOOL_SCRAPPER_208:
      return copy (TOOL_SCRAPPER_168, this);
      case TWIN_ENERGY_209:
      return copy (TWIN_ENERGY_174, this);
        default:
      return null;
    }
  }
}
