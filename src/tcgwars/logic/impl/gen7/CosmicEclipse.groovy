package tcgwars.logic.impl.gen7


import tcgwars.logic.effect.gm.PlayCard
import tcgwars.logic.effect.gm.PlayStadium
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

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum CosmicEclipse implements LogicCardInfo {

  VENUSAUR_SNIVY_GX_1 ("Venusaur & Snivy-GX", 1, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
  ODDISH_2 ("Oddish", 2, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GLOOM_3 ("Gloom", 3, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VILEPLUME_GX_4 ("Vileplume-GX", 4, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _GRASS_]),
  TANGELA_5 ("Tangela", 5, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TANGROWTH_6 ("Tangrowth", 6, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SUNKERN_7 ("Sunkern", 7, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SUNFLORA_8 ("Sunflora", 8, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HERACROSS_9 ("Heracross", 9, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  LILEEP_10 ("Lileep", 10, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CRADILY_11 ("Cradily", 11, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TROPIUS_12 ("Tropius", 12, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  KRICKETOT_13 ("Kricketot", 13, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KRICKETUNE_14 ("Kricketune", 14, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DEERLING_15 ("Deerling", 15, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SAWSBUCK_16 ("Sawsbuck", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ROWLET_17 ("Rowlet", 17, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ROWLET_18 ("Rowlet", 18, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_19 ("Dartrix", 19, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_20 ("Decidueye", 20, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BUZZWOLE_21 ("Buzzwole", 21, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _GRASS_]),
  CHARIZARD_BRAIXEN_GX_22 ("Charizard & Braixen-GX", 22, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  PONYTA_23 ("Ponyta", 23, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  RAPIDASH_24 ("Rapidash", 24, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FLAREON_25 ("Flareon", 25, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SLUGMA_26 ("Slugma", 26, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MAGCARGO_27 ("Magcargo", 27, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ENTEI_28 ("Entei", 28, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  TORKOAL_29 ("Torkoal", 29, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  VICTINI_30 ("Victini", 30, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  TEPIG_31 ("Tepig", 31, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  PIGNITE_32 ("Pignite", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  EMBOAR_33 ("Emboar", 33, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  LARVESTA_34 ("Larvesta", 34, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_GX_35 ("Volcarona-GX", 35, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIRE_]),
  LITLEO_36 ("Litleo", 36, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  PYROAR_37 ("Pyroar", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BLASTOISE_PIPLUP_GX_38 ("Blastoise & Piplup-GX", 38, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
  ALOLAN_VULPIX_39 ("Alolan Vulpix", 39, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PSYDUCK_40 ("Psyduck", 40, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GOLDUCK_41 ("Golduck", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VAPOREON_42 ("Vaporeon", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SNEASEL_43 ("Sneasel", 43, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WEAVILE_44 ("Weavile", 44, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WAILMER_45 ("Wailmer", 45, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WAILORD_46 ("Wailord", 46, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SNORUNT_47 ("Snorunt", 47, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GLALIE_48 ("Glalie", 48, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SPHEAL_49 ("Spheal", 49, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SPHEAL_50 ("Spheal", 50, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEALEO_51 ("Sealeo", 51, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WALREIN_52 ("Walrein", 52, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  KYOGRE_53 ("Kyogre", 53, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  PIPLUP_54 ("Piplup", 54, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PRINPLUP_55 ("Prinplup", 55, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  EMPOLEON_56 ("Empoleon", 56, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PHIONE_57 ("Phione", 57, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  TYMPOLE_58 ("Tympole", 58, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DUCKLETT_59 ("Ducklett", 59, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWANNA_60 ("Swanna", 60, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BLACK_KYUREM_61 ("Black Kyurem", 61, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  WISHIWASHI_62 ("Wishiwashi", 62, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  WISHIWASHI_GX_63 ("Wishiwashi-GX", 63, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
  DEWPIDER_64 ("Dewpider", 64, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  ARAQUANID_65 ("Araquanid", 65, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_66 ("Pikachu", 66, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_67 ("Raichu", 67, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNEMITE_68 ("Magnemite", 68, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MAGNETON_69 ("Magneton", 69, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTEON_70 ("Jolteon", 70, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  CHINCHOU_71 ("Chinchou", 71, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  LANTURN_72 ("Lanturn", 72, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TOGEDEMARU_73 ("Togedemaru", 73, Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TOGEDEMARU_74 ("Togedemaru", 74, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SOLGALEO_LUNALA_GX_75 ("Solgaleo & Lunala-GX", 75, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  KOFFING_76 ("Koffing", 76, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WEEZING_77 ("Weezing", 77, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  NATU_78 ("Natu", 78, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  XATU_79 ("Xatu", 79, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  RALTS_80 ("Ralts", 80, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KIRLIA_81 ("Kirlia", 81, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALLADE_82 ("Gallade", 82, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DUSKULL_83 ("Duskull", 83, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DUSCLOPS_84 ("Dusclops", 84, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DUSKNOIR_85 ("Dusknoir", 85, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  ROTOM_86 ("Rotom", 86, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOOBAT_87 ("Woobat", 87, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWOOBAT_88 ("Swoobat", 88, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOLETT_89 ("Golett", 89, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_90 ("Golurk", 90, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SKRELP_91 ("Skrelp", 91, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DRAGALGE_92 ("Dragalge", 92, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  PHANTUMP_93 ("Phantump", 93, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  TREVENANT_94 ("Trevenant", 94, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ORICORIO_GX_95 ("Oricorio-GX", 95, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  MIMIKYU_96 ("Mimikyu", 96, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MIMIKYU_97 ("Mimikyu", 97, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  DHELMISE_98 ("Dhelmise", 98, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  COSMOG_99 ("Cosmog", 99, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  COSMOG_100 ("Cosmog", 100, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  COSMOEM_101 ("Cosmoem", 101, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LUNALA_102 ("Lunala", 102, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MARSHADOW_103 ("Marshadow", 103, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  BLACEPHALON_104 ("Blacephalon", 104, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _PSYCHIC_]),
  ONIX_105 ("Onix", 105, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  NOSEPASS_106 ("Nosepass", 106, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TRAPINCH_107 ("Trapinch", 107, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TRAPINCH_108 ("Trapinch", 108, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  VIBRAVA_109 ("Vibrava", 109, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FLYGON_GX_110 ("Flygon-GX", 110, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIGHTING_]),
  ANORITH_111 ("Anorith", 111, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ARMALDO_112 ("Armaldo", 112, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  GROUDON_113 ("Groudon", 113, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  DRILBUR_114 ("Drilbur", 114, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  EXCADRILL_115 ("Excadrill", 115, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PALPITOAD_116 ("Palpitoad", 116, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SEISMITOAD_117 ("Seismitoad", 117, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  THROH_118 ("Throh", 118, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  PANCHAM_119 ("Pancham", 119, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PANGORO_120 ("Pangoro", 120, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CRABRAWLER_121 ("Crabrawler", 121, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CRABOMINABLE_122 ("Crabominable", 122, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ROCKRUFF_123 ("Rockruff", 123, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LYCANROC_124 ("Lycanroc", 124, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PASSIMIAN_125 ("Passimian", 125, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDYGAST_126 ("Sandygast", 126, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PALOSSAND_127 ("Palossand", 127, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ALOLAN_MEOWTH_128 ("Alolan Meowth", 128, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ALOLAN_PERSIAN_GX_129 ("Alolan Persian-GX", 129, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  ALOLAN_GRIMER_130 ("Alolan Grimer", 130, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ALOLAN_MUK_131 ("Alolan Muk", 131, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CARVANHA_132 ("Carvanha", 132, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ABSOL_133 ("Absol", 133, Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  PAWNIARD_134 ("Pawniard", 134, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  BISHARP_135 ("Bisharp", 135, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GUZZLORD_136 ("Guzzlord", 136, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _DARKNESS_]),
  ALOLAN_SANDSHREW_137 ("Alolan Sandshrew", 137, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  ALOLAN_SANDSLASH_138 ("Alolan Sandslash", 138, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  STEELIX_139 ("Steelix", 139, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MAWILE_140 ("Mawile", 140, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  PROBOPASS_141 ("Probopass", 141, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SOLGALEO_142 ("Solgaleo", 142, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  TOGEPI_CLEFFA_IGGLYBUFF_GX_143 ("Togepi & Cleffa & Igglybuff-GX", 143, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FAIRY_]),
  CLEFAIRY_144 ("Clefairy", 144, Rarity.UNCOMMON, [POKEMON, BASIC, _FAIRY_]),
  ALOLAN_NINETALES_145 ("Alolan Ninetales", 145, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  AZURILL_146 ("Azurill", 146, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  COTTONEE_147 ("Cottonee", 147, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  WHIMSICOTT_148 ("Whimsicott", 148, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  FLABEBE_149 ("Flabébé", 149, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  FLABEBE_150 ("Flabébé", 150, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  FLOETTE_151 ("Floette", 151, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  FLORGES_152 ("Florges", 152, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FAIRY_]),
  SWIRLIX_153 ("Swirlix", 153, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  SLURPUFF_154 ("Slurpuff", 154, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  SYLVEON_155 ("Sylveon", 155, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  ARCEUS_DIALGA_PALKIA_GX_156 ("Arceus & Dialga & Palkia-GX", 156, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  RESHIRAM_ZEKROM_GX_157 ("Reshiram & Zekrom-GX", 157, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  NAGANADEL_GUZZLORD_GX_158 ("Naganadel & Guzzlord-GX", 158, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _DRAGON_]),
  DRAMPA_159 ("Drampa", 159, Rarity.RARE, [POKEMON, BASIC, _DRAGON_]),
  JANGMO_O_160 ("Jangmo-o", 160, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  JANGMO_O_161 ("Jangmo-o", 161, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  HAKAMO_O_162 ("Hakamo-o", 162, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  KOMMO_O_163 ("Kommo-o", 163, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
  ULTRA_NECROZMA_164 ("Ultra Necrozma", 164, Rarity.HOLORARE, [POKEMON, BASIC, ULTRA_BEAST, _DRAGON_]),
  MEGA_LOPUNNY_JIGGLYPUFF_GX_165 ("Mega Lopunny & Jigglypuff-GX", 165, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  EEVEE_166 ("Eevee", 166, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_167 ("Eevee", 167, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  IGGLYBUFF_168 ("Igglybuff", 168, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  AIPOM_169 ("Aipom", 169, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  AMBIPOM_170 ("Ambipom", 170, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TEDDIURSA_171 ("Teddiursa", 171, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_172 ("Ursaring", 172, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ZANGOOSE_173 ("Zangoose", 173, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  LILLIPUP_174 ("Lillipup", 174, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HERDIER_175 ("Herdier", 175, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STOUTLAND_176 ("Stoutland", 176, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  RUFFLET_177 ("Rufflet", 177, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BRAVIARY_178 ("Braviary", 178, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  HELIOPTILE_179 ("Helioptile", 179, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HELIOLISK_180 ("Heliolisk", 180, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STUFFUL_181 ("Stufful", 181, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BEWEAR_182 ("Bewear", 182, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TYPE_NULL_183 ("Type: Null", 183, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  SILVALLY_GX_184 ("Silvally-GX", 184, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  BEASTITE_185 ("Beastite", 185, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BELLELBA_BRYCEN_MAN_186 ("Bellelba & Brycen-Man", 186, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  CHAOTIC_SWELL_187 ("Chaotic Swell", 187, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  CLAY_188 ("Clay", 188, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CYNTHIA_CAITLIN_189 ("Cynthia & Caitlin", 189, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  DRAGONIUM_Z_DRAGON_CLAW_190 ("Dragonium Z: Dragon Claw", 190, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ERIKA_191 ("Erika", 191, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GREAT_CATCHER_192 ("Great Catcher", 192, Rarity.UNCOMMON, [TRAINER, ITEM]),
  GUZMA_HALA_193 ("Guzma & Hala", 193, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  ISLAND_CHALLENGE_AMULET_194 ("Island Challenge Amulet", 194, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  LANA_S_FISHING_ROD_195 ("Lana's Fishing Rod", 195, Rarity.UNCOMMON, [TRAINER, ITEM]),
  LILLIE_S_FULL_FORCE_196 ("Lillie's Full Force", 196, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LILLIE_S_POKE_DOLL_197 ("Lillie's Poké Doll", 197, Rarity.UNCOMMON, [TRAINER, ITEM]),
  MALLOW_LANA_198 ("Mallow & Lana", 198, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  MISTY_LORELEI_199 ("Misty & Lorelei", 199, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  N_S_RESOLVE_200 ("N's Resolve", 200, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROFESSOR_OAK_S_SETUP_201 ("Professor Oak's Setup", 201, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RED_BLUE_202 ("Red & Blue", 202, Rarity.UNCOMMON, [TRAINER, SUPPORTER, TAG_TEAM]),
  ROLLER_SKATER_203 ("Roller Skater", 203, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ROSA_204 ("Rosa", 204, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ROXIE_205 ("Roxie", 205, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TAG_CALL_206 ("Tag Call", 206, Rarity.UNCOMMON, [TRAINER, ITEM]),
  UNIDENTIFIED_FOSSIL_207 ("Unidentified Fossil", 207, Rarity.UNCOMMON, [TRAINER, ITEM]),
  WILL_208 ("Will", 208, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DRAW_ENERGY_209 ("Draw Energy", 209, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  VENUSAUR_SNIVY_GX_210 ("Venusaur & Snivy-GX", 210, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
  VILEPLUME_GX_211 ("Vileplume-GX", 211, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _GRASS_]),
  CHARIZARD_BRAIXEN_GX_212 ("Charizard & Braixen-GX", 212, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  VOLCARONA_GX_213 ("Volcarona-GX", 213, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIRE_]),
  BLASTOISE_PIPLUP_GX_214 ("Blastoise & Piplup-GX", 214, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
  BLASTOISE_PIPLUP_GX_215 ("Blastoise & Piplup-GX", 215, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
  SOLGALEO_LUNALA_GX_216 ("Solgaleo & Lunala-GX", 216, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  ORICORIO_GX_217 ("Oricorio-GX", 217, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  FLYGON_GX_218 ("Flygon-GX", 218, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIGHTING_]),
  ALOLAN_PERSIAN_GX_219 ("Alolan Persian-GX", 219, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  ARCEUS_DIALGA_PALKIA_GX_220 ("Arceus & Dialga & Palkia-GX", 220, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  ARCEUS_DIALGA_PALKIA_GX_221 ("Arceus & Dialga & Palkia-GX", 221, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  RESHIRAM_ZEKROM_GX_222 ("Reshiram & Zekrom-GX", 222, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  NAGANADEL_GUZZLORD_GX_223 ("Naganadel & Guzzlord-GX", 223, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _DRAGON_]),
  NAGANADEL_GUZZLORD_GX_224 ("Naganadel & Guzzlord-GX", 224, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _DRAGON_]),
  MEGA_LOPUNNY_JIGGLYPUFF_GX_225 ("Mega Lopunny & Jigglypuff-GX", 225, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  MEGA_LOPUNNY_JIGGLYPUFF_GX_226 ("Mega Lopunny & Jigglypuff-GX", 226, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  SILVALLY_GX_227 ("Silvally-GX", 227, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  CYNTHIA_CAITLIN_228 ("Cynthia & Caitlin", 228, Rarity.ULTRARARE, [TRAINER, SUPPORTER, TAG_TEAM]),
  GUZMA_HALA_229 ("Guzma & Hala", 229, Rarity.ULTRARARE, [TRAINER, SUPPORTER, TAG_TEAM]),
  LILLIE_S_FULL_FORCE_230 ("Lillie's Full Force", 230, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  MALLOW_LANA_231 ("Mallow & Lana", 231, Rarity.ULTRARARE, [TRAINER, SUPPORTER, TAG_TEAM]),
  N_S_RESOLVE_232 ("N's Resolve", 232, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  PROFESSOR_OAK_S_SETUP_233 ("Professor Oak's Setup", 233, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  RED_BLUE_234 ("Red & Blue", 234, Rarity.ULTRARARE, [TRAINER, SUPPORTER, TAG_TEAM]),
  ROLLER_SKATER_235 ("Roller Skater", 235, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  ROSA_236 ("Rosa", 236, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  TORKOAL_237 ("Torkoal", 237, Rarity.SECRET, [POKEMON, BASIC, _FIRE_]),
  WEAVILE_238 ("Weavile", 238, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIPLUP_239 ("Piplup", 239, Rarity.SECRET, [POKEMON, BASIC, _WATER_]),
  WISHIWASHI_240 ("Wishiwashi", 240, Rarity.SECRET, [POKEMON, BASIC, _WATER_]),
  PIKACHU_241 ("Pikachu", 241, Rarity.SECRET, [POKEMON, BASIC, _LIGHTNING_]),
  MAGNEMITE_242 ("Magnemite", 242, Rarity.SECRET, [POKEMON, BASIC, _LIGHTNING_]),
  KOFFING_243 ("Koffing", 243, Rarity.SECRET, [POKEMON, BASIC, _PSYCHIC_]),
  GALLADE_244 ("Gallade", 244, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MIMIKYU_245 ("Mimikyu", 245, Rarity.SECRET, [POKEMON, BASIC, _PSYCHIC_]),
  EXCADRILL_246 ("Excadrill", 246, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  STEELIX_247 ("Steelix", 247, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  STOUTLAND_248 ("Stoutland", 248, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  VENUSAUR_SNIVY_GX_249 ("Venusaur & Snivy-GX", 249, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
  VILEPLUME_GX_250 ("Vileplume-GX", 250, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _GRASS_]),
  CHARIZARD_BRAIXEN_GX_251 ("Charizard & Braixen-GX", 251, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _FIRE_]),
  VOLCARONA_GX_252 ("Volcarona-GX", 252, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIRE_]),
  BLASTOISE_PIPLUP_GX_253 ("Blastoise & Piplup-GX", 253, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
  SOLGALEO_LUNALA_GX_254 ("Solgaleo & Lunala-GX", 254, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
  ORICORIO_GX_255 ("Oricorio-GX", 255, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  FLYGON_GX_256 ("Flygon-GX", 256, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIGHTING_]),
  ALOLAN_PERSIAN_GX_257 ("Alolan Persian-GX", 257, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
  ARCEUS_DIALGA_PALKIA_GX_258 ("Arceus & Dialga & Palkia-GX", 258, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  RESHIRAM_ZEKROM_GX_259 ("Reshiram & Zekrom-GX", 259, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
  NAGANADEL_GUZZLORD_GX_260 ("Naganadel & Guzzlord-GX", 260, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, ULTRA_BEAST, _DRAGON_]),
  MEGA_LOPUNNY_JIGGLYPUFF_GX_261 ("Mega Lopunny & Jigglypuff-GX", 261, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  SILVALLY_GX_262 ("Silvally-GX", 262, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _COLORLESS_]),
  GIANT_HEARTH_263 ("Giant Hearth", 263, Rarity.SECRET, [TRAINER, STADIUM]),
  GREAT_CATCHER_264 ("Great Catcher", 264, Rarity.SECRET, [TRAINER, ITEM]),
  ISLAND_CHALLENGE_AMULET_265 ("Island Challenge Amulet", 265, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
  LANA_S_FISHING_ROD_266 ("Lana's Fishing Rod", 266, Rarity.SECRET, [TRAINER, ITEM]),
  LILLIE_S_POKE_DOLL_267 ("Lillie's Poké Doll", 267, Rarity.SECRET, [TRAINER, ITEM]),
  MARTIAL_ARTS_DOJO_268 ("Martial Arts Dojo", 268, Rarity.SECRET, [TRAINER, STADIUM]),
  POWER_PLANT_269 ("Power Plant", 269, Rarity.SECRET, [TRAINER, STADIUM]),
  TAG_CALL_270 ("Tag Call", 270, Rarity.SECRET, [TRAINER, ITEM]),
  DRAW_ENERGY_271 ("Draw Energy", 271, Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  CosmicEclipse(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.COSMIC_ECLIPSE;
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
      case VENUSAUR_SNIVY_GX_1:
        return basic (this, hp:HP270, type:G, retreatCost:3) {
          weakness R
          bwAbility "Shining Vine", {
            text "Once during your turn, if this Pokémon is your Active Pokémon, when you attach a [G] Energy card from your hand to it, you may switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
            delayedA {
              after ATTACH_ENERGY, self, {
                checkLastTurn()
                if (self.active && ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(G) && opp.bench && confirm("Use Shining Vine?")) {
                  sw(opp.active, opp.bench.select(), SRC_ABILITY)
                  powerUsed()
                }
              }
            }
          }
          move "Forest Dump", {
            text "160 damage."
            energyCost G, C, C, C
            onAttack {
              damage 160
            }
          }
          move "Solar Plant GX", {
            text "This attack does 50 damage to each of your opponent's Pokémon. If this Pokémon has at least 2 extra Energy attached to it (in addition to this attack's cost), heal all damage from all of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can’t use more than 1 GX attack in a game.)"
            energyCost C, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              opp.all.each {
                damage 50, it
              }

              if (self.cards.energySufficient(thisMove.energyCost + C + C)) {
                my.all.each {heal it.damage.value, it}
              }
            }
          }
        };
      case ODDISH_2:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Sweet Scent", {
            text "Heal 30 damage from 1 of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.all.findAll{it.numberOfDamageCounters} : "Your Pokémon have no damage."
            }
            onAttack{
              heal 30, my.all.findAll{it.numberOfDamageCounters}.select("Select a Pokémon to heal.")
            }
          }
        };
      case GLOOM_3:
        return evolution (this, from:"Oddish", hp:HP080, type:G, retreatCost:2) {
          weakness R
          move "Sleep Powder", {
            text "20 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost G
            onAttack {
              damage 20
              apply ASLEEP
            }
          }
        };
      case VILEPLUME_GX_4:
        return evolution (this, from:"Gloom", hp:HP240, type:G, retreatCost:2) {
          weakness R
          bwAbility "Fragrant Flower Garden", {
            text "Once during your turn (before your attack), you may heal 30 damage from each of your Pokémon."
            actionA {
              checkLastTurn()
              powerUsed()
              my.all.each {
                heal(30, it, SRC_ABILITY)
              }
            }
          }
          move "Massive Bloom", {
            text "180- damage. This attack does 10 less damage for each damage counter on this Pokémon."
            energyCost G, C
            onAttack {
              damage 180 - (10*self.numberOfDamageCounters)
            }
          }
          move "Allergic Explosion GX", {
            text "50 damage. Your opponent's Active Pokémon is now Burned, Paralyzed, and Poisoned. (You can't use more than 1 GX attack in a game.)"
            energyCost G
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 50
              apply BURNED
              apply PARALYZED
              apply POISONED
            }
          }
        };
      case TANGELA_5:
        return basic (this, hp:HP070, type:G, retreatCost:2) {
          weakness R
          move "Toxic", {
            text "Your opponent's Active Pokémon is now Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns."
            energyCost G
            onAttack {
              apply POISONED
              extraPoison 1
            }
          }
        };
      case TANGROWTH_6:
        return evolution (this, from:"Tangela", hp:HP140, type:G, retreatCost:3) {
          weakness R
          move "Grass Knot", {
            text "10+ damage. This attack does 30 more damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost G
            onAttack {
              damage 10
              damage 30*opp.active.retreatCost
            }
          }
          move "Slam", {
            text "80x damage. Flip 2 coins. This attack does 80 damage for each heads."
            energyCost G, C, C
            onAttack {
              flip 2, { damage 80 }
            }
          }
        };
      case SUNKERN_7:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R
          move "Leech Seed", {
            text "10 damage. Heal 10 damage from this Pokémon."
            energyCost G
            onAttack {
              damage 10
              heal 10, self
            }
          }
        };
      case SUNFLORA_8:
        return evolution (this, from:"Sunkern", hp:HP090, type:G, retreatCost:1) {
          weakness R
          move "Solar Power", {
            text "During your next turn, ignore all Energy in the attack costs of [G] Pokémon and [R] Pokémon. (This includes Pokémon that come into play on that turn.)"
            energyCost C, C
            onAttack {
              delayed {
                before CHECK_ATTACK_REQUIREMENTS, {
                  if(ef.attacker.owner == self.owner && (ef.attacker.types.contains(G) || ef.attacker.types.contains(R)) && bg.currentTurn == self.owner && bg.em().retrieveObject("Solar_Power") != bg.turnCount) {
                    bg.em().storeObject("Solar_Power", bg.turnCount)
                    def copy = ef.move.shallowCopy()
                    copy.energyCost.clear()
                    attack (copy as Move)
                    prevent()
                  }
                }
                unregisterAfter 3
              }
            }
          }
          move "Solar Beam", {
            text "80 damage."
            energyCost G, C, C
            onAttack {
              damage 80
            }
          }
        };
      case HERACROSS_9:
        return basic (this, hp:HP130, type:G, retreatCost:3) {
          weakness R
          move "Lunge Out", {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
          move "Riled Horn", {
            text "50+ damage. If your opponent has any TAG TEAM Pokémon in play, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 50
              if(opp.all.find{it.tagTeam}) damage 70
            }
          }
        };
      case LILEEP_10:
        return evolution (this, from:"Unidentified Fossil", hp:HP090, type:G, retreatCost:2) {
          weakness R
          move "Confuse Ray", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost G
            onAttack {
              apply CONFUSED
            }
          }
          move "Seed Bomb", {
            text "60 damage."
            energyCost G, C, C
            onAttack {
              damage 60
            }
          }
        };
      case CRADILY_11:
        return evolution (this, from:"Lileep", hp:HP150, type:G, retreatCost:3) {
          weakness R
          bwAbility "Swaying Strangle", {
            text "Your opponent's Pokémon that are affected by Special Conditions can't retreat."
            delayedA {
              before RETREAT, {
                if (ef.retreater.owner==self.owner.opposite && ef.retreater.specialConditions) {
                  wcu "Swaying Strangle prevents you from retreating."
                  prevent()
                }
              }
            }
          }
          move "Poison Tentacles", {
            text "110 damage. Your opponent’s Active Pokémon is now Poisoned."
            energyCost G, C, C
            onAttack {
              damage 110
              apply POISONED
            }
          }
        };
      case TROPIUS_12:
        return basic (this, hp:HP120, type:G, retreatCost:2) {
          weakness R
          move "Synthesis", {
            text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(count : 1, "Search for a [G] Energy card to attach with." ,basicEnergyFilter(G)).each {attachEnergy(my.all.select(),it)}
              shuffleDeck()
            }
          }
          move "Leaf Drain", {
            text "50 damage. Heal 30 damage from this Pokémon."
            energyCost G, C
            onAttack {
              damage 50
              heal 30, self
            }
          }
        };
      case KRICKETOT_13:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Bug Bite", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }
        };
      case KRICKETUNE_14:
        return evolution (this, from:"Kricketot", hp:HP100, type:G, retreatCost:2) {
          weakness R
          move "Improvisational Performance", {
            text "30+ damage. If you have exactly 1 card in your hand, this attack does 100 more damage. If you have exactly 3 cards in your hand, your opponent's Active Pokémon is now Confused. If you have exactly 6 cards in your hand, this attack does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            onAttack {
              damage 30
              if(hand.size() == 1) {
                damage 100
              } else if (hand.size() == 3){
                applyAfterDamage CONFUSED
              } else if (hand.size() == 6) {
                opp.bench.each{ damage 30, it }
              }
            }
          }
        };
      case DEERLING_15:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Tackle", {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
        };
      case SAWSBUCK_16:
        return evolution (this, from:"Deerling", hp:HP100, type:G, retreatCost:2) {
          weakness R
          bwAbility "Seasonal Blessings", {
            text "Once during your turn (before your attack), you may draw a card."
            actionA {
              assert my.deck : "Your deck is empty."
              checkLastTurn()
              powerUsed()
              draw 1
            }
          }
          move "Bounce", {
            text "60 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost G, C
            onAttack {
              damage 60

              afterDamage {
                if (my.bench && confirm("Switch $self with 1 of your Benched Pokémon?")) {
                  sw self, my.bench.select("Choose a new Active Pokémon.")
                }
              }
            }
          }
        };
      case ROWLET_17:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R
          move "Hide and Seek", {
            text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost G
            onAttack {
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Tackle", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }
        };
      case ROWLET_18:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Skill Dive", {
            text "This attack does 10 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            onAttack {
              damage 10, opp.all.select("Deal 10 damage to which Pokémon?")
            }
          }
        };
      case DARTRIX_19:
        return evolution (this, from:"Rowlet", hp:HP080, type:G, retreatCost:1) {
          weakness R
          move "Leafage", {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
          move "Wing Flick", {
            text "30 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              whirlwind()
            }
          }
        };
      case DECIDUEYE_20:
        return evolution (this, from:"Dartrix", hp:HP140, type:G, retreatCost:1) {
          weakness R
          move "Skill Dive", {
            text "This attack does 40 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            onAttack {
              damage 40, opp.all.select()
            }
          }
          move "Tracking Shot", {
            text "80 damage. This attack does 80 damage to 1 of your opponent’s Benched Pokémon that has any damage counters on it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement{
            }
            onAttack {
              damage 80
              if(opp.bench.findAll{ it.numberOfDamageCounters }){
                damage 80, opp.bench.findAll{ it.numberOfDamageCounters }.select()
              }
            }
          }
        };
      case BUZZWOLE_21:
        return basic (this, hp:HP130, type:G, retreatCost:2) {
          weakness R
          bwAbility "Beast Boost", {
            text "This Pokémon's attacks do 20 more damage to your opponent's Active Pokémon for each Prize card you have taken (before applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.from == self && my.prizeCardSet.takenCount > 0 && it.dmg.value && it.notNoEffect) {
                    def plusDmg = 20*my.prizeCardSet.takenCount
                    bc "Beast Boost +$plusDmg"
                    it.dmg += hp(plusDmg)
                  }
                }
              }
            }
          }
          move "Touchdown", {
            text "60 damage. Heal 30 damage from this Pokémon."
            energyCost G, C
            onAttack {
              damage 60
              heal 30, self
            }
          }
        };
      case CHARIZARD_BRAIXEN_GX_22:
        return basic (this, hp:HP270, type:R, retreatCost:3) {
          weakness W
          move "Brilliant Flare", {
            text "180 damage. You may search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck."
            energyCost R, R, R, C
            onAttack {
              damage 180
              deck.select(min:0, max:3, "Select up to 3 cards to put in your hand.").moveTo(hidden:true, hand)
              shuffleDeck()
            }
          }
          move "Crimson Flame Pillar GX", {
            text "Attach 5 basic Energy cards from your discard pile to your Pokémon in any way you like. If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack's cost), your opponent's Active Pokémon is now Burned and Confused. (You can’t use more than 1 GX attack in a game.)"
            energyCost R
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              if (self.cards.energySufficient(thisMove.energyCost + C)) {
                apply BURNED
                apply CONFUSED
              }
              attachEnergyFrom(basic:true, my.discard, my.all)
              attachEnergyFrom(basic:true, my.discard, my.all)
              attachEnergyFrom(basic:true, my.discard, my.all)
              attachEnergyFrom(basic:true, my.discard, my.all)
              attachEnergyFrom(basic:true, my.discard, my.all)
            }
          }
        };
      case PONYTA_23:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W
          move "Minor Errand-Running", {
            text "Search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement{
              assert my.deck : "Your deck is empty."
            }
            onAttack{
              my.deck.search(max:2, "Choose up to 2 basic Energy cards.", cardTypeFilter(BASIC_ENERGY)).showToOpponent("Opponent's selected basic Energy.").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Flare", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
        };
      case RAPIDASH_24:
        return evolution (this, from:"Ponyta", hp:HP100, type:R, retreatCost:0) {
          weakness W
          move "Overrun", {
            text "30 damage. This attack does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R
            onAttack {
              damage 30
              if (opp.bench) damage 30, opp.bench.select()
            }
          }
          move "Flame Tail", {
            text "60 damage."
            energyCost R, C
            onAttack {
              damage 60
            }
          }
        };
      case FLAREON_25:
        return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:2) {
          weakness W
          bwAbility "Power Cheer", {
            text "The attacks of your Pokémon-GX in play that evolve from Eevee do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance). You can't apply more than 1 Power Cheer Ability at a time."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(it.from.owner == self.owner && it.from.pokemonGX && it.from.topPokemonCard.cardTypes.isEvolution() && it.from.topPokemonCard.predecessor == "Eevee" && it.to.active && it.to.owner != self.owner && it.dmg.value && bg.em().retrieveObject("Power Cheer") != bg.turnCount) {
                    it.dmg += hp(30)
                    bc "Power Cheer +30"
                    bg.em().storeObject("Power Cheer", bg.turnCount)
                  }
                }
              }
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy from this Pokémon."
            energyCost R, C, C
            onAttack {
              damage 90
              discardSelfEnergy C
            }
          }
        };
      case SLUGMA_26:
        return basic (this, hp:HP080, type:R, retreatCost:3) {
          weakness W
          move "Singe", {
            text "Your opponent's Active Pokémon is now Burned."
            energyCost R
            onAttack {
              apply BURNED
            }
          }
        };
      case MAGCARGO_27:
        return evolution (this, from:"Slugma", hp:HP120, type:R, retreatCost:3) {
          weakness W
          move "Stomp Off", {
            text "Discard the top 2 cards of your opponent’s deck."
            energyCost R
            onAttack {
              opp.deck.subList(0, 2).discard()
            }
          }
          move "Flamethrower", {
            text "80 damage. Discard an Energy from this Pokémon."
            energyCost R, C
            onAttack {
              damage 80
              discardSelfEnergy C
            }
          }
        };
      case ENTEI_28:
        return basic (this, hp:HP130, type:R, retreatCost:2) {
          weakness W
          move "Rally Back", {
            text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage."
            energyCost R, C
            onAttack {
              damage 30
              if (my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1) damage 90
            }
          }
          move "Fire Mane", {
            text "100 damage."
            energyCost R, R, C
            onAttack {
              damage 100
            }
          }
        };
      case TORKOAL_29:
        return basic (this, hp:HP110, type:R, retreatCost:2) {
          weakness W
          move "Fire Fling", {
            text "Put 4 [R] Energy cards from your discard pile into your hand."
            energyCost R
            attackRequirement {
              assert my.discard.filterByEnergyType(R)
            }
            onAttack {
              my.discard.filterByEnergyType(R).select(count:4, "Choose 4 [R] Energy to put into your hand.").moveTo(hand)
            }
          }
          move "Kindle", {
            text "100 damage. Discard an Energy from this Pokémon. If you do, discard an Energy from your opponent's Active Pokémon."
            energyCost R, R, R
            onAttack {
              damage 100
              if(confirm("Would you like to discard an Energy card attached to Torkoal? If you do, you discard an Energy attached to the Defending Pokémon.")) {
                discardSelfEnergy C
                discardDefendingEnergy()
              }
            }
          }
        };
      case VICTINI_30:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W
          bwAbility "Victory Heal", {
            text "Once during your turn (before your attack), you may heal 20 damage from 1 of your Benched Pokémon."
            actionA {
              checkLastTurn()
              def tar = my.bench.findAll { it.numberOfDamageCounters }
              assert tar
              heal 20, tar.select("Which Pokémon to heal 20 damage?"), SRC_ABILITY
              powerUsed()
            }
          }
          move "Combustion", {
            text "30 damage."
            energyCost R, C
            onAttack {
              damage 30
            }
          }
        };
      case TEPIG_31:
        return basic (this, hp:HP080, type:R, retreatCost:2) {
          weakness W
          move "Live Coal", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Rollout", {
            text "40 damage."
            energyCost R, C, C
            onAttack {
              damage 40
            }
          }
        };
      case PIGNITE_32:
        return evolution (this, from:"Tepig", hp:HP110, type:R, retreatCost:4) {
          weakness W
          move "Tackle", {
            text "30 damage."
            energyCost R, C
            onAttack {
              damage 30
            }
          }
          move "Heat Crash", {
            text "60 damage."
            energyCost R, C, C
            onAttack {
              damage 60
            }
          }
        };
      case EMBOAR_33:
        return evolution (this, from:"Pignite", hp:HP170, type:R, retreatCost:4) {
          weakness W
          bwAbility "Explosive Fire Dance", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may look at the top 8 cards of your deck and attach any number of basic Energy cards you find there to your Pokémon in any way you like. Shuffle the other cards back into your deck."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.deck && confirm("Use Explosive Fire Dance?")) {
                powerUsed()
                def tar = my.deck.subList(0, 8)
                tar.showToMe("The top 8 cards of your deck. You will be asked to pick target Pokémon for every basic Energy there.")
                tar.filterByType(ENERGY).each {
                  def pcs = my.all.select("Attach $it to? (cancel to skip this card)", false)
                  if (pcs) {
                    attachEnergy(pcs, it)
                  }
                }
                shuffleDeck()
              }
            }
          }
          move "Heat Blast", {
            text "160 damage."
            energyCost R, C, C, C
            onAttack {
              damage 160
            }
          }
        };
      case LARVESTA_34:
        return basic (this, hp:HP080, type:R, retreatCost:3) {
          weakness W
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Combustion", {
            text "50 damage."
            energyCost R, R, C
            onAttack {
              damage 50
            }
          }
        };
      case VOLCARONA_GX_35:
        return evolution (this, from:"Larvesta", hp:HP210, type:R, retreatCost:3) {
          weakness W
          bwAbility "Flaming Shot", {
            text "Once during your turn (before your attack), you may discard a [R] Energy card from your hand. If you do, put 2 damage counters on 1 of your opponent's Pokémon."
            actionA {
              checkLastTurn()
              assert my.hand.filterByEnergyType(R) : "No [R] Energies in your hand."
              powerUsed()
              my.hand.filterByEnergyType(R).select("Discard a [R] Energy.").discard()
              directDamage 20, opp.all.select(), SRC_ABILITY
            }
          }
          move "Backfire", {
            text "160 damage. Put 2 [R] Energy attached to this Pokémon into your hand."
            energyCost R, R, C
            onAttack {
              damage 160
              afterDamage {
                self.cards.filterByEnergyType(R).select("Choose [R] Energy to move into your hand.").moveTo(my.hand)
                self.cards.filterByEnergyType(R).select("Choose [R] Energy to move into your hand.").moveTo(my.hand)
              }
            }
          }
          move "Massive Heat Wave GX", {
            text "Discard an Energy from each of your opponent's Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost R
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              opp.all.each{
                if (it.cards.filterByType(ENERGY)) {
                  it.cards.filterByType(ENERGY).select("Discard an Energy.").discard()
                }
              }
            }
          }
        };
      case LITLEO_36:
        return basic (this, hp:HP070, type:R, retreatCost:2) {
          weakness W
          move "Tackle", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Flame Tail", {
            text "20 damage."
            energyCost R, C
            onAttack {
              damage 20
            }
          }
        };
      case PYROAR_37:
        return evolution (this, from:"Litleo", hp:HP130, type:R, retreatCost:2) {
          weakness W
          move "Swirling Inferno", {
            text "70 damage. Discard all Pokémon Tool cards and Special Energy from each of your opponent's Pokémon."
            energyCost R, R, C
            onAttack {
              damage 70
              opp.all.each {
                it.cards.filterByType(POKEMON_TOOL).discard()
                it.cards.filterByType(SPECIAL_ENERGY).discard()
              }
            }
          }
          move "Heat Blast", {
            text "140 damage."
            energyCost R, R, R, C
            onAttack {
              damage 140
            }
          }
        };
      case BLASTOISE_PIPLUP_GX_38:
        return basic (this, hp:HP270, type:W, retreatCost:3) {
          weakness G
          move "Splash Maker", {
            text "150 damage. You may attach up to 3 [W] Energy cards from your hand to your Pokémon in any way you like. If you do, heal 50 damage from those Pokémon for each card you attached to them in this way."
            energyCost W, W, C
            onAttack {
              damage 150
              def tar = my.hand.filterByBasicEnergyType(W)
              if (tar) {
                tar.select(min:0, max:3, "Select up to 3 [W] Energy to attach from your hand.").each {
                  def selected = my.all.select("Attach the [W] Energy to?")
                  attachEnergy(selected, it)
                  heal 50, selected
                }
              }
            }
          }
          move "Bubble Launcher GX", {
            text "100+ damage. Your opponent's Active Pokémon is now Paralyzed. If this Pokémon has at least 3 extra [W] Energy attached to it (in addition to this attack's cost), this attack does 150 more damage. (You can't use more than 1 GX attack in a game.)"
            energyCost W, W, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 100
              apply PARALYZED
              if (self.cards.energySufficient(thisMove.energyCost + W + W + W)) {
                damage 150
              }
            }
          }
        };
      case ALOLAN_VULPIX_39:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness M
          bwAbility "Snowed In", {
            text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent’s)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(!self.active && it.to == self) {
                    bc "Snowed In prevents damage done to $self."
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Gnaw", {
            text "10 damage."
            onAttack {
              damage 10
            }
          }
        };
      case PSYDUCK_40:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Scratch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Confusion Wave", {
            text "20 damage. Both Active Pokémon are now Confused."
            energyCost W, C
            onAttack {
              damage 20
              apply CONFUSED
              apply CONFUSED, self
            }
          }
        };
      case GOLDUCK_41:
        return evolution (this, from:"Psyduck", hp:HP110, type:W, retreatCost:1) {
          weakness G
          move "Scratch", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Energy Loop", {
            text "80 damage. Put an Energy attached to this Pokémon into your hand."
            energyCost W, C
            onAttack {
              damage 80
              afterDamage{
                self.cards.filterByType(ENERGY).select("Select an Energy to put back into your hand.").moveTo(my.hand)
              }
            }
          }
        };
      case VAPOREON_42:
        return evolution (this, from:"Eevee", hp:HP110, type:W, retreatCost:2) {
          weakness G
          bwAbility "Vitality Cheer", {
            def target = []
            def source = []
            bg.em().storeObject("Vitality_Cheer_target", target)
            bg.em().storeObject("Vitality_Cheer_source", source)
            text "Your Pokémon-GX in play that evolve from Eevee get +60 HP. You can't apply more than 1 Vitality Cheer Ability at a time."
            getterA (GET_FULL_HP) {h->
              def pcs = h.effect.target
              if (pcs.owner == self.owner && pcs.pokemonGX && pcs.topPokemonCard.cardTypes.is(EVOLUTION) && pcs.topPokemonCard.predecessor == "Eevee"){
                target = bg.em().retrieveObject("Vitality_Cheer_target")
                source = bg.em().retrieveObject("Vitality_Cheer_source")
                if(!target.contains(pcs)){
                  h.object += hp(60)
                  target.add(pcs)
                  bg.em().storeObject("Vitality_Cheer_target", target)
                  source.add(self)
                  bg.em().storeObject("Vitality_Cheer_source", source)
                } else if(source.get(target.indexOf(pcs)) == self){
                  h.object += hp(60)
                }
              }
            }
          }
          move "Refreshing Rain", {
            text "60 damage. Heal 30 damage from each of your Pokémon."
            energyCost W, C, C
            onAttack {
              damage 60
              my.all.each {
                heal 30, it
              }
            }
          }
        };
      case SNEASEL_43:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness M
          move "Agility", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost D
            onAttack {
              damage 10
              flip { preventAllEffectsNextTurn() }
            }
          }
        };
      case WEAVILE_44:
        return evolution (this, from:"Sneasel", hp:HP090, type:W, retreatCost:0) {
          weakness M
          move "Nasty Plot", {
            text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
            energyCost D
            attackRequirement{
              assert my.deck : "Your deck is empty."
            }
            onAttack{
              my.deck.select(max: 2).moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Slashing Claw", {
            text "110 damage."
            energyCost D, D, C
            onAttack {
              damage 110
            }
          }
        };
      case WAILMER_45:
        return basic (this, hp:HP120, type:W, retreatCost:3) {
          weakness G
          move "Wave Splash", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }
        };
      case WAILORD_46:
        return evolution (this, from:"Wailmer", hp:HP200, type:W, retreatCost:4) {
          weakness G
          move "Heavy Impact", {
            text "90 damage."
            energyCost W, C, C
            onAttack {
              damage 90
            }
          }
          move "Hydro Splash", {
            text "140 damage."
            energyCost W, W, C, C
            onAttack {
              damage 140
            }
          }
        };
      case SNORUNT_47:
        return basic (this, hp:HP060, type:W, retreatCost:2) {
          weakness M
          move "Continuous Headbutt", {
            text "20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
            energyCost W
            onAttack {
              flipUntilTails { damage 20 }
            }
          }
        };
      case GLALIE_48:
        return evolution (this, from:"Snorunt", hp:HP120, type:W, retreatCost:3) {
          weakness M
          move "Ice Fang", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed, and discard an Energy from that Pokémon."
            energyCost W
            onAttack {
              damage 30
              flip {
                apply PARALYZED
                discardDefendingEnergy C
              }
            }
          }
          move "Frosty Typhoon", {
            text "120 damage. This Pokémon can't use Frosty Typhoon during your next turn."
            energyCost W, C, C
            onAttack {
              damage 120
              cantUseAttack(thisMove, self)
            }
          }
        };
      case SPHEAL_49:
        return basic (this, hp:HP060, type:W, retreatCost:2) {
          weakness M
          move "Rollout", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Icy Snow", {
            text "20 damage."
            energyCost W, C
            onAttack {
              damage 20
            }
          }
        };
      case SPHEAL_50:
        return basic (this, hp:HP070, type:W, retreatCost:2) {
          weakness M
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost W, C, C
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }
        };
      case SEALEO_51:
        return evolution (this, from:"Spheal", hp:HP100, type:W, retreatCost:3) {
          weakness M
          move "Rollout", {
            text "20 damage."
            energyCost W
            onAttack {
              damage 20
            }
          }
          move "Ice Ball", {
            text "90 damage."
            energyCost W, C, C, C
            onAttack {
              damage 90
            }
          }
        };
      case WALREIN_52:
        return evolution (this, from:"Sealeo", hp:HP160, type:W, retreatCost:4) {
          weakness M
          move "Cold Snap", {
            text "60 damage. Your opponent can’t play any Trainer cards from their hand during their next turn. If 1 of your Pokémon used Cold Snap during your last turn, this attack can't be used."
            energyCost W
            attackRequirement {
              assert (bg.em().retrieveObject("Cold_Snap") != bg.turnCount - 2)
            }
            onAttack {
              damage 60
              bg.em().storeObject("Cold_Snap", bg.turnCount)
              delayed {
                before PLAY_TRAINER, {
                  if (bg.currentTurn == self.owner.opposite) {
                    wcu "Cold Snap prevents you from playing Trainer cards."
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Blizzard", {
            text "120 damage. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, C, C, C
            onAttack {
              damage 120
              opp.all.each { damage 10, it }
            }
          }
        };
      case KYOGRE_53:
        return basic (this, hp:HP130, type:W, retreatCost:3) {
          weakness G
          move "High Water", {
            text "Attach 2 [W] Energy cards from your discard pile to 1 of your Pokémon."
            energyCost C
            onAttack {
              afterDamage {
                def list = my.discard.filterByEnergyType(W).select(count:2)
                def pcs = my.all.select("Attach [W] Energy to which Pokémon?")
                list.each {attachEnergy(pcs, it)}
              }
            }
          }
          move "Swirling Waves", {
            text "130 damage. Discard an Energy from this Pokémon."
            energyCost W, W, C, C
            onAttack {
              damage 130
              discardSelfEnergy C
            }
          }
        };
      case PIPLUP_54:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness L
          move "Bubble Hold", {
            text "80 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn."
            energyCost W, W, W
            onAttack {
              damage 80
              if (defending.basic) {
                cantAttackNextTurn(defending)
              }
            }
          }
        };
      case PRINPLUP_55:
        return evolution (this, from:"Piplup", hp:HP080, type:W, retreatCost:2) {
          weakness L
          move "Water Drip", {
            text "20 damage."
            energyCost W
            onAttack {
              damage 20
            }
          }
          move "Direct Dive", {
            text "Discard all Energy from this Pokémon. This attack does 100 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, W
            onAttack {
              discardAllSelfEnergy()
              damage 100, opp.all.select()
            }
          }
        };
      case EMPOLEON_56:
        return evolution (this, from:"Prinplup", hp:HP160, type:W, retreatCost:2) {
          weakness L
          move "Recall", {
            text "Choose an attack from 1 of this Pokémon's previous Evolutions and use it as this attack."
            energyCost C
            def eff
            onAttack {
              def moves = []
              for (card in self.cards.filterByType(POKEMON)) {
                if (card != self.topPokemonCard) {
                  moves += card.moves
                }
              }
              if(moves) {
                def move=choose(moves, moves.collect({it.name}), "Choose a move to use.")
                def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                attack (move as Move)
                bef.unregisterItself(bg().em())
              }
            }
          }
          move "Aquafall", {
            text "130 damage. Discard all Energy from this Pokémon."
            energyCost C, C
            onAttack {
              damage 130
              discardAllSelfEnergy()
            }
          }
        };
      case PHIONE_57:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness G
          bwAbility "Whirlpool Suction", {
            text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon. If you do, discard all cards attached to this Pokémon and put it on the bottom of your deck."
            actionA {
              checkLastTurn()
              assert self.benched
              assert opp.bench
              powerUsed()
              sw(opp.active, opp.bench.oppSelect("Choose a new Active Pokémon."))
              self.cards.getExcludedList(self.topPokemonCard).discard()
              self.cards.moveTo(my.deck)
              removePCS(self)
            }
          }
          move "Rain Splash", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
        };
      case TYMPOLE_58:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Flail Around", {
            text "10x damage. Flip 3 coins. This attack does 10 damage for each heads."
            energyCost C
            onAttack {
              flip 3, { damage 10 }
            }
          }
        };
      case DUCKLETT_59:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Aerial Ace", {
            text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost C, C
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }
        };
      case SWANNA_60:
        return evolution (this, from:"Ducklett", hp:HP110, type:W, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Tailwind", {
            text "Attach an Energy card from your hand to 1 of your Pokémon."
            energyCost C
            onAttack {
              if (my.hand.filterByType(ENERGY)) {
                attachEnergyFrom(my.hand, my.all)
              }
            }
          }
          move "Air Slash", {
            text "70 damage. Discard an Energy from this Pokémon."
            energyCost C, C
            onAttack {
              damage 70
              discardSelfEnergy(C)
            }
          }
        };
      case BLACK_KYUREM_61:
        return basic (this, hp:HP130, type:W, retreatCost:3) {
          weakness M
          move "Frozen Wings", {
            text "30 damage. Discard a Special Energy from your opponent's Active Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              discardDefendingSpecialEnergy(delegate)
            }
          }
          move "Dazzling Blizzard", {
            text "100+ damage. If you have any Stadium card in play, this attack does 100 more damage."
            energyCost W, W, C, C
            onAttack {
              damage 100
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                damage 100
              }
            }
          }
        };
      case WISHIWASHI_62:
        return basic (this, hp:HP180, type:W, retreatCost:3) {
          weakness L
          bwAbility "Scatter", {
            text "At the end of your opponent's turn, if this Pokémon has any damage counters on it, flip a coin. If tails, shuffle this Pokémon and all cards attached to it into your deck."
            delayedA {
              before BETWEEN_TURNS, {
                if (self.numberOfDamageCounters && bg.currentTurn != self.owner) {
                  flip("$self Scatter",{},{
                    self.cards.moveTo(self.owner.pbg.deck)
                    removePCS(self)
                    shuffleDeck(null, self.owner.toTargetPlayer())
                  })
                }
              }
            }
          }
          move "Hydro Splash", {
            text "130 damage."
            energyCost W, W, C
            onAttack {
              damage 130
            }
          }
        };
      case WISHIWASHI_GX_63:
        return basic (this, hp:HP130, type:W, retreatCost:1) {
          weakness L
          move "School Storm", {
            text "20x damage. This attack does 20 damage for each of your Wishiwashi and Wishiwashi-GX in play."
            energyCost W, C
            onAttack {
              def count = my.all.findAll { it.name == "Wishiwashi" || it.name == "Wishiwashi-GX" }.size()
              damage count*20
            }
          }
          move "Massive Catch GX", {
            text "Look at the top 12 cards of your deck and put any number of Basic Pokémon you find there onto your Bench. Shuffle the other cards back into your deck. (You can’t use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
              assert my.bench.notFull
              assert my.deck.notEmpty
            }
            onAttack {
              gxPerform()

              my.deck.subList(0, 12).showToMe("The top 12 cards of your deck.")
              def basics = my.deck.subList(0, 12).filterByType(BASIC)
              if (basics) {
                def maxSpace = Math.min(my.bench.freeBenchCount, basics.size())

                  def selected = basics.select(min:0, max:maxSpace, "Select as many Basic Pokémon you'd like to bench as possible.")

                selected.each {
                  benchPCS(it)
                  my.deck.remove(it)
                }
              }
              shuffleDeck()
            }
          }
        };
      case DEWPIDER_64:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G
          move "Ram", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Wave Splash", {
            text "40 damage."
            energyCost W, C, C
            onAttack {
              damage 40
            }
          }
        };
      case ARAQUANID_65:
        return evolution (this, from:"Dewpider", hp:HP100, type:W, retreatCost:2) {
          weakness G
          move "Headstrike", {
            text "40 damage."
            energyCost C, C
            onAttack {
              damage 40
            }
          }
          move "Liquidation", {
            text "80 damage. During your next turn, the Defending Pokémon takes 60 more damage from attacks (after applying Weakness and Resistance)."
            energyCost W, C, C
            onAttack {
              damage 80
              delayed {
                after APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == defending && it.dmg.value && it.notNoEffect) {
                      bc "Liquidation +60"
                      it.dmg += hp(60)
                    }
                  }
                }
                unregisterAfter 3
                after SWITCH,defending, {unregister()}
                after EVOLVE,defending, {unregister()}
              }
            }
          }
        };
      case PIKACHU_66:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Nuzzle", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              flip { apply PARALYZED}
            }
          }
          move "Volt Tackle", {
            text "70 damage. This Pokémon does 10 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 70
              damage 10, self
            }
          }
        };
      case RAICHU_67:
        return evolution (this, from:"Pikachu", hp:HP120, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          move "Nuzzle", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip { apply PARALYZED }
            }
          }
          move "Powerful Spark", {
            text "20x damage. This attack does 20 damage times the amount of [L] Energy attached to all of your Pokémon."
            energyCost L
            onAttack {
              my.all.each{ damage 20*it.cards.energyCount(L) }
            }
          }
        };
      case MAGNEMITE_68:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Mirror Shot", {
            text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack doesn't happen."
            energyCost L
            onAttack {
              damage 10
              sandAttack(thisMove)
            }
          }
        };
      case MAGNETON_69:
        return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          bwAbility "Call Signal", {
            text "Once during your turn (before your attack), you may search your deck for up to 3 Supporter cards, reveal them, and put them into your hand. Then, shuffle your deck. If you searched your deck in this way, this Pokémon is Knocked Out."
            actionA {
              checkLastTurn()
              assert deck
              powerUsed()
              deck.search(max: 3, cardTypeFilter(SUPPORTER)).moveTo(hand)
              shuffleDeck()
              new Knockout(self).run(bg)
            }
          }
          move "Magnetic Blast", {
            text "50 damage."
            energyCost L, L, C
            onAttack {
              damage 50
            }
          }
        };
      case JOLTEON_70:
        return evolution (this, from:"Eevee", hp:HP100, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          bwAbility "Speed Cheer", {
            text "The attacks of your Pokémon-GX in play that evolve from Eevee cost [C] less. You can't apply more than 1 Speed Cheer Ability at a time."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if(ef.attacker.owner == self.owner && ef.attacker.pokemonGX && ef.attacker.topPokemonCard.predecessor == "Eevee" && bg.currentTurn == self.owner && bg.em().retrieveObject("Speed_Cheer") != bg.turnCount) {
                  bg.em().storeObject("Speed_Cheer", bg.turnCount)
                  def copy = ef.move.shallowCopy()
                  if (copy.energyCost.contains(C)) {
                    copy.energyCost.remove(C)
                  }
                  attack (copy as Move)
                  prevent()
                }
              }
            }
          }
          move "Head Bolt", {
            text "70 damage."
            energyCost L, C
            onAttack {
              damage 70
            }
          }
        };
      case CHINCHOU_71:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Scout", {
            text "Your opponent reveals their hand."
            energyCost C
            onAttack {
              opp.hand.showToMe("Opponent's hand.")
            }
          }
          move "Razor Fin", {
            text "10 damage."
            energyCost L
            onAttack {
              damage 10
            }
          }
        };
      case LANTURN_72:
        return evolution (this, from:"Chinchou", hp:HP110, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          bwAbility "Blinking Lights", {
            text "As often as you like during your turn (before your attack), you may look at the top card of your opponent's deck."
            actionA {
              assert opp.deck : "Your opponent's deck is empty."
              opp.deck.subList(0, 1).showToMe("Top card of your opponent's deck.")
            }
          }
          move "Swirling Flow", {
            text "50 damage. You may have your opponent shuffle their deck."
            energyCost L, C
            onAttack {
              damage 50
              if (confirm("Force the opponent to shuffle their deck?")) {
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
        };
      case TOGEDEMARU_73:
        return basic (this, hp:HP080, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
            energyCost C
            callForFamily(basic: true, 2, delegate)
          }
          move "Random Spark", {
            text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L
            onAttack {
              damage 20, opp.all.select("Deal 20 damage to which Pokémon?")
            }
          }
        };
      case TOGEDEMARU_74:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Thunder Shock", {
            text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 30
              flip { apply PARALYZED}
            }
          }
        };
      case SOLGALEO_LUNALA_GX_75:
        return basic (this, hp:HP270, type:P, retreatCost:2) {
          weakness P
          move "Cosmic Burn", {
            text "230 damage. This Pokémon can't use Cosmic Burn during your next turn."
            energyCost P, P, P, C
            onAttack {
              damage 230
              cantUseAttack(thisMove, self)
            }
          }
          move "Light of the Protector GX", {
            text "200 damage. If you played Lillie's Full Force from your hand during this turn, prevent all effects of attacks, including damage, done to each of your Pokémon during your opponent's next turn. (You can’t use more than 1 GX attack in a game.)"
            energyCost P, P, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 200

              afterDamage {
                if (bg.em().retrieveObject("LILLIE_S_FULL_FORCE_TURN") == bg.turnCount) {
                  delayed {
                    before null, null, Source.ATTACK, {
                      def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
                      if (pcs && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && pcs.owner==self.owner) {
                        bc "$name prevents all effects of attacks."
                        prevent()
                      }
                    }
                    before APPLY_ATTACK_DAMAGES, {
                      bg.dm().each {
                        if (it.to.owner == self.owner && it.notNoEffect && bg.currentTurn==self.owner.opposite) {
                          it.dmg = hp(0)
                          bc "$name prevents all damage."
                        }
                      }
                    }
                    unregisterAfter 2
                  }
                }
              }
            }
          }
        };
      case KOFFING_76:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P
          bwAbility "Blow-Away Bomb", {
            text "Once during your turn, when you discard this Pokémon with the effect of Roxie, you may put 1 damage counter on each of your opponent's Pokémon. (Place damage counters after the effect of Roxie.)"
            // The implementation is in Roxie
          }
          move "Poison Gas", {
            text "10 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost P, C
            onAttack {
              damage 10
              apply POISONED
            }
          }
        };
      case WEEZING_77:
        return evolution (this, from:"Koffing", hp:HP100, type:P, retreatCost:2) {
          weakness P
          bwAbility "Blow-Away Bomb", {
            text "Once during your turn, when you discard this Pokémon with the effect of Roxie, you may put 1 damage counter on each of your opponent's Pokémon. (Place damage counters after the effect of Roxie.)"
            // The implementation is in Roxie
          }
          move "Balloon Burst", {
            text "90 damage. Discard this Pokémon and all cards attached to it."
            energyCost P, C
            onAttack {
              damage 90
              afterDamage{
                self.cards.discard()
                removePCS(self)
              }
            }
          }
        };
      case NATU_78:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Future Sight", {
            text "Look at the top 4 cards of either player's deck and put them back in any order."
            energyCost P
            rearrangeEitherPlayersDeck(delegate, 4)
          }
        };
      case XATU_79:
        return evolution (this, from:"Natu", hp:HP080, type:P, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Creepy Wind", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost P
            onAttack {
              apply CONFUSED
            }
          }
          move "Life Drain", {
            text "Flip a coin. If heads, put damage counters on your opponent's Active Pokémon until its remaining HP is 10."
            energyCost P, C
            onAttack {
              flip {
                directDamage opp.active.remainingHP.value - 10, opp.active
              }
            }
          }
        };
      case RALTS_80:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P
          move "Teleport", {
            text "Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C
            onAttack {
              switchYourActive()
            }
          }
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
        };
      case KIRLIA_81:
        return evolution (this, from:"Ralts", hp:HP080, type:P, retreatCost:1) {
          weakness P
          move "Hypnosis", {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Spiral Kick", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case GALLADE_82:
        return evolution (this, from:"Kirlia", hp:HP160, type:P, retreatCost:2) {
          weakness P
          bwAbility "Double Type", {
            text "As long as this Pokémon is in play, it is [P] and [F] type."
            getterA GET_POKEMON_TYPE, self, { h->
              h.object.add(F)
            }
          }
          move "Power Cyclone", {
            text "120 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 120
              afterDamage { moveEnergy(self, my.bench) }
            }
          }
        };
      case DUSKULL_83:
        return basic (this, hp:HP040, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          bwAbility "Spiritborne Evolution", {
            text "Once during your turn (before your attack), you may discard 3 cards from your hand. If you do, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            actionA {
              assert my.hand.size() >= 3 : "There are not enough cards in your hand to activate this ability."
              checkLastTurn()
              powerUsed()

              if (confirm("Discard 3 cards to evolve Duskull?")) {
                my.hand.select(count:3, "Discard 3 cards to evolve Duskull.").discard()

                deck.search ("Choose a card that evolves from ${self.name}.", {
                  it.cardTypes.is(EVOLUTION) && self.name==it.predecessor
                }).each {
                  evolve(self, it, OTHER)
                }
                shuffleDeck()
              }
            }
          }
          move "Ominous Eyes", {
            text "Put 2 damage counters on 1 of your opponent's Pokémon."
            energyCost P
            onAttack {
              directDamage 20, opp.all.select("Select a Pokémon to put 2 damage counters on.")
            }
          }
        };
      case DUSCLOPS_84:
        return evolution (this, from:"Duskull", hp:HP090, type:P, retreatCost:3) {
          weakness D
          resistance F, MINUS20
          move "Disable", {
            text "20 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost P
            onAttack {
              damage 20
              amnesia delegate
            }
          }
        };
      case DUSKNOIR_85:
        return evolution (this, from:"Dusclops", hp:HP160, type:P, retreatCost:3) {
          weakness D
          resistance F, MINUS20
          bwAbility "Grim Marking", {
            text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, put 4 damage counters on your opponent’s Pokémon in any way you like."
            delayedA {
              before (KNOCKOUT,self) {
                if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite ) {
                  bc "Grim Marking activates."
                  (1..4).each {
                    if (opp.all) directDamage(10, self.owner.opposite.pbg.all.select("Grim Marking: Choose an opponent's Pokémon to put a damage counter on.", self.owner))
                  }
                }
              }
            }
          }
          move "Psych Up", {
            text "60 damage. During your next turn, this Pokémon's Psych Up attack does 60 more damage (before applying Weakness and Resistance)."
            energyCost P
            onAttack {
              damage 60
              increasedBaseDamageNextTurn("Psych Up", hp(60))
            }
          }
        };
      case ROTOM_86:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Cycle Draw", {
            text "Discard a card from your hand. If you do, draw 2 cards."
            energyCost C
            attackRequirement {
              assert hand.size() : "Your hand is empty."
            }
            onAttack {
              hand.select("Discard a card to draw 2 cards.").discard()
              draw 2
            }
          }
          move "Energy Assist", {
            text "Attach 2 basic Energy cards from your discard pile to your Benched Pokémon in any way you like."
            energyCost P
            onAttack {
              if (my.bench) {
                attachEnergyFrom(basic:true, my.discard, my.bench.select())
                attachEnergyFrom(basic:true, my.discard, my.bench.select())
              }
            }
          }
        };
      case WOOBAT_87:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Nasal Suction", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              cantRetreat defending
            }
          }
          move "Air Cutter", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P
            onAttack {
              flip { damage 30 }
            }
          }
        };
      case SWOOBAT_88:
        return evolution (this, from:"Woobat", hp:HP090, type:P, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Supersonic", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
            }
          }
          move "Charming Stamp", {
            text "Your opponent chooses 1 of their own Pokémon. This attack does 90 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P
            onAttack {
              def list = LUtils.selectMultiPokemon(bg.oppClient(), opp.bench, "Opponent used Charming Stamp. Select a Pokémon to have 90 damage dealt to it.", 1)
              opp.bench.findAll { !list.contains(it) }.each {
                damage 90 it
              }
            }
          }
        };
      case GOLETT_89:
        return basic (this, hp:HP090, type:P, retreatCost:3) {
          weakness D
          resistance F, MINUS20
          move "Return", {
            text "10 damage. You may draw cards until you have 5 cards in your hand."
            energyCost P
            onAttack {
              damage 10

              if (confirm("Draw until you have 5 cards in your hand?")) {
                draw (5 - my.hand.size())
              }
            }
          }
        };
      case GOLURK_90:
        return evolution (this, from:"Golett", hp:HP140, type:P, retreatCost:4) {
          weakness D
          resistance F, MINUS20
          move "Rock Tumble", {
            text "40 damage. This attack's damage isn't affected by Resistance."
            energyCost P
            onAttack {
              dontApplyResistance()
              damage 40
            }
          }
          move "Fist of Antiquity", {
            text "160 damage. If you have any Supporter cards in your discard pile, this attack does nothing."
            energyCost C, C
            onAttack {
              if (my.discard.findAll(cardTypeFilter(SUPPORTER)).size() == 0) {
                damage 160
              }
            }
          }
        };
      case SKRELP_91:
        return basic (this, hp:HP060, type:P, retreatCost:2) {
          weakness P
          move "Poison Breath", {
            text "Your opponent’s Active Pokémon is now Poisoned."
            energyCost P
            onAttack {
              apply POISONED
            }
          }
        };
      case DRAGALGE_92:
        return evolution (this, from:"Skrelp", hp:HP120, type:P, retreatCost:1) {
          weakness P
          move "Poison Cultivation", {
            text "If your opponent's Active Pokémon is Poisoned, put 10 damage counters instead of 1 on that Pokémon between turns."
            energyCost P
            onAttack {
              if (defending.isSPC(POISONED)) extraPoison 9
            }
          }
          move "Sharp Fin", {
            text "40 damage."
            energyCost P
            onAttack {
              damage 40
            }
          }
        };
      case PHANTUMP_93:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Mumble", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Spooky Shot", {
            text "20 damage."
            energyCost P, C
            onAttack {
              damage 20
            }
          }
        };
      case TREVENANT_94:
        return evolution (this, from:"Phantump", hp:HP120, type:P, retreatCost:2) {
          weakness D
          resistance F, MINUS20
          move "Perplexing Forest", {
            text "20 damage. You may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C
            onAttack {
              damage 20
              if (confirm("Switch your opponent's Active Pokémon with 1 of their Benched Pokémon?"))
                whirlwind()
            }
          }
          move "Shadow Impact", {
            text "120 damage. Put 4 damage counters on 1 of your Pokémon."
            energyCost P, C, C
            onAttack {
              damage 120
              directDamage 40, my.all.select()
            }
          }
        };
      case ORICORIO_GX_95:
        return basic (this, hp:HP170, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          bwAbility "Dance of Tribute", {
            text "Once during your turn (before your attack), if any of your Pokémon were Knocked Out during your opponent's last turn, you may draw 3 cards. You can't use more than 1 Dance of Tribute Ability each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("Dance_of_Tribute") != bg.turnCount : "You can't use more than 1 Dance of Tribute Ability each turn."
              assert bg.em().retrieveObject("Dance_of_Tribute") == bg.turnCount-1 : "None of your Pokémon were Knocked Out during your opponent's last turn."
              powerUsed()
              bg.em().storeObject("Dance_of_Tribute", bg.turnCount)
              draw 3
            }
          }
          globalAbility {Card thisCard->
            delayed {
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                  bg.em().storeObject("Dance_of_Tribute", bg.turnCount)
                }
              }
            }
          }
          move "Razor Wing", {
            text "80 damage."
            energyCost P, C, C
            onAttack {
              damage 80
            }
          }
          move "Strafe GX", {
            text "100 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost P, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 100
              switchYourActive()
            }
          }
        };
      case MIMIKYU_96:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          move "Impersonation", {
            text "Discard a Supporter card from your hand. If you do, use the effect of that card as the effect of this attack."
            energyCost C
            attackRequirement {
              assert my.hand.hasType(SUPPORTER) : "No Supporter cards in your hand."
            }
            onAttack {
              delayed {
                def eff
                register {
                  eff = getter (GET_MAX_SUPPORTER_PER_TURN) {h->
                    h.object = h.object + 1
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
              if (my.hand.hasType(SUPPORTER)) {
                def card = my.hand.findAll(cardTypeFilter(SUPPORTER)).select("Select a Supporter to copy its effect as this attack.").first()
                bg.deterministicCurrentThreadPlayerType=self.owner
                bg.em().run(new PlayTrainer(card))
                bg.clearDeterministicCurrentThreadPlayerType()
              }
            }
          }
          move "Mischievous Hands", {
            text "Choose 2 of your opponent's Pokémon and put 2 damage counters on each of them."
            energyCost P
            onAttack {
              multiSelect(opp.all, 2).each {
                targeted(it) { directDamage 20, it }
              }
            }
          }
        };
      case MIMIKYU_97:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          bwAbility "Shadow Box", {
            text "Pokémon-GX that have any damage counters on them (both yours and your opponent's) have no Abilities."
            def effect1
            delayedA {
              after REMOVE_DAMAGE_COUNTER, {
                new CheckAbilities().run(bg)
              }
            }
            onActivate {
              effect1 = getter IS_ABILITY_BLOCKED, { Holder h ->
                if (h.effect.target.numberOfDamageCounters && h.effect.target.pokemonGX && h.effect.ability instanceof BwAbility) {
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
          move "Tail Trickery", {
            text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }
        };
      case DHELMISE_98:
        return basic (this, hp:HP130, type:P, retreatCost:3) {
          weakness D
          resistance F, MINUS20
          move "Seaweed Grab", {
            text "Put a Trainer card from your discard pile into your hand."
            energyCost C
            onAttack {
              my.discard.filterByType(TRAINER).select().moveTo(my.hand)
            }
          }
          move "Buster Swing", {
            text "100 damage. This attack's damage isn't affected by Resistance."
            energyCost P, P, C
            onAttack {
              dontApplyResistance()
              damage 100
            }
          }
        };
      case COSMOG_99:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P
          move "Ascension", {
            text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
            energyCost P
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Choose a card that evolves from $nam.", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
        };
      case COSMOG_100:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P
          bwAbility "Unaware", {
            text "Prevent all effects of your opponent's attacks, except damage, done to this Pokémon."
            delayedA {
              before null, null, ATTACK, {
                if (ef instanceof TargetedEffect && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && (ef as TargetedEffect).getResolvedTarget(bg, e) == self) {
                  bc "Unaware prevents all effects done to $self."
                  prevent()

                }
              }
            }
          }
          move "Surprise Attack", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip { damage 10 }
            }
          }
        };
      case COSMOEM_101:
        return evolution (this, from:"Cosmog", hp:HP090, type:P, retreatCost:3) {
          weakness P
          move "Stiffen", {
            text "During your opponent's next turn, this Pokémon takes 40 less damage from attacks (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              reduceDamageNextTurn(hp(40),thisMove)
            }
          }
        };
      case LUNALA_102:
        return evolution (this, from:"Cosmoem", hp:HP160, type:P, retreatCost:2) {
          weakness D
          resistance F, MINUS20
          bwAbility "Blessing of the Moone", {
            text "Once during your turn (before your attack), if you have Solgaleo in play, you may search your deck for up to 2 Energy cards and attach them to your Solgaleo or Lunala in any way you like. Then, shuffle your deck."
            actionA {
              checkLastTurn()
              assert my.deck
              assert my.all.find{it.name == 'Solgaleo'} : "You don't have Solgaleo in play."
              powerUsed()
              my.deck.search (max: 2, cardTypeFilter(BASIC_ENERGY)).each {
                def tar = my.all.findAll({ it.name == "Solgaleo" || it.name == "Lunala" })
                attachEnergy(tar.select("Attach this Energy to which Pokémon?"), it)
              }
              shuffleDeck()
            }
          }
          move "Lunar Blast", {
            text "130 damage."
            energyCost P, P, C
            onAttack {
              damage 130
            }
          }
        };
      case MARSHADOW_103:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness D
          resistance F, MINUS20
          move "Shadow Imitation", {
            text "Choose 1 of your opponent's Active Pokémon's non-GX attacks and use it as this attack."
            energyCost P, C, C
            attackRequirement {
              assert opp.active.topPokemonCard.moves.findAll { !it.name.contains("GX") } : "No moves to use."
            }
            onAttack {
              def list = defending.topPokemonCard.moves.findAll { !it.name.contains("GX") }
              if (list) {
                def selected = choose(list, "Choose an attack to use.")
                bc "$selected was chosen."
                def bef = blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                attack (selected as Move)
                bef.unregisterItself(bg().em())
              }
            }
          }
        };
      case BLACEPHALON_104:
        return basic (this, hp:HP110, type:P, retreatCost:2) {
          weakness D
          resistance F, MINUS20
          move "Fireworks Bomb", {
            text "Put 4 damage counters on your opponent's Pokémon in any way you like. If your opponent has exactly 3 Prize cards remaining, put 12 damage counters on them instead."
            energyCost P, C
            onAttack {
              def maxCountersToPlace = (opp.prizeCardSet.size() == 3) ? 12 : 4

              (1..maxCountersToPlace).each {
                directDamage 10, opp.all.select("Put 1 damage counter to which Pokémon? ($it/$maxCountersToPlace)")
              }
            }
          }
        };
      case ONIX_105:
        return basic (this, hp:HP110, type:F, retreatCost:4) {
          weakness G
          move "Dig Deep", {
            text "Put an Energy card from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.find(cardTypeFilter(ENERGY)) : "There are no Energies in your discard pile."
            }
            onAttack {
              my.discard.findAll(cardTypeFilter(ENERGY)).select().moveTo(my.hand)
            }
          }
          move "Tail Smash", {
            text "100 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C
            onAttack {
              flip { damage 100 }
            }
          }
        };
      case NOSEPASS_106:
        return basic (this, hp:HP080, type:F, retreatCost:3) {
          weakness G
          move "Draw Toward", {
            text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon."
            energyCost C, C
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw(opp.active, opp.bench.select())
            }
          }
          move "Zap Cannon", {
            text "50 damage. This Pokémon can't use Zap Cannon during your next turn."
            energyCost C, C, C
            onAttack {
              damage 50
              cantUseAttack(thisMove, self)
            }
          }
        };
      case TRAPINCH_107:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness G
          move "Nest Building", {
            text "Search your deck for a Stadium card, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty."
            }
            onAttack {
              my.deck.search(cardTypeFilter(STADIUM)).moveTo(hand)
              shuffleDeck()
            }
          }
          move "Sand Spray", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
        };
      case TRAPINCH_108:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness G
          move "Dig", {
            text "30 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost F, C
            onAttack {
              damage 30
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
        };
      case VIBRAVA_109:
        return evolution (this, from:"Trapinch", hp:HP080, type:F, retreatCost:1) {
          weakness G
          bwAbility "Obnoxious Whirring", {
            text "Whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to this Pokémon."
            delayedA {
              def power=false
              before PLAY_TRAINER, {
                if (ef.supporter && bg.currentTurn==self.owner.opposite) {
                  power=true
                }
              }
              after PLAY_TRAINER, {
                power=false
              }
              before null, null, Source.TRAINER_CARD, {
                def target=e.getTarget(bg)
                if (power && target && target.owner==self.owner){
                  bc "Obnoxious Whirring prevents effects from Supporter cards done to $self."
                  prevent()
                }
              }
            }
          }
          move "Flap", {
            text "40 damage."
            energyCost F, C
            onAttack {
              damage 40
            }
          }
        };
      case FLYGON_GX_110:
        return evolution (this, from:"Vibrava", hp:HP240, type:F, retreatCost:2) {
          weakness G
          bwAbility "Dusty Defense", {
            text "As long as this Pokémon is your Active Pokémon, all of your Pokémon take 30 less damage from your opponent’s attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(self.active && it.to.owner==self.owner && it.from.owner!=it.to.owner && ef.attacker.owner!=self.owner && it.notNoEffect && it.notZero) {
                    bc "Dusty Defense -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Desert Hurricane", {
            text "120+ damage. If there is any Stadium card in play, this attack does 120 more damage. Then, discard that Stadium card."
            energyCost F, F, F
            onAttack {
              damage 120
              if (bg.stadiumInfoStruct) {
                damage 120
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
          move "Sonic Edge GX", {
            text "220 damage. This attack’s damage isn’t affected by any effects on your opponent’s Active Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost F, F, F
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              shredDamage 220
            }
          }
        };
      case ANORITH_111:
        return evolution (this, from:"Unidentified Fossil", hp:HP090, type:F, retreatCost:1) {
          weakness G
          move "Bug Bite", {
            text "40 damage."
            energyCost C, C
            onAttack {
              damage 40
            }
          }
          move "Claw Slash", {
            text "80 damage."
            energyCost F, C, C
            onAttack {
              damage 80
            }
          }
        };
      case ARMALDO_112:
        return evolution (this, from:"Anorith", hp:HP150, type:F, retreatCost:2) {
          weakness G
          move "Ancient Blast", {
            text "20+ damage. This attack does 50 more damage for each Unidentified Fossil card in your discard pile."
            energyCost C, C
            onAttack {
              damage 20
              damage 50*my.discard.findAll({it.name == "Unidentified Fossil"}).size()
            }
          }
          move "Mach Claw", {
            text "100 damage. This attack's damage isn't affected by Resistance."
            energyCost F, C, C
            onAttack {
              dontApplyResistance()
              damage 100
            }
          }
        };
      case GROUDON_113:
        return basic (this, hp:HP130, type:F, retreatCost:3) {
          weakness G
          move "Drought", {
            text "Attach up to 2 [F] Energy cards from your hand to 1 of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.hand.filterByEnergyType(F)
            }
            onAttack {
              attachEnergyFrom(max:2, type:F, my.hand, my.all)
            }
          }
          move "Trembling Ground", {
            text "130 damage. This Pokémon can’t use Trembling Ground during your next turn."
            energyCost F, F, C
            onAttack {
              damage 130
              cantUseAttack(thisMove, self)
            }
          }
        };
      case DRILBUR_114:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness G
          move "Rototiller", {
            text "Shuffle a card from your discard pile into your deck."
            energyCost C
            attackRequirement {
              assert my.discard : "Your discard pile is empty."
            }
            onAttack {
              my.discard.select("Select a card to shuffle into your deck.").moveTo(my.deck)
            }
          }
          move "Mud-Slap", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
        };
      case EXCADRILL_115:
        return evolution (this, from:"Drilbur", hp:HP140, type:F, retreatCost:4) {
          weakness G
          move "Eleventh Hour Tackle", {
            text "30+ damage. If there are 3 or fewer cards in your deck, this attack does 150 more damage."
            energyCost F
            onAttack {
              damage 30
              if (my.deck.size() < 4) damage 150
            }
          }
          move "Drill Bazooka", {
            text "120 damage. Discard the top 4 cards of your deck."
            energyCost F
            onAttack {
              damage 120
              my.deck.subList(0, 4).discard()
            }
          }
        };
      case PALPITOAD_116:
        return evolution (this, from:"Tympole", hp:HP090, type:F, retreatCost:2) {
          weakness G
          move "Mini Earthquake", {
            text "60 damage. This attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            onAttack {
              damage 60
              if (my.bench) {
                my.bench.each {
                  damage 10, it
                }
              }
            }
          }
        };
      case SEISMITOAD_117:
        return evolution (this, from:"Palpitoad", hp:HP160, type:F, retreatCost:3) {
          weakness G
          bwAbility "Bulldoze", {
            text "Once during your turn (before your attack), you may search your deck for a card, shuffle your deck, then put that card on top of it."
            actionA {
              checkLastTurn()
              assert my.deck
              powerUsed()
              def tar = my.deck.select(min: 0, max: 1, "Choose 1 card to put on top of your deck.").first()
              my.deck.remove(tar)
              my.deck.add(0, tar)
            }
          }
          move "Tremulous Fist", {
            text "80+ damage. This attack does 30 more damage for each of your Benched Pokémon that has any damage counters on it."
            energyCost F, C, C, C
            onAttack {
              def count = my.bench.findAll{ it.numberOfDamageCounters }.size()
              damage 80 + 30*count
            }
          }
        };
      case THROH_118:
        return basic (this, hp:HP120, type:F, retreatCost:2) {
          weakness P
          move "Reverse Shoulder Throw", {
            text "30+ damage. If your Benched Pokémon have any damage counters on them, this attack does 90 more damage."
            energyCost F, C
            onAttack {
              damage 30
              if (my.bench.findAll{ it.numberOfDamageCounters }) {
                damage 90
              }
            }
          }
        };
      case PANCHAM_119:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness P
          move "Punch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
        };
      case PANGORO_120:
        return evolution (this, from:"Pancham", hp:HP130, type:F, retreatCost:2) {
          weakness P
          move "Light Punch", {
            text "40 damage."
            energyCost C
            onAttack {
              damage 40
            }
          }
          move "Magnum Punch", {
            text "90 damage."
            energyCost C, C, C
            onAttack {
              damage 90
            }
          }
        };
      case CRABRAWLER_121:
        return basic (this, hp:HP080, type:F, retreatCost:2) {
          weakness P
          move "Jab", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Confront", {
            text "30 damage."
            energyCost F, C
            onAttack {
              damage 30
            }
          }
        };
      case CRABOMINABLE_122:
        return evolution (this, from:"Crabrawler", hp:HP140, type:F, retreatCost:4) {
          weakness P
          bwAbility "Solid Shell", {
            text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to.owner == self.owner && it.dmg.value && it.notNoEffect) {
                    bc "Solid Shell -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Freezing Punch", {
            text "80+ damage. If this Pokémon has any [W] Energy attached to it, this attack does 80 more damage."
            energyCost F, F, C
            onAttack {
              damage 80
              if (self.cards.energyCount(W)) damage 80
            }
          }
        };
      case ROCKRUFF_123:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness G
          move "Roar", {
            text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C
            attackRequirement{
              assert opp.bench : "Your opponent has no Benched Pokémon."
            }
            onAttack{
              whirlwind()
            }
          }
          move "Rock Throw", {
            text "40 damage."
            energyCost F, C, C
            onAttack {
              damage 40
            }
          }
        };
      case LYCANROC_124:
        return evolution (this, from:"Rockruff", hp:HP120, type:F, retreatCost:2) {
          weakness G
          bwAbility "Boiling Blood", {
            text "If your opponent has any Pokémon-GX or Pokémon-EX in play, this Pokémon's attacks cost [C][C][C] less."
            getterA (GET_MOVE_LIST, BEFORE_LAST, self) { h->
              if (self.owner.opposite.pbg.all.find { it.pokemonEX || it.pokemonGX }) {
                if (h.effect.target.owner) {
                  def list=[]
                  for (move in h.object) {
                    def copy=move.shallowCopy()
                    copy.energyCost.remove(C)
                    copy.energyCost.remove(C)
                    copy.energyCost.remove(C)
                    list.add(copy)
                  }
                  h.object=list
                }
              }
            }
          }
          move "Voltage Claw", {
            text "60+ damage. If your opponent’s Active Pokémon has any Special Energy attached to it, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 60
              if (defending.cards.filterByType(SPECIAL_ENERGY)) damage 70
            }
          }
        };
      case PASSIMIAN_125:
        return basic (this, hp:HP110, type:F, retreatCost:1) {
          weakness P
          move "Spike Draw", {
            text "20 damage. Draw 2 cards."
            energyCost F
            onAttack {
              damage 20
              draw 2
            }
          }
          move "Seismic Toss", {
            text "70 damage."
            energyCost F, C, C
            onAttack {
              damage 70
            }
          }
        };
      case SANDYGAST_126:
        return basic (this, hp:HP080, type:F, retreatCost:2) {
          weakness G
          move "Astonish", {
            text "10 damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost F
            onAttack {
              damage 10
              astonish()
            }
          }
          move "Hook", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case PALOSSAND_127:
        return evolution (this, from:"Sandygast", hp:HP140, type:F, retreatCost:4) {
          weakness G
          move "Guard Press", {
            text "80 damage. During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
            energyCost C, C, C
            onAttack {
              damage 80
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Earthquake", {
            text "150 damage. This attack does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C, C
            onAttack {
              damage 150
              my.bench.each { damage 20, it }
            }
          }
        };
      case ALOLAN_MEOWTH_128:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Swagger", {
            text "Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
            energyCost D
            onAttack {
              flip { discardDefendingEnergy() }
            }
          }
          move "Hook", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case ALOLAN_PERSIAN_GX_129:
        return evolution (this, from:"Alolan Meowth", hp:HP200, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          bwAbility "Smug Face", {
            text "Prevent all effects of attacks, including damage, done to this Pokémon by your opponent's TAG TEAM Pokémon and Ultra Beasts, and by your opponent's Pokémon that have any Special Energy attached to them."
            delayedA {
              before null, self, Source.ATTACK, {
                def oppActive = self.owner.opposite.pbg.active
                if ((oppActive.topPokemonCard.cardTypes.isIn(TAG_TEAM, ULTRA_BEAST) || oppActive.cards.hasType(SPECIAL_ENERGY)) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                  bc "Smug Face prevents effects to $self."
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  def valid = it.from.topPokemonCard.cardTypes.is(TAG_TEAM) || it.from.topPokemonCard.cardTypes.is(ULTRA_BEAST) || it.from.cards.hasType(SPECIAL_ENERGY)
                  if (it.to == self && it.dmg.value && it.notNoEffect && it.from.owner != self.owner && valid) {
                    it.dmg = hp(0)
                    bc "Smug Face prevents damage dealt to $self."
                  }
                }
              }
            }
          }
          move "Claw Slash", {
            text "120 damage."
            energyCost D, C, C
            onAttack {
              damage 120
            }
          }
          move "Stalking Claws GX", {
            text "This attack does 120 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness, Resistance, or any other effects on that Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost D, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              swiftDamage(120, opp.all.select())
            }
          }
        };
      case ALOLAN_GRIMER_130:
        return basic (this, hp:HP080, type:D, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          move "Melt", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Nasty Goo", {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost D, C
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }
        };
      case ALOLAN_MUK_131:
        return evolution (this, from:"Alolan Grimer", hp:HP140, type:D, retreatCost:4) {
          weakness F
          resistance P, MINUS20
          move "Panic Poison", {
            text "20 damage. Your opponent's Active Pokémon is now Burned, Confused, and Poisoned."
            energyCost D, C
            onAttack {
              damage 20
              apply BURNED
              apply CONFUSED
              apply POISONED
            }
          }
          move "Sludge Bomb", {
            text "110 damage."
            energyCost D, D, C
            onAttack {
              damage 110
            }
          }
        };
      case CARVANHA_132:
        return basic (this, hp:HP050, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Agility", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost D
            onAttack {
              damage 10
              flip { preventAllEffectsNextTurn() }
            }
          }
        };
      case ABSOL_133:
        return basic (this, hp:HP100, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Ominous News", {
            text "Discard a Special Energy from 1 of your opponent's Pokémon."
            energyCost C
            onAttack {
              def targets = opp.all.findAll ({ it.cards.filterByType(SPECIAL_ENERGY) })
              if (targets) {
                def selectedPokemon = targets.select("Choose a Pokémon to discard a Special Energy from.")
                def selectedEnergy = selectedPokemon.cards.filterByType(SPECIAL_ENERGY).select("Choose a Special Energy to discard.")
                selectedEnergy.discard()
              }
            }
          }
          move "Dirty Throw", {
            text "70 damage. Discard a card from your hand. If you can't discard a card, this attack does nothing."
            energyCost D, C
            attackRequirement {
              assert my.hand.size() : "Your hand is empty."
            }
            onAttack {
              damage 70
              hand.select("Discard a card from your hand.").discard()
            }
          }
        };
      case PAWNIARD_134:
        return basic (this, hp:HP060, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Bag Slash", {
            text "Your opponent reveals their hand. Discard an Item card you find there."
            energyCost C
            onAttack {
              opp.hand.showToMe("Opponent's hand.")
              if(opp.hand.filterByType(ITEM)){
                opp.hand.filterByType(ITEM).select("Select an Item to discard.").discard()
              }
            }
          }
          move "Sting", {
            text "20 damage."
            energyCost D, C
            onAttack {
              damage 20
            }
          }
        };
      case BISHARP_135:
        return evolution (this, from:"Pawniard", hp:HP120, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Corner", {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Slashing Strike", {
            text "80 damage. This Pokémon can't use Slashing Strike during your next turn."
            energyCost D, C
            onAttack {
              damage 80
              cantUseAttack(thisMove, self)
            }
          }
        };
      case GUZZLORD_136:
        return basic (this, hp:HP150, type:D, retreatCost:4) {
          weakness F
          resistance P, MINUS20
          move "Mountain Munch", {
            text "Discard the top card of your opponent's deck."
            energyCost D
            onAttack {
              opp.deck.subList(0, 1).discard()
            }
          }
          move "Red Banquet", {
            text "120 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, take 1 more Prize card."
            energyCost D, D, C, C
            onAttack {
              damage 120
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs, {
                  bg.em().run(new TakePrize(self.owner, pcs))
                }
                unregisterAfter 1
              }
            }
          }
        };
      case ALOLAN_SANDSHREW_137:
        return basic (this, hp:HP060, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Run Around", {
            text "Switch this Pokémon with 1 of your Benched Pokémon."
            onAttack {
              switchYourActive()
            }
          }
          move "Metal Claw", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case ALOLAN_SANDSLASH_138:
        return evolution (this, from:"Alolan Sandshrew", hp:HP120, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Curve Strike", {
            text "30 damage. Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
            onAttack {
              damage 30
              flip { preventAllDamageNextTurn() }
            }
          }
          move "Reinforced Needle", {
            text "60+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 60 more damage."
            energyCost M, C, C
            onAttack {
              damage 60
              if (self.cards.filterByType(POKEMON_TOOL)) damage 60
            }
          }
        };
      case STEELIX_139:
        return evolution (this, from:"Onix", hp:HP170, type:M, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          move "Thumping Fall", {
            text "50x damage. Discard any number of Pokémon with a Retreat Cost of exactly 4 from your hand. This attack does 50 damage for each card you discarded in this way."
            energyCost C, C
            attackRequirement{
              assert my.hand.findAll(cardTypeFilter(POKEMON)).findAll({ it.retreatCost == 4 }) : "You have no Pokémon with Retreat Cost of 4 in your hand."
            }
            onAttack {
              def heavyPokemon = my.hand.findAll(cardTypeFilter(POKEMON)).findAll({ it.retreatCost == 4 })
              def selected = heavyPokemon.select(max: heavyPokemon.size(), "Discard any number of Pokémon with a Retreat Cost of 4 to deal 50 damage each.")

              damage 50*selected.size()
              selected.discard()
            }
          }
          move "Iron Tail", {
            text "100x damage. Flip a coin until you get tails. This attack does 100 damage for each heads."
            energyCost M, C, C, C
            onAttack {
              flipUntilTails { damage 100 }
            }
          }
        };
      case MAWILE_140:
        return basic (this, hp:HP070, type:M, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Dual Calling", {
            text "Search your deck for up to 2 TAG TEAM cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            onAttack {
              my.deck.search(max:2, "Search your deck for up to 2 Tag Team cards.", cardTypeFilter(TAG_TEAM)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Dark Clamp", {
            text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              damage 20
              cantRetreat defending
            }
          }
        };
      case PROBOPASS_141:
        return evolution (this, from:"Nosepass", hp:HP130, type:M, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Hard Press", {
            text "60 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C, C, C
            onAttack {
              damage 60
              flip { apply PARALYZED }
            }
          }
          move "Triple Nose", {
            text "80+ damage. Flip 3 coins. This attack does 40 more damage for each heads."
            energyCost M, C, C, C
            onAttack {
              damage 80
              flip 3, { damage 40 }
            }
          }
        };
      case SOLGALEO_142:
        return evolution (this, from:"Cosmoem", hp:HP170, type:M, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          bwAbility "Armor of the Sunne", {
            text "If you have Lunala in play, your Solgaleo and Lunala take 50 less damage from your opponent's attacks (after applying Weakness and Resistance). You can't apply more than 1 Armor of the Sunne Ability at a time."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.owner.pbg.all.find({ it.name == "Lunala" }) && it.from.owner != self.owner && it.to.owner == self.owner && it.dmg.value && it.notNoEffect && (it.to.name == "Solgaleo" || it.to.name == "Lunala") && bg.em().retrieveObject("Armor of the Sunne") != bg.turnCount) {
                    bc "Armor of the Sunne -50"
                    it.dmg -= hp(50)
                    bg.em().storeObject("Armor of the Sunne", bg.turnCount)
                  }
                }
              }
            }
          }
          move "Sol Fangs", {
            text "180 damage. Discard 2 Energy from this Pokémon."
            energyCost M, M, C, C
            onAttack {
              damage 180
              discardSelfEnergy(C, C)
            }
          }
        };
      case TOGEPI_CLEFFA_IGGLYBUFF_GX_143:
        return basic (this, hp:HP240, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Rolling Panic", {
            text "120+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
            energyCost Y, Y, C
            onAttack {
              damage 120
              flipUntilTails { damage 30 }
            }
          }
          move "Supreme Puff GX", {
            text "Take another turn after this one. (Skip the between-turns step.) If this Pokémon has at least 14 extra [Y] Energy attached to it (in addition to this attack’s cost), your opponent shuffles all of their Benched Pokémon and all cards attached to them into their deck. (You can’t use more than 1 GX attack in a game.)"
            energyCost Y, Y
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()

              if (self.cards.energySufficient(thisMove.energyCost + [Y,Y,Y,Y,Y , Y,Y,Y,Y,Y , Y,Y,Y,Y])) {
                opp.bench.each {
                  it.cards.moveTo(opp.deck)
                  removePCS(it)
                }
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }

              afterDamage {
                delayed (priority: BEFORE_LAST) {
                  before BETWEEN_TURNS, {
                    prevent()
                    bg.turnCount += 1
                    draw 1
                    bc "Supreme Puff GX started a new turn!"
                    unregister()
                  }
                }
              }
            }
          }
        };
      case CLEFAIRY_144:
        return basic (this, hp:HP050, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Doll Swap", {
            text "60 damage. Put this Pokémon and all cards attached to it into your hand. If you do, you may play Lillie's Poké Doll from your hand as your new Active Pokémon."
            energyCost C, C, C
            onAttack {
              damage 60
              afterDamage {
                def doll = my.hand.find{it.name=="Lillie's Poké Doll"}
                if(doll && confirm("Play Lillie's Poké Doll from your hand as your new Active Pokémon?")) {
                  def eff = getter (GET_BENCH_SIZE, BEFORE_LAST) { h->
                    h.object += 1
                  }
                  self.owner.pbg.triggerBenchSizeCheck()

                  def tmp = self.owner.pbg.all.findAll{it.name=="Lillie's Poké Doll"}
                  bg.em().run(new PlayCard(doll))
                  def pcs = self.owner.pbg.all.find{it.name=="Lillie's Poké Doll" && !tmp.contains(it)}
                  sw(self, pcs)
                  eff.unregister()
                  self.owner.pbg.triggerBenchSizeCheck()
                }
                self.cards.moveTo(hand)
                removePCS(self)
              }
            }
          }
        };
      case ALOLAN_NINETALES_145:
        return evolution (this, from:"Alolan Vulpix", hp:HP110, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Rubbish Blizzard", {
            text "10x damage. This attack does 10 damage for each Pokémon Tool card in your discard pile."
            onAttack {
              damage 10*my.discard.filterByType(POKEMON_TOOL).size()
            }
          }
        };
      case AZURILL_146:
        return basic (this, hp:HP060, type:Y, retreatCost:0) {
          bwAbility "Growing Up", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, attach a basic Energy card from your discard pile to your Active Pokémon. If you use this Ability, your turn ends."
            actionA{
              checkLastTurn()
              assert my.discard.filterByType(BASIC_ENERGY) : "There are no basic Energy cards in your discard pile."
              powerUsed()

              flip {
                attachEnergyFrom(basic:true, my.discard, my.active)
              }
              bg.gm().betweenTurns()
            }
          }
        };
      case COTTONEE_147:
        return basic (this, hp:HP040, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Lost March", {
            text "20x damage. This attack does 20 damage for each of your Pokémon, except {*} (Prism Star) Pokémon, in the Lost Zone."
            energyCost C, C
            onAttack {
              damage 20*my.lostZone.findAll{ it.cardTypes.is(POKEMON) && !it.cardTypes.is(PRISM_STAR) }.size()
            }
          }
        };
      case WHIMSICOTT_148:
        return evolution (this, from:"Cottonee", hp:HP070, type:Y, retreatCost:0) {
          weakness M
          resistance D, MINUS20
          move "Sneaky Pocket", {
            text "Put a card from your hand in the Lost Zone. If you do, draw 3 cards."
            energyCost Y
            attackRequirement {
              assert my.hand : "Your hand is empty."
            }
            onAttack {
              def card = my.hand.select("Choose a card to send to the Lost Zone to draw 3 cards.")

              if (card) {
                card.moveTo(my.lostZone)
                draw 3
              }
            }
          }
          move "Lost March", {
            text "20x damage. This attack does 20 damage for each of your Pokémon, except {*} (Prism Star) Pokémon, in the Lost Zone."
            energyCost C, C
            onAttack {
              damage 20*my.lostZone.findAll{ it.cardTypes.is(POKEMON) && !it.cardTypes.is(PRISM_STAR) }.size()
            }
          }
        };
      case FLABEBE_149:
        return basic (this, hp:HP030, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Floral Invitation", {
            text "Search your deck for up to 2 [Y] Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty."
            }
            onAttack {
              deck.search(max: 2, pokemonTypeFilter(Y)).moveTo(hand)
              shuffleDeck()
            }
          }
        };
      case FLABEBE_150:
        return basic (this, hp:HP040, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Petal Blizzard", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost Y
            onAttack {
              opp.all.each { damage 10, it }
            }
          }
        };
      case FLOETTE_151:
        return evolution (this, from:"Flabébé", hp:HP070, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          bwAbility "Flower Picking", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            onActivate {r->
              if (r == PLAY_FROM_HAND && my.deck && confirm("Use Flower Picking?")) {
                powerUsed()
                opp.hand.select(hidden: true, count:1).moveTo(hidden: false, opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
          move "Magical Shot", {
            text "30 damage."
            energyCost Y, C
            onAttack {
              damage 30
            }
          }
        };
      case FLORGES_152:
        return evolution (this, from:"Floette", hp:HP130, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          bwAbility "Flower Picking", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may choose 2 random cards from your opponent's hand. Your opponent reveals those cards and shuffles them into their deck."
            onActivate { r->
              if (r == PLAY_FROM_HAND && my.deck && confirm("Use Flower Picking?")) {
                powerUsed()
                opp.hand.select(hidden: true, count:2).moveTo(hidden: false, opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
          move "Petal Dance", {
            text "60x damage. Flip 3 coins. This attack does 60 damage for each heads. This Pokémon is now Confused."
            energyCost Y, C
            onAttack {
              flip 3, { damage 60 }
              apply CONFUSED, self
            }
          }
        };
      case SWIRLIX_153:
        return basic (this, hp:HP060, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Cotton Guard", {
            text "10 damage. During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
            energyCost Y
            onAttack {
              damage 10
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }
        };
      case SLURPUFF_154:
        return evolution (this, from:"Swirlix", hp:HP110, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Olfactory Enchantment", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost Y
            onAttack {
              apply CONFUSED
            }
          }
          move "Sweet Panic", {
            text "110 damage. If your opponent's Active Pokémon isn't Confused, this attack does nothing."
            energyCost Y
            onAttack {
              if (defending.isSPC(CONFUSED)) {
                damage 110
              } else {
                bc "Sweet Panic has no effect."
              }
            }
          }
        };
      case SYLVEON_155:
        return evolution (this, from:"Eevee", hp:HP110, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Moonblast", {
            text "30 damage. During your opponent's next turn, the Defending Pokémon’s attacks do 30 less damage (before applying Weakness and Resistance)."
            energyCost Y
            onAttack {
              damage 30
              reduceDamageFromDefendingNextTurn(hp(30), thisMove, defending)
            }
          }
          move "Beloved Pulse", {
            text "80+ damage. If you played a TAG TEAM Supporter card from your hand during this turn, this attack does 80 more damage."
            energyCost Y, C, C
            onAttack {
              damage 80
              // TODO: edit it to include only tag team supporters
              if(bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) damage 80
            }
          }
        };
      case ARCEUS_DIALGA_PALKIA_GX_156:
        return basic (this, hp:HP280, type:N, retreatCost:3) {
          weakness Y
          move "Ultimate Ray", {
            text "150 damage. Search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost M, W, C
            onAttack {
              damage 150
              if (my.deck) {
                my.deck.search (max: 3, cardTypeFilter(BASIC_ENERGY)).each {
                  attachEnergy(my.all.select("Attach $it to?"), it)
                }
                shuffleDeck()
              }
            }
          }
          move "Altered Creation GX", {
            text "For the rest of this game, your Pokémon’s attacks do 30 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance). If this Pokémon has at least 1 extra [W] Energy attached to it (in addition to this attack's cost), when your opponent’s Active Pokémon is Knocked Out by damage from those attacks, take 1 more Prize card. (You can't use more than 1 GX attack in a game.)"
            energyCost M
            attackRequirement {
              gxCheck()
            }
            def eff2
            onAttack {
              gxPerform()

              afterDamage {
                delayed { // a permanent delayed effect
                  after PROCESS_ATTACK_EFFECTS, {
                    bg.dm().each {
                      if (it.from.owner == self.owner && it.dmg.value && it.to.active && it.to.owner != self.owner) {
                        bc "Altered Creation GX +30"
                        it.dmg += hp(30)
                      }
                    }
                  }
                }
              }

              if (self.cards.energySufficient( thisMove.energyCost + W )) {
                bc "For the rest of the game, this player gets 1 additional prize when their opponent's Active gets Knocked Out from damage."
                delayed {
                  def pt = self.owner
                  def flag = false
                  before KNOCKOUT, {
                    def pcs = ef.pokemonToBeKnockedOut
                    flag = pcs.owner != pt && ef.byDamageFromAttack && pcs.active
                  }
                  after KNOCKOUT, {
                    if(flag) {
                      flag = false
                      bc "Altered Creation GX gives the player an additional prize."
                      bg.em().run(new TakePrize(pt, ef.pokemonToBeKnockedOut))
                    }
                  }
                }
              }
            }
          }
        };
      case RESHIRAM_ZEKROM_GX_157:
        return basic (this, hp:HP270, type:N, retreatCost:3) {
          weakness Y
          move "Fabled Flarebolts", {
            text "90x damage. Discard up to 3 in any combination of basic [R] and basic [L] Energy cards from your Benched Pokémon. This attack does 90 damage for each card you discarded in this way."
            energyCost R, L
            onAttack {
              def count = 0
              while (count < 3) {
                def tar = my.bench.findAll {
                  it.cards.filterByType(BASIC_ENERGY).filterByEnergyType(R).notEmpty() ||
                    it.cards.filterByType(BASIC_ENERGY).filterByEnergyType(L).notEmpty()
                }
                if (!tar) break
                def pcs = tar.select("Select a Pokémon that has a basic [R] or [L] Energy to discard. Cancel to stop.", false)
                if (!pcs) break
                pcs.cards.filterByType(BASIC_ENERGY).findAll {
                  it.asEnergyCard().containsTypePlain(R) ||
                    it.asEnergyCard().containsTypePlain(L)
                }.select("Select which basic [R] or [L] to discard?").discard()
                count++
              }
              damage 90*count
            }
          }
          move "Cross Break GX", {
            text "This attack does 170 damage to 1 of your opponent's Benched Pokémon. If you played N's Resolve from your hand during this turn, this attack also does 170 damage to 1 of your opponent's other Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can’t use more than 1 GX attack in a game.)"
            energyCost R, R, L, L
            attackRequirement {
              gxCheck()
              assert opp.bench : "Opponent does not have any Benched Pokémon."
            }
            onAttack {
              gxPerform()
              if (bg.em().retrieveObject("N_S_RESOLVE_TURN") == bg.turnCount) {
                multiDamage(opp.bench, 2, 170)
              } else {
                damage 170, opp.bench.select()
              }
            }
          }
        };
      case NAGANADEL_GUZZLORD_GX_158:
        return basic (this, hp:HP280, type:N, retreatCost:3) {
          weakness Y
          bwAbility "Violent Appetite", {
            text "Once during your turn (before your attack), you may discard a Pokémon from your hand. If you do, heal 60 damage from this Pokémon."
            actionA {
              checkLastTurn()
              assert my.hand.findAll(cardTypeFilter(POKEMON)) : "There are no Pokémon in your hand."
              assert self.numberOfDamageCounters : "$self has no damage counters."
              powerUsed()
              my.hand.findAll(cardTypeFilter(POKEMON)).select("Discard a Pokémon to heal 60.").discard()
              heal(60, self)
            }
          }
          move "Jet Pierce", {
            text "180 damage."
            energyCost D, P, C
            onAttack {
              damage 180
            }
          }
          move "Chaotic Order GX", {
            text "Turn all of your Prize cards face up. (Those Prize cards remain face up for the rest of the game.) If this Pokémon has at least 1 extra [P] Energy and 1 extra [D] Energy attached to it (in addition to this attack’s cost), take 2 Prize cards. (You can’t use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              my.prizeCardSet.allVisible = true
              bc "Chaotic Order GX revealed their owner's prize cards."

              if (self.cards.energySufficient(thisMove.energyCost + P + D )) {
                bg.em().run(new TakePrize(self.owner,self))
                bg.em().run(new TakePrize(self.owner,self))
              }
            }
          }
        };
      case DRAMPA_159:
        return basic (this, hp:HP120, type:N, retreatCost:1) {
          weakness Y
          move "Dragon Claw", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Dragon Arcana", {
            text "70+ damage. If this Pokémon has 2 or more different types of basic Energy attached to it, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 70
              int differentTypes = 0
              for (Type t1:Type.values()) {
                if (self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                  differentTypes++
              }
              if (differentTypes >= 2) {
                damage 70
              }
            }
          }
        };
      case JANGMO_O_160:
        return basic (this, hp:HP060, type:N, retreatCost:1) {
          weakness Y
          move "Raging Claws", {
            text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost F, L
            onAttack {
              damage 20+10*self.numberOfDamageCounters
            }
          }
        };
      case JANGMO_O_161:
        return basic (this, hp:HP070, type:N, retreatCost:2) {
          weakness Y
          move "Gnaw", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
          move "Dragon Headbutt", {
            text "50 damage."
            energyCost F, L, C
            onAttack {
              damage 50
            }
          }
        };
      case HAKAMO_O_162:
        return evolution (this, from:"Jangmo-o", hp:HP080, type:N, retreatCost:2) {
          weakness Y
          bwAbility "Fighter’s Roar", {
            text "If your opponent’s Active Pokémon is a Pokémon-GX or Pokémon-EX, this Pokémon can evolve during the turn you play it."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (self.owner.opposite.pbg.active.pokemonGX || self.owner.opposite.pbg.active.pokemonEX) {
                  prevent()
                }
              }
            }
          }
          move "Dragonslice", {
            text "30 damage."
            energyCost F, L
            onAttack {
              damage 30
            }
          }
        };
      case KOMMO_O_163:
        return evolution (this, from:"Hakamo-o", hp:HP160, type:N, retreatCost:2) {
          weakness Y
          move "Shout of Power", {
            text "60 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
            energyCost F
            onAttack {
              damage 60
              if (my.discard.filterByType(BASIC_ENERGY)) {
                attachEnergyFrom(basic:true, my.discard, my.bench)
              }
            }
          }
          move "Scaly Uppercut", {
            text "90+ damage. You may discard a Pokémon Tool card from this Pokémon. If you do, this attack does 90 more damage."
            energyCost F, L
            onAttack {
              damage 90
              if (self.cards.filterByType(POKEMON_TOOL) && confirm("Discard a Pokémon Tool card from this Pokemon to do 90 more damage?")) {
                self.cards.filterByType(POKEMON_TOOL).select().discard()
                damage 90
              }
            }
          }
        };
      case ULTRA_NECROZMA_164:
        return basic (this, hp:HP110, type:N, retreatCost:2) {
          weakness Y
          bwAbility "Ultra Burst", {
            text "This Pokémon can't attack unless your opponent has 2 or fewer Prize cards remaining."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if (self.active && bg.currentTurn == self.owner && self.owner.opposite.pbg.prizeCardSet.size() > 2) {
                  wcu "Ultra Burst prevents Ultra Necrozma from attacking."
                  prevent()
                }
              }
            }
          }
          move "Luster of Downfall", {
            text "170 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost M, P
            onAttack {
              damage 170
              discardDefendingEnergy()
            }
          }
        };
      case MEGA_LOPUNNY_JIGGLYPUFF_GX_165:
        return basic (this, hp:HP240, type:C, retreatCost:1) {
          weakness F
          move "Jumping Balloon", {
            text "60+ damage. This attack does 60 more damage for each of your opponent's Pokémon-GX and Pokémon-EX in play."
            energyCost C, C, C
            onAttack {
              damage 60
              damage 60*opp.all.findAll { it.pokemonGX || it.pokemonEX }.size()
            }
          }
          move "Puffy Smashers GX", {
            text "Your opponent’s Active Pokémon is now Asleep. If this Pokémon has at least 4 extra Energy attached to it (in addition to this attack's cost), this attack does 200 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can’t use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
            }
            onAttack{
              gxPerform()
              apply ASLEEP
              if (opp.bench && self.cards.energySufficient(thisMove.energyCost + C + C + C + C)) {
                damage 200, opp.bench.select("Deal 200 damage to which Pokémon?")
              }
            }
          }
        };
      case EEVEE_166:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Lead", {
            text "Search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck: "Your deck is empty."
            }
            onAttack {
              my.deck.search(count:1, "Choose a Supporter card.", cardTypeFilter(SUPPORTER)).showToOpponent("Opponent's chosen Supporter card.").moveTo(my.hand)
            }
          }
          move "Bite", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case EEVEE_167:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Follow My Tail", {
            text "Search your deck for any number of Eevee and Eevee-GX and put them onto your Bench. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (max: my.bench.freeBenchCount, { it.name == "Eevee" || it.name == "Eevee-GX" }).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Tackle", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
        };
      case IGGLYBUFF_168:
        return basic (this, hp:HP060, type:C, retreatCost:0) {
          bwAbility "Sleepy Voice", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, your opponent’s Active Pokémon is now Asleep. If you use this Ability, your turn ends."
            actionA {
              checkLastTurn()
              powerUsed()
              flip {
                apply(ASLEEP as SpecialConditionType, opp.active, Source.SRC_ABILITY)
              }
              bg.gm().betweenTurns()
            }
          }
        };
      case AIPOM_169:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          bwAbility "Scampering Tail", {
            text "Once during your turn (before your attack), you may put the top card of your opponent's deck on the bottom of their deck without looking at it."
            actionA {
              assert opp.deck : "Your opponent's deck is empty."
              checkLastTurn()
              powerUsed()
              opp.deck.subList(0, 1).moveTo(hidden:true, opp.deck)
            }
          }
          move "Tail Smack", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case AMBIPOM_170:
        return evolution (this, from:"Aipom", hp:HP100, type:C, retreatCost:1) {
          weakness F
          move "Nice-Nice Catch", {
            text "Draw 2 cards."
            energyCost C
            onAttack {
              draw 2
            }
          }
          move "Bye-Bye Throw", {
            text "60x damage. Discard up to 2 cards from your hand. This attack does 60 damage for each card you discarded in this way."
            energyCost C, C
            attackRequirement {
              assert my.hand : "Your hand is empty."
            }
            onAttack {
              damage 60 * my.hand.select(max:2).discard().size()
            }
          }
        };
      case TEDDIURSA_171:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Scratch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Slash", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
        };
      case URSARING_172:
        return evolution (this, from:"Teddiursa", hp:HP140, type:C, retreatCost:3) {
          weakness F
          move "Hammer In", {
            text "50 damage."
            energyCost C, C
            onAttack {
              damage 50
            }
          }
          move "Heavy Hold", {
            text "120 damage. The Defending Pokémon can't attack during your opponent's next turn."
            energyCost C, C, C, C
            onAttack {
              damage 120
              cantAttackNextTurn defending
            }
          }
        };
      case ZANGOOSE_173:
        return basic (this, hp:HP100, type:C, retreatCost:1) {
          weakness F
          move "Corkscrew Punch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Brutal Edge", {
            text "20+ damage. This attack does 10 more damage for each damage counter on your opponent's Active Pokémon."
            energyCost C, C
            onAttack {
              damage 20+10*defending.numberOfDamageCounters
            }
          }
        };
      case LILLIPUP_174:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Baby-Doll Eyes", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              cantRetreat(defending)
            }
          }
          move "Tackle", {
            text "40 damage."
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }
        };
      case HERDIER_175:
        return evolution (this, from:"Lillipup", hp:HP100, type:C, retreatCost:2) {
          weakness F
          move "Work Up", {
            text "During your next turn, this Pokémon's attacks do 60 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
            energyCost C
            onAttack {
              doMoreDamageNextTurn(thisMove, 60, self)
            }
          }
          move "Headbutt Bounce", {
            text "60 damage."
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }
        };
      case STOUTLAND_176:
        return evolution (this, from:"Herdier", hp:HP150, type:C, retreatCost:3) {
          weakness F
          bwAbility "Arf Arf Bark", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may discard an Energy from your opponent's Active Pokémon. If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, you may discard an Energy from your opponent's Active Pokémon."
            onActivate { r ->
              if (r==PLAY_FROM_HAND && my.deck && confirm("Use Arf Arf Bark?")) {
                if(opp.active.cards.filterByType(ENERGY)) {
                  opp.active.cards.filterByType(ENERGY).select("Discard which Energy?").discard()
                }
              }
            }
            delayedA {
              before (KNOCKOUT,self) {
                if (self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                  bc "Arf Arf Bark activates"
                  if (self.owner.opposite.pbg.active.cards.filterByType(ENERGY)) {
                    self.owner.opposite.pbg.active.cards.filterByType(ENERGY).select("Discard which Energy?").discard()
                  }
                }
              }
            }
          }
          move "Overrun", {
            text "110 damage. This attack does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            onAttack {
              damage 110
              if (opp.bench) damage 30, opp.bench.select()
            }
          }
        };
      case RUFFLET_177:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Fury Attack", {
            text "10x damage. Flip 3 coins. This attack does 10 damage for each heads."
            energyCost C
            onAttack {
              flip 3, {damage 10}
            }
          }
        };
      case BRAVIARY_178:
        return evolution (this, from:"Rufflet", hp:HP130, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Clutch", {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Aero Fall", {
            text "140 damage. Discard 2 Energy from this Pokémon."
            energyCost C, C, C, C
            onAttack {
              damage 140
              discardSelfEnergy(C, C)
            }
          }
        };
      case HELIOPTILE_179:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Tail Whip", {
            text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
            energyCost C
            onAttack {
              flip { cantAttackNextTurn defending }
            }
          }
          move "Rear Kick", {
            text "30 damage."
            energyCost C, C, C
            onAttack {
              damage 30
            }
          }
        };
      case HELIOLISK_180:
        return evolution (this, from:"Helioptile", hp:HP100, type:C, retreatCost:1) {
          weakness F
          move "Parabolic Counter", {
            text "30+ damage. If your opponent has any [L] Pokémon in play, this attack does 90 more damage."
            energyCost C
            onAttack {
              damage 30
              if (opp.all.findAll { it.types.contains(L) }) {
                damage 90
              }
            }
          }
          move "Zap Kick", {
            text "80 damage."
            energyCost C, C, C
            onAttack {
              damage 80
            }
          }
        };
      case STUFFUL_181:
        return basic (this, hp:HP080, type:C, retreatCost:2) {
          weakness F
          move "Continuous Tumble", {
            text "10+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
            energyCost C, C
            onAttack {
              damage 10
              flipUntilTails { damage 30 }
            }
          }
        };
      case BEWEAR_182:
        return evolution (this, from:"Stufful", hp:HP120, type:C, retreatCost:2) {
          weakness F
          bwAbility "Carry and Run", {
            text "As long as this Pokémon is on your Bench, your Active Pokémon's Retreat Cost is [C][C] less."
            getterA (GET_RETREAT_COST) { h->
              if (!self.active && h.effect.target.owner == self.owner && h.effect.target.active) {
                h.object -= 2
              }
            }
          }
          move "Lariat", {
            text "120 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C
            onAttack {
              flip { damage 120 }
            }
          }
        };
      case TYPE_NULL_183:
        return basic (this, hp:HP110, type:C, retreatCost:2) {
          weakness F
          move "Air Slash", {
            text "50 damage. Discard an Energy from this Pokémon."
            energyCost C, C
            onAttack {
              damage 50
              discardSelfEnergy C
            }
          }
        };
      case SILVALLY_GX_184:
        return evolution (this, from:"Type: Null", hp:HP210, type:C, retreatCost:2) {
          weakness F
          bwAbility "Disk Reload", {
            text "Once during your turn (before your attack), you may draw cards until you have 5 cards in your hand."
            actionA {
              assert my.hand.size() < 5 : "You have 5 or more cards in your hand."
              assert my.deck : "Your deck is empty."
              checkLastTurn()
              powerUsed()
              draw 5-my.hand.size()
            }
          }
          move "Brave Buddies", {
            text "50+ damage. If you played a Supporter card from your hand during this turn, this attack does 70 more damage."
            energyCost C, C
            onAttack {
              damage 50
              if (bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) damage 70
            }
          }
          move "Silver Knight GX", {
            text "If your opponent’s Active Pokémon is an Ultra Beast, it is Knocked Out. (You can’t use more than 1 GX attack in a game.)"
            energyCost C, C
            attackRequirement {
              gxCheck()
              assert defending.topPokemonCard.cardTypes.is(ULTRA_BEAST) : "Opponent's Active Pokémon is not an Ultra Beast."
            }
            onAttack {
              gxPerform()
              new Knockout(defending).run(bg)
            }
          }
        };
      case BEASTITE_185:
        return pokemonTool (this) {
          text "The attacks of the Ultra Beast this card is attached to do 10 more damage to your opponent’s Active Pokémon for each Prize card you have taken (before applying Weakness and Resistance)."
          def eff
          onPlay { reason ->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  def plusDmg = 10*my.prizeCardSet.takenCount
                  if (it.from == self && it.to.active && it.to.owner != self.owner && self.topPokemonCard.cardTypes.is(ULTRA_BEAST) && it.dmg.value) {
                    bc "Beastite +$plusDmg"
                    it.dmg += hp(plusDmg)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case BELLELBA_BRYCEN_MAN_186:
        return supporter (this) {
          text "Discard 3 cards from the top of each player’s deck." +
            "When you play this card, you may discard 3 other cards from your hand. If you do, each player discards their Benched Pokémon until they have 3 Benched Pokémon. Your opponent discards first."
          def eff
          onPlay {
            if(opp.deck) opp.deck.subList(0, 3).discard()
            if(my.deck) my.deck.subList(0, 3).discard()

            if (my.hand.getExcludedList(thisCard).size() >= 3 && confirm("Discard 3 cards to force both players to discard their Benched Pokémon until they have 3 Benched Pokémon?")) {
              my.hand.getExcludedList(thisCard).select(count:3, "Select cards to discard.").discard()

              eff = getter (GET_BENCH_SIZE) {h->
                h.object = 3
              }

              thisCard.player.opposite.pbg.triggerBenchSizeCheck()
              thisCard.player.pbg.triggerBenchSizeCheck()
              eff.unregister()
              thisCard.player.opposite.pbg.triggerBenchSizeCheck()
              thisCard.player.pbg.triggerBenchSizeCheck()

            }
          }
          playRequirement {
            assert my.deck || opp.deck
          }
        };
      case CHAOTIC_SWELL_187:
        return stadium (this) {
          text "Whenever either player plays a Stadium card from their hand, discard that Stadium card after discarding this one. (The new Stadium card has no effect.)"
          def eff
          onPlay {
            eff = delayed {
              after PLAY_STADIUM, {
                if (!ef.cardToPlay.name.contains("Chaotic Swell")) {
                  discard ef.cardToPlay
                  unregister() // this ensures self effect to be correctly unregistered
                }
              }
            }
          }
          onRemoveFromPlay {
            // only unregister when there is no PlayStadium in the stack
            if( !bg.em().currentEffectStack.find{it instanceof PlayStadium} ) {
              eff.unregister()
            }
          }
        };
      case CLAY_188:
        return supporter (this) {
          text "Discard the top 7 cards of your deck. If any of those cards are Item cards, put them into your hand."
          onPlay {
            def cards = my.deck.subList(0, 7).discard()
            cards.filterByType(ITEM).moveTo(my.hand)
          }
          playRequirement{
            assert my.deck : "Your deck is empty."
          }
        };
      case CYNTHIA_CAITLIN_189:
        return supporter (this) {
          text "Put a Supporter card from your discard pile into your hand. You can't choose Cynthia & Caitlin or a card you discarded with the effect of this card." +
            "When you play this card, you may discard another card from your hand. If you do, draw 3 cards."
          onPlay {
            def toDiscard = false

            if (confirm("Discard another card to draw 3 other cards?")) {
              toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card to discard.")
            }

            def supporters = my.discard.filterByType(SUPPORTER).findAll {
              it.name != "Cynthia & Caitlin"
            }

            if (supporters) {
              supporters.select("Choose a Supporter to move to your hand.").moveTo(my.hand)
            }

            if (toDiscard) {
              toDiscard.discard()
              draw 3
            }
          }
          playRequirement {
            def hand = my.hand.getExcludedList(thisCard).size() >= 1
            assert (hand || my.discard.filterByType(SUPPORTER)) : "Not enough cards in hand and no Supporter cards in discard."
          }
        };
      case DRAGONIUM_Z_DRAGON_CLAW_190:
        return pokemonTool (this) {
          text "If the Pokémon this card is attached to has the Dragon Claw attack, it can use the GX attack on this card. (You still need the necessary Energy to use this attack.)" +
            "[C][C][C] Destructive Drake GX: 80×\n" +
            "Discard all basic Energy from this Pokémon. This attack does 80 damage for each card you discarded in this way. (You can’t use more than 1 GX attack in a game.)"
          def eff
          onPlay {reason->
            def moveBody = {
              text ""
              energyCost C, C, C
              attackRequirement {
                gxCheck()
                assert self.cards.filterByType(BASIC_ENERGY) : "No Basic Energy on $self."
              }
              onAttack {
                gxPerform()
                damage 80*self.cards.filterByType(BASIC_ENERGY).discard().size()
              }
            }
            Move move=new Move("Destructive Drake GX")
            moveBody.delegate=new MoveBuilder(thisMove:move)
            moveBody.call()
            eff = getter GET_MOVE_LIST, self, {h->
              if (h.object.findAll{it.name == "Dragon Claw"}) { h.object.add(move) }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case ERIKA_191:
        return supporter (this) {
          text "Each player may draw up to 3 cards. You draw first."
          onPlay {
            draw choose([0,1,2,3], ["0","1","2","3"], "Draw how many cards?", 3)
            draw oppChoose([0,1,2,3], ["0","1","2","3"], "Opponent played Erika. Draw how many cards?", 3), TargetPlayer.OPPONENT
          }
          playRequirement{
            assert my.deck || opp.deck : "Both players' decks are empty."
          }
        };
      case GREAT_CATCHER_192:
        return itemCard (this) {
          text "You can play this card only if you discard 2 other cards from your hand." +
            "Switch 1 of your opponent's Benched Pokémon-GX or Pokémon-EX with their Active Pokémon."
          onPlay {
            my.hand.getExcludedList(thisCard).select(count:2, "Discard 2 other cards.").discard()

            def tar = opp.bench.findAll { it.pokemonGX || it.pokemonEX }
            if (tar) {
              def card = tar.select("Select a Pokémon-EX or Pokémon-GX to be the new Active Pokémon")
              sw opp.active, card, TRAINER_CARD
            }

            shuffleDeck()
          }
          playRequirement{
            assert opp.bench.findAll { it.pokemonGX || it.pokemonEX } : "Your opponent has no Pokémon-GX or Pokémon-EX in play."
            assert my.hand.getExcludedList(thisCard).size() >= 2 : "Not enough cards in your hand."
          }
        };
      case GUZMA_HALA_193:
        return supporter (this) {
          text "Search your deck for a Stadium card, reveal it, and put it into your hand. Then, shuffle your deck." +
            "When you play this card, you may discard 2 other cards from your hand. If you do, you may also search for a Pokémon Tool card and a Special Energy card in this way."
          onPlay {
            def discarded = false

            if (my.hand.getExcludedList(thisCard).size() >= 2 && confirm("Discard 2 cards to be able to search for a Pokémon Tool card and a Special Energy card?")) {
              my.hand.getExcludedList(thisCard).select(count:2, "Select cards to discard.").discard()
              discarded = true
            }

            if (discarded) {
              my.deck.search(max: 2, "Select a Pokémon Tool card and a Special Energy card.", {it.cardTypes.is(POKEMON_TOOL) || it.cardTypes.is(SPECIAL_ENERGY)}, { CardList list ->
                list.filterByType(POKEMON_TOOL).size() <= 1 && list.filterByType(SPECIAL_ENERGY).size() <= 1
              }).showToOpponent("Opponent's selected Pokémon Tool and Special Energy.").moveTo(my.hand)
            }
            my.deck.search("Select a Stadium card.", {
              it.cardTypes.is(STADIUM)
            }).showToOpponent("Opponent's selected Stadium card.").moveTo(my.hand)

            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty."
          }
        };
      case ISLAND_CHALLENGE_AMULET_194:
        return pokemonTool (this) {
          text "The Pokémon-GX or Pokémon-EX this card is attached to gets -100 HP, and when it is Knocked Out by damage from an opponent’s attack, that player takes 1 fewer Prize card."
          def eff
          def effPrize
          onPlay {reason->
            eff = getter (GET_FULL_HP, self) {h->
              if (self.pokemonEX || self.pokemonGX) {
                h.object -= hp(100)
              }
            }
            effPrize = delayed (priority: BEFORE_LAST) {
              before KNOCKOUT, self, {
                if (self.pokemonEX || self.pokemonGX) {
                  if(ef.byDamageFromAttack) {
                    bc "$thisCard forces the opponent to take one less prize card."
                    blockingEffect(TAKE_PRIZE).setUnregisterImmediately(true)
                  }
                }
              }
            }
            checkFaint()
          }
          onRemoveFromPlay {
            eff.unregister()
            effPrize.unregister()
          }
        };
      case LANA_S_FISHING_ROD_195:
        return itemCard (this) {
          text "Shuffle a Pokémon and a Pokémon Tool card from your discard pilef into your deck."
          onPlay {
            my.discard.filterByType(POKEMON_TOOL).select(count: 1, "Select a Pokémon Tool card to shuffle into your deck.").showToOpponent("Opponent's selected Pokémon Tool.").moveTo(my.deck)
            my.discard.filterByType(POKEMON).select(count: 1, "Select a Pokémon to shuffle into your deck.").showToOpponent("Opponent's selected Pokémon.").moveTo(my.deck)
            shuffleDeck()
          }
          playRequirement {
            assert my.discard.filterByType(POKEMON_TOOL, POKEMON) : "No Pokémon or Pokémon Tool cards in your discard."
          }
        };
      case LILLIE_S_FULL_FORCE_196:
        return supporter (this) {
          text "Draw 4 cards." +
            "At the end of this turn, if you have 3 or more cards in your hand, shuffle cards from your hand into your deck until you have 2 cards in your hand."
          onPlay { reason ->
            bg.em().storeObject("LILLIE_S_FULL_FORCE_TURN", bg.turnCount)
            draw 4

            delayed {
              unregisterAfter 1
              unregister {
                while (my.hand.size() >= 3) {
                  my.hand.select("Select cards to shuffle back into the deck.").moveTo(my.deck)
                }
                shuffleDeck()
                draw 2 - my.hand.size()
              }
            }
          }
          playRequirement {}
        };
      case LILLIE_S_POKE_DOLL_197:
        return itemCard (this) {
          text "Play this card as if it were a 30-HP [C] Basic Pokémon. At any time during your turn (before your attack), if this Pokémon is your Active Pokémon, you may discard all cards from it and put it on the bottom of your deck." +
            "This card can't retreat. If this card is Knocked Out, your opponent can't take any Prize cards for it."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(LILLIE_S_POKE_DOLL_197).setCardTypes(BASIC, POKEMON), hp:HP030, type:COLORLESS, retreatCost:0) {
              customAbility {
                def ef2, acl
                onActivate {
                  delayed {
                    before RETREAT, self, {
                      wcu "Cannot retreat."
                      prevent()
                    }
                    before TAKE_PRIZE, {
                      if(ef.pcs==self) {
                        prevent()
                      }
                    }
                  }
                  if (!ef2) {
                    ef2 = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          ef2 = null
                        }
                      }
                    }
                  }
                  acl = action("Discard Lillie's Poké Doll", [TargetPlayer.SELF]) {
                    assert self.active : "Lillie's Poké Doll must be the Active Pokémon."
                    self.cards.getExcludedList(self.topPokemonCard).discard()
                    self.cards.moveTo(my.deck)
                    removePCS(self)
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
      case MALLOW_LANA_198:
        return supporter (this) {
          text "Switch your Active Pokémon with 1 of your Benched Pokémon." +
            "When you play this card, you may discard 2 other cards from your hand. If you do, heal 120 damage from the Pokémon you moved to your Bench."
          onPlay {
            def healingEff = false
            def switchedPCS
            if (my.hand.getExcludedList(thisCard).size() >= 2 && confirm("Discard 2 cards to be able to heal the Pokémon you moved to the bench?")) {
              my.hand.getExcludedList(thisCard).select(count:2, "Choose 2 cards to discard.").discard()
              switchedPCS = my.active
              healingEff = true
            }

            sw my.active, my.bench.select("Select the new Active Pokémon."), Source.TRAINER_CARD

            if (healingEff) {
              heal 120, switchedPCS
            }
          }
          playRequirement {
            assert my.bench
          }
        };
      case MISTY_LORELEI_199:
        return supporter (this) {
          text "Search your deck for up to 3 [W] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck." +
            "When you play this card, you may discard 5 other cards from your hand. If you do, during this turn, your [W] Pokémon can use their GX attacks even if you have used your GX attack."
          onPlay {
            my.deck.search(max:3,"Select up to 3 [W] Energy cards.",basicEnergyFilter(W)).moveTo(my.hand)
            shuffleDeck()

            if (my.hand.getExcludedList(thisCard).size() >= 5 && confirm("Discard 5 cards to allow [W] Pokémon to use their GX attack this turn (even if GX attack has already been used)?")) {
              my.hand.getExcludedList(thisCard).select(count:5, "Choose 5 cards to discard.").discard()
              if (isGxPerformed()) {
                bg.em().storeObject("gx_"+thisCard.player, 0)
                delayed {
                  before CHECK_ATTACK_REQUIREMENTS, {
                    if (!ef.attacker.types.contains(W) ) {
                      if (ef.move.name.contains('GX')) {
                        prevent()
                        bc "GX move already used"
                      }
                    }
                  }
                  unregisterAfter 1
                  unregister {
                    bg.em().storeObject("gx_"+thisCard.player, 1) // in case attack fails for other reasons
                  }
                }
              }
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      case N_S_RESOLVE_200:
        return supporter (this) {
          text "Discard the top 6 cards of your deck. If any of those cards are basic Energy cards, attach them to 1 of your Benched [N] Pokémon."
          onPlay {
            bg.em().storeObject("N_S_RESOLVE_TURN", bg.turnCount)
            def list = my.deck.subList(0, 6).filterByType(BASIC_ENERGY)
            def num = list.size()
            if (num) {
              list.showToMe("These are the basic Energies that were discarded.")
              def tar = my.bench.findAll { it.types.contains(N) }.select("Which [N] Pokémon to attach these Energies to?")
              list.each { attachEnergy(tar, it) }
            }
            my.deck.subList(0, 6-num).discard()
          }
          playRequirement{
            assert my.deck : "Your deck is empty."
            assert my.bench.findAll({ it.types.contains(N) }) : "No [N] Pokémon on your bench."
          }
        };
      case PROFESSOR_OAK_S_SETUP_201:
        return supporter (this) {
          text "Search your deck for up to 3 Basic Pokémon of different types and put them onto your Bench. Then, shuffle your deck."
          onPlay {
            def maxSpace = Math.min(my.bench.freeBenchCount, 3)
            my.deck.select(min:0, max:maxSpace, "Select up to $maxSpace Basic Pokémon of different types.", cardTypeFilter(BASIC), thisCard.player, { CardList list ->
              TypeSet typeSet = new TypeSet()
              for (card in list) {
                if (typeSet.containsAny(card.asPokemonCard().types)) {
                  return false
                }
                typeSet.addAll(card.asPokemonCard().types)
              }
              return true
            }).each {
              my.deck.remove(it);
              benchPCS(it)
            }
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case RED_BLUE_202:
        return supporter (this) {
          text "Search your deck for a Pokémon-GX that evolves from 1 of your Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck. (You can't use this card during your first turn or on a Pokémon that was put into play this turn.)" +
            "When you play this card, you may discard 2 other cards from your hand. If you do, search your deck for up to 2 basic Energy cards and attach them to the Pokémon you evolved in this way."
          onPlay {
            def toDiscard = false

            if (my.hand.getExcludedList(thisCard).size() >= 2 && confirm("Discard 2 cards to be able to search for up to 2 basic Energy cards and attach to the Pokémon to be evolved?")) {
              toDiscard = my.hand.getExcludedList(thisCard).select(count:2, "Choose 2 cards to discard.")
              toDiscard.discard()
            }

            def names = my.all.findAll {it.turnCount < bg.turnCount}.collect { it.name }
            def sel = deck.search ("Select a Pokémon-GX that evolves from $names.", {
              it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor) && it.cardTypes.is(POKEMON_GX)
            })
            if (sel) {
              def opts = my.all.findAll ({
                it.name==sel.first().predecessor && it.turnCount < bg.turnCount
              })
              def pcs = opts.select("Evolve which Pokémon?")
              if (pcs) {
                evolve(pcs, sel.first(), OTHER)

                if (toDiscard) {
                  attachEnergyFrom(min: 0, max: 2, basic:true, my.deck, pcs)
                }
              }
            }

            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty."
            assert bg.turnCount > 2 : "Cannot use this card during your first turn."
            assert my.all.findAll {it.turnCount < bg.turnCount}
          }
        };
      case ROLLER_SKATER_203:
        return supporter (this) {
          text "Discard a card from your hand. If you do, draw 2 cards. If you discarded an Energy card in this way, draw 2 more cards."
          onPlay {
            def selected = my.hand.getExcludedList(thisCard).select("Select a card to discard.")
            draw 2

            if (selected.first().cardTypes.is(ENERGY)) {
              draw 2
            }
            selected.discard()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard)
          }
        };
      case ROSA_204:
        return supporter (this) {
          text "You can play this card only if 1 of your Pokémon was Knocked Out during your opponent's last turn." +
            "Search your deck for a Pokémon, a Trainer card, and a basic Energy card, reveal them, and put them into your hand. Then, shuffle your deck."
          globalAbility {Card thisCard->
            delayed {
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                  bg.em().storeObject("Rosa_KO", bg.turnCount)
                }
              }
            }
          }
          onPlay {
            my.deck.search(max: 3, "Select a Pokémon, a Trainer card and a basic Energy card.", {it.cardTypes.is(POKEMON) || it.cardTypes.is(TRAINER) || it.cardTypes.is(BASIC_ENERGY)}, { CardList list ->
              list.filterByType(POKEMON).size() <= 1 && list.filterByType(TRAINER).size() <= 1 && list.filterByType(BASIC_ENERGY).size() <= 1
            }).showToOpponent("Opponent's selected Pokémon, Trainer, and basic Energy cards.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert bg.turnCount
            assert bg.em().retrieveObject("Rosa_KO") == bg.turnCount - 1: "No Pokémon was Knocked Out during your opponent’s last turn."
          }
        };
      case ROXIE_205:
        return supporter (this) {
          text "Discard up to 2 Pokémon that aren't Pokémon-GX or Pokémon-EX from your hand. Draw 3 cards for each card you discarded in this way."
          def list = { my.hand.findAll ({ !it.cardTypes.isIn(POKEMON_EX, POKEMON_GX) && it.cardTypes.isIn(POKEMON) }) }
          onPlay {
            list().select(max:2, "Select up to 2 Pokémon that aren't Pokémon-GX or Pokémon-EX to discard.").discard().each {
              draw 3
              it.abilities.each {
                if (it.name == "Blow-Away Bomb" && confirm("Use Blow-Away Bomb?")) {
                  bc "Blow-Away Bomb activates."
                  opp.all.each { target ->
                    directDamage 10, target
                  }
                }
              }
            }
          }
          playRequirement{
            assert list() : "You do not have any non-GX/EX Pokémon in your hand."
          }
        };
      case TAG_CALL_206:
        return itemCard (this) {
          text "Search your deck for up to 2 TAG TEAM cards, reveal them, and put them into your hand. Then, shuffle your deck."
          onPlay {
            deck.search(max:2, cardTypeFilter(TAG_TEAM)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty."
          }
        };
      case UNIDENTIFIED_FOSSIL_207:
        return copy (UnifiedMinds.UNIDENTIFIED_FOSSIL_210, this);
      case WILL_208:
        return supporter (this) {
          text "The next time you flip any number of coins for the effect of an attack, Ability, or Trainer card this turn, choose heads or tails for the first coin flip."
          onPlay {
            delayed {
              def doit = {
                boolean res = choose([true,false],["HEADS","TAILS"],"A coin flip is about to occur. Choose HEADS or TAILS as the result.")
                bc "Will changes the first coinflip to: ${res?'HEADS':'TAILS'}"
                bg.deterministicCoinFlipQueue.offer(res)
                unregister()
              }
              before COIN_FLIP, {doit()}
              before COIN_FLIP_GETTER, {doit()}
              unregisterAfter 1
            }
          }
          playRequirement{
          }
        };
      case DRAW_ENERGY_209:
        return specialEnergy (this, [[C]]) {
          text "This card provides [C] Energy." +
            "When you attach this card from your hand to a Pokémon, draw a card."
          onPlay {reason->
            if(reason == PLAY_FROM_HAND) {
              draw 1
            }
          }
        };
      case VENUSAUR_SNIVY_GX_210:
        return copy (VENUSAUR_SNIVY_GX_1, this);
      case VILEPLUME_GX_211:
        return copy (VILEPLUME_GX_4, this);
      case CHARIZARD_BRAIXEN_GX_212:
        return copy (CHARIZARD_BRAIXEN_GX_22, this);
      case VOLCARONA_GX_213:
        return copy (VOLCARONA_GX_35, this);
      case BLASTOISE_PIPLUP_GX_214:
        return copy (BLASTOISE_PIPLUP_GX_38, this);
      case BLASTOISE_PIPLUP_GX_215:
        return copy (BLASTOISE_PIPLUP_GX_38, this);
      case SOLGALEO_LUNALA_GX_216:
        return copy (SOLGALEO_LUNALA_GX_75, this);
      case ORICORIO_GX_217:
        return copy (ORICORIO_GX_95, this);
      case FLYGON_GX_218:
        return copy (FLYGON_GX_110, this);
      case ALOLAN_PERSIAN_GX_219:
        return copy (ALOLAN_PERSIAN_GX_129, this);
      case ARCEUS_DIALGA_PALKIA_GX_220:
        return copy (ARCEUS_DIALGA_PALKIA_GX_156, this);
      case ARCEUS_DIALGA_PALKIA_GX_221:
        return copy (ARCEUS_DIALGA_PALKIA_GX_156, this);
      case RESHIRAM_ZEKROM_GX_222:
        return copy (RESHIRAM_ZEKROM_GX_157, this);
      case NAGANADEL_GUZZLORD_GX_223:
        return copy (NAGANADEL_GUZZLORD_GX_158, this);
      case NAGANADEL_GUZZLORD_GX_224:
        return copy (NAGANADEL_GUZZLORD_GX_158, this);
      case MEGA_LOPUNNY_JIGGLYPUFF_GX_225:
        return copy (MEGA_LOPUNNY_JIGGLYPUFF_GX_165, this);
      case MEGA_LOPUNNY_JIGGLYPUFF_GX_226:
        return copy (MEGA_LOPUNNY_JIGGLYPUFF_GX_165, this);
      case SILVALLY_GX_227:
        return copy (SILVALLY_GX_184, this);
      case CYNTHIA_CAITLIN_228:
        return copy (CYNTHIA_CAITLIN_189, this);
      case GUZMA_HALA_229:
        return copy (GUZMA_HALA_193, this);
      case LILLIE_S_FULL_FORCE_230:
        return copy (LILLIE_S_FULL_FORCE_196, this);
      case MALLOW_LANA_231:
        return copy (MALLOW_LANA_198, this);
      case N_S_RESOLVE_232:
        return copy (N_S_RESOLVE_200, this);
      case PROFESSOR_OAK_S_SETUP_233:
        return copy (PROFESSOR_OAK_S_SETUP_201, this);
      case RED_BLUE_234:
        return copy (RED_BLUE_202, this);
      case ROLLER_SKATER_235:
        return copy (ROLLER_SKATER_203, this);
      case ROSA_236:
        return copy (ROSA_204, this);
      case TORKOAL_237:
        return copy (TORKOAL_29, this);
      case WEAVILE_238:
        return copy (WEAVILE_44, this);
      case PIPLUP_239:
        return copy (PIPLUP_54, this);
      case WISHIWASHI_240:
        return copy (WISHIWASHI_62, this);
      case PIKACHU_241:
        return copy (PIKACHU_66, this);
      case MAGNEMITE_242:
        return copy (MAGNEMITE_68, this);
      case KOFFING_243:
        return copy (KOFFING_76, this);
      case GALLADE_244:
        return copy (GALLADE_82, this);
      case MIMIKYU_245:
        return copy (MIMIKYU_96, this);
      case EXCADRILL_246:
        return copy (EXCADRILL_115, this);
      case STEELIX_247:
        return copy (STEELIX_139, this);
      case STOUTLAND_248:
        return copy (STOUTLAND_176, this);
      case VENUSAUR_SNIVY_GX_249:
        return copy (VENUSAUR_SNIVY_GX_1, this);
      case VILEPLUME_GX_250:
        return copy (VILEPLUME_GX_211, this);
      case CHARIZARD_BRAIXEN_GX_251:
        return copy (CHARIZARD_BRAIXEN_GX_22, this);
      case VOLCARONA_GX_252:
        return copy (VOLCARONA_GX_35, this);
      case BLASTOISE_PIPLUP_GX_253:
        return copy (BLASTOISE_PIPLUP_GX_38, this);
      case SOLGALEO_LUNALA_GX_254:
        return copy (SOLGALEO_LUNALA_GX_75, this);
      case ORICORIO_GX_255:
        return copy (ORICORIO_GX_95, this);
      case FLYGON_GX_256:
        return copy (FLYGON_GX_110, this);
      case ALOLAN_PERSIAN_GX_257:
        return copy (ALOLAN_PERSIAN_GX_129, this);
      case ARCEUS_DIALGA_PALKIA_GX_258:
        return copy (ARCEUS_DIALGA_PALKIA_GX_156, this);
      case RESHIRAM_ZEKROM_GX_259:
        return copy (RESHIRAM_ZEKROM_GX_157, this);
      case NAGANADEL_GUZZLORD_GX_260:
        return copy (NAGANADEL_GUZZLORD_GX_158, this);
      case MEGA_LOPUNNY_JIGGLYPUFF_GX_261:
        return copy (MEGA_LOPUNNY_JIGGLYPUFF_GX_165, this);
      case SILVALLY_GX_262:
        return copy (SILVALLY_GX_184, this);
      case GIANT_HEARTH_263:
        return copy (UnifiedMinds.GIANT_HEARTH_197, this);
      case GREAT_CATCHER_264:
        return copy (GREAT_CATCHER_192, this);
      case ISLAND_CHALLENGE_AMULET_265:
        return copy (ISLAND_CHALLENGE_AMULET_194, this);
      case LANA_S_FISHING_ROD_266:
        return copy (LANA_S_FISHING_ROD_195, this);
      case LILLIE_S_POKE_DOLL_267:
        return copy (LILLIE_S_POKE_DOLL_197, this);
      case MARTIAL_ARTS_DOJO_268:
        return copy (UnbrokenBonds.MARTIAL_ARTS_DOJO_179, this);
      case POWER_PLANT_269:
        return copy (UnbrokenBonds.POWER_PLANT_183, this);
      case TAG_CALL_270:
        return copy (TAG_CALL_206, this);
      case DRAW_ENERGY_271:
        return copy (DRAW_ENERGY_209, this);
      default:
        return null;
    }
  }
}
