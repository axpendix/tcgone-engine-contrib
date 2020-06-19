package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.Emerald;
import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.CrystalGuardians;
import tcgwars.logic.impl.gen6.Flashfire;

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
 * @author lithogenn@gmail.com
 */
public enum PopSeries4 implements LogicCardInfo {

  CHIMECHO_DELTA_1 ("Chimecho", 1, Rarity.RARE, [POKEMON, BASIC, DELTA, _METAL_]),
  DEOXYS_DELTA_2 ("Deoxys", 2, Rarity.RARE, [POKEMON, BASIC, DELTA, _COLORLESS_]),
  FLYGON_3 ("Flygon", 3, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MEW_4 ("Mew", 4, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  SCEPTILE_5 ("Sceptile", 5, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  COMBUSKEN_6 ("Combusken", 6, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GROVYLE_7 ("Grovyle", 7, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HEAL_ENERGY_8 ("Heal Energy", 8, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  POKEMON_FAN_CLUB_9 ("Pokémon Fan Club", 9, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SCRAMBLE_ENERGY_10 ("Scramble Energy", 10, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  MUDKIP_11 ("Mudkip", 11, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PIDGEY_12 ("Pidgey", 12, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_13 ("Pikachu", 13, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SQUIRTLE_14 ("Squirtle", 14, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TREECKO_DELTA_15 ("Treecko", 15, Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  WOBBUFFET_16 ("Wobbuffet", 16, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DEOXYS_EX_17 ("Deoxys ex", 17, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries4(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_4;
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
      case CHIMECHO_DELTA_1:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness P
        move "Wrap", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Sonicboom", {
          text "30 damage. This attack's damage isn't affected by Weakness or Resistance."
          energyCost M, C
          attackRequirement {}
          onAttack {
            noWrDamage(30, defending)
          }
        }
      };
      case DEOXYS_DELTA_2:
      return copy(HolonPhantoms.DEOXYS_DELTA_5, this);
      case FLYGON_3:
      return evolution (this, from:"Vibrava", hp:HP120, type:F, retreatCost:2) {
        weakness W
        pokeBody "Levitate", {
          text "As long as Flygon has any Energy attached to it, the Retreat Cost for Flygon is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
            if (self.cards.energyCount(C)) {
              h.object = 0
            }
          }
        }
        move "Bite", {
          text "30 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Sand Pit", {
          text "70 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 70
            cantRetreat defending
          }
        }
      };
      case MEW_4:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokeBody "Reactive Barrier", {
          text "As long as Mew has any React Energy cards attached to it, prevent all effects, excluding damage, done to Mew by attacks from your opponent's Pokémon."
          delayedA {
            before null, self, Source.ATTACK, {
              if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages) && self.cards.findAll { it.name.contains("React Energy") }) {
                bc "Reactive Barrier prevented effect"
                prevent()
              }
            }
          }
        }
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case SCEPTILE_5:
      return evolution (this, from:"Grovyle", hp:HP100, type:G, retreatCost:3) {
        weakness R
        resistance W, MINUS30
        pokePower "Energy Trans", {
          text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Sceptile is affected by a Special Condition."
          actionA {
            checkNoSPC()
            assert my.all.findAll {it.cards.energyCount(G)>0} : "There are no Pokémon with [G] Energy cards"
            assert my.all.size()>=2 : "There is only one Pokémon on the field"

            powerUsed()
            def src=my.all.findAll {it.cards.energyCount(G)>0}.select("Source for [G]")
            def card=src.cards.filterByEnergyType(G).select("Card to move").first()
            def tar=my.all
            tar.remove(src)
            tar=tar.select("Target for [G]")
            energySwitch(src, tar, card)
          }
        }
        move "Tail Rap", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            flip 2, { damage 50 }
          }
        }
      };
      case COMBUSKEN_6:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
        move "Sky Uppercut", {
          text "40 damage. This attack's damage isn't affected by Resistance."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
            dontApplyResistance()
          }
        }
      };
      case GROVYLE_7:
      return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
        move "Blot", {
          text "20 damage. Remove 2 damage counters from Grovyle."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            heal 20, self
          }
        }
      };
      case HEAL_ENERGY_8:
      return copy(Deoxys.HEAL_ENERGY_94, this);
      case POKEMON_FAN_CLUB_9:
      return supporter (this) {
        text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
        onPlay {
          int count = bench.freeBenchCount>=2?2:1
          deck.search (max: count, cardTypeFilter(BASIC)).each {
            deck.remove(it)
            benchPCS(it)
          }
          shuffleDeck()
        }
        playRequirement{
          assert bench.notFull : "Bench is full"
          assert deck.notEmpty : "Deck is empty"
        }
      };
      case SCRAMBLE_ENERGY_10:
      return copy(Deoxys.SCRAMBLE_ENERGY_95, this);
      case MUDKIP_11:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Super Hypno Wave", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
            applyAfterDamage(ASLEEP)
          }
        }
      };
      case PIDGEY_12:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case PIKACHU_13:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Spark", {
          text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
            if (opp.bench) {
              damage 10, opp.bench.select("Deal 10 damage to?")
            }
          }
        }
      };
      case SQUIRTLE_14:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Shell Retreat", {
          text "As long as Squirtle has any Energy cards attached to it, damage done to Squirtle by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
            after APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && self.cards.energyCount(C) && it.dmg.value && it.notNoEffect) {
                  bc "Shell Retreat -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TREECKO_DELTA_15:
        return copy (CrystalGuardians.TREECKO_DELTA_68, this);
      case WOBBUFFET_16:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Nap", {
          text "Remove 2 damage counters from Wobbuffet."
          energyCost C
          attackRequirement {}
          onAttack {
            heal 20, self
          }
        }
        move "Expand", {
          text "20 damage. During your opponent's next turn, any damage done to Wobbuffet is reduced by 20 (after applying Weakness and Resistance)."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
            reduceDamageNextTurn(hp(20), thisMove)
          }
        }
      };
      case DEOXYS_EX_17:
      return copy(Emerald.DEOXYS_EX_93, this);
        default:
      return null;
    }
  }
}