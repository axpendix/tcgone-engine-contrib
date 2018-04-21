package tcgwars.logic.impl.gen1;

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
public enum TeamRocket implements CardInfo {
	
	DARK_ALAKAZAM_1 ("Dark Alakazam", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_ARBOK_2 ("Dark Arbok", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_BLASTOISE_3 ("Dark Blastoise", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	DARK_CHARIZARD_4 ("Dark Charizard", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	DARK_DRAGONITE_5 ("Dark Dragonite", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	DARK_DUGTRIO_6 ("Dark Dugtrio", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_GOLBAT_7 ("Dark Golbat", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_GYARADOS_8 ("Dark Gyarados", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DARK_HYPNO_9 ("Dark Hypno", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_MACHAMP_10 ("Dark Machamp", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_MAGNETON_11 ("Dark Magneton", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	DARK_SLOWBRO_12 ("Dark Slowbro", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_VILEPLUME_13 ("Dark Vileplume", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DARK_WEEZING_14 ("Dark Weezing", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	HERE_COMES_TEAM_ROCKET_15 ("Here Comes Team Rocket!", 15, Rarity.HOLORARE, [TRAINER]),
	ROCKETS_SNEAK_ATTACK_16 ("Rocket's Sneak Attack", 16, Rarity.HOLORARE, [TRAINER]),
	RAINBOW_ENERGY_17 ("Rainbow Energy", 17, Rarity.HOLORARE, [SPECIAL_ENERGY, ENERGY]),

	DARK_ALAKAZAM ("Dark Alakazam", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_ARBOK ("Dark Arbok", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_BLASTOISE ("Dark Blastoise", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	DARK_CHARIZARD ("Dark Charizard", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	DARK_DRAGONITE ("Dark Dragonite", 22, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	DARK_DUGTRIO ("Dark Dugtrio", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_GOLBAT ("Dark Golbat", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_GYARADOS ("Dark Gyarados", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DARK_HYPNO ("Dark Hypno", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_MACHAMP ("Dark Machamp", 27, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_MAGNETON ("Dark Magneton", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	DARK_SLOWBRO ("Dark Slowbro", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_VILEPLUME ("Dark Vileplume", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DARK_WEEZING ("Dark Weezing", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_CHARMELEON ("Dark Charmeleon", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	DARK_DRAGONAIR ("Dark Dragonair", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DARK_ELECTRODE ("Dark Electrode", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	DARK_FLAREON ("Dark Flareon", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	DARK_GLOOM ("Dark Gloom", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_GOLDUCK ("Dark Golduck", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DARK_JOLTEON ("Dark Jolteon", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	DARK_KADABRA ("Dark Kadabra", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DARK_MACHOKE ("Dark Machoke", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_MUK ("Dark Muk", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	DARK_PERSIAN ("Dark Persian", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DARK_PRIMEAPE ("Dark Primeape", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DARK_RAPIDASH ("Dark Rapidash", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	DARK_VAPOREON ("Dark Vaporeon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DARK_WARTORTLE ("Dark Wartortle", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	MAGIKARP ("Magikarp", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	PORYGON ("Porygon", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	ABRA ("Abra", 49, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	CHARMANDER ("Charmander", 50, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	DARK_RATICATE ("Dark Raticate", 51, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DIGLETT ("Diglett", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DRATINI ("Dratini", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	DROWZEE ("Drowzee", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	EEVEE ("Eevee", 55, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	EKANS ("Ekans", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	GRIMER ("Grimer", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	KOFFING ("Koffing", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MACHOP ("Machop", 59, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MAGNEMITE ("Magnemite", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MANKEY ("Mankey", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MEOWTH ("Meowth", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	ODDISH ("Oddish", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PONYTA ("Ponyta", 64, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	PSYDUCK ("Psyduck", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	RATTATA ("Rattata", 66, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SLOWPOKE ("Slowpoke", 67, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SQUIRTLE ("Squirtle", 68, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	VOLTORB ("Voltorb", 69, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	ZUBAT ("Zubat", 70, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	HERE_COMES_TEAM_ROCKET ("Here Comes Team Rocket!", 71, Rarity.RARE, [TRAINER]),
	ROCKETS_SNEAK_ATTACK ("Rocket's Sneak Attack", 72, Rarity.RARE, [TRAINER]),
	THE_BOSSS_WAY ("The Boss's Way", 73, Rarity.UNCOMMON, [TRAINER]),
	CHALLENGE ("Challenge!", 74, Rarity.UNCOMMON, [TRAINER]),
	DIGGER ("Digger", 75, Rarity.UNCOMMON, [TRAINER]),
	IMPOSTER_OAKS_REVENGE ("Imposter Oak's Revenge", 76, Rarity.UNCOMMON, [TRAINER]),
	NIGHTLY_GARBAGE_RUN ("Nightly Garbage Run", 77, Rarity.UNCOMMON, [TRAINER]),
	GOOP_GAS_ATTACK ("Goop Gas Attack", 78, Rarity.COMMON, [TRAINER]),
	SLEEP ("Sleep!", 79, Rarity.COMMON, [TRAINER]),
	RAINBOW_ENERGY ("Rainbow Energy", 80, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
	FULL_HEAL_ENERGY ("Full Heal Energy", 81, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	POTION_ENERGY ("Potion Energy", 82, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	DARK_RAICHU ("Dark Raichu", 83, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]);
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	TeamRocket(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.TEAM_ROCKET;
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
			case DARK_ALAKAZAM_1:
			return evolution (this, from:"Dark Kadabra", hp:HP060, type:PSYCHIC, retreatCost:3) {
				weakness PSYCHIC
				move "Teleport Blast", {
					text "30 damage. You may switch Dark Alakazam with 1 of your Benched Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mind Shock", {
					text "40 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_ARBOK_2:
			return evolution (this, from:"Ekans", hp:HP060, type:GRASS, retreatCost:2) {
				weakness PSYCHIC
				move "Stare", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.) If that Pokémon has a Pokémon Power, that power stops working until the end of your opponent’s next turn."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Vapor", {
					text "10 damage. The Defending Pokémon is now Poisoned. This attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_BLASTOISE_3:
			return evolution (this, from:"Dark Wartortle", hp:HP070, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Hydrocannon", {
					text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Dark Blastoise but not used to pay for this attack. You can’t add more than 40 damage in this way."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rocket Tackle", {
					text "40 damage. Dark Blastoise does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Dark Blastoise during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_CHARIZARD_4:
			return evolution (this, from:"Dark Charmeleon", hp:HP080, type:FIRE, retreatCost:3) {
				weakness WATER
				resistance FIGHTING, MINUS30
				move "Nail Flick", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Continuous Fireball", {
					text "50× damage. Flip a number of coins equal to the number for [R] Energy cards attached to Dark Charizard. This attack does 50 damage times the number of heads. Discard a number of [R] Energy cards attached to Dark Charizard equal to the number of heads."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DRAGONITE_5:
			return evolution (this, from:"Dark Dragonair", hp:HP070, type:COLORLESS, retreatCost:2) {
				resistance FIGHTING, MINUS30
				pokemonPower "Summon Minions", {
					text "When you play Dark Dragonite from your hand, search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					actionA {
					}
				}
				move "Giant Tail", {
					text "70 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DUGTRIO_6:
			return evolution (this, from:"Diglett", hp:HP050, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				pokemonPower "Sinkhole", {
					text "Whenever your opponent’s Active Pokémon retreats, your opponent flips a coin. If tails, this power does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance.) This power stops working while Dark Dugtrio is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Knock Down", {
					text "20+ damage. You opponent flips a coin. If tails, this attack does 20 damage plus 20 more damage. If heads, this attack does 20 damage."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GOLBAT_7:
			return evolution (this, from:"Zubat", hp:HP050, type:GRASS, retreatCost:0) {
				weakness PSYCHIC
				resistance FIGHTING, MINUS30
				pokemonPower "Sneak Attack", {
					text "When you play Dark Golbat from your hand, you may choose 1 of your opponent’s Pokémon. If you do, Dark Golbat does 10 damage to that Pokémon. Apply Weakness and Resistance."
					actionA {
					}
				}
				move "Flitter", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GYARADOS_8:
			return evolution (this, from:"Magikarp", hp:HP070, type:WATER, retreatCost:2) {
				weakness GRASS
				resistance FIGHTING, MINUS30
				pokemonPower "Final Beam", {
					text "When Dark Gyarados is Knocked Out by an attack, flip a coin. If heads, this power does 20 damage for each [W] Energy attached to Dark Gyarados to the Pokémon that Knocked Out Dark Gyarados. Apply Weakness and Resistance. This power doesn’t work if Dark Gyarados is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Ice Beam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_HYPNO_9:
			return evolution (this, from:"Drowzee", hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				move "Psypunch", {
					text "20 damage."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bench Manipulation", {
					text "20× damage. You opponent flips a number of coins equal to the number of Pokémon on his or her Bench. This attack does 20 damage times the number of tails. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MACHAMP_10:
			return evolution (this, from:"Dark Machoke", hp:HP070, type:FIGHTING, retreatCost:3) {
				weakness PSYCHIC
				move "Mega Punch", {
					text "30 damage."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fling", {
					text "Your opponent shuffles his or her Active Pokémon and all cards attached to it into his or her deck. This attack can’t be used if your opponent has no Benched Pokémon."
					energyCost F, F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MAGNETON_11:
			return evolution (this, from:"Magnemite", hp:HP060, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				move "Sonicboom", {
					text "20 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnetic Lines", {
					text "30 damage. If the Defending Pokémon has any basic Energy cards attached to it, choose 1 of them. If your opponent have any Benched Pokémon, choose 1 of them and attach that Energy card to it."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_SLOWBRO_12:
			return evolution (this, from:"Slowpoke", hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				pokemonPower "Real In", {
					text "When you play Dark Slowbro from your hand, choose up to 3 Basic Pokémon and/or Evolution cards from you discard pile and put them into your hand."
					actionA {
					}
				}
				move "Fickle Attack", {
					text "40 damage. Flip a coin. If tails, this attack does nothing."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_VILEPLUME_13:
			return evolution (this, from:"Dark Gloom", hp:HP060, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokemonPower "Hay Fever", {
					text "No Trainer cards can be played. This power stops working while Dark Vileplume is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Petal Whirlwind", {
					text "30× damage. Flip a coins. This attack does 30 damage times the number of heads. If you get 2 or more heads, Dark Vileplume is now Confused (after doing damage)."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_WEEZING_14:
			return evolution (this, from:"Koffing", hp:HP060, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Mass Explosion", {
					text "20× damage. Does 20 damage times the number of Koffings, Weezings, and Dark Weezings in play. (Apply Weakness and Resistance.) Then, this attack does 20 damage to each Koffing, Weezing, and Dark Weezing (even your own). Don’t apply Weakness and Resistance."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stun Gas", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERE_COMES_TEAM_ROCKET_15:
			return basicTrainer (this) {
				text "Each player plays with his or her Prize cards face up for the rest of the game."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROCKETS_SNEAK_ATTACK_16:
			return basicTrainer (this) {
				text "Look at your opponent’s hand. If he or she has any Trainer cards, choose 1 of them. Your opponent shuffles that card into his or her deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case RAINBOW_ENERGY_17:
			return specialEnergy (this, [[C]]) {
				text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy counts as every type of basic Energy but only provides 1 Energy at a time. (Doesn’t count as a basic Energy card when not in play.) When you attach this card from your hand to 1 of your Pokémon, it does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case DARK_ALAKAZAM:
			return copy (DARK_ALAKAZAM_1, this)
			case DARK_ARBOK:
			return copy (DARK_ARBOK_2, this)
			case DARK_BLASTOISE:
			return copy (DARK_BLASTOISE_3, this)
			case DARK_CHARIZARD:
			return copy (DARK_CHARIZARD_4, this)
			case DARK_DRAGONITE:
			return copy (DARK_DRAGONITE_5, this)
			case DARK_DUGTRIO:
			return copy (DARK_DUGTRIO_6, this)
			case DARK_GOLBAT:
			return copy (DARK_GOLBAT_7, this)
			case DARK_GYARADOS:
			return copy (DARK_GYARADOS_8, this)
			case DARK_HYPNO:
			return copy (DARK_HYPNO_9, this)
			case DARK_MACHAMP:
			return copy (DARK_MACHAMP_10, this)
			case DARK_MAGNETON:
			return copy (DARK_MAGNETON_11, this)
			case DARK_SLOWBRO:
			return copy (DARK_SLOWBRO_12, this)
			case DARK_VILEPLUME:
			return copy (DARK_VILEPLUME_13, this)
			case DARK_WEEZING:
			return copy (DARK_WEEZING_14, this)
			case DARK_CHARMELEON:
			return evolution (this, from:"Charmander", hp:HP050, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Tail Slap", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fireball", {
					text "70 damage. Use this attack only if there are any [R] Energy cards attached to Dark Charmeleon. Flip a coin. If heads, discard 1 of those Energy cards. If tails, this attack does nothing (not even damage)."
					energyCost R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_DRAGONAIR:
			return evolution (this, from:"Dratini", hp:HP060, type:COLORLESS, retreatCost:2) {
				resistance PSYCHIC, MINUS30
				pokemonPower "Evolutionairy Light", {
					text "Once during your turn (before your attack), you may search your deck for an Evolution card. Show it to your opponent and put it into your hand. Shuffle your deck afterward. This power can’t be used if Dark Dragonair is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Tail Strike", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage. If tails, this attack does 20 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_ELECTRODE:
			return evolution (this, from:"Voltorb", hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Rolling Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Energy Bomb", {
					text "30 damage. Take all Energy cards attached to Dark Electrode and attach them to your Benched Pokémon (in any way you choose). If you have no Benched Pokémon, discard all Energy cards attached to Dark Electrode."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_FLAREON:
			return evolution (this, from:"Eevee", hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dark Flareon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flaying with Fire", {
					text "30+ damage. Use this attack only if there are any [R] Energy cards attached to Dark Flareon. Flip a coin. If heads, discard 1 of those Energy cards and this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GLOOM:
			return evolution (this, from:"Oddish", hp:HP050, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokemonPower "Pollen Stench", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, the Defending Pokémon is now Confused. If tails, your Active Pokémon is now Confused. This power can’t be used if Dark Gloom is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Poisonpowder", {
					text "10 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_GOLDUCK:
			return evolution (this, from:"Psyduck", hp:HP060, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Third Eye", {
					text "Discard 1 Energy card attached to Dark Golduck in order to draw up to 3 cards."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Psy", {
					text "50 damage."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_JOLTEON:
			return evolution (this, from:"Eevee", hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Lightning Flash", {
					text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Attack", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, Dark Jolteon does 10 damage to itself."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_KADABRA:
			return evolution (this, from:"Abra", hp:HP050, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				pokemonPower "Matter Exchange", {
					text "Once during your turn (before your attack), you may discard a card from your hand in order to draw a card. This power can’t be used if Dark Kadabra is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Mind Shock", {
					text "30 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MACHOKE:
			return evolution (this, from:"Machop", hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness PSYCHIC
				move "Drag Off", {
					text "20 damage. Before doing damage, choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. Do the damage to the new Defending Pokémon. This attack can’t be used if your opponent has not Benched Pokémon."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Knock Back", {
					text "30 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_MUK:
			return evolution (this, from:"Grimer", hp:HP060, type:GRASS, retreatCost:2) {
				weakness PSYCHIC
				pokemonPower "Sticky Goo", {
					text "As long as Dark Muk is your Active Pokémon, your opponent pays [C][C] more to retreat his or her Active Pokémon. This power stops working while Dark Muk is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Sludge Punch", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_PERSIAN:
			return evolution (this, from:"Meowth", hp:HP060, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Fascinate", {
					text "Flip a coin. If heads, choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. This attack can’t be used if your opponent has no Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Claws", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_PRIMEAPE:
			return evolution (this, from:"Mankey", hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				pokemonPower "Frenzy", {
					text "If Dark Primeape does any damage while it’s Confused (even to itself), it does 30 more damage."
					actionA {
					}
				}
				move "Frenzied Attack", {
					text "40 damage. Dark Primeape is now Confused (after doing damage)."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_RAPIDASH:
			return evolution (this, from:"Ponyta", hp:HP060, type:FIRE, retreatCost:0) {
				weakness WATER
				move "Rear Kick", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flame Pillar", {
					text "30 damage. You may discard 1 [R] Energy card attached to Dark Rapidash when you use this attack. If you do and your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_VAPOREON:
			return evolution (this, from:"Eevee", hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Bite", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Whirlpool", {
					text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_WARTORTLE:
			return evolution (this, from:"Squirtle", hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Doubleslap", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mirror Shell", {
					text "If an attack does damage to Dark Wartortle during your opponent’s next turn (even if Dark Wartortle is Knocked Out), Dark Wartortle attacks the Defending Pokémon for an equal amount of damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Flop", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rapid Evolution", {
					text "Search your deck for an Evolution card named Gyarados or Dark Gyarados and put it on Magikarp. (This counts as evolving Magikarp.) Shuffle your deck afterward."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Conversion 1", {
					text "If the Defending Pokémon has a Weakness, you may change it to a type of your choice other than Colorless."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psybeam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ABRA:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Vanish", {
					text "Shuffle Abra into your deck. (Discard all cards attached to Abra.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psyshock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness WATER
				pokemonPower "Gather Fire", {
					text "Once during your turn (before your attack), you may take 1 [R] Energy card attached to 1 of your other Pokémon and attach it to Charmander. This power can’t be used if Charmander is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Fire Tail", {
					text "20 damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARK_RATICATE:
			return evolution (this, from:"Rattata", hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Gnaw", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Fang", {
					text "50 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIGLETT:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:0) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Dig Under", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scratch", {
					text "20 damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRATINI:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				resistance PSYCHIC, MINUS30
				move "Wrap", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DROWZEE:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokemonPower "Long-Distance Hypnosis", {
					text "Once during your turn (before your attack), you may flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, your Active Pokémon is now Asleep. This power can’t be used if Drowzee is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Nightmare", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EEVEE:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sand-attack", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EKANS:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Sting", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRIMER:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Poison Gas", {
					text "The Defending Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sticky Hands", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage and the Defending Pokémon is now Paralyzed. If tails, this attack does 10 damage."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Gas", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHOP:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Punch", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Kick", {
					text "30 damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEMITE:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Tackle", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnetism", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Magnemite, Magneton, and Dark Magneton on your Bench."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANKEY:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:0) {
				weakness PSYCHIC
				move "Mischief", {
					text "Shuffle your opponent’s deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Anger", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage. If tails, this attack does 20 damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEOWTH:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Coin Hurl", {
					text "Choose 1 of your opponent’s Pokémon and flip a coin. If heads, this attack does 20 damage to that Pokémon. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ODDISH:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Sleep Powder", {
					text "The Defending Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poisonpowder", {
					text "The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Ember", {
					text "30 damage. Discard 1 [R] Energy card attached to Ponyta in order to use this attack."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PSYDUCK:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Dizziness", {
					text "Draw a card."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Water Gun", {
					text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Psyduck but not used to pay for this attack. You can’t add more than 20 damage in this way."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				pokemonPower "Trickery", {
					text "Once during your turn (before your attack), you may switch 1 of your Prizes with the top card of your deck. This power can’t be used if Rattata is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage. If tails, this attack does 10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWPOKE:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Afternoon Nap", {
					text "Search your deck for a [P] Energy card and attach it to Slowpoke. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Headbutt", {
					text "10 damage."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SQUIRTLE:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Shell Attack", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Speed Ball", {
					text "20 damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZUBAT:
			return basic (this, hp:HP040, type:GRASS, retreatCost:0) {
				weakness PSYCHIC
				resistance FIGHTING, MINUS30
				move "Ram", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "20 damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERE_COMES_TEAM_ROCKET:
			return copy (HERE_COMES_TEAM_ROCKET_15, this)
			case ROCKETS_SNEAK_ATTACK:
			return copy (ROCKETS_SNEAK_ATTACK_16, this)
			case THE_BOSSS_WAY:
			return basicTrainer (this) {
				text "Search your deck for an Evolution card with Dark in its name. Show it to your opponent and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case CHALLENGE:
			return basicTrainer (this) {
				text "Ask your opponent if he or she accepts your challenge. If your opponent declines (or if both Benches are full), draw 2 cards. If you opponent accepts, each of you searches your decks for any number of Basic Pokémon cards and puts them face down onto your Benches. (A player can’t do this if his or her Bench is full.) When you both have finished, shuffle your decks and turn those cards face up."
				onPlay {
				}
				playRequirement{
				}
			};
			case DIGGER:
			return basicTrainer (this) {
				text "Flip a coin. If tails, do 10 damage to your Active Pokémon. If heads, your opponent flips a coin. If tails, your opponent does 10 damage to his or her Active Pokémon. If heads, you flip a coin. Keep doing this until a player gets tails."
				onPlay {
				}
				playRequirement{
				}
			};
			case IMPOSTER_OAKS_REVENGE:
			return basicTrainer (this) {
				text "Discard a card from your hand in order to play this card. Your opponent shuffles his or her hand into his or her deck, then draws 4 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case NIGHTLY_GARBAGE_RUN:
			return basicTrainer (this) {
				text "Choose up to 3 Basic Pokémon cards, Evolution cards, and/or basic Energy cards from your discard pile. Show them to your opponent and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case GOOP_GAS_ATTACK:
			return basicTrainer (this) {
				text "All Pokémon Powers stop working until the end of your opponent’s next turn."
				onPlay {
				}
				playRequirement{
				}
			};
			case SLEEP:
			return basicTrainer (this) {
				text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
				onPlay {
				}
				playRequirement{
				}
			};
			case RAINBOW_ENERGY:
			return copy (RAINBOW_ENERGY_17, this)
			case FULL_HEAL_ENERGY:
			return specialEnergy (this, [[C]]) {
				text "If you play this card from your hand, the Pokémon you attach it to is no long Asleep, Confused, Paralyzed, or Poisoned.\nFull Heal Energy provides [C] energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case POTION_ENERGY:
			return specialEnergy (this, [[C]]) {
				text "If you play this card from your hand, remove 1 damage counter from the Pokémon you attach it to, if it has any.\nPotion Energy provides [C] energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case DARK_RAICHU:
			return evolution (this, from:"Pikachu", hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Surprise Thunder", {
					text "30 damage. Flip a coin. If heads, flip another coin. If the second coin is heads, this attack does 20 damage to each of your opponent’s Benched Pokémon. If the second coin is tails, this attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, L, L
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