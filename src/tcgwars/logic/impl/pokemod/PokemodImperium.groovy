package tcgwars.logic.impl.pokemod

import tcgwars.logic.impl.gen3.FireRedLeafGreen

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
public enum PokemodImperium implements LogicCardInfo {

  BULBASAUR_1 ("Bulbasaur", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  IVYSAUR_2 ("Ivysaur", "2", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VENUSAUR_3 ("Venusaur", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHARMANDER_4 ("Charmander", "4", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMELEON_5 ("Charmeleon", "5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_6 ("Charizard", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  SQUIRTLE_7 ("Squirtle", "7", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WARTORTLE_8 ("Wartortle", "8", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BLASTOISE_9 ("Blastoise", "9", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CATERPIE_10 ("Caterpie", "10", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  METAPOD_11 ("Metapod", "11", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BUTTERFREE_12 ("Butterfree", "12", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WEEDLE_13 ("Weedle", "13", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KAKUNA_14 ("Kakuna", "14", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BEEDRILL_15 ("Beedrill", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  PIDGEY_16 ("Pidgey", "16", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIDGEOTTO_17 ("Pidgeotto", "17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PIDGEOT_18 ("Pidgeot", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  RATTATA_19 ("Rattata", "19", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RATICATE_20 ("Raticate", "20", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SPEAROW_21 ("Spearow", "21", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FEAROW_22 ("Fearow", "22", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  EKANS_23 ("Ekans", "23", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARK_ARBOK_24 ("Dark Arbok", "24", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PIKACHU_25 ("Pikachu", "25", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_26 ("Raichu", "26", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SANDSHREW_27 ("Sandshrew", "27", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSLASH_28 ("Sandslash", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  NIDORAN_FEMALE_29 ("Nidoran♀", "29", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NIDORINA_30 ("Nidorina", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDOQUEEN_7 ("Nidoqueen", "31", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NIDORAN_MALE_32 ("Nidoran♂", "32", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NIDORINO_33 ("Nidorino", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDOKING_34 ("Nidoking", "34", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CLEFAIRY_35 ("Clefairy", "35", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CLEFABLE_36 ("Clefable", "36", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GOLEM_36 ("Golem", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  VULPIX_37 ("Vulpix", "37", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  NINETALES_38 ("Ninetales", "38", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  JIGGLYPUFF_39 ("Jigglypuff", "39", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  WIGGLYTUFF_40 ("Wigglytuff", "40", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ZUBAT_41 ("Zubat", "41", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARK_GOLBAT_42 ("Dark Golbat", "42", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ODDISH_43 ("Oddish", "43", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARK_GLOOM_44 ("Dark Gloom", "44", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DARK_VILEPLUME_45 ("Dark Vileplume", "45", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  PARAS_46 ("Paras", "46", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PARASECT_47 ("Parasect", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VENONAT_48 ("Venonat", "48", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VENOMOTH_49 ("Venomoth", "49", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DIGLETT_50 ("Diglett", "50", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_51 ("Dugtrio", "51", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MEOWTH_52 ("Meowth", "52", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PERSIAN_53 ("Persian", "53", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PSYDUCK_54 ("Psyduck", "54", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GOLDUCK_55 ("Golduck", "55", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SLOWPOKE_79 ("Slowpoke", "55", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MANKEY_56 ("Mankey", "56", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DARK_PRIMEAPE_57 ("Dark Primeape", "57", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GROWLITHE_58 ("Growlithe", "58", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  ARCANINE_59 ("Arcanine", "59", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  POLIWAG_60 ("Poliwag", "60", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWHIRL_61 ("Poliwhirl", "61", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POLIWRATH_62 ("Poliwrath", "62", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  ABRA_63 ("Abra", "63", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KADABRA_64 ("Kadabra", "64", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ALAKAZAM_65 ("Alakazam", "65", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MACHOP_66 ("Machop", "66", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MACHOKE_67 ("Machoke", "67", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MACHAMP_68 ("Machamp", "68", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  BELLSPROUT_69 ("Bellsprout", "69", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WEEPINBELL_70 ("Weepinbell", "70", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VICTREEBEL_71 ("Victreebel", "71", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TENTACOOL_72 ("Tentacool", "72", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TENTACRUEL_73 ("Tentacruel", "73", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GEODUDE_74 ("Geodude", "74", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAVELER_75 ("Graveler", "75", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PONYTA_77 ("Ponyta", "77", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  RAPIDASH_78 ("Rapidash", "78", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SLOWBRO_80 ("Slowbro", "80", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MAGNEMITE_81 ("Magnemite", "81", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DARK_MAGNETON_82 ("Dark Magneton", "82", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  FARFETCHD_83 ("Farfetch'd", "83", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DODUO_84 ("Doduo", "84", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DODRIO_85 ("Dodrio", "85", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SEEL_86 ("Seel", "86", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  DEWGONG_87 ("Dewgong", "87", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GRIMER_88 ("Grimer", "88", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARK_MUK_89 ("Dark Muk", "89", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SHELLDER_90 ("Shellder", "90", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CLOYSTER_91 ("Cloyster", "91", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GASTLY_92 ("Gastly", "92", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HAUNTER_93 ("Haunter", "93", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GENGAR_94 ("Gengar", "94", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  ONIX_95 ("Onix", "95", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DROWZEE_96 ("Drowzee", "96", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HYPNO_97 ("Hypno", "97", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KRABBY_98 ("Krabby", "98", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  KINGLER_99 ("Kingler", "99", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VOLTORB_100 ("Voltorb", "100", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_101 ("Electrode", "101", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  EXEGGCUTE_102 ("Exeggcute", "102", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  EXEGGUTOR_103 ("Exeggutor", "103", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CUBONE_104 ("Cubone", "104", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAROWAK_105 ("Marowak", "105", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HITMONLEE_106 ("Hitmonlee", "106", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  HITMONCHAN_107 ("Hitmonchan", "107", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  LICKITUNG_108 ("Lickitung", "108", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  KOFFING_109 ("Koffing", "109", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DARK_WEEZING_110 ("Dark Weezing", "110", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RHYHORN_111 ("Rhyhorn", "111", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  RHYDON_112 ("Rhydon", "112", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CHANSEY_113 ("Chansey", "113", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TANGELA_114 ("Tangela", "114", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KANGASKHAN_115 ("Kangaskhan", "115", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  HORSEA_116 ("Horsea", "116", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEADRA_117 ("Seadra", "117", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GOLDEEN_118 ("Goldeen", "118", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEAKING_119 ("Seaking", "119", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  STARYU_120 ("Staryu", "120", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARMIE_121 ("Starmie", "121", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MR_MIME_122 ("Mr. Mime", "122", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  SCYTHER_123 ("Scyther", "123", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  JYNX_124 ("Jynx", "124", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ELECTABUZZ_125 ("Electabuzz", "125", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  MAGMAR_126 ("Magmar", "126", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  PINSIR_127 ("Pinsir", "127", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  TAUROS_128 ("Tauros", "128", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  MAGIKARP_129 ("Magikarp", "129", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  GYARADOS_130 ("Gyarados", "130", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LAPRAS_131 ("Lapras", "131", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  DITTO_132 ("Ditto", "132", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_133 ("Eevee", "133", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DARK_VAPOREON_134 ("Dark Vaporeon", "134", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DARK_JOLTEON_135 ("Dark Jolteon", "135", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  DARK_FLAREON_136 ("Dark Flareon", "136", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  PORYGON_137 ("Porygon", "137", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  FLOAT_STONE_137 ("Float Stone", "137", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  OMANYTE_138 ("Omanyte", "138", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  OMASTAR_139 ("Omastar", "139", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  KABUTO_140 ("Kabuto", "140", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  KABUTOPS_141 ("Kabutops", "141", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  AERODACTYL_142 ("Aerodactyl", "142", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SNORLAX_143 ("Snorlax", "143", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  ARTICUNO_144 ("Articuno", "144", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  ZAPDOS_145 ("Zapdos", "145", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  MOLTRES_146 ("Moltres", "146", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  DRATINI_147 ("Dratini", "147", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DRAGONAIR_148 ("Dragonair", "148", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DRAGONITE_149 ("Dragonite", "149", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  MEWTWO_150 ("Mewtwo", "150", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_151 ("Mew", "151", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  POKE_BALL_152 ("Poké Ball", "152", Rarity.COMMON, [TRAINER]),
  DUAL_BALL_153 ("Dual Ball", "153", Rarity.COMMON, [TRAINER]),
  LEVEL_BALL_154 ("Level Ball", "154", Rarity.UNCOMMON, [TRAINER]),
  HEAVY_BALL_155 ("Heavy Ball", "155", Rarity.UNCOMMON, [TRAINER]),
  ROCKET_BALL_156 ("Rocket Ball", "156", Rarity.UNCOMMON, [TRAINER]),
  POKEMON_BREEDER_157 ("Pokémon Breeder", "157", Rarity.RARE, [TRAINER]),
  POKEMON_BREEDER_FIELDS_158 ("Pokémon Breeder Fields", "158", Rarity.UNCOMMON, [TRAINER]),
  POKEMON_TRADER_159 ("Pokémon Trader", "159", Rarity.RARE, [TRAINER]),
  POKEMON_FLUTE_160 ("Pokémon Flute", "160", Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_161 ("Pokédex", "161", Rarity.UNCOMMON, [TRAINER]),
  POTION_162 ("Potion", "162", Rarity.COMMON, [TRAINER]),
  SUPER_POTION_163 ("Super Potion", "163", Rarity.UNCOMMON, [TRAINER]),
  FULL_HEAL_164 ("Full Heal", "164", Rarity.UNCOMMON, [TRAINER]),
  REVIVE_165 ("Revive", "165", Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_166 ("PlusPower", "166", Rarity.UNCOMMON, [TRAINER]),
  DEFENDER_167 ("Defender", "167", Rarity.UNCOMMON, [TRAINER]),
  DEVOLUTION_SPRAY_168 ("Devolution Spray", "168", Rarity.RARE, [TRAINER]),
  BROCK_169 ("Brock", "169", Rarity.RARE, [TRAINER]),
  LT_SURGE_170 ("Lt. Surge", "170", Rarity.RARE, [TRAINER]),
  ERIKA_171 ("Erika", "171", Rarity.RARE, [TRAINER]),
  LORELEI_172 ("Lorelei", "172", Rarity.RARE, [TRAINER, SUPPORTER]),
  BRUNO_173 ("Bruno", "173", Rarity.RARE, [TRAINER, SUPPORTER]),
  AGATHA_174 ("Agatha", "174", Rarity.RARE, [TRAINER, SUPPORTER]),
  LANCE_175 ("Lance", "175", Rarity.RARE, [TRAINER, SUPPORTER]),
  GARY_OAK_176 ("Gary Oak", "176", Rarity.RARE, [TRAINER, SUPPORTER]),
  ASH_177 ("Ash", "177", Rarity.RARE, [TRAINER, SUPPORTER]),
  PROFESSOR_OAK_178 ("Professor Oak", "178", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  IMPOSTER_PROFESSOR_OAK_179 ("Imposter Professor Oak", "179", Rarity.RARE, [TRAINER]),
  IMPOSTER_OAKS_REVENGE_180 ("Imposter Oak's Revenge", "180", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  NURSE_JOY_181 ("Nurse Joy", "181", Rarity.RARE, [TRAINER, SUPPORTER]),
  POKEMON_CENTER_182 ("Pokémon Center", "182", Rarity.UNCOMMON, [TRAINER]),
  OFFICER_JENNY_183 ("Officer Jenny", "183", Rarity.RARE, [TRAINER, SUPPORTER]),
  BILL_184 ("Bill", "184", Rarity.COMMON, [TRAINER]),
  MR_FUJI_185 ("Mr. Fuji", "185", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  THE_EEVEE_BROTHERS_WAGER_186 ("The Eevee Brothers' Wager", "186", Rarity.RARE, [TRAINER, SUPPORTER]),
  RITCHIE_187 ("Ritchie", "187", Rarity.RARE, [TRAINER, SUPPORTER]),
  PROFESSOR_IVY_188 ("Professor Ivy", "188", Rarity.RARE, [TRAINER, SUPPORTER]),
  LASS_189 ("Lass", "189", Rarity.RARE, [TRAINER, SUPPORTER]),
  SAMURAI_190 ("Samurai", "190", Rarity.RARE, [TRAINER, SUPPORTER]),
  HEALING_FIELDS_191 ("Healing Fields", "191", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  POKEMON_POOL_PARTY_192 ("Pokémon Pool Party", "192", Rarity.RARE, [TRAINER, STADIUM]),
  LOST_WORLD_193 ("Lost World", "193", Rarity.RARE, [TRAINER, STADIUM]),
  CRYSTAL_BEACH_194 ("Crystal Beach", "194", Rarity.RARE, [TRAINER, STADIUM]),
  ROCKETS_DUNGEON_195 ("Rocket's Dungeon", "195", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ROCKETS_HIDEOUT_196 ("Rocket's Hideout", "196", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  THE_ROCKETS_TRAINING_GYM_197 ("The Rocket's Training Gym", "197", Rarity.RARE, [TRAINER, STADIUM]),
  HERE_COMES_TEAM_ROCKET_198 ("Here Comes Team Rocket!", "198", Rarity.RARE, [TRAINER]),
  GOOP_GAS_ATTACK_199 ("Goop Gas Attack", "199", Rarity.COMMON, [TRAINER]),
  THE_BOSSS_WAY_200 ("The Boss's Way", "200", Rarity.UNCOMMON, [TRAINER]),
  THE_ROCKETS_TRAP_201 ("The Rocket's Trap", "201", Rarity.RARE, [TRAINER]),
  ROCKETS_ACE_IN_THE_HOLE_202 ("Rocket's Ace in the Hole", "202", Rarity.RARE, [TRAINER, SUPPORTER]),
  ROCKET_S_COUNTER_ATTACK_203 ("Rocket's Counter Attack", "203", Rarity.HOLORARE, [TRAINER, G_SPEC]),
  POKEMON_RETRIEVER_204 ("Pokémon Retriever", "204", Rarity.RARE, [TRAINER]),
  DIGGER_205 ("Digger", "205", Rarity.UNCOMMON, [TRAINER]),
  NIGHTLY_GARBAGE_RUN_206 ("Nightly Garbage Run", "206", Rarity.UNCOMMON, [TRAINER]),
  POW_HAND_EXTENSION_207 ("Pow! Hand Extension", "207", Rarity.RARE, [TRAINER]),
  SURPRISE_TIME_MACHINE_208 ("Surprise! Time Machine", "208", Rarity.RARE, [TRAINER]),
  SWOOP_TELEPORTER_209 ("Swoop! Teleporter", "209", Rarity.RARE, [TRAINER]),
  SLEEP_210 ("Sleep!", "210", Rarity.COMMON, [TRAINER]),
  CLEFAIRY_DOLL_211 ("Clefairy Doll", "211", Rarity.RARE, [TRAINER]),
  MYSTERIOUS_FOSSIL_212 ("Mysterious Fossil", "212", Rarity.COMMON, [TRAINER, FOSSIL]),
  SCOOP_UP_213 ("Scoop Up", "213", Rarity.RARE, [TRAINER]),
  GUST_OF_WIND_214 ("Gust of Wind", "214", Rarity.COMMON, [TRAINER]),
  SWITCH_215 ("Switch", "215", Rarity.COMMON, [TRAINER]),
  SUPER_SCOOP_UP_216 ("Super Scoop Up", "216", Rarity.UNCOMMON, [TRAINER]),
  COMPUTER_SEARCH_217 ("Computer Search", "217", Rarity.RARE, [TRAINER]),
  ITEM_FINDER_218 ("Item Finder", "218", Rarity.RARE, [TRAINER]),
  MAINTENANCE_219 ("Maintenance", "219", Rarity.UNCOMMON, [TRAINER]),
  GAMBLER_220 ("Gambler", "220", Rarity.COMMON, [TRAINER]),
  RECYCLE_221 ("Recycle", "221", Rarity.COMMON, [TRAINER]),
  CHALLENGE_222 ("Challenge!", "222", Rarity.UNCOMMON, [TRAINER]),
  CRYSTAL_GUARD_223 ("Crystal Guard", "223", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  RELIC_HUNTER_224 ("Relic Hunter", "224", Rarity.UNCOMMON, [TRAINER]),
  LOST_EXPEDITION_225 ("Lost Expedition", "225", Rarity.UNCOMMON, [TRAINER]),
  UNDERGROUND_EXPEDITION_226 ("Underground Expedition", "226", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ENERGY_RESTORE_227 ("Energy Restore", "227", Rarity.UNCOMMON, [TRAINER]),
  ENERGY_SEARCH_228 ("Energy Search", "228", Rarity.COMMON, [TRAINER]),
  ENERGY_SWITCH_229 ("Energy Switch", "229", Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETRIEVAL_230 ("Energy Retrieval", "230", Rarity.UNCOMMON, [TRAINER]),
  SUPER_ENERGY_RETRIEVAL_231 ("Super Energy Retrieval", "231", Rarity.RARE, [TRAINER]),
  ENERGY_REMOVAL_232 ("Energy Removal", "232", Rarity.COMMON, [TRAINER]),
  SUPER_ENERGY_REMOVAL_233 ("Super Energy Removal", "233", Rarity.RARE, [TRAINER]),
  TOOL_SCRAPPER_234 ("Tool Scrapper", "234", Rarity.UNCOMMON, [TRAINER]),
  PROTECTIVE_ORB_236 ("Protective Orb", "236", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  FIGHTING_ENERGY_237 ("Fighting Energy", "237", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_238 ("Fire Energy", "238", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  GRASS_ENERGY_239 ("Grass Energy", "239", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_240 ("Lightning Energy", "240", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_241 ("Psychic Energy", "241", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_242 ("Water Energy", "242", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  DOUBLE_COLORLESS_ENERGY_243 ("Double Colorless Energy", "243", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  MIRACLE_ENERGY_244 ("Miracle Energy", "244", Rarity.ULTRARARE, [ENERGY, G_SPEC, SPECIAL_ENERGY]),
  BOOST_ENERGY_245 ("Boost Energy", "245", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  DNA_ENERGY_246 ("DNA Energy", "246", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  FULL_HEAL_ENERGY_247 ("Full Heal Energy", "247", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  LOST_ENERGY_248 ("Lost Energy", "248", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  POTION_ENERGY_249 ("Potion Energy", "249", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  SCRAMBLE_ENERGY_250 ("Scramble Energy", "250", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  ROCKETS_ENERGY_RF_251 ("Rocket's Energy RF", "251", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  ROCKETS_ENERGY_GL_252 ("Rocket's Energy GL", "252", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  ROCKETS_ENERGY_WP_253 ("Rocket's Energy WP", "253", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  ROCKET_S_COUNTER_ATTACK_254 ("Rocket's Counter Attack", "254", Rarity.SECRET, [TRAINER, G_SPEC]),
  CRUSHING_HAMMER_255 ("Crushing Hammer", "255", Rarity.SECRET, [TRAINER, G_SPEC]),
  DOWSING_MACHINE_256 ("Dowsing Machine", "256", Rarity.SECRET, [TRAINER, G_SPEC]),
  Elixir_257 ("Elixir", "257", Rarity.SECRET, [TRAINER, G_SPEC]),
  EXPERT_BELT_258 ("Expert Belt", "258", Rarity.SECRET, [TRAINER, G_SPEC]),
  G_SCOPE_259 ("G Scope", "259", Rarity.SECRET, [TRAINER, G_SPEC]),
  Hacker_260 ("Hacker", "260", Rarity.SECRET, [TRAINER, G_SPEC]),
  LOST_MEDALLION_261 ("Lost Medallion", "261", Rarity.SECRET, [TRAINER, G_SPEC]),
  MASTER_BALL_262 ("Master Ball", "262", Rarity.SECRET, [TRAINER, G_SPEC]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodImperium(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_IMPERIUM;
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
      case BULBASAUR_1:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Leech Seed", {
          text "10 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Bulbasaur."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case IVYSAUR_2:
      return evolution (this, from:"Bulbasaur", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Vine Whip", {
          text "30 damage. "
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VENUSAUR_3:
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:2) {
        weakness R
        pokePower "Energy Trans", {
          text "As often as you like during your turn (before your attack), you may take 1 [G] Energy card attached to 1 of your Pokémon and attach it to a different one (excluding Pokémon-ex). This power can't be used if Venusaur is affected by a Special Condition."
          actionA {
          }
        }
        move "Solarbeam", {
          text "60 damage. "
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CHARMANDER_4:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ember", {
          text "30 damage. Discard 1 [R] Energy card attached to Charmander in order to use this attack."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CHARMELEON_5:
      return evolution (this, from:"Charmander", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Slash", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Charmeleon in order to use this attack."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CHARIZARD_6:
      return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:3) {
        weakness W
        resistance F, MINUS30
        pokePower "Energy Burn", {
          text "As often as you like during your turn (before your attack), you may turn all Basic Energy attached to Charizard into [R] Energy for the rest of the turn. This power can't be used if Charizard is affected by a Special Condition."
          actionA {
          }
        }
        move "Fire Spin", {
          text "100 damage. Discard 2 [R] Energy attached to Charizard in order to use this attack."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SQUIRTLE_7:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Shell Attack", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WARTORTLE_8:
      return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Withdraw", {
          text "Flip a coin. If heads, prevent all damage done to Wartortle during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost W, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bite", {
          text "40 damage. "
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BLASTOISE_9:
      return evolution (this, from:"Wartortle", hp:HP100, type:W, retreatCost:3) {
        weakness L
        pokePower "Rain Dance", {
          text "As often as you like during your turn (before your attack), you may attach 1 [W] Energy Card to 1 of your [W] Pokémon (excluding Pokémon-ex). (This doesn't use up your 1 Energy card attachment for the turn.) This power can't be used if Blastoise is affected by a Special Condition."
          actionA {
          }
        }
        move "Hydro Pump", {
          text "40+ damage. Does 40 damage plus 10 more damage for each [W] Energy attached to Blastoise but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CATERPIE_10:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "String Shot", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case METAPOD_11:
      return evolution (this, from:"Caterpie", hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Stiffen", {
          text "Flip a coin. If heads, prevent all damage done to Metapod during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Stun Spore", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BUTTERFREE_12:
      return evolution (this, from:"Metapod", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Whirlwind", {
          text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Drain", {
          text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WEEDLE_13:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Poison Sting", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KAKUNA_14:
      return evolution (this, from:"Weedle", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Stiffen", {
          text "Flip a coin. If heads, prevent all damage done to Kakuna during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Poisonpowder", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BEEDRILL_15:
      return evolution (this, from:"Kakuna", hp:HP090, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Twineedle", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Poison Sting", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PIDGEY_16:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "10 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIDGEOTTO_17:
      return evolution (this, from:"Pidgey", hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mirror Move", {
          text "If Pidgeotto was attacked last turn, do the final result of that attack on Pidgeotto to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIDGEOT_18:
      return evolution (this, from:"Pidgeotto", hp:HP080, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Quick Search", {
          text "Once during your turn (before your attack), you may choose 1 card from your deck and put it into your hand. If you do, put 2 damage counters on Pidgeot. Shuffle your deck afterward. You can't use more than 1 Quick Search Pokémon Power each turn. This Power can't be used if Pidgeot is affected by a Special Condition."
          actionA {
          }
        }
        move "Hurricane", {
          text "30 damage. Unless this attack Knocks Out the Defending Pokémon, return the Defending Pokémon and all cards attached to it to your opponent's hand."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RATTATA_19:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RATICATE_20:
      return evolution (this, from:"Rattata", hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Fang", {
          text "Does damage to the Defending Pokémon equal to half the Defending Pokémon's remaining HP (rounded up to the nearest 10)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SPEAROW_21:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mirror Move", {
          text "If Spearow was attacked last turn, do the final result of that attack on Spearow to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FEAROW_22:
      return evolution (this, from:"Spearow", hp:HP080, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Fearow."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Drill Peck", {
          text "40 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case EKANS_23:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Sting", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_ARBOK_24:
      return evolution (this, from:"Ekans", hp:HP060, type:G, retreatCost:2) {
        weakness P
        move "Stare", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.) If that Pokémon has a Poké-Power, that power stops working until the end of your opponent's next turn."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Vapor", {
          text "20 damage. The Defending Pokémon is now Poisoned. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PIKACHU_25:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Recharge", {
          text "Search your deck for a [L] Energy card and attach it to Pikachu. Shuffle your deck afterward."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunder Jolt", {
          text "50 damage. Discard all Energy cards attached to Pikachu in order to use this attack."
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAICHU_26:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Raichu."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder", {
          text "60 damage. Flip a coin. If tails, Raichu does 30 damage to itself."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SANDSHREW_27:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Sand-attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SANDSLASH_28:
      return evolution (this, from:"Sandshrew", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Slash", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fury Swipes", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NIDORAN_FEMALE_29:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness P
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon named Nidoran♂ or Nidoran♀ and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case NIDORINA_30:
      return evolution (this, from:"Nidoran♀", hp:HP080, type:G, retreatCost:1) {
        weakness P
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {

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
      case NIDOQUEEN_7:
      return evolution (this, from:"Nidorina", hp:HP100, type:G, retreatCost:3) {
        weakness P
        move "Boyfriends", {
          text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Punch", {
          text "50 damage. "
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NIDORAN_MALE_32:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Horn Hazard", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case NIDORINO_33:
      return evolution (this, from:"Nidoran♂", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Double Kick", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Horn Drill", {
          text "50 damage. "
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NIDOKING_34:
      return evolution (this, from:"Nidorino", hp:HP100, type:G, retreatCost:3) {
        weakness P
        move "Thrash", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Nidoking does 10 damage to itself."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Toxic", {
          text "40 damage. The Defending Pokémon is now Poisoned. It now takes 20 Poison damage instead of 10 after each player's turn (even if it was already Poisoned)."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CLEFAIRY_35:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Sing", {
          text "Flip a coin. If heads, Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metronome", {
          text "Choose 1 of Defending Pokémon's attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding energy cards. (No matter what type the Defending Pokémon is, Clefairy's type is still [C].)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CLEFABLE_36:
      return evolution (this, from:"Clefairy", hp:HP070, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Metronome", {
          text "Choose 1 of the Defending Pokémon's attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable's type is still [C].)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Minimize", {
          text "All damage done by attacks to Clefable during your opponent's next turn is reduced by 20 (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GOLEM_36:
      return evolution (this, from:"Graveler", hp:HP100, type:F, retreatCost:4) {
        weakness G
        move "Avalanche", {
          text "60 damage. "
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Selfdestruct", {
          text "100 damage. Does 20 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Golem does 100 damage to itself."
          energyCost F, F, F, F
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case VULPIX_37:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NINETALES_38:
      return evolution (this, from:"Vulpix", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Lure", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Fire Blast", {
          text "80 damage. Discard 2 [R] Energy cards attached to Ninetales in order to use this attack."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case JIGGLYPUFF_39:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Lullaby", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pound", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WIGGLYTUFF_40:
      return evolution (this, from:"Jigglypuff", hp:HP080, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Lullaby", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Do the Wave", {
          text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ZUBAT_41:
      return basic (this, hp:HP040, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        move "Ram", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_GOLBAT_42:
      return evolution (this, from:"Zubat", hp:HP050, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        pokePower "Sneak Attack", {
          text "When you play Dark Golbat from your hand, you may choose 1 of your opponent's Pokémon. If you do, Dark Golbat does 10 damage to that Pokémon. Apply Weakness and Resistance."
          actionA {
          }
        }
        move "Flitter", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost G, G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ODDISH_43:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Sleep Powder", {
          text "The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Poisonpowder", {
          text "The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DARK_GLOOM_44:
      return evolution (this, from:"Oddish", hp:HP050, type:G, retreatCost:2) {
        weakness R
        pokePower "Pollen Stench", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, the Defending Pokémon is now Confused; if tails, your Active Pokémon is now Confused. This power can't be used if Dark Gloom is affected by a Special Condition."
          actionA {
          }
        }
        move "Poisonpowder", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DARK_VILEPLUME_45:
      return evolution (this, from:"Gloom", hp:HP060, type:G, retreatCost:2) {
        weakness R
        pokePower "Hay Fever", {
          text "No Trainer cards can be played (except Supporter cards). This power stops working if Dark Vilplume has any Trainer cards attached to it, or while Dark Vileplume is affected by a Special Condition."
          actionA {
          }
        }
        move "Petal Whirlwind", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads. If you get 2 or more heads, Dark Vileplume is now Confused (after dealing damage)."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PARAS_46:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "20 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spore", {
          text "The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PARASECT_47:
      return evolution (this, from:"Paras", hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Spore", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VENONAT_48:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Stun Spore", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Leech Life", {
          text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VENOMOTH_49:
      return evolution (this, from:"Venonat", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        pokePower "Shift", {
          text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than [C], [D] or [M]. This power can't be used if Venomoth is affected by a Special Condition."
          actionA {
          }
        }
        move "Venom Powder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DIGLETT_50:
      return basic (this, hp:HP030, type:F, retreatCost:0) {
        weakness G
        resistance L, MINUS30
        move "Dig", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "30 damage. "
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DUGTRIO_51:
      return evolution (this, from:"Diglett", hp:HP080, type:F, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Slash", {
          text "40 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Earthquake", {
          text "70 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, F
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case MEOWTH_52:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Pay Day", {
          text "10 damage. Flip a coin. If heads, draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PERSIAN_53:
      return evolution (this, from:"Meowth", hp:HP070, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Scratch", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Pounce", {
          text "30 damage. If the Defending Pokémon attacks Persian during your opponent's next turn, any damage done by the attack is reduced by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PSYDUCK_54:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Dizziness", {
          text "Draw a card."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Water Gun", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to Psyduck but not used to pay for this attack. You can't add more than 20 damage in this way."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLDUCK_55:
      return evolution (this, from:"Psyduck", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hyper Beam", {
          text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SLOWPOKE_79:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Spacing Out", {
          text "Flip a coin. If heads, remove a damage counter from Slowpoke. This attack can't be used if Slowpoke has no damage counters on it."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Scavenge", {
          text "Discard 1 [P] Energy card attached to Slowpoke in order to use this attack. Put a Trainer card from your discard pile into your hand."
          energyCost P, P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MANKEY_56:
      return basic (this, hp:HP050, type:F, retreatCost:0) {
        weakness P
        pokePower "Peek", {
          text "Once during your turn (before your attack), you may look at one of the following: the top card of either player's deck, a random card from your opponent's hand, or one of either player's Prizes. This power can't be used if Mankey is affected by a Special Condition."
          actionA {
          }
        }
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DARK_PRIMEAPE_57:
      return evolution (this, from:"Mankey", hp:HP060, type:F, retreatCost:1) {
        weakness P
        pokePower "Frenzy", {
          text "If Dark Primeape does any damage while it's Confused (even to itself), it does 30 more damage."
          actionA {
          }
        }
        move "Frenzied Attack", {
          text "40 damage. Dark Primeape is now Confused (after doing damage)."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GROWLITHE_58:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ARCANINE_59:
      return evolution (this, from:"Growlithe", hp:HP100, type:R, retreatCost:3) {
        weakness W
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Arcanine in order to use this attack."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Take Down", {
          text "80 damage. Arcanine does 30 damage to itself."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case POLIWAG_60:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness G
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Poliwag but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case POLIWHIRL_61:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
        weakness G
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost W, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Doubleslap", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case POLIWRATH_62:
      return evolution (this, from:"Poliwhirl", hp:HP100, type:W, retreatCost:3) {
        weakness G
        move "Water Gun", {
          text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Poliwrath but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Whirlpool", {
          text "40 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ABRA_63:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        move "Vanish", {
          text "Shuffle Abra into your deck. (Discard all cards attached to Abra.)"
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KADABRA_64:
      return evolution (this, from:"Abra", hp:HP060, type:P, retreatCost:3) {
        weakness P
        move "Recover", {
          text "Discard 1 [P] Energy card attached to Kadabra in order to use this attack. Remove all damage counters from Kadabra."
          energyCost P, P
          attackRequirement {}
          onAttack {

          }
        }
        move "Super Psy", {
          text "50 damage. "
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ALAKAZAM_65:
      return evolution (this, from:"Kadabra", hp:HP080, type:P, retreatCost:3) {
        weakness P
        pokePower "Damage Swap", {
          text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to another as long as you don't Knock Out that Pokémon. This power can't be used if Alakazam is affected by a Special Condition."
          actionA {
          }
        }
        move "Confuse Ray", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MACHOP_66:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Low Kick", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOKE_67:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:3) {
        weakness P
        move "Karate Chop", {
          text "Does 50 damage minus 10 damage for each damage counter on Machoke."
          energyCost F, F, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Submission", {
          text "60 damage. Machoke does 20 damage to itself."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MACHAMP_68:
      return evolution (this, from:"Machoke", hp:HP100, type:F, retreatCost:3) {
        weakness P
        pokePower "Strikes Back", {
          text "Whenever your opponent's attack damages Machamp (even if Machamp is Knoced Out), this power does 10 damage to the attacking Pokémon. (Don't apply Weakness and Resistance.) This power can't be used if Machamp is already Asleep, Confused, or Paralyzed when your opponent attacks."
          actionA {
          }
        }
        move "Seismic Toss", {
          text "60 damage. "
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case BELLSPROUT_69:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Vine Whip", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon named Bellsprout and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case WEEPINBELL_70:
      return evolution (this, from:"Bellsprout", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Poisonpowder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Razor Leaf", {
          text "30 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VICTREEBEL_71:
      return evolution (this, from:"Weepinbell", hp:HP090, type:G, retreatCost:2) {
        weakness R
        move "Lure", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Acid", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TENTACOOL_72:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        pokemonPower "Cowardice", {
          text "At any time during your turn (before your attack), you may return Tentacool to your hand. (Discard all cards attached to Tentacool.) This power can't be used the turn you put Tentacool into play or if Tentacool is affected by a Special Condition."
          actionA {
          }
        }
        move "Acid", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TENTACRUEL_73:
      return evolution (this, from:"Tentacool", hp:HP060, type:W, retreatCost:0) {
        weakness L
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Jellyfish Sting", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GEODUDE_74:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Stone Barrage", {
          text "10x damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GRAVELER_75:
      return evolution (this, from:"Geodude", hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Harden", {
          text "During your opponent's next turn, whenever 30 or less damage is done to Graveler (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
          energyCost F, F
          attackRequirement {}
          onAttack {

          }
        }
        move "Rock Throw", {
          text "40 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PONYTA_77:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Smash Kick", {
          text "20 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flame Tail", {
          text "30 damage. "
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RAPIDASH_78:
      return evolution (this, from:"Ponyta", hp:HP070, type:R, retreatCost:0) {
        weakness W
        move "Stomp", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Rapidash."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SLOWBRO_80:
      return evolution (this, from:"Slowpoke", hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Strange Behavior", {
          text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to Slowbro as long as you don't Knock Out Slowbro. This power can't be used if Slowbro is affected by a Special Condition."
          actionA {
          }
        }
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGNEMITE_81:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Selfdestruct", {
          text "40 damage. Does 10 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Magnemite does 40 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DARK_MAGNETON_82:
      return evolution (this, from:"Magnemite", hp:HP060, type:L, retreatCost:2) {
        weakness F
        move "Sonicboom", {
          text "20 damage. Don't apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnetic Lines", {
          text "30 damage. If the Defending Pokémon has any Basic Energy cards attached to it, choose 1 of them. If your opponent has any Benched Pokémon, choose 1 of them and attach that Energy card to it."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FARFETCHD_83:
      return basic (this, hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Leek Slap", {
          text "30 damage. Flip a coin. If tails, this attack does nothing. Either way, you can't use this attack again as long as Farfetch'd stays in play (even putting Farfetch'd on the Bench won't let you use it again)."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Pot Smash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DODUO_84:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Fury Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DODRIO_85:
      return evolution (this, from:"Doduo", hp:HP070, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Retreat Aid", {
          text "As long as Dodrio is Benched, pay 1 [C] less to retreat your Active Pokémon."
          actionA {
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEEL_86:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DEWGONG_87:
      return evolution (this, from:"Seel", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Aurora Beam", {
          text "40 damage. "
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Ice Beam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRIMER_88:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Nasty Goo", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Minimize", {
          text "All damage done by attacks to Grimer during your opponent's next turn is reduced by 20 (after applying Weakness and Resistance)."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DARK_MUK_89:
      return evolution (this, from:"Grimer", hp:HP060, type:G, retreatCost:2) {
        weakness P
        pokemonPower "Sticky Goo", {
          text "As long as Dark Muk is your Active Pokémon, your opponent pays 2 more to retreat his or her Active Pokémon. This power stops working while Dark Muk is Asleep, Confused, or Paralyzed."
          actionA {
          }
        }
        move "Sludge Punch", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHELLDER_90:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hide in Shell", {
          text "Flip a coin. If heads, prevent all damage done to Shellder during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CLOYSTER_91:
      return evolution (this, from:"Shellder", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Clamp", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing (not even damage)."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Spike Cannon", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GASTLY_92:
      return basic (this, hp:HP050, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        move "Lick", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Energy Conversion", {
          text "Put up to 2 Energy cards from your discard pile into your hand. Gastly does 10 damage to itself."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HAUNTER_93:
      return evolution (this, from:"Gastly", hp:HP060, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        pokemonPower "Transparency", {
          text "Whenever an attack does anything to Haunter, flip a coin. If heads, prevent all effects of that attack, including damage, done to Haunter. This power stops working while Haunter is affected by a Special Condition."
          actionA {
          }
        }
        move "Nightmare", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GENGAR_94:
      return evolution (this, from:"Haunter", hp:HP080, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokePower "Curse", {
          text "Once during your turn (before your attack), you may move 1 damage counter from 1 of your opponent's Pokémon to another (even if it would Knock Out the other Pokémon). This power can't be used if Gengar is affected by a Special Condition."
          actionA {
          }
        }
        move "Dark Mind", {
          text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ONIX_95:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
        weakness G
        move "Rock Throw", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Harden", {
          text "During your opponent's next turn, whenever 30 or less damage is done to Onix (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
          energyCost F, F
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DROWZEE_96:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Long-Distance Hypnosis", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, the Defending Pokémon is now Asleep; if tails, your Active Pokémon is now Asleep. The power can't be used if Drowzee is affected by a Special Condition."
          actionA {
          }
        }
        move "Nightmare", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case HYPNO_97:
      return evolution (this, from:"Drowzee", hp:HP090, type:P, retreatCost:2) {
        weakness P
        move "Prophecy", {
          text "Look at up to 3 cards from the top of either player's deck and rearrange them as you like."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Dark Mind", {
          text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case KRABBY_98:
      return basic (this, hp:HP050, type:W, retreatCost:2) {
        weakness L
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon named Krabby and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Irongrip", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KINGLER_99:
      return evolution (this, from:"Krabby", hp:HP060, type:W, retreatCost:3) {
        weakness L
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Kingler."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Crabhammer", {
          text "40 damage. "
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VOLTORB_100:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELECTRODE_101:
      return evolution (this, from:"Voltorb", hp:HP080, type:L, retreatCost:1) {
        weakness F
        pokePower "Buzzap", {
          text "At any time during your turn (before your attack) you may Knock Out Electrode and attach it to 1 of your other Pokémon. If you do, choose a type of Energy. Electrode is now an Energy card (instead of a Pokémon) that provides 2 energy of that type. This power can't be used if Electrode is affected by a Special Condition."
          actionA {
          }
        }
        move "Electric Shock", {
          text "50 damage. Flip a coin. If tails, Electrode does 10 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case EXEGGCUTE_102:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Leech Seed", {
          text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Exeggcute."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case EXEGGUTOR_103:
      return evolution (this, from:"Exeggcute", hp:HP080, type:G, retreatCost:3) {
        weakness R
        move "Teleport", {
          text "Switch Exeggutor with 1 of your Benched Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Big Eggsplosion", {
          text "20x damage. Flip a number of coins equal to the number of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CUBONE_104:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Snivel", {
          text "If the Defending Pokémon attacks Cubone during your opponent's next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAROWAK_105:
      return evolution (this, from:"Cubone", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Bonemerang", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Call for Friend", {
          text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost F
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HITMONLEE_106:
      return basic (this, hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Stretch Kick", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
        move "High Jump Kick", {
          text "50 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case HITMONCHAN_107:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness P
        move "Jab", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Special Punch", {
          text "40 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LICKITUNG_108:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Tongue Wrap", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KOFFING_109:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Foul Gas", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned; if tails, it is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DARK_WEEZING_110:
      return evolution (this, from:"Koffing", hp:HP060, type:G, retreatCost:1) {
        weakness P
        move "Mass Explosion", {
          text "20x damage. Does 20 damage times the total number of Koffing, Weezing, and Dark Weezing in play (Apply Weakness and Resistance.). Then, this attack does 20 damage to each Koffing, Weezing, and Dark Weezing (even your own). Don't apply Weakness and Resistance."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Stun Gas", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned; if tails, the Defending Pokémon is now Paralyzed."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RHYHORN_111:
      return basic (this, hp:HP070, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Rhyhorn during your opponent's next turn. (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Horn Attack", {
          text "30 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RHYDON_112:
      return evolution (this, from:"Rhyhorn", hp:HP100, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Horn Attack", {
          text "30 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Ram", {
          text "50 damage. Rhydon does 20 damage to itself. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon. Switch the Pokémon even if Rhydon is knocked out.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CHANSEY_113:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Scrunch", {
          text "Flip a coin. If heads, prevent all damage done to Chansey during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Double-edge", {
          text "80 damage. Chansey does 80 damage to itself."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case TANGELA_114:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Bind", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KANGASKHAN_115:
      return basic (this, hp:HP090, type:C, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Fetch", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Comet Punch", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HORSEA_116:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEADRA_117:
      return evolution (this, from:"Horsea", hp:HP070, type:W, retreatCost:0) {
        weakness L
        move "Water Gun", {
          text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Seadra but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Seadra."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLDEEN_118:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Horn Attack", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEAKING_119:
      return evolution (this, from:"Goldeen", hp:HP070, type:W, retreatCost:0) {
        weakness L
        move "Horn Attack", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Waterfall", {
          text "30 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case STARYU_120:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Slap", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case STARMIE_121:
      return evolution (this, from:"Staryu", hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Recover", {
          text "Discard 1 [W] Energy card attached to Starmie in order to use this attack. Remove all damage counters from Starmie."
          energyCost W, W
          attackRequirement {}
          onAttack {

          }
        }
        move "Star Freeze", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MR_MIME_122:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Invisible Wall", {
          text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can't be used if Mr. Mime is affected by a Special Condition."
          delayedA {
          }
        }
        move "Meditate", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SCYTHER_123:
      return basic (this, hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Swords Dance", {
          text "During your next turn, Scyther's Slash attack's base damage is 60 instead of 30."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case JYNX_124:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Meditate", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ELECTABUZZ_125:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunderpunch", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Electabuzz does 10 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MAGMAR_126:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Smog", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PINSIR_127:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Irongrip", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Guillotine", {
          text "50 damage. "
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TAUROS_128:
      return basic (this, hp:HP060, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Stomp", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rampage", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. Flip a coin. If tails, Tauros is now Confused (after doing damage)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGIKARP_129:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Flop", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rapid Evolution", {
          text "Search your deck for an Evolution card named Gyarados or Dark Gyarados and put it on Magikarp. (This counts as evolving Magikarp.) Shuffle your deck afterward."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GYARADOS_130:
      return evolution (this, from:"Magikarp", hp:HP100, type:W, retreatCost:3) {
        weakness L
        resistance F, MINUS30
        move "Dragon Rage", {
          text "50 damage. "
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Bubblebeam", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LAPRAS_131:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Lapras but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DITTO_132:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Transform", {
          text "If Ditto is your Active Pokémon, treat it as if it were the same card as the Defending Pokémon, including type, Hit Points, Weakness, and so on, except Ditto can't evolve, always has this Poké-Power, and you may treat any Energy attached to Ditto as Energy of any type. Ditto isn't a copy of any other Pokémon while Ditto is affected by a Special Condition."
          delayedA {
          }
        }

      };
      case EEVEE_133:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Tail Wag", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Eevee during your opponent's next turn. (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DARK_VAPOREON_134:
      return evolution (this, from:"Eevee", hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Bite", {
          text "30 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Whirlpool", {
          text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_JOLTEON_135:
      return evolution (this, from:"Eevee", hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Lightning Flash", {
          text "20 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder Attack", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, Dark Jolteon does 10 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_FLAREON_136:
      return evolution (this, from:"Eevee", hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dark Flareon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Playing with Fire", {
          text "30+ damage. Use this attack only if there are any Energy cards attached to Dark Flareon. Flip a coin. If heads, discard 1 of those Energy cards and this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PORYGON_137:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        resistance P, MINUS30
        move "Conversion 1", {
          text "If Defending Pokémon has a Weakness, you may change it to a type of your choice other than [C]."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psybeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLOAT_STONE_137:
      return pokemonTool (this) {
        text "The Retreat Cost of the Pokémon this card is attached to is reduced by [C][C]."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case OMANYTE_138:
      return evolution (this, from:"Mysterious Fossil", hp:HP050, type:W, retreatCost:1) {
        weakness G
        resistance R, MINUS30
        pokeBody "Clairvoyance", {
          text "Your opponent plays with his or her hand face up. This power stops working while Omanyte is affected by a Special Condition."
          delayedA {
          }
        }
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Omanyte but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case OMASTAR_139:
      return evolution (this, from:"Omanyte", hp:HP080, type:W, retreatCost:1) {
        weakness G
        resistance R, MINUS30
        move "Water Gun", {
          text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Omastar but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spike Cannon", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case KABUTO_140:
      return evolution (this, from:"Mysterious Fossil", hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance R, MINUS30
        pokeBody "Kabuto Armor", {
          text "Whenever an attack (even your own) does damage to Kabuto (after applying Weakness and Resistance), that attack only does half the damage to Kabuto (rounded down to nearest 10). (Any other effects of attacks still happen.) This power stops working while Kabuto is affected by a Special Condition."
          delayedA {
          }
        }
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KABUTOPS_141:
      return evolution (this, from:"Kabuto", hp:HP080, type:F, retreatCost:1) {
        weakness G
        resistance R, MINUS30
        move "Sharp Sickle", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Absorb", {
          text "40 damage. Remove a number of damage counters from Kabutops equal to half the damage done to Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Kabutops has fewer damage counters than that, remove all of them."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case AERODACTYL_142:
      return evolution (this, from:"Mysterious Fossil", hp:HP060, type:F, retreatCost:2) {
        weakness G
        resistance F, MINUS30
        pokeBody "Prehistoric Power", {
          text "No more Evolution cards can be played. This power stops working while Aerodactyl is affected by a Special Condition."
          delayedA {
          }
        }
        move "Wing Attack", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SNORLAX_143:
      return basic (this, hp:HP090, type:C, retreatCost:4) {
        weakness F
        resistance P, MINUS30
        pokeBody "Thick Skinned", {
          text "Snorlax can't be affected by Special Conditions."
          delayedA {
          }
        }
        move "Body Slam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARTICUNO_144:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness M
        resistance F, MINUS30
        move "Freeze Dry", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Blizzard", {
          text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. If tails, this attack does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W, W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ZAPDOS_145:
      return basic (this, hp:HP090, type:L, retreatCost:3) {
        move "Thunder", {
          text "60 damage. Flip a coin. If tails, Zapdos does 30 damage to itself."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Thunderbolt", {
          text "100 damage. Discard 3 [L] Energy cards attached to Zapdos in order to use this attack."
          energyCost L, L, L, L
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MOLTRES_146:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        resistance F, MINUS30
        move "Wildfire", {
          text "You may discard any number of [R] Energy cards attached to Moltres when you use this attack. If you do, discard that many cards from the top of your opponent's deck."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Dive Bomb", {
          text "80 damage. Flip a coin. If tails, this attack does nothing."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case DRATINI_147:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Pound", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DRAGONAIR_148:
      return evolution (this, from:"Dratini", hp:HP080, type:C, retreatCost:2) {
        resistance P, MINUS30
        move "Slam", {
          text "Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Hyper Beam", {
          text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DRAGONITE_149:
      return evolution (this, from:"Dragonair", hp:HP100, type:C, retreatCost:1) {
        resistance F, MINUS30
        pokePower "Step In", {
          text "Once during your turn (before you attack) if Dragonite is on your Bench, you may switch it with your Active Pokémon."
          actionA {
          }
        }
        move "Slam", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MEWTWO_150:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Psychic", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Barrier", {
          text "Discard 1 [P] Energy card attached to Mewtwo in order to use this attack. During your opponent's next turn, prevent all effects of attacks, including damage, done to Mewtwo."
          energyCost P, P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEW_151:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psywave", {
          text "10x damage. Does 10 damage times the number of Energy cards attached to the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Devolution Beam", {
          text "Choose an evolved Pokémon (your own or your opponent's). Return the highest Stage Evolution card on that Pokémon to its player's hand. That Pokémon is no longer affected by a Special Condition, or anything else that might be the result of an attack (just as if you had evolved it)."
          energyCost P, P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case POKE_BALL_152:
      return basicTrainer (this) {
        text "Flip a coin. If heads, you may search your deck for any Basic Pokémon or Evolution card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case DUAL_BALL_153:
      return basicTrainer (this) {
        text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case LEVEL_BALL_154:
      return basicTrainer (this) {
        text "Search your deck for a Pokémon with 50 HP or less, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case HEAVY_BALL_155:
      return basicTrainer (this) {
        text "Search your deck for a Pokémon with a Retreat cost of 3 or more, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROCKET_BALL_156:
      return basicTrainer (this) {
        text "Flip 2 coins. For each heads, search your deck for a Pokémon with Dark in its name. Show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_BREEDER_157:
      return basicTrainer (this) {
        text "Put a Stage 2 Evolution card from your hand on the matching Basic Pokémon. You can only play this card when you would be allowed to evolve that Pokémon anyway."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_BREEDER_FIELDS_158:
      return basicTrainer (this) {
        text "Flip a coin for 1 or 2 of your Pokémon in play that can evolve. For each heads, search your deck for a later-Stage card that matches that Pokémon. Then put that card into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_TRADER_159:
      return basicTrainer (this) {
        text "Trade 1 of the Basic Pokémon or Evolution cards in your hand for 1 of the Basic Pokémon or Evolution cards from your deck. Show both cards to your opponent. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_FLUTE_160:
      return basicTrainer (this) {
        text "Choose 1 Basic Pokémon card from your opponent's discard pile and put it onto his or her Bench. (You can't play Pokémon Flute if your opponent's Bench is full.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEDEX_161:
      return basicTrainer (this) {
        text "Look at up to 5 cards from the top of your deck and rearrange them as you like."
        onPlay {
        }
        playRequirement{
        }
      };
      case POTION_162:
      return basicTrainer (this) {
        text "Remove up to 2 damage counters from 1 of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case SUPER_POTION_163:
      return basicTrainer (this) {
        text "Discard 1 Energy card attached to 1 of your own Pokémon in order to remove up to 4 damage counters from that Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case FULL_HEAL_164:
      return basicTrainer (this) {
        text "Remove all Special Conditions from your Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case REVIVE_165:
      return basicTrainer (this) {
        text "Put 1 Basic Pokémon card (excluding Pokémon-ex) from your discard pile onto your Bench. Put damage counters on that Pokémon equal to half its HP (rounded down to the nearest 10). (You can't play Revive if your Bench is full.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case PLUSPOWER_166:
      return basicTrainer (this) {
        text "Attach PlusPower to your Active Pokémon (excluding [D] Pokémon). At the end of your turn, discard PlusPower. If this Pokémon's attack does damage to the Defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case DEFENDER_167:
      return basicTrainer (this) {
        text "Attach Defender to 1 of your Pokémon (excluding [M] Pokémon). At the end of your opponent's next turn, discard Defender. Damage done to that Pokémon by attacks is reduced by 20 (after applying Weakness and Resistance)."
        onPlay {
        }
        playRequirement{
        }
      };
      case DEVOLUTION_SPRAY_168:
      return basicTrainer (this) {
        text "Choose 1 of your own Pokémon in play and a Stage of Evolution. Discard all Evolution cards of that Stage or higher attached to that Pokémon. That Pokémon is no longer affected by a Special Condition, or anything else that might be the result of an attack (just as if you had evolved it)."
        onPlay {
        }
        playRequirement{
        }
      };
      case BROCK_169:
      return basicTrainer (this) {
        text "Remove 1 damage counter from each of your Pokémon (excluding Pokémon-ex) that has any damage counters on it."
        onPlay {
        }
        playRequirement{
        }
      };
      case LT_SURGE_170:
      return basicTrainer (this) {
        text "You can play this card only if you have at least 1 Basic Pokémon card in your hand. Put a Basic Pokémon card from your hand into play as your Active Pokémon. Put your old Active Pokémon onto your Bench. (You can't play this card if your Bench is full.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case ERIKA_171:
      return basicTrainer (this) {
        text "You may draw up to 3 cards, then your opponent may draw up to 3 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case LORELEI_172:
      return supporter (this) {
        text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case BRUNO_173:
      return supporter (this) {
        text "If it's your first turn, you can't play this card. Draw 2 cards. During this turn, your Pokémon's attacks do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
        onPlay {
        }
        playRequirement{
        }
      };
      case AGATHA_174:
      return supporter (this) {
        text "Choose 1 of your Pokémon in play (excluding Pokémon-ex). Return that Pokémon and all cards attached to it to your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case LANCE_175:
      return supporter (this) {
        text "Move as many Energy cards attached to 1 of your Pokémon as you like to another of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case GARY_OAK_176:
      return supporter (this) {
        text "Draw cards until you have 6 cards in your hand. If it's your first turn, draw cards until you have 8 cards in your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case ASH_177:
      return supporter (this) {
        text "If it's your first turn, you can't play this card. Attach a basic Energy card from your hand to 1 of your Benched Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_OAK_178:
      return supporter (this) {
        text "Discard your hand, then draw 7 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case IMPOSTER_PROFESSOR_OAK_179:
      return basicTrainer (this) {
        text "Your opponent shuffles his or her hand into his or her deck, then draws 7 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case IMPOSTER_OAKS_REVENGE_180:
      return supporter (this) {
        text "Discard a card from your hand in order to play this card. Your opponent shuffles his or her hand into his or her deck, then draws 4 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case NURSE_JOY_181:
      return supporter (this) {
        text "Remove up to 3 damage counters and all Special Conditions from 1 of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_CENTER_182:
      return basicTrainer (this) {
        text "Remove all damage counters from 1 of your own Pokémon, then discard all Energy cards attached to that Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case OFFICER_JENNY_183:
      return supporter (this) {
        text "Search your deck for up to 3 Basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case BILL_184:
      return basicTrainer (this) {
        text "Draw 2 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case MR_FUJI_185:
      return supporter (this) {
        text "Choose a Pokémon on your Bench (excluding Pokémon-ex). Shuffle it and any cards attached to it into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case THE_EEVEE_BROTHERS_WAGER_186:
      return supporter (this) {
        text "Each player shuffles his or her hand into his or her deck, then you and your opponent play "Rock-Paper-Scissors". The player who wins draws up to 6 cards. The player who loses draws up to 3 cards. (You draw your cards first.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case RITCHIE_187:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, draw 4 cards. If any of your Pokémon were Knocked Out during your opponent's last turn, draw 4 more cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_IVY_188:
      return supporter (this) {
        text "Search your deck for up to 2 in any combination of Basic Pokémon and Basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case LASS_189:
      return supporter (this) {
        text "You and your opponent show each other your hands, then shuffle all the Trainer cards from your hands into your decks."
        onPlay {
        }
        playRequirement{
        }
      };
      case SAMURAI_190:
      return supporter (this) {
        text "Draw 3 cards"
        onPlay {
        }
        playRequirement{
        }
      };
      case HEALING_FIELDS_191:
      return stadium (this) {
        text "Once during each player's turn, he or she may flip a coin. If heads, that player's Active Pokémon (exluding Pokémon-ex) is no longer affected by any Special Conditions."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case POKEMON_POOL_PARTY_192:
      return stadium (this) {
        text "Once during each player's turn, that player may draw cards until he or she has 7 cards in his or her hand. If he or she does, that player's turn ends."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case LOST_WORLD_193:
      return stadium (this) {
        text "Once during each player's turn, he or she may flip a coin. If heads, put 1 damage counter on each of their opponent's Benched Pokémon. If tails, put 1 damage counter on each of their own Benched Pokémon. (This can't be done if either player has less than 3 Benched Pokémon in play."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case CRYSTAL_BEACH_194:
      return stadium (this) {
        text "Each Special Energy that provides 2 or more Energy (both yours and your opponent's) now provides only 1 [C] Energy. This isn't affected by any Poké-Powers or Poké-Bodies."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case ROCKETS_DUNGEON_195:
      return stadium (this) {
        text "Each Pokémon in play with Dark in its name can use the attack on this card instead of its own."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case ROCKETS_HIDEOUT_196:
      return stadium (this) {
        text "Each Pokémon in play with Dark or Rocket's in its name (excluding Pokémon-ex) gets +10 HP."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case THE_ROCKETS_TRAINING_GYM_197:
      return stadium (this) {
        text "Each player pays [C, C] more to retreat his or her Active Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case HERE_COMES_TEAM_ROCKET_198:
      return basicTrainer (this) {
        text "Each player plays with his or her Prize cards face up for the rest of the game."
        onPlay {
        }
        playRequirement{
        }
      };
      case GOOP_GAS_ATTACK_199:
      return basicTrainer (this) {
        text "All Poké-Powers and Poké-Bodies stop working until the end of your opponent's next turn."
        onPlay {
        }
        playRequirement{
        }
      };
      case THE_BOSSS_WAY_200:
      return basicTrainer (this) {
        text "Search your deck for an Evolution card with Dark in its name. Show it to your opponent and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case THE_ROCKETS_TRAP_201:
      return basicTrainer (this) {
        text "Flip a coin. If heads, choose up to 3 cards at random from your opponent's hand (without looking at them). Your opponent shuffles those cards into his or her deck. You can't play The Rocket's Trap more than once each turn."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROCKETS_ACE_IN_THE_HOLE_202:
      return supporter (this) {
        text "You can play this card only when it is the last card in your hand. Put a Dark Pokémon card or basic Energy card from your discard pile into your hand. Then, draw 5 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROCKET_S_COUNTER_ATTACK_203:
      return basicTrainer (this) {
        text "You may use this card only if you have more Prize cards left than your opponent. Search your deck for any 2 cards and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_RETRIEVER_204:
      return basicTrainer (this) {
        text "Flip 2 coins. If you get a heads, search your discard pile for Basic Pokémon and Evolution cards. You may either show up to 2 Basic Pokémon and/or Evolution cards to your opponent and put them into your hand, or show a combination of up to 4 Basic Pokémon and/or Evolution cards to your opponent and shuffle them into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case DIGGER_205:
      return basicTrainer (this) {
        text "Flip a coin. If tails, do 10 damage to your Active Pokémon. If heads, your opponent flips a coin. If tails, your opponent does 10 damage to his or her Active Pokémon. If heads, you flip a coin. Keep doing this until a player gets tails."
        onPlay {
        }
        playRequirement{
        }
      };
      case NIGHTLY_GARBAGE_RUN_206:
      return basicTrainer (this) {
        text "Choose up to 3 Basic Pokémon cards, Evolution cards, and/or Basic Energy cards from your discard pile. Show them to your opponent and shuffle them into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case POW_HAND_EXTENSION_207:
      return basicTrainer (this) {
        text "You may only use this card if you have more Prize cards left than your opponent. If you do, you may choose 1 Energy card attached to the Defending Pokémon and move it to another of your opponent's Pokémon (if your opponent has no Benched Pokémon, discard that Energy card.) Or, you may have your opponent choose 1 of their Benched Pokémon for you to switch with the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case SURPRISE_TIME_MACHINE_208:
      return basicTrainer (this) {
        text "Choose 1 of your Evolved Pokémon, remove the highest Stage Evolution card from it, and shuffle it into your deck (this counts as devolving that Pokémon). If that Pokémon remains in play, search your deck for an Evolution card that evolves from that Pokémon and put it onto that Pokémon (this counts as evolving that Pokémon). Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case SWOOP_TELEPORTER_209:
      return basicTrainer (this) {
        text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and switch it with 1 of your Basic Pokémon in play (excluding Pokémon-ex). (Any cards attached to that Pokémon, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Place the first Basic Pokémon in your discard pile. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case SLEEP_210:
      return basicTrainer (this) {
        text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
        onPlay {
        }
        playRequirement{
        }
      };
      case CLEFAIRY_DOLL_211:
      return basicTrainer (this) {
        text "Play Clefairy Doll as if it were a Basic Pokémon. While in play, Clefairy Doll counts as a Pokémon (instead of a Trainer card.) Clefairy Doll has no attacks, can't retreat, and can't be affected by a Special Condition. If Clefairy Doll is Knocked Out, it doesn't count as a Knocked Out Pokémon. At any time during your turn before your attack, you may discard Clefairy Doll."
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERIOUS_FOSSIL_212:
      return basicTrainer (this) {
        text "Play Mysterious Fossil as if it were a Basic Pokémon. While in play, Mysterious Fossil counts as a Pokémon (instead of a Trainer card). Mysterious Fossil has no attacks, can't retreat, and can't be affected by a Special Condition. If Mysterious Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Mysterious Fossil from play."
        onPlay {
        }
        playRequirement{
        }
      };
      case SCOOP_UP_213:
      return basicTrainer (this) {
        text "Choose 1 of your own Pokémon in play and return its Basic Pokémon card to your hand. (Discard all cards attached to that card.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case GUST_OF_WIND_214:
      return basicTrainer (this) {
        text "Choose 1 of your opponent's Benched Pokémon and switch it with his or her Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case SWITCH_215:
      return copy(FireRedLeafGreen.SWITCH_102, this);
      case SUPER_SCOOP_UP_216:
      return basicTrainer (this) {
        text "Flip a coin. If heads, return 1 of your Pokémon in play and all cards attached to it to your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case COMPUTER_SEARCH_217:
      return basicTrainer (this) {
        text "Discard 2 of the other cards from your hand in order to search your deck for any card and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ITEM_FINDER_218:
      return basicTrainer (this) {
        text "You may choose to discard 1 card from your hand in order to search your discard pile for a Supporter card. Show it to your opponent and put it into your hand. Or" +
          "you may choose to discard 2 cards from your hand in order to search your discard pile for a Trainer card (excluding Supporter cards). Show it to your opponent and put it into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case MAINTENANCE_219:
      return basicTrainer (this) {
        text "Shuffle 2 of the other cards from your hand into your deck in order to draw 2 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case GAMBLER_220:
      return basicTrainer (this) {
        text "Shuffle your hand into your deck. Flip a coin. If heads, draw 8 cards. If tails, draw 1 card."
        onPlay {
        }
        playRequirement{
        }
      };
      case RECYCLE_221:
      return basicTrainer (this) {
        text "Flip a coin. If heads, put a card in your discard pile on top of your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case CHALLENGE_222:
      return basicTrainer (this) {
        text "Ask your opponent if he or she accepts your challenge. If your opponent declines (or if both Benches are full), draw 2 cards. If your opponent accepts, each of you searches your decks for any number of Basic Pokémon cards (excluding Pokémon-ex) and puts them face down onto your Benches. (A player can't do this if his or her Bench is full.) When you both have finished, shuffle your decks and turn those cards face up."
        onPlay {
        }
        playRequirement{
        }
      };
      case CRYSTAL_GUARD_223:
      return pokemonTool (this) {
        text "As long as the Pokémon Crystal Guard is attached to (excluding Pokémon-ex) is 1 of your Benched Pokémon, ignore all effects of attacks and Poké-Powers (including damage) done to that Pokémon by your opponent's Pokémon"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case RELIC_HUNTER_224:
      return basicTrainer (this) {
        text "Search your discard pile for up to 2 Stadium cards, show them to your opponent, and shuffle them into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case LOST_EXPEDITION_225:
      return basicTrainer (this) {
        text "You may play 2 Lost Expedition at the same time. If you play 1 Lost Expedition, draw a card. If you play 2 Lost Expedition, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case UNDERGROUND_EXPEDITION_226:
      return supporter (this) {
        text "Look at the bottom 4 cards of your deck. Put 2 of the cards you find there into your hand. Return the remaining cards to the bottom of your deck in any order you like."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_RESTORE_227:
      return basicTrainer (this) {
        text "Flip 3 coins. For each heads, choose a Basic Energy card from your discard pile. Show them to your opponent and put them into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_SEARCH_228:
      return basicTrainer (this) {
        text "Search your deck for a Basic Energy card and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_SWITCH_229:
      return basicTrainer (this) {
        text "Move a basic Energy card from 1 of your Pokémon to another of your Pokémon"
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_RETRIEVAL_230:
      return basicTrainer (this) {
        text "Trade 1 of the other cards in your hand for up to 2 Basic Energy cards from your discard pile."
        onPlay {
        }
        playRequirement{
        }
      };
      case SUPER_ENERGY_RETRIEVAL_231:
      return basicTrainer (this) {
        text "Trade 2 of the other cards in your hand for up to 4 Basic Energy cards from your discard pile."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_REMOVAL_232:
      return basicTrainer (this) {
        text "Discard 1 Energy card attached to your opponent's Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case SUPER_ENERGY_REMOVAL_233:
      return basicTrainer (this) {
        text "Discard 1 Special Energy attached to 1 of your opponent's Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case TOOL_SCRAPPER_234:
      return basicTrainer (this) {
        text "Choose up to 2 Trainer cards attached to your opponent's Pokémon and discard them."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROTECTIVE_ORB_236:
      return pokemonTool (this) {
        text "As long as Protective Orb is attached to an Evolved Pokémon (excluding Pokémon-ex), that Pokémon has no Weakness."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case FIGHTING_ENERGY_237:
      return basicEnergy (this, F);
      case FIRE_ENERGY_238:
      return basicEnergy (this, R);
      case GRASS_ENERGY_239:
      return basicEnergy (this, G);
      case LIGHTNING_ENERGY_240:
      return basicEnergy (this, L);
      case PSYCHIC_ENERGY_241:
      return basicEnergy (this, P);
      case WATER_ENERGY_242:
      return basicEnergy (this, W);
      case DOUBLE_COLORLESS_ENERGY_243:
      return specialEnergy (this, [[C]]) {
        text "Provides [C][C] energy. Doesn't count as a basic energy card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case MIRACLE_ENERGY_244:
      return specialEnergy (this, [[C]]) {
        text "Miracle Energy can only be attached to a Stage 2 Pokémon. While in play, Miracle Energy counts as every type of Energy but only provides 2 at a time in any combination. (Doesn't count as a Basic Energy card when not in play.) Miracle Energy can't be discarded by your opponent's Trainer cards. If the Pokémon Miracle Energy is attached to isn't a Stage 2 Pokémon, discard Miracle Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case BOOST_ENERGY_245:
      return specialEnergy (this, [[C]]) {
        text "Boost Energy provides [C] Energy. While in play, if you have more Prize cards left than your opponent, Boost Energy provides [C][C][C]. If the Pokémon Boost Energy is attached to has a Poké-Power, or has any other Special Energy cards attached to it (at any time), discard Boost Energy. If the Pokémon Boost Energy is attached to is a Pokémon-ex, discard Boost Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case DNA_ENERGY_246:
      return specialEnergy (this, [[C]]) {
        text "DNA Energy provides [C] energy. During your turn, if DNA Energy is attached to your Active Pokémon, you may move it to 1 of your Benched Pokémon with the same name as your Active Pokémon. This action cannot be done more than once each turn."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case FULL_HEAL_ENERGY_247:
      return specialEnergy (this, [[C]]) {
        text "If you play this card from your hand, the Pokémon you attach it to is no longer affected by a Special Condition. Full Heal Energy provides [C] Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case LOST_ENERGY_248:
      return specialEnergy (this, [[C]]) {
        text "Lost Energy provides [C] energy. Once during your turn, if the Pokémon Lost Energy is attached to is your Active Pokémon, you may search your deck for up to 2 Basic Pokémon and put them onto your bench. If you do, shuffle your deck and your turn ends."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case POTION_ENERGY_249:
      return specialEnergy (this, [[C]]) {
        text "If you play this card from your hand, remove 1 damage counter from the Pokémon you attach it to, if it has any. Potion Energy provides [C] Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case SCRAMBLE_ENERGY_250:
      return specialEnergy (this, [[C]]) {
        text "Scramble Energy can only be attached to an Evolved Pokémon. Scramble Energy provides [C] Energy. While in play, if you have more Prize cards left than your opponent, Scramble Energy provides every type of Energy but provides only 3 at a time in any combination. If the Pokémon Scramble Energy is attached to isn't an Evolved Pokémon, discard Scramble Energy. If the Pokémon Scramble Energy is attached to is a Pokémon-ex, discard Scramble Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ROCKETS_ENERGY_RF_251:
      return specialEnergy (this, [[C]]) {
        text "Rocket's Energy RF provides [C] Energy. If the Pokémon that Rocket's Energy RF is attached to also has a Basic [R] Energy card attached to it, that Pokémon has no Weakness. If the Pokémon that Rocket's Energy RF is attached to also has a Basic [F] Energy card attached to it, damage done to that Pokémon's attacks isn't affected by Resistance. If the Pokémon Rocket's Energy RF is attached to is a Pokémon-ex, discard Rocket's Energy RF."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ROCKETS_ENERGY_GL_252:
      return specialEnergy (this, [[C]]) {
        text "Rocket's Energy GL provides [C] Energy. If the Pokémon that Rocket's Energy GL is attached to also has a Basic [G] Energy card attached to it, that Pokémon can't be affected by any Special Conditions. If the Pokémon that Rocket's Energy GL is attached to also has a Basic [L] Energy card attached to it, that Pokémon's maximum HP is increased by 10. If the Pokémon Rocket's Energy GL is attached to is a Pokémon-ex, discard Rocket's Energy GL."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ROCKETS_ENERGY_WP_253:
      return specialEnergy (this, [[C]]) {
        text "Rocket's Energy WP provides [C] Energy. If the Pokémon that Rocket's Energy WP is attached to also has a Basic [W] Energy card attached to it, prevent all effects, excluding damage, done to that Pokémon by your opponent's Pokémon. If the Pokémon that Rocket's Energy WP is attached to also has a Basic [P] Energy card attached to it, that Pokémon's Retreat Cost is 0. If the Pokémon Rocket's Energy WP is attached to is a Pokémon-ex, discard Rocket's Energy WP."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ROCKET_S_COUNTER_ATTACK_254:
      return copy (ROCKET_S_COUNTER_ATTACK_203, this);
      case CRUSHING_HAMMER_255:
      return basicTrainer (this) {
        text "Discard 1 Energy card attached to 1 of your Pokémon in order to choose 1 of your opponent's Pokémon and up to 2 Energy cards attached to it. Discard those Energy cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case DOWSING_MACHINE_256:
      return basicTrainer (this) {
        text "Search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case Elixir_257:
      return basicTrainer (this) {
        text "Remove up to 6 damage counters from 1 of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case EXPERT_BELT_258:
      return basicTrainer (this) {
        text "If you have 6 remaining Prize cards, you cannot play this card. Attach Expert Belt to 1 of your Pokémon. The Pokémon this card is attached to gets +20HP and that Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance). When the Pokémon this card is attached to is Knocked Out, your opponent takes 1 more Prize card."
        onPlay {
        }
        playRequirement{
        }
      };
      case G_SCOPE_259:
      return basicTrainer (this) {
        text "Attach G Scope to 1 of your Pokémon. The Pokémon this card is attached to can also use the attack on this card. After you use the attack, discard G Scope (you still need the necessary Energy to use the attack)."
        onPlay {
        }
        playRequirement{
        }
      };
      case Hacker_260:
      return basicTrainer (this) {
        text "Search your deck for a card and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case LOST_MEDALLION_261:
      return basicTrainer (this) {
        text "You may use this card only if you have more Prize cards left than your opponent. Attach Lost Medallion to 1 of your Pokémon. If the Pokémon this card is attached to is Knocked Out, your opponent takes 1 fewer Prize card."
        onPlay {
        }
        playRequirement{
        }
      };
      case MASTER_BALL_262:
      return basicTrainer (this) {
        text "Search your deck for up to 3 Basic Pokémon. Show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
        default:
      return null;
    }
  }
}
