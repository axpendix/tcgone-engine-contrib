package tcgwars.logic.impl.gen3;

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
public enum DragonNG implements LogicCardInfo {

  ABSOL_1 ("Absol", "1", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ALTARIA_2 ("Altaria", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CRAWDAUNT_3 ("Crawdaunt", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  FLYGON_4 ("Flygon", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  GOLEM_5 ("Golem", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  GRUMPIG_6 ("Grumpig", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MINUN_7 ("Minun", "7", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  PLUSLE_8 ("Plusle", "8", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  ROSELIA_9 ("Roselia", "9", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SALAMENCE_10 ("Salamence", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  SHEDINJA_11 ("Shedinja", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TORKOAL_12 ("Torkoal", "12", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  CRAWDAUNT_13 ("Crawdaunt", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRAGONAIR_14 ("Dragonair", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  FLYGON_15 ("Flygon", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  GIRAFARIG_16 ("Girafarig", "16", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MAGNETON_17 ("Magneton", "17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  NINJASK_18 ("Ninjask", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SALAMENCE_19 ("Salamence", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  SHELGON_20 ("Shelgon", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SKARMORY_21 ("Skarmory", "21", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  VIBRAVA_22 ("Vibrava", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BAGON_23 ("Bagon", "23", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CAMERUPT_24 ("Camerupt", "24", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  COMBUSKEN_25 ("Combusken", "25", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DRATINI_26 ("Dratini", "26", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  FLAAFFY_27 ("Flaaffy", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  FORRETRESS_28 ("Forretress", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GRAVELER_29 ("Graveler", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GRAVELER_30 ("Graveler", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GROVYLE_31 ("Grovyle", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GYARADOS_32 ("Gyarados", "32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HORSEA_33 ("Horsea", "33", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  HOUNDOOM_34 ("Houndoom", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  MAGNETON_35 ("Magneton", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MARSHTOMP_36 ("Marshtomp", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MEDITITE_37 ("Meditite", "37", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  NINJASK_38 ("Ninjask", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SEADRA_39 ("Seadra", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEADRA_40 ("Seadra", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SHELGON_41 ("Shelgon", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SHELGON_42 ("Shelgon", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SHUPPET_43 ("Shuppet", "43", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SNORUNT_44 ("Snorunt", "44", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  SWELLOW_45 ("Swellow", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VIBRAVA_46 ("Vibrava", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VIBRAVA_47 ("Vibrava", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WHISCASH_48 ("Whiscash", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BAGON_49 ("Bagon", "49", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BAGON_50 ("Bagon", "50", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  BARBOACH_51 ("Barboach", "51", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CORPHISH_52 ("Corphish", "52", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CORPHISH_53 ("Corphish", "53", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CORPHISH_54 ("Corphish", "54", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GEODUDE_55 ("Geodude", "55", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GEODUDE_56 ("Geodude", "56", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRIMER_57 ("Grimer", "57", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HORSEA_58 ("Horsea", "58", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  HOUNDOUR_59 ("Houndour", "59", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MAGIKARP_60 ("Magikarp", "60", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAGNEMITE_61 ("Magnemite", "61", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MAGNEMITE_62 ("Magnemite", "62", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MAGNEMITE_63 ("Magnemite", "63", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MAREEP_64 ("Mareep", "64", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MUDKIP_65 ("Mudkip", "65", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  NINCADA_66 ("Nincada", "66", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NINCADA_67 ("Nincada", "67", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NINCADA_68 ("Nincada", "68", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NUMEL_69 ("Numel", "69", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  NUMEL_70 ("Numel", "70", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  PINECO_71 ("Pineco", "71", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SLUGMA_72 ("Slugma", "72", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SPOINK_73 ("Spoink", "73", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SPOINK_74 ("Spoink", "74", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWABLU_75 ("Swablu", "75", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TAILLOW_76 ("Taillow", "76", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TORCHIC_77 ("Torchic", "77", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TRAPINCH_78 ("Trapinch", "78", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TRAPINCH_79 ("Trapinch", "79", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TREECKO_80 ("Treecko", "80", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WURMPLE_81 ("Wurmple", "81", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BALLOON_BERRY_82 ("Balloon Berry", "82", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BUFFER_PIECE_83 ("Buffer Piece", "83", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ENERGY_RECYCLE_SYSTEM_84 ("Energy Recycle System", "84", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HIGH_PRESSURE_SYSTEM_85 ("High Pressure System", "85", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  LOW_PRESSURE_SYSTEM_86 ("Low Pressure System", "86", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  MR_BRINEY_S_COMPASSION_87 ("Mr. Briney's Compassion", "87", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TV_REPORTER_88 ("TV Reporter", "88", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  AMPHAROS_EX_89 ("Ampharos ex", "89", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _LIGHTNING_]),
  DRAGONITE_EX_90 ("Dragonite ex", "90", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
  GOLEM_EX_91 ("Golem ex", "91", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _FIGHTING_]),
  KINGDRA_EX_92 ("Kingdra ex", "92", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  LATIAS_EX_93 ("Latias ex", "93", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _COLORLESS_]),
  LATIOS_EX_94 ("Latios ex", "94", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _COLORLESS_]),
  MAGCARGO_EX_95 ("Magcargo ex", "95", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _FIRE_]),
  MUK_EX_96 ("Muk ex", "96", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _GRASS_]),
  RAYQUAZA_EX_97 ("Rayquaza ex", "97", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _COLORLESS_]),
  CHARMANDER_98 ("Charmander", "98", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  CHARMELEON_99 ("Charmeleon", "99", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_100 ("Charizard", "100", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DragonNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DRAGON;
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
      case ABSOL_1:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Bad News", {
          text "If the number of cards in your opponent's hand is at least 6, choose a number of cards there, without looking, until your opponent has 5 cards left. Have your opponent discard the cards you chose."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Prize Count", {
          text "20+ damage. If you have more Prize cards left than your opponent, this attack does 20 damage plus 20 more damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ALTARIA_2:
      return evolution (this, from:"Swablu", hp:HP080, type:C, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Dragon Dance", {
          text "During your next turn, if any of your current Active Pokémon does damage to any Defending Pokémon, the attack does 40 more damage (before applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dragon Song", {
          text "30 damage. Each Defending Pokémon is now Asleep."
          energyCost W, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CRAWDAUNT_3:
      return evolution (this, from:"Corphish", hp:HP080, type:W, retreatCost:2) {
        weakness L
        pokeBody "Power Pinchers", {
          text "As long as Crawdaunt is your Active Pokémon, when any of your Active Pokémon does damage to the Defending Pokémon, the attack does 10 more damage (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Guillotine", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case FLYGON_4:
      return evolution (this, from:"Vibrava", hp:HP120, type:C, retreatCost:2) {
        weakness C
        resistance R, MINUS30
        resistance L, MINUS30
        move "Energy Shower", {
          text "Attach any number of basic Energy cards from your hand to your Pokémon in any way you like."
          energyCost G, L
          attackRequirement {}
          onAttack {

          }
        }
        move "Rainbow Burn", {
          text "30+ damage. Does 30 damage plus 10 more damage for each type of basic Energy card attached to Flygon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GOLEM_5:
      return evolution (this, from:"Graveler", hp:HP120, type:F, retreatCost:4) {
        weakness W
        move "Rock Vengeance", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on all of your Active Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rock Slide", {
          text "60 damage. Does 20 damage to 2 of your opponent's Benched Pokémon (1 if there is only 1). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GRUMPIG_6:
      return evolution (this, from:"Spoink", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Psychic Boom", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mind Trip", {
          text "50 damage. If Grumpig and the Defending Pokémon have the same amount of Energy attached to them, the Defending Pokémon is now Confused."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MINUN_7:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokeBody "Chain of Events", {
          text "As long as Minun is your Active Pokémon, whenever your other Active Pokémon, if any, attacks, you may use Cheer On after the first attack (you still need the necessary Energy to use Cheer On). You can't use Cheer On more than once in this way even if your other Active Pokémon has the Chain of Events Poké-Body."
          delayedA {
          }
        }
        move "Cheer On", {
          text "Remove 1 damage counter from each of your Pokémon (including Minun)."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Special Circuit", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. If you choose Pokémon that has a Poké-Power or Poké-Body, this attack does 40 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PLUSLE_8:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokeBody "Chain of Events", {
          text "As long as Plusle is your Active Pokémon, whenever your other Active Pokémon, if any, attacks, you may use Cheer On after the first attack (you still need the necessary Energy to use Cheer On). You can't use Cheer On more than once in this way even if your other Active Pokémon has the Chain of Events Poké-Body."
          delayedA {
          }
        }
        move "Cheer On", {
          text "Remove 1 damage counter from each of your Pokémon (including Plusle)."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Extra Circuit", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. If you choose Pokémon-ex, this attack does 40 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ROSELIA_9:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Thick Skin", {
          text "Roselia can't be affected by any Special Conditions."
          delayedA {
          }
        }
        move "Speed Growth", {
          text "Attach up to 2 [G] Energy cards from your hand to your Pokémon in any way you like."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sleep Powder", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SALAMENCE_10:
      return evolution (this, from:"Shelgon", hp:HP120, type:C, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        pokePower "Dragon Wind", {
          text "Once during your turn (before your attack), if Salamence is your Active Pokémon, you may switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. This power can't be used if Salamence is affected by a Special Condition."
          actionA {
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Salamence during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Dragon Claw", {
          text "60 damage."
          energyCost R, W, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SHEDINJA_11:
      return evolution (this, from:"Nincada", hp:HP030, type:G, retreatCost:1) {
        pokeBody "Wonder Guard", {
          text "Prevent all effects of attacks, including damage, done to Shedinja by your opponent's Evolved Pokémon and Pokémon-ex."
          delayedA {
          }
        }
        move "Damage Curse", {
          text "Put 1 damage counter, plus 1 more damage counter for each damage counter on Shedinja, on the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TORKOAL_12:
      return basic (this, hp:HP080, type:R, retreatCost:3) {
        weakness W
        move "Power Generation", {
          text "Search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Scorching Smoke", {
          text "The Defending Pokémon is now Burned. Flip a coin. If tails, discard a [R] Energy card attached to Torkoal."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CRAWDAUNT_13:
      return evolution (this, from:"Corphish", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Poison Claws", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rend", {
          text "30+ damage. If the Defending Pokémon has any damage counters on it, this attack does 30 damage plus 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DRAGONAIR_14:
      return evolution (this, from:"Dratini", hp:HP070, type:C, retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Dazzle Blast", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Healing Wave", {
          text "30 damage. Remove 1 damage counter from each of your Active Pokémon."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FLYGON_15:
      return evolution (this, from:"Vibrava", hp:HP100, type:C, retreatCost:2) {
        pokeBody "Sand Guard", {
          text "Whenever Flygon would be damaged by your opponent's attack (after applying Weakness and Resistance), flip a coin. If heads, reduce that damage by 20."
          delayedA {
          }
        }
        move "Air Slash", {
          text "60 damage. Flip a coin. If tails, discard an Energy card attached to Flygon."
          energyCost G, L, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GIRAFARIG_16:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Synchronized Search", {
          text "If Girafarig and the Defending Pokémon have the same amount of Energy attached to them, pick any 1 card from your deck and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Breaking Impact", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each [C] Energy in that Pokémon's Retreat Cost to that Pokémon (after applying effects to the Retreat Cost). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case MAGNETON_17:
      return evolution (this, from:"Magnemite", hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Magnetic Field", {
          text "Once during your turn (before your attack), if you have basic Energy cards in your discard pile, you may discard any 1 card from your hand. Then search for up to 2 basic Energy cards from your discard pile, show them to your opponent, and put them into your hand. You can't return the card you first discarded to your hand in this way. This power can't be used if Magneton is affected by a Special Condition."
          actionA {
          }
        }
        move "Magnetic Force", {
          text "10x damage. Does 10 damage times the amount of Energy attached to all of your Pokémon (including Magneton)."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NINJASK_18:
      return evolution (this, from:"Nincada", hp:HP070, type:G, retreatCost:null) {
        weakness R
        pokePower "Loose Shell", {
          text "Once during your turn, when you play Ninjask from your hand to evolve 1 of your Pokémon, you may search your deck for Shedinja and put it onto your Bench. Treat the new Benched Pokémon as a Basic Pokémon. Shuffle your deck afterward."
          actionA {
          }
        }
        move "Quick Touch", {
          text "30 damage. You may switch Ninjask with 1 of your Benched Pokémon. If you do, you may move any number of [G] Energy cards attached to Ninjask to the new Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SALAMENCE_19:
      return evolution (this, from:"Shelgon", hp:HP100, type:C, retreatCost:2) {
        pokeBody "Intimidating Fang", {
          text "As long as Salamence is your Active Pokémon, any damage done to your Pokémon by an opponent's attack is reduced by 10 (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Dragon Flame", {
          text "40+ damage. You may discard an Energy card attached to Salamence. If you do, this attack does 40 damage plus 20 more damage."
          energyCost R, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHELGON_20:
      return evolution (this, from:"Bagon", hp:HP080, type:C, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        move "Scrunch", {
          text "Flip a coin. If heads, prevent all damage done to Shelgon during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rolling Attack", {
          text "50 damage."
          energyCost R, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SKARMORY_21:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Pick On", {
          text "If the number of cards in your opponent's hand is at least 6, look at his or her hand. Choose a number of cards there until your opponent has 5 cards left in his or her hand and have your opponent shuffle the cards you chose into his or her deck."
          energyCost M
          attackRequirement {}
          onAttack {

          }
        }
        move "Power Count", {
          text "20+ damage. Count the amount of Energy attached to all of your Pokémon and all of your opponent's Pokémon. If your Pokémon have less Energy than your opponent's, this attack does 20 damage plus 30 more damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VIBRAVA_22:
      return evolution (this, from:"Trapinch", hp:HP080, type:C, retreatCost:1) {
        weakness C
        resistance R, MINUS30
        resistance L, MINUS30
        move "Quick Charge", {
          text "Search your deck for up to 3 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dragon Spark", {
          text "Flip a coin. If heads, this attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance to Benched Pokémon.)"
          energyCost G, L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BAGON_23:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Combustion", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CAMERUPT_24:
      return evolution (this, from:"Numel", hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Super Singe", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Ram", {
          text "50 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case COMBUSKEN_25:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Combustion", {
          text "40 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DRATINI_26:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Dragon Dew", {
          text "Remove 2 damage counters from 1 of your Pokémon (remove 1 if there is only 1)."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Slap", {
          text "10 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case FLAAFFY_27:
      return evolution (this, from:"Mareep", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Energy Recall", {
          text "Attach up to 2 basic Energy cards from your discard pile to Flaaffy."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Lightning Ball", {
          text "30 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FORRETRESS_28:
      return evolution (this, from:"Pineco", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Double Metal Ball", {
          text "Put 2 damage counters on each Defending Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Backspin", {
          text "40 damage. After your attack, you may discard 1 Energy card attached to Forretress. If you do, switch Forretress with 1 of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GRAVELER_29:
      return evolution (this, from:"Geodude", hp:HP080, type:F, retreatCost:3) {
        weakness W
        move "Grind", {
          text "10x damage. Does 10 damage times the amount of Energy attached to Graveler."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Big Explosion", {
          text "Does 80 damage to each Active Pokémon (both yours and your opponent's)."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GRAVELER_30:
      return evolution (this, from:"Geodude", hp:HP080, type:F, retreatCost:3) {
        weakness W
        move "Magnitude", {
          text "20 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rollout", {
          text "40 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GROVYLE_31:
      return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Fury Cutter", {
          text "10+ damage. Flip 4 coins. If all of them are heads, this attack does 10 damage plus 60 more damage. If not, this attack does 10 damage plus 10 more damage for each heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GYARADOS_32:
      return evolution (this, from:"Magikarp", hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Dragon Crush", {
          text "Flip a coin. If heads, this attack does 10 damage to each Defending Pokémon. Discard an Energy card from each Defending Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Aqua Sonic", {
          text "80 damage. This attack's damage is not affected by Resistance."
          energyCost W, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case HORSEA_33:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Retaliate", {
          text "10x damage. Flip a coin. If heads, this attack does 10 damage times the number of damage counters on Horsea."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case HOUNDOOM_34:
      return evolution (this, from:"Houndour", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flamethrower", {
          text "50 damage. Discard a [R] Energy card attached to Houndoom."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MAGNETON_35:
      return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Ram", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Triple Smash", {
          text "20+ damage. Flip 3 coins. This attack does 20 damage plus 20 more damage for each heads."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MARSHTOMP_36:
      return evolution (this, from:"Mudkip", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Mud Splash", {
          text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEDITITE_37:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Meditate", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NINJASK_38:
      return evolution (this, from:"Nincada", hp:HP070, type:G, retreatCost:null) {
        weakness R
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sonic Wing", {
          text "30 damage. This attack's damage is not affected by Resistance."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SEADRA_39:
      return evolution (this, from:"Horsea", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Energy Cannon", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to Seadra but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SEADRA_40:
      return evolution (this, from:"Horsea", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Agility", {
          text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Seadra during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Waterfall", {
          text "40 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHELGON_41:
      return evolution (this, from:"Bagon", hp:HP070, type:C, retreatCost:2) {
        pokeBody "Energy Guard", {
          text "As long as Shelgon has any basic Energy cards attached to it, damage done to Shelgon by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Rollout", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHELGON_42:
      return evolution (this, from:"Bagon", hp:HP070, type:C, retreatCost:2) {
        move "Granite Head", {
          text "20 damage. Damage done to Shelgon by an opponent's attack is reduced by 10 (after applying Weakness and Resistance) during your opponent's next turn."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flare", {
          text "40 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHUPPET_43:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Night Attack", {
          text "Put 1 damage counter on 1 of your opponent's Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SNORUNT_44:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Powder Snow", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SWELLOW_45:
      return evolution (this, from:"Taillow", hp:HP070, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        move "Clutch", {
          text "10 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Quick Dive", {
          text "Flip a coin. If heads, choose 1 of your opponent's Pokémon. This attack does 50 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case VIBRAVA_46:
      return evolution (this, from:"Trapinch", hp:HP070, type:C, retreatCost:1) {
        pokeBody "Levitate", {
          text "If Vibrava has any basic Energy cards attached to it, Vibrava's Retreat Cost is 0."
          delayedA {
          }
        }
        move "Razor Wing", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VIBRAVA_47:
      return evolution (this, from:"Trapinch", hp:HP070, type:C, retreatCost:1) {
        move "Dive", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Quick Turn", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WHISCASH_48:
      return evolution (this, from:"Barboach", hp:HP090, type:W, retreatCost:2) {
        weakness G
        pokeBody "Submerge", {
          text "As long as Whiscash is on your Bench, prevent all damage done to Whiscash by opponent's attacks."
          delayedA {
          }
        }
        move "Surf", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Magnitude", {
          text "60 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case BAGON_49:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Flare", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BAGON_50:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        move "Risky Kick", {
          text "10 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Dragon Eye", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost R, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BARBOACH_51:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Splash", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "20 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CORPHISH_52:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Poison Claws", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CORPHISH_53:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Irongrip", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slash", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CORPHISH_54:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Beat", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Toxic Grip", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GEODUDE_55:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Light Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pebble Throw", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GEODUDE_56:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness W
        move "Steady Punch", {
          text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GRIMER_57:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Pound", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Spurt", {
          text "Discard a [G] Energy card attached to Grimer. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HORSEA_58:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOUNDOUR_59:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Roar", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bite", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGIKARP_60:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Call for Family", {
          text "Search your deck for Magikarp and put as many of them as you like onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGNEMITE_61:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Rollout", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hook", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGNEMITE_62:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Random Spark", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MAGNEMITE_63:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAREEP_64:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Jolt", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MUDKIP_65:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Mudkip but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NINCADA_66:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Poison Breath", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NINCADA_67:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Bite", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NINCADA_68:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Leech Life", {
          text "After your attack, remove from Nincada the number of damage counters equal to the damage you did to the Defending Pokémon. If Nincada has fewer damage counters than that, remove all of them."
          energyCost
          attackRequirement {}
          onAttack {

          }
        }
      };
      case NUMEL_69:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Firebreathing", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NUMEL_70:
      return basic (this, hp:HP050, type:R, retreatCost:2) {
        weakness W
        move "Rollout", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Kindle", {
          text "10 damage. Discard a [R] Energy card attached to Numel and then discard an Energy card attached to the Defending Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PINECO_71:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        pokeBody "Exoskeleton", {
          text "Any damage done to Pineco by attacks is reduced by 10. (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SLUGMA_72:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Luring Flame", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SPOINK_73:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Bounce", {
          text "10 damage. After your attack, you may switch Spoink with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SPOINK_74:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Hop", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Psybeam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SWABLU_75:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Lullaby", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Stifling Fluff", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TAILLOW_76:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TORCHIC_77:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Firebreathing", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TRAPINCH_78:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Dig", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TRAPINCH_79:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Bind", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rock Smash", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TREECKO_80:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WURMPLE_81:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Call for Friends", {
          text "Search your deck for Grass Basic Pokémon and put as many of them as you like onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "String Shot", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BALLOON_BERRY_82:
      return pokemonTool (this) {
        text "When the Pokémon Balloon Berry is attached to retreats, discard Balloon Berry instead of discarding Energy cards." +
          "Attach Balloon Berry to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case BUFFER_PIECE_83:
      return pokemonTool (this) {
        text "Attach Buffer Piece to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card." +
          "Damage done to the Pokémon Buffer Piece is attached to by an opponent's attack is reduced by 20 (after applying Weakness and Resistance). At the end of your opponent's turn after you played Buffer Piece, discard Buffer Piece."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case ENERGY_RECYCLE_SYSTEM_84:
      return itemCard (this) {
        text "Search your discard pile for basic Energy cards. You may either show 1 basic Energy card to your opponent and put it into your hand, or show 3 basic Energy cards to your opponent and shuffle them into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case HIGH_PRESSURE_SYSTEM_85:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play." +
          "Each player pays [C] less to retreat his or her Fire and [W] Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case LOW_PRESSURE_SYSTEM_86:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play." +
          "Each Grass and [L] Pokémon in play (both yours and your opponent's) gets +10 HP."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case MR_BRINEY_S_COMPASSION_87:
      return supporter (this) {
        text "Choose 1 of your Pokémon in play (excluding Pokémon-ex). Return that Pokémon and all cards attached to it to your hand." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case TV_REPORTER_88:
      return supporter (this) {
        text "Draw 3 cards. Then discard any 1 card from your hand." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case AMPHAROS_EX_89:
      return evolution (this, from:"Flaaffy", hp:HP150, type:L, retreatCost:3) {
        weakness F
        resistance M, MINUS30
        pokeBody "Conductivity", {
          text "As long as Ampharos ex is in play, whenever your opponent attaches an Energy card to his or her Pokémon from hand, put 1 damage counter on that Pokémon. You can't put more than 1 damage counter even if there is more than 1 Ampharos ex in play."
          delayedA {
          }
        }
        move "Gigavolt", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage. If tails, the Defending Pokémon is now Paralyzed."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DRAGONITE_EX_90:
      return evolution (this, from:"Dragonair", hp:HP150, type:C, retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokePower "Call for Power", {
          text "As often as you like during your turn, you may move an Energy card attached to 1 of your Pokémon to Dragonite ex. This power can't be used if Dragonite ex is affected by a Special Condition."
          actionA {
          }
        }
        move "Dragon Wave", {
          text "70 damage. Discard a [W] Energy card and a [L] Energy card attached to Dragonite ex."
          energyCost W, L
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Giant Tail", {
          text "120 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case GOLEM_EX_91:
      return evolution (this, from:"Graveler", hp:HP160, type:F, retreatCost:5) {
        weakness G
        weakness W
        move "Magnitude", {
          text "60 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Double-edge", {
          text "120 damage. Golem ex does 50 damage to itself."
          energyCost F, F, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case KINGDRA_EX_92:
      return evolution (this, from:"Seadra", hp:HP150, type:W, retreatCost:3) {
        weakness G
        weakness L
        move "Genetic Memory", {
          text "Use any attack from Kingdra ex's Basic Pokémon card or Stage 1 Evolution card. (Kingdra ex doesn't have to pay for that attack's Energy cost.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Hydrocannon", {
          text "50+ damage. Does 50 damage plus 20 more damage for each [W] Energy attached to Kingdra ex but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LATIAS_EX_93:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance P, MINUS30
        move "Hypnoblast", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mist Ball", {
          text "100 damage. Discard a [R] Energy and a [W] Energy attached to Latias ex."
          energyCost R, W, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case LATIOS_EX_94:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Energy Stream", {
          text "10 damage. Flip a coin. If heads, search your discard pile for a basic Energy card and attach it to Latios ex."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Luster Purge", {
          text "100 damage. Discard 3 Energy attached to Latios ex."
          energyCost G, L, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MAGCARGO_EX_95:
      return evolution (this, from:"Slugma", hp:HP100, type:R, retreatCost:3) {
        weakness W
        move "Melting Mountain", {
          text "20 damage. Discard the top card from your deck. If that card is a basic Energy card, attach it to Magcargo ex."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lava Flow", {
          text "40+ damage. You may discard any number of basic Energy cards attached to Magcargo ex when you use this attack. If you do, this attack does 40 damage plus 20 more damage for each basic Energy card you discarded."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MUK_EX_96:
      return evolution (this, from:"Grimer", hp:HP100, type:G, retreatCost:2) {
        weakness P
        pokeBody "Toxic Gas", {
          text "As long as Muk ex is your Active Pokémon, ignore all Poké-Powers and Poké-Bodies other than Toxic Gas."
          delayedA {
          }
        }
        move "Poison Breath", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slimy Water", {
          text "40+ damage. Does 40 damage plus 10 more damage for each [C] Energy in the Defending Pokémon's Retreat Cost (after applying effects to the Retreat Cost)."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case RAYQUAZA_EX_97:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance W, MINUS30
        move "Spiral Growth", {
          text "Flip a coin until you get tails. For each heads, search your discard pile for a basic Energy card and attach it to Rayquaza ex."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dragon Burst", {
          text "40x damage. Discard either all [R] Energy or all [L] Energy attached to Rayquaza ex. This attack does 40 damage times the amount of Fire or [L] Energy discarded."
          energyCost R, L
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CHARMANDER_98:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "10 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Charmander."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHARMELEON_99:
      return evolution (this, from:"Charmander", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fireworks", {
          text "40 damage. Flip a coin. If tails, discard a [R] Energy card attached to Charmeleon."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CHARIZARD_100:
      return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:2) {
        weakness W
        move "Collect Fire", {
          text "30 damage. Flip a coin. If heads, search your discard pile for 2 [R] Energy cards and attach them to Charizard (1 if there is only 1)."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Flame Pillar", {
          text "60 damage. You may discard a [R] Energy card attached to Charizard. If you do, choose 1 of your opponent's Benched Pokémon and do 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      default:
      return null;
    }
  }
}
