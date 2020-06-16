package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen2.Aquapolis;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.Dragon;
import tcgwars.logic.impl.gen4.HeartgoldSoulsilver;
import tcgwars.logic.impl.gen5.BlackWhite;
import tcgwars.logic.impl.gen5.PlasmaStorm;
import tcgwars.logic.impl.gen6.KalosStarterSet;

import tcgwars.logic.effect.gm.PlayTrainer

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
 * @author luongthomasdev@gmail.com
 */
public enum UnseenForces implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ARIADOS_2 ("Ariados", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BELLOSSOM_3 ("Bellossom", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  FERALIGATR_4 ("Feraligatr", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  FLAREON_5 ("Flareon", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FORRETRESS_6 ("Forretress", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  HOUNDOOM_7 ("Houndoom", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  JOLTEON_8 ("Jolteon", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MEGANIUM_9 ("Meganium", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  OCTILLERY_10 ("Octillery", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POLIWRATH_11 ("Poliwrath", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  PORYGON2_12 ("Porygon2", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SLOWBRO_13 ("Slowbro", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SLOWKING_14 ("Slowking", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SUDOWOODO_15 ("Sudowoodo", 15, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  SUNFLORA_16 ("Sunflora", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TYPHLOSION_17 ("Typhlosion", 17, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  URSARING_18 ("Ursaring", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VAPOREON_19 ("Vaporeon", 19, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CHANSEY_20 ("Chansey", 20, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  CLEFFA_21 ("Cleffa", 21, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  ELECTABUZZ_22 ("Electabuzz", 22, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELEKID_23 ("Elekid", 23, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  HITMONCHAN_24 ("Hitmonchan", 24, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  HITMONLEE_25 ("Hitmonlee", 25, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  HITMONTOP_26 ("Hitmontop", 26, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  HO_OH_27 ("Ho-Oh", 27, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  JYNX_28 ("Jynx", 28, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  LUGIA_29 ("Lugia", 29, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MURKROW_30 ("Murkrow", 30, Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  SMOOCHUM_31 ("Smoochum", 31, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  STANTLER_32 ("Stantler", 32, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  TYROGUE_33 ("Tyrogue", 33, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  AIPOM_34 ("Aipom", 34, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  BAYLEEF_35 ("Bayleef", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CLEFABLE_36 ("Clefable", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CORSOLA_37 ("Corsola", 37, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  CROCONAW_38 ("Croconaw", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GRANBULL_39 ("Granbull", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LANTURN_40 ("Lanturn", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGCARGO_41 ("Magcargo", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MILTANK_42 ("Miltank", 42, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  NOCTOWL_43 ("Noctowl", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  QUAGSIRE_44 ("Quagsire", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  QUILAVA_45 ("Quilava", 45, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SCYTHER_46 ("Scyther", 46, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SHUCKLE_47 ("Shuckle", 47, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  SMEARGLE_48 ("Smeargle", 48, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  XATU_49 ("Xatu", 49, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  YANMA_50 ("Yanma", 50, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  CHIKORITA_51 ("Chikorita", 51, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHINCHOU_52 ("Chinchou", 52, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CLEFAIRY_53 ("Clefairy", 53, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CYNDAQUIL_54 ("Cyndaquil", 54, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  EEVEE_55 ("Eevee", 55, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FLAAFFY_56 ("Flaaffy", 56, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  GLIGAR_57 ("Gligar", 57, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLOOM_58 ("Gloom", 58, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HOOTHOOT_59 ("Hoothoot", 59, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HOUNDOUR_60 ("Houndour", 60, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  LARVITAR_61 ("Larvitar", 61, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAREEP_62 ("Mareep", 62, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  NATU_63 ("Natu", 63, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ODDISH_64 ("Oddish", 64, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ONIX_65 ("Onix", 65, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PINECO_66 ("Pineco", 66, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  POLIWAG_67 ("Poliwag", 67, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWHIRL_68 ("Poliwhirl", 68, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PORYGON_69 ("Porygon", 69, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PUPITAR_70 ("Pupitar", 70, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  REMORAID_71 ("Remoraid", 71, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SLOWPOKE_72 ("Slowpoke", 72, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SLUGMA_73 ("Slugma", 73, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SNUBBULL_74 ("Snubbull", 74, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SPINARAK_75 ("Spinarak", 75, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SUNKERN_76 ("Sunkern", 76, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TEDDIURSA_77 ("Teddiursa", 77, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TOTODILE_78 ("Totodile", 78, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WOOPER_79 ("Wooper", 79, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CURSE_POWDER_80 ("Curse Powder", 80, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ENERGY_RECYCLE_SYSTEM_81 ("Energy Recycle System", 81, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_REMOVAL_2_82 ("Energy Removal 2", 82, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_ROOT_83 ("Energy Root", 83, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ENERGY_SWITCH_84 ("Energy Switch", 84, Rarity.UNCOMMON, [TRAINER, ITEM]),
  FLUFFY_BERRY_85 ("Fluffy Berry", 85, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  MARY_S_REQUEST_86 ("Mary's Request", 86, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKE_BALL_87 ("Poké Ball", 87, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKEMON_REVERSAL_88 ("Pokémon Reversal", 88, Rarity.UNCOMMON, [TRAINER, ITEM]),
  PROFESSOR_ELM_S_TRAINING_METHOD_89 ("Professor Elm's Training Method", 89, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROTECTIVE_ORB_90 ("Protective Orb", 90, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SITRUS_BERRY_91 ("Sitrus Berry", 91, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SOLID_RAGE_92 ("Solid Rage", 92, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  WARP_POINT_93 ("Warp Point", 93, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_94 ("Energy Search", 94, Rarity.COMMON, [TRAINER, ITEM]),
  POTION_95 ("Potion", 95, Rarity.COMMON, [TRAINER, ITEM]),
  DARKNESS_ENERGY_96 ("Darkness Energy", 96, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_97 ("Metal Energy", 97, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  BOOST_ENERGY_98 ("Boost Energy", 98, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CYCLONE_ENERGY_99 ("Cyclone Energy", 99, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  WARP_ENERGY_100 ("Warp Energy", 100, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  BLISSEY_EX_101 ("Blissey ex", 101, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _COLORLESS_]),
  ESPEON_EX_102 ("Espeon ex", 102, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _PSYCHIC_]),
  FERALIGATR_EX_103 ("Feraligatr ex", 103, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  HO_OH_EX_104 ("Ho-Oh ex", 104, Rarity.ULTRARARE, [POKEMON, BASIC, _FIRE_]),
  LUGIA_EX_105 ("Lugia ex", 105, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _COLORLESS_]),
  MEGANIUM_EX_106 ("Meganium ex", 106, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]),
  POLITOED_EX_107 ("Politoed ex", 107, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  SCIZOR_EX_108 ("Scizor ex", 108, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _METAL_]),
  STEELIX_EX_109 ("Steelix ex", 109, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _METAL_]),
  TYPHLOSION_EX_110 ("Typhlosion ex", 110, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _FIRE_]),
  TYRANITAR_EX_111 ("Tyranitar ex", 111, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _DARKNESS_]),
  UMBREON_EX_112 ("Umbreon ex", 112, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _DARKNESS_]),
  ENTEI_STAR_113 ("Entei Star", 113, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  RAIKOU_STAR_114 ("Raikou Star", 114, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  SUICUNE_STAR_115 ("Suicune Star", 115, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  ROCKET_S_PERSIAN_EX_116 ("Rocket's Persian ex", 116, Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CELEBI_EX_117 ("Celebi ex", 117, Rarity.ULTRARARE, [POKEMON, BASIC, _GRASS_]),
  UNOWN_118 ("Unown", 118, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_119 ("Unown", 119, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_120 ("Unown", 120, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_121 ("Unown", 121, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_122 ("Unown", 122, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_123 ("Unown", 123, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_124 ("Unown", 124, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_125 ("Unown", 125, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_126 ("Unown", 126, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_127 ("Unown", 127, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_128 ("Unown", 128, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_129 ("Unown", 129, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_130 ("Unown", 130, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_131 ("Unown", 131, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_132 ("Unown", 132, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_133 ("Unown", 133, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_134 ("Unown", 134, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_135 ("Unown", 135, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_136 ("Unown", 136, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_137 ("Unown", 137, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_138 ("Unown", 138, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_139 ("Unown", 139, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_140 ("Unown", 140, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_141 ("Unown", 141, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_142 ("Unown", 142, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_143 ("Unown", 143, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_144 ("Unown", 144, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_145 ("Unown", 145, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]);


  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  UnseenForces(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.UNSEEN_FORCES;
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
      return evolution (this, from:"Flaaffy", hp:HP120, type:L, retreatCost:2) {
        weakness F
        resistance M, MINUS30
        pokePower "Energy Connect", {
          text "As often as you like during your turn (before your attack), you may move a basic Energy card attached to 1 of your Benched Pokémon to your Active Pokémon. This power can't be used if Ampharos is affected by a Special Condition."
          actionA {
            checkNoSPC()
            while(true){
              def pl = my.bench.findAll{ it.cards.filterByType(BASIC_ENERGY) }
              if(!pl) break;
              def src = pl.select("source for energy (cancel to stop)", false)
              if(!src) break;
              def card = src.cards.select("Card to move", cardTypeFilter(BASIC_ENERGY)).first()
              energySwitch(src, my.active, card)
            }
          }
        }
        move "Miraculous Thunder", {
          text "50 damage. You may discard all [L] Energy attached to Ampharos. If you do, the Defending Pokémon is now Burned and Confused."
          energyCost L, C, C
          onAttack {
            damage 50
            afterDamage {
              if (confirm("You may discard all [L] Energy from this Pokémon. If you do, the Defending Pokémon is now Burned and Confused.")) {
                discardAllSelfEnergy(L)
                apply BURNED
                apply CONFUSED
              }
            }
          }
        }
      };
      case ARIADOS_2:
      return evolution (this, from:"Spinarak", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Reactive Poison", {
          text "10+ damage. Does 10 damage plus 30 more damage for each Special Condition affecting the Defending Pokémon."
          energyCost C
          onAttack {
            damage 10+30*defending.specialConditions.size()
          }
        }
        move "Spider Trap", {
          text "The Defending Pokémon is now Asleep and Poisoned. Before applying this effect, you may switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. If you do, the new Defending Pokémon is now Asleep and Poisoned. Your opponent chooses the Defending Pokémon to switch."
          energyCost G
          onAttack {
            def pcs = defending
            if (opp.bench && confirm("Switch the defending Pokémon with 1 of your opponent's benched pokémon?")) {
              pcs = opp.bench.select("Select opponent's new Active Pokemon. New Active will be Asleep and Poisoned")
              sw opp.active, pcs
            }
            targeted(pcs) {
              apply POISONED, pcs
              apply ASLEEP, pcs
            }
          }
        }
      };
      case BELLOSSOM_3:
      return evolution (this, from:"Gloom", hp:HP090, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Green Dance", {
          text "Search your deck for up to 2 [G] Pokémon, show them to your opponent, and put them into your hand. Shuffle your deck afterward. If you put any [G] Pokémon into your hand, you may switch Bellossom with 1 of your Benched Pokémon."
          energyCost G
          attackRequirement {
            assert my.deck : "There are no more cards in your deck"
          }
          onAttack {
            def cards = deck.search(count: 2, pokemonTypeFilter(G))
            if (cards) {
              cards.moveTo(hand)
              shuffleDeck()

              switchYourActive(may: true)
            }
          }
        }
        move "Full Bloom", {
          text "50+ damage. If you have at least 3 Bellossom in play, this attack does 50 damage plus 50 more damage."
          energyCost C, C, C
          onAttack {
            damage 50

            if (my.all.findAll{it.name == "Bellossom"}.size() >= 3){
              damage 50
            }
          }
        }
      };
      case FERALIGATR_4:
      return evolution (this, from:"Croconaw", hp:HP120, type:W, retreatCost:2) {
        weakness L
        pokeBody "Intimidating Fang", {
          text "As long as Feraligatr is your Active Pokémon, any damage done to your Pokémon by an opponent's attack is reduced by 10 (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if(self.active && it.to.owner==self.owner && it.from.owner==self.owner.opposite && it.dmg.value && it.notNoEffect) {
                  bc "Intimidating Fang: -10"
                  it.dmg-=hp(10)
                }
              }
            }
          }
        }
        move "Pull Away", {
          text "30 damage. If your opponent has 5 or more cards in his or her hand, your opponent discards a number of cards until your opponent has 4 cards left in his or her hand."
          energyCost W, C
          onAttack {
            damage 30
            afterDamage{
              if (opp.hand.size() >= 5) {
                opp.hand.oppSelect(count: opp.hand.size() - 4, "Select cards to discard until you end up with 4 left").discard()
              }
            }
          }
        }
        move "Tonnage", {
          text "50+ damage. You may do 50 damage plus 30 more damage. If you do, Feraligatr does 30 damage to itself."
          energyCost W, C, C
          onAttack {
            damage 50

            if (confirm("Do 30 damage to Feraligatr to do 30 more damage?")) {
              damage 30
              damage 30, self
            }
          }
        }
      };
      case FLAREON_5:
      return evolution (this, from:"Eevee", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Fire Dance", {
          text "20 damage. Search your discard pile for a [R] Energy card and attach it to 1 of your Pokémon."
          energyCost R
          onAttack {
            damage 20
            afterDamage {
              attachEnergyFrom(type: R, my.discard, my.all)
            }
          }
        }
        move "Multi Burn", {
          text "40+ damage. If Flareon has 3 or more different types of basic Energy cards attached to it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Burned."
          energyCost C, C, C
          onAttack {
            damage 40

            int differentTypes = 0
            for (Type t1:Type.values()) {
              if (self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                differentTypes++
            }
            if (differentTypes >= 3) {
              damage 20
              apply BURNED
            }
          }
        }
      };
      case FORRETRESS_6:
      return evolution (this, from:"Pineco", hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Spiky Shell", {
          text "20 damage. Put 3 damage counters on the Defending Pokémon at the end of your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 20
            targeted(defending){
              delayed {
                before BETWEEN_TURNS, {
                  if (bg.currentTurn == self.owner.opposite) {
                    bc "Spiky Shell activates"
                    directDamage 30, defending
                  }
                }
                unregisterAfter 2
                after SWITCH, defending, {unregister()}
                after EVOLVE, defending, {unregister()}
              }
            }
          }
        }
        move "Pop", {
          text "100 damage. Put 7 damage counters on Forretress. Move all Energy cards attached to Forretress to your Benched Pokémon in any way you like. (Ignore this effect if you don't have any Benched Pokémon.)"
          energyCost M, C, C, C
          onAttack {
            damage 100

            if (my.bench) {
              self.cards.filterByType(ENERGY).each {
                energySwitch(self, my.bench.select("Move $it to?"), it)
              }
            }

            directDamage 70, self
          }
        }
      };
      case HOUNDOOM_7:
      return evolution (this, from:"Houndour", hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokeBody "Lonesome", {
          text "As long as you have less Pokémon in play than your opponent, your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand."
          delayedA {
            before PLAY_TRAINER, {
              // TODO: Fix bodies like this one to cover Power Spray in the future.
              //       "bg.currentTurn == self.owner.opposite" won't work for that.
              if (self.owner.pbg.all.size() < self.owner.opposite.pbg.all.size() && !ef.cardToPlay.cardTypes.is(SUPPORTER) && bg.currentTurn == self.owner.opposite) {
                wcu "Lonesome prevents playing this card"
                prevent()
              }
            }
          }
        }
        move "Tight Jaw", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Flamethrower", {
          text "70 damage. Discard a [R] Energy attached to Houndoom."
          energyCost R, R, C
          onAttack {
            damage 70
            afterDamage {
              discardSelfEnergy R
            }
          }
        }
      };
      case JOLTEON_8:
      return evolution (this, from:"Eevee", hp:HP070, type:L, retreatCost:0) {
        weakness F
        resistance M, MINUS30
        move "Attract Current", {
          text "20 damage. Flip a coin. If heads, search your deck for a [L] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
          energyCost L
          onAttack {
            damage 20

            flip {
              deck.search (basicEnergyFilter(L)).each{
                attachEnergy(my.all.select("Attach the [L] Energy to?"), it)
              }
              shuffleDeck()
            }
          }
        }
        move "Multi Pulse", {
          text "40+ damage. If Jolteon has 3 or more different types of basic Energy cards attached to it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Confused."
          energyCost C, C, C
          onAttack {
            damage 40

            int differentTypes = 0
            for (Type t1:Type.values()) {
              if (self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                differentTypes++
            }
            if (differentTypes >= 3) {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case MEGANIUM_9:
      return evolution (this, from:"Bayleef", hp:HP100, type:G, retreatCost:3) {
        weakness R
        resistance W, MINUS30
        pokeBody "Healing Aroma", {
          text "As long as Meganium is your Active Pokémon, remove 1 damage counter from each Pokémon (excluding Pokémon-ex) (both yours and your opponent's) between turns."
          delayedA {
            before BEGIN_TURN, {
              if (self.active) {
                [self.owner, self.owner.opposite].each{
                  player -> player.pbg.all.each {
                    if (!it.EX && it.numberOfDamageCounters) {
                      heal 10, it
                    }
                  }
                }
              }
            }
          }
        }
        move "Bouncy Move", {
          text "50+ damage. You may put up to 5 damage counters on Meganium. If you do, this attack does 50 damage plus 10 more damage for each damage counter you put on Meganium in this way."
          energyCost G, G, C
          onAttack {
            damage 50

            if (confirm("Would you like to add damage counters to increase the damage dealt to the defending Pokemon?"))
              {
                def num = choose([1,2,3,4,5])
                damage 10 * num
                afterDamage{
                  directDamage 10 * num, self
                }
              }
          }
        }
      };
      case OCTILLERY_10:
      return evolution (this, from:"Remoraid", hp:HP080, type:W, retreatCost:1) {
        weakness L
        pokeBody "Super Suction Cups", {
          text "As long as Octillery is your Active Pokémon, your opponent's Pokémon can't retreat."
          delayedA {
            before RETREAT, {
              if (self.active && ef.retreater.owner==self.owner.opposite) {
                wcu "Super Suction Cups prevents retreating"
                prevent()
              }
            }
          }
        }
        move "Standing By", {
          text "Discard an Energy card attached to Octillery. During your next turn, Octillery's Pulse Blast attack's base damage is 120."
          energyCost C
          onAttack {
            discardSelfEnergy C
            increasedBaseDamageNextTurn("Pulse Blast", hp(90))
          }
        }
        move "Pulse Blast", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
      };
      case POLIWRATH_11:
      return evolution (this, from:"Poliwhirl", hp:HP120, type:F, retreatCost:2) {
        weakness P
        pokeBody "Spiral Swirl", {
          text "If Poliwrath is your Active Pokémon and is Knocked Out by damage from an opponent's attack, the Attacking Pokémon is now Confused."
          delayedA {
            before (KNOCKOUT,self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.opposite.pbg.active != null && self.owner.opposite.pbg.active.inPlay) {
                bc "Spiral Swirl activates"
                apply CONFUSED, self.owner.opposite.pbg.active, SRC_ABILITY
              }
            }
          }
        }
        move "Beatdown", {
          text "40+ damage. If the Defending Pokémon is a [D] Pokémon or has Dark in its name, this attack does 40 damage plus 30 more damage."
          energyCost F, C
          onAttack {
            damage 40
            if (defending.types.contains(D) || defending.name.contains("Dark")) {
              damage 30
            }
          }
        }
        move "Hyper Splash", {
          text "60+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 60 damage plus 30 more damage."
          energyCost W, C, C
          onAttack {
            damage 60
            if (defending.evolution && defending.topPokemonCard.cardTypes.is(STAGE2)) {
              damage 30
            }
          }
        }
      };
      case PORYGON2_12:
      return evolution (this, from:"Porygon", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "3-D Reset", {
          text "As often as you like during your turn (before your attack), return a Pokémon Tool card attached to 1 of your Pokémon to your hand. This power can't be used if Porygon2 is affected by a Special Condition."
          actionA {
            checkNoSPC()
            def tar = my.all.findAll { it.cards.filterByType(POKEMON_TOOL) }
            assert tar: "None of your Pokemon have a Pokémon Tool card attached to them"
            powerUsed()
            def pcs = tar.select()
            def tools = pcs.cards.filterByType(POKEMON_TOOL)
            if (tools.size() > 1)
              tools = tools.select(count: 1, "Which tool attached to $pcs will return to your hand?")
            tools.moveTo(my.hand)
          }
        }
        move "Data Retrieval", {
          text "If you have less than 8 cards in your hand, draw cards until you have 8 cards in your hand."
          energyCost C
          onAttack {
            if (my.hand.size() < 8){
              draw 8 - my.hand.size()
            }
          }
        }
        move "Scramble Trip", {
          text "40+ damage. If Porygon2 has a Scramble Energy card attached to it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Confused."
          energyCost C, C, C
          onAttack {
            damage 40
            if (self.cards.findAll { it.name=="Scramble Energy" }) {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case SLOWBRO_13:
      return evolution (this, from:"Slowpoke", hp:HP080, type:W, retreatCost:2) {
        weakness G
        pokeBody "Dual Armor", {
          text "As long as Slowbro has any [P] Energy attached to it, Slowbro is both Water and Psychic type."
          getterA GET_POKEMON_TYPE, self, { h->
            if (self.cards.energyCount(P)) h.object.add(P)
          }
        }
        move "Parallel Gain", {
          text "20 damage. Remove 1 damage counter from each of your Pokémon (including Slowbro)."
          energyCost C
          onAttack {
            damage 20
            afterDamage {
              my.all.each { heal 10, it }
            }
          }
        }
        move "Rolling Tackle", {
          text "50 damage."
          energyCost W, C, C
          onAttack {
            damage 50
          }
        }
      };
      case SLOWKING_14:
      return evolution (this, from:"Slowpoke", hp:HP070, type:P, retreatCost:1) {
        weakness G
        pokePower "Item Search", {
          text "Once during your turn (before your attack), you may search your deck for a Pokémon Tool card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Slowking is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.deck : "There are no more cards in your deck"
            powerUsed()
            my.deck.search("Select one Pokemon Tool Card", {it.cardTypes.is(POKEMON_TOOL)} ).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Aftermath", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Pokémon Tool card in your discard pile. You can't add more than 60 damage in this way."
          energyCost P, C
          onAttack {
            def extraDamage = Math.min(60, 10*my.discard.filterByType(POKEMON_TOOL).size())
            damage 20 + extraDamage
          }
        }
      };
      case SUDOWOODO_15:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness W
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Sudowoodo doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Sudowoodo performs that attack."
          energyCost C
          attackRequirement {
            assert defending.topPokemonCard.moves : "No moves to perform"
          }
          onAttack {
            def move = choose(defending.topPokemonCard.moves+["End Turn (Skip)"], "Choose 1 of the Defending Pokémon's attacks. (Do not select a move if you don't have necessary energy or it will fail) ")
            if (move instanceof String) return
            def bef = blockingEffect(BETWEEN_TURNS)
            attack (move as Move)
            bef.unregisterItself(bg().em())
          }
        }
        move "Karate Chop", {
          text "50- damage. Does 50 damage minus 10 damage for each damage counter on Sudowoodo."
          energyCost F, C, C
          onAttack {
            damage 50 - 10*self.numberOfDamageCounters
          }
        }
      };
      case SUNFLORA_16:
      return evolution (this, from:"Sunkern", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Dazzle Dance", {
          text "Each Defending Pokémon is now Confused."
          energyCost G
          onAttack {
            apply CONFUSED
            apply CONFUSED, self
          }
        }
        move "Green Blast", {
          text "20+ damage. Does 20 damage plus 10 more damage for each [G] Energy attached to all of your Pokémon."
          energyCost C, C
          onAttack {
            damage 20
            my.all.each {
              damage 10*it.cards.energyCount(G)
            }
          }
        }
      };
      case TYPHLOSION_17:
      return evolution (this, from:"Quilava", hp:HP110, type:R, retreatCost:1) {
        weakness W
        pokeBody "Burning Aura", {
          text "As long as Typhlosion is your Active Pokémon, put 1 damage counter on each Active Pokémon (both yours and your opponent's) between turns."
          delayedA {
            before BEGIN_TURN, {
              all.each {
                if (self.active && it.active) {
                  bc "Burning Aura activates"
                  directDamage 10, it, SRC_ABILITY
                }
              }
            }
          }
        }
        move "Flickering Flames", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost R
          onAttack {
            damage 20
            applyAfterDamage ASLEEP
          }
        }
        move "Rage", {
          text "50+ damage. Does 50 damage plus 10 more damage for each damage counter on Typhlosion."
          energyCost R, C, C
          onAttack {
            damage 50+10*self.numberOfDamageCounters
          }
        }
      };
      case URSARING_18:
      return evolution (this, from:"Teddiursa", hp:HP080, type:C, retreatCost:2) {
        weakness F
        pokeBody "Intimidating Ring", {
          text "As long as Ursaring is your Active Pokémon, your opponent's Basic Pokémon can't attack or use any Poké-Powers."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (self.active && ef.attacker.owner != self.owner && !ef.attacker.evolution) {
                wcu "Intimidating Ring prevents attack"
                prevent()
              }
            }
          }
          getterA (IS_ABILITY_BLOCKED) { Holder h->
            if (self.active && h.effect.target.owner != self.owner && !h.effect.target.evolution && h.effect.ability instanceof PokePower) {
              h.object=true
            }
          }
        }
        move "Drag Off", {
          text "20 damage. Before doing damage, you may switch 1 of your opponent's Benched Pokémon with the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost C, C
          onAttack {
            def target = defending
            if (opp.bench && confirm("Before doing damage, do you want to switch 1 of your opponent's Benched Pokémon with the Defending Pokémon?")) {
              target = opp.bench.select("Select the new active")
              sw defending, target
            }
            damage 20, target
          }
        }
        move "Rock Smash", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
          energyCost C, C, C
          onAttack {
            damage 40
            flip { damage 20 }
          }
        }
      };
      case VAPOREON_19:
      return evolution (this, from:"Eevee", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Aqua Supply", {
          text "20 damage. You may attach a basic Energy card from your hand to 1 of your Pokémon."
          energyCost W
          onAttack {
            damage 20
            afterDamage {
              attachEnergyFrom(basic: true, my.hand, my.all)
            }
          }
        }
        move "Multi Bubble", {
          text "40+ damage. If Vaporeon has 3 or more different types of basic Energy cards attached to it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Asleep."
          energyCost C, C, C
          onAttack {
            damage 40

            int differentTypes = 0
            for (Type t1:Type.values()) {
              if (self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                differentTypes++
            }
            if (differentTypes >= 3) {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
        }
      };
      case CHANSEY_20:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness F
        move "Hyper Healing", {
          text "Remove 1 damage counter and all Special Conditions from each of your Active Pokémon."
          energyCost C
          onAttack {
            heal 10, self
            afterDamage {
              if (self.specialConditions) {
                clearSpecialCondition(self)
              }
            }
          }
        }
        move "Double Tackle", {
          text "Does 20 damage to each Defending Pokémon."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case CLEFFA_21:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Clefairy from your hand onto Cleffa (this counts as evolving Cleffa) and remove all damage counters from Cleffa."
          actionA {
            checkCanBabyEvolve("Clefairy", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Clefairy", self)
          }
        }
        move "Eeeeeeek", {
          text "Shuffle your hand into your deck, then draw 6 cards."
          energyCost C
          onAttack {
            shuffleDeck(hand)
            hand.clear()
            draw 6
          }
        }
      };
      case ELECTABUZZ_22:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        pokeBody "Stages of Evolution", {
          text "As long as Electabuzz is an Evolved Pokémon, damage done by attacks from your opponent's Pokémon that has any Special Energy cards attached to it is reduced by 40 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (self.evolution) {
                bg.dm().each{
                  if(it.to == self && it.from.cards.filterByType(SPECIAL_ENERGY) && it.dmg.value && it.notNoEffect) {
                    bc "Stages of Evolution -20"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
        }
        move "Double Shock", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads. If either of the coins is heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            def heads = 0
            flip 2, {
              damage 10
              heads += 1
            }
            if (heads) applyAfterDamage PARALYZED
          }
        }
        move "Luster Blast", {
          text "70 damage. Discard 3 Energy attached to Electabuzz."
          energyCost L, C, C, C
          onAttack {
            damage 70
            discardSelfEnergy C,C,C
          }
        }
      };
      case ELEKID_23:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Electabuzz from your hand onto Elekid (this counts as evolving Elekid) and remove all damage counters from Elekid."
          actionA {
            checkCanBabyEvolve("Electabuzz", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Electabuzz", self)
          }
        }
        move "Magnetic Trip", {
          text "10 damage. If Low Pressure System is in play, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            damage 10
            if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Low Pressure System") {
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case HITMONCHAN_24:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness P
        pokeBody "Stages of Evolution", {
          text "As long as Hitmonchan is an Evolved Pokémon, Hitmonchan gets +30 HP."
          getterA (GET_FULL_HP) { h->
            def pcs = h.effect.target
            if (pcs == self && self.evolution) {
              h.object += hp(30)
            }
          }
        }
        move "Heavy Punch", {
          text "10x damage. Does 10 damage times the number of your opponent's Benched Pokémon."
          energyCost F, C
          attackRequirement{
            assert opp.bench : "Your opponent has no Benched Pokémon"
          }
          onAttack {
            damage 10 * opp.bench.size()
          }
        }
        move "Speedy Uppercut", {
          text "50 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost C, C, C
          onAttack {
            swiftDamage 50, defending
          }
        }
      };
      case HITMONLEE_25:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness P
        pokeBody "Stages of Evolution", {
          text "As long as Hitmonlee is an Evolved Pokémon, Hitmonlee's attacks do 20 more damage to your opponent's Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if(ef.attacker == self && self.evolution) {
                bg.dm().each {
                  if (it.to.owner != self.owner && it.dmg.value && it.notNoEffect) {
                    bc "Stages of Evolution +20"
                    it.dmg += hp(20)
                  }
                }
              }
            }
          }
        }
        move "Stretch Kick", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement{
            assert opp.bench : "Your opponent has no Benched Pokémon"
          }
          onAttack {
            damage 10, opp.bench.select("Deal 10 damage to which Pokémon?")
          }
        }
        move "Mega Kick", {
          text "40 damage."
          energyCost F, C, C
          onAttack {
            damage 40
          }
        }
      };
      case HITMONTOP_26:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness P
        pokeBody "Stages of Evolution", {
          text "As long as Hitmontop is an Evolved Pokémon, is your Active Pokémon, and is damaged by an opponent's attack (even if Hitmontop is Knocked Out), put 2 damage counters on the Attacking Pokémon."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if(bg.currentTurn == self.owner.opposite && self.evolution && self.active && bg.dm().find({it.to==self && it.dmg.value})){
                bc "Stages of Evolution Activates"
                directDamage 20, (ef.attacker as PokemonCardSet)
              }
            }
          }
        }
        move "Upward Kick", {
          text "20+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 20 damage plus 30 more damage."
          energyCost F, C
          onAttack {
            damage 20
            if (opp.active.numberOfDamageCounters >= 2) damage 30
          }
        }
        move "Spiral Kick", {
          text "50 damage."
          energyCost C, C, C, C
          onAttack {
            damage 50
          }
        }
      };
      case HO_OH_27:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Gust", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Sacred Fire", {
          text "Flip a coin. If heads, choose 1 of your opponent's Pokémon. This attack does 60 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost R, R, C, C
          onAttack {
            flip {
              def tar = opp.all.select("Select the Pokémon to target.")
              noWrDamage 60, tar
            }
          }
        }
      };
      case JYNX_28:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness M
        pokeBody "Stages of Evolution", {
          text "As long as Jynx is an Evolved Pokémon, prevent all effects of opponent's attacks, except damage, done to Jynx, and Jynx has no Weakness."
          delayedA {
            before null, self, Source.ATTACK, {
              if (bg.currentTurn==self.owner.opposite && self.evolution && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)) {
                bc "Stages of Evolution prevents effect"
                prevent()
              }
            }
            getterA (GET_WEAKNESSES) { h->
              if (h.effect.target == self && self.evolution) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
        }
        move "Freeze Light", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Burned."
          energyCost C
          onAttack {
            flip 1, {apply PARALYZED}, {apply BURNED}
          }
        }
        move "Pure Power", {
          text "Put 4 damage counters on your opponent's Pokémon in any way you like."
          energyCost W, P, C
          onAttack {
            (1..4).each {
              directDamage 10, opp.all.select("Put 1 damage counter to which Pokémon?")
            }
          }
        }
      };
      case LUGIA_29:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness P
        move "Aeroblast", {
          text "20+ damage. Flip 2 coins. This attack does 20 damage plus 20 more damage for each heads."
          energyCost C, C, C
          onAttack {
            damage 20
            flip 2, { damage 20 }
          }
        }
      };
      case MURKROW_30:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Night Song", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement{
            assert opp.bench : "Your opponent has no Benched Pokémon"
          }
          onAttack {
            def pcs = opp.bench.oppSelect()
            sw defending, pcs
            apply ASLEEP, pcs
          }
        }
        move "Plunder", {
          text "20 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
          energyCost C, C
          onAttack {
            def tar = defending.cards.filterByType(TRAINER)
            if (tar){ tar.discard() }
            damage 20
          }
        }
      };
      case SMOOCHUM_31:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Jynx from your hand onto Smoochum (this counts as evolving Smoochum) and remove all damage counters from Smoochum."
          actionA {
            checkCanBabyEvolve("Jynx", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Jynx", self)
          }
        }
        move "Blown Kiss", {
          text "Put 1 damage counter on 1 of your opponent's Pokémon."
          energyCost C
          onAttack {
            directDamage 10, opp.all.select("Select a Pokemon to put a damage counter on")
          }
        }
      };
      case STANTLER_32:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Screechy Voice", {
          text "10 damage. If the Defending Pokémon is an Evolved Pokémon, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            damage 10
            if (defending.evolution) {
              apply CONFUSED
            }
          }
        }
        move "Push Away", {
          text "20 damage. Look at your opponent's hand, choose a Trainer card you find there, and discard it."
          energyCost C, C
          onAttack {
            damage 20
            afterDamage {
              if (opp.hand) {
                opp.hand.showToMe("Opponent's hand")
                if (opp.hand.filterByType(TRAINER)) {
                  opp.hand.select(count: 1, "Select a Trainer card to discard.", cardTypeFilter(TRAINER)).discard()
                }
              }
            }
          }
        }
      };
      case TYROGUE_33:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness P
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Hitmonlee, Hitmonchan, or Hitmontop from your hand onto Tyrogue (this counts as evolving Tyrogue) and remove all damage counters from Tyrogue."
          actionA {
            checkCanBabyEvolve(["Hitmonlee", "Hitmonchan", "Hitmontop"], self)
            checkLastTurn()
            powerUsed()
            babyEvolution(["Hitmonlee", "Hitmonchan", "Hitmontop"], self)
          }
        }
        move "Desperate Punch", {
          text "10x damage. Does 10 damage times the number of Pokémon in play your opponent has more than you."
          energyCost C
          onAttack {
            def amount = opp.all.size() - my.all.size()
            if (amount > 0) {
              damage 10*amount
            }
          }
        }
      };
      case AIPOM_34:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokePower "Snappy Move", {
          text "Once during your turn (before your attack), if Aipom is on your Bench, you may draw a card. Then, discard all cards attached to Aipom and put Aipom on the bottom of your deck. You can't use more than 1 Snappy Move Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Snappy_Move") != bg.turnCount : "You can't use more than 1 Snappy Move Poké-Power each turn."
            assert self.benched : "This Pokemon is not on your Bench"
            assert my.deck : "You do not have any cards left in your deck"
            bg.em().storeObject("Snappy_Move", bg.turnCount)
            powerUsed()

            draw 1
            self.cards.getExcludedList(self.topPokemonCard).discard()
            moveCard(self.topPokemonCard, my.deck)
            removePCS(self)
          }
        }
        move "Snap Tail", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          onAttack {
            damage 10, opp.all.select()
          }
        }
      };
      case BAYLEEF_35:
      return evolution (this, from:"Chikorita", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Soothing Scent", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            applyAfterDamage ASLEEP
          }
        }
        move "Razor Leaf", {
          text "50 damage."
          energyCost G, G, C
          onAttack {
            damage 50
          }
        }
      };
      case CLEFABLE_36:
      return evolution (this, from:"Clefairy", hp:HP080, type:C, retreatCost:1) {
        weakness F
        move "Shining Fingers", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            applyAfterDamage ASLEEP
          }
        }
        move "Extra Comet Punch", {
          text "30+ damage. During your next turn, Extra Comet Punch does 30 damage plus 30 more damage."
          energyCost C, C
          onAttack {
            damage 30
            increasedBaseDamageNextTurn("Extra Comet Punch", hp(30))
          }
        }
      };
      case CORSOLA_37:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness G
        move "Cry for Help", {
          text "Search your deck for a Water or [F] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            my.deck.search (max: 1, "Search for a [W] or [F] Pokemon (excluding Pokemon-ex) to put into your hand.", {
              (it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(W) && it.asPokemonCard().types.contains(F) && !it.asPokemonCard().cardTypes.is(EX))
            }).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Double Attack", {
          text "Choose 2 of your opponent's Benched Pokémon. This attack does 10 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {
            assert opp.bench: "Opponent does not have any Benched Pokemon"
          }
          onAttack {
            multiSelect(opp.bench, 2).each {
              targeted(it){ damage 10, it }
            }
          }
        }
      };
      case CROCONAW_38:
      return evolution (this, from:"Totodile", hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Bite", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Aqua Sonic", {
          text "50 damage. This attack's damage isn't affected by Resistance."
          energyCost W, W, C
          onAttack {
            damage 50
            dontApplyResistance()
          }
        }
      };
      case GRANBULL_39:
      return evolution (this, from:"Snubbull", hp:HP070, type:C, retreatCost:2) {
        weakness F
        pokeBody "Intimidating Fang", {
          text "As long as Granbull is your Active Pokémon, any damage done to your Pokémon by an opponent's attack is reduced by 10 (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (self.active && it.to.owner == self.owner && it.dmg.value && it.notNoEffect) {
                  bc "Intimidating Fang -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Crushing Blow", {
          text "30 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            flip { discardDefendingEnergy() }
          }
        }
        move "Double Lariat", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost C, C, C, C
          onAttack {
            flip 2, { damage 50 }
          }
        }
      };
      case LANTURN_40:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Energy Stream", {
          text "20 damage. Search your discard pile for a basic Energy card and attach it to Lanturn."
          energyCost L
          onAttack {
            damage 20

            def tar = my.discard.filterByType(BASIC_ENERGY)
            if (tar) {
              attachEnergyFrom(basic: true, my.discard, self)
            }
          }
        }
        move "Take Down", {
          text "50 damage. Lanturn does 10 damage to itself."
          energyCost C, C, C
          onAttack {
            damage 50
            damage 10, self
          }
        }
      };
      case MAGCARGO_41:
      return evolution (this, from:"Slugma", hp:HP080, type:R, retreatCost:2) {
        weakness W
        pokeBody "Dual Armor", {
          text "As long as Magcargo has any [F] Energy attached to it, Magcargo is both Fire and Fighting type."
          getterA GET_POKEMON_TYPE, self, { h->
            if (self.cards.energyCount(F)) h.object.add(F)
          }
        }
        move "Smokescreen", {
          text "30 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R, C
          onAttack {
            damage 30
            sandAttack(thisMove)
          }
        }
        move "Extra Flame", {
          text "40+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 40 damage plus 30 more damage."
          energyCost R, C, C
          onAttack {
            damage 40
            if (defending.EX) {
              damage 30
            }
          }
        }
      };
      case MILTANK_42:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokeBody "Thick Fat", {
          text "Any damage done to Miltank by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  if (it.from.types.contains(R) || it.from.types.contains(W)) {
                    bc "Thick Fat -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
        }
        move "Healing Milk", {
          text "Flip 2 coins. For each heads, remove 2 damage counters from 1 of your Pokémon."
          energyCost C
          attackRequirement {
            assert my.all.findAll { it.numberOfDamageCounters }: "No damaged Pokemon"
          }
          onAttack {
            flip 2, {
              if (my.all.findAll { it.numberOfDamageCounters }) {
                def pcs = my.all.findAll { it.numberOfDamageCounters }.select()
                heal 20, pcs
              }
            }
          }
        }
        move "Body Slam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case NOCTOWL_43:
      return evolution (this, from:"Hoothoot", hp:HP070, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Spearhead", {
          text "Draw 3 cards."
          energyCost C
          onAttack {
            draw 3
          }
        }
        move "Surprise", {
          text "30 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost C, C
          onAttack {
            damage 30
            afterDamage { astonish() }
          }
        }
      };
      case QUAGSIRE_44:
      return evolution (this, from:"Wooper", hp:HP080, type:F, retreatCost:2) {
        weakness G
        pokeBody "Dense", {
          text "Any damage done to Quagsire by attacks from your opponent's Evolved Pokémon is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.from.evolution && it.dmg.value && it.notNoEffect) {
                  bc "Dense -20"
                  it.dmg -= hp(20)
                }
              }
            }
          }
        }
        move "Mud Shot", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Rock Hurl", {
          text "50 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C, C
          onAttack {
            damage 50
            dontApplyResistance()
          }
        }
      };
      case QUILAVA_45:
      return evolution (this, from:"Cyndaquil", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Smokescreen", {
          text "20 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost R, C
          onAttack {
            damage 20
            sandAttack(thisMove)
          }
        }
        move "Tackle", {
          text "40 damage."
          energyCost C, C, C
          onAttack {
            damage 40
          }
        }
      };
      case SCYTHER_46:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Twin Play", {
          text "Search your deck for up to 2 in any combination of Scyther and Scyther ex and put them onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert my.bench.notFull : "Bench is full"
          }
          onAttack {
            def maxSpace = Math.min(my.bench.freeBenchCount, 2)
            my.deck.search(max:maxSpace, "Select $maxSpace Scyther or Scyther ex to put onto your Bench", { it.name == "Scyther" || it.name == "Scyther ex" }).each {
              my.deck.remove(it);
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Scyther during your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 20
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case SHUCKLE_47:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Extra Tight", {
          text "Prevent all damage done to Shuckle by attacks from your opponent's Pokémon-ex."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.from.topPokemonCard.cardTypes.is(EX) && it.dmg.value && it.notNoEffect) {
                  bc "Shell Barricade prevents all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Toxic", {
          text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, C
          onAttack {
            apply POISONED
            extraPoison 1
          }
        }
      };
      case SMEARGLE_48:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokePower "Makeover", {
          text "Once during your turn (before your attack), you may discard a basic Energy card attached to 1 of your Pokémon (excluding Pokémon-ex). If you do, search your discard pile for a basic Energy card (excluding the one you discarded) and attach it to that Pokémon. This power can't be used if Smeargle is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()

            def validTargets = my.all.findAll{
              it.cards.filterByType(BASIC_ENERGY) && !it.EX
            }
            assert validTargets : "Your Non-ex Pokemon do not have Basic Energy cards."
            assert my.discard.filterByType(BASIC_ENERGY) : "No Basic Energies in you discard pile."

            powerUsed()

            def pcs = validTargets.select("Select a source to remove a Basic Energy card from.")

            def tar = pcs.cards.filterByType(BASIC_ENERGY).select("Choose the Basic Energy card to Discard.").discard()

            attachEnergyFrom(basic: true, my.discard.getExcludedList(tar), pcs)
          }
        }
        move "Split Spiral Punch", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            damage 10
            flip { applyAfterDamage CONFUSED }
          }
        }
      };
      case XATU_49:
      return evolution (this, from:"Natu", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Telekinesis", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost P, C
          onAttack {
            noWrDamage 30, opp.all.select("Deal 30 damage to which Pokémon?")
          }
        }
        move "Psyshock", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C, C
          onAttack {
            damage 40
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case YANMA_50:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Grand Loop", {
          text "Draw 2 cards. You may switch Yanma with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            draw 2
            switchYourActive(may: true)
          }
        }
        move "Spinning Tail", {
          text "Flip a coin. If heads, this attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          onAttack {
            flip {
              opp.all.each { damage 20, it }
            }
          }
        }
      };
      case CHIKORITA_51:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Headbutt", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Razor Leaf", {
          text "20 damage."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case CHINCHOU_52:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Razor Fin", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case CLEFAIRY_53:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Pound", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Lullaby", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          onAttack {
            damage 10
            applyAfterDamage ASLEEP
          }
        }
      };
      case CYNDAQUIL_54:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Fireworks", {
          text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Cyndaquil."
          energyCost R, C
          onAttack {
            damage 30
            afterDamage {
              flip 1, {}, {discardSelfEnergy(R)}
            }
          }
        }
      };
      case EEVEE_55:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        pokePower "Energy Evolution", {
          text "Whenever you attach an Energy card from your hand to Eevee, you may search your deck for a card that evolves from Eevee that is the same type as the Energy card you attached to Eevee. Put that card onto Eevee. (This counts as evolving Eevee.) Shuffle your deck afterward. This power can't be used when you attach an Energy card to Eevee as part of an attack's effect."
          delayedA {
            after ATTACH_ENERGY, self, {
              if (ef.reason==PLAY_FROM_HAND && self.owner.pbg.deck && ef.card.basicType.minus[[C, M, F] as Set]) {
                if (confirm("Use Energy Evolution?")) {
                  powerUsed()
                  def sel = self.owner.pbg.deck.select(min:0, "Energy Evolution ${ef.card.basicType}",
                    { it.cardTypes.is(EVOLUTION) && it.types.contains(ef.card.basicType) && it.predecessor==self.name }, self.owner)

                  if (sel) {
                    evolve(self, sel.first(), OTHER)
                  }
                  shuffleDeck(null, self.owner.toTargetPlayer())
                }
              }
            }
          }
        }
        move "Tail Whap", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case FLAAFFY_56:
      return evolution (this, from:"Mareep", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Thunder Wave", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              flip { applyAfterDamage PARALYZED }
            }
          }
        }
        move "Thunder", {
          text "50 damage. Flaaffy does 10 damage to itself."
          energyCost L, C, C
          onAttack {
            damage 50
            damage 10, self
          }
        }
      };
      case GLIGAR_57:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness L
        pokeBody "Free Flight", {
          text "If Gligar has no Energy attached to it, Gligar's Retreat Cost is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) { h->
            if (self.cards.energyCount(C) == 0) {
              h.object = 0
            }
          }
        }
        move "Toxic Grip", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost F
          onAttack {
            damage 10
            applyAfterDamage POISONED
          }
        }
      };
      case GLOOM_58:
      return evolution (this, from:"Oddish", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C
          onAttack {
            damage 20
            apply POISONED
          }
        }
      };
      case HOOTHOOT_59:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Confuse Ray", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {
            flip { apply CONFUSED }
          }
        }
        move "Peck", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case HOUNDOUR_60:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Smog", {
          text "The Defending Pokémon is now Poisoned."
          energyCost R
          onAttack {
            apply POISONED
          }
        }
      };
      case LARVITAR_61:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Retaliate", {
          text "10x damage. Does 10 damage times the number of damage counters on Larvitar."
          energyCost F
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case MAREEP_62:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Tackle", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case NATU_63:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Telekinesis", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost C
          onAttack {
            noWrDamage 10, opp.all.select("Do 10 damage to which pokémon?")
          }
        }
      };
      case ODDISH_64:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Stun Spore", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          onAttack {
            damage 10
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case ONIX_65:
      return basic (this, hp:HP080, type:F, retreatCost:3) {
        weakness W
        move "Dig Deep", {
          text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.hasType(ENERGY) : "There are no Energy cards in your discard pile"
          }
          onAttack {
            my.discard.filterByType(ENERGY).select().moveTo(my.hand)
          }
        }
        move "Mud Slap", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case PINECO_66:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Ram", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case POLIWAG_67:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Wave Splash", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }
      };
      case POLIWHIRL_68:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Energy Ball", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to Poliwhirl but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost C, C
          onAttack {
            damage 30
            extraEnergyDamage(2, hp(10), C, thisMove)
          }
        }
      };
      case PORYGON_69:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "3-D Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          onAttack {
            flip 3, {damage 10}
          }
        }
      };
      case PUPITAR_70:
      return evolution (this, from:"Larvitar", hp:HP070, type:F, retreatCost:0) {
        weakness G
        move "Slash", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Rock Throw", {
          text "40 damage."
          energyCost F, F, C
          onAttack {
            damage 40
          }
        }
      };
      case REMORAID_71:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic: true, 1, delegate)
        }
        move "Splash", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case SLOWPOKE_72:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Fishing Tail", {
          text "Search your discard pile for a Basic Pokémon, Evolution card, or basic Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {
            assert (
              my.discard.filterByType(POKEMON) || my.discard.filterByType(BASIC_ENERGY)
            ): "You have neither Pokémon nor Basic Energy cards in your discard pile"
          }
          onAttack {
            my.discard.findAll{ it.cardTypes.is(POKEMON) || it.cardTypes.is(BASIC_ENERGY) }.select("Select a Pokémon or Basic Energy card to put into your hand").moveTo(my.hand)
          }
        }
        move "Trip Over", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case SLUGMA_73:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Yawn", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Headbutt", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case SNUBBULL_74:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Lick", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            damage 10
            flip { applyAfterDamage PARALYZED }
          }
        }
      };
      case SPINARAK_75:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Stun Poison", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
          energyCost G
          onAttack {
            flip {
              apply PARALYZED
              apply POISONED
            }
          }
        }
        move "Pierce", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case SUNKERN_76:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Minor Errand-Running", {
          text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck
          }
          onAttack {
            my.deck.search(count: 1, "Select a basic Energy card.", cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Rollout", {
          text "20 damage."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case TEDDIURSA_77:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Teary Eyes", {
          text "During your opponent's next turn, any damage done to Teddiursa by attacks is reduced by 20 (after applying Weakness and Resistance)."
          energyCost C
          onAttack {
            reduceDamageNextTurn(hp(20), thisMove)
          }
        }
        move "Scratch", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case TOTODILE_78:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Splatter", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost C
          onAttack {
            noWrDamage 10, opp.all.select("Deal 10 damage to which Pokémon?")
          }
        }
      };
      case WOOPER_79:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Mud Shot", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Tail Whap", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case CURSE_POWDER_80:
      return pokemonTool (this) {
        text "Attach Curse Powder to 1 of your Evolved Pokémon (excluding Pokémon-ex) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Curse Powder is attached to is a Basic Pokémon or Pokémon-ex, discard Curse Powder." +
          "If the Pokémon that Curse Powder is attached to is your Active Pokémon and is Knocked Out by damage from an opponent's attack, put 3 damage counters on the Attacking Pokémon."
        def eff
        def check = {
          if(!it.evolution || it.EX){discard thisCard}
        }
        onPlay {
          eff = delayed {
            before (KNOCKOUT, self) {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                bc "Curse Powder activates"
                directDamage 30, self.owner.opposite.pbg.active//, Source.POKEMON_TOOL or something similar
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          to.evolution && !to.EX
        }
      };
      case ENERGY_RECYCLE_SYSTEM_81:
      return copy(Dragon.ENERGY_RECYCLE_SYSTEM_84, this);
      case ENERGY_REMOVAL_2_82:
      return copy(FireRedLeafGreen.ENERGY_REMOVAL_2_89, this);
      case ENERGY_ROOT_83:
      return pokemonTool (this) {
        text "Attach Energy Root to 1 of your Pokémon (excluding Pokémon-ex and Pokémon that has Dark or an owner in its name) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Energy Root is attached to is Pokémon-ex or has Dark or an owner in its name, discard Energy Root.\nAs long as Energy Root is attached to a Pokémon, that Pokémon gets +20 HP and can't use any Poké-Powers or Poké-Bodies."
        def eff
        def eff2
        def check = {
          if (it.topPokemonCard.name.contains("Dark") || it.topPokemonCard.cardTypes.is(OWNERS_POKEMON) || it.EX){ discard thisCard }
        }
        onPlay {reason->
          eff = getter (GET_FULL_HP, self) {h->
            h.object += hp(20)
          }
          eff2 = getter (IS_ABILITY_BLOCKED) { Holder h ->
            if (h.effect.target == self) {
              if (h.effect.ability instanceof PokePower || h.effect.ability instanceof PokeBody) {
                h.object=true
              }
            }
          }
          new CheckAbilities().run(bg)
        }
        onRemoveFromPlay {
          eff.unregister()
          eff2.unregister()
          new CheckAbilities().run(bg)
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          !to.topPokemonCard.name.contains("Dark") && to.topPokemonCard.cardTypes.isNot(OWNERS_POKEMON) && !to.EX
        }
      };
      case ENERGY_SWITCH_84:
      return copy(FireRedLeafGreen.ENERGY_SWITCH_90, this);
      case FLUFFY_BERRY_85:
      return pokemonTool (this) {
        text "Attach Fluffy Berry to 1 of your Pokémon (excluding Pokémon-ex and Pokémon that has Dark or an owner in its name) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Fluffy Berry is attached to is Pokémon-ex or has Dark or an owner in its name, discard Fluffy Berry." +
          "As long as Fluffy Berry is attached to a Pokémon, that Pokémon's Retreat Cost is 0."
        def eff
        def check = {
          if (it.topPokemonCard.name.contains("Dark") || it.topPokemonCard.cardTypes.is(OWNERS_POKEMON) || it.EX){ discard thisCard }
        }
        onPlay {reason->
          eff = getter GET_RETREAT_COST, self, { h ->
            h.object = 0
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          !to.topPokemonCard.name.contains("Dark") && to.topPokemonCard.cardTypes.isNot(OWNERS_POKEMON) && !to.EX
        }
      };
      case MARY_S_REQUEST_86:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Draw a card. If you don't have any Stage 2 Evolved Pokémon in play, draw 2 more cards."
        onPlay {
          draw 1
          if (!my.all.find{it.evolution && it.topPokemonCard.cardTypes.is(STAGE2)}) draw 2
        }
        playRequirement{
          assert my.deck : "Deck is empty"
        }
      };
      case POKE_BALL_87:
      return itemCard (this) {
        text "Flip a coin. If heads, search your deck for a Basic Pokémon or Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
          flip{
            my.deck.search(count: 1, "Select a Basic Pokémon or an Evolution card", {it.cardTypes.is(BASIC) || it.cardTypes.is(EVOLUTION)}).moveTo(my.hand)
            shuffleDeck()
          }
        }
        playRequirement{
          assert my.deck: "Deck is empty"
        }
      };
      case POKEMON_REVERSAL_88:
      return copy (FireRedLeafGreen.POKEMON_REVERSAL_97, this)
      case PROFESSOR_ELM_S_TRAINING_METHOD_89:
      return copy(HeartgoldSoulsilver.PROFESSOR_ELM_S_TRAINING_METHOD_100, this)
      case PROTECTIVE_ORB_90:
      return pokemonTool (this) {
        text "Attach Protective Orb to 1 of your Evolved Pokémon (excluding Pokémon-ex) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Protective Orb is attached to is a Basic Pokémon or Pokémon-ex, discard Protective Orb." +
          "As long as Protective Orb is attached to a Pokémon, that Pokémon has no Weakness."
        def eff
        def check = {
          if(!it.evolution || it.EX){discard thisCard}
        }
        onPlay {reason->
          eff = getter (GET_WEAKNESSES, self) { h->
            h.object.clear()
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          to.evolution && !to.EX
        }
      };
      case SITRUS_BERRY_91:
      return pokemonTool (this) {
        text "Attach Sitrus Berry to 1 of your Pokémon (excluding Pokémon-ex and Pokémon that has Dark or an owner in its name) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Sitrus Berry is attached to is Pokémon-ex or has Dark or an owner in its name, discard Sitrus Berry." +
          "At any time between turns, if the Pokémon this card is attached to has at least 3 damage counters on it, remove 3 damage counters from it. Then, discard Sitrus Berry."
        def eff
        def check = {
          if (it.topPokemonCard.name.contains("Dark") || it.topPokemonCard.cardTypes.is(OWNERS_POKEMON) || it.EX){ discard thisCard }
        }
        onPlay {reason->
          eff=delayed(anytime:true){
            before BEGIN_TURN,{
              if(self.numberOfDamageCounters >= 3) {
                bc "Sitrus Berry activates"
                heal 30, self
                discard thisCard
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          !to.topPokemonCard.name.contains("Dark") && to.topPokemonCard.cardTypes.isNot(OWNERS_POKEMON) && !to.EX
        }
      };
      case SOLID_RAGE_92:
      return pokemonTool (this) {
        text "Attach Solid Rage to 1 of your Evolved Pokémon (excluding Pokémon-ex) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Solid Rage is attached to is a Basic Pokémon or Pokémon-ex, discard Solid Rage." +
          "If you have more Prize cards left than your opponent, the Pokémon that Solid Rage is attached to does 20 more damage to the Active Pokémon (before applying Weakness and Resistance)."
        def eff
        def check = {
          if(!it.evolution || it.EX){discard thisCard}
        }
        onPlay {reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {if(it.to.active && it.from.owner==thisCard.player && it.to.owner!=it.from.owner && it.dmg.value){
                bc "Solid Rage +20"
                it.dmg += hp(20)
              }}
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        /*onMove {to->
          check(to)
        }//TODO: Find alternative */
        allowAttach {to->
          to.evolution && !to.EX
        }
      };
      case WARP_POINT_93:
      return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case ENERGY_SEARCH_94:
      return copy(BlackWhite.ENERGY_SEARCH_93, this);
      case POTION_95:
      return copy (FireRedLeafGreen.POTION_101, this)
      case DARKNESS_ENERGY_96:
      return copy (Emerald.DARKNESS_ENERGY_86, this);
      case METAL_ENERGY_97:
      return copy (RubySapphire.METAL_ENERGY_94, this);
      case BOOST_ENERGY_98:
      return copy (Deoxys.BOOST_ENERGY_93, this);
      case CYCLONE_ENERGY_99:
      return specialEnergy (this, [[C]]) {
        text "Cyclone Energy provides [C] Energy. When you attach this card from your hand to your Active Pokémon, switch 1 of the Defending Pokémon with 1 of your opponent's Benched Pokémon. Your opponent chooses the Benched Pokémon to switch."
        onPlay { reason->
          if (reason == PLAY_FROM_HAND) {
            if (opp.bench) {
              sw(opp.active, opp.bench.oppSelect("Cyclone Energy was played, which Pokemon to switch with the Active?"))
            }
          }
        }
      };
      case WARP_ENERGY_100:
      return copy (Aquapolis.WARP_ENERGY_147, this)
      case BLISSEY_EX_101:
      return evolution (this, from:"Chansey", hp:HP160, type:C, retreatCost:1) {
        weakness F
        pokePower "Blissful Support", {
          text "Once during your turn, when you play Blissey ex from your hand to evolve 1 of your Pokémon, you may discard all Energy cards attached to any number of your Pokémon and remove all damage counters from those Pokémon."
          onActivate {
            if (it==PLAY_FROM_HAND && confirm("Use Blissful Support?")) {
              powerUsed()

              my.all.findAll { it.numberOfDamageCounters || !it.cards.filterByType(ENERGY) }.each {
                healAll it, Source.SRC_ABILITY
              }

              def tar = true
              while (tar) {
                tar = my.all.findAll { it.cards.filterByType(ENERGY) || it.numberOfDamageCounters }
                if (!tar) break
                def pcs = tar.select("Select a Pokémon to discard all Energy Cards from, and then heal off all damage it has. Cancel to stop", false)
                if (!pcs) break
                def energiesToDiscard = pcs.cards.filterByType(ENERGY)
                if (energiesToDiscard) energiesToDiscard.discard()
                healAll pcs, Source.SRC_ABILITY
              }
            }
          }
        }
        move "Energy Absorption", {
          text "Attach up to 3 Energy cards from your discard pile to Blissey ex."
          energyCost C
          attackRequirement {
            assert my.discard.filterByType(ENERGY)
          }
          onAttack {
            def count = 0
            while (count < 3 && my.discard.filterByType(ENERGY)) {
              attachEnergyFrom(basic: false, my.discard, self)
              count++
            }
          }
        }
        move "Roll Out", {
          text "60 damage."
          energyCost C, C, C, C
          onAttack {
            damage 60
          }
        }
      };
      case ESPEON_EX_102:
      return evolution (this, from:"Eevee", hp:HP110, type:P, retreatCost:0) {
        weakness P
        pokePower "Devo Flash", {
          text "Once during your turn, when you play Espeon ex from your hand to evolve 1 of your Pokémon, you may choose 1 Evolved Pokémon on your opponent's Bench, remove the highest Stage Evolution card from that Pokémon, and put it back into his or her hand."
          onActivate {
            if (it==PLAY_FROM_HAND && opp.bench.any{ it.evolution } && confirm("Use Devo Flash?")) {
              powerUsed()

              def list = opp.bench.findAll { it.evolution }
              def pcs = list.select("Devolve one of your opponent's evolved Pokémon")
              def top = pcs.topPokemonCard
              bc "$top Devolved"
              pcs.cards.remove(top)
              opp.hand.add(top)
              devolve(pcs, top)
            }
          }
        }
        move "Snap Tail", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          onAttack {
            damage 30, opp.all.select("Deal 30 damage to which Pokémon?")
          }
        }
        move "Psyloop", {
          text "60+ damage. Does 60 damage plus 30 more damage for each Trainer card your opponent has in play."
          energyCost P, C, C
          onAttack {
            damage 60
            //Taken from Xatu (DX 29)
            def addDmg = 0
            opp.all.each{
              if(it.cards.filterByType(POKEMON_TOOL)) addDmg += 1
              //TODO: Maybe improve this detection... Is the benched fossil/doll/usbsitute still detected as a trainer?
              it.cards.each{
                thatCard -> ["Amber", " Doll", "Robo Substitute"].each{
                  thatTrainer -> if (thatCard.name.contains(thatTrainer)) { addDmg += 1 }
                }
                if (
                  thatCard.name.contains("Fossil") && thatCard.name != "Buried Fossil"
                ) { addDmg += 1 }
              }
              //TODO: Detect attached non-tools (see: Pluspower, Defender, etc.)
            }
            if(bg.stadiumInfoStruct){
              if(bg.stadiumInfoStruct.stadiumCard.player != self.owner){
                addDmg += 1
              }
            }
            damage 30 * addDmg
          }
        }
      };
      case FERALIGATR_EX_103:
      return evolution (this, from:"Croconaw", hp:HP150, type:W, retreatCost:3) {
        weakness L
        pokeBody "Overpowering Fang", {
          text "As long as Feraligatr ex is your Active Pokémon, each player's Pokémon (excluding Pokémon-ex) can't use any Poké-Powers or Poké-Bodies."
          getterA (IS_ABILITY_BLOCKED) { Holder h ->
            if (self.active && !h.effect.target.EX) {
              if (h.effect.ability instanceof PokePower || h.effect.ability instanceof PokeBody) {
                h.object=true
              }
            }
          }
        }
        move "Tsunami", {
          text "30 damage. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          onAttack {
            damage 30

            opp.bench.each {
              damage 10, it
            }
          }
        }
        move "Sore Spot", {
          text "70+ damage. Does 70 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost W, C, C, C
          onAttack {
            damage 70+10*defending.numberOfDamageCounters
          }
        }
      };
      case HO_OH_EX_104:
      return basic (this, hp:HP110, type:R, retreatCost:2) {
        weakness W
        pokePower "Golden Wing", {
          text "If Ho-Oh ex would be Knocked Out by damage from an opponent's attack, you may move up to 2 Energy attached to Ho-Oh ex to your Pokémon in any way you like."
          delayedA {
            before (KNOCKOUT,self) {
              if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.all.size() > 1 && self.cards.filterByType(ENERGY)) {
                bc "Golden Wing activates"
                moveEnergy(playerType: self.owner, may: true, count: 2, info: "Golden Wing", self, self.owner.pbg.all.getExcludedList(self))
              }
            }
          }
        }
        move "Rainbow Burn", {
          text "10+ damage. Does 10 damage plus 20 more damage for each type of basic Energy card attached to Ho-Oh ex."
          energyCost C, C, C
          onAttack {
            damage 10
            for (Type t1:Type.values()) {
              if (self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1)) {
                damage 20
              }
            }
          }
        }
      };
      case LUGIA_EX_105:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness P
        resistance F, MINUS30
        pokeBody "Silver Sparkle", {
          text "If Lugia ex is your Active Pokémon and is damaged by an opponent's attack (even if Lugia ex is Knocked Out), flip a coin. If heads, choose an Energy card attached to the Attacking Pokémon and return it to your opponent's hand."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({ it.to==self && it.dmg.value })) {
                if (ef.attacker.cards.filterByType(ENERGY)) {
                  bc "Silver Sparkle Activates"
                  ef.attacker.cards.filterByType(ENERGY).select("Select an Energy to move to the Opponent's hand", self.owner).moveTo(ef.attacker.owner.pbg.hand)
                }
              }
            }
          }
        }
        move "Elemental Blast", {
          text "200 damage. Discard a [R] Energy, [W] Energy, and [L] Energy attached to Lugia ex."
          energyCost R, W, L
          onAttack {
            damage 200
            discardSelfEnergy R
            discardSelfEnergy W
            discardSelfEnergy L
          }
        }
      };
      case MEGANIUM_EX_106:
      return evolution (this, from:"Bayleef", hp:HP150, type:G, retreatCost:2) {
        weakness G
        weakness R
        resistance W, MINUS30
        pokePower "Nurture and Heal", {
          text "Once during your turn (before your attack), you may attach a [G] Energy card from your hand to 1 of your Pokémon. If you do, remove 1 damage counter from that Pokémon. This power can't be used if Meganium ex is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(G) : "You have no [G] Energy cards in your hand"

            powerUsed()
            def pcs = my.all.select()
            attachEnergyFrom(type:G, my.hand, pcs)
            heal 10, pcs, SRC_ABILITY
          }
        }
        move "Razor Leaf", {
          text "50 damage."
          energyCost C, C, C
          onAttack {
            damage 50
          }
        }
        move "Power Poison", {
          text "Discard 1 Energy attached to Meganium ex. The Defending Pokémon is now Poisoned."
          energyCost G, G, C, C, C
          onAttack {
            discardSelfEnergy C
            apply POISONED
          }
        }
      };
      case POLITOED_EX_107:
      return evolution (this, from:"Poliwhirl", hp:HP150, type:W, retreatCost:3) {
        weakness G
        move "Upward Lick", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. If that Pokémon is a Stage 2 Evolved Pokémon, this attack does 50 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C
          onAttack {
            def target = opp.all.select("Put 1 damage counter to which pokémon?")
            def amount = 30
            if (target.evolution && target.topPokemonCard.cardTypes.contains(STAGE2)) {
              amount = 50
            }
            damage amount, target
          }
        }
        move "Punch and Run", {
          text "40 damage. Switch Politoed ex with 1 of your Benched Pokémon."
          energyCost C, C, C
          onAttack {
            damage 40
            switchYourActive()
          }
        }
        move "Swallow Up", {
          text "70 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Politoed ex. If the Defending Pokémon has fewer remaining HP than Politoed ex's, this attack does 120 damage instead."
          energyCost W, W, C, C
          onAttack {
            if (defending.getRemainingHP().value < self.getRemainingHP().value) {
              bc "Defending remaining HP is less than Politoed ex's remaining HP, extra damage applied"
              damage 120
            } else {
              damage 70
            }
          }
        }
      };
      case SCIZOR_EX_108:
      return evolution (this, from:"Scyther", hp:HP120, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Danger Perception", {
          text "As long as Scizor ex's remaining HP is 60 or less, Scizor ex does 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (it.from == self && it.to == self.owner.opposite.pbg.active && self.getRemainingHP().value <= 60) {
                  bc "Danger Perception +40"
                  it.dmg += hp(40)
                }
              }
            }
          }
        }
        move "Steel Wing", {
          text "40 damage. During your opponent's next turn, any damage done to Scizor ex by attacks is reduced by 20 (after applying Weakness and Resistance)."
          energyCost M, C
          onAttack {
            damage 40
            reduceDamageNextTurn(hp(20), thisMove)
          }
        }
        move "Cross-Cut", {
          text "50+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 50 damage plus 30 more damage."
          energyCost C, C, C
          onAttack {
            damage 50
            if (defending.evolution) {
              damage 30
            }
          }
        }
      };
      case STEELIX_EX_109:
      return evolution (this, from:"Onix", hp:HP150, type:M, retreatCost:5) {
        weakness R
        weakness F
        resistance G, MINUS30
        resistance L, MINUS30
        pokeBody "Poison Resistance", {
          text "Steelix ex can't be Poisoned."
          delayedA {
            before APPLY_SPECIAL_CONDITION, {
              def pcs = e.getTarget(bg)
              if (pcs == self && ef.type == POISONED) {
                bc "Poison Resistance prevents $self from being Poisoned"
                prevent()
              }
            }
          }
        }
        move "Metal Charge", {
          text "70 damage. Put 1 damage counter on Steelix ex."
          energyCost M, C, C
          onAttack {
            damage 70
            directDamage 10, self
          }
        }
        move "Mudslide", {
          text "Discard 2 [F] Energy attached to Steelix ex and choose 1 of your opponent's Pokémon. This attack does 100 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C
          onAttack {
            discardSelfEnergy F,F
            damage 100, opp.all.select("Deal 100 damage to which Pokémon?")
          }
        }
      };
      case TYPHLOSION_EX_110:
      return evolution (this, from:"Quilava", hp:HP150, type:R, retreatCost:1) {
        weakness W
        weakness F
        pokePower "Bursting Up", {
          text "Once during your turn, when you play Typhlosion ex from your hand to evolve 1 of your Pokémon, count the number of your opponent's Benched Pokémon. You may search your deck for up to that number of [R] Energy cards and attach them to 1 of your [R] Pokémon. Shuffle your deck afterward."
          onActivate {
            if (it==PLAY_FROM_HAND && opp.bench && confirm("Use Bursting Up?")) {
              powerUsed()
              def list = my.deck.search (max: opp.bench.size(), basicEnergyFilter(R))
              if (list) {
                def pcs = my.all.findAll { it.types.contains(R) }.select("Which [R] Pokémon to attach these Energies to?")
                list.each { attachEnergy(pcs, it) }
              }
              shuffleDeck()
            }
          }
        }
        move "Kindle", {
          text "80 damage. Discard an Energy card attached to Typhlosion ex and then discard an Energy card attached to the Defending Pokémon."
          energyCost R, R, C, C
          onAttack {
            damage 80
            afterDamage {
              discardSelfEnergy C
              discardDefendingEnergy()
            }
          }
        }
      };
      case TYRANITAR_EX_111:
      return evolution (this, from:"Pupitar", hp:HP160, type:D, retreatCost:2) {
        weakness G
        weakness F
        resistance P, MINUS30
        move "Shatter", {
          text "30 damage. Discard any Stadium card in play."
          energyCost F
          onAttack {
            damage 30

            afterDamage {
              if (bg.stadiumInfoStruct) {
                discard(bg.stadiumInfoStruct.stadiumCard)
              }
            }
          }
        }
        move "Derail", {
          text "30 damage. Discard a Special Energy card, if any, attached to the Defending Pokémon."
          energyCost C, C
          onAttack {
            damage 30
            discardDefendingSpecialEnergy(delegate)
          }
        }
        move "Mix-Up", {
          text "70 damage. Your opponent discards the top card of his or her deck."
          energyCost F, D, C
          onAttack {
            damage 70

            if (opp.deck) {
              opp.deck.subList(0,1).discard()
            }
          }
        }
        move "Losing Control", {
          text "120 damage. Discard the top 3 cards of your deck."
          energyCost F, D, D, C
          onAttack {
            damage 120

            if (my.deck) {
              my.deck.subList(0, 3).discard()
            }
          }
        }
      };
      case UMBREON_EX_112:
      return evolution (this, from:"Eevee", hp:HP110, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Darker Ring", {
          text "Once during your turn (before your attack), when you play Umbreon ex from your hand to evolve 1 of your Pokémon, switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          onActivate {r->
            if (r==PLAY_FROM_HAND && opp.bench && confirm("Use Darker Ring?")) {
              powerUsed()
              sw opp.active, opp.bench.select("Choose your opponent's new active Pokémon."), SRC_ABILITY
            }
          }
        }
        move "Black Cry", {
          text "20 damage. The Defending Pokémon can't retreat or use any Poké-Powers during your opponent's next turn."
          energyCost C
          onAttack {
            damage 20

            cantRetreat(defending)
            targeted (defending) {
              delayed {
                def eff
                register {
                  eff = getter (IS_ABILITY_BLOCKED) { Holder h->
                    if (h.effect.target == defending && h.effect.ability instanceof PokePower) {
                      h.object = true
                    }
                  }
                  new CheckAbilities().run(bg)
                }
                unregister{
                  eff.unregister()
                  new CheckAbilities().run(bg)
                }
                unregisterAfter 2
                after SWITCH, defending, {unregister()}
                after EVOLVE, defending, {unregister()}
              }
            }
          }
        }
        move "Darkness Fang", {
          text "60 damage."
          energyCost D, C, C
          onAttack {
            damage 60
          }
        }
      };
      case ENTEI_STAR_113:
      return basic (this, hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Burning Turn", {
          text "20 damage. Switch Entei Star with 1 of your Benched Pokémon."
          energyCost R, C
          onAttack {
            damage 20
            switchYourActive()
          }
        }
        move "Detonation", {
          text "70 damage. If you have less Prize cards left than your opponent, discard the top 10 cards from your deck."
          energyCost R, R, R
          onAttack {
            damage 70
            afterDamage {
              if (my.deck && my.prizeCardSet.size() < opp.prizeCardSet.size()) {
                def list = my.deck.subList(0, 10).discard()
                bc "Discarded 10 cards from the top of ${self}'s owner's deck"
              }
            }
          }
        }
      };
      case RAIKOU_STAR_114:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Lightning Turn", {
          text "20 damage. Switch Raikou Star with 1 of your Benched Pokémon."
          energyCost L, C
          onAttack {
            damage 20
            switchYourActive()
          }
        }
        move "Meta Voltage", {
          text "70 damage. If you have less Prize cards left than your opponent, this attack does 40 damage to each of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, L
          onAttack {
            damage 70

            if (my.prizeCardSet.size() < opp.prizeCardSet.size()) {
              my.all.each {
                damage 40, it
              }
            }
          }
        }
      };
      case SUICUNE_STAR_115:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Splashing Turn", {
          text "20 damage. Switch Suicune Star with 1 of your Benched Pokémon."
          energyCost W, C
          onAttack {
            damage 20
            switchYourActive()
          }
        }
        move "Cross Wind", {
          text "70 damage. If you have less Prize cards left than your opponent, discard all Energy cards attached to all of your Pokémon."
          energyCost W, W, W
          onAttack {
            damage 70
            afterDamage {
              if (my.prizeCardSet.size() < opp.prizeCardSet.size()) {
                my.all.each {
                  it.cards.filterByType(ENERGY).discard()
                }
              }
            }
          }
        }
      };
      case ROCKET_S_PERSIAN_EX_116:
      return evolution (this, from:"Rocket's Meowth", hp:HP100, type:D, retreatCost:1) {
        weakness F
        pokePower "Night Cry", {
          text "Once during your turn, if Rocket's Persian ex is on your Bench, you may search your deck for a Pokémon with Dark or Rocket's in its name. Show it to your opponent and put it into your hand. Shuffle your deck afterward."
          actionA {
            checkLastTurn()
            assert my.deck : "There are no more cards in your deck"
            assert self.benched : "This Pokemon is not benched"
            powerUsed()
            def card = my.deck.search("Select a Pokemon with Dark or Rocket's in its name to put into your hand", {
              it.cardTypes.is(POKEMON) &&
              (it.name.contains("Rocket's ") || it.name.contains("Dark "))
            })
            card.moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Toxic Claws", {
          text "20 damage. The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost C, C, C
          onAttack {
            damage 20
            applyAfterDamage POISONED
            extraPoison 1
          }
        }
      };
      case CELEBI_EX_117:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Spiral Leaf", {
          text "Flip a coin. If heads, put 1 damage counter on each of your opponent's Pokémon. If tails, remove 1 damage counter for each of your Pokémon."
          energyCost G
          onAttack {
            flip 1, {
              opp.all.each {
                directDamage 10, it
              }
            }, {
              my.all.each {
                heal 10, it
              }
            }
          }
        }
        move "Time Trap", {
          text "30 damage. Flip a coin. If heads, look at the top 4 cards of your opponent's deck, and put them back on top of your opponent's deck in any order. If tails, look at the top 4 cards of your deck, and put them back on top of your deck in any order."
          energyCost G, C
          onAttack {
            damage 30
            afterDamage {
              flip 1, {
                if (opp.deck) {
                  def rearrangedCards = rearrange(opp.deck.subList(0, 4))
                  opp.deck.setSubList(0, rearrangedCards)

                  bc "Rearranged top 4 cards of opponent's (${opp.owner.getPlayerUsername(bg)}) deck."
                }
              }, {
                if (my.deck) {
                  def rearrangedCards = rearrange(my.deck.subList(0, 4))
                  my.deck.setSubList(0, rearrangedCards)

                  bc "Rearranged top 4 cards of (${opp.owner.getPlayerUsername(bg)}) deck."
                }
              }
            }
          }
        }
      };
      case UNOWN_118:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Choose a card from your hand and put it face down. Your opponent guesses if that card is a Pokémon, Trainer, or Energy card. Reveal the card. If your opponent guessed wrong, draw 2 cards. Put the card back into your hand."
          energyCost C
          attackRequirement {
            assert my.hand : "Your hand is empty."
          }
          onAttack {
            def myCard = my.hand.select("Select a card for your opponent to guess.")

            def opponentChoice = oppChoose([1,2,3], ['Pokemon', 'Trainer', 'Energy'], "Guess the type of card your opponent has chosen")

            myCard.showToOpponent("Your Opponent's chosen card.")
            if (
              (opponentChoice == 1 && myCard.cardTypes.is(POKEMON)) ||
              (opponentChoice == 2 && myCard.cardTypes.is(TRAINER)) ||
              (opponentChoice == 3 && myCard.cardTypes.is(ENERGY))
            ) {
              bc "Hidden Power - The correct card type was guessed."
            } else {
              bc "Hidden Power - The wrong card type was guessed"
              draw 2
            }
          }
        }
      };
      case UNOWN_119:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Search your deck for up to 2 Supporter cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C, C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search(max:2, "Select 2 Supporter cards to move to your hand.", cardTypeFilter(SUPPORTER)).moveTo(hand)
            shuffleDeck()
          }
        }
      };
      case UNOWN_120:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Count the number of cards in your opponent's hand. Put that many damage counters on the Defending Pokémon."
          energyCost C, C, C
          onAttack {
            directDamage 10*opp.hand.size(), opp.active
          }
        }
      };
      case UNOWN_121:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Search your opponent's discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your opponent's discard pile.)"
          energyCost C
          attackRequirement {
            assert opp.discard.hasType(SUPPORTER) : "No supporters in Opponent's discard pile"
          }
          onAttack {
            def card = opp.discard.select("Select a Supporter to use", cardTypeFilter(SUPPORTER)).first()
            bg.deterministicCurrentThreadPlayerType=self.owner
            bg.em().run(new PlayTrainer(card))
            bg.clearDeterministicCurrentThreadPlayerType()
          }
        }
      };
      case UNOWN_122:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Flip a coin. If heads, choose 1 of either player's Evolved Pokémon, remove the highest Stage Evolution card from that Pokémon, and put it into that player's hand."
          energyCost C
          onAttack {
            flip {
              if (all.findAll { it.evolution }) {
                def list = all.findAll { it.evolution }
                def pcs = list.select("Devolve one Evolved Pokémon")
                def top = pcs.topPokemonCard
                bc "$top Devolved"
                pcs.cards.remove(top)
                pcs.owner.pbg.hand.add(top)
                devolve(pcs, top)
              }
            }
          }
        }
      };
      case UNOWN_123:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "If your opponent's Bench isn't full, look at his or her hand. Choose 1 Basic Pokémon you find there and put it onto your opponent's Bench. Then, switch it with the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost C
          attackRequirement {
            assert opp.bench.notFull : "Opponent's Bench is full"
          }
          onAttack {
            opp.hand.showToMe("Opponent's hand.")
            if (opp.hand.findAll { it.cardTypes.is(BASIC) }) {
              def basicPokemon = opp.hand.findAll { it.cardTypes.is(BASIC) }
              def tar
              basicPokemon.select("Choose a pokemon to bench").each {
                opp.hand.remove(it)
                tar = benchPCS(it, OTHER, TargetPlayer.OPPONENT)
              }
              sw opp.active, tar
            }
          }
        }
      };
      case UNOWN_124:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "10 damage. Flip 3 coins. If 1 of them is heads, the Defending Pokémon is now Asleep. If 2 of them are heads, the Defending Pokémon is now Confused. If all of them are heads, the Defending Pokémon is now Paralyzed."
          energyCost P, C
          onAttack {
            damage 10

            flip 3, {}, {}, [
              1: {
                apply ASLEEP
              }, 2: {
                apply CONFUSED
              }, 3: {
                apply PARALYZED
              }
            ]
          }
        }
      };
      case UNOWN_125:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Count the number of your Pokémon that have any damage counters on them. Put that many damage counters on the Defending Pokémon."
          energyCost C, C
          onAttack {
            directDamage 10*my.all.findAll { it.numberOfDamageCounters }.size(), defending
          }
        }
      };
      case UNOWN_126:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Search your deck for up to 2 Pokémon Tool cards and attach them to any of your Pokémon (excluding Pokémon that already have a Pokémon Tool attached to them). Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.all.findAll({!(it.cards.filterByType(POKEMON_TOOL))}) : "Your Pokemon already have tools attached to them."
            assert my.deck : "Deck is empty."
          }
          onAttack {
            def tar = my.all.findAll({!(it.cards.filterByType(POKEMON_TOOL))})
            if(tar){
              my.deck.search(max : Math.min(2,tar.size()),"Search for up to 2 Pokémon tool",cardTypeFilter(POKEMON_TOOL)).each{
                def pcs = my.all.findAll({!(it.cards.filterByType(POKEMON_TOOL))}).select()
                my.deck.remove(it)
                attachPokemonTool(it,pcs)
              }
            }
            shuffleDeck()
          }
        }
      };
      case UNOWN_127:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Burned and Confused."
          energyCost P, C
          onAttack {
            def target = defending
            if (opp.bench) {
              target = opp.bench.select("Select the new active")
              sw defending, target
              apply BURNED
              apply CONFUSED
            }
          }
        }
      };
      case UNOWN_128:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Flip a coin. If heads, switch all damage counters on Unown with those on the Defending Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
          energyCost C
          onAttack {
            flip{
              targeted (defending) {
                def oldDamage = defending.damage
                defending.damage = self.damage
                self.damage = oldDamage
              }
            }
          }
        }
      };
      case UNOWN_129:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "20 damage. You may discard any Stadium card in play."
          energyCost P, C
          onAttack {
            damage 20
            afterDamage{
              if(bg.stadiumInfoStruct && confirm("Discard the stadium in play?")){
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
        }
      };
      case UNOWN_130:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Flip a coin. If heads, put damage counters on the Defending Pokémon until it is 10 HP away from being Knocked Out."
          energyCost P, C
          onAttack {
            flip {
              directDamage opp.active.remainingHP.value - 10, opp.active
            }
          }
        }
      };
      case UNOWN_131:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Search your deck for a card that evolves from 1 of your Pokémon and put it on that Pokémon. (This counts as evolving that Pokémon.) If you do, put 1 damage counter on Unown. Shuffle your deck afterward."
          energyCost P
          attackRequirement {
            assert my.deck
          }
          onAttack {
            def names=my.all.collect{it.name}
            def sel=deck.search ("Evolves from $names", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)})
            if(sel){
              def opts=my.all.findAll({it.name==sel.first().predecessor})
              def pcs=opts.select("Evolve which one?")
              evolve(pcs, sel.first(), OTHER)
              directDamage 10, self
            }
            shuffleDeck()
          }
        }
      };
      case UNOWN_132:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Remove 5 damage counters from Unown. (All if there are less than 5.)"
          energyCost C
          onAttack {
            heal(50, self)
          }
        }
      };
      case UNOWN_133:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "20 damage. Return Unown and all Energy cards attached to it to your hand."
          energyCost P, C
          onAttack {
            damage 20
            afterDamage {
              self.cards.moveTo(hand)
              removePCS(self)
            }
          }
        }
      };
      case UNOWN_134:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Put 1 damage counter on each of your opponent's Pokémon that already has damage counters on it."
          energyCost C, C
          onAttack {
            opp.all.findAll { it.numberOfDamageCounters }.each {
              directDamage 10, it
            }
          }
        }
      };
      case UNOWN_135:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Search your deck for up to 3 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          energyCost C
          onAttack {
            my.deck.select(min:0, max:3, "Select up to 3 different types of basic Energy cards", cardTypeFilter(BASIC_ENERGY), self.owner,
              {
                CardList list->
                  for (Type t1:Type.values()) {
                    if (list.findAll{it.asEnergyCard().containsTypePlain(t1)}.size() >= 2) {
                      return false
                    }
                  }
                  return true
              }).moveTo(my.hand)
          }
        }
      };
      case UNOWN_136:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand. (If your opponent doesn't have any Benched Pokémon or other Active Pokémon, this attack does nothing.)"
          energyCost C, C
          attackRequirement { assert opp.bench: "Opponent's bench is empty" }
          onAttack {
            flip {
              defending.cards.moveTo(hand)
              removePCS(defending)
            }
          }
        }
      };
      case UNOWN_137:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "If the Defending Pokémon has a Poké-Power or a Poké-Body, choose up to 2 basic Energy cards attached to 1 of your opponent's Pokémon and attach them to the Defending Pokémon."
          energyCost P, P
          onAttack {
            if (defending.hasPokePower() || defending.hasPokeBody()) {
              if (opp.bench.findAll { it.cards.filterByType(BASIC_ENERGY) }) {
                def tar = opp.bench.findAll{ it.cards.filterByType(BASIC_ENERGY) }.select("Choose a Pokémon to move energy from")
                if(tar){
                  tar.cards.filterByType(BASIC_ENERGY).select(min:0,max:2,"Move which energy?").each{
                    energySwitch(tar,self.owner.opposite.pbg.active,it)
                  }
                }
              }
            }
          }
        }
      };
      case UNOWN_138:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost C, C
          onAttack {
            noWrDamage 20, opp.all.select("Deal 20 damage to which Pokémon?")
          }
        }
      };
      case UNOWN_139:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "10 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost P, C
          onAttack {
            damage 10
            amnesia delegate
          }
        }
      };
      case UNOWN_140:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Basic Pokémon and each Evolution card in your discard pile. You can't add more than 60 damage in this way."
          energyCost P, C, C
          onAttack {
            damage 20
            def addDmg = Math.min(my.discard.filterByType(BASIC, EVOLUTION).size(), 6)
            damage 10*addDmg
          }
        }
      };
      case UNOWN_141:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "20 damage. Flip a coin. If heads, search your discard pile for a card, show it to your opponent, and put it on top of your deck."
          energyCost P, C
          attackRequirement {
            assert my.discard.notEmpty
          }
          onAttack {
            damage 20
            flip {
              my.discard.select("Move a card from Discard to top of deck").moveTo(addToTop: true, my.deck)
            }
          }
        }
      };
      case UNOWN_142:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost P, C
          onAttack {
            flipUntilTails { damage 20 }
          }
        }
      };
      case UNOWN_143:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            apply ASLEEP
          }
        }
      };
      case UNOWN_144:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Does 20 damage to each Pokémon that has any Poké-Powers or Poké-Bodies (both yours and your opponent's). Don't apply Weakness or Resistance."
          energyCost P
          onAttack {
            all.each {
              if (it.abilities.keySet().find{it instanceof PokePower || it instanceof PokeBody})
                noWrDamage 20, it
            }
          }
        }
      };
      case UNOWN_145:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Shuffle", {
          text "Once during your turn (before your attack), you may search your deck for another Unown and switch it with Unown. (Any cards attached to Unown, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Unown on top of your deck. Shuffle your deck afterward. You can't use more than 1 Shuffle Poké-Power each turn."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Unown_Shuffle") != bg.turnCount : "You can't use more than 1 Shuffle Poké-Power each turn."
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Unown_Shuffle", bg.turnCount)
            powerUsed()

            def oldUnown = self.topPokemonCard
            def newUnown = my.deck.search(min:0, max: 1, {
              it.name == "Unown"
            })

            if (newUnown) {
              newUnown.moveTo(self.cards)
              my.deck.add(oldUnown)
              self.cards.remove(oldUnown)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Hidden Power", {
          text "Flip a coin. If heads, put 2 damage counters on 1 of your opponent's Pokémon. If tails, put 2 damage counters on 1 of your Pokémon."
          energyCost C
          onAttack {
            flip 1, {
              directDamage 20, opp.all.select("Put 2 damage counters on which Pokemon?")
            }, {
              directDamage 20, my.all.select("Put 2 damage counters on which Pokemon?")
            }
          }
        }
      };
      default:
      return null;
    }
  }
}
