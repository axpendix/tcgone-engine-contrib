package tcgwars.logic.impl.gen7


import tcgwars.logic.impl.gen5.BlackWhitePromos;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*;
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum SunMoonPromos implements LogicCardInfo {

  ROWLET_SM01 ("Rowlet", "SM01", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  LITTEN_SM02 ("Litten", "SM02", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  POPPLIO_SM03 ("Popplio", "SM03", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  PIKACHU_SM04 ("Pikachu", "SM04", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SNORLAX_GX_SM05 ("Snorlax-GX", "SM05", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  ROCKRUFF_SM06 ("Rockruff", "SM06", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  PIKIPEK_SM07 ("Pikipek", "SM07", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LITTEN_SM08 ("Litten", "SM08", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  TOGEDEMARU_SM09 ("Togedemaru", "SM09", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SHIINOTIC_SM10 ("Shiinotic", "SM10", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BRUXISH_SM11 ("Bruxish", "SM11", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  PASSIMIAN_SM12 ("Passimian", "SM12", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  ORANGURU_SM13 ("Oranguru", "SM13", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LYCANROC_GX_SM14 ("Lycanroc-GX", "SM14", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _FIGHTING_]),
  ZYGARDE_SM15 ("Zygarde", "SM15", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  SOLGALEO_GX_SM16 ("Solgaleo-GX", "SM16", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _METAL_]),
  LUNALA_GX_SM17 ("Lunala-GX", "SM17", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _PSYCHIC_]),
  ALOLAN_SANDSLASH_SM18 ("Alolan Sandslash", "SM18", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ORICORIO_SM19 ("Oricorio", "SM19", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  MUDSDALE_SM20 ("Mudsdale", "SM20", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DRAMPA_SM21 ("Drampa", "SM21", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  ROWLET_SM22 ("Rowlet", "SM22", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  LITTEN_SM23 ("Litten", "SM23", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  POPPLIO_SM24 ("Popplio", "SM24", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  LURANTIS_SM25 ("Lurantis", "SM25", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TSAREENA_SM26 ("Tsareena", "SM26", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TURTONATOR_SM27 ("Turtonator", "SM27", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  VIKAVOLT_SM28 ("Vikavolt", "SM28", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  MIMIKYU_SM29 ("Mimikyu", "SM29", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  TAPU_KOKO_SM30 ("Tapu Koko", "SM30", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  TAPU_KOKO_SM31 ("Tapu Koko", "SM31", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  TAPU_BULU_GX_SM32 ("Tapu Bulu-GX", "SM32", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
  TAPU_KOKO_GX_SM33 ("Tapu Koko-GX", "SM33", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  BEWEAR_GX_SM34 ("Bewear-GX", "SM34", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _COLORLESS_]),
  ESPEON_GX_SM35 ("Espeon-GX", "SM35", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _PSYCHIC_]),
  UMBREON_GX_SM36 ("Umbreon-GX", "SM36", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _DARKNESS_]),
  DECIDUEYE_GX_SM37 ("Decidueye-GX", "SM37", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _GRASS_]),
  INCINEROAR_GX_SM38 ("Incineroar-GX", "SM38", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _FIRE_]),
  PRIMARINA_GX_SM39 ("Primarina-GX", "SM39", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _WATER_]),
  JANGMO_O_SM40 ("Jangmo-o", "SM40", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  KOMALA_SM41 ("Komala", "SM41", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  COSMOG_SM42 ("Cosmog", "SM42", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  ALOLAN_MEOWTH_SM43 ("Alolan Meowth", "SM43", Rarity.PROMO, [POKEMON, BASIC, _DARKNESS_]),
  TOGEDEMARU_SM44 ("Togedemaru", "SM44", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  TAPU_LELE_SM45 ("Tapu Lele", "SM45", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  SEVIPER_SM46 ("Seviper", "SM46", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  CRABOMINABLE_SM47 ("Crabominable", "SM47", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ZYGARDE_SM48 ("Zygarde", "SM48", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  BEWEAR_SM49 ("Bewear", "SM49", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TAPU_KOKO_GX_SM50 ("Tapu Koko-GX", "SM50", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  ALOLAN_MEOWTH_SM51 ("Alolan Meowth", "SM51", Rarity.PROMO, [POKEMON, BASIC, _DARKNESS_]),
  GOLISOPOD_SM52 ("Golisopod", "SM52", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DHELMISE_SM53 ("Dhelmise", "SM53", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  LUCARIO_SM54 ("Lucario", "SM54", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DECIDUEYE_SM55 ("Decidueye", "SM55", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TSAREENA_GX_SM56 ("Tsareena-GX", "SM56", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _GRASS_]),
  HO_OH_GX_SM57 ("Ho-Oh-GX", "SM57", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
  NECROZMA_GX_SM58 ("Necrozma-GX", "SM58", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  MARSHADOW_GX_SM59 ("Marshadow-GX", "SM59", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
  CHARIZARD_GX_SM60 ("Charizard-GX", "SM60", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _FIRE_]),
  TAPU_BULU_SM61 ("Tapu Bulu", "SM61", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  GOLISOPOD_GX_SM62 ("Golisopod-GX", "SM62", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _GRASS_]),
  SALAZZLE_GX_SM63 ("Salazzle-GX", "SM63", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _FIRE_]),
  SILVALLY_SM64 ("Silvally", "SM64", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ALOLAN_RAICHU_SM65 ("Alolan Raichu", "SM65", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PHEROMOSA_GX_SM66 ("Pheromosa-GX", "SM66", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _GRASS_]),
  CELESTEELA_GX_SM67 ("Celesteela-GX", "SM67", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  XURKITREE_GX_SM68 ("Xurkitree-GX", "SM68", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _LIGHTNING_]),
  BUZZWOLE_GX_SM69 ("Buzzwole-GX", "SM69", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _FIGHTING_]),
  SHINING_HO_OH_SM70 ("Shining Ho-Oh", "SM70", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  KOMMO_O_GX_SM71 ("Kommo-o-GX", "SM71", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _DRAGON_]),
  ALOLAN_RAICHU_SM72 ("Alolan Raichu", "SM72", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SALAZZLE_SM73 ("Salazzle", "SM73", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  REGIROCK_SM74 ("Regirock", "SM74", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  REGISTEEL_SM75 ("Registeel", "SM75", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  PIKACHU_SM76 ("Pikachu", "SM76", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MEWTWO_SM77 ("Mewtwo", "SM77", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  CHAMPIONS_FESTIVAL_SM78 ("Champions Festival", "SM78", Rarity.PROMO, [TRAINER, STADIUM]),
  SHINING_CELEBI_SM79 ("Shining Celebi", "SM79", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  HO_OH_GX_SM80 ("Ho-Oh-GX", "SM80", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
  PIKACHU_SM81 ("Pikachu", "SM81", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SHINING_LUGIA_SM82 ("Shining Lugia", "SM82", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  ZORUA_SM83 ("Zorua", "SM83", Rarity.PROMO, [POKEMON, BASIC, _DARKNESS_]),
  ZOROARK_GX_SM84 ("Zoroark-GX", "SM84", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _DARKNESS_]),
  MARSHADOW_SM85 ("Marshadow", "SM85", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  PIKACHU_SM86 ("Pikachu", "SM86", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  LATIAS_SM87 ("Latias", "SM87", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  LATIOS_SM88 ("Latios", "SM88", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  ZOROARK_SM89 ("Zoroark", "SM89", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  RAICHU_GX_SM90 ("Raichu-GX", "SM90", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _LIGHTNING_]),
  SILVALLY_GX_SM91 ("Silvally-GX", "SM91", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _COLORLESS_]),
  TAPU_FINI_SM92 ("Tapu Fini", "SM92", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MARSHADOW_SM93 ("Marshadow", "SM93", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  WASH_ROTOM_SM94 ("Wash Rotom", "SM94", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  LUCARIO_SM95 ("Lucario", "SM95", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HEATRAN_SM96 ("Heatran", "SM96", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  GUMSHOOS_SM97 ("Gumshoos", "SM97", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PIKACHU_SM98 ("Pikachu", "SM98", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MIMIKYU_SM99 ("Mimikyu", "SM99", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  LUCARIO_GX_SM100 ("Lucario-GX", "SM100", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _FIGHTING_]),
  DAWN_WINGS_NECROZMA_GX_SM101 ("Dawn Wings Necrozma-GX", "SM101", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  DUSK_MANE_NECROZMA_GX_SM102 ("Dusk Mane Necrozma-GX", "SM102", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  LUNALA_GX_SM103 ("Lunala-GX", "SM103", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _PSYCHIC_]),
  SOLGALEO_GX_SM104 ("Solgaleo-GX", "SM104", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _METAL_]),
  LYCANROC_SM105 ("Lycanroc", "SM105", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DAWN_WINGS_NECROZMA_SM106 ("Dawn Wings Necrozma", "SM106", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _PSYCHIC_]),
  DUSK_MANE_NECROZMA_SM107 ("Dusk Mane Necrozma", "SM107", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _METAL_]),
  ASH_S_PIKACHU_SM108 ("Ash's Pikachu", "SM108", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM109 ("Ash's Pikachu", "SM109", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM110 ("Ash's Pikachu", "SM110", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM111 ("Ash's Pikachu", "SM111", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM112 ("Ash's Pikachu", "SM112", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM113 ("Ash's Pikachu", "SM113", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ASH_S_PIKACHU_SM114 ("Ash's Pikachu", "SM114", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  PHEROMOSA_SM115 ("Pheromosa", "SM115", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _GRASS_]),
  XURKITREE_SM116 ("Xurkitree", "SM116", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _LIGHTNING_]),
  MALAMAR_SM117 ("Malamar", "SM117", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LYCANROC_SM118 ("Lycanroc", "SM118", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  EXEGGCUTE_SM119 ("Exeggcute", "SM119", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  ROCKRUFF_SM120 ("Rockruff", "SM120", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  RAIKOU_GX_SM121 ("Raikou-GX", "SM121", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  ZYGARDE_GX_SM122 ("Zygarde-GX", "SM122", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
  DAWN_WINGS_NECROZMA_SM123 ("Dawn Wings Necrozma", "SM123", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _PSYCHIC_]),
  DUSK_MANE_NECROZMA_SM124 ("Dusk Mane Necrozma", "SM124", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _METAL_]),
  NAGANADEL_GX_SM125 ("Naganadel-GX", "SM125", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  ULTRA_NECROZMA_GX_SM126 ("Ultra Necrozma GX", "SM126", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, ULTRA_BEAST, _DRAGON_]),
  ALOLAN_SANDSLASH_SM127 ("Alolan Sandslash", "SM127", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ALOLAN_NINETALES_SM128 ("Alolan Ninetales", "SM128", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  KYOGRE_SM129 ("Kyogre", "SM129", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MANECTRIC_SM130 ("Manectric", "SM130", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  CELESTEELA_SM131 ("Celesteela", "SM131", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _METAL_]),
  DELCATTY_SM132 ("Delcatty", "SM132", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  THUNDURUS_GX_SM133 ("Thundurus-GX", "SM133", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  TORNADUS_GX_SM134 ("Tornadus-GX", "SM134", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  LATIAS_SM135 ("Latias", "SM135", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  LATIOS_SM136 ("Latios", "SM136", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  RESHIRAM_GX_SM137 ("Reshiram-GX", "SM137", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
  ZEKROM_GX_SM138 ("Zekrom-GX", "SM138", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  SALAMENCE_GX_SM139 ("Salamence-GX", "SM139", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _DRAGON_]),
  SALAMENCE_SM140 ("Salamence", "SM140", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
  WHITE_KYUREM_GX_SM141 ("White Kyurem-GX", "SM141", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _DRAGON_]),
  KYUREM_SM142 ("Kyurem", "SM142", Rarity.PROMO, [POKEMON, BASIC, _DRAGON_]),
  MOLTRES_SM143 ("Moltres", "SM143", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  ARTICUNO_SM144 ("Articuno", "SM144", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  ZAPDOS_SM146 ("Zapdos", "SM145", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  LEAFEON_GX_SM145 ("Leafeon-GX", "SM146", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  GLACEON_GX_SM147 ("Glaceon-GX", "SM147", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  CHAMPIONS_FESTIVAL_SM148 ("Champions Festival", "SM148", Rarity.PROMO, [TRAINER, STADIUM]),
  SUICUNE_SM149 ("Suicune", "SM149", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  RAIKOU_SM150 ("Raikou", "SM150", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  GIRATINA_SM151 ("Giratina", "SM151", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  TAPU_LELE_SM152 ("Tapu Lele", "SM152", Rarity.PROMO, [POKEMON, BASIC, _FAIRY_]),
  ROWLET_SM153 ("Rowlet", "SM153", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  SALANDIT_SM154 ("Salandit", "SM154", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  KINGDRA_GX_SM155 ("Kingdra-GX", "SM155", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _WATER_]),
  DRAGONITE_GX_SM156 ("Dragonite-GX", "SM156", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _DRAGON_]),
  PIKACHU_SM157 ("Pikachu", "SM157", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  CHARIZARD_SM158 ("Charizard", "SM158", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  ZAPDOS_SM159 ("Zapdos", "SM159", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  NIDOQUEEN_SM160 ("Nidoqueen", "SM160", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  JIRACHI_SM161 ("Jirachi", "SM161", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  PIKACHU_SM162 ("Pikachu", "SM162", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MIMIKYU_SM163 ("Mimikyu", "SM163", Rarity.PROMO, [POKEMON, BASIC, _FAIRY_]),
  DEOXYS_SM164 ("Deoxys", "SM164", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  ULTRA_NECROZMA_SM165 ("Ultra Necrozma", "SM165", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _DRAGON_]),
  MAGIKARP_WAILORD_GX_SM166 ("Magikarp & Wailord-GX", "SM166", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
  CELEBI_VENUSAUR_GX_SM167 ("Celebi & Venusaur-GX", "SM167", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
  PIKACHU_ZEKROM_GX_SM168 ("Pikachu & Zekrom-GX", "SM168", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _LIGHTNING_]),
  EEVEE_SNORLAX_GX_SM169 ("Eevee & Snorlax-GX", "SM169", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  DETECTIVE_PIKACHU_SM170 ("Detective Pikachu", "SM170", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  FLAREON_GX_SM171 ("Flareon-GX", "SM171", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _FIRE_]),
  VAPOREON_GX_SM172 ("Vaporeon-GX", "SM172", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _WATER_]),
  JOLTEON_GX_SM173 ("Jolteon-GX", "SM173", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _LIGHTNING_]),
  EEVEE_GX_SM174 ("Eevee-GX", "SM174", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  EEVEE_GX_SM175 ("Eevee-GX", "SM175", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  EEVEE_GX_SM176 ("Eevee-GX", "SM176", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  MELTAN_SM177 ("Meltan", "SM177", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  MELMETAL_SM178 ("Melmetal-GX", "SM178", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _METAL_]),
  VOLCANION_SM179 ("Volcanion", "SM179", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  STAKATAKA_SM180 ("Stakataka", "SM180", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _FIGHTING_]),
  MELMETAL_SM181 ("Melmetal", "SM181", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  PERSIAN_SM182 ("Persian", "SM182", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PIKACHU_SM183 ("Pikachu", "SM183", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  EEVEE_SM184 ("Eevee", "SM184", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  TYPHLOSION_SM185 ("Typhlosion", "SM185", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  FLAREON_SM186 ("Flareon", "SM186", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ALOLAN_MAROWAK_GX_SM187 ("Alolan Marowak-GX", "SM187", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, POKEMON_GX, _FIRE_]),
  KANGASKHAN_GX_SM188 ("Kangaskhan-GX", "SM188", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  BLASTOISE_GX_SM189 ("Blastoise-GX", "SM189", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, POKEMON_GX, _WATER_]),
  DETECTIVE_PIKACHU_SM190 ("Detective Pikachu", "SM190", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MEWTWO_MEW_GX_SM191 ("Mewtwo & Mew-GX", "SM191", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  LUCARIO_MELMETAL_GX_SM192 ("Lucario & Melmetal-GX", "SM192", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _METAL_]),
  GARCHOMP_GIRATINA_GX_SM193 ("Garchomp & Giratina-GX", "SM193", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  DETECTIVE_PIKACHU_SM194 ("Detective Pikachu", "SM194", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  CHARIZARD_GX_SM195 ("Charizard-GX", "SM195", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIRE_]),
  MEWTWO_GX_SM196 ("Mewtwo-GX", "SM196", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  GRENINJA_GX_SM197 ("Greninja-GX", "SM197", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _WATER_]),
  BULBASAUR_SM198 ("Bulbasaur", "SM198", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  PSYDUCK_SM199 ("Psyduck", "SM199", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  SNUBBULL_SM200 ("Snubbull", "SM200", Rarity.PROMO, [POKEMON, BASIC, _FAIRY_]),
  RESHIRAM_CHARIZARD_GX_SM201 ("Reshiram & Charizard-GX", "SM201", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  AMOONGUSS_SM202 ("Amoonguss", "SM202", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TAPU_FINI_SM203 ("Tapu Fini", "SM203", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  NECROZMA_SM204 ("Necrozma", "SM204", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  TERRAKION_SM205 ("Terrakion", "SM205", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  PIKACHU_SM206 ("Pikachu", "SM206", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SUDOWOODO_SM207 ("Sudowoodo", "SM207", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  VIKAVOLT_SM208 ("Vikavolt", "SM208", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  STAKATAKA_SM209 ("Stakataka", "SM209", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _FIGHTING_]),
  MOLTRES_ZAPDOS_ARTICUNO_GX_SM210 ("Moltres & Zapdos & Articuno-GX", "SM210", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  CHARIZARD_GX_SM211 ("Charizard-GX", "SM211", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIRE_]),
  GYARADOS_GX_SM212 ("Gyarados-GX", "SM212", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _WATER_]),
  RAICHU_GX_SM213 ("Raichu-GX", "SM213", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _LIGHTNING_]),
  MEWTWO_SM214 ("Mewtwo", "SM214", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_SM215 ("Mew", "SM215", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  PORYGON_Z_GX_SM216 ("Porygon-Z-GX", "SM216", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _COLORLESS_]),
  TREVENANT_DUSKNOIR_GX_SM217 ("Trevenant & Dusknoir-GX", "SM217", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  BUZZWOLE_SM218 ("Buzzwole", "SM218", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _GRASS_]),
  ENTEI_SM219 ("Entei", "SM219", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  PHIONE_SM220 ("Phione", "SM220", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  BLACEPHALON_SM221 ("Blacephalon", "SM221", Rarity.PROMO, [POKEMON, BASIC, ULTRA_BEAST, _PSYCHIC_]),
  MISMAGIUS_SM222 ("Mismagius", "SM222", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  TERRAKION_SM223 ("Terrakion", "SM223", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  CELEBI_SM224 ("Celebi", "SM224", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  VICTINI_SM225 ("Victini", "SM225", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  CHARIZARD_SM226 ("Charizard", "SM226", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  PIKACHU_SM227 ("Pikachu", "SM227", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ARMORED_MEWTWO_SM228 ("Armored Mewtwo", "SM228", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  VENUSAUR_SNIVY_GX_SM229 ("Venusaur & Snivy-GX", "SM229", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
  CHARIZARD_BRAIXEN_GX_SM230 ("Charizard & Braixen-GX", "SM230", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  CHAMPIONS_FESTIVAL_SM231 ("Champions Festival", "SM231", Rarity.PROMO, [TRAINER, STADIUM]),
  PIKACHU_GX_SM232 ("Pikachu-GX", "SM232", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
  EEVEE_GX_SM233 ("Eevee-GX", "SM233", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  PIKACHU_SM234 ("Pikachu", "SM234", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  EEVEE_SM235 ("Eevee", "SM235", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  ALOLAN_SANDSLASH_GX_SM236 ("Alolan Sandslash-GX", "SM236", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _WATER_]),
  LEAFEON_SM237 ("Leafeon", "SM237", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GLACEON_SM238 ("Glaceon", "SM238", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CARRACOSTA_GX_SM239 ("Carracosta-GX", "SM239", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIGHTING_]),
  ESPEON_DEOXYS_GX_SM240 ("Espeon & Deoxys-GX", "SM240", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  UMBREON_DARKRAI_GX_SM241 ("Umbreon & Darkrai-GX", "SM241", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
  EEVEE_GX_SM242 ("Eevee-GX", "SM242", Rarity.PROMO, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
  REGIGIGAS_SM243 ("Regigigas", "SM243", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  AIPOM_SM244 ("Aipom", "SM244", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SunMoonPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
                if(ef.attacker && ef.attacker.owner == self.owner && (ef.attacker.types.contains(G) || ef.attacker.types.contains(R))){
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
      case JANGMO_O_SM40:
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
              assert opp.all.size() > 1 : "Your opponent only has one Pokémon in play"
            }
            def eff
            onAttack {
              //Taken from UPR Tapu Lele
              eff = delayed {
                before KNOCKOUT, {
                  prevent()
                }
              }
              while(1){
                def pl=(opp.all.findAll {it.numberOfDamageCounters})
                if(!pl) break;
                def src =pl.select("Source for damage counter (cancel to stop)", false)
                if(!src) break;
                def tar = opp.all
                tar.remove(src)
                tar = tar.select("Target for damage counter (cancel to stop)", false)
                if(!tar) break;

                src.damage-=hp(10)
                directDamage 10, tar
              }
              eff.unregister()
              checkFaint()
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
        return copy(BurningShadows.LUCARIO_71, this);
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
              def target = opp.bench.select("Select the new Active Pokémon.")
              if ( sw2(target) ) { apply CONFUSED, target }
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
            }
            onAttack {
              gxPerform()
              if (opp.hand.empty) {
                bc "The attack failed! Opponent has no cards in hand."
              } else if (opp.hand.size() <= 4) {
                opp.hand.discard()
              } else{
                opp.hand.oppSelect(count: 4, "Queen's Command GX - Discard 4 cards from your hand").discard()
              }
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
              assert my.deck : "There are no more cards in your deck"
            }
            onAttack{
              my.deck.search(count:1,"Choose an Item card",cardTypeFilter(ITEM)).showToOpponent("The chosen Item card.").moveTo(my.hand)
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
                  benchPCS(it)
                }
              }
              if(opp.bench.notFull && opp.discard.filterByType(BASIC)){
                opp.discard.filterByType(BASIC).select().each{
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
            text "250 damage. (You can't use more than 1 GX attack in a game.)"
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
      case ASH_S_PIKACHU_SM108:
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
      case ASH_S_PIKACHU_SM109:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Agility" , {
            text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn.\n"
            energyCost C
            onAttack{
              flip{preventAllEffectsNextTurn()}
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
      case ASH_S_PIKACHU_SM110:
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
      case ASH_S_PIKACHU_SM111:
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
      case ASH_S_PIKACHU_SM112:
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
      case ASH_S_PIKACHU_SM113:
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
      case ASH_S_PIKACHU_SM114:
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
            text "This attack does 100 damage to each of your opponent's Pokémon that has any Energy attached to it. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
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
            text "120× damage. Your opponent reveals their hand. This attack does 120 damage for each Energy card you find there. (You can't use more than 1 GX attack in a game.)"
            energyCost F,F,C,C
            attackRequirement {
              assert !bg.em().retrieveObject("gx_"+my.owner) || bg.em().retrieveObject("Bonnie")==bg.turnCount : "Already used a GX attack this game"
            }
            onAttack{
              gxPerform()
              if (opp.hand){
                opp.hand.shuffledCopy().showToMe("Your opponent's hand")
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
            text "100× damage. Flip 4 coins. This attack does 100 damage for each heads. (You can't user more than 1 GX attack in a game.)"
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
            text "130 damage. Discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost C,C,C
            attackRequirement{
              gxCheck()
            }
            onAttack{
              gxPerform()
              damage 130
              targeted (defending) {
                opp.active.cards.filterByType(ENERGY).discard()
              }
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
              afterDamage {
                flip 1, {}, {discardSelfEnergy(R,P)}
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
                if (my.deck) {
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
              before APPLY_SPECIAL_CONDITION, self, {
                if(ef.type == PARALYZED){
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
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.\n"
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
              my.hand.moveTo(hidden:true, my.deck)
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
      case CELEBI_VENUSAUR_GX_SM167:
        return copy(TeamUp.CELEBI_VENUSAUR_GX_1, this);
      case PIKACHU_ZEKROM_GX_SM168:
        return copy(TeamUp.PIKACHU_ZEKROM_GX_33, this);
      case EEVEE_SNORLAX_GX_SM169:
        return copy(TeamUp.EEVEE_SNORLAX_GX_120, this);
      case DETECTIVE_PIKACHU_SM170:
        return copy(DetectivePikachu.DETECTIVE_PIKACHU_10, this);
      case FLAREON_GX_SM171:
        return 	evolution (this, from:"Eevee", hp:HP210, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Heat Stage" , {
            text "30 damage. You may attach up to 3 [R] Energy cards from your hand to your pokémon in any way you like"
            energyCost R
            onAttack{
              damage 30
              afterDamage{
                if(my.hand.filterByType(ENERGY).filterByEnergyType(R) && confirm("Do you want to attach up to 3 [R] Energy cards from your hand to your pokémon in any way you like?")){
                  for (i in 1..3) {
                    def attachedEnergy = attachEnergyFrom(may: true, type: R , my.hand, my.all).get(0)
                    if (attachedEnergy == null || (attachedEnergy as CardList).empty) break
                  }
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
              assert my.active.types.contains(W)
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
              gxPerform()
              my.all.each{
                if(it.types.contains(W)){
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
            text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)\n"
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
            text "110 damage. Prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn. (You can't use more than 1 GX attack in a game.)"
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
        return basic (this, hp:HP160, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Ascension DNA" , {
            text "Once during your turn (before your attack), if you have a Pokémon in your hand that evolves from Eevee, you may put that card onto this Pokémon to evolve it. Before evolving, heal all damage from this Pokémon. You can't use this Ability during your first turn or on the turn this Pokémon was put into play."
            actionA{
              checkLastTurn()
              assert my.hand.findAll{it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"} : "No card that evolves from Eevee in your hand"
              assert bg.turnCount > 2 : "Cannot evolve first turn"
              assert self.turnCount < bg.turnCount : "Cannot evolve the turn you put it into play"
              powerUsed()
              def pcs = my.hand.findAll{it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"}.select("Evolve To")
              healAll self, Source.SRC_ABILITY
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
            text "Put 3 cards from your discard pile into your hand. (You can't use more than 1 GX attack in a game.)"
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
              assert my.discard.filterByEnergyType(M) : "there is no [M] Energy card in your discard pile"
            }
            onAttack{
              gxPerform()
              def list = my.discard.filterByEnergyType(M)
              list.select(max:list.size(),"Attach to $self").each{
                attachEnergy(self,it)
              }
            }
          }
        };
      case VOLCANION_SM179:
        return copy(UnbrokenBonds.VOLCANION_25, this)
      case STAKATAKA_SM180:
        return copy(UnbrokenBonds.STAKATAKA_106, this)
      case MELMETAL_SM181:
        return copy(UnbrokenBonds.MELMETAL_129, this)
      case PERSIAN_SM182:
        return copy(UnbrokenBonds.PERSIAN_148, this)
      case PIKACHU_SM183:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Thunder Jolt", {
            text "40 This pokemon does 20 damage to itself."
            energyCost L,C
            onAttack {
              damage 40
              damage 20, self
            }
          }
        };
      case EEVEE_SM184:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Find a Friend", {
            text "Flip a coin. If heads, search your deck for a pokemon and put it into your hand. Then shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              flip {
                my.deck.search (max: 1, cardTypeFilter(POKEMON)).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Smash Kick", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case TYPHLOSION_SM185:
        return evolution (this,from : "Quilava", hp:HP150, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Exploder", {
            text "Search your deck for up to 3 [R] Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost R
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.filterByEnergyType(R).select(max: 3).each{
                attachEnergy(my.all.select("Attach"), it)
              }
            }
          }
          move "Burning Inferno", {
            text "100 damage. Your opponent’s Active Pokémon is now Burned."
            energyCost R, C, C
            onAttack {
              damage 100
              afterDamage{
                apply BURNED
              }
            }
          }
        };
      case FLAREON_SM186:
        return evolution (this,from : "Eevee", hp:HP110, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Bite", {
            text "20 Damage"
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Fire Spin", {
            text "130 damage. Discard 2 [R] Energy from this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 130
              afterDamage{
                discardSelfEnergy R,R
              }
            }
          }
        };
      case ALOLAN_MAROWAK_GX_SM187:
        return evolution (this, from:"Cubone", hp:HP200, type:R, retreatCost:2) {
          weakness W
          bwAbility "Cursed Body", {
            text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Confused."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && self.active && it.dmg.value && bg.currentTurn == self.owner.opposite) {
                    bc "Cursed Body activates."
                    apply CONFUSED, it.from, SRC_ABILITY
                  }
                }
              }
            }
          }
          move "Fiery Bone", {
            text "90 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R, C, C
            onAttack {
              damage 90
              apply BURNED
            }
          }
          move "Lost Boomerang GX", {
            text "This attack does 50 damage to 2 of your opponent's Pokémon. This damage isn't affected by Weakness or Resistance. If a Pokémon is Knocked Out by this damage, put that Pokémon and all cards attached to it in the Lost Zone instead of the discard pile. (You can't use more than 1 GX attack in a game.)"
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              def pcs = multiSelect(opp.all, 2)
              pcs.each {
                noWrDamage 50, it
              }
              delayed {
                def knockedOut = null
                before KNOCKOUT, {
                  if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner && self.active && ef.pokemonToBeKnockedOut.owner != self.owner ) {
                    knockedOut = ef.pokemonToBeKnockedOut.cards.copy()
                  }
                }
                after KNOCKOUT, {
                  if (knockedOut) {
                    bc "Lost Boomerang GX sends Knocked Out Pokémon to the Lost Zone."
                    knockedOut.moveTo(self.owner.opposite.pbg.lostZone)
                    knockedOut = null
                  }
                }
                unregisterAfter 1
              }
            }
          }
        };
      case KANGASKHAN_GX_SM188:
        return basic (this, hp:HP180, type:C, retreatCost:3) {
          weakness FIGHTING
          move "Split Spiral Punch" , {
            text "20 damage. Your opponent’s Active Pokémon is now Confused."
            energyCost C
            onAttack{
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Enraged Strike" , {
            text "80+ damage. If your opponent’s Active Pokémon is Confused, this attack does 80 more damage."
            energyCost C, C, C
            onAttack{
              damage 80
              if(opp.active.isSPC(CONFUSED)) damage 80
            }
          }
          move "Family Combo GX" , {
            text "150 damage. Draw 5 cards."
            energyCost C, C, C
            attackRequirement{
              gxCheck()
            }
            onAttack{
              gxPerform()
              damage 150
              draw 5
            }
          }
        };
      case BLASTOISE_GX_SM189:
        return copy(UnbrokenBonds.BLASTOISE_GX_35, this);
      case DETECTIVE_PIKACHU_SM190:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Coffee Break", {
            text "Heal 30 damage from this pokemon"
            energyCost C
            onAttack {
              heal 30, self
            }
          }
          move "Corkscrew Punch", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case MEWTWO_MEW_GX_SM191:
        return copy(UnifiedMinds.MEWTWO_MEW_GX_71, this);
      case LUCARIO_MELMETAL_GX_SM192:
        return copy(UnbrokenBonds.LUCARIO_MELMETAL_GX_120, this);
      case GARCHOMP_GIRATINA_GX_SM193:
        return copy(UnifiedMinds.GARCHOMP_GIRATINA_GX_146, this);
      case DETECTIVE_PIKACHU_SM194:
        return basic (this, hp:HP090, type:L, retreatCost:2) {
        weakness F
        resistance M, MINUS20
        move "Brilliant Deduction", {
          text "Look at the top 4 cards of your deck and put 1 of them into your hand. Shuffle the other cards back into your deck."
          energyCost L
          attackRequirement {
            assert my.deck : "Your deck is empty."
          }
          onAttack {
            def top4 = my.deck.subList(0,4)
            top4.select(max:1,"Choose a card to put in your hand.").moveTo(my.hand)
            shuffleDeck()
            }
          }
        };
      case CHARIZARD_GX_SM195:
        return evolution (this, from:"Charmeleon", hp:HP250, type:R, retreatCost:4) {
          weakness W
          move "Raging Destruction", {
            text "Discard the top 8 cards of your deck. If any of those cards are [R] Energy cards, attach them to this Pokémon."
            energyCost R
            attackRequirement {
              assert my.deck : "Your deck is empty."
            }
            onAttack {
              def top8 = my.deck.subList(0,8)
              def list = top8.filterByType(BASIC_ENERGY).filterByEnergyType(R)
              def num = list.size()
              top8.showToMe("The top 8 cards of your deck.")
              if (num) {
                list.showToMe("These [R] Energies will be attached.")
                list.each{attachEnergy(self, it)}
              }
              my.deck.subList(0,8-num).discard()
            }
          }
          move "Steam Artillery", {
            text "200 damage."
            energyCost R, R, C, C, C
            onAttack {
              damage 200
            }
          }
          move "Dreadful Flames GX", {
            text "250 damage. Discard an Energy from each of your opponent's Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost R, R, C, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 250
              opp.all.each {
                if (it.cards.filterByType(ENERGY)) {
                  it.cards.filterByType(ENERGY).select("Discard an Energy.").discard()
                }
              }
            }
          }
        };
      case MEWTWO_GX_SM196:
        return basic (this, hp:HP190, type:P, retreatCost:2) {
        weakness P
        move "Telekinesis", {
          text "This attack does 50 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness or Resistance."
          energyCost P, C
          onAttack {
            noWrDamage 50, opp.all.select()
          }
        }
        move "Reigning Pulse", {
          text "120 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost P, P, C, C
          onAttack {
            damage 120
            apply CONFUSED
          }
        }
        move "Psychic Nova GX", {
          text "180 damage. Prevent all damage done to this Pokémon by attacks during your opponent's next turn. (You can't use more than 1 GX attack in a game.)"
          energyCost P, P, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 180
            preventAllEffectsNextTurn()
            }
          }
        };
      case GRENINJA_GX_SM197:
        return evolution (this, from:"Frogadier", hp:HP230, type:W, retreatCost:1) {
        weakness G
        globalAbility {Card thisCard->
          def lastTurn=0
          action("Elusive Master", [TargetPlayer.fromPlayerType(thisCard.player)]) {
            def text="Once during your turn (before your attack), if this Pokémon is the last card in your hand, you may play it onto your Bench. If you do, draw 3 cards."
            assert thisCard.player.pbg.hand.size() == 1 : "Hand size is not 1"
            assert thisCard.player.pbg.hand.contains(thisCard) : "Not in hand"
            assert thisCard.player.pbg.bench.notFull : "Bench full"
            assert bg.turnCount!=lastTurn : "Already used ability"
            assert checkGlobalAbility(thisCard) : "Blocked ability"
            bc "$thisCard used Elusive Master"
            my.hand.remove(thisCard)
            def pcs = benchPCS(thisCard)
            draw 3
          }
        }
        move "Mist Slash", {
          text "130 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
          energyCost W, C
          onAttack {
            swiftDamage(130, defending)
          }
        }
        move "Dark Mist GX", {
          text "Put 1 of your opponent's Benched Pokémon and all cards attached to it into your opponent’s hand. (You can’t use more than 1 GX attack in a game.)"
          energyCost W
          attackRequirement {
            gxCheck()
            assert opp.bench.notEmpty
          }
          onAttack {
            gxPerform()
            def pcs = opp.bench.select()
            scoopUpPokemon(pcs, delegate)
            }
          }
        };
      case BULBASAUR_SM198:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Ram", {
            text "10 damage"
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Vine Whip", {
            text "50 damage."
            energyCost G, G, C
            onAttack {
              damage 50
            }
          }
        };
      case PSYDUCK_SM199:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness GRASS
          move "Scratch", {
            text "30 damage"
            energyCost W, C
            onAttack {
              damage 30
            }
          }
        };
      case SNUBBULL_SM200:
        return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Bite", {
            text "10 damage"
            energyCost Y
            onAttack {
              damage 10
            }
          }
          move "Paralyzing Gaze", {
            text "Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
        };
      case RESHIRAM_CHARIZARD_GX_SM201:
        return copy(UnbrokenBonds.RESHIRAM_CHARIZARD_GX_20, this);
      case AMOONGUSS_SM202:
        return copy(UnifiedMinds.AMOONGUSS_14, this);
      case TAPU_FINI_SM203:
        return copy(UnifiedMinds.TAPU_FINI_53, this);
      case NECROZMA_SM204:
        return copy(UnifiedMinds.NECROZMA_101, this);
      case TERRAKION_SM205:
        return copy(UnifiedMinds.TERRAKION_122, this);
      case PIKACHU_SM206:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Thunder Shock", {
            text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L, C, C
            onAttack {
              damage 40
              afterDamage {
                flipThenApplySC PARALYZED
              }
            }
          }
        };
      case SUDOWOODO_SM207:
        return basic (this, hp:HP110, type:F, retreatCost:2) {
          weakness W
          move "Low Kick", {
            text "20 damage."
            energyCost F
            onAttack {
              damage 20
            }
          }
          move "Territory Attack", {
            text "80 damage. If you don’t have a Stadium card in play, this attack does nothing."
            energyCost F, F
            onAttack {
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                damage 80
              }
            }
          }
        };
      case VIKAVOLT_SM208:
        return copy(UnbrokenBonds.VIKAVOLT_59, this);
      case STAKATAKA_SM209:
        return copy(UnbrokenBonds.STAKATAKA_106, this);
      case MOLTRES_ZAPDOS_ARTICUNO_GX_SM210:
        return copy(HiddenFates.MOLTRES_ZAPDOS_ARTICUNO_GX_44, this);
      case CHARIZARD_GX_SM211:
        return copy(HiddenFates.CHARIZARD_GX_9, this);
      case GYARADOS_GX_SM212:
        return copy(HiddenFates.GYARADOS_GX_16, this);
      case RAICHU_GX_SM213:
        return copy(HiddenFates.RAICHU_GX_20, this);
      case MEWTWO_SM214:
        return copy(UnbrokenBonds.MEWTWO_75, this);
      case MEW_SM215:
        return copy(UnbrokenBonds.MEW_76, this);
      case PORYGON_Z_GX_SM216:
        return evolution (this, from:"Porygon2", hp:HP240, type:C, retreatCost:2) {
          weakness F
          bwAbility "Troubleshooting", {
            text "Once during your turn (before your attack), you may discard a special energy from this pokemon. If you do, heal 80 damage from this Pokémon."
            actionA {
              checkLastTurn()
              assert self.numberOfDamageCounters : "$self is not damaged"
              assert self.cards.filterByType(SPECIAL_ENERGY) : "There are no special energies attached to $self"
              powerUsed()
              self.cards.filterByType(SPECIAL_ENERGY).select("Discard a Special Energy from your hand to heal 80").discard()
              heal(80, self)
            }
          }
          move "Abnormal Overheating", {
            text "160 damage. This Pokemon is now burned"
            energyCost C, C, C
            onAttack {
              damage 160
              afterDamage {
                apply BURNED, self
              }
            }
          }
          move "Critical Error GX", {
            text "Search your deck for up to 10 cards and discard them. Then shuffle your deck. (You can't use more than 1 gx attack in a game)."
            energyCost C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              if (my.deck) my.deck.search(min: 1, max:10, "Choose up to 10 cards to discard", { true }).discard()
              shuffleDeck()
            }
          }
        };
      case TREVENANT_DUSKNOIR_GX_SM217:
        return basic (this, hp:HP270, type:P, retreatCost:3) {
          weakness D
          resistance F, MINUS20
          move "Night Watch", {
            text "150 damage. Choose 2 random cards from your opponent's hand. Your opponent reveals those cards and shuffles them into their deck."
            energyCost P, P, P
            onAttack {
              damage 150
              afterDamage {
                def number = Math.min(2, opp.hand.size())
                if (number > 0) {
                  opp.hand.shuffledCopy().select(hidden: true, count:number).showToMe("Chosen cards").moveTo(opp.deck)
                  shuffleDeck(null, TargetPlayer.OPPONENT)
                }
              }
            }
          }
          move "Pale Moon GX", {
            text "At the end of your opponent’s next turn, the Defending Pokémon will be Knocked Out. If this Pokémon has at least 1 extra [P] Energy attached to it (in addition to this attack's cost), discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost P, C
            attackRequirement { gxCheck() }
            onAttack {
              gxPerform()

              if (self.cards.energySufficient( thisMove.energyCost + P )) {
                targeted (defending) {
                  opp.active.cards.filterByType(ENERGY).discard()
                }
              }

              def pcs = defending
              targeted(pcs){
                bc "At the end of ${self.owner.opposite}'s next turn, the Defending ${defending} will be Knocked Out. (This effect can be removed by benching/evolving ${defending}.)"
                delayed {
                  before BETWEEN_TURNS, {
                    if (bg.currentTurn == self.owner.opposite && all.contains(pcs)) {
                      bc "Pale Moon GX's effect occurs."
                      new Knockout(pcs).run(bg)
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, pcs, {unregister()}
                  after EVOLVE, pcs, {unregister()}
                  after DEVOLVE, pcs, {unregister()}
                }
              }
            }
          }
        };
      case BUZZWOLE_SM218:
        return copy(CosmicEclipse.BUZZWOLE_21, this);
      case ENTEI_SM219:
        return copy(CosmicEclipse.ENTEI_28, this);
      case PHIONE_SM220:
        return copy(CosmicEclipse.PHIONE_57, this);
      case BLACEPHALON_SM221:
        return copy(CosmicEclipse.BLACEPHALON_104, this);
      case MISMAGIUS_SM222:
      return evolution (this, from:"Misdreavus", hp:HP110, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS20
        move "Psywave", {
          text "20x damage. This attack does 20 damage times the amount of Energy attached to your opponent's Active Pokémon."
          energyCost P
          onAttack {
            damage 20*opp.active.cards.energyCount(C)
          }
        }
        move "Astonish", {
          text "40 damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
          energyCost C, C
          onAttack {
            damage 40
            astonish()
          }
        }
      };
      case TERRAKION_SM223:
        return copy(UnifiedMinds.TERRAKION_122, this);
      case CELEBI_SM224:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Call for Greatness", {
          text "Search your deck for up to 3 Pokémon-GX with different names, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            def info = "Search your deck for up to 3 Pokémon-GX with different names."
            def filter = {card -> card.cardTypes.is(POKEMON_GX)}
            def passFilter = {CardList list ->
              def names = []
              for (card in list) {
                if (names.contains(card.name)) {
                  return false
                }
                names.add card.name
              }
              return true
            }
            def cards = my.deck.search max:3, info, filter, passFilter
            if (cards) {
              cards.showToOpponent "Your opponent added ${cards.join(', ')} to their hand."
              cards.moveTo my.hand
            }
            shuffleDeck()
          }
        }
        move "Psy Bolt", {
          text "40 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost P, C, C
          onAttack {
            damage 40
            flip { apply PARALYZED }
          }
        }
      };
      case VICTINI_SM225:
        return copy(UnifiedMinds.VICTINI_26, this);
      case CHARIZARD_SM226:
        return copy(TeamUp.CHARIZARD_14, this);
      case PIKACHU_SM227:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
            energyCost C
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
          move "Thunderbolt", {
            text "80 damage. Discard all Energy from this Pokémon."
            energyCost L, L, C
            onAttack {
              damage 80
              discardAllSelfEnergy(null)
              }
            }
          };
      case ARMORED_MEWTWO_SM228:
        return basic (this, hp:HP120, type:P, retreatCost:3) {
          weakness P
          move "Psychic Raid", {
            text "130 damage. This Pokémon can’t attack during your next turn."
            energyCost P, P, P
            onAttack {
              damage 130
              cantAttackNextTurn(self)
            }
          }
        };
      case VENUSAUR_SNIVY_GX_SM229:
        return copy(CosmicEclipse.VENUSAUR_SNIVY_GX_1, this);
      case CHARIZARD_BRAIXEN_GX_SM230:
        return copy(CosmicEclipse.CHARIZARD_BRAIXEN_GX_22, this);
      case CHAMPIONS_FESTIVAL_SM231:
        return copy(BlackWhitePromos.CHAMPIONS_FESTIVAL_BW95, this)
      case PIKACHU_GX_SM232:
        return basic (this, hp:HP160, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Volt Tackle", {
            text "150 damage. This Pokémon does 30 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 150
              damage 30, self
            }
          }
          move "Tail Break GX", {
            text "100 damage. Your opponent’s Active Pokémon is now Paralyzed. (You can’t use more than 1 GX attack in a game.)"
            energyCost L, L, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 100
              apply PARALYZED
            }
          }
        };
      case EEVEE_GX_SM233:
        return copy(EEVEE_GX_SM174, this);
      case PIKACHU_SM234:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Find a Friend", {
            text "Flip a coin. If heads, search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty."
            }
            onAttack {
              flip { my.deck.search(max: 1, cardTypeFilter(POKEMON)).moveTo(my.hand)
              shuffleDeck() }
            }
          }
          move "Gnaw", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case EEVEE_SM235:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Running Charge", {
            text "30x damage. Flip a coin until you get tails. This attack does 30 damage for each heads."
            energyCost C, C
            onAttack {
              flipUntilTails { damage 30 }
            }
          }
        };
      case ALOLAN_SANDSLASH_GX_SM236:
        return evolution (this, from:"Alolan Sandshrew", hp:HP200, type:W, retreatCost:2) {
        weakness M
        bwAbility "Spiky Shield", {
          text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), put 3 damage counters on the Attacking Pokémon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && bg.dm().find({ it.to==self && it.dmg.value }) && self.active) {
                directDamage(30, ef.attacker, Source.SRC_ABILITY)
              }
            }
          }
        }
        move "Frost Breath", {
          text "120 damage."
          energyCost W, C, C
          onAttack {
            damage 120
          }
        }
        move "Spiky Storm-GX", {
          text "This attack does 100 damage to each of your opponent's Pokémon that has any damage counters on it. (You can't use more than 1 GX attack in a game.)"
          energyCost W, C, C
          attackRequirement { gxCheck() }
          onAttack {
            gxPerform()

            opp.all.each {
              if (it.numberOfDamageCounters) {
                damage 100, it
              }
            }
          }
        }
        };
      case LEAFEON_SM237:
        return evolution (this, from:"Eevee", hp:HP110, type:G, retreatCost:2) {
          weakness R
          move "Aromax", {
            text "Heal all damage from 1 of your Benched Pokémon."
            energyCost G
            attackRequirement {
              assert my.bench : "You have no Benched Pokémon."
              assert my.bench.find({ it.numberOfDamageCounters }) : "None of your Benched Pokémon are damaged."
            }
            onAttack {
              def benchToHeal = my.bench.findAll { it.numberOfDamageCounters }.select("Select a Benched Pokémon to heal all damage from.")
                if (benchToHeal) {
                healAll benchToHeal
                }
            }
          }
          move "Leaf Blade", {
            text "80+ damage. Flip a coin. If heads, this attack does 40 more damage."
            energyCost G, C, C
            onAttack {
              damage 80
              flip { damage 40 }
            }
          }
        };
      case GLACEON_SM238:
        return evolution (this, from:"Eevee", hp:HP110, type:W, retreatCost:2) {
          weakness M
          move "Snow Cloak", {
            text "30 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost W
            onAttack {
              damage 30
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Hypnotic Blizzard", {
            text "90 damage. Your opponent's active Pokémon is now Asleep. This attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, C
            onAttack {
              damage 90
              apply ASLEEP
              opp.bench.each {
                damage 20, it
              }
            }
          }
        };
      case CARRACOSTA_GX_SM239:
        return evolution (this, from:"Tirtouga", hp:HP250, type:F, retreatCost:4) {
          weakness G
          bwAbility "High Density Armor", {
            text "If this Pokémon has full HP, it takes 90 less damage from your opponent’s attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.damage == hp(0) && it.to.owner == self.owner && it.notNoEffect && it.dmg.value && it.to == self) {
                    bc "High Density Armor -90"
                    it.dmg -= hp(90)
                  }
                }
              }
            }
          }
          move "Ground Crush", {
            text "160 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F, C, C, C
            onAttack {
              damage 160
              cantRetreat defending
            }
          }
          move "Stone Age GX", {
            text "Put any number of Pokémon that evolve from Unidentified Fossil from your discard pile onto your Bench. (You can’t use more than 1 GX attack in a game.)"
            energyCost C
            def babyFossils = { my.discard.findAll { it.cardTypes.is(EVOLUTION) && it.predecessor == "Unidentified Fossil" } }
            attackRequirement {
              gxCheck()
              assert babyFossils() : "No Pokémon that evolve from Unidentified Fossil in your discard pile."
            }
            onAttack {
              gxPerform()
              def maxSpace = my.bench.freeBenchCount
              if (maxSpace){
                babyFossils().select(min:0, max: maxSpace, "Bench up to $maxSpace card(s) from the discard that evolve from Unidentified Fossil.").each{
                    benchPCS(it)
                }
              } else {
                bc "Bench is full, $thisMove does nothing!"
              }
            }
          }
        };
      case ESPEON_DEOXYS_GX_SM240:
        return copy(UnifiedMinds.ESPEON_DEOXYS_GX_72, this);
      case UMBREON_DARKRAI_GX_SM241:
        return copy(UnifiedMinds.UMBREON_DARKRAI_GX_125, this);
      case EEVEE_GX_SM242:
        return copy(EEVEE_GX_SM174, this);
      case REGIGIGAS_SM243:
        return basic (this, hp:HP150, type:C, retreatCost:4) {
          weakness F
          move "Hammer In", {
            text "60 damage."
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }
          move "Regiblast", {
            text "180 damage. Discard the top card of your opponent’s deck."
            energyCost W, F, M, C, C
            onAttack {
              damage 180
              if (opp.deck) {
                opp.deck.subList(0,1).discard()
              }
            }
          }
        };
      case AIPOM_SM244:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Yank Out", {
            text "Discard random cards from your opponent's hand until they have 5 cards in their hand."
            energyCost C
            attackRequirement {
              assert opp.hand.size() > 5 : "Opponent has 5 or less cards in hand."
            }
            onAttack {
              opp.hand.shuffledCopy().select(hidden: true, count:opp.hand.size() - 5,"Choose the cards to discard.").discard()
            }
          }
          move "Tail Smash", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip { damage 30 }
            }
          }
        };
      default:
        return null;
    }
  }
}
