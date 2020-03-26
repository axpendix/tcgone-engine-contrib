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
public enum DeltaSpecies implements LogicCardInfo {

	BEEDRILL_Δ_1 ("Beedrill δ", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_, _METAL_]),
	CROBAT_Δ_2 ("Crobat δ", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_, _METAL_]),
	DRAGONITE_Δ_3 ("Dragonite δ", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_, _METAL_]),
	ESPEON_Δ_4 ("Espeon δ", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_, _METAL_]),
	FLAREON_Δ_5 ("Flareon δ", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_, _METAL_]),
	GARDEVOIR_Δ_6 ("Gardevoir δ", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_, _METAL_]),
	JOLTEON_Δ_7 ("Jolteon δ", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_, _METAL_]),
	LATIAS_Δ_8 ("Latias δ", 8, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_, _METAL_]),
	LATIOS_Δ_9 ("Latios δ", 9, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_, _METAL_]),
	MAROWAK_Δ_10 ("Marowak δ", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_, _METAL_]),
	METAGROSS_Δ_11 ("Metagross δ", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_, _METAL_]),
	MEWTWO_Δ_12 ("Mewtwo δ", 12, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_, _METAL_]),
	RAYQUAZA_Δ_13 ("Rayquaza δ", 13, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_, _METAL_]),
	SALAMENCE_Δ_14 ("Salamence δ", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_, _METAL_]),
	STARMIE_Δ_15 ("Starmie δ", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _METAL_]),
	TYRANITAR_Δ_16 ("Tyranitar δ", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_, _METAL_]),
	UMBREON_Δ_17 ("Umbreon δ", 17, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_, _METAL_]),
	VAPOREON_Δ_18 ("Vaporeon δ", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _METAL_]),
	AZUMARILL_Δ_19 ("Azumarill δ", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _METAL_]),
	AZURILL_20 ("Azurill", 20, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
	HOLON_S_ELECTRODE_21 ("Holon's Electrode", 21, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	HOLON_S_MAGNETON_22 ("Holon's Magneton", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	HYPNO_23 ("Hypno", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	MIGHTYENA_Δ_24 ("Mightyena δ", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_, _METAL_]),
	PORYGON2_25 ("Porygon2", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	RAIN_CASTFORM_26 ("Rain Castform", 26, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
	SANDSLASH_Δ_27 ("Sandslash δ", 27, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_, _METAL_]),
	SLOWKING_28 ("Slowking", 28, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SNOW_CLOUD_CASTFORM_29 ("Snow-cloud Castform", 29, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
	STARMIE_Δ_30 ("Starmie δ", 30, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _METAL_]),
	SUNNY_CASTFORM_31 ("Sunny Castform", 31, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
	SWELLOW_32 ("Swellow", 32, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	WEEZING_33 ("Weezing", 33, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	CASTFORM_34 ("Castform", 34, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	DITTO_35 ("Ditto", 35, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
	DITTO_36 ("Ditto", 36, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
	DITTO_37 ("Ditto", 37, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
	DITTO_38 ("Ditto", 38, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
	DITTO_39 ("Ditto", 39, Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
	DITTO_40 ("Ditto", 40, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
	DRAGONAIR_Δ_41 ("Dragonair δ", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	DRAGONAIR_Δ_42 ("Dragonair δ", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	GOLBAT_43 ("Golbat", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	HARIYAMA_44 ("Hariyama", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	ILLUMISE_45 ("Illumise", 45, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
	KAKUNA_46 ("Kakuna", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	KIRLIA_47 ("Kirlia", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	MAGNETON_48 ("Magneton", 48, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	METANG_Δ_49 ("Metang δ", 49, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	PERSIAN_50 ("Persian", 50, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	PUPITAR_Δ_51 ("Pupitar δ", 51, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	RAPIDASH_52 ("Rapidash", 52, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	SHELGON_Δ_53 ("Shelgon δ", 53, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	SHELGON_Δ_54 ("Shelgon δ", 54, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	SKARMORY_55 ("Skarmory", 55, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
	VOLBEAT_56 ("Volbeat", 56, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
	BAGON_Δ_57 ("Bagon δ", 57, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	BAGON_Δ_58 ("Bagon δ", 58, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	BELDUM_Δ_59 ("Beldum δ", 59, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	CUBONE_60 ("Cubone", 60, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	DITTO_61 ("Ditto", 61, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	DITTO_62 ("Ditto", 62, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	DITTO_63 ("Ditto", 63, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	DITTO_64 ("Ditto", 64, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	DRATINI_Δ_65 ("Dratini δ", 65, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	DRATINI_Δ_66 ("Dratini δ", 66, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	DROWZEE_67 ("Drowzee", 67, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	EEVEE_Δ_68 ("Eevee δ", 68, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	EEVEE_69 ("Eevee", 69, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	HOLON_S_MAGNEMITE_70 ("Holon's Magnemite", 70, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
	HOLON_S_VOLTORB_71 ("Holon's Voltorb", 71, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	KOFFING_72 ("Koffing", 72, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	LARVITAR_Δ_73 ("Larvitar δ", 73, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	MAGNEMITE_74 ("Magnemite", 74, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
	MAKUHITA_75 ("Makuhita", 75, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	MARILL_76 ("Marill", 76, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	MEOWTH_77 ("Meowth", 77, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	PONYTA_78 ("Ponyta", 78, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
	POOCHYENA_79 ("Poochyena", 79, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
	PORYGON_80 ("Porygon", 80, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	RALTS_81 ("Ralts", 81, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
	SANDSHREW_82 ("Sandshrew", 82, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
	SLOWPOKE_83 ("Slowpoke", 83, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	STARYU_84 ("Staryu", 84, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	STARYU_85 ("Staryu", 85, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
	TAILLOW_86 ("Taillow", 86, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
	WEEDLE_87 ("Weedle", 87, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	ZUBAT_88 ("Zubat", 88, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
	DUAL_BALL_89 ("Dual Ball", 89, Rarity.UNCOMMON, [TRAINER, ITEM]),
	GREAT_BALL_90 ("Great Ball", 90, Rarity.UNCOMMON, [TRAINER, ITEM]),
	HOLON_FARMER_91 ("Holon Farmer", 91, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HOLON_LASS_92 ("Holon Lass", 92, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HOLON_MENTOR_93 ("Holon Mentor", 93, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HOLON_RESEARCH_TOWER_94 ("Holon Research Tower", 94, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	HOLON_RESEARCHER_95 ("Holon Researcher", 95, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HOLON_RUINS_96 ("Holon Ruins", 96, Rarity.UNCOMMON, [TRAINER, STADIUM]),
	HOLON_SCIENTIST_97 ("Holon Scientist", 97, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
	HOLON_TRANSCEIVER_98 ("Holon Transceiver", 98, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
	MASTER_BALL_99 ("Master Ball", 99, Rarity.UNCOMMON, [TRAINER, ITEM]),
	SUPER_SCOOP_UP_100 ("Super Scoop Up", 100, Rarity.UNCOMMON, [TRAINER, ITEM]),
	POTION_101 ("Potion", 101, Rarity.COMMON, [TRAINER, ITEM]),
	SWITCH_102 ("Switch", 102, Rarity.COMMON, [TRAINER, ITEM]),
	DARKNESS_ENERGY_103 ("Darkness Energy", 103, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	HOLON_ENERGY_FF_104 ("Holon Energy FF", 104, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	HOLON_ENERGY_GL_105 ("Holon Energy GL", 105, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	HOLON_ENERGY_WP_106 ("Holon Energy WP", 106, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	METAL_ENERGY_107 ("Metal Energy", 107, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
	FLAREON_EX_108 ("Flareon ex", 108, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _FIRE_]),
	JOLTEON_EX_109 ("Jolteon ex", 109, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _LIGHTNING_]),
	VAPOREON_EX_110 ("Vaporeon ex", 110, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _WATER_]),
	GROUDON_STAR_111 ("Groudon Star", 111, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	KYOGRE_STAR_112 ("Kyogre Star", 112, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	METAGROSS_STAR_113 ("Metagross Star", 113, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	AZUMARILL_114 ("Azumarill", 114, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	DeltaSpecies(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.DELTA_SPECIES;
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
			case BEEDRILL_Δ_1:
			return evolution (this, from:"Kakuna", hp:HP090, type:[G, M], retreatCost:0) {
				weakness R
				pokePower "Final Sting", {
					text "Once during your turn (before your attack), you may Knock Out Beedrill. If you do, choose 1 of your opponent's Defending Pokémon. That Pokémon is now Paralyzed and Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns. This power can't be used if Beedrill is affected by a Special Condition."
					actionA {
            // TODO:
					}
				}
				move "Super Slash", {
					text "50+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 50 damage plus 30 more damage."
					energyCost G, M, C
					attackRequirement {}
					onAttack {
						damage 50
            if (defending.evolution) {
              damage 30
            }
					}
				}
			};
			case CROBAT_Δ_2:
			return evolution (this, from:"Golbat", hp:HP090, type:[G, M], retreatCost:0) {
				weakness P
				move "Radar Jam", {
					text "30 damage. Your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand during your opponent's next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Target Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. If that Pokémon already has damage counters on it, this attack does 60 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G, M, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case DRAGONITE_Δ_3:
			return evolution (this, from:"Dragonair", hp:HP100, type:[L, M], retreatCost:2) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				pokePower "Delta Charge", {
					text "Once during your turn (before your attack), you may attach a [L] Energy card from your discard pile to 1 of your Benched Pokémon. This power can't be used if Dragonite is affected by a Special Condition."
					actionA {
					}
				}
				move "Agility", {
					text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Dragonite during your opponent's next turn."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Heavy Impact", {
					text "70 damage."
					energyCost L, M, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case ESPEON_Δ_4:
			return evolution (this, from:"Eevee", hp:HP070, type:[P, M], retreatCost:1) {
				weakness P
				pokePower "Delta Heal", {
					text "Once during your turn (before your attack), you may remove 1 damage counter from each of your Pokémon that has δ on its card. You can't use more than 1 Delta Heal Poké-Power each turn. This power can't be used if Espeon is affected by a Special Condition."
					actionA {
					}
				}
				move "Psyshock", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, M
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case FLAREON_Δ_5:
			return evolution (this, from:"Eevee", hp:HP070, type:[R, M], retreatCost:1) {
				weakness W
				move "Delta Search", {
					text "10 damage. Search your deck for a Holon Energy card and attach it to Flareon. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Return Burn", {
					text "50 damage. You may return an Energy card attached to Flareon to your hand. If you do, the Defending Pokémon is now Burned."
					energyCost
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case GARDEVOIR_Δ_6:
			return evolution (this, from:"Kirlia", hp:HP100, type:[P, M], retreatCost:2) {
				weakness P
				pokePower "Energy Jump", {
					text "Once during your turn (before your attack), you may move an Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Gardevoir is affected by a Special Condition."
					actionA {
					}
				}
				move "Psychic Rage", {
					text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each damage counter on Gardevoir to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost M, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Black Magic", {
					text "10+ damage. Does 10 damage plus 20 more damage times the number of your opponent's Benched Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case JOLTEON_Δ_7:
			return evolution (this, from:"Eevee", hp:HP070, type:[L, M], retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Delta Search", {
					text "10 damage. Search your deck for a Holon Energy card and attach it to Jolteon. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Return Spark", {
					text "50 damage. You may return an Energy card attached to Jolteon to your hand. If you do, this attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, M, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case LATIAS_Δ_8:
			return basic (this, hp:HP070, type:[L, M], retreatCost:1) {
				weakness C
				resistance P, MINUS30
				resistance F, MINUS30
				pokeBody "Delta Aura", {
					text "If you have Latios or Latios ex in play, the attack cost of Latias's Extra Crush is now Lightning Metal [C]."
					delayedA {
					}
				}
				move "Spiral Drain", {
					text "20 damage. Remove 2 damage counters from Latias."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Extra Crush", {
					text "80 damage. If your opponent has no Pokémon-ex in play, this attack does nothing."
					energyCost L, M, C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
			case LATIOS_Δ_9:
			return basic (this, hp:HP080, type:[L, M], retreatCost:2) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				pokeBody "Delta Aura", {
					text "If you have Latias or Latias ex in play, the attack cost of Latios's Psychic Force is now Lightning Metal [C]."
					delayedA {
					}
				}
				move "Dragon Claw", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Psychic Force", {
					text "80 damage. If your opponent has no Stage 2 Evolved Pokémon in play, this attack does nothing."
					energyCost L, M, C, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
			case MAROWAK_Δ_10:
			return evolution (this, from:"Cubone", hp:HP080, type:[F, M], retreatCost:1) {
				weakness G
				move "Energy Bone", {
					text "Choose a number of your opponent's Pokémon up to the amount of Energy attached to Marowak. This attack does 20 damage to each of them."
					energyCost F, M
					attackRequirement {}
					onAttack {

					}
				}
				move "Metal Crusher", {
					text "50 damage. If the Defending Pokémon is [M] Pokémon, this attack's base damage is 90."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case METAGROSS_Δ_11:
			return evolution (this, from:"Metang", hp:HP100, type:[L, M], retreatCost:3) {
				weakness R
				resistance G, MINUS30
				pokePower "Delta Control", {
					text "Once during your turn (before your attack), you may look at the top 4 cards of your deck, choose 1 of them, and put it into your hand. Put the 3 other cards on the bottom of your deck in any order. This power can't be used if Metagross is affected by a Special Condition."
					actionA {
					}
				}
				move "Crush and Burn", {
					text "30+ damage. You may discard as many Energy cards as you like attached to your Pokémon in play. If you do, this attack does 30 damage plus 20 more damage for each Energy card you discarded."
					energyCost L, M
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case MEWTWO_Δ_12:
			return basic (this, hp:HP070, type:[R, M], retreatCost:1) {
				weakness P
				pokePower "Delta Switch", {
					text "Once during your turn, when you put Mewtwo from your hand onto your Bench, you may move any number of basic Energy cards attached to your Pokémon to your other Pokémon (excluding Mewtwo) in any way you like."
					actionA {
					}
				}
				move "Energy Burst", {
					text "10x damage. Does 10 damage times the total amount of Energy attached to Mewtwo and the Defending Pokémon."
					energyCost R, M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case RAYQUAZA_Δ_13:
			return basic (this, hp:HP090, type:[L, M], retreatCost:3) {
				weakness C
				resistance W, MINUS30
				resistance F, MINUS30
				pokeBody "Delta Guard", {
					text "As long as Rayquaza has any Holon Energy cards attached to it, ignore the effect of Rayquaza's Lightning Storm attack."
					delayedA {
					}
				}
				move "Power Blow", {
					text "10x damage. Does 10 damage times the amount of Energy attached to Rayquaza."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Lightning Storm", {
					text "Put 7 damage counters on Rayquaza."
					energyCost L, M, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SALAMENCE_Δ_14:
			return evolution (this, from:"Shelgon", hp:HP110, type:[R, M], retreatCost:1) {
				weakness C
				resistance R, MINUS30
				resistance F, MINUS30
				move "Fire Dance", {
					text "30 damage. Search your discard pile for a [R] Energy card and attach it to 1 of your Pokémon."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Delta Blast", {
					text "100 damage. Discard a [M] Energy card attached to Salamence."
					energyCost R, M, C, C
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
			};
			case STARMIE_Δ_15:
			return evolution (this, from:"Staryu", hp:HP060, type:[W, M], retreatCost:0) {
				weakness L
				pokePower "Metal Navigation", {
					text "Once during your turn (before your attack), you may search your deck for a [M] Energy card and attach it to Starmie. Shuffle your deck afterward. This power can't be used if Starmie is affected by a Special Condition."
					actionA {
					}
				}
				move "Collect", {
					text "Draw 3 cards."
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
				move "Energy Loop", {
					text "30 damage. Return an Energy card attached to Starmie to your hand."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case TYRANITAR_Δ_16:
			return evolution (this, from:"Pupitar", hp:HP120, type:[R, M], retreatCost:2) {
				weakness G
				pokePower "Crush Draw", {
					text "Once during your turn (before your attack), you may reveal the top card of your deck. If that card is a basic Energy card, attach it to 1 of your Pokémon. If not, put the card back on top of your deck. This power can't be used if Tyranitar is affected by a Special Condition."
					actionA {
					}
				}
				move "Delta Crush", {
					text "50+ damage. You may discard an Energy card attached to Tyranitar. If you do, this attack does 50 damage plus 20 more damage."
					energyCost R, M, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case UMBREON_Δ_17:
			return evolution (this, from:"Eevee", hp:HP070, type:[D, M], retreatCost:1) {
				weakness F
				resistance P, MINUS30
				pokeBody "Delta Moon", {
					text "When your opponent attaches a Special Energy card from his or her hand to 1 of his or her Pokémon, put 1 damage counter on that Pokémon. You can't use more than 1 Delta Moon Poké-Body each turn."
					delayedA {
					}
				}
				move "Feint Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost D, M
					attackRequirement {}
					onAttack {

					}
				}
			};
			case VAPOREON_Δ_18:
			return evolution (this, from:"Eevee", hp:HP070, type:[W, M], retreatCost:1) {
				weakness L
				move "Delta Search", {
					text "10 damage. Search your deck for a Holon Energy card and attach it to Vaporeon. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Return Wave", {
					text "50 damage. You may return an Energy card attached to Vaporeon to your hand. If you do, choose an Energy card attached to the Defending Pokémon and return it to your opponent's hand."
					energyCost W, M, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case AZUMARILL_Δ_19:
			return evolution (this, from:"Marill", hp:HP080, type:[W, M], retreatCost:2) {
				weakness L
				move "Bubblebeam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Rolling Tackle", {
					text "50 damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case AZURILL_20:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				pokePower "Baby Evolution", {
					text "Once during your turn (before your attack), you may put Marill from your hand onto Azurill (this counts as evolving Azurill) and remove all damage counters from Azurill."
					actionA {
					}
				}
				move "Type Match", {
					text "Choose a basic Energy card in your hand and show it to your opponent. Then, search your deck for a Basic Pokémon or Evolution card of that Energy type, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case HOLON_S_ELECTRODE_21:
			return evolution (this, from:"Holon's Voltorb", hp:HP070, type:L, retreatCost:0) {
				weakness F
				move "Dazzle Blast", {
					text "30 damage. The Defending Pokémon is now Confused."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case HOLON_S_MAGNETON_22:
			return evolution (this, from:"Holon's Magnemite", hp:HP070, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				move "Extra Ball", {
					text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 20 more damage."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case HYPNO_23:
			return evolution (this, from:"Drowzee", hp:HP070, type:P, retreatCost:1) {
				weakness P
				pokeBody "Binding Aura", {
					text "Your opponent can't play any Basic Pokémon or Evolution cards from his or her hand to evolve an Asleep Pokémon and can't attach any Energy cards from his or her hand to an Asleep Pokémon."
					delayedA {
					}
				}
				move "Sleep Inducer", {
					text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Psyshot", {
					text "40 damage."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case MIGHTYENA_Δ_24:
			return evolution (this, from:"Poochyena", hp:HP070, type:[D, M], retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Delta Fang", {
					text "20 damage. If the Defending Pokémon is Pokémon-ex, that Pokémon can't attack during your opponent's next turn."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Gang Up", {
					text "10x damage. Does 10 damage times the number of [D] Pokémon and [M] Pokémon you have in play."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case PORYGON2_25:
			return evolution (this, from:"Porygon", hp:HP070, type:C, retreatCost:1) {
				weakness F
				pokePower "Backup", {
					text "Once during your turn (before your attack), if you have less than 6 cards in your hand, you may draw cards until you have 6 cards in your hand. This power can't be used if Porygon2 is affected by a Special Condition."
					actionA {
					}
				}
				move "Machine Burst", {
					text "30 damage. If Porygon2 has a Technical Machine card attached to it, the Defending Pokémon is now Asleep and Burned."
					energyCost
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case RAIN_CASTFORM_26:
			return basic (this, hp:HP070, type:W, retreatCost:1) {
				weakness L
				pokePower "Temperamental Weather", {
					text "Once during your turn (before your attack), you may search your deck for Castform, Sunny Castform, or Snow-cloud Castform and switch it with Rain Castform. (Any cards attached to Rain Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Rain Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
					actionA {
					}
				}
				move "Holon Splash", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Holon Energy card attached to Rain Castform."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case SANDSLASH_Δ_27:
			return evolution (this, from:"Sandshrew", hp:HP080, type:[F, M], retreatCost:1) {
				weakness G
				pokeBody "Delta Storm", {
					text "As long as Sandslash is your Active Pokémon, put 1 damage counter on each of your opponent's Pokémon-ex between turns."
					delayedA {
					}
				}
				move "Rend", {
					text "20+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 20 damage plus 20 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Slash", {
					text "50 damage."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case SLOWKING_28:
			return evolution (this, from:"Slowpoke", hp:HP080, type:W, retreatCost:1) {
				weakness L
				pokePower "Prize Shift", {
					text "Once during your turn (before your attack), you may choose a card from your hand and put it as a Prize card face up. If you do, choose 1 of your face-down Prize cards without looking and put it into your hand. This power can't be used if Slowking is affected by a Special Condition or if all of your Prize cards are face up."
					actionA {
					}
				}
				move "Psychic Option", {
					text "20+ damage. If Slowking has a [W] Energy card attached to it, this attack does 20 damage plus 20 more damage. If Slowking has a [P] Energy card attached to it, discard a Special Energy card attached to the Defending Pokémon, if any."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SNOW_CLOUD_CASTFORM_29:
			return basic (this, hp:HP070, type:W, retreatCost:2) {
				weakness M
				pokePower "Temperamental Weather", {
					text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Sunny Castform and switch it with Snow-cloud Castform. (Any cards attached to Snow-cloud Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Snow-cloud Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
					actionA {
					}
				}
				move "Holon Blizzard", {
					text "20 damage. If Snow-cloud Castform has any Holon Energy cards attached to it, this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case STARMIE_Δ_30:
			return evolution (this, from:"Staryu", hp:HP070, type:[W, M], retreatCost:1) {
				weakness L
				move "Surf", {
					text "20 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Swift", {
					text "50 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case SUNNY_CASTFORM_31:
			return basic (this, hp:HP070, type:R, retreatCost:2) {
				weakness W
				pokePower "Temperamental Weather", {
					text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Snow-cloud Castform and switch it with Sunny Castform. (Any cards attached to Sunny Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Sunny Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
					actionA {
					}
				}
				move "Holon Search", {
					text "Search your deck for a Holon Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SWELLOW_32:
			return evolution (this, from:"Taillow", hp:HP070, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				move "Steep Dive", {
					text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Swellow during your opponent's next turn. If tails, during your next turn, Swellow's Glide attack's base damage is 100."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Glide", {
					text "40 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case WEEZING_33:
			return evolution (this, from:"Koffing", hp:HP070, type:G, retreatCost:2) {
				weakness P
				pokeBody "Body Odor", {
					text "As long as Weezing is the Active Pokémon, put 1 damage counter on each of your opponent's Pokémon that has any Poké-Bodies between turns."
					delayedA {
					}
				}
				move "Mist Attack", {
					text "Does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
				move "Sludge Whirlpool", {
					text "50 damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case CASTFORM_34:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness F
				pokePower "Temperamental Weather", {
					text "Once during your turn (before your attack), you may search your deck for Sunny Castform, Rain Castform, or Snow-cloud Castform and switch it with Castform. (Any cards attached to Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
					actionA {
					}
				}
				move "Holon Draw", {
					text "Draw a card. If Castform has any Holon Energy cards attached to it, draw 2 more cards."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case DITTO_35:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness F
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Energy Link", {
					text "10 damage. Search your discard pile for an Energy card and attach it to Ditto."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DITTO_36:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Toxic", {
					text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
					energyCost G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case DITTO_37:
			return basic (this, hp:HP060, type:R, retreatCost:1) {
				weakness W
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Ditto."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DITTO_38:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness P
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Copy", {
					text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Ditto doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Ditto performs that attack."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case DITTO_39:
			return basic (this, hp:HP060, type:L, retreatCost:1) {
				weakness F
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Thunderbolt", {
					text "40 damage. Discard all Energy cards attached to Ditto."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case DITTO_40:
			return basic (this, hp:HP060, type:W, retreatCost:1) {
				weakness L
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Smash Turn", {
					text "20 damage. After your attack, you may switch Ditto with 1 of your Benched Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case DRAGONAIR_Δ_41:
			return evolution (this, from:"Dratini", hp:HP070, type:L, retreatCost:1) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				move "Slam", {
					text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Dragon Rage", {
					text "40 damage."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case DRAGONAIR_Δ_42:
			return evolution (this, from:"Dratini", hp:HP070, type:L, retreatCost:2) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				move "Twister", {
					text "20 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case GOLBAT_43:
			return evolution (this, from:"Zubat", hp:HP070, type:G, retreatCost:1) {
				weakness P
				move "Super Poison Breath", {
					text "Each Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
				move "Sonic Signal", {
					text "Choose 2 of your opponent's Pokémon. This attack does 10 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case HARIYAMA_44:
			return evolution (this, from:"Makuhita", hp:HP080, type:R, retreatCost:1) {
				weakness P
				pokeBody "Reversal Aura", {
					text "As long as you have more Prize cards left than your opponent, each of Hariyama's attacks does 20 more damage to the Active Pokémon (before applying Weakness and Resistance) and damage done by the Active Pokémon to Hariyama is reduced by 20 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Slap Push", {
					text "30 damage."
					energyCost
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Brick Smash", {
					text "50 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case ILLUMISE_45:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				pokeBody "Beacon Protection", {
					text "As long as you have Volbeat in play, prevent all effects, including damage, done to Illumise by attacks from your opponent's Pokémon that has Dark in its name."
					delayedA {
					}
				}
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Strange Rasping", {
					text "20 damage. If the Defending Pokémon is an Evolved Pokémon, the Defending Pokémon is now Confused."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case KAKUNA_46:
			return evolution (this, from:"Weedle", hp:HP060, type:G, retreatCost:2) {
				weakness R
				move "Fast Evolution", {
					text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
				move "Rollout", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case KIRLIA_47:
			return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
				weakness P
				move "Calm Mind", {
					text "Remove 3 damage counters from Kirlia."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Psychic Boom", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case MAGNETON_48:
			return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Supersonic", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Speed Ball", {
					text "50 damage."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case METANG_Δ_49:
			return evolution (this, from:"Beldum", hp:HP080, type:L, retreatCost:2) {
				weakness R
				resistance G, MINUS30
				move "Sharp Claws", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Magnetic Blast", {
					text "50 damage."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case PERSIAN_50:
			return evolution (this, from:"Meowth", hp:HP080, type:C, retreatCost:1) {
				weakness F
				pokePower "Prowl", {
					text "Once during your turn, when you play Persian from your hand to evolve 1 of your Pokémon, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
					actionA {
					}
				}
				move "Snap Tail", {
					text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case PUPITAR_Δ_51:
			return evolution (this, from:"Larvitar", hp:HP070, type:R, retreatCost:0) {
				weakness G
				move "Paralyzing Gaze", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Double-edge", {
					text "40 damage. Pupitar does 10 damage to itself."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case RAPIDASH_52:
			return evolution (this, from:"Ponyta", hp:HP070, type:R, retreatCost:0) {
				weakness W
				move "Super Singe", {
					text "The Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {

					}
				}
				move "Stomp", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case SHELGON_Δ_53:
			return evolution (this, from:"Bagon", hp:HP080, type:R, retreatCost:2) {
				weakness C
				resistance F, MINUS30
				resistance R, MINUS30
				move "Tight Jaw", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Combustion", {
					text "40 damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
			case SHELGON_Δ_54:
			return evolution (this, from:"Bagon", hp:HP070, type:R, retreatCost:2) {
				weakness C
				resistance F, MINUS30
				resistance R, MINUS30
				pokeBody "Exoskeleton", {
					text "Any damage done to Shelgon by attacks is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Heat Blast", {
					text "30 damage."
					energyCost
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case SKARMORY_55:
			return basic (this, hp:HP070, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				pokeBody "Shining Horn", {
					text "As long as Skarmory is the only Pokémon you have in play, your opponent's Basic Pokémon can't attack."
					delayedA {
					}
				}
				move "Cry for Help", {
					text "Search your deck for a [M] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Steel Wing", {
					text "20 damage. During your opponent's next turn, any damage done to Skarmory by attacks is reduced by 20 (after applying Weakness and Resistance)."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case VOLBEAT_56:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				pokeBody "Extra Protection", {
					text "As long as you have Illumise in play, prevent all effects, including damage, done to Volbeat by attacks from your opponent's Pokémon-ex."
					delayedA {
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
			case BAGON_Δ_57:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness C
				resistance F, MINUS30
				resistance R, MINUS30
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case BAGON_Δ_58:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness C
				resistance R, MINUS30
				resistance F, MINUS30
				move "Ember", {
					text "30 damage. Discard a [R] Energy card attached to Bagon."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case BELDUM_Δ_59:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				pokeBody "Conductive Body", {
					text "You pay [C] to retreat Beldum for each Beldum on your Bench."
					delayedA {
					}
				}
				move "Take Down", {
					text "30 damage. Beldum does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case CUBONE_60:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness G
				move "Beat", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
					energyCost
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DITTO_61:
			return basic (this, hp:HP060, type:R, retreatCost:1) {
				weakness W
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Fireworks", {
					text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Ditto."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case DITTO_62:
			return basic (this, hp:HP060, type:F, retreatCost:1) {
				weakness W
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Linear Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case DITTO_63:
			return basic (this, hp:HP060, type:L, retreatCost:1) {
				weakness F
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
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
			case DITTO_64:
			return basic (this, hp:HP060, type:W, retreatCost:1) {
				weakness L
				pokePower "Duplicate", {
					text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
					actionA {
					}
				}
				move "Spiral Drain", {
					text "20 damage. Remove 3 damage counters from Ditto (all if there are less than 3)."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case DRATINI_Δ_65:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				move "Hook", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Dratini does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case DRATINI_Δ_66:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness C
				resistance G, MINUS30
				resistance F, MINUS30
				move "Thunder Wave", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DROWZEE_67:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Disable", {
					text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Headbutt", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case EEVEE_Δ_68:
			return basic (this, hp:HP050, type:M, retreatCost:1) {
				weakness F
				move "Metal Scoop", {
					text "10 damage. Search your discard pile for a [M] Energy card and attach it to Eevee."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case EEVEE_69:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Rear Kick", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case HOLON_S_MAGNEMITE_70:
			return basic (this, hp:HP040, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS30
				move "Linear Attack", {
					text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost M
					attackRequirement {}
					onAttack {

					}
				}
			};
			case HOLON_S_VOLTORB_71:
			return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case KOFFING_72:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness P
				move "Confusion Gas", {
					text "The Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
				move "Ram", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case LARVITAR_Δ_73:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness G
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Rising Lunge", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case MAGNEMITE_74:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Magnetic Blast", {
					text "10 damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case MAKUHITA_75:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Sand Attack", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case MARILL_76:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Rollout", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Jump On", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case MEOWTH_77:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				move "Pickup Power", {
					text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case PONYTA_78:
			return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Flare", {
					text "10 damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case POOCHYENA_79:
			return basic (this, hp:HP050, type:D, retreatCost:1) {
				weakness R
				resistance P, MINUS30
				move "Roar", {
					text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Ambush", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case PORYGON_80:
			return basic (this, hp:HP050, type:C, retreatCost:1) {
				weakness F
				move "Sharpen", {
					text "30 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
			case RALTS_81:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Quick Blow", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case SANDSHREW_82:
			return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness L
				move "Dig Under", {
					text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
					energyCost F
					attackRequirement {}
					onAttack {

					}
				}
				move "Scratch", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case SLOWPOKE_83:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Yawn", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Tackle", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case STARYU_84:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Spinning Attack", {
					text "20 damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
			case STARYU_85:
			return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				move "Surprise Attack", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Recover", {
					text "Discard a [W] Energy card attached to Staryu and remove 4 damage counters from Staryu (all if there are less than 4)."
					energyCost W
					attackRequirement {}
					onAttack {

					}
				}
			};
			case TAILLOW_86:
			return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness L
				resistance R, MINUS30
				move "Skill Dive", {
					text "Does 10 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case WEEDLE_87:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "String Shot", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case ZUBAT_88:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness P
				move "Poison Fang", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
			case DUAL_BALL_89:
			return itemCard (this) {
				text "null"
				onPlay {
				}
				playRequirement{
				}
			};
			case GREAT_BALL_90:
			return itemCard (this) {
				text "null"
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_FARMER_91:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Discard a card from your hand. If you can't discard a card from your hand, you can't play this card.Search your discard pile for 3 basic Energy cards and any combination of 3 Basic Pokémon or Evolution cards, show them to your opponent, and put them on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_LASS_92:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Discard a card from your hand. If you can't discard a card from your hand, you can't play this card.Count the total number of Prize cards left (both yours and your opponent's). Look at that many cards from the top of your deck, choose as many Energy cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_MENTOR_93:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Discard a card from your hand. If you can't discard a card from your hand, you can't play this card.Search your deck for up to 3 Basic Pokémon that each has 100 HP or less, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_RESEARCH_TOWER_94:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player's basic Energy cards attached to Pokémon that has δ on its card are both their usual Energy type and Metal type but provide only 1 Energy at a time. (Has no effect other than providing Energy.)"
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case HOLON_RESEARCHER_95:
			return supporter (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Search your deck for a [M] Energy card or a Basic Pokémon (or Evolution card) that has δ on its card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_RUINS_96:
			return stadium (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
					"Each player that has any Pokémon in play that has ݎ on its card may draw a card once during his or her turn. If the player does, he or she discards a card from his or her hand."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case HOLON_SCIENTIST_97:
			return supporter (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
					"Discard a card from your hand. If you can't discard a card from your hand, you can't play this card.If you have less cards in your hand than your opponent, draw cards until you have the same number of cards as your opponent."
				onPlay {
				}
				playRequirement{
				}
			};
			case HOLON_TRANSCEIVER_98:
			return pokemonTool (this) {
				text "Search your deck for a Supporter card that has Holon in its name, show it to your opponent, and put it into your hand. Shuffle your deck afterward. Or, search your discard pile for a Supporter card that has Holon in its name, show it to your opponent, and put it into your hand."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case MASTER_BALL_99:
			return itemCard (this) {
				text "Look at the top 7 cards from your deck. Choose a Basic Pokémon or Evolution card from those cards, show it to your opponent, and put it into your hand. Put the other 6 cards back on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case SUPER_SCOOP_UP_100:
			return itemCard (this) {
				text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case POTION_101:
			return itemCard (this) {
				text "Remove 2 damage counters from I of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWITCH_102:
			return itemCard (this) {
				text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_103:
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
			case HOLON_ENERGY_FF_104:
			return specialEnergy (this, [[C]]) {
				text "Holon Energy FF provides [C] Energy. If the Pokémon that Holon Energy FF is attached to also has a basic [R] Energy card attached to it, that Pokémon has no Weakness. If the Pokémon that Holon Energy FF is attached to also has a basic [F] Energy card attached to it, damage done by that Pokémon's attack isn't affected by Resistance. Ignore these effects if Holon Energy FF is attached to Pokémon-ex."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case HOLON_ENERGY_GL_105:
			return specialEnergy (this, [[C]]) {
				text "Holon Energy GL provides [C] Energy. If the Pokémon that Holon Energy GL is attached to also has a basic [G] Energy card attached to it, that Pokémon can't be affected by any Special Conditions. If the Pokémon that Holon Energy GL is attached to also has a basic [L] Energy card attached to it, damage done by your opponent's Pokémon-ex is reduced by 10. Ignore these effects if Holon Energy GL is attached to Pokémon-ex."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case HOLON_ENERGY_WP_106:
			return specialEnergy (this, [[C]]) {
				text "Holon Energy WP provides [C] Energy. If the Pokémon that Holon Energy WP is attached to also has a basic [W] Energy card attached to it, prevent all effects, excluding damage, done to that Pokémon by your opponent's Pokémon. If the Pokémon that Holon Energy WP is attached to also has a basic [P] Energy card attached to it, that Pokémon's Retreat Cost is 0. Ignore these effects if Holon Energy WP is attached to Pokémon-ex."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case METAL_ENERGY_107:
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
			case FLAREON_EX_108:
			return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:1) {
				weakness W
				pokePower "Evolutionary Flame", {
					text "Once during your turn, when you play Flareon ex from your hand to evolve 1 of your Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Burned and Confused."
					actionA {
					}
				}
				move "Flame Screen", {
					text "30 damage. During your opponent's next turn, any damage done to Flareon ex by attacks is reduced by 20 (after applying Weakness and Resistance)."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Heat Tackle", {
					text "70 damage. Flareon ex does 10 damage to itself."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case JOLTEON_EX_109:
			return evolution (this, from:"Eevee", hp:HP100, type:L, retreatCost:0) {
				weakness F
				resistance M, MINUS30
				pokePower "Evolutionary Thunder", {
					text "Once during your turn, when you play Jolteon ex from your hand to evolve 1 of your Pokémon, you may put 1 damage counter on each of your opponent's Pokémon."
					actionA {
					}
				}
				move "Second Bite", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Thunder Blast", {
					text "70 damage. Discard a [L] Energy card attached to Jolteon ex."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
			case VAPOREON_EX_110:
			return evolution (this, from:"Eevee", hp:HP120, type:W, retreatCost:1) {
				weakness L
				pokePower "Evolutionary Swirl", {
					text "Once during your turn, when you play Vaporeon ex from your hand to evolve 1 of your Pokémon, you may have your opponent shuffle his or her hand into his or her deck. Then, your opponent draws up to 4 cards."
					actionA {
					}
				}
				move "Fastwave", {
					text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Hydrosplash", {
					text "60 damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case GROUDON_STAR_111:
			return basic (this, hp:HP090, type:F, retreatCost:3) {
				weakness W
				move "Critical Collection", {
					text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [F] Energy cards and attach them to Groudon Star."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Ground Slash", {
					text "80 damage. Discard a [F] Energy card attached to Groudon Star."
					energyCost F, F, F, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
			case KYOGRE_STAR_112:
			return basic (this, hp:HP090, type:W, retreatCost:3) {
				weakness L
				move "Critical Collection", {
					text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [W] Energy cards and attach them to Kyogre Star."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Sheer Cold", {
					text "60 damage. Flip a coin. If heads, each Defending Pokémon can't attack during your opponent's next turn."
					energyCost W, W, W, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
			case METAGROSS_STAR_113:
			return basic (this, hp:HP070, type:M, retreatCost:3) {
				weakness R
				resistance G, MINUS30
				move "Critical Collection", {
					text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [M] Energy cards and attach them to Metagross Star."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Hyper Beam", {
					text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost M, M, M, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
			case AZUMARILL_114:
			return evolution (this, from:"Marill", hp:HP070, type:W, retreatCost:1) {
				weakness L
				pokeBody "Thick Fat", {
					text "Any damage done to Azumarill by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Bubblebeam", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
				default:
			return null;
		}
	}

}