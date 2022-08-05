package tcgwars.logic.impl.gen8;

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
 * @author lithogenn@gmail.com
 */
public enum EeveeHeroesVmaxSpecialSet implements LogicCardInfo {

  FLAREON_VMAX_1 ("Flareon VMAX", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIRE_]),
  VAPOREON_VMAX_2 ("Vaporeon VMAX", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  JOLTEON_VMAX_3 ("Jolteon VMAX", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _LIGHTNING_]),
  ESPEON_VMAX_4 ("Espeon VMAX", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  EeveeHeroesVmaxSpecialSet(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.EEVEE_HEROES_VMAX_SPECIAL_SET;
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
      case FLAREON_VMAX_1:
      return evolution (this, from:"Flareon V", hp:HP320, type:R, retreatCost:2) {
        weakness W
        move "Max Explosion", {
          text "100× damage. Discard the top 5 cards of your deck. This attack does 100 damage for each Energy card you discarded in this way."
          energyCost R, C, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def list = my.deck.subList(0, 5).discard()
              damage 100 * list.filterByType(ENERGY).size()
            }
          }

        };
      case VAPOREON_VMAX_2:
      return evolution (this, from:"Vaporeon V", hp:HP320, type:W, retreatCost:2) {
        weakness L
        move "Bubble Pod", {
          text " Put a [W] Pokémon from your discard pile onto your Bench. Then, attach up to 3 [W] Energy from your discard pile to that Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Max Rapids", {
          text "100+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 100 more damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case JOLTEON_VMAX_3:
      return evolution (this, from:"Jolteon V", hp:HP300, type:L, retreatCost:0) {
        weakness F
        move "Max Thunderclap", {
          text "100 damage. This attack also does 100 damage to 1 of your opponent's Benched Pokémon that already has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 100, opp.bench.findAll{ it.numberOfDamageCounters }.select("Deal 100 damage to which Pokémon?")
          }
        }
      };
      case ESPEON_VMAX_4:
      return evolution (this, from:"Espeon V", hp:HP310, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Solar Revelation", {
          text "Prevent all effects of your opponent's attacks, except damage, done to all of your Pokémon that have Energy attached. (Existing effects are not removed.)"
          actionA {
          }
        }
        move "Max Mindstorm", {
          text "60× damage. This attack does 60 damage for each Energy attached to all of your opponent's Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      default:
      return null;
    }
  }
}
