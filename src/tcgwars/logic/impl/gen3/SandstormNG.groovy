package tcgwars.logic.impl.gen3

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
public enum SandstormNG implements LogicCardInfo {

  ARMALDO_1 ("Armaldo", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  CACTURNE_2 ("Cacturne", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CRADILY_3 ("Cradily", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DUSCLOPS_4 ("Dusclops", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  FLAREON_5 ("Flareon", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  JOLTEON_6 ("Jolteon", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LUDICOLO_7 ("Ludicolo", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LUNATONE_8 ("Lunatone", "8", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MAWILE_9 ("Mawile", "9", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  SABLEYE_10 ("Sableye", "10", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SEVIPER_11 ("Seviper", "11", Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHIFTRY_12 ("Shiftry", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  SOLROCK_13 ("Solrock", "13", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  ZANGOOSE_14 ("Zangoose", "14", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  ARCANINE_15 ("Arcanine", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ESPEON_16 ("Espeon", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOLDUCK_17 ("Golduck", "17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KECLEON_18 ("Kecleon", "18", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  OMASTAR_19 ("Omastar", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PICHU_20 ("Pichu", "20", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  SANDSLASH_21 ("Sandslash", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SHIFTRY_22 ("Shiftry", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  STEELIX_23 ("Steelix", "23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  UMBREON_24 ("Umbreon", "24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VAPOREON_25 ("Vaporeon", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WOBBUFFET_26 ("Wobbuffet", "26", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  ANORITH_27 ("Anorith", "27", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ANORITH_28 ("Anorith", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ARBOK_29 ("Arbok", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  AZUMARILL_30 ("Azumarill", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  AZURILL_31 ("Azurill", "31", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  BALTOY_32 ("Baltoy", "32", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  BRELOOM_33 ("Breloom", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DELCATTY_34 ("Delcatty", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ELECTABUZZ_35 ("Electabuzz", "35", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELEKID_36 ("Elekid", "36", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FEAROW_37 ("Fearow", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ILLUMISE_38 ("Illumise", "38", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  KABUTO_39 ("Kabuto", "39", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  KIRLIA_40 ("Kirlia", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  LAIRON_41 ("Lairon", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  LILEEP_42 ("Lileep", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LILEEP_43 ("Lileep", "43", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LINOONE_44 ("Linoone", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LOMBRE_45 ("Lombre", "45", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LOMBRE_46 ("Lombre", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MURKROW_47 ("Murkrow", "47", Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  NUZLEAF_48 ("Nuzleaf", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NUZLEAF_49 ("Nuzleaf", "49", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PELIPPER_50 ("Pelipper", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  QUILAVA_51 ("Quilava", "51", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VIGOROTH_52 ("Vigoroth", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VOLBEAT_53 ("Volbeat", "53", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  WYNAUT_54 ("Wynaut", "54", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  XATU_55 ("Xatu", "55", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ARON_56 ("Aron", "56", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  CACNEA_57 ("Cacnea", "57", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CACNEA_58 ("Cacnea", "58", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CYNDAQUIL_59 ("Cyndaquil", "59", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DUNSPARCE_60 ("Dunsparce", "60", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DUSKULL_61 ("Duskull", "61", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DUSKULL_62 ("Duskull", "62", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EEVEE_63 ("Eevee", "63", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EKANS_64 ("Ekans", "64", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GROWLITHE_65 ("Growlithe", "65", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  LOTAD_66 ("Lotad", "66", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LOTAD_67 ("Lotad", "67", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MARILL_68 ("Marill", "68", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  NATU_69 ("Natu", "69", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  OMANYTE_70 ("Omanyte", "70", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ONIX_71 ("Onix", "71", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PIKACHU_72 ("Pikachu", "72", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PSYDUCK_73 ("Psyduck", "73", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  RALTS_74 ("Ralts", "74", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SANDSHREW_75 ("Sandshrew", "75", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SEEDOT_76 ("Seedot", "76", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SEEDOT_77 ("Seedot", "77", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SHROOMISH_78 ("Shroomish", "78", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SKITTY_79 ("Skitty", "79", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SLAKOTH_80 ("Slakoth", "80", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SPEAROW_81 ("Spearow", "81", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TRAPINCH_82 ("Trapinch", "82", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  WAILMER_83 ("Wailmer", "83", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WINGULL_84 ("Wingull", "84", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  ZIGZAGOON_85 ("Zigzagoon", "85", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DOUBLE_FULL_HEAL_86 ("Double Full Heal", "86", Rarity.UNCOMMON, [TRAINER, ITEM]),
  LANETTE_S_NET_SEARCH_87 ("Lanette's Net Search", "87", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_CANDY_88 ("Rare Candy", "88", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WALLY_S_TRAINING_89 ("Wally's Training", "89", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CLAW_FOSSIL_90 ("Claw Fossil", "90", Rarity.COMMON, [TRAINER, ITEM]),
  MYSTERIOUS_FOSSIL_91 ("Mysterious Fossil", "91", Rarity.COMMON, [TRAINER, ITEM]),
  ROOT_FOSSIL_92 ("Root Fossil", "92", Rarity.COMMON, [TRAINER, ITEM]),
  MULTI_ENERGY_93 ("Multi Energy", "93", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  AERODACTYL_EX_94 ("Aerodactyl ex", "94", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _COLORLESS_]),
  AGGRON_EX_95 ("Aggron ex", "95", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
  GARDEVOIR_EX_96 ("Gardevoir ex", "96", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _PSYCHIC_]),
  KABUTOPS_EX_97 ("Kabutops ex", "97", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  RAICHU_EX_98 ("Raichu ex", "98", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _LIGHTNING_]),
  TYPHLOSION_EX_99 ("Typhlosion ex", "99", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _FIRE_]),
  WAILORD_EX_100 ("Wailord ex", "100", Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SandstormNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SANDSTORM;
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
      case ARMALDO_1:
      return evolution (this, from:"Anorith", hp:HP120, type:F, retreatCost:3) {
        weakness G
        pokeBody "Primal Veil", {
          text "As long as Armaldo is your Active Pokémon, each player can't play any Supporter cards."
          delayedA {
          }
        }
        move "Blade Arms", {
          text "60 damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CACTURNE_2:
      return evolution (this, from:"Cacnea", hp:HP080, type:G, retreatCost:1) {
        weakness R
        pokeBody "Poison Payback", {
          text "If Cacturne is your Active Pokémon and is damaged by an opponent's attack (even if Cacturne is Knocked Out), the Attacking Pokémon is now Poisoned."
          delayedA {
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poke-Powers, Poke-Bodies or any other effects on that Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CRADILY_3:
      return evolution (this, from:"Lileep", hp:HP100, type:G, retreatCost:2) {
        weakness R
        pokeBody "Super Suction Cups", {
          text "As long as Cradily is your Active Pokémon, your opponent's Pokémon can't retreat."
          delayedA {
          }
        }
        move "Lure Poison", {
          text "Before using this effect, you may switch the Defending Pokémon with 1 of your opponent's Benched Pokémon, if any. The Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Spiral Drain", {
          text "50 damage. Remove 2 damage counters from Cradily (remove 1 if there is only 1)."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DUSCLOPS_4:
      return evolution (this, from:"Duskull", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Judgement", {
          text "Flip 2 coins. If both of them are heads, the Defending Pokémon is Knocked Out."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Random Curse", {
          text "Put a total of 5 damage counters on all Defending Pokémon in any way you like."
          energyCost P, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FLAREON_5:
      return evolution (this, from:"Eevee", hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Super Singe", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flamethrower", {
          text "70 damage. Discard a [R] Energy card attached to Flareon."
          energyCost R, C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case JOLTEON_6:
      return evolution (this, from:"Eevee", hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Double Kick", {
          text "20X damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lightning Strike", {
          text "40 damage. You may discard all [L] Energy cards attached to Jolteon. If you do, this attack's base damage is 70 instead of 40."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LUDICOLO_7:
      return evolution (this, from:"Lombre", hp:HP090, type:W, retreatCost:2) {
        weakness L
        pokeBody "Rain Dish", {
          text "At any time between turns, remove 1 damage counter from Ludicolo."
          delayedA {
          }
        }
        move "Hydro Punch", {
          text "50+ damage. Does 50 damage plus 10 more damage for each [W] Energy attached to Ludicolo but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LUNATONE_8:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Lunar Eclipse", {
          text "Once during your turn (before your attack), if Solrock is in play, you may use this power. Until the end of your turn, Lunatone's type is Darkness. This power can't be used if Lunatone is affected by a Special Condition."
          actionA {
          }
        }
        move "Cosmic Draw", {
          text "If your opponent has any Evolved Pokémon in play, draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lunar Blast", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MAWILE_9:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        move "Scam", {
          text "Look at your opponent's hand. You may have your opponent shuffle a Supporter card you find there into his or her deck. If you do, your opponent draws a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metal Hook", {
          text "20 damage. Before doing damage, you may switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SABLEYE_10:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Supernatural", {
          text "Look at your opponent's hand. You may use the effect of a Supporter card you find there as the effect of this attack. (The Supporter card remains in your opponent's hand.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dark Bind", {
          text "20 damage. You may discard a [D] Energy card attached to Sableye. If you do, the Defending Pokémon is now Paralyzed."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SEVIPER_11:
      return basic (this, hp:HP080, type:G, retreatCost:2) {
        weakness P
        move "Deadly Poison", {
          text "10 damage. You may discard a [G] Energy card attached to Seviper. If you do, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Extra Poison", {
          text "20 damage. If the Defending Pokémon is Pokémon-ex, the Defending Pokémon is now Asleep and Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHIFTRY_12:
      return evolution (this, from:"Nuzleaf", hp:HP120, type:G, retreatCost:2) {
        weakness R
        pokePower "Fan Away", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, return 1 Energy card attached to the Defending Pokémon to your opponent's hand. This power can't be used if Shiftry is affected by a Special Condition."
          actionA {
          }
        }
        move "Light Touch Throw", {
          text "80- damage. Does 80 damage minus 10 damage for each Energy attached to the Defending Pokémon."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case SOLROCK_13:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        pokePower "Solar Eclipse", {
          text "Once during your turn (before your attack), if Lunatone is in play, you may use this power. Until the end of your turn, Solrock's type is Fire. This power can't be used if Solrock is affected by a Special Condition."
          actionA {
          }
        }
        move "Cosmic Draw", {
          text "If your opponent has any Evolved Pokémon in play, draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Solar Blast", {
          text "40 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ZANGOOSE_14:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokeBody "Poison Resistance", {
          text "Zangoose can't be Poisoned."
          delayedA {
          }
        }
        move "Target Slash", {
          text "10+ damage. If the Defending Pokémon is Seviper, this attack does 10 damage plus 30 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Super Slash", {
          text "30+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 30 damage plus 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARCANINE_15:
      return evolution (this, from:"Growlithe", hp:HP080, type:R, retreatCost:1) {
        weakness W
        pokeBody "Fire Veil", {
          text "If Arcanine is your Active Pokémon and is damaged by an opponent's attack (even if Arcanine is Knocked Out), the Attacking Pokémon is now Burned."
          delayedA {
          }
        }
        move "Burn Up", {
          text "60 damage. Flip a coin. If tails, discard all [R] Energy cards attached to Arcanine."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ESPEON_16:
      return evolution (this, from:"Eevee", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Energy Crush", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to all of your opponent's Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLDUCK_17:
      return evolution (this, from:"Psyduck", hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokePower "Chaos Flash", {
          text "Once during your turn (before your attack), if Golduck is your Active Pokémon, you may flip a coin. If heads, the Defending Pokémon (choose 1 if there are 2) is now Confused. This power can't be used if Golduck is affected by a Special Condition."
          actionA {
          }
        }
        move "Special Blow", {
          text "30+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 30 damage plus 40 more damage."
          energyCost W, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case KECLEON_18:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokeBody "Energy Variation", {
          text "Kecleon's type is the same as every type of basic Energy card attached to Kecleon."
          delayedA {
          }
        }
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case OMASTAR_19:
      return evolution (this, from:"Omanyte", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Pull Down", {
          text "If your opponent has any Evolved Pokémon in play, remove the highest Stage Evolution card from each of them and put those cards back into his or her hand."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Hydrocannon", {
          text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Omastar but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PICHU_20:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
          actionA {
          }
        }
        move "Energy Retrieval", {
          text "Search your discard pile for up to 2 basic Energy cards and attach them to 1 of your Pokémon. Put 1 damage counter on that Pokémon for each Energy card attached in this way."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SANDSLASH_21:
      return evolution (this, from:"Sandshrew", hp:HP070, type:F, retreatCost:0) {
        weakness G
        move "Sand Swirl", {
          text "Does 20 damage to each Defending Pokémon. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Earthquake", {
          text "60 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SHIFTRY_22:
      return evolution (this, from:"Nuzleaf", hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poke-Powers, Poke-Bodies, or any other effects on that Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Slash", {
          text "60 damage."
          energyCost G, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case STEELIX_23:
      return evolution (this, from:"Onix", hp:HP100, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Steelix."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Spinning Tail", {
          text "Does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case UMBREON_24:
      return evolution (this, from:"Eevee", hp:HP080, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Moon Impact", {
          text "40 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VAPOREON_25:
      return evolution (this, from:"Eevee", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Aurora Beam", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Aqua Sonic", {
          text "50 damage. This attack's damage is not affected by Resistance."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case WOBBUFFET_26:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Wobbuffet by your opponent's Pokémon-ex."
          delayedA {
          }
        }
        move "Flip Over", {
          text "50 damage. Wobbuffet does 10 damage to itself, and don't apply Weakness and Resistance to this damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case ANORITH_27:
      return evolution (this, from:"Claw Fossil", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Fast Evolution", {
          text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pierce", {
          text "30 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ANORITH_28:
      return evolution (this, from:"Claw Fossil", hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Slash", {
          text "20 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Scratch", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ARBOK_29:
      return evolution (this, from:"Ekans", hp:HP070, type:G, retreatCost:1) {
        weakness P
        pokeBody "Intimidating Fang", {
          text "As long as Arbok is your Active Pokémon, any damage to your Pokémon done by an opponent's attack is reduced by 10 (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Toxic", {
          text "20 damage. The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case AZUMARILL_30:
      return evolution (this, from:"Marill", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Drizzle", {
          text "If you have [W] Energy cards in your hand, attach as many [W] Energy cards as you like to any of your Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Max Bubbles", {
          text "30x damage. Flip a coin for each Energy attached to all of your Active Pokémon. This attack does 30 damage times the number of heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case AZURILL_31:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Marill from your hand onto Azurill (this counts as evolving Azurill), and remove all damage counters from Azurill."
          actionA {
          }
        }
        move "Jump Catch", {
          text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BALTOY_32:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Rapid Spin", {
          text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch Baltoy with 1 of your Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BRELOOM_33:
      return evolution (this, from:"Shroomish", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Super Poison Breath", {
          text "Each Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sky Uppercut", {
          text "50 damage. This attack's damage is not affected by Resistance."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DELCATTY_34:
      return evolution (this, from:"Skitty", hp:HP080, type:C, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Ultra Energy Source", {
          text "10x damage. Does 10 damage times the amount of basic Energy attached to all of the Active Pokémon (both yours and your opponent's)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELECTABUZZ_35:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Plasma", {
          text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Electabuzz."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunder Spear", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ELEKID_36:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Electabuzz from your hand onto Elekid (this counts as evolving Elekid) and remove all damage counters from Elekid."
          actionA {
          }
        }
        move "Gather Energy", {
          text "Search your deck for a basic Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FEAROW_37:
      return evolution (this, from:"Spearow", hp:HP070, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Double Wing Attack", {
          text "Does 20 damage to each Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rend", {
          text "30+ damage. If the Defending Pokémon has any damage counters on it, this attack does 30 damage plus 20 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ILLUMISE_38:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Glowing Screen", {
          text "As long as Volbeat is in play, any damage done to Illumise by attacks from [R] Pokémon and Dark Pokémon is reduced by 30. You can't reduce more than 30 damage even if there is more than 1 Volbeat in play."
          delayedA {
          }
        }
        move "Chaotic Noise", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pester", {
          text "20+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 20 damage plus 20 more damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KABUTO_39:
      return evolution (this, from:"Mysterious Fossil", hp:HP060, type:W, retreatCost:2) {
        weakness G
        pokeBody "Exoskeleton", {
          text "Any damage done to Kabuto by attacks is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Team Assembly", {
          text "Search your deck for Omanyte, Kabuto, or any Basic Pokémon and put as many of them as you like onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pierce", {
          text "20 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KIRLIA_40:
      return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Link Blast", {
          text "60 damage. If Kirlia and the Defending Pokémon have a different amount of Energy attached to them, this attack's base damage is 30 instead of 60."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case LAIRON_41:
      return evolution (this, from:"Aron", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Iron Defense", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Lairon during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Headbutt", {
          text "50 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LILEEP_42:
      return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Influence", {
          text "Search your deck for Omanyte, Kabuto, Aerodactyl, Lileep, or Anorith and put up to 2 of them onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Time Spiral", {
          text "If your opponent has any Evolved Pokémon in play, choose 1 of them and flip a coin. If heads, take the highest Stage Evolution card on that Pokémon and have your opponent shuffle it into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case LILEEP_43:
      return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Headbutt", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LINOONE_44:
      return evolution (this, from:"Zigzagoon", hp:HP070, type:C, retreatCost:0) {
        weakness F
        move "Sniff Out", {
          text "Put any 1 card from your discard pile into your hand."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fury Swipes", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LOMBRE_45:
      return evolution (this, from:"Lotad", hp:HP060, type:W, retreatCost:1) {
        weakness L
        pokeBody "Rain Dish", {
          text "At any time between turns, remove 1 damage counter from Lombre."
          delayedA {
          }
        }
        move "Double Scratch", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LOMBRE_46:
      return evolution (this, from:"Lotad", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Surprise", {
          text "10 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fury Swipes", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MURKROW_47:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Surprise", {
          text "Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dark Mind", {
          text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NUZLEAF_48:
      return evolution (this, from:"Seedot", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Steady Punch", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Razor Leaf", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case NUZLEAF_49:
      return evolution (this, from:"Seedot", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Stun Spore", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Razor Wind", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case PELIPPER_50:
      return evolution (this, from:"Wingull", hp:HP070, type:W, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Water Gun", {
          text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Pelipper but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case QUILAVA_51:
      return evolution (this, from:"Cyndaquil", hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Slash", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Burning Claw", {
          text "40 damage. You may discard a [R] Energy card attached to Quilava. If you do, the Defending Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VIGOROTH_52:
      return evolution (this, from:"Slakoth", hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Focus Energy", {
          text "During your next turn, base damage of Vigoroth's slash attack is 90 instead of 40."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Slash", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VOLBEAT_53:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Uplifting Glow", {
          text "As long as Illumise is in play, Volbeat's Retreat Cost is 0."
          delayedA {
          }
        }
        move "Toxic Vibration", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pester", {
          text "20+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 20 damage plus 20 more damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WYNAUT_54:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Wobbuffet from your hand onto Wynaut (this counts as evolving Wynaut), and remove all damage counters from Wynaut."
          actionA {
          }
        }
        move "Alluring Smile", {
          text "Search your deck for a Basic Pokémon card or Evolution card for each Energy attached to Wynaut, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case XATU_55:
      return evolution (this, from:"Natu", hp:HP070, type:P, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        pokePower "Healing Wind", {
          text "Once during your turn (before your attack), you may remove 1 damage counter from each of your Active Pokémon. This power can't be used if Xatu is affected by a Special Condition."
          actionA {
          }
        }
        move "Psyimpact", {
          text "Put 1 damage counter on each of your opponent's Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ARON_56:
      return basic (this, hp:HP050, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Steel Headbutt", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CACNEA_57:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        pokeBody "Poison Payback", {
          text "If Cacnea is your Active Pokémon and is damaged by an opponent's attack (even if Cacnea is Knocked Out), the Attacking Pokémon is now Poisoned."
          delayedA {
          }
        }
        move "Light Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CACNEA_58:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Poison Sting", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CYNDAQUIL_59:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DUNSPARCE_60:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Strike and Run", {
          text "Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward. You may switch Dunsparce with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sudden Flash", {
          text "10 damage. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DUSKULL_61:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Suprise", {
          text "Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Confuse Ray", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DUSKULL_62:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance R, MINUS30
        move "Haunt", {
          text "Put 1 damage counter on the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Dark Mind", {
          text "10 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EEVEE_63:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Signs of Evolution", {
          text "Search your deck for up to 3 cards that evolve from Eevee, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EKANS_64:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Bind", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GROWLITHE_65:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        pokeBody "Fire Veil", {
          text "If Growlithe is your Active Pokémon and is damaged by an opponent's attack (even if Growlithe is Knocked Out), the Attacking Pokémon is now Burned."
          delayedA {
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
      case LOTAD_66:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        pokeBody "Rain Dish", {
          text "At any time between turns, remove 1 damage counter from Lotad."
          delayedA {
          }
        }
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LOTAD_67:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Blot", {
          text "20 damage. Remove 1 damage counter from Lotad."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MARILL_68:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Double Bubble", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads. If either of the coins is heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NATU_69:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Peck", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Soothing Wave", {
          text "Each Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case OMANYTE_70:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Team Assembly", {
          text "Search your deck for Omanyte, Kabuto, or any Basic Pokémon and put as many of them as you like onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bind", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ONIX_71:
      return basic (this, hp:HP080, type:F, retreatCost:3) {
        weakness W
        move "Bind", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Onix."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIKACHU_72:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pika Bolt", {
          text "40 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PSYDUCK_73:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Confusion Wave", {
          text "Both Psyduck and the Defending Pokémon are now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case RALTS_74:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
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
      case SANDSHREW_75:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Poison Needle", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEEDOT_76:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Suprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SEEDOT_77:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHROOMISH_78:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Growth Spurt", {
          text "Attach a [G] Energy card from your hand to Shroomish."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case SKITTY_79:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Energy Catch", {
          text "Search your discard pile for a basic Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Double-edge", {
          text "30 damage. Skitty does 10 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SLAKOTH_80:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Lazy Punch", {
          text "10 damage. Slakoth can't attack during your next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SPEAROW_81:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Super Speed", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Spearow during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Peck", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TRAPINCH_82:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        move "Sand Pit", {
          text "10 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Irongrip", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WAILMER_83:
      return basic (this, hp:HP080, type:W, retreatCost:3) {
        weakness L
        move "Rollout", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Hypno Wave", {
          text "30 damage. The Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WINGULL_84:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ZIGZAGOON_85:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Collect", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DOUBLE_FULL_HEAL_86:
      return itemCard (this) {
        text "Remove all Special Conditions from each of your Active Pokémon."
        onPlay {
          clearSpecialCondition(my.active, TRAINER_CARD)
        }
        playRequirement{
          assert my.active.specialConditions : "Your Active Pokémon needs to have some Special Condition applied to it"
        }
      };
      case LANETTE_S_NET_SEARCH_87:
      return supporter (this) {
        text "Search your deck for up to 3 different types of Basic Pokémon cards (excluding Baby Pokémon), show them to your opponent, and put them into your hand. Shuffle your deck afterward." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
          my.deck.select(min:0, max:3, "Select up to 3 Basic Pokémon (excluding Baby Pokémon) of different types.", cardTypeFilter(BASIC), thisCard.player, { CardList list ->
            if (list.filterByType(BABY).size())
              return false
            TypeSet typeSet = new TypeSet()
            for (card in list) {
              if (typeSet.containsAny(card.asPokemonCard().types)) {
                return false
              }
              typeSet.addAll(card.asPokemonCard().types)
            }
            return true
          }).showToOpponent("Cards moved to hand").moveTo(hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
        }
      };
      case RARE_CANDY_88:
      return itemCard (this) {
        text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolves from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.)"
        PokemonCardSet pcs = null
        CardList sel = null
        onPlay {
//          def eff = delayed {
//            before PREVENT_EVOLVE, pcs, null, EVOLVE, {prevent()}
//          }
//          try {
//            bg().em().activateInnerEffect(new Evolve(pcs, sel.first()))
//          } finally {
//            eff.unregister()
//          }
          bg().em().activateInnerEffect(new Evolve(pcs, sel.first()).setDirect(true))
        }
        playRequirement{
          def targets = my.all.findAll { it.basic }
          def evolutions = my.hand.filterByType(STAGE1, STAGE2)
          assert targets : "You have no basic Pokémon."
          assert evolutions : "You have no Stage 1 or Stage 2 card in hand"
          pcs = targets.select("Choose the pokemon to be evolved")
          def possibleEvolutions = evolutions.findAll{ EvolutionPokemonCard evoCard ->
            ( evoCard.predecessors.contains(pcs.name) ) ||
            ( bg.gm().getBasicsFromStage2(evoCard.name).contains(pcs.name) )
          }
          assert possibleEvolutions : "There is no Stage 1/2 in hand for $pcs to evolve into"
          sel = possibleEvolutions.select(min: 0)
          assert sel : "Cancelled"
        }
      };
      case WALLY_S_TRAINING_89:
        return copy(Emerald.WALLY_S_TRAINING_85, this);
      case CLAW_FOSSIL_90:
        return copy(LegendMaker.CLAW_FOSSIL_78, this);
      case MYSTERIOUS_FOSSIL_91:
        return copy(LegendMaker.MYSTERIOUS_FOSSIL_79, this);
      case ROOT_FOSSIL_92:
        return copy(LegendMaker.ROOT_FOSSIL_80, this);
      case MULTI_ENERGY_93:
        return copy (FireRedLeafGreen.MULTI_ENERGY_103, this);
      case AERODACTYL_EX_94:
      return evolution (this, from:"Mysterious Fossil", hp:HP100, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        pokeBody "Primal Lock", {
          text "As long as Aerodactyl ex is in play, your opponent can't play Pokémon Tool cards. Remove any Pokémon Tool cards attached to your opponent's Pokémon and put them into his or her discard pile."
          delayedA {
          }
        }
        move "Supersonic", {
          text "10 damage. The Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Wing Attack", {
          text "60 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case AGGRON_EX_95:
      return evolution (this, from:"Lairon", hp:HP150, type:M, retreatCost:4) {
        weakness F
        weakness R
        resistance G, MINUS30
        move "Rend", {
          text "30+ damage. If the Defending Pokémon has any damage counters on it, this attack does 30 damage plus 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Metal Surge", {
          text "50 damage. Does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, M, C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GARDEVOIR_EX_96:
      return evolution (this, from:"Kirlia", hp:HP150, type:P, retreatCost:2) {
        weakness G
        weakness P
        move "Feedback", {
          text "Count the number of cards in your opponent's hand. Put that many damage counters on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psystorm", {
          text "10x damage. Does 10 damage times the total amount of Energy attached to all Pokémon in play."
          energyCost P, C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KABUTOPS_EX_97:
      return evolution (this, from:"Kabuto", hp:HP150, type:W, retreatCost:2) {
        weakness G
        weakness L
        move "Hyrdocutter", {
          text "40x damage. Flip a number of coins equal to the amount of Energy attached to Kabutops ex. This attack does 40 damage times the number of heads. You can't flip more than 3 coins in this way."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Spiral Drain", {
          text "70 damage. Remove 2 damage counters from Kabutops ex (remove 1 if there is only 1)."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case RAICHU_EX_98:
      return evolution (this, from:"Pikachu", hp:HP100, type:L, retreatCost:1) {
        weakness F
        move "Dazzle Blast", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Thunderbolt", {
          text "120 damage. Discard all Energy cards attached to Raichu ex."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case TYPHLOSION_EX_99:
      return evolution (this, from:"Quilava", hp:HP160, type:R, retreatCost:2) {
        weakness F
        weakness W
        move "Ring of Fire", {
          text "40 damage. The Defending Pokémon is now Burned, and can't retreat until the end of your opponent's next turn."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Split Blast", {
          text "100 damage. Discard 1 Energy card attached to Typhlosion ex. If your opponent has more than 1 Defending Pokémon, you may do 50 damage to each of them instead."
          energyCost R, R, R, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case WAILORD_EX_100:
      return evolution (this, from:"Wailmer", hp:HP200, type:W, retreatCost:5) {
        weakness G
        weakness L
        move "Super Deep Dive", {
          text "If you don't have any Benched Pokémon, this attack does nothing. Remove 3 damage counters from Wailord ex. Switch Wailord ex with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dwindling Wave", {
          text "100- damage. Does 100 damage minus 10 damage for each damage counter on Wailord ex."
          energyCost W, W, W, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
        default:
      return null;
    }
  }
}
