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
public enum LegendMaker implements LogicCardInfo {

  AERODACTYL_1 ("Aerodactyl", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  AGGRON_2 ("Aggron", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  CRADILY_3 ("Cradily", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DELCATTY_4 ("Delcatty", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GENGAR_5 ("Gengar", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GOLEM_6 ("Golem", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  KABUTOPS_7 ("Kabutops", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  LAPRAS_8 ("Lapras", 8, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MACHAMP_9 ("Machamp", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MEW_10 ("Mew", 10, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MUK_11 ("Muk", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SHIFTRY_12 ("Shiftry", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  VICTREEBEL_13 ("Victreebel", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WAILORD_14 ("Wailord", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ABSOL_15 ("Absol", 15, Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  GIRAFARIG_16 ("Girafarig", 16, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOREBYSS_17 ("Gorebyss", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HUNTAIL_18 ("Huntail", 18, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LANTURN_19 ("Lanturn", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LUNATONE_20 ("Lunatone", 20, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MAGMAR_21 ("Magmar", 21, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  MAGNETON_22 ("Magneton", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  OMASTAR_23 ("Omastar", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PINSIR_24 ("Pinsir", 24, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  SOLROCK_25 ("Solrock", 25, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  SPINDA_26 ("Spinda", 26, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  TORKOAL_27 ("Torkoal", 27, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  WOBBUFFET_28 ("Wobbuffet", 28, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  ANORITH_29 ("Anorith", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CASCOON_30 ("Cascoon", 30, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DUNSPARCE_31 ("Dunsparce", 31, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  ELECTRODE_32 ("Electrode", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  FURRET_33 ("Furret", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GRAVELER_34 ("Graveler", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HAUNTER_35 ("Haunter", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KABUTO_36 ("Kabuto", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  KECLEON_37 ("Kecleon", 37, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  LAIRON_38 ("Lairon", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MACHOKE_39 ("Machoke", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MISDREAVUS_40 ("Misdreavus", 40, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  NUZLEAF_41 ("Nuzleaf", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  ROSELIA_42 ("Roselia", 42, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SEALEO_43 ("Sealeo", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  TANGELA_44 ("Tangela", 44, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  TENTACRUEL_45 ("Tentacruel", 45, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VIBRAVA_46 ("Vibrava", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WEEPINBELL_47 ("Weepinbell", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ARON_48 ("Aron", 48, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BELLSPROUT_49 ("Bellsprout", 49, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHINCHOU_50 ("Chinchou", 50, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CLAMPERL_51 ("Clamperl", 51, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GASTLY_52 ("Gastly", 52, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GEODUDE_53 ("Geodude", 53, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRIMER_54 ("Grimer", 54, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GROWLITHE_55 ("Growlithe", 55, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  LILEEP_56 ("Lileep", 56, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MACHOP_57 ("Machop", 57, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGBY_58 ("Magby", 58, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MAGNEMITE_59 ("Magnemite", 59, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  OMANYTE_60 ("Omanyte", 60, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEEDOT_61 ("Seedot", 61, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SENTRET_62 ("Sentret", 62, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SHUPPET_63 ("Shuppet", 63, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SKITTY_64 ("Skitty", 64, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SPHEAL_65 ("Spheal", 65, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TENTACOOL_66 ("Tentacool", 66, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TRAPINCH_67 ("Trapinch", 67, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  VOLTORB_68 ("Voltorb", 68, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  WAILMER_69 ("Wailmer", 69, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WURMPLE_70 ("Wurmple", 70, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WYNAUT_71 ("Wynaut", 71, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  CURSED_STONE_72 ("Cursed Stone", 72, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  FIELDWORKER_73 ("Fieldworker", 73, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FULL_FLAME_74 ("Full Flame", 74, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  GIANT_STUMP_75 ("Giant Stump", 75, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  POWER_TREE_76 ("Power Tree", 76, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  STRANGE_CAVE_77 ("Strange Cave", 77, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  CLAW_FOSSIL_78 ("Claw Fossil", 78, Rarity.COMMON, [TRAINER, ITEM]),
  MYSTERIOUS_FOSSIL_79 ("Mysterious Fossil", 79, Rarity.COMMON, [TRAINER, ITEM]),
  ROOT_FOSSIL_80 ("Root Fossil", 80, Rarity.COMMON, [TRAINER, ITEM]),
  RAINBOW_ENERGY_81 ("Rainbow Energy", 81, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  REACT_ENERGY_82 ("React Energy", 82, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ARCANINE_EX_83 ("Arcanine ex", 83, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _FIRE_]),
  ARMALDO_EX_84 ("Armaldo ex", 84, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _FIGHTING_]),
  BANETTE_EX_85 ("Banette ex", 85, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _PSYCHIC_]),
  DUSTOX_EX_86 ("Dustox ex", 86, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]),
  FLYGON_EX_87 ("Flygon ex", 87, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
  MEW_EX_88 ("Mew ex", 88, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _PSYCHIC_]),
  WALREIN_EX_89 ("Walrein ex", 89, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  REGICE_STAR_90 ("Regice Star", 90, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  REGIROCK_STAR_91 ("Regirock Star", 91, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  REGISTEEL_STAR_92 ("Registeel Star", 92, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  PIKACHU_Δ_93 ("Pikachu δ", 93, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  LegendMaker(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.LEGEND_MAKER;
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
      case AERODACTYL_1:
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokeBody "Reactive Protection", {
          text "Any damage done to Aerodactyl by attacks from your opponent's Pokémon is reduced by 10 for each React Energy card attached to Aerodactyl (after applying Weakness and Resistance)."
          delayedA {
            // TODO
          }
        }
        move "Power Blow", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Aerodactyl."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10+10*opp.active.energyCount()
          }
        }
        move "Speed Stroke", {
          text "40 damage. During your opponent's next turn, prevent all effects, including damage, done to Aerodactyl by attacks from your opponent's Pokémon-ex."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            // TODO
          }
        }
      };
      case AGGRON_2:
      return evolution (this, from:"Lairon", hp:HP110, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        move "Heavy Blow", {
          text "70- damage. Does 70 damage minus 10 damage for each damage counter on Aggron. If Aggron has any React Energy cards attached to it, this attack does 70 damage instead."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              damage 70
            } else {
              damage 70-self.numberOfDamageCounters*10
            }
          }
        }
        move "Bound Crush", {
          text "Choose 1 of your opponent's Pokémon. This attack does 60 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) During your next turn, Aggron can't use Bound Crush."
          energyCost F, M, C, C
          attackRequirement {}
          onAttack {
            damage 60, opp.all.select()
            cantUseAttack(thisMove, self)
          }
        }
      };
      case CRADILY_3:
      return evolution (this, from:"Lileep", hp:HP100, type:G, retreatCost:2) {
        weakness R
        move "Devolution Wave", {
          text "Count the number of React Energy cards attached to Cradily and choose up to that number of your opponent's Evolved Pokémon. Remove the highest Stage Evolution card from each of those Pokémon, then have your opponent shuffle those cards into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            // TODO
            // if (self.cards.findAll { it.name.contains("React Energy") }) {
            // }
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30, opp.all.select()
          }
        }
        move "Mud Shot", {
          text "50 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DELCATTY_4:
      return evolution (this, from:"Skitty", hp:HP080, type:C, retreatCost:1) {
        weakness F
        pokePower "Reactive Shift", {
          text "Once during your turn (before your attack), you may move a React Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Delcatty is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Energy Link", {
          text "20 damage. Search your discard pile for an Energy card and attach it to Delcatty."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage {
              attachEnergyFrom(my.discard, self)
            }
          }
        }
        move "Tail Whap", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GENGAR_5:
      return evolution (this, from:"Haunter", hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokePower "Shadow Curse", {
          text "If Gengar would be Knocked Out by damage from an opponent's attack, you may put 3 damage counters on 1 of your opponent's Pokémon."
          delayedA {
            before (KNOCKOUT,self) {
              if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                def pcs = self.owner.opposite.pbg.all.oppSelect("choose the Pokémon to put 3 damage counters on")
                directDamage 30, pcs, SRC_ABILITY
              }
            }
          }
        }
        move "Cursed Reaction", {
          text "Put 2 damage counters on your opponent's Pokémon in any way you like. If Gengar has any React Energy cards attached to it, put 4 damage counters instead."
          energyCost P
          attackRequirement {}
          onAttack {
            def counters = 2
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              counters = 4
            }
            (1..counters).each {
              directDamage 10, opp.all.select("Put 1 damage counter to which Pokémon? $it/counters remaining")
            }
          }
        }
        move "Super Psy Bolt", {
          text "60 damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GOLEM_6:
      return evolution (this, from:"Graveler", hp:HP120, type:F, retreatCost:3) {
        weakness W
        move "Mend", {
          text "Search your discard pile for a [F] Energy card and attach it to Golem. If you do, remove 2 damage counters from Golem."
          energyCost C
          attackRequirement {}
          onAttack {
            attachEnergyFrom(type: F, my.discard, self)
            // TODO
          }
        }
        move "Enraged Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each damage counter on Golem to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters, opp.all.select()
          }
        }
        move "Rock Tumble", {
          text "70 damage. This attack's damage isn't affected by Resistance."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 70
            dontApplyResistance()
          }
        }
      };
      case KABUTOPS_7:
      return evolution (this, from:"Kabuto", hp:HP110, type:F, retreatCost:2) {
        weakness G
        pokeBody "Ancient Shell", {
          text "As long as you have Omanyte or Omastar in play, damage done to Kabutops by attacks is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
            // TODO
          }
        }
        move "Energy Stream", {
          text "30 damage. Search your discard pile for a basic Energy card and attach it to Kabutops."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(my.discard, self)
            }
          }
        }
        move "Extra Claws", {
          text "50+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 50 damage plus 30 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
            if (opp.active.topPokemonCard.cardTypes.contains(EX)) {
              damage 30
            }
          }
        }
      };
      case LAPRAS_8:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        pokePower "Support Navigation", {
          text "Once during your turn, when you put Lapras onto your Bench from your hand, you may search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          actionA {
            // TODO
          }
        }
        move "Surf", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MACHAMP_9:
      return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
        weakness P
        move "Derail", {
          text "40 damage. Discard a Special Energy card, if any, attached to the Defending Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
            discardDefendingSpecialEnergy(delegate)
          }
        }
        move "Swift Blow", {
          text "60+ damage. Does 60 damage plus 20 damage for each React Energy card attached to Machamp."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
            // TODO
          }
        }
      };
      case MEW_10:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokePower "Type Change", {
          text "Once during your turn (before your attack), you may choose 1 of the Defending Pokémon. Mew is the same type as that Pokémon (all if that Pokémon is more than 1 type) until the end of your turn. This power can't be used if Mew is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Link Blast", {
          text "50 damage. If Mew and the Defending Pokémon have a different amount of Energy attached to them, this attack's base damage is 20 instead of 50."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 50
            // TODO
          }
        }
      };
      case MUK_11:
      return evolution (this, from:"Grimer", hp:HP070, type:G, retreatCost:2) {
        weakness P
        pokeBody "Stench", {
          text "As long as Muk is your Active Pokémon, each player's Pokémon can't use any Poké-Powers."
          delayedA {
            // TODO
          }
        }
        move "Poison Ring", {
          text "20 damage. The Defending Pokémon is now Poisoned. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            apply POISONED
            cantRetreat defending
          }
        }
        move "Sludge Toss", {
          text "50 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SHIFTRY_12:
      return evolution (this, from:"Nuzleaf", hp:HP110, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Evolutionary Fan", {
          text "Once during your turn, when you play Shiftry from your hand to evolve 1 of your Pokémon, you may choose 1 of your Evolved Pokémon in play (excluding any Shiftry). Return that Pokémon and all cards attached to it to your hand."
          actionA {
            // TODO
          }
        }
        move "Reactive Beating", {
          text "30 damage. If Shiftry has any React Energy cards attached to it, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              apply CONFUSED
            }
          }
        }
        move "Cross-Cut", {
          text "40+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 40 damage plus 30 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 40
            if (defending.evolution) {
              damage 30
            }
          }
        }
      };
      case VICTREEBEL_13:
      return evolution (this, from:"Weepinbell", hp:HP100, type:G, retreatCost:2) {
        weakness R
        pokePower "Nectar Pod", {
          text "Once during your turn (before your attack), you may switch 1 of your opponent's Benched Stage 2 Evolved Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. This power can't be used if Victreebel is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Sleep Poison", {
          text "10 damage. The Defending Pokémon is now Asleep and Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
            apply ASLEEP
            apply POISONED
          }
        }
        move "Sharp Leaf", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { damage 30 }
          }
        }
      };
      case WAILORD_14:
      return evolution (this, from:"Wailmer", hp:HP120, type:W, retreatCost:4) {
        weakness L
        pokeBody "Reactive Lift", {
          text "As long as Wailord has any React Energy cards attached to it, the Retreat Cost for each of your [W] Pokémon (excluding Pokémon-ex) is 0."
          delayedA {
            // TODO
            // if (self.cards.findAll { it.name.contains("React Energy") }) {
            // }
          }
        }
        move "Hypno Splash", {
          text "40 damage. The Defending Pokémon is now Asleep."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
            apply ASLEEP
          }
        }
        move "Rely on Friends", {
          text "40+ damage. Does 40 damage plus 10 more damage for each of your Benched Stage 1 Evolved Pokémon."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
            // TODO
          }
        }
      };
      case ABSOL_15:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Shining Horn", {
          text "As long as Absol is the only Pokémon you have in play, your opponent's Basic Pokémon can't attack."
          delayedA {
            // TODO
          }
        }
        move "Extra Call", {
          text "Search your deck for a Pokémon-ex, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            swiftDamage(30, opp.all.select())
          }
        }
      };
      case GIRAFARIG_16:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokeBody "Rear Sensor", {
          text "Each player's Active Basic Pokémon (excluding Pokémon-ex) can't use any Poké-Powers."
          delayedA {
            // TODO
          }
        }
        move "Foresight", {
          text "Look at the top 5 cards of either player's deck and put them back on top of that player's deck in any order you like."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Disorder", {
          text "20 damage. If the Defending Pokémon has any Special Energy cards attached to it, the Defending Pokémon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
            // TODO
          }
        }
      };
      case GOREBYSS_17:
      return evolution (this, from:"Clamperl", hp:HP070, type:W, retreatCost:0) {
        weakness L
        pokeBody "Reactive Booster", {
          text "Each React Energy card attached to all of your Huntail and Gorebyss provides 2 Energy of every type but has no effect other than providing Energy."
          delayedA {
            // TODO
          }
        }
        move "Hydro Pump", {
          text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Gorebyss but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30

            // TODO
          }
        }
      };
      case HUNTAIL_18:
      return evolution (this, from:"Clamperl", hp:HP080, type:W, retreatCost:1) {
        weakness L
        pokePower "Reactive Generator", {
          text "Once during your turn (before your attack), if Huntail has no React Energy cards attached to it, you may search your deck for a React Energy card and attach it to Huntail. Shuffle your deck afterward. This power can't be used if Huntail is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Bite Off", {
          text "40+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 40 damage plus 30 more damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
            if (opp.active.topPokemonCard.cardTypes.contains(EX)) {
              damage 30
            }
          }
        }
      };
      case LANTURN_19:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
        weakness F
        pokeBody "Dual Armor", {
          text "As long as Lanturn has any [W] Energy attached to it, Lanturn is both Water and Lightning type."
          getterA GET_POKEMON_TYPE, self, { h->
            if (self.cards.energyCount(W)) h.object.add(W)
          }
        }
        move "Razor Fin", {
          text "30 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Water Gun", {
          text "40+ damage. Does 40 damage plus 20 more damage for each [W] Energy attached to Lanturn but not used to pay for this attack's Energy cost. You can't add more then 40 damage in this way."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
            // TODO
          }
        }
      };
      case LUNATONE_20:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokeBody "Sol Shade", {
          text "As long as you have Solrock in play, each player's [R] Pokémon (excluding Pokémon-ex) can't use any Poké-Powers."
          delayedA {
            // TODO
          }
        }
        move "Moon Guidance", {
          text "Search your deck for a Trainer card (excluding Supporter cards), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case MAGMAR_21:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokeBody "Stages of Evolution", {
          text "As long as Magmar is an Evolved Pokémon, all Energy attached to Magmar are [R] Energy instead of their usual types."
          delayedA {
            // TODO
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10, opp.all.select()
          }
        }
        move "Burning Sensation", {
          text "40 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Burned."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 40
            if (defending.numberOfDamageCounters) {
              apply BURNED
            }
          }
        }
      };
      case MAGNETON_22:
      return evolution (this, from:"Magnemite", hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Reactive Recharge", {
          text "If Magneton would be Knocked Out by damage from an opponent's attack, you may move any number of React Energy cards from Magneton to your Pokémon in any way you like."
          actionA {
            // TODO
          }
        }
        move "Multiple Force", {
          text "30+ damage. If Magneton has any React Energy cards attached to it, this attack does 30 damage plus 10 more damage for each Magnemite and Magneton (both yours and your opponent's) in play."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30

            if (self.cards.findAll { it.name.contains("React Energy") }) {
              def magnets = all.findAll({
                it.name.contains("Magnemite") || it.name.contains("Magneton")
              }).size()
              damage 10*magnets
            }
          }
        }
        move "Magnetic Blast", {
          text "60 damage."
          energyCost L, C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case OMASTAR_23:
      return evolution (this, from:"Omanyte", hp:HP100, type:W, retreatCost:1) {
        weakness L
        pokeBody "Ancient Fang", {
          text "As long as you have Kabuto, Kabutops, or Kabutops ex in play, Omastar's attacks do 20 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            // TODO
          }
        }
        move "Drag Off", {
          text "10 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost C
          attackRequirement {}
          onAttack{
            def target = defending
            if (opp.bench && confirm("Switch Defending with a Benched?")) {
              target = opp.bench.select("Select the new active")
              sw defending, target
            }
            damage 10, target
          }
        }
        move "Hydro Splash", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PINSIR_24:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        pokeBody "Shining Horn", {
          text "As long as Pinsir is the only Pokémon you have in play, your opponent's Basic Pokémon can't attack."
          delayedA {
            // TODO
          }
        }
        move "Cry for Help", {
          text "Search your deck for a [G] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search ({
              it.asPokemonCard().types.contains(G) && !it.asPokemonCard().cardTypes.is(EX)
            }).each {
              it.moveTo(my.hand)
            }
            shuffleDeck()
          }
        }
        move "Overhead Toss", {
          text "30 damage. Does 20 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
            damage 20, my.bench.select()
          }
        }
      };
      case SOLROCK_25:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        pokeBody "Luna Shade", {
          text "As long as you have Lunatone in play, each player's [C] Pokémon (excluding Pokémon-ex) can't use any Poké-Powers."
          delayedA {
            // TODO
          }
        }
        move "Call for Family", {
          text "Search your deck for a Lunatone and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            deck.search (count: 1, {it.name == "Lunatone"}).each {
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Hyper Beam", {
          text "Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost F
          attackRequirement {}
          onAttack {
            flip { discardDefendingEnergy() }
          }
        }
      };
      case SPINDA_26:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokeBody "Pattern Distraction", {
          text "As long as Spinda is your Active Pokémon, whenever your opponent's Basic Pokémon tries to attack, your opponent flips a coin. If tails, that attack does nothing. You can't use more than 1 Pattern Distraction Poké-Body each turn."
          delayedA {
            // TODO
          }
        }
        move "Whimsy Draw", {
          text "Flip a coin until you get tails. For each heads, draw 2 cards."
          energyCost C
          attackRequirement {}
          onAttack {
            flipUntilTails {
              draw 2
            }
          }
        }
        move "Double-edge", {
          text "30 damage. Flip a coin. If tails, Spinda does 10 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip 1, {}, { damage 10, self }
          }
        }
      };
      case TORKOAL_27:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Cry for Help", {
          text "Search your deck for a [R] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search ({
              it.asPokemonCard().types.contains(R) && !it.asPokemonCard().cardTypes.is(EX)
            }).each {
              it.moveTo(my.hand)
            }
            shuffleDeck()
          }
        }
        move "Fireworks", {
          text "30 damage. Flip a coin. If tails, discard a [R] Energy attached to Torkoal."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            flip 1, {}, { discardSelfEnergy R }
          }
        }
      };
      case WOBBUFFET_28:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        pokeBody "Stages of Evolution", {
          text "As long as Wobbuffet is an Evolved Pokémon, your opponent pays [C] more to retreat his or her Active Pokémon."
          delayedA {
            // TODO
          }
        }
        move "Grind", {
          text "10x damage. Does 10 damage times the amount of Energy attached to Wobbuffet."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
        move "Shadow Tag", {
          text "Put 7 damage counters on the Defending Pokémon at the end of your opponent's next turn."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            delayed {
              before BETWEEN_TURNS, {
                if (bg.currentTurn == self.owner.opposite) {
                  directDamage 30, self.owner.opposite.pbg.active
                  bc "Shadow Tag activates"
                }
              }
              after SWITCH, defending, {unregister()}
              unregisterAfter 2
            }
          }
        }
      };
      case ANORITH_29:
      return evolution (this, from:"Claw Fossil", hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Influence", {
          text "Search your deck for Omanyte, Kabuto, Aerodactyl, Lileep, or Anorith and put up to 2 of them onto your Bench. Shuffle your deck afterward. Treat the new Benched Pokémon as Basic Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Stretch Claws", {
          text "20 damage. If Anorith has any React Energy cards attached to it, this attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            if (self.cards.findAll { it.name.contains("React Energy") } && opp.bench) {
              damage 20, opp.bench.select()
            }
          }
        }
      };
      case CASCOON_30:
      return evolution (this, from:"Wurmple", hp:HP070, type:G, retreatCost:2) {
        weakness R
        pokePower "Emerge", {
          text "Once during your turn (before your attack), if Cascoon is your Active Pokémon, you may flip a coin. If heads, search your deck for a card that evolves from Cascoon and put it onto Cascoon. (This counts as evolving Cascoon.) Shuffle your deck afterward. This power can't be used if Cascoon is affected by a Special Condition."
          actionA {
            // TODO
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
      case DUNSPARCE_31:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokeBody "Deadlock", {
          text "As long as Dunsparce is your Active Pokémon, your opponent's Dunsparce can't attack."
          delayedA {
            // TODO
          }
        }
        move "Down Draw", {
          text "Draw 2 cards from the bottom of your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "No cards in deck"
          }
          onAttack {
            if (my.deck.size() < 2) {
              draw 2
            } else {
              my.deck.subList(my.deck.size() - 2, my.deck.size()).moveTo(hidden:true, my.hand)
            }
          }
        }
        move "Tripping Turn", {
          text "The Defending Pokémon is now Confused. You may switch Dunsparce with 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            apply CONFUSED
            if (confirm("switch Dunsparce with 1 of your Benched Pokémon?")) {
              sw self, my.bench.select()
            }
          }
        }
      };
      case ELECTRODE_32:
      return evolution (this, from:"Voltorb", hp:HP070, type:L, retreatCost:0) {
        weakness F
        move "Supersonic", {
          text "10 damage. The Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            apply CONFUSED
          }
        }
        move "Tumbling Attack", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { damage 20 }
          }
        }
      };
      case FURRET_33:
      return evolution (this, from:"Sentret", hp:HP080, type:C, retreatCost:1) {
        weakness F
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Do the Wave", {
          text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10+10*my.bench.size()
          }
        }
      };
      case GRAVELER_34:
      return evolution (this, from:"Geodude", hp:HP070, type:F, retreatCost:2) {
        weakness W
        pokeBody "Exoskeleton", {
          text "Any damage done to Graveler by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(it.to == self && it.notNoEffect && it.dmg.value) {
                  bc "Exoskeleton -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Rock Slide", {
          text "20 damage. Does 10 damage to 2 of your opponent's Benched Pokémon (1 if there is only 1). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
            // TODO
          }
        }
      };
      case HAUNTER_35:
      return evolution (this, from:"Gastly", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Time Spiral", {
          text "If your opponent has any Evolved Pokémon in play, choose 1 of them and flip a coin. If heads, remove the highest Stage Evolution card on that Pokémon and have your opponent shuffled it into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Haunt", {
          text "Put 2 damage counters on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            directDamage 20, defending
          }
        }
      };
      case KABUTO_36:
      return evolution (this, from:"Mysterious Fossil", hp:HP060, type:F, retreatCost:2) {
        weakness G
        pokeBody "Ancient Protection", {
          text "Each of your Omanyte, Omastar, Kabuto, Kabutops, and Kabutops ex has no Weakness."
          delayedA {
            // TODO
          }
        }
        move "Granite Head", {
          text "20 damage. During your opponent's next turn, any damage done to Kabuto by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            reduceDamageNextTurn(hp(10), thisMove)
          }
        }
      };
      case KECLEON_37:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokeBody "Reactive Colors", {
          text "If Kecleon has any React Energy cards attached to it, Kecleon is Grass, Fire, Water, Lightning, Psychic, and Fighting type."
          delayedA {
            getterA GET_POKEMON_TYPE, self, {h->
              if (self.cards.findAll { it.name.contains("React Energy") }) {
                h.object.add(G)
                h.object.add(R)
                h.object.add(W)
                h.object.add(L)
                h.object.add(P)
                h.object.add(F)
              }
            }
          }
        }
        move "Tongue Whip", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10, opp.all.select()
          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case LAIRON_38:
      return evolution (this, from:"Aron", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Rest", {
          text "Remove all Special Conditions and 5 damage counters (all if there are less than 5) from Lairon. Lairon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            heal 50, self
            clearSpecialCondition(self)
          }
        }
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
      };
      case MACHOKE_39:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
        weakness P
        pokeBody "Paranoid", {
          text "As long as Machoke is Confused, Machoke's attacks do 50 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            // TODO
          }
        }
        move "Split Kick", {
          text "Does 20 damage to each Defending Pokémon."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnum Punch", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MISDREAVUS_40:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokeBody "Deep Sleep", {
          text "As long as Misdreavus is your Active Pokémon, each player flips 2 coins for his or her Pokémon that is Asleep between turns. If either coin is tails, that Pokémon is still Asleep."
          delayedA {
            // TODO
          }
        }
        move "Return Trance", {
          text "Return an Energy card attached to Misdreavus to your hand. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            self.cards.filterByType(ENERGY).select(count: 1).moveTo(my.hand)
            apply ASLEEP
          }
        }
        move "Dream Eater", {
          text "30 damage. If the Defending Pokémon is not Asleep, this attack does nothing."
          energyCost P
          attackRequirement {}
          onAttack {
            if (defending.isSPC(ASLEEP)) {
              damage 30
            }
          }
        }
      };
      case NUZLEAF_41:
      return evolution (this, from:"Seedot", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Pound", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Plunder", {
          text "30 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            if (defending.cards.filterByType(TRAINER)){
              defending.cards.filterByType(TRAINER).discard()
              damage 30
            }
          }
        }
      };
      case ROSELIA_42:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Reactive Aroma", {
          text "As long as Roselia has any React Energy cards attached to it, remove 1 damage counter from each of your Pokémon (excluding Pokémon-ex) that has any React Energy cards attached to it between turns. You can't use more than 1 Reactive Aroma Poké-Body each turn."
          delayedA {
            // TODO
            if (self.cards.findAll { it.name.contains("React Energy") }) {
            }
          }
        }
        move "Flick Poison", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Poisoned."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      };
      case SEALEO_43:
      return evolution (this, from:"Spheal", hp:HP070, type:W, retreatCost:1) {
        weakness M
        pokePower "Power Circulation", {
          text "Once during your turn (before your attack), you may search your discard pile for a basic Energy card, show it to your opponent, and put it on top of your deck. If you do, put 1 damage counter on Sealeo. This power can't be used if Sealeo is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Lunge Out", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TANGELA_44:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        pokeBody "Reactive Healing", {
          text "Whenever you attach a React Energy card from your hand to Tangela, remove all damage counters from Tangela."
          delayedA {
            // TODO
          }
        }
        move "Entangling Vines", {
          text "10 damage. If the Defending Pokémon is a Basic Pokémon, that Pokémon can't attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            if (defending.basic) {
              cantAttackNextTurn(defending)
            }
          }
        }
        move "Gentle Wrap", {
          text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
            cantRetreat(defending)
          }
        }
      };
      case TENTACRUEL_45:
      return evolution (this, from:"Tentacool", hp:HP070, type:W, retreatCost:0) {
        weakness L
        pokeBody "Reactive Shield", {
          text "As long as Tentacruel has any React Energy cards attached to it, prevent all effects, including damage, done to any of your Tentacruel in play by attacks from your opponent's Pokémon-ex."
          delayedA {
            // TODO
            if (self.cards.findAll { it.name.contains("React Energy") }) {
            }
          }
        }
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20, opp.all.select()
          }
        }
        move "Fury Strikes", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            flip 3, { damage 20 }
          }
        }
      };
      case VIBRAVA_46:
      return evolution (this, from:"Trapinch", hp:HP080, type:C, retreatCost:1) {
        weakness C
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply CONFUSED }
          }
        }
        move "Bi-Blast", {
          text "20+ damage. If Vibrava has any React Energy cards attached to it, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              damage 20
            }
          }
        }
      };
      case WEEPINBELL_47:
      return evolution (this, from:"Bellsprout", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Sleep Seed", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            apply ASLEEP
          }
        }
        move "Vine Whip", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ARON_48:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Self Charge", {
          text "Attach a [M] Energy card from your hand to Aron."
          energyCost C
          attackRequirement {}
          onAttack {
            attachEnergyFrom(type:M, my.hand, self)
          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BELLSPROUT_49:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Sleep Powder", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
      };
      case CHINCHOU_50:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Random Spark", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10, opp.all.select()
          }
        }
        move "Lightning Ball", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CLAMPERL_51:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Iron Defense", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Clamperl during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Clamp Splash", {
          text "10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GASTLY_52:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Lick", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip {
              apply PARALYZED
            }
          }
        }
        move "Smog", {
          text "The Defending Pokémon is now Poisoned."
          energyCost P
          attackRequirement {}
          onAttack {
            apply POISONED
          }
        }
      };
      case GEODUDE_53:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Selfdestruct", {
          text "50 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.) Geodude does 50 damage to itself."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 50
            all.each {
              damage 10, it
            }
            damage 50, self
          }
        }
      };
      case GRIMER_54:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Ascension", {
          text "Search your deck for a card that evolves from Grimer and put it onto Grimer. (This counts as evolving Grimer.) Shuffle your deck afterward."
          energyCost G
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Sludge Toss", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GROWLITHE_55:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Body Slam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Firebreathing", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case LILEEP_56:
      return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Tender Tentacles", {
          text "20 damage. If Lileep has any React Energy cards attached to it, remove 2 damage counters from Lileep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              heal 20, self
            }
          }
        }
        move "Confuse Ray", {
          text "20 damage. The Defending Pokémon is now Confused."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            apply CONFUSED
          }
        }
      };
      case MACHOP_57:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Mach Punch", {
          text "10 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
            if (opp.bench) {
              damage 10, opp.bench.select()
            }
          }
        }
      };
      case MAGBY_58:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Magmar from your hand onto Magby (this counts as evolving Magby) and remove all damage counters from Magby."
          actionA {
            assert my.hand.findAll{it.name.contains("Magmar")} : "There is no pokémon in your hand to evolve ${self}."
            checkLastTurn()
            powerUsed()
            def tar = my.hand.findAll { it.name.contains("Magmar") }.select()
            if (tar) {
              evolve(self, tar.first(), OTHER)
              heal self.numberOfDamageCounters*10, self
            }
          }
        }
        move "Ignite", {
          text "10 damage. If Full Flame is in play, the Defending Pokémon is now Burned."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Full Flame") {
              apply BURNED
            }
          }
        }
      };
      case MAGNEMITE_59:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Magnetic Swirl", {
          text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, discard an Energy attached to the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            flip 1, {
              damage 10
              discardDefendingEnergy()
            }, {}
          }
        }
      };
      case OMANYTE_60:
      // TODO
      return evolution (this, from:"Mysterious Fossil", hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Ancient Tentacles", {
          text "Damage done to your opponent's Pokémon by your Omanyte, Omastar, Kabuto, Kabutops, or Kabutops ex isn't affected by Resistance."
          delayedA {
            // TODO
          }
        }
        move "[Poké-Body] Ancient Tentacles", {
          text "Damage done to your opponent's Pokémon by your Omanyte, Omastar, Kabuto, Kabutops, or Kabutops ex isn't affected by Resistance."
          energyCost
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Rising Lunge", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SEEDOT_61:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Drawup Power", {
          text "Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert deck : "Deck is empty"
          }
          onAttack {
            my.deck.search ("Put Energy Card to hand", cardTypeFilter(ENERGY)).moveTo(hand)
            shuffleDeck()
          }
        }
        move "Continuous Tumble", {
          text "10x damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            flipUntilTails { damage 10 }
          }
        }
      };
      case SENTRET_62:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case SHUPPET_63:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Will-o'-the-wisp", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SKITTY_64:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Important Errands", {
          text "Search your deck for a React Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
        move "Jump On", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case SPHEAL_65:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Ram", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TENTACOOL_66:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Poison Sting", {
          text "The Defending Pokémon is now Poisoned."
          energyCost W
          attackRequirement {}
          onAttack {
            apply POISONED
          }
        }
      };
      case TRAPINCH_67:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Pebble Throw", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement { assert opp.bench : "Opponent has no benched Pokemon"}
          onAttack {
            damage 10, opp.bench.select()
          }
        }
        move "Double Pinchers", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost F, C
          attackRequirement {}
          onAttack {
            flip 2, { damage 20 }
          }
        }
      };
      case VOLTORB_68:
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
        move "Bouncing Ball", {
          text "30 damage. Voltorb does 10 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case WAILMER_69:
      return basic (this, hp:HP080, type:W, retreatCost:3) {
        weakness L
        move "Double Tackle", {
          text "Does 20 damage to each Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Whirlpool", {
          text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
            flip {
              discardDefendingEnergy()
            }
          }
        }
      };
      case WURMPLE_70:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        pokeBody "Poison Payback", {
          text "If Wurmple is your Active Pokémon and is damaged by an opponent's attack (even if Wurmple is Knocked Out), the Attacking Pokémon is now Poisoned."
          delayedA {
            // TODO
          }
        }
        move "String Pull", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost C
          attackRequirement {}
          onAttack {
            whirlwind()
          }
        }
      };
      case WYNAUT_71:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Wobbuffet from your hand onto Wynaut (this counts as evolving Wynaut) and remove all damage counters from Wynaut."
          actionA {
            assert my.hand.findAll{it.name == "Wobbuffett"} : "There is no Pokémon in your hand to evolve ${self}."
            checkLastTurn()
            powerUsed()
            def tar = my.hand.findAll { it.name == "Wobbuffet" }.select()
            if (tar) {
              evolve(self, tar.first(), OTHER)
              heal self.numberOfDamageCounters*10, self
            }
          }
        }
        move "Confusion Wave", {
          text "Both Wynaut and the Defending Pokémon are now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            apply CONFUSED
            apply CONFUSED, self
          }
        }
      };
      case CURSED_STONE_72:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "At any time between turns, each player puts 1 damage counter on his or her Pokémon that has a Poké-Power."
        onPlay {
          // TODO
        }
        onRemoveFromPlay{
        }
      };
      case FIELDWORKER_73:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Draw 3 cards. Your opponent may also draw a card."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case FULL_FLAME_74:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Put 4 damage counters instead of 2 on each Burned Pokémon between turns. The Special Condition Burned can't be removed by evolving or devolving the Burned Pokémon."
        onPlay {
          // TODO
        }
        onRemoveFromPlay{
        }
      };
      case GIANT_STUMP_75:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player can't have more than 3 Benched Pokémon. When Giant Stump comes into play, each player discards Benched Pokémon and any cards attached to them until he or she has 3 Benched Pokémon. (You discard your Pokémon first.)"
        onPlay {
          // TODO
        }
        onRemoveFromPlay{
        }
      };
      case POWER_TREE_76:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Once during each player's turn, if the player has no Special Energy cards in his or her discard pile, that player searches his or her discard pile for a basic Energy card, shows it to the opponent, and puts it into his or her hand."
        onPlay {
          // TODO
        }
        onRemoveFromPlay{
        }
      };
      case STRANGE_CAVE_77:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Once during each player's turn, that player may put an Omanyte, Kabuto, Aerodactyl, Aerodactyl ex, Lileep, or Anorith onto his or her Bench from his or her hand. Treat the new Benched Pokémon as Basic Pokémon."
        onPlay {
          // TODO
        }
        onRemoveFromPlay{
        }
      };
      case CLAW_FOSSIL_78:
      return itemCard (this) {
        text "Play Claw Fossil as if it were a Basic Pokémon. While in play, Claw Fossil counts as a [C] Pokémon (as well as a Trainer card). Claw Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Claw Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Claw Fossil from play." +
          "If Claw Fossil is your Active Pokémon and is damaged by an opponent's attack (even if Claw Fossil is Knocked Out), put 1 damage counter on the Attacking Pokémon."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case MYSTERIOUS_FOSSIL_79:
      return itemCard (this) {
        text "Play Mysterious Fossil as if it were a Basic Pokémon. While in play, Mysterious Fossil counts as a [C] Pokémon (as well as a Trainer card). Mysterious Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Mysterious Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Mysterious Fossil from play."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case ROOT_FOSSIL_80:
      return itemCard (this) {
        text "Play Root Fossil as if it were a Basic Pokémon. While in play, Root Fossil counts as a [C] Pokémon (as well as a Trainer card). Root Fossil has no attacks of its own, can't retreat, and can't be affected by any Special Conditions. If Root Fossil is Knocked Out, it doesn't count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn before your attack, you may discard Root Fossil from play." +
          "At any time between turns, remove 1 damage counter from Root Fossil."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case RAINBOW_ENERGY_81:
      return specialEnergy (this, [[C]]) {
        text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) When you attach this card from your hand to 1 of your Pokémon, put 1 damage counter on that Pokémon."
        onPlay {reason->
          // TODO
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case REACT_ENERGY_82:
      return specialEnergy (this, [[C]]) {
        text "React Energy provides [C] Energy."
        onPlay {reason->
          // TODO
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ARCANINE_EX_83:
      return evolution (this, from:"Growlithe", hp:HP120, type:R, retreatCost:2) {
        weakness W
        pokeBody "Fire Remedy", {
          text "Whenever you attach a [R] Energy from your hand to Arcanine ex, remove 1 damage counter and all Special Conditions from Arcanine ex."
          delayedA {
            // TODO
          }
        }
        move "Overrun", {
          text "30 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            if (opp.bench) {
              damage 20, opp.bench.select()
            }
          }
        }
      };
      case ARMALDO_EX_84:
      return evolution (this, from:"Anorith", hp:HP160, type:F, retreatCost:3) {
        weakness G
        pokeBody "Dual Armor", {
          text "As long as Armaldo ex has any React Energy cards attached to it, Armaldo ex is both Grass and Fighting type."
          getterA GET_POKEMON_TYPE, self, {h->
            if (self.cards.findAll { it.name.contains("React Energy") }) {
              h.object.add(G)
            }
          }
        }
        move "Spiral Drain", {
          text "40 damage. Remove 2 damage counters from Armaldo ex."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
            heal 20, self
          }
        }
      };
      case BANETTE_EX_85:
      return evolution (this, from:"Shuppet", hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokePower "Shady Move", {
          text "Once during your turn (before your attack), if Banette ex is your Active Pokémon, you may move 1 damage counter from either player's Pokémon to another Pokémon (yours or your opponent's). This power can't be used if Banette ex is affected by a Special Condition."
          actionA {
            // TODO
          }
        }
        move "Shadow Chant", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Supporter card in your discard pile. You can't add more than 60 damage in this way."
          energyCost P, C
          attackRequirement {}
          onAttack {
            def bonusDamage = Math.min(my.discard.filterByType(SUPPORTER).size()*10, 60)
            damage 30+bonusDamage
          }
        }
      };
      case DUSTOX_EX_86:
      return evolution (this, from:"Cascoon", hp:HP140, type:G, retreatCost:1) {
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Dustox ex by your opponent's Pokémon-ex."
          delayedA {
            // TODO
          }
        }
        move "Silver Wind", {
          text "40 damage. During your next turn, if an attack does damage to the Defending Pokémon (after applying Weakness and Resistance), that attack does 30 more damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 40
            // TODO
          }
        }
      };
      case FLYGON_EX_87:
      return evolution (this, from:"Vibrava", hp:HP150, type:C, retreatCost:2) {
        weakness C
        pokePower "Emerge Charge", {
          text "Once during your turn, when you play Flygon ex from your hand to evolve 1 of your Pokémon, you may search your discard pile for up to 2 Energy cards and attach them to Flygon ex."
          actionA {
            // TODO
          }
        }
        move "Reactive Blast", {
          text "40+ damage. You may discard any number of React Energy cards attached to Flygon ex. If you do, this attack does 40 damage plus 30 more damage for each React Energy card you discarded."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 40
            // TODO
          }
        }
      };
      case MEW_EX_88:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness P
        pokeBody "Versatile", {
          text "Mew ex can use the attacks of all Pokémon in play as its own. (You still need the necessary Energy to use each attack.)"
          delayedA {
            // TODO
          }
        }
        move "Power Move", {
          text "Search your deck for an Energy card and attach it to Mew ex. Shuffle your deck afterward. Then, you may switch Mew ex with 1 of your Benched Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            // TODO
            attachEnergyFrom(my.deck, self)
            shuffleDeck()
          }
        }
      };
      case WALREIN_EX_89:
      return evolution (this, from:"Sealeo", hp:HP150, type:W, retreatCost:3) {
        pokeBody "Icy Aura", {
          text "As long as Walrein ex is your Active Pokémon, put 1 damage count on each Active Pokémon (both yours and your opponent's) between turns, excluding [W] Pokémon."
          delayedA {
            // TODO
          }
        }
        move "Water Arrow", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 40, opp.all.select()
          }
        }
      };
      case REGICE_STAR_90:
      return basic (this, hp:HP090, type:W, retreatCost:3) {
        weakness M
        move "Ice Barrier", {
          text "10 damage. Prevent all effects of an attack, including damage, done to Regice Star by your opponent's Pokémon-ex during your opponent's next turn."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
            // TODO Curious to see if this works the way I expect it to
            preventAllEffectsFromCustomPokemonNextTurn("Ice Barrier", self, {it.EX})
          }
        }
        move "Final Blizzard", {
          text "30 damage. If your opponent has only 1 Prize card left and Regice Star is the only Pokémon you have in play, this attack does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30

            if (opp.prizeCardSet.size() == 1 && my.all.size() == 1) {
              opp.bench.each {
                damage 30, it
              }
            }
          }
        }
      };
      case REGIROCK_STAR_91:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
        weakness W
        move "Dig Drain", {
          text "10 damage. Remove 1 damage counter from Regirock Star."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
            heal 10, self
          }
        }
        move "Final Blast", {
          text "30 damage. If your opponent has only 1 Prize card left and Regirock Star is the only Pokémon you have in play, this attack's base damage is 100 instead of 30."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            def amount = 30
            if (opp.prizeCardSet.size() == 1 && my.all.size() == 1) {
              amount = 100
            }
            damage amount
          }
        }
      };
      case REGISTEEL_STAR_92:
      return basic (this, hp:HP090, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Barrier Attack", {
          text "10 damage. During your opponent's next turn, any damage done to Registeel Star by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
            reduceDamageNextTurn(hp(10), thisMove)
          }
        }
        move "Final Laser", {
          text "10 damage. Put 3 damage counters on your opponent's Pokémon in any way you like. If your opponent has only 1 Prize card left and Registeel Star is the only Pokémon you have in play, put 6 damage counters instead."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 10

            def counters = 3
            if (opp.prizeCardSet.size() == 1 && my.all.size() == 1) {
              counters = 6
            }
            (1..counters).each {
              directDamage 10, opp.all.select("Put 1 damage counter to which Pokémon? $it/counters remaining")
            }
          }
        }
      };
      case PIKACHU_Δ_93:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Iron Tail", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost M, C
          attackRequirement {}
          onAttack {
            flipUntilTails { damage 20 }
          }
        }
      };
      default:
      return null;
    }
  }
}
