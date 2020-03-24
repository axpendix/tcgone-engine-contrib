package tcgwars.logic.impl.gen7;

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
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum UnbrokenBonds implements LogicCardInfo {

  PHEROMOSA_BUZZWOLE_GX_1 ("Pheromosa & Buzzwole-GX", 1, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _GRASS_]),
  CATERPIE_2 ("Caterpie", 2, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  METAPOD_3 ("Metapod", 3, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BUTTERFREE_4 ("Butterfree", 4, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ODDISH_5 ("Oddish", 5, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ODDISH_6 ("Oddish", 6, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GLOOM_7 ("Gloom", 7, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VILEPLUME_8 ("Vileplume", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VENONAT_9 ("Venonat", 9, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VENONAT_10 ("Venonat", 10, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VENOMOTH_11 ("Venomoth", 11, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VENOMOTH_GX_12 ("Venomoth-GX", 12, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _GRASS_]),
  BELLSPROUT_13 ("Bellsprout", 13, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WEEPINBELL_14 ("Weepinbell", 14, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VICTREEBEL_15 ("Victreebel", 15, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TANGELA_16 ("Tangela", 16, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TANGROWTH_17 ("Tangrowth", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRUBBIN_18 ("Grubbin", 18, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KARTANA_19 ("Kartana", 19, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _GRASS_]),
  RESHIRAM_CHARIZARD_GX_20 ("Reshiram & Charizard-GX", 20, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  GROWLITHE_21 ("Growlithe", 21, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  ARCANINE_22 ("Arcanine", 22, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DARUMAKA_23 ("Darumaka", 23, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DARMANITAN_24 ("Darmanitan", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VOLCANION_25 ("Volcanion", 25, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  LITTEN_26 ("Litten", 26, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  LITTEN_27 ("Litten", 27, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TORRACAT_28 ("Torracat", 28, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  INCINEROAR_29 ("Incineroar", 29, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  SALANDIT_30 ("Salandit", 30, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SALAZZLE_31 ("Salazzle", 31, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BLACEPHALON_32 ("Blacephalon", 32, Rarity.RARE, [POKEMON, BASIC, ULTRA_BEAST, _FIRE_]),
  SQUIRTLE_33 ("Squirtle", 33, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WARTORTLE_34 ("Wartortle", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BLASTOISE_GX_35 ("Blastoise-GX", 35, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _WATER_]),
  POLIWAG_36 ("Poliwag", 36, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWAG_37 ("Poliwag", 37, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWHIRL_38 ("Poliwhirl", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POLIWRATH_39 ("Poliwrath", 39, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  TENTACOOL_40 ("Tentacool", 40, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TENTACRUEL_41 ("Tentacruel", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SLOWPOKE_42 ("Slowpoke", 42, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SLOWBRO_43 ("Slowbro", 43, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEEL_44 ("Seel", 44, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DEWGONG_45 ("Dewgong", 45, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KRABBY_46 ("Krabby", 46, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  KINGLER_47 ("Kingler", 47, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GOLDEEN_48 ("Goldeen", 48, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEAKING_49 ("Seaking", 49, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KYUREM_50 ("Kyurem", 50, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  FROAKIE_51 ("Froakie", 51, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  FROGADIER_52 ("Frogadier", 52, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PYUKUMUKU_53 ("Pyukumuku", 53, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  PIKACHU_54 ("Pikachu", 54, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_55 ("Raichu", 55, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  STUNFISK_56 ("Stunfisk", 56, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  DEDENNE_GX_57 ("Dedenne-GX", 57, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  CHARJABUG_58 ("Charjabug", 58, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VIKAVOLT_59 ("Vikavolt", 59, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ZERAORA_60 ("Zeraora", 60, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  MUK_ALOLAN_MUK_GX_61 ("Muk & Alolan Muk-GX", 61, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  EKANS_62 ("Ekans", 62, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ARBOK_63 ("Arbok", 63, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ZUBAT_64 ("Zubat", 64, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLBAT_65 ("Golbat", 65, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  CROBAT_66 ("Crobat", 66, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GASTLY_67 ("Gastly", 67, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GASTLY_68 ("Gastly", 68, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HAUNTER_69 ("Haunter", 69, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GENGAR_70 ("Gengar", 70, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DROWZEE_71 ("Drowzee", 71, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HYPNO_72 ("Hypno", 72, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KOFFING_73 ("Koffing", 73, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WEEZING_74 ("Weezing", 74, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MEWTWO_75 ("Mewtwo", 75, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_76 ("Mew", 76, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MISDREAVUS_77 ("Misdreavus", 77, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MISMAGIUS_78 ("Mismagius", 78, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ESPURR_79 ("Espurr", 79, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MEOWSTIC_80 ("Meowstic", 80, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MARSHADOW_81 ("Marshadow", 81, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MARSHADOW_MACHAMP_GX_82 ("Marshadow & Machamp-GX", 82, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIGHTING_]),
  SANDSHREW_83 ("Sandshrew", 83, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSLASH_84 ("Sandslash", 84, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DIGLETT_85 ("Diglett", 85, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_86 ("Dugtrio", 86, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GEODUDE_87 ("Geodude", 87, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAVELER_88 ("Graveler", 88, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GOLEM_89 ("Golem", 89, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  CUBONE_90 ("Cubone", 90, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAROWAK_91 ("Marowak", 91, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYHORN_92 ("Rhyhorn", 92, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYHORN_93 ("Rhyhorn", 93, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYDON_94 ("Rhydon", 94, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYPERIOR_95 ("Rhyperior", 95, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  WOOPER_96 ("Wooper", 96, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  QUAGSIRE_97 ("Quagsire", 97, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GLIGAR_98 ("Gligar", 98, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLISCOR_99 ("Gliscor", 99, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TYROGUE_100 ("Tyrogue", 100, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  HITMONTOP_101 ("Hitmontop", 101, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  RIOLU_102 ("Riolu", 102, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LANDORUS_103 ("Landorus", 103, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  CRABRAWLER_104 ("Crabrawler", 104, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CRABOMINABLE_105 ("Crabominable", 105, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  STAKATAKA_106 ("Stakataka", 106, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _FIGHTING_]),
  GRENINJA_ZOROARK_GX_107 ("Greninja & Zoroark-GX", 107, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
  MURKROW_108 ("Murkrow", 108, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  HONCHKROW_GX_109 ("Honchkrow-GX", 109, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  CARVANHA_110 ("Carvanha", 110, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SHARPEDO_111 ("Sharpedo", 111, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPIRITOMB_112 ("Spiritomb", 112, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SANDILE_113 ("Sandile", 113, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SANDILE_114 ("Sandile", 114, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  KROKOROK_115 ("Krokorok", 115, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  KROOKODILE_116 ("Krookodile", 116, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  GRENINJA_117 ("Greninja", 117, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  INKAY_118 ("Inkay", 118, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MALAMAR_119 ("Malamar", 119, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  LUCARIO_MELMETAL_GX_120 ("Lucario & Melmetal-GX", 120, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _METAL_]),
  ALOLAN_DIGLETT_121 ("Alolan Diglett", 121, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  ALOLAN_DUGTRIO_122 ("Alolan Dugtrio", 122, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ARON_123 ("Aron", 123, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  LAIRON_124 ("Lairon", 124, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AGGRON_125 ("Aggron", 125, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  LUCARIO_126 ("Lucario", 126, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GENESECT_127 ("Genesect", 127, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  MELTAN_128 ("Meltan", 128, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  MELMETAL_129 ("Melmetal", 129, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GARDEVOIR_SYLVEON_GX_130 ("Gardevoir & Sylveon-GX", 130, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FAIRY_]),
  CLEFFA_131 ("Cleffa", 131, Rarity.UNCOMMON, [POKEMON, BASIC, _FAIRY_]),
  CLEFAIRY_132 ("Clefairy", 132, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  CLEFABLE_133 ("Clefable", 133, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  JIGGLYPUFF_134 ("Jigglypuff", 134, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  WIGGLYTUFF_135 ("Wigglytuff", 135, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  TOGEPI_136 ("Togepi", 136, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  TOGETIC_137 ("Togetic", 137, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  TOGEKISS_138 ("Togekiss", 138, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FAIRY_]),
  COTTONEE_139 ("Cottonee", 139, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  WHIMSICOTT_GX_140 ("Whimsicott-GX", 140, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FAIRY_]),
  SPRITZEE_141 ("Spritzee", 141, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  AROMATISSE_142 ("Aromatisse", 142, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  RATTATA_143 ("Rattata", 143, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RATICATE_144 ("Raticate", 144, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SPEAROW_145 ("Spearow", 145, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FEAROW_146 ("Fearow", 146, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  MEOWTH_147 ("Meowth", 147, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PERSIAN_148 ("Persian", 148, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PERSIAN_GX_149 ("Persian-GX", 149, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  DODUO_150 ("Doduo", 150, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DODRIO_151 ("Dodrio", 151, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LICKITUNG_152 ("Lickitung", 152, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LICKILICKY_153 ("Lickilicky", 153, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PORYGON_154 ("Porygon", 154, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PORYGON_155 ("Porygon", 155, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PORYGON2_156 ("Porygon2", 156, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PORYGON_Z_157 ("Porygon-Z", 157, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  SNORLAX_158 ("Snorlax", 158, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GLAMEOW_159 ("Glameow", 159, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PURUGLY_160 ("Purugly", 160, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  HAPPINY_161 ("Happiny", 161, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHATOT_162 ("Chatot", 162, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CELESTEELA_GX_163 ("Celesteela-GX", 163, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _COLORLESS_]),
  BEAST_BRINGER_164 ("Beast Bringer", 164, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  CHIP_CHIP_ICE_AXE_165 ("Chip-Chip Ice Axe", 165, Rarity.UNCOMMON, [TRAINER, ITEM]),
  DEVOLUTION_SPRAY_Z_166 ("Devolution Spray Z", 166, Rarity.UNCOMMON, [TRAINER, ITEM]),
  DUSK_STONE_167 ("Dusk Stone", 167, Rarity.UNCOMMON, [TRAINER, ITEM]),
  DUST_ISLAND_168 ("Dust Island", 168, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ELECTROMAGNETIC_RADAR_169 ("Electromagnetic Radar", 169, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SPINNER_170 ("Energy Spinner", 170, Rarity.UNCOMMON, [TRAINER, ITEM]),
  FAIRY_CHARM_ABILITY_171 ("Fairy Charm Ability", 171, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FAIRY_CHARM_LIGHTNING_172 ("Fairy Charm Lightning", 172, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  FIRE_CRYSTAL_173 ("Fire Crystal", 173, Rarity.UNCOMMON, [TRAINER, ITEM]),
  GIOVANNI_S_EXILE_174 ("Giovanni's Exile", 174, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GREEN_S_EXPLORATION_175 ("Green’s Exploration", 175, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  JANINE_176 ("Janine", 176, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  KOGA_S_TRAP_177 ("Koga’s Trap", 177, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LT_SURGE_S_STRATEGY_178 ("Lt. Surge’s Strategy", 178, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MARTIAL_ARTS_DOJO_179 ("Martial Arts Dojo", 179, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  METAL_CORE_BARRIER_180 ("Metal Core Barrier", 180, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  MOLAYNE_181 ("Molayne", 181, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEGEAR_3_0_182 ("Pokégear 3.0", 182, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POWER_PLANT_183 ("Power Plant", 183, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  RED_S_CHALLENGE_184 ("Red's Challenge", 184, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  SAMSON_OAK_185 ("Samson Oak", 185, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STEALTHY_HOOD_186 ("Stealthy Hood", 186, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SURPRISE_BOX_187 ("Surprise Box", 187, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ULTRA_FOREST_KARTENVOY_188 ("Ultra Forest Kartenvoy", 188, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  WELDER_189 ("Welder", 189, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TRIPLE_ACCELERATION_ENERGY_190 ("Triple Acceleration Energy", 190, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  PHEROMOSA_BUZZWOLE_GX_191 ("Pheromosa & Buzzwole-GX", 191, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _GRASS_]),
  PHEROMOSA_BUZZWOLE_GX_192 ("Pheromosa & Buzzwole-GX", 192, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _GRASS_]),
  VENOMOTH_GX_193 ("Venomoth-GX", 193, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _GRASS_]),
  RESHIRAM_CHARIZARD_GX_194 ("Reshiram & Charizard-GX", 194, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  DEDENNE_GX_195 ("Dedenne-GX", 195, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  MUK_ALOLAN_MUK_GX_196 ("Muk & Alolan Muk-GX", 196, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  MUK_ALOLAN_MUK_GX_197 ("Muk & Alolan Muk-GX", 197, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  MARSHADOW_MACHAMP_GX_198 ("Marshadow & Machamp-GX", 198, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIGHTING_]),
  MARSHADOW_MACHAMP_GX_199 ("Marshadow & Machamp-GX", 199, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIGHTING_]),
  GRENINJA_ZOROARK_GX_200 ("Greninja & Zoroark-GX", 200, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
  GRENINJA_ZOROARK_GX_201 ("Greninja & Zoroark-GX", 201, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
  HONCHKROW_GX_202 ("Honchkrow-GX", 202, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  LUCARIO_MELMETAL_GX_203 ("Lucario & Melmetal-GX", 203, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _METAL_]),
  GARDEVOIR_SYLVEON_GX_204 ("Gardevoir & Sylveon-GX", 204, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FAIRY_]),
  GARDEVOIR_SYLVEON_GX_205 ("Gardevoir & Sylveon-GX", 205, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FAIRY_]),
  WHIMSICOTT_GX_206 ("Whimsicott-GX", 206, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FAIRY_]),
  PERSIAN_GX_207 ("Persian-GX", 207, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  CELESTEELA_GX_208 ("Celesteela-GX", 208, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _COLORLESS_]),
  GREEN_S_EXPLORATION_209 ("Green’s Exploration", 209, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  JANINE_210 ("Janine", 210, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  KOGA_S_TRAP_211 ("Koga’s Trap", 211, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  MOLAYNE_212 ("Molayne", 212, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  RED_S_CHALLENGE_213 ("Red's Challenge", 213, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  WELDER_214 ("Welder", 214, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  PHEROMOSA_BUZZWOLE_GX_215 ("Pheromosa & Buzzwole-GX", 215, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _GRASS_]),
  VENOMOTH_GX_216 ("Venomoth-GX", 216, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _GRASS_]),
  RESHIRAM_CHARIZARD_GX_217 ("Reshiram & Charizard-GX", 217, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  BLASTOISE_GX_218 ("Blastoise-GX", 218, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _WATER_]),
  DEDENNE_GX_219 ("Dedenne-GX", 219, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  MUK_ALOLAN_MUK_GX_220 ("Muk & Alolan Muk-GX", 220, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  MARSHADOW_MACHAMP_GX_221 ("Marshadow & Machamp-GX", 221, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIGHTING_]),
  GRENINJA_ZOROARK_GX_222 ("Greninja & Zoroark-GX", 222, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
  HONCHKROW_GX_223 ("Honchkrow-GX", 223, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  LUCARIO_MELMETAL_GX_224 ("Lucario & Melmetal-GX", 224, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _METAL_]),
  GARDEVOIR_SYLVEON_GX_225 ("Gardevoir & Sylveon-GX", 225, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FAIRY_]),
  WHIMSICOTT_GX_226 ("Whimsicott-GX", 226, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FAIRY_]),
  PERSIAN_GX_227 ("Persian-GX", 227, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  CELESTEELA_GX_228 ("Celesteela-GX", 228, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _COLORLESS_]),
  BEAST_BRINGER_229 ("Beast Bringer", 229, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  ELECTROMAGNETIC_RADAR_230 ("Electromagnetic Radar", 230, Rarity.SECRET, [TRAINER, ITEM]),
  FIRE_CRYSTAL_231 ("Fire Crystal", 231, Rarity.SECRET, [TRAINER, ITEM]),
  METAL_CORE_BARRIER_232 ("Metal Core Barrier", 232, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  POKEGEAR_3_0_233 ("Pokégear 3.0", 233, Rarity.SECRET, [TRAINER, ITEM]),
  TRIPLE_ACCELERATION_ENERGY_234 ("Triple Acceleration Energy", 234, Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  UnbrokenBonds(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.UNBROKEN_BONDS;
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
      case PHEROMOSA_BUZZWOLE_GX_1:
        return basic (this, hp:HP260, type:G, retreatCost:2) {
          weakness R
          move "Jet Punch", {
            text "30 damage. This attack does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            onAttack {
              damage 30
              if(opp.bench) damage 30, opp.bench.select()
            }
          }
          move "Elegant Sole", {
            text "190 damage. During your next turn, this Pokémon's Elegant Sole attack's base damage is 60."
            energyCost G, G, C
            onAttack {
              damage 190
              afterDamage {decreasedBaseDamageNextTurn(self, "Elegant Sole", hp(130))}
            }
          }
          move "Beast Game GX", {
            text "50 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card. If this Pokémon has at least 7 extra Energy attached to it (in addition to this attack's cost), take 3 more Prize cards instead. (You can’t use more than 1 GX attack in a game.)"
            energyCost G
            attackRequirement{
              gxCheck()
            }
            onAttack{
              damage 50
              gxPerform()
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs, {
                  bg.em().run(new TakePrize(self.owner, pcs))
                  if(self.cards.energySufficient(thisMove.energyCost + C + C+ C+ C+ C+ C+ C)){
                    bg.em().run(new TakePrize(self.owner, pcs))
                    bg.em().run(new TakePrize(self.owner, pcs))
                  }
                }
                unregisterAfter 1
              }
            }
          }

        };
      case CATERPIE_2:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R
          bwAbility "Pupate", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            actionA {
              assert my.deck : "There is no more card in your deck"
              checkLastTurn()
              powerUsed()
              flip {
                deck.search ("Evolves from ${self.name}", {it.cardTypes.is(EVOLUTION) && self.name==it.predecessor}).each { evolve(self, it, OTHER) }
                shuffleDeck()
              }
            }
          }
          move "Hook", {
            text "10 damage. "
            energyCost C, C
            onAttack {
              damage 10
            }
          }

        };
      case METAPOD_3:
        return evolution (this, from:"Caterpie", hp:HP070, type:G, retreatCost:3) {
          weakness R
          bwAbility "Emerge", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            actionA {
              assert my.deck : "There is no more card in your deck"
              checkLastTurn()
              powerUsed()
              flip {
                deck.search ("Evolves from ${self.name}", {it.cardTypes.is(EVOLUTION) && self.name==it.predecessor}).each { evolve(self, it, OTHER) }
                shuffleDeck()
              }
            }
          }
          move "Bug Bite", {
            text "30 damage. "
            energyCost G, C, C
            onAttack {
              damage 30
            }
          }

        };
      case BUTTERFREE_4:
        return evolution (this, from:"Metapod", hp:HP130, type:G, retreatCost:1) {
          weakness R
          move "Triple Charge", {
            text "Search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "there is no more card in your deck"
            }
            onAttack {
              my.deck.search (max: 3, cardTypeFilter(BASIC_ENERGY)).each {
                attachEnergy(my.all.select("Attach $it to"), it)
              }
              shuffleDeck()
            }
          }
          move "Solar Beam", {
            text "70 damage. "
            energyCost G, C, C
            onAttack {
              damage 70
            }
          }

        };
      case ODDISH_5:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R
          move "Stun Spore", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
          move "Seed Bomb", {
            text "20 damage. "
            energyCost G, C
            onAttack {
              damage 20
            }
          }

        };
      case ODDISH_6:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Hook", {
            text "10 damage. "
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case GLOOM_7:
        return evolution (this, from:"Oddish", hp:HP080, type:G, retreatCost:2) {
          weakness R
          bwAbility "Irresistible Aroma", {
            text "Once during your turn (before your attack), if your opponent's Bench isn't full, you may flip a coin. If heads, your opponent reveals their hand. Put a Basic Pokémon you find there onto their Bench."
            actionA {
              assert opp.bench.notFull : "There is no more space on your opponent bench"
              checkLastTurn()
              powerUsed()
              flip {
                opp.hand.showToMe("Opponent's hand")
                if(opp.hand.findAll{it.cardTypes.is(BASIC)}){
                  def card = opp.hand.findAll{it.cardTypes.is(BASIC)}.select("select the pokémon to put on the bench").first()
                  opp.hand.remove(card)
                  benchPCS(card, OTHER, TargetPlayer.OPPONENT)
                }
              }
            }
          }
          move "Drool", {
            text "30 damage. "
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case VILEPLUME_8:
        return evolution (this, from:"Gloom", hp:HP140, type:G, retreatCost:3) {
          weakness R
          bwAbility "Varied Pollen", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, choose Asleep, Burned, Confused, or Poisoned. Your opponent's Active Pokémon is now affected by that Special Condition."
            actionA {
              checkLastTurn()
              powerUsed()
              flip {
                apply(choose([ASLEEP,BURNED,CONFUSED,POISONED], ["Asleep", "Burned", "Confused", "Poisoned"], "Apply to Your opponent's Active Pokémon") as SpecialConditionType, opp.active, Source.SRC_ABILITY)
              }
            }
          }
          move "Giant Bloom", {
            text "90 damage. Heal 30 damage from this Pokémon."
            energyCost G, G, C
            onAttack {
              damage 90
              afterDamage {heal 30, self}
            }
          }

        };
      case VENONAT_9:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Radar Eyes", {
            text "Look at the top 7 cards of your deck and put 1 of them into your hand. Shuffle the other cards back into your deck."
            energyCost G
            attackRequirement {
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              deck.subList(0,7).select("Put to hand").moveTo(hidden:true,hand)
              shuffleDeck()
            }
          }
          move "Flop", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case VENONAT_10:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Psybeam", {
            text "10 damage. Your opponent's Active Pokémon is now Confused."
            energyCost G
            onAttack {
              damage 10
              applyAfterDamage(CONFUSED)
            }
          }

        };
      case VENOMOTH_11:
        return evolution (this, from:"Venonat", hp:HP090, type:G, retreatCost:0) {
          weakness R
          move "Assassin Flight", {
            text "You can use this attack only if your opponent's Active Pokémon is affected by a Special Condition. This attack does 90 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {
              assert !opp.active.noSPC() : "Your opponent's Active Pokémon is NOT affected by a Special Condition"
              assert opp.bench.notEmpty : "Empty opponent bench"
            }
            onAttack {
              damage 90, opp.bench.select()
            }
          }
          move "Poison Powder", {
            text "30 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost G
            onAttack {
              damage 30
              applyAfterDamage(POISONED)
            }
          }

        };
      case VENOMOTH_GX_12:
        return evolution (this, from:"Venonat", hp:HP200, type:G, retreatCost:1) {
          weakness R
          move "Shinobi Mastery", {
            text "110+ damage. If you played Koga's Trap from your hand during this turn, this attack does 90 more damage. If you played Janine from your hand during this turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon during your opponent's next turn."
            energyCost G, C, C
            onAttack {
              damage 110
              if(bg.em().retrieveObject("KOGA_S_TRAP_TURN")==bg.turnCount){
                damage 90
              }
              if(bg.em().retrieveObject("JANINE_TURN")==bg.turnCount){
                bc "$self won't be affected by damage from basic pokemon next turn"
                preventAllDamageFromCustomPokemonNextTurn(thisMove, self, {it.basic})
              }
            }
          }
          move "Ten-Card Return GX", {
            text "60 damage. Shuffle your hand into your deck. Then, draw 10 cards. (You can’t use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {gxCheck()}
            onAttack {
              damage 60
              gxPerform()
              if(my.deck || my.hand){
                my.hand.moveTo(my.deck)
                shuffleDeck()
                draw 10
              }
            }
          }

        };
      case BELLSPROUT_13:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R
          move "Razor Leaf", {
            text "20 damage. "
            energyCost G
            onAttack {
              damage 20
            }
          }

        };
      case WEEPINBELL_14:
        return evolution (this, from:"Bellsprout", hp:HP080, type:G, retreatCost:2) {
          weakness R
          move "Burning Venom", {
            text "Your opponent's Active Pokémon is now Burned and Poisoned."
            energyCost G
            onAttack {
              apply BURNED
              apply POISONED
            }
          }
          move "Ram", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case VICTREEBEL_15:
        return evolution (this, from:"Weepinbell", hp:HP140, type:G, retreatCost:2) {
          weakness R
          move "Reactive Poison", {
            text "10+ damage. This attack does 60 more damage for each Special Condition affecting your opponent's Active Pokémon."
            energyCost G
            onAttack {
              damage 10+60*defending.specialConditions.size()
            }
          }
          move "Gastro Acid", {
            text "90 damage. The Defending Pokémon has no Abilities until the end of your next turn."
            energyCost G, C, C
            onAttack {
              damage 90
              def pcs = opp.active
              delayed {
                def eff=null
                register {
                  eff=getter(GET_ABILITIES, BEFORE_LAST, pcs) {h->
                    h.object.keySet().removeIf{it instanceof BwAbility}
                  }
                }
                unregister {
                  eff.unregister()
                  bg.em().run(new CheckAbilities())
                }
                unregisterAfter 3
                after SWITCH, pcs, {unregister()}
                after EVOLVE, pcs, {unregister()}
              }
              bg.em().run(new CheckAbilities())
            }
          }

        };
      case TANGELA_16:
        return basic (this, hp:HP080, type:G, retreatCost:2) {
          weakness R
          move "Tangle Drag", {
            text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
            energyCost G
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw(opp.active, opp.bench.select())
            }
          }
          move "Gentle Slap", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case TANGROWTH_17:
        return evolution (this, from:"Tangela", hp:HP130, type:G, retreatCost:3) {
          weakness R
          move "Bind Down", {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost G
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Chlorowhip", {
            text "90 damage. If this Pokémon has at least 2 [G] Energy attached to it, heal 60 damage from this Pokémon."
            energyCost C, C, C
            onAttack {
              damage 90
              if(self.cardTypes.energyCount(G) >= 2){
                healAfterDamage 60, self
              }
            }
          }

        };
      case GRUBBIN_18:
        return basic (this, hp:HP060, type:G, retreatCost:2) {
          weakness R
          move "Electrical Signal", {
            text "Search your deck for up to 2 [L] Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              deck.search(max: 2, pokemonTypeFilter(L)).moveTo(hand)
              shuffleDeck()
            }
          }
          move "Corkscrew Punch", {
            text "30 damage. "
            energyCost C, C, C
            onAttack {
              damage 30
            }
          }

        };
      case KARTANA_19:
        return basic (this, hp:HP070, type:G, retreatCost:0) {
          weakness R
          move "Big Cut", {
            text "10+ damage. If you have exactly 4 Prize cards remaining, this attack does 120 more damage."
            energyCost G
            onAttack {
              damage 10
              if(my.prizeCardSet.size() == 4){
                damage 120
              }
            }
          }
          move "False Swipe", {
            text "Flip a coin. If heads, put damage counters on your opponent's Active Pokémon until its remaining HP is 10."
            energyCost G, C, C
            onAttack {
              flip {
                directDamage opp.active.remainingHP.value - 10, opp.active
              }
            }
          }

        };
      case RESHIRAM_CHARIZARD_GX_20:
        return basic (this, hp:HP270, type:R, retreatCost:3) {
          weakness W
          move "Outrage", {
            text "30+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost R, C
            onAttack {
              damage 30+10*self.numberOfDamageCounters
            }
          }
          move "Flare Strike", {
            text "230 damage. This Pokémon can't use Flare Strike during your next turn."
            energyCost R, R, R, C
            onAttack {
              damage 230
              cantUseAttack(thisMove, self)
            }
          }
          move "Double Blaze GX", {
            text "200+ damage. If this Pokémon has at least 3 extra [R] Energy attached to it (in addition to this attack's cost), this attack does 100 more damage, and this attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost R, R, R
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              if(self.cards.energySufficient(thisMove.energyCost + R + R + R)){
                shredDamage 300
              } else {
                damage 200
              }
            }
          }

        };
      case GROWLITHE_21:
        return basic (this, hp:HP080, type:R, retreatCost:2) {
          weakness W
          move "Live Coal", {
            text "10 damage. "
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Combustion", {
            text "30 damage. "
            energyCost R, R
            onAttack {
              damage 30
            }
          }

        };
      case ARCANINE_22:
        return evolution (this, from:"Growlithe", hp:HP140, type:R, retreatCost:4) {
          weakness W
          move "Grand Flame", {
            text "120 damage. Attach 2 [R] Energy cards from your discard pile to 1 of your Benched Pokémon."
            energyCost R, R, R
            onAttack {
              damage 120
              afterDamage {
                if(my.bench.notEmpty){
                  def list = my.discard.filterByEnergyType(R).select(count:2)
                  def pcs = my.bench.select("To?")
                  list.each {attachEnergy(pcs, it)}
                }
              }
            }
          }
          move "Heat Tackle", {
            text "190 damage. This Pokémon does 50 damage to itself."
            energyCost R, R, R, R
            onAttack {
              damage 190
              damage 50, self
            }
          }

        };
      case DARUMAKA_23:
        return basic (this, hp:HP080, type:R, retreatCost:2) {
          weakness W
          move "Flame Charge", {
            text "10 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost C
            onAttack {
              damage 10
              afterDamage {
                attachEnergyFrom(type: FIRE, my.deck, self)
                shuffleDeck()
              }
            }
          }
          move "Flop", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case DARMANITAN_24:
        return evolution (this, from:"Darumaka", hp:HP130, type:R, retreatCost:3) {
          weakness W
          move "Find Wildfire", {
            text "Search your deck for up to 3 [R] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max:3,"Select up to 3 [R] Energy cards",basicEnergyFilter(R)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Flare Blitz", {
            text "110 damage. Discard all [R] Energy from this Pokémon."
            energyCost R, R
            onAttack {
              damage 110
              discardAllSelfEnergy(R)
            }
          }

        };
      case VOLCANION_25:
        return basic (this, hp:HP120, type:R, retreatCost:2) {
          weakness W
          move "Flare Starter", {
            text "Search your deck for a [R] Energy card and attach it to 1 of your Pokémon. If you go second and it's your first turn, instead search for up to 3 [R] Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost R
            attackRequirement {
              assert my.deck
            }
            onAttack {
              attachEnergyFrom(type: R, my.deck, my.all)
              if(bg.turnCount==2){
                attachEnergyFrom(type: R, my.deck, my.all)
                attachEnergyFrom(type: R, my.deck, my.all)
              }
              shuffleDeck()
            }
          }
          move "High-Heat Blast", {
            text "50+ damage. If you have at least 4 [R] Energy in play, this attack does 60 more damage."
            energyCost R, R
            onAttack {
              damage 50
              int c=0
              my.all.each{c+=it.cards.energyCount(R)}
              if(c>=4) damage 60
            }
          }

        };
      case LITTEN_26:
        return basic (this, hp:HP050, type:R, retreatCost:1) {
          weakness W
          move "Singe", {
            text "Your opponent's Active Pokémon is now Burned."
            energyCost R
            onAttack {
              apply BURNED
            }
          }

        };
      case LITTEN_27:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness W
          move "Caturday", {
            text "Draw a card. If you do, this Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 1
              apply ASLEEP, self
            }
          }
          move "Big Bite", {
            text "60 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost R, C, C
            onAttack {
              damage 60
              cantRetreat defending
            }
          }

        };
      case TORRACAT_28:
        return evolution (this, from:"Litten", hp:HP080, type:R, retreatCost:1) {
          weakness W
          move "Fire Fang", {
            text "20 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 20
              applyAfterDamage BURNED
            }
          }

        };
      case INCINEROAR_29:
        return evolution (this, from:"Torracat", hp:HP160, type:R, retreatCost:2) {
          weakness W
          bwAbility "Strong Cheer", {
            text "Your Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance). You can't apply more than 1 Strong Cheer Ability at a time."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner == self.owner){
                  bg.dm().each {
                    if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value && bg.em().retrieveObject("Strong Cheer") != bg.turnCount) {//if not strong cheer has been used before
                      bc "Strong Cheer +30"
                      it.dmg += hp(30)
                      bg.em().storeObject("Strong Cheer", bg.turnCount)
                    }
                  }
                }
              }
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy from this Pokémon."
            energyCost R, C
            onAttack {
              damage 90
              discardSelfEnergy C
            }
          }

        };
      case SALANDIT_30:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W
          move "Grass Fire", {
            text "10 damage. Discard a [G] Energy from your opponent's Active Pokémon."
            energyCost R
            onAttack {
              damage 10
              afterDamage {
                targeted (defending) {
                  if (defending.cards.energyCount(G)) {
                    defending.cards.filterByEnergyType(G).select("Discard").discard()
                  }
                }
              }
            }
          }

        };
      case SALAZZLE_31:
        return evolution (this, from:"Salandit", hp:HP100, type:R, retreatCost:1) {
          weakness W
          bwAbility "Roast Reveal", {
            text "Once during your turn (before your attack), you may discard a [R] Energy card from your hand. If you do, draw 3 cards."
            actionA {
              checkLastTurn()
              assert my.hand.filterByBasicEnergyType(R)
              assert my.deck
              powerUsed()
              my.hand.filterByBasicEnergyType(R).select("Discard").discard()
              draw 3
            }
          }
          move "Combustion", {
            text "60 damage. "
            energyCost R, C
            onAttack {
              damage 60
            }
          }

        };
      case BLACEPHALON_32:
        return basic (this, hp:HP120, type:R, retreatCost:2) {
          weakness W
          move "Blazer", {
            text "10+ damage. Turn 1 of your face-down Prize cards face up. If it's a [R] Energy card, this attack does 50 more damage. (That Prize card remains face up for the rest of the game.)"
            energyCost R
            onAttack {
              damage 10
              def sel = my.prizeCardSet.select(hidden:true, "Reveal a prize card")
              bc "$sel was revealed"
              my.prizeCardSet.setVisible(sel.first(), true)
              if(sel.filterByBasicEnergyType(R)) damage 50
            }
          }
          move "Fireball Circus", {
            text "50x damage. Discard any number of [R] Energy cards from your hand. This attack does 50 damage for each card you discarded in this way."
            energyCost R, R, R
            attackRequirement {
              assert my.hand.filterByBasicEnergyType(R) : "No [R] Energy cards in hand"
            }
            onAttack {
              damage 50*my.hand.filterByBasicEnergyType(R).select(max:my.hand.size(),"Discard [R] Energy cards for 50 damage").discard().size()
            }
          }

        };
      case SQUIRTLE_33:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Bubble", {
            text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost W
            onAttack {
              damage 10
              flip{apply PARALYZED}
            }
          }

        };
      case WARTORTLE_34:
        return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:2) {
          weakness G
          bwAbility "Solid Shell", {
            text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{if(it.to == self && it.notNoEffect && it.dmg.value) {
                  bc "Solid Shell -30"
                  it.dmg -= hp(30)
                }}
              }
            }
          }
          move "Aqua Slash", {
            text "60 damage. This Pokémon can’t attack during your next turn."
            energyCost W, W
            onAttack {
              damage 60
              cantAttackNextTurn self
            }
          }

        };
      case BLASTOISE_GX_35:
        return evolution (this, from:"Wartortle", hp:HP240, type:W, retreatCost:3) {
          weakness G
          bwAbility "Solid Shell", {
            text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{if(it.to == self && it.notNoEffect && it.dmg.value) {
                  bc "Solid Shell -30"
                  it.dmg -= hp(30)
                }}
              }
            }
          }
          move "Rocket Splash", {
            text "60x damage. Shuffle any amount of [W] Energy from your Pokémon into your deck. This attack does 60 damage for each card you shuffled into your deck in this way."
            energyCost W, W
            onAttack {
              def count=0
              def toBeMoved=new CardList()
              while (1) {
                def tar = my.all.findAll {it.cards.filterByEnergyType(W).findAll {!toBeMoved.contains(it)}.notEmpty()}
                if (!tar) break
                def pcs = tar.select("Pokemon that has [W] energy to be shuffled to deck. Cancel to stop", false)
                if (!pcs) break
                def dd = pcs.cards.filterByEnergyType(W).findAll {!toBeMoved.contains(it)}.select("[W] Energy to shuffle into your deck")
                toBeMoved.addAll(dd)
                count++
              }
              damage 60*count
              afterDamage {
                toBeMoved.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
          move "Giant Geyser GX", {
            text "Attach any number of [W] Energy cards from your hand to your Pokémon in any way you like. (You can’t use more than 1 GX attack in a game.)"
            energyCost W
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              def tar = my.hand.filterByBasicEnergyType(W)
              if(tar){
                tar.select(min:0, max:tar.size(), "Select the ones you want to attach").each{
                  attachEnergy(my.all.select("Attach $it to?"), it)
                }
              }
            }
          }

        };
      case POLIWAG_36:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness G
          bwAbility "Round 'n' Round", {
            text "You can use this Ability only if you go second. Once during your first turn (before your attack), you may leave your opponent's Active Pokémon Confused."
            actionA {
              assert bg.turnCount == 2
              checkLastTurn()
              powerUsed()
              apply CONFUSED, opp.active, SRC_ABILITY
            }
          }
          move "Watering", {
            text "10 damage. "
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case POLIWAG_37:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
            energyCost C
            callForFamily(basic:true,1,delegate)
          }

        };
      case POLIWHIRL_38:
        return evolution (this, from:"Poliwag", hp:HP090, type:W, retreatCost:2) {
          weakness G
          move "Bubble", {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost W
            onAttack {
              damage 20
              flip{applyAfterDamage PARALYZED}
            }
          }
          move "Knuckle Punch", {
            text "40 damage. "
            energyCost C, C
            onAttack {
              damage 40
            }
          }

        };
      case POLIWRATH_39:
        return evolution (this, from:"Poliwhirl", hp:HP150, type:W, retreatCost:3) {
          weakness G
          move "Knuckle Punch", {
            text "50 damage. "
            energyCost C, C
            onAttack {
              damage 50
            }
          }
          move "Swirly Rush", {
            text "90+ damage. If Poliwag and Poliwhirl are on your Bench, this attack does 90 more damage."
            energyCost W, C, C
            onAttack {
              damage 90
              if(my.bench.find{it.name=="Poliwag"} && my.bench.find{it.name=="Poliwirl"}){
                damage 90
              }
            }
          }

        };
      case TENTACOOL_40:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Bubble Jutsu", {
            text "10+ damage. If you played Janine from your hand during this turn, this attack does 50 more damage."
            energyCost C
            onAttack {
              damage 10
              if(bg.em().retrieveObject("JANINE_TURN")==bg.turnCount){
                damage 50
              }
            }
          }

        };
      case TENTACRUEL_41:
        return evolution (this, from:"Tentacool", hp:HP100, type:W, retreatCost:1) {
          weakness G
          move "Wicked Tentacles", {
            text "Move an Energy from 1 of your opponent's Pokémon to another of their Pokémon. If you do, put 3 damage counters on the Pokémon you moved the Energy to."
            energyCost C
            attackRequirement {
              assert opp.all.findAll{it.cards.filterByType(ENERGY)}
              assert opp.bench
            }
            onAttack {
              def bothAll = new PcsList();
              opp.all.each{
                bothAll.add(it)
              }
              def pcs = bothAll.findAll{it.cards.filterByType(ENERGY)}.select("Choose the pokémon to move the energy from")
              def tar = bothAll.findAll{it != pcs}.select("Select the pokémon to receive the energy")
              energySwitch(pcs,tar, pcs.cards.filterByType(ENERGY).select("Choose the energy to move").first())
              directDamage 30, tar
            }
          }
          move "Wrap", {
            text "60 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C, C, C
            onAttack {
              damage 60
              flip{applyAfterDamage PARALYZED}
            }
          }

        };
      case SLOWPOKE_42:
        return basic (this, hp:HP070, type:W, retreatCost:2) {
          weakness G
          move "Growl", {
            text "During your opponent’s next turn, the Defending Pokémon’s attacks do 20 less damage (before applying Weakness and Resistance)."
            energyCost W
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Tail Whap", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case SLOWBRO_43:
        return evolution (this, from:"Slowpoke", hp:HP120, type:W, retreatCost:2) {
          weakness G
          move "Yawn", {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost W
            onAttack {
              apply ASLEEP
            }
          }
          move "Three Strikes", {
            text "100x damage. Flip 3 coins. This attack does 100 damage for each heads. If all of them are tails, you lose this game."
            energyCost W, C, C
            onAttack {
              flip 3,{},{},[0:{bg.getGame().endGame(opp.active.owner, WinCondition.OTHER)},1:{damage 100},2:{damage 200},3:{damage 300}]
            }
          }

        };
      case SEEL_44:
        return basic (this, hp:HP080, type:W, retreatCost:2) {
          weakness G
          move "Horn Attack", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case DEWGONG_45:
        return evolution (this, from:"Seel", hp:HP120, type:W, retreatCost:2) {
          weakness M
          move "Tail Whap", {
            text "60 damage. "
            energyCost C, C
            onAttack {
              damage 60
            }
          }
          move "Dual Blizzard", {
            text "Discard 2 Energy from this Pokémon. This attack does 60 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            onAttack {
              discardSelfEnergy C,C
              multiSelect(opp.all,2).each{ damage 60, it }
            }
          }

        };
      case KRABBY_46:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness G
          move "Stampede", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Vice Grip", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case KINGLER_47:
        return evolution (this, from:"Krabby", hp:HP130, type:W, retreatCost:4) {
          weakness G
          move "Bubble Beam", {
            text "80 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost W, C, C
            onAttack {
              damage 80
              flip{applyAfterDamage PARALYZED}
            }
          }
          move "Massive Rend", {
            text "130 damage. "
            energyCost W, C, C, C
            onAttack {
              damage 130
            }
          }

        };
      case GOLDEEN_48:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Elegant Swim", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost W
            onAttack {
              damage 10
              flip {preventAllEffectsNextTurn()}
            }
          }

        };
      case SEAKING_49:
        return evolution (this, from:"Goldeen", hp:HP100, type:W, retreatCost:1) {
          weakness G
          move "Enhanced Horn", {
            text "30x damage. Flip 2 coins. This attack does 30 damage for each heads. If this Pokémon has a Pokémon Tool card attached to it, flip 6 coins instead."
            energyCost W
            onAttack {
              flip self.cards.filterByType(POKEMON_TOOL) ? 6 : 2, { damage 30 }
            }
          }

        };
      case KYUREM_50:
        return basic (this, hp:HP130, type:W, retreatCost:2) {
          weakness M
          move "Call Forth Cold", {
            text "Search your deck for a [W] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              attachEnergyFrom(type: WATER, my.deck, self)
              shuffleDeck()
            }
          }
          move "Hail Prison", {
            text "110 damage. Discard 2 [W] Energy from this Pokémon. Your opponent's Active Pokémon is now Paralyzed."
            energyCost W, W, C
            onAttack {
              damage 110
              discardSelfEnergy W,W
              applyAfterDamage PARALYZED
            }
          }

        };
      case FROAKIE_51:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost C
            onAttack {
              damage 10
              flip { damage 20 }
            }
          }

        };
      case FROGADIER_52:
        return evolution (this, from:"Froakie", hp:HP080, type:W, retreatCost:1) {
          weakness G
          move "Afterimage Strike", {
            text "20 damage. If any damage is done to this Pokémon by attacks during your opponent's next turn, flip a coin. If heads, prevent that damage."
            energyCost C
            onAttack {
              damage 20
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && it.dmg.value && bg.currentTurn != self.owner) {
                      flip {
                        bc "Afterimage Strike prevents damage!"
                        it.dmg = hp(0)
                      }
                    }
                  }
                }
                after SWITCH, self, {unregister()}
                unregisterAfter 2
              }
            }
          }

        };
      case PYUKUMUKU_53:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness G
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
            energyCost C
            callForFamily(basic:true,2,delegate)
          }
          move "Surprise Fist", {
            text "60+ damage. You and your opponent play Rock-Paper-Scissors. If you win, this attack does 60 more damage."
            energyCost W, C, C
            onAttack {
              damage 60
              flip {damage 60}
            }
          }

        };
      case PIKACHU_54:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Pika Ball", {
            text "30 damage. "
            energyCost L, C
            onAttack {
              damage 30
            }
          }

        };
      case RAICHU_55:
        return evolution (this, from:"Pikachu", hp:HP120, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          move "Never Give Up", {
            text "You can use this attack only if you have at least 3 more Prize cards remaining than your opponent. Attach all [L] Energy cards from your discard pile to your Pokémon in any way you like."
            energyCost C
            attackRequirement {
              assert my.prizeCardSet.size()-opp.prizeCardSet.size()>=3
              assert my.discard.filterByEnergyType(L) : "No [L] in discard"
            }
            onAttack {
              def list=my.discard.filterByEnergyType(L)
              list.select(max:list.size()).each {
                attachEnergy(my.all.select("Attach $it to"),it)
              }
            }
          }
          move "Head Bolt", {
            text "110 damage. "
            energyCost L, L, C
            onAttack {
              damage 110
            }
          }

        };
      case STUNFISK_56:
        return basic (this, hp:HP110, type:L, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          move "Raging Thunder", {
            text "30 damage. This attack does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            onAttack {
              damage 30
              if(my.bench){
                damage 10,my.bench.select("Do 10 damage")
              }
            }
          }
          move "Electric Trap", {
            text "30x damage. This attack does 30 damage for each of your Pokémon that has any damage counters on it."
            energyCost C, C
            onAttack {
              damage 30*my.all.findAll{it.numberOfDamageCounters}.size()
            }
          }

        };
      case DEDENNE_GX_57:
        return basic (this, hp:HP160, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          bwAbility "Dedechange", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard your hand and draw 6 cards. You can't use more than 1 Dedechange Ability each turn."
            onActivate {
              if(it==PLAY_FROM_HAND && bg.em().retrieveObject("Dedechange")!=bg.turnCount && confirm("Use Dedechange?")){
                bg.em().storeObject("Dedechange",bg.turnCount)
                powerUsed()
                my.hand.discard()
                draw 6
              }
            }
          }
          move "Static Shock", {
            text "50 damage. "
            energyCost L, C
            onAttack {
              damage 50
            }
          }
          move "Tingly Return GX", {
            text "50 damage. Your opponent’s Active Pokémon is now Paralyzed. Put this Pokémon and all cards attached to it into your hand. (You can’t use more than 1 GX attack in a game.)"
            energyCost L, C
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              damage 50
              afterDamage {
                apply PARALYZED
                self.cards.moveTo(hand)
                removePCS(self)
              }
            }
          }

        };
      case CHARJABUG_58:
        return evolution (this, from:"Grubbin", hp:HP080, type:L, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          bwAbility "Battery", {
            text "Once during your turn (before your attack), you may attach this card from your hand to 1 of your Vikavolt or Vikavolt-GX as a Special Energy card. This card provides 2 [L] Energy only while it’s attached to a Pokémon."
          }
          globalAbility {Card thisCard->
            def lastTurn=0
            action("Battery", [TargetPlayer.fromPlayerType(thisCard.player)]) {
              def text="Once during your turn (before your attack), you may attach this card from your hand to 1 of your Vikavolt or Vikavolt-GX as a Special Energy card. This card provides 2 [L] Energy only while it’s attached to a Pokémon."
              assert thisCard.player.pbg.hand.contains(thisCard) : "Not in hand (try other one)"
              assert bg.turnCount!=lastTurn : "Already used"
              assert checkGlobalAbility(thisCard) : "Blocked"
              def list = thisCard.player.pbg.all.findAll{it.name.contains("Vikavolt") || it.name.contains("Vikavolt-GX")}
              assert list : "No Vikavolt or Vikavolt-GX in play"
              bc "$thisCard used Battery"
              def pcs = list.select("Attach to?")
              def pkmnCard = thisCard
              def energyCard
              energyCard = specialEnergy(new CustomCardInfo(CHARJABUG_58).setCardTypes(ENERGY, SPECIAL_ENERGY), [[L],[L]]) {
                onPlay {}
                onRemoveFromPlay {
                  bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                }
              }
              energyCard.player = thisCard.player
              bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
              attachEnergy(pcs, energyCard)
              bc "$energyCard is now a Special Energy Card that provides 2 [L] energy attached to $pcs"
            }
          }
          move "Pierce", {
            text "60 damage. "
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }

        };
      case VIKAVOLT_59:
        return evolution (this, from:"Charjabug", hp:HP150, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          bwAbility "Stealthy Body", {
            text "If there is any Stadium card in play, this Pokémon has no Weakness."
            getterA (GET_WEAKNESSES, self) {h->
              if(bg.stadiumInfoStruct)
                h.object.clear()
            }
          }
          move "Electricannon", {
            text "120+ damage. You may discard all [L] Energy from this Pokémon. If you do, this attack does 100 more damage."
            energyCost L, L, L, C
            onAttack {
              damage 120
              if(confirm("You may discard all [L] Energy from this Pokémon. If you do, this attack does 100 more damage.")){
                discardAllSelfEnergy(L)
                damage 100
              }
            }
          }

        };
      case ZERAORA_60:
        return basic (this, hp:HP120, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Crushing Claw", {
            text "20 damage. Discard a Special Energy from your opponent's Active Pokémon."
            energyCost L
            onAttack {
              damage 20
              discardDefendingSpecialEnergy(delegate)
            }
          }
          move "Discharge", {
            text "50x damage. Discard all [L] Energy from this Pokémon. This attack does 50 damage for each card you discarded in this way."
            energyCost L, C, C
            onAttack {
              damage 50*discardAllSelfEnergy(L).size()
            }
          }

        };
      case MUK_ALOLAN_MUK_GX_61:
        return basic (this, hp:HP270, type:P, retreatCost:4) {
          weakness P
          move "Severe Poison", {
            text "Your opponent's Active Pokémon is now Poisoned. Put 8 damage counters instead of 1 on that Pokémon between turns."
            energyCost P, C, C
            onAttack {
              apply POISONED
              extraPoison 7
            }
          }
          move "Poison Absorption", {
            text "120 damage. If your opponent's Active Pokémon is Poisoned, heal 100 damage from this Pokémon."
            energyCost P, C, C, C
            onAttack {
              damage 120
              if(defending.isSPC(POISONED)) healAfterDamage(100, self)
            }
          }
          move "Nasty Goo Mix GX", {
            text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)"
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              apply POISONED
              apply PARALYZED
              if(self.cards.energySufficient(thisMove.energyCost + [C,C,C,C])){
                extraPoison 14
              }
            }
          }

        };
      case EKANS_62:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          weakness P
          move "Glare", {
            text "Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {
                apply PARALYZED
              }
            }
          }
          move "Tail Smack", {
            text "20 damage. "
            energyCost P, C
            onAttack {
              damage 20
            }
          }

        };
      case ARBOK_63:
        return evolution (this, from:"Ekans", hp:HP120, type:P, retreatCost:2) {
          weakness P
          move "Wrap", {
            text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
              increasedBaseDamageNextTurn("Heavy Choke", hp(120))
            }
          }
          move "Heavy Choke", {
            text "50+ damage. If this Pokémon used Wrap during your last turn, this attack does 120 more damage."
            energyCost P, C
            onAttack {
              damage 50
            }
          }

        };
      case ZUBAT_64:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost P
            onAttack {
              damage 10
            }
          }
          move "Venoshock", {
            text "20+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 50 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(defending.isSPC(POISONED)) damage 50
            }
          }

        };
      case GOLBAT_65:
        return evolution (this, from:"Zubat", hp:HP080, type:P, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Bite", {
            text "20 damage. "
            energyCost P
            onAttack {
              damage 20
            }
          }
          move "Leech Life", {
            text "40 damage. Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon."
            energyCost C, C, C
            onAttack {
              damage 40
              removeDamageCounterEqualToDamageDone()
            }
          }

        };
      case CROBAT_66:
        return evolution (this, from:"Golbat", hp:HP130, type:P, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          bwAbility "Sound Veil", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all effects of your opponent’s attacks, including damage, done to this Pokémon until the end of your opponent’s next turn."
            onActivate {
              if(it==PLAY_FROM_HAND && confirm("Use Sound Veil?")){
                powerUsed()
                new PreventAllEffectsNextTurn(self).run(bg())
              }
            }
          }
          move "Severe Poison", {
            text "60 damage. Your opponent’s Active Pokémon is now Poisoned. Put 4 damage counters instead of 1 on that Pokémon between turns."
            energyCost C, C, C
            onAttack {
              damage 60
              afterDamage {
                apply POISONED
                extraPoison 3
              }
            }
          }

        };
      case GASTLY_67:
        return basic (this, hp:HP040, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          bwAbility "Swelling Spite", {
            text "When this Pokémon is Knocked Out, search your deck for up to 2 Haunter and put them onto your Bench. Then, shuffle your deck."
            delayedA {
              before (KNOCKOUT,self) {
                if(self.owner.pbg.deck.notEmpty) {
                  bc "Swelling Spite activates"
                  bg.deterministicCurrentThreadPlayerType = self.owner
                  def count = Math.min(my.bench.freeBenchCount, 2)
                  my.deck.search(max:count, "When this Pokémon is Knocked Out, search your deck for up to 2 Haunter and put them onto your Bench. Then, shuffle your deck.", {it.name=="Haunter"}).each {
                    my.deck.remove(it);
                    benchPCS(it)
                  }
                  shuffleDeck()
                  bg.clearDeterministicCurrentThreadPlayerType()
                }
              }
            }
          }
          move "Will-O-Wisp", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case GASTLY_68:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Smog", {
            text "Your opponent's Active Pokémon is now Poisoned."
            energyCost P
            onAttack {
              apply POISONED
            }
          }

        };
      case HAUNTER_69:
        return evolution (this, from:"Gastly", hp:HP070, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Sinister Fog", {
            text "Your opponent's Active Pokémon is now Poisoned. Put 1 damage counter on each of your opponent's Benched Pokémon."
            energyCost P
            onAttack {
              apply POISONED
              opp.bench.each {directDamage 10,it}
            }
          }

        };
      case GENGAR_70:
        return evolution (this, from:"Haunter", hp:HP130, type:P, retreatCost:0) {
          weakness D
          resistance F, MINUS20
          bwAbility "Shadow Pain", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 6 damage counters on your opponent's Pokémon-GX and Pokémon-EX in any way you like."
            onActivate {
              def list = {opp.all.findAll {it.pokemonGX || it.pokemonEX}}
              if(it==PLAY_FROM_HAND && list() && confirm("Use Shadow Pain?")){
                powerUsed()
                (1..6).each {
                  if(list()) directDamage(10, list().select("Put a damage counter on"))
                }
              }
            }
          }
          move "Twilight Poison", {
            text "70 damage. Your opponent's Active Pokémon is now Asleep and Poisoned."
            energyCost C, C, C
            onAttack {
              damage 70
              afterDamage {
                apply ASLEEP
                apply POISONED
              }
            }
          }

        };
      case DROWZEE_71:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          weakness P
          move "Hypnosis", {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost P
            onAttack {
              apply ASLEEP
            }
          }
          move "Psypunch", {
            text "30 damage. "
            energyCost P, C, C
            onAttack {
              damage 30
            }
          }

        };
      case HYPNO_72:
        return evolution (this, from:"Drowzee", hp:HP110, type:P, retreatCost:2) {
          weakness P
          bwAbility "Hypnotic Pendulum", {
            text "When your opponent's Active Pokémon is Knocked Out, flip a coin. If heads, choose which of your opponent's Benched Pokémon becomes their new Active Pokémon."
            delayedA (priority:BEFORE_LAST) {
              before KNOCKOUT, {
                Knockout kef = ef as Knockout
                if(kef.pokemonToBeKnockedOut.owner != self.owner && kef.pokemonToBeKnockedOut.active && kef.pokemonToBeKnockedOut.owner.pbg.bench.notEmpty){
                  powerUsed()
                  flip "Hypnotic Pendulum", {
                    kef.nextActive = kef.pokemonToBeKnockedOut.owner.pbg.bench.select("Hypnotic Pendulum: select new active pokemon", self.owner)
                  }
                }
              }
            }
          }
          move "Stir the Brain", {
            text "30+ damage. This attack does 10 more damage for each card in your opponent's hand."
            energyCost P, C, C
            onAttack {
              damage 30+10*opp.hand.size()
            }
          }

        };
      case KOFFING_73:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          weakness P
          move "Foul Odor", {
            text "Both Active Pokémon are now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
              apply CONFUSED,self
            }
          }

        };
      case WEEZING_74:
        return evolution (this, from:"Koffing", hp:HP120, type:P, retreatCost:3) {
          weakness P
          bwAbility "Detention Gas", {
            text "As long as this Pokémon is your Active Pokémon, put 1 damage counter on each of your opponent's Basic Pokémon between turns."
            delayedA {
              before BEGIN_TURN, {
                boolean flag = 1
                all.each {
                  if(self.active && it.owner != self.owner && it.basic) {
                    if(flag) {bc "Detention Gas activates"; flag = 0}
                    directDamage 10, it, SRC_ABILITY
                  }
                }
              }
            }
          }
          move "Splattering Sludge", {
            text "40 damage. This attack does 20 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            onAttack {
              damage 40
              opp.bench.each{if(it.numberOfDamageCounters) damage 20,it}
            }
          }

        };
      case MEWTWO_75:
        return basic (this, hp:HP120, type:P, retreatCost:2) {
          weakness P
          bwAbility "Mind Report", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may put a Supporter card from your discard pile on top of your deck."
            onActivate {
              if(it==PLAY_FROM_HAND && my.discard.filterByType(SUPPORTER) && confirm("Use Mind Report?")){
                powerUsed()
                my.discard.filterByType(SUPPORTER).select("Mind Report: Put to top of your deck").moveTo(addToTop:true, my.deck)
              }
            }
          }
          move "Psyshock", {
            text "70 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
            energyCost P, C, C
            onAttack {
              shredDamage 70
            }
          }

        };
      case MEW_76:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P
          bwAbility "Bench Barrier", {
            text "Prevent all damage done to your Benched Pokémon by your opponent's attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.to.owner==self.owner && it.to.benched && it.dmg.value){
                  bc "Bench Barrier reduces damage"
                  it.dmg=hp(0)
                }}
              }
            }
          }
          move "Psypower", {
            text "Put 3 damage counters on your opponent's Pokémon in any way you like."
            energyCost C
            onAttack {
              (1..3).each {
                if(opp.all) directDamage(10, opp.all.select("Put a damage counter on"))
              }
            }
          }

        };
      case MISDREAVUS_77:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Ominous Eyes", {
            text "Put 1 damage counter on 1 of your opponent's Pokémon."
            energyCost P
            onAttack {
              if(opp.all) directDamage(10, opp.all.select("Put a damage counter on"))
            }
          }

        };
      case MISMAGIUS_78:
        return evolution (this, from:"Misdreavus", hp:HP110, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          bwAbility "Mysterious Message", {
            text "Once during your turn (before your attack), you may draw cards until you have 7 cards in your hand. If you drew any cards in this way, this Pokémon is Knocked Out."
            actionA {
              assert my.hand.size() < 7
              assert my.deck
              checkLastTurn()
              powerUsed()
              draw 7-my.hand.size()
              new Knockout(self).run(bg)
            }
          }
          move "Hypnoblast", {
            text "70 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost P, C, C
            onAttack {
              damage 70
              applyAfterDamage ASLEEP
            }
          }

        };
      case ESPURR_79:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P
          move "Caturday", {
            text "Draw a card. If you do, this Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 1
              apply ASLEEP,self
            }
          }
          move "Ear Kinesis", {
            text "This attack does 20 damage to 1 of your opponent's Benched Pokémon for each damage counter on that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, C, C
            attackRequirement {
              assert opp.bench.findAll{it.numberOfDamageCounters} : "Opponent does not have a damaged Pokemon"
            }
            onAttack {
              def pcs = opp.bench.findAll{it.numberOfDamageCounters}.select("Deal damage to")
              damage 20*pcs.numberOfDamageCounters, pcs
            }
          }

        };
      case MEOWSTIC_80:
        return evolution (this, from:"Espurr", hp:HP090, type:P, retreatCost:1) {
          weakness P
          move "Caturday", {
            text "Draw 3 cards. If you do, this Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 3
              apply ASLEEP,self
            }
          }
          move "Perplexing Eyes", {
            text "70 damage. The Defending Pokémon’s Weakness is now [P] until the end of your next turn. (The amount of Weakness doesn’t change.)"
            energyCost P, C, C
            onAttack {
              damage 70
              def pcs = defending
              afterDamage { delayed {
                def ef
                register {
                  ef = getter(GET_WEAKNESSES, pcs) { Holder<List<Weakness>> h ->
                    h.object = h.object.collect { it = it.copy(); it.type = PSYCHIC; it }
                  }
                }
                after EVOLVE, pcs, {unregister()}
                after FALL_BACK, pcs, {unregister()}
                unregister {
                  ef.unregister()
                }
                unregisterAfter 3
              } }
            }
          }

        };
      case MARSHADOW_81:
        return basic (this, hp:HP080, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          bwAbility "Resetting Hole", {
            text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may discard any Stadium card in play. If you do, discard this Pokémon and all cards attached to it."
            actionA {
              checkLastTurn()
              assert bg.stadiumInfoStruct
              assert self.benched
              powerUsed()
              discard bg.stadiumInfoStruct.stadiumCard
              self.cards.discard()
              removePCS self
            }
          }
          move "Red Knuckles", {
            text "10+ damage. If your opponent's Active Pokémon is an Ultra Beast, this attack does 60 more damage."
            energyCost C
            onAttack {
              damage 10
              if(defending.topPokemonCard.cardTypes.is(ULTRA_BEAST)) damage 60
            }
          }

        };
      case MARSHADOW_MACHAMP_GX_82:
        return basic (this, hp:HP270, type:F, retreatCost:3) {
          weakness P
          move "Revenge", {
            text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage."
            energyCost F, C
            onAttack {
              damage 30
              if(my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1) damage 90
            }
          }
          move "Hundred-Blows Impact", {
            text "160 damage. "
            energyCost F, F, C
            onAttack {
              damage 160
            }
          }
          move "Acme of Heroism GX", {
            text "200 damage. If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), and if it would be Knocked Out by damage from an opponent's attack during their next turn, it is not Knocked Out, and its remaining HP becomes 10. (You can't use more than 1 GX attack in a game.)"
            energyCost F, F, C
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              damage 200
              if(self.cards.energySufficient(thisMove.energyCost + C)){
                bc "$self will endure a lethal hit next turn"
                delayed {
                  before KNOCKOUT, self, {
                    if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                      self.damage = self.fullHP - hp(10)
                      bc "$self endured the hit!"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after EVOLVE, self, {unregister()}
                  after SWITCH, self, {unregister()}
                }
              }
            }
          }

        };
      case SANDSHREW_83:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness G
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Rolling Tackle", {
            text "30 damage. "
            energyCost F, C, C
            onAttack {
              damage 30
            }
          }

        };
      case SANDSLASH_84:
        return evolution (this, from:"Sandshrew", hp:HP110, type:F, retreatCost:1) {
          weakness G
          move "Continuous Scratch", {
            text "30x damage. Flip 4 coins. This attack does 30 damage for each heads."
            energyCost C
            onAttack {
              flip 4,{damage 30}
            }
          }
          move "Sand Tomb", {
            text "90 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost F, C, C
            onAttack {
              damage 90
              cantRetreat defending
            }
          }

        };
      case DIGLETT_85:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness G
          bwAbility "Underground Work", {
            text "If you discard this Pokémon with the effect of Giovanni's Exile, discard the top card of your opponent's deck."
            // impl in Giovanni's Exile
          }
          move "Hook", {
            text "10 damage. "
            energyCost F
            onAttack {
              damage 10
            }
          }

        };
      case DUGTRIO_86:
        return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
          weakness G
          move "Home Ground", {
            text "30+ damage. If you have any Stadium card in play, this attack does 60 more damage."
            energyCost F
            onAttack {
              damage 30
              if(bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner){
                damage 60
              }
            }
          }

        };
      case GEODUDE_87:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness G
          move "Defense Curl", {
            text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
            energyCost F
            onAttack {
              flip{preventAllDamageNextTurn()}
            }
          }
          move "Rock Throw", {
            text "40 damage. "
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }

        };
      case GRAVELER_88:
        return evolution (this, from:"Geodude", hp:HP110, type:F, retreatCost:4) {
          weakness G
          move "Rolling Rocks", {
            text "50 damage. "
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }
          move "Double-Edge", {
            text "90 damage. This Pokémon does 30 damage to itself."
            energyCost F, C, C, C
            onAttack {
              damage 90
              damage 30,self
            }
          }

        };
      case GOLEM_89:
        return evolution (this, from:"Graveler", hp:HP180, type:F, retreatCost:4) {
          weakness G
          move "Steamroller", {
            text "100 damage. This attack's damage isn't affected by Resistance."
            energyCost C, C, C
            onAttack {
              dontApplyResistance()
              damage 100
            }
          }
          move "Heavy Slam", {
            text "180- damage. This attack does 20 less damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost F, C, C, C
            onAttack {
              damage 180-20*defending.retreatCost
            }
          }

        };
      case CUBONE_90:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness G
          move "Focus Energy", {
            text "During your next turn, this Pokémon's Beat attack's base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Beat",hp(70))
            }
          }
          move "Beat", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case MAROWAK_91:
        return evolution (this, from:"Cubone", hp:HP110, type:F, retreatCost:2) {
          weakness G
          move "Bone Rush", {
            text "50x damage. Flip a coin until you get tails. This attack does 50 damage for each heads."
            energyCost F
            onAttack {
              flipUntilTails {damage 50}
            }
          }
          move "Assault Boom", {
            text "70+ damage. If your opponent's Active Pokémon has a Pokémon Tool card attached to it, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 70
              if(defending.cards.hasType(POKEMON_TOOL)) damage 70
            }
          }

        };
      case RHYHORN_92:
        return basic (this, hp:HP080, type:F, retreatCost:2) {
          weakness G
          move "Push Down", {
            text "20 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost F
            onAttack {
              damage 20
              whirlwind()
            }
          }

        };
      case RHYHORN_93:
        return basic (this, hp:HP090, type:F, retreatCost:4) {
          weakness G
          move "Horn Attack", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Boulder Crush", {
            text "80 damage. "
            energyCost F, C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case RHYDON_94:
        return evolution (this, from:"Rhyhorn", hp:HP110, type:F, retreatCost:4) {
          weakness G
          move "Dirty Work", {
            text "Discard the top card of your opponent's deck. If you played Giovanni's Exile from your hand during this turn, discard the top 5 cards instead."
            energyCost C, C
            attackRequirement {
              assert opp.deck
            }
            onAttack {
              if(bg.em().retrieveObject("GIOVANNI_S_EXILE_174")==bg.turnCount) {
                opp.deck.subList(0,5).discard()
              } else {
                opp.deck.subList(0,1).discard()
              }
            }
          }
          move "Horn Attack", {
            text "90 damage. "
            energyCost F, C, C, C
            onAttack {
              damage 90
            }
          }

        };
      case RHYPERIOR_95:
        return evolution (this, from:"Rhydon", hp:HP170, type:F, retreatCost:4) {
          weakness G
          move "Hefty Cannon", {
            text "90 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn."
            energyCost F, C, C
            onAttack {
              damage 90
              if(defending.basic){
                cantAttackNextTurn(defending)
              }
            }
          }
          move "Break Ground", {
            text "160 damage. This attack does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C, C
            onAttack {
              damage 160
              my.bench.each{damage 20,it}
            }
          }

        };
      case WOOPER_96:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness G
          move "Mud Bomb", {
            text "30 damage. "
            energyCost W, W
            onAttack {
              damage 30
            }
          }

        };
      case QUAGSIRE_97:
        return evolution (this, from:"Wooper", hp:HP120, type:F, retreatCost:2) {
          weakness G
          move "Water Gun", {
            text "20 damage. "
            energyCost W
            onAttack {
              damage 20
            }
          }
          move "Surf", {
            text "120 damage. "
            energyCost W, W, W
            onAttack {
              damage 120
            }
          }

        };
      case GLIGAR_98:
        return basic (this, hp:HP060, type:F, retreatCost:2) {
          weakness G
          bwAbility "Free Flight", {
            text "If this Pokémon has no Energy attached to it, this Pokémon has no Retreat Cost."
            getterA (GET_RETREAT_COST, self) {h->
              if(self.cards.filterByType(ENERGY).isEmpty())
                h.object=0
            }
          }
          move "Shinobi Strike", {
            text "30+ damage. If you played Janine from your hand during this turn, this attack does 90 more damage."
            energyCost C, C, C
            onAttack {
              damage 30
              if(bg.em().retrieveObject("JANINE_TURN")==bg.turnCount){
                damage 90
              }
            }
          }

        };
      case GLISCOR_99:
        return evolution (this, from:"Gligar", hp:HP110, type:F, retreatCost:1) {
          weakness G
          move "Collect", {
            text "Draw 3 cards."
            energyCost C
            attackRequirement {
              assert deck
            }
            onAttack {
              draw 3
            }
          }
          move "Poison Jab", {
            text "70 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost C, C, C
            onAttack {
              damage 70
              applyAfterDamage POISONED
            }
          }

        };
      case TYROGUE_100:
        return basic (this, hp:HP060, type:F, retreatCost:0) {
          bwAbility "Bratty Kick", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, put 3 damage counters on 1 of your opponent's Pokémon. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              powerUsed()
              flip {
                directDamage 30, opp.all.select(), SRC_ABILITY
              }
              bg().gm().betweenTurns()
            }
          }

        };
      case HITMONTOP_101:
        return basic (this, hp:HP090, type:F, retreatCost:1) {
          weakness P
          move "Finishing Combo", {
            text "You can use this attack only if your Hitmonlee used Special Combo during your last turn. This attack does 60 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {
              assert my.lastTurnMove == "Special Combo"
            }
            onAttack {
              opp.all.each {damage 60,it}
            }
          }
          move "Spinning Attack", {
            text "50 damage. "
            energyCost C, C
            onAttack {
              damage 50
            }
          }

        };
      case RIOLU_102:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness P
          move "Feint", {
            text "10 damage. This attack's damage isn't affected by Resistance."
            energyCost C
            onAttack {
              dontApplyResistance()
              damage 10
            }
          }

        };
      case LANDORUS_103:
        return basic (this, hp:HP120, type:F, retreatCost:1) {
          weakness G
          move "Linear Attack", {
            text "This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            onAttack {
              damage 30, opp.all.select()
            }
          }
          move "Power Cyclone", {
            text "60 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
            energyCost F, C
            onAttack {
              damage 60
              afterDamage {
                moveEnergy(self, my.bench)
              }
            }
          }

        };
      case CRABRAWLER_104:
        return basic (this, hp:HP080, type:F, retreatCost:2) {
          weakness P
          move "Corkscrew Punch", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Knuckle Blast", {
            text "30+ damage. If you have more Prize cards remaining than your opponent, this attack does 60 more damage."
            energyCost F, C, C
            onAttack {
              damage 30
              if(my.prizeCardSet.size() > opp.prizeCardSet.size()) damage 60
            }
          }

        };
      case CRABOMINABLE_105:
        return evolution (this, from:"Crabrawler", hp:HP140, type:F, retreatCost:4) {
          weakness P
          move "Fight Alone", {
            text "30+ damage. If you have fewer Pokémon in play than your opponent, this attack does 50 more damage for each Pokémon fewer you have in play."
            energyCost C, C
            onAttack {
              damage 30
              int diff = opp.all.size() - my.all.size()
              if(diff>0) damage 50*diff
            }
          }
          move "Magnum Punch", {
            text "80 damage. "
            energyCost F, C, C
            onAttack {
              damage 80
            }
          }

        };
      case STAKATAKA_106:
        return basic (this, hp:HP120, type:F, retreatCost:4) {
          weakness G
          bwAbility "Wall of Stone", {
            text "If your opponent has 3 or fewer Prize cards remaining, this Pokémon's maximum HP is 200."
            getterA (GET_FULL_HP, self) { Holder h->
              if(self.owner.opposite.pbg.prizeCardSet.size() <= 3) h.object = hp(200)
            }
          }
          move "Top Down", {
            text "110 damage. Flip a coin until you get tails. For each heads, discard the top card of your opponent's deck."
            energyCost F, F, C
            onAttack {
              damage 110
              flipUntilTails {if(opp.deck) opp.deck.subList(0,1).discard()}
            }
          }

        };
      case GRENINJA_ZOROARK_GX_107:
        return basic (this, hp:HP250, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          move "Dark Pulse", {
            text "30+ damage. This attack does 30 more damage times the amount of [D] Energy attached to all of your Pokémon."
            energyCost D, C
            onAttack {
              damage 30
              my.all.each{damage 30*it.cards.energyCount(D)}
            }
          }
          move "Dark Union GX", {
            text "Put 2 in any combination of [D] Pokémon-GX and [D] Pokémon-EX from your discard pile onto your Bench. If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), attach 2 Energy cards from your discard pile to each Pokémon that you put onto your Bench in this way. (You can't use more than 1 GX attack in a game.)"
            energyCost D, C
            def cl1 = {my.discard.findAll{it.cardTypes.isIn(POKEMON_GX, POKEMON_EX) && it.asPokemonCard().types.contains(D)}}
            attackRequirement {
              gxCheck()
              assert cl1() : "No [D] Pokemon-GX or Pokemon-EX in your discard pile"
              assert my.bench.notFull : "Bench full"
            }
            onAttack {
              gxPerform()
              def tar = cl1().select(count:Math.min(2,my.bench.freeBenchCount),"Put to bench").collect{
                my.discard.remove(it)
                benchPCS(it)
              }
              tar = new PcsList(tar)
              if(self.cards.energySufficient(thisMove.energyCost + C)){
                tar.remove(attachEnergyFrom(count: 2, my.discard, tar)[1])
                attachEnergyFrom(count: 2, my.discard, tar)
              }
            }
          }

        };
      case MURKROW_108:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Astonish", {
            text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost D
            onAttack {
              astonish(1)
            }
          }

        };
      case HONCHKROW_GX_109:
        return evolution (this, from:"Murkrow", hp:HP210, type:D, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          bwAbility "Ruler of the Night", {
            text "As long as this Pokémon is your Active Pokémon, your opponent can't play any Pokémon Tool, Special Energy, or Stadium cards from their hand."
            delayedA {
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && ef.card instanceof SpecialEnergyCard && bg.currentTurn == self.owner.opposite && self.active){
                  wcu "Ruler of the Night prevents playing this card"
                  prevent()
                }
              }
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.isIn(STADIUM,POKEMON_TOOL) && bg.currentTurn == self.owner.opposite && self.active) {
                  wcu "Ruler of the Night prevents playing this card"
                  prevent()
                }
              }
            }
          }
          move "Feather Storm", {
            text "90 damage. This attack does 30 damage to 2 of your opponent's Benched Pokémon-GX and Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost D, C, C
            onAttack {
              damage 90
              multiDamage(opp.bench.findAll{it.pokemonGX || it.pokemonEX},2,30)
            }
          }
          move "Unfair GX", {
            text "Your opponent reveals their hand. Discard 2 cards from it. (You can't use more than 1 GX attack in a game.)"
            energyCost C, C
            attackRequirement {
              gxCheck()
              assert opp.hand
            }
            onAttack {
              opp.hand.select(count:2,"Opponent's hand. Discard 2").discard()
              gxPerform()
            }
          }

        };
      case CARVANHA_110:
        return basic (this, hp:HP060, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Gnaw", {
            text "10 damage. "
            energyCost D
            onAttack {
              damage 10
            }
          }

        };
      case SHARPEDO_111:
        return evolution (this, from:"Carvanha", hp:HP110, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          bwAbility "Greedy Evolution", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may look at the top 6 cards of your deck and attach any number of [D] Energy cards you find there to this Pokémon. Shuffle the other cards back into your deck."
            onActivate {r->
              if(r==PLAY_FROM_HAND && my.deck && confirm("Use Greedy Evolution?")){
                powerUsed()
                def list=my.deck.subList(0,6).showToMe("Top 6 cards of your deck").filterByEnergyType(D)
                if(list){
                  list.select(min:0,max:list.size(),"Attach any of them to $self").each{
                    attachEnergy(self,it)
                  }
                }
              }
            }
          }
          move "Bad Fangs", {
            text "60+ damage. This attack does 20 more damage times the amount of [D] Energy attached to this Pokémon."
            energyCost C, C, C
            onAttack {
              damage 60+20*self.cards.energyCount(D)
            }
          }

        };
      case SPIRITOMB_112:
        return basic (this, hp:HP060, type:D, retreatCost:1) {
          bwAbility "Building Spite", {
            text "Once during your turn (before your attack), you may put 1 damage counter on this Pokémon."
            actionA {
              checkLastTurn()
              powerUsed()
              directDamage 10,self
            }
          }
          move "Anguish Cry", {
            text "10+ damage. This attack does 30 more damage for each damage counter on this Pokémon."
            energyCost D
            onAttack {
              damage 10+30*self.numberOfDamageCounters
            }
          }

        };
      case SANDILE_113:
        return basic (this, hp:HP060, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          bwAbility "Intimidating Fang", {
            text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {if(self.active && it.from.active && it.from.owner!=self.owner && it.dmg.value && it.notNoEffect){
                  bc "Intimidating Fang -20"
                  it.dmg -= hp(20)
                }}
              }
            }
          }
          move "Gnaw", {
            text "10 damage. "
            energyCost D
            onAttack {
              damage 10
            }
          }

        };
      case SANDILE_114:
        return basic (this, hp:HP070, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          move "Grandiose Fangs", {
            text "30 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, this Pokémon's attacks do 120 more damage to your opponent's Active Pokémon during your next turn (before applying Weakness and Resistance)."
            energyCost C, C, C
            onAttack {
              damage 30
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs, {
                  bc "$self can do 120 more damage next turn"
                  doMoreDamageNextTurn(thisMove, 120, self)
                }
                unregisterAfter 1
              }
            }
          }

        };
      case KROKOROK_115:
        return evolution (this, from:"Sandile", hp:HP090, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          move "Bite", {
            text "20 damage. "
            energyCost D
            onAttack {
              damage 20
            }
          }
          move "Corner", {
            text "50 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C, C, C
            onAttack {
              damage 50
              cantRetreat defending
            }
          }

        };
      case KROOKODILE_116:
        return evolution (this, from:"Krokorok", hp:HP150, type:D, retreatCost:3) {
          weakness F
          resistance P, MINUS20
          move "Chomp Chomp Panic", {
            text "50x damage. This attack does 50 damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost C, C, C
            onAttack {
              damage 50*defending.retreatCost
            }
          }
          move "Crunch", {
            text "100 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost D, C, C, C
            onAttack {
              damage 100
              discardDefendingEnergy()
            }
          }

        };
      case GRENINJA_117:
        return evolution (this, from:"Frogadier", hp:HP130, type:D, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          move "Bring Down", {
            text "The Pokémon that has the least HP remaining, except for this Pokémon, is Knocked Out. (If multiple Pokémon are tied, choose one.)"
            energyCost C, C
            onAttack {
              def list = all.findAll{it!=self}.sort(false) {p1,p2 -> p1.remainingHP.value <=> p2.remainingHP.value}
              def tar = new PcsList()
              int min = list.get(0).remainingHP.value
              while(list.get(0).remainingHP.value==min){
                tar.add(list.remove(0))
              }
              new Knockout(tar.select("Knock Out")).run(bg)
            }
          }
          move "Mist Slash", {
            text "70 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
            energyCost D, D
            onAttack {
              swiftDamage(70,defending)
            }
          }

        };
      case INKAY_118:
        return basic (this, hp:HP060, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Perplex", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost D
            onAttack {
              apply CONFUSED
            }
          }

        };
      case MALAMAR_119:
        return evolution (this, from:"Inkay", hp:HP100, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Hypnotic Reign", {
            text "Your opponent reveals their hand. You may discard a Pokémon you find there and use one of that Pokémon’s non-GX attacks as this attack."
            energyCost D
            attackRequirement {
              assert opp.hand
            }
            onAttack {
              opp.hand.showToMe("Opponent's hand")
              if(opp.hand.filterByType(POKEMON)){
                def tmp = opp.hand.filterByType(POKEMON).select(min:0, "You may discard a Pokémon you find there and use one of that Pokémon’s non-GX attacks as this attack.")
                if(tmp){
                  def card = tmp.first()
                  bc "$card was chosen"
                  discard card
                  def moves = card.asPokemonCard().moves.findAll{!it.name.contains("GX")}
                  if(moves){
                    def move = choose(moves, "Choose attack")
                    bc "$move was chosen"
                    def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                    attack (move as Move)
                    bef.unregisterItself(bg().em())
                  }
                }
              }
            }
          }
          move "Dark Pressure", {
            text "80 damage. Discard the top card of your opponent's deck."
            energyCost D, C, C
            onAttack {
              damage 80
              if(opp.deck) discard opp.deck.get(0)
            }
          }

        };
      case LUCARIO_MELMETAL_GX_120:
        return basic (this, hp:HP260, type:M, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Steel Fist", {
            text "50 damage. Search your deck for a [M] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost C, C
            onAttack {
              damage 50
              afterDamage {
                attachEnergyFrom(type: M, my.deck, self)
              }
            }
          }
          move "Heavy Impact", {
            text "150 damage. "
            energyCost M, M, C, C
            onAttack {
              damage 150
            }
          }
          move "Full Metal Wall GX", {
            text "For the rest of this game, your [M] Pokémon take 30 less damage from your opponent's attacks (after applying Weakness and Resistance). If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {if(it.to.owner==self.owner && it.to.types.contains(M) && it.from.owner!=it.to.owner && it.notZero && it.notNoEffect){
                    bc "Full Metal Wall -30"
                    it.dmg-=hp(30)
                  }}
                }
              }
              if(self.cards.energySufficient(thisMove.energyCost + C)){
                opp.active.cards.filterByType(ENERGY).discard()
              }
            }
          }

        };
      case ALOLAN_DIGLETT_121:
        return basic (this, hp:HP050, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Ram", {
            text "10 damage. "
            onAttack {
              damage 10
            }
          }

        };
      case ALOLAN_DUGTRIO_122:
        return evolution (this, from:"AlolanDiglett", hp:HP080, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          bwAbility "Hair Wall", {
            text "Your [M] Pokémon take 10 less damage from your opponent's attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to.owner == self.owner && it.to.types.contains(M) && it.dmg.value && it.notNoEffect) {
                    bc "Hair Wall -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Hammer In", {
            text "40 damage. "
            energyCost M, C
            onAttack {
              damage 40
            }
          }

        };
      case ARON_123:
        return basic (this, hp:HP060, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Rigidify", {
            text "During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost M
            onAttack {
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }
          move "Metal Claw", {
            text "20 damage. "
            energyCost M, C
            onAttack {
              damage 20
            }
          }

        };
      case LAIRON_124:
        return evolution (this, from:"Aron", hp:HP090, type:M, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Rigidify", {
            text "During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost M
            onAttack {
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }
          move "Headbutt", {
            text "70 damage. "
            energyCost M, M, C
            onAttack {
              damage 70
            }
          }

        };
      case AGGRON_125:
        return evolution (this, from:"Lairon", hp:HP170, type:M, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          move "Extra-Tight Press", {
            text "80 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out), put 8 damage counters on the Attacking Pokémon."
            energyCost M, C, C
            onAttack {
              damage 80
              delayed (priority: LAST) {
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                    bc "Extra-Tight activates"
                    directDamage(80, ef.attacker as PokemonCardSet)
                  }
                }
                unregisterAfter 2
                after SWITCH, self, {unregister()}
              }
            }
          }
          move "Giga Impact", {
            text "160 damage. This Pokémon can’t attack during your next turn."
            energyCost M, C, C, C
            onAttack {
              damage 160
              cantAttackNextTurn(self)
            }
          }

        };
      case LUCARIO_126:
        return evolution (this, from:"Riolu", hp:HP130, type:M, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Low Sweep", {
            text "40 damage. "
            energyCost C
            onAttack {
              damage 40
            }
          }
          move "Rush Up", {
            text "60+ damage. If you attached a Pokémon Tool card from your hand to this Pokémon during this turn, this attack does 70 more damage."
            energyCost M, M
            onAttack {
              damage 60
              if(self.lastPokemonToolAttachedTurn == bg.turnCount) damage 70
            }
          }

        };
      case GENESECT_127:
        return basic (this, hp:HP130, type:M, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          bwAbility "Fast-Flight Configuration", {
            text "If your opponent has any Pokémon-GX or Pokémon-EX in play, this Pokémon has no Retreat Cost."
            getterA (GET_RETREAT_COST, BEFORE_LAST, self) { h->
              if(self.owner.opposite.pbg.all.find{it.pokemonEX||it.pokemonGX}) h.object = 0
            }
          }
          move "Splitting Beam", {
            text "30 damage. This attack does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, C, C
            onAttack {
              damage 30
              multiDamage(opp.bench,2,30)
            }
          }

        };
      case MELTAN_128:
        return basic (this, hp:HP070, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Steel Melt", {
            text "10+ damage. If your opponent's Active Pokémon is a [M] Pokémon, this attack does 40 more damage."
            energyCost M
            onAttack {
              damage 10
              if(defending.types.contains(M))damage 40
            }
          }

        };
      case MELMETAL_129:
        return evolution (this, from:"Meltan", hp:HP150, type:M, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          bwAbility "Metal Eater", {
            text "Once during your turn (before your attack), you may discard a [M] Pokémon from your hand. If you do, heal 100 damage from this Pokémon."
            actionA {
              checkLastTurn()
              assert my.hand.findAll(pokemonTypeFilter(M)) : "No [M} pokemon in hand"
              assert self.numberOfDamageCounters : "$self is not damaged"
              powerUsed()
              my.hand.findAll(pokemonTypeFilter(M)).select("Discard").discard()
              heal(100,self)
            }
          }
          move "Heavy Impact", {
            text "130 damage. "
            energyCost M, C, C, C
            onAttack {
              damage 130
            }
          }

        };
      case GARDEVOIR_SYLVEON_GX_130:
        return basic (this, hp:HP260, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Fairy Song", {
            text "Search your deck for up to 2 [Y] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.bench.notEmpty()
              assert my.deck.notEmpty()
            }
            onAttack {
              deck.search (max:2,basicEnergyFilter(Y)).each {
                attachEnergy(my.bench.select("Attach $it to"),it)
              }
              shuffleDeck()
            }
          }
          move "Kaleidostorm", {
            text "150 damage. Move any number of Energy from your Pokémon to your other Pokémon in any way you like."
            energyCost Y, Y, C
            onAttack {
              damage 150
              afterDamage {
                while(1){
                  def pl=(my.all.findAll {it.cards.energyCount(C)})
                  if(!pl) break;
                  def src =pl.select("source for energy (cancel to stop)", false)
                  if(!src) break;
                  def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()

                  def tar=my.all.select("Target for energy (cancel to stop)", false)
                  if(!tar) break;
                  energySwitch(src, tar, card)
                }
              }
            }
          }
          move "Magical Miracle GX", {
            text "200 damage. If this Pokémon has at least 3 extra [Y] Energy attached to it (in addition to this attack's cost), your opponent shuffles their hand into their deck. (You can’t use more than 1 GX attack in a game.)"
            energyCost Y, Y, Y
            attackRequirement {gxCheck()}
            onAttack {
              damage 200
              gxPerform()
              if(self.cards.energySufficient(thisMove.energyCost + Y+Y+Y)){
                opp.hand.moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }

        };
      case CLEFFA_131:
        return basic (this, hp:HP060, type:Y, retreatCost:0) {
          bwAbility "Excitable Draw", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, shuffle your hand into your deck and then draw 6 cards. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              powerUsed()
              flip {
                my.hand.moveTo(my.deck)
                shuffleDeck()
                draw 6
              }
              bg.gm().betweenTurns()
            }
          }

        };
      case CLEFAIRY_132:
        return basic (this, hp:HP060, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Double Slap", {
            text "10x damage. Flip 2 coins. This attack does 10 damage for each heads."
            energyCost C
            onAttack {
              flip 2,{damage 10}
            }
          }

        };
      case CLEFABLE_133:
        return evolution (this, from:"Clefairy", hp:HP110, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Moon-Watching Dance", {
            text "10+ damage. This attack does 30 more damage for each of your Pokémon that has any [Y] Energy attached to it."
            energyCost C
            onAttack {
              damage 10+30*my.all.findAll {it.cards.energyCount(Y)}.size()
            }
          }

        };
      case JIGGLYPUFF_134:
        return basic (this, hp:HP070, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Ball Roll", {
            text "20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
            energyCost C, C
            onAttack {
              flipUntilTails {damage 20}
            }
          }

        };
      case WIGGLYTUFF_135:
        return evolution (this, from:"Jigglypuff", hp:HP110, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Orb Polish", {
            text "Put 3 Energy cards from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(ENERGY)
            }
            onAttack {
              my.discard.filterByType(ENERGY).select(count:3,"Put to hand").moveTo(hand)
            }
          }
          move "Sleepy Ball", {
            text "80 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost C, C, C
            onAttack {
              damage 80
              applyAfterDamage ASLEEP
            }
          }

        };
      case TOGEPI_136:
        return basic (this, hp:HP050, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Daunt", {
            text "10 damage. During your opponent's next turn, the Defending Pokémon’s attacks do 30 less damage (before applying Weakness and Resistance)."
            energyCost C
            onAttack {
              damage 10
              reduceDamageFromDefendingNextTurn(hp(30),thisMove,defending)
            }
          }

        };
      case TOGETIC_137:
        return evolution (this, from:"Togepi", hp:HP080, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Energy Present", {
            text "Attach an Energy card from your hand to 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.bench.notEmpty
              assert my.hand.filterByType(ENERGY)
            }
            onAttack {
              attachEnergyFrom(hand,bench)
            }
          }
          move "Magical Shot", {
            text "30 damage. "
            energyCost Y, C
            onAttack {
              damage 30
            }
          }

        };
      case TOGEKISS_138:
        return evolution (this, from:"Togetic", hp:HP140, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          bwAbility "Fairy Feast", {
            text "Once during your turn (before your attack), you may heal 30 damage from each of your [Y] Pokémon."
            actionA {
              checkLastTurn()
              powerUsed()
              my.all.each {if(it.types.contains(Y)) heal(30,it,SRC_ABILITY)}
            }
          }
          move "Magical Shot", {
            text "70 damage. "
            energyCost Y, C
            onAttack {
              damage 70
            }
          }

        };
      case COTTONEE_139:
        return basic (this, hp:HP050, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Expand", {
            text "10 damage. During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
            energyCost Y
            onAttack {
              damage 10
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }

        };
      case WHIMSICOTT_GX_140:
        return evolution (this, from:"Cottonee", hp:HP190, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          bwAbility "Fluffy Cotton", {
            text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
            delayedA (priority: BEFORE_LAST) {
              before APPLY_ATTACK_DAMAGES, {
                def entry=bg.dm().find({it.to==self && it.dmg.value && it.notNoEffect})
                if(entry){
                  flip "Fluffy Cotton", {
                    entry.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Energy Blow", {
            text "10+ damage. This attack does 30 more damage times the amount of Energy attached to this Pokémon."
            energyCost Y
            onAttack {
              damage 10+30*self.cards.energyCount(C)
            }
          }
          move "Toy Box GX", {
            text "Search your deck for up to 5 cards and put them into your hand. Then, shuffle your deck. (You can’t use more than 1 GX attack in a game.)"
            energyCost Y
            attackRequirement {
              gxCheck()
              assert deck
            }
            onAttack {
              gxPerform()
              deck.search(max:5,"Put to hand",{true}).moveTo(hidden:true,hand)
              shuffleDeck()
            }
          }

        };
      case SPRITZEE_141:
        return basic (this, hp:HP060, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Nap", {
            text "Heal 20 damage from this Pokémon."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters
            }
            onAttack {
              heal 20,self
            }
          }
          move "Fairy Wind", {
            text "10 damage. "
            energyCost Y
            onAttack {
              damage 10
            }
          }

        };
      case AROMATISSE_142:
        return evolution (this, from:"Spritzee", hp:HP090, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Pungent Aroma", {
            text "Flip 2 coins. If either of them is heads, your opponent reveals their hand. For each heads, choose a card you find there. Your opponent shuffles those cards into their deck."
            energyCost Y
            attackRequirement {
              assert opp.deck
            }
            onAttack {
              flip 2,{
                if(opp.hand) {
                  opp.hand.select("Opponent's hand. Shuffle a card into their deck.").moveTo(opp.deck)
                  shuffleDeck(null, TargetPlayer.OPPONENT)
                }
              }
            }
          }
          move "Miraculous Cologne", {
            text "30 damage. Flip a coin. If heads, choose a Special Condition. Your opponent's Active Pokémon is now affected by that Special Condition."
            energyCost C, C
            onAttack {
              damage 30
              flip {
                def list=[ASLEEP,CONFUSED,PARALYZED,POISONED,BURNED]
                SpecialConditionType spc=choose(list, list.collect({it.toString()})) as SpecialConditionType
                afterDamage {apply spc, defending}
              }
            }
          }

        };
      case RATTATA_143:
        return basic (this, hp:HP030, type:C, retreatCost:1) {
          weakness F
          move "Gnaw", {
            text "30 damage. "
            energyCost C
            onAttack {
              damage 30
            }
          }

        };
      case RATICATE_144:
        return evolution (this, from:"Rattata", hp:HP070, type:C, retreatCost:1) {
          weakness F
          move "Escaping Incisors", {
            text "70 damage. If your opponent's Active Pokémon is an Evolution Pokémon, switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 70
              if(defending.realEvolution){
                switchYourActive()
              }
            }
          }

        };
      case SPEAROW_145:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Glide", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Speed Dive", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case FEAROW_146:
        return evolution (this, from:"Spearow", hp:HP100, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Drill Run Double", {
            text "70 damage. Flip a coin. If heads, discard 2 Energy from your opponent's Active Pokémon."
            energyCost C, C
            onAttack {
              damage 70
              flip {afterDamage{discardDefendingEnergy();discardDefendingEnergy()}}
            }
          }

        };
      case MEOWTH_147:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Caturday", {
            text "Draw 2 cards. If you do, this Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert deck
            }
            onAttack {
              draw 2
              apply ASLEEP,self
            }
          }
          move "Tail Whap", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case PERSIAN_148:
        return evolution (this, from:"Meowth", hp:HP100, type:C, retreatCost:0) {
          weakness F
          bwAbility "Gathering of Cats", {
            text "Ignore all Energy in the attack costs of each of your Pokémon in play that has the Caturday attack."
            getterA GET_MOVE_LIST, {h->
              PokemonCardSet pcs = h.effect.target
              if(pcs.owner==self.owner && h.object.find{it.name=='Caturday'}){
                def list=[]
                for(move in h.object){
                  def copy=move.shallowCopy()
                  copy.energyCost.retainAll()
                  list.add(copy)
                }
                h.object=list
              }
            }
          }
          move "Claw Slash", {
            text "90 damage. "
            energyCost C, C, C
            onAttack {
              damage 90
            }
          }

        };
      case PERSIAN_GX_149:
        return evolution (this, from:"Meowth", hp:HP200, type:C, retreatCost:2) {
          weakness F
          bwAbility "Cat Walk", {
            text "Once during your turn (before your attack), if 1 of your Pokémon-GX or Pokémon-EX was Knocked Out during your opponent's last turn, you may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck. You can't use more than 1 Cat Walk Ability each turn."
            actionA {
              assert my.lastKnockoutByOpponentDamageTurn == bg.turnCount - 1: "No Pokémon has been Knocked Out during your opponent’s last turn"
              assert my.lastKnockoutCardTypes?.contains(POKEMON_GX)||my.lastKnockoutCardTypes?.contains(POKEMON_EX) : "The Pokémon Knocked Out was not GX or EX"
              assert my.deck : "Empty deck"
              checkLastTurn()
              assert bg.em().retrieveObject("Cat Walk") != bg.turnCount : "Already used one Cat Walk ability this turn"
              powerUsed()
              bg.em().storeObject("Cat Walk", bg.turnCount)
              deck.select(min:1,max:2,"Put to hand").moveTo(hidden:true,hand)
              shuffleDeck()
            }
          }
          move "Vengeance", {
            text "10+ damage. This attack does 20 more damage for each Pokémon in your discard pile. You can't add more than 180 damage in this way."
            energyCost C, C, C
            onAttack {
              damage 10
              int dmg=my.discard.filterByType(POKEMON).size()*20
              damage Math.min(180,dmg)
            }
          }
          move "Slash Back GX", {
            text "150 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost C, C, C
            attackRequirement {gxCheck()}
            onAttack {
              damage 150
              gxPerform()
              switchYourActive()
            }
          }

        };
      case DODUO_150:
        return basic (this, hp:HP070, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Peck", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Double Peck", {
            text "20x damage. Flip 2 coins. This attack does 20 damage for each heads."
            energyCost C, C
            onAttack {
              flip 2,{damage 20}
            }
          }

        };
      case DODRIO_151:
        return evolution (this, from:"Doduo", hp:HP100, type:C, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Tri Attack", {
            text "60x damage. Flip 3 coins. This attack does 60 damage for each heads."
            energyCost C, C
            onAttack {
              flip 3,{damage 60}
            }
          }
          move "Accelerating Stab", {
            text "90 damage. This Pokémon can’t use Accelerating Stab during your next turn."
            energyCost C, C
            onAttack {
              damage 90
              cantUseAttack(thisMove,self)
            }
          }

        };
      case LICKITUNG_152:
        return basic (this, hp:HP090, type:C, retreatCost:2) {
          weakness F
          move "Lick", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 30
              flipThenApplySC PARALYZED
            }
          }

        };
      case LICKILICKY_153:
        return evolution (this, from:"Lickitung", hp:HP130, type:C, retreatCost:4) {
          weakness F
          move "Eat Up", {
            text "40 damage. Before doing damage, discard all Pokémon Tool cards from your opponent's Active Pokémon. If you discarded a Pokémon Tool card in this way, heal all damage from this Pokémon."
            energyCost C, C
            onAttack {
              targeted(defending){
                def dd = defending.cards.filterByType(POKEMON_TOOL).discard()
                if(dd){
                  afterDamage{healAll(self)}
                }
              }
              damage 40
            }
          }
          move "Tonguenado", {
            text "60x damage. Flip 4 coins. This attack does 60 damage for each heads."
            energyCost C, C, C
            onAttack {
              flip 4,{damage 60}
            }
          }

        };
      case PORYGON_154:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness F
          move "Digicharge", {
            text "Flip 3 coins. For each heads, search your deck for an Energy card, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert deck
            }
            onAttack {
              flip 3,{my.deck.search ("Put Energy Card to hand",cardTypeFilter(ENERGY)).moveTo(hand)}
              shuffleDeck()
            }
          }
          move "Sharp Point", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case PORYGON_155:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Quick Draw", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Ram", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case PORYGON2_156:
        return evolution (this, from:"Porygon", hp:HP080, type:C, retreatCost:2) {
          weakness F
          move "Double Draw", {
            text "Draw 2 cards."
            energyCost C
            onAttack {
              draw 2
            }
          }
          move "Spinning Attack", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case PORYGON_Z_157:
        return evolution (this, from:"Porygon2", hp:HP130, type:C, retreatCost:2) {
          weakness F
          bwAbility "Crazy Code", {
            text "As often as you like during your turn (before your attack), you may attach a Special Energy card from your hand to 1 of your Pokémon."
            actionA {
              assert hand.filterByType(SPECIAL_ENERGY).notEmpty
              powerUsed()
              def list=hand.filterByType(SPECIAL_ENERGY).select()
              def pcs=my.all.select()
              attachEnergy(pcs, list.first(), PLAY_FROM_HAND)
            }
          }
          move "Tantrum", {
            text "120 damage. This Pokémon is now Confused."
            energyCost C, C, C
            onAttack {
              damage 120
              afterDamage {apply CONFUSED,self}
            }
          }

        };
      case SNORLAX_158:
        return basic (this, hp:HP150, type:C, retreatCost:4) {
          weakness F
          bwAbility "Lazy Eating", {
            text "Between turns, heal 10 damage from this Pokémon."
            delayedA (anytime:true) {
              def lastExecId = null
              before BEGIN_TURN, {
                if (lastExecId != e.executionId && self.numberOfDamageCounters) {
                  bc "Lazy Eating activates"
                  heal(10, self, SRC_ABILITY)
                  lastExecId = e.executionId
                }
              }
            }
          }
          move "Big Counter", {
            text "60+ damage. If your opponent's Active Pokémon is a TAG TEAM, this attack does 120 more damage."
            energyCost C, C, C
            onAttack {
              damage 60
              if(defending.topPokemonCard.cardTypes.is(TAG_TEAM)) damage 120
            }
          }

        };
      case GLAMEOW_159:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Caturday", {
            text "Draw a card. If you do, this Pokémon is now Asleep."
            energyCost C
            onAttack {
              draw 1
              apply ASLEEP,self
            }
          }
          move "Boing Boing Tail", {
            text "This attack does 60 damage to 1 of your opponent's Pokémon-GX or Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {
              assert opp.all.find{it.pokemonGX||it.pokemonEX}
            }
            onAttack {
              damage 60,opp.all.findAll{it.pokemonGX||it.pokemonEX}.select("Deal 60 damage")
            }
          }

        };
      case PURUGLY_160:
        return evolution (this, from:"Glameow", hp:HP120, type:C, retreatCost:3) {
          weakness F
          move "Stray Cat Dash", {
            text "30 damage. Discard a random card from your opponent's hand. If this Pokémon evolved from Glameow during this turn, discard 2 cards instead of 1."
            energyCost C, C
            onAttack {
              damage 30
              astonish(self.lastEvolved==bg.turnCount?2:1)
            }
          }
          move "Lunge Out", {
            text "80 damage. "
            energyCost C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case HAPPINY_161:
        return basic (this, hp:HP060, type:C, retreatCost:0) {
          bwAbility "Playhouse Heal", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, heal 60 damage from 1 of your Pokémon. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              assert my.all.find{it.numberOfDamageCounters} : "All is well"
              powerUsed()
              flip {
                heal 60, my.all.findAll{it.numberOfDamageCounters}.select("Heal"), SRC_ABILITY
              }
              bg.gm().betweenTurns()
            }
          }

        };
      case CHATOT_162:
        return basic (this, hp:HP070, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Mimic", {
            text "Shuffle your hand into your deck. Then, draw a card for each card in your opponent's hand."
            energyCost C
            onAttack {
              my.hand.moveTo(my.deck)
              shuffleDeck()
              draw opp.hand.size()
            }
          }
          move "Tone-Deaf", {
            text "10 damage. Your opponent's Active Pokémon is now Confused."
            energyCost C
            onAttack {
              damage 10
              applyAfterDamage CONFUSED
            }
          }

        };
      case CELESTEELA_GX_163:
        return basic (this, hp:HP200, type:C, retreatCost:4) {
          weakness L
          resistance F, MINUS20
          bwAbility "Force Canceler", {
            text "As long as this Pokémon is your Active Pokémon, prevent all effects of your opponent's GX attacks, including damage, done to your Pokémon."
            delayedA {
              def flag = 0
              before ATTACK_MAIN, {
                flag = ef.move.name.contains('GX')
              }
              before null, null, Source.ATTACK, {
                if (flag && self.active && self.owner.opposite.pbg.active.pokemonGX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && ef.target == self.owner){
                  bc "$name prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(flag && self.active && it.to.owner == self.owner && it.notNoEffect && it.from.pokemonGX){
                    it.dmg = hp(0)
                    bc "$name prevents damage"
                  }
                }
              }
            }
          }
          move "Power Cyclone", {
            text "110 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 110
              afterDamage{moveEnergy(self,my.bench)}
            }
          }
          move "Discovery GX", {
            text "Count your Prize cards and put them into your hand. Then, take that many cards from the top of your deck and put them face down as your Prize cards. If you don't have that many cards in your deck, this attack does nothing. (You can't use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
              assert deck.size()>=my.prizeCardSet.size() : "Deck doesn't contain enough cards"
            }
            onAttack {
              gxPerform()
              int cnt = my.prizeCardSet.size()
              my.prizeCardSet.moveTo(my.hand)
              deck.subList(0,cnt).moveTo(hidden:true,my.prizeCardSet)
            }
          }

        };
      case BEAST_BRINGER_164:
        return pokemonTool (this) {
          text "If you have exactly 6 Prize cards remaining, and if your opponent's Active Pokémon-GX or Pokémon-EX is Knocked Out by damage from an attack of the Ultra Beast this card is attached to, take 1 more Prize card."
          def eff
          onPlay {reason->
            eff = delayed (priority: LAST) {
              def power=false
              after APPLY_ATTACK_DAMAGES, {
                power= (ef.attacker==self && ef.attacker.topPokemonCard.cardTypes.is(ULTRA_BEAST) && self.owner.pbg.prizeCardSet.size()==6)
              }
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner==self.owner.opposite
                  && ef.pokemonToBeKnockedOut.active
                  && (ef.pokemonToBeKnockedOut.pokemonGX || ef.pokemonToBeKnockedOut.pokemonEX)
                  && ef.byDamageFromAttack
                  && power){
                  bc "Beast Bringer: take 1 more Prize card"
                  bg.em().run(new TakePrize(self.owner, ef.pokemonToBeKnockedOut))
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case CHIP_CHIP_ICE_AXE_165:
        return itemCard (this) {
          text "Look at the top 3 cards of your opponent's deck and choose 1 of them. Your opponent shuffles the other cards back into their deck. Then, put the card you chose on top of their deck."
          onPlay {
            def card = opp.deck.subList(0,3).select("Look at the top 3 cards of your opponent's deck and choose 1 of them. Your opponent shuffles the other cards back into their deck. Then, put the card you chose on top of their deck.").first()
            opp.deck.remove(card)
            shuffleDeck(null, TargetPlayer.OPPONENT)
            opp.deck.add(0, card)
          }
          playRequirement{
            assert opp.deck
          }
        };
        case DEVOLUTION_SPRAY_Z_166:
        return itemCard (this) {
          text "Devolve 1 of your evolved Pokémon by shuffling any number of Evolution cards on it into your deck. (That Pokémon can't evolve this turn.)"
          onPlay {
            def pcs = my.all.findAll{it.evolution}.select("Pokemon to devolve")
            def top = pcs.topPokemonCard
            moveCard(top, my.deck)
            bc "$top devolved"
            devolve(pcs, top)
            while(pcs.evolution && confirm("$top was devolved. Devolve the next evolution?")){
              top = pcs.topPokemonCard
              moveCard(top, my.deck)
              bc "$top devolved"
              devolve(pcs, top)
            }
            shuffleDeck()
          }
          playRequirement{
            assert my.all.findAll{it.evolution} : "You have no evolved pokemon in play"
          }
        };
      case DUSK_STONE_167:
        return itemCard (this) {
          text "Search your deck for a Mismagius, Honchkrow, Chandelure, or Aegislash, including Pokémon-GX, that evolves from 1 of your Pokémon in play, and put it onto that Pokémon to evolve it. Then, shuffle your deck. You can use this card during your first turn or on a Pokémon that was put into play this turn."
          onPlay {
            deck.search{['Mismagius','Mismagius-GX','Honchkrow','Honchkrow-GX','Chandelure','Chandelure-GX','Aegislash','Aegislash-GX'].contains(it.name) && it.cardTypes.is(EVOLUTION)}.each{card->
              def pcs = my.all.findAll{card.predecessor == it.name}.select("To Evolve")
              evolve(pcs, card, OTHER)
            }
            shuffleDeck()
          }
          playRequirement{
            assert deck
            assert my.all.find{it.name=='Misdreavus'||it.name=='Murkrow'||it.name=='Lampent'||it.name=='Doublade'}
          }
        };
      case DUST_ISLAND_168:
        return stadium (this) {
          text "Whenever either player switches their Poisoned Active Pokémon with 1 of their Benched Pokémon with the effect of a Trainer card, the new Active Pokémon is now affected by that Special Condition."
          def eff
          onPlay {
            eff = delayed {
              boolean flag = false
              int extraPoisonCount = 0
              before SWITCH, null, TRAINER_CARD, {
                flag = ef.fallenBack.isSPC(POISONED)
                if(flag) {
                  extraPoisonCount = bg.em().retrieveObject("extra_poison_counter_"+ef.fallenBack.hashCode()) ?: 0
                }
              }
              after SWITCH, null, TRAINER_CARD, {
                if(flag) {apply(POISONED, ef.switchedOut, TRAINER_CARD)}
                if(extraPoisonCount) extraPoison(extraPoisonCount)
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case ELECTROMAGNETIC_RADAR_169:
        return itemCard (this) {
          text "You can play this card only if you discard 2 other cards from your hand." +
            "Search your deck for up to 2 in any combination of [L] Pokémon-GX and [L] Pokémon-EX, reveal them, and put them into your hand. Then, shuffle your deck."
          onPlay {
            my.hand.getExcludedList(thisCard).select(count:2,"Discard").discard()
            deck.search(max:2,"Search your deck for up to 2 in any combination of [L] Pokémon-GX and [L] Pokémon-EX",{it.cardTypes.pokemon && it.cardTypes.isIn(POKEMON_EX,POKEMON_GX) && it.types.contains(L)}).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard).size() >= 2
            assert deck
          }
        };
      case ENERGY_SPINNER_170:
        return itemCard (this) {
          text "Search your deck for a basic Energy card, reveal it, and put it into your hand. If you go second and it's your first turn, search for up to 3 basic Energy cards instead of 1. Then, shuffle your deck."
          onPlay {
            deck.search(max:bg.turnCount==2?3:1,cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
          }
          playRequirement{
            assert deck
          }
        };
      case FAIRY_CHARM_ABILITY_171:
        return pokemonTool (this) {
          text "Prevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's Pokémon-GX and Pokémon-EX that have Abilities."
          def eff
          onPlay {reason->
            eff=delayed{
              before APPLY_ATTACK_DAMAGES,{
                bg.dm().each{
                  if(self.types.contains(Y)&&it.to==self&&it.from.owner!=self.owner&&(it.from.pokemonGX||it.from.pokemonEX)&&it.notZero&&it.notNoEffect&&it.from.hasModernAbility()){
                    it.dmg=hp(0)
                    bc "Fairy Charm Ability prevents damage"
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case FAIRY_CHARM_LIGHTNING_172:
        return pokemonTool (this) {
          text "Prevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [L] Pokémon-GX and [L] Pokémon-EX."
          def eff
          onPlay {reason->
            eff=delayed{
              before APPLY_ATTACK_DAMAGES,{
                bg.dm().each{
                  if(self.types.contains(Y)&&it.to==self&&it.from.owner!=self.owner&&(it.from.pokemonGX||it.from.pokemonEX)&&it.notZero&&it.notNoEffect&&it.from.types.contains(L)){
                    it.dmg=hp(0)
                    bc "Fairy Charm Lightning prevents damage"
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case FIRE_CRYSTAL_173:
        return itemCard (this) {
          text "Put 3 [R] Energy cards from your discard pile into your hand."
          onPlay {
            my.discard.filterByEnergyType(R).select(count:3).moveTo(hand)
          }
          playRequirement{
            assert my.discard.filterByEnergyType(R)
          }
        };
      case GIOVANNI_S_EXILE_174:
        return supporter (this) {
          text "Discard up to 2 of your Benched Pokémon that have no damage counters on them and all cards attached to them."
          def list = {my.bench.findAll {it.numberOfDamageCounters==0}}
          onPlay {
            def cl1 = {PokemonCardSet pcs->
              if(pcs) {
                pcs.abilities.each {
                  if(it.key.active && it.key.name == "Underground Work") {
                    bc "Underground Work activates"
                    if(opp.deck) opp.deck.subList(0,1).discard()
                  }
                }
                pcs.cards.discard()
                removePCS(pcs)
              }
            }
            cl1(list().select("Discard"))
            if(list()){
              cl1(list().select("Discard (or cancel)",false))
            }
            bg.em().storeObject("GIOVANNI_S_EXILE_174", bg.turnCount)
          }
          playRequirement{
            assert list() : "You got no benched pokemon with no damage counters"
          }
        };
      case GREEN_S_EXPLORATION_175:
        return supporter (this) {
          text "You can play this card only if you have no Pokémon with Abilities in play." +
            "Search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck."
          onPlay {
            deck.search(max:2,cardTypeFilter(TRAINER)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert !my.all.find{it.hasModernAbility()}
          }
        };
      case JANINE_176:
        return supporter (this) {
          text "Look at the top 4 cards of your deck and put 2 of them into your hand. Shuffle the other cards back into your deck."
          onPlay {
            deck.subList(0,4).select(count:2).moveTo(my.hand)
            shuffleDeck()
            bg.em().storeObject("JANINE_TURN", bg.turnCount)
          }
          playRequirement{
            assert my.deck
          }
        };
      case KOGA_S_TRAP_177:
        return supporter (this) {
          text "Your opponent's Active Pokémon is now Confused and Poisoned."
          onPlay {
            apply CONFUSED, opp.active, TRAINER_CARD
            apply POISONED, opp.active, TRAINER_CARD
            bg.em().storeObject("KOGA_S_TRAP_TURN", bg.turnCount)
          }
          playRequirement{
          }
        };
      case LT_SURGE_S_STRATEGY_178:
        return supporter (this) {
          text "You can play this card only if you have more Prize cards remaining than your opponent." +
            "During this turn, you can play 3 Supporter cards (including this card)."
          onPlay {
            delayed {
              def eff
              register {
                eff = getter (GET_MAX_SUPPORTER_PER_TURN) {h->
                  if(h.effect.playerType == thisCard.player && h.object < 3) h.object = 3
                }
              }
              unregister {
                eff.unregister()
              }
              unregisterAfter 1
            }
          }
          playRequirement{
            assert my.prizeCardSet.size()>opp.prizeCardSet.size()
          }
        };
      case MARTIAL_ARTS_DOJO_179:
        return stadium (this) {
          text "The attacks of non-Ultra Beast Pokémon that have any basic [F] Energy attached to them (both yours and your opponent's) do 10 more damage to the opponent's Active Pokémon (before applying Weakness and Resistance). If the attacking player has more Prize cards remaining than their opponent, those attacks do 40 more damage instead."
          def eff
          onPlay {
            eff=delayed{
              after PROCESS_ATTACK_EFFECTS,{
                bg.dm().each{
                  if(it.from.topPokemonCard.cardTypes.isNot(ULTRA_BEAST)&&it.from.cards.filterByBasicEnergyType(F)&&it.from.owner!=it.to.owner&&it.to.active&&it.notZero){
                    int am=it.from.owner.pbg.prizeCardSet.size()>it.to.owner.pbg.prizeCardSet.size()?40:10
                    bc "Martial Arts Dojo +$am"
                    it.dmg+=hp(am)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case METAL_CORE_BARRIER_180:
        return pokemonTool (this) {
          text "If this card is attached to 1 of your Pokémon, discard it at the end of your opponent's turn." +
            "The [M] Pokémon this card is attached to takes 70 less damage from your opponent's attacks (after applying Weakness and Resistance)."
          def eff
          onPlay {reason->
            eff=delayed{
              before APPLY_ATTACK_DAMAGES,{
                if(self.types.contains(M)&&bg.currentTurn!=self.owner){
                  bg.dm().each{if(it.from.owner!=it.to.owner&&it.to==self&&it.notZero&&it.notNoEffect){
                    it.dmg-=hp(70)
                    bc "Metal Core Barrier -70"
                  }}
                }
              }
              unregister {discard thisCard}
              unregisterAfter 2
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case MOLAYNE_181:
        return supporter (this) {
          text "You can play this card only if you discard 2 [M] Energy cards from your hand." +
            "Shuffle a Trainer card from your discard pile into your deck."
          onPlay {
            my.hand.filterByEnergyType(M).select(count:2,"Discard").discard()
            my.discard.filterByType(TRAINER).select("Shuffle to deck").moveTo(deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.filterByEnergyType(M).size()>=2:"Not enough [M] energy in hand"
            assert my.discard.filterByType(TRAINER):"No Trainer in discard"
          }
        };
      case POKEGEAR_3_0_182:
        return itemCard (this) {
          text "Look at the top 7 cards of your deck. You may reveal a Supporter card you find there and put it into your hand. Shuffle the other cards back into your deck."
          onPlay {
            deck.subList(0,7).select(min:0,"Select a supporter to put to hand",cardTypeFilter(SUPPORTER)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert deck
          }
        };
      case POWER_PLANT_183:
        return stadium (this) {
          text "Pokémon-GX and Pokémon-EX in play (both yours and your opponent's) have no Abilities."
          def effect1
          def effect2
          onPlay {
            effect1 = getter(GET_ABILITIES, BEFORE_LAST) {h->
              if (h.effect.target.pokemonEX || h.effect.target.pokemonGX) {
                h.object.keySet().removeIf{it instanceof BwAbility}
              }
            }
//            effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
//              if ((h.effect.target.pokemonEX || h.effect.target.pokemonGX) && h.effect.ability instanceof BwAbility) {
//                h.object=true
//              }
//            }
            effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if ((h.effect.target as Card).cardTypes.isIn(POKEMON_GX, POKEMON_EX)) {
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
      case RED_S_CHALLENGE_184:
        return supporter (this) {
          text "You can play this card only if you discard 2 other cards from your hand." +
            "Search your deck for a card and put it into your hand. Then, shuffle your deck."
          onPlay {
            my.hand.getExcludedList(thisCard).select(count:2, "Discard").discard()
            my.deck.select("Put to hand").moveTo(hidden:true,hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard).size() >= 2 : "Not enough cards in hand"
            assert deck : "Empty deck"
          }
        };
      case SAMSON_OAK_185:
        return supporter (this) {
          text "Draw 2 cards. If both Active Pokémon are the same type, draw 2 more cards."
          onPlay {
            draw 2
            if(my.active.types.containsAny(opp.active.types)) draw 2
          }
          playRequirement{
            assert deck
          }
        };
      case STEALTHY_HOOD_186:
        return pokemonTool (this) {
          text "Prevent all effects of your opponent's Abilities done to the Pokémon this card is attached to. Remove any such existing effects."
          def eff
          onPlay {reason->
            // TODO implement properly after source refactoring and/or RichSource captivation
            eff = delayed {
              before null, self, SRC_ABILITY {
                if (ef.target == self) {
                  bc "Stealty Hood prevents effect"
                  new CheckAbilities().run(bg)
                  prevent()
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
            new CheckAbilities().run(bg)
          }
        };
      case SURPRISE_BOX_187:
        return itemCard (this) {
          text "Put a card from your opponent’s discard pile into their hand."
          onPlay {
            opp.discard.select("Put card into opponent's hand").moveTo(opp.hand)
          }
          playRequirement{
            assert opp.discard : "No cards in opponent discard"
          }
        };
      case ULTRA_FOREST_KARTENVOY_188:
        return supporter (this) {
          text "During this turn, damage from your Ultra Beasts' attacks isn't affected by any effects on your opponent's Active Pokémon."
          onPlay {
            delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{if(it.from==ef.attacker && ef.attacker.topPokemonCard.cardTypes.is(ULTRA_BEAST)){
                  it.flags.add(DamageManager.DamageFlag.NO_DEFENDING_EFFECT)
                  bc "Ultra Forest Kartenvoy kicks in"
                }}
              }
              unregister {
                bc "Ultra Forest Kartenvoy fades out"
              }
              unregisterAfter 1
            }
          }
          playRequirement{
          }
        };
      case WELDER_189:
        return supporter (this) {
          text "Attach up to 2 [R] Energy cards from your hand to 1 of your Pokémon. If you do, draw 3 cards."
          onPlay {
            attachEnergyFrom(max:2,type:R,my.hand,my.all)
            draw 3
          }
          playRequirement{
            assert my.hand.filterByEnergyType(R)
          }
        };
      case TRIPLE_ACCELERATION_ENERGY_190:
        return specialEnergy (this, [[C]]) {
          text "This card can only be attached to Evolution Pokémon. If this card is attached to 1 of your Pokémon, discard it at the end of the turn." +
            "This card provides [C][C][C] Energy only while it is attached to an Evolution Pokémon." +
            "If this card is attached to anything other than an Evolution Pokémon, discard this card."
          def eff
          onPlay {reason->
            eff = delayed (priority: BEFORE_LAST) {
              before BETWEEN_TURNS, {discard thisCard}
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
            if(!to.realEvolution) discard thisCard
          }
          allowAttach {to->
            to.realEvolution
          }
          getEnergyTypesOverride {
            if(self == null){
              return [[C] as Set]
            } else if (!self.realEvolution) {
              discard thisCard
            } else {
              return [[C] as Set,[C] as Set,[C] as Set]
            }
          }
        };
      case PHEROMOSA_BUZZWOLE_GX_191:
        return copy (PHEROMOSA_BUZZWOLE_GX_1, this);
      case PHEROMOSA_BUZZWOLE_GX_192:
        return copy (PHEROMOSA_BUZZWOLE_GX_1, this);
      case VENOMOTH_GX_193:
        return copy (VENOMOTH_GX_12, this);
      case RESHIRAM_CHARIZARD_GX_194:
        return copy (RESHIRAM_CHARIZARD_GX_20, this);
      case DEDENNE_GX_195:
        return copy (DEDENNE_GX_57, this);
      case MUK_ALOLAN_MUK_GX_196:
        return copy (MUK_ALOLAN_MUK_GX_61, this);
      case MUK_ALOLAN_MUK_GX_197:
        return copy (MUK_ALOLAN_MUK_GX_61, this);
      case MARSHADOW_MACHAMP_GX_198:
        return copy (MARSHADOW_MACHAMP_GX_82, this);
      case MARSHADOW_MACHAMP_GX_199:
        return copy (MARSHADOW_MACHAMP_GX_82, this);
      case GRENINJA_ZOROARK_GX_200:
        return copy (GRENINJA_ZOROARK_GX_107, this);
      case GRENINJA_ZOROARK_GX_201:
        return copy (GRENINJA_ZOROARK_GX_107, this);
      case HONCHKROW_GX_202:
        return copy (HONCHKROW_GX_109, this);
      case LUCARIO_MELMETAL_GX_203:
        return copy (LUCARIO_MELMETAL_GX_120, this);
      case GARDEVOIR_SYLVEON_GX_204:
        return copy (GARDEVOIR_SYLVEON_GX_130, this);
      case GARDEVOIR_SYLVEON_GX_205:
        return copy (GARDEVOIR_SYLVEON_GX_130, this);
      case WHIMSICOTT_GX_206:
        return copy (WHIMSICOTT_GX_140, this);
      case PERSIAN_GX_207:
        return copy (PERSIAN_GX_149, this);
      case CELESTEELA_GX_208:
        return copy (CELESTEELA_GX_163, this);
      case GREEN_S_EXPLORATION_209:
        return copy (GREEN_S_EXPLORATION_175, this);
      case JANINE_210:
        return copy (JANINE_176, this);
      case KOGA_S_TRAP_211:
        return copy (KOGA_S_TRAP_177, this);
      case MOLAYNE_212:
        return copy (MOLAYNE_181, this);
      case RED_S_CHALLENGE_213:
        return copy (RED_S_CHALLENGE_184, this);
      case WELDER_214:
        return copy (WELDER_189, this);
      case PHEROMOSA_BUZZWOLE_GX_215:
        return copy (PHEROMOSA_BUZZWOLE_GX_1, this);
      case VENOMOTH_GX_216:
        return copy (VENOMOTH_GX_12, this);
      case RESHIRAM_CHARIZARD_GX_217:
        return copy (RESHIRAM_CHARIZARD_GX_20, this);
      case BLASTOISE_GX_218:
        return copy (BLASTOISE_GX_35, this);
      case DEDENNE_GX_219:
        return copy (DEDENNE_GX_57, this);
      case MUK_ALOLAN_MUK_GX_220:
        return copy (MUK_ALOLAN_MUK_GX_61, this);
      case MARSHADOW_MACHAMP_GX_221:
        return copy (MARSHADOW_MACHAMP_GX_82, this);
      case GRENINJA_ZOROARK_GX_222:
        return copy (GRENINJA_ZOROARK_GX_107, this);
      case HONCHKROW_GX_223:
        return copy (HONCHKROW_GX_109, this);
      case LUCARIO_MELMETAL_GX_224:
        return copy (LUCARIO_MELMETAL_GX_120, this);
      case GARDEVOIR_SYLVEON_GX_225:
        return copy (GARDEVOIR_SYLVEON_GX_130, this);
      case WHIMSICOTT_GX_226:
        return copy (WHIMSICOTT_GX_140, this);
      case PERSIAN_GX_227:
        return copy (PERSIAN_GX_149, this);
      case CELESTEELA_GX_228:
        return copy (CELESTEELA_GX_163, this);
      case BEAST_BRINGER_229:
        return copy (BEAST_BRINGER_164, this);
      case ELECTROMAGNETIC_RADAR_230:
        return copy (ELECTROMAGNETIC_RADAR_169, this);
      case FIRE_CRYSTAL_231:
        return copy (FIRE_CRYSTAL_173, this);
      case METAL_CORE_BARRIER_232:
        return copy (METAL_CORE_BARRIER_180, this);
      case POKEGEAR_3_0_233:
        return copy (POKEGEAR_3_0_182, this);
      case TRIPLE_ACCELERATION_ENERGY_234:
        return copy (TRIPLE_ACCELERATION_ENERGY_190, this);
      default:
        return null;
    }
  }

}
