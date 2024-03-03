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
public enum PokeParkForest implements LogicCardInfo {

  POKEPARK_S_CELEBI_1 ("PokéPark's Celebi", "1", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  POKEPARK_S_TORCHIC_2 ("PokéPark's Torchic", "2", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  POKEPARK_S_MUDKIP_3 ("PokéPark's Mudkip", "3", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]),
  POKEPARK_S_PIKACHU_4 ("PokéPark's Pikachu", "4", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _LIGHTNING_]),
  POKEPARK_S_LATIAS_5 ("PokéPark's Latias", "5", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  POKEPARK_S_LATIOS_6 ("PokéPark's Latios", "6", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  POKEPARK_S_WHISMUR_7 ("PokéPark's Whismur", "7", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  POKEPARK_S_MUNCHLAX_8 ("PokéPark's Munchlax", "8", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  POKEPARK_S_JIRACHI_9 ("PokéPark's Jirachi", "9", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _METAL_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokeParkForest(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEPARK_FOREST;
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
	  case POKEPARK_S_CELEBI_1:
	  return basic (this, hp:HP060, type:GRASS, retreatCost:1){
	    weakness R
			pokeBody "Natural Cure", {
				text "When you attach a [G] Energy card from your hand to PokéPark's Celebi, remove all Special Conditions from PokéPark's Celebi."
				delayedA {
          after ATTACH_ENERGY, self, {
            if(ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(G)){
              clearSpecialCondition(self, Source.SRC_ABILITY)
            }
          }
        }
			}
			move "Psyshock", {
				text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
        energyCost G, C
        onAttack {
          damage 20
          flipThenApplySC PARALYZED
        }
			}
	  };
	  case POKEPARK_S_TORCHIC_2:
	  return basic (this, hp:HP060, type:FIRE, retreatCost:1){
	    weakness W
			move "Scratch", {
				text "10 damage."
				energyCost C
				onAttack {
					damage 10
				}
			}
			move "Flamethrower", {
				text "40 damage. Discard a [R] Energy attached to PokéPark's Torchic."
				energyCost R, C, C
				onAttack {
					damage 40
					discardSelfEnergyAfterDamage R
				}
			}
	  };
	  case POKEPARK_S_MUDKIP_3:
	  return basic (this, hp:HP060, type:WATER, retreatCost:1){
	    weakness G
			move "Mud Slap", {
				text "10 damage."
				energyCost C
				onAttack {
					damage 10
				}
			}
			move "Whirlpool", {
				text "30 damage. If heads, discard an Energy card attached to the Defending Pokémon."
				energyCost W, C, C
				onAttack {
					damage 30
					afterDamage{
						flip {discardDefendingEnergy}
					}
				}
			}
	  };
	  case POKEPARK_S_PIKACHU_4:
	  return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1){
	    weakness F
			move "Quick Attack", {
				text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
				energyCost C
        onAttack {
					damage 10
					flip {damage 10}
				}
			}
			move "Thunderbolt", {
				text "60 damage. Discard all Energy cards attached to PokéPark's Pikachu."
				energyCost L, L, C
				onAttack {
					damage 60
					afterDamage{
						discardAllSelfEnergy()
					}
				}
			}
	  };
	  case POKEPARK_S_LATIAS_5:
	  return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1){
	    weakness P
			move "Psywave", {
				text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
        energyCost C
        onAttack {
          damage 10*defending.cards.energyCount(C)
        }
			}
			move "Mist Ball", {
				text "50 damage. Discard a [R] Energy and a [W] Energy attached to PokéPark's Latias."
				energyCost R, W, C
				onAttack {
					damage 50
					discardSelfEnergyAfterDamage R, W
				}
			}
	  };
	  case POKEPARK_S_LATIOS_6:
	  return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2){
	    weakness P
			move "Dragonbreath", {
				text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing."
				energyCost G, C
				onAttack {
					flip{
						damage 30
						applyAfterDamage PARALYZED
					}
				}
			}
			move "Luster Purge", {
				text "60 damage. Discard 3 Energy attached to PokéPark's Latios."
				energyCost L, C, C
				onAttack {
					damage 60
					discardSelfEnergyAfterDamage C, C, C
				}
			}
	  };
	  case POKEPARK_S_WHISMUR_7:
	  return basic (this, hp:HP060, type:COLORLESS, retreatCost:1){
	    weakness F
			move "Surprise", {
				text "Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
				energyCost C
				onAttack{
					astonish()
				}
			}
			move "Hyper Voice", {
				text "20 damage."
				energyCost C, C
				onAttack {
					damage 20
				}
			}
	  };
	  case POKEPARK_S_MUNCHLAX_8:
	  return basic (this, hp:HP060, type:COLORLESS, retreatCost:1){
	    weakness F
			move "Defense Curl", {
				text "Flip a coin. If heads, prevent all damage done to PokéPark's Munchlax during your opponent's next turn."
				energyCost C
				onAttack {
					flip {preventAllDamageNextTurn()}
				}
			}
			move "Body Slam", {
				text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
				energyCost C, C, C
				onAttack {
					damage 30
					flipThenApplySC PARALYZED
				}
			}
	  };
	  case POKEPARK_S_JIRACHI_9:
	  return basic (this, hp:HP050, type:METAL, retreatCost:1){
	    weakness R
			resistance G, MINUS30
			move "Foresight", {
				text "Look at the top 5 cards of either player's deck and put them back on top of that player's deck in any order."
				energyCost C
				foresight(5, delegate)
			}
			move "Swift", {
				text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
				energyCost M, C
				onAttack {
					swiftDamage(30, defending)
				}
			}
	  };
    default:
    return null;
		}
	}
}
