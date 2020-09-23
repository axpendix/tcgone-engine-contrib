package tcgwars.logic.impl.pokemod

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
public enum PokemodAquapolis implements LogicCardInfo {
    
  AMPHAROS_1 ("Ampharos", "1", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ARCANINE_2 ("Arcanine", "2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ARIADOS_3 ("Ariados", "3", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  AZUMARILL_4 ("Azumarill", "4", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BELLOSSOM_5 ("Bellossom", "5", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BLISSEY_6 ("Blissey", "6", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DONPHAN_7 ("Donphan", "7", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ELECTRODE_8 ("Electrode", "8", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ELEKID_9 ("Elekid", "9", Rarity.RARE, [POKEMON, BABY, BASIC, _LIGHTNING_, BASIC]),
  ENTEI_10 ("Entei", "10", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  ESPEON_11 ("Espeon", "11", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  EXEGGUTOR_12 ("Exeggutor", "12", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  EXEGGUTOR_13 ("Exeggutor", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HOUNDOOM_14 ("Houndoom", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  HOUNDOOM_15 ("Houndoom", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HYPNO_16 ("Hypno", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  JUMPLUFF_17 ("Jumpluff", "17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  JYNX_18 ("Jynx", "18", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  KINGDRA_19 ("Kingdra", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LANTURN_20 ("Lanturn", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LANTURN_21 ("Lanturn", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNETON_22 ("Magneton", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MUK_23 ("Muk", "23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDOKING_24 ("Nidoking", "24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  NINETALES_25 ("Ninetales", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  OCTILLERY_26 ("Octillery", "26", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PARASECT_27 ("Parasect", "27", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PORYGON2_28 ("Porygon2", "28", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PRIMEAPE_29 ("Primeape", "29", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  QUAGSIRE_30 ("Quagsire", "30", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RAPIDASH_31 ("Rapidash", "31", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SCIZOR_32 ("Scizor", "32", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SLOWBRO_33 ("Slowbro", "33", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SLOWKING_34 ("Slowking", "34", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  STEELIX_35 ("Steelix", "35", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SUDOWOODO_36 ("Sudowoodo", "36", Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  SUICUNE_37 ("Suicune", "37", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  TENTACRUEL_38 ("Tentacruel", "38", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TOGETIC_39 ("Togetic", "39", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TYRANITAR_40 ("Tyranitar", "40", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  UMBREON_41 ("Umbreon", "41", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VICTREEBEL_42 ("Victreebel", "42", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VILEPLUME_43 ("Vileplume", "43", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ZAPDOS_44 ("Zapdos", "44", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  BELLSPROUT_45 ("Bellsprout", "45", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  DODRIO_46 ("Dodrio", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  FLAAFFY_47 ("Flaaffy", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  FURRET_48 ("Furret", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GLOOM_49 ("Gloom", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GOLDUCK_50 ("Golduck", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GROWLITHE_51 ("Growlithe", "51", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  MAGNEMITE_52 ("Magnemite", "52", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  MARILL_53 ("Marill", "53", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MAROWAK_54 ("Marowak", "54", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  NIDORINO_55 ("Nidorino", "55", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PUPITAR_56 ("Pupitar", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SCYTHER_57 ("Scyther", "57", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SEADRA_58 ("Seadra", "58", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEAKING_59 ("Seaking", "59", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SKIPLOOM_60 ("Skiploom", "60", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SMOOCHUM_61 ("Smoochum", "61", Rarity.UNCOMMON, [POKEMON, BABY, BASIC, _PSYCHIC_, BASIC]),
  SPINARAK_62 ("Spinarak", "62", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  TYROGUE_63 ("Tyrogue", "63", Rarity.UNCOMMON, [POKEMON, BABY, BASIC, _FIGHTING_, BASIC]),
  VOLTORB_64 ("Voltorb", "64", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  WEEPINBELL_65 ("Weepinbell", "65", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  WOOPER_66 ("Wooper", "66", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  AIPOM_67 ("Aipom", "67", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BELLSPROUT_68 ("Bellsprout", "68", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHANSEY_69 ("Chansey", "69", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHINCHOU_70 ("Chinchou", "70", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CHINCHOU_71 ("Chinchou", "71", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CUBONE_72 ("Cubone", "72", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DODUO_73 ("Doduo", "73", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DROWZEE_74 ("Drowzee", "74", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EEVEE_75 ("Eevee", "75", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EXEGGCUTE_76 ("Exeggcute", "76", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  EXEGGCUTE_77 ("Exeggcute", "77", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLDEEN_78 ("Goldeen", "78", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GRIMER_79 ("Grimer", "79", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GROWLITHE_80 ("Growlithe", "80", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  HITMONCHAN_81 ("Hitmonchan", "81", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HITMONTOP_82 ("Hitmontop", "82", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HOPPIP_83 ("Hoppip", "83", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HORSEA_84 ("Horsea", "84", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  HORSEA_85 ("Horsea", "85", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  HOUNDOUR_86 ("Houndour", "86", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  HOUNDOUR_87 ("Houndour", "87", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  KANGASKHAN_88 ("Kangaskhan", "88", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LARVITAR_89 ("Larvitar", "89", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LICKITUNG_90 ("Lickitung", "90", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MAGNEMITE_91 ("Magnemite", "91", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MANKEY_92 ("Mankey", "92", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAREEP_93 ("Mareep", "93", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MILTANK_94 ("Miltank", "94", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MR__MIME_95 ("Mr. Mime", "95", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  NIDORAN_MALE_96 ("Nidoran♂", "96", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ODDISH_97 ("Oddish", "97", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ONIX_98 ("Onix", "98", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PARAS_99 ("Paras", "99", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PHANPY_100 ("Phanpy", "100", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PINSIR_101 ("Pinsir", "101", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PONYTA_102 ("Ponyta", "102", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  PORYGON_103 ("Porygon", "103", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PSYDUCK_104 ("Psyduck", "104", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  REMORAID_105 ("Remoraid", "105", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SCYTHER_106 ("Scyther", "106", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SENTRET_107 ("Sentret", "107", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SLOWPOKE_108 ("Slowpoke", "108", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SMEARGLE_109 ("Smeargle", "109", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNEASEL_110 ("Sneasel", "110", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SPINARAK_111 ("Spinarak", "111", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TANGELA_112 ("Tangela", "112", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TENTACOOL_113 ("Tentacool", "113", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOGEPI_114 ("Togepi", "114", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  VOLTORB_115 ("Voltorb", "115", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  VULPIX_116 ("Vulpix", "116", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  WOOPER_117 ("Wooper", "117", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  APRICORN_FOREST_118 ("Apricorn Forest", "118", Rarity.RARE, [TRAINER, STADIUM]),
  DARKNESS_CUBE_01_119 ("Darkness Cube 01", "119", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  ENERGY_SWITCH_120 ("Energy Switch", "120", Rarity.UNCOMMON, [TRAINER]),
  FIGHTING_CUBE_01_121 ("Fighting Cube 01", "121", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  FIRE_CUBE_01_122 ("Fire Cube 01", "122", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  FOREST_GUARDIAN_123 ("Forest Guardian", "123", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GRASS_CUBE_01_124 ("Grass Cube 01", "124", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  DESERT_RUINS_125 ("Desert Ruins", "125", Rarity.RARE, [TRAINER, STADIUM]),
  JUGGLER_126 ("Juggler", "126", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LIGHTNING_CUBE_01_127 ("Lightning Cube 01", "127", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MEMORY_BERRY_128 ("Memory Berry", "128", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  METAL_CUBE_01_129 ("Metal Cube 01", "129", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  POKEMON_FAN_CLUB_130 ("Pokémon Fan Club", "130", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_PARK_131 ("Pokémon Park", "131", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PSYCHIC_CUBE_01_132 ("Psychic Cube 01", "132", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  SEER_133 ("Seer", "133", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HEALING_FIELDS_134 ("Healing Fields", "134", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TIME_SHARD_135 ("Time Shard", "135", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  TOWN_VOLUNTEERS_136 ("Town Volunteers", "136", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TRAVELING_SALESMAN_137 ("Traveling Salesman", "137", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  UNDERSEA_RUINS_138 ("Undersea Ruins", "138", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  POWER_PLANT_139 ("Power Plant", "139", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  WATER_CUBE_01_140 ("Water Cube 01", "140", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  WEAKNESS_GUARD_141 ("Weakness Guard", "141", Rarity.UNCOMMON, [TRAINER]),
  DARKNESS_ENERGY_142 ("Darkness Energy", "142", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_143 ("Metal Energy", "143", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  RAINBOW_ENERGY_144 ("Rainbow Energy", "144", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BOOST_ENERGY_145 ("Boost Energy", "145", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  CRYSTAL_ENERGY_146 ("Crystal Energy", "146", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  WARP_ENERGY_147 ("Warp Energy", "147", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  KINGDRA_148 ("Kingdra", "148", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  LUGIA_149 ("Lugia", "149", Rarity.SECRET, [POKEMON, BASIC, _COLORLESS_]),
  NIDOKING_150 ("Nidoking", "150", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  BOOST_ENERGY_151 ("Boost Energy", "151", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]),
  CRYSTAL_ENERGY_152 ("Crystal Energy", "152", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]),
  WARP_ENERGY_153 ("Warp Energy", "153", Rarity.SECRET, [ENERGY, SPECIAL_ENERGY]),
  BLEND_ENERGY_GRPD_154 ("Blend Energy GRPD", "154", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BLEND_ENERGY_WLFM_155 ("Blend Energy WLFM", "155", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  KABUTOPS_156 ("Kabutops", "156", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SNEASEL_157 ("Sneasel", "157", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  AMPHAROS_158 ("Ampharos", "158", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ARCANINE_159 ("Arcanine", "159", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ARIADOS_160 ("Ariados", "160", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  AZUMARILL_161 ("Azumarill", "161", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BELLOSSOM_162 ("Bellossom", "162", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BLISSEY_163 ("Blissey", "163", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ELECTRODE_164 ("Electrode", "164", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ENTEI_165 ("Entei", "165", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  ESPEON_166 ("Espeon", "166", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  EXEGGUTOR_167 ("Exeggutor", "167", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HOUNDOOM_168 ("Houndoom", "168", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HYPNO_169 ("Hypno", "169", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  JUMPLUFF_170 ("Jumpluff", "170", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  KINGDRA_171 ("Kingdra", "171", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LANTURN_172 ("Lanturn", "172", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNETON_173 ("Magneton", "173", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MUK_174 ("Muk", "174", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDOKING_175 ("Nidoking", "175", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  NINETALES_176 ("Ninetales", "176", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  OCTILLERY_177 ("Octillery", "177", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SCIZOR_178 ("Scizor", "178", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SLOWKING_179 ("Slowking", "179", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  STEELIX_180 ("Steelix", "180", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SUDOWOODO_181 ("Sudowoodo", "181", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  SUICUNE_182 ("Suicune", "182", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  TENTACRUEL_183 ("Tentacruel", "183", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TOGETIC_184 ("Togetic", "184", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TYRANITAR_185 ("Tyranitar", "185", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  UMBREON_186 ("Umbreon", "186", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VICTREEBEL_187 ("Victreebel", "187", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VILEPLUME_188 ("Vileplume", "188", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ZAPDOS_189 ("Zapdos", "189", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  DONPHAN_190 ("Donphan", "190", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RAIKOU_EX_191 ("Raikou ex", "191", Rarity.HOLORARE, [POKEMON, BASIC, EX, _LIGHTNING_]),
  ENTEI_EX_192 ("Entei ex", "192", Rarity.HOLORARE, [POKEMON, BASIC, EX, _FIRE_]),
  SUICUNE_EX_193 ("Suicune ex", "193", Rarity.HOLORARE, [POKEMON, BASIC, EX, _WATER_]),
  KABUTOPS_EX_194 ("Kabutops ex", "194", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, EX, _WATER_]),
  RAICHU_EX_195 ("Raichu ex", "195", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, EX, _LIGHTNING_]),
  AERODACTYL_EX_196 ("Aerodactyl ex", "196", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, EX, _COLORLESS_]),
  TYPHLOSION_EX_197 ("Typhlosion ex", "197", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, EX, _FIRE_]),
  MACHAMP_EX_198 ("Machamp ex", "198", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, EX, _FIGHTING_]);
    
  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
  
  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodAquapolis(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_AQUAPOLIS;
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
      case AMPHAROS_1:
      return evolution (this, from:"Flaaffy", hp:HP100, type:L, retreatCost:2) {
        weakness F
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Reflect Energy", {
          text "50 damage. If you have any Benched Pokémon and if there are any basic Energy cards attached to Ampharos, take 1 of those Energy cards and attach it to 1 of those Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ARCANINE_2:
      return evolution (this, from:"Growlithe", hp:HP090, type:R, retreatCost:3) {
        weakness W
        pokeBody "Extreme Speed", {
          text "You pay [C] less to retreat Arcanine for each Energy attached to it."
          delayedA {
          }
        }
        move "Fire Blow", {
          text "30+ damage. You may discard any number of [R] Energy cards attached to Arcanine when you use this attack. If you do, flip a number of coins equal to the number of [R] Energy cards you discarded. This attack does 30 damage plus 20 more damage for each heads."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARIADOS_3:
      return evolution (this, from:"Spinarak", hp:HP070, type:G, retreatCost:0) {
        weakness R
        pokeBody "Gluey Slime", {
          text "As long as Ariados is in play, each player must pay an additional [C] to retreat his or her Active Pokémon. Gluey Slime can't make a player pay more than an additional [C] to retreat a Pokémon, even if there is more than 1 Ariados in play."
          delayedA {
          }
        }
        move "Spider Force", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage. If tails, this attack does 20 damage and the Defending Pokémon is now Paralyzed."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case AZUMARILL_4:
      return evolution (this, from:"Marill", hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokePower "Bubble Turn", {
          text "Once during your turn (before your attack), if Azumarill is on your bench, you may flip a coin. If heads, return Azumarill and all cards attached to it to your hand."
          actionA {
          }
        }
        move "Aqua Sonic", {
          text "40 damage. Don't apply Resistance."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BELLOSSOM_5:
      return evolution (this, from:"Gloom", hp:HP090, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        pokePower "Flower Supplement", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, attach 1 basic Energy card from your hand to 1 of your Benched Pokémon. This power can't be used if Bellossom is affected by a Special Condition."
          actionA {
          }
        }
        move "Knife Leaf", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BLISSEY_6:
      return evolution (this, from:"Chansey", hp:HP120, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        pokePower "Happy Healing", {
          text "Once during your turn (before your attack), choose 1 of your Benched Pokémon (excluding Pokémon ex) and flip a coin. If heads, count the number of Energy attached to Blissey and then remove that many damage counters from the chosen Benched Pokémon. This power can't be used if Blissey is affected by a Special Condition."
          actionA {
          }
        }
        move "Smash Bomber", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DONPHAN_7:
      return evolution (this, from:"Phanpy", hp:HP080, type:F, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Earthquake", {
          text "30 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Double Stab", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ELECTRODE_8:
      return evolution (this, from:"Voltorb", hp:HP070, type:L, retreatCost:1) {
        weakness F
        pokePower "Super Dynamo", {
          text "Once during your turn (before your attack), if Electrode is your Active Pokémon, you may flip a coin. If heads, choose a [L] Energy card from your discard pile and attach it to 1 of your Pokémon. This power can't be used if Electrode is affected by a Special Condition."
          actionA {
          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ELEKID_9:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:L, retreatCost:0) {
        move "Energy Kick", {
          text "Flip a coin. If heads, choose an Energy card attached to the Defending Pokémon. Your opponent moves that card to 1 of his or her other Pokémon. (If your opponent has no Benched Pokémon, this attack does nothing.)"
          energyCost L
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case ENTEI_10:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokeBody "Pure Body", {
          text "To attach a [R] Energy card from your hand to Entei, you must discard an Energy card attached to Entei. (Attach the [R] Energy, and then discard an Energy from Entei.)"
          delayedA {
          }
        }
        move "Burning Fang", {
          text "30 damage. You may flip a coin. If heads, discard a [R] Energy card attached to Entei and the Defending Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ESPEON_11:
      return evolution (this, from:"Eevee", hp:HP080, type:P, retreatCost:0) {
        weakness P
        pokePower "Energy Return", {
          text "You may just once during your turn (before your attack), choose an Energy card attached to 1 of your Pokémon and return it to your hand. This power can't be used if Espeon is affected by a Special Condition."
          actionA {
          }
        }
        move "Damage Blast", {
          text "30+ damage. Flip a number of coins equal to the number of damage counters on the Defending Pokémon. This attack does 30 damage plus 10 more damage for each heads."
          energyCost P, P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case EXEGGUTOR_12:
      return evolution (this, from:"Exeggcute", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Super Eggsplosion", {
          text "20x damage. Discard any number of Energy cards attached to any of your Pokémon. Flip a number of coins equal to the number of Energy cards discarded this way. This attack does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Called Shot", {
          text "10 damage. Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage times the amount of [G] Energy attached to Exeggutor. (Don't apply Weakness or Resistance for Benched Pokémon.)"
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EXEGGUTOR_13:
      return evolution (this, from:"Exeggcute", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Big Eggsplosion", {
          text "20x damage. Flip a number of coins equal to the amount of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lateral Eggsplosion", {
          text "30+ damage. Flip a number of coins equal to the amount of Energy attached to all of your Benched Pokémon. This attack does 30 damage plus 10 more damage for each heads."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HOUNDOOM_14:
      return evolution (this, from:"Houndour", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Burn Up", {
          text "60 damage. Flip a coin. If tails, discard all [R] Energy cards attached to Houndoom."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case HOUNDOOM_15:
      return evolution (this, from:"Houndour", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Fireworks", {
          text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Houndoom."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Dark Impact", {
          text "40 damage. The Defending Pokémon can't use any Poké-Powers until the end of your opponent's next turn."
          energyCost D, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case HYPNO_16:
      return evolution (this, from:"Drowzee", hp:HP080, type:P, retreatCost:1) {
        weakness P
        pokePower "Sleep Pendulum", {
          text "Once during your turn (before your attack), if Hypno is your Active Pokémon, you may make the Defending Pokémon Asleep. This power can't be used if Hypno is affected by a Special Condition."
          actionA {
          }
        }
        move "Spiral Aura", {
          text "30 damage. If the Defending Pokémon isn't Knocked Out by the damage from this attack, you may choose 1 of your opponent's Benched Pokémon and switch the Defending Pokémon with it."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case JUMPLUFF_17:
      return evolution (this, from:"Skiploom", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance W, MINUS30
        pokeBody "Fluff", {
          text "During your opponent's turn, if Jumpluff would be damaged or affected by an opponent's attack and it already has at least 1 damage counter on it, flip a coin. If heads, prevent all effects of that attack (including damage)."
          delayedA {
          }
        }
        move "Cotton Punch", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case JYNX_18:
      return basic (this, hp:HP060, type:P, retreatCost:2) {
        weakness P
        move "Meditate", {
          text "10+ damage. This attack does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KINGDRA_19:
      return evolution (this, from:"Seadra", hp:HP120, type:W, retreatCost:3) {
        weakness L
        pokePower "Water Cyclone", {
          text "As often as you like during your turn (before your attack), you may move a [W] Energy card from your Active Pokémon to 1 of your Benched Pokémon. This power can't be used if Kingdra is affected by a Special Condition."
          actionA {
          }
        }
        move "Rapids", {
          text "50 damage. Flip a coin. If heads, discard 1 Energy card attached to the Defending Pokémon, if any."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LANTURN_20:
      return evolution (this, from:"Chinchou", hp:HP080, type:W, retreatCost:1) {
        weakness G
        move "Lightning Ball", {
          text "20 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Conduction", {
          text "30+ damage. Discard all [L] Energy cards attached to Lanturn. Flip a number of coins equal to the number of [L] Energy cards you discarded. This attack does 30 damage plus 10 more damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LANTURN_21:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:1) {
        weakness F
        pokePower "Ion Coating", {
          text "You may use this power once during each of your turns (before your attack). All [W] Energy attached to your Active Pokémon becomes [L] Energy for the rest of the turn. (This effect ends if your Active Pokémon retreats or is returned to your hand.) This power can't be used if Lanturn is affected by a Special Condition."
          actionA {
          }
        }
        move "Electric Tackle", {
          text "20+ damage. This attack does 20 damage plus 10 damage for each [L] Energy attached to Lanturn. Flip a coin. If tails. Lanturn does 10 damage to itself for each [L] Energy attached to it."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGNETON_22:
      return evolution (this, from:"Magnemite", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokePower "Magnetic Flow", {
          text "Once during your turn (before your attack), if Magneton is your Active Pokémon, you may flip a coin. If heads, choose 2 of your opponent's Pokémon that have Energy cards attached to them. Choose 1 of the Energy cards attached to each of those Pokémon and switch them between the Pokémon. This power can't be used if Magneton is affected by a Special Condition."
          actionA {
          }
        }
        move "Steel Wave", {
          text "30 damage. This attack does 10 damage to each of your opponent's Benched Pokémon that are the same type (color) as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MUK_23:
      return evolution (this, from:"Grimer", hp:HP070, type:G, retreatCost:2) {
        weakness P
        pokeBody "Toxic Gas", {
          text "As long as this Pokémon has any Energy cards attached to it, ignore all Poké-Powers and Poké-Bodies other than Toxic Gases. This power can''t be used if Muk is affected by a Special Condition."
          delayedA {
          }
        }
        move "Sludge", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case NIDOKING_24:
      return evolution (this, from:"Nidorino", hp:HP110, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        pokePower "Earth Rage", {
          text "Once during your turn (before your attack), if Nidoking is your Active Pokémon, you may flip a coin. If heads, put a damage counter on each of your opponent's Benched Pokémon. This power can't be used if Nidoking is affected by a Special Condition."
          actionA {
          }
        }
        move "Giant Horn", {
          text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NINETALES_25:
      return evolution (this, from:"Vulpix", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Miracle Tail", {
          text "10 damage. Flip a coin. If heads, choose a Special Condition (Asleep, Burned, Confused, Paralyzed, or Poisoned). The Defending Pokémon is now affected by that Special Condition."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Roasting Heat", {
          text "40+ damage. If the Defending Pokémon is Burned, this attack does 40 damage plus 10 more damage."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case OCTILLERY_26:
      return evolution (this, from:"Remoraid", hp:HP080, type:W, retreatCost:2) {
        weakness L
        pokeBody "Suction Cups", {
          text "As long as Octillery is your Active Pokémon, whenever the Defending Pokémon retreats, discard all Energy cards attached to the Defending Pokémon when it goes to the Bench."
          delayedA {
          }
        }
        move "Smokescreen", {
          text "20 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PARASECT_27:
      return evolution (this, from:"Paras", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Sleep Inducer", {
          text "Choose 1 of your opponent's Benched Pokémon and switch the Defending Pokémon with it. The new Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Rapture Pollen", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, remove 2 damage counters from Parasect."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PORYGON2_28:
      return evolution (this, from:"Porygon", hp:HP070, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Backup", {
          text "Once during each of your turns (before your attack), if you have 2 or fewer cards in your hand, you may draw cards from your deck until you have 3 cards in your hand. This power can't be used if Porygon2 is affected by a Special Condition."
          actionA {
          }
        }
        move "Hypnotic Ray", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PRIMEAPE_29:
      return evolution (this, from:"Mankey", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Karate Chop", {
          text "40- damage. Damage from this attack is reduced by 10 for each damage counter on Primeape."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Sudden Charge", {
          text "40 damage. Primeape does 10 damage to itself. Then, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case QUAGSIRE_30:
      return evolution (this, from:"Wooper", hp:HP080, type:W, retreatCost:2) {
        weakness G
        move "Water Gun", {
          text "20+ damage. This attack does 20 damage plus 10 more damage for each [W] Energy attached to Quagsire but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Slam", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAPIDASH_31:
      return evolution (this, from:"Ponyta", hp:HP070, type:R, retreatCost:0) {
        weakness W
        move "Agility", {
          text "10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Rapidash."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Gallop", {
          text "30+ damage. Flip a coin. If heads, discard a [R] Energy card attached to Rapidash and this attack does 30 damage plus 20 more damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SCIZOR_32:
      return evolution (this, from:"Scyther", hp:HP080, type:M, retreatCost:2) {
        weakness R
        pokeBody "Poison Resistance", {
          text "Scizor can't be Poisoned."
          delayedA {
          }
        }
        move "Snatch", {
          text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon with no damage counters on it and switch the Defending Pokémon with it."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Heavy Metal", {
          text "30+ damage. Flip a number of coins equal to the amount of [M] Energy attached to Scizor. This attack does 30 damage plus 10 more damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SLOWBRO_33:
      return evolution (this, from:"Slowpoke", hp:HP080, type:W, retreatCost:2) {
        weakness L
        pokeBody "Dense Body", {
          text "Any damage done to Slowbro by attacks from Basic Pokémon (excluding Baby Pokémon) is reduced by 20."
          delayedA {
          }
        }
        move "Energy Cannon", {
          text "30+ damage. This attack does 30 damage plus 10 damage for each Energy attached to Slowbro but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SLOWKING_34:
      return evolution (this, from:"Slowpoke", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Bursting Hand", {
          text "10x damage. Look at your opponent's hand. This attack does 10 damage times the number of Energy cards there."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Shuffle Attack", {
          text "40 damage. Look at a number of cards on top of your opponent's deck equal to the number of Energy cards attached to the Defending Pokémon. Put those cards in any order, and then put them back on top of your opponent's deck."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case STEELIX_35:
      return evolution (this, from:"Onix", hp:HP100, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Earth Rift", {
          text "10 damage. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness or Resistance for Benched Pokémon.) Then, flip a coin. If tails, this attack can't be used during your next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Iron Smash", {
          text "50+ damage. Flip 2 coins. If both are heads, this attack does 50 damage plus 20 more damage. If both are tails, this attack does nothing. If 1 is heads and 1 is tails, this attack just does 50 damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SUDOWOODO_36:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness W
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Sudowoodo doesn't have the Energy necessary to use that attack. (You must still do anything else required in order to use that attack.)"
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Energy Draw", {
          text "Search your deck for a basic Energy card and attach it to Sudowoodo. Shuffle your deck afterward."
          energyCost F
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case SUICUNE_37:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Pure Body", {
          text "To attach a [W] Energy card from your hand to Suicune, you must discard an Energy card attached to Suicune. (Attach the [W] Energy, and then discard an Energy card from Suicune.)"
          delayedA {
          }
        }
        move "Hypno Wave", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage and the Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TENTACRUEL_38:
      return evolution (this, from:"Tentacool", hp:HP070, type:W, retreatCost:0) {
        weakness L
        pokePower "Strange Tentacles", {
          text "Once during your turn (before your attack), as long as the number of Energy cards attached to the Defending Pokémon is less than the number of Energy cards attached to your Active Pokémon, you may choose an Energy card, if any, in your opponent's discard pile and attach it to the Defending Pokémon. This power can't be used if Tentacruel is affected by a Special Condition."
          actionA {
          }
        }
        move "Poison Sting", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOGETIC_39:
      return evolution (this, from:"Togepi", hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        pokePower "Miracle Shift", {
          text "Once during your turn (before your attack), discard a basic Energy card attached to 1 of your Pokémon. Then, choose a basic Energy card from your discard pile and attach it to that Pokémon. This power can't be used if Togetic is affected by a Special Condition."
          actionA {
          }
        }
        move "Mini-Metronome", {
          text "Flip a coin. If heads, choose 1 of the Defending Pokémon's attacks. Mini-Metronome copies that attack except for its Energy cost. (You must still do anything else required in order to use that attack.) (No matter what type the Defending Pokémon is, Togetic is still [C].) Togetic performs that attack."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case TYRANITAR_40:
      return evolution (this, from:"Pupitar", hp:HP120, type:D, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Destructive Roar", {
          text "Flip a coin. If heads, discard 1 Energy card attached to 1 of your opponent's Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Tail Slap", {
          text "30 damage. "
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Gigacrush", {
          text "60 damage. Each player discards the top 3 cards from his or her deck."
          energyCost D, D, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case UMBREON_41:
      return evolution (this, from:"Eevee", hp:HP080, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Dark Moon", {
          text "As long as Umbreon is your Active Pokémon and has a [D] Energy attached to it, once during your turn (before your attack), you may look at your opponent's hand. Choose from it a number of cards up to the number of [D] Energy attached to Umbreon and shuffle them into your opponent's deck. Your opponent then draws the same number of cards from his or her deck. This power can't be used if Umbreon is affected by a Special Condition."
          actionA {
          }
        }
        move "Shadow Bind", {
          text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VICTREEBEL_42:
      return evolution (this, from:"Weepinbell", hp:HP090, type:G, retreatCost:2) {
        weakness R
        pokePower "Fragrance Trap", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, choose 1 of your opponent's Benched Pokémon and switch the Defending Pokémon with it. This power can't be used if Victreebel is affected by a Special Condition."
          actionA {
          }
        }
        move "Corrosive Acid", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VILEPLUME_43:
      return evolution (this, from:"Gloom", hp:HP100, type:G, retreatCost:2) {
        weakness R
        move "Poison Scent", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned and Confused. If tails, the Defending Pokémon is now Poisoned and Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Addictive Pollen", {
          text "40 damage. Flip a coin. If heads, your opponent can't play Supporter cards during his or her next turn."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ZAPDOS_44:
      return basic (this, hp:HP080, type:L, retreatCost:2) {
        pokeBody "Anti-Lightning", {
          text "You can't attach [L] Energy cards from your hand to Zapdos."
          delayedA {
          }
        }
        move "Plasma", {
          text "10 damage. If there are any [L] Energy cards in your discard pile, flip a coin. If heads, attach 2 of them to Zapdos."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Lightning Storm", {
          text "60 damage. Flip a coin. If tails, put 4 damage counters on Zapdos."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case BELLSPROUT_45:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Blot", {
          text "20 damage. Remove 1 damage counter from Bellsprout."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DODRIO_46:
      return evolution (this, from:"Doduo", hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Tri Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Peck Attack", {
          text "Flip 2 coins. If 1 of them is heads, this attack does 20 damage. If both are heads, this attack does 50 damage. If both are tails, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case FLAAFFY_47:
      return evolution (this, from:"Mareep", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Spark", {
          text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FURRET_48:
      return evolution (this, from:"Sentret", hp:HP070, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Scavenger Hunt", {
          text "Once during your turn (before your attack), you may put 2 cards from your hand into your deck. Then, search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Furret is affected by a Special Condition."
          actionA {
          }
        }
        move "Spinning Attack", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GLOOM_49:
      return evolution (this, from:"Oddish", hp:HP070, type:G, retreatCost:2) {
        weakness R
        pokeBody "Enervating Pollen", {
          text "As long as Gloom is in play, Resistance on each player's Active Pokémon only reduces damage by 10."
          delayedA {
          }
        }
        move "Sleep Sap", {
          text "20 damage. Both the Defending Pokémon and Gloom are now Asleep (after doing damage)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLDUCK_50:
      return evolution (this, from:"Psyduck", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Slash", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Distortion Beam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Confused."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GROWLITHE_51:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Growlithe."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MAGNEMITE_52:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Attract", {
          text "Choose 1 of your opponent's Benched Pokémon and switch the Defending Pokémon with it."
          energyCost M
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MARILL_53:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sleepy Ball", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAROWAK_54:
      return evolution (this, from:"Cubone", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Triple Bone", {
          text "Choose 1 of your opponent's Benched Pokémon. Flip 3 coins. This attack does 10 damage times the number of heads to that Pokémon. Don't apply Weakness and Resistance."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Bone Rush", {
          text "50x damage. Flip a coin until you get tails. This attack does 50 damage times the number of heads."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NIDORINO_55:
      return evolution (this, from:"Nidoran♂", hp:HP060, type:G, retreatCost:1) {
        weakness P
        move "Poison Horn", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "40 damage. Nidorino does 10 damage to itself."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PUPITAR_56:
      return evolution (this, from:"Larvitar", hp:HP080, type:F, retreatCost:1) {
        weakness W
        move "Thrash", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, Pupitar does 10 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SCYTHER_57:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Quick Turn", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Cross-Cut", {
          text "20+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 20 damage plus 20 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SEADRA_58:
      return evolution (this, from:"Horsea", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Water Bullet", {
          text "30+ damage. Flip a number of coins equal to the number of [W] Energy attached to Seadra. This attack does 30 damage plus 10 more damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SEAKING_59:
      return evolution (this, from:"Goldeen", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Flail", {
          text "10x damage. This attack does 10 damage times the number of damage counters on Seaking."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Undulate", {
          text "30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Seaking."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SKIPLOOM_60:
      return evolution (this, from:"Hoppip", hp:HP060, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        pokeBody "Lightweight", {
          text "You pay [C] less to retreat Skiploom for each [G] Energy attached to it."
          delayedA {
          }
        }
        move "Break Powder", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage. If tails, this attack does 10 damage and the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SMOOCHUM_61:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:P, retreatCost:0) {
        move "Energy Kiss", {
          text "10x damage. Flip a number of coins equal to the number of Energy cards attached to the Defending Pokémon. This attack does 10 damage times the number of heads."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SPINARAK_62:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Gooey Thread", {
          text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TYROGUE_63:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:F, retreatCost:0) {
        move "Energy Punch", {
          text "10 damage. Flip a coin. If heads, discard a Special Energy card attached to the Defending Pokémon. If tails, this attack does nothing."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VOLTORB_64:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Rollout", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WEEPINBELL_65:
      return evolution (this, from:"Bellsprout", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Growth", {
          text "Attach up to 2 [G] Energy cards from your hand to Weepinbell."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Double Razor Leaf", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WOOPER_66:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Tail Whap", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Deep Dive", {
          text "Flip 3 coins. For each heads, remove 1 damage counter from Wooper."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case AIPOM_67:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Stretch Tail", {
          text "Flip a coin. If heads, choose 1 of your opponent's Benched Pokémon and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Skedaddle", {
          text "20 damage. Return Aipom and all basic Energy cards attached to it to your hand. If you have no Benched Pokémon, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BELLSPROUT_68:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Poison Vine", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Sharp Leaf", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHANSEY_69:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Rollout", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double-edge", {
          text "40 damage. Chansey does 40 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CHINCHOU_70:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Float", {
          text "Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Chinchou."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Headbutt", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CHINCHOU_71:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Jolt", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CUBONE_72:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Teary Eyes", {
          text "During your opponent's next turn, any damage done to Cubone by attacks is reduced by 20."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Tackle", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DODUO_73:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Super Speed", {
          text "Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Doduo."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Rear Kick", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DROWZEE_74:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Sleep Inducer", {
          text "Flip a coin. If heads, choose 1 of your opponent's Benched Pokémon and switch the Defending Pokémon with it. The new Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case EEVEE_75:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Charge Up", {
          text "Flip a coin. If heads, search your deck for an Energy card and attach it to Eevee. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Lunge", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case EXEGGCUTE_76:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Growth Spurt", {
          text "Attach an Energy card from your hand to Exeggcute."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Sleep Powder", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EXEGGCUTE_77:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Continuous Eggsplosion", {
          text "10x damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Energy Support", {
          text "Flip a coin. If heads, search your deck for a [P] Energy card and attach it to 1 of your Benched Pokémon. Shuffle your deck afterward."
          energyCost P
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case GOLDEEN_78:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Knock Away", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GRIMER_79:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Poison Sludge", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case GROWLITHE_80:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Roar", {
          text "If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches the Defending Pokémon with it."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Firebreathing", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case HITMONCHAN_81:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness P
        move "Rush", {
          text "10x damage. Flip 5 coins. This attack does 10 damage times the number of heads. Hitmonchan can't attack during your next turn."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Smash Punch", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case HITMONTOP_82:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness P
        move "Double Kick", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Triple Spin", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads. If you get 2 or more heads, switch Hitmontop with 1 of your Benched Pokémon, if any."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOPPIP_83:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        pokeBody "Lightweight", {
          text "You pay [C] less to retreat Hoppip for each [G] Energy attached to it."
          delayedA {
          }
        }
        move "Careless Tackle", {
          text "20 damage. Hoppip does 10 damage to itself."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HORSEA_84:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case HORSEA_85:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Reverse Thrust", {
          text "20 damage. Switch Horsea with 1 of your Benched Pokémon, if any."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOUNDOUR_86:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Flare", {
          text "20 damage. "
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOUNDOUR_87:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Feint Attack", {
          text "20 damage. Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KANGASKHAN_88:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Baby Outing", {
          text "Look at the top 3 cards of your deck, and then choose 1 of those cards and put it into your hand. Shuffle the rest into your deck afterward."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Mega Punch", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LARVITAR_89:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness W
        move "Mountain Eater", {
          text "Your opponent discards the top card from his or her deck. Then you remove a damage counter from Larvitar."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Rising Lunge", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LICKITUNG_90:
      return basic (this, hp:HP080, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Long Tongue", {
          text "Choose 1 of your opponent's Pokémon in play. This attack does 10 damage to that Pokémon. Don't apply Weakness and Resistance."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGNEMITE_91:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        pokeBody "Conductive Body", {
          text "You pay [C] less to retreat Magnemite for each Magnemite on your Bench."
          delayedA {
          }
        }
        move "Magnetic Bomb", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage. If tails, Magnemite does 10 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MANKEY_92:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness P
        move "Mug", {
          text "10 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. This attack does 10 damage plus 10 more damage for each damage counter on Mankey."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAREEP_93:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Charge", {
          text "Attach 1 [L] Energy card from you discard pile to Mareep."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Tail Slap", {
          text "20 damage. "
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MILTANK_94:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Continuous Tumble", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MR__MIME_95:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokeBody "Energy Barrier", {
          text "If Mr. Mime would be damaged by an attack, reduce that damage by 10 for each basic Energy card attached to Mr. Mime. The maximum amount of damage that can be reduced by Energy Barrier is 20."
          delayedA {
          }
        }
        move "Mind Shock", {
          text "20 damage. Don't apply Weakness and Resistance."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NIDORAN_MALE_96:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Poison Horn", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Scratch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ODDISH_97:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Stun Spore", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Ram", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ONIX_98:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness W
        move "Crush", {
          text "20x damage. Flip a number of coins equal to the amount of Energy attached to Onix. This attack does 20 damage times the number of heads."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PARAS_99:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Spore", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Spore Evolution", {
          text "Search your deck for a card that evolves from Paras. Attach it to Paras. This counts as evolving Paras. Shuffle your deck afterward."
          energyCost G, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case PHANPY_100:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Flail", {
          text "10x damage. This attack does 10 damage times the number of damage counters on Phanpy."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rollout", {
          text "20 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PINSIR_101:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Horn Grab", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Slice", {
          text "90 damage. Flip 3 coins. If either of them is tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case PONYTA_102:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Ponyta."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PORYGON_103:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Data Sort", {
          text "Flip a coin. If heads, choose a Trainer card from your discard pile, show it to your opponent, and then shuffle it into your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Peck", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PSYDUCK_104:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Scratch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case REMORAID_105:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Splatter", {
          text "10 damage. Choose 1 of your opponent's Pokémon is play. This attack does 10 damage to that Pokémon. Don't apply Weakness or Resistance for this attack."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SCYTHER_106:
      return basic (this, hp:HP060, type:G, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Slash", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SENTRET_107:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Spy", {
          text "Look at the top 3 cards of your opponent's deck. Put them back in the same order."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Double Scratch", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SLOWPOKE_108:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Fishing Tail", {
          text "Search your discard pile for a Baby Pokémon, Basic Pokémon, Evolution card, or basic Energy card, show it to your opponent, and then put it into your hand."
          energyCost C
          attackRequirement {}
          onAttack {
            
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
      case SMEARGLE_109:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Paint Trick", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. Then, choose 1 of your Benched Pokémon and switch Smeargle with it."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Doubleslap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SNEASEL_110:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Rob", {
          text "Look at your opponent's hand. Choose all Technical Machine and Pokémon Tool cards there and put them into his or her deck. Your opponent shuffles the deck afterward."
          energyCost D
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Claw", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SPINARAK_111:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Sharp Stinger", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case TANGELA_112:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Tickling Vines", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Kick", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TENTACOOL_113:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Poison Sting", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Recover", {
          text "Discard 1 [W] Energy card attached to Tentacool in order to use this attack. Remove all damage counters from Tentacool."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case TOGEPI_114:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Minor Errand-Running", {
          text "Flip 2 coins. For each heads, search your deck for a basic Energy card. Show those cards to your opponent, and then put them into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Pound", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VOLTORB_115:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Swift", {
          text "20 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VULPIX_116:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Collect Fire", {
          text "10 damage. If there are any [R] Energy cards in your discard pile, flip a coin. If heads, attach 1 of them to Vulpix."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WOOPER_117:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Wave Splash", {
          text "20 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case APRICORN_FOREST_118:
      return stadium (this) {
        text "Once during each player's turn (before attacking), if that player's Bench isn't full, that player flips a coin. If heads, that player shows his or her opponent a basic Energy card from his or her hand. Then, that player searches his or her deck for a Basic Pokémon card of the same type (color) as the revealed Energy card and puts it onto his or her Bench. The player shuffles his or her deck afterward."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case DARKNESS_CUBE_01_119:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [D] Pokémon in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Darkness Cube 01." +
          "[D] Plunder: 10 damage. Before doing damage, discard any Trainer cards attached to the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_SWITCH_120:
      return basicTrainer (this) {
        text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case FIGHTING_CUBE_01_121:
      return basicTrainer (this) {
        text "Attach this card to 1 of our [F] Pokémon in play. That Pokémon my use this card's attack instead of its own. At the end of your turn, discard Fighting Cube 01." +
          "[F] Violent Rage: 10x damage. Flip a number of coins equal to the number of damage counters on this Pokémon. This attack does 10 damage times the number of heads."
        onPlay {
        }
        playRequirement{
        }
      };
      case FIRE_CUBE_01_122:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [R] Pokémon in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Fire Cube 01." +
          "[R] Singe: The Defending Pokémon is now Burned."
        onPlay {
        }
        playRequirement{
        }
      };
      case FOREST_GUARDIAN_123:
      return supporter (this) {
        text "Shuffle your deck. Then, look at the top 7 cards of your deck. Choose 1 of those cards and put it into your hand. Shuffle the rest into your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case GRASS_CUBE_01_124:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [G] Pokémon in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Grass Cube 01." +
          "[G] Sleep Poison. The Defending Pokémon is now Asleep and Poisoned."
        onPlay {
        }
        playRequirement{
        }
      };
      case DESERT_RUINS_125:
      return stadium (this) {
        text "At any time between turns, each player puts 1 damage counter on his or her Pokémon-ex with a remaining HP of 80 or more."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case JUGGLER_126:
      return supporter (this) {
        text "Discard up to 2 basic Energy cards from your hand. If you discarded 1 basic Energy card, draw 3 cards. If you discarded 2 basic Energy cards, draw 5 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case LIGHTNING_CUBE_01_127:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [L] Pokémon in play. That Pokémon may use this attack instead of it own. At the end of your turn, discard Lightning Cube 01." +
          "[L] Discharge: 40x damage. Discard all [L] Energy cards attached to this Pokémon. Then, flip a number of coins equal to the number of Energy cards discarded that way. This attack does 40 damage times the number of heads."
        onPlay {
        }
        playRequirement{
        }
      };
      case MEMORY_BERRY_128:
      return pokemonTool (this) {
        text "The Pokémon this card is attached to (exluding Pokémon-ex) can use any attack from its Basic Pokémon card or any Evolution card from which the Pokémon evolved. (You still have to pay for that attack's Energy cost.) Discard this card at the end of any turn the Pokémon attacks."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case METAL_CUBE_01_129:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [M] Pokémon in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Metal Cube 01." +
          "[M] Metal Reversal: 10 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_FAN_CLUB_130:
      return supporter (this) {
        text "Search your deck for up to 2 Baby Pokémon and/or Basic Pokémon cards and put them onto your Bench. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_PARK_131:
      return stadium (this) {
        text "Once during each of his or her turns, whenever a player attaches an Energy card from his or her hand to 1 of his or her Benched Pokémon (exluding Pokémon-ex), he or she removes 1 damage counter, if any, from that Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case PSYCHIC_CUBE_01_132:
      return basicTrainer (this) {
        text "Attach this card to 1 of your [P] Pokémon in play. That Pokémon may us this card's attack instead of its own. At the end of your turn, discard Psychic Cube 01." +
          "[P] Psy Confuse. The Defending Pokémon is now Confused."
        onPlay {
        }
        playRequirement{
        }
      };
      case SEER_133:
      return supporter (this) {
        text "Look at the top 6 cards of your deck. Take all basic Energy cards you find there, show them to your opponent, and then put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case HEALING_FIELDS_134:
      return stadium (this) {
        text "Once during each player's turn, he or she may flip a coin. If heads, that player's Active Pokémon (exluding Pokémon-ex) is no longer affected by any Special Conditions."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case TIME_SHARD_135:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to is Knocked Out by damage from the Defending Pokémon's attack during your opponent's turn, your may return up to 2 basic Energy cards attached to that Pokémon to your hand."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TOWN_VOLUNTEERS_136:
      return supporter (this) {
        text "Take 5 Baby Pokémon, Basic Pokémon, Evolution, and/or basic Energy cards from your discard pile and then show them to your opponent. Shuffle them into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case TRAVELING_SALESMAN_137:
      return supporter (this) {
        text "Search your deck for up to 2 Technical Machine and/or Pokémon Tool cards, show them to your opponent, and then put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case UNDERSEA_RUINS_138:
      return stadium (this) {
        text "Once during each player's turn (before attacking), that player may flip a coin. If heads, that player chooses 1 of his or her Evolved Pokémon in play and discards the top Evolution card from that Pokémon, devolving it."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case POWER_PLANT_139:
      return stadium (this) {
        text "Once during each of his or her turns, a player may discard a basic Energy card from his or her hand. If that player does, he or she chooses a basic Energy card from his or her discard pile, shows it to his or her opponent, and then puts it into his or her hand."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case WATER_CUBE_01_140:
      return basicTrainer (this) {
        text "Attach this card to 1 of you [W] Pokémon in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Water Cube 01." +
          "[W] Splatter. Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. Don't apply Weakness or Resistance."
        onPlay {
        }
        playRequirement{
        }
      };
      case WEAKNESS_GUARD_141:
      return basicTrainer (this) {
        text "Attach this card to 1 of your Pokémon. Discard it at the end of your opponent's next turn." +
          "As long as this card is attached, this Pokémon has no Weakness."
        onPlay {
        }
        playRequirement{
        }
      };
      case DARKNESS_ENERGY_142:
      return specialEnergy (this, [[C]]) {
        text "If the Pokémon Darkness Energy is attached to damages the Defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon." +
          "At the end of every turn, put 1 damage counter on the Pokémon Darkness Energy is attached to, unless it's [D]." +
          "Darkness Energy provides [D] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case METAL_ENERGY_143:
      return specialEnergy (this, [[C]]) {
        text "Damage done to the Pokémon Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon Metal Energy is attached to isn't [M]." +
          "Metal Energy provides [M] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case RAINBOW_ENERGY_144:
      return specialEnergy (this, [[C]]) {
        text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) When you attach this card from your hand to 1 of your Pokémon, put 1 damage counter on that Pokémon."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case BOOST_ENERGY_145:
      return specialEnergy (this, [[C]]) {
        text "Boost Energy provides [C] energy. While in play, if you have more prize cards than your opponent, Boost Energy provides [C][C][C]. If the Pokémon Boost Energy is attached to is a Pokémon-ex, or has a Poké-Power, Poké-Body, or any other Special Energy cards attached to it (at any time), discard Boost Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CRYSTAL_ENERGY_146:
      return specialEnergy (this, [[C]]) {
        text "Crystal Energy provides 1 Energy of all types (colors) of all basic Energy cards attached to the Pokémon Crystal Energy is attached to." +
          "If there are no basic Energy cards attached to the Pokémon Crystal Energy is attached to, Crystal Energy provides [C] Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case WARP_ENERGY_147:
      return specialEnergy (this, [[C]]) {
        text "Warp Energy provides 1 [C] Energy." +
          "When you attach Warp Energy from your hand to your Active Pokémon, switch your Active Pokémon with 1 of your Benched Pokémon."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case KINGDRA_148:
      return evolution (this, from:"Seadra", hp:HP110, type:C, retreatCost:3) {
        weakness L
        pokeBody "Crystal Type", {
          text "Whenever you attach a [W], [L], or [P] basic Energy card from your hand to Kingdra, Kingdra's type (color) becomes the same as that Energy card type until the end of the turn."
          delayedA {
          }
        }
        move "Aquabomb", {
          text "40 damage. Kingdra does 10 damage to itself. (Don't apply Weakness or Resistance when Kingdra damages itself with this attack.)"
          energyCost W, L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Dual Burn", {
          text "60 damage. Flip 2 coins. For each tails, discard 1 Energy card attached to Kingdra."
          energyCost P, L, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case LUGIA_149:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness P
        pokeBody "Crystal Type", {
          text "Whenever you attach a [R], [W], or [P] basic Energy card from your hand to Lugia, Lugia's type (color) becomes the same as that Energy card type until the end of the turn."
          delayedA {
          }
        }
        move "Psychic", {
          text "10x damage. This attack does 10 damage times the number of Energy cards attached to the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steam Blast", {
          text "50 damage. Discard an Energy card attached to Lugia."
          energyCost W, R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NIDOKING_150:
      return evolution (this, from:"Nidorino", hp:HP100, type:C, retreatCost:3) {
        weakness P
        pokeBody "Crystal Type", {
          text "Whenever you attach a [G], [L], or [F] basic Energy card from you hand to Nidoking, Nidoking's type (color) becomes the same as that Energy card type until the end of the turn."
          delayedA {
          }
        }
        move "Poison Horn", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rolling Thunder", {
          text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. If tails, this attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness or Resistance for Benched Pokémon.)"
          energyCost L, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case BOOST_ENERGY_151:
      return specialEnergy (this, [[C]]) {
        text "Boost Energy provides [C] energy. While in play, if you have more prize cards than your opponent, Boost Energy provides [C][C][C]. If the Pokémon Boost Energy is attached to has a Poké-Power, or any other Special Energy cards attached to it (at any time), discard Boost Energy. If the Pokémon Boost Energy is attached to is a Pokémon-ex, Discard Boost Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CRYSTAL_ENERGY_152:
      return copy (CRYSTAL_ENERGY_146, this);
      case WARP_ENERGY_153:
      return copy (WARP_ENERGY_147, this);
      case BLEND_ENERGY_GRPD_154:
      return specialEnergy (this, [[C]]) {
        text "This card provides 1 [C] Energy." +
          "When this card is attached to a Pokémon, this card provides [G], [R], [P], or [D] but only provides 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case BLEND_ENERGY_WLFM_155:
      return specialEnergy (this, [[C]]) {
        text "This card provides 1 [C] Energy." +
          "When this card is attached to a Pokémon, this card provides [W], [L], [F], or [M] but only provides 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case KABUTOPS_156:
      return evolution (this, from:"Kabuto", hp:HP090, type:F, retreatCost:3) {
        weakness G
        resistance R, MINUS30
        pokeBody "Fossilized Memories", {
          text "As long as this Pokémon is your Active Pokémon and has a Pokémon Tool attached to it, no Supporter cards can be played."
          delayedA {
          }
        }
        move "Rock Tomb", {
          text "40 damage. This attack does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance to Benched Pokémon.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SNEASEL_157:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Dark Cloak", {
          text "Each of your [D] Pokémon that has any [D] Energy attached to it has no Retreat Cost."
          delayedA {
          }
        }
        move "Hone Claws", {
          text "30 damage. This attack does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case AMPHAROS_158:
      return copy (AMPHAROS_1, this);
      case ARCANINE_159:
      return copy (ARCANINE_2, this);
      case ARIADOS_160:
      return copy (ARIADOS_3, this);
      case AZUMARILL_161:
      return copy (AZUMARILL_4, this);
      case BELLOSSOM_162:
      return copy (BELLOSSOM_5, this);
      case BLISSEY_163:
      return copy (BLISSEY_6, this);
      case ELECTRODE_164:
      return copy (ELECTRODE_8, this);
      case ENTEI_165:
      return copy (ENTEI_10, this);
      case ESPEON_166:
      return copy (ESPEON_11, this);
      case EXEGGUTOR_167:
      return copy (EXEGGUTOR_12, this);
      case HOUNDOOM_168:
      return copy (HOUNDOOM_15, this);
      case HYPNO_169:
      return copy (HYPNO_16, this);
      case JUMPLUFF_170:
      return copy (JUMPLUFF_17, this);
      case KINGDRA_171:
      return copy (KINGDRA_19, this);
      case LANTURN_172:
      return copy (LANTURN_21, this);
      case MAGNETON_173:
      return copy (MAGNETON_22, this);
      case MUK_174:
      return copy (MUK_23, this);
      case NIDOKING_175:
      return copy (NIDOKING_24, this);
      case NINETALES_176:
      return copy (NINETALES_25, this);
      case OCTILLERY_177:
      return copy (OCTILLERY_26, this);
      case SCIZOR_178:
      return copy (SCIZOR_32, this);
      case SLOWKING_179:
      return copy (SLOWKING_34, this);
      case STEELIX_180:
      return copy (STEELIX_35, this);
      case SUDOWOODO_181:
      return copy (SUDOWOODO_36, this);
      case SUICUNE_182:
      return copy (SUICUNE_37, this);
      case TENTACRUEL_183:
      return copy (TENTACRUEL_38, this);
      case TOGETIC_184:
      return copy (TOGETIC_39, this);
      case TYRANITAR_185:
      return copy (TYRANITAR_40, this);
      case UMBREON_186:
      return copy (UMBREON_41, this);
      case VICTREEBEL_187:
      return copy (VICTREEBEL_42, this);
      case VILEPLUME_188:
      return copy (VILEPLUME_43, this);
      case ZAPDOS_189:
      return copy (ZAPDOS_44, this);
      case DONPHAN_190:
      return copy (DONPHAN_7, this);
      case RAIKOU_EX_191:
      return basic (this, hp:HP100, type:L, retreatCost:2) {
        weakness F
        move "Dazzle Blast", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lightning Tackle", {
          text "70 damage. Flip a coin. If tails, Raikou ex does 40 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ENTEI_EX_192:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness W
        move "Searing Flame", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Bright Flame", {
          text "70 damage. Discard 2 Energy attached to Entei ex."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SUICUNE_EX_193:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Searing Flame", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 20 damage to that Pokémon. You may move an Energy card attached to that Pokémon to another of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Reverse Stream", {
          text "40+ damage. You may return all basic Energy cards attached to Suicune ex to your hand. If you do, this attack does 40 damage more plus 10 damage for each basic Energy card you returned. Put 1 damage counter on Suicune ex for each Energy you returned."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KABUTOPS_EX_194:
      return evolution (this, from:"Kabuto", hp:HP150, type:W, retreatCost:2) {
        weakness G
        weakness L
        resistance R, MINUS30
        move "Hydrocutter", {
          text "30x damage. Flip a number of coins equal to the amount of Energy attached to Kabutops ex. This attack does 30 damage times the number of heads. You can't flip more than 3 coins in this way."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Spiral Drain", {
          text "70 damage. Remove 2 damage counters from Kabutops ex (remove 1 if there is only 1)."
          energyCost W, F, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case RAICHU_EX_195:
      return evolution (this, from:"Pikachu", hp:HP100, type:L, retreatCost:1) {
        weakness F
        move "Dazzle Blast", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Thunderbolt", {
          text "120 damage. Discard all Energy cards attached to Raichu ex. Put 3 damage counters on Raichu ex."
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case AERODACTYL_EX_196:
      return evolution (this, from:"Mysterious Fossil", hp:HP100, type:C, retreatCost:1) {
        weakness G
        weakness L
        pokeBody "Primal Lock", {
          text "As long as Aerodactyl ex is in play, your opponent can't play Pokémon Tool cards. Remove any Pokémon Tool cards attached to your opponent's Pokémon and put them into his or her discard pile."
          delayedA {
          }
        }
        move "Supersonic", {
          text "10 damage. The Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mega Thunderbolt", {
          text "40 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TYPHLOSION_EX_197:
      return evolution (this, from:"Quilava", hp:HP150, type:R, retreatCost:2) {
        weakness W
        weakness F
        move "Supersonic", {
          text "40 damage. The Defending Pokémon is now Burned, and can't retreat until the end of your opponent's next turn."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Split Blast", {
          text "100 damage. Discard 1 Energy card attached to Typhlosion ex. If your opponent has less than 3 Benched Pokémon, you may do 50 damage to each of them instead."
          energyCost R, R, R, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MACHAMP_EX_198:
      return evolution (this, from:"Machoke", hp:HP150, type:F, retreatCost:3) {
        weakness P
        weakness C
        pokePower "Fighting Tag", {
          text "Once during your turn (before your attack), if Machamp-ex is on your Bench, you may move all [F] Energy attached to your Active Pokémon to Machamp-ex. If you do, switch Machamp-ex with your Active Pokémon. Put 1 damage counter on Machamp-ex for each Energy you attached to it in this way. You can't use more than 1 Fighting Tag Poké-Power each turn."
          actionA {
          }
        }
        move "Crushing Punch", {
          text "40 damage. Discard a Special Energy attached to the defending Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Champ Buster", {
          text "60+ damage. Does 60 damage plus 10 more damage for each of your Benched Pokémon that has any damage counters on it."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
        default:
      return null;
    }
  }
}
