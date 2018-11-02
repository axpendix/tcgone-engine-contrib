package tcgwars.logic.impl.gen7;

import tcgwars.logic.effect.gm.Attack
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
 * @author itrezad@gmail.com
 */
public enum ForbiddenLight implements CardInfo {


	TANGELA_1("Tangela", 1, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	TANGROWTH_2("Tangrowth", 2, Rarity.RARE, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	SCYTHER_3("Scyther", 3, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	PINSIR_4("Pinsir", 4, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
	CHIKORITA_5("Chikorita", 5, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	CHIKORITA_6("Chikorita", 6, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	BAYLEEF_7("Bayleef", 7, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	MEGANIUM_8("Meganium", 8, Rarity.HOLORARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	SPINARAK_9("Spinarak", 9, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	ARIADOS_10("Ariados", 10, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	HOPPIP_11("Hoppip", 11, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	HOPPIP_12("Hoppip", 12, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	SKIPLOOM_13("Skiploom", 13, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	JUMPLUFF_14("Jumpluff", 14, Rarity.HOLORARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	PINECO_15("Pineco", 15, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	SHUCKLE_16("Shuckle", 16, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
	SHUCKLE_GX_17("Shuckle-GX", 17, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	HERACROSS_18("Heracross", 18, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
	CELEBI_PRISM_STAR_19("Celebi Prism Star", 19, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_GRASS_,BASIC]),
	TREECKO_20("Treecko", 20, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	GROVYLE_21("Grovyle", 21, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	SCEPTILE_GX_22("Sceptile-GX", 22, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	WURMPLE_23("Wurmple", 23, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	WURMPLE_24("Wurmple", 24, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	SILCOON_25("Silcoon", 25, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	BEAUTIFLY_26("Beautifly", 26, Rarity.RARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	CASCOON_27("Cascoon", 27, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	DUSTOX_28("Dustox", 28, Rarity.RARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	NINCADA_29("Nincada", 29, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	NINJASK_30("Ninjask", 30, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	COMBEE_31("Combee", 31, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	VESPIQUEN_32("Vespiquen", 32, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	SHAYMIN_33("Shaymin", 33, Rarity.HOLORARE, [POKEMON,_GRASS_,BASIC]),
	VIRIZION_GX_34("Virizion-GX", 34, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	SKIDDO_35("Skiddo", 35, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
	GOGOAT_36("Gogoat", 36, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	TAPU_BULU_37("Tapu Bulu", 37, Rarity.HOLORARE, [POKEMON,_GRASS_,BASIC]),
	MOLTRES_38("Moltres", 38, Rarity.RARE, [POKEMON,_FIRE_,BASIC]),
	CYNDAQUIL_39("Cyndaquil", 39, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	CYNDAQUIL_40("Cyndaquil", 40, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	QUILAVA_41("Quilava", 41, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	TYPHLOSION_42("Typhlosion", 42, Rarity.HOLORARE, [POKEMON,_FIRE_,STAGE2,EVOLUTION]),
	SLUGMA_43("Slugma", 43, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	MAGCARGO_GX_44("Magcargo-GX", 44, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	HOUNDOUR_45("Houndour", 45, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	HOUNDOOM_46("Houndoom", 46, Rarity.RARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	ENTEI_47("Entei", 47, Rarity.RARE, [POKEMON,_FIRE_,BASIC]),
	HEATRAN_48("Heatran", 48, Rarity.HOLORARE, [POKEMON,_FIRE_,BASIC]),
	VICTINI_49("Victini", 49, Rarity.RARE, [POKEMON,_FIRE_,BASIC]),
	LITLEO_50("Litleo", 50, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	PYROAR_51("Pyroar", 51, Rarity.RARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	BLACEPHALON_GX_52("Blacephalon-GX", 52, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	ALOLAN_VULPIX_53("Alolan Vulpix", 53, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	SLOWPOKE_54("Slowpoke", 54, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	SLOWKING_55("Slowking", 55, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	LAPRAS_56("Lapras", 56, Rarity.RARE, [POKEMON,_WATER_,BASIC]),
	DELIBIRD_57("Delibird", 57, Rarity.UNCOMMON, [POKEMON,_WATER_,BASIC]),
	MANTINE_58("Mantine", 58, Rarity.UNCOMMON, [POKEMON,_WATER_,BASIC]),
	SUICUNE_59("Suicune", 59, Rarity.HOLORARE, [POKEMON,_WATER_,BASIC]),
	SUICUNE_GX_60("Suicune-GX", 60, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
	CUBCHOO_61("Cubchoo", 61, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	BEARTIC_62("Beartic", 62, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	WHITE_KYUREM_63("White Kyurem", 63, Rarity.HOLORARE, [POKEMON,_WATER_,BASIC]),
	POPPLIO_64("Popplio", 64, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	POPPLIO_65("Popplio", 65, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	BRIONNE_66("Brionne", 66, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	PRIMARINA_67("Primarina", 67, Rarity.RARE, [POKEMON,_WATER_,STAGE2,EVOLUTION]),
	MAREANIE_68("Mareanie", 68, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	TOXAPEX_69("Toxapex", 69, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	BRUXISH_70("Bruxish", 70, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	ELECTABUZZ_71("Electabuzz", 71, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,BASIC]),
	ELECTIVIRE_72("Electivire", 72, Rarity.RARE, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	CHINCHOU_73("Chinchou", 73, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	LANTURN_74("Lanturn", 74, Rarity.RARE, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	MAREEP_75("Mareep", 75, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	MAREEP_76("Mareep", 76, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	FLAAFFY_77("Flaaffy", 77, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	AMPHAROS_78("Ampharos", 78, Rarity.HOLORARE, [POKEMON,_LIGHTNING_,STAGE2,EVOLUTION]),
	RAIKOU_79("Raikou", 79, Rarity.RARE, [POKEMON,_LIGHTNING_,BASIC]),
	PACHIRISU_80("Pachirisu", 80, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	BLITZLE_81("Blitzle", 81, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	ZEBSTRIKA_82("Zebstrika", 82, Rarity.RARE, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	STUNFISK_83("Stunfisk", 83, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	DEDENNE_84("Dedenne", 84, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
	TAPU_KOKO_85("Tapu Koko", 85, Rarity.HOLORARE, [POKEMON,_LIGHTNING_,BASIC]),
	ZERAORA_GX_86("Zeraora-GX", 86, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	NATU_87("Natu", 87, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
	XATU_88("Xatu", 88, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	ESPEON_89("Espeon", 89, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	UNOWN_90("Unown", 90, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
	UNOWN_91("Unown", 91, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
	UNOWN_92("Unown", 92, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
	WOBBUFFET_93("Wobbuffet", 93, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
	GIRAFARIG_94("Girafarig", 94, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,BASIC]),
	SHEDINJA_95("Shedinja", 95, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	SABLEYE_96("Sableye", 96, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,BASIC]),
	GIRATINA_97("Giratina", 97, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
	SIGILYPH_GX_98("Sigilyph-GX", 98, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
	YAMASK_99("Yamask", 99, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
	COFAGRIGUS_100("Cofagrigus", 100, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	LITWICK_101("Litwick", 101, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
	LAMPENT_102("Lampent", 102, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	CHANDELURE_103("Chandelure", 103, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
	MELOETTA_104("Meloetta", 104, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
	MAREANIE_105("Mareanie", 105, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
	NIHILEGO_106("Nihilego", 106, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
	POIPOLE_107("Poipole", 107, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
	NAGANADEL_108("Naganadel", 108, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	ONIX_109("Onix", 109, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	SUDOWOODO_110("Sudowoodo", 110, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,BASIC]),
	PHANPY_111("Phanpy", 111, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	DONPHAN_112("Donphan", 112, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	HITMONTOP_113("Hitmontop", 113, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,BASIC]),
	LARVITAR_114("Larvitar", 114, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	LARVITAR_115("Larvitar", 115, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	PUPITAR_116("Pupitar", 116, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	CARBINK_117("Carbink", 117, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	ALOLAN_MEOWTH_118("Alolan Meowth", 118, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
	ALOLAN_PERSIAN_119("Alolan Persian", 119, Rarity.UNCOMMON, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
	UMBREON_120("Umbreon", 120, Rarity.RARE, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
	TYRANITAR_GX_121("Tyranitar-GX", 121, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
	ALOLAN_DIGLETT_122("Alolan Diglett", 122, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
	ALOLAN_DUGTRIO_123("Alolan Dugtrio", 123, Rarity.UNCOMMON, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
	FORRETRESS_124("Forretress", 124, Rarity.RARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
	STEELIX_125("Steelix", 125, Rarity.RARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
	SCIZOR_126("Scizor", 126, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
	DIALGA_127("Dialga", 127, Rarity.HOLORARE, [POKEMON,_METAL_,BASIC]),
	DURANT_128("Durant", 128, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
	COBALION_129("Cobalion", 129, Rarity.HOLORARE, [POKEMON,_METAL_,BASIC]),
	GENESECT_GX_130("Genesect-GX", 130, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
	MAGEARNA_131("Magearna", 131, Rarity.UNCOMMON, [POKEMON,_METAL_,BASIC]),
	ALOLAN_NINETALES_GX_132("Alolan Ninetales-GX", 132, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	JIGGLYPUFF_133("Jigglypuff", 133, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	WIGGLYTUFF_134("Wigglytuff", 134, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	MARILL_135("Marill", 135, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	AZUMARILL_136("Azumarill", 136, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	SNUBBULL_137("Snubbull", 137, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	GRANBULL_138("Granbull", 138, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	RALTS_139("Ralts", 139, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	KIRLIA_140("Kirlia", 140, Rarity.UNCOMMON, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	GARDEVOIR_141("Gardevoir", 141, Rarity.HOLORARE, [POKEMON,_FAIRY_,STAGE2,EVOLUTION]),
	DEDENNE_142("Dedenne", 142, Rarity.UNCOMMON, [POKEMON,_FAIRY_,BASIC]),
	CARBINK_143("Carbink", 143, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	XERNEAS_PRISM_STAR_144("Xerneas Prism Star", 144, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_FAIRY_,BASIC]),
	CUTIEFLY_145("Cutiefly", 145, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	RIBOMBEE_146("Ribombee", 146, Rarity.RARE, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	MORELULL_147("Morelull", 147, Rarity.COMMON, [POKEMON,_FAIRY_,BASIC]),
	SHIINOTIC_148("Shiinotic", 148, Rarity.UNCOMMON, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	MIMIKYU_GX_149("Mimikyu-GX", 149, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
	TAPU_LELE_150("Tapu Lele", 150, Rarity.HOLORARE, [POKEMON,_FAIRY_,BASIC]),
	TAPU_FINI_151("Tapu Fini", 151, Rarity.HOLORARE, [POKEMON,_FAIRY_,BASIC]),
	CHANSEY_152("Chansey", 152, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	BLISSEY_153("Blissey", 153, Rarity.HOLORARE, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	DITTO_PRISM_STAR_154("Ditto Prism Star", 154, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_COLORLESS_,BASIC]),
	EEVEE_155("Eevee", 155, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	STANTLER_156("Stantler", 156, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
	SMEARGLE_157("Smeargle", 157, Rarity.RARE, [POKEMON,_COLORLESS_,BASIC]),
	MILTANK_158("Miltank", 158, Rarity.RARE, [POKEMON,_COLORLESS_,BASIC]),
	LUGIA_GX_159("Lugia-GX", 159, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	HO_OH_160("Ho-Oh", 160, Rarity.RARE, [POKEMON,_COLORLESS_,BASIC]),
	KECLEON_161("Kecleon", 161, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
	KECLEON_162("Kecleon", 162, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
	PIKIPEK_163("Pikipek", 163, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	PIKIPEK_164("Pikipek", 164, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	TRUMBEAK_165("Trumbeak", 165, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	TOUCANNON_166("Toucannon", 166, Rarity.RARE, [POKEMON,_COLORLESS_,STAGE2,EVOLUTION]),
	ADVENTURE_BAG_167("Adventure Bag", 167, Rarity.UNCOMMON, [TRAINER,ITEM]),
	AETHER_FOUNDATION_EMPLOYEE_168("Aether Foundation Employee", 168, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	CHOICE_HELMET_169("Choice Helmet", 169, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	COUNTER_GAIN_170("Counter Gain", 170, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	CUSTOM_CATCHER_171("Custom Catcher", 171, Rarity.UNCOMMON, [TRAINER,ITEM]),
	ELECTROPOWER_172("Electropower", 172, Rarity.UNCOMMON, [TRAINER,ITEM]),
	FABA_173("Faba", 173, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	FAIRY_CHARM_[G]_174("Fairy Charm [G]", 174, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	FAIRY_CHARM_[P]_175("Fairy Charm [P]", 175, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	FAIRY_CHARM_[F]_176("Fairy Charm [F]", 176, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	FAIRY_CHARM_[N]_177("Fairy Charm [N]", 177, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	HEAT_FACTORY_PRISM_STAR_178("Heat Factory Prism Star", 178, Rarity.HOLORARE, [PRISM_STAR,TRAINER,STADIUM]),
	KAHILI_179("Kahili", 179, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	LIFE_FOREST_PRISM_STAR_180("Life Forest Prism Star", 180, Rarity.HOLORARE, [PRISM_STAR,TRAINER,STADIUM]),
	LOST_BLENDER_181("Lost Blender", 181, Rarity.UNCOMMON, [TRAINER,ITEM]),
	LUSAMINE_PRISM_STAR_182("Lusamine Prism Star", 182, Rarity.HOLORARE, [PRISM_STAR,TRAINER,SUPPORTER]),
	MINA_183("Mina", 183, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	MIXED_HERBS_184("Mixed Herbs", 184, Rarity.UNCOMMON, [TRAINER,ITEM]),
	MOOMOO_MILK_185("Moomoo Milk", 185, Rarity.UNCOMMON, [TRAINER,ITEM]),
	MORTY_186("Morty", 186, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	NET_BALL_187("Net Ball", 187, Rarity.UNCOMMON, [TRAINER,ITEM]),
	PROFESSOR_ELM_S_LECTURE_188("Professor Elm's Lecture", 188, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	SIGHTSEER_189("Sightseer", 189, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	SPELL_TAG_190("Spell Tag", 190, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	THUNDER_MOUNTAIN_PRISM_STAR_191("Thunder Mountain Prism Star", 191, Rarity.HOLORARE, [PRISM_STAR,TRAINER,STADIUM]),
	WAIT_AND_SEE_HAMMER_192("Wait and See Hammer", 192, Rarity.UNCOMMON, [TRAINER,ITEM]),
	WHITNEY_193("Whitney", 193, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	MEMORY_ENERGY_194("Memory Energy", 194, Rarity.UNCOMMON, [ENERGY,SPECIAL_ENERGY]),
	SHUCKLE_GX_195("Shuckle-GX", 195, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	SCEPTILE_GX_196("Sceptile-GX", 196, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	VIRIZION_GX_197("Virizion-GX", 197, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	MAGCARGO_GX_198("Magcargo-GX", 198, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	BLACEPHALON_GX_199("Blacephalon-GX", 199, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	SUICUNE_GX_200("Suicune-GX", 200, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
	ZERAORA_GX_201("Zeraora-GX", 201, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	SIGILYPH_GX_202("Sigilyph-GX", 202, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
	TYRANITAR_GX_203("Tyranitar-GX", 203, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
	GENESECT_GX_204("Genesect-GX", 204, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
	ALOLAN_NINETALES_GX_205("Alolan Ninetales-GX", 205, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	MIMIKYU_GX_206("Mimikyu-GX", 206, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
	LUGIA_GX_207("Lugia-GX", 207, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	FABA_208("Faba", 208, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	JUDGE_209("Judge", 209, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	KAHILI_210("Kahili", 210, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	MINA_211("Mina", 211, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	MORTY_212("Morty", 212, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	PROFESSOR_ELM_S_LECTURE_213("Professor Elm's Lecture", 213, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	WHITNEY_214("Whitney", 214, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	SHUCKLE_GX_215("Shuckle-GX", 215, Rarity.SECRET, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	SCEPTILE_GX_216("Sceptile-GX", 216, Rarity.SECRET, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	VIRIZION_GX_217("Virizion-GX", 217, Rarity.SECRET, [POKEMON_GX,POKEMON,_GRASS_,BASIC]),
	MAGCARGO_GX_218("Magcargo-GX", 218, Rarity.SECRET, [POKEMON_GX,POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	BLACEPHALON_GX_219("Blacephalon-GX", 219, Rarity.SECRET, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	SUICUNE_GX_220("Suicune-GX", 220, Rarity.SECRET, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
	ZERAORA_GX_221("Zeraora-GX", 221, Rarity.SECRET, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	SIGILYPH_GX_222("Sigilyph-GX", 222, Rarity.SECRET, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
	TYRANITAR_GX_223("Tyranitar-GX", 223, Rarity.SECRET, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
	GENESECT_GX_224("Genesect-GX", 224, Rarity.SECRET, [POKEMON_GX,POKEMON,_METAL_,BASIC]),
	ALOLAN_NINETALES_GX_225("Alolan Ninetales-GX", 225, Rarity.SECRET, [POKEMON_GX,POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	MIMIKYU_GX_226("Mimikyu-GX", 226, Rarity.SECRET, [POKEMON_GX,POKEMON,_FAIRY_,BASIC]),
	LUGIA_GX_227("Lugia-GX", 227, Rarity.SECRET, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	ADVENTURE_BAG_228("Adventure Bag", 228, Rarity.SECRET, [TRAINER,ITEM]),
	CHOICE_HELMET_229("Choice Helmet", 229, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
	COUNTER_GAIN_230("Counter Gain", 230, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
	CUSTOM_CATCHER_231("Custom Catcher", 231, Rarity.SECRET, [TRAINER,ITEM]),
	ELECTROPOWER_232("Electropower", 232, Rarity.SECRET, [TRAINER,ITEM]),
	LOST_BLENDER_233("Lost Blender", 233, Rarity.SECRET, [TRAINER,ITEM]),
	NET_BALL_234("Net Ball", 234, Rarity.SECRET, [TRAINER,ITEM]),
	SPELL_TAG_235("Spell Tag", 235, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	LostThunder(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.LOST_THUNDER;
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
			case TANGELA_1:
			return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Gentle Slap" , {
					text "20 damage."
					energyCost C,C
					onAttack{
						damage 20
					}
				}
				move "Bind" , {
					text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost G,C,C
					onAttack{
						damage 40
						flipThenApplySC PARALYZED
					}
				}
			};
			case TANGROWTH_2:
			return 	evolution (this, from:"Tangela", hp:HP140, type:GRASS, retreatCost:3) {
				weakness FIRE
				customAbility {
					delayedA {
						before REMOVE_DAMAGE_COUNTER, self, {
							bg.em().storeObject("Hefty_Whip", bg.turnCount)
						}
					}
				}
				move "Hefty Whip" , {
					text "30+ damage. If this Pokémon was healed during this turn, this attack does 130 more damage."
					energyCost G,C,C
					onAttack {
						damage 30
						if(bg.em().retrieveObject("Hefty_Whip") == bg.turnCount) damage 130
					}
				}
				move "Whip Smash" , {
					text "110 damage."
					energyCost G,G,C,C
					onAttack{
						damage 110
					}
				}
			};
			case SCYTHER_3:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Fury Cutter" , {
					text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 20 more damage. If 2 of them are heads, this attack does 50 more damage. If all of them are heads, this attack does 70 more damage."
					energyCost C,C
					onAttack{
						damage 10
						flip 3,{},{},[1:{damage 20},2:{damage 50},3:{damage 70}]
					}
				}
			};
			case PINSIR_4:
			return basic (this, hp:HP110, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Grip and Squeeze" , {
					text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn.\n"
					energyCost G
					onAttack{
						damage 20
						cantRetreat(defending)
					}
				}
				move "Hammer In" , {
					text "70 damage."
					energyCost C,C,C
					onAttack{
						damage 70
					}
				}
			};
			case CHIKORITA_5:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Synthesis" , {
					text "Search your deck for a [G] energy and attach it to 1 of your Pokémon. Then shuffle your deck."
					energyCost C
					attackRequirement {
						assert deck
					}
					onAttack {
						deck.search (basicEnergyFilter(G)).each {attachEnergy(my.all.select(),it)}
						shuffleDeck()
					}
				}
				move "Razor Leaf" , {
					text "20 damage."
					energyCost G,C
					onAttack{
						damage 20
					}
				}
			};
			case CHIKORITA_6:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Mini Drain" , {
					text "10 damage. Heal 10 damage from this Pokémon."
					energyCost G
					onAttack{
						damage 10
						heal 10, self
					}
				}
			};
			case BAYLEEF_7:
			return 	evolution (this, from:"Chikorita", hp:HP100, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Soothing Scent" , {
					text "20 damage. Your opponent's Active Pokémon is now Asleep."
					energyCost G
					onAttack{
						damage 20
						applyAfterDamage ASLEEP
					}
				}
				move "Razor Leaf" , {
					text "50 damage."
					energyCost G,C,C
					onAttack{
						damage 50
					}
				}
			};
			case MEGANIUM_8:
			return 	evolution (this, from:"Bayleef", hp:HP150, type:GRASS, retreatCost:2) {
				weakness FIRE
				bwAbility "Quick-Ripening Herb" , {
					text "Once during your turn (before your attack), you may use this Ability. Choose 1 of your Basic Pokémon in play. If you have a Stage 2 card in your hand that evolves from that Pokémon, put that card onto the Basic Pokémon to evolve it. You can use this Ability during your first turn or on a Pokémon that was put into play this turn."
					actionA{
						checkLastTurn()
						assert my.all.filterByType(BASIC)
						def tar = my.all.filterByType(BASIC).select("Choose the pokemon to be evolved")
						def possibleEvolutions = my.hand.filterByType(STAGE2).findAll{
							tar.name == EvolutionChains.getBasicsFromStage2(it.name)
						}
						assert possibleEvolutions : "there is no pokémon in your hand $tar can evolve to"
						powerUsed()
						def stage2 = possibleEvolutions.select("choose a pokémon to evolve $tar").first()
						evolve(tar, stage2)
					}
				}
				move "Solar Beam" , {
					text "110 damage."
					energyCost G,C,C,C
					onAttack{
						damage 110
					}
				}
			};
			case SPINARAK_9:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Spider Hide" , {
					text "Your opponent's Active Pokémon is now Paralyzed and Poisoned. Put this Pokémon and all cards attached to it in the Lost Zone.\n"
					energyCost G
					onAttack{
						apply PARALYZED
						apply POISONED
						self.cards.moveTo(my.lostZone)
            removePCS(self)
					}
				}
				move "Sting" , {
					text "10 damage."
					energyCost C
					onAttack{
						damage 10
					}
				}
			};
			case ARIADOS_10:
			return 	evolution (this, from:"Spinarak", hp:HP110, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Trap Thread" , {
					text "30 damage. Whenever your opponent plays an Item or Supporter card from their hand during their next turn, prevent all effects of that card done to the Defending Pokémon.\n"
					energyCost C,C
					onAttack{
						damage 30
						//Prevent effect of item & supporter on the defending
					}
				}
				move "Poison Jab" , {
					text "70 damage. Your opponent's Active Pokémon is now Poisoned."
					energyCost G,C,C
					onAttack{
						damage 70
						applyAfterDamage POISONED
					}
				}
			};
			case HOPPIP_11:
			return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Multiply" , {
					text "Search your deck for Hoppip and put it onto your Bench. Then, shuffle your deck."
					energyCost C
					callForFamily(name:"Hoppip",1,delegate)
				}
			};
			case HOPPIP_12:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Tackle" , {
					text "20 damage."
					energyCost G
					onAttack{
						damage 20
					}
				}
			};
			case SKIPLOOM_13:
			return 	evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Floral Path to the Sky" , {
					text "Once during your turn (before your attack), you may search your deck for Jumpluff, put this Pokémon and all cards attached to it in the Lost Zone, and put that Jumpluff in its place. Then, shuffle your deck."
					actionA{
						checkLastTurn()
						assert my.deck
						powerUsed()
						def tar = my.deck.search(count:1,"Search 1 Jumpluff",{it.name.contains("Jumpluff"))
						if (tar){
							self.cards.moveTo(my.lostZone)
							removePCS(self)
							benchPCS(tar)
						}
					}
				}
				move "Tackle" , {
					text "30 damage."
					energyCost G
					onAttack{
						damage 30
					}
				}
			};
			case JUMPLUFF_14:
			return 	evolution (this, from:"Skiploom", hp:HP070, type:GRASS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Lost March" , {
					text "20× damage. This attack does 20 damage for each of your Pokémon, except Prism Star Pokémon, in the Lost Zone."
					energyCost G
					onAttack{
						damage 20*my.lostZone.findAll{it.cardTypes.is(POKEMON) && !it.cardTypes.is(PRISM_STAR)}
					}
				}
			};
			case PINECO_15:
			return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Continuous Headbutt" , {
					text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
					energyCost C
					onAttack{
						flipUntilTails{damage 20}
					}
				}
			};
			case SHUCKLE_16:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				bwAbility "Fresh Squeezed" , {
					text "When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for up to 3 basic Energy cards and discard them. Then, shuffle your deck."
					onActivate {r->
						if(r==PLAY_FROM_HAND) {
							if(my.deck && confirm("Use Fresh Squeezed?")) {
								powerUsed()
								my.deck.search (max: 3, basicEnergyFilter(G)).discard()
							}
						}
					}
				}
				move "Energy Drink" , {
					text "Attach 2 basic Energy cards from your discard pile to your Pokémon in any way you like."
					energyCost G
					onAttack{
						attachEnergyFrom(basic:true,my.discard, my.all)
						attachEnergyFrom(basic:true,my.discard, my.all)
					}
				}
			};
			case SHUCKLE_GX_17:
			return basic (this, hp:HP170, type:GRASS, retreatCost:1) {
				weakness FIRE
				bwAbility "Protective Shell" , {
					text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon that have 2 or fewer Energy attached to them."
					delayedA{
						before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner != self.owner && ef.attacker.owner.cards.filterByType(ENERGY).size() <= 2) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Protective Shell prevent damage from Pokémon that have 2 or fewer Energy attached to them"
                    it.dmg = 0
                  }
                }
              }
            }
					}
				}
				move "Triple Poison" , {
					text "Your opponent's Active Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns.\n"
					energyCost C
					onAttack{
						apply POISONED
						extraPoison 2
					}
				}
				move "Wrap GX" , {
					text "40 damage. Your opponent's Active Pokémon is now Paralyzed. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						damage 40
						applyAfterDamage PARALYZED
					}
				}
			};
			case HERACROSS_18:
			return basic (this, hp:HP120, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Tackle" , {
					text "20 damage."
					energyCost C
					onAttack{
						damage 20
					}
				}
				move "Powerful Friends" , {
					text "30+ damage. If you have any Stage 2 Pokémon on your Bench, this attack does 90 more damage."
					energyCost G,C
					damage 30
					if(my.bench.filterByType(STAGE2)) {damage 90}
				}
			};
			case CELEBI_PRISM_STAR_19:
			return basic (this, hp:HP090, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Time Distortion" , {
					text "Devolve any number of your Benched Pokémon as many times as you like. Put each Evolution card removed this way into your hand.\n"
					energyCost C
					onAttack{
						def pcs
						if(my.bench.findAll{it.evolution}){
							pcs = my.bench.findAll{it.evolution}.select(min:0, max:1, "select one Pokémon to devolve")
							while(my.bench.findAll{it.evolution} && pcs)){
								def top=pcs.topPokemonCard
								bc "$top Devolved"
								moveCard(top, opp.hand)
								devolve(pcs, top)
								pcs = my.bench.findAll{it.evolution}.select(min:0, max:1, "select one Pokémon to devolve")
							}
						}

					}
				}
				move "Leech Seed" , {
					text "20 damage. Heal 20 damage from this Pokémon.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
					energyCost G
					onAttack{
						damage 20
						heal 20, self
					}
				}
			};
			case TREECKO_20:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Find a Friend" , {
					text "Search your deck for a [G] Pokémon and put it into your hand. Shuffle your deck"
					energyCost G
					attackRequirement{
						assert my.deck : "there is no more cards in your deck."
					}
					onAttack{
						my.deck.search(count:1,"Select a [G] Pokémon to put on your hand",{it.asPokemonCard().types.contains(G)}).moveTo(my.hand)
						shuffleDeck()
					}
				}
			};
			case GROVYLE_21:
			return 	evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				bwAbility "Sunshine Grace" , {
					text "Once during your turn (before your attack), you may search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
					actionA {
						checkLastTurn()
						assert my.deck.notEmpty
						powerUsed()
						my.deck.search (pokemonTypeFilter(G)).showToOpponent("Selected card.").moveTo(my.hand)
						shuffleDeck()
					}
				}
				move "Slicing Blade" , {
					text "40 damage."
					energyCost G,G
					onAttack{
						damage 40
					}
				}
			};
			case SCEPTILE_GX_22:
			return 	evolution (this, from:"Grovyle", hp:HP230, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Mach Cut" , {
					text "60 damage. Discard a Special Energy from your opponent's Active Pokémon."
					energyCost G
					onAttack{
						damage 60
						if(defending.cards.filterByType(SPECIAL_ENERGY)) defending.cards.filterByType(SPECIAL_ENERGY).select("select the special energy to discard").discard()
					}
				}
				move "Leaf Cyclone" , {
					text "130 damage. Move a [G] energy from this Pokémon to 1 of your benched Pokémon."
					energyCost G,G
					onAttack{
						damage 130
						if(my.bench){
							moveEnergy(type:G,self,my.bench.select("Which pokémon will recieve the [G] Energy?"))
						}
					}
				}
				move "Jungle Heal GX" , {
					text "Heal all damage from each of your Pokémon that has any [G] Energy attached to it"
					energyCost G
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						my.all.each{
							if(it.cards.energyCount(G)){
								heal it.damage.value, it

							}
						}

					}
				}
			};
			case WURMPLE_23:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Ram" , {
					text "10 damage."
					energyCost C
					onAttack{
						damage 10
					}
				}
			};
			case WURMPLE_24:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Poison Sting" , {
					text "Your opponent's Active Pokémon is now Poisoned."
					energyCost G
					onAttack{
						apply POISONED
					}
				}
			};
			case SILCOON_25:
			return 	evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:3) {
				weakness FIRE
				move "Cocoon Collector" , {
					text "Search your deck for up to 4 in any combination of Silcoon and Cascoon and put them onto your Bench. Then, shuffle your deck.\n"
					energyCost C
					attackRequirement {
						assert my.deck.notEmpty
						assert my.bench.notFull
					}
					onAttack {
						def maxSpace = Math.min(my.bench.freeBenchCount,4)
							deck.search (max: maxSpace,{it.name.contains("Silcoon") || it.name.contains("Cascoon")}).each{
								deck.remove(it)
								benchPCS(it)
							}
						}
						shuffleDeck()
					}
				}
				move "Rolling Tackle" , {
					text "20 damage."
					energyCost G
					onAttack{
						damage 20
					}
				}
			};
			case BEAUTIFLY_26:
			return 	evolution (this, from:"Silcoon", hp:HP130, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Skill Dive" , {
					text "This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost C
					onAttack{
						damage 50, opp.all.select("Choose the targeted Pokémon.")
					}
				}
				move "Butterfly Edge" , {
					text "30 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
					energyCost G
					onAttack{
						damage 100
						delayed {
							def pcs = defending
							after KNOCKOUT, pcs, {
								preventAllEffectsNextTurn()
							}
							unregisterAfter 1
						}
					}
				}
			};
			case CASCOON_27:
			return 	evolution (this, from:"Wurmple", hp:HP070, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Cocoon Collector" , {
					text "Search your deck for up to 4 in any combination of Silcoon and Cascoon and put them onto your Bench. Then, shuffle your deck.\n"
					energyCost C
					attackRequirement {
						assert my.deck.notEmpty
						assert my.bench.notFull
					}
					onAttack {
						def maxSpace = Math.min(my.bench.freeBenchCount,4)
							deck.search (max: maxSpace,{it.name.contains("Silcoon") || it.name.contains("Cascoon")}).each{
								deck.remove(it)
								benchPCS(it)
							}
						}
						shuffleDeck()
					}
				}
				move "Ram" , {
					text "30 damage."
					energyCost G,C
					onAttack{
						damage 30
					}
				}
			};
			case DUSTOX_28:
			return 	evolution (this, from:"Cascoon", hp:HP140, type:GRASS, retreatCost:2) {
				weakness FIRE
				bwAbility "Hazardous Evolution" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may leave your opponent's Active Pokémon Paralyzed and Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns."
					onActivate{->
						if(r==PLAY_FROM_HAND) {
							if(confirm("Use Hazardous Evolution?")) {
								apply POISONED, opp.active
								apply PARALYZED, opp.active
							}
						}

					}
				}
				move "Gust" , {
					text "70 damage."
					energyCost G,C
					onAttack{
						damage 70
					}
				}
			};
			case NINCADA_29:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Fury Swipes" , {
					text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
					energyCost C
					onAttack{
						flip 3, {damage 10}
					}
				}
			};
			case NINJASK_30:
			return 	evolution (this, from:"Nincada", hp:HP080, type:GRASS, retreatCost:0) {
				bwAbility "Molting" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put a Shedinja from your discard pile onto your Bench."
					onActivate{->
						if(r==PLAY_FROM_HAND) {
							if(my.discard.findAll{it.name.contains(Shedinja)} && my.bench.notFull && confirm("Use Molting?")) {
								def pcs = my.discard.findAll{it.name.contains(Shedinja)}.select("Select the card to put on the bench")
							}
						}
					}
				}
				move "X-Scissor" , {
					text "40+ damage. Flip a coin. If heads, this attack does 40 more damage."
					energyCost G
					onAttack{
						damage 40
						flip {damage 40}
					}
				}
			};
			case COMBEE_31:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Bee March" , {
					text "Search your deck for up to 3 Combee and put them onto your Bench. Then, shuffle your deck."
					energyCost G
					callForFamily(name:"Combee",3,delegate)
				}
			};
			case VESPIQUEN_32:
			return 	evolution (this, from:"Combee", hp:HP120, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Queen Command" , {
					text "120 damage. If you have 4 or fewer [G] Pokémon on your bench this attack does nothing"
					energyCost G
					onAttack{
						if(my.bench.findAll{it.types.contains(G)}.size() > 4){
							damage 120
						}
					}
				}
			};
			case SHAYMIN_33:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				bwAbility "Floral Heal" , {
					text "Once during your turn (before your attack), you may heal 20 damage from your Active [G] Pokémon."
					actionA{
						checkLastTurn()
						powerUsed()
						if(my.active.types.contains(G)){
							heal 20, my.active
						}
					}
				}
				move "Ram" , {
					text "30"
					energyCost G,C
					onAttack{
						damage 30
					}
				}
			};
			case VIRIZION_GX_34:
			return basic (this, hp:HP170, type:GRASS, retreatCost:2) {
				weakness FIRE
				customAbility {
					delayedA {
						before PLAY_TRAINER, {
							if (ef.cardToPlay.cardTypes.is(SUPPORTER) && bg.currentTurn == self.owner) {
								bg.em().storeObject("Sensitive_Blade", bg.turnCount)
							}
						}
					}
				}

				move "Double Draw" , {
					text "Draw 2 cards."
					energyCost C
					onAttack{
						draw 2
					}
				}
				move "Sensitive Blade" , {
					text "50+ damage. If you played a Supporter card from your hand during this turn, this attack does 80 more damage.\n"
					energyCost G,G
					onAttack {
						damage 50
						if(bg.em().retrieveObject("Hefty_Whip") == bg.turnCount) damage 80
					}
				}
				move "Breeze Away GX" , {
					text "Put any number of your Pokémon in play and all cards attached to them into your hand. (You can't use more than 1 GX attack in a game.)"
					energyCost C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						while(my.all){
							def tar = my.all.findAll{true}.select("Select a Pokémon to put in your hand.")
							if(tar){
								tar.cards.moveTo(my.hand)
								removePCS(tar)
							}
							else{
								break
							}
						}
					}
				}
			};
			case SKIDDO_35:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Collect" , {
					text "Draw a card."
					energyCost C
					onAttack{
						draw 1
					}
				}
				move "Vine Whip" , {
					text "20 damage."
					energyCost G,C
					onAttack{
						damage 20
					}
				}
			};
			case GOGOAT_36:
			return 	evolution (this, from:"Skiddo", hp:HP130, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Leaf Wallop" , {
					text "40 damage. During your next turn, this Pokémon's Leaf Wallop attack does 50 more damage (before applying Weakness and Resistance).\n"
					energyCost C,C
					onAttack{
						damage 40
						increasedBaseDamageNextTurn("Leaf Wallop",hp(50))
					}
				}
				move "Solar Beam" , {
					text "100 damage."
					energyCost G,G,C
					onAttack{
						damage 100
					}
				}
			};
			case TAPU_BULU_37:
			return basic (this, hp:HP130, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Heavy Punch" , {
					text "20× damage. This attack does 20 damage for each of your opponent's Bench Pokémon.\n"
					energyCost G,C
					onAttack{
						damage 20*opp.bench.size()
					}
				}
				move "Wild Tackle" , {
					text "120 damage. Flip a coin. If tails, this Pokémon does 30 damage to itself."
					energyCost G,G,C
					onAttack{
						damage 120
						flip 1,{},{damage 30,self}
					}
				}
			};
			case MOLTRES_38:
			return basic (this, hp:HP120, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Assisting Heater" , {
					text "30 damage. You may attach a"
					energyCost R
				}
				move "Fire Wing" , {
					text "90 damage."
					energyCost R,R,C
				}
			};
			case CYNDAQUIL_39:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Smokescreen" , {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R
				}
			};
			case CYNDAQUIL_40:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Hammer In" , {
					text "30 damage."
					energyCost C,C
				}
			};
			case QUILAVA_41:
			return 	evolution (this, from:"Cyndaquil", hp:HP090, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Hammer In" , {
					text "30 damage."
					energyCost C,C
				}
				move "Super Singe" , {
					text "60 damage. Your opponent's Active Pokémon is now Burned."
					energyCost R,R,R
				}
			};
			case TYPHLOSION_42:
			return 	evolution (this, from:"Quilava", hp:HP160, type:FIRE, retreatCost:2) {
				weakness WATER
				bwAbility "Blazing Energy" , {
					text "Once during your turn (before your attack), you may use this Ability. All Energy attached to your Pokémon are [R] Energy instead of their usual type until the end of your turn. (This includes cards that come into play on this turn.)"
				}
				move "Lost Flame" , {
					text "120 damage. Put 2 Energy attached to your opponent's Active Pokémon in the Lost Zone."
					energyCost R,R,R,R
				}
			};
			case SLUGMA_43:
			return basic (this, hp:HP080, type:FIRE, retreatCost:3) {
				weakness WATER
				move "Stampede" , {
					text "20 damage."
					energyCost C,C
				}
				move "Flamethrower" , {
					text "60 damage. Discard an Energy from this Pokémon."
					energyCost R,R,C
				}
			};
			case MAGCARGO_GX_44:
			return 	evolution (this, from:"Slugma", hp:HP210, type:FIRE, retreatCost:3) {
				weakness WATER
				bwAbility "Crushing Charge" , {
					text "Once during your turn (before your attack), you may discard the top card of your deck. If it's a basic Energy card, attach it to 1 of your Pokémon."
				}
				move "Lava Flow" , {
					text "50+ damage. Discard any amount of basic Energy from this Pokémon. This attack does 50 more damage for each card you discarded in this way.\n"
					energyCost R,R,C
				}
				move "Burning Magma GX" , {
					text "Discard the top 5 cards of your opponent's deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case HOUNDOUR_45:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Team Hunt" , {
					text "Draw a card for each of your Houndour in play.\n"
					energyCost C
				}
				move "Flare" , {
					text "10 damage."
					energyCost R
				}
			};
			case HOUNDOOM_46:
			return 	evolution (this, from:"Houndour", hp:HP110, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Nasty Plot" , {
					text "Search your deck for a card and put it into your hand. Then, shuffle your deck.\n"
					energyCost C
				}
				move "Operation Attack" , {
					text "50+ damage. If you have more cards in your hand than your opponent, this attack does 80 more damage."
					energyCost R,R
				}
			};
			case ENTEI_47:
			return basic (this, hp:HP130, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Fire Fang" , {
					text "20 damage. Your opponent's Active Pokémon is now Burned.\n"
					energyCost R,C
				}
				move "Eruption" , {
					text "80+ damage. Each player discards the top card of their deck. This attack does 60 more damage for each Energy card discarded in this way."
					energyCost R,R,C
				}
			};
			case HEATRAN_48:
			return basic (this, hp:HP140, type:FIRE, retreatCost:4) {
				weakness WATER
				move "Lava Burn" , {
					text "60 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost R,C,C
				}
				move "Heat Bazooka" , {
					text "150 damage. Discard the top 5 cards of your deck."
					energyCost R,R,C,C
				}
			};
			case VICTINI_49:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "V-Beatdown" , {
					text "20× damage. This attack does 20 damage for each of your Basic Pokémon in play."
					energyCost R,C
				}
			};
			case LITLEO_50:
			return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
				weakness WATER
				bwAbility "Wild Dash" , {
					text "If your opponent has any Pokémon-GX or Pokémon-EX in play, this Pokémon has no Retreat Cost."
				}
				move "Take Down" , {
					text "30 damage. This Pokémon does 10 damage to itself."
					energyCost C,C
				}
			};
			case PYROAR_51:
			return 	evolution (this, from:"Litleo", hp:HP130, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Crunch" , {
					text "30 damage. Discard an Energy from your opponent's Active Pokémon.\n"
					energyCost C,C
				}
				move "Heat Blast" , {
					text "90 damage."
					energyCost R,C,C
				}
			};
			case BLACEPHALON_GX_52:
			return basic (this, hp:HP180, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Bursting Burn" , {
					text "Your opponent's Active Pokémon is now Burned and Confused.\n"
					energyCost R
				}
				move "Mind Blown" , {
					text "50× damage. Put any number of"
					energyCost R,R
				}
				move "Burst GX" , {
					text "Discard 1 of your Prize cards. If it's an Energy card, attach it to 1 of your Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case ALOLAN_VULPIX_53:
			return basic (this, hp:HP060, type:HP060, retreatCost:1) {
				weakness METAL
				bwAbility "Secret Alleyway" , {
					text "If you have any [Y] Pokémon in play, this Pokémon has no Retreat Cost."
				}
				move "Gnaw" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case SLOWPOKE_54:
			return basic (this, hp:HP070, type:HP070, retreatCost:2) {
				weakness GRASS
				move "Yawn" , {
					text "Your opponent's Active Pokémon is now Asleep."
					energyCost C
				}
			};
			case SLOWKING_55:
			return 	evolution (this, from:"Slowpoke", hp:HP120, type:WATER, retreatCost:2) {
				weakness GRASS
				move "Memory Melt" , {
					text "Look at your opponent's hand and put a card you find there in the Lost Zone.\n"
					energyCost W
				}
				move "Psychic" , {
					text "60+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
					energyCost C,C,C
				}
			};
			case LAPRAS_56:
			return basic (this, hp:HP120, type:WATER, retreatCost:2) {
				weakness METAL
				bwAbility "Go for a Swing" , {
					text "Once during your turn (before your attack), you may look at the top 2 cards of your deck and put them back in any order."
				}
				move "Ice Beam" , {
					text "50 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost W,C
				}
			};
			case DELIBIRD_57:
			return basic (this, hp:HP090, type:WATER, retreatCost:1) {
				weakness METAL
				move "Happy Delivery" , {
					text "Choose any number of your Benched Pokémon that don't already have a Pokémon Tool attached to them. For each of those Pokémon, search your deck for a Pokémon Tool card and attach it to that Pokémon. Then, shuffle your deck.\n"
					energyCost C
				}
				move "Flap" , {
					text "30 damage."
					energyCost C,C
				}
			};
			case MANTINE_58:
			return basic (this, hp:HP120, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Mantine Surf" , {
					text "If this Pokémon has any Energy attached to it, it has no Retreat Cost."
				}
				move "Surf" , {
					text "100 damage."
					energyCost W,W,C
				}
			};
			case SUICUNE_59:
			return basic (this, hp:HP110, type:WATER, retreatCost:1) {
				weakness GRASS
				bwAbility "Frozen Current" , {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
				}
				move "Aurora Gain" , {
					text "70 damage. Heal 30 damage from this Pokémon."
					energyCost W,C,C
				}
			};
			case SUICUNE_GX_60:
			return basic (this, hp:HP180, type:WATER, retreatCost:2) {
				weakness GRASS
				bwAbility "Phantom Winds" , {
					text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may shuffle it and all cards attached to it into your deck."
				}
				move "Cure Stream" , {
					text "120 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance).\n"
					energyCost W,W,C
				}
				move "Brinicles GX" , {
					text "150 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost W,W,C
				}
			};
			case CUBCHOO_61:
			return basic (this, hp:HP070, type:WATER, retreatCost:2) {
				weakness METAL
				move "Secondary Chills" , {
					text "You can use this attack only if you go second, and only on your first turn. Your opponent's Active Pokémon is now Paralyzed.\n"
					energyCost C
				}
				move "Beat" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case BEARTIC_62:
			return 	evolution (this, from:"Cubchoo", hp:HP140, type:WATER, retreatCost:3) {
				weakness METAL
				move "Resolute Claws" , {
					text "60+ damage. If your opponent's Active Pokémon is a Pokémon-GX or a Pokémon-EX, this attack does 60 more damage (before applying Weakness and Resistance).\n"
					energyCost W,C,C
				}
				move "Blizzard Burn" , {
					text "150 damage. This Pokémon can't attack during your next turn."
					energyCost W,C,C,C
				}
			};
			case WHITE_KYUREM_63:
			return basic (this, hp:HP130, type:WATER, retreatCost:3) {
				weakness METAL
				move "Field Crush" , {
					text "30 damage. If your opponent has a Stadium in play, discard it.\n"
					energyCost C,C
				}
				move "Freezing Flames" , {
					text "80+ damage. If this Pokémon has any"
					energyCost W,W,C
				}
			};
			case POPPLIO_64:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Disarming Voice" , {
					text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Confused."
					energyCost W,C
				}
			};
			case POPPLIO_65:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Blot" , {
					text "10 damage. Heal 10 damage from this Pokémon."
					energyCost W
				}
			};
			case BRIONNE_66:
			return 	evolution (this, from:"Popplio", hp:HP090, type:WATER, retreatCost:2) {
				weakness GRASS
				move "Captivate" , {
					text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon.\n"
					energyCost W
				}
				move "Water Gun" , {
					text "20 damage."
					energyCost W
				}
			};
			case PRIMARINA_67:
			return 	evolution (this, from:"Brionne", hp:HP150, type:WATER, retreatCost:2) {
				weakness GRASS
				bwAbility "Harmonics" , {
					text "Whenever you attach an Energy card from your hand to 1 of your Pokémon, except with an attack, Ability, or Trainer card, attach up to 2 Energy cards to that Pokémon instead of 1."
				}
				move "Hypno Splash" , {
					text "80 damage. Your opponent's Active Pokémon is now Asleep."
					energyCost W,C,C
				}
			};
			case MAREANIE_68:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Spike Cannon" , {
					text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
					energyCost W
				}
			};
			case TOXAPEX_69:
			return 	evolution (this, from:"Mareanie", hp:HP120, type:WATER, retreatCost:3) {
				weakness GRASS
				move "Poison Sting" , {
					text "Your opponent's Active Pokémon is now Poisoned.\n"
					energyCost W
				}
				move "Venom Fever" , {
					text "50× damage. If your opponent's Active Pokémon is Poisoned, this attack does 50 damage for each damage counter on it."
					energyCost W,W
				}
			};
			case BRUXISH_70:
			return basic (this, hp:HP090, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Mind Bend" , {
					text "20 damage. Your opponent's Active Pokémon is now Confused.\n"
					energyCost W
				}
				move "Follow the Wound" , {
					text "This attack does 60 damage to 1 of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W,C
				}
			};
			case ELECTABUZZ_71:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Thunder Shock" , {
					text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost L,C
				}
			};
			case ELECTIVIRE_72:
			return 	evolution (this, from:"Electabuzz", hp:HP140, type:LIGHTNING, retreatCost:4) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Electrocharge" , {
					text "Search your deck for up to 2"
					energyCost C
				}
				move "High-Voltage Knuckle" , {
					text "190 damage. Discard 3 Energy from this Pokémon."
					energyCost L,L,L,C
				}
			};
			case CHINCHOU_73:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Thunder Wave" , {
					text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
					energyCost C
				}
				move "Lightning Ball" , {
					text "20 damage."
					energyCost L,C
				}
			};
			case LANTURN_74:
			return 	evolution (this, from:"Chinchou", hp:HP110, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Salvage" , {
					text "Shuffle 4 cards from your discard pile into your deck.\n"
					energyCost C
				}
				move "Signal Beam" , {
					text "50 damage. Your opponent's Active Pokémon is now Confused."
					energyCost L,C
				}
			};
			case MAREEP_75:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Fluffy Pillow" , {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, you may leave your opponent's Active Pokémon Asleep."
				}
				move "Tackle" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case MAREEP_76:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Thunder Shock" , {
					text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost L
				}
			};
			case FLAAFFY_77:
			return 	evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Signal Beam" , {
					text "40 damage. Your opponent's Active Pokémon is now Confused."
					energyCost L,L
				}
			};
			case AMPHAROS_78:
			return 	evolution (this, from:"Flaaffy", hp:HP150, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Unseen Flash" , {
					text "Once during your turn (before your attack), you may put 2 [L] Energy cards from your hand in the Lost Zone. If you do, your opponent's Active Pokémon is now Paralyzed."
				}
				move "Split Bomb" , {
					text "This attack does 50 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L,L
				}
			};
			case RAIKOU_79:
			return basic (this, hp:HP120, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Lost Voltage" , {
					text "30+ damage. If you have any"
					energyCost L,C
				}
			};
			case PACHIRISU_80:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Overshort" , {
					text "20+ damage. Before doing damage, discard all Pokémon Tool cards from your opponent's Active Pokémon. If you discarded a Pokémon Tool card in this way, this attack does 40 more damage, and your opponent's Active Pokémon is now Paralyzed."
					energyCost L
				}
			};
			case BLITZLE_81:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Flop" , {
					text "10 damage."
					energyCost C
				}
				move "Zap Kick" , {
					text "20 damage."
					energyCost L,C
				}
			};
			case ZEBSTRIKA_82:
			return 	evolution (this, from:"Blitzle", hp:HP110, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Sprint" , {
					text "Once during your turn (before your attack), you may discard your hand and draw 4 cards."
				}
				move "Head Bolt" , {
					text "60 damage."
					energyCost L,C
				}
			};
			case STUNFISK_83:
			return basic (this, hp:HP110, type:LIGHTNING, retreatCost:3) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Flail" , {
					text "10× damage. This attack does 10 damage for each damage counter on this Pokémon.\n"
					energyCost C
				}
				move "Thunder Blast" , {
					text "50 damage. Discard a"
					energyCost L
				}
			};
			case DEDENNE_84:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Nuzzle" , {
					text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
					energyCost L
				}
				move "Nuzzle Shot" , {
					text "This attack does 10 damage for each of your Pokémon in play that has the Nuzzle attack to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L
				}
			};
			case TAPU_KOKO_85:
			return basic (this, hp:HP120, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Strafe" , {
					text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon.\n"
					energyCost C,C
				}
				move "Flashing Bolt" , {
					text "120 damage. This Pokémon can't use Flashing Bolt during your next turn."
					energyCost L,L,C
				}
			};
			case ZERAORA_GX_86:
			return basic (this, hp:HP190, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Thunderclap Zone" , {
					text "Each of your Pokémon that has any [L] Energy attached to it has no Retreat Cost."
				}
				move "Plasma Fists" , {
					text "160 damage. This Pokémon can't attack during your next turn.\n"
					energyCost L,L,C
				}
				move "Full Voltage GX" , {
					text "Attach 5 basic Energy cards from your discard pile to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost L
				}
			};
			case NATU_87:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Lost March" , {
					text "20× damage. This attack does 20 damage for each of your Pokémon, excluding Prism Star Pokémon, in the Lost Zone."
					energyCost C,C
				}
			};
			case XATU_88:
			return 	evolution (this, from:"Natu", hp:HP100, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Energy Gaze" , {
					text "30+ damage. Your opponent reveals their hand. If you find any Energy cards there, this attack does 60 more damage.\n"
					energyCost C,C
				}
				move "Psychic Sphere" , {
					text "80 damage."
					energyCost P,C,C
				}
			};
			case ESPEON_89:
			return 	evolution (this, from:"Eevee", hp:HP090, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Allure" , {
					text "Draw 3 cards.\n"
					energyCost C
				}
				move "Energy Crush" , {
					text "20+ damage. This attack does 20 more damage times the amount of Energy attached to all of your opponent's Pokémon."
					energyCost P
				}
			};
			case UNOWN_90:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				bwAbility "DAMAGE" , {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, and if there are 66 or more damage counters on your Benched Pokémon, you may use this Ability. If you do, you win this game."
				}
				move "Hidden Power" , {
					text "10 damage."
					energyCost P
				}
			};
			case UNOWN_91:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				bwAbility "HAND" , {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, and if you have 35 or more cards in your hand, you may use this Ability. If you do, you win this game."
				}
				move "Hidden Power" , {
					text "10 damage."
					energyCost P
				}
			};
			case UNOWN_92:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				bwAbility "MISSING" , {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, and if your opponent has 12 or more Supporter cards in the Lost Zone, you may use this Ability. If you do, you win this game."
				}
				move "Hidden Power" , {
					text "10 damage."
					energyCost P
				}
			};
			case WOBBUFFET_93:
			return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				bwAbility "Shady Tail" , {
					text "As long as this Pokémon is on your Bench, Pokémon Prism Star in play (both yours and your opponent's) can't attack and have no Abilities."
				}
				move "Knock Away" , {
					text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
					energyCost P,C
				}
			};
			case GIRAFARIG_94:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Get Lost" , {
					text "Put 2 cards from your opponent's discard pile in the Lost Zone.\n"
					energyCost C
				}
				move "Mind Shock" , {
					text "70 damage. This attack's damage isn't affected by Weakness or Resistance."
					energyCost C,C,C
				}
			};
			case SHEDINJA_95:
			return 	evolution (this, from:"Nincada", hp:HP040, type:PSYCHIC, retreatCost:1) {
				bwAbility "Vessel of Life" , {
					text "Once during your turn (before your attack), you may discard all cards attached to this Pokémon and attach it to 1 of your Pokémon as a Pokémon Tool card. When the Pokémon this card is attached to is Knocked Out, your opponent takes 1 fewer Prize card."
				}
				move "Haunt" , {
					text "Put 3 damage counters on your opponent's Active Pokémon."
					energyCost C
				}
			};
			case SABLEYE_96:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				move "Quick Hunt" , {
					text "If you go first, you can use this attack on your first turn. Search your deck for a card and put it into your hand. Then, shuffle your deck.\n"
					energyCost C
				}
				move "Cursed Drop" , {
					text "Put 3 damage counters on your opponent's Pokémon in any way you like."
					energyCost P
				}
			};
			case GIRATINA_97:
			return basic (this, hp:HP130, type:PSYCHIC, retreatCost:3) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				bwAbility "Distortion Door" , {
					text "Once during your turn (before your attack), if this Pokémon is in your discard pile, you may put it onto your Bench. If you do, put 1 damage counter on 2 of your opponent's Benched Pokémon."
				}
				move "Shadow Impact" , {
					text "130 damage. Put 4 damage counters on 1 of your Pokémon."
					energyCost P,P,C
				}
			};
			case SIGILYPH_GX_98:
			return basic (this, hp:HP170, type:PSYCHIC, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Mirror Counter" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an attack from your opponent's Pokémon-GX or Pokémon-EX (even if this Pokémon is Knocked Out), put damage counters on the Attacking Pokémon equal to the damage done to this Pokémon."
				}
				move "Sonic Wing" , {
					text "80 damage. This attack's damage isn't affected by Resistance.\n"
					energyCost P,C,C
				}
				move "Intercept GX" , {
					text "60× damage. This attack does 60 damage times the amount of Energy attached to your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost P,C,C
				}
			};
			case YAMASK_99:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				move "Haunt" , {
					text "Put 1 damage counter on your opponent's Active Pokémon."
					energyCost P
				}
			};
			case COFAGRIGUS_100:
			return 	evolution (this, from:"Yamask", hp:HP120, type:PSYCHIC, retreatCost:3) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				move "Soul Juggling" , {
					text "10+ damage. Discard any number of you Benched Pokémon. This attack does 30 more damage for each Benched Pokémon you discarded in this way."
					energyCost P,C
				}
			};
			case LITWICK_101:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				move "Haunt" , {
					text "Put 1 damage counter on your opponent's Active Pokémon."
					energyCost P
				}
			};
			case LAMPENT_102:
			return 	evolution (this, from:"Litwick", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				move "Haunt" , {
					text "Put 3 damage counters on your opponent's Active Pokémon."
					energyCost P
				}
			};
			case CHANDELURE_103:
			return 	evolution (this, from:"Chandelure", hp:HP140, type:PSYCHIC, retreatCost:2) {
				weakness DARKNESS
				resistance FIGHTING, MINUS20
				move "Cursed Drop" , {
					text "Put 4 damage counters on your opponent's Pokémon in any way you like.\n"
					energyCost P
				}
				move "Vortex of Pain" , {
					text "20× damage. This attack does 20 damage for each damage counter on all of your opponent's Pokémon."
					energyCost P,P
				}
			};
			case MELOETTA_104:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Sing" , {
					text "Your opponent's Active Pokémon is now Asleep.\n"
					energyCost C
				}
				move "Miracle Harmony" , {
					text "Flip a coin for each of your Pokémon that has the Sing attack. This attack does 10 damage for each heads to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P,C,C
				}
			};
			case MAREANIE_105:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Peck" , {
					text "10 damage."
					energyCost C
				}
				move "Pin Missile" , {
					text "10× damage. Flip 4 coins. This attack does 10 damage for each heads."
					energyCost P,C
				}
			};
			case NIHILEGO_106:
			return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Nightcap" , {
					text "You can use this attack only if your opponent has exactly 2 Prize cards remaining. Choose 1 of your opponent's Pokémon's attacks and use it as this attack.\n"
					energyCost P
				}
				move "Void Tentacles" , {
					text "Your opponent's Active Pokémon is now Confused and Poisoned."
					energyCost P
				}
			};
			case POIPOLE_107:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Eye Opener" , {
					text "Look at your face-down Prize cards.\n"
					energyCost C
				}
				move "Peck" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case NAGANADEL_108:
			return 	evolution (this, from:"Poipole", hp:HP130, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Turning Point" , {
					text "80+ damage. If you have exactly 3 Prize cards remaining, this attack does 80 more damage."
					energyCost C,C,C
				}
			};
			case ONIX_109:
			return basic (this, hp:HP120, type:FIGHTING, retreatCost:4) {
				weakness GRASS
				move "Land Crush" , {
					text "120 damage."
					energyCost C,C,C,C
				}
			};
			case SUDOWOODO_110:
			return basic (this, hp:HP110, type:FIGHTING, retreatCost:2) {
				weakness WATER
				move "Reply Strongly" , {
					text "20+ damage. If this Pokémon was damaged by an attack during your opponent's last turn while it was your Active Pokémon, this attack does 80 more damage."
					energyCost F
				}
			};
			case PHANPY_111:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				move "Last Resort" , {
					text "50 damage. Flip a coin. If tails, this attack does nothing."
					energyCost F,C
				}
			};
			case DONPHAN_112:
			return 	evolution (this, from:"Phanpy", hp:HP130, type:FIGHTING, retreatCost:3) {
				weakness GRASS
				bwAbility "Sturdy" , {
					text "If this Pokémon has full HP and would be Knocked Out by damage from an attack, this Pokémon is not Knocked Out, and its remaining HP becomes 10."
				}
				move "Rolling Spin" , {
					text "70 damage. During your next turn, this Pokémon's Rolling Spin attack does 70 more damage (before applying Weakness and Resistance)."
					energyCost F,C,C
				}
			};
			case HITMONTOP_113:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Rapid Spin" , {
					text "30 damage. Switch this Pokémon with 1 of your Benched Pokémon. If you do, your opponent switches their Active Pokémon with 1 of their Benched Pokémon.\n"
					energyCost F
				}
				move "Triple Kick" , {
					text "40× damage. Flip 3 coins. This attack does 40 damage for each heads."
					energyCost C,C,C
				}
			};
			case LARVITAR_114:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				bwAbility "Submerge" , {
					text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's)."
				}
				move "Bite" , {
					text "10 damage."
					energyCost C
				}
			};
			case LARVITAR_115:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Second Strike" , {
					text "10+ damage. If your opponent's Active Pokémon already has 3 or more damage counters on it, this attack does 70 more damage."
					energyCost C,C
				}
			};
			case PUPITAR_116:
			return 	evolution (this, from:"Larvitar", hp:HP070, type:FIGHTING, retreatCost:3) {
				weakness GRASS
				bwAbility "Hard Shell Evolution" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all damage done to this Pokémon by your opponent's attacks until the end of your opponent's next turn."
				}
				move "Hammer In" , {
					text "30 damage."
					energyCost C,C,C
				}
			};
			case CARBINK_117:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Diamond Gate" , {
					text "Search your deck for a Supporter card and a Stadium card, reveal them, and put them into your hand. Then, shuffle your deck.\n"
					energyCost F
				}
				move "Guard Press" , {
					text "60 damage. During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
					energyCost F,F,C
				}
			};
			case ALOLAN_MEOWTH_118:
			return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				move "Spoil the Fun" , {
					text "10+ damage. If you go second, this attack does 60 more damage on your first turn."
				}
			};
			case ALOLAN_PERSIAN_119:
			return 	evolution (this, from:"Alolan Meowth", hp:HP090, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				move "Empty Threat" , {
					text "90- damage. This attack 30 less damage times the amount of Energy attached to your opponent's Active Pokémon."
				}
			};
			case UMBREON_120:
			return 	evolution (this, from:"Eevee", hp:HP110, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				move "Retaliate" , {
					text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage.\n"
					energyCost D
				}
				move "Dark Cutter" , {
					text "60 damage."
					energyCost D,C
				}
			};
			case TYRANITAR_GX_121:
			return 	evolution (this, from:"Pupitar", hp:HP250, type:DARKNESS, retreatCost:3) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				bwAbility "Lost Out" , {
					text "If your opponent's Pokémon is Knocked Out by damage from this Pokémon's attacks, put that Pokémon and all cards attached to it in the Lost Zone instead of the discard pile."
				}
				move "Dusty Ruckus" , {
					text "130 damage. This attack does 30 damage to each of your opponent's Benched Basic Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost D,D,C
				}
				move "Lay the Smackdown GX" , {
					text "220 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost D,D,C
				}
			};
			case ALOLAN_DIGLETT_122:
			return basic (this, hp:HP050, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Call for Family" , {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
				}
			};
			case ALOLAN_DUGTRIO_123:
			return 	evolution (this, from:"Alolan Diglett", hp:HP090, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Digging Dash" , {
					text "60 damage. This attack's damage isn't affected by Weakness or Resistance."
				}
			};
			case FORRETRESS_124:
			return 	evolution (this, from:"Pineco", hp:HP110, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Thorny Eruption" , {
					text "Flip 3 coins. This attack does 10 damage for each heads to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost M
				}
				move "Lost Blast" , {
					text "190 damage. Put this Pokémon and all cards attached to it in the Lost Zone."
					energyCost M,M,C
				}
			};
			case STEELIX_125:
			return 	evolution (this, from:"Onix", hp:HP180, type:METAL, retreatCost:4) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Hammer In" , {
					text "90 damage."
					energyCost M,C,C
				}
				move "Iron Tackle" , {
					text "170 damage. This Pokémon does 50 damage to itself."
					energyCost M,C,C,C
				}
			};
			case SCIZOR_126:
			return 	evolution (this, from:"Scyther", hp:HP120, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				bwAbility "Exoskeleton" , {
					text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
				}
				move "Special Blow" , {
					text "60+ damage. If your opponent's Active Pokémon has any Special Energy attached to it, this attack does 70 more damage."
					energyCost M,C
				}
			};
			case DIALGA_127:
			return basic (this, hp:HP130, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Turn Back Time" , {
					text "60 damage. If your opponent's Active Pokémon is an evolved Pokémon, devolve it by putting the highest Stage Evolution card on it into your opponent's hand.\n"
					energyCost M,C,C
				}
				move "Power Blast" , {
					text "130 damage. Discard an Energy from this Pokémon."
					energyCost M,M,C,C
				}
			};
			case DURANT_128:
			return basic (this, hp:HP080, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Knock Over" , {
					text "20 damage. You may discard any Stadium card in play.\n"
					energyCost C
				}
				move "Mountain Munch" , {
					text "Discard the top 2 cards of your opponent's deck."
					energyCost C,C
				}
			};
			case COBALION_129:
			return basic (this, hp:HP120, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Guard Press" , {
					text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).\n"
					energyCost M,C
				}
				move "Metal Arms" , {
					text "80+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 40 more damage."
					energyCost M,M,C
				}
			};
			case GENESECT_GX_130:
			return basic (this, hp:HP180, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				bwAbility "Double Drive" , {
					text "This Pokémon may have up to 2 Pokémon Tool cards attached to it. If it loses this Ability, discard Pokémon Tool cards from it until only 1 remains."
				}
				move "Burst Shot" , {
					text "130 damage."
					energyCost M,M,C
				}
				move "Break Buster GX" , {
					text "190 damage. This attack's damage isn't affected by Resistance. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost M,M,C
				}
			};
			case MAGEARNA_131:
			return basic (this, hp:HP090, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Minor Errand-Running" , {
					text "Search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.\n"
					energyCost C
				}
				move "Energy Press" , {
					text "30+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
					energyCost M,C
				}
			};
			case ALOLAN_NINETALES_GX_132:
			return 	evolution (this, from:"Alolan Vulpix", hp:HP200, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Mysterious Guidance" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck."
				}
				move "Snowy Wind" , {
					text "70 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost Y,C
				}
				move "Sublimation GX" , {
					text "If your opponent's Active Pokémon is an Ultra Beast, it is Knocked Out. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y,C
				}
			};
			case JIGGLYPUFF_133:
			return basic (this, hp:HP070, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Pound" , {
					text "10 damage."
					energyCost Y
				}
				move "Sing" , {
					text "Your opponent's Active Pokémon is now Asleep."
					energyCost C,C
				}
			};
			case WIGGLYTUFF_134:
			return 	evolution (this, from:"Jigglypuff", hp:HP120, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Expand" , {
					text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).\n"
					energyCost C,C
				}
				move "Charmed Slap" , {
					text "70+ damage. If this Pokémon has a Pokémon Tool card that has &#8220;Fairy Charm&#8221; in its name attached to it, this attack does 70 more damage."
					energyCost Y,C,C
				}
			};
			case MARILL_135:
			return basic (this, hp:HP070, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Magical Shot" , {
					text "30 damage."
					energyCost Y,C
				}
			};
			case AZUMARILL_136:
			return 	evolution (this, from:"Marill", hp:HP100, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Polka-Dot Search" , {
					text "Look at the top 8 cards of your deck and attach any number of Energy cards you find there to your Pokémon in any way you like. Shuffle the other cards back into your deck.\n"
					energyCost Y
				}
				move "Play Rough" , {
					text "60+ damage. Flip a coin. If heads, this attack does 30 more damage."
					energyCost Y,C,C
				}
			};
			case SNUBBULL_137:
			return basic (this, hp:HP070, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Make a Mess" , {
					text "20× damage. Discard up to 2 Trainer cards from your hand. This attack does 20 damage for each card you discarded in this way."
					energyCost Y
				}
			};
			case GRANBULL_138:
			return 	evolution (this, from:"Snubbull", hp:HP130, type:FAIRY, retreatCost:3) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "All Out" , {
					text "30+ damage. If you have no cards in your hand, this attack does 130 more damage.\n"
					energyCost Y
				}
				move "Giant Fang" , {
					text "110 damage."
					energyCost Y,Y,Y
				}
			};
			case RALTS_139:
			return basic (this, hp:HP050, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Beckon" , {
					text "Put a Supporter card from your discard pile into your hand.\n"
					energyCost Y
				}
				move "Beat" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case KIRLIA_140:
			return 	evolution (this, from:"Ralts", hp:HP080, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Beat" , {
					text "20 damage."
					energyCost C,C
				}
				move "Disarming Voice" , {
					text "50 damage. Your opponent's Active Pokémon is now Confused."
					energyCost Y,C,C
				}
			};
			case GARDEVOIR_141:
			return 	evolution (this, from:"Kirlia", hp:HP130, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Brilliant Search" , {
					text "Search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck.\n"
					energyCost Y
				}
				move "Sensitive Ray" , {
					text "70+ damage. If you played a Supporter card from your hand during this turn, this attack does 90 more damage."
					energyCost Y,C,C
				}
			};
			case DEDENNE_142:
			return basic (this, hp:HP070, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Zzzap Touch" , {
					text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Confused. If tails, your opponent's Active Pokémon is now Paralyzed."
					energyCost Y
				}
			};
			case CARBINK_143:
			return basic (this, hp:HP090, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Wonder Ray" , {
					text "30 damage. During your opponent's next turn, prevent all effects of attacks, including damage, done to this Pokémon by any Pokémon that has an Ability.\n"
					energyCost C,C
				}
				move "Power Gem" , {
					text "60 damage."
					energyCost Y,C,C
				}
			};
			case XERNEAS_PRISM_STAR_144:
			return basic (this, hp:HP160, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Path of Life" , {
					text "Once during your turn, when this Pokémon moves from your Bench to become your Active Pokémon, you may move any number of Energy from your other Pokémon to it."
				}
				move "Bright Horns" , {
					text "160 damage. This Pokémon can't use Bright Horns during your next turn.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
					energyCost Y,Y,Y
				}
			};
			case CUTIEFLY_145:
			return basic (this, hp:HP030, type:FAIRY, retreatCost:0) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Sweet Scent" , {
					text "Heal 30 damage from 1 of your Pokémon."
					energyCost C
				}
			};
			case RIBOMBEE_146:
			return 	evolution (this, from:"Cutiefly", hp:HP060, type:FAIRY, retreatCost:0) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Mysterious Buzz" , {
					text "As long as this Pokémon is on your Bench, whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to your [Y] Pokémon in play."
				}
				move "Stampede" , {
					text "20 damage."
					energyCost Y
				}
			};
			case MORELULL_147:
			return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Perplex" , {
					text "Your opponent's Active Pokémon is now Confused."
					energyCost Y
				}
			};
			case SHIINOTIC_148:
			return 	evolution (this, from:"Morelull", hp:HP100, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Effect Spore" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Asleep."
				}
				move "Dream's Touch" , {
					text "50 damage. If your opponent's Active Pokémon is Asleep, your opponent shuffles all Energy from it into their deck."
					energyCost Y,Y
				}
			};
			case MIMIKYU_GX_149:
			return basic (this, hp:HP170, type:FAIRY, retreatCost:1) {
				move "Perplex" , {
					text "Your opponent's Active Pokémon is now Confused.\n"
					energyCost Y
				}
				move "Let's Snuggle & Fall" , {
					text "10+ damage. This attack does 30 more damage for each damage counter on your opponent's Active Pokémon.\n"
					energyCost Y,C
				}
				move "Dream Fear GX" , {
					text "Choose 1 of your opponent's Benched Pokémon. Your opponent shuffles that Pokémon and all cards attached to it into their deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y
				}
			};
			case TAPU_LELE_150:
			return basic (this, hp:HP110, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Charmed Charm" , {
					text "Whenever you attach a Pokémon Tool card that has &#8220;Fairy Charm&#8221; in its name from your hand to this Pokémon during your turn, you may leave your opponent's Active Pokémon Confused."
				}
				move "Magical Shot" , {
					text "70 damage."
					energyCost Y,C,C
				}
			};
			case TAPU_FINI_151:
			return basic (this, hp:HP120, type:FAIRY, retreatCost:1) {
				weakness METAL
				resistance DARKNESS, MINUS20
				move "Dream Away" , {
					text "Flip a coin. If heads, your opponent shuffles their Active Pokémon and all cards attached to it into their deck.\n"
					energyCost Y,C
				}
				move "Wonder Shine" , {
					text "100 damage. Your opponent's Active Pokémon is now Confused."
					energyCost Y,Y,C
				}
			};
			case CHANSEY_152:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Healing Pirouette" , {
					text "Heal 20 damage from each of your Pokémon.\n"
					energyCost C
				}
				move "Sympathetic Slap" , {
					text "100 damage. If your opponent's Active Pokémon already has any damage counters on it before this attack does damage, this attack does nothing."
					energyCost C,C,C
				}
			};
			case BLISSEY_153:
			return 	evolution (this, from:"Chansey", hp:HP160, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				bwAbility "Happiness Supplement" , {
					text "Once during your turn (before your attack), you may remove a Special Condition from your Active Pokémon."
				}
				move "Powerful Slap" , {
					text "80× damage. Flip a coin for each Energy attached to this Pokémon. This attack does 80 damage for each heads."
					energyCost C,C,C
				}
			};
			case DITTO_PRISM_STAR_154:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				bwAbility "Almighty Evolution" , {
					text "Once during your turn (before your attack), you may put any Stage 1 card from your hand onto this Pokémon to evolve it. You can't use this Ability during your first turn or on the turn this Pokémon was put into play.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
				}
			};
			case EEVEE_155:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Gnaw" , {
					text "20 damage."
					energyCost C
				}
			};
			case STANTLER_156:
			return basic (this, hp:HP110, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Mystifying Horns" , {
					text "Your opponent's Active Pokémon is now Confused.\n"
					energyCost C
				}
				move "Enhanced Horns" , {
					text "20+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 60 more damage."
					energyCost C,C
				}
			};
			case SMEARGLE_157:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				move "Stunning Likeness" , {
					text "Your opponent reveals their hand. You may use the effect of a Supporter card you find there as the effect of this attack.\n"
					energyCost C
				}
				move "Tail Smash" , {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
				}
			};
			case MILTANK_158:
			return basic (this, hp:HP130, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				move "Milk Cannon" , {
					text "60× damage. Reveal any number of Moomoo Milk cards in your hand. This attack does 60 damage for each card you revealed in this way."
					energyCost C,C,C
				}
			};
			case LUGIA_GX_159:
			return basic (this, hp:HP190, type:COLORLESS, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Psychic" , {
					text "30+ damage. This attack does 30 more damage times the amount of Energy attached to your opponent's Active Pokémon.\n"
					energyCost C,C,C
				}
				move "Pelagic Blade" , {
					text "170 damage. This Pokémon can't use Pelagic Blade during your next turn.\n"
					energyCost C,C,C,C
				}
				move "Lost Purge GX" , {
					text "Put your opponent's Active Pokémon and all cards attached to it in the Lost Zone. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C,C,C
				}
			};
			case HO_OH_160:
			return basic (this, hp:HP130, type:COLORLESS, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Rainbow Burn" , {
					text "30+ damage. This attack does 30 more damage for each type of basic Energy card attached to this Pokémon."
					energyCost C,C,C
				}
			};
			case KECLEON_161:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				bwAbility "Unit Color 1" , {
					text "As long as this Pokémon has Unit Energy [G][R][W] attached to it, it is a [G], [R], and [W] Pokémon."
				}
				move "Tongue Smack" , {
					text "10+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 50 more damage."
					energyCost C
				}
			};
			case KECLEON_162:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				bwAbility "Unit Color 3" , {
					text "As long as this Pokémon has Unit Energy [F][D][Y] attached to it, it is a [F], [D], and [Y] Pokémon."
				}
				move "Gentle Slap" , {
					text "60 damage."
					energyCost C,C
				}
			};
			case PIKIPEK_163:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Peck Off" , {
					text "10 damage. Before doing damage, discard all Pokémon Tool cards attached to your opponent's Active Pokémon."
					energyCost C
				}
			};
			case PIKIPEK_164:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Send Back" , {
					text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon.\n"
					energyCost C
				}
				move "Peck" , {
					text "20 damage."
					energyCost C,C
				}
			};
			case TRUMBEAK_165:
			return 	evolution (this, from:"Pikipek", hp:HP080, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Mountain Migration" , {
					text "Once during your turn (before your attack), if this Pokémon is in your hand, you may reveal it. If you do, look at the top card of your opponent's deck and put this Pokémon in the Lost Zone. If that card is a Supporter card, you may put it in the Lost Zone. If your opponent has no cards in their deck, you can't use this Ability."
				}
				move "Peck" , {
					text "30 damage."
					energyCost C,C
				}
			};
			case TOUCANNON_166:
			return 	evolution (this, from:"Trumbeak", hp:HP140, type:COLORLESS, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Heat Beak" , {
					text "40 damage. Your opponent's Active Pokémon is now Burned.\n"
					energyCost C
				}
				move "Giganticannon" , {
					text "160 damage. If this Pokémon evolved this turn, this attack does nothing."
					energyCost C,C,C
				}
			};
			case ADVENTURE_BAG_167:
			return itemCard (this) {
					text "Search your deck for up to 2 Pokémon Tool cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case AETHER_FOUNDATION_EMPLOYEE_168:
			return supporter(this) {
					text "Put 3 Pokémon that have &#8220;Alolan&#8221; in their names from your discard pile into your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case CHOICE_HELMET_169:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe Pokémon this card is attached to takes 30 less damage from the attacks of your opponent's Pokémon-GX and Pokémon-EX (after applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case COUNTER_GAIN_170:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf you have more Prize cards remaining than your opponent, the attacks of the Pokémon this card is attached to cost [C] less.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case CUSTOM_CATCHER_171:
			return itemCard (this) {
					text "You may play 2 Custom Catcher cards at once.If you played 1 card, draw cards from your deck until you have 3 cards in your hand.If you played 2 cards, switch 1 of your opponent's Benched Pokémon with their Active Pokémon. (This effect works one time for 2 cards.)\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case ELECTROPOWER_172:
			return itemCard (this) {
					text "During this turn, your [L] Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case FABA_173:
			return supporter(this) {
					text "Choose a Pokémon Tool or Special Energy card attached to 1 of your opponent's Pokémon, or any Stadium card in play, and put it in the Lost Zone.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case FAIRY_CHARM_[G]_174:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [G] Pokémon-GX and [G] Pokémon-EX.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case FAIRY_CHARM_[P]_175:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [P] Pokémon-GX and [P] Pokémon-EX.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case FAIRY_CHARM_[F]_176:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [F] Pokémon-GX and [F] Pokémon-EX.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case FAIRY_CHARM_[N]_177:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nPrevent all damage done to the [Y] Pokémon this card is attached to by attacks from your opponent's [N] Pokémon-GX and [N] Pokémon-EX.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case HEAT_FACTORY_PRISM_STAR_178:
			return trainer(this) {
					text "Once during each player's turn, that player may discard a [R] Energy from their hand. If they do, that player draws 3 cards.\nWhenever a player plays an Item or Supporter card from their hand, prevent all effects of that card done to this Stadium card.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
			};
			case KAHILI_179:
			return supporter(this) {
					text "Draw 2 cards. Then, flip a coin. If heads, if you played this Kahili from your hand, put this card into your hand instead of the discard pile. If you have no cards in your deck, you can't play this card.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case LIFE_FOREST_PRISM_STAR_180:
			return trainer(this) {
					text "Once during each player's turn, that player may heal 60 damage and remove all Special Conditions from 1 of their [G] Pokémon.\nWhenever a player plays an Item or Supporter card from their hand, prevent all effects of that card done to this Stadium card.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
			};
			case LOST_BLENDER_181:
			return itemCard (this) {
					text "Put 2 cards from your hand in the Lost Zone. If you do, draw a card.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case LUSAMINE_PRISM_STAR_182:
			return trainer(this) {
					text "You can play this card only if your opponent has exactly 3 Prize cards remaining.\nPrevent all damage done to your Ultra Beasts by attacks during your opponent's next turn.\nYou may play only 1 Supporter card during your turn (before your attack).\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
			};
			case MINA_183:
			return supporter(this) {
					text "Search your deck for a [Y] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case MIXED_HERBS_184:
			return itemCard (this) {
					text "You may play 2 Mixed Herbs cards at once.If you played 1 card, remove a Special Condition from your Active Pokémon.If you played 2 cards, heal 90 damage and remove all Special Conditions from your Active Pokémon. (This effect works one time for 2 cards.)\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case MOOMOO_MILK_185:
			return itemCard (this) {
					text "Choose 1 of your Pokémon, and then flip 2 coins. For each heads, heal 30 damage from that Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case MORTY_186:
			return supporter(this) {
					text "You can play this card only if 1 of your [P] Pokémon was Knocked Out during your opponent's last turn.\nYour opponent reveals their hand. Choose 2 cards you find there. Your opponent shuffles those cards into their deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case NET_BALL_187:
			return itemCard (this) {
					text "Search your deck for a Basic [G] Pokémon or a [G] Energy card, reveal it, and put it into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case PROFESSOR_ELM_S_LECTURE_188:
			return supporter(this) {
					text "Search your deck for up to 3 Pokémon with 60 HP or less, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case SIGHTSEER_189:
			return supporter(this) {
					text "You may discard any number of card from your hand. Then, draw cards until you have 5 cards in your hand. If you can't draw any cards in this way, you can't play this card.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case SPELL_TAG_190:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nWhen the [P] Pokémon this card is attached to is Knocked Out by damage from an opponent's attack, put 4 damage counters on your opponent's Pokémon in any way you like.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case THUNDER_MOUNTAIN_PRISM_STAR_191:
			return trainer(this) {
					text "The attacks of [L] Pokémon (both yours and your opponent's) cost [L] less.\nWhenever any player plays an Item or Supporter card from their hand, prevent all effects of that card done to this Stadium card.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card.\nPrism Star Rule: You can't have more than 1 Prism Star card with the same name in your deck. If a Prism Star card would go to the discard pile, put it in the Lost Zone instead."
			};
			case WAIT_AND_SEE_HAMMER_192:
			return itemCard (this) {
					text "You can use this card only if you go second, and only on your first turn.\nDiscard an Energy from 1 of your opponent's Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case WHITNEY_193:
			return supporter(this) {
					text "Draw a card. Then, draw 2 cards for each other Whitney in your discard pile.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case MEMORY_ENERGY_194:
			return 	specialEnergy (this) {
					text ""
			};
			case SHUCKLE_GX_195:
			return basic (this, hp:HP170, type:GRASS, retreatCost:1) {
				weakness FIRE
				bwAbility "Protective Shell" , {
					text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon that have 2 or fewer Energy attached to them."
				}
				move "Triple Poison" , {
					text "Your opponent's Active Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns.\n"
					energyCost C
				}
				move "Wrap GX" , {
					text "40 damage. Your opponent's Active Pokémon is now Paralyzed. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
				}
			};
			case SCEPTILE_GX_196:
			return 	evolution (this, from:"Grovyle", hp:HP230, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Mach Cut" , {
					text "60 damage. Discard a Special Energy from your opponent's Active Pokémon.\n"
					energyCost G
				}
				move "Leaf Cyclone" , {
					text "130 damage. Move a"
					energyCost G,G
				}
				move "Jungle Heal GX" , {
					text "Heal all damage from each of your Pokémon that has any"
					energyCost G
				}
			};
			case VIRIZION_GX_197:
			return basic (this, hp:HP170, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Double Draw" , {
					text "Draw 2 cards.\n"
					energyCost C
				}
				move "Sensitive Blade" , {
					text "50+ damage. If you played a Supporter card from your hand during this turn, this attack does 80 more damage.\n"
					energyCost G,G
				}
				move "Breeze Away GX" , {
					text "Put any number of your Pokémon in play and all cards attached to them into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
				}
			};
			case MAGCARGO_GX_198:
			return 	evolution (this, from:"Slugma", hp:HP210, type:FIRE, retreatCost:3) {
				weakness WATER
				bwAbility "Crushing Charge" , {
					text "Once during your turn (before your attack), you may discard the top card of your deck. If it's a basic Energy card, attach it to 1 of your Pokémon."
				}
				move "Lava Flow" , {
					text "50+ damage. Discard any amount of basic Energy from this Pokémon. This attack does 50 more damage for each card you discarded in this way.\n"
					energyCost R,R,C
				}
				move "Burning Magma GX" , {
					text "Discard the top 5 cards of your opponent's deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case BLACEPHALON_GX_199:
			return basic (this, hp:HP180, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Bursting Burn" , {
					text "Your opponent's Active Pokémon is now Burned and Confused.\n"
					energyCost R
				}
				move "Mind Blown" , {
					text "50× damage. Put any number of"
					energyCost R,R
				}
				move "Burst GX" , {
					text "Discard 1 of your Prize cards. If it's an Energy card, attach it to 1 of your Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case SUICUNE_GX_200:
			return basic (this, hp:HP180, type:WATER, retreatCost:2) {
				weakness GRASS
				bwAbility "Phantom Winds" , {
					text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may shuffle it and all cards attached to it into your deck."
				}
				move "Cure Stream" , {
					text "120 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance).\n"
					energyCost W,W,C
				}
				move "Brinicles GX" , {
					text "150 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost W,W,C
				}
			};
			case ZERAORA_GX_201:
			return basic (this, hp:HP190, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Thunderclap Zone" , {
					text "Each of your Pokémon that has any [L] Energy attached to it has no Retreat Cost."
				}
				move "Plasma Fists" , {
					text "160 damage. This Pokémon can't attack during your next turn.\n"
					energyCost L,L,C
				}
				move "Full Voltage GX" , {
					text "Attach 5 basic Energy cards from your discard pile to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost L
				}
			};
			case SIGILYPH_GX_202:
			return basic (this, hp:HP170, type:PSYCHIC, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Mirror Counter" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an attack from your opponent's Pokémon-GX or Pokémon-EX (even if this Pokémon is Knocked Out), put damage counters on the Attacking Pokémon equal to the damage done to this Pokémon."
				}
				move "Sonic Wing" , {
					text "80 damage. This attack's damage isn't affected by Resistance.\n"
					energyCost P,C,C
				}
				move "Intercept GX" , {
					text "60× damage. This attack does 60 damage times the amount of Energy attached to your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost P,C,C
				}
			};
			case TYRANITAR_GX_203:
			return 	evolution (this, from:"Pupitar", hp:HP250, type:DARKNESS, retreatCost:3) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				bwAbility "Lost Out" , {
					text "If your opponent's Pokémon is Knocked Out by damage from this Pokémon's attacks, put that Pokémon and all cards attached to it in the Lost Zone instead of the discard pile."
				}
				move "Dusty Ruckus" , {
					text "130 damage. This attack does 30 damage to each of your opponent's Benched Basic Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost D,D,C
				}
				move "Lay the Smackdown GX" , {
					text "220 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost D,D,C
				}
			};
			case GENESECT_GX_204:
			return basic (this, hp:HP180, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				bwAbility "Double Drive" , {
					text "This Pokémon may have up to 2 Pokémon Tool cards attached to it. If it loses this Ability, discard Pokémon Tools cards from it until only 1 remains."
				}
				move "Burst Shot" , {
					text "130 damage."
					energyCost M,M,C
				}
				move "Break Buster GX" , {
					text "190 damage. This attack's damage isn't affected by Resistance. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost M,M,C
				}
			};
			case ALOLAN_NINETALES_GX_205:
			return 	evolution (this, from:"Alolan Vulpix", hp:HP200, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Mysterious Guidance" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck."
				}
				move "Snowy Wind" , {
					text "70 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost Y,C
				}
				move "Sublimation GX" , {
					text "If your opponent's Active Pokémon is an Ultra Beast, it is Knocked Out. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y,C
				}
			};
			case MIMIKYU_GX_206:
			return basic (this, hp:HP170, type:FAIRY, retreatCost:1) {
				move "Perplex" , {
					text "Your opponent's Active Pokémon is now Confused.\n"
					energyCost Y
				}
				move "Let's Snuggle &#038; Fall" , {
					text "10+ damage. This attack does 30 more damage for each damage counter on your opponent's Active Pokémon.\n"
					energyCost Y,C
				}
				move "Dream Fear GX" , {
					text "Choose 1 of your opponent's Benched Pokémon. Your opponent shuffles that Pokémon and all cards attached to it into their deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y
				}
			};
			case LUGIA_GX_207:
			return basic (this, hp:HP190, type:COLORLESS, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Psychic" , {
					text "30+ damage. This attack does 30 more damage times the amount of Energy attached to your opponent's Active Pokémon.\n"
					energyCost C,C,C
				}
				move "Pelagic Blade" , {
					text "170 damage. This Pokémon can't use Pelagic Blade during your next turn.\n"
					energyCost C,C,C,C
				}
				move "Lost Purge GX" , {
					text "Put your opponent's Active Pokémon and all cards attached to it in the Lost Zone. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C,C,C
				}
			};
			case FABA_208:
			return supporter(this) {
					text "Choose a Pokémon Tools or Special Energy card attached to 1 of your opponent's Pokémon, or any Stadium card in play, and put it in the Lost Zone.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case JUDGE_209:
			return supporter(this) {
					text "Each player shuffles their hand into their deck and draws 4 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case KAHILI_210:
			return supporter(this) {
					text "Draw 2 cards. Then, flip a coin. If heads, if you played this Kahili from your hand, put this card into your hand instead of the discard pile. If you have no cards in your deck, you can't play this card.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case MINA_211:
			return supporter(this) {
					text "Search your deck for a [Y] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case MORTY_212:
			return supporter(this) {
					text "You can play this card only if 1 of your [P] Pokémon was Knocked Out during your opponent's last turn.\nYour opponent reveals their hand. Choose 2 cards you find there. Your opponent shuffles those cards into their deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case PROFESSOR_ELM_S_LECTURE_213:
			return supporter(this) {
					text "Search your deck for up to 3 Pokémon with 60 HP or less, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case WHITNEY_214:
			return supporter(this) {
					text "Draw a card. Then, draw 2 cards for each other Whitney in your discard pile.\nYou may play only 1 Supporter card during your turn (before your attack)."
			};
			case SHUCKLE_GX_215:
			return basic (this, hp:HP170, type:GRASS, retreatCost:1) {
				weakness FIRE
				bwAbility "Protective Shell" , {
					text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon that have 2 or fewer Energy attached to them."
				}
				move "Triple Poison" , {
					text "Your opponent's Active Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns.\n"
					energyCost C
				}
				move "Wrap GX" , {
					text "40 damage. Your opponent's Active Pokémon is now Paralyzed. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
				}
			};
			case SCEPTILE_GX_216:
			return 	evolution (this, from:"Grovyle", hp:HP230, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Mach Cut" , {
					text "60 damage. Discard a Special Energy from your opponent's Active Pokémon.\n"
					energyCost G
				}
				move "Leaf Cyclone" , {
					text "130 damage. Move a"
					energyCost G,G
				}
				move "Jungle Heal GX" , {
					text "Heal all damage from each of your Pokémon that has any"
					energyCost G
				}
			};
			case VIRIZION_GX_217:
			return basic (this, hp:HP170, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Double Draw" , {
					text "Draw 2 cards.\n"
					energyCost C
				}
				move "Sensitive Blade" , {
					text "50+ damage. If you played a Supporter card from your hand during this turn, this attack does 80 more damage.\n"
					energyCost G,G
				}
				move "Breeze Away GX" , {
					text "Put any number of your Pokémon in play and all cards attached to them into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
				}
			};
			case MAGCARGO_GX_218:
			return 	evolution (this, from:"Slugma", hp:HP210, type:FIRE, retreatCost:3) {
				weakness WATER
				bwAbility "Crushing Charge" , {
					text "Once during your turn (before your attack), you may discard the top card of your deck. If it's a basic Energy card, attach it to 1 of your Pokémon."
				}
				move "Lava Flow" , {
					text "50+ damage. Discard any amount of basic Energy from this Pokémon. This attack does 50 more damage for each card you discarded in this way.\n"
					energyCost R,R,C
				}
				move "Burning Magma GX" , {
					text "Discard the top 5 cards of your opponent's deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case BLACEPHALON_GX_219:
			return basic (this, hp:HP180, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Bursting Burn" , {
					text "Your opponent's Active Pokémon is now Burned and Confused.\n"
					energyCost R
				}
				move "Mind Blown" , {
					text "50× damage. Put any number of"
					energyCost R,R
				}
				move "Burst GX" , {
					text "Discard 1 of your Prize cards. If it's an Energy card, attach it to 1 of your Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost R
				}
			};
			case SUICUNE_GX_220:
			return basic (this, hp:HP180, type:WATER, retreatCost:2) {
				weakness GRASS
				bwAbility "Phantom Winds" , {
					text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may shuffle it and all cards attached to it into your deck."
				}
				move "Cure Stream" , {
					text "120 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance).\n"
					energyCost W,W,C
				}
				move "Brinicles GX" , {
					text "150 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost W,W,C
				}
			};
			case ZERAORA_GX_221:
			return basic (this, hp:HP190, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Thunderclap Zone" , {
					text "Each of your Pokémon that has any [L] Energy attached to it has no Retreat Cost."
				}
				move "Plasma Fists" , {
					text "160 damage. This Pokémon can't attack during your next turn.\n"
					energyCost L,L,C
				}
				move "Full Voltage GX" , {
					text "Attach 5 basic Energy cards from your discard pile to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost L
				}
			};
			case SIGILYPH_GX_222:
			return basic (this, hp:HP170, type:PSYCHIC, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				bwAbility "Mirror Counter" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an attack from your opponent's Pokémon-GX or Pokémon-EX (even if this Pokémon is Knocked Out), put damage counters on the Attacking Pokémon equal to the damage done to this Pokémon."
				}
				move "Sonic Wing" , {
					text "80 damage. This attack's damage isn't affected by Resistance.\n"
					energyCost P,C,C
				}
				move "Intercept GX" , {
					text "60× damage. This attack does 60 damage times the amount of Energy attached to your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost P,C,C
				}
			};
			case TYRANITAR_GX_223:
			return 	evolution (this, from:"Pupitar", hp:HP250, type:DARKNESS, retreatCost:3) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS20
				bwAbility "Lost Out" , {
					text "If your opponent's Pokémon is Knocked Out by damage from this Pokémon's attacks, put that Pokémon and all cards attached to it in the Lost Zone instead of the discard pile."
				}
				move "Dusty Ruckus" , {
					text "130 damage. This attack does 30 damage to each of your opponent's Benched Basic Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost D,D,C
				}
				move "Lay the Smackdown GX" , {
					text "220 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost D,D,C
				}
			};
			case GENESECT_GX_224:
			return basic (this, hp:HP180, type:METAL, retreatCost:2) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				bwAbility "Double Drive" , {
					text "This Pokémon may have up to 2 Pokémon Tool cards attached to it. If it loses this Ability, discard Pokémon Tool cards from it until only 1 remains."
				}
				move "Burst Shot" , {
					text "130 damage."
					energyCost M,M,C
				}
				move "Break Buster GX" , {
					text "190 damage. This attack's damage isn't affected by Resistance. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost M,M,C
				}
			};
			case ALOLAN_NINETALES_GX_225:
			return 	evolution (this, from:"Alolan Vulpix", hp:HP200, type:FAIRY, retreatCost:2) {
				weakness METAL
				resistance DARKNESS, MINUS20
				bwAbility "Mysterious Guidance" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck."
				}
				move "Snowy Wind" , {
					text "70 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost Y,C
				}
				move "Sublimation GX" , {
					text "If your opponent's Active Pokémon is an Ultra Beast, it is Knocked Out. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y,C
				}
			};
			case MIMIKYU_GX_226:
			return basic (this, hp:HP170, type:FAIRY, retreatCost:1) {
				move "Perplex" , {
					text "Your opponent's Active Pokémon is now Confused.\n"
					energyCost Y
				}
				move "Let's Snuggle & Fall" , {
					text "10+ damage. This attack does 30 more damage for each damage counter on your opponent's Active Pokémon.\n"
					energyCost Y,C
				}
				move "Dream Fear GX" , {
					text "Choose 1 of your opponent's Benched Pokémon. Your opponent shuffles that Pokémon and all cards attached to it into their deck. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost Y
				}
			};
			case LUGIA_GX_227:
			return basic (this, hp:HP190, type:COLORLESS, retreatCost:2) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Psychic" , {
					text "30+ damage. This attack does 30 more damage times the amount of Energy attached to your opponent's Active Pokémon.\n"
					energyCost C,C,C
				}
				move "Pelagic Blade" , {
					text "170 damage. This Pokémon can't use Pelagic Blade during your next turn.\n"
					energyCost C,C,C,C
				}
				move "Lost Purge GX" , {
					text "Put your opponent's Active Pokémon and all cards attached to it in the Lost Zone. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C,C,C
				}
			};
			case ADVENTURE_BAG_228:
			return itemCard (this) {
					text "Search your deck for up to 2 Pokémon Tool cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case CHOICE_HELMET_229:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe Pokémon this card is attached to takes 30 less damage from the attacks of your opponent's Pokémon-GX and Pokémon-EX (after applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case COUNTER_GAIN_230:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf you have more Prize cards remaining than your opponent, the attacks of the Pokémon this card is attached to cost [C] less.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case CUSTOM_CATCHER_231:
			return itemCard (this) {
					text "You may play 2 Custom Catcher cards at once.If you played 1 card, draw cards from your deck until you have 3 cards in your hand.If you played 2 cards, switch 1 of your opponent's Benched Pokémon with their Active Pokémon. (This effect works one time for 2 cards.)\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case ELECTROPOWER_232:
			return itemCard (this) {
					text "During this turn, your [L] Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case LOST_BLENDER_233:
			return itemCard (this) {
					text "Put 2 cards from your hand in the Lost Zone. If you do, draw a card.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case NET_BALL_234:
			return itemCard (this) {
					text "Search your deck for a Basic [G] Pokémon or a [G] Energy card, reveal it, and put it into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			case SPELL_TAG_235:
			return itemCard (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf the [P] Pokémon this card is attached to is Knocked Out by damage from an opponent's attack, put 4 damage counters on your opponent's Pokémon in any way you like.\nYou may play as many Item cards as you like during your turn (before your attack)."
			};
			default:
		return null;
		}
	}

}
