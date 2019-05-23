package tcgwars.logic.impl.gen7;

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.impl.gen5.BlackWhite

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

public enum UnbrokenBonds implements CardInfo {

PHEROMOSA_BUZZWOLE_GX_1("Pheromosa & Buzzwole-GX", 1, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
CATERPIE_2("Caterpie", 2, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
METAPOD_3("Metapod", 3, Rarity.COMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
BUTTERFREE_4("Butterfree", 4, Rarity.RARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
ODDISH_5("Oddish", 5, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
ODDISH_6("Oddish", 6, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
GLOOM_7("Gloom", 7, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
VILEPLUME_8("Vileplume", 8, Rarity.HOLORARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
VENONAT_9("Venonat", 9, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
VENONAT_10("Venonat", 10, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
VENOMOTH_11("Venomoth", 11, Rarity.RARE, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
VENOMOTH_GX_12("Venomoth-GX", 12, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE1,EVOLUTION]),
BELLSPROUT_13("Bellsprout", 13, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
WEEPINBELL_14("Weepinbell", 14, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
VICTREEBEL_15("Victreebel", 15, Rarity.RARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
TANGELA_16("Tangela", 16, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
TANGROWTH_17("Tangrowth", 17, Rarity.RARE, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
GRUBBIN_18("Grubbin", 18, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
KARTANA_19("Kartana", 19, Rarity.HOLORARE, [POKEMON,_GRASS_,BASIC]),
RESHIRAM_CHARIZARD_GX_20("Reshiram & Charizard-GX", 20, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
GROWLITHE_21("Growlithe", 21, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
ARCANINE_22("Arcanine", 22, Rarity.HOLORARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
DARUMAKA_23("Darumaka", 23, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
DARMANITAN_24("Darmanitan", 24, Rarity.RARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
VOLCANION_25("Volcanion", 25, Rarity.HOLORARE, [POKEMON,_FIRE_,BASIC]),
LITTEN_26("Litten", 26, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
LITTEN_27("Litten", 27, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
TORRACAT_28("Torracat", 28, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
INCINEROAR_29("Incineroar", 29, Rarity.RARE, [POKEMON,_FIRE_,STAGE2,EVOLUTION]),
SALANDIT_30("Salandit", 30, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
SALAZZLE_31("Salazzle", 31, Rarity.RARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
BLACEPHALON_32("Blacephalon", 32, Rarity.RARE, [POKEMON,_FIRE_,BASIC]),
SQUIRTLE_33("Squirtle", 33, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
WARTORTLE_34("Wartortle", 34, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
BLASTOISE_GX_35("Blastoise-GX", 35, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_WATER_,STAGE2,EVOLUTION]),
POLIWAG_36("Poliwag", 36, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
POLIWAG_37("Poliwag", 37, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
POLIWHIRL_38("Poliwhirl", 38, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
POLIWRATH_39("Poliwrath", 39, Rarity.RARE, [POKEMON,_WATER_,STAGE2,EVOLUTION]),
TENTACOOL_40("Tentacool", 40, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
TENTACRUEL_41("Tentacruel", 41, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
SLOWPOKE_42("Slowpoke", 42, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
SLOWBRO_43("Slowbro", 43, Rarity.HOLORARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
SEEL_44("Seel", 44, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
DEWGONG_45("Dewgong", 45, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
KRABBY_46("Krabby", 46, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
KINGLER_47("Kingler", 47, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
GOLDEEN_48("Goldeen", 48, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
SEAKING_49("Seaking", 49, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
KYUREM_50("Kyurem", 50, Rarity.HOLORARE, [POKEMON,_WATER_,BASIC]),
FROAKIE_51("Froakie", 51, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
FROGADIER_52("Frogadier", 52, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
PYUKUMUKU_53("Pyukumuku", 53, Rarity.UNCOMMON, [POKEMON,_WATER_,BASIC]),
PIKACHU_54("Pikachu", 54, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
RAICHU_55("Raichu", 55, Rarity.RARE, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
STUNFISK_56("Stunfisk", 56, Rarity.RARE, [POKEMON,_LIGHTNING_,BASIC]),
DEDENNE_GX_57("Dedenne-GX", 57, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
CHARJABUG_58("Charjabug", 58, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
VIKAVOLT_59("Vikavolt", 59, Rarity.HOLORARE, [POKEMON,_LIGHTNING_,STAGE2,EVOLUTION]),
ZERAORA_60("Zeraora", 60, Rarity.RARE, [POKEMON,_LIGHTNING_,BASIC]),
MUK_ALOLAN_MUK_GX_61("Muk & Alolan Muk-GX", 61, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
EKANS_62("Ekans", 62, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
ARBOK_63("Arbok", 63, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
ZUBAT_64("Zubat", 64, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
GOLBAT_65("Golbat", 65, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
CROBAT_66("Crobat", 66, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
GASTLY_67("Gastly", 67, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
GASTLY_68("Gastly", 68, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
HAUNTER_69("Haunter", 69, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
GENGAR_70("Gengar", 70, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
DROWZEE_71("Drowzee", 71, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
HYPNO_72("Hypno", 72, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
KOFFING_73("Koffing", 73, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
WEEZING_74("Weezing", 74, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
MEWTWO_75("Mewtwo", 75, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
MEW_76("Mew", 76, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
MISDREAVUS_77("Misdreavus", 77, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
MISMAGIUS_78("Mismagius", 78, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
ESPURR_79("Espurr", 79, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
MEOWSTIC_80("Meowstic", 80, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
MARSHADOW_81("Marshadow", 81, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
MARSHADOW_MACHAMP_GX_82("Marshadow & Machamp-GX", 82, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC]),
SANDSHREW_83("Sandshrew", 83, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
SANDSLASH_84("Sandslash", 84, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
DIGLETT_85("Diglett", 85, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
DUGTRIO_86("Dugtrio", 86, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
GEODUDE_87("Geodude", 87, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
GRAVELER_88("Graveler", 88, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
GOLEM_89("Golem", 89, Rarity.HOLORARE, [POKEMON,_FIGHTING_,STAGE2,EVOLUTION]),
CUBONE_90("Cubone", 90, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
MAROWAK_91("Marowak", 91, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
RHYHORN_92("Rhyhorn", 92, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
RHYHORN_93("Rhyhorn", 93, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
RHYDON_94("Rhydon", 94, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
RHYPERIOR_95("Rhyperior", 95, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE2,EVOLUTION]),
WOOPER_96("Wooper", 96, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
QUAGSIRE_97("Quagsire", 97, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
GLIGAR_98("Gligar", 98, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
GLISCOR_99("Gliscor", 99, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
TYROGUE_100("Tyrogue", 100, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,BASIC]),
HITMONTOP_101("Hitmontop", 101, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,BASIC]),
RIOLU_102("Riolu", 102, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
LANDORUS_103("Landorus", 103, Rarity.HOLORARE, [POKEMON,_FIGHTING_,BASIC]),
CRABRAWLER_104("Crabrawler", 104, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
CRABOMINABLE_105("Crabominable", 105, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
STAKATAKA_106("Stakataka", 106, Rarity.HOLORARE, [POKEMON,_FIGHTING_,BASIC]),
GRENINJA_ZOROARK_GX_107("Greninja & Zoroark-GX", 107, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_DARKNESS_,BASIC]),
MURKROW_108("Murkrow", 108, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
HONCHKROW_GX_109("Honchkrow-GX", 109, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
CARVANHA_110("Carvanha", 110, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
SHARPEDO_111("Sharpedo", 111, Rarity.RARE, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
SPIRITOMB_112("Spiritomb", 112, Rarity.HOLORARE, [POKEMON,_DARKNESS_,BASIC]),
SANDILE_113("Sandile", 113, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
SANDILE_114("Sandile", 114, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
KROKOROK_115("Krokorok", 115, Rarity.COMMON, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
KROOKODILE_116("Krookodile", 116, Rarity.RARE, [POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
GRENINJA_117("Greninja", 117, Rarity.HOLORARE, [POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
INKAY_118("Inkay", 118, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
MALAMAR_119("Malamar", 119, Rarity.HOLORARE, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
LUCARIO_MELMETAL_GX_120("Lucario & Melmetal-GX", 120, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
ALOLAN_DIGLETT_121("Alolan Diglett", 121, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
ALOLAN_DUGTRIO_122("Alolan Dugtrio", 122, Rarity.RARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
ARON_123("Aron", 123, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
LAIRON_124("Lairon", 124, Rarity.UNCOMMON, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
AGGRON_125("Aggron", 125, Rarity.RARE, [POKEMON,_METAL_,STAGE2,EVOLUTION]),
LUCARIO_126("Lucario", 126, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
GENESECT_127("Genesect", 127, Rarity.RARE, [POKEMON,_METAL_,BASIC]),
MELTAN_128("Meltan", 128, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
MELMETAL_129("Melmetal", 129, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
GARDEVOIR_SYLVEON_GX_130("Gardevoir & Sylveon-GX", 130, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
CLEFFA_131("Cleffa", 131, Rarity.UNCOMMON, [POKEMON,_FAIRY_,BASIC]),
CLEFAIRY_132("Clefairy", 132, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
CLEFABLE_133("Clefable", 133, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
JIGGLYPUFF_134("Jigglypuff", 134, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
WIGGLYTUFF_135("Wigglytuff", 135, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
TOGEPI_136("Togepi", 136, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
TOGETIC_137("Togetic", 137, Rarity.UNCOMMON, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
TOGEKISS_138("Togekiss", 138, Rarity.HOLORARE, [POKEMON,_FAIRY_,STAGE2,EVOLUTION]),
COTTONEE_139("Cottonee", 139, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
WHIMSICOTT_GX_140("Whimsicott-GX", 140, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
SPRITZEE_141("Spritzee", 141, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
AROMATISSE_142("Aromatisse", 142, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
RATTATA_143("Rattata", 143, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
RATICATE_144("Raticate", 144, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
SPEAROW_145("Spearow", 145, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
FEAROW_146("Fearow", 146, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
MEOWTH_147("Meowth", 147, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
PERSIAN_148("Persian", 148, Rarity.RARE, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
PERSIAN_GX_149("Persian-GX", 149, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
DODUO_150("Doduo", 150, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
DODRIO_151("Dodrio", 151, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
LICKITUNG_152("Lickitung", 152, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
LICKILICKY_153("Lickilicky", 153, Rarity.RARE, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
PORYGON_154("Porygon", 154, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
PORYGON_155("Porygon", 155, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
PORYGON2_156("Porygon2", 156, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
PORYGON_Z_157("Porygon-Z", 157, Rarity.HOLORARE, [POKEMON,_COLORLESS_,STAGE2,EVOLUTION]),
SNORLAX_158("Snorlax", 158, Rarity.HOLORARE, [POKEMON,_COLORLESS_,BASIC]),
GLAMEOW_159("Glameow", 159, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
PURUGLY_160("Purugly", 160, Rarity.RARE, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
HAPPINY_161("Happiny", 161, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
CHATOT_162("Chatot", 162, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
CELESTEELA_GX_163("Celesteela-GX", 163, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
BEAST_BRINGER_164("Beast Bringer", 164, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
CHIP_CHIP_ICE_AXE_165("Chip-Chip Ice Axe", 165, Rarity.UNCOMMON, [TRAINER,ITEM]),
DEVOLUTION_SPRAY_Z_166("Devolution Spray Z", 166, Rarity.UNCOMMON, [TRAINER,ITEM]),
DUSK_STONE_167("Dusk Stone", 167, Rarity.UNCOMMON, [TRAINER,ITEM]),
DUST_ISLAND_168("Dust Island", 168, Rarity.UNCOMMON, [TRAINER,STADIUM]),
ELECTROMAGNETIC_RADAR_169("Electromagnetic Radar", 169, Rarity.UNCOMMON, [TRAINER,ITEM]),
ENERGY_SPINNER_170("Energy Spinner", 170, Rarity.UNCOMMON, [TRAINER,ITEM]),
FAIRY_CHARM_ABILITY_171("Fairy Charm Ability", 171, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
FAIRY_CHARM__172("Fairy Charm ", 172, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
FIRE_CRYSTAL_173("Fire Crystal", 173, Rarity.UNCOMMON, [TRAINER,ITEM]),
GIOVANNIS_EXILE_174("Giovanni's Exile", 174, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
GREENS_EXPLORATION_175("Green's Exploration", 175, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
JANINE_176("Janine", 176, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
KOGAS_TRAP_177("Koga's Trap", 177, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
LT_SURGES_STRATEGY_178("Lt. Surge's Strategy", 178, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
MARTIAL_ARTS_DOJO_179("Martial Arts Dojo", 179, Rarity.UNCOMMON, [TRAINER,STADIUM]),
METAL_CORE_BARRIER_180("Metal Core Barrier", 180, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
MOLAYNE_181("Molayne", 181, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
POKEGEAR_3_0_182("Pokégear 3.0 damage", 182, Rarity.UNCOMMON, [TRAINER,ITEM]),
POWER_PLANT_183("Power Plant", 183, Rarity.UNCOMMON, [TRAINER,STADIUM]),
REDS_CHALLENGE_184("Red's Challenge", 184, Rarity.HOLORARE, [TRAINER,SUPPORTER]),
SAMSON_OAK_185("Samson Oak", 185, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
STEALTHY_HOOD_186("Stealthy Hood", 186, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
SURPRISE_BOX_187("Surprise Box", 187, Rarity.UNCOMMON, [TRAINER,ITEM]),
ULTRA_FOREST_KARTENVOY_188("Ultra Forest Kartenvoy", 188, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
WELDER_189("Welder", 189, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
TRIPLE_ACCELERATION_ENERGY_190("Triple Acceleration Energy", 190, Rarity.UNCOMMON, [ENERGY,SPECIAL_ENERGY]),
PHEROMOSA_BUZZWOLE_GX_191("Pheromosa & Buzzwole-GX", 191, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
PHEROMOSA_BUZZWOLE_GX_192("Pheromosa & Buzzwole-GX", 192, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
VENOMOTH_GX_193("Venomoth-GX", 193, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_GRASS_,STAGE1,EVOLUTION]),
RESHIRAM_CHARIZARD_GX_194("Reshiram & Charizard-GX", 194, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
DEDENNE_GX_195("Dedenne-GX", 195, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
MUK_ALOLAN_MUK_GX_196("Muk & Alolan Muk-GX", 196, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
MUK_ALOLAN_MUK_GX_197("Muk & Alolan Muk-GX", 197, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
MARSHADOW_MACHAMP_GX_198("Marshadow & Machamp-GX", 198, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC]),
MARSHADOW_MACHAMP_GX_199("Marshadow & Machamp-GX", 199, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC]),
GRENINJA_ZOROARK_GX_200("Greninja & Zoroark-GX", 200, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_DARKNESS_,BASIC]),
GRENINJA_ZOROARK_GX_201("Greninja & Zoroark-GX", 201, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_DARKNESS_,BASIC]),
HONCHKROW_GX_202("Honchkrow-GX", 202, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
LUCARIO_MELMETAL_GX_203("Lucario & Melmetal-GX", 203, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
GARDEVOIR_SYLVEON_GX_204("Gardevoir & Sylveon-GX", 204, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
GARDEVOIR_SYLVEON_GX_205("Gardevoir & Sylveon-GX", 205, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
WHIMSICOTT_GX_206("Whimsicott-GX", 206, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
PERSIAN_GX_207("Persian-GX", 207, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
CELESTEELA_GX_208("Celesteela-GX", 208, Rarity.LOL : RU, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
GREENS_EXPLORATION_209("Green's Exploration", 209, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
JANINE_210("Janine", 210, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
KOGAS_TRAP_211("Koga's Trap", 211, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
MOLAYNE_212("Molayne", 212, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
REDS_CHALLENGE_213("Red's Challenge", 213, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
WELDER_214("Welder", 214, Rarity.LOL : RU, [TRAINER,SUPPORTER]),
PHEROMOSA_BUZZWOLE_GX_215("Pheromosa & Buzzwole-GX", 215, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
VENOMOTH_GX_216("Venomoth-GX", 216, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE1,EVOLUTION]),
RESHIRAM_CHARIZARD_GX_217("Reshiram & Charizard-GX", 217, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
BLASTOISE_GX_218("Blastoise-GX", 218, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_WATER_,STAGE2,EVOLUTION]),
DEDENNE_GX_219("Dedenne-GX", 219, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
MUK_ALOLAN_MUK_GX_220("Muk & Alolan Muk-GX", 220, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
MARSHADOW_MACHAMP_GX_221("Marshadow & Machamp-GX", 221, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC]),
GRENINJA_ZOROARK_GX_222("Greninja & Zoroark-GX", 222, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_DARKNESS_,BASIC]),
HONCHKROW_GX_223("Honchkrow-GX", 223, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
LUCARIO_MELMETAL_GX_224("Lucario & Melmetal-GX", 224, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
GARDEVOIR_SYLVEON_GX_225("Gardevoir & Sylveon-GX", 225, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
WHIMSICOTT_GX_226("Whimsicott-GX", 226, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
PERSIAN_GX_227("Persian-GX", 227, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
CELESTEELA_GX_228("Celesteela-GX", 228, Rarity.HOLORARE, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
BEAST_BRINGER_229("Beast Bringer", 229, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
ELECTROMAGNETIC_RADAR_230("Electromagnetic Radar", 230, Rarity.SECRET, [TRAINER,ITEM]),
FIRE_CRYSTAL_231("Fire Crystal", 231, Rarity.SECRET, [TRAINER,ITEM]),
METAL_CORE_BARRIER_232("Metal Core Barrier", 232, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
POKEGEAR_3_0_233("Pokégear 3.0 damage", 233, Rarity.SECRET, [TRAINER,ITEM]),

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
return basic (this, hp:HP260, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Jet Punch" , {
		text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost G
		onAttack{
			damage 30
			if(opp.bench) damage 30, opp.bench.select()
			}
	}
	move "Elegant Sole" , {
		text "190 damage. During your next turn, this Pokémon's Elegant Sole attack's base damage is 60.\n"
		energyCost G,G,C
		onAttack{
			damage 190
			reduceDamageNextTurn(hp(60),thisMove)
		}
	}
	move "Beast Game GX" , {
		text "50 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card. If this Pokémon has at least 7 extra Energy attached to it (in addition to this attack's cost), take 3 more Prize cards instead. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
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
							my.discard.moveTo(my.deck)
							shuffleDeck()
					}

				}
				unregisterAfter 1
			}
		}
	}
};

case CATERPIE_2:
return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
	weakness FIRE
	bwAbility "Pupate" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
		actionA{
			assert my.deck : "There is no more card in your deck"
			checkLastTurn()
			powerUsed()

			flip{
				def names=self.name
				def sel=deck.search ("Evolves from $names", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)})
				if(sel){
					evolve(self, sel.first(), OTHER)
				}
				shuffleDeck()
			}
		}
	}
	move "Hook" , {
		text "10 damage"
		energyCost C,C
		onAttack{
			damage 10
		}
	}
};
case METAPOD_3:
return 	evolution (this, from:"Caterpie", hp:HP070, type:GRASS, retreatCost:3) {
	weakness FIRE
	bwAbility "Emerge" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
		actionA{
			assert my.deck : "There is no more card in your deck"
			checkLastTurn()
			powerUsed()

			flip{
				def names=self.name
				def sel=deck.search ("Evolves from $names", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)})
				if(sel){
					evolve(self, sel.first(), OTHER)
				}
				shuffleDeck()
			}
		}
	}
	move "Bug Bite" , {
		text "30 damage"
		energyCost G,C,C
		onAttack{
			damage 30
		}
	}
};
case BUTTERFREE_4:
return 	evolution (this, from:"Metapod", hp:HP130, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Triple Charge" , {
		text "Search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.\n"
		energyCost C
		attackRequirement{
			assert my.deck : "there is no more card in your deck"
		}
		onAttack{
			my.deck.search (max: 3, cardTypeFilter(BASIC_ENERGY)).discard()
			shuffleDeck()
		}
	}
	move "Solar Beam" , {
		text "70 damage"
		energyCost G,C,C
		onAttack{
			damage 70
		}
	}
};
case ODDISH_5:
return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Stun Spore" , {
		text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
		energyCost C
		onAttack{
			damage 20
			flipThenApplySC PARALYZED
		}
	}
	move "Seed Bomb" , {
		text "20 damage"
		energyCost G,C
		onAttack{
			damage 20
		}
	}
};
case ODDISH_6:
return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Hook" , {
		text "10 damage"
		energyCost G
		onAttack{
			damage 10
		}
	}
};
case GLOOM_7:
return 	evolution (this, from:"Oddish", hp:HP080, type:GRASS, retreatCost:2) {
	weakness FIRE
	bwAbility "Irresistible Aroma" , {
		text "Once during your turn (before your attack), if your opponent's Bench isn't full, you may flip a coin. If heads, your opponent reveals their hand. Put a Basic Pokémon you find there onto their Bench."
		actionA{
			assert opp.bench.notFull : "There is no more space on your opponent bench"
			checkLastTurn()
			powerUsed()


			flip{
				opp.hand.showToMe("your opponent's hand")
				if(opp.hand.findAll{it.basic}){
					def pcs = opp.hand.findAll{it.basic}.select("select the pokémon to put on the bench")
					opp.hand.remove(pcs)
					benchPCS(pcs)
				}
			}
		}
	}
	move "Drool" , {
		text "30 damage"
		energyCost G,C
		onAttack{
			damage 30
		}
	}
};
case VILEPLUME_8:
return 	evolution (this, from:"Gloom", hp:HP140, type:GRASS, retreatCost:3) {
	weakness FIRE
	bwAbility "Varied Pollen" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, choose Asleep, Burned, Confused, or Poisoned. Your opponent's Active Pokémon is now affected by that Special Condition."
		actionA{
			checkLastTurn()
			powerUsed()

			SpecialConditionType spc = choose([ASLEEP,BURNED,CONFUSED,POISONED], ["Asleep", "Burned", "Confused",  "Poisoned"], "Which special condition you want to apply to yout opponet active pokemon")
			apply spc, opponent.active
		}
	}
	move "Giant Bloom" , {
		text "90 damage Heal 30 damage from this Pokémon."
		energyCost G,G,C
		onAttack{
			damage 90
			heal 30, self
		}
	}
};
case VENONAT_9:
return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Radar Eyes" , {
		text "Look at the top 7 cards of your deck and put 1 of them into your hand. Shuffle the other cards back into your deck.\n"
		energyCost G
		attackRequirement{
			assert my.deck : "There is no more card in your deck"
		}
		onAttack{
			deck.subList(0,7).select("Choose the card you want to put in your hand").moveTo(my.hand)
			shuffleDeck()
		}
	}
	move "Flop" , {
		text "20 damage"
		energyCost C,C
		onAttack{
			damage 20
		}
	}
};
case VENONAT_10:
return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Psybeam" , {
		text "10 Your opponent's Active Pokémon is now Confused."
		energyCost G
		onAttack{
			damage 10
			applyAfterDamage CONFUSED
		}
	}
};
case VENOMOTH_11:
return 	evolution (this, from:"Venonat", hp:HP090, type:GRASS, retreatCost:0) {
	weakness FIRE
	move "Assassin Flight" , {
		text "You can use this attack only if your opponent's Active Pokémon is affected by a Special Condition. This attack does 90 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost C
		attackRequirement{
			assert !opp.active.noSPC : "your opponent's Active Pokémon is affected by a Special Condition"
		}
	}
	move "Poison Powder" , {
		text "30 Your opponent's Active Pokémon is now Poisoned."
		energyCost G
		onAttack{
			damage 30
			applyAfterDamage POISONED
		}
	}
};
case VENOMOTH_GX_12:
return 	evolution (this, from:"Venonat", hp:HP200, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Shinobi Mastery" , {
		text "110+ If you played Koga's Trap from your hand during this turn, this attack does 90 more damage. If you played Janine from your hand during this turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon during your opponent's next turn.\n"
		energyCost G,C,C
		onAttack{
			damage 110
			if(bg.em().retrieveObject("Koga's Trap") == bg.turnCount){
				damage 90
			}
			if(bg.em().retrieveObject("Janine") == bg.turnCount){
				before APPLY_ATTACK_DAMAGES, {
					bg.dm().each {
						if(it.to == self && it.from.basic && it.dmg.value && it.notNoEffect) {
							bc "Shinobi Mastery prevents damage from basic pokemon"
							it.dmg = hp(0)
						}
					}
					unregisterAfter 2
				}
			}
		}
	}
	move "Ten-Card Return GX" , {
		text "60 damage. Shuffle your hand into your deck. Then, draw 10 cards. (You can't use more than 1 GX attack in a game."
		energyCost C
		attackRequirement{
			gxCheck()
		}
		onAttack{
			gxPerform()
			damage 60
			if(my.deck || my.hand){
				my.hand.moveTo(my.deck)
				shuffleDeck()
				draw 10
			}
		}
	}
};
case BELLSPROUT_13:
return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Razor Leaf" , {
		text "20 damage"
		energyCost G
		onAttack{
			damage 20
		}
	}
};
case WEEPINBELL_14:
return 	evolution (this, from:"Bellsprout", hp:HP080, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Burning Venom" , {
		text "Your opponent's Active Pokémon is now Burned and Poisoned.\n"
		energyCost G
		onAttack{
			apply BURNED
			apply POISONED
		}
	}
	move "Ram" , {
		text "30 damage"
		energyCost C,C
		onAttack{
			damage 30
		}
	}
};
case VICTREEBEL_15:
return 	evolution (this, from:"Weepinbell", hp:HP140, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Reactive Poison" , {
		text "10+ This attack does 60 more damage for each Special Condition affecting your opponent's Active Pokémon.\n"
		energyCost G
		onAttack{
			damage 10+60*defending.specialConditions.size()
		}
	}
	move "Gastro Acid" , {
		text "90 The Defending Pokémon has no Abilities until the end of your next turn."
		energyCost G,C,C
		onAttack{
			damage 90
			delayed{
				getter IS_ABILITY_BLOCKED, { Holder h->
					if (h.effect.target == opp.active && h.effect.ability instanceof BwAbility) {
						h.object=true
					}
				}
				effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
					if (h.effect.target == opp.active) {
						h.object=true
					}
				}
				unregisterAfter 2
			}
		}
	}
};
case TANGELA_16:
return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Tangle Drag" , {
		text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon.\n"
		energyCost G
		attackRequirement{
			assert opp.bench : "there is no pokemon on your opponent bench"
		}
		onAttack{
			sw defending, opp.bench.select("Choose your new opponent active")
		}
	}
	move "Gentle Slap" , {
		text "30 damage"
		energyCost C,C
		onAttack{
			damage 30
		}
	}
};
case TANGROWTH_17:
return 	evolution (this, from:"Tangela", hp:HP130, type:GRASS, retreatCost:3) {
	weakness FIRE
	move "Bind Down" , {
		text "30 The Defending Pokémon can't retreat during your opponent's next turn.\n"
		energyCost G
		onAttack{
			damage 30
			cantRetreat defending
		}
	}
	move "Chlorowhip" , {
		text "90 If this Pokémon has at least 2 [C] energy attached to it, heal 60 damage from this pokemon"
		energyCost C,C,C
		onAttack{
			damage 90
			afterDamage{
				if(self.cardTypes.energyCount(C) >= 2){
					heal 60, self
				}
			}
		}
	}
};

case GRUBBIN_18:
return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Electrical Signal" , {
		text "Search your deck for up to 2 [L] energy reveal them and put them into your hand. Then, shuffle your deck"
		energyCost C{
			attackRequirement{
				assert my.deck : "There is no more card in your deck"
			}
			onAttack{
				deck.search(max: 2, basicEnergyFilter(L)).moveTo(hand)
				shuffleDeck()
			}

		}
	}
	move "Corkscrew Punch" , {
		text "30 damage"
		energyCost C,C,C
		onAttack{
			damage 30
		}
	}
};
case KARTANA_19:
return basic (this, hp:HP070, type:GRASS, retreatCost:0) {
	weakness FIRE
	move "Big Cut" , {
		text "10+ If you have exactly 4 Prize cards remaining, this attack does 120 more damage.\n"
		energyCost G
		onAttack{
			damage 10
			if(my.prizeCardSet.size() == 4){
				damage 120
			}
		}
	}
	move "False Swipe" , {
		text "Flip a coin. If heads, put damage counters on your opponent's Active Pokémon until its remaining HP is 10."
		energyCost G,C,C
		onAttack{
			flip{
				directDamage opp.active.getRemainingHP() - 10, opp.active
			}
		}
	}
};
case RESHIRAM_CHARIZARD_GX_20:
return basic (this, hp:HP270, type:FIRE, retreatCost:3) {
	weakness WATER
	move "Outrage" , {
		text "30+ This attack does 10 more damage for each damage counter on this Pokémon.\n"
		energyCost R,C
		onAttack{
		    
		}
		damage 30
		damage self.numberOfDamageCounters
		
	}
	move "Flare Strike" , {
		text "230 This Pokémon can't use Flare Strike during your next turn.\n"
		energyCost R,R,R,C
		damage 230
		cantUseAttack(thisMove, self)
	}
	move "Double Blaze GX" , {
		text "200+ If this Pokémon has at least 3 extra [R] energy attached to it (in addition to this attack's cost), this does 100 more damage, and this attack's damage isnt affected by any effects on your opponents active Pokémon.\n"
		energyCost R,R,R,+
			attackRequirement{
			gxCheck()
			}
			onAttack{
			    gxPerform()
			    if(self.cards.energySufficient(thisMove.energyCost + R + R + R)){
			        directDamage 300
			    }
			    else{
			        damage 200
			    }
			}
	}
};
case GROWLITHE_21:
return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
	weakness WATER
	move "Live Coal" , {
		text "10\n"
		energyCost R
		onAttack{
		    damage 10
		}
	}
	move "Combustion" , {
		text "30 damage"
		energyCost R,R
		onAttack{
		    damage 30
		}
	}
};
case ARCANINE_22:
return 	evolution (this, from:"Growlithe", hp:HP140, type:FIRE, retreatCost:4) {
	weakness WATER
	move "Grand Flame" , {
		text "120 Attach 2 [R] energy from your discard pile to one of your Pokémon"
		energyCost R,R,R
		 onAttack{
                  damage 120
                  afterDamage{
                    def list = my.discard.search (max: 3, basicEnergyFilter(R))
          					def pcs = my.all.select("To?")
          					list.each {attachEnergy(pcs, it)}
                  }
                }

	}
	move "Heat Tackle" , {
		text "190 This Pokémon does 50 damage to itself."
		energyCost R,R,R,R
		onAttack{
		    damage 190
		    damage 50, self
		}
	}
};
case DARUMAKA_23:
return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
	weakness WATER
	move "Flame Charge" , {
		text "10 Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
		energyCost C
		onAttack{
		    damage 10
                  afterDamage{
                    attachEnergyFrom(type: FIRE, my.deck, self)
                    shuffleDeck()
                  }
		}
	}
	move "Flop" , {
		text "20 damage"
		energyCost C,C
		onAttack{
		    damage 20
		}
	}
};
case DARMANITAN_24:
return 	evolution (this, from:"Darumaka", hp:HP130, type:FIRE, retreatCost:3) {
	weakness WATER
	move "Find Wildfire" , {
		text "Search your deck for up to 3 [R] Energy cards, reveal them, and put them into your hand. Then shuffle your deck."
		energyCost C
		onAttack{
		    my.deck.search(max:3,"Select up to 3 [R] Energy cards",energyFilter(R)).showToOpponent("The selected [R] Energy cards").moveTo(my.hand)
					shuffleDeck()

		}
	}
	move "Flare Blitz" , {
		text "110 Discard all [R] Energy from this Pokémon"
		energyCost R,R
		onAttack{
		    damage 110
		    self.cards.filterByType(ENERGY).filterByEnergyType(R).discard()
		}
	}
};
case VOLCANION_25:
return basic (this, hp:HP120, type:FIRE, retreatCost:2) {
	weakness WATER
	move "Flare Starter" , {
		text "Search your deck for a [R] Energy card and attach it to 1 of your Pokémon. If you go second and it's your first turn, instead search for up to 3 [R] Energy cards and attach them to your Pokémon in any way you like. Then shuffle your deck."
		energyCost R
		onAttack{
		    afterDamage{
                    attachEnergyFrom(type: FIRE, my.deck, my.all)
                    if(bg.turnCount == 2){
                        attachEnergyFrom(type: FIRE, my.deck, my.all)
                        attachEnergyFrom(type: FIRE, my.deck, my.all)
                    }
                    shuffleDeck()
                  }
		    
		}
	}
	move "High-Heat Blast" , {
		text "50+ If you have at least 4 [R] Energy in play, this attack does 60 more damage."
		energyCost R,R
		onAttack{
		    damage 50
		     int c=0
            my.all.each {c+=it.cards.energyCount(R)}
		    if(c>=4){
		        damage 60
		    }
		}
	}
};
case LITTEN_26:
return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
	weakness WATER
	move "Singe" , {
		text "Your opponent's Active Pokémon is now Burned."
		energyCost R
		onAttack{
		    apply BURNED
		}
	}
};
case LITTEN_27:
return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
	weakness WATER
	move "Caturday" , {
		text "Draw a card. If you do, this Pokémon is now Asleep.\n"
		energyCost C
		onAttack{
		    draw 1
		    apply ASLEEP, self
		}
	}
	move "Big Bite" , {
		text "60 The Defending Pokémon can't retreat during your opponent's next turn."
		energyCost R,C,C
		onAttack{
		    damage 60
		    cantRetreat defending
		}
	}
};
case TORRACAT_28:
return 	evolution (this, from:"Litten", hp:HP080, type:FIRE, retreatCost:1) {
	weakness WATER
	move "Fire Fang" , {
		text "20 Your opponent's Active Pokémon is now Burned."
		energyCost R
		onAttack{
		    damage 20
		    apply BURNED
		}
	}
};
case INCINEROAR_29:
return 	evolution (this, from:"Torracat", hp:HP160, type:FIRE, retreatCost:2) {
	weakness WATER
	bwAbility "Strong Cheer" , {
		text "Your Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance). You can't apply more than 1 Strong Cheer Ability at a time."
	    delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner == self.owner){
                  bg.dm().each {
                    if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {//if not strong cheer has been used before
                      bc "Strong Cheer +30"
                      it.dmg += hp(30)
                      
                    }
                  }
                }
              }
						}
	}
	move "Flamethrower" , {
		text "90 Discard an Energy from this Pokémon."
		energyCost R,C
		onAttack{
		    damage 90
		    discardSelfEnergy C
		}
	}
};
case SALANDIT_30:
return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
	weakness WATER
	move "Grass Fire" , {
		text "10 Discard a [G] Energy from the defending Pokémon"
		energyCost R
		onAttack{
		    damage 10
		    afterDamage{
		        assert opp.active.cards.energyCount(G)
		        opp.active.cards.filterByEnergyType(G).select("Discard").discard()
		    }
		}
	}
};
case SALAZZLE_31:
return 	evolution (this, from:"Salandit", hp:HP100, type:FIRE, retreatCost:1) {
	weakness WATER
	bwAbility "Roast Reveal" , {
		text "Once during your turn (before your attack), you may discard a [R] Energy card from your hand. If you do, draw 3 cards."
		actionA{
		assert my.hand.filterByBasicEnergyType(R)
							my.hand.filterByBasicEnergyType(R).select("Choose the card to discard.").discard()
							draw 3
							powerUsed()
		}

	}
	move "Combustion" , {
		text "60 damage"
		energyCost R,C
		onAttack{
		    damage 60
		}
	}
};
case BLACEPHALON_32:
return basic (this, hp:HP120, type:FIRE, retreatCost:2) {
	weakness WATER
	move "Blazer" , {
		text "10+ Turn 1 of your face-down Prize cards face up. If it's a [R] Energy card, this attack does 50 more damage. (That prize card remains face up for the rest of the game)"
		energyCost R
		onAttack{
		    damage 10
		    damage 50*my.prizeCardSet.select("Reveal a prize card").filterByBasicEnergyType(R).size
		}
	}
	move "Fireball Circus" , {
		text "50Ã Discard any number of [R] Energy cards from your hand. This attack does 50 damage for each card discarded in this way."
		energyCost R,R,R
		attackRequirement{
						assert my.hand.filterByBasicEnergyType(R) : "No [R] Energy cards in hand"
					}
		onAttack{
		    damage 50*my.hand.filterByBasicEnergyType(R).select("discard [R] Energy cards for 50 damage").discard().size()
		}
	}
};
case SQUIRTLE_33:
return basic (this, hp:HP060, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Bubble" , {
		text "10 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
		energyCost W
		onAttack{
		    damage 10
		    flip{apply PARALYZED}
		}
	}
};
case WARTORTLE_34:
return 	evolution (this, from:"Squirtle", hp:HP070, type:WATER, retreatCost:2) {
	weakness GRASS
	bwAbility "Solid Shell" , {
		text "This Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
		delayedA {
            before APPLY_ATTACK_DAMAGES, {
                if(it.to == self && it.notNoEffect && it.dmg.value) {
                     bc "Solid Shell -30"
                    it.dmg -= hp(30)
                  }
            }
          }

	}
	move "Aqua Slash" , {
		text "60 This Pokémon can't attack during your next turn."
		energyCost W,W
		onAttack{
		    damage 60
		    cantAttackNextTurn self
		}
	}
};
case BLASTOISE_GX_35:
return 	evolution (this, from:"Wartortle", hp:HP240, type:WATER, retreatCost:3) {
	weakness GRASS
	bwAbility "Solid Shell" , {
		text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
			delayedA {
            before APPLY_ATTACK_DAMAGES, {
                if(it.to == self && it.notNoEffect && it.dmg.value) {
                     bc "Solid Shell -30"
                    it.dmg -= hp(30)
                  }
            }
          }
	}
	move "Rocket Splash" , {
		text "60Ã Shuffle any amount of [W] Energy from your Pokémon into your deck. This attack does 60 damage for each card you shuffled into your deck in this way"
		energyCost W,W
		onAttack{
		    def count=0
						def toBeMoved=new CardList()
						while (1) {
							def tar = my.all.findAll {it.cards.filterByEnergyType(W).findAll {!toBeMoved.contains(it)}.notEmpty()}
							if (!tar) break
							def pcs = tar.select("Pokemon that has [W] energy to put in the Lost Zone. Cancel to stop", false)
							if (!pcs) break
							def dd = pcs.cards.filterByEnergyType(W).findAll {!toBeMoved.contains(it)}.select("[W] Energy to shuffle into your deck")
							toBeMoved.addAll(dd)
							count++
						}
						damage 50*count
						afterDamage {
						    toBeMoved.moveTo(my.deck)
						    shuffleDeck()
						}
		}
	}
	move "Giant Geyser GX" , {
		text "Attach any number of [W] Energy cards from your hand to your pokemon in any way you like. (You can't use more than 1 GX attack in a game.)"
		energyCost W
		attackRequirement{
			gxCheck()
			}
			onAttack{
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
return basic (this, hp:HP050, type:WATER, retreatCost:1) {
	weakness GRASS
	bwAbility "Round &#8216;n' Round" , {
		text "You can use this Ability only if you go second. Once during your first turn (before your attack), you may leave your opponent's Active Pokémon Confused."
		actionA {
					assert bg.turnCount%2 == 0 : "You went first"
					apply CONFUSED
					}

	}
	move "Watering" , {
		text "10 damage"
		energyCost W
		onAttack{
		    damage 10
		}
	}
};
case POLIWAG_37:
return basic (this, hp:HP060, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Call for Family" , {
		text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
		energyCost C
		callForFamily(basic:true,1,delegate)
	}
};
case POLIWHIRL_38:
return 	evolution (this, from:"Poliwag", hp:HP090, type:WATER, retreatCost:2) {
	weakness GRASS
	move "Bubble" , {
		text "20 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
		energyCost W
		onAttack{
		    damage 20
		    flip{apply PARALYZED}
		    
		}
	}
	move "Knuckle Punch" , {
		text "40 damage"
		energyCost C,C
		onAttack{
		    damage 40
		}
	}
};
case POLIWRATH_39:
return 	evolution (this, from:"Poliwhirl", hp:HP150, type:WATER, retreatCost:3) {
	weakness GRASS
	move "Knuckle Punch" , {
		text "50\n"
		energyCost C,C
		onAttack{
		    damage 50
		}
	}
	move "Swirly Rush" , {
		text "90+ If Poliwag and Poliwhirl are on your Bench, this attack does 90 more damage."
		energyCost W,C,C
		onAttack{
		    damage 90
		    if(self.owner.pbg.bench.findAll({it.name=="Poliwag"}) && self.owner.pbg.bench.findAll({it.name=="Poliwirl"})){
		        damage 90
		    }
		}
	}
};
case TENTACOOL_40:
return basic (this, hp:HP060, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Bubble Jutsu" , {
		text "10+ If you played Janine from your hand during this turn, this attack does 50 more damage."
		energyCost C
		onAttack{
		    damage 10
		    if(bg.em().retrieveObject("Janine") == bg.turnCount){
				damage 50
			}
		}
	}
};
case TENTACRUEL_41:
return 	evolution (this, from:"Tentacool", hp:HP100, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Wicked Tentacles" , {
		text "Move an Energy from 1 of your opponent's Pokémon to another of their Pokémon. If you do, put 3 damage counters on the Pokémon you moved the Energy to.\n"
		energyCost C
		attackRequirement{
		    assert opp.all.findAll{it.cards.filterByType(ENERGY)}
		    assert opp.bench
		}
		onAttack{
		    def bothAll = new PcsList();
					  opp.all.each{
					    bothAll.add(it)
					  }
					  def pcs = bothAll.findAll{itcards.filterByType(ENERGY)}.select("Choose the pokémon to move the energy from")
					  def tar = bothAll.findAll{it != pcs}.select("Select the pokémon to recieve the energy")
					    energySwitch(pcs,tar, pcs.cards.filterByType(ENERGY).select("Choose the energy to move"))
					    tar.damage+=hp(30)

		}
	}
	move "Wrap" , {
		text "60 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
		energyCost C,C,C
		onAttack{
		    damage 60
		    flip{apply PARALYZED}
		}
	}
};
case SLOWPOKE_42:
return basic (this, hp:HP070, type:WATER, retreatCost:2) {
	weakness GRASS
	move "Growl" , {
		text "During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance).\n"
		energyCost W
		onAttack{
		    reduceDamageNextTurn(hp(20), thisMove)
		}
	}
	move "Tail Whap" , {
		text "20 damage"
		energyCost C,C
		onAttack{
		    damage 20
		}
	}
};
case SLOWBRO_43:
return 	evolution (this, from:"Slowpoke", hp:HP120, type:WATER, retreatCost:2) {
	weakness GRASS
	move "Yawn" , {
		text "Your opponent's Active Pokémon is now Asleep.\n"
		energyCost W
		onAttack{
		    apply ASLEEP
		}
	}
	move "Three Strikes" , {
		text "100Ã Flip 3 coins. This attack does 100 damage for each heads. If all of them are tails, you lose this game."
		energyCost W,C,C
		onAttack{
		    flip 3,{},{},[0:{bg.getGame().endGame(opp.active.owner, WinCondition.OTHER)},1:{damage 100},2:{damage 200},3:{damage 300}]
		}
	}
};
case SEEL_44:
return basic (this, hp:HP080, type:WATER, retreatCost:2) {
	weakness GRASS
	move "Horn Attack" , {
		text "30 damage"
		energyCost C,C
		onAttack{
		    damage 30
		}
	}
};
case DEWGONG_45:
return 	evolution (this, from:"Seel", hp:HP120, type:WATER, retreatCost:2) {
	weakness METAL
	move "Tail Whap" , {
		text "60\n"
		energyCost C,C
		onAttack{
		    damage 60
		}
	}
	move "Dual Blizzard" , {
		text "Discard 2 Energy from this Pokémon. This attack does 60 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost C,C,C
		onAttack{
		    multiSelect(opp.all,2).each{
								directDamage 60, it
							}

		}
		afterDamage{
							discardSelfEnergy C,C
						}

	}
};
case KRABBY_46:
return basic (this, hp:HP070, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Stampede" , {
		text "10\n"
		energyCost C
		onAttack{
		    damage 10
		}
	}
	move "Vice Grip" , {
		text "20 damage"
		energyCost W,C
		onAttack{
		    damage 20
		}
	}
};
case KINGLER_47:
return 	evolution (this, from:"Krabby", hp:HP130, type:WATER, retreatCost:4) {
	weakness GRASS
	move "Bubble Beam" , {
		text "80 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
		energyCost W,C,C
		onAttack{
		    damage 80
		    flip{apply PARALYZED}
		}
	}
	move "Massive Rend" , {
		text "130 damage"
		energyCost W,C,C,C
		onAttack{
		    damage 130
		}
	}
};
case GOLDEEN_48:
return basic (this, hp:HP060, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Elegant Swim" , {
		text "10 Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
		energyCost W
		onAttack{
		    damage 10
		    flip {preventAllEffectsNextTurn()}
		}
	}
};
case SEAKING_49:
return 	evolution (this, from:"Goldeen", hp:HP100, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Enhanced Horn" , {
		text "30Ã Flip 2 coins. This attack does 30 damage for each heads. If this Pokémon has a Pokémon Tool card attached to it, flip 6 coins instead."
		energyCost W
		onAttack{
		    flip 2, {
							damage 30
						}
		    if(self.cards.filterByType(POKEMON_TOOL)){
		        flip 4, {
		            damage 30
		        }
		    }
		}
	}
};
case KYUREM_50:
return basic (this, hp:HP130, type:WATER, retreatCost:2) {
	weakness METAL
	move "Call Forth Cold" , {
		text "Search your deck for a"
		energyCost C
	}
	move "Hail Prison" , {
		text "110 Discard 2"
		energyCost W,W,C
	}
};
case FROAKIE_51:
return basic (this, hp:HP060, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Quick Attack" , {
		text "10+ Flip a coin. If heads, this attack does 20 more damage."
		energyCost C
	}
};
case FROGADIER_52:
return 	evolution (this, from:"Froakie", hp:HP080, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Afterimage Strike" , {
		text "20 If any damage is done to this Pokémon by attacks during your opponent's next turn, flip a coin. If heads, prevent that damage."
		energyCost C
	}
};
case PYUKUMUKU_53:
return basic (this, hp:HP070, type:WATER, retreatCost:1) {
	weakness GRASS
	move "Call for Family" , {
		text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.\n"
		energyCost C
	}
	move "Surprise Fist" , {
		text "60+ You and your opponent play Rock-Paper-Scissors. If you win, this attack does 60 more damage."
		energyCost W,C,C
	}
};
case PIKACHU_54:
return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	move "Pika Ball" , {
		text "30 damage"
		energyCost L,C
	}
};
case RAICHU_55:
return 	evolution (this, from:"Pikachu", hp:HP120, type:LIGHTNING, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Never Give Up" , {
		text "You can use this attack only if you have at least 3 more Prize cards remaining than your opponent. Attach all"
		energyCost C
	}
	move "Head Bolt" , {
		text "110 damage"
		energyCost L,L,C
	}
};
case STUNFISK_56:
return basic (this, hp:HP110, type:LIGHTNING, retreatCost:3) {
	weakness FIGHTING
	resistance , MINUS20
	move "Raging Thunder" , {
		text "30 This attack does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost C
	}
	move "Electric Trap" , {
		text "30Ã This attack does 30 damage for each of your Pokémon that has any damage counters on it."
		energyCost C,C
	}
};
case DEDENNE_GX_57:
return basic (this, hp:HP160, type:LIGHTNING, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Dedechange" , {
		text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard your hand and draw 6 cards. You can't use more than 1 Dedechange Ability each turn."
	}
	move "Static Shock" , {
		text "50\n"
		energyCost L,C
	}
	move "Tingly Return GX" , {
		text "50 Your opponent's Active Pokémon is now Paralyzed. Put this Pokémon and all cards attached to it into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost L,C
	}
};
case CHARJABUG_58:
return 	evolution (this, from:"Grubbin", hp:HP080, type:LIGHTNING, retreatCost:3) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Battery" , {
		text "Once during your turn (before your attack), you may attach this card from your hand to 1 of your Vikavolt or Vikavolt-GX as a Special Energy card. This card provides 2 [L] Energy only while it's attached to a Pokémon."
	}
	move "Pierce" , {
		text "60 damage"
		energyCost C,C,C
	}
};
case VIKAVOLT_59:
return 	evolution (this, from:"Charjabug", hp:HP150, type:LIGHTNING, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Stealthy Body" , {
		text "If there is any Stadium card in play, this Pokémon has no Weakness."
	}
	move "Electricannon" , {
		text "120+ You may discard all"
		energyCost L,L,L,L
	}
};
case ZERAORA_60:
return basic (this, hp:HP120, type:LIGHTNING, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	move "Crushing Claw" , {
		text "20 Discard a Special Energy from your opponent's Active Pokémon.\n"
		energyCost L
	}
	move "Discharge" , {
		text "50Ã Discard all"
		energyCost L,C,C
	}
};
case MUK_ALOLAN_MUK_GX_61:
return basic (this, hp:HP270, type:PSYCHIC, retreatCost:4) {
	weakness PSYCHIC
	move "Severe Poison" , {
		text "Your opponent's Active Pokémon is now Poisoned. Put 8 damage counters instead of 1 on that Pokémon between turns.\n"
		energyCost P,C,C
	}
	move "Poison Absorption" , {
		text "120 If your opponent's Active Pokémon is Poisoned, heal 100 damage from this Pokémon.\n[-][+] <span class="attack-name">Nasty Goo Mix GX Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost P,C,C,C
	}
	move "Nasty Goo Mix GX" , {
		text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
	}
};
case EKANS_62:
return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	move "Glare" , {
		text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
		energyCost C
	}
	move "Tail Smack" , {
		text "20 damage"
		energyCost P,C
	}
};
case ARBOK_63:
return 	evolution (this, from:"Ekans", hp:HP120, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	move "Wrap" , {
		text "30 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
		energyCost C
	}
	move "Heavy Choke" , {
		text "50+ If this Pokémon used Wrap during your last turn, this attack does 120 more damage."
		energyCost P,C
	}
};
case ZUBAT_64:
return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Bite" , {
		text "10\n"
		energyCost P
	}
	move "Venoshock" , {
		text "20+ If your opponent's Active Pokémon is Poisoned, this attack does 50 more damage."
		energyCost C,C
	}
};
case GOLBAT_65:
return 	evolution (this, from:"Zubat", hp:HP080, type:PSYCHIC, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Bite" , {
		text "20\n"
		energyCost P
	}
	move "Leech Life" , {
		text "40 Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon."
		energyCost C,C,C
	}
};
case CROBAT_66:
return 	evolution (this, from:"Golbat", hp:HP130, type:PSYCHIC, retreatCost:0) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Sound Veil" , {
		text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all effects of your opponent's attacks, including damage, done to this Pokémon until the end of your opponent's next turn."
	}
	move "Severe Poison" , {
		text "60 Your opponent's Active Pokémon is now Poisoned. Put 4 damage counters instead of 1 of that Pokémon between turns."
		energyCost C,C,C
	}
};
case GASTLY_67:
return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	bwAbility "Swelling Spite" , {
		text "When this Pokémon is Knocked Out, search your deck for up to 2 Haunter and put them onto your Bench. Then, shuffle your deck."
	}
	move "Will-O-Wisp" , {
		text "20 damage"
		energyCost C,C
	}
};
case GASTLY_68:
return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	move "Smog" , {
		text "Your opponent's Active Pokémon is now Poisoned."
		energyCost P
	}
};
case HAUNTER_69:
return 	evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	move "Sinister Fog" , {
		text "Your opponent's Active Pokémon is now Poisoned. Put 1 damage counter on each of your opponent's Benched Pokémon."
		energyCost P
	}
};
case GENGAR_70:
return 	evolution (this, from:"Haunter", hp:HP130, type:PSYCHIC, retreatCost:0) {
	weakness DARKNESS
	resistance , MINUS20
	bwAbility "Shadow Pain" , {
		text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 6 damage counters on your opponent's Pokémon-GX and Pokémon-EX in any way you like."
	}
	move "Twilight Poison" , {
		text "70 Your opponent's Active Pokémon is now Asleep and Poisoned."
		energyCost C,C,C
	}
};
case DROWZEE_71:
return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	move "Hypnosis" , {
		text "Your opponent's Active Pokémon is now Asleep.\n"
		energyCost P
	}
	move "Psypunch" , {
		text "30 damage"
		energyCost P,C,C
	}
};
case HYPNO_72:
return 	evolution (this, from:"Drowzee", hp:HP110, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	bwAbility "Hypnotic Pendulum" , {
		text "When your opponent's Active Pokémon is Knocked Out, flip a coin. If heads, choose which of your opponent's Benched Pokémon becomes their new Active Pokémon."
	}
	move "Stir the Brain" , {
		text "30+ This attack does 10 more damage for each card in your opponent's hand."
		energyCost P,C,C
	}
};
case KOFFING_73:
return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	move "Foul Odor" , {
		text "Both Active Pokémon are now Confused."
		energyCost C
	}
};
case WEEZING_74:
return 	evolution (this, from:"Koffing", hp:HP120, type:PSYCHIC, retreatCost:3) {
	weakness PSYCHIC
	bwAbility "Detention Gas" , {
		text "As long as this Pokémon is your Active Pokémon, put 1 damage counter on each of your opponent's Basic Pokémon between turns."
	}
	move "Splattering Sludge" , {
		text "40 This attack does 20 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost C,C
	}
};
case MEWTWO_75:
return basic (this, hp:HP120, type:PSYCHIC, retreatCost:2) {
	weakness PSYCHIC
	bwAbility "Mind Report" , {
		text "When you play this Pokémon from your hand onto your Bench during your turn, you may put a Supporter card from your discard pile on top of your deck."
	}
	move "Psyshock" , {
		text "70 This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
		energyCost P,C,C
	}
};
case MEW_76:
return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
	weakness PSYCHIC
	bwAbility "Bench Barrier" , {
		text "Prevent all damage done to your Benched Pokémon by your opponent's attacks."
	}
	move "Psypower" , {
		text "Put 3 damage counters on your opponent's Pokémon in any way you like."
		energyCost C
		}
};
case MISDREAVUS_77:
return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	move "Ominous Eyes" , {
		text "Put 1 damage counter on 1 of your opponent's Pokémon."
		energyCost P
	}
};
case MISMAGIUS_78:
return 	evolution (this, from:"Misdreavus", hp:HP110, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	bwAbility "Mysterious Message" , {
		text "Once during your turn (before your attack), you may draw cards until you have 7 cards in your hand. If you drew any cards in this way, this Pokémon is Knocked Out."
	}
	move "Hypnoblast" , {
		text "70 Your opponent's Active Pokémon is now Asleep."
		energyCost P,C,C
	}
};
case ESPURR_79:
return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
	weakness PSYCHIC
	move "Caturday" , {
		text "Draw a card. If you do, this Pokémon is now Asleep.\n"
		energyCost C
	}
	move "Ear Kinesis" , {
		text "This attack does 20 damage to 1 of your opponent's Benched Pokémon for each damage counter on that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost P,C,C
	}
};
case MEOWSTIC_80:
return 	evolution (this, from:"Espurr", hp:HP090, type:PSYCHIC, retreatCost:1) {
	weakness PSYCHIC
	move "Caturday" , {
		text "Draw 3 cards. If you do, this Pokémon is now Asleep.\n"
		energyCost C
	}
	move "Perplexing Eyes" , {
		text "70 The Defending Pokémon's Weakness is now"
		energyCost P,C,C
	}
};
case MARSHADOW_81:
return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
	weakness DARKNESS
	resistance , MINUS20
	bwAbility "Resetting Hole" , {
		text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may discard any Stadium card in play. If you do, discard this Pokémon and all cards attached to it."
	}
	move "Red Knuckles" , {
		text "10+ If your opponent's Active Pokémon is an Ultra Beast, this attack does 60 more damage."
		energyCost C
	}
};
case MARSHADOW_MACHAMP_GX_82:
return basic (this, hp:HP270, type:FIGHTING, retreatCost:3) {
	weakness PSYCHIC
	move "Revenge" , {
		text "30+ If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage.\n"
		energyCost F,C
	}
	move "Hundred-Blows Impact" , {
		text "160\n"
		energyCost F,F,C
	}
	move "Acme of Heroism GX" , {
		text "200 If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), and if it would be Knocked Out by damage from an opponent's attack during their next turn, it is not Knocked Out, and its remaining HP becomes 10. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost F,F,C,+
	}
};
case SANDSHREW_83:
return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Collect" , {
		text "Draw a card.\n"
		energyCost C
	}
	move "Rolling Tackle" , {
		text "30 damage"
		energyCost F,C,C
	}
};
case SANDSLASH_84:
return 	evolution (this, from:"Sandshrew", hp:HP110, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Continuous Scratch" , {
		text "30Ã Flip 4 coins. This attack does 30 damage for each heads.\n"
		energyCost C
	}
	move "Sand Tomb" , {
		text "90 The Defending Pokémon can't retreat during your opponent's next turn."
		energyCost F,C,C
	}
};
case DIGLETT_85:
return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	bwAbility "Underground Work" , {
		text "If you discard this Pokémon with the effect of Giovanni's Exile, discard the top card of your opponent's deck."
	}
	move "Hook" , {
		text "10 damage"
		energyCost F
	}
};
case DUGTRIO_86:
return 	evolution (this, from:"Diglett", hp:HP090, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Home Ground" , {
		text "30+ If you have any Stadium card in play, this attack does 60 more damage."
		energyCost F
	}
};
case GEODUDE_87:
return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
	weakness GRASS
	move "Defense Curl" , {
		text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn.\n"
		energyCost F
	}
	move "Rock Throw" , {
		text "40 damage"
		energyCost C,C,C
	}
};
case GRAVELER_88:
return 	evolution (this, from:"Geodude", hp:HP110, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	move "Rolling Rocks" , {
		text "50\n"
		energyCost C,C,C
	}
	move "Double-Edge" , {
		text "90 This Pokémon does 30 damage to itself."
		energyCost F,C,C,C
	}
};
case GOLEM_89:
return 	evolution (this, from:"Graveler", hp:HP180, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	move "Steamroller" , {
		text "100 This attack's damage isn't affected by Resistance.\n"
		energyCost C,C,C
	}
	move "Heavy Slam" , {
		text "180- This attack does 20 less damage for each"
		energyCost F,C,C,C
	}
};
case CUBONE_90:
return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Focus Energy" , {
		text "During your next turn, this Pokémon's Beat attack's base damage is 80.\n"
		energyCost C
	}
	move "Beat" , {
		text "10 damage"
		energyCost C
	}
};
case MAROWAK_91:
return 	evolution (this, from:"Cubone", hp:HP110, type:FIGHTING, retreatCost:2) {
	weakness GRASS
	move "Bone Rush" , {
		text "50Ã Flip a coin until you get tails. This attack does 50 damage for each heads.\n"
		energyCost F
	}
	move "Assault Boom" , {
		text "70+ If your opponent's Active Pokémon has a Pokémon Tool card attached to it, this attack does 70 more damage."
		energyCost C,C,C
	}
};
case RHYHORN_92:
return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
	weakness GRASS
	move "Push Down" , {
		text "20 Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
		energyCost F
	}
};
case RHYHORN_93:
return basic (this, hp:HP090, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	move "Horn Attack" , {
		text "30\n"
		energyCost C,C
	}
	move "Boulder Crush" , {
		text "80 damage"
		energyCost F,C,C,C
	}
};
case RHYDON_94:
return 	evolution (this, from:"Rhyhorn", hp:HP110, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	move "Dirty Work" , {
		text "Discard the top card of your opponent's deck. If you played Giovanni's Exile from your hand during this turn, discard the top 5 cards instead.\n"
		energyCost C,C
	}
	move "Horn Attack" , {
		text "90 damage"
		energyCost F,C,C,C
	}
};
case RHYPERIOR_95:
return 	evolution (this, from:"Rhydon", hp:HP170, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	move "Hefty Cannon" , {
		text "90 If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn.\n"
		energyCost F,C,C
	}
	move "Break Ground" , {
		text "160 This attack does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost F,C,C,C
	}
};
case WOOPER_96:
return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Mud Bomb" , {
		text "30 damage"
		energyCost W,W
	}
};
case QUAGSIRE_97:
return 	evolution (this, from:"Wooper", hp:HP120, type:FIGHTING, retreatCost:2) {
	weakness GRASS
	move "Water Gun" , {
		text "20\n"
		energyCost W
	}
	move "Surf" , {
		text "120 damage"
		energyCost W,W,W
	}
};
case GLIGAR_98:
return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
	weakness GRASS
	bwAbility "Free Flight" , {
		text "If this Pokémon has no Energy attached to it, it has no Retreat Cost."
	}
	move "Shinobi Strike" , {
		text "30+ If you played Janine from your hand during this turn, this attack does 90 more damage."
		energyCost C,C,C
	}
};
case GLISCOR_99:
return 	evolution (this, from:"Gligar", hp:HP110, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Collect" , {
		text "Draw 3 cards.\n"
		energyCost C
	}
	move "Poison Jab" , {
		text "70 Your opponent's Active Pokémon is now Poisoned."
		energyCost C,C,C
	}
};
case TYROGUE_100:
return basic (this, hp:HP060, type:FIGHTING, retreatCost:0) {
	bwAbility "Bratty Kick" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, put 3 damage counters on 1 of your opponent's Pokémon. If you use this Ability, your turn ends.<p class="weakness-resistance-retreat-cost">weakness:<br>resistance:<br>retreat: <a href="https://pkmncards.com/retreat-cost/zero/" class="retreat-cost">0<p class="artist-set"><a href="https://pkmncards.com/set/unbroken-bonds/" class="set"><abbr title="Unbroken Bonds">UNB <a href="https://pkmncards.com/number/100/" class="number">100 <a href="https://pkmncards.com/rarity/uncommon/" class="rarity"><abbr title="Uncommon">U</p"
	}
};
case HITMONTOP_101:
return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
	weakness PSYCHIC
	move "Finishing Combo" , {
		text "You can use this attack only if your Hitmonlee used Special Combo during your last turn. This attack does 60 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost F
	}
	move "Spinning Attack" , {
		text "50 damage"
		energyCost C,C
	}
};
case RIOLU_102:
return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
	weakness PSYCHIC
	move "Feint" , {
		text "10 This attack's damage isn't affected by Resistance."
		energyCost C
	}
};
case LANDORUS_103:
return basic (this, hp:HP120, type:FIGHTING, retreatCost:1) {
	weakness GRASS
	move "Linear Attack" , {
		text "This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost F
	}
	move "Power Cyclone" , {
		text "60 Move an Energy from this Pokémon to 1 of your Benched Pokémon."
		energyCost F,C
	}
};
case CRABRAWLER_104:
return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
	weakness PSYCHIC
	move "Corkscrew Punch" , {
		text "20\n"
		energyCost C,C
	}
	move "Knuckle Blast" , {
		text "30+ If you have more Prize cards remaining than your opponent, this attack does 60 more damage."
		energyCost F,C,C
	}
};
case CRABOMINABLE_105:
return 	evolution (this, from:"Crabrawler", hp:HP140, type:FIGHTING, retreatCost:4) {
	weakness PSYCHIC
	move "Fight Alone" , {
		text "30+ If you have fewer Pokémon in play than your opponent, this attack does 50 more damage for each Pokémon fewer you have in play.\n"
		energyCost C,C
	}
	move "Magnum Punch" , {
		text "80 damage"
		energyCost F,C,C
	}
};
case STAKATAKA_106:
return basic (this, hp:HP120, type:FIGHTING, retreatCost:4) {
	weakness GRASS
	bwAbility "Wall of Stone" , {
		text "If your opponent has 3 or fewer Prize cards remaining, this Pokémon's maximum HP is 200."
	}
	move "Top Down" , {
		text "110 Flip a coin until you get tails. For each heads, discard the top card of your opponent's deck."
		energyCost F,F,C
	}
};
case GRENINJA_ZOROARK_GX_107:
return basic (this, hp:HP250, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Dark Pulse" , {
		text "30+ This attack does 30 more damage times the amount of"
		energyCost D,C
	}
	move "Dark Union GX" , {
		text "Put 2 in any combination of"
		energyCost D,C,+
	}
};
case MURKROW_108:
return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Astonish" , {
		text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
		energyCost D
	}
};
case HONCHKROW_GX_109:
return 	evolution (this, from:"Murkrow", hp:HP210, type:DARKNESS, retreatCost:2) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Ruler of the Night" , {
		text "As long as this Pokémon is your Active Pokémon, your opponent can't play any Pokémon Tool, Special Energy, or Stadium cards from their hand."
	}
	move "Feather Storm" , {
		text "90 This attack does 30 damage to 2 of your opponent's Benched Pokémon-GX and Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost D,C,C
	}
	move "Unfair GX" , {
		text "Your opponent reveals their hand. Discard 2 cards from it. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C
	}
};
case CARVANHA_110:
return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	move "Gnaw" , {
		text "10 damage"
		energyCost D
	}
};
case SHARPEDO_111:
return 	evolution (this, from:"Carvanha", hp:HP110, type:DARKNESS, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Greedy Evolution" , {
		text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may look at the top 6 cards of your deck and attach any number of [D] Energy cards you find there to this Pokémon. Shuffle the other cards back into your deck."
	}
	move "Bad Fangs" , {
		text "60+ This attack does 20 more damage times the amount of"
		energyCost C,C,C
	}
};
case SPIRITOMB_112:
return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
	bwAbility "Building Spite" , {
		text "Once during your turn (before your attack), you may put 1 damage counter on this Pokémon."
	}
	move "Anguish Cry" , {
		text "10+ This attack does 30 more damage for each damage counter on this Pokémon."
		energyCost D
	}
};
case SANDILE_113:
return basic (this, hp:HP060, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Intimidating Fang" , {
		text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
	}
	move "Gnaw" , {
		text "10 damage"
		energyCost D
	}
};
case SANDILE_114:
return basic (this, hp:HP070, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Grandiose Fangs" , {
		text "30 If your opponent's Pokémon is Knocked Out by damage from this attack, this Pokémon's attacks do 120 more damage to your opponent's Active Pokémon during your next turn (before applying Weakness and Resistance)."
		energyCost C,C,C
	}
};
case KROKOROK_115:
return 	evolution (this, from:"Sandile", hp:HP090, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Bite" , {
		text "20\n"
		energyCost D
	}
	move "Corner" , {
		text "50 The Defending Pokémon can't retreat during your opponent's next turn."
		energyCost C,C,C
	}
};
case KROOKODILE_116:
return 	evolution (this, from:"Krokorok", hp:HP150, type:DARKNESS, retreatCost:3) {
	weakness FIGHTING
	resistance , MINUS20
	move "Chomp Chomp Panic" , {
		text "50Ã This attack does 50 damage for each"
		energyCost C,C,C
	}
	move "Crunch" , {
		text "100 Discard an Energy from your opponent's Active Pokémon."
		energyCost D,C,C,C
	}
};
case GRENINJA_117:
return 	evolution (this, from:"Frogadier", hp:HP130, type:DARKNESS, retreatCost:0) {
	weakness FIGHTING
	resistance , MINUS20
	move "Bring Down" , {
		text "The Pokémon that has the least HP remaining, except for this Pokémon, is Knocked Out. (If multiple Pokémon are tied, choose one.)\n"
		energyCost C,C
	}
	move "Mist Slash" , {
		text "70 This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
		energyCost D,D
	}
};
case INKAY_118:
return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	move "Perplex" , {
		text "Your opponent's Active Pokémon is now Confused."
		energyCost D
	}
};
case MALAMAR_119:
return 	evolution (this, from:"Inkay", hp:HP100, type:DARKNESS, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	move "Hypnotic Reign" , {
		text "Your opponent reveals their hand. You may discard a Pokémon you find there and use one of that Pokémon's non-GX attacks as this attack.\n"
		energyCost D
	}
	move "Dark Pressure" , {
		text "80 Discard the top card of your opponent's deck."
		energyCost D,C,C
	}
};
case LUCARIO_MELMETAL_GX_120:
return basic (this, hp:HP260, type:METAL, retreatCost:3) {
	weakness FIRE
	resistance , MINUS20
	move "Steel Fist" , {
		text "50 Search your deck for a"
		energyCost C,C
	}
	move "Heavy Impact" , {
		text "150\n"
		energyCost M,M,C,C
	}
	move "Full Metal Wall GX" , {
		text "For the rest of this game, your"
		energyCost C,+
	}
};
case ALOLAN_DIGLETT_121:
return basic (this, hp:HP050, type:METAL, retreatCost:1) {
	weakness FIRE
	resistance , MINUS20
	move "Ram" , {
		text "10 damage"
	}
};
case ALOLAN_DUGTRIO_122:
return 	evolution (this, from:"Alolan Diglett", hp:HP080, type:METAL, retreatCost:1) {
	weakness FIRE
	resistance , MINUS20
	bwAbility "Hair Wall" , {
		text "Your [M] Pokémon take 10 less damage from your opponent's attacks (after applying Weakness and Resistance)."
	}
	move "Hammer In" , {
		text "40 damage"
		energyCost M,C
	}
};
case ARON_123:
return basic (this, hp:HP060, type:METAL, retreatCost:1) {
	weakness FIRE
	resistance , MINUS20
	move "Rigidify" , {
		text "During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).\n"
		energyCost M
	}
	move "Metal Claw" , {
		text "20 damage"
		energyCost M,C
	}
};
case LAIRON_124:
return 	evolution (this, from:"Aron", hp:HP090, type:METAL, retreatCost:3) {
	weakness FIRE
	resistance , MINUS20
	move "Rigidify" , {
		text "During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).\n"
		energyCost M
	}
	move "Headbutt" , {
		text "70 damage"
		energyCost M,M,C
	}
};
case AGGRON_125:
return 	evolution (this, from:"Lairon", hp:HP170, type:METAL, retreatCost:4) {
	weakness FIRE
	resistance , MINUS20
	move "Extra-Tight Press" , {
		text "80 During your opponent's next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out), put 8 damage counters on the Attacking Pokémon.\n"
		energyCost M,C,C
	}
	move "Giga Impact" , {
		text "160 This Pokémon can't attack during your next turn."
		energyCost M,C,C,C
	}
};
case LUCARIO_126:
return 	evolution (this, from:"Riolu", hp:HP130, type:METAL, retreatCost:2) {
	weakness FIRE
	resistance , MINUS20
	move "Low Sweep" , {
		text "40\n"
		energyCost C
	}
	move "Rush Up" , {
		text "60+ If you attached a Pokémon Tool card from your hand to this Pokémon during this turn, this attack does 70 more damage."
		energyCost M,M
	}
};
case GENESECT_127:
return basic (this, hp:HP130, type:METAL, retreatCost:2) {
	weakness FIRE
	resistance , MINUS20
	bwAbility "Fast-Flight Configuration" , {
		text "If your opponent has any Pokémon-GX or Pokémon-EX in play, this Pokémon has no Retreat Cost."
	}
	move "Splitting Beam" , {
		text "30 This attack does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost M,C,C
	}
};
case MELTAN_128:
return basic (this, hp:HP070, type:METAL, retreatCost:1) {
	weakness FIRE
	resistance , MINUS20
	move "Steel Melt" , {
		text "10+ If your opponent's Active Pokémon is a"
		energyCost M
	}
};
case MELMETAL_129:
return 	evolution (this, from:"Meltan", hp:HP150, type:METAL, retreatCost:4) {
	weakness FIRE
	resistance , MINUS20
	bwAbility "Metal Eater" , {
		text "Once during your turn (before your attack), you may discard a [M] Pokémon from your hand. If you do, heal 100 damage from this Pokémon."
	}
	move "Heavy Impact" , {
		text "130 damage"
		energyCost M,C,C,C
	}
};
case GARDEVOIR_SYLVEON_GX_130:
return basic (this, hp:HP260, type:FAIRY, retreatCost:2) {
	weakness METAL
	resistance , MINUS20
	move "Fairy Song" , {
		text "Search your deck for up to 2"
		energyCost C
	}
	move "Kaleidostorm" , {
		text "150 Move any number of Energy from your Pokémon to your other Pokémon in any way you like.\n"
		energyCost Y,Y,C
	}
	move "Magical Miracle GX" , {
		text "200 If this Pokémon has at least 3 extra"
		energyCost Y,Y,Y,+
	}
};
case CLEFFA_131:
return basic (this, hp:HP060, type:FAIRY, retreatCost:0) {
	bwAbility "Excitable Draw" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, shuffle your hand into your deck and then draw 6 cards. If you use this Ability, your turn ends.<p class="weakness-resistance-retreat-cost">weakness:<br>resistance:<br>retreat: <a href="https://pkmncards.com/retreat-cost/zero/" class="retreat-cost">0<p class="artist-set"><a href="https://pkmncards.com/set/unbroken-bonds/" class="set"><abbr title="Unbroken Bonds">UNB <a href="https://pkmncards.com/number/131/" class="number">131 <a href="https://pkmncards.com/rarity/uncommon/" class="rarity"><abbr title="Uncommon">U</p"
	}
};
case CLEFAIRY_132:
return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Double Slap" , {
		text "10Ã Flip 2 coins. This attack does 10 damage for each heads."
		energyCost C
	}
};
case CLEFABLE_133:
return 	evolution (this, from:"Clefairy", hp:HP110, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Moon-Watching Dance" , {
		text "10+ This attack does 30 more damage for each of your Pokémon that has any"
		energyCost C
	}
};
case JIGGLYPUFF_134:
return basic (this, hp:HP070, type:FAIRY, retreatCost:2) {
	weakness METAL
	resistance , MINUS20
	move "Ball Roll" , {
		text "20Ã Flip a coin until you get tails. This attack does 20 damage for each heads."
		energyCost C,C
	}
};
case WIGGLYTUFF_135:
return 	evolution (this, from:"Jigglypuff", hp:HP110, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Orb Polish" , {
		text "Put 3 Energy cards from your discard pile into your hand.\n"
		energyCost C
	}
	move "Sleepy Ball" , {
		text "80 Your opponent's Active Pokémon is now Asleep."
		energyCost C,C,C
	}
};
case TOGEPI_136:
return basic (this, hp:HP050, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Daunt" , {
		text "10 During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance)."
		energyCost C
	}
};
case TOGETIC_137:
return 	evolution (this, from:"Togepi", hp:HP080, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Energy Present" , {
		text "Attach an Energy card from your hand to 1 of your Benched Pokémon.\n"
		energyCost C
	}
	move "Magical Shot" , {
		text "30 damage"
		energyCost Y,C
	}
};
case TOGEKISS_138:
return 	evolution (this, from:"Togetic", hp:HP140, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	bwAbility "Fairy Feast" , {
		text "Once during your turn (before your attack), you may heal 30 damage from each of your [Y] Pokémon."
	}
	move "Magical Shot" , {
		text "70 damage"
		energyCost Y,C
	}
};
case COTTONEE_139:
return basic (this, hp:HP050, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Expand" , {
		text "10 During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
		energyCost Y
	}
};
case WHIMSICOTT_GX_140:
return 	evolution (this, from:"Cottonee", hp:HP190, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	bwAbility "Fluffy Cotton" , {
		text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
	}
	move "Energy Blow" , {
		text "10+ This attack does 30 more damage times the amount of Energy attached to this Pokémon.\n"
		energyCost Y
	}
	move "Toy Box GX" , {
		text "Search your deck for up to 5 cards and put them into your hand. Then, shuffle your deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost Y
	}
};
case SPRITZEE_141:
return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Nap" , {
		text "Heal 20 damage from this Pokémon.\n"
		energyCost C
	}
	move "Fairy Wind" , {
		text "10 damage"
		energyCost Y
	}
};
case AROMATISSE_142:
return 	evolution (this, from:"Spritzee", hp:HP090, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	move "Pungent Aroma" , {
		text "Flip 2 coins. If either of them is heads, your opponent reveals their hand. For each heads, choose a card you find there. Your opponent shuffles those cards into their deck.\n"
		energyCost Y
	}
	move "Miraculous Cologne" , {
		text "30 Flip a coin. If heads, choose a Special Condition. Your opponent's Active Pokémon is now affected by that Special Condition."
		energyCost C,C
	}
};
case RATTATA_143:
return basic (this, hp:HP030, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Gnaw" , {
		text "30 damage"
		energyCost C
	}
};
case RATICATE_144:
return 	evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Escaping Incisors" , {
		text "70 If your opponent's Active Pokémon is an Evolution Pokémon, switch this Pokémon with 1 of your Benched Pokémon."
		energyCost C,C
	}
};
case SPEAROW_145:
return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Glide" , {
		text "10\n"
		energyCost C
	}
	move "Speed Dive" , {
		text "20 damage"
		energyCost C,C
	}
};
case FEAROW_146:
return 	evolution (this, from:"Spearow", hp:HP100, type:COLORLESS, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Drill Run Double" , {
		text "70 Flip a coin. If heads, discard 2 Energy from your opponent's Active Pokémon."
		energyCost C,C
	}
};
case MEOWTH_147:
return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Caturday" , {
		text "Draw 2 cards. If you do, this Pokémon is now Asleep.\n"
		energyCost C
	}
	move "Tail Whap" , {
		text "30 damage"
		energyCost C,C
	}
};
case PERSIAN_148:
return 	evolution (this, from:"Meowth", hp:HP100, type:COLORLESS, retreatCost:0) {
	weakness FIGHTING
	bwAbility "Gathering of Cats" , {
		text "Ignore all Energy in the attack costs of each of your Pokémon in play that has the Caturday attack."
	}
	move "Claw Slash" , {
		text "90 damage"
		energyCost C,C,C
	}
};
case PERSIAN_GX_149:
return 	evolution (this, from:"Meowth", hp:HP200, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	bwAbility "Cat Walk" , {
		text "Once during your turn (before your attack), if 1 of your Pokémon-GX or Pokémon-EX was Knocked Out during your opponent's last turn, you may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck. You can't use more than 1 Cat Walk Ability each turn."
	}
	move "Vengeance" , {
		text "10+ This attack does 20 more damage for each Pokémon in your discard pile. You can't add more than 180 damage in this way.\n"
		energyCost C,C,C
	}
	move "Slash Back GX" , {
		text "150 Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C,C
	}
};
case DODUO_150:
return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Peck" , {
		text "10\n"
		energyCost C
	}
	move "Double Peck" , {
		text "20Ã Flip 2 coins. This attack does 20 damage for each heads."
		energyCost C,C
	}
};
case DODRIO_151:
return 	evolution (this, from:"Doduo", hp:HP100, type:COLORLESS, retreatCost:0) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Tri Attack" , {
		text "60Ã Flip 3 coins. This attack does 60 damage for each heads.\n"
		energyCost C,C
	}
	move "Accelerating Stab" , {
		text "90 This Pokémon can't use Accelerating Stab during your next turn."
		energyCost C,C
	}
};
case LICKITUNG_152:
return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	move "Lick" , {
		text "30 Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
		energyCost C,C
	}
};
case LICKILICKY_153:
return 	evolution (this, from:"Lickitung", hp:HP130, type:COLORLESS, retreatCost:4) {
	weakness FIGHTING
	move "Eat Up" , {
		text "40 Before doing damage, discard all Pokémon Tool cards from your opponent's Active Pokémon. If you discarded a Pokémon Tool card in this way, heal all damage from this Pokémon.\n"
		energyCost C,C
	}
	move "Tonguenado" , {
		text "60Ã Flip 4 coins. This attack does 60 damage for each heads."
		energyCost C,C,C
	}
};
case PORYGON_154:
return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Digicharge" , {
		text "Flip 3 coins. For each heads, search your deck for an Energy card, reveal it, and put it into your hand. Then, shuffle your deck.\n"
		energyCost C
	}
	move "Sharp Point" , {
		text "10 damage"
		energyCost C
	}
};
case PORYGON_155:
return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Quick Draw" , {
		text "Draw a card.\n"
		energyCost C
	}
	move "Ram" , {
		text "20 damage"
		energyCost C,C
	}
};
case PORYGON2_156:
return 	evolution (this, from:"Porygon", hp:HP080, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	move "Double Draw" , {
		text "Draw 2 cards.\n"
		energyCost C
	}
	move "Spinning Attack" , {
		text "30 damage"
		energyCost C,C
	}
};
case PORYGON_Z_157:
return 	evolution (this, from:"Porygon2", hp:HP130, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	bwAbility "Crazy Code" , {
		text "As often as you like during your turn (before your attack), you may attach a Special Energy card from your hand to 1 of your Pokémon."
	}
	move "Tantrum" , {
		text "120 This Pokémon is now Confused."
		energyCost C,C,C
	}
};
case SNORLAX_158:
return basic (this, hp:HP150, type:COLORLESS, retreatCost:4) {
	weakness FIGHTING
	bwAbility "Lazy Eating" , {
		text "Between turns, heal 10 damage from this Pokémon."
	}
	move "Big Counter" , {
		text "60+ If your opponent's Active Pokémon is a TAG TEAM, this attack does 120 more damage."
		energyCost C,C,C
	}
};
case GLAMEOW_159:
return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
	weakness FIGHTING
	move "Caturday" , {
		text "Draw a card. If you do, this Pokémon is now Asleep.\n"
		energyCost C
	}
	move "Boing Boing Tail" , {
		text "This attack does 60 damage to 1 of your opponent's Pokémon-GX or Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)"
		energyCost C,C,C
	}
};
case PURUGLY_160:
return 	evolution (this, from:"Glameow", hp:HP120, type:COLORLESS, retreatCost:3) {
	weakness FIGHTING
	move "Stray Cat Dash" , {
		text "30 Discard a random card from your opponent's hand. If this Pokémon evolved from Glameow during this turn, discard 2 cards instead of 1.\n"
		energyCost C,C
	}
	move "Lunge Out" , {
		text "80 damage"
		energyCost C,C,C
	}
};
case HAPPINY_161:
return basic (this, hp:HP060, type:COLORLESS, retreatCost:0) {
	bwAbility "Playhouse Heal" , {
		text "Once during your turn (before your attack), you may flip a coin. If heads, heal 60 damage from 1 of your Pokémon. If you use this Ability, your turn ends.<p class="weakness-resistance-retreat-cost">weakness:<br>resistance:<br>retreat: <a href="https://pkmncards.com/retreat-cost/zero/" class="retreat-cost">0<p class="artist-set"><a href="https://pkmncards.com/set/unbroken-bonds/" class="set"><abbr title="Unbroken Bonds">UNB <a href="https://pkmncards.com/number/161/" class="number">161 <a href="https://pkmncards.com/rarity/uncommon/" class="rarity"><abbr title="Uncommon">U</p"
	}
};
case CHATOT_162:
return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
	weakness LIGHTNING
	resistance , MINUS20
	move "Mimic" , {
		text "Shuffle your hand into your deck. Then, draw a card for each card in your opponent's hand.\n"
		energyCost C
	}
	move "Tone-Deaf" , {
		text "10 Your opponent's Active Pokémon is now Confused."
		energyCost C
	}
};
case CELESTEELA_GX_163:
return basic (this, hp:HP200, type:COLORLESS, retreatCost:4) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Force Canceler" , {
		text "As long as this Pokémon is your Active Pokémon, prevent all effects of your opponent's GX attacks, including damage, done to your Pokémon."
	}
	move "Power Cyclone" , {
		text "110 Move an Energy from this Pokémon to 1 of your Benched Pokémon.\n"
		energyCost C,C,C
	}
	move "Discovery GX" , {
		text "Count your Prize cards and put them into your hand. Then, take that many cards from the top of your deck and put them face down as your Prize cards. If you don't have that many cards in your deck, this attack does nothing. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C
	}
};
case BEAST_BRINGER_164:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf you have exactly 6 Prize cards remaining, and if your opponent's Active Pokémon-GX or Pokémon-EX is Knocked Out by damage from an attack of the Ultra Beast this card is attached to, take 1 more Prize card.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case CHIP_CHIP_ICE_AXE_165:
return itemCard (this) {
		text "Look at the top 3 cards of your opponent's deck and choose 1 of them. Your opponent shuffles the other cards back into their deck. Then, put the card you chose on top of their deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case DEVOLUTION_SPRAY_Z_166:
return itemCard (this) {
		text "Devolve 1 of your evolved Pokémon by shuffling any number of Evolution cards on it into your deck. (That Pokémon can't evolve this turn.)\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case DUSK_STONE_167:
return itemCard (this) {
		text "Search your deck for a Mismagius, Honchkrow, Chandelure, or Aegislash, including Pokémon-GX, that evolves from 1 of your Pokémon in play, and put it onto that Pokémon to evolve it. Then, shuffle your deck. You can use this card during your first turn or on a Pokémon that was put into play this turn.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case DUST_ISLAND_168:
return stadium(this) {
		text "Whenever either player switches their Poisoned Active Pokémon with 1 of their Benched Pokémon with the effect of a Trainer card, the new Active Pokémon is now affected by that Special Condition.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
};
case ELECTROMAGNETIC_RADAR_169:
return itemCard (this) {
		text "You can play this card only if you discard 2 other cards from your hand.\nSearch your deck for up to 2 in any combination of [L] Pokémon-GX and [L] Pokémon-EX, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case ENERGY_SPINNER_170:
return itemCard (this) {
		text "Search your deck for a basic Energy card, reveal it, and put it into your hand. If you go second and it's your first turn, search for up to 3 basic Energy cards instead of 1. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case FAIRY_CHARM_ABILITY_171:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's Pokémon-GX and Pokémon-EX that have Abilities.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case FAIRY_CHARM__172:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [L] Pokémon-GX and [L] Pokémon-EX.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case FIRE_CRYSTAL_173:
return itemCard (this) {
		text "Put 3 [R] Energy cards from your discard pile into your hand.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case GIOVANNIS_EXILE_174:
return supporter(this) {
		text "Discard up to 2 of your Benched Pokémon that have no damage counters on them and all cards attached to them.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case GREENS_EXPLORATION_175:
return supporter(this) {
		text "You can play this card only if you have no Pokémon with Abilities in play.\nSearch your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case JANINE_176:
return supporter(this) {
		text "Look at the top 4 cards of your deck and put 2 of them into your hand. Shuffle the other cards back into your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case KOGAS_TRAP_177:
return supporter(this) {
		text "Your opponent's Active Pokémon is now Confused and Poisoned.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case LT_SURGES_STRATEGY_178:
return supporter(this) {
		text "You can play this card only if you have more Prize cards remaining than your opponent.\nDuring this turn, you can play 3 Supporter cards (including this card).\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case MARTIAL_ARTS_DOJO_179:
return stadium(this) {
		text "The attacks of non-Ultra Beast Pokémon that have any basic [F] Energy attached to them (both yours and your opponent's) do 10 more damage to the opponent's Active Pokémon (before applying Weakness and Resistance). If the attacking player has more Prize cards remaining than their opponent, those attacks do 40 more damage instead.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
};
case METAL_CORE_BARRIER_180:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf this card is attached to 1 of your Pokémon, discard it at the end of your opponent's turn.\nThe [M] Pokémon this card is attached to takes 70 less damage from your opponent's attacks (after applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case MOLAYNE_181:
return supporter(this) {
		text "You can play this card only if you discard 2 [M] Energy cards from your hand.\nShuffle a Trainer card from your discard pile into your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case POKEGEAR_3_0_182:
return itemCard (this) {
		text "Look at the top 7 cards of your deck. You may reveal a Supporter card you find there and put it into your hand. Shuffle the other cards back into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case POWER_PLANT_183:
return stadium(this) {
		text "Pokémon-GX and Pokémon-EX in play (both yours and your opponent's) have no Abilities.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
};
case REDS_CHALLENGE_184:
return supporter(this) {
		text "You can play this card only if you discard 2 other cards from your hand.\nSearch your deck for a card and put it into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case SAMSON_OAK_185:
return supporter(this) {
		text "Draw 2 cards. If both Active Pokémon are the same type, draw 2 more cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case STEALTHY_HOOD_186:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all effects of your opponent's Abilities done to the Pokémon this card is attached to. Remove any such existing effects.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case SURPRISE_BOX_187:
return itemCard (this) {
		text "Put a card from your opponent's discard pile into their hand.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case ULTRA_FOREST_KARTENVOY_188:
return supporter(this) {
		text "During this turn, damage from your Ultra Beasts' attacks isn't affected by any effects on your opponent's Active Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case WELDER_189:
return supporter(this) {
		text "Attach up to 2 [R] Energy cards from your hand to 1 of your Pokémon. If you do, draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case TRIPLE_ACCELERATION_ENERGY_190:
return 	specialEnergy (this) {
		text ""
};
case PHEROMOSA_BUZZWOLE_GX_191:
return basic (this, hp:HP260, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Jet Punch" , {
		text "30 This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost G
	}
	move "Elegant Sole" , {
		text "190 During your next turn, this Pokémon's Elegant Sole attack's base damage is 60.\n"
		energyCost G,G,C
	}
	move "Beast Game GX" , {
		text "50 If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card. If this Pokémon has at least 7 extra Energy attached to it (in addition to this attack's cost), take 3 more Prize cards instead. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost G,+
	}
};
case PHEROMOSA_BUZZWOLE_GX_192:
return basic (this, hp:HP260, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Jet Punch" , {
		text "30 This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost G
	}
	move "Elegant Sole" , {
		text "190 During your next turn, this Pokémon's Elegant Sole attack's base damage is 60.\n"
		energyCost G,G,C
	}
	move "Beast Game GX" , {
		text "50 If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card. If this Pokémon has at least 7 extra Energy attached to it (in addition to this attack's cost), take 3 more Prize cards instead. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost G,+
	}
};
case VENOMOTH_GX_193:
return 	evolution (this, from:"Venonat", hp:HP200, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Shinobi Mastery" , {
		text "110+ If you played Koga's Trap from your hand during this turn, this attack does 90 more damage. If you played Janine from your hand during this turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon during your opponent's next turn.\n"
		energyCost G,C,C
	}
	move "Ten-Card Return GX" , {
		text "60 Shuffle your hand into your deck. Then, draw 10 cards. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C
	}
};
case RESHIRAM_CHARIZARD_GX_194:
return basic (this, hp:HP270, type:FIRE, retreatCost:3) {
	weakness WATER
	move "Outrage" , {
		text "30+ This attack does 10 more damage for each damage counter on this Pokémon.\n"
		energyCost R,C
	}
	move "Flare Strike" , {
		text "230 This Pokémon can't use Flare Strike during your next turn.\n"
		energyCost R,R,R,C
	}
	move "Double Blaze GX" , {
		text "200+ If this Pokémon has at least 3 extra"
		energyCost R,R,R,+
	}
};
case DEDENNE_GX_195:
return basic (this, hp:HP160, type:LIGHTNING, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Dedechange" , {
		text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard your hand and draw 6 cards. You can't use more than 1 Dedechange Ability each turn."
	}
	move "Static Shock" , {
		text "50\n"
		energyCost L,C
	}
	move "Tingly Return GX" , {
		text "50 Your opponent's Active Pokémon is now Paralyzed. Put this Pokémon and all cards attached to it into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost L,C
	}
};
case MUK_ALOLAN_MUK_GX_196:
return basic (this, hp:HP270, type:PSYCHIC, retreatCost:4) {
	weakness PSYCHIC
	move "Severe Poison" , {
		text "Your opponent's Active Pokémon is now Poisoned. Put 8 damage counters instead of 1 on that Pokémon between turns.\n"
		energyCost P,C,C
	}
	move "Poison Absorption" , {
		text "120 If your opponent's Active Pokémon is Poisoned, heal 100 damage from this Pokémon.\n[-][+] <span class="attack-name">Nasty Goo Mix GX Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost P,C,C,C
	}
	move "Nasty Goo Mix GX" , {
		text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
	}
};
case MUK_ALOLAN_MUK_GX_197:
return basic (this, hp:HP270, type:PSYCHIC, retreatCost:4) {
	weakness PSYCHIC
	move "Severe Poison" , {
		text "Your opponent's Active Pokémon is now Poisoned. Put 8 damage counters instead of 1 on that Pokémon between turns.\n"
		energyCost P,C,C
	}
	move "Poison Absorption" , {
		text "120 If your opponent's Active Pokémon is Poisoned, heal 100 damage from this Pokémon.\n[-][+] <span class="attack-name">Nasty Goo Mix GX Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost P,C,C,C
	}
	move "Nasty Goo Mix GX" , {
		text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
	}
};
case MARSHADOW_MACHAMP_GX_198:
return basic (this, hp:HP270, type:FIGHTING, retreatCost:3) {
	weakness PSYCHIC
	move "Revenge" , {
		text "30+ If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage.\n"
		energyCost F,C
	}
	move "Hundred-Blows Impact" , {
		text "160\n"
		energyCost F,F,C
	}
	move "Acme of Heroism GX" , {
		text "200 If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), and if it would be Knocked Out by damage from an opponent's attack during their next turn, it is not Knocked Out, and its remaining HP becomes 10. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost F,F,C,+
	}
};
case MARSHADOW_MACHAMP_GX_199:
return basic (this, hp:HP270, type:FIGHTING, retreatCost:3) {
	weakness PSYCHIC
	move "Revenge" , {
		text "30+ If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage.\n"
		energyCost F,C
	}
	move "Hundred-Blows Impact" , {
		text "160\n"
		energyCost F,F,C
	}
	move "Acme of Heroism GX" , {
		text "200 If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), and if it would be Knocked Out by damage from an opponent's attack during their next turn, it is not Knocked Out, and its remaining HP becomes 10. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost F,F,C,+
	}
};
case GRENINJA_ZOROARK_GX_200:
return basic (this, hp:HP250, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Dark Pulse" , {
		text "30+ This attack does 30 more damage times the amount of"
		energyCost D,C
	}
	move "Dark Union GX" , {
		text "Put 2 in any combination of"
		energyCost D,C,+
	}
};
case GRENINJA_ZOROARK_GX_201:
return basic (this, hp:HP250, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Dark Pulse" , {
		text "30+ This attack does 30 more damage times the amount of"
		energyCost D,C
	}
	move "Dark Union GX" , {
		text "Put 2 in any combination of"
		energyCost D,C,+
	}
};
case HONCHKROW_GX_202:
return 	evolution (this, from:"Murkrow", hp:HP210, type:DARKNESS, retreatCost:2) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Ruler of the Night" , {
		text "As long as this Pokémon is your Active Pokémon, your opponent can't play any Pokémon Tool, Special Energy, or Stadium cards from their hand."
	}
	move "Feather Storm" , {
		text "90 This attack does 30 damage to 2 of your opponent's Benched Pokémon-GX and Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost D,C,C
	}
	move "Unfair GX" , {
		text "Your opponent reveals their hand. Discard 2 cards from it. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C
	}
};
case LUCARIO_MELMETAL_GX_203:
return basic (this, hp:HP260, type:METAL, retreatCost:3) {
	weakness FIRE
	resistance , MINUS20
	move "Steel Fist" , {
		text "50 Search your deck for a"
		energyCost C,C
	}
	move "Heavy Impact" , {
		text "150\n"
		energyCost M,M,C,C
	}
	move "Full Metal Wall GX" , {
		text "For the rest of this game, your"
		energyCost C,+
	}
};
case GARDEVOIR_SYLVEON_GX_204:
return basic (this, hp:HP260, type:FAIRY, retreatCost:2) {
	weakness METAL
	resistance , MINUS20
	move "Fairy Song" , {
		text "Search your deck for up to 2"
		energyCost C
	}
	move "Kaleidostorm" , {
		text "150 Move any number of Energy from your Pokémon to your other Pokémon in any way you like.\n"
		energyCost Y,Y,C
	}
	move "Magical Miracle GX" , {
		text "200 If this Pokémon has at least 3 extra"
		energyCost Y,Y,Y,+
	}
};
case GARDEVOIR_SYLVEON_GX_205:
return basic (this, hp:HP260, type:FAIRY, retreatCost:2) {
	weakness METAL
	resistance , MINUS20
	move "Fairy Song" , {
		text "Search your deck for up to 2"
		energyCost C
	}
	move "Kaleidostorm" , {
		text "150 Move any number of Energy from your Pokémon to your other Pokémon in any way you like.\n"
		energyCost Y,Y,C
	}
	move "Magical Miracle GX" , {
		text "200 If this Pokémon has at least 3 extra"
		energyCost Y,Y,Y,+
	}
};
case WHIMSICOTT_GX_206:
return 	evolution (this, from:"Cottonee", hp:HP190, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	bwAbility "Fluffy Cotton" , {
		text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
	}
	move "Energy Blow" , {
		text "10+ This attack does 30 more damage times the amount of Energy attached to this Pokémon.\n"
		energyCost Y
	}
	move "Toy Box GX" , {
		text "Search your deck for up to 5 cards and put them into your hand. Then, shuffle your deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost Y
	}
};
case PERSIAN_GX_207:
return 	evolution (this, from:"Meowth", hp:HP200, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	bwAbility "Cat Walk" , {
		text "Once during your turn (before your attack), if 1 of your Pokémon-GX or Pokémon-EX was Knocked Out during your opponent's last turn, you may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck. You can't use more than 1 Cat Walk Ability each turn."
	}
	move "Vengeance" , {
		text "10+ This attack does 20 more damage for each Pokémon in your discard pile. You can't add more than 180 damage in this way.\n"
		energyCost C,C,C
	}
	move "Slash Back GX" , {
		text "150 Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C,C
	}
};
case CELESTEELA_GX_208:
return basic (this, hp:HP200, type:COLORLESS, retreatCost:4) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Force Canceler" , {
		text "As long as this Pokémon is your Active Pokémon, prevent all effects of your opponent's GX attacks, including damage, done to your Pokémon."
	}
	move "Power Cyclone" , {
		text "110 Move an Energy from this Pokémon to 1 of your Benched Pokémon.\n"
		energyCost C,C,C
	}
	move "Discovery GX" , {
		text "Count your Prize cards and put them into your hand. Then, take that many cards from the top of your deck and put them face down as your Prize cards. If you don't have that many cards in your deck, this attack does nothing. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C
	}
};
case GREENS_EXPLORATION_209:
return supporter(this) {
		text "You can play this card only if you have no Pokémon with Abilities in play.\nSearch your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case JANINE_210:
return supporter(this) {
		text "Look at the top 4 cards of your deck and put 2 of them into your hand. Shuffle the other cards back into your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case KOGAS_TRAP_211:
return supporter(this) {
		text "Your opponent's Active Pokémon is now Confused and Poisoned.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case MOLAYNE_212:
return supporter(this) {
		text "You can play this card only if you discard 2 [M] Energy cards from your hand.\nShuffle a Trainer card from your discard pile into your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case REDS_CHALLENGE_213:
return supporter(this) {
		text "You can play this card only if you discard 2 other cards from your hand.\nSearch your deck for a card and put it into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case WELDER_214:
return supporter(this) {
		text "Attach up to 2 [R] Energy cards from your hand to 1 of your Pokémon. If you do, draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
};
case PHEROMOSA_BUZZWOLE_GX_215:
return basic (this, hp:HP260, type:GRASS, retreatCost:2) {
	weakness FIRE
	move "Jet Punch" , {
		text "30 This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost G
	}
	move "Elegant Sole" , {
		text "190 During your next turn, this Pokémon's Elegant Sole attack's base damage is 60.\n"
		energyCost G,G,C
	}
	move "Beast Game GX" , {
		text "50 If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card. If this Pokémon has at least 7 extra Energy attached to it (in addition to this attack's cost), take 3 more Prize cards instead. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost G,+
	}
};
case VENOMOTH_GX_216:
return 	evolution (this, from:"Venonat", hp:HP200, type:GRASS, retreatCost:1) {
	weakness FIRE
	move "Shinobi Mastery" , {
		text "110+ If you played Koga's Trap from your hand during this turn, this attack does 90 more damage. If you played Janine from your hand during this turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon during your opponent's next turn.\n"
		energyCost G,C,C
	}
	move "Ten-Card Return GX" , {
		text "60 Shuffle your hand into your deck. Then, draw 10 cards. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C
	}
};
case RESHIRAM_CHARIZARD_GX_217:
return basic (this, hp:HP270, type:FIRE, retreatCost:3) {
	weakness WATER
	move "Outrage" , {
		text "30+ This attack does 10 more damage for each damage counter on this Pokémon.\n"
		energyCost R,C
	}
	move "Flare Strike" , {
		text "230 This Pokémon can't use Flare Strike during your next turn.\n"
		energyCost R,R,R,C
	}
	move "Double Blaze GX" , {
		text "200+ If this Pokémon has at least 3 extra"
		energyCost R,R,R,+
	}
};
case BLASTOISE_GX_218:
return 	evolution (this, from:"Wartortle", hp:HP240, type:WATER, retreatCost:3) {
	weakness GRASS
	bwAbility "Solid Shell" , {
		text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
	}
	move "Rocket Splash" , {
		text "60Ã Shuffle any amount of"
		energyCost W,W
	}
	move "Giant Geyser GX" , {
		text "Attach any number of"
		energyCost W
	}
};
case DEDENNE_GX_219:
return basic (this, hp:HP160, type:LIGHTNING, retreatCost:1) {
	weakness FIGHTING
	resistance , MINUS20
	bwAbility "Dedechange" , {
		text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard your hand and draw 6 cards. You can't use more than 1 Dedechange Ability each turn."
	}
	move "Static Shock" , {
		text "50\n"
		energyCost L,C
	}
	move "Tingly Return GX" , {
		text "50 Your opponent's Active Pokémon is now Paralyzed. Put this Pokémon and all cards attached to it into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost L,C
	}
};
case MUK_ALOLAN_MUK_GX_220:
return basic (this, hp:HP270, type:PSYCHIC, retreatCost:4) {
	weakness PSYCHIC
	move "Severe Poison" , {
		text "Your opponent's Active Pokémon is now Poisoned. Put 8 damage counters instead of 1 on that Pokémon between turns.\n"
		energyCost P,C,C
	}
	move "Poison Absorption" , {
		text "120 If your opponent's Active Pokémon is Poisoned, heal 100 damage from this Pokémon.\n[-][+] <span class="attack-name">Nasty Goo Mix GX Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost P,C,C,C
	}
	move "Nasty Goo Mix GX" , {
		text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), put 15 damage counters instead of 1 on that Pokémon between turns. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
	}
};
case MARSHADOW_MACHAMP_GX_221:
return basic (this, hp:HP270, type:FIGHTING, retreatCost:3) {
	weakness PSYCHIC
	move "Revenge" , {
		text "30+ If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage.\n"
		energyCost F,C
	}
	move "Hundred-Blows Impact" , {
		text "160\n"
		energyCost F,F,C
	}
	move "Acme of Heroism GX" , {
		text "200 If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), and if it would be Knocked Out by damage from an opponent's attack during their next turn, it is not Knocked Out, and its remaining HP becomes 10. (You can't use more than 1 GX attack in a game.)\nTAG TEAM rule: When your <a href="https://pkmncards.com/is/tag-team/" class="hidden">TAG TEAM is Knocked Out, your opponent takes 3 Prize cards."
		energyCost F,F,C,+
	}
};
case GRENINJA_ZOROARK_GX_222:
return basic (this, hp:HP250, type:DARKNESS, retreatCost:2) {
	weakness FIGHTING
	resistance , MINUS20
	move "Dark Pulse" , {
		text "30+ This attack does 30 more damage times the amount of"
		energyCost D,C
	}
	move "Dark Union GX" , {
		text "Put 2 in any combination of"
		energyCost D,C,+
	}
};
case HONCHKROW_GX_223:
return 	evolution (this, from:"Murkrow", hp:HP210, type:DARKNESS, retreatCost:2) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Ruler of the Night" , {
		text "As long as this Pokémon is your Active Pokémon, your opponent can't play any Pokémon Tool, Special Energy, or Stadium cards from their hand."
	}
	move "Feather Storm" , {
		text "90 This attack does 30 damage to 2 of your opponent's Benched Pokémon-GX and Pokémon-EX. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
		energyCost D,C,C
	}
	move "Unfair GX" , {
		text "Your opponent reveals their hand. Discard 2 cards from it. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C
	}
};
case LUCARIO_MELMETAL_GX_224:
return basic (this, hp:HP260, type:METAL, retreatCost:3) {
	weakness FIRE
	resistance , MINUS20
	move "Steel Fist" , {
		text "50 Search your deck for a"
		energyCost C,C
	}
	move "Heavy Impact" , {
		text "150\n"
		energyCost M,M,C,C
	}
	move "Full Metal Wall GX" , {
		text "For the rest of this game, your"
		energyCost C,+
	}
};
case GARDEVOIR_SYLVEON_GX_225:
return basic (this, hp:HP260, type:FAIRY, retreatCost:2) {
	weakness METAL
	resistance , MINUS20
	move "Fairy Song" , {
		text "Search your deck for up to 2"
		energyCost C
	}
	move "Kaleidostorm" , {
		text "150 Move any number of Energy from your Pokémon to your other Pokémon in any way you like.\n"
		energyCost Y,Y,C
	}
	move "Magical Miracle GX" , {
		text "200 If this Pokémon has at least 3 extra"
		energyCost Y,Y,Y,+
	}
};
case WHIMSICOTT_GX_226:
return 	evolution (this, from:"Cottonee", hp:HP190, type:FAIRY, retreatCost:1) {
	weakness METAL
	resistance , MINUS20
	bwAbility "Fluffy Cotton" , {
		text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
	}
	move "Energy Blow" , {
		text "10+ This attack does 30 more damage times the amount of Energy attached to this Pokémon.\n"
		energyCost Y
	}
	move "Toy Box GX" , {
		text "Search your deck for up to 5 cards and put them into your hand. Then, shuffle your deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost Y
	}
};
case PERSIAN_GX_227:
return 	evolution (this, from:"Meowth", hp:HP200, type:COLORLESS, retreatCost:2) {
	weakness FIGHTING
	bwAbility "Cat Walk" , {
		text "Once during your turn (before your attack), if 1 of your Pokémon-GX or Pokémon-EX was Knocked Out during your opponent's last turn, you may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck. You can't use more than 1 Cat Walk Ability each turn."
	}
	move "Vengeance" , {
		text "10+ This attack does 20 more damage for each Pokémon in your discard pile. You can't add more than 180 damage in this way.\n"
		energyCost C,C,C
	}
	move "Slash Back GX" , {
		text "150 Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C,C,C
	}
};
case CELESTEELA_GX_228:
return basic (this, hp:HP200, type:COLORLESS, retreatCost:4) {
	weakness LIGHTNING
	resistance , MINUS20
	bwAbility "Force Canceler" , {
		text "As long as this Pokémon is your Active Pokémon, prevent all effects of your opponent's GX attacks, including damage, done to your Pokémon."
	}
	move "Power Cyclone" , {
		text "110 Move an Energy from this Pokémon to 1 of your Benched Pokémon.\n"
		energyCost C,C,C
	}
	move "Discovery GX" , {
		text "Count your Prize cards and put them into your hand. Then, take that many cards from the top of your deck and put them face down as your Prize cards. If you don't have that many cards in your deck, this attack does nothing. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
		energyCost C
	}
};
case BEAST_BRINGER_229:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf you have exactly 6 Prize cards remaining, and if your opponent's Active Pokémon-GX or Pokémon-EX is Knocked Out by damage from an attack of the Ultra Beast this card is attached to, take 1 more Prize card.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case ELECTROMAGNETIC_RADAR_230:
return itemCard (this) {
		text "You can play this card only if you discard 2 other cards from your hand.\nSearch your deck for up to 2 in any combination of [L] Pokémon-GX and [L] Pokémon-EX, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case FIRE_CRYSTAL_231:
return itemCard (this) {
		text "Put 3 [R] Energy cards from your discard pile into your hand.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case METAL_CORE_BARRIER_232:
return itemCard (this) {
		text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf this card is attached to 1 of your Pokémon, discard it at the end of your opponent's turn.\nThe [M] Pokémon this card is attached to takes 70 less damage from your opponent's attacks (after applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
};
case POKEGEAR_3_0_233:
return itemCard (this) {
		text "Look at the top 7 cards of your deck. You may reveal a Supporter card you find there and put it into your hand. Shuffle the other cards back into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
};
mac
