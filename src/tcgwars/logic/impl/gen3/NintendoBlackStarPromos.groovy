package tcgwars.logic.impl.gen3

import tcgwars.logic.impl.gen1.WizardsBlackStarPromosNG
import tcgwars.logic.impl.gen2.Aquapolis
import tcgwars.logic.impl.gen3.UnseenForces
import tcgwars.logic.impl.gen3.LegendMaker

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
public enum NintendoBlackStarPromos implements LogicCardInfo {

  KYOGRE_EX_1 ("Kyogre ex", "001", Rarity.PROMO, [POKEMON, BASIC, EX, _WATER_]),
  GROUDON_EX_2 ("Groudon ex", "002", Rarity.PROMO, [POKEMON, BASIC, EX, _FIGHTING_]),
  TREECKO_3 ("Treecko", "003", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  GROVYLE_4 ("Grovyle", "004", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MUDKIP_5 ("Mudkip", "005", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  TORCHIC_6 ("Torchic", "006", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  TREECKO_7 ("Treecko", "007", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  TORCHIC_8 ("Torchic", "008", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  COMBUSKEN_9 ("Combusken", "009", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MUDKIP_10 ("Mudkip", "010", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MARSHTOMP_11 ("Marshtomp", "011", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_12 ("Pikachu", "012", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  MEOWTH_13 ("Meowth", "013", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LATIAS_14 ("Latias", "014", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LATIOS_15 ("Latios", "015", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  TREECKO_16 ("Treecko", "016", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  TORCHIC_17 ("Torchic", "017", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  MUDKIP_18 ("Mudkip", "018", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  WHISMUR_19 ("Whismur", "019", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LUDICOLO_20 ("Ludicolo", "020", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  JIRACHI_21 ("Jirachi", "021", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  BELDUM_22 ("Beldum", "022", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  METANG_23 ("Metang", "023", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CHIMECHO_24 ("Chimecho", "024", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  FLYGON_25 ("Flygon", "025", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  TROPICAL_WIND_26 ("Tropical Wind", "026", Rarity.PROMO, [TRAINER, ITEM]),
  TROPICAL_TIDAL_WAVE_27 ("Tropical Tidal Wave", "027", Rarity.PROMO, [TRAINER, ITEM]),
  CHAMPIONSHIP_ARENA_28 ("Championship Arena", "028", Rarity.PROMO, [TRAINER, STADIUM]),
  CELEBI_29 ("Celebi", "029", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  SUICUNE_30 ("Suicune", "030", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MOLTRES_EX_31 ("Moltres ex", "031", Rarity.PROMO, [POKEMON, BASIC, EX, _FIRE_]),
  ARTICUNO_EX_32 ("Articuno ex", "032", Rarity.PROMO, [POKEMON, BASIC, EX, _WATER_]),
  ZAPDOS_EX_33 ("Zapdos ex", "033", Rarity.PROMO, [POKEMON, BASIC, EX, _LIGHTNING_]),
  TYPHLOSION_34 ("Typhlosion", "034", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  PIKACHU_DELTA_35 ("Pikachu", "035", Rarity.PROMO, [POKEMON, BASIC, DELTA, _METAL_]),
  TROPICAL_TIDAL_WAVE_36 ("Tropical Tidal Wave", "036", Rarity.PROMO, [TRAINER, ITEM]),
  KYOGRE_EX_37 ("Kyogre ex", "037", Rarity.PROMO, [POKEMON, BASIC, EX, _WATER_]),
  GROUDON_EX_38 ("Groudon ex", "038", Rarity.PROMO, [POKEMON, BASIC, EX, _FIGHTING_]),
  RAYQUAZA_EX_39 ("Rayquaza ex", "039", Rarity.PROMO, [POKEMON, BASIC, EX, _COLORLESS_]),
  MEW_40 ("Mew", "040", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  NintendoBlackStarPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.NINTENDO_BLACK_STAR_PROMOS
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
      case KYOGRE_EX_1:
      return basic (this, hp:HP120, type:W, retreatCost:3) {
        weakness L
        move "Major Flood", {
          text "60 damage. Discard a [W] Energy card attached to Kyogre ex. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W, W
          onAttack {
            damage 60
            all.each {
              if (it.benched) {
                damage 10, it
              }
            }
            afterDamage {
              discardSelfEnergy(W)
            }
          }
        }
      }
      case GROUDON_EX_2:
      return basic (this, hp:HP120, type:F, retreatCost:3) {
        weakness G
        move "Major Earthquake", {
          text "80 damage. Discard a [F] Energy card attached to Groudon ex. Does 10 damage to your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, F
          onAttack {
            damage 80
            my.bench.each {
              damage 10, it
            }
            afterDamage {
              discardSelfEnergy(F)
            }
          }
        }
      }
      case TREECKO_3:
        return copy(RubySapphire.TREECKO_76, this)
      case GROVYLE_4:
        return copy(RubySapphire.GROVYLE_31, this)
      case MUDKIP_5:
        return copy(RubySapphire.MUDKIP_60, this)
      case TORCHIC_6:
        return copy(RubySapphire.TORCHIC_73, this)
      case TREECKO_7:
      return copy (TREECKO_3, this)
      case TORCHIC_8:
      return copy (TORCHIC_6, this)
      case COMBUSKEN_9:
        return copy(RubySapphire.COMBUSKEN_27, this)
      case MUDKIP_10:
      return copy (MUDKIP_5, this)
      case MARSHTOMP_11:
        return copy(RubySapphire.MARSHTOMP_40, this)
      case PIKACHU_12:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Agility", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Pikachu during your opponent's next turn."
          energyCost C
          onAttack {
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      }
      case MEOWTH_13:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Plunder", {
          text "10 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon (before they affect the damage)."
          energyCost C
          onAttack {
            if (defending.cards.hasType(TRAINER)){
              defending.cards.filterByType(TRAINER).discard()
            }
            damage 10
          }
        }
        move "Scratch", {
          text "20 damage. "
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      }
      case LATIAS_14:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness P
        move "Super Psy", {
          text "10 damage. "
          energyCost P
          onAttack {
            damage 10
          }
        }
        move "Searing Flame", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, W
          onAttack {
            damage 20
            flip { applyAfterDamage(BURNED) }
          }
        }
      }
      case LATIOS_15:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness P
        move "Super Psy", {
          text "10 damage. "
          energyCost P
          onAttack {
            damage 10
          }
        }
        move "Freeze Dry", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, P, L
          onAttack {
            damage 30
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      }
      case TREECKO_16:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Sporadic Sponging", {
          text "10 damage. Flip a coin. If heads, remove 1 damage counter from Treecko."
          energyCost G
          onAttack {
            damage 10
            afterDamage {
              flip { heal 10, self }
            }
          }
        }
      }
      case TORCHIC_17:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Torchic."
          energyCost R, C
          onAttack {
            damage 30
            afterDamage {
              discardSelfEnergy(R)
            }
          }
        }
      }
      case MUDKIP_18:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Surf", {
          text "10 damage. "
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Whirlpool", {
          text "10 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost W, C
          onAttack {
            damage 10
            afterDamage {
              flip { discardDefendingEnergy() }
            }
          }
        }
      }
      case WHISMUR_19:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            flip { apply CONFUSED }
          }
        }
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
      }
      case LUDICOLO_20:
      return evolution (this, from:"Lombre", hp:HP090, type:W, retreatCost:2) {
        weakness L
        pokeBody "Rain Dish", {
          text "At any time between turns, remove 1 damage counter from Ludicolo."
          delayedA {
            before BEGIN_TURN, {
              if (self.numberOfDamageCounters) {
                bc "Rain Dish activates"
                heal 10, self
              }
            }
          }
        }
        move "Fury Swipes", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost W, C, C
          onAttack {
            flip 3, { damage 30 }
          }
        }
      }
      case JIRACHI_21:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "The Third Eye", {
          text "Discard an Energy card attached to Jirachi and draw 3 cards."
          energyCost C
          onAttack {
            discardSelfEnergy(C)
            draw 3
          }
        }
        move "Psywave", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost P
          onAttack {
            damage 10 * defending.cards.energyCount(C)
          }
        }
      }
      case BELDUM_22:
        return copy(HiddenLegends.BELDUM_29, this)
      case METANG_23:
        return copy(HiddenLegends.METANG_21, this)
      case CHIMECHO_24:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Resonate", {
          text "Your opponent switches each Defending Pokémon with his or her Benched Pokémon. If your opponent has only 1 Benched Pokémon, you choose the Defending Pokémon to switch."
          energyCost C
          onAttack {
            whirlwind()
          }
        }
        move "Healing Sound", {
          text "Remove 3 damage counters from each of your Active Pokémon. Each Defending Pokémon is now Asleep."
          energyCost C, C
          onAttack {
            heal 30, my.active
            apply ASLEEP
          }
        }
      }
      case FLYGON_25:
      return evolution (this, from:"Vibrava", hp:HP120, type:C, retreatCost:2) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        move "Sand Pit", {
          text "20 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 20
            cantRetreat defending
          }
        }
        move "Dragonbreath", {
          text "80 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing."
          energyCost G, L, C, C
          onAttack {
            flip {
              damage 80
              applyAfterDamage PARALYZED
            }
          }
        }
      }
      case TROPICAL_WIND_26:
      return itemCard (this) {
        text "Flip a coin. If heads, remove 2 damage counters from each Active Pokémon (remove 1 damage counter if a Pokémon has only 1). If tails, each Active Pokémon is now Asleep."
        onPlay {
          flip 1, {
            [my.active, opp.active].each{ heal 20, it, TRAINER_CARD }
          }, {
            [my.active, opp.active].each{apply ASLEEP, it, TRAINER_CARD }
          }
        }
        playRequirement{
          assert [my.active, opp.active].any{it.numberOfDamageCounters || !it.isSPC(ASLEEP)} : "Neither Active Pokémon has any damage counters on it, and both are already asleep"
        }
      }
      case TROPICAL_TIDAL_WAVE_27:
      return itemCard (this) {
        text "Flip a coin. If heads, discard all Trainer cards your opponent has in play. If tails, discard all Trainer cards (excluding Supporter cards) you have in play."
        //TODO
        onPlay {
        }
        playRequirement{
        }
      }
      case CHAMPIONSHIP_ARENA_28:
      return stadium (this) {
        text "At the end of each player's turn, if that player has 8 or more cards in his or her hand, that player discards a number of cards until the player has 7 cards left in his or her hand."
        def eff
        onPlay {
          eff = delayed {
            before BETWEEN_TURNS, {
              if (my.hand.size() >= 8) {
                def discNum = my.hand.size() - 7
                my.hand.select(count: discNum, "Championship Arena - Select {discNum} cards to discard from your hand.").discard()
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      }
      case CELEBI_29:
        return copy(WizardsBlackStarPromosNG.CELEBI_50, this)
      case SUICUNE_30:
        return copy(Aquapolis.SUICUNE_H25, this)
        //TODO: Implement in Groovy.
//      return basic (this, hp:HP070, type:W, retreatCost:1) {
//        weakness L
//        pokemonPower "Pure Body", {
//          text "Whenever you attach a [W] Energy card from your hand to Suicune, discard an Energy card attached to Suicune. (You can't attach a [W] Energy card from your hand if Suicune has no Energy cards attached.)"
//          actionA {
//          }
//        }
//        move "Hypno Wave", {
//          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage and the Defending Pokémon is now Asleep."
//          energyCost W, C, C
//          onAttack {
//            damage 30
//            flip 1, { damage 20 }, { applyAfterDamage ASLEEP }
//          }
//        }
//      };
      case MOLTRES_EX_31:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokeBody "Synchronized Lift", {
          text "As long as you have Articuno ex and Zapdos ex in play, the Retreat Cost for Moltres ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {holder->
            if (my.all.any{it.name == "Articuno ex"} && my.all.any{it.name == "Zapdos ex"}) {
              holder.object = 0
            }
          }
        }
        move "Flame Gift", {
          text "10 damage. You may move a [R] Energy card attached to Moltres ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              if ( my.bench && self.cards.energyCount(R) && confirm("Move a [R] Energy card attached to $self to 1 of your Pokémon?") ) {
                moveEnergy(type: R, self, my.bench.select("Which pokémon will recieve the [R] Energy?"))
              }
            }
          }
        }
        move "Scorching Wing", {
          text "90 damage. Discard all [R] Energy attached to Moltres ex."
          energyCost R, R, C
          onAttack {
            damage 90
            afterDamage {
              discardAllSelfEnergy(R)
            }
          }
        }
      }
      case ARTICUNO_EX_32:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness M
        pokeBody "Synchronized Lift", {
          text "As long as you have Zapdos ex and Moltres ex in play, the Retreat Cost for Articuno ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {holder->
            if (my.all.any{it.name == "Zapdos ex"} && my.all.any{it.name == "Moltres ex"}) {
              holder.object = 0
            }
          }
        }
        move "Ice Gift", {
          text "10 damage. You may move a [W] Energy card attached to Articuno ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              if ( my.bench && self.cards.energyCount(W) && confirm("Move a [W] Energy card attached to $self to 1 of your Pokémon?") ) {
                moveEnergy(type: W, self, my.bench.select("Which pokémon will recieve the [W] Energy?"))
              }
            }
          }
        }
        move "Freezing Wing", {
          text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W, W, C
          onAttack {
            damage 50
            flip { applyAfterDamage ASLEEP }
          }
        }
      }
      case ZAPDOS_EX_33:
      return basic (this, hp:HP100, type:L, retreatCost:2) {
        weakness L
        pokeBody "Synchronized Lift", {
          text "As long as you have Articuno ex and Moltres ex in play, the Retreat Cost for Zapdos ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {holder->
            if (my.all.any{it.name == "Articuno ex"} && my.all.any{it.name == "Moltres ex"}) {
              holder.object = 0
            }
          }
        }
        move "Thunder Gift", {
          text "10 damage. You may move a [L] Energy card attached to Zapdos ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              if ( my.bench && self.cards.energyCount(L) && confirm("Move a [L] Energy card attached to $self to 1 of your Pokémon?") ) {
                moveEnergy(type: L, self, my.bench.select("Which pokémon will recieve the [L] Energy?"))
              }
            }
          }
        }
        move "Lightning Wing", {
          text "60 damage. Does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          onAttack {
            damage 60
            if (my.bench) {
              damage 10, my.bench.select("Deal 10 damage to which Benched Pokémon?")
            }
          }
        }
      }
      case TYPHLOSION_34:
      return copy(UnseenForces.TYPHLOSION_17, this)
      case PIKACHU_DELTA_35:
      return copy(LegendMaker.PIKACHU_DELTA_93, this)
      case TROPICAL_TIDAL_WAVE_36:
      return copy (TROPICAL_TIDAL_WAVE_27, this)
      case KYOGRE_EX_37:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokeBody "Frenzy", {
          text "As long as your opponent has Groudon, Groudon ex, Rayquaza, or Rayquaza ex in play, Kyogre ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker == self && opp.all.any{["Groudon", "Groudon ex", "Rayquaza", "Rayquaza ex"].contains(it.name)}) {
                bg.dm().each {
                  if (it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Frenzy +40"
                    it.dmg += hp(40)
                  }
                }
              }
            }
          }
        }
        move "Aqua Supply", {
          text "30 damage. You may attach a basic Energy card from your hand to 1 of your Pokémon."
          energyCost W, C
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(basic: true, my.hand, my.all)
            }
          }
        }
        move "Tsunami", {
          text "40 damage. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          onAttack {
            damage 40
            opp.bench.each{
              damage 10, it
            }
          }
        }
      }
      case GROUDON_EX_38:
      return basic (this, hp:HP100, type:F, retreatCost:2) {
        weakness W
        pokeBody "Frenzy", {
          text "As long as your opponent has Kyogre, Kyogre ex, Rayquaza, or Rayquaza ex in play, Groudon ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker == self && opp.all.any{["Kyogre", "Kyogre ex", "Rayquaza", "Rayquaza ex"].contains(it.name)}) {
                bg.dm().each {
                  if (it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Frenzy +40"
                    it.dmg += hp(40)
                  }
                }
              }
            }
          }
        }
        move "Mix-Up", {
          text "30 damage. Flip a coin. If heads, your opponent discards the top card from his or her deck."
          energyCost F, C
          onAttack {
            damage 30
            if (opp.deck) {
              flip { opp.deck.subList(0,1).discard() }
            }

          }
        }
        move "Earthquake", {
          text "60 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          onAttack {
            damage 60
            my.bench.each{
              damage 10, it
            }
          }
        }
      }
      case RAYQUAZA_EX_39:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness C
        resistance W, MINUS30
        resistance F, MINUS30
        pokeBody "Frenzy", {
          text "As long as your opponent has Kyogre, Kyogre ex, Groudon, or Groudon ex in play, Rayquaza ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker == self && opp.all.any{["Kyogre", "Kyogre ex", "Groudon", "Groudon ex"].contains(it.name)}) {
                bg.dm().each {
                  if (it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Frenzy +40"
                    it.dmg += hp(40)
                  }
                }
              }
            }
          }
        }
        move "Dragon Bind", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Twister", {
          text "50 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
          energyCost R, L, C
          onAttack {
            def discardTimes = 0

            flip 2, { discardTimes += 1}
            if (discardTimes) damage 50 else bc "$thisMove failed due to 2 TAILS."

            afterDamage {
              discardTimes.times{ discardDefendingEnergy() }
            }
          }
        }
      }
      case MEW_40:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psywave", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost C
          onAttack {
            damage 10 * defending.cards.energyCount(C)
          }
        }
        move "Devolution Beam", {
          text "Flip a coin. If heads, choose 1 of either player's Evolved Pokémon, remove the highest Stage Evolution card from that Pokémon, and put it into that player's hand."
          energyCost P
          onAttack {
            //Taken from UnseenForces.UNOWN_122
            flip {
              if (all.findAll { it.evolution }) {
                def list = all.findAll { it.evolution }
                def pcs = list.select("Devolve one Evolved Pokémon")
                devolve(pcs, pcs.owner.pbg.hand)
              }
            }
          }
        }
      }
        default:
      return null
    }
  }
}

