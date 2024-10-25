package tcgwars.logic.impl.gen8

import tcgwars.logic.impl.gen5.BoundariesCrossed;

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
public enum ShiningFates implements LogicCardInfo {

  YANMA_1 ("Yanma", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  YANMEGA_2 ("Yanmega", "2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CELEBI_3 ("Celebi", "3", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  CACNEA_4 ("Cacnea", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TROPIUS_5 ("Tropius", "5", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  ROWLET_6 ("Rowlet", "6", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_7 ("Dartrix", "7", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_8 ("Decidueye", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DHELMISE_V_9 ("Dhelmise V", "9", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  DHELMISE_VMAX_10 ("Dhelmise VMAX", "10", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  GROOKEY_11 ("Grookey", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  THWACKEY_12 ("Thwackey", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RILLABOOM_13 ("Rillaboom", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GOSSIFLEUR_14 ("Gossifleur", "14", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_15 ("Eldegoss", "15", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ZARUDE_16 ("Zarude", "16", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  RESHIRAM_17 ("Reshiram", "17", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  CINDERACE_V_18 ("Cinderace V", "18", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CINDERACE_VMAX_19 ("Cinderace VMAX", "19", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIRE_]),
  HORSEA_20 ("Horsea", "20", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  KYOGRE_21 ("Kyogre", "21", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  BUIZEL_22 ("Buizel", "22", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  FLOATZEL_23 ("Floatzel", "23", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MANAPHY_24 ("Manaphy", "24", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  VOLCANION_25 ("Volcanion", "25", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  CHEWTLE_26 ("Chewtle", "26", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DREDNAW_27 ("Drednaw", "27", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRAMORANT_28 ("Cramorant", "28", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  SNOM_29 ("Snom", "29", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  FROSMOTH_30 ("Frosmoth", "30", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SHINX_31 ("Shinx", "31", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  LUXIO_32 ("Luxio", "32", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LUXRAY_33 ("Luxray", "33", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ROTOM_34 ("Rotom", "34", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_35 ("Morpeko", "35", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_36 ("Morpeko", "36", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_V_37 ("Morpeko V", "37", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  MORPEKO_VMAX_38 ("Morpeko VMAX", "38", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  INDEEDEE_V_39 ("Indeedee V", "39", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  TRAPINCH_40 ("Trapinch", "40", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_41 ("Koffing", "41", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_WEEZING_42 ("Galarian Weezing", "42", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPINARAK_43 ("Spinarak", "43", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  CROBAT_V_44 ("Crobat V", "44", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  CROBAT_VMAX_45 ("Crobat VMAX", "45", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  YVELTAL_46 ("Yveltal", "46", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_47 ("Nickit", "47", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_48 ("Thievul", "48", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CUFANT_49 ("Cufant", "49", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  DITTO_V_50 ("Ditto V", "50", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  DITTO_VMAX_51 ("Ditto VMAX", "51", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  EEVEE_52 ("Eevee", "52", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_V_53 ("Greedent V", "53", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CRAMORANT_V_54 ("Cramorant V", "54", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CRAMORANT_VMAX_55 ("Cramorant VMAX", "55", Rarity.RARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  INDEEDEE_56 ("Indeedee", "56", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  BALL_GUY_57 ("Ball Guy", "57", Rarity.SECRET, [TRAINER, SUPPORTER]),
  BOSS_S_ORDERS_58 ("Boss's Orders", "58", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  GYM_TRAINER_59 ("Gym Trainer", "59", Rarity.SECRET, [TRAINER, SUPPORTER]),
  PROFESSOR_S_RESEARCH_60 ("Professor's Research", "60", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  RUSTED_SHIELD_61 ("Rusted Shield", "61", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  RUSTED_SWORD_62 ("Rusted Sword", "62", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  TEAM_YELL_TOWEL_63 ("Team Yell Towel", "63", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ALCREMIE_V_64 ("Alcremie V", "64", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  BALL_GUY_65 ("Ball Guy", "65", Rarity.SECRET, [TRAINER, SUPPORTER]),
  BIRD_KEEPER_66 ("Bird Keeper", "66", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CARA_LISS_67 ("Cara Liss", "67", Rarity.SECRET, [TRAINER, SUPPORTER]),
  GYM_TRAINER_68 ("Gym Trainer", "68", Rarity.SECRET, [TRAINER, SUPPORTER]),
  PIERS_69 ("Piers", "69", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKE_KID_70 ("Poké Kid", "70", Rarity.SECRET, [TRAINER, SUPPORTER]),
  ROSE_71 ("Rose", "71", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SKYLA_72 ("Skyla", "72", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALCREMIE_VMAX_73 ("Alcremie VMAX", "73", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  ROWLET_SV1 ("Rowlet", "SV1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_SV2 ("Dartrix", "SV2", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_SV3 ("Decidueye", "SV3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GROOKEY_SV4 ("Grookey", "SV4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  THWACKEY_SV5 ("Thwackey", "SV5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RILLABOOM_SV6 ("Rillaboom", "SV6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BLIPBUG_SV7 ("Blipbug", "SV7", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DOTTLER_SV8 ("Dottler", "SV8", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ORBEETLE_SV9 ("Orbeetle", "SV9", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GOSSIFLEUR_SV10 ("Gossifleur", "SV10", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_SV11 ("Eldegoss", "SV11", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  APPLIN_SV12 ("Applin", "SV12", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  FLAPPLE_SV13 ("Flapple", "SV13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  APPLETUN_SV14 ("Appletun", "SV14", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SCORBUNNY_SV15 ("Scorbunny", "SV15", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  RABOOT_SV16 ("Raboot", "SV16", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CINDERACE_SV17 ("Cinderace", "SV17", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  SIZZLIPEDE_SV18 ("Sizzlipede", "SV18", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CENTISKORCH_SV19 ("Centiskorch", "SV19", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GALARIAN_MR_MIME_SV20 ("Galarian Mr. Mime", "SV20", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_SV21 ("Galarian Mr. Rime", "SV21", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SUICUNE_SV22 ("Suicune", "SV22", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARUMAKA_SV23 ("Galarian Darumaka", "SV23", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_SV24 ("Galarian Darmanitan", "SV24", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SOBBLE_SV25 ("Sobble", "SV25", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DRIZZILE_SV26 ("Drizzile", "SV26", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  INTELEON_SV27 ("Inteleon", "SV27", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CHEWTLE_SV28 ("Chewtle", "SV28", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DREDNAW_SV29 ("Drednaw", "SV29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRAMORANT_SV30 ("Cramorant", "SV30", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  ARROKUDA_SV31 ("Arrokuda", "SV31", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BARRASKEWDA_SV32 ("Barraskewda", "SV32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SNOM_SV33 ("Snom", "SV33", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  FROSMOTH_SV34 ("Frosmoth", "SV34", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  EISCUE_SV35 ("Eiscue", "SV35", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  DRACOVISH_SV36 ("Dracovish", "SV36", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ARCTOVISH_SV37 ("Arctovish", "SV37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ROTOM_SV38 ("Rotom", "SV38", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  YAMPER_SV39 ("Yamper", "SV39", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  BOLTUND_SV40 ("Boltund", "SV40", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TOXEL_SV41 ("Toxel", "SV41", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_SV42 ("Toxtricity", "SV42", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PINCURCHIN_SV43 ("Pincurchin", "SV43", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MORPEKO_SV44 ("Morpeko", "SV44", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DRACOZOLT_SV45 ("Dracozolt", "SV45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ARCTOZOLT_SV46 ("Arctozolt", "SV46", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  GALARIAN_PONYTA_SV47 ("Galarian Ponyta", "SV47", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GALARIAN_RAPIDASH_SV48 ("Galarian Rapidash", "SV48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_CORSOLA_SV49 ("Galarian Corsola", "SV49", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GALARIAN_CURSOLA_SV50 ("Galarian Cursola", "SV50", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DEDENNE_SV51 ("Dedenne", "SV51", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SINISTEA_SV52 ("Sinistea", "SV52", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_SV53 ("Polteageist", "SV53", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATENNA_SV54 ("Hatenna", "SV54", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HATTREM_SV55 ("Hattrem", "SV55", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATTERENE_SV56 ("Hatterene", "SV56", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MILCERY_SV57 ("Milcery", "SV57", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ALCREMIE_SV58 ("Alcremie", "SV58", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  INDEEDEE_SV59 ("Indeedee", "SV59", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DREEPY_SV60 ("Dreepy", "SV60", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DRAKLOAK_SV61 ("Drakloak", "SV61", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DRAGAPULT_SV62 ("Dragapult", "SV62", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GALARIAN_FARFETCH_D_SV63 ("Galarian Farfetch'd", "SV63", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_SV64 ("Galarian Sirfetch'd", "SV64", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_YAMASK_SV65 ("Galarian Yamask", "SV65", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_RUNERIGUS_SV66 ("Galarian Runerigus", "SV66", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ROLYCOLY_SV67 ("Rolycoly", "SV67", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CARKOL_SV68 ("Carkol", "SV68", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  COALOSSAL_SV69 ("Coalossal", "SV69", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SILICOBRA_SV70 ("Silicobra", "SV70", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDACONDA_SV71 ("Sandaconda", "SV71", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CLOBBOPUS_SV72 ("Clobbopus", "SV72", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_SV73 ("Grapploct", "SV73", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FALINKS_SV74 ("Falinks", "SV74", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  STONJOURNER_SV75 ("Stonjourner", "SV75", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_SV76 ("Koffing", "SV76", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_WEEZING_SV77 ("Galarian Weezing", "SV77", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_ZIGZAGOON_SV78 ("Galarian Zigzagoon", "SV78", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_LINOONE_SV79 ("Galarian Linoone", "SV79", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_OBSTAGOON_SV80 ("Galarian Obstagoon", "SV80", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  NICKIT_SV81 ("Nickit", "SV81", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_SV82 ("Thievul", "SV82", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  IMPIDIMP_SV83 ("Impidimp", "SV83", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MORGREM_SV84 ("Morgrem", "SV84", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_SV85 ("Grimmsnarl", "SV85", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  GALARIAN_MEOWTH_SV86 ("Galarian Meowth", "SV86", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_SV87 ("Galarian Perrserker", "SV87", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GALARIAN_STUNFISK_SV88 ("Galarian Stunfisk", "SV88", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  CORVIKNIGHT_SV89 ("Corviknight", "SV89", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  CUFANT_SV90 ("Cufant", "SV90", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_SV91 ("Copperajah", "SV91", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  DURALUDON_SV92 ("Duraludon", "SV92", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  MINCCINO_SV93 ("Minccino", "SV93", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CINCCINO_SV94 ("Cinccino", "SV94", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUCKLETT_SV95 ("Ducklett", "SV95", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SWANNA_SV96 ("Swanna", "SV96", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BUNNELBY_SV97 ("Bunnelby", "SV97", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  ORANGURU_SV98 ("Oranguru", "SV98", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SKWOVET_SV99 ("Skwovet", "SV99", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_SV100 ("Greedent", "SV100", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ROOKIDEE_SV101 ("Rookidee", "SV101", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CORVISQUIRE_SV102 ("Corvisquire", "SV102", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WOOLOO_SV103 ("Wooloo", "SV103", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DUBWOOL_SV104 ("Dubwool", "SV104", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  RILLABOOM_V_SV105 ("Rillaboom V", "SV105", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  RILLABOOM_VMAX_SV106 ("Rillaboom VMAX", "SV106", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  CHARIZARD_VMAX_SV107 ("Charizard VMAX", "SV107", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIRE_]),
  CENTISKORCH_V_SV108 ("Centiskorch V", "SV108", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CENTISKORCH_VMAX_SV109 ("Centiskorch VMAX", "SV109", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIRE_]),
  LAPRAS_V_SV110 ("Lapras V", "SV110", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  LAPRAS_VMAX_SV111 ("Lapras VMAX", "SV111", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  TOXTRICITY_V_SV112 ("Toxtricity V", "SV112", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TOXTRICITY_VMAX_SV113 ("Toxtricity VMAX", "SV113", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  INDEEDEE_V_SV114 ("Indeedee V", "SV114", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  FALINKS_V_SV115 ("Falinks V", "SV115", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  GRIMMSNARL_V_SV116 ("Grimmsnarl V", "SV116", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GRIMMSNARL_VMAX_SV117 ("Grimmsnarl VMAX", "SV117", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  DITTO_V_SV118 ("Ditto V", "SV118", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  DITTO_VMAX_SV119 ("Ditto VMAX", "SV119", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  DUBWOOL_V_SV120 ("Dubwool V", "SV120", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  ETERNATUS_V_SV121 ("Eternatus V", "SV121", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  ETERNATUS_VMAX_SV122 ("Eternatus VMAX", "SV122", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  ShiningFates(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SHINING_FATES;
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
      case YANMA_1:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Wing Attack", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case YANMEGA_2:
      return evolution (this, from:"Yanma", hp:HP120, type:G, retreatCost:0) {
        weakness R
        move "Bug Bite", {
          text "30 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Nosedive", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 120
            damage 30, self
          }
        }
      };
      case CELEBI_3:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        bwAbility "Woodland Stroll", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 6 cards of your deck, reveal an Energy card you find there, and put it into your hand. Shuffle the other cards back into your deck."
          actionA {
            checkLastTurn()
            assert self.active : "$self is not your active Pokémon"
            assert my.deck : "There are no more cards in your deck"
            powerUsed()
            my.deck.subList(0, 6).select(min:0,"Choose the card to put in your hand", cardTypeFilter(ENERGY)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Leaf Step", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CACNEA_4:
      return basic (this, hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Pierce", {
          text "50 damage."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TROPIUS_5:
      return basic (this, hp:HP110, type:G, retreatCost:1) {
        weakness R
        move "Attach Leaves", {
          text "Attach up to 2 [G] Energy cards from your discard pile to your Benched Pokémon in any way you like."
          energyCost C
          attackRequirement {
            assert my.discard.filterByEnergyType(G) : "No [G] Energy in the discard pile"
          }
          onAttack {
            def list = my.discard.filterByEnergyType(G)
            list.select(max:2).each {
              attachEnergy(my.all.select("Attach $it to?"), it)
            }
          }
        }
        move "Gust", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ROWLET_6:
        return copy (DarknessAblaze.ROWLET_11, this);
      case DARTRIX_7:
        return copy (DarknessAblaze.DARTRIX_12, this);
      case DECIDUEYE_8:
        return copy (DarknessAblaze.DECIDUEYE_13, this);
      case DHELMISE_V_9:
        return copy (SwordShield.DHELMISE_V_9, this);
      case DHELMISE_VMAX_10:
      return evolution (this, from:"Dhelmise V", hp:HP330, type:G, retreatCost:3) {
        weakness R
        move "Swinging Chain", {
          text "This attack does 30 damage to 1 of your opponent's Pokémon for each [G] Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30 * self.cards.energyCount(G), opp.all.select(text)
          }
        }
        move "Max Anchor", {
          text "240 damage. During your next turn, this Pokémon can't use Max Anchor."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 240
            cantUseAttack thisMove, self
          }
        }
      };
      case GROOKEY_11:
        return copy (SwordShield.GROOKEY_10, this);
      case THWACKEY_12:
        return copy (ShinyStarV.THWACKEY_1, this);
      case RILLABOOM_13:
        return copy (SwordShield.RILLABOOM_14, this);
      case GOSSIFLEUR_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Leafage", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELDEGOSS_15:
      return evolution (this, from:"Gossifleur", hp:HP090, type:G, retreatCost:1) {
        weakness R
        move "Enriching Seeds", {
          text "Heal all damage from 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {
            assert bench.findAll { it.numberOfDamageCounters > 0 } : "No damaged Pokémon"
          }
          onAttack {
            healAll(bench.findAll { it.numberOfDamageCounters > 0 }.select(text))
          }
        }
        move "Surprise Attack", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          attackRequirement {}
          onAttack {
            flip { damage 50 }
          }
        }
      };
      case ZARUDE_16:
      return basic (this, hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Suctioning Vines", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
            heal 30, self
          }
        }
        move "Jungle Blast", {
          text "110 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case RESHIRAM_17:
        return copy (ShinyStarV.RESHIRAM_2, this);
      case CINDERACE_V_18:
        return copy (SwordShieldPromos.CINDERACE_V_SWSH15, this);
      case CINDERACE_VMAX_19:
        return copy (RebelClash.CINDERACE_VMAX_36, this);
      case HORSEA_20:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Water Gun", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KYOGRE_21:
        return copy (ShinyStarV.KYOGRE_3, this);
      case BUIZEL_22:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
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
      case FLOATZEL_23:
      return evolution (this, from:"Buizel", hp:HP110, type:W, retreatCost:1) {
        weakness L
        move "Surf", {
          text "50 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MANAPHY_24:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        bwAbility "Ocean Search", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 6 cards of your deck, reveal a Pokémon you find there, and put it into your hand. Shuffle the other cards back into your deck."
          actionA {
            checkLastTurn()
            assert self.active : "$self is not your active Pokémon"
            assert my.deck : "There are no more cards in your deck"
            powerUsed()
            my.deck.subList(0, 6).select(min:0,"Choose the card to put in your hand", cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Wave Splash", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VOLCANION_25:
      return basic (this, hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Hammer In", {
          text "50 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Dynamite Steam", {
          text "120× damage. Flip 2 coins. This attack does 120 damage for each heads."
          energyCost W, W, W, C
          attackRequirement {}
          onAttack {
            flip 2, { damage 120 }
          }
        }
      };
      case CHEWTLE_26:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Tackle", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DREDNAW_27:
      return evolution (this, from:"Chewtle", hp:HP140, type:W, retreatCost:3) {
        weakness L
        bwAbility "Exoskeleton", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.notNoEffect && it.dmg.value) {
                  bc "Exoskeleton -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Skull Bash", {
          text "130 damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case CRAMORANT_28:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Spit-Out Shot", {
          text "This attack does 50 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W
          attackRequirement {
            assert opp.bench : "Opponent's Bench is empty"
          }
          onAttack {
            damage 50, opp.bench.select(text)
          }
        }
      };
      case SNOM_29:
        return copy (ShinyStarV.SNOM_4, this);
      case FROSMOTH_30:
        return copy (SwordShield.FROSMOTH_64, this);
      case SHINX_31:
        return copy (RebelClash.SHINX_60, this);
      case LUXIO_32:
        return copy (RebelClash.LUXIO_61, this);
      case LUXRAY_33:
        return copy (RebelClash.LUXRAY_62, this);
      case ROTOM_34:
        return copy (ShinyStarV.ROTOM_5, this);
      case MORPEKO_35:
        return copy (SwordShieldPromos.MORPEKO_SWSH31, this);
      case MORPEKO_36:
        return copy (MORPEKO_35, this);
      case MORPEKO_V_37:
        return copy (SwordShield.MORPEKO_V_79, this);
      case MORPEKO_VMAX_38:
        return copy (SwordShield.MORPEKO_VMAX_80, this);
      case INDEEDEE_V_39:
        return copy (SwordShield.INDEEDEE_V_91, this);
      case TRAPINCH_40:
        return copy (DarknessAblaze.TRAPINCH_89, this);
      case KOFFING_41:
        return copy (ShinyStarV.KOFFING_6, this);
      case GALARIAN_WEEZING_42:
        return copy (RebelClash.GALARIAN_WEEZING_113, this);
      case SPINARAK_43:
        return copy (DarknessAblaze.SPINARAK_102, this);
      case CROBAT_V_44:
        return copy (DarknessAblaze.CROBAT_V_104, this);
      case CROBAT_VMAX_45:
        return copy (ShinyStarV.CROBAT_VMAX_7, this);
      case YVELTAL_46:
        return copy (ShinyStarV.YVELTAL_8, this);
      case NICKIT_47:
        return copy (SwordShield.NICKIT_125, this);
      case THIEVUL_48:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Call for Goons", {
          text "Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert bench.notFull : "Bench is full"
            assert deck.notEmpty : "Deck is empty"
          }
          onAttack {
            int count = Math.min(bench.freeBenchCount, 3)
            deck.search (max: count, cardTypeFilter(BASIC)).each {
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Corner", {
          text "80 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
            cantRetreat(defending)
          }
        }
      };
      case CUFANT_49:
        return copy (DarknessAblaze.CUFANT_131, this);
      case DITTO_V_50:
        return copy (ShinyStarV.DITTO_V_9, this);
      case DITTO_VMAX_51:
        return copy (ShinyStarV.DITTO_VMAX_10, this);
      case EEVEE_52:
        return copy (SwordShieldPromos.EEVEE_SWSH42, this);
      case GREEDENT_V_53:
      return basic (this, hp:HP200, type:C, retreatCost:2) {
        weakness F
        move "Crunch", {
          text "40 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
            discardDefendingEnergyAfterDamage()
           }
        }
        move "Stumbling Press", {
          text "180 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip { damage 180 }
          }
        }
      };
      case CRAMORANT_V_54:
        return copy (SwordShield.CRAMORANT_V_155, this);
      case CRAMORANT_VMAX_55:
      return evolution (this, from:"Cramorant V", hp:HP320, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Max Jet", {
          text "80× damage. Flip a coin for each Energy attached to this Pokémon. This attack does 80 damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip self.cards.energyCount(C), { damage 80 }
          }
        }
      };
      case INDEEDEE_56:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Helping Hand", {
          text "Search your deck for a basic Energy card and attach it to 1 of your Benched Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert deck.notEmpty : "Deck is empty"
            assert bench.notEmpty : "Bench is full"
          }
          onAttack {
            def list = deck.search(cardTypeFilter(BASIC_ENERGY))
            if (list) {
              attachEnergy(bench.select(text), list.first())
            }
            shuffleDeck()
          }
        }
        move "Psychic", {
          text "20+ damage. This attack does 20 more damage for each Energy attached to your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20 + 20 * defending.cards.energyCount(C)
          }
        }
      };
      case BALL_GUY_57:
        return copy (ShinyStarV.BALL_GUY_14, this);
      case BOSS_S_ORDERS_58:
        return copy (RebelClash.BOSS_S_ORDERS_154, this);
      case GYM_TRAINER_59:
      return supporter (this) {
        text "Draw 2 cards. If any of your Pokémon were Knocked Out during your opponent's last turn, draw 2 more cards."
        initHook { Card thisCard->
          delayed {
            before KNOCKOUT, {
              if (ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite) {
                keyStore("Gym_Trainer_KO$thisCard.player", thisCard, bg.turnCount)
              }
            }
          }
        }
        onPlay {
          draw 2
          if (keyStore("Gym_Trainer_KO$thisCard.player", thisCard, null) == bg.turnCount - 1) {
            draw 2
          }
        }
        playRequirement{
          assert my.deck : "Deck is empty"
        }
      };
      case PROFESSOR_S_RESEARCH_60:
        return copy (SwordShield.PROFESSOR_S_RESEARCH_178, this);
      case RUSTED_SHIELD_61:
        return copy (ShinyStarV.RUSTED_SHIELD_13, this);
      case RUSTED_SWORD_62:
        return copy (ShinyStarV.RUSTED_SWORD_12, this);
      case TEAM_YELL_TOWEL_63:
        return copy (ShinyStarV.TEAM_YELL_S_CHEERING_TOWEL_11, this);
      case ALCREMIE_V_64:
        return copy (ChampionsPath.ALCREMIE_V_22, this);
      case BALL_GUY_65:
        return copy (BALL_GUY_57, this);
      case BIRD_KEEPER_66:
        return copy (DarknessAblaze.BIRD_KEEPER_159, this);
      case CARA_LISS_67:
        return copy (VividVoltage.CARA_LISS_149, this);
      case GYM_TRAINER_68:
        return copy (GYM_TRAINER_59, this);
      case PIERS_69:
        return copy (DarknessAblaze.PIERS_165, this);
      case POKE_KID_70:
        return copy (SwordShield.POKE_KID_173, this);
      case ROSE_71:
        return copy (DarknessAblaze.ROSE_168, this);
      case SKYLA_72:
        return copy (BoundariesCrossed.SKYLA_134, this);
      case ALCREMIE_VMAX_73:
        return copy (ChampionsPath.ALCREMIE_VMAX_23, this);
      case ROWLET_SV1:
        return copy (ROWLET_6, this);
      case DARTRIX_SV2:
        return copy (DARTRIX_7, this);
      case DECIDUEYE_SV3:
        return copy (DECIDUEYE_8, this);
      case GROOKEY_SV4:
        return copy (GROOKEY_11, this);
      case THWACKEY_SV5:
        return copy (THWACKEY_12, this);
      case RILLABOOM_SV6:
        return copy (RILLABOOM_13, this);
      case BLIPBUG_SV7:
        return copy (SwordShield.BLIPBUG_16, this);
      case DOTTLER_SV8:
        return copy (SwordShield.DOTTLER_18, this);
      case ORBEETLE_SV9:
        return copy (SwordShield.ORBEETLE_19, this);
      case GOSSIFLEUR_SV10:
        return copy (SwordShield.GOSSIFLEUR_20, this);
      case ELDEGOSS_SV11:
        return copy (SwordShield.ELDEGOSS_21, this);
      case APPLIN_SV12:
        return copy (RebelClash.APPLIN_21, this);
      case FLAPPLE_SV13:
        return copy (RebelClash.FLAPPLE_22, this);
      case APPLETUN_SV14:
        return copy (RebelClash.APPLETUN_23, this);
      case SCORBUNNY_SV15:
        return copy (SwordShield.SCORBUNNY_30, this);
      case RABOOT_SV16:
        return copy (SwordShield.RABOOT_32, this);
      case CINDERACE_SV17:
        return copy (SwordShield.CINDERACE_34, this);
      case SIZZLIPEDE_SV18:
        return copy (SwordShield.SIZZLIPEDE_37, this);
      case CENTISKORCH_SV19:
        return copy (SwordShield.CENTISKORCH_39, this);
      case GALARIAN_MR_MIME_SV20:
        return copy (DarknessAblaze.GALARIAN_MR_MIME_35, this);
      case GALARIAN_MR_RIME_SV21:
        return copy (DarknessAblaze.GALARIAN_MR_RIME_36, this);
      case SUICUNE_SV22:
        return copy (DarknessAblaze.SUICUNE_37, this);
      case GALARIAN_DARUMAKA_SV23:
        return copy (RebelClash.GALARIAN_DARUMAKA_47, this);
      case GALARIAN_DARMANITAN_SV24:
        return copy (RebelClash.GALARIAN_DARMANITAN_48, this);
      case SOBBLE_SV25:
        return copy (SwordShield.SOBBLE_54, this);
      case DRIZZILE_SV26:
        return copy (SwordShield.DRIZZILE_56, this);
      case INTELEON_SV27:
        return copy (SwordShield.INTELEON_58, this);
      case CHEWTLE_SV28:
        return copy (SwordShield.CHEWTLE_60, this);
      case DREDNAW_SV29:
        return copy (SwordShield.DREDNAW_61, this);
      case CRAMORANT_SV30:
        return copy (RebelClash.CRAMORANT_51, this);
      case ARROKUDA_SV31:
        return copy (RebelClash.ARROKUDA_52, this);
      case BARRASKEWDA_SV32:
        return copy (RebelClash.BARRASKEWDA_53, this);
      case SNOM_SV33:
        return copy (SNOM_29, this);
      case FROSMOTH_SV34:
        return copy (FROSMOTH_30, this);
      case EISCUE_SV35:
        return copy (RebelClash.EISCUE_54, this);
      case DRACOVISH_SV36:
        return copy (DarknessAblaze.DRACOVISH_53, this);
      case ARCTOVISH_SV37:
        return copy (DarknessAblaze.ARCTOVISH_54, this);
      case ROTOM_SV38:
        return copy (ROTOM_34, this);
      case YAMPER_SV39:
        return copy (SwordShield.YAMPER_73, this);
      case BOLTUND_SV40:
        return copy (SwordShield.BOLTUND_75, this);
      case TOXEL_SV41:
        return copy (DarknessAblaze.TOXEL_62, this);
      case TOXTRICITY_SV42:
        return copy (DarknessAblaze.TOXTRICITY_63, this);
      case PINCURCHIN_SV43:
        return copy (SwordShield.PINCURCHIN_77, this);
      case MORPEKO_SV44:
        return copy (RebelClash.MORPEKO_73, this);
      case DRACOZOLT_SV45:
        return copy (DarknessAblaze.DRACOZOLT_65, this);
      case ARCTOZOLT_SV46:
        return copy (DarknessAblaze.ARCTOZOLT_66, this);
      case GALARIAN_PONYTA_SV47:
        return copy (SwordShield.GALARIAN_PONYTA_81, this);
      case GALARIAN_RAPIDASH_SV48:
        return copy (SwordShield.GALARIAN_RAPIDASH_82, this);
      case GALARIAN_CORSOLA_SV49:
        return copy (RebelClash.GALARIAN_CORSOLA_78, this);
      case GALARIAN_CURSOLA_SV50:
        return copy (RebelClash.GALARIAN_CURSOLA_79, this);
      case DEDENNE_SV51:
        return copy (DarknessAblaze.DEDENNE_78, this);
      case SINISTEA_SV52:
        return copy (DarknessAblaze.SINISTEA_82, this);
      case POLTEAGEIST_SV53:
        return copy (DarknessAblaze.POLTEAGEIST_83, this);
      case HATENNA_SV54:
        return copy (RebelClash.HATENNA_83, this);
      case HATTREM_SV55:
        return copy (RebelClash.HATTREM_84, this);
      case HATTERENE_SV56:
        return copy (RebelClash.HATTERENE_85, this);
      case MILCERY_SV57:
        return copy (RebelClash.MILCERY_86, this);
      case ALCREMIE_SV58:
        return copy (RebelClash.ALCREMIE_87, this);
      case INDEEDEE_SV59:
        return copy (RebelClash.INDEEDEE_88, this);
      case DREEPY_SV60:
        return copy (RebelClash.DREEPY_89, this);
      case DRAKLOAK_SV61:
        return copy (RebelClash.DRAKLOAK_90, this);
      case DRAGAPULT_SV62:
        return copy (RebelClash.DRAGAPULT_91, this);
      case GALARIAN_FARFETCH_D_SV63:
        return copy (RebelClash.GALARIAN_FARFETCH_D_94, this);
      case GALARIAN_SIRFETCH_D_SV64:
        return copy (RebelClash.GALARIAN_SIRFETCH_D_95, this);
      case GALARIAN_YAMASK_SV65:
        return copy (RebelClash.GALARIAN_YAMASK_101, this);
      case GALARIAN_RUNERIGUS_SV66:
        return copy (RebelClash.GALARIAN_RUNERIGUS_102, this);
      case ROLYCOLY_SV67:
        return copy (RebelClash.ROLYCOLY_105, this);
      case CARKOL_SV68:
        return copy (RebelClash.CARKOAL_106, this);
      case COALOSSAL_SV69:
        return copy (RebelClash.COALOSSAL_107, this);
      case SILICOBRA_SV70:
        return copy (SwordShield.SILICOBRA_107, this);
      case SANDACONDA_SV71:
        return copy (SwordShield.SANDACONDA_109, this);
      case CLOBBOPUS_SV72:
        return copy (SwordShield.CLOBBOPUS_111, this);
      case GRAPPLOCT_SV73:
        return copy (SwordShield.GRAPPLOCT_113, this);
      case FALINKS_SV74:
        return copy (RebelClash.FALINKS_109, this);
      case STONJOURNER_SV75:
        return copy (RebelClash.STONJOURNER_111, this);
      case KOFFING_SV76:
        return copy (KOFFING_41, this);
      case GALARIAN_WEEZING_SV77:
        return copy (GALARIAN_WEEZING_42, this);
      case GALARIAN_ZIGZAGOON_SV78:
        return copy (SwordShield.GALARIAN_ZIGZAGOON_117, this);
      case GALARIAN_LINOONE_SV79:
        return copy (SwordShield.GALARIAN_LINOONE_118, this);
      case GALARIAN_OBSTAGOON_SV80:
        return copy (SwordShield.GALARIAN_OBSTAGOON_119, this);
      case NICKIT_SV81:
        return copy (NICKIT_47, this);
      case THIEVUL_SV82:
        return copy (SwordShield.THIEVUL_126, this);
      case IMPIDIMP_SV83:
        return copy (RebelClash.IMPIDIMP_123, this);
      case MORGREM_SV84:
        return copy (RebelClash.MORGREM_124, this);
      case GRIMMSNARL_SV85:
        return copy (RebelClash.GRIMMSNARL_125, this);
      case GALARIAN_MEOWTH_SV86:
        return copy (RebelClash.GALARIAN_MEOWTH_126, this);
      case GALARIAN_PERRSERKER_SV87:
        return copy (SwordShield.GALARIAN_PERRSERKER_128, this);
      case GALARIAN_STUNFISK_SV88:
        return copy (SwordShield.GALARIAN_STUNFISK_132, this);
      case CORVIKNIGHT_SV89:
        return copy (SwordShield.CORVIKNIGHT_135, this);
      case CUFANT_SV90:
        return copy (CUFANT_49, this);
      case COPPERAJAH_SV91:
        return copy (DarknessAblaze.COPPERAJAH_132, this);
      case DURALUDON_SV92:
        return copy (RebelClash.DURALUDON_138, this);
      case MINCCINO_SV93:
        return copy (SwordShield.MINCCINO_145, this);
      case CINCCINO_SV94:
        return copy (SwordShield.CINCCINO_147, this);
      case DUCKLETT_SV95:
        return copy (DarknessAblaze.DUCKLETT_148, this);
      case SWANNA_SV96:
        return copy (DarknessAblaze.SWANNA_149, this);
      case BUNNELBY_SV97:
        return copy (DarknessAblaze.BUNNELBY_150, this);
      case ORANGURU_SV98:
        return copy (SwordShield.ORANGURU_148, this);
      case SKWOVET_SV99:
        return copy (RebelClash.SKWOVET_151, this);
      case GREEDENT_SV100:
        return copy (RebelClash.GREEDENT_152, this);
      case ROOKIDEE_SV101:
        return copy (SwordShield.ROOKIDEE_150, this);
      case CORVISQUIRE_SV102:
        return copy (SwordShield.CORVISQUIRE_151, this);
      case WOOLOO_SV103:
        return copy (SwordShield.WOOLOO_152, this);
      case DUBWOOL_SV104:
        return copy (SwordShield.DUBWOOL_154, this);
      case RILLABOOM_V_SV105:
        return copy (SwordShieldPromos.RILLABOOM_V_SWSH14, this);
      case RILLABOOM_VMAX_SV106:
        return copy (RebelClash.RILLABOOM_VMAX_18, this);
      case CHARIZARD_VMAX_SV107:
        return copy (DarknessAblaze.CHARIZARD_VMAX_20, this);
      case CENTISKORCH_V_SV108:
        return copy (DarknessAblaze.CENTISKORCH_V_33, this);
      case CENTISKORCH_VMAX_SV109:
        return copy (DarknessAblaze.CENTISKORCH_VMAX_34, this);
      case LAPRAS_V_SV110:
        return copy (SwordShield.LAPRAS_V_49, this);
      case LAPRAS_VMAX_SV111:
        return copy (SwordShield.LAPRAS_VMAX_50, this);
      case TOXTRICITY_V_SV112:
        return copy (RebelClash.TOXTRICITY_V_70, this);
      case TOXTRICITY_VMAX_SV113:
        return copy (RebelClash.TOXTRICITY_VMAX_71, this);
      case INDEEDEE_V_SV114:
        return copy (INDEEDEE_V_39, this);
      case FALINKS_V_SV115:
        return copy (RebelClash.FALINKS_V_110, this);
      case GRIMMSNARL_V_SV116:
        return copy (DarknessAblaze.GRIMMSNARL_V_114, this);
      case GRIMMSNARL_VMAX_SV117:
        return copy (DarknessAblaze.GRIMMSNARL_VMAX_115, this);
      case DITTO_V_SV118:
        return copy (DITTO_V_50, this);
      case DITTO_VMAX_SV119:
        return copy (DITTO_VMAX_51, this);
      case DUBWOOL_V_SV120:
        return copy (RebelClash.DUBWOOL_V_153, this);
      case ETERNATUS_V_SV121:
        return copy (DarknessAblaze.ETERNATUS_V_116, this);
      case ETERNATUS_VMAX_SV122:
        return copy (DarknessAblaze.ETERNATUS_VMAX_117, this);
      default:
      return null;
    }
  }
}
