package tcgwars.logic.impl.pokemod

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
public enum PokemodNeoDestiny implements LogicCardInfo {
    
  DARK_AMPHAROS_1 ("Dark Ampharos", "1", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  DARK_CROBAT_2 ("Dark Crobat", "2", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DARK_DONPHAN_3 ("Dark Donphan", "3", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DARK_ESPEON_4 ("Dark Espeon", "4", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DARK_FERALIGATR_5 ("Dark Feraligatr", "5", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _WATER_]),
  DARK_GENGAR_6 ("Dark Gengar", "6", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DARK_HOUNDOOM_7 ("Dark Houndoom", "7", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DARK_PORYGON2_8 ("Dark Porygon2", "8", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DARK_SCIZOR_9 ("Dark Scizor", "9", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _METAL_]),
  DARK_TYPHLOSION_10 ("Dark Typhlosion", "10", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  DARK_TYRANITAR_11 ("Dark Tyranitar", "11", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  LIGHT_ARCANINE_12 ("Light Arcanine", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _FIRE_]),
  LIGHT_AZUMARILL_13 ("Light Azumarill", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _WATER_]),
  LIGHT_DRAGONITE_14 ("Light Dragonite", "14", Rarity.HOLORARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE2, _COLORLESS_]),
  LIGHT_TOGETIC_15 ("Light Togetic", "15", Rarity.HOLORARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _COLORLESS_]),
  DARK_ARIADOS_17 ("Dark Ariados", "17", Rarity.RARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DARK_MAGCARGO_18 ("Dark Magcargo", "18", Rarity.RARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DARK_OMASTAR_19 ("Dark Omastar", "19", Rarity.RARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _WATER_]),
  DARK_SLOWKING_20 ("Dark Slowking", "20", Rarity.RARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DARK_URSARING_21 ("Dark Ursaring", "21", Rarity.RARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LIGHT_DRAGONAIR_22 ("Light Dragonair", "22", Rarity.RARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _COLORLESS_]),
  LIGHT_LANTURN_23 ("Light Lanturn", "23", Rarity.RARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _LIGHTNING_]),
  LIGHT_LEDIAN_24 ("Light Ledian", "24", Rarity.RARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _GRASS_]),
  LIGHT_MACHAMP_25 ("Light Machamp", "25", Rarity.RARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE2, _FIGHTING_]),
  LIGHT_PILOSWINE_26 ("Light Piloswine", "26", Rarity.RARE, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _WATER_]),
  UNOWN_G_27 ("Unown G", "27", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_H_28 ("Unown H", "28", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_W_29 ("Unown W", "29", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_X_30 ("Unown X", "30", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  CHANSEY_31 ("Chansey", "31", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DARK_CROCONAW_32 ("Dark Croconaw", "32", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DARK_EXEGGUTOR_33 ("Dark Exeggutor", "33", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DARK_FLAAFFY_34 ("Dark Flaaffy", "34", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  DARK_FORRETRESS_35 ("Dark Forretress", "35", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DARK_HAUNTER_36 ("Dark Haunter", "36", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DARK_OMANYTE_37 ("Dark Omanyte", "37", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DARK_PUPITAR_38 ("Dark Pupitar", "38", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DARK_QUILAVA_39 ("Dark Quilava", "39", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DARK_WIGGLYTUFF_40 ("Dark Wigglytuff", "40", Rarity.UNCOMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  HERACROSS_41 ("Heracross", "41", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  HITMONLEE_42 ("Hitmonlee", "42", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  HOUNDOUR_43 ("Houndour", "43", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  JIGGLYPUFF_44 ("Jigglypuff", "44", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  LIGHT_DEWGONG_45 ("Light Dewgong", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _WATER_]),
  LIGHT_FLAREON_46 ("Light Flareon", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _FIRE_]),
  LIGHT_GOLDUCK_47 ("Light Golduck", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _WATER_]),
  LIGHT_JOLTEON_48 ("Light Jolteon", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _LIGHTNING_]),
  LIGHT_MACHOKE_49 ("Light Machoke", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _FIGHTING_]),
  LIGHT_NINETALES_50 ("Light Ninetales", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _FIRE_]),
  LIGHT_SLOWBRO_51 ("Light Slowbro", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _PSYCHIC_]),
  LIGHT_VAPOREON_52 ("Light Vaporeon", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _WATER_]),
  LIGHT_VENOMOTH_53 ("Light Venomoth", "53", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _GRASS_]),
  LIGHT_WIGGLYTUFF_54 ("Light Wigglytuff", "54", Rarity.UNCOMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _COLORLESS_]),
  SCYTHER_55 ("Scyther", "55", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  TOGEPI_56 ("Togepi", "56", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  UNOWN_C_57 ("Unown C", "57", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_P_58 ("Unown P", "58", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_Q_59 ("Unown Q", "59", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_Z_60 ("Unown Z", "60", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CYNDAQUIL_61 ("Cyndaquil", "61", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DARK_OCTILLERY_62 ("Dark Octillery", "62", Rarity.COMMON, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRATINI_63 ("Dratini", "63", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EXEGGCUTE_64 ("Exeggcute", "64", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GASTLY_65 ("Gastly", "65", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GIRAFARIG_66 ("Girafarig", "66", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GLIGAR_67 ("Gligar", "67", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GROWLITHE_68 ("Growlithe", "68", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  HITMONCHAN_69 ("Hitmonchan", "69", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LARVITAR_70 ("Larvitar", "70", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LEDYBA_71 ("Ledyba", "71", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LIGHT_SUNFLORA_72 ("Light Sunflora", "72", Rarity.COMMON, [POKEMON, EVOLUTION, LIGHT_POKEMON, STAGE1, _GRASS_]),
  MACHOP_73 ("Machop", "73", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MANTINE_74 ("Mantine", "74", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAREEP_75 ("Mareep", "75", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PHANPY_76 ("Phanpy", "76", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PINECO_77 ("Pineco", "77", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PORYGON_78 ("Porygon", "78", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PSYDUCK_79 ("Psyduck", "79", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  REMORAID_80 ("Remoraid", "80", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEEL_81 ("Seel", "81", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SLUGMA_82 ("Slugma", "82", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SUNKERN_83 ("Sunkern", "83", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SWINUB_84 ("Swinub", "84", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOTODILE_85 ("Totodile", "85", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  UNOWN_L_86 ("Unown L", "86", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_S_87 ("Unown S", "87", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_T_88 ("Unown T", "88", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_V_89 ("Unown V", "89", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  VENONAT_90 ("Venonat", "90", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VULPIX_91 ("Vulpix", "91", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  BROKEN_GROUND_GYM_92 ("Broken Ground Gym", "92", Rarity.RARE, [TRAINER, STADIUM]),
  EXP_ALL_93 ("EXP.ALL", "93", Rarity.RARE, [TRAINER, POKEMON_TOOL]),
  DARK_CLAW_94 ("Dark Claw", "94", Rarity.RARE, [TRAINER, POKEMON_TOOL]),
  SILVER_BANGLE_95 ("Silver Bangle", "95", Rarity.RARE, [TRAINER, POKEMON_TOOL]),
  THOUGHT_WAVE_MACHINE_96 ("Thought Wave Machine", "96", Rarity.RARE, [TRAINER]),
  VERMILLION_CITY_97 ("Vermillion City", "97", Rarity.RARE, [TRAINER, STADIUM]),
  KURT_98 ("Kurt", "98", Rarity.RARE, [TRAINER, SUPPORTER]),
  ENERGY_STADIUM_99 ("Energy Stadium", "99", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DEFENDER_100 ("Defender", "100", Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_101 ("PlusPower", "101", Rarity.UNCOMMON, [TRAINER]),
  ULTRA_BALL_102 ("Ultra Ball", "102", Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CATCHER_103 ("Pokémon Catcher", "103", Rarity.RARE, [TRAINER]),
  ROCKET_S_ENERGY_BOMB_104 ("Rocket's Energy Bomb", "104", Rarity.RARE, [TRAINER]),
  DARK_AMPHAROS_105 ("Dark Ampharos", "105", Rarity.HOLORARE, [POKEMON, DARK_POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  SHINING_CELEBI_106 ("Shining Celebi", "106", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _GRASS_]),
  SHINING_CHARIZARD_107 ("Shining Charizard", "107", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _FIRE_]),
  SHINING_KABUTOPS_108 ("Shining Kabutops", "108", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _FIGHTING_]),
  SHINING_MEWTWO_109 ("Shining Mewtwo", "109", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _PSYCHIC_]),
  SHINING_NOCTOWL_110 ("Shining Noctowl", "110", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _COLORLESS_]),
  SHINING_RAICHU_111 ("Shining Raichu", "111", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _LIGHTNING_]),
  SHINING_STEELIX_112 ("Shining Steelix", "112", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _METAL_]),
  SHINING_TYRANITAR_113 ("Shining Tyranitar", "113", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _DARKNESS_]),
  ROCKET_S_ENTEI_EX_114 ("Rocket's Entei ex", "114", Rarity.HOLORARE, [POKEMON, BASIC, EX, OWNERS_POKEMON, _DARKNESS_]),
  ROCKET_S_SUICUNE_EX_115 ("Rocket's Entei ex", "115", Rarity.HOLORARE, [POKEMON, BASIC, EX, OWNERS_POKEMON, _DARKNESS_]),
  ROCKET_S_RAIKOU_EX_116 ("Rocket's Raikou ex", "116", Rarity.HOLORARE, [POKEMON, BASIC, EX, OWNERS_POKEMON, _DARKNESS_]),
  ROCKET_S_SNEASEL_EX_117 ("Rocket's Sneasel ex", "117", Rarity.HOLORARE, [POKEMON, BASIC, EX, OWNERS_POKEMON, _DARKNESS_]),
  ROCKET_S_SCIZOR_EX_118 ("Rocket's Scizor ex", "118", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, EX, OWNERS_POKEMON, _DARKNESS_]);
    
  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
  
  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodNeoDestiny(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_NEO_DESTINY;
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
      case DARK_AMPHAROS_1:
      return evolution (this, from:"Dark Flaaffy", hp:HP070, type:L, retreatCost:2) {
        weakness F
        pokeBody "Conductivity", {
          text "Whenever your opponent attaches an Energy card from his or her hand to a Pokémon, this power does 10 damage to that Pokémon. (Don't apply Weakness and Resistance.) This power stops working if you have more than 1 Dark Ampharos in play or while Dark Ampharos is affected by a Special Condition."
          delayedA {
          }
        }
        move "Shock Bolt", {
          text "50 damage. Discard all [L] Energy cards attached to Dark Ampharos or this attack does nothing."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DARK_CROBAT_2:
      return evolution (this, from:"Dark Golbat", hp:HP070, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        pokePower "Surprise Bite", {
          text "When you play Dark Crobat from your hand, you may choose 1 of your opponent's Pokémon. This power does 20 damage to that Pokémon. (Don't apply Weakness and Resistance.)"
          actionA {
          }
        }
        move "Dark Drain", {
          text "Flip a coin for each of your opponent's Pokémon. For each heads, this attack does 10 damage to that Pokémon. Don't apply Weakness and Resistance. Remove a number of damage counters from Dark Crobat equal to the damage dealt. If Dark Crobat has fewer damage counters than that, remove all of them."
          energyCost G, G
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case DARK_DONPHAN_3:
      return evolution (this, from:"Phanpy", hp:HP060, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Tusk Toss", {
          text "If your opponent has any Benched Pokémon, flip a coin. If heads, return the Defending Pokémon and all cards attached to it to your opponent's hand. If tails, your opponent chooses 1 of his or her Benched Pokémon and switches it with the Defending Pokémon."
          energyCost F, F
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Giant Tusk", {
          text "50 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DARK_ESPEON_4:
      return evolution (this, from:"Eevee", hp:HP060, type:P, retreatCost:0) {
        weakness P
        move "Gouge", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage; if tails, this attack does 10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Psysplash", {
          text "Does 10 damage to each of your opponent's Pokémon for each Energy card attached to that Pokémon. Don't apply Weakness and Resistance."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case DARK_FERALIGATR_5:
      return evolution (this, from:"Croconaw", hp:HP080, type:W, retreatCost:3) {
        weakness G
        pokeBody "Scare", {
          text "As long as Dark Feraligatr is your Active Pokémon, all of your opponent's Baby Pokémon Powers stop working and your opponent's Baby Pokémon can't attack. This power stops working while Dark Feraligatr is affected by a Special Condition."
          delayedA {
          }
        }
        move "Crushing Blow", {
          text "50 damage. If the Defending Pokémon has any Energy cards attached to it, flip a coin. If heads, choose 1 of those cards and discard it."
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DARK_GENGAR_6:
      return evolution (this, from:"Haunter", hp:HP070, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        pokeBody "Deep Sleep", {
          text "As long as any Dark Gengar are in play, a player flips 2 coins for each of his or her Pokémon that is Asleep at the end of each turn. If either of them is tails, that Pokémon is still Asleep. This power stops working if Dark Gengar is affected by a Special Condition."
          delayedA {
          }
        }
        move "Pull In", {
          text "30 damage. If your opponent has any Benched Pokémon, you may choose 1 of them and switch it with the Defending Pokémon (before doing damage or other effects of this attack). Either way, the Defending Pokémon is now Asleep."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_HOUNDOOM_7:
      return evolution (this, from:"Houndour", hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Eerie Howl", {
          text "If your opponent's Bench isn't full, look at his or her hand. If your opponent has any Baby Pokémon or Basic Pokémon there, choose 1 of them and put it on his or her Bench. Then, switch it with the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Dark Fire", {
          text "30+ damage. If there are any [D] Energy cards attached to Dark Houndoom, discard 1 of them and this attack does 30 damage plus 20 more damage (plus 10 more damage for the [D] Energy you discarded). If there aren't any, this attack does 30 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_PORYGON2_8:
      return evolution (this, from:"Porygon", hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Spatial Distortion", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, choose a Stadium card from your discard pile and put it into play. (If there's already a Stadium card in play, discard it.) This power can't be used if Dark Porygon2 is affected by a Special Condition."
          actionA {
          }
        }
        move "Curve Attack", {
          text "20 damage. Flip a coin. If heads, prevent all damage done by attacks to Dark Porygon2 during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_SCIZOR_9:
      return evolution (this, from:"Scyther", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Threaten", {
          text "Flip a coin. If heads, look at your opponent's hand. If he or she has any Trainer cards there, choose 1 of them. Your opponent shuffles that card into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_TYPHLOSION_10:
      return evolution (this, from:"Quilava", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Claw Swipe", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rushing Flames", {
          text "30x damage. You may discard any number of [R] Energy cards attached to your Pokémon. Flip a coin for each [R] Energy card discarded in this way. This attack does 30 damage times the number of heads."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_TYRANITAR_11:
      return evolution (this, from:"Dark Pupitar", hp:HP090, type:F, retreatCost:3) {
        weakness W
        resistance L, MINUS30
        move "Mountain Smasher", {
          text "20x damage. Flip a number of coins equal to the number of [F] Energy cards attached to Dark Tyranitar. This attack does 20 damage times the number of heads. Then, for each heads, discard the top card from your opponent's deck."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fling Away", {
          text "50 damage. If your opponent has any Benched Pokémon, this attack does 30 damage instead of 50 and choose 1 of those Benched Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LIGHT_ARCANINE_12:
      return evolution (this, from:"Growlithe", hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokeBody "Drive Off", {
          text "As long as Light Arcanine is your Active Pokémon, once during your turn (before your attack), if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. This power can't be used while Light Arcanine is affected by a Special Condition."
          delayedA {
          }
        }
        move "Gentle Flames", {
          text "50 damage. If the Defending Pokémon is a Baby Pokémon, this attack does 10 damage instead of 50. If the Defending Pokémon is a Basic Pokémon, this attack does 30 damage instead of 50."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LIGHT_AZUMARILL_13:
      return evolution (this, from:"Marill", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bubble Jump", {
          text "30 damage. If you have any Benched Pokémon, flip a coin. If heads, take 2 Energy cards attached to Light Azumarill and attach them to 1 of your Benched Pokémon. Then return Light Azumarill and all cards attached to it to your hand."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LIGHT_DRAGONITE_14:
      return evolution (this, from:"Dragonair", hp:HP100, type:C, retreatCost:2) {
        resistance F, MINUS30
        pokeBody "Miraculous Wind", {
          text "As long as Light Dragonite is your Active Pokémon, each Special Energy card provides [C] Energy instead of its usual type and its other effects stop working. This power stops working while Light Dragonite is affected by a Special Condition."
          delayedA {
          }
        }
        move "Light Wave", {
          text "40 damage. Prevent all effects of attacks, other than damage, done to Light Dragonite during your opponent's next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LIGHT_TOGETIC_15:
      return evolution (this, from:"Togepi", hp:HP060, type:C, retreatCost:0) {
        resistance F, MINUS30
        pokePower "Gift", {
          text "When you play Light Togetic from your hand, your opponent may search his or her deck for a Pokémon Tool card, show that card to you, and put it into his or her hand. Either way, you may do the same, and then each player who searched shuffles his or her deck."
          actionA {
          }
        }
        move "Sweet Kiss", {
          text "30 damage. Your opponent may draw a card."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_ARIADOS_17:
      return evolution (this, from:"Spinarak", hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Entangle", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon, then flip a coin. If heads, the new Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Poison Bind", {
          text "30 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon can't retreat until the end of your opponent's next turn and if the effect of an attack, Poké-Power, or Trainer card would change that player's Active Pokémon, that part of the effect does nothing."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_MAGCARGO_18:
      return evolution (this, from:"Slugma", hp:HP060, type:R, retreatCost:3) {
        weakness W
        pokeBody "Hot Plate", {
          text "As long as Dark Magcargo is your Active Pokémon, whenever a player puts a Baby Pokémon or Basic Pokémon onto his or her Bench from his or her hand, this power does 10 damage to that Pokémon. (Don't apply Weakness and Resistance.) This power stops working if Dark Magcargo is affected by a Special Condition."
          delayedA {
          }
        }
        move "Ball of Flame", {
          text "20 damage. You may discard a [R] Energy card attached to Dark Magcargo when you use this attack. If you do and if your opponent has any Benched Pokémon, choose 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_OMASTAR_19:
      return evolution (this, from:"Omanyte", hp:HP070, type:W, retreatCost:2) {
        weakness G
        resistance R, MINUS30
        move "Prehistoric Water", {
          text "If your opponent has any evolved Pokémon in play, choose 1 of them and flip a coin. If heads, your opponent takes the highest Stage Evolution card on that Pokémon and shuffles it into his or her deck."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Dark Tentacle", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't evolve except from effects of attacks or Pokémon Powers. (Benching that Pokémon ends this effect.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_SLOWKING_20:
      return evolution (this, from:"Slowpoke", hp:HP060, type:P, retreatCost:2) {
        weakness P
        pokePower "Cunning", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, look at the top card of your opponent's deck. Then, you may have your opponent shuffle his or her deck. This power can't be used if Dark Slowking is affected by a Special Condition."
          actionA {
          }
        }
        move "Mind Shock", {
          text "30 damage. Don't apply Weakness or Resistance for this attack."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_URSARING_21:
      return evolution (this, from:"Teddiursa", hp:HP060, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Provoke", {
          text "Look at your opponent's hand. If he or she has any Baby Pokémon and/or Basic Pokémon there, you may put any number of them onto your opponent's Bench (as long as there's room). Then, your opponent looks at your hand. If you have any Baby Pokémon and/or Basic Pokémon there, your opponent may put any number of them onto your Bench (as long as there's room)."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Battle Frenzy", {
          text "For each Pokémon in play (yours and your opponent's), flip a coin. For each heads, this attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance for this attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case LIGHT_DRAGONAIR_22:
      return evolution (this, from:"Dratini", hp:HP080, type:C, retreatCost:2) {
        resistance P, MINUS30
        move "Healing Light", {
          text "Remove 1 damage counter from each of your Pokémon that has any damage counters on it."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Protective Wave", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Light Dragonair."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIGHT_LANTURN_23:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
        weakness F
        move "Searchlight", {
          text "Flip a coin. If heads, each player may choose a card from his or her discard pile and put it into his or her hand."
          energyCost L
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Spark", {
          text "30 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LIGHT_LEDIAN_24:
      return evolution (this, from:"Ledyba", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Flash Touch", {
          text "If you have any Benched Pokémon, switch 1 of them with Light Ledian. As long as that Pokémon is your Active Pokémon, it can't become affected by a Special Condition. (All other effects of attacks, Pokémon Powers, and Trainer cards still happen.)"
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Comet Punch", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIGHT_MACHAMP_25:
      return evolution (this, from:"Machoke", hp:HP100, type:F, retreatCost:2) {
        weakness P
        pokePower "Tag Team", {
          text "When you play Light Machamp from your hand, if it is on your Bench, remove 3 damage counters from your Active Pokémon. If it has fewer damage counters than that, remove all of them. Then, switch Light Machamp with your Active Pokémon."
          actionA {
          }
        }
        move "Beatdown", {
          text "50 damage. If the Defending Pokémon has Dark in its name or is a [D] Pokémon, flip a coin. If heads, this attack does 100 damage instead of 50."
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LIGHT_PILOSWINE_26:
      return evolution (this, from:"Swinub", hp:HP090, type:W, retreatCost:3) {
        weakness M
        resistance L, MINUS30
        pokeBody "Fluffy Wool", {
          text "During your opponent's turn, if Light Piloswine is your Active Pokémon and is damaged by your opponent's attack (even if it's Knocked Out), flip a coin. If heads, the attacking Pokémon is now Asleep. This power stops working if Light Piloswine is already affected by a Special Condition when your opponent attacks."
          delayedA {
          }
        }
        move "Knock Over", {
          text "30 damage. If there is a Stadium card in play, you may discard it."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case UNOWN_G_27:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Give", {
          text "Once during your turn (before your attack), if you have Unown G, Unown I, Unown V, and Unown E on your Bench, you may flip a coin. If heads, search your deck for a basic Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_H_28:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Help", {
          text "Once during your turn (before your attack), if you have Unown H, Unown E, Unown L, and Unown P on your Bench, you may shuffle your hand into your deck, then draw a new hand of the same number of cards."
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_W_29:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Want", {
          text "Once during your turn (before your attack), if you have Unown W, Unown A, Unown N, and Unown T on your Bench, you may flip a coin. If heads, put a Trainer card from your discard pile into your hand."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_X_30:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokeBody "XXXXX", {
          text "Whenever 1 of your Pokémon with Unown in its name uses its Hidden Power attack, flip a coin until you get tails. That attack does 10 more damage for each heads. If you have more than 1 Unown X in play, use only 1 [XXXXX] per turn."
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHANSEY_31:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Doubleslap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Egg Toss", {
          text "80 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case DARK_CROCONAW_32:
      return evolution (this, from:"Totodile", hp:HP060, type:W, retreatCost:2) {
        weakness G
        move "Clamping Jaw", {
          text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing. (Benching either Pokémon ends this effect.)"
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_EXEGGUTOR_33:
      return evolution (this, from:"Exeggcute", hp:HP060, type:P, retreatCost:2) {
        weakness P
        move "Triple Headbutt", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "MAX Burst", {
          text "20x damage. Flip a number of coins equal to the number of Energy cards attached to your opponent's Pokémon. This attack does 20 damage times the number of heads."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_FLAAFFY_34:
      return evolution (this, from:"Mareep", hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "High Voltage", {
          text "10 damage. Flip a coin. If heads, your opponent can't play Trainer cards during his or her next turn."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Stun Wave", {
          text "30 damage. If the Defending Pokémon has a Poké-Power, that power stops working until the end of your next turn."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DARK_FORRETRESS_35:
      return evolution (this, from:"Pineco", hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Armor Up", {
          text "Until the end of your next turn, if Dark Forretress would be Knocked Out by damage from an attack, flip a coin. If heads, Dark Forretress is not Knocked Out and its remaining HP become 10 instead."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Explosion", {
          text "60 damage. Dark Forretress does 60 damage to itself."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case DARK_HAUNTER_36:
      return evolution (this, from:"Gastly", hp:HP060, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        move "Call Back", {
          text "Put a Baby Pokémon or Basic Pokémon card from your opponent's discard pile onto his or her Bench. Put 1 damage counter on that Pokémon. (You can't use this attack if your Bench is full.)"
          energyCost P
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Surround", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon can't retreat during your opponent's next turn."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_OMANYTE_37:
      return evolution (this, from:"Mysterious Fossil", hp:HP040, type:W, retreatCost:1) {
        weakness G
        resistance R, MINUS30
        move "Water Cannon", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each [W] Energy card attached to Dark Omanyte. Don't apply Weakness and Resistance. You can't do more than 30 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case DARK_PUPITAR_38:
      return evolution (this, from:"Larvitar", hp:HP060, type:F, retreatCost:1) {
        weakness W
        resistance L, MINUS30
        move "Rock Tackle", {
          text "40 damage. Dark Pupitar does 10 damage to itself. Dark Pupitar can't use this attack during your next turn."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Explosive Evolution", {
          text "Flip a coin. If heads, this attack does 10 damage to each of your opponent's Pokémon. Don't apply Weakness and Resistance. Then, search your deck for an Evolution card named Dark Tyranitar and put it on Dark Pupitar. (This counts as evolving Dark Pupitar.) Shuffle your deck afterward."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case DARK_QUILAVA_39:
      return evolution (this, from:"Cyndaquil", hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Incinerate", {
          text "Show the top card of your opponent's deck to all players. If it's a Trainer card, discard it."
          energyCost R
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Rushing Magma", {
          text "20x damage. Discard the top 5 cards of your deck. (If there are fewer than 5 cards in your deck, discard all of them.) This attack does 20 damage for each [R] Energy card you discarded in this way."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DARK_WIGGLYTUFF_40:
      return evolution (this, from:"Jigglypuff", hp:HP060, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Dark Song", {
          text "Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Slap Awake", {
          text "20+ damage. If the Defending Pokémon is Asleep or Confused, this attack does 20 damage plus 20 more damage. Then, the Defending Pokémon is no longer Asleep or Confused."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HERACROSS_41:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Tackle", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Charging Horn", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage. If tails, this attack does 30 damage."
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HITMONLEE_42:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness P
        move "One-Two Kick", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Heel Drop", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case HOUNDOUR_43:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Corner", {
          text "The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost D
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Lunge", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case JIGGLYPUFF_44:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Expand", {
          text "10 damage. All damage done to Jigglypuff during your opponent's next turn is reduced by 10 (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LIGHT_DEWGONG_45:
      return evolution (this, from:"Seel", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Freezing Breath", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ice Pillar", {
          text "40 damage. Until the end of your opponent's next turn, as long as Light Dewgong is your Active Pokémon, prevent all damage done by attacks to your Benched Pokémon. (Any other effects of attacks still happen.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LIGHT_FLAREON_46:
      return evolution (this, from:"Eevee", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Warm Up", {
          text "If you have any benched Pokémon, search your deck for a [R] Energy card and attach it to 1 of them. Then shuffle your deck."
          energyCost R
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Burning Flame", {
          text "30+ damage. Flip 2 coins. For each heads, discard a [R] Energy card attached to Light Flareon or this attack does nothing. This attack does 30 damage plus 20 damage for each heads."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LIGHT_GOLDUCK_47:
      return evolution (this, from:"Psyduck", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Flipper Stroke", {
          text "Your opponent looks at the top 3 cards of his or her deck. If any of them are basic Energy cards, he or she may show any number of them to you and put them into his or her hand. You do the same. Either way, each player shuffles his or her deck."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Core Blast", {
          text "30+ damage. This attack does 30 damage plus 20 more damage for each Special Energy card attached to the Defending Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LIGHT_JOLTEON_48:
      return evolution (this, from:"Eevee", hp:HP070, type:L, retreatCost:0) {
        weakness F
        move "Pulse Guard", {
          text "During your opponent's next turn, whenever 30 or more damage is done to Light Jolteon (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
          energyCost L
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Thunder Needle", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads. If you get 2 or more heads, the Defending Pokémon is now Paralyzed."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIGHT_MACHOKE_49:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:2) {
        weakness P
        move "Return Home", {
          text "If you have any Benched Pokémon, shuffle 1 of them and all cards attached to it into your deck."
          energyCost F
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Gentle Kick", {
          text "40 damage. If the Defending Pokémon has no damage counters on it, this attack does 40 damage. If it has any, this attack does 20 damage."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LIGHT_NINETALES_50:
      return evolution (this, from:"Vulpix", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Guiding Flame", {
          text "Put a Baby Pokémon or a Basic Pokémon card from your discard pile onto your Bench. (You can't use this attack if your Bench is full.)"
          energyCost R
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Fire Blast", {
          text "50 damage. Discard a [R] Energy card attached to Light Ninetales in order to use this attack."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LIGHT_SLOWBRO_51:
      return evolution (this, from:"Slowpoke", hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Fish Out", {
          text "Your opponent may choose up to 3 Baby Pokémon, Basic Pokémon, and/or Evolution cards from his or her discard pile and shuffle them into his or her deck. Either way, you may do the same."
          energyCost P
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Splash About", {
          text "20+ damage. If there are more Energy cards attached to the Defending Pokémon than to Light Slowbro, this attack does 20 damage plus 20 more damage. If not, this attack does 20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIGHT_VAPOREON_52:
      return evolution (this, from:"Eevee", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Wash Away", {
          text "If you have any Benched Pokémon, flip a coin. If heads, remove all damage counters from 1 of your Benched Pokémon and discard all Energy cards attached to it."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Hypnoshower", {
          text "30 damage. The Defending Pokémon is now Asleep. Remove 1 damage counter from each Benched Pokémon (yours and your opponent's) with any damage counters on it."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LIGHT_VENOMOTH_53:
      return evolution (this, from:"Venonat", hp:HP080, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Mysterious Wing", {
          text "Your opponent may choose a Baby Pokémon, Basic Pokémon, or Evolution card from his or her discard pile and put it into his or her hand. Either way, you may do the same."
          energyCost G
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Synchronize", {
          text "40 damage. If Light Venomoth and the Defending Pokémon have a different number of Energy cards attached to them, this attack does nothing."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LIGHT_WIGGLYTUFF_54:
      return evolution (this, from:"Jigglypuff", hp:HP080, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Evolution Song", {
          text "Your opponent may choose 1 of his or her Pokémon and search his or her deck for a card that evolves from that Pokémon. Your opponent attaches that card to that Pokémon. This counts as evolving that Pokémon. Either way, you may do the same, and then each player who searched shuffles his or her deck."
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
      };
      case SCYTHER_55:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        resistance F, MINUS30
        move "Agility", {
          text "10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Scyther."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sharp Sickle", {
          text "40 damage. "
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TOGEPI_56:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Charm", {
          text "If the Defending Pokémon attacks during your opponent's next turn, any damage it does is reduced by 10 (before applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Spike Ball Tackle", {
          text "20 damage. Togepi does 10 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case UNOWN_C_57:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Chase", {
          text "As long as Unown C is your Active Pokémon, whenever your opponent's Active Pokémon tries to retreat, flip a coin. If heads, put 1 damage counter on that Pokémon. Apply Weakness and Resistance."
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_P_58:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Perform", {
          text "If an attack damaged Unown P during your opponent's last turn and Unown P was your Active Pokémon, Unown P's Hidden Power attack does that much more damage to the Defending Pokémon. This power can be used even if Unown P is Confused."
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_Q_59:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Quicken", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, prevent all effects of attacks, including damage, done to any of your Pokémon with Unown in its name during your opponent's next turn. If you have more than 1 Unown Q in play, use only 1 Quicken each turn. This power can be used even if Unown Q is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_Z_60:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Zoom", {
          text "As long as Unown Z is Benched, you pay no Energy cost to retreat a Pokémon with Unown in its name."
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CYNDAQUIL_61:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DARK_OCTILLERY_62:
      return evolution (this, from:"Remoraid", hp:HP060, type:W, retreatCost:2) {
        weakness L
        move "Ink Blast", {
          text "20+ damage. This attack does 20 damage plus 10 more damage for each Energy attached to Dark Octillery but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Tentacle Wrap", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, during your opponent's next turn, your opponent pays [C] more to retreat the Defending Pokémon."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DRATINI_63:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Shed", {
          text "Remove 1 damage counter from Dratini."
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Fury Attack", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EXEGGCUTE_64:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        move "Sleep Powder", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GASTLY_65:
      return basic (this, hp:HP040, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        move "Nightmare", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GIRAFARIG_66:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        move "Tail Bite", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Psychic", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GLIGAR_67:
      return basic (this, hp:HP050, type:F, retreatCost:0) {
        weakness G
        resistance F, MINUS30
        move "Stun Poison", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GROWLITHE_68:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Bite", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HITMONCHAN_69:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness P
        move "Dodge", {
          text "If Hitmonchan would be damaged by an attack during your opponent's next turn, flip a coin. If heads, prevent that attack's damage done to Hitmonchan. (Any other effects of attacks still happen.)"
          energyCost F
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Supersonic Jab", {
          text "40 damage. "
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LARVITAR_70:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness W
        resistance L, MINUS30
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn. (Benching or evolving either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Rock Throw", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LEDYBA_71:
      return basic (this, hp:HP040, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Swift", {
          text "20 damage. This attack's damage isn't affected by Weakness, Resistance, Pokémon Powers, or any other effects on the Defending Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIGHT_SUNFLORA_72:
      return evolution (this, from:"Sunkern", hp:HP080, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Reflected Sunlight", {
          text "Attach up to 2 [G] Energy cards from your hand to 1 of your [G] Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Solarbeam", {
          text "40 damage. "
          energyCost G, G, G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MACHOP_73:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness P
        move "Chop", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Punch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MANTINE_74:
      return basic (this, hp:HP060, type:W, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Giant Wave", {
          text "40 damage. Mantine can't attack during your next turn."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MAREEP_75:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PHANPY_76:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Crushing Step", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage; if tails, this attack does 10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PINECO_77:
      return basic (this, hp:HP040, type:G, retreatCost:2) {
        weakness R
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PORYGON_78:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Sharpen", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PSYDUCK_79:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Flipper Splash", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Migraine", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, Psyduck is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case REMORAID_80:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Fury Strikes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEEL_81:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Take Down", {
          text "30 damage. Seel does 10 damage to itself."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SLUGMA_82:
      return basic (this, hp:HP050, type:R, retreatCost:2) {
        weakness W
        move "Combustion", {
          text "30 damage. "
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SUNKERN_83:
      return basic (this, hp:HP040, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        move "Rollout", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sunbathe", {
          text "Flip a coin. If heads, remove all damage counters from Sunkern. Search your deck for a card that evolves from Sunkern and attach that card to Sunkern. This counts as evolving Sunkern. Shuffle your deck afterward."
          energyCost G, G
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case SWINUB_84:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        resistance L, MINUS30
        move "Generate Cold", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOTODILE_85:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Totodile but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_L_86:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Laugh", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, each player shuffles his or her deck. This power can be used even if Unown L is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case UNOWN_S_87:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Search", {
          text "Once during your turn (before your attack), you may look at 1 of your Prize cards. Return that Prize card face down. This power can be used even if Unown S is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "20 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case UNOWN_T_88:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Tell", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, look at your opponent's hand and show your hand to your opponent. This power can be used even if Unown T is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "20 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case UNOWN_V_89:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Vanish", {
          text "When you play Unown V from your hand, you may flip a coin. If heads, return 1 of your Pokémon with Unown in its name (other than Unown V) to your hand. (Discard all cards attached to that card.)"
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VENONAT_90:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poisonpowder", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VULPIX_91:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard 1 [R] Energy card attached to Vulpix in order to use this attack."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BROKEN_GROUND_GYM_92:
      return stadium (this) {
        text "All Baby Pokémon in play have their Baby Pokémon Rules disabled."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case EXP_ALL_93:
      return pokemonTool (this) {
        text "Attach EXP.ALL to 1 of your Pokémon that doesn't have a Pokémon Tool attached to it." +
          "During your opponent's turn, if your Active Pokémon would be Knocked Out by your opponent's attack, you may take 1 of the basic Energy cards attached to your Active Pokémon and attach it to the Pokémon with EXP.ALL attached to it. If you do, discard EXP.ALL."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case DARK_CLAW_94:
      return pokemonTool (this) {
        text "If this card is attached to a [D] Pokémon, each of the attacks of that Pokémon does 10 more damage to your opponent's Active Pokémon (after applying Weakness and Resistance)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case SILVER_BANGLE_95:
      return pokemonTool (this) {
        text "The attacks of the Pokémon this card is attached to (excluding Pokémon-ex) do 10 more damage to your opponent''s Active Pokémon-ex (before applying Weakness and Resistance).'"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case THOUGHT_WAVE_MACHINE_96:
      return basicTrainer (this) {
        text "Flip a coin until you get tails. For each heads, return an Energy card attached to your opponent's Active Pokémon to your opponent's hand. If the Pokémon has fewer attached Energy cards than that, return all of them to your opponent's hand. Your turn is over now (you don't get to attack)."
        onPlay {
        }
        playRequirement{
        }
      };
      case VERMILLION_CITY_97:
      return stadium (this) {
        text "The Retreat Cost of each Basic Pokémon in play is [C] less."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case KURT_98:
      return supporter (this) {
        text "Search your deck for 2 Evolution cards with 90HP or more, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_STADIUM_99:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play." +
          "Once during each player's turn (before attacking), that player may flip a coin. If heads, that player puts a basic Energy card from his or her discard pile into his or her hand."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case DEFENDER_100:
      return basicTrainer (this) {
        text "Attach Defender to 1 of your Pokémon (exluding [M] Pokémon). At the end of your opponent's next turn, discard Defender. Damage done to that Pokémon by attacks is reduced by 20 (after applying Weakness and Resistance)."
        onPlay {
        }
        playRequirement{
        }
      };
      case PLUSPOWER_101:
      return basicTrainer (this) {
        text "Attach PlusPower to your Active Pokémon (excluding [D] Pokémon). At the end of your turn, discard PlusPower. If this Pokémon's attack does damage to the Defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case ULTRA_BALL_102:
      return basicTrainer (this) {
        text "Discard 2 cards from your hand. (if you can't discard 2 cards, you can't play this card.) Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_CATCHER_103:
      return basicTrainer (this) {
        text "Flip a coin. If heads, choose 1 of your opponent's Benched Pokémon and switch it with his or her Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROCKET_S_ENERGY_BOMB_104:
      return basicTrainer (this) {
        text "If it's your first turn, you can't play this card. Search your deck for an Energy card with Rocket's in its name and attach it to 1 of your Benched Pokémon with Dark or Rocket's in its name. Shuffle your deck afterward. Then, put 1 damage counter on that Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case DARK_AMPHAROS_105:
      return evolution (this, from:"Dark Flaaffy", hp:HP070, type:L, retreatCost:2) {
        weakness F
        pokePower "Dark Impulse", {
          text "Once during your turn (before your attack), you may discard a Supporter card from your hand and use the effect of that card as the effect of this Power. You can't use more than 1 Dark Impulse Poké-Power each turn. This power can't be used if Dark Ampharos is affected by a Special Condition."
          actionA {
          }
        }
        move "Ram", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SHINING_CELEBI_106:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Healing Water", {
          text "Remove a number of damage counters from 1 of your Benched Pokémon equal to the number of [W] Energy cards attached to Shining Celebi. If the Pokémon has fewer damage counters than that, remove all of them."
          energyCost W
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Miracle Leaf", {
          text "10 damage. Flip a number of coins equal to the number of Energy attached to the Defending Pokémon. If you get 1 or more heads, the Defending Pokémon is now Asleep, Confused, or Poisoned (your choice)."
          energyCost G, P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHINING_CHARIZARD_107:
      return basic (this, hp:HP100, type:R, retreatCost:3) {
        weakness W
        resistance F, MINUS30
        move "White-hot Flame", {
          text "100 damage. Discard 1 [R] Energy card and 1 [L] Energy card attached to Shining Charizard or this attack does nothing. Flip a coin. If tails, Shining Charizard does 30 damage to itself."
          energyCost R, R, R, L, L
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SHINING_KABUTOPS_108:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        resistance R, MINUS30
        move "Lightning Cut", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage and does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If tails, this attack does 30 damage and Shining Kabutops does 10 damage to itself."
          energyCost F, F, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Water Slash", {
          text "50+ damage. Does 50 damage plus 10 more damage for each [W] Energy attached to Shining Kabutops but not used to pay for this attack's Energy cost. Don't apply Resistance."
          energyCost F, F, W, W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SHINING_MEWTWO_109:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Reflect Shield", {
          text "If an attack does damage to Shining Mewtwo during your opponent's next turn (even if Shining Mewtwo is Knocked Out), flip a coin. If heads, prevent all damage done to Shining Mewtwo from that attack (any other effects of attacks still happen) and do 20 damage to the attacking Pokémon."
          energyCost P, L
          attackRequirement {}
          onAttack {
            
          }
        }
        move "Psyburst", {
          text "40+ damage. Discard a [R] Energy card attached to Shining Mewtwo or this attack does nothing. This attack does 40 damage plus 10 damage for each Energy attached to the Defending Pokémon."
          energyCost P, P, R
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHINING_NOCTOWL_110:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Flashing Eyes", {
          text "30 damage. Flip 3 coins. If exactly 1 is heads, the Defending Pokémon is now Asleep. If exactly 2 are heads, the Defending Pokémon is now Confused. If all 3 are heads, the Defending Pokémon is now Paralyzed."
          energyCost P, L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SHINING_RAICHU_111:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Thundersquall", {
          text "40 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to that Pokémon for each [W] Energy attached to Shining Raichu. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, W, W
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHINING_STEELIX_112:
      return basic (this, hp:HP090, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Crushing Earth", {
          text "80 damage. Flip a coin. If heads, this attack does 10 damage to each Benched Pokémon (yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.) If tails, this attack does nothing. Either way, Shining Steelix can't attack during your next turn."
          energyCost M, M, F, F
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case SHINING_TYRANITAR_113:
      return basic (this, hp:HP080, type:D, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Mountain Crush", {
          text "30 damage. Flip a coin until you get tails. For each heads, your opponent discards the top card from his or her deck."
          energyCost D, F, F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Destructive Fire", {
          text "50 damage. Flip a coin for each [R] Energy card attached to Shining Tyranitar. For each heads, discard a [R] Energy card attached to Shining Tyranitar or this attack does nothing. Then, for each heads, choose an Energy card attached to the Defending Pokémon and discard it. If it has fewer Energy cards than that, discard all of them."
          energyCost D, R, R, R
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ROCKET_S_ENTEI_EX_114:
      return basic (this, hp:HP090, type:D, retreatCost:1) {
        weakness W
        pokeBody "Dark Condition", {
          text "As long as Rocket's Entei ex has any [D] Energy attached to it, Entei ex has no Weakness."
          delayedA {
          }
        }
        move "Energy Link", {
          text "10 damage. Search your discard pile for an Energy card and attach it to Rocket's Entei ex."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Volcanic Ash", {
          text "Discard 2 Energy attached to Rocket's Entei ex and then choose 1 of your opponent's Pokémon. This attack does 60 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            
          }
        }
      };
      case ROCKET_S_SUICUNE_EX_115:
      return basic (this, hp:HP090, type:D, retreatCost:1) {
        weakness L
        pokeBody "Dark and Clear", {
          text "As long as Rocket's Suicune ex has any [D] Energy attached to it, Rocket's Suicune ex can't be affected by any Special Conditions."
          delayedA {
          }
        }
        move "Icy Wind", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hyper Slash", {
          text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 50 damage plus 10 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ROCKET_S_RAIKOU_EX_116:
      return basic (this, hp:HP090, type:D, retreatCost:2) {
        weakness F
        pokePower "Lightning Burst", {
          text "Whenever you attach [D] Energy card frm your hand to Rocket's Raikou ex, you may choose 1 of the Defending Pokémon and switch it with 1 of your opponent's Benched Pokémon. Your opponent chooses the Benched Pokémon to switch. This power can't be used if Rocket's Raikou ex is affected by a Special Condition."
          actionA {
          }
        }
        move "Thunderous Blow", {
          text "30+ damage. Does 30 damage plus 10 more damage for each [L] Energy attached to Rocket's Raikou ex."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ROCKET_S_SNEASEL_EX_117:
      return basic (this, hp:HP080, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Drag Off", {
          text "10 damage. Before doing damage, you may switch 1 of your opponent's Benched Pokémon with the Defending Pokémon. If you do, this attack does 10 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Dark Ring", {
          text "10+ damage. Does 10 damage plus 10 more damage for each of your [D] Pokémon in play."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ROCKET_S_SCIZOR_EX_118:
      return evolution (this, from:"Rocket's Scyther ex", hp:HP100, type:D, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokeBody "Dual Armor", {
          text "As long as Rocket's Scizor ex has any [M] Energy attached to it, Rocket's Scizor ex is both [D] and [M] type."
          delayedA {
          }
        }
        move "Rotating Claws", {
          text "40 damage. You may discard an Energy card attached to Rocket's Scizor ex. If you do, search your discard pile for an Energy card (excluding the one you discarded) and attach it to Rocket's Scizor ex."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
        default:
      return null;
    }
  }
}
