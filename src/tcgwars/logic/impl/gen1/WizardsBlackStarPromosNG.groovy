package tcgwars.logic.impl.gen1;

import tcgwars.logic.impl.gen1.BaseSetNG;

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
public enum WizardsBlackStarPromosNG implements LogicCardInfo {

  PIKACHU_1 ("Pikachu", 1, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTABUZZ_2 ("Electabuzz", 2, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MEWTWO_3 ("Mewtwo", 3, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  PIKACHU_4 ("Pikachu", 4, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  DRAGONITE_5 ("Dragonite", 5, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  ARCANINE_6 ("Arcanine", 6, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  JIGGLYPUFF_7 ("Jigglypuff", 7, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  MEW_8 ("Mew", 8, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  MEW_9 ("Mew", 9, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  MEOWTH_10 ("Meowth", 10, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_11 ("Eevee", 11, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  MEWTWO_12 ("Mewtwo", 12, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  VENUSAUR_13 ("Venusaur", 13, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MEWTWO_14 ("Mewtwo", 14, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  COOL_PORYGON_15 ("Cool Porygon", 15, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  COMPUTER_ERROR_16 ("Computer Error", 16, Rarity.PROMO, [TRAINER, ROCKETS_SECRET_MACHINE]),
  DARK_PERSIAN_17 ("Dark Persian", 17, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TEAM_ROCKET_S_MEOWTH_18 ("Team Rocket's Meowth", 18, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  SABRINA_S_ABRA_19 ("Sabrina's Abra", 19, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  PSYDUCK_20 ("Psyduck", 20, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MOLTRES_21 ("Moltres", 21, Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  ARTICUNO_22 ("Articuno", 22, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  ZAPDOS_23 ("Zapdos", 23, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  BIRTHDAY_PIKACHU_24 ("Birthday Pikachu", 24, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  FLYING_PIKACHU_25 ("Flying Pikachu", 25, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_26 ("Pikachu", 26, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_27 ("Pikachu", 27, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SURFING_PIKACHU_28 ("Surfing Pikachu", 28, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MARILL_29 ("Marill", 29, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  TOGEPI_30 ("Togepi", 30, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  CLEFFA_31 ("Cleffa", 31, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  SMEARGLE_32 ("Smeargle", 32, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  SCIZOR_33 ("Scizor", 33, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ENTEI_34 ("Entei", 34, Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  PICHU_35 ("Pichu", 35, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  IGGLYBUFF_36 ("Igglybuff", 36, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  HITMONTOP_37 ("Hitmontop", 37, Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  UNOWN_J__38 ("Unown [J]", 38, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  MISDREAVUS_39 ("Misdreavus", 39, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  POKEMON_CENTER_40 ("Pokémon Center", 40, Rarity.PROMO, [TRAINER]),
  LUCKY_STADIUM_41 ("Lucky Stadium", 41, Rarity.PROMO, [TRAINER]),
  POKEMON_TOWER_42 ("Pokémon Tower", 42, Rarity.PROMO, [TRAINER]),
  MACHAMP_43 ("Machamp", 43, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGMAR_44 ("Magmar", 44, Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  SCYTHER_45 ("Scyther", 45, Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  ELECTABUZZ_46 ("Electabuzz", 46, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MEW_47 ("Mew", 47, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  ARTICUNO_48 ("Articuno", 48, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  SNORLAX_49 ("Snorlax", 49, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  CELEBI_50 ("Celebi", 50, Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  RAPIDASH_51 ("Rapidash", 51, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  HO_OH_52 ("Ho-oh", 52, Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  SUICUNE_53 ("Suicune", 53, Rarity.PROMO, [POKEMON, BASIC, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  WizardsBlackStarPromosNG(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.WIZARDS_BLACK_STAR_PROMOS;
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
      case PIKACHU_1:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Growl", {
          text "If the Defending Pokémon attacks Pikachu during your opponent's next turn, any damage done by the attack is reduced by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            reduceDamageNextTurn(hp(10), thisMove)
            // I don't understand the benching condition
          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
      };
      case ELECTABUZZ_2:
      return basic (this, hp:HP060, type:L, retreatCost:2) {
        weakness F
        move "Light Screen", {
          text "Whenever an attack does damage to Electabuzz (after applying Weakness and Resistance) during your opponent's next turn, that attack only does half the damage to Electabuzz (rounded down to the nearest 10). (Any other effects still happen.)"
          energyCost L
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case MEWTWO_3:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Energy Absorption", {
          text "Choose up to 2 Energy cards from your discard pile and attach them to Mewtwo."
          energyCost P
          attackRequirement {}
          onAttack {
            def count = 0
            while (count < 2 && my.discard.filterByType(ENERGY)) {
              attachEnergyFrom(my.discard, self)
              count++
            }
          }
        }
        move "Psyburn", {
          text "40 damage. "
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PIKACHU_4:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Recharge", {
          text "Search your deck for a Energy card and attach it to Pikachu. Shuffle your deck afterward."
          energyCost L
          attackRequirement {}
          onAttack {
            attachEnergyFrom(my.deck, self)
            shuffleDeck()
          }
        }
        move "Thunderbolt", {
          text "50 damage. Discard all Energy cards attached to Pikachu in order to use this attack."
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 50
            discardAllSelfEnergy(null)
          }
        }
      };
      case DRAGONITE_5:
      return evolution (this, from:"Dragonair", hp:HP090, type:C, retreatCost:2) {
        resistance F, MINUS30
        pokePower "Special Delivery", {
          text "Once during your turn (before your attack), you may draw a card. If you do, choose a card from your hand and put it on top of your deck. This power can't be used if Dragonite is Asleep, Confused, or Paralyzed."
          actionA {
            // TODO
          }
        }
        move "Supersonic Flight", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip { damage 60 }
          }
        }
      };
      case ARCANINE_6:
      return evolution (this, from:"Growlithe", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
        move "Flames of Rage", {
          text "40+ damage. Discard 2 Energy cards attached to Arcanine in order to use this attack. This attack does 40 damage plus 10 more damage for each damage counter on Arcanine."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 40+10*self.numberOfDamageCounters
            discardSelfEnergy C,C
          }
        }
      };
      case JIGGLYPUFF_7:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "First Aid", {
          text "Remove 1 damage counter from Jigglypuff."
          energyCost C
          attackRequirement {}
          onAttack {
            heal 10, self
          }
        }
        move "Double-Edge", {
          text "40 damage. Jigglypuff does 20 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            damage 20, self
          }
        }
      };
      case MEW_8:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psywave", {
          text "10x damage. Does 10 damage times the number of Energy cards attached to the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10*defending.cards.energyCount(C)
          }
        }
        move "Devolution Beam", {
          text "Choose an Evolved Pokémon (your own or your opponent's). Return the highest Stage Evolution card on that Pokémon to its player's hand. That Pokémon is no longer Asleep, Confused, Paralyzed, Poisoned, or anything else that might be the result of an attack (just as if you had evolved it)."
          energyCost P, P
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      };
      case MEW_9:
      return copy (MEW_8, this);
      case MEOWTH_10:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Cat Punch", {
          text "20 damage. Flip a coin. If heads, this attack does 20 damage. If tails and if your opponent has any Benched Pokémon, he or she chooses 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip 1, { damage 20 }, {
              if (opp.bench) {
                damage 20, opp.bench.oppSelect("Deal 20 damage to")
              }
            }
          }
        }
      };
      case EEVEE_11:
      return basic (this, hp:HP030, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        pokePower "Chain Reaction", {
          text "This power can only be used when a Pokémon evolves. Search your deck for a card that evolves from Eevee and attach it to Eevee. This counts as evolving Eevee. Shuffle your deck afterward. This power can't be used if Eevee is Asleep, Confused, or Paralyzed."
          actionA {
            // TODO
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEWTWO_12:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Energy Control", {
          text "Flip a coin. If heads, choose a basic Energy card attached to 1 of your opponent's Pokémon and attach it to another of your opponent's Pokémon of your choice."
          energyCost P
          attackRequirement {}
          onAttack {
            // TODO
            flip {

            }
          }
        }
        move "Telekinesis", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. Don't apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost P, P, P
          attackRequirement {}
          onAttack {
            noWrDamage 30, opp.all.select()
          }
        }
      };
      case VENUSAUR_13:
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:1) {
        weakness R
        pokePower "Solar Power", {
          text "Once during your turn (before your attack), you may use this power. Your Active Pokémon and the Defending Pokémon are no longer Asleep, Confused, Paralyzed, or Poisoned. This power can't be used if Venusaur is Asleep, Confused, or Paralyzed."
          actionA {
            // TODO
          }
        }
        move "Mega Drain", {
          text "40 damage. Remove a number of damage counters from Venusaur equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Venusaur has fewer damage counters than that, remove all of them."
          energyCost G, G, G, G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MEWTWO_14:
      return copy (MEWTWO_3, this);
      case COOL_PORYGON_15:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Texture Magic", {
          text "You may change Cool Porygon's Resistance to a type of your choice other than [C]. If the Defending Pokémon has a Weakness, you may change it to a type of your choice other than [C]. (Benching either Pokémon ends the effect on that Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "3-D Attack", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 20 }
          }
        }
      };
      case COMPUTER_ERROR_16:
      return basicTrainer (this) {
        text "You may draw up to 5 cards, then your opponent may draw up to 5 cards. Your turn is over now (you don't get to attack)."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case DARK_PERSIAN_17:
      return evolution (this, from:"Meowth", hp:HP060, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Tempt", {
          text "If your opponent has any Benched Pokémon, flip a coin. If heads, choose 1 of your opponent's Benched Pokémon and switch it with the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            if (opp.bench) {
              flip {
                // TODO
              }
            }
          }
        }
        move "Poison Claws", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            flip { apply POISONED }
          }
        }
      };
      case TEAM_ROCKET_S_MEOWTH_18:
      return basic (this, hp:HP040, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Miraculous Comeback", {
          text "10x damage. Flip a number of coins equal to the total number of Pokémon in play. This attack does 10 damage times the number of heads. Then, Team Rocket's Meowth does 10 damage times the number of tails to itself."
          energyCost C
          attackRequirement {}
          onAttack {
            flip all.size(), {
              damage 10
            }, {
              damage 10, self
            }
          }
        }
      };
      case SABRINA_S_ABRA_19:
      return basic (this, hp:HP040, type:P, retreatCost:0) {
        weakness P
        move "Pound", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Synchronize", {
          text "40 damage. This attack can't be used unless Sabrina's Abra and the Defending Pokémon have the same number of Energy cards attached to them."
          energyCost P, C
          attackRequirement {
            assert opp.cards.filterByType(ENERGY).size() == self.cards.filterByType(ENERGY).size() : "Abra and the defending Pokemon have different number of Energies"
          }
          onAttack {
            damage 40
          }
        }
      };
      case PSYDUCK_20:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Headache", {
          text "Your opponent can't play Trainer cards during his or her next turn."
          energyCost P
          attackRequirement {}
          onAttack {
            delayed {
              before PLAY_TRAINER, {
                if (bg.currentTurn == self.owner.opposite) {
                  wcu "Psyduck's Headache prevents playing this card!"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost W
          attackRequirement {}
          onAttack {
            flip 3, { damage 10 }
          }
        }
      };
      case MOLTRES_21:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        resistance F, MINUS30
        move "Hyper Flame", {
          text "60 damage. Flip a coin. If heads, discard 1 Energy card attached to Moltres. If tails, discard all Energy cards attached to Moltres. If you can't discard Energy cards, this attack does nothing."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 60

            flip 1, {
              discardSelfEnergy(C)
            }, {
              discardAllSelfEnergy(null)
            }
          }
        }
      };
      case ARTICUNO_22:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        resistance F, MINUS30
        move "Diamond Dust", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed, and this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 20

            flip 1, {
              apply { PARALYZED }
              opp.bench.each {
                damage 10, it
              }
            }
          }
        }
      };
      case ZAPDOS_23:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        resistance F, MINUS30
        move "Lightning Burn", {
          text "30 damage. Flip a coin. If heads, and if your opponent has any Benched Pokémon, choose 1 of them. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If tails, Zapdos does 30 damage to itself."
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 30

            flip 1, {
              if (opp.bench) {
                def target = opp.bench.select("Which Benched Pokemon to deal damage to?")
                damage 30, target
              }
            }, {
              damage 30, self
            }
          }
        }
      };
      case BIRTHDAY_PIKACHU_24:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Birthday Surprise", {
          text "30+ damage. If it's not your birthday, this attack does 30 damage. If it is your birthday, flip a coin. If heads, this attack does 30 damage plus 50 more damage; if tails, this attack does 30 damage."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 30

            // Confirm with opponent if it's the attacker's birthday
            if (confirm("Is it their birthday?")) {
              flip { damage 30 }
            }
          }
        }
      };
      case FLYING_PIKACHU_25:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        resistance F, MINUS30
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Fly", {
          text "30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Flying Pikachu; if tails, this attack does nothing (not even damage)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case PIKACHU_26:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunderbolt", {
          text "40 damage. Discard all Energy cards attached to Pikachu in order to use this attack."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 40
            discardAllSelfEnergy(null)
          }
        }
      };
      case PIKACHU_27:
      return basic (this, hp:HP030, type:L, retreatCost:0) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Pikachu."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case SURFING_PIKACHU_28:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Surf", {
          text "30 damage. "
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MARILL_29:
      return basic (this, hp:HP050, type:W, retreatCost:2) {
        weakness L
        move "Water Gun", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to Marill but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
            // TODO
          }
        }
      };
      case TOGEPI_30:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Snivel", {
          text "If the Defending Pokémon attacks Togepi during your opponent's next turn, any damage done to Togepi is reduced by 20 (before applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            reduceDamageNextTurn(hp(20), thisMove)
            // TODO: (Benching either Pokémon ends this effect.)??
          }
        }
        move "Mini-Metronome", {
          text "Flip a coin. If heads, choose 1 of the Defending Pokémon's attacks. Mini-Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) (No matter what type the Defending Pokémon is, Togepi's type is still .) Togepi performs that attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      };
      case CLEFFA_31:
      return basic (this, hp:HP030, type:C, retreatCost:0) {
        move "Eek", {
          text "Draw 2 cards"
          energyCost C
          attackRequirement {}
          onAttack {
            draw 2
          }
        }
      };
      case SMEARGLE_32:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Paint", {
          text "Flip a coin. If heads, choose a type (other than colorless) and put a Coloring counter on the Defending Pokémon. That Pokémon is now the type you choose. If it already had a Coloring counter, remove the old one. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      };
      case SCIZOR_33:
      return evolution (this, from:"Scyther", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Scizor during your opponent's next turn. (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            flip {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bc "Leer prevent attacking Scizor"
                  prevent()
                }
                before null, self, Source.ATTACK, {
                  bc "Leer prevent attacking Scizor"
                  prevent()
                }

                unregisterAfter 2
                after SWITCH, defending, {unregister()}
                after SWITCH, self, {unregister()}
              }
            }
          }
        }
        move "Metal Pincer", {
          text "30+ damage. Flip a coin until you get tails. This attack does 30 damage plus 10 more damage for each heads."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flipUntilTails { damage 10 }
          }
        }
      };
      case ENTEI_34:
      return basic (this, hp:HP080, type:R, retreatCost:1) {
        weakness W
        pokePower "Bolt", {
          text "Whenever your opponent's attack damages Entei, unless that attack Knocks Out Entei, flip a coin. If heads, shuffle Entei and all cards attached to it into your deck. This power can't be used if Entei is already Asleep, Confused, or Paralyzed when it is damaged."
          actionA {
            // TODO
          }
        }
        move "Protective Flame", {
          text "50 damage. During your opponent's next turn, prevent all effects of attacks, including damage, done to your Benched Pokémon."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 50
            // TODO
          }
        }
      };
      case PICHU_35:
      return basic (this, hp:HP030, type:L, retreatCost:0) {
        move "Let's Play!", {
          text "Search your deck for a Baby Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      };
      case IGGLYBUFF_36:
      return basic (this, hp:HP030, type:C, retreatCost:0) {
        move "Good Night Song", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
      };
      case HITMONTOP_37:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness P
        move "Repeating Kick", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost F, F
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 20 }
          }
        }
        move "Rapid Spin", {
          text "30 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with his or her Active Pokémon, then, if you have any Benched Pokémon, you switch 1 of them with your Active Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              if (my.bench) {
                sw self, my.bench.select("New active")
                if (opp.bench) {
                  sw defending, opp.bench.oppSelect("New active")
                }
              }
            }
          }
        }
      };
      case UNOWN_J__38:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "[Join]", {
          text "Once during your turn (before you attack), if you have Unown J, Unown O, Unown I, and Unown N on your Bench, you may search your deck for a Basic Pokémon or Evolution Pokémon card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
          actionA {
            // TODO
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MISDREAVUS_39:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        resistance F, MINUS30
        move "Pain Split", {
          text "Put 1 damage counter on the Defending Pokémon for each damage counter on Misdreavus."
          energyCost P
          attackRequirement {}
          onAttack {
            directDamage 10*self.numberOfDamageCounters
          }
        }
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply CONFUSED }
          }
        }
      };
      case POKEMON_CENTER_40:
      return copy(BaseSetNG.POKEMON_CENTER, this)
      case LUCKY_STADIUM_41:
      return stadium (this) {
        text "Once during each player's turn (before attacking), the player may flip a coin. If heads, that player draws a card."
        def currentTurnCount=0
        def actions=[]
        onPlay {
          actions=action("Stadium: Lucky Stadium") {
            assert my.deck : "There are no more cards in your deck."
            assert currentTurnCount != bg().turnCount : "Already used Stadium"
            bc "Used Lucky Stadium"
            currentTurnCount = bg().turnCount

            flip { draw 1 }
          }
        }
        onRemoveFromPlay {
          actions.each {
            bg().gm().unregisterAction(it)
          }
        }
      };
      case POKEMON_TOWER_42:
      return stadium (this) {
        text "If the effect of a Pokémon Power, attack, Energy card, or Trainer card would put a card in a discard pile into its owner's hand, that card stays in that discard pile instead."
        def eff
        onPlay {
          // This needs testing, idk how MOVE_CARD would behave
          eff = delayed {
            before MOVE_CARD, {
              if (ef.cards.contains(card) && ef.newLocation?.is(card.player.pbg.hand && ef.oldLocation?.is(card.player.pbg.discard)) {
                prevent()
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case MACHAMP_43:
      return evolution (this, from:"Machoke", hp:HP090, type:F, retreatCost:3) {
        weakness P
        move "Seething Anger", {
          text "20+ damage. Flip a number of coins equal to the number of damage counters on Machamp. This attack does 20 damage plus 10 more damage for each heads."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 20
            flip self.numberOfDamageCounters, {
              damage 10
            }
          }
        }
        move "Fling", {
          text "50 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
            if (opp.bench) {
              whirlwind()
            }
          }
        }
      };
      case MAGMAR_44:
      return basic (this, hp:HP060, type:R, retreatCost:2) {
        weakness W
        move "Burning Fire", {
          text "10+ damage. When you use this attack, you may discard any number of Energy cards attached to your Pokémon in play. This attack does 10 damage plus 10 more damage for each Energy card you discarded in this way."
          energyCost R
          attackRequirement {}
          onAttack {
            def energiesToDiscard = self.cards.select(min:0, max:self.cards.filterByType(ENERGY).size())
            damage 10+10*energiesToDiscard.size()
            afterDamage { energiesToDiscard.discard() }
          }
        }
        move "Magma Punch", {
          text "40 damage. "
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SCYTHER_45:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        resistance F, MINUS30
        move "Slashing Strike", {
          text "40 damage. This attack can't be used during your next turn. (Benching Scyther ends this effect.)"
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 40
            cantUseAttack(thisMove,self)
          }
        }
      };
      case ELECTABUZZ_46:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Lightning Rod", {
          text "Choose 1 of your opponent's Pokémon and put a Lightning Rod marker on it. (A Pokémon can have only 1 Lightning Rod marker on it at a time.)"
          energyCost L
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Lightning Bolt", {
          text "10 damage. This attack does 20 damage to any Pokémon with a Lightning Rod counter on it. Apply Weakness and Resistance."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 10
            // TODO
          }
        }
      };
      case MEW_47:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Neutral Shield", {
          text "Mew is not affected by attacks made by Evolved Pokémon. This power turns off if Mew is Asleep, Confused, or Paralyzed."
          actionA {
            // TODO
          }
        }
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply CONFUSED }
          }
        }
      };
      case ARTICUNO_48:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        resistance F, MINUS30
        pokePower "Aurora Veil", {
          text "As long as Articuno is your Active Pokémon, you Benched Pokémon are not affected by attacks. This power cannot be used if Articuno is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Ice Beam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { PARALYZED }
          }
        }
      };
      case SNORLAX_49:
      return basic (this, hp:HP090, type:C, retreatCost:4) {
        weakness F
        resistance P, MINUS30
        pokePower "Guard", {
          text "As long as Snorlax is your Active Pokémon, the Defending Pokémon can't retreat. This power stops working when Snorlax is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Roll Over", {
          text "30 damage. Snorlax is now Asleep. Flip a coin, If heads, the Defending Pokémon is now Asleep."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 30
            apply ASLEEP, self
            flip { apply ASLEEP }
          }
        }
      };
      case CELEBI_50:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Leaf Slice", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            flip 2, { damage 20 }
          }
        }
      };
      case RAPIDASH_51:
      return evolution (this, from:"Ponyta", hp:HP060, type:R, retreatCost:0) {
        weakness W
        move "Jump Over", {
          text "If you opponent has any Benched Pokémon, choose 1 of them. Flip a coin. If heads, this attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            if (opp.bench) {
              damage 20, opp.bench.select()
            }
          }
        }
        move "Super Singe", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { apply BURNED }
          }
        }
      };
      case HO_OH_52:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        resistance F, MINUS30
        move "Sacred Fire", {
          text "60 damage. Flip a coin. If tails, this attack's base damage is 20 instead of 60."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            flip 1, { damage 60 }, { damage 20 }
          }
        }
      };
      case SUICUNE_53:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Pure Body", {
          text "To attach a [W] Energy card from your hand to Suicune, you must discard an Energy card attached to Suicune. (Attach the [W] Energy, and then discard an Energy card from Suicune.)"
          delayedA {
            // TODO
          }
        }
        move "Hypno Wave", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage and the Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip 1, { damage 20 }, { apply ASLEEP }
          }
        }
      };
      default:
      return null;
    }
  }
}