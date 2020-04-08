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
public enum Platinum implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  BLASTOISE_2 ("Blastoise", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  BLAZIKEN_3 ("Blaziken", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DELCATTY_4 ("Delcatty", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIALGA_5 ("Dialga", 5, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  DIALGA_6 ("Dialga", 6, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  DIALGA_G_7 ("Dialga G", 7, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  GARDEVOIR_8 ("Gardevoir", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GIRATINA_9 ("Giratina", 9, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  GIRATINA_10 ("Giratina", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  MANECTRIC_11 ("Manectric", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  PALKIA_G_12 ("Palkia G", 12, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  RAMPARDOS_13 ("Rampardos", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  SHAYMIN_14 ("Shaymin", 14, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SHAYMIN_15 ("Shaymin", 15, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SLAKING_16 ("Slaking", 16, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  WEAVILE_G_17 ("Weavile G", 17, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  ALTARIA_18 ("Altaria", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BANETTE_19 ("Banette", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  BASTIODON_20 ("Bastiodon", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  BEAUTIFLY_21 ("Beautifly", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BLISSEY_22 ("Blissey", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIALGA_23 ("Dialga", 23, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  DUGTRIO_24 ("Dugtrio", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DUSTOX_25 ("Dustox", 25, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_26 ("Empoleon", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  GIRATINA_27 ("Giratina", 27, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GIRATINA_28 ("Giratina", 28, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GOLDUCK_29 ("Golduck", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GYARADOS_G_30 ("Gyarados G", 30, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  INFERNAPE_31 ("Infernape", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  KRICKETUNE_32 ("Kricketune", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKILICKY_33 ("Lickilicky", 33, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LUDICOLO_34 ("Ludicolo", 34, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  LUVDISC_35 ("Luvdisc", 35, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  NINETALES_36 ("Ninetales", 36, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PALKIA_37 ("Palkia", 37, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  SHAYMIN_38 ("Shaymin", 38, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  TORTERRA_39 ("Torterra", 39, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TOXICROAK_G_40 ("Toxicroak G", 40, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  BRONZONG_G_41 ("Bronzong G", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  CACTURNE_42 ("Cacturne", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CARNIVINE_43 ("Carnivine", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  CASCOON_44 ("Cascoon", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  COMBUSKEN_45 ("Combusken", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CRANIDOS_46 ("Cranidos", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CROBAT_G_47 ("Crobat G", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  FLAAFFY_48 ("Flaaffy", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  GROTLE_49 ("Grotle", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HOUNDOOM_G_50 ("Houndoom G", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  KIRLIA_51 ("Kirlia", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LOMBRE_52 ("Lombre", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LUCARIO_53 ("Lucario", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MIGHTYENA_54 ("Mightyena", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  MISMAGIUS_55 ("Mismagius", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MONFERNO_56 ("Monferno", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MUK_57 ("Muk", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  OCTILLERY_58 ("Octillery", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PRINPLUP_59 ("Prinplup", 59, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PROBOPASS_60 ("Probopass", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEVIPER_61 ("Seviper", 61, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SHIELDON_62 ("Shieldon", 62, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SILCOON_63 ("Silcoon", 63, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VIGOROTH_64 ("Vigoroth", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WARTORTLE_65 ("Wartortle", 65, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ZANGOOSE_66 ("Zangoose", 66, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  CACNEA_67 ("Cacnea", 67, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CARNIVINE_68 ("Carnivine", 68, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHANSEY_69 ("Chansey", 69, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIMCHAR_70 ("Chimchar", 70, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  COMBEE_71 ("Combee", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DIGLETT_72 ("Diglett", 72, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DUNSPARCE_73 ("Dunsparce", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_74 ("Electrike", 74, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GRIMER_75 ("Grimer", 75, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAPPINY_76 ("Happiny", 76, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HONCHKROW_G_77 ("Honchkrow G", 77, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  KRICKETOT_78 ("Kricketot", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LAPRAS_79 ("Lapras", 79, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  LICKITUNG_80 ("Lickitung", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  LOTAD_81 ("Lotad", 81, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MAREEP_82 ("Mareep", 82, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MISDREAVUS_83 ("Misdreavus", 83, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NOSEPASS_84 ("Nosepass", 84, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIPLUP_85 ("Piplup", 85, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  POOCHYENA_86 ("Poochyena", 86, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  PSYDUCK_87 ("Psyduck", 87, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PURUGLY_G_88 ("Purugly G", 88, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  RALTS_89 ("Ralts", 89, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  REMORAID_90 ("Remoraid", 90, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RIOLU_91 ("Riolu", 91, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SHUPPET_92 ("Shuppet", 92, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKITTY_93 ("Skitty", 93, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SKUNTANK_G_94 ("Skuntank G", 94, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SLAKOTH_95 ("Slakoth", 95, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_96 ("Squirtle", 96, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SWABLU_97 ("Swablu", 97, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TAUROS_98 ("Tauros", 98, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TORCHIC_99 ("Torchic", 99, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TORKOAL_100 ("Torkoal", 100, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TURTWIG_101 ("Turtwig", 101, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VULPIX_102 ("Vulpix", 102, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WURMPLE_103 ("Wurmple", 103, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BROKEN_TIME_SPACE_104 ("Broken Time-Space", 104, Rarity.UNCOMMON, [TRAINER]),
  CYRUS_S_CONSPIRACY_105 ("Cyrus's Conspiracy", 105, Rarity.UNCOMMON, [TRAINER]),
  GALACTIC_HQ_106 ("Galactic HQ", 106, Rarity.UNCOMMON, [TRAINER]),
  LEVEL_MAX_107 ("Level Max", 107, Rarity.UNCOMMON, [TRAINER]),
  LIFE_HERB_108 ("Life Herb", 108, Rarity.UNCOMMON, [TRAINER]),
  LOOKER_S_INVESTIGATION_109 ("Looker's Investigation", 109, Rarity.UNCOMMON, [TRAINER]),
  MEMORY_BERRY_110 ("Memory Berry", 110, Rarity.UNCOMMON, [TRAINER]),
  MIASMA_VALLEY_111 ("Miasma Valley", 111, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_112 ("PlusPower", 112, Rarity.UNCOMMON, [TRAINER]),
  POKE_BALL_113 ("Poké Ball", 113, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_HANDY910IS_114 ("Pokédex HANDY910is", 114, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_RESCUE_115 ("Pokémon Rescue", 115, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_GAIN_116 ("Energy Gain", 116, Rarity.UNCOMMON, [TRAINER]),
  POWER_SPRAY_117 ("Power Spray", 117, Rarity.UNCOMMON, [TRAINER]),
  POKE_TURN_118 ("Poké Turn", 118, Rarity.UNCOMMON, [TRAINER]),
  ARMOR_FOSSIL_119 ("Armor Fossil", 119, Rarity.COMMON, [TRAINER]),
  SKULL_FOSSIL_120 ("Skull Fossil", 120, Rarity.COMMON, [TRAINER]),
  RAINBOW_ENERGY_121 ("Rainbow Energy", 121, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DIALGA_G_LV_X_122 ("Dialga G LV.X", 122, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _METAL_]),
  DRAPION_LV_X_123 ("Drapion LV.X", 123, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _DARKNESS_]),
  GIRATINA_LV_X_124 ("Giratina LV.X", 124, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  PALKIA_G_LV_X_125 ("Palkia G LV.X", 125, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _WATER_]),
  SHAYMIN_LV_X_126 ("Shaymin LV.X", 126, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _GRASS_]),
  SHAYMIN_LV_X_127 ("Shaymin LV.X", 127, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _GRASS_]),
  ELECTABUZZ_128 ("Electabuzz", 128, Rarity.SECRET, [BASIC, POKEMON, _LIGHTNING_]),
  HITMONCHAN_129 ("Hitmonchan", 129, Rarity.SECRET, [BASIC, POKEMON, _FIGHTING_]),
  SCYTHER_130 ("Scyther", 130, Rarity.SECRET, [BASIC, POKEMON, _GRASS_]),
  LOTAD_SH4 ("Lotad", 131, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SWABLU_SH5 ("Swablu", 131, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  VULPIX_SH6 ("Vulpix", 132, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Platinum(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.PLATINUM;
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
      case AMPHAROS_1:
        return evolution (this, from:"Flaaffy", hp:HP130, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Damage Bind", {
            text "Each Pokémon that has any damage counters on it can’t use any Poké-Powers."
            delayedA {
            }
          }
          move "Gigavolt", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage. If tails, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Reflect Energy", {
            text "70 damage. Move an Energy card attached to Ampharos to 1 of your Benched Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BLASTOISE_2:
        return evolution (this, from:"Wartortle", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Dig Well", {
            text "Once during your turn , you may look at the top 3 cards of your deck, choose as many Energy cards as you like, and attach them to your Pokémon in any way you like. Discard the other cards. This power can’t be used if Blastoise is affected by a Special Condition."
            actionA {
            }
          }
          move "Aqua Press", {
            text "20+ damage. ."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Launcher", {
            text "Blastoise can’t use Double Launcher during your next turn."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BLAZIKEN_3:
        return evolution (this, from:"Combusken", hp:HP130, type:FIRE, retreatCost:1) {
          weakness W, PLUS30
          pokePower "Fire Breath", {
            text "Once during your turn , you may choose 1 of the Defending Pokémon. That Pokémon is now Burned. This power can’t be used if Blaziken is affected by a Special Condition."
            actionA {
            }
          }
          move "Clutch", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy attached to Blaziken."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DELCATTY_4:
        return evolution (this, from:"Skitty", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokePower "Power Circulation", {
            text "Once during your turn , you may search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put those cards on top of your deck in any order. If you do, put 2 damage counters on Delcatty. This power can’t be used if Delcatty is affected by a Special Condition."
            actionA {
            }
          }
          move "Power Heal", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Delcatty. Then, remove 2 damage counters from Delcatty."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rear Kick", {
            text "60 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_5:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          pokePower "Reverse Time", {
            text "Once during your turn, when you put Dialga from your hand onto your Bench, you may search your discard pile for up to 3 in any combination of Pokémon (excluding Pokémon LV.) and basic Energy cards. Show them to your opponent and put them on top of your deck in any order."
            actionA {
            }
          }
          move "Time-Space Traveling", {
            text "50 damage. Draw cards until you have 7 cards in your hand."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_6:
        return basic (this, hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokeBody "Time Aura", {
            text "As long as Dialga is your Active Pokémon, your opponent can’t play any Pokémon from his or her hand to evolve his or her Active Pokémon."
            delayedA {
            }
          }
          move "", {
            text "100 damage. Energy attached to Dialga."
            energyCost M, M, C, C, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_G_7:
        return basic (this, hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Deafen", {
            text "10 damage. Your opponent can’t play any Trainer cards or Stadium cards from his or her hand during your opponent’s next turn."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Second Strike", {
            text "50+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GARDEVOIR_8:
        return evolution (this, from:"Kirlia", hp:HP120, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS30
          pokePower "Psychic Connect", {
            text "As often as you like during your turn , you may move a Energy attached to 1 of your Benched Pokémon to your Active Pokémon. This power can’t be used if Gardevoir is affected by a Special Condition."
            actionA {
            }
          }
          move "Energy Burst", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to Gardevoir and the Defending Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psychic Protection", {
            text "60 damage. Gardevoir has no Weakness during your opponent’s next turn."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_9:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokePower "Let Loose", {
            text "Once during your turn, when you put Giratina from your hand onto your Bench, you may use this power. Each player shuffles his or her hand into his or her deck and draws up to 4 cards. (You draw your cards first.)"
            actionA {
            }
          }
          move "Earth Power", {
            text "60 damage. Flip 2 coins. This attack does 10 damage times the number of heads to each of your opponent’s Benched Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_10:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Over Slash", {
            text "This attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dark Wing Flaps", {
            text "20 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wrack Down", {
            text "60 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANECTRIC_11:
        return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokeBody "Electric Barrier", {
            text "Prevent all damage done to your Benched Pokémon (excluding any Manectric) by attacks."
            delayedA {
            }
          }
          move "Power Wave", {
            text "."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Attract Current", {
            text "40 damage. Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost C, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_G_12:
        return basic (this, hp:HP100, type:WATER, retreatCost:2) {
          weakness L
          move "Splashing Turn", {
            text "20 damage. with 1 of your Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pearl Breath 50 damage", {
            text "Does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAMPARDOS_13:
        return evolution (this, from:"Cranidos", hp:HP130, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS30
          pokeBody "Iron Skull", {
            text "Rampardos’s attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            delayedA {
            }
          }
          move "Head Smash", {
            text "80 damage. If the Defending Pokémon would be Knocked Out by this attack, Rampardos does 40 damage to itself."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mold Breaker", {
            text "40 damage. until the end of your next turn."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHAYMIN_14:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Flower Aroma", {
            text "10 damage. Remove 2 damage counters from Shaymin. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Damage Aid", {
            text "30+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 30 damage plus 50 more damage. Then, remove all Special Conditions from the Defending Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHAYMIN_15:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Growth", {
            text "Energy card from your hand to Shaymin."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Air Slash", {
            text "40 damage. Flip a coin. If tails, discard an Energy attached to Shaymin."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLAKING_16:
        return evolution (this, from:"Vigoroth", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS30
          pokeBody "Lazy Paunch", {
            text "If Slaking used any attacks during your last turn, Slaking can’t attack."
            delayedA {
            }
          }
          move "Best Dash", {
            text "150 damage. ."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WEAVILE_G_17:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          move "Call for Family", {
            text "and put them onto your Bench. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Team Attack", {
            text "10+ damage. you have in play."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ALTARIA_18:
        return evolution (this, from:"Swablu", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Midnight Eyes", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Perish Song", {
            text "If the Defending Pokémon is Asleep and was damaged or affected by Midnight Eyes during your last turn, the Defending Pokémon is Knocked Out."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Healing Song", {
            text "40 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BANETTE_19:
        return evolution (this, from:"Shuppet", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Temper Tantrum", {
            text "Once during your turn , you may discard as many cards as you like from your hand. If you do, put that many damage counters on Banette. This power can’t be used if Banette is affected by a Special Condition."
            actionA {
            }
          }
          move "Darkness Switch", {
            text "Discard an Energy card attached to Banette, and then switch all damage counters on Banette with those on the Defending Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Loneliness", {
            text "30+ damage. You may show your hand to your opponent. If you do and if you don’t have any Pokémon in your hand, this attack does 30 damage plus 30 more damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BASTIODON_20:
        return evolution (this, from:"Shieldon", hp:HP130, type:METAL, retreatCost:4) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokeBody "Metal Trait", {
            text "As long as Bastiodon has a Pokémon Tool card attached to it, remove 1 damage counter from Bastiodon between turns."
            delayedA {
            }
          }
          move "Iron Defense", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Bastiodon during your opponent’s next turn."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Iron Tackle", {
            text "80 damage. Bastiodon does 30 damage to itself."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BEAUTIFLY_21:
        return evolution (this, from:"Silcoon", hp:HP120, type:GRASS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Colorful Powder", {
            text "20+ damage. If Beautifly has 2 or less Energy attached to it, the Defending Pokémon is now Poisoned. If Beautifly has 3 Energy attached to it, the Defending Pokémon is now Burned and Poisoned. If Beautifly has 4 or more Energy attached to it, this attack does 20 damage plus 40 more damage and the Defending Pokémon is now Asleep, Burned, and Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Silver Scale", {
            text "30 damage. If the Defending Pokémon has any Resistance, this attack’s base damage is 60 damage instead of 30."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BLISSEY_22:
        return evolution (this, from:"Chansey", hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS30
          pokePower "Nurse Call", {
            text "Once during your turn , you may discard a card from your hand. If you do, remove 2 damage counters from 1 of your Pokémon. You can’t use more than 1 Nurse Call Poké-Power each turn. This power can’t be used if Blissey is affected by a Special Condition."
            actionA {
            }
          }
          move "Return", {
            text "20 damage. Draw cards until you have 6 cards in your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double-edge", {
            text "100 damage. Blissey does 60 damage to itself."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 100
              damage 60, self
            }
          }

        };
      case DIALGA_23:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "", {
            text "20 damage. Flip a coin. If heads, search your discard pile for a basic Energy card and attach it to Dialga."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Diamond Blow", {
            text "100 damage. Dialga can’t attack during your next turn."
            energyCost M, M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUGTRIO_24:
        return evolution (this, from:"Diglett", hp:HP090, type:FIGHTING, retreatCost:0) {
          weakness W, PLUS20
          resistance L, MINUS20
          pokeBody "Sinkhole", {
            text "If your opponent’s Active Pokémon retreats, put 2 damage counters on that Pokémon."
            delayedA {
            }
          }
          move "Push Down", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Magnitude", {
            text "70 damage. ."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSTOX_25:
        return evolution (this, from:"Cascoon", hp:HP130, type:PSYCHIC, retreatCost:0) {
          weakness R, PLUS30
          pokeBody "Camouflage Pattern", {
            text "Prevent all effects of attacks, including damage, done to Dustox by your opponent’s Pokémon that is affected by 2 or more Special Conditions."
            delayedA {
            }
          }
          move "Smogscreen", {
            text "20 damage. The Defending Pokémon is now Poisoned. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Chemical Scale", {
            text "60 damage. If the Defending Pokémon has any Poké-Powers or Poké-Bodies, the Defending Pokémon is now Burned and Confused."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EMPOLEON_26:
        return evolution (this, from:"Prinplup", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Knock Off", {
            text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Jet Smash", {
            text "Empoleon can’t use Jet Smash during your next turn."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_27:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Strafe", {
            text "20 damage. You may switch Giratina with 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Broken-space Blow", {
            text "50 damage. If the Defending Pokémon is Knocked Out by this attack, put the Defending Pokémon and all cards attached to in the Lost Zone instead of the discard pile."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_28:
        return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
          weakness D
          resistance C, MINUS20
          move "Dragon Claw", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dragonbreath", {
            text "80 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GOLDUCK_29:
        return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          move "Swim", {
            text "30 damage. Energy attached to any of his or her Pokémon, you may do 30 damage to any 1 Benched Pokémon instead."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Water Slide", {
            text "40+ damage. You may move all Energy cards attached to Golduck to 1 of your Benched Pokémon. If you do, this attack does 40 damage plus 20 more damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GYARADOS_G_30:
        return basic (this, hp:HP110, type:WATER, retreatCost:3) {
          weakness L
          move "Wriggle", {
            text "Flip a coin for each of your opponent’s Pokémon. If that coin flip is heads, this attack does 30 damage to that Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dwindling Wave", {
            text "100- damage. ."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case INFERNAPE_31:
        return evolution (this, from:"Monferno", hp:HP110, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          move "Rushing Flames", {
            text "80× damage. Energy cards as you like attached to your Pokémon in play. Flip a coin for each Energy card you discarded. This attack does 80 damage times the number of heads."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rage", {
            text "30+ damage. Does 30 damage plus 10 more damage for each damage counter on Infernape."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KRICKETUNE_32:
        return evolution (this, from:"Kricketot", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Revenge Melody", {
            text "20× damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Does 20 damage times the number of Kricketot and Kricketune in your discard pile."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bug Buzz", {
            text "50+ damage. If the Defending Pokémon is Asleep, this attack does 50 damage plus 30 more damage. Remove the Special Condition Asleep from the Defending Pokémon."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LICKILICKY_33:
        return evolution (this, from:"Lickitung", hp:HP120, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS20
          move "Harrumph", {
            text "Before doing damage, discard all Trainer cards attached to that Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Body Press", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUDICOLO_34:
        return evolution (this, from:"Lombre", hp:HP120, type:GRASS, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Cheerful Voice", {
            text "Once during your turn , you may use this power. If you do, your turn ends. During your next turn, each of Ludicolo’s attacks does 60 more damage to the Defending Pokémon . This power can’t be used if Ludicolo is affected by a Special Condition."
            actionA {
            }
          }
          move "Mad Dance", {
            text "20 damage. The Defending Pokémon is now Confused."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Best Dance", {
            text "60 damage. After doing damage, remove from Ludicolo the number of damage counters equal to the damage you did to the Defending Pokémon. Ludicolo can’t use Best Dance during your next turn."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUVDISC_35:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Love Call", {
            text "Choose 1 of your opponent’s Pokémon. Search your deck for a Pokémon that is the same type as the Pokémon you chose, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sweet Kiss", {
            text "30 damage. Your opponent may draw a card."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NINETALES_36:
        return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Flame Bash", {
            text "Energy cards up to the number of heads and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mysterious Flames", {
            text "40 damage. If you have more Energy in play than your opponent, the Defending Pokémon is now Burned and Confused."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_37:
        return basic (this, hp:HP100, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Tsunami", {
            text "10 damage. Does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Water Pulse", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHAYMIN_38:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Energy Blow", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Shaymin."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aromatherapy", {
            text "40 damage. Remove 2 damage counters from each of your Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORTERRA_39:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          move "Green Blast", {
            text "40+ damage. Energy attached to all of your Pokémon."
            energyCost G, C, C, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Soothing Scent", {
            text "80 damage. The Defending Pokémon is now Asleep."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOXICROAK_G_40:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Anticipation", {
            text "Prevent all effects of attacks, excluding damage, done to Toxicroak ."
            delayedA {
            }
          }
          move "Deep Poison", {
            text "20+ damage. If the Defending Pokémon is Poisoned, this attack does 20 damage plus 40 more damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BRONZONG_G_41:
        return basic (this, hp:HP090, type:METAL, retreatCost:3) {
          weakness P
          resistance R, MINUS20
          pokeBody "Galactic Switch", {
            text "Once during your turn , you may move an Energy card attached to one of your Pokémon to another of your Pokémon to another of your Pokémon. Then, put 2 damage counters on Bronzong . This power can’t be used if Bronzong is affected by a Special Condition."
            delayedA {
            }
          }
          move "Psychic Pulse", {
            text "40 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CACTURNE_42:
        return evolution (this, from:"Cacnea", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Spike Wound", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 50 damage to that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Experiment", {
            text "20 damage. Energy, the Defending Pokémon is now Paralyzed."
            energyCost G, D, G, D, G, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CARNIVINE_43:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Stretch Vine", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Absorb", {
            text "20 damage. Remove 2 damage counters from Carnivine."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Vine Extract", {
            text "30 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Burned and Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CASCOON_44:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          move "Ascension", {
            text "Search your deck for a card that evolves from Cascoon and put it onto Cascoon. (This counts as evolving Cascoon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Thread", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBUSKEN_45:
        return evolution (this, from:"Torchic", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Firebreathing", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
          move "High Jump Kick", {
            text "60 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRANIDOS_46:
        return evolution (this, from:"Skull Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Rock Smash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
          move "Knock Over", {
            text "40 damage. You may discard any Stadium card in play."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CROBAT_G_47:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          pokePower "Flash Bite", {
            text "Once during your turn, when you put Crobat from your hand onto your Bench, you may put 1 damage counter on 1 of your opponent’s Pokémon."
            actionA {
            }
          }
          move "Toxic Fang", {
            text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FLAAFFY_48:
        return evolution (this, from:"Flaaffy", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Spark", {
            text "10 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tail Code", {
            text "30 damage. Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GROTLE_49:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Absorb", {
            text "30 damage. Remove 1 damage counter from Grotle."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Razor Leaf", {
            text "60 damage. "
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HOUNDOOM_G_50:
        return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Black Cry", {
            text "20 damage. The Defending Pokémon can’t retreat or use any Poké-Powers during your opponent’s next turn."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dark Slash", {
            text "40+ damage. Energy attached to Houndoom . If you do, this attack does 40 damage plus 20 more damage."
            energyCost D, C, C, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KIRLIA_51:
        return evolution (this, from:"Ralts", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Teleportation Burst", {
            text "30 damage. vYou may switch Kirlia with 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Super Psy Bolt", {
            text "60 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LOMBRE_52:
        return evolution (this, from:"Lotad", hp:HP080, type:GRASS, retreatCost:1) {
          weakness L, PLUS20
          move "Interrupt", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Flip a coin. If heads, look at your opponent’s hand and choose 1 card, then have your opponent shuffle that card into his or her deck."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gentle Slap", {
            text "60 damage. "
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUCARIO_53:
        return evolution (this, from:"Riolu", hp:HP090, type:METAL, retreatCost:0) {
          weakness R, PLUS20
          move "Aura Sphere", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Do the Wave", {
            text "20+ damage. Does 20 damage plus 10 more damage for each of your Benched Pokémon."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MIGHTYENA_54:
        return evolution (this, from:"Poochyena", hp:HP090, type:DARKNESS, retreatCost:0) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokeBody "Cold Feet", {
            text "If Mightyena is affected by a Special Condition, ignore all Energy necessary to use Mightyena’s attacks."
            delayedA {
            }
          }
          move "Collude", {
            text "20+ damage. If you played any Supporter card from your hand during this turn, this attack does 20 damage plus 20 more damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Desperate Attack", {
            text "50+ damage. If Mightyena has less Energy attached to it than the Defending Pokémon, this attack does 50 damage plus 30 more damage."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MISMAGIUS_55:
        return evolution (this, from:"Misdreavus", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Upper Hand", {
            text "30 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psybeam", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MONFERNO_56:
        return evolution (this, from:"Chimchar", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Fire Tail Slap", {
            text "40 damage. Energy attached to Monferno."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Paralyzing Gaze", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case MUK_57:
        return evolution (this, from:"Grimer", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          pokeBody "Sludge Cell", {
            text "If Muk remains affected by any Special Conditions between turns, remove 2 damage counters from Muk."
            delayedA {
            }
          }
          move "Strange Poison", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, Muk is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Strange Sludge", {
            text "50+ damage. If Muk is Poisoned, this attack does 50 damage plus 20 more damage and the Defending Pokémon is now Confused."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case OCTILLERY_58:
        return evolution (this, from:"Remoraid", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Water Vein", {
            text "50× damage. Reveal the top 5 cards of your deck. Flip a coin for each Energy card you find there. This attack does 50 damage times the number of heads. Shuffle the revealed cards back into your deck."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Octazooka", {
            text "40 damage. Any time the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack does nothing. (If the Defending Pokémon is no longer your opponent’s Active Pokémon, this effect ends.)"
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PRINPLUP_59:
        return evolution (this, from:"Piplup", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Surf", {
            text "30 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bubblebeam", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
              flip { apply PARALYZED }
            }
          }

        };
      case PROBOPASS_60:
        return evolution (this, from:"Nosepass", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          move "Stealth Rock", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hyper Beam", {
            text "70 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 70
              flip { discardDefendingEnergy() }
            }
          }

        };
      case SEVIPER_61:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Shed Skin", {
            text "Remove 4 damage counters from Seviper."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite and Escape", {
            text "20 damage. You may switch Seviper with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Paralyze Poison", {
            text "40 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHIELDON_62:
        return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Endure", {
            text "Flip a coin. If heads, during your opponent’s next turn, if Shieldon would be Knocked Out by damage from an attack, Shieldon is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rock Slide", {
            text "30 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SILCOON_63:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Ascension", {
            text "Search your deck for a card that evolves from Silcoon and put it onto Silcoon. (This counts as evolving Silcoon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sticky String", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case VIGOROTH_64:
        return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Reckless Charge", {
            text "30 damage. Flip a coin. If tails, Vigoroth does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fight Back", {
            text "50+ damage. If Vigoroth has any damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WARTORTLE_65:
        return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Double Slap", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rocket Tackle", {
            text "30 damage. Wartortle does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Wartortle by attacks during your opponent’s next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZANGOOSE_66:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Thick Skin", {
            text "Zangoose can’t be affected by any Special Conditions."
            delayedA {
            }
          }
          move "Invite and Strike", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. This attack does 20 damage to the new Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Chop Up", {
            text "50 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CACNEA_67:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sneaky Attack", {
            text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shoot Needle", {
            text "(You can choose the same Pokémon more than once, but you can’t do more than 10 damage to that Pokémon in this way.)"
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CARNIVINE_68:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Poison Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }
          move "Sweet Saliva", {
            text "20 damage. Remove 1 damage counter from each of your Benched Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHANSEY_69:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Healing Trial", {
            text "Flip a coin. If heads, remove 3 damage counters from Chansey. If tails, remove 3 damage counters from the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pulled Punch", {
            text "40 damage. If the Defending Pokémon already has any damage counters on it, this attack’s base damage is 10 instead of 40."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHIMCHAR_70:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Bite", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fire Punch", {
            text "20 damage. "
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBEE_71:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Shoot Through", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIGLETT_72:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Dig Under", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Trip Over", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }

        };
      case DUNSPARCE_73:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spring Out", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ELECTRIKE_74:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunder Fang", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case GRIMER_75:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Division", {
            text "Search your deck for Grimer and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Gas", {
            text "The Defending Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HAPPINY_76:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chansey from your hand onto Happiny (this counts as evolving Happiny) and remove all damage counters from Happiny."
            actionA {
            }
          }
          move "Hospitality", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. Remove 2 damage counters from the new Defending Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HONCHKROW_G_77:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Honcho’s Command", {
            text "Search your deck for up to 2 in any combination of Stadium cards or Trainer cards that has Team Galactic’s Invention in its name, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Target Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. If that Pokémon already has any damage counters on it, this attack does 20 damage plus 20 more damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KRICKETOT_78:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Lullaby", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LAPRAS_79:
        return basic (this, hp:HP080, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          move "Grind", {
            text "10× damage. Does 10 damage times the amount of Energy attached to Lapras."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ice Beam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }

        };
      case LICKITUNG_80:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS20
          move "Stretch Tongue", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Knock Off", {
            text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LOTAD_81:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          move "Energy Ball", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Lotad but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Synthesis", {
            text "Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAREEP_82:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Minor Errand-Running", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Expand", {
            text "10 damage. ."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MISDREAVUS_83:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Take Back", {
            text "Flip a coin. If heads, search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
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

        };
      case NOSEPASS_84:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          move "Pull", {
            text "Switch the Defending Pokémon with one of your opponent’s Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rollout", {
            text "20 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIPLUP_85:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Muddy Water", {
            text "10 damage. Does 10 damage to one of your opponent’s Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pound", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POOCHYENA_86:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Howl", {
            text "Search your deck for Poochyena and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PSYDUCK_87:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Headache", {
            text "Flip a coin. If heads, your opponent can’t play any Trainer, Supporter, or Stadium cards from his or her during his or her next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Latent Power", {
            text "30 damage. Flip a coin. If tails, this attack does no damage to the Defending Pokémon. Instead, Psyduck is now Confused."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PURUGLY_G_88:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F
          move "Chip Off", {
            text "20 damage. If your opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poor Sleep", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage and Purugly is now Asleep."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RALTS_89:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Future Sight", {
            text "Look at the top 5 cards in either player’s deck and put them back on top of that player’s deck in any order."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hypnoblast", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REMORAID_90:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Splash", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Trickle", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RIOLU_91:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Light Punch", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Steady Punch", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHUPPET_92:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Hypnotic Gaze", {
            text "The Defending Pokémon is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fade Out", {
            text "30 damage. Return Shuppet and all cards attached to it to your hand. (If you don’t have any Benched Pokémon, this attack does nothing.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKITTY_93:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Heal Bell", {
            text "Remove 1 damage counter from each of your Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Take Down", {
            text "20 damage. Skitty does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKUNTANK_G_94:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness F
          pokePower "Poison Structure", {
            text "Once during your turn , if you have a Stadium card in play, you may use this power. Each Active Pokémon (both your’s and your opponent’s) (excluding Pokémon ) is now Poisoned. This power can’t be used if Skuntank is affected by a Special Condition."
            actionA {
            }
          }
          move "Smokescreen", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              sandAttack(thisMove)
            }
          }

        };
      case SLAKOTH_95:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Slakoth."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Slack Off", {
            text "Remove all damage counters from Slakoth. Slakoth can’t attack during your next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SQUIRTLE_96:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Skull Bash", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWABLU_97:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Sing", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Run Around", {
            text "10 damage. You may switch Swablu with one of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TAUROS_98:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Show Off", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Take Down", {
            text "20 damage. Flip a coin. If tails, Tauros does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORCHIC_99:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Focus Energy", {
            text "During your next turn, Torchic’s Fire Shard attack’s base damage is 80."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fire Shard", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORKOAL_100:
        return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Super Singe", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flame Ball", {
            text "40 damage. Move an Energy card attached to Torkoal to 1 of your Benched Pokémon."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TURTWIG_101:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Ram", {
            text "10 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case VULPIX_102:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Reheat", {
            text "Discard up to 2 Energy cards from your hand. For each card you discarded, draw 2 cards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WURMPLE_103:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Ram", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Sting", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply POISONED }
            }
          }

        };
      case BROKEN_TIME_SPACE_104:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach player may evolve a Pokémon that he or she just played or evolved during that turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case CYRUS_S_CONSPIRACY_105:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for a Supporter card, a basic Energy card, and a Trainer card that has Team Galactic’s Invention in its name, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case GALACTIC_HQ_106:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player plays any Pokémon from his or her hand to evolve his or her Pokémon, put 2 damage counters on that Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case LEVEL_MAX_107:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your deck for a Pokémon LV.X that levels up from 1 of your Pokémon, and put it onto that Pokémon (this counts as leveling up that Pokémon). Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case LIFE_HERB_108:
        return basicTrainer (this) {
          text "Flip a coin. If heads, choose 1 of your Pokémon, and remove all Special Conditions and 6 damage counters from that Pokémon (all if there are less than 6)."
          onPlay {
          }
          playRequirement{
          }
        };
      case LOOKER_S_INVESTIGATION_109:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at your opponent’s hand, then choose you or your opponent. That player shuffles his or her hand into his or her deck and draws up to 5 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case MEMORY_BERRY_110:
        return basicTrainer (this) {
          text "Attach Memory Berry to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nThe Pokémon this card is attached to can use any attack from its Basic Pokémon or its Stage 1 Evolution card. (You still have to pay for that attack’s Energy cost.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case MIASMA_VALLEY_111:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player puts a Basic Pokémon (excluding [G] or [P] Pokémon) from his or hand onto his or her Bench, put 2 damage counters on that Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case PLUSPOWER_112:
        return basicTrainer (this) {
          text "Attach PlusPower to 1 of your Pokémon. Discard this card at the end of your turn.\nIf the Pokémon PlusPower is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance)."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_BALL_113:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKEDEX_HANDY910IS_114:
        return basicTrainer (this) {
          text "Look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKEMON_RESCUE_115:
        return basicTrainer (this) {
          text "Search your discard pile for a Pokémon, show it to your opponent, and put it into your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_GAIN_116:
        return basicTrainer (this) {
          text "Attach Energy Gain to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAttach Team Galactic’s Invention G-101 Energy Gain to 1 of your Pokémon SP that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card. When the Pokémon this card is attached to is no longer a Pokémon SP, discard this card.\nAs long as Team Galactic’s Invention G-101 Energy Gain is attached to a Pokémon, the attack cost of that Pokémon’s attacks is [C] less."
          onPlay {
          }
          playRequirement{
          }
        };
      case POWER_SPRAY_117:
        return basicTrainer (this) {
          text "You may play this card during your opponent’s turn when your opponent’s Pokémon uses any Poké-Power. Prevent all effects of that Poké-Power. (This counts as that Pokémon using its Poké-Power.) If you have 2 or less Pokémon SP in play, you can’t play this card."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_TURN_118:
        return basicTrainer (this) {
          text "Return 1 of your Pokémon SP and all cards attached to it to your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case ARMOR_FOSSIL_119:
        return basicTrainer (this) {
          text "Play Armor Fossil as if it were a [C] Basic Pokémon. (Armor Fossil counts as a Trainer card as well, but if Armor Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Armor Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Armor Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Armor Stone Whenever Armor Fossil would be damaged by your opponent’s attack, flip a coin until you get tails. For each heads, reduce that damage by 10."
          onPlay {
          }
          playRequirement{
          }
        };
      case SKULL_FOSSIL_120:
        return basicTrainer (this) {
          text "Play Skull Fossil as if it were a [C] Basic Pokémon. (Skull Fossil counts as a Trainer card as well, but if Skull Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Skull Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Skull Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Skull Stone During your opponent’s turn, if Skull Fossil would be Knocked Out by damage from an opponent’s attack, flip a coin until you get tails. For each heads, put 1 damage counter on the Attacking Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case RAINBOW_ENERGY_121:
        return specialEnergy (this, [[C]]) {
          text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy counts as every type of basic Energy but provides only 1 Energy at a time. (doesn’t count as a energy card when not in play.) When you attach this card from your hand to 1 of your Pokémon, it does 10 damage to that Pokémon.(don’t apply Weakness and Resistance.)"
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case DIALGA_G_LV_X_122:
        return evolution (this, from:"Dialga G", hp:HP120, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokeBody "Time Crystal", {
            text "Each Pokémon (excluding Pokémon ) can’t use any Poké-Bodies."
            delayedA {
            }
          }
          move "Remove Lost", {
            text "80 damage. Flip a coin until you get tails. For each heads, remove an Energy card attached to the Defending Pokémon and put it in the Lost Zone."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Dialga . Dialga LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRAPION_LV_X_123:
        return evolution (this, from:"Drapion", hp:HP130, type:DARKNESS, retreatCost:3) {
          weakness P
          pokePower "Tri-Poison", {
            text "Once during your turn , you may flip a coin. If heads, choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns. This power can’t be used if Drapion is affected by a Special Condition."
            actionA {
            }
          }
          move "Sniping Tail", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D, D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Drapion. Drapion LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_LV_X_124:
        return evolution (this, from:"Giratina", hp:HP130, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokeBody "Invisible Tentacles", {
            text "Whenever your opponent’s Pokémon tries to attack, your opponent discards 1 card from his or her hand. (If your opponent can’t discard 1 card, your opponent’s Pokémon can’t attack.) You can’t use more than 1 Invisible Tentacles Poké-Body each turn."
            delayedA {
            }
          }
          move "Darkness Lost", {
            text "If any of your opponent’s Pokémon would be Knocked Out by damage from this attack, put that Pokémon and all cards attached to it in the Lost Zone instead of discarding it."
            energyCost P, P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Giratina. Giratina LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_G_LV_X_125:
        return evolution (this, from:"Palkia G", hp:HP120, type:WATER, retreatCost:2) {
          weakness L
          pokePower "Lost Cyclone", {
            text "Once during your turn , you may use this power. Any player who has 4 or more Benched Pokémon chooses 3 of his or her Benched Pokémon. Put the other Benched Pokémon and all cards attached to them in the Lost Zone. This power can’t be used it Palkia is affected by a Special Condition."
            actionA {
            }
          }
          move "Hydro Shot", {
            text ". Choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Palkia . Palkia LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHAYMIN_LV_X_126:
        return evolution (this, from:"Shaymin", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          pokeBody "Thankfulness", {
            text "Each of your Pokémon (excluding any Shaymin) gets +40 HP. You can’t use more than 1 Thankfulness Poké-Body each turn."
            delayedA {
            }
          }
          move "Seed Flare", {
            text "40+ damage. Energy attached in this way."
            energyCost G, C, C, G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Shaymin. Shaymin LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHAYMIN_LV_X_127:
        return evolution (this, from:"Shaymin", hp:HP110, type:GRASS, retreatCost:0) {
          weakness R
          resistance F, MINUS20
          pokeBody "Revenge Seed", {
            text "If any of your Pokémon were Knocked Out by damage from an opponent’s attack during his or her last turn, each of Shaymin’s attacks does 60 more damage to the Active Pokémon ."
            delayedA {
            }
          }
          move "Energy Flare", {
            text "50 damage. You may move any number of Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Shaymin. Shaymin LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ELECTABUZZ_128:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply PARALYZED }
            }
          }
          move "Thunderpunch", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage and Electabuzz does 10 damage to itself."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HITMONCHAN_129:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Jab", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Special Punch", {
            text "40 damage. "
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCYTHER_130:
        return basic (this, hp:HP070, type:GRASS, retreatCost:0) {
          weakness R
          resistance F, MINUS30
          move "Swords Dance", {
            text "During your next turn, Scyther’s Slash attack’s base damage is 60 instead of 30."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slash", {
            text "30 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LOTAD_SH4:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          pokeBody "Swift Swim", {
            text "If Lotad has any Energy attached to it, Lotad’s Retreat Cost is 0."
            delayedA {
            }
          }
          move "Blot", {
            text "10 damage. Remove 1 damage counter from Lotad."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does"
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWABLU_SH5:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Roost", {
            text "Remove 4 damage counters from Swablu. Swablu can’t retreat during your next turn."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mirror Move", {
            text "If Swablu was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Swablu to the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Attack", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VULPIX_SH6:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W
          move "Find Wildfire", {
            text "Energy cards, show them to your opponent, and put them in your hand. Shuffle your deck afterward."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Brushfire", {
            text "10 damage. Pokémon."
            energyCost R, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Inflame", {
            text "30 damage. Energy card from your hand. (If you can’t discard a card from your hand, this attack does nothing.)"
            energyCost R, C, R
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
