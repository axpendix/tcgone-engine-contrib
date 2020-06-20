package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.CrystalGuardians;
import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen3.HolonPhantoms;

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
public enum PopSeries5 implements LogicCardInfo {

  HO_OH_1 ("Ho-oh", 1, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  LUGIA_2 ("Lugia", 2, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_DELTA_3 ("Mew", 3, Rarity.RARE, [POKEMON, BASIC, DELTA, _FIRE_]),
  DOUBLE_RAINBOW_ENERGY_4 ("Double Rainbow Energy", 4, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  CHARMELEON_DELTA_5 ("Charmeleon", 5, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  BILL_S_MAINTENANCE_6 ("Bill's Maintenance", 6, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_CANDY_7 ("Rare Candy", 7, Rarity.UNCOMMON, [TRAINER, ITEM]),
  BOOST_ENERGY_8 ("Boost Energy", 8, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  DELTA_RAINBOW_ENERGY_9 ("δ Rainbow Energy", 9, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CHARMANDER_DELTA_10 ("Charmander", 10, Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  MEOWTH_DELTA_11 ("Meowth", 11, Rarity.COMMON, [POKEMON, BASIC, DELTA, _DARKNESS_]),
  PIKACHU_12 ("Pikachu", 12, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_DELTA_13 ("Pikachu", 13, Rarity.COMMON, [POKEMON, BASIC, DELTA, _METAL_]),
  PELIPPER_DELTA_14 ("Pelipper", 14, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  ZANGOOSE_DELTA_15 ("Zangoose", 15, Rarity.COMMON, [POKEMON, BASIC, DELTA, _METAL_]),
  ESPEON_STAR_16 ("Espeon Star", 16, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UMBREON_STAR_17 ("Umbreon Star", 17, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries5(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_5;
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
      case HO_OH_1:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Fire Wing", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fire Blast", {
          text "60 damage. Discard a [R] Energy attached to Ho-oh."
          energyCost R, R, R, C
          attackRequirement {}
          onAttack {
            damage 60
            discardSelfEnergy(R)
          }
        }
      };
      case LUGIA_2:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Super Psy Bolt", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Aerowing", {
          text "Before doing damage, you may flip a coin. If tails, this attack does nothing. If heads, this attack does 60 damage instead."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            if (choose("You may flip a coin, if heads, this attack does 60 damage instead, if tails, this attack does nothing.")) {
              flip { damage 60 }
            } else {
              damage 30
            }
          }
        }
      };
      case MEW_DELTA_3:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness P
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Mew doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Mew performs that attack."
          energyCost C
          attackRequirement {
            assert defending.topPokemonCard.moves : "No moves to perform"
          }
          onAttack {
            def move = choose(defending.topPokemonCard.moves+["End Turn (Skip)"], "Choose 1 of the Defending Pokémon's attacks. (Do not select a move if you don't have necessary energy or it will fail) ")
            if (move instanceof String) return
            def bef = blockingEffect(BETWEEN_TURNS)
            attack (move as Move)
            bef.unregisterItself(bg().em())
          }
        }
        move "Extra Draw", {
          text "If your opponent has any Pokémon-ex in play, search your deck for up to 2 basic Energy cards and attach them to Mew. Shuffle your deck afterward."
          energyCost R
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert opp.all.findAll { it.EX } : "Opponent does not have any Pokémon-ex in play"
          }
          onAttack {
            my.deck.search(max: 2, "Search your deck for up to 2 Basic Energy cards", cardTypeFilter(BASIC_ENERGY)).each{
              def pcs = my.all.select("Attach $it to which Pokémon?")
              attachEnergy(pcs, it)
            }
            shuffleDeck()
          }
        }
      };
      case DOUBLE_RAINBOW_ENERGY_4:
        return copy (Emerald.DOUBLE_RAINBOW_ENERGY_87, this);
      case CHARMELEON_DELTA_5:
        return copy(CrystalGuardians.CHARMELEON_DELTA_30, this);
      case BILL_S_MAINTENANCE_6:
        return copy(FireRedLeafGreen.BILL_S_MAINTENANCE_87, this);
      case RARE_CANDY_7:
        return copy (Sandstorm.RARE_CANDY_88, this);
      case BOOST_ENERGY_8:
        return copy(Deoxys.BOOST_ENERGY_93, this);
      case DELTA_RAINBOW_ENERGY_9:
        return copy(HolonPhantoms.DELTA_RAINBOW_ENERGY_98, this);
      case CHARMANDER_DELTA_10:
        return copy(CrystalGuardians.CHARMANDER_DELTA_49, this);
      case MEOWTH_DELTA_11:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {
            swiftDamage(10, opp.all.select("Select Feint Attack's target."))
          }
        }
      };
      case PIKACHU_12:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Lightning Ball", {
          text "10 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunderbolt", {
          text "50 damage. Discard all Energy cards attached to Pikachu."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
            discardAllSelfEnergy(null)
          }
        }
      };
      case PIKACHU_DELTA_13:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness F
        move "Electric Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Heavy Metal", {
          text "10+ damage. Flip a coin for each [M] Energy attached to Pikachu. This attack does 10 damage plus 20 more damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip self.cards.energyCount(M), {
              damage 20
            }
          }
        }
      };
      case PELIPPER_DELTA_14:
      return evolution (this, from:"Wingull", hp:HP070, type:L, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokeBody "Mist", {
          text "Any damage done to Pelipper by attacks from Stage 2 Evolved Pokémon (both yours and your opponent's) is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to==self && it.from.evolution && it.from.topPokemonCard.cardTypes.is(STAGE2) && it.dmg.value && it.notNoEffect) {
                  bc "Mist -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Lightning Wing", {
          text "50 damage. Does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50

            if (my.bench) {
              damage 10, my.bench.select("Deal 10 damage to which Benched Pokémon?")
            }
          }
        }
      };
      case ZANGOOSE_DELTA_15:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness F
        move "Detect", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Zangoose during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Metal Claw", {
          text "40 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ESPEON_STAR_16:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokePower "Purple Ray", {
          text "Once during your turn, when you put Espeon Star from your hand onto your Bench, you may use this power. Each Active Pokémon (both yours and your opponent's) is now Confused."
          onActivate {
            if (it==PLAY_FROM_HAND && opp.hand && confirm("Use Purple Ray?")) {
              powerUsed()
              apply CONFUSED
              apply CONFUSED, self
            }
          }
        }
        move "Psychic Boom", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 30
            damage 10*defending.cards.energyCount(C)
          }
        }
      };
      case UMBREON_STAR_17:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Dark Ray", {
          text "Once during your turn, when you put Umbreon Star from your hand onto your Bench, you may choose 1 card from your opponent's hand without looking and discard it."
          onActivate {
            if (it==PLAY_FROM_HAND && opp.hand && confirm("Use Dark Ray?")) {
              powerUsed()
              discardRandomCardFromOpponentsHand()
            }
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, D
          attackRequirement {}
          onAttack {
            swiftDamage(30, opp.all.select("Use Feint Attack on which Pokémon?"))
          }
        }
      };
        default:
      return null;
    }
  }
}