package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen8.SwordShield;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.EffectType.BEGIN_TURN
import static tcgwars.logic.effect.EffectType.BETWEEN_TURNS
import static tcgwars.logic.effect.EffectType.EVOLVE_STANDARD
import static tcgwars.logic.effect.EffectType.PREVENT_EVOLVE;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries6 implements LogicCardInfo {

  BASTIODON_1 ("Bastiodon", "1", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  LUCARIO_2 ("Lucario", "2", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MANAPHY_3 ("Manaphy", "3", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PACHIRISU_4 ("Pachirisu", "4", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  RAMPARDOS_5 ("Rampardos", "5", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DRIFLOON_6 ("Drifloon", "6", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GIBLE_7 ("Gible", "7", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  RIOLU_8 ("Riolu", "8", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIKACHU_9 ("Pikachu", "9", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  STARAVIA_10 ("Staravia", "10", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BIDOOF_11 ("Bidoof", "11", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BUNEARY_12 ("Buneary", "12", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHERUBI_13 ("Cherubi", "13", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHIMCHAR_14 ("Chimchar", "14", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PIPLUP_15 ("Piplup", "15", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARLY_16 ("Starly", "16", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TURTWIG_17 ("Turtwig", "17", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PopSeries6(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_6;
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
      case BASTIODON_1:
        return copy (MysteriousTreasures.BASTIODON_21, this);
      case LUCARIO_2:
        return copy (DiamondPearl.LUCARIO_6, this);
      case MANAPHY_3:
        return copy (DiamondPearl.MANAPHY_9, this);
      case PACHIRISU_4:
        return copy (DiamondPearl.PACHIRISU_35, this);
      case RAMPARDOS_5:
        return copy (MysteriousTreasures.RAMPARDOS_33, this);
      case DRIFLOON_6:
        return copy (DiamondPearl.DRIFLOON_46, this);
      case GIBLE_7:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          customAbility {
            // Oran Berry: Remove 1 damage counter from Gible at the end of your turn.
            delayedA {
              before BETWEEN_TURNS,{
                if (bg.currentTurn == self.owner && self.numberOfDamageCounters >= 1) {
                  bc "Oran Berry activates"
                  heal 10, self
                }
              }
            }
          }
          move "Surprise Attack", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip { damage 30 }
            }
          }
        };
      case RIOLU_8:
        return copy (DiamondPearl.RIOLU_61, this);
      case PIKACHU_9:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          customAbility {
            // Oran Berry: Remove 1 damage counter from Gible at the end of your turn.
            delayedA {
              before BETWEEN_TURNS,{
                if (bg.currentTurn == self.owner && self.numberOfDamageCounters >= 1) {
                  bc "Oran Berry activates"
                  heal 10, self
                }
              }
            }
          }
          move "Spark", {
            text "10 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 10
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  damage 10, it
                }
              }
            }
          }
        };
      case STARAVIA_10:
        return copy (DiamondPearl.STARAVIA_64, this);
      case BIDOOF_11:
        return copy (DiamondPearl.BIDOOF_70, this);
      case BUNEARY_12:
        return copy (DiamondPearl.BUNEARY_73, this);
      case CHERUBI_13:
        return copy (DiamondPearl.CHERUBI_75, this);
      case CHIMCHAR_14:
        return copy (DiamondPearl.CHIMCHAR_76, this);
      case PIPLUP_15:
        return copy (DiamondPearl.PIPLUP_93, this);
      case STARLY_16:
        return copy (DiamondPearl.STARLY_101, this);
      case TURTWIG_17:
        return copy (DiamondPearl.TURTWIG_103, this);
      default:
        return null;
    }
  }

}
