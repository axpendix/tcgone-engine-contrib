package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum Stormfront implements LogicCardInfo {

  DUSKNOIR_1 ("Dusknoir", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_2 ("Empoleon", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  INFERNAPE_3 ("Infernape", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LUMINEON_4 ("Lumineon", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGNEZONE_5 ("Magnezone", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MAGNEZONE_6 ("Magnezone", 6, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  MISMAGIUS_7 ("Mismagius", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  RAICHU_8 ("Raichu", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  REGIGIGAS_9 ("Regigigas", 9, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  SCEPTILE_10 ("Sceptile", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TORTERRA_11 ("Torterra", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  ABOMASNOW_12 ("Abomasnow", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BRONZONG_13 ("Bronzong", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CHERRIM_14 ("Cherrim", 14, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DRAPION_15 ("Drapion", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DRIFBLIM_16 ("Drifblim", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSKNOIR_17 ("Dusknoir", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GENGAR_18 ("Gengar", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GYARADOS_19 ("Gyarados", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MACHAMP_20 ("Machamp", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  MAMOSWINE_21 ("Mamoswine", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  RAPIDASH_22 ("Rapidash", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  ROSERADE_23 ("Roserade", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SALAMENCE_24 ("Salamence", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SCIZOR_25 ("Scizor", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SKUNTANK_26 ("Skuntank", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  STARAPTOR_27 ("Staraptor", 27, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  STEELIX_28 ("Steelix", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TANGROWTH_29 ("Tangrowth", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TYRANITAR_30 ("Tyranitar", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  VESPIQUEN_31 ("Vespiquen", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BIBAREL_32 ("Bibarel", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BUDEW_33 ("Budew", 33, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSCLOPS_34 ("Dusclops", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSCLOPS_35 ("Dusclops", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ELECTRODE_36 ("Electrode", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ELECTRODE_37 ("Electrode", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FARFETCH_D_38 ("Farfetch'd", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GROVYLE_39 ("Grovyle", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HAUNTER_40 ("Haunter", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MACHOKE_41 ("Machoke", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGNETON_42 ("Magneton", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGNETON_43 ("Magneton", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MILTANK_44 ("Miltank", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  PICHU_45 ("Pichu", 45, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PILOSWINE_46 ("Piloswine", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PUPITAR_47 ("Pupitar", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SABLEYE_48 ("Sableye", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  SCYTHER_49 ("Scyther", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SHELGON_50 ("Shelgon", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SKARMORY_51 ("Skarmory", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  STARAVIA_52 ("Staravia", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BAGON_53 ("Bagon", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BIDOOF_54 ("Bidoof", 54, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_55 ("Bronzor", 55, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CHERUBI_56 ("Cherubi", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  COMBEE_57 ("Combee", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DRIFLOON_58 ("Drifloon", 58, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_59 ("Duskull", 59, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_60 ("Duskull", 60, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  FINNEON_61 ("Finneon", 61, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GASTLY_62 ("Gastly", 62, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  LARVITAR_63 ("Larvitar", 63, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MACHOP_64 ("Machop", 64, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGIKARP_65 ("Magikarp", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGNEMITE_66 ("Magnemite", 66, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MAGNEMITE_67 ("Magnemite", 67, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MISDREAVUS_68 ("Misdreavus", 68, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ONIX_69 ("Onix", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIKACHU_70 ("Pikachu", 70, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PONYTA_71 ("Ponyta", 71, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  ROSELIA_72 ("Roselia", 72, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKORUPI_73 ("Skorupi", 73, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SNOVER_74 ("Snover", 74, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARLY_75 ("Starly", 75, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUNKY_76 ("Stunky", 76, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SWINUB_77 ("Swinub", 77, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TANGELA_78 ("Tangela", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TREECKO_79 ("Treecko", 79, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_80 ("Voltorb", 80, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  VOLTORB_81 ("Voltorb", 81, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  CONDUCTIVE_QUARRY_82 ("Conductive Quarry", 82, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_LINK_83 ("Energy Link", 83, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_SWITCH_84 ("Energy Switch", 84, Rarity.UNCOMMON, [TRAINER]),
  GREAT_BALL_85 ("Great Ball", 85, Rarity.UNCOMMON, [TRAINER]),
  LUXURY_BALL_86 ("Luxury Ball", 86, Rarity.UNCOMMON, [TRAINER]),
  MARLEY_S_REQUEST_87 ("Marley's Request", 87, Rarity.UNCOMMON, [TRAINER]),
  POKE_BLOWER_PLUS_88 ("Poké Blower +", 88, Rarity.UNCOMMON, [TRAINER]),
  POKE_DRAWER_PLUS_89 ("Poké Drawer +", 89, Rarity.UNCOMMON, [TRAINER]),
  POKE_HEALER_PLUS_90 ("Poké Healer +", 90, Rarity.UNCOMMON, [TRAINER]),
  PREMIER_BALL_91 ("Premier Ball", 91, Rarity.UNCOMMON, [TRAINER]),
  POTION_92 ("Potion", 92, Rarity.COMMON, [TRAINER]),
  SWITCH_93 ("Switch", 93, Rarity.UNCOMMON, [TRAINER]),
  CYCLONE_ENERGY_94 ("Cyclone Energy", 94, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  WARP_ENERGY_95 ("Warp Energy", 95, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DUSKNOIR_LV_X_96 ("Dusknoir LV.X", 96, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  HEATRAN_LV_X_97 ("Heatran LV.X", 97, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIRE_]),
  MACHAMP_LV_X_98 ("Machamp LV.X", 98, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
  RAICHU_LV_X_99 ("Raichu LV.X", 99, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _LIGHTNING_]),
  REGIGIGAS_LV_X_100 ("Regigigas LV.X", 100, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
  CHARMANDER_101 ("Charmander", 101, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  CHARMELEON_102 ("Charmeleon", 102, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHARIZARD_103 ("Charizard", 103, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DRIFLOON_SH1 ("Drifloon", 104, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_SH2 ("Duskull", 105, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  VOLTORB_SH3 ("Voltorb", 106, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Stormfront(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.STORMFRONT;
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
      case DUSKNOIR_1:
        return evolution (this, from:"Dusclops", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokeBody "Shadow Command", {
            text "Once during your turn , you may draw 2 cards. If you have 7 or more cards in your hand, discard a number of cards until you have 6 cards in your hand. Then, put 2 damage counters on Dusknoir. This power can’t be used if Dusknoir is affected by a Special Condition."
            delayedA {
            }
          }
          move "Damage Even", {
            text "Count the number of damage counters on Dusknoir. Put that many damage counters on 1 of your opponent’s Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Night Spin", {
            text "50 damage. Prevent all effects of an attack, including damage, done to Dusknoir by your opponent’s Pokémon that has 2 or less Energy attached to it during your opponent’s next turn."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EMPOLEON_2:
        return evolution (this, from:"Prinplup", hp:HP130, type:METAL, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Emperor Aura", {
            text "Once during your turn , when you play Empoleon from your hand to evolve 1 of your Active Pokémon, you may use this power. Your opponent can’t attach any Energy cards from his or her hand to his or her Pokémon during your opponent’s next turn."
            actionA {
            }
          }
          move "Steel Wing", {
            text "40 damage. ."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Whirlpool", {
            text "60 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip { discardDefendingEnergy() }
            }
          }

        };
      case INFERNAPE_3:
        return evolution (this, from:"Monferno", hp:HP120, type:FIGHTING, retreatCost:0) {
          weakness P, PLUS30
          pokePower "Blaze Dance", {
            text "Once during your turn , when you play Infernape from your hand to evolve 1 of your Pokémon, you may flip a coin. If heads, search your deck for up to 4 Energy cards and attach them to your Pokémon in any way you like. Shuffle your deck afterward."
            actionA {
            }
          }
          move "Close Combat", {
            text "60 damage. ."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spreading Fire", {
            text "80 damage. Energy attached to Infernape and this attack does 20 damage to each of your opponent’s Benched Pokémon."
            energyCost R, R, C, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUMINEON_4:
        return evolution (this, from:"Finneon", hp:HP080, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          pokePower "Fin Luster", {
            text "Once during your turn , if Lumineon is your Active Pokémon, you may look at your opponent’s hand. If your opponent’s Bench isn’t full, choose 1 Basic Pokémon from your opponent’s hand, and put it onto his or her Bench. Then, switch it with the Defending Pokémon. This power can’t be used if Lumineon is affected by a Special Condition."
            actionA {
            }
          }
          move "Quick Swim", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Elegant Swim", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Lumineon during your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEZONE_5:
        return evolution (this, from:"Magneton", hp:HP120, type:METAL, retreatCost:2) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokePower "Magnetic Search", {
            text "Once during your turn , you may search your deck for a or Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Magnezone is affected by a Special Condition."
            actionA {
            }
          }
          move "Speed Shot", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Crush Volt", {
            text "80 damage. Discard an Energy attached to Magnezone."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEZONE_6:
        return evolution (this, from:"Magneton", hp:HP120, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokePower "Super Connectivity", {
            text "Once during your turn , you may search your discard pile for a or Energy card and attach it to your Active Pokémon. Then, put 1 damage counter on that Pokémon. This power can’t be used if Magnezone is affected by a Special Condition."
            actionA {
            }
          }
          move "Gyro Ball", {
            text "60 damage. You may switch Magnezone with 1 of your Benched Pokémon. If you do, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MISMAGIUS_7:
        return evolution (this, from:"Misdreavus", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Crash Chant", {
            text "20× damage. and discard them. This attack does 20 damage times the number of cards discarded in this way."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Horror Chant", {
            text "40 damage. If your opponent has 4 or more Benched Pokémon, choose 1 of them and return that Pokémon and all cards attached to it to your opponent’s hand."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_8:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Slice", {
            text "30 damage. Raichu can’t use Slice during your next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Split Ball", {
            text "50 damage. Move an Energy card attached to Raichu to 1 of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Burst Ball", {
            text "100 damage. Discard 3 Energy attached to any of your Pokémon in any way you like."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REGIGIGAS_9:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          pokeBody "Regi Form", {
            text "If you have Regirock, Regice, and Registeel in play, the attack cost of Regigigas’s attacks is less."
            delayedA {
            }
          }
          move "Mega Punch", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Giga Power", {
            text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Regigigas does 40 damage to itself."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCEPTILE_10:
        return evolution (this, from:"Grovyle", hp:HP110, type:GRASS, retreatCost:1) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokePower "Energy Trans", {
            text "As often as you like during your turn , move a Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Sceptile is affected by a Special Condition."
            actionA {
            }
          }
          move "Poison Leaf", {
            text "40 damage. The Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slice Drain", {
            text "60 damage. Remove 2 damage counters from Sceptile."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORTERRA_11:
        return evolution (this, from:"Grotle", hp:HP140, type:FIGHTING, retreatCost:4) {
          weakness W, PLUS30
          resistance L, MINUS20
          pokePower "Sunshine Song", {
            text "Once during your turn, when you play Torterra from your hand to evolve 1 of your Pokémon, you may choose as many of your Pokémon in play as you like. For each Pokémon you choose, search your deck for an Evolution card that evolves from that Pokémon and evolve it. Shuffle your deck afterward."
            actionA {
            }
          }
          move "Crash Impact", {
            text "60 damage. Torterra does 20 damage to itself. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Land Shake", {
            text "80 damage. During your opponent’s next turn, whenever your opponent puts a Basic Pokémon from his or her hand onto his or her Bench, put 2 damage counters on that Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ABOMASNOW_12:
        return evolution (this, from:"Snover", hp:HP100, type:WATER, retreatCost:3) {
          weakness R, PLUS30
          pokeBody "Snow Veil", {
            text "As long as Abomasnow is your Active Pokémon, any damage done to your Pokémon by an opponent’s attack is reduced by 20 ."
            delayedA {
            }
          }
          move "Snow Play", {
            text "20 damage. Pokémon."
            energyCost C, C, G, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Below Zero", {
            text "60 damage. If Abomasnow evolved from Snover during this turn, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BRONZONG_13:
        return evolution (this, from:"Bronzor", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          resistance R, MINUS20
          pokePower "Cycler", {
            text "Once during your turn , you may choose a card from your hand and put it on top of your deck. Then, search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. This power can’t be used if Bronzong is affected by a Special Condition."
            actionA {
            }
          }
          move "Strange Spin", {
            text "20+ damage. If you have the same number of cards in your hand as your opponent, this attack does 20 damage plus 40 more damage and the Defending Pokémon is now Confused."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Heavy Potential", {
            text "Energy in that Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost P, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHERRIM_14:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          pokeBody "Sunny Day", {
            text "Each of your Pokémon’s and Pokémon’s attacks does 10 more damage to the Defending Pokémon ."
            delayedA {
            }
          }
          move "Salty-sweet Pollen", {
            text "20 damage. Remove 2 damage counters from 1 of your Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Solarbeam", {
            text "50 damage. "
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRAPION_15:
        return evolution (this, from:"Skorupi", hp:HP110, type:DARKNESS, retreatCost:3) {
          weakness P, PLUS20
          move "Scorpion Grapple", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Cross Poison", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads. If 2 or more of them are heads, the Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Derail", {
            text "60 damage. Discard all Special Energy cards attached to the Defending Pokémon."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFBLIM_16:
        return evolution (this, from:"Drifloon", hp:HP090, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Delivery", {
            text "Put any 1 card from your discard pile into your hand."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Lifting", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. For each Basic Pokémon you put onto your Bench, you may search your deck for a basic Energy card and attach it to that Pokémon. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ominous Wind", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSKNOIR_17:
        return evolution (this, from:"Dusclops", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokeBody "Spirit Pulse", {
            text "As long as Dusknoir is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon that has any Energy attached to it between turns."
            delayedA {
            }
          }
          move "Darkness Mist", {
            text "60+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GENGAR_18:
        return evolution (this, from:"Haunter", hp:HP110, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Fainting Spell", {
            text "Once during your opponent’s turn, if Gengar would be Knocked Out by damage from an attack, you may flip a coin. If heads, the Defending Pokémon is Knocked Out."
            actionA {
            }
          }
          move "Shadow Room", {
            text "Put 3 damage counters on 1 of your opponent’s Pokémon. If that Pokémon has any Poké-Powers, put 6 damage counters on that Pokémon instead."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poltergeist", {
            text "30× damage. Look at your opponent’s hand. This attack does 30 damage times the number of Trainer, Supporter and Stadium cards in your opponent’s hand."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GYARADOS_19:
        return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Tail Revenge", {
            text "30× damage. Does 30 damage times the number of Magikarp in your discard pile."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wreak Havoc", {
            text "40 damage. Flip a coin until you get tails. For each heads, discard the top card from your opponent’s deck."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dragon Beat", {
            text "100 damage. Flip a coin. If heads, discard an Energy card from each of your opponent’s Pokémon."
            energyCost W, W, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MACHAMP_20:
        return evolution (this, from:"Machoke", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS30
          move "Take Out", {
            text "40 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon is Knocked Out instead of damaged by this attack."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hurricane Punch", {
            text "30× damage. Flip 4 coins. This attack does 30 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rage", {
            text "60+ damage. Does 60 damage plus 10 more damage for each damage counter on Machamp."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAMOSWINE_21:
        return evolution (this, from:"Piloswine", hp:HP140, type:FIGHTING, retreatCost:5) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Ramming Strike", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads or you may start again. Each time you start again, put 2 damage counters on Mamoswine. (If Mamoswine would be Knocked Out, you can’t start again.)"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Parade", {
            text "60+ damage. Does 60 damage plus 10 more damage for each Swinub on your Bench, plus 20 more damage for each Piloswine on your Bench, and 40 more damage for each Mamoswine on your Bench."
            energyCost W, F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAPIDASH_22:
        return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          pokeBody "Burning Mane", {
            text "If Rapidash is your Active Pokémon and is damaged by an opponent’s attack (even if Rapidash is Knocked Out), the Attacking Pokémon is now Burned."
            delayedA {
            }
          }
          move "Rear Kick", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shooting Fire", {
            text "Energy attached to Rapidash and choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon."
            energyCost R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ROSERADE_23:
        return evolution (this, from:"Roselia", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Hidden Poison", {
            text "If Roserade is your Active Pokémon and is damaged by an opponent’s attack (even if Roserade is Knocked Out), the Defending Pokémon is now Poisoned."
            delayedA {
            }
          }
          move "Bowed Whip", {
            text "Flip a coin. If heads, discard an Energy card attached to that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Deep Poison", {
            text "50+ damage. If the Defending Pokémon is Poisoned, this attack does 50 damage plus 30 more damage."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SALAMENCE_24:
        return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:3) {
          weakness C, PLUS30
          resistance F, MINUS20
          pokeBody "Battle Rush", {
            text "If your opponent has any Pokémon in play that has maximum HP of 120 or more, ignore all Energy necessary to use Salamence’s attacks."
            delayedA {
            }
          }
          move "Combustion", {
            text "50 damage. "
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Steam Twister", {
            text "120 damage. Energy attached to Salamence."
            energyCost R, W, C, C, R, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCIZOR_25:
        return evolution (this, from:"Scyther", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Honeycomb Defender", {
            text "If Scizor has 6 or more damage counters on it, any damage done to Scizor by attacks is reduced by 40 ."
            delayedA {
            }
          }
          move "Accelerate", {
            text "30 damage. If the Defending Pokémon is Knocked Out by this attack, prevent all effects of an attack, including damage, done to Scizor during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pound Down", {
            text "40+ damage. If you don’t have any Pokémon with any Poké-Powers in play, this attack does 40 damage plus 30 more damage."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKUNTANK_26:
        return evolution (this, from:"Stunky", hp:HP100, type:DARKNESS, retreatCost:2) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokePower "Evolutionary Gas", {
            text "Once during your turn , when you play Skuntank from your hand to evolve 1 of your Active Pokémon, you may choose 1 of the Defending Pokémon. If that Pokémon tries to attack during your opponent’s next turn, that attack does nothing."
            actionA {
            }
          }
          move "Poison Claws", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Plunder", {
            text "60 damage. "
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARAPTOR_27:
        return evolution (this, from:"Staravia", hp:HP120, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          pokeBody "Protect Wing", {
            text "As long as Staraptor is your Active Pokémon, any damage done by attacks from your opponent’s Stage 2 Evolved Pokémon is reduced by 20 ."
            delayedA {
            }
          }
          move "Strong Breeze", {
            text "Flip a coin. If heads, put 1 of your opponent’s Benched Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Clutch", {
            text "60 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STEELIX_28:
        return evolution (this, from:"Onix", hp:HP130, type:METAL, retreatCost:4) {
          weakness R, PLUS30
          resistance P, MINUS20
          move "Outbreak Power", {
            text "Choose a number of your opponent’s Pokémon up to the amount of Energy attached to Steelix. This attack does 20 damage to each of them."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Iron Tail", {
            text "100× damage. Flip a coin until you get tails. This attack does 100 damage for each heads."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TANGROWTH_29:
        return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokeBody "Green Renewal", {
            text "Remove 1 damage counter from Tangrowth between turns."
            delayedA {
            }
          }
          move "Green Acid", {
            text "20 damage. Flip 2 coins. If the first coin is heads, the Defending Pokémon is now Confused. If the second coin is heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Reaching Vine", {
            text "60 damage. Does 20 damage to 2 of your opponent’s Benched Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TYRANITAR_30:
        return evolution (this, from:"Pupitar", hp:HP140, type:DARKNESS, retreatCost:4) {
          weakness F, PLUS30
          resistance P, MINUS20
          pokeBody "Darkness Drive", {
            text "After your opponent’s Pokémon uses a Poké-Power, you may search your discard pile for a basic Energy and attach it to Tyranitar."
            delayedA {
            }
          }
          move "Grind", {
            text "20× damage. Does 20 damage times the amount of Energy attached to Tyranitar."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20*self.cards.energyCount(C)
            }
          }
          move "Spinning Tail", {
            text "This attack does 30 damage to each of your opponent’s Pokémon."
            energyCost D, D, D, D, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VESPIQUEN_31:
        return evolution (this, from:"Combee", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokeBody "Green Dignity", {
            text "As long as you have more Prize cards left than your opponent, Vespiquen’s attacks do 10 more damage for each Pokémon on your Bench to the Active Pokémon ."
            delayedA {
            }
          }
          move "Bee Drain", {
            text "20 damage. After your attack, remove from Vespiquen the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bee Powder", {
            text "50 damage. Flip 2 coins. If both are heads, the Defending Pokémon is now Burned, Paralyzed and Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BIBAREL_32:
        return evolution (this, from:"Bidoof", hp:HP100, type:WATER, retreatCost:3) {
          weakness F, PLUS30
          pokeBody "Unaware", {
            text "Prevent all effects of attacks, excluding damage, done to Bibarel."
            delayedA {
            }
          }
          move "Amnesia", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              amnesia delegate
            }
          }
          move "", {
            text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surf", {
            text "60 damage. "
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BUDEW_33:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS10
          pokeBody "Poison Enzyme", {
            text "Prevent all effects of attacks, including damage, done to Budew by your opponent’s Poisoned Pokémon."
            delayedA {
            }
          }
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Roselia from your hand onto Budew (this counts as evolving Budew) and remove all damage counters from Budew."
            actionA {
              assert my.hand.findAll{it.name.contains("Roselia")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Roselia") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Buddy-buddy", {
            text "Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSCLOPS_34:
        return evolution (this, from:"Duskull", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Dark One-eye", {
            text "20 damage. You may discard a card from your hand. If you do, your opponent discards a card from his or her hand."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ambush", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSCLOPS_35:
        return evolution (this, from:"Duskull", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }
          move "Trick Room", {
            text "40+ damage. If you have a Stadium card in play, this attack does 40 damage plus 20 more damage. If your opponent has a Stadium card in play, remove 2 damage counters from Dusclops."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ELECTRODE_36:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokeBody "Radiance", {
            text "If Electrode is your Active Pokémon and is damaged by an opponent’s attack (even if Electrode is Knocked Out), put 1 damage counter on each of your opponent’s Pokémon."
            delayedA {
            }
          }
          move "Low Current", {
            text "30 damage. If Electrode was damaged by an attack during your opponent’s last turn, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Swift", {
            text "60 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              swiftDamage(60, defending)
            }
          }

        };
      case ELECTRODE_37:
        return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Flash", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Electro Diffusion", {
            text "40+ damage. Energy attached to Electrode."
            energyCost C, C, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FARFETCH_D_38:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Go and Collect", {
            text "Search your deck for a Trainer, Supporter, or Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Cutter", {
            text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip 3,{},{}, [ 1:{damage 10}, 2:{damage 20}, 3:{damage 40} ]
            }
          }

        };
      case GROVYLE_39:
        return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Tail Shake", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slam", {
            text "60× damage. Flip 2 coins. This attack does 60 damage times the number of heads."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HAUNTER_40:
        return evolution (this, from:"Gastly", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Smog", {
            text "The Defending Pokémon is now Poisoned."
            energyCost ()
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }
          move "Hoodwink", {
            text "30 damage. You may search your opponent’s discard pile for up to 3 in any combination of Trainer, Supporter or Stadium cards and put them into your opponent’s hand."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MACHOKE_41:
        return evolution (this, from:"Machop", hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS20
          move "Steady Punch", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Brick Break", {
            text "30 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNETON_42:
        return evolution (this, from:"Magnemite", hp:HP080, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Magnetic Resonance", {
            text "20 damage. If you have a Stadium card in play, this attack does 20 damage to 2 of your opponent’s Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Magnetic Release", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNETON_43:
        return evolution (this, from:"Magnemite", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Wave", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }
          move "Removal Pulse", {
            text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip { discardDefendingEnergy() }
            }
          }

        };
      case MILTANK_44:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Energy Milk", {
            text "Flip a coin until you get tails. For each heads, remove 2 damage counters from 1 of your Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PICHU_45:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              assert my.hand.findAll{it.name.contains("Pikachu")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Pikachu") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Electric Circuit", {
            text "Energy cards, show them to your opponent, and put them into your hand."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PILOSWINE_46:
        return evolution (this, from:"Swinub", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Rouse", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Piloswine. Then, remove 4 damage counters from Piloswine."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Overrun", {
            text "60 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PUPITAR_47:
        return evolution (this, from:"Larvitar", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          resistance L, MINUS20
          pokeBody "Energy Protection", {
            text "Any damage done to Pupitar by attacks is reduced by 10 for each Energy attached to Pupitar . You can’t reduce more than 30 damage in this way."
            delayedA {
            }
          }
          move "Rock Smash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SABLEYE_48:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          pokeBody "Overeager", {
            text "If Sableye is your Active Pokémon at the beginning of the game, you go first. (If each player’s Active Pokémon has the Overeager Poké-Body, this power does nothing.)"
            delayedA {
            }
          }
          move "Impersonate", {
            text "Search your deck for a Supporter card and discard it. Shuffle your deck afterward. Then, use the effect of that card as the effect of this attack."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Overconfident", {
            text "10 damage. "
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCYTHER_49:
        return basic (this, hp:HP060, type:GRASS, retreatCost:0) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Swords Dance", {
            text "During your next turn, Scyther’s Slashing Strike attack’s base damage is 60."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slashing Strike", {
            text "30 damage. During your next turn, Scyther can’t use Slashing Strike."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHELGON_50:
        return evolution (this, from:"Bagon", hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }
          move "Rollout", {
            text "50 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKARMORY_51:
        return basic (this, hp:HP080, type:METAL, retreatCost:1) {
          weakness L, PLUS20
          resistance M, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mach Blade", {
            text "Flip a coin. If heads, this attack does 50 damage to 1 of your opponent’s Pokémon."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARAVIA_52:
        return evolution (this, from:"Starly", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Wing Attack", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shot Air", {
            text "20 damage. Does 30 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BAGON_53:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          resistance F, MINUS20
          move "Scary Face", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Headbutt", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BIDOOF_54:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Self-abandonment", {
            text "Flip a coin. If heads, this attack does 30 damage to the Defending Pokémon. If tails, Bidoof does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BRONZOR_55:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          resistance R, MINUS20
          move "Gyro Swap", {
            text "Energy in Bronzor’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case CHERUBI_56:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Nap", {
            text "Remove 2 damage counters from Cherubi."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bullet Seed", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBEE_57:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "", {
            text "Once damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Alert", {
            text "Draw a card. Then, you may switch Combee with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFLOON_58:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Constrict", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply PARALYZED }
            }
          }
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSKULL_59:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Silhouette", {
            text "Put 1 damage counter on the Defending Pokémon. If the Defending Pokémon already has any damage counters on it, put 2 damage counters on that Pokémon instead."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Will-o’-the-wisp", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSKULL_60:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surprise Attack", {
            text "30 damage. Flip a coin. If tails, this attack does nothing"
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FINNEON_61:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Aqua Liner", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mouth Pump", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GASTLY_62:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Pitch-Dark", {
            text "You opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Trick Gas", {
            text "10 damage. You may switch Gastly with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LARVITAR_63:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rock Slide", {
            text "20 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench) {
                multiSelect(opp.bench, 2).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }

        };
      case MACHOP_64:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Kick", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Knock Back", {
            text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGIKARP_65:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Sea Spray", {
            text "Flip a coin until you get tails. For each heads, draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Splash", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEMITE_66:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "", {
            text "Magnemite’s damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Magnetic Bomb", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, Magnemite does 10 damage to itself."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEMITE_67:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Ram", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Random Spark", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MISDREAVUS_68:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Lullaby", {
            text "The Defending Pokémon is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Nightmare Feast", {
            text "If the Defending Pokémon is Asleep, this attack does 50 damage and remove 5 damage counters from Misdreavus. If the Defending Pokémon is not Asleep, this attack does nothing."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ONIX_69:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          move "Harden", {
            text "During your opponent’s next turn, if Onix would be damaged by an attack, prevent that attack’s damage done to Onix if that damage is 40 or less."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bind", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }

        };
      case PIKACHU_70:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Pika Punch", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Speed Bolt", {
            text "40 damage. If Pikachu evolved from Pichu during this turn, prevent all effects of an attack, including damage, done to Pikachu during your opponent’s next turn."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PONYTA_71:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Smash Kick", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Ponyta during your opponent’s next turn."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }

        };
      case ROSELIA_72:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS10
          move "Headbutt", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Petal Spikes", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep and Poisoned. If Budew is anywhere under Roselia, the Defending Pokémon is now Asleep and Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKORUPI_73:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness P, PLUS10
          move "Stalk", {
            text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dangerous Claw", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SNOVER_74:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness R, PLUS10
          move "", {
            text "Flip damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Powder Snow", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARLY_75:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Stab", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STUNKY_76:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Gnaw and Run", {
            text "10 damage. Switch Stunky with 1 of your Benched Pokémon."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Scratch", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWINUB_77:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance F, MINUS20
          move "Freezing Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { apply PARALYZED }
            }
          }
          move "Take Down", {
            text "20 damage. Flip a coin. If tails, Swinub does 10 damage to itself."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TANGELA_78:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Ingrain", {
            text "Energy card and attach it to Tangela. Shuffle your deck afterward. If you do, prevent all effects of an attack, including damage, done to Tangela during your opponent’s next turn."
            energyCost C, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tickle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case TREECKO_79:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Call for Friends", {
            text "Search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }

        };
      case VOLTORB_80:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Screech", {
            text ", that attack does 20 more damage to that Pokémon until the end of your next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Spin", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VOLTORB_81:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Outlet", {
            text "Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bouncing Ball", {
            text "20 damage. Flip a coin. If tails, Voltorb does 10 damage to itself."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CONDUCTIVE_QUARRY_82:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, the player may flip a coin. If heads, that player searches his or her discard pile for a [L] or [M] Energy card, shows it to the opponent, and puts it into his or her hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_LINK_83:
        return basicTrainer (this) {
          text "Attach Energy Link to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAs long as Energy Link is attached to a Pokémon, you may move an Energy card attached to that Pokémon to another of your Pokémon that has Energy Link attached to it. You may use this effect as often as you like during your turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_SWITCH_84:
        return basicTrainer (this) {
          text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case GREAT_BALL_85:
        return basicTrainer (this) {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case LUXURY_BALL_86:
        return basicTrainer (this) {
          text "Search your deck for a Pokémon (excluding Pokémon LV.X), show it to your opponent, and put it into your hand. Shuffle your deck afterward. If any Luxury Ball is in your discard pile, you can’t play this card."
          onPlay {
          }
          playRequirement{
          }
        };
      case MARLEY_S_REQUEST_87:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for 2 different Trainer, Supporter, or Stadium cards, show them to your opponent, and your opponent chooses 1 of them. Put that card into your hand, and discard the other card. (If all Trainer, Supporter, and Stadium cards in your discard pile have the same name, choose 1 of them. Show that card to your opponent and put it into your hand.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_BLOWER_PLUS_88:
        return basicTrainer (this) {
          text "You may play 2 Poké Blower + at the same time. If you play 1 Poké Blower +, flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. If you play 2 Poké Blower +, choose 1 of your opponent’s Benched Pokémon and switch it with 1 of your opponent’s Active Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_DRAWER_PLUS_89:
        return basicTrainer (this) {
          text "You may play 2 Poké Drawer + at the same time. If you play 1 Poké Drawer +, draw a card. If you play 2 Poké Drawer +, search your deck for up to 2 cards, and put them into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_HEALER_PLUS_90:
        return basicTrainer (this) {
          text "You may play 2 Poké Healer + at the same time. If you play 1 Poké Healer +, remove 1 damage counter and a Special Condition from 1 of your Active Pokémon. If you play 2 Poké Healer +, remove 8 damage counters and all Special Conditions from 1 of your Active Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case PREMIER_BALL_91:
        return basicTrainer (this) {
          text "Search your deck or your discard pile for a Pokémon LV.X, show it to your opponent, and put it into your hand. If you search your deck, shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case POTION_92:
        return basicTrainer (this) {
          text "Remove 2 damage counters from 1 of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
          onPlay {
          }
          playRequirement{
          }
        };
      case SWITCH_93:
        return basicTrainer (this) {
          text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case CYCLONE_ENERGY_94:
        return specialEnergy (this, [[C]]) {
          text "Cyclone Energy provides [C] Energy. When you attach this card from your hand to your Active Pokémon, switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. Your opponent chooses the Benched Pokémon to switch."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case WARP_ENERGY_95:
        return specialEnergy (this, [[C]]) {
          text "Warp Energy provides [C] Energy. When you attach this card from your hand to your Active Pokémon, switch that Pokémon with 1 of your Benched Pokémon."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case DUSKNOIR_LV_X_96:
        return evolution (this, from:"Dusknoir", hp:HP140, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokePower "Ectoplasm", {
            text "If Dusknoir is your Active Pokémon and would be Knocked Out by damage from your opponent’s attack, you may discard all cards attached to Dusknoir LV. and put Dusknoir LV. as a Stadium card into play instead of discarding it. This counts as Dusknoir being Knocked Out and your opponent takes a Prize card. As long as you have Dusknoir LV. as a Stadium card in play, put 1 damage counter on each of your opponent’s Pokémon between turns. If another Stadium card comes into play or Dusknoir LV. is discarded by the effects of any attacks, Poké-Powers, Poké-Bodies, Trainer, or Supporter cards, return Dusknoir LV. to your hand."
            actionA {
            }
          }
          move "", {
            text "Put this card onto your Active Dusknoir. Dusknoir LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HEATRAN_LV_X_97:
        return evolution (this, from:"Heatran", hp:HP120, type:FIRE, retreatCost:4) {
          weakness W
          pokeBody "Heat Metal", {
            text "Your opponent can’t remove the Special Condition Burned by evolving or devolving his or her Burned Pokémon. (This also includes putting a Pokémon Level-Up card onto the Burned Pokémon.) Whenever your opponent flips a coin for the Special Condition Burned between turns, treat it as tails."
            delayedA {
            }
          }
          pokePower "Heat Wave", {
            text "Once at the end of your turn, if Heatran is on your Bench, you may use this power. If you discarded basic Energy cards attached to your or Active Pokémon by that Pokémon’s attack this turn, attach up to 2 of those Energy cards to that Pokémon."
            actionA {
            }
          }
          move "", {
            text "Put this card onto your Active Heatran. Heatran LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MACHAMP_LV_X_98:
        return evolution (this, from:"Machamp", hp:HP150, type:FIGHTING, retreatCost:3) {
          weakness P
          pokeBody "No Guard", {
            text "As long as Machamp is your Active Pokémon, each of Machamp’s attacks does 60 more damage to the Active Pokémon and any damage done to Machamp by your opponent’s Pokémon is increased by 60 ."
            delayedA {
            }
          }
          move "Strong-Willed", {
            text "20 damage. During your opponent’s next turn, if Machamp would be Knocked Out by damage from an attack, flip a coin. If heads, Machamp is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Machamp. Machamp LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_LV_X_99:
        return evolution (this, from:"Raichu", hp:HP110, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          pokeBody "Link Lightning", {
            text "Once during your turn, when you put Raichu LV. onto Raichu and use Voltage Shoot, you may use another attack of Raichu afterward. This power can’t be used if Raichu is affected by a Special Condition."
            delayedA {
            }
          }
          move "Voltage Shoot", {
            text "Energy cards from your hand and choose 1 of your opponent’s Pokémon. This attack does 80 to that Pokémon."
            energyCost L, L, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Raichu. Raichu LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REGIGIGAS_LV_X_100:
        return evolution (this, from:"Regigigas", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness F
          pokePower "Sacrifice", {
            text "Once during your turn , you may choose 1 of your Pokémon and that Pokémon is Knocked Out. Then, search your discard pile for up to 2 basic Energy cards, attach them to Regigigas, and remove 8 damage counters from Regigigas. This power can’t be used if Regigigas is affected by a Special Condition."
            actionA {
            }
          }
          move "Giga Blaster", {
            text "100 damage. Discard the top card from your opponent’s deck. Then, choose 1 card from your opponent’s hand without looking and discard it. Regigigas can’t use Giga Blaster during your next turn."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Regigigas. Regigigas LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHARMANDER_101:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ember", {
            text "30 damage. Energy card attached to Charmander in order to use this attack."
            energyCost R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHARMELEON_102:
        return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W
          move "Slash", {
            text "30 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flamethrower", {
            text "50 damage. Energy card attached to Charmeleon in order to use this attack."
            energyCost R, R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHARIZARD_103:
        return evolution (this, from:"Charmeleon", hp:HP120, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS30
          pokeBody "Energy Burn", {
            text "As often as you like during your turn , you may turn all Energy attached to Charizard into Energy for the rest of the turn."
            delayedA {
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFLOON_SH1:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS10
          resistance C, MINUS20
          pokeBody "Unburden", {
            text "If Drifloon has a Pokémon Tool card attached to it, Drifloon’s Retreat Cost is more."
            delayedA {
            }
          }
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Big Explosion", {
            text "50 damage. Drifloon does 50 damage to itself."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSKULL_SH2:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "", {
            text "Put damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ram", {
            text "10 damage. "
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Night Bind", {
            text "20 damage. Flip a coin. If heads, your opponent can’t attach any Energy cards from his or her hand to the Active Pokémon during his or her next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VOLTORB_SH3:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Fastball", {
            text "Choose 1 of your opponent’s Pokémon. Flip a coin. If heads, this attack does 20 damage to that Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Charge Beam", {
            text "10 damage. Energy card and attach it to Voltorb."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      default:
        return null;
    }
  }

}
