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
  DHELMISE_VMAX_10 ("Dhelmise VMAX", "10", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  GROOKEY_11 ("Grookey", "11", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  THWACKEY_12 ("Thwackey", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RILLABOOM_13 ("Rillaboom", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  GOSSIFLEUR_14 ("Gossifleur", "14", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_15 ("Eldegoss", "15", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ZARUDE_16 ("Zarude", "16", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  RESHIRAM_17 ("Reshiram", "17", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  CINDERACE_V_18 ("Cinderace V", "18", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CINDERACE_VMAX_19 ("Cinderace VMAX", "19", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
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
  MORPEKO_VMAX_38 ("Morpeko VMAX", "38", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  INDEEDEE_V_39 ("Indeedee V", "39", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  TRAPINCH_40 ("Trapinch", "40", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  KOFFING_41 ("Koffing", "41", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_WEEZING_42 ("Galarian Weezing", "42", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPINARAK_43 ("Spinarak", "43", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  CROBAT_V_44 ("Crobat V", "44", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  CROBAT_VMAX_45 ("Crobat VMAX", "45", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  YVELTAL_46 ("Yveltal", "46", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_47 ("Nickit", "47", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_48 ("Thievul", "48", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CUFANT_49 ("Cufant", "49", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  DITTO_V_50 ("Ditto V", "50", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  DITTO_VMAX_51 ("Ditto VMAX", "51", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  EEVEE_52 ("Eevee", "52", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_V_53 ("Greedent V", "53", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CRAMORANT_V_54 ("Cramorant V", "54", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CRAMORANT_VMAX_55 ("Cramorant VMAX", "55", Rarity.RARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
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
  POKE_KID_70 ("Poke Kid", "70", Rarity.SECRET, [TRAINER, SUPPORTER]),
  ROSE_71 ("Rose", "71", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SKYLA_72 ("Skyla", "72", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALCREMIE_VMAX_73 ("Alcremie VMAX", "73", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
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
  GALARIAN_MR_MIME_SV20 ("Galarian Mr Mime", "SV20", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_SV21 ("Galarian Mr Rime", "SV21", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
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
  RILLABOOM_VMAX_SV106 ("Rillaboom VMAX", "SV106", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  CHARIZARD_VMAX_SV107 ("Charizard VMAX", "SV107", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  CENTISKORCH_V_SV108 ("Centiskorch V", "SV108", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CENTISKORCH_VMAX_SV109 ("Centiskorch VMAX", "SV109", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  LAPRAS_V_SV110 ("Lapras V", "SV110", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  LAPRAS_VMAX_SV111 ("Lapras VMAX", "SV111", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  TOXTRICITY_V_SV112 ("Toxtricity V", "SV112", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TOXTRICITY_VMAX_SV113 ("Toxtricity VMAX", "SV113", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  INDEEDEE_V_SV114 ("Indeedee V", "SV114", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  FALINKS_V_SV115 ("Falinks V", "SV115", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  GRIMMSNARL_V_SV116 ("Grimmsnarl V", "SV116", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GRIMMSNARL_VMAX_SV117 ("Grimmsnarl VMAX", "SV117", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  DITTO_V_SV118 ("Ditto V", "SV118", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  DITTO_VMAX_SV119 ("Ditto VMAX", "SV119", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  DUBWOOL_V_SV120 ("Dubwool V", "SV120", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  ETERNATUS_V_SV121 ("Eternatus V", "SV121", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  ETERNATUS_VMAX_SV122 ("Eternatus VMAX", "SV122", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]);

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
    return name();
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
          }
        }
      };
      case CELEBI_3:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        bwAbility "Woodland Stroll", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 6 cards of your deck, reveal an Energy card you find there, and put it into your hand. Shuffle the other cards back into your deck."
          actionA {
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
          text " Attach up to 2 [G] Energy cards from your discard pile to your Benched Pokémon in any way you like."
          energyCost C
          attackRequirement {}
          onAttack {

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
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in this Pokémon's attack costs."
          actionA {
          }
        }
        move "Wind Shard", {
          text " This attack does 60 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DARTRIX_7:
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
      case DECIDUEYE_8:
      return evolution (this, from:"Dartrix", hp:HP140, type:G, retreatCost:2) {
        weakness R
        bwAbility "Deep Forest Camo", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon V and Pokémon-GX."
          actionA {
          }
        }
        move "Splitting Arrow", {
          text "90 damage. This attack also does 20 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case DHELMISE_V_9:
      return basic (this, hp:HP220, type:G, retreatCost:2) {
        weakness R
        move "Anchor Anger", {
          text "30+ damage. If any of your [G] Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Hammer", {
          text "200 damage. During your next turn, this Pokémon can't use Giga Hammer."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case DHELMISE_VMAX_10:
      return evolution (this, from:"Dhelmise V", hp:HP330, type:G, retreatCost:3) {
        weakness R
        move "Swinging Chain", {
          text " This attack does 30 damage to 1 of your opponent's Pokémon for each [G] Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Max Anchor", {
          text "240 damage. During your next turn, this Pokémon can't use Max Anchor."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 240
          }
        }
      };
      case GROOKEY_11:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Fury Swipes", {
          text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case THWACKEY_12:
      return evolution (this, from:"Grookey", hp:HP090, type:G, retreatCost:2) {
        weakness R
        bwAbility "Lay of the Land", {
          text "If you have a Stadium in play, this Pokémon has no Retreat Cost."
          actionA {
          }
        }
        move "Branch Poke", {
          text "20 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RILLABOOM_13:
      return evolution (this, from:"Thwackey", hp:HP170, type:G, retreatCost:3) {
        weakness R
        bwAbility "Voltage Beat", {
          text "Once during your turn, you may search your deck for up to 2 [G] Energy cards and attach them to 1 of your Pokémon. Then, shuffle your deck."
          actionA {
          }
        }
        move "Hammer In", {
          text "140 damage."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
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
          text " Heal all damage from 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Surprise Attack", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 50
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
      return basic (this, hp:HP120, type:R, retreatCost:3) {
        weakness W
        move "Amazing Blaze", {
          text "270 damage. This Pokémon does 60 damage to itself."
          energyCost R, L, D
          attackRequirement {}
          onAttack {
            damage 270
          }
        }
      };
      case CINDERACE_V_18:
      return basic (this, hp:HP210, type:R, retreatCost:2) {
        weakness W
        bwAbility "Field Runner", {
          text "If a Stadium is in play, this Pokémon has no Retreat Cost."
          actionA {
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
      case CINDERACE_VMAX_19:
      return evolution (this, from:"Cinderace V", hp:HP320, type:R, retreatCost:2) {
        weakness W
        move "Counter", {
          text "30+ damage. If this Pokémon was damaged by an attack during your opponent's last turn, this attack does that much more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Max Pyro Ball", {
          text "170 damage. Your opponent's Active Pokémon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
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
      return basic (this, hp:HP120, type:W, retreatCost:3) {
        weakness L
        move "Amazing Surge", {
          text " This attack does 80 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, L, M, C
          attackRequirement {}
          onAttack {

          }
        }
      };
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
            damage 120
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
          actionA {
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
          text " This attack does 50 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SNOM_29:
      return basic (this, hp:HP050, type:W, retreatCost:2) {
        weakness M
        move "Call for Family", {
          text " Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FROSMOTH_30:
      return evolution (this, from:"Snom", hp:HP090, type:W, retreatCost:2) {
        weakness M
        bwAbility "Ice Dance", {
          text "As often as you like during your turn, you may attach a [W] Energy card from your hand to 1 of your Benched [W] Pokémon."
          actionA {
          }
        }
        move "Aurora Beam", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SHINX_31:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Under Pressure", {
          text "10+ damage. If your opponent has 3 or fewer Prize cards remaining, this attack does 50 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LUXIO_32:
      return evolution (this, from:"Shinx", hp:HP090, type:L, retreatCost:1) {
        weakness F
        bwAbility "Top Entry", {
          text "Once during your turn, if you drew this Pokémon from your deck at the beginning of your turn and your Bench isn't full, before you put it into your hand, you may put it onto your Bench."
          actionA {
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
      case LUXRAY_33:
      return evolution (this, from:"Luxio", hp:HP160, type:L, retreatCost:1) {
        weakness F
        move "Raid", {
          text "60+ damage. If this Pokémon evolved from Luxio during this turn, this attack does 100 more damage."
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
            damage 120
          }
        }
      };
      case ROTOM_34:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        bwAbility "Roto Choice", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for up to 2 Item cards that have the word 'Rotom' in their name, reveal them, and put them into your hand. Then, shuffle your deck."
          actionA {
          }
        }
        move "Thunder Shock", {
          text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MORPEKO_35:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Famished", {
          text " Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunder Shock", {
          text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MORPEKO_36:
      return copy (MORPEKO_35, this);
      case MORPEKO_V_37:
      return basic (this, hp:HP170, type:L, retreatCost:2) {
        weakness F
        move "Spark", {
          text "20 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Electro Wheel", {
          text "150 damage. Discard an Energy from this Pokémon. If you do, switch it with 1 of your Benched Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case MORPEKO_VMAX_38:
      return evolution (this, from:"Morpeko V", hp:HP300, type:L, retreatCost:1) {
        weakness F
        move "Max Discharge", {
          text "180 damage. This attack also does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case INDEEDEE_V_39:
      return basic (this, hp:HP180, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Watch Over", {
          text "Once during your turn, you may heal 20 damage from your Active Pokémon."
          actionA {
          }
        }
        move "Psychic", {
          text "10+ damage. This attack does 60 more damage for each Energy attached to your opponent's Active Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TRAPINCH_40:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Land's Pulse", {
          text "10+ damage. If a Stadium is in play, this attack does 10 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KOFFING_41:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Ascension", {
          text " Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GALARIAN_WEEZING_42:
      return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:3) {
        weakness F
        bwAbility "Neutralizing Gas", {
          text "As long as this Pokémon is in the Active Spot, your opponent's Pokémon in play have no Abilities , except for Neutralizing Gas."
          actionA {
          }
        }
        move "Severe Poison", {
          text " Your opponent's Active Pokémon is now Poisoned . Put 4 damage counters instead of 1 on that Pokémon during Pokémon Checkup."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SPINARAK_43:
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
      case CROBAT_V_44:
      return basic (this, hp:HP180, type:D, retreatCost:1) {
        weakness F
        bwAbility "Dark Asset", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may draw cards until you have 6 cards in your hand. You can't use more than 1 Dark Asset Ability each turn."
          actionA {
          }
        }
        move "Venomous Fang", {
          text "70 damage. Your opponent's Active Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case CROBAT_VMAX_45:
      return evolution (this, from:"Crobat V", hp:HP300, type:D, retreatCost:1) {
        weakness F
        move "Stealth Poison", {
          text "70 damage. Your opponent's Active Pokémon is now Poisoned . Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Max Cutter", {
          text "180 damage."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case YVELTAL_46:
      return basic (this, hp:HP110, type:D, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Amazing Destruction", {
          text " Your opponent's Active Pokémon is Knocked Out."
          energyCost R, P, D, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case NICKIT_47:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Instigate", {
          text " Your opponent shuffles their hand and puts it on the bottom of their deck. If they put any cards on the bottom of their deck in this way, they draw 3 cards."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
      };
      case THIEVUL_48:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Call for Goons", {
          text " Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Corner", {
          text "80 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case CUFANT_49:
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
      case DITTO_V_50:
      return basic (this, hp:HP170, type:C, retreatCost:2) {
        weakness F
        bwAbility "V TransformationV", {
          text "Once during your turn, you may choose a Basic Pokémon V from your discard pile and switch it with this Pokémon. Any attached cards, damage counters, Special Conditions , turns in play, and any other effects remain on the new Pokémon."
          actionA {
          }
        }
        move "Stick On", {
          text " Attach a basic Energy card from your discard pile to this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DITTO_VMAX_51:
      return evolution (this, from:"Ditto V", hp:HP320, type:C, retreatCost:3) {
        weakness F
        move "Max Transform", {
          text " Choose 1 of your opponent's Active Pokémon's attacks and use it as this attack."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case EEVEE_52:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Signs of Evolution", {
          text " Search your deck for a card that evolves from Eevee , reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Wild Kick", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GREEDENT_V_53:
      return basic (this, hp:HP200, type:C, retreatCost:2) {
        weakness F
        move "Crunch", {
          text "40 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Stumbling Press", {
          text "180 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case CRAMORANT_V_54:
      return basic (this, hp:HP200, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Beak Catch", {
          text " Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Spit Shot", {
          text " Discard all Energy from this Pokémon. This attack does 160 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CRAMORANT_VMAX_55:
      return evolution (this, from:"Cramorant V", hp:HP320, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Max Jet", {
          text "80× damage. Flip a coin for each Energy attached to this Pokémon. This attack does 80 damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case INDEEDEE_56:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Helping Hand", {
          text " Search your deck for a basic Energy card and attach it to 1 of your Benched Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psychic", {
          text "20+ damage. This attack does 20 more damage for each Energy attached to your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BALL_GUY_57:
      return supporter (this) {
        text "Search your deck for up to 3 different Item cards that have the word 'Ball' in their name" +
          "reveal them" +
          "and put them into your hand. Then" +
          "shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case BOSS_S_ORDERS_58:
      return supporter (this) {
        text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case GYM_TRAINER_59:
      return supporter (this) {
        text "Draw 2 cards. If any of your Pokémon were Knocked Out during your opponent's last turn" +
          "draw 2 more cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_S_RESEARCH_60:
      return supporter (this) {
        text "Discard your hand and draw 7 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case RUSTED_SHIELD_61:
      return pokemonTool (this) {
        text "The Zamazenta V this card is attached to gets +70 HP."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case RUSTED_SWORD_62:
      return pokemonTool (this) {
        text "The attacks of the Zacian V this card is attached to do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TEAM_YELL_TOWEL_63:
      return itemCard (this) {
        text "Heal 50 damage from both Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case ALCREMIE_V_64:
      return basic (this, hp:HP170, type:P, retreatCost:2) {
        weakness M
        move "Sugary Sprinkles", {
          text " Heal 30 damage from each of your Benched Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Sweet Splash", {
          text "100 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case BALL_GUY_65:
      return copy (BALL_GUY_57, this);
      case BIRD_KEEPER_66:
      return supporter (this) {
        text "Switch your Active Pokémon with 1 of your Benched Pokémon. If you do" +
          "draw 3 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case CARA_LISS_67:
      return supporter (this) {
        text "Search your deck for up to 2 Rare Fossil cards and put them onto your Bench. Then" +
          "shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case GYM_TRAINER_68:
      return copy (GYM_TRAINER_59, this);
      case PIERS_69:
      return supporter (this) {
        text "Search your deck for an Energy card and a Pokémon" +
          "reveal them" +
          "and put them into your hand. Then" +
          "shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKE_KID_70:
      return supporter (this) {
        text "Search your deck for a Pokémon" +
          "reveal it" +
          "and put it into your hand. Then" +
          "shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROSE_71:
      return supporter (this) {
        text "Attach up to 2 basic Energy cards from your discard pile to 1 of your Pokémon VMAX. If you attached any Energy cards in this way" +
          "discard your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case SKYLA_72:
      return supporter (this) {
        text "Search your deck for a Trainer card" +
          "reveal it" +
          "and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ALCREMIE_VMAX_73:
      return evolution (this, from:"Alcremie V", hp:HP310, type:P, retreatCost:3) {
        weakness M
        move "Adornment", {
          text " For each of your Benched Pokémon, search your deck for a [P] Energy card and attach it to that Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "G-Max Whisk", {
          text "60× damage. Discard any amount of Energy from your Pokémon. This attack does 60 damage for each card you discarded in this way."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
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
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "20 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DOTTLER_SV8:
      return evolution (this, from:"Blipbug", hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Reflect", {
          text " During your opponent's next turn, this Pokémon takes 40 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Ram", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ORBEETLE_SV9:
      return evolution (this, from:"Dottler", hp:HP130, type:G, retreatCost:1) {
        weakness R
        bwAbility "Bug's Radar", {
          text "Once during your turn, you may look at the top 3 cards of your opponent's deck and put them back in any order."
          actionA {
          }
        }
        move "Brainwave", {
          text "90+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case GOSSIFLEUR_SV10:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Call for Family", {
          text " Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "10 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELDEGOSS_SV11:
      return evolution (this, from:"Gossifleur", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Blessing of Fluff", {
          text " Search your deck for up to 3 [G] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Leafage", {
          text "30 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case APPLIN_SV12:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Withdraw", {
          text " Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FLAPPLE_SV13:
      return evolution (this, from:"Applin", hp:HP080, type:G, retreatCost:1) {
        weakness R
        bwAbility "Apple Drop", {
          text "Once during your turn, you may put 2 damage counters on 1 of your opponent's Pokémon. If you placed any damage counters in this way, shuffle this Pokémon and all cards attached to it into your deck."
          actionA {
          }
        }
        move "Acid Spray", {
          text "60 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case APPLETUN_SV14:
      return evolution (this, from:"Applin", hp:HP090, type:G, retreatCost:3) {
        weakness R
        bwAbility "Delicious Aroma", {
          text "Once during your turn, you may flip a coin. If heads, switch 1 of your opponent's Benched Basic Pokémon with their Active Pokémon."
          actionA {
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
      case SCORBUNNY_SV15:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard an Energy from this Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RABOOT_SV16:
      return evolution (this, from:"Scorbunny", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Flame Charge", {
          text "20 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnum Kick", {
          text "70 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case CINDERACE_SV17:
      return evolution (this, from:"Raboot", hp:HP170, type:R, retreatCost:1) {
        weakness W
        bwAbility "Libero", {
          text "Once during your turn, when this Pokémon moves from your Bench to the Active Spot, you may attach up to 2 [R] Energy cards from your discard pile to it."
          actionA {
          }
        }
        move "Flare Striker", {
          text "190 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 190
          }
        }
      };
      case SIZZLIPEDE_SV18:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Bite", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Combustion", {
          text "50 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CENTISKORCH_SV19:
      return evolution (this, from:"Sizzlipede", hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Hundred Foot Flames", {
          text " For each [R] Energy attached to this Pokémon, discard the top card of your opponent's deck."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Searing Flame", {
          text "110 damage. Your opponent's Active Pokémon is now Burned."
          energyCost R, C, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case GALARIAN_MR_MIME_SV20:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness M
        move "Reflect", {
          text " During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost W
          attackRequirement {}
          onAttack {

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
      case GALARIAN_MR_RIME_SV21:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Shuffle Dance", {
          text "Once during your turn, you may switch 1 of your opponent's face-down Prize cards with the top card of their deck. (The cards stay face down.)"
          actionA {
          }
        }
        move "Mad Party", {
          text "20× damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SUICUNE_SV22:
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
          text "130 damage. Put 2 [W] Energy attached to this Pokémon into your hand."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case GALARIAN_DARUMAKA_SV23:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Ice Punch", {
          text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_DARMANITAN_SV24:
      return evolution (this, from:"Galarian Darumaka", hp:HP140, type:W, retreatCost:3) {
        weakness M
        move "Blizzard", {
          text "80 damage. This attack also does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Crushing Headbutt", {
          text "170 damage. During your next turn, this Pokémon can't use Crushing Headbutt."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
      case SOBBLE_SV25:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DRIZZILE_SV26:
      return evolution (this, from:"Sobble", hp:HP090, type:W, retreatCost:1) {
        weakness L
        bwAbility "Shady Dealings", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
          }
        }
        move "Water Drip", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case INTELEON_SV27:
      return evolution (this, from:"Drizzile", hp:HP160, type:W, retreatCost:1) {
        weakness L
        bwAbility "Shady Dealings", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck."
          actionA {
          }
        }
        move "Aqua Bullet", {
          text "120 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case CHEWTLE_SV28:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Bite", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Water Gun", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DREDNAW_SV29:
      return evolution (this, from:"Chewtle", hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Vise Bite", {
          text "60+ damage. This attack does 30 more damage for each in your opponent's Active Pokémon's Retreat Cost."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Jaw Lock", {
          text "130 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case CRAMORANT_SV30:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Dive", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to this Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hydro Pump", {
          text "50+ damage. This attack does 20 more damage for each [W] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ARROKUDA_SV31:
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
      case BARRASKEWDA_SV32:
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
          text "130 damage. Discard 2 [W] Energy cards from your hand. If you don't, this attack does nothing."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case SNOM_SV33:
      return copy (SNOM_29, this);
      case FROSMOTH_SV34:
      return copy (FROSMOTH_30, this);
      case EISCUE_SV35:
      return basic (this, hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Ice Face", {
          text "If this Pokémon has full HP, it takes 60 less damage from your opponent's attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "Blizzard", {
          text "70 damage. This attack also does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case DRACOVISH_SV36:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:3) {
        weakness L
        bwAbility "Primal Law", {
          text "As long as this Pokémon is in the Active Spot, your opponent can't play any Pokémon from their hand to evolve their Pokémon."
          actionA {
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
      case ARCTOVISH_SV37:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:2) {
        weakness L
        move "Hard Face", {
          text "90 damage. During your opponent's next turn, this Pokémon takes 60 less damage from attacks (after applying Weakness and Resistance)."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Cold Breath", {
          text "130 damage. Your opponent's Active Pokémon is now Asleep."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case ROTOM_SV38:
      return copy (ROTOM_34, this);
      case YAMPER_SV39:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Roar", {
          text " Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Static Shock", {
          text "10 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BOLTUND_SV40:
      return evolution (this, from:"Yamper", hp:HP130, type:L, retreatCost:1) {
        weakness F
        move "Big Bite", {
          text "50 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Fighting Fangs", {
          text "90+ damage. If your opponent's Active Pokémon is a Pokémon V or Pokémon-GX , this attack does 90 more damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TOXEL_SV41:
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
      case TOXTRICITY_SV42:
      return evolution (this, from:"Toxel", hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Risk Taker", {
          text " Flip a coin. If heads, discard the top 5 cards of your opponent's deck. If tails, discard the top 5 cards of your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunder Jolt", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case PINCURCHIN_SV43:
      return basic (this, hp:HP080, type:L, retreatCost:2) {
        weakness F
        move "Shocking Needles", {
          text "30× damage. Flip 4 coins. This attack does 30 damage for each heads. If at least 2 of them are heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MORPEKO_SV44:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Torment", {
          text "20 damage. Choose 1 of your opponent's Active Pokémon's attacks. During your opponent's next turn, that Pokémon can't use that attack."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spark", {
          text "50 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DRACOZOLT_SV45:
      return evolution (this, from:"Rare Fossil", hp:HP160, type:L, retreatCost:4) {
        weakness F
        move "Amping Up", {
          text "30 damage. During your next turn, this Pokémon's Amping Up attack does 90 more damage (before applying Weakness and Resistance)."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "200 damage. During your next turn, this Pokémon can't attack."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case ARCTOZOLT_SV46:
      return evolution (this, from:"Rare Fossil", hp:HP130, type:L, retreatCost:2) {
        weakness F
        bwAbility "Biting Whirlpool", {
          text "Whenever your opponent attaches an Energy card from their hand to 1 of their Pokémon, put 2 damage counters on that Pokémon."
          actionA {
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
      case GALARIAN_PONYTA_SV47:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Psy Bolt", {
          text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GALARIAN_RAPIDASH_SV48:
      return evolution (this, from:"Galarian Ponyta", hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Pastel Veil", {
          text "Your Pokémon recover from all Special Conditions and can't be affected by any Special Conditions."
          actionA {
          }
        }
        move "Psychic", {
          text "30+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_CORSOLA_SV49:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Cursed Drop", {
          text " Put 3 damage counters on your opponent's Pokémon in any way you like."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GALARIAN_CURSOLA_SV50:
      return evolution (this, from:"Galarian Corsola", hp:HP100, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Perish Body", {
          text "If this Pokémon is in the Active Spot and is Knocked Out by damage from an opponent's attack, flip a coin. If heads, the Attacking Pokémon is Knocked Out."
          actionA {
          }
        }
        move "Corner", {
          text "60 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case DEDENNE_SV51:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mad Party", {
          text "20× damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SINISTEA_SV52:
      return basic (this, hp:HP030, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Furtive Drop", {
          text " Put 2 damage counters on your opponent's Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case POLTEAGEIST_SV53:
      return evolution (this, from:"Sinistea", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Tea Break", {
          text "You must discard a Pokémon that has the Mad Party attack from your hand in order to use this Ability . Once during your turn, you may draw 2 cards."
          actionA {
          }
        }
        move "Mad Party", {
          text "20× damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HATENNA_SV54:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Find a Friend", {
          text " Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case HATTREM_SV55:
      return evolution (this, from:"Hatenna", hp:HP080, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Calm Mind", {
          text " Heal 30 damage from this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Brutal Swing", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HATTERENE_SV56:
      return evolution (this, from:"Hattrem", hp:HP150, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Mind Hat", {
          text "Once during your turn, you may use this Ability . Each player discards a card from their hand. (Your opponent discards first.)"
          actionA {
          }
        }
        move "Dripping Grudge", {
          text " Put 1 damage counter on your opponent's Active Pokémon for each Pokémon in your discard pile."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MILCERY_SV57:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness M
        move "Aromatherapy", {
          text " Heal 10 damage from each of your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case ALCREMIE_SV58:
      return evolution (this, from:"Milcery", hp:HP110, type:P, retreatCost:1) {
        weakness M
        move "Decorate", {
          text " Attach any number of basic Energy cards from your hand to your Pokémon in any way you like."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Draining Kiss", {
          text "50 damage. Heal 30 damage from this Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case INDEEDEE_SV59:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Replenish Time", {
          text " Heal 30 damage from each of your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psybeam", {
          text "30 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DREEPY_SV60:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DRAKLOAK_SV61:
      return evolution (this, from:"Dreepy", hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Summon", {
          text " Search your deck for a Dreepy and put it onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case DRAGAPULT_SV62:
      return evolution (this, from:"Drakloak", hp:HP150, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        bwAbility "Infiltrator", {
          text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
          actionA {
          }
        }
        move "Phantom Force", {
          text "120 damage. Put 3 damage counters on your opponent's Benched Pokémon in any way you like."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case GALARIAN_FARFETCH_D_SV63:
      return basic (this, hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Rock Smash", {
          text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
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
      case GALARIAN_SIRFETCH_D_SV64:
      return evolution (this, from:"Galarian Farfetch'd", hp:HP130, type:F, retreatCost:2) {
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
          text "180 damage. This Pokémon can't use Meteor Assault again until it leaves the Active Spot."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case GALARIAN_YAMASK_SV65:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Reckless Charge", {
          text "50 damage. This Pokémon also does 30 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GALARIAN_RUNERIGUS_SV66:
      return evolution (this, from:"Galarian Yamask", hp:HP100, type:F, retreatCost:2) {
        weakness G
        move "Spreading Spite", {
          text " For each damage counter on this Galarian Runerigus, put 2 damage counters on your opponent's Pokémon in any way you like."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Mad Hammer", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ROLYCOLY_SV67:
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
      case CARKOL_SV68:
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
      case COALOSSAL_SV69:
      return evolution (this, from:"Carkol", hp:HP160, type:F, retreatCost:4) {
        weakness G
        bwAbility "Tar Generator", {
          text "Once during your turn, you may attach a [R] Energy card, a [F] Energy card, or 1 of each from your discard pile to your Pokémon in any way you like."
          actionA {
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
      case SILICOBRA_SV70:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Sand Attack", {
          text " During your opponent's next turn, if the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack doesn't happen."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SANDACONDA_SV71:
      return evolution (this, from:"Silicobra", hp:HP140, type:F, retreatCost:2) {
        weakness G
        move "Coil", {
          text "10 damage. During your next turn, this Pokémon's attacks do 120 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Skull Bash", {
          text "100 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case CLOBBOPUS_SV72:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness P
        move "Bind", {
          text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GRAPPLOCT_SV73:
      return evolution (this, from:"Clobbopus", hp:HP130, type:F, retreatCost:2) {
        weakness P
        move "Octolock", {
          text " Until this Grapploct leaves the Active Spot, the Defending Pokémon's attacks cost [C] more, and the Defending Pokémon can't retreat. This effect can't be applied more than once."
          energyCost F, F
          attackRequirement {}
          onAttack {

          }
        }
        move "Tough Swing", {
          text "130 damage. This attack's damage isn't affected by Resistance."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case FALINKS_SV74:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text " Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Team Attack", {
          text "30× damage. This attack does 30 damage for each of your Benched Pokémon that has " Falinks " in its name."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case STONJOURNER_SV75:
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
          text "120+ damage. If this Pokémon has at least 1 extra Energy attached (in addition to this attack's cost) , this attack does 60 more damage."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case KOFFING_SV76:
      return copy (KOFFING_41, this);
      case GALARIAN_WEEZING_SV77:
      return copy (GALARIAN_WEEZING_42, this);
      case GALARIAN_ZIGZAGOON_SV78:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        bwAbility "Headbutt Tantrum", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may put 1 damage counter on 1 of your opponent's Pokémon."
          actionA {
          }
        }
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_LINOONE_SV79:
      return evolution (this, from:"Galarian Zigzagoon", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Night Slash", {
          text "20 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hammer In", {
          text "70 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GALARIAN_OBSTAGOON_SV80:
      return evolution (this, from:"Galarian Linoone", hp:HP160, type:D, retreatCost:2) {
        weakness G
        bwAbility "Untamed Shout", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 3 damage counters on 1 of your opponent's Pokémon."
          actionA {
          }
        }
        move "Obstruct", {
          text "90 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case NICKIT_SV81:
      return copy (NICKIT_47, this);
      case THIEVUL_SV82:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Thief", {
          text "20 damage. Your opponent reveals their hand. Choose a card you find there and put it on the bottom of their deck."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Darkness Fang", {
          text "90 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case IMPIDIMP_SV83:
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
      case MORGREM_SV84:
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
          text "60 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GRIMMSNARL_SV85:
      return evolution (this, from:"Morgrem", hp:HP170, type:D, retreatCost:3) {
        weakness G
        bwAbility "Dark Oath", {
          text "As long as this Pokémon is in the Active Spot, your opponent's Active Pokémon's attacks cost [C] more."
          actionA {
          }
        }
        move "Energy Press", {
          text "100+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case GALARIAN_MEOWTH_SV86:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Evolution Roar", {
          text "You must discard 2 cards from your hand in order to use this Ability . Once during your turn, you may search your deck for a Galarian Perrserker , reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
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
      case GALARIAN_PERRSERKER_SV87:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Steely Spirit", {
          text "Your [M] Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          actionA {
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
      case GALARIAN_STUNFISK_SV88:
      return basic (this, hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Snap Trap", {
          text "If this Pokémon is in the Active Spot and is damaged by an opponent's attack (even if it is Knocked Out) , discard an Energy from the Attacking Pokémon."
          actionA {
          }
        }
        move "Damage Rush", {
          text "30+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CORVIKNIGHT_SV89:
      return evolution (this, from:"Corvisquire", hp:HP170, type:M, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "50 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Iron Wings", {
          text "130 damage. You may discard 2 Energy from this Pokémon. If you do, during your opponent's next turn, this Pokémon takes 100 less damage from attacks (after applying Weakness and Resistance)."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case CUFANT_SV90:
      return copy (CUFANT_49, this);
      case COPPERAJAH_SV91:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Antibacterial Skin", {
          text "This Pokémon can't be affected by any Special Conditions."
          actionA {
          }
        }
        move "Vengeful Stomp", {
          text "120+ damage. If your Benched Pokémon have any damage counters on them, this attack does 120 more damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case DURALUDON_SV92:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Metal Sharpener", {
          text "30 damage. Attach a [M] Energy card from your discard pile to 1 of your Pokémon."
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
            damage 110
          }
        }
      };
      case MINCCINO_SV93:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Glance", {
          text " Look at the top card of your opponent's deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Slap", {
          text "20× damage. Flip 2 coins. This attack does 20 damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CINCCINO_SV94:
      return evolution (this, from:"Minccino", hp:HP090, type:C, retreatCost:1) {
        weakness F
        bwAbility "Make Do", {
          text "You must discard a card from your hand in order to use this Ability. Once during your turn, you may draw 2 cards."
          actionA {
          }
        }
        move "Energy Assist", {
          text "40 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DUCKLETT_SV95:
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
      case SWANNA_SV96:
      return evolution (this, from:"Ducklett", hp:HP110, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in this Pokémon's attack costs."
          actionA {
          }
        }
        move "Feather Slice", {
          text "70+ damage. You may discard a card from your hand. If you do, this attack does 70 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case BUNNELBY_SV97:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Mad Party", {
          text "20× damage. This attack does 20 damage for each Pokémon in your discard pile that has the Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ORANGURU_SV98:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness F
        bwAbility "Primate Wisdom", {
          text "Once during your turn, you may switch a card from your hand with the top card of your deck."
          actionA {
          }
        }
        move "Whap Down", {
          text "70 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SKWOVET_SV99:
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
      case GREEDENT_SV100:
      return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
        weakness F
        bwAbility "Greedy Tail", {
          text "Once during your turn, you may search your deck for a Pokémon Tool card , reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
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
      case ROOKIDEE_SV101:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Flap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
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
      case CORVISQUIRE_SV102:
      return evolution (this, from:"Rookidee", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "20 damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Drill Peck", {
          text "50 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case WOOLOO_SV103:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Expand", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DUBWOOL_SV104:
      return evolution (this, from:"Wooloo", hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Cotton Guard", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Double-Edge", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case RILLABOOM_V_SV105:
      return basic (this, hp:HP220, type:G, retreatCost:3) {
        weakness R
        move "Forest Feast", {
          text " Search your deck for up to 2 Basic [G] Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Wood Hammer", {
          text "220 damage. This Pokémon also does 30 damage to itself."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 220
          }
        }
      };
      case RILLABOOM_VMAX_SV106:
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
          text "130+ damage. You may discard up to 3 [G] Energy from this Pokémon. If you do, this attack does 50 more damage for each card you discarded in this way."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case CHARIZARD_VMAX_SV107:
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
          }
        }
      };
      case CENTISKORCH_V_SV108:
      return basic (this, hp:HP210, type:R, retreatCost:3) {
        weakness W
        move "Radiating Heat", {
          text "20 damage. You may discard an Energy from this Pokémon. If you do, discard an Energy attached to your opponent's Active Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
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
      case CENTISKORCH_VMAX_SV109:
      return evolution (this, from:"Centiskorch V", hp:HP320, type:R, retreatCost:3) {
        weakness W
        move "G-Max Centiferno", {
          text "40+ damage. This attack does 40 more damage for each [R] Energy attached to this Pokémon. If you did any damage with this attack, you may attach a [R] Energy card from your discard pile to this Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LAPRAS_V_SV110:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        move "Body Surf", {
          text " Attach a [W] Energy card from your hand to this Pokémon. If you do, switch it with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Ocean Loop", {
          text "210 damage. Put 2 [W] Energy attached to this Pokémon into your hand."
          energyCost W, W, W, C
          attackRequirement {}
          onAttack {
            damage 210
          }
        }
      };
      case LAPRAS_VMAX_SV111:
      return evolution (this, from:"Lapras V", hp:HP320, type:W, retreatCost:3) {
        weakness L
        move "G-Max Pump", {
          text "90+ damage. This attack does 30 more damage for each [W] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TOXTRICITY_V_SV112:
      return basic (this, hp:HP210, type:L, retreatCost:2) {
        weakness F
        move "Poison Jab", {
          text "20 damage. Your opponent's Active Pokémon is now Poisoned."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Electric Riot", {
          text "90+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 90 more damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TOXTRICITY_VMAX_SV113:
      return evolution (this, from:"Toxtricity V", hp:HP320, type:L, retreatCost:2) {
        weakness F
        move "G-Max Riot", {
          text "160+ damage. If your opponent's Active Pokémon is Poisoned , this attack does 80 more damage."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case INDEEDEE_V_SV114:
      return copy (INDEEDEE_V_39, this);
      case FALINKS_V_SV115:
      return basic (this, hp:HP160, type:F, retreatCost:2) {
        weakness P
        bwAbility "Iron Defense Formation", {
          text "All of your Pokémon that have ' Falinks ' in their name take 20 less damage from your opponent's attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "Giga Impact", {
          text "210 damage. During your next turn, this Pokémon can't attack."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 210
          }
        }
      };
      case GRIMMSNARL_V_SV116:
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
          }
        }
      };
      case GRIMMSNARL_VMAX_SV117:
      return evolution (this, from:"Grimmsnarl V", hp:HP330, type:D, retreatCost:3) {
        weakness G
        move "G-Max Drill", {
          text "170+ damage. This attack does 50 more damage for each extra [D] Energy attached to this Pokémon (in addition to this attack's cost) . You can't add more than 100 damage in this way."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
      case DITTO_V_SV118:
      return copy (DITTO_V_50, this);
      case DITTO_VMAX_SV119:
      return copy (DITTO_VMAX_51, this);
      case DUBWOOL_V_SV120:
      return basic (this, hp:HP210, type:C, retreatCost:2) {
        weakness F
        bwAbility "Soft Wool", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "Revenge Blast", {
          text "120+ damage. This attack does 30 more damage for each Prize card your opponent has taken."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ETERNATUS_V_SV121:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness F
        move "Power Accelerator", {
          text "30 damage. You may attach a [D] Energy card from your hand to 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Dynamax Cannon", {
          text "120+ damage. If your opponent's Active Pokémon is a Pokémon VMAX , this attack does 120 more damage."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ETERNATUS_VMAX_SV122:
      return evolution (this, from:"Eternatus V", hp:HP340, type:D, retreatCost:3) {
        weakness F
        bwAbility "Eternal Zone", {
          text "If all of your Pokémon in play are [D] type, you can have up to 8 Pokémon on your Bench and you can't put non- [D] Pokémon into play. (If this Ability stops working, discard Pokémon from your Bench until you have 5.)"
          actionA {
          }
        }
        move "Dread End", {
          text "30× damage. This attack does 30 damage for each of your [D] Pokémon in play."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      default:
      return null;
    }
  }
}
