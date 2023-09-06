package tcgwars.logic.impl.pokemod

import tcgwars.logic.impl.gen1.Fossil
import tcgwars.logic.impl.gen7.CelestialStorm
import tcgwars.logic.impl.gen7.GuardiansRising

import static tcgwars.logic.card.HP.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*
import org.apache.commons.lang.WordUtils
import tcgwars.entity.*
import tcgwars.logic.*
import tcgwars.logic.card.*
import tcgwars.logic.card.energy.*
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.card.trainer.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.advanced.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.blocking.*
import tcgwars.logic.effect.event.*
import tcgwars.logic.effect.getter.*
import tcgwars.logic.effect.special.*
import tcgwars.logic.util.*

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodFossil implements LogicCardInfo {

  AERODACTYL_1("Aerodactyl", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ARTICUNO_2("Articuno", "2", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  DITTO_3("Ditto", "3", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  DRAGONITE_4("Dragonite", "4", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GENGAR_5("Gengar", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HAUNTER_6("Haunter", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HITMONLEE_7("Hitmonlee", "7", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  HYPNO_8("Hypno", "8", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KABUTOPS_9("Kabutops", "9", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LAPRAS_10("Lapras", "10", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MAGNETON_11("Magneton", "11", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MOLTRES_12("Moltres", "12", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  MUK_13("Muk", "13", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  RAICHU_14("Raichu", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ZAPDOS_15("Zapdos", "15", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),

  AERODACTYL_16("Aerodactyl", "16", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ARTICUNO_17("Articuno", "17", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  DITTO_18("Ditto", "18", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  DRAGONITE_19("Dragonite", "19", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GENGAR_20("Gengar", "20", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HAUNTER_21("Haunter", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HITMONLEE_22("Hitmonlee", "22", Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  HYPNO_23("Hypno", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KABUTOPS_24("Kabutops", "24", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LAPRAS_25("Lapras", "25", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MAGNETON_26("Magneton", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MOLTRES_27("Moltres", "27", Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  MUK_28("Muk", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  RAICHU_29("Raichu", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ZAPDOS_30("Zapdos", "30", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ARBOK_31("Arbok", "31", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CLOYSTER_32("Cloyster", "32", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GASTLY_33("Gastly", "33", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GOLBAT_34("Golbat", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GOLDUCK_35("Golduck", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOLEM_36("Golem", "36", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  GRAVELER_37("Graveler", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  KINGLER_38("Kingler", "38", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGMAR_39("Magmar", "39", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  OMASTAR_40("Omastar", "40", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  SANDSLASH_41("Sandslash", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEADRA_42("Seadra", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SLOWBRO_43("Slowbro", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  TENTACRUEL_44("Tentacruel", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WEEZING_45("Weezing", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  EKANS_46("Ekans", "46", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GEODUDE_47("Geodude", "47", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GRIMER_48("Grimer", "48", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HORSEA_49("Horsea", "49", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  KABUTO_50("Kabuto", "50", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  KRABBY_51("Krabby", "51", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  OMANYTE_52("Omanyte", "52", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PSYDUCK_53("Psyduck", "53", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLDER_54("Shellder", "54", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLOWPOKE_55("Slowpoke", "55", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  TENTACOOL_56("Tentacool", "56", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ZUBAT_57("Zubat", "57", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),

  MR_FUJI_58("Mr. Fuji", "58", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ENERGY_SEARCH_59("Energy Search", "59", Rarity.COMMON, [TRAINER]),
  GAMBLER_60("Gambler", "60", Rarity.COMMON, [TRAINER]),
  RECYCLE_61("Recycle", "61", Rarity.COMMON, [TRAINER]),
  MYSTERIOUS_FOSSIL_62("Mysterious Fossil", "62", Rarity.COMMON, [TRAINER]),
  CRYSTAL_GUARD_63("Crystal Guard", "63", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  HEAVY_BALL_64("Heavy Ball", "64", Rarity.UNCOMMON, [TRAINER]),
  POKEMON_BREEDER_FIELDS_65("Pokemon Breeder Fields", "65", Rarity.UNCOMMON, [TRAINER]),
  RELIC_HUNTER_66("Relic Hunter", "66", Rarity.UNCOMMON, [TRAINER]),
  LOST_EXPEDITION_67("Lost Expedition", "67", Rarity.UNCOMMON, [TRAINER]),
  UNDERGROUND_EXPEDITION_68("Underground Expedition", "68", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LOST_WORLD_69("Lost World", "69", Rarity.RARE, [TRAINER, STADIUM]),
  CRYSTAL_BEACH_70("Crystal Beach", "70", Rarity.RARE, [TRAINER, STADIUM]),
  DNA_ENERGY_71("DNA Energy", "71", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  DOUBLE_COLORLESS_ENERGY_72("Double Colorless", "72", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  LOST_ENERGY_73("Lost Energy", "73", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  SEEKER_74("Seeker", "74", Rarity.SECRET, [TRAINER, SUPPORTER, G_SPEC]),
  LOST_MEDALLION_75("Lost Medallion", "75", Rarity.SECRET, [TRAINER, POKEMON_TOOL, G_SPEC]),
  CASTAWAY_76("Castaway", "76", Rarity.SECRET, [TRAINER, SUPPORTER, G_SPEC]),
  DITTO_77("Ditto", "77", Rarity.SECRET, [BASIC, POKEMON, G_SPEC, _COLORLESS_]),

  PSYDUCK_78("Psyduck", "78", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  DRAGONITE_79("Dragonite", "79", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GENGAR_80("Gengar", "80", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HO_OH_81("Ho-oh", "81", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  LUGIA_82("Lugia", "82", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  ARTICUNO_83("Articuno", "82", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MOLTRES_84("Moltres", "83", Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  ZAPDOS_85("Zapdos", "84", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ARTICUNO_EX_86("Articuno", "85", Rarity.ULTRARARE, [BASIC, POKEMON, _WATER_]),
  MOLTRES_EX_87("Moltres", "86", Rarity.ULTRARARE, [BASIC, POKEMON, _FIRE_]),
  ZAPDOS_EX_88("Zapdos", "87", Rarity.ULTRARARE, [BASIC, POKEMON, _LIGHTNING_]),

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  PokemodFossil(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[])
    this.name = name
    this.rarity = rarity
    this.collectionLineNo = collectionLineNo
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes
  }

  @Override
  public String getName() {
    return name
  }

  @Override
  public Rarity getRarity() {
    return rarity
  }

  @Override
  public String getNumber() {
    return collectionLineNo
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.POKEMOD_FOSSIL
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name())
  }

  @Override
  public String getEnumName() {
    return this.name()
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case AERODACTYL_1:
        return evolution(this, from: "Mysterious Fossil", hp: HP060, type: FIGHTING, retreatCost: 2) {
          weakness GRASS
          resistance FIGHTING, MINUS30
          pokemonPower "Prehistoric Power", {
            text "As long as this Pokémon has a Pokémon Tool card attached to it, no more evolution cards can be played. This power stops working while Aerodactyl is affected by a Special Condition."
            delayedA {
              before EVOLVE, {
                if (!self.specialConditions && self.cards.filterByType(POKEMON_TOOL) && ef.activationReason == PLAY_FROM_HAND) {
                  wcu "Prehistoric Power prevents you from playing Evolution cards!"
                  prevent()
                }
              }
            }
          }
          move "Wing Attack", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        }
      case ARTICUNO_2:
        return basic(this, hp: HP070, type: WATER, retreatCost: 2) {
          weakness METAL
          resistance FIGHTING, MINUS30
          move "Freeze Dry", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 30
              flip { applyAfterDamage PARALYZED }
            }
          }
          move "Blizzard", {
            text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. If tails, this attack does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, W, W
            attackRequirement {}
            onAttack {
              damage 50
              flip 1, {
                opp.bench.each { damage 10, it }
              }, {
                my.bench.each { damage 10, it }
              }
            }
          }

        }
      case DITTO_3:
        break
      case DRAGONITE_4:
        return copy(Fossil.DRAGONITE_4, this)
      case GENGAR_5:
        return evolution(this, from: "Haunter", hp: HP080, type: PSYCHIC, retreatCost: 1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          pokePower "Curse", {
            text "Once during your turn (before your attack), you may move 1 damage counter from 1 of your opponent's Pokémon to another (even if it would Knock Out the other Pokémon). This power can't be used if Gengar is affected by a Special Condition."
            actionA {
              checkLastTurn()
              assert opp.bench: "There is only one Pokémon"
              def choices = opp.all.findAll { it.numberOfDamageCounters }
              assert choices: "None of your opponent’s Pokémon have damage counter to move"
              powerUsed()
              def src = choices.select()
              def tar = opp.all.findAll { it != src }.select()
              src.damage -= hp(10)
              tar.damage += hp(10)
            }
          }
          move "Dark Mind", {
            text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) damage 10, opp.bench.select()
            }
          }

        }
      case HAUNTER_6:
        return evolution(this, from: "Gastly", hp: HP060, type: PSYCHIC, retreatCost: 0) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          pokePower "Transparency", {
            text "Whenever an attack does anything to Haunter, flip a coin. If heads, prevent all effects of that attack, including damage, done to Haunter. This power stops working while Haunter is affected by a Special Condition."
            delayedA {
              def coinRes = false
              before null, self, Source.ATTACK, {
                if (!self.specialConditions) {
                  flip 1, { coinRes = true }, { coinRes = false }
                  if (coinRes && bg.currentTurn == self.owner.opposite && ef.effectType != DAMAGE) {
                    bc "Transparency prevents effect"
                    prevent()
                  }
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                if (!self.specialConditions) {
                  bg.dm().each {
                    if (coinRes && it.to == self && it.notNoEffect) {
                      it.dmg = hp(0)
                      bc "Transparency prevents damage"
                    }
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if (!self.specialConditions) {
                  if (coinRes && efs.to == self && bg.currentState == Battleground.BGState.ATTACK) {
                    discard efs.card
                  }
                }
              }
            }
          }
          move "Nightmare", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }

        }
      case HITMONLEE_7:
        return basic(this, hp: HP080, type: FIGHTING, retreatCost: 1) {
          weakness PSYCHIC
          move "Stretch Kick", {
            text "If your opponent has any Benched Pokémon, choose 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C
            attackRequirement {
              assert opp.bench: "There is no Benched Pokémon"
            }
            onAttack {
              damage 20, opp.bench.select()
            }
          }
          move "High Jump Kick", {
            text "50 damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        }
      case HYPNO_8:
        return evolution(this, from: "Drowzee", hp: HP090, type: PSYCHIC, retreatCost: 2) {
          weakness PSYCHIC
          move "Prophecy", {
            text "Look at up to 3 cards from the top of either player's deck and rearrange them as you like."
            energyCost P
            foresight(3, delegate)
          }
          move "Dark Mind", {
            text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) damage 10, opp.bench.select()
            }
          }

        }
      case KABUTOPS_9:
        return evolution(this, from: "Kabuto", hp: HP080, type: FIGHTING, retreatCost: 1) {
          weakness GRASS
          resistance FIRE, MINUS30
          move "Sharp Sickle", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Absorb", {
            text "40 damage. Remove a number of damage counters from Kabutops equal to half the damage done to Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Kabutops has fewer damage counters than that, remove all of them."
            energyCost F, F, F, C
            attackRequirement {}
            onAttack {
              damage 40
              removeDamageCounterEqualToHalfDamageDone()
            }
          }

        }
      case LAPRAS_10:
        return basic(this, hp: HP080, type: WATER, retreatCost: 2) {
          weakness LIGHTNING
          move "Water Gun", {
            text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Lapras but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              extraEnergyDamage(2, hp(10), W, thisMove)

            }
          }
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC CONFUSED
            }
          }

        }
      case MAGNETON_11:
        return copy(Fossil.MAGNETON_11, this)
      case MOLTRES_12:
        return basic(this, hp: HP080, type: FIRE, retreatCost: 2) {
          resistance FIGHTING, MINUS30
          move "Wildfire", {
            text "You may discard any number of [R] Energy cards attached to Moltres when you use this attack. If you do, discard that many cards from the top of your opponent’s deck."
            energyCost R
            attackRequirement {}
            onAttack {
              def src = self.cards.filterByEnergyType(R)
              def tar = src.select(max: src.size())
              if (tar) {
                opp.deck.subList(0, tar.size()).discard()
                tar.discard()
              }
            }
          }
          move "Dive Bomb", {
            text "80 damage. Flip a coin. If tails, this attack does nothing."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              flip { damage 80 }
            }
          }

        }
      case MUK_13:
        return evolution(this, from: "Grimer", hp: HP060, type: PSYCHIC, retreatCost: 0) {
          weakness PSYCHIC
          pokeBody "Toxic Gas", {
            text "Ignore all Poké-Powers and Poké-Bodies other than Toxic Gases. This power stops working while Muk is affected by a Special Condition."
            def effect1
            onActivate {
              checkNoSPC()
              effect1 = getter IS_ABILITY_BLOCKED, { Holder h ->
                if (h.effect.ability.name != "Toxic Gas" && (h.effect.ability instanceof PokeBody || h.effect.ability instanceof PokePower)) {
                }
              }
            }
            onDeactivate {
              effect1.unregister()
            }
          }
          move "Sludge", {
            text "30 damage. Flip a coin. If heads, the Defending Pokemon is now Poisoned"
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage POISONED
              }
            }
          }
        }
      case RAICHU_14:
        return evolution(this, from: "Pikachu", hp: HP090, type: LIGHTNING, retreatCost: 1) {
          weakness FIGHTING
          move "Gigashock", {
            text "30 damage. Choose 3 of your opponent's Benched Pokémon and this attack does 10 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.) If your opponent has fewer than 3 Benched Pokémon, do the damage to each of them."
            energyCost L, L, L, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) {
                multiSelect(opp.bench, 3).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }

        }
      case ZAPDOS_15:
        return basic(this, hp: HP080, type: LIGHTNING, retreatCost: 2) {
          move "Thunderstorm", {
            text "40 damage. For each of your opponent's Benched Pokémon, flip a coin. If heads, this attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Then, Zapdos does 10 damage times the number of tails to itself."
            energyCost L, L, L, L
            attackRequirement {}
            onAttack {
              damage 40
              def selfDmg = 0
              if (opp.bench) {
                def benchDmg = false
                opp.bench.each {
                  benchDmg = false
                  flip 1, {
                    benchDmg = true
                  }, { selfDmg += 1 }
                  if (benchDmg) damage 20, it
                }
                damage 10 * selfDmg, self
              }
            }
          }

        }
      case AERODACTYL_16:
        return copy(AERODACTYL_1, this)
      case ARTICUNO_17:
        return copy(ARTICUNO_2, this)
      case DITTO_18:
        return copy(DITTO_3, this)
      case DRAGONITE_19:
        return copy(Fossil.DRAGONITE_4, this)
      case GENGAR_20:
        return copy(GENGAR_5, this)
      case HAUNTER_21:
        return copy(HAUNTER_6, this)
      case HITMONLEE_22:
        return copy(HITMONLEE_7, this)
      case HYPNO_23:
        return copy(HYPNO_8, this)
      case KABUTOPS_24:
        return copy(KABUTOPS_9, this)
      case LAPRAS_25:
        return copy(LAPRAS_10, this)
      case MAGNETON_26:
        return copy(Fossil.MAGNETON_11, this)
      case MOLTRES_27:
        return copy(MOLTRES_12, this)
      case MUK_28:
        return copy(MUK_13, this)
      case RAICHU_29:
        return copy(RAICHU_14, this)
      case ZAPDOS_30:
        return copy(ZAPDOS_15, this)
      case ARBOK_31:
        return evolution(this, from: "Ekans", hp: HP060, type: GRASS, retreatCost: 2) {
          weakness PSYCHIC
          move "Terror Strike", {
            text "20 damage. Flip a coin. If heads and if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench)
                flip { whirlwind() }
            }
          }
          move "Poison Fang", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage POISONED
            }
          }

        }
      case CLOYSTER_32:
        return evolution(this, from: "Shellder", hp: HP080, type: WATER, retreatCost: 2) {
          weakness LIGHTNING
          move "Clamp", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing (not even damage)."
            energyCost W, W
            onAttack {
              flip {
                damage 30
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Spike Cannon", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost W, W
            onAttack {
              flip 2, { damage 30 }
            }
          }

        }
      case GASTLY_33:
        return basic(this, hp: HP050, type: PSYCHIC, retreatCost: 0) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Lick", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage { flipThenApplySC PARALYZED }
            }
          }
          move "Energy Conversion", {
            text "Put up to 2 Energy cards from your discard pile into your hand. Gastly does 10 damage to itself."
            energyCost P, C
            attackRequirement {}
            onAttack {
              def tar = my.discard.filterByType(ENERGY)
              if (tar) tar.select(max: 2).moveTo(my.hand)
              damage 10, self
            }
          }

        }
      case GOLBAT_34:
        return evolution(this, from: "Zubat", hp: HP060, type: GRASS, retreatCost: 0) {
          weakness PSYCHIC
          resistance FIGHTING, MINUS30
          move "Wing Attack", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Leech Life", {
            text "20 damage. Remove a number of damage counters from Golbat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance). If Golbat has fewer damage counters than that, remove all of them.Remove a number of damage counters from Golbat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance). If Golbat has fewer damage counters than that, remove all of them."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              removeDamageCounterEqualToDamageDone()
            }
          }

        }
      case GOLDUCK_35:
        return evolution(this, from: "Psyduck", hp: HP080, type: WATER, retreatCost: 1) {
          weakness LIGHTNING
          move "Psyshock", {
            text "10 damage.  Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage { flipThenApplySC PARALYZED }
            }
          }
          move "Hyper Beam", {
            text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 20
              discardDefendingEnergy()
            }
          }

        }
      case GOLEM_36:
        return evolution(this, from: "Graveler", hp: HP100, type: FIGHTING, retreatCost: 4) {
          weakness GRASS
          move "Avalanche", {
            text "60 damage."
            energyCost F, F, F, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Selfdestruct", {
            text "100 damage. Does 20 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Golem does 100 damage to itself."
            energyCost F, F, F, F
            attackRequirement {}
            onAttack {
              damage 100
              if (my.bench) my.bench.each { damage 20, it }
              if (opp.bench) opp.bench.each { damage 20, it }
              damage 100, self
            }
          }

        }
      case GRAVELER_37:
        return evolution(this, from: "Geodude", hp: HP070, type: FIGHTING, retreatCost: 2) {
          weakness GRASS
          move "Harden", {
            text "During your opponent's next turn, whenever 30 or less damage is done to Graveler (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
            energyCost F, F
            attackRequirement {}
            onAttack {
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if (it.to == self & it.dmg.value <= 30) {
                      bc "Graveler Harden prevents damage!"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after FALL_BACK, self, { unregister() }
                after CHANGE_STAGE, self, { unregister() }

              }
            }
          }
          move "Rock Throw", {
            text "40 damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        }
      case KINGLER_38:
        return evolution(this, from: "Krabby", hp: HP060, type: WATER, retreatCost: 3) {
          weakness LIGHTNING
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Kingler."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10 * self.numberOfDamageCounters
            }
          }
          move "Crabhammer", {
            text "40 damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        }
      case MAGMAR_39:
        return copy(Fossil.MAGMAR_39, this)
      case OMASTAR_40:
        return evolution(this, from: "Omanyte", hp: HP070, type: WATER, retreatCost: 1) {
          weakness GRASS
          resistance FIRE, MINUS30
          move "Water Gun", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Omastar but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
              extraEnergyDamage(2, hp(10), W, thisMove)
            }
          }
          move "Spike Cannon", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost W, W
            attackRequirement {}
            onAttack {
              flip 2, { damage 30 }
            }
          }

        }
      case SANDSLASH_41:
        return evolution(this, from: "Sandshrew", hp: HP070, type: FIGHTING, retreatCost: 1) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Slash", {
            text "20 damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Fury Swipes", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost F, F
            attackRequirement {}
            onAttack {
              flip 3, { damage 20 }
            }
          }

        }
      case SEADRA_42:
        return evolution(this, from: "Horsea", hp: HP070, type: WATER, retreatCost: 1) {
          weakness LIGHTNING
          move "Water Gun", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Seadra but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
              extraEnergyDamage(2, hp(10), W, thisMove)
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Seadra."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }

        }
      case SLOWBRO_43:
        return evolution(this, from: "Slowbro", hp: HP060, type: PSYCHIC, retreatCost: 1) {
          weakness PSYCHIC
          pokePower "Strange Behavior", {
            text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to Slowbro as long as you don't Knock Out Slowbro. This power can't be used if Slowbro is affected by a Special Condition."
            actionA {
              assert !self.specialConditions
              assert self.damage != self.fullHP - hp(10): "Slowbro can't be Knocked Out by Strange Behavior!"
              def tar = my.all.findAll { it != self && it.numberOfDamageCounters }
              assert tar: "There is no Pokemon with damage counter outside Slowbro"
              def pcs = tar.select()

              self.damage += hp(10)
              pcs.damage -= hp(10)
            }
          }
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage { flipThenApplySC PARALYZED }
            }
          }

        }
      case TENTACRUEL_44:
        return evolution(this, from: "Tentacool", hp: HP060, type: WATER, retreatCost: 0) {
          weakness LIGHTNING
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC CONFUSED
            }
          }
          move "Jellyfish Sting", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }

        }
      case WEEZING_45:
        return copy(Fossil.WEEZING, this)
      case EKANS_46:
        return copy(Fossil.EKANS, this)
      case GEODUDE_47:
        return basic(this, hp: HP050, type: FIGHTING, retreatCost: 1) {
          weakness GRASS
          move "Stone Barrage", {
            text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
            energyCost F
            attackRequirement {}
            onAttack {
              flipUntilTails { damage 10 }
            }
          }

        }
      case GRIMER_48:
        return copy(Fossil.GRIMER, this)
      case HORSEA_49:
        return copy(Fossil.HORSEA, this)
      case KABUTO_50:
        return evolution(this, from: "Mysterious Fossil", hp: HP040, type: FIGHTING, retreatCost: 1) {
          weakness GRASS
          resistance FIRE, MINUS30
          pokeBody "Kabuto Armor", {
            text "Whenever an attack (even your own) does damage to Kabuto (after applying Weakness and Resistance), that attack only does half the damage to Kabuto (rounded down to nearest 10). (Any other effects of attacks still happen.) This power stops working while Kabuto is affected by a Special Condition."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if (!(self.specialConditions)) {
                  bg.dm().each {
                    if (it.to == self) {
                      def dmgVal = it.dmg.value
                      int dmgInt = (int) dmgVal.intValue()
                      bc "Kabuto Armor halves damage"
                      if (((int) (dmgInt / 10)) % 2) {
                        it.dmg = hp((int) ((dmgInt - 10) / 2))
                      } else {
                        it.dmg = hp((int) (dmgInt / 2))
                      }
                    }
                  }
                }
              }
            }
          }
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        }
      case KRABBY_51:
        return basic(this, hp: HP050, type: WATER, retreatCost: 2) {
          weakness LIGHTNING
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon named Krabby and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
            energyCost W
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search(count: 1, { it.cardTypes.is(BASIC) && it.name == "Krabby" }).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Irongrip", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        }
      case OMANYTE_52:
        return evolution(this, from: "Mysterious Fossil", hp: HP050, type: WATER, retreatCost: 1) {
          weakness GRASS
          resistance FIRE, MINUS30
          pokeBody "Clairvoyance", {
            text "Your opponent plays with his or her hand face up. This power stops working while Omanyte is affected by a Special Condition."
            actionA {
              checkNoSPC()
              //TODO: Make cards visible, even to spectators.
              // could you potentialy make it say the hand in chat?
              opp.hand.shuffledCopy().showToMe("opponent's hand")
            }
          }
          move "Water Gun", {
            text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Omanyte but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              extraEnergyDamage(2, hp(10), W, thisMove)
            }
          }

        }
      case PSYDUCK_53:
        return basic(this, hp: HP050, type: WATER, retreatCost: 1) {
          weakness LIGHTNING
          move "Headache", {
            text "Flip a coin. If heads, your opponent can’t play Trainer cards(except Supporter cards) during his or her next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              flip {
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
          }
          move "Fury Swipes", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost W
            attackRequirement {}
            onAttack {
              flip 3, { damage 10 }
            }
          }

        }
      case SHELLDER_54:
        return basic(this, hp: HP050, type: WATER, retreatCost: 1) {
          weakness LIGHTNING
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC CONFUSED
            }
          }
          move "Hide in Shell", {
            text "Flip a coin. If heads, prevent all damage done to Shellder during your opponent’s next turn. (Any other effects of attacks still happen.)"
            energyCost W
            attackRequirement {}
            onAttack {
              flip { preventAllDamageNextTurn() }
            }
          }

        }
      case SLOWPOKE_55:
        return copy(Fossil.SLOWPOKE, this)
      case TENTACOOL_56:
        return basic(this, hp: HP040, type: WATER, retreatCost: 0) {
          weakness LIGHTNING
          pokemonPower "Cowardice", {
            text "At any time during your turn (before your attack), you may return Tentacool to your hand. (Discard all cards attached to Tentacool.) This power can’t be used the turn you put Tentacool into play or if Tentacool is Asleep, Confused, or Paralyzed."
            actionA {
              assert !self.specialConditions: "Cowardice can't be used if Tentacool has a status"
              assert self.lastEvolved != bg.turnCount: "Cowardice can't be used the turn you put Tentacool into play"
              assert my.bench: "You have no other Pokémon"
              self.cards.getExcludedList(self.topPokemonCard).discard()
              moveCard(self.topPokemonCard, my.hand)
              removePCS(self)
            }
          }
          move "Acid", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        }
      case ZUBAT_57:
        return copy(Fossil.ZUBAT, this)
      case MR_FUJI_58:
        return supporter(this) {
          text "Choose a Pokémon on your Bench. Shuffle it any any cards attached to it into your deck."
          onPlay {
            def tar = my.bench.select()
            shuffleDeck(tar.cards)
            removePCS(tar)
          }
          playRequirement {
            assert my.bench: "There is no Benched Pokémon"
          }
        }
      case ENERGY_SEARCH_59:
        return copy(Fossil.ENERGY_SEARCH, this)
      case GAMBLER_60:
        return copy(Fossil.GAMBLER, this)
      case RECYCLE_61:
        return copy(Fossil.RECYCLE, this)
      case MYSTERIOUS_FOSSIL_62:
        return copy(Fossil.MYSTERIOUS_FOSSIL, this)
      case CRYSTAL_GUARD_63:
        break
      case HEAVY_BALL_64:
        return basicTrainer(this) {
          text "Search your deck for a Pokémon that has a Retreat Cost of 3 or more, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
            deck.search(max: 1, "Select a Pokémon with a Retreat Cost of 3 or more.", { it.cardTypes.is(POKEMON) && it.retreatCost >= 3 }).moveTo(hand)
            shuffleDeck()
          }
          playRequirement {
            assert my.deck: "Your deck is empty."
          }
        }
      case POKEMON_BREEDER_FIELDS_65:
        break
      case RELIC_HUNTER_66:
        return supporter(this) {
          text "Search your discard pile for up to 2 Stadium cards, show them to your opponent, and shuffle them into your deck."
          onPlay {
            my.discard.filterByType(STADIUM).select(count: 2, "Search your discard pile for up to 2 stadiums").moveTo(hand)
          }
          playRequirement {
            assert my.discard.filterByType(STADIUM)
          }
        }
      case LOST_EXPEDITION_67:
        return basicTrainer(this) {
          text "You may play 2 Lost Expedition at the same time. If you play 1 Lost Expedition, draw a card. If you play 2 Lost Expedition, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
          onPlay {
            if (my.hand.findAll({ it.name == "Lost Expedition" }).size() >= 2 && confirm("Play 2 Lost Expedition at the same time?")) {
              my.deck.search(min: 1, max: 1, "Select a card", { true }).moveTo(hidden: true, my.hand)
              shuffleDeck()
              my.hand.findAll({ it.name == "Lost Expedition" && it != thisCard }).subList(0, 1).discard()
            } else {
              draw 1
            }
          }
          playRequirement {
            assert my.deck: "Your deck is empty"
          }
        }
      case UNDERGROUND_EXPEDITION_68:
        return copy(CelestialStorm.UNDERGROUND_EXPEDITION_150, this)
      case LOST_WORLD_69:
        break
      case CRYSTAL_BEACH_70:
        return stadium(this) {
          text "Each Special Energy card that provides 2 or more Energy (both yours and your opponent's) now provides only 1 [C] Energy. This isn't affected by any Pokémon Powers or Pokémon   Bodies."
          def eff
          onPlay {
            eff = getter(GET_ENERGY_TYPES, BEFORE_LAST) { holder ->
              if (holder.object.size() >= 2 && holder.effect.card.cardTypes.is(SPECIAL_ENERGY)) {
                holder.object = [[C] as Set]
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        }
      case DNA_ENERGY_71:
        break
      case DOUBLE_COLORLESS_ENERGY_72:
        return copy(GuardiansRising.DOUBLE_COLORLESS_ENERGY_166, this)
      case LOST_ENERGY_73:
        break
      case SEEKER_74:
        break
      case LOST_MEDALLION_75:
        break
      case CASTAWAY_76:
        break
      case DITTO_77:
        break
      case PSYDUCK_78:
        return copy(PSYDUCK_53, this)
      case DRAGONITE_79:
        return copy(DRAGONITE_4, this)
      case GENGAR_80:
        return copy(GENGAR_5, this)
      case HO_OH_81:
        break
      case LUGIA_82:
        return basic(this, hp: HP070, type: COLORLESS, retreatCost: 2) {
          weakness PSYCHIC
          resistance FIGHTING, MINUS30
          move "Dive Bomb", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Elemental Blast", {
            text "30+ damage. You may discard a [R] Energy card, a [W] Energy card and a [L] Energy card attached to Lugia ex. If you do, this attack does 30 damage plus 60 more damage."
            energyCost C, C, C
            onAttack {
              damage 30
              if (confirm("Discard a [R] a [W] and a [L] Energy attached to $self for +60?")) {
                damage 60
                afterDamage { discardSelfEnergy R, W, L }
              }
            }
          }
        }
      case ARTICUNO_83:
        return copy(ARTICUNO_2, this)
      case MOLTRES_84:
        return copy(MOLTRES_12, this)
      case ZAPDOS_85:
        return copy(ZAPDOS_15, this)
      case ARTICUNO_EX_86:
        return basic(this, hp: HP100, type: WATER, retreatCost: 2) {
          weakness METAL
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Articuno ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Articuno ex. If you do, you may also move any number of basic [W] Energy cards attached to your Pokémon to Articuno ex."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")) {
                powerUsed()
                sw my.active, self
                while (1) {
                  def pl = (my.all.findAll { it.cards.filterByBasicEnergyType(W) && it != self })
                  if (!pl) break
                  def src = pl.select("Source for basic [W] Energy (cancel to stop moving)", false)
                  if (!src) break
                  def card = src.cards.filterByBasicEnergyType(W).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Cold Crush", {
            text "40 damage. You may discard an Energy card attached to Articuno ex. If you do, your opponent discards an Energy card attached to the Defending Pokémon."
            energyCost W, W, C
            onAttack {
              damage 40
              if (confirm("Discard an Energy card attached to $self?")) {
                afterDamage {
                  discardSelfEnergy C
                  discardDefendingEnergy()
                }
              }
            }
          }

        }
      case MOLTRES_EX_87:
        return basic(this, hp: HP100, type: FIRE, retreatCost: 2) {
          weakness WATER
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Moltres ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Moltres ex. If you do, you may also move any number of basic [R] Energy cards attached to your Pokémon to Moltres ex."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")) {
                powerUsed()
                sw my.active, self
                while (1) {
                  def pl = (my.all.findAll { it.cards.filterByBasicEnergyType(R) && it != self })
                  if (!pl) break
                  def src = pl.select("Source for basic [R] Energy (cancel to stop moving)", false)
                  if (!src) break
                  def card = src.cards.filterByBasicEnergyType(R).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Crushing Flames", {
            text "40 damage. You may discard an Energy card attached to Moltres ex. If you do, the Defending Pokémon is now Confused."
            energyCost R, C, C
            onAttack {
              damage 40
              if (confirm("Discard an Energy card attached to $self?")) {
                afterDamage { discardSelfEnergy C }
                applyAfterDamage CONFUSED
              }
            }
          }
        }
      case ZAPDOS_EX_88:
        return basic(this, hp: HP100, type: LIGHTNING, retreatCost: 2) {
          weakness LIGHTNING
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Zapdos ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Zapdos ex. If you do, you may also move any number of basic [L] Energy cards attached to your Pokémon to Zapdos ex."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")) {
                powerUsed()
                sw my.active, self
                while (1) {
                  def pl = (my.all.findAll { it.cards.filterByBasicEnergyType(L) && it != self })
                  if (!pl) break
                  def src = pl.select("Source for basic [L] Energy (cancel to stop moving)", false)
                  if (!src) break
                  def card = src.cards.filterByBasicEnergyType(L).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Electron Crush", {
            text "40+ damage. You may discard an Energy card attached to Zapdos ex. If you do, this attack does 40 damage plus 20 more damage."
            energyCost L, L, C
            onAttack {
              damage 40
              if (confirm("Discard an Energy card attached to $self for +20?")) {
                damage 20
                afterDamage { discardSelfEnergy C }
              }
            }
          }
        }
      default:
        return null
    }
  }
}
