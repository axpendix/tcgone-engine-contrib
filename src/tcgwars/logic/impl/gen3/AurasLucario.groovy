package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.TeamRocketReturns;
import tcgwars.logic.impl.gen3.UnseenForces;
import tcgwars.logic.impl.gen3.DeltaSpecies;

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
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author dxdydzd@gmail.com
 */
public enum AurasLucario implements LogicCardInfo {

  ASH_S_GROVYLE_1 ("Ash's Grovyle", "1", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _GRASS_]),
	ROTA_S_MEW_2 ("Rota's Mew", "2", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _PSYCHIC_]),
	ILENE_S_MIME_JR__3 ("Ilene's Mime Jr.", "3", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _PSYCHIC_]),
	ASH_S_PHANPY_4 ("Ash's Phanpy", "4", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _FIGHTING_]),
	ROTA_S_BONSLY_5 ("Rota's Bonsly", "5", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _FIGHTING_]),
	AARON_S_PIDGEOT_6 ("Aaron's Pidgeot", "6", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _COLORLESS_]),
	ASH_S_SWELLOW_7 ("Ash's Swellow", "7", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _COLORLESS_]),
	MAY_S_MUNCHLAX_8 ("May's Munchlax", "8", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _COLORLESS_]),
	KIDD_S_WEAVILE_9 ("Kidd's Weavile", "9", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _DARKNESS_]),
	KIDD_S_WEAVILE_10 ("Kidd's Weavile", "10", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _DARKNESS_]),
	BROCK_S_FORRETRESS_11 ("Brock's Forretress", "11", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _METAL_]),
	AURA_S_LUCARIO_12 ("Aura's Lucario", "12", Rarity.PROMO, [BASIC, POKEMON, VS, OWNERS_POKEMON, _METAL_]),
	ENERGY_SEARCH_13 ("Energy Search", "13", Rarity.PROMO, [TRAINER, ITEM]),
	POTION_14 ("Potion", "14", Rarity.PROMO, [TRAINER, ITEM]),
	TIME_FLOWER_15 ("Time Flower", "15", Rarity.PROMO, [TRAINER, ITEM]),
	SWITCH_16 ("Switch", "16", Rarity.PROMO, [TRAINER, ITEM]),
	POKEMON_REVERSAL_17 ("Pokémon Reversal", "17", Rarity.PROMO, [TRAINER, ITEM]),
	POKE_BALL_18 ("Poké Ball", "18", Rarity.PROMO, [TRAINER, ITEM]),
	AARON_S_AURA_19 ("Aaron's Aura", "19", Rarity.PROMO, [TRAINER, SUPPORTER]),
	DARK_METAL_ENERGY_20 ("Dark Metal Energy", "20", Rarity.PROMO, [ENERGY, SPECIAL_ENERGY]);
	 
  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  AurasLucario(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  public String getNumber() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.AURA_S_LUCARIO;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
			case ASH_S_GROVYLE_1:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1){
				weakness R
				move "Quick Attack" {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C, C
					onAttack {
						damage 10
						flip {damage 20}
					}
				}
				move "Sonicboom" {
					text "30 damage. This attack's damage isn't affected by Weakness or Resistance."
					energyCost C, C, C
					onAttack {
						noWrDamage(30, defending)
					}
				}
			};
			case ROTA_S_MEW_2:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1){
				weakness P
				move "Call for Family" {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					onAttack {
						callForFamily(basic: true, 1, delegate)
					}
				}
				move "Teleportation Burst" {
					text "20 damage. Switch Rota's Mew with 1 of your Benched Pokémon."
					energyCost P, C
					onAttack {
						damage 20
						switchYourActive()
					}
				}
			};
			case ILENE_S_MIME_JR__3:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1){
				weakness P
				move "Copy" {
					text "Choose 1 of the Defending Pokémon’s attacks. Copy 
						copies that attack. This attack does nothing if Ilene's 
						Mime Jr. doesn’t have the Energy necessary to use that 
						attack. (You must still do anything else required for that 
						attack.) Ilene's Mime Jr. performs that attack."
					energyCost C
					attackRequirement {
						assert defending.baseMoves : "No moves to perform"
					}
					onAttack {
						def moveOptions = defending.baseMoves
						def move = choose(moveOptions + ["End Turn (Skip)"], "Choose 1 of the Defending Pokémon's attacks. (Do not select a move if you don't have necessary energy or it will fail.)")
						if (move instanceof String) return
						def bef = blockingEffect(BETWEEN_TURNS)
						attack (move as Move)
						bef.unregisterItself(bg().em())
					}
				}
			};
			case ASH_S_PHANPY_4:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1){
				weakness G
				move "Collect" {
					text "Draw a card."
					energyCost C
					onAttack {
						draw 1
					}
				}
				move "Reckless Charge" {
					text "30 damage. Flip a coin. If tails, Ash's Phanpy does 10 damage to itself."
					energyCost F, C
					onAttack {
						damage 30
						flip 1, {}, {damage 10, self}
					}
				}
			};
			case ROTA_S_BONSLY_5:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1){
				weakness W
				move "Teary Eyes" {
					text "During your opponent’s next turn, any damage done to Rota's Bonsly by attacks is reduced by 20 (after applying Weakness and Resistance)."
					energyCost C
					onAttack {
						reduceDamageNextTurn(hp(20), thisMove)
					}
				}
				move "Flail" {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Rota's Bonsly."
					energyCost C, C
					onAttack {
						damage 10+10*self.numberOfDamageCounters
					}
				}
			};
			case AARON_S_PIDGEOT_6:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1){
				weakness L
				resistance F, MINUS30
				move "Whirlwind" {
					text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C, C
					onAttack {
						damage 10
						afterDamage{whirlwind()}
					}
				}
				move "Gust" {
					text "30 damage."
					energyCost  C, C, C
					onAttack {
						damage 30
					}
				}
			};
			case ASH_S_SWELLOW_7:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1){
				weakness L
				resistance F, MINUS30
				move "Focus Energy" {
					text "During your next turn, Ash's Swellow's Wing Attack attack’s base damage is 40."
					energyCost C
					onAttack {
						increasedBaseDamageNextTurn("Wing Attack", hp(20))
					}
				}
				move "Wing Attack" {
					text "20 damage."
					energyCost C, C
					onAttack {
						damage(20)
					}
				}
			};
			case MAY_S_MUNCHLAX_8:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1){
				weakness F
				move "Nap" {
					text "Remove 1 damage counter from May's Munchlax."
					energyCost C
					onAttack {
						heal 10, self
					}
				}
				move "Body Slam" {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					onAttack {
						damage 20
						flipThenApplySC PARALYZED
					}
				}
			};
			case KIDD_S_WEAVILE_9:
			return basic (this, hp:HP070, type:DARKNESS, retreatCost:1){
				weakness F
				resistance P, MINUS30
				pokeBody "Magic Condition", {
					text "As long as you have 2 or more Kidd's Weavile in play, Kidd's Weavile has no Weakness."
					getterA (GET_WEAKNESSES) { h->
						if(my.all.findAll{it.name == "Kidd's Weavile"}.size() >= 2 && h.effect.target == self) {
							def list = h.object as List<Weakness>
							list.clear()
						}
					}
				}
				move "Slash" {
					text "20 damage."
					energyCost C, C
					onAttack {
						damage 20
					}
				}
			};
			case KIDD_S_WEAVILE_10:
			return basic (this, hp:HP070, type:DARKNESS, retreatCost:1){
				weakness F
				resistance P, MINUS30
				pokeBody "Magic Float", {
					text "As long as you have 2 or more Kidd's Weavile in play, the Retreat Cost for Kidd's Weavile is 0."
					getterA (GET_RETREAT_COST, BEFORE_LAST, self) { h->
						if (my.all.findAll{it.name == "Kidd's Weavile"}.size() >= 2) {
							h.object = 0
						}
					}
				}
				move "Corner" {
					text "20 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
					energyCost D, C
					onAttack {
						damage 20
						afterDamage{cantRetreat defending}
					}
				}
			};
			case BROCK_S_FORRETRESS_11:
			return basic (this, hp:HP070, type:METAL, retreatCost:2){
				weakness R
				resistance G, MINUS30
				move "Linear Attack" {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost M, C
					onAttack {
						damage 20, opp.all.select()
					}
				}
				move "Tackle" {
					text "40 damage."
					energyCost M, C, C, C 
					onAttack {
						damage 40
					}
				}
			};
			case AURA_S_LUCARIO_12:
			return basic (this, hp:HP070, type:METAL, retreatCost:1){
				weakness R
				resistance G, MINUS30
				move "Detect" {
					text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Aura's Lucario during your opponent’s next turn."
					energyCost F
					onAttack {
						flip { preventAllEffectsNextTurn() }
					}
				}
				move "Quick Attack" {
					text "30 damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
					energyCost M, C, C
					onAttack {
						damage 30
						flip {damage 20}
					}
				}
			};
			case ENERGY_SEARCH_13:
			return copy(UnseenForces.ENERGY_SEARCH_94, this);
			case POTION_14:
			return copy(UnseenForces.POTION_95, this);
			case TIME_FLOWER_15:
			return itemCard(this) {
				text "Search your discard pile for up to 2 in any combination of Basic Pokémon or Evolution cards with the "VS" set symbol, show them to your opponent, and put them into your hand."
				playRequirement{
					assert my.discard.find {
						it.cardTypes.is(POKEMON) && it.cardTypes.is(VS)
					} : "You have no Basic Pokémon or Evolution cards with the "VS" set symbol in your discard pile"
				}
				onPlay {
					my.discard.select(max:2, "Search your discard pile for up to 2 Basic Pokémon or Evolution cards with the "VS" set symbol", {
						it.cardTypes.is(POKEMON) && it.cardTypes.is(VS)
					}).showToOpponent("Time Flower: Selected cards").moveTo(my.hand)
				}
			};
			case SWITCH_16:
			return copy(DeltaSpecies.SWITCH_102, this);
			case POKEMON_REVERSAL_17:
			return copy(UnseenForces.POKEMON_REVERSAL_88, this);
			case POKE_BALL_18:
			return copy(UnseenForces.POKE_BALL_87, this);
			case AARON_S_AURA_19:
			return supporter(this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
				"Search your deck for an Aura's Lucario or Aura's Lucario ex card and a [M] Energy card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
					my.deck.search(max: 3, "Select an Aura's Lucario (ex) card and a [M] Energy card",
					{["Aura's Lucario", "Aura's Lucario ex"].contains(it.name) || it.cardTypes.is(ENERGY) && it.containsTypePlain(M))},
					{CardList list -> list.filterByType(POKEMON).size() <= 1 && list.filterByType(ENERGY).size() <= 1}).showToOpponent("Aaron's Aura: Selected cards").moveTo(my.hand)
					shuffleDeck()
				}
			};
			case DARK_METAL_ENERGY_20:
			return copy(TeamRocketReturns.DARK_METAL_ENERGY_94, this);
		}
	}
}