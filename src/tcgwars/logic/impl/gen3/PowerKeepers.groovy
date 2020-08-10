package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen1.FossilNG;
import tcgwars.logic.impl.gen2.Expedition;
import tcgwars.logic.impl.gen2.Aquapolis;
import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.Dragon;
import tcgwars.logic.impl.gen3.Emerald;
import tcgwars.logic.impl.gen3.UnseenForces;
import tcgwars.logic.impl.gen3.LegendMaker;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;

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
public enum PowerKeepers implements LogicCardInfo {

  AGGRON_1 ("Aggron", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  ALTARIA_2 ("Altaria", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ARMALDO_3 ("Armaldo", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  BANETTE_4 ("Banette", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  BLAZIKEN_5 ("Blaziken", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CHARIZARD_6 ("Charizard", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CRADILY_7 ("Cradily", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DELCATTY_8 ("Delcatty", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GARDEVOIR_9 ("Gardevoir", "9", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  KABUTOPS_10 ("Kabutops", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MACHAMP_11 ("Machamp", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  RAICHU_12 ("Raichu", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SLAKING_13 ("Slaking", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUSCLOPS_14 ("Dusclops", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LANTURN_15 ("Lanturn", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNETON_16 ("Magneton", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAWILE_17 ("Mawile", "17", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  MIGHTYENA_18 ("Mightyena", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  NINETALES_19 ("Ninetales", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  OMASTAR_20 ("Omastar", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PICHU_21 ("Pichu", "21", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  SABLEYE_22 ("Sableye", "22", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  SEVIPER_23 ("Seviper", "23", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  WOBBUFFET_24 ("Wobbuffet", "24", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  ZANGOOSE_25 ("Zangoose", "25", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  ANORITH_26 ("Anorith", "26", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CACTURNE_27 ("Cacturne", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CHARMELEON_28 ("Charmeleon", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  COMBUSKEN_29 ("Combusken", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GLALIE_30 ("Glalie", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KIRLIA_31 ("Kirlia", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LAIRON_32 ("Lairon", "32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MACHOKE_33 ("Machoke", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MEDICHAM_34 ("Medicham", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  METANG_35 ("Metang", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  NUZLEAF_36 ("Nuzleaf", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SEALEO_37 ("Sealeo", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SHARPEDO_38 ("Sharpedo", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SHELGON_39 ("Shelgon", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VIBRAVA_40 ("Vibrava", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VIGOROTH_41 ("Vigoroth", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ARON_42 ("Aron", "42", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BAGON_43 ("Bagon", "43", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BALTOY_44 ("Baltoy", "44", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BELDUM_45 ("Beldum", "45", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  CACNEA_46 ("Cacnea", "46", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CARVANHA_47 ("Carvanha", "47", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  CHARMANDER_48 ("Charmander", "48", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHINCHOU_49 ("Chinchou", "49", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DUSKULL_50 ("Duskull", "50", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KABUTO_51 ("Kabuto", "51", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LILEEP_52 ("Lileep", "52", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MACHOP_53 ("Machop", "53", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGNEMITE_54 ("Magnemite", "54", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MEDITITE_55 ("Meditite", "55", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  OMANYTE_56 ("Omanyte", "56", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_57 ("Pikachu", "57", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  POOCHYENA_58 ("Poochyena", "58", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  RALTS_59 ("Ralts", "59", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SEEDOT_60 ("Seedot", "60", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SHUPPET_61 ("Shuppet", "61", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SKITTY_62 ("Skitty", "62", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SLAKOTH_63 ("Slakoth", "63", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNORUNT_64 ("Snorunt", "64", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SPHEAL_65 ("Spheal", "65", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWABLU_66 ("Swablu", "66", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TORCHIC_67 ("Torchic", "67", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TRAPINCH_68 ("Trapinch", "68", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  VULPIX_69 ("Vulpix", "69", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  WYNAUT_70 ("Wynaut", "70", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BATTLE_FRONTIER_71 ("Battle Frontier", "71", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DRAKE_S_STADIUM_72 ("Drake's Stadium", "72", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ENERGY_RECYCLE_SYSTEM_73 ("Energy Recycle System", "73", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_REMOVAL_2_74 ("Energy Removal 2", "74", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SWITCH_75 ("Energy Switch", "75", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GLACIA_S_STADIUM_76 ("Glacia's Stadium", "76", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  GREAT_BALL_77 ("Great Ball", "77", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MASTER_BALL_78 ("Master Ball", "78", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PHOEBE_S_STADIUM_79 ("Phoebe's Stadium", "79", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  PROFESSOR_BIRCH_80 ("Professor Birch", "80", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SCOTT_81 ("Scott", "81", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SIDNEY_S_STADIUM_82 ("Sidney's Stadium", "82", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  STEVEN_S_ADVICE_83 ("Steven's Advice", "83", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CLAW_FOSSIL_84 ("Claw Fossil", "84", Rarity.COMMON, [TRAINER, ITEM]),
  MYSTERIOUS_FOSSIL_85 ("Mysterious Fossil", "85", Rarity.COMMON, [TRAINER, ITEM]),
  ROOT_FOSSIL_86 ("Root Fossil", "86", Rarity.COMMON, [TRAINER, ITEM]),
  DARKNESS_ENERGY_87 ("Darkness Energy", "87", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_88 ("Metal Energy", "88", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  MULTI_ENERGY_89 ("Multi Energy", "89", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  CYCLONE_ENERGY_90 ("Cyclone Energy", "90", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  WARP_ENERGY_91 ("Warp Energy", "91", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ABSOL_EX_92 ("Absol ex", "92", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _DARKNESS_]),
  CLAYDOL_EX_93 ("Claydol ex", "93", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _PSYCHIC_]),
  FLYGON_EX_94 ("Flygon ex", "94", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
  METAGROSS_EX_95 ("Metagross ex", "95", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
  SALAMENCE_EX_96 ("Salamence ex", "96", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
  SHIFTRY_EX_97 ("Shiftry ex", "97", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _DARKNESS_]),
  SKARMORY_EX_98 ("Skarmory ex", "98", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _METAL_]),
  WALREIN_EX_99 ("Walrein ex", "99", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  FLAREON_STAR_100 ("Flareon Star", "100", Rarity.HOLORARE, [POKEMON_STAR, POKEMON, BASIC, _FIRE_]),
  JOLTEON_STAR_101 ("Jolteon Star", "101", Rarity.HOLORARE, [POKEMON_STAR, POKEMON, BASIC, _LIGHTNING_]),
  VAPOREON_STAR_102 ("Vaporeon Star", "102", Rarity.HOLORARE, [POKEMON_STAR, POKEMON, BASIC, _WATER_]),
  GRASS_ENERGY_103 ("Grass Energy", "103", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_104 ("Fire Energy", "104", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_105 ("Water Energy", "105", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_106 ("Lightning Energy", "106", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_107 ("Psychic Energy", "107", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]),
  FIGHTING_ENERGY_108 ("Fighting Energy", "108", Rarity.HOLORARE, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PowerKeepers(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POWER_KEEPERS;
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
      case AGGRON_1:
      return evolution (this, from:"Lairon", hp:HP110, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        pokePower "Terraforming", {
          text "Once during your turn (before your attack), you may look at the top 5 cards from your deck and put them back on top of your deck in any order. This power can't be used if Aggron is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.deck : "Your deck is empty"
            powerUsed()
            def cardsNum = Math.min(5, my.deck.size())
            def list=rearrange(my.deck.subList(0, cardsNum), "Rearrange the top ${cardsNum} cards in your deck.")
            my.deck.setSubList(0, list)
          }
        }
        move "Metal Claw", {
          text "50 damage."
          energyCost C, C, C
          onAttack {
            damage 50
          }
        }
        move "Mix-Up", {
          text "70 damage. Your opponent discards the top card of his or her deck."
          energyCost M, M, C, C
          onAttack {
            damage 70
            if (opp.deck) {
              opp.deck.subList(0,1).discard()
            }
          }
        }
      };
      case ALTARIA_2:
      return evolution (this, from:"Swablu", hp:HP080, type:C, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokeBody "Synergy Effect", {
          text "If Drake's Stadium is in play, remove 1 damage counter from Altaria between turns."
          delayedA {
            before BETWEEN_TURNS, {
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Drake's Stadium") {
                heal 10, self, SRC_ABILITY
              }
            }
          }
        }
        move "Surprise", {
          text "30 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost W, C
          onAttack {
            damage 30
            afterDamage { astonish() }
          }
        }
        move "Gust", {
          text "50 damage."
          energyCost L, C, C
          onAttack {
            damage 50
          }
        }
      };
      case ARMALDO_3:
      return evolution (this, from:"Anorith", hp:HP120, type:F, retreatCost:3) {
        weakness G
        move "Rock Blast", {
          text "Discard up to 5 [F] Energy cards attached to Armaldo. For each Energy card you discarded, choose an opponent's Pokémon in play and this attack does 20 damage to those Pokémon. (You may choose the same Pokémon more than once.) This attack's damage isn't affected by Weakness or Resistance."
          energyCost F
          attackRequirement {
            assert self.cards.energyCount(F) : "You have no Energy cards attached that provide [F] Energy"
          }
          onAttack {
            //TODO: This could be made into a static, other cards do similar attacks with other types.
            def selected = self.cards.filterByEnergyType(F).select(min:1, max:5, "Select up to 5 [F] Energy cards to discard; for each card discarded, this attack will do 20 damage to 1 opponent's Pokemon of your choosing (you can pick the same Pokémon more than once.)")
            def i = 0
            def selNum = selected.size()
            while (i++ < selNum){
              noWrDamage ( 20, opp.all.select("Deal 20 damage to which Pokemon? ${i-1}/${selNum} Pokémon selected.") )
            }
            afterDamage {
              selected.discard()
            }
          }
        }
        move "Mach Claw", {
          text "60 damage. This attack's damage isn't affected by Resistance."
          energyCost C, C, C
          onAttack {
            damage 60
            dontApplyResistance()
          }
        }
      };
      case BANETTE_4:
      return evolution (this, from:"Shuppet", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Grudge", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Prize card your opponent has taken."
          energyCost P, C
          onAttack {
            damage 20+10*opp.prizeCardSet.takenCount
          }
        }
        move "Bench Manipulation", {
          text "40x damage. Your opponent flips a number of coins equal to the number of his or her Benched Pokémon. This attack does 40 damage times the number of tails. This attack's damage isn't affected by Weakness or Resistance."
          energyCost P, P, C
          attackRequirement {
            assertOppBench()
          }
          onAttack {
            //TODO: Opponent flips, "Will" (CEC) should not be usable here, or by Fliptini effects (that allow to reflip *your* flips).
            flip opp.bench.size(), {}, { noWrDamage 40, defending }
          }
        }
      };
      case BLAZIKEN_5:
      return evolution (this, from:"Combusken", hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokePower "Firestarter", {
          text "Once during your turn (before your attack), you may attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon. This power can't be used if Blaziken is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.bench : "No benched Pokemon"
            assert my.discard.filterByEnergyType(R) : "You have no [R] Energy cards in your discard pile"
            powerUsed()

            attachEnergyFrom(type: R, my.discard, my.bench)
          }
        }
        move "Fire Stream", {
          text "50 damage. Discard a [R] Energy card attached to Blaziken. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, C, C
          onAttack {
            damage 50
            opp.bench.each {
              damage 10, it
            }
            afterDamage {
              discardSelfEnergy(R)
            }
          }
        }
      };
      case CHARIZARD_6:
      return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:2) {
        weakness W
        move "Combustion", {
          text "30 damage."
          energyCost R
          onAttack {
            damage 30
          }
        }
        move "Bursting Inferno", {
          text "50 damage. Each Defending Pokémon is now Burned."
          energyCost R, R, C, C
          onAttack {
            damage 50
            applyAfterDamage BURNED
          }
        }
      };
      case CRADILY_7:
      return evolution (this, from:"Lileep", hp:HP110, type:G, retreatCost:2) {
        weakness R
        pokePower "Evolutionary Call", {
          text "Once during your turn, when you play Cradily from your hand to evolve 1 of your Pokémon, you may search your deck for up to 3 in any combination of Basic Pokémon or Evolution cards. Show them to your opponent and put them into your hand. Shuffle your deck afterward."
          onActivate {r ->
            if (r == PLAY_FROM_HAND && my.deck && confirm("Use Evolutionary Call?")) {
              powerUsed()

              my.deck.search(max: 3, "Search your deck for up to 3 Basic/Evolutions", {it.cardTypes.pokemon}).showToOpponent("Your opponent used Evolutionary Call.").moveTo(my.hand)

              shuffleDeck()
            }
          }
        }
        move "Poison Ring", {
          text "50 damage. The Defending Pokémon is now Poisoned. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, G, C
          onAttack {
            damage 50
            applyAfterDamage POISONED
            cantRetreat defending
          }
        }
      };
      case DELCATTY_8:
      return evolution (this, from:"Skitty", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "Energy Draw", {
          text "Once during your turn (before your attack), you may discard 1 Energy card from your hand. Then draw up to 3 cards from your deck. This power can't be used if Delcatty is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.hand.filterByType(ENERGY) : "No Energy in hand"
            //Using LV.X Compendium Ruling instead of the EX: You can discard even if you don't have cards in deck.
            powerUsed()

            my.hand.filterByType(ENERGY).select("Discard").discard()
            if (my.deck){
              def maxDraw = Math.min(3, my.deck.size())
              draw choose(1..maxDraw, "Draw how many cards?")
            }
          }
        }
        move "Max Energy Source", {
          text "10x damage. Does 10 damage times the amount of Energy attached to all of your Active Pokémon."
          energyCost C
          onAttack {
            damage 10*self.cards.energyCount(C)
          }
        }
      };
      case GARDEVOIR_9:
      return evolution (this, from:"Kirlia", hp:HP100, type:P, retreatCost:2) {
        weakness P
        pokePower "Psy Shadow", {
          text "Once during your turn (before your attack), you may search your deck for a [P] Energy card and attach it to 1 of your Pokémon. Put 2 damage counters on that Pokémon. Shuffle your deck afterward. This power can't be used if Gardevoir is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.deck : "Deck is empty"
            powerUsed()

            my.deck.search(max: 1, "Search for a [P] Energy card to attach to one of your Pokemon.", {Card card -> card.asEnergyCard().containsTypePlain(P)}).each {
              def tar = my.all.select("Attach $it to? That Pokemon will receive 2 damage counters.")
              attachEnergy(tar, it)
              directDamage 20, tar, SRC_ABILITY
            }
            shuffleDeck()
          }
        }
        move "Energy Burst", {
          text "10x damage. Does 10 damage times the total amount of Energy attached to Gardevoir and the Defending Pokémon."
          energyCost P
          onAttack {
            damage 10 * (self.cards.energyCount(C) + defending.cards.energyCount(C))
          }
        }
      };
      case KABUTOPS_10:
      return evolution (this, from:"Kabuto", hp:HP110, type:F, retreatCost:2) {
        weakness G
        pokeBody "Primal Stare", {
          text "As long as Kabutops is your Active Pokémon, your opponent can't play any Basic Pokémon or Evolution cards from his or her hand to evolve his or her Active Pokémon."
          delayedA {
            //TODO: Prevent Baby Evolution from happening.
            before EVOLVE_STANDARD, {
              if (ef.pokemonToBeEvolved.owner != self.owner && ef.pokemonToBeEvolved.active && self.active) {
                wcu "Primal Stare prevents evolving your Active Pokémon"
                prevent()
              }
            }
          }
        }
        move "Luring Antenna", {
          text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost F, C
          onAttack {
            if(opp.bench && confirm("Switch 1 of your opponent's Benched Pokémon with the Defending Pokémon?")){
              def target = opp.bench.select("Select the new Active Pokémon.")
              sw2(target)
            }
            damage 20
          }
        }
        move "Blinding Scythe", {
          text "60 damage."
          energyCost F, F, C
          onAttack {
            damage 60
          }
        }
      };
      case MACHAMP_11:
      return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
        weakness P
        pokeBody "Overzealous", {
          text "If your opponent has any Pokémon-ex in play, each of Machamp's attacks does 30 more damage to the Defending Pokémon."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if(ef.attacker == self && opp.all.any{it.EX}){
                bg.dm().each {
                  if (it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Overzealous +30"
                    it.dmg += hp(30)
                  }
                }
              }
            }
          }
        }
        move "Brick Smash", {
          text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost F, C
          //TODO: Check the Hidden Legends Machamp working as a reprint of this one. An errata was applied, so this attack applies Weakness.
          onAttack {
            noResistanceOrAnyEffectDamage(40, defending)
          }
        }
        move "Cross Chop", {
          text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 30 more damage."
          energyCost F, C, C, C
          onAttack {
            damage 60
            flip { damage 30 }
          }
        }
      };
      case RAICHU_12:
      return evolution (this, from:"Pikachu", hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Plasma", {
          text "10 damage. Search your discard pile for a [L] Energy card and attach it to Raichu."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              attachEnergyFrom(type: L, my.discard, self)
            }
          }
        }
        move "Thunderbolt", {
          text "100 damage. Discard all Energy cards attached to Raichu."
          energyCost L, L, C
          onAttack {
            damage 100
            afterDamage {
              discardAllSelfEnergy(null)
            }
          }
        }
      };
      case SLAKING_13:
      return evolution (this, from:"Vigoroth", hp:HP120, type:C, retreatCost:3) {
        weakness F
        pokeBody "Lazy", {
          text "As long as Slaking is your Active Pokémon, your opponent's Pokémon can't use any Poké-Powers."
          getterA IS_ABILITY_BLOCKED, { Holder h->
            if (self.active && h.effect.target.owner == self.owner.opposite && h.effect.ability instanceof PokePower) {
              h.object=true
            }
          }
          //TODO: Is this needed here?
          getterA IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
            if (self.active && h.effect.target.owner == self.owner.opposite) {
              h.object=true
            }
          }
          onActivate {
            new CheckAbilities().run(bg)
          }
          onDeactivate {
            new CheckAbilities().run(bg)
          }
        }
        move "Critical Move", {
          text "100 damage. Discard a basic Energy card attached to Slaking or this attack does nothing. Slaking can't attack during your next turn."
          energyCost C, C, C, C
          attackRequirement {
            assert self.cards.filterByType(BASIC_ENERGY) : "$self has no Basic Energy attached"
          }
          onAttack {
            if(self.cards.filterByType(BASIC_ENERGY)){
              damage 100
              afterDamage {
                self.cards.filterByType(BASIC_ENERGY).select("Discard a basic energy from $self.").discard()
                cantAttackNextTurn(self)
              }
            }
          }
        }
      };
      case DUSCLOPS_14:
      return evolution (this, from:"Duskull", hp:HP080, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Dark Mind", {
          text "20 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, C
          onAttack {
            damage 20
            if (opp.bench) {
              damage 20, opp.bench.select()
            }
          }
        }
        move "Mysterious Light", {
          text "50 damage. If Phoebe's Stadium is in play, the Defending Pokémon is now Confused."
          energyCost P, C, C
          onAttack {
            damage 50
            if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Phoebe's Stadium") {
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case LANTURN_15:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
        weakness F
        pokePower "Energy Grounding", {
          text "Once during your opponent's turn, when any of your Pokémon is Knocked Out by your opponent's attacks, you may use this power. Choose a basic Energy card discarded from the Knocked Out Pokémon and attach it to Lanturn. You can't use more than 1 Energy Grounding Poké-Power each turn."
          delayedA{
            before KNOCKOUT, {
              if (bg.em().retrieveObject("Energy_Grounding") != bg.turnCount && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && ef.pokemonToBeKnockedOut != self && ef.pokemonToBeKnockedOut.cards.filterByType(BASIC_ENERGY).energyCount(C)) {
                if (confirm("Move an energy from ${ef.pokemonToBeKnockedOut} to $self?", self.owner)) {
                  bg.em().storeObject("Energy_Grounding", bg.turnCount)
                  moveEnergy(basic:true, playerType: self.owner, ef.pokemonToBeKnockedOut, self)
                }
              }
            }
          }
        }
        move "Lightning Strike", {
          text "50 damage. You may discard all [L] Energy attached to Lanturn. If you do, this attack's base damage is 90 instead of 50."
          energyCost L, L, C
          onAttack {
            damage 50
            if (confirm("Discard all [L] Energy?")) {
              damage 40
              afterDamage { discardAllSelfEnergy(L) } //TODO: Handle in the static.
            }
          }
        }
      };
      case MAGNETON_16:
      return evolution (this, from:"Magnemite", hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Magnetic Field", {
          text "Once during your turn (before your attack), if you have basic Energy cards in your discard pile, you may discard any 1 card from your hand. Then search for up to 2 basic Energy cards from your discard pile, show them to your opponent, and put them into your hand. You can't return the card you first discarded to your hand in this way. This power can't be used if Magneton is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.discard.filterByType(BASIC_ENERGY) : "No Basic Energy cards in your discard pile."
            assert my.hand : "You have no cards in your hand"
            powerUsed()

            def toDiscard = my.hand.select("Select one card to discard.")

            my.discard.filterByType(BASIC_ENERGY).select(min: 1, max: 2, "Select up to 2 Basic Energy scards to add to your hand.").moveTo(my.hand)

            toDiscard.discard()

          }
        }
        move "Magnetic Force", {
          text "10x damage. Does 10 damage times the amount of Energy attached to all of your Pokémon (including Magneton)."
          energyCost L, C
          onAttack {
            def amount = 0
            my.all.each {
              amount += 10 * it.cards.energyCount(C)
            }
            damage amount
          }
        }
      };
      case MAWILE_17:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic:true, 1, delegate)
        }
        move "Pull Away", {
          text "20 damage. If your opponent has 5 or more cards in his or her hand, your opponent discards a number of cards until your opponent has 4 cards left in his or her hand."
          energyCost C, C
          onAttack {
            damage 20

            afterDamage{
              if (opp.hand.size() >= 5) {
                opp.hand.oppSelect(min: opp.hand.size()-4, max: opp.hand.size()-4, "Discard cards until you have 4 left in your hand").discard()
              }
            }
          }
        }
      };
      case MIGHTYENA_18:
      return evolution (this, from:"Poochyena", hp:HP070, type:D, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Plunder", {
          text "30 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
          energyCost C, C
          onAttack {
            if (defending.cards.filterByType(TRAINER)) {
              defending.cards.filterByType(TRAINER).discard()
            }
            damage 30
          }
        }
        move "Dark Burst", {
          text "50+ damage. If Sidney's Stadium is in play, this attack does 50 damage plus 20 more damage."
          energyCost D, D, C
          onAttack {
            damage 50
            if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Sidney's Stadium") {
              damage 20
            }
          }
        }
      };
      case NINETALES_19:
      return evolution (this, from:"Vulpix", hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Ninetales by your opponent's Pokémon-ex."
          delayedA {
            before null, self, Source.ATTACK, {
              if (self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                bc "Safeguard prevents effect"
                prevent()
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.owner != self.owner && ef.attacker.EX) {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    it.dmg = hp(0)
                    bc "Safeguard prevents damage"
                  }
                }
              }
            }
          }
        }
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
        move "Will-o'-the-wisp", {
          text "50 damage."
          energyCost R, C, C
          onAttack {
            damage 50
          }
        }
      };
      case OMASTAR_20:
      return evolution (this, from:"Omanyte", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Pull Down", {
          text "If your opponent has any Evolved Pokémon in play, remove the highest Stage Evolution card from each of them and put those cards back into his or her hand."
          energyCost C
          attackRequirement {
            assert opp.all.any{ it.evolution } : "Opponent does not have any Evolved Pokemon in play."
          }
          onAttack {
            opp.all.findAll { it.evolution }.each {
              def top = it.topPokemonCard
              //
              // [Temporary LV.X workaround]
              if (top.cardTypes.is(LEVEL_UP) && it.cards.filterByType(POKEMON).size() > 2){
                bc "${top}'s Level-Up card will be moved wherever the top evolution ends up at."
                moveCard(top, opp.hand)
                devolve(it, top)
                top = it.topPokemonCard
              }
              // [End of LV.X workaround] TODO: Remove this when no longer needed
              //
              bc "$top Devolved"
              moveCard(top, opp.hand)
              devolve(it, top)
            }
          }
        }
        move "Hydrocannon", {
          text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Omastar but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost C, C
          onAttack {
            damage 30
            extraEnergyDamage(2, hp(20), W, thisMove)
          }
        }
      };
      case PICHU_21:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
          actionA {
            checkCanBabyEvolve("Pikachu", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Pikachu", self)
          }
        }
        move "Cry for Help", {
          text "Search your deck for a [L] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost L
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def selected = deck.search (max: 1, "Search for a [L] Pokemon (excluding Pokemon-ex) to put into your hand.", {
              (it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(L) && !it.asPokemonCard().cardTypes.is(EX))
            }).moveTo(my.hand)
            shuffleDeck()
          }
        }
      };
      case SABLEYE_22:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        resistance C, MINUS30
        pokeBody "Synergy Effect", {
          text "If Phoebe's Stadium is in play, prevent all damage done to Sableye by attacks from your opponent's Pokémon-ex."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.EX && bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Phoebe's Stadium") {
                bg.dm().each {
                  if (it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "Synergy Effect prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
        }
        move "Down Draw", {
          text "Draw 2 cards from the bottom of your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "No cards in deck"
          }
          onAttack {
            if (my.deck) {
              def drawStart = Math.max(0, my.deck.size() - 2)
              def cardsDrawn = my.deck.size() - drawStart
              my.deck.subList(drawStart, my.deck.size()).moveTo(hidden:true, my.hand)
              bc "${my.owner.getPlayerUsername(bg)} drew ${cardsDrawn} cards from the bottom of their deck."
            }
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost P, C
          onAttack {
            swiftDamage(20, opp.all.select())
          }
        }
      };
      case SEVIPER_23:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Sharp Fang", {
          text "10 damage."
          energyCost G
          onAttack {
            damage 10
          }
        }
        move "Toxic", {
          text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, C, C
          onAttack {
            apply POISONED
            extraPoison 1
          }
        }
      };
      case WOBBUFFET_24:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Wobbuffet by your opponent's Pokémon-ex."
          delayedA {
            before null, self, Source.ATTACK, {
              if (self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                bc "Safeguard prevents effect"
                prevent()
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.EX) {
                bg.dm().each {
                  if(it.to == self && it.dmg.value && it.notNoEffect) {
                    it.dmg = hp(0)
                    bc "Safeguard prevents damage"
                  }
                }
              }
            }
          }
        }
        move "Flip Over", {
          text "50 damage. Wobbuffet does 10 damage to itself, and don't apply Weakness and Resistance to this damage."
          energyCost P, C, C
          onAttack {
            damage 50, defending
            noWrDamage 10, self
          }
        }
      };
      case ZANGOOSE_25:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokeBody "Thick Skin", {
          text "Zangoose can't be affected by any Special Conditions."
          delayedA {
            before APPLY_SPECIAL_CONDITION, self, {
              bc "$self is thick Skinned!"
              prevent()
            }
          }
          onActivate{
            if (self.specialConditions) {
              bc "${self}'s Thick Skin clears all Special Conditions from them."
              clearSpecialCondition(self, SRC_ABILITY)
            }
          }
        }
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic:true, 2, delegate)
        }
        move "Sharp Claws", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case ANORITH_26:
      return evolution (this, from:"Claw Fossil", hp:HP070, type:F, retreatCost:1) {
        weakness G
        pokeBody "Solid Shell", {
          text "Any damage done to Anorith by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  bc "Solid Shell -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Fury Cutter", {
          text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 30 more damage. If all of them are heads, this attack does 10 damage plus 50 more damage."
          energyCost F, C
          onAttack {
            damage 10
            flip 3,{},{}, [ 1:{damage 10}, 2:{damage 30}, 3:{damage 50} ]
          }
        }
      };
      case CACTURNE_27:
      return evolution (this, from:"Cacnea", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Poison Structure", {
          text "Once during your turn (before your attack), if Sidney's Stadium is in play, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. This power can't be used if Cacturne is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Sidney's Stadium") : "Sidney's Stadium is not in play"
            powerUsed()
            apply POISONED, opp.active, SRC_ABILITY
          }
        }
        move "Pin Missile", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost C, C, C
          onAttack {
            flip 4, { damage 20 }
          }
        }
      };
      case CHARMELEON_28:
      return evolution (this, from:"Charmander", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Scary Face", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack or retreat during your opponent's next turn."
          energyCost C
          onAttack {
            flip {
              cantRetreat defending
              cantAttackNextTurn defending
            }
          }
        }
        move "Flame Tail", {
          text "50 damage."
          energyCost R, R, C
          onAttack {
            damage 50
          }
        }
      };
      case COMBUSKEN_29:
      return evolution (this, from:"Torchic", hp:HP080, type:R, retreatCost:1) {
        weakness W
        pokeBody "Natural Cure", {
          text "When you attach a [R] Energy card from your hand to Combusken, remove all Special Conditions from Combusken."
          delayedA {
            after ATTACH_ENERGY, self, {
              if(ef.reason==PLAY_FROM_HAND && ef.card instanceof BasicEnergyCard && ef.card.basicType == R){
                bc "Natural Cure clears all Special Conditions from ${self}."
                clearSpecialCondition(self, SRC_ABILITY)
              }
            }
          }
        }
        move "Lunge", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          onAttack {
            flip { damage 50 }
          }
        }
      };
      case GLALIE_30:
      return evolution (this, from:"Snorunt", hp:HP080, type:W, retreatCost:1) {
        weakness M
        pokeBody "Synergy Effect", {
          text "If Glacia's Stadium is in play, any damage done to Glalie by attacks from your opponent's Pokémon is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.owner != self.owner && bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Glacia's Stadium") {
                bg.dm().each {
                  if (it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "Synergy Effect -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
        }
        move "Powder Snow", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost W, C
          onAttack {
            damage 20
            applyAfterDamage ASLEEP
          }
        }
        move "Double-edge", {
          text "60 damage. Glalie does 10 damage to itself."
          energyCost W, C, C
          onAttack {
            damage 60
            damage 10, self
          }
        }
      };
      case KIRLIA_31:
      return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Dream Eater", {
          text "50 damage. If the Defending Pokémon is not Asleep, this attack does nothing."
          energyCost P, C
          attackRequirement {
            assert defending.isSPC(ASLEEP) : "Your opponent's Active Pokémon is not Asleep"
          }
          onAttack {
            if (defending.isSPC(ASLEEP)) {
              damage 50
            }
          }
        }
      };
      case LAIRON_32:
      return evolution (this, from:"Aron", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Granite Head", {
          text "20 damage. During your opponent's next turn, any damage done to Lairon by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost M, C
          onAttack {
            damage 20
            reduceDamageNextTurn(hp(10), thisMove)
          }
        }
        move "Stomp", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost C, C, C
          onAttack {
            damage 30
            flip { damage 20 }
          }
        }
      };
      case MACHOKE_33:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Steady Punch", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
        move "Mega Kick", {
          text "50 damage."
          energyCost F, C, C
          onAttack {
            damage 50
          }
        }
      };
      case MEDICHAM_34:
      return evolution (this, from:"Meditite", hp:HP080, type:F, retreatCost:1) {
        weakness P
        pokeBody "Vigorous Aura", {
          text "As long as Medicham is your Active Pokémon, attacks by each player's Active Pokémon do 10 more damage to any Active Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (self.active) {
                bg.dm().each {
                  if (it.to.active && it.dmg.value) {
                    bc "Vigorous Aura +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
        }
        move "Punch", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Rolling Kick", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost F, F, C
          onAttack {
            damage 40
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case METANG_35:
      return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokeBody "Clear Body", {
          text "Metang can't be affected by any Special Conditions."
          delayedA {
            before APPLY_SPECIAL_CONDITION, self, {
              bc "Clear Body prevents Special Conditions"
              prevent()
            }
          }
          onActivate{
            if (self.specialConditions) {
              bc "Clear Body removes existing Special Conditions from $self."
              clearSpecialCondition(self, SRC_ABILITY)
            }
          }
        }
        move "Extra Comet Punch", {
          text "30+ damage. During your next turn, Extra Comet Punch does 30 damage plus 30 more damage."
          energyCost M, C
          onAttack {
            damage 30
            increasedBaseDamageNextTurn("Extra Comet Punch", hp(30))
          }
        }
      };
      case NUZLEAF_36:
      return evolution (this, from:"Seedot", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Fake Out", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            damage 10
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Gentle Slap", {
          text "40 damage."
          energyCost D, C, C
          onAttack {
            damage 40
          }
        }
      };
      case SEALEO_37:
      return evolution (this, from:"Spheal", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Ice Beam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case SHARPEDO_38:
      return evolution (this, from:"Carvanha", hp:HP070, type:D, retreatCost:0) {
        weakness G
        resistance P, MINUS30
        move "Tight Jaw", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost D, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Darkness Charge", {
          text "50 damage. Put 1 damage counter on Sharpedo."
          energyCost D, C, C
          onAttack {
            damage 50
            directDamage 10, self
          }
        }
      };
      case SHELGON_39:
      return evolution (this, from:"Bagon", hp:HP080, type:C, retreatCost:2) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Shelgon."
          energyCost R, C
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
        move "Rolling Tackle", {
          text "40 damage."
          energyCost W, C, C
          onAttack {
            damage 40
          }
        }
      };
      case VIBRAVA_40:
      return evolution (this, from:"Trapinch", hp:HP080, type:C, retreatCost:1) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        move "Ram", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Dragonbreath", {
          text "60 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, L, C
          onAttack {
            flip {
              damage 60
              applyAfterDamage PARALYZED
            }
          }
        }
      };
      case VIGOROTH_41:
      return evolution (this, from:"Slakoth", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokeBody "Strikes Back", {
          text "If Vigoroth is your Active Pokémon and is damaged by an opponent's attack (even if Vigoroth is Knocked Out), put 1 damage counter on the Attacking Pokémon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({ it.to==self && it.dmg.value })) {
                directDamage(10, ef.attacker, Source.SRC_ABILITY)
              }
            }
          }
        }
        move "Ambush", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
      };
      case ARON_42:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Dig Deep", {
          text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.find(cardTypeFilter(ENERGY)) : "No Energies in your discard pile."
          }
          onAttack {
            my.discard.findAll(cardTypeFilter(ENERGY)).select().showToOpponent("Your opponent used Dig Deep.").moveTo(my.hand)
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost M, C
          onAttack {
            damage 20
          }
        }
      };
      case BAGON_43:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        move "Retaliate", {
          text "10x damage. Does 10 damage times the number of damage counters on Bagon."
          energyCost C
          attackRequirement {
            assert self.numberOfDamageCounters : "$self has no damage counters on them."
          }
          onAttack {
            damage 10 * self.numberOfDamageCounters
          }
        }
      };
      case BALTOY_44:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psybeam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          onAttack {
            damage 10
            flip { applyAfterDamage CONFUSED }
          }
        }
        move "Spinning Attack", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case BELDUM_45:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Magnetic Lines", {
          text "10 damage. Flip a coin. If heads, move a basic Energy card from the Defending Pokémon to another of your opponent's Pokémon. (Ignore this effect if your opponent has only 1 Pokémon.)"
          energyCost M
          onAttack {
            damage 10
            afterDamage {
              if (opp.bench) {
                flip {
                  moveEnergy(basic: true, defending, opp.bench)
                }
              }
            }
          }
        }
      };
      case CACNEA_46:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost C
          onAttack {
            swiftDamage(10, opp.all.select())
          }
        }
      };
      case CARVANHA_47:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness G
        resistance P, MINUS30
        pokeBody "Rough Skin", {
          text "If Carvanha is your Active Pokémon and is damaged by an opponent's attack (even if Carvanha is Knocked Out), put 1 damage counter on the Attacking Pokémon."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({ it.to==self && it.dmg.value })) {
                directDamage(10, ef.attacker, Source.SRC_ABILITY)
              }
            }
          }
        }
        move "Gnaw", {
          text "20 damage."
          energyCost D, C
          onAttack {
            damage 20
          }
        }
      };
      case CHARMANDER_48:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
      };
      case CHINCHOU_49:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Positive Ion", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost L
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
        move "Negative Ion", {
          text "10 damage. During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 10 (before applying Weakness and Resistance)."
          energyCost C, C
          onAttack {
            damage 10
            reduceDamageFromDefendingNextTurn(hp(10),thisMove,defending)
          }
        }
      };
      case DUSKULL_50:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost P, C
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case KABUTO_51:
      return evolution (this, from:"Mysterious Fossil", hp:HP060, type:F, retreatCost:2) {
        weakness G
        move "Fast Evolution", {
          text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement { assert my.deck : "Deck is empty" }
          onAttack {
            my.deck.search(max: 1, "Search for an evolution", cardTypeFilter(EVOLUTION)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost F, C
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case LILEEP_52:
      return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Surprise", {
          text "20 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost G, C
          onAttack {
            damage 20
            afterDamage { astonish() }
          }
        }
        move "Acid", {
          text "40 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C, C
          onAttack {
            damage 40
            cantRetreat defending
          }
        }
      };
      case MACHOP_53:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Smash Punch", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          onAttack {
            flip { damage 20 }
          }
        }
        move "Submission", {
          text "30 damage. Machop does 10 damage to itself."
          energyCost F, C
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case MAGNEMITE_54:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Ram", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Spark", {
          text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          onAttack {
            damage 20
            if (opp.bench) {
              damage 10, opp.bench.select("Deal 10 damage to?")
            }
          }
        }
      };
      case MEDITITE_55:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness P
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          onAttack {
            damage 10
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Cross Chop", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost F
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
      };
      case OMANYTE_56:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Influence", {
          text "Search your deck for Omanyte, Kabuto, Aerodactyl, Lileep, or Anorith and put up to 2 of them onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
          energyCost W
          attackRequirement {
            assert my.bench.notFull : "Bench is full"
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def maxSpace = Math.min(my.bench.freeBenchCount, 2)
            my.deck.search(min:0, max:maxSpace, "Search your deck for ${maxSpace == 2 ? "up to 2 cards" : "a card"} named Omanyte, Kabuto, Aerodactyl, Lileep, or Anorith", {
              ["Omanyte", "Kabuto", "Aerodactyl", "Lileep", "Anorith"].contains(it.name)
            }).each {
              my.deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Mud Shot", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case PIKACHU_57:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Charge", {
          text "Search your discard pile for a [L] Energy card and attach it to Pikachu."
          energyCost L
          attackRequirement {
            assert my.discard.filterByEnergyType(L) : "There are no [L] Energy cards in your discard pile"
          }
          onAttack {
            attachEnergyFrom(type: L, my.discard, self)
          }
        }
        move "Slam", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case POOCHYENA_58:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Double Kick", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost D
          onAttack {
            flip 2, { damage 10 }
          }
        }
      };
      case RALTS_59:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Slap", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Teleportation Burst", {
          text "20 damage. Switch Ralts with 1 of your Benched Pokémon."
          energyCost P, C
          onAttack {
            damage 20
            switchYourActive()
          }
        }
      };
      case SEEDOT_60:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Nap", {
          text "Remove 2 damage counters from Seedot."
          energyCost C
          onAttack {
            heal 20, self
          }
        }
        move "Double Spin", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost G, C
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case SHUPPET_61:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Bad Dream", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Confused."
          energyCost P
          onAttack {
            damage 10
            flip 1, { applyAfterDamage ASLEEP }, { applyAfterDamage CONFUSED }
          }
        }
      };
      case SKITTY_62:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
          energyCost C
          onAttack {
            flip { cantAttackNextTurn defending }
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case SLAKOTH_63:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          onAttack {
            amnesia delegate
          }
        }
        move "Scratch", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case SNORUNT_64:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Pebble Throw", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {
            assertOppBench()
          }
          onAttack {
            if (opp.bench) {
              damage 10, opp.bench.select()
            }
          }
        }
        move "Double Headbutt", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost W, C
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case SPHEAL_65:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Defense Curl", {
          text "Flip a coin. If heads, prevent all damage done to Spheal during your opponent's next turn."
          energyCost C
          onAttack {
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Aurora Beam", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case SWABLU_66:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Fury Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          onAttack {
            flip 3, { damage 10 }
          }
        }
      };
      case TORCHIC_67:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Super Singe", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 10
            flip { applyAfterDamage BURNED }
          }
        }
      };
      case TRAPINCH_68:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Surprise Attack", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          onAttack {
            flip { damage 20 }
          }
        }
      };
      case VULPIX_69:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Confuse Ray", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            flip { apply CONFUSED }
          }
        }
        move "Ember", {
          text "30 damage. Discard a [R] Energy attached to Vulpix."
          energyCost R, C
          onAttack {
            damage 30
            afterDamage {
              discardSelfEnergy(R)
            }
          }
        }
      };
      case WYNAUT_70:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Wobbuffet from your hand onto Wynaut (this counts as evolving Wynaut) and remove all damage counters from Wynaut."
          actionA {
            checkCanBabyEvolve("Wobbuffet", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Wobbuffet", self)
          }
        }
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Wynaut."
          energyCost C
          attackRequirement {
            assert self.numberOfDamageCounters : "$self has no damage counters on them."
          }
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case BATTLE_FRONTIER_71:
      return copy(Emerald.BATTLE_FRONTIER_75, this);
      case DRAKE_S_STADIUM_72:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Any damage done to [C] Active Pokémon (both yours and your opponent's) by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
        def eff
        onPlay {
          eff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.active && it.to.types.contains(C) && it.dmg.value && it.notNoEffect) {
                  bc "Drake's Stadium reduces damage by 10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case ENERGY_RECYCLE_SYSTEM_73:
      return copy(Dragon.ENERGY_RECYCLE_SYSTEM_84, this);
      case ENERGY_REMOVAL_2_74:
      return copy(Expedition.ENERGY_REMOVAL_2_140, this);
      case ENERGY_SWITCH_75:
      return copy(FireRedLeafGreen.ENERGY_SWITCH_90, this);
      case GLACIA_S_STADIUM_76:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player's [W] Pokémon (excluding Pokémon-ex) has no Weakness."
        def eff
        onPlay {
          eff = getter (GET_WEAKNESSES) {h->
            if(h.effect.target.types.contains(W) && !h.effect.target.EX){
              h.object = []
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case GREAT_BALL_77:
      return copy(FireRedLeafGreen.GREAT_BALL_92, this);
      case MASTER_BALL_78:
      return copy(Deoxys.MASTER_BALL_88, this);
      case PHOEBE_S_STADIUM_79:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player pays [C] [C] less to retreat his or her [P] Pokémon."
        def eff
        onPlay {
          eff = getter (GET_RETREAT_COST) { Holder h->
            def pcs = h.effect.target
            if (pcs.types.contains(P)) {
              h.object -= 2
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case PROFESSOR_BIRCH_80:
      return copy(Emerald.PROFESSOR_BIRCH_82, this);
      case SCOTT_81:
      return copy(Emerald.SCOTT_84, this);
      case SIDNEY_S_STADIUM_82:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player's [D] Pokémon can't be Asleep, Confused, or Paralyzed."
        def eff
        onPlay {
          eff = delayed {
            before APPLY_SPECIAL_CONDITION, {
              def pcs = ef.getResolvedTarget(bg, e)
              if ( pcs.types.contains(D) && [ASLEEP, CONFUSED, PARALYZED].contains(ef.type) ) {
                bc "Sidney's Stadium - [D] Pokemon can't be Asleep, Confused or Paralyzed."
                prevent()
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case STEVEN_S_ADVICE_83:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Draw a number of cards up to the number of your opponent's Pokémon in play. If you have 7 or more cards (including this one) in your hand, you can't play this card."
        onPlay {
          draw opp.all.size()
        }
        playRequirement {
          assert my.deck : "Your deck is empty"
          assert my.hand.size() < 7 : "You have 7 or more cards in your hand (including this card)"
        }
      };
      case CLAW_FOSSIL_84:
      return copy(LegendMaker.CLAW_FOSSIL_78, this);
      case MYSTERIOUS_FOSSIL_85:
      return copy(LegendMaker.MYSTERIOUS_FOSSIL_79, this);
      case ROOT_FOSSIL_86:
      return copy(LegendMaker.ROOT_FOSSIL_80, this);
      case DARKNESS_ENERGY_87:
      return copy (Emerald.DARKNESS_ENERGY_86, this);
      case METAL_ENERGY_88:
      return copy(RubySapphire.METAL_ENERGY_94, this);
      case MULTI_ENERGY_89:
      return copy(FireRedLeafGreen.MULTI_ENERGY_103, this);
      case CYCLONE_ENERGY_90:
      return copy(UnseenForces.CYCLONE_ENERGY_99, this);
      case WARP_ENERGY_91:
      return copy(Aquapolis.WARP_ENERGY_147, this)
      case ABSOL_EX_92:
      return basic (this, hp:HP100, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Cursed Eyes", {
          text "Once during your turn, when you put Absol ex from your hand onto your Bench, you may move 3 damage counters from 1 of your opponent's Pokémon to another of his or her Pokémon."
          onActivate {r->
            checkLastTurn()
            if (r==PLAY_FROM_HAND && opp.bench && opp.all.any{it.numberOfDamageCounters} && confirm("Use Cursed Eyes?")) {
              powerUsed()

              def src = opp.all.findAll{it.numberOfDamageCounters}.select("Choose the Pokémon to move 3 damage counters from")
              def countersToMove = Math.min(src.numberOfDamageCounters, 3)
              def tar = opp.all.findAll{it != src}.select("Choose the Pokémon that will receive the $countersToMove Damage Counters")

              // Ensure damage value is not negative
              src.damage -= hp(10 * countersToMove)
              directDamage 10 * countersToMove, tar, SRC_ABILITY
            }
          }
        }
        move "Psychic Pulse", {
          text "30 damage. Does 10 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C
          onAttack {
            damage 30
            opp.bench.each {
              if (it.numberOfDamageCounters) {
                damage 10, it
              }
            }
          }
        }
      };
      case CLAYDOL_EX_93:
      return evolution (this, from:"Baltoy", hp:HP120, type:P, retreatCost:2) {
        weakness P
        pokePower "Type Shift", {
          text "Once during your turn (before your attack), you may use this power. Claydol ex's type is Fighting until the end of your turn."
          actionA {
            checkLastTurn()
            powerUsed()
            bc "$self's type is now Fighting until the end of this turn."
            delayed {
              def eff
              register {
                eff = getter GET_POKEMON_TYPE, self, { h->
                  h.object.clear()
                  h.object.add(F)
                }
              }
              unregister {
                eff.unregister()
              }
              unregisterAfter 1
            }
          }
        }
        move "Psychic Boom", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
          energyCost C, C
          onAttack {
            damage 20 + 10 * defending.cards.energyCount(C)
          }
        }
        move "Shadow Crush", {
          text "60 damage. You may discard a [P] Energy card attached to Claydol ex. If you do, discard an Energy card attached to the Defending Pokémon."
          energyCost P, P, C
          onAttack {
            damage 60

            afterDamage {
              if (confirm("Discard a [P] attached to Claydol ex? If you do, discard an Energy card attached to the Defending Pokémon.")) {
                discardSelfEnergy(P)
                discardDefendingEnergy()
              }
            }
          }
        }
      };
      case FLYGON_EX_94:
      return evolution (this, from:"Vibrava", hp:HP150, type:C, retreatCost:0) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        pokeBody "Psychic Protector", {
          text "If Flygon ex is damaged by an opponent's attack, you may discard up to 4 cards from your hand. If you do, any damage done to Flygon ex is reduced by 10 for each card you discarded."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value) {
                  if (self.owner.pbg.hand && oppConfirm("Activate Psychic Protector to reduce damage taken?")) {
                    def maxDiscard = Math.min(4, my.hand.size())
                    def toDiscard = self.owner.pbg.hand.oppSelect(min: 0, max: maxDiscard, "For each card discarded, the damage Flygon ex takes will reduced by 10.")
                    def reductionAmount = toDiscard.size() * 10
                    toDiscard.discard()
                    if (it.notNoEffect) {
                      bc "Psychic Protector -$reductionAmount"
                      it.dmg -= hp(reductionAmount)
                    } else {
                      bc "Psychic Protector's -$reductionAmount damage reduction is ignored"
                    }
                  }
                }
              }
            }
          }
        }
        move "Slashing Strike", {
          text "70 damage. Flip a coin. If tails, Flygon ex can't use Slashing Strike during your next turn."
          energyCost C, C, C
          onAttack {
            damage 70
            flip 1, {}, { cantUseAttack(thisMove, self) }
          }
        }
      };
      case METAGROSS_EX_95:
      return evolution (this, from:"Metang", hp:HP150, type:M, retreatCost:4) {
        weakness R
        weakness F
        resistance G, MINUS30
        pokePower "Magnetic Redraw", {
          text "Once during your turn (before your attack), if Metagross ex is your Active Pokémon, you may use this power. Each player shuffles his or her hand into his or her deck. Then, each player draws 4 cards. This power can't be used if Metagross ex is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert self.active : "$self is not an Active Pokémon"
            assert ( [my, opp].any{curPlayer -> curPlayer.hand || curPlayer.deck} ) : "No player has cards in their deck or in their hand"
            powerUsed()

            my.hand.moveTo(hidden:true, my.deck)
            opp.hand.moveTo(hidden:true, opp.deck)
            shuffleDeck()
            shuffleDeck(null, TargetPlayer.OPPONENT)
            draw 4
            draw 4, TargetPlayer.OPPONENT
          }
        }
        move "Scanblast", {
          text "70 damage. Does 70 damage to each of your opponent's Benched Pokémon that has the same name as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, M, C
          onAttack {
            damage 70
            opp.bench.each {
              if (defending.name == it.name) {
                damage 70, it
              }
            }
          }
        }
      };
      case SALAMENCE_EX_96:
      return evolution (this, from:"Shelgon", hp:HP160, type:C, retreatCost:2) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        move "Volcanic Flame", {
          text "150 damage. Discard the top 5 cards from your deck."
          energyCost R, R, C, C
          onAttack {
            damage 150
            afterDamage {
              if (my.deck) {
                def maxDiscard = Math.min(5, my.deck.size())
                my.deck.subList(0, maxDiscard).discard()
              }
            }
          }
        }
        move "Hydro Wave", {
          text "Discard all [W] Energy attached to Salamence ex. This attack does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C, C
          onAttack {
            opp.bench.each {
              damage 30, it
            }
            afterDamage {
              discardAllSelfEnergy(W)
            }
          }
        }
      };
      case SHIFTRY_EX_97:
      return evolution (this, from:"Nuzleaf", hp:HP140, type:D, retreatCost:1) {
        weakness G
        weakness F
        resistance P, MINUS30
        move "Skill Hack", {
          text "Look at your opponent's hand and choose a Basic Pokémon or Evolution card you find there. Choose 1 of that Pokémon's attacks. Skill Hack copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Shiftry ex's type is still Darkness.) Shiftry ex performs that attack."
          energyCost D
          attackRequirement {
            assert opp.hand : "Opponent's hand is empty"
          }
          onAttack {
            def pokeCards = opp.hand.shuffledCopy().showToMe("Opponent's hand").filterByType(POKEMON)
            if (pokeCards) {
              def card = pokeCards.select(max:1, "Select a Pokémon and use one of that Pokémon’s attacks as this attack.").first()
              bc "$card was chosen"
              def moves = card.asPokemonCard().moves
              if (moves) {
                def move = choose(moves, "Choose attack")
                bc "$move was chosen"
                def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                attack (move as Move)
                bef.unregisterItself(bg().em())
              } else {
                bc "$thisMove failed! The selected Pokémon card had no attacks on it."
              }
            } else {
              bc "$thisMove failed! There were no Pokémon to copy an attack from."
            }
          }
        }
        move "Dirge", {
          text "60 damage. Does 60 damage to each of your opponent's Benched Pokémon that has the same name as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C, C
          onAttack {
            damage 60
            opp.bench.each {
              if (defending.name == it.name) {
                damage 60, it
              }
            }
          }
        }
      };
      case SKARMORY_EX_98:
      return basic (this, hp:HP100, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Metal Gravity", {
          text "If your opponent's Active Pokémon retreats and has 40 or more remaining HP, put 3 damage counters on that Pokémon. You can't use more than 1 Metal Gravity Poké-Body each turn."
          delayedA {
            after RETREAT, {
              if (bg.em().retrieveObject("Metal_Gravity") != bg.turnCount && ef.retreater.owner == self.owner.opposite && ef.retreater.getRemainingHP().value >= 40) {
                bg.em().storeObject("Metal_Gravity", bg.turnCount)
                bc "Metal Gravity activates"
                directDamage 30, ef.retreater, SRC_ABILITY
              }
            }
          }
        }
        move "Whirlwind", {
          text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            afterDamage {
              whirlwind()
            }
          }
        }
        move "Razor Wing", {
          text "60 damage."
          energyCost M, M, C
          onAttack {
            damage 60
          }
        }
      };
      case WALREIN_EX_99:
      return evolution (this, from:"Sealeo", hp:HP150, type:W, retreatCost:3) {
        weakness L
        pokePower "Chilling Breath", {
          text "Once during your turn, when you play Walrein ex from your hand to evolve 1 of your Pokémon, you may use this power. Your opponent can't play any Trainer cards from his or her hand during your opponent's next turn."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Chilling Breath?")) {
              bc "Chlling Breath activates"
              delayed {
                def flag = false
                before PROCESS_ATTACK_EFFECTS, {
                  flag = true
                }
                before BETWEEN_TURNS, {
                  flag = false
                }
                before USE_ABILITY, {
                  flag = true
                }
                after POKEPOWER, {
                  flag = false
                }
                after ACTIVATE_ABILITY, {
                  flag = false
                }
                before PLAY_TRAINER, {
                  if (bg.currentTurn == self.owner.opposite && !flag) {
                    wcu "Chilling Breath prevents playing Trainer cards"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
        }
        move "Wreck", {
          text "70+ damage. If there is any Stadium card in play, this attack does 70 damage plus 20 more damage. Discard that Stadium card."
          energyCost W, W, C
          onAttack {
            damage 70
            if (bg.stadiumInfoStruct) {
              damage 20

              afterDamage {
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
        }
      };
      case FLAREON_STAR_100:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokePower "Crimson Ray", {
          text "Once during your turn, when you put Flareon Star from your hand onto your Bench, you may use this power. Each Active Pokémon (both yours and your opponent's) is now Burned."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Crimson Ray?")) {
              powerUsed()

              apply BURNED, opp.active, SRC_ABILITY
              apply BURNED, my.active, SRC_ABILITY
            }
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard a [R] Energy attached to Flareon Star."
          energyCost R, R, C
          onAttack {
            damage 50
            afterDamage {
              discardSelfEnergy(R)
            }
          }
        }
      };
      case JOLTEON_STAR_101:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Yellow Ray", {
          text "Once during your turn, when you put Jolteon Star from your hand onto your Bench, you may put 1 damage counter on each Active Pokémon (both yours and your opponent's)."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Yellow Ray?")) {
              powerUsed()
              directDamage 10, opp.active, SRC_ABILITY
              directDamage 10, my.active, SRC_ABILITY
            }
          }
        }
        move "Agility", {
          text "40 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Jolteon Star during your opponent's next turn."
          energyCost L, L, C
          onAttack {
            damage 40
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case VAPOREON_STAR_102:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokePower "Blue Ray", {
          text "Once during your turn, when you put Vaporeon Star from your hand onto your Bench, you may remove all Special Conditions and 3 damage counters from each Active Pokémon (both yours and your opponent's)."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Blue Ray?")) {
              powerUsed()
              clearSpecialCondition(my.active, Source.SRC_ABILITY)
              heal 30, my.active, Source.SRC_ABILITY
              clearSpecialCondition(opp.active, Source.SRC_ABILITY)
              heal 30, opp.active, Source.SRC_ABILITY
            }
          }
        }
        move "Whirlpool", {
          text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost W, W, C
          onAttack {
            damage 40
            afterDamage {
              flip { discardDefendingEnergy() }
            }
          }
        }
      };
      case GRASS_ENERGY_103:
        return basicEnergy (this, G);
      case FIRE_ENERGY_104:
        return basicEnergy (this, R);
      case WATER_ENERGY_105:
        return basicEnergy (this, W);
      case LIGHTNING_ENERGY_106:
        return basicEnergy (this, L);
      case PSYCHIC_ENERGY_107:
        return basicEnergy (this, P);
      case FIGHTING_ENERGY_108:
        return basicEnergy (this, F);
      default:
      return null;
    }
  }
}
