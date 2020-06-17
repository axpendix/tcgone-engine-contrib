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
public enum PopSeries1 implements LogicCardInfo {

  BLAZIKEN_1 ("Blaziken", 1, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  METAGROSS_2 ("Metagross", 2, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  RAYQUAZA_3 ("Rayquaza", 3, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  SCEPTILE_4 ("Sceptile", 4, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  SWAMPERT_5 ("Swampert", 5, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BEAUTIFLY_6 ("Beautifly", 6, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MASQUERAIN_7 ("Masquerain", 7, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MURKROW_8 ("Murkrow", 8, Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  PUPITAR_9 ("Pupitar", 9, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TORKOAL_10 ("Torkoal", 10, Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  LARVITAR_11 ("Larvitar", 11, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MINUN_12 ("Minun", 12, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PLUSLE_13 ("Plusle", 13, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SURSKIT_14 ("Surskit", 14, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWELLOW_15 ("Swellow", 15, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ARMALDO_EX_16 ("Armaldo ex", 16, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  TYRANITAR_EX_17 ("Tyranitar ex", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries1(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_1;
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
      case BLAZIKEN_1:
      return evolution (this, from:"Combusken", hp:HP110, type:R, retreatCost:2) {
        weakness W
        move "Fire Punch", {
          text "40 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Double Kick", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip 2, { damage 50 }
          }
        }
      };
      case METAGROSS_2:
      return evolution (this, from:"Metang", hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Metal Claw", {
          text "30 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hyper Beam", {
          text "50 damage. Flip a coin. If heads, discard 1 Energy attached to the Defending Pokémon."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 50
            flip { discardDefendingEnergy() }
          }
        }
      };
      case RAYQUAZA_3:
      return basic (this, hp:HP080, type:C, retreatCost:1) {
        weakness C
        move "Fly", {
          text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Rayquaza during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip {
              damage 10
              preventAllEffectsNextTurn()
            }
          }
        }
        move "Dragon Claw", {
          text "30 damage."
          energyCost R, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SCEPTILE_4:
      return evolution (this, from:"Grovyle", hp:HP100, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Cling", {
          text "20 damage. After your attack, remove from Sceptile the number of damage counters equal to the damage you did to the Defending Pokémon. If Sceptile has fewer damage counters than that, remove all of them."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
            removeDamageCounterEqualToDamageDone()
          }
        }
        move "Leaf Blade", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { damage 30 }
          }
        }
      };
      case SWAMPERT_5:
      return evolution (this, from:"Marshtomp", hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Bubble", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Mud Splash", {
          text "50 damage. If your opponent has any Benched Pokémon, choose 1 of them and flip a coin. If heads, this attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
            if (opp.bench) {
              flip {
                damage 20, opp.bench.select("Which Pokemon to deal 20 damage to?")
              }
            }
          }
        }
      };
      case BEAUTIFLY_6:
      return evolution (this, from:"Silcoon", hp:HP100, type:G, retreatCost:0) {
        weakness R
        move "Blot", {
          text "30 damage. Remove 1 damage counter from Beautifly."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
            heal 10, self
          }
        }
        move "Whirlwind", {
          text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage {
              whirlwind()
            }
          }
        }
      };
      case MASQUERAIN_7:
      return evolution (this, from:"Surskit", hp:HP070, type:G, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
        move "Gust", {
          text "50 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MURKROW_8:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Insomnia", {
          text "Murkrow can't be Asleep."
          delayedA {
            after APPLY_SPECIAL_CONDITION, {
              if(self.active){
                if(self.isSPC(ASLEEP)){
                  bc "Insomnia prevents $self from being Asleep."
                  clearSpecialCondition(self, SRC_ABILITY, [ASLEEP])
                }
              }
            }
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            swiftDamage(20, opp.all.select("Which Pokémon to deal 20 damage to?"))
          }
        }
      };
      case PUPITAR_9:
      return evolution (this, from:"Larvitar", hp:HP070, type:F, retreatCost:1) {
        weakness W
        move "Rock Smash", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case TORKOAL_10:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness W
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost F
          attackRequirement {}
          onAttack {
            amnesia delegate
          }
        }
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case LARVITAR_11:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness W
        move "Sand Attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
      };
      case MINUN_12:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Thunder Wave", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Spark", {
          text "10 damage. Choose 2 of your opponent's Benched Pokémon. This attack does 10 damage to each of those Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            if (opp.bench){
              multiSelect(opp.bench, 2).each {
                targeted(it) {
                  damage 10, it
                }
              }
            }
          }
        }
      };
      case PLUSLE_13:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Plusle during your opponent's next turn."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case SURSKIT_14:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case SWELLOW_15:
      return evolution (this, from:"Tailow", hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Focus Energy", {
          text "During your next turn, base damage of Swellow's Agility is 70 instead of 30."
          energyCost C
          attackRequirement {}
          onAttack {
            increasedBaseDamageNextTurn("Agility", hp(40))
          }
        }
        move "Agility", {
          text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Swellow during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case ARMALDO_EX_16:
      return evolution (this, from:"Anorith", hp:HP160, type:F, retreatCost:3) {
        weakness G
        weakness W
        move "Twin Blade", {
          text "Does 30 damage to each Defending Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Supersonic Claws", {
          text "80 damage. This attack's damage is not affected by Resistance."
          energyCost F, F, F, C, C
          attackRequirement {}
          onAttack {
            damage 80
            dontApplyResistance()
          }
        }
      };
      case TYRANITAR_EX_17:
      return evolution (this, from:"Pupitar", hp:HP150, type:D, retreatCost:4) {
        weakness G
        weakness F
        resistance P, MINUS30
        move "Scratch", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Critical Crush", {
          text "80 damage. Discard 2 Basic Energy cards attached to Tyranitar ex or this attack does nothing."
          energyCost F, F, C, C
          attackRequirement {
            assert self.cards.filterByType(BASIC_ENERGY).size() >= 2 : "$self needs 2 or more Basic Energies attached."
          }
          onAttack {
            damage 80
            self.cards.filterByType(BASIC_ENERGY).select(count:2, "Discard 2 Basic Energies to discard.").discard()
          }
        }
      };
        default:
      return null;
    }
  }
}