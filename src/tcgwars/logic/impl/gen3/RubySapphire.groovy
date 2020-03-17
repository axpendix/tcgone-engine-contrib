package tcgwars.logic.impl.gen3;

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
public enum RubySapphire implements CardInfo {

	AGGRON_1 ("Aggron", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
	BEAUTIFLY_2 ("Beautifly", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	BLAZIKEN_3 ("Blaziken", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	CAMERUPT_4 ("Camerupt", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	DELCATTY_5 ("Delcatty", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	DUSTOX_6 ("Dustox", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	GARDEVOIR_7 ("Gardevoir", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
	HARIYAMA_8 ("Hariyama", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	MANECTRIC_9 ("Manectric", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MIGHTYENA_10 ("Mightyena", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SCEPTILE_11 ("Sceptile", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	SLAKING_12 ("Slaking", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
	SWAMPERT_13 ("Swampert", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
	WAILORD_14 ("Wailord", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	BLAZIKEN_15 ("Blaziken", 15, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	BRELOOM_16 ("Breloom", 16, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	DONPHAN_17 ("Donphan", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	NOSEPASS_18 ("Nosepass", 18, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
	PELIPPER_19 ("Pelipper", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SCEPTILE_20 ("Sceptile", 20, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	SEAKING_21 ("Seaking", 21, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SHARPEDO_22 ("Sharpedo", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SWAMPERT_23 ("Swampert", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
	WEEZING_24 ("Weezing", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	ARON_25 ("Aron", 25, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
	CASCOON_26 ("Cascoon", 26, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	COMBUSKEN_27 ("Combusken", 27, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	COMBUSKEN_28 ("Combusken", 28, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	DELCATTY_29 ("Delcatty", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	ELECTRIKE_30 ("Electrike", 30, Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
	GROVYLE_31 ("Grovyle", 31, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	GROVYLE_32 ("Grovyle", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	HARIYAMA_33 ("Hariyama", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	KIRLIA_34 ("Kirlia", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	KIRLIA_35 ("Kirlia", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	LAIRON_36 ("Lairon", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	LAIRON_37 ("Lairon", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	LINOONE_38 ("Linoone", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	MANECTRIC_39 ("Manectric", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MARSHTOMP_40 ("Marshtomp", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	MARSHTOMP_41 ("Marshtomp", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	MIGHTYENA_42 ("Mightyena", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SILCOON_43 ("Silcoon", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	SKITTY_44 ("Skitty", 44, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	SLAKOTH_45 ("Slakoth", 45, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	SWELLOW_46 ("Swellow", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	VIGOROTH_47 ("Vigoroth", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	WAILMER_48 ("Wailmer", 48, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
	ARON_49 ("Aron", 49, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	ARON_50 ("Aron", 50, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	CARVANHA_51 ("Carvanha", 51, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	ELECTRIKE_52 ("Electrike", 52, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	ELECTRIKE_53 ("Electrike", 53, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	KOFFING_54 ("Koffing", 54, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	GOLDEEN_55 ("Goldeen", 55, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	MAKUHITA_56 ("Makuhita", 56, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MAKUHITA_57 ("Makuhita", 57, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MAKUHITA_58 ("Makuhita", 58, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MUDKIP_59 ("Mudkip", 59, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	MUDKIP_60 ("Mudkip", 60, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	NUMEL_61 ("Numel", 61, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	PHANPY_62 ("Phanpy", 62, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	POOCHYENA_63 ("Poochyena", 63, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	POOCHYENA_64 ("Poochyena", 64, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	POOCHYENA_65 ("Poochyena", 65, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	RALTS_66 ("Ralts", 66, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	RALTS_67 ("Ralts", 67, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	RALTS_68 ("Ralts", 68, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	SHROOMISH_69 ("Shroomish", 69, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	SKITTY_70 ("Skitty", 70, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	SKITTY_71 ("Skitty", 71, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	TAILLOW_72 ("Taillow", 72, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	TORCHIC_73 ("Torchic", 73, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	TORCHIC_74 ("Torchic", 74, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	TREECKO_75 ("Treecko", 75, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	TREECKO_76 ("Treecko", 76, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	WINGULL_77 ("Wingull", 77, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	WURMPLE_78 ("Wurmple", 78, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	ZIGZAGOON_79 ("Zigzagoon", 79, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	ENERGY_REMOVAL_2_80 ("Energy Removal 2", 80, Rarity.UNCOMMON, [TRAINER, ITEM]),
	ENERGY_RESTORE_81 ("Energy Restore", 81, Rarity.UNCOMMON, [TRAINER, ITEM]),
	ENERGY_SWITCH_82 ("Energy Switch", 82, Rarity.UNCOMMON, [TRAINER, ITEM]),
	LADY_OUTING_83 ("Lady Outing", 83, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	LUM_BERRY_84 ("Lum Berry", 84, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	ORAN_BERRY_85 ("Oran Berry", 85, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	POKE_BALL_86 ("Poké Ball", 86, Rarity.UNCOMMON, [TRAINER, ITEM]),
	POKEMON_REVERSAL_87 ("Pokémon Reversal", 87, Rarity.UNCOMMON, [TRAINER, ITEM]),
	POKENAV_88 ("PokéNav", 88, Rarity.UNCOMMON, [TRAINER, ITEM]),
	PROFESSOR_BIRCH_89 ("Professor Birch", 89, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	ENERGY_SEARCH_90 ("Energy Search", 90, Rarity.COMMON, [TRAINER, ITEM]),
	POTION_91 ("Potion", 91, Rarity.COMMON, [TRAINER, ITEM]),
	SWITCH_92 ("Switch", 92, Rarity.COMMON, [TRAINER, ITEM]),
	DARKNESS_ENERGY_93 ("Darkness Energy", 93, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	METAL_ENERGY_94 ("Metal Energy", 94, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	RAINBOW_ENERGY_95 ("Rainbow Energy", 95, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	CHANSEY_EX_96 ("Chansey ex", 96, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _COLORLESS_]),
	ELECTABUZZ_EX_97 ("Electabuzz ex", 97, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _LIGHTNING_]),
	HITMONCHAN_EX_98 ("Hitmonchan ex", 98, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIGHTING_]),
	LAPRAS_EX_99 ("Lapras ex", 99, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _WATER_]),
	MAGMAR_EX_100 ("Magmar ex", 100, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIRE_]),
	MEWTWO_EX_101 ("Mewtwo ex", 101, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _PSYCHIC_]),
	SCYTHER_EX_102 ("Scyther ex", 102, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _GRASS_]),
	SNEASEL_EX_103 ("Sneasel ex", 103, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _DARKNESS_]),
	GRASS_ENERGY_104 ("Grass Energy", 104, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
	FIGHTING_ENERGY_105 ("Fighting Energy", 105, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
	WATER_ENERGY_106 ("Water Energy", 106, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
	PSYCHIC_ENERGY_107 ("Psychic Energy", 107, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
	FIRE_ENERGY_108 ("Fire Energy", 108, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
	LIGHTNING_ENERGY_109 ("Lightning Energy", 109, Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	RubySapphire(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.RUBY_SAPPHIRE;
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
			case AGGRON_1:
			return evolution (this, from:"Lairon", hp:HP110, type:M, retreatCost:4) {
				weakness R
				resistance G, MINUS30
				move "Retaliate", {
					text "10x damage. Flip a coin. If heads, this attack does 10 damage times the number of damage counters on Aggron."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Mega Punch", {
					text "40 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Double Lariat", {
					text "70x damage. Flip 2 coins. This attack does 70 damage times the number of heads."
					energyCost M, M, C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}

			};
			case BEAUTIFLY_2:
			return evolution (this, from:"Silcoon", hp:HP080, type:G, retreatCost:0) {
				weakness R
				pokeBody "Withering Dust", {
					text "As long as Beautifly is in play, do not apply Resistance for all Active Pokémon."
					delayedA {
					}
				}
				move "Stun Spore", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Parallel Gain", {
					text "50 damage. Remove 1 damage counter from each of your Pokémon, including Beautifly."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case BLAZIKEN_3:
			return evolution (this, from:"Combusken", hp:HP100, type:R, retreatCost:2) {
				weakness W
				pokePower "Firestarter", {
					text "Once during your turn (before your attack), you may attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon. This power can't be used if Blaziken is affected by a Special Condition."
					actionA {
					}
				}
				move "Fire Stream", {
					text "50 damage. Discard a [R] Energy card attached to Blaziken. If you do, this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case CAMERUPT_4:
			return evolution (this, from:"Numel", hp:HP090, type:R, retreatCost:3) {
				weakness W
				move "Lava Burn", {
					text "20 damage. Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Fire Spin", {
					text "100 damage. Discard 2 basic Energy cards attached to Camerupt or this attack does nothing."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}

			};
			case DELCATTY_5:
			return evolution (this, from:"Skitty", hp:HP070, type:C, retreatCost:1) {
				weakness F
				pokePower "Energy Draw", {
					text "Once during your turn (before your attack), you may discard 1 Energy card from your hand. Then draw up to 3 cards from your deck. This power can't be used if Delcatty is affected by a Special Condition."
					actionA {
					}
				}
				move "Max Energy Source", {
					text "10x damage. Does 10 damage times the amount of Energy attached to all of your Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case DUSTOX_6:
			return evolution (this, from:"Cascoon", hp:HP090, type:G, retreatCost:0) {
				weakness P
				pokeBody "Protective Dust", {
					text "Prevent all effects of attacks, except damage, done to Dustox by the Attacking Pokémon."
					delayedA {
					}
				}
				move "Toxic", {
					text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
					energyCost G, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Gust", {
					text "50 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case GARDEVOIR_7:
			return evolution (this, from:"Kirlia", hp:HP100, type:P, retreatCost:2) {
				weakness P
				pokePower "Psy Shadow", {
					text "Once during your turn (before your attack), you may search your deck for a [P] Energy card and attach it to 1 of your Pokémon. Put 2 damage counters on that Pokémon. Shuffle your deck afterward. This power can't be used if Gardevoir is affected by a Special Condition."
					actionA {
					}
				}
				move "Energy Burst", {
					text "10x damage. Does 10 damage times the total amount of Energy attached to Gardevoir and the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case HARIYAMA_8:
			return evolution (this, from:"Makuhita", hp:HP090, type:F, retreatCost:2) {
				weakness P
				move "Super Slap Push", {
					text "Does 20 damage to each Defending Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {

					}
				}
				move "Mega Throw", {
					text "40+ damage. If the Defending Pokémon is a Pokémon-ex, this attack does 40 damage plus 40 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MANECTRIC_9:
			return evolution (this, from:"Electrike", hp:HP070, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Attract Current", {
					text "10 damage. Search your deck for a [L] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Thunder Jolt", {
					text "50 damage. Flip a coin. If tails, Manectric does 10 damage to itself."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case MIGHTYENA_10:
			return evolution (this, from:"Poochyena", hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				pokeBody "Intimidating Fang", {
					text "As long as Mightyena is your Active Pokémon, any damage done to your Pokémon done by an opponent's attack is reduced by 10 (before applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Shakedown", {
					text "40 damage. Flip a coin. If heads, choose 1 card from your opponent's hand without looking and discard it."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case SCEPTILE_11:
			return evolution (this, from:"Grovyle", hp:HP120, type:G, retreatCost:3) {
				weakness R
				resistance W, MINUS30
				move "Lizard Poison", {
					text "20 damage. If 1 Energy is attached to Sceptile, the Defending Pokémon is now Asleep. If 2 Energy is attached to Sceptile, the Defending Pokémon is now Poisoned. If 3 Energy is attached to Sceptile, the Defending Pokémon is now Asleep and Poisoned. If 4 or more Energy is attached to Sceptile, the Defending Pokémon is now Asleep, Burned, and Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Solarbeam", {
					text "70 damage. "
					energyCost G, G, C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}

			};
			case SLAKING_12:
			return evolution (this, from:"Vigoroth", hp:HP120, type:C, retreatCost:3) {
				weakness F
				pokeBody "Lazy", {
					text "As long as Slaking is your Active Pokémon, your opponent's Pokémon can't use any Poké-Powers."
					delayedA {
					}
				}
				move "Critical Move", {
					text "100 damage. Discard a basic Energy card attached to Slaking or this attack does nothing. Slaking can't attack during your next turn."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}

			};
			case SWAMPERT_13:
			return evolution (this, from:"Marshtomp", hp:HP110, type:W, retreatCost:3) {
				weakness L
				pokePower "Water Call", {
					text "Once during your turn (before your attack), you may attach a [W] Energy card from your hand to your Active Pokémon. This power can't be used if Swampert is affected by a Special Condition."
					actionA {
					}
				}
				move "Hypno Splash", {
					text "50 damage. The Defending Pokémon is now Asleep."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case WAILORD_14:
			return evolution (this, from:"Wailmer", hp:HP120, type:W, retreatCost:4) {
				weakness L
				move "Take Down", {
					text "50 damage. Wailord does 20 damage to itself."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Surf", {
					text "70 damage. "
					energyCost W, W, W, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}

			};
			case BLAZIKEN_15:
			return evolution (this, from:"Combusken", hp:HP110, type:R, retreatCost:2) {
				weakness W
				move "Clutch", {
					text "20 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Flamethrower", {
					text "80 damage. Discard a [R] Energy card attached to Blaziken."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}

			};
			case BRELOOM_16:
			return evolution (this, from:"Shroomish", hp:HP070, type:G, retreatCost:1) {
				weakness R
				move "Headbutt", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Battle Blast", {
					text "40+ damage. Does 40 damage plus 10 more damage for each [F] Energy attached to Breloom."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case DONPHAN_17:
			return evolution (this, from:"Phanpy", hp:HP080, type:F, retreatCost:1) {
				weakness G
				move "Rend", {
					text "20+ damage. If the Defending Pokémon has any damage counters on it, this attack does 20 damage plus 20 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Double Spin", {
					text "60x damage. Flip 2 coins. This attack does 60 damage times the number of heads."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}

			};
			case NOSEPASS_18:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness W
				move "Invisible Hand", {
					text "If any of your opponent's Active Pokémon are Evolved Pokémon, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Repulsion", {
					text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand. (If your opponent doesn't have any Benched Pokémon or other Active Pokémon, this attack does nothing.)"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case PELIPPER_19:
			return evolution (this, from:"Wingull", hp:HP070, type:W, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Stockpile", {
					text "During your next turn, Spit Up's base damage is 70 instead of 30, and Swallow's base damage is 60 instead of 20."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Spit Up", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Swallow", {
					text "20 damage. After your attack, remove from Pelipper the number of damage counters equal to the damage you did to the Defending Pokémon. If Pelipper has fewer damage counters than that, remove all of them."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case SCEPTILE_20:
			return evolution (this, from:"Grovyle", hp:HP100, type:G, retreatCost:3) {
				weakness R
				resistance W, MINUS30
				pokePower "Energy Trans", {
					text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Sceptile is affected by a Special Condition."
					actionA {
					}
				}
				move "Tail Rap", {
					text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case SEAKING_21:
			return evolution (this, from:"Goldeen", hp:HP070, type:W, retreatCost:0) {
				weakness L
				move "Water Arrow", {
					text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
				move "Fast Stream", {
					text "30 damage. Move 1 Energy card attached to the Defending Pokémon to the other Defending Pokémon. (Ignore this effect if your opponent has only 1 Defending Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case SHARPEDO_22:
			return evolution (this, from:"Carvanha", hp:HP070, type:W, retreatCost:1) {
				weakness L
				pokeBody "Rough Skin", {
					text "If Sharpedo is your Active Pokémon and is damaged by an opponent's attack (even if Sharpedo is Knocked Out), put 2 damage counters on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Dark Slash", {
					text "40+ damage. You may discard a [D] Energy card attached to Sharpedo. If you do, this attack does 40 damage plus 30 more damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case SWAMPERT_23:
			return evolution (this, from:"Marshtomp", hp:HP100, type:W, retreatCost:2) {
				weakness L
				pokeBody "Natural Remedy", {
					text "Once during your turn (before your attack), when you attach a [W] Energy from your hand to Swampert, remove 1 damage counter from Swampert."
					delayedA {
					}
				}
				move "Water Arrow", {
					text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
				move "Waterfall", {
					text "50 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case WEEZING_24:
			return evolution (this, from:"Koffing", hp:HP080, type:G, retreatCost:2) {
				weakness P
				move "Confusion Gas", {
					text "10 damage. The Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Poison Smog", {
					text "Each Defending Pokémon is now Poisoned. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G, C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case ARON_25:
			return basic (this, hp:HP050, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				move "Rollout", {
					text "10 damage. "
					energyCost M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Double Stab", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case CASCOON_26:
			return evolution (this, from:"Wurmple", hp:HP070, type:G, retreatCost:2) {
				weakness R
				pokeBody "Hard Cocoon", {
					text "During your opponent's turn, if Cascoon would be damaged by an opponent's attack (after applying Weakness and Resistance), flip a coin. If heads, reduce that damage by 30."
					delayedA {
					}
				}
				move "Poison Thread", {
					text "The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}

			};
			case COMBUSKEN_27:
			return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
				weakness W
				move "Flare", {
					text "20 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Double Kick", {
					text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case COMBUSKEN_28:
			return evolution (this, from:"Torchic", hp:HP080, type:R, retreatCost:1) {
				weakness W
				pokeBody "Natural Cure", {
					text "When you attach a [R] Energy card from your hand to Combusken, remove all Special Conditions from Combusken."
					delayedA {
					}
				}
				move "Lunge", {
					text "50 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case DELCATTY_29:
			return evolution (this, from:"Skitty", hp:HP080, type:C, retreatCost:1) {
				weakness F
				move "Energy Call", {
					text "10 damage. Attach 1 Energy card from your discard pile to your Active Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Cannonball", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to Delcatty but not used to pay for this attack's Energy cost."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case ELECTRIKE_30:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Charge", {
					text "Attach a [L] Energy from your discard pile to Electrike."
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Electrike does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case GROVYLE_31:
			return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Poison Breath", {
					text "The Defending Pokémon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Swift", {
					text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case GROVYLE_32:
			return evolution (this, from:"Treecko", hp:HP080, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				pokeBody "Natural Cure", {
					text "When you attach a [G] Energy card from your hand to Grovyle, remove all Special Conditions from Grovyle."
					delayedA {
					}
				}
				move "Slash", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case HARIYAMA_33:
			return evolution (this, from:"Makuhita", hp:HP080, type:F, retreatCost:1) {
				weakness P
				move "Shove", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Slap Down", {
					text "40+ damage. Flip 2 coins. This attack does 40 damage plus 10 more damage for each heads."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case KIRLIA_34:
			return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Removal Beam", {
					text "10 damage. Flip a coin. If heads, discard 1 Energy card attached to the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Super Psy", {
					text "50 damage. "
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case KIRLIA_35:
			return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Dazzle Dance", {
					text "Flip a coin. If heads, each Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Life Drain", {
					text "Flip a coin. If heads, put damage counters on the Defending Pokémon until it is 10 HP away from being Knocked Out."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}

			};
			case LAIRON_36:
			return evolution (this, from:"Aron", hp:HP070, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Ram", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Metal Claw", {
					text "40 damage. "
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case LAIRON_37:
			return evolution (this, from:"Aron", hp:HP080, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Magnitude", {
					text "20 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost M
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "One-Two Strike", {
					text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case LINOONE_38:
			return evolution (this, from:"Zigzagoon", hp:HP070, type:C, retreatCost:1) {
				weakness F
				move "Seek Out", {
					text "Search your deck for up to 2 cards and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Continuous Headbutt", {
					text "40x damage. Flip a coin until you get tails. This attack does 40 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MANECTRIC_39:
			return evolution (this, from:"Electrike", hp:HP070, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Thundershock", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Gigashock", {
					text "40 damage. Does 10 damage to 2 of your opponent's Benched Pokémon (1 if there is only 1). (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MARSHTOMP_40:
			return evolution (this, from:"Mudkip", hp:HP070, type:W, retreatCost:1) {
				weakness L
				move "Bubble", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Slash", {
					text "40 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MARSHTOMP_41:
			return evolution (this, from:"Mudkip", hp:HP080, type:W, retreatCost:1) {
				weakness L
				pokeBody "Natural Cure", {
					text "When you attach a [W] Energy from your hand to Marshtomp, remove all Special Conditions from Marshtomp."
					delayedA {
					}
				}
				move "Aqua Sonic", {
					text "20 damage. This attack's damage is not affected by Resistance."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case MIGHTYENA_42:
			return evolution (this, from:"Poochyena", hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Bite", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Ambush", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case SILCOON_43:
			return evolution (this, from:"Wurmple", hp:HP060, type:G, retreatCost:2) {
				weakness R
				pokeBody "Hard Cocoon", {
					text "During your opponent's turn, if Silcoon would be damaged by an opponent's attack (after applying Weakness and Resistance), flip a coin. If heads, reduce that damage by 30."
					delayedA {
					}
				}
				move "Gooey Thread", {
					text "10 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case SKITTY_44:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness F
				move "Minor Errand-Running", {
					text "Search your deck for 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Lullaby", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case SLAKOTH_45:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness F
				move "Claw", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Slack Off", {
					text "Remove all damage counters from Slakoth. Slakoth can't attack during your next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case SWELLOW_46:
			return evolution (this, from:"Taillow", hp:HP070, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				pokePower "Drive Off", {
					text "Once during your turn (before your attack), if Swellow is your Active Pokémon, you may switch 1 of the Defending Pokémon with 1 of your opponent's Benched Pokémon. Your opponent picks the Benched Pokémon to switch. This power can't be used if Swellow is affected by a Special Condition."
					actionA {
					}
				}
				move "Wing Attack", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case VIGOROTH_47:
			return evolution (this, from:"Slakoth", hp:HP070, type:C, retreatCost:1) {
				weakness F
				move "Fury Swipes", {
					text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Rage", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Vigoroth."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case WAILMER_48:
			return basic (this, hp:HP080, type:W, retreatCost:3) {
				weakness L
				move "Rest", {
					text "Remove all Special Conditions and 4 damage counters from Wailmer (all if there are less than 4). Wailmer is now Asleep."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Water Gun", {
					text "20+ damage. This attack does 20 damage plus 10 more damage for each [W] Energy attached to Wailmer but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case ARON_49:
			return basic (this, hp:HP040, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				move "Teary Eyes", {
					text "During your opponent's next turn, any damage done to Aron by attacks is reduced by 10."
					energyCost C
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
			case ARON_50:
			return basic (this, hp:HP050, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case CARVANHA_51:
			return basic (this, hp:HP040, type:W, retreatCost:1) {
				weakness L
				pokeBody "Rough Skin", {
					text "If Carvanha is your Active Pokémon and is damaged by an opponent's attack (even if Carvanha is Knocked Out), put 1 damage counter on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Big Bite", {
					text "10 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case ELECTRIKE_52:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Headbutt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case ELECTRIKE_53:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Super Thunder Wave", {
					text "Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
					energyCost C
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
			case KOFFING_54:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness P
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Double-edge", {
					text "30 damage. Koffing does 10 damage to itself."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case GOLDEEN_55:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Flail", {
					text "10x damage. Does 10 damage for each damage counter on Goldeen."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case MAKUHITA_56:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Slap Push", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Lunge Out", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case MAKUHITA_57:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Fling", {
					text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Low Kick", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case MAKUHITA_58:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Fake Out", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case MUDKIP_59:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
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
			case MUDKIP_60:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Fury Swipes", {
					text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case NUMEL_61:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Headbutt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Burn Off", {
					text "Flip a coin. If heads, each Defending Pokémon is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case PHANPY_62:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness G
				move "Stampede", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Trembler", {
					text "Flip a coin. If heads, this attack does 10 damage to each Defending Pokémon, and each Defending Pokémon is now Paralyzed."
					energyCost F, C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case POOCHYENA_63:
			return basic (this, hp:HP040, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Bite", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case POOCHYENA_64:
			return basic (this, hp:HP050, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Knock Off", {
					text "Flip a coin. If heads, choose 1 card from your opponent's hand without looking and discard it."
					energyCost D
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
			case POOCHYENA_65:
			return basic (this, hp:HP050, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Shadow Bind", {
					text "10 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case RALTS_66:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Confuse Ray", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case RALTS_67:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Headbutt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Hypnoblast", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case RALTS_68:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Link Blast", {
					text "40 damage. If Ralts and the Defending Pokémon have a different amount of Energy attached to them, this attack's base damage is 10 instead of 40."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case SHROOMISH_69:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Sleep Powder", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case SKITTY_70:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness F
				move "Plus Energy", {
					text "Attach a basic Energy card from your hand to 1 of your Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {

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
			case SKITTY_71:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Lunge", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case TAILLOW_72:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
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
				move "Wing Attack", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case TORCHIC_73:
			return basic (this, hp:HP040, type:R, retreatCost:1) {
				weakness W
				move "Peck", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Fireworks", {
					text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Torchic."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case TORCHIC_74:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Singe", {
					text "Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}

			};
			case TREECKO_75:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Poison Breath", {
					text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}

			};
			case TREECKO_76:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Tail Slap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Razor Leaf", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case WINGULL_77:
			return basic (this, hp:HP040, type:W, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Surprise Attack", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case WURMPLE_78:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Signs of Evolution", {
					text "Search your deck for Silcoon and Beautifly, or Cascoon and Dustox cards. Show 1 card or both cards of a pair to your opponent and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Poison Barb", {
					text "The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}

			};
			case ZIGZAGOON_79:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness F
				move "Fury Swipes", {
					text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case ENERGY_REMOVAL_2_80:
			return itemCard (this) {
				text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent's Pokémon and discard it."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_RESTORE_81:
			return itemCard (this) {
				text "Flip 3 coins. For each heads, put a basic Energy card from your discard pile into your hand. If you don't have that many basic Energy cards in your discard pile, put all of them into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_SWITCH_82:
			return itemCard (this) {
				text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case LADY_OUTING_83:
			return supporter (this) {
				text "Search your deck for up to 3 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward." +
					"You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
				onPlay {
				}
				playRequirement{
				}
			};
			case LUM_BERRY_84:
			return pokemonTool (this) {
				text "At any time between turns, if the Pokémon this card is attached to is affected by any Special Conditions, remove all of them. Then discard Lum Berry." +
					"Attach Lum Berry to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case ORAN_BERRY_85:
			return pokemonTool (this) {
				text "At any time between turns, if the Pokémon this card is attached to has at least 2 damage counters on it, remove 2 damage counters from it. Then, discard Oran Berry." +
					"Attach Oran Berry to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case POKE_BALL_86:
			return itemCard (this) {
				text "Flip a coin. If heads, search your deck for a Basic Pokémon or Evolution card, show it to your opponent and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_REVERSAL_87:
			return itemCard (this) {
				text "Flip a coin. If heads, your opponent switches 1 of his or her Active Pokémon with 1 of his or her Benched Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKENAV_88:
			return itemCard (this) {
				text "Look at the top 3 cards of your deck, and choose a Basic Pokémon, Evolution card, or Energy card. Show it to your opponent and put it into your hand. Put the 2 other cards back on top of your deck in any order."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_BIRCH_89:
			return supporter (this) {
				text "Draw cards from your deck until you have 6 cards in your hand." +
					"You can play only 1 Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_SEARCH_90:
			return itemCard (this) {
				text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POTION_91:
			return itemCard (this) {
				text "Remove 2 damage counters from 1 of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWITCH_92:
			return itemCard (this) {
				text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_93:
			return specialEnergy (this, [[C]]) {
				text "If the Pokémon [D] Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect unless the Attacking Pokémon is Darkness or has Dark in its name. [D] Energy provides [D] Energy. (Doesn't count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case METAL_ENERGY_94:
			return specialEnergy (this, [[C]]) {
				text "Damage done by attacks to the Pokémon that [M] Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that [M] Energy is attached to isn't Metal. [M] Energy provides Metal. (Doesn't count as a basic Energy card)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case RAINBOW_ENERGY_95:
			return specialEnergy (this, [[C]]) {
				text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Doesn't count as a basic Energy card when not in play.) When you attach this card from your hand to 1 of your Pokémon, put 1 damage counter on that Pokémon."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case CHANSEY_EX_96:
			return basic (this, hp:HP120, type:C, retreatCost:3) {
				weakness F
				move "Healing Egg", {
					text "Remove 2 damage counters (1 if there is only 1) from each of your Pokémon. Remove no damage counters from Chansey ex."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Double-edge", {
					text "80 damage. Chansey ex does 60 damage to itself."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}

			};
			case ELECTABUZZ_EX_97:
			return basic (this, hp:HP090, type:L, retreatCost:2) {
				weakness F
				resistance M, MINUS30
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Quick Attack", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case HITMONCHAN_EX_98:
			return basic (this, hp:HP090, type:F, retreatCost:2) {
				weakness P
				move "Steady Punch", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Sky Uppercut", {
					text "50 damage. The attack's damage is not affected by Resistance."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case LAPRAS_EX_99:
			return basic (this, hp:HP110, type:W, retreatCost:3) {
				weakness L
				move "Energy Ball", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Lapras ex but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Confuse Ray", {
					text "30 damage. The Defending Pokémon is now Confused"
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case MAGMAR_EX_100:
			return basic (this, hp:HP090, type:R, retreatCost:2) {
				weakness W
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Super Singe", {
					text "40 damage. The Defending Pokémon is now Burned."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MEWTWO_EX_101:
			return basic (this, hp:HP100, type:P, retreatCost:3) {
				weakness P
				move "Energy Absorption", {
					text "Attach up to 2 Energy cards from your discard pile to Mewtwo ex."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Psyburn", {
					text "60 damage. "
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}

			};
			case SCYTHER_EX_102:
			return basic (this, hp:HP080, type:G, retreatCost:1) {
				weakness R
				resistance F, MINUS30
				move "Agility", {
					text "10 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Scyther ex during your opponent's next turn."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Slash", {
					text "50 damage. "
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case SNEASEL_EX_103:
			return basic (this, hp:HP080, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Double Scratch", {
					text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Beat Up", {
					text "20x damage. Flip a coin for each of your Pokémon in play (including Sneasel ex). This attack does 20 damage times the number of heads."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case GRASS_ENERGY_104:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case FIGHTING_ENERGY_105:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case WATER_ENERGY_106:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case PSYCHIC_ENERGY_107:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case FIRE_ENERGY_108:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case LIGHTNING_ENERGY_109:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
				default:
			return null;
		}
	}

}