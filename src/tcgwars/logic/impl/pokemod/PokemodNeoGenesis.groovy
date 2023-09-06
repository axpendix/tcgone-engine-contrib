package tcgwars.logic.impl.pokemod

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
 * @author lithogenn@gmail.com
 */
public enum PokemodNeoGenesis implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  AZUMARILL_2 ("Azumarill", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BELLOSSOM_3 ("Bellossom", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  FERALIGATR_4 ("Feraligatr", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  FERALIGATR_5 ("Feraligatr", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  HERACROSS_6 ("Heracross", "6", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  JUMPLUFF_7 ("Jumpluff", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  KINGDRA_8 ("Kingdra", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LUGIA_9 ("Lugia", "9", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  MEGANIUM_10 ("Meganium", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MEGANIUM_11 ("Meganium", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  PICHU_12 ("Pichu", "12", Rarity.HOLORARE, [POKEMON, BABY, BASIC, _LIGHTNING_, BASIC]),
  SKARMORY_13 ("Skarmory", "13", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  SLOWKING_14 ("Slowking", "14", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  STEELIX_15 ("Steelix", "15", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  TOGETIC_16 ("Togetic", "16", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TYPHLOSION_17 ("Typhlosion", "17", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  TYPHLOSION_18 ("Typhlosion", "18", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  METAL_ENERGY_19 ("Metal Energy", "19", Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
  CLEFFA_20 ("Cleffa", "20", Rarity.RARE, [POKEMON, BABY, BASIC, _COLORLESS_, BASIC]),
  DONPHAN_21 ("Donphan", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ELEKID_22 ("Elekid", "22", Rarity.RARE, [POKEMON, BABY, BASIC, _LIGHTNING_, BASIC]),
  MAGBY_23 ("Magby", "23", Rarity.RARE, [POKEMON, BABY, BASIC, _FIRE_, BASIC]),
  MURKROW_24 ("Murkrow", "24", Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  SNEASEL_25 ("Sneasel", "25", Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  AIPOM_26 ("Aipom", "26", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  ARIADOS_27 ("Ariados", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BAYLEEF_28 ("Bayleef", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BAYLEEF_29 ("Bayleef", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CLEFAIRY_30 ("Clefairy", "30", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CROCONAW_31 ("Croconaw", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CROCONAW_32 ("Croconaw", "32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ELECTABUZZ_33 ("Electabuzz", "33", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_34 ("Flaaffy", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  FURRET_35 ("Furret", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GLOOM_36 ("Gloom", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRANBULL_37 ("Granbull", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LANTURN_38 ("Lanturn", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LEDIAN_39 ("Ledian", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MAGMAR_40 ("Magmar", "40", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  MILTANK_41 ("Miltank", "41", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  NOCTOWL_42 ("Noctowl", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PHANPY_43 ("Phanpy", "43", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  PILOSWINE_44 ("Piloswine", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  QUAGSIRE_45 ("Quagsire", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  QUILAVA_46 ("Quilava", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  QUILAVA_47 ("Quilava", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SEADRA_48 ("Seadra", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SKIPLOOM_49 ("Skiploom", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SUNFLORA_50 ("Sunflora", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TOGEPI_51 ("Togepi", "51", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  XATU_52 ("Xatu", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  CHIKORITA_53 ("Chikorita", "53", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHIKORITA_54 ("Chikorita", "54", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHINCHOU_55 ("Chinchou", "55", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CYNDAQUIL_56 ("Cyndaquil", "56", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CYNDAQUIL_57 ("Cyndaquil", "57", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  GIRAFARIG_58 ("Girafarig", "58", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GLIGAR_59 ("Gligar", "59", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HOOTHOOT_60 ("Hoothoot", "60", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HOPPIP_61 ("Hoppip", "61", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HORSEA_62 ("Horsea", "62", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LEDYBA_63 ("Ledyba", "63", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  MANTINE_64 ("Mantine", "64", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAREEP_65 ("Mareep", "65", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MARILL_66 ("Marill", "66", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  NATU_67 ("Natu", "67", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ODDISH_68 ("Oddish", "68", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ONIX_69 ("Onix", "69", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PIKACHU_70 ("Pikachu", "70", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SENTRET_71 ("Sentret", "71", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SHUCKLE_72 ("Shuckle", "72", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SLOWPOKE_73 ("Slowpoke", "73", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SNUBBULL_74 ("Snubbull", "74", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SPINARAK_75 ("Spinarak", "75", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  STANTLER_76 ("Stantler", "76", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SUDOWOODO_77 ("Sudowoodo", "77", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SUNKERN_78 ("Sunkern", "78", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SWINUB_79 ("Swinub", "79", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOTODILE_80 ("Totodile", "80", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOTODILE_81 ("Totodile", "81", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WOOPER_82 ("Wooper", "82", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  Falkner_83 ("Falkner", "83", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ECOGYM_84 ("Ecogym", "84", Rarity.RARE, [TRAINER, STADIUM]),
  ENERGY_CHARGE_85 ("Energy Charge", "85", Rarity.RARE, [TRAINER]),
  EUSINE_86 ("Eusine", "86", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  KURT_87 ("Kurt", "87", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  RANDOM_RECEIVER_88 ("Random Receiver", "88", Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_RETRIEVAL_89 ("Super Energy Retrieval", "89", Rarity.RARE, [TRAINER]),
  DARK_PATCH_90 ("Dark Patch", "90", Rarity.RARE, [TRAINER]),
  METAL_PATCH_91 ("Metal Patch", "91", Rarity.RARE, [TRAINER]),
  YOUNGSTER_JOEY_92 ("Youngster Joey", "92", Rarity.RARE, [TRAINER, SUPPORTER]),
  SILENT_LAB_93 ("Silent Lab", "93", Rarity.RARE, [TRAINER, STADIUM]),
  MIRACLE_BERRY_94 ("Miracle Berry", "94", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  NEW_POKEDEX_95 ("New Pokédex", "95", Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_ELM_96 ("Professor Elm", "96", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SPROUT_TOWER_97 ("Sprout Tower", "97", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SUPER_SCOOP_UP_98 ("Super Scoop Up", "98", Rarity.UNCOMMON, [TRAINER]),
  ITEM_FINDER_99 ("Item Finder", "99", Rarity.RARE, [TRAINER]),
  BATTLE_FRONTIER_100 ("Battle Frontier", "100", Rarity.RARE, [TRAINER, STADIUM]),
  BROKEN_TIME_SPACE_101 ("Broken Time Space", "101", Rarity.RARE, [TRAINER, STADIUM]),
  POKEMON_MARCH_102 ("Pokémon March", "102", Rarity.COMMON, [TRAINER]),
  BATTLE_ARENA_103 ("Battle Arena", "103", Rarity.RARE, [TRAINER, STADIUM]),
  DARKNESS_ENERGY_104 ("Darkness Energy", "104", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  RECYCLE_ENERGY_105 ("Recycle Energy", "105", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  FIGHTING_ENERGY_106 ("Fighting Energy", "106", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_107 ("Fire Energy", "107", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  GRASS_ENERGY_108 ("Grass Energy", "108", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_109 ("Lightning Energy", "109", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_110 ("Psychic Energy", "110", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_111 ("Water Energy", "111", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIGHTING_ENERGY_112 ("Fighting Energy", "112", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_113 ("Fire Energy", "113", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  GRASS_ENERGY_114 ("Grass Energy", "114", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_115 ("Lightning Energy", "115", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_116 ("Psychic Energy", "116", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_117 ("Water Energy", "117", Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  BLEND_ENERGY_WGR_118 ("Blend Energy WGR", "118", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BLEND_ENERGY_FLP_119 ("Blend Energy FLP", "119", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  DONPHAN_120 ("Donphan", "120", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SKARMORY_EX_121 ("Skarmory ex", "121", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _METAL_]),
  CROBAT_EX_122 ("Crobat ex", "122", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]),
  STEELIX_EX_123 ("Steelix ex", "123", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _METAL_]),
  MEW_EX_124 ("Mew ex", "124", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _PSYCHIC_]),
  FERALIGATR_EX_125 ("Feraligatr ex", "125", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
  MEGANIUM_EX_126 ("Meganium ex", "126", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  PokemodNeoGenesis(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_NEO_GENESIS
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
      case AMPHAROS_1:
      return evolution (this, from:"Flaaffy", hp:HP080, type:L, retreatCost:2) {
        weakness F
        move "Gigaspark", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case AZUMARILL_2:
      return evolution (this, from:"Marill", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Bubble Shower", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case BELLOSSOM_3:
      return evolution (this, from:"Gloom", hp:HP070, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Sweet Nectar", {
          text "Flip a coin. If heads, remove all damage counters from 1 of your Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Flower Dance", {
          text "30x damage. Does 30 damage times the number of cards with Bellossom in their names that you have in play (including this one)."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case FERALIGATR_4:
      return evolution (this, from:"Croconaw", hp:HP100, type:W, retreatCost:3) {
        weakness G
        pokePower "Berserk", {
          text "When you play Feraligatr from your hand, flip a coin. If heads, discard the top 5 cards from your opponent's deck. If tails, discard the top 5 cards from your deck."
          actionA {
          }
        }
        move "Chomp", {
          text "50+ damage. Flip a number of coins equal to the number of damage counters on Feraligatr. This attack does 50 damage plus 10 more damage for each heads."
          energyCost W, W, W, W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case FERALIGATR_5:
      return evolution (this, from:"Croconaw", hp:HP120, type:W, retreatCost:3) {
        weakness G
        pokePower "Downpour", {
          text "As often as you like during your turn (before your attack), you may discard a [W] Energy card from your hand. This power can't be used if Feraligatr is affected by a Special Condition."
          actionA {
          }
        }
        move "Riptide", {
          text "10+ damage. Does 10 damage plus 10 damage times the number of [W] Energy cards in your discard pile. Then, shuffle all [W] Energy cards from your discard pile into your deck."
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case HERACROSS_6:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        pokePower "Final Blow", {
          text "If Heracross's remaining HP are 20 or less, you may make its Megahorn attack's base damage 120 instead of 60. This power can't be used if Heracross is affected by a Special Condition."
          actionA {
          }
        }
        move "Megahorn", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      }
      case JUMPLUFF_7:
      return evolution (this, from:"Skiploom", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Sleep Powder", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Leech Seed", {
          text "20 damage. If this attack damages the Defending Pokémon (after applying Weakness and Resistance), remove 1 damage counter from Jumpluff, if it has any."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case KINGDRA_8:
      return evolution (this, from:"Seadra", hp:HP090, type:W, retreatCost:2) {
        weakness L
        move "Agility", {
          text "30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Kingdra."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Dragon Tornado", {
          text "50 damage. If this attack doesn't Knock Out the Defending Pokémon, and if there are any Pokémon on your opponent's Bench, choose 1 of them and switch it with the Defending Pokémon."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case LUGIA_9:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness P
        resistance F, MINUS30
        move "Elemental Blast", {
          text "90 damage. Discard a [R] Energy card, a [W] Energy card, and a [L] Energy card attached to Lugia in order to use this attack."
          energyCost R, W, L
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      }
      case MEGANIUM_10:
      return evolution (this, from:"Bayleef", hp:HP100, type:G, retreatCost:3) {
        weakness R
        resistance W, MINUS30
        pokePower "Herbal Scent", {
          text "When you play Meganium from your hand, you may flip a coin. If heads, remove all damage counters from all [G] Pokémon in play."
          actionA {
          }
        }
        move "Body Slam", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case MEGANIUM_11:
      return evolution (this, from:"Bayleef", hp:HP100, type:G, retreatCost:3) {
        weakness R
        resistance W, MINUS30
        move "Soothing Scent", {
          text "40 damage. The Defending Pokémon is now Asleep."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case PICHU_12:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:L, retreatCost:0) {
        move "Zzzap", {
          text "Does 20 damage to each Pokémon in play that has a Poké-Power or Poké-Body. Don't apply Weakness and Resistance."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case SKARMORY_13:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Claw", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Steel Wing", {
          text "30 damage. Flip a coin. If heads, all damage done by attacks to Skarmory during your opponent's next turn is reduced by 20 (after applying Weakness and Resistance)."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SLOWKING_14:
      return evolution (this, from:"Slowpoke", hp:HP080, type:P, retreatCost:3) {
        weakness P
        pokeBody "Mind Games", {
          text "As long as Slowking is your Active Pokémon, whenever your opponent plays a Trainer card (excluding Supporter or G-SPEC), he or she flips a coin. If heads, that card does nothing. Shuffle the Trainer card played into its owner's deck. This power can't be used if Slowking is affected by a Special Condition."
          delayedA {
          }
        }
        move "Mind Blast", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage and the Defending Pokémon is now Confused. If tails, this attack does 20 damage."
          energyCost P, P, P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case STEELIX_15:
      return evolution (this, from:"Onix", hp:HP110, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Tail Crush", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case TOGETIC_16:
      return evolution (this, from:"Togepi", hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Super Metronome", {
          text "Flip a coin. If heads, choose an attack of 1 of your opponent's Pokémon. Super Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) (No matter what type the Defending Pokémon is, Togetic's type is still [C].) Togetic performs that attack. (Togetic can make that attack even if it does not have the appropriate number or type of Energy attached to it necessary to make the attack.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fly", {
          text "30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Togetic; if tails, this attack does nothing (not even damage)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case TYPHLOSION_17:
      return evolution (this, from:"Quilava", hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokePower "Fire Recharge", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, attach a [R] Energy card from your discard pile to 1 of your [R] Pokémon. This power can't be used if Typhlosion is affected by a Special Condition."
          actionA {
          }
        }
        move "Flame Burst", {
          text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 20 more damage and does 20 damage to Typhlosion. If tails, this attack does 60 damage."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      }
      case TYPHLOSION_18:
      return evolution (this, from:"Quilava", hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokePower "Fire Boost", {
          text "When you play Typhlosion from your hand, you may flip a coin. If heads, search your deck for up to 4 [R] Energy cards and attach them to Typhlosion. Shuffle your deck afterward."
          actionA {
          }
        }
        move "Flame Wheel", {
          text "80 damage. Discard 3 [R] Energy cards attached to Typhlosion in order to use this attack. Do 20 damage to each Benched Pokémon (yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      }
      case METAL_ENERGY_19:
      return specialEnergy (this, [[C]]) {
        text "Damage done to the Pokémon Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon Metal Energy is attached isn't [M]. Metal Energy provides[M] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }
      case CLEFFA_20:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:C, retreatCost:0) {
        move "Eeeeeeek", {
          text "Shuffle your hand into your deck, then draw 5 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case DONPHAN_21:
      return evolution (this, from:"Phanpy", hp:HP070, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Donphan."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rapid Spin", {
          text "50 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with his or her Active Pokémon, then, if you have any Benched Pokémon, you switch 1 of them with your Active Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case ELEKID_22:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:L, retreatCost:0) {
        pokePower "Playful Punch", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, do 20 damage to your opponent's Active Pokémon. (Apply Weakness and Resistance.) Either way, this ends your turn. This power can't be used if Elekid is affected by a Special Condition."
          actionA {
          }
        }

      }
      case MAGBY_23:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:R, retreatCost:0) {
        move "Sputter", {
          text "10 damage. All Poké-Powers and Poké-Bodies stop working until the end of your next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case MURKROW_24:
      return basic (this, hp:HP060, type:D, retreatCost:0) {
        weakness L
        resistance P, MINUS30
        move "Mean Look", {
          text "The Defending Pokémon can't retreat as long as Murkrow remains your Active Pokémon. (Benching or evolving either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Feint Attack", {
          text "20 damage. Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Pokémon Powers, or any other effects on the Defending Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SNEASEL_25:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Beat Up", {
          text "10x damage. Flip a coin for each of your Pokémon in play (including this one). This attack does 10 damage times the number of heads."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case AIPOM_26:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Pilfer", {
          text "Shuffle Aipom and all cards attached to it into your deck. Flip a coin. If heads, shuffle a card from your discard pile into your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Rap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case ARIADOS_27:
      return evolution (this, from:"Spinarak", hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Spider Web", {
          text "Flip a coin. If heads, the Defending Pokémon can't retreat. (Benching or evolving that Pokémon ends this effect.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Bite", {
          text "20 damage. If this attack damages the Defending Pokémon, the Defending Pokémon is now Poisoned and you remove a number of damage counters from Ariados equal to half that damage (rounded up to the nearest 10). If Ariados has fewer damage counters than that, remove all of them."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case BAYLEEF_28:
      return evolution (this, from:"Chikorita", hp:HP070, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Poisonpowder", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Pollen Shield", {
          text "30 damage. During your opponent's next turn, Bayleef can't become affected by a Special Condition (All other effects of attacks, Poké-Powers, and Trainer cards still happen.)"
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case BAYLEEF_29:
      return evolution (this, from:"Chikorita", hp:HP080, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Sweet Scent", {
          text "Flip a coin. If heads and if any of your Pokémon have any damage counters on them, then remove 2 damage counters from 1 of them (or 1 if it only has 1). If tails and if any of your opponent's Pokémon have any damage counters on them, choose 1 of them and remove 2 damage counters from it (or 1 if it only has 1)."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Double Razor Leaf", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case CLEFAIRY_30:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Squaredance", {
          text "Flip a number of coins equal to the total number of Pokémon in play. For each heads, you may search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case CROCONAW_31:
      return evolution (this, from:"Totodile", hp:HP070, type:W, retreatCost:2) {
        weakness G
        move "Screech", {
          text "Until the end of your next turn, if an attack damages the Defending Pokémon (after applying Weakness and Resistance), that attack does 20 more damage to the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Jaw Clamp", {
          text "30 damage. Until the end of your opponent's next turn, as long as Croconaw is your Active Pokémon, the Defending Pokémon can't retreat, and if the effect of an attack, Poké-Power, or Trainer card would change that player's Active Pokémon, that part of the effect does nothing."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case CROCONAW_32:
      return evolution (this, from:"Totodile", hp:HP080, type:W, retreatCost:2) {
        weakness G
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Sweep Away", {
          text "50 damage. Discard the top 3 cards from your deck."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case ELECTABUZZ_33:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Punch", {
          text "20 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, or any other effects on the Defending Pokémon."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case FLAAFFY_34:
      return evolution (this, from:"Mareep", hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Discharge", {
          text "30x damage. Discard all [L] Energy cards attached to Flaaffy in order to use this attack. Flip a number of coins equal to the number of [L] Energy cards you discarded. This attack does 30 damage times then number of heads."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Electric Current", {
          text "20 damage. Take 1 [L] Energy cards attached to Flaaffy and attach it to 1 of your Benched Pokémon. If you have no Benched Pokémon, discard that Energy card."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case FURRET_35:
      return evolution (this, from:"Sentret", hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Slam", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case GLOOM_36:
      return evolution (this, from:"Oddish", hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Strange Powder", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused; if tails, the Defending Pokémon is now Asleep."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Sticky Nectar", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage and, until the end of your opponent's next turn, as long as Gloom is your Active Pokémon, the Defending Pokémon can't retreat, and if the effect of an attack, Poké-Power, or Trainer card would change that player's Active Pokémon, that part of the effect does nothing. If tails, this attack does 20 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case GRANBULL_37:
      return evolution (this, from:"Snubbull", hp:HP070, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Raging Charge", {
          text "10+ damage. This attack does 10 damage plus 10 damage for each damage counter on Granbull. Then, Granbull does 20 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case LANTURN_38:
      return evolution (this, from:"Chinchou", hp:HP070, type:L, retreatCost:2) {
        weakness F
        pokePower "Hydroelectric Power", {
          text "You may make Floodlight do 10 more damage for each [W] Energy attached to Lanturn but not used to pay for Floodlight's Energy cost. This power can't be used if Lanturn is affected by a Special Condition."
          actionA {
          }
        }
        move "Floodlight", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case LEDIAN_39:
      return evolution (this, from:"Ledyba", hp:HP060, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Baton Pass", {
          text "30 damage. If you have any [G] Pokémon on your Bench, remove all [G] Energy cards from Ledian and attach them to 1 of those Pokémon, then switch Ledian with that Pokémon."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case MAGMAR_40:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Tail Slap", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magma Punch", {
          text "40 damage. "
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case MILTANK_41:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Milk Drink", {
          text "Flip 2 coins. Remove 2 damage counters times the number of heads from Miltank. If it has fewer damage counters than that, remove all of them."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case NOCTOWL_42:
      return evolution (this, from:"Hoothoot", hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Glaring Gaze", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, look at your opponent's hand. If your opponent has any Trainer cards there, choose 1 of them. Your opponent shuffles that card into his or her deck. This power can't be used more than once each turn or if if Noctowl is affected by a Special Condition."
          actionA {
          }
        }
        move "Wing Attack", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case PHANPY_43:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Endure", {
          text "Flip a coin. If heads, then if, during your opponent's next turn, Phanpy would be Knocked Out by an attack, Phanpy isn't Knocked Out and its remaining HP become 10 instead."
          energyCost F
          attackRequirement {}
          onAttack {

          }
        }
      }
      case PILOSWINE_44:
      return evolution (this, from:"Swinub", hp:HP080, type:W, retreatCost:3) {
        weakness M
        resistance L, MINUS30
        move "Freeze", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon can't attack. (Benching or evolving the Defending Pokémon ends this effect.)"
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Blizzard", {
          text "30 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. If tails, this attack does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case QUAGSIRE_45:
      return evolution (this, from:"Wooper", hp:HP070, type:W, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Surf", {
          text "30 damage. "
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Earthquake", {
          text "60 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      }
      case QUILAVA_46:
      return evolution (this, from:"Cyndaquil", hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard 1 [R] Energy card attached to Quilava in order to use this attack."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Fire Wind", {
          text "20 damage. If your opponent has any Benched Pokémon, choose 1 of them. Flip 2 coins. For each heads, this attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance.)"
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case QUILAVA_47:
      return evolution (this, from:"Cyndaquil", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "20 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Char", {
          text "30 damage. If the Defending Pokémon doesn't have a Char counter on it, flip a coin. If heads, put a Char counter on it. A Char counter requires your opponent to flip a coin after every turn. If tails, put 2 damage counters on the Pokémon with that Char counter. (Char counters stay on the Pokémon as long as it's in play.)"
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SEADRA_48:
      return evolution (this, from:"Horsea", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Splash", {
          text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and flip a coin. If heads, this attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SKIPLOOM_49:
      return evolution (this, from:"Hoppip", hp:HP060, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Poisonpowder", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Stun Spore", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SUNFLORA_50:
      return evolution (this, from:"Sunkern", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Petal Dance", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads. Sunflora is now Confused (after doing damage)."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case TOGEPI_51:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Poison Barb", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case XATU_52:
      return evolution (this, from:"Natu", hp:HP080, type:P, retreatCost:1) {
        weakness P
        resistance F, MINUS30
        move "Prophecy", {
          text "Look at the top 3 cards of either player's deck and rearrange them as you like."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Confuse Ray", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case CHIKORITA_53:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Deflector", {
          text "During your opponent's next turn, whenever Chikorita takes damage, divide that damage in half (rounded down to the nearest 10). (Any other effects still happen.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      }
      case CHIKORITA_54:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Growl", {
          text "If the Defending Pokémon attacks Chikorita during your opponent's next turn, any damage done to Chikorita is reduced by 10 (before applying Weakness and Resistance). (Benching or evolving either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case CHINCHOU_55:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Chinchou."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case CYNDAQUIL_56:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Cyndaquil during your opponent's next turn. (Benching or evolving either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Swift", {
          text "20 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, or any other effects on the Defending Pokémon."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case CYNDAQUIL_57:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Fireworks", {
          text "20 damage. Flip a coin. If tails, discard 1 Energy card attached to Cyndaquil."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case GIRAFARIG_58:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        move "Agility", {
          text "10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Girafarig."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Psybeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case GLIGAR_59:
      return basic (this, hp:HP060, type:F, retreatCost:0) {
        weakness G
        resistance F, MINUS30
        move "Poison Sting", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case HOOTHOOT_60:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Peck", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case HOPPIP_61:
      return basic (this, hp:HP050, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Hop", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sprout", {
          text "Search your deck for a Basic Pokémon named Hoppip and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      }
      case HORSEA_62:
      return basic (this, hp:HP050, type:W, retreatCost:0) {
        weakness L
        move "Fin Slap", {
          text "20+ damage. If an attack damaged Horsea during your opponent's last turn, this attack does 20 damage plus 10 more damage. If not, this attack does 20 damage."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case LEDYBA_63:
      return basic (this, hp:HP040, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Comet Punch", {
          text "10x damage. Flip 4 coins. This attack does 10 damage times the number of heads."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case MANTINE_64:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Undulate", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Mantine."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case MAREEP_65:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Static Electricity", {
          text "For each Mareep in play, you may search your deck for a [L] Energy card and attach it to Mareep. Shuffle your deck afterward."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case MARILL_66:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Defense Curl", {
          text "Flip a coin. If heads, prevent all damage done to Marill during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bubble Bomb", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, Marill does 10 damage to itself."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case NATU_67:
      return basic (this, hp:HP030, type:P, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        move "Peck", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Telekinesis", {
          text "20 damage. Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case ODDISH_68:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Hide", {
          text "Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Oddish."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Absorb", {
          text "20 damage. Remove a number of damage counters from Oddish equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Oddish has fewer damage counters than that, remove all of them."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case ONIX_69:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Screech", {
          text "Until the end of your next turn, if an attack damages the Defending Pokémon (after applying Weakness and Resistance), that attack does 20 more damage to the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Onix."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case PIKACHU_70:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Pikachu."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SENTRET_71:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SHUCKLE_72:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Withdraw", {
          text "Flip a coin. If heads, prevent all damage done to Shuckle during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Wrap", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SLOWPOKE_73:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Slowpoke but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SNUBBULL_74:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Roar", {
          text "Flip a coin. If heads and if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lick", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SPINARAK_75:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Scary Face", {
          text "Flip a coin. If heads, until the end of your opponent's next turn, the Defending Pokémon can't attack or retreat."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "String Shot", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case STANTLER_76:
      return basic (this, hp:HP060, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Stomp", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mystifying Horns", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SUDOWOODO_77:
      return basic (this, hp:HP060, type:F, retreatCost:3) {
        weakness W
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Sudowoodo."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rock Throw", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SUNKERN_78:
      return basic (this, hp:HP040, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Growth", {
          text "Flip a coin. If heads, you may attach up to 2 [G] Energy cards from your hand to Sunkern."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Mega Drain", {
          text "30 damage. Remove a number of damage counters from Sunkern equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Sunkern has fewer damage counters than that, remove all of them."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SWINUB_79:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness M
        resistance L, MINUS30
        move "Powder Snow", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case TOTODILE_80:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness G
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Totodile."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case TOTODILE_81:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Totodile during your opponent's next turn. (Benching or evolving either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case WOOPER_82:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Slam", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case Falkner_83:
      return supporter (this) {
        text "Choose 1 of your opponent's Benched Pokémonand switch it with his or her Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      }
      case ECOGYM_84:
      return stadium (this) {
        text "Whenever an attack, Poké-Power, or Trainer card discards another player's basic Energy card from a Pokémon, shuffle that Energy card into its owner's deck. (Energy cards that are discarded when that Pokémon is Knocked Out don't count.)"
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case ENERGY_CHARGE_85:
      return basicTrainer (this) {
        text "Flip a coin. If heads, shuffle up to 2 Energy cards from your discard pile into your deck."
        onPlay {
        }
        playRequirement{
        }
      }
      case EUSINE_86:
      return supporter (this) {
        text "Discard an Energy card from your hand. Then, draw 4 cards."
        onPlay {
        }
        playRequirement{
        }
      }
      case KURT_87:
      return supporter (this) {
        text "Search your deck for up to 2 Evolution cards with 90HP or more, show them to your opponent, and then put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      }
      case RANDOM_RECEIVER_88:
      return basicTrainer (this) {
        text "Reveal cards for the top of your deck until you reveal a Supporter card. Put it into your hand. Shuffle the other cards back into your deck."
        onPlay {
        }
        playRequirement{
        }
      }
      case SUPER_ENERGY_RETRIEVAL_89:
      return basicTrainer (this) {
        text "Trade 2 of the other cards in your hand for 4 basic Energy cards from your discard pile. If you have fewer than 4 basic Energy cards there, take all of them."
        onPlay {
        }
        playRequirement{
        }
      }
      case DARK_PATCH_90:
      return basicTrainer (this) {
        text "If it's your first turn, you can't play this card. Attach a basic [D] Energy from your discard pile to 1 of your Benched [D] Pokémon."
        onPlay {
        }
        playRequirement{
        }
      }
      case METAL_PATCH_91:
      return basicTrainer (this) {
        text "If it's your first turn, you can't play this card. Attach a basic [M] Energy from your discard pile to 1 of your Benched [M] Pokémon."
        onPlay {
        }
        playRequirement{
        }
      }
      case YOUNGSTER_JOEY_92:
      return supporter (this) {
        text "Search your deck for a Pokémon, show it to your opponent and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      }
      case SILENT_LAB_93:
      return stadium (this) {
        text "Each Basic Pokémon in play, and in each player's discard pile have their Poké-Powers Disabled."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case MIRACLE_BERRY_94:
      return pokemonTool (this) {
        text "At any time between turns, if the Pokémon Miracle Berry is attached to is affected by a Special Condition, you may remove all of those effects from that Pokémon and discard Miracle Berry. At the start of each turn, if the Pokémon Miracle Berry is attached to is affected by a Special Condition, remove all of those effects from that Pokémon and discard Miracle Berry."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }
      case NEW_POKEDEX_95:
      return basicTrainer (this) {
        text "Shuffle your deck. Then, look at up to 5 cards from the top of your deck and rearrange them as you like."
        onPlay {
        }
        playRequirement{
        }
      }
      case PROFESSOR_ELM_96:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, draw 7 cards. You can't play any more Trainer cards this turn."
        onPlay {
        }
        playRequirement{
        }
      }
      case SPROUT_TOWER_97:
      return stadium (this) {
        text "All damage done by [C] Pokémon's attacks is reduce by 30 (after applying Weakness and Resistance)."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case SUPER_SCOOP_UP_98:
      return basicTrainer (this) {
        text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
        onPlay {
        }
        playRequirement{
        }
      }
      case ITEM_FINDER_99:
      return basicTrainer (this) {
        text "You may choose to Discard 1 card from your hand in order to search your discard pile for a Supporter card. Show it to your opponent and put it into your hand. Or" +
          "you may choose to Discard 2 cards from your hand in order to search your discard pile for a Trainer card (excluding Supporter cards). Show it to your opponent and put it into your hand."
        onPlay {
        }
        playRequirement{
        }
      }
      case BATTLE_FRONTIER_100:
      return stadium (this) {
        text "Each Player's [C] Evolved Pokémon, [D] Evolved Pokémon, and [M] Evolved Pokémon can't use any Poké-Powers."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case BROKEN_TIME_SPACE_101:
      return stadium (this) {
        text "Once during each player's turn, he or she may evolve a Stage 1 Pokémon that he or she just evolved during that turn."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case POKEMON_MARCH_102:
      return basicTrainer (this) {
        text "Your opponent may search his or her deck for 1 Basic Pokémon card and put it onto his or her Bench. Then, you may search your deck for 1 Basic Pokémon card and put it onto your Bench. Then, each player shuffles his or her deck. (A player can't do any of this if his or her Bench is full.)"
        onPlay {
        }
        playRequirement{
        }
      }
      case BATTLE_ARENA_103:
      return stadium (this) {
        text "Once during each player's turn, if the or she evolves 1 of their Pokémon (excluding Pokémon-ex), remove 2 damage counters from that Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case DARKNESS_ENERGY_104:
      return specialEnergy (this, [[C]]) {
        text "If the Pokémon Darkness Energy is attached to damages the Defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon. At the end of every turn, put 1 damage counter on the Pokémon Darkness Energy is attached to, unless it's [D]. Darkness Energy provides [D] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }
      case RECYCLE_ENERGY_105:
      return specialEnergy (this, [[C]]) {
        text "Recycle Energy provides 1 Energy. (Doesn't count as a basic Energy card.) If this card is put into your discard pile from play, return it to your hand."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }
      case FIGHTING_ENERGY_106:
      return basicEnergy (this, F)
      case FIRE_ENERGY_107:
      return basicEnergy (this, R)
      case GRASS_ENERGY_108:
      return basicEnergy (this, G)
      case LIGHTNING_ENERGY_109:
      return basicEnergy (this, L)
      case PSYCHIC_ENERGY_110:
      return basicEnergy (this, P)
      case WATER_ENERGY_111:
      return basicEnergy (this, W)
      case FIGHTING_ENERGY_112:
      return copy (FIGHTING_ENERGY_106, this)
      case FIRE_ENERGY_113:
      return copy (FIRE_ENERGY_107, this)
      case GRASS_ENERGY_114:
      return copy (GRASS_ENERGY_108, this)
      case LIGHTNING_ENERGY_115:
      return copy (LIGHTNING_ENERGY_109, this)
      case PSYCHIC_ENERGY_116:
      return copy (PSYCHIC_ENERGY_110, this)
      case WATER_ENERGY_117:
      return copy (WATER_ENERGY_111, this)
      case BLEND_ENERGY_WGR_118:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy. While this card attached to a Pokémon, it provides [W], [G], and [R] Energy but provides only 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }
      case BLEND_ENERGY_FLP_119:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy. While this card attached to a Pokémon, it provides [F], [L], and [P] Energy but provides only 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }
      case DONPHAN_120:
      return evolution (this, from:"Phanpy", hp:HP060, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        pokePower "Spin Force", {
          text "Once during your turn (before your attack), you may choose up to 2 cards from your hand and put them on the bottom of your deck in any order. If you do, draw cards until you have 5 cards in your hand. You can;t use more than 1 Spin Force Pokémon Powder each turn. This power can't be used if Donphan is affected by a Special Condition."
          actionA {
          }
        }
        move "Rolling Tackle", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SKARMORY_EX_121:
      return basic (this, hp:HP100, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Metal Gravity", {
          text "If your opponent's Active Pokémon retreats and has 60 or more remaining HP, put 2 damage counters on that Pokémon. You can't use more than 1 Metal Gravity Poké-Body each turn."
          delayedA {
          }
        }
        move "Whirlwind", {
          text "30 damage. Your Opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon.'"
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Razor Wing", {
          text "50 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case CROBAT_EX_122:
      return evolution (this, from:"Golbat", hp:HP130, type:G, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Distortion", {
          text "Once during your turn (before your attack, if Crobat ex is you Active Pokémon, you may put 1 damage counter on 1 of your opponent''s Pokémon. This power can''t be used if Crobat ex is affected by a Special Condition.'"
          actionA {
          }
        }
        move "Cross Attack", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads. If you get  2 or more heads, the Defending Pokémon is now Confused."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Pester", {
          text "40+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 40 damage plus 20 more damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case STEELIX_EX_123:
      return evolution (this, from:"Onix", hp:HP120, type:M, retreatCost:3) {
        weakness R
        weakness F
        resistance G, MINUS30
        resistance L, MINUS30
        pokeBody "Poison Resistance", {
          text "Steelix ex can't be Poisoned."
          delayedA {
          }
        }
        move "Metal Charge", {
          text "50 damage. Put 1 damage counter on Steelix ex."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Mudslide", {
          text "Discard 1 [F] Energy attached to Steelix ex and choose 1 of your opponent's Pokémon. This attack does 60 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, F, C, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case MEW_EX_124:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness P
        pokeBody "Versatile", {
          text "Mew ex can use the attacks of all Pokémon in play as its own. (You still need the necessary Energy to use each attack.)."
          metronomeA delegate, { all }
        }
        move "Power Move", {
          text "Search your deck for an Energy card and attach it to Mew ex. Shuffle your deck afterward. Then, you may switch Mew ex with 1 of your Benched Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case FERALIGATR_EX_125:
      return evolution (this, from:"Croconaw", hp:HP150, type:M, retreatCost:3) {
        weakness G
        weakness L
        pokeBody "Poison Resistance", {
          text "As long as Feraligatr ex is your Active Pokémon, each player's Pokémon (excluding Pokémon-ex) can't use any Poké-Powers or Poké-Bodies."
          delayedA {
          }
        }
        move "Tsunami", {
          text "30 damage. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Sore Spot", {
          text "Does 40 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case MEGANIUM_EX_126:
      return evolution (this, from:"Bayleef", hp:HP150, type:G, retreatCost:2) {
        weakness G
        weakness R
        resistance W, MINUS30
        pokePower "Nurture and Heal", {
          text "Once during your turn (before your attack), you may attach a [G] Energy card from your hand to 1 of your Pokémon. If you do, remove 1 damage counter from that Pokémon. This power can't be used if Meganium ex is affected by a Special Condition."
          actionA {
          }
        }
        move "Razor Leaf", {
          text "50 damage. "
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Power Poison", {
          text "90 damage. Discard 1 Energy attached to Meganium ex. The Defending Pokémon is now Poisoned."
          energyCost G, G, G, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      }
        default:
      return null
    }
  }
}
