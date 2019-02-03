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
public enum HeartgoldSoulsilverPromos implements CardInfo {

	HO_OH_& ("Ho-Oh", &, Rarity.SOULSILVER, [BASIC, POKEMON, _FIRE_]),
	LUGIA_& ("Lugia", &, Rarity.SOULSILVER, [BASIC, POKEMON, _WATER_]),
	PIKACHU_& ("Pikachu", &, Rarity.SOULSILVER, [BASIC, POKEMON, _LIGHTNING_]),
	WOBBUFFET_& ("Wobbuffet", &, Rarity.SOULSILVER, [BASIC, POKEMON, _PSYCHIC_]),
	HOOTHOOT_& ("Hoothoot", &, Rarity.SOULSILVER, [BASIC, POKEMON, _COLORLESS_]),
	NOCTOWL_& ("Noctowl", &, Rarity.SOULSILVER, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	FERALIGATR_PRIME_& ("Feraligatr Prime", &, Rarity.SOULSILVER, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	MEGANIUM_PRIME_& ("Meganium Prime", &, Rarity.SOULSILVER, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	TYPHLOSION_PRIME_& ("Typhlosion Prime", &, Rarity.SOULSILVER, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	LATIAS_& ("Latias", &, Rarity.SOULSILVER, [BASIC, POKEMON, _COLORLESS_]),
	LATIOS_& ("Latios", &, Rarity.SOULSILVER, [BASIC, POKEMON, _COLORLESS_]),
	CLEFFA_& ("Cleffa", &, Rarity.SOULSILVER, [BASIC, POKEMON, _COLORLESS_]),
	SMOOCHUM_& ("Smoochum", &, Rarity.SOULSILVER, [BASIC, POKEMON, _PSYCHIC_]),
	LAPRAS_& ("Lapras", &, Rarity.SOULSILVER, [BASIC, POKEMON, _WATER_]),
	SHUCKLE_& ("Shuckle", &, Rarity.SOULSILVER, [BASIC, POKEMON, _FIGHTING_]),
	PLUSLE_& ("Plusle", &, Rarity.SOULSILVER, [BASIC, POKEMON, _LIGHTNING_]),
	MINUN_& ("Minun", &, Rarity.SOULSILVER, [BASIC, POKEMON, _LIGHTNING_]),
	TROPICAL_TIDAL_WAVE_& ("Tropical Tidal Wave", &, Rarity.SOULSILVER, [TRAINER]),
	RAIKOU_& ("Raikou", &, Rarity.SOULSILVER, [BASIC, POKEMON, _LIGHTNING_]),
	ENTEI_& ("Entei", &, Rarity.SOULSILVER, [BASIC, POKEMON, _FIRE_]),
	SUICUNE_& ("Suicune", &, Rarity.SOULSILVER, [BASIC, POKEMON, _WATER_]),
	PORYGON_& ("Porygon", &, Rarity.SOULSILVER, [BASIC, POKEMON, _COLORLESS_]),
	PORYGON2_& ("Porygon2", &, Rarity.SOULSILVER, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	HITMONCHAN_& ("Hitmonchan", &, Rarity.SOULSILVER, [BASIC, POKEMON, _FIGHTING_]),
	HITMONLEE_& ("Hitmonlee", &, Rarity.SOULSILVER, [BASIC, POKEMON, _FIGHTING_]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	HeartgoldSoulsilverPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.HEARTGOLD_SOULSILVER_PROMOS;
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
			case HO_OH_&:
			return basic (this, hp:HP080, type:FIRE, retreatCost:3) {
				weakness W
				resistance F, MINUS20
				move "Combustion", {
					text "20 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sacred Fire", {
					text "Flip a coin. If heads, choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUGIA_&:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				resistance F, MINUS20
				move "Wave Splash", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aeroblast", {
					text "Flip 2 coins. This attack does 50 damage plus 20 more damage for each heads."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_&:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Recharge", {
					text "Energy card and attach it to Pikachu. Shuffle your deck afterward."
					energyCost C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "100 damage. Discard all Energy attached to Pikachu."
					energyCost L, L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WOBBUFFET_&:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
				weakness P
				pokeBody "Tenacious Bind", {
					text "As long as Wobbuffet is your Active Pokémon, your opponent’s Active Pokémon’s Retreat Cost is Energy more."
					delayedA {
					}
				}
				move "Trip Over", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 30 more damage."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOOTHOOT_&:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokeBody "Insomnia", {
					text "Hoothoot can’t be Asleep."
					delayedA {
					}
				}
				move "Peck", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NOCTOWL_&:
			return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokePower "Night Scope", {
					text "Once during your turn , you may look at your opponent’s hand. This power can’t be used if Noctowl is affected by a Special Condition."
					actionA {
					}
				}
				move "Hypnoblast", {
					text "30 damage. The Defending Pokémon is now Asleep."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FERALIGATR_PRIME_&:
			return evolution (this, from:"Croconaw", hp:HP140, type:WATER, retreatCost:3) {
				weakness G
				pokePower "Rain Dance", {
					text "As often as you like during your turn , you may attach a Energy from your hand to 1 of your Pokémon. This power can’t be used if Feraligatr is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Crunch", {
					text "60+ damage. Does 60 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEGANIUM_PRIME_&:
			return evolution (this, from:"Bayleef", hp:HP150, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				pokePower "Leaf Trans", {
					text "As often as you like during your turn , you may move a Energy attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Meganium is affected by a Special Condition."
					actionA {
					}
				}
				move "Solarbeam", {
					text "80 damage. "
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYPHLOSION_PRIME_&:
			return evolution (this, from:"Quilava", hp:HP140, type:FIRE, retreatCost:2) {
				weakness W
				pokePower "Afterburner", {
					text "Once during your turn , you may search your discard pile for a Energy card and attach it to 1 of your Pokémon. If you do, put 1 damage counter on that Pokémon. This power can’t be used if Typhlosion is affected by a Special Condition."
					actionA {
					}
				}
				move "Flare Destroy", {
					text "70 damage. Discard an Energy card attached to Typhlosion and discard an Energy card attached to the Defending Pokémon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIAS_&:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness C
				move "Energy Assist", {
					text "10 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Infinite Wind", {
					text "40 damage. If Latios is on your Bench, remove 2 damage counters from each of your Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIOS_&:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness C
				pokeBody "Luster Float", {
					text "If you have Latias in play, the Retreat Cost for Latios is 0."
					delayedA {
					}
				}
				move "Infinite Wing", {
					text "80 damage. Discard 2 Energy attached to Latios."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFFA_&:
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
			case SMOOCHUM_&:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Smoochum is Asleep, prevent all damage done to Smoochum by attacks."
					delayedA {
					}
				}
				move "Energy Antics", {
					text "Move an Energy card attached to 1 of your opponent’s Pokémon to another of your opponent’s Pokémon. Smoochum is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LAPRAS_&:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness M
				move "Ferry", {
					text "Search your discard pile for a Supporter card, show it to your opponent, and put it into your hand."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Surf", {
					text "40 damage. "
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHUCKLE_&:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness W
				pokeBody "Fermenting Liquid", {
					text "Whenever you attach an Energy card from your hand to Shuckle, draw a card."
					delayedA {
					}
				}
				move "Shell Stunner", {
					text "20 damage. Flip a coin. If heads, prevent all damage done to Shuckle by attacks during your opponent’s next turn."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PLUSLE_&:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Collect", {
					text "Draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Jolt", {
					text "20 damage. Flip a coin. If tails, Plusle does 10 damage to itself."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MINUN_&:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Call for Family", {
					text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tag Team Boost", {
					text "10+ damage. If Plusle is on your Bench, this attack does 10 damage plus 20 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPICAL_TIDAL_WAVE_&:
			return basicTrainer (this) {
				text "Flip a coin. If heads, discard all Trainer and Stadium cards your opponent has in play. If tails, discard all Trainer and Stadium cards you have in play."
				onPlay {
				}
				playRequirement{
				}
			};
			case RAIKOU_&:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Zap Cannon", {
					text "70 damage. During your next turn, Raikou can’t use Zap Cannon."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ENTEI_&:
			return basic (this, hp:HP080, type:FIRE, retreatCost:1) {
				weakness W
				move "Flare Blitz", {
					text "80 damage. Energy attached to Entei."
					energyCost R, R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUICUNE_&:
			return basic (this, hp:HP080, type:WATER, retreatCost:1) {
				weakness L
				move "Sheer Cold", {
					text "50 damage. Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_&:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Stiffen", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Version Update", {
					text "Search your deck for Porygon2, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON2_&:
			return evolution (this, from:"Porygon", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness F
				pokeBody "Shortcut", {
					text "The Retreat Cost for each Porygon, Porygon2, and Porygon-Z you have in play is 1 Energy less."
					delayedA {
					}
				}
				move "Reckless Charge", {
					text "50 damage. Porygon2 does 10 damage to itself."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONCHAN_&:
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
			case HITMONLEE_&:
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
					energyCost F, C, C
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
