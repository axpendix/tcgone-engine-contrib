package tcgwars.logic.card.set;

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

public enum Jungle implements CardInfo {
	
	CLEFABLE_1 ("Clefable", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ELECTRODE_2 ("Electrode", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FLAREON_3 ("Flareon", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	JOLTEON_4 ("Jolteon", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	KANGASKHAN_5 ("Kangaskhan", 5, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	MR__MIME_6 ("Mr. Mime", 6, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOQUEEN_7 ("Nidoqueen", 7, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PIDGEOT_8 ("Pidgeot", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PINSIR_9 ("Pinsir", 9, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SCYTHER_10 ("Scyther", 10, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SNORLAX_11 ("Snorlax", 11, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	VAPOREON_12 ("Vaporeon", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	VENOMOTH_13 ("Venomoth", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VICTREEBEL_14 ("Victreebel", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VILEPLUME_15 ("Vileplume", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	WIGGLYTUFF_16 ("Wigglytuff", 16, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	CLEFABLE_17 ("Clefable", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ELECTRODE_18 ("Electrode", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FLAREON_19 ("Flareon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	JOLTEON_20 ("Jolteon", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	KANGASKHAN_21 ("Kangaskhan", 21, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	MR__MIME_22 ("Mr. Mime", 22, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOQUEEN_23 ("Nidoqueen", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PIDGEOT_24 ("Pidgeot", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PINSIR_25 ("Pinsir", 25, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	SCYTHER_26 ("Scyther", 26, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	SNORLAX_27 ("Snorlax", 27, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	VAPOREON_28 ("Vaporeon", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	VENOMOTH_29 ("Venomoth", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VICTREEBEL_30 ("Victreebel", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VILEPLUME_31 ("Vileplume", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	WIGGLYTUFF_32 ("Wigglytuff", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	BUTTERFREE_33 ("Butterfree", 33, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DODRIO_34 ("Dodrio", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	EXEGGUTOR_35 ("Exeggutor", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	FEAROW_36 ("Fearow", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	GLOOM_37 ("Gloom", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	LICKITUNG_38 ("Lickitung", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	MAROWAK_39 ("Marowak", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	NIDORINA_40 ("Nidorina", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PARASECT_41 ("Parasect", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PERSIAN_42 ("Persian", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	PRIMEAPE_43 ("Primeape", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	RAPIDASH_44 ("Rapidash", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	RHYDON_45 ("Rhydon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	SEAKING_46 ("Seaking", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	TAUROS_47 ("Tauros", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	WEEPINBELL_48 ("Weepinbell", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BELLSPROUT_49 ("Bellsprout", 49, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CUBONE_50 ("Cubone", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	EEVEE_51 ("Eevee", 51, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	EXEGGCUTE_52 ("Exeggcute", 52, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	GOLDEEN_53 ("Goldeen", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	JIGGLYPUFF_54 ("Jigglypuff", 54, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	MANKEY_55 ("Mankey", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MEOWTH_56 ("Meowth", 56, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	NIDORAN_FEMALE_57 ("Nidoran Female", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	ODDISH_58 ("Oddish", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PARAS_59 ("Paras", 59, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PIKACHU_60 ("Pikachu", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	RHYHORN_61 ("Rhyhorn", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SPEAROW_62 ("Spearow", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	VENONAT_63 ("Venonat", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	POKE_BALL_64 ("Poké Ball", 64, Rarity.COMMON, [TRAINER]),
;
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	Jungle(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.JUNGLE;
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
			return evolution (this, from:"Clefairy", hp:HP070, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Metronome", {
					text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable’s type is still Colorless.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Minimize", {
					text "All damage done by attacks to Clefable during your opponent’s next turn is reduced by 20 (after applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_2:
			return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Tackle", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Chain Lightning", {
					text "20 damage. If the Defending Pokémon isn’t Colorless, this attack does 10 damage to each Benched Pokémon of the same type as the Defending Pokémon (including your own)."
					energyCost L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAREON_3:
			return evolution (this, from:"Eevee", hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "60 damage. Discard 1 [R] Energy card attached to Flareon in order to use this attack."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JOLTEON_4:
			return evolution (this, from:"Eevee", hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pin Missile", {
					text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KANGASKHAN_5:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Fetch", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Comet Punch", {
					text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_6:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokemonPower "Invisible Wall", {
					text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can’t be used if Mr. Mime is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Meditate", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOQUEEN_7:
			return evolution (this, from:"Nidorina", hp:HP090, type:GRASS, retreatCost:3) {
				weakness PSYCHIC
				move "Boyfriends", {
					text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Punch", {
					text "50 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOT_8:
			return evolution (this, from:"Pidgeotto", hp:HP080, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Wing Attack", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hurricane", {
					text "30 damage. Unless this attack Knocks Out the Defending Pokémon, return the Defending Pokémon and all cards attached to it to your opponent’s hand."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PINSIR_9:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Irongrip", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Guillotine", {
					text "50 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SCYTHER_10:
			return basic (this, hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				move "Swords Dance", {
					text "During your next turn, Scyther’s Slash attack’s base damage is 60 instead of 30."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_11:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:4) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				pokemonPower "Thick Skinned", {
					text "Snorlax can’t become Asleep, Confused, Paralyzed, or Poisoned. This power can’t be used if Snorlax is already Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Body Slam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VAPOREON_12:
			return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Water Gun", {
					text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Vaporeon but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd doesn’t count."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENOMOTH_13:
			return evolution (this, from:"Venonat", hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				pokemonPower "Shift", {
					text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than Colorless. This power can’t be used if Venomoth is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Venom Powder", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VICTREEBEL_14:
			return evolution (this, from:"Weepinbell", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Lure", {
					text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Acid", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon can’t retreat during your next turn."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VILEPLUME_15:
			return evolution (this, from:"Gloom", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokemonPower "Heal", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, remove 1 damage counter from 1 of your Pokémon. This power can’t be used if Vileplume is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Petal Dance", {
					text "40× damage. Flip 3 coins. This attack does 40 damage times the number of heads. Vileplume is now Confused (after doing damage)."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WIGGLYTUFF_16:
			return evolution (this, from:"Jigglypuff", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Lullaby", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Do the Wave", {
					text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFABLE_17:
			return copy (CLEFABLE_1, this)
			/*evolution (this, from:"Clefairy", hp:HP070, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Metronome", {
					text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable’s type is still Colorless.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Minimize", {
					text "All damage done by attacks to Clefable during your opponent’s next turn is reduced by 20 (after applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case ELECTRODE_18:
			return copy (ELECTRODE_2, this)
			/*evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Tackle", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Chain Lightning", {
					text "20 damage. If the Defending Pokémon isn’t Colorless, this attack does 10 damage to each Benched Pokémon of the same type as the Defending Pokémon (including your own)."
					energyCost L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case FLAREON_19:
			return copy (FLAREON_3, this)
			/*evolution (this, from:"Eevee", hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "60 damage. Discard 1 [R] Energy card attached to Flareon in order to use this attack."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case JOLTEON_20:
			return copy (JOLTEON_4, this)
			/*evolution (this, from:"Eevee", hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pin Missile", {
					text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case KANGASKHAN_21:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:null) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Fetch", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Comet Punch", {
					text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_22:
			return copy (MR__MIME_6, this)
			/*basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokemonPower "Invisible Wall", {
					text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can’t be used if Mr. Mime is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Meditate", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case NIDOQUEEN_23:
			return copy (NIDOQUEEN_7, this)
			/*evolution (this, from:"Nidorina", hp:HP090, type:GRASS, retreatCost:3) {
				weakness PSYCHIC
				move "Boyfriends", {
					text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Punch", {
					text "50 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PIDGEOT_24:
			return copy (PIDGEOT_8, this)
			/*evolution (this, from:"Pidgeotto", hp:HP080, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Wing Attack", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hurricane", {
					text "30 damage. Unless this attack Knocks Out the Defending Pokémon, return the Defending Pokémon and all cards attached to it to your opponent’s hand."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PINSIR_25:
			return copy (PINSIR_9, this)
			/*basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Irongrip", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Guillotine", {
					text "50 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case SCYTHER_26:
			return copy (SCYTHER_10, this)
			/*basic (this, hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				move "Swords Dance", {
					text "During your next turn, Scyther’s Slash attack’s base damage is 60 instead of 30."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case SNORLAX_27:
			return copy (SNORLAX_11, this)
			/*basic (this, hp:HP090, type:COLORLESS, retreatCost:4) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				pokemonPower "Thick Skinned", {
					text "Snorlax can’t become Asleep, Confused, Paralyzed, or Poisoned. This power can’t be used if Snorlax is already Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Body Slam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case VAPOREON_28:
			return copy (VAPOREON_12, this)
			/*evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Water Gun", {
					text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Vaporeon but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd doesn’t count."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case VENOMOTH_29:
			return copy (VENOMOTH_13, this)
			/*evolution (this, from:"Venonat", hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				pokemonPower "Shift", {
					text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than Colorless. This power can’t be used if Venomoth is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Venom Powder", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case VICTREEBEL_30:
			return copy (VICTREEBEL_14, this)
			/*evolution (this, from:"Weepinbell", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Lure", {
					text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Acid", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon can’t retreat during your next turn."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case VILEPLUME_31:
			return copy (VILEPLUME_15, this)
			/*evolution (this, from:"Gloom", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokemonPower "Heal", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, remove 1 damage counter from 1 of your Pokémon. This power can’t be used if Vileplume is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Petal Dance", {
					text "40× damage. Flip 3 coins. This attack does 40 damage times the number of heads. Vileplume is now Confused (after doing damage)."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case WIGGLYTUFF_32:
			return copy (WIGGLYTUFF_16, this)
			/*evolution (this, from:"Jigglypuff", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Lullaby", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Do the Wave", {
					text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case BUTTERFREE_33:
			return evolution (this, from:"Metapod", hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				move "Whirlwind", {
					text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Drain", {
					text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
					energyCost G, G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DODRIO_34:
			return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokemonPower "Retreat Aid", {
					text "As long as Dodrio is Benched, pay 1 less to retreat your Active Pokémon."
					actionA {
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EXEGGUTOR_35:
			return evolution (this, from:"Exeggcute", hp:HP080, type:GRASS, retreatCost:3) {
				weakness FIRE
				move "Teleport", {
					text "Switch Exeggutor with 1 of your Benched Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Big Eggsplosion", {
					text "20× damage. Flip a number of coins equal to the number of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FEAROW_36:
			return evolution (this, from:"Spearow", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Agility", {
					text "20 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Fearow."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Drill Peck", {
					text "40 damage."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLOOM_37:
			return evolution (this, from:"Oddish", hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Poisonpowder", {
					text "The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Foul Odor", {
					text "20 damage. Both the Defending Pokémon and Gloom are now Confused (after doing damage)."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKITUNG_38:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Tongue Wrap", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAROWAK_39:
			return evolution (this, from:"Cubone", hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Bonemerang", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Call for Friend", {
					text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your bench is full.)"
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINA_40:
			return evolution (this, from:"Nidoran Female", hp:HP070, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Kick", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARASECT_41:
			return evolution (this, from:"Paras", hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Spore", {
					text "The Defending Pokémon is now Asleep."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PERSIAN_42:
			return evolution (this, from:"Meowth", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Scratch", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pounce", {
					text "30 damage. If the Defending Pokémon attacks Persian during your next turn, any damage done by the attack is reduced by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PRIMEAPE_43:
			return evolution (this, from:"Mankey", hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Fury Swipes", {
					text "20× damage. Flip 3 coins. this attack does 20 damage times the number of heads."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tantrum", {
					text "50 damage. Flip a coin. If tails, Primeape is now Confused (after doing damage)."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_44:
			return evolution (this, from:"Ponyta", hp:HP070, type:FIRE, retreatCost:0) {
				weakness WATER
				move "Stomp", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Agility", {
					text "30 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Rapidash."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RHYDON_45:
			return evolution (this, from:"Rhyhorn", hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Horn Attack", {
					text "30 damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ram", {
					text "50 damage. Rhydon does 20 damage to itself. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon. Switch the Pokémon even if Rhydon is knocked out.)"
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEAKING_46:
			return evolution (this, from:"Goldeen", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Horn Attack", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Waterfall", {
					text "30 damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TAUROS_47:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Stomp", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rampage", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. Flip a coin. If tails, Tauros is now Confused (after doing damage)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEPINBELL_48:
			return evolution (this, from:"Bellsprout", hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Poisonpowder", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "30 damage."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BELLSPROUT_49:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Vine Whip", {
					text "10 damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon named Bellsprout and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CUBONE_50:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Snivel", {
					text "If the Defending Pokémon attacks Cubone during your opponent’s next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EEVEE_51:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Tail Wag", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack Eevee during your opponent’s next turn. (Benching either Pokémon ends this effect."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EXEGGCUTE_52:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Leech Seed", {
					text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Exeggcute."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLDEEN_53:
			return basic (this, hp:HP040, type:WATER, retreatCost:0) {
				weakness LIGHTNING
				move "Horn Attack", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIGGLYPUFF_54:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Lullaby", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pound", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANKEY_55:
			return basic (this, hp:HP030, type:FIGHTING, retreatCost:0) {
				weakness PSYCHIC
				pokemonPower "Peek", {
					text "Once during your turn (before your attack), you may look at one of the following: the top card of either player’s deck, a random card from your opponent’s hand, or one of either player’s Prizes. This power can’t be used if Mankey is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Scratch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEOWTH_56:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Pay Day", {
					text "10 damage. Flip a coin. If heads, draw a card."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_FEMALE_57:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Fury Swipes", {
					text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Call for Family", {
					text "earch your deck for a Basic Pokémon named Nidoran ♂ or Nidoran ♀ and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ODDISH_58:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Stun Spore", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sprout", {
					text "Search your deck for a Basic Pokémon named Oddish and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARAS_59:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Scratch", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spore", {
					text "The Defending Pokémon is now Asleep."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_60:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Spark", {
					text "20 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RHYHORN_61:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:3) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Leer", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack Rhyhorn during your opponent’s next turn. (Benching either Pokémon ends this effect.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "30 damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPEAROW_62:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Peck", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mirror Move", {
					text "If Spearow was attacked last turn, do the final result of that attack on Spearow to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENONAT_63:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Stun Spore", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Leech Life", {
					text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POKE_BALL_64:
			return basicTrainer (this) {
				text "Flip a coin. If heads, you may search your deck for any Basic Pokémon or Evolution card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
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