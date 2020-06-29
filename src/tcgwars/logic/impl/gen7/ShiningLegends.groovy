package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen2.Aquapolis
import tcgwars.logic.impl.gen5.BlackWhite
import tcgwars.logic.impl.gen5.DarkExplorers
import tcgwars.logic.impl.gen5.EmergingPowers
import tcgwars.logic.impl.gen6.KalosStarterSet
import tcgwars.logic.impl.gen6.PrimalClash
import tcgwars.logic.impl.gen6.Xy;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum ShiningLegends implements LogicCardInfo {

  BULBASAUR_1 ("Bulbasaur", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  IVYSAUR_2 ("Ivysaur", 2, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VENUSAUR_3 ("Venusaur", 3, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SHROOMISH_4 ("Shroomish", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BRELOOM_5 ("Breloom", 5, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CARNIVINE_6 ("Carnivine", 6, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SHAYMIN_7 ("Shaymin", 7, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  VIRIZION_8 ("Virizion", 8, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SHINING_GENESECT_9 ("Shining Genesect", 9, Rarity.SHINING, [BASIC, POKEMON, _GRASS_]),
  ENTEI_GX_10 ("Entei-GX", 10, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  TORKOAL_11 ("Torkoal", 11, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  LARVESTA_12 ("Larvesta", 12, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  VOLCARONA_13 ("Volcarona", 13, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RESHIRAM_14 ("Reshiram", 14, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  LITTEN_15 ("Litten", 15, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TORRACAT_16 ("Torracat", 16, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  INCINEROAR_17 ("Incineroar", 17, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  TOTODILE_18 ("Totodile", 18, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CROCONAW_19 ("Croconaw", 19, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  FERALIGATR_20 ("Feraligatr", 20, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  QWILFISH_21 ("Qwilfish", 21, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BUIZEL_22 ("Buizel", 22, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FLOATZEL_23 ("Floatzel", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PALKIA_24 ("Palkia", 24, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MANAPHY_25 ("Manaphy", 25, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  KELDEO_26 ("Keldeo", 26, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  SHINING_VOLCANION_27 ("Shining Volcanion", 27, Rarity.SHINING, [BASIC, POKEMON, _WATER_]),
  PIKACHU_28 ("Pikachu", 28, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RAICHU_GX_29 ("Raichu-GX", 29, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  VOLTORB_30 ("Voltorb", 30, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRODE_31 ("Electrode", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RAIKOU_32 ("Raikou", 32, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  PLUSLE_33 ("Plusle", 33, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MINUN_34 ("Minun", 34, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ZEKROM_35 ("Zekrom", 35, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  EKANS_36 ("Ekans", 36, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ARBOK_37 ("Arbok", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  JYNX_38 ("Jynx", 38, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MEWTWO_GX_39 ("Mewtwo-GX", 39, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  SHINING_MEW_40 ("Shining Mew", 40, Rarity.SHINING, [BASIC, POKEMON, _PSYCHIC_]),
  LATIOS_41 ("Latios", 41, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  SHINING_JIRACHI_42 ("Shining Jirachi", 42, Rarity.SHINING, [BASIC, POKEMON, _PSYCHIC_]),
  GOLETT_43 ("Golett", 43, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  GOLURK_44 ("Golurk", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MARSHADOW_45 ("Marshadow", 45, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  STUNFISK_46 ("Stunfisk", 46, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SPIRITOMB_47 ("Spiritomb", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  PURRLOIN_48 ("Purrloin", 48, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  LIEPARD_49 ("Liepard", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SCRAGGY_50 ("Scraggy", 50, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SCRAFTY_51 ("Scrafty", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  ZORUA_52 ("Zorua", 52, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ZOROARK_GX_53 ("Zoroark-GX", 53, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
  YVELTAL_54 ("Yveltal", 54, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  HOOPA_55 ("Hoopa", 55, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  SHINING_RAYQUAZA_56 ("Shining Rayquaza", 56, Rarity.SHINING, [BASIC, POKEMON, _DRAGON_]),
  SHINING_ARCEUS_57 ("Shining Arceus", 57, Rarity.SHINING, [BASIC, POKEMON, _COLORLESS_]),
  DAMAGE_MOVER_58 ("Damage Mover", 58, Rarity.UNCOMMON, [ITEM, TRAINER]),
  ENERGY_RETRIEVAL_59 ("Energy Retrieval", 59, Rarity.UNCOMMON, [ITEM, TRAINER]),
  GREAT_BALL_60 ("Great Ball", 60, Rarity.UNCOMMON, [ITEM, TRAINER]),
  HAU_61 ("Hau", 61, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LILLIE_62 ("Lillie", 62, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  POKEMON_BREEDER_63 ("Pokémon Breeder", 63, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  POKEMON_CATCHER_64 ("Pokémon Catcher", 64, Rarity.UNCOMMON, [ITEM, TRAINER]),
  SOPHOCLES_65 ("Sophocles", 65, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  SUPER_SCOOP_UP_66 ("Super Scoop Up", 66, Rarity.UNCOMMON, [ITEM, TRAINER]),
  SWITCH_67 ("Switch", 67, Rarity.UNCOMMON, [ITEM, TRAINER]),
  ULTRA_BALL_68 ("Ultra Ball", 68, Rarity.UNCOMMON, [ITEM, TRAINER]),
  DOUBLE_COLORLESS_ENERGY_69 ("Double Colorless Energy", 69, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  WARP_ENERGY_70 ("Warp Energy", 70, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ENTEI_GX_71 ("Entei-GX", 71, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  MEWTWO_GX_72 ("Mewtwo-GX", 72, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  POKEMON_BREEDER_73 ("Pokémon Breeder", 73, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  ENTEI_GX_74 ("Entei-GX", 74, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  RAICHU_GX_75 ("Raichu-GX", 75, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  MEWTWO_GX_76 ("Mewtwo-GX", 76, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  ZOROARK_GX_77 ("Zoroark-GX", 77, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
  MEWTWO_GX_78 ("Mewtwo-GX", 78, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  ShiningLegends(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SHINING_LEGENDS;
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
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Razor Leaf", {
            text "30 damage."
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case IVYSAUR_2:
        return evolution (this, from:"Bulbasaur", hp:HP100, type:GRASS, retreatCost:4) {
          weakness FIRE
          move "Razor Leaf", {
            text "30 damage."
            energyCost G, C
            onAttack {
              damage 30
            }
          }
          move "Toxic Whip", {
            text "50 damage. Your opponent's Active Pokémon is now Confused and Poisoned."
            energyCost G, G, C, C
            onAttack {
              damage 50
              afterDamage {
                apply CONFUSED
                apply POISONED
              }
            }
          }

        };
      case VENUSAUR_3:
        return evolution (this, from:"Ivysaur", hp:HP160, type:GRASS, retreatCost:4) {
          weakness FIRE
          bwAbility "Jungle Totem", {
            text "Each basic [G] Energy attached to your Pokémon provides [G][G] Energy. You can't apply more than 1 Jungle Totem Ability at a time."
            getterA GET_ENERGY_TYPES, { holder->
              if(holder.effect.target.owner == self.owner
                && holder.effect.card.containsTypePlain(G)
                && holder.effect.card.cardTypes.is(BASIC_ENERGY)) {
                holder.object = [[G] as Set,[G] as Set]
              }
            }
          }
          move "Solar Beam", {
            text "90 damage."
            energyCost G, G, C, C
            onAttack {
              damage 90
            }
          }

        };
      case SHROOMISH_4:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Absorb", {
            text "20 damage. Heal 20 damage from this Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              healAfterDamage 20, self
            }
          }

        };
      case BRELOOM_5:
        return evolution (this, from:"Shroomish", hp:HP110, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Hibernation Spore", {
            text "Your opponent's Active Pokémon is now Asleep. Your opponent flips 2 coins instead of 1 between turns. If either of them is tails, that Pokémon is still Asleep."
            energyCost G
            onAttack {
              apply ASLEEP, defending
              delayed {
                after CLEAR_SPECIAL_CONDITION, defending, {
                  if(ef.types.contains(ASLEEP)){
                    unregister()
                  }
                }
                before ASLEEP_SPC, null, null, BEGIN_TURN, {
                  if(ef.target == defending){ //MARK parentEvent
                    flip "Asleep (Hibernation Spore)", 2, {}, {}, [2:{
                      ef.unregisterItself(bg.em());
                    },1:{
                      bc "$self is still asleep."
                    },0:{
                      bc "$self is still asleep."
                    }]
                    prevent()
                  }
                }
              }
            }
          }
          move "Magnum Punch", {
            text "80 damage."
            energyCost C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case CARNIVINE_6:
        return basic (this, hp:HP100, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Flick Poison", {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Poisoned."
            energyCost G
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              def target = opp.bench.select("Select the new Active Pokémon.")
              if ( swFromBench (defending, target) ) { apply POISONED, target }
            }
          }
          move "Crunch", {
            text "30 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost G, C
            onAttack {
              damage 30
              afterDamage {discardDefendingEnergy()}
            }
          }

        };
      case SHAYMIN_7:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Flippity Flap", {
            text "Shuffle your hand into your deck. Then, draw 6 cards."
            energyCost G
            onAttack {
              shuffleDeck(hand)
              hand.clear()
              draw 6
            }
          }
          move "Rally Back", {
            text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent's attack during their last turn, this attack does 90 more damage."
            energyCost G, C
            onAttack {
              damage 30
              if(my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1) damage 90
            }
          }

        };
      case VIRIZION_8:
        return basic (this, hp:HP110, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Wrapped in Wind", {
            text "30 damage. You may attach a basic Energy from your hand to this Pokémon."
            energyCost G
            onAttack {
              damage 30
              afterDamage {
                attachEnergyFrom(may: true, basic: true, my.hand, self)
              }
            }
          }
          move "Pike", {
            text "90 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G, G, C
            onAttack {
              damage 90
              if(opp.bench) damage 30, opp.bench.select()
            }
          }

        };
      case SHINING_GENESECT_9:
        return basic (this, hp:HP130, type:GRASS, retreatCost:2) {
          weakness FIRE
          bwAbility "Energy Reload", {
            text "Once during your turn (before your attack), you may move a [G] Energy from 1 of your other Pokémon to this Pokémon."
            actionA {
              checkLastTurn()
              def tar = my.all.findAll {it != self && it.cards.energyCount(G)}
              assert tar : "No [G] found"
              powerUsed()
              moveEnergy(type: G, tar, self, SRC_ABILITY)
            }
          }
          move "Gaia Blaster", {
            text "50+ damage. This attack does 20 more damage times the amount of [G] Energy attached to this Pokémon."
            energyCost C, C, C
            onAttack {
              damage 50+20*self.cards.energyCount(G)
            }
          }

        };
      case ENTEI_GX_10:
        return basic (this, hp:HP180, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Combustion", {
            text "50 damage."
            energyCost R, C
            onAttack {
              damage 50
            }
          }
          move "Fire Fang", {
            text "100 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R, R, C
            onAttack {
              damage 100
              applyAfterDamage BURNED
            }
          }
          move "Brave Burn GX", {
            text "This attack does 150 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
            energyCost R, R, C
            attackRequirement {
              gxCheck()
              assert opp.bench
            }
            onAttack {
              gxPerform()
              damage 150, opp.bench.select()
            }
          }

        };
      case TORKOAL_11:
        return basic (this, hp:HP110, type:FIRE, retreatCost:3) {
          weakness WATER
          move "High-Pressure Heat", {
            text "30 damage. During your next turn, this Pokémon's High-Pressure Heat attack does 50 more damage (before applying Weakness and Resistance)."
            energyCost C, C
            onAttack {
              damage 30
              increasedBaseDamageNextTurn("High-Pressure Heat", hp(50))
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy from this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 90
              afterDamage{
                discardSelfEnergy C
              }
            }
          }

        };
      case LARVESTA_12:
        return basic (this, hp:HP080, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Flare", {
            text "30 damage."
            energyCost R, C
            onAttack {
              damage 30
            }
          }

        };
      case VOLCARONA_13:
        return evolution (this, from:"Larvesta", hp:HP120, type:FIRE, retreatCost:1) {
          weakness WATER
          bwAbility "Heat Cyclone", {
            text "Once during your turn (before your attack), you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
            actionA {
              checkLastTurn()
              assert opp.bench : "No opponent bench"
              powerUsed()
              sw(opp.active, opp.bench.oppSelect("New Active Pokemon"))
            }
          }
          move "Heat Blast", {
            text "60 damage."
            energyCost R, C
            onAttack {
              damage 60
            }
          }

        };
      case RESHIRAM_14:
        return basic (this, hp:HP130, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Outrage", {
            text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost C, C
            onAttack {
              damage 20+10*self.numberOfDamageCounters
            }
          }
          move "Scorching Breath", {
            text "130 damage. This Pokémon can't attack during your next turn."
            energyCost R, R, C
            onAttack {
              damage 130
              cantAttackNextTurn(self)
            }
          }

        };
      case LITTEN_15:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Live Coal", {
            text "20 damage."
            energyCost R
            onAttack {
              damage 20
            }
          }

        };
      case TORRACAT_16:
        return evolution (this, from:"Litten", hp:HP090, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Swagger", {
            text "Flip a coin. If heads, discard an Energy card from your opponent's Active Pokémon."
            energyCost C
            onAttack {
              flip {discardDefendingEnergy()}
            }
          }
          move "Fire Claws", {
            text "30 damage."
            energyCost R, C
            onAttack {
              damage 30
            }
          }

        };
      case INCINEROAR_17:
        return evolution (this, from:"Torracat", hp:HP170, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Profane Punch", {
            text "50+ damage. If your Benched Pokémon have any damage counters on them, this attack does 80 more damage."
            energyCost R, C
            onAttack {
              damage 50
              if(my.bench.find{it.numberOfDamageCounters}) damage 80
            }
          }
          move "Flare Blitz", {
            text "180 damage. Discard all [R] Energy attached to this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 180
              afterDamage{
                discardAllSelfEnergy(R)
              }
            }
          }

        };
      case TOTODILE_18:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Gun", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Bite", {
            text "20 damage."
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case CROCONAW_19:
        return evolution (this, from:"Totodile", hp:HP090, type:WATER, retreatCost:3) {
          weakness GRASS
          bwAbility "Plunge", {
            text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may move all Energy from your Active Pokémon to this Pokémon. If you do, switch it with your Active Pokémon."
            actionA {
              checkLastTurn()
              assert self.benched
              powerUsed()
              my.active.energyCards.each {
                energySwitch(my.active, self, it)
              }
              sw my.active, self
            }
          }
          move "Bite", {
            text "60 damage."
            energyCost W, C, C
            onAttack {
              damage 60
            }
          }

        };
      case FERALIGATR_20:
        return evolution (this, from:"Croconaw", hp:HP160, type:WATER, retreatCost:3) {
          weakness GRASS
          move "Crunch", {
            text "80 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost W, C, C
            onAttack {
              damage 80
              discardDefendingEnergy()
            }
          }
          move "Hydro Splash", {
            text "130 damage."
            energyCost W, C, C, C
            onAttack {
              damage 130
            }
          }

        };
      case QWILFISH_21:
        return basic (this, hp:HP090, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Poison Sting", {
            text "Your opponent's Active Pokémon is now Poisoned."
            energyCost C
            onAttack {
              apply POISONED
            }
          }
          move "Shock Sting", {
            text "20+ damage. If your opponent's Active Pokémon is affected by a Special Condition, this attack does 50 more damage."
            energyCost W, C
            onAttack {
              damage 20
              if(defending.specialConditions) damage 50
            }
          }

        };
      case BUIZEL_22:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Razor Fin", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Water Gun", {
            text "40 damage."
            energyCost W, C, C
            onAttack {
              damage 40
            }
          }

        };
      case FLOATZEL_23:
        return evolution (this, from:"Buizel", hp:HP100, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Razor Fin", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Aqua Bomb", {
            text "120 damage. This Pokémon does 30 damage to itself."
            energyCost W, C, C
            onAttack {
              damage 120
              damage 30,self
            }
          }

        };
      case PALKIA_24:
        return basic (this, hp:HP130, type:WATER, retreatCost:2) {
          weakness GRASS
          move "Spiral Drain", {
            text "30 damage. Heal 30 damage from this Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              heal 30, self
            }
          }
          move "Aqua Blade", {
            text "100 damage."
            energyCost W, W, C
            onAttack {
              damage 100
            }
          }

        };
      case MANAPHY_25:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          bwAbility "Blessings of the Deep", {
            text "Once during your turn (before your attack), you may heal 20 damage from 1 of your Pokémon that has any [W] Energy attached to it."
            actionA {
              checkLastTurn()
              def tar = my.all.findAll {it.numberOfDamageCounters && it.cards().energyCount(W)}
              assert tar : "No suitable pokemon"
              powerUsed()
              heal 20, tar.select("Heal 20 damage"), SRC_ABILITY
            }
          }
          move "Wave Splash", {
            text "30 damage."
            energyCost W, C
            onAttack {
              damage 30
            }
          }

        };
      case KELDEO_26:
        return basic (this, hp:HP110, type:WATER, retreatCost:2) {
          weakness GRASS
          move "Bail Out", {
            text "Put a [W] Pokémon from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(POKEMON)
            }
            onAttack {
              my.discard.filterByType(POKEMON).select().moveTo(hand)
            }
          }
          move "Resolute Sword", {
            text "20+ damage. This attack does 20 more damage for each of your opponent's Benched Pokémon."
            energyCost W, W
            onAttack {
              damage 20+20*opp.bench.size()
            }
          }

        };
      case SHINING_VOLCANION_27:
        return basic (this, hp:HP130, type:WATER, retreatCost:3) {
          weakness LIGHTNING
          move "Dual Pump", {
            text "Does 50 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, W
            onAttack {
              multiDamage(opp.all, 2, 50)
            }
          }
          move "Quad Smash", {
            text "50× damage. Flip 4 coins. This attack does 50 damage times the number of heads."
            energyCost C, C, C, C
            onAttack {
              flip 4,{damage 50}
            }
          }

        };
      case PIKACHU_28:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Iron Tail", {
            text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
            energyCost L
            onAttack {
              flipUntilTails {damage 20}
            }
          }

        };
      case RAICHU_GX_29:
        return evolution (this, from:"Pikachu", hp:HP210, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Powerful Spark", {
            text "20+ damage. This attack does 20 more damage times the amount of [L] Energy attached to your Pokémon."
            energyCost C, C
            onAttack {
              int cnt = 1
              my.all.each {cnt+=it.cards().energyCount(L)}
              damage 20*cnt
            }
          }
          move "Thunder", {
            text "160 damage. This Pokémon does 30 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 160
              damage 30,self
            }
          }
          move "Voltail GX", {
            text "120 damage. Your opponent's Active Pokémon is now Paralyzed. (You can't use more than 1 GX attack in a game.)"
            energyCost L, L, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 120
              applyAfterDamage PARALYZED
            }
          }

        };
      case VOLTORB_30:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Electro Ball", {
            text "10 damage."
            energyCost L
            onAttack {
              damage 10
            }
          }

        };
      case ELECTRODE_31:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Swift", {
            text "60 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
            energyCost L
            onAttack {
              swiftDamage(60,defending)
            }
          }

        };
      case RAIKOU_32:
        return basic (this, hp:HP120, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Booming Thunder", {
            text "30 damage. Attach a [L] Energy card from your discard pile to 1 of your Benched Pokémon."
            energyCost L
            onAttack {
              damage 30
              afterDamage{
                attachEnergyFrom(type:L, my.discard, my.bench)
              }
            }
          }
          move "Electric Ball", {
            text "90 damage."
            energyCost L, L, C
            onAttack {
              damage 90
            }
          }

        };
      case PLUSLE_33:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Tag Team Boost", {
            text "10+ damage. If Minun is on your Bench, this attack does 50 more damage."
            energyCost L
            onAttack {
              damage 10
              if(my.bench.find{it.name=="Minun"}) damage 50
            }
          }

        };
      case MINUN_34:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Spark", {
            text "20 damage. This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              damage 20, opp.bench.select()
            }
          }

        };
      case ZEKROM_35:
        return basic (this, hp:HP130, type:LIGHTNING, retreatCost:3) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Outrage", {
            text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost C, C
            onAttack {
              damage 20+10*self.numberOfDamageCounters
            }
          }
          move "Storm Blade", {
            text "130 damage. Discard 2 Energy from this Pokémon."
            energyCost L, L, C
            onAttack {
              damage 130
              afterDamage{
                discardSelfEnergy(C,C)
              }
            }
          }

        };
      case EKANS_36:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Poison Sting", {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Poisoned."
            energyCost C
            onAttack {
              damage 10
              flipThenApplySC(POISONED)
            }
          }

        };
      case ARBOK_37:
        return evolution (this, from:"Ekans", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          bwAbility "Intimidating Pattern", {
            text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon's attacks do 30 less damage (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(self.active && it.from.active && it.from.owner != self.owner && it.dmg.value && it.notNoEffect) {
                    bc "Intimidating Pattern -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Venomous Fang", {
            text "70 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost P, C, C
            onAttack {
              damage 70
              applyAfterDamage POISONED
            }
          }

        };
      case JYNX_38:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Whiny Voice", {
            text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost P
            onAttack {
              astonish()
            }
          }
          move "Feverish Kiss", {
            text "30 damage. Your opponent's Active Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 30
              applyAfterDamage CONFUSED
            }
          }

        };
      case MEWTWO_GX_39:
        return basic (this, hp:HP190, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Full Burst", {
            text "30× damage. This attack does 30 damage times the amount of Energy attached to this Pokémon."
            energyCost P
            onAttack {
              damage 30*self.cards.energyCount()
            }
          }
          move "Super Absorption", {
            text "60 damage. Heal 30 damage from this Pokémon."
            energyCost P, C
            onAttack {
              damage 60
              heal 30, self
            }
          }
          move "Psystrike GX", {
            text "200 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost P, P, P
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              shredDamage(200)
            }
          }

        };
      case SHINING_MEW_40:
        return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
          weakness PSYCHIC
          move "Legendary Guidance", {
            text "Search your deck for 2 Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost P
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max: 2, "2 Energy Cards", cardTypeFilter(ENERGY)).each {
                attachEnergy(my.all.select("Attach $it to?"), it)
              }
              shuffleDeck()
            }
          }
          move "Beam", {
            text "10 damage."
            energyCost P
            onAttack {
              damage 10
            }
          }

        };
      case LATIOS_41:
        return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Break Through", {
            text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            onAttack {
              damage 30
              if(opp.bench)
                damage 30, opp.bench.select("Deal 30 damage to?")
            }
          }
          move "Lagoon Flight", {
            text "70 damage."
            energyCost P, C, C
            onAttack {
              damage 70
            }
          }

        };
      case SHINING_JIRACHI_42:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Stellar Reign", {
            text "10 damage. If your opponent's Active Pokémon is an evolved Pokémon, devolve it by putting all of the Evolution cards on it into your opponent's hand."
            energyCost P
            onAttack {
              damage 10
              afterDamage {
                def top
                while(defending.evolution) {
                  targeted (defending) {
                    top=defending.topPokemonCard
                    bc "$top Devolved"
                    moveCard(top, opp.hand)
                    devolve(defending, top)
                  }
                }
              }
            }
          }
        };
      case GOLETT_43:
        return basic (this, hp:HP090, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          move "Mega Punch", {
            text "60 damage."
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        };
      case GOLURK_44:
        return evolution (this, from:"Golett", hp:HP140, type:PSYCHIC, retreatCost:4) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Triple Smash", {
            text "10+ damage. Flip 3 coins. This attack does 60 more damage for each heads."
            energyCost P, C, C
            onAttack {
              damage 10
              flip 3,{damage 60}
            }
          }
          move "Golurk Hammer", {
            text "120 damage."
            energyCost P, C, C, C
            onAttack {
              damage 120
            }
          }

        };
      case MARSHADOW_45:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Let Loose", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may have each player shuffle their hand into their deck and draw 4 cards."
            onActivate {r->
              if(r == PLAY_FROM_HAND && confirm("Use Let Loose?")) {
                powerUsed()
                my.hand.moveTo(hidden: true, my.deck)
                opp.hand.moveTo(hidden: true, opp.deck)
                shuffleDeck()
                shuffleDeck(null, TargetPlayer.OPPONENT)
                draw 4
                draw 4, TargetPlayer.OPPONENT
              }
            }
          }
          move "Shadow Punch", {
            text "30 damage. This attack's damage isn't affected by Resistance."
            energyCost P, C
            onAttack {
              damage 30
              dontApplyResistance()
            }
          }

        };
      case STUNFISK_46:
        return basic (this, hp:HP110, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Thunder Shock", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 30
              flipThenApplySC PARALYZED
            }
          }
          move "Head Bolt", {
            text "70 damage."
            energyCost L, C, C
            onAttack {
              damage 70
            }
          }

        };
      case SPIRITOMB_47:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:2) {
          bwAbility "Cursed Whirlpool", {
            text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon can't retreat."
            delayedA {
              before RETREAT, {
                if(ef.retreater.owner==self.owner.opposite && self.active){
                  wcu "Cursed Whirlpool prevents retreating"
                  prevent()
                }
              }
            }
          }
          move "Cursed Drop", {
            text "Put 3 damage counters on your opponent's Pokémon in any way you like."
            energyCost D, C
            onAttack {
              (1..3).each {
                if(opp.all) directDamage(10, opp.all.select("Put a damage counter on"))
              }
            }
          }

        };
      case PURRLOIN_48:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Scratch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Tail Rap", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost D, C
            onAttack {
              flip 2,{damage 20}
            }
          }

        };
      case LIEPARD_49:
        return evolution (this, from:"Purrloin", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Torment", {
            text "30 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost D
            onAttack {
              damage 30
              afterDamage {
                amnesia(delegate)
              }
            }
          }
          move "Slash", {
            text "60 damage."
            energyCost D, C
            onAttack {
              damage 60
            }
          }

        };
      case SCRAGGY_50:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
            energyCost D
            attackRequirement {
              assert my.deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              my.deck.search ("Search your deck for a Basic Pokémon and put it onto your Bench", cardTypeFilter(BASIC)).each {
                my.deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Headbutt", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case SCRAFTY_51:
        return evolution (this, from:"Scraggy", hp:HP110, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Dangerous Head", {
            text "20+ damage. If your opponent's Active Pokémon is a Basic Pokémon, this attack does 50 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(defending.basic) damage 50
            }
          }
          move "Hammer In", {
            text "90 damage."
            energyCost D, C, C
            onAttack {
              damage 90
            }
          }

        };
      case ZORUA_52:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Stampede", {
            text "10 damage."
            energyCost D
            onAttack {
              damage 10
            }
          }
          move "Ram", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case ZOROARK_GX_53:
        return evolution (this, from:"Zorua", hp:HP210, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          bwAbility "Trade", {
            text "Once during your turn (before your attack), you may discard a card from your hand. If you do, draw 2 cards."
            actionA {
              checkLastTurn()
              assert hand.notEmpty()
              powerUsed()
              hand.select("Discard").discard()
              draw 2
            }
          }
          move "Riotous Beating", {
            text "20× damage. This attack does 20 damage for each of your Pokémon in play."
            energyCost C, C
            onAttack {
              damage 20*my.all.size()
            }
          }
          move "Trickster GX", {
            text "Choose 1 of your opponent's Pokémon's attacks and use it as this attack. (You can't use more than 1 GX attack in a game.)"
            energyCost D, D
            attackRequirement {
              gxCheck()
              assert opp.all.find {it.topPokemonCard.moves} : "No moves to perform"
            }
            onAttack {
              def moveList = []
              def labelList = []
              opp.all.each {pcs->
                moveList.addAll(pcs.topPokemonCard.moves);
                labelList.addAll(pcs.topPokemonCard.moves.collect{pcs.name+"-"+it.name})
              }
              def move=choose(moveList, labelList)
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
              gxPerform()
            }
          }

        };
      case YVELTAL_54:
        return basic (this, hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Strafe", {
            text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              switchYourActive(may: true)
            }
          }
          move "Oblivion Wing", {
            text "90 damage. Attach a [D] Energy card from your discard pile to 1 of your Benched Pokémon."
            energyCost D, C, C
            onAttack {
              damage 90
              afterDamage {attachEnergyFrom(type: DARKNESS, my.discard, my.bench)}
            }
          }

        };
      case HOOPA_55:
        return basic (this, hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          bwAbility "Scoundrel Guard", {
            text "Prevent all effects of attacks, including damage, done to this Pokémon by your opponent's Pokémon-GX or Pokémon-EX."
            safeguardForExAndGx("Scoundrel Guard", self, delegate)
          }
          move "Super Psy Bolt", {
            text "80 damage."
            energyCost D, C, C
            onAttack {
              damage 80
            }
          }

        };
      case SHINING_RAYQUAZA_56:
        return basic (this, hp:HP120, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          move "Dragon Pulse", {
            text "40 damage. Discard the top 2 cards of your deck."
            energyCost L
            onAttack {
              damage 40
              afterDamage {
                if(my.deck) my.deck.subList(0,2).discard()
              }
            }
          }
          move "Sky Judgment", {
            text "190 damage. Discard 3 Energy from this Pokémon."
            energyCost R, L, L, C
            onAttack {
              damage 190
              afterDamage{
                discardSelfEnergy(C,C,C)
              }
            }
          }

        };
      case SHINING_ARCEUS_57:
        return basic (this, hp:HP130, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Fabled Defense", {
            text "As long as this Pokémon is your Active Pokémon, prevent all damage done to your Benched Pokémon by your opponent's attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(self.active) {
                  bg.dm().each {if(it.to.owner==self.owner && it.from.owner!=self.owner && it.to.benched && it.dmg.value && it.notNoEffect){
                    bc "Fabled Defense reduces damage"
                    it.dmg=hp(0)
                  }}
                }
              }
            }
          }
          move "Ultimate Arrow", {
            text "This attack does 30 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C, C
            onAttack {
              opp.all.each {damage 30, it}
            }
          }

        };
      case DAMAGE_MOVER_58:
        return itemCard (this) {
          text "Move 3 damage counters from 1 of your Pokémon to another of your Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def pcs = my.all.findAll {it.numberOfDamageCounters}.select("Move damage counters from")
            def tar = my.all.findAll {it != pcs}.select("To?")
            def num = Math.min(3, pcs.numberOfDamageCounters)
            pcs.damage -= hp(10*num)
            tar.damage += hp(10*num)
            bc "Moved $num damage counters from $pcs to $tar"
          }
          playRequirement{
            assert my.all.size() >= 2 && my.all.findAll {it.numberOfDamageCounters}
          }
        };
      case ENERGY_RETRIEVAL_59:
        return copy(PrimalClash.ENERGY_RETRIEVAL_126, this);
      case GREAT_BALL_60:
        return copy(EmergingPowers.GREAT_BALL_93, this)
      case HAU_61:
        return copy(SunMoon.HAU_120, this)
      case LILLIE_62:
        return copy(SunMoon.LILLIE_122, this)
      case POKEMON_BREEDER_63:
        return supporter (this) {
          text "Draw 2 cards and heal 20 damage from your Active Pokémon. If you have no cards in your deck, you can't play this card.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            draw 2
            heal(20, my.active, TRAINER_CARD)
          }
          playRequirement{
            assert my.deck || my.active.numberOfDamageCounters
          }
        };
      case POKEMON_CATCHER_64:
        return copy (KalosStarterSet.POKEMON_CATCHER_36, this)
      case SOPHOCLES_65:
        return copy (BurningShadows.SOPHOCLES_123, this)
      case SUPER_SCOOP_UP_66:
        return copy (BlackWhite.SUPER_SCOOP_UP_103, this)
      case SWITCH_67:
        return copy (BlackWhite.SWITCH_104, this)
      case ULTRA_BALL_68:
        return copy(DarkExplorers.ULTRA_BALL_102, this)
      case DOUBLE_COLORLESS_ENERGY_69:
        return copy(Xy.DOUBLE_COLORLESS_ENERGY_130, this)
      case WARP_ENERGY_70:
        return copy (Aquapolis.WARP_ENERGY_147, this)
      case ENTEI_GX_71:
        return copy (ENTEI_GX_10, this)
      case MEWTWO_GX_72:
        return copy (MEWTWO_GX_39, this)
      case POKEMON_BREEDER_73:
        return copy (POKEMON_BREEDER_63, this)
      case ENTEI_GX_74:
        return copy (ENTEI_GX_10, this)
      case RAICHU_GX_75:
        return copy (RAICHU_GX_29, this)
      case MEWTWO_GX_76:
        return copy (MEWTWO_GX_39, this)
      case ZOROARK_GX_77:
        return copy (ZOROARK_GX_53, this)
      case MEWTWO_GX_78:
        return copy (MEWTWO_GX_39, this)
      default:
        return null;
    }
  }

}
