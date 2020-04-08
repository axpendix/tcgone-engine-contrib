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
public enum GreatEncounters implements LogicCardInfo {

  BLAZIKEN_1 ("Blaziken", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  CRESSELIA_2 ("Cresselia", 2, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DARKRAI_3 ("Darkrai", 3, Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
  DARKRAI_4 ("Darkrai", 4, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  PACHIRISU_5 ("Pachirisu", 5, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  PORYGON_Z_6 ("Porygon-Z", 6, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  ROTOM_7 ("Rotom", 7, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SCEPTILE_8 ("Sceptile", 8, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SWAMPERT_9 ("Swampert", 9, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  TANGROWTH_10 ("Tangrowth", 10, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TOGEKISS_11 ("Togekiss", 11, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  ALTARIA_12 ("Altaria", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BEEDRILL_13 ("Beedrill", 13, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BUTTERFREE_14 ("Butterfree", 14, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CLAYDOL_15 ("Claydol", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DIALGA_16 ("Dialga", 16, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  EXPLOUD_17 ("Exploud", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  HOUNDOOM_18 ("Houndoom", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  HYPNO_19 ("Hypno", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KINGLER_20 ("Kingler", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  LAPRAS_21 ("Lapras", 21, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  LATIAS_22 ("Latias", 22, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  LATIOS_23 ("Latios", 23, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MAWILE_24 ("Mawile", 24, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  MILOTIC_25 ("Milotic", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PALKIA_26 ("Palkia", 26, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PRIMEAPE_27 ("Primeape", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SLOWKING_28 ("Slowking", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UNOWN_H_29 ("Unown H", 29, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  WAILORD_30 ("Wailord", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WEEZING_31 ("Weezing", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  WIGGLYTUFF_32 ("Wigglytuff", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ARBOK_33 ("Arbok", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CACTURNE_34 ("Cacturne", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  COMBUSKEN_35 ("Combusken", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DELIBIRD_36 ("Delibird", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  FLOATZEL_37 ("Floatzel", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOREBYSS_38 ("Gorebyss", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GRANBULL_39 ("Granbull", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GROVYLE_40 ("Grovyle", 40, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HARIYAMA_41 ("Hariyama", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HUNTAIL_42 ("Huntail", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  LINOONE_43 ("Linoone", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LOUDRED_44 ("Loudred", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MAGCARGO_45 ("Magcargo", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MARSHTOMP_46 ("Marshtomp", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  METAPOD_47 ("Metapod", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PELIPPER_48 ("Pelipper", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PORYGON2_49 ("Porygon2", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PURUGLY_50 ("Purugly", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  RELICANTH_51 ("Relicanth", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  SEVIPER_52 ("Seviper", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKARMORY_53 ("Skarmory", 53, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  SLOWBRO_54 ("Slowbro", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TOGETIC_55 ("Togetic", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  UNOWN_F_56 ("Unown F", 56, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_G_57 ("Unown G", 57, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  WAILMER_58 ("Wailmer", 58, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  ZANGOOSE_59 ("Zangoose", 59, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  BALTOY_60 ("Baltoy", 60, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BUIZEL_61 ("Buizel", 61, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CACNEA_62 ("Cacnea", 62, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CATERPIE_63 ("Caterpie", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CLAMPERL_64 ("Clamperl", 64, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  DROWZEE_65 ("Drowzee", 65, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EKANS_66 ("Ekans", 66, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  FEEBAS_67 ("Feebas", 67, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GLAMEOW_68 ("Glameow", 68, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HOUNDOUR_69 ("Houndour", 69, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  IGGLYBUFF_70 ("Igglybuff", 70, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ILLUMISE_71 ("Illumise", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  JIGGLYPUFF_72 ("Jigglypuff", 72, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  KAKUNA_73 ("Kakuna", 73, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KOFFING_74 ("Koffing", 74, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  KRABBY_75 ("Krabby", 75, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  LUNATONE_76 ("Lunatone", 76, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUVDISC_77 ("Luvdisc", 77, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAKUHITA_78 ("Makuhita", 78, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MANKEY_79 ("Mankey", 79, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MUDKIP_80 ("Mudkip", 80, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PORYGON_81 ("Porygon", 81, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SLOWPOKE_82 ("Slowpoke", 82, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLUGMA_83 ("Slugma", 83, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SNUBBULL_84 ("Snubbull", 84, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SOLROCK_85 ("Solrock", 85, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SWABLU_86 ("Swablu", 86, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TANGELA_87 ("Tangela", 87, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TOGEPI_88 ("Togepi", 88, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TORCHIC_89 ("Torchic", 89, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TREECKO_90 ("Treecko", 90, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  UNOWN_L_91 ("Unown L", 91, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VOLBEAT_92 ("Volbeat", 92, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WEEDLE_93 ("Weedle", 93, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WHISMUR_94 ("Whismur", 94, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  WINGULL_95 ("Wingull", 95, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ZIGZAGOON_96 ("Zigzagoon", 96, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  AMULET_COIN_97 ("Amulet Coin", 97, Rarity.UNCOMMON, [TRAINER]),
  FELICITY_S_DRAWING_98 ("Felicity's Drawing", 98, Rarity.UNCOMMON, [TRAINER]),
  LEFTOVERS_99 ("Leftovers", 99, Rarity.UNCOMMON, [TRAINER]),
  MOONLIGHT_STADIUM_100 ("Moonlight Stadium", 100, Rarity.UNCOMMON, [TRAINER]),
  PREMIER_BALL_101 ("Premier Ball", 101, Rarity.UNCOMMON, [TRAINER]),
  RARE_CANDY_102 ("Rare Candy", 102, Rarity.UNCOMMON, [TRAINER]),
  CRESSELIA_LV_X_103 ("Cresselia LV.X", 103, Rarity.ULTRARARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARKRAI_LV_X_104 ("Darkrai LV.X", 104, Rarity.ULTRARARE, [LEVEL_UP, EVOLUTION, POKEMON, _DARKNESS_]),
  DIALGA_LV_X_105 ("Dialga LV.X", 105, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _METAL_]),
  PALKIA_LV_X_106 ("Palkia LV.X", 106, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  GreatEncounters(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.GREAT_ENCOUNTERS;
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
      case BLAZIKEN_1:
        return evolution (this, from:"Combusken", hp:HP130, type:FIRE, retreatCost:1) {
          weakness W, PLUS30
          move "Fire Dance", {
            text "30 damage. Energy card and attach it to 1 of your Pokémon."
            energyCost C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flame Kick", {
            text "Energy attached to Blaziken. This attack does 80 damage to 1 of your opponent’s Pokémon."
            energyCost R, R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRESSELIA_2:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Moon Twinkle", {
            text "10 damage. If there is any Stadium card in play, remove 2 damage counters from Cresselia."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Lunar Dance", {
            text "50 damage. You may discard 2 Energy attached to Cresselia. If you do, remove all damage counters from 1 of your Benched Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DARKRAI_3:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Reach Over", {
            text "Search your deck for an Energy card, show it to your opponenet, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Darkness Pursuit", {
            text "50 damage. If the Defending Pokémon is Cresselia, this attack’s base damage is 100."
            energyCost D, D, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DARKRAI_4:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Darkness Roar", {
            text "10 damage. You may have your opponent switch the Defending Pokémon with 1 or his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sleep Hole", {
            text "40+ damage. If the Defending Pokémon is Asleep, this attack does 40 damage plus 40 more damage. If the Defending Pokémon is not Asleep, that Pokémon is now Asleep."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PACHIRISU_5:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Call for Family", {
            text "Search you deck for up to 3 Basic Pokémon and put them onto your Bench. Shuffle you deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Smash Short", {
            text "10+ damage. If the Defending Pokémon has a Pokémon Tool card attached to it, this attack does 10 damage plus 20 more damage. Discard that Pokémon Tool card, loo, at your opponent’s hand and discard any Pokémon Tool cards of the same name you find there."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PORYGON_Z_6:
        return evolution (this, from:"Porygon 2", hp:HP110, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS30
          pokePower "Conversion", {
            text "Once during your turn , you may discard a basic Energy card from your hand. Porygon-Z is the same type as that Energy Card until the end of your turn. This power can’t be used if Porygon-Z is affected by a Special Condition."
            actionA {
            }
          }
          move "Tri Attack", {
            text "40× damage. Flip 3 coins. This attack does 40 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ROTOM_7:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Astonish", {
            text "20 damage. Choose 1 card from you opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Telebeam", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage and the Defending Pokémon is now Paralyzed."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCEPTILE_8:
        return evolution (this, from:"Grovyle", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokeBody "Wild Growth", {
            text "Each basic Energy card attached to your Pokémon provides Energy instead. You can’t use more than 1 Wild Growth Poké-Body each turn."
            delayedA {
            }
          }
          move "Leaf Blade", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip { damage 20 }
            }
          }

        };
      case SWAMPERT_9:
        return evolution (this, from:"Marshtomp", hp:HP130, type:WATER, retreatCost:2) {
          weakness G, PLUS30
          pokePower "Wash Out", {
            text "As often as you like during your turn , you may move a or Energy attached to 1 of your Benched Pokémon to your Active Pokémon. This power can’t be used if Swampert is affected by a Special Condition."
            actionA {
            }
          }
          move "Hammer Arm", {
            text "80 damage. Discard the top card from your opponent’s deck."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TANGROWTH_10:
        return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Power Whip", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage for each basic Energy card attached to Tangrowth to that Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Stick and Absorb", {
            text "60 damage. Remove 3 damage counters from Tangrowth. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOGEKISS_11:
        return evolution (this, from:"Togetic", hp:HP120, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS30
          resistance F, MINUS20
          pokePower "Serene Grace", {
            text "Once during your turn, when you play Togekiss from your hand to evolve 1 of your Pokémon, you may look at the top 10 cards of your deck, choose as many basic Energy cards as you like, and attach them to your Pokémon in any way you like. Put the other cards back on your deck. Shuffle your deck afterward."
            actionA {
            }
          }
          move "Air Scroll", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage. If tails, remove 3 damage counters from Togekiss."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ALTARIA_12:
        return evolution (this, from:"Swablu", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Dragonbreath", {
            text "40 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Cotton Cloud", {
            text "60 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BEEDRILL_13:
        return evolution (this, from:"Kakuna", hp:HP110, type:GRASS, retreatCost:0) {
          weakness R, PLUS30
          move "Band Attack", {
            text "30× damage. Does 30 damage times the number of Beedrill you have in play."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Twineedle", {
            text "50× damage. Flip 2 coins. This attack does 50 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BUTTERFREE_14:
        return evolution (this, from:"Metapod", hp:HP120, type:GRASS, retreatCost:0) {
          weakness R, PLUS30
          move "Parallel Drain", {
            text "30 damage. After your attack, remove from 1 of your Pokémon the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dozing Scales", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Poisoned."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CLAYDOL_15:
        return evolution (this, from:"Baltoy", hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS20
          pokePower "Cosmic Power", {
            text "Once during your turn , you may choose up to 2 cards from your hand and put them on the bottom of your deck in any order. If you do, draw cards until you have 6 cards in you hand. This power can’t be used if Claydol is affected by a Special Condition."
            actionA {
            }
          }
          move "Spinning Attack", {
            text "40 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_16:
        return basic (this, hp:HP090, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Time Bellow", {
            text "10 damage. Draw a Card."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flash Cannon", {
            text "40 damage. You may return all Energy cards attached to Dialga to your hand. If you do, remove the highest Stage Evolution card from the Defending Pokémon and shuffle that card into your opponent’s deck."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EXPLOUD_17:
        return evolution (this, from:"Loudred", hp:HP130, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS30
          move "Ambient Noise", {
            text "If the second coin is tails, your opponent can’t play any Trainer, Supporter, or Stadium cards from his or her hand during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hyper Voice", {
            text "70 damage. "
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HOUNDOOM_18:
        return evolution (this, from:"Houndour", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness W, PLUS20
          resistance P, MINUS20
          move "Dark Fang", {
            text "20 damage. Choose 1 card from you opponent’s hand without looking and discard it."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Black Fire", {
            text "40+ damage. Energy, this attack does 40 damage plus 30 more damage."
            energyCost R, C, R, D, F, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HYPNO_19:
        return evolution (this, from:"Drowzee", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Dream Catcher", {
            text "If the defending Pokémon is Asleep, move all damage counters from Hypno to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hypnoblast", {
            text "60 damage. The Defending Pokémon is now Asleep."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KINGLER_20:
        return evolution (this, from:"Krabby", hp:HP090, type:WATER, retreatCost:3) {
          weakness L, PLUS20
          move "Crabhammer", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Scissor Blow", {
            text "80 damage. If the Defending Pokémon would be be Knocked Out by this attack, Kingler does 30 damage to itself."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LAPRAS_21:
        return basic (this, hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Carry In", {
            text "Search your deck for a Pokémon Tool Card, a Supporter card, and a basic Energy card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wave Splash", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LATIAS_22:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Miraculous Light", {
            text "10 damage. Remove 2 damage counters and all Special Conditions from Latias."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mist Ball", {
            text "80 damage. Energy attached to Latias."
            energyCost R, W, C, R, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LATIOS_23:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Energy Draw", {
            text "10 damage. Flip a coin. If heads, search your deck for a basic Energy card and attach it to Latios. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Luster Purge", {
            text "120 damage. Discard 3 Energy attached to Latios."
            energyCost G, L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAWILE_24:
        return basic (this, hp:HP070, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Pick Out", {
            text "Choose 1 face-down Prize card (yours or your opponent’s and put it face up. If that card is a Support card, use the effect of that card as the effect of this attack. (That card remains face up for the rest of the game.)"
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Jaw Bite", {
            text "20 damage. , that attack does 20 more damage."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MILOTIC_25:
        return evolution (this, from:"Feebas", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          pokeBody "Marvel Scale", {
            text "Prevent all effects of attacks, including damage, done to Milotic by your opponent’s Pokémon LV.."
            delayedA {
            }
          }
          move "Twister", {
            text "50 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_26:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Spacial Rend", {
            text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Transback", {
            text "40 damage. You may flip a coin. If heads, discard all energy attached to Palkia and put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck aftward."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PRIMEAPE_27:
        return evolution (this, from:"Mankey", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Anger Point", {
            text "If Primeape has any damage counters on it, Primeape’s attacks do 40 more damage to the Active Pokémon ."
            delayedA {
            }
          }
          move "Whump", {
            text "50 damage. Primeape is now Confused. Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWKING_28:
        return evolution (this, from:"Slowpoke", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          pokePower "Trump Card", {
            text "Once during your turn , if any of your Pokémon were Knocked Out during your opponent’s last turn, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward. This power can’t be used if Slowking is affected by a Special Condition."
            actionA {
            }
          }
          move "Psych Up", {
            text "30 damage. During your next turn, Slowking’s Psych Up attack’s base damage is 60."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_H_29:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "HEAL", {
            text "Once during your turn , if you have Unown H, Unown E, Unown A, and Unown L on you Bench you may remove all Special Conditions from 1 of your Active Pokémon."
            actionA {
            }
          }
          move "Hidden Power", {
            text "30 damage. Discard a card from your hand. (If you can’t discard a card from you hand, this attack does nothing.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WAILORD_30:
        return evolution (this, from:"Wailmer", hp:HP200, type:WATER, retreatCost:4) {
          weakness L
          pokeBody "Sleeping Pulse", {
            text "As long as Wailord remains Asleep between turns, remove 1 damage counter from Wailord."
            delayedA {
            }
          }
          move "Sink Deep", {
            text "60 damage. If Wailord has any damage counters on it, Wailord is now Asleep."
            energyCost W, W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WEEZING_31:
        return evolution (this, from:"Koffing", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          pokeBody "Toxic Virus", {
            text "At any time between turns, each player puts 1 more damage counter on his or her Poisoned Pokémon."
            delayedA {
            }
          }
          move "Offensive Gas", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WIGGLYTUFF_32:
        return evolution (this, from:"Jigglypuff", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokePower "Good Night Melody", {
            text "Once during your turn , you may use this power. Each Active Pokémon (both your and your opponent’s is now Asleep. This power can’t be use if Wigglytuff is affected by a Special Condition."
            actionA {
            }
          }
          move "Ballon Attack", {
            text "40+ damage. If Igglybuff is anywhere under Wigglytuff, this attack does 40 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ARBOK_33:
        return evolution (this, from:"Ekans", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Deadly Poison", {
            text "10+ damage. If the Defending Pokémon is Poisoned, this attack does 10 damage plus 40 more damage. If the Defending Pokémon is not Poisoned, that Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wrap", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CACTURNE_34:
        return evolution (this, from:"Cacnea", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Pin Missile", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Needle Arm", {
            text "50+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBUSKEN_35:
        return evolution (this, from:"Torchic", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Bulk Up", {
            text "30 damage. ."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Kick", {
            text "50× damage. Flip 2 coins. This attack does 50 damage times the number of heads."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DELIBIRD_36:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Present", {
            text "Flip a coin. If heads search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ice Ball", {
            text "20 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FLOATZEL_37:
        return evolution (this, from:"Buizel", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Floatzel during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Aqua Jet", {
            text "60 damage. Flip a coin. If heads, this attack does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GOREBYSS_38:
        return evolution (this, from:"Clamperl", hp:HP080, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          move "Sweet Temptation", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. This attack does 10 damage to the new Defending Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psychic Snap", {
            text "30+ damage. Energy attached to it, this attack does 30 damage plus 20 more damage and Defending Pokémon is now Confused."
            energyCost W, C, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GRANBULL_39:
        return evolution (this, from:"Snubbull", hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Daunt", {
            text "30 damage. ."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rage", {
            text "40+ damage. Does 40 damage plus 10 more damage for each damage counter on Granbull."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GROVYLE_40:
        return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Greenness", {
            text "Energy cards, show them to your opponent, and them into your hand. Shuffle your deck afterward."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Breath", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HARIYAMA_41:
        return evolution (this, from:"Makuhita", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness P, PLUS30
          move "Palm Strike", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 40 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spirited Throw", {
            text "50 damage. If Hariyama has fewer remaining HP than the Defending Pokémon, this attack’s base damage is 80."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HUNTAIL_42:
        return evolution (this, from:"Clamperl", hp:HP090, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Scary Face", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Threaten and Drop", {
            text "30+ damage. Energy attached to it, this attack does 30 damage plus 20 more damage and discard a Special Energy card, if any, attached to the Defending Pokémon."
            energyCost W, C, D
            attackRequirement {}
            onAttack {
              damage 30
              // TODO
              discardDefendingSpecialEnergy(delegate)
            }
          }

        };
      case LINOONE_43:
        return evolution (this, from:"Zigzagoon", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS20
          move "Switcheroo", {
            text "Move a Pokémon Tool card attached to 1 of your opponent’s Pokémon to another of your opponent’s Pokémon (excluding Pokémon that already has a Pokémon Tool attached to it). (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Overrun", {
            text "30 damage. Does 30 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LOUDRED_44:
        return evolution (this, from:"Whismur", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Bass Control", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Stomp", {
            text "40+ damage. Flip a coin. If heads this attack does 40 damage plus 20 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGCARGO_45:
        return evolution (this, from:"Slugma", hp:HP090, type:FIRE, retreatCost:3) {
          weakness W, PLUS20
          pokeBody "Magma Armor", {
            text "Magcargo can’t be Asleep or Paralyzed."
            delayedA {
            }
          }
          move "Lava Plume", {
            text "60 damage. You may discard the top card of your deck. If you do the Defending Pokémon is now Burned."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MARSHTOMP_46:
        return evolution (this, from:"Mudkip", hp:HP090, type:WATER, retreatCost:2) {
          weakness G, PLUS20
          move "Pound", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Muddy Bomb", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon and 10 damage to each of your opponent’s other Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case METAPOD_47:
        return evolution (this, from:"Caterpie", hp:HP070, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          pokePower "Emerge", {
            text "Once during your turn , if Metapod is your Active Pokémon, you may flip a coin. If heads, search your deck for a card that evolves from Metapod and put it onto Metapod. (This counts as evolving Metapod.) Shuffle your deck afterward. This power can’t be used if Metapod is affected by a Special Condition."
            actionA {
            }
          }
          move "Ram", {
            text "30 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PELIPPER_48:
        return evolution (this, from:"Wingull", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Guzzle", {
            text "Energy cards from you hand and attach them to Pelipper. Remove 2 damage counter for each Energy card attached in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Jet Return", {
            text "30× damage. Does 30 times the number of Energy cards attached to Pelipper. Then, put all Energy cards attached to Pelipper on top of your deck. Shuffle your deck afterward."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PORYGON2_49:
        return evolution (this, from:"Porygon", hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          pokePower "Download", {
            text "Once during your turn , you may discard a Supporter card from your hand and use the effect of that card as the effect of this power. This power can’t be used if Porygon2 is affected by a Special Condition."
            actionA {
            }
          }
          move "Speed Attack", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PURUGLY_50:
        return evolution (this, from:"Glameow", hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Swagger", {
            text "20 damage. Flip a coin. If heads discard an Energy attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Swipes", {
            text "40× damage. Flip 3 coins. This attack does 40 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RELICANTH_51:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Primal Calling", {
            text "Search your deck for up to 3 Trainer Cards that have Fossil in their names, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sleep Swirl", {
            text "30 damage. Both Relicanth and the Defending Pokémon are now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SEVIPER_52:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Tail Blade", {
            text "20 damage. Flip a coin. If heads, your opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Tail", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage and the Defending Pokémon is now Poisoned."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKARMORY_53:
        return basic (this, hp:HP070, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Air Crash", {
            text "20 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Steel Wing", {
            text "40 damage. ."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWBRO_54:
        return evolution (this, from:"Slowpoke", hp:HP080, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Amnesia", {
            text "20 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              amnesia delegate
            }
          }
          move "Zen Headbutt", {
            text "60 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOGETIC_55:
        return evolution (this, from:"Togepi", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Speed Dive", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sweet Kiss", {
            text "50 damage. Your opponent may draw a card."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_F_56:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "FAKE", {
            text "Once during your turn , if Unown F is on your Bench, you may use this power. Put a coin next to your Active Pokémon without showing your opponent and cover it with you hand. Your opponent guesses if the coin is heads or tails. If he or she is wrong, draw a card."
            actionA {
            }
          }
          move "Hidden Power", {
            text "10 damage. You may flip a coin. If tails, this attack does nothing. If heads, this attack’s base damage is 30."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_G_57:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "GUARD", {
            text "Once during your turn , if Unown G is on your Bench, you may discard all cards attached to Unown G and attach Unown G to 1 of your Pokémon as a Pokémon Tool card. As long as Unown G is attached to a Pokémon, prevent all effects of attacks, excluding damage, done to that Pokémon."
            actionA {
            }
          }
          move "Hidden Power", {
            text "50 damage. If Unown G has any damage counters on it, this attack’s base damage is 10."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WAILMER_58:
        return basic (this, hp:HP090, type:WATER, retreatCost:3) {
          weakness L, PLUS20
          move "Tsunami", {
            text "10 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Bench Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ram", {
            text "30 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZANGOOSE_59:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Slash", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Cutting Claw", {
            text "40+ damage. If you opponent has Seviper in play, this attack does 40 damage plus 50 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BALTOY_60:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          move "Psychic Balance", {
            text "If you have less cards in your hand than your opponent, draw cards until you have the same number of cards as your opponent. (If you have more or the same number of cards in your hand as your opponent, this attack does nothing.)"
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spin Turn", {
            text "20 damage. Switch Baltoy with 1 of your Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BUIZEL_61:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Headbutt", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surf", {
            text "30 damage. "
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CACNEA_62:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Sting", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CATERPIE_63:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Pupate", {
            text "Once during your turn , if Caterpie is your Active Pokémon, you may flip a coin, if heads search your deck for a card that evolves from Caterpie and put it onto Caterpie. (This counts as evolving Caterpie.) Shuffle your deck afterward. This power can’t be used if Caterpie is affected by a Special Condition."
            actionA {
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CLAMPERL_64:
        return basic (this, hp:HP040, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Clamp", {
            text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sparkling Pearl", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DROWZEE_65:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EKANS_66:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Shed Skin", {
            text "Remove 2 damage counters from Ekans."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Fang", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply POISONED }
            }
          }

        };
      case FEEBAS_67:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Splash", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fast Evolution", {
            text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLAMEOW_68:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Captivate", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slash", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HOUNDOUR_69:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Ember", {
            text "20 damage. Energy attached to Houndour."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Smash Kick", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case IGGLYBUFF_70:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Jigglypuff from your hand onto Igglybuff (this counts as evolving Igglybuff) and remove all damage counters from Igglybuff."
            actionA {
              assert my.hand.findAll{it.name.contains("Jigglypuff")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Jigglypuff") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Inquire", {
            text "Draw a card. If you didn’t play any Supporter card from your hand during this turn, draw 2 more cards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ILLUMISE_71:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokePower "Scent Conduct", {
            text "Once during your turn , you may flip a coin. If heads, search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward. This power can’t be used if Illumise is affected by a Special Condition."
            actionA {
            }
          }
          move "Firefly Scent", {
            text "30 damage. If the Defending Pokémon has any Poké-Bodies, that Pokémon is now Asleep."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case JIGGLYPUFF_72:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Hypnotic Gaze", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Expand", {
            text "20 damage. ."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KAKUNA_73:
        return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Stiffen", {
            text "."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spit Poison", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KOFFING_74:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Smogscreen", {
            text "10 damage. The Defending Pokémon is now Poisoned. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KRABBY_75:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Irongrip", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Guillotine", {
            text "30 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUNATONE_76:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Gravity Change", {
            text "Once during your turn , you may discard a card from your hand. Then, if you have Solrock in play, draw a card. This power can’t be used if Lunatone is affected by a Special Condition."
            actionA {
            }
          }
          move "Knock Over", {
            text "20 damage. You may discard any Stadium card in play."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUVDISC_77:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Rendezvous", {
            text "Reveal the top card of your deck and put it into your hand. If that card is a Pokémon, draw 2 cards."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Synchro Dance", {
            text "10+ damage. If Luvdisc and the Defending Pokémon have the same amount of Energy attached to them, this attack does 10 damage plus 20 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAKUHITA_78:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS10
          move "Punch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Arm Thrust", {
            text "40 damage. Flip a coin. If tails, this attack does nothing. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANKEY_79:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Light Punch", {
            text "10 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Mankey."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MUDKIP_80:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness G, PLUS10
          move "Mud Spatter", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Endeavor", {
            text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PORYGON_81:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Calculate", {
            text "Look at the top 3 cards of your deck and put them back on top of your deck in any order."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sharpen", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWPOKE_82:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Rest", {
            text "Remove all Special Conditions and 3 damage counters from Slowpoke. Slowpoke is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tumble Over", {
            text "20 damage. Slowpoke can’t attack during your next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLUGMA_83:
        return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
          weakness W, PLUS10
          move "Steady Firebreathing", {
            text "10 damage. "
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SNUBBULL_84:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite", {
            text "30 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SOLROCK_85:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          pokeBody "Sunlight", {
            text "If you have Lunatone in play, damage done to your opponent’s Pokémon by your or Pokémon isn’t affected by resistance."
            delayedA {
            }
          }
          move "Sol Charge", {
            text "20 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWABLU_86:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Super Speed", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Swablu during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shoot Through", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TANGELA_87:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          move "Vine Invite", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Grass Knot", {
            text "20+ damage. Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the the Retreat Cost)."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOGEPI_88:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Find a Friend", {
            text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into you hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORCHIC_89:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Peck", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Singe", {
            text "The Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TREECKO_90:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Energy Ball", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Treecko but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Absorb", {
            text "20 damage. Remove 1 damage counter from Treecko."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_L_91:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokeBody "LINK", {
            text "Unown L can use any attack from any Unown in play ."
            delayedA {
            }
          }
          move "Hidden Power", {
            text "Search either player’s discard pile for up to any 2 cards, show them to your opponent, and put them on top of that player’s deck in any order you like."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VOLBEAT_92:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokePower "Light Conduct", {
            text "Once during your turn (before your attack,) if you have Illumise in play, you may search your discard pile for a Support card, show it to your opponent, and put it on top of your deck. This power can’t be used if Volbeat is affected by a Special Condition."
            actionA {
            }
          }
          move "Firefly Light", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }

        };
      case WEEDLE_93:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "String Shot", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WHISMUR_94:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Mumble", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Uproar", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WINGULL_95:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Water Drip", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wing Attack", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZIGZAGOON_96:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Pull Out", {
            text "Search your discard pile for any 1 card, show it to your opponent, and put it on top of your deck."
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
      case AMULET_COIN_97:
        return basicTrainer (this) {
          text "Attach Amulet Coin to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nIf the Pokémon Amulet Coin is attached to is your Active Pokémon at the end of your turn, draw a card."
          onPlay {
          }
          playRequirement{
          }
        };
      case FELICITY_S_DRAWING_98:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDiscard up to 2 cards from your hand. If you discard 1 card, draw 3 cards. If you discard 2 cards, draw 4 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case LEFTOVERS_99:
        return basicTrainer (this) {
          text "Attach Leftovers to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nIf the Pokémon Leftovers is attached to is your Active Pokémon at the end of your turn, remove 1 damage counter from the Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case MOONLIGHT_STADIUM_100:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nThe Retreat Cost for each [P] and [D] Pokémon (both yours and your opponent’s) is 0."
          onPlay {
          }
          playRequirement{
          }
        };
      case PREMIER_BALL_101:
        return basicTrainer (this) {
          text "Search your deck or your discard pile for a Pokémon LV.X, show it to your opponent, and put it into your hand. If you search your deck, shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case RARE_CANDY_102:
        return basicTrainer (this) {
          text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolves from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case CRESSELIA_LV_X_103:
        return evolution (this, from:"Cresselia", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Full Moon Dance", {
            text "Once during your turn , you may move 1 damage counter from either player’s Pokémon to another Pokémon . This power can’t be used if Cresselia is affected by a Special Condition."
            actionA {
            }
          }
          move "Moon Skip", {
            text "40 damage. If the Defending Pokémon is Knocked Out by this attack, take 1 more Prize card."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Cresselia. Cresselia LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DARKRAI_LV_X_104:
        return evolution (this, from:"Darkrai", hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokeBody "Dark Shadow", {
            text "Each basic Energy card attached to your Pokémon now has the effect “If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon .” You can’t use more than 1 Dark Shadow Poké-Body each turn."
            delayedA {
            }
          }
          move "Endless Darkness", {
            text "40 damage. The Defending Pokémon is now Asleep. Flip 2 coins instead of 1 between turns. If either of this is tails, the Defending Pokémon is still Asleep. If both of them are tails, the Defending Pokémon is Knocked Out."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Darkrai. Darkrai LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_LV_X_105:
        return evolution (this, from:"Dialga", hp:HP110, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokePower "Time Skip", {
            text "Once during your turn , you may have your opponent flip 2 coins. If both of them are heads, your turn ends. If both of them are tails, after your opponent draws a card at the beginning of his or her next turn, his or her turn ends. This power can’t be used if Dialga is affected by a Special Condition."
            actionA {
            }
          }
          move "Metal Flash", {
            text "80 damage. During your next turn, Dialga can’t use Metal Flash."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Dialga. Dialga LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_LV_X_106:
        return evolution (this, from:"Palkia", hp:HP120, type:WATER, retreatCost:3) {
          weakness L
          pokePower "Restructure", {
            text "Once during your turn , you may have your opponent switch 1 of your Active Pokémon with 1 of your Bench Pokémon. Then, you switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. This power can’t be used if Palkia is affected by a Special Condition."
            actionA {
            }
          }
          move "Hydro Reflect", {
            text "60 damage. You may move all Energy cards attached to Palkia to your Benched Pokémon in any way you like (Ignore this effect if you don’t have any Benched Pokémon.)"
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Palkia. Palkia LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      default:
        return null;
    }
  }

}
