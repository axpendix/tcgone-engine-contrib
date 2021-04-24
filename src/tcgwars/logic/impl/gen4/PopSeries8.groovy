package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.Sandstorm

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.Source.SRC_ABILITY;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.special.SpecialConditionType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries8 implements LogicCardInfo {

  HEATRAN_1 ("Heatran", "1", Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  LUCARIO_2 ("Lucario", "2", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LUXRAY_3 ("Luxray", "3", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  PROBOPASS_4 ("Probopass", "4", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  YANMEGA_5 ("Yanmega", "5", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CHERRIM_6 ("Cherrim", "6", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CARNIVINE_7 ("Carnivine", "7", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  LUXIO_8 ("Luxio", "8", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  NIGHT_MAINTENANCE_9 ("Night Maintenance", "9", Rarity.UNCOMMON, [TRAINER]),
  RARE_CANDY_10 ("Rare Candy", "10", Rarity.UNCOMMON, [TRAINER]),
  ROSEANNE_S_RESEARCH_11 ("Roseanne's Research", "11", Rarity.UNCOMMON, [TRAINER]),
  CHIMCHAR_12 ("Chimchar", "12", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CROAGUNK_13 ("Croagunk", "13", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAPPINY_14 ("Happiny", "14", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PIPLUP_15 ("Piplup", "15", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RIOLU_16 ("Riolu", "16", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TURTWIG_17 ("Turtwig", "17", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PopSeries8(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_8;
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
      case HEATRAN_1:
        return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { applyAfterDamage(PARALYZED) }
            }
          }
          move "Fire Spin", {
            text "90 damage. Discard 2 Basic Energy cards attached to Heatran. (If you can’t discard cards, this attack does nothing."
            energyCost R, R, R, C
            attackRequirement {
              assert self.cards.filterByType(BASIC_ENERGY).size() >= 2 : "Needs at least 2 Basic Energy cards attached"
            }
            onAttack {
              damage 90

              afterDamage {
                self.cards.filterByType(BASIC_ENERGY).select(count: 2, "Discard 2 Basic energy cards from $self.").discard()
              }
            }
          }
        };
      case LUCARIO_2:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Blocking Punch", {
            text "40 damage. During your opponent’s next turn, any damage done to Lucario by attacks is reduced by 20 (after Weakness and Resistance)."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 40
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Striking Kick", {
            text "60 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              noResistanceOrAnyEffectDamage(60, defending)
            }
          }
        };
      case LUXRAY_3:
        return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Intimidating Fang", {
            text "As long as Luxray is your Active Pokémon, any damage done by an opponent’s attack is reduced by 10."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (self.active && it.to.owner == self.owner && it.dmg.value && it.notNoEffect) {
                    bc "Intimidating Fang -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Thunder", {
            text "120 damage. Flip a coin. If tails, Luxray does 40 damage to itself."
            energyCost L, L, L, C
            attackRequirement {}
            onAttack {
              damage 120
              flip 1, {}, { damage 40, self }
            }
          }
        };
      case PROBOPASS_4:
        return evolution (this, from:"Nosepass", hp:HP090, type:METAL, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          move "Rock Slide", {
            text "20 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }
          move "Triple Nose", {
            text "50+ damage. Flip 3 coins. This attack does 50 damage plus 20 more damage for each heads."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip 3, { damage 20 }
            }
          }
        };
      case YANMEGA_5:
        return evolution (this, from:"Yanma", hp:HP090, type:GRASS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              flipThenApplySC(CONFUSED)
            }
          }
          move "Air Slash", {
            text "70 damage. Flip a coin. If tails, discard an Energy attached to Yanmega."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 70
              flip { discardSelfEnergyAfterDamage() }
            }
          }
        };
      case CHERRIM_6:
        return copy (DiamondPearl.CHERRIM_45, this);
      case CARNIVINE_7:
        return copy (DiamondPearl.CARNIVINE_21, this);
      case LUXIO_8:
        return copy (DiamondPearl.LUXIO_52, this);
      case NIGHT_MAINTENANCE_9:
        return copy (MysteriousTreasures.NIGHT_MAINTENANCE_113, this);
      case RARE_CANDY_10:
        return copy (Sandstorm.RARE_CANDY_88, this);
      case ROSEANNE_S_RESEARCH_11:
        return copy (SecretWonders.ROSEANNE_S_RESEARCH_125, this);
      case CHIMCHAR_12:
        return copy (DiamondPearl.CHIMCHAR_76, this);
      case CROAGUNK_13:
        return copy (MysteriousTreasures.CROAGUNK_78, this);
      case HAPPINY_14:
        return copy (MysteriousTreasures.HAPPINY_52, this);
      case PIPLUP_15:
        return copy (DiamondPearl.PIPLUP_93, this);
      case RIOLU_16:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          pokeBody "Inner Focus", {
            text "Riolu can’t be Paralyzed."
            delayedA{
              before APPLY_SPECIAL_CONDITION, self, {
                if (ef.type == PARALYZED) {
                  bc "$self's $thisAbility prevents it from being Paralyzed"
                  prevent()
                }
              }
            }
            onActivate {
              clearSpecialCondition(self, SRC_ABILITY, [PARALYZED])
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
        };
      case TURTWIG_17:
        return copy (DiamondPearl.TURTWIG_103, this);
      default:
        return null;
    }
  }
}
