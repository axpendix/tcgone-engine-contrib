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

import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.effect.*
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.special.*;

/**
 * @author 
 */
public enum JapaneseDPPromos implements LogicCardInfo {

  MIRACLE_DIAMOND_1 ("Miracle Diamond", "1", Rarity.PROMO, [TRAINER, ITEM]),
  MYSTERIOUS_PEARL_2 ("Mysterious Pearl", "2", Rarity.PROMO, [TRAINER, ITEM]),
  POKEMON_PAL_CITY_3 ("Pokémon Pal City", "3", Rarity.PROMO, [TRAINER, STADIUM]),
  STRIKING_BACK_MEWTWO_4 ("Striking Back Mewtwo", "4", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  EXPLOSIVE_BIRTH_LUGIA_5 ("Explosive Birth Lugia", "5", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  CRYSTAL_TOWER_S_ENTEI_6 ("Crystal Tower's Entei", "6", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _FIRE_]),
  TIMELESS_CELEBI_7 ("Timeless Celebi", "7", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _GRASS_]),
  ALTO_MARE_S_LATIAS_8 ("Alto Mare's Latias", "8", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  ALTO_MARE_S_LATIOS_9 ("Alto Mare's Latios", "9", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _COLORLESS_]),
  SEVEN_NIGHTS_JIRACHI_10 ("Seven Nights Jirachi", "10", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _METAL_]),
  VISITOR_DEOXYS_11 ("Visitor Deoxys", "11", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  TREE_OF_BEGINNING_S_MEW_12 ("Tree of Beginning's Mew", "12", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _PSYCHIC_]),
  WAVE_GUIDING_HERO_LUCARIO_13 ("Wave-Guiding Hero Lucario", "13", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _FIGHTING_]),
  PRINCE_OF_THE_SEA_MANAPHY_14 ("Prince of the Sea Manaphy", "14", Rarity.PROMO, [BASIC, POKEMON, OWNERS_POKEMON, _WATER_]);
    
  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  JapaneseDPPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.JapaneseDPPromos;
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
      case MIRACLE_DIAMOND_1:
        return itemCard (this) {
          text "Look at all of your face-down Prize cards. You may choose 1 Trainer, Supporter, or Stadium card you find there, show it to your opponent, and put it into your hand. If you do, put this card as a Prize card face up instead of discarding it."
          def tar = my.prizeCardSet.faceDownCards.select(hidden: false, min: 0, "Choose a trainer, supporter, or stadium card from your prizes.", {it.cardTypes.isIn(ITEM, SUPPORTER, STADIUM)})
          if (tar) {
            tar.showToOpponent("Your opponent has swapped this prize card with Miracle Diamond.").moveTo(my.hand)
            thisCard.moveTo(hidden:true, my.prizeCardSet)
            my.prizeCardSet.setVisible(thisCard, true)
          }
          playRequirement{
            assert my.prizeCardSet.faceDownCards.size() > 0 : "You cannot use this card if all of your prizes are face-up."
          }
        };
      case MYSTERIOUS_PEARL_2:
        return itemCard (this) {
          text "Look at all of your face-down Prize cards. You may choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. If you do, put this card as a Prize card face up instead of discarding it."
          def tar = my.prizeCardSet.faceDownCards.select(hidden: false, min: 0, "Choose a Pokemon card from your prizes.", {it.cardTypes.is(POKEMON)})
          if (tar) {
            tar.showToOpponent("Your opponent has swapped this prize card with Mysterious Pearl.").moveTo(my.hand)
            thisCard.moveTo(hidden:true, my.prizeCardSet)
            my.prizeCardSet.setVisible(thisCard, true)
          }
          playRequirement{
            assert my.prizeCardSet.faceDownCards.size() > 0 : "You cannot use this card if all of your prizes are face-up."
          }
        };
      case POKEMON_PAL_CITY_3:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nLook at the top 7 cards in your deck. Choose as many Basic Pokémon cards as you like and put those cards onto your Bench. Put the other cards back on top of your deck. Shuffle your deck afterward. (Ignore this effect if your Bench is full.)"
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action(thisCard, "Stadium: Pokémon Pal City") {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
              assert lastTurn != bg().turnCount : "You've already used Pokémon Pal City this turn."
              bc "Used Pokémon Pal City"
              lastTurn = bg().turnCount
              def top = my.deck.subList(0,7)
              top.select(min:0,max:my.bench.freeBenchCount,"Choose as many basic Pokemon as you like",it.cardTypes.is(BASIC)).each {
                benchPCS(it)
              shuffleDeck()
              }
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case STRIKING_BACK_MEWTWO_4:
        return basic  (this, hp:HP090, type:P, retreatCost:2) {
          weakness W, PLUS30
          move "Barrier", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Striking Back Mewtwo during your opponent’s next turn."
            energyCost P
            onAttack {
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Psywave", {
            text "20x damage. Does 20 damage times the number of Energy cards attached to the Defending Pokémon."
            energyCost P, C, C
            onAttack {
              damage 20 * defending.cards.energyCardCount()
            }
          }
        };
      case EXPLOSIVE_BIRTH_LUGIA_5:
        return basic  (this, hp:HP100, type:C, retreatCost:3) {
          weakness P, PLUS30
          resistance F, MINUS20
          move "Hyper Beam", {
            text "20 damage. Flip a coin. If heads, choose 1 Energy card attached to the Defending Pokémon, if any, and discard it."
            energyCost C, C, C
            onAttack {
              damage 20
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }
          move "Aeroblast", {
            text "40+ damage. Flip 2 coins. This attack does 40 damage plus 20 damage times the number of heads."
            energyCost C, C, C, C
            onAttack {
              damage 40
              flip 2, {
                damage 20
              }
            }
          }
        };
      case CRYSTAL_TOWER_S_ENTEI_6:
        return basic  (this, hp:HP080, type:R, retreatCost:2) {
          weakness W, PLUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "Opponent's Bench is empty"
            }
            onAttack {
              whirlwind()
            }
          }
          move "Fire Spin", {
            text "70 damage. Discard two Energy cards attached to Crystal Tower's Entei in order to use this attack."
            energyCost R, R, R, C
            attackRequirement {
              assert self.cards.filterByType(ENERGY).size() >= 2 : "Needs at least 2 Energy cards attached"
            }
            onAttack {
              def cards = self.cards.filterByType(ENERGY).select(count: 2, "Discard 2 Energy cards from $self.")
              damage 70
              afterDamage {
                cards.discard()
              }
            }
          }
        };
      case TIMELESS_CELEBI_7:
        return basic  (this, hp:HP060, type:G, retreatCost:1) {
          weakness F, PLUS10
          move "Heal Bell", {
            text "Remove 2 damage counters from each of your Pokémon."
            energyCost G
            onAttack {
              my.all.each{heal 20, it}
            }
          }
          move "Secret Power", {
            text "20+ damage. If a Stadium card is in play, this attack does 20 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if (bg.stadiumInfoStruct) {
                damage 30
              }
            }
          }
        };
      case ALTO_MARE_S_LATIAS_8:
        return basic  (this, hp:HP070, type:C, retreatCost:1) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Charm", {
            text "During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 30 (before applying Weakness and Resistance)."
            energyCost C
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(30), thisMove, defending)
            }
          }
          move "Water Sport", {
            text "20+ damage. If Alto Mare's Latias has less Energy attached to it than the Defending Pokémon, this attack does 20 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 30
              }
            }
          }
        };
      case ALTO_MARE_S_LATIOS_9:
        return basic  (this, hp:HP070, type:C, retreatCost:1) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Refresh", {
            text "Remove 2 damage counters and all special conditions Alto Mare's Latios."
            energyCost C
            onAttack {
              heal 20, self
              clearSpecialCondition self
            }
          }
          move "Double-Edge", {
            text "70 damage. Alto Mare's Latios does 20 damage to itself."
            energyCost C, C, C
            onAttack {
              damage 70
              damage 20, self
            }
          }
        };
      case SEVEN_NIGHTS_JIRACHI_10:
        return basic  (this, hp:HP060, type:M, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Future Soght", {
            text "Look at the top 5 cards of either player's deck and put them back on top of that player's deck in any order."
            energyCost C
            onAttack {
              foresight(5, delegate)
            }
          }
          move "Doom Desire", {
            text "Discard all Energy cards attached to Seven Nights Jirachi. At the end of your opponent's next turn, the Defending Pokémon is Knocked Out."
            energyCost M, M, M
            onAttack {
              discardAllSelfEnergy(null)
              targeted(defending) {
                delayed {
                  def activatedTurn, card
                  register {
                    activatedTurn = bg.turnCount
                    card = defending.topPokemonCard
                  }
                  before BETWEEN_TURNS, {
                    if (activatedTurn < bg.turnCount) {
                      if (defending.inPlay) {
                        bc "Doom Desire activates"
                        new Knockout(defending).run(bg);
                      }
                      unregister()
                    }
                  }
                  after FALL_BACK, defending, { unregister() }
                  after CHANGE_STAGE, defending, { unregister() }
                  after REMOVE_FROM_PLAY, defending, {
                    if (ef.removedCards.contains(card)) {
                      unregister()
                    }
                  }
                }
              }
            }
          }
        };
      case VISITOR_DEOXYS_11:
        return basic  (this, hp:HP080, type:P, retreatCost:2) {
          weakness P, PLUS20
          move "Refresh", {
            text "Discard a Psychic Energy attached to Visitor Deoxys and remove 4 damage counters from Visitor Deoxys."
            energyCost P
            onAttack {
              discardSelfEnergy P
              heal 40, self
            }
          }
          move "Psycho Boost", {
            text "60 damage. If you used Psycho Boost last turn, this attack does 30 damage instead."
            energyCost P, P, C
            onAttack {
              damage 60
              decreasedBaseDamageNextTurn("Psycho Boost", hp(30))
              }
            }
          }
        };
      case TREE_OF_BEGINNING_S_MEW_12:
        return basic  (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, PLUS10
          move "Teleport", {
            text "Switch Tree of Beginning's Mew with one of your Benched Pokémon."
            energyCost ()
            attackRequirement {
              assert my.bench : "No Pokémon on your bench."
            }
            onAttack {
              switchYourActive()
            }
          }
          move "Psychic", {
            text "Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C
            onAttack {
              damage 20 + 10 * defending.cards.energyCount(C)
            }
          }
        };
      case WAVE_GUIDING_HERO_LUCARIO_13:
        return basic  (this, hp:HP080, type:F, retreatCost:1) {
          weakness P, PLUS20
          move "Aura Sphere", {
            text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, C
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select("Does 10 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }
          move "Close Combat", {
            text "60 damage. During your opponent's next turn, any damage done to Wave-Guiding Hero Lucario by attacks is increased by 30 (after applying Weakness and Resistance).
            energyCost F, C, C
            onAttack {
              damage 60
              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.to == self && it.dmg.value && it.notNoEffect){
                        bc "${thisMove.name} +20"
                        it.dmg+=hp(20)
                      }
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, self, {unregister()}
                  after CHANGE_STAGE, self, {unregister()}
                }
              }
            }
          }
        };
      case PRINCE_OF_THE_SEA_MANAPHY_14:
        return basic  (this, hp:HP070, type:W, retreatCost:1) {
          weakness L, PLUS20
          move "Aqua Ring", {
            text "Switch Prince of the Sea Manaphy with one of your Benched Pokémon."
            energyCost W
            damage 20
            onAttack {
              switchYourActive()
            }
          }
          move "Heart Swap", {
            text "Choose 1 of your opponent's Benched Pokémon. Switch all damage counters on that Pokémon with those on your opponent's Active Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost W, C
            onAttack {
              def src = opp.all.findAll{it.numberOfDamageCounters}.select("Choose the Pokémon to move damage counters from")
              directDamage 10 * src.numberOfDamageCounters
              healAll(src)
            }
          }
        };
      }
    }
  }
