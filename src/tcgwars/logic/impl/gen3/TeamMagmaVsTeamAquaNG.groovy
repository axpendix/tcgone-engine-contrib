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
public enum TeamMagmaVsTeamAquaNG implements LogicCardInfo {

  TEAM_AQUA_S_CACTURNE_1 ("Team Aqua's Cacturne", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_, _DARKNESS_]),
  TEAM_AQUA_S_CRAWDAUNT_2 ("Team Aqua's Crawdaunt", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _DARKNESS_]),
  TEAM_AQUA_S_KYOGRE_3 ("Team Aqua's Kyogre", "3", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_, _DARKNESS_]),
  TEAM_AQUA_S_MANECTRIC_4 ("Team Aqua's Manectric", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_, _DARKNESS_]),
  TEAM_AQUA_S_SHARPEDO_5 ("Team Aqua's Sharpedo", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_, _DARKNESS_]),
  TEAM_AQUA_S_WALREIN_6 ("Team Aqua's Walrein", "6", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_, _DARKNESS_]),
  TEAM_MAGMA_S_AGGRON_7 ("Team Magma's Aggron", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_, _DARKNESS_]),
  TEAM_MAGMA_S_CLAYDOL_8 ("Team Magma's Claydol", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_, _DARKNESS_]),
  TEAM_MAGMA_S_GROUDON_9 ("Team Magma's Groudon", "9", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_, _DARKNESS_]),
  TEAM_MAGMA_S_HOUNDOOM_10 ("Team Magma's Houndoom", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_, _DARKNESS_]),
  TEAM_MAGMA_S_RHYDON_11 ("Team Magma's Rhydon", "11", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_, _DARKNESS_]),
  TEAM_MAGMA_S_TORKOAL_12 ("Team Magma's Torkoal", "12", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_, _DARKNESS_]),
  RAICHU_13 ("Raichu", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TEAM_AQUA_S_CRAWDAUNT_14 ("Team Aqua's Crawdaunt", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TEAM_AQUA_S_MIGHTYENA_15 ("Team Aqua's Mightyena", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  TEAM_AQUA_S_SEALEO_16 ("Team Aqua's Sealeo", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TEAM_AQUA_S_SEVIPER_17 ("Team Aqua's Seviper", "17", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  TEAM_AQUA_S_SHARPEDO_18 ("Team Aqua's Sharpedo", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TEAM_MAGMA_S_CAMERUPT_19 ("Team Magma's Camerupt", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TEAM_MAGMA_S_LAIRON_20 ("Team Magma's Lairon", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TEAM_MAGMA_S_MIGHTYENA_21 ("Team Magma's Mightyena", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  TEAM_MAGMA_S_RHYDON_22 ("Team Magma's Rhydon", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TEAM_MAGMA_S_ZANGOOSE_23 ("Team Magma's Zangoose", "23", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  TEAM_AQUA_S_CACNEA_24 ("Team Aqua's Cacnea", "24", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_, _DARKNESS_]),
  TEAM_AQUA_S_CARVANHA_25 ("Team Aqua's Carvanha", "25", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_CORPHISH_26 ("Team Aqua's Corphish", "26", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_ELECTRIKE_27 ("Team Aqua's Electrike", "27", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TEAM_AQUA_S_LANTURN_28 ("Team Aqua's Lanturn", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TEAM_AQUA_S_MANECTRIC_29 ("Team Aqua's Manectric", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TEAM_AQUA_S_MIGHTYENA_30 ("Team Aqua's Mightyena", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  TEAM_AQUA_S_SEALEO_31 ("Team Aqua's Sealeo", "31", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TEAM_MAGMA_S_BALTOY_32 ("Team Magma's Baltoy", "32", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  TEAM_MAGMA_S_CLAYDOL_33 ("Team Magma's Claydol", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TEAM_MAGMA_S_HOUNDOOM_34 ("Team Magma's Houndoom", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TEAM_MAGMA_S_HOUNDOUR_35 ("Team Magma's Houndour", "35", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  TEAM_MAGMA_S_LAIRON_36 ("Team Magma's Lairon", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TEAM_MAGMA_S_MIGHTYENA_37 ("Team Magma's Mightyena", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  TEAM_MAGMA_S_RHYHORN_38 ("Team Magma's Rhyhorn", "38", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  BULBASAUR_39 ("Bulbasaur", "39", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CUBONE_40 ("Cubone", "40", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  JIGGLYPUFF_41 ("Jigglypuff", "41", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MEOWTH_42 ("Meowth", "42", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_43 ("Pikachu", "43", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PSYDUCK_44 ("Psyduck", "44", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SLOWPOKE_45 ("Slowpoke", "45", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SQUIRTLE_46 ("Squirtle", "46", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_CARVANHA_47 ("Team Aqua's Carvanha", "47", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_CARVANHA_48 ("Team Aqua's Carvanha", "48", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_CHINCHOU_49 ("Team Aqua's Chinchou", "49", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TEAM_AQUA_S_CORPHISH_50 ("Team Aqua's Corphish", "50", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_CORPHISH_51 ("Team Aqua's Corphish", "51", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_ELECTRIKE_52 ("Team Aqua's Electrike", "52", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TEAM_AQUA_S_ELECTRIKE_53 ("Team Aqua's Electrike", "53", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TEAM_AQUA_S_POOCHYENA_54 ("Team Aqua's Poochyena", "54", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TEAM_AQUA_S_POOCHYENA_55 ("Team Aqua's Poochyena", "55", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TEAM_AQUA_S_SPHEAL_56 ("Team Aqua's Spheal", "56", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_AQUA_S_SPHEAL_57 ("Team Aqua's Spheal", "57", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TEAM_MAGMA_S_ARON_58 ("Team Magma's Aron", "58", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_MAGMA_S_ARON_59 ("Team Magma's Aron", "59", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_MAGMA_S_BALTOY_60 ("Team Magma's Baltoy", "60", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_MAGMA_S_BALTOY_61 ("Team Magma's Baltoy", "61", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_MAGMA_S_HOUNDOUR_62 ("Team Magma's Houndour", "62", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TEAM_MAGMA_S_HOUNDOUR_63 ("Team Magma's Houndour", "63", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TEAM_MAGMA_S_NUMEL_64 ("Team Magma's Numel", "64", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TEAM_MAGMA_S_POOCHYENA_65 ("Team Magma's Poochyena", "65", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TEAM_MAGMA_S_POOCHYENA_66 ("Team Magma's Poochyena", "66", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  TEAM_MAGMA_S_RHYHORN_67 ("Team Magma's Rhyhorn", "67", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_MAGMA_S_RHYHORN_68 ("Team Magma's Rhyhorn", "68", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEAM_AQUA_SCHEMER_69 ("Team Aqua Schemer", "69", Rarity.COMMON, [TRAINER, SUPPORTER]),
  TEAM_MAGMA_SCHEMER_70 ("Team Magma Schemer", "70", Rarity.COMMON, [TRAINER, SUPPORTER]),
  ARCHIE_71 ("Archie", "71", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DUAL_BALL_72 ("Dual Ball", "72", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MAXIE_73 ("Maxie", "73", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STRENGTH_CHARM_74 ("Strength Charm", "74", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  TEAM_AQUA_BALL_75 ("Team Aqua Ball", "75", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_AQUA_BELT_76 ("Team Aqua Belt", "76", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  TEAM_AQUA_CONSPIRATOR_77 ("Team Aqua Conspirator", "77", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TEAM_AQUA_HIDEOUT_78 ("Team Aqua Hideout", "78", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TEAM_AQUA_S_TECHNICAL_MACHINE_01_79 ("Team Aqua's Technical Machine 01", "79", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_MAGMA_BALL_80 ("Team Magma Ball", "80", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_MAGMA_BELT_81 ("Team Magma Belt", "81", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  TEAM_MAGMA_CONSPIRATOR_82 ("Team Magma Conspirator", "82", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TEAM_MAGMA_HIDEOUT_83 ("Team Magma Hideout", "83", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TEAM_MAGMA_S_TECHNICAL_MACHINE_01_84 ("Team Magma's Technical Machine 01", "84", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WARP_POINT_85 ("Warp Point", "85", Rarity.UNCOMMON, [TRAINER, ITEM]),
  AQUA_ENERGY_86 ("Aqua Energy", "86", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  MAGMA_ENERGY_87 ("Magma Energy", "87", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  DOUBLE_RAINBOW_ENERGY_88 ("Double Rainbow Energy", "88", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BLAZIKEN_EX_89 ("Blaziken ex", "89", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIRE_]),
  CRADILY_EX_90 ("Cradily ex", "90", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _GRASS_]),
  ENTEI_EX_91 ("Entei ex", "91", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIRE_]),
  RAIKOU_EX_92 ("Raikou ex", "92", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _LIGHTNING_]),
  SCEPTILE_EX_93 ("Sceptile ex", "93", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _GRASS_]),
  SUICUNE_EX_94 ("Suicune ex", "94", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _WATER_]),
  SWAMPERT_EX_95 ("Swampert ex", "95", Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIGHTING_]),
  ABSOL_96 ("Absol", "96", Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  JIRACHI_97 ("Jirachi", "97", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  TeamMagmaVsTeamAquaNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.TEAM_MAGMA_VS_TEAM_AQUA;
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
      case TEAM_AQUA_S_CACTURNE_1:
      return evolution (this, from:"null", hp:HP080, type:[G, D], retreatCost:2) {
        weakness R
        move "Dark Bind", {
          text "10 damage. You may discard a [D] Energy card attached to Team Aqua's Cacturne. If you do, the Defending Pokémon is now Paralyzed."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Barb", {
          text "40 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_AQUA_S_CRAWDAUNT_2:
      return evolution (this, from:"null", hp:HP080, type:[W, D], retreatCost:1) {
        weakness L
        move "Aqua Reverse", {
          text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon that has Team Magma in its name and switch it with 1 of the Defending Pokémon. Your opponent chooses which Defending Pokémon to switch."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Deep Impact", {
          text "40 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Confused."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_AQUA_S_KYOGRE_3:
      return basic (this, hp:HP100, type:[W, D], retreatCost:3) {
        weakness G
        pokeBody "Power Saver", {
          text "As long as the number of Pokémon in play (both yours and your opponent's) that has Team Aqua in its name is 3 or less, Team Aqua's Kyogre can't attack."
          delayedA {
          }
        }
        move "Aqua Trip", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Asleep."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Smash", {
          text "50+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 50 damage plus 20 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_AQUA_S_MANECTRIC_4:
      return evolution (this, from:"null", hp:HP070, type:[L, D], retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Power Shift", {
          text "Once during your turn (before your attack), you may move any number of basic Energy cards attached to 1 of your Pokémon with Team Aqua in its name to another of your Pokémon. This power can't be used if Team Aqua's Manectric is affected by a Special Condition."
          actionA {
          }
        }
        move "Thunderspark", {
          text "50 damage. Does 10 damage to each Benched Pokémon (yours and your opponent's) that has Energy cards attached to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_AQUA_S_SHARPEDO_5:
      return evolution (this, from:"null", hp:HP070, type:[W, D], retreatCost:0) {
        weakness L
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Team Aqua's Sharpedo."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Slash", {
          text "60 damage. Team Aqua's Sharpedo can't attack during your next turn."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case TEAM_AQUA_S_WALREIN_6:
      return evolution (this, from:"null", hp:HP120, type:[W, D], retreatCost:2) {
        weakness F
        weakness M
        move "Power Blow", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Team Aqua's Walrein."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hydro Reverse", {
          text "50+ damage. You may return any number of basic [W] Energy cards attached to all of your Pokémon to your hand. If you do, this attack does 50 damage plus 10 more damage for each Energy you returned."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_AGGRON_7:
      return evolution (this, from:"null", hp:HP120, type:[F, D], retreatCost:2) {
        weakness G
        weakness W
        move "Crush", {
          text "30x damage. Flip a coin for each Energy attached to Team Magma's Aggron. This attack does 30 damage times the number of heads."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Land Stream", {
          text "50+ damage. You may discard any number of basic Energy cards attached to Team Magma's Aggron. If you do, this attack does 50 damage plus 20 more damage for each basic Energy card you discarded."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_CLAYDOL_8:
      return evolution (this, from:"null", hp:HP080, type:[P, D], retreatCost:2) {
        weakness P
        pokePower "Magma Switch", {
          text "Once during your turn (before your attack), you may move an Energy card attached to your Pokémon with Team Magma in its name to another of your Pokémon. This power can't be used if Team Magma's Claydol is affected by a Special Condition."
          actionA {
          }
        }
        move "Dark Hand", {
          text "40+ damage. If you have more cards in your hand than your opponent, this attack does 40 damage plus 20 more damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_MAGMA_S_GROUDON_9:
      return basic (this, hp:HP100, type:[F, D], retreatCost:3) {
        weakness G
        pokeBody "Power Saver", {
          text "As long as the number of Pokémon in play (both yours and your opponent's) that has Team Magma in its name is 3 or less, Team Magma's Groudon can't attack."
          delayedA {
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pulverize", {
          text "50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 20 more damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_HOUNDOOM_10:
      return evolution (this, from:"null", hp:HP070, type:[R, D], retreatCost:1) {
        weakness W
        move "Roasting Heat", {
          text "30+ damage. If the Defending Pokémon is Burned, this attack does 30 damage plus 20 more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Magma Spurt", {
          text "30x damage. Discard the top 5 cards from your deck. This attack does 30 damage times the number of Fire and Fighting basic Energy cards discarded in this way."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TEAM_MAGMA_S_RHYDON_11:
      return evolution (this, from:"null", hp:HP090, type:[F, D], retreatCost:2) {
        weakness G
        move "Magma Jab", {
          text "20 damage. This attack's damage is not affected by Resistance."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Shoot Down", {
          text "50 damage. If the Defending Pokémon has Team Aqua in its name, the Defending Pokémon is now Confused."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_TORKOAL_12:
      return basic (this, hp:HP080, type:[R, D], retreatCost:2) {
        weakness W
        move "Magma Burn", {
          text "10 damage. Discard the top card from your opponent's deck, and flip a coin. If tails, discard a [R] Energy attached to Team Magma's Torkoal."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Hot Air", {
          text "30 damage. Discard a [R] Energy attached to Team Magma's Torkoal, and your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RAICHU_13:
      return evolution (this, from:"null", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Spark", {
          text "20 damage. Does 10 damage to 2 of your opponent's Benched Pokémon (1 if there is only 1). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Kerzap", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 40 more damage to the Defending Pokémon and discard all [L] Energy cards attached to Raichu."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_AQUA_S_CRAWDAUNT_14:
      return evolution (this, from:"null", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Poison Reaction", {
          text "20+ damage. If the Defending Pokémon is Poisoned, this attack does 20 damage plus 20 more damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Claw", {
          text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TEAM_AQUA_S_MIGHTYENA_15:
      return evolution (this, from:"null", hp:HP070, type:D, retreatCost:1) {
        weakness G
        resistance P, MINUS30
        move "Bite", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mystic Fang", {
          text "50 damage. If the Defending Pokémon is Pokémon-ex, the Defending Pokémon is now Confused."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_AQUA_S_SEALEO_16:
      return evolution (this, from:"null", hp:HP070, type:W, retreatCost:1) {
        weakness M
        move "Aqua Trance", {
          text "20 damage. At the end of your opponent's next turn, the Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Super Hypnoblast", {
          text "30+ damage. If the Defending Pokémon is Asleep, this attack does 30 damage plus 20 more damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TEAM_AQUA_S_SEVIPER_17:
      return basic (this, hp:HP080, type:G, retreatCost:2) {
        weakness P
        move "Call for Family", {
          text "Search your deck for a Grass Basic Pokémon or Basic Pokémon with Team Aqua in its name and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thick Poison", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned. If tails, the Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_SHARPEDO_18:
      return evolution (this, from:"null", hp:HP070, type:W, retreatCost:0) {
        weakness L
        move "Slow-Acting Poison", {
          text "20 damage. At the end of your opponent's next turn, the Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Aqua Smash", {
          text "50+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 50 damage plus 20 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_CAMERUPT_19:
      return evolution (this, from:"Team Magma's Numel", hp:HP080, type:R, retreatCost:2) {
        weakness W
        pokePower "Overheat", {
          text "Once during your turn (before your attack), you may search your discard pile for a basic Energy card and attach it to Team Magma's Camerupt. Put 2 damage counters on Team Mamga's Camerupt. This power can't be used if Team Magma's Camerupt is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.discard.hasType(BASIC_ENERGY)
            powerUsed()
            my.discard.filterByType(BASIC_ENERGY).select().each {attachEnergy(self, it)}
            directDamage(20, self)
          }
        }
        move "Flame Ball", {
          text "50 damage. You may move a [R] Energy card attached to Team Magma's Camerupt to 1 of your Benched Pokémon."
          energyCost R, C, C
          onAttack {
            damage 50
            afterDamage {
              if ( my.bench && self.cards.energyCount(R) && confirm("Move a [R] Energy card attached to $self to 1 of your Pokémon?") ) {
                moveEnergy(type: R, self, my.bench.select("Which pokémon will recieve the [R] Energy?"))
              }
            }
          }
        }
      };
      case TEAM_MAGMA_S_LAIRON_20:
      return evolution (this, from:"null", hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Body Slam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tackle", {
          text "50 damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_MIGHTYENA_21:
      return evolution (this, from:"null", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Overrun", {
          text "10 damage. Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite Off", {
          text "40+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 40 damage plus 40 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_MAGMA_S_RHYDON_22:
      return evolution (this, from:"null", hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Second Strike", {
          text "20+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Land Crush", {
          text "60 damage. Flip a coin. If tails, discard an Energy card attached to Team Magma's Rhydon."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case TEAM_MAGMA_S_ZANGOOSE_23:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text "Search your deck for a [C] Basic Pokémon or Basic Pokémon with Team Magma in its name and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Team Play", {
          text "10x damage. Does 10 damage times the number of Pokémon in play with Team Magma in its name."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_CACNEA_24:
      return basic (this, hp:HP050, type:[G, D], retreatCost:1) {
        weakness R
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pin Missile", {
          text "10x damage. Flip 4 coins. This attack does 10 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_CARVANHA_25:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Dark Lift", {
          text "If Team Aqua's Carvanha has any [D] Energy attached to it, the Retreat Cost for Team Aqua's Carvanha is 0."
          delayedA {
          }
        }
        move "Slow-Acting Poison", {
          text "20 damage. At the end of your opponent's next turn, the Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_CORPHISH_26:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Double Pinchers", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Dark Poison", {
          text "20 damage. Discard a basic Energy card attached to Team Aqua's Corphish or this attack does nothing. The Defending Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_ELECTRIKE_27:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Random Spark", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Plasma", {
          text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Team Aqua's Electrike."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_LANTURN_28:
      return evolution (this, from:"null", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Auxiliary Light", {
          text "Once during your turn (before your attack), you may attach a basic Energy card from your hand to Team Aqua's Lanturn. Put 2 damage counters on Team Aqua's Lanturn. This power can't be used if Team Aqua's Lanturn is affected by a Special Condition."
          actionA {
          }
        }
        move "Lightning Ball", {
          text "50 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_AQUA_S_MANECTRIC_29:
      return evolution (this, from:"null", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Aqua Beam", {
          text "20 damage. If the Defending Pokémon has Team Magma's in its name, the Defending Pokémon is now Confused."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Chaos Crush", {
          text "50 damage. If the Defending Pokémon is Confused, discard an Energy card attached to the Defending Pokémon."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_AQUA_S_MIGHTYENA_30:
      return evolution (this, from:"null", hp:HP080, type:D, retreatCost:1) {
        weakness G
        resistance P, MINUS30
        move "Aqua Call", {
          text "Search your deck for Pokémon that has Team Aqua in its name, show up to 3 of them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

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
      };
      case TEAM_AQUA_S_SEALEO_31:
      return evolution (this, from:"null", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Aurora Beam", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Knock Over", {
          text "40 damage. You may discard any Stadium card in play."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_MAGMA_S_BALTOY_32:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psymist", {
          text "Flip 2 coins. For each heads, choose 1 of your opponent's Pokémon and put 1 damage counter on that Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pain Amplifier", {
          text "Put 1 damage counter on each of your opponent's Pokémon that already has damage counters on it."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TEAM_MAGMA_S_CLAYDOL_33:
      return evolution (this, from:"null", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Clay Curse", {
          text "Put 2 damage counters on your opponent's Pokémon in any way you like."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Clay Pulse", {
          text "50 damage. Does 10 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_HOUNDOOM_34:
      return evolution (this, from:"null", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Target Scorch", {
          text "30 damage. If the Defending Pokémon has Team Aqua in its name, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Damage Burn", {
          text "40+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 40 damage plus 20 more damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_MAGMA_S_HOUNDOUR_35:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Dark Shock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_LAIRON_36:
      return evolution (this, from:"null", hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Gnaw", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Land Sonic", {
          text "40 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Confused."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TEAM_MAGMA_S_MIGHTYENA_37:
      return evolution (this, from:"null", hp:HP080, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Call for Help", {
          text "Once during your turn (before your attack), if Team Magma's Mightyena is your Active Pokémon, you may search your deck for a Pokémon with Team Magma in its name, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Team Magma's Mightyena is affected by a Special Condition."
          actionA {
          }
        }
        move "Lunge", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TEAM_MAGMA_S_RHYHORN_38:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Double Damage", {
          text "Does 10 damage to each Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Horn Rush", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case BULBASAUR_39:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Growth", {
          text "Attach a [G] Energy card from your hand to Bulbasaur."
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
      case CUBONE_40:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Bone Attack", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case JIGGLYPUFF_41:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rest", {
          text "Remove all Special Conditions and 3 damage counters from Jigglypuff (all if there are less than 3). Jigglypuff is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEOWTH_42:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Plunder", {
          text "10 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon (before they affect the damage)."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Scratch", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PIKACHU_43:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Agility", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Pikachu during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case PSYDUCK_44:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SLOWPOKE_45:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Strike", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SQUIRTLE_46:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Shell Retreat", {
          text "As long as Squirtle has any Energy cards attached to it, damage done to Squirtle by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
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
      case TEAM_AQUA_S_CARVANHA_47:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Fang", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_CARVANHA_48:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Razor Fin", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_CHINCHOU_49:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Confuse Ray", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_CORPHISH_50:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Toxic Grip", {
          text "The Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TEAM_AQUA_S_CORPHISH_51:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Slash", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slow-Acting Poison", {
          text "10 damage. At the end of your opponent's next turn, the Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_ELECTRIKE_52:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_ELECTRIKE_53:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Self Charge", {
          text "Attach an Energy card from your hand to Team Aqua's Electrike."
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
      case TEAM_AQUA_S_POOCHYENA_54:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness G
        resistance P, MINUS30
        move "Double Scratch", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tail Slap", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_AQUA_S_POOCHYENA_55:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness G
        resistance P, MINUS30
        move "Roar", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Aqua Crush", {
          text "10 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_SPHEAL_56:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness M
        move "Powder Snow", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_S_SPHEAL_57:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Rollout", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Trance", {
          text "20 damage. At the end of your opponent's next turn, the Defending Pokémon is now Asleep."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_ARON_58:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Mud Slap", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
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
      case TEAM_MAGMA_S_ARON_59:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Dig Under", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost F
          onAttack {
            noWrDamage(10, opp.all.select())
          }
        }
      };
      case TEAM_MAGMA_S_BALTOY_60:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Peck", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Spin", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_BALTOY_61:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Night Attack", {
          text "Put 1 damage counter on 1 of your opponent's Pokémon."
          energyCost F
          attackRequirement {}
          onAttack {

          }
        }
        move "Spinning Attack", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_HOUNDOUR_62:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Combustion", {
          text "10 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Super Singe", {
          text "10 damage. The Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_MAGMA_S_HOUNDOUR_63:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Kick Away", {
          text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
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
      case TEAM_MAGMA_S_NUMEL_64:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Collect", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Combustion", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_POOCHYENA_65:
      return basic (this, hp:HP040, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Snarl", {
          text "Flip a coin. If heads, this attack does 10 damage to the Defending Pokémon. If tails, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TEAM_MAGMA_S_POOCHYENA_66:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Darkness Call", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sharp Fang", {
          text "20 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEAM_MAGMA_S_RHYHORN_67:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Double Stab", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Second Strike", {
          text "10+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_MAGMA_S_RHYHORN_68:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness G
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Knock Over", {
          text "10 damage. You may discard any Stadium card in play."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEAM_AQUA_SCHEMER_69:
      return supporter (this) {
        text "Discard any 1 Pokémon from your hand. Then draw 3 cards. If you discarded a Pokémon with Team Aqua in its name, draw 4 cards instead." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_MAGMA_SCHEMER_70:
      return supporter (this) {
        text "Discard any 1 Pokémon from your hand. Then draw 3 cards. If you discarded a Pokémon with Team Magma in its name, draw 4 cards instead." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case ARCHIE_71:
      return supporter (this) {
        text "Search your deck for a Pokémon with Team Aqua in its name and put it onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as a Basic Pokémon. If it is a Stage 2 Pokémon, put 2 damage counters on that Pokémon." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case DUAL_BALL_72:
      return itemCard (this) {
        text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case MAXIE_73:
      return supporter (this) {
        text "Search your hand or discard pile for a Pokémon with Team Magma in its name and put it onto your Bench. Treat the new Benched Pokémon as a Basic Pokémon. If it is a Stage 2 Pokémon, put 2 damage counters on that Pokémon." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case STRENGTH_CHARM_74:
      return pokemonTool (this) {
        text "Whenever an attack from the Pokémon that Strength Charm is attached to does damage to the Active Pokémon (after applying Weakness and Resistance), the attack does 10 more damage. At the end of the turn in which this happens, discard Strength Charm." +
          "Attach Strength Charm to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TEAM_AQUA_BALL_75:
      return itemCard (this) {
        text "Flip a coin. If heads, search your deck for a Pokémon that has Team Aqua in its name, show it to your opponent, and put it into your hand. If tails, search your deck for a Basic Pokémon that has Team Aqua in its name, show it to your opponent and put into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_AQUA_BELT_76:
      return pokemonTool (this) {
        text "At any time between turns, if the Pokémon Team Aqua Belt is attached to is your Active Pokémon, search your deck for a card that evolves from that Pokémon and put it on that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward, then discard Team Aqua Belt." +
          "Attach Team Aqua Belt to 1 of your Pokémon with Team Aqua in its name that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TEAM_AQUA_CONSPIRATOR_77:
      return supporter (this) {
        text "Search your deck for up to 2 in any combination of Basic Pokémon with Team Aqua in its name and basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_AQUA_HIDEOUT_78:
      return stadium (this) {
        text "Each Pokémon that does not have Team Aqua in its name pays [C] more to retreat." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case TEAM_AQUA_S_TECHNICAL_MACHINE_01_79:
      return itemCard (this) {
        text "Attach this card to 1 of your Pokémon that has Team Aqua in its name. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Team Aqua Technical Machine 01."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_MAGMA_BALL_80:
      return itemCard (this) {
        text "Flip a coin. If heads, search your deck for a Pokémon that has Team Magma in its name, show it to your opponent, and put it into your hand. If tails, search your deck for a Basic Pokémon that has Team Magma in its name, show it to your opponent and put into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_MAGMA_BELT_81:
      return pokemonTool (this) {
        text "At any time between turns, if the Pokémon Team Magma Belt is attached to is your Active Pokémon, search your deck for a card that evolves from that Pokémon and put it on that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward, then discard Team Magma Belt." +
          "Attach Team Magma Belt to 1 of your Pokémon with Team Magma in its name that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TEAM_MAGMA_CONSPIRATOR_82:
      return supporter (this) {
        text "Search your deck for up to 2 in any combination of Basic Pokémon with Team Magma in its name and basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward." +
          "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."
        onPlay {
        }
        playRequirement{
        }
      };
      case TEAM_MAGMA_HIDEOUT_83:
      return stadium (this) {
        text "Whenever any player plays a Basic Pokémon that doesn't have Team Magma in its name from his or her hand, that player puts 1 damage counter on that Pokémon." +
          "This card stays in play when you play it. Discard this card if another Stadium card comes into play."
        // Japanese text implies "when either player plays a Pokémon to the bench"
        def effect
        onPlay {
          effect = delayed {
            after PUT_ON_BENCH, {
              if (ef.basicFromEitherHand && ef.pokemonCard.getCardTypes().isNot(TEAM_MAGMA)) {
                bc "Team Magma Hideout puts 1 damage counter on ${ef.place}"
                directDamage 10, ef.place
              }
            }
          }
        }
        onRemoveFromPlay{
          effect.unregister()
        }
      };
      case TEAM_MAGMA_S_TECHNICAL_MACHINE_01_84:
      return itemCard (this) {
        text "Attach this card to 1 of your Pokémon that has Team Magma in its name. That Pokémon may use this card's attack instead of its own. At the end of your turn, discard Team Magma Technical Machine 01."
        onPlay {
        }
        playRequirement{
        }
      };
      case WARP_POINT_85:
      return itemCard (this) {
        text "Your opponent switches 1 of his or her Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch 1 of your Active Pokémon with 1 of your Benched Pokémon, if any."
        onPlay {
        }
        playRequirement{
        }
      };
      case AQUA_ENERGY_86:
      return specialEnergy (this, [[C]]) {
        text "Aqua Energy can be attached only to a Pokémon with Team Aqua in its name. Aqua Energy provides Water and [D] Energy but provides 2 Energy at a time. (Doesn't count as a basic Energy card when not in play and has no effect other than providing Energy.) At the end of your turn, discard Aqua Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case MAGMA_ENERGY_87:
      return specialEnergy (this, [[C]]) {
        text "Magma Energy can be attached only to a Pokémon with Team Magma in its name. Magma Energy provides Fighting and /or [D] Energy but provides 2 Energy at a time. (Doesn't count as a basic Energy card when not in play and has no effect other than providing Energy.) At the end of your turn, discard Magma Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case DOUBLE_RAINBOW_ENERGY_88:
      return specialEnergy (this, [[C]]) {
        text "Double Rainbow Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). While in play, Double Rainbow Energy provides every type of Energy but provides 2 Energy at a time. (Doesn't count as a basic Energy when not in play and has no effect other than providing Energy.) Damage done to your opponent's Pokémon by the Pokémon Double Rainbow Energy is attached to is reduced by 10 (after applying Weakness and Resistance). When the Pokémon Double Rainbow Energy is attached to is no longer an Evolved Pokémon, discard Double Rainbow Energy."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case BLAZIKEN_EX_89:
      return basic (this, hp:HP150, type:R, retreatCost:2) {
        weakness W
        weakness P
        move "Blaze Kick", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage and the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Volcanic Ash", {
          text "Discard 2 [R] Energy attached to Blaziken ex and then choose 1 of your opponent's Pokémon. This attack does 100 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CRADILY_EX_90:
      return basic (this, hp:HP150, type:G, retreatCost:2) {
        weakness W
        weakness R
        pokeBody "Primal Vibes", {
          text "As long as Cradily ex is your Active Pokémon, your opponent can't play a Pokémon from his or her hand to evolve his or her Active Pokémon."
          delayedA {
          }
        }
        move "Eerie Light", {
          text "30 damage. The Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Acidic Poison", {
          text "60 damage. The Defending Pokémon is now Poisoned and Burned."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ENTEI_EX_91:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness W
        move "Searing Flame", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bright Flame", {
          text "90 damage. Discard 2 Energy attached to Entei ex."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case RAIKOU_EX_92:
      return basic (this, hp:HP100, type:L, retreatCost:2) {
        weakness F
        move "Dazzle Blast", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Lightning Tackle", {
          text "70 damage. Flip a coin. If tails, Raikou ex does 20 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SCEPTILE_EX_93:
      return basic (this, hp:HP150, type:G, retreatCost:2) {
        weakness G
        weakness R
        resistance W, MINUS30
        move "Green Heal", {
          text "Remove 4 damage counters from each of your Pokémon that has [G] Energy attached. If that Pokémon has less than 4 damage counters, remove all of them."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Ring", {
          text "40 damage. The Defending Pokémon is now Poisoned. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Slashing Strike", {
          text "100 damage. Sceptile ex can't use Slashing Strike during your next turn."
          energyCost G, G, C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SUICUNE_EX_94:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Energy Flip", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. You may move an Energy card attached to that Pokémon to another of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Reverse Stream", {
          text "50+ damage. You may return all basic Energy cards attached to Suicune ex to your hand. If you do, this attack does 50 damage plus 10 more damage for each basic Energy card you returned."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SWAMPERT_EX_95:
      return basic (this, hp:HP150, type:F, retreatCost:3) {
        weakness G
        move "Hyper Pump", {
          text "20+ damage. Does 20 damage plus 20 more damage for each basic Energy attached to Swampert ex but not used to pay for this attack's Energy cost. You can't add more than 80 damage in this way."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Crushing Wave", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. After doing damage, flip a coin. If heads, your opponent discards an Energy card, if any, attached to that Pokémon. (Don't apply Weakness and Resistance to Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ABSOL_96:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C, C
          onAttack {
            damage 10
            flip {damage 10}
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies or any other effects on that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, D, C
          onAttack {
            swiftDamage(30, opp.all.select())
          }
        }
      };
      case JIRACHI_97:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Hypnoblast", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Swift", {
          text "20 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies or any other effects on the Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      default:
      return null;
    }
  }
}
