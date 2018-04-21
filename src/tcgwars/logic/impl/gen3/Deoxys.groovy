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
public enum Deoxys implements CardInfo {
	
	ALTARIA_1 ("Altaria", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	BEAUTIFLY_2 ("Beautifly", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	BRELOOM_3 ("Breloom", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	CAMERUPT_4 ("Camerupt", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	CLAYDOL_5 ("Claydol", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	CRAWDAUNT_6 ("Crawdaunt", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	DUSCLOPS_7 ("Dusclops", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	GYARADOS_8 ("Gyarados", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	JIRACHI_9 ("Jirachi", 9, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
	LUDICOLO_10 ("Ludicolo", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	METAGROSS_11 ("Metagross", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	MIGHTYENA_12 ("Mightyena", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	NINJASK_13 ("Ninjask", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	SHEDINJA_14 ("Shedinja", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	SLAKING_15 ("Slaking", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	DEOXYS_16 ("Deoxys", 16, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	DEOXYS_17 ("Deoxys", 17, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	DEOXYS_18 ("Deoxys", 18, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	LUDICOLO_19 ("Ludicolo", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	MAGCARGO_20 ("Magcargo", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	PELIPPER_21 ("Pelipper", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	RAYQUAZA_22 ("Rayquaza", 22, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	SABLEYE_23 ("Sableye", 23, Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
	SEAKING_24 ("Seaking", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	SHIFTRY_25 ("Shiftry", 25, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	SKARMORY_26 ("Skarmory", 26, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
	TROPIUS_27 ("Tropius", 27, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	WHISCASH_28 ("Whiscash", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	XATU_29 ("Xatu", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DONPHAN_30 ("Donphan", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	GOLBAT_31 ("Golbat", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	GRUMPIG_32 ("Grumpig", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	LOMBRE_33 ("Lombre", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	LOMBRE_34 ("Lombre", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	LOTAD_35 ("Lotad", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	LUNATONE_36 ("Lunatone", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	MAGCARGO_37 ("Magcargo", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	MANECTRIC_38 ("Manectric", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MASQUERAIN_39 ("Masquerain", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	METANG_40 ("Metang", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	MINUN_41 ("Minun", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	NOSEPASS_42 ("Nosepass", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	NUZLEAF_43 ("Nuzleaf", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PLUSLE_44 ("Plusle", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	SHELGON_45 ("Shelgon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	SILCOON_46 ("Silcoon", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	SOLROCK_47 ("Solrock", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	STARMIE_48 ("Starmie", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	SWELLOW_49 ("Swellow", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	VIGOROTH_50 ("Vigoroth", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	WEEZING_51 ("Weezing", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BAGON_52 ("Bagon", 52, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	BALTOY_53 ("Baltoy", 53, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	BARBOACH_54 ("Barboach", 54, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BELDUM_55 ("Beldum", 55, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	CARVANHA_56 ("Carvanha", 56, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	CORPHISH_57 ("Corphish", 57, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	DUSKULL_58 ("Duskull", 58, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	ELECTRIKE_59 ("Electrike", 59, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	ELECTRIKE_60 ("Electrike", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	GOLDEEN_61 ("Goldeen", 61, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	KOFFING_62 ("Koffing", 62, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	LOTAD_63 ("Lotad", 63, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAGIKARP_64 ("Magikarp", 64, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAKUHITA_65 ("Makuhita", 65, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	NATU_66 ("Natu", 66, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	NINCADA_67 ("Nincada", 67, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	NUMEL_68 ("Numel", 68, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	PHANPY_69 ("Phanpy", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	POOCHYENA_70 ("Poochyena", 70, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	SEEDOT_71 ("Seedot", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SHROOMISH_72 ("Shroomish", 72, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SLAKOTH_73 ("Slakoth", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SLUGMA_74 ("Slugma", 74, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	SLUGMA_75 ("Slugma", 75, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	SPOINK_76 ("Spoink", 76, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	STARYU_77 ("Staryu", 77, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SURSKIT_78 ("Surskit", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SWABLU_79 ("Swablu", 79, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	TAILLOW_80 ("Taillow", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	WINGULL_81 ("Wingull", 81, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	WURMPLE_82 ("Wurmple", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	ZUBAT_83 ("Zubat", 83, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BALLOON_BERRY_84 ("Balloon Berry", 84, Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
	CRYSTAL_SHARD_85 ("Crystal Shard", 85, Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
	ENERGY_CHARGE_86 ("Energy Charge", 86, Rarity.UNCOMMON, [TRAINER]),
	LADY_OUTING_87 ("Lady Outing", 87, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	MASTER_BALL_88 ("Master Ball", 88, Rarity.UNCOMMON, [TRAINER]),
	METEOR_FALLS_89 ("Meteor Falls", 89, Rarity.UNCOMMON, [STADIUM, TRAINER]),
	PROFESSOR_COZMO_S_DISCOVERY_90 ("Professor Cozmo's Discovery", 90, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
	SPACE_CENTER_91 ("Space Center", 91, Rarity.UNCOMMON, [STADIUM, TRAINER]),
	STRENGTH_CHARM_92 ("Strength Charm", 92, Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
	BOOST_ENERGY_93 ("Boost Energy", 93, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	HEAL_ENERGY_94 ("Heal Energy", 94, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	SCRAMBLE_ENERGY_95 ("Scramble Energy", 95, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	CROBAT_EX_96 ("Crobat ex", 96, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_, EX]),
	DEOXYS_EX_97 ("Deoxys ex", 97, Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
	DEOXYS_EX_98 ("Deoxys ex", 98, Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
	DEOXYS_EX_99 ("Deoxys ex", 99, Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
	HARIYAMA_EX_100 ("Hariyama ex", 100, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_, EX]),
	MANECTRIC_EX_101 ("Manectric ex", 101, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_, EX]),
	RAYQUAZA_EX_102 ("Rayquaza ex", 102, Rarity.ULTRARARE, [BASIC, POKEMON, _COLORLESS_, EX]),
	SALAMENCE_EX_103 ("Salamence ex", 103, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_, EX]),
	SHARPEDO_EX_104 ("Sharpedo ex", 104, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_, EX]),
	LATIAS_STAR_105 ("Latias Star", 105, Rarity.SECRET, [BASIC, POKEMON, _COLORLESS_]),
	LATIOS_STAR_106 ("Latios Star", 106, Rarity.SECRET, [BASIC, POKEMON, _COLORLESS_]),
	RAYQUAZA_STAR_107 ("Rayquaza Star", 107, Rarity.SECRET, [BASIC, POKEMON, _COLORLESS_]),
	ROCKET_S_RAIKOU_EX_108 ("Rocket's Raikou ex", 108, Rarity.ULTRARARE, [BASIC, POKEMON, _DARKNESS_, EX]);
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	Deoxys(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.DEOXYS;
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
			case ALTARIA_1:
			return evolution (this, from:"Swablu", hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Safeguard", {
					text "Prevent all effects of attacks, including damage, done to Altaria by your opponent’s Pokémon-ex."
					delayedA {
					}
				}
				move "Double Wing Attack", {
					text "Does 20 Damage to each Defending Pokémon."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dive", {
					text "50 damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEAUTIFLY_2:
			return evolution (this, from:"Silcoon", hp:HP100, type:GRASS, retreatCost:1) {
				weakness FIRE
				pokeBody "Hunch", {
					text "As long as Beautifly’s remaining HP is 40 or less, Beautifly does 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Luring Antenna", {
					text "20 damage. Before doing damage, you may choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cutting Wind", {
					text "50 damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRELOOM_3:
			return evolution (this, from:"Shroomish", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Leaf Poison", {
					text "20 damage. If Breloom has any [G] Energy attached to it, the Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hustle Punch", {
					text "70- damage. During your next turn, Hustle Punch attack’s base damage is 50 instead of 70."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CAMERUPT_4:
			return evolution (this, from:"Numel", hp:HP090, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Back Burner", {
					text "Search your discard pile for up to 2 basic Energy cards and attach them to your Pokémon in any way you like."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Split Bomb", {
					text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLAYDOL_5:
			return evolution (this, from:"Baltoy", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness WATER
				pokePower "Psychic Trance", {
					text "Once during your turn (before you attack), if Claydol is your Active Pokémon, you may shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand. This power can’t be used if Claydol is affected by a Special Condition."
					actionA {
					}
				}
				move "Ancient Mantra", {
					text "20+ damage. If Claydol has any [P] Energy attached to it, the Defending Pokémon is now Confused. If Claydol has any [F] Energy attached to it, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CRAWDAUNT_6:
			return evolution (this, from:"Corphish", hp:HP070, type:DARKNESS, retreatCost:1) {
				weakness GRASS
				resistance PSYCHIC, MINUS30
				pokeBody "Dark Protection", {
					text "Any damage done to Crawdaunt by your opponent’s attacks is reduced by 10 for each [D] Energy attached to Crawdaunt (after applying Weakness and Resistance). You can’t reduce more than 20 damage in this way."
					delayedA {
					}
				}
				move "Bubblebeam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cross-Cut", {
					text "40+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 40 damage plus 20 more damage."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUSCLOPS_7:
			return evolution (this, from:"Duskull", hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				move "Psychic Removal", {
					text "20 damage. Flip 2 coins. If both of them are heads, discard all Energy attached to the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Powerful Hand", {
					text "Count the number of cards in your hand. Put that many damage counters on the Defending Pokémon. You can’t put more than 7 damage counters in this way."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GYARADOS_8:
			return evolution (this, from:"Magikarp", hp:HP090, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Dragon Spark", {
					text "This attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Full Retaliation", {
					text "20× damage. Does 20 damage times the number of damage counters on all of your Magikarp."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pulverize", {
					text "50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 50 more damage."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIRACHI_9:
			return basic (this, hp:HP060, type:METAL, retreatCost:1) {
				weakness FIRE
				resistance GRASS, MINUS30
				pokePower "Wishing Star", {
					text "Once during your turn (before your attack), if Jirachi is your Active Pokémon, you may look at the top 5 cards of your deck, choose one of them, and put it into your hand. Shuffle your deck afterward. Jirachi and your other Active Pokémon, if any, are now Asleep. This power can’t be used if Jirachi is affected by a Special Condition."
					actionA {
					}
				}
				move "Metallic Blow", {
					text "20+ damage. If the Defending Pokémon has any Poké-Bodies, this attack does 20 damage plus 30 more damage."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUDICOLO_10:
			return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				pokePower "Swing Dance", {
					text "Once during your turn (before your attack), you may draw a card. This power can’t be used if Ludicolo is affected by a Special Condition."
					actionA {
					}
				}
				move "Healing Steps", {
					text "30 damage. You may discard as many cards as you like from your hand. If you do, remove that many damage counters from Ludicolo."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Circular Steps", {
					text "10× damage. Does 10× damage times the number of Pokémon in play (both yours and your opponent’s), excluding Ludicolo."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case METAGROSS_11:
			return evolution (this, from:"Metang", hp:HP100, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				pokePower "Super Connectivity", {
					text "Once during your turn (before you attack), you may search your discard pile for a [P] or [M] Energy card and attach it to your Active Pokémon. Then, put 1 damage counter on that Pokémon. This power can’t be used if Metagross is affected by a Special Condition."
					actionA {
					}
				}
				move "Link Blast", {
					text "70 damage. If Metagross and the Defending Pokémon have a different amount of Energy attached to them, this attack’s base damage is 40 instead of 70."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MIGHTYENA_12:
			return evolution (this, from:"Poochyena", hp:HP070, type:DARKNESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Seek Out", {
					text "Search your deck for 1 card and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pull Away", {
					text "30 damage. If your opponent has 5 or more cards in his or her hand, your opponent discards a number of cards until your opponent has 4 cards left in his or her hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NINJASK_13:
			return evolution (this, from:"Nincada", hp:HP070, type:GRASS, retreatCost:0) {
				weakness LIGHTNING
				pokeBody "Fast Protection", {
					text "Prevent all effects, including damage, done to Ninjask by your opponent’s attacks from his or her Basic Pokémon."
					delayedA {
					}
				}
				move "Swords Dance", {
					text "During your next turn, Ninjask’s Slash attack’s base damage is 80."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "30 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHEDINJA_14:
			return evolution (this, from:"Nincada", hp:HP050, type:PSYCHIC, retreatCost:0) {
				pokeBody "Empty Shell", {
					text "When Shedinja is Knocked Out, your opponent doesn’t take any Prize cards."
					delayedA {
					}
				}
				move "Extra Curse", {
					text "Put 2 damage counters on the Defending Pokémon. If the Defending Pokémon is Pokémon-ex, put 4 damage counters instead."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLAKING_15:
			return evolution (this, from:"Vigoroth", hp:HP120, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				pokeBody "Lazy Aura", {
					text "As long as Slaking is your Active Pokémon, any damage done by attacks from your opponent’s Pokémon-ex is reduced by 30 (before applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Amnesia", {
					text "20 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lazy Headbutt", {
					text "70 damage. Slaking is now Asleep."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_16:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Link Blast", {
					text "40 damage. If Deoxys and the Defending Pokémon have a different amount of Energy attached to them, this attack’s base damage is 20 instead of 40."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_17:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Energy Crush", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to all of your opponent’s Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_18:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Barrier Attack", {
					text "20 damage. During your opponent’s next turn, any damage done to Deoxys by attacks is reduced by 30 (after applying Weakness and Resistance)."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUDICOLO_19:
			return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				pokePower "Happy Dance", {
					text "Once during your turn (before your attack), you may remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Happy Dance Poké-Power each turn. This power can’t be used if Ludicolo is affected by a Special Condition."
					actionA {
					}
				}
				move "Water Punch", {
					text "40+ damage. Flip a coin for each [W] Energy attached to Ludicolo. This attack does 40 damage plus 20 more damage for each heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGCARGO_20:
			return evolution (this, from:"Slugma", hp:HP080, type:FIRE, retreatCost:3) {
				weakness WATER
				pokePower "Smooth Over", {
					text "Once during your turn (before your attack), you may search your deck for a card. Shuffle your deck, then put that card on top of your deck. This power can’t be used if Magcargo is affected by a Special Condition."
					actionA {
					}
				}
				move "Knock Over", {
					text "10 damage. You may discard any Stadium card in play."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "50 damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PELIPPER_21:
			return evolution (this, from:"Wingull", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Bay Dance", {
					text "10 damage. During your next turn, if any of your current Active Pokémon does damage to any Defending Pokémon, the attack does 30 more damage (before applying Weakness and Resistance)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Sonic", {
					text "50 damage. This attack’s damage is not affected by Resistance."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_22:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness COLORLESS
				pokeBody "Dragon Aura", {
					text "As long as Rayquaza has any basic [R] Energy cards and any basic [L] Energy cards attached to it, prevent all effects, except damage, by an opponent’s attack done to Rayquaza."
					delayedA {
					}
				}
				move "Tumbling Attack", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SABLEYE_23:
			return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
				resistance COLORLESS, MINUS30
				pokePower "Night Vision", {
					text "Once during your turn (before you attack), if Sableye is your Active Pokémon, you may look at your opponent’s hand. This power can’t be used if Sableye is affected by a Special Condition."
					actionA {
					}
				}
				move "Slash", {
					text "10 damage"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Limitation", {
					text "Your opponent can’t play any Supporter Cards from his or hand during your opponent’s next turn."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEAKING_24:
			return evolution (this, from:"Goldeen", hp:HP070, type:WATER, retreatCost:0) {
				weakness LIGHTNING
				move "Triple Breach", {
					text "Choose 3 od your opponent’s Pokémon. This attack does 10 damage to each of those Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rend", {
					text "30+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 30 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHIFTRY_25:
			return evolution (this, from:"Nuzleaf", hp:HP110, type:GRASS, retreatCost:1) {
				weakness FIRE
				pokePower "Fan Action", {
					text "Once during your turn (before your attack), you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. You opponent chooses the Benched Pokémon to switch. This power can’t be used if Shiftry is affected by a Special Condition."
					actionA {
					}
				}
				move "Stadium Power", {
					text "50+ damage. If there is any Stadium card in play, this attack does 50 damage plus 20 more damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKARMORY_26:
			return basic (this, hp:HP070, type:METAL, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Metallic Lift", {
					text "If Skarmory has any [M] Energy attached to it, the Retreat Cost for Skarmory is 0."
					delayedA {
					}
				}
				move "Spearhead", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Metal", {
					text "10+ damage. Flip a coin for each [M] Energy attached to Skarmory. This attack does 10 damage plus 20 more damage for each heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPIUS_27:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness FIRE
				pokeBody "Tropical Motion", {
					text "As long as Tropius is your Active Pokémon, your opponent’s Active Pokémon have no Resistance."
					delayedA {
					}
				}
				move "Miracle Blow", {
					text "Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stomp", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WHISCASH_28:
			return evolution (this, from:"Barboach", hp:HP090, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				move "Raging Tremble", {
					text "Flip a coin. If heads, this attack does 10 damage for each damage counter on Whiscash to each Defending Pokémon. If tails, this attack does 10 damage for each damage counter on Whiscash to the Defending Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dwindling Wave", {
					text "70- damage. Does 70 damage minus 10 damage for each damage counter on Whiscash."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case XATU_29:
			return evolution (this, from:"Natu", hp:HP070, type:PSYCHIC, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Mirror Coat", {
					text "If Xatu is Burned or Poisoned by an opponent’s attack (even if Xatu is Knocked Out), the Attacking Pokémon is now affected by the same Special Conditions (1 if there is only 1)."
					delayedA {
					}
				}
				move "Dazzle Dance", {
					text "Each Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psyloop", {
					text "30+ damage. Does 30 damage plus 30 more damage for each Trainer card your opponent has in play."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DONPHAN_30:
			return evolution (this, from:"Phanpy", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Spinning Horn", {
					text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rock Hurl", {
					text "50 damage. This attack’s damage is not affected by Resistance."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLBAT_31:
			return evolution (this, from:"Zubat", hp:HP070, type:GRASS, retreatCost:0) {
				weakness PSYCHIC
				pokeBody "Self-control", {
					text "Golbat can’t be Paralyzed."
					delayedA {
					}
				}
				move "Spiral Drain", {
					text "20 damage. Remove 1 damage counter from Golbat."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRUMPIG_32:
			return evolution (this, from:"Spoink", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Carefree", {
					text "Grumpig can’t be Confused."
					delayedA {
					}
				}
				move "Hypnoblast", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Extra Ball", {
					text "50+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 50 damage plus 30 more damage."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOMBRE_33:
			return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Aqua Lift", {
					text "If Lombre has any [W] Energy attached to it, the Retreat Cost for Lombre is 0."
					delayedA {
					}
				}
				move "Ambush", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOMBRE_34:
			return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Natural Cure", {
					text "When you attach a [W] Energy card from your hand to Lombre, remove all Special Conditions from Lombre."
					delayedA {
					}
				}
				move "Blot", {
					text "20 damage. Remove 2 damage counters from Lombre."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOTAD_35:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Surprise", {
					text "10 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his her deck."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUNATONE_36:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness WATER
				pokeBody "Moonglow", {
					text "The Retreat Cost for each Solrock you have in play is 0."
					delayedA {
					}
				}
				move "Foresight", {
					text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Target Beam", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Solrock you have in play."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGCARGO_37:
			return evolution (this, from:"Slugma", hp:HP080, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Headbutt", {
					text "20 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Burning Ball", {
					text "50 damage. If Magcargo has at least 2 [R] Energy attached to it, the Defending Pokémon is now Burned."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANECTRIC_38:
			return evolution (this, from:"Electrike", hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS30
				move "Thunder Spear", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnetic Tackle", {
					text "40+ damage. You may do 40 damage plus 10 more damage for each [L] Energy attached to Manetric. If you do, Manetric does 10 damage to itself."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MASQUERAIN_39:
			return evolution (this, from:"Surskit", hp:HP060, type:GRASS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Intimidating Pattern", {
					text "As long as Masquerain is your Active Pokémon, any damage done by an opponent’s attack is reduced by 20 (before applying Weakness and Resistance). You can’t use more than 1 Intimidating Pattern Poké-Body each turn."
					delayedA {
					}
				}
				move "Stun Spore", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case METANG_40:
			return evolution (this, from:"Beldum", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				move "Psychic Boom", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Blow", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MINUN_41:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Sniff Out", {
					text "Put any 1 card from your discard pile into your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Negative Spark", {
					text "Does 20 damage to each of your opponent’s Pokémon that has any Poké-Bodies. Don’t apply Weakness and Resistance."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NOSEPASS_42:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness WATER
				pokePower "Magnetic Reversal", {
					text "Once during your turn (before your attack), if Nosepass is your Active Pokémon, you may flip a coin. If heads, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. This power can’t be used if Nosepass is affected by a Special Condition."
					actionA {
					}
				}
				move "Sharpen", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NUZLEAF_43:
			return evolution (this, from:"Seedot", hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Eerie Light", {
					text "The Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "One-Two Strike", {
					text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PLUSLE_44:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Call for Family", {
					text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Positive Spark", {
					text "Does 20 damage to each of your opponent’s Pokémon that has any Poké-Powers. Don’t apply Weakness and Resistance."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELGON_45:
			return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness COLORLESS
				resistance FIGHTING
				pokeBody "Hard Protection", {
					text "Prevent all damage done to Shelgon by attacks from your Pokémon."
					delayedA {
					}
				}
				move "Rock Smash", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
					energyCost R, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SILCOON_46:
			return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Ram", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Advanced Armor", {
					text "During your opponent’s next turn, prevent all effects of attacks, including damage, done to Silcoon by your opponent’s Evolved Pokémon."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SOLROCK_47:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
				weakness GRASS
				pokeBody "Sunbeam", {
					text "The maximum HP for each Lunatone you have in play is now 80."
					delayedA {
					}
				}
				move "Scorching Light", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Burned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Reflected Beam", {
					text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon for each Lunatone you have in play. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARMIE_48:
			return evolution (this, from:"Staryu", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Core Guard", {
					text "As long as Starmie has any [P] Energy attached to it, damage done to Starmie by attacks is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Energy Flip", {
					text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) You may move an ENergy attached to that Pokémon to another of your opponent’s Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psychic Boom", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWELLOW_49:
			return evolution (this, from:"Taillow", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Mid-air Crush", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Flip a coin. If heads, your opponent discards 1 Energy card, if any, attached to that Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Nosedive", {
					text "40 damage. Flip a coin. If tails, Swallow does 10 damage to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VIGOROTH_50:
			return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				pokeBody "Vigorous Aura", {
					text "As long as Vigoroth is your Active Pokémon, attacks by each player’s Active Pokémon (both if there are 2) do 10 more damage to any Active Pokémon (before applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Scratch", {
					text "30 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEZING_51:
			return evolution (this, from:"Koffing", hp:HP070, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Liability", {
					text "Put damage counters on the Defending Pokémon until it is 10 HP away from being Knocked Out. Weezing does 70 damage to itself."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smogscreen", {
					text "20 damage. The Defending Pokémon is now Poisoned. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAGON_52:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness COLORLESS
				resistance FIGHTING
				move "Singe", {
					text "Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Doubleslap", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BALTOY_53:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness WATER
				move "Spinning Attack", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Selfdestruct", {
					text "40 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent’s). (Don’t apply weakness and Resistance for Benched Pokémon.) Baltoy does 50 damage to itself."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BARBOACH_54:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Amnesia", {
					text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tackle", {
					text "10 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BELDUM_55:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Flip Over", {
					text "30 damage. Beldum does 10 damage to itself, and don’t apply Weakness and Resistance to this damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARVANHA_56:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness GRASS
				resistance PSYCHIC, MINUS30
				move "Sharp Fin", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Carvanha."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CORPHISH_57:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Exoskeleton", {
					text "Any damage done to Corphish by attacks is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Double Chop", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUSKULL_58:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness DARKNESS
				resistance FIGHTING, MINUS30
				move "Paralyzing Gaze", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Will-o’-the-wisp", {
					text "20 damage."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRIKE_59:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS30
				move "High Voltage", {
					text "Flip a coin. If heads, your opponent can’t play Trainer cards from his or her hand during his or her next turn."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gnaw", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRIKE_60:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Recharge", {
					text "Search your deck for a [L] Energy card and attach it to Electrike. Shuffle your deck afterward."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLDEEN_61:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Waterfall", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING_62:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Smog", {
					text "The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOTAD_63:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Rain Splash", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Wave", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP_64:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Leap Out", {
					text "Switch Magikarp with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Magikarp."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAKUHITA_65:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Thrust", {
					text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, discard 1 Energy card attached to the Defending Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rising Lunge", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NATU_66:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Mirror Coar", {
					text "If Natu if Burned or Poisoned by an opponent’s attack (even if Natu is Knocked Out), the Attacking Pokémon is now affected by the same Special Conditions (1 if there is only 1)."
					delayedA {
					}
				}
				move "Razor Wind", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NINCADA_67:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Dig Under", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scratch", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NUMEL_68:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness WATER
				pokeBody "Dense", {
					text "Any damage done to Numel by attacks from Evolved Pokémon (both yours and your opponent’s) is reduced by 20 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Ram", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PHANPY_69:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Corkscrew Punch", {
					text "10 damage"
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Spin", {
					text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POOCHYENA_70:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Surprise", {
					text "Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sharp Fang", {
					text "20 damage."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEEDOT_71:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHROOMISH_72:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				resistance WATER, MINUS30
				move "Stun Spore", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Trip Over", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLAKOTH_73:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Yawn", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flail", {
					text "10× damage. Does 10 damage times the number of damage counters on Slakoth."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLUGMA_74:
			return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "10 damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLUGMA_75:
			return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Magma Ring", {
					text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flare", {
					text "20 damage."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPOINK_76:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Hypnotic Gaze", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flop", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARYU_77:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Rapid Spin", {
					text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You may switch Staryu with 1 of your Benched Pokémon, if any."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SURSKIT_78:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Agility", {
					text "10 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Surskit during your opponent’s next turn."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWABLU_79:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Fluff", {
					text "Whenever Swablu would be damaged or affected by an opponent’s attack and already has at least 1 damage counter on it, flip a coin. If heads, prevent all effects of that attack, including damage, done to Swablu."
					delayedA {
					}
				}
				move "Peck", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TAILLOW_80:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Fly", {
					text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Taillow during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WINGULL_81:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WURMPLE_82:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Ascension", {
					text "Search your deck for a card that evolves from Wurmple and put it on Wurmple. (This counts as evolving Wurmple.) Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Miracle Essence", {
					text "Flip a coin. If heads, choose 1 Special Condition. Each Defending Pokémon is now affected by that Special Condition."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZUBAT_83:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Self-control", {
					text "Zubat can’t be Paralyzed."
					delayedA {
					}
				}
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BALLOON_BERRY_84:
			return pokemonTool (this) {
				text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAs long as Balloon Berry is attached to a Pokémon, that Pokémon’s Retreat Cost is 0. When this Pokémon retreats, discard Balloon Berry."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case CRYSTAL_SHARD_85:
			return pokemonTool (this) {
				text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAs long as this card is attached to a Pokémon, that Pokémon’s type is [C]. If that Pokémon attacks, discard this card at the end of the turn."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case ENERGY_CHARGE_86:
			return basicTrainer (this) {
				text "Flip a coin. If heads, search your discard pile for 2 Energy cards (1 if there is only 1), show them to your opponent, and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case LADY_OUTING_87:
			return supporter (this) {
				text "Search your deck for up to 3 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward.\nYou may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
			case MASTER_BALL_88:
			return basicTrainer (this) {
				text "Look at the top 7 cards from your deck. Choose a Basic Pokémon or Evolution card from those cards, show it to your opponent, and put it into your hand. Put the other 6 cards back on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case METEOR_FALLS_89:
			return stadium (this) {
				text "Each player’s Active Evolved Pokémon (excluding Pokémon-ex) can use any attack from its Basic Pokémon or its Stage 1 Evolution card. (You still have to pay for that attack’s Energy cost.)\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case PROFESSOR_COZMO_S_DISCOVERY_90:
			return supporter (this) {
				text "Flip a coin. If heads, draw the bottom 3 cards of your deck. If tails, draw the top 2 cards of your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
			case SPACE_CENTER_91:
			return stadium (this) {
				text "Ignore Poké-Bodies for all Basic Pokémon in play (both yours and your opponent’s) (excluding Pokémon-ex and Pokémon that has an owner in its name).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case STRENGTH_CHARM_92:
			return pokemonTool (this) {
				text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nWhenever an attack from the Pokémon that Strength Charm is attached to does damage to the Active Pokémon, the attack does 10 more damage (before applying Weakness and Resistance). Discard Strength Charm at the end of the turn in which this Pokémon attacks."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case BOOST_ENERGY_93:
			return specialEnergy (this, [[C]]) {
				text "Boost Energy can be attached only to an Evolved Pokémon. Discard Boost Energy at the end of the turn it was attached. Boost Energy provides [C][C][C] Energy. The Pokémon Boost Energy is attached to can’t retreat. If the Pokémon Boost Energy is attached to isn’t an Evolved Pokémon, discard Boost Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case HEAL_ENERGY_94:
			return specialEnergy (this, [[C]]) {
				text "Heal Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove 1 damage counter and all Special Conditions from that Pokémon. If heal Energy is attached to Pokémon-ex, Heal Energy has no effect other than providing Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case SCRAMBLE_ENERGY_95:
			return specialEnergy (this, [[C]]) {
				text "Scramble Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). Scramble Energy provides [C] Energy. While in play, if you have more prizes left than your opponent, Scramble Energy provides every type of Energy but provides only 3 in any combination at a time. If the Pokémon Scramble Energy is attached to isn’t an Evolved Pokémon (or evolves into Pokémon-ex), discard Scramble Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case CROBAT_EX_96:
			return evolution (this, from:"Golbat", hp:HP130, type:GRASS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokePower "Distortion", {
					text "Once during your turn (before you attack), if Crobat ex is your active pokemon, you may put 1 damage counter on 1 of your opponent’s Pokémon. This power can’t be used if Crobat ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Cross Attack", {
					text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads. If you get 2 or more heads, the Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pester", {
					text "60+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 60 damage plus 40 more damage."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_EX_97:
			return basic (this, hp:HP100, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Energy Burst", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Deoxys ex and the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_EX_98:
			return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Psyburst", {
					text "50+ damage. You may discard 2 Energy attached to Deoxys ex. If you do, this attack does 50 damage plus 20 more damage for each Energy attached to the Defending Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_EX_99:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				pokePower "Form Change", {
					text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Psychic Shield", {
					text "50 damage. Prevent all effects of attacks, including damage, done to Deoxys ex by your opponent’s Pokémon-ex during your opponent’s next turn."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HARIYAMA_EX_100:
			return evolution (this, from:"Makuhita", hp:HP110, type:FIGHTING, retreatCost:2) {
				weakness PSYCHIC
				pokeBody "Commanding Aura", {
					text "As long as Hariyama ex is your Active Pokémon, your opponent can’t play any Stadium cards from his or her hand."
					delayedA {
					}
				}
				move "Knock Off", {
					text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pivot Throw", {
					text "80 damage. During your opponent’s next turn, any damage done to Hariyama ex by attacks is increased by 10 (before applying Weakness and Resistance)."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANECTRIC_EX_101:
			return evolution (this, from:"Electrike", hp:HP100, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				resistance METAL, MINUS30
				move "Disconnect", {
					text "40 damage. Your opponent can’t play any Trainer cards (except for Supporter cards) from his or her hand during your opponent’s next turn."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Shot", {
					text "Discard all [L] Energy attached to Manetric ex and then choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_EX_102:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
				weakness COLORLESS
				resistance FIGHTING
				pokePower "Dragon Boost", {
					text "Once during your turn, when you put Rayquaza ex from your hand onto your Bench, yuo may move any number of basic Energy cards attached to your Pokémon to Rayquaza ex."
					actionA {
					}
				}
				move "Spiral Blast", {
					text "20× damage. Does 20 damage for each basic Energy card attached to Rayquaza ex."
					energyCost R, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SALAMENCE_EX_103:
			return evolution (this, from:"Shelgon", hp:HP160, type:COLORLESS, retreatCost:2) {
				weakness COLORLESS
				resistance FIGHTING
				pokeBody "Dragon Lift", {
					text "The Retreat Cost for each of your Pokémon (excluding Pokémon-ex and Baby Pokémon) is 0."
					delayedA {
					}
				}
				move "Flame Jet", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bright Flame", {
					text "120 damage. Discard 2 Energy attached to Salamence ex."
					energyCost R, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHARPEDO_EX_104:
			return evolution (this, from:"Carvanha", hp:HP100, type:DARKNESS, retreatCost:0) {
				weakness GRASS
				resistance PSYCHIC, MINUS30
				move "Drag Off", {
					text "20 damage. Before doing damage, you may switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Darkness Blast", {
					text "60+ damage. You may discard a [D] Energy attached to Sharpedo ex. If you do, this attack does 60 damage plus 20 more damage and discard 1 Energy card attached to the Defending Pokémon."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIAS_STAR_105:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness COLORLESS
				resistance FIGHTING
				move "Healing Light", {
					text "10 damage. Remove 1 damage counter from each of your Pokémon (including Latias Star)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shooting Star", {
					text "50+ damage. If the Defending Pokémon is Pokémon-ex, discard all Energy cards attached to Latias Star and this attack does 50 damage plus 100 more damage."
					energyCost R, W, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIOS_STAR_106:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:null) {
				weakness COLORLESS
				resistance FIGHTING
				move "Miraculous Light", {
					text "10 damage. Remove 1 damage counter and all special Conditions from Latios Star."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shining Star", {
					text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, discard all Energy cards attached to Latios Star and this attack does 50 damage plus 100 more damage."
					energyCost G, L, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_STAR_107:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness COLORLESS
				resistance FIGHTING
				move "Spiral Rush", {
					text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
					energyCost R, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Holy Star", {
					text "Discard all Energy cards attached to Rayquaza Star. This attack does 100 damage to each of your opponent’s Pokémon-ex. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, R, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROCKET_S_RAIKOU_EX_108:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
				weakness FIGHTING
				pokePower "Lightning Burst", {
					text "Whenever you attach a [D] Energy card from your hand to Rocket’s Raikou ex, you may choose 1 of the Defending Pokémon and switch it with 1 of your opponent’s Benched Pokémon. Your opponent chooses the Benched Pokémon to switch. This power can’t be used if Rocket’s Raikou ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Thunderous Blow", {
					text "40+ damage. Does 40 damage plus 10 more damage for each [L] Energy attached to Rocket’s Raikou ex."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
				default:
			return null;
		}
	}
	
}