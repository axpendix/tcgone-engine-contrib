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
import tcgwars.logic.effect.ability.Ability.*;
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
public enum HolonPhantoms implements LogicCardInfo {

  ARMALDO_DELTA_1 ("Armaldo δ", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_, _METAL_]),
  CRADILY_DELTA_2 ("Cradily δ", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_, _METAL_]),
  DEOXYS_DELTA_3 ("Deoxys δ", 3, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  DEOXYS_DELTA_4 ("Deoxys δ", 4, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  DEOXYS_DELTA_5 ("Deoxys δ", 5, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  DEOXYS_DELTA_6 ("Deoxys δ", 6, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  FLYGON_DELTA_7 ("Flygon δ", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_, _METAL_]),
  GYARADOS_DELTA_8 ("Gyarados δ", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_, _METAL_]),
  KABUTOPS_DELTA_9 ("Kabutops δ", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  KINGDRA_DELTA_10 ("Kingdra δ", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_, _METAL_]),
  LATIAS_DELTA_11 ("Latias δ", 11, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  LATIOS_DELTA_12 ("Latios δ", 12, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  OMASTAR_DELTA_13 ("Omastar δ", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  PIDGEOT_DELTA_14 ("Pidgeot δ", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_, _METAL_]),
  RAICHU_DELTA_15 ("Raichu δ", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  RAYQUAZA_DELTA_16 ("Rayquaza δ", 16, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_, _METAL_]),
  VILEPLUME_DELTA_17 ("Vileplume δ", 17, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_, _METAL_]),
  ABSOL_18 ("Absol", 18, Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  BELLOSSOM_DELTA_19 ("Bellossom δ", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BLAZIKEN_20 ("Blaziken", 20, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  LATIAS_DELTA_21 ("Latias δ", 21, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  LATIOS_DELTA_22 ("Latios δ", 22, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  MAWILE_23 ("Mawile", 23, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  MEWTWO_DELTA_24 ("Mewtwo δ", 24, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  NOSEPASS_25 ("Nosepass", 25, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  RAYQUAZA_DELTA_26 ("Rayquaza δ", 26, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  REGICE_27 ("Regice", 27, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  REGIROCK_28 ("Regirock", 28, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  REGISTEEL_29 ("Registeel", 29, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  RELICANTH_30 ("Relicanth", 30, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  SABLEYE_31 ("Sableye", 31, Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  SEVIPER_32 ("Seviper", 32, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  TORKOAL_33 ("Torkoal", 33, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  ZANGOOSE_34 ("Zangoose", 34, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  AERODACTYL_DELTA_35 ("Aerodactyl δ", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CAMERUPT_36 ("Camerupt", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHIMECHO_DELTA_37 ("Chimecho δ", 37, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  CLAYDOL_38 ("Claydol", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  COMBUSKEN_39 ("Combusken", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DONPHAN_40 ("Donphan", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  EXEGGUTOR_DELTA_41 ("Exeggutor δ", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GLOOM_DELTA_42 ("Gloom δ", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOLDUCK_DELTA_43 ("Golduck δ", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  HOLON_S_CASTFORM_44 ("Holon's Castform", 44, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  LAIRON_45 ("Lairon", 45, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MANECTRIC_46 ("Manectric", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MASQUERAIN_47 ("Masquerain", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PERSIAN_DELTA_48 ("Persian δ", 48, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_, _METAL_]),
  PIDGEOTTO_DELTA_49 ("Pidgeotto δ", 49, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PRIMEAPE_DELTA_50 ("Primeape δ", 50, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  RAICHU_51 ("Raichu", 51, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SEADRA_DELTA_52 ("Seadra δ", 52, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SHARPEDO_DELTA_53 ("Sharpedo δ", 53, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  VIBRAVA_DELTA_54 ("Vibrava δ", 54, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  WHISCASH_55 ("Whiscash", 55, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  WOBBUFFET_56 ("Wobbuffet", 56, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ANORITH_DELTA_57 ("Anorith δ", 57, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  ARON_58 ("Aron", 58, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BALTOY_59 ("Baltoy", 59, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BARBOACH_60 ("Barboach", 60, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CARVANHA_DELTA_61 ("Carvanha δ", 61, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CORPHISH_62 ("Corphish", 62, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CORPHISH_63 ("Corphish", 63, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  ELECTRIKE_64 ("Electrike", 64, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  EXEGGCUTE_DELTA_65 ("Exeggcute δ", 65, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HORSEA_DELTA_66 ("Horsea δ", 66, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  KABUTO_DELTA_67 ("Kabuto δ", 67, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LILEEP_DELTA_68 ("Lileep δ", 68, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  MAGIKARP_DELTA_69 ("Magikarp δ", 69, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  MANKEY_DELTA_70 ("Mankey δ", 70, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MEOWTH_DELTA_71 ("Meowth δ", 71, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_, _METAL_]),
  NUMEL_72 ("Numel", 72, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  ODDISH_DELTA_73 ("Oddish δ", 73, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  OMANYTE_DELTA_74 ("Omanyte δ", 74, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  PHANPY_75 ("Phanpy", 75, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PICHU_DELTA_76 ("Pichu δ", 76, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  PIDGEY_DELTA_77 ("Pidgey δ", 77, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_78 ("Pikachu", 78, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PIKACHU_DELTA_79 ("Pikachu δ", 79, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  POOCHYENA_80 ("Poochyena", 80, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  PSYDUCK_DELTA_81 ("Psyduck δ", 81, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SURSKIT_82 ("Surskit", 82, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TORCHIC_83 ("Torchic", 83, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TRAPINCH_DELTA_84 ("Trapinch δ", 84, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HOLON_ADVENTURER_85 ("Holon Adventurer", 85, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_FOSSIL_86 ("Holon Fossil", 86, Rarity.UNCOMMON, [TRAINER, ITEM]),
  HOLON_LAKE_87 ("Holon Lake", 87, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  MR_STONE_S_PROJECT_88 ("Mr. Stone's Project", 88, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROFESSOR_COZMO_S_DISCOVERY_89 ("Professor Cozmo's Discovery", 89, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_CANDY_90 ("Rare Candy", 90, Rarity.UNCOMMON, [TRAINER, ITEM]),
  CLAW_FOSSIL_91 ("Claw Fossil", 91, Rarity.COMMON, [TRAINER, ITEM]),
  MYSTERIOUS_FOSSIL_92 ("Mysterious Fossil", 92, Rarity.COMMON, [TRAINER, ITEM]),
  ROOT_FOSSIL_93 ("Root Fossil", 93, Rarity.COMMON, [TRAINER, ITEM]),
  DARKNESS_ENERGY_94 ("Darkness Energy", 94, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_95 ("Metal Energy", 95, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  MULTI_ENERGY_96 ("Multi Energy", 96, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  DARK_METAL_ENERGY_97 ("Dark Metal Energy", 97, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  DELTA_RAINBOW_ENERGY_98 ("δ Rainbow Energy", 98, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CRAWDAUNT_EX_99 ("Crawdaunt ex", 99, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _WATER_]),
  MEW_EX_100 ("Mew ex", 100, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _PSYCHIC_]),
  MIGHTYENA_EX_101 ("Mightyena ex", 101, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _DARKNESS_]),
  GYARADOS_STAR_DELTA_102 ("Gyarados Star δ", 102, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  MEWTWO_STAR_103 ("Mewtwo Star", 103, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  PIKACHU_STAR_104 ("Pikachu Star", 104, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  GRASS_ENERGY_105 ("Grass Energy", 105, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  FIRE_ENERGY_106 ("Fire Energy", 106, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  WATER_ENERGY_107 ("Water Energy", 107, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  LIGHTNING_ENERGY_108 ("Lightning Energy", 108, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  PSYCHIC_ENERGY_109 ("Psychic Energy", 109, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  FIGHTING_ENERGY_110 ("Fighting Energy", 110, Rarity.HOLORARE, [ENERGY, BASIC, BASIC_ENERGY]),
  MEW_111 ("Mew", 111, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  HolonPhantoms(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  public int getCollectionLineNo() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.HOLON_PHANTOMS;
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
      case ARMALDO_DELTA_1:
      return evolution (this, from:"Anorith", hp:HP110, type:[F, M], retreatCost:3) {
        weakness G
        move "Delta Edge", {
          text "70 damage. If you have any Supporter cards in play, this attack's base damage is 20 instead of 70."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Fossil Charge", {
          text "50 damage. You may discard a Claw Fossil, Mysterious Fossil, Root Fossil, or Holon Fossil from your hand. If you do, choose 1 of your opponent's Benched Pokémon and do 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CRADILY_DELTA_2:
      return evolution (this, from:"Lileep", hp:HP100, type:[D, M], retreatCost:2) {
        weakness R
        move "Harsh Fluid", {
          text "20 damage. Put 5 damage counters on the Defending Pokémon at the end of your opponent's next turn."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Poison Tentacles", {
          text "50 damage. The Defending Pokémon is now Poisoned."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DEOXYS_DELTA_3:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness P
        pokePower "Form Change", {
          text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
          actionA {
          }
        }
        move "Energy Loop", {
          text "60 damage. Return 2 Energy attached to Deoxys to your hand."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case DEOXYS_DELTA_4:
      return basic (this, hp:HP080, type:M, retreatCost:2) {
        weakness P
        pokePower "Form Change", {
          text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
          actionA {
          }
        }
        move "Delta Reduction", {
          text "30 damage. During your opponent's next turn, any damage done to Deoxys by attacks is reduced by 30 (before applying Weakness and Resistance)."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DEOXYS_DELTA_5:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness P
        pokePower "Form Change", {
          text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
          actionA {
          }
        }
        move "Crystal Laser", {
          text "20 damage. During your next turn, Deoxys's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DEOXYS_DELTA_6:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness P
        pokePower "Form Change", {
          text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
          actionA {
          }
        }
        move "Teleportation Burst", {
          text "20 damage. Switch Deoxys with 1 of your Benched Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLYGON_DELTA_7:
      return evolution (this, from:"Vibrava", hp:HP110, type:[G, M], retreatCost:2) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        pokePower "Delta Supply", {
          text "Once during your turn (before your attack), you may attach a basic Energy card or a δ Rainbow Energy card from your hand to 1 of your Pokémon that has δ on its card. This power can't be used if Flygon is affected by a Special Condition."
          actionA {
          }
        }
        move "Swift", {
          text "60 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost G, M, C
          attackRequirement {}
          onAttack {
            swiftDamage(60, defending)
          }
        }
      };
      case GYARADOS_DELTA_8:
      return evolution (this, from:"Magikarp", hp:HP090, type:[L, M], retreatCost:2) {
        weakness L
        pokeBody "Delta Reactor", {
          text "As long as any Stadium card with Holon in its name is in play, each of your Pokémon that has δ on its card does 10 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Hyper Beam", {
          text "20 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { discardDefendingEnergy() }
          }
        }
        move "Heavy Impact", {
          text "80 damage."
          energyCost L, M, C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case KABUTOPS_DELTA_9:
      return evolution (this, from:"Kabuto", hp:HP100, type:L, retreatCost:1) {
        weakness G
        move "Vital Drain", {
          text "30 damage. If the Defending Pokémon is Knocked Out by this attack, remove all Special Conditions and 7 damage counters from Kabutops (all if there are less than 7)."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Thunderous Blow", {
          text "40+ damage. Does 40 damage plus 10 more damage for each [L] Energy attached to Kabutops."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KINGDRA_DELTA_10:
      return evolution (this, from:"Seadra", hp:HP110, type:[R, M], retreatCost:2) {
        weakness L
        pokePower "Dragon Curse", {
          text "Once during your turn (before your attack), if Kingdra is your Active Pokémon, you may put 2 damage counters on 1 of your opponent's Pokémon with δ on its card. This power can't be used if Kingdra is affected by a Special Condition."
          actionA {
          }
        }
        move "Extra Flame", {
          text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 30 more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            if (defending.EX) {
              damage 30
            }
          }
        }
        move "Heat Blast", {
          text "80 damage."
          energyCost R, M, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case LATIAS_DELTA_11:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness C
        resistance P, MINUS30
        resistance F, MINUS30
        pokeBody "Dual Aura", {
          text "As long as you have Latios or Latios ex in play, each player's Evolved Pokémon (excluding Pokémon-ex) can't use any Poké-Bodies."
          delayedA {
          }
        }
        move "Spearhead", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            draw 1
          }
        }
        move "Dragon Claw", {
          text "40 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LATIOS_DELTA_12:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokeBody "Dual Aura (Duaru oora)", {
          text "As long as you have Latias or Latias ex in play, each player's Evolved Pokémon (excluding Pokémon-ex) can't use any Poké-Bodies."
          delayedA {
          }
        }
        move "Dive", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Blast", {
          text "50 damage. Discard a [W] Energy attached to Latios."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case OMASTAR_DELTA_13:
      return evolution (this, from:"Omanyte", hp:HP110, type:P, retreatCost:2) {
        weakness L
        move "Bind", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { apply PARALYZED }
          }
        }
        move "Vengeful Spikes", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Omanyte, Omastar, Kabuto, Kabutops, and Kabutops ex in your discard pile. You can't add more than 60 damage in this way."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PIDGEOT_DELTA_14:
      return evolution (this, from:"Pidgeotto", hp:HP100, type:[L, M], retreatCost:1) {
        weakness L
        resistance F, MINUS30
        pokeBody "Delta Reserve", {
          text "As long as Pidgeot has any Holon Energy cards attached to it, each player's Pokémon (excluding Pokémon that has δ on its card) can't use any Poké-Powers."
          delayedA {
          }
        }
        move "Rotating Claws", {
          text "50 damage. You may discard an Energy card attached to Pidgeot. If you do, search your discard pile for an Energy card (excluding the one you discarded) and attach it to Pidgeot."
          energyCost L, M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAICHU_DELTA_15:
      return evolution (this, from:"Pikachu", hp:HP070, type:M, retreatCost:0) {
        weakness F
        move "Zzzap", {
          text "Does 20 damage to each Pokémon that has any Poké-Powers or Poké-Bodies (both yours and your opponent's). Don't apply Weakness or Resistance."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Metallic Thunder", {
          text "50 damage. You may discard 2 [M] Energy attached to Raichu. If you do, this attack's base damage is 90 instead of 50."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAYQUAZA_DELTA_16:
      return basic (this, hp:HP080, type:[W, M], retreatCost:2) {
        weakness C
        resistance W, MINUS30
        resistance F, MINUS30
        pokeBody "Hydro Barrier", {
          text "As long as Rayquaza has any Holon Energy cards attached to it, each of your [W] Pokémon has no Weakness."
          delayedA {
          }
        }
        move "Delta Search", {
          text "Search your deck for a Holon Energy card and attach it to Rayquaza. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Ozone Flare", {
          text "60 damage."
          energyCost W, M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case VILEPLUME_DELTA_17:
      return evolution (this, from:"Gloom", hp:HP090, type:[P, M], retreatCost:1) {
        weakness P
        pokePower "Poison Pollen", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. This power can't be used if Vileplume is affected by a Special Condition."
          actionA {
          }
        }
        move "Poltergeist", {
          text "30+ damage. Look at your opponent's hand. This attack does 30 damage plus 10 more damage for each Trainer card in your opponent's hand."
          energyCost P, M
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ABSOL_18:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Foresight", {
          text "Look at the top 5 cards of either player's deck and put them back on top of that player's deck in any order."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Overrun", {
          text "10 damage. Choose 1 of your opponent's Benched Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BELLOSSOM_DELTA_19:
      return evolution (this, from:"Gloom", hp:HP100, type:W, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        pokeBody "Fellowship", {
          text "Bellossom can use the attacks of all Oddish, Gloom, Vileplume, Vileplume ex, or other Bellossom you have in play as its own. (You still need the necessary Energy to use each attack.)"
          delayedA {
          }
        }
        move "Aqua Flower", {
          text "40 damage. During your opponent's next turn, Bellossom has no Weakness."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BLAZIKEN_20:
      return evolution (this, from:"Combusken", hp:HP100, type:R, retreatCost:2) {
        weakness W
        move "Combustion", {
          text "30 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Blaze Kick", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage. If tails, the Defending Pokémon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
            flip 1, {
              damage 20
            }, {
              apply BURNED
            }
          }
        }
      };
      case LATIAS_DELTA_21:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness C
        resistance P, MINUS30
        resistance F, MINUS30
        move "Combustion", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Singe", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LATIOS_DELTA_22:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Aqua Wave", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
        move "Dragonbreath", {
          text "50 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MAWILE_23:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            swiftDamage(10, opp.all.select())
          }
        }
        move "Surprise", {
          text "20 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage { astonish() }
          }
        }
      };
      case MEWTWO_DELTA_24:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness P
        move "Psychic Erase", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Swift", {
          text "40 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            swiftDamage(40, defending)
          }
        }
      };
      case NOSEPASS_25:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness W
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply CONFUSED }
          }
        }
        move "Rock Slide", {
          text "20 damage. Does 10 damage to 2 of your opponent's Benched Pokémon (1 if there is only 1). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RAYQUAZA_DELTA_26:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness C
        move "Outrage", {
          text "10+ damage. Flip a coin. If tails, this attack does nothing. If heads, this attack does 10 damage plus 10 more damage for each damage counter on Rayquaza."
          energyCost R, C
          attackRequirement {}
          onAttack {
            flip {
              damage 10+10*self.numberOfDamageCounters
            }
          }
        }
        move "Flamethrower", {
          text "40 damage. Discard 1 [R] Energy attached to Rayquaza."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
            discardSelfEnergy R
          }
        }
      };
      case REGICE_27:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness M
        pokeBody "Clear Body", {
          text "Regice can't be affected by any Special Conditions."
          delayedA {
          }
        }
        move "Icy Wind", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { apply ASLEEP }
          }
        }
      };
      case REGIROCK_28:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness W
        pokeBody "Clear Body", {
          text "Regirock can't be affected by any Special Conditions."
          delayedA {
          }
        }
        move "Rock Slide", {
          text "40 damage. Does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case REGISTEEL_29:
      return basic (this, hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokeBody "Clear Body", {
          text "Registeel can't be affected by any Special Conditions."
          delayedA {
          }
        }
        move "Hyper Beam", {
          text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { discardDefendingEnergy() }
          }
        }
      };
      case RELICANTH_30:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Aqua Lift", {
          text "If Relicanth has any [W] Energy attached to it, the Retreat Cost for Relicanth is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {h->
            if(self.cards.energyCount(W)) {
              h.object = 0
            }
          }
        }
        move "Knock Away", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAtta1k {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case SABLEYE_31:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        resistance C, MINUS30
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Knock Off", {
          text "10 damage. Choose 1 card from your opponent's hand without looking and discard it."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEVIPER_32:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Poison Fang", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply POISONED }
          }
        }
        move "Bite", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TORKOAL_33:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Grind", {
          text "10x damage. Does 10 damage times the amount of Energy attached to Torkoal."
          energyCost C
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
      case ZANGOOSE_34:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fury Cutter", {
          text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case AERODACTYL_DELTA_35:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:R, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Primal Light", {
          text "Once during your turn (before your attack), you may search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Aerodactyl is affected by a Special Condition."
          actionA {
          }
        }
        move "Granite Head", {
          text "30 damage. During your opponent's next turn, any damage done to Aerodactyl by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(10),thisMove)
          }
        }
      };
      case CAMERUPT_36:
      return evolution (this, from:"Numel", hp:HP090, type:R, retreatCost:2) {
        weakness W
        move "Magnitude", {
          text "20 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Take Down", {
          text "60 damage. Camerupt does 10 damage to itself."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CHIMECHO_DELTA_37:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness P
        pokePower "Delta Support", {
          text "Once during your turn (before your attack), if you have a Supporter card with Holon in its name in play, you may search your discard pile for a basic Energy card or a δ Rainbow Energy card, show it to your opponent, and put it into your hand. This power can't be used if Chimecho is affected by a Special Condition."
          actionA {
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
      case CLAYDOL_38:
      return evolution (this, from:"Baltoy", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Wide Laser", {
          text "Does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Hyper Beam", {
          text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { discardDefendingEnergy() }
          }
        }
      };
      case COMBUSKEN_39:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Slash", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Singe", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DONPHAN_40:
      return evolution (this, from:"Phanpy", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Rock Hurl", {
          text "20 damage. This attack's damage isn't affected by Resistance."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
            dontApplyResistance()
          }
        }
        move "Double Spin", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case EXEGGUTOR_DELTA_41:
      return evolution (this, from:"Exeggcute", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Delta Circle", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Pokémon you have in play that has δ on its card."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Split Bomb", {
          text "Choose 2 of your opponent's Pokémon. This attack does 30 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            multiSelect(opp.all, 2).each {
              targeted(it) {
                damage 30, it
              }
            }
          }
        }
      };
      case GLOOM_DELTA_42:
      return evolution (this, from:"Oddish", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Drool", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Acid", {
          text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat defending
          }
        }
      };
      case GOLDUCK_DELTA_43:
      return evolution (this, from:"Psyduck", hp:HP070, type:L, retreatCost:1) {
        weakness L
        pokeBody "Delta Block", {
          text "As long as any Stadium card with Holon in its name is in play, your opponent can't play any Stadium cards from his or her hand."
          delayedA {
          }
        }
        move "Mind Play", {
          text "30+ damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose. If that card is a Trainer card, this attack does 30 damage plus 30 more damage, and discard that card. If that card is not a Trainer card, return it to your opponent's hand."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HOLON_S_CASTFORM_44:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Delta Draw", {
          text "Count the number of Pokémon you have in play that has δ on its card. Draw up to that many cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case LAIRON_45:
      return evolution (this, from:"Aron", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Iron Head", {
          text "30x damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MANECTRIC_46:
      return evolution (this, from:"Electrike", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Plasma", {
          text "20 damage. Search your discard pile for a [L] Energy card and attach it to Manectric."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Quick Blow", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { damage 20 }
          }
        }
      };
      case MASQUERAIN_47:
      return evolution (this, from:"Surskit", hp:HP070, type:G, retreatCost:0) {
        weakness R
        move "Sweet Scent", {
          text "Remove 2 damage counters from 1 of your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Attack", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 10 }
          }
        }
      };
      case PERSIAN_DELTA_48:
      return evolution (this, from:"Meowth", hp:HP070, type:[D, M], retreatCost:0) {
        weakness F
        move "Scratch and Draw", {
          text "30 damage. If any Stadium card with Holon in its name is in play, draw 3 cards."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Deceive", {
          text "Your opponent chooses 1 of his or her Pokémon. Put 4 damage counters on that Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIDGEOTTO_DELTA_49:
      return evolution (this, from:"Pidgey", hp:HP070, type:L, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PRIMEAPE_DELTA_50:
      return evolution (this, from:"Mankey", hp:HP070, type:R, retreatCost:0) {
        weakness P
        move "Wreck", {
          text "30+ damage. If there is any Stadium card in play, this attack does 30 damage plus 30 more damage. Discard that Stadium card."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Flames of Rage", {
          text "10+ damage. Discard 2 Energy attached to Primeape. This attack does 10 damage plus 20 more damage for each damage counter on Primeape."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case RAICHU_51:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Pika Bolt", {
          text "50 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SEADRA_DELTA_52:
      return evolution (this, from:"Horsea", hp:HP070, type:R, retreatCost:1) {
        weakness L
        move "Searing Flame", {
          text "10 damage. The Defending Pokémon is now Burned."
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
      case SHARPEDO_DELTA_53:
      return evolution (this, from:"Carvanha", hp:HP070, type:F, retreatCost:0) {
        weakness L
        move "Brush Aside", {
          text "30 damage. If Sharpedo has any Holon Energy cards attached to it, choose 1 card from your opponent's hand without looking and discard it."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Swift Turn", {
          text "50+ damage. If the Defending Pokémon has Fighting Resistance, this attack does 50 damage plus 30 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case VIBRAVA_DELTA_54:
      return evolution (this, from:"Trapinch", hp:HP080, type:G, retreatCost:1) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        move "Knock Away", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
        move "Cutting Wind", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WHISCASH_55:
      return evolution (this, from:"Barboach", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Pebble Hurl", {
          text "20 damage. This attack's damage isn't affected by Resistance."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            dontApplyResistance()
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
      case WOBBUFFET_56:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Call for Friends", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Retaliate", {
          text "10x damage. Does 10 damage times the number of damage counters on Wobbuffet."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ANORITH_DELTA_57:
      return evolution (this, from:"Claw Fossil", hp:HP070, type:M, retreatCost:1) {
        weakness G
        move "Metal Claw", {
          text "20 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rising Lunge", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 20 }
          }
        }
      };
      case ARON_58:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Mud Slap", {
          text "10 damage."
          energyCost
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Metal Claw", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BALTOY_59:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Doubleslap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BARBOACH_60:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Waterfall", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Barboach."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case CARVANHA_DELTA_61:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness L
        move "Bite", {
          text "10 damage."
          energyCost
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Reckless Charge", {
          text "30 damage. Flip a coin. If tails, Carvanha does 10 damage to itself."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CORPHISH_62:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Corkscrew Punch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Guillotine", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CORPHISH_63:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Corphish."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
        move "Crabhammer", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELECTRIKE_64:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case EXEGGCUTE_DELTA_65:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Rollout", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pebble Throw", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HORSEA_DELTA_66:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness L
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steady Firebreathing", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KABUTO_DELTA_67:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:L, retreatCost:2) {
        weakness G
        move "Eerie Light", {
          text "The Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Shell Attack", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LILEEP_DELTA_68:
      return evolution (this, from:"Root Fossil", hp:HP080, type:D, retreatCost:2) {
        weakness R
        move "Poison Tentacles", {
          text "The Defending Pokémon is now Poisoned."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Mud Shot", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGIKARP_DELTA_69:
      return basic (this, hp:HP030, type:M, retreatCost:1) {
        weakness L
        move "Splash", {
          text "10 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MANKEY_DELTA_70:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness P
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Low Kick", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEOWTH_DELTA_71:
      return basic (this, hp:HP050, type:[D, M], retreatCost:1) {
        weakness F
        move "Slash", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pay Day", {
          text "10 damage. Draw a card."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NUMEL_72:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case ODDISH_DELTA_73:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Blot", {
          text "10 damage. Remove 2 damage counters from Oddish."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case OMANYTE_DELTA_74:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:P, retreatCost:1) {
        weakness L
        move "Collect", {
          text "Draw 3 cards."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PHANPY_75:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Yawn", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Mud Slup", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PICHU_DELTA_76:
      return basic (this, hp:HP050, type:M, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
          actionA {
          }
        }
        move "Paste", {
          text "Search your discard pile for an Energy card and attach it to 1 of your Pokémon that has δ on its card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIDGEY_DELTA_77:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Wing Attack", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIKACHU_78:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case PIKACHU_DELTA_79:
      return basic (this, hp:HP050, type:M, retreatCost:1) {
        weakness F
        move "Tail Whap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steel Headbutt", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 10 }
          }
        }
      };
      case POOCHYENA_80:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Smash Kick", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PSYDUCK_DELTA_81:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness L
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Disable", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SURSKIT_82:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Super Hypno Wave", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            apply ASLEEP
          }
        }
      };
      case TORCHIC_83:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Peck", {
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
      case TRAPINCH_DELTA_84:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness G
        move "Big Bite", {
          text "10 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            cantRetreat defending
          }
        }
        move "Mud Slap", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HOLON_ADVENTURER_85:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Draw 3 cards. If you discarded a Pokémon that has δ on its card, draw 4 cards instead."
        onPlay {
        }
        playRequirement{
        }
      };
      case HOLON_FOSSIL_86:
      return itemCard (this) {
        text "Flip a coin. If heads, search your deck for an Omanyte, Kabuto, Aerodactyl, Aerodactyl ex, Lileep, or Anorith and put it onto your Bench. Shuffle your deck afterward. If tails, put an Omanyte, Kabuto, Aerodactyl, Aerodactyl ex, Lileep, or Anorith from your hand onto your Bench. Treat the new Benched Pokémon as a Basic Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case HOLON_LAKE_87:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player's Pokémon that has δ on its card can use attacks on this card instead of its own."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case MR_STONE_S_PROJECT_88:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. Or, search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_COZMO_S_DISCOVERY_89:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Flip a coin. If heads, draw the bottom 3 cards of your deck. If tails, draw the top 2 cards of your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case RARE_CANDY_90:
      return itemCard (this) {
        text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolves from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case CLAW_FOSSIL_91:
      return itemCard (this) {
        text "Play Claw Fossil as if it were a Basic Pokémon. While in play, Claw Fossil counts as a [C] Pokémon (as well as a Trainer card). Claw Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Claw Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Claw Fossil from play." +
          "If Claw Fossil is your Active Pokémon and is damaged by an opponent's attack (even if Claw Fossil is Knocked Out), put 1 damage counter on the Attacking Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERIOUS_FOSSIL_92:
      return itemCard (this) {
        text "Play Mysterious Fossil as if it were a Basic Pokémon. While in play, Mysterious Fossil counts as a [C] Pokémon (as well as a Trainer card). Mysterious Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Mysterious Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Mysterious Fossil from play."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROOT_FOSSIL_93:
      return itemCard (this) {
        text "Play Root Fossil as if it were a Basic Pokémon. While in play, Root Fossil counts as a [C] Pokémon (as well as a Trainer card). Root Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Root Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Root Fossil from play." +
          "At any time between turns, remove 1 damage counter from Root Fossil."
        onPlay {
        }
        playRequirement{
        }
      };
      case DARKNESS_ENERGY_94:
      return specialEnergy (this, [[C]]) {
        text "If the Pokémon [D] Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect unless the Attacking Pokémon is Darkness or has Dark in its name. [D] Energy provides [D] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case METAL_ENERGY_95:
      return specialEnergy (this, [[C]]) {
        text "Damage done by attacks to the Pokémon that [M] Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that [M] Energy is attached to isn't Metal. [M] Energy provides [M] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case MULTI_ENERGY_96:
      return specialEnergy (this, [[C]]) {
        text "Attach Multi Energy to 1 of your Pokémon. While in play, Multi Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) Multi Energy provides [C] Energy when attached to a Pokémon that already has Special Energy cards attached to it."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case DARK_METAL_ENERGY_97:
      return specialEnergy (this, [[C]]) {
        text "Attach Dark [M] Energy to 1 of your Pokémon. While in play, Dark [M] Energy provides Darkness and [M] Energy, but provides only 1 Energy at a time. (Doesn't count as a basic energy card when not in play and has no effect other than providing Energy.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case DELTA_RAINBOW_ENERGY_98:
      return specialEnergy (this, [[C]]) {
        text "δ Rainbow Energy provides [C] Energy. While attached to a Pokémon that has δ on its card, δ Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CRAWDAUNT_EX_99:
      return evolution (this, from:"Corphish", hp:HP110, type:W, retreatCost:2) {
        weakness L
        pokePower "Splash Back", {
          text "Once during your turn (before your attack), if your opponent has 4 or more Benched Pokémon, you may choose 1 of them and return that Pokémon and all cards attached to it to his or her hand. This power can't be used if Crawdaunt ex is affected by a Special Condition."
          actionA {
          }
        }
        move "Power Blow", {
          text "20x damage. Does 20 damage times the amount of Energy attached to Crawdaunt ex."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEW_EX_100:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness P
        pokePower "Psychic Vision", {
          text "Once during your turn (before your attack), if Mew ex is on your Bench, you may look at your opponent's hand."
          actionA {
          }
        }
        move "Super Psy Bolt", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Devo Crush", {
          text "50 damage. You may discard 2 Energy attached to Mew ex. If you do, you may remove the highest Stage Evolution card from the Defending Pokémon and shuffle that card into your opponent's deck."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MIGHTYENA_EX_101:
      return evolution (this, from:"Poochyena", hp:HP100, type:D, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        pokePower "Driving Howl", {
          text "Once during your turn (before your attack), you may choose 1 of the Defending Pokémon and switch it with 1 of your opponent's Benched Pokémon. Your opponent chooses the Benched Pokémon to switch. This power can't be used if Mightyena ex is affected by a Special Condition."
          actionA {
          }
        }
        move "Sharp Fang", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hyper Claws", {
          text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 50 damage plus 40 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GYARADOS_STAR_DELTA_102:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness L
        move "Spiral Growth", {
          text "20 damage. Flip a coin until you get tails. For each heads, search your discard pile for a basic Energy card and attach it to Gyarados Star."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "All-out Blast", {
          text "50+ damage. Discard cards from the top of your deck until you have 1 card left. This attack does 50 damage plus 20 more damage for each Energy card you discarded in this way."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MEWTWO_STAR_103:
      return basic (this, hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Energy Absorption", {
          text "Search your discard pile for an Energy card and attach it to Mewtwo Star."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psychic Star", {
          text "50+ damage. If the Defending Pokémon is an Evolved Pokémon, discard all Energy attached to Mewtwo Star and this attack does 50 damage plus 50 more damage."
          energyCost P, R, L
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PIKACHU_STAR_104:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Spring Back", {
          text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage."
          energyCost L, L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GRASS_ENERGY_105:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case FIRE_ENERGY_106:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case WATER_ENERGY_107:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case LIGHTNING_ENERGY_108:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case PSYCHIC_ENERGY_109:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case FIGHTING_ENERGY_110:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case MEW_111:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Super Psywave", {
          text "Choose 1 of your opponent's Pokémon. Count the amount of Energy attached to that Pokémon. Put that many damage counters on the Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      default:
      return null;
    }
  }

}