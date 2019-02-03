package tcgwars.logic.impl.gen4;

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
public enum RisingRivals implements CardInfo {

	ARCANINE_1 ("Arcanine", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	BASTIODON_GL_2 ("Bastiodon GL", 2, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
	DARKRAI_G_3 ("Darkrai G", 3, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
	FLOATZEL_GL_4 ("Floatzel GL", 4, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	FLYGON_5 ("Flygon", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	FROSLASS_GL_6 ("Froslass GL", 6, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	JIRACHI_7 ("Jirachi", 7, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
	LUCARIO_GL_8 ("Lucario GL", 8, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	LUXRAY_GL_9 ("Luxray GL", 9, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	MISMAGIUS_GL_10 ("Mismagius GL", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	RAMPARDOS_GL_11 ("Rampardos GL", 11, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	ROSERADE_GL_12 ("Roserade GL", 12, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SHIFTRY_13 ("Shiftry", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
	AGGRON_14 ("Aggron", 14, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
	BEEDRILL_15 ("Beedrill", 15, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	BRONZONG_E4_16 ("Bronzong E4", 16, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	DRAPION_E4_17 ("Drapion E4", 17, Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
	ESPEON_E4_18 ("Espeon E4", 18, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	FLAREON_19 ("Flareon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	GALLADE_E4_20 ("Gallade E4", 20, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	GASTRODON_EAST_SEA_21 ("Gastrodon East Sea", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GASTRODON_WEST_SEA_22 ("Gastrodon West Sea", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	GOLEM_E4_23 ("Golem E4", 23, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	HERACROSS_E4_24 ("Heracross E4", 24, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	HIPPOWDON_25 ("Hippowdon", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	JOLTEON_26 ("Jolteon", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MAMOSWINE_GL_27 ("Mamoswine GL", 27, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	MR__MIME_E4_28 ("Mr. Mime E4", 28, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOKING_29 ("Nidoking", 29, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	NIDOQUEEN_30 ("Nidoqueen", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	RAICHU_GL_31 ("Raichu GL", 31, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	RHYPERIOR_E4_32 ("Rhyperior E4", 32, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	SNORLAX_33 ("Snorlax", 33, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	VAPOREON_34 ("Vaporeon", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	VESPIQUEN_E4_35 ("Vespiquen E4", 35, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	WALREIN_36 ("Walrein", 36, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	YANMEGA_E4_37 ("Yanmega E4", 37, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	ALAKAZAM_E4_38 ("Alakazam E4", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	ELECTRODE_G_39 ("Electrode G", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	GENGAR_GL_40 ("Gengar GL", 40, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GLACEON_41 ("Glaceon", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	HIPPOWDON_E4_42 ("Hippowdon E4", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	INFERNAPE_E4_43 ("Infernape E4", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	LAIRON_44 ("Lairon", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	LEAFEON_45 ("Leafeon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	MACHAMP_GL_46 ("Machamp GL", 46, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	RAPIDASH_E4_47 ("Rapidash E4", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	SCIZOR_E4_48 ("Scizor E4", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	SHARPEDO_49 ("Sharpedo", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	STARMIE_50 ("Starmie", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	STEELIX_GL_51 ("Steelix GL", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
	TROPIUS_52 ("Tropius", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	VIBRAVA_53 ("Vibrava", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	WHISCASH_E4_54 ("Whiscash E4", 54, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
	AERODACTYL_GL_55 ("Aerodactyl GL", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	AMBIPOM_G_56 ("Ambipom G", 56, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	ARON_57 ("Aron", 57, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	CARVANHA_58 ("Carvanha", 58, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	EEVEE_59 ("Eevee", 59, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	FLAREON_E4_60 ("Flareon E4", 60, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	FORRETRESS_G_61 ("Forretress G", 61, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	GLISCOR_E4_62 ("Gliscor E4", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	GROWLITHE_63 ("Growlithe", 63, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	HIPPOPOTAS_64 ("Hippopotas", 64, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	HOUNDOOM_E4_65 ("Houndoom E4", 65, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	KAKUNA_66 ("Kakuna", 66, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	KECLEON_67 ("Kecleon", 67, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	KOFFING_68 ("Koffing", 68, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	MUNCHLAX_69 ("Munchlax", 69, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	MUNCHLAX_70 ("Munchlax", 70, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	NIDORAN_FEMALE_71 ("Nidoran Female", 71, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	NIDORAN_MALE_72 ("Nidoran Male", 72, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	NIDORINA_73 ("Nidorina", 73, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	NIDORINO_74 ("Nidorino", 74, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	NUZLEAF_75 ("Nuzleaf", 75, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	QUAGSIRE_GL_76 ("Quagsire GL", 76, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SEALEO_77 ("Sealeo", 77, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	SEEDOT_78 ("Seedot", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SHELLOS_EAST_SEA_79 ("Shellos East Sea", 79, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHELLOS_WEST_SEA_80 ("Shellos West Sea", 80, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SNORLAX_81 ("Snorlax", 81, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SPHEAL_82 ("Spheal", 82, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	STARYU_83 ("Staryu", 83, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	TRAPINCH_84 ("Trapinch", 84, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	TURTWIG_GL_85 ("Turtwig GL", 85, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	WEEDLE_86 ("Weedle", 86, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	WEEZING_87 ("Weezing", 87, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	AARON_S_COLLECTION_88 ("Aaron's Collection", 88, Rarity.UNCOMMON, [TRAINER]),
	BEBE_S_SEARCH_89 ("Bebe's Search", 89, Rarity.UNCOMMON, [TRAINER]),
	BERTHA_S_WARMTH_90 ("Bertha's Warmth", 90, Rarity.UNCOMMON, [TRAINER]),
	FLINT_S_WILLPOWER_91 ("Flint's Willpower", 91, Rarity.UNCOMMON, [TRAINER]),
	LUCIAN_S_ASSIGNMENT_92 ("Lucian's Assignment", 92, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_CONTEST_HALL_93 ("Pokémon Contest Hall", 93, Rarity.UNCOMMON, [TRAINER]),
	SUNYSHORE_CITY_GYM_94 ("Sunyshore City Gym", 94, Rarity.UNCOMMON, [TRAINER]),
	TECHNICAL_MACHINE_G_95 ("Technical Machine G", 95, Rarity.UNCOMMON, [TRAINER]),
	SP_RADAR_96 ("SP Radar", 96, Rarity.UNCOMMON, [TRAINER]),
	UNDERGROUND_EXPEDITION_97 ("Underground Expedition", 97, Rarity.UNCOMMON, [TRAINER]),
	VOLKNER_S_PHILOSOPHY_98 ("Volkner's Philosophy", 98, Rarity.UNCOMMON, [TRAINER]),
	DARKNESS_ENERGY_99 ("Darkness Energy", 99, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	METAL_ENERGY_100 ("Metal Energy", 100, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	SP_ENERGY_101 ("SP Energy", 101, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	UPPER_ENERGY_102 ("Upper Energy", 102, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	ALAKAZAM_E4_LV_X_103 ("Alakazam E4 LV.X", 103, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
	FLOATZEL_GL_LV_X_104 ("Floatzel GL LV.X", 104, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _WATER_]),
	FLYGON_LV_X_105 ("Flygon LV.X", 105, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	GALLADE_E4_LV_X_106 ("Gallade E4 LV.X", 106, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
	HIPPOWDON_LV_X_107 ("Hippowdon LV.X", 107, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
	INFERNAPE_E4_LV_X_108 ("Infernape E4 LV.X", 108, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIRE_]),
	LUXRAY_GL_LV_X_109 ("Luxray GL LV.X", 109, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _LIGHTNING_]),
	MISMAGIUS_GL_LV_X_110 ("Mismagius GL LV.X", 110, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
	SNORLAX_LV_X_111 ("Snorlax LV.X", 111, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	PIKACHU_112 ("Pikachu", 112, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	FLYING_PIKACHU_113 ("Flying Pikachu", 113, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	SURFING_PIKACHU_114 ("Surfing Pikachu", 114, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	FAN_ROTOM_RT1 ("Fan Rotom", 115, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	FROST_ROTOM_RT2 ("Frost Rotom", 116, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	HEAT_ROTOM_RT3 ("Heat Rotom", 117, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	MOW_ROTOM_RT4 ("Mow Rotom", 118, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	WASH_ROTOM_RT5 ("Wash Rotom", 119, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	CHARON_S_CHOICE_RT6 ("Charon's Choice", 120, Rarity.HOLORARE, [TRAINER]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	RisingRivals(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.RISING_RIVALS;
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
			case ARCANINE_1:
			return evolution (this, from:"Growlithe", hp:HP100, type:FIRE, retreatCost:2) {
				weakness W, PLUS20
				pokeBody "Flare Condition", {
					text "As long as Arcanine has any Energy attached to it, Arcanine has no Weakness."
					delayedA {
					}
				}
				move "Burn Out", {
					text "30+ damage. You may do 30 damage plus 30 more damage. If you do, Arcanine is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flames of Rage", {
					text "60+ damage. Energy attached to Arcanine. This attack does 60 damage plus 10 more damage for each damage counter on Arcanine."
					energyCost R, C, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BASTIODON_GL_2:
			return basic (this, hp:HP090, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Bounce Back", {
					text "30 damage. Your opponent switches the Defending Pokémon with one of his or her Benched Pokémon."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smack Attack", {
					text "60 damage. ."
					energyCost M, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_G_3:
			return basic (this, hp:HP090, type:DARKNESS, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				pokeBody "Eerie Aura", {
					text "Put 1 damage counter on each of your opponent’s Pokémon that remains Asleep between turns."
					delayedA {
					}
				}
				move "Darkness Sleep", {
					text "50 damage. If the Defending Pokémon already has any damage counters on it, that Pokémon is now Asleep."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLOATZEL_GL_4:
			return basic (this, hp:HP080, type:WATER, retreatCost:1) {
				weakness L
				move "Incite", {
					text "Search your discard pile for up to 2 Supporter cards, show them to your opponent, and put them into your hand."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Giant Wave", {
					text "50 damage. can’t use Giant Wave during your next turn."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLYGON_5:
			return evolution (this, from:"Vibrava", hp:HP120, type:COLORLESS, retreatCost:0) {
				weakness C, PLUS30
				resistance L, MINUS20
				pokeBody "Rainbow Float", {
					text "If any basic Energy card attached to Flygon is the same type as any of your Pokémon, the Retreat Cost for those Pokémon is 0."
					delayedA {
					}
				}
				move "Sand Wall", {
					text "40 damage. Discard a Stadium card your opponent has in play. If you do, prevent all effects of an attack, including damage, done to Flygon during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Power Swing", {
					text "60+ damage. Does 60 damage plus 10 more damage for each Evolved Pokémon on your Bench."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FROSLASS_GL_6:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness M
				move "Sleep Inducer", {
					text "Switch the Defending Pokémon with one of your opponent’s Benched Pokémon. The new Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wake-Up Slap", {
					text "30+ damage. If the Defending Pokémon is affected by any Special Conditions, this attack does 30 damage plus 20 more damage. Then, remove all Special Conditions from the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIRACHI_7:
			return basic (this, hp:HP060, type:METAL, retreatCost:0) {
				weakness R, PLUS20
				resistance P, MINUS20
				pokePower "Final Wish", {
					text "Once during your opponent’s turn, if Jirachi would be Knocked Out by damage from an attack, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
					actionA {
					}
				}
				move "Detour", {
					text "If you have a Supporter card in play, use the effect of that card as the effect of this attack."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUCARIO_GL_8:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness P
				pokeBody "Boundary Aura", {
					text "Apply Weakness for each Pokémon as ×2 instead."
					delayedA {
					}
				}
				move "Combo Throw", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXRAY_GL_9:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Bite", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Trash Bolt", {
					text "70 damage. Discard an Energy card from your hand. (If you can’t discard a card from your hand, this attack does nothing.)"
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MISMAGIUS_GL_10:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Psychic Removal", {
					text "10 damage. Flip 2 coins. If both of them are heads, discard all Energy attached to the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Grudge", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Prize card your opponent has taken."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAMPARDOS_GL_11:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness G
				move "Trample", {
					text ". If that coin flip is heads, this attack does 30 damage to that Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rend", {
					text "40+ damage. If the Defending Pokémon has any damage counters on it, this attack does 40 damage plus 20 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROSERADE_GL_12:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Poison Bind", {
					text "10 damage. The Defending Pokémon is now Poisoned and can’t retreat during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Long Whip", {
					text "30 damage. If the Defending Pokémon is affected by any Special Conditions, you may do 30 damage to any 1 Benched Pokémon instead."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHIFTRY_13:
			return evolution (this, from:"Nuzleaf", hp:HP130, type:DARKNESS, retreatCost:1) {
				weakness R, PLUS30
				resistance P, MINUS20
				pokeBody "Unlucky Wind", {
					text "As long as Shiftry is your Active Pokémon, whenever your opponent flips a coin during his or her turn, treat it as tails."
					delayedA {
					}
				}
				move "Conform", {
					text "40 damage. If you have the same number of cards in your hand as your opponent, the Defending Pokémon is now Confused."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Seal Off", {
					text "60 damage. The Defending Pokémon can’t use any Poké-Powers or Poké-Bodies during your opponent’s next turn."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AGGRON_14:
			return evolution (this, from:"Lairon", hp:HP130, type:METAL, retreatCost:3) {
				weakness R, PLUS30
				resistance P, MINUS20
				move "Return Blow", {
					text "If Aggron was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Aggron to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Metal Fang", {
					text "40 damage. You may discard the top card of your deck. If you do, remove 2 damage counters and all Special Conditions from Aggron."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Impact", {
					text "70 damage. "
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEEDRILL_15:
			return evolution (this, from:"Kakuna", hp:HP110, type:GRASS, retreatCost:1) {
				weakness R, PLUS30
				pokePower "Flutter Wings", {
					text "Once during your turn , you may search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Beedrill is affected by a Special Condition."
					actionA {
					}
				}
				move "Needle Shock", {
					text "30 damage. The Defending Pokémon is now Paralyzed and Poisoned. Ignore this effect if any of your Pokémon used Needle Shock during your last turn."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZONG_E4_16:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
				weakness P
				resistance R, MINUS20
				move "Hand Refresh", {
					text "Each player shuffles his or her hand into his or her deck and draws up to 4 cards. (You draw your cards first.)"
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Payback", {
					text "10+ damage. If your opponent has only 1 Prize card left, this attack does 10 damage plus 50 more damage and the Defending Pokémon is now Confused."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRAPION_E4_17:
			return basic (this, hp:HP100, type:DARKNESS, retreatCost:3) {
				weakness F
				resistance P, MINUS20
				move "Body Slam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Impact", {
					text "70 damage. "
					energyCost P, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ESPEON_E4_18:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psywave", {
					text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAREON_19:
			return evolution (this, from:"Eevee", hp:HP080, type:FIRE, retreatCost:1) {
				weakness W, PLUS20
				pokePower "Undevelop", {
					text "Once during your turn , you may devolve Flareon and put Flareon into your hand. This power can’t be used if Flareon is affected by a Special Condition."
					actionA {
					}
				}
				move "Tail Slap", {
					text "30 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Evolving Flare", {
					text "40+ damage. If Flareon evolved from Eevee during this turn, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GALLADE_E4_20:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Chop Up", {
					text "20 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Feint", {
					text "50 damage. This attack’s damage isn’t affected by Resistance."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTRODON_EAST_SEA_21:
			return evolution (this, from:"Shellos East Sea", hp:HP090, type:WATER, retreatCost:1) {
				weakness G
				resistance L, MINUS20
				pokeBody "Sticky Hold", {
					text "If Gastrodon East Sea is switched or retreats to your Bench, move as many Energy cards attached to Gastrodon East Sea as you like to the new Active Pokémon."
					delayedA {
					}
				}
				move "Calling Wave", {
					text "Search your deck for up to 2 Gastrodon and put them onto your Bench as Basic Pokémon. Put 2 damage counters on each of them. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wave Splash", {
					text "40 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTRODON_WEST_SEA_22:
			return evolution (this, from:"Shellos West Sea", hp:HP110, type:FIGHTING, retreatCost:3) {
				weakness G
				resistance L, MINUS20
				move "Tackle", {
					text "50 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Muddy Bomb", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon and 10 damage to each of your opponent’s other Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Raging Sea", {
					text "60+ damage. Does 60 damage plus 10 more damage for each of your Benched Pokémon that has any damage counters on it."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLEM_E4_23:
			return basic (this, hp:HP110, type:FIGHTING, retreatCost:4) {
				weakness G
				resistance L, MINUS20
				move "Rage", {
					text "20+ damage. ."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double-edge", {
					text "100 damage. does 60 damage to itself."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERACROSS_E4_24:
			return basic (this, hp:HP090, type:GRASS, retreatCost:2) {
				weakness R
				move "", {
					text "During damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Megahorn", {
					text "50 damage. Flip a coin. If tails, this attack does nothing."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HIPPOWDON_25:
			return evolution (this, from:"Hippopotas", hp:HP110, type:FIGHTING, retreatCost:4) {
				weakness W, PLUS20
				resistance L, MINUS20
				pokeBody "Sand Cover", {
					text "As long as Hippowdon is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon LV. between turns."
					delayedA {
					}
				}
				move "Save Sand", {
					text "20+ damage. Energy card and attach it to Hippowdon."
					energyCost C, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Groundquake", {
					text "80 damage. . (Don’t apply Weakness and Resistance for Benched Pokémon)."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JOLTEON_26:
			return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS20
				resistance M, MINUS20
				pokePower "Undevelop", {
					text "Once during your turn , you may devolve Jolteon and put Jolteon into your hand. This power can’t be used if Jolteon is affected by a Special Condition."
					actionA {
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Evolving Thunder", {
					text "50 damage. If Jolteon evolved from Eevee during this turn, this attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAMOSWINE_GL_27:
			return basic (this, hp:HP100, type:WATER, retreatCost:2) {
				weakness M
				resistance L, MINUS20
				pokeBody "Icy Aura", {
					text "As long as Mamoswine is your Active Pokémon, put 1 damage counter on each Active Pokémon (excluding Pokémon) between turns."
					delayedA {
					}
				}
				move "Avalanche", {
					text "60 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_E4_28:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Magic Heal", {
					text "Flip 3 coins. Remove a number of damage counters equal to the number of heads from your Pokémon in any way you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Barrier Attack", {
					text "30 damage. ."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOKING_29:
			return evolution (this, from:"Nidorino", hp:HP130, type:FIGHTING, retreatCost:2) {
				weakness W, PLUS30
				resistance L, MINUS20
				pokeBody "Territoriality", {
					text "If your Active Pokémon is damaged by an opponent’s attack , put 2 damage counters on the Attacking Pokémon. You can’t put more than 2 damage counters in this way."
					delayedA {
					}
				}
				move "Fling Away", {
					text "60 damage. If your opponent has any Benched Pokémon, this attack’s base damage is 30 instead of 60 and this attack does 30 damage to 1 of your opponent’s Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Giga Horn", {
					text "100 damage. Flip 2 coins. If both of them are tails, this attack does nothing."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOQUEEN_30:
			return evolution (this, from:"Nidorina", hp:HP120, type:PSYCHIC, retreatCost:3) {
				weakness P, PLUS30
				resistance L, MINUS20
				pokeBody "Maternal Comfort", {
					text "At any times between turns, remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Maternal Comfort Poké-Body between turns."
					delayedA {
					}
				}
				move "Mega Punch", {
					text "40 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ruthless Tail", {
					text "50+ damage. Does 50 damage plus 10 more damage for each of your opponent’s Benched Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU_GL_31:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:0) {
				weakness F
				resistance M, MINUS20
				move "Thunder Throw", {
					text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Repeat Lightning", {
					text "30+ damage. Does 30 damage plus 10 more damage for each of your opponent’s Benched Pokémon that has any damage counters on it."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RHYPERIOR_E4_32:
			return basic (this, hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness W
				resistance L, MINUS20
				move "Double Lariat", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rock Tumble", {
					text "60 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_33:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
				weakness F
				move "Pick and Collect", {
					text "Search your discard pile for up to 4 basic Energy cards, show them to your opponent, and put them into your hand."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Roll Over", {
					text "60 damage. Flip a coin. If heads, both Snorlax and the Defending Pokémon are now Asleep. If tails, Snorlax is now Asleep."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VAPOREON_34:
			return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:2) {
				weakness L, PLUS20
				pokePower "Undevelop", {
					text "Once during your turn , you may devolve Vaporeon and put Vaporeon into your hand. This power can’t be used if Vaporeon is affected by a Special Condition."
					actionA {
					}
				}
				move "Muddy Water", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Evolving Aqua", {
					text "If Vaporeon evolved from Eevee during this turn, this attack does 60 damage instead."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VESPIQUEN_E4_35:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokeBody "Royal Gain", {
					text "When you attach a Energy card from your hand to Vespiquen 4, remove 1 damage counter from Vespiquen 4."
					delayedA {
					}
				}
				move "Leaf Needle", {
					text "30+ damage. Energy attached to Vespiquen 4. This attack does 30 damage plus 20 more damage for each heads."
					energyCost C, C, C, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WALREIN_36:
			return evolution (this, from:"Sealeo", hp:HP140, type:WATER, retreatCost:4) {
				weakness M, PLUS30
				pokePower "Gather Ice", {
					text "Once during your turn , when you play Walrein from your hand to evolve 1 of your Pokémon, you may as many Energy cards from your hand to Walrein as you like."
					actionA {
					}
				}
				move "Cold Crush", {
					text "70 damage. Discard an Energy card attached to Walrein and then discard an Energy attached to the Defending Pokémon."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMEGA_E4_37:
			return basic (this, hp:HP090, type:GRASS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Skill Dive", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Whirlwind", {
					text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ALAKAZAM_E4_38:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Recover", {
					text "Energy attached to Alakazam and remove 4 damage counters from Alakazam ."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mysterious Beam", {
					text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_G_39:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Reckless Bomb", {
					text "does 100 damage to itself."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Reflect Energy", {
					text "30 damage. to 1 of your Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_GL_40:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Confuse Ray", {
					text "10 damage. The Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Attack and Hide", {
					text "and all cards attached to it back into your deck."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLACEON_41:
			return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
				weakness M, PLUS20
				pokeBody "Frost Wind", {
					text "As long as Glaceon is your Active Pokémon, any damage done to your Pokémon by your opponent’s attacks is reduced by 10 ."
					delayedA {
					}
				}
				move "Ice Blade", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ice Bind", {
					text "50 damage. If your opponent doesn’t discard a card from his or her hand, the Defending Pokémon is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HIPPOWDON_E4_42:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
				weakness W
				resistance L, MINUS20
				pokeBody "Sand Armor", {
					text "If Hippowdon 4 has any Energy attached to it, any damage done to Hippowdon 4 by attacks is reduced by 10 ."
					delayedA {
					}
				}
				move "Bite and Crush", {
					text "30+ damage. Flip 2 coins. This attack does 30 damage plus 10 more damage for each heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case INFERNAPE_E4_43:
			return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
				weakness W
				move "Split Bomb", {
					text "Choose 2 of your opponent’s Pokémon. This attack does 20 damage to each of them."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "High Jump Kick", {
					text "50 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LAIRON_44:
			return evolution (this, from:"Aron", hp:HP080, type:METAL, retreatCost:2) {
				weakness R, PLUS20
				resistance P, MINUS20
				move "Heavy Metal", {
					text "10+ damage. Energy attached to Lairon. This attack does 10 damage plus 20 more damage for each heads."
					energyCost C, C, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Granite Head", {
					text "40 damage. ."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LEAFEON_45:
			return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				resistance W, MINUS20
				pokeBody "Energy Refresh", {
					text "As long as Leafeon is your Active Pokémon, whenever you attach an Energy card from your hand to 1 of your Pokémon, remove 2 damage counters from that Pokémon."
					delayedA {
					}
				}
				move "Plus Energy", {
					text "40 damage. Attach a basic Energy card from your hand to 1 of your Pokémon."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Soothing Scent", {
					text "60 damage. The Defending Pokémon is now Asleep."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHAMP_GL_46:
			return basic (this, hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness P
				move "Cross-Cut", {
					text "30+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 30 damage plus 20 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Brush Off", {
					text "Put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward. (If your opponent doesn’t have any Benched Pokémon, this attack does nothing.)"
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_E4_47:
			return basic (this, hp:HP070, type:FIRE, retreatCost:0) {
				weakness W
				move "Pickup Power", {
					text "Flip 3 coins. For each heads, search your discard pile for a basic Energy card, show it to your opponent, and put it into your hand."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Mane", {
					text "20 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SCIZOR_E4_48:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Cut", {
					text "20 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Crushing Blow", {
					text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHARPEDO_49:
			return evolution (this, from:"Carvanha", hp:HP090, type:DARKNESS, retreatCost:0) {
				weakness L, PLUS20
				resistance P, MINUS20
				pokeBody "Energy Shark", {
					text "If Sharpedo is your Active Pokémon and is damaged by an opponent’s attack , flip a coin. If heads, discard an Energy card attached to the Attacking Pokémon."
					delayedA {
					}
				}
				move "Crunch", {
					text "20 damage. , that attack does 40 more damage to that Pokémon until the end of your next turn."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sharp Fang", {
					text "60 damage. "
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARMIE_50:
			return evolution (this, from:"Staryu", hp:HP080, type:WATER, retreatCost:0) {
				weakness L, PLUS20
				pokePower "Aqua Recycle", {
					text "Once during your turn , you may search your discard pile for a Energy card, show it to your opponent, and put it into your hand. This power can’t be used if Starmie is affected by a Special Condition."
					actionA {
					}
				}
				move "Synchro Gain", {
					text "20 damage. If Starmie and the Defending Pokémon have the same amount of Energy attached to them, remove 4 damage counters from Starmie."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Powerful Spin", {
					text "40 damage. Starmie can’t attack during your next turn."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STEELIX_GL_51:
			return basic (this, hp:HP110, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Mend", {
					text "Energy card and attach it to Steelix . If you do, remove 1 damage counter from Steelix ."
					energyCost C, C, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Squeeze", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 50 more damage and the Defending Pokémon is now Paralyzed."
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPIUS_52:
			return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				resistance F, MINUS20
				move "Fly", {
					text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Tropius during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Blessed Fruit", {
					text "Pokémon."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Solarbeam", {
					text "60 damage. "
					energyCost G, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VIBRAVA_53:
			return evolution (this, from:"Trapinch", hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS20
				resistance L, MINUS20
				move "Energy Typhoon", {
					text "20× damage. Does 20 damage times the number of Energy cards in your opponent’s discard pile. Then, put those Energy cards on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WHISCASH_E4_54:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness G
				resistance L, MINUS20
				move "Sleep Pulse", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Earthquake", {
					text "60 damage. Does 10 damage to each of your Benched Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AERODACTYL_GL_55:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:0) {
				weakness L
				resistance F, MINUS20
				move "Collect", {
					text "Draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Primal Breath", {
					text "30 damage. Your opponent can’t play any Pokémon from his or her hand to Evolve or to Level Up the Defending Pokémon during his or her next turn."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AMBIPOM_G_56:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Tail Code", {
					text "Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Snap Attack", {
					text "60 damage. If the Defending Pokémon has any Energy cards attached to it, this attack’s base damage is 20 instead of 60."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARON_57:
			return basic (this, hp:HP050, type:METAL, retreatCost:1) {
				weakness R, PLUS10
				resistance P, MINUS20
				move "Iron Head", {
					text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ram", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARVANHA_58:
			return basic (this, hp:HP040, type:DARKNESS, retreatCost:1) {
				weakness L, PLUS10
				resistance P, MINUS20
				move "Scary Face", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Whirlpool", {
					text "10 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EEVEE_59:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Signs of Evolution", {
					text "Search your deck for up to 2 cards that evolve from Eevee, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bounce", {
					text "10 damage. Switch Eevee with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAREON_E4_60:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness W
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Tail Slap", {
					text "40 damage. Energy attached to Flareon ."
					energyCost R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FORRETRESS_G_61:
			return basic (this, hp:HP080, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Shell Scatter", {
					text "can’t use Shell Scatter during your next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bomb Risk", {
					text "80 damage. does 80 damage to itself."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLISCOR_E4_62:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance F, MINUS20
				move "Irongrip", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Loaded Needle", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage. If tails, the Defending Pokémon is now Poisoned."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROWLITHE_63:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness W, PLUS20
				move "Stoke", {
					text "Energy card and attach it to Growlithe. Shuffle your deck afterward."
					energyCost C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Take Down", {
					text "50 damage. Growlithe does 10 damage to itself."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HIPPOPOTAS_64:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
				weakness W, PLUS10
				resistance L, MINUS20
				move "Push Down", {
					text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Endeavor", {
					text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOUNDOOM_E4_65:
			return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Corner", {
					text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Fang", {
					text "40 damage. The Defending Pokémon is now Burned."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KAKUNA_66:
			return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				pokeBody "Exoskeleton", {
					text "Any damage done to Kakuna by attacks is reduced by 20 ."
					delayedA {
					}
				}
				move "Dangerous Evolution", {
					text "The Defending Pokémon is now Poisoned. Flip a coin. If heads, search your deck for an Evolution card that evolves from Kakuna and put it onto Kakuna. (This counts as evolving Kakuna.) Shuffle your deck afterward."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KECLEON_67:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				pokeBody "Colorful Body", {
					text "Kecleon’s type is ."
					delayedA {
					}
				}
				move "Triple Smash", {
					text "10+ damage. Flip 3 coins. This attack does 10 damage plus 20 more damage for each heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING_68:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS10
				move "Offensive Gas", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gas Bomb", {
					text "30 damage. Koffing does 30 damage to itself, and don’t apply Weakness and Resistance to this damage."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MUNCHLAX_69:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
				weakness F
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
					actionA {
					}
				}
				move "Rest", {
					text "Remove all Special Conditions and 6 damage counters from Munchlax. Munchlax is now Asleep."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MUNCHLAX_70:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
				weakness F
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
					actionA {
					}
				}
				move "Errand-Running", {
					text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_FEMALE_71:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Scratch", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Get Help", {
					text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_MALE_72:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Leer", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Horn Hazard", {
					text "40 damage. Flip a coin. If tails, this attack does nothing."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINA_73:
			return evolution (this, from:"Nidoran Female", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS20
				move "Jump Tackle", {
					text "30 damage. Nidorina does 10 damage to itself, and don’t apply Weakness and Resistance to this damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stress Poison", {
					text "40+ damage. If Nidorina has any damage counters on it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Poisoned."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINO_74:
			return evolution (this, from:"Nidoran Male", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS20
				move "Toxic", {
					text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Frustration", {
					text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 40 damage to that Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NUZLEAF_75:
			return evolution (this, from:"Seedot", hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness F, PLUS20
				resistance P, MINUS20
				move "Blind", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Feint Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QUAGSIRE_GL_76:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness G
				resistance L, MINUS20
				pokeBody "Submerge", {
					text "As long as Quagsire is on your Bench, prevent all damage done to Quagsire by attacks ."
					delayedA {
					}
				}
				move "Punch and Run", {
					text "40 damage. with 1 of your Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEALEO_77:
			return evolution (this, from:"Spheal", hp:HP080, type:WATER, retreatCost:2) {
				weakness M, PLUS20
				move "Find Ice", {
					text "Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sheer Cold", {
					text "20 damage. Flip a coin. If heads, each Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEEDOT_78:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Harden", {
					text "During your opponent’s next turn, if Seedot would be damaged by an attack, prevent that attack’s damage done to Seedot if that damage is 40 or less."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Astonish", {
					text "10 damage. Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELLOS_EAST_SEA_79:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness G, PLUS10
				move "Ripple", {
					text "Flip a coin. If heads, put 1 damage counter on each of your opponent’s Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Brine", {
					text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 20 damage to that Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELLOS_WEST_SEA_80:
			return basic (this, hp:HP070, type:WATER, retreatCost:2) {
				weakness G, PLUS20
				move "Healing Sea", {
					text "Flip 2 coins. Choose 1 of your Pokémon. For each heads, remove 1 damage counter from that Pokémon."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mud Shot", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_81:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
				weakness F
				pokeBody "Bad Sleeping Habits", {
					text "As long as Snorlax is Asleep, your opponent’s Active Pokémon can’t retreat."
					delayedA {
					}
				}
				move "Toss and Turn", {
					text "20+ damage. If Snorlax is Asleep, this attack does 20 damage plus 30 more damage. (This attack can be used even if Snorlax is Asleep)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Press", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 40 more damage. If tails, Snorlax is now Asleep."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPHEAL_82:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness M, PLUS10
				move "Powder Snow", {
					text "The Defending Pokémon is now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ice Ball", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARYU_83:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Cosmic Draw", {
					text "If your opponent has any Evolved Pokémon in play, draw 3 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "10 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TRAPINCH_84:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS10
				resistance L, MINUS20
				pokePower "Gather Sand", {
					text "Once during your turn , if Trapinch is your Active Pokémon, you may search your discard pile for a basic card and attach it to Trapinch."
					actionA {
					}
				}
				move "Grind", {
					text "10× damage. Does 10 damage times the amount of Energy attached to Trapinch."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TURTWIG_GL_85:
			return basic (this, hp:HP090, type:GRASS, retreatCost:3) {
				weakness R
				resistance W, MINUS20
				pokeBody "Overgrow", {
					text "As long as Turtwig ‘s remaining HP is 60 or less, each of Turtwig ‘s attacks does 30 more damage to the Defending Pokémon ."
					delayedA {
					}
				}
				move "Giga Drain", {
					text "30 damage. the number of damage counters equal to the damage you did to the Defending Pokémon."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEDLE_86:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				move "Rescue String", {
					text "Search your discard pile for up to 5 Pokémon, show them to your opponent, and shuffle them into your deck."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Needling Sting", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEZING_87:
			return evolution (this, from:"Koffing", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS20
				move "", {
					text "If Weezing is Confused and is Knocked Out, your opponent can’t take a Prize card."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Damage Breakdown", {
					text "Count the number of damage counters on Weezing. Put that many damage counters on the Defending Pokémon and Weezing is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smog", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AARON_S_COLLECTION_88:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for up to 2 in any combination of Pokémon SP and basic Energy cards, show them to your opponent, and put them into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case BEBE_S_SEARCH_89:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose a card from your hand and put it on top of your deck. Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case BERTHA_S_WARMTH_90:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nRemove 5 damage counters from 1 of your Pokémon SP."
				onPlay {
				}
				playRequirement{
				}
			};
			case FLINT_S_WILLPOWER_91:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nAttach a basic Energy card from your hand to 1 of your Pokémon SP."
				onPlay {
				}
				playRequirement{
				}
			};
			case LUCIAN_S_ASSIGNMENT_92:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nMove as many Energy cards attached to 1 of your Pokémon as you like to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_CONTEST_HALL_93:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, if that player’s Bench isn’t full, the player may flip a coin. If heads, that player searches his or her deck for a Basic Pokémon and puts it onto his or her Bench. If the player does, he or she may search his or her deck for a Pokémon Tool card and attach it to that Pokémon. If that player searched his or her deck, the player shuffles his or her deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case SUNYSHORE_CITY_GYM_94:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nAny damage done by attacks from [L] Pokémon (both yours and your opponent’s) to the Defending Pokémon isn’t affected by Resistance. Each [L] Pokémon in play (both yours and your opponent’s) has no Weakness."
				onPlay {
				}
				playRequirement{
				}
			};
			case TECHNICAL_MACHINE_G_95:
			return basicTrainer (this) {
				text "Attach this card to 1 of your Pokémon SP in play. That Pokémon may use this card’s attack instead of its own. When the Pokémon this card is attached to is no longer Pokémon SP, discard this card.\n[C][C][C] Damage Porter Choose 1 of your opponent’s Pokémon. This attack does 10 damage times the number of damage counters on the Pokémon this card is attached to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case SP_RADAR_96:
			return basicTrainer (this) {
				text "Choose a card from your hand and put it on top of your deck. Search your deck for a Pokémon SP, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case UNDERGROUND_EXPEDITION_97:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the 4 cards from the bottom of your deck. Choose any 2 cards there and put them into your hand. Put the remaining cards back on the bottom of your deck in any order."
				onPlay {
				}
				playRequirement{
				}
			};
			case VOLKNER_S_PHILOSOPHY_98:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nYou may discard a card from your hand. Then, draw cards until you have 6 cards in your hand. (If you can’t draw any cards, you can’t play this card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_99:
			return specialEnergy (this, [[C]]) {
				text "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect if the Pokémon that Darkness Energy is attached to isn’t [D]. Darkness Energy provides [D] Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case METAL_ENERGY_100:
			return specialEnergy (this, [[C]]) {
				text "Damage done by attacks to the Pokémon that Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that Metal Energy is attached to isn’t [M]. Metal Energy provides [M] Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case SP_ENERGY_101:
			return specialEnergy (this, [[C]]) {
				text "SP Energy provides [C] Energy. While attached to a Pokémon SP, SP Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case UPPER_ENERGY_102:
			return specialEnergy (this, [[C]]) {
				text "Upper Energy provides [C] Energy. If you have more Prize cards left than your opponent and this card is attached to a Pokémon (excluding Pokémon LV.X), Upper Energy provides [C][C]."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case ALAKAZAM_E4_LV_X_103:
			return evolution (this, from:"Alakazam 4", hp:HP100, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokePower "Damage Switch", {
					text "As often as you like during your turn , you may move 1 damage counter from 1 of your Pokémon to another of your Pokémon . This power can’t be used if Alakazam 4 is affected by a Special Condition."
					actionA {
					}
				}
				move "Mind Shock", {
					text "50 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Alakazam 4. Alakazam LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLOATZEL_GL_LV_X_104:
			return evolution (this, from:"Floatzel GL", hp:HP100, type:WATER, retreatCost:0) {
				weakness L
				pokeBody "Water Rescue", {
					text "Whenever any of your Pokémon (excluding any Floatzel) is Knocked Out by damage from your opponent’s attack, you may put that Pokémon and all cards that were attached to it from your discard pile into your hand."
					delayedA {
					}
				}
				move "Energy Cyclone", {
					text "20× damage. Choose as many Energy cards from your hand as you like and show them to your opponent. This attack does 20 damage times the number of Energy cards you chose. Put those Energy cards on top of your deck. Shuffle your deck afterward."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Floatzel . Floatzel LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLYGON_LV_X_105:
			return evolution (this, from:"Flygon", hp:HP140, type:COLORLESS, retreatCost:0) {
				weakness C
				resistance L, MINUS20
				pokeBody "Wind Erosion", {
					text "As long as Flygon is your Active Pokémon, discard the top card from your opponent’s deck between turns."
					delayedA {
					}
				}
				move "Extreme Attack", {
					text ". This attack does 150 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Flygon. Flygon LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GALLADE_E4_LV_X_106:
			return evolution (this, from:"Gallade 4", hp:HP100, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "Blade Storm", {
					text "Once during your turn , when you put Gallade LV. from your hand onto your Active Gallade , you may put 1 damage counter on each of your opponent’s Pokémon."
					actionA {
					}
				}
				move "Aimed Cut", {
					text "40+ damage. Does 40 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Gallade 4. Gallade LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HIPPOWDON_LV_X_107:
			return evolution (this, from:"Hippowdon", hp:HP130, type:FIGHTING, retreatCost:4) {
				weakness W
				resistance L, MINUS20
				pokePower "Sand Reset", {
					text "Once during a game on your turn , each player shuffles all cards in play (excluding Pokémon and Supporter cards) into his or her deck. You can’t use more than 1 Sand Reset Poké-Power each game."
					actionA {
					}
				}
				move "Double Shoot", {
					text "Discard 2 Energy attached to Hippowdon and choose 2 of your opponent’s Benched Pokémon. This attack does 40 damage to each of them."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Hippowdon. Hippowdon LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case INFERNAPE_E4_LV_X_108:
			return evolution (this, from:"Infernape 4", hp:HP110, type:FIRE, retreatCost:0) {
				weakness W
				pokePower "Intimidating Roar", {
					text "Once during your turn , you may have your opponent switch his or her Active Pokémon with one of his or her Benched Pokémon. This power can’t be used if Infernape 4 is affected by a Special Condition."
					actionA {
					}
				}
				move "Fire Spin", {
					text "100 damage. Discard 2 Energy attached to Infernape 4."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Infernape 4. Infernape LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXRAY_GL_LV_X_109:
			return evolution (this, from:"Luxray GL", hp:HP110, type:LIGHTNING, retreatCost:0) {
				weakness F
				resistance M, MINUS20
				move "", {
					text ", you may switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flash Impact", {
					text "60 damage. Does 30 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Luxray . Luxray LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MISMAGIUS_GL_LV_X_110:
			return evolution (this, from:"Mismagius GL", hp:HP100, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				pokePower "Magical Return", {
					text "As often as you like during your turn , you may return a Pokémon Tool or Technical Machine card attached to your Pokémon to your hand. This power can’t be used if Mismagius is affected by a Special Condition."
					actionA {
					}
				}
				move "Darkness Magic", {
					text "Count the number of cards in your hand. Put that many damage counters on the Defending Pokémon. You can’t put more than 8 damage counters in this way."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Mismagius . Mismagius LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_LV_X_111:
			return evolution (this, from:"Snorlax", hp:HP130, type:COLORLESS, retreatCost:4) {
				weakness F
				pokePower "Big Appetite", {
					text "Once during your turn , if Snorlax is your Active Pokémon, you may draw cards until you have 6 cards in your hand. If you do, Snorlax is now Asleep. This power can’t be used if Snorlax is affected by a Special Condition."
					actionA {
					}
				}
				move "Exercise", {
					text "80 damage. You may discard as many Energy cards as you like from your hand. If you do, remove that many damage counters from Snorlax."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Snorlax. Snorlax LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_112:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness F
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLYING_PIKACHU_113:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				resistance F, MINUS30
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fly", {
					text "30 damage. ."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SURFING_PIKACHU_114:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				move "Surf", {
					text "30 damage. "
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FAN_ROTOM_RT1:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:0) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Fan Shift", {
					text "Once during your turn , you may use this power. Fan Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Spin Storm", {
					text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Air Slash", {
					text "60 damage. Flip a coin. If tails, discard an Energy attached to Fan Rotom."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FROST_ROTOM_RT2:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:3) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Frost Shift", {
					text "Once during your turn , you may use this power. Frost Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Hail", {
					text "This attack does 10 damage to each of your opponent’s Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Crushing Ice", {
					text "40+ damage. Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HEAT_ROTOM_RT3:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Heat Shift", {
					text "Once during your turn , you may use this power. Heat Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Warm Up", {
					text "Energy card and attach it to 1 of your Benched Pokémon. Shuffle your deck afterward."
					energyCost C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heat Burn", {
					text "40 damage. The Defending Pokémon is now Burned."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MOW_ROTOM_RT4:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Mow Shift", {
					text "Once during your turn , you may use this power. Mow Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Slash", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mow Down", {
					text "50 damage. Flip a coin. If heads, discard an Energy card attached to each of your opponent’s Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WASH_ROTOM_RT5:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Wash Shift", {
					text "Once during your turn , you may use this power. Wash Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Cleanse Away", {
					text "Remove 3 damage counters from each of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Drain Wash", {
					text "30 damage. Flip a coin until you get tails. For each heads, choose 1 card from your opponent’s hand without looking and discard it."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARON_S_CHOICE_RT6:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for any Rotom and switch it with any Rotom you have in play. Any cards attached to Rotom and damage counters on it are now on the new Pokémon. (Remove all Special Conditions and effects from Rotom.) Put Rotom on top of your deck. Shuffle your deck afterward."
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
