package tcgwars.logic.impl.pokemod

import tcgwars.logic.impl.gen1.WizardsBlackStarPromos

import tcgwars.logic.effect.gm.PlayCard
import tcgwars.logic.effect.gm.PlayTrainer

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
public enum PokemodWizardsBlackStarPromos implements LogicCardInfo {

  PIKACHU_1 ("Pikachu", "1", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  ELECTABUZZ_2 ("Electabuzz", "2", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MEWTWO_3 ("Mewtwo", "3", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  PIKACHU_4 ("Pikachu", "4", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  DRAGONITE_5 ("Dragonite", "5", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _COLORLESS_),
  ARCANINE_6 ("Arcanine", "6", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _FIRE_),
  JIGGLYPUFF_7 ("Jigglypuff", "7", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  MEW_8 ("Mew", "8", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MEW_9 ("Mew", "9", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MEOWTH_10 ("Meowth", "10", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  EEVEE_11 ("Eevee", "11", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  MEWTWO_12 ("Mewtwo", "12", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  VENUSAUR_13 ("Venusaur", "13", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _GRASS_),
  MEWTWO_14 ("Mewtwo", "14", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  COOL_PORYGON_15 ("Cool Porygon", "15", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  COMPUTER_ERROR_16 ("Computer Error", "16", Rarity.PROMO, TRAINER),
  DARK_PERSIAN_17 ("Dark Persian", "17", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _COLORLESS_),
  TEAM_ROCKET_S_MEOWTH_18 ("Team Rocket's Meowth", "18", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  SABRINA_S_ABRA_19 ("Sabrina's Abra", "19", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  PSYDUCK_20 ("Psyduck", "20", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  MOLTRES_21 ("Moltres", "21", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  ARTICUNO_22 ("Articuno", "22", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  ZAPDOS_23 ("Zapdos", "23", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  BIRTHDAY_PIKACHU_24 ("Birthday Pikachu", "24", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  FLYING_PIKACHU_25 ("Flying Pikachu", "25", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  PIKACHU_26 ("Pikachu", "26", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  PIKACHU_27 ("Pikachu", "27", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  SURFING_PIKACHU_28 ("Surfing Pikachu", "28", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MARILL_29 ("Marill", "29", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  TOGEPI_30 ("Togepi", "30", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  CLEFFA_31 ("Cleffa", "31", Rarity.PROMO, BASIC, BABY, POKEMON, _COLORLESS_),
  SMEARGLE_32 ("Smeargle", "32", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  SCIZOR_33 ("Scizor", "33", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _METAL_),
  ENTEI_34 ("Entei", "34", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  PICHU_35 ("Pichu", "35", Rarity.PROMO, BASIC, BABY, POKEMON, _LIGHTNING_),
  IGGLYBUFF_36 ("Igglybuff", "36", Rarity.PROMO, BASIC, BABY, POKEMON, _COLORLESS_),
  HITMONTOP_37 ("Hitmontop", "37", Rarity.PROMO, BASIC, POKEMON, _FIGHTING_),
  UNOWN_J_38 ("Unown J", "38", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MISDREAVUS_39 ("Misdreavus", "39", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  POKEMON_CENTER_40 ("Pokémon Center", "40", Rarity.PROMO, TRAINER),
  LUCKY_STADIUM_41 ("Lucky Stadium", "41", Rarity.PROMO, STADIUM, TRAINER),
  POKEMON_TOWER_42 ("Pokémon Tower", "42", Rarity.PROMO, STADIUM, TRAINER, NOT_IMPLEMENTED),
  MACHAMP_43 ("Machamp", "43", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _FIGHTING_),
  MAGMAR_44 ("Magmar", "44", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  SCYTHER_45 ("Scyther", "45", Rarity.PROMO, BASIC, POKEMON, _GRASS_),
  ELECTABUZZ_46 ("Electabuzz", "46", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MEW_47 ("Mew", "47", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  ARTICUNO_48 ("Articuno", "48", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  SNORLAX_49 ("Snorlax", "49", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  CELEBI_50 ("Celebi", "50", Rarity.PROMO, BASIC, POKEMON, _GRASS_),
  RAPIDASH_51 ("Rapidash", "51", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _FIRE_),
  HO_OH_52 ("Ho-oh", "52", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  SUICUNE_53 ("Suicune", "53", Rarity.PROMO, BASIC, POKEMON, _WATER_);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  private WizardsBlackStarPromos(String name, String collectionLineNo, Rarity rarity, CardType... cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes)
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
    return tcgwars.logic.card.Collection.POKEMOD_PROMOS
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
      case PIKACHU_1:
       return copy (WizardsBlackStarPromos.PIKACHU_1, this)
      case ELECTABUZZ_2:
       break
      case MEWTWO_3:
       return copy (WizardsBlackStarPromos.MEWTWO_3, this)
      case PIKACHU_4:
       return copy (WizardsBlackStarPromos.PIKACHU_4, this)
      case DRAGONITE_5:
       return copy (WizardsBlackStarPromos.DRAGONITE_5, this)
      case ARCANINE_6:
       return copy (WizardsBlackStarPromos.ARCANINE_6, this)
      case JIGGLYPUFF_7:
       return copy (WizardsBlackStarPromos.JIGGLYPUFF_7, this)
      case MEW_8:
       break
      case MEW_9:
       break
      case MEOWTH_10:
       return copy (WizardsBlackStarPromos.MEOWTH_10, this)
      case EEVEE_11:
       return basic (this, hp:HP030, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        pokemonBody "Chain Reaction", {
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
      }
      case MEWTWO_12:
       return copy (WizardsBlackStarPromos.MEWTWO_12, this)
      case VENUSAUR_13:
       return copy (WizardsBlackStarPromos.VENUSAUR_13, this)
      case MEWTWO_14:
       return copy (WizardsBlackStarPromos.MEWTWO_14, this)
      case COOL_PORYGON_15:
       return copy (WizardsBlackStarPromos.COOL_PORYGON_15, this)
      case COMPUTER_ERROR_16:
       return copy (WizardsBlackStarPromos.COMPUTER_ERROR_16, this)
      case DARK_PERSIAN_17:
       return copy (WizardsBlackStarPromos.DARK_PERSIAN_17, this)
      case TEAM_ROCKET_S_MEOWTH_18:
       return copy (WizardsBlackStarPromos.TEAM_ROCKET_S_MEOWTH_18, this)
      case SABRINA_S_ABRA_19:
       return copy (WizardsBlackStarPromos.SABRINA_S_ABRA_19, this)
      case PSYDUCK_20:
       return copy (PokemodFossil.PSYDUCK_53, this)
      case MOLTRES_21:
       return copy (WizardsBlackStarPromos.MOLTRES_21, this)
      case ARTICUNO_22:
       return copy (WizardsBlackStarPromos.ARTICUNO_22, this)
      case ZAPDOS_23:
       return copy (WizardsBlackStarPromos.ZAPDOS_23, this)
      case BIRTHDAY_PIKACHU_24:
       return copy (WizardsBlackStarPromos.BIRTHDAY_PIKACHU_24, this)
      case FLYING_PIKACHU_25:
       return copy (WizardsBlackStarPromos.FLYING_PIKACHU_25, this)
      case PIKACHU_26:
       return copy (WizardsBlackStarPromos.PIKACHU_26, this)
      case PIKACHU_27:
       return copy (WizardsBlackStarPromos.PIKACHU_27, this)
      case SURFING_PIKACHU_28:
       return copy (WizardsBlackStarPromos.SURFING_PIKACHU_28, this)
      case MARILL_29:
       return copy (WizardsBlackStarPromos.MARILL_29, this)
      case TOGEPI_30:
       return copy (WizardsBlackStarPromos.TOGEPI_30, this)
      case CLEFFA_31:
       return copy (WizardsBlackStarPromos.CLEFFA_31, this)
      case SMEARGLE_32:
       return copy (WizardsBlackStarPromos.SMEARGLE_32, this)
      case SCIZOR_33:
       return copy (WizardsBlackStarPromos.SCIZOR_33, this)
      case ENTEI_34:
       break
      case PICHU_35:
       return copy (WizardsBlackStarPromos.PICHU_35, this)
      case IGGLYBUFF_36:
       return copy (WizardsBlackStarPromos.IGGLYBUFF_36, this)
      case HITMONTOP_37:
       return copy (WizardsBlackStarPromos.HITMONTOP_37, this)
      case UNOWN_J_38:
       return copy (WizardsBlackStarPromos.UNOWN_J_38, this)
      case MISDREAVUS_39:
       return basic (this, hp:HP050, type:P, retreatCost:1) {
         weakness DARKNESS
        resistance FIGHTING, MINUS30
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
      }
      case POKEMON_CENTER_40:
       return copy (WizardsBlackStarPromos.POKEMON_CENTER_40, this)
      case LUCKY_STADIUM_41:
       return copy (WizardsBlackStarPromos.LUCKY_STADIUM_41, this)
      case POKEMON_TOWER_42:
       return copy (WizardsBlackStarPromos.POKEMON_TOWER_42, this)
      case MACHAMP_43:
       return copy (WizardsBlackStarPromos.MACHAMP_43, this)
      case MAGMAR_44:
       return copy (WizardsBlackStarPromos.MAGMAR_44, this)
      case SCYTHER_45:
       return copy (WizardsBlackStarPromos.SCYTHER_45, this)
      case ELECTABUZZ_46:
       return copy (WizardsBlackStarPromos.ELECTABUZZ_46, this)
      case MEW_47:
       return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokemonBody "Neutral Shield", {
          text "Prevent all effects of attacks, including damage, done to Mew by Evolved Pokémon. You can’t use this power if Mew is Asleep, Confused, or Paralyzed"
          delayedA {
            before null, self, Source.ATTACK, {
              if (bg.currentTurn.pbg.active.evolution && ef.effectType != DAMAGE && self.checkSpecialConditionsForClassic()) {
                bc "Neutral Shield prevents effect"
                prevent()
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.evolution && self.checkSpecialConditionsForClassic()) {
                bg.dm().each {
                  if(it.to == self && it.dmg.value && it.notNoEffect) {
                    it.dmg = hp(0)
                    bc "Neutral Shield prevents damage"
                  }
                }
              }
            }
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
      }
      case ARTICUNO_48:
       break
      case SNORLAX_49:
       break
      case CELEBI_50:
       return copy (WizardsBlackStarPromos.CELEBI_50, this)
      case RAPIDASH_51:
       return copy (WizardsBlackStarPromos.RAPIDASH_51, this)
      case HO_OH_52:
       return copy (WizardsBlackStarPromos.HO_OH_52, this)
      case SUICUNE_53:
       return copy (WizardsBlackStarPromos.SUICUNE_53, this)
      default:
    return null
    }
  }
}