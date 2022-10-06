package tcgwars.logic.impl.gen8

import tcgwars.logic.TargetPlayer
import tcgwars.logic.card.*
import tcgwars.logic.effect.basic.Knockout
import tcgwars.logic.effect.basic.Move
import tcgwars.logic.impl.gen3.TeamRocketReturns
import tcgwars.logic.impl.gen5.PlasmaStorm
import tcgwars.logic.util.CardTypeSet
import tcgwars.logic.util.TypeSet

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.HP.*
import static tcgwars.logic.card.Resistance.ResistanceType.MINUS30
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.effect.EffectType.APPLY_ATTACK_DAMAGES
import static tcgwars.logic.effect.EffectType.CHECK_ATTACK_REQUIREMENTS
import static tcgwars.logic.effect.EffectType.GET_MOVE_LIST
import static tcgwars.logic.effect.EffectType.KNOCKOUT
import static tcgwars.logic.effect.EffectType.PROCESS_ATTACK_EFFECTS
import static tcgwars.logic.effect.ability.Ability.ActivationReason.PLAY_FROM_HAND
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*

/**
 * @author lithogenn@gmail.com
 */
public enum SkyscrapingPerfection implements LogicCardInfo {

  SUICUNE_V_1 ("Suicune V", "1", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  LOTAD_2 ("Lotad", "2", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LOMBRE_3 ("Lombre", "3", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LUDICOLO_4 ("Ludicolo", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PANPOUR_5 ("Panpour", "5", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SIMIPOUR_6 ("Simipour", "6", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CLAUNCHER_7 ("Clauncher", "7", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CLAWITZER_8 ("Clawitzer", "8", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  EISCUE_9 ("Eiscue", "9", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  JIGGLYPUFF_10 ("Jigglypuff", "10", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WIGGLYTUFF_11 ("Wigglytuff", "11", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_ARTICUNO_12 ("Galarian Articuno", "12", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  WOBBUFFET_13 ("Wobbuffet", "13", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SIGILYPH_14 ("Sigilyph", "14", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_V_15 ("Golurk V", "15", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  PUMPKABOO_16 ("Pumpkaboo", "16", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOURGEIST_17 ("Gourgeist", "17", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HITMONCHAN_18 ("Hitmonchan", "18", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GALARIAN_ZAPDOS_19 ("Galarian Zapdos", "19", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  GLIGAR_20 ("Gligar", "20", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLISCOR_21 ("Gliscor", "21", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAKUHITA_22 ("Makuhita", "22", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HARIYAMA_23 ("Hariyama", "23", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LYCANROC_V_24 ("Lycanroc V", "24", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  LYCANROC_VMAX_25 ("Lycanroc VMAX", "25", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  GALARIAN_MOLTRES_26 ("Galarian Moltres", "26", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ABSOL_27 ("Absol", "27", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  CROAGUNK_28 ("Croagunk", "28", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TOXICROAK_29 ("Toxicroak", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GARBODOR_V_30 ("Garbodor V", "30", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GARBODOR_VMAX_31 ("Garbodor VMAX", "31", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  NICKIT_32 ("Nickit", "32", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_33 ("Thievul", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MEOWTH_34 ("Galarian Meowth", "34", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_35 ("Galarian Perrserker", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  SKARMORY_36 ("Skarmory", "36", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  KLEFKI_37 ("Klefki", "37", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  CUFANT_38 ("Cufant", "38", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_39 ("Copperajah", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ALTARIA_40 ("Altaria", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  DIALGA_41 ("Dialga", "41", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  DEINO_42 ("Deino", "42", Rarity.COMMON, [POKEMON, BASIC, _DRAGON_]),
  ZWEILOUS_43 ("Zweilous", "43", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
  HYDREIGON_44 ("Hydreigon", "44", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
  KYUREM_45 ("Kyurem", "45", Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
  NOIVERN_V_46 ("Noivern V", "46", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DRAMPA_47 ("Drampa", "47", Rarity.UNCOMMON, [POKEMON, BASIC, _DRAGON_]),
  DURALUDON_V_48 ("Duraludon V", "48", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DURALUDON_VMAX_49 ("Duraludon VMAX", "49", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  SLAKOTH_50 ("Slakoth", "50", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  VIGOROTH_51 ("Vigoroth", "51", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SLAKING_52 ("Slaking", "52", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  SWABLU_53 ("Swablu", "53", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  WOOLOO_54 ("Wooloo", "54", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DUBWOOL_55 ("Dubwool", "55", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ESCAPE_ROPE_56 ("Escape Rope", "56", Rarity.UNCOMMON, [TRAINER, ITEM]),
  EVOLUTION_INCENSE_57 ("Evolution Incense", "57", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SWITCHEROO_CUP_58 ("Switcheroo Cup", "58", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RESCUE_TROLLEY_59 ("Rescue Trolley", "59", Rarity.UNCOMMON, [TRAINER, ITEM]),
  DIGGING_GLOVES_60 ("Digging Gloves", "60", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  SINGLE_STRIKE_SCROLL_OF_THE_DRAGON_FANG_61 ("Single Strike Scroll of the Dragon Fang", "61", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  FULL_FACE_GUARD_62 ("Full Face Guard", "62", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  RAIHAN_63 ("Raihan", "63", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SCHOOLGIRL_64 ("Schoolgirl", "64", Rarity.COMMON, [TRAINER, SUPPORTER]),
  COPYCAT_65 ("Copycat", "65", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRYSTAL_CAVE_66 ("Crystal Cave", "66", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TWIN_ENERGY_67 ("Twin Energy", "67", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  SUICUNE_V_68 ("Suicune V", "68", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GOLURK_V_69 ("Golurk V", "69", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GOLURK_V_70 ("Golurk V", "70", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  LYCANROC_V_71 ("Lycanroc V", "71", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  GARBODOR_V_72 ("Garbodor V", "72", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  NOIVERN_V_73 ("Noivern V", "73", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  NOIVERN_V_74 ("Noivern V", "74", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DURALUDON_V_75 ("Duraludon V", "75", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  DURALUDON_V_76 ("Duraludon V", "76", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DRAGON_]),
  RAIHAN_77 ("Raihan", "77", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SCHOOLGIRL_78 ("Schoolgirl", "78", Rarity.COMMON, [TRAINER, SUPPORTER]),
  COPYCAT_79 ("Copycat", "79", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LYCANROC_VMAX_80 ("Lycanroc VMAX", "80", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _FIGHTING_]),
  GARBODOR_VMAX_81 ("Garbodor VMAX", "81", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  DURALUDON_VMAX_82 ("Duraludon VMAX", "82", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  DURALUDON_VMAX_83 ("Duraludon VMAX", "83", Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DRAGON_]),
  RAIHAN_84 ("Raihan", "84", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SCHOOLGIRL_85 ("Schoolgirl", "85", Rarity.COMMON, [TRAINER, SUPPORTER]),
  COPYCAT_86 ("Copycat", "86", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRESSELIA_87 ("Cresselia", "87", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  FULL_FACE_GUARD_88 ("Full Face Guard", "88", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  CRYSTAL_CAVE_89 ("Crystal Cave", "89", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  METAL_ENERGY_90 ("Metal Energy", "90", Rarity.COMMON, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SkyscrapingPerfection(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SKYSCRAPING_PERFECTION;
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
      case SUICUNE_V_1:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        bwAbility "Quick Feet", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may draw a card."
          actionA {
            checkLastTurn()
            assert self.active : "$self must be in the Active Spot"
            assert deck : "Deck is empty"
            powerUsed()
            draw 1
          }
        }
        move "Blizzard Rondo", {
          text "20+ damage. This attack does 20 more damage for each Benched Pokémon (both yours and your opponent's)."
          energyCost W, C
          onAttack {
            damage 20 + 20 * all.findAll { it.benched }.size()
          }
        }
      };
      case LOTAD_2:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Call for Family", {
          text " Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          callForFamily basic: true, 2, delegate
        }
        move "Rain Splash", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case LOMBRE_3:
      return evolution (this, from:"Lotad", hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "50 damage."
          energyCost W, C
          onAttack {
            damage 50
          }
        }
      };
      case LUDICOLO_4:
      return evolution (this, from:"Lombre", hp:HP140, type:W, retreatCost:2) {
        weakness L
        bwAbility "High-Tension Dance", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may use this Ability. During this turn, your Basic Pokémon's attacks do 100 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          onActivate {r->
            if(r == PLAY_FROM_HAND && my.all.any{ it.basic } && confirm("Use $thisAbility.name")) {
              powerUsed()
              delayed {
                after PROCESS_ATTACK_EFFECTS, {
                  bg.dm().each {if (
                  it.to.active
                    && it.from.basic
                    && it.from.owner == thisCard.player
                    && it.to.owner != it.from.owner
                    && it.dmg.value) {
                    bc "$thisAbility.name +100"
                    it.dmg += hp 100
                  }}
                }
              }
            }
          }
        }
        move "Wave Splash", {
          text "120 damage."
          energyCost W, C
          onAttack {
            damage 120
          }
        }
      };
      case PANPOUR_5:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Shove", {
          text "10 damage. Your opponent reveals their hand."
          energyCost W
          onAttack {
            damage 10
            opp.hand.showToMe bg, "Your opponent's hand."
          }
        }
      };
      case SIMIPOUR_6:
      return evolution (this, from:"Panpour", hp:HP100, type:W, retreatCost:1) {
        weakness L
        move "Water Pulse", {
          text "20 damage. You opponent's Active Pokémon is now Asleep."
          energyCost W
          onAttack {
            damage 20
            applyAfterDamage ASLEEP
          }
        }
        move "Drench Circus", {
          text "60× damage. Your opponent reveals their hand. This attack does 60 damage for each Supporter card you find there."
          energyCost C, C
          attackRequirement {
            assert opp.hand : "Opponent's hand is empty"
          }
          onAttack {
            opp.hand.showToMe bg, "Your opponent's hand."
            damage 60 * opp.hand.count { it.cardTypes.is SUPPORTER }.intValue()
          }
        }
      };
      case CLAUNCHER_7:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness L
        move "Water Gun", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Vise Grip", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case CLAWITZER_8:
      return evolution (this, from:"Clauncher", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Snipe Shot", {
          text " This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          onAttack {
            damage 50, opp.all.select(text)
          }
        }
        move "Crabhammer", {
          text "110 damage."
          energyCost W, W, C
          onAttack {
            damage 110
          }
        }
      };
      case EISCUE_9:
      return basic (this, hp:HP120, type:W, retreatCost:2) {
        weakness M
        move "Icy Snow", {
          text "20 damage."
          energyCost W
          onAttack {
            damage 20
          }
        }
        move "Block Face", {
          text "70 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon."
          energyCost W, C, C
          onAttack {
            damage 70
            preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.basic }
          }
        }
      };
      case JIGGLYPUFF_10:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Pound", {
          text "20 damage."
          energyCost P
          onAttack {
            damage 20
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
      case WIGGLYTUFF_11:
      return evolution (this, from:"Jigglypuff", hp:HP120, type:P, retreatCost:2) {
        weakness M
        move "Find Treasure", {
          text " Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost P
          attackRequirement {
            assert deck : "Deck is empty"
          }
          onAttack {
            deck.select(max: 2).moveTo hidden: true, hand
            shuffleDeck()
          }
        }
        move "Hyper Voice", {
          text "90 damage."
          energyCost P, C, C
          onAttack {
            damage 90
          }
        }
      };
      case GALARIAN_ARTICUNO_12:
      return basic (this, hp:HP120, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Cruel Charge", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [P] Energy cards from your hand to it."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(P) && confirm("Use $thisAbility.name?")) {
              powerUsed()
              attachEnergyFrom max:2, type: P, my.hand, self
            }
          }
        }
        move "Psylaser", {
          text " Discard all [P] Energy from this Pokémon. This attack does 120 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, P, C
          onAttack {
            damage 120, opp.all.select("This attack does 120 damage to 1 of your opponent's Pokémon.")
            afterDamage {
              self.cards.filterByEnergyType(P).discard()
            }
          }
        }
      };
      case WOBBUFFET_13:
      return basic (this, hp:HP120, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Mirror Pain", {
          text " Put damage counters on your opponent's Active Pokémon equal to the number of damage counters on 1 of your Benched Pokémon."
          energyCost C, C
          attackRequirement {
            assert my.bench.any { it.numberOfDamageCounters } : "No damage counters on your Benched Pokémon"
          }
          onAttack {
            def info = "Pokémon with damage counters on your bench. That number of damage counters will be put on your opponent's Active Pokémon."
            def source = bench.findAll { it.numberOfDamageCounters }.select info
            directDamage source.numberOfDamageCounters * 10, defending
          }
        }
        move "Headbutt Bounce", {
          text "70 damage."
          energyCost P, C, C
          onAttack {
            damage 70
          }
        }
      };
      case SIGILYPH_14:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Joust", {
          text "20 damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon."
          energyCost C
          onAttack {
            defending.cards.filterByType(POKEMON_TOOL).discard()
            damage 20
          }
        }
        move "Reflect Energy", {
          text "60 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
          energyCost P, C
          onAttack {
            damage 60
            moveEnergy self, my.bench
          }
        }
      };
      case GOLURK_V_15:
      return basic (this, hp:HP220, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Mega Punch", {
          text "80 damage."
          energyCost P, C, C
          onAttack {
            damage 80
          }
        }
        move "Rewind Beam", {
          text "180 damage. If your opponent's Active Pokémon is an evolved Pokémon, devolve it by putting the highest Stage Evolution card on it into your opponent's hand."
          energyCost P, P, C, C
          onAttack {
            damage 180
            afterDamage {
              if (defending.evolution) {
                devolve defending, defending.topPokemonCard, defending.owner.pbg.hand
              }
            }
          }
        }
      };
      case PUMPKABOO_16:
      return basic (this, hp:HP060, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Pumpkin Hole", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard any Stadium in play."
          onActivate {reason ->
            if (reason == PLAY_FROM_HAND && bg().stadiumInfoStruct?.stadiumCard && confirm("Use $thisAbility.name?")) {
              powerUsed()
              discardStadium()
            }
          }
        }
        move "Stampede", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case GOURGEIST_17:
      return evolution (this, from:"Pumpkaboo", hp:HP120, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Night Parade of One Hundred Demons", {
          text "60× damage. Reveal the top 6 cards of your deck. This attack does 60 damage for each [P] Pokémon you find there. Then, shuffle those [P] Pokémon back into your deck and discard the other cards."
          energyCost C, C
          attackRequirement {
            assert deck : "Deck is empty"
          }
          onAttack {
            def revealedCards = deck.subList 0, 6
            revealedCards.showToOpponent("Top 6 cards of your opponent's Deck.").showToMe("Top 6 cards of your Deck")
            def pokemonCards = revealedCards.filterByAllType POKEMON, _PSYCHIC_
            damage 60 * pokemonCards.size()
            pokemonCards.moveTo deck
            revealedCards.getExcludedList(pokemonCards).discard()
          }
        }
      };
      case HITMONCHAN_18:
      return basic (this, hp:HP110, type:F, retreatCost:1) {
        weakness P
        move "Clean Hit", {
          text "20+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 50 more damage."
          energyCost F
          onAttack {
            damage 20
            if (defending.realEvolution) damage 50
          }
        }
        move "Bullet Straight", {
          text "40 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C
          onAttack {
            noResistanceDamage 40, defending
          }
        }
      };
      case GALARIAN_ZAPDOS_19:
      return basic (this, hp:HP110, type:F, retreatCost:0) {
        weakness P
        bwAbility "Strong Legs Charge", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [F] Energy cards from your hand to it."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(F) && confirm("Use $thisAbility.name?")) {
              powerUsed()
              attachEnergyFrom max:2, type: F, my.hand, self
            }
          }
        }
        move "Zapper Kick", {
          text "70 damage. You may discard all Energy from this Pokémon. If you do, your opponent's Active Pokémon is now Paralyzed."
          energyCost F, F, C
          onAttack {
            damage 70
            if (confirm("Discard all Energy from this Pokémon to paralyze the defending Pokémon?")) {
              afterDamage {
                discardAllSelfEnergy()
                apply PARALYZED
              }
            }
          }
        }
      };
      case GLIGAR_20:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Poison Sting", {
          text " Your opponent's Active Pokémon is now Poisoned."
          energyCost F
          onAttack {
            apply POISONED
          }
        }
        move "Pierce", {
          text "30 damage."
          energyCost F, C
          onAttack {
            damage 30
          }
        }
      };
      case GLISCOR_21:
      return evolution (this, from:"Gligar", hp:HP110, type:F, retreatCost:1) {
        weakness G
        move "Cut Down", {
          text "30 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost F, C
          onAttack {
            damage 30
            discardDefendingEnergyAfterDamage()
          }
        }
        move "Venom Hit", {
          text "100 damage. Your opponent's Active Pokémon is now Poisoned."
          energyCost F, F, C
          onAttack {
            damage 100
            applyAfterDamage POISONED
          }
        }
      };
      case MAKUHITA_22:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
        weakness P
        move "Lunge Out", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Hammer In", {
          text "60 damage."
          energyCost F, C, C
          onAttack {
            damage 60
          }
        }
      };
      case HARIYAMA_23:
      return evolution (this, from:"Makuhita", hp:HP140, type:F, retreatCost:4) {
        weakness P
        bwAbility "Guts", {
          text "If this Pokémon would be Knocked Out by damage from an attack, flip a coin. If heads, this Pokémon is not Knocked Out, and its remaining HP becomes 10."
          delayedA {
            before KNOCKOUT, self, {
              if ((ef as Knockout).byDamageFromAttack) {
                flip {
                  self.damage = self.fullHP - hp(10)
                  bc "$self endured the hit!"
                  prevent()
                }
              }
            }
          }
        }
        move "Hammer In", {
          text "100 damage."
          energyCost F, C, C
          onAttack {
            damage 100
          }
        }
      };
      case LYCANROC_V_24:
      return basic (this, hp:HP200, type:F, retreatCost:1) {
        weakness G
        move "Rock Throw", {
          text "40 damage."
          energyCost F
          onAttack {
            damage 40
          }
        }
        move "Crash Fang", {
          text "200 damage. During your next turn, this Pokémon can't attack."
          energyCost F, F, C
          onAttack {
            damage 200
            cantAttackNextTurn self
          }
        }
      };
      case LYCANROC_VMAX_25:
      return evolution (this, from:"Lycanroc V", hp:HP320, type:F, retreatCost:1) {
        weakness G
        move "Hunting Claw", {
          text " Choose 1 of your opponent's Pokémon that has 60 HP or less remaining. That Pokémon is now Knocked Out."
          energyCost F
          attackRequirement {
            assert opp.all.any { it.remainingHP.value <= 60 } : "No opponent Pokémon with 60 HP or less remaining"
          }
          onAttack {
            def target = opp.all.findAll { it.remainingHP.value <= 60 }.select text
            new Knockout(target).run(bg)
          }
        }
        move "Max Edge", {
          text "190 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C
          onAttack {
            damage 190
            if (opp.bench) damage 30, opp.bench.select("This attack also does 30 damage to 1 of your opponent's Benched Pokémon.")
          }
        }
      };
      case GALARIAN_MOLTRES_26:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        bwAbility "Malevolent Charge", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach up to 2 [D] Energy cards from your hand to it."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(D) && confirm("Use $thisAbility.name?")) {
              powerUsed()
              attachEnergyFrom max:2, type: D, my.hand, self
            }
          }
        }
        move "Fiery Wrath", {
          text "20+ damage. This attack does 50 more damage for each Prize card your opponent has taken."
          energyCost D, D, C
          onAttack {
            damage 20
            damage 50 * opp.prizeCardSet.takenCount
          }
        }
      };
      case ABSOL_27:
      return basic (this, hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Drag Off", {
          text " Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 30 damage to the new Active Pokémon."
          energyCost C, C
          attackRequirement {
            assertOppBench()
          }
          onAttack {
            def target = opp.bench.select("Select the new Active Pokémon.")
            if ( sw2(target) ) { damage 30, target }
          }
        }
        move "Slash", {
          text "80 damage."
          energyCost D, C, C
          onAttack {
            damage 80
          }
        }
      };
      case CROAGUNK_28:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Corkscrew Punch", {
          text "20 damage."
          energyCost D
          onAttack {
            damage 20
          }
        }
      };
      case TOXICROAK_29:
      return evolution (this, from:"Croagunk", hp:HP110, type:D, retreatCost:1) {
        weakness F
        move "Severe Poison", {
          text " Your opponent's Active Pokémon is now Poisoned . Put 4 damage counters instead of 1 on that Pokémon during Pokémon Checkup."
          energyCost D
          onAttack {
            apply POISONED
            extraPoison 3
          }
        }
        move "Magnum Punch", {
          text "90 damage."
          energyCost D, C, C
          onAttack {
            damage 90
          }
        }
      };
      case GARBODOR_V_30:
      return basic (this, hp:HP210, type:D, retreatCost:3) {
        weakness F
        move "Garbage Stink", {
          text "40 damage. Your opponent's Active Pokémon is now Poisoned . During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D, C
          onAttack {
            damage 40
            applyAfterDamage POISONED
            cantRetreat defending
          }
        }
        move "Sludge Bomb", {
          text "130 damage."
          energyCost D, D, C
          onAttack {
            damage 130
          }
        }
      };
      case GARBODOR_VMAX_31:
      return evolution (this, from:"Garbodor V", hp:HP330, type:D, retreatCost:3) {
        weakness F
        bwAbility "Junk Gather", {
          text "This Pokémon may have up to 2 Pokémon Tools attached to it. If it loses this Ability, discard Pokémon Tools from it until only 1 remains."
          def key = "OMEGA_DOUBLE_"
          onActivate {
            bg.em().storeObject(key + self.hashCode(), 1) //logic is in PlayPokemonTool
          }
          onDeactivate {
            bg.em().storeObject(key + self.hashCode(), null)
            while (self.cards.filterByType(POKEMON_TOOL).size() > 1) {
              self.cards.filterByType(POKEMON_TOOL).select("Select to discard", { true }, self.owner).discard()
            }
          }
        }
        move "G-Max Stink", {
          text "120 damage. Your opponent's Active Pokémon is now Poisoned . During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D, C
          onAttack {
            damage 120
            applyAfterDamage POISONED
            cantRetreat defending
          }
        }
      };
      case NICKIT_32:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Tail Whap", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
      };
      case THIEVUL_33:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        bwAbility "Fumble Hand", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, each player shuffles their hand and puts it on the bottom of their deck. Then, each player draws 4 cards."
          onActivate { reason ->
            def handWithoutThisCard = my.hand.getExcludedList(thisCard)
            if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && my.bench.notFull && (handWithoutThisCard.notEmpty || opp.hand.notEmpty) && confirm("Use $thisAbility?")) {
              if (opp.hand){
                bc "${opp.owner.getPlayerUsername(bg)} shuffled their hand of ${opp.hand.size()} cards, and put it at the bottom of their deck."
                opp.hand.shuffledCopy().moveTo(suppressLog: true, opp.deck)
              } else {
                bc "${opp.owner.getPlayerUsername(bg)} doesn't have any cards in hand, only needs to draw."
              }
              draw 4, TargetPlayer.OPPONENT

              if (handWithoutThisCard) {
                bc "${my.owner.getPlayerUsername(bg)} shuffled their hand of ${my.hand.size() - 1} cards, and put it at the bottom of their deck."
                my.hand.getExcludedList(thisCard).shuffledCopy().moveTo(suppressLog: true, my.deck)
              } else {
                bc "${my.owner.getPlayerUsername(bg)} doesn't have any cards in hand, only needs to draw."
              }
              draw 4
            }
          }
        }
        move "Tail Smack", {
          text "60 damage."
          energyCost C, C
          onAttack {
            damage 60
          }
        }
      };
      case GALARIAN_MEOWTH_34:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Growl", {
          text " During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
          energyCost M
          onAttack {
            reduceDamageFromDefendingNextTurn hp(20), thisMove, defending
          }
        }
        move "Slash", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case GALARIAN_PERRSERKER_35:
      return evolution (this, from:"Galarian Meowth", hp:HP120, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Inspire", {
          text " Search your deck for up to 2 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
          energyCost M
          attackRequirement {
            assert deck : "Your deck is empty"
          }
          onAttack {
            attachEnergyFrom basic : true, my.deck, my.all
            attachEnergyFrom basic : true, my.deck, my.all
          }
        }
        move "Headbang", {
          text "80 damage."
          energyCost C, C, C
          onAttack {
            damage 80
          }
        }
      };
      case SKARMORY_36:
      return basic (this, hp:HP120, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Steel Wing", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C, C
          onAttack {
            damage 30
            reduceDamageNextTurn hp(30), thisMove
          }
        }
        move "Slicing Blade", {
          text "110 damage."
          energyCost M, M, C
          onAttack {
            damage 110
          }
        }
      };
      case KLEFKI_37:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Unlock", {
          text "10 damage. Draw 2 cards."
          energyCost C
          onAttack {
            damage 10
            draw 2
          }
        }
      };
      case CUFANT_38:
      return basic (this, hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Rollout", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "High Horsepower", {
          text "1080 damage. This Pokémon also does 20 damage to itself."
          energyCost M, C, C
          onAttack {
            damage 1080
            damage 20, self
          }
        }
      };
      case COPPERAJAH_39:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Strength", {
          text "90 damage."
          energyCost M, C, C
          onAttack {
            damage 90
          }
        }
        move "High Horsepower", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost M, C, C, C
          onAttack {
            damage 160
            damage 30, self
          }
        }
      };
      case ALTARIA_40:
      return evolution (this, from:"Swablu", hp:HP090, type:N, retreatCost:0) {
        bwAbility "Luring Melody", {
          text "Once during your turn, you may search your deck for a Supporter card and reveal it. Then, shuffle your deck and put that card on top of it."
          actionA {
            checkLastTurn()
            assert deck : "Deck is empty"
            def tar = deck.search { it.cardTypes.is SUPPORTER }
            tar.showToOpponent(bg, "Supporter Card placed on top of opponent's deck")
            tar.moveTo addToTop:true, deck
          }
        }
        move "Glide", {
          text "60 damage."
          energyCost W, M
          onAttack {
            damage 60
          }
        }
      };
      case DIALGA_41:
      return basic (this, hp:HP130, type:N, retreatCost:2) {
        move "Chrono Wind", {
          text "80 damage. If the Defending Pokémon is a Pokémon V , it can't attack during your opponent's next turn."
          energyCost C, C, C
          onAttack {
            damage 80
            if (defending.pokemonV) {
              cantAttackNextTurn defending
            }
          }
        }
        move "Heavy Impact", {
          text "210 damage."
          energyCost P, M, M, C
          onAttack {
            damage 210
          }
        }
      };
      case DEINO_42:
      return basic (this, hp:HP060, type:N, retreatCost:1) {
        move "Call for Family", {
          text " Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost D
          callForFamily basic:true, 1, delegate
        }
        move "Bite", {
          text "30 damage."
          energyCost P, D
          onAttack {
            damage 30
          }
        }
      };
      case ZWEILOUS_43:
      return evolution (this, from:"Deino", hp:HP100, type:N, retreatCost:2) {
        move "Bite", {
          text "40 damage."
          energyCost P, D
          onAttack {
            damage 40
          }
        }
        move "Dragon Headbutt", {
          text "100 damage."
          energyCost P, D, C, C
          onAttack {
            damage 100
          }
        }
      };
      case HYDREIGON_44:
      return evolution (this, from:"Zweilous", hp:HP170, type:N, retreatCost:3) {
        move "Dragon Counter", {
          text "20+ damage. This attack does 100 more damage for each Prize card your opponent took on their last turn."
          energyCost P, D
          onAttack {
            damage 20
            damage 100 * bg.lastTurnTakePrize
          }
        }
        move "Pitch-Black Fangs", {
          text "210 damage."
          energyCost P, D, C, C
          onAttack {
            damage 210
          }
        }
      };
      case KYUREM_45:
      return basic (this, hp:HP120, type:N, retreatCost:2) {
        move "Extreme Freeze", {
          text "60× damage. Discard any amount of [W] Energy from your Pokémon. This attack does 60 damage for each card you discarded in this way."
          energyCost W, W, M
          attackRequirement {
            assert my.all.any { it.cards.energyCount W } : "No Pokémon with [W] Energy attached"
          }
          onAttack {
            int count = 0
            while (1) {
              def tar = my.all.findAll { it.cards.filterByEnergyType(W).notEmpty() }
              if (!tar) break
              def pcs = tar.select("Pokémon that has [W] energy to discard. Cancel to stop", false)
              if (!pcs) break
              pcs.cards.filterByEnergyType(W).select("[W] Energy to discard").discard()
              count++
            }
            damage 60 * count
          }
        }
      };
      case NOIVERN_V_46:
      return basic (this, hp:HP200, type:N, retreatCost:0) {
        move "Boomburst", {
          text " This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P
          onAttack {
            damage 20, opp.all
          }
        }
        move "Synchro Loud", {
          text "60+ damage. If you have the same number of cards in your hand as your opponent, this attack does 120 more damage."
          energyCost P, D
          onAttack {
            damage 60
            if (my.hand.size() == opp.hand.size()) damage 120
          }
        }
      };
      case DRAMPA_47:
      return basic (this, hp:HP120, type:N, retreatCost:2) {
        move "Corkscrew Punch", {
          text "30 damage."
          energyCost C
          onAttack {
            damage 30
          }
        }
        move "Berserk", {
          text "70+ damage. If your Benched Pokémon have any damage counters on them, this attack does 90 more damage."
          energyCost W, F
          onAttack {
            damage 70
            if (bench.any { it.numberOfDamageCounters }) damage 90
          }
        }
      };
      case DURALUDON_V_48:
      return basic (this, hp:HP220, type:N, retreatCost:2) {
        move "Metal Claw", {
          text "70 damage."
          energyCost F, M
          onAttack {
            damage 70
          }
        }
        move "Breaking Swipe", {
          text "140 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 less damage (before applying Weakness and Resistance)."
          energyCost F, M, M
          onAttack {
            damage 140
            reduceDamageFromDefendingNextTurn hp(30), thisMove, defending
          }
        }
      };
      case DURALUDON_VMAX_49:
      return evolution (this, from:"Duraludon V", hp:HP330, type:N, retreatCost:3) {
        bwAbility "Skyscraper", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon that have any Special Energy attached to them."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.from.cards.filterByType(SPECIAL_ENERGY) && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect) {
                  bc "$thisAbility.name prevents damage from Pokémon with Special Energy attached."
                  it.dmg = hp(0)
                }
              }
            }
          }
        }
        move "G-Max Pulverization", {
          text "220 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
          energyCost F, M, M
          onAttack {
            shredDamage 220
          }
        }
      };
      case SLAKOTH_50:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        move "Smack 'n' Slack", {
          text "30 damage. This Pokémon is now Asleep."
          energyCost C, C
          onAttack {
            damage 30
            afterDamage {
              apply ASLEEP, self
            }
          }
        }
      };
      case VIGOROTH_51:
      return evolution (this, from:"Slakoth", hp:HP090, type:C, retreatCost:1) {
        weakness F
        move "Shatter", {
          text "20 damage. Discard a Stadium in play."
          energyCost C
          onAttack {
            damage 20
            afterDamage {
              discardStadium()
            }
          }
        }
        move "Slash", {
          text "50 damage."
          energyCost C, C
          onAttack {
            damage 50
          }
        }
      };
      case SLAKING_52:
      return evolution (this, from:"Vigoroth", hp:HP180, type:C, retreatCost:4) {
        weakness F
        bwAbility "Self-Important", {
          text "If there is a Stadium in play, this Pokémon can't attack."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (self.active && bg.currentTurn == self.owner && bg.stadiumInfoStruct) {
                wcu "Self-Important prevents attacking."
                prevent()
              }
            }
          }
        }
        move "Rout", {
          text "120+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon."
          energyCost C, C, C
          onAttack {
            damage 120
            damage 30 * opp.bench.size()
          }
        }
      };
      case SWABLU_53:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          onAttack {
            flip {
              damage 30
            }
          }
        }
      };
      case WOOLOO_54:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Derail", {
          text "10 damage. Discard a Special Energy from your opponent's Active Pokémon."
          energyCost C
          onAttack {
            damage 10
            discardDefendingSpecialEnergy delegate
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
      case DUBWOOL_55:
      return evolution (this, from:"Wooloo", hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Bounce", {
          text "30 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            damage 30
            switchYourActive()
          }
        }
        move "Rolling Tackle", {
          text "70 damage."
          energyCost C, C
          onAttack {
            damage 70
          }
        }
      };
      case ESCAPE_ROPE_56:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this);
      case EVOLUTION_INCENSE_57:
      return copy(SwordShield.EVOLUTION_INCENSE_163, this);
      case SWITCHEROO_CUP_58:
      return itemCard (this) {
        text "Switch a card from your hand with the top card of your deck."
        onPlay {
          hand.getExcludedList(thisCard).select().moveTo(addToTop: true, hidden: true, my.deck)
          deck.subList(1,2).moveTo(hidden: true, my.hand) // Card placed on top, get the one underneath
        }
        playRequirement{
          assert hand.getExcludedList(thisCard) : "You have no other cards in your hand"
          assert deck : "Your deck is empty"
        }
      };
      case RESCUE_TROLLEY_59:
      return itemCard (this) {
        text "Put up to 2 Pokémon with 90 HP or less from your discard pile into your hand."
        onPlay {
          def cards = my.discard.select thisCard.cardText, { it.cardTypes.is(POKEMON) && it.asPokemonCard().hp <= 90 }
          cards.moveTo hand
        }
        playRequirement{
          assert my.discard.any { it.cardTypes.is(POKEMON) && it.asPokemonCard().hp <= 90 } : "No Pokémon with 90 HP or less in your discard pile"
        }
      };
      case DIGGING_GLOVES_60:
      return pokemonTool (this) {
        text "The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [F] Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay {reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (it.from == self && it.to.active && it.to.owner == self.owner.opposite && it.dmg.value && it.to.types.contains(F)) {
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
      case SINGLE_STRIKE_SCROLL_OF_THE_DRAGON_FANG_61:
      return pokemonTool (this) {
        text "The Single Strike Pokémon this card is attached to can use the attack on this card. (You still need the necessary Energy to use this attack.)"
        def newMove
        onPlay {reason->
          def moveBody = {
            text "Discard all Energy from this Pokémon"
            attackRequirement {
              // self is not set properly creating a move like this, use bg.ownActive() instead
              assert bg.ownActive().singleStrike : "${bg.ownActive()} is not a $SINGLE_STRIKE Pokémon"
            }
            energyCost F, M, M, C, C
            onAttakc {
              damage 300
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }

          Move move = new Move("Superstrong Slash")
          moveBody.delegate = new MoveBuilder(thisMove: move)
          moveBody.call()
          newMove = getter GET_MOVE_LIST, self, {h->
            if (h.effect.target.singleStrike) {
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
      case FULL_FACE_GUARD_62:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has no Abilities" +
          "it takes 20 less damage from attacks from your opponent's Pokémon (after applying Weakness and Resistance)."
        def eff
        onPlay {reason->
          eff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              if(self.abilities.isEmpty()) {
                bg.dm().each{
                  if(it.to == self && it.from.owner == self.owner.opposite && it.notNoEffect && it.dmg.value) {
                    bc "$thisCard -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case RAIHAN_63:
      return supporter (this) {
        text "You can play this card only if 1 of your Pokémon was Knocked Out during your opponent's last turn. Attach a basic Energy card from your discard pile to 1 of your Pokémon. If you do" +
          "search your deck for a card and put it into your hand. Then" +
          "shuffle your deck."
        initHook {Card thisCard->
          delayed {
            before KNOCKOUT, {
              if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                keyStore("Raihan_KO", thisCard, bg.turnCount)
              }
            }
          }
        }
        onPlay {
          def card = deck.search count:1, { true }
          card.moveTo hidden:true, hand
        }
        playRequirement{
          assert keyStore("Rosa_KO", thisCard, null) == bg.turnCount - 1: "No Pokémon was Knocked Out during your opponent’s last turn"
          assert my.discard.any { it.cardTypes.is(BASIC_ENERGY) } : "No basic Energy cards in your discard pile"
        }
      };
      case SCHOOLGIRL_64:
      return supporter (this) {
        text "Draw 2 cards. If your opponent has exactly 2" +
          "4" +
          "or 6 Prize cards remaining" +
          "draw 2 more cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case COPYCAT_65:
        return copy(TeamRocketReturns.COPYCAT_83, this);
      case CRYSTAL_CAVE_66:
      return stadium (this) {
        text "Once during each player's turn" +
          "that player may heal 30 damage from each of their [M] Pokémon and [N] Pokémon."
        def lastTurn = 0
        def actions = []
        onPlay {
          actions.add(action("Stadium: $thisCard") {
            assert lastTurn != bg.turnCount : "You have already used $thisCard this turn"
            def targets = my.all.findAll { it.types.containsAny([M, N] as TypeSet) && it.numberOfDamageCounters }
            assert targets : "You have no [M] or [N] Pokémon with damage counters"
            bc "Used $thisCard"
            lastTurn = bg.turnCount
            targets.each {
              heal 30, it
            }
          })
        }
        onRemoveFromPlay{
          actions.each { bg.gm().unregisterAction(it) }
        }
      };
      case TWIN_ENERGY_67:
        return copy (RebelClash.TWIN_ENERGY_174, this)
      case SUICUNE_V_68:
      return copy (SUICUNE_V_1, this);
      case GOLURK_V_69:
      return copy (GOLURK_V_15, this);
      case GOLURK_V_70:
      return copy (GOLURK_V_15, this);
      case LYCANROC_V_71:
      return copy (LYCANROC_V_24, this);
      case GARBODOR_V_72:
      return copy (GARBODOR_V_30, this);
      case NOIVERN_V_73:
      return copy (NOIVERN_V_46, this);
      case NOIVERN_V_74:
      return copy (NOIVERN_V_46, this);
      case DURALUDON_V_75:
      return copy (DURALUDON_V_48, this);
      case DURALUDON_V_76:
      return copy (DURALUDON_V_48, this);
      case RAIHAN_77:
      return copy (RAIHAN_63, this);
      case SCHOOLGIRL_78:
      return copy (SCHOOLGIRL_64, this);
      case COPYCAT_79:
      return copy (COPYCAT_65, this);
      case LYCANROC_VMAX_80:
      return copy (LYCANROC_VMAX_25, this);
      case GARBODOR_VMAX_81:
      return copy (GARBODOR_VMAX_31, this);
      case DURALUDON_VMAX_82:
      return copy (DURALUDON_VMAX_49, this);
      case DURALUDON_VMAX_83:
      return copy (DURALUDON_VMAX_49, this);
      case RAIHAN_84:
      return copy (RAIHAN_63, this);
      case SCHOOLGIRL_85:
      return copy (SCHOOLGIRL_64, this);
      case COPYCAT_86:
      return copy (COPYCAT_65, this);
      case CRESSELIA_87:
      return copy (ChillingReign.CRESSELIA_64, this);
      case FULL_FACE_GUARD_88:
      return copy (FULL_FACE_GUARD_62, this);
      case CRYSTAL_CAVE_89:
      return copy (CRYSTAL_CAVE_66, this);
      case METAL_ENERGY_90:
      return basicEnergy (this, M);
      default:
      return null;
    }
  }
}
