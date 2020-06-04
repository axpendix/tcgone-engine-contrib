package tcgwars.logic.impl.gen8;

import tcgwars.logic.impl.gen1.BaseSetNG;
import tcgwars.logic.impl.gen3.Emerald;
import tcgwars.logic.impl.gen5.BlackWhite;
import tcgwars.logic.impl.gen5.DarkExplorers;
import tcgwars.logic.impl.gen5.EmergingPowers;
import tcgwars.logic.impl.gen6.Flashfire;
import tcgwars.logic.impl.gen6.KalosStarterSet;
import tcgwars.logic.impl.gen7.SunMoon;
import tcgwars.logic.impl.gen7.UltraPrism;
import tcgwars.logic.impl.gen7.UnbrokenBonds;

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
 * @author (Lithogen) luongthomasdev@gmail.com
 */
public enum SwordShield implements LogicCardInfo {

  CELEBI_V_1 ("Celebi V", 1, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  ROSELIA_2 ("Roselia", 2, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ROSELIA_3 ("Roselia", 3, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ROSERADE_4 ("Roserade", 4, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  COTTONEE_5 ("Cottonee", 5, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WHIMSICOTT_6 ("Whimsicott", 6, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MARACTUS_7 ("Maractus", 7, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DURANT_8 ("Durant", 8, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  DHELMISE_V_9 ("Dhelmise V", 9, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  GROOKEY_10 ("Grookey", 10, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GROOKEY_11 ("Grookey", 11, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  THWACKEY_12 ("Thwackey", 12, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  THWACKEY_13 ("Thwackey", 13, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RILLABOOM_14 ("Rillaboom", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  RILLABOOM_15 ("Rillaboom", 15, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BLIPBUG_16 ("Blipbug", 16, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BLIPBUG_17 ("Blipbug", 17, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DOTTLER_18 ("Dottler", 18, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ORBEETLE_19 ("Orbeetle", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GOSSIFLEUR_20 ("Gossifleur", 20, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_21 ("Eldegoss", 21, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VULPIX_22 ("Vulpix", 22, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  NINETALES_23 ("Ninetales", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TORKOAL_V_24 ("Torkoal V", 24, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VICTINI_V_25 ("Victini V", 25, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  HEATMOR_26 ("Heatmor", 26, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  SALANDIT_27 ("Salandit", 27, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SALAZZLE_28 ("Salazzle", 28, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TURTONATOR_29 ("Turtonator", 29, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  SCORBUNNY_30 ("Scorbunny", 30, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SCORBUNNY_31 ("Scorbunny", 31, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  RABOOT_32 ("Raboot", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  RABOOT_33 ("Raboot", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CINDERACE_34 ("Cinderace", 34, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CINDERACE_35 ("Cinderace", 35, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CINDERACE_36 ("Cinderace", 36, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  SIZZLIPEDE_37 ("Sizzlipede", 37, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SIZZLIPEDE_38 ("Sizzlipede", 38, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CENTISKORCH_39 ("Centiskorch", 39, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SHELLDER_40 ("Shellder", 40, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CLOYSTER_41 ("Cloyster", 41, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KRABBY_42 ("Krabby", 42, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  KRABBY_43 ("Krabby", 43, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  KINGLER_44 ("Kingler", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GOLDEEN_45 ("Goldeen", 45, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GOLDEEN_46 ("Goldeen", 46, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEAKING_47 ("Seaking", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LAPRAS_48 ("Lapras", 48, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  LAPRAS_V_49 ("Lapras V", 49, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  LAPRAS_VMAX_50 ("Lapras VMAX", 50, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, STAGE1, _WATER_]),
  QWILFISH_51 ("Qwilfish", 51, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MANTINE_52 ("Mantine", 52, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  KELDEO_V_53 ("Keldeo V", 53, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  SOBBLE_54 ("Sobble", 54, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SOBBLE_55 ("Sobble", 55, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DRIZZILE_56 ("Drizzile", 56, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRIZZILE_57 ("Drizzile", 57, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  INTELEON_58 ("Inteleon", 58, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  INTELEON_59 ("Inteleon", 59, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CHEWTLE_60 ("Chewtle", 60, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DREDNAW_61 ("Drednaw", 61, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRAMORANT_62 ("Cramorant", 62, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  SNOM_63 ("Snom", 63, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  FROSMOTH_64 ("Frosmoth", 64, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_65 ("Pikachu", 65, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_66 ("Raichu", 66, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  CHINCHOU_67 ("Chinchou", 67, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CHINCHOU_68 ("Chinchou", 68, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  LANTURN_69 ("Lanturn", 69, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTIK_70 ("Joltik", 70, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  GALVANTULA_71 ("Galvantula", 71, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TAPU_KOKO_V_72 ("Tapu Koko V", 72, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  YAMPER_73 ("Yamper", 73, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  YAMPER_74 ("Yamper", 74, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  BOLTUND_75 ("Boltund", 75, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  BOLTUND_76 ("Boltund", 76, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PINCURCHIN_77 ("Pincurchin", 77, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_78 ("Morpeko", 78, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_V_79 ("Morpeko V", 79, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  MORPEKO_VMAX_80 ("Morpeko VMAX", 80, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, STAGE1, _LIGHTNING_]),
  GALARIAN_PONYTA_81 ("Galarian Ponyta", 81, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GALARIAN_RAPIDASH_82 ("Galarian Rapidash", 82, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GASTLY_83 ("Gastly", 83, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HAUNTER_84 ("Haunter", 84, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GENGAR_85 ("Gengar", 85, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  WOBBUFFET_V_86 ("Wobbuffet V", 86, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  MUNNA_87 ("Munna", 87, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MUSHARNA_88 ("Musharna", 88, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SINISTEA_89 ("Sinistea", 89, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_90 ("Polteageist", 90, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  INDEEDEE_V_91 ("Indeedee V", 91, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  DIGLETT_92 ("Diglett", 92, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_93 ("Dugtrio", 93, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HITMONLEE_94 ("Hitmonlee", 94, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  HITMONCHAN_95 ("Hitmonchan", 95, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYHORN_96 ("Rhyhorn", 96, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYHORN_97 ("Rhyhorn", 97, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYDON_98 ("Rhydon", 98, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYPERIOR_99 ("Rhyperior", 99, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SUDOWOODO_100 ("Sudowoodo", 100, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  BALTOY_101 ("Baltoy", 101, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  BALTOY_102 ("Baltoy", 102, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CLAYDOL_103 ("Claydol", 103, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  REGIROCK_V_104 ("Regirock V", 104, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  MUDBRAY_105 ("Mudbray", 105, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MUDSDALE_106 ("Mudsdale", 106, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SILICOBRA_107 ("Silicobra", 107, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SILICOBRA_108 ("Silicobra", 108, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDACONDA_109 ("Sandaconda", 109, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SANDACONDA_110 ("Sandaconda", 110, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CLOBBOPUS_111 ("Clobbopus", 111, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CLOBBOPUS_112 ("Clobbopus", 112, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_113 ("Grapploct", 113, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_, NOT_IMPLEMENTED]),
  STONJOURNER_114 ("Stonjourner", 114, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  STONJOURNER_V_115 ("Stonjourner V", 115, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  STONJOURNER_VMAX_116 ("Stonjourner VMAX", 116, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, STAGE1, _FIGHTING_]),
  GALARIAN_ZIGZAGOON_117 ("Galarian Zigzagoon", 117, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_LINOONE_118 ("Galarian Linoone", 118, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_OBSTAGOON_119 ("Galarian Obstagoon", 119, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  SABLEYE_V_120 ("Sableye V", 120, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  SKORUPI_121 ("Skorupi", 121, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  DRAPION_122 ("Drapion", 122, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CROAGUNK_123 ("Croagunk", 123, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TOXICROAK_124 ("Toxicroak", 124, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  NICKIT_125 ("Nickit", 125, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_126 ("Thievul", 126, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MEOWTH_127 ("Galarian Meowth", 127, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_128 ("Galarian Perrserker", 128, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MAWILE_129 ("Mawile", 129, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  FERROSEED_130 ("Ferroseed", 130, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  FERROTHORN_131 ("Ferrothorn", 131, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GALARIAN_STUNFISK_132 ("Galarian Stunfisk", 132, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  PAWNIARD_133 ("Pawniard", 133, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BISHARP_134 ("Bisharp", 134, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CORVIKNIGHT_135 ("Corviknight", 135, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  CUFANT_136 ("Cufant", 136, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_137 ("Copperajah", 137, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ZACIAN_V_138 ("Zacian V", 138, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_139 ("Zamazenta V", 139, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  SNORLAX_140 ("Snorlax", 140, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  SNORLAX_V_141 ("Snorlax V", 141, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  SNORLAX_VMAX_142 ("Snorlax VMAX", 142, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, STAGE1, _COLORLESS_]),
  HOOTHOOT_143 ("Hoothoot", 143, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  NOCTOWL_144 ("Noctowl", 144, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  MINCCINO_145 ("Minccino", 145, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MINCCINO_146 ("Minccino", 146, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CINCCINO_147 ("Cinccino", 147, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ORANGURU_148 ("Oranguru", 148, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  DRAMPA_149 ("Drampa", 149, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  ROOKIDEE_150 ("Rookidee", 150, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CORVISQUIRE_151 ("Corvisquire", 151, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WOOLOO_152 ("Wooloo", 152, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  WOOLOO_153 ("Wooloo", 153, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DUBWOOL_154 ("Dubwool", 154, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CRAMORANT_V_155 ("Cramorant V", 155, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  AIR_BALLOON_156 ("Air Balloon", 156, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BEDE_157 ("Bede", 157, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BIG_CHARM_158 ("Big Charm", 158, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  CRUSHING_HAMMER_159 ("Crushing Hammer", 159, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_RETRIEVAL_160 ("Energy Retrieval", 160, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_161 ("Energy Search", 161, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SWITCH_162 ("Energy Switch", 162, Rarity.UNCOMMON, [TRAINER, ITEM]),
  EVOLUTION_INCENSE_163 ("Evolution Incense", 163, Rarity.UNCOMMON, [TRAINER, ITEM]),
  GREAT_BALL_164 ("Great Ball", 164, Rarity.UNCOMMON, [TRAINER, ITEM]),
  HOP_165 ("Hop", 165, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HYPER_POTION_166 ("Hyper Potion", 166, Rarity.UNCOMMON, [TRAINER, ITEM]),
  LUCKY_EGG_167 ("Lucky Egg", 167, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  LUM_BERRY_168 ("Lum Berry", 168, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  MARNIE_169 ("Marnie", 169, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  METAL_SAUCER_170 ("Metal Saucer", 170, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ORDINARY_ROD_171 ("Ordinary Rod", 171, Rarity.UNCOMMON, [TRAINER, ITEM]),
  PAL_PAD_172 ("Pal Pad", 172, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_KID_173 ("Poké Kid", 173, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEGEAR_3_0_174 ("Pokégear 3.0", 174, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKEMON_CATCHER_175 ("Pokémon Catcher", 175, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKEMON_CENTER_LADY_176 ("Pokémon Center Lady", 176, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POTION_177 ("Potion", 177, Rarity.UNCOMMON, [TRAINER, ITEM]),
  PROFESSOR_S_RESEARCH_178 ("Professor's Research", 178, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  QUICK_BALL_179 ("Quick Ball", 179, Rarity.UNCOMMON, [TRAINER, ITEM]),
  RARE_CANDY_180 ("Rare Candy", 180, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ROTOM_BIKE_181 ("Rotom Bike", 181, Rarity.UNCOMMON, [TRAINER, ITEM]),
  SITRUS_BERRY_182 ("Sitrus Berry", 182, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SWITCH_183 ("Switch", 183, Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_YELL_GRUNT_184 ("Team Yell Grunt", 184, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  VITALITY_BAND_185 ("Vitality Band", 185, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  AURORA_ENERGY_186 ("Aurora Energy", 186, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  DHELMISE_V_187 ("Dhelmise V", 187, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TORKOAL_V_188 ("Torkoal V", 188, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  LAPRAS_V_189 ("Lapras V", 189, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  MORPEKO_V_190 ("Morpeko V", 190, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  WOBBUFFET_V_191 ("Wobbuffet V", 191, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  INDEEDEE_V_192 ("Indeedee V", 192, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  STONJOURNER_V_193 ("Stonjourner V", 193, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  SABLEYE_V_194 ("Sableye V", 194, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  ZACIAN_V_195 ("Zacian V", 195, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_196 ("Zamazenta V", 196, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  SNORLAX_V_197 ("Snorlax V", 197, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CRAMORANT_V_198 ("Cramorant V", 198, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  BEDE_199 ("Bede", 199, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  MARNIE_200 ("Marnie", 200, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  PROFESSOR_S_RESEARCH_201 ("Professor's Research", 201, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  TEAM_YELL_GRUNT_202 ("Team Yell Grunt", 202, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  LAPRAS_VMAX_203 ("Lapras VMAX", 203, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, STAGE1, _WATER_]),
  MORPEKO_VMAX_204 ("Morpeko VMAX", 204, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, STAGE1, _LIGHTNING_]),
  STONJOURNER_VMAX_205 ("Stonjourner VMAX", 205, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, STAGE1, _FIGHTING_]),
  SNORLAX_VMAX_206 ("Snorlax VMAX", 206, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, STAGE1, _COLORLESS_]),
  BEDE_207 ("Bede", 207, Rarity.SECRET, [TRAINER, SUPPORTER]),
  MARNIE_208 ("Marnie", 208, Rarity.SECRET, [TRAINER, SUPPORTER]),
  PROFESSOR_S_RESEARCH_209 ("Professor's Research", 209, Rarity.SECRET, [TRAINER, SUPPORTER]),
  TEAM_YELL_GRUNT_210 ("Team Yell Grunt", 210, Rarity.SECRET, [TRAINER, SUPPORTER]),
  ZACIAN_V_211 ("Zacian V", 211, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_212 ("Zamazenta V", 212, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  AIR_BALLOON_213 ("Air Balloon", 213, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  METAL_SAUCER_214 ("Metal Saucer", 214, Rarity.SECRET, [TRAINER, ITEM]),
  ORDINARY_ROD_215 ("Ordinary Rod", 215, Rarity.SECRET, [TRAINER, ITEM]),
  QUICK_BALL_216 ("Quick Ball", 216, Rarity.SECRET, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  SwordShield(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SWORD_SHIELD;
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
      case CELEBI_V_1:
      return basic (this, hp:HP180, type:G, retreatCost:1) {
        weakness R
        move "Find a Friend", {
          text "Search your deck for up to 2 Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost G
          attackRequirement {
            assert deck.notEmpty
          }
          onAttack {
            my.deck.search(max: 2, cardTypeFilter(POKEMON)).showToOpponent("Opponent's selected Pokémon.").moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Line Force", {
          text "50+ damage. This attack does 20 more damage for each of your Benched Pokémon."
          energyCost G, C
          onAttack {
            damage 50+20*my.bench.size()
          }
        }
      };
      case ROSELIA_2:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Absorb", {
          text "10 damage. Heal 10 damage from this Pokémon."
          energyCost G
          onAttack {
            damage 10
            heal 10, self
          }
        }
      };
      case ROSELIA_3:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Sweet Scent", {
          text "Heal 30 damage from 1 of your Pokémon."
          energyCost C
          attackRequirement {
            assert my.all.findAll { it.numberOfDamageCounters }
          }
          onAttack {
            heal 30, my.all.findAll { it.numberOfDamageCounters }.select()
          }
        }
        move "Sting", {
          text "20 damage."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case ROSERADE_4:
      return evolution (this, from:"Roselia", hp:HP120, type:G, retreatCost:1) {
        weakness R
        move "Paralyze Poison", {
          text "30 damage. Your opponent’s Active Pokémon is now Poisoned. Flip a coin. If heads, your opponent’s Active Pokémon is also Paralyzed."
          energyCost G
          onAttack {
            damage 30
            apply POISONED
            flip { apply PARALYZED }
          }
        }
        move "Mega Drain", {
          text "90 damage. Heal 30 damage from this Pokémon."
          energyCost G, C, C
          onAttack {
            damage 90
            heal 30, self
          }
        }
      };
      case COTTONEE_5:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Attach", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case WHIMSICOTT_6:
      return evolution (this, from:"Cottonee", hp:HP100, type:G, retreatCost:1) {
        weakness R
        move "Cotton Ride", {
          text "Flip a coin. If heads, your opponent shuffles their Active Pokémon and all attached cards into their deck."
          energyCost C
          onAttack {
            flip {
              defending.cards.moveTo(opp.deck)
              removePCS(defending)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
        }
        move "Leaf Step", {
          text "50 damage."
          energyCost G
          onAttack {
            damage 50
          }
        }
      };
      case MARACTUS_7:
      return basic (this, hp:HP110, type:G, retreatCost:2) {
        weakness R
        move "Zzzt", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Powerful Needles", {
          text "60x damage. Flip a coin for each Energy attached to this Pokémon. This attack does 60 damage for each heads."
          energyCost G, C
          onAttack {
            flip self.cards.energyCount(C), { damage 60 }
          }
        }
      };
      case DURANT_8:
      return basic (this, hp:HP110, type:G, retreatCost:1) {
        weakness R
        move "Bite Together", {
          text "30+ damage. If Durant is on your Bench, this attack does 60 more damage."
          energyCost G, C
          onAttack {
            damage 30
            if (my.bench.find({ it.name == "Durant" })) {
              damage 60
            }
          }
        }
      };
      case DHELMISE_V_9:
      return basic (this, hp:HP220, type:G, retreatCost:2) {
        weakness R
        move "Anchor Anger", {
          text "30+ damage. If any of your [G] Pokémon were Knocked Out by damage from an opponent’s attack during their last turn, this attack does 90 more damage."
          energyCost G
          onAttack {
            damage 30
            if (my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1 && my.lastKnockoutTypes && my.lastKnockoutTypes.contains(G)) damage 90
          }
        }
        move "Giga Hammer", {
          text "200 damage. During your next turn, this Pokémon can't use Giga Hammer."
          energyCost G, G, C
          onAttack {
            damage 200
            cantUseAttack(thisMove, self)
          }
        }
      };
      case GROOKEY_10:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage for each heads."
          energyCost C
          onAttack {
            flip 3, { damage 10 }
          }
        }
      };
      case GROOKEY_11:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Beat", {
          text "20 damage."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case THWACKEY_12:
      return evolution (this, from:"Grookey", hp:HP100, type:G, retreatCost:2) {
        weakness R
        move "Taunt", {
          text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
          energyCost C
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            sw(opp.active, opp.bench.select())
          }
        }
        move "Double Hit", {
          text "60x damage. Flip 2 coins. This attack does 60 damage for each heads."
          energyCost G, G, C
          onAttack {
            flip 2, { damage 60 }
          }
        }
      };
      case THWACKEY_13:
      return evolution (this, from:"Grookey", hp:HP100, type:G, retreatCost:2) {
        weakness R
        move "Beat", {
          text "30 damage."
          energyCost G, C
          onAttack {
            damage 30
          }
        }
        move "Ambush", {
          text "50+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost G, G, C
          onAttack {
            damage 50
            flip { damage 30 }
          }
        }
      };
      case RILLABOOM_14:
      return evolution (this, from:"Thwackey", hp:HP170, type:G, retreatCost:3) {
        weakness R
        bwAbility "Voltage Beat", {
          text "Once during your turn, you may search your deck for up to 2 [G] Energy cards and attach them to 1 of your Pokémon. Then, shuffle your deck."
          actionA {
            checkLastTurn()
            assert my.deck : "Your deck is empty."
            powerUsed()
            def list = my.deck.search (max: 2, basicEnergyFilter(G))
            def pcs = my.all.select("Attach to?")
            list.each { attachEnergy(pcs, it) }
            shuffleDeck()
          }
        }
        move "Hammer In", {
          text "140 damage."
          energyCost G, G, G, C
          onAttack {
            damage 140
          }
        }
      };
      case RILLABOOM_15:
      return evolution (this, from:"Thwackey", hp:HP190, type:G, retreatCost:4) {
        weakness R
        move "Drum Roll", {
          text "90 damage. This attack also does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, G, C
          onAttack {
            damage 90
            opp.bench.each { damage 10, it }
          }
        }
        move "Drum Beating", {
          text "180 damage. During your next turn, this Pokémon can't use Drum Beating."
          energyCost G, G, G, C
          onAttack {
            damage 180
            cantUseAttack(thisMove, self)
          }
        }
      };
      case BLIPBUG_16:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "20 damage."
          energyCost G
          onAttack {
            damage 20
          }
        }
      };
      case BLIPBUG_17:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily(basic: true, 1, delegate)
        }
      };
      case DOTTLER_18:
      return evolution (this, from:"Blipbug", hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Reflect", {
          text "During your opponent's next turn, this Pokémon takes 40 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C
          onAttack {
            reduceDamageNextTurn(hp(40),thisMove)
          }
        }
        move "Ram", {
          text "30 damage."
          energyCost G, C
          onAttack {
            damage 30
          }
        }
      };
      case ORBEETLE_19:
      return evolution (this, from:"Dottler", hp:HP130, type:G, retreatCost:1) {
        weakness R
        bwAbility "Bug’s Radar", {
          text "Once during your turn, you may look at the top 3 cards of your opponent’s deck and put them back in any order."
          actionA {
            checkLastTurn()
            assert opp.deck : "The opponent's deck is empty."
            powerUsed()

            def rearrangedCards = rearrange(opp.deck.subList(0, 3))
            opp.deck.setSubList(0, rearrangedCards)

            bc "Rearranged top 3 cards of opponent's (${opp.owner.getPlayerUsername(bg)}) deck."
          }
        }
        move "Brainwave", {
          text "90+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon."
          energyCost G, C
          onAttack {
            damage 90+30*self.cards.energyCount(P)
          }
        }
      };
      case GOSSIFLEUR_20:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Call for Family", {
          text "Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily(basic: true, 3, delegate)
        }
        move "Razor Leaf", {
          text "10 damage."
          energyCost G
          onAttack {
            damage 10
          }
        }
      };
      case ELDEGOSS_21:
      return evolution (this, from:"Gossifleur", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Blessing of Fluff", {
          text "Search your deck for up to 3 [G] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert my.bench : "You don't have Pokémon on your bench"
          }
          onAttack {
            my.deck.filterByEnergyType(G).select(max: 3).each {
              attachEnergy(my.bench.select("Attach"), it)
            }
          }
        }
        move "Leafage", {
          text "30 damage."
          energyCost G
          onAttack {
            damage 30
          }
        }
      };
      case VULPIX_22:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "20 damage."
          energyCost R
          onAttack {
            damage 20
          }
        }
      };
      case NINETALES_23:
      return evolution (this, from:"Vulpix", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Flame Cloak", {
          text "30 damage. Attach a [R] Energy card from your discard pile to this Pokémon."
          energyCost R
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type: R, my.discard, self)
            }
          }
        }
        move "Fire Mane", {
          text "70 damage."
          energyCost R, C
          onAttack {
            damage 70
          }
        }
      };
      case TORKOAL_V_24:
      return basic (this, hp:HP210, type:R, retreatCost:4) {
        weakness W
        move "Combustion Pillar", {
          text "90+ damage. Discard the top card of your deck. If that card is a [R] Energy card, this attack does 90 more damage."
          energyCost R, R, C
          onAttack {
            damage 90
            def cards = my.deck.subList(0, 1)
            if (cards.filterByEnergyType(R)) {
              damage 90
            }
            cards.discard()
          }
        }
        move "Steam Crush", {
          text "120 damage. Discard 2 Energy from your opponent’s Active Pokémon."
          energyCost R, R, R, C
          onAttack {
            damage 120
            discardDefendingEnergy()
            discardDefendingEnergy()
          }
        }
      };
      case VICTINI_V_25:
      return basic (this, hp:HP190, type:R, retreatCost:2) {
        weakness W
        move "Spreading Flames", {
          text "Attach up to 3 [R] Energy cards from your discard pile to your Pokémon in any way you like."
          energyCost C
          attackRequirement {
            assert my.discard.filterByEnergyType(R) : "No [R] Energy in the discard pile."
          }
          onAttack {
            def list=my.discard.filterByEnergyType(R)
            list.select(max:3).each {
              attachEnergy(my.all.select("Attach $it to?"),it)
            }
          }
        }
        move "Energy Burst", {
          text "30x damage. This attack does 30 damage for each Energy attached to both Active Pokémon."
          energyCost R, R
          onAttack {
            damage 30*(self.cards.energyCount(C)+defending.cards.energyCount(C))
          }
        }
      };
      case HEATMOR_26:
      return basic (this, hp:HP110, type:R, retreatCost:1) {
        weakness W
        move "Searing Flame", {
          text "10 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 10
            apply BURNED
          }
        }
        move "Fire Claws", {
          text "50 damage."
          energyCost R, R
          onAttack {
            damage 50
          }
        }
      };
      case SALANDIT_27:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smog", {
          text "Your opponent’s Active Pokémon is now Poisoned."
          energyCost R
          onAttack {
            apply POISONED
          }
        }
      };
      case SALAZZLE_28:
      return evolution (this, from:"Salandit", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Searing Flame", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 20
            apply BURNED
          }
        }
        move "Bright Flame", {
          text "120 damage. Discard 2 Energy from this Pokémon."
          energyCost R, C
          onAttack {
            damage 120
            discardSelfEnergy(C, C)
          }
        }
      };
      case TURTONATOR_29:
      return basic (this, hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Tackle", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Fire Spin", {
          text "150 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, R, C
          onAttack {
            damage 150
            discardSelfEnergy(C, C)
          }
        }
      };
      case SCORBUNNY_30:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard an Energy from this Pokémon."
          energyCost R
          onAttack {
            damage 30
            discardSelfEnergy(C)
          }
        }
      };
      case SCORBUNNY_31:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Flare", {
          text "20 damage."
          energyCost R, C
          onAttack {
            damage 20
          }
        }
      };
      case RABOOT_32:
      return evolution (this, from:"Scorbunny", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Flame Charge", {
          text "20 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
          energyCost R
          onAttack {
            damage 20
            attachEnergyFrom(type: R, my.deck, self)
            shuffleDeck()
          }
        }
        move "Magnum Kick", {
          text "70 damage."
          energyCost R, R, C
          onAttack {
            damage 70
          }
        }
      };
      case RABOOT_33:
      return evolution (this, from:"Scorbunny", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Kick", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Heat Blast", {
          text "50 damage."
          energyCost R, R
          onAttack {
            damage 50
          }
        }
      };
      case CINDERACE_34:
      return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
        weakness W
        bwAbility "Libero", {
          text "Once during your turn, when this Pokémon moves from your Bench to the Active Spot, you may attach up to 2 [R] Energy cards from your discard pile to it."
          delayedA{
            after SWITCH, {
              if (bg.em().retrieveObject("Libero") != bg.turnCount && self.active && bg.currentTurn == self.owner && ef.switchedOut==self && confirm("Use Libero?")) {
                powerUsed()
                bg.em().storeObject("Libero", bg.turnCount)
                attachEnergyFrom(max: 2, type: FIRE, my.discard, self)
              }
            }
          }
        }
        move "Flare Striker", {
          text "190 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, C
          onAttack {
            damage 190
            discardSelfEnergy(C, C)
          }
        }
      };
      case CINDERACE_35:
      return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
        weakness W
        move "Pyro Ball", {
          text "50 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 50
            apply BURNED
          }
        }
        move "Burning Kick", {
          text "160 damage. Discard all Energy from this Pokémon."
          energyCost R, R
          onAttack {
            damage 160
            discardAllSelfEnergy(null)
          }
        }
      };
      case CINDERACE_36:
      return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
        weakness W
        move "Flame Cloak", {
          text "40 damage. Attach a [R] Energy card from your discard pile to this Pokémon."
          energyCost R
          onAttack {
            damage 40
            afterDamage {
              attachEnergyFrom(type: FIRE, my.discard, self)
            }
          }
        }
        move "Bright Flame", {
          text "160 damage. Flip a coin. If tails, discard 2 Energy from this Pokémon."
          energyCost R, R, C
          onAttack {
            damage 160
            flip 1, {}, { discardSelfEnergy(C, C) }
          }
        }
      };
      case SIZZLIPEDE_37:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Combustion", {
          text "50 damage."
          energyCost R, C, C
          onAttack {
            damage 50
          }
        }
      };
      case SIZZLIPEDE_38:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Relentless Flames", {
          text "40x damage. Flip a coin until you get tails. This attack does 40 damage for each heads."
          energyCost R, C
          onAttack {
            flipUntilTails { damage 40 }
          }
        }
      };
      case CENTISKORCH_39:
      return evolution (this, from:"Sizzlipede", hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Hundred Foot Flames", {
          text "For each [R] Energy attached to this Pokémon, discard the top card of your opponent’s deck."
          energyCost R
          onAttack {
            opp.deck.subList(0, self.cards.energyCount(R)).discard()
          }
          attackRequirement {
            assert opp.deck : "Your opponent's deck is empty"
          }
        }
        move "Searing Flame", {
          text "110 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C, C, C
          onAttack {
            damage 110
            apply BURNED
          }
        }
      };
      case SHELLDER_40:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Water Splash", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost W, C
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
      };
      case CLOYSTER_41:
      return evolution (this, from:"Shellder", hp:HP130, type:W, retreatCost:2) {
        weakness L
        move "Shell Grab", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            damage 30
            flip { apply PARALYZED }
          }
        }
        move "Tidal Wave", {
          text "100 damage."
          energyCost W, C, C
          onAttack {
            damage 100
          }
        }
      };
      case KRABBY_42:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Aqua Shower", {
          text "This attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          onAttack {
            opp.all.each { damage 10, it }
          }
        }
        move "Vise Grip", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
      };
      case KRABBY_43:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Super Slice", {
          text "120 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
          energyCost C, C
          onAttack {
            flip 2,{},{},[2:{damage 120},1:{bc "$thisMove failed"},0:{bc "$thisMove failed"}]
          }
        }
      };
      case KINGLER_44:
      return evolution (this, from:"Krabby", hp:HP130, type:W, retreatCost:2) {
        weakness L
        move "Heavy Pincers", {
          text "40 damage. Discard the top card of your opponent’s deck."
          energyCost W
          onAttack {
            damage 40
            if (opp.deck) {
              opp.deck.subList(0,1).discard()
            }
          }
        }
        move "Claw Rend", {
          text "90+ damage. If your opponent’s Active Pokémon already has any damage counters on it, this attack does 60 more damage."
          energyCost W, C, C
          onAttack {
            damage 90
            if (opp.active.numberOfDamageCounters)
              damage 60
          }
        }
      };
      case GOLDEEN_45:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Horn Attack", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case GOLDEEN_46:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Collect", {
          text "Draw a card."
          energyCost C
          onAttack {
            draw 1
          }
        }
        move "Waterfall", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case SEAKING_47:
      return evolution (this, from:"Goldeen", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Ripping Horn", {
          text "Flip 3 coins. For each heads, discard an Energy from your opponent’s Active Pokémon."
          energyCost W
          onAttack {
            flip 3, { discardDefendingEnergy() }
          }
        }
        move "Pierce", {
          text "50 damage."
          energyCost C, C
          onAttack {
            damage 50
          }
        }
      };
      case LAPRAS_48:
      return basic (this, hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Aqua Wash", {
          text "70 damage. You may put 2 Energy attached to your opponent’s Active Pokémon into their hand."
          energyCost W, W, W, W
          onAttack {
            damage 70
            afterDamage {
              if (opp.active.cards.filterByType(ENERGY)) {
                opp.active.cards.filterByType(ENERGY).select(max: 2, "Choose the energy to return to your opponent's hand").moveTo(opp.hand)
              }
            }
          }
        }
      };
      case LAPRAS_V_49:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        move "Body Surf", {
          text "Attach a [W] Energy card from your hand to this Pokémon. If you do, switch it with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {
            assert my.hand.filterByEnergyType(W)
          }
          onAttack {
            attachEnergyFrom(type:W, my.hand, self)
            if (bench) {
              def tar = my.bench.select("Select the Pokémon to switch with Lapras V.")
              sw self, tar
            }
          }
        }
        move "Ocean Loop", {
          text "210 damage. Put 2 [W] Energy attached to this Pokémon into your hand."
          energyCost W, W, W, C
          onAttack {
            damage 210
            afterDamage {
              self.cards.filterByEnergyType(W).select("Which [W] Energy to move to your hand?").moveTo(my.hand)
              self.cards.filterByEnergyType(W).select("Which [W] Energy to move to your hand?").moveTo(my.hand)
            }
          }
        }
      };
      case LAPRAS_VMAX_50:
      return evolution (this, from:"Lapras V", hp:HP320, type:W, retreatCost:3) {
        weakness L
        move "G-Max Pump", {
          text "90+ damage. This attack does 30 more damage for each [W] Energy attached to this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 90+30*self.cards.energyCount(W)
          }
        }
      };
      case QWILFISH_51:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness L
        bwAbility "Poison Point", {
          text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Poisoned."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                bc "Poison Point"
                apply POISONED, (ef.attacker as PokemonCardSet), SRC_ABILITY
              }
            }
            after SWITCH, self, {unregister()}
          }
        }
        move "Venoshock", {
          text "10+ damage. If your opponent’s Active Pokémon is Poisoned, this attack does 60 more damage."
          energyCost C
          onAttack {
            damage 10
            if (defending.isSPC(POISONED)) damage 60
          }
        }
      };
      case MANTINE_52:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        move "Water Reserve", {
          text "Search your deck for up to 3 [W] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost W
          attackRequirement {
            assert my.deck
          }
          onAttack {
            my.deck.search(max:3, "Select up to 3 [W] Energy cards.", basicEnergyFilter(W)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Wave Splash", {
          text "60 damage."
          energyCost W, W
          onAttack {
            damage 60
          }
        }
      };
      case KELDEO_V_53:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        move "Wave Splash", {
          text "40 damage."
          energyCost W
          onAttack {
            damage 40
          }
        }
        move "Secret Sword", {
          text "50+ damage. This attack does 30 more damage for each [W] Energy attached to this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 50+30*self.cards.energyCount(W)
          }
        }
      };
      case SOBBLE_54:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "20 damage."
          energyCost W
          onAttack {
            damage 20
          }
        }
      };
      case SOBBLE_55:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Pound", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Water Gun", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case DRIZZILE_56:
      return evolution (this, from:"Sobble", hp:HP090, type:W, retreatCost:1) {
        weakness L
        bwAbility "Shady Dealings", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
          onActivate {r->
            if (r==PLAY_FROM_HAND && my.deck && confirm("Use Shady Dealings?")) {
              powerUsed()
              my.deck.search(max:1, "Choose a Trainer card.", cardTypeFilter(TRAINER)).showToOpponent("Opponent's chosen Trainer card.").moveTo(my.hand)
              shuffleDeck()
            }
          }
        }
        move "Water Drip", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
      };
      case DRIZZILE_57:
      return evolution (this, from:"Sobble", hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Rain Splash", {
          text "30 damage."
          energyCost W
          onAttack {
            damage 30
          }
        }
        move "Wave Splash", {
          text "40 damage."
          energyCost W, C
          onAttack {
            damage 40
          }
        }
      };
      case INTELEON_58:
      return evolution (this, from:"Drizzile", hp:HP160, type:W, retreatCost:1) {
        weakness L
        bwAbility "Shady Dealings", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck."
          onActivate {r->
            if (r==PLAY_FROM_HAND && my.deck && confirm("Use Shady Dealings?")) {
              powerUsed()
              my.deck.search(max:2, "Choose a Trainer card.", cardTypeFilter(TRAINER)).showToOpponent("Opponent's chosen Trainer card.").moveTo(my.hand)
              shuffleDeck()
            }
          }
        }
        move "Aqua Bullet", {
          text "120 damage. This attack also does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          onAttack {
            damage 120
            if (opp.bench) damage 20, opp.bench.select()
          }
        }
      };
      case INTELEON_59:
      return evolution (this, from:"Drizzile", hp:HP160, type:W, retreatCost:1) {
        weakness L
        move "Silent Shot", {
          text "40 damage. Discard a random card from your opponent’s hand."
          energyCost C
          onAttack {
            damage 40
            opp.hand.select(hidden: true, count: 1, "Choose a random card from your opponent's hand to be discarded.").showToMe("Selected card.").showToOpponent("This card will be discarded.").discard()
          }
        }
        move "Hydro Snipe", {
          text "100 damage. You may put an Energy attached to your opponent’s Active Pokémon into their hand."
          energyCost W, C
          onAttack {
            damage 100
            if (opp.active.cards.filterByType(ENERGY) && confirm("Put an Energy attached to their active back to their hand?")) {
              opp.active.cards.filterByType(ENERGY).select("Choose the Energy to put back in the opponent's hand.").moveTo(opp.hand)
            }
          }
        }
      };
      case CHEWTLE_60:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Bite", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Water Gun", {
          text "50 damage."
          energyCost W, C, C
          onAttack {
            damage 50
          }
        }
      };
      case DREDNAW_61:
      return evolution (this, from:"Chewtle", hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Vise Bite", {
          text "60+ damage. This attack does 30 more damage for each [C] in your opponent’s Active Pokémon’s Retreat Cost."
          energyCost W, C, C
          onAttack {
            damage 60+30*opp.active.retreatCost
          }
        }
        move "Jaw Lock", {
          text "130 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost W, C, C, C
          onAttack {
            damage 130
            cantRetreat defending
          }
        }
      };
      case CRAMORANT_62:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        move "Water Arrow", {
          text "This attack does 20 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          onAttack {
            damage 20, opp.all.select()
          }
        }
        move "Water Gun", {
          text "50 damage."
          energyCost W, W
          onAttack {
            damage 50
          }
        }
      };
      case SNOM_63:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Ram", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case FROSMOTH_64:
      return evolution (this, from:"Snom", hp:HP090, type:W, retreatCost:2) {
        weakness M
        bwAbility "Ice Dance", {
          text "As often as you like during your turn, you may attach a [W] Energy card from your hand to 1 of your Benched [W] Pokémon."
          actionA {
            if (confirm("Use Ice Dance?")) {
              powerUsed()
              attachEnergyFrom(type:W, my.hand, my.bench.findAll { it.types.contains(W) })
            }
          }
        }
        move "Aurora Beam", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
      };
      case PIKACHU_65:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Charge", {
          text "Search your deck for a [L] Energy card and attach it to this Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck
          }
          onAttack {
            attachEnergyFrom(type: L, my.deck, self)
            shuffleDeck()
          }
        }
        move "Electro Ball", {
          text "20 damage."
          energyCost L, C
          onAttack {
            damage 20
          }
        }
      };
      case RAICHU_66:
      return evolution (this, from:"Pikachu", hp:HP130, type:L, retreatCost:1) {
        weakness F
        move "Pain-Full Punch", {
          text "40 damage."
          energyCost C
          onAttack {
            damage 40
          }
        }
        move "Mach Bolt", {
          text "120 damage."
          energyCost L, L, C
          onAttack {
            damage 120
          }
        }
      };
      case CHINCHOU_67:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Gentle Slap", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
      };
      case CHINCHOU_68:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Luring Glow", {
          text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
          energyCost L
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            sw(opp.active, opp.bench.select())
          }
        }
        move "Lightning Ball", {
          text "20 damage."
          energyCost L, C
          onAttack {
            damage 20
          }
        }
      };
      case LANTURN_69:
      return evolution (this, from:"Chinchou", hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Ram", {
          text "30 damage."
          energyCost C
          onAttack {
            damage 30
          }
        }
        move "Strobe Shock", {
          text "90 damage. Your opponent reveals their hand. If you find any Energy cards there, your opponent’s Active Pokémon is now Paralyzed."
          energyCost L, C, C
          onAttack {
            damage 90
            opp.hand.showToMe("Your opponent's hand.")
            if (opp.hand.filterByType(ENERGY)) apply PARALYZED
          }
        }
      };
      case JOLTIK_70:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Flop", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case GALVANTULA_71:
      return evolution (this, from:"Joltik", hp:HP100, type:L, retreatCost:1) {
        weakness F
        move "Volt Wave", {
          text "60 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 60
            flip { apply PARALYZED }
          }
        }
      };
      case TAPU_KOKO_V_72:
      return basic (this, hp:HP200, type:L, retreatCost:0) {
        weakness F
        move "Spike Draw", {
          text "20 damage. Draw 2 cards."
          energyCost L
          onAttack {
            damage 20
            draw 2
          }
        }
        move "Thunderous Bolt", {
          text "200 damage. During your next turn, this Pokémon can't attack."
          energyCost L, L, C
          onAttack {
            damage 200
            cantAttackNextTurn(self)
          }
        }
      };
      case YAMPER_73:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Roar", {
          text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost C
          onAttack {
            whirlwind()
          }
        }
        move "Static Shock", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case YAMPER_74:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Zap Kick", {
          text "20 damage."
          energyCost L, C
          onAttack {
            damage 20
          }
        }
      };
      case BOLTUND_75:
      return evolution (this, from:"Yamper", hp:HP130, type:L, retreatCost:1) {
        weakness F
        move "Big Bite", {
          text "50 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost C, C
          onAttack {
            damage 50
            cantRetreat defending
          }
        }
        move "Fighting Fangs", {
          text "90+ damage. If your opponent’s Active Pokémon is a Pokémon V or Pokémon-GX, this attack does 90 more damage."
          energyCost L, C, C
          onAttack {
            damage 90
            if (defending.topPokemonCard.cardTypes.is(POKEMON_V) || defending.pokemonGX) {
              damage 90
            }
          }
        }
      };
      case BOLTUND_76:
      return evolution (this, from:"Yamper", hp:HP120, type:L, retreatCost:0) {
        weakness F
        move "Bite", {
          text "50 damage."
          energyCost C, C
          onAttack {
            damage 50
          }
        }
        move "Electrodash", {
          text "160 damage. During your next turn, this Pokémon can't attack."
          energyCost L, L, C
          onAttack {
            damage 160
            cantAttackNextTurn(self)
          }
        }
      };
      case PINCURCHIN_77:
      return basic (this, hp:HP080, type:L, retreatCost:2) {
        weakness F
        move "Shocking Needles", {
          text "30x damage. Flip 4 coins. This attack does 30 damage for each heads. If at least 2 of them are heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, L
          onAttack {
            flip 4, {}, {}, [
              1:{ damage 30 },
              2:{
                damage 60
                apply PARALYZED
              },
              3:{
                damage 90
                apply PARALYZED
              },
              4:{
                damage 120
                apply PARALYZED
              }
            ]
          }
        }
      };
      case MORPEKO_78:
      return basic (this, hp:HP090, type:L, retreatCost:1) {
        weakness F
        move "Attack the Wound", {
          text "10+ damage. If your opponent’s Active Pokémon already has any damage counters on it, this attack does 50 more damage."
          energyCost L
          onAttack {
            damage 10
            if (opp.active.numberOfDamageCounters)
              damage 50
          }
        }
      };
      case MORPEKO_V_79:
      return basic (this, hp:HP170, type:L, retreatCost:2) {
        weakness F
        move "Spark", {
          text "20 damage. This attack also does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          onAttack {
            damage 20
            if (opp.bench) damage 20, opp.bench.select()
          }
        }
        move "Electro Wheel", {
          text "150 damage. Discard an Energy from this Pokémon. If you do, switch it with 1 of your Benched Pokémon."
          energyCost L, L, C
          onAttack {
            damage 150

            afterDamage {
              discardSelfEnergy C
              if (my.bench) {
                sw self, my.bench.select()
              }
            }
          }
        }
      };
      case MORPEKO_VMAX_80:
      return evolution (this, from:"Morpeko V", hp:HP300, type:L, retreatCost:1) {
        weakness F
        move "Max Discharge", {
          text "180 damage. This attack also does 20 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          onAttack {
            damage 180
            opp.bench.each { damage 20, it }
          }
        }
      };
      case GALARIAN_PONYTA_81:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Psy Bolt", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost P
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case GALARIAN_RAPIDASH_82:
      return evolution (this, from:"Galarian Ponyta", hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Pastel Veil", {
          text "Your Pokémon recover from all Special Conditions and can't be affected by any Special Conditions."
          def pastelVeil = {
            for(pcs in all) {
              if (pcs.specialConditions && pcs.owner == self.owner) {
                bc "Pastel Veil clears Special Conditions."
                clearSpecialCondition(pcs, SRC_ABILITY)
              }
            }
          }
          delayedA {
            before APPLY_SPECIAL_CONDITION, {
              def pcs = e.getTarget(bg)
              if (pcs.owner == self.owner) {
                bc "Pastel Veil prevents Special Conditions."
                prevent()
              }
            }
          }
          onActivate {
            pastelVeil()
          }
        }
        move "Psychic", {
          text "30+ damage. This attack does 30 more damage for each Energy attached to your opponent’s Active Pokémon."
          energyCost P, C
          onAttack {
            damage 30+30*opp.active.cards.filterByType(ENERGY).size()
          }
        }
      };
      case GASTLY_83:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Fade Out", {
          text "20 damage. Put this Pokémon and all attached cards into your hand."
          energyCost P
          onAttack {
            damage 20
            afterDamage {
              self.cards.moveTo(hand)
              removePCS(self)
            }
          }
        }
      };
      case HAUNTER_84:
      return evolution (this, from:"Gastly", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Nightmare", {
          text "20 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 20
            apply ASLEEP
          }
        }
        move "Spooky Shot", {
          text "40 damage."
          energyCost P, C
          onAttack {
            damage 40
          }
        }
      };
      case GENGAR_85:
      return evolution (this, from:"Haunter", hp:HP110, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Life Shaker", {
          text "As often as you like during your turn, you may move 1 damage counter from 1 of your [P] Pokémon to another of your [P] Pokémon."
          actionA {
            assert my.all.find({ it.numberOfDamageCounters > 0 && it.types.contains(P) })
            def source = my.all.findAll { it.numberOfDamageCounters > 0 && it.types.contains(P) }.select("Source for the damage counter?")
            def target = my.all.findAll { it.types.contains(P) }
            target.remove(source)
            target = target.select("Target for the damage counter?")
            source.damage-=hp(10)
            target.damage+=hp(10)
            bc "Swapped a damage counter from $source to $target."
            checkFaint()
          }
        }
        move "Hypnoblast", {
          text "90 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost P, P, C
          onAttack {
            damage 90
            apply ASLEEP
          }
        }
      };
      case WOBBUFFET_V_86:
      return basic (this, hp:HP220, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Gritty Comeback", {
          text "Switch all damage counters on this Pokémon with those on your opponent’s Active Pokémon."
          energyCost C, C
          onAttack {
            targeted (opp.active) {
              def tmp = opp.active.damage;
              opp.active.damage = self.damage;
              self.damage = tmp;
              checkFaint()
            }
          }
        }
        move "Shadow Bind", {
          text "70 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost P, P
          onAttack {
            damage 70
            cantRetreat defending
          }
        }
      };
      case MUNNA_87:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Moonlight", {
          text "Heal 30 damage from this Pokémon."
          energyCost C
          onAttack {
            heal 30, self
          }
        }
        move "Psychic Sphere", {
          text "30 damage."
          energyCost P, C
          onAttack {
            damage 30
          }
        }
      };
      case MUSHARNA_88:
      return evolution (this, from:"Munna", hp:HP120, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Sleepy Pulse", {
          text "Your opponent’s Active Pokémon is now Asleep. During Pokémon Checkup, your opponent flips 2 coins instead of 1. If either of them is tails, that Pokémon is still Asleep."
          energyCost C
          onAttack {
            apply ASLEEP, defending
            delayed {
              after CLEAR_SPECIAL_CONDITION, defending, {
                if(ef.types.contains(ASLEEP)){
                  unregister()
                }
              }
              before ASLEEP_SPC, null, null, BEGIN_TURN, {
                if(ef.target == defending){ //MARK parentEvent
                  flip "Asleep (Sleepy Pulse)", 2, {}, {}, [2:{
                    ef.unregisterItself(bg.em());
                  },1:{
                    bc "$ef.target is still asleep."
                  },0:{
                    bc "$ef.target is still asleep."
                  }]
                  prevent()
                }
              }
            }
          }
        }
        move "Super Hypnoblast", {
          text "10+ damage. If your opponent’s Active Pokémon is Asleep, this attack does 120 more damage."
          energyCost P, C
          onAttack {
            damage 10
            if (opp.active.isSPC(ASLEEP)) damage 120
          }
        }
      };
      case SINISTEA_89:
      return basic (this, hp:HP030, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Teatime", {
          text "Each player draws 2 cards."
          energyCost C
          onAttack {
            if (my.deck) {
              draw 2, TargetPlayer.SELF
            }
            if (opp.deck) {
              draw 2, TargetPlayer.OPPONENT
            }
          }
        }
      };
      case POLTEAGEIST_90:
      return evolution (this, from:"Sinistea", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Teatime", {
          text "Each player draws 2 cards."
          energyCost C
          onAttack {
            if (my.deck) {
              draw 2, TargetPlayer.SELF
            }
            if (opp.deck) {
              draw 2, TargetPlayer.OPPONENT
            }
          }
        }
        move "Poltergeist", {
          text "50x damage. Your opponent reveals their hand. This attack does 50 damage for each Trainer card you find there."
          energyCost P, C
          onAttack {
            opp.hand.showToMe("Your opponent's hand.")
            damage 50*opp.hand.filterByType(TRAINER).size()
          }
        }
      };
      case INDEEDEE_V_91:
      return basic (this, hp:HP180, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Watch Over", {
          text "Once during your turn, you may heal 20 damage from your Active Pokémon."
          actionA {
            checkLastTurn()
            assert my.active.numberOfDamageCounters: "Your Active Active Pokémon has no damage counters."
            heal(20, my.active, SRC_ABILITY)
            powerUsed()
          }
        }
        move "Psychic", {
          text "10+ damage. This attack does 60 more damage for each Energy attached to your opponent’s Active Pokémon."
          energyCost P, C, C
          onAttack {
            damage 10+60*opp.active.cards.filterByType(ENERGY).size()
          }
        }
      };
      case DIGLETT_92:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Scratch", {
          text "10 damage."
          energyCost F
          onAttack {
            damage 10
          }
        }
      };
      case DUGTRIO_93:
      return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
        weakness G
        move "Mud Bomb", {
          text "60 damage."
          energyCost F
          onAttack {
            damage 60
          }
        }
      };
      case HITMONLEE_94:
      return basic (this, hp:HP120, type:F, retreatCost:1) {
        weakness P
        move "Low Sweep", {
          text "40 damage."
          energyCost C, C
          onAttack {
            damage 40
          }
        }
        move "Coordinated Strike", {
          text "80+ damage. If Hitmonchan is on your Bench, this attack does 80 more damage."
          energyCost F, F, C
          onAttack {
            damage 80
            if (my.bench.find({ it.name == "Hitmonchan" })) {
              damage 80
            }
          }
        }
      };
      case HITMONCHAN_95:
      return basic (this, hp:HP120, type:F, retreatCost:1) {
        weakness P
        move "Coordinated Beatdown", {
          text "20+ damage. If Hitmonlee is on your Bench, this attack does 20 more damage."
          energyCost F
          onAttack {
            damage 20
            if (my.bench.find({ it.name == "Hitmonlee" })) {
              damage 20
            }
          }
        }
        move "Mach Cross", {
          text "60 damage."
          energyCost F, F
          onAttack {
            damage 60
          }
        }
      };
      case RHYHORN_96:
      return basic (this, hp:HP100, type:F, retreatCost:3) {
        weakness G
        move "Horn Attack", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Hammer In", {
          text "30 damage."
          energyCost F, C
          onAttack {
            damage 30
          }
        }
      };
      case RHYHORN_97:
      return basic (this, hp:HP090, type:F, retreatCost:2) {
        weakness G
        move "Stomp Off", {
          text "Discard the top 2 cards of your opponent’s deck."
          energyCost F, C
          onAttack {
            opp.deck.subList(0, 2).discard()
          }
          attackRequirement {
            assert opp.deck : "Your opponent's deck is empty"
          }
        }
        move "Land Crush", {
          text "70 damage."
          energyCost F, F, C
          onAttack {
            damage 70
          }
        }
      };
      case RHYDON_98:
      return evolution (this, from:"Rhyhorn", hp:HP120, type:F, retreatCost:4) {
        weakness G
        move "Horn Drill", {
          text "50 damage."
          energyCost F, C, C
          onAttack {
            damage 50
          }
        }
        move "Rock Slide", {
          text "100 damage. This attack also does 10 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C
          onAttack {
            damage 100
            if (opp.bench) {
              multiSelect(opp.bench, 2).each {
                targeted(it) {
                  damage 10, it
                }
              }
            }
          }
        }
      };
      case RHYPERIOR_99:
      return evolution (this, from:"Rhydon", hp:HP190, type:F, retreatCost:4) {
        weakness G
        move "Rock Tumble", {
          text "90 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C, C
          onAttack {
            damage 90
            dontApplyResistance()
          }
        }
        move "Bedrock Shake", {
          text "120 damage. This attack also does 60 damage to each Benched Pokémon that has any damage counters on it (both yours and your opponent's). (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C
          onAttack {
            damage 120
            opp.bench.each{if(it.numberOfDamageCounters) damage 60,it}
            my.bench.each{if(it.numberOfDamageCounters) damage 60,it}
          }
        }
      };
      case SUDOWOODO_100:
      return basic (this, hp:HP100, type:F, retreatCost:1) {
        weakness G
        move "Double Draw", {
          text "Draw 2 cards."
          energyCost C
          onAttack {
            draw 2
          }
        }
        move "Flail", {
          text "10x damage. This attack does 10 damage for each damage counter on this Pokémon."
          energyCost C
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case BALTOY_101:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Beam", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Sand Spray", {
          text "30 damage."
          energyCost F, F
          onAttack {
            damage 30
          }
        }
      };
      case BALTOY_102:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Spinning Attack", {
          text "20 damage."
          energyCost F
          onAttack {
            damage 20
          }
        }
      };
      case CLAYDOL_103:
      return evolution (this, from:"Baltoy", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Psybeam", {
          text "30 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost C
          onAttack {
            damage 30
            apply CONFUSED
          }
        }
        move "Explosion", {
          text "200 damage. This Pokémon also does 120 damage to itself."
          energyCost F, F
          onAttack {
            damage 200
            damage 120, self
          }
        }
      };
      case REGIROCK_V_104:
      return basic (this, hp:HP220, type:F, retreatCost:3) {
        weakness G
        move "Raging Hammer", {
          text "30+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
          energyCost F, C
          onAttack {
            damage 30+10*self.numberOfDamageCounters
          }
        }
        move "Rocky Tackle", {
          text "190 damage. This Pokémon also does 30 damage to itself."
          energyCost F, F, C
          onAttack {
            damage 190
            damage 30, self
          }
        }
      };
      case MUDBRAY_105:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Stampede", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Rear Kick", {
          text "30 damage."
          energyCost F, C
          onAttack {
            damage 30
          }
        }
      };
      case MUDSDALE_106:
      return evolution (this, from:"Mudbray", hp:HP150, type:F, retreatCost:3) {
        weakness G
        move "Double Impact", {
          text "120x damage. Flip 2 coins. This attack does 120 damage for each heads."
          energyCost F, F, F
          onAttack {
            flip 2, { damage 120 }
          }
        }
      };
      case SILICOBRA_107:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Sand Attack", {
          text "During your opponent's next turn, if the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack doesn't happen."
          energyCost C
          onAttack {
            sandAttack(thisMove)
          }
        }
      };
      case SILICOBRA_108:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Headbutt", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Tail Whap", {
          text "20 damage."
          energyCost F, C
          onAttack {
            damage 20
          }
        }
      };
      case SANDACONDA_109:
      return evolution (this, from:"Silicobra", hp:HP140, type:F, retreatCost:2) {
        weakness G
        move "Coil", {
          text "10 damage. During your next turn, this Pokémon’s attacks do 120 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
          energyCost C
          onAttack {
            damage 10
            increasedBaseDamageNextTurn("Coil", hp(120))
            increasedBaseDamageNextTurn("Skull Bash", hp(120))
          }
        }
        move "Skull Bash", {
          text "100 damage."
          energyCost F, C, C
          onAttack {
            damage 100
          }
        }
      };
      case SANDACONDA_110:
      return evolution (this, from:"Silicobra", hp:HP130, type:F, retreatCost:2) {
        weakness G
        bwAbility "Sand Sac", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to==self && it.dmg.value && it.notNoEffect) {
                  bc "Sand Sac -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Power Press", {
          text "60+ damage. If this Pokémon has at least 1 extra [F] Energy attached (in addition to this attack's cost), this attack does 70 more damage."
          energyCost F, F
          onAttack {
            if (self.cards.energySufficient(thisMove.energyCost + F)) {
              damage 70+60
            } else {
              damage 60
            }
          }
        }
      };
      case CLOBBOPUS_111:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness P
        move "Bind", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost F
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
      };
      case CLOBBOPUS_112:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness P
        move "Punch", {
          text "50 damage."
          energyCost F, F
          onAttack {
            damage 50
          }
        }
      };
      case GRAPPLOCT_113:
      return evolution (this, from:"Clobbopus", hp:HP130, type:F, retreatCost:2) {
        weakness P
        move "Octolock", {
          text "Until this Grapploct leaves the Active Spot, the Defending Pokémon's attacks cost [C][C] more, and the Defending Pokémon can't retreat. This effect can't be applied more than once."
          energyCost F, F
          onAttack {
            def pcs = defending
            delayed {
              def eff
              register {
                before RETREAT, pcs {
                  wcu "Octolock prevents you from retreating."
                  prevent()
                }
                eff = getter (GET_MOVE_LIST, NORMAL, pcs) {h->
                  if (keyStore("Octolock", self)) {
                    def list=[]
                    for (move in h.object) {
                      def copy=move.shallowCopy()
                      copy.energyCost.addAll([C, C] as List<Type>)
                      list.add(copy)
                    }
                    h.object=list
                    bc "Attacks of $pcs will cost [C][C] while Octolock is active."
                  }
                }
                keyStore("Octolock", self, true)
              }
              unregister {
                keyStore("Octolock", self, 0)
                eff.unregister()
              }

              after SWITCH, self, {unregister()}
              after SWITCH, pcs, {unregister()}
              after EVOLVE, pcs, {unregister()}
            }
          }
        }
        move "Tough Swing", {
          text "130 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, F, C
          onAttack {
            damage 130
            dontApplyResistance()
          }
        }
      };
      case STONJOURNER_114:
      return basic (this, hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Wild Tackle", {
          text "70 damage. This Pokémon also does 10 damage to itself."
          energyCost F, F
          onAttack {
            damage 70
            damage 10, self
          }
        }
      };
      case STONJOURNER_V_115:
      return basic (this, hp:HP220, type:F, retreatCost:3) {
        weakness G
        move "Guard Press", {
          text "40 damage. During your opponent’s next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
          energyCost F
          onAttack {
            damage 40
            reduceDamageNextTurn(hp(20), thisMove)
          }
        }
        move "Mega Kick", {
          text "150 damage."
          energyCost F, F, F
          onAttack {
            damage 150
          }
        }
      };
      case STONJOURNER_VMAX_116:
      return evolution (this, from:"Stonjourner V", hp:HP330, type:F, retreatCost:3) {
        weakness G
        move "Stone Gift", {
          text "Attach a [F] Energy card from your hand to 1 of your Pokémon. If you do, heal 120 damage from that Pokémon."
          energyCost F
          attackRequirement {
            assert my.hand.filterByEnergyType(F)
          }
          onAttack {
            def tar = my.all.select("Which Pokémon to attach [F] to and heal 120 damage?")
            attachEnergyFrom(may: true, type: F, my.hand, tar)
            heal 120, tar
          }
        }
        move "Max Rockfall", {
          text "200 damage."
          energyCost F, F, F
          onAttack {
            damage 200
          }
        }
      };
      case GALARIAN_ZIGZAGOON_117:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        bwAbility "Headbutt Tantrum", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may put 1 damage counter on 1 of your opponent's Pokémon."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Headbutt Tantrum?")) {
              powerUsed()
              directDamage 10, opp.all.select(), SRC_ABILITY
            }
          }
        }
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost D, C
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case GALARIAN_LINOONE_118:
      return evolution (this, from:"Galarian Zigzagoon", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Night Slash", {
          text "20 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost D
          onAttack {
            damage 20
            afterDamage {
              if (my.bench) {
                sw self, my.bench.select()
              }
            }
          }
        }
        move "Hammer In", {
          text "70 damage."
          energyCost D, C, C
          onAttack {
            damage 70
          }
        }
      };
      case GALARIAN_OBSTAGOON_119:
      return evolution (this, from:"Galarian Linoone", hp:HP160, type:D, retreatCost:2) {
        weakness G
        bwAbility "Untamed Shout", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 3 damage counters on 1 of your opponent's Pokémon."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Untamed Shout?")) {
              powerUsed()
              directDamage 30, opp.all.select(), SRC_ABILITY
            }
          }
        }
        move "Obstruct", {
          text "90 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon."
          energyCost D, C
          onAttack {
            damage 90
            afterDamage {
              preventAllDamageFromCustomPokemonNextTurn(thisMove, self, {it.basic})
            }
          }
        }
      };
      case SABLEYE_V_120:
      return basic (this, hp:HP170, type:D, retreatCost:2) {
        weakness G
        move "Lode Search", {
          text "Put a Trainer card from your discard pile into your hand."
          energyCost D
          onAttack {
            if (my.discard.filterByType(TRAINER)) {
              my.discard.filterByType(TRAINER).select().moveTo(my.hand)
            }
          }
        }
        move "Crazy Claws", {
          text "10+ damage. This attack does 60 more damage for each damage counter on your opponent’s Active Pokémon."
          energyCost D, D
          onAttack {
            damage 10+60*opp.active.numberOfDamageCounters
          }
        }
      };
      case SKORUPI_121:
      return basic (this, hp:HP080, type:D, retreatCost:2) {
        weakness F
        move "Poison Sting", {
          text "Your opponent’s Active Pokémon is now Poisoned."
          energyCost D
          onAttack {
            apply POISONED
          }
        }
        move "Slashing Claw", {
          text "50 damage."
          energyCost D, C, C
          onAttack {
            damage 50
          }
        }
      };
      case DRAPION_122:
      return evolution (this, from:"Skorupi", hp:HP140, type:D, retreatCost:3) {
        weakness F
        move "Hard Press", {
          text "80 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost D, C, C
          onAttack {
            damage 80
            flip { apply PARALYZED }
          }
        }
        move "Toxic Strike", {
          text "130 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost D, D, C, C
          onAttack {
            damage 130
            apply POISONED
          }
        }
      };
      case CROAGUNK_123:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        move "Stampede", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Lunge Out", {
          text "30 damage."
          energyCost D, C
          onAttack {
            damage 30
          }
        }
      };
      case TOXICROAK_124:
      return evolution (this, from:"Croagunk", hp:HP110, type:D, retreatCost:1) {
        weakness F
        bwAbility "More Poison", {
          text "Put 2 more damage counters on your opponent’s Poisoned Pokémon during Pokémon Checkup."
          getterA (GET_EXTRA_POISON) {h->
            if (h.effect.target.owner != self.owner) {
              h.object += 2
            }
          }
        }
        move "Poison Claws", {
          text "70 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Poisoned."
          energyCost D, C, C
          onAttack {
            damage 70
            flip { apply POISONED }
          }
        }
      };
      case NICKIT_125:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Instigate", {
          text "Your opponent shuffles their hand and puts it on the bottom of their deck. If they put any cards on the bottom of their deck in this way, they draw 3 cards."
          energyCost D
          onAttack {
            if (opp.hand.size()) {
              opp.hand.shuffle()
              opp.hand.moveTo(hidden:true, opp.deck)
              draw 3, TargetPlayer.OPPONENT
            }
          }
        }
      };
      case THIEVUL_126:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Thief", {
          text "20 damage. Your opponent reveals their hand. Choose a card you find there and put it on the bottom of their deck."
          energyCost D
          onAttack {
            damage 20
            if (opp.hand) {
              opp.hand.select("Choose 1 card to put on the bottom of their deck").moveTo(opp.deck)
            }
          }
        }
        move "Darkness Fang", {
          text "90 damage."
          energyCost D, C, C
          onAttack {
            damage 90
          }
        }
      };
      case GALARIAN_MEOWTH_127:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Hone Claws", {
          text "During your next turn, this Pokémon’s Slash attack does 60 more damage (before applying Weakness and Resistance)."
          energyCost C
          onAttack {
            increasedBaseDamageNextTurn("Slash", hp(60))
          }
        }
        move "Slash", {
          text "30 damage."
          energyCost M, C
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_PERRSERKER_128:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Steely Spirit", {
          text "Your [M] Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == self.owner && ef.attacker.types.contains(M)) {
                bg.dm().each {
                  if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {
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
          onAttack {
            damage 70
          }
        }
      };
      case MAWILE_129:
      return basic (this, hp:HP090, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Find a Friend", {
          text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty."
          }
          onAttack {
            my.deck.search(max: 1, cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Crunch", {
          text "40 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost M, C
          onAttack {
            damage 40
            afterDamage {
              discardDefendingEnergy()
            }
          }
        }
      };
      case FERROSEED_130:
      return basic (this, hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Rollout", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case FERROTHORN_131:
      return evolution (this, from:"Ferroseed", hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Triple Smash", {
          text "30x damage. Flip 3 coins. This attack does 30 damage for each heads."
          energyCost C
          onAttack {
            flip 3, {damage 30}
          }
        }
        move "Energy Slap", {
          text "100 damage. You may move all Energy from this Pokémon to 1 of your Benched Pokémon."
          energyCost M, M, C
          onAttack {
            damage 100
            afterDamage {
              if (my.bench.notEmpty && confirm("Move all Energy attached to this Pokémon to 1 of your Benched Pokémon?")) {
                def pcs = my.bench.select()
                self.cards.filterByType(ENERGY).each {energySwitch(self,pcs,it)}
              }
            }
          }
        }
      };
      case GALARIAN_STUNFISK_132:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Snap Trap", {
          text "If this Pokémon is in the Active Spot and is damaged by an opponent’s attack (even if it is Knocked Out), discard an Energy from the Attacking Pokémon."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              PokemonCardSet pcs = ef.attacker
              if (pcs.owner != self.owner) {
                bg.dm().each{
                  if (it.to == self && self.active && it.dmg.value) {
                    targeted (pcs, SRC_ABILITY) {
                      if(pcs.cards.filterByType(ENERGY)){
                        bc "Galarian Stunfisk's Snap Trap activates."
                        pcs.cards.filterByType(ENERGY).select("Discard").discard()
                      }
                    }
                  }
                }
              }
            }
          }
        }
        move "Damage Rush", {
          text "30+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
          energyCost M, C
          onAttack {
            damage 30
            flipUntilTails { damage 30 }
          }
        }
      };
      case PAWNIARD_133:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Cut Up", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Metal Claw", {
          text "20 damage."
          energyCost M, C
          onAttack {
            damage 20
          }
        }
      };
      case BISHARP_134:
      return evolution (this, from:"Pawniard", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Charge Order", {
          text "30+ damage. This attack does 30 more damage for each of your Benched Pawniard."
          energyCost C
          onAttack {
            damage 30+30*my.bench.findAll{it.name=='Pawniard'}.size()
          }
        }
        move "Slicing Blade", {
          text "60 damage."
          energyCost M, C
          onAttack {
            damage 60
          }
        }
      };
      case CORVIKNIGHT_135:
      return evolution (this, from:"Corvisquire", hp:HP170, type:M, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "50 damage."
          energyCost C
          onAttack {
            damage 50
          }
        }
        move "Iron Wings", {
          text "130 damage. You may discard 2 Energy from this Pokémon. If you do, during your opponent's next turn, this Pokémon takes 100 less damage from attacks (after applying Weakness and Resistance)."
          energyCost M, C, C
          onAttack {
            damage 130
            if (confirm("Discard 2 Energies to take 100 less damage next turn?")) {
              discardSelfEnergy(C, C)

              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if (it.to==self && it.dmg.value) {
                        bc "-100 to Corviknight (Iron Wings)"
                        it.dmg-=hp(100)
                      }
                    }
                  }

                  unregisterAfter 2
                  after SWITCH, self, { unregister() }
                  after EVOLVE, self, { unregister() }
                }
              }
            }
          }
        }
      };
      case CUFANT_136:
      return basic (this, hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Stomp", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost M, M
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
      };
      case COPPERAJAH_137:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Dig Drain", {
          text "60 damage. Heal 30 damage from this Pokémon."
          energyCost M, M
          onAttack {
            damage 60
            heal 30, self
          }
        }
        move "Muscular Nose", {
          text "220 damage. If this Pokémon has 8 or more damage counters on it, this attack does nothing."
          energyCost M, M, M
          onAttack {
            if (self.numberOfDamageCounters < 8) damage 220
          }
        }
      };
      case ZACIAN_V_138:
      return basic (this, hp:HP220, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Intrepid Sword", {
          text "Once during your turn, you may look at the top 3 cards of your deck and attach any number of [M] Energy cards you find there to this Pokémon. Put the other cards into your hand. If you use this Ability, your turn ends."
          actionA {
            if (my.deck && confirm("Use Intrepid Sword?")) {
              def topCards = my.deck.subList(0, 3).showToMe("Top 3 cards of your deck.")
              def metalEnergies = topCards.filterByBasicEnergyType(M)

              if (metalEnergies) {
                def selectedEnergies = metalEnergies.select(min:0, max:metalEnergies.size(), "Attach any [M] Energy to $self?")
                selectedEnergies.each {
                  attachEnergy(self, it)
                }
                def nonSelectedSize = 3 - selectedEnergies.size()
                if (nonSelectedSize) {
                  my.deck.subList(0, nonSelectedSize).getExcludedList(selectedEnergies).moveTo(hidden: true, my.hand)
                }
              } else {
                my.deck.subList(0,3).moveTo(hidden: true, my.hand)
              }
              bg.gm().betweenTurns()
            }
          }
        }
        move "Brave Blade", {
          text "230 damage. During your next turn, this Pokémon can't attack."
          energyCost M, M, M
          onAttack {
            damage 230
            cantAttackNextTurn(self)
          }
        }
      };
      case ZAMAZENTA_V_139:
      return basic (this, hp:HP230, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Dauntless Shield", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon VMAX."
          delayedA{
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.from.topPokemonCard.cardTypes.is(VMAX) && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect) {
                  bc "Dauntless Shield prevents damage from Pokémon VMAX."
                  it.dmg = hp(0)
                }
              }
            }
          }
        }
        move "Assault Tackle", {
          text "130 damage. Discard a Special Energy from your opponent's Active Pokémon."
          energyCost M, M, C
          onAttack {
            damage 130
            discardDefendingSpecialEnergy(delegate)
          }
        }
      };
      case SNORLAX_140:
      return basic (this, hp:HP150, type:C, retreatCost:4) {
        weakness F
        move "Rolling Tackle", {
          text "80 damage."
          energyCost C, C, C
          onAttack {
            damage 80
          }
        }
        move "Heavy Impact", {
          text "130 damage."
          energyCost C, C, C, C
          onAttack {
            damage 130
          }
        }
      };
      case SNORLAX_V_141:
      return basic (this, hp:HP220, type:C, retreatCost:4) {
        weakness F
        move "Swallow", {
          text "60 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
          energyCost C, C, C
          onAttack {
            damage 60
            removeDamageCounterEqualToDamageDone()
          }
        }
        move "Falling Down", {
          text "170 damage. This Pokémon is now Asleep."
          energyCost C, C, C, C
          onAttack {
            damage 170
            apply ASLEEP, self
          }
        }
      };
      case SNORLAX_VMAX_142:
      return evolution (this, from:"Snorlax V", hp:HP340, type:C, retreatCost:4) {
        weakness F
        move "G-Max Fall", {
          text "60+ damage. This attack does 30 more damage for each of your Benched Pokémon."
          energyCost C, C, C
          onAttack {
            damage 60+30*my.bench.size()
          }
        }
      };
      case HOOTHOOT_143:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Send Back", {
          text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost C
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            sw defending, opp.bench.oppSelect("New active")
          }
        }
        move "Wing Attack", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case NOCTOWL_144:
      return evolution (this, from:"Hoothoot", hp:HP110, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Wing Attack", {
          text "40 damage."
          energyCost C, C
          onAttack {
            damage 40
          }
        }
        move "Carry Off", {
          text "Choose 1 of your opponent's Benched Pokémon. They shuffle that Pokémon and all attached cards into their deck. Then, shuffle this Pokémon and all attached cards into your deck."
          energyCost C, C, C
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            def tar = opp.bench.select("Choose a Benched Pokémon to shuffle back into the deck.")
            tar.cards.moveTo(opp.deck)
            removePCS(tar)
            shuffleDeck(null, TargetPlayer.OPPONENT)

            self.cards.moveTo(my.deck)
            shuffleDeck()
            removePCS(self)
          }
        }
      };
      case MINCCINO_145:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Glance", {
          text "Look at the top card of your opponent’s deck."
          energyCost C
          onAttack {
            opp.deck.subList(0, 1).showToMe("Opponent's top Deck")
          }
        }
        move "Tail Slap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage for each heads."
          energyCost C, C
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case MINCCINO_146:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Tail Whap", {
          text "30 damage."
          energyCost C
          onAttack {
            damage 30
          }
        }
      };
      case CINCCINO_147:
      return evolution (this, from:"Minccino", hp:HP090, type:C, retreatCost:1) {
        weakness F
        bwAbility "Make Do", {
          text "You must discard a card from your hand in order to use this Ability. Once during your turn, you may draw 2 cards."
          actionA {
            checkLastTurn()
            assert my.deck
            assert my.hand.notEmpty()
            powerUsed()
            hand.select("Discard").discard()
            draw 2
          }
        }
        move "Energy Assist", {
          text "40 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            damage 40
            attachEnergyFrom(basic: true, my.discard, my.bench)
          }
        }
      };
      case ORANGURU_148:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness F
        bwAbility "Primate Wisdom", {
          text "Once during your turn, you may switch a card from your hand with the top card of your deck."
          actionA {
            checkLastTurn()
            assert my.hand && my.deck
            powerUsed()

            my.hand.select().moveTo(addToTop: true, hidden: true, my.deck)
            my.deck.subList(1,2).moveTo(hidden: true, my.hand) // Card placed on top, get the one underneath
          }
        }
        move "Whap Down", {
          text "70 damage."
          energyCost C, C, C
          onAttack {
            damage 70
          }
        }
      };
      case DRAMPA_149:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Dragon Pulse", {
          text "80 damage. Discard the top 2 cards of your deck."
          energyCost C, C
          onAttack {
            damage 80
            if(my.deck) my.deck.subList(0, 2).discard()
          }
        }
      };
      case ROOKIDEE_150:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Flap", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Glide", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
      };
      case CORVISQUIRE_151:
      return evolution (this, from:"Rookidee", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "20 damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon."
          energyCost C
          onAttack {
            targeted(defending) {
              defending.cards.filterByType(POKEMON_TOOL).discard()
            }
            damage 20
          }
        }
        move "Drill Peck", {
          text "50 damage."
          energyCost C, C
          onAttack {
            damage 50
          }
        }
      };
      case WOOLOO_152:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Expand", {
          text "30 damage. During your opponent’s next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C, C
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(10),thisMove)
          }
        }
      };
      case WOOLOO_153:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "50 damage."
          energyCost C, C, C
          onAttack {
            damage 50
          }
        }
      };
      case DUBWOOL_154:
      return evolution (this, from:"Wooloo", hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Cotton Guard", {
          text "30 damage. During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(30),thisMove)
          }
        }
        move "Double-Edge", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost C, C, C
          onAttack {
            damage 120
            damage 30, self
          }
        }
      };
      case CRAMORANT_V_155:
      return basic (this, hp:HP200, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Beak Catch", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty."
          }
          onAttack {
            my.deck.search(max:2,"Choose 2 cards to put in your hand.",{true}).moveTo(hidden: true, my.hand)
          }
        }
        move "Spit Shot", {
          text "Discard all Energy from this Pokémon. This attack does 160 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          onAttack {
            discardAllSelfEnergy(null)
            damage 160, opp.all.select()
          }
        }
      };
      case AIR_BALLOON_156:
      return pokemonTool (this) {
        text "The Retreat Cost of the Pokémon this card is attached to is [C][C] less."
        def eff
        onPlay {reason->
          eff = getter GET_RETREAT_COST, self, {h ->
            h.object -= 2
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case BEDE_157:
      return supporter (this) {
        text "Attach a basic Energy card from your hand to 1 of your Benched Pokémon."
        onPlay {
          attachEnergyFrom(basic:true, my.hand, my.bench)
        }
        playRequirement{
          assert my.bench && my.hand.filterByType(BASIC_ENERGY)
        }
      };
      case BIG_CHARM_158:
      return pokemonTool (this) {
        text "The Pokémon this card is attached to gets +30 HP."
        def eff
        onPlay {reason->
          eff = getter (GET_FULL_HP, self) {h->
            h.object += hp(30)
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case CRUSHING_HAMMER_159:
      return copy(EmergingPowers.CRUSHING_HAMMER_92, this);
      case ENERGY_RETRIEVAL_160:
      return copy(BlackWhite.ENERGY_RETRIEVAL_92, this)
      case ENERGY_SEARCH_161:
      return copy(BlackWhite.ENERGY_SEARCH_93, this);
      case ENERGY_SWITCH_162:
      return copy(BlackWhite.ENERGY_SWITCH_94, this);
      case EVOLUTION_INCENSE_163:
      return itemCard (this) {
        text "Search your deck for an Evolution Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
        onPlay {
          my.deck.search(cardTypeFilter(EVOLUTION)).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
        }
      };
      case GREAT_BALL_164:
      return copy(EmergingPowers.GREAT_BALL_93, this);
      case HOP_165:
      return copy(SunMoon.HAU_120, this);
      case HYPER_POTION_166:
      return itemCard (this) {
        text "Heal 120 damage from 1 of your Pokémon that has at least 2 Energy attached. If you healed any damage in this way, discard 2 Energy from it."
        onPlay {
          def pcs = my.all.findAll{it.numberOfDamageCounters && it.cards.energyCount() >= 2}.select("Choose the Pokémon to heal.")
          heal 120, pcs
          pcs.cards.filterByType(ENERGY).select(count: 2, "Discard which Energy card(s)?").discard()
        }
        playRequirement{
          assert my.all.findAll{it.numberOfDamageCounters && it.cards.energyCount() >= 2}
        }
      };
      case LUCKY_EGG_167:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to is Knocked Out by damage from an opponent’s attack, draw cards until you have 7 cards in your hand."
        def eff
        onPlay {reason->
          eff = delayed {
            before (KNOCKOUT, self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                bc "Lucky Egg activates"
                def count = 7-self.owner.pbg.hand.size()
                draw count, TargetPlayer.OPPONENT // Targets the player being attacked (holding the lucky egg)
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case LUM_BERRY_168:
      return copy(Emerald.LUM_BERRY_78, this);
      case MARNIE_169:
      return supporter (this) {
        text "Each player shuffles their hand and puts it on the bottom of their deck. If either player put any cards on the bottom of their deck in this way, you draw 5 cards, and your opponent draws 4 cards."
        onPlay {
          opp.hand.shuffle()
          opp.hand.moveTo(hidden:true, opp.deck)
          draw 4, TargetPlayer.OPPONENT

          if (my.hand.size()) {
            my.hand.shuffle()
            my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
            draw 5
          }
        }
      };
      case METAL_SAUCER_170:
      return itemCard (this) {
        text "Attach a [M] Energy card from your discard pile to 1 of your Benched [M] Pokémon."
        onPlay {
          attachEnergyFrom(basic: true, type: M, my.discard, my.bench.findAll {it.types.contains(M)})
        }
        playRequirement{
          assert my.discard.findAll(basicEnergyFilter(M))
          assert my.bench.findAll {it.types.contains(M)}
        }
      };
      case ORDINARY_ROD_171:
      return itemCard (this) {
        text "Choose 1 or both:" +
          "• Shuffle up to 2 Pokémon from your discard pile into your deck." +
          "• Shuffle up to 2 basic Energy cards from your discard pile into your deck."
        onPlay {
          def energies
          def pokemon

          while (!energies && !pokemon) {
            if (my.discard.filterByType(BASIC_ENERGY)) {
              energies = my.discard.filterByType(BASIC_ENERGY).select(min: 0, max: 2, "Select up to 2 Basic Energy cards to shuffle into your deck.")
            }
            if (my.discard.filterByType(POKEMON)) {
              pokemon = my.discard.filterByType(POKEMON).select(min: 0, max: 2, "Select up to 2 Pokémon to shuffle into your deck.")
            }
          }
          if (energies) {
            energies.showToOpponent("Opponent's selected Basic Energy to shuffle back.").moveTo(my.deck)
          }
          if (pokemon) {
            pokemon.showToOpponent("Opponent's selected Pokémon to shuffle back.").moveTo(my.deck)
          }
          shuffleDeck()
        }
        playRequirement {
          assert my.discard.filterByType(BASIC_ENERGY, POKEMON) : "No Pokémon or Basic Energy cards in your discard."
        }
      };
      case PAL_PAD_172:
      return copy(UltraPrism.PAL_PAD_132, this);
      case POKE_KID_173:
      return supporter (this) {
        text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
        onPlay {
          my.deck.search(count: 1, cardTypeFilter(POKEMON)).showToOpponent("Opponent's selected Pokémon.").moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
        }
      };
      case POKEGEAR_3_0_174:
      return copy (UnbrokenBonds.POKEGEAR_3_0_182, this);
      case POKEMON_CATCHER_175:
      return copy (KalosStarterSet.POKEMON_CATCHER_36, this);
      case POKEMON_CENTER_LADY_176:
      return copy(Flashfire.POKEMON_CENTER_LADY_93, this);
      case POTION_177:
      return copy(BlackWhite.POTION_100, this);
      case PROFESSOR_S_RESEARCH_178:
      return copy(BaseSetNG.PROFESSOR_OAK, this);
      case QUICK_BALL_179:
      return itemCard (this) {
        text "You can play this card only if you discard another card from your hand." +
          "Search your deck for a Basic Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
        onPlay {
          my.hand.getExcludedList(thisCard).select("Select a card to discard.").discard()
          my.deck.search ("Search your deck for a Basic Pokémon and put it in your hand.", cardTypeFilter(BASIC)).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
          assert my.hand.getExcludedList(thisCard).size() >= 1
        }
      };
      case RARE_CANDY_180:
      return copy(DarkExplorers.RARE_CANDY_100, this);
      case ROTOM_BIKE_181:
      return itemCard (this) {
        text "Draw cards until you have 6 cards in your hand. Your turn ends."
        onPlay {
          draw (6-my.hand.getExcludedList(thisCard).size())
          bg.gm().betweenTurns()
        }
        playRequirement{
          assert my.deck
          assert my.hand.getExcludedList(thisCard).size() < 6
        }
      };
      case SITRUS_BERRY_182:
      return pokemonTool (this) {
        text "At the end of each turn, if the Pokémon this card is attached to has 3 or more damage counters on it, heal 30 damage from it and discard this card."
        def eff
        onPlay {reason->
          eff=delayed(anytime:true){
            before BEGIN_TURN,{
              if(self.numberOfDamageCounters >= 3) {
                bc "Sitrus Berry activates."
                heal 30, self
                discard thisCard
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case SWITCH_183:
      return copy(BlackWhite.SWITCH_104, this);
      case TEAM_YELL_GRUNT_184:
      return supporter (this) {
        text "Put an Energy attached to 1 of your opponent’s Pokémon into their hand."
        onPlay {
          def tar = opp.all.findAll {it.cards.energyCount(C)}
          def pcs = tar.select("Put Energy back from which Pokémon?")
          targeted (pcs, TRAINER_CARD) {
            pcs.cards.filterByType(ENERGY).select("Choose an Energy to put back in the opponent's hand.").moveTo(opp.hand)
          }
        }
        playRequirement {
          assert opp.all.findAll { it.cards.energyCount(C) }
        }
      };
      case VITALITY_BAND_185:
      return pokemonTool (this) {
        text "The attacks of the Pokémon this card is attached to do 10 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
        def eff1
        onPlay {reason->
          eff1=delayed {
            after PROCESS_ATTACK_EFFECTS, {
              if(ef.attacker==self) bg.dm().each {
                if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value) {
                  it.dmg += hp(10)
                  bc "Vitality Band +10"
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff1.unregister()
        }
      };
      case AURORA_ENERGY_186:
      return specialEnergy (this, [[C]]) {
        text "You can attach this card to 1 of your Pokémon only if you discard another card from your hand." +
          "As long as this card is attached to a Pokémon, it provides every type of Energy but provides only 1 Energy at a time."
        onPlay {reason->
          if (reason == PLAY_FROM_HAND) {
            my.hand.getExcludedList(thisCard).select("Select a card to discard.").discard()
          }
        }
        getEnergyTypesOverride {
          if (self != null) {
            return [[R, D, F, G, W, Y, L, M, P] as Set]
          } else {
            return [[C] as Set]
          }
        }
        allowAttach {to->
          to.owner.pbg.hand.getExcludedList(thisCard).size() >= 1
        }
      };
      case DHELMISE_V_187:
      return copy (DHELMISE_V_9, this);
      case TORKOAL_V_188:
      return copy (TORKOAL_V_24, this);
      case LAPRAS_V_189:
      return copy (LAPRAS_V_49, this);
      case MORPEKO_V_190:
      return copy (MORPEKO_V_79, this);
      case WOBBUFFET_V_191:
      return copy (WOBBUFFET_V_86, this);
      case INDEEDEE_V_192:
      return copy (INDEEDEE_V_91, this);
      case STONJOURNER_V_193:
      return copy (STONJOURNER_V_115, this);
      case SABLEYE_V_194:
      return copy (SABLEYE_V_120, this);
      case ZACIAN_V_195:
      return copy (ZACIAN_V_138, this);
      case ZAMAZENTA_V_196:
      return copy (ZAMAZENTA_V_139, this);
      case SNORLAX_V_197:
      return copy (SNORLAX_V_141, this);
      case CRAMORANT_V_198:
      return copy (CRAMORANT_V_155, this);
      case BEDE_199:
      return copy (BEDE_157, this);
      case MARNIE_200:
      return copy (MARNIE_169, this);
      case PROFESSOR_S_RESEARCH_201:
      return copy (PROFESSOR_S_RESEARCH_178, this);
      case TEAM_YELL_GRUNT_202:
      return copy (TEAM_YELL_GRUNT_184, this);
      case LAPRAS_VMAX_203:
      return copy (LAPRAS_VMAX_50, this);
      case MORPEKO_VMAX_204:
      return copy (MORPEKO_VMAX_80, this);
      case STONJOURNER_VMAX_205:
      return copy (STONJOURNER_VMAX_116, this);
      case SNORLAX_VMAX_206:
      return copy (SNORLAX_VMAX_142, this);
      case BEDE_207:
      return copy (BEDE_157, this);
      case MARNIE_208:
      return copy (MARNIE_169, this);
      case PROFESSOR_S_RESEARCH_209:
      return copy (PROFESSOR_S_RESEARCH_178, this);
      case TEAM_YELL_GRUNT_210:
      return copy (TEAM_YELL_GRUNT_184, this);
      case ZACIAN_V_211:
      return copy (ZACIAN_V_138, this);
      case ZAMAZENTA_V_212:
      return copy (ZAMAZENTA_V_139, this);
      case AIR_BALLOON_213:
      return copy (AIR_BALLOON_156, this);
      case METAL_SAUCER_214:
      return copy (METAL_SAUCER_170, this);
      case ORDINARY_ROD_215:
      return copy (ORDINARY_ROD_171, this);
      case QUICK_BALL_216:
      return copy (QUICK_BALL_179, this);
        default:
      return null;
    }
  }
}
