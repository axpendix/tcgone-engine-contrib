package tcgwars.logic.impl.gen7;

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

import tcgwars.logic.card.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum DetectivePikachu implements LogicCardInfo {

  BULBASAUR_1 ("Bulbasaur", 1, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LUDICOLO_2 ("Ludicolo", 2, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MORELULL_3 ("Morelull", 3, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHARMANDER_4 ("Charmander", 4, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARIZARD_5 ("Charizard", 5, Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  ARCANINE_6 ("Arcanine", 6, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  PSYDUCK_7 ("Psyduck", 7, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAGIKARP_8 ("Magikarp", 8, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GRENINJA_9 ("Greninja", 9, Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  DETECTIVE_PIKACHU_10 ("Detective Pikachu", 10, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  MR_MIME_11 ("Mr. Mime", 11, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEWTWO_12 ("Mewtwo", 12, Rarity.ULTRARARE, [POKEMON, BASIC, _PSYCHIC_]),
  MACHAMP_13 ("Machamp", 13, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  JIGGLYPUFF_14 ("Jigglypuff", 14, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  SNUBBULL_15 ("Snubbull", 15, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  LICKITUNG_16 ("Lickitung", 16, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DITTO_17 ("Ditto", 17, Rarity.ULTRARARE, [POKEMON, BASIC, _COLORLESS_]),
  SLAKING_18 ("Slaking", 18, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  DetectivePikachu(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DETECTIVE_PIKACHU;
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
      case BULBASAUR_1:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R
          move "Find a Friend", {
            text "Search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost G
            attackRequirement {
              assert deck
            }
            onAttack {
              deck.search("Search your deck for a [G] Pokémon", pokemonTypeFilter(G)).moveTo(hand)
              shuffleDeck()
            }
          }

        };
      case LUDICOLO_2:
        return evolution (this, from:"Lombre", hp:HP140, type:G, retreatCost:3) {
          weakness R
          bwAbility "Table Service", {
            text "Once during your turn (before your attack), you may heal 30 damage from 1 of your Pokémon."
            actionA {
              checkLastTurn()
              def list=my.all.findAll{it.numberOfDamageCounters}
              assert list
              powerUsed()
              heal 30, list.select(), SRC_ABILITY
            }
          }
          move "Punch and Run", {
            text "70 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 70
              switchYourActive()
            }
          }

        };
      case MORELULL_3:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R
          move "Sleep Spore", {
            text "10 damage. Your opponent’s Active Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage(ASLEEP)
            }
          }

        };
      case CHARMANDER_4:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness W
          move "Reckless Charge", {
            text "20 damage. This Pokémon does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              damage 10,self
            }
          }

        };
      case CHARIZARD_5:
        return evolution (this, from:"Charmeleon", hp:HP180, type:R, retreatCost:3) {
          weakness W
          move "Slash", {
            text "70 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
          move "Wild Tackle", {
            text "180 damage. This Pokémon does 50 damage to itself."
            energyCost R, C, C, C
            attackRequirement {}
            onAttack {
              damage 180
              damage 50,self
            }
          }

        };
      case ARCANINE_6:
        return evolution (this, from:"Growlithe", hp:HP120, type:R, retreatCost:3) {
          weakness W
          bwAbility "Security Guard", {
            text "As long as this Pokémon is your Active Pokémon, all of your Pokémon take 30 less damage from your opponent's attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(self.active && it.to.owner==self.owner && it.from.owner!=it.to.owner && ef.attacker.owner!=self.owner && it.notNoEffect && it.notZero){
                    bc "Security Guard -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Sharp Fang", {
            text "90 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 90
            }
          }

        };
      case PSYDUCK_7:
        return basic (this, hp:HP080, type:W, retreatCost:3) {
          weakness G
          move "Panic", {
            text "10 damage. This Pokémon is now Confused."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {apply(CONFUSED,self)}
            }
          }

        };
      case MAGIKARP_8:
        return basic (this, hp:HP030, type:W, retreatCost:1) {
          weakness L
          move "Hold Still", {
            text "Heal 10 damage from this Pokémon."
            energyCost W
            attackRequirement {
              assert self.numberOfDamageCounters
            }
            onAttack {
              heal 10, self
            }
          }

        };
      case GRENINJA_9:
        return evolution (this, from:"Frogadier", hp:HP140, type:W, retreatCost:1) {
          weakness G
          bwAbility "Evasion Jutsu", {
            text "If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage."
            delayedA (priority: BEFORE_LAST) {
              before APPLY_ATTACK_DAMAGES, {
                def entry=bg.dm().find({it.to==self && it.dmg.value && it.notNoEffect})
                if(entry){
                  flip "Evasion Jutsu", {
                    entry.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Furious Shurikens", {
            text "This attack does 50 damage to 2 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W
            attackRequirement {}
            onAttack {
              multiDamage(opp.all,2,50)
            }
          }

        };
      case DETECTIVE_PIKACHU_10:
        return basic (this, hp:HP090, type:L, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          move "Scout", {
            text "Your opponent reveals their hand."
            energyCost L
            attackRequirement {
              assert opp.hand
            }
            onAttack {
              opp.hand.showToMe("Opponent's hand")
            }
          }
          move "Surprise Attack", {
            text "80 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip{damage 80}
            }
          }

        };
      case MR_MIME_11:
        return basic (this, hp:HP080, type:P, retreatCost:1) {
          weakness P
          bwAbility "Pantomime", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may switch 1 of your face-down Prize cards with the top card of your deck."
            onActivate{
              if(it==PLAY_FROM_HAND && my.prizeCardSet.faceDownCards && my.deck && confirm("Use Pantomime?")){
                powerUsed()
                def tar = my.prizeCardSet.select(hidden: true, "Prize to replace with the top card of your deck").first()
                def ind = my.prizeCardSet.indexOf(tar)
                my.prizeCardSet.set(ind, my.deck.remove(0))
                my.deck.add(0,tar)
              }
            }
          }
          move "Juggling", {
            text "20x damage. Flip 4 coins. This attack does 20 damage for each heads."
            energyCost P, C
            attackRequirement {}
            onAttack {
              flip 4,{damage 20}
            }
          }

        };
      case MEWTWO_12:
        return basic (this, hp:HP130, type:P, retreatCost:2) {
          weakness P
          move "Psyjack", {
            text "30 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              amnesia(delegate)
            }
          }
          move "Break Burn", {
            text "130 damage. Discard 2 [P] Energy from this Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 130
              discardSelfEnergy(P,P)
            }
          }

        };
      case MACHAMP_13:
        return evolution (this, from:"Machoke", hp:HP160, type:F, retreatCost:2) {
          weakness P
          move "Directing Traffic", {
            text "Look at the top 5 cards of your deck and put them back in any order."
            energyCost F
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def list=rearrange(deck.subList(0,5), "Rearrange top 5 cards in your deck")
              deck.setSubList(0, list)
            }
          }
          move "Cross Chop", {
            text "80+ damage. Flip a coin. If heads, this attack does 60 more damage."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 80
              flip{damage 60}
            }
          }

        };
      case JIGGLYPUFF_14:
        return basic (this, hp:HP060, type:Y, retreatCost:1) {
          weakness M
          resistance D, MINUS20
          move "Healing Melody", {
            text "Heal 10 damage from each of your Pokémon."
            energyCost Y
            attackRequirement {}
            onAttack {
              my.all.each{heal 10,it}
            }
          }

        };
      case SNUBBULL_15:
        return basic (this, hp:HP070, type:Y, retreatCost:2) {
          weakness M
          resistance D, MINUS20
          move "Play Rough", {
            text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip{damage 30}
            }
          }

        };
      case LICKITUNG_16:
        return basic (this, hp:HP100, type:C, retreatCost:3) {
          weakness F
          move "Continuous Lick", {
            text "20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flipUntilTails {damage 20}
            }
          }

        };
      case DITTO_17:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F
          move "Copy Anything", {
            text "Choose 1 of your opponent's Pokémon's attacks and use it as this attack. If this Pokémon doesn't have the necessary Energy to use that attack, this attack does nothing."
            energyCost C
            attackRequirement {
              assert defending.topPokemonCard.moves : "No moves to perform"
            }
            onAttack {
              def move=choose(defending.topPokemonCard.moves+["End Turn (Skip)"], "Choose 1 of the Defending Pokémon's attacks. (Do not select a move if you don't have necessary energy or it will fail) ")
              if(move instanceof String) return
              def bef=blockingEffect(BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }

        };
      case SLAKING_18:
        return evolution (this, from:"Vigoroth", hp:HP180, type:C, retreatCost:4) {
          weakness F
          move "Pitch", {
            text "150 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 150
              whirlwind()
            }
          }

        };
      default:
        return null;
    }
  }

}
