package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen5.BlackWhitePromos;

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

import java.util.*

import tcgwars.logic.card.*
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum SunMoonPromos implements CardInfo {

	ROWLET_SM01 ("Rowlet", 1, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	LITTEN_SM02 ("Litten", 2, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	POPPLIO_SM03 ("Popplio", 3, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PIKACHU_SM04 ("Pikachu", 4, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SNORLAX_GX_SM05 ("Snorlax-GX", 5, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
	ROCKRUFF_SM06 ("Rockruff", 6, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	PIKIPEK_SM07 ("Pikipek", 7, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	LITTEN_SM08 ("Litten", 8, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	TOGEDEMARU_SM09 ("Togedemaru", 9, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SHIINOTIC_SM10 ("Shiinotic", 10, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BRUXISH_SM11 ("Bruxish", 11, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PASSIMIAN_SM12 ("Passimian", 12, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	ORANGURU_SM13 ("Oranguru", 13, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	LYCANROC_GX_SM14 ("Lycanroc-GX", 14, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
	ZYGARDE_SM15 ("Zygarde", 15, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	SOLGALEO_GX_SM16 ("Solgaleo-GX", 16, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
	LUNALA_GX_SM17 ("Lunala-GX", 17, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	ALOLAN_SANDSLASH_SM18 ("Alolan Sandslash", 18, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	ORICORIO_SM19 ("Oricorio", 19, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	MUDSDALE_SM20 ("Mudsdale", 20, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DRAMPA_SM21 ("Drampa", 21, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	ROWLET_SM22 ("Rowlet", 22, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	LITTEN_SM23 ("Litten", 23, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	POPPLIO_SM24 ("Popplio", 24, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	LURANTIS_SM25 ("Lurantis", 25, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TSAREENA_SM26 ("Tsareena", 26, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	TURTONATOR_SM27 ("Turtonator", 27, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	VIKAVOLT_SM28 ("Vikavolt", 28, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	MIMIKYU_SM29 ("Mimikyu", 29, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	TAPU_KOKO_SM30 ("Tapu Koko", 30, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_KOKO_SM31 ("Tapu Koko", 31, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_BULU_GX_SM32 ("Tapu Bulu-GX", 32, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _GRASS_]),
	TAPU_KOKO_GX_SM33 ("Tapu Koko-GX", 33, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
	BEWEAR_GX_SM34 ("Bewear-GX", 34, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
	ESPEON_GX_SM35 ("Espeon-GX", 35, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	UMBREON_GX_SM36 ("Umbreon-GX", 36, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
	DECIDUEYE_GX_SM37 ("Decidueye-GX", 37, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	INCINEROAR_GX_SM38 ("Incineroar-GX", 38, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	PRIMARINA_GX_SM39 ("Primarina-GX", 39, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
	JANMGO_O_SM40 ("Janmgo-o", 40, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	KOMALA_SM41 ("Komala", 41, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	COSMOG_SM42 ("Cosmog", 42, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	ALOLAN_MEOWTH_SM43 ("Alolan Meowth", 43, Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
	TOGEDEMARU_SM44 ("Togedemaru", 44, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_LELE_SM45 ("Tapu Lele", 45, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	SEVIPER_SM46 ("Seviper", 46, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	CRABOMINABLE_SM47 ("Crabominable", 47, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ZYGARDE_SM48 ("Zygarde", 48, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	BEWEAR_SM49 ("Bewear", 49, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	TAPU_KOKO_GX_SM50 ("Tapu Koko-GX", 50, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
	ALOLAN_MEOWTH_SM51 ("Alolan Meowth", 51, Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
	GOLISOPOD_SM52("Golisopod", 52, Rarity.PROMO, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	DHELMISE_SM53("Dhelmise", 53, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	LUCARIO_SM54("Lucario", 54, Rarity.PROMO, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	DECIDUEYE_SM55("Decidueye", 55, Rarity.PROMO, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
	TSAREENA_GX_SM56 ("Tsareena-GX", 56, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	HO_OH_GX_SM57 ("Ho-Oh-GX", 57, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
	NECROZMA_GX_SM58 ("Necrozma-GX", 58, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
	MARSHADOW_GX_SM59 ("Marshadow-GX", 59, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
	CHARIZARD_GX_SM60 ("Charizard-GX", 60, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	TAPU_BULU_SM61("Tapu Bulu", 61, Rarity.PROMO, [POKEMON,_GRASS_,BASIC]),
	GOLISOPOD_GX_SM62 ("Golisopod-GX", 62, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	SALAZZLE_GX_SM63 ("Salazzle-GX", 63, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	SILVALLY_SM64("Silvally", 64, Rarity.PROMO, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	ALOLAN_RAICHU_SM65("Alolan Raichu", 65, Rarity.PROMO, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	PHEROMOSA_GX_SM66("Pheromosa-GX", 66, Rarity.PROMO, [POKEMON_GX,POKEMON,_GRASS_,BASIC,ULTRA_BEAST]),
	CELESTEELA_GX_SM67("Celesteela-GX", 67, Rarity.PROMO, [POKEMON_GX,POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
	XURKITREE_GX_SM68("Xurkitree-GX", 68, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC,ULTRA_BEAST]),
	BUZZWOLE_GX_SM69("Buzzwole-GX", 69, Rarity.PROMO, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC,ULTRA_BEAST]),
	SHINING_HO_OH_SM70 ("Shining Ho-Oh", 70, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	KOMMO_O_GX_SM71 ("Kommo-o-GX", 71, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
	ALOLAN_RAICHU_SM72("Alolan Raichu", 72, Rarity.PROMO, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	SALAZZLE_SM73("Salazzle", 73, Rarity.PROMO, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	REGIROCK_SM74("Regirock", 74, Rarity.PROMO, [POKEMON,_FIGHTING_,BASIC]),
	REGISTEEL_SM75("Registeel", 75, Rarity.PROMO, [POKEMON,_METAL_,BASIC]),
	PIKACHU_SM76 ("Pikachu", 76, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	MEWTWO_SM77 ("Mewtwo", 77, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	CHAMPIONS_FESTIVAL_SM78 ("Champions Festival", 78, Rarity.PROMO, [STADIUM, TRAINER]),
	SHINING_CELEBI_SM79 ("Shining Celebi", 79, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	HO_OH_GX_SM80 ("Ho-Oh-GX", 80, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
	PIKACHU_SM81 ("Pikachu", 81, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SHINING_LUGIA_SM82 ("Shining Lugia", 82, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	ZORUA_SM83("Zorua", 83, Rarity.PROMO, [POKEMON,_DARKNESS_,BASIC]),
	ZOROARK_GX_SM84("Zoroark-GX", 84, Rarity.PROMO, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
	MARSHADOW_SM85("Marshadow", 85, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	PIKACHU_SM86("Pikachu", 86, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	LATIAS_SM87("Latias", 87, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	LATIOS_SM88("Latios", 88, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	ZOROARK_SM89("Zoroark", 89, Rarity.PROMO, [POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
	RAICHU_GX_SM90("Raichu-GX", 90, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	SILVALLY_GX_SM91("Silvally-GX", 91, Rarity.PROMO, [POKEMON_GX,POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	TAPU_FINI_SM92("Tapu Fini", 92, Rarity.PROMO, [POKEMON,_WATER_,BASIC]),
	MARSHADOW_SM93("Marshadow", 93, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	WASH_ROTOM_SM94("Wash Rotom", 94, Rarity.PROMO, [POKEMON,_WATER_,BASIC]),
	LUCARIO_SM95("Lucario", 95, Rarity.PROMO, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	HEATRAN_SM96("Heatran", 96, Rarity.PROMO, [POKEMON,_METAL_,BASIC]),
	GUMSHOOS_SM97("Gumshoos", 97, Rarity.PROMO, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	PIKACHU_SM98 ("Pikachu", 98, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	MIMIKYU_SM99 ("Mimikyu", 99, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	LUCARIO_GX_SM100("Lucario-GX", 100, Rarity.PROMO, [POKEMON_GX,POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	DAWN_WINGS_NECROZMA_GX_SM101("Dawn Wings Necrozma-GX", 101, Rarity.PROMO, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC,ULTRA_BEAST]),
	DUSK_MANE_NECROZMA_GX_SM102("Dusk Mane Necrozma-GX", 102, Rarity.PROMO, [POKEMON_GX,POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
	LUNALA_GX_SM103("Lunala-GX", 103, Rarity.PROMO, [POKEMON_GX,POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
	SOLGALEO_GX_SM104("Solgaleo-GX", 104, Rarity.PROMO, [POKEMON_GX,POKEMON,_METAL_,STAGE2,EVOLUTION]),
	LYCANROC_SM105("Lycanroc", 105, Rarity.PROMO, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	DAWN_WINGS_NECROZMA_SM106 ("Dawn Wings Necrozma", 106, Rarity.PROMO, [BASIC, POKEMON, ULTRA_BEAST, _PSYCHIC_]),
	DUSK_MANE_NECROZMA_SM107 ("Dusk Mane Necrozma", 107, Rarity.PROMO, [BASIC, POKEMON, ULTRA_BEAST, _METAL_]),
	ASHS_PIKACHU_SM108("Ash's Pikachu", 108, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM109("Ash's Pikachu", 109, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM110("Ash's Pikachu", 110, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM111("Ash's Pikachu", 111, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM112("Ash's Pikachu", 112, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM113("Ash's Pikachu", 113, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	ASHS_PIKACHU_SM114("Ash's Pikachu", 114, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	PHEROMOSA_SM115("Pheromosa", 115, Rarity.PROMO, [POKEMON,_GRASS_,BASIC,ULTRA_BEAST]),
	XURKITREE_SM116("Xurkitree", 116, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC,ULTRA_BEAST]),
	MALAMAR_SM117("Malamar", 117, Rarity.PROMO, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
	LYCANROC_SM118("Lycanroc", 118, Rarity.PROMO, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
	EXEGGCUTE_SM119("Exeggcute", 119, Rarity.PROMO, [POKEMON,_GRASS_,BASIC]),
	ROCKRUFF_SM120("Rockruff", 120, Rarity.PROMO, [POKEMON,_FIGHTING_,BASIC]),
	RAIKOU_GX_SM121("Raikou-GX", 121, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	ZYGARDE_GX_SM122("Zygarde-GX", 122, Rarity.PROMO, [POKEMON_GX,POKEMON,_FIGHTING_,BASIC]),
	DAWN_WINGS_NECROZMA_SM123("Dawn Wings Necrozma", 123, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC,ULTRA_BEAST]),
	DUSK_MANE_NECROZMA_SM124("Dusk Mane Necrozma", 124, Rarity.PROMO, [POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
	NAGANADEL_GX_SM125("Naganadel-GX", 125, Rarity.PROMO, [POKEMON_GX,POKEMON,_PSYCHIC_,STAGE1,EVOLUTION,ULTRA_BEAST]),
	ULTRA_NECROZMA_GX_SM126("Ultra Necrozma GX", 126, Rarity.PROMO, [POKEMON_GX,POKEMON,_DRAGON_,BASIC,ULTRA_BEAST]),
	ALOLAN_SANDSLASH_SM127("Alolan Sandslash", 127, Rarity.PROMO, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
	ALOLAN_NINETALES_SM128("Alolan Ninetales", 128, Rarity.PROMO, [POKEMON,_FAIRY_,STAGE1,EVOLUTION]),
	KYOGRE_SM129("Kyogre", 129, Rarity.PROMO, [POKEMON,_WATER_,BASIC]),
	MANECTRIC_SM130("Manectric", 130, Rarity.PROMO, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	CELESTEELA_SM131("Celesteela", 131, Rarity.PROMO, [POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
	DELCATTY_SM132("Delcatty", 132, Rarity.PROMO, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
	THUNDURUS_GX_SM133("Thundurus-GX", 133, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	TORNADUS_GX_SM134("Tornadus-GX", 134, Rarity.PROMO, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	LATIAS_SM135("Latias", 135, Rarity.PROMO, [POKEMON,_DRAGON_,BASIC]),
	LATIOS_SM136("Latios", 136, Rarity.PROMO, [POKEMON,_DRAGON_,BASIC]),
	RESHIRAM_GX_SM137("Reshiram-GX", 137, Rarity.PROMO, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	ZEKROM_GX_SM138("Zekrom-GX", 138, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,BASIC]),
	SALAMENCE_GX_SM139("Salamence-GX", 139, Rarity.PROMO, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	SALAMENCE_SM140("Salamence", 140, Rarity.PROMO, [POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	WHITE_KYUREM_GX_SM141("White Kyurem-GX", 141, Rarity.PROMO, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
	KYUREM_SM142("Kyurem", 142, Rarity.PROMO, [POKEMON,_DRAGON_,BASIC]),
	MOLTRES_SM143("Moltres", 143, Rarity.PROMO, [POKEMON,_FIRE_,BASIC]),
	ARTICUNO_SM144("Articuno", 144, Rarity.PROMO, [POKEMON,_WATER_,BASIC]),
	ZAPDOS_SM146("Zapdos", 145, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	LEAFEON_GX_SM145("Leafeon-GX", 146, Rarity.PROMO, [POKEMON_GX,POKEMON,_GRASS_,STAGE1,EVOLUTION]),
	GLACEON_GX_SM147("Glaceon-GX", 147, Rarity.PROMO, [POKEMON_GX,POKEMON,_WATER_,STAGE1,EVOLUTION]),
	CHAMPIONS_FESTIVAL_SM148("Champions Festival", 148, Rarity.PROMO, [TRAINER,STADIUM]),
	SUICUNE_SM149("Suicune", 149, Rarity.PROMO, [POKEMON,_WATER_,BASIC]),
	RAIKOU_SM150("Raikou", 150, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	GIRATINA_SM151("Giratina", 151, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	TAPU_LELE_SM152("Tapu Lele", 152, Rarity.PROMO, [POKEMON,_FAIRY_,BASIC]),
	ROWLET_SM153("Rowlet", 153, Rarity.PROMO, [POKEMON,_GRASS_,BASIC]),
	SALANDIT_SM154("Salandit", 154, Rarity.PROMO, [POKEMON,_FIRE_,BASIC]),
	KINGDRA_GX_SM155("Kingdra-GX", 155, Rarity.PROMO, [POKEMON_GX,POKEMON,_WATER_,STAGE2,EVOLUTION]),
	DRAGONITE_GX_SM156("Dragonite-GX", 156, Rarity.PROMO, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	PIKACHU_SM157("Pikachu", 157, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	CHARIZARD_SM158("Charizard", 158, Rarity.PROMO, [POKEMON,_FIRE_,STAGE2,EVOLUTION]),
	ZAPDOS_SM159("Zapdos", 159, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	NIDOQUEEN_SM160("Nidoqueen", 160, Rarity.PROMO, [POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
	JIRACHI_SM161("Jirachi", 161, Rarity.PROMO, [POKEMON,_METAL_,BASIC]),
	PIKACHU_SM162("Pikachu", 162, Rarity.PROMO, [POKEMON,_LIGHTNING_,BASIC]),
	MIMIKYU_SM163("Mimikyu", 163, Rarity.PROMO, [POKEMON,_FAIRY_,BASIC]),
	DEOXYS_SM164("Deoxys", 164, Rarity.PROMO, [POKEMON,_PSYCHIC_,BASIC]),
	ULTRA_NECROZMA_SM165("Ultra Necrozma", 165, Rarity.PROMO, [POKEMON,_DRAGON_,BASIC,ULTRA_BEAST]),
	MAGIKARP_WAILORD_GX_SM166("Magikarp &amp; Wailord-GX", 166, Rarity.PROMO, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
	FLAREON_GX_SM171("Flareon-GX", 171, Rarity.PROMO, [POKEMON_GX,POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	VAPOREON_GX_SM172("Vaporeon-GX", 172, Rarity.PROMO, [POKEMON_GX,POKEMON,_WATER_,STAGE1,EVOLUTION]),
	JOLTEON_GX_SM173("Jolteon-GX", 173, Rarity.PROMO, [POKEMON_GX,POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
	EEVEE_GX_SM174("Eevee-GX", 174, Rarity.PROMO, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	EEVEE_GX_SM175("Eevee-GX", 175, Rarity.PROMO, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	EEVEE_GX_SM176("Eevee-GX", 176, Rarity.PROMO, [POKEMON_GX,POKEMON,_COLORLESS_,BASIC]),
	MELTAN_SM177("Meltan", 177, Rarity.PROMO, [POKEMON,_METAL_,BASIC]),
	MELMETAL_SM178("Melmetal", 178, Rarity.PROMO, [POKEMON_GX,POKEMON,_METAL_,STAGE1,EVOLUTION]);


	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	SunMoonPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.SUN_MOON_PROMOS;
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
			case ROWLET_SM01:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Fury Attack", {
						text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
						energyCost G
						onAttack {
							flip 3,{damage 10}
						}
					}

				};
			case LITTEN_SM02:
				return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Combustion", {
						text "30 damage."
						energyCost R, C
						onAttack {
							damage 30
						}
					}

				};
			case POPPLIO_SM03:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Sing", {
						text "Your opponent's Active Pokémon is now Asleep."
						energyCost W
						onAttack {
							apply ASLEEP
						}
					}

				};
			case PIKACHU_SM04:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Thunder Wave", {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L
						onAttack {
							flipThenApplySC PARALYZED
						}
					}
					move "Electro Ball", {
						text "50 damage."
						energyCost L, C, C
						onAttack {
							damage 50
						}
					}

				};
			case SNORLAX_GX_SM05:
				return basic (this, hp:HP190, type:COLORLESS, retreatCost:4) {
					weakness FIGHTING
					customAbility {
						delayedA {
							before ASLEEP_SPC, self, null, CHECK_ATTACK_REQUIREMENTS, {
								if(e.parentEvent.effect.move.name=="Thunderous Snore")
									prevent()
							}
						}
					}
					move "Collapse", {
						text "80 damage. This Pokémon is now Asleep."
						energyCost C, C, C
						onAttack {
							damage 80
							afterDamage{apply ASLEEP,self}
						}
					}
					move "Thunderous Snore", {
						text "180 damage. This attack can be used if this Pokémon is Asleep. If it is not Asleep, this attack does nothing."
						energyCost C, C, C, C, C
						attackRequirement {
							assert self.isSPC(ASLEEP)
						}
						onAttack {
							damage 180
						}
					}
					move "Pulverizing Pancake GX", {
						text "210 damage. This Pokémon is now Asleep. (You can't use more than 1 GX attack in a game.)"
						energyCost C, C, C, C, C
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							damage 210
							afterDamage{apply ASLEEP,self}
						}
					}

				};
			case ROCKRUFF_SM06:
				return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
					weakness GRASS
					move "Tackle", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}
					move "Rock Throw", {
						text "20 damage."
						energyCost F, C
						onAttack {
							damage 20
						}
					}

				};
			case PIKIPEK_SM07:
				return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Nosedive", {
						text "40 damage. This Pokémon does 20 damage to itself."
						energyCost C, C
						onAttack {
							damage 40
							damage 20,self
						}
					}

				};
			case LITTEN_SM08:
				return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Collect", {
						text "Draw a card."
						energyCost C
						onAttack {
							draw 1
						}
					}
					move "Scratch", {
						text "20 damage."
						energyCost R, C
						onAttack {
							damage 20
						}
					}

				};
			case TOGEDEMARU_SM09:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Defense Curl", {
						text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
						energyCost C
						onAttack {
							flip{preventAllDamageNextTurn()}
						}
					}
					move "Discharge", {
						text "30× damage. Discard all [L] Energy from this Pokémon. This attack does 30 damage for each card you discarded in this way."
						energyCost L
						onAttack {
							damage 30*discardAllSelfEnergy(L).size()
						}
					}

				};
			case SHIINOTIC_SM10:
				return evolution (this, from:"Morelull", hp:HP100, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Illuminate", {
						text "Once during your turn (before your attack), you may search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
						actionA {
							assert deck
							checkLastTurn()
							powerUsed()
							deck.search {it.cardTypes.is(POKEMON) && (it as PokemonCard).types.contains(G)}.moveTo(my.hand)
							shuffleDeck()
						}
					}
					move "Flickering Spores", {
						text "30 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost G, C
						onAttack {
							damage 30
							applyAfterDamage ASLEEP
						}
					}

				};
			case BRUXISH_SM11:
				return basic (this, hp:HP110, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Vivid Charge", {
						text "Search your deck for up to 3 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
						energyCost C
						onAttack {
							deck.search(max: 3, cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
							shuffleDeck()
						}
					}
					move "Psychic Fang", {
						text "90 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
						energyCost P, P, C
						onAttack {
							shredDamage 90
						}
					}

				};
			case PASSIMIAN_SM12:
				return basic (this, hp:HP110, type:FIGHTING, retreatCost:1) {
					weakness PSYCHIC
					move "Fling", {
						text "This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost F
						attackRequirement {
							assert opp.bench
						}
						onAttack {
							damage 30, opp.bench.select()
						}
					}
					move "Team Play", {
						text "10+ damage. This attack does 30 more damage for each of your Benched Passimian."
						energyCost C, C
						onAttack {
							damage 10+30*my.bench.findAll{it.name=='Passimian'}.size()
						}
					}

				};
			case ORANGURU_SM13:
				return basic (this, hp:HP120, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					bwAbility "Instruct", {
						text "Once during your turn (before your attack), you may draw cards until you have 3 cards in your hand."
						actionA {
							checkLastTurn()
							assert deck
							assert hand.size() < 3
							powerUsed()
							draw 3-hand.size()
						}
					}
					move "Psychic", {
						text "60+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
						energyCost C, C, C
						onAttack {
							damage 60+20*defending.cards.energyCount(C)
						}
					}

				};
			case LYCANROC_GX_SM14:
				return copy (BurningShadows.LYCANROC_GX_136, this);
			case ZYGARDE_SM15:
				return basic (this, hp:HP130, type:FIGHTING, retreatCost:3) {
					weakness GRASS
					move "Pulse Blast", {
						text "60 damage."
						energyCost F, C, C
						onAttack {
							damage 60
						}
					}
					move "Land's Wrath", {
						text "130 damage."
						energyCost F, F, F, C
						onAttack {
							damage 130
						}
					}

				};
			case SOLGALEO_GX_SM16:
				return copy (SunMoon.SOLGALEO_GX_89, this)
			case LUNALA_GX_SM17:
				return copy (SunMoon.LUNALA_GX_66, this)
			case ALOLAN_SANDSLASH_SM18:
				return copy(GuardiansRising.ALOLAN_SANDSLASH_20, this)
			case ORICORIO_SM19:
				return copy(GuardiansRising.ORICORIO_56, this)
			case MUDSDALE_SM20:
				return copy(GuardiansRising.MUDSDALE_76, this)
			case DRAMPA_SM21:
				return copy(GuardiansRising.DRAMPA_97, this)
			case ROWLET_SM22:
				return copy (SunMoon.ROWLET_9, this)
			case LITTEN_SM23:
				return copy (SunMoon.LITTEN_24, this)
			case POPPLIO_SM24:
				return copy (SunMoon.POPPLIO_39, this)
			case LURANTIS_SM25:
				return evolution (this, from:"Fomantis", hp:HP100, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Sunny Day", {
						text "Each of your [G] Pokémon's and [R] Pokémon's attacks does 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
						delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner == self.owner && (ef.attacker.types.contains(G) || ef.attacker.types.contains(R))){
                  bg.dm().each {
                    if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                      bc "Sunny Day +20"
                      it.dmg += hp(20)
                    }
                  }
                }
              }
						}
					}
					move "Solar Beam", {
						text "80 damage."
						energyCost G, G, C
						onAttack {
							damage 80
						}
					}

				};
			case TSAREENA_SM26:
				return copy (SunMoon.TSAREENA_20, this)
			case TURTONATOR_SM27:
				return basic (this, hp:HP130, type:FIRE, retreatCost:3) {
					weakness WATER
					move "Flame Cloak", {
						text "30 damage. Attach a [R] Energy card from your discard pile to this Pokémon."
						energyCost R, C
						onAttack {
							damage 30
              afterDamage{
                attachEnergyFrom(type: FIRE, my.discard, self)
              }
						}
					}
					move "Heat Blast", {
						text "70 damage."
						energyCost R, C, C
						onAttack {
							damage 70
						}
					}

				};
			case VIKAVOLT_SM28:
				return copy (SunMoon.VIKAVOLT_52, this)
			case MIMIKYU_SM29:
				return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
					move "Haunt", {
						text "Put 1 damage counter on your opponent's Active Pokémon."
						energyCost P
						onAttack {
							directDamage 10, defending
						}
					}
					move "Astonish", {
						text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
						energyCost C, C
						onAttack {
							astonish()
						}
					}

				};
			case TAPU_KOKO_SM30:
				return basic (this, hp:HP110, type:LIGHTNING, retreatCost:0) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Flying Flip", {
						text "This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost C, C
						onAttack {
							opp.all.each {damage 20,it}
						}
					}
					move "Electric Ball", {
						text "100 damage."
						energyCost L, L, C
						onAttack {
							damage 100
						}
					}

				};
			case TAPU_KOKO_SM31:
				return copy (TAPU_KOKO_SM30, this);
			case TAPU_BULU_GX_SM32:
				return copy (BurningShadows.TAPU_BULU_GX_130, this);
			case TAPU_KOKO_GX_SM33:
				return copy (GuardiansRising.TAPU_KOKO_GX_47, this);
			case BEWEAR_GX_SM34:
				return evolution (this, from:"Stufful", hp:HP210, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Bear Hug", {
						text "80 damage. The Defending Pokémon can't retreat during your opponent's next turn."
						energyCost C, C, C
						onAttack {
							damage 80
              cantRetreat defending
						}
					}
					move "Double Impact", {
						text "100× damage. Flip 2 coins. This attack does 100 damage for each heads."
						energyCost C, C, C, C
						onAttack {
							flip 2, {damage 100}
						}
					}
					move "Big Throw GX", {
						text "Discard your opponent's Active Pokémon and all cards attached to it. (You can't use more than 1 GX attack in a game.)"
						energyCost C, C, C, C
						attackRequirement {
              gxCheck()
            }
						onAttack {
              gxPerform()
							targeted (defending) {
                defending.cards.reverse().discard()
                removePCS(defending)
              }
						}
					}

				};
			case ESPEON_GX_SM35:
				return copy (SunMoon.ESPEON_GX_61, this)
			case UMBREON_GX_SM36:
				return copy (SunMoon.UMBREON_GX_80, this)
			case DECIDUEYE_GX_SM37:
				return copy (SunMoon.DECIDUEYE_GX_12, this)
			case INCINEROAR_GX_SM38:
				return copy (SunMoon.INCINEROAR_GX_27, this)
			case PRIMARINA_GX_SM39:
				return copy (SunMoon.PRIMARINA_GX_42, this)
			case JANMGO_O_SM40:
				return basic (this, hp:HP060, type:DRAGON, retreatCost:2) {
					weakness FAIRY
					move "Iron Defense", {
						text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
						energyCost F
						onAttack {
							flip {preventAllDamageNextTurn()}
						}
					}
					move "Tackle", {
						text "20 damage."
						energyCost L, C
						onAttack {
							damage 20
						}
					}

				};
			case KOMALA_SM41:
			  return copy (GuardiansRising.KOMALA_114, this)
			case COSMOG_SM42:
				return copy (SunMoon.COSMOG_64, this)
			case ALOLAN_MEOWTH_SM43:
				return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Scratch", {
						text "10 damage."
						onAttack {
							damage 10
						}
					}
					move "Fake Out", {
						text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost D, D
						onAttack {
							damage 20
              flipThenApplySC PARALYZED
						}
					}

				};
			case TOGEDEMARU_SM44:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Nuzzle", {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L
						onAttack {
							flipThenApplySC PARALYZED
						}
					}
					move "Rollout", {
						text "50 damage."
						energyCost C, C, C
						onAttack {
							damage 50
						}
					}

				};
			case TAPU_LELE_SM45:
				return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Psywave", {
						text "20× damage. This attack does 20 damage times the amount of Energy attached to your opponent's Active Pokémon."
						energyCost P
						onAttack {
							damage 20*defending.cards.energyCount(C)
						}
					}
					move "Magical Swap", {
						text "Move any number of damage counters on your opponent's Pokémon to their other Pokémon in any way you like."
						energyCost P, C
						attackRequirement {
              assert opp.all.size() > 1
            }
						onAttack {
              while (1) {
                def tar = opp.all.findAll{it.numberOfDamageCounters}
                if(!tar) break
                def from = tar.select("Move counter from (cancel to stop)", false)
								if(!from) break
								tar = opp.all
								tar.remove(from)
								if(!tar) break
                def to = tar.select("To?")
                from.damage -= hp(10)
                to.damage += hp(10)
                bc "Moved a damage counter from $from to $to"
                checkFaint()
              }
						}
					}

				};
			case SEVIPER_SM46:
				return basic (this, hp:HP100, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					bwAbility "More Poison", {
						text "Put 1 more damage counter on your opponent's Poisoned Pokémon between turns."
						getterA (GET_EXTRA_POISON) {h->
							if(h.effect.target.owner != self.owner) {
								h.object += 1
							}
						}
					}
					move "Venomous Fang", {
						text "30 damage. Your opponent's Active Pokémon is now Poisoned."
						energyCost P, C, C
						onAttack {
							damage 30
              applyAfterDamage POISONED
						}
					}

				};
			case CRABOMINABLE_SM47:
				return evolution (this, from:"Crabrawler", hp:HP140, type:FIGHTING, retreatCost:4) {
					weakness PSYCHIC
					move "Gutsy Hammer", {
						text "80 damage. This Pokémon does damage to itself equal to the number of damage counters already on it."
						energyCost F
						onAttack {
							damage 80
              damage self.damage.value, self
						}
					}
					move "Double Stomp", {
						text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
						energyCost F, F, F
						onAttack {
							damage 80
              flip 2, {damage 40}
						}
					}

				};
			case ZYGARDE_SM48:
				return basic (this, hp:HP150, type:DRAGON, retreatCost:4) {
					weakness FAIRY
					move "Land Crush", {
						text "80 damage."
						energyCost C, C, C
						onAttack {
							damage 80
						}
					}
					move "Core Enforcer", {
						text "150 damage. Discard a [D] Energy and a [Y] Energy attached to this Pokémon."
						energyCost D, Y, C, C
						onAttack {
							damage 150
							afterDamage{
								discardSelfEnergy D, Y
							}
						}
					}

				};
			case BEWEAR_SM49:
				return evolution (this, from:"Stufful", hp:HP120, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					move "Mix-Up", {
						text "Flip a coin. If heads, discard the top 3 cards of your opponent's deck."
						energyCost C, C
						attackRequirement {
              assert opp.deck
            }
						onAttack {
							flip {opp.deck.subList(0,3).discard()}
						}
					}
					move "Tantrum", {
						text "120 damage. This Pokémon is now Confused."
						energyCost C, C, C
						onAttack {
							damage 120
              afterDamage {
                apply CONFUSED, self
              }
						}
					}

				};
			case TAPU_KOKO_GX_SM50:
				return copy (GuardiansRising.TAPU_KOKO_GX_47, this)
			case ALOLAN_MEOWTH_SM51:
				return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Nasty Plot", {
						text "Flip a coin. If heads, search your deck for a card and put it into your hand. Then, shuffle your deck."
						attackRequirement {
              assert deck
            }
						onAttack {
							flip {
                deck.select().moveTo(hidden: true, hand)
                shuffleDeck()
              }
						}
					}
					move "Scratch", {
						text "10 damage."
						energyCost D
						onAttack {
							damage 10
						}
					}

				};
				case GOLISOPOD_SM52:
					return 	evolution (this, from:"Wimpod", hp:HP130, type:GRASS, retreatCost:2) {
						weakness FIRE
						bwAbility "Armor" , {
							text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
							delayedA{
								before APPLY_ATTACK_DAMAGES,{
									bg.dm().each{
										if(it.to == self && it.notNoEffect && it.dmg.value) {
											bc "Armor -30"
											it.dmg -= hp(30)
										}
									}
								}
							}
						}
						move "Resolute Claws" , {
							text "80+ damage. If your opponent's Active Pokémon is a Pokémon-GX or a Pokémon-EX, this attack does 70 more damage (before applying Weakness and Resistance)."
							energyCost G,C,C
							onAttack {
								damage 80
								if(defending.pokemonGX || defending.pokemonEX) damage 70
							}
						}
					};
					case DHELMISE_SM53:
					return basic (this, hp:HP120, type:PSYCHIC, retreatCost:2) {
						weakness DARKNESS
						resistance FIGHTING, MINUS20
						bwAbility "Steelworker" , {
							text "Your [M] Pokémon's attacks do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
							delayedA {
								after PROCESS_ATTACK_EFFECTS, {
									bg.dm().each {if(it.from.owner==self.owner && it.from.types.contains(M) && it.to.active && it.to.owner!=self.owner && it.dmg.value){
										bc "Steelworker +10"
										it.dmg += hp(10)
									}}
								}
							}
						}
						move "Anchor Shot" , {
							text "70 damage. The Defending Pokémon can't retreat during your opponent's next turn."
							energyCost P,C,C
						}
					};
					case LUCARIO_SM54:
					return 	evolution (this, from:"Riolu", hp:HP120, type:FIGHTING, retreatCost:1) {
						weakness PSYCHIC
						bwAbility "Stance" , {
							text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all effects of your opponent's attacks, including damage, done to this Pokémon until the end of your opponent's next turn."
						}
						move "Submarine Blow" , {
							text "120 damage."
							energyCost F,F,F
						}
					};
					case DECIDUEYE_SM55:
					return 	evolution (this, from:"Dartrix", hp:HP140, type:GRASS, retreatCost:1) {
						weakness FIRE
						move "Leaf Blade" , {
							text "30+ damage. Flip a coin. If heads, this attack does 30 more damage.\n"
							energyCost G
						}
						move "Brave Bird" , {
							text "120 damage. This Pokémon does 20 damage to itself."
							energyCost G,C,C
						}
					};
			case TSAREENA_GX_SM56:
				return evolution (this, from:"Steenee", hp:HP230, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Side Eye", {
						text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Confused."
						energyCost G
						attackRequirement {
							assert opp.bench
						}
						onAttack {
							sw opp.active, opp.bench.select()
							apply CONFUSED, opp.active
						}
					}
					move "Jumping Side Kick", {
						text "90+ damage. If your opponent's Active Pokémon is Confused, this attack does 90 more damage."
						energyCost G, C, C
						onAttack {
							damage 90
							if(defending.isSPC(CONFUSED)) damage 90
						}
					}
					move "Queen's Command GX", {
						text "Your opponent discards 4 cards from their hand. (You can't use more than 1 GX attack in a game.)"
						energyCost G, G, C
						attackRequirement {
							gxCheck()
							assert opp.deck
						}
						onAttack {
							gxPerform()
							opp.deck.subList(0,4).discard()
						}
					}

				};
			case HO_OH_GX_SM57:
				return copy (BurningShadows.HO_OH_GX_21, this);
			case NECROZMA_GX_SM58:
				return copy (BurningShadows.NECROZMA_GX_63, this);
			case MARSHADOW_GX_SM59:
				return copy (BurningShadows.MARSHADOW_GX_80, this);
			case CHARIZARD_GX_SM60:
        return copy (BurningShadows.CHARIZARD_GX_20, this);
			case TAPU_BULU_SM61:
				return basic (this, hp:HP130, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Horn Leech" , {
						text "30 damage. Heal 30 damage from this Pokémon."
						energyCost G,C
						onAttack{
							damage 30
							heal 30, self
						}
					}
					move "Calm Strike" , {
						text "60+ damage. If you used a GX attack in this game, this attack does 60 more damage."
						energyCost G,C,C
						onAttack{
							damage 60
							if(isGxPerformed()) damage 60
						}
					}
				};
			case GOLISOPOD_GX_SM62:
        return copy (BurningShadows.GOLISOPOD_GX_17, this);
			case SALAZZLE_GX_SM63:
				return copy (BurningShadows.SALAZZLE_GX_25, this);
			case SILVALLY_SM64:
				return 	evolution (this, from:"Type: Null", hp:HP130, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					move "Gear Scan" , {
						text "Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck.\n"
						energyCost C
						attackRequirement{
							assert my.deck : "There is no more cards in your deck"
						}
						onAttack{
							my.deck.search(count:1,"Choose an Item card",cardTypeFilter(ITEM)).showToOpponent("The choosen Item card.").moveTo(my.hand)
						}
					}
					move "X-Scissor" , {
						text "90+ damage. Flip a coin. If heads, this attack does 30 more damage."
						energyCost C,C,C
						onAttack{
							damage 90
							flip {damage 30}
						}
					}
				};
				case ALOLAN_RAICHU_SM65:
				return 	evolution (this, from:"Pikachu", hp:HP110, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Quick Attack" , {
						text "10+ damage. Flip a coin. If heads, this attack does 30 more damage.\n"
						energyCost L
						onAttack{
							damage 10
							flip {damage 30}
						}
					}
					move "Electric Surfer" , {
						text "70 damage."
						energyCost L,C,C
						onAttack{
							damage 70
						}
					}
				};
			case PHEROMOSA_GX_SM66:
				return copy (UltraPrism.PHEROMOSA_GX_140, this);
			case CELESTEELA_GX_SM67:
				return copy (UltraPrism.CELESTEELA_GX_144, this);
			case XURKITREE_GX_SM68:
				return copy (UltraPrism.XURKITREE_GX_142, this);
			case BUZZWOLE_GX_SM69:
				return copy (CrimsonInvasion.BUZZWOLE_GX_57, this);
			case SHINING_HO_OH_SM70:
				return basic (this, hp:HP130, type:FIRE, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS30
					bwAbility "Golden Wing", {
						text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, move up to 2 basic Energy cards from this Pokémon to your Benched Pokémon in any way you like."
						delayedA {
							before (KNOCKOUT,self) {
								if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.bench.notEmpty && self.cards.filterByType(ENERGY)) {
									bc "Golden Wing activates"
									moveEnergy(basic: true, self, self.owner.pbg.bench)
									moveEnergy(basic: true, self, self.owner.pbg.bench)
								}
							}
						}
					}
					move "Fire Blast", {
						text "110 damage. Discard an Energy from this Pokémon."
						energyCost R, C, C, C
						onAttack {
							damage 110
							afterDamage{
								discardSelfEnergy C
							}
						}
					}

				};
			case KOMMO_O_GX_SM71:
			  return copy (GuardiansRising.KOMMO_O_GX_100, this)
			case ALOLAN_RAICHU_SM72:
				return copy (CrimsonInvasion.ALOLAN_RAICHU_31, this);
			case SALAZZLE_SM73:
				return copy (CrimsonInvasion.SALAZZLE_47, this);
			case REGIROCK_SM74:
				return copy (CrimsonInvasion.REGIROCK_53, this);
			case REGISTEEL_SM75:
				return copy (CrimsonInvasion.REGISTEEL_68, this);
			case PIKACHU_SM76:
				return copy (PIKACHU_SM04, this)
			case MEWTWO_SM77:
				return basic (this, hp:HP120, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					bwAbility "Pressure", {
						text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon's attack do 20 less damage (before applying Weakness and Resistance)."
						delayedA {
							after PROCESS_ATTACK_EFFECTS, {
								bg.dm().each{
									if(self.active && it.from.active && it.from.owner != self.owner && it.dmg.value && it.notNoEffect) {
										bc "Pressure -20"
										it.dmg -= hp(20)
									}
								}
							}
						}
					}
					move "Super Psy Bolt", {
						text "100 damage."
						energyCost P, P, P
						onAttack {
							damage 100
						}
					}

				};
			case CHAMPIONS_FESTIVAL_SM78:
				return copy(BlackWhitePromos.CHAMPIONS_FESTIVAL_BW95, this)
			case SHINING_CELEBI_SM79:
				return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
					weakness FIRE
					bwAbility "Time Recall", {
						text "Each of your evolved Pokémon can use any attack from its previous Evolutions. (You still need the necessary Energy to use each attack.)"
						getterA (GET_MOVE_LIST) {holder->
							if(holder.effect.target.owner==self.owner && holder.effect.target.evolution){
								for(card in holder.effect.target.cards.filterByType(POKEMON)){
									if(card!=holder.effect.target.topPokemonCard){
										holder.object.addAll(card.moves)
									}
								}
							}
						}
					}
					move "Leaf Step", {
						text "30 damage."
						energyCost G, C
						onAttack {
							damage 30
						}
					}

				};
			case HO_OH_GX_SM80:
				return copy (BurningShadows.HO_OH_GX_21, this)
			case PIKACHU_SM81:
				return copy (PIKACHU_SM04, this)
			case SHINING_LUGIA_SM82:
				return basic (this, hp:HP130, type:COLORLESS, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Silver Wing", {
						text "60+ damage. If your opponent's Active Pokémon has an Ability, this attack does 60 more damage."
						energyCost C, C, C
						onAttack {
							damage 60
							if(defending.hasModernAbility()) damage 60
						}
					}
					move "Aero Force", {
						text "130 damage. Discard an Energy attached to this Pokémon."
						energyCost C, C, C, C
						onAttack {
							damage 130
							afterDamage{
								discardSelfEnergy(C)
							}
						}
					}

				};
			case ZORUA_SM83:
				return copy (ShiningLegends.ZORUA_52, this);
			case ZOROARK_GX_SM84:
				return copy (ShiningLegends.ZOROARK_GX_53, this)
			case MARSHADOW_SM85:
				return copy (ShiningLegends.MARSHADOW_45, this)
			case PIKACHU_SM86:
				return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Tail Whap" , {
						text "10 damage."
						energyCost C
						onAttack{
							damage 10
						}
					}
					move "Spark" , {
						text "20 damage. This attack does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost L,C
						onAttack{
							damage 20
							if(opp.bench) damage 10, opp.bench.select()
						}
					}
				};
			case LATIAS_SM87:
				return basic (this, hp:HP100, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					bwAbility "Flight Support" , {
						text "Your Latios in play have no Retreat Cost."
						getterA (GET_RETREAT_COST,BEFORE_LAST) {h->
							if(h.effect.target.owner == self.owner && h.effect.target.name == "Latios") {
	              h.object = 0
	            }
						}
					}
					move "Misty Gale" , {
						text "30 damage. Heal 30 damage from each of your Benched Pokémon."
						energyCost P
						onAttack{
							damage 30
							my.bench.each{
								heal 30, it
							}
						}
					}
				};
			case LATIOS_SM88:
				return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Break Through" , {
						text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
						energyCost C,C
						onAttack{
							damage 30
							if(opp.bench) damage 30, opp.bench.select()
						}
					}
					move "Lagoon Flight" , {
						text "70 damage."
						energyCost P,C,C
						onAttack{
							damage 70
						}
					}
				};
			case ZOROARK_SM89:
				return 	evolution (this, from:"Zorua", hp:HP120, type:DARKNESS, retreatCost:2) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Rip Claw" , {
						text "30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
						energyCost C,C
						onAttack{
							damage 30
							afterDamage{
								flip {discardDefendingEnergy()}
							}
						}
					}
					move "Doom Crush" , {
						text "120 damage. Discard a [D] Energy from this Pokémon."
						energyCost D,D,C
						onAttack{
							damage 120
							afterDamage{
								discardSelfEnergy D
							}
						}
					}
				};
			case RAICHU_GX_SM90:
				return copy (ShiningLegends.RAICHU_GX_29, this)

			case SILVALLY_GX_SM91:
				return copy (CrimsonInvasion.SILVALLY_GX_90, this);
			case TAPU_FINI_SM92:
				return basic (this, hp:HP120, type:WATER, retreatCost:2) {
					weakness GRASS
					customAbility {
						delayedA {
							before REMOVE_DAMAGE_COUNTER, {
								if(ef.lastTarget.owner == self.owner && ef.lastTarget.types.contains(W)){
									keyStore('Shining_Current',self,bg.turnCount)
								}
							}
						}
					}
					move "Water Pulse" , {
						text "30 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost W,C
						onAttack{
							damage 30
							applyAfterDamage ASLEEP
						}
					}
					move "Shining Current" , {
						text "60+ damage. If any of your [W] Pokémon was healed during this turn, this attack does 60 more damage."
						energyCost W,C,C
						onAttack{
							damage 60
							if(keyStore('Shining_Current',self,null)==bg.turnCount) damage 60
						}
					}
				};
			case MARSHADOW_SM93:
				return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
					weakness DARKNESS
					resistance FIGHTING, MINUS20
					move "Shadowy Echoes" , {
						text "Put a Basic Pokémon from each player's discard pile onto its owner's Bench."
						energyCost P
						attackRequirement{
							assert (my.bench.notFull && my.discard.filterByType(BASIC)) || (opp.bench.notFull && opp.discard.filterByType(BASIC))
						}
						onAttack{
							if(my.bench.notFull && my.discard.filterByType(BASIC)){
								my.discard.filterByType(BASIC).select().each{
									my.discard.remove(it)
									benchPCS(it)
								}
							}
							if(opp.bench.notFull && opp.discard.filterByType(BASIC)){
								opp.discard.filterByType(BASIC).select().each{
									opp.discard.remove(it)
									benchPCS(it)
								}
							}
						}
					}
					move "Surprise Attack" , {
						text "40 damage. Flip a coin. If tails, this attack does nothing."
						energyCost C,C
						onAttack{
							flip 1,{damage 40},{bc "Surprise Attack failed"}
						}
					}
				};
			case WASH_ROTOM_SM94:
				return copy (UltraPrism.WASH_ROTOM_40, this);
			case LUCARIO_SM95:
				return copy (UltraPrism.LUCARIO_67, this);
			case HEATRAN_SM96:
				return copy (UltraPrism.HEATRAN_88, this);
			case GUMSHOOS_SM97:
				return copy (UltraPrism.GUMSHOOS_113, this);
			case PIKACHU_SM98:
                return copy (BurningShadows.PIKACHU_40, this);
			case MIMIKYU_SM99:
				return copy (GuardiansRising.MIMIKYU_58, this);
			case LUCARIO_GX_SM100:
				return copy (ForbiddenLight.LUCARIO_GX_122, this);
			case DAWN_WINGS_NECROZMA_GX_SM101:
				return copy (UltraPrism.DAWN_WINGS_NECROZMA_GX_63, this);
			case DUSK_MANE_NECROZMA_GX_SM102:
				return copy (UltraPrism.DUSK_MANE_NECROZMA_GX_90, this);
				case LUNALA_GX_SM103:
				return 	evolution (this, from:"Cosmoem", hp:HP230, type:PSYCHIC, retreatCost:0) {
					weakness DARKNESS
					resistance FIGHTING, MINUS20
					move "Glide" , {
						text "50 damage."
						energyCost C,C
						onAttack{
							damage 50
						}
					}
					move "Lunar Javelin" , {
						text "200 damage. Discard 2 [P] Energy from this Pokémon."
						energyCost P,P,C,C
						onAttack{
							damage 200
							afterDamage{
								discardSelfEnergy P,P
							}
						}
					}
					move "Requiem GX" , {
						text "250 damage. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
						energyCost P,P,P,C
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							damage 250
						}
					}
				};
				case SOLGALEO_GX_SM104:
				return 	evolution (this, from:"Cosmoem", hp:HP250, type:METAL, retreatCost:2) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					bwAbility "Shining Mane" , {
						text "Your Pokémon in play have no Weakness."
						getterA (GET_WEAKNESSES) { h->
						  if(h.effect.target.owner == self.owner) {
						    def list = h.object as List<Weakness>
						    list.clear()
						  }
						}
					}
					move "Turbo Strike" , {
						text "120 damage. Attach 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon.\n"
						energyCost C,C
						onAttack{
							damage 120
							if(my.bench){
								afterDamage{
									def pcs = my.bench.select()
									attachEnergyFrom(basic:true,my.discard,pcs)
									attachEnergyFrom(basic:true,my.discard,pcs)
								}
							}
						}
					}
					move "Prominence GX" , {
						text "Heal all damage from all of your Pokémon. (You can't use more than 1 GX attack in a game.)"
						energyCost C,C
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							my.all.each {heal it.damage.value, it}
						}
					}
				};
				case LYCANROC_SM105:
				return 	evolution (this, from:"Rockruff", hp:HP120, type:FIGHTING, retreatCost:2) {
					weakness GRASS
					move "Bite" , {
						text "30 damage."
						energyCost C,C
						onAttack{
							damage 30
						}
					}
					move "Stone Edge" , {
						text "90+ damage. Flip a coin. If heads, this attack does 30 more damage."
						energyCost F,F,C
						onAttack{
							damage 90
							flip {damage 30}
						}
					}
				};
			case DAWN_WINGS_NECROZMA_SM106:
				return basic (this, hp:HP130, type:PSYCHIC, retreatCost:2) {
					weakness DARKNESS
					resistance FIGHTING, MINUS20
					move "Gulf Stream", {
						text "20+ damage. If you have exactly 6 Prize cards remaining, this attack does 20 more damage for each damage counter on this Pokémon."
						energyCost P
						onAttack {
							damage 20
							if (my.prizeCardSet.size() == 6) damage 20 * self.numberOfDamageCounters
						}
					}
					move "Sword of Dawn", {
						text "130 damage. Discard 2 Energy from this Pokémon."
						energyCost P, P, P
						onAttack {
							damage 130
							afterDamage{
								discardSelfEnergy(C, C)
							}
						}
					}
				};
			case DUSK_MANE_NECROZMA_SM107:
				return basic (this, hp:HP130, type:METAL, retreatCost:2) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					move "Dusk Shot", {
						text "This attack does 60 damage to 1 of your opponent’s Pokémon-GX or Pokémon-EX. This damage isn’t affected by Weakness or Resistance."
						energyCost M
						attackRequirement {
							assert opp.all.findAll { it.pokemonEX || it.pokemonGX }
						}
						onAttack {
							def pcs = opp.all.findAll { it.pokemonEX || it.pokemonGX }.select()
							noWrDamage 60, pcs
						}
					}
					move "Rusty Claws", {
						text "100+ damage. If your opponent has exactly 1 Prize card remaining, this attack does 100 more damage."
						energyCost M, M, C
						onAttack {
							damage 100
							if (opp.prizeCardSet.size() == 1) damage 100
						}
					}
				};
			case ASHS_PIKACHU_SM108:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "I Choose You!" , {
						text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.\n"
						energyCost C
						attackRequirement{
							assert my.deck : "There is no more card in your deck"
						}
						onAttack{
							my.deck.search(count:1,"Choose a Pokémon",cardTypeFilter(POKEMON)).showToOpponent("Selected Pokémon").moveTo(my.hand)
						}
					}
					move "Thunderbolt" , {
						text "100 damage. Discard all Energy from this Pokémon."
						energyCost L,L,L
						onAttack{
							damage 100
							afterDamage{
								discardAllSelfEnergy(null)
							}
						}
					}
				};
				case ASHS_PIKACHU_SM109:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Agility" , {
						text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn.\n"
						energyCost C
						onAttack{
							flip{preventAllDamageNextTurn()}
						}
					}
					move "Thunder" , {
						text "80 damage. Flip a coin. If tails, this Pokémon does 20 damage to itself."
						energyCost L,L,C
						onAttack{
							damage 80
							flip 1,{},{damage 20, self}
						}
					}
				};
				case ASHS_PIKACHU_SM110:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Iron Tail" , {
						text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads.\n"
						energyCost C
						onAttack{
							flipUntilTails {damage 20}
						}
					}
					move "Thunder" , {
						text "80 damage. Flip a coin. If tails, this Pokémon does 20 damage to itself."
						energyCost L,L,C
						onAttack{
							damage 80
							flip 1,{},{damage 20, self}
						}
					}
				};
				case ASHS_PIKACHU_SM111:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Quick Attack" , {
						text "10+ damage. Flip a coin. If heads, this attack does 10 more damage.\n"
						energyCost C
						onAttack{
							damage 10
							flip{damage 10}
						}
					}
					move "Volt Tackle" , {
						text "60 damage. This Pokémon does 10 damage to itself."
						energyCost L,C,C
						onAttack{
							damage 60
							damage 10, self
						}
					}
				};
				case ASHS_PIKACHU_SM112:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Quick Attack" , {
						text "10+ damage. Flip a coin. If heads, this attack does 10 more damage.\n"
						energyCost C
						onAttack{
							damage 10
							flip{damage 10}
						}
					}
					move "Electro Ball" , {
						text "50 damage."
						energyCost L,C,C
						onAttack{
							damage 50
						}
					}
				};
				case ASHS_PIKACHU_SM113:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Iron Tail" , {
						text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads.\n"
						energyCost C
						onAttack{
							flipUntilTails {damage 20}
						}
					}
					move "Electro Ball" , {
						text "50 damage."
						energyCost L,C,C
						onAttack{
							damage 50
						}
					}
				};
				case ASHS_PIKACHU_SM114:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Iron Tail" , {
						text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads.\n"
						energyCost C
						onAttack{
							flipUntilTails {damage 20}
						}
					}
					move "Thunderbolt" , {
						text "100 damage. Discard all Energy from this Pokémon."
						energyCost L,L,L
						onAttack{
							damage 100
							afterDamage{
								discardAllSelfEnergy(null)
							}
						}
					}
				};
			case PHEROMOSA_SM115:
				return copy (ForbiddenLight.PHEROMOSA_11, this);
			case XURKITREE_SM116:
				return copy (ForbiddenLight.XURKITREE_39, this);
			case MALAMAR_SM117:
				return copy (ForbiddenLight.MALAMAR_51, this);
			case LYCANROC_SM118:
				return copy (ForbiddenLight.LYCANROC_76, this);
			case EXEGGCUTE_SM119:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Psy Bolt" , {
						text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost C,C
						onAttack{
							damage 10
							flipThenApplySC PARALYZED
						}
					}
				};
			case ROCKRUFF_SM120:
				return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
					weakness GRASS
					move "Bite" , {
						text "30 damage."
						energyCost C,C
						onAttack{
							damage 30
						}
					}
				};
			case RAIKOU_GX_SM121:
				return basic (this, hp:HP170, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Dig Claws" , {
						text "30 damage."
						energyCost C,C
						onAttack{
							damage 30
						}
					}
					move "Thunder" , {
						text "150 damage. Flip a coin. If tails, this Pokémon does 50 damage to itself."
						energyCost L,L,C,C
						onAttack{
							damage 150
							flip 1,{},{damage 50, self}
						}
					}
					move "Thunderous Rain GX" , {
						text "This attack does 100 damage to each of your opponent's Pokémon that has any Energy attached to it. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
						energyCost L,L,L,L
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							opp.all.each{
								if(it.cards.energyCount(C)){
									damage 100, it
								}
							}
						}
					}
				};
			case ZYGARDE_GX_SM122:
				return basic (this, hp:HP180, type:FIGHTING, retreatCost:2) {
					weakness GRASS
					move "Vibration" , {
						text "20 damage."
						energyCost C
						onAttack{
							damage 20
						}
					}
					move "Cell Storm" , {
						text "80 damage. Heal 30 damage from this Pokémon.\n"
						energyCost F,C,C
						onAttack{
							damage 80
							heal 30, self
						}
					}
					move "Liberation GX" , {
						text "120× damage. Your opponent reveals their hand. This attack does 120 damage for each Energy card you find there. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
						energyCost F,F,C,C
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							if(opp.hand){
								opp.hand.showToMe("Your opponent's hand")
								opp.hand.filterByType(ENERGY).each{
									damage 120
								}
							}
						}
					}
				};
			case DAWN_WINGS_NECROZMA_SM123:
				return copy (DAWN_WINGS_NECROZMA_SM106, this);
			case DUSK_MANE_NECROZMA_SM124:
				return copy (DUSK_MANE_NECROZMA_SM107, this);
			case NAGANADEL_GX_SM125:
				return copy (ForbiddenLight.NAGANADEL_GX_56, this);
			case ULTRA_NECROZMA_GX_SM126:
				return copy (ForbiddenLight.ULTRA_NECROZMA_GX_95, this);
			case ALOLAN_SANDSLASH_SM127:
				return 	evolution (this, from:"Alolan Sandshrew", hp:HP120, type:METAL, retreatCost:2) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					move "Metal Claw" , {
						text "20 damage."
						energyCost M
						onAttack{
							damage 20
						}
					}
					move "Tumbling Attack" , {
						text "80+ damage. Flip a coin. If heads, this attack does 40 more damage."
						energyCost M,M,C
						onAttack{
							damage 80
							flip{damage 40}
						}
					}
				};
				case ALOLAN_NINETALES_SM128:
				return 	evolution (this, from:"Vulpix", hp:HP110, type:FAIRY, retreatCost:1) {
					weakness METAL
					resistance DARKNESS, MINUS20
					move "Smash Kick" , {
						text "30 damage."
						energyCost C,C
						onAttack{
							damage 30
						}
					}
					move "Spiral Drain" , {
						text "80 damage. Heal 30 damage from this Pokémon."
						energyCost Y,Y,C
						onAttack{
							damage 80
							heal 30, self
						}
					}
				};
			case KYOGRE_SM129:
				return copy (CelestialStorm.KYOGRE_46, this);
			case MANECTRIC_SM130:
				return copy (CelestialStorm.MANECTRIC_52, this);
			case CELESTEELA_SM131:
				return copy (CelestialStorm.CELESTEELA_100, this);
			case DELCATTY_SM132:
				return copy (CelestialStorm.DELCATTY_121, this);
			case THUNDURUS_GX_SM133:
				return basic (this, hp:HP180, type:LIGHTNING, retreatCost:2) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Charge" , {
						text "Search your deck for a [L] Energy card and attach it to this Pokémon. Then, shuffle your deck."
						energyCost L
						attackRequirement{
							assert my.deck : "There is no card in your deck"
						}
						onAttack{
							attachEnergyFrom(type:L,my.deck,self)
							shuffleDeck()
						}
					}
					move "Electric Ball" , {
						text "140 damage."
						energyCost L,L,L
						onAttack{
							damage 140
						}
					}
					move "Thundering Hurricane GX" , {
						text "100× damage. Flip 4 coins. This attack does 100 damage for each heads. (You can't user more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
						energyCost L,L,L
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							flip 4,{damage 100}
						}
					}
				};
			case TORNADUS_GX_SM134:
				return basic (this, hp:HP180, type:COLORLESS, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Gust" , {
						text "50 damage."
						energyCost C,C
						onAttack{
							damage 50
						}
					}
					move "Wild Fury" , {
						text "90+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads.\n"
						energyCost C,C,C
						onAttack{
							damage 90
							flipUntilTails {damage 30}
						}
					}
					move "Destructive Cyclone GX" , {
						text "130 damage. Discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
						energyCost C,C,C
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							damage 130
							opp.active.cards.filterByType(ENERGY).discard()
						}
					}
				};
			case LATIAS_SM135:
				return basic (this, hp:HP110, type:DRAGON, retreatCost:1) {
					weakness FAIRY
					move "Hypnoblast" , {
						text "30 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost C,C
						onAttack{
							damage 30
							applyAfterDamage ASLEEP
						}
					}
					move "Mist Ball" , {
						text "110 damage. Flip a coin. If tails, discard a [R] Energy and a [P] Energy from this Pokémon."
						energyCost R,P,C
						onAttack{
							damage 110
							afterDamage{
								discardSelfEnergy R,P
							}
						}
					}
				};
			case LATIOS_SM136:
				return basic (this, hp:HP120, type:DRAGON, retreatCost:2) {
					weakness FAIRY
					move "Energy Extract" , {
						text "20 damage. Search your deck for a basic Energy card and attach it to this Pokémon. Then, shuffle your deck.\n"
						energyCost C
						onAttack{
							damage 20
							afterDamage{
								if(my.deck){
									attachEnergyFrom(basic:true,my.deck,self)
								}
							}
						}
					}
					move "Luster Purge" , {
						text "140 damage. Flip a coin. If tails, discard all Energy attached to this Pokémon."
						energyCost W,P,C,C
						onAttack{
							damage 140
							afterDamage{
								flip 1,{},{discardAllSelfEnergy(null)}
							}
						}
					}
				};
			case RESHIRAM_GX_SM137:
				return copy(DragonMajesty.RESHIRAM_GX_11, this);
			case ZEKROM_GX_SM138:
				return basic (this, hp:HP180, type:LIGHTNING, retreatCost:3) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Bullet Uppercut" , {
						text "10+ damage. If your opponent's Active Pokémon is a Pokémon-GX or a Pokémon-EX, this attack does 60 more damage. This attack's damage isn't affected by Weakness."
						energyCost C
						onAttack{
							noWeaknessDamage(10,defending)
							if(defending.pokemonEX || defending.pokemonGX) noWeaknessDamage(60,defending)

						}
					}
					move "Swift Bolt Strike" , {
						text "80+ damage. Flip 2 coins. This attack does 60 more damage for each heads."
						energyCost L,L,L,C
						onAttack{
							damage 80
							flip 2,{damage 60}
						}
					}
					move "Rampage Bolt GX" , {
						text "200 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
						energyCost L,L,L,C
						attackRequirement{
							gxCheck()
						}
						onAttack{
							gxPerform()
							shredDamage 200
						}
					}
				};
			case SALAMENCE_GX_SM139:
				return copy(DragonMajesty.SALAMENCE_GX_44, this);
			case SALAMENCE_SM140:
				return copy(CelestialStorm.SALAMENCE_106, this);
			case WHITE_KYUREM_GX_SM141:
				return copy(DragonMajesty.WHITE_KYUREM_GX_48, this);
			case KYUREM_SM142:
				return copy(DragonMajesty.KYUREM_47, this);
			case MOLTRES_SM143:
				return basic (this, hp:HP120, type:FIRE, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Wing Attack" , {
						text "70 damage."
						energyCost R,C,C
						onAttack{
							damage 70
						}
					}
					move "Sky Attack" , {
						text "150 damage. Flip a coin. If tails, this attack does nothing."
						energyCost R,C,C,C
						onAttack{
							flip 1,{damage 150},{bc "Sky Attack failed"}
						}
					}
				};
				case ARTICUNO_SM144:
				return basic (this, hp:HP120, type:WATER, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Gust" , {
						text "30 damage."
						energyCost C,C
						onAttack{
							damage 30
						}
					}
					move "Sheer Cold" , {
						text "100 damage. Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
						energyCost W,W,C
						onAttack{
							damage 100
							afterDamage{
								flip {cantAttackNextTurn defending}
							}
						}
					}
				};
			case ZAPDOS_SM146:
				return basic (this, hp:HP120, type:LIGHTNING, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Thunder Shock" , {
						text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L
						onAttack{
							damage 20
							flipThenApplySC PARALYZED
						}
					}
					move "Drill Peck" , {
						text "120 damage."
						energyCost C,C,C,C
						onAttack{
							damage 120
						}
					}
				};
			case LEAFEON_GX_SM145:
				return copy (UltraPrism.LEAFEON_GX_13, this);
			case GLACEON_GX_SM147:
				return copy (UltraPrism.GLACEON_GX_39, this);
			case CHAMPIONS_FESTIVAL_SM148:
				return copy (CHAMPIONS_FESTIVAL_SM78, this);
			case SUICUNE_SM149:
				return copy (LostThunder.SUICUNE_59, this);
			case RAIKOU_SM150:
				return copy (LostThunder.RAIKOU_79, this);
			case GIRATINA_SM151:
				return copy (LostThunder.GIRATINA_97, this);
			case TAPU_LELE_SM152:
				return copy (LostThunder.TAPU_LELE_150, this);
			case ROWLET_SM153:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Leaf Blade" , {
						text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
						energyCost G,C
						onAttack{
							damage 10
							flip{damage 20}
						}
					}
				};
			case SALANDIT_SM154:
				return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Smog" , {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Poisoned."
						energyCost R
						onAttack{
							flip {apply POISONED}
						}
					}
					move "Ember" , {
						text "30 damage. Discard an Energy from this Pokémon."
						energyCost R,C
						onAttack{
							damage 30
							afterDamage{
								discardSelfEnergy C
							}
						}
					}
				};
		case KINGDRA_GX_SM155:
			return copy(DragonMajesty.KINGDRA_GX_18, this);
		case DRAGONITE_GX_SM156:
			return copy(DragonMajesty.DRAGONITE_GX_37, this);
		case PIKACHU_SM157:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				bwAbility "Pika Shield" , {
					text "This Pokémon can't be Paralyzed."
					delayedA {
						before APPLY_SPECIAL_CONDITION, {
							def pcs=e.getTarget(bg)
							if(pcs == self && ef.type == PARALYZED){
								bc "Pika Shield prevents $self from being Paralyzed"
								prevent()
							}
						}
					}
				}
				move "Static Shock" , {
					text "10 damage."
					energyCost L
					onAttack{
						damage 10
					}
				}
			};
			case CHARIZARD_SM158:
				return copy(TeamUp.CHARIZARD_14, this);

		case ZAPDOS_SM159:
			return copy(TeamUp.ZAPDOS_40, this);
		case NIDOQUEEN_SM160:
			return copy(TeamUp.NIDOQUEEN_56, this);

		case JIRACHI_SM161:
			return copy(TeamUp.JIRACHI_99, this);

		case PIKACHU_SM162:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Nuzzle" , {
					text "Flip a coin. If heads, your opponent&#8217;s Active Pokémon is now Paralyzed.\n"
					energyCost C
					onAttack{
						flip{apply PARALYZED}
					}
				}
				move "Thunder Jolt" , {
					text "30 This Pokémon does 10 damage to itself."
					energyCost L,C
					onAttack{
						damage 30
						damage 10, self
					}
				}
			};
			case MIMIKYU_SM163:
				return basic (this, hp:HP070, type:FAIRY, retreatCost:1) {
					move "Mimic" , {
						text "Shuffle your hand into your deck. Then, draw a card for each card in your opponent's hand."
						energyCost Y
						attackRequirement{
							assert my.deck || my.hand : "You don't have any card to draw"
						}
						onAttack{
							my.hand.moveTo(my.deck)
							shuffleDeck()
							draw opp.hand.size()
						}
					}
					move "Play Rough" , {
						text "20+ Flip a coin. If heads, this attack does 20 more damage."
						energyCost Y,C
						onAttack{
							damage 20
							flip {damage 20}
						}
					}
				};
				case DEOXYS_SM164:
					return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
						weakness PSYCHIC
						bwAbility "Power Suction" , {
							text "Once during your turn (before your attack), you may move an Energy from 1 of your Pokémon to 1 of your Deoxys."
							actionA{
								checkLastTurn()
								powerUsed()
								moveEnergy(my.all,my.all.findAll{it.name == "Deoxys"})
							}
						}
						move "Psycho Boost" , {
							text "100 During your next turn, this Pokémon's Psycho Boost's base damage is 50."
							energyCost P,P,C
							onAttack{
								damage 100
								afterDamage{decreasedBaseDamageNextTurn(self,"Psycho Boost",hp(50))}
							}
						}
					};
			case ULTRA_NECROZMA_SM165:
				return basic (this, hp:HP130, type:DRAGON, retreatCost:3) {
					weakness FAIRY
					move "Shining Burst" , {
						text "100+ If the total of both players' remaining Prize cards is 6 or less, discard all Energy attached to this Pokémon, and this attack does 100 more damage."
						energyCost P,P,M,M
						onAttack{
							damage 100
							if(my.prizeCardSet.size() + opp.prizeCardSet.size() <= 6){
								damage 100
								afterDamage{
									discardAllSelfEnergy()
								}
							}
						}
					}
				};
		case MAGIKARP_WAILORD_GX_SM166:
			return copy(TeamUp.MAGIKARP_WAILORD_GX_160, this);

		case FLAREON_GX_SM171:
			return 	evolution (this, from:"Eevee", hp:HP210, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Heat Stage" , {
					text "30 damage. You may attach up to 3 [R] Energy cards from your hand to your pokémon in any way you like"
					energyCost R
					onAttack{
						damage 30
						afterDamage{
							if(my.hand.filterByType(ENERGY).filterByEnergyType(R)){
								attachEnergyFrom(type:R,my.hand,my.all)
								attachEnergyFrom(type:R,my.hand,my.all)
								attachEnergyFrom(type:R,my.hand,my.all)
							}
						}
					}
				}
				move "Bright Flame" , {
					text "190 damage. Discard 2 [R] Energy from this pokémon"
					energyCost R,R,C
					onAttack{
						damage 190
						afterDamage{
							discardSelfEnergy R,R
						}
					}
				}
				move "Power Burner GX" , {
					text "20× damage. This attack does 20 damage for each [R] Energy card in your discard"
					energyCost R
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						damage 20*my.discard.filterByType(ENERGY).filterByEnergyType(R).size()
					}
				}
			};
			case VAPOREON_GX_SM172:
				return 	evolution (this, from:"Eevee", hp:HP210, type:WATER, retreatCost:2) {
					weakness GRASS
					bwAbility "Hydrating Drops" , {
						text "Once during your turn (before your attack), you may heal 30 damage from your Active [W] Pokémon."
						actionA{
							checkLastTurn()
							assert my.active.topPokemonCard.types.contains(W)
							powerUsed()
							heal 30, my.active
						}
					}
					move "Hydro Pump" , {
						text "40+ damage. This attack does 30 more damage times the amount of [W] Energy attached to this Pokémon"
						energyCost C,C,C
						onAttack{
							damage 40+30*self.cards.energyCount(W)
						}
					}
					move "Cure Shower GX" , {
						text "Heal all damage from all of your [W] Pokémon"
						energyCost W
						attackRequirement{
							gxCheck()
						}
						onAttack{
							my.all.each{
								if(it.topPokemonCard.types.contains(W)){
									heal 10*it.numberOfDamageCounters, it
								}
							}
						}
					}
				};
		case JOLTEON_GX_SM173:
			return 	evolution (this, from:"Eevee", hp:HP200, type:LIGHTNING, retreatCost:0) {
				weakness FIGHTING
				resistance METAL, MINUS20
				move "Electrobullet" , {
					text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don&#8217;t apply Weakness and Resistance for Benched Pokémon.)\n"
					energyCost L
					onAttack{
						damage 30
						if(opp.bench){
							damage 30, opp.bench.select()
						}
					}
				}
				move "Head Bolt" , {
					text "110 damage."
					energyCost L,C
					onAttack{
						damage 110
					}
				}
				move "Swift Run GX" , {
					text "110 damage. Prevent all effects of attacks, including damage, done to this Pokémon during your opponent&#8217;s next turn. (You can&#8217;t use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost L,C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						damage 110
						preventAllEffectsNextTurn()
					}
				}
			};
		case EEVEE_GX_SM174:
			return basic (this, hp:HP150, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				bwAbility "Ascension DNA" , {
					text "Once during your turn (before your attack), if you have a Pokémon in your hand that evolves from Eevee, you may put that card onto this Pokémon to evolve it. Before evolving, heal all damage from this Pokémon. You can't use this Ability during your first turn or on the turn this Pokémon was put into play."
					actionA{
						checkLastTurn()
						assert my.hand.findAll{it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"} : "No Stage 1 in your hand"
						assert bg.turnCount > 2 : "Cannot evolve first turn"
						assert self.turnCount < bg.turnCount : "Cannot evolve the turn you put it into play"
						powerUsed()
						def pcs = my.hand.findAll{it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"}.select("Evolve To")
						evolve(self, pcs.first(), PLAY_FROM_HAND)
					}
				}
				move "Boost Dash" , {
					text "100 damage"
					energyCost C,C,C
					onAttack{
						damage 100
					}
				}
				move "Joy Maker GX" , {
					text "Put 3 cards from your discard pile into your hand. (You can't use more than 1 GX attack in a game.)\nPokémon-GX rule: When your Pokémon-GX is Knocked Out, your opponent takes 2 Prize cards."
					energyCost C
					attackRequirement{
						gxCheck()
						assert my.discard : "there is no card in your discard pile"
					}
					onAttack{
						gxPerform()
						my.discard.select(max:3,"select the card you want to put in your hand.").moveTo(my.hand)
					}
				}
		};
		case EEVEE_GX_SM175:
			return copy(EEVEE_GX_SM174, this);

		case EEVEE_GX_SM176:
			return copy(EEVEE_GX_SM174, this);

		case MELTAN_SM177:
			return basic (this, hp:HP060, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				move "Multiply" , {
					text "Search your deck for Meltan and put it onto your Bench. Then, shuffle your deck.\n"
					energyCost M
					callForFamily(name:"Meltan",1,delegate)
				}
				move "Beam" , {
					text "30 damage"
					energyCost C,C
					onAttack{
						damage 30
					}
			}
		};
		case MELMETAL_SM178:
			return evolution (this,from : "Meltan", hp:HP220, type:METAL, retreatCost:4) {
				weakness FIRE
				resistance PSYCHIC, MINUS20
				bwAbility "Hard Coat" , {
					text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					delayedA {
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each{
								if(it.to == self && it.notNoEffect && it.dmg.value) {
									bc "Hard Coat -30"
									it.dmg -= hp(30)
								}
							}
						}
					}
				}
				move "Metal Blast" , {
					text "110+ damage. This attack does 20 more damage times the amount of [M] energy attached to this Pokémon"
					energyCost C,C,C,C
					onAttack{
						damage 110+20*self.cards.energyCount(M)
					}
				}
				move "Iron Force GX", {
					text "Attach any number of [M] Energy cards from your discard pile to this Pokémon"
					energyCost M
					attackRequirement{
						gxCheck()
						assert my.discard.filterByType(ENERGY).filterByEnergyType(M) : "there is no [M] Energy card in your discard pile"
					}
					onAttack{
						gxPerform()
						my.discard.filterByType(ENERGY).filterByEnergyType(M).each{
							attachEnergyFrom(may:true,it,self)
						}
					}
				}

		};
			default:
				return null;
		}
	}

}
