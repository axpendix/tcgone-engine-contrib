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
public enum HiddenLegendsNG implements LogicCardInfo {

  BANETTE_1 ("Banette", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  CLAYDOL_2 ("Claydol", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  CROBAT_3 ("Crobat", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DARK_CELEBI_4 ("Dark Celebi", "4", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_, _DARKNESS_]),
  ELECTRODE_5 ("Electrode", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  EXPLOUD_6 ("Exploud", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  HERACROSS_7 ("Heracross", "7", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  JIRACHI_8 ("Jirachi", "8", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_, _METAL_]),
  MACHAMP_9 ("Machamp", "9", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MEDICHAM_10 ("Medicham", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  METAGROSS_11 ("Metagross", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_, _METAL_]),
  MILOTIC_12 ("Milotic", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PINSIR_13 ("Pinsir", "13", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHIFTRY_14 ("Shiftry", "14", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  WALREIN_15 ("Walrein", "15", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BELLOSSOM_16 ("Bellossom", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHIMECHO_17 ("Chimecho", "17", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOREBYSS_18 ("Gorebyss", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HUNTAIL_19 ("Huntail", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MASQUERAIN_20 ("Masquerain", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  METANG_21 ("Metang", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  NINETALES_22 ("Ninetales", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RAIN_CASTFORM_23 ("Rain Castform", "23", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  RELICANTH_24 ("Relicanth", "24", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  SNOW_CLOUD_CASTFORM_25 ("Snow-cloud Castform", "25", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  SUNNY_CASTFORM_26 ("Sunny Castform", "26", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  TROPIUS_27 ("Tropius", "27", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  BELDUM_28 ("Beldum", "28", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  BELDUM_29 ("Beldum", "29", Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  CASTFORM_30 ("Castform", "30", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CLAYDOL_31 ("Claydol", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CORSOLA_32 ("Corsola", "32", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  DODRIO_33 ("Dodrio", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GLALIE_34 ("Glalie", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GLOOM_35 ("Gloom", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GOLBAT_36 ("Golbat", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  IGGLYBUFF_37 ("Igglybuff", "37", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  LANTURN_38 ("Lanturn", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LOUDRED_39 ("Loudred", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  LUVDISC_40 ("Luvdisc", "40", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MACHOKE_41 ("Machoke", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MEDICHAM_42 ("Medicham", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  METANG_43 ("Metang", "43", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  METANG_44 ("Metang", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  NUZLEAF_45 ("Nuzleaf", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  RHYDON_46 ("Rhydon", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SEALEO_47 ("Sealeo", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SPINDA_48 ("Spinda", "48", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  STARMIE_49 ("Starmie", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SWALOT_50 ("Swalot", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TENTACRUEL_51 ("Tentacruel", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  BALTOY_52 ("Baltoy", "52", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BALTOY_53 ("Baltoy", "53", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  BELDUM_54 ("Beldum", "54", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CHIKORITA_55 ("Chikorita", "55", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHINCHOU_56 ("Chinchou", "56", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CHINCHOU_57 ("Chinchou", "57", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CLAMPERL_58 ("Clamperl", "58", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CYNDAQUIL_59 ("Cyndaquil", "59", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DODUO_60 ("Doduo", "60", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FEEBAS_61 ("Feebas", "61", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GULPIN_62 ("Gulpin", "62", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  JIGGLYPUFF_63 ("Jigglypuff", "63", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MACHOP_64 ("Machop", "64", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MEDITITE_65 ("Meditite", "65", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MEDITITE_66 ("Meditite", "66", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MINUN_67 ("Minun", "67", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ODDISH_68 ("Oddish", "68", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PLUSLE_69 ("Plusle", "69", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RHYHORN_70 ("Rhyhorn", "70", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SEEDOT_71 ("Seedot", "71", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SHUPPET_72 ("Shuppet", "72", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SNORUNT_73 ("Snorunt", "73", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SPHEAL_74 ("Spheal", "74", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARYU_75 ("Staryu", "75", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SURSKIT_76 ("Surskit", "76", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TENTACOOL_77 ("Tentacool", "77", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOGEPI_78 ("Togepi", "78", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TOTODILE_79 ("Totodile", "79", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  VOLTORB_80 ("Voltorb", "80", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  VULPIX_81 ("Vulpix", "81", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  WHISMUR_82 ("Whismur", "82", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  ZUBAT_83 ("Zubat", "83", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ANCIENT_TECHNICAL_MACHINE_ICE__84 ("Ancient Technical Machine (Ice)", "84", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ANCIENT_TECHNICAL_MACHINE_ROCK__85 ("Ancient Technical Machine (Rock)", "85", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ANCIENT_TECHNICAL_MACHINE_STEEL__86 ("Ancient Technical Machine (Steel)", "86", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ANCIENT_TOMB_87 ("Ancient Tomb", "87", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DESERT_RUINS_88 ("Desert Ruins", "88", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ISLAND_CAVE_89 ("Island Cave", "89", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  LIFE_HERB_90 ("Life Herb", "90", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MAGNETIC_STORM_91 ("Magnetic Storm", "91", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  STEVEN_S_ADVICE_92 ("Steven's Advice", "92", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GROUDON_EX_93 ("Groudon ex", "93", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIGHTING_]),
  KYOGRE_EX_94 ("Kyogre ex", "94", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _WATER_]),
  METAGROSS_EX_95 ("Metagross ex", "95", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
  NINETALES_EX_96 ("Ninetales ex", "96", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _FIRE_]),
  REGICE_EX_97 ("Regice ex", "97", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _WATER_]),
  REGIROCK_EX_98 ("Regirock ex", "98", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIGHTING_]),
  REGISTEEL_EX_99 ("Registeel ex", "99", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _METAL_]),
  VILEPLUME_EX_100 ("Vileplume ex", "100", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]),
  WIGGLYTUFF_EX_101 ("Wigglytuff ex", "101", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _COLORLESS_]),
  GROUDON_102 ("Groudon", "102", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  HiddenLegendsNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.HIDDEN_LEGENDS;
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
      case BANETTE_1:
      return evolution (this, from:"Shuppet", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Shadow Steal", {
          text "10+ damage. Does 10 damage plus 20 more damage for each Special Energy card in your opponent's discard pile."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Darkness Chant", {
          text "Count the number of Basic Pokémon or Evolution cards in your discard pile. Put that many damage counters on the Defending Pokémon. You can't put more than 6 damage counters on the Defending Pokémon in this way."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CLAYDOL_2:
      return evolution (this, from:"Baltoy", hp:HP080, type:P, retreatCost:1) {
        weakness P
        pokeBody "Primal Pull", {
          text "As long as Claydol is your Active Pokémon, each player's Evolved Pokémon pays [C] more Energy to use its attacks."
          delayedA {
          }
        }
        move "Muddy Eye", {
          text "10x damage. Does 10 damage times the number of basic Energy cards attached to Claydol and the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CROBAT_3:
      return evolution (this, from:"Golbat", hp:HP090, type:G, retreatCost:null) {
        weakness P
        move "Flutter Trick", {
          text "20 damage. Flip a coin. If heads, look at your opponent's hand and choose 1 card. Your opponent discards the card you chose."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Triple Poison", {
          text "10 damage. The Defending Pokémon is now Poisoned. Put 3 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DARK_CELEBI_4:
      return basic (this, hp:HP070, type:[G, D], retreatCost:1) {
        weakness R
        move "Dark Provide", {
          text "Attach up to 1 Grass or [D] Energy card from your hand to your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Leaf Poison", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ELECTRODE_5:
      return evolution (this, from:"Voltorb", hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Mass Destruction", {
          text "Both Electrode and the Defending Pokémon are now Knocked Out. If Electrode has any Special Energy cards attached to it, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case EXPLOUD_6:
      return evolution (this, from:"Loudred", hp:HP120, type:C, retreatCost:2) {
        weakness F
        move "Breaking Sound", {
          text "Does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bass Control", {
          text "Does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunderous Roar", {
          text "30 damage. The Defending Pokémon is now Confused."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hyper Voice", {
          text "60 damage."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case HERACROSS_7:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Extra Draw", {
          text "If your opponent has any Pokémon-ex in play, search your deck for up to 2 [G] Energy and attach them to Heracross. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sonicboom", {
          text "50 damage. This attack's damage isn't affected by Weakness or Resistance."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case JIRACHI_8:
      return basic (this, hp:HP070, type:[P, M], retreatCost:1) {
        weakness R
        move "Make a Wish", {
          text "Search your deck for a card that evolves from 1 of your Pokémon and put it on that Pokémon. (This counts as evolving that Pokémon.) If you do, put 1 damage counter on Jirachi. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Mind Bend", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, M
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MACHAMP_9:
      return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
        weakness P
        pokeBody "Overzealous", {
          text "If your opponent has any Pokémon-ex in play, each of Machamp's attacks do 30 more damage to the Defending Pokémon."
          delayedA {
          }
        }
        move "Brick Smash", {
          text "40 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Cross Chop", {
          text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 30 more damage."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MEDICHAM_10:
      return evolution (this, from:"Meditite", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Meditate", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Chakra Points", {
          text "10+ damage. Does 10 damage plus 10 more damage for each card in your opponent's hand."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case METAGROSS_11:
      return evolution (this, from:"Metang", hp:HP100, type:[P, M], retreatCost:2) {
        weakness R
        resistance P, MINUS30
        pokePower "Metal Juncture", {
          text "As often as you like during your turn (before your attack), you may move a [M] Energy card attached to 1 of your Benched Pokémon to your Active Pokémon. This power can't be used if Metagross is affected by a Special Condition."
          actionA {
          }
        }
        move "Squared Attack", {
          text "30x damage. Flip 4 coins. This attack does 30 damage times the number of heads."
          energyCost P, M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MILOTIC_12:
      return evolution (this, from:"Feebas", hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokePower "Healing Shower", {
          text "Once during your turn, when you play Milotic from your hand to evolve 1 of your Pokémon, you may remove all damage counters from all of your Pokémon and your opponent's Pokémon (excluding Pokémon-ex)."
          actionA {
          }
        }
        move "Wave Splash", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Distorted Wave", {
          text "80 damage. Before doing damage, remove 3 damage counters from the Defending Pokémon (all if there are less than 3)."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case PINSIR_13:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        pokeBody "Crust", {
          text "Any damage done to Pinsir by attacks from your opponent's Basic Pokémon is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Sonicboom", {
          text "30 damage. This attack's damage isn't affected by Weakness or Resistance."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SHIFTRY_14:
      return evolution (this, from:"Nuzleaf", hp:HP110, type:D, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Push Aside", {
          text "30 damage. Look at your opponent's hand and choose 1 Basic Pokémon or Evolution card you find there. Your opponent puts it at the bottom of his or her deck."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Supernatural Power", {
          text "40+ damage. If you have the same number of cards in your hand as your opponent, this attack does 40 damage plus 40 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WALREIN_15:
      return evolution (this, from:"Sealeo", hp:HP120, type:W, retreatCost:3) {
        weakness M
        pokePower "Crush Draw", {
          text "Once during your turn (before your attack), you may reveal the top card of your deck. If that card is a basic Energy card, attach it to 1 of your Pokémon. If not, put the card back on your deck. This power can't be used if Walrein is affected by a Special Condition."
          actionA {
          }
        }
        move "Sheer Cold", {
          text "50 damage. Flip a coin. If heads, each Defending Pokémon can't attack during your opponent's next turn."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case BELLOSSOM_16:
      return evolution (this, from:"Gloom", hp:HP100, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        pokePower "Heal Dance", {
          text "Once during your turn (before your attack), you may remove 2 damage counters from 1 of your Pokémon. You can't use more than 1 Heal Dance Poké-Power each turn. This power can't be used if Bellossom is affected by a Special Condition."
          actionA {
          }
        }
        move "Miracle Powder", {
          text "10 damage. Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Solarbeam", {
          text "50 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CHIMECHO_17:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Chime", {
          text "Search your opponent's discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your opponent's discard pile.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psychic Boom", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GOREBYSS_18:
      return evolution (this, from:"Clamperl", hp:HP070, type:W, retreatCost:null) {
        weakness L
        move "Stun Needle", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mystic Water", {
          text "20+ damage. Does 20 damage plus 10 more damage for each [P] Energy in play."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HUNTAIL_19:
      return evolution (this, from:"Clamperl", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Bite", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Dark Splash", {
          text "40+ damage. Does 40 damage plus 10 more damage for each [D] Pokémon in play."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MASQUERAIN_20:
      return evolution (this, from:"Surskit", hp:HP070, type:G, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Silver Wind", {
          text "30 damage. During your next turn, if an attack does damage to the Defending Pokémon (after applying Weakness and Resistance), that attack does 30 more damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case METANG_21:
      return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Metal Load", {
          text "Search your discard pile for a [M] Energy card and attach it to Metang."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metal Claw", {
          text "30 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case NINETALES_22:
      return evolution (this, from:"Vulpix", hp:HP070, type:F, retreatCost:1) {
        weakness W
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Ninetales by your opponent's Pokémon-ex."
          delayedA {
          }
        }
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Will-o'-the-wisp", {
          text "50 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAIN_CASTFORM_23:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Sunny Castform, or Snow-cloud Castform and switch it with Rain Castform. (Any cards attached to Rain Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Rain Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
          }
        }
        move "Scattered Shower", {
          text "Shuffle your hand into your deck. Draw up to 5 cards."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Rainy Day Blues", {
          text "20 damage. If Low Pressure System is in play, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RELICANTH_24:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        pokeBody "Deep Sleep", {
          text "As long as Relicanth is your Active Pokémon, a player flips 2 coins for each of his or her Pokémon that is Asleep between turns. If either coin is tails, that Pokémon is still Asleep."
          delayedA {
          }
        }
        move "Yawn", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SNOW_CLOUD_CASTFORM_25:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness M
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Sunny Castform and switch it with Snow-cloud Castform. (Any cards attached to Snow-cloud Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Snow-cloud Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
          }
        }
        move "Flurries", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "White Snow", {
          text "50+ damage. If Magnetic Storm is in play, this attack does 50 damage plus 20 more damage."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SUNNY_CASTFORM_26:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Snow-cloud Castform and switch it with Sunny Castform. (Any cards attached to Sunny Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Sunny Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
          }
        }
        move "Sunshine", {
          text "Search your discard pile for a Stadium card, show it to your opponent, and put it into your hand."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Sunburn", {
          text "40 damage. If High Pressure System is in play, the Defending Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TROPIUS_27:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Fruition", {
          text "Move 1 Energy card attached to Tropius to another of your Pokémon and remove 4 damage counters from that Pokémon (all if there are less than 4)."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Gust", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BELDUM_28:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness F
        resistance G, MINUS30
        pokeBody "Levitate", {
          text "If Beldum has any Energy attached to it, Beldum's Retreat Cost is 0."
          delayedA {
          }
        }
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BELDUM_29:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness F
        resistance G, MINUS30
        pokePower "Magnetic Call", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a Water Basic Pokémon and put it onto your Bench. Shuffle your deck afterward. This power can't be used if Beldum is affected by a Special Condition."
          actionA {
          }
        }
        move "Metal Charge", {
          text "30 damage. Put 1 damage counter on Beldum."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CASTFORM_30:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Sunny Castform, Rain Castform, or Snow-cloud Castform and switch it with Castform. (Any cards attached to Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
          }
        }
        move "Forecast", {
          text "Search your deck for a Stadium card and play it. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Extra Ball", {
          text "20+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CLAYDOL_31:
      return evolution (this, from:"Baltoy", hp:HP080, type:F, retreatCost:1) {
        weakness W
        move "Hyper Beam", {
          text "20 damage. Flip a coin. If heads, discard 1 Energy attached to the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Ram", {
          text "50 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CORSOLA_32:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness G
        move "Coral Glow", {
          text "Draw a number of cards up to the number of your opponent's Basic Pokémon in play. (You can't have more than 10 cards in your hand in this way.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Surf", {
          text "40 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DODRIO_33:
      return evolution (this, from:"Doduo", hp:HP080, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        pokeBody "Fast Feet", {
          text "Dodrio can retreat even when it is Asleep or Paralyzed."
          delayedA {
          }
        }
        move "Retaliate", {
          text "10x damage. Does 10 damage times the number of damage counters on Dodrio."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slashing Strike", {
          text "40 damage. Flip a coin. If tails, Dodrio can't use Slashing Strike during your next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GLALIE_34:
      return evolution (this, from:"Snorunt", hp:HP080, type:W, retreatCost:1) {
        weakness M
        pokeBody "Ice Wall", {
          text "Any damage done to Glalie by attacks from your opponent's Pokémon with any Special Energy cards attached to it is reduced by 40 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Heavy Blizzard", {
          text "50 damage. Flip a coin. If heads, put 1 damage counter on each of your opponent's Benched Pokémon."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GLOOM_35:
      return evolution (this, from:"Oddish", hp:HP070, type:G, retreatCost:1) {
        weakness F
        move "Cling", {
          text "20 damage. After your attack, remove from Gloom the number of damage counters equal to the damage you did to the Defending Pokémon. If Gloom has fewer damage counters than that, remove all of them."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Razor Leaf", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GOLBAT_36:
      return evolution (this, from:"Zubat", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Supersonic", {
          text "The Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sharp Fang", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case IGGLYBUFF_37:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Jigglypuff from your hand onto Igglybuff (this counts as evolving Igglybuff), and remove all damage counters from Igglybuff."
          actionA {
          }
        }
        move "Set Song", {
          text "Search your deck for a Basic Pokémon and a basic Energy card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case LANTURN_38:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
        weakness F
        pokePower "Energy Grounding", {
          text "Once during your opponent's turn, when any of your Pokémon is Knocked Out by your opponent's attacks, you may use this power. Choose a basic Energy card discarded from the Knocked Out Pokémon and attach it to Lanturn. You can't use more than 1 Energy Grounding Poké-Power each turn."
          actionA {
          }
        }
        move "Lightning Strike", {
          text "50 damage. You may discard all [L] Energy attached to Lanturn. If you do, this attack's base damage is 90 instead of 50."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LOUDRED_39:
      return evolution (this, from:"Whismur", hp:HP080, type:C, retreatCost:2) {
        weakness F
        move "Cracking Punch", {
          text "20 damage. Flip a coin. If heads, each Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Light Punch", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LUVDISC_40:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Loving Draw", {
          text "Draw cards until you have the same number of cards in your hand as your opponent has in his or her hand."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sweet Temptation", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. This attack does 10 damage to the new Defending Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MACHOKE_41:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
        weakness P
        pokeBody "Strikes Back", {
          text "If Machoke is your Active Pokémon and is damaged by an opponent's attack (even if Machoke is Knocked Out), put 1 damage counter on the Attacking Pokémon."
          delayedA {
          }
        }
        move "Low Kick", {
          text "30 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MEDICHAM_42:
      return evolution (this, from:"Meditite", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Steady Punch", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Power Heal", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Medicham. After doing damage, remove 1 damage counter from Medicham."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case METANG_43:
      return evolution (this, from:"Beldum", hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Metal Ball", {
          text "Put 5 damage counters on the Defending Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case METANG_44:
      return evolution (this, from:"Beldum", hp:HP070, type:M, retreatCost:2) {
        weakness F
        resistance G, MINUS30
        pokeBody "Levitate", {
          text "If Metang has any Energy attached to it, Metang's Retreat Cost is 0."
          delayedA {
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
      case NUZLEAF_45:
      return evolution (this, from:"Seedot", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Upper Hand", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case RHYDON_46:
      return evolution (this, from:"Rhyhorn", hp:HP090, type:F, retreatCost:2) {
        weakness W
        pokeBody "Power Diffusion", {
          text "As long as Rhydon is your Active Pokémon, prevent all damage done by attacks to all of your Benched Pokémon."
          delayedA {
          }
        }
        move "Horn Drill", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hyper Tail", {
          text "50+ damage. If the Defending Pokémon has any Poké-Powers or Poké-Bodies, this attack does 50 damage plus 20 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SEALEO_47:
      return evolution (this, from:"Spheal", hp:HP070, type:W, retreatCost:1) {
        weakness M
        move "Super Icy Wind", {
          text "Does 10 damage to each of your opponent's Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Skull Bash", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SPINDA_48:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "The Hula-la", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, both the Defending Pokémon and Spinda are now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Spinda."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case STARMIE_49:
      return evolution (this, from:"Staryu", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Rainbow Star", {
          text "50+ damage. Does 50 damage plus 10 more damage for each type of basic Energy attached to the Defending Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SWALOT_50:
      return evolution (this, from:"Gulpin", hp:HP080, type:G, retreatCost:2) {
        weakness P
        move "Amnesia", {
          text "10 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Swallow Up", {
          text "50+ damage. Before doing damage, count the remaining HP of the Defending Pokémon and Swalot. If the Defending Pokémon has fewer remaining HP than Swalot's, this attack does 50 damage plus 30 more damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TENTACRUEL_51:
      return evolution (this, from:"Tentacool", hp:HP070, type:W, retreatCost:null) {
        weakness L
        move "Long Tentacle", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, discard an Energy card attached to the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Toxic", {
          text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BALTOY_52:
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
      };
      case BALTOY_53:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BELDUM_54:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metal Ball", {
          text "Put 1 damage counter on the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CHIKORITA_55:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness F
        resistance W, MINUS30
        move "Poisonpowder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHINCHOU_56:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Pound", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Spark", {
          text "10 damage. Choose 2 of your opponent's Benched Pokémon. This attack does 10 damage to each of those Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHINCHOU_57:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Random Spark", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Lightning Ball", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CLAMPERL_58:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        pokeBody "Exoskeleton", {
          text "Any damage done to Clamperl by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Bubble", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CYNDAQUIL_59:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Swift", {
          text "10 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10 damage. Does 10 damage plus 10 more damage for each damage counter on Cyndaquil."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DODUO_60:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Drill Peck", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case FEEBAS_61:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ascension", {
          text "Search your deck for a card that evolves from Feebas and put it on Feebas. (This counts as evolving Feebas.) Shuffle your deck afterward."
          energyCost W
          ascension delegate
        }
      };
      case GULPIN_62:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Yawn", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Spit Poison", {
          text "The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case JIGGLYPUFF_63:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Rollout", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sleepy Song", {
          text "Each Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MACHOP_64:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Knuckle Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Karate Chop", {
          text "30- damage. Does 30 damage minus 10 damage for each damage counter on Machop."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MEDITITE_65:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Double Chop", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Calm Mind", {
          text "Remove 2 damage counters from Meditite (remove 1 if there is only 1)."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEDITITE_66:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Jab", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steady Punch", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MINUN_67:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Minus Energy", {
          text "10 damage. Flip a coin. If heads, choose 1 Energy attached to the Defending Pokémon. Your opponent returns that card to his or her hand."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ODDISH_68:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Poisonpowder", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "10 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PLUSLE_69:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Plus Energy", {
          text "Flip a coin. If heads, attach a [L] Energy card from your hand to any of your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dazzle Blast", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RHYHORN_70:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness W
        move "Double Stab", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "50 damage. Rhyhorn does 10 damage to itself."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SEEDOT_71:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Growth Spurt", {
          text "Attach a [G] Energy card from your hand to Seedot."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Trip Over", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHUPPET_72:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Shadow Crush", {
          text "10 damage. You may discard 1 [P] Energy card attached to Shuppet. If you do, your opponent discards 1 Energy card attached to the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SNORUNT_73:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Ice Breath", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case SPHEAL_74:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness M
        move "Freezing Breath", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case STARYU_75:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Core Guard", {
          text "If Staryu has any [P] Energy attached to it, damage done to Staryu by any attack is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Pound", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SURSKIT_76:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Splash About", {
          text "10+ damage. If Surskit has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TENTACOOL_77:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Freefloating", {
          text "If Tentacool has no Energy attached to it, Tentacool's Retreat Cost is 0."
          delayedA {
          }
        }
        move "Wrap", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TOGEPI_78:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Sleepy Song", {
          text "Each Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TOTODILE_79:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Flail", {
          text "10x damage. Does 10 damage for each damage counter on Totodile."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VOLTORB_80:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Recharge", {
          text "Search your deck for a [L] Energy card and attach it to Voltorb. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rolling Attack", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VULPIX_81:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ascension", {
          text "Search your deck for a card that evolves from Vulpix and put it on Vulpix. (This counts as evolving Vulpix.) Shuffle your deck afterward."
          // errata: https://compendium.pokegym.net/ruling/705/
          // EX Hidden Legends Feebas is receiving errata for its "Ascension" attack to bring it in line with the Japanese version of the card. It should read, "Flip a coin. If heads, search your deck for a card that evolves from Feebas and put it on Feebas. (This counts as evolving Feebas.) Shuffle your deck afterward." Please note that this only affects Feebas; Vulpix's "Ascension" attack does not require a coin flip.
          // TODO: Handle the coin flip mentioned in the errata
          ascension delegate
        }
      };
      case WHISMUR_82:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Wail", {
          text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ZUBAT_83:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Quick Turn", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Surprise", {
          text "Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ANCIENT_TECHNICAL_MACHINE_ICE__84:
      return pokemonTool (this) {
        text "Attach this card to 1 of your Evolved Pokémon (excluding Pokémon-ex and Pokémon that has an owner in its name) in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Ancient Technical Machine (Ice)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case ANCIENT_TECHNICAL_MACHINE_ROCK__85:
      return pokemonTool (this) {
        text "Attach this card to 1 of your Evolved Pokémon (excluding Pokémon-ex and Pokémon that has an owner in its name) in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Ancient Technical Machine (Rock)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case ANCIENT_TECHNICAL_MACHINE_STEEL__86:
      return pokemonTool (this) {
        text "Attach this card to 1 of your Evolved Pokémon (excluding Pokémon-ex and Pokémon that has an owner in its name) in play. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Ancient Technical Machine (Steel)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case ANCIENT_TOMB_87:
      return stadium (this) {
        text "Don't apply Weakness for all Pokémon in play (excluding Pokémon-ex and Pokémon that has an owner in its name)." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        def eff
        onPlay {
          eff = getter (GET_WEAKNESSES) {h->
            if(!h.effect.target.EX && !h.effect.target.topPokemonCard.cardTypes.is(OWNERS_POKEMON)){
              h.object = []
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case DESERT_RUINS_88:
      return stadium (this) {
        text "At any time between turns, each player puts 1 damage counter on his or her Pokémon-ex with maximum HP of at least 100." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        def eff
        onPlay {
          eff = delayed {
            before BEGIN_TURN, {
              def once = true
              all.each {
                if(it.EX && it.fullHP.value >= 100){
                  if(once) {
                    bc "[Desert Ruins]"
                    once = false
                  }
                  directDamage(10, it, TRAINER_CARD)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case ISLAND_CAVE_89:
      return stadium (this) {
        text "Whenever any player attaches an Energy card from his or her hand to [W] Pokémon, [F] Pokémon, or [M] Pokémon, remove any Special Conditions from that Pokémon." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        def eff
        onPlay {
          eff = delayed {
            after ATTACH_ENERGY, {
              def pcs = ef.resolvedTarget
              if (ef.reason==PLAY_FROM_HAND && (pcs.types.contains(W) || pcs.types.contains(F) || pcs.types.contains(M))) {
                bc "Island Cave removes all Special Conditions from $pcs"
                if (pcs.specialConditions) {
                  clearSpecialCondition(pcs, TRAINER_CARD)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case LIFE_HERB_90:
      return itemCard (this) {
        text "Flip a coin. If heads, choose 1 of your Pokémon (excluding Pokémon-ex). Remove all Special Conditions and 6 damage counters from that Pokémon (all if it has less than 6)."
        onPlay {
        }
        playRequirement{
        }
      };
      case MAGNETIC_STORM_91:
      return stadium (this) {
        text "Any damage done by attacks from [P] Pokémon and [F] Pokémon (both yours and your opponent's) is not affected by Resistance." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case STEVEN_S_ADVICE_92:
      return supporter (this) {
        text "Draw a number of cards up to the number of your opponent's Pokémon in play. If you have more than 7 cards (including this one) in your hand you can't play this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case GROUDON_EX_93:
      return basic (this, hp:HP100, type:F, retreatCost:3) {
        weakness W
        pokeBody "Mark of Antiquity", {
          text "As long as Groudon ex is your Active Pokémon, each player's Kyogre ex and Rayquaza ex can't attack."
          delayedA {
          }
        }
        move "Rock Tumble", {
          text "30 damage. This attack's damage is not affected by Resistance."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Crushing Mantle", {
          text "50+ damage. You may discard from your hand as many Energy cards as you like. If you do, this attack does 50 damage plus 10 more damage for each Energy card you discarded."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case KYOGRE_EX_94:
      return basic (this, hp:HP100, type:W, retreatCost:3) {
        weakness G
        pokeBody "Mark of Antiquity", {
          text "As long as Kyogre ex is your Active Pokémon, each player's Groudon ex and Rayquaza ex can't attack."
          delayedA {
          }
        }
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Super Tidal Wave", {
          text "50+ damage. You may show your hand to your opponent. If you do, this attack does 50 damage plus 10 more damage for each Energy card in your hand. After doing damage, shuffle the Energy cards back into your deck."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case METAGROSS_EX_95:
      return evolution (this, from:"Metang", hp:HP150, type:M, retreatCost:4) {
        weakness F
        weakness R
        resistance G, MINUS30
        move "Metal Reversal", {
          text "40 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. If you do, this attack does 40 damage to the new Defending Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Extra Comet Punch", {
          text "50+ damage. During your next turn, Extra Comet Punch does 50 damage plus 50 more damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NINETALES_EX_96:
      return evolution (this, from:"Vulpix", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Intense Glare", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Burned and Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fire Blast", {
          text "100 damage. Discard a [R] Energy attached to Ninetales ex."
          energyCost R, C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case REGICE_EX_97:
      return basic (this, hp:HP090, type:W, retreatCost:2) {
        weakness M
        pokeBody "Crystal Body", {
          text "Prevent all effects of attacks, except damage, done to Regice ex by the Attacking Pokémon."
          delayedA {
          }
        }
        move "Freeze Lock", {
          text "60 damage. Flip a coin. If heads, your opponent can't attach Energy cards from his or her hand to the Defending Pokémon during his or her next turn."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case REGIROCK_EX_98:
      return basic (this, hp:HP100, type:F, retreatCost:3) {
        weakness W
        pokeBody "Healing Stone", {
          text "At any time between turns, remove 1 damage counter from Regirock ex."
          delayedA {
          }
        }
        move "Tonnage", {
          text "60+ damage. You may do 60 damage plus 20 more damage. If you do, Regirock ex does 30 damage to itself."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case REGISTEEL_EX_99:
      return basic (this, hp:HP090, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokeBody "Exoskeleton", {
          text "Any damage done to Registeel ex by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Steel Wave", {
          text "50 damage. Does 20 damage to each of your opponent's Benched Pokémon of the same type as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case VILEPLUME_EX_100:
      return evolution (this, from:"Gloom", hp:HP140, type:G, retreatCost:2) {
        weakness P
        pokeBody "Block Dust", {
          text "As long as Vileplume ex is your Active Pokémon, your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand."
          delayedA {
          }
        }
        move "Special Formula", {
          text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep and Poisoned. If tails, the Defending Pokémon is now Confused."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case WIGGLYTUFF_EX_101:
      return evolution (this, from:"Jigglypuff", hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Sleepy Song", {
          text "30 damage. Each Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Do the Wave", {
          text "30+ damage. Does 30 damage plus 10 more damage for each of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GROUDON_102:
      return basic (this, hp:HP080, type:F, retreatCost:3) {
        weakness G
        move "Mud Shot", {
          text "20 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Earthquake", {
          text "60 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, C
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
