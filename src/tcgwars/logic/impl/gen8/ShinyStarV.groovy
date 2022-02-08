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
public enum ShinyStarV implements LogicCardInfo {

  THWACKEY_1 ("Thwackey", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  RESHIRAM_2 ("Reshiram", "2", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  KYOGRE_3 ("Kyogre", "3", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  SNOM_4 ("Snom", "4", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  ROTOM_5 ("Rotom", "5", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  KOFFING_6 ("Koffing", "6", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  CROBAT_VMAX_7 ("Crobat VMAX", "7", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  YVELTAL_8 ("Yveltal", "8", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  DITTO_V_9 ("Ditto V", "9", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  DITTO_VMAX_10 ("Ditto VMAX", "10", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
  TEAM_YELL_S_CHEERING_TOWEL_11 ("Team Yell's Cheering Towel", "11", Rarity.HOLORARE, [TRAINER, ITEM]),
  RUSTED_SWORD_12 ("Rusted Sword", "12", Rarity.HOLORARE, [TRAINER, POKEMON_TOOL, ITEM]),
  RUSTED_SHIELD_13 ("Rusted Shield", "13", Rarity.HOLORARE, [TRAINER, POKEMON_TOOL, ITEM]),
  BALL_GUY_14 ("Ball Guy", "14", Rarity.ULTRARARE, [TRAINER, SUPPORTER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  ShinyStarV(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SHINY_STAR_V;
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
      case THWACKEY_1:
      return evolution (this, from:"Grookey", hp:HP090, type:G, retreatCost:2) {
        weakness R
        bwAbility "Familiar Land", {
          text "If you have any Stadium card in play, this Pokémon has no Retreat Cost."
          getterA GET_RETREAT_COST, BEFORE_LAST, self, { h->
            if (bg.stadiumInfoStruct?.stadiumCard?.player == self.owner) {
              h.object = 0;
            }
          }
        }
        move "Branch Poke", {
          text "20 damage."
          energyCost G
          onAttack {
            damage 20
          }
        }
      };
      case RESHIRAM_2:
      return basic (this, hp:HP120, type:R, retreatCost:3) {
        weakness W
        move "Amazing Blaze", {
          text "270 damage. This Pokémon does 60 damage to itself."
          energyCost R, L, D
          onAttack {
            damage 270
            damage 60, self
          }
        }
      };
      case KYOGRE_3:
      return basic (this, hp:HP120, type:W, retreatCost:3) {
        weakness L
        move "Amazing Surge", {
          text "This attack does 80 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, L, M, C
          onAttack {
            opp.all.each { damage 80, it }
          }
        }
      };
      case SNOM_4:
      return basic (this, hp:HP050, type:W, retreatCost:2) {
        weakness M
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost W
          callForFamily basic:true, 1, delegate
        }
      };
      case ROTOM_5:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        bwAbility "Roto Choice", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for up to 2 Item cards that have the word 'Rotom' in their name, reveal them, and put them into your hand. Then, shuffle your deck."
          onActivate { reason ->
            if (reason == PLAY_FROM_HAND && confirm("Use $thisAbility?")) {
              def selection = deck.search max:2, { it.cardTypes.is(ITEM) && it.name.contains("Rotom") }
              selection.showToOpponent "$thisAbility used"
              selection.moveTo my.hand
              shuffleDeck()
            }
          }
        }
        move "Thunder Shock", {
          text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 30
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case KOFFING_6:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Ascension", {
          text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost D
          ascension delegate
        }
      };
      case CROBAT_VMAX_7:
      return evolution (this, from:"Crobat V", hp:HP300, type:D, retreatCost:1) {
        weakness F
        move "Stealth Poison", {
          text "70 damage. Your opponent's Active Pokémon is now Poisoned. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost D, C
          onAttack {
            damage 70
            applyAfterDamage POISONED
            switchYourActive()
          }
        }
        move "Max Cutter", {
          text "180 damage."
          energyCost D, D, C
          onAttack {
            damage 180
          }
        }
      };
      case YVELTAL_8:
      return basic (this, hp:HP110, type:D, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Amazing Destruction", {
          text "Your opponent's Active Pokémon is Knocked Out."
          energyCost R, P, D, C, C
          onAttack {
            afterDamage {
              new Knockout(defending).run(bg)
            }
          }
        }
      };
      case DITTO_V_9:
      return basic (this, hp:HP170, type:C, retreatCost:2) {
        weakness F
        bwAbility "V Transformation", {
          text "Once during your turn, you may switch this Pokémon with a Basic Pokémon V in your discard pile. Any attached cards, damage counters, Special Conditions, turns in play, and any other effects remain on the new Pokémon."
          actionA {
            assert my.discard.any { it.cardTypes.isAll(BASIC, POKEMON_V) } : "No Basic Pokémon V in your discard pile"
            checkLastTurn()
            powerUsed()
            def card = my.discard.select "Choose a Basic Pokémon V to switch with $self", { it.cardTypes.isAll(BASIC, POKEMON_V) }
            discard self.topPokemonCard
            card.moveTo suppressLog:true, self.cards
            bc "Switched with $card"
            bg.em().run new CheckAbilities(OTHER, new PcsList(self))
          }
        }
        move "Stick On", {
          text "Attach a basic Energy card from your discard pile to this Pokémon."
          energyCost C
          attackRequirement {
            assert my.discard.basicEnergyCardCount() : "No basic Energy card in discard pile"
          }
          onAttack {
            attachEnergyFrom basic:true, my.discard, self
          }
        }
      };
      case DITTO_VMAX_10:
      return evolution (this, from:"Ditto V", hp:HP320, type:C, retreatCost:3) {
        weakness F
        move "Max Transform", {
          text "Choose 1 of your opponent's Active Pokémon's attacks and use it as this attack."
          energyCost C, C, C
          onAttack {
            metronome defending, delegate
          }
        }
      };
      case TEAM_YELL_S_CHEERING_TOWEL_11:
      return itemCard (this) {
        text "Heal 50 damage from both Active Pokémon."
        onPlay {
          heal 50, my.active
          heal 50, opp.active
        }
        playRequirement{
          assert my.active.numberOfDamageCounters || opp.active.numberOfDamageCounters : "Neither Active Pokémon is damaged"
        }
      };
      case RUSTED_SWORD_12:
      return pokemonTool (this) {
        text "The attacks of the Zacian V this card is attached to do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay {reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              if (self.name != "Zacian V") return
              bg.dm().each {
                def conditions = it.from == self && it.to == opp.active
                if (!conditions) return
                bc "$thisCard +30"
                it.dmg += hp(30)
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case RUSTED_SHIELD_13:
      return pokemonTool (this) {
        text "The Zamazenta V this card is attached to gets +70 HP."
        def eff
        onPlay {reason->
          eff = getter GET_FULL_HP, self, { holder->
            if (self.name == "Zamazenta V")
              holder.object += hp(70)
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case BALL_GUY_14:
      return supporter (this) {
        text "Search your deck for up to 3 different Item cards that have the word 'Ball' in their name " +
          "reveal them and put them into your hand. Then shuffle your deck."
        onPlay {
          def selection = deck.search max:3, "$cardText", {
            it.cardTypes.is(ITEM) && it.name.contains("Ball")}, {
            def selectionTest = []
            def passed = true
            it.each {
              passed = !selectionTest.contains(it.name)
              if (!passed) return false
              selectionTest.add(it.name)
            }
            return passed
          }
          selection.showToOpponent "$name used"
          selection.moveTo my.hand
          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Deck is empty"
        }
      };
      default:
      return null;
    }
  }
}
