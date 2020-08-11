package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.UnseenForces;

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
public enum PopSeries3 implements LogicCardInfo {

  BLASTOISE_1 ("Blastoise", "1", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  FLAREON_2 ("Flareon", "2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  JOLTEON_3 ("Jolteon", "3", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MINUN_4 ("Minun", "4", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  PLUSLE_5 ("Plusle", "5", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  VAPOREON_6 ("Vaporeon", "6", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  COMBUSKEN_7 ("Combusken", "7", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DONPHAN_8 ("Donphan", "8", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FORRETRESS_9 ("Forretress", "9", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HIGH_PRESSURE_SYSTEM_10 ("High Pressure System", "10", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  LOW_PRESSURE_SYSTEM_11 ("Low Pressure System", "11", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DITTO_12 ("Ditto", "12", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EEVEE_13 ("Eevee", "13", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  IVYSAUR_14 ("Ivysaur", "14", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MARSHTOMP_15 ("Marshtomp", "15", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PICHU_BROS__16 ("Pichu Bros.", "16", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  HO_OH_EX_17 ("Ho-Oh ex", "17", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PopSeries3(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_3;
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
      case BLASTOISE_1:
      return evolution (this, from:"Unown", hp:HP120, type:W, retreatCost:2) {
        weakness L
        move "Smash Turn", {
          text "30 damage. After your attack, you may switch Blastoise with 1 of your Benched Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            switchYourActive(may: true)
          }
        }
        move "Rocket Tackle", {
          text "60 damage. Blastoise does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Blastoise by attacks during your opponent's next turn."
          energyCost W, W, C, C
          onAttack {
            damage 60
            damage 10, self
            flip { preventAllDamageNextTurn() }
          }
        }
      };
      case FLAREON_2:
      return evolution (this, from:"Eevee", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
        move "Fire Spin", {
          text "70 damage. Discard 2 Basic energy cards attached to Flareon or this attack does nothing."
          energyCost F, F, C
          attackRequirement {
            assert self.cards.filterByType(BASIC_ENERGY).size() >= 2 : "Needs at least 2 Basic Energy cards attached"
          }
          onAttack {
            self.cards.filterByType(BASIC_ENERGY).select(count: 2, "Discard 2 Basic energy cards from $self.").discard()
            damage 70
          }
        }
      };
      case JOLTEON_3:
      return evolution (this, from:"Eevee", hp:HP070, type:L, retreatCost:0) {
        weakness F
        resistance M, MINUS30
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Pin Missile", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost L, C, C
          onAttack {
            flip 4, { damage 20 }
          }
        }
      };
      case MINUN_4:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Cheer Up", {
          text "Draw a card. If Plusle is in play, draw 2 cards instead."
          energyCost C
          onAttack {
            if (all.findAll {it.name == "Plusle"}) {
              bc "Plusle is in play and Cheer up allows drawing 2 cards."
              draw 2
            } else {
              draw 1
            }
          }
        }
        move "Negative Ion", {
          text "20 damage. During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 10 (before applying Weakness and Resistance)."
          energyCost L, C
          onAttack {
            damage 20
            reduceDamageFromDefendingNextTurn(hp(10), thisMove, defending)
          }
        }
        move "Power Bolt", {
          text "30 damage. Choose 1 of your opponent's Pokémon that has any Poké-Powers. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L
          attackRequirement {
            assert opp.all.any {
              it.abilities.keySet().find { ability -> ability instanceof PokePower }
            } : "Your opponent has no Pokémon with Poké-Powers."
          }
          onAttack {
            def validTargets = opp.all.findAll {
              it.abilities.keySet().find { ability ->
                ability instanceof PokePower
              }
            }
            damage 30, validTargets.select("Choose 1 of your opponent's Pokémon that has any Poké-Powers to deal 30 damage to it.")
          }
        }
      };
      case PLUSLE_5:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Cheer Up", {
          text "Draw a card. If Minun is in play, draw 2 cards instead."
          energyCost C
          onAttack {
            if (all.findAll {it.name == "Minun"}) {
              bc "Minun is in play and Cheer up allows drawing 2 cards."
              draw 2
            } else {
              draw 1
            }
          }
        }
        move "Positive Ion", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost L, C
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
        move "Body Bolt", {
          text "30 damage. Choose 1 of your opponent's Pokémon that has any Poké-bodies. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L
          attackRequirement {
            assert opp.all.any {
              it.abilities.keySet().find { ability -> ability instanceof PokeBody }
            } : "Your opponent has no Pokémon with Poké-Bodies."
          }
          onAttack {
            def validTargets = opp.all.findAll {
              it.abilities.keySet().find { ability ->
                ability instanceof PokeBody
              }
            }
            damage 30, validTargets.select("Choose 1 of your opponent's Pokémon that has any Poké-Bodies to deal 30 damage to it.")
          }
        }
      };
      case VAPOREON_6:
      return evolution (this, from:"Diglett", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Bite", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Water Gun", {
          text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Vaporeon but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost L, C
          onAttack {
            damage 30
            extraEnergyDamage(2, hp(20), W, thisMove)
          }
        }
      };
      case COMBUSKEN_7:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard a [R] Energy attached to Combusken."
          energyCost R, C, C
          onAttack {
            damage 50
            discardSelfEnergy(R)
          }
        }
      };
      case DONPHAN_8:
      return evolution (this, from:"Phanpy", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Sniff Out", {
          text "Put any 1 card from your discard pile into your hand."
          energyCost C
          attackRequirement { assert my.discard : "Discard pile is empty"}
          onAttack {
            my.discard.select("Select a card from your discard pile to move to your hand.").moveTo(my.hand)
          }
        }
        move "Fury Attack", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost F, C, C
          onAttack {
            flip 3, { damage 30 }
          }
        }
      };
      case FORRETRESS_9:
      return evolution (this, from:"Pineco", hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Toxic", {
          text "40 damage. The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, G, C
          onAttack {
            damage 40
            afterDamage {
              apply POISONED
              extraPoison 1
            }
          }
        }
      };
      case HIGH_PRESSURE_SYSTEM_10:
      return stadium (this) {
        text "Each player pays [C] less to retreat his or her [R] and [W] Pokemon)"
        def eff
        onPlay {
          eff = getter (GET_RETREAT_COST) { Holder h->
            if (h.effect.target.types.contains(R) || h.effect.target.types.contains(W)) {
              h.object -= 1
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case LOW_PRESSURE_SYSTEM_11:
      return stadium (this) {
        text "Each [G] and [L] Pokemon in play (both yours and your opponent's) gets +10 HP."
        def eff
        onPlay {
          eff = getter (GET_FULL_HP) { Holder h->
            if (h.effect.target.types.contains(G) || h.effect.target.types.contains(L)) {
              h.object += hp(10)
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case DITTO_12:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Psybeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, C
          onAttack {
            damage 20
            flip { applyAfterDamage(CONFUSED) }
          }
        }
      };
      case EEVEE_13:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "30 damage. Eevee does 10 damage to itself."
          energyCost C, C
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case IVYSAUR_14:
      return evolution (this, from:"Bulbasaur", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Gouge", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
        move "Poisonpowder", {
          text "40 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C, C
          onAttack {
            damage 40
            applyAfterDamage(POISONED)
          }
        }
      };
      case MARSHTOMP_15:
      return evolution (this, from:"Mudkip", hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Mud Slap", {
          text "20 damage."
          energyCost F
          onAttack {
            damage 20
          }
        }
        move "Double-edge", {
          text "40 damage. Marshtomp does 10 damage to itself."
          energyCost C, C, C
          onAttack {
            damage 40
            damage 10, self
          }
        }
      };
      case PICHU_BROS__16:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Bustle", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads. If either coin is heads, the Defending Pokémon is now Confused."
          energyCost L, L
          onAttack {
            flip "Bustle", 2, {damage 20 applyAfterDamage CONFUSED}, {}
          }
        }
      };
      case HO_OH_EX_17:
      return copy(UnseenForces.HO_OH_EX_104, this);
      default:
      return null;
    }
  }
}