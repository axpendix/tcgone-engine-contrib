package tcgwars.logic.impl.gen4;

import tcgwars.logic.impl.gen5.PlasmaStorm;

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
public enum MajesticDawn implements LogicCardInfo {

  ARTICUNO_1 ("Articuno", 1, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  CRESSELIA_2 ("Cresselia", 2, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DARKRAI_3 ("Darkrai", 3, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  DIALGA_4 ("Dialga", 4, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  GLACEON_5 ("Glaceon", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KABUTOPS_6 ("Kabutops", 6, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LEAFEON_7 ("Leafeon", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MANAPHY_8 ("Manaphy", 8, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MEWTWO_9 ("Mewtwo", 9, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  MOLTRES_10 ("Moltres", 10, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  PALKIA_11 ("Palkia", 11, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  PHIONE_12 ("Phione", 12, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  ROTOM_13 ("Rotom", 13, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  ZAPDOS_14 ("Zapdos", 14, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  AERODACTYL_15 ("Aerodactyl", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BRONZONG_16 ("Bronzong", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_17 ("Empoleon", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  ESPEON_18 ("Espeon", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FLAREON_19 ("Flareon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GLACEON_20 ("Glaceon", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HIPPOWDON_21 ("Hippowdon", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  INFERNAPE_22 ("Infernape", 22, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_23 ("Jolteon", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LEAFEON_24 ("Leafeon", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MINUN_25 ("Minun", 25, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  OMASTAR_26 ("Omastar", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PHIONE_27 ("Phione", 27, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PLUSLE_28 ("Plusle", 28, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SCIZOR_29 ("Scizor", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TORTERRA_30 ("Torterra", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TOXICROAK_31 ("Toxicroak", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UMBREON_32 ("Umbreon", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  UNOWN_P_33 ("Unown P", 33, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  VAPOREON_34 ("Vaporeon", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  AMBIPOM_35 ("Ambipom", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FEAROW_36 ("Fearow", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GROTLE_37 ("Grotle", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KANGASKHAN_38 ("Kangaskhan", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  LICKITUNG_39 ("Lickitung", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MANECTRIC_40 ("Manectric", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MONFERNO_41 ("Monferno", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MOTHIM_42 ("Mothim", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PACHIRISU_43 ("Pachirisu", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PRINPLUP_44 ("Prinplup", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAICHU_45 ("Raichu", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SCYTHER_46 ("Scyther", 46, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  STARAVIA_47 ("Staravia", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SUDOWOODO_48 ("Sudowoodo", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  UNOWN_Q_49 ("Unown Q", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AIPOM_50 ("Aipom", 50, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  AIPOM_51 ("Aipom", 51, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_52 ("Bronzor", 52, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BUNEARY_53 ("Buneary", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BURMY_SANDY_CLOAK_54 ("Burmy Sandy Cloak", 54, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHATOT_55 ("Chatot", 55, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIMCHAR_56 ("Chimchar", 56, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHIMCHAR_57 ("Chimchar", 57, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHINGLING_58 ("Chingling", 58, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  COMBEE_59 ("Combee", 59, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CROAGUNK_60 ("Croagunk", 60, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DRIFLOON_61 ("Drifloon", 61, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_62 ("Eevee", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EEVEE_63 ("Eevee", 63, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_64 ("Electrike", 64, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GLAMEOW_65 ("Glameow", 65, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HIPPOPOTAS_66 ("Hippopotas", 66, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  KABUTO_67 ("Kabuto", 67, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MUNCHLAX_68 ("Munchlax", 68, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  OMANYTE_69 ("Omanyte", 69, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PIKACHU_70 ("Pikachu", 70, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIPLUP_71 ("Piplup", 71, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PIPLUP_72 ("Piplup", 72, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLOS_EAST_SEA_73 ("Shellos East Sea", 73, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SPEAROW_74 ("Spearow", 74, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STARLY_75 ("Starly", 75, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUNKY_76 ("Stunky", 76, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  TURTWIG_77 ("Turtwig", 77, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TURTWIG_78 ("Turtwig", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DAWN_STADIUM_79 ("Dawn Stadium", 79, Rarity.UNCOMMON, [TRAINER]),
  DUSK_BALL_80 ("Dusk Ball", 80, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RESTORE_81 ("Energy Restore", 81, Rarity.UNCOMMON, [TRAINER]),
  FOSSIL_EXCAVATOR_82 ("Fossil Excavator", 82, Rarity.UNCOMMON, [TRAINER]),
  MOM_S_KINDNESS_83 ("Mom's Kindness", 83, Rarity.UNCOMMON, [TRAINER]),
  OLD_AMBER_84 ("Old Amber", 84, Rarity.UNCOMMON, [TRAINER]),
  POKE_BALL_85 ("Poké Ball", 85, Rarity.UNCOMMON, [TRAINER]),
  QUICK_BALL_86 ("Quick Ball", 86, Rarity.UNCOMMON, [TRAINER]),
  SUPER_SCOOP_UP_87 ("Super Scoop Up", 87, Rarity.UNCOMMON, [TRAINER]),
  WARP_POINT_88 ("Warp Point", 88, Rarity.UNCOMMON, [TRAINER]),
  DOME_FOSSIL_89 ("Dome Fossil", 89, Rarity.COMMON, [TRAINER]),
  ENERGY_SEARCH_90 ("Energy Search", 90, Rarity.COMMON, [TRAINER]),
  HELIX_FOSSIL_91 ("Helix Fossil", 91, Rarity.COMMON, [TRAINER]),
  CALL_ENERGY_92 ("Call Energy", 92, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DARKNESS_ENERGY_93 ("Darkness Energy", 93, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  HEALTH_ENERGY_94 ("Health Energy", 94, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_95 ("Metal Energy", 95, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  RECOVER_ENERGY_96 ("Recover Energy", 96, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  GARCHOMP_LV_X_97 ("Garchomp LV.X", 97, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
  GLACEON_LV_X_98 ("Glaceon LV.X", 98, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _WATER_]),
  LEAFEON_LV_X_99 ("Leafeon LV.X", 99, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _GRASS_]),
  PORYGON_Z_LV_X_100 ("Porygon-Z LV.X", 100, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  MajesticDawn(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.MAJESTIC_DAWN;
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
      case ARTICUNO_1:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness M
          resistance F, MINUS20
          pokePower "Freezing Screech", {
            text "Once during your turn, when you put Articuno from your hand onto your Bench, you may flip a coin. If heads, choose 1 of the Defending Pokémon. That Pokémon is now Paralyzed."
            actionA {
            }
          }
          move "Blizzard", {
            text "60 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon. If tails, this attack does 10 damage to each of your Benched Pokémon."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRESSELIA_2:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Future Sight", {
            text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Healing Light", {
            text "40 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DARKRAI_3:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:2) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokePower "Darkness Shade", {
            text "Once during your turn, when you put Darkrai from your hand onto your Bench, you may choose 1 of the Defending Pokémon. That Pokémon is now Asleep."
            actionA {
            }
          }
          move "Dark Slumber", {
            text "10 damage. At the end of your opponent’s next turn, the Defending Pokémon is now Asleep."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dark Resolve", {
            text "40 damage. If the Defending Pokémon is Asleep, remove 4 damage counters from Darkrai."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_4:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "", {
            text "If damage. "
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Time Shift", {
            text "Draw cards until you have 6 cards in your hand."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Diamond Blast", {
            text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 20 more damage."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip { damage 20 }
            }
          }

        };
      case GLACEON_5:
        return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Snow Cloak", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Glaceon during your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Speed Slide", {
            text "60 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KABUTOPS_6:
        return evolution (this, from:"Kabuto", hp:HP120, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS30
          pokeBody "Primal Shell", {
            text "As long as Kabutops is your Active Pokémon, your opponent can’t play any Trainer cards from his or her hand."
            delayedA {
            }
          }
          move "Chop Up", {
            text "70 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LEAFEON_7:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Bind Down", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Leaf Guard", {
            text "20 damage. ."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANAPHY_8:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokeBody "Aqua Skin", {
            text "When you attach a Energy card from your hand to Manaphy, remove 2 damage counters from Manaphy."
            delayedA {
            }
          }
          move "Chase Up", {
            text "Flip a coin. If heads, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fountain", {
            text "30 damage. Energy cards from your hand to your Benched Pokémon in any way you like."
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MEWTWO_9:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Energy Absorption", {
            text "Search your discard pile for up to 2 Energy cards and attach them to Mewtwo."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Recover", {
            text "Energy attached to Mewtwo and remove 6 damage counters from Mewtwo."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psyburn", {
            text "60 damage. "
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MOLTRES_10:
        return basic (this, hp:HP100, type:FIRE, retreatCost:2) {
          weakness W
          resistance F, MINUS20
          pokePower "Flame Charge", {
            text "Once during your turn, when you put Moltres from your hand onto your Bench, you may flip a coin. If heads, search your discard pile for up to 3 Energy cards and attach them to Moltres."
            actionA {
            }
          }
          move "Scorching Wing", {
            text "100 damage. Energy attached to Moltres."
            energyCost R, R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PALKIA_11:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness L, PLUS20
          move "", {
            text "If damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Zone Shift", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pearl Blast", {
            text "60 damage. You may return an Energy card attached to Palkia to your hand. If you do, choose an Energy card attached to the Defending Pokémon and return it to your opponent’s hand."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PHIONE_12:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Evolution Wish", {
            text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Water Pulse", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ROTOM_13:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Dual Trans", {
            text "Search your discard pile for up to 2 basic Energy cards and attach them to 1 of your Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Reflect Energy", {
            text "30 damage. Move an Energy card attached to Rotom to 1 of your Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZAPDOS_14:
        return basic (this, hp:HP100, type:LIGHTNING, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          pokePower "Sheet Lightning", {
            text "Once during your turn, when you put Zapdos from your hand onto your Bench, you may flip a coin. If heads, put 1 damage counter on each of your opponent’s Pokémon."
            actionA {
            }
          }
          move "Raging Thunder", {
            text "80 damage. Does 40 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AERODACTYL_15:
        return evolution (this, from:"Old Amber", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Primal Claw", {
            text "After your opponent’s Pokémon uses a Poké-Power, put 2 damage counters on that Pokémon."
            delayedA {
            }
          }
          move "Supersonic", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply CONFUSED }
            }
          }

        };
      case BRONZONG_16:
        return evolution (this, from:"Bronzor", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          resistance R, MINUS20
          pokeBody "Cursed Alloy", {
            text "As long as Bronzong is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon that has any Poké-Powers between turns."
            delayedA {
            }
          }
          move "Pain Amplifier", {
            text "Put 1 damage counter on each of your opponent’s Pokémon that already has damage counters on it"
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Coating", {
            text "60 damage. ."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EMPOLEON_17:
        return evolution (this, from:"Prinplup", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Dual Splash", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surf Together", {
            text "50+ damage. Does 50 damage plus 10 more damage for each of your Benched Pokémon. Flip a coin. If tails, this attack does 10 damage to each of your Benched Pokémon."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ESPEON_18:
        return evolution (this, from:"Eevee", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Sunlight Veil", {
            text "Each of your Pokémon that evolves from Eevee gets +20 HP. You can’t use more than 1 Sunlight Veil Poké-Body each turn."
            delayedA {
            }
          }
          move "Morning Sun", {
            text "60 damage. You may move an Energy card attached to Espeon to 1 of your Benched Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FLAREON_19:
        return evolution (this, from:"Eevee", hp:HP090, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Fire Fang", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Kindle", {
            text "70 damage. Discard an Energy card attached to Flareon and then discard an Energy card attached to the Defending Pokémon."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLACEON_20:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Ice Shot", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Icy Wind", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HIPPOWDON_21:
        return evolution (this, from:"Hippopotas", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          move "Vacuum Sand", {
            text "20 damage. Energy card and attach it to Hippowdon."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sand Impact", {
            text "50+ damage. Energy attached to Hippowdon. This attack does 50 damage plus 20 more damage for each heads."
            energyCost F, C, C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case INFERNAPE_22:
        return evolution (this, from:"Monferno", hp:HP110, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          move "Mach Punch", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mega Bravo", {
            text "40× damage. Energy you discarded."
            energyCost R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case JOLTEON_23:
        return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Fang", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }
          move "Lightning Strike", {
            text "50 damage. You may discard 2 Energy attached to Jolteon. If you do, this attack’s base damage is 90 instead of 50."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LEAFEON_24:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Sprial Drain", {
            text "40 damage. Remove 1 damage counter from Leafeon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Leaf Blade", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip { damage 20 }
            }
          }

        };
      case MINUN_25:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Pound", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "(+) Spark", {
            text "20 damage. If Plusle is on your Bench, this attack does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case OMASTAR_26:
        return evolution (this, from:"Omanyte", hp:HP110, type:WATER, retreatCost:1) {
          weakness G, PLUS30
          pokePower "Primal Swirl", {
            text "Once during your turn, when you play Omastar from your hand to evolve 1 of your Pokémon, you may remove the highest Stage Evolution card from each of your opponent’s Benched Evolved Pokémon and put those cards back into his or her hand. You can’t use more than 1 Primal Swirl Poké-Power each turn."
            actionA {
            }
          }
          move "Send Back", {
            text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PHIONE_27:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Charm", {
            text "."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Whirlpool", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30
              flip { discardDefendingEnergy() }
            }
          }

        };
      case PLUSLE_28:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "(-) Boost", {
            text "20 damage. If Minun is on your Bench, this attack does 20 damage plus 20 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCIZOR_29:
        return evolution (this, from:"Scyther", hp:HP090, type:METAL, retreatCost:1) {
          weakness R, PLUS30
          resistance P, MINUS20
          move "Special Blow", {
            text "30+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 30 damage plus 50 more damage."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "X-Scissor", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 40 more damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip { damage 40 }
            }
          }

        };
      case TORTERRA_30:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          move "Earthquake", {
            text "60 damage. Does 10 damage to each of your Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Frenzy Plant", {
            text "100 damage. Torterra can’t use Frenzy Plant during your next turn."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOXICROAK_31:
        return evolution (this, from:"Croagunk", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Paralyze Poison", {
            text "20 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slash", {
            text "60 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UMBREON_32:
        return evolution (this, from:"Eevee", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokeBody "Moonlight Veil", {
            text "Each of your Pokémon that evolves from Eevee has no Weakness, and that Pokémon’s Retreat Cost is 0."
            delayedA {
            }
          }
          move "Confuse Ray", {
            text "50 damage. The Defending Pokémon is now Confused."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_P_33:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "PUT", {
            text "Once during your turn , if Unown P is on your Bench, you may put 1 damage counter on 1 of your Pokémon (excluding any Unown)."
            actionA {
            }
          }
          move "Hidden Power", {
            text "20+ damage. Each player discards the top card of his or her deck. This attack does 20 damage plus 20 more damage for each Unown discarded in this way."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VAPOREON_34:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Cleanse Away", {
            text "30 damage. Remove 2 damage counters from each of your Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hyper Whirlpool", {
            text "60 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AMBIPOM_35:
        return evolution (this, from:"Aipom", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Astonish", {
            text "20 damage. Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Hang High", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FEAROW_36:
        return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Fury Attack", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Drill Peck", {
            text "60 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GROTLE_37:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Planting", {
            text "20 damage. Energy card from your hand to 1 of your Pokémon."
            energyCost C, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Body Slam", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G, G
            attackRequirement {}
            onAttack {
              damage 40
              flip { apply PARALYZED }
            }
          }

        };
      case KANGASKHAN_38:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS20
          move "Bite", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Comet Punch", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LICKITUNG_39:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Lap Up", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Slam", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MANECTRIC_40:
        return evolution (this, from:"Electrike", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Wave", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }
          move "Volt Crush", {
            text "40+ damage. Flip a coin. If heads, discard an Energy attached to Manectric and this attack does 40 damage plus 30 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MONFERNO_41:
        return evolution (this, from:"Chimchar", hp:HP070, type:FIRE, retreatCost:0) {
          weakness W
          move "Fire Fang", {
            text "30 damage. The Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mid-air Strike", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { damage 30 }
            }
          }

        };
      case MOTHIM_42:
        return evolution (this, from:"Burmy", hp:HP080, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS30
          pokeBody "Disturbance Scales:", {
            text "Any damage done by attacks from your Pokémon to the Defending Pokémon isn’t affected by Resistance."
            delayedA {
            }
          }
          move "Get Help", {
            text "30× damage. Does 30 damage times the number of different types of Wormadam on your Bench."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Quick Touch", {
            text "40 damage. You may switch Mothim with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Mothim as you like to the new Active Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PACHIRISU_43:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Trans Tail", {
            text "Energy card, show it to your opponent, and put it into your hand."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thundershock", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }

        };
      case PRINPLUP_44:
        return evolution (this, from:"Piplup", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Ice Blade", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Wash Over", {
            text "50 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_45:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Agilty", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Raichu during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunderbolt", {
            text "100 damage. Discard all Energy cards attached to Raichu."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCYTHER_46:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Slash", {
            text "10 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Cutter", {
            text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
              flip 3,{},{}, [ 1:{damage 10}, 2:{damage 20}, 3:{damage 40} ]
            }
          }

        };
      case STARAVIA_47:
        return evolution (this, from:"Starly", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }
          move "Drill Peck", {
            text "50 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SUDOWOODO_48:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS20
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Sudowoodo."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Wood Hammer", {
            text "50 damage. Sudowoodo does 30 damage to itself."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_Q_49:
        return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS10
          pokePower "QUICK", {
            text "Once during your turn , if Unown Q is on your Bench, you may discard all cards attached to Unown Q and attach Unown Q to 1 of your Pokémon as a Pokémon Tool card. As long as Unown Q is attached to a Pokémon, you pay less to retreat that Pokémon."
            actionA {
            }
          }
          move "Hidden Power", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AIPOM_50:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Hand Trick", {
            text "20 damage. Return Aipom and all cards attached to it to your hand. (If you don’t have any Benched Pokémon, this attack does nothing.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              if (my.bench.notEmpty) {
                damage 20
                self.cards.moveTo(hand)
                removePCS(self)
              }
            }
          }

        };
      case AIPOM_51:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Last Resort", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BRONZOR_52:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance R, MINUS20
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Confuse Ray", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply CONFUSED }
            }
          }

        };
      case BUNEARY_53:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Drawup Power", {
            text "Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterwards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Extend Ears", {
            text "10 damage. Remove 1 damage counter from each of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BURMY_SANDY_CLOAK_54:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Iron Defense", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Burmy Sandy Cloak during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tackle", {
            text "30 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHATOT_55:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Mimic", {
            text "Shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Chatter", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHIMCHAR_56:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Flare", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Lunge", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHIMCHAR_57:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "", {
            text "If damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Swipes 10× damage", {
            text "Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHINGLING_58:
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
          move "Uproar", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBEE_59:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Honey Scent", {
            text "Remove 2 damage counters from 1 of your Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flitter", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CROAGUNK_60:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Light Punch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poison Sting", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }

        };
      case DRIFLOON_61:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Delivery", {
            text "Flip a coin. If heads, put any 1 card from your discard pile into your hand."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Reaction", {
            text "20 damage. Switch Drifloon with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EEVEE_62:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for as many Eevee as you like and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            callForFamily(basic:true, 1, delegate)
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EEVEE_63:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F
          resistance F
          move "Gnaw", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ELECTRIKE_64:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Random Spark", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLAMEOW_65:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterwards."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Rip Claw", {
            text "10 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HIPPOPOTAS_66:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS10
          move "Grainy Sand", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
          move "Double-edge", {
            text "40 damage. Hippopotas does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              damage 10, self
            }
          }

        };
      case KABUTO_67:
        return evolution (this, from:"Helix Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Ancient Guidance", {
            text "Once during your turn , you may flip a coin. If heads, search your deck for Helix Fossil, Dome Fossil, or Old Amber and put it onto your Bench. Shuffle your deck afterward. This power can’t be used if Kabuto is affected by a Special Condition."
            actionA {
            }
          }
          move "Shell Attack", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MUNCHLAX_68:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
            actionA {
              assert my.hand.findAll{it.name.contains("Snorlax")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Snorlax") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Lick", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case OMANYTE_69:
        return evolution (this, from:"Helix Fossil", hp:HP070, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Call Up", {
            text "Once during your turn , you may flip a coin. If heads, search your discard pile for Helix Fossil, Dome Fossil, or Old Amber and put it onto your Bench. This power can’t be used if Omanyte is affected by a Special Condition."
            actionA {
            }
          }
          move "Wash Over", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIKACHU_70:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
          move "Volt Tackle", {
            text "50 damage. Pikachu does 10 damage to itself."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIPLUP_71:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Water Splash", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PIPLUP_72:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "", {
            text "If damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Splatter", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHELLOS_EAST_SEA_73:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Surf", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Muddy Water", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SPEAROW_74:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Wing Attack", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Claw", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
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
          move "Whirlwind", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              whirlwind()
            }
          }
          move "Flap", {
            text "20 damage. "
            energyCost C, C
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
          move "Poison Gas", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost D
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
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
      case TURTWIG_77:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Rollout", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Razor Leaf", {
            text "30 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TURTWIG_78:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "", {
            text "If damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite", {
            text "30 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DAWN_STADIUM_79:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player attaches an Energy card from his or her hand to [G] Pokémon or [W] Pokémon, remove 1 damage counter and all Special Conditions from that Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case DUSK_BALL_80:
        return basicTrainer (this) {
          text "Look at the 7 cards from the bottom of your deck. Choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. Put the remaining cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_RESTORE_81:
        return basicTrainer (this) {
          text "Flip 3 coins. For each heads, put a Basic Energy card from your discard pile into your hand. If you don’t have that many basic Energy cards in your discard pile, put all of them into your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case FOSSIL_EXCAVATOR_82:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck or discard pile for a Trainer card that has Fossil in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil. Show it to your opponent and put it into your hand. If you searched your deck, shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case MOM_S_KINDNESS_83:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case OLD_AMBER_84:
        return basicTrainer (this) {
          text "Play Old Amber as if it were a [C] Basic Pokémon. (Old Amber counts as a Trainer card as well, but if Old Amber is Knocked Out, this counts as a Knocked Out Pokémon.) Old Amber can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Old Amber from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Hard Amber As long as Old Amber is on your Bench, prevent all damage done to Old Amber by attacks (both yours and your opponent’s)."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_BALL_85:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case QUICK_BALL_86:
        return basicTrainer (this) {
          text "Reveal cards from your deck until you reveal a Pokémon. Show that Pokémon to your opponent and put it into your hand. Shuffle the other revealed cards back into your deck. (If you don’t reveal a Pokémon, shuffle all the revealed cards back into your deck.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case SUPER_SCOOP_UP_87:
        return basicTrainer (this) {
          text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case WARP_POINT_88:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case DOME_FOSSIL_89:
        return basicTrainer (this) {
          text "Play Dome Fossil as if it were a [C] Basic Pokémon. (Dome Fossil counts as a Trainer card as well, but if Dome Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Dome Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Dome Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Rock Reaction When you attach a [F] Energy card from your hand to Dome Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Dome Fossil and put it onto Dome Fossil (this counts as evolving Dome Fossil). Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_SEARCH_90:
        return basicTrainer (this) {
          text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case HELIX_FOSSIL_91:
        return basicTrainer (this) {
          text "Play Helix Fossil as if it were a [C] Basic Pokémon. (Helix Fossil counts as a Trainer card as well, but if Helix Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Helix Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Helix Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Aqua Reaction When you attach a [W] Energy card from your hand to Helix Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Helix Fossil and put it onto Helix Fossil (this counts as evolving Helix Fossil). Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case CALL_ENERGY_92:
        return specialEnergy (this, [[C]]) {
          text "Call Energy provides [C] Energy. Once during your turn, if the Pokémon Call Energy is attached to is your Active Pokémon, you may search your deck for up to 2 Basic Pokémon and put them onto your Bench. If you do, shuffle your deck and your turn ends."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case DARKNESS_ENERGY_93:
        return specialEnergy (this, [[C]]) {
          text "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect if the Pokémon that Darkness Energy is attached to isn’t [D]. Darkness Energy provides [D] Energy. (Doesn’t count as a basic Energy card.)"
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case HEALTH_ENERGY_94:
        return specialEnergy (this, [[C]]) {
          text "Health Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove 1 damage counter from that Pokémon."
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
          text "Damage done by attacks to the Pokémon that Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that Metal Energy is attached to isn’t [M]. Metal Energy provides [M] Energy. (Doesn’t count as a basic Energy card.)"
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case RECOVER_ENERGY_96:
        return specialEnergy (this, [[C]]) {
          text "Recover Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove all Special Conditions from that Pokémon."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case GARCHOMP_LV_X_97:
        return evolution (this, from:"Garchomp", hp:HP140, type:COLORLESS, retreatCost:0) {
          weakness C
          pokePower "Dragon Pulse", {
            text "Once during your turn , when you put Garchomp LV. from your hand onto your Active Garchomp, you may flip 3 coins. For each heads, put 1 damage counter on each of your opponent’s Benched Pokémon."
            actionA {
            }
          }
          move "Restore", {
            text ") and put it onto your Bench as a Basic Pokémon. Then, you may search your discard pile for up to 3 basic Energy cards and attach them to that Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Garchomp. Garchomp LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLACEON_LV_X_98:
        return evolution (this, from:"Glaceon", hp:HP100, type:WATER, retreatCost:1) {
          weakness M, PLUS30
          pokeBody "Chilly Breath", {
            text "As long as Glaceon is your Active Pokémon, your opponent’s Pokémon can’t use any Poké-Powers."
            delayedA {
            }
          }
          move "Avalache", {
            text "70 damage. Flip a coin. If heads, this attack does 20 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Glaceon. Glaceon LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LEAFEON_LV_X_99:
        return evolution (this, from:"Leafeon", hp:HP110, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokePower "Energy Forcing", {
            text "Once during your turn , you may attach an Energy card from your hand to 1 of your Pokémon. This power can’t be used if Leafeon is affected by a Special Condition."
            actionA {
            }
          }
          move "Verdant Force", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to all of your Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Leafeon. Leafeon LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PORYGON_Z_LV_X_100:
        return evolution (this, from:"Porygon Z", hp:HP130, type:COLORLESS, retreatCost:2) {
          weakness F
          pokePower "Mode Crash", {
            text "Once during your turn , when you put Porygon-Z LV. from your hand onto your Active Porygon-Z, you may discard all of your opponent’s Special Energy cards in play."
            actionA {
            }
          }
          pokePower "Decode", {
            text "Once during your turn , you may search your deck for any 2 cards and shuffle your deck afterward. Then, put those cards on top of your deck in any order. This power can’t be used if Porygon-Z is affected by a Special Condition."
            actionA {
            }
          }
          move "", {
            text "Put this card onto your Active Porygon Z. Porygon-Z LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
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
