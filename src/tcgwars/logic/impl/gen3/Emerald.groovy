package tcgwars.logic.impl.gen3;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum Emerald implements LogicCardInfo {

  BLAZIKEN_1 ("Blaziken", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DEOXYS_2 ("Deoxys", 2, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  EXPLOUD_3 ("Exploud", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GARDEVOIR_4 ("Gardevoir", 4, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GROUDON_5 ("Groudon", 5, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  KYOGRE_6 ("Kyogre", 6, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MANECTRIC_7 ("Manectric", 7, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MILOTIC_8 ("Milotic", 8, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAYQUAZA_9 ("Rayquaza", 9, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  SCEPTILE_10 ("Sceptile", 10, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SWAMPERT_11 ("Swampert", 11, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  CHIMECHO_12 ("Chimecho", 12, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GLALIE_13 ("Glalie", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GROUDON_14 ("Groudon", 14, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  KYOGRE_15 ("Kyogre", 15, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MANECTRIC_16 ("Manectric", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  NOSEPASS_17 ("Nosepass", 17, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  RELICANTH_18 ("Relicanth", 18, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  RHYDON_19 ("Rhydon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEVIPER_20 ("Seviper", 20, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  ZANGOOSE_21 ("Zangoose", 21, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  BRELOOM_22 ("Breloom", 22, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CAMERUPT_23 ("Camerupt", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CLAYDOL_24 ("Claydol", 24, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  COMBUSKEN_25 ("Combusken", 25, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DODRIO_26 ("Dodrio", 26, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ELECTRODE_27 ("Electrode", 27, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  GROVYLE_28 ("Grovyle", 28, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GRUMPIG_29 ("Grumpig", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GRUMPIG_30 ("Grumpig", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HARIYAMA_31 ("Hariyama", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ILLUMISE_32 ("Illumise", 32, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  KIRLIA_33 ("Kirlia", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LINOONE_34 ("Linoone", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LOUDRED_35 ("Loudred", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MARSHTOMP_36 ("Marshtomp", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MINUN_37 ("Minun", 37, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  NINETALES_38 ("Ninetales", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PLUSLE_39 ("Plusle", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SWALOT_40 ("Swalot", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SWELLOW_41 ("Swellow", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  VOLBEAT_42 ("Volbeat", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  BALTOY_43 ("Baltoy", 43, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  CACNEA_44 ("Cacnea", 44, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DODUO_45 ("Doduo", 45, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DUSKULL_46 ("Duskull", 46, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ELECTRIKE_47 ("Electrike", 47, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRIKE_48 ("Electrike", 48, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  FEEBAS_49 ("Feebas", 49, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FEEBAS_50 ("Feebas", 50, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GULPIN_51 ("Gulpin", 51, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LARVITAR_52 ("Larvitar", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUVDISC_53 ("Luvdisc", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAKUHITA_54 ("Makuhita", 54, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEDITITE_55 ("Meditite", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MUDKIP_56 ("Mudkip", 56, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  NUMEL_57 ("Numel", 57, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  NUMEL_58 ("Numel", 58, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  PICHU_59 ("Pichu", 59, Rarity.COMMON, [BASIC, BABY, POKEMON, _LIGHTNING_]),
  PIKACHU_60 ("Pikachu", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RALTS_61 ("Ralts", 61, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  RHYHORN_62 ("Rhyhorn", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SHROOMISH_63 ("Shroomish", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SNORUNT_64 ("Snorunt", 64, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SPOINK_65 ("Spoink", 65, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SPOINK_66 ("Spoink", 66, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SWABLU_67 ("Swablu", 67, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TAILLOW_68 ("Taillow", 68, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TORCHIC_69 ("Torchic", 69, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TREECKO_70 ("Treecko", 70, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_71 ("Voltorb", 71, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  VULPIX_72 ("Vulpix", 72, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WHISMUR_73 ("Whismur", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ZIGZAGOON_74 ("Zigzagoon", 74, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BATTLE_FRONTIER_75 ("Battle Frontier", 75, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  DOUBLE_FULL_HEAL_76 ("Double Full Heal", 76, Rarity.UNCOMMON, [TRAINER]),
  LANETTE_S_NET_SEARCH_77 ("Lanette's Net Search", 77, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LUM_BERRY_78 ("Lum Berry", 78, Rarity.COMMON, [POKEMON_TOOL, TRAINER]),
  MR__STONE_S_PROJECT_79 ("Mr. Stone's Project", 79, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  ORAN_BERRY_80 ("Oran Berry", 80, Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
  POKENAV_81 ("PokéNav", 81, Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_BIRCH_82 ("Professor Birch", 82, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  RARE_CANDY_83 ("Rare Candy", 83, Rarity.UNCOMMON, [TRAINER]),
  SCOTT_84 ("Scott", 84, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  WALLY_S_TRAINING_85 ("Wally's Training", 85, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  DARKNESS_ENERGY_86 ("Darkness Energy", 86, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  DOUBLE_RAINBOW_ENERGY_87 ("Double Rainbow Energy", 87, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_88 ("Metal Energy", 88, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  MULTI_ENERGY_89 ("Multi Energy", 89, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  ALTARIA_EX_90 ("Altaria ex", 90, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_, EX]),
  CACTURNE_EX_91 ("Cacturne ex", 91, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_, EX]),
  CAMERUPT_EX_92 ("Camerupt ex", 92, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_, EX]),
  DEOXYS_EX_93 ("Deoxys ex", 93, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  DUSCLOPS_EX_94 ("Dusclops ex", 94, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_, EX]),
  MEDICHAM_EX_95 ("Medicham ex", 95, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_, EX]),
  MILOTIC_EX_96 ("Milotic ex", 96, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_, EX]),
  RAICHU_EX_97 ("Raichu ex", 97, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_, EX]),
  REGICE_EX_98 ("Regice ex", 98, Rarity.RARE, [BASIC, POKEMON, _WATER_, EX]),
  REGIROCK_EX_99 ("Regirock ex", 99, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_, EX]),
  REGISTEEL_EX_100 ("Registeel ex", 100, Rarity.RARE, [BASIC, POKEMON, _METAL_, EX]),
  GRASS_ENERGY_101 ("Grass Energy", 101, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_102 ("Fire Energy", 102, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_103 ("Water Energy", 103, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_104 ("Lightning Energy", 104, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_105 ("Psychic Energy", 105, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  FIGHTING_ENERGY_106 ("Fighting Energy", 106, Rarity.RARE, [BASIC_ENERGY, ENERGY]),
  FARFETCH_D_107 ("Farfetch'd", 107, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Emerald(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.EMERALD;
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
        return evolution (this, from:"Combusken", hp:HP110, type:FIRE, retreatCost:2) {
          weakness WATER
          pokeBody "Blaze", {
            text "As long as Blaziken’s remaining HP is 40 or less, Blaziken does 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(it.from == self && it.to == self.owner.opposite.pbg.active && self.getRemainingHP().value <= 40) {
                    bc "Blaze +40"
                    it.dmg += hp(40)
                  }
                }
              }
            }
          }
          move "Searing Flame", {
            text "10 damage. The Defending Pokémon is now Burned."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage BURNED
            }
          }
          move "Damage Burn", {
            text "50+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 50
              if(defending.numberOfDamageCounters) damage 20
            }
          }

        };
      case DEOXYS_2:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Swift", {
            text "30 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Power, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage(30, defending)
            }
          }

        };
      case EXPLOUD_3:
        return evolution (this, from:"Loudred", hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Collect", {
            text "Draw 3 cards."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 3
            }
          }
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              flipThenApplySC PARALYZED
            }
          }
          move "Hyper Voice", {
            text "50 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Mega Throw", {
            text "60+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 60 damage plus 40 more damage."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if (defending.EX) {
                damage 40
              }
            }
          }

        };
      case GARDEVOIR_4:
        return evolution (this, from:"Kirlia", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokePower "Heal Dance", {
            text "Once during your turn (before your attack), you may remove 2 damage counter from 1 of your Pokémon. You can’t use more than 1 Heal Dance Poké-Power each turn. This power can’t be used if Gardevoir is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert bg.em().retrieveObject("Heal_Dance") != bg.turnCount : "You cannot use $pokePower more than once per turn!"
              assert my.all.find{it.numberOfDamageCounters} : "There are no pokémon to heal on your side of the field"
              bg.em().storeObject("Heal_Dance",bg.turnCount)
              powerUsed()
              heal 20, my.all.findAll{it.numberOfDamageCounters}.select("Select a Pokémon to remove 2 damage counter from it")
            }
          }
          move "Psypunch", {
            text "30 damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Mind Shock", {
            text "60 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C, C, C
            attackRequirement {}
            onAttack {
              noWrDamage 60, defending
            }
          }

        };
      case GROUDON_5:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness WATER
          move "Slash", {
            text "10 damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Rock Tumble", {
            text "40 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              dontApplyResistance()
            }
          }

        };
      case KYOGRE_6:
        return basic (this, hp:HP080, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Ram", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Aqua Sonic", {
            text "40 damage. This attack’s damage isn’t affected by Resistance."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              dontApplyResistance()
            }
          }

        };
      case MANECTRIC_7:
        return evolution (this, from:"Electrike", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Swift", {
            text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              swiftDamage(20,defending)
            }
          }
          move "Tail Shock", {
            text "40 damage. Does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 40
              opp.bench.each{damage 10, it}
            }
          }

        };
      case MILOTIC_8:
        return evolution (this, from:"Feebas", hp:HP090, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Surf", {
            text "20 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Super Hypno Wave", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flipThenApplySC ASLEEP
            }
          }

        };
      case RAYQUAZA_9:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness COLORLESS
          move "Dragon Dance", {
            text "During your next turn, if any of your current Active Pokémon does damage to any Defending Pokémon, the attack does 30 more damage (before applying Weakness and Resistance)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              delayed{
                after PROCESS_ATTACK_EFFECTS, {
                  bg.dm().each{
                    if(it.from == self && it.to.active && it.notNoEffect && it.dmg.value) {
                      bc "Dragon Dance +30"
                      it.dmg += hp(30)
                    }
                  }
                }
                after SWITCH, self, {unregister()}
                after EVOLVE, self, {unregister()}
                unregisterAfter 3
              }
            }
          }
          move "Dragon Claw", {
            text "40 damage."
            energyCost R, L, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case SCEPTILE_10:
        return evolution (this, from:"Grovyle", hp:HP100, type:GRASS, retreatCost:2) {
          weakness FIRE
          resistance WATER, MINUS30
          pokeBody "Green Essence", {
            text "As long as Sceptile is in play, each of your Active Pokémon that has [G] Energy attached to it can’t be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION, {
                def pcs=e.getTarget(bg)
                if (pcs.active && pcs.owner==self.owner && pcs.cards.energyCount(G)) {
                  bc "Green Essence prevents special conditions"
                  prevent()
                }
              }
            }
            onActivate {
              if(my.active.cards.energyCount(G) && my.active.specialConditions){
                bc "Green Essence clears existing Special Conditions in the Active ${my.active}."
                clearSpecialCondition(my.active, SRC_ABILITY)
              }
            }
          }
          move "Razor Leaf", {
            text "30 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Swift", {
            text "60 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost G, C, C, C
            attackRequirement {}
            onAttack {
              swiftDamage(60,defending)
            }
          }

        };
      case SWAMPERT_11:
        return evolution (this, from:"Marshtomp", hp:HP110, type:WATER, retreatCost:2) {
          weakness GRASS
          pokePower "Water Cyclone", {
            text "As often as you like during your turn (before your attack), you may move a [W] Energy attached to 1 of your Active Pokémon to 1 of your Benched Pokémon. This power can’t be used if Swampert is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.active.cards.energyCount(W)>0 : "No [W] Energy is attached to ${my.active}"
              assert my.bench : "There is no Benched Pokémon"
              powerUsed()
              def card=my.active.cards.filterByEnergyType(W).select("Card to move").first()
              def tar=my.bench
              tar=tar.select("Target for [W]")
              energySwitch(my.active, tar, card)
            }
          }
          move "Spinning Tail", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {
              opp.all.each{damage 10,it}
            }
          }
          move "Aqua Sonic", {
            text "60 damage. This attack’s damage isn’t affected by Resistance."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 60
              dontApplyResistance()
            }
          }

        };
      case CHIMECHO_12:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Warp Sounds", {
            text "20 damage. If the Defending Pokémon is an Evolved Pokémon, the Defending Pokémon is now Confused."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              if(defending.evolution) applyAfterDamage CONFUSED
            }
          }

        };
      case GLALIE_13:
        return evolution (this, from:"Snorunt", hp:HP080, type:WATER, retreatCost:1) {
          weakness METAL
          move "Hailstone", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {
              opp.all.each{damage 10,it}
            }
          }
          move "Super Slash", {
            text "40+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 40 damage plus 20 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(defending.evolution) damage 20
            }
          }

        };
      case GROUDON_14:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness WATER
          move "Slash", {
            text "20 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Eruption", {
            text "40+ damage. Each player discards the top card of his or her deck. This attack does 40 damage plus 10 more damage for each Energy card discarded in this way."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(opp.deck){
                if(opp.deck.subList(0,1).filterByType(ENERGY)) damage 10
                opp.deck.subList(0,1).discard()
              }
              if(my.deck){
                if(my.deck.subList(0,1).filterByType(ENERGY)) damage 10
                my.deck.subList(0,1).discard()
              }
            }
          }

        };
      case KYOGRE_15:
        return basic (this, hp:HP080, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Scary Face", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                cantRetreat defending
                cantAttackNextTurn defending
              }
            }
          }
          move "Hydro Pump", {
            text "40+ damage. Does 40 damage plus 10 more damage for each [W] Energy attached to Kyogre but not used to pay for this attack’s Energy cost. You can’t add more than than 20 damage in this way."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 40
              extraEnergyDamage(2,hp(10),W,thisMove)
            }
          }

        };
      case MANECTRIC_16:
        return evolution (this, from:"Electrike", hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Dazzle Blast", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC CONFUSED
            }
          }
          move "Zap Kick", {
            text "40 damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case NOSEPASS_17:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness WATER
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Wide Laser", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              opp.all.each{damage 10, it}
            }
          }

        };
      case RELICANTH_18:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Sharp Fin", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Hypno Splash", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }

        };
      case RHYDON_19:
        return evolution (this, from:"Rhyhorn", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness WATER
          move "Horn Attack", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Rock Tumble", {
            text "60 damage. This attack’s damage isn’t affected by Resistance."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              dontApplyResistance()
            }
          }

        };
      case SEVIPER_20:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Pierce", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Bite Off", {
            text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 30 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (defending.EX) { damage 30 }
            }
          }

        };
      case ZANGOOSE_21:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Extra Claws", {
            text "10+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 10 damage plus 20 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if (defending.EX) { damage 20 }
            }
          }
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case BRELOOM_22:
        return evolution (this, from:"Shroomish", hp:HP080, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Power Blow", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Breloom."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10+10*self.cards.energyCount(C)
            }
          }
          move "Body Slam", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 40
              flipThenApplySC PARALYZED
            }
          }

        };
      case CAMERUPT_23:
        return evolution (this, from:"Numel", hp:HP080, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Extra Flame", {
            text "20+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 20 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if (defending.EX) {
                damage 30
              }
            }
          }
          move "Super Singe", {
            text "40 damage. The Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage BURNED
            }
          }

        };
      case CLAYDOL_24:
        return evolution (this, from:"Baltoy", hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          pokeBody "Levitate", {
            text "As long as Claydol has any Energy attached to it, the Retreat Cost for Claydol is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(C)) {
                h.object = 0
              }
            }
          }
          move "Rock Smash", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {damage 10}
            }
          }

        };
      case COMBUSKEN_25:
        return evolution (this, from:"Torchic", hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Lava Burn", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench){
                damage 10,opp.bench.select("do 10 damage to which pokémon?")
              }
            }
          }
          move "Sharp Claws", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 10 more damage."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {damage 10}
            }
          }

        };
      case DODRIO_26:
        return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Smash Kick", {
            text "30 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Smash Turn", {
            text "40 damage. After your attack, you may switch Dodrio with 1 of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage{
                switchYourActive(may: true)
              }
            }
          }

        };
      case ELECTRODE_27:
        return evolution (this, from:"Voltorb", hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Speed Ball", {
            text "50 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case GROVYLE_28:
        return evolution (this, from:"Treecko", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Tail Shake", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Razor Leaf", {
            text "40 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case GRUMPIG_29:
        return evolution (this, from:"Spoink", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Teleport Blast", {
            text "40 damage. After your attack, you may switch Grumpig with 1 of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage{
                switchYourActive(may: true)
              }
            }
          }

        };
      case GRUMPIG_30:
        return evolution (this, from:"Spoink", hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Snap Tail", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select()
            }
          }
          move "Psypunch", {
            text "40 damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case HARIYAMA_31:
        return evolution (this, from:"Makuhita", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Cross-Cut", {
            text "20+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 20 damage plus 20 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              if(defending.evolution) damage 20
            }
          }
          move "Shove", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flipThenApplySC PARALYZED
            }
          }

        };
      case ILLUMISE_32:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
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
      case KIRLIA_33:
        return evolution (this, from:"Ralts", hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Psypunch", {
            text "30 damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Mind Shock", {
            text "40 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              noWrDamage(40,defending)
            }
          }

        };
      case LINOONE_34:
        return evolution (this, from:"Zigzagoon", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness FIGHTING
          move "Body Slam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
          move "Claw Swipe", {
            text "30 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case LOUDRED_35:
        return evolution (this, from:"Whismur", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Body Slam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
          move "Double-edge", {
            text "50 damage. Loudred does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              damage 10,self
            }
          }

        };
      case MARSHTOMP_36:
        return evolution (this, from:"Mudkip", hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Super Hypno Wave", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Surf", {
            text "50 damage."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case MINUN_37:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          pokeBody "Electro-guard", {
            text "As long Minun has any [L] Energy attached to it, Minun has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target == self && self.cards.energyCount(L)) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{damage 20}
            }
          }

        };
      case NINETALES_38:
        return evolution (this, from:"Vulpix", hp:HP080, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Confuse Ray", {
            text "10 damage. The Defending Pokémon is now Confused."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage CONFUSED
            }
          }
          move "Searing Flame", {
            text "40 damage. The Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage BURNED
            }
          }

        };
      case PLUSLE_39:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case SWALOT_40:
        return evolution (this, from:"Gulpin", hp:HP080, type:GRASS, retreatCost:2) {
          weakness PSYCHIC
          move "Blot", {
            text "20 damage. Remove 1 damage counter from Swalot."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              heal 10,self
            }
          }
          move "Poison Breath", {
            text "40 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage POISONED
            }
          }

        };
      case SWELLOW_41:
        return evolution (this, from:"Taillow", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Peck", {
            text "20 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Skill Dive", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40, opp.all.select()
            }
          }

        };
      case VOLBEAT_42:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Confuse Ray", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flip{apply CONFUSED}
            }
          }
          move "Double-edge", {
            text "30 damage. Volbeat does 10 damage to itself."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10,self
            }
          }

        };
      case BALTOY_43:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Slap", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Pierce", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case CACNEA_44:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Spike Cannon", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 3, {damage 10}
            }
          }

        };
      case DODUO_45:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Paralyzing Gaze", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {apply PARALYZED}
            }
          }

        };
      case DUSKULL_46:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Pound", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case ELECTRIKE_47:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Double Kick", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }

        };
      case ELECTRIKE_48:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Rear Kick", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Skull Bash", {
            text "30 damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case FEEBAS_49:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Submerge", {
            text "As long as Feebas is on your Bench, prevent all damage done to Feebas by attacks (both yours and your opponent’s)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(!self.active && it.to == self){
                    bc "Submerge prevent all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost W, C
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case FEEBAS_50:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Water Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select()
            }
          }

        };
      case GULPIN_51:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Headbutt", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Drool", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case LARVITAR_52:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Dig Under", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost F, C
            attackRequirement {}
            onAttack {
              noWrDamage(20,opp.all.select())
            }
          }

        };
      case LUVDISC_53:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Call for Friend", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic: true, 1, delegate)
          }
          move "Strange Scale", {
            text "20 damage. If the Defending Pokémon is an Evolved Pokémon, the Defending Pokémon is now Confused."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              if(defending.evolution) applyAfterDamage CONFUSED
            }
          }

        };
      case MAKUHITA_54:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Cross Chop", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case MEDITITE_55:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "High Jump Kick", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Fake Out", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case MUDKIP_56:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Tail Strike", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case NUMEL_57:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost R
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case NUMEL_58:
        return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Stampede", {
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
      case PICHU_59:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              checkCanBabyEvolve("Pikachu", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Pikachu", self)
            }
          }
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }

        };
      case PIKACHU_60:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Pike Ball", {
            text "10 damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case RALTS_61:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hypnotic Ray", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }

        };
      case RHYHORN_62:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness WATER
          move "Horn Attack", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Horn Drill", {
            text "20 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case SHROOMISH_63:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Ram", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
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
      case SNORUNT_64:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness METAL
          move "Beat", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case SPOINK_65:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Knock Away", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case SPOINK_66:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case SWABLU_67:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Feathery", {
            text "As long as Swablu is on your Bench, prevent all damage done to Swablu by opponent’s attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(!self.active && it.to == self && it.from.owner == self.owner.opposite){
                    bc "Feathery prevent all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Razor Wind", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case TAILLOW_68:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Razor Wind", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {damage 10}
            }
          }

        };
      case TORCHIC_69:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Hypnotic Gaze", {
            text "The Defending Pokémon is now Asleep."
            energyCost R
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }

        };
      case TREECKO_70:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Tail Smash", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost G
            attackRequirement {}
            onAttack {
              flip {damage 10}
            }
          }

        };
      case VOLTORB_71:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Ram", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Speed Ball", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case VULPIX_72:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Bite", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Firebreathing", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case WHISMUR_73:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Tackle", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Rollout", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case ZIGZAGOON_74:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Gnaw", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Body Slam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }

        };
      case BATTLE_FRONTIER_75:
        return stadium (this) {
          text "Each player’s [C] Evolved Pokémon, [D] Evolved Pokémon and [M] Evolved Pokémon can’t use any Poké-Powers or Poké-Bodies.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def eff
          onPlay {
            eff = getter IS_ABILITY_BLOCKED, { Holder h->
              if (h.effect.target.evolution && (h.effect.ability instanceof PokeBody || h.effect.ability instanceof PokePower) && (h.effect.target.types.contains(C) || h.effect.target.types.contains(D) || h.effect.target.types.contains(M))) {
                h.object=true
              }
            }
            new CheckAbilities().run(bg)
          }
          onRemoveFromPlay{
            eff.unregister()
            new CheckAbilities().run(bg)
          }
        };
      case DOUBLE_FULL_HEAL_76:
        return copy (Sandstorm.DOUBLE_FULL_HEAL_86, this);
      case LANETTE_S_NET_SEARCH_77:
        return copy (Sandstorm.LANETTE_S_NET_SEARCH_87, this);
      case LUM_BERRY_78:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAt any time between turns, if the Pokémon this card is attached to is affected by any Special Conditions, remove all of them. Then, discard Lum Berry."
          //TODO: Edit so it handles interaction with Snorlax (DF 10) and Hypno (FRLG 25) properly.
          //
          // Q. Say Snorlax is Asleep and the opponent has a Hypno. Also, Snorlax has a Lum Berry attached and fails to wake up from the coin flip. Can Snorlax heal its 2 damage counters first, then trigger the Lum Berry to avoid Hypno's damage?
          //
          // A. You can choose to use the Lum Berry either before or after the coin flip; it's up to player what gets done first. So for Snorlax, you have to either choose to wake him up with Lum Berry, or stay asleep and use the "Rest Up" Poké-BODY; it cannot avoid Hypno's damage if it stays asleep. (Oct 7, 2004 PUI Rules Team)
          def eff
          onPlay {reason->
            eff=delayed(anytime:true){
              before BEGIN_TURN,{
                if(self.specialConditions) {
                  bc "Lum Berry activates"
                  clearSpecialCondition(self,Source.TRAINER_CARD)
                  discard thisCard
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case MR__STONE_S_PROJECT_79:
        return supporter (this) {
          text "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. Or, search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def choice = 1
            if(my.discard.filterByType(BASIC_ENERGY) && my.deck){
              choice = choose([1,2], ['Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand', 'Search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand.'], "Choose 1")
            }
            else{
              if(!my.deck){choice = 2}
            }
            if(choice == 1){
              my.deck.search(max: 2,"Search for up to 2 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).showToOpponent("Selected cards.").moveTo(my.hand)
            }
            else{
              my.discard.filterByType(BASIC_ENERGY).select(max: 2).showToOpponent("Selected cards.").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.deck || my.discard.filterByType(BASIC_ENERGY) : "You have no cards left in deck, and no basic Energy cards in your discard pile"
          }
        };
      case ORAN_BERRY_80:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAt any time between turns, if the Pokémon this card is attached to has at least 2 damage counters on it, remove 2 damage counters from it. Then, discard Oran Berry."
          def eff
          onPlay {reason->
            eff=delayed(anytime:true){
              before BEGIN_TURN,{
                if(self.numberOfDamageCounters >= 2) {
                  bc "Oran Berry activates"
                  heal 20, self
                  discard thisCard
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case POKENAV_81:
        return copy (RubySapphire.POKENAV_88, this);
      case PROFESSOR_BIRCH_82:
        return supporter (this) {
          text "Draw cards from your deck until you have 6 cards in your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            draw (7-my.hand.size())
          }
          playRequirement {
            assert my.deck
            assert my.hand.size()<7 : "You have already more than 6 cards in your hand."
          }
        };
      case RARE_CANDY_83:
        return copy (Sandstorm.RARE_CANDY_88, this);
      case SCOTT_84:
        return supporter (this) {
          text "Search you deck for up to 3 cards in any combination of Supporter cards and Stadium cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.deck.search(max :3,"Search your deck for 3 Supporter or Stadium in any combination",{it.cardTypes.is(SUPPORTER) || it.cardTypes.is(STADIUM)}).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case WALLY_S_TRAINING_85:
        return copy (Sandstorm.WALLY_S_TRAINING_89, this);
      case DARKNESS_ENERGY_86:
        return specialEnergy (this, [[D]]) {
          text: "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect unless the Attacking Pokémon is Darkness or has Dark in its name. Darkness Energy provides Darkness Energy. (Doesn't count as a basic Energy card.)"
          def eff
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm.each(){
                  if(it.from == self && it.to.active && it.to.owner != self.owner && self.types.contains(D) && it.dmg.value) {
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        }
            
      case DOUBLE_RAINBOW_ENERGY_87:
        return specialEnergy (this, [[]]) {
          text "Double Rainbow Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). While in play, Double Rainbow Energy provides every type of Energy but provides 2 Energy at a time. (Has no effect other than providing Energy.) Damage done to your opponent's Pokémon by the Pokémon Double Rainbow Energy is attached to is reduced by 10 (before applying Weakness and Resistance). When the Pokémon Double Rainbow Energy is attached to is no longer an Evolved Pokémon, discard Double Rainbow Energy. (Major text change in Emerald. Using earlier versions requires reference.)"
          def eff
          def check = {
            if(!it.evolution || it.EX){discard thisCard}
          }
          typeImagesOverride = [RAINBOW, RAINBOW]
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.owner!=self.owner && it.dmg.value) {
                    bc "Double Rainbow Energy -10"
                    it.dmg -= hp(10)
                  }
                }
              }
              after EVOLVE, self, {check(self)}
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
            check(to)
          }
          allowAttach {to->
            to.evolution && !to.EX
          }
          getEnergyTypesOverride{
            return [[R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set]
          }

        };
      case METAL_ENERGY_88:
        return copy (RubySapphire.METAL_ENERGY_94, this);
      case MULTI_ENERGY_89:
        return copy (Sandstorm.MULTI_ENERGY_93, this);
      case ALTARIA_EX_90:
        return evolution (this, from:"Swablu", hp:HP100, type:COLORLESS, retreatCost:1) {
          pokeBody "Mist", {
            text "Any damage done to Altaria ex by attacks from Stage 2 Evolved Pokémon (both yours and your opponent’s) is reduced by 30 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to==self && it.from.evolution && it.from.topPokemonCard.cardTypes.is(STAGE2) && it.dmg.value && it.notNoEffect){
                    bc "Mist : -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Dive", {
            text "20 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Dragon Mist", {
            text "70 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W, L, C
            attackRequirement {}
            onAttack {
              new ResolvedDamage(hp(70), my.active, defending, Source.ATTACK, DamageManager.DamageFlag.NO_DEFENDING_EFFECT, DamageManager.DamageFlag.NO_RESISTANCE).run(bg)
            }
          }

        };
      case CACTURNE_EX_91:
        return evolution (this, from:"Cacnea", hp:HP110, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokeBody "Cursed Glare", {
            text "As long as Cacturne ex is your Active Pokémon, your opponent can’t attach any Special Energy cards (except for [D] and [M] Energy cards) from his or her hand to his or her Active Pokémon."
            delayedA {
              before ATTACH_ENERGY, self.owner.opposite.pbg.active, {
                if(ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite && ef.resolvedTarget.active && self.active && (ef.card instanceof SpecialEnergyCard && ef.card.name != "Darkness Energy" && ef.card.name != "Metal Energy")) {
                  wcu "Cursed Glare: Can't attach energy"
                  prevent()
                }
              }
            }
          }
          move "Psybeam", {
            text "20 damage. The Defending Pokémon is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Spike Rend", {
            text "50+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if(defending.numberOfDamageCounters) damage 20
            }
          }

        };
      case CAMERUPT_EX_92:
        return evolution (this, from:"Numel", hp:HP120, type:FIRE, retreatCost:2) {
          weakness WATER
          pokeBody "Magma Armor", {
            text "Camerupt ex can’t be Asleep or Paralyzed."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(ef.type == ASLEEP || ef.type == PARALYZED){
                  bc "$self Magma Armor pervent it to be ASLEEP or Paralyzed"
                  prevent()
                }
              }
            }
          }
          move "Searing Flame", {
            text "30 damage. The Defending Pokémon is now Burned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage BURNED
            }
          }
          move "Eruption", {
            text "60+ damage. Each player discards the top card of his or her deck. This attack does 60 damage plus 20 more damage for each Energy card discarded in this way."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 60
              if(opp.deck){
                if(opp.deck.subList(0,1).filterByType(ENERGY)) damage 20
                opp.deck.subList(0,1).discard()
              }
              if(my.deck){
                if(my.deck.subList(0,1).filterByType(ENERGY)) damage 20
                my.deck.subList(0,1).discard()
              }
            }
          }

        };
      case DEOXYS_EX_93:
        return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys ex"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Fastwave", {
            text "50 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              new ResolvedDamage(hp(50), my.active, defending, Source.ATTACK, DamageManager.DamageFlag.NO_DEFENDING_EFFECT, DamageManager.DamageFlag.NO_RESISTANCE).run(bg)
            }
          }

        };
      case DUSCLOPS_EX_94:
        return evolution (this, from:"Duskull", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          resistance COLORLESS, MINUS30
          pokeBody "Dark Hole", {
            text "As long as Dusclops ex is on your Bench, don’t apply [D] Weakness for all of your Pokémon in play."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target.owner == self.owner && !self.active) {
                def list = h.object as List<Weakness>
                list.removeAll(list.findAll{it.type==D})
              }
            }

          }
          move "Shadow Beam", {
            text "Put 2 damage counters on the Defending Pokémon for each Energy attached to Dusclops ex."
            energyCost P
            attackRequirement {}
            onAttack {
              directDamage 20*self.cards.energyCount(C), defending
            }
          }

        };
      case MEDICHAM_EX_95:
        return evolution (this, from:"Meditite", hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Wise Aura", {
            text "As long as Medicham ex is your Active Pokémon, each Pokémon (excluding Pokémon-ex) (both yours and your opponent’s) can’t use any Poké-Powers."
            getterA (IS_ABILITY_BLOCKED) { Holder h->
              if (self.active  && !h.effect.target.EX && h.effect.ability instanceof PokePower) {
                h.object=true
              }
            }
          }
          move "Pure Power", {
            text "Put 3 damage counters on your opponent’s Pokémon in any way you like."
            energyCost C, C
            attackRequirement {}
            onAttack {
              3.times{ directDamage 10, opp.all.select("Put 1 damage counter to which pokémon?") }
            }
          }
          move "Sky Kick", {
            text "60+ damage. If the Defending Pokémon has [F] Resistance, this attack does 60 damage plus 40 more damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if(defending.resistances.find{it.type==F}) damage 40
            }
          }

        };
      case MILOTIC_EX_96:
        return evolution (this, from:"Feebas", hp:HP130, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          pokeBody "Mystic Scale", {
            text "As long as Milotic ex is in play, each player can’t play any Technical Machine cards from his or her hand. Discard all Technical Machine cards in play (both yours and your opponent’s)."
            delayedA {
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.is(TECHNICAL_MACHINE)){
                  wcu "Mystic Scale prevents playing this card"
                  prevent()
                }
              }
            }
            onActivate {
              opp.all.each{it.cards.filterByType(TECHNICAL_MACHINE).discard()}
              my.all.each{it.cards.filterByType(TECHNICAL_MACHINE).discard()}
            }
          }
          move "Gentle Wrap", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Reflect Energy", {
            text "70 damage. Move 1 basic Energy card attached to Milotic ex to 1 of your Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 70
              if(my.bench){
                moveEnergy(basic: true, self, my.bench.select("Which pokémon will receive the energy?"))
              }
            }
          }

        };
      case RAICHU_EX_97:
        return evolution (this, from:"Pikachu", hp:HP100, type:LIGHTNING, retreatCost:0) {
          weakness FIGHTING
          pokeBody "Rai-shield", {
            text "Damage done to any of your Raichu ex in play by attacks from your opponent’s Pokémon-ex is reduced by 30 (after applying Weakness and Resistance). You can’t use more than 1 Rai-shield Poké-Body each turn."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  def raiShieldsApplied = keyStore("Rai_Shield", it.to, null)
                  def conditions = [
                    (it.from.owner == self.owner.opposite),
                    (it.from.EX),
                    (it.to.owner == self.owner),
                    (it.to.name == "Raichu ex"),
                    (raiShieldsApplied == 0),
                    (it.dmg.value && it.notNoEffect)
                  ]
                  if(!conditions.any{it == false}){
                    bc "Rai-shield : -30"
                    it.dmg-=hp(30)
                    raiShieldsApplied += 1
                    keyStore("Rai_Shield", it.to, raiShieldsApplied)
                  }
                }
              }
              before BETWEEN_TURNS, {
                if(bg.em().retrieveObject("Rai_shield") != bg.turnCount){
                  bg.em().storeObject("Rai_shield",bg.turnCount)
                  my.all.each{
                    keyStore("Rai_Shield", it, 0)
                  }
                }
              }
            }
          }
          move "Power Short", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) If that Pokémon has Poké-Powers, this attack does 30 damage plus 20 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              def tar = opp.all.select("Select the targeted Pokémon")
              def hasPokePower = false
              for (Ability ability : tar.getAbilities().keySet()) {
                if (ability instanceof PokePower) hasPokePower = true;
              }
              if(hasPokePower) damage 20,tar

              damage 30,tar
            }
          }
          move "Pika Bolt", {
            text "70 damage."
            energyCost L, C, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }

        };
      case REGICE_EX_98:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness METAL
          move "Ice Beam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
          move "Iceburg Crush", {
            text "40 damage. If Regirock ex is in play, flip a coin. If heads, discard 1 Energy card attached to the Defending Pokémon."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 40
              if(my.all.findAll{it.name == "Regirock ex"}){
                afterDamage{
                  flip{discardDefendingEnergy()}
                }
              }
            }
          }

        };
      case REGIROCK_EX_99:
        return basic (this, hp:HP110, type:FIGHTING, retreatCost:3) {
          weakness WATER
          move "Mend", {
            text "Search your discard pile for a [F] Energy card and attach it to Regirock ex. If you do, remove 1 damage counter from Regirock ex."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(ENERGY).filterByEnergyType(F) : "There are no [F] Energy card in your discard"
            }
            onAttack {
              attachEnergyFrom(type : F, my.discard, self)
              heal 10, self
            }
          }
          move "Metal Crush", {
            text "40+ damage. If Registeel ex is in play, this attack does 40 damage plus 20 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 40
              if(my.all.findAll{it.name == "Registeel ex"}){
                damage 20
              }
            }
          }

        };
      case REGISTEEL_EX_100:
        return basic (this, hp:HP090, type:METAL, retreatCost:2) {
          weakness FIRE
          move "Block Signal", {
            text "10 damage. If Regice ex is in play, flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(my.all.findAll{it.name == "Regice ex"}){
                flipThenApplySC CONFUSED
              }
            }
          }
          move "Wide Laser", {
            text "Does 20 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              opp.all.each{damage 20, it}
            }
          }

        };
      case GRASS_ENERGY_101:
        return basicEnergy (this, GRASS);
      case FIRE_ENERGY_102:
        return basicEnergy (this, FIRE);
      case WATER_ENERGY_103:
        return basicEnergy (this, WATER);
      case LIGHTNING_ENERGY_104:
        return basicEnergy (this, LIGHTNING);
      case PSYCHIC_ENERGY_105:
        return basicEnergy (this, PSYCHIC);
      case FIGHTING_ENERGY_106:
        return basicEnergy (this, FIGHTING);
      case FARFETCH_D_107:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Spearhead", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Nosedive", {
            text "30 damage. Farfetch’d does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10,self
            }
          }

        };
      default:
        return null;
    }
  }

}
