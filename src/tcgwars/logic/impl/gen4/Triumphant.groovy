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
public enum Triumphant implements CardInfo {

	AGGRON_1 ("Aggron", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
	ALTARIA_2 ("Altaria", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	CELEBI_3 ("Celebi", 3, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	DRAPION_4 ("Drapion", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	MAMOSWINE_5 ("Mamoswine", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	NIDOKING_6 ("Nidoking", 6, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	PORYGON_Z_7 ("Porygon-Z", 7, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	RAPIDASH_8 ("Rapidash", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	SOLROCK_9 ("Solrock", 9, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	SPIRITOMB_10 ("Spiritomb", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	VENOMOTH_11 ("Venomoth", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VICTREEBEL_12 ("Victreebel", 12, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	AMBIPOM_13 ("Ambipom", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	BANETTE_14 ("Banette", 14, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	BRONZONG_15 ("Bronzong", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	CARNIVINE_16 ("Carnivine", 16, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	DITTO_17 ("Ditto", 17, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	DRAGONITE_18 ("Dragonite", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	DUGTRIO_19 ("Dugtrio", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ELECTIVIRE_20 ("Electivire", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	ELEKID_21 ("Elekid", 21, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	GOLDUCK_22 ("Golduck", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GRUMPIG_23 ("Grumpig", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	KRICKETUNE_24 ("Kricketune", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	LUNATONE_25 ("Lunatone", 25, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	MACHAMP_26 ("Machamp", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	MAGMORTAR_27 ("Magmortar", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	NIDOQUEEN_28 ("Nidoqueen", 28, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	PIDGEOT_29 ("Pidgeot", 29, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	SHARPEDO_30 ("Sharpedo", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	WAILORD_31 ("Wailord", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DRAGONAIR_32 ("Dragonair", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ELECTABUZZ_33 ("Electabuzz", 33, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	ELECTRODE_34 ("Electrode", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	HAUNTER_35 ("Haunter", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	KANGASKHAN_36 ("Kangaskhan", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	LAIRON_37 ("Lairon", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	LICKILICKY_38 ("Lickilicky", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	LUVDISC_39 ("Luvdisc", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	MACHOKE_40 ("Machoke", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	MAGBY_41 ("Magby", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	MAGMAR_42 ("Magmar", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	MAGNETON_43 ("Magneton", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MAROWAK_44 ("Marowak", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	NIDORINA_45 ("Nidorina", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	NIDORINO_46 ("Nidorino", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	PIDGEOTTO_47 ("Pidgeotto", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	PILOSWINE_48 ("Piloswine", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PORYGON2_49 ("Porygon2", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	TENTACRUEL_50 ("Tentacruel", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	UNOWN_51 ("Unown", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	WAILMER_52 ("Wailmer", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	WEEPINBELL_53 ("Weepinbell", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	YANMEGA_54 ("Yanmega", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	AIPOM_55 ("Aipom", 55, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	ARON_56 ("Aron", 56, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	BELLSPROUT_57 ("Bellsprout", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BRONZOR_58 ("Bronzor", 58, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	CARVANHA_59 ("Carvanha", 59, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	CUBONE_60 ("Cubone", 60, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DIGLETT_61 ("Diglett", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DRATINI_62 ("Dratini", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	GASTLY_63 ("Gastly", 63, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	ILLUMISE_64 ("Illumise", 64, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	KRICKETOT_65 ("Kricketot", 65, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	LICKITUNG_66 ("Lickitung", 66, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	MACHOP_67 ("Machop", 67, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MAGNEMITE_68 ("Magnemite", 68, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	NIDORAN_FEMALE_69 ("Nidoran Female", 69, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	NIDORAN_MALE_70 ("Nidoran Male", 70, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	PIDGEY_71 ("Pidgey", 71, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PONYTA_72 ("Ponyta", 72, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	PORYGON_73 ("Porygon", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PSYDUCK_74 ("Psyduck", 74, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHUPPET_75 ("Shuppet", 75, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SKORUPI_76 ("Skorupi", 76, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SPOINK_77 ("Spoink", 77, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SWABLU_78 ("Swablu", 78, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SWINUB_79 ("Swinub", 79, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	TENTACOOL_80 ("Tentacool", 80, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	VENONAT_81 ("Venonat", 81, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	VOLBEAT_82 ("Volbeat", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	VOLTORB_83 ("Voltorb", 83, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	YANMA_84 ("Yanma", 84, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BLACK_BELT_85 ("Black Belt", 85, Rarity.UNCOMMON, [TRAINER]),
	INDIGO_PLATEAU_86 ("Indigo Plateau", 86, Rarity.UNCOMMON, [TRAINER]),
	JUNK_ARM_87 ("Junk Arm", 87, Rarity.UNCOMMON, [TRAINER]),
	SEEKER_88 ("Seeker", 88, Rarity.UNCOMMON, [TRAINER]),
	TWINS_89 ("Twins", 89, Rarity.UNCOMMON, [TRAINER]),
	RESCUE_ENERGY_90 ("Rescue Energy", 90, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	ABSOL_PRIME_91 ("Absol Prime", 91, Rarity.ULTRARARE, [BASIC, POKEMON, _DARKNESS_]),
	CELEBI_PRIME_92 ("Celebi Prime", 92, Rarity.ULTRARARE, [BASIC, POKEMON, _GRASS_]),
	ELECTRODE_PRIME_93 ("Electrode Prime", 93, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	GENGAR_PRIME_94 ("Gengar Prime", 94, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	MACHAMP_PRIME_95 ("Machamp Prime", 95, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	MAGNEZONE_PRIME_96 ("Magnezone Prime", 96, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	MEW_PRIME_97 ("Mew Prime", 97, Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_]),
	YANMEGA_PRIME_98 ("Yanmega Prime", 98, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARKRAI_&_CRESSELIA_LEGEND_99 ("Darkrai & Cresselia LEGEND", 99, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
	DARKRAI_&_CRESSELIA_LEGEND_100 ("Darkrai & Cresselia LEGEND", 100, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
	PALKIA_&_DIALGA_LEGEND_101 ("Palkia & Dialga LEGEND", 101, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
	PALKIA_&_DIALGA_LEGEND_102 ("Palkia & Dialga LEGEND", 102, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
	ALPH_LITHOGRAPH_FOUR ("Alph Lithograph", FOUR, Rarity.HOLORARE, [TRAINER]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	Triumphant(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.TRIUMPHANT;
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
			return evolution (this, from:"Lairon", hp:HP140, type:METAL, retreatCost:4) {
				weakness R
				resistance P, MINUS20
				move "Second Strike", {
					text "40 damage. If the Defending Pokémon already has any damage counters on it, this attack does 40 damage plus 40 more damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Guard Claw", {
					text "60 damage. ."
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ALTARIA_2:
			return evolution (this, from:"Swablu", hp:HP090, type:COLORLESS, retreatCost:0) {
				weakness C
				resistance F, MINUS20
				move "Midnight Eyes", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stadium Power", {
					text "40 damage. If there is any Stadium card in play, this attack does 40 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CELEBI_3:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Future Sight", {
					text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Leaf Bind", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRAPION_4:
			return evolution (this, from:"Skorupi", hp:HP100, type:DARKNESS, retreatCost:3) {
				weakness F
				resistance P, MINUS20
				move "Toxic Fang", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Land Crush", {
					text "80 damage. "
					energyCost D, D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAMOSWINE_5:
			return evolution (this, from:"Piloswine", hp:HP140, type:WATER, retreatCost:4) {
				weakness M
				move "Icy Wind", {
					text "40 damage. The Defending Pokémon is now Asleep."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Snowstorm", {
					text "70 damage. Does 20 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOKING_6:
			return evolution (this, from:"Nidorino", hp:HP140, type:FIGHTING, retreatCost:3) {
				weakness W
				resistance L, MINUS20
				pokeBody "Pheromone Stamina", {
					text "Nidoking gets +20 HP for each Nidoqueen you have in play."
					delayedA {
					}
				}
				move "Venomous Horn", {
					text "80 damage. The Defending Pokémon is now Poisoned."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_Z_7:
			return evolution (this, from:"Porygon 2", hp:HP110, type:COLORLESS, retreatCost:2) {
				weakness F
				pokePower "Dimensional Transfer", {
					text "Once during your turn , you may flip a coin. If heads, search your discard pile for a Trainer card, show it to your opponent, and put it on top of your deck. This power can’t be used if Porygon-Z is affected by a Special Condition."
					actionA {
					}
				}
				move "Suspicious Beam ?", {
					text "80 damage. If Porygon-Z has no Rainbow Energy attached to it, Porygon-Z does 20 damage to itself and Porygon-Z is now Confused."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_8:
			return evolution (this, from:"Ponyta", hp:HP090, type:FIRE, retreatCost:1) {
				weakness W
				pokeBody "Fiery Spirit", {
					text "Rapidash can’t be confused."
					delayedA {
					}
				}
				move "Ring of Fire", {
					text "50 damage. The Defending Pokémon is now Burned and can’t retreat during your opponent’s next turn."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SOLROCK_9:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness G
				pokeBody "Heal Block", {
					text "If you have Lunatone in play, damage counters can’t be removed from any Pokémon . (Damage counters can still be moved.)"
					delayedA {
					}
				}
				move "Sun Flash", {
					text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPIRITOMB_10:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				resistance C, MINUS20
				pokePower "Spooky Whirlpool", {
					text "Once during your turn, when you put Spiritomb from you hand onto your Bench, you may use this power. Your opponent shuffles his or her hand into his or her deck and draws 6 cards."
					actionA {
					}
				}
				move "Color Tag", {
					text "type. Put 1 damage counter on each Pokémon your opponent has in play of the type you chose."
					energyCost P, G, R, W, L, P, F, D, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENOMOTH_11:
			return evolution (this, from:"Venonat", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				pokePower "Poison Moth Wind", {
					text "Once during your turn , you may flip a coin. If heads, your opponent’s Active Pokémon is now Poisoned. If tails, your Active Pokémon is now Poisoned. This power can’t be used if Venomoth is affected by a Special Condition."
					actionA {
					}
				}
				move "Stun Spore", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VICTREEBEL_12:
			return evolution (this, from:"Weepinbell", hp:HP110, type:GRASS, retreatCost:2) {
				weakness R
				pokeBody "Tangling Tendrils", {
					text "As long as Victreebel is your Active Pokémon, your opponent’s Active Pokémon’s Retreat Cost is more."
					delayedA {
					}
				}
				move "Acidic Drain", {
					text "30 damage. The Defending Pokémon is now Burned and Poisoned. Remove 3 damage counters from Victreebel."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AMBIPOM_13:
			return evolution (this, from:"Aipom", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Astonish", {
					text "20 damage. Choose 2 cards from your opponent’s hand without looking. Look at the cards you chose, then have your opponent shuffle those cards into his or her deck."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Spank", {
					text "60 damage. Discard 2 cards from your hand. (If you can’t discard 2 cards from your hand, this attack does nothing.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BANETTE_14:
			return evolution (this, from:"Shuppet", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Lost Crush", {
					text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent’s Pokémon and put it in the Lost Zone."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Breakdown", {
					text "Count the number of cards in your opponent’s hand. Put that many damage counters on the Defending Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZONG_15:
			return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Legend Ceremony", {
					text "Search your deck for both halves of a Pokémon LEGEND, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Reflect Energy", {
					text "30 damage. Move an Energy card attached to Bronzong to 1 of your Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARNIVINE_16:
			return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Saliva Lure", {
					text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stick and Absorb", {
					text "30 damage. Remove 3 damage counters from Carnivine. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DITTO_17:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness F
				pokeBody "Dittobolic", {
					text "The number of Benched Pokémon your opponent can have is now 4. If your opponent has 5 Benched Pokémon, your opponent must discard 1 of them and all cards attached to it."
					delayedA {
					}
				}
				move "Sharp Point", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRAGONITE_18:
			return evolution (this, from:"Dragonair", hp:HP140, type:COLORLESS, retreatCost:4) {
				weakness C
				resistance F, MINUS20
				move "Calming Wind", {
					text "50 damage. Remove all Special Conditions from Dragonite."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dragon Stamp", {
					text "80 damage. Flip 2 coins. If both of them are tails, this attack does nothing. If both of them are heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUGTRIO_19:
			return evolution (this, from:"Diglett", hp:HP080, type:FIGHTING, retreatCost:0) {
				weakness W
				resistance L, MINUS20
				move "Dig", {
					text "30 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sand Impact", {
					text "50 damage. Flip a coin for each Fighting Energy attached to Dugtrio. This attack does 50 damage plus 20 more damage for each heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTIVIRE_20:
			return evolution (this, from:"Electabuzz", hp:HP100, type:LIGHTNING, retreatCost:3) {
				weakness F
				resistance M, MINUS20
				move "Plasma", {
					text "30 damage. Search you discard pile for a Lightning Energy card and attach it to Electivire."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Shot", {
					text "This attack does 50 damage to each of your opponent’s Pokémon that has any Energy cards attached to it."
					energyCost L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELEKID_21:
			return basic (this, hp:HP030, type:LIGHTNING, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Elekid is Asleep, prevent all damage done to Elekid by attacks."
					delayedA {
					}
				}
				move "Sparking Ball", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance. Elekid is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLDUCK_22:
			return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:1) {
				weakness L
				pokeBody "Natural Remedy", {
					text "Whenever you attach a Water Energy card from you hand to Golduck, remove 2 damage counters from Golduck."
					delayedA {
					}
				}
				move "Powerful Splash", {
					text "Does 30 damage plus 10 more damage for each Water Energy attached to all your Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRUMPIG_23:
			return evolution (this, from:"Spoink", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Psychic Lock", {
					text "20 damage. Your opponent can’t use any Poké-Powers on his or her Pokémon during his or her next turn."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bench Manipulation", {
					text "Your opponent flips a coin for each of his or her Benched Pokémon. This attack does 40 damage times the number of tails. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KRICKETUNE_24:
			return evolution (this, from:"Kricketot", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Entrancing Melody", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fury Cutter", {
					text "20 damage. Flip 3 coins. If 1 of them is heads, this attack does 20 damage plus 20 more damage. If 2 of them are heads, this attack does 20 damage plus 40 more damage. If all of them are heads, this attack does 20 damage plus 100 more damage."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUNATONE_25:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness G
				move "Lunar Blast", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Selfdestruct", {
					text "60 damage. Lunatone does 60 damage to itself."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHAMP_26:
			return evolution (this, from:"Machoke", hp:HP130, type:FIGHTING, retreatCost:2) {
				weakness P
				move "Vital Throw", {
					text "40 damage. You may do 40 damage plus 20 more damage. If you do, Machamp does 20 damage to itself."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hundred Furious Punches", {
					text "Does 60 damage plus 10 more damage for each Fighting Energy attached to Machamp."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMORTAR_27:
			return evolution (this, from:"Magmar", hp:HP100, type:FIRE, retreatCost:2) {
				weakness W
				move "Top Burner", {
					text "Energy attached to Magmortar."
					energyCost R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Burst Punch", {
					text "60 damage. The Defending Pokémon is now Burned."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOQUEEN_28:
			return evolution (this, from:"Nidorina", hp:HP130, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Return", {
					text "30 damage. Draw cards until you have 6 cards in your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Prize Count", {
					text "50 damage. If you have more Prize cards left than your opponent, this attack does 50 damage plus 30 more damage."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOT_29:
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
					text "40 damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHARPEDO_30:
			return evolution (this, from:"Carvanha", hp:HP090, type:DARKNESS, retreatCost:1) {
				weakness L
				move "Strip Bare", {
					text "20 damage. Flip 2 coins. If both of them are heads, your opponent discards all card from his or her hand."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "Does 50 damage plus 10 more damage for each damage counter on Sharpedo."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WAILORD_31:
			return evolution (this, from:"Wailmer", hp:HP180, type:WATER, retreatCost:4) {
				weakness L
				move "Underwater Dive", {
					text "Flip 2 coins. For each heads, remove 3 damage counters from Wailord."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swallow up", {
					text "50 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Wailord. If the Defending Pokémon has fewer remaining HP than Wailord, this attack does 50 damage plus 50 more damage."
					energyCost W, W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRAGONAIR_32:
			return evolution (this, from:"Dratini", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness C
				move "Search and Invite", {
					text "Search your deck for up to 2 Pokémon, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slam", {
					text "Flip 2 coins. This attack does 40 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTABUZZ_33:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Light Punch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shock Bolt", {
					text "60 damage. Flip a coin. If tails, discard all Lightning Energy attached to Electabuzz."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_34:
			return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Rollout", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lightning Strike", {
					text "40 damage. You may do 40 damage plus 60 more damage. If you do, discard all Lightning Energy attached to Electrode."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HAUNTER_35:
			return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:0) {
				weakness D
				resistance C, MINUS20
				move "Sneaky Placement", {
					text "Put 2 damage counters on 1 of your opponent’s Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sleep Poison", {
					text "The Defending Pokémon is now Asleep and Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KANGASKHAN_36:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Split Spiral Punch", {
					text "20 damage. The Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dizzy Punch", {
					text "Flip 2 coins. This attack does 50 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LAIRON_37:
			return evolution (this, from:"Aron", hp:HP080, type:METAL, retreatCost:3) {
				weakness R
				resistance P, MINUS20
				move "Take Down", {
					text "80 damage. Lairon does 20 damage to itself."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKILICKY_38:
			return evolution (this, from:"Lickitung", hp:HP100, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Licking Shot", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon for each Energy attached to Lickilicky."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stick and Absorb", {
					text "50 damage. Remove 2 damage counters from Lickilicky. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUVDISC_39:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L
				move "Rendezvous Draw", {
					text "Each player draws and reveals the top card of his or her deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Distorted Wave", {
					text "30 damage. Before doing damage, remove 1 damage counter from the Defending Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHOKE_40:
			return evolution (this, from:"Machop", hp:HP090, type:FIGHTING, retreatCost:2) {
				weakness P
				move "Knuckle Down", {
					text "30 damage. This attack’s damage isn’t affected by Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Strength", {
					text "60 damage. "
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGBY_41:
			return basic (this, hp:HP030, type:FIRE, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Magby is Asleep, prevents all damage done to Magby by attacks."
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
			case MAGMAR_42:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness W
				move "Eruption", {
					text "Each player discards the top card of his or her deck. This attack does 20 damage times the number of Energy cards discarded in this way."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "30 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNETON_43:
			return evolution (this, from:"Magnemite", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Speed Ball", {
					text "20 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tri Attack", {
					text "Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAROWAK_44:
			return evolution (this, from:"Cubone", hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance L, MINUS20
				move "Bonemerang", {
					text "Flip 2 coins. This attack does 60 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bone Impact", {
					text "20 damage. If there is any Stadium card in play, this attack does 20 damage plus 60 more damage. Discard that Stadium card."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINA_45:
			return evolution (this, from:"Nidoran Female", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Quick Blow", {
					text "20 damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Slap", {
					text "50 damage. "
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINO_46:
			return evolution (this, from:"Nidoran Male", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Horn Attack", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lunge", {
					text "80 damage. Flip a coin. If tails, this attack does nothing."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOTTO_47:
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
			case PILOSWINE_48:
			return evolution (this, from:"Swinub", hp:HP100, type:WATER, retreatCost:3) {
				weakness M
				move "Blizzard", {
					text "40 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon. If tails, this attack does 10 damage to each of your Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hammer In", {
					text "60 damage. "
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON2_49:
			return evolution (this, from:"Porygon", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness F
				pokePower "Mapping", {
					text "Once during your turn, when you play Porygon2 from you hand to evolve 1 of your Pokémon, you may search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					actionA {
					}
				}
				move "3-D Attack", {
					text "Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TENTACRUEL_50:
			return evolution (this, from:"Tentacool", hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				move "Tentavolve", {
					text "20 damage. If Tentacruel evolved from Tentacool during this turn, the Defending Pokémon is now Paralyzed and Poisoned."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Beam", {
					text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_51:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "CURE", {
					text "Once during your turn, when you put Unown from your hand onto your Bench, remove all Special Conditions from your Active Pokémon."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WAILMER_52:
			return basic (this, hp:HP090, type:WATER, retreatCost:3) {
				weakness L
				move "Double Attack", {
					text "Choose 2 of your opponent’s Pokémon. This attack does 20 damage to each of them."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Surf", {
					text "50 damage. "
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEPINBELL_53:
			return evolution (this, from:"Bellsprout", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Poisonpowder", {
					text "The Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Corrode Target", {
					text "10 damage. Flip a coin. If heads, look at your opponent’s hand, choose 1 card, and discard it."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMEGA_54:
			return evolution (this, from:"Yanma", hp:HP090, type:GRASS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Shoot Through U-turn", {
					text "20 damage. Switch Yanmega with 1 of your Benched Pokémon."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AIPOM_55:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Imitate", {
					text "Draw cards until you have the same number of cards in your hand as your opponent."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Punch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARON_56:
			return basic (this, hp:HP060, type:METAL, retreatCost:1) {
				weakness R
				resistance P, MINUS20
				move "Mountain Eater", {
					text "Discard the top card of your deck. Then, remove 2 damage counters from Aron."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Confront", {
					text "30 damage. "
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BELLSPROUT_57:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R
				move "Inviting Scent", {
					text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Careless Tackle", {
					text "20 damage. Bellsprout does 10 damage to itself."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZOR_58:
			return basic (this, hp:HP060, type:METAL, retreatCost:1) {
				weakness R
				resistance P, MINUS20
				move "Iron Defense", {
					text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to Bronzor during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARVANHA_59:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness L
				move "Focus Energy", {
					text "During your next turn, Carvanha’s Bite attack’s base damage is 40."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "10 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CUBONE_60:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance L, MINUS20
				pokeBody "Lonely Bone", {
					text "Any damage done to Cubone by your opponent’s attacks is reduced by 20 for each Marowak in your discard pile ."
					delayedA {
					}
				}
				move "Bone Rush", {
					text "Flip a coin until you get tails. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIGLETT_61:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance L, MINUS20
				move "Sand Veil", {
					text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to Diglett during your opponent’s next turn."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mini Earthquake", {
					text "40 damage. Does 10 damage to each of your Benched Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRATINI_62:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness C
				move "Gentle Wrap", {
					text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost C
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
			case GASTLY_63:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Sneaky Placement", {
					text "Put 1 damage counter on 1 of your opponent’s Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ILLUMISE_64:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness R
				move "Sweet Scent", {
					text "Remove 3 damage counters from 1 of your Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Vulcan Beat", {
					text "Flip a coin for each Volbeat you have in play. This attack does 30 damage times the number of heads."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KRICKETOT_65:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				move "Beat", {
					text "30 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKITUNG_66:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Beat", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tongue Whip", {
					text "Choose 1 of your opponent’s Benched Pokémon. This attack does 30 damage to that Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHOP_67:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness P
				move "Steady Punch", {
					text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mach Cross", {
					text "50 damage. "
					energyCost F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEMITE_68:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Magnetic Switch", {
					text "Switch Magnemite with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thundershock", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_FEMALE_69:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Friend Search", {
					text "Look at the top 5 cards of your deck, choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. Shuffle the other cards back into your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Kick", {
					text "Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_MALE_70:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Pheromone Poison", {
					text "10 damage. If Nidoran Female is on your Bench, the Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Horn Attack", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEY_71:
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
			case PONYTA_72:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness W
				move "Rear Kick", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flare", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_73:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Sharpen", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Recover", {
					text "Discard an Energy attached to Porygon and remove 4 damage counters from Porygon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PSYDUCK_74:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L
				move "Tripping Headbutt", {
					text "Flip a coin. If heads, this attack does 30 damage to 1 of your opponent’s Pokémon. If tails, this attack does 30 damage to 1 of your Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHUPPET_75:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Disable", {
					text "Flip a coin. If heads, choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Haunt", {
					text "Put 1 damage counter on the Defending Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKORUPI_76:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Paralyzing Clamp", {
					text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPOINK_77:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Sleep Pearl", {
					text "The Defending Pokémon is now Asleep. Switch Spoink with 1 of your Benched Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWABLU_78:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Wing Flick", {
					text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWINUB_79:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness M
				move "Headbutt", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ice Ball", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TENTACOOL_80:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L
				move "Gentle Wrap", {
					text "10 damage. The Defending Pokémon can’t retreat during you opponent’s next turn."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENONAT_81:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				move "Leech Life", {
					text "10 damage. Remove from Venonat the number of damage counters equal to the damage you did to the Defending Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLBEAT_82:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness R
				move "Illumisile", {
					text "If you don’t have Illumise in play, this attack does nothing. Choose 1 of your opponent’s Benched Pokémon. This attack does 30 damage to that Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Firefly Light", {
					text "30 damage. The Defending Pokémon is now Burned and Confused."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB_83:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Magnetic Bomb", {
					text "20 damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage. If tails, Voltorb does 10 damage to itself."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMA_84:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokeBody "Free Flight", {
					text "If Yanma has no Energy attached to it, Yanma’s Retreat Cost is 0."
					delayedA {
					}
				}
				move "Dive", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BLACK_BELT_85:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nYou may use this card only if you have more Prize cards left than your opponent. During this turn, each of your Active Pokémon’s attacks does 40 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
				onPlay {
				}
				playRequirement{
				}
			};
			case INDIGO_PLATEAU_86:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach Pokémon LEGEND in play (both yours and your opponent’s) gets +30 HP."
				onPlay {
				}
				playRequirement{
				}
			};
			case JUNK_ARM_87:
			return basicTrainer (this) {
				text "Discard 2 cards from you hand. Search your discard pile for a Trainer card, show it to your opponent, and put it into your hand. You can’t choose Junk Arm with the effect of this card."
				onPlay {
				}
				playRequirement{
				}
			};
			case SEEKER_88:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player returns 1 of his or her Benched Pokémon and all cards attached to it to his or her hand. (You return your Pokémon first.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case TWINS_89:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nYou may use this card only if you have more Prize cards left than your opponent. Search your deck for any 2 cards and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case RESCUE_ENERGY_90:
			return specialEnergy (this, [[C]]) {
				text "Rescue Energy provides 1 [C] Energy. IF the Pokémon this card is attached to is Knocked Out by damage from an attack, put that Pokémon back into your hand. (Discard all cards attached to that Pokémon.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case ABSOL_PRIME_91:
			return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				pokeBody "Eye of Disaster", {
					text "As long as Absol is your Active Pokémon, whenever your opponent puts a Basic Pokémon from his or her hand onto his or her Bench, put 2 damage counters on that Pokémon."
					delayedA {
					}
				}
				move "Vicious Claw", {
					text "70 damage. Choose 1 Pokémon from your hand and put it in the Lost Zone. (If you can’t put a Pokémon in the Lost Zone, this attack does nothing.)"
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CELEBI_PRIME_92:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R
				pokePower "Forest Breath", {
					text "Once during your turn , if Celebi is your Active Pokémon, you may attach a Grass Energy card from your hand to 1 of your Pokémon. This power can’t be used if Celebi is affected by a Special Condition."
					actionA {
					}
				}
				move "Time Circle", {
					text "30 damage. During your opponent’s next turn, prevent all damage done to Celebe by attacks from your opponent’s Stage 1 or Stage 2 Pokémon."
					energyCost G, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_PRIME_93:
			return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				pokePower "Energymite", {
					text "Once during your turn , you may use this power. If you do, Electrode is Knocked Out. Look at the top 7 cards of your deck. Choose as many Energy cards as you like and attach them to your Pokémon in any way you like. Discard the other cards. This power can’t be used if Electrode is affected by a Special Condition."
					actionA {
					}
				}
				move "Gigashock", {
					text "30 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_PRIME_94:
			return evolution (this, from:"Haunter", hp:HP130, type:PSYCHIC, retreatCost:0) {
				weakness D
				resistance C, MINUS20
				pokeBody "Catastrophe", {
					text "As long as Gengar is your Active Pokémon, if any of your opponent’s Pokémon would be Knocked Out, put that Pokémon in the Lost Zone instead of discarding."
					delayedA {
					}
				}
				move "Hurl into Darkness", {
					text "Look at your opponent’s hand and choose a number of Pokémon you find there up to the number of Psychic Energy attached to Gengar. PUt the Pokémon you chose in the Lost Zone."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cursed Drop", {
					text "Put 4 damage counters on your opponent’s Pokémon in any way you like."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHAMP_PRIME_95:
			return evolution (this, from:"Machoke", hp:HP150, type:FIGHTING, retreatCost:3) {
				weakness P
				pokePower "Fighting Tag", {
					text "Once during your turn , if Machamp is on your Bench, you may move all Energy attached to your Active Pokémon to Machamp. If you do, switch Machamp with your Active Pokémon."
					actionA {
					}
				}
				move "Crushing Punch", {
					text "60 damage. Discard a Special Energy card attached to the Defending Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Champ Buster", {
					text "Does 100 damage plus 10 more damage for each of your Benched Pokémon that has any damage counters on it."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEZONE_PRIME_96:
			return evolution (this, from:"Magneton", hp:HP140, type:LIGHTNING, retreatCost:3) {
				weakness F
				resistance M, MINUS20
				pokePower "Magnetic Draw", {
					text "Once during your turn , you may draw cards until you have 6 cards in your hand. This power can’t be used if Magnezone is affected by a Special Condition."
					actionA {
					}
				}
				move "Lost Burn", {
					text "Put as many Energy cards attached to your Pokémon as you like in the Lost Zone. This attack does 50 damage times the number of Energy cards put in the Lost Zone in this way."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEW_PRIME_97:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:0) {
				weakness P
				pokeBody "Lost Link", {
					text "Mew can use the attacks of all Pokémon in the Lost Zone ."
					delayedA {
					}
				}
				move "See Off", {
					text "Search your deck for 1 Pokémon and put it in the Lost Zone. Shuffle your deck afterward."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMEGA_PRIME_98:
			return evolution (this, from:"Yanma", hp:HP110, type:GRASS, retreatCost:0) {
				weakness L
				resistance F, MINUS20
				pokeBody "Insight", {
					text "If you have the same number of cards in your hand as your opponent, the attack cost of each of Yanmega’s attacks is 0."
					delayedA {
					}
				}
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sonicboom", {
					text "70 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_&_CRESSELIA_LEGEND_99:
			return basic (this, hp:HP150, type:[PSYCHIC, D], retreatCost:2) {
				weakness P
				weakness F
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Darkrai & Cresselia LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Moon’s Invite", {
					text "Move as many damage counters on your opponent’s Pokémon as you like to any of your opponent’s other Pokémon in any way you like."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lost Crisis", {
					text "100 damage. Choose 2 Energy attached to Darkrai & Cresselia LEGEND and put them in the Lost Zone. If any of your opponent’s Pokémon would be Knocked Out by damage from this attack, put that Pokémon and all cards attached to it in the Lost Zone instead of discarding it."
					energyCost D, D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_&_CRESSELIA_LEGEND_100:
			return copy (DARKRAI_&_CRESSELIA_LEGEND_99, this)
			/*basic (this, hp:HP150, type:[PSYCHIC, D], retreatCost:2) {
				weakness P
				weakness F
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Darkrai & Cresselia LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Moon’s Invite", {
					text "Move as many damage counters on your opponent’s Pokémon as you like to any of your opponent’s other Pokémon in any way you like."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lost Crisis", {
					text "100 damage. Choose 2 Energy attached to Darkrai & Cresselia LEGEND and put them in the Lost Zone. If any of your opponent’s Pokémon would be Knocked Out by damage from this attack, put that Pokémon and all cards attached to it in the Lost Zone instead of discarding it."
					energyCost D, D, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PALKIA_&_DIALGA_LEGEND_101:
			return basic (this, hp:HP160, type:[WATER, M], retreatCost:3) {
				weakness R
				weakness L
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Palkia & Dialga LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sudden Delete", {
					text "Choose 1 of your opponent’s Benched Pokémon. Put that Pokémon and all cards attached to it back to your opponent’s hand."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Time Control", {
					text "Energy attached to Palkia & Dialga LEGEND. Add the top 2 cards of your opponent’s deck to his or her Prize cards."
					energyCost M, M, C, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PALKIA_&_DIALGA_LEGEND_102:
			return basic (this, hp:HP160, type:[WATER, M], retreatCost:3) {
				weakness R
				weakness L
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Palkia & Dialga LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sudden Delete", {
					text "Choose 1 of your opponent’s Benched Pokémon. Put that Pokémon and all cards attached to it back to your opponent’s hand."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Time Control", {
					text "Discard all Metal Energy attached to Palkia & Dialga LEGEND. Add the top 2 cards of your opponent’s deck to his or her Prize cards."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ALPH_LITHOGRAPH_FOUR:
			return basicTrainer (this) {
				text "LOOK AT ALL OF YOUR FACE DOWN PRIZE CARDS!"
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
