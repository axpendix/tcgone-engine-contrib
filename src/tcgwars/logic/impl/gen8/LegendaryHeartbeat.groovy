package tcgwars.logic.impl.gen8

import tcgwars.logic.impl.gen3.FireRedLeafGreen
import tcgwars.logic.impl.gen5.EmergingPowers
import tcgwars.logic.impl.gen5.NobleVictories
import tcgwars.logic.impl.gen6.KalosStarterSet;

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
public enum LegendaryHeartbeat implements LogicCardInfo {

  WEEDLE_1 ("Weedle", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KAKUNA_2 ("Kakuna", "2", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BEEDRILL_3 ("Beedrill", "3", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  EXEGGCUTE_4 ("Exeggcute", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  EXEGGUTOR_5 ("Exeggutor", "5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  YANMA_6 ("Yanma", "6", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  YANMEGA_7 ("Yanmega", "7", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PINECO_8 ("Pineco", "8", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CELEBI_9 ("Celebi", "9", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  SHAYMIN_10 ("Shaymin", "10", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  GENESECT_11 ("Genesect", "11", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  DHELMISE_12 ("Dhelmise", "12", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ZARUDE_V_13 ("Zarude V", "13", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  AMPHAROS_V_14 ("Ampharos V", "14", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  RAIKOU_15 ("Raikou", "15", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRIKE_16 ("Electrike", "16", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MANECTRIC_17 ("Manectric", "17", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTIK_18 ("Joltik", "18", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  GALVANTULA_19 ("Galvantula", "19", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ZEKROM_20 ("Zekrom", "20", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ZERAORA_21 ("Zeraora", "21", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  PINCURCHIN_22 ("Pincurchin", "22", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CLEFAIRY_23 ("Clefairy", "23", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CLEFABLE_24 ("Clefable", "24", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GIRAFARIG_25 ("Girafarig", "25", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SHUPPET_26 ("Shuppet", "26", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BANETTE_27 ("Banette", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DEDENNE_28 ("Dedenne", "28", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  XERNEAS_29 ("Xerneas", "29", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  DIANCIE_30 ("Diancie", "30", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  ALCREMIE_V_31 ("Alcremie V", "31", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ALCREMIE_VMAX_32 ("Alcremie VMAX", "32", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  ZACIAN_33 ("Zacian", "33", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  WOOPER_34 ("Wooper", "34", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  QUAGSIRE_35 ("Quagsire", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SHUCKLE_36 ("Shuckle", "36", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  REGIROCK_37 ("Regirock", "37", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  RIOLU_38 ("Riolu", "38", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  ZYGARDE_39 ("Zygarde", "39", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  ROCKRUFF_40 ("Rockruff", "40", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LYCANROC_41 ("Lycanroc", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  COALOSSAL_V_42 ("Coalossal V", "42", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  COALOSSAL_VMAX_43 ("Coalossal VMAX", "43", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  ZAMAZENTA_44 ("Zamazenta", "44", Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  FORRETRESS_45 ("Forretress", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  STEELIX_V_46 ("Steelix V", "46", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  BELDUM_47 ("Beldum", "47", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  METANG_48 ("Metang", "48", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  METAGROSS_49 ("Metagross", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  JIRACHI_50 ("Jirachi", "50", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  LUCARIO_51 ("Lucario", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  DIALGA_52 ("Dialga", "52", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  GALARIAN_STUNFISK_53 ("Galarian Stunfisk", "53", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  MAGEARNA_54 ("Magearna", "54", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  LUGIA_55 ("Lugia", "55", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  RAYQUAZA_56 ("Rayquaza", "56", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  CHATOT_57 ("Chatot", "57", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TOGEKISS_V_58 ("Togekiss V", "58", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  TOGEKISS_VMAX_59 ("Togekiss VMAX", "59", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  TORNADUS_60 ("Tornadus", "60", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  PIKIPEK_61 ("Pikipek", "61", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TRUMBEAK_62 ("Trumbeak", "62", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TOUCANNON_63 ("Toucannon", "63", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  GREAT_BALL_64 ("Great Ball", "64", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SWITCH_65 ("Switch", "65", Rarity.COMMON, [TRAINER, ITEM]),
  POKEMON_CATCHER_66 ("Pokémon Catcher", "66", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MOOMOO_CHEESE_67 ("Moomoo Cheese", "67", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HERO_S_MEDAL_68 ("Hero's Medal", "68", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  ROCKY_HELMET_69 ("Rocky Helmet", "69", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  BEAUTY_70 ("Beauty", "70", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALLISTER_71 ("Allister", "71", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_72 ("Opal", "72", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MARNIE_73 ("Marnie", "73", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  AROMA_G_ENERGY_74 ("Aroma G Energy", "74", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  STONE_F_ENERGY_75 ("Stone F Energy", "75", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  TWIN_ENERGY_76 ("Twin Energy", "76", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ZARUDE_V_77 ("Zarude V", "77", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  AMPHAROS_V_78 ("Ampharos V", "78", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ALCREMIE_V_79 ("Alcremie V", "79", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  COALOSSAL_V_80 ("Coalossal V", "80", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  STEELIX_V_81 ("Steelix V", "81", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  TOGEKISS_V_82 ("Togekiss V", "82", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  BEAUTY_83 ("Beauty", "83", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALLISTER_84 ("Allister", "84", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_85 ("Opal", "85", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALCREMIE_VMAX_86 ("Alcremie VMAX", "86", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  COALOSSAL_VMAX_87 ("Coalossal VMAX", "87", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _FIGHTING_]),
  TOGEKISS_VMAX_88 ("Togekiss VMAX", "88", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  BEAUTY_89 ("Beauty", "89", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ALLISTER_90 ("Allister", "90", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OPAL_91 ("Opal", "91", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ORANGURU_92 ("Oranguru", "92", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  HERO_S_MEDAL_93 ("Hero's Medal", "93", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  CAPE_OF_TOUGHNESS_94 ("Cape of Toughness", "94", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  LegendaryHeartbeat(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.LEGENDARY_HEARTBEAT;
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
      case WEEDLE_1:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Bug Hunch", {
          text "Search your deck for up to 2 [G] Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost G
          attackRequirement {
            assert my.deck : "Your deck is empty!"
          }
          onAttack {
            def info = "Opponent chose the following Pokémon from their deck using $thisMove."
            my.deck.search(max:2, pokemonTypeFilter(G)).showToOpponent(bg, info).moveTo my.hand
            shuffleDeck()
          }
        }
      };
      case KAKUNA_2:
      return evolution (this, from:"Weedle", hp:HP080, type:G, retreatCost:3) {
        weakness R
        move "Shed Skin", {
          text "Heal 30 damage from this Pokémon"
          energyCost C
          attackRequirement {
            assert self.numberOfDamageCounters : "$self is not damaged"
          }
          onAttack {
            heal 30, self
          }
        }
        move "Bug Bite", {
          energyCost G
          onAttack {
            damage 20
          }
        }
      };
      case BEEDRILL_3:
      return evolution (this, from:"Kakuna", hp:HP130, type:G, retreatCost:0) {
        weakness R
        globalAbility {
          delayed {
            def abilityUsed = false
            before PLAY_CARD, {
              if (ef.cardToPlay == thisCard && my.hand.getExcludedList(thisCard).empty && my.bench.freeBenchCount) {
                def abilityName = " Elusive Master"
                abilityUsed = confirm("Use $abilityName?")
                if(abilityUsed && !checkGlobalAbility(thisCard)) {
                  wcu "$abilityName was blocked."
                  return
                }
                if (abilityUsed && benchPCS(thisCard, PLAY_FROM_HAND)) {
                  bc("$thisCard.name has used $abilityName")
                  draw 3
                }
              }
            }
            before PLAY_EVOLUTION, {
              if (abilityUsed) prevent()
            }
            after PLAY_CARD, {
              abilityUsed = false
            }
          }
        }
        bwAbility "Elusive Master", {
          text "Once during your turn, if this Pokémon is the last card in your hand, you may play it onto your Bench." +
            "If you do, draw 3 cards. "
        }
        move "Sharp Sting", {
          text "120 damage."
          energyCost G, C
          onAttack {
            damage 120
          }
        }
      };
      case EXEGGCUTE_4:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Seed Bomb", {
          text "10 damage."
          energyCost G
          onAttack {
            damage 10
          }
        }
      };
      case EXEGGUTOR_5:
      return evolution (this, from:"Exeggcute", hp:HP140, type:G, retreatCost:3) {
        weakness R
        move "Head Crack", {
          text "30 damage. Choose 1 of your opponent's Active Pokémon's attacks. During your opponent's next turn, that Pokémon can't use that attack."
          energyCost G
          onAttack {
            damage 30
            amnesia(delegate)
          }
        }
        move "Solar Beam", {
          text "90 damage."
          energyCost G, C, C
          onAttack {
            damage 90
          }
        }
      };
      case YANMA_6:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "U-turn", {
          text "10 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            damage 10
            switchYourActive may:true
          }
        }
        move "Cutting Wind", {
          text "60 damage."
          energyCost C, C, C
          onAttack {
            damage 60
          }
        }
      };
      case YANMEGA_7:
      return evolution (this, from:"Yanma", hp:HP130, type:G, retreatCost:0) {
        weakness R
        move "U-turn", {
          text "50 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C, C
          onAttack {
            damage 50
            switchYourActive may:true
          }
        }
        move "Cutting Wind", {
          text "130 damage."
          energyCost C, C, C, C
          onAttack {
            damage 130
          }
        }
      };
      case PINECO_8:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Ram", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Iron Defense", {
          text " Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks."
          energyCost C, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
      };
      case CELEBI_9:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Energy Press", {
          text "30x damage. This attack does 30 damage for each Energy attached to your opponent's Active Pokémon."
          energyCost G
          onAttack {
            damage 30 * defending.getEnergyCount(bg)
          }
        }
        move "Amazing Bloom", {
          text " For each of your Benched Pokémon, search your deck for a card that evolves from that Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck."
          energyCost L, P
          attackRequirement {
            assert my.bench.any { bg.gm().hasEvolution(it.name) } : "No Pokémon with evolutions in play"
          }
          onAttack {
            my.bench.each {pcs ->
              if (!bg.gm().hasEvolution(pcs.name)) return
              def evolution = my.deck.search ("Evolve $pcs to?", {Card card ->
                if (!(card instanceof EvolutionPokemonCard)) return false
                (card as EvolutionPokemonCard).predecessor == pcs.name
              }).first()
              if (!evolution) return
              evolve(pcs, evolution, OTHER)
            }
            shuffleDeck()
          }
        }
      };
      case SHAYMIN_10:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Leech Seed", {
          text "20 damage. Heal 20 damage from this Pokémon."
          energyCost G
          onAttack {
            damage 20
            heal 20, self
          }
        }
        move "Flower Bearing", {
          text " Flip a coin. If heads, your opponent shuffles their Active Pokémon and all attached cards and puts them on the bottom of their deck."
          energyCost G, C
          onAttack {
            flip {
              def pcsCards = new CardList(defending.cards())
              pcsCards.shuffle()
              pcsCards.moveTo opp.deck
              removePCS defending
            }
          }
        }
      };
      case GENESECT_11:
      return basic (this, hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Linear Attack", {
          text " This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          onAttack {
            def info = "Pokémon to deal 50 damage to"
            damage 50, opp.all.select(info)
          }
        }
        move "Techno Blast", {
          text "120 damage. During your next turn, this Pokémon can't attack."
          energyCost G, G, C
          onAttack {
            damage 120
            cantAttackNextTurn self
          }
        }
      };
      case DHELMISE_12:
      return basic (this, hp:HP130, type:G, retreatCost:3) {
        weakness R
        move "Hook", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Special Anchor", {
          text "60+ damage. If this Pokémon has any Special Energy attached, this attack does 60 more damage."
          energyCost G, C, C
          onAttack {
            damage 60
            if (self.energyCards.any { it.cardTypes.contains(SPECIAL_ENERGY) }) {
              damage 60
            }
          }
        }
      };
      case ZARUDE_V_13:
      return basic (this, hp:HP210, type:G, retreatCost:1) {
        weakness R
        move "Bind Down", {
          text "50 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost C, C
          onAttack {
            damage 50
            cantRetreat defending
          }
        }
        move "Jungle Rising", {
          text "100 damage. You may attach up to 2 Basic Energy cards from your hand to your Benched Pokémon in any" +
            "way you like. If you attached Energy to a Pokémon in this way, heal all damage from that Pokémon."
          energyCost G, G
          onAttack {
            damage 100
            afterDamage {
              def skipped = false
              2.times {
                if (skipped) return
                def energyAttachment = attachEnergyFrom may: true, basic: true, my.hand, my.bench
                if (energyAttachment && !energyAttachment.empty
                  && energyAttachment.get(0) instanceof CardList && (energyAttachment.get(0) as CardList).notEmpty) {
                  healAll energyAttachment.get(1) as PokemonCardSet
                }
                else skipped = true
              }
            }
          }
        }
      };
      case AMPHAROS_V_14:
      return basic (this, hp:HP210, type:L, retreatCost:3) {
        weakness F
        move "Dazzle Blast", {
          text "50 damage. Your opponent's Active Pokémon is now Confused."
          energyCost L, C
          onAttack {
            damage 50
            applyAfterDamage CONFUSED
          }
        }
        move "Damaging Spark", {
          text "120 damage. This attack also does 30 damage to each of your opponent's Benched Pokémon that has any" +
            "damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          onAttack {
            damage 120
            opp.bench.each { if(it.numberOfDamageCounters) damage(30, it) }
          }
        }
      };
      case RAIKOU_15:
      return basic (this, hp:HP110, type:L, retreatCost:2) {
        weakness F
        move "Amazing Shot", {
          text "120 damage. This attack also does 120 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, L, M
          onAttack {
            damage 120
            if (opp.bench) {
              def info = "Pokémon to deal 120 damage to?"
              damage 120, opp.bench.select(info)
            }
          }
        }
      };
      case ELECTRIKE_16:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Collect", {
          text " Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty!"
          }
          onAttack {
            draw 1
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost L, C
          onAttack {
            damage 20
          }
        }
      };
      case MANECTRIC_17:
      return evolution (this, from:"Electrike", hp:HP120, type:L, retreatCost:0) {
        weakness F
        bwAbility "High Speed", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may draw 3 cards."
          onActivate { reason ->
            if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && confirm("Use $thisAbility?")) {
              draw 3
            }
          }
        }
        move "Electric Ball", {
          text "100 damage."
          energyCost L, C, C
          onAttack {
            damage 100
          }
        }
      };
      case JOLTIK_18:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Bug Bite", {
          text "20 damage."
          energyCost L
          onAttack {
            damage 20
          }
        }
      };
      case GALVANTULA_19:
      return evolution (this, from:"Joltik", hp:HP090, type:L, retreatCost:1) {
        weakness F
        move "Stun Needle", {
          text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 20
            flipThenApplySC PARALYZED
          }
        }
        move "Shocking Pursuit", {
          text "20x damage. This attack does 20 damage for each damage counter on your opponent's Active Pokémon."
          energyCost L, C
          attackRequirement {
            assert defending.numberOfDamageCounters : "Defending Pokémon is not damaged"
          }
          onAttack {
            damage 20 * defending.numberOfDamageCounters
          }
        }
      };
      case ZEKROM_20:
      return basic (this, hp:HP130, type:L, retreatCost:3) {
        weakness F
        move "Slash", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Wild Shock", {
          text "130 damage. This Pokémon does 60 damage to itself. Your opponent's Active Pokémon is now Paralyzed."
          energyCost L, L, C
          onAttack {
            damage 130
            damage 60, self
            applyAfterDamage PARALYZED
          }
        }
      };
      case ZERAORA_21:
      return basic (this, hp:HP100, type:L, retreatCost:0) {
        weakness F
        move "Fighting Lightning", {
          text "30+ damage. If your opponent's Active Pokémon is a Pokémon V or Pokémon-GX, this attack does 80 more damage."
          energyCost L, C
          onAttack {
            damage 30
            if (defending.pokemonGX || defending.pokemonV) damage 80
          }
        }
      };
      case PINCURCHIN_22:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Spinning Fan", {
          text " This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          onAttack {
            opp.all.each { damage 10, it }
          }
        }
        move "Peck", {
          text "30 damage."
          energyCost L, C
          onAttack {
            damage 30
          }
        }
      };
      case CLEFAIRY_23:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Pound", {
          text "10 damage."
          energyCost P
          onAttack {
            damage 10
          }
        }
        move "Mini-Metronome", {
          text " Flip a coin. If heads, choose 1 of your opponent's Active Pokémon's attacks and use it as this attack."
          energyCost C, C
          attackRequirement {
            assert defending.getTopPokemonCard().getMoves() : "Defending Pokémon has no moves to copy"
          }
          onAttack {
            flip { metronome defending, delegate }
          }
        }
      };
      case CLEFABLE_24:
      return evolution (this, from:"Clefairy", hp:HP100, type:P, retreatCost:1) {
        weakness M
        bwAbility "Lunar Blessing", {
          text "Once during your turn, if your Active Pokémon has any [P] Energy attached, you may heal 20 damage" +
            "from it, and it recovers from a Special Condition."
          actionA {
            checkLastTurn()
            assert active.getEnergyCount(bg) : "Active Pokémon does not have an Energy attached"
            assert active.numberOfDamageCounters || active.specialConditions : "Active Pokémon is not damaged and is not affected by a Special Condition"
            powerUsed()
            heal 20, active
            if(active.specialConditions) {
              def conditionToCure = [choose(active.specialConditions.toList(), "Clear") as SpecialConditionType]
              clearSpecialCondition(active, SRC_ABILITY, conditionToCure)
            }
          }
        }
        move "Magical Shot", {
          text "80 damage."
          energyCost P, C, C
          onAttack {
            damage 80
          }
        }
      };
      case GIRAFARIG_25:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Psypower", {
          text " Put 2 damage counters on your opponent's Pokémon in any way you like."
          energyCost P
          onAttack {
            putDamageCountersOnOpponentsPokemon 2
          }
        }
        move "Commanding Tail", {
          text "30 damage. You may have your opponent shuffle their hand into their deck and draw 4 cards."
          energyCost P, C
          onAttack {
            damage 30
            if (confirm("Have your opponent shuffle their hand into their deck and draw 4 cards?")) {
              opp.hand.moveTo hidden:true, opp.deck
              shuffleDeck null, TargetPlayer.OPPONENT
              draw 4, TargetPlayer.OPPONENT
            }
          }
        }
      };
      case SHUPPET_26:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Haunt", {
          text " Put 1 damage counter on your opponent's Active Pokémon."
          energyCost P
          onAttack {
            directDamage 10, defending
          }
        }
      };
      case BANETTE_27:
      return evolution (this, from:"Shuppet", hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Curse of Devolution", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may devolve 1 of your opponent's Benched Evolution Pokémon by putting the highest Stage Evolution card on it into your opponent's hand."
          onActivate { reason ->
            if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && opp.bench.any { it.evolution } && confirm("Use $thisAbility?")) {
              def pcs = opp.bench.findAll { it.evolution }.select("Pokémon to devolve?")
              devolve pcs, pcs.topPokemonCard as Card, opp.hand
            }
          }
        }
        move "Spooky Shot", {
          text "40 damage."
          energyCost P, C
          onAttack {
            damage 40
          }
        }
      };
      case DEDENNE_28:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Tail Trickery", {
          text "10 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P
          onAttack {
            damage 10
            applyAfterDamage CONFUSED
          }
        }
      };
      case XERNEAS_29:
      return basic (this, hp:HP130, type:P, retreatCost:2) {
        weakness M
        move "Geo Hunt", {
          text " Put a card from your discard pile into your hand."
          energyCost P
          attackRequirement {
            assert my.discard : "Discard pile is empty"
          }
          onAttack {
            my.discard.select("Card to return to hand?")
              .showToOpponent("Card opponent returned to hand from discard pile.")
              .moveTo my.hand
          }
        }
        move "Aurora Gain", {
          text "100 damage. Heal 30 damage from this Pokémon."
          energyCost P, P, C
          onAttack {
            damage 100
            heal 30, self
          }
        }
      };
      case DIANCIE_30:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness M
        bwAbility "Sparkle Veil", {
          text "As long as this Pokémon is in the Active Spot, your Pokémon take 30 less damage from attacks from" +
            "your opponent's Pokémon (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (!(self.active && ef.attacker.owner != self.owner)) return
              bg.dm().each {
                if(it.to.owner==self.owner && it.notNoEffect && it.notZero){
                  bc "$thisAbility -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Sensitive Ray", {
          text "50+ damage. If you played a Supporter card from your hand during this turn, this attack does 70 more damage."
          energyCost P, C, C
          onAttack {
            damage 50
            // TODO: Handle supporters not played from hand
            if (bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) {
              damage 70
            }
          }
        }
      };
      case ALCREMIE_V_31:
      return copy(ChampionsPath.ALCREMIE_V_22, this);
      case ALCREMIE_VMAX_32:
      return copy(ChampionsPath.ALCREMIE_VMAX_23, this);
      case ZACIAN_33:
      return basic (this, hp:HP110, type:P, retreatCost:2) {
        weakness M
        move "Metal Armament", {
          text "30 damage. Attach a basic Energy card from your discard pile to this Pokémon."
          energyCost C
          onAttack {
            damage 30
            attachEnergyFrom count:1, basic:true, my.discard, self
          }
        }
        move "Amazing Sword", {
          text "150+ damage. If your opponent has a Pokémon VMAX in play, this attack does 150 more damage."
          energyCost G, P, M
          onAttack {
            damage 150
            if (opp.all.any { it.pokemonVMAX }) damage 150
          }
        }
      };
      case WOOPER_34:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Mud Shot", {
          text "10 damage."
          energyCost F
          onAttack {
            damage 10
          }
        }
        move "Beat", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case QUAGSIRE_35:
      return evolution (this, from:"Wooper", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Beat", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Fickle Impact", {
          text "180 damage. If you have exactly 2, 4, or 6 Prize cards remaining, this attack does nothing."
          energyCost F, C, C
          attackRequirement {
            def prizes = my.prizeCardSet.size()
            assert prizes != 2 && prizes != 4 && prizes != 6 : "You have exactly 2, 4, or 6 Prize cards remaining"
          }
          onAttack {
            damage 180
          }
        }
      };
      case SHUCKLE_36:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Deck Distiller", {
          text " Flip a coin until you get tails. For each heads, discard the top card of your opponent's deck."
          energyCost F
          attackRequirement {
            assert opp.deck : "Opponent's deck is empty"
          }
          onAttack {
            flipUntilTails { if(opp.deck) opp.deck.subList(0, 1).discard() }
          }
        }
        move "Rock Throw", {
          text "50 damage."
          energyCost F, C
          onAttack {
            damage 50
          }
        }
      };
      case REGIROCK_37:
      return basic (this, hp:HP130, type:F, retreatCost:3) {
        weakness G
        move "Rock Tumble", {
          text "40 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C
          onAttack {
            noResistanceDamage 40, defending
          }
        }
        move "Megaton Fall", {
          text "130 damage. This Pokémon does 30 damage to itself."
          energyCost F, F, C
          onAttack {
            damage 130
            damage 30, self
          }
        }
      };
      case RIOLU_38:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness P
        move "Best Punch", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case ZYGARDE_39:
      return basic (this, hp:HP150, type:F, retreatCost:4) {
        weakness G
        move "Beam", {
          text "30 damage."
          energyCost F
          onAttack {
            damage 30
          }
        }
        move "Core Avenger", {
          text "80+ damage. If you have more Prize cards remaining than your opponent, this attack does 80 more damage."
          energyCost F, C, C
          onAttack {
            damage 80
            if (my.prizeCardSet.size() > opp.prizeCardSet.size()) damage 80
          }
        }
      };
      case ROCKRUFF_40:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Tackle", {
          text "10 damage."
          energyCost F
          onAttack {
            damage 10
          }
        }
        move "Rear Kick", {
          text "20 damage."
          energyCost F, C
          onAttack {
            damage 20
          }
        }
      };
      case LYCANROC_41:
      return evolution (this, from:"Rockruff", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Rock Throw", {
          text "40 damage."
          energyCost F
          onAttack {
            damage 40
          }
        }
        move "Sharp Mane", {
          text "70 damage."
          energyCost F, C
          onAttack {
            damage 70
          }
        }
      };
      case COALOSSAL_V_42:
      return basic (this, hp:HP220, type:F, retreatCost:4) {
        weakness G
        move "Searing Flame", {
          text "90 damage. Your opponent's Active Pokémon is now Burned."
          energyCost F, F, C
          onAttack {
            damage 90
            apply BURNED
          }
        }
        move "Boulder Crush", {
          text "180 damage."
          energyCost F, F, F, C
          onAttack {
            damage 180
          }
        }
      };
      case COALOSSAL_VMAX_43:
      return evolution (this, from:"Coalossal V", hp:HP330, type:F, retreatCost:4) {
        weakness G
        move "Eruption Shot", {
          text "40+ damage. Discard the top card of your deck. If that card is an Energy card, this attack does 90 more damage. Then, attach that Energy card to this Pokémon."
          energyCost F
          onAttack {
            damage 40
            if(my.deck) {
              def discarded = my.deck.subList(0, 1).discard().first()
              if (!(discarded instanceof EnergyCard)) return
              damage 90
              attachEnergy self, discarded
            }
          }
        }
        move "G-Max Boulder", {
          text "240 damage."
          energyCost F, F, F, C
          onAttack {
            damage 240
          }
        }
      };
      case ZAMAZENTA_44:
      return basic (this, hp:HP110, type:F, retreatCost:2) {
        weakness P
        move "Metal Armament", {
          text "30 damage. Attach a basic Energy card from your discard pile to this Pokémon."
          energyCost C
          onAttack {
            damage 30
            attachEnergyFrom basic:true, count:1, my.discard, self
          }
        }
        move "Amazing Shield", {
          text "180 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Pokémon VMAX."
          energyCost L, F, M
          onAttack {
            damage 180
            preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.pokemonVMAX }
          }
        }
      };
      case FORRETRESS_45:
      return evolution (this, from:"Pineco", hp:HP120, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Take Down", {
          text "120 damage. This Pokémon does 30 damage to itself."
          energyCost M, C, C
          onAttack {
            damage 120
            damage 30, self
          }
        }
        move "Double KO", {
          text " Both Active Pokémon are Knocked Out."
          energyCost M, M, C, C
          onAttack {
            new Knockout(defending).run(bg)
            new Knockout(self).run(bg)
          }
        }
      };
      case STEELIX_V_46:
      return basic (this, hp:HP250, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Raging Hammer", {
          text "30+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
          energyCost M, C
          onAttack {
            damage 30
            damage self.numberOfDamageCounters * 10
          }
        }
        move "Iron Tackle", {
          text "210 damage. This Pokémon also does 30 damage to itself."
          energyCost M, C, C, C, C
          onAttack {
            damage 210
            damage 30, self
          }
        }
      };
      case BELDUM_47:
      return basic (this, hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Call for Family", {
          text " Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost M
          callForFamily basic:true, 2, delegate
        }
        move "Ram", {
          text "20 damage."
          energyCost M, C
          onAttack {
            damage 20
          }
        }
      };
      case METANG_48:
      return evolution (this, from:"Beldum", hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Metal Claw", {
          text "30 damage."
          energyCost M, C
          onAttack {
            damage 30
          }
        }
        move "Magnetic Blast", {
          text "60 damage."
          energyCost M, C, C
          onAttack {
            damage 60
          }
        }
      };
      case METAGROSS_49:
      return evolution (this, from:"Metang", hp:HP170, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Levitation Field", {
          text "Your Pokémon in play have no Retreat Cost."
          getterA GET_RETREAT_COST, { h ->
            if (h.effect.target.owner == self.owner) h.object = 0
          }
        }
        move "Leg Quake", {
          text "100 damage. If the Defending Pokémon is an Evolution Pokémon, during your opponent's next turn, it can't attack."
          energyCost M, C, C
          onAttack {
            damage 100
            if (defending.realEvolution) cantAttackNextTurn defending
          }
        }
      };
      case JIRACHI_50:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        bwAbility "Dreamy Revelation", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 2 cards of your deck and put 1 of them into your hand. Put the other card back on top of your deck."
          actionA {
            checkLastTurn()
            assert self.active : "$self is not your active Pokémon"
            assert my.deck : "Your deck is empty!"
            powerUsed()
            my.deck.subList(0, 2).select("Card to add to hand?").moveTo hidden:true, my.hand
          }
        }
        move "Amazing Star", {
          text " Search your deck for up to 7 Basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
          energyCost P, F, M
          attackRequirement {
            assert my.deck : "Your deck is empty!"
          }
          onAttack {
            def energies = my.deck.search max:7, cardTypeFilter(BASIC_ENERGY)
            energies.each {
              attachEnergy my.all.select("Attach $it.name to?"), it
            }
            shuffleDeck()
          }
        }
      };
      case LUCARIO_51:
      return evolution (this, from:"Riolu", hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Spike Draw", {
          text "40 damage. Draw a card."
          energyCost M
          onAttack {
            damage 40
            draw 1
          }
        }
        move "Knuckle Impact", {
          text "160 damage. During your next turn, this Pokémon can't attack."
          energyCost M, M, C
          onAttack {
            damage 160
            cantAttackNextTurn self
          }
        }
      };
      case DIALGA_52:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Rewind Time", {
          text " Attach up to 2 [M] Energy cards from your discard pile to 1 of your Pokémon."
          energyCost C
          attackRequirement {
            assert my.discard.filterByEnergyType(M) : "No [M] Energy cards in discard pile"
          }
          onAttack {
            attachEnergyFrom max:2, type:M, my.discard, my.all
          }
        }
        move "Flash of Destruction", {
          text "130 damage. Discard 2 Energy from this Pokémon."
          energyCost M, M, C
          onAttack {
            damage 130
            discardSelfEnergy C, C
          }
        }
      };
      case GALARIAN_STUNFISK_53:
      return basic (this, hp:HP120, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Counterattack", {
          text "If this Pokémon is in the Active Spot and is damaged by an opponent's attack (even if it is Knocked Out), put 3 damage counters on the Attacking Pokémon."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if (!(self.active && ef.attacker.owner != self.owner)) return
              if(!bg.dm().find({it.to==self && it.dmg.value})) return
              bc "$thisAbility activates"
              directDamage 30, ef.attacker
            }
          }
        }
        move "Grip and Squeeze", {
          text "90 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost C, C, C
          onAttack {
            damage 90
            cantRetreat defending
          }
        }
      };
      case MAGEARNA_54:
      return basic (this, hp:HP090, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Overhaul", {
          text " Shuffle your hand into your deck. Then, draw 6 cards."
          energyCost M
          attackRequirement {
            assert my.hand || my.deck : "Both hand and deck are empty"
          }
          onAttack {
            my.hand.moveTo hidden:true, my.deck
            shuffleDeck()
            draw 6
          }
        }
        move "Windup Cannon", {
          text "10+ damage. This attack does 20 more damage for each of your opponent's Benched Pokémon."
          energyCost M, C
          onAttack {
            damage 10
            damage 20 * opp.bench.size()
          }
        }
      };
      case LUGIA_55:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Gust", {
          text "40 damage."
          energyCost C, C
          onAttack {
            damage 40
          }
        }
        move "Wind Pressure", {
          text "250 damage. If your opponent has 5 or fewer cards in their hand, this attack does nothing."
          energyCost C, C, C, C
          attackRequirement {
            assert opp.hand.size() > 5 : "Opponent hand has 5 or fewer cards"
          }
          onAttack {
            if (opp.hand.size() <= 5) return
            damage 250
          }
        }
      };
      case RAYQUAZA_56:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Amazing Burst", {
          text "80x damage. Discard all basic Energy from this Pokémon. This attack does 80 damage for each type of Energy you discarded in this way."
          energyCost G, L, F
          attackRequirement {
            assert self.energyCards.any { it.cardTypes.contains BASIC_ENERGY } : "No Basic Energy attached to $self"
          }
          onAttack {
            Set<Type> energyTypes = []
            CardList discardEnergies = []
            self.energyCards.each {
              if (!it.cardTypes.contains(BASIC_ENERGY)) return
              energyTypes.add it.basicType
              discardEnergies.add it
            }
            damage 80 * energyTypes.size()
            afterDamage {
              discardEnergies.discard()
            }
          }
        }
      };
      case CHATOT_57:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Minor Errand-Running", {
          text " Search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Your deck is empty!"
          }
          onAttack {
            deck.search(max:2, cardTypeFilter(BASIC_ENERGY))
              .showToOpponent("Opponent chose the following Energy from their deck using $thisMove.")
              .moveTo my.hand
            shuffleDeck()
          }
        }
        move "Peck", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
      };
      case TOGEKISS_V_58:
      return basic (this, hp:HP200, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "White Wind", {
          text "20+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 70 more damage."
          energyCost C
          onAttack {
            damage 20
            if (defending.realEvolution) damage 70
          }
        }
        move "Speed Wing", {
          text "130 damage."
          energyCost C, C, C
          onAttack {
            damage 130
          }
        }
      };
      case TOGEKISS_VMAX_59:
      return evolution (this, from:"Togekiss V", hp:HP310, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Max Glide", {
          text "120 damage. You may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C, C
          onAttack {
            damage 120
            if (confirm("Search your deck for up to 2 cards to put in your hand?")) {
              deck.search(min:1, max:2, { true }).moveTo hidden:true, my.hand
              shuffleDeck()
            }
          }
        }
      };
      case TORNADUS_60:
      return basic (this, hp:HP120, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Jet Draft", {
          text "30 damage. Discard a Special Energy from your opponent's Active Pokémon."
          energyCost C
          onAttack {
            damage 30
            discardDefendingSpecialEnergy delegate
          }
        }
        move "Air Slash", {
          text "120 damage. Discard an Energy from this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 120
            discardSelfEnergy C
          }
        }
      };
      case PIKIPEK_61:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case TRUMBEAK_62:
      return evolution (this, from:"Pikipek", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Charging Trumpet", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may look at the top 3 cards of your deck. Attach any number of basic Energy cards you find there to your Pokémon in any way you like. Shuffle the other cards back into your deck."
          onActivate { reason ->
            if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && confirm("Use $thisAbility?")) {
              def peekedCards = my.deck.subList(0, 3)
              def selectedEnergy = peekedCards.select(min:0, max:3, "Select Basic Energies to attach to your Pokémon", { it.cardTypes.contains BASIC_ENERGY })
              selectedEnergy.each { attachEnergy my.all.select("Attach $it.name to?"), it }
              shuffleDeck()
            }
          }
        }
        move "Drill Peck", {
          text "50 damage."
          energyCost C, C, C
          onAttack {
            damage 50
          }
        }
      };
      case TOUCANNON_63:
      return evolution (this, from:"Trumbeak", hp:HP150, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Energy Cutoff", {
          text "60 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost C, C
          onAttack {
            damage 60
            discardDefendingEnergy()
          }
        }
        move "Loop Cannon", {
          text "160 damage. Return 2 Energy attached to this Pokémon to your hand."
          energyCost C, C, C
          onAttack {
            damage 160
            afterDamage {
              // TODO: Make a static method to do this
              if (self.cards.energyCount())
                if (self.cards.energyCount() <= 2) {
                  self.cards.filterByType(ENERGY).moveTo my.hand
                } else {
                  def targetCount = Math.min self.cards.energyCount(), 2
                  def finalCount = 0
                  while (self.cards.energyCount() > 0 && finalCount < targetCount) {
                    def info = "Select Energy to return to your hand."
                    def energy = self.cards.filterByType(ENERGY).select(info)
                    def energyCount = 1
                    if (energy.energyCount() > 1) {
                      def choices = 1..energy.energyCount()
                      def choiceInfo = "How many Energy do you want this card to count as?"
                      energyCount = choose(choices, choiceInfo)
                    }
                    finalCount += energyCount
                    energy.moveTo my.hand
                  }
                }
            }
          }
        }
      };
      case GREAT_BALL_64:
      return copy(EmergingPowers.GREAT_BALL_93, this)
      case SWITCH_65:
      return copy(FireRedLeafGreen.SWITCH_102, this)
      case POKEMON_CATCHER_66:
      return copy (KalosStarterSet.POKEMON_CATCHER_36, this)
      case MOOMOO_CHEESE_67:
      return itemCard (this) {
        text "Heal 30 damage from up to 2 of your Pokémon that have any Energy attached to them."
        onPlay {
          2.times {
            def tar = my.all.findAll { it.energyCards && it.numberOfDamageCounters }
            if (!tar) return
            def pcs = tar.select("Heal 30 damage from?", it == 0)
            if (pcs) heal 30, pcs, TRAINER_CARD
          }
        }
        playRequirement{
          assert my.all.any { it.energyCards && it.numberOfDamageCounters } : "No Pokémon with Energy Cards that have damage"
        }
      };
      case HERO_S_MEDAL_68:
      return pokemonTool (this) {
        text "The Pokémon VMAX this card is attached to gets -100 HP" +
          "and when it is Knocked Out by damage from an opponent's attack" +
          "that player takes 1 fewer Prize card. You can't attach this card" +
          "to a Pokémon VMAX that has 100 HP or less remaining."
        def fromOppAttackEff
        def fromOppAttackFlag
        def hpEff
        def prizeEff
        onPlay { reason ->
          fromOppAttackEff = delayed {
            before KNOCKOUT, self, {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite)
                fromOppAttackFlag = true
            }
            after KNOCKOUT, {
              fromOppAttackFlag = false
            }
          }
          hpEff = getter GET_FULL_HP, self, { holder ->
            if (self.pokemonVMAX) holder.object -= hp(100)
          }
          prizeEff = getter GET_GIVEN_PRIZES, self, { holder ->
            if (self.pokemonVMAX && fromOppAttackFlag && holder.object > 0) {
              bc "$thisCard reduces prizes taken from KOing $self by one."
              holder.object -= 1
            }
          }
        }
        onRemoveFromPlay {
          fromOppAttackEff.unregister()
          hpEff.unregister()
          prizeEff.unregister()
        }
        allowAttach {PokemonCardSet to->
          (!to.pokemonVMAX || to.remainingHP > hp(100))
        }
      };
      case ROCKY_HELMET_69:
      return copy(NobleVictories.ROCKY_HELMET_94, this);
      case BEAUTY_70:
      return supporter (this) {
        text "This card can be played on the first turn of the first player. Draw 2 cards."
        onPlay {
          draw 2
        }
        playRequirement{
          assert my.deck : "Your deck is empty!"
        }
      };
      case ALLISTER_71:
      return supporter (this) {
        text "Draw 3 cards. If you do" +
          "discard up to 3 cards from your hand. (You must discard at least 1 card.)"
        onPlay {
          draw 3
          my.hand.select(min:1, max:3, "Card(s) to discard?").discard()
        }
        playRequirement{
          assert my.deck : "Your deck is empty!"
        }
      };
      case OPAL_72:
      return supporter (this) {
        text "Flip 2 coins. For each heads" +
          "you may search your deck for a card and put it into your hand. Then" +
          "shuffle your deck."
        onPlay {
          def count = 0
          flip 2, { count++ }
          if (count == 0) return
          my.deck.search(min:count, max:count, { true }).moveTo hidden:true, my.hand
          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Your deck is empty!"
        }
      };
      case MARNIE_73:
      return copy(SwordShield.MARNIE_169, this)
      case AROMA_G_ENERGY_74:
      return specialEnergy (this, [[]]) {
        text "This card provides [G] Energy only while this card is attached to a Pokémon. The [G] Pokémon this card is attached to recovers from all Special Conditions and can't be affected by any Special Conditions."
        def spcEff
        onPlay {reason->
          spcEff = delayed {
            before APPLY_SPECIAL_CONDITION, self, {
              if (!self.types.contains(G)) return
              bc "$thisCard.name prevents ${(ef as ApplySpecialCondition).type} on $self"
              prevent()
            }
            after ATTACH_ENERGY, {
              if (self == null || !self.types.contains(G)) return
              clearSpecialCondition self, SRC_SPENERGY
            }
            after ENERGY_SWITCH, {
              if (self == null || !self.types.contains(G)) return
              clearSpecialCondition self, SRC_SPENERGY
            }
          }
        }
        getEnergyTypesOverride {
          if (self != null) return [[G] as Set]
          else return [[] as Set]
        }
        onRemoveFromPlay {
          spcEff.unregsiter()
        }
      };
      case STONE_F_ENERGY_75:
      return specialEnergy (this, [[]]) {
        text "This card provides [F] Energy only while this card is attached to a Pokémon. The [F] Pokémon this card is attached to takes 20 less damage from your opponent's attacks (after applying Weakness and Resistance)."
        def dmgRedEff
        onPlay {reason->
          dmgRedEff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              if (!(ef.attacker.owner != self.owner && self.types.contains(F))) return
              bg.dm().each {if(it.to == self && it.dmg.value && it.notNoEffect) {
                bc "$thisCard.name -20"
                it.dmg -= hp(20)
              }}
            }
          }
        }
        onRemoveFromPlay {
          dmgRedEff.unregister()
        }
        getEnergyTypesOverride {
          if (self != null) return [[F] as Set]
          else return [[] as Set]
        }
      };
      case TWIN_ENERGY_76:
      return copy (RebelClash.TWIN_ENERGY_174, this)
      case ZARUDE_V_77:
      return copy (ZARUDE_V_13, this);
      case AMPHAROS_V_78:
      return copy (AMPHAROS_V_14, this);
      case ALCREMIE_V_79:
      return copy (ALCREMIE_V_31, this);
      case COALOSSAL_V_80:
      return copy (COALOSSAL_V_42, this);
      case STEELIX_V_81:
      return copy (STEELIX_V_46, this);
      case TOGEKISS_V_82:
      return copy (TOGEKISS_V_58, this);
      case BEAUTY_83:
      return copy (BEAUTY_70, this);
      case ALLISTER_84:
      return copy (ALLISTER_71, this);
      case OPAL_85:
      return copy (OPAL_72, this);
      case ALCREMIE_VMAX_86:
      return copy (ALCREMIE_VMAX_32, this);
      case COALOSSAL_VMAX_87:
      return copy (COALOSSAL_VMAX_43, this);
      case TOGEKISS_VMAX_88:
      return copy (TOGEKISS_VMAX_59, this);
      case BEAUTY_89:
      return copy (BEAUTY_70, this);
      case ALLISTER_90:
      return copy (ALLISTER_71, this);
      case OPAL_91:
      return copy (OPAL_72, this);
      case ORANGURU_92:
      return copy (SwordShield.ORANGURU_148, this)
      case HERO_S_MEDAL_93:
      return copy (HERO_S_MEDAL_68, this);
      case CAPE_OF_TOUGHNESS_94:
      return copy (DarknessAblaze.CAPE_OF_TOUGHNESS_160, this)
      default:
      return null;
    }
  }
}
