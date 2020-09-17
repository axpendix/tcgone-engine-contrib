package tcgwars.logic.impl.gen8;

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
public enum ChampionsPath implements LogicCardInfo {

  VENUSAUR_V_1 ("Venusaur V", 1, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  WEEDLE_2 ("Weedle", 2, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KAKUNA_3 ("Kakuna", 3, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BEEDRILL_4 ("Beedrill", 4, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ELDEGOSS_5 ("Eldegoss V", 5, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  VULPIX_6 ("Vulpix", 6, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  VICTINI_7 ("Victini", 7, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  INCINEROAR_V ("Incineroar V", 8, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  SIZZLIPEDE_9 ("Sizzlipede", 9, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CENTISKORCH_10 ("Centiskorch", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CARVANHA_11 ("Carvanha", 11, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SHARPEDO_12 ("Sharpedo", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WAILORD_V_13 ("Wailord V", 13, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  DREDNAW_V_14 ("Drednaw V", 14, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  DREDNAW_VMAX_15 ("Drednaw VMAX", 15, Rarity.ULTRARARE, [POKEMON, VMAX, EVOLUTION, _WATER_]),
  GARDEVOIR_V_16 ("Gardevoir V", 16, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GARDEVOIR_VMAX_17 ("Gardevoir VMAX", 17, Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  HATENNA_18 ("Hatenna", 18, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HATTREM_19 ("Hattrem", 19, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HATTERENE_20 ("Hatterene", 20, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GALARIAN_CURSOLA_V_21 ("Galarian Cursola V", 21, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ALCREMIE_V_22 ("Alcremie V", 22, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ALCREMIE_VMAX_23 ("Alcremie VMAX", 23, Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  MACHOP_24 ("Machop", 24, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MACHOKE_25 ("Machoke", 25, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MACHAMP_26 ("Machamp", 26, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  LUCARIO_27 ("Lucario", 27, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  ZYGARDE_28 ("Zygarde", 28, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  ROCKRUFF_29 ("Rockruff", 29, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  LYCANROC_30 ("Lycanroc", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ROLYCOLY_31 ("Rolycoly", 31, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_V_32 ("Grapploct V", 32, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  EKANS_33 ("EKans", 33, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ARBOK_34 ("Arbok", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_ZIGZAGOON_35 ("Galarian Zigzagoon", 35, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_LINOONE_36 ("Galarian Linoone", 36, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_OBSTAGOON_37 ("Galarian Obstagoon", 37, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  ABSOL_38 ("Absol", 38, Rarity.UNCOMMON, [POKEMON, BASIC, _DARKNESS_]),
  PURRLION_39 ("Purrloin", 39, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  LIEPARD_40 ("Liepard", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SCRAGGY_41 ("Scraggy", 41, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SCRAFTY_42 ("Scrafty", 42, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  TRUBBISH_43 ("Trubbish", 43, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  INKAY_44 ("Inkay", 44, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MALAMAR_45 ("Malamar", 45, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  NICKIT_46 ("Nickit", 46, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  DURALUDON_V_47 ("Duraludon V", 47, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  SWABLU_48 ("Swablu", 48, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  ALTARIA_49 ("Altaria", 49, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BEDE_50 ("Bede", 50, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FULL_HEAL_51 ("Full Heal", 51, Rarity.UNCOMMON, [TRAINER, ITEM]),
  GREAT_BALL_52 ("Great Ball", 52, Rarity.UNCOMMON, [TRAINER, ITEM]),
  HOP_53 ("Hop", 53, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HYPER_POTION_54 ("Hyper Potion", 54, Rarity.UNCOMMON, [TRAINER]),
  KABU_55 ("Kabu", 55, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MARNIE_56 ("Marnie", 56, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  MILO_57 ("Milo", 57, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PIERS_58 ("Piers", 58, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKE_BALL_59 ("Poké Ball", 59, Rarity.COMMON, [TRAINER, ITEM]),
  POKEMON_CENTER_LADY_60 ("Pokémon Center Lady", 60, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POTION_61 ("Potion", 61, Rarity.COMMON, [TRAINER, ITEM]),
  PROFESSOR_S_RESEARCH_62 ("Professor's Research", 62, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ROTOM_BIKE_63 ("Rotom Bike", 63, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ROTOM_PHONE_64 ("Rotom Phone", 64, Rarity.UNCOMMON, [TRAINER, ITEM]),
  SONIA_65 ("Sonia", 65, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STRANGE_CANNED_FOOD_66 ("Strange Canned Food", 66, Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_YELL_GRUNT_67 ("Team Yell Grunt", 67, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TURRFIELD_68 ("Turffield Stadium", 68, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DREDNAW_V_69 ("Drednaw V", 69, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GARDEVOIR_V_70 ("Gardevoir V", 70, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_CURSOLA_V_71 ("Galarian Cursola V", 71, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GRAPPLOCT_V_72 ("Grapploct V", 72, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  HOP_73 ("Hop", 73, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CHARIZARD_VMAX_74 ("Charizard VMAX", 74, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _FIRE_]),
  DREDNAW_VMAX_75 ("Drednaw VMAX", 75, Rarity.SECRET, [POKEMON, VMAX, EVOLUTION, _WATER_]),
  GARDEVOIR_VMAX_76 ("Gardevoir VMAX", 76, Rarity.SECRET, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  KABU_77 ("Kabu", 77, Rarity.SECRET, [TRAINER, SUPPORTER]),
  PIERS_78 ("Piers", 78, Rarity.SECRET, [TRAINER, SUPPORTER]),
  CHARIZARD_V_79 ("Charizard V", 79, Rarity.SECRET, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  STRANGE_CANNED_FOOD_80 ("Strange Canned Food", 80, Rarity.SECRET, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  ChampionsPath(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  String getNumber() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.CHAMPIONS_PATH;
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
      case VENUSAUR_V_1:
      return basic (this, hp:HP220, type:G, retreatCost:3) {
        weakness R
        move "Pollen Bomb", {
          text "The opponent’s Active Pokémon is now Poisoned and Asleep."
          energyCost G, G, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Solar Typhoon", {
          text "220 damage. This Pokémon can’t use Solar Typhoon during your next turn."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 220
          }
        }
      };
      case WEEDLE_2:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Call for Family", {
          text "Search your deck for a Basic Pokemon and put it on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case KAKUNA_3:
      return evolution (this, from:"Weedle", hp:HP060, type:G, retreatCost:3) {
        weakness R
        move "Bug Bite", {
          text "30 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BEEDRILL_4:
      return evolution (this, from:"Kakuna", hp:HP140, type:G, retreatCost:1) {
        weakness R
        move "Poison Jab", {
          text "80 damage. Your opponent’s Active Pokemon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case ELDEGOSS_5:
      return copy (RebelClash.ELDEGOSS_19, this);
      case VULPIX_6:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Gnaw", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Singe", {
          text "Your opponent's Active Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case VICTINI_7:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Draw", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Combustion", {
          text "30 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case INCINEROAR_V:
      return basic (this, hp:HP220, type:R, retreatCost:3) {
        weakness R
        move "Grand Flame", {
          text "90 damage. Attach up to 2 [R] Energy cards from your discard pile to 1 of your Benched Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Flare Blitzer", {
          text "90 damage. This Pokémon also does 30 damage to itself."
          energyCost R, R, R, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case SIZZLIPEDE_9:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Bite", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Combustion", {
          text "50 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CENTISKORCH_10:
      return evolution (this, from:"Sizzlipede", hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Searing Flame", {
          text "50 damage. Your opponent's Active Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Heat Crawler", {
          text "140 damage."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case CARVANHA_11:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Bite", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHARPEDO_12:
      return evolution (this, from:"Carvanha", hp:HP110, type:W, retreatCost:1) {
        weakness L
        move "Aqua Jet", {
          text "50 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case WAILORD_V_13:
      return basic (this, hp:HP280, type:W, retreatCost:4) {
        weakness L
        move "Draw Up", {
          text "Attach up to 3 [W] Energy cards from your discard pile to this Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Ocean Waves", {
          text "120x damage. Flip 3 coins. This attack does 120 damage for each heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case DREDNAW_V_14:
      return basic (this, hp:HP210, type:W, retreatCost:4) {
        weakness L
        bwAbility "Solid Shell", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "Powerful Bite", {
          text "During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost W, W, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DREDNAW_VMAX_15:
      return evolution (this, from:"Drednaw V", hp:HP320, type:W, retreatCost:4) {
        weakness L
        bwAbility "Solid Shell", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "G-Max Headbutt", {
          text "160+ damage. Flip a coin. If heads, this attack does 80 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case GARDEVOIR_V_16:
      return basic (this, hp:HP210, type:P, retreatCost:2) {
        weakness M
        move "Magical Shot", {
          text "30 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Swelling Pulse", {
          text "120+ damage. If this Pokémon was healed during this turn, this attack does 80 more damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case GARDEVOIR_VMAX_17:
      return evolution (this, from:"Gardevoir V", hp:HP320, type:P, retreatCost:2) {
        weakness M
        move "Max Cure", {
          text "180 damage. Heal 50 damage from this Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case HATENNA_18:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Stampede", {
          text "10 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Magical Shot", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HATTREM_19:
      return evolution (this, from:"Hatenna", hp:HP090, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Beat", {
          text "20 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Psy Bolt", {
          text "40 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case HATTERENE_20:
      return evolution (this, from:"Hattrem", hp:HP150, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Hazard Sensor", {
          text "If this Pokémon is in the Active Spot and is damaged by an attack from your opponent's Pokémon (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Confused."
          actionA {
          }
        }
        move "Life Sucker", {
          text "100 damage. Heal 30 damage from this Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case GALARIAN_CURSOLA_V_21:
      return basic (this, hp:HP190, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Gnawing Aura", {
          text "As long as this Pokémon is in the Active Spot, whenever your opponent attaches an Energy card from their hand to 1 of their Pokémon, put 3 damage counters on that Pokémon."
          actionA {
          }
        }
        move "Hollow Missile", {
          text "60 damage. Put 3 damage counters on your opponent's Benched Pokémon in any way you like."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ALCREMIE_V_22:
      return basic (this, hp:HP170, type:P, retreatCost:2) {
        weakness M
        move "Sugary Sprinkles", {
          text "Heal 30 damage from each of your Benched Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Sweet Splash", {
          text "100 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case ALCREMIE_VMAX_23:
      return evolution (this, from:"Alcremie V", hp:HP310, type:P, retreatCost:3) {
        weakness M
        move "Adornment", {
          text "For each of your Benched Pokémon, search your deck for a [P] Energy card and attach it to that Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "G-Max Whisk", {
          text "60x damage. Discard any amount of Energy from your Pokémon. This attack does 60 damage for each card you discarded in this way."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MACHOP_24:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness P
        move "Low Kick", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steady Punch", {
          text "20+ damage. Flip a coin. If heads, this attack does 40 more damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOKE_25:
      return evolution (this, from:"Machop", hp:HP110, type:F, retreatCost:3) {
        weakness P
        move "Low Kick", {
          text "30 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Pummel", {
          text "50+ damage. Flip a coin. If heads, this attack does 70 more damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MACHAMP_26:
      return evolution (this, from:"Machoke", hp:HP170, type:F, retreatCost:3) {
        weakness P
        move "Macho Revenge", {
          text "20x damage. This attack does 20 damage for each Fighting Pokémon in your discard pile."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Dynamite Punch", {
          text "200 damage. This Pokémon also does 50 damage to itself."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case LUCARIO_27:
      return basic (this, hp:HP210, type:F, retreatCost:2) {
        weakness P
        move "Aura Sphere", {
          text "40 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Beatdown Smash", {
          text "180 damage. During your next turn, this Pokémon can't use Beatdown Smash."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case ZYGARDE_28:
      return basic (this, hp:HP140, type:F, retreatCost:3) {
        weakness G
        move "Bite", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Power Blast", {
          text "130 damage. Discard a [F] Energy from this Pokémon."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case ROCKRUFF_29:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Collect", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bite", {
          text "20 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LYCANROC_30:
      return evolution (this, from:"Rockruff", hp:HP120, type:F, retreatCost:2) {
        weakness G
        move "Rock Throw", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Slashing Strike", {
          text "150 damage. During your next turn, this Pokémon can't use Slashing Strike."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case ROLYCOLY_31:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GRAPPLOCT_V_32:
      return basic (this, hp:HP210, type:F, retreatCost:2) {
        weakness P
        move "Tie Up", {
          text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Moonsault Press", {
          text "120+ damage. Flip a coin. If heads, this attack does 100 more damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case EKANS_33:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tail Snap", {
          text "30 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARBOK_34:
      return evolution (this, from:"Ekans", hp:HP120, type:D, retreatCost:1) {
        weakness F
        move "Sharp Fang", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Tail Snap", {
          text "70 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GALARIAN_ZIGZAGOON_35:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness G
        move "Pin Missile", {
          text "Flip 4 coins. This attack does 10 damage for each heads."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GALARIAN_LINOONE_36:
      return evolution (this, from:"Galarian Zigzagoon", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Double-Edge", {
          text "60 damage. This Pokémon also does 20 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GALARIAN_OBSTAGOON_37:
      return evolution (this, from:"Galarian Linoone", hp:HP170, type:D, retreatCost:2) {
        weakness G
        bwAbility "Wicked Ruler", {
          text "Once during your turn, you may have your opponent discard cards from their hand until they have 4 cards in their hand."
          actionA {
          }
        }
        move "Knuckle Impact", {
          text "180 damage. During your next turn, this Pokémon can't attack."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case ABSOL_38:
      return basic (this, hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Dark Cutter", {
          text "70 damage."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case PURRLION_39:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Dig Claws", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fake Out", {
          text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIEPARD_40:
      return copy (DarknessAblaze.LIEPARD_107, this);
      case SCRAGGY_41:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Stampede", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SCRAFTY_42:
      return evolution (this, from:"Scraggy", hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Corner", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Bad Brawl", {
          text "110 damage. If you played Piers from your hand during this turn, this attack does 90 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case TRUBBISH_43:
      return copy (RebelClash.TRUBBISH_117, this);
      case INKAY_44:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness G
        move "Tackle", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Attack from Behind", {
          text "20+ damage. If your opponent's Active Pokémon is Confused, this attack does 50 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MALAMAR_45:
      return evolution (this, from:"Inkay", hp:HP120, type:D, retreatCost:3) {
        weakness G
        move "Eerie Wave", {
          text "50 damage. Your opponent's Active Pokémon is now Confused."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Random Peck", {
          text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case NICKIT_46:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Filch", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Smack", {
          text "30 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DURALUDON_V_47:
      return basic (this, hp:HP220, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Hard Coat", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          actionA {
          }
        }
        move "Gatling Slug", {
          text "10+ damage. This attack does 40 more damage for each [M] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SWABLU_48:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ALTARIA_49:
      return evolution (this, from:"Swablu", hp:HP110, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Miraculous Charm", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon V and Pokémon-GX."
          actionA {
          }
        }
        move "Speed Dive", {
          text "60 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case BEDE_50:
      return copy (SwordShield.BEDE_157, this);
      case FULL_HEAL_51:
      return copy (RebelClash.FULL_HEAL_159, this);
      case GREAT_BALL_52:
      return copy (RebelClash.GREAT_BALL_52, this);
      case HOP_53:
      return copy (SwordShield.HOP_165, this);
      case HYPER_POTION_54:
      return copy (SwordShield.HYPER_POTION_166, this);
      case KABU_55:
      return copy (DarknessAblaze.KABU_163, this);
      case MARNIE_56:
      return copy (SwordShield.MARNIE_169, this);
      case MILO_57:
      return copy (RebelClash.MILO_161, this);
      case PIERS_58:
      return copy (RebelClash.PIERS_165, this);
      case POKE_BALL_59:
      return copy (RebelClash.POKE_BALL_164, this);
      case POKEMON_CENTER_LADY_60:
      return copy(SwordShield.POKEMON_CENTER_LADY_176, this);
      case POTION_61:
      return copy (SwordShield.POTION_177, this);
      case PROFESSOR_S_RESEARCH_62:
      return copy (SwordShield.PROFESSOR_S_RESEARCH_178, this);
      case ROTOM_BIKE_63:
      return copy (SwordShield.ROTOM_BIKE_181, this);
      case ROTOM_PHONE_64:
      return itemCard (this) {
        text "Look at the top 5 cards of your deck. Choose a card you find there, shuffle your deck, then put that card on top of your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case SONIA_65:
      return copy (RebelClash.SONIA_167, this);
      case STRANGE_CANNED_FOOD_66:
      return itemCard (this) {
        text "Heal 80 damage from 1 of your Pokemon with a [P] Energy attached to it. Then, discard a [P] Energy from that Pokemon."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_YELL_GRUNT_67:
      return copy (SwordShield.TEAM_YELL_GRUNT_184, this);
      case TURRFIELD_68:
      return copy (RebelClash.TURRFIELD_170, this);
      case DREDNAW_V_69:
      return copy (DREDNAW_V_14, this);
      case GARDEVOIR_V_70:
      return copy (GARDEVOIR_V_16, this);
      case GALARIAN_CURSOLA_V_71:
      return copy (GALARIAN_CURSOLA_V_21, this);
      case GRAPPLOCT_V_72:
      return copy (GRAPPLOCT_V_32, this);
      case HOP_73:
      return copy (HOP_53, this);
      case CHARIZARD_VMAX_74:
      return copy (DarknessAblaze.CHARIZARD_VMAX_20, this);
      case DREDNAW_VMAX_75:
      return copy (DREDNAW_VMAX_15, this);
      case GARDEVOIR_VMAX_76:
      return copy (GARDEVOIR_VMAX_17, this);
      case KABU_77:
      return copy (KABU_55, this);
      case PIERS_78:
      return copy (PIERS_58, this);
      case CHARIZARD_V_79:
      return copy (DarknessAblaze.CHARIZARD_V_19, this);
      case STRANGE_CANNED_FOOD_80:
      return copy (STRANGE_CANNED_FOOD_66, this);
      default:
      return null;
    }
  }
}
