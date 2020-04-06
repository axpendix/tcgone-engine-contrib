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
 * @author lithogenn@gmail.com
 */
public enum PowerKeepers implements LogicCardInfo {

	AGGRON_1 ("Aggron", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
	ALTARIA_2 ("Altaria", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	ARMALDO_3 ("Armaldo", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	BANETTE_4 ("Banette", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	BLAZIKEN_5 ("Blaziken", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	CHARIZARD_6 ("Charizard", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	CRADILY_7 ("Cradily", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	DELCATTY_8 ("Delcatty", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	GARDEVOIR_9 ("Gardevoir", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
	KABUTOPS_10 ("Kabutops", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	MACHAMP_11 ("Machamp", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	RAICHU_12 ("Raichu", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	SLAKING_13 ("Slaking", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
	DUSCLOPS_14 ("Dusclops", 14, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	LANTURN_15 ("Lanturn", 15, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MAGNETON_16 ("Magneton", 16, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	MAWILE_17 ("Mawile", 17, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
	MIGHTYENA_18 ("Mightyena", 18, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	NINETALES_19 ("Ninetales", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	OMASTAR_20 ("Omastar", 20, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
	PICHU_21 ("Pichu", 21, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
	SABLEYE_22 ("Sableye", 22, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
	SEVIPER_23 ("Seviper", 23, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
	WOBBUFFET_24 ("Wobbuffet", 24, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
	ZANGOOSE_25 ("Zangoose", 25, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
	ANORITH_26 ("Anorith", 26, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	CACTURNE_27 ("Cacturne", 27, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	CHARMELEON_28 ("Charmeleon", 28, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	COMBUSKEN_29 ("Combusken", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	GLALIE_30 ("Glalie", 30, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	KIRLIA_31 ("Kirlia", 31, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	LAIRON_32 ("Lairon", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	MACHOKE_33 ("Machoke", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	MEDICHAM_34 ("Medicham", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	METANG_35 ("Metang", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	NUZLEAF_36 ("Nuzleaf", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SEALEO_37 ("Sealeo", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SHARPEDO_38 ("Sharpedo", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SHELGON_39 ("Shelgon", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	VIBRAVA_40 ("Vibrava", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	VIGOROTH_41 ("Vigoroth", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	ARON_42 ("Aron", 42, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	BAGON_43 ("Bagon", 43, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	BALTOY_44 ("Baltoy", 44, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	BELDUM_45 ("Beldum", 45, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	CACNEA_46 ("Cacnea", 46, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	CARVANHA_47 ("Carvanha", 47, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	CHARMANDER_48 ("Charmander", 48, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	CHINCHOU_49 ("Chinchou", 49, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	DUSKULL_50 ("Duskull", 50, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	KABUTO_51 ("Kabuto", 51, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	LILEEP_52 ("Lileep", 52, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	MACHOP_53 ("Machop", 53, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MAGNEMITE_54 ("Magnemite", 54, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	MEDITITE_55 ("Meditite", 55, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	OMANYTE_56 ("Omanyte", 56, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	PIKACHU_57 ("Pikachu", 57, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	POOCHYENA_58 ("Poochyena", 58, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	RALTS_59 ("Ralts", 59, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	SEEDOT_60 ("Seedot", 60, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	SHUPPET_61 ("Shuppet", 61, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	SKITTY_62 ("Skitty", 62, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	SLAKOTH_63 ("Slakoth", 63, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	SNORUNT_64 ("Snorunt", 64, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	SPHEAL_65 ("Spheal", 65, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	SWABLU_66 ("Swablu", 66, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	TORCHIC_67 ("Torchic", 67, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	TRAPINCH_68 ("Trapinch", 68, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	VULPIX_69 ("Vulpix", 69, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	WYNAUT_70 ("Wynaut", 70, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	BATTLE_FRONTIER_71 ("Battle Frontier", 71, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	DRAKE_S_STADIUM_72 ("Drake's Stadium", 72, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	ENERGY_RECYCLE_SYSTEM_73 ("Energy Recycle System", 73, Rarity.UNCOMMON, [TRAINER, ITEM]),
	ENERGY_REMOVAL_2_74 ("Energy Removal 2", 74, Rarity.UNCOMMON, [TRAINER, ITEM]),
	ENERGY_SWITCH_75 ("Energy Switch", 75, Rarity.UNCOMMON, [TRAINER, ITEM]),
	GLACIA_S_STADIUM_76 ("Glacia's Stadium", 76, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	GREAT_BALL_77 ("Great Ball", 77, Rarity.UNCOMMON, [TRAINER, ITEM]),
	MASTER_BALL_78 ("Master Ball", 78, Rarity.UNCOMMON, [TRAINER, ITEM]),
	PHOEBE_S_STADIUM_79 ("Phoebe's Stadium", 79, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	PROFESSOR_BIRCH_80 ("Professor Birch", 80, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	SCOTT_81 ("Scott", 81, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	SIDNEY_S_STADIUM_82 ("Sidney's Stadium", 82, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	STEVEN_S_ADVICE_83 ("Steven's Advice", 83, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	CLAW_FOSSIL_84 ("Claw Fossil", 84, Rarity.COMMON, [TRAINER, ITEM]),
	MYSTERIOUS_FOSSIL_85 ("Mysterious Fossil", 85, Rarity.COMMON, [TRAINER, ITEM]),
	ROOT_FOSSIL_86 ("Root Fossil", 86, Rarity.COMMON, [TRAINER, ITEM]),
	DARKNESS_ENERGY_87 ("Darkness Energy", 87, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	METAL_ENERGY_88 ("Metal Energy", 88, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	MULTI_ENERGY_89 ("Multi Energy", 89, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	CYCLONE_ENERGY_90 ("Cyclone Energy", 90, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
	WARP_ENERGY_91 ("Warp Energy", 91, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
	ABSOL_EX_92 ("Absol ex", 92, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _DARKNESS_]),
	CLAYDOL_EX_93 ("Claydol ex", 93, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _PSYCHIC_]),
	FLYGON_EX_94 ("Flygon ex", 94, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
	METAGROSS_EX_95 ("Metagross ex", 95, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
	SALAMENCE_EX_96 ("Salamence ex", 96, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
	SHIFTRY_EX_97 ("Shiftry ex", 97, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _DARKNESS_]),
	SKARMORY_EX_98 ("Skarmory ex", 98, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _METAL_]),
	WALREIN_EX_99 ("Walrein ex", 99, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
	FLAREON_STAR_100 ("Flareon Star", 100, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	JOLTEON_STAR_101 ("Jolteon Star", 101, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	VAPOREON_STAR_102 ("Vaporeon Star", 102, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	GRASS_ENERGY_103 ("Grass Energy", 103, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
	FIRE_ENERGY_104 ("Fire Energy", 104, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
	WATER_ENERGY_105 ("Water Energy", 105, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
	LIGHTNING_ENERGY_106 ("Lightning Energy", 106, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
	PSYCHIC_ENERGY_107 ("Psychic Energy", 107, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
	FIGHTING_ENERGY_108 ("Fighting Energy", 108, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	PowerKeepers(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.POWER_KEEPERS;
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
				pokePower "Terraforming", {
					text "Once during your turn (before your attack), you may look at the top 5 cards from your deck and put them back on top of your deck in any order. This power can't be used if Aggron is affected by a Special Condition."
					actionA {
					}
				}
				move "Metal Claw", {
					text "50 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Mix-Up", {
					text "70 damage. Your opponent discards the top card of his or her deck."
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case ALTARIA_2:
			return evolution (this, from:"Swablu", hp:HP080, type:C, retreatCost:1) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				pokeBody "Synergy Effect", {
					text "If Drake's Stadium is in play, remove 1 damage counter from Altaria between turns."
					delayedA {
					}
				}
				move "Surprise", {
					text "30 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Gust", {
					text "50 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case ARMALDO_3:
			return evolution (this, from:"Anorith", hp:HP120, type:F, retreatCost:3) {
				weakness G
				move "Rock Blast", {
					text "Discard up to 5 [F] Energy cards attached to Armaldo. For each Energy card you discarded, choose an opponent's Pokémon in play and this attack does 20 damage to those Pokémon. (You may choose the same Pokémon more than once.) This attack's damage isn't affected by Weakness or Resistance."
					energyCost F
					attackRequirement {}
					onAttack {

					}
				}
				move "Mach Claw", {
					text "60 damage. This attack's damage isn't affected by Resistance."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case BANETTE_4:
			return evolution (this, from:"Shuppet", hp:HP070, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS30
				move "Grudge", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Prize card your opponent has taken."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Bench Manipulation", {
					text "40x damage. Your opponent flips a number of coins equal to the number of his or her Benched Pokémon. This attack does 40 damage times the number of tails. This attack's damage isn't affected by Weakness or Resistance."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case BLAZIKEN_5:
			return evolution (this, from:"Combusken", hp:HP100, type:R, retreatCost:2) {
				weakness W
				pokePower "Firestarter", {
					text "Once during your turn (before your attack), you may attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon. This power can't be used if Blaziken is affected by a Special Condition."
					actionA {
					}
				}
				move "Fire Stream", {
					text "50 damage. Discard a [R] Energy card attached to Blaziken. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case CHARIZARD_6:
			return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:2) {
				weakness W
				move "Combustion", {
					text "30 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Bursting Inferno", {
					text "50 damage. Each Defending Pokémon is now Burned."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case CRADILY_7:
			return evolution (this, from:"Lileep", hp:HP110, type:G, retreatCost:2) {
				weakness R
				pokePower "Evolutionary Call", {
					text "Once during your turn, when you play Cradily from your hand to evolve 1 of your Pokémon, you may search your deck for up to 3 in any combination of Basic Pokémon or Evolution cards. Show them to your opponent and put them into your hand. Shuffle your deck afterward."
					actionA {
					}
				}
				move "Poison Ring", {
					text "50 damage. The Defending Pokémon is now Poisoned. The Defending Pokémon can't retreat during your opponent's next turn."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case DELCATTY_8:
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
			case GARDEVOIR_9:
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
			case KABUTOPS_10:
			return evolution (this, from:"Kabuto", hp:HP110, type:F, retreatCost:2) {
				weakness G
				pokeBody "Primal Stare", {
					text "As long as Kabutops is your Active Pokémon, your opponent can't play any Basic Pokémon or Evolution cards from his or her hand to evolve his or her Active Pokémon."
					delayedA {
					}
				}
				move "Luring Antenna", {
					text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Blinding Scythe", {
					text "60 damage. "
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case MACHAMP_11:
			return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
				weakness P
				pokeBody "Overzealous", {
					text "If your opponent has any Pokémon-ex in play, each of Machamp's attacks does 30 more damage to the Defending Pokémon."
					delayedA {
					}
				}
				move "Brick Smash", {
					text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Cross Chop", {
					text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 30 more damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case RAICHU_12:
			return evolution (this, from:"Pikachu", hp:HP070, type:L, retreatCost:1) {
				weakness F
				move "Plasma", {
					text "10 damage. Search your discard pile for a [L] Energy card and attach it to Raichu."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Thunderbolt", {
					text "100 damage. Discard all Energy cards attached to Raichu."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
			};
			case SLAKING_13:
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
			case DUSCLOPS_14:
			return evolution (this, from:"Duskull", hp:HP080, type:P, retreatCost:2) {
				weakness D
				resistance F, MINUS30
				move "Dark Mind", {
					text "20 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Mysterious Light", {
					text "50 damage. If Phoebe's Stadium is in play, the Defending Pokémon is now Confused."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case LANTURN_15:
			return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
				weakness F
				pokePower "Energy Grounding", {
					text "Once during your opponent's turn, when any of your Pokémon is Knocked Out by your opponent's attacks, you may use this power. Choose a basic Energy card discarded from the Knocked Out Pokémon and attach it to Lanturn. You can't use more than 1 Energy Grounding Poké-Power each turn."
					actionA {
					}
				}
				move "Lightning Strike", {
					text "50 damage. You may discard all [L] Energy attached to Lanturn. If you do, this attack's base damage is 90 instead of 50."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case MAGNETON_16:
			return evolution (this, from:"Magnemite", hp:HP070, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				pokePower "Magnetic Field", {
					text "Once during your turn (before your attack), if you have basic Energy cards in your discard pile, you may discard any 1 card from your hand. Then search for up to 2 basic Energy cards from your discard pile, show them to your opponent, and put them into your hand. You can't return the card you first discarded to your hand in this way. This power can't be used if Magneton is affected by a Special Condition."
					actionA {
					}
				}
				move "Magnetic Force", {
					text "10x damage. Does 10 damage times the amount of Energy attached to all of your Pokémon (including Magneton)."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case MAWILE_17:
			return basic (this, hp:HP060, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Pull Away", {
					text "20 damage. If your opponent has 5 or more cards in his or her hand, your opponent discards a number of cards until your opponent has 4 cards left in his or her hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case MIGHTYENA_18:
			return evolution (this, from:"Poochyena", hp:HP070, type:D, retreatCost:0) {
				weakness F
				resistance P, MINUS30
				move "Plunder", {
					text "30 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Dark Burst", {
					text "50+ damage. If Sidney's Stadium is in play, this attack does 50 damage plus 20 more damage."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case NINETALES_19:
			return evolution (this, from:"Vulpix", hp:HP070, type:R, retreatCost:1) {
				weakness W
				pokeBody "Safeguard", {
					text "Prevent all effects of attacks, including damage, done to Ninetales by your opponent's Pokémon-ex."
					delayedA {
            before null, self, Source.ATTACK, {
              if (self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                bc "Safeguard prevents effect"
                prevent()
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.notNoEffect && it.from.EX ) {
                  it.dmg = hp(0)
                  bc "Safeguard prevents damage"
					}
				}
            }
          }
				}
				move "Quick Attack", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Will-o'-the-wisp", {
					text "50 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case OMASTAR_20:
			return evolution (this, from:"Omanyte", hp:HP110, type:W, retreatCost:2) {
				weakness L
				move "Pull Down", {
					text "If your opponent has any Evolved Pokémon in play, remove the highest Stage Evolution card from each of them and put those cards back into his or her hand."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Hydrocannon", {
					text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Omastar but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case PICHU_21:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				pokePower "Baby Evolution", {
					text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
					actionA {
					}
				}
				move "Cry for Help", {
					text "Search your deck for a [L] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SABLEYE_22:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				resistance C, MINUS30
				pokeBody "Synergy Effect", {
					text "If Phoebe's Stadium is in play, prevent all damage done to Sableye by attacks from your opponent's Pokémon-ex."
					delayedA {
					}
				}
				move "Down Draw", {
					text "Draw 2 cards from the bottom of your deck."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Feint Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SEVIPER_23:
			return basic (this, hp:HP070, type:G, retreatCost:1) {
				weakness P
				move "Sharp Fang", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Toxic", {
					text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
					energyCost G, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case WOBBUFFET_24:
			return basic (this, hp:HP080, type:P, retreatCost:2) {
				weakness P
				pokeBody "Safeguard", {
					text "Prevent all effects of attacks, including damage, done to Wobbuffet by your opponent's Pokémon-ex."
					delayedA {
					}
				}
				move "Flip Over", {
					text "50 damage. Wobbuffet does 10 damage to itself, and don't apply Weakness and Resistance to this damage."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case ZANGOOSE_25:
			return basic (this, hp:HP070, type:C, retreatCost:1) {
				weakness F
				pokeBody "Thick Skin", {
					text "Zangoose can't be affected by any Special Conditions."
					delayedA {
					}
				}
				move "Call for Family", {
					text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Sharp Claws", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case ANORITH_26:
			return evolution (this, from:"Claw Fossil", hp:HP070, type:F, retreatCost:1) {
				weakness G
				pokeBody "Solid Shell", {
					text "Any damage done to Anorith by attacks is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Fury Cutter", {
					text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 30 more damage. If all of them are heads, this attack does 10 damage plus 50 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case CACTURNE_27:
			return evolution (this, from:"Cacnea", hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				pokePower "Poison Structure", {
					text "Once during your turn (before your attack), if Sidney's Stadium is in play, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. This power can't be used if Cacturne is affected by a Special Condition."
					actionA {
					}
				}
				move "Pin Missile", {
					text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case CHARMELEON_28:
			return evolution (this, from:"Charmander", hp:HP070, type:R, retreatCost:1) {
				weakness W
				move "Scary Face", {
					text "Flip a coin. If heads, the Defending Pokémon can't attack or retreat during your opponent's next turn."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Flame Tail", {
					text "50 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case COMBUSKEN_29:
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
			case GLALIE_30:
			return evolution (this, from:"Snorunt", hp:HP080, type:W, retreatCost:1) {
				weakness M
				pokeBody "Synergy Effect", {
					text "If Glacia's Stadium is in play, any damage done to Glalie by attacks from your opponent's Pokémon is reduced by 30 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Powder Snow", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Double-edge", {
					text "60 damage. Glalie does 10 damage to itself."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case KIRLIA_31:
			return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Dream Eater", {
					text "50 damage. If the Defending Pokémon is not Asleep, this attack does nothing."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case LAIRON_32:
			return evolution (this, from:"Aron", hp:HP070, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Granite Head", {
					text "20 damage. During your opponent's next turn, any damage done to Lairon by attacks is reduced by 10 (after applying Weakness and Resistance)."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Stomp", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case MACHOKE_33:
			return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
				weakness P
				move "Steady Punch", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Mega Kick", {
					text "50 damage. "
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case MEDICHAM_34:
			return evolution (this, from:"Meditite", hp:HP080, type:F, retreatCost:1) {
				weakness P
				pokeBody "Vigorous Aura", {
					text "As long as Medicham is your Active Pokémon, attacks by each player's Active Pokémon do 10 more damage to any Active Pokémon (before applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Punch", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Rolling Kick", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case METANG_35:
			return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				pokeBody "Clear Body", {
					text "Metang can't be affected by any Special Conditions."
					delayedA {
					}
				}
				move "Extra Comet Punch", {
					text "30+ damage. During your next turn, Extra Comet Punch does 30 damage plus 30 more damage."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case NUZLEAF_36:
			return evolution (this, from:"Seedot", hp:HP070, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Fake Out", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Gentle Slap", {
					text "40 damage. "
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case SEALEO_37:
			return evolution (this, from:"Spheal", hp:HP070, type:W, retreatCost:1) {
				weakness L
				move "Ice Beam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SHARPEDO_38:
			return evolution (this, from:"Carvanha", hp:HP070, type:D, retreatCost:0) {
				weakness G
				resistance P, MINUS30
				move "Tight Jaw", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Darkness Charge", {
					text "50 damage. Put 1 damage counter on Sharpedo."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case SHELGON_39:
			return evolution (this, from:"Bagon", hp:HP080, type:C, retreatCost:2) {
				weakness C
				resistance R, MINUS30
				resistance F, MINUS30
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Shelgon."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Rolling Tackle", {
					text "40 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case VIBRAVA_40:
			return evolution (this, from:"Trapinch", hp:HP080, type:C, retreatCost:1) {
				weakness C
				resistance L, MINUS30
				resistance F, MINUS30
				move "Ram", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Dragonbreath", {
					text "60 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, L, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case VIGOROTH_41:
			return evolution (this, from:"Slakoth", hp:HP070, type:C, retreatCost:1) {
				weakness F
				pokeBody "Strikes Back", {
					text "If Vigoroth is your Active Pokémon and is damaged by an opponent's attack (even if Vigoroth is Knocked Out), put 1 damage counter on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Ambush", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case ARON_42:
			return basic (this, hp:HP050, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Dig Deep", {
					text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case BAGON_43:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness C
				resistance R, MINUS30
				resistance F, MINUS30
				move "Retaliate", {
					text "10x damage. Does 10 damage times the number of damage counters on Bagon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case BALTOY_44:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Psybeam", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P
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
			case BELDUM_45:
			return basic (this, hp:HP050, type:M, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Magnetic Lines", {
					text "10 damage. Flip a coin. If heads, move a basic Energy card from the Defending Pokémon to another of your opponent's Pokémon. (Ignore this effect if your opponent has only 1 Pokémon.)"
					energyCost M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case CACNEA_46:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Feint Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case CARVANHA_47:
			return basic (this, hp:HP040, type:D, retreatCost:1) {
				weakness G
				resistance P, MINUS30
				pokeBody "Rough Skin", {
					text "If Carvanha is your Active Pokémon and is damaged by an opponent's attack (even if Carvanha is Knocked Out), put 1 damage counter on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Gnaw", {
					text "20 damage. "
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case CHARMANDER_48:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case CHINCHOU_49:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				move "Positive Ion", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Negative Ion", {
					text "10 damage. During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 10 (before applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DUSKULL_50:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS30
				move "Surprise Attack", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case KABUTO_51:
			return evolution (this, from:"Mysterious Fossil", hp:HP060, type:F, retreatCost:2) {
				weakness G
				move "Fast Evolution", {
					text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Double Scratch", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case LILEEP_52:
			return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
				weakness R
				move "Surprise", {
					text "20 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Acid", {
					text "40 damage. The Defending Pokémon can't retreat during your opponent's next turn."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case MACHOP_53:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Smash Punch", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Submission", {
					text "30 damage. Machop does 10 damage to itself."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case MAGNEMITE_54:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Ram", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Spark", {
					text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case MEDITITE_55:
			return basic (this, hp:HP040, type:F, retreatCost:1) {
				weakness P
				move "Psyshock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Cross Chop", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case OMANYTE_56:
			return evolution (this, from:"Mysterious Fossil", hp:HP070, type:W, retreatCost:1) {
				weakness L
				move "Influence", {
					text "Search your deck for Omanyte, Kabuto, Aerodactyl, Lileep, or Anorith and put up to 2 of them onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
				move "Mud Shot", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case PIKACHU_57:
			return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				move "Charge", {
					text "Search your discard pile for a [L] Energy card and attach it to Pikachu."
					energyCost L
					attackRequirement {}
					onAttack {

					}
				}
				move "Slam", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case POOCHYENA_58:
			return basic (this, hp:HP050, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Double Kick", {
					text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case RALTS_59:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Slap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Teleportation Burst", {
					text "20 damage. Switch Ralts with 1 of your Benched Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SEEDOT_60:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "Nap", {
					text "Remove 2 damage counters from Seedot."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Double Spin", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SHUPPET_61:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS30
				move "Bad Dream", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case SKITTY_62:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				move "Tail Whip", {
					text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
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
			case SLAKOTH_63:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness F
				move "Amnesia", {
					text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
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
			case SNORUNT_64:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness M
				move "Pebble Throw", {
					text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Double Headbutt", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SPHEAL_65:
			return basic (this, hp:HP040, type:W, retreatCost:1) {
				weakness L
				move "Defense Curl", {
					text "Flip a coin. If heads, prevent all damage done to Spheal during your opponent's next turn."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Aurora Beam", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SWABLU_66:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
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
			case TORCHIC_67:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Super Singe", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case TRAPINCH_68:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness G
				move "Surprise Attack", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case VULPIX_69:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Confuse Ray", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Ember", {
					text "30 damage. Discard a [R] Energy attached to Vulpix."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case WYNAUT_70:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				pokePower "Baby Evolution", {
					text "Once during your turn (before your attack), you may put Wobbuffet from your hand onto Wynaut (this counts as evolving Wynaut) and remove all damage counters from Wynaut."
					actionA {
					}
				}
				move "Flail", {
					text "10x damage. Does 10 damage times the number of damage counters on Wynaut."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case BATTLE_FRONTIER_71:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player's [C] Evolved Pokémon, Darkness Evolved Pokémon, and Metal Evolved Pokémon can't use any Poké-Powers or Poké-Bodies."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case DRAKE_S_STADIUM_72:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Any damage done to [C] Active Pokémon (both yours and your opponent's) by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case ENERGY_RECYCLE_SYSTEM_73:
			return itemCard (this) {
				text "Search your discard pile for basic Energy cards. You may either show 1 basic Energy card to your opponent and put it into your hand, or show 3 basic Energy cards to your opponent and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_REMOVAL_2_74:
			return itemCard (this) {
				text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent's Pokémon and discard it."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_SWITCH_75:
			return itemCard (this) {
				text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case GLACIA_S_STADIUM_76:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player's [W] Pokémon (excluding Pokémon-ex) has no Weakness."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case GREAT_BALL_77:
			return itemCard (this) {
				text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and put it onto your Bench. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case MASTER_BALL_78:
			return itemCard (this) {
				text "Look at the top 7 cards from your deck. Choose a Basic Pokémon or Evolution card from those cards, show it to your opponent, and put it into your hand. Put the other 6 cards back on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case PHOEBE_S_STADIUM_79:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player pays [C] [C] less to retreat his or her [P] Pokémon."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case PROFESSOR_BIRCH_80:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Draw cards from your deck until you have 6 cards in your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case SCOTT_81:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Search your deck for up to 3 cards in any combination of Supporter cards and Stadium cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case SIDNEY_S_STADIUM_82:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player's [D] Pokémon can't be Asleep, Confused, or Paralyzed."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case STEVEN_S_ADVICE_83:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Draw a number of cards up to the number of your opponent's Pokémon in play. If you have 7 or more cards (including this one) in your hand, you can't play this card."
				onPlay {
				}
				playRequirement{
				}
			};
			case CLAW_FOSSIL_84:
			return itemCard (this) {
				text "Play Claw Fossil as if it were a Basic Pokémon. While in play, Claw Fossil counts as a [C] Pokémon (as well as a Trainer card). Claw Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Claw Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Claw Fossil from play." +
					"If Claw Fossil is your Active Pokémon and is damaged by an opponent's attack (even if Claw Fossil is Knocked Out), put 1 damage counter on the Attacking Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case MYSTERIOUS_FOSSIL_85:
			return itemCard (this) {
				text "Play Mysterious Fossil as if it were a Basic Pokémon. While in play, Mysterious Fossil counts as a [C] Pokémon (as well as a Trainer card). Mysterious Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Mysterious Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Mysterious Fossil from play."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROOT_FOSSIL_86:
			return itemCard (this) {
				text "Play Root Fossil as if it were a Basic Pokémon. While in play, Root Fossil counts as a [C] Pokémon (as well as a Trainer card). Root Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Root Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Root Fossil from play." +
					"At any time between turns, remove 1 damage counter from Root Fossil."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_87:
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
			case METAL_ENERGY_88:
			return specialEnergy (this, [[C]]) {
				text "Damage done by attacks to the Pokémon that [M] Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that [M] Energy is attached to isn't Metal. [M] Energy provides [M] Energy. (Doesn't count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case MULTI_ENERGY_89:
			return specialEnergy (this, [[C]]) {
				text "Attach Multi Energy to 1 of your Pokémon. While in play, Multi Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) Multi Energy provides [C] Energy when attached to a Pokémon that already has Special Energy cards attached to it."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case CYCLONE_ENERGY_90:
			return specialEnergy (this, [[C]]) {
				text "Cyclone Energy provides [C] Energy. When you attach this card from your hand to your Active Pokémon, switch 1 of the Defending Pokémon with 1 of your opponent's Benched Pokémon. Your opponent chooses the Benched Pokémon to switch."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case WARP_ENERGY_91:
			return specialEnergy (this, [[C]]) {
				text "Warp Energy provides [C] Energy. When you attach this card from your hand to your Active Pokémon, switch that Pokémon with 1 of your Benched Pokémon."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case ABSOL_EX_92:
			return basic (this, hp:HP100, type:D, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				pokePower "Cursed Eyes", {
					text "Once during your turn, when you put Absol ex from your hand onto your Bench, you may move 3 damage counters from 1 of your opponent's Pokémon to another of his or her Pokémon."
					actionA {
					}
				}
				move "Psychic Pulse", {
					text "30 damage. Does 10 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case CLAYDOL_EX_93:
			return evolution (this, from:"Baltoy", hp:HP120, type:P, retreatCost:2) {
				weakness P
				pokePower "Type Shift", {
					text "Once during your turn (before your attack), you may use this power. Claydol ex's type is Fighting until the end of your turn."
					actionA {
					}
				}
				move "Psychic Boom", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Shadow Crush", {
					text "60 damage. You may discard a [P] Energy card attached to Claydol ex. If you do, discard an Energy card attached to the Defending Pokémon."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case FLYGON_EX_94:
			return evolution (this, from:"Vibrava", hp:HP150, type:C, retreatCost:0) {
				weakness C
				resistance L, MINUS30
				resistance F, MINUS30
				pokeBody "Psychic Protector", {
					text "If Flygon ex is damaged by an opponent's attack, you may discard up to 4 cards from your hand. If you do, any damage done to Flygon ex is reduced by 10 for each card you discarded."
					delayedA {
					}
				}
				move "Slashing Strike", {
					text "70 damage. Flip a coin. If tails, Flygon ex can't use Slashing Strike during your next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case METAGROSS_EX_95:
			return evolution (this, from:"Metang", hp:HP150, type:M, retreatCost:4) {
				weakness R
				resistance G, MINUS30
				pokePower "Magnetic Redraw", {
					text "Once during your turn (before your attack), if Metagross ex is your Active Pokémon, you may use this power. Each player shuffles his or her hand into his or her deck. Then, each player draws 4 cards. This power can't be used if Metagross ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Scanblast", {
					text "70 damage. Does 70 damage to each of your opponent's Benched Pokémon that has the same name as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case SALAMENCE_EX_96:
			return evolution (this, from:"Shelgon", hp:HP160, type:C, retreatCost:2) {
				weakness C
				resistance R, MINUS30
				resistance F, MINUS30
				move "Volcanic Flame", {
					text "150 damage. Discard the top 5 cards from your deck."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 150
					}
				}
				move "Hydro Wave", {
					text "Discard all [W] Energy attached to Salamence ex. This attack does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SHIFTRY_EX_97:
			return evolution (this, from:"Nuzleaf", hp:HP140, type:D, retreatCost:1) {
				weakness G
				resistance P, MINUS30
				move "Skill Hack", {
					text "Look at your opponent's hand and choose a Basic Pokémon or Evolution card you find there. Choose 1 of that Pokémon's attacks. Skill Hack copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Shiftry ex's type is still Darkness.) Shiftry ex performs that attack."
					energyCost D
					attackRequirement {}
					onAttack {

					}
				}
				move "Dirge", {
					text "60 damage. Does 60 damage to each of your opponent's Benched Pokémon that has the same name as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case SKARMORY_EX_98:
			return basic (this, hp:HP100, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				pokeBody "Metal Gravity", {
					text "If your opponent's Active Pokémon retreats and has 40 or more remaining HP, put 3 damage counters on that Pokémon. You can't use more than 1 Metal Gravity Poké-Body each turn."
					delayedA {
					}
				}
				move "Whirlwind", {
					text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Razor Wing", {
					text "60 damage. "
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case WALREIN_EX_99:
			return evolution (this, from:"Sealeo", hp:HP150, type:W, retreatCost:3) {
				weakness L
				pokePower "Chilling Breath", {
					text "Once during your turn, when you play Walrein ex from your hand to evolve 1 of your Pokémon, you may use this power. Your opponent can't play any Trainer cards from his or her hand during your opponent's next turn."
					actionA {
					}
				}
				move "Wreck", {
					text "70+ damage. If there is any Stadium card in play, this attack does 70 damage plus 20 more damage. Discard that Stadium card."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case FLAREON_STAR_100:
			return basic (this, hp:HP070, type:R, retreatCost:1) {
				weakness W
				pokePower "Crimson Ray", {
					text "Once during your turn, when you put Flareon Star from your hand onto your Bench, you may use this power. Each Active Pokémon (both yours and your opponent's) is now Burned."
					actionA {
					}
				}
				move "Flamethrower", {
					text "50 damage. Discard a [R] Energy attached to Flareon Star."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case JOLTEON_STAR_101:
			return basic (this, hp:HP070, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				pokePower "Yellow Ray", {
					text "Once during your turn, when you put Jolteon Star from your hand onto your Bench, you may put 1 damage counter on each Active Pokémon (both yours and your opponent's)."
					actionA {
					}
				}
				move "Agility", {
					text "40 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Jolteon Star during your opponent's next turn."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case VAPOREON_STAR_102:
			return basic (this, hp:HP070, type:W, retreatCost:1) {
				weakness L
				pokePower "Blue Ray", {
					text "Once during your turn, when you put Vaporeon Star from your hand onto your Bench, you may remove all Special Conditions and 3 damage counters from each Active Pokémon (both yours and your opponent's)."
					actionA {
					}
				}
				move "Whirlpool", {
					text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case GRASS_ENERGY_103:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case FIRE_ENERGY_104:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case WATER_ENERGY_105:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case LIGHTNING_ENERGY_106:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case PSYCHIC_ENERGY_107:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			case FIGHTING_ENERGY_108:
			return basic (this, hp:null, type:null, retreatCost:null) {

			};
			default:
			return null;
		}
	}

}