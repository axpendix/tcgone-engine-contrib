package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen5.BlackWhite
import tcgwars.logic.impl.gen5.DarkExplorers
import tcgwars.logic.impl.gen5.EmergingPowers
import tcgwars.logic.impl.gen5.NextDestinies
import tcgwars.logic.impl.gen6.KalosStarterSet
import tcgwars.logic.impl.gen6.Xy

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

import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum SunMoon implements CardInfo {

	CATERPIE_1 ("Caterpie", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	METAPOD_2 ("Metapod", 2, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BUTTERFREE_3 ("Butterfree", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PARAS_4 ("Paras", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PARASECT_5 ("Parasect", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PINSIR_6 ("Pinsir", 6, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	SURSKIT_7 ("Surskit", 7, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MASQUERAIN_8 ("Masquerain", 8, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	ROWLET_9 ("Rowlet", 9, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	DARTRIX_10 ("Dartrix", 10, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DECIDUEYE_11 ("Decidueye", 11, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DECIDUEYE_GX_12 ("Decidueye-GX", 12, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	GRUBBIN_13 ("Grubbin", 13, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	FOMANTIS_14 ("Fomantis", 14, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	LURANTIS_GX_15 ("Lurantis-GX", 15, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	MORELULL_16 ("Morelull", 16, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SHIINOTIC_17 ("Shiinotic", 17, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BOUNSWEET_18 ("Bounsweet", 18, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	STEENEE_19 ("Steenee", 19, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TSAREENA_20 ("Tsareena", 20, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	GROWLITHE_21 ("Growlithe", 21, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	ARCANINE_22 ("Arcanine", 22, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	TORKOAL_23 ("Torkoal", 23, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	LITTEN_24 ("Litten", 24, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	TORRACAT_25 ("Torracat", 25, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	INCINEROAR_26 ("Incineroar", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	INCINEROAR_GX_27 ("Incineroar-GX", 27, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	PSYDUCK_28 ("Psyduck", 28, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	GOLDUCK_29 ("Golduck", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	POLIWAG_30 ("Poliwag", 30, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	POLIWHIRL_31 ("Poliwhirl", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	POLIWRATH_32 ("Poliwrath", 32, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	SHELLDER_33 ("Shellder", 33, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	CLOYSTER_34 ("Cloyster", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	LAPRAS_GX_35 ("Lapras-GX", 35, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
	CORSOLA_36 ("Corsola", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	WINGULL_37 ("Wingull", 37, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	PELIPPER_38 ("Pelipper", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	POPPLIO_39 ("Popplio", 39, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BRIONNE_40 ("Brionne", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PRIMARINA_41 ("Primarina", 41, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	PRIMARINA_GX_42 ("Primarina-GX", 42, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
	CRABOMINABLE_43 ("Crabominable", 43, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	WISHIWASHI_44 ("Wishiwashi", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	DEWPIDER_45 ("Dewpider", 45, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	ARAQUANID_46 ("Araquanid", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PYUKUMUKU_47 ("Pyukumuku", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	BRUXISH_48 ("Bruxish", 48, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	CHINCHOU_49 ("Chinchou", 49, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	LANTURN_50 ("Lanturn", 50, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	CHARJABUG_51 ("Charjabug", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	VIKAVOLT_52 ("Vikavolt", 52, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	TOGEDEMARU_53 ("Togedemaru", 53, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	ZUBAT_54 ("Zubat", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GOLBAT_55 ("Golbat", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	CROBAT_56 ("Crobat", 56, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	ALOLAN_GRIMER_57 ("Alolan Grimer", 57, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	ALOLAN_MUK_58 ("Alolan Muk", 58, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DROWZEE_59 ("Drowzee", 59, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	HYPNO_60 ("Hypno", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	ESPEON_GX_61 ("Espeon-GX", 61, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	MAREANIE_62 ("Mareanie", 62, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	TOXAPEX_63 ("Toxapex", 63, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	COSMOG_64 ("Cosmog", 64, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	COSMOEM_65 ("Cosmoem", 65, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	LUNALA_GX_66 ("Lunala-GX", 66, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	MAKUHITA_67 ("Makuhita", 67, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	HARIYAMA_68 ("Hariyama", 68, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ROGGENROLA_69 ("Roggenrola", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	BOLDORE_70 ("Boldore", 70, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	GIGALITH_71 ("Gigalith", 71, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	CRABRAWLER_72 ("Crabrawler", 72, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PASSIMIAN_73 ("Passimian", 73, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	SANDYGAST_74 ("Sandygast", 74, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PALOSSAND_75 ("Palossand", 75, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ALOLAN_RATTATA_76 ("Alolan Rattata", 76, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	ALOLAN_RATICATE_77 ("Alolan Raticate", 77, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	ALOLAN_MEOWTH_78 ("Alolan Meowth", 78, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	ALOLAN_PERSIAN_79 ("Alolan Persian", 79, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	UMBREON_GX_80 ("Umbreon-GX", 80, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
	CARVANHA_81 ("Carvanha", 81, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	SHARPEDO_82 ("Sharpedo", 82, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	SANDILE_83 ("Sandile", 83, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	KROKOROK_84 ("Krokorok", 84, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	KROOKODILE_85 ("Krookodile", 85, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	ALOLAN_DIGLETT_86 ("Alolan Diglett", 86, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	ALOLAN_DUGTRIO_87 ("Alolan Dugtrio", 87, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	SKARMORY_88 ("Skarmory", 88, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	SOLGALEO_GX_89 ("Solgaleo-GX", 89, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
	SNUBBULL_90 ("Snubbull", 90, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
	GRANBULL_91 ("Granbull", 91, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
	CUTIEFLY_92 ("Cutiefly", 92, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
	RIBOMBEE_93 ("Ribombee", 93, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
	DRATINI_94 ("Dratini", 94, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
	DRAGONAIR_95 ("Dragonair", 95, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
	DRAGONITE_96 ("Dragonite", 96, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DRAGON_]),
	SPEAROW_97 ("Spearow", 97, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	FEAROW_98 ("Fearow", 98, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	KANGASKHAN_99 ("Kangaskhan", 99, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	TAUROS_GX_100 ("Tauros-GX", 100, Rarity.COMMON, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
	EEVEE_101 ("Eevee", 101, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SPINDA_102 ("Spinda", 102, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	LILLIPUP_103 ("Lillipup", 103, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	HERDIER_104 ("Herdier", 104, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	STOUTLAND_105 ("Stoutland", 105, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PIKIPEK_106 ("Pikipek", 106, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	TRUMBEAK_107 ("Trumbeak", 107, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	TOUCANNON_108 ("Toucannon", 108, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	YUNGOOS_109 ("Yungoos", 109, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	GUMSHOOS_GX_110 ("Gumshoos-GX", 110, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
	STUFFUL_111 ("Stufful", 111, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	BEWEAR_112 ("Bewear", 112, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ORANGURU_113 ("Oranguru", 113, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	BIG_MALASADA_114 ("Big Malasada", 114, Rarity.UNCOMMON, [ITEM, TRAINER]),
	CRUSHING_HAMMER_115 ("Crushing Hammer", 115, Rarity.UNCOMMON, [ITEM, TRAINER]),
	ENERGY_RETRIEVAL_116 ("Energy Retrieval", 116, Rarity.UNCOMMON, [ITEM, TRAINER]),
	ENERGY_SWITCH_117 ("Energy Switch", 117, Rarity.UNCOMMON, [ITEM, TRAINER]),
	EXP__SHARE_118 ("Exp. Share", 118, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
	GREAT_BALL_119 ("Great Ball", 119, Rarity.UNCOMMON, [ITEM, TRAINER]),
	HAU_120 ("Hau", 120, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	ILIMA_121 ("Ilima", 121, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	LILLIE_122 ("Lillie", 122, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	NEST_BALL_123 ("Nest Ball", 123, Rarity.UNCOMMON, [ITEM, TRAINER]),
	POISON_BARB_124 ("Poison Barb", 124, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
	POKE_BALL_125 ("Poké Ball", 125, Rarity.UNCOMMON, [ITEM, TRAINER]),
	POKEMON_CATCHER_126 ("Pokémon Catcher", 126, Rarity.UNCOMMON, [ITEM, TRAINER]),
	POTION_127 ("Potion", 127, Rarity.UNCOMMON, [ITEM, TRAINER]),
	PROFESSOR_KUKUI_128 ("Professor Kukui", 128, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	RARE_CANDY_129 ("Rare Candy", 129, Rarity.UNCOMMON, [ITEM, TRAINER]),
	REPEL_130 ("Repel", 130, Rarity.UNCOMMON, [ITEM, TRAINER]),
	ROTOM_DEX_131 ("Rotom Dex", 131, Rarity.UNCOMMON, [ITEM, TRAINER]),
	SWITCH_132 ("Switch", 132, Rarity.UNCOMMON, [ITEM, TRAINER]),
	TEAM_SKULL_GRUNT_133 ("Team Skull Grunt", 133, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	TIMER_BALL_134 ("Timer Ball", 134, Rarity.UNCOMMON, [ITEM, TRAINER]),
	ULTRA_BALL_135 ("Ultra Ball", 135, Rarity.UNCOMMON, [ITEM, TRAINER]),
	DOUBLE_COLORLESS_ENERGY_136 ("Double Colorless Energy", 136, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	RAINBOW_ENERGY_137 ("Rainbow Energy", 137, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	LURANTIS_GX_138 ("Lurantis-GX", 138, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	LAPRAS_GX_139 ("Lapras-GX", 139, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
	ESPEON_GX_140 ("Espeon-GX", 140, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	LUNALA_GX_141 ("Lunala-GX", 141, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	UMBREON_GX_142 ("Umbreon-GX", 142, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
	SOLGALEO_GX_143 ("Solgaleo-GX", 143, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
	TAUROS_GX_144 ("Tauros-GX", 144, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
	GUMSHOOS_GX_145 ("Gumshoos-GX", 145, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
	ILIMA_146 ("Ilima", 146, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
	LILLIE_147 ("Lillie", 147, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
	PROFESSOR_KUKUI_148 ("Professor Kukui", 148, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
	TEAM_SKULL_GRUNT_149 ("Team Skull Grunt", 149, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
	LURANTIS_GX_150 ("Lurantis-GX", 150, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	LAPRAS_GX_151 ("Lapras-GX", 151, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
	ESPEON_GX_152 ("Espeon-GX", 152, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	LUNALA_GX_153 ("Lunala-GX", 153, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	UMBREON_GX_154 ("Umbreon-GX", 154, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
	SOLGALEO_GX_155 ("Solgaleo-GX", 155, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
	TAUROS_GX_156 ("Tauros-GX", 156, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
	GUMSHOOS_GX_157 ("Gumshoos-GX", 157, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
	NEST_BALL_158 ("Nest Ball", 158, Rarity.SECRET, [ITEM, TRAINER]),
	ROTOM_DEX_159 ("Rotom Dex", 159, Rarity.SECRET, [ITEM, TRAINER]),
	SWITCH_160 ("Switch", 160, Rarity.SECRET, [ITEM, TRAINER]),
	ULTRA_BALL_161 ("Ultra Ball", 161, Rarity.SECRET, [ITEM, TRAINER]),
	PSYCHIC_ENERGY_162 ("Psychic Energy", 162, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
	METAL_ENERGY_163 ("Metal Energy", 163, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
	GRASS_ENERGY_164 ("Grass Energy", 164, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIRE_ENERGY_165 ("Fire Energy", 165, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	WATER_ENERGY_166 ("Water Energy", 166, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	LIGHTNING_ENERGY_167 ("Lightning Energy", 167, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	PSYCHIC_ENERGY_168 ("Psychic Energy", 168, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIGHTING_ENERGY_169 ("Fighting Energy", 169, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	DARKNESS_ENERGY_170 ("Darkness Energy", 170, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	METAL_ENERGY_171 ("Metal Energy", 171, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FAIRY_ENERGY_172 ("Fairy Energy", 172, Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

	protected CardTypeSet cardTypes
	protected String name
	protected Rarity rarity
	protected int collectionLineNo

	SunMoon(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
		this.cardTypes = new CardTypeSet(cardTypes as CardType[])
		this.name = name
		this.rarity = rarity
		this.collectionLineNo = collectionLineNo
	}

	@Override
	public CardTypeSet getCardTypes() {
		return cardTypes
	}

	@Override
	public String getName() {
		return name
	}

	@Override
	public Rarity getRarity() {
		return rarity
	}

	@Override
	public int getCollectionLineNo() {
		return collectionLineNo
	}

	@Override
	public tcgwars.logic.card.Collection getCollection() {
		return tcgwars.logic.card.Collection.SUN_MOON
	}

	@Override
	public String toString() {
		return String.format("%s:%s", this.name(), this.getCollection().name())
	}

	@Override
	public String getEnumName() {
		return name()
	}

	@Override
	public Card getImplementation() {
		switch (this) {
			case CATERPIE_1:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Nap", {
						text "Heal 20 damage from this Pokémon."
						energyCost C
						onAttack {
							heal 20,self
						}
					}
					move "Gnaw", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}

				}
			case METAPOD_2:
				return evolution (this, from:"Caterpie", hp:HP080, type:GRASS, retreatCost:3) {
					weakness FIRE
					move "Iron Defense", {
						text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
						energyCost C
						onAttack {
							flip{preventAllDamageNextTurn()}
						}
					}
					move "Bug Bite", {
						text "40 damage."
						energyCost C, C, C
						onAttack {
							damage 40
						}
					}

				}
			case BUTTERFREE_3:
				return evolution (this, from:"Metapod", hp:HP130, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Psy Bolt", {
						text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost C
						onAttack {
							damage 30
							flip{applyAfterDamage PARALYZED}
						}
					}
					move "Whirlwind", {
						text "80 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
						energyCost C, C, C
						onAttack {
							damage 80
							whirlwind()
						}
					}

				}
			case PARAS_4:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Scratch", {
						text "30 damage."
						energyCost G, C
						onAttack {
							damage 30
						}
					}

				}
			case PARASECT_5:
				return evolution (this, from:"Paras", hp:HP110, type:GRASS, retreatCost:3) {
					weakness FIRE
					move "Fury Cutter", {
						text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 20 more damage. If 2 of them are heads, this attack does 60 more damage. If all of them are heads, this attack does 120 damage."
						energyCost C, C
						onAttack {
							damage 10
							flip 3,{},{},[1:{damage 20},2:{damage 60},3:{damage 120}]
						}
					}
					move "Mushroom Drain", {
						text "70 damage. Heal 30 damage from this Pokémon."
						energyCost G, G, C
						onAttack {
							damage 70
							afterDamage{heal 30,self}
						}
					}

				}
			case PINSIR_6:
				return basic (this, hp:HP110, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Roof Fling", {
						text "Flip a coin. If heads, put your opponent's Active Pokémon and all cards attached to it into your opponent's hand."
						energyCost C, C
						onAttack {
							flip {
								afterDamage { targeted (defending) {
									defending.cards.moveTo(opp.hand)
									removePCS(defending)
								} }
							}
						}
					}
					move "Guillotine", {
						text "50 damage."
						energyCost G, G
						onAttack {
							damage 50
						}
					}

				}
			case SURSKIT_7:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Quick Attack", {
						text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
						energyCost C
						onAttack {
							damage 10
							flip{damage 10}
						}
					}

				}
			case MASQUERAIN_8:
				return evolution (this, from:"Surskit", hp:HP090, type:GRASS, retreatCost:0) {
					weakness FIRE
					move "Struggle Bug", {
						text "30 damage. Move an Energy from your opponent's Active Pokémon to 1 of their Benched Pokémon."
						energyCost C
						onAttack {
							damage 30
							afterDamage {moveEnergy(defending, opp.bench)}
						}
					}

				}
			case ROWLET_9:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Tackle", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}
					move "Leafage", {
						text "20 damage."
						energyCost G, C
						onAttack {
							damage 20
						}
					}

				}
			case DARTRIX_10:
				return evolution (this, from:"Rowlet", hp:HP080, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Sharp Blade Quill", {
						text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost C
						onAttack {
							damage 20,opp.all.select()
						}
					}
					move "Leaf Blade", {
						text "50+ damage. Flip a coin. If heads, this attack does 20 more damage."
						energyCost G, C, C
						onAttack {
							damage 50
							flip{damage 20}
						}
					}

				}
			case DECIDUEYE_11:
				return evolution (this, from:"Dartrix", hp:HP140, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Leaf Blade", {
						text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
						energyCost G
						onAttack {
							damage 30
							flip{damage 30}
						}
					}
					move "Brave Bird", {
						text "120 damage. This Pokémon does 20 damage to itself."
						energyCost G, C, C
						onAttack {
							damage 120
							damage 20,self
						}
					}

				}
			case DECIDUEYE_GX_12:
				return evolution (this, from:"Dartrix", hp:HP240, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Feather Arrow", {
						text "Once during your turn (before your attack), you may put 2 damage counters on 1 of your opponent's Pokémon."
						actionA {
							checkLastTurn()
							powerUsed()
							directDamage(20, opp.all.select())
						}
					}
					move "Razor Leaf", {
						text "90 damage."
						energyCost G, C, C
						onAttack {
							damage 90
						}
					}
					move "Hollow Hunt GX", {
						text "Put 3 cards from your discard pile into your hand. (You can't use more than 1 GX attack in a game.)"
						energyCost G
						attackRequirement {assert my.discard; gxCheck()}
						onAttack {
							gxPerform()
							my.discard.select(count:3).moveTo(my.hand)
						}
					}

				}
			case GRUBBIN_13:
				return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Vice Grip", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}

				}
			case FOMANTIS_14:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Synthesis", {
						text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck."
						energyCost C
						attackRequirement {
							assert deck
						}
						onAttack {
							deck.search (basicEnergyFilter(G)).each {attachEnergy(my.all.select(),it)}
							shuffleDeck()
						}
					}
					move "Leafage", {
						text "20 damage."
						energyCost G, C
						onAttack {
							damage 20
						}
					}

				}
			case LURANTIS_GX_15:
				return evolution (this, from:"Fomantis", hp:HP210, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Flower Supply", {
						text "40 damage. Attach 2 basic Energy cards from your discard pile to your Pokémon in any way you like."
						energyCost G
						onAttack {
							damage 40
							afterDamage {
								attachEnergyFrom(basic: true, my.discard, my.all)
								attachEnergyFrom(basic: true, my.discard, my.all)
							}
						}
					}
					move "Solar Blade", {
						text "120 damage. Heal 30 damage from this Pokémon."
						energyCost G, G, C
						onAttack {
							damage 120
							afterDamage {heal 30,self}
						}
					}
					move "Chloroscythe GX", {
						text "50× damage. This attack does 50 damages times the amount of [G] Energy attached to this Pokémon. (You can't use more than 1 GX attack per game.)"
						energyCost G
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							damage 50*self.cards.energyCount(G)
						}
					}

				}
			case MORELULL_16:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Flickering Spores", {
						text "Your opponent's Active Pokémon is now Asleep."
						energyCost C
						onAttack {
							apply ASLEEP
						}
					}
					move "Ram", {
						text "10 damage."
						energyCost G
						onAttack {
							damage 10
						}
					}

				}
			case SHIINOTIC_17:
				return evolution (this, from:"Morelull", hp:HP100, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Illuminate", {
						text "Once during your turn (before your attack), you may search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
						actionA {
							checkLastTurn()
							assert my.deck.notEmpty
							powerUsed()
							my.deck.search (pokemonTypeFilter(G)).moveTo(my.hand)
							shuffleDeck()
						}
					}
					move "Flickering Spores", {
						text "30 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost G, C
						onAttack {
							damage 30
							applyAfterDamage(ASLEEP)
						}
					}

				}
			case BOUNSWEET_18:
				return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Sweet Scent", {
						text "Heal 30 damage from 1 of your Pokémon."
						energyCost G
						attackRequirement {
							assert my.all.findAll {it.numberOfDamageCounters}
						}
						onAttack {
							heal 30, my.all.findAll {it.numberOfDamageCounters}.select()
						}
					}
					move "Splash", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}

				}
			case STEENEE_19:
				return evolution (this, from:"Bounsweet", hp:HP090, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Sweet Scent", {
						text "Heal 30 damage from 1 of your Pokémon."
						energyCost G
						attackRequirement {
							assert my.all.findAll {it.numberOfDamageCounters}
						}
						onAttack {
							heal 30, my.all.findAll {it.numberOfDamageCounters}.select()
						}
					}
					move "Stomp", {
						text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
						energyCost C, C
						onAttack {
							damage 20
							flip{damage 20}
						}
					}

				}
			case TSAREENA_20:
				return evolution (this, from:"Steenee", hp:HP140, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Queenly Majesty", {
						text "When you play this card from your hand to evolve 1 of your Pokémon during your turn, you may have your opponent reveal their hand. Then, discard a card from it."
						onActivate {r->
							if(r==Ability.ActivationReason.PLAY_FROM_HAND && confirm("Use Queenly Majesty?")){
								if(opp.hand){
									opp.hand.showToMe("Opponent's hand")
									opp.hand.select("Discard").discard()
								}
							}
						}
					}
					move "Trop Kick", {
						text "80 damage. Heal 20 damage and remove all Special Conditions from this Pokémon."
						energyCost G, C, C
						onAttack {
							damage 80
							afterDamage {
								heal 20,self
								clearSpecialCondition(self)
							}
						}
					}

				}
			case GROWLITHE_21:
				return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
					weakness WATER
					move "Take Down", {
						text "60 damage. This Pokémon does 20 damage to itself."
						energyCost R, C, C
						onAttack {
							damage 60
							damage 20,self
						}
					}

				}
			case ARCANINE_22:
				return evolution (this, from:"Growlithe", hp:HP130, type:FIRE, retreatCost:2) {
					weakness WATER
					move "Searing Flame", {
						text "60 damage. Your opponent's Active Pokémon is now Burned."
						energyCost R, C, C
						onAttack {
							damage 60
							applyAfterDamage(BURNED)
						}
					}
					move "Firestorm", {
						text "190 damage. Discard 3 [R] Energy from this Pokémon."
						energyCost R, R, R, C
						onAttack {
							damage 190
							discardSelfEnergy R,R,R
						}
					}

				}
			case TORKOAL_23:
				return basic (this, hp:HP110, type:FIRE, retreatCost:3) {
					weakness WATER
					move "Singe", {
						text "Your opponent's Active Pokémon is now Burned."
						energyCost R
						onAttack {
							apply BURNED
						}
					}
					move "Body Slam", {
						text "50 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost R, C
						onAttack {
							damage 50
							flip{applyAfterDamage(PARALYZED)}
						}
					}

				}
			case LITTEN_24:
				return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Bite", {
						text "10 damage."
						energyCost R
						onAttack {
							damage 10
						}
					}
					move "Flare", {
						text "20 damage."
						energyCost R, C
						onAttack {
							damage 20
						}
					}

				}
			case TORRACAT_25:
				return evolution (this, from:"Litten", hp:HP090, type:FIRE, retreatCost:2) {
					weakness WATER
					move "Fury Swipes", {
						text "20× damage. Flip 3 coins. This attack does 20 damage for each heads."
						energyCost R
						onAttack {
							flip 3,{damage 20}
						}
					}
					move "Flamethrower", {
						text "90 damage. Discard an Energy from this Pokémon."
						energyCost R, R, C
						onAttack {
							damage 90
							discardSelfEnergy(C)
						}
					}

				}
			case INCINEROAR_26:
				return evolution (this, from:"Torracat", hp:HP160, type:FIRE, retreatCost:3) {
					weakness WATER
					move "Fire Fang", {
						text "30 damage. Your opponent's Active Pokémon is now Burned."
						energyCost R, C
						onAttack {
							damage 30
							applyAfterDamage(BURNED)
						}
					}
					move "Darkest Lariat", {
						text "100× damage. Flip 2 coins. This attack does 100 damage for each heads."
						energyCost R, R, C
						onAttack {
							flip 2,{damage 100}
						}
					}

				}
			case INCINEROAR_GX_27:
				return evolution (this, from:"Torracat", hp:HP250, type:FIRE, retreatCost:3) {
					weakness WATER
					move "Hustling Strike", {
						text "10+ damage. This attack does 20 more damage for each of your benched [R] Pokémon."
						energyCost R
						onAttack {
							damage 10
							damage 20*my.bench.size()
						}
					}
					move "Tiger Swing", {
						text "80+ damage. Flip 2 coins. This attack does 50 more damage for each heads."
						energyCost R, R, C
						onAttack {
							damage 80
							flip 2,{damage 50}
						}
					}
					move "Burning Slam GX", {
						text "200 damage. Your opponent's Active Pokémon is now burned. (You can't use more than 1 GX attack per game.)"
						energyCost R, R, C
						attackRequirement {gxCheck()}
						onAttack {
							gxPerform()
							damage 200
							applyAfterDamage(BURNED)
						}
					}

				}
			case PSYDUCK_28:
				return basic (this, hp:HP070, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Confusion Wave", {
						text "Both Active Pokémon are now Confused."
						energyCost C
						onAttack {
							apply CONFUSED
							apply CONFUSED, self
						}
					}

				}
			case GOLDUCK_29:
				return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:0) {
					weakness GRASS
					move "Scratch", {
						text "20 damage."
						energyCost C
						onAttack {
							damage 20
						}
					}
					move "Double Jet", {
						text "60× damage. Discard up to 2 [W] Energy cards from your hand. This attack does 60 damage for each card you discarded in this way."
						energyCost W
						attackRequirement {
							assert my.hand.filterByEnergyType(W)
						}
						onAttack {
							damage 60*my.hand.filterByEnergyType(W).select(max: 2).discard().size()
						}
					}

				}
			case POLIWAG_30:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Water Gun", {
						text "10 damage."
						energyCost W
						onAttack {
							damage 10
						}
					}
					move "Hydro Pump", {
						text "30+ damage. This attack does 10 more damage times the amount of Water Energy attached to this Pokémon."
						energyCost C, C, C
						onAttack {
							damage 30
							damage 10*self.cards.energyCount(W)
						}
					}

				}
			case POLIWHIRL_31:
				return evolution (this, from:"Poliwag", hp:HP090, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Double Slap", {
						text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
						energyCost C, C
						onAttack {
							flip 2,{damage 30}
						}
					}
					move "Wave Splash", {
						text "60 damage."
						energyCost W, C, C
						onAttack {
							damage 60
						}
					}

				}
			case POLIWRATH_32:
				return evolution (this, from:"Poliwhirl", hp:HP150, type:WATER, retreatCost:3) {
					weakness GRASS
					move "Split Spiral Punch", {
						text "30 damage. Your opponent's Active Pokémon is now Confused."
						energyCost W
						onAttack {
							damage 30
							applyAfterDamage(CONFUSED)
						}
					}
					move "Wake-Up Slap", {
						text "80+ damage. If your opponent's Active Pokémon is affected by a Special Condition, this attack does 80 more damage. Then, remove all Special Conditions from that Pokémon."
						energyCost W, C, C
						onAttack {
							damage 80
							if(defending.specialConditions){
								damage 80
								afterDamage {clearSpecialCondition(defending)}
							}
						}
					}

				}
			case SHELLDER_33:
				return basic (this, hp:HP060, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Tackle", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}

				}
			case CLOYSTER_34:
				return evolution (this, from:"Shellder", hp:HP120, type:WATER, retreatCost:3) {
					weakness GRASS
					move "Headlock", {
						text "30+ damage. Flip a coin. If heads, this attack does 30 more damage. If tails, your opponent's Active Pokémon is now Paralyzed."
						energyCost W, C
						onAttack {
							damage 30
							flip 1,{damage 30},{applyAfterDamage(PARALYZED)}
						}
					}
					move "Guard Press", {
						text "80 damage. During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
						energyCost W, W, C
						onAttack {
							damage 80
							reduceDamageNextTurn(hp(20), thisMove)
						}
					}

				}
			case LAPRAS_GX_35:
				return basic (this, hp:HP190, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Collect", {
						text "Draw 3 cards."
						energyCost W
						onAttack {
							draw 3
						}
					}
					move "Blizzard Burn", {
						text "160 damage. This Pokémon can't attack during your next turn."
						energyCost W, W, W
						onAttack {
							damage 160
							cantAttackNextTurn(self)
						}
					}
					move "Ice Beam GX", {
						text "100 damage. Your opponent's Active Pokémon is now Paralyzed. (You can't use more than 1 GX attack per game.)"
						energyCost W, W, C
						attackRequirement {gxCheck()}
						onAttack {
							gxPerform()
							damage 100
							applyAfterDamage(PARALYZED)
						}
					}

				}
			case CORSOLA_36:
				return basic (this, hp:HP080, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Call for Family", {
						text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
						energyCost C
						attackRequirement {
							assert bench.notFull
							assert deck.notEmpty
						}
						onAttack {
							int count = bench.freeBenchCount>=2?2:1
							deck.search (max: count, cardTypeFilter(BASIC)).each {
								deck.remove(it)
								benchPCS(it)
							}
							shuffleDeck()
						}
					}
					move "Surf", {
						text "60 damage."
						energyCost W, C, C
						onAttack {
							damage 60
						}
					}

				}
			case WINGULL_37:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Roost", {
						text "Heal 30 damage from this Pokémon. It can't retreat during your next turn."
						energyCost C
						onAttack {
							heal 30,self
							cantRetreat(self)
						}
					}

				}
			case PELIPPER_38:
				return evolution (this, from:"Wingull", hp:HP100, type:WATER, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Courier", {
						text "Put 1 of your Benched Pokémon and all cards attached to it into your hand."
						energyCost C, C
						attackRequirement {
							assert my.bench.notEmpty
						}
						onAttack {
							def pcs = my.bench.select()
							pcs.cards.moveTo(my.hand)
							removePCS(pcs)
						}
					}
					move "Fly", {
						text "60 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
						energyCost W, C, C
						onAttack {
							flip {
								damage 60
								preventAllEffectsNextTurn()
							}
						}
					}

				}
			case POPPLIO_39:
				return basic (this, hp:HP070, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Pound", {
						text "10 damage."
						energyCost W
						onAttack {
							damage 10
						}
					}
					move "Water Gun", {
						text "20 damage."
						energyCost W, C
						onAttack {
							damage 20
						}
					}

				}
			case BRIONNE_40:
				return evolution (this, from:"Popplio", hp:HP090, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Wave Splash", {
						text "30 damage."
						energyCost W, C
						onAttack {
							damage 30
						}
					}
					move "Disarming Voice", {
						text "50 damage. Your opponent's Active Pokémon is now Confused."
						energyCost W, W, C
						onAttack {
							damage 50
							applyAfterDamage(CONFUSED)
						}
					}

				}
			case PRIMARINA_41:
				return evolution (this, from:"Brionne", hp:HP150, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Disarming Voice", {
						text "30 damage. Your opponent's Active Pokémon is now Confused."
						energyCost W, C
						onAttack {
							damage 30
							applyAfterDamage(CONFUSED)
						}
					}
					move "Sparkling Aria", {
						text "100 damage. Heal 30 damage from this Pokémon."
						energyCost W, W, C
						onAttack {
							damage 100
							afterDamage {heal 30,self}
						}
					}

				}
			case PRIMARINA_GX_42:
				return evolution (this, from:"Brionne", hp:HP250, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Bubble Beat", {
						text "10+ damage. This attack does 20 more damage times the amount of [W] Energy attached to your Pokémon."
						energyCost C, C
						onAttack {
							damage 10
							int count = 0
							my.all.each {count += it.cards.energyCount(W)}
							damage 20*count
						}
					}
					move "Roaring Seas", {
						text "120 damage. Discard an Energy from your opponent's Active Pokémon."
						energyCost W, W, W, C
						onAttack {
							damage 120
							discardDefendingEnergy()
						}
					}
					move "Grand Echo GX", {
						text "Heal all damage from all of your Pokémon. (You can't use more than 1 GX attack per game.)"
						energyCost C, C
						attackRequirement {
							assert my.all.findAll {it.numberOfDamageCounters} : "Your Pokemon are allright"
							gxCheck()
						}
						onAttack {
							gxPerform()
							my.all.each {heal it.damage.value, it}
						}
					}

				}
			case CRABOMINABLE_43:
				return evolution (this, from:"Crabrawler", hp:HP140, type:WATER, retreatCost:4) {
					weakness METAL
					move "Avalanche", {
						text "80 damage. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost W, W, C
						onAttack {
							damage 80
							opp.bench.each {damage 10,it}
						}
					}
					move "Ice Hammer", {
						text "140 damage."
						energyCost W, W, W, C
						onAttack {
							damage 140
						}
					}

				}
			case WISHIWASHI_44:
				return basic (this, hp:HP030, type:WATER, retreatCost:1) {
					weakness GRASS
					bwAbility "Cowardice", {
						text "Once during your turn (before your attack), you may discard all cards attached to this Pokémon and return it to your hand. You can't use this Ability during your first turn or on the turn this Pokémon was put into play."
						actionA {
							checkLastTurn()
							assert self.turnCount != bg.turnCount
							assert bg.turnCount > 2
							powerUsed()
							self.cards.getExcludedList(self.topPokemonCard).discard()
							moveCard(self.topPokemonCard, my.hand)
							removePCS(self)
						}
					}
					move "Water Gun", {
						text "10 damage."
						energyCost W
						onAttack {
							damage 10
						}
					}

				}
			case DEWPIDER_45:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Bubble", {
						text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost W
						onAttack {
							damage 10
							flip{applyAfterDamage(PARALYZED)}
						}
					}

				}
			case ARAQUANID_46:
				return evolution (this, from:"Dewpider", hp:HP100, type:WATER, retreatCost:2) {
					weakness GRASS
					bwAbility "Water Bubble", {
						text "Prevent all damage done to this Pokémon by attacks from your opponent's [R] Pokémon."
						delayedA {
							before APPLY_ATTACK_DAMAGES, {
								bg.dm().each {if(it.to==self && it.from.owner==self.owner.opposite && it.from.types.contains(R) && it.dmg.value && it.notNoEffect){
									bc "Water Bubble prevents damage"
									it.dmg=hp(0)
								}}
							}
						}
					}
					move "Aqua Edge", {
						text "70 damage."
						energyCost W, C, C
						onAttack {
							damage 70
						}
					}

				}
			case PYUKUMUKU_47:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness GRASS
					bwAbility "Innards Out", {
						text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, put 6 damage counters on the Attacking Pokémon."
						delayedA {
							before (KNOCKOUT,self) {
								if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite ) {
									bc "Innards Out activates"
									directDamage(60, self.owner.opposite.pbg.active)
								}
							}
						}
					}
					move "Continuous Tumble", {
						text "30× damage. Flip a coin until you get tails. This attack does 30 damage for each heads."
						energyCost W
						onAttack {
							flipUntilTails {damage 30}
						}
					}

				}
			case BRUXISH_48:
				return basic (this, hp:HP110, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Vivid Charge", {
						text "Search your deck for up to 3 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
						energyCost C
						attackRequirement {
							assert my.deck
						}
						onAttack {
							my.deck.search (max: 3, "Search your deck for up to 3 basic Energy cards", cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
							shuffleDeck()
						}
					}
					move "Psychic Fangs", {
						text "90 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
						energyCost W, W, C
						onAttack {
							shredDamage 90
						}
					}

				}
			case CHINCHOU_49:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Searching Light", {
						text "Look at 1 of your face-down Prize cards."
						energyCost C
						onAttack {
							my.prizeAsList.select(hidden: true, "Look at 1 of your face-down Prize cards.").showToMe("Selected card")
						}
					}
					move "Electro Ball", {
						text "30 damage."
						energyCost L, C, C
						onAttack {
							damage 30
						}
					}

				}
			case LANTURN_50:
				return evolution (this, from:"Chinchou", hp:HP110, type:LIGHTNING, retreatCost:2) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Confuse Ray", {
						text "Your opponent's Active Pokémon is now Confused."
						energyCost C
						onAttack {
							apply CONFUSED
						}
					}
					move "Aqua Spark", {
						text "60+ damage. If this Pokémon has any [W] Energy attached to it, this attack does 60 more damage."
						energyCost L, C, C
						onAttack {
							damage 60
							if(self.cards.energyCount(W))
								damage 60
						}
					}

				}
			case CHARJABUG_51:
				return evolution (this, from:"Grubbin", hp:HP090, type:LIGHTNING, retreatCost:3) {
					weakness FIGHTING
					move "Shocking Jaws", {
						text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L, C
						onAttack {
							damage 20
							flip{applyAfterDamage(PARALYZED)}
						}
					}
					move "Electric Ball", {
						text "50 damage."
						energyCost L, C, C
						onAttack {
							damage 50
						}
					}

				}
			case VIKAVOLT_52:
				return evolution (this, from:"Charjabug", hp:HP150, type:LIGHTNING, retreatCost:3) {
					weakness FIGHTING
					resistance METAL, MINUS20
					bwAbility "Strong Charge", {
						text "Once during your turn (before your attack), you may search your deck for a [G] Energy card and a [L] Energy card and attach them to your Pokémon in any way you like. Then, shuffle your deck."
						actionA {
							checkLastTurn()
							assert my.deck
							powerUsed()
							my.deck.search(max: 2, "", {Card card->card.cardTypes.contains(BASIC_ENERGY) && (card.asEnergyCard().containsTypePlain(G) || card.asEnergyCard().containsTypePlain(L))}, {CardList list-> list.findAll {it.asEnergyCard().containsTypePlain(G)}.size() <= 1 && list.findAll {it.asEnergyCard().containsTypePlain(L)}.size() <= 1}).each {attachEnergy(my.all.select("Attach $it to?"), it)}
							shuffleDeck()
						}
					}
					move "Electro Cannon", {
						text "150 damage. Discard 3 Energy from this Pokémon."
						energyCost L, C, C, C
						onAttack {
							damage 150
							discardSelfEnergy(C,C,C)
						}
					}

				}
			case TOGEDEMARU_53:
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

				}
			case ZUBAT_54:
				return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Astonish", {
						text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
						energyCost P
						attackRequirement {
							assert opp.hand
						}
						onAttack {
							astonish()
						}
					}

				}
			case GOLBAT_55:
				return evolution (this, from:"Zubat", hp:HP080, type:PSYCHIC, retreatCost:0) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Super Poison Breath", {
						text "Your opponent's Active Pokémon is now Poisoned."
						energyCost P
						onAttack {
							apply POISONED
						}
					}
					move "Acrobatics", {
						text "10+ damage. Flip 2 coins. This attack does 20 more damage for each heads."
						energyCost C, C
						onAttack {
							damage 10
							flip 2,{damage 20}
						}
					}

				}
			case CROBAT_56:
				return evolution (this, from:"Golbat", hp:HP130, type:PSYCHIC, retreatCost:0) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Triple Poison", {
						text "Your opponent's Active Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns."
						energyCost P
						onAttack {
							extraPoison(2)
							apply(POISONED)
						}
					}
					move "Surprise Strike", {
						text "60+ damage. If this Pokémon was on the Bench and became your Active Pokémon this turn, this attack does 60 more damage."
						energyCost C, C, C
						onAttack {
							damage 60
							if(self.lastSwitchedOut==bg.turnCount) damage 60
						}
					}

				}
			case ALOLAN_GRIMER_57:
				return basic (this, hp:HP080, type:PSYCHIC, retreatCost:3) {
					weakness PSYCHIC
					move "Super Poison Breath", {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Poisoned."
						onAttack {
							flip{apply POISONED}
						}
					}
					move "Pound", {
						text "40 damage."
						energyCost P, C, C
						onAttack {
							damage 40
						}
					}

				}
			case ALOLAN_MUK_58:
				return evolution (this, from:"Alolan Grimer", hp:HP120, type:PSYCHIC, retreatCost:4) {
					weakness PSYCHIC
					bwAbility "Power of Alchemy", {
						text "Each Basic Pokémon in play, in each player's hand, and in each player's discard pile has no Abilities."
						def effect1, effect2
						onActivate {
							effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
								if (h.effect.target.basic && h.effect.ability instanceof BwAbility) {
									h.object=true
								}
							}
							effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
								if ((h.effect.target as Card).cardTypes.is(BASIC)) {
									h.object=true
								}
							}
							new CheckAbilities().run(bg)
						}
						onDeactivate {
							effect1.unregister()
							effect2.unregister()
							new CheckAbilities().run(bg)
						}
					}
					move "Crunch", {
						text "90 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
						energyCost P, P, C, C
						onAttack {
							damage 90
							flip{afterDamage {discardDefendingEnergy()}}
						}
					}

				}
			case DROWZEE_59:
				return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					move "Psychic Boom", {
						text "10× damage. This attack does 10 damage times the amount of Energy attached to your opponent's Active Pokémon."
						energyCost P
						onAttack {
							damage 10*defending.cards.energyCount(C)
						}
					}
					move "Headbutt", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}

				}
			case HYPNO_60:
				return evolution (this, from:"Drowzee", hp:HP110, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					move "Meditate", {
						text "20+ damage. This attack does 10 more damage for each damage counter on your opponent's Active Pokémon."
						energyCost C, C
						onAttack {
							damage 20+10*defending.numberOfDamageCounters
						}
					}
					move "Hypnoblast", {
						text "70 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost P, C, C
						onAttack {
							damage 70
							applyAfterDamage(ASLEEP)
						}
					}

				}
			case ESPEON_GX_61:
				return evolution (this, from:"Eevee", hp:HP200, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Psybeam", {
						text "30 damage. Your opponent's Active Pokémon is now confused."
						energyCost P
						onAttack {
							damage 30
							applyAfterDamage(CONFUSED)
						}
					}
					move "Psychic", {
						text "60+ damage. This attack does 30 more damage times the number of Energy attached to your opponent's Active Pokémon."
						energyCost P, C, C
						onAttack {
							damage 60+30*defending.cards.energyCount(C)
						}
					}
					move "Divide GX", {
						text "Put 10 damage counters on your opponent's Pokémon in any way you like. (You can't use more than 1 GX attack per game.)"
						energyCost P, C, C
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							(1..10).each {
								if(opp.all) directDamage(10, opp.all.select("Put a damage counter on"))
							}
						}
					}

				}
			case MAREANIE_62:
				return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Poison Sting", {
						text "Your opponent's Active Pokémon is now Poisoned."
						energyCost P
						onAttack {
							apply POISONED
						}
					}

				}
			case TOXAPEX_63:
				return evolution (this, from:"Mareanie", hp:HP110, type:PSYCHIC, retreatCost:3) {
					weakness PSYCHIC
					bwAbility "Toxic Spikes", {
						text "Whenever your opponent's Active Pokémon retreats, their new Active Pokémon is Poisoned."
						delayedA {
							after RETREAT, {
								if(ef.retreater == self.owner.opposite.pbg.active){
									bc "Toxic Spikes"
									apply POISONED, ef.newActive, SRC_ABILITY
								}
							}
						}
					}
					move "Venoshock", {
						text "50+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 50 more damage."
						energyCost P, C, C
						onAttack {
							damage 50
							if(defending.isSPC(POISONED)) damage 50
						}
					}

				}
			case COSMOG_64:
				return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Dust Gathering", {
						text "Draw a card."
						energyCost C
						onAttack {
							draw 1
						}
					}

				}
			case COSMOEM_65:
				return evolution (this, from:"Cosmog", hp:HP090, type:PSYCHIC, retreatCost:3) {
					weakness PSYCHIC
					move "Teleport", {
						text "Switch this Pokémon with 1 of your Benched Pokémon."
						energyCost C
						onAttack {
							switchYourActive()
						}
					}

				}
			case LUNALA_GX_66:
				return evolution (this, from:"Cosmoem", hp:HP250, type:PSYCHIC, retreatCost:2) {
					weakness DARKNESS
					resistance FIGHTING, MINUS20
					bwAbility "Psychic Transfer", {
						text "As often as you like during your turn (before your attack), you may move a [P] Energy from 1 of your Pokémon to another of your Pokémon."
						actionA {
							assert my.all.findAll {it.cards.energyCount(P)>0}
							assert my.all.size()>=2
							powerUsed()
							def src=my.all.findAll {it.cards.energyCount(P)>0}.select("Source for [P]")
							def card=src.cards.filterByEnergyType(P).select("Card to move").first()
							def tar=my.all
							tar.remove(src)
							tar=tar.select("Target for [P]")
							energySwitch(src, tar, card)
						}
					}
					move "Moongeist Beam", {
						text "120 damage. The Defending Pokémon can't be healed during your next turn."
						energyCost P, P, P, P
						onAttack {
							damage 120
							delayed {
								before REMOVE_DAMAGE_COUNTER, defending, {
									prevent()
								}
								unregisterAfter 3
							}
						}
					}
					move "Lunar Fall GX", {
						text "Knock out 1 of your opponent's basic Pokémon that isn't a Pokémon-GX. (You can't use more than 1 GX attack per game)."
						energyCost P, P, P
						attackRequirement {
							gxCheck()
							assert opp.all.findAll {it.basic && !it.pokemonGX} : "Opponent has no suitable pokemon"
						}
						onAttack {
							gxPerform()
							def pcs = opp.all.findAll {it.basic && !it.pokemonGX}.select("Knockout?")
							new Knockout(pcs).run(bg)
						}
					}

				}
			case MAKUHITA_67:
				return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
					weakness PSYCHIC
					move "Surprise Attack", {
						text "20 damage. Flip a coin. If tails, this attack does nothing."
						energyCost F
						onAttack {
							flip {damage 20}
						}
					}
					move "Strength", {
						text "40 damage."
						energyCost F, C
						onAttack {
							damage 40
						}
					}

				}
			case HARIYAMA_68:
				return evolution (this, from:"Makuhita", hp:HP130, type:FIGHTING, retreatCost:4) {
					weakness PSYCHIC
					move "Push Out", {
						text "60 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
						energyCost F, C, C
						onAttack {
							damage 60
							whirlwind()
						}
					}
					move "Megaton Slap Push", {
						text "130 damage."
						energyCost F, C, C, C
						onAttack {
							damage 130
						}
					}

				}
			case ROGGENROLA_69:
				return basic (this, hp:HP070, type:FIGHTING, retreatCost:3) {
					weakness GRASS
					move "Smack Down", {
						text "20+ damage. If your opponent's Active Pokémon has [F] Resistance, this attack does 50 more damage."
						energyCost F, C
						onAttack {
							damage 20
							if(defending.resistances.find{it.type==F})
								damage 50
						}
					}

				}
			case BOLDORE_70:
				return evolution (this, from:"Roggenrola", hp:HP110, type:FIGHTING, retreatCost:4) {
					weakness GRASS
					move "Headbutt", {
						text "30 damage."
						energyCost F, C
						onAttack {
							damage 30
						}
					}
					move "Rock Hurl", {
						text "50 damage. This attack's damage isn't affected by Resistance."
						energyCost F, C, C
						onAttack {
							dontApplyResistance()
							damage 50
						}
					}

				}
			case GIGALITH_71:
				return evolution (this, from:"Boldore", hp:HP160, type:FIGHTING, retreatCost:4) {
					weakness GRASS
					move "Rock Artillery", {
						text "50× damage. Discard any amount of [F] Energy from your Pokémon. This attack does 50 damage for each card you discarded in this way."
						energyCost F, C
						onAttack {
							int count=0
							while (1) {
								def tar = my.all.findAll {it.cards.filterByEnergyType(F).notEmpty()}
								if (!tar) break
								def pcs = tar.select("Pokemon that has [F] energy to discard. Cancel to stop", false)
								if (!pcs) break
								pcs.cards.filterByEnergyType(F).select("[F] Energy to discard").discard()
								count++
							}
							damage 50*count
						}
					}
					move "Rock Tumble", {
						text "120 damage. This attack's damage isn't affected by Resistance."
						energyCost F, F, C, C
						onAttack {
							dontApplyResistance()
							damage 120
						}
					}

				}
			case CRABRAWLER_72:
				return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
					weakness PSYCHIC
					move "Punch", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}
					move "Crabhammer", {
						text "40 damage."
						energyCost F, C, C
						onAttack {
							damage 40
						}
					}

				}
			case PASSIMIAN_73:
				return basic (this, hp:HP110, type:FIGHTING, retreatCost:1) {
					weakness PSYCHIC
					move "Fling", {
						text "This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost F
						attackRequirement {
							assert opp.bench.notEmpty()
						}
						onAttack {
							damage 30, opp.bench.select()
						}
					}
					move "Team Play", {
						text "10+ damage. This attack does 30 damage for each of your Benched Passimian."
						energyCost C, C
						onAttack {
							damage 10+30*my.bench.findAll {it.name=="Passimian"}.size()
						}
					}

				}
			case SANDYGAST_74:
				return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
					weakness GRASS
					move "Shore Up", {
						text "Attack a [F] Energy card from your discard pile to this Pokémon."
						energyCost C
						onAttack {
							attachEnergyFromDiscardPile(F)
						}
					}
					move "Sand Tomb", {
						text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
						energyCost F, C, C
						onAttack {
							damage 30
							cantRetreat(defending)
						}
					}

				}
			case PALOSSAND_75:
				return evolution (this, from:"Sandygast", hp:HP130, type:FIGHTING, retreatCost:4) {
					weakness GRASS
					bwAbility "Wall of Sand", {
						text "This Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
						delayedA {
							before APPLY_ATTACK_DAMAGES, {
								bg.dm().each {
									if(it.to==self && it.dmg.value && it.notNoEffect){
										bc "Wall of Sand -20"
										it.dmg -= hp(20)
									}
								}
							}
						}
					}
					move "Absorb Vitality", {
						text "50 damage. Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon."
						energyCost F, C, C, C
						onAttack {
							damage 50
							removeDamageCounterEqualToDamageDone()
						}
					}

				}
			case ALOLAN_RATTATA_76:
				return basic (this, hp:HP040, type:DARKNESS, retreatCost:0) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Gnaw", {
						text "20 damage."
						onAttack {
							damage 20
						}
					}

				}
			case ALOLAN_RATICATE_77:
				return evolution (this, from:"Alolan Rattata", hp:HP120, type:DARKNESS, retreatCost:3) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Evil Orders", {
						text "Search your deck for a number of cards up to the number of your Benched Pokémon and put them into your hand. Then, shuffle your deck."
						energyCost C, C
						attackRequirement {
							assert my.bench.notEmpty && my.deck.notEmpty
						}
						onAttack {
							int count = my.bench.size()
							my.deck.select(max: count).moveTo(hidden: true, my.hand)
							shuffleDeck()
						}
					}
					move "Endeavor", {
						text "60+ damage. Flip 2 coins. This attack does 30 more damage for each heads."
						energyCost D, C, C
						onAttack {
							damage 60
							flip 2,{damage 30}
						}
					}

				}
			case ALOLAN_MEOWTH_78:
				return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Fury Swipes", {
						text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
						onAttack {
							flip 3,{damage 10}
						}
					}

				}
			case ALOLAN_PERSIAN_79:
				return evolution (this, from:"Alolan Meowth", hp:HP090, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Taunt", {
						text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
						attackRequirement {
							assert opp.bench.notEmpty
						}
						onAttack {
							sw opp.active, opp.bench.select()
						}
					}
					move "Claw Rend", {
						text "30+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 30 more damage."
						energyCost D
						onAttack {
							damage 30
							if(opp.active.numberOfDamageCounters) damage 30
						}
					}

				}
			case UMBREON_GX_80:
				return evolution (this, from:"Eevee", hp:HP200, type:DARKNESS, retreatCost:2) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Strafe", {
						text "30 damage. You may switch this Pokémon with 1 of your benched Pokémon."
						energyCost D
						onAttack {
							damage 30
							switchYourActive(may: true)
						}
					}
					move "Shadow Bullet", {
						text "90 damage. This attack does 30 damage to one of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost D, C, C
						onAttack {
							damage 90
							if(opp.bench) damage 30, opp.bench.select('30 damage')
						}
					}
					move "Dark Call GX", {
						text "Discard 2 Energy attached to your opponent's Pokémon. (You can't use more than 1 GX attack in a game)."
						energyCost D, C
						attackRequirement {gxCheck()}
						onAttack {
							gxPerform()
							discardOpponentEnergy(Target.OPP_ALL)
							discardOpponentEnergy(Target.OPP_ALL)
						}
					}

				}
			case CARVANHA_81:
				return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Gnaw Through", {
						text "Discard all Pokémon Tool cards from your opponent's Active Pokémon."
						energyCost C
						onAttack {
							targeted(defending){
								defending.cards.filterByType(POKEMON_TOOL).discard()
							}
						}
					}
					move "Bite", {
						text "20 damage."
						energyCost D, C
						onAttack {
							damage 20
						}
					}

				}
			case SHARPEDO_82:
				return evolution (this, from:"Carvanha", hp:HP110, type:DARKNESS, retreatCost:0) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					bwAbility "Rough Skin", {
						text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), put 3 damage counters on the Attacking Pokémon."
						delayedA (priority: LAST) {
							before APPLY_ATTACK_DAMAGES, {
								if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
									bc "Rough Skin activates"
									directDamage(30, ef.attacker)
								}
							}
						}
					}
					move "Aqua Impact", {
						text "60+ damage. This attack does 20 more damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
						energyCost D, C, C
						onAttack {
							damage 60 + 20 * opp.active.retreatCost
						}
					}

				}
			case SANDILE_83:
				return basic (this, hp:HP070, type:DARKNESS, retreatCost:2) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Gnaw", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}
					move "Crunch", {
						text "30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
						energyCost D, D, C
						onAttack {
							damage 30
							flip { afterDamage {
								discardDefendingEnergy()
							} }
						}
					}

				}
			case KROKOROK_84:
				return evolution (this, from:"Sandile", hp:HP090, type:DARKNESS, retreatCost:2) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Knock Off", {
						text "20 damage. Discard a random card from your opponent's hand."
						energyCost C, C
						onAttack {
							damage 20
							discardRandomCardFromOpponentsHand()
						}
					}
					move "Darkness Fang", {
						text "60 damage."
						energyCost D, D, C
						onAttack {
							damage 60
						}
					}

				}
			case KROOKODILE_85:
				return evolution (this, from:"Krokorok", hp:HP150, type:DARKNESS, retreatCost:3) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "False Accusation", {
						text "20+ damage. This attack does 20 more damage for each card in your opponent's hand."
						energyCost C, C
						onAttack {
							damage 20 + 20*opp.hand.size()
						}
					}
					move "Obsidian Fang", {
						text "120 damage. Before doing damage, discard all Pokémon Tool cards from your opponent's Active Pokémon."
						energyCost D, D, C
						onAttack {
							damage 120
							targeted(defending){
								defending.cards.filterByType(POKEMON_TOOL).discard()
							}
						}
					}

				}
			case ALOLAN_DIGLETT_86:
				return basic (this, hp:HP050, type:METAL, retreatCost:1) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					move "Spelunk", {
						text "Look at the top 3 cards of your deck and put them back in any order."
						attackRequirement {
							assert deck
						}
						onAttack {
							def list=rearrange(deck.subList(0,3), "Rearrange top 3 cards in your deck")
							deck.setSubList(0, list)
						}
					}
					move "Mud-Slap", {
						text "10 damage."
						energyCost M
						onAttack {
							damage 10
						}
					}

				}
			case ALOLAN_DUGTRIO_87:
				return evolution (this, from:"Alolan Diglett", hp:HP100, type:METAL, retreatCost:2) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					bwAbility "Tangling Hair", {
						text "Your opponent's Active Pokémon's Retreat Cost is [C] more."
						getterA (GET_RETREAT_COST) { h->
							if(h.effect.target.owner == self.owner.opposite && h.effect.target.active) {
								h.object += 1
							}
						}
					}
					move "Dig Under", {
						text "This attack does 50 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness or Resistance."
						energyCost C, C, C
						onAttack {
							noWrDamage 50, opp.all.select()
						}
					}

				}
			case SKARMORY_88:
				return basic (this, hp:HP110, type:METAL, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Metallic Sound", {
						text "Discard all Special Energy from each Pokémon."
						energyCost C, C
						onAttack {
							all.each { pcs ->
								def list = pcs.cards.filterByType(SPECIAL_ENERGY)
								if(list) {
									targeted (pcs) {
										list.discard()
									}
								}
							}
						}
					}
					move "Aerial Ace", {
						text "60+ damage. Flip a coin. If heads, this attack does 30 more damage."
						energyCost M, C, C
						onAttack {
							damage 60
							flip {damage 30}
						}
					}

				}
			case SOLGALEO_GX_89:
				return evolution (this, from:"Cosmoem", hp:HP250, type:METAL, retreatCost:3) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					bwAbility "Ultra Road", {
						text "Once during your turn (before your attack), you may switch your Active Pokémon with one of your Benched Pokémon."
						actionA {
							checkLastTurn()
							assert my.bench.notEmpty
							powerUsed()
							sw my.active, my.bench.select()
						}
					}
					move "Sunsteel Strike", {
						text "230 damage. Discard all Energy from this Pokémon."
						energyCost M, M, C
						onAttack {
							damage 230
							discardAllSelfEnergy(null)
						}
					}
					move "Sol Burst GX", {
						text "Search your deck for up to 5 Energy cards and attach them to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)"
						energyCost M
						attackRequirement {
							assert my.deck.notEmpty
							gxCheck()
						}
						onAttack {
							gxPerform()
							my.deck.select(min: 0, max: 5, cardTypeFilter(ENERGY)).each {
								attachEnergy(my.all.select("Attach $it to"), it)
							}
							shuffleDeck()
						}
					}

				}
			case SNUBBULL_90:
				return basic (this, hp:HP090, type:FAIRY, retreatCost:1) {
					weakness METAL
					resistance DARKNESS, MINUS20
					move "Reckless Charge", {
						text "20 damage. Flip a coin. If tails, this Pokémon does 10 damage to itself."
						energyCost Y
						onAttack {
							damage 20
							flipTails {damage 10,self}
						}
					}

				}
			case GRANBULL_91:
				return evolution (this, from:"Snubbull", hp:HP110, type:FAIRY, retreatCost:2) {
					weakness METAL
					resistance DARKNESS, MINUS20
					move "Dark Clamp", {
						text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
						energyCost Y
						onAttack {
							damage 30
							cantRetreat(defending)
						}
					}
					move "Fight Back", {
						text "50+ damage. If this Pokémon has any damage counters on it, this attack does 80 more damage."
						energyCost Y, C, C
						onAttack {
							damage 50
							if(my.active.numberOfDamageCounters) damage 80
						}
					}

				}
			case CUTIEFLY_92:
				return basic (this, hp:HP030, type:FAIRY, retreatCost:1) {
					weakness METAL
					resistance DARKNESS, MINUS20
					move "Fly Around", {
						text "10 damage. If any damage is done to this Pokémon by attacks during your opponent's next turn, flip a coin. If heads, prevent that damage."
						energyCost Y
						onAttack {
							damage 10
							delayed (priority: BEFORE_LAST) {
								before APPLY_ATTACK_DAMAGES, {
									def entry=bg.dm().find({it.to==self && it.dmg.value && it.notNoEffect})
									if(entry){
										flip "Smooth Coat", {
											entry.dmg=hp(0)
										}
									}
								}
								unregisterAfter 2
							}
						}
					}

				}
			case RIBOMBEE_93:
				return evolution (this, from:"Cutiefly", hp:HP060, type:FAIRY, retreatCost:1) {
					weakness METAL
					resistance DARKNESS, MINUS20
					bwAbility "Curative Pollen", {
						text "Once during your turn (before your attack), you may heal 20 damage from 1 of your Pokémon."
						actionA {
							checkLastTurn()
							assert my.all.findAll {it.numberOfDamageCounters} : "No suitable pokemon"
							powerUsed()
							def pcs=my.all.findAll {it.numberOfDamageCounters}.select("Heal which one")
							heal(20,pcs,SRC_ABILITY)
						}
					}
					move "Fairy Wind", {
						text "30 damage."
						energyCost Y
						onAttack {
							damage 30
						}
					}

				}
			case DRATINI_94:
				return basic (this, hp:HP060, type:DRAGON, retreatCost:2) {
					weakness FAIRY
					move "Signs of Evolution", {
						text "Search your deck for a Dratini, a Dragonair, and a Dragonite, reveal them, and put them into your hand. Then, shuffle your deck."
						energyCost G
						onAttack {
							my.deck.search(max: 3, "Select a Dratini, a Dragonair and a Dragonite", {it.name == "Dratini" || it.name == "Dragonair" || it.name == "Dragonite"}, {CardList list ->
								list.filterByNameEquals("Dratini").size() <= 1 && list.filterByNameEquals("Dragonair").size() <= 1 && list.filterByNameEquals("Dragonite").size() <= 1
							}).moveTo(my.hand)
							shuffleDeck()
						}
					}
					move "Tail Smack", {
						text "10 damage."
						energyCost L
						onAttack {
							damage 10
						}
					}

				}
			case DRAGONAIR_95:
				return evolution (this, from:"Dratini", hp:HP090, type:DRAGON, retreatCost:2) {
					weakness FAIRY
					move "Dragon's Wish", {
						text "During your next turn, you may attach any number of Energy cards from your hand to your Pokémon."
						energyCost C
						onAttack {
							delayed {
								before(PREVENT_PLAY_ENERGY, null, null, PLAY_ENERGY) {
									prevent()
								}
								unregisterAfter 3
							}
						}
					}
					move "Tail Smack", {
						text "60 damage."
						energyCost G, L, C
						onAttack {
							damage 60
						}
					}

				}
			case DRAGONITE_96:
				return evolution (this, from:"Dragonair", hp:HP160, type:DRAGON, retreatCost:4) {
					weakness FAIRY
					move "Dragon Wave", {
						text "130 damage. Discard a [G] Energy and a [L] Energy from this Pokémon."
						energyCost G, L
						onAttack {
							damage 130
							discardSelfEnergy G, L
						}
					}
					move "Giant Tail", {
						text "200 damage. Flip a coin. If tails, this attack does nothing."
						energyCost C, C, C, C, C
						onAttack {
							flip{damage 200}
						}
					}

				}
			case SPEAROW_97:
				return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Peck Bugs", {
						text "10+ damage. If your opponent's Active Pokémon is a [G] Pokémon, this attack does 30 more damage."
						energyCost C
						onAttack {
							damage 10
							if(defending.types.contains(G)) damage 30
						}
					}

				}
			case FEAROW_98:
				return evolution (this, from:"Spearow", hp:HP090, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Devastating Wind", {
						text "Your opponent shuffles their hand into their deck and draws 3 cards."
						energyCost C
						onAttack {
							shuffleDeck(opp.hand, TargetPlayer.OPPONENT)
							opp.hand.clear()
							draw(3, TargetPlayer.OPPONENT)
						}
					}
					move "Slashing Strike", {
						text "60 damage. This Pokémon can't use Slashing Strike during your next turn."
						energyCost C
						onAttack {
							damage 60
							cantUseAttack(thisMove, self)
						}
					}

				}
			case KANGASKHAN_99:
				return basic (this, hp:HP130, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Cross-Cut", {
						text "30+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 30 more damage."
						energyCost C
						onAttack {
							damage 30
							if(defending.evolution) damage 30
						}
					}
					move "Hurricane Punch", {
						text "50× damage. Flip 4 coins. This attack does 50 damage for each heads."
						energyCost C, C, C, C
						onAttack {
							flip 4,{damage 50}
						}
					}

				}
			case TAUROS_GX_100:
				return basic (this, hp:HP180, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Rage", {
						text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
						energyCost C, C
						onAttack {
							damage 20+10*self.numberOfDamageCounters
						}
					}
					move "Horn Attack", {
						text "60 damage."
						energyCost C, C
						onAttack {
							damage 60
						}
					}
					move "Mad Bull GX", {
						text "30× damage. This attack does 30 damage for each damage counter on this Pokémon. (You can't use more than 1 GX attack in a game.)"
						energyCost C, C
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							damage 30*self.numberOfDamageCounters
						}
					}

				}
			case EEVEE_101:
				return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					bwAbility "Energy Evolution", {
						text "When you attach a basic Energy card from your hand to this Pokémon during your turn, you may search your deck for a card that evolves from this Pokémon that is the same type as that Energy card and put it onto this Pokémon to evolve it. Then, shuffle your deck."
						delayedA {
							after ATTACH_ENERGY, self, {
								if(ef.reason==PLAY_FROM_HAND && ef.card instanceof BasicEnergyCard && self.owner.pbg.deck){
									if(confirm("Use Energy Evolution?")){
										powerUsed()
										def sel=self.owner.pbg.deck.select(min:0, "Energy Evolution ${ef.card.basicType}",
												{it.cardTypes.is(EVOLUTION) && it.types.contains(ef.card.basicType) && it.predecessor==self.name}, self.owner)
										if(sel){
											evolve(self, sel.first(), OTHER)
										}
										shuffleDeck(null, self.owner.toTargetPlayer())
									}
								}
							}
						}
					}
					move "Quick Draw", {
						text "Flip a coin. If heads, draw a card."
						energyCost C
						onAttack {
							flip{draw 1}
						}
					}

				}
			case SPINDA_102:
				return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					move "Teeter Punch", {
						text "30 damage. Your opponent's Active Pokémon is now Confused."
						energyCost C
						onAttack {
							damage 30
							applyAfterDamage CONFUSED
						}
					}

				}
			case LILLIPUP_103:
				return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					move "Work Up", {
						text "During your next turn, this Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
						energyCost C
						onAttack {
							doMoreDamageNextTurn(thisMove, 20, self)
						}
					}
					move "Bite", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}

				}
			case HERDIER_104:
				return evolution (this, from:"Lillipup", hp:HP090, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					bwAbility "Treasure Hunt", {
						text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put an Item card from your discard pile into your hand."
						onActivate {r->
							if(r==PLAY_FROM_HAND && my.discard.filterByType(ITEM) && confirm("Use Treasure Hunt?")){
								powerUsed()
								my.discard.filterByType(ITEM).select("Put to hand").moveTo(my.hand)
							}
						}
					}
					move "Bite", {
						text "50 damage."
						energyCost C, C, C
						onAttack {
							damage 50
						}
					}

				}
			case STOUTLAND_105:
				return evolution (this, from:"Stoutland", hp:HP150, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Ferocious Bellow", {
						text "50 damage. During your opponent's next turn, the Defending Pokémon's attacks do 50 less damage (before applying Weakness and Resistance)."
						energyCost C, C, C
						onAttack {
							damage 50
							targeted (defending) {
								delayed {
									after PROCESS_ATTACK_EFFECTS, defending, {
										bg.dm().each {
											if(it.from==defending && it.notNoEffect && it.dmg.value){
												bc "Ferocious Bellow -50"
												it.dmg -= hp(50)
											}
										}
									}
									after EVOLVE, defending, {unregister()}
									after SWITCH, defending, {unregister()}
									after SWITCH, self, {unregister()}
									unregisterAfter 2
								}
							}
						}
					}
					move "Hammer In", {
						text "120 damage."
						energyCost C, C, C, C
						onAttack {
							damage 120
						}
					}

				}
			case PIKIPEK_106:
				return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Rock Smash", {
						text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
						energyCost C
						onAttack {
							damage 10
							flip{damage 10}
						}
					}

				}
			case TRUMBEAK_107:
				return evolution (this, from:"Pikipek", hp:HP080, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Bullet Seed", {
						text "20× damage. Flip 4 coins. This attack does 20 damage for each heads."
						energyCost C
						onAttack {
							flip 4,{damage 20}
						}
					}

				}
			case TOUCANNON_108:
				return evolution (this, from:"Trumbeak", hp:HP140, type:COLORLESS, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Echoed Voice", {
						text "60 damage. During your next turn, this Pokémon's Echoed Voice attack does 60 more damage (before applying Weakness and Resistance)."
						energyCost C, C
						onAttack {
							damage 60
							increasedBaseDamageNextTurn("Echoed Voice", hp(60))
						}
					}
					move "Beak Blast", {
						text "100 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Burned."
						energyCost C, C, C
						onAttack {
							damage 100
							flip{applyAfterDamage(BURNED)}
						}
					}

				}
			case YUNGOOS_109:
				return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					move "Tackle", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}
					move "Bite", {
						text "20 damage."
						energyCost C, C
						onAttack {
							damage 20
						}
					}

				}
			case GUMSHOOS_GX_110:
				return evolution (this, from:"Yungoos", hp:HP210, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					bwAbility "Search the Premises", {
						text "Once during your turn (before your attack), you may have your opponent reveal their hand."
						actionA {
							checkLastTurn()
							assert opp.hand : "Empty hand"
							powerUsed()
							opp.hand.showToMe("Opponent's hand")
						}
					}
					move "Headbutt Bounce", {
						text "100 damage."
						energyCost C, C, C
						onAttack {
							damage 100
						}
					}
					move "Gumshoe Chance GX", {
						text "10+ damage. This attack does 50 damage times the amount of Energy attached to your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
						energyCost C
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							damage 10+50*defending.cards.energyCount(C)
						}
					}

				}
			case STUFFUL_111:
				return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					move "Tackle", {
						text "30 damage."
						energyCost C, C
						onAttack {
							damage 30
						}
					}

				}
			case BEWEAR_112:
				return evolution (this, from:"Stufful", hp:HP130, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Bear Hug", {
						text "40 damage. The Defending Pokémon can't retreat during your opponent's next turn."
						energyCost C, C
						onAttack {
							damage 40
							cantRetreat(defending)
						}
					}
					move "Superpower", {
						text "80+ damage. You may do 40 more damage. If you do, this Pokémon does 20 damage to itself."
						energyCost C, C, C
						onAttack {
							damage 80
							if(confirm("You may do 40 more damage. If you do, this Pokémon does 20 damage to itself.")){
								damage 40
								damage 20,self
							}
						}
					}

				}
			case ORANGURU_113:
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
						text "60+ damage. This attack does 20 more damage time the amount of Energy attached to your opponent's Active Pokémon."
						energyCost C, C, C
						onAttack {
							damage 60+20*defending.cards.energyCount(C)
						}
					}

				}
			case BIG_MALASADA_114:
				return itemCard (this) {
					text "Heal 20 damage and remove a Special Condition from your Active Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
					onPlay {
						heal 20, my.active
						if(my.active.specialConditions){
							SpecialConditionType spc = choose(my.active.specialConditions.asList(), "Which special condition you want to remove")
							clearSpecialCondition(my.active, TRAINER_CARD, Arrays.asList(spc))
						}
					}
					playRequirement{
						assert my.active.specialConditions || my.active.numberOfDamageCounters : "Your pokemon is fine"
					}
				}
			case CRUSHING_HAMMER_115:
				return copy(EmergingPowers.CRUSHING_HAMMER_92, this)
			case ENERGY_RETRIEVAL_116:
				return copy(BlackWhite.ENERGY_RETRIEVAL_92, this)
			case ENERGY_SWITCH_117:
				return copy(BlackWhite.ENERGY_SWITCH_94, this)
			case EXP__SHARE_118:
				return copy(NextDestinies.EXP__SHARE_87, this);
			case GREAT_BALL_119:
				return copy(EmergingPowers.GREAT_BALL_93, this);
			case HAU_120:
				return supporter (this) {
					text "Draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
					onPlay {
						draw 3
					}
					playRequirement{
						assert my.deck.notEmpty
					}
				}
			case ILIMA_121:
				return supporter (this) {
					text "Each player shuffles their hand into their deck and flips a coin. If heads, that player draws 6 cards. If tails, they draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
					onPlay {
						shuffleDeck(hand.getExcludedList(thisCard))
						hand.removeAll(hand.getExcludedList(thisCard))
						flip 1,{draw 6},{draw 3}
						shuffleDeck(opp.hand, TargetPlayer.OPPONENT)
						opp.hand.clear()
						flip 1,{draw 6, TargetPlayer.OPPONENT},{draw 3, TargetPlayer.OPPONENT}
					}
					playRequirement{
					}
				}
			case LILLIE_122:
				return supporter (this) {
					text "Draw cards until you have 6 cards in your hand. If it's your first turn, draw cards until you have 8 cards in your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
					onPlay {
						draw ((bg.turnCount <= 2 ? 8 : 6) - hand.getExcludedList(thisCard).size())
					}
					playRequirement{
						assert deck.notEmpty
						assert hand.getExcludedList(thisCard).size() < (bg.turnCount <= 2 ? 8 : 6)
					}
				}
			case NEST_BALL_123:
				return itemCard (this) {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
					onPlay {
						my.deck.search ("Search your deck for a Basic Pokémon and put it onto your Bench", cardTypeFilter(BASIC)).each {
							my.deck.remove(it)
							benchPCS(it)
						}
						shuffleDeck()
					}
					playRequirement{
						assert my.deck.notEmpty
						assert my.bench.notFull
					}
				}
			case POISON_BARB_124:
				return pokemonTool (this) {
					text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf the Pokémon this card is attached to is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Poisoned.\nYou may play as many Item cards as you like during your turn (before your attack)."
					def eff
					onPlay {reason->
						eff = delayed(priority: LAST) {
							before APPLY_ATTACK_DAMAGES, {
								bg().dm().each {
									if (it.to == self && it.dmg.value > 0 && bg.currentTurn==self.owner.opposite
											&& self.active) {
										bc "Poison Barb activates"
										apply POISONED, it.from, SRC_ABILITY
									}
								}
							}
						}
					}
					onRemoveFromPlay {
						eff.unregister()
					}
				}
			case POKE_BALL_125:
				return copy(BlackWhite.POKE_BALL_97, this)
			case POKEMON_CATCHER_126:
				return copy(KalosStarterSet.POKEMON_CATCHER_36, this)
			case POTION_127:
				return copy(BlackWhite.POTION_100, this)
			case PROFESSOR_KUKUI_128:
				return supporter (this) {
					text "Draw 2 cards. During this turn, your Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).\nYou may play only 1 Supporter card during your turn (before your attack)."
					onPlay {
						draw 2
						delayed {
							after PROCESS_ATTACK_EFFECTS, {
								bg.dm().each {if(it.to.active && it.from.owner==thisCard.player && it.to.owner!=it.from.owner && it.dmg.value){
									bc "Professor Kukui +20"
									it.dmg += hp(20)
								}}
							}
							unregisterAfter 1
						}
					}
					playRequirement{
					}
				}
			case RARE_CANDY_129:
				return copy(DarkExplorers.RARE_CANDY_100, this)
			case REPEL_130:
				return itemCard (this) {
					text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
					onPlay {
						def pcs = opp.bench.oppSelect("Select new active pokemon")
						sw(opp.active, pcs)
					}
					playRequirement{
						assert opp.bench.notEmpty
					}
				}
			case ROTOM_DEX_131:
				return itemCard (this) {
					text "After counting your Prize cards, shuffle them into your deck. Then, take that many cards from the top of your deck and put them face down as your Prize cards.\nYou may play as many Item cards as you like during your turn (before your attack)."
					onPlay {
						int count = my.prizeAsList.size()
						my.prizeAsList.moveTo(my.deck)
						shuffleDeck()
						for(int i=0;i<count;i++){
							my.prize[i] = my.deck.remove(0)
						}
					}
					playRequirement{
					}
				}
			case SWITCH_132:
				return copy(BlackWhite.SWITCH_104, this)
			case TEAM_SKULL_GRUNT_133:
				return supporter (this) {
					text "Your opponent reveals their hand. Discard 2 Energy cards from it.\nYou may play only 1 Supporter card during your turn (before your attack)."
					onPlay {
						opp.hand.showToMe("Opponent's hand")
						def list = opp.hand.filterByType(ENERGY)
						if(list){
							list.select(count: 2, "Discard").discard()
						}
					}
					playRequirement{
						assert opp.hand
					}
				}
			case TIMER_BALL_134:
				return itemCard (this) {
					text "Flip 2 coins. For each heads, search your deck for an Evolution Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
					onPlay {
						flip 2, {
							my.deck.search (cardTypeFilter(EVOLUTION)).moveTo(my.hand)
						}
						shuffleDeck()
					}
					playRequirement{
						assert my.deck.notEmpty
					}
				}
			case ULTRA_BALL_135:
				return copy(DarkExplorers.ULTRA_BALL_102, this)
			case DOUBLE_COLORLESS_ENERGY_136:
				return copy(Xy.DOUBLE_COLORLESS_ENERGY_130, this)
			case RAINBOW_ENERGY_137:
				return copy(Xy.RAINBOW_ENERGY_131, this)
			case LURANTIS_GX_138:
				return copy (LURANTIS_GX_15, this)
			case LAPRAS_GX_139:
				return copy (LAPRAS_GX_35, this)
			case ESPEON_GX_140:
				return copy (ESPEON_GX_61, this)
			case LUNALA_GX_141:
				return copy (LUNALA_GX_66, this)
			case UMBREON_GX_142:
				return copy (UMBREON_GX_80, this)
			case SOLGALEO_GX_143:
				return copy (SOLGALEO_GX_89, this)
			case TAUROS_GX_144:
				return copy (TAUROS_GX_100, this)
			case GUMSHOOS_GX_145:
				return copy (GUMSHOOS_GX_110, this)
			case ILIMA_146:
				return copy (ILIMA_121, this)
			case LILLIE_147:
				return copy (LILLIE_122, this)
			case PROFESSOR_KUKUI_148:
				return copy (PROFESSOR_KUKUI_128, this)
			case TEAM_SKULL_GRUNT_149:
				return copy (TEAM_SKULL_GRUNT_133, this)
			case LURANTIS_GX_150:
				return copy (LURANTIS_GX_15, this)
			case LAPRAS_GX_151:
				return copy (LAPRAS_GX_35, this)
			case ESPEON_GX_152:
				return copy (ESPEON_GX_61, this)
			case LUNALA_GX_153:
				return copy (LUNALA_GX_66, this)
			case UMBREON_GX_154:
				return copy (UMBREON_GX_80, this)
			case SOLGALEO_GX_155:
				return copy (SOLGALEO_GX_89, this)
			case TAUROS_GX_156:
				return copy (TAUROS_GX_100, this)
			case GUMSHOOS_GX_157:
				return copy (GUMSHOOS_GX_110, this)
			case NEST_BALL_158:
				return copy (NEST_BALL_123, this)
			case ROTOM_DEX_159:
				return copy (ROTOM_DEX_131, this)
			case SWITCH_160:
				return copy (SWITCH_132, this)
			case ULTRA_BALL_161:
				return copy (ULTRA_BALL_135, this)
			case PSYCHIC_ENERGY_162:
				return basicEnergy (this, PSYCHIC)
			case METAL_ENERGY_163:
				return basicEnergy (this, METAL)
			case GRASS_ENERGY_164:
				return basicEnergy (this, GRASS)
			case FIRE_ENERGY_165:
				return basicEnergy (this, FIRE)
			case WATER_ENERGY_166:
				return basicEnergy (this, WATER)
			case LIGHTNING_ENERGY_167:
				return basicEnergy (this, LIGHTNING)
			case PSYCHIC_ENERGY_168:
				return basicEnergy (this, PSYCHIC)
			case FIGHTING_ENERGY_169:
				return basicEnergy (this, FIGHTING)
			case DARKNESS_ENERGY_170:
				return basicEnergy (this, DARKNESS)
			case METAL_ENERGY_171:
				return basicEnergy (this, METAL)
			case FAIRY_ENERGY_172:
				return basicEnergy (this, FAIRY)
			default:
				return null
		}
	}

}
