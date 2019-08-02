package tcgwars.logic.impl.gen;

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
 */
public enum UnifiedMinds implements CardInfo {
	
	ROWLET_ALOLAN_EXEGGUTOR_GX_1 ("Rowlet & Alolan Exeggutor-GX", 1, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
	YANMA_2 ("Yanma", 2, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	YANMEGA_3 ("Yanmega", 3, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	CELEBI_4 ("Celebi", 4, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	SHROOMISH_5 ("Shroomish", 5, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	SEWADDLE_6 ("Sewaddle", 6, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	SEWADDLE_7 ("Sewaddle", 7, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	SWADLOON_8 ("Swadloon", 8, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	LEAVANNY_9 ("Leavanny", 9, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	DWEBBLE_10 ("Dwebble", 10, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	CRUSTLE_11 ("Crustle", 11, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	KARRABLAST_12 ("Karrablast", 12, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	FOONGUS_13 ("Foongus", 13, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	AMOONGUSS_14 ("Amoonguss", 14, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	FOMANTIS_15 ("Fomantis", 15, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	LURANTIS_16 ("Lurantis", 16, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	BOUNSWEET_17 ("Bounsweet", 17, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	STEENEE_18 ("Steenee", 18, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	TSAREENA_19 ("Tsareena", 19, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	DHELMISE_20 ("Dhelmise", 20, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
	MAGMAR_21 ("Magmar", 21, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	MAGMORTAR_22 ("Magmortar", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	NUMEL_23 ("Numel", 23, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	CAMERUPT_24 ("Camerupt", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	HEATRAN_GX_25 ("Heatran-GX", 25, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	VICTINI_26 ("Victini", 26, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	LITWICK_27 ("Litwick", 27, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	LITWICK_28 ("Litwick", 28, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	LAMPENT_29 ("Lampent", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	CHANDELURE_30 ("Chandelure", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	FLETCHINDER_31 ("Fletchinder", 31, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	TALONFLAME_32 ("Talonflame", 32, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	SALANDIT_33 ("Salandit", 33, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	SALAZZLE_34 ("Salazzle", 34, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	SLOWPOKE_PSYDUCK_GX_35 ("Slowpoke & Psyduck-GX", 35, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
	LAPRAS_36 ("Lapras", 36, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
	SNORUNT_37 ("Snorunt", 37, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	FROSLASS_38 ("Froslass", 38, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	FINNEON_39 ("Finneon", 39, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	LUMINEON_40 ("Lumineon", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SNOVER_41 ("Snover", 41, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	ABOMASNOW_42 ("Abomasnow", 42, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	BASCULIN_43 ("Basculin", 43, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
	TIRTOUGA_44 ("Tirtouga", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	CARRACOSTA_45 ("Carracosta", 45, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
	CRYOGONAL_46 ("Cryogonal", 46, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	KELDEO_GX_47 ("Keldeo-GX", 47, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	DEWPIDER_48 ("Dewpider", 48, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	ARAQUANID_49 ("Araquanid", 49, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	WIMPOD_50 ("Wimpod", 50, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	GOLISOPOD_51 ("Golisopod", 51, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	PYUKUMUKU_52 ("Pyukumuku", 52, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
	TAPU_FINI_53 ("Tapu Fini", 53, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
	RAICHU_ALOLAN_RAICHU_GX_54 ("Raichu & Alolan Raichu-GX", 54, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _LIGHTNING_]),
	PIKACHU_55 ("Pikachu", 55, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	PIKACHU_56 ("Pikachu", 56, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	ALOLAN_RAICHU_57 ("Alolan Raichu", 57, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MAGNEMITE_58 ("Magnemite", 58, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	MAGNETON_59 ("Magneton", 59, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MAGNEZONE_60 ("Magnezone", 60, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
	JOLTIK_61 ("Joltik", 61, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	GALVANTULA_62 ("Galvantula", 62, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	TYNAMO_63 ("Tynamo", 63, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	TYNAMO_64 ("Tynamo", 64, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	EELEKTRIK_65 ("Eelektrik", 65, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	EELEKTROSS_66 ("Eelektross", 66, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
	STUNFISK_67 ("Stunfisk", 67, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	THUNDURUS_68 ("Thundurus", 68, Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
	TAPU_KOKO_69 ("Tapu Koko", 69, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	XURKITREE_70 ("Xurkitree", 70, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
	MEWTWO_MEW_GX_71 ("Mewtwo & Mew-GX", 71, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
	ESPEON_DEOXYS_GX_72 ("Espeon & Deoxys-GX", 72, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
	EXEGGCUTE_73 ("Exeggcute", 73, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	EXEGGUTOR_74 ("Exeggutor", 74, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	ALOLAN_MAROWAK_75 ("Alolan Marowak", 75, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	JYNX_76 ("Jynx", 76, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	WYNAUT_77 ("Wynaut", 77, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	LATIOS_GX_78 ("Latios-GX", 78, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	JIRACHI_GX_79 ("Jirachi-GX", 79, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	DRIFLOON_80 ("Drifloon", 80, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	DRIFBLIM_81 ("Drifblim", 81, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	SKORUPI_82 ("Skorupi", 82, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	UXIE_83 ("Uxie", 83, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	MESPRIT_84 ("Mesprit", 84, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	AZELF_85 ("Azelf", 85, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	GIRATINA_86 ("Giratina", 86, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	CRESSELIA_87 ("Cresselia", 87, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	MUNNA_88 ("Munna", 88, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	MUSHARNA_89 ("Musharna", 89, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	ELGYEM_90 ("Elgyem", 90, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	BEHEEYEM_91 ("Beheeyem", 91, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	HONEDGE_92 ("Honedge", 92, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	HONEDGE_93 ("Honedge", 93, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	DOUBLADE_94 ("Doublade", 94, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	AEGISLASH_95 ("Aegislash", 95, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
	MAREANIE_96 ("Mareanie", 96, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	TOXAPEX_97 ("Toxapex", 97, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	SALANDIT_98 ("Salandit", 98, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	SALAZZLE_99 ("Salazzle", 99, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	COSMOG_100 ("Cosmog", 100, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	NECROZMA_101 ("Necrozma", 101, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
	POIPOLE_102 ("Poipole", 102, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	ONIX_103 ("Onix", 103, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	STEELIX_104 ("Steelix", 104, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	CUBONE_105 ("Cubone", 105, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	AERODACTYL_GX_106 ("Aerodactyl-GX", 106, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIGHTING_]),
	HERACROSS_107 ("Heracross", 107, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
	BRELOOM_108 ("Breloom", 108, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	MEDITITE_109 ("Meditite", 109, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MEDICHAM_110 ("Medicham", 110, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	RELICANTH_111 ("Relicanth", 111, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
	GIBLE_112 ("Gible", 112, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	GABITE_113 ("Gabite", 113, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	GARCHOMP_114 ("Garchomp", 114, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	RIOLU_115 ("Riolu", 115, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	RIOLU_116 ("Riolu", 116, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	LUCARIO_117 ("Lucario", 117, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	DRILBUR_118 ("Drilbur", 118, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	EXCADRILL_119 ("Excadrill", 119, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	ARCHEN_120 ("Archen", 120, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	ARCHEOPS_121 ("Archeops", 121, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	TERRAKION_122 ("Terrakion", 122, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	MELOETTA_123 ("Meloetta", 123, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
	ZYGARDE_124 ("Zygarde", 124, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
	UMBREON_DARKRAI_GX_125 ("Umbreon & Darkrai-GX", 125, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
	MEGA_SABLEYE_TYRANITAR_GX_126 ("Mega Sableye & Tyranitar-GX", 126, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
	ALOLAN_GRIMER_127 ("Alolan Grimer", 127, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	MURKROW_128 ("Murkrow", 128, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	MURKROW_129 ("Murkrow", 129, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	HONCHKROW_130 ("Honchkrow", 130, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SNEASEL_131 ("Sneasel", 131, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	WEAVILE_GX_132 ("Weavile-GX", 132, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DARKNESS_]),
	SABLEYE_133 ("Sableye", 133, Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
	DRAPION_134 ("Drapion", 134, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	PURRLOIN_135 ("Purrloin", 135, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	LIEPARD_136 ("Liepard", 136, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SCRAGGY_137 ("Scraggy", 137, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	SCRAFTY_138 ("Scrafty", 138, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	YVELTAL_139 ("Yveltal", 139, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	HOOPA_140 ("Hoopa", 140, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	MAWILE_GX_141 ("Mawile-GX", 141, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	ESCAVALIER_142 ("Escavalier", 142, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	COTTONEE_143 ("Cottonee", 143, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
	WHIMSICOTT_144 ("Whimsicott", 144, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
	DEDENNE_145 ("Dedenne", 145, Rarity.UNCOMMON, [POKEMON, BASIC, _FAIRY_]),
	GARCHOMP_GIRATINA_GX_146 ("Garchomp & Giratina-GX", 146, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
	DRATINI_147 ("Dratini", 147, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
	DRATINI_148 ("Dratini", 148, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
	DRAGONAIR_149 ("Dragonair", 149, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	DRAGONAIR_150 ("Dragonair", 150, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	DRAGONITE_151 ("Dragonite", 151, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
	DRAGONITE_GX_152 ("Dragonite-GX", 152, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _DRAGON_]),
	LATIAS_153 ("Latias", 153, Rarity.RARE, [POKEMON, BASIC, _DRAGON_]),
	AXEW_154 ("Axew", 154, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
	FRAXURE_155 ("Fraxure", 155, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	HAXORUS_156 ("Haxorus", 156, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
	DRUDDIGON_157 ("Druddigon", 157, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
	NOIBAT_158 ("Noibat", 158, Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
	NOIVERN_159 ("Noivern", 159, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	NAGANADEL_GX_160 ("Naganadel-GX", 160, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DRAGON_]),
	LICKITUNG_161 ("Lickitung", 161, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	LICKILICKY_162 ("Lickilicky", 162, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	KANGASKHAN_163 ("Kangaskhan", 163, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	TAUROS_164 ("Tauros", 164, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	HOOTHOOT_165 ("Hoothoot", 165, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	NOCTOWL_166 ("Noctowl", 166, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	SLAKOTH_167 ("Slakoth", 167, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	SLAKOTH_168 ("Slakoth", 168, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	VIGOROTH_169 ("Vigoroth", 169, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	SLAKING_170 ("Slaking", 170, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
	BIDOOF_171 ("Bidoof", 171, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	BIBAREL_172 ("Bibarel", 172, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	MUNCHLAX_173 ("Munchlax", 173, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	PIDOVE_174 ("Pidove", 174, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	TRANQUILL_175 ("Tranquill", 175, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	UNFEZANT_176 ("Unfezant", 176, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
	AUDINO_177 ("Audino", 177, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	TORNADUS_178 ("Tornadus", 178, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	FLETCHLING_179 ("Fletchling", 179, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	YUNGOOS_180 ("Yungoos", 180, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	GUMSHOOS_181 ("Gumshoos", 181, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	ORANGURU_182 ("Oranguru", 182, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	TYPE_NULL_183 ("Type: Null", 183, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	SILVALLY_184 ("Silvally", 184, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	KOMALA_185 ("Komala", 185, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	BLAINE_S_QUIZ_SHOW_186 ("Blaine's Quiz Show", 186, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	BLIZZARD_TOWN_187 ("Blizzard Town", 187, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	BLUE_S_TACTICS_188 ("Blue’s Tactics", 188, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	BUG_CATCHER_189 ("Bug Catcher", 189, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	CHANNELER_190 ("Channeler", 190, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	CHERISH_BALL_191 ("Cherish Ball", 191, Rarity.UNCOMMON, [TRAINER, ITEM]),
	COACH_TRAINER_192 ("Coach Trainer", 192, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	DARK_CITY_193 ("Dark City", 193, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	EAR_RINGING_BELL_194 ("Ear-Ringing Bell", 194, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	FLYINIUM_Z_AIR_SLASH_195 ("Flyinium Z: Air Slash", 195, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	GIANT_BOMB_196 ("Giant Bomb", 196, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	GIANT_HEARTH_197 ("Giant Hearth", 197, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	GREAT_POTION_198 ("Great Potion", 198, Rarity.UNCOMMON, [TRAINER, ITEM]),
	GRIMSLEY_199 ("Grimsley", 199, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HAPU_200 ("Hapu", 200, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	KARATE_BELT_201 ("Karate Belt", 201, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	MISTY_S_FAVOR_202 ("Misty's Favor", 202, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	NORMALIUM_Z_TACKLE_203 ("Normalium Z: Tackle", 203, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	POKE_MANIAC_204 ("Poké Maniac", 204, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	POKEMON_RESEARCH_LAB_205 ("Pokémon Research Lab", 205, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	RESET_STAMP_206 ("Reset Stamp", 206, Rarity.UNCOMMON, [TRAINER, ITEM]),
	SLUMBERING_FOREST_207 ("Slumbering Forest", 207, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	STADIUM_NAV_208 ("Stadium Nav", 208, Rarity.UNCOMMON, [TRAINER, ITEM]),
	TAG_SWITCH_209 ("Tag Switch", 209, Rarity.UNCOMMON, [TRAINER, ITEM]),
	UNIDENTIFIED_FOSSIL_210 ("Unidentified Fossil", 210, Rarity.UNCOMMON, [TRAINER, ITEM]),
	U_TURN_BOARD_211 ("U-Turn Board", 211, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	RECYCLE_ENERGY_212 ("Recycle Energy", 212, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
	WEAKNESS_GUARD_ENERGY_213 ("Weakness Guard Energy", 213, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
	ROWLET_ALOLAN_EXEGGUTOR_GX_214 ("Rowlet & Alolan Exeggutor-GX", 214, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
	ROWLET_ALOLAN_EXEGGUTOR_GX_215 ("Rowlet & Alolan Exeggutor-GX", 215, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
	HEATRAN_GX_216 ("Heatran-GX", 216, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	SLOWPOKE_PSYDUCK_GX_217 ("Slowpoke & Psyduck-GX", 217, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
	SLOWPOKE_PSYDUCK_GX_218 ("Slowpoke & Psyduck-GX", 218, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
	KELDEO_GX_219 ("Keldeo-GX", 219, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	RAICHU_ALOLAN_RAICHU_GX_220 ("Raichu & Alolan Raichu-GX", 220, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _LIGHTNING_]),
	RAICHU_ALOLAN_RAICHU_GX_221 ("Raichu & Alolan Raichu-GX", 221, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _LIGHTNING_]),
	MEWTWO_MEW_GX_222 ("Mewtwo & Mew-GX", 222, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
	LATIOS_GX_223 ("Latios-GX", 223, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	AERODACTYL_GX_224 ("Aerodactyl-GX", 224, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIGHTING_]),
	MEGA_SABLEYE_TYRANITAR_GX_225 ("Mega Sableye & Tyranitar-GX", 225, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
	MEGA_SABLEYE_TYRANITAR_GX_226 ("Mega Sableye & Tyranitar-GX", 226, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
	MAWILE_GX_227 ("Mawile-GX", 227, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	GARCHOMP_GIRATINA_GX_228 ("Garchomp & Giratina-GX", 228, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
	DRAGONITE_GX_229 ("Dragonite-GX", 229, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _DRAGON_]),
	NAGANADEL_GX_230 ("Naganadel-GX", 230, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DRAGON_]),
	BLUE_S_TACTICS_231 ("Blue’s Tactics", 231, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	CHANNELER_232 ("Channeler", 232, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	COACH_TRAINER_233 ("Coach Trainer", 233, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	GRIMSLEY_234 ("Grimsley", 234, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	MISTY_S_FAVOR_235 ("Misty's Favor", 235, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	POKE_MANIAC_236 ("Poké Maniac", 236, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	ROWLET_ALOLAN_EXEGGUTOR_GX_237 ("Rowlet & Alolan Exeggutor-GX", 237, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _GRASS_]),
	HEATRAN_GX_238 ("Heatran-GX", 238, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	SLOWPOKE_PSYDUCK_GX_239 ("Slowpoke & Psyduck-GX", 239, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _WATER_]),
	KELDEO_GX_240 ("Keldeo-GX", 240, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	RAICHU_ALOLAN_RAICHU_GX_241 ("Raichu & Alolan Raichu-GX", 241, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _LIGHTNING_]),
	MEWTWO_MEW_GX_242 ("Mewtwo & Mew-GX", 242, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _PSYCHIC_]),
	LATIOS_GX_243 ("Latios-GX", 243, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	AERODACTYL_GX_244 ("Aerodactyl-GX", 244, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FIGHTING_]),
	MEGA_SABLEYE_TYRANITAR_GX_245 ("Mega Sableye & Tyranitar-GX", 245, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DARKNESS_]),
	MAWILE_GX_246 ("Mawile-GX", 246, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	GARCHOMP_GIRATINA_GX_247 ("Garchomp & Giratina-GX", 247, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _DRAGON_]),
	DRAGONITE_GX_248 ("Dragonite-GX", 248, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _DRAGON_]),
	NAGANADEL_GX_249 ("Naganadel-GX", 249, Rarity.SECRET, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _DRAGON_]),
	CHERISH_BALL_250 ("Cherish Ball", 250, Rarity.SECRET, [TRAINER, ITEM]),
	GIANT_BOMB_251 ("Giant Bomb", 251, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
	KARATE_BELT_252 ("Karate Belt", 252, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
	RESET_STAMP_253 ("Reset Stamp", 253, Rarity.SECRET, [TRAINER, ITEM]),
	TAG_SWITCH_254 ("Tag Switch", 254, Rarity.SECRET, [TRAINER, ITEM]),
	U_TURN_BOARD_255 ("U-Turn Board", 255, Rarity.SECRET, [TRAINER, ITEM, POKEMON_TOOL]),
	VIRIDIAN_FOREST_256 ("Viridian Forest", 256, Rarity.SECRET, [TRAINER, STADIUM]),
	RECYCLE_ENERGY_257 ("Recycle Energy", 257, Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]),
	WEAKNESS_GUARD_ENERGY_258 ("Weakness Guard Energy", 258, Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]),
;
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	UnifiedMinds(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.UNIFIED_MINDS;
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
			case ROWLET_ALOLAN_EXEGGUTOR_GX_1:
			return basic (this, hp:HP270, type:G, retreatCost:3) {
				weakness R
				move "Super Growth", {
					text " damage. Search your deck for a card that evolves from 1 of your [G] Pokémon and put it onto that Pokémon to evolve it. If that Pokémon is now a Stage 1 Pokémon, search your deck for a Stage 2 Pokémon that evolves from that Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck."
					energyCost 
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Calming Hurricane", {
					text "150 damage. Heal 30 damage from this Pokémon."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 150
					}
				}
				move "Tropical Hour GX", {
					text "200 damage. If this Pokémon has at least 3 extra Energy attached to it (in addition to this attack's cost), your opponent shuffles all Energy from all of their Pokémon into their deck. (You can't use more than 1 GX attack in a game.)"
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 200
					}
				}
				
			};
			case YANMA_2:
			return basic (this, hp:HP070, type:G, retreatCost:1) {
				weakness R
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Cutting Wind", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case YANMEGA_3:
			return evolution (this, from:"Yanma", hp:HP120, type:G, retreatCost:1) {
				weakness R
				move "Tackle", {
					text "50 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Air Slash", {
					text "100 damage. Discard an Energy from this Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case CELEBI_4:
			return basic (this, hp:HP080, type:G, retreatCost:1) {
				weakness R
				move "Time Spiral", {
					text " damage. Devolve 1 of your opponent's evolved Pokémon by removing the highest Stage Evolution card from it. Your opponent shuffles that card into their deck."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Mind Bend", {
					text "20 damage. Your opponent’s Active Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case SHROOMISH_5:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				move "Poison Powder", {
					text " damage. Your opponent's Active Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case SEWADDLE_6:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Multiply", {
					text " damage. Search your deck for up to 2 Sewaddle and put them onto your Bench. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case SEWADDLE_7:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				bwAbility "Swaddling Leaves", {
					text "This Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Surprise Attack", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case SWADLOON_8:
			return evolution (this, from:"Sewaddle", hp:HP070, type:G, retreatCost:2) {
				weakness R
				bwAbility "Swaddling Leaves", {
					text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Bug Bite", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case LEAVANNY_9:
			return evolution (this, from:"Swadloon", hp:HP120, type:G, retreatCost:1) {
				weakness R
				bwAbility "Blanket Weaver", {
					text "Your [G] Pokémon take 40 less damage from your opponent's attacks (after applying Weakness and Resistance). You can't apply more than 1 Blanket Weaver Ability at a time."
					actionA {
					}
				}
				move "Razor Leaf", {
					text "70 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case DWEBBLE_10:
			return basic (this, hp:HP070, type:G, retreatCost:2) {
				weakness R
				move "Dig Claws", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case CRUSTLE_11:
			return evolution (this, from:"Dwebble", hp:HP120, type:G, retreatCost:3) {
				weakness R
				bwAbility "Swaddling Leaves", {
					text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Fury Cutter", {
					text "50+ damage. Flip 3 coins. If 1 of them is heads, this attack does 40 more damage. If 2 of them are heads, this attack does 80 more damage. If all of them are heads, this attack does 150 more damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case KARRABLAST_12:
			return basic (this, hp:HP070, type:G, retreatCost:2) {
				weakness R
				move "Take Down", {
					text "20 damage. This Pokémon does 10 damage to itself."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case FOONGUS_13:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "Spore", {
					text " damage. Your opponent’s Active Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case AMOONGUSS_14:
			return evolution (this, from:"Foongus", hp:HP100, type:G, retreatCost:2) {
				weakness R
				bwAbility "Bursting Spores", {
					text "Whenever you play a Pokémon that has the Spore attack from your hand during your turn, you may leave your opponent's Active Pokémon Asleep and Poisoned."
					actionA {
					}
				}
				move "Venoshock", {
					text "20+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 70 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case FOMANTIS_15:
			return basic (this, hp:HP070, type:G, retreatCost:1) {
				weakness R
				move "Sweet Scent", {
					text " damage. Heal 30 damage from 1 of your Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Leafage", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case LURANTIS_16:
			return evolution (this, from:"Fomantis", hp:HP110, type:G, retreatCost:1) {
				weakness R
				move "Petal Blizzard", {
					text " damage. This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Sol Slice", {
					text "50+ damage. If this Pokémon has any [R] Energy attached to it, this attack does 50 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case BOUNSWEET_17:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				move "Splash", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Spinning Attack", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case STEENEE_18:
			return evolution (this, from:"Bounsweet", hp:HP090, type:G, retreatCost:2) {
				weakness R
				move "Double Slap", {
					text "30x damage. Flip 2 coins. This attack does 30 damage for each heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Leaf Step", {
					text "60 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case TSAREENA_19:
			return evolution (this, from:"Steenee", hp:HP140, type:G, retreatCost:2) {
				weakness R
				bwAbility "Queenly Reward", {
					text "Once during your turn (before your attack), you may attach a [G] Energy card from your discard pile to your Active Pokémon."
					actionA {
					}
				}
				move "High Jump Kick", {
					text "90 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case DHELMISE_20:
			return basic (this, hp:HP100, type:G, retreatCost:1) {
				weakness R
				move "Sea Creeper Net", {
					text " damage. Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Spinning Attack", {
					text "40 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case MAGMAR_21:
			return basic (this, hp:HP080, type:R, retreatCost:2) {
				weakness W
				move "Smoke Bomb", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack doesn’t happen."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case MAGMORTAR_22:
			return evolution (this, from:"Magmar", hp:HP130, type:R, retreatCost:3) {
				weakness W
				move "Smoke Bomb", {
					text "50 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack doesn’t happen."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Flamethrower", {
					text "120 damage. Discard an Energy from this Pokémon."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case NUMEL_23:
			return basic (this, hp:HP090, type:R, retreatCost:4) {
				weakness W
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Flamethrower", {
					text "80 damage. Discard an Energy from this Pokémon."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case CAMERUPT_24:
			return evolution (this, from:"Numel", hp:HP140, type:R, retreatCost:4) {
				weakness W
				move "Tackle", {
					text "50 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Strong Flare", {
					text "150 damage. Discard 2 Energy from this Pokémon."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
						damage 150
					}
				}
				
			};
			case HEATRAN_GX_25:
			return basic (this, hp:HP190, type:R, retreatCost:3) {
				weakness W
				bwAbility "Burning Road", {
					text "Once during your turn (before your attack), if this Pokémon was on the Bench and became your Active Pokémon this turn, you may move any number of [R] Energy attached to your Pokémon to this Pokémon."
					actionA {
					}
				}
				move "Steaming Stomp", {
					text "130 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 130
					}
				}
				move "Hot Burn GX", {
					text "50x damage. This attack does 50 damage times the amount of [R] Energy attached to this Pokémon. (You can't use more than 1 GX attack in a game.)"
					energyCost R
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case VICTINI_26:
			return basic (this, hp:HP070, type:R, retreatCost:1) {
				weakness W
				move "Victory Sign", {
					text " damage. Search your deck for up to 2 basic Energy cards of different types and attach them to your Pokémon in any way you like. Then, shuffle your deck."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Flare", {
					text "20 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case LITWICK_27:
			return basic (this, hp:HP060, type:R, retreatCost:1) {
				weakness W
				move "Find a Friend", {
					text " damage. Search your deck for a [R] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case LITWICK_28:
			return copy (LITWICK_27, this);
			case LAMPENT_29:
			return evolution (this, from:"Litwick", hp:HP080, type:R, retreatCost:1) {
				weakness W
				move "Fireworks", {
					text "40 damage. Discard an Energy from this Pokémon."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case CHANDELURE_30:
			return evolution (this, from:"Lampent", hp:HP140, type:R, retreatCost:2) {
				weakness W
				move "Spirit Burner", {
					text "10+ damage. Discard the top 5 cards of your deck. This attack does 60 more damage for each Pokémon you discarded in this way. Then, put any number of [R] Pokémon you discarded in this way onto your Bench."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case FLETCHINDER_31:
			return evolution (this, from:"Fletchling", hp:HP080, type:R, retreatCost:1) {
				weakness W
				move "Flame Charge", {
					text "20 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case TALONFLAME_32:
			return evolution (this, from:"Fletchinder", hp:HP130, type:R, retreatCost:0) {
				weakness W
				move "Heat Wave", {
					text "40 damage. Your opponent’s Active Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Flare Raid", {
					text "100 damage. Discard an Energy from this Pokémon. This attack does 50 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case SALANDIT_33:
			return basic (this, hp:HP070, type:R, retreatCost:1) {
				weakness W
				move "Live Coal", {
					text "10 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case SALAZZLE_34:
			return evolution (this, from:"Salandit", hp:HP100, type:R, retreatCost:1) {
				weakness W
				move "Fire Claws", {
					text "70 damage. "
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case SLOWPOKE_PSYDUCK_GX_35:
			return basic (this, hp:HP250, type:W, retreatCost:2) {
				weakness G
				move "Ditch and Splash", {
					text "40x damage. Discard any number of Supporter cards from your hand. This attack does 40 damage for each card you discarded in this way."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Thrilling Times GX", {
					text "10+ damage. Flip a coin. If heads, this attack does 100 more damage. If this Pokémon has at least 6 extra [W] Energy attached to it (in addition to this attack's cost), flip 10 coins instead, and this attack does 100 more damage for each heads. (You can't use more than 1 GX attack in a game.)"
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case LAPRAS_36:
			return basic (this, hp:HP110, type:W, retreatCost:1) {
				weakness G
				bwAbility "Mermaid’s Call", {
					text "Once during your turn (before your attack), you may put a Misty’s Favor card from your discard pile into your hand."
					actionA {
					}
				}
				move "Surf", {
					text "90 damage. "
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case SNORUNT_37:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness M
				move "Icicle", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case FROSLASS_38:
			return evolution (this, from:"Snorunt", hp:HP080, type:W, retreatCost:1) {
				weakness M
				move "Spiteful Sigh", {
					text "20x damage. Put up to 7 damage counters on this Pokémon. This attack does 20 damage for each damage counter you placed in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Icy Wind", {
					text "40 damage. Your opponent’s Active Pokémon is now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case FINNEON_39:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness G
				move "Gust", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case LUMINEON_40:
			return evolution (this, from:"Finneon", hp:HP090, type:W, retreatCost:0) {
				weakness G
				move "Neon Trickery", {
					text "50 damage. You may move an Energy from your opponent's Active Pokémon to 1 of their Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case SNOVER_41:
			return basic (this, hp:HP090, type:W, retreatCost:4) {
				weakness M
				move "Powder Snow", {
					text "10 damage. Your opponent’s Active Pokémon is now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case ABOMASNOW_42:
			return evolution (this, from:"Snover", hp:HP140, type:W, retreatCost:4) {
				weakness M
				move "Quick Freeze", {
					text "70 damage. If your opponent's Active Pokémon has any [W] Energy attached to it, it is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				move "Wild Tackle", {
					text "140 damage. This Pokémon does 20 damage to itself."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 140
					}
				}
				
			};
			case BASCULIN_43:
			return basic (this, hp:HP080, type:W, retreatCost:1) {
				weakness G
				move "Swarming Bites", {
					text " damage. This attack does 20 damage for each Basculin you have in play to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case TIRTOUGA_44:
			return evolution (this, from:"UnidentifiedFossil", hp:HP100, type:W, retreatCost:3) {
				weakness G
				move "Shell Attack", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Boulder Crush", {
					text "60 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case CARRACOSTA_45:
			return evolution (this, from:"Tirtouga", hp:HP160, type:W, retreatCost:3) {
				weakness G
				bwAbility "Ancient Custom", {
					text "Pokémon Tool cards attached to your opponent's Pokémon have no effect."
					actionA {
					}
				}
				move "Aqua Impact", {
					text "80+ damage. This attack does 20 more damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case CRYOGONAL_46:
			return basic (this, hp:HP090, type:W, retreatCost:1) {
				weakness M
				move "Frozen Lock", {
					text "10 damage. Your opponent can't play any Item cards from their hand during their next turn."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case KELDEO_GX_47:
			return basic (this, hp:HP170, type:W, retreatCost:2) {
				weakness G
				bwAbility "Pure Heart", {
					text "Prevent all effects of attacks, including damage, done to this Pokémon by your opponent's Pokémon-GX or Pokémon-EX."
					actionA {
					}
				}
				move "Sonic Edge", {
					text "110 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 110
					}
				}
				move "Resolute Blade GX", {
					text "50x damage. This attack does 50 damage for each of your opponent's Benched Pokémon. (You can't use more than 1 GX attack in a game.)"
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case DEWPIDER_48:
			return basic (this, hp:HP060, type:W, retreatCost:1) {
				weakness G
				move "Rain Splash", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Bite", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case ARAQUANID_49:
			return evolution (this, from:"Dewpider", hp:HP100, type:W, retreatCost:1) {
				weakness G
				move "Tangle Drag", {
					text " damage. Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Sticky Web", {
					text "80 damage. During your opponent's next turn, the Defending Pokémon's attacks cost [C] more, and its Retreat Cost is [C] more."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case WIMPOD_50:
			return basic (this, hp:HP070, type:W, retreatCost:1) {
				weakness G
				move "Sand Attack", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack doesn’t happen."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case GOLISOPOD_51:
			return evolution (this, from:"Wimpod", hp:HP140, type:W, retreatCost:4) {
				weakness G
				bwAbility "Emergency Exit", {
					text "If this Pokémon has 2 or fewer Energy attached to it, it has no Retreat Cost."
					actionA {
					}
				}
				move "First Impression", {
					text "120+ damage. If this Pokémon was on the Bench and became your Active Pokémon this turn, this attack does 60 more damage."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case PYUKUMUKU_52:
			return basic (this, hp:HP080, type:W, retreatCost:1) {
				weakness G
				move "Collect", {
					text " damage. Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Rain Splash", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case TAPU_FINI_53:
			return basic (this, hp:HP120, type:W, retreatCost:1) {
				weakness G
				move "Razor Fin", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Nature Wave", {
					text "100 damage. If your opponent has any Ultra Beasts in play, this attack can be used for [C]."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case RAICHU_ALOLAN_RAICHU_GX_54:
			return basic (this, hp:HP260, type:L, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Tandem Shock", {
					text "80+ damage. If this Pokémon was on the Bench and became your Active Pokémon this turn, this attack does 80 more damage, and your opponent's Active Pokémon is now Paralyzed."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				move "Lightning Ride GX", {
					text "150+ damage. Switch this Pokémon with 1 of your Benched Pokémon. If this Pokémon has at least 2 extra [L] Energy attached to it (in addition to this attack’s cost), this attack does 100 more damage. (You can’t use more than 1 GX attack in a game.)"
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 150
					}
				}
				
			};
			case PIKACHU_55:
			return basic (this, hp:HP060, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Meal Time", {
					text " damage. Flip a coin until you get tails. For each heads, draw a card."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Gnaw", {
					text "20 damage. "
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case PIKACHU_56:
			return basic (this, hp:HP070, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Tail Whap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Electric Ball", {
					text "50 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case ALOLAN_RAICHU_57:
			return evolution (this, from:"Pikachu", hp:HP110, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Electro Rain", {
					text " damage. Discard any amount of [L] Energy from this Pokémon. Then, for each Energy you discarded in this way, choose 1 of your opponent's Pokémon and do 30 damage to it. (You can choose the same Pokémon more than once.) This damage isn't affected by Weakness or Resistance."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Electric Ball", {
					text "90 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case MAGNEMITE_58:
			return basic (this, hp:HP060, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Supersonic", {
					text " damage. Your opponent’s Active Pokémon is now Confused."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case MAGNETON_59:
			return evolution (this, from:"Magnemite", hp:HP090, type:L, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Lightning Ball", {
					text "20 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Tri Attack", {
					text "40x damage. Flip 3 coins. This attack does 40 damage for each heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case MAGNEZONE_60:
			return evolution (this, from:"Magneton", hp:HP160, type:L, retreatCost:3) {
				weakness F
				resistance M, MINUS20
				bwAbility "Double Type", {
					text "As long as this Pokémon is in play, it is [L] and [M] type."
					actionA {
					}
				}
				move "Magnetic Bolt", {
					text "120 damage. Put a Trainer card from your discard pile into your hand."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case JOLTIK_61:
			return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Jolt", {
					text " damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case GALVANTULA_62:
			return evolution (this, from:"Joltik", hp:HP090, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Live Wire", {
					text " damage. This attack does 50 damage to 1 of your opponent's Pokémon. Also apply Weakness and Resistance for Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case TYNAMO_63:
			return basic (this, hp:HP030, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Wild River", {
					text " damage. Switch this Pokémon with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case TYNAMO_64:
			return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Generate Electricity", {
					text " damage. Search your deck for a [L] Energy card and attach it to this Pokémon. Then, shuffle your deck."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case EELEKTRIK_65:
			return evolution (this, from:"Tynamo", hp:HP090, type:L, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Overspark", {
					text "30x damage. Discard all [L] Energy from this Pokémon. This attack does 30 damage for each card you discarded in this way."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case EELEKTROSS_66:
			return evolution (this, from:"Eelektrik", hp:HP150, type:L, retreatCost:3) {
				weakness F
				resistance M, MINUS20
				bwAbility "Electric Swamp", {
					text "Play this Pokémon onto your Bench."
					actionA {
					}
				}
				move "Hover Over", {
					text "130 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost L, C, C, C
					attackRequirement {}
					onAttack {
						damage 130
					}
				}
				
			};
			case STUNFISK_67:
			return basic (this, hp:HP090, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Trap Bolt", {
					text "30+ damage. If, before doing damage, your opponent's Active Pokémon has more remaining HP than this Pokémon, this attack does 30 more damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case THUNDURUS_68:
			return basic (this, hp:HP120, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Thunderous Gale", {
					text "20+ damage. If Tornadus is on your Bench, this attack does 50 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Raging Thunder", {
					text "120 damage. This attack does 40 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case TAPU_KOKO_69:
			return basic (this, hp:HP120, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Electro Ball", {
					text "30 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Nature Dive", {
					text "100+ damage. If your opponent's Active Pokémon is an Ultra Beast, this attack does 100 more damage, and discard 2 Energy from this Pokémon."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case XURKITREE_70:
			return basic (this, hp:HP120, type:L, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Three Mirrors", {
					text "30+ damage. If your opponent has exactly 3 Prize cards remaining, this attack does 90 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Signal Beam", {
					text "50 damage. Your opponent’s Active Pokémon is now Confused."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case MEWTWO_MEW_GX_71:
			return basic (this, hp:HP270, type:P, retreatCost:2) {
				weakness P
				bwAbility "Perfection", {
					text "This Pokémon can use the attacks of any Pokémon-GX or Pokémon-EX on your Bench or in your discard pile. (You still need the necessary Energy to use each attack.)"
					actionA {
					}
				}
				move "Miraculous Duo GX", {
					text "200 damage. If this Pokémon has at least 1 extra Energy attached to it (in addition to this attack’s cost), heal all damage from all of your Pokémon. (You can’t use more than 1 GX attack in a game.)"
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 200
					}
				}
				
			};
			case ESPEON_DEOXYS_GX_72:
			return basic (this, hp:HP260, type:P, retreatCost:2) {
				weakness P
				move "Psychic Club", {
					text "10+ damage. This attack does 30 more damage for each of your Benched [P] Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Cross Division GX", {
					text " damage. Put 10 damage counters on your opponent's Pokémon in any way you like. If this Pokémon has at least 3 extra Energy attached to it (in addition to this attack's cost), put 20 damage counters on them instead. (You can’t use more than 1 GX attack in a game.)"
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case EXEGGCUTE_73:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Leech Seed", {
					text "10 damage. Heal 10 damage from this Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case EXEGGUTOR_74:
			return evolution (this, from:"Exeggcute", hp:HP140, type:P, retreatCost:3) {
				weakness P
				move "Mind Bend", {
					text "30 damage. Your opponent’s Active Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Full Clean", {
					text "180 damage. Discard your hand."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 180
					}
				}
				
			};
			case ALOLAN_MAROWAK_75:
			return evolution (this, from:"Cubone", hp:HP120, type:P, retreatCost:2) {
				weakness D
				resistance F, MINUS20
				move "Spirit Smash", {
					text " damage. Discard the top card of your opponent's deck. If the card you discarded is a Pokémon, this attack does damage equal to that Pokémon’s HP to your opponent's Active Pokémon."
					energyCost 
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Bone Beatdown", {
					text "60 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case JYNX_76:
			return basic (this, hp:HP080, type:P, retreatCost:1) {
				weakness P
				bwAbility "Ominous Posture", {
					text "Once during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to another of your Pokémon."
					actionA {
					}
				}
				move "Attract Smack", {
					text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case WYNAUT_77:
			return basic (this, hp:HP060, type:P, retreatCost:0) {
				bwAbility "Peppy Pick", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck. If you use this Ability, your turn ends."
					actionA {
					}
				}
				
			};
			case LATIOS_GX_78:
			return basic (this, hp:HP170, type:P, retreatCost:0) {
				weakness P
				bwAbility "Power Bind", {
					text "If you have 4 or fewer Pokémon in play, this Pokémon can't attack."
					actionA {
					}
				}
				move "Tag Purge", {
					text "120 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from TAG TEAM Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				move "Clear Vision GX", {
					text " damage. For the rest of this game, your opponent can't use any GX attacks. (You can't use more than 1 GX attack in a game.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case JIRACHI_GX_79:
			return basic (this, hp:HP160, type:P, retreatCost:1) {
				weakness P
				bwAbility "Psychic Zone", {
					text "Don't apply [P] Weakness when Pokémon (both yours and your opponent's) take damage from attacks."
					actionA {
					}
				}
				move "Star Search", {
					text " damage. Search your deck for an Energy card and attach it to 1 of your [P] Pokémon. Then, shuffle your deck."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Star Shield GX", {
					text "100 damage. Prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn. (You can’t use more than 1 GX attack in a game.)"
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case DRIFLOON_80:
			return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Ram", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DRIFBLIM_81:
			return evolution (this, from:"Drifloon", hp:HP100, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				bwAbility "Tag Transport", {
					text "Once during your turn (before your attack), you may switch your Active TAG TEAM Pokémon with 1 of your Benched Pokémon."
					actionA {
					}
				}
				move "Spinning Attack", {
					text "70 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case SKORUPI_82:
			return basic (this, hp:HP070, type:P, retreatCost:2) {
				weakness P
				move "Knock Off", {
					text " damage. Discard a random card from your opponent's hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Bug Bite", {
					text "40 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case UXIE_83:
			return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness P
				bwAbility "Secret Territory", {
					text "If you have Mesprit and Azelf in play, apply Weakness for each Pokémon (both yours and your opponent's) as ×4 instead."
					actionA {
					}
				}
				move "Psyshot", {
					text "30 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case MESPRIT_84:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness P
				move "First Contact", {
					text " damage. Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Mumble", {
					text "20 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case AZELF_85:
			return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Psypower", {
					text " damage. Put 3 damage counters on your opponent’s Pokémon in any way you like."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case GIRATINA_86:
			return basic (this, hp:HP130, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				bwAbility "Dimension Breach", {
					text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard a Special Energy from your opponent's Active Pokémon."
					actionA {
					}
				}
				move "Fade to Black", {
					text "70 damage. Your opponent’s Active Pokémon is now Confused."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case CRESSELIA_87:
			return basic (this, hp:HP130, type:P, retreatCost:2) {
				weakness P
				move "Aurora Gain", {
					text "60 damage. Heal 30 damage from this Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Luminous Blade", {
					text "130 damage. Discard a [P] Energy from this Pokémon."
					energyCost P, P, C, C
					attackRequirement {}
					onAttack {
						damage 130
					}
				}
				
			};
			case MUNNA_88:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness P
				move "Future Sight", {
					text " damage. Look at the top 4 cards of either player's deck and put them back in any order."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case MUSHARNA_89:
			return evolution (this, from:"Munna", hp:HP100, type:P, retreatCost:2) {
				weakness P
				move "Rest Well", {
					text " damage. Both Active Pokémon are now Asleep. During your next turn, this Pokémon's attacks do 100 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Zen Headbutt", {
					text "50 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case ELGYEM_90:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness P
				move "Psybeam", {
					text "10 damage. Your opponent’s Active Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case BEHEEYEM_91:
			return evolution (this, from:"Elgyem", hp:HP080, type:P, retreatCost:1) {
				weakness P
				move "Psypunch", {
					text "20 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Mysterious Noise", {
					text "90 damage. Shuffle this Pokémon and all cards attached to it into your deck. Your opponent can't play any Item cards from their hand during their next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case HONEDGE_92:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Lucky Find", {
					text " damage. Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Pierce", {
					text "20 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case HONEDGE_93:
			return basic (this, hp:HP070, type:P, retreatCost:3) {
				weakness D
				resistance F, MINUS20
				move "Slashing Cutter", {
					text "10 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DOUBLADE_94:
			return evolution (this, from:"Honedge", hp:HP090, type:P, retreatCost:3) {
				weakness D
				resistance F, MINUS20
				move "Slashing Cutter", {
					text "30 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case AEGISLASH_95:
			return evolution (this, from:"Doublade", hp:HP130, type:P, retreatCost:3) {
				weakness D
				resistance F, MINUS20
				bwAbility "Durable Blade", {
					text "If this Pokémon is Knocked Out by damage from an opponent's attack, put it into your hand instead of the discard pile. (Discard all cards attached to it.)"
					actionA {
					}
				}
				move "Trash Slash", {
					text "10x damage. This attack does 10 damage for each Item card in your discard pile. You can't do more than 130 damage in this way."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case MAREANIE_96:
			return basic (this, hp:HP070, type:P, retreatCost:2) {
				weakness P
				move "Peck", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case TOXAPEX_97:
			return evolution (this, from:"Mareanie", hp:HP110, type:P, retreatCost:2) {
				weakness P
				move "Spike Shot", {
					text "70 damage. "
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case SALANDIT_98:
			return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Suffocating Gas", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Gnaw", {
					text "30 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case SALAZZLE_99:
			return evolution (this, from:"Salandit", hp:HP110, type:P, retreatCost:1) {
				weakness P
				move "Smack", {
					text "40 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Slashing Claw", {
					text "90 damage. "
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case COSMOG_100:
			return basic (this, hp:HP040, type:P, retreatCost:0) {
				weakness P
				move "Splash", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case NECROZMA_101:
			return basic (this, hp:HP130, type:P, retreatCost:2) {
				weakness P
				move "Barrier Attack", {
					text "30 damage. During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Special Laser", {
					text "100+ damage. If this Pokémon has any Special Energy attached to it, this attack does 60 more damage."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case POIPOLE_102:
			return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Belt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Last Scene", {
					text "50+ damage. If each player has exactly 1 Prize card remaining, this attack does 130 more damage."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case ONIX_103:
			return basic (this, hp:HP110, type:F, retreatCost:4) {
				weakness G
				move "Bedrock Press", {
					text "20 damage. During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case STEELIX_104:
			return evolution (this, from:"Onix", hp:HP170, type:F, retreatCost:4) {
				weakness G
				move "Ground Stream", {
					text "20 damage. Attach 2 [F] Energy cards from your discard pile to this Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Gigaton Shake", {
					text "220 damage. During your next turn, your Pokémon can't attack. (This includes Pokémon that come into play on that turn.)"
					energyCost F, C, C, C, C
					attackRequirement {}
					onAttack {
						damage 220
					}
				}
				
			};
			case CUBONE_105:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness G
				move "Growl", {
					text " damage. During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Bonemerang", {
					text "20x damage. Flip 2 coins. This attack does 20 damage for each heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case AERODACTYL_GX_106:
			return evolution (this, from:"UnidentifiedFossil", hp:HP210, type:F, retreatCost:0) {
				weakness G
				bwAbility "Primal Winds", {
					text "As long as this Pokémon is your Active Pokémon, your opponent's Basic Pokémon's attacks cost [C] more."
					actionA {
					}
				}
				move "Boulder Crush", {
					text "120 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				move "Wild Dive GX", {
					text "50x damage. This attack does 50 damage times the amount of Energy attached to your opponent’s Active Pokémon. (You can’t use more than 1 GX attack in a game.)"
					energyCost F
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case HERACROSS_107:
			return basic (this, hp:HP100, type:F, retreatCost:1) {
				weakness P
				move "Turn the Tables", {
					text " damage. If 1 of your opponent's Pokémon used a GX attack during their last turn, your opponent shuffles their Active Pokémon and all cards attached to it into their deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Tackle", {
					text "70 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case BRELOOM_108:
			return evolution (this, from:"Shroomish", hp:HP120, type:F, retreatCost:2) {
				weakness P
				move "Spore", {
					text " damage. Your opponent’s Active Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Pre-Dawn Strike", {
					text "30+ damage. If your opponent’s Active Pokémon is Asleep, this attack does 90 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case MEDITITE_109:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness P
				move "Spirited Headbutt", {
					text "40 damage. This Pokémon can't use Spirited Headbutt during your next turn."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case MEDICHAM_110:
			return evolution (this, from:"Meditite", hp:HP110, type:F, retreatCost:1) {
				weakness P
				move "Pure Power", {
					text " damage. Put 4 damage counters on your opponent's Pokémon in any way you like."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Master Strike", {
					text "60+ damage. If this Pokémon has a Karate Belt card attached to it, this attack does 60 more damage."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case RELICANTH_111:
			return basic (this, hp:HP090, type:F, retreatCost:1) {
				weakness G
				move "Deep Sea Boring", {
					text " damage. Search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Water Pulse", {
					text "30 damage. Your opponent’s Active Pokémon is now Asleep."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case GIBLE_112:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness G
				move "Stampede", {
					text "10 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Headbutt Bounce", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case GABITE_113:
			return evolution (this, from:"Gible", hp:HP090, type:F, retreatCost:1) {
				weakness G
				move "Corkscrew Punch", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Sharp Scythe", {
					text "40 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case GARCHOMP_114:
			return evolution (this, from:"Gabite", hp:HP150, type:F, retreatCost:0) {
				weakness G
				bwAbility "Avenging Aura", {
					text "If you have more Prize cards remaining than your opponent, this Pokémon's attacks do 80 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Over Slice", {
					text "80+ damage. You may discard an Energy from this Pokémon. If you do, this attack does 40 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case RIOLU_115:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness P
				move "Kick", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case RIOLU_116:
			return copy (RIOLU_115, this);
			case LUCARIO_117:
			return evolution (this, from:"Riolu", hp:HP120, type:F, retreatCost:2) {
				weakness P
				bwAbility "Tag Coach", {
					text "Your TAG TEAM Pokémon take 20 less damage from your opponent's attacks (after applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Mach Cross", {
					text "90 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case DRILBUR_118:
			return basic (this, hp:HP070, type:F, retreatCost:2) {
				weakness G
				move "Dig Claws", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case EXCADRILL_119:
			return evolution (this, from:"Drilbur", hp:HP120, type:F, retreatCost:2) {
				weakness G
				move "Rototiller", {
					text " damage. Shuffle 4 cards from your discard pile into your deck."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Slash", {
					text "90 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case ARCHEN_120:
			return evolution (this, from:"UnidentifiedFossil", hp:HP080, type:F, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Endeavor", {
					text "20+ damage. Flip 2 coins. This attack does 20 more damage for each heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case ARCHEOPS_121:
			return evolution (this, from:"Archen", hp:HP130, type:F, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "U-turn", {
					text "40 damage. Switch this Pokémon with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Hyper Beam", {
					text "80 damage. Discard an Energy from your opponent’s Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case TERRAKION_122:
			return basic (this, hp:HP140, type:F, retreatCost:4) {
				weakness G
				move "Cavern Counter", {
					text "50+ damage. If all of your Benched Pokémon have at least 1 damage counter on them, this attack does 150 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Boulder Crush", {
					text "110 damage. "
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 110
					}
				}
				
			};
			case MELOETTA_123:
			return basic (this, hp:HP090, type:F, retreatCost:1) {
				weakness P
				move "Tag Cheer", {
					text " damage. Attach an Energy card from your hand to 1 of your TAG TEAM Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Shooting Star Pirouette", {
					text "30+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case ZYGARDE_124:
			return basic (this, hp:HP090, type:F, retreatCost:1) {
				weakness G
				bwAbility "Cellular Companions", {
					text "As long as this Pokémon is on your Bench, your Zygarde's and Zygarde-GX's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
					actionA {
					}
				}
				move "Boost Fang", {
					text "20 damage. Attach a [F] Energy card from your discard pile to 1 of your Benched Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case UMBREON_DARKRAI_GX_125:
			return basic (this, hp:HP270, type:D, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				move "Black Lance", {
					text "150 damage. This attack does 60 damage to 1 of your opponent’s Benched Pokémon-GX or Benched Pokémon-EX. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 150
					}
				}
				move "Dark Moon GX", {
					text " damage. Your opponent can’t play any Trainer cards from their hand during their next turn. If this Pokémon has at least 5 extra [D] Energy attached to it (in addition to this attack’s cost), your opponent's Active Pokémon is Knocked Out. (You can’t use more than 1 GX attack in a game.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case MEGA_SABLEYE_TYRANITAR_GX_126:
			return basic (this, hp:HP280, type:D, retreatCost:4) {
				weakness F
				resistance P, MINUS20
				move "Greedy Crush", {
					text "210 damage. If your opponent's Pokémon-GX or Pokémon-EX is Knocked Out by damage from this attack, take 1 more Prize card."
					energyCost D, D, D, D, C
					attackRequirement {}
					onAttack {
						damage 210
					}
				}
				move "Gigafall GX", {
					text "250 damage. If this Pokémon has at least 5 extra Energy attached to it (in addition to this attack's cost), discard the top 15 cards of your opponent's deck. (You can't use more than 1 GX attack in a game.)"
					energyCost D, D, D, D, C
					attackRequirement {}
					onAttack {
						damage 250
					}
				}
				
			};
			case ALOLAN_GRIMER_127:
			return basic (this, hp:HP080, type:D, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				move "Collect", {
					text " damage. Draw 2 cards."
					energyCost 
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Sludge Bomb", {
					text "30 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case MURKROW_128:
			return basic (this, hp:HP070, type:D, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Astonish", {
					text " damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case MURKROW_129:
			return basic (this, hp:HP070, type:D, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Peck", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case HONCHKROW_130:
			return evolution (this, from:"Murkrow", hp:HP110, type:D, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Sharpshooting", {
					text " damage. This attack does 30 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Dark Cutter", {
					text "60 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case SNEASEL_131:
			return basic (this, hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Slash", {
					text "30 damage. "
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case WEAVILE_GX_132:
			return evolution (this, from:"Sneasel", hp:HP200, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				bwAbility "Shadow Connection", {
					text "As often as you like during your turn (before your attack), you may move a basic [D] Energy from 1 of your Pokémon to another of your Pokémon."
					actionA {
					}
				}
				move "Claw Slash", {
					text "130 damage. "
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 130
					}
				}
				move "Nocturnal Maneuvers GX", {
					text " damage. Search your deck for any number of Basic Pokémon and put them onto your Bench. Then, shuffle your deck. (You can’t use more than 1 GX attack in a game.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case SABLEYE_133:
			return basic (this, hp:HP080, type:D, retreatCost:1) {
				move "Mirror Gem", {
					text "10 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if it is Knocked Out), put 8 damage counters on the Attacking Pokémon."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DRAPION_134:
			return evolution (this, from:"Skorupi", hp:HP140, type:D, retreatCost:4) {
				weakness F
				resistance P, MINUS20
				move "Cross Poison", {
					text "50x damage. Flip 4 coins. This attack does 50 damage for each heads. If at least 2 of them are heads, your opponent's Active Pokémon is now Poisoned."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Slicing Blade", {
					text "120 damage. "
					energyCost D, D, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case PURRLOIN_135:
			return basic (this, hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Cleaning Up", {
					text " damage. Discard a Pokémon Tool card from 1 of your opponent's Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case LIEPARD_136:
			return evolution (this, from:"Purrloin", hp:HP100, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Scratch", {
					text "40 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Shadow Scratch", {
					text "90 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case SCRAGGY_137:
			return basic (this, hp:HP070, type:D, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				move "Swagger", {
					text " damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Whap Down", {
					text "50 damage. "
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case SCRAFTY_138:
			return evolution (this, from:"Scraggy", hp:HP110, type:D, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				move "Turf Raid", {
					text "20+ damage. This attack does 20 more damage for each of your remaining Prize cards."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Headbang", {
					text "70 damage. "
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case YVELTAL_139:
			return basic (this, hp:HP130, type:D, retreatCost:2) {
				weakness L
				resistance F, MINUS20
				move "Blow Through", {
					text "20+ damage. If there is any Stadium card in play, this attack does 20 more damage."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Shadow Impact", {
					text "120 damage. Put 3 damage counters on 1 of your Pokémon."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case HOOPA_140:
			return basic (this, hp:HP130, type:D, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				move "Evil Admonition", {
					text "10+ damage. This attack does 20 more damage for each of your opponent's Pokémon that has an Ability."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Mind Shock", {
					text "80 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case MAWILE_GX_141:
			return basic (this, hp:HP170, type:M, retreatCost:1) {
				weakness R
				resistance P, MINUS20
				bwAbility "Captivating Wink", {
					text "When you play this Pokémon from your hand onto your Bench during your turn, you may have your opponent reveal their hand and put any number of Basic Pokémon you find there onto their Bench."
					actionA {
					}
				}
				move "Wily Bite", {
					text "10+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Big Eater GX", {
					text " damage. Your opponent reveals their hand. Discard all Supporter cards you find there. (You can't use more than 1 GX attack in a game.)"
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case ESCAVALIER_142:
			return evolution (this, from:"Karrablast", hp:HP130, type:M, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Discerning Spear", {
					text "80 damage. If your opponent's Active Pokémon has no damage counters on it before this attack does damage, this attack does nothing."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				move "Iron Lance", {
					text "90 damage. "
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case COTTONEE_143:
			return basic (this, hp:HP060, type:Y, retreatCost:1) {
				weakness M
				resistance D, MINUS20
				move "Dust Gathering", {
					text " damage. Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case WHIMSICOTT_144:
			return evolution (this, from:"Cottonee", hp:HP080, type:Y, retreatCost:0) {
				weakness M
				resistance D, MINUS20
				bwAbility "Prowl", {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for a card and put it into your hand. Then, shuffle your deck."
					actionA {
					}
				}
				move "Gust", {
					text "40 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case DEDENNE_145:
			return basic (this, hp:HP070, type:Y, retreatCost:1) {
				weakness M
				resistance D, MINUS20
				move "Return", {
					text "20 damage. You may draw cards until you have 6 cards in your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case GARCHOMP_GIRATINA_GX_146:
			return basic (this, hp:HP270, type:N, retreatCost:3) {
				weakness Y
				move "Linear Attack", {
					text " damage. This attack does 40 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Calamitous Slash", {
					text "160+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 80 more damage."
					energyCost F, P, C
					attackRequirement {}
					onAttack {
						damage 160
					}
				}
				move "GG End GX", {
					text " damage. Discard 1 of your opponent's Pokémon and all cards attached to it. If this Pokémon has at least 3 extra [F] Energy attached to it (in addition to this attack’s cost), discard 2 of your opponent's Pokémon instead. (You can’t use more than 1 GX attack in a game.)"
					energyCost F, P, P
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case DRATINI_147:
			return basic (this, hp:HP060, type:N, retreatCost:2) {
				weakness Y
				move "Agility", {
					text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DRATINI_148:
			return basic (this, hp:HP060, type:N, retreatCost:2) {
				weakness Y
				bwAbility "Aqua Lift", {
					text "If this Pokémon has any [W] Energy attached to it, it has no Retreat Cost."
					actionA {
					}
				}
				move "Jump On", {
					text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DRAGONAIR_149:
			return evolution (this, from:"Dratini", hp:HP090, type:N, retreatCost:2) {
				weakness Y
				move "Twister", {
					text "30 damage. Flip 2 coins. For each heads, discard an Energy from your opponent's Active Pokémon. If both of them are tails, this attack does nothing."
					energyCost L, W
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case DRAGONAIR_150:
			return evolution (this, from:"Dratini", hp:HP100, type:N, retreatCost:2) {
				weakness Y
				move "Tail Whap", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Destructive Whirlpool", {
					text "70 damage. Discard an Energy from your opponent’s Active Pokémon."
					energyCost L, W, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case DRAGONITE_151:
			return evolution (this, from:"Dragonair", hp:HP160, type:N, retreatCost:2) {
				weakness Y
				bwAbility "Hurricane Charge", {
					text "Once during your turn (before your attack), you may attach a [W] Energy card, a [L] Energy card, or 1 of each from your hand to your Pokémon in any way you like."
					actionA {
					}
				}
				move "Dragon Impact", {
					text "170 damage. Discard 3 Energy from this Pokémon."
					energyCost L, W, C, C
					attackRequirement {}
					onAttack {
						damage 170
					}
				}
				
			};
			case DRAGONITE_GX_152:
			return evolution (this, from:"Dragonair", hp:HP250, type:N, retreatCost:2) {
				weakness Y
				move "Dragon Claw", {
					text "130 damage. "
					energyCost L, W, C
					attackRequirement {}
					onAttack {
						damage 130
					}
				}
				move "Sky Judgment", {
					text "270 damage. Discard 3 Energy from this Pokémon."
					energyCost C, C, C, C, C
					attackRequirement {}
					onAttack {
						damage 270
					}
				}
				move "Mach Delivery GX", {
					text " damage. You may discard any number of cards from your hand until you have 9 or fewer. Draw cards until you have 10 cards in your hand. (You can't use more than 1 GX attack in a game.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case LATIAS_153:
			return basic (this, hp:HP120, type:N, retreatCost:1) {
				weakness Y
				move "Energy Arrow", {
					text " damage. This attack does 20 damage times the amount of Energy attached to 1 of your opponent's Pokémon to that Pokémon. This damage isn't affected by Weakness or Resistance."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Speed Wing", {
					text "100 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case AXEW_154:
			return basic (this, hp:HP060, type:N, retreatCost:1) {
				weakness Y
				bwAbility "Unnerve", {
					text "Whenever your opponent plays an Item or Supporter card from their hand, prevent all effects of that card done to this Pokémon."
					actionA {
					}
				}
				move "Gnaw", {
					text "20 damage. "
					energyCost R, M
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case FRAXURE_155:
			return evolution (this, from:"Axew", hp:HP090, type:N, retreatCost:2) {
				weakness Y
				move "Guard Press", {
					text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Guillotine", {
					text "70 damage. "
					energyCost R, M, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case HAXORUS_156:
			return evolution (this, from:"Fraxure", hp:HP150, type:N, retreatCost:3) {
				weakness Y
				bwAbility "Grind Up", {
					text "Once during your turn (before your attack), you may discard any Stadium card in play. If you do, attach up to 3 in any combination of [R] and [M] Energy cards from your hand to this Pokémon."
					actionA {
					}
				}
				move "Powerful Axe", {
					text "10+ damage. This attack does 40 more damage times the amount of basic Energy attached to this Pokémon."
					energyCost R, M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case DRUDDIGON_157:
			return basic (this, hp:HP120, type:N, retreatCost:2) {
				weakness Y
				move "Drag Off", {
					text " damage. Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 30 damage to the new Active Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Dragon Tail", {
					text "100x damage. Flip 2 coins. This attack does 100 damage for each heads."
					energyCost R, W, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case NOIBAT_158:
			return basic (this, hp:HP060, type:N, retreatCost:1) {
				weakness Y
				move "Air Slash", {
					text "50 damage. Discard an Energy from this Pokémon."
					energyCost D, P
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case NOIVERN_159:
			return evolution (this, from:"Noibat", hp:HP120, type:N, retreatCost:0) {
				weakness Y
				move "Boomburst", {
					text " damage. This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Dragon Pulse", {
					text "120 damage. Discard the top card of your deck."
					energyCost D, P, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case NAGANADEL_GX_160:
			return evolution (this, from:"Poipole", hp:HP210, type:N, retreatCost:1) {
				weakness Y
				bwAbility "Ultra Conversion", {
					text "Once during your turn (before your attack), you may discard an Ultra Beast card from your hand. If you do, draw 3 cards."
					actionA {
					}
				}
				move "Venom Shot", {
					text " damage. Discard 2 Energy from this Pokémon. This attack does 170 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P, C, C, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Injection GX", {
					text " damage. Add a card from your opponent's discard pile to their Prize cards face down. (You can't use more than 1 GX attack in a game.)"
					energyCost L
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case LICKITUNG_161:
			return basic (this, hp:HP100, type:C, retreatCost:4) {
				weakness F
				move "Heavy Draw", {
					text " damage. Draw a card for each of your Pokémon in play that has a Retreat Cost of exactly 4."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Tongue Slap", {
					text "40 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case LICKILICKY_162:
			return evolution (this, from:"Lickitung", hp:HP130, type:C, retreatCost:4) {
				weakness F
				move "Rollout", {
					text "40 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Licks Go Crazy", {
					text "90 damage. Discard a random card from your opponent's hand, discard the top card of your opponent's deck, and discard an Energy from your opponent’s Active Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case KANGASKHAN_163:
			return basic (this, hp:HP130, type:C, retreatCost:2) {
				weakness F
				move "Double Draw", {
					text " damage. Draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Tag Impact", {
					text "50x damage. This attack does 50 damage for each of your TAG TEAM Pokémon in play."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				
			};
			case TAUROS_164:
			return basic (this, hp:HP110, type:C, retreatCost:1) {
				weakness F
				move "Call for Family", {
					text " damage. Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Berserker Tackle", {
					text "60 damage. This Pokémon does 10 damage to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case HOOTHOOT_165:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Air Slash", {
					text "30 damage. Discard an Energy from this Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case NOCTOWL_166:
			return evolution (this, from:"Hoothoot", hp:HP090, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Blindside", {
					text " damage. This attack does 60 damage to 1 of your opponent's Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Slashing Claw", {
					text "60 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case SLAKOTH_167:
			return basic (this, hp:HP050, type:C, retreatCost:2) {
				weakness F
				move "Lazy Howl", {
					text " damage. During your opponent's next turn, if they attach an Energy card from their hand to the Defending Pokémon, their turn ends."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Hang Down", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case SLAKOTH_168:
			return basic (this, hp:HP070, type:C, retreatCost:3) {
				weakness F
				move "Scratch", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Boundless Power", {
					text "60 damage. This Pokémon can’t attack during your next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case VIGOROTH_169:
			return evolution (this, from:"Slakoth", hp:HP090, type:C, retreatCost:1) {
				weakness F
				move "Roar", {
					text " damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Slash", {
					text "70 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
				
			};
			case SLAKING_170:
			return evolution (this, from:"Vigoroth", hp:HP180, type:C, retreatCost:4) {
				weakness F
				bwAbility "Counterattack", {
					text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), put 2 damage counters on the Attacking Pokémon."
					actionA {
					}
				}
				move "Dynamic Swing", {
					text "100+ damage. You may do 100 more damage. If you do, during your opponent's next turn, this Pokémon takes 100 more damage from attacks (after applying Weakness and Resistance)."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
				
			};
			case BIDOOF_171:
			return basic (this, hp:HP070, type:C, retreatCost:2) {
				weakness F
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Hyper Fang", {
					text "60 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case BIBAREL_172:
			return evolution (this, from:"Bidoof", hp:HP120, type:C, retreatCost:2) {
				weakness F
				bwAbility "Unaware", {
					text "Prevent all effects of your opponent's attacks, except damage, done to this Pokémon."
					actionA {
					}
				}
				move "Amnesia", {
					text "60 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case MUNCHLAX_173:
			return basic (this, hp:HP060, type:C, retreatCost:0) {
				bwAbility "Snack Search", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, put a card from your discard pile on top of your deck. If you use this Ability, your turn ends."
					actionA {
					}
				}
				
			};
			case PIDOVE_174:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Glide", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Flap", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				
			};
			case TRANQUILL_175:
			return evolution (this, from:"Pidove", hp:HP080, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Glide", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Air Slash", {
					text "40 damage. Discard an Energy from this Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case UNFEZANT_176:
			return evolution (this, from:"Tranquill", hp:HP140, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Gust", {
					text "40 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Downburst", {
					text "90 damage. You may have each player shuffle all cards attached to their Active Pokémon into their deck."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case AUDINO_177:
			return basic (this, hp:HP090, type:C, retreatCost:1) {
				weakness F
				bwAbility "Hearing", {
					text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, you may draw a card."
					actionA {
					}
				}
				move "Drain Slap", {
					text "30 damage. Heal 30 damage from this Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case TORNADUS_178:
			return basic (this, hp:HP120, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Knuckle Punch", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Thunderous Tornado", {
					text "80 damage. If Thundurus is on your Bench, this attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case FLETCHLING_179:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Flap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				
			};
			case YUNGOOS_180:
			return basic (this, hp:HP070, type:C, retreatCost:1) {
				weakness F
				move "Cavernous Chomp", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case GUMSHOOS_181:
			return evolution (this, from:"Yungoos", hp:HP100, type:C, retreatCost:1) {
				weakness F
				move "Alert Headbutt", {
					text "90 damage. If your opponent's Active Pokémon is a Pokémon-GX or Pokémon-EX, this attack's base damage is 30."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case ORANGURU_182:
			return basic (this, hp:HP120, type:C, retreatCost:3) {
				weakness F
				move "Sage’s Riddle", {
					text " damage. Put a Pokémon from your hand face down in front of you. Your opponent guesses the type of that Pokémon, and then you reveal it. If your opponent guessed right, they draw 4 cards. If they guessed wrong, you draw 4 cards. Return the Pokémon to your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				move "Gentle Slap", {
					text "80 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case TYPE_NULL_183:
			return basic (this, hp:HP100, type:C, retreatCost:1) {
				weakness F
				move "Smash Kick", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Quick Blow", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case SILVALLY_184:
			return evolution (this, from:"TypeNull", hp:HP130, type:C, retreatCost:2) {
				weakness F
				move "Avenging Heart", {
					text "30+ damage. This attack does 50 more damage for each Prize card your opponent took on their last turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Air Slash", {
					text "120 damage. Discard an Energy from this Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 120
					}
				}
				
			};
			case KOMALA_185:
			return basic (this, hp:HP090, type:C, retreatCost:1) {
				weakness F
				bwAbility "Drowsing", {
					text "If this Pokémon remains Asleep between turns, put 6 damage counters on your opponent's Active Pokémon."
					actionA {
					}
				}
				move "Snooze", {
					text " damage. This Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 
					}
				}
				
			};
			case BLAINE_S_QUIZ_SHOW_186:
			return supporter (this) {
				text "Put a Pokémon from your hand face down in front of you and tell your opponent the name of an attack it has. Your opponent guesses the name of that Pokémon, and then you reveal it. If your opponent guessed right, they draw 4 cards. If they guessed wrong, you draw 4 cards. Return the Pokémon to your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case BLIZZARD_TOWN_187:
			return stadium (this) {
				text "Pokémon with 40 HP or less remaining (both yours and your opponent's) can't attack."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case BLUE_S_TACTICS_188:
			return supporter (this) {
				text "At the end of this turn, draw cards until you have 8 cards in your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case BUG_CATCHER_189:
			return supporter (this) {
				text "Draw 2 cards. Flip a coin. If heads, draw 2 more cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case CHANNELER_190:
			return supporter (this) {
				text "Remove all effects of attacks on you and each of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case CHERISH_BALL_191:
			return itemCard (this) {
				text "Search your deck for a Pokémon-GX, reveal it, and put it into your hand. Then, shuffle your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case COACH_TRAINER_192:
			return supporter (this) {
				text "Draw 2 cards. If your Active Pokémon is a TAG TEAM Pokémon, draw 2 more cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARK_CITY_193:
			return stadium (this) {
				text "Basic [D] Pokémon in play (both yours and your opponent's) have no Retreat Cost."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case EAR_RINGING_BELL_194:
			return pokemonTool (this) {
				text "If the Pokémon this card is attached to is your Active Pokémon and is damaged by an opponent's attack (even if that Pokémon is Knocked Out), the Attacking Pokémon is now Confused."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case FLYINIUM_Z_AIR_SLASH_195:
			return pokemonTool (this) {
				text "If the Pokémon this card is attached to has the Air Slash attack, it can use the GX attack on this card. (You still need the necessary Energy to use this attack.)" +
					"[C][C][C][C] Speeding Skystrike GX 180" +
					"Prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn. (You can't use more than 1 GX attack in a game.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case GIANT_BOMB_196:
			return pokemonTool (this) {
				text "If this card is attached to 1 of your Pokémon, discard it at the end of your opponent's turn." +
					"If the Pokémon this card is attached to is your Active Pokémon and takes 180 or more damage from an opponent's attack (even if this Pokémon is Knocked Out), put 10 damage counters on the Attacking Pokémon."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case GIANT_HEARTH_197:
			return stadium (this) {
				text "Once during each player’s turn, that player may discard a card from their hand. If they do, that player searches their deck for up to 2 [R] Energy cards, reveals them, and puts them into their hand. Then, that player shuffles their deck."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case GREAT_POTION_198:
			return itemCard (this) {
				text "Heal 50 damage from your Active Pokémon-GX."
				onPlay {
				}
				playRequirement{
				}
			};
			case GRIMSLEY_199:
			return supporter (this) {
				text "Move up to 3 damage counters from 1 of your opponent's Pokémon to another of their Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case HAPU_200:
			return supporter (this) {
				text "Look at the top 6 cards of your deck and put 2 of them into your hand. Discard the other cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case KARATE_BELT_201:
			return pokemonTool (this) {
				text "If you have more Prize cards remaining than your opponent, the attacks of the Pokémon this card is attached to cost Fighting less."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case MISTY_S_FAVOR_202:
			return supporter (this) {
				text "Search your deck for up to 3 Supporter cards, reveal them, and put them into your hand. Then, shuffle your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case NORMALIUM_Z_TACKLE_203:
			return pokemonTool (this) {
				text "If the Pokémon this card is attached to has the Tackle attack, it can use the GX attack on this card. (You still need the necessary Energy to use this attack.)" +
					"[C][C][C][C] Barreling Blitz GX 200+" +
					"Flip a coin until you get tails. This attack does 40 more damage for each heads. (You can't use more than 1 GX attack in a game.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case POKE_MANIAC_204:
			return supporter (this) {
				text "Search your deck for up to 3 Pokémon that have a Retreat Cost of exactly 4, reveal them, and put them into your hand. Then, shuffle your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_RESEARCH_LAB_205:
			return stadium (this) {
				text "Once during each player’s turn, that player may search their deck for up to 2 Pokémon that evolve from Unidentified Fossil, put those Pokémon onto their Bench, and shuffle their deck. If a player searches their deck in this way, their turn ends."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case RESET_STAMP_206:
			return itemCard (this) {
				text "Your opponent shuffles their hand into their deck and draws a card for each of their remaining Prize cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case SLUMBERING_FOREST_207:
			return stadium (this) {
				text "If a Pokémon is Asleep, its owner flips 2 coins instead of 1 for that Special Condition between turns. If either of them is tails, that Pokémon is still Asleep."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case STADIUM_NAV_208:
			return itemCard (this) {
				text "Flip 2 coins. For each heads, search your deck for a Stadium card, reveal it, and put it into your hand. Then, shuffle your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case TAG_SWITCH_209:
			return itemCard (this) {
				text "Move up to 2 Energy from 1 of your TAG TEAM Pokémon to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case UNIDENTIFIED_FOSSIL_210:
			return itemCard (this) {
				text "Play this card as if it were a 60-HP [C] Basic Pokémon. At any time during your turn (before your attack), you may discard this card from play." +
					"This card can't retreat."
				onPlay {
				}
				playRequirement{
				}
			};
			case U_TURN_BOARD_211:
			return pokemonTool (this) {
				text "The Retreat Cost of the Pokémon this card is attached to is [C] less." +
					"If this card is discarded from play, put it into your hand instead of the discard pile."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case RECYCLE_ENERGY_212:
			return specialEnergy (this, [[C]]) {
				text "This card provides [C] Energy." +
					"If this card is discarded from play, put it into your hand instead of the discard pile."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case WEAKNESS_GUARD_ENERGY_213:
			return specialEnergy (this, [[C]]) {
				text "This card provides [C] Energy." +
					"The Pokémon this card is attached to has no Weakness."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case ROWLET_ALOLAN_EXEGGUTOR_GX_214:
			return copy (ROWLET_ALOLAN_EXEGGUTOR_GX_1, this);
			case ROWLET_ALOLAN_EXEGGUTOR_GX_215:
			return copy (ROWLET_ALOLAN_EXEGGUTOR_GX_1, this);
			case HEATRAN_GX_216:
			return copy (HEATRAN_GX_25, this);
			case SLOWPOKE_PSYDUCK_GX_217:
			return copy (SLOWPOKE_PSYDUCK_GX_35, this);
			case SLOWPOKE_PSYDUCK_GX_218:
			return copy (SLOWPOKE_PSYDUCK_GX_35, this);
			case KELDEO_GX_219:
			return copy (KELDEO_GX_47, this);
			case RAICHU_ALOLAN_RAICHU_GX_220:
			return copy (RAICHU_ALOLAN_RAICHU_GX_54, this);
			case RAICHU_ALOLAN_RAICHU_GX_221:
			return copy (RAICHU_ALOLAN_RAICHU_GX_54, this);
			case MEWTWO_MEW_GX_222:
			return copy (MEWTWO_MEW_GX_71, this);
			case LATIOS_GX_223:
			return copy (LATIOS_GX_78, this);
			case AERODACTYL_GX_224:
			return copy (AERODACTYL_GX_106, this);
			case MEGA_SABLEYE_TYRANITAR_GX_225:
			return copy (MEGA_SABLEYE_TYRANITAR_GX_126, this);
			case MEGA_SABLEYE_TYRANITAR_GX_226:
			return copy (MEGA_SABLEYE_TYRANITAR_GX_126, this);
			case MAWILE_GX_227:
			return copy (MAWILE_GX_141, this);
			case GARCHOMP_GIRATINA_GX_228:
			return copy (GARCHOMP_GIRATINA_GX_146, this);
			case DRAGONITE_GX_229:
			return copy (DRAGONITE_GX_152, this);
			case NAGANADEL_GX_230:
			return copy (NAGANADEL_GX_160, this);
			case BLUE_S_TACTICS_231:
			return copy (BLUE_S_TACTICS_188, this);
			case CHANNELER_232:
			return copy (CHANNELER_190, this);
			case COACH_TRAINER_233:
			return copy (COACH_TRAINER_192, this);
			case GRIMSLEY_234:
			return copy (GRIMSLEY_199, this);
			case MISTY_S_FAVOR_235:
			return copy (MISTY_S_FAVOR_202, this);
			case POKE_MANIAC_236:
			return copy (POKE_MANIAC_204, this);
			case ROWLET_ALOLAN_EXEGGUTOR_GX_237:
			return copy (ROWLET_ALOLAN_EXEGGUTOR_GX_1, this);
			case HEATRAN_GX_238:
			return copy (HEATRAN_GX_25, this);
			case SLOWPOKE_PSYDUCK_GX_239:
			return copy (SLOWPOKE_PSYDUCK_GX_35, this);
			case KELDEO_GX_240:
			return copy (KELDEO_GX_47, this);
			case RAICHU_ALOLAN_RAICHU_GX_241:
			return copy (RAICHU_ALOLAN_RAICHU_GX_54, this);
			case MEWTWO_MEW_GX_242:
			return copy (MEWTWO_MEW_GX_71, this);
			case LATIOS_GX_243:
			return copy (LATIOS_GX_78, this);
			case AERODACTYL_GX_244:
			return copy (AERODACTYL_GX_106, this);
			case MEGA_SABLEYE_TYRANITAR_GX_245:
			return copy (MEGA_SABLEYE_TYRANITAR_GX_126, this);
			case MAWILE_GX_246:
			return copy (MAWILE_GX_141, this);
			case GARCHOMP_GIRATINA_GX_247:
			return copy (GARCHOMP_GIRATINA_GX_146, this);
			case DRAGONITE_GX_248:
			return copy (DRAGONITE_GX_152, this);
			case NAGANADEL_GX_249:
			return copy (NAGANADEL_GX_160, this);
			case CHERISH_BALL_250:
			return copy (CHERISH_BALL_191, this);
			case GIANT_BOMB_251:
			return copy (GIANT_BOMB_196, this);
			case KARATE_BELT_252:
			return copy (KARATE_BELT_201, this);
			case RESET_STAMP_253:
			return copy (RESET_STAMP_206, this);
			case TAG_SWITCH_254:
			return copy (TAG_SWITCH_209, this);
			case U_TURN_BOARD_255:
			return copy (U_TURN_BOARD_211, this);
			case VIRIDIAN_FOREST_256:
			return stadium (this) {
				text "Once during each player’s turn, that player may discard a card from their hand. If they do, that player searches their deck for a basic Energy card, reveals it, and puts it into their hand. Then, that player shuffles their deck."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case RECYCLE_ENERGY_257:
			return copy (RECYCLE_ENERGY_212, this);
			case WEAKNESS_GUARD_ENERGY_258:
			return copy (WEAKNESS_GUARD_ENERGY_213, this);
				default:
			return null;
		}
	}
	
}