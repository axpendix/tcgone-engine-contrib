package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.EffectType.GET_POKEMON_TYPE;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*
import static tcgwars.logic.effect.special.SpecialConditionType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries9 implements LogicCardInfo {

  GARCHOMP_1 ("Garchomp", "1", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  MANAPHY_2 ("Manaphy", "2", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  RAICHU_3 ("Raichu", "3", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  REGIGIGAS_4 ("Regigigas", "4", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  ROTOM_5 ("Rotom", "5", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  BUIZEL_6 ("Buizel", "6", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  CROAGUNK_7 ("Croagunk", "7", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GABITE_8 ("Gabite", "8", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LOPUNNY_9 ("Lopunny", "9", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PACHIRISU_10 ("Pachirisu", "10", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PICHU_11 ("Pichu", "11", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  BUNEARY_12 ("Buneary", "12", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIMCHAR_13 ("Chimchar", "13", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  GIBLE_14 ("Gible", "14", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PIKACHU_15 ("Pikachu", "15", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIPLUP_16 ("Piplup", "16", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TURTWIG_17 ("Turtwig", "17", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PopSeries9(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_9;
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
      case GARCHOMP_1:
        return evolution (this, from:"Gabite", hp:HP130, type:COLORLESS, retreatCost:0) {
          weakness C, PLUS30
          move "Dragon Rage", {
            text "80 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {}, {}, [2:{ damage 80 }]
            }
          }
          move "Jet Sword", {
            text "100 damage. Discard 2 Energy attached to Garchomp and this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 100

              opp.bench.each {
                damage 10, it
              }
              discardSelfEnergyAfterDamage(C, C)
            }
          }
        };
      case MANAPHY_2:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Dive", {
            text "Look at the top 7 cards of your deck, choose 1 of them, and put it into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
            energyCost W
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              my.deck.subList(0, 7).select(text).moveTo(hidden:true, hand)
              shuffleDeck()
            }
          }
          move "Water Glow", {
            text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Remove from Manaphy the number of damage counters equal to the damage you did to that Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20, opp.all.select()
              removeDamageCounterEqualToDamageDone()
            }
          }
        };
      case RAICHU_3:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Slam", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 30 }
            }
          }
          move "High Volt", {
            text "60 damage. If Raichu evolved from Pikachu during this turn, this attack’s base damage is 100 instead of 60."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 60
              if (self.lastEvolved == bg.turnCount && self.cards.find { it.name == "Pikachu" }) {
                damage 40
              }
            }
          }
        };
      case REGIGIGAS_4:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC(PARALYZED)
            }
          }
          move "Double Stomp", {
            text "50+ damage. Flip 2 coins. This attack does 50 damage plus 20 damage for heads."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip 2, { damage 20 }
            }
          }
        };
      case ROTOM_5:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Type Shift", {
            text "Once during your turn (before your attack, you may use this power. Rotom’s type is [P] until the end of your turn."
            actionA {
              checkLastTurn()
              powerUsed()
              bc "$self's type is now Psychic until the end of this turn."
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    h.object.add(P)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Poltergeist", {
            text "30+ damage. Look at your opponent’s hand. This attack does 30 damage plus 10 more damage for each Trainer, Supporter, and Stadium card in your opponent’s hand."
            energyCost P, C
            attackRequirement {}
            onAttack {
              def filteredHand = opp.hand.showToMe("Opponent's hand").filterByType(ITEM, SUPPORTER, STADIUM)
              damage 30 + (10 * filteredHand.size())
            }
          }
        };
      case BUIZEL_6:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Whirlpool", {
            text "Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { discardDefendingEnergy() }
            }
          }
          move "Super Fast", {
            text "30 damage. If you have Pachirisu in play, flip a coin. If heads, prevent all effects of an attack, including damage, done to Buizel during your opponent’s next turn."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30
              if (my.all.findAll {it.name == "Pachirisu" }) {
                flip { preventAllEffectsNextTurn() }
              }
            }
          }
        };
      case CROAGUNK_7:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Knock Off", {
            text "Flip a coin. If heads, choose 1 card from your opponent’s hand without looking and discard it."
            energyCost C
            attackRequirement {
              assert opp.hand : "Opponent's hand is empty"
            }
            onAttack {
              flip {
                discardRandomCardFromOpponentsHand()
              }
            }
          }
          move "Nimble", {
            text "30 damage. If you have Turtwig in play, remove from Croagunk the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 30

              if (my.all.findAll {it.name == "Turtwig" }) {
                removeDamageCounterEqualToDamageDone()
              }
            }
          }
        };
      case GABITE_8:
        return evolution (this, from:"Gible", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          move "Burrow", {
            text "Flip a coin. If heads, prevent all damage done to Gabite by attacks during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { preventAllDamageNextTurn() }
            }
          }
          move "Distored Wave", {
            text "60 damage. Before doing damage, remove 2 damage counters from the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              heal(20, defending)
              damage 60
            }
          }
        };
      case LOPUNNY_9:
        return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Jump Kick", {
            text "20 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench) {
                damage 20, opp.bench.select(text)
              }
            }
          }
          move "Jazzed", {
            text "50 damage. If Lopunny evolved from Buneary during this turn, remove all damage counters from Lopunny."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50

              if (self.lastEvolved == bg.turnCount && self.cards.find { it.name == "Buneary" }) {
                healAll(self)
              }
            }
          }
        };
      case PACHIRISU_10:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Wave", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              flip { applyAfterDamage(PARALYZED) }
            }
          }
          move "Poison Berry", {
            text "20+ damage. If you have Croagunk in play, this attack does 20 damage plus 20 more damage and the Defending Pokémon is now Poisoned."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20

              if (my.all.findAll {it.name == "Croagunk" }) {
                damage 20
                applyAfterDamage(POISONED)
              }
            }
          }
        };
      case PICHU_11:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              checkCanBabyEvolve("Pikachu", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Pikachu", self)
            }
          }
          move "Find a Friend", {
            text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert deck.notEmpty : "Deck is empty"
            }
            onAttack {
              flip {
                my.deck.search(max: 1, cardTypeFilter(POKEMON)).showToOpponent(text).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
        };
      case BUNEARY_12:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Dizzy Punch", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, { damage 10 }
            }
          }
          move "Defense Curl", {
            text "Flip a coin. If heads, prevent all damage done to Buneary by attacks during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip { preventAllDamageNextTurn() }
            }
          }
        };
      case CHIMCHAR_13:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Serial Swipes", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost R
            attackRequirement {}
            onAttack {
              flip 4, { damage 10 }
            }
          }
          move "Sleepy", {
            text "40+ damage. If you have Piplup in play, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Asleep."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40

              if (my.all.findAll { it.name == "Piplup" }) {
                damage 20
                applyAfterDamage(ASLEEP)
              }
            }
          }
        };
      case GIBLE_14:
        return copy (MysteriousTreasures.GIBLE_85, this);
      case PIKACHU_15:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Growl", {
            text "During your opponent's next turn, any damage done by the attack from the Defending Pokémon is reduced by 20 (before applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Numb", {
            text "30 damage. If Pikachu evolved from Pichu during this turn, the Defending Pokémon is now Paralyzed."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (self.lastEvolved == bg.turnCount && self.cards.any {it.name == "Pichu" }) {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case PIPLUP_16:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Water Sport", {
            text "10+ damage. If Piplup has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus more 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              if (self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 10
              }
            }
          }
          move "Wavelet", {
            text "40 damage. If you have Buizel in play, this attack does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40

              if (my.all.findAll {it.name == "Buizel" }) {
                opp.bench.each {
                  damage 10, it
                }
              }
            }
          }
        };
      case TURTWIG_17:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Absorb", {
            text "10 damage. Remove 1 damage counter from Turtwig."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              heal 10, self
            }
          }
          move "Parboil", {
            text "40+ damage. If you have Chimchar in play, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Burned."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 40

              if (my.all.findAll {it.name == "Chimchar" }) {
                damage 20
                applyAfterDamage(BURNED)
              }
            }
          }
        };
      default:
        return null;
    }
  }
}
