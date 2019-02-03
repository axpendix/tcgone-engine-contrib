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
public enum CallOfLegends implements CardInfo {

	CLEFABLE_1 ("Clefable", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DEOXYS_2 ("Deoxys", 2, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	DIALGA_3 ("Dialga", 3, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
	ESPEON_4 ("Espeon", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	FORRETRESS_5 ("Forretress", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	GROUDON_6 ("Groudon", 6, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	GYARADOS_7 ("Gyarados", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	HITMONTOP_8 ("Hitmontop", 8, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	HO_OH_9 ("Ho-Oh", 9, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	HOUNDOOM_10 ("Houndoom", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	JIRACHI_11 ("Jirachi", 11, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	KYOGRE_12 ("Kyogre", 12, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	LEAFEON_13 ("Leafeon", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	LUCARIO_14 ("Lucario", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	LUGIA_15 ("Lugia", 15, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	MAGMORTAR_16 ("Magmortar", 16, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	NINETALES_17 ("Ninetales", 17, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	PACHIRISU_18 ("Pachirisu", 18, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	PALKIA_19 ("Palkia", 19, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	RAYQUAZA_20 ("Rayquaza", 20, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	SMEARGLE_21 ("Smeargle", 21, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	UMBREON_22 ("Umbreon", 22, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	AMPHAROS_23 ("Ampharos", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	CLEFFA_24 ("Cleffa", 24, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	FERALIGATR_25 ("Feraligatr", 25, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	GRANBULL_26 ("Granbull", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	MEGANIUM_27 ("Meganium", 27, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	MISMAGIUS_28 ("Mismagius", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	MR__MIME_29 ("Mr. Mime", 29, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	PIDGEOT_30 ("Pidgeot", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	SKARMORY_31 ("Skarmory", 31, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
	SLOWKING_32 ("Slowking", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	SNORLAX_33 ("Snorlax", 33, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	TANGROWTH_34 ("Tangrowth", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TYPHLOSION_35 ("Typhlosion", 35, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	TYROGUE_36 ("Tyrogue", 36, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	URSARING_37 ("Ursaring", 37, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	WEEZING_38 ("Weezing", 38, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	ZANGOOSE_39 ("Zangoose", 39, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	BAYLEEF_40 ("Bayleef", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	CROCONAW_41 ("Croconaw", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DONPHAN_42 ("Donphan", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	FLAAFFY_43 ("Flaaffy", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FLAREON_44 ("Flareon", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	JOLTEON_45 ("Jolteon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MAGBY_46 ("Magby", 46, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	MIME_JR__47 ("Mime Jr.", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	PIDGEOTTO_48 ("Pidgeotto", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	QUILAVA_49 ("Quilava", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	RIOLU_50 ("Riolu", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SEVIPER_51 ("Seviper", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	VAPOREON_52 ("Vaporeon", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	CHIKORITA_53 ("Chikorita", 53, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CLEFAIRY_54 ("Clefairy", 54, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	CYNDAQUIL_55 ("Cyndaquil", 55, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	EEVEE_56 ("Eevee", 56, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	HITMONCHAN_57 ("Hitmonchan", 57, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	HITMONLEE_58 ("Hitmonlee", 58, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	HOUNDOUR_59 ("Houndour", 59, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	KOFFING_60 ("Koffing", 60, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	MAGIKARP_61 ("Magikarp", 61, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAGMAR_62 ("Magmar", 62, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	MAREEP_63 ("Mareep", 63, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MAWILE_64 ("Mawile", 64, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	MISDREAVUS_65 ("Misdreavus", 65, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	PHANPY_66 ("Phanpy", 66, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PIDGEY_67 ("Pidgey", 67, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PINECO_68 ("Pineco", 68, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	RELICANTH_69 ("Relicanth", 69, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SLOWPOKE_70 ("Slowpoke", 70, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SNUBBULL_71 ("Snubbull", 71, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	TANGELA_72 ("Tangela", 72, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TEDDIURSA_73 ("Teddiursa", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	TOTODILE_74 ("Totodile", 74, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	VULPIX_75 ("Vulpix", 75, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	CHEERLEADER_S_CHEER_76 ("Cheerleader's Cheer", 76, Rarity.UNCOMMON, [TRAINER]),
	COPYCAT_77 ("Copycat", 77, Rarity.UNCOMMON, [TRAINER]),
	DUAL_BALL_78 ("Dual Ball", 78, Rarity.UNCOMMON, [TRAINER]),
	INTERVIEWER_S_QUESTIONS_79 ("Interviewer's Questions", 79, Rarity.UNCOMMON, [TRAINER]),
	LOST_REMOVER_80 ("Lost Remover", 80, Rarity.UNCOMMON, [TRAINER]),
	LOST_WORLD_81 ("Lost World", 81, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_ELM_S_TRAINING_METHOD_82 ("Professor Elm's Training Method", 82, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_OAK_S_NEW_THEORY_83 ("Professor Oak's New Theory", 83, Rarity.UNCOMMON, [TRAINER]),
	RESEARCH_RECORD_84 ("Research Record", 84, Rarity.UNCOMMON, [TRAINER]),
	SAGE_S_TRAINING_85 ("Sage's Training", 85, Rarity.UNCOMMON, [TRAINER]),
	DARKNESS_ENERGY_86 ("Darkness Energy", 86, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	METAL_ENERGY_87 ("Metal Energy", 87, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	GRASS_ENERGY_88 ("Grass Energy", 88, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIRE_ENERGY_89 ("Fire Energy", 89, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	WATER_ENERGY_90 ("Water Energy", 90, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	LIGHTNING_ENERGY_91 ("Lightning Energy", 91, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	PSYCHIC_ENERGY_92 ("Psychic Energy", 92, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIGHTING_ENERGY_93 ("Fighting Energy", 93, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	DARKNESS_ENERGY_94 ("Darkness Energy", 94, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	METAL_ENERGY_95 ("Metal Energy", 95, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	DEOXYS_SL1 ("Deoxys", SL1, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	DIALGA_SL2 ("Dialga", SL2, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
	ENTEI_SL3 ("Entei", SL3, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	GROUDON_SL4 ("Groudon", SL4, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	HO_OH_SL5 ("Ho-Oh", SL5, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	KYOGRE_SL6 ("Kyogre", SL6, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	LUGIA_SL7 ("Lugia", SL7, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	PALKIA_SL8 ("Palkia", SL8, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	RAIKOU_SL9 ("Raikou", SL9, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	RAYQUAZA_SL10 ("Rayquaza", SL10, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	SUICUNE_SL11 ("Suicune", SL11, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	CallOfLegends(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.CALL_OF_LEGENDS;
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
			case CLEFABLE_1:
			return evolution (this, from:"Clefairy", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Fairy Power", {
					text "Return 1 of your Pokémon and all cards attached to it in your hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Moon Impact", {
					text "40 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEOXYS_2:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Cell Storm", {
					text "60 damage. Energy attached to Deoxys and remove 6 damage counters from Deoxys."
					energyCost P, P, P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIALGA_3:
			return basic (this, hp:HP100, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Time Rewind", {
					text "70 damage. Shuffle your hand into your deck."
					energyCost M, M, M, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ESPEON_4:
			return evolution (this, from:"Eevee", hp:HP090, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Solar Suggestion", {
					text "Move up to 4 damage counters from any of your Pokémon to any of your opponent’s Pokémon in any way you like."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psybeam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FORRETRESS_5:
			return evolution (this, from:"Pineco", hp:HP090, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Mirror Shot", {
					text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, this attack does nothing."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Everyone Explode Now", {
					text "Does 30 damage times the number of Pineco and Forretress you have in play. This attack does 30 damage to each of your Pineco and Forretress in play."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROUDON_6:
			return basic (this, hp:HP100, type:FIGHTING, retreatCost:4) {
				weakness G
				move "Volcano Stomp", {
					text "80 damage. Flip a coin. If heads, discard the top 4 cards of your opponent’s deck. If tails, discard the top 4 cards of your deck."
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GYARADOS_7:
			return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:0) {
				weakness L
				resistance F, MINUS20
				move "Hydro Splash", {
					text "50 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Beam", {
					text "80 damage. Discard an Energy card attached to the Defending Pokémon."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONTOP_8:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Triple Kick", {
					text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Close Combat", {
					text "60 damage. ."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HO_OH_9:
			return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
				weakness W
				resistance F, MINUS20
				move "Combustion", {
					text "50 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scorching Wing", {
					text "100 damage. Energy attached to Ho-Oh."
					energyCost R, R, R, C, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOUNDOOM_10:
			return evolution (this, from:"Houndour", hp:HP090, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Fire Counterattack", {
					text "20+ damage. Pokémon in play, this attack does 20 damage plus 60 more damage."
					energyCost D, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dark Roar", {
					text "50 damage. Your opponent discards a card from his or her hand."
					energyCost D, D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIRACHI_11:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "Stardust Song", {
					text "Once during your turn, when you put Jirachi from your hand onto your Bench, you may flip 3 coins. For each heads, search your discard pile for a Energy card and attach it to Jirachi."
					actionA {
					}
				}
				move "Time Hollow", {
					text "Choose a number of your opponent’s Stage 1 or Stage 2 Evolved Pokémon up to the amount of Energy attached to Jirachi. Remove the highest Stage Evolution card from each of those Pokémon and put those cards back into your opponent’s hand."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KYOGRE_12:
			return basic (this, hp:HP100, type:WATER, retreatCost:4) {
				weakness L
				move "Destructive Tsunami", {
					text "Flip a coin. If heads, this attack does 40 damage to each of your opponent’s Pokémon. If tails, this attack does 40 damage to each of your Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LEAFEON_13:
			return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS20
				move "Miasma Wind", {
					text "50× damage. Does 50 damage times the number of Special Conditions affecting the Defending Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sooting Scent", {
					text "30 damage. The Defending Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUCARIO_14:
			return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Dimension Sphere", {
					text "30+ damage. Does 30 damage plus 20 more damage for each of your Pokémon in the Lost Zone."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sky Uppercut", {
					text "70 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUGIA_15:
			return basic (this, hp:HP100, type:WATER, retreatCost:3) {
				weakness L
				resistance F, MINUS20
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hydro Splash", {
					text "80 damage. "
					energyCost W, W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMORTAR_16:
			return evolution (this, from:"Magmar", hp:HP110, type:FIRE, retreatCost:2) {
				weakness W
				move "Hard Crush", {
					text "Discard the top 3 cards from your deck. This attack does 50 damage times the number of Energy cards you discarded."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mantle Bazooka", {
					text "100 damage. Energy attached to Magmortar."
					energyCost R, R, C, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NINETALES_17:
			return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:1) {
				weakness W
				pokePower "Roast Reveal", {
					text "Once during your turn , you may discard a Energy from your hand. If you do, draw 3 cards. This power can’t be used if Ninetales is affected by a Special Condition."
					actionA {
					}
				}
				move "Will-o’-the-wisp", {
					text "60 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PACHIRISU_18:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				pokePower "Self-Generation", {
					text "Once during your turn, when you put Pachirisu from your hand onto your Bench, you may attach up to 2 Energy cards from your hand to Pachirisu."
					actionA {
					}
				}
				move "Shocking Bolt", {
					text "50 damage. Put all Energy cards attached to Pachirisu in the Lost Zone."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PALKIA_19:
			return basic (this, hp:HP100, type:WATER, retreatCost:3) {
				weakness L
				move "Wormhole", {
					text "60 damage. Switch Palkia with 1 of your Benched Pokémon. Then, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_20:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
				weakness C
				resistance F, MINUS20
				move "Inferno Spear", {
					text "100 damage. Energy attached to Rayquaza."
					energyCost R, R, L, L, R, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SMEARGLE_21:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F
				pokePower "Portrait", {
					text "Once during your turn , if Smeargle is your Active Pokémon, you may look at your opponent’s hand. If you do, choose a Supporter card you find there and use the effect of that card as the effect of this power. This power can’t be used if Smeargle is affected by a Special Condition."
					actionA {
					}
				}
				move "Tail Rap", {
					text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UMBREON_22:
			return evolution (this, from:"Eevee", hp:HP090, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Moonlight Fang", {
					text "30 damage. During your opponent’s next turn, prevent all effects, including damage, done to Umbreon by attacks from your opponent’s Pokémon than has any Poké-Powers or Poké-Bodies."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Blow", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AMPHAROS_23:
			return evolution (this, from:"Flaaffy", hp:HP120, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Acceleration Bolt", {
					text "30 damage. Search your deck for up to 2 basic Energy cards and attach them to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder", {
					text "80 damage. Flip a coin. If tails, Ampharos does 20 damage to itself."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFFA_24:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Cleffa is Asleep, prevent all damage done to Cleffa by attacks."
					delayedA {
					}
				}
				move "Eeeeeeek", {
					text "Shuffle your hand into your deck, then draw 6 cards. Cleffa is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FERALIGATR_25:
			return evolution (this, from:"Croconaw", hp:HP130, type:WATER, retreatCost:2) {
				weakness G
				move "Spinning Tail", {
					text "This attack does 20 damage to each of your opponent’s Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Surf", {
					text "80 damage. "
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRANBULL_26:
			return evolution (this, from:"Snubbull", hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Timid Tackle", {
					text "50 damage. Granbull does 20 damage to itself. Switch Granbull with 1 of your Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Chomp", {
					text "40+ damage. Does 40 damage plus 10 more damage for each damage counter on Granbull."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEGANIUM_27:
			return evolution (this, from:"Bayleef", hp:HP130, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Sleep Powder", {
					text "30 damage. The Defending Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Giant Bloom", {
					text "60 damage. Remove 2 damage counters from Meganium."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MISMAGIUS_28:
			return evolution (this, from:"Misdreavus", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Sleeping Spell", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poltergeist", {
					text "30× damage. Look at your opponent’s hand. This attack does 30 damage times the number of Trainer, Supporter, and Stadium cards in your opponent’s hand."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_29:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "Trick Reveal", {
					text "Once during your turn , you may have both you and your opponent reveal your hands. This power can’t be used if Mr. Mime is affected by a Special Condition."
					actionA {
					}
				}
				move "Juggling", {
					text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOT_30:
			return evolution (this, from:"Pidgeotto", hp:HP120, type:COLORLESS, retreatCost:0) {
				weakness L
				resistance F, MINUS20
				move "Headwind", {
					text "20 damage. more."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKARMORY_31:
			return basic (this, hp:HP080, type:METAL, retreatCost:1) {
				weakness R
				resistance P, MINUS20
				move "Steel Coat", {
					text "Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost M, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Wing", {
					text "40 damage. "
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWKING_32:
			return evolution (this, from:"Slowpoke", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokePower "Second Sight", {
					text "Once during your turn , you may look at the top 3 cards of either player’s deck and put them back on top of that player’s deck in any order. This power can’t be used if Slowking is affected by a Special Condition."
					actionA {
					}
				}
				move "Psyshock", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_33:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
				weakness F
				move "Layabout", {
					text "Remove all damage counters from Snorlax. Snorlax can’t use Layabout during your next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Clomp Clomp Clobber", {
					text "80 damage. Put 1 Energy card attached to Snorlax in the Lost Zone."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGROWTH_34:
			return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:4) {
				weakness R
				resistance W, MINUS20
				move "Grind", {
					text "20× damage. Does 20 damage times the number of Energy attached to Tangrowth."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Plow Over", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, put 1 Energy card attached to the Defending Pokémon in the Lost Zone."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYPHLOSION_35:
			return evolution (this, from:"Quilava", hp:HP130, type:FIRE, retreatCost:1) {
				weakness W
				move "Magma Punch", {
					text "50 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Spin", {
					text "120 damage. Discard 2 Energy attached to Typhlosion."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYROGUE_36:
			return basic (this, hp:HP030, type:FIGHTING, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Tyrogue is Asleep, prevent all damage done to Tyrogue by attacks."
					delayedA {
					}
				}
				move "Mischievous Punch", {
					text "30 damage. This attack’s damage isn’t affected by Weakness or Resistance. Tyrogue is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case URSARING_37:
			return evolution (this, from:"Teddiursa", hp:HP100, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Confront", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cross Chop", {
					text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEZING_38:
			return evolution (this, from:"Koffing", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Super Poison Breath", {
					text "The Defending Pokémon is now Poisoned."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Explosion", {
					text "90 damage. Weezing does 90 damage to itself, and don’t apply Weakness to this damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZANGOOSE_39:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Swords Dance", {
					text "During you next turn, Zangoose’s Lost Claw attack’s base damage is 80."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lost Claw", {
					text "30 damage. Choose 1 card from your opponent’s hand without looking and put it in the Lost Zone."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAYLEEF_40:
			return evolution (this, from:"Chikorita", hp:HP090, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Hammer In", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "50 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CROCONAW_41:
			return evolution (this, from:"Totodile", hp:HP080, type:WATER, retreatCost:2) {
				weakness G
				move "Wave Splash", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Big Bite", {
					text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DONPHAN_42:
			return evolution (this, from:"Phanpy", hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness W
				resistance L, MINUS20
				move "Rock Hurl", {
					text "50 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Spin", {
					text "70× damage. Flip 2 coins. This attack does 70 damage times the number of heads."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAAFFY_43:
			return evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Thunder Spear", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance to that Pokémon.)"
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thundershock", {
					text "40 damage. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAREON_44:
			return evolution (this, from:"Eevee", hp:HP090, type:FIRE, retreatCost:1) {
				weakness W
				move "Flame Tail", {
					text "30 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "90 damage. Discard an Energy attached to Flareon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JOLTEON_45:
			return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
				weakness F
				resistance M, MINUS20
				move "Agility", {
					text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to Jolteon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mach Bolt", {
					text "70 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGBY_46:
			return basic (this, hp:HP030, type:FIRE, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Magby is Asleep, prevent all damage done to Magby by attacks."
					delayedA {
					}
				}
				move "Play with Fire", {
					text "The Defending Pokémon is now Burned. Magby is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MIME_JR__47:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Mime Jr. is Asleep, prevent all damage done to Mime Jr. by attacks."
					delayedA {
					}
				}
				move "Sleepy Lost", {
					text "Put the top card of your opponent’s deck in the Lost Zone. Mime Jr. is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOTTO_48:
			return evolution (this, from:"Pidgey", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Gust", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Twister", {
					text "30 damage. Flip 2 coins. If both of them are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QUILAVA_49:
			return evolution (this, from:"Cyndaquil", hp:HP080, type:FIRE, retreatCost:1) {
				weakness W
				move "Flare", {
					text "30 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "60 damage. Discard an Energy attached to Quilava."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RIOLU_50:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Tumble Over", {
					text "20 damage. Riolu can’t attack during your next turn."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEVIPER_51:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Poison Buildup", {
					text "Seviper is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Effect", {
					text "20+ damage. If Seviper is Poisoned, this attack does 20 damage plus 60 more damage and remove the Special Condition Poisoned from Seviper."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VAPOREON_52:
			return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				move "Spiral Drain", {
					text "20 damage. Remove 2 damage counters from Vaporeon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dual Splash", {
					text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHIKORITA_53:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS20
				move "Nap", {
					text "Remove 1 damage counter from Chikorita."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Reckless Charge", {
					text "30 damage. Chikorita does 10 damage to itself."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY_54:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Minimize", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CYNDAQUIL_55:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness W
				move "Fireworks", {
					text "20 damage. Energy attached to Cyndaquil."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EEVEE_56:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONCHAN_57:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Detect", {
					text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to Hitmonchan during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sky Uppercut", {
					text "30 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONLEE_58:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
				weakness P
				move "Kick", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "High Jump Kick", {
					text "60 damage. "
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOUNDOUR_59:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Jump On", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING_60:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Suffocating Gas", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP_61:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness L
				move "Splash", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMAR_62:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness W
				move "Live Coal", {
					text "10 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magma Punch", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAREEP_63:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Static Shock", {
					text "10 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAWILE_64:
			return basic (this, hp:HP060, type:METAL, retreatCost:1) {
				weakness R
				resistance P, MINUS20
				move "Selfish Draw", {
					text "Look at the top card of your deck. You may put it into your hand. If not, discard it and draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Destructive Jaw", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MISDREAVUS_65:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Mumble", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dual Draw", {
					text "Each player draws 3 cards."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PHANPY_66:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness W
				resistance L, MINUS20
				pokeBody "Ultra-Thick Skin", {
					text "As long as Phanpy has Energy attached to it, any damage done to Phanpy by attacks is reduced by 10 ."
					delayedA {
					}
				}
				move "Rock Smash", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEY_67:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Messenger", {
					text "Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle Pidgey and all cards attached to it back into your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Glide", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PINECO_68:
			return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
				weakness R
				move "Focus Energy", {
					text "During your next turn, Pineco’s Surprise Attack attack’s base damage is 80."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Surprise Attack", {
					text "40 damage. Flip a coin. If tails, this attack does nothing."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RELICANTH_69:
			return basic (this, hp:HP080, type:WATER, retreatCost:2) {
				weakness G
				move "Prehistoric Wisdom", {
					text "Choose a card from your hand and put it in the Lost Zone. Then, draw 3 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Granite Head", {
					text "30 damage. ."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWPOKE_70:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness L
				move "Whismy Tackle", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNUBBULL_71:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Roar", {
					text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sharp Fang", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGELA_72:
			return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Nutritional Support", {
					text "Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poisonpowder", {
					text "30 damage. The Defending Pokémon is now Poisoned."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TEDDIURSA_73:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Fake Tears", {
					text "Flip a coin. If heads, your opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn, and any damage done to Teddiursa by attack is reduced by 30 (after applying weakness and resistance)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOTODILE_74:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness L
				move "Aqua Tail", {
					text "30+ damage. Energy attached to Totodile. This attack does 30 damage plus 20 more damage for each heads."
					energyCost W, C, C, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VULPIX_75:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness W
				move "Singe", {
					text "Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ember", {
					text "30 damage. Energy attached to Vulpix."
					energyCost R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHEERLEADER_S_CHEER_76:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 3 cards. Your opponent may draw a card."
				onPlay {
				}
				playRequirement{
				}
			};
			case COPYCAT_77:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case DUAL_BALL_78:
			return basicTrainer (this) {
				text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. If you do, shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case INTERVIEWER_S_QUESTIONS_79:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the top 8 cards of your deck. Choose as many Energy cards as you like, show them to your opponent, and put them into your hand. Shuffle the other cards back into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case LOST_REMOVER_80:
			return basicTrainer (this) {
				text "Put 1 Special Energy card attached to 1 of your opponent’s Pokémon in the Lost Zone."
				onPlay {
				}
				playRequirement{
				}
			};
			case LOST_WORLD_81:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, if this player’s opponent has 6 or more Pokémon in the Lost Zone, the player may choose to win the game."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_ELM_S_TRAINING_METHOD_82:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_OAK_S_NEW_THEORY_83:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, draw 6 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case RESEARCH_RECORD_84:
			return basicTrainer (this) {
				text "Look at the top 4 cards of your deck and put as many of them as you like back on top of your deck in any order. Then, put the remaining cards on the bottom of your deck in any order."
				onPlay {
				}
				playRequirement{
				}
			};
			case SAGE_S_TRAINING_85:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the top 5 cards of your deck. Choose any 2 cards you find there and put them into your hand. Discard the other cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_86:
			return specialEnergy (this, [[C]]) {
				text "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this Effect if the Pokémon that Darkness Energy is attached to isn’t [D]. Darkness Energy provides [D] Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case METAL_ENERGY_87:
			return specialEnergy (this, [[C]]) {
				text "Damage done by attacks to the Pokémon that Metal Energy attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that Metal Energy is attached to isn’t Metal. Metal Energy provides Metal Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case GRASS_ENERGY_88:
			return basicEnergy (this, GRASS);
			case FIRE_ENERGY_89:
			return basicEnergy (this, FIRE);
			case WATER_ENERGY_90:
			return basicEnergy (this, WATER);
			case LIGHTNING_ENERGY_91:
			return basicEnergy (this, LIGHTNING);
			case PSYCHIC_ENERGY_92:
			return basicEnergy (this, PSYCHIC);
			case FIGHTING_ENERGY_93:
			return basicEnergy (this, FIGHTING);
			case DARKNESS_ENERGY_94:
			return basicEnergy (this, DARKNESS);
			case METAL_ENERGY_95:
			return basicEnergy (this, METAL);
			case DEOXYS_SL1:
			return copy (DEOXYS_2, this)
			/*basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Cell Storm", {
					text "60 damage. Energy attached to Deoxys and remove 6 damage counters from Deoxys."
					energyCost P, P, P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case DIALGA_SL2:
			return copy (DIALGA_3, this)
			/*basic (this, hp:HP100, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Time Rewind", {
					text "70 damage. Shuffle your hand into your deck."
					energyCost M, M, M, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case ENTEI_SL3:
			return basic (this, hp:HP090, type:FIRE, retreatCost:2) {
				weakness W
				pokeBody "Extreme Speed", {
					text "Entei’s Retreat Cost is Energy less for each Energy attached to Entei."
					delayedA {
					}
				}
				move "Wild Blaze", {
					text "70 damage. Discard the top 3 cards of your deck."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROUDON_SL4:
			return copy (GROUDON_6, this)
			/*basic (this, hp:HP100, type:FIGHTING, retreatCost:4) {
				weakness G
				move "Volcano Stomp", {
					text "80 damage. Flip a coin. If heads, discard the top 4 cards of your opponent’s deck. If tails, discard the top 4 cards of your deck."
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case HO_OH_SL5:
			return copy (HO_OH_9, this)
			/*basic (this, hp:HP100, type:FIRE, retreatCost:3) {
				weakness W
				resistance F, MINUS20
				move "Combustion", {
					text "50 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scorching Wing", {
					text "100 damage. Energy attached to Ho-Oh."
					energyCost R, R, R, C, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case KYOGRE_SL6:
			return copy (KYOGRE_12, this)
			/*basic (this, hp:HP100, type:WATER, retreatCost:4) {
				weakness L
				move "Destructive Tsunami", {
					text "Flip a coin. If heads, this attack does 40 damage to each of your opponent’s Pokémon. If tails, this attack does 40 damage to each of your Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case LUGIA_SL7:
			return copy (LUGIA_15, this)
			/*basic (this, hp:HP100, type:WATER, retreatCost:3) {
				weakness L
				resistance F, MINUS20
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hydro Splash", {
					text "80 damage. "
					energyCost W, W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PALKIA_SL8:
			return copy (PALKIA_19, this)
			/*basic (this, hp:HP100, type:WATER, retreatCost:3) {
				weakness L
				move "Wormhole", {
					text "60 damage. Switch Palkia with 1 of your Benched Pokémon. Then, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case RAIKOU_SL9:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				pokeBody "Extreme Speed", {
					text "Raikou’s Retreat Cost is less for each Energy attached to Raikou."
					delayedA {
					}
				}
				move "Raging Thunder", {
					text "70 damage. Does 20 damage to 1 of your Pokémon and don’t apply Weakness and Resistance to this damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_SL10:
			return copy (RAYQUAZA_20, this)
			/*basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
				weakness C
				resistance F, MINUS20
				move "Inferno Spear", {
					text "100 damage. Energy attached to Rayquaza."
					energyCost R, R, L, L, R, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case SUICUNE_SL11:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				pokeBody "Extreme Speed", {
					text "Suicune’s Retreat Cost is less for each Energy attached to Suicune."
					delayedA {
					}
				}
				move "Tsunami", {
					text "This attack does 20 damage to each of your opponent’s Pokémon."
					energyCost W, W, C
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
