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

	HO_OH_HGSS01 ("Ho-Oh", HGSS01, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	LUGIA_HGSS02 ("Lugia", HGSS02, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PIKACHU_HGSS03 ("Pikachu", HGSS03, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	WOBBUFFET_HGSS04 ("Wobbuffet", HGSS04, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	HOOTHOOT_HGSS05 ("Hoothoot", HGSS05, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	NOCTOWL_HGSS06 ("Noctowl", HGSS06, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	FERALIGATR_PRIME_HGSS07 ("Feraligatr Prime", HGSS07, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	MEGANIUM_PRIME_HGSS08 ("Meganium Prime", HGSS08, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	TYPHLOSION_PRIME_HGSS09 ("Typhlosion Prime", HGSS09, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	LATIAS_HGSS10 ("Latias", HGSS10, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	LATIOS_HGSS11 ("Latios", HGSS11, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	CLEFFA_HGSS12 ("Cleffa", HGSS12, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	SMOOCHUM_HGSS13 ("Smoochum", HGSS13, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	LAPRAS_HGSS14 ("Lapras", HGSS14, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	SHUCKLE_HGSS15 ("Shuckle", HGSS15, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	PLUSLE_HGSS16 ("Plusle", HGSS16, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	MINUN_HGSS17 ("Minun", HGSS17, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TROPICAL_TIDAL_WAVE_HGSS18 ("Tropical Tidal Wave", HGSS18, Rarity.PROMO, [TRAINER]),
	RAIKOU_HGSS19 ("Raikou", HGSS19, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	ENTEI_HGSS20 ("Entei", HGSS20, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	SUICUNE_HGSS21 ("Suicune", HGSS21, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PORYGON_HGSS22 ("Porygon", HGSS22, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	PORYGON2_HGSS23 ("Porygon2", HGSS23, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	HITMONCHAN_HGSS24 ("Hitmonchan", HGSS24, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	HITMONLEE_HGSS25 ("Hitmonlee", HGSS25, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
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
			case HO_OH_HGSS01:
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
					text "Flip a coin. If heads, choose 1 of your opponent�s Pok�mon. This attack does 80 damage to that Pok�mon. This attack�s damage isn�t affected by Weakness or Resistance."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUGIA_HGSS02:
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
			case PIKACHU_HGSS03:
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
			case WOBBUFFET_HGSS04:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
				weakness P
				pokeBody "Tenacious Bind", {
					text "As long as Wobbuffet is your Active Pok�mon, your opponent�s Active Pok�mon�s Retreat Cost is Energy more."
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
			case HOOTHOOT_HGSS05:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokeBody "Insomnia", {
					text "Hoothoot can�t be Asleep."
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
			case NOCTOWL_HGSS06:
			return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				pokePower "Night Scope", {
					text "Once during your turn , you may look at your opponent�s hand. This power can�t be used if Noctowl is affected by a Special Condition."
					actionA {
					}
				}
				move "Hypnoblast", {
					text "30 damage. The Defending Pok�mon is now Asleep."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FERALIGATR_PRIME_HGSS07:
			return evolution (this, from:"Croconaw", hp:HP140, type:WATER, retreatCost:3) {
				weakness G
				pokePower "Rain Dance", {
					text "As often as you like during your turn , you may attach a Energy from your hand to 1 of your Pok�mon. This power can�t be used if Feraligatr is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Crunch", {
					text "60+ damage. Does 60 damage plus 10 more damage for each damage counter on the Defending Pok�mon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEGANIUM_PRIME_HGSS08:
			return evolution (this, from:"Bayleef", hp:HP150, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				pokePower "Leaf Trans", {
					text "As often as you like during your turn , you may move a Energy attached to 1 of your Pok�mon to another of your Pok�mon. This power can�t be used if Meganium is affected by a Special Condition."
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
			case TYPHLOSION_PRIME_HGSS09:
			return evolution (this, from:"Quilava", hp:HP140, type:FIRE, retreatCost:2) {
				weakness W
				pokePower "Afterburner", {
					text "Once during your turn , you may search your discard pile for a Energy card and attach it to 1 of your Pok�mon. If you do, put 1 damage counter on that Pok�mon. This power can�t be used if Typhlosion is affected by a Special Condition."
					actionA {
					}
				}
				move "Flare Destroy", {
					text "70 damage. Discard an Energy card attached to Typhlosion and discard an Energy card attached to the Defending Pok�mon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIAS_HGSS10:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness C
				move "Energy Assist", {
					text "10 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pok�mon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Infinite Wind", {
					text "40 damage. If Latios is on your Bench, remove 2 damage counters from each of your Benched Pok�mon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LATIOS_HGSS11:
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
			case CLEFFA_HGSS12:
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
			case SMOOCHUM_HGSS13:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Smoochum is Asleep, prevent all damage done to Smoochum by attacks."
					delayedA {
					}
				}
				move "Energy Antics", {
					text "Move an Energy card attached to 1 of your opponent�s Pok�mon to another of your opponent�s Pok�mon. Smoochum is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LAPRAS_HGSS14:
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
			case SHUCKLE_HGSS15:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness W
				pokeBody "Fermenting Liquid", {
					text "Whenever you attach an Energy card from your hand to Shuckle, draw a card."
					delayedA {
					}
				}
				move "Shell Stunner", {
					text "20 damage. Flip a coin. If heads, prevent all damage done to Shuckle by attacks during your opponent�s next turn."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PLUSLE_HGSS16:
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
			case MINUN_HGSS17:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Call for Family", {
					text "Search your deck for up to 2 Basic Pok�mon and put them onto your Bench. Shuffle your deck afterward."
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
			case TROPICAL_TIDAL_WAVE_HGSS18:
			return basicTrainer (this) {
				text "Flip a coin. If heads, discard all Trainer and Stadium cards your opponent has in play. If tails, discard all Trainer and Stadium cards you have in play."
				onPlay {
				}
				playRequirement{
				}
			};
			case RAIKOU_HGSS19:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Zap Cannon", {
					text "70 damage. During your next turn, Raikou can�t use Zap Cannon."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ENTEI_HGSS20:
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
			case SUICUNE_HGSS21:
			return basic (this, hp:HP080, type:WATER, retreatCost:1) {
				weakness L
				move "Sheer Cold", {
					text "50 damage. Flip a coin. If heads, the Defending Pok�mon can�t attack during your opponent�s next turn."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_HGSS22:
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
			case PORYGON2_HGSS23:
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
			case HITMONCHAN_HGSS24:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Detect", {
					text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to Hitmonchan during your opponent�s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sky Uppercut", {
					text "30 damage. This attack�s damage isn�t affected by Resistance."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONLEE_HGSS25:
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
