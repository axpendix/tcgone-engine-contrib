package tcgwars.logic.impl.gen3;

import tcgwars.logic.effect.gm.PlayTrainer;

import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.DeltaSpecies;
import tcgwars.logic.impl.gen3.HolonPhantoms;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen3.TeamRocketReturns;
import tcgwars.logic.impl.gen4.HeartgoldSoulsilver;
import tcgwars.logic.impl.gen7.CelestialStorm;

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
public enum DragonFrontiers implements LogicCardInfo {

  AMPHAROS_DELTA_1 ("Ampharos", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _COLORLESS_]),
  FERALIGATR_DELTA_2 ("Feraligatr", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _LIGHTNING_]),
  HERACROSS_DELTA_3 ("Heracross", "3", Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _FIRE_]),
  MEGANIUM_DELTA_4 ("Meganium", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _FIGHTING_]),
  MILOTIC_DELTA_5 ("Milotic", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  NIDOKING_DELTA_6 ("Nidoking", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _DARKNESS_]),
  NIDOQUEEN_DELTA_7 ("Nidoqueen", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _METAL_]),
  NINETALES_DELTA_8 ("Ninetales", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  PINSIR_DELTA_9 ("Pinsir", "9", Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  SNORLAX_DELTA_10 ("Snorlax", "10", Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _GRASS_]),
  TOGETIC_DELTA_11 ("Togetic", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_]),
  TYPHLOSION_DELTA_12 ("Typhlosion", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _PSYCHIC_]),
  ARBOK_DELTA_13 ("Arbok", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  CLOYSTER_DELTA_14 ("Cloyster", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  DEWGONG_DELTA_15 ("Dewgong", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _COLORLESS_]),
  GLIGAR_DELTA_16 ("Gligar", "16", Rarity.RARE, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  JYNX_DELTA_17 ("Jynx", "17", Rarity.RARE, [POKEMON, BASIC, DELTA, _FIRE_]),
  LEDIAN_DELTA_18 ("Ledian", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _METAL_]),
  LICKITUNG_DELTA_19 ("Lickitung", "19", Rarity.RARE, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  MANTINE_DELTA_20 ("Mantine", "20", Rarity.RARE, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  QUAGSIRE_DELTA_21 ("Quagsire", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _GRASS_]),
  SEADRA_DELTA_22 ("Seadra", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  TROPIUS_DELTA_23 ("Tropius", "23", Rarity.RARE, [POKEMON, BASIC, DELTA, _METAL_]),
  VIBRAVA_DELTA_24 ("Vibrava", "24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  XATU_DELTA_25 ("Xatu", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _DARKNESS_]),
  BAYLEEF_DELTA_26 ("Bayleef", "26", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  CROCONAW_DELTA_27 ("Croconaw", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  DRAGONAIR_DELTA_28 ("Dragonair", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _GRASS_]),
  ELECTABUZZ_DELTA_29 ("Electabuzz", "29", Rarity.UNCOMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  FLAAFFY_DELTA_30 ("Flaaffy", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _COLORLESS_]),
  HORSEA_DELTA_31 ("Horsea", "31", Rarity.UNCOMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  KIRLIA_32 ("Kirlia", "32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  KIRLIA_DELTA_33 ("Kirlia", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  NIDORINA_DELTA_34 ("Nidorina", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _METAL_]),
  NIDORINO_DELTA_35 ("Nidorino", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _DARKNESS_]),
  QUILAVA_DELTA_36 ("Quilava", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  SEADRA_DELTA_37 ("Seadra", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  SHELGON_DELTA_38 ("Shelgon", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_]),
  SMEARGLE_DELTA_39 ("Smeargle", "39", Rarity.UNCOMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  SWELLOW_DELTA_40 ("Swellow", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  TOGEPI_DELTA_41 ("Togepi", "41", Rarity.UNCOMMON, [POKEMON, BASIC, DELTA, _WATER_]),
  VIBRAVA_DELTA_42 ("Vibrava", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  BAGON_DELTA_43 ("Bagon", "43", Rarity.COMMON, [POKEMON, BASIC, DELTA, _WATER_]),
  CHIKORITA_DELTA_44 ("Chikorita", "44", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  CYNDAQUIL_DELTA_45 ("Cyndaquil", "45", Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  DRATINI_DELTA_46 ("Dratini", "46", Rarity.COMMON, [POKEMON, BASIC, DELTA, _GRASS_]),
  EKANS_DELTA_47 ("Ekans", "47", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  ELEKID_DELTA_48 ("Elekid", "48", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  FEEBAS_DELTA_49 ("Feebas", "49", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  HORSEA_DELTA_50 ("Horsea", "50", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  LARVITAR_51 ("Larvitar", "51", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  LARVITAR_DELTA_52 ("Larvitar", "52", Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  LEDYBA_DELTA_53 ("Ledyba", "53", Rarity.COMMON, [POKEMON, BASIC, DELTA, _METAL_]),
  MAREEP_DELTA_54 ("Mareep", "54", Rarity.COMMON, [POKEMON, BASIC, DELTA, _COLORLESS_]),
  NATU_DELTA_55 ("Natu", "55", Rarity.COMMON, [POKEMON, BASIC, DELTA, DELTA, _DARKNESS_]),
  NIDORAN_FEMALE_DELTA_56 ("Nidoran♀", "56", Rarity.COMMON, [POKEMON, BASIC, DELTA, _METAL_]),
  NIDORAN_MALE_DELTA_57 ("Nidoran♂", "57", Rarity.COMMON, [POKEMON, BASIC, DELTA, _DARKNESS_]),
  PUPITAR_58 ("Pupitar", "58", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  PUPITAR_DELTA_59 ("Pupitar", "59", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  RALTS_60 ("Ralts", "60", Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  RALTS_DELTA_61 ("Ralts", "61", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  SEEL_DELTA_62 ("Seel", "62", Rarity.COMMON, [POKEMON, BASIC, DELTA, _COLORLESS_]),
  SHELLDER_DELTA_63 ("Shellder", "63", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIGHTING_]),
  SMOOCHUM_DELTA_64 ("Smoochum", "64", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  SWABLU_DELTA_65 ("Swablu", "65", Rarity.COMMON, [POKEMON, BASIC, DELTA, _WATER_]),
  TAILLOW_DELTA_66 ("Taillow", "66", Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  TOTODILE_DELTA_67 ("Totodile", "67", Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  TRAPINCH_DELTA_68 ("Trapinch", "68", Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  TRAPINCH_DELTA_69 ("Trapinch", "69", Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  VULPIX_DELTA_70 ("Vulpix", "70", Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  WOOPER_DELTA_71 ("Wooper", "71", Rarity.COMMON, [POKEMON, BASIC, DELTA, _GRASS_]),
  BUFFER_PIECE_72 ("Buffer Piece", "72", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  COPYCAT_73 ("Copycat", "73", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_LEGACY_74 ("Holon Legacy", "74", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  HOLON_MENTOR_75 ("Holon Mentor", "75", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ISLAND_HERMIT_76 ("Island Hermit", "76", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MR_STONE_S_PROJECT_77 ("Mr. Stone's Project", "77", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OLD_ROD_78 ("Old Rod", "78", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PROFESSOR_ELM_S_TRAINING_METHOD_79 ("Professor Elm's Training Method", "79", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROFESSOR_OAK_S_RESEARCH_80 ("Professor Oak's Research", "80", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STRENGTH_CHARM_81 ("Strength Charm", "81", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  TV_REPORTER_82 ("TV Reporter", "82", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SWITCH_83 ("Switch", "83", Rarity.COMMON, [TRAINER, ITEM]),
  HOLON_ENERGY_FF_84 ("Holon Energy FF", "84", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  HOLON_ENERGY_GL_85 ("Holon Energy GL", "85", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  HOLON_ENERGY_WP_86 ("Holon Energy WP", "86", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BOOST_ENERGY_87 ("Boost Energy", "87", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  DELTA_RAINBOW_ENERGY_88 ("δ Rainbow Energy", "88", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  SCRAMBLE_ENERGY_89 ("Scramble Energy", "89", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ALTARIA_EX_DELTA_90 ("Altaria ex", "90", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE1, EX, DELTA, _WATER_]),
  DRAGONITE_EX_DELTA_91 ("Dragonite ex", "91", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _GRASS_]),
  FLYGON_EX_DELTA_92 ("Flygon ex", "92", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _PSYCHIC_]),
  GARDEVOIR_EX_DELTA_93 ("Gardevoir ex", "93", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _FIRE_]),
  KINGDRA_EX_DELTA_94 ("Kingdra ex", "94", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _FIGHTING_]),
  LATIAS_EX_DELTA_95 ("Latias ex", "95", Rarity.ULTRARARE, [POKEMON, BASIC, DELTA, EX, _FIRE_]),
  LATIOS_EX_DELTA_96 ("Latios ex", "96", Rarity.ULTRARARE, [POKEMON, BASIC, DELTA, EX, _WATER_]),
  RAYQUAZA_EX_DELTA_97 ("Rayquaza ex", "97", Rarity.ULTRARARE, [POKEMON, BASIC, DELTA, EX, _LIGHTNING_]),
  SALAMENCE_EX_DELTA_98 ("Salamence ex", "98", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _WATER_]),
  TYRANITAR_EX_DELTA_99 ("Tyranitar ex", "99", Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, EX, DELTA, _LIGHTNING_]),
  CHARIZARD_STAR_DELTA_100 ("Charizard Star", "100", Rarity.HOLORARE, [POKEMON_STAR, POKEMON, BASIC, DELTA, _DARKNESS_]),
  MEW_STAR_DELTA_101 ("Mew Star", "101", Rarity.HOLORARE, [POKEMON_STAR, POKEMON, BASIC, DELTA, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DragonFrontiers(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DRAGON_FRONTIERS;
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
      case AMPHAROS_DELTA_1:
      return evolution (this, from:"Flaaffy", hp:HP120, type:C, retreatCost:2) {
        weakness F
        pokeBody "Holon Veil", {
          text "Treat each Basic Pokémon and Evolution card in your deck, in your discard pile, in your hand, and in play as a Pokémon that has δ on its card."
          onActivate {
            bg.em().retrieveAndStore("holon_veil_counter_${self.owner}", {
              if(it) {
                it+1
              } else {
                def list = new CardList()
                list += my.deck.filterByType(POKEMON)
                list += my.discard.filterByType(POKEMON)
                list += my.hand.filterByType(POKEMON)
                list += my.prizeCardSet.filterByType(POKEMON)
                list += my.lostZone.filterByType(POKEMON)
                my.all.each {list += it.cards.filterByType(POKEMON)}
                list = list.findAll{it.cardTypes.isNot(DELTA)}
                list.each {it.cardTypes.add(DELTA)}
                bg.em().storeObject("holon_veil_pokemon_${self.owner}", list)
                1
              }
            })
          }
          onDeactivate {
            bg.em().retrieveAndStore("holon_veil_counter_${self.owner}", {
              if (it == 1) {
                bg.em().retrieveAndStore("holon_veil_pokemon_${self.owner}", { CardList list ->
                  list.each { it.cardTypes.remove(DELTA) }
                  null
                })
                null
              } else {
                it - 1
              }
            })
          }
        }
        move "Delta Circle", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Pokémon you have in play that has δ on its card."
          energyCost C, C, C
          onAttack {
            damage 20 + 10*my.all.findAll { it.cardTypes.is(DELTA) }.size()
          }
        }
      };
      case FERALIGATR_DELTA_2:
      return evolution (this, from:"Croconaw", hp:HP120, type:L, retreatCost:2) {
        weakness L
        pokeBody "Battle Aura", {
          text "Each of your Pokémon that has δ on its card does 10 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == self.owner && ef.attacker.topPokemonCard.cardTypes.is(DELTA)) {
                bg.dm().each {
                  if (it.to.active && it.to != self.owner && it.notNoEffect && it.dmg.value) {
                    bc "Battle Aura +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
        }
        move "Drag Off", {
          text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost C, C
          onAttack {
            if(opp.bench){
              if(confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon before doing damage?")){
                def target = opp.bench.select()
                sw2(target)
              }
            }
            damage 20
          }
        }
        move "Sharp Fang", {
          text "60 damage."
          energyCost L, L, C
          onAttack {
            damage 60
          }
        }
      };
      case HERACROSS_DELTA_3:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness R
        pokeBody "Shining Horn", {
          text "As long as Heracross is the only Pokémon you have in play, your opponent's Basic Pokémon can't attack."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (ef.attacker.owner == self.owner.opposite && ef.attacker.notEvolution && self.owner.pbg.all.size() == 1) {
                wcu "Shining Horn prevents Basic Pokémon from attacking."
                prevent()
              }
            }
          }
        }
        move "Dig Deep", {
          text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.find(cardTypeFilter(ENERGY)) : "There are no Energy cards in your discard pile."
          }
          onAttack {
            my.discard.findAll(cardTypeFilter(ENERGY)).select().showToOpponent("Opponent used Dig Deep. They're putting this Energy card from their discard pile into their hand.").moveTo(my.hand)
          }
        }
        move "Extra Claws", {
          text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 20 more damage."
          energyCost R, C
          onAttack {
            damage 30
            if (defending.EX) {
              damage 20
            }
          }
        }
      };
      case MEGANIUM_DELTA_4:
      return evolution (this, from:"Bayleef", hp:HP110, type:F, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        pokePower "Evolutionary Call", {
          text "Once during your turn, when you play Meganium from your hand to evolve 1 of your Pokémon, you may search your deck for up to 3 in any combination of Basic Pokémon or Evolution cards. Show them to your opponent and put them into your hand. Shuffle your deck afterward."
          onActivate {reason ->
            checkLastTurn()
            if (reason==PLAY_FROM_HAND && my.deck && confirm("Use Evolutionary Call?")) {
              powerUsed()

              deck.search(max: 3, "Search your deck for up to 3 Basic/Evolutions", {it.cardTypes.is(POKEMON)}).showToOpponent("Opponent used Evolutionary Call. They're putting these cards from their deck into their hand.").moveTo(my.hand)

              shuffleDeck()
            }
          }
        }
        move "Delta Reduction", {
          text "40 damage. During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 30 (before applying Weakness and Resistance)."
          energyCost F, C
          onAttack {
            damage 40
            reduceDamageFromDefendingNextTurn(hp(30),thisMove,defending)
          }
        }
        move "Mega Impact", {
          text "60 damage."
          energyCost F, C, C
          onAttack {
            damage 60
          }
        }
      };
      case MILOTIC_DELTA_5:
      return evolution (this, from:"Feebas", hp:HP090, type:R, retreatCost:2) {
        weakness L
        pokePower "Sharing", {
          text "Once during your turn (before your attack), you may look at your opponent's hand. You may use the effect of a Supporter card you find there as the effect of this power. (The Supporter card remains in your opponent's hand.) You can't use more than 1 Sharing Poké-Power each turn. This power can't be used if Milotic is affected by a Special Condition."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Sharing") != bg.turnCount : "You can’t use more than 1 Sharing Poké-Power each turn"
            checkNoSPC()
            assert opp.hand : "Your opponent has no cards in their hand"
            bg.em().storeObject("Sharing",bg.turnCount)
            powerUsed()
            def randomOppHand = opp.hand.shuffledCopy()
            if (randomOppHand.hasType(SUPPORTER)) {
              def sel = randomOppHand.select(min: 0, "Opponent's hand. You may select a Supporter and use it as the effect of this power.", cardTypeFilter(SUPPORTER))
              if (sel){
                delayed {
                  def eff
                  register {
                    eff = getter (GET_MAX_SUPPORTER_PER_TURN) {h->
                      h.object = h.object + 1
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  unregisterAfter 1
                }
                def card = sel.first()
                bg.deterministicCurrentThreadPlayerType=bg.currentTurn
                bg.em().run(new PlayTrainer(card).setDontDiscard(true))
                bg.clearDeterministicCurrentThreadPlayerType()
              }
            } else {
              randomOppHand.showToMe("Opponent's hand. No supporter in there.")
            }
          }
        }
        move "Flare", {
          text "60 damage."
          energyCost R, R, C
          onAttack {
            damage 60
          }
        }
      };
      case NIDOKING_DELTA_6:
      return evolution (this, from:"Nidorino", hp:HP120, type:D, retreatCost:3) {
        weakness P
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          onAttack {
            damage 30, opp.all.select()
          }
        }
        move "Dark Horn", {
          text "60 damage. You may discard a Basic Pokémon or Evolution card from your hand. If you do, choose 1 of your opponent's Benched Pokémon and do 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C, C
          onAttack {
            damage 60

            if (my.hand.filterByType(POKEMON) && confirm("Discard Pokemon from Hand?")) {
              my.hand.filterByType(BASIC, EVOLUTION).select("Which card to discard?").discard()
              if (opp.bench) damage 20, opp.bench.select("Damage to?")
            }
          }
        }
      };
      case NIDOQUEEN_DELTA_7:
      return evolution (this, from:"Nidorina", hp:HP100, type:M, retreatCost:2) {
        weakness P
        pokePower "Invitation", {
          text "Once during your turn (before your attack), you may search your deck for a Basic Pokémon or Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Nidoqueen is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.deck : "Deck is empty"
            powerUsed()
            my.deck.search(max: 1, "Select a Pokemon card to put into your hand", {
              it.cardTypes.is(POKEMON)
            }).showToOpponent("Your opponent used Invitation. They're moving this Pokémon card from their deck into their hand.").moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Vengeance", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Basic Pokémon and each Evolution card in your discard pile. You can't add more than 60 damage in this way."
          energyCost C, C, C
          onAttack {
            def bonus = my.discard.findAll{it.cardTypes.is(POKEMON)}.size()
            def bonusDamage = 10 * Math.min(bonus, 6)
            damage 30 + bonusDamage
          }
        }
      };
      case NINETALES_DELTA_8:
      return evolution (this, from:"Vulpix", hp:HP070, type:P, retreatCost:0) {
        weakness W
        pokePower "Volunteer", {
          text "Once during your turn (before your attack), you may remove 4 damage counters from Ninetales and discard Ninetales from Vulpix. If you do, search your deck for Ninetales or Ninetales ex and put it onto Vulpix (this counts as evolving Vulpix). Shuffle your deck afterward."
          actionA {
            checkLastTurn()
            assert self.cards.any {it.name == "Vulpix"} : "You must be able to leave a Vulpix in play"
            powerUsed()
            heal 40, self

            def top=self.topPokemonCard
            bc "$top Devolved"
            moveCard(top, my.discard)
            devolve(self, top)

            if (my.deck) {
              def tar = my.deck.search("Evolves from Vulpix", {it.cardTypes.is(EVOLUTION) && (it.name == "Ninetales" || it.name == "Ninetales ex")})
              if (tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
        }
        move "Trick Tail", {
          text "30 damage. Search your discard pile for an Energy card and attach it to 1 of your Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            attachEnergyFrom(my.discard, my.all.select())
          }
        }
      };
      case PINSIR_DELTA_9:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness R
        pokeBody "Armor", {
          text "If your opponent has 5 or more cards in his or her hand, any damage done to Pinsir by attacks is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect && self.owner.opposite.pbg.hand.size() >= 5) {
                  bc "Armor -30"
                  it.dmg -= hp(30)
                }
              }
            }
          }
        }
        move "Delta Call", {
          text "Search your deck for a Pokémon that has δ on its card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is Empty"
          }
          onAttack {
            deck.search("Search your deck for a δ Pokemon", {
              it.cardTypes.pokemon && it.cardTypes.is(DELTA)
            }).showToOpponent("Your opponent used Delta Call. They're moving this Pokémon card from their deck into their hand.").moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Guillotine", {
          text "40 damage."
          energyCost F, C, C
          onAttack {
            damage 40
          }
        }
      };
      case SNORLAX_DELTA_10:
      return basic (this, hp:HP080, type:G, retreatCost:3) {
        weakness F
        pokePower "Dozing", {
          text "Once during your turn (before your attack), if Snorlax is your Active Pokemon, you may remove 2 damage counters from Snorlax and Snorlax is now Asleep. This power can't be used if Snorlax is affected by a Special Condition"
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert self.active : "$self is not your Active Pokémon"
            powerUsed()
            heal 20, self, SRC_ABILITY
            apply ASLEEP, self, SRC_ABILITY
          }
        }
        pokeBody "Bedhead", {
          text "As long as Snorlax remains Asleep between turns, put 2 damage counters on 1 of the Defending Pokémon."
          delayedA {
            before BEGIN_TURN, {
              if (self.isSPC(ASLEEP)) {
                bc "Bedhead activates"
                directDamage 20, self.owner.opposite.pbg.active, SRC_ABILITY
              }
            }
          }
        }
      };
      case TOGETIC_DELTA_11:
      return evolution (this, from:"Togepi", hp:HP060, type:W, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Delta Copy", {
          text "Choose an attack on 1 of your opponent's Pokémon in play that has δ on its card. Delta Copy copies that attack except for its Energy cost. (You must still do anything else required for that attack.) Togetic performs that attack."
          energyCost C, C
          attackRequirement {
            assert opp.all.any{ it.topPokemonCard.cardTypes.is(DELTA) } : "Opponent has no Delta Pokemon"
          }
          onAttack {
            def card = opp.all.findAll { it.topPokemonCard.cardTypes.is(DELTA) }.select("Source of move")
            if (card) {
              bc "$card was chosen"
              def moves = card.topPokemonCard.moves
              if (moves) {
                def move = choose(moves, "Choose attack")
                bc "$move was chosen"
                def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                attack (move as Move)
                bef.unregisterItself(bg().em())
              }
            }
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
      case TYPHLOSION_DELTA_12:
      return evolution (this, from:"Quilava", hp:HP100, type:P, retreatCost:1) {
        weakness W
        pokePower "Shady Move", {
          text "Once during your turn (before your attack), if Typhlosion is your Active Pokémon, you may move 1 damage counter from either player's Pokémon to another Pokémon (yours or your opponent's). This power can't be used if Typhlosion is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert self.active : "This Pokemon is not the Active Pokemon"
            assert all.any{it.numberOfDamageCounters} : "No Damage Counters in any Pokémon"
            powerUsed()
            def source = all.findAll{it.numberOfDamageCounters}.select("Source for damage counter")
            def target = all
            target.remove(source)
            target = target.select("Target for damage counter")
            source.damage-=hp(10)
            directDamage 10, target, SRC_ABILITY
            bc "Moved 1 damage counter from $source to $target"
            checkFaint()
          }
        }
        move "Burning Ball", {
          text "60 damage. If Typhlosion has at least 2 [R] Energy attached to it, the Defending Pokémon is now Burned."
          energyCost P, C, C
          onAttack {
            damage 60

            if (self.cards.energyCount(R) >= 2) {
              applyAfterDamage BURNED
            }
          }
        }
      };
      case ARBOK_DELTA_13:
      return evolution (this, from:"Ekans", hp:HP080, type:R, retreatCost:1) {
        weakness P
        move "Burning Venom", {
          text "The Defending Pokémon is now Burned and Poisoned."
          energyCost C
          onAttack {
            apply BURNED
            apply POISONED
          }
        }
        move "Strangle", {
          text "50+ damage. If the Defending Pokémon has δ on its card, this attack does 50 damage plus 30 more damage."
          energyCost R, R, C
          onAttack {
            damage 50
            if (defending.topPokemonCard.cardTypes.is(DELTA)) {
              damage 30
            }
          }
        }
      };
      case CLOYSTER_DELTA_14:
      return evolution (this, from:"Shellder", hp:HP070, type:F, retreatCost:1) {
        weakness L
        pokeBody "Solid Shell", {
          text "Prevent all of effects of attacks, including damage, done by your opponent's Pokémon to each of your Benched Pokémon that has δ on its card."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.owner==self.owner && it.to.benched && it.dmg.value && it.to.topPokemonCard.cardTypes.is(DELTA)) {
                  bc "Solid Shell prevents damage"
                  it.dmg=hp(0)
                }
              }
            }
            before null, null, Source.ATTACK, {
              def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
              if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && pcs && pcs.owner == self.owner && pcs.benched && pcs.topPokemonCard.cardTypes.is(DELTA)) {
                bc "Solid Shell prevents effect"
                prevent()
              }
            }
          }
        }
        move "Grind", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Cloyster."
          energyCost F
          onAttack {
            damage 10+10*self.cards.energyCount(C)
          }
        }
      };
      case DEWGONG_DELTA_15:
      return evolution (this, from:"Seel", hp:HP080, type:C, retreatCost:2) {
        weakness L
        pokeBody "Delta Protection", {
          text "Any damage done to Dewgong by attacks from your opponent's Pokémon that has δ on its card is reduced by 40 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (ef.attacker.topPokemonCard.cardTypes.is(DELTA)){
                bg.dm().each {
                  if (it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "Delta Protection -40"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
        }
        move "Ice Beam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Surge", {
          text "40+ damage. If Dewgong has at least 2 [W] Energy attached to it, this attack does 40 damage plus 20 more damage."
          energyCost C, C, C
          onAttack {
            damage 40
            if (self.cards.energyCount(W) >= 2) {
              damage 20
            }
          }
        }
      };
      case GLIGAR_DELTA_16:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness W
        move "Sting Turn", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed and switch Gligar with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            flip {
              apply PARALYZED
              if (my.bench) {
                def tar = my.bench.select("Switch with")
                sw self, tar
              }
            }
          }
        }
        move "Tail Sting", {
          text "10+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 10 damage plus 10 more damage and the Defending Pokémon is now Poisoned."
          energyCost C
          onAttack {
            damage 10
            if (defending.EX) {
              damage 10
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case JYNX_DELTA_17:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness P
        pokeBody "Stages of Evolution", {
          text "As long as Jynx is an Evolved Pokémon, you pay [C] less to retreat your [R] and [P] Pokémon."
          getterA GET_RETREAT_COST ,{ h->
            if (self.evolution && h.effect.target.owner == self.owner && (h.effect.target.types.contains(R) || h.effect.target.types.contains(P))) {
              h.object = Math.max(0,h.object-1)
            }
          }
        }
        move "Fire Punch", {
          text "30 damage."
          energyCost R, C
          onAttack {
            damage 30
          }
        }
      };
      case LEDIAN_DELTA_18:
      return evolution (this, from:"Ledyba", hp:HP070, type:M, retreatCost:0) {
        weakness R
        pokePower "Prowl", {
          text "Once during your turn, when you play Ledian from your hand to evolve 1 of your Pokémon, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
          onActivate {r->
            if (r==PLAY_FROM_HAND && my.deck && confirm("Use Prowl to move any card from your deck to your hand?")) {
              powerUsed()
              my.deck.select(count:1, "Choose any card to put into your deck").moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
        }
        move "Metal Star", {
          text "30 damage. If Ledian has a Pokémon Tool card attached to it, draw 3 cards."
          energyCost M, C
          onAttack {
            damage 30
            if (self.cards.filterByType(POKEMON_TOOL)) {
              draw 3
            }
          }
        }
      };
      case LICKITUNG_DELTA_19:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness F
        move "Lap Up", {
          text "Draw 2 cards."
          energyCost C
          onAttack {
            draw 2
          }
        }
        move "Delta Mind", {
          text "Put 1 damage counter on 1 of your opponent's Pokémon. If that Pokémon has δ on its card, put 3 damage counters instead."
          energyCost P
          onAttack {
            def tar = opp.all.select()
            if (tar.topPokemonCard.cardTypes.is(DELTA)) {
              directDamage 30, tar
            } else {
              directDamage 10, tar
            }
          }
        }
      };
      case MANTINE_DELTA_20:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness L
        pokePower "Power Circulation", {
          text "Once during your turn (before your attack), you may search your discard pile for a basic Energy card, show it to your opponent, and put it on top of your deck. If you do, put 1 damage counter on Mantine. This power can't be used if Mantine is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.discard.filterByType(BASIC_ENERGY) : "No Basic Energy in Discard"
            powerUsed()
            my.discard.filterByType(BASIC_ENERGY).select(min: 0, max: 1, "Move one to the top of your deck").moveTo(addToTop: true, my.deck)
            directDamage 10, self, SRC_ABILITY
          }
        }
        move "Spiral Drain", {
          text "10 damage. Remove 1 damage counter from Mantine."
          energyCost L
          onAttack {
            damage 10
            heal 10, self
          }
        }
      };
      case QUAGSIRE_DELTA_21:
      return evolution (this, from:"Wooper", hp:HP080, type:G, retreatCost:1) {
        weakness G
        pokePower "Dig up", {
          text "Once during your turn, when you play Quagsire from your hand to evolve 1 of your Pokémon, you may search your discard pile for up to 2 Pokémon Tool cards, show them to your opponent, and put them into your hand."
          onActivate {r->
            checkLastTurn()
            if (r==PLAY_FROM_HAND && my.discard.filterByType(POKEMON_TOOL) && confirm("Use Dig Up?")) {
              powerUsed()
              my.discard.filterByType(POKEMON_TOOL).select(min: 1, max: 2, "Select Pokémon Tool cards to move to your hand.").showToOpponent("Your opponent used Dig Up. These Pokémon Tool cards will now be moved from their discard pile into their hand.").moveTo(my.hand)
            }
          }
        }
        move "Pump Out", {
          text "50+ damage. If Quagsire has a Pokémon Tool card attached to it, this attack does 50 damage plus 20 more damage."
          energyCost G, C, C
          onAttack {
            damage 50
            if (self.cards.hasType(POKEMON_TOOL)) damage 20
          }
        }
      };
      case SEADRA_DELTA_22:
      return evolution (this, from:"Horsea", hp:HP070, type:F, retreatCost:1) {
        weakness L
        move "Smokescreen", {
          text "20 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C, C
          onAttack {
            damage 20
            sandAttack(thisMove)
          }
        }
        move "Razor Wing", {
          text "40 damage."
          energyCost F, C, C
          onAttack {
            damage 40
          }
        }
      };
      case TROPIUS_DELTA_23:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        pokePower "Tropical Heal", {
          text "Once during your turn, when you put Tropius from your hand onto your Bench, you may remove all Special Conditions, Imprison markers, and Shock-wave markers from your Pokémon."
          onActivate {
            if (it==PLAY_FROM_HAND && confirm("Use Tropical Heal?")) {
              powerUsed()
              def Imprison = []
              def Shock_Wave = []
              if(bg.em().retrieveObject("Imprison") != null){
                Imprison = bg.em().retrieveObject("Imprison")
              }
              if(bg.em().retrieveObject("Shock_Wave") != null){
                Shock_Wave = bg.em().retrieveObject("Shock_Wave")
              }
              my.all.each{
                if(Imprison.contains(it)){
                  Imprison.remove(it)
                  bc"Removed an Imprison counter from $it"
                  bg.em().storeObject("Imprison",Imprison)
                  new CheckAbilities().run(bg)//Not sure if Gardevoir will update abilities in time so adding this here.
                }
                if(Shock_Wave.contains(it)){
                  Shock_Wave.remove(it)
                  bc"Removed a Shock-wave counter from $it"
                  bg.em().storeObject("Shock_Wave",Shock_Wave)
                }
                if(it.specialConditions){
                  clearSpecialCondition(it,SRC_ABILITY)
                }
                new CheckAbilities().run(bg)
              }
            }
          }
        }
        move "Grind", {
          text "10x damage. Does 10 damage times the amount of Energy attached to Tropius."
          energyCost M
          onAttack {
            damage 10*self.cards.energyCount(C)
          }
        }
      };
      case VIBRAVA_DELTA_24:
      return evolution (this, from:"Trapinch", hp:HP070, type:P, retreatCost:1) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        pokeBody "Psychic Wing", {
          text "If Vibrava has any [P] Energy attached to it, the Retreat Cost for Vibrava is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {h->
            if(self.cards.energyCount(P)) {
              h.object = 0
            }
          }
        }
        move "Quick Blow", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost C, C, C
          onAttack {
            damage 20
            flip { damage 20 }
          }
        }
      };
      case XATU_DELTA_25:
      return evolution (this, from:"Natu", hp:HP070, type:D, retreatCost:1) {
        weakness P
        pokeBody "Extra Feather", {
          text "Each of your Stage 2 Pokémon-ex does 10 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner == self.owner && ef.attacker.EX && ef.attacker.topPokemonCard.cardTypes.is(STAGE2)) {
                bg.dm().each {
                  if (it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Extra Feather +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
        }
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is Confused."
          energyCost D, C
          onAttack {
            damage 20
            flip { applyAfterDamage CONFUSED }
          }
        }
      };
      case BAYLEEF_DELTA_26:
      return evolution (this, from:"Chikorita", hp:HP070, type:F, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost F, C
          onAttack {
            damage 20
            applyAfterDamage POISONED
          }
        }
      };
      case CROCONAW_DELTA_27:
      return evolution (this, from:"Totodile", hp:HP070, type:L, retreatCost:1) {
        weakness L
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
        move "Slash", {
          text "50 damage."
          energyCost L, C, C
          onAttack {
            damage 50
          }
        }
      };
      case DRAGONAIR_DELTA_28:
      return evolution (this, from:"Dratini", hp:HP070, type:G, retreatCost:2) {
        move "Wrap", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Horn Attack", {
          text "40 damage."
          energyCost G, C, C
          onAttack {
            damage 40
          }
        }
      };
      case ELECTABUZZ_DELTA_29:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness F
        pokePower "Power of Evolution", {
          text "Once during your turn (before your attack), if Electabuzz is an Evolved Pokémon, you may draw a card from the bottom of your deck. This power can't be used if Electabuzz is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert self.evolution : "This Electabuzz is not an Evolved Pokemon"
            assert my.deck : "Deck is empty"

            powerUsed()
            my.deck.subList(my.deck.size() - 1, my.deck.size()).moveTo(hidden:true, my.hand)
          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost F, C
          onAttack {
            swiftDamage(30, defending)
          }
        }
      };
      case FLAAFFY_DELTA_30:
      return evolution (this, from:"Mareep", hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case HORSEA_DELTA_31:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Reverse Thrust", {
          text "20 damage. Switch Horsea with 1 of your Benched Pokémon."
          energyCost F, C
          onAttack {
            damage 20
            switchYourActive()
          }
        }
      };
      case KIRLIA_32:
      return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
        move "Link Blast", {
          text "60 damage. If Kirlia and the Defending Pokémon have a different amount of Energy attached to them, this attack's base damage is 30 instead of 60."
          energyCost P, C, C
          onAttack {
            if (self.cards.energyCount(C) != defending.cards.energyCount(C)) {
              damage 30
            } else {
              damage 60
            }
          }
        }
      };
      case KIRLIA_DELTA_33:
      return evolution (this, from:"Ralts", hp:HP070, type:R, retreatCost:1) {
        weakness P
        move "Flickering Flames", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost R, C
          onAttack {
            damage 20
            applyAfterDamage ASLEEP
          }
        }
        move "Smack", {
          text "40 damage."
          energyCost R, C, C
          onAttack {
            damage 40
          }
        }
      };
      case NIDORINA_DELTA_34:
      return evolution (this, from:"Nidoran♀", hp:HP070, type:M, retreatCost:1) {
        weakness P
        move "Poison Sting", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost C, C
          onAttack {
            damage 10
            applyAfterDamage POISONED
          }
        }
        move "Rear Kick", {
          text "40 damage."
          energyCost M, C, C
          onAttack {
            damage 40
          }
        }
      };
      case NIDORINO_DELTA_35:
      return evolution (this, from:"Nidoran♂", hp:HP070, type:D, retreatCost:1) {
        weakness P
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Nidorino."
          energyCost D, C
          onAttack {
            damage 10 + 10 * self.numberOfDamageCounters
          }
        }
        move "Horn Drill", {
          text "30 damage."
          energyCost C, C, C
          onAttack {
            damage 30
          }
        }
      };
      case QUILAVA_DELTA_36:
      return evolution (this, from:"Cyndaquil", hp:HP070, type:P, retreatCost:1) {
        weakness W
        move "Smash Kick", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Quick Attack", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost P, C, C
          onAttack {
            damage 30
            flip { damage 20 }
          }
        }
      };
      case SEADRA_DELTA_37:
      return evolution (this, from:"Horsea", hp:HP070, type:F, retreatCost:1) {
        weakness L
        move "Ram", {
          text "20 damage."
          energyCost F, C
          onAttack {
            damage 20
          }
        }
        move "Extra Ball", {
          text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 30 more damage."
          energyCost C, C, C
          onAttack {
            damage 30
            if (defending.EX) {
              damage 30
            }
          }
        }
      };
      case SHELGON_DELTA_38:
      return evolution (this, from:"Bagon", hp:HP070, type:W, retreatCost:2) {
        move "Headbutt", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Double-edge", {
          text "50 damage. Shelgon does 10 damage to itself."
          energyCost W, C, C
          onAttack {
            damage 50
            damage 10, self
          }
        }
      };
      case SMEARGLE_DELTA_39:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness F
        move "Collect", {
          text "Draw a card."
          energyCost C
          onAttack {
            draw 1
          }
        }
        move "Flickering Tail", {
          text "10+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 10 damage plus 10 more damage and the Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            if (defending.EX) {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
        }
      };
      case SWELLOW_DELTA_40:
      return evolution (this, from:"Taillow", hp:HP070, type:R, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokeBody "Extra Wing", {
          text "The Retreat Cost for each of your Stage 2 Pokémon-ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST) {holder->
            def target = holder.effect.target
            if (target.topPokemonCard.cardTypes.is(STAGE2) && target.EX) {
              holder.object = 0
            }
          }
        }
        move "Agility", {
          text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Swellow during your opponent's next turn."
          energyCost R, C
          onAttack {
            damage 30
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case TOGEPI_DELTA_41:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness F
        move "Charm", {
          text "During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 20 (before applying Weakness and Resistance)."
          energyCost W
          onAttack {
            reduceDamageFromDefendingNextTurn(hp(20),thisMove,defending)
          }
        }
      };
      case VIBRAVA_DELTA_42:
      return evolution (this, from:"Trapinch", hp:HP070, type:P, retreatCost:1) {
        move "Bite", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Sonic Noise", {
          text "30 damage. If the Defending Pokémon is Pokémon-ex, that Pokémon is now Confused."
          energyCost P, C
          onAttack {
            damage 30
            if (defending.EX) {
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case BAGON_DELTA_43:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        move "Granite Head", {
          text "10 damage. During your opponent's next turn, any damage done to Bagon by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost W
          onAttack {
            damage 10
            reduceDamageNextTurn(hp(10), thisMove)
          }
        }
      };
      case CHIKORITA_DELTA_44:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Sleep Powder", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
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
      case CYNDAQUIL_DELTA_45:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness W
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost P, C
          onAttack {
            swiftDamage(30, defending)
          }
        }
      };
      case DRATINI_DELTA_46:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        move "Ram", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case EKANS_DELTA_47:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness P
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Tail Snap", {
          text "20 damage."
          energyCost R, C
          onAttack {
            damage 20
          }
        }
      };
      case ELEKID_DELTA_48:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Electabuzz from your hand onto Elekid (this counts as evolving Elekid) and remove all damage counters from Elekid."
          actionA {
            checkCanBabyEvolve("Electabuzz", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Electabuzz", self)
          }
        }
        move "Thunder Spear", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          onAttack {
            damage 10, opp.all.select()
          }
        }
      };
      case FEEBAS_DELTA_49:
      return basic (this, hp:HP030, type:R, retreatCost:1) {
        weakness L
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Feebas."
          energyCost R
          attackRequirement {
            assert self.numberOfDamageCounters : "$self has no damage counters on it"
          }
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case HORSEA_DELTA_50:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness L
        move "Sleepy Ball", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            applyAfterDamage ASLEEP
          }
        }
      };
      case LARVITAR_51:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Bite", {
          text "10 damage."
          energyCost F
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "20 damage."
          energyCost F, C
          onAttack {
            damage 20
          }
        }
      };
      case LARVITAR_DELTA_52:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness G
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Horn Attack", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case LEDYBA_DELTA_53:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost M
          onAttack {
            flip { apply CONFUSED }
          }
        }
      };
      case MAREEP_DELTA_54:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Tail Whap", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case NATU_DELTA_55:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness P
        move "Flop", {
          text "10 damage."
          energyCost D
          onAttack {
            damage 10
          }
        }
      };
      case NIDORAN_FEMALE_DELTA_56:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness P
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
          energyCost C
          onAttack {
            flip { cantAttackNextTurn defending }
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
      case NIDORAN_MALE_DELTA_57:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness P
        move "Peck", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Poison Horn", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost D
          onAttack {
            flip { apply POISONED }
          }
        }
      };
      case PUPITAR_58:
      return evolution (this, from:"Larvitar", hp:HP070, type:F, retreatCost:1) {
        weakness W
        move "Headbutt", {
          text "20 damage."
          energyCost F
          onAttack {
            damage 20
          }
        }
      };
      case PUPITAR_DELTA_59:
      return evolution (this, from:"Larvitar", hp:HP070, type:L, retreatCost:1) {
        weakness G
        move "Hyper Beam", {
          text "20 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost L, C
          onAttack {
            damage 20
            afterDamage {
              flip { discardDefendingEnergy() }
            }
          }
        }
      };
      case RALTS_60:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Psychic Boom", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost P
          attackRequirement {
            assert defending.cards.energyCount() : "The defending Pokémon has no energy on it"
          }
          onAttack {
            damage 10*defending.cards.energyCount()
          }
        }
      };
      case RALTS_DELTA_61:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness P
        move "Calm Mind", {
          text "Remove 2 damage counters from Ralts."
          energyCost C
          onAttack {
            heal 20, self
          }
        }
        move "Will-o'-the-wisp", {
          text "20 damage."
          energyCost R, C
          onAttack {
            damage 20
          }
        }
      };
      case SEEL_DELTA_62:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        move "Pound", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Aurora Beam", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case SHELLDER_DELTA_63:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness L
        move "Shell Grab", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost F
          onAttack {
            damage 10
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case SMOOCHUM_DELTA_64:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness P
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Jynx from your hand onto Smoochum (this counts as evolving Smoochum) and remove all damage counters from Smoochum."
          actionA {
            checkCanBabyEvolve("Jynx", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Jynx", self)
          }
        }
        move "Alluring Kiss", {
          text "Search your deck for a Basic Pokémon and a basic Energy card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          onAttack {
            def tar = my.deck.search(max: 2, "Search your deck for a Basic Pokémon and a Basic Energy card.", {it.cardTypes.is(BASIC) || it.cardTypes.is(BASIC_ENERGY)}, { CardList list ->
              list.filterByType(BASIC).size() <= 1 && list.filterByType(BASIC_ENERGY).size() <= 1
            })

            if (tar) { tar.showToOpponent("Opponent used Alluring Kiss.").moveTo(my.hand) }
            shuffleDeck()
          }
        }
      };
      case SWABLU_DELTA_65:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Splash About", {
          text "10+ damage. If Swablu has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
          energyCost W
          onAttack {
            damage 10
            if (self.cards.energyCount(C) < defending.cards.energyCount(C)) {
              damage 10
            }
          }
        }
      };
      case TAILLOW_DELTA_66:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost R
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
      };
      case TOTODILE_DELTA_67:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness L
        move "Scratch", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Totodile."
          energyCost L, C
          onAttack {
            damage 10 + 10 * self.numberOfDamageCounters
          }
        }
      };
      case TRAPINCH_DELTA_68:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness G
        move "Gnaw", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Dig", {
          text "20 damage."
          energyCost P, C
          onAttack {
            damage 20
          }
        }
      };
      case TRAPINCH_DELTA_69:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness G
        move "Quick Bind", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost P
          onAttack {
            swiftDamage (10, opp.all.select())
          }
        }
      };
      case VULPIX_DELTA_70:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness W
        move "Hypnotic Gaze", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Will-o'-the-wisp", {
          text "20 damage."
          energyCost P, C
          onAttack {
            damage 20
          }
        }
      };
      case WOOPER_DELTA_71:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness G
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          onAttack {
            amnesia delegate
          }
        }
        move "Tail Slap", {
          text "20 damage."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case BUFFER_PIECE_72:
      return pokemonTool (this) {
        text "Attach Buffer Piece to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card." +
          "Damage done to the Pokémon Buffer Piece is attached to by an opponent's attack is reduced by 20 (after applying Weakness and Resistance). At the end of your opponent's turn after you played Buffer Piece, discard Buffer Piece."
        def eff
        onPlay {reason->
          eff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if (bg.currentTurn != self.owner && it.notNoEffect && it.to == self) {
                  bc "Buffer Piece -20"
                  it.dmg -= hp(20)
                }
              }
            }
            unregister {discard thisCard}
            unregisterAfter 2
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case COPYCAT_73:
      return copy(TeamRocketReturns.COPYCAT_83, this);
      case HOLON_LEGACY_74:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each Pokémon in play that has δ on its card in play (both yours and your opponent's) has no Weakness and can't use any Poké-Powers."
        def eff
        def eff2
        onPlay {
          eff = getter (GET_WEAKNESSES) { h->
            if (h.effect.target.topPokemonCard.cardTypes.is(DELTA)) {
              h.object.clear()
            }
          }
          eff2 = getter (IS_ABILITY_BLOCKED) { Holder h ->
            if (h.effect.target.topPokemonCard.cardTypes.is(DELTA)) {
              if (h.effect.ability instanceof PokePower) {
                h.object=true
              }
            }
          }
          new CheckAbilities().run(bg)
        }
        onRemoveFromPlay {
          eff.unregister()
          eff2.unregister()
          new CheckAbilities().run(bg)
        }
      };
      case HOLON_MENTOR_75:
      return copy(DeltaSpecies.HOLON_MENTOR_93, this);
      case ISLAND_HERMIT_76:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Choose up to 2 of your Prize cards and put them face up. (These cards remain face up for the rest of the game.) Draw 2 cards."
        onPlay {
          if (my.prizeCardSet.faceDownCards) {
            def maxPrizes = Math.min(2, my.prizeCardSet.faceDownCards.size())
            def sel = my.prizeCardSet.faceDownCards.select(min: 1, max: maxPrizes, hidden:true, "Reveal a prize card")
            sel.each{
              bc "$it was revealed"
              my.prizeCardSet.setVisible(it, true)
            }
          } else {
            bc "All of ${my.owner.getPlayerUsername(bg)}'s Prize cards are already face up!"
          }
          draw 2
        }
        playRequirement{
        }
      };
      case MR_STONE_S_PROJECT_77:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. Or, search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand."
        onPlay {
          def choice = 1
          if (my.deck && my.discard.hasType(BASIC_ENERGY)){
            choice = choose([1,2],['Search your Deck', 'Search your Discard Pile'], "Where to search for up to 2 basic Energy cards?")
          }

          if (choice == 1 && my.deck) {
            my.deck.search(max:2, "Choose up to 2 basic Energy cards to move to your hand.",cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            shuffleDeck()
          } else {
            if (my.discard.filterByType(BASIC_ENERGY)) {
              my.discard.filterByType(BASIC_ENERGY).select(min: 1, max: 2, "Select up to 2 basic Energy cards to move to your hand.").moveTo(my.hand)
            }
          }
        }
        playRequirement{
          assert ( my.deck.notEmpty || my.discard.hasType(BASIC_ENERGY)) : "You have no cards in deck, and there are no Basic Energy cards in your discard pile"
        }
      };
      case OLD_ROD_78:
      return itemCard (this) {
        text "Flip 2 coins. If both are heads, search your discard pile for a Basic Pokémon or Evolution card, show it to your opponent, and put it into your hand. If both are tails, search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
        onPlay {
          def allHeads = true
          def allTails = true
          flip 2, {
            allTails = false
          }, {
            allHeads = false
          }

          if (allHeads) {
            if (my.discard.filterByType(POKEMON)) {
              my.discard.filterByType(POKEMON).select(count: 1, "Search your discard pile for a Pokémon card.").showToOpponent("Your opponent played Old Rod.").moveTo(my.hand)
            } else {
              bc "There are no Pokémon cards in ${my.owner.getPlayerUsername(bg)}'s discard pile."
            }
          } else if (allTails){
            if (my.discard.filterByType(TRAINER)) {
              my.discard.filterByType(TRAINER).select(count: 1, "Search your discard pile for a Trainer card.").showToOpponent("Your opponent played Old Rod.").moveTo(my.hand)
            } else {
              bc "There are no Trainer cards in ${my.owner.getPlayerUsername(bg)}'s discard pile."
            }
          }
        }
        playRequirement{
          assert my.discard.hasType(POKEMON) || my.discard.hasType(TRAINER) : "You don't have any Pokémon or Trainer cards in your discard pile"
        }
      };
      case PROFESSOR_ELM_S_TRAINING_METHOD_79:
      return copy(HeartgoldSoulsilver.PROFESSOR_ELM_S_TRAINING_METHOD_100, this)
      case PROFESSOR_OAK_S_RESEARCH_80:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Shuffle your hand into your deck, then draw 5 cards."
        onPlay {
          my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
          shuffleDeck()
          draw 5
        }
        playRequirement{
          assert my.deck.notEmpty || (my.hand.getExcludedList(thisCard).size() != 0)
        }
      };
      case STRENGTH_CHARM_81:
      return copy(Deoxys.STRENGTH_CHARM_92, this);
      case TV_REPORTER_82:
      return copy(CelestialStorm.TV_REPORTER_149, this);
      case SWITCH_83:
      return copy(FireRedLeafGreen.SWITCH_102, this);
      case HOLON_ENERGY_FF_84:
      return copy(DeltaSpecies.HOLON_ENERGY_FF_104, this);
      case HOLON_ENERGY_GL_85:
      return copy(DeltaSpecies.HOLON_ENERGY_GL_105, this);
      case HOLON_ENERGY_WP_86:
      return copy(DeltaSpecies.HOLON_ENERGY_WP_106, this);
      case BOOST_ENERGY_87:
      return copy(Deoxys.BOOST_ENERGY_93, this);
      case DELTA_RAINBOW_ENERGY_88:
      return copy(HolonPhantoms.DELTA_RAINBOW_ENERGY_98, this);
      case SCRAMBLE_ENERGY_89:
      return copy(Deoxys.SCRAMBLE_ENERGY_95, this);
      case ALTARIA_EX_DELTA_90:
      return evolution (this, from:"Swablu", hp:HP100, type:W, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokePower "Extra Boost", {
          text "Once during your turn (before your attack), you may attach a basic Energy card from your hand to 1 of your Stage 2 Pokémon-ex. This power can't be used if Altaria ex is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.hand.filterByType(BASIC_ENERGY) : "No Basic Energy in Hand"
            assert my.all.any{ it.EX && it.topPokemonCard.cardTypes.is(STAGE2) } : "No Stage 2 Pokemon-ex in play"
            powerUsed()
            def tar = my.all.findAll{ it.EX && it.topPokemonCard.cardTypes.is(STAGE2) }.select()
            attachEnergyFrom(basic: true, my.hand, tar)
          }
        }
        move "Healing Light", {
          text "60 damage. Remove 1 damage counter from each of your Pokémon."
          energyCost W, C, C
          onAttack {
            damage 60
            my.all.each{
              heal 10, it
            }
          }
        }
      };
      case DRAGONITE_EX_DELTA_91:
      return evolution (this, from:"Dragonair", hp:HP150, type:G, retreatCost:2) {
        move "Deafen", {
          text "40 damage. Your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand during your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 40

            delayed {
              before PLAY_TRAINER, {
                if (!ef.cardToPlay.cardTypes.is(SUPPORTER) && bg.currentTurn == self.owner.opposite) {
                  wcu "Deafen prevents playing trainer cards"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }
        move "Dragon Roar", {
          text "Put 8 damage counters on the Defending Pokémon. If that Pokémon would be Knocked Out by this attack, you may put any damage counters not necessary to Knock Out the Defending Pokémon on your opponent's Benched Pokémon in any way you like."
          energyCost G, G, C, C
          onAttack {
            targeted (defending) {
              def remainingHp = defending.getRemainingHP().value
              def excessDamageCounters = (80 - remainingHp) / 10

              delayed {
                def pcs = defending
                before KNOCKOUT, pcs, {
                  if (excessDamageCounters && opp.bench) {
                    for (i in 1..excessDamageCounters){
                      def tar = opp.bench.select("Move a damage counter from $defending to some of your opponent's benched Pokémon? There are still ${excessDamageCounters - i + 1} available counters to move (Cancel to stop)", false)
                      if(!tar) break;
                      directDamage 10, tar
                    }
                  }
                  unregister()
                }
                unregisterAfter 1
              }
              directDamage 80, defending
            }
          }
        }
      };
      case FLYGON_EX_DELTA_92:
      return evolution (this, from:"Vibrava", hp:HP150, type:P, retreatCost:2) {
        pokeBody "Sand Damage", {
          text "As long as Flygon ex is your Active Pokémon, put 1 damage counter on each of your opponent's Benched Basic Pokémon between turns. You can't use more than 1 Sand Damage Poké-Body between turns."
          delayedA {
            before BEGIN_TURN, {
              boolean flag = true
              if (self.active) {
                self.owner.opposite.pbg.bench.each {
                  if (it.notEvolution) {
                    if(flag) {bc "Sand Damage activates"; flag = false}
                    directDamage 10, it, SRC_ABILITY
                  }
                }
              }
            }
          }
        }
        move "Psychic Pulse", {
          text "80 damage. Does 10 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, P, C
          onAttack {
            damage 80

            opp.bench.each {
              if (it.numberOfDamageCounters) {
                damage 10, it
              }
            }
          }
        }
      };
      case GARDEVOIR_EX_DELTA_93:
      return evolution (this, from:"Kirlia", hp:HP150, type:R, retreatCost:2) {
        weakness P
        def Imprison = []
        def actions = []
        def imprisonLoader = {
          bg.em().storeObject("Imprison_Loaded",true)

          loadMarkerCheckerAction(delegate, actions)

          delayed {
            getter (IS_ABILITY_BLOCKED) { Holder h ->
              if(bg.em().retrieveObject("Imprison") != null){
                Imprison = bg.em().retrieveObject("Imprison")
              }
              if (Imprison.contains(h.effect.target)) {
                if (h.effect.ability instanceof PokePower || h.effect.ability instanceof PokeBody) {
                  h.object=true
                }
              }
            }
          }
        }
        globalAbility {Card thisCard ->
          def temp
          delayed {
            after EVOLVE, {
              if(bg.em().retrieveObject("Imprison") != null){
                Imprison = bg.em().retrieveObject("Imprison")
              }
              if (Imprison.contains(ef.pokemonToBeEvolved)) {
                bc "${ef.pokemonToBeEvolved} loses its Imprison marker when evolved!"
                Imprison.remove(ef.pokemonToBeEvolved)
                bg.em().storeObject("Imprison",Imprison)
              }
            }
            before DEVOLVE, {temp = opp.all}
            after DEVOLVE, {
              opp.all.findAll{!temp.contains(it)}.each{
                if(bg.em().retrieveObject("Imprison") != null){
                  Imprison = bg.em().retrieveObject("Imprison")
                }
                if (Imprison.contains(it)) {
                  bc "${it} loses its Imprison marker when devolved!"
                  Imprison.remove(it)
                  bg.em().storeObject("Imprison",Imprison)
                }
              }
            }
            //TODO: Find correct replacement for "pokemonToBeDevolved", to remove above code and use the one below.
            /* after DEVOLVE, {
              if(bg.em().retrieveObject("Imprison") != null){
                Imprison = bg.em().retrieveObject("Imprison")
              }
              if (Imprison.contains(ef.pokemonToBeDevolved)) {
                bc "${ef.pokemonToBeDevolved} loses its Imprison marker when devolved!"
                Imprison.remove(ef.pokemonToBeDevolved)
                bg.em().storeObject("Imprison", Imprison)
              }
            } */
          }
        }
        pokePower "Imprison", {
          text "Once during your turn (before your attack), if Gardevoir ex is your Active Pokémon, you may put an Imprison marker on 1 of your opponent's Pokémon. Any Pokémon that has any Imprison markers on it can't use any Poké-Powers or Poké-Bodies. This power can't be used if Gardevoir ex is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert self.active : "$self is not your Active Pokémon"

            if(bg.em().retrieveObject("Imprison") != null){
              Imprison = bg.em().retrieveObject("Imprison")
            }
            //Imprison_Loaded checks if an action setter was already triggered
            def isImprisonLoaded = bg.em().retrieveObject("Imprison_Loaded")
            if (!isImprisonLoaded) imprisonLoader.call()


            assert opp.all.any{!Imprison.contains(it)} : "All of your opponent's Pokémon already have Imprison counters"
            powerUsed()
            def tar = opp.all.select("Choose a pokemon to put an Imprison marker on:")
            while (Imprison.contains(tar)){
              tar = opp.all.select("$tar already has an Imprison marker.\n\nChoose a pokemon to put an Imprison marker on:")
            }
            targeted (tar, SRC_ABILITY){
              Imprison.add(tar)
              bc "$tar received an Imprison marker"
              bg.em().storeObject("Imprison",Imprison)
              new CheckAbilities().run(bg)
            }
          }
        }
        move "Flame Ball", {
          text "80 damage. You may move a [R] Energy card attached to Gardevoir ex to 1 of your Benched Pokémon."
          energyCost R, C, C
          onAttack {
            damage 80
            afterDamage {
              if (self.cards.filterByEnergyType(R) && my.bench && confirm("Move a [R] Energy attached to $self to 1 of your Benched Pokémon?")) {
                def energy = self.cards.filterByEnergyType(R).select("Energy To Move").first()
                energySwitch(self, my.bench.select(), energy)
              }
            }
          }
        }
      };
      case KINGDRA_EX_DELTA_94:
      return evolution (this, from:"Seadra", hp:HP140, type:F, retreatCost:1) {
        weakness L
        pokeBody "Extra Smoke", {
          text "Any damage done to your Stage 2 Pokémon-ex by your opponent's attacks is reduced by 10 (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker.owner != self.owner) {
                bg.dm().each {
                  if (it.to.owner == self.owner && it.to.EX && it.to.topPokemonCard.cardTypes.is(STAGE2) && it.dmg.value) {
                    bc "Extra Smoke -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
        }
        move "Energy Link", {
          text "40 damage. Search your discard pile for an Energy card and attach it to Kingdra ex."
          energyCost F, C
          onAttack {
            damage 40
            afterDamage{
              attachEnergyFrom(my.discard, self)
            }
          }
        }
        move "Protective Swirl", {
          text "80 damage. Kingdra ex has no Weakness during your opponent's next turn."
          energyCost F, C, C
          onAttack {
            damage 80

            delayed {
              def eff
              register {
                eff = getter (GET_WEAKNESSES, self) {h->
                  h.object.clear()
                }
              }
              unregister {
                eff.unregister()
              }
              unregisterAfter 2
              after FALL_BACK, self, { unregister() }
              after EVOLVE, self, { unregister() }
              after DEVOLVE, self, { unregister() }
            }
          }
        }
      };
      case LATIAS_EX_DELTA_95:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness P
        pokePower "Fellow Boost", {
          text "Once during your turn (before your attack), you may attach a basic Energy card from your hand to your Latias, Latias ex, Latios or Latios ex. If you do, your turn ends. This power can't be used if Latias ex is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.hand.filterByType(BASIC_ENERGY) : "No Basic Energy in hand"
            assert my.all.any{ ["Latias", "Latias ex", "Latios", "Latios ex"].contains(it.name) }
            powerUsed()
            def eligible = my.all.findAll { ["Latias", "Latias ex", "Latios", "Latios ex"].contains(it.name) }
            attachEnergyFrom(basic:true, my.hand, eligible.select("Attach to"))
            bg.gm().betweenTurns()
          }
        }
        move "Power Crush", {
          text "90 damage. If the Defending Pokémon is Knocked Out by this attack, discard 2 [R] Energy attached to Latias ex."
          energyCost R, R, C
          onAttack {
            damage 90
            //Would a slatedToKO inside afterDamage work fine here? -starg
            delayed {
              def pcs = defending
              after KNOCKOUT, pcs, {
                discardSelfEnergy R,R
                unregister()
              }
              unregisterAfter 1
            }
          }
        }
      };
      case LATIOS_EX_DELTA_96:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness P
        pokeBody "Link Wing", {
          text "The Retreat Cost for each of your Latias, Latias ex, Latios, and Latios ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST) {holder->
            def name = holder.effect.target.name
            if ( ["Latias", "Latias ex", "Latios", "Latios ex"].contains(name) ) {
              holder.object = 0
            }
          }
        }
        move "Ice Barrier", {
          text "30 damage. Prevent all effects of an attack, including damage, done to Latios ex by your opponent's Pokémon-ex during your opponent's next turn."
          energyCost W, C
          onAttack {
            damage 30
            preventAllEffectsFromCustomPokemonNextTurn(thisMove, self, {it.EX})
          }
        }
        move "Hydro Splash", {
          text "60 damage."
          energyCost W, C, C
          onAttack {
            damage 60
          }
        }
      };
      case RAYQUAZA_EX_DELTA_97:
      return basic (this, hp:HP110, type:L, retreatCost:2) {
        pokeBody "Rage Aura", {
          text "If you have more Prize cards left than your opponent, the attack cost of Rayquaza ex's Special Circuit is now [L] and Rayquaza ex's Sky-high Claws is now [L][L]."
          getterA GET_MOVE_LIST, BEFORE_LAST, self, {h->
            if (my.prizeCardSet.size() > opp.prizeCardSet.size()) {
              def list=[]
              for (move in h.object) {
                def copy=move.shallowCopy()
                if (copy.name == "Special Circuit") {
                  copy.energyCost.retainAll()
                  copy.energyCost.addAll([L])
                }
                if (copy.name == "Sky-high Claws") {
                  copy.energyCost.retainAll()
                  copy.energyCost.addAll([L, L])
                }
                list.add(copy)
              }
              h.object=list
            }
          }
        }
        move "Special Circuit", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. If you choose a Pokémon that has any Poké-Powers or Poké-Bodies, this attack does 50 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          onAttack {
            def tar = opp.all.select("Special Circuit - deal 30 damage to? (If has Poke-Powers or Poke-Bodies, it does 50 instead.")
            if (tar.abilities.keySet().find {it instanceof PokePower || it instanceof PokeBody}) {
              damage 50, tar
            } else {
              damage 30, tar
            }
          }
        }
        move "Sky-high Claws", {
          text "70 damage."
          energyCost L, L, C, C
          onAttack {
            damage 70
          }
        }
      };
      case SALAMENCE_EX_DELTA_98:
      return evolution (this, from:"Shelgon", hp:HP160, type:W, retreatCost:2) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        pokePower "Type Shift", {
          text "Once during your turn (before your attack), you may use this power. Salamence ex's type is Fire until the end of your turn."
          actionA {
            checkLastTurn()
            powerUsed()
            bc "$self's type is now Fire until the end of this turn."
            delayed {
              def eff
              register {
                eff = getter GET_POKEMON_TYPE, self, { h->
                  h.object.clear()
                  h.object.add(R)
                }
              }
              unregister {
                eff.unregister()
              }
              unregisterAfter 1
            }
          }
        }
        move "Claw Swipe", {
          text "60 damage."
          energyCost W, C, C
          onAttack {
            damage 60
          }
        }
        move "Dual Stream", {
          text "80 damage. You may do 40 damage instead of 80 to the Defending Pokémon. If you do, this attack does 40 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C, C
          onAttack {
            if (opp.bench && confirm("Deal 40 instead of 80 to Defending in order to do 40 damage to a Pokemon on the Opponent's bench?")) {
              damage 40
              damage 40, opp.bench.select("Select a benched Pokemon to deal 40 damage to")
            } else {
              damage 80
            }
          }
        }
      };
      case TYRANITAR_EX_DELTA_99:
      return evolution (this, from:"Pupitar", hp:HP150, type:L, retreatCost:3) {
        weakness G
        def Shock_Wave = []
        def actions = []
        def shockWaveLoader = {
          bg.em().storeObject("Shock_Wave_Loaded",true)

          loadMarkerCheckerAction(delegate, actions)
        }
        globalAbility {Card thisCard ->
          def temp
          delayed {
            after EVOLVE, {
              if(bg.em().retrieveObject("Shock_Wave") != null){
                Shock_Wave = bg.em().retrieveObject("Shock_Wave")
              }
              if (Shock_Wave.contains(ef.pokemonToBeEvolved)) {
                bc "${ef.pokemonToBeEvolved} loses its Shock-wave marker when evolved!"
                Shock_Wave.remove(ef.pokemonToBeEvolved)
                bg.em().storeObject("Shock_Wave",Shock_Wave)
              }
            }
            before DEVOLVE, {temp = opp.all}
            after DEVOLVE, {
              opp.all.findAll{!temp.contains(it)}.each{
                if(bg.em().retrieveObject("Shock_Wave") != null){
                  Shock_Wave = bg.em().retrieveObject("Shock_Wave")
                }
                if (Shock_Wave.contains(it)) {
                  bc "${it} loses its Shock-wave marker when devolved!"
                  Shock_Wave.remove(it)
                  bg.em().storeObject("Shock_Wave",Shock_Wave)
                }
              }
            }
            //TODO: Find correct term, to replace pokemonToBeDevolved
            /* after DEVOLVE, {
              if(bg.em().retrieveObject("Shock_Wave") != null){
                Shock_Wave = bg.em().retrieveObject("Shock_Wave")
              }
              if (Shock_Wave.contains(ef.pokemonToBeDevolved)) {
                bc "${ef.pokemonToBeDevolved} loses its Shock-wave marker when devolved!"
                Shock_Wave.remove(ef.pokemonToBeDevolved)
                bg.em().storeObject("Shock_Wave",Shock_Wave)
              }
            } */
          }
        }
        move "Electromark", {
          text "Put a Shock-wave marker on 1 of your opponent's Pokémon."
          energyCost L, C
          attackRequirement{
            if(bg.em().retrieveObject("Shock_Wave") != null){
              Shock_Wave = bg.em().retrieveObject("Shock_Wave")
            }
            //Shock_Wave_Loaded checks if another shockwave loader was already triggered
            def isShockWaveLoaded = bg.em().retrieveObject("Shock_Wave_Loaded")
            if(!isShockWaveLoaded) shockWaveLoader.call()

            assert opp.all.any{!Shock_Wave.contains(it)} : "All of your opponent's Pokémon already have Shock-wave markers on them"
          }
          onAttack {
            def tar = opp.all.select("Choose a pokemon to put an Shock-wave marker on:")
            while (Shock_Wave.contains(tar)){
              tar = opp.all.select("$tar already has an Shock-wave marker.\n\nChoose a pokemon to put an Shock-wave marker on:")
            }
            targeted (tar){
              Shock_Wave.add(tar)
              bc "$tar received a Shock-wave marker"
              bg.em().storeObject("Shock_Wave",Shock_Wave)
            }
          }
        }
        move "Hyper Claws", {
          text "70+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 70 damage plus 20 more damage."
          energyCost L, C, C
          onAttack {
            damage 70
            if (opp.active.topPokemonCard.cardTypes.is(STAGE2)) {
              damage 20
            }
          }
        }
        move "Shock-wave", {
          text "Choose 1 of your opponent's Pokémon that has any Shock-wave markers on it. That Pokémon is Knocked Out."
          energyCost L, L, C
          attackRequirement {
            if(bg.em().retrieveObject("Shock_Wave") != null){
              Shock_Wave = bg.em().retrieveObject("Shock_Wave")
            }
            //Check is also run here in case someone copies this first... for some reason.
            def isShockWaveLoaded = bg.em().retrieveObject("Shock_Wave_Loaded")
            if(!isShockWaveLoaded) shockWaveLoader.call()

            assert opp.all.any{Shock_Wave.contains(it)} : "None of your opponent's Pokémon have Shock-Wave markers on them"
          }
          onAttack {
            def tar = opp.all.select("Choose 1 of your opponent’s Pokémon that has any Shock-wave markers on it. That Pokémon will be Knocked Out.")
            while (!Shock_Wave.contains(tar)){
              tar = opp.all.select("$tar doesn't have a Shock-wave marker.\n\nChoose 1 of your opponent’s Pokémon that has any Shock-wave markers on it. That Pokémon will be Knocked Out.")
            }
            targeted (tar){
              Shock_Wave.remove(tar)
              bg.em().storeObject("Shock_Wave",Shock_Wave)
              new Knockout(tar).run(bg)
            }
          }
        }
      };
      case CHARIZARD_STAR_DELTA_100:
      return basic (this, hp:HP090, type:D, retreatCost:3) {
        weakness W
        move "Rotating Claws", {
          text "20 damage. You may discard an Energy card attached to Charizard Star. If you do, search your discard pile for an Energy card (excluding the one you discarded) and attach it to Charizard Star."
          energyCost D, C
          onAttack {
            damage 20
            afterDamage{
              if (my.discard.filterByType(ENERGY) && confirm("Rotating Claws - Discard an Energy to attach an Energy from your Discard Pile?")) {
                //TODO: Discard the energy first, and exclude it from the select.
                def energy = my.discard.filterByType(ENERGY).select()
                discardSelfEnergy(C)
                energy.each{
                  attachEnergy(self, it)
                }
              }
            }
          }
        }
        move "Dark Swirl", {
          text "150 damage. Discard all Energy cards attached to Charizard Star and discard the top 3 cards from your opponent's deck."
          energyCost D, D, D, D, C
          onAttack {
            damage 150
            afterDamage{
              discardAllSelfEnergy(null)
              if (opp.deck) opp.deck.subList(0, Math.min(3, opp.deck.size())).discard()
            }
          }
        }
      };
      case MEW_STAR_DELTA_101:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness P
        move "Mimicry", {
          text "Choose an attack on 1 of your opponent's Pokémon in play. Mimicry copies that attack. This attack does nothing if Mew Star doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Mew Star performs that attack."
          energyCost C
          onAttack {
            def tar = opp.all.select("Choose Pokemon to copy moves from")
            if (tar.topPokemonCard.moves) {
              def moveOptions = tar.topPokemonCard.moves
              //
              // [Temporary LV.X workaround]
              if (tar.topPokemonCard.cardTypes.is(CardType.LEVEL_UP)){
                //Only 3 LV.Xs right now, all stage 2 so this should do
                def tpc = tar.cards.find{car -> car.cardTypes.is(STAGE2) && car != tar.topPokemonCard}
                moveOptions += tpc.moves
              }
              // [End of LV.X workaround] TODO: Remove this when no longer needed
              //
              def move = choose(moveOptions + ["End Turn (Skip)"], "Choose 1 of the Pokémon's attacks.")
              if (move instanceof String) return
              def bef = blockingEffect(BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            } else {
              bc "Mimicry failed, couldn't find any moves in $tar.name"
            }
          }
        }
        move "Rainbow Wave", {
          text "Choose 1 basic Energy card attached to Mew Star. This attack does 20 damage to each of your opponent's Pokémon that is the same type as the basic Energy card that you chose. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {
            assert self.cards.filterByType(BASIC_ENERGY) : "This Pokemon has no Basic Energies."
          }
          onAttack {
            def energy = self.cards.filterByType(BASIC_ENERGY).select("Deal 20 damage to your opponent's Pokemon of the same type of the chosen Energy.")
            def type = energy.basicType
            bc "Rainbow Wave - Chosen type is $type"
            def flag = false
            opp.all.each {
              if (it.types.contains(type.get(0))) {
                flag = true
                damage 20, it
              }
            }
            if (!flag) bc "$thisMove failed! None of the opponent's Pokémon were ${type} type."
          }
        }
      };
      default:
      return null;
    }
  }

}
