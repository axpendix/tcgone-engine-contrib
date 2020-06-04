package tcgwars.logic.impl.gen4;

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
import static tcgwars.logic.card.Weakness.*

import java.util.*;
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
 * @author axpendix@hotmail.com
 */
public enum MysteriousTreasures implements LogicCardInfo {

  AGGRON_1 ("Aggron", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  ALAKAZAM_2 ("Alakazam", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  AMBIPOM_3 ("Ambipom", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  AZELF_4 ("Azelf", 4, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  BLISSEY_5 ("Blissey", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BRONZONG_6 ("Bronzong", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  CELEBI_7 ("Celebi", 7, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  FERALIGATR_8 ("Feraligatr", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  GARCHOMP_9 ("Garchomp", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  HONCHKROW_10 ("Honchkrow", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  LUMINEON_11 ("Lumineon", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGMORTAR_12 ("Magmortar", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MEGANIUM_13 ("Meganium", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  MESPRIT_14 ("Mesprit", 14, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  RAICHU_15 ("Raichu", 15, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  TYPHLOSION_16 ("Typhlosion", 16, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  TYRANITAR_17 ("Tyranitar", 17, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  UXIE_18 ("Uxie", 18, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  ABOMASNOW_19 ("Abomasnow", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ARIADOS_20 ("Ariados", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BASTIODON_21 ("Bastiodon", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  CHIMECHO_22 ("Chimecho", 22, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  CROBAT_23 ("Crobat", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EXEGGUTOR_24 ("Exeggutor", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GLALIE_25 ("Glalie", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GYARADOS_26 ("Gyarados", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KRICKETUNE_27 ("Kricketune", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MANECTRIC_28 ("Manectric", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MANTINE_29 ("Mantine", 29, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MR__MIME_30 ("Mr. Mime", 30, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN_31 ("Nidoqueen", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  NINETALES_32 ("Ninetales", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RAMPARDOS_33 ("Rampardos", 33, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  SLAKING_34 ("Slaking", 34, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SUDOWOODO_35 ("Sudowoodo", 35, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  TOXICROAK_36 ("Toxicroak", 36, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UNOWN_I_37 ("Unown I", 37, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  URSARING_38 ("Ursaring", 38, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WALREIN_39 ("Walrein", 39, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  WHISCASH_40 ("Whiscash", 40, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BAYLEEF_41 ("Bayleef", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CHINGLING_42 ("Chingling", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CRANIDOS_43 ("Cranidos", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CROCONAW_44 ("Croconaw", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DEWGONG_45 ("Dewgong", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DODRIO_46 ("Dodrio", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUNSPARCE_47 ("Dunsparce", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GABITE_48 ("Gabite", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GIRAFARIG_49 ("Girafarig", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GOLBAT_50 ("Golbat", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GRAVELER_51 ("Graveler", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HAPPINY_52 ("Happiny", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  LAIRON_53 ("Lairon", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGMAR_54 ("Magmar", 54, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MASQUERAIN_55 ("Masquerain", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINA_56 ("Nidorina", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  OCTILLERY_57 ("Octillery", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PARASECT_58 ("Parasect", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PUPITAR_59 ("Pupitar", 59, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  QUILAVA_60 ("Quilava", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SANDSLASH_61 ("Sandslash", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEALEO_62 ("Sealeo", 62, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SHIELDON_63 ("Shieldon", 63, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TROPIUS_64 ("Tropius", 64, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  UNOWN_E_65 ("Unown E", 65, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_M_66 ("Unown M", 66, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_T_67 ("Unown T", 67, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VIGOROTH_68 ("Vigoroth", 68, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ABRA_69 ("Abra", 69, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AIPOM_70 ("Aipom", 70, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ARON_71 ("Aron", 71, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BARBOACH_72 ("Barboach", 72, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BIDOOF_73 ("Bidoof", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_74 ("Bronzor", 74, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BUIZEL_75 ("Buizel", 75, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CHANSEY_76 ("Chansey", 76, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIKORITA_77 ("Chikorita", 77, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CROAGUNK_78 ("Croagunk", 78, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CYNDAQUIL_79 ("Cyndaquil", 79, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  DODUO_80 ("Doduo", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_81 ("Electrike", 81, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  EXEGGCUTE_82 ("Exeggcute", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  FINNEON_83 ("Finneon", 83, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GEODUDE_84 ("Geodude", 84, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GIBLE_85 ("Gible", 85, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  KRICKETOT_86 ("Kricketot", 86, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LARVITAR_87 ("Larvitar", 87, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGBY_88 ("Magby", 88, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MAGIKARP_89 ("Magikarp", 89, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MURKROW_90 ("Murkrow", 90, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  NIDORAN_FEMALE_91 ("Nidoran Female", 91, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PARAS_92 ("Paras", 92, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PICHU_93 ("Pichu", 93, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIKACHU_94 ("Pikachu", 94, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  REMORAID_95 ("Remoraid", 95, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SANDSHREW_96 ("Sandshrew", 96, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SEEL_97 ("Seel", 97, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHINX_98 ("Shinx", 98, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SLAKOTH_99 ("Slakoth", 99, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SNORUNT_100 ("Snorunt", 100, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SNOVER_101 ("Snover", 101, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SPHEAL_102 ("Spheal", 102, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SPINARAK_103 ("Spinarak", 103, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SURSKIT_104 ("Surskit", 104, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TEDDIURSA_105 ("Teddiursa", 105, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TOTODILE_106 ("Totodile", 106, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VULPIX_107 ("Vulpix", 107, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  ZUBAT_108 ("Zubat", 108, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BEBE_S_SEARCH_109 ("Bebe's Search", 109, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DUSK_BALL_110 ("Dusk Ball", 110, Rarity.UNCOMMON, [TRAINER, ITEM]),
  FOSSIL_EXCAVATOR_111 ("Fossil Excavator", 111, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LAKE_BOUNDARY_112 ("Lake Boundary", 112, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  NIGHT_MAINTENANCE_113 ("Night Maintenance", 113, Rarity.UNCOMMON, [TRAINER, ITEM]),
  QUICK_BALL_114 ("Quick Ball", 114, Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_GALACTIC_S_WAGER_115 ("Team Galactic's Wager", 115, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ARMOR_FOSSIL_116 ("Armor Fossil", 116, Rarity.COMMON, [TRAINER, ITEM]),
  SKULL_FOSSIL_117 ("Skull Fossil", 117, Rarity.COMMON, [TRAINER, ITEM]),
  MULTI_ENERGY_118 ("Multi Energy", 118, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  DARKNESS_ENERGY_119 ("Darkness Energy", 119, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_120 ("Metal Energy", 120, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ELECTIVIRE_LV_X_121 ("Electivire LV.X", 121, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _LIGHTNING_]),
  LUCARIO_LV_X_122 ("Lucario LV.X", 122, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGMORTAR_LV_X_123 ("Magmortar LV.X", 123, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIRE_]),
  TIME_SPACE_DISTORTION_124 ("Time-Space Distortion", 124, Rarity.HOLORARE, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  MysteriousTreasures(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.MYSTERIOUS_TREASURES;
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
      case AGGRON_1:
        return evolution (this, from:"Lairon", hp:HP130, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          move "Heap Up", {
            text "40+ damage. Special Energy cards there this attack does 40 damage plus 30 more damage. Put all of those Energy cards on top of your deck. Shuffle your deck afterward."
            energyCost C, C, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hard Metal", {
            text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Aggron does 40 damage to itself."
            energyCost M, M, M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ALAKAZAM_2:
        return evolution (this, from:"Kadabra", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS30
          pokePower "Power Cancel", {
            text "Once during your opponent’s turn, when your opponent’s Pokémon uses any Poké-Power, you may discard 2 cards from your hand and prevent all effects of that Poké-Power. (This counts as that Pokémon using its Poké-Power.) This power can’t be used if Alakazam is affected by a Special Condition."
            actionA {
            }
          }
          move "Psychic Guard", {
            text "50 damage. ."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AMBIPOM_3:
        return evolution (this, from:"Aipom", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Tail Influence", {
            text "30 damage. Your opponent flips a coin until he or she gets heads. For each tails, remove an Energy card attached to the Defending Pokémon and put it on the bottom of your opponent’s deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Charity Tail", {
            text "80 damage. Before Ambipom does damage, your opponent may discard 2 cards from his or her hand. If he or she does, this attack’s base damage is 10 instead of 80."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AZELF_4:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Downer Material", {
            text "If you have Uxie and Mesprit in play, the attack cost of each of your opponent’s Basic Pokémon’s attacks is more. You can’t use more than 1 Downer Material Poké-Body each turn."
            delayedA {
            }
          }
          move "Bind Pulse", {
            text "10 damage. During your opponent’s next turn, your opponent can’t attach any Special Energy cards from his or her hand to any of his or her Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BLISSEY_5:
        return evolution (this, from:"Chansey", hp:HP130, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS30
          pokePower "Kind Egg", {
            text "Once during your turn , if Happiny is anywhere under Blissey, you may choose a number of cards in your hand up to the amount of Energy attached to Blissey and put those cards on top of your deck. Shuffle your deck afterward. Then, draw that many cards. This power can’t be used if Blissey is affected by a Special Condition."
            actionA {
            }
          }
          move "Happy Chance", {
            text "20+ damage. Does 20 damage plus 10 for each Energy attached to Blissey. Before doing damage, you may search your discard pile for a basic Energy card and attach it to Blissey."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BRONZONG_6:
        return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokePower "Miracle Oracle", {
            text "Once during your turn , you may draw a card. Then, discard a card from your hand. If you discard an Energy card, draw 1 more card. This power can’t be used if Bronzong is affected by a Special Condition."
            actionA {
            }
          }
          move "Shady Stamp", {
            text "50 damage. The Defending Pokémon is now Confused."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CELEBI_7:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Sprouting", {
            text "Energy card and attach it to Celebi. Shuffle your deck afterward."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Leaf Tornado", {
            text "30 damage. Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            energyCost G, G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FERALIGATR_8:
        return evolution (this, from:"Croconaw", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Energy Cyclone", {
            text "20× damage. Choose as many Energy cards from your hand as you like and show them to your opponent. This attack does 20 damage times the number of Energy cards you chose. Put those Energy cards on top of your deck. Shuffle your deck afterward."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Breaking Tail", {
            text "60 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GARCHOMP_9:
        return evolution (this, from:"Gabite", hp:HP130, type:COLORLESS, retreatCost:0) {
          weakness C, PLUS30
          pokeBody "Rainbow Scale", {
            text "If an Active Pokémon has Weakness to any of the types of Energy attached to Garchomp, Garchomp’s attacks do 40 more damage to that Pokémon . Rainbow Scale Poké-Body can’t be used if Garchomp has any Special Energy cards attached to it."
            delayedA {
            }
          }
          move "Dragon Fang", {
            text "70 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HONCHKROW_10:
        return evolution (this, from:"Murkrow", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Dark Genes", {
            text "As long as Honchkrow has the Energy necessary to use its attacks, each of your Murkrow can use Honchkrow’s attack as its own without the Energy necessary to use that attack."
            delayedA {
            }
          }
          move "Dark Wing Flaps", {
            text "50 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUMINEON_11:
        return evolution (this, from:"Finneon", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokePower "Lure Ring", {
            text "Once during your turn , if Lumineon is your Active Pokémon, you may choose 1 of your opponent’s Benched Pokémon that has a maximum HP of 100 or more and switch it with 1 of the Defending Pokémon. This power can’t be used if Lumineon is affected by a Special Condition."
            actionA {
            }
          }
          move "Reverse Stream", {
            text "30+ damage. Energy attached to Lumineon to your hand."
            energyCost C, C, W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGMORTAR_12:
        return evolution (this, from:"Magmar", hp:HP100, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          move "Smoke Bomb", {
            text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flame Drum", {
            text "80 damage. If Magby isn’t anywhere under Magmortar, discard 2 Energy cards from your hand. (If you can’t discard 2 Energy cards from your hand, this attack does nothing.)"
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MEGANIUM_13:
        return evolution (this, from:"Bayleef", hp:HP130, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Ultra Powder", {
            text "20 damage. Flip 3 coins. If the first coin is heads, the Defending Pokémon is now Poisoned. If the second coin is heads, the Defending Pokémon is now Burned. If the third coin is heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fire Counterattack", {
            text "60+ damage. Pokémon in play, this attack does 60 damage plus 30 more damage."
            energyCost G, G, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MESPRIT_14:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Upper Material", {
            text "If you have Uxie and Azelf in play, the Retreat Cost for each Uxie, Mesprit, and Azelf is 0."
            delayedA {
            }
          }
          move "Teleportation Burst", {
            text "30 damage. You may switch Mesprit with 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_15:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Electromagnetic Induction", {
            text "Energy cards and attach them to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Explosive Thunder", {
            text "30× damage. Energy cards you discarded."
            energyCost L, C, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TYPHLOSION_16:
        return evolution (this, from:"Quilava", hp:HP110, type:FIRE, retreatCost:2) {
          weakness W
          pokePower "Firestarter", {
            text "Once during your turn , you may attach a Energy card from your discard pile to one of your benched Pokémon. This power can’t be used if Typhlosion is affected by a Special Condition."
            actionA {
            }
          }
          move "Evaporating Heat", {
            text "60 damage. Energy attached to the Defending Pokémon."
            energyCost R, R, C, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TYRANITAR_17:
        return evolution (this, from:"Pupitar", hp:HP140, type:DARKNESS, retreatCost:4) {
          weakness F, PLUS30
          resistance P, MINUS20
          move "Payback", {
            text "40+ damage. If your opponent has only 1 Prize card left, this attack does 40 damage plus 40 more damage and discard the top 3 cards from your opponent’s deck."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ground Burn", {
            text "80+ damage. Each player discards the top card of his or her deck. This attack does 80 damage plus 20 more damage for each Energy card discarded that way."
            energyCost F, F, D, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UXIE_18:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Memory Out", {
            text "Once during your opponent’s turn, if Uxie is damaged by an opponent’s attack (even if Uxie is Knocked Out), you may use this power. The Attacking Pokémon can’t use that attack during your opponent’s next turn."
            actionA {
            }
          }
          move "Mind Off", {
            text "10+ damage. If you have Mesprit and Azelf in play, this attack does 10 damage plus 20 more damage and the Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ABOMASNOW_19:
        return evolution (this, from:"Snover", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          pokeBody "Glacier Snow", {
            text "If Abomasnow is your Active Pokémon and is damaged by an opponent’s attack (even if Abomasnow is Knocked Out), the Attacking Pokémon is now Asleep."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({it.to==self && it.dmg.value})) {
                  bc "Glacier Snow"
                  apply ASLEEP, (ef.attacker as PokemonCardSet)
                }
              }
              after SWITCH, self, {unregister()}
            }
          }
          move "Heavy Blizzard", {
            text "60 damage. Flip a coin. If heads, put 1 damage counter on each of your opponent’s Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ARIADOS_20:
        return evolution (this, from:"Spinarak", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Sticky", {
            text "The Retreat Cost for each player’s Pokémon (excluding Ariados) is more."
            delayedA {
            }
          }
          move "Offensive Needle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BASTIODON_21:
        return evolution (this, from:"Shieldon", hp:HP130, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          pokeBody "Protective Wall", {
            text "Prevent all damage done to your Benched Pokémon by your opponent’s attacks."
            delayedA {
            }
          }
          move "Anger Revenge", {
            text "60 damage. If Bastiodon was damaged by an attack during your opponent’s last turn, this attack does 40 damage to 1 of your opponent’s Benched Pokémon."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHIMECHO_22:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Call in", {
            text "Draw a card. If Chingling is somewhere under Chimecho, draw 2 more cards."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Strange Bell", {
            text "20 damage. If the Defending Pokémon is a Basic Pokémon, that Pokémon is Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CROBAT_23:
        return evolution (this, from:"Golbat", hp:HP100, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS30
          resistance F, MINUS20
          pokePower "Evolutionary Toxic", {
            text "Once during your turn, when you play Crobat from your hand to evolve 1 of your Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns."
            actionA {
            }
          }
          move "Strike and Fade", {
            text "Flip a coin. If tails, shuffle Crobat and all cards attached to it back into your deck."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EXEGGUTOR_24:
        return evolution (this, from:"Exeggcute", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "String Bomb", {
            text "30× damage. Flip a coin for each basic Energy card attached to Exeggutor and to the Defending Pokémon. This attack does 30 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Nutritional Support", {
            text "Energy cards and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLALIE_25:
        return evolution (this, from:"Snorunt", hp:HP090, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          pokeBody "Craggy Face", {
            text "As long as Glalie is your Active Pokémon, any damage done by attacks from your opponent’s Stage 2 Evolved Pokémon is reduced by 20 ."
            delayedA {
            }
          }
          move "Intimidation Pebble", {
            text "50 damage. Flip a coin. If heads, your opponent can’t play any Trainer cards or Supporter cards from his or her hand during your opponent’s next turn."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GYARADOS_26:
        return evolution (this, from:"Magikarp", hp:HP120, type:WATER, retreatCost:3) {
          weakness L, PLUS30
          resistance F, MINUS20
          pokeBody "Dragon DNA", {
            text "Gyarados can use any attack from its Basic Pokémon. If Gyarados uses any attack from its Basic Pokémon, that attack does 30 more damage to the Defending Pokémon ."
            delayedA {
            }
          }
          move "Enrage", {
            text "80 damage. Flip a coin until you get tails. For each heads, choose 1 card from your opponent’s hand without looking and discard it. If the first coin is tails, Gyarados is now Confused."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KRICKETUNE_27:
        return evolution (this, from:"Kricketot", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Sore Performance", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Concerto", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Kricketot and each Kricketune you have in play."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANECTRIC_28:
        return evolution (this, from:"Electrike", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Lightning Twister", {
            text "20× damage. Does 20 damage times the number of basic Energy cards attached to Manectric."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Chain Lightning", {
            text "70 damage. Does 20 damage to each of your opponent’s Benched Pokémon that is the same type as the Defending Pokémon."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANTINE_29:
        return basic (this, hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Jumbo Fin", {
            text "If Mantyke is anywhere under Mantine, the Retreat Cost for each of your Pokémon is less."
            delayedA {
            }
          }
          move "Giant Wave", {
            text "Mantine can’t use Giant Wave during your next turn."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MR__MIME_30:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Airy Wall", {
            text "If your opponent’s Pokémon that has 2 or less Energy cards attached to it attacks Mr. Mime, prevent all damage done to Mr. Mime from that attack. If Mime Jr. is anywhere under Mr. Mime, prevent all effects of that attack, including damage, done to Mr. Mime."
            delayedA {
            }
          }
          move "Trick Play", {
            text "Put a coin next to your Active Pokémon without showing your opponent and cover it with your hand. Your opponent guesses if the coin is heads or tails. If he or she is wrong, this attack does 50 damage to the Defending Pokémon. If he or she is right, Mr. Mime does 20 damage to itself, and this attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NIDOQUEEN_31:
        return evolution (this, from:"Nidorina", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS30
          resistance L, MINUS20
          pokeBody "Mother Phernomone", {
            text "The attack cost of your Nidoran Female, Nidorina, Nidoran Male, Nidorino, and Nidoking’s attacks is less."
            delayedA {
            }
          }
          move "Give Aid", {
            text "90 damage. If you have the same number of or less Benched Pokémon than your opponent, this attack’s base damage is 50 instead of 90."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NINETALES_32:
        return evolution (this, from:"Vulpix", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          pokePower "Color Shift", {
            text "Once during your turn , you may choose 1 of your opponent’s Pokémon. Ninetales is the same type as that Pokémon (all if that Pokémon is more than 1 type) until the end of your turn. This power can’t be used if Ninetales is affected by a Special Condition."
            actionA {
            }
          }
          move "Fire Blast", {
            text "60 damage. Energy card attached to Ninetales."
            energyCost R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAMPARDOS_33:
        return evolution (this, from:"Cranidos", hp:HP130, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS30
          move "Assurance", {
            text "30 damage. As long as the Defending Pokémon’s remaining HP is 60 or less, this attack’s base damage is 60 instead of 30."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hasty Headbutt", {
            text "100 damage. Rampardos does 20 damage to itself. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLAKING_34:
        return evolution (this, from:"Vigoroth", hp:HP140, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS30
          pokePower "Energetic Impulse", {
            text "Once during your turn , if Slaking is your Active Pokémon, you may flip a coin. If heads, Slaking’s Lazy Blow attack’s base damage is 130 during this turn. If tails, Slaking can’t attack or retreat during this turn. (If Slaking is no longer your Active Pokémon, this effect ends.)"
            actionA {
            }
          }
          move "Lazy Blow", {
            text "50 damage. "
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SUDOWOODO_35:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W
          move "Sidestep", {
            text "20 damage. If Bonsly is anywhere under Sudowoodo, flip a coin. If heads, prevent all effects of an attack, including damage, done to Sudowoodo during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Persuade", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon. The new Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOXICROAK_36:
        return evolution (this, from:"Croagunk", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Poison Sacs", {
            text "Your opponent can’t remove the Special Condition Poisoned by evolving or devolving his or her Poisoned Pokémon. (This also includes putting a Pokémon Level-Up card onto the Poisoned Pokémon.)"
            delayedA {
            }
          }
          move "Knuckle Claws", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_I_37:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "ITEM", {
            text ":"
            actionA {
            }
          }
          move "", {
            text "Once during your turn , if you have Unown I, Unown T, Unown E, and Unown M on your Bench, you may search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. You can’t use more than 1 ITEM Poké-Power each turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hidden Power", {
            text "Energy and doesn’t have any effect other than providing Energy. Put that card face up at the end of your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case URSARING_38:
        return evolution (this, from:"Teddiursa", hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Bad Temper", {
            text "30 damage. ."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Defensive Claw", {
            text "60+ damage. If Teddiursa is on your Bench, this attack does 60 damage plus 20 more damage. If Teddiursa is on your Bench and has any damage counters on it, this attack does 60 damage plus 40 more damage and remove all damage counters from that Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WALREIN_39:
        return evolution (this, from:"Sealeo", hp:HP130, type:WATER, retreatCost:3) {
          weakness M, PLUS30
          pokePower "Freeze-up", {
            text "Once during your turn, when you play Walrein from your hand to evolve 1 of your Pokémon, you may flip 2 coins. If both are heads, discard the Defending Pokémon and all cards attached to it. (This doesn’t count as a Knocked Out Pokémon.)"
            actionA {
            }
          }
          move "Ice Bind", {
            text "70 damage. If your opponent doesn’t discard a card from his or her hand, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WHISCASH_40:
        return evolution (this, from:"Barboach", hp:HP090, type:WATER, retreatCost:3) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Fury", {
            text "20× damage. Does 20 damage times the number of damage counters on Whiscash."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Magnitude", {
            text "60 damage. ."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BAYLEEF_41:
        return evolution (this, from:"Chikorita", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Evolution Impulse", {
            text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Leaf Boomerang", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHINGLING_42:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chimecho from your hand onto Chingling (this counts as evolving Chingling) and remove all damage counters from Chingling."
            actionA {
              assert my.hand.findAll{it.name.contains("Chimecho")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Chimecho") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Inviting Bell", {
            text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRANIDOS_43:
        return evolution (this, from:"Skull Fossil", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Headbutt", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Steamroll", {
            text "30 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CROCONAW_44:
        return evolution (this, from:"Totodile", hp:HP080, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          pokePower "Evolutionary Vitality", {
            text "Once during your turn, when you play Croconaw from your hand to evolve 1 of your Pokémon, you may look at the top 5 cards of your deck. Choose all Energy cards you find there, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
            actionA {
            }
          }
          move "Hover Over", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DEWGONG_45:
        return evolution (this, from:"Seel", hp:HP090, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          pokeBody "Cold Fat", {
            text "As long as Dewgong is Asleep, any damage done to Dewgong by attacks is reduced by 40 ."
            delayedA {
            }
          }
          move "Collapse", {
            text "60 damage. "
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Dewgong is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DODRIO_46:
        return evolution (this, from:"Doduo", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Fury Attack", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Triple Pick", {
            text "Choose 3 of your opponent’s Evolved Pokémon. This attack does 30 damage to each of them."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              multiSelect(opp.all, 3).each{
                targeted(it){
                  damage 10, it
                }
              }
            }
          }
        };
      case DUNSPARCE_47:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Snake Hook", {
            text "Draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Bite and Run", {
            text "10 damage. Switch Dunsparce with 1 of your Benched Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GABITE_48:
        return evolution (this, from:"Gible", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          move "Gather Up", {
            text "Search your discard pile for up to 2 Energy cards, show them to your opponent, and put them into your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Marvelous Shine", {
            text "Flip a coin. If heads put 4 damage counters on 1 of your opponent’s Pokémon. If tails, remove 4 damage counters from 1 of your Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRAFARIG_49:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness P, PLUS20
          move "Crane Kick", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psybeam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GOLBAT_50:
        return evolution (this, from:"Zubat", hp:HP070, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS20
          resistance F, MINUS20
          move "Pulse Search", {
            text "30 damage. Look at your opponent’s hand."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GRAVELER_51:
        return evolution (this, from:"Geodude", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Rock Cannon", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rock Slide", {
            text "40 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
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
      case HAPPINY_52:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chansey from your hand onto Happiny (this counts as evolving Happiny) and remove all damage counters from Happiny."
            actionA {
              assert my.hand.findAll{it.name.contains("Chansey")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Chansey") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Lively", {
            text "Remove 2 damage counters from 1 of your Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LAIRON_53:
        return evolution (this, from:"Aron", hp:HP080, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Mend", {
            text "Energy card and attach it to Lairon. If you do, remove 2 damage counters from Lairon."
            energyCost M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Confront", {
            text "50 damage. "
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGMAR_54:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Flare", {
            text "20 damage. "
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flamethrower", {
            text "50 damage. Discard an Energy attached to Magmar."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MASQUERAIN_55:
        return evolution (this, from:"Surskit", hp:HP070, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Centrifugal Force", {
            text "20× damage. Does 20 damage times the number of Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Swirling Ripple", {
            text "30+ damage. Pokémon in play, this attack does 30 damage plus 30 more damage and the Defending Pokémon is now Confused."
            energyCost G, G, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NIDORINA_56:
        return evolution (this, from:"Nidoran Female", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Rescue", {
            text "Search your discard pile for up to 2 Pokémon, show them to your opponent, and put them into your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Scratch", {
            text "30 damage. "
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case OCTILLERY_57:
        return evolution (this, from:"Remoraid", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Crash Bomber", {
            text "30+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 30 damage plus 30 more damage. Then, discard a Special Energy card attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              // TODO
              discardDefendingSpecialEnergy(delegate)
            }
          }
          move "Aqua Liner", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 40 damage to that Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PARASECT_58:
        return evolution (this, from:"Paras", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Wild Spores", {
            text "20 damage. If Parasect evolved from Paras during this turn, this attack does 40 damage and the Defending Pokémon is now Asleep and Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Extend Fungus", {
            text "60 damage. "
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PUPITAR_59:
        return evolution (this, from:"Larvitar", hp:HP070, type:FIGHTING, retreatCost:0) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Pressurized Gas", {
            text "Does 10 damage to each of your opponent’s Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rocket Tackle", {
            text "50 damage. Pupitar does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Pupitar by attacks during your opponent’s next turn."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case QUILAVA_60:
        return evolution (this, from:"Cydnaquil", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Fireworks", {
            text "40 damage. Energy attached to Quilava."
            energyCost R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SANDSLASH_61:
        return evolution (this, from:"Sandshrew", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Spike Armor", {
            text "During your opponent’s next turn, if Sandslash is damaged by an opponent’s attack (even if Sandslash is Knocked Out), put 4 damage counters on the Attacking Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Spike", {
            text "60 damage. If the Defending Pokémon already has any damage counters on it, that Pokémon is now Poisoned."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SEALEO_62:
        return evolution (this, from:"Spheal", hp:HP080, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          move "Ice Rider", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHIELDON_63:
        return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance M, MINUS20
          move "Hard Face", {
            text "."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shield Attack", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 20 }
            }
          }

        };
      case TROPIUS_64:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "", {
            text "Remove damage. "
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              whirlwind()
            }
          }

        };
      case UNOWN_E_65:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "EQUIP", {
            text "Once during your turn , if Unown E is on your Bench, you may discard all cards attached to Unown E and attach Unown E to 1 of your Pokémon as a Pokémon Tool card. As long as Unown E is attached to a Pokémon, that Pokémon gets +10 HP."
            actionA {
            }
          }
          move "Hidden Power", {
            text "During your opponent’s next turn, whenever your opponent flips a coin, treat it as tails."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_M_66:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "MAGNET", {
            text "Once during your turn , if Unown M is your Active Pokémon, you may flip a coin. If heads, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. This power can’t be used if Unown M is affected by a Special Condition."
            actionA {
            }
          }
          move "Hidden Power", {
            text "Flip a coin. If heads, this attack does 30 damage. If tails, this attack does 30 damage to 1 of your Pokémon, and this attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_T_67:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "THROW", {
            text "Once during your turn , if Unown T is your Active Pokémon, you may discard a card from your hand. Then, flip a coin. If heads, put 2 damage counters on 1 of your opponent’s Benched Pokémon. This power can’t be used if Unown T is affected by a Special Condition."
            actionA {
            }
          }
          move "Hidden Power", {
            text "Look at your opponent’s hand and choose 1 card, then have your opponent shuffle that card into his or her deck. Then, show your opponent your hand and he or she chooses 1 card. Shuffle that card into your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VIGOROTH_68:
        return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Wake-up Punch", {
            text "10 damage. If Vigoroth evolved from Slakoth during this turn and Slakoth was Asleep, this attack’s base damage is 60 instead of 10."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              //TODO: Check for the extra damage.
              if (false) {
                damage 50
              }
            }
          }
          move "Fury Swipes", {
            text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip 3, {damage 30}
            }
          }

        };
      case ABRA_69:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Play Search", {
            text "Look at the top 5 cards of your deck, choose 1 of them, and put it into your hand. Put the other 4 cards back on top of your deck. Shuffle your deck afterward."
            energyCost P
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.subList(0,5).select(min:0,"Choose a card to put in your hand").moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Ultra Evolution", {
            text "Search your deck for Alakazam and put it on Abra (this counts as evolving Abra). Shuffle your deck afterward."
            energyCost P, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def tar = my.deck.search("Searching for an Alakazam", {it.cardTypes.is(EVOLUTION) && it.name == "Alakazam"})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }

        };
      case AIPOM_70:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Tail Whap", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Throw Off", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Before doing damage, discard all Pokémon Tool cards attached to that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              def pcs = opp.all.select("Select the Pokémon to attack.")
              pcs.cards.filterByType(POKEMON_TOOL).discard()
              damage 20, pcs
            }
          }

        };
      case ARON_71:
        return basic (this, hp:HP050, type:METAL, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Steel Tackle", {
            text "30 damage. Aron does 10 damage to itself."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case BARBOACH_72:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Mud Spit", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {}
            onAttack {
              flip{ opp.all.each{ damage 10, it } }
            }
          }

        };
      case BIDOOF_73:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          //Wacan Berry: Any damage done to Bidoof by attacks from [L] Pokémon is reduced by 20 (after applying Weakness and Resistance).
          customAbility {
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner != self.owner && (ef.attacker.types.contains(L))) {
                  bg.dm().each{
                    if(it.to == self && it.notNoEffect && it.dmg.value) {
                      bc "Wacan Berry -20"
                      it.dmg -= hp(20)
                    }
                  }
                }
              }
            }
          }
          move "Tackle", {
            text "30 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case BRONZOR_74:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Dull Light", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }

        };
      case BUIZEL_75:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          //Chesto Berry: If Buizel is Asleep, remove the Special Condition Asleep from Buizel at the end of each player’s turn.
          customAbility {
            delayedA {
              before BEGIN_TURN,{
                if(self.isSPC(ASLEEP)) {
                  bc "Chesto Berry activates"
                  clearSpecialCondition(self, ATTACK, [ASLEEP])
                }
              }
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }

        };
      case CHANSEY_76:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Scrunch", {
            text "Flip a coin. If heads, prevent all damage done to Chansey by attacks during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
            flip { preventAllEffectsNextTurn() }
            }
          }
          move "Double-edge", {
            text "80 damage. Chansey does 60 damage to itself."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 80
              damage 60, self
            }
          }

        };
      case CHIKORITA_77:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sleep Scent", {
            text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip { apply ASLEEP }
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }

        };
      case CROAGUNK_78:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Ghastly Sound", {
            text "Flip a coin. If heads, your opponent can’t play any Supporter cards from his or her hand during his or her next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { opponentCantPlaySupporterNextTurn(delegate) }
            }
          }
          move "Finger Poké", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply POISONED }
            }
          }

        };
      case CYNDAQUIL_79:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Tackle", {
            text "10 damage."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Live Coal", {
            text "20 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case DODUO_80:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Double Stab", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }
          move "Accelerating Stab", {
            text "30 damage. Doduo can’t use Accelerating Stab during your next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              cantUseAttack thisMove, self
            }
          }

        };
      case ELECTRIKE_81:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Electromagnetic Jam", {
            text "10 damage. Flip a coin. If heads, your opponent can’t attach any Energy cards from his or her hand to the Active Pokémon during his or her next turn."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                flip{
                  delayed{
                    before ATTACH_ENERGY, self.owner.opposite.pbg.active, {
                      if(ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite && ef.resolvedTarget.active) {
                        wcu "Electromagnetic Jam prevents you from attaching Energy to ${ef.resolvedTarget}."
                        prevent()
                      }
                    }
                    unregisterAfter 2
                    after SWITCH, defending, {unregister()}
                    after EVOLVE, defending, {unregister()}
                  }
                }
              }
            }
          }

        };
      case EXEGGCUTE_82:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Direct-hit Bomb", {
            text "Flip a coin for each Energy attached to Exeggcute. Choose 1 of your opponent’s Pokémon. For each heads, this attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            attackRequirement {}
            onAttack {
              def totalDmg = 0
              flip self.cards.energyCount(C), {
                totalDmg += 10
              }
              if (totalDmg) damage totalDmg, opp.all.select()
            }
          }

        };
      case FINNEON_83:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Elegant Swim", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Finneon during your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { preventAllEffectsNextTurn() }
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
      case GEODUDE_84:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Stone Throw", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              multiSelect(opp.bench, 2).each{
                targeted(it){
                  damage 10, it
                }
              }
            }
          }

        };
      case GIBLE_85:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          move "Push Down", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              whirlwind()
            }
          }

        };
      case KRICKETOT_86:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Sling", {
            text "10 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case LARVITAR_87:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Mountain Bite", {
            text "10+ damage. You may discard the top card of your deck. If you do, this attack does 10 damage plus 10 more damage and Larvitar is now Asleep."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              if (my.deck && confirm("Discard the top card of your deck? If you do, this attack does 10 damage plus 10 more damage and Larvitar is now Asleep.")){
                my.deck.subList(0,1).discard()
                damage 10
                apply ASLEEP, self
              }
            }
          }
          move "Hammer In", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MAGBY_88:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Magmar from your hand onto Magby (this counts as evolving Magby) and remove all damage counters from Magby."
            actionA {
              checkCanBabyEvolve("Magmar", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Magmar", self)
            }
          }
          move "Scorch", {
            text "Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip { apply BURNED }
            }
          }

        };
      case MAGIKARP_89:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Magikarp."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Dragon Rage", {
            text "60 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost W, W
            attackRequirement {}
            onAttack {
              //TODO: Modularize
              def doDamage = true
              flip 2, {}, {doDamage = false}
              if(doDamage) damage 60 else bc "$thisMove failed"
            }
          }

        };
      case MURKROW_90:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS10
          resistance L, MINUS20
          move "Swarm", {
            text "Search your deck for Murkrow and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily(name:"Murkrow",1,delegate)
          }
          move "Hide Crowd", {
            text "20 damage. Switch Murkrow with 1 of your Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              switchYourActive()
            }
          }

        };
      case NIDORAN_FEMALE_91:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Call for Family", {
            text "Search your deck for Nidoran ♂ or Nidoran ♀ and put it onto your Bench. Shuffle your deck afterward."
            energyCost C

            //TODO: Check this finding all Nidorans, male and female.
            callForFamily(name:"Nidoran",1,delegate)
          }
          move "Poison Sting", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply POISONED }
            }
          }

        };
      case PARAS_92:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Mushroom Tackle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case PICHU_93:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              checkCanBabyEvolve("Pikachu", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Pikachu", self)
            }
          }
          move "Chupi", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case PIKACHU_94:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Electro Recycle", {
            text "Once during your turn (before your attack), if Pichu is anywhere under Pikachu, you may search your discard pile for a [L] Energy card, show it to your opponent, and put it into your hand. This power can’t be used if Pikachu is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.getPokemonCards().findAll {it.name.contains("Pichu")} : "Pichu is not found under $self, you can't use this Poké-Power"
              assert my.discard.filterByEnergyType(L) : "There are no [L] Energy cards in your discard pile."
              powerUsed()
              my.discard.filterByEnergyType(L).select().moveTo(my.hand)
            }
          }
          move "BikaBika", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }

        };
      case REMORAID_95:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Sharpshooting", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select()
            }
          }
          move "Numbing Water", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case SANDSHREW_96:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Ram", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case SEEL_97:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          move "Freezing Headbutt", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply PARALYZED }
            }
          }

        };
      case SHINX_98:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          //Rawst Berry: If Shinx is Burned, remove the Special Condition Burned from Shinx at the end of each player’s turn.
          customAbility {
            delayedA {
              before BEGIN_TURN,{
                if(self.isSPC(BURNED)) {
                  bc "Rawst Berry activates"
                  clearSpecialCondition(self, ATTACK, [BURNED])
                }
              }
            }
          }
          move "Plasma", {
            text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Shinx."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                flip { attachEnergyFrom(type: L, my.discard, self) }
              }
            }
          }

        };
      case SLAKOTH_99:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Drowsy", {
            text "Both Slakoth and the Defending Pokémon are now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP, self
              apply ASLEEP
            }
          }

        };
      case SNORUNT_100:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness M, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Snowball", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost W
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case SNOVER_101:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          move "Curiosity", {
            text "Look at your opponent’s hand."
            energyCost ()
            attackRequirement {
              assert opp.hand : "Opponent has no cards in hand."}
            onAttack {
              opp.hand.showToMe("Opponent's hand")
            }
          }
          move "Snowball Fight", {
            text "30 damage. Flip a coin. If tails, Snover does 10 damage to itself."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {}, {damage 10, self}
            }
          }

        };
      case SPHEAL_102:
        return basic (this, hp:HP050, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          move "Rollout", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Willpower", {
            text "Flip a coin. If heads, during your next turn, Spheal’s Rollout attack’s base damage is 40."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { increasedBaseDamageNextTurn("Rollout",hp(30)) }
            }
          }

        };
      case SPINARAK_103:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Impound", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              cantRetreat defending
            }
          }
          move "Double Scratch", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads"
            energyCost G, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }

        };
      case SURSKIT_104:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Sleep Inducer", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. The new Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw opp.active, opp.bench.select()
              apply ASLEEP, opp.active
            }
          }

        };
      case TEDDIURSA_105:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Rest", {
            text "Remove all Special Conditions and 2 damage counters from Teddiursa. Teddiursa is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              clearSpecialCondition(self)
              heal 20, self
              apply ASLEEP, self
            }
          }
          move "Sweet Palm", {
            text "30 damage. Before doing damage, remove 1 damage counter from the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              heal 10, opp.active
              damage 30
            }
          }

        };
      case TOTODILE_106:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Bite", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Shining Fang", {
            text "10+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              if (defending.numberOfDamageCounters) damage 10
            }
          }

        };
      case VULPIX_107:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Fire Soul", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }

        };
      case ZUBAT_108:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              flipThenApplySC CONFUSED
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
      case BEBE_S_SEARCH_109:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose a card from your hand and put it on top of your deck. Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            my.hand.getExcludedList(thisCard).select(hidden: false, "Choose a card to put back into your deck").moveTo(hidden:true, my.deck)
            my.deck.search(count: 1, cardTypeFilter(POKEMON)).showToOpponent("Opponent's selected Pokémon.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) : "You don't have other cards in your hand"
          }
        };
      case DUSK_BALL_110:
        return itemCard (this) {
          text "Look at the 7 cards from the bottom of your deck. Choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. Put the remaining cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
            def deckSize = my.deck.size()
            deck.subList(Math.max(0, deckSize-7),deckSize).select(min:0,"Select a Pokémon card to put to hand",cardTypeFilter(POKEMON)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "There is no card remaining in your deck."
          }
        };
      case FOSSIL_EXCAVATOR_111:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck or discard pile for a Trainer card that has Fossil in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil. Show it to your opponent and put it into your hand. If you searched your deck, shuffle your deck afterward."
          onPlay {
            def choice = 1
            def chosenCard

            if(my.discard.any{isValidFossilCard(it)}){
              choice = choose([1,2],['Search your deck', 'Search your discard pile'], "Search your deck for a Trainer-Item card that has \"Fossil\" in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil, reveal it, and put it into your hand. Then, shuffle your deck.")
            }

            if (choice == 1){
              chosenCard = my.deck.search(count:1, "Search your deck for a Trainer-Item card that has \"Fossil\" in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil.", {isValidFossilCard(it)} )
            } else /*if (choice == 2)*/ {
              chosenCard = my.discard.findAll{isValidFossilCard(it)}.select()
            }

            if (chosenCard)
              chosenCard.showToOpponent("Chosen card").moveTo(my.hand)

            shuffleDeck()
          }
          playRequirement {
            assert ( my.deck.notEmpty || my.discard.any{isValidFossilCard(it)}) : "You have no cards in deck, and there are no cards in your discard pile that satisfy this supporter's requirements."
          }
        };
      case LAKE_BOUNDARY_112:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nApply Weakness for each Pokémon (both yours and your opponent’s) as ×2 instead."
          def eff
          onPlay {
            eff = getter (GET_WEAKNESSES) {h->
              h.object = h.object?.collect {
                def weakness = it.copy()
                weakness.feature = "X2"
                weakness
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case NIGHT_MAINTENANCE_113:
        return itemCard (this) {
          text "Search your discard pile for up to 3 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
            //TODO: "Shuffle [up to] x basic pokemon/energy from discard" could be modularized.
            //TODO: Test if min:1 is needed on the select
            def tar = my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)}
            def maxSel = Math.min(6,tar.size())
            tar.select(max: maxSel,"Choose up to $maxSel cards to shuffle into your deck").moveTo(my.deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)} : "There are no basic Pokémon or basic Energy cards in your discard pile"
          }
        };
      case QUICK_BALL_114:
        return itemCard (this) {
          text "Reveal cards from your deck until you reveal a Pokémon. Show that Pokémon to your opponent and put it into your hand. Shuffle the other revealed cards back into your deck. (If you don’t reveal a Pokémon, shuffle all the revealed cards back into your deck.)"
          onPlay {
              //TODO: Modularize
              def revealCard = new CardList();
              def ind = 0
              def curCard
              while(ind < my.deck.size()){
                curCard = my.deck.get(ind)
                ind+=1
                revealCard.add(curCard)
                if(curCard.cardTypes.is(POKEMON))
                  break
              }
              revealCard.showToMe("Drawn cards")
              revealCard.showToOpponent("Revealed cards")
              revealCard.clear()
              revealCard.add(curCard)
              revealCard.moveTo(my.hand)
              shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case TEAM_GALACTIC_S_WAGER_115:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player shuffles his or her hand into his or her deck, and you and your opponent play a game of \"Rock-Paper-Scissors.\" The player who wins draws up to 6 cards. The player who loses draws up to 3 cards. (You draw your cards first.)"
          onPlay {
              my.hand.getExcludedList(thisCard).moveTo(hidden:true,my.deck)
              opp.hand.moveTo(hidden:true,opp.deck)
              shuffleDeck()
              shuffleDeck(null, TargetPlayer.OPPONENT)

              def myMaxDraw = 3
              def oppMaxDraw = 3
              rockPaperScissors ({myMaxDraw = 6}, {oppMaxDraw = 6})
              //flip 1, {myMaxDraw = 6}, {oppMaxDraw = 6}

              draw choose(1..myMaxDraw,"How many cards would you like to draw?")
              draw (oppChoose(1..oppMaxDraw,"How many cards would you like to draw?"),TargetPlayer.OPPONENT)
          }
          playRequirement{
          }
        };
      case ARMOR_FOSSIL_116:
        return itemCard (this) {
          text "Play Armor Fossil as if it were a [C] Basic Pokémon. (Armor Fossil counts as a Trainer card as well, but if Armor Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Armor Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Armor Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\n" +
            "Whenever Armor Fossil would be damaged by your opponent’s attack, flip a coin until you get tails. For each heads, reduce that damage by 10."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(ARMOR_FOSSIL_116).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Armor Stone", {
                delayedA {
                  before APPLY_ATTACK_DAMAGES, {
                    if(ef.attacker.owner != self.owner) {
                      bg.dm().each{
                        if(it.to == self && it.notNoEffect && it.dmg.value) {
                          bc "$self - Armor Stone activated"
                          def reducedDmg = 0
                          flipUntilTails { reducedDmg += 10 }
                          if (reducedDmg) bc "Damage reduced by $reducedDmg"
                          it.dmg -= hp(reducedDmg)
                        }
                      }
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                onActivate{
                  delayed {
                    before RETREAT, self, {
                      if(self.topPokemonCard == thisCard){
                        wcu "Cannot retreat"
                        prevent()
                      }
                    }
                    before APPLY_SPECIAL_CONDITION, {
                      def pcs=e.getTarget(bg)
                      if(pcs==self){
                        bc "Armor Fossil is unaffected by Special Conditions"
                        prevent()
                      }
                    }
                  }
                  if (!eff) {
                    eff = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          eff = null
                        }
                      }
                    }
                  }
                  acl = action("Discard Armor Fossil", [TargetPlayer.SELF]) {
                    delayed {
                      before TAKE_PRIZE, {
                        if (ef.pcs==self) {
                          prevent()
                        }
                      }
                    }
                    new Knockout(self).run(bg)
                  }
                }
                onDeactivate {
                  acl.each{bg.gm().unregisterAction(it)}
                }
              }
            }
            pokemonCard.player = trainerCard.player
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            hand.remove(pokemonCard)
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case SKULL_FOSSIL_117:
        return itemCard (this) {
          text "Play Skull Fossil as if it were a [C] Basic Pokémon. (Skull Fossil counts as a Trainer card as well, but if Skull Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Skull Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Skull Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\n" +
            "During your opponent’s turn, if Skull Fossil would be Knocked Out by damage from an opponent’s attack, flip a coin until you get tails. For each heads, put 1 damage counter on the Attacking Pokémon."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(SKULL_FOSSIL_117).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Skull Stone", {
                delayedA{
                  before KNOCKOUT, self, {
                    if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                      bc "$self - Skull Stone activated"
                      if (self.owner.opposite.pbg.all) {
                        flipUntilTails { directDamage(10, self.owner.opposite.pbg.active, Source.SRC_ABILITY) }
                      }
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                onActivate{
                  delayed {
                    before RETREAT, self, {
                      if(self.topPokemonCard == thisCard){
                        wcu "Cannot retreat"
                        prevent()
                      }
                    }
                    before APPLY_SPECIAL_CONDITION, {
                      def pcs=e.getTarget(bg)
                      if(pcs==self){
                        bc "Skull Fossil is unaffected by Special Conditions"
                        prevent()
                      }
                    }
                  }
                  if (!eff) {
                    eff = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          eff = null
                        }
                      }
                    }
                  }
                  acl = action("Discard Skull Fossil", [TargetPlayer.SELF]) {
                    delayed {
                      before TAKE_PRIZE, {
                        if (ef.pcs==self) {
                          prevent()
                        }
                      }
                    }
                    new Knockout(self).run(bg)
                  }
                }
                onDeactivate {
                  acl.each{bg.gm().unregisterAction(it)}
                }
              }
            }
            pokemonCard.player = trainerCard.player
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            hand.remove(pokemonCard)
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case MULTI_ENERGY_118:
        return copy (Sandstorm.MULTI_ENERGY_93, this);
      case DARKNESS_ENERGY_119:
        //TODO: This version of "Darkness Energy (Special Energy)" shouldn't work on "Dark ____" cards, only on [D] Type Pokémon.
        return copy (RubySapphire.DARKNESS_ENERGY_93, this);
      case METAL_ENERGY_120:
        return copy (RubySapphire.METAL_ENERGY_94, this);
      case ELECTIVIRE_LV_X_121:
        return evolution (this, from:"Electivire", hp:HP120, type:LIGHTNING, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          pokeBody "Shocking Tail", {
            text "As long as Electivire is your Active Pokémon, whenever your opponent attaches an Energy card from his or her hand to 1 of his or her Pokémon, put 2 damage counters on that Pokémon."
            delayedA {
              after ATTACH_ENERGY, {
                if(self.active && ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite)
                  directDamage 20, ef.resolvedTarget
              }
            }
          }
          move "Pulse Barrier", {
            text "50 damage. Discard all of your opponent’s Pokémon Tool cards and Stadium cards in play. If you do, prevent all effects, including damage, done to Electivire during your opponent’s next turn."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 50
              def cardsDiscarded = 0
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player != self.owner){
                discard bg.stadiumInfoStruct.stadiumCard
                cardsDiscarded += 1
              }
              opp.all.findAll {it.cards.hasType(POKEMON_TOOL)}.each{
                it.cards.filterByType(POKEMON_TOOL).discard()
                cardsDiscarded += 1
              }
              if (cardsDiscarded) preventAllEffectsNextTurn()
            }
          }

        };
      case LUCARIO_LV_X_122:
        return evolution (this, from:"Lucario", hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness P
          pokePower "Stance", {
            text "Once during your turn (before your attack), when you put Lucario LV.X from your hand onto your Active Lucario, you may use this power. Prevent all effects of an attack, including damage, done to Lucario during your opponent’s next turn. (If Lucario is no longer your Active Pokémon, this effect ends.)"
            //Taken from BUS LUCARIO_71, but with switch & devolve removing the effect.
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm("Use Stance?")){
                powerUsed()
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect){
                        bc "Stance prevents all damage"
                        it.dmg=hp(0)
                      }
                    }
                  }
                  before null, self, Source.ATTACK, {
                    if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                      bc "Stance prevents effects"
                      prevent()
                    }
                  }
                  after ENERGY_SWITCH, {
                    def efs = (ef as EnergySwitch)
                    if(efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                      discard efs.card
                    }
                  }
                  unregisterAfter 2
                  after SWITCH, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                }
              }
            }
          }
          move "Close Combat", {
            text "80 damage. During your opponent’s next turn, any damage done to Lucario by attacks is increased by 30 (after applying Weakness and Resistance)."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 80
              //TODO: Modularize?
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.from.owner==self.owner.opposite && it.to==self && it.dmg.value && it.notNoEffect){
                      bc "Close Combat increases damage"
                      it.dmg+=hp(30)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE, self, {unregister()}
                after SWITCH, self, {unregister()}
              }
            }
          }

        };
      case MAGMORTAR_LV_X_123:
        return evolution (this, from:"Magmortar", hp:HP130, type:FIRE, retreatCost:3) {
          weakness W
          pokePower "Torrid Wave", {
            text "Once during your turn (before your attack), if Magmortar is your Active Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Burned. Put 3 damage counters instead of 2 on that Pokémon between turns. This power can’t be used if Magmortar is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your active Pokémon."
              powerUsed()
              def torridWaveRecipient = opp.active
              apply BURNED, torridWaveRecipient, SRC_ABILITY
              delayed {
                def eff
                register {
                  eff = getter (GET_BURN_DAMAGE) {h->
                      if (h.effect.target == torridWaveRecipient && h.effect.target.active) {
                          bc "Torrid Wave increases burn damage on $torridWaveRecipient to 30."
                          h.object += 1
                      }
                    }
                  }
                unregister {
                  eff.unregister()
                }
                //TODO: Remove if these are not needed.
                // after EVOLVE, torridWaveRecipient, {unregister()}
                // after SWITCH, torridWaveRecipient, {unregister()}
                after CLEAR_SPECIAL_CONDITION, torridWaveRecipient, {
                  if(ef.types.contains(BURNED)){
                    unregister()
                  }
                }
              }
            }
          }
          move "Flame Buster", {
            text "Discard 2 [R] Energy attached to Magmortar. Choose 1 of your opponent’s Pokémon. This attack does 100 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) During your next turn, Magmortar can’t use Flame Bluster."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              damage 100, opp.all.select()
              cantUseAttack(thisMove, self)
              afterDamage {
                discardSelfEnergy R,R
              }
            }
          }
        };
      case TIME_SPACE_DISTORTION_124:
        return itemCard (this) {
          text "Flip 3 coins. For each heads, search your discard pile for a Pokémon, show it to your opponent, and put it into your hand."
          onPlay {
            flip 3, {
              def tar = my.discard.filterByType(POKEMON)
              if (tar)
                tar.select("Put a Pokémon from your discard pile into your hand.").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON)
          }
        };
      default:
        return null;
    }
  }

}
