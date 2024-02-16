package tcgwars.logic.impl.gen8

import tcgwars.logic.impl.gen5.BlackWhite
import tcgwars.logic.impl.gen5.EmergingPowers
import tcgwars.logic.impl.gen6.Xy;

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
public enum BlueSkyStream implements LogicCardInfo {

  HOPPIP_1 ("Hoppip", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SKIPLOOM_2 ("Skiploom", "2", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  JUMPLUFF_3 ("Jumpluff", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  TROPIUS_4 ("Tropius", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PANSAGE_5 ("Pansage", "5", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SIMISAGE_6 ("Simisage", "6", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TREVENANT_V_7 ("Trevenant V", "7", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TREVENANT_VMAX_8 ("Trevenant VMAX", "8", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  APPLIN_9 ("Applin", "9", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VULPIX_10 ("Vulpix", "10", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  NINETALES_11 ("Ninetales", "11", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VICTINI_12 ("Victini", "12", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  PANSEAR_13 ("Pansear", "13", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SIMISEAR_14 ("Simisear", "14", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VOLCARONA_V_15 ("Volcarona V", "15", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  SIZZLIPEDE_16 ("Sizzlipede", "16", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CENTISKORCH_17 ("Centiskorch", "17", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SHELLDER_18 ("Shellder", "18", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CLOYSTER_19 ("Cloyster", "19", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GYARADOS_V_20 ("Gyarados V", "20", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GYARADOS_VMAX_21 ("Gyarados VMAX", "21", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  GALARIAN_DARUMAKA_22 ("Galarian Darumaka", "22", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_23 ("Galarian Darmanitan", "23", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRYOGONAL_24 ("Cryogonal", "24", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WISHIWASHI_25 ("Wishiwashi", "25", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MAREEP_26 ("Mareep", "26", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_27 ("Flaaffy", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  AMPHAROS_28 ("Ampharos", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  PLUSLE_29 ("Plusle", "29", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MINUN_30 ("Minun", "30", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TOXEL_31 ("Toxel", "31", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_32 ("Toxtricity", "32", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  REGIELEKI_33 ("Regieleki", "33", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  SANDSHREW_34 ("Sandshrew", "34", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSLASH_35 ("Sandslash", "35", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MEDICHAM_V_36 ("Medicham V", "36", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  BALTOY_37 ("Baltoy", "37", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CLAYDOL_38 ("Claydol", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LANDORUS_39 ("Landorus", "39", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  STUFFUL_40 ("Stufful", "40", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  BEWEAR_41 ("Bewear", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DRAGONITE_V_42 ("Dragonite V", "42", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  BAGON_43 ("Bagon", "43", Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  SHELGON_44 ("Shelgon", "44", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  SALAMENCE_45 ("Salamence", "45", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
  RAYQUAZA_V_46 ("Rayquaza V", "46", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  RAYQUAZA_VMAX_47 ("Rayquaza VMAX", "47", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  ZYGARDE_48 ("Zygarde", "48", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  TURTONATOR_49 ("Turtonator", "49", Rarity.UNCOMMON, [POKEMON, BASIC, _DRAGON_]),
  FLAPPLE_50 ("Flapple", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  APPLETUN_51 ("Appletun", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  REGIDRAGO_52 ("Regidrago", "52", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  CHANSEY_53 ("Chansey", "53", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BLISSEY_54 ("Blissey", "54", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STANTLER_55 ("Stantler", "55", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LUCKY_ICE_POP_56 ("Lucky Ice Pop", "56", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GREAT_BALL_57 ("Great Ball", "57", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TOY_CATCHER_58 ("Toy Catcher", "58", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SWITCH_59 ("Switch", "59", Rarity.COMMON, [TRAINER, ITEM]),
  RUBBERY_GLOVES_60 ("Rubbery Gloves", "60", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  NETHER_MASK_61 ("Nether Mask", "61", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_62 ("Rapid Strike Scroll of the Flying Dragon", "62", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  SHAUNA_63 ("Shauna", "63", Rarity.COMMON, [TRAINER, SUPPORTER]),
  SCHOOLBOY_64 ("Schoolboy", "64", Rarity.COMMON, [TRAINER, SUPPORTER]),
  ZINNIA_S_RESOLVE_65 ("Zinnia's Resolve", "65", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STORMY_MOUNTAIN_RANGE_66 ("Stormy Mountain Range", "66", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  AURORA_ENERGY_67 ("Aurora Energy", "67", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  TREVENANT_V_68 ("Trevenant V", "68", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  VOLCARONA_V_69 ("Volcarona V", "69", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  GYARADOS_V_70 ("Gyarados V", "70", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  MEDICHAM_V_71 ("Medicham V", "71", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  MEDICHAM_V_72 ("Medicham V", "72", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  DRAGONITE_V_73 ("Dragonite V", "73", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DRAGONITE_V_74 ("Dragonite V", "74", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  RAYQUAZA_V_75 ("Rayquaza V", "75", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  RAYQUAZA_V_76 ("Rayquaza V", "76", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  SHAUNA_77 ("Shauna", "77", Rarity.COMMON, [TRAINER, SUPPORTER]),
  SCHOOLBOY_78 ("Schoolboy", "78", Rarity.COMMON, [TRAINER, SUPPORTER]),
  ZINNIA_S_RESOLVE_79 ("Zinnia's Resolve", "79", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TREVENANT_VMAX_80 ("Trevenant VMAX", "80", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  GYARADOS_VMAX_81 ("Gyarados VMAX", "81", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  RAYQUAZA_VMAX_82 ("Rayquaza VMAX", "82", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  RAYQUAZA_VMAX_83 ("Rayquaza VMAX", "83", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  SHAUNA_84 ("Shauna", "84", Rarity.COMMON, [TRAINER, SUPPORTER]),
  SCHOOLBOY_85 ("Schoolboy", "85", Rarity.COMMON, [TRAINER, SUPPORTER]),
  ZINNIA_S_RESOLVE_86 ("Zinnia's Resolve", "86", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FROSLASS_87 ("Froslass", "87", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TOY_CATCHER_88 ("Toy Catcher", "88", Rarity.UNCOMMON, [TRAINER, ITEM]),
  STORMY_MOUNTAIN_RANGE_89 ("Stormy Mountain Range", "89", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  LIGHTNING_ENERGY_90 ("Lightning Energy", "90", Rarity.COMMON, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  BlueSkyStream(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.BLUE_SKY_STREAM;
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
      case HOPPIP_1:
      return basic (this, hp:HP040, type:G, retreatCost:0) {
        weakness R
        move "Continuous Spin", {
          text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
          energyCost G
          onAttack {
            flipUntilTails {
              damage 20
            }
          }
        }
      };
      case SKIPLOOM_2:
      return evolution (this, from:"Hoppip", hp:HP060, type:G, retreatCost:0) {
        weakness R
        bwAbility "Solar Evolution", {
          text "When you attach an Energy from your hand to this Pokémon during your turn, you may use this Ability. Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          delayedA {
            after ATTACH_ENERGY, self, {
              if (ef.reason == PLAY_FROM_HAND
                && bg.currentTurn == self.owner
                && self.owner.pbg.deck
                && confirm("Use $thisAbility?")) {
                powerUsed()
                def list = deck.search text, {
                  it.cardTypes.is(EVOLUTION) && it.predecessor == self.name
                }
                list.each {
                  evolve self, it
                }
                shuffleDeck()
              }
            }
          }
        }
        move "Spinning Attack", {
          text "20 damage."
          energyCost G
          onAttack {
            damage 20
          }
        }
      };
      case JUMPLUFF_3:
      return evolution (this, from:"Skiploom", hp:HP090, type:G, retreatCost:0) {
        weakness R
        bwAbility "Fluff Barrage", {
          text "This Pokémon may attack twice a turn. (If the first attack Knocks Out your opponent's Active Pokémon, you may attack again after your opponent chooses a new Active Pokémon.)"
          ancient_trait_omega_barrage self, delegate
        }
        move "Spinning Attack", {
          text "60 damage."
          energyCost G
          onAttack {
            damage 60
          }
        }
      };
      case TROPIUS_4:
      return basic (this, hp:HP110, type:G, retreatCost:1) {
        weakness R
        move "Rally Back", {
          text "30+ damage. If any of your Pokémon were Knocked Out by damage from an attack from your opponent's Pokémon during their last turn, this attack does 90 more damage."
          energyCost G, C
          onAttack {
            damage 30
            if (my.lastKnockoutByOpponentDamageTurn == bg.turnCount - 1)
              damage 90
          }
        }
        move "Solar Beam", {
          text "100 damage."
          energyCost G, G, C
          onAttack {
            damage 100
          }
        }
      };
      case PANSAGE_5:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "20 damage."
          energyCost G
          onAttack {
            damage 20
          }
        }
      };
      case SIMISAGE_6:
      return evolution (this, from:"Pansage", hp:HP100, type:G, retreatCost:1) {
        weakness R
        move "Return", {
          text "30 damage. You may draw cards until you have 6 cards in your hand."
          energyCost G
          onAttack {
            damage 30
            def count = 6 - my.hand.size()
            if (count > 0
              && confirm("Draw until you have 6 cards in your hand?")) {
              draw count
            }
          }
        }
        move "Whip Smash", {
          text "70 damage."
          energyCost G, C
          onAttack {
            damage 70
          }
        }
      };
      case TREVENANT_V_7:
      return basic (this, hp:HP210, type:G, retreatCost:2) {
        weakness R
        move "Absorb Life", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost G, C
          onAttack {
            damage 30
            heal 30, self
          }
        }
        move "Shadow Claw", {
          text "120 damage. Discard a random card from your opponent's hand."
          energyCost G, G, C
          onAttack {
            damage 120
            afterDamage {
              discardRandomCardFromOpponentsHand()
            }
          }
        }
      };
      case TREVENANT_VMAX_8:
      return evolution (this, from:"Trevenant V", hp:HP320, type:G, retreatCost:3) {
        weakness R
        move "Missing in the Forest", {
          text "40× damage. This attack does 40 damage for each Supporter card in your opponent's discard pile."
          energyCost G, C
          attackRequirement {
            assert opp.discard.any { it.cardTypes.is(SUPPORTER) } : "No Supporter cards in your opponent's discard pile"
          }
          onAttack {
            damage 40 * opp.discard.findAll({ it.cardTypes.is(SUPPORTER) }).size()
          }
        }
        move "Max Tree", {
          text "180 damage."
          energyCost G, G, C
          onAttack {
            damage 180
          }
        }
      };
      case APPLIN_9:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Rollout", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case VULPIX_10:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Live Coal", {
          text "30 damage."
          energyCost R, C
          onAttack {
            damage 30
          }
        }
      };
      case NINETALES_11:
      return evolution (this, from:"Vulpix", hp:HP120, type:R, retreatCost:2) {
        weakness W
        bwAbility "Nine-Tailed Secret Path", {
          text "The Retreat Cost of each of your Pokémon that has any [R] Energy attached is 2 less."
          getterA GET_RETREAT_COST, BEFORE_LAST, { holder ->
            if ((holder.effect.target as PokemonCardSet).cards.energyCount(R)) {
              holder.object -= 2
            }
          }
        }
        move "Flame Tail", {
          text "60 damage."
          energyCost R, C
          onAttack {
            damage 60
          }
        }
      };
      case VICTINI_12:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Victory Dive", {
          text "30 damage. You may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C, C
          onAttack {
            damage 30
            if (my.deck && confirm("Search your deck for up to 2 cards?")) {
              def list = deck.search min:1, max:2, { true }
              list.moveTo hidden:true, my.hand
              shuffleDeck()
            }
          }
        }
      };
      case PANSEAR_13:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost R
          onAttack {
            flip {
              damage 30
            }
          }
        }
      };
      case SIMISEAR_14:
      return evolution (this, from:"Pansear", hp:HP100, type:R, retreatCost:1) {
        weakness W
        move "Light Punch", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Fire Throw", {
          text "60× damage. Discard up to 2 basic Energy cards from your hand. This attack does 60 damage for each card you discarded in this way."
          energyCost R
          attackRequirement {
            assert my.hand.basicEnergyCardCount() : "No basic Energy cards in your hand"
          }
          onAttack {
            def list = my.hand.select min:1, max:2, text, { BASIC_ENERGY in it.cardTypes }
            damage 60 * list.size()
            afterDamage {
              list.discard()
            }
          }
        }
      };
      case VOLCARONA_V_15:
      return basic (this, hp:HP210, type:R, retreatCost:2) {
        weakness W
        move "Surging Flames", {
          text "20+ damage. This attack does 20 more damage for each basic Energy card in your discard pile. Then, shuffle those cards into your deck."
          energyCost R
          onAttack {
            def list = my.discard.findAll { BASIC_ENERGY in it.cardTypes }
            damage 20 + 20 * list.size()
            afterDamage {
              if (list.notEmpty()) {
                list.moveTo my.deck
                shuffleDeck()
              }
            }
          }
        }
        move "Fire Blast", {
          text "160 damage. Discard an Energy from this Pokémon."
          energyCost R, R, C
          onAttack {
            damage 160
            discardSelfEnergyAfterDamage()
          }
        }
      };
      case SIZZLIPEDE_16:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text " Your opponent's Active Pokémon is now Burned."
          energyCost R
          attackRequirement {
            def defendingAlreadyBurned = BURNED in defending.specialConditions
            assert !defendingAlreadyBurned : "Opponent's Active Pokemon is already Burned"
          }
          onAttack {
            apply BURNED
          }
        }
      };
      case CENTISKORCH_17:
      return evolution (this, from:"Sizzlipede", hp:HP130, type:R, retreatCost:2) {
        weakness W
        move "Coil", {
          text "30 damage. During your next turn, this Pokémon's attacks do 90 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          energyCost R, C
          onAttack {
            damage 30
            increasedDamageDoneToDefending self, defending, 90, thisMove.name
          }
        }
        move "Burning Train", {
          text "120 damage."
          energyCost R, R, C
          onAttack {
            damage 120
          }
        }
      };
      case SHELLDER_18:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness L
        move "Tongue Slap", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case CLOYSTER_19:
      return evolution (this, from:"Shellder", hp:HP130, type:W, retreatCost:2) {
        weakness L
        bwAbility "Shell Armor", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          reducedDamageFromAttacksAbility self, 30, delegate
        }
        move "Aqua Split", {
          text "60 damage. This attack also does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          onAttack {
            damage 60
            multiDamage opp.bench, 2, 30, text
          }
        }
      };
      case GYARADOS_V_20:
      return basic (this, hp:HP220, type:W, retreatCost:3) {
        weakness L
        move "Get Angry", {
          text "20× damage. This attack does 20 damage for each damage counter on this Pokémon."
          energyCost W, W, C
          attackRequirement {
            assert self.numberOfDamageCounters : "No damage counters on $self"
          }
          onAttack {
            damage 20 * self.numberOfDamageCounters
          }
        }
        move "Heavy Storm", {
          text "180 damage."
          energyCost W, W, W, C
          onAttack {
            damage 180
          }
        }
      };
      case GYARADOS_VMAX_21:
      return evolution (this, from:"Gyarados V", hp:HP330, type:W, retreatCost:4) {
        weakness L
        move "Hyper Beam", {
          text "120 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost W, W, C
          onAttack {
            damage 120
            discardDefendingEnergyAfterDamage()
          }
        }
        move "Max Tyrant", {
          text "240 damage."
          energyCost W, W, W, C
          onAttack {
            damage 240
          }
        }
      };
      case GALARIAN_DARUMAKA_22:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Reckless Charge", {
          text "20 damage. Flip a coin. If tails, this Pokémon also does 10 damage to itself."
          energyCost W
          onAttack {
            damage 20
            flipTails { damage 10, self }
          }
        }
      };
      case GALARIAN_DARMANITAN_23:
      return evolution (this, from:"Galarian Darumaka", hp:HP130, type:W, retreatCost:2) {
        weakness M
        move "Powder Snow", {
          text "30 damage. Your opponent's Active Pokémon is now Asleep."
          energyCost W, C
          onAttack {
            damage 30
            applyAfterDamage ASLEEP
          }
        }
        move "Daruma Headbutt", {
          text "130 damage. If this Pokemon has any damage counters on it, this attack can be used for [W]."
          energyCost W
          // TODO: How does this work with metronome/foul play?
          attackRequirement {
            if (!self.numberOfDamageCounters)  {
              assert self.cards.energySufficient(W, W, C) : "Not enough Energy"
            }
          }
          onAttack {
            damage 130
          }
        }
      };
      case CRYOGONAL_24:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness M
        move "Element Chain", {
          text " Look at the top 6 cards of your deck and attach any number of basic Energy cards you find there to your Pokémon in any way you like. Shuffle the other cards back into your deck."
          energyCost W
          attackRequirement {
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            def top6List = my.deck.subList 0, 6
            def numberOfBasicEnergy = top6List.findAll { BASIC_ENERGY in it.cardTypes }.size()
            def selectedEnergyList = top6List.select text, 0, numberOfBasicEnergy, null, { BASIC_ENERGY in it.cardTypes }, { true}
            selectedEnergyList.each {
              attachEnergy my.all.select("Attach $it.name to?"), it
            }
            shuffleDeck()
          }
        }
        move "Icy Snow", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
      };
      case WISHIWASHI_25:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        bwAbility "Group Power", {
          text "If this Pokémon has at least 3 [W] Energy attached, it gets +150 HP."
          getterA GET_FULL_HP, self, { holder ->
            if (self.cards.energyCount(W) >= 3) {
              holder.object += hp 150
            }
          }
        }
        move "Schooling Shot", {
          text "30+ damage. This attack does 30 more damage for each basic Energy attached to this Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            damage 30 * self.cards.basicEnergyCardCount()
          }
        }
      };
      case MAREEP_26:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Rear Kick", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Electro Ball", {
          text "30 damage."
          energyCost L, C
          onAttack {
            damage 30
          }
        }
      };
      case FLAAFFY_27:
      return evolution (this, from:"Mareep", hp:HP090, type:L, retreatCost:2) {
        weakness F
        bwAbility "Dynamotor", {
          text "Once during your turn, you may attach a [L] Energy card from your discard pile to 1 of your Benched Pokémon."
          actionA {
            checkLastTurn()
            assert my.discard.filterByEnergyType(L)
            powerUsed()
            def list = my.discard.filterByEnergyType(L).select("Choose a [L] Energy Card to attach")
            attachEnergy(my.bench.select(), list.first())
          }
        }
        move "Electro Ball", {
          text "50 damage."
          energyCost L, L, C
          onAttack {
            damage 50
          }
        }
      };
      case AMPHAROS_28:
      return evolution (this, from:"Flaaffy", hp:HP150, type:L, retreatCost:2) {
        weakness F
        move "Thunder Shock", {
          text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 40
            flip {
              applyAfterDamage PARALYZED
            }
          }
        }
        move "Electron Crush", {
          text "100+ damage. You may discard 3 [L] Energy from this Pokémon. If you do, this attack does 120 more damage."
          energyCost L, L, L, C
          onAttack {
            damage 100
            if(self.cards.energyCount(L) >= 3 && confirm ("Discard 3 [L] Energy from $self to deal 120 more damage?")) {
              damage 120
              discardSelfEnergyAfterDamage L, L, L
            }
          }
        }
      };
      case PLUSLE_29:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        initHook { Card thisCard ->
          delayed (priority: LAST) {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == thisCard.player && ef.attacker.name.contains("Minun")) {
                bg.em().storeObject("Twins_Spark_${thisCard.player}", bg.turnCount)
              }
            }
          }
        }
        move "Twins Spark", {
          text "20+ damage. If your Minun used an attack during your last turn, this attack does 100 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            def tc = bg.em().retrieveObject("Twins_Spark_${thisCard.player}") ?: -1
            if (tc == bg.turnCount - 2) {
              damage 100
            }
          }
        }
      };
      case MINUN_30:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text " Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily(basic:true, 2, delegate)
        }
        move "Static Shock", {
          text "20 damage."
          energyCost L
          onAttack {
            damage 20
          }
        }
      };
      case TOXEL_31:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Ram", {
          text "20 damage."
          energyCost L
          onAttack {
            damage 20
          }
        }
      };
      case TOXTRICITY_32:
      return evolution (this, from:"Toxel", hp:HP130, type:L, retreatCost:2) {
        weakness F
        move "Punk Shock", {
          text "70 damage. You may leave your opponent's Active Pokémon Paralyzed . If you do, this Pokémon also does 70 damage to itself."
          energyCost L, C
          onAttack {
            damage 70
            if(confirm("Deal 70 damage to $self in order to paralyze $defending ?")) {
              damage 70, self
              applyAfterDamage PARALYZED
            }
          }
        }
      };
      case REGIELEKI_33:
      return basic (this, hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Static Shock", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Teraspark", {
          text "120 damage. Discard all [L] Energy from this Pokémon. This attack also does 40 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 120
            multiDamage(opp.bench, 2, 40)
            afterDamage {
              discardAllSelfEnergy(L)
            }
          }
        }
      };
      case SANDSHREW_34:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Dig Up", {
          text " Look at the top card of your deck. You may discard that card."
          energyCost F
          attackRequirement {
            assert deck : "Deck is empty"
          }
          onAttack {
            def topCard = deck.subList 0, 1
            topCard.showToMe(bg, text)
            if(confirm("Discard $topCard from top of your deck?"))
              topCard.discard()
          }
        }
        move "Everyone Rollout", {
          text "20× damage. This attack does 20 damage for each of your Benched Pokémon that has the Everyone Rollout attack."
          energyCost C, C
          attackRequirement {
            assert my.bench.any { it.getTopPokemonCard().moves.any { it.name == "Everyone Rollout" } } :
              "No benched Pokemon with the $thisMove.name move"
          }
          onAttack {
            damage 20 * my.bench.findAll { it.getTopPokemonCard().moves.any { it.name == "Everyone Rollout" } }.size()
          }
        }
      };
      case SANDSLASH_35:
      return evolution (this, from:"Sandshrew", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Dig Uppercut", {
          text "60 damage. Put a card from your discard pile into your hand."
          energyCost F, C
          onAttack {
            damage 60
            afterDamage {
              def card = my.discard.select text
              card.showToOpponent bg, "Card moved from Opponent's discard pile to their hand."
              card.moveTo my.hand
            }
          }
        }
      };
      case MEDICHAM_V_36:
      return basic (this, hp:HP210, type:F, retreatCost:2) {
        weakness P
        move "Yoga Loop", {
          text " Put 2 damage counters on 1 of your opponent's Pokémon. If that Pokémon is Knocked Out by the effect of this attack, take another turn after this one. (Skip Pokémon Checkup.) If 1 of your Pokémon used Yoga Loop during your last turn, this attack can't be used."
          energyCost C, C
          attackRequirement {
            assert self.owner.pbg.lastTurnMove != thisMove.name : "If 1 of your Pokémon used $thisMove.name during your last turn, this attack can't be used"
          }
          onAttack {
            def tar = opp.all.select "Put 2 damage counters on 1 of your opponent's Pokemon"
            directDamage 20, tar
            afterDamage {
              if (tar.slatedToKO) {
                delayed(priority: BEFORE_LAST) {
                  before BETWEEN_TURNS, {
                    prevent()
                    bg.turnCount += 1
                    draw 1
                    // TODO: Preventing between turns doesn't update last used move, starting a new turn for the same player should be its own effect
                    my.lastTurnMove = thisMove.name
                    bc "$thisMove.name started a new turn!"
                    unregister()
                  }
                }
              }
            }
          }
        }
        move "Smash Uppercut", {
          text "100 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C, C
          onAttack {
            noResistanceDamage 100, defending
          }
        }
      };
      case BALTOY_37:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Smack", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case CLAYDOL_38:
      return evolution (this, from:"Baltoy", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Rapid Spin", {
          text "30 damage. Switch this Pokémon with 1 of your Benched Pokémon. If you do, your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            if (opp.bench) sw defending, opp.bench.oppSelect("Select new active.")
            switchYourActive()
          }
        }
        move "Ancient Seal", {
          text " Put damage counters on your opponent's Active Pokémon until its remaining HP is 60."
          energyCost F, F
          attackRequirement {
            assert defending.remainingHP.value > 60 : "Opponent's Active Pokémon's HP is already 60 or lower"
          }
          onAttack {
            directDamage defending.remainingHP.value - 60, defending
          }
        }
      };
      case LANDORUS_39:
      return basic (this, hp:HP120, type:F, retreatCost:1) {
        weakness G
        move "Strafe", {
          text "20 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            damage 20
            switchYourActive may:true
          }
        }
        move "Earthen Roar", {
          text "120 damage. Move all Energy from this Pokémon to your Benched Pokémon in any way you like."
          energyCost F, F, C
          onAttack {
            damage 120
            afterDamage {
              if(my.bench.notEmpty) {
                self.cards.filterByType(ENERGY).each {
                  energySwitch(self, my.bench.select("Move $it to?"), it)
                }
              }
            }
          }
        }
      };
      case STUFFUL_40:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness P
        move "Beat", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Rollout", {
          text "30 damage."
          energyCost F, C
          onAttack {
            damage 30
          }
        }
      };
      case BEWEAR_41:
      return evolution (this, from:"Stufful", hp:HP130, type:F, retreatCost:3) {
        weakness P
        move "Split Spiral Punch", {
          text "40 damage. Your opponent's Active Pokémon is now Confused."
          energyCost F, C
          onAttack {
            damage 40
            applyAfterDamage CONFUSED
          }
        }
        move "Strength", {
          text "130 damage."
          energyCost F, F, C
          onAttack {
            damage 130
          }
        }
      };
      case DRAGONITE_V_42:
      return basic (this, hp:HP230, type:N, retreatCost:3) {
        move "Shred", {
          text "50 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
          energyCost C, C
          onAttack {
            shredDamage 50
          }
        }
        move "Dragon Gale", {
          text "250 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, L
          onAttack {
            damage 250
            my.bench.each {
              damage 20, it
            }
          }
        }
      };
      case BAGON_43:
      return basic (this, hp:HP070, type:N, retreatCost:2) {
        move "Gnaw", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "30 damage."
          energyCost R, W
          onAttack {
            damage 30
          }
        }
      };
      case SHELGON_44:
      return evolution (this, from:"Bagon", hp:HP090, type:N, retreatCost:3) {
        move "Hard Roll", {
          text "50 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon."
          energyCost R, W
          onAttack {
            damage 50
            flip {
              preventAllEffectsNextTurn()
            }
          }
        }
      };
      case SALAMENCE_45:
      return evolution (this, from:"Shelgon", hp:HP170, type:N, retreatCost:2) {
        bwAbility "Intimidating Roar", {
          text "Once during your turn, you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
          actionA {
            checkLastTurn()
            assert opp.bench
            powerUsed()
            sw opp.active, opp.bench.oppSelect("Select new Active Pokémon."), SRC_ABILITY
          }
        }
        move "Dragon Savage", {
          text "100+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 120 more damage."
          energyCost R, W
          onAttack {
            damage 100
            if (defending.numberOfDamageCounters) damage 120
          }
        }
      };
      case RAYQUAZA_V_46:
      return basic (this, hp:HP210, type:N, retreatCost:2) {
        move "Dragon Pulse", {
          text "40 damage. Discard the top 2 cards of your deck."
          energyCost L
          onAttack {
            damage 40
            deck.subList(0, 2).discard()
          }
        }
        move "Spiral Burst", {
          text "20+ damage. You may discard up to 2 basic [R] Energy or up to 2 basic [L] Energy from this Pokémon. This attack does 80 more damage for each card you discarded in this way."
          energyCost R, L
          onAttack {
            damage 20
            def selectedEnergy = self.cards.select(min:0, max:2, "You may discard up to 2 basic [R] Energy or up to 2 basic [L] Energy from this Pokémon", { Card card ->
              card instanceof BasicEnergyCard && (card.asEnergyCard().containsType(R) || card.asEnergyCard().containsType(L))
            }, bg.currentTurn, { CardList list ->
              def typeMap = ["R": 0, "L": 0]
              list.each {
                if(it.asEnergyCard().containsType(R)) typeMap.R += 1
                else if (it.asEnergyCard().containsType(L)) typeMap.L += 1
              }
              // Cannot discard both R and L Energy https://compendium.pokegym.net/ruling/1596/
              (!typeMap.R && !typeMap.L) || (typeMap.R && !typeMap.L) || (!typeMap.R && typeMap.L)
            })

            if (selectedEnergy) {
              damage 80 * selectedEnergy.size()
              afterDamage {
                selectedEnergy.discard()
              }
            }
          }
        }
      };
      case RAYQUAZA_VMAX_47:
      return evolution (this, from:"Rayquaza V", hp:HP320, type:N, retreatCost:2) {
        bwAbility "Blue Sky Wave", {
          text "Once during your turn, you may discard your hand and draw 3 cards."
          actionA {
            checkLastTurn()
            powerUsed()
            my.hand.discard()
            draw 3
          }
        }
        move "Max Burst", {
          text "20+ damage. Discard any amount of basic [R] Energy or any amount of basic [L] Energy from this Pokémon. This attack does 80 more damage for each card you discarded in this way."
          energyCost R, L
          onAttack {
            damage 20
            def selectedEnergy = self.cards.select(min:0, max:self.cards.filterByType(BASIC_ENERGY).size(),
              "You may discard up to 2 basic [R] Energy or up to 2 basic [L] Energy from this Pokémon",
              { Card card ->
              card instanceof BasicEnergyCard && (card.asEnergyCard().containsType(R) || card.asEnergyCard().containsType(L))
            }, bg.currentTurn, { CardList list ->
              def typeMap = ["R": 0, "L": 0]
              list.each {
                if(it.asEnergyCard().containsType(R)) typeMap.R += 1
                else if (it.asEnergyCard().containsType(L)) typeMap.L += 1
              }
              // Cannot discard both R and L Energy https://compendium.pokegym.net/ruling/1596/
              (!typeMap.R && !typeMap.L) || (typeMap.R && !typeMap.L) || (!typeMap.R && typeMap.L)
            })

            if (selectedEnergy) {
              damage 80 * selectedEnergy.size()
              afterDamage {
                selectedEnergy.discard()
              }
            }
          }
        }
      };
      case ZYGARDE_48:
      return basic (this, hp:HP130, type:N, retreatCost:2) {
        move "Bite", {
          text "30 damage."
          energyCost C
          onAttack {
            damage 30
          }
        }
        move "Judgment Surge", {
          text " This attack does 40 damage to 1 of your opponent's Pokémon for each Prize card your opponent has taken. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, F, C
          attackRequirement {
            assert opp.prizeCardSet.takenCount : "Opponent has not taken any Prize cards yet"
          }
          onAttack {
            def tar = opp.all.select text
            damage 40 * opp.prizeCardSet.takenCount, tar
          }
        }
      };
      case TURTONATOR_49:
      return basic (this, hp:HP130, type:N, retreatCost:3) {
        move "Shell Trap", {
          text "30 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out) , put 8 damage counters on the Attacking Pokémon."
          energyCost R, F
          onAttack {
            damage 30
            ifDamagedByAttackNextTurn(delegate) {
              bc "$thisMove.name activates"
              directDamage 80, ef.attacker as PokemonCardSet
            }
          }
        }
        move "Heat Crash", {
          text "80 damage."
          energyCost C, C, C
          onAttack {
            damage 80
          }
        }
      };
      case FLAPPLE_50:
      return evolution (this, from:"Applin", hp:HP080, type:N, retreatCost:1) {
        move "Acidic Mucus", {
          text "50× damage. This attack does 50 damage for each of your opponent's Pokémon that has an Ability."
          energyCost C
          attackRequirement {
            assert opp.all.any { it.abilities } : "None of your opponent's Pokémon has an Ability"
          }
          onAttack {
            opp.all.findAll { it.abilities }.each {
              damage 50, it
            }
          }
        }
        move "Fighting Tackle", {
          text "80+ damage. If your opponent's Active Pokémon is a Pokémon V , this attack does 80 more damage."
          energyCost G, R
          onAttack {
            damage 80
            if (defending.pokemonV) damage 80
          }
        }
      };
      case APPLETUN_51:
      return evolution (this, from:"Applin", hp:HP090, type:N, retreatCost:3) {
        move "Sticky Mucus", {
          text "70× damage. This attack does 70 damage for each Special Energy attached to each of your opponent's Pokémon."
          energyCost C
          attackRequirement {
            assert opp.all.any { it.cards.filterByType(SPECIAL_ENERGY) } : "None of your opponent's Pokémon has Special Energy attached"
          }
          onAttack {
            def pokemonWithSpecialEnergy = opp.all.findAll { it.cards.filterByType(SPECIAL_ENERGY) }
            damage 70 * pokemonWithSpecialEnergy.size()
          }
        }
        move "Fighting Tackle", {
          text "80+ damage. If your opponent's Active Pokémon is a Pokémon V , this attack does 80 more damage."
          energyCost G, R
          onAttack {
            damage 80
            if (defending.pokemonV) damage 80
          }
        }
      };
      case REGIDRAGO_52:
      return basic (this, hp:HP130, type:N, retreatCost:3) {
        move "Hammer In", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Dragon Energy", {
          text "240- damage. This attack does 20 less damage for each damage counter on this Pokémon."
          energyCost G, G, R
          onAttack {
            damage 240 - 20 * self.numberOfDamageCounters
          }
        }
      };
      case CHANSEY_53:
      return basic (this, hp:HP110, type:C, retreatCost:2) {
        weakness F
        move "Drain Slap", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            heal 30, self
          }
        }
        move "Gentle Slap", {
          text "70 damage."
          energyCost C, C, C
          onAttack {
            damage 70
          }
        }
      };
      case BLISSEY_54:
      return evolution (this, from:"Chansey", hp:HP130, type:C, retreatCost:2) {
        weakness F
        bwAbility "Oval Adept", {
          text "Prevent all damage done to each of your Pokémon that has the Everyone Rollout attack by attacks from Pokémon VMAX."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.owner == self.owner
                  && it.from.owner == self.owner.opposite
                  && it.from.pokemonVMAX
                  && it.dmg.value && it.notNoEffect) {
                  bc "$name reduces damage"
                  it.dmg = hp(0)
                }
              }
            }
          }
        }
        move "Everyone Rollout", {
          text "20× damage. This attack does 20 damage for each of your Benched Pokémon that has the Everyone Rollout attack."
          energyCost C, C, C
          attackRequirement {
            assert my.bench.any { it.getTopPokemonCard().moves.any { it.name == "Everyone Rollout" } } :
              "No benched Pokemon with the $thisMove.name move"
          }
          onAttack {
            damage 20 * my.bench.findAll { it.getTopPokemonCard().moves.any { it.name == "Everyone Rollout" } }.size()
          }
        }
      };
      case STANTLER_55:
      return basic (this, hp:HP110, type:C, retreatCost:1) {
        weakness F
        move "Rear Kick", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Wild Dive", {
          text "30× damage. This attack does 30 damage for each Energy attached to your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {
            assert defending.energyCards : "Opponent's Active Pokémon has no Energy attached"
          }
          onAttack {
            damage 30 * defending.energyCards.size()
          }
        }
      };
      case LUCKY_ICE_POP_56:
      return itemCard (this) {
        text "Heal 20 damage from your Active Pokémon. Then" +
          "flip a coin. If heads" +
          "if you played this Lucky Ice Pop from your hand" +
          "put this card into your hand instead of the discard pile."
        onPlay {
          heal 20, active
          flip {
            delayed {
              before DISCARD, {
                if (ef.card == thisCard) {
                  prevent()
                  moveCard thisCard, my.hand
                  unregister()
                }
              }
            }
          }
        }
        playRequirement {
          assert my.active.numberOfDamageCounters : "Active Pokémon has no damage counters on it"
        }
      };
      case GREAT_BALL_57:
        return copy (EmergingPowers.GREAT_BALL_93, this);
      case TOY_CATCHER_58:
      return itemCard (this) {
        text "Choose 1 of your opponent's Benched Pokémon with 50 HP or less and switch it with their Active Pokémon."
        onPlay {
          sw opp.active, opp.bench.select(thisCard.cardText)
        }
        playRequirement {
          assert opp.bench.any { it.remainingHP.value <= 50 } : "Opponent has no Benched Pokémon with 50 HP or less remaining"
        }
      };
      case SWITCH_59:
        return copy(BlackWhite.SWITCH_104, this)
      case RUBBERY_GLOVES_60:
      return pokemonTool (this) {
        text "The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [L] Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay {reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (it.from == self && it.to.active && it.to.owner == self.owner.opposite && it.dmg.value && it.to.types.contains(L)) {
                  it.dmg += hp(30)
                  bc "$thisCard +30"
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case NETHER_MASK_61:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to is in the Active Spot and is damaged by an attack from your opponent's Pokémon (even if it is Knocked Out)" +
          "your opponent discards a card from their hand."
        def eff
        onPlay {reason->
          eff = delayed {
            def applyEffect
            before APPLY_ATTACK_DAMAGES, {
              applyEffect = bg.currentTurn == self.owner.opposite && self.active && bg.dm().find { it.to == self && it.dmg.value }
            }
            after APPLY_ATTACK_DAMAGES, {
              if (applyEffect && self.owner.opposite.pbg.hand) {
                self.owner.opposite.pbg.hand.select({ true }, self.owner.opposite).discard()
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case RAPID_STRIKE_SCROLL_OF_THE_FLYING_DRAGON_62:
      return pokemonTool (this) {
        text "The Rapid Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)"
        def newMove
        onPlay {reason->
          def moveBody = {
            text "Discard 2 Energy from this Pokémon. This attack does 90 damage to 1 of your " +
              "opponent's Pokémon. (Don't apply Weakness or Resistance for Benched Pokémon.)"
            attackRequirement {
              // self is not set properly creating a move like this, use bg.ownActive() instead
              assert bg.ownActive().rapidStrike : "${bg.ownActive()} is not a $RAPID_STRIKE Pokémon"
            }
            energyCost R, L
            onAttack {
              discardSelfEnergyAfterDamage C, C
              damage 90, opp.all.select text
            }
          }
          Move move = new Move("Meteor")
          moveBody.delegate = new MoveBuilder(thisMove: move)
          moveBody.call()
          newMove = getter GET_MOVE_LIST, self, {h->
            if (h.effect.target.rapidStrike) {
              def moveList = []
              moveList.addAll h.object
              moveList.add move
              h.object = moveList
            }
          }
        }
        onRemoveFromPlay {
          newMove.unregister()
        }
      };
      case SHAUNA_63:
        return copy(Xy.SHAUNA_127, this)
      case SCHOOLBOY_64:
      return supporter (this) {
        text "Draw 2 cards. If your opponent has exactly 1" +
          "3" +
          "or 5 Prize cards remaining" +
          "draw 2 more cards."
        onPlay {
          draw 2
          def count = opp.prizeCardSet.remainingCount
          if (count == 1 || count == 3 || count == 5)
            draw 2
        }
        playRequirement {
          assert deck : "Deck is empty"
        }
      };
      case ZINNIA_S_RESOLVE_65:
      return supporter (this) {
        text "You can play this card only if you discard 2 other cards from your hand. Draw a card for each of your opponent's Pokémon in play."
        onPlay {
          my.hand.getExcludedList(thisCard).select(min:2,max:2,"To discard").discard()
          draw opp.all.size()
        }
        playRequirement{
          assert hand.getExcludedList(thisCard).size() >= 2 : "You do not have 2 other cards to discard from your hand"
          assert deck : "Your deck is empty"
        }
      };
      case STORMY_MOUNTAIN_RANGE_66:
      return stadium (this) {
        text "Once during each player's turn" +
          "that player may search their deck for a Basic [L] Pokémon or Basic [N] Pokémon" +
          "put it onto their Bench" +
          "and shuffle their deck."
        def lastTurn
        def actions = []
        onPlay {
          actions = action(thisCard, "Stadium: $thisCard") {
            assert lastTurn != bg.turnCount : "You have already used $thisCard this turn"
            assert my.bench.notFull : "You do not have any room on your bench"
            assert deck : "Your deck is empty"
            bc "Used $thisCard"
            lastTurn = bg.turnCount
            def card = deck.search {Card c->
              c.cardTypes.is(BASIC) && (c.asPokemonCard().types.contains(L) || c.asPokemonCard().types.contains(N))
            }
            card.each {
              benchPCS it
            }
          }
        }
        onRemoveFromPlay{
          actions.each { bg.gm().unregisterAction it }
        }
      };
      case AURORA_ENERGY_67:
      return copy (SwordShield.AURORA_ENERGY_186, this);
      case TREVENANT_V_68:
      return copy (TREVENANT_V_7, this);
      case VOLCARONA_V_69:
      return copy (VOLCARONA_V_15, this);
      case GYARADOS_V_70:
      return copy (GYARADOS_V_20, this);
      case MEDICHAM_V_71:
      return copy (MEDICHAM_V_36, this);
      case MEDICHAM_V_72:
      return copy (MEDICHAM_V_36, this);
      case DRAGONITE_V_73:
      return copy (DRAGONITE_V_42, this);
      case DRAGONITE_V_74:
      return copy (DRAGONITE_V_42, this);
      case RAYQUAZA_V_75:
      return copy (RAYQUAZA_V_46, this);
      case RAYQUAZA_V_76:
      return copy (RAYQUAZA_V_46, this);
      case SHAUNA_77:
      return copy (SHAUNA_63, this);
      case SCHOOLBOY_78:
      return copy (SCHOOLBOY_64, this);
      case ZINNIA_S_RESOLVE_79:
      return copy (ZINNIA_S_RESOLVE_65, this);
      case TREVENANT_VMAX_80:
      return copy (TREVENANT_VMAX_8, this);
      case GYARADOS_VMAX_81:
      return copy (GYARADOS_VMAX_21, this);
      case RAYQUAZA_VMAX_82:
      return copy (RAYQUAZA_VMAX_47, this);
      case RAYQUAZA_VMAX_83:
      return copy (RAYQUAZA_VMAX_47, this);
      case SHAUNA_84:
      return copy (SHAUNA_63, this);
      case SCHOOLBOY_85:
      return copy (SCHOOLBOY_64, this);
      case ZINNIA_S_RESOLVE_86:
      return copy (ZINNIA_S_RESOLVE_65, this);
      case FROSLASS_87:
      return copy (ChillingReign.FROSLASS_36, this);
      case TOY_CATCHER_88:
      return copy (TOY_CATCHER_58, this);
      case STORMY_MOUNTAIN_RANGE_89:
      return copy (STORMY_MOUNTAIN_RANGE_66, this);
      case LIGHTNING_ENERGY_90:
      return basicEnergy (this, L);
      default:
      return null;
    }
  }
}
