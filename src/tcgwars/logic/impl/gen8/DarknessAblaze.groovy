package tcgwars.logic.impl.gen8;

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
 * @author lithogenn@gmail.com
 * 		     thezipcompany@gmail.com
 *         & flagrama
 */

public enum DarknessAblaze implements LogicCardInfo {

  BUTTERFREE_V_1 ("Butterfree V", 1, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  BUTTERFREE_VMAX_2 ("Butterfree VMAX", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _GRASS_]),
  PARAS_3 ("Paras", 3, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  PARASECT_4 ("Parasect", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CARNIVINE_5 ("Carnivine", 5, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  PANSAGE_6 ("Pansage", 6, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SIMISAGE_7 ("Simisage", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  KARRABLAST_8 ("Karrablast", 8, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHELMET_9 ("Shelmet", 9, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  ACCELGOR_10 ("Accelgor", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ROWLET_11 ("Rowlet", 11, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_12 ("Dartrix", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_13 ("Decidueye", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BOUNSWEET_14 ("Bounsweet", 14, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  STEENEE_15 ("Steenee", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TSAREENA_16 ("Tsareena", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WIMPOD_17 ("Wimpod", 17, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  GOLISOPOD_18 ("Golisopod", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CHARIZARD_V_19 ("Charizard V", 19, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CHARIZARD_VMAX_20 ("Charizard VMAX", 20, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _FIRE_]),
  FLAREON_21 ("Flareon", 21, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  HOUNDOOM_V_22 ("Houndoom V", 22, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  TORCHIC_23 ("Torchic", 23, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  COMBUSKEN_24 ("Combusken", 24, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BLAZIKEN_25 ("Blaziken", 25, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  HEATRAN_26 ("Heatran", 26, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VICTINI_27 ("Victini", 27, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  PANSEAR_28 ("Pansear", 28, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  SIMISEAR_29 ("Simisear", 29, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GALARIAN_DARMANITAN_30 ("Galarian Darmanitan", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  LARVESTA_31 ("Larvesta", 31, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_32 ("Volcarona", 32, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FLETCHINDER_33 ("Fletchinder", 33, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TALONFLAME_34 ("Talonflame", 34, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CENTISKORCH_V_35 ("Centiskorch V", 35, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CENTISKORCH_VMAX_36 ("Centiskorch VMAX", 36, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _FIRE_]),
  GALARIAN_MR_MIME_37 ("Galarian Mr. Mime", 37, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_38 ("Galarian Mr. Rime", 38, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SUICUNE_39 ("Suicune", 39, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  FEEBAS_40 ("Feebas", 40, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MILOTIC_41 ("Milotic", 41, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RELICANTH_42 ("Relicanth", 42, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  PANPOUR_43 ("Panpour", 43, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  SIMIPOUR_44 ("Simipour", 44, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GALARIAN_DARUMAKA_45 ("Galarian Darumaka", 45, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_46 ("Galarian Darmanitan", 46, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VANILLITE_47 ("Vanillite", 47, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  VANILLISH_48 ("Vanillish", 48, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VANILLUXE_49 ("Vanilluxe", 49, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CUBCHOO_50 ("Cubchoo", 50, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  BEARTIC_51 ("Beartic", 51, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WISHIWASHI_52 ("Wishiwashi", 52, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MAREANIE_53 ("Mareanie", 53, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  TOXAPEX_54 ("Toxapex", 54, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRACOVISH_55 ("Dracovish", 55, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ARCTOVISH_56 ("Arctovish", 56, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ELECTRIKE_57 ("Electrike", 57, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  MANECTRIC_58 ("Manectric", 58, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VIKAVOLT_V_59 ("Vikavolt V", 59, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TAPU_KOKO_60 ("Tapu Koko", 60, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXEL_61 ("Toxel", 61, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_62 ("Toxtricity", 62, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  DRACOZOLT_63 ("Dracozolt", 63, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ARCTOZOLT_64 ("Arctozolt", 64, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JIGGLYPUFF_65 ("Jigglypuff", 65, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  WIGGLYTUFF_66 ("Wigglytuff", 66, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_SLOWBRO_V_67 ("Galarian Slowbro V", 67, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  MEW_V_68 ("Mew V", 68, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SNUBBULL_69 ("Snubbull", 69, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GRANBULL_70 ("Granbull", 70, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GARDEVOIR_V_71 ("Gardevoir V", 71, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GARDEVOIR_VMAX_72 ("Gardevoir VMAX", 72, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _PSYCHIC_]),
  LUNATONE_73 ("Lunatone", 73, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOLETT_74 ("Golett", 74, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_75 ("Golurk", 75, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOTHITA_76 ("Gothita", 76, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOTHORITA_77 ("Gothorita", 77, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOTHITELLE_78 ("Gothitelle", 78, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DEDENNE_79 ("Dedenne", 79, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MORELULL_80 ("Morelull", 80, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  SHIINOTIC_81 ("Shiinotic", 81, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MIMIKYU_82 ("Mimikyu", 82, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  SINISTEA_83 ("Sinistea", 83, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_84 ("Polteageist", 84, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DIGLETT_85 ("Diglett", 85, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_86 ("Dugtrio", 86, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_FARFETCH_D_87 ("Galarian Farfetch'd", 87, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GALARIAN_SIRFETCH_D_88 ("Galarian Sirfetch'd", 88, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  LARVITAR_89 ("Larvitar", 89, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  PUPITAR_90 ("Pupitar", 90, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TYRANITAR_91 ("Tyranitar", 91, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  TRAPINCH_92 ("Trapinch", 92, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  VIBRAVA_93 ("Vibrava", 93, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FLYGON_94 ("Flygon", 94, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SOLROCK_95 ("Solrock", 95, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOPOTAS_96 ("Hippopotas", 96, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOWDON_97 ("Hippowdon", 97, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYPERIOR_V_98 ("Rhyperior V", 98, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  DIGGERSBY_99 ("Diggersby", 99, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ZYGARDE_100 ("Zygarde", 100, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  PASSIMIAN_101 ("Passimian", 101, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  GRIMER_102 ("Grimer", 102, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MUK_103 ("Muk", 103, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPINARAK_104 ("Spinarak", 104, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ARIADOS_105 ("Ariados", 105, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CROBAT_V_106 ("Crobat V", 106, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  ABSOL_107 ("Absol", 107, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  DARKRAI_108 ("Darkrai", 108, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  PURRLOIN_109 ("Purrloin", 109, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  LIEPARD_110 ("Liepard", 110, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  DEINO_111 ("Deino", 111, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ZWEILOUS_112 ("Zweilous", 112, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HYDREIGON_113 ("Hydreigon", 113, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  GALARIAN_ZIGZAGOON_114 ("Galarian Zigzagoon", 114, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_LINOONE_115 ("Galarian Linoone", 115, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_OBSTAGOON_116 ("Galarian Obstagoon", 116, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  SCRAGGY_117 ("Scraggy", 117, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SCRAFTY_118 ("Scrafty", 118, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  INKAY_119 ("Inkay", 119, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MALAMAR_120 ("Malamar", 120, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HOOPA_121 ("Hoopa", 121, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_122 ("Nickit", 122, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_123 ("Nickit", 123, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_124 ("Thievul", 124, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_V_125 ("Grimmsnarl V", 125, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GRIMMSNARL_VMAX_126 ("Grimmsnarl VMAX", 126, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _DARKNESS_]),
  ETERNATUS_V_127 ("Eternatus V", 127, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  ETERNATUS_VMAX_128 ("Eternatus VMAX", 128, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _DARKNESS_]),
  SKARMORY_129 ("Skarmory", 129, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  ARON_130 ("Aron", 130, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  LAIRON_131 ("Lairon", 131, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AGGRON_132 ("Aggron", 132, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  ESCAVALIER_133 ("Escavalier", 133, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINK_134 ("Klink", 134, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  KLANG_135 ("Klang", 135, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINKLANG_136 ("Klinklang", 136, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  GALARIAN_STUNFISK_V_137 ("Galarian Stunfisk V", 137, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  CUFANT_138 ("Cufant", 138, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_139 ("Copperajah", 139, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KANGASKHAN_140 ("Kangaskhan", 140, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TAUROS_141 ("Tauros", 141, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_142 ("Eevee", 142, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SENTRET_143 ("Sentret", 143, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  FURRET_144 ("Furret", 144, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUNSPARCE_145 ("Dunsparce", 145, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TEDDIURSA_146 ("Teddiursa", 146, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_147 ("Ursaring", 147, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LUGIA_148 ("Lugia", 148, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SKITTY_149 ("Skitty", 149, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  DELCATTY_150 ("Delcatty", 150, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SALAMENCE_V_151 ("Salamence V", 151, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  SALAMENCE_VMAX_152 ("Salamence VMAX", 152, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _COLORLESS_]),
  STARLY_153 ("Starly", 153, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  STARAVIA_154 ("Staravia", 154, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STARAPTOR_155 ("Staraptor", 155, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUCKLETT_156 ("Ducklett", 156, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SWANNA_157 ("Swanna", 157, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SKWOVET_158 ("Skwovet", 158, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_159 ("Greedent", 159, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BUNNELBY_160 ("Bunnelby", 160, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  FLETCHLING_161 ("Fletchling", 161, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  ROOKIDEE_162 ("Rookidee", 162, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CORVISQUIRE_163 ("Corvisquire", 163, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CORVIKNIGHT_164 ("Corviknight", 164, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  ADVERSITY_GLOVES_165 ("Adversity Gloves", 165, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  BIG_PARASOL_166 ("Big Parasol", 166, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  BIRD_KEEPER_167 ("Bird Keeper", 167, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  CHEERING_YELL_HORN_168 ("Cheering Yell Horn", 168, Rarity.HOLORARE, [TRAINER, ITEM]),
  GLIMWOOD_TANGLE_169 ("Glimwood Tangle", 169, Rarity.HOLORARE, [TRAINER, STADIUM]),
  OLD_COMPUTER_170 ("Old Computer", 170, Rarity.HOLORARE, [TRAINER, ITEM]),
  KABU_171 ("Kabu", 171, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LOOKALIKE_BELL_172 ("Lookalike Bell", 172, Rarity.HOLORARE, [TRAINER, ITEM]),
  PIERS_173 ("Piers", 173, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_174 ("Pokémon Breeder's Nurturing", 174, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_FOSSIL_175 ("Rare Fossil", 175, Rarity.HOLORARE, [TRAINER, ITEM]),
  ROSE_176 ("Rose", 176, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ROSE_TOWER_177 ("Rose Tower", 177, Rarity.HOLORARE, [TRAINER, STADIUM]),
  ROTOM_PHONE_178 ("Rotom Phone", 178, Rarity.HOLORARE, [TRAINER, ITEM]),
  MOUNTAINOUS_SMOKE_179 ("Mountainous Smoke", 179, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  SPIKEMUTH_180 ("Spikemuth", 180, Rarity.HOLORARE, [TRAINER, STADIUM]),
  DUBIOUS_CANNED_GOODS_181 ("Dubious Canned Goods", 181, Rarity.HOLORARE, [TRAINER, ITEM]),
  TOUGHNESS_CAPE_182 ("Toughness Cape", 182, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  TURBO_PATCH_183 ("Turbo Patch", 183, Rarity.HOLORARE, [TRAINER, ITEM]),
  HEAT_FIRE_ENERGY_184 ("Heat Fire Energy", 184, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  HIDE_DARKNESS_ENERGY_185 ("Hide Darkness Energy", 185, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  POWERFUL_COLORLESS_ENERGY_186 ("Powerful Colorless Energy", 186, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CENTISKORCH_V_187 ("Centiskorch V", 187, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VIKAVOLT_V_188 ("Vikavolt V", 188, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  GARDEVOIR_V_189 ("Gardevoir V", 189, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_STUNFISK_V_190 ("Galarian Stunfisk V", 190, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  KABU_191 ("Kabu", 191, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_192 ("Pokémon Breeder's Nurturing", 192, Rarity.ULTRARARE, [TRAINER, SUPPORTER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  DarknessAblaze(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
        move "Dizzy Poison", {
          text "The opponent’s Active Pokémon is now Poisoned and Confused."
          energyCost G
          attackRequirement {}
          onAttack {
            apply POISONED
            apply CONFUSED
          }
        }
        move "Blast Wind", {
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
        move "G-Max Befuddle", {
          text "150 damage. The opponent’s Active Pokémon is now Poisoned and Confused."
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
        move "Solarbeam", {
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
          text "20 damage. Draw cards until you have 5 cards in your hand."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            def toDraw = 5 - hand.size()
            if (toDraw > 0) draw toDraw
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
          text "110 damage. This Pokémon can’t attack during your next turn."
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
          text "20x damage. Flip a coin until you get tails. This does 20 damage times the number of heads."
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
        move "Jet Head", {
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
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          delayedA {
            before ENERGY_COST_CALCULATOR, {
              // TODO: Figure out how to do this right, or if this is already right
              if (self.active && bg.currentTurn == self.owner && bg.em().retrieveObject("Sky_Circus_$self.owner") == bg.turnCount) {
                bc "Sky Circus ignores Energy cost for Rowlet's $ef.move"
                prevent()
              }
            }
          }
        }
        move "Wind Pebbles", {
          text "This attack does 60 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
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
        bwAbility "Forest Camouflage", {
          text "Prevent all damage done to this Pokémon by the attacks of your opponent’s Pokémon V and Pokémon-GX."
          // TODO: This could be made a static that takes a closure that gets evaluated in the if statement.
          // Similar to part of Safeguards effect. Safeguard could possibly use it as well.
          // Ex: abilityPreventsDamage(String info, Object delegate, Closure filter={true}, def target=self)
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                def info = "Forest Camouflage prevents all damage from Pokémon V and Pokémon-GX"
                def filter = { attacker -> attacker.pokemonGX || attacker.pokemonV }
                if (it.to == self && it.from.owner != self.owner && filter(it.from) && it.notNoEffect && it.dmg.value) {
                  bc info
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Split Arrow", {
          text "90 damage. This attack does 20 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
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
          text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon."
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
          text "Choose 1 of your opponent’s Benched Pokémon and switch it with their Active Pokémon."
          energyCost C
          attackRequirement {
            assert opp.bench : "Your opponent has no benched Pokémon"
          }
          onAttack {
            def info = "Select Pokémon to switch with opponent's Active Pokémon."
            def selectedPokemon = opp.bench.select info
            sw defending, selectedPokemon
          }
        }
        move "Slap", {
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
          text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon for each Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
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
        move "Setback Kick", {
          text "100 damage. You may choose an Energy attached to your opponent’s Active Pokémon and return it to their hand."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 100
            if (confirm("Return an Energy attached to the Active $opp.active.name to your opponent's hand?")) {
              def info = "Select the Energy to return to the opponent's hand."
              def selectedEnergy = defending.cards.filterByType(ENERGY).select info
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
        move "Adversity Slash", {
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
      case FLAREON_21:
      return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            apply BURNED
          }
        }
        move "Kindle", {
          text "120 damage. Discard an Energy from this Pokémon. Then, discard an Energy from your opponent’s Active Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
            if (self.cards.energyCount(C)) {
              afterDamage {
                discardSelfEnergy C
              }
              discardDefendingEnergy()
            }
          }
        }
      };
      case HOUNDOOM_V_22:
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
        move "Compensation Flame", {
          text "100+ damage. If any of your [R] Pokémon have damage counters on them, this attack does 100 more damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 100
            def cond = my.all.any {myPokemon -> myPokemon.types.contains(R) && myPokemon.numberOfDamageCounters}
            if (cond) damage 100
          }
        }
      };
      case TORCHIC_23:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it on your Bench. Then, shuffle your deck."
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
      case COMBUSKEN_24:
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
      case BLAZIKEN_25:
      return evolution (this, from:"Combusken", hp:HP170, type:R, retreatCost:2) {
        weakness W
        bwAbility "Double Type", {
          text "This Pokémon is both [R] and [F] type."
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
      case HEATRAN_26:
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
          text "80+ damage. This attack does an additional 10 damage for each damage counter on this Pokemon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 80 + 10 * self.numberOfDamageCounters
          }
        }
      };
      case VICTINI_27:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Draw", {
          text "Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            draw 1
          }
        }
        move "Combustion", {
          text "30 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PANSEAR_28:
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
      case SIMISEAR_29:
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
          text "110 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
            cantAttackNextTurn self
          }
        }
      };
      case GALARIAN_DARMANITAN_30:
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
      case LARVESTA_31:
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
      case VOLCARONA_32:
      return evolution (this, from:"Larvesta", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Scorch Wounds", {
          text "80 damage. If your opponent’s Active Pokémon has no damage counters on it, this attack does nothing."
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
      case FLETCHINDER_33:
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
      case TALONFLAME_34:
      return evolution (this, from:"Fletchinder", hp:HP140, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Scorching Feather", {
          text "If this Pokémon is your Active Pokémon and is damaged by an opponent’s attack, the Attacking Pokémon is now Burned."
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
          text "120 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 120
            cantRetreat defending
          }
        }
      };
      case CENTISKORCH_V_35:
      return basic (this, hp:HP210, type:R, retreatCost:3) {
        weakness W
        move "Radiator", {
          text "20 damage. You may discard an Energy from this  Pokémon. If you do, discard an Energy from your opponent’s Active Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
            if (self.cards.energyCount(C) && confirm("Discard an Energy from $self.name to discard an energy from $defending.name?")) {
              afterDamage {
                discardSelfEnergy C
              }
              discardDefendingEnergy()
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
      case CENTISKORCH_VMAX_36:
      return evolution (this, from:"Centiskorch V", hp:HP320, type:R, retreatCost:3) {
        weakness W
        move "G-Max Centiferno", {
          text "40+ damage. This attack does 40 more damage for each [R] Energy attached to this Pokémon. You may attach a [R] Energy from your discard pile to this Pokémon after calculating damage for this attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40 + 40 * self.cards.energyCount(R)
            afterDamage {
              attachEnergyFrom type: R, may:true, my.discard, self
            }
          }
        }
      };
      case GALARIAN_MR_MIME_37:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness M
        move "Reflect", {
          text "During your opponent’s next turn, any damage done to this Pokémon is reduced by 30."
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
      case GALARIAN_MR_RIME_38:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Shuffle Dance", {
          text "Once during your turn, you may choose 1 of your opponent’s face-down Prize cards and switch it with the top card from their deck. (Both cards remain face-down.)"
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
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case SUICUNE_39:
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
          text "130 damage. Return 2 [W] Energy from this Pokémon to your hand."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage {
              // TODO: Make a static method to do this
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
      };
      case FEEBAS_40:
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
      case MILOTIC_41:
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
      case RELICANTH_42:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Fossil Search", {
          text "Search your deck for up to 2 Rare Fossil cards and put them on your Bench. Then, shuffle your deck."
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
      case PANPOUR_43:
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
      case SIMIPOUR_44:
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
          text "110 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
            cantAttackNextTurn self
          }
        }
      };
      case GALARIAN_DARUMAKA_45:
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
      case GALARIAN_DARMANITAN_46:
      return copy (GALARIAN_DARMANITAN_30, this);
      case VANILLITE_47:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness M
        move "Generate Cold", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
            flip {apply PARALYZED}
          }
        }
      };
      case VANILLISH_48:
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
      case VANILLUXE_49:
      return evolution (this, from:"Vanillish", hp:HP150, type:W, retreatCost:2) {
        weakness M
        bwAbility "Freezing Cold", {
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
      case CUBCHOO_50:
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
      case BEARTIC_51:
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
          text "150 damage. This Pokémon does 50 damage to itself."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 150
            damage 50, self
          }
        }
      };
      case WISHIWASHI_52:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Deep Sea Swirl", {
          text "Shuffle your hand into your deck, then draw 8 cards."
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
      case MAREANIE_53:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness L
        move "Recover", {
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
      case TOXAPEX_54:
      return evolution (this, from:"Mareanie", hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Recover", {
          text "Discard an Energy from this Pokémon. If you do, heal all damage from this Pokémon."
          energyCost C
          attackRequirement {
            assert self.cards.energyCount(C) : "$self.name has no Energy attached"
          }
          onAttack {
            self.cards.findAll {energyFilter C}.select("Select Energy to discard from $self.name.").discard()
            healAll self
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
      case DRACOVISH_55:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:3) {
        weakness L
        bwAbility "Primal Law", {
          text "If this Pokémon is your Active Pokémon, your opponent can’t play any Pokémon from their hand to evolve their Pokémon."
          delayedA {
            before PLAY_EVOLUTION, {
              if (self.active && bg.currentTurn == self.owner.opposite && ef.cardToPlay.player.pbg.hand.contains(ef.cardToPlay)) {
                wcu "$self.name's Primal Law prevents playing Pokémon from your hand to evolve your Pokémon"
                prevent()
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
      case ARCTOVISH_56:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:2) {
        weakness L
        move "Hard Face", {
          text "90 damage. During your opponent’s next turn, this Pokémon takes 60 less damage from attacks."
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
      case ELECTRIKE_57:
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
      case MANECTRIC_58:
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
          text "150 damage. This attack does 30 damage to 1 of your Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
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
      case VIKAVOLT_V_59:
      return basic (this, hp:HP210, type:L, retreatCost:3) {
        weakness F
        move "Paralyzing Bolt", {
          text "50 damage. Your opponent can’t play any Item cards from their hand during their next turn."
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
      case TAPU_KOKO_60:
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
        move "Lightning Ball", {
          text "110 damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case TOXEL_61:
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
      case TOXTRICITY_62:
      return evolution (this, from:"Toxel", hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Risk Taker", {
          text "Flip a coin, if heads discard 5 cards from the top of your opponent’s deck. If tails, discard 5 cards from the top of your deck."
          energyCost C, C
          attackRequirement {
            assert my.deck || opp.deck : "Both decks are empty"
          }
          onAttack {
            flip 1, {if (opp.deck) opp.deck.subList(0, 5).discard()}, {if (my.deck) my.deck.subList(0, 5).discard()}
          }
        }
        move "Thunder Jolt", {
          text "160 damage. This Pokémon does 30 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
            damage 30, self
          }
        }
      };
      case DRACOZOLT_63:
      return evolution (this, from:"Rare Fossil", hp:HP160, type:L, retreatCost:4) {
        weakness F
        move "Rising Charge", {
          text "30 damage. During your next turn, this Pokémon’s Rising Charge attack does 90 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
            increasedBaseDamageNextTurn "Rising Charge", hp(90)
          }
        }
        move "Giga Impact", {
          text "200 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 200
            cantAttackNextTurn self
          }
        }
      };
      case ARCTOZOLT_64:
      return evolution (this, from:"Rare Fossil", hp:HP130, type:L, retreatCost:2) {
        weakness F
        bwAbility "Numbing Vortex", {
          text "Whenever your opponent attaches an Energy from their hand to 1 of their Pokémon, put 2 damage counters on that Pokémon."
          delayedA {
            def flag
            before PLAY_ENERGY, {
              flag = bg.currentTurn == self.owner.opposite && bg.currentTurn.pbg.hand.contains(ef.cardToPlay)
            }
            after ATTACH_ENERGY, {
              if (flag) {
                bc "Numbing Vortext - $ef.resolvedTarget.name receives 2 damage counters."
                directDamage 20, ef.resolvedTarget, SRC_ABILITY
                flag = false
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
      case JIGGLYPUFF_65:
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
      case WIGGLYTUFF_66:
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
      case GALARIAN_SLOWBRO_V_67:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MEW_V_68:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SNUBBULL_69:
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
      case GRANBULL_70:
      return evolution (this, from:"Snubbull", hp:HP130, type:P, retreatCost:2) {
        weakness M
        move "Jaw Lock", {
          text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
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
      case GARDEVOIR_V_71:
      return basic (this, hp:HP210, type:P, retreatCost:2) {
        weakness M
        move "Magical Shot", {
          text "30 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Overflow Pulse", {
          text "120+ damage. If this Pokémon had its HP healed this turn, this attack does 80 more damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 120
            if(self.lastHealedTurn == bg.turnCount) damage 80
          }
        }
      };
      case GARDEVOIR_VMAX_72:
      return evolution (this, from:"Gardevoir V", hp:HP320, type:P, retreatCost:2) {
        weakness M
        move "Max Cure", {
          text "180 damage. Heal 50 damage from this Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 180
            heal 50, self
          }
        }
      };
      case LUNATONE_73:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Future Sight", {
          text "Look at the top 4 cards of either player’s deck, then return them to the top of that deck in any order."
          energyCost C
          rearrangeEitherPlayersDeck(delegate, 4)
        }
        move "Psychic", {
          text "20+ damage. This attack does an additional 20 damage for each Energy attached to your opponent’s Active Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20*(1+ defending.cards.energyCount(C))
          }
        }
      };
      case GOLETT_74:
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
      case GOLURK_75:
      return evolution (this, from:"Golett", hp:HP150, type:P, retreatCost:4) {
        weakness D
        resistance F, MINUS30
        move "Explosive Punch", {
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
      case GOTHITA_76:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Fortune Eye", {
          text "Look at the top 5 cards of your opponent’s deck and put them back on top of their deck in any order."
          energyCost P
          attackRequirement {
            assert opp.deck
          }
          onAttack {
            def deck=opp.deck
            def deck2=rearrange(deck.subList(0,5))
            deck.setSubList(0, deck2)
            bc "Rearranged top 5 cards of opponent's deck."
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
      case GOTHORITA_77:
      return evolution (this, from:"Gothita", hp:HP080, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Whiny Voice", {
          text "Choose 1 random card from your opponent’s hand. Your opponent reveals that card and shuffles it into their deck."
          energyCost P
          attackRequirement {
            assert opp.hand : "Your opponent's hand is empty"
          }
          onAttack {
            opp.hand.select(hidden: true, count: 1, "Choose a random card from your opponent's hand").showToMe("Selected card").showToOpponent("this card will be shuffled into your deck").moveTo(opp.deck)
            shuffleDeck(null, TargetPlayer.OPPONENT)
          }
        }
        move "Double Spin", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost P, C
          attackRequirement {}
          onAttack {
            flip 2, {
              damage 30
            }
          }
        }
      };
      case GOTHITELLE_78:
      return evolution (this, from:"Gothorita", hp:HP140, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Psycho Trip", {
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
        move "Distort", {
          text "90 damage. Choose 2 random cards from your opponent’s hand. Your opponent reveals them and shuffles them into their deck."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 90
            afterDamage{
              opp.hand.select(hidden: true, count: 2, "Choose 2 random cards from your opponent's hand").showToMe("Selected cards").showToOpponent("These cards will be shuffled into your deck").moveTo(opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
        }
      };
      case DEDENNE_79:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case MORELULL_80:
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
      case SHIINOTIC_81:
      return evolution (this, from:"Morelull", hp:HP110, type:P, retreatCost:2) {
        weakness M
        move "Twinking Light", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            flip {
              cantAttackNextTurn(defending)
            }
          }
        }
        move "Forest Fear", {
          text "60+ damage. If Glimwood Tangle is in play, this attack does 60 more damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
            if(bg.stadiumInfoStruct.stadiumCard.name == "Glimwood Tangle"){
              damage 60
            }
          }
        }
      };
      case MIMIKYU_82:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Heal Stop", {
          text "Your opponent’s Benched Pokémon can’t be healed."
          delayedA {
            before REMOVE_DAMAGE_COUNTER, {
              if(ef.lastTarget.owner == self.owner.opposite && ef.lastTarget.benched){
                prevent()
                bc "Heal Stop prevents healing"
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
      case SINISTEA_83:
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
      case POLTEAGEIST_84:
      return evolution (this, from:"Sinistea", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Tea Break", {
          text "Once during your turn, you may discard a Pokémon with a Mad Party attack from your hand and draw 2 cards."
          actionA {
            assert my.hand.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} } : "You have no Pokemon with Mad Party in your hand"
            assert my.deck : "Your deck is empty"
            checkLastTurn()
            powerUsed()
            my.hand.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.select("Choose a Pokemon with Mad Party to discard").discard()
            draw 2
          }
        }
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case DIGLETT_85:
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
      case DUGTRIO_86:
      return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
        weakness G
        move "Dig", {
          text "30 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
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
      case GALARIAN_FARFETCH_D_87: //TODO: Get data on this card.
      return basic (this, hp:HP010, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case GALARIAN_SIRFETCH_D_88:
      return basic (this, hp:HP010, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case LARVITAR_89:
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
      case PUPITAR_90:
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
          text "40 damage. Search your deck for a card that evolves from this Pokémon and play it on top of this Pokémon to evolve it. Then, shuffle your deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage{
              def tar = my.deck.search("Evolves from ${self.name}", {it.cardTypes.is(EVOLUTION) && it.predecessor == self.name})
              if(tar){
                evolve(self, tar.first(), OTHER)
              }
              shuffleDeck()
            }
          }
        }
      };
      case TYRANITAR_91:
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
          text "250 damage. Discard 5 cards from the top of your deck."
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
      case TRAPINCH_92:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Sand Impulse", {
          text "10+ damage. If there is any Stadium card in play, this attack does 10 more damage."
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
      case VIBRAVA_93:
      return evolution (this, from:"Trapinch", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Land's Impulse", {
          text "20 damage. This attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
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
      case FLYGON_94:
      return evolution (this, from:"Vibrava", hp:HP150, type:F, retreatCost:1) {
        weakness G
        bwAbility "Sand Maze", {
          text "If this Pokémon is your Active Pokémon, your opponent’s Active Pokémon can’t Retreat."
          delayedA {
            before RETREAT, {
              if(ef.retreater.owner==self.owner.opposite && self.active){
                wcu "Sand Maze prevents retreating"
                prevent()
              }
            }
          }
        }
        move "Desert Geizer", {
          text "130 damage. If your opponent has a Stadium in play, discard it. If you do, during your opponent’s next turn, prevent all damage and effects done to this Pokémon by the attacks of your opponent’s Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage{
              if (bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
                discard bg.stadiumInfoStruct.stadiumCard
                preventAllEffectsNextTurn()
              }
            }
          }
        }
      };
      case SOLROCK_95:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness G
        bwAbility "Resist Shade", {
          text "If you have Lunatone in play, your opponent’s Pokémon have no Resistance."
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
      case HIPPOPOTAS_96:
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
          text "70+ damage. Flip 2 coins. This attack does 30 more damage times the number of heads."
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
      case HIPPOWDON_97:
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
      case RHYPERIOR_V_98:
      return basic (this, hp:HP230, type:F, retreatCost:4) {
        weakness G
        move "Drill Run", {
          text "80 damage. Discard 1 Energy from your opponent’s Active Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 80
            discardDefendingEnergy()
          }
        }
        move "Heavy Rock Cannon", {
          text "210 damage. This Pokémon can’t use this attack during your next turn."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 210
            cantUseAttack(thisMove, self)
          }
        }
      };
      case DIGGERSBY_99:
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
      case ZYGARDE_100:
      return basic (this, hp:HP140, type:F, retreatCost:3) {
        weakness G
        move "Bite", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Power Blast", {
          text "130 damage. Discard a [F] Energy attached to this Pokémon."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 130
            afterDamage {
              discardSelfEnergy F
            }
          }
        }
      };
      case PASSIMIAN_101:
      return basic (this, hp:HP110, type:F, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them on your Bench. Then, shuffle your deck."
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
      case GRIMER_102:
      return basic (this, hp:HP080, type:D, retreatCost:3) {
        weakness F
        move "Stomp Off", {
          text "Discard 1 card from the top of your opponent’s deck."
          energyCost D
          attackRequirement {
            assert opp.deck : "Your opponent's deck is empty"
          }
          onAttack {
            opp.deck.subList(0,1).discard()
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
      case MUK_103:
      return evolution (this, from:"Grimer", hp:HP140, type:D, retreatCost:4) {
        weakness F
        move "Triple Poison", {
          text "Your opponent’s Active Pokémon is now Poisoned. Put 3 damage counters for this Poison between turns."
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
      case SPINARAK_104:
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
      case ARIADOS_105:
      return evolution (this, from:"Spinarak", hp:HP110, type:D, retreatCost:2) {
        weakness F
        bwAbility "Spider Net", {
          text "When you play this card from your hand to evolve 1 of your Pokémon, you may switch 1 of your opponent’s Evolution Pokémon with their Active Pokémon."
          actionA {
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
      case CROBAT_V_106:
      return basic (this, hp:HP180, type:D, retreatCost:1) {
        weakness F
        bwAbility "Night Asset", {
          text "Once during your turn, when you play this Pokémon from hand to your Bench, you may draw cards until you have 6 cards in your hand. You can’t use more than 1 Night Asset Ability during your turn."
          onActivate {
            if(it==PLAY_FROM_HAND && bg.em().retrieveObject("Night_Asset")!=bg.turnCount && confirm("Use Night Asset?")){
              bg.em().storeObject("Night_Asset",bg.turnCount)
              powerUsed()
              draw (6 - hand.getExcludedList(thisCard).size())
            }
          }
        }
        move "Poison Fang", {
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
      case ABSOL_107:
      return basic (this, hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Dark Cutter", {
          text "70 damage."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case DARKRAI_108:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        bwAbility "Dark Guard", {
          text "If this Pokémon has a [D] Energy attached to it, it takes 20 less damage from attacks."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner == self.owner.opposite && self.cards.energyCount(D)) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Dark Guard -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
        }
        move "Dark Spiral", {
          text "60+ damage. This attack does an additional 20 damage for each [D] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60 + 20*self.cards.energyCount(D)
          }
        }
      };
      case PURRLOIN_109:
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
      case LIEPARD_110:
      return evolution (this, from:"Purrloin", hp:HP100, type:D, retreatCost:1) {
        weakness G
        bwAbility "Limber", {
          text "This Pokémon can’t be Paralyzed."
          delayedA{
            before APPLY_SPECIAL_CONDITION, self {
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
      case DEINO_111:
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
      case ZWEILOUS_112:
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
      case HYDREIGON_113:
      return evolution (this, from:"Zweilous", hp:HP160, type:D, retreatCost:3) {
        weakness G
        bwAbility "Dark Squall", {
          text "As often as you like during your turn, you may attach a [D] Energy from your hand to one of your Pokémon in play."
          actionA {
            assert my.hand.filterByBasicEnergyType(D) : "No [D] in hand"
            powerUsed()
            def card = my.hand.filterByEnergyType(D).select("Choose a [D] Energy Card to attach")
            attachEnergy(my.all.select("To?"), card)
          }
        }
        move "Jet Black Fangs", {
          text "130 damage."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case GALARIAN_ZIGZAGOON_114:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness G
        move "Pin Missile", {
          text "10x damage. Flip 4 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            flip 4, {
              damage 10
            }
          }
        }
      };
      case GALARIAN_LINOONE_115:
      return evolution (this, from:"Galarian Zigzagoon", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Double-Edge", {
          text "60 damage. This attack does 20 damage to this Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
            damage 20, self
          }
        }
      };
      case GALARIAN_OBSTAGOON_116:
      return evolution (this, from:"Galarian Linoone", hp:HP170, type:D, retreatCost:2) {
        weakness G
        bwAbility "Bad Ruler", {
          text "Once during your turn, you may have your opponent discard cards from their hand until they have 4 cards left."
          actionA {
            assert opp.hand.size() > 4 :"Your opponent has 4 or fewer cards in hand"
            checkLastTurn()
            powerUsed()
            def hand = opp.hand.oppSelect(count: 4, "Bad Ruler - Select 4 cards to KEEP (the rest will be discarded)")
            opp.hand.getExcludedList(hand).discard()
          }
        }
        move "Knuckle Impact", {
          text "180 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 180
            cantAttackNextTurn self
          }
        }
      };
      case SCRAGGY_117:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Stampede", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SCRAFTY_118:
      return evolution (this, from:"Scraggy", hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Corner", {
          text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat defending
          }
        }
        move "Bad Brawl", {
          text "90+ damage. If you played Piers this turn, this attack does 90 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
            if(bg.em().retrieveObject("Piers") == bg.turnCount){
              damage 90
            }
          }
        }
      };
      case INKAY_119:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness G
        move "Tackle", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Back Strike", {
          text "20+ damage. If your opponent’s Active Pokémon is Confused, this attack does 50 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            if(defending.isSPC(CONFUSED)){
              damage 50
            }
          }
        }
      };
      case MALAMAR_120:
      return evolution (this, from:"Inkay", hp:HP120, type:D, retreatCost:3) {
        weakness G
        move "Eerie Wave", {
          text "50 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 50
            afterDamage{
              apply CONFUSED
            }
          }
        }
        move "Random Peck", {
          text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 80
            flip 2, {
              damage 40
            }
          }
        }
      };
      case HOOPA_121:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Assault Gate", {
          text "90 damage. If this Pokémon wasn’t moved from your Bench to the Active Spot during your turn, this attack does nothing. This attack isn’t affected by Weakness."
          energyCost D
          attackRequirement {}
          onAttack {
            if(wasSwitchedOutThisTurn(self)){
              noWeaknessDamage(90,defending)
            }
          }
        }
      };
      case NICKIT_122:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Filch", {
          text "Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            draw 1
          }
        }
        move "Tail Slap", {
          text "30 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case NICKIT_123:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
          energyCost D
          attackRequirement {}
          onAttack {
            flip{
              cantAttackNextTurn defending
            }
          }
        }
      };
      case THIEVUL_124:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Nasty Plot", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost D
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            my.deck.search(max:2,"Select up to 2 cards",{true}).moveTo(hidden:true,my.hand)
            shuffleDeck()
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
      case GRIMMSNARL_V_125:
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
      };
      case GRIMMSNARL_VMAX_126:
      return evolution (this, from:"Grimmsnarl V", hp:HP330, type:D, retreatCost:3) {
        weakness G
        move "G-Max Drill", {
          text "170+ damage. This attack does 50 more damage for each extra [D] Energy attached to this Pokémon (in addition to this attack’s cost). You can’t add more than 100 damage in this way."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 170
            extraEnergyDamage(2,hp(50),D,thisMove)
          }
        }
      };
      case ETERNATUS_V_127:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness F
        move "Power Accel", {
          text "30 damage. You may attach 1 [D] Energy from your hand to 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage{
              def card = my.hand.filterByEnergyType(D).select(min:0, "Select a [D] Energy to attach from your hand.")
              if(card){
                def tar = my.bench.select("To?")
                attachEnergy(tar, card)
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
      case ETERNATUS_VMAX_128:
      return evolution (this, from:"Eternatus V", hp:HP340, type:D, retreatCost:3) {
        weakness F
        bwAbility "Infinity Zone", {
          text "If all of your Pokémon in play are [D], you may now have up to 8 [D] Pokémon on your Bench and can’t play any other type of Pokémon. (When this Ability no longer works, discard your Benched Pokémon until there are 5 left.)"
          actionA {
          }
        }
        move "Dread End", {
          text "30x damage. This attack does 30 damage times the number of your [D] Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SKARMORY_129:
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
      case ARON_130:
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
      case LAIRON_131:
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
      case AGGRON_132:
      return evolution (this, from:"Lairon", hp:HP160, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Sturdy", {
          text "If this Pokémon has full HP and would be Knocked Out by damage from an attack, this Pokémon is not Knocked Out, and its remaining HP becomes 10."
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
      case ESCAVALIER_133:
      return evolution (this, from:"Karrablast", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Fury Cutter", {
          text "10+ damage. Flip 3 coins. If 1 is heads, this attack does 20 more damage. If 2 are heads, this attack does 70 more damage. If all 3 are heads, this attack does 140 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
            onAttack {
              damage 10
              flip 3,{},{},[1:{damage 20},2:{damage 70},3:{damage 140}]
            }
          }
        }
        move "Shell Attack", {
          text "60 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KLINK_134:
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
      case KLANG_135:
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
      case KLINKLANG_136:
      return evolution (this, from:"Klang", hp:HP150, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Simple Beam", {
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
            //TODO: This should be a soft requirement.
            assert my.bench.any({ it.name == "Klink" }) : "You have no Klink on your bench."
            assert my.bench.any({ it.name == "Klang" }) : "You have no Klang on your bench."
          }
          onAttack {
            damage 200
          }
        }
      };
      case GALARIAN_STUNFISK_V_137:
      return basic (this, hp:HP200, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Metal Skin", {
          text "This Pokémon’s max HP is increased by 20 for each [M] Energy attached to it."
          getterA (GET_FULL_HP, self) {h->
            h.object += hp(20 * self.cards.energyCount(M))
          }
        }
        move "Trap Bite", {
          text "60 damage. If this Pokémon is damaged by an attack during your opponent’s next turn, put 12 damage counters on the Attacking Pokémon."
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
              after SWITCH, self, {unregister()}
              after EVOLVE, self, {unregister()}
            }
          }
        }
      };
      case CUFANT_138:
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
      case COPPERAJAH_139:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Antibacterial Skin", {
          text "This Pokémon can’t be affected by Special Conditions."
          delayedA {
            before APPLY_SPECIAL_CONDITION, {
              if(e.getTarget(bg) == self){
                bc "Antibacterial Skin prevents $self from being ${ef.type}"
                prevent()
              }
            }
          }
        }
        move "Revenge Stomp", {
          text "120+ damage. If any of your Benched Pokémon have any damage counters on them, this attack does 120 more damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 120
            if (my.bench.find{ it.numberOfDamageCounters }) damage 120
          }
        }
      };
      case KANGASKHAN_140:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Retaliate", {
          text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent’s attack during their last turn, this attack does 90 more damage."
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
      case TAUROS_141:
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
      case EEVEE_142:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Signs of Evolution", {
          text "Search your deck for a Pokémon that evolves from Eevee, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "There are no cards left in your deck"
          }
          onAttack {
            my.deck.search("Select a Pokémon that evolves from Eevee.", {it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"}).showToOpponent("Your opponent chose this Pokémon that evolves from Eevee").moveTo(my.hand)
          }
        }
        move "Kick Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case SENTRET_143:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it on your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily basic:true, 1, delegate
        }
      };
      case FURRET_144:
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
          text "90 damage. Flip a coin. If tails, this attack fails."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { damage 90 }
          }
        }
      };
      case DUNSPARCE_145:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        bwAbility "One Last Dig", {
          text "If this Pokémon is Knocked Out by damage from an opponent’s attack, discard the top 2 cards of your opponent’s deck."
          delayedA (priority: LAST) {
            before (KNOCKOUT, self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && opp.deck) {
                bc "One Last Dig - 2 cards will be discarded from the top of the opponent's deck"
                opp.deck.subList(0,2).discard()
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
      case TEDDIURSA_146:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        move "Baby-Doll Eyes", {
          text "The Defending Pokémon can’t retreat during your opponent’s next turn."
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
      case URSARING_147:
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
      case LUGIA_148:
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
      case SKITTY_149:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Draw Up", {
          text "Search your deck for an Energy card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "You have no cards left in your deck"
          }
          onAttack {
            my.deck.search("Put Energy Card into your hand",cardTypeFilter(ENERGY)).showToOpponent("Opponent's chosen Energy card").moveTo(my.hand)
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
      case DELCATTY_150:
      return evolution (this, from:"Skitty", hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Captivating Tail", {
          text "Switch your opponent’s Active Pokémon with 1 of their Benched Pokémon. The new Active Pokémon is now Confused."
          energyCost C
          attackRequirement {
            assert opp.bench : "Opponent has no Benched Pokémon."
          }
          onAttack {
            if (opp.bench) {
              def target = opp.bench.select("Select the new Active Pokémon.")
              sw defending, target
              apply CONFUSED, target
            }
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
      case SALAMENCE_V_151:
      return basic (this, hp:HP220, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Trans Flight", {
          text "This attack does 30 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance.)"
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
      case SALAMENCE_VMAX_152:
      return evolution (this, from:"Salamence V", hp:HP320, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Twin Sonic", {
          text "This attack does 40 damage to 2 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            multiDamage(opp.all,2,40)
          }
        }
        move "Max Wing", {
          text "240 damage. During your next turn, this Pokémon can’t use Max Wing."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 240
            cantUseAttack(thisMove, self)
          }
        }
      };
      case STARLY_153:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          actionA {
            //TODO: Check ROWLET_11 working, duplicate here
          }
        }
        move "Sharp Eyes", {
          text "Search your deck for any 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C, C
          attackRequirement {
            assert my.deck : "There are no cards left in your deck"
          }
          onAttack {
            deck.select(count: 2).moveTo(hidden: true, hand)
            shuffleDeck()
          }
        }
      };
      case STARAVIA_154:
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
      case STARAPTOR_155:
      return evolution (this, from:"Staravia", hp:HP150, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Hurricane Mixer", {
          text "70 damage. You may move as many Energy cards attached to your Pokémon as you like to any of your other Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 70
            afterDamage{
              if (my.bench && confirm("Do you want to move as many Energy cards attached to your Pokémon as you like to any of your other Pokémon?"))
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
          text "170 damage. This Pokémon does 30 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 170
            damage 30, self
          }
        }
      };
      case DUCKLETT_156:
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
      case SWANNA_157:
      return evolution (this, from:"Ducklett", hp:HP110, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          actionA {
            //TODO: Check ROWLET_11 working, duplicate here
          }
        }
        move "Feather Slash", {
          text "70+ damage. You may discard 1 card from your hand. If you do, this attack does 70 more damage."
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
      case SKWOVET_158:
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
      case GREEDENT_159:
      return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
        weakness F
        move "Scrape Off", {
          text "20 damage. Before doing damage, discard any Pokémon Tools attached to your opponent’s Active Pokémon."
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
          text "100 damage. Return this Pokémon and all cards attached to it to your hand."
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
      case BUNNELBY_160:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20 * my.discard.findAll{ it.cardTypes.is(POKEMON) && it.moves.any{it.name=="Mad Party"} }.size()
          }
        }
      };
      case FLETCHLING_161:
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
      case ROOKIDEE_162:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "10 damage. Before doing damage, discard any Pokémon Tools attached to your opponent’s Active Pokémon."
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
      case CORVISQUIRE_163:
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
          text "40x damage. Flip 3 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 40 }
          }
        }
      };
      case CORVIKNIGHT_164:
      return evolution (this, from:"Corvisquire", hp:HP160, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        bwAbility "Flying Taxi", {
          text "Once during your turn when you play this card from your hand to evolve a Pokémon, you may choose 1 of your Pokémon (excluding any Corviknight). Return that Pokémon and all cards attached to it to your hand."
          onActivate { r->
            if (r==PLAY_FROM_HAND) {
              if (my.all.any{ it.name != "Corviknight" } && confirm("Flying Taxi - Return one of your Pokémon (and all cards attached to it) back to your hand?")){
                def pcs = opp.all.findAll { it.name != "Corviknight" }.select("Which Pokemon to bring back to your hand?")

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
      case ADVERSITY_GLOVES_165:
      return pokemonTool (this) {
        text "If your opponent’s Active Pokémon is the same type as the Weakness of the Pokémon this card is attached to, the attacks of this Pokémon do 30 more damage to your opponent’s Active Pokémon."
        def increasedDmgEff
        onPlay {reason->
          increasedDmgEff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              if (bg.currentTurn == self.owner && ef.attacker == self && self.active) {
                def flag = self.getWeaknesses().any {weakness ->
                  opp.active.types.contains(weakness.type)
                }
                bg.dm().each {
                  if (it.to.active && it.to.owner == self.owner.opposite && it.dmg.value && flag) {
                    bc "Adversity Gloves +30"
                    it.dmg += hp(30)
                    flag = false
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
      case BIG_PARASOL_166:
      return pokemonTool (this) {
        text "As long as the Pokémon this card is attached to is your Active Pokémon, prevent all effects of your opponent’s attacks, except damage, done to all of your Pokémon (existing effects are not removed)."
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
      case BIRD_KEEPER_167:
      return supporter (this) {
        text "Switch your Active Pokémon with 1 of your Benched Pokémon. Then, draw 3 cards."
        onPlay {
          switchYourActive now:true, source:TRAINER
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
      case CHEERING_YELL_HORN_168:
      return itemCard (this) {
        text "Each player’s Active Pokémon is now Confused."
        onPlay {
          apply CONFUSED, opp.active, Source.TRAINER_CARD
          apply CONFUSED, my.active, Source.TRAINER_CARD
        }
        playRequirement{
        }
      };
      case GLIMWOOD_TANGLE_169:
      return stadium (this) {
        text "Once during either player’s turn, after they flip any coins for an attack, that player may ignore all results of those coin flips and begin flipping those coins again."
        // Heavy reference to Victini's Victory Star
        def lastTurn = 0
        def eff
        onPlay {
          eff = delayed {
            before COIN_FLIP_BETWEEN_EXECUTION, {
              if (lastTurn != bg.turnCount && confirm("Glimwood Tangle: Result: $ef.object.lastResultString. Do you want to reflip? ")) {
                lastTurn = bg.turnCount
                bc "Used Glimwood Tangle and discarded those flips"
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
      case OLD_COMPUTER_170:
      return itemCard (this) {
        text "Flip 2 coins. If both are heads, choose 1 card from your discard pile, reveal it, and put it into your hand."
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
      case KABU_171:
      return supporter (this) {
        text "Shuffle your hand into your deck and draw 4 cards. If you only have 1 Pokémon in play, draw 8 cards instead."
        onPlay {
          shuffleDeck(my.hand.getExcludedList(thisCard))
          my.hand.removeAll(my.hand.getExcludedList(thisCard))
          draw(my.bench ? 4 : 8)
        }
        playRequirement{
        }
      };
      case LOOKALIKE_BELL_172:
      return itemCard (this) {
        text "Search your deck for a Pokémon with the same name as a Pokémon in your discard pile, and add it to your hand. Then, shuffle your deck."
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
      case PIERS_173:
      return supporter (this) {
        text "Search your deck for a [D] Pokémon and an Energy card, reveal them, and put them into your hand. Then, shuffle your deck."
          onPlay {

            def darkPokeFilter = {card -> card.cardTypes.is(POKEMON) && card.asPokemonCard().types.contains(D)}

            def tar = my.deck.search(max: 2, "Search your deck for a [D] Pokémon and an Energy card.", {darkPokeFilter(it) || it.cardTypes.is(ENERGY)}, { CardList list ->
              list.findAll{darkPokeFilter(it)}.size() <= 1 && list.filterByType(ENERGY).size() <= 1
            })

            if (tar) { tar.showToOpponent("Opponent's selected [D] Pokémon and Energy card.").moveTo(my.hand) }
            shuffleDeck()
            bg.em().storeObject("Piers", bg.turnCount)
          }
          playRequirement{
            assert my.deck.notEmpty
          }
      };
      case POKEMON_BREEDER_S_NURTURING_174:
      return supporter (this) {
        text "Choose up to 2 of your Pokémon in play. Search your deck for a card that evolves from each of those Pokémon and put it on top of the Pokémon to evolve it. Then, shuffle your deck. (You can’t use this card during your first turn or on a Pokémon that just came into play.)"
        onPlay {
          def tar = my.all.findAll{it.turnCount < bg.turnCount}
          def pl = new PcsList()

          def pcs = tar.select("Pokémon Breeder's Nurturing - Choose which Pokémon you want to search an evolution of. (1/${Math.min(tar.size(), 2)})")
          pl.add(pcs)
          tar.remove(pcs)
          pcs = null

          if (tar){
            pcs = tar.select("Pokémon Breeder's Nurturing - Choose which Pokémon you want to search an evolution of. (2/2) [You can hit cancel and search for only an evolution of ${pl.first()}]", false)

            if (pcs) {
              pl.add(pcs)
              tar.remove(pcs)
            }
          }

          pl.each { preEvo ->
            def sel = deck.search ("Select a Pokémon that evolves from $preEvo.name.", {
              it.cardTypes.is(EVOLUTION) && it.predecessor == preEvo.name
            })
            //Minor TODO: Have this happen after choosing all evolutions? One at a time, then searching for the next is a bit of a weird timing imo.
            if (sel) { evolve(preEvo, sel.first(), OTHER) }
          }

          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Your deck is empty."
          assert bg.turnCount > 2 : "Cannot use this card during your first turn."
          assert my.all.findAll {it.turnCount < bg.turnCount}
        }
      };
      case RARE_FOSSIL_175:
      return itemCard (this) {
        text "Play this card as if it were a 70-HP [C] Basic Pokémon. At any time during your turn (before your attack), you may discard this card from play. This card can’t retreat and isn’t affected by Status Conditions."
        onPlay {
          Card pokemonCard, trainerCard = thisCard
          pokemonCard = basic (new CustomCardInfo(RARE_FOSSIL_175).setCardTypes(BASIC, POKEMON), hp:HP070, type:COLORLESS, retreatCost:0) {
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
                    bc "Rare Fossil can't be affected by special conditions"
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
      case ROSE_176:
      return supporter (this) {
        text "Choose up to 2 basic Energy from your discard pile and attach them to 1 of your Pokémon VMAX. Then, discard your hand."
        onPlay {
          attachEnergyFrom(max:2, basic: true, my.discard, my.all.findAll{it.pokemonVMAX}.select("Attach Energy to which Pokémon VMAX?"))
          my.hand.discard()
        }
        playRequirement{
          assertMyAll(hasPokemonVMAX: true)
          assert my.discard.filterByType(BASIC_ENERGY) : "No Basic Energy in your discard pile"
        }
      };
      case ROSE_TOWER_177:
      return stadium (this) {
        text "Once during either player’s turn, that player may draw cards from their deck until they have 3 cards in their hand."
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
      case ROTOM_PHONE_178:
      return itemCard (this) {
        text "Look at the top 5 cards of your deck. Choose a card you find there, shuffle your deck, then put the card you chose on top of your deck."
        onPlay {
          def card = my.deck.subList(0,5).select("Choose a card to put on top of your deck.").first()
          my.deck.remove(card)
          shuffleDeck()
          my.deck.add(0, card)
        }
        playRequirement{
          assert my.deck.notEmpty : "Your deck is empty"
        }
      };
      case MOUNTAINOUS_SMOKE_179:
      return pokemonTool (this) {
        text "When the Pokémon this card is attached to is Knocked Out by damage from an opponent’s attack, your opponent puts any Prize cards they pick into their discard pile instead of their hand."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case SPIKEMUTH_180:
      return stadium (this) {
        text "Whenever a player’s Pokémon is moved from the Active Spot to the Bench during their turn put 2 damage counters on that Pokémon."
        def eff
        onPlay {
          eff = delayed{
            after FALL_BACK, {
              directDamage 20, ef.fallenBack, TRAINER_CARD //TODO: Cover Omega Barrier
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case DUBIOUS_CANNED_GOODS_181:
      return itemCard (this) {
        text "Heal 80 damage from 1 of your Pokémon with a [P] Energy attached to it. Then, discard a [P] Energy from that Pokémon."
        onPlay {
          def pcs = my.all.findAll{it.cards.energyCount(P) && it.numberOfDamageCounters}.select("Choose which Pokémon to heal 80 damage from")
          heal 80, pcs
          pcs.cards.filterByEnergyType(P).select("Select a [P] Energy to discard from $pcs").discard()
        }
        playRequirement{
          assert my.all.findAll{it.cards.energyCount(P) && it.numberOfDamageCounters} : "You have no damaged Pokémon with [P] Energy attached to them"
        }
      };
      case TOUGHNESS_CAPE_182:
      return pokemonTool (this) {
        text "The maximum HP of the Basic Pokémon this card is attached to is increased by 50 (excluding Pokémon-GX)."
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
      case TURBO_PATCH_183:
      return itemCard (this) {
        text "Flip a coin. If heads, choose a basic Energy card from your discard pile and attach it to 1 of your Basic Pokémon (excluding Pokémon-GX)."
        onPlay {
          flip {
            def pcs = my.all.findAll{it.basic && !(it.pokemonGX)}.select("Choose which of your Basic, non-GX Pokémon to attach to")
            attachEnergyFrom(basic:true, my.discard, pcs)
          }
        }
        playRequirement{
          assert my.all.findAll{it.basic && !(it.pokemonGX)} : "You have no Basic Pokémon that aren't Pokémon-GX"
          assert my.discard.filterByType(BASIC_ENERGY) : "There are no basic Energy cards in your discard pile"
        }
      };
      case HEAT_FIRE_ENERGY_184:
      return specialEnergy (this, [[]]) {
        text "This card provides 1 [R] Energy while it’s attached to a Pokémon. If this card is attached to a [R] Pokémon, its maximum HP is increased by 20."
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
      case HIDE_DARKNESS_ENERGY_185:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [D] Energy. The Retreat Cost of the [D] Pokémon this card is attached to is 0."
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
      case POWERFUL_COLORLESS_ENERGY_186:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [C] Energy. The attacks of the [C] Pokémon this card is attached to do 20 more damage to your opponent’s Active Pokémon."
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
      case CENTISKORCH_V_187:
      return copy (CENTISKORCH_V_35, this);
      case VIKAVOLT_V_188:
      return copy (VIKAVOLT_V_59, this);
      case GARDEVOIR_V_189:
      return copy (GARDEVOIR_V_71, this);
      case GALARIAN_STUNFISK_V_190:
      return copy (GALARIAN_STUNFISK_V_137, this);
      case KABU_191:
      return copy (KABU_171, this);
      case POKEMON_BREEDER_S_NURTURING_192:
      return copy (POKEMON_BREEDER_S_NURTURING_174, this);
        default:
      return null;
    }
  }
}
