package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen3.RubySapphire;

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
public enum DeltaSpecies implements LogicCardInfo {

  BEEDRILL_DELTA_1 ("Beedrill", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _GRASS_, _METAL_]),
  CROBAT_DELTA_2 ("Crobat", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _GRASS_, _METAL_]),
  DRAGONITE_DELTA_3 ("Dragonite", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _LIGHTNING_, _METAL_]),
  ESPEON_DELTA_4 ("Espeon", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_, _METAL_]),
  FLAREON_DELTA_5 ("Flareon", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_, _METAL_]),
  GARDEVOIR_DELTA_6 ("Gardevoir", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _PSYCHIC_, _METAL_]),
  JOLTEON_DELTA_7 ("Jolteon", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_, _METAL_]),
  LATIAS_DELTA_8 ("Latias", 8, Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _LIGHTNING_, _METAL_]),
  LATIOS_DELTA_9 ("Latios", 9, Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _LIGHTNING_, _METAL_]),
  MAROWAK_DELTA_10 ("Marowak", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_, _METAL_]),
  METAGROSS_DELTA_11 ("Metagross", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _LIGHTNING_, _METAL_]),
  MEWTWO_DELTA_12 ("Mewtwo", 12, Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _FIRE_, _METAL_]),
  RAYQUAZA_DELTA_13 ("Rayquaza", 13, Rarity.HOLORARE, [POKEMON, BASIC, DELTA, _LIGHTNING_, _METAL_]),
  SALAMENCE_DELTA_14 ("Salamence", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _FIRE_, _METAL_]),
  STARMIE_DELTA_15 ("Starmie", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_, _METAL_]),
  TYRANITAR_DELTA_16 ("Tyranitar", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _FIRE_, _METAL_]),
  UMBREON_DELTA_17 ("Umbreon", 17, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _DARKNESS_, _METAL_]),
  VAPOREON_DELTA_18 ("Vaporeon", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_, _METAL_]),
  AZUMARILL_DELTA_19 ("Azumarill", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_, _METAL_]),
  AZURILL_20 ("Azurill", 20, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  HOLON_S_ELECTRODE_21 ("Holon's Electrode", 21, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  HOLON_S_MAGNETON_22 ("Holon's Magneton", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  HYPNO_23 ("Hypno", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MIGHTYENA_DELTA_24 ("Mightyena", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _DARKNESS_, _METAL_]),
  PORYGON2_25 ("Porygon2", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  RAIN_CASTFORM_26 ("Rain Castform", 26, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  SANDSLASH_DELTA_27 ("Sandslash", 27, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_, _METAL_]),
  SLOWKING_28 ("Slowking", 28, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SNOW_CLOUD_CASTFORM_29 ("Snow-cloud Castform", 29, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  STARMIE_DELTA_30 ("Starmie", 30, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _WATER_, _METAL_]),
  SUNNY_CASTFORM_31 ("Sunny Castform", 31, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  SWELLOW_32 ("Swellow", 32, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WEEZING_33 ("Weezing", 33, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CASTFORM_34 ("Castform", 34, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DITTO_35 ("Ditto", 35, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  DITTO_36 ("Ditto", 36, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  DITTO_37 ("Ditto", 37, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  DITTO_38 ("Ditto", 38, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DITTO_39 ("Ditto", 39, Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DITTO_40 ("Ditto", 40, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  DRAGONAIR_DELTA_41 ("Dragonair", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  DRAGONAIR_DELTA_42 ("Dragonair", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  GOLBAT_43 ("Golbat", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HARIYAMA_44 ("Hariyama", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ILLUMISE_45 ("Illumise", 45, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  KAKUNA_46 ("Kakuna", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  KIRLIA_47 ("Kirlia", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MAGNETON_48 ("Magneton", 48, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  METANG_DELTA_49 ("Metang", 49, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  PERSIAN_50 ("Persian", 50, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PUPITAR_DELTA_51 ("Pupitar", 51, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  RAPIDASH_52 ("Rapidash", 52, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SHELGON_DELTA_53 ("Shelgon", 53, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  SHELGON_DELTA_54 ("Shelgon", 54, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_]),
  SKARMORY_55 ("Skarmory", 55, Rarity.UNCOMMON, [POKEMON, BASIC, _METAL_]),
  VOLBEAT_56 ("Volbeat", 56, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  BAGON_DELTA_57 ("Bagon", 57, Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  BAGON_DELTA_58 ("Bagon", 58, Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  BELDUM_DELTA_59 ("Beldum", 59, Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  CUBONE_60 ("Cubone", 60, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DITTO_61 ("Ditto", 61, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DITTO_62 ("Ditto", 62, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DITTO_63 ("Ditto", 63, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  DITTO_64 ("Ditto", 64, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DRATINI_DELTA_65 ("Dratini", 65, Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  DRATINI_DELTA_66 ("Dratini", 66, Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  DROWZEE_67 ("Drowzee", 67, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EEVEE_DELTA_68 ("Eevee", 68, Rarity.COMMON, [POKEMON, BASIC, DELTA, _METAL_]),
  EEVEE_69 ("Eevee", 69, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HOLON_S_MAGNEMITE_70 ("Holon's Magnemite", 70, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  HOLON_S_VOLTORB_71 ("Holon's Voltorb", 71, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  KOFFING_72 ("Koffing", 72, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LARVITAR_DELTA_73 ("Larvitar", 73, Rarity.COMMON, [POKEMON, BASIC, DELTA, _FIRE_]),
  MAGNEMITE_74 ("Magnemite", 74, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MAKUHITA_75 ("Makuhita", 75, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MARILL_76 ("Marill", 76, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MEOWTH_77 ("Meowth", 77, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PONYTA_78 ("Ponyta", 78, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  POOCHYENA_79 ("Poochyena", 79, Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  PORYGON_80 ("Porygon", 80, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RALTS_81 ("Ralts", 81, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SANDSHREW_82 ("Sandshrew", 82, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SLOWPOKE_83 ("Slowpoke", 83, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARYU_84 ("Staryu", 84, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARYU_85 ("Staryu", 85, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TAILLOW_86 ("Taillow", 86, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  WEEDLE_87 ("Weedle", 87, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ZUBAT_88 ("Zubat", 88, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  DUAL_BALL_89 ("Dual Ball", 89, Rarity.UNCOMMON, [TRAINER, ITEM]),
  GREAT_BALL_90 ("Great Ball", 90, Rarity.UNCOMMON, [TRAINER, ITEM]),
  HOLON_FARMER_91 ("Holon Farmer", 91, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_LASS_92 ("Holon Lass", 92, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_MENTOR_93 ("Holon Mentor", 93, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_RESEARCH_TOWER_94 ("Holon Research Tower", 94, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  HOLON_RESEARCHER_95 ("Holon Researcher", 95, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_RUINS_96 ("Holon Ruins", 96, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  HOLON_SCIENTIST_97 ("Holon Scientist", 97, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HOLON_TRANSCEIVER_98 ("Holon Transceiver", 98, Rarity.UNCOMMON, [TRAINER, ITEM]),
  MASTER_BALL_99 ("Master Ball", 99, Rarity.UNCOMMON, [TRAINER, ITEM]),
  SUPER_SCOOP_UP_100 ("Super Scoop Up", 100, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POTION_101 ("Potion", 101, Rarity.COMMON, [TRAINER, ITEM]),
  SWITCH_102 ("Switch", 102, Rarity.COMMON, [TRAINER, ITEM]),
  DARKNESS_ENERGY_103 ("Darkness Energy", 103, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  HOLON_ENERGY_FF_104 ("Holon Energy FF", 104, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  HOLON_ENERGY_GL_105 ("Holon Energy GL", 105, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  HOLON_ENERGY_WP_106 ("Holon Energy WP", 106, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_107 ("Metal Energy", 107, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  FLAREON_EX_108 ("Flareon ex", 108, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _FIRE_]),
  JOLTEON_EX_109 ("Jolteon ex", 109, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _LIGHTNING_]),
  VAPOREON_EX_110 ("Vaporeon ex", 110, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _WATER_]),
  GROUDON_STAR_111 ("Groudon Star", 111, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  KYOGRE_STAR_112 ("Kyogre Star", 112, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  METAGROSS_STAR_113 ("Metagross Star", 113, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  AZUMARILL_114 ("Azumarill", 114, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  DeltaSpecies(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DELTA_SPECIES;
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
      case BEEDRILL_DELTA_1:
      return evolution (this, from:"Kakuna", hp:HP090, type:[G, M], retreatCost:0) {
        weakness R
        pokePower "Final Sting", {
          text "Once during your turn (before your attack), you may Knock Out Beedrill. If you do, choose 1 of your opponent's Defending Pokémon. That Pokémon is now Paralyzed and Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns. This power can't be used if Beedrill is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            powerUsed()
            def tar = opp.active
            apply PARALYZED, tar, SRC_ABILITY
            apply POISONED, tar, SRC_ABILITY
            targeted (tar, SRC_ABILITY) {
              extraPoison 1
            }
            new Knockout(self).run(bg)
          }
        }
        move "Super Slash", {
          text "50+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 50 damage plus 30 more damage."
          energyCost G, M, C
          onAttack {
            damage 50
            if (defending.evolution) {
              damage 30
            }
          }
        }
      };
      case CROBAT_DELTA_2:
      return evolution (this, from:"Golbat", hp:HP090, type:[G, M], retreatCost:0) {
        weakness P
        move "Radar Jam", {
          text "30 damage. Your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand during your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 30

            delayed {
              before PLAY_TRAINER, {
                if (bg.currentTurn == self.owner.opposite && !ef.cardToPlay.cardTypes.is(SUPPORTER)) {
                  wcu "Radar Jam prevents playing Trainer Cards this turn"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }
        move "Target Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. If that Pokémon already has damage counters on it, this attack does 60 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, M, C
          onAttack {
            def target = opp.all.select("Deal damage to?")
            if (target.numberOfDamageCounters) {
              damage 60, target
            } else {
              damage 40, target
            }
          }
        }
      };
      case DRAGONITE_DELTA_3:
      return evolution (this, from:"Dragonair", hp:HP100, type:[L, M], retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokePower "Delta Charge", {
          text "Once during your turn (before your attack), you may attach a [L] Energy card from your discard pile to 1 of your Benched Pokémon. This power can't be used if Dragonite is affected by a Special Condition."
          actionA {
            checkLastTurn()
            assert my.bench.notEmpty : "Bench is empty"
            checkNoSPC()
            powerUsed()

            attachEnergyFrom(type:L, my.discard, my.bench)
          }
        }
        move "Agility", {
          text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Dragonite during your opponent's next turn."
          energyCost L, C
          onAttack {
            damage 30
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Heavy Impact", {
          text "70 damage."
          energyCost L, M, C, C
          onAttack {
            damage 70
          }
        }
      };
      case ESPEON_DELTA_4:
      return evolution (this, from:"Eevee", hp:HP070, type:[P, M], retreatCost:1) {
        weakness P
        pokePower "Delta Heal", {
          text "Once during your turn (before your attack), you may remove 1 damage counter from each of your Pokémon that has δ on its card. You can't use more than 1 Delta Heal Poké-Power each turn. This power can't be used if Espeon is affected by a Special Condition."
          actionA {
            checkLastTurn()
            assert bg.em().retrieveObject("Delta_Heal") != bg.turnCount : "You cannot use Delta Heal more than once per turn!"
            checkNoSPC()
            bg.em().storeObject("Delta_Heal", bg.turnCount)
            powerUsed()
            my.all.each {
              if (it.topPokemonCard.cardTypes.is(DELTA)) {
                heal 10, it, SRC_ABILITY
              }
            }
          }
        }
        move "Psyshock", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P, M
          onAttack {
            damage 30
            flip { apply PARALYZED }
          }
        }
      };
      case FLAREON_DELTA_5:
      return evolution (this, from:"Eevee", hp:HP070, type:[R, M], retreatCost:1) {
        weakness W
        move "Delta Search", {
          text "10 damage. Search your deck for a Holon Energy card and attach it to Flareon. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            afterDamage {
              if (my.deck){
                my.deck.search(max: 1, "Select a Holon Energy card to attach to $self", {it.cardTypes.is(SPECIAL_ENERGY) && it.name.contains("Holon Energy") }).each {
                  attachEnergy(self, it)
                }
                shuffleDeck()
              }
            }
          }
        }
        move "Return Burn", {
          text "50 damage. You may return an Energy card attached to Flareon to your hand. If you do, the Defending Pokémon is now Burned."
          energyCost M, R, C
          onAttack {
            damage 50

            afterDamage {
              if (confirm("Return an Energy card from $self to your hand?")) {
                self.cards.filterByType(ENERGY).select(count:1).moveTo(my.hand)
                apply BURNED
              }
            }
          }
        }
      };
      case GARDEVOIR_DELTA_6:
      return evolution (this, from:"Kirlia", hp:HP100, type:[P, M], retreatCost:2) {
        weakness P
        pokePower "Energy Jump", {
          text "Once during your turn (before your attack), you may move an Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Gardevoir is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.bench : "No benched Pokemon"
            assert my.all.findAll { it.cards.filterByType(ENERGY) } : "No Energy Cards attached to your Pokemon"
            powerUsed()

            def source = my.all.findAll { it.cards.filterByType(ENERGY) }.select("Choose a Pokemon to move an Energy from")
            def target = my.all.findAll{it != source}.select("Select a Pokemon to move the Energy to")

            moveEnergy(source, target)
          }
        }
        move "Psychic Rage", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each damage counter on Gardevoir to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M, C
          onAttack {
            damage 10*self.numberOfDamageCounters, opp.all.select("Deal damage to?")
          }
        }
        move "Black Magic", {
          text "10+ damage. Does 10 damage plus 20 more damage times the number of your opponent's Benched Pokémon."
          energyCost P, C, C
          onAttack {
            damage 10+20*opp.bench.size()
          }
        }
      };
      case JOLTEON_DELTA_7:
      return evolution (this, from:"Eevee", hp:HP070, type:[L, M], retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Delta Search", {
          text "10 damage. Search your deck for a Holon Energy card and attach it to Jolteon. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            afterDamage {
              if (my.deck){
                my.deck.search(max: 1, "Select a Holon Energy card to attach to $self", {it.cardTypes.is(SPECIAL_ENERGY) && it.name.contains("Holon Energy") }).each {
                  attachEnergy(self, it)
                }
                shuffleDeck()
              }
            }
          }
        }
        move "Return Spark", {
          text "50 damage. You may return an Energy card attached to Jolteon to your hand. If you do, this attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, M, C
          onAttack {
            damage 50

            if (confirm("Return an Energy card from $self to your hand?")) {
              self.cards.filterByType(ENERGY).select(count:1).moveTo(my.hand)

              if (opp.bench) {
                damage 20, opp.bench.select("Deal 20 damage to which Benched Pokemon?")
              }
            }
          }
        }
      };
      case LATIAS_DELTA_8:
      return basic (this, hp:HP070, type:[L, M], retreatCost:1) {
        weakness C
        resistance P, MINUS30
        resistance F, MINUS30
        pokeBody "Delta Aura", {
          text "If you have Latios or Latios ex in play, the attack cost of Latias's Extra Crush is now [L][M][C]."
          getterA GET_MOVE_LIST, self, {h->
            if (my.all.find{it.name == "Latios" || it.name == "Latios ex"}) {
              def list=[]
              for (move in h.object) {
                def copy=move.shallowCopy()
                if (copy.name == "Extra Crush") {
                  copy.energyCost.retainAll()
                  copy.energyCost.addAll([L, M, C])
                }
                list.add(copy)
              }
              h.object=list
            }
          }
        }
        move "Spiral Drain", {
          text "20 damage. Remove 2 damage counters from Latias."
          energyCost M, C
          onAttack {
            damage 20
            heal 20, self
          }
        }
        move "Extra Crush", {
          text "80 damage. If your opponent has no Pokémon-ex in play, this attack does nothing."
          energyCost L, M, C, C, C
          onAttack {
            if (opp.all.any{ it.EX }) {
              damage 80
            }
          }
        }
      };
      case LATIOS_DELTA_9:
      return basic (this, hp:HP080, type:[L, M], retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        pokeBody "Delta Aura", {
          text "If you have Latias or Latias ex in play, the attack cost of Latios's Psychic Force is now [L][M][C]."
          getterA GET_MOVE_LIST, self, {h->
            if (my.all.find{it.name == "Latias" || it.name == "Latias ex"}) {
              def list=[]
              for (move in h.object) {
                def copy=move.shallowCopy()
                if (copy.name == "Psychic Force") {
                  copy.energyCost.retainAll()
                  copy.energyCost.addAll([L, M, C])
                }
                list.add(copy)
              }
              h.object=list
            }
          }
        }
        move "Dragon Claw", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Psychic Force", {
          text "80 damage. If your opponent has no Stage 2 Evolved Pokémon in play, this attack does nothing."
          energyCost L, M, C, C, C
          onAttack {
            if (opp.all.any{ it.topPokemonCard.cardTypes.is(STAGE2) }) {
              damage 80
            }
          }
        }
      };
      case MAROWAK_DELTA_10:
      return evolution (this, from:"Cubone", hp:HP080, type:[F, M], retreatCost:1) {
        weakness G
        move "Energy Bone", {
          text "Choose a number of your opponent's Pokémon up to the amount of Energy attached to Marowak. This attack does 20 damage to each of them."
          energyCost F, M
          onAttack {
            def maximum = Math.min(self.cards.energyCount(C), opp.all.size())
            multiSelect(opp.all, maximum).each {
              damage 20, it
            }
          }
        }
        move "Metal Crusher", {
          text "50 damage. If the Defending Pokémon is [M] Pokémon, this attack's base damage is 90."
          energyCost F, C, C
          onAttack {
            if (defending.types.contains(M)) {
              damage 90
            } else {
              damage 50
            }
          }
        }
      };
      case METAGROSS_DELTA_11:
      return evolution (this, from:"Metang", hp:HP100, type:[L, M], retreatCost:3) {
        weakness R
        resistance G, MINUS30
        pokePower "Delta Control", {
          text "Once during your turn (before your attack), you may look at the top 4 cards of your deck, choose 1 of them, and put it into your hand. Put the 3 other cards on the bottom of your deck in any order. This power can't be used if Metagross is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()

            my.deck.subList(0,4).select("Choose the card to put in your hand").moveTo(hidden:true, my.hand)

            def rearrangedCards = rearrange(my.deck.subList(0, 3))
            rearrangedCards.moveTo(hidden:true, my.deck)
          }
        }
        move "Crush and Burn", {
          text "30+ damage. You may discard as many Energy cards as you like attached to your Pokémon in play. If you do, this attack does 30 damage plus 20 more damage for each Energy card you discarded."
          energyCost L, M
          onAttack {
            def count=0
            def toBeDiscarded = new CardList()
            while(true) {
              def pl = my.all.findAll{
                it.cards.filterByType(ENERGY).any{enCard -> !toBeDiscarded.contains(enCard)}
              }
              if(!pl) break;

              def info = "Energy cards already marked for discard: ${count}\nCurrent base damage: 30 + ${20 * count}\nDiscard an Energy card from which Pokémon? (cancel to stop)"
              def src = pl.select(info, false)
              if(!src) break;

              def selection = src.cards.filterByType(ENERGY).select("Card to discard")
              toBeDiscarded.addAll(selection)
              count++
            }
            damage 30+20*count
            afterDamage { toBeDiscarded.discard() }
          }
        }
      };
      case MEWTWO_DELTA_12:
      return basic (this, hp:HP070, type:[R, M], retreatCost:1) {
        weakness P
        pokePower "Delta Switch", {
          text "Once during your turn, when you put Mewtwo from your hand onto your Bench, you may move any number of basic Energy cards attached to your Pokémon to your other Pokémon (excluding Mewtwo) in any way you like."
          onActivate {
            if (it == PLAY_FROM_HAND && confirm("Use Delta Switch?")) {
              while (1) {
                def pl = (my.all.findAll {it.cards.filterByType(BASIC_ENERGY)})
                if(!pl) break;
                def src = pl.select("Source for energy (cancel to stop)", false)
                if(!src) break;
                def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()
                def target = my.all.findAll{ it != src && it != self }.select("Move Energy to?")
                energySwitch(src, target, card)
              }
            }
          }
        }
        move "Energy Burst", {
          text "10x damage. Does 10 damage times the total amount of Energy attached to Mewtwo and the Defending Pokémon."
          energyCost R, M
          onAttack {
            damage 10*(self.cards.energyCount(C) + opp.active.cards.energyCount(C))
          }
        }
      };
      case RAYQUAZA_DELTA_13:
      return basic (this, hp:HP090, type:[L, M], retreatCost:3) {
        weakness C
        resistance W, MINUS30
        resistance F, MINUS30
        pokeBody "Delta Guard", {
          text "As long as Rayquaza has any Holon Energy cards attached to it, ignore the effect of Rayquaza's Lightning Storm attack."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (ef.attacker == self && self.cards.any{ it.name.contains("Holon Energy") }) {
                if (ef.move.name == "Lightning Storm") {
                  bg.em().storeObject("Lightning_Storm", bg.turnCount)
                }
              }
            }
          }
        }
        move "Power Blow", {
          text "10x damage. Does 10 damage times the amount of Energy attached to Rayquaza."
          energyCost L
          onAttack {
            damage 10*self.cards.energyCount(C)
          }
        }
        move "Lightning Storm", {
          text "70 damage. Put 7 damage counters on Rayquaza."
          energyCost L, M, C, C
          onAttack {
            damage 70
            if (bg.em().retrieveObject("Lightning_Storm") != bg.turnCount) {
              directDamage 70, self
            } else {
              bc "Rayquaza Delta has a Holon Energy attached and will not take self damage from Lightning Storm"
            }
          }
        }
      };
      case SALAMENCE_DELTA_14:
      return evolution (this, from:"Shelgon", hp:HP110, type:[R, M], retreatCost:1) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        move "Fire Dance", {
          text "30 damage. Search your discard pile for a [R] Energy card and attach it to 1 of your Pokémon."
          energyCost R, C
          onAttack {
            damage 30
            afterDamage {
              attachEnergyFrom(type: R, my.discard, my.all)
            }
          }
        }
        move "Delta Blast", {
          text "100 damage. Discard a [M] Energy card attached to Salamence."
          energyCost R, M, C, C
          onAttack {
            damage 100
            afterDamage {
              discardSelfEnergy(M)
            }
          }
        }
      };
      case STARMIE_DELTA_15:
      return evolution (this, from:"Staryu", hp:HP060, type:[W, M], retreatCost:0) {
        weakness L
        pokePower "Metal Navigation", {
          text "Once during your turn (before your attack), you may search your deck for a [M] Energy card and attach it to Starmie. Shuffle your deck afterward. This power can't be used if Starmie is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.deck : "Deck is empty"
            powerUsed()
            attachEnergyFrom(type: M, my.deck, self)
          }
        }
        move "Collect", {
          text "Draw 3 cards."
          energyCost W
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            draw 3
          }
        }
        move "Energy Loop", {
          text "30 damage. Return an Energy card attached to Starmie to your hand."
          energyCost M
          onAttack {
            damage 30
            afterDamage {
              self.cards.filterByType(ENERGY).select(count:1).moveTo(my.hand)
            }
          }
        }
      };
      case TYRANITAR_DELTA_16:
      return evolution (this, from:"Pupitar", hp:HP120, type:[R, M], retreatCost:2) {
        weakness G
        pokePower "Crush Draw", {
          text "Once during your turn (before your attack), you may reveal the top card of your deck. If that card is a basic Energy card, attach it to 1 of your Pokémon. If not, put the card back on top of your deck. This power can't be used if Tyranitar is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()

            my.deck.subList(0,1).showToMe("Top card of your deck").showToOpponent("Top card of your opponent's deck")
            if (my.deck.subList(0,1).filterByType(BASIC_ENERGY)) {
              attachEnergyFrom(my.deck.subList(0,1), my.all)
            } else {
              bc "Top card was not a Basic Energy card, it's put back where it was."
            }
          }
        }
        move "Delta Crush", {
          text "50+ damage. You may discard an Energy card attached to Tyranitar. If you do, this attack does 50 damage plus 20 more damage."
          energyCost R, M, C
          onAttack {
            damage 50

            if (confirm("Discard an Energy card from $self to deal 20 more damage?")) {
              def tar = self.cards.filterByType(ENERGY).select(count:1)
              damage 20

              afterDamage {
                tar.discard()
              }
            }
          }
        }
      };
      case UMBREON_DELTA_17:
      return evolution (this, from:"Eevee", hp:HP070, type:[D, M], retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Delta Moon", {
          text "When your opponent attaches a Special Energy card from his or her hand to 1 of his or her Pokémon, put 1 damage counter on that Pokémon. You can't use more than 1 Delta Moon Poké-Body each turn."
          delayedA {
            after ATTACH_ENERGY, {
              if (ef.reason == PLAY_FROM_HAND && ef.card.cardTypes.is(SPECIAL_ENERGY) && ef.resolvedTarget.owner == self.owner.opposite && bg.em().retrieveObject("Delta_Moon") != bg.turnCount) {
                directDamage 10, ef.resolvedTarget
                bc "Delta Moon activates"
                bg.em().storeObject("Delta_Moon", bg.turnCount)
              }
            }
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost D, M
          onAttack {
            swiftDamage(30, opp.all.select())
          }
        }
      };
      case VAPOREON_DELTA_18:
      return evolution (this, from:"Eevee", hp:HP070, type:[W, M], retreatCost:1) {
        weakness L
        move "Delta Search", {
          text "10 damage. Search your deck for a Holon Energy card and attach it to Vaporeon. Shuffle your deck afterward."
          energyCost C
          onAttack {
            damage 10

            afterDamage {
              my.deck.search(max: 1, "Select a Holon Energy card to attach to Vaporeon", {it.cardTypes.is(SPECIAL_ENERGY) && it.name.contains("Holon Energy") }).each {
                attachEnergy(self, it)
              }
              shuffleDeck()
            }
          }
        }
        move "Return Wave", {
          text "50 damage. You may return an Energy card attached to Vaporeon to your hand. If you do, choose an Energy card attached to the Defending Pokémon and return it to your opponent's hand."
          energyCost W, M, C
          onAttack {
            damage 50

            afterDamage {
              if (confirm("Return an Energy card from $self to your hand in order to use the additional effect of 'Return Wave'?")) {

                self.cards.filterByType(ENERGY).select(count:1).moveTo(my.hand)
                //TODO: Add a check for the energy not being here anymore (Scoop-Up Block)
                defending.cards.filterByType(ENERGY).select(count:1).moveTo(opp.hand)
              }
            }
          }
        }
      };
      case AZUMARILL_DELTA_19:
      return evolution (this, from:"Marill", hp:HP080, type:[W, M], retreatCost:2) {
        weakness L
        move "Bubblebeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
            flip { applyAfterDamage PARALYZED }
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
      case AZURILL_20:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokePower "Baby Evolution", {
          text "Once during your turn (before your attack), you may put Marill from your hand onto Azurill (this counts as evolving Azurill) and remove all damage counters from Azurill."
          actionA {
            checkCanBabyEvolve("Marill", self)
            checkLastTurn()
            powerUsed()
            babyEvolution("Marill", self)
          }
        }
        move "Type Match", {
          text "Choose a basic Energy card in your hand and show it to your opponent. Then, search your deck for a Basic Pokémon or Evolution card of that Energy type, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck: "Deck is empty"
            assert my.hand.filterByType(BASIC_ENERGY) : "No Basic Energy in hand"
          }
          onAttack {
            def chosenEnergy = my.hand.filterByType(BASIC_ENERGY).select(count: 1, "Select a Basic Energy card to search for a Pokemon of that Energy type.")
            chosenEnergy.showToOpponent("Your opponent has chosen this basic Energy card. They'll now search their deck for a Pokémon of that Energy type.")
            def cardType = chosenEnergy.basicType
            def sel = my.deck.search(max: 1, "search for a [${cardType}] Basic Pokémon or Evolution card", {
              it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(cardType.get(0))
            })
            if (sel) {
              sel.showToOpponent("Your opponent has chosen this Pokémon card.")
              sel.moveTo(my.hand)
            }
            shuffleDeck()
          }
        }
      };
      case HOLON_S_ELECTRODE_21:
      return evolution (this, from:"Holon's Voltorb", hp:HP070, type:L, retreatCost:0) {
        weakness F
        globalAbility {Card thisCard->
          delayed {
            before PLAY_CARD, {
              def validPokemon = thisCard.player.pbg.all.findAll {it.cards.energyCount()}
              if(ef.cardToPlay == thisCard){
                if(choose([1,2], ["Pokémon", "Energy"], "Play this card as a Pokémon or as an energy?") == 2){
                  if(bg.em().retrieveObject("Holon_Pokemon_Energy") != bg.turnCount){
                    if(validPokemon){
                      def pcs = validPokemon.select("Attach to?")
                      bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)

                      // Return an energy back to the hand
                      pcs.cards.filterByType(ENERGY).select(count:1).moveTo(thisCard.player.pbg.hand)

                      def pkmnCard = thisCard
                      def energyCard
                      energyCard = specialEnergy(new CustomCardInfo(HOLON_S_ELECTRODE_21).setCardTypes(ENERGY, SPECIAL_ENERGY), [[R, D, F, G, W, Y, L, M, P],[R, D, F, G, W, Y, L, M, P]]) {
                        typeImagesOverride = [RAINBOW,RAINBOW]
                        onPlay {}
                        onRemoveFromPlay {
                          bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                        }
                      }
                      energyCard.player = thisCard.player
                      bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
                      attachEnergy(pcs, energyCard)
                      bc "$energyCard is now a Special Energy Card"
                      prevent()
                    } else {
                      prevent()
                      wcu "You have no energy attached to your Pokemon"
                    }
                  } else {
                    prevent()
                    wcu "You have already played an Energy"
                  }
                }
              } //If the user chooses Pokémon, play the card normally
            }
            before PLAY_ENERGY, {
              if(bg.em().retrieveObject("Holon_Pokemon_Energy") == bg.turnCount){
                wcu "Cannot play any more energy this turn."
                prevent()
              }
            }
            after ATTACH_ENERGY, {
              if(ef.reason==PLAY_FROM_HAND){
                bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
              }
            }
          }
        }
        move "Dazzle Blast", {
          text "30 damage. The Defending Pokémon is now Confused."
          energyCost L, C
          onAttack {
            damage 30
            applyAfterDamage CONFUSED
          }
        }
      };
      case HOLON_S_MAGNETON_22:
      return evolution (this, from:"Holon's Magnemite", hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        globalAbility {Card thisCard->
          delayed {
            before PLAY_CARD, {
              def validPokemon = thisCard.player.pbg.all.findAll {it.cards.energyCount()}
              if(ef.cardToPlay == thisCard){
                if(choose([1,2], ["Pokémon", "Energy"], "Play this card as a Pokémon or as an energy?") == 2){
                  if(bg.em().retrieveObject("Holon_Pokemon_Energy") != bg.turnCount){
                    if(validPokemon){
                      def pcs = validPokemon.select("Attach to?")
                      bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)

                      // Return an energy back to the hand
                      pcs.cards.filterByType(ENERGY).select(count:1).moveTo(thisCard.player.pbg.hand)

                      def pkmnCard = thisCard
                      def energyCard
                      energyCard = specialEnergy(new CustomCardInfo(HOLON_S_MAGNETON_22).setCardTypes(ENERGY, SPECIAL_ENERGY), [[R, D, F, G, W, Y, L, M, P],[R, D, F, G, W, Y, L, M, P]]) {
                        typeImagesOverride = [RAINBOW,RAINBOW]
                        onPlay {}
                        onRemoveFromPlay {
                          bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                        }
                      }
                      energyCard.player = thisCard.player
                      bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
                      attachEnergy(pcs, energyCard)
                      bc "$energyCard is now a Special Energy Card"
                      prevent()
                    } else {
                      prevent()
                      wcu "You have no energy attached to your Pokemon"
                    }
                  } else {
                    prevent()
                    wcu "You have already played an Energy"
                  }
                }
              } //If the user chooses Pokémon, play the card normally
            }
            before PLAY_ENERGY, {
              if(bg.em().retrieveObject("Holon_Pokemon_Energy") == bg.turnCount){
                wcu "Cannot play any more energy this turn."
                prevent()
              }
            }
            after ATTACH_ENERGY, {
              if(ef.reason==PLAY_FROM_HAND){
                bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
              }
            }
          }
        }
        move "Extra Ball", {
          text "30+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 30 damage plus 20 more damage."
          energyCost M, C
          onAttack {
            damage 30
            if (defending.EX) {
              damage 20
            }
          }
        }
      };
      case HYPNO_23:
      return evolution (this, from:"Drowzee", hp:HP070, type:P, retreatCost:1) {
        weakness P
        pokeBody "Binding Aura", {
          text "Your opponent can't play any Basic Pokémon or Evolution cards from his or her hand to evolve an Asleep Pokémon and can't attach any Energy cards from his or her hand to an Asleep Pokémon."
          delayedA {
            before EVOLVE_STANDARD, {
              if (bg.currentTurn == self.owner.opposite && ef.pokemonToBeEvolved.isSPC(ASLEEP)) {
                wcu "Binding Aura prevents you from evolving an Asleep Pokemon"
                prevent()
              }
            }
            before ATTACH_ENERGY, {
              def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
              if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner.opposite && pcs.isSPC(ASLEEP)) {
                wcu "Binding Aura prevents you from attaching energies to an Asleep Pokemon"
                prevent()
              }
            }
          }
        }
        move "Sleep Inducer", {
          text "Switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement{
            assert opp.bench : "There is no Pokémon on your opponent's bench"
          }
          onAttack {
            sw defending, opp.bench.select()
            applyAfterDamage(ASLEEP)
          }
        }
        move "Psyshot", {
          text "40 damage."
          energyCost P, C
          onAttack {
            damage 40
          }
        }
      };
      case MIGHTYENA_DELTA_24:
      return evolution (this, from:"Poochyena", hp:HP070, type:[D, M], retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Delta Fang", {
          text "20 damage. If the Defending Pokémon is Pokémon-ex, that Pokémon can't attack during your opponent's next turn."
          energyCost D, C
          onAttack {
            damage 20
            if (defending.EX) {
              cantAttackNextTurn(defending)
            }
          }
        }
        move "Gang Up", {
          text "10x damage. Does 10 damage times the number of [D] Pokémon and [M] Pokémon you have in play."
          energyCost M, C
          onAttack {
            damage 10*my.all.findAll { it.types.contains(D) || it.types.contains(M) }.size()
          }
        }
      };
      case PORYGON2_25:
      return evolution (this, from:"Porygon", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "Backup", {
          text "Once during your turn (before your attack), if you have less than 6 cards in your hand, you may draw cards until you have 6 cards in your hand. This power can't be used if Porygon2 is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert deck : "Deck is empty"
            assert hand.size() < 6 : "Hand is not less than 6 cards"
            powerUsed()
            draw 6-hand.size()
          }
        }
        move "Machine Burst", {
          text "30 damage. If Porygon2 has a Technical Machine card attached to it, the Defending Pokémon is now Asleep and Burned."
          energyCost C, C
          onAttack {
            damage 30
            if (self.cards.filterByType(TECHNICAL_MACHINE)) {
              apply ASLEEP
              apply BURNED
            }
          }
        }
      };
      case RAIN_CASTFORM_26:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Sunny Castform, or Snow-cloud Castform and switch it with Rain Castform. (Any cards attached to Rain Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Rain Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Temperamental_Weather") != bg.turnCount : "You can’t use more than 1 Temperamental Weather Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Temperamental_Weather",bg.turnCount)
            powerUsed()

            def oldCastform = self.topPokemonCard
            def newCastform = my.deck.search(min:0, max: 1, {
              it.name == "Sunny Castform" ||
              it.name == "Castform" ||
              it.name == "Snow-cloud Castform"
            })

            if (newCastform) {
              newCastform.moveTo(self.cards)
              my.deck.add(oldCastform)
              self.cards.remove(oldCastform)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Holon Splash", {
          text "30+ damage. Does 30 damage plus 10 more damage for each Holon Energy card attached to Rain Castform."
          energyCost C, C, C
          onAttack {
            damage 30+10*self.cards.findAll {it.name.contains("Holon Energy")}.size()
          }
        }
      };
      case SANDSLASH_DELTA_27:
      return evolution (this, from:"Sandshrew", hp:HP080, type:[F, M], retreatCost:1) {
        weakness G
        pokeBody "Delta Storm", {
          text "As long as Sandslash is your Active Pokémon, put 1 damage counter on each of your opponent's Pokémon-ex between turns."
          delayedA {
            before BEGIN_TURN, {
              boolean flag = true
              all.each {
                if (self.active && it.owner != self.owner && it.EX) {
                  if (flag) {
                    bc "Delta Storm activates"; flag = false
                  }
                  directDamage 10, it, SRC_ABILITY
                }
              }
            }
          }
        }
        move "Rend", {
          text "20+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 20 damage plus 20 more damage."
          energyCost F, C
          onAttack {
            damage 20
            if (defending.numberOfDamageCounters) {
              damage 20
            }
          }
        }
        move "Slash", {
          text "50 damage."
          energyCost M, C, C
          onAttack {
            damage 50
          }
        }
      };
      case SLOWKING_28:
      return evolution (this, from:"Slowpoke", hp:HP080, type:W, retreatCost:1) {
        weakness L
        pokePower "Prize Shift", {
          text "Once during your turn (before your attack), you may choose a card from your hand and put it as a Prize card face up. If you do, choose 1 of your face-down Prize cards without looking and put it into your hand. This power can't be used if Slowking is affected by a Special Condition or if all of your Prize cards are face up."
          actionA {
            checkNoSPC()
            assert !my.prizeCardSet.allVisible : "All prizes are face up"
            assert my.hand : "You don't have cards in your hand"
            checkLastTurn()
            powerUsed()

            def newPrize = my.hand.select(hidden: false, "Card to put into Prizes").first()

            def tar = my.prizeCardSet.faceDownCards.select(hidden: true, "Choose a Prize card to replace with one in your hand.").first()
            my.hand.add(tar)

            def indexOfOldPrize = my.prizeCardSet.indexOf(tar)
            my.prizeCardSet.set(indexOfOldPrize, newPrize)
            my.prizeCardSet.setVisible(newPrize, true)
            my.hand.remove(newPrize)
          }
        }
        move "Psychic Option", {
          text "20+ damage. If Slowking has a [W] Energy card attached to it, this attack does 20 damage plus 20 more damage. If Slowking has a [P] Energy card attached to it, discard a Special Energy card attached to the Defending Pokémon, if any."
          energyCost C, C
          onAttack {
            damage 20
            if (self.cards.filterByEnergyType(W)) { damage 20 }
            if (self.cards.filterByEnergyType(P)) { discardDefendingSpecialEnergy(delegate) }
          }
        }
      };
      case SNOW_CLOUD_CASTFORM_29:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness M
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Sunny Castform and switch it with Snow-cloud Castform. (Any cards attached to Snow-cloud Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Snow-cloud Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Temperamental_Weather") != bg.turnCount : "You can’t use more than 1 Temperamental Weather Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Temperamental_Weather",bg.turnCount)
            powerUsed()

            def oldCastform = self.topPokemonCard
            def newCastform = my.deck.search(min:0, max: 1, {
              it.name == "Sunny Castform" ||
              it.name == "Rain Castform" ||
              it.name == "Castform"
            })

            if (newCastform) {
              newCastform.moveTo(self.cards)
              my.deck.add(oldCastform)
              self.cards.remove(oldCastform)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Holon Blizzard", {
          text "20 damage. If Snow-cloud Castform has any Holon Energy cards attached to it, this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          onAttack {
            damage 20

            if (self.cards.findAll { it.name.contains("Holon Energy") }) {
              opp.bench.each {
                damage 10, it
              }
            }
          }
        }
      };
      case STARMIE_DELTA_30:
      return evolution (this, from:"Staryu", hp:HP070, type:[W, M], retreatCost:1) {
        weakness L
        move "Surf", {
          text "20 damage."
          energyCost W
          onAttack {
            damage 20
          }
        }
        move "Swift", {
          text "50 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost C, C, C
          onAttack {
            swiftDamage(50, defending)
          }
        }
      };
      case SUNNY_CASTFORM_31:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Castform, Rain Castform, or Snow-cloud Castform and switch it with Sunny Castform. (Any cards attached to Sunny Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Sunny Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Temperamental_Weather") != bg.turnCount : "You can’t use more than 1 Temperamental Weather Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Temperamental_Weather",bg.turnCount)
            powerUsed()

            def oldCastform = self.topPokemonCard
            def newCastform = my.deck.search(min:0, max: 1, {
              it.name == "Castform" ||
              it.name == "Rain Castform" ||
              it.name == "Snow-cloud Castform"
            })

            if (newCastform) {
              newCastform.moveTo(self.cards)
              my.deck.add(oldCastform)
              self.cards.remove(oldCastform)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Holon Search", {
          text "Search your deck for a Holon Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
          energyCost C, C
          attackRequirement {
            assert my.deck: "Deck is empty"
          }
          onAttack {
            def toAttach = my.deck.search(max: 1, "Select a Special Energy card", {
              it.cardTypes.is(SPECIAL_ENERGY) && it.name.contains("Holon Energy")
            })
            attachEnergy(my.all.select("Attach to"), toAttach)
          }
        }
      };
      case SWELLOW_32:
      return evolution (this, from:"Taillow", hp:HP070, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Steep Dive", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Swellow during your opponent's next turn. If tails, during your next turn, Swellow's Glide attack's base damage is 100."
          energyCost C
          onAttack {
            flip 1, {
              preventAllEffectsNextTurn()
            }, {
              increasedBaseDamageNextTurn("Glide", hp(60))
            }
          }
        }
        move "Glide", {
          text "40 damage."
          energyCost C, C, C
          onAttack {
            damage 40
          }
        }
      };
      case WEEZING_33:
      return evolution (this, from:"Koffing", hp:HP070, type:G, retreatCost:2) {
        weakness P
        pokeBody "Body Odor", {
          text "As long as Weezing is the Active Pokémon, put 1 damage counter on each of your opponent's Pokémon that has any Poké-Bodies between turns."
          delayedA {
            before BEGIN_TURN, {
              if (self.active) {
                def once = true
                def hasPokeBody = false

                self.owner.opposite.pbg.all.each {
                  for (Ability ability : it.getAbilities().keySet()) {
                    if (ability instanceof PokeBody) hasPokeBody = true;
                  }
                  if (once) {
                    bc "Body Odor Activates"
                    once = false
                  }
                  if (hasPokeBody) {
                    directDamage(10, it, SRC_ABILITY)
                    hasPokeBody = false
                  }
                }
              }
            }
          }
        }
        move "Mist Attack", {
          text "Does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G
          onAttack {
            opp.all.each {
              damage 10, it
            }
          }
        }
        move "Sludge Whirlpool", {
          text "50 damage."
          energyCost G, C, C
          onAttack {
            damage 50
          }
        }
      };
      case CASTFORM_34:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokePower "Temperamental Weather", {
          text "Once during your turn (before your attack), you may search your deck for Sunny Castform, Rain Castform, or Snow-cloud Castform and switch it with Castform. (Any cards attached to Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform back into your deck. You can't use more than 1 Temperamental Weather Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Temperamental_Weather") != bg.turnCount : "You can’t use more than 1 Temperamental Weather Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Temperamental_Weather",bg.turnCount)
            powerUsed()

            def oldCastform = self.topPokemonCard
            def newCastform = my.deck.search(min:0, max: 1, {
              it.name == "Sunny Castform" ||
              it.name == "Rain Castform" ||
              it.name == "Snow-cloud Castform"
            })

            if (newCastform) {
              newCastform.moveTo(self.cards)
              my.deck.add(oldCastform)
              self.cards.remove(oldCastform)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Holon Draw", {
          text "Draw a card. If Castform has any Holon Energy cards attached to it, draw 2 more cards."
          energyCost C
          attackRequirement { assert my.deck : "Deck is empty" }
          onAttack {
            draw 1
            if ( self.cards.any{it.name.contains("Holon Energy")} ) {
              draw 2
            }
          }
        }
      };
      case DITTO_35:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Energy Link", {
          text "10 damage. Search your discard pile for an Energy card and attach it to Ditto."
          energyCost C
          onAttack {
            damage 10

            afterDamage {
              attachEnergyFrom(my.discard, self)
            }
          }
        }
      };
      case DITTO_36:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
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
      case DITTO_37:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Ditto."
          energyCost C, C
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
      };
      case DITTO_38:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Ditto doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Ditto performs that attack."
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
      };
      case DITTO_39:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Thunderbolt", {
          text "40 damage. Discard all Energy cards attached to Ditto."
          energyCost L, C
          onAttack {
            damage 40
            discardAllSelfEnergy(null)
          }
        }
      };
      case DITTO_40:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
         actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Smash Turn", {
          text "20 damage. After your attack, you may switch Ditto with 1 of your Benched Pokémon."
          energyCost W, C
          onAttack {
            damage 20
            switchYourActive(may: true)
          }
        }
      };
      case DRAGONAIR_DELTA_41:
      return evolution (this, from:"Dratini", hp:HP070, type:L, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Slam", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          onAttack {
            flip 2, {damage 20}
          }
        }
        move "Dragon Rage", {
          text "40 damage."
          energyCost L, C, C
          onAttack {
            damage 40
          }
        }
      };
      case DRAGONAIR_DELTA_42:
      return evolution (this, from:"Dratini", hp:HP070, type:L, retreatCost:2) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Twister", {
          text "20 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
          energyCost L, C
          onAttack {
            def discardTimes = 0

            flip 2, { discardTimes += 1}
            if (discardTimes) damage 20 else bc "$thisMove failed due to 2 TAILS."

            afterDamage {
              discardTimes.times{ discardDefendingEnergy() }
            }
          }
        }
      };
      case GOLBAT_43:
      return evolution (this, from:"Zubat", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Super Poison Breath", {
          text "Each Defending Pokémon is now Poisoned."
          energyCost G
          onAttack {
            apply POISONED
          }
        }
        move "Sonic Signal", {
          text "Choose 2 of your opponent's Pokémon. This attack does 10 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          onAttack {
            multiSelect(opp.all, 2).each {
              targeted(it) {
                damage 10, it
              }
            }
          }
        }
      };
      case HARIYAMA_44:
      return evolution (this, from:"Makuhita", hp:HP080, type:F, retreatCost:1) {
        weakness P
        pokeBody "Reversal Aura", {
          text "As long as you have more Prize cards left than your opponent, each of Hariyama's attacks does 20 more damage to the Active Pokémon (before applying Weakness and Resistance) and damage done by the Active Pokémon to Hariyama is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (my.prizeCardSet.size() > opp.prizeCardSet.size()) {
                bg.dm().each {
                  if (it.from == self && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Reversal Aura +20"
                    it.dmg += hp(20)
                  }
                }
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if (my.prizeCardSet.size() > opp.prizeCardSet.size()) {
                bg.dm().each {
                  if (it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "Reversal Aura -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
        }
        move "Slap Push", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
        move "Brick Smash", {
          text "50 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost R, R, C
          onAttack {
            noResistanceOrAnyEffectDamage(50, defending)
          }
        }
      };
      case ILLUMISE_45:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Beacon Protection", {
          text "As long as you have Volbeat in play, prevent all effects, including damage, done to Illumise by attacks from your opponent's Pokémon that has Dark in its name."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (self.owner.pbg.all.find{it.name == "Volbeat"}) {
                bg.dm().each {
                  if (it.to == self && it.from.topPokemonCard.name.contains("Dark ") && it.notNoEffect && it.dmg.value) {
                    bc "Beacon Protection prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
            before null, self, Source.ATTACK, {
              if (self.owner.pbg.all.find{it.name == "Volbeat"} && self.owner.opposite.pbg.active.name.contains("Dark ") && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                bc "Beacon Protection prevents effect"
                prevent()
              }
            }
          }
        }
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic:true, 1, delegate)
        }
        move "Strange Rasping", {
          text "20 damage. If the Defending Pokémon is an Evolved Pokémon, the Defending Pokémon is now Confused."
          energyCost G, C
          onAttack {
            damage 20
            if (defending.evolution) { applyAfterDamage CONFUSED }
          }
        }
      };
      case KAKUNA_46:
      return evolution (this, from:"Weedle", hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Fast Evolution", {
          text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost G
          attackRequirement{
            assert my.deck : "Deck is empty"
          }
          onAttack{
            my.deck.search(max: 1, "Choose an Evolution card", cardTypeFilter(EVOLUTION)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Rollout", {
          text "30 damage."
          energyCost C, C, C
          onAttack {
            damage 30
          }
        }
      };
      case KIRLIA_47:
      return evolution (this, from:"Ralts", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Calm Mind", {
          text "Remove 3 damage counters from Kirlia."
          energyCost C
          onAttack {
            heal 30, self
          }
        }
        move "Psychic Boom", {
          text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
          energyCost P, C
          onAttack {
            damage 20+10*opp.active.cards.energyCount()
          }
        }
      };
      case MAGNETON_48:
      return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Supersonic", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L, C
          onAttack {
            damage 20
            flip { apply CONFUSED }
          }
        }
        move "Speed Ball", {
          text "50 damage."
          energyCost L, C, C
          onAttack {
            damage 50
          }
        }
      };
      case METANG_DELTA_49:
      return evolution (this, from:"Beldum", hp:HP080, type:L, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Sharp Claws", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost C, C
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
        move "Magnetic Blast", {
          text "50 damage."
          energyCost L, C, C
          onAttack {
            damage 50
          }
        }
      };
      case PERSIAN_50:
      return evolution (this, from:"Meowth", hp:HP080, type:C, retreatCost:1) {
        weakness F
        pokePower "Prowl", {
          text "Once during your turn, when you play Persian from your hand to evolve 1 of your Pokémon, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
          onActivate {r->
            if (r==PLAY_FROM_HAND && my.deck && confirm("Use Prowl?")) {
              powerUsed()
              my.deck.select(count:1).moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
        }
        move "Snap Tail", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          onAttack {
            damage 30, opp.all.select()
          }
        }
      };
      case PUPITAR_DELTA_51:
      return evolution (this, from:"Larvitar", hp:HP070, type:R, retreatCost:0) {
        weakness G
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Double-edge", {
          text "40 damage. Pupitar does 10 damage to itself."
          energyCost R, C, C
          onAttack {
            damage 40
            damage 10, self
          }
        }
      };
      case RAPIDASH_52:
      return evolution (this, from:"Ponyta", hp:HP070, type:R, retreatCost:0) {
        weakness W
        move "Super Singe", {
          text "The Defending Pokémon is now Burned."
          energyCost R
          onAttack {
            apply BURNED
          }
        }
        move "Stomp", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
          energyCost R, C
          onAttack {
            damage 30
            flip { damage 10 }
          }
        }
      };
      case SHELGON_DELTA_53:
      return evolution (this, from:"Bagon", hp:HP080, type:R, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        move "Tight Jaw", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost R
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Combustion", {
          text "40 damage."
          energyCost R, C, C
          onAttack {
            damage 40
          }
        }
      };
      case SHELGON_DELTA_54:
      return evolution (this, from:"Bagon", hp:HP070, type:R, retreatCost:2) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        pokeBody "Exoskeleton", {
          text "Any damage done to Shelgon by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  bc "Exoskeleton -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Heat Blast", {
          text "30 damage."
          energyCost R, C
          onAttack {
            damage 30
          }
        }
      };
      case SKARMORY_55:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Shining Horn", {
          text "As long as Skarmory is the only Pokémon you have in play, your opponent's Basic Pokémon can't attack."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (ef.attacker.owner == self.owner.opposite && ef.attacker.notEvolution && self.owner.pbg.all.size() == 1) {
                wcu "Shining Horn prevents this Pokémon from attacking"
                prevent()
              }
            }
          }
        }
        move "Cry for Help", {
          text "Search your deck for a [M] Pokémon (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            deck.search ({
              it.asPokemonCard().types.contains(M) && !it.asPokemonCard().cardTypes.is(EX)
            }).each {
              it.moveTo(my.hand)
            }
            shuffleDeck()
          }
        }
        move "Steel Wing", {
          text "20 damage. During your opponent's next turn, any damage done to Skarmory by attacks is reduced by 20 (after applying Weakness and Resistance)."
          energyCost M, C
          onAttack {
            damage 20
            reduceDamageNextTurn(hp(20), thisMove)
          }
        }
      };
      case VOLBEAT_56:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokeBody "Extra Protection", {
          text "As long as you have Illumise in play, prevent all effects, including damage, done to Volbeat by attacks from your opponent's Pokémon-ex."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if (self.owner.pbg.all.find{it.name == "Illumise"}){
                bg.dm().each {
                  if (it.to == self && it.from.EX && it.notNoEffect && it.dmg.value) {
                    bc "Extra Protection prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
            before null, self, Source.ATTACK, {
              if (self.owner.pbg.all.find{it.name == "Illumise"} && self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                bc "Extra Protection prevents effect"
                prevent()
              }
            }
          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost G, C
          onAttack {
            swiftDamage(30, defending)
          }
        }
      };
      case BAGON_DELTA_57:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness C
        resistance F, MINUS30
        resistance R, MINUS30
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case BAGON_DELTA_58:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness C
        resistance R, MINUS30
        resistance F, MINUS30
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Bagon."
          energyCost R, C
          onAttack {
            damage 30
            discardSelfEnergy R
          }
        }
      };
      case BELDUM_DELTA_59:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Conductive Body", {
          text "As long as Beldum is your active Pokemon, you pay [C] less to retreat Beldum for each Beldum on your Bench."
          getterA GET_RETREAT_COST, self, {h ->
            if (self.active) {
              my.bench.findAll { it.name == "Beldum" }.each {
                h.object -= 1
              }
            }
          }
        }
        move "Take Down", {
          text "30 damage. Beldum does 10 damage to itself."
          energyCost L, C
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case CUBONE_60:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Beat", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
          energyCost C, C
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
      };
      case DITTO_61:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Fireworks", {
          text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Ditto."
          energyCost R, C
          onAttack {
            damage 30
            flip 1, {}, { discardSelfEnergy R }
          }
        }
      };
      case DITTO_62:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness W
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          onAttack {
            damage 20, opp.all.select()
          }
        }
      };
      case DITTO_63:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
      };
      case DITTO_64:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        pokePower "Duplicate", {
          text "Once during your turn (before your attack), you may search your deck for another Ditto and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Ditto on top of your deck. Shuffle your deck afterward. You can't use more than 1 Duplicate Poké-Power each turn."
          actionA {
            assert bg.em().retrieveObject("Duplicate") != bg.turnCount : "You can’t use more than 1 Duplicate Poké-Power each turn"
            checkLastTurn()
            assert my.deck : "Deck is empty"
            bg.em().storeObject("Duplicate",bg.turnCount)
            powerUsed()

            def oldDitto = self.topPokemonCard
            def newDitto = my.deck.search(min:0, max: 1, {
              it.name == "Ditto"
            })

            if (newDitto) {
              newDitto.moveTo(self.cards)
              my.deck.add(oldDitto)
              self.cards.remove(oldDitto)
              checkFaint()
            }

            shuffleDeck()
          }
        }
        move "Spiral Drain", {
          text "20 damage. Remove 3 damage counters from Ditto (all if there are less than 3)."
          energyCost W, C
          onAttack {
            damage 20
            heal 30, self
          }
        }
      };
      case DRATINI_DELTA_65:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Hook", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Thunder Jolt", {
          text "30 damage. Flip a coin. If tails, Dratini does 10 damage to itself."
          energyCost L, C
          onAttack {
            damage 30
            flip 1, {}, { damage 10, self }
          }
        }
      };
      case DRATINI_DELTA_66:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness C
        resistance G, MINUS30
        resistance F, MINUS30
        move "Thunder Wave", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case DROWZEE_67:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Disable", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost P
          onAttack {
            amnesia delegate
          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case EEVEE_DELTA_68:
      return basic (this, hp:HP050, type:M, retreatCost:1) {
        weakness F
        move "Metal Scoop", {
          text "10 damage. Search your discard pile for a [M] Energy card and attach it to Eevee."
          energyCost C
          onAttack {
            damage 10
            afterDamage {
              attachEnergyFrom(type: M, my.discard, self)
            }
          }
        }
      };
      case EEVEE_69:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic:true, 1, delegate)
        }
        move "Rear Kick", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case HOLON_S_MAGNEMITE_70:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        globalAbility {Card thisCard->
          delayed {
            before PLAY_CARD, {
              if(ef.cardToPlay == thisCard){
                if(choose([1,2], ["Pokémon", "Energy"], "Play this card as a Pokémon or as an energy?") == 2){
                  if(bg.em().retrieveObject("Holon_Pokemon_Energy") != bg.turnCount){
                    def pcs = thisCard.player.pbg.all.select("Attach to?")
                    bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
                    def pkmnCard = thisCard
                    def energyCard
                    energyCard = specialEnergy(new CustomCardInfo(HOLON_S_MAGNEMITE_70).setCardTypes(ENERGY, SPECIAL_ENERGY), [[C]]) {
                      onPlay {}
                      onRemoveFromPlay {
                        bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                      }
                    }
                    energyCard.player = thisCard.player
                    bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
                    attachEnergy(pcs, energyCard)
                    bc "$energyCard is now a Special Energy Card"
                    prevent()
                  } else {
                    prevent()
                    wcu "You have already played an energy"
                  }
                }
              } //If the user chooses Pokémon, play the card normally
            }
            before PLAY_ENERGY, {
              if(bg.em().retrieveObject("Holon_Pokemon_Energy") == bg.turnCount){
                wcu "Cannot play any more energy this turn."
                prevent()
              }
            }
            after ATTACH_ENERGY, {
              if(ef.reason==PLAY_FROM_HAND){
                bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
              }
            }
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost M
          onAttack {
            damage 10, opp.all.select()
          }
        }
      };
      case HOLON_S_VOLTORB_71:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        globalAbility {Card thisCard->
          delayed {
            before PLAY_CARD, {
              if(ef.cardToPlay == thisCard){
                if(choose([1,2], ["Pokémon", "Energy"], "Play this card as a Pokémon or as an energy?") == 2){
                  if(bg.em().retrieveObject("Holon_Pokemon_Energy") != bg.turnCount){
                    def pcs = thisCard.player.pbg.all.select("Attach to?")
                    bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
                    def pkmnCard = thisCard
                    def energyCard
                    energyCard = specialEnergy(new CustomCardInfo(HOLON_S_VOLTORB_71).setCardTypes(ENERGY, SPECIAL_ENERGY), [[C]]) {
                      onPlay {}
                      onRemoveFromPlay {
                        bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                      }
                    }
                    energyCard.player = thisCard.player
                    bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
                    attachEnergy(pcs, energyCard)
                    bc "$energyCard is now a Special Energy Card"
                    prevent()
                  } else {
                    prevent()
                    wcu "You have already played an energy"
                  }
                }
              } //If the user chooses Pokémon, play the card normally
            }
            before PLAY_ENERGY, {
              if(bg.em().retrieveObject("Holon_Pokemon_Energy") == bg.turnCount){
                wcu "Cannot play any more energy this turn."
                prevent()
              }
            }
            after ATTACH_ENERGY, {
              if(ef.reason==PLAY_FROM_HAND){
                bg.em().storeObject("Holon_Pokemon_Energy", bg.turnCount)
              }
            }
          }
        }
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case KOFFING_72:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Confusion Gas", {
          text "The Defending Pokémon is now Confused."
          energyCost G
          onAttack {
            apply CONFUSED
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case LARVITAR_DELTA_73:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness G
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Rising Lunge", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost R, C
          onAttack {
            damage 20
            flip { damage 10 }
          }
        }
      };
      case MAGNEMITE_74:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Collect", {
          text "Draw a card."
          energyCost C
          onAttack {
            draw 1
          }
        }
        move "Magnetic Blast", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case MAKUHITA_75:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Sand Attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
      };
      case MARILL_76:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Rollout", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Jump On", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case MEOWTH_77:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Pickup Power", {
          text "Search your discard pile for an Energy card, show it to your opponent, and put it into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.find(cardTypeFilter(ENERGY)) : "No Energy cards in Discard pile"
          }
          onAttack {
            my.discard.findAll(cardTypeFilter(ENERGY)).select().moveTo(my.hand)
          }
        }
        move "Bite", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case PONYTA_78:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "10 damage."
          energyCost R
          onAttack {
            damage 10
          }
        }
      };
      case POOCHYENA_79:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Roar", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          onAttack {
            whirlwind()
          }
        }
        move "Ambush", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost D, C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case PORYGON_80:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Sharpen", {
          text "30 damage."
          energyCost C, C
          onAttack {
            damage 30
          }
        }
      };
      case RALTS_81:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Collect", {
          text "Draw a card."
          energyCost C
          onAttack {
            draw 1
          }
        }
        move "Quick Blow", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case SANDSHREW_82:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Dig Under", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost F
          onAttack {
            damage 10, opp.all.select()
          }
        }
        move "Scratch", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case SLOWPOKE_83:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Yawn", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
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
      case STARYU_84:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Spinning Attack", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case STARYU_85:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Surprise Attack", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          onAttack {
            flip { damage 20 }
          }
        }
        move "Recover", {
          text "Discard a [W] Energy card attached to Staryu and remove 4 damage counters from Staryu (all if there are less than 4)."
          energyCost W
          onAttack {
            discardSelfEnergy(W)
            heal 40, self
          }
        }
      };
      case TAILLOW_86:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Skill Dive", {
          text "Does 10 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          onAttack {
            damage 10, opp.all.select()
          }
        }
      };
      case WEEDLE_87:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "String Shot", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case ZUBAT_88:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Poison Fang", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          onAttack {
            damage 10
            flip { apply POISONED }
          }
        }
      };
      case DUAL_BALL_89:
      return basicTrainer (this) {
        text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. If you do, shuffle your deck afterward."
        onPlay {
          def cardsToSearch = 0
          flip 2, {
            cardsToSearch++
          }
          if (cardsToSearch){
            def tar = my.deck.search (max: cardsToSearch, "Search your deck for ${cardsToSearch==1?:"up to " + cardsToSearch} Basic Pokémon", cardTypeFilter(BASIC))
            if (tar) tar.showToOpponent("Selected Pokémon").moveTo(my.hand)
            shuffleDeck()
          }
        }
        playRequirement{
          assert my.deck.notEmpty
        }
      };
      case GREAT_BALL_90:
      return copy(FireRedLeafGreen.GREAT_BALL_92, this);
      case HOLON_FARMER_91:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Search your discard pile for 3 basic Energy cards and any combination of 3 Basic Pokémon or Evolution cards, show them to your opponent, and put them on top of your deck. Shuffle your deck afterward."
        onPlay {
          def toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card from your hand in order to play ${thisCard}.")
          toDiscard.discard()

          if (my.discard.filterByType(BASIC_ENERGY)) {
            my.discard.filterByType(BASIC_ENERGY).select(count: 3, "Select 3 Basic Energies to shuffle into your deck").moveTo(my.deck)
          }

          if (my.discard.filterByType(POKEMON)) {
            my.discard.filterByType(POKEMON).select(count: 3, "Select 3 Pokémon cards and shuffle them into your deck.").moveTo(my.deck)
          }

          shuffleDeck()
        }
        playRequirement{
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert hand : "One other card in hand is required to play this card."
          assert my.discard.filterByType(BASIC_ENERGY) || my.discard.filterByType(POKEMON) : "No Basic Energy cards or Pokemon in discard pile."
        }
      };
      case HOLON_LASS_92:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Count the total number of Prize cards left (both yours and your opponent's). Look at that many cards from the top of your deck, choose as many Energy cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
        onPlay {
          def toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card from your hand in order to play ${thisCard}.")
          toDiscard.discard()

          def prizeCardCount = my.prizeCardSet.size() + opp.prizeCardSet.size()

          def list = my.deck.subList(0, prizeCardCount)
          list.showToMe("Top $prizeCardCount cards of your deck.")

          def numOfEnergies = list.filterByType(ENERGY).size()
          list.filterByType(ENERGY).select(min: 0, max: numOfEnergies, "Select any amount of Energy cards to move to your hand.").showToOpponent("Opponent used Holon Lass").moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert hand : "One other card in hand is required to play this card."
          assert my.deck : "Deck is empty"
        }
      };
      case HOLON_MENTOR_93:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Search your deck for up to 3 Basic Pokémon that each has 100 HP or less, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
          def toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card from your hand in order to play ${thisCard}.")
          toDiscard.discard()

          deck.search(max: 3, "Search your deck for up to 3 Basic Pokemon with 100 HP or less", {
            it.cardTypes.pokemon && it.cardTypes.is(BASIC) && it.asPokemonCard().hp.value <= 100
          }).showToOpponent("Opponent used Holon Mentor").moveTo(my.hand)

          shuffleDeck()
        }
        playRequirement{
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert hand : "One other card in hand is required to play this card."
          assert my.deck : "Deck is empty"
        }
      };
      case HOLON_RESEARCH_TOWER_94:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player's basic Energy cards attached to Pokémon that has δ on its card are both their usual Energy type and Metal type but provide only 1 Energy at a time. (Has no effect other than providing Energy.)"
        def eff
        onPlay {
          eff = getter GET_ENERGY_TYPES, { holder->
            if (holder.effect.target.topPokemonCard.cardTypes.is(DELTA) &&
              holder.effect.card.cardTypes.is(BASIC_ENERGY)) {
              def type = holder.effect.card.basicType
              holder.object = [[type,M] as Set]
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case HOLON_RESEARCHER_95:
      return supporter (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card. Search your deck for a [M] Energy card or a Basic Pokémon (or Evolution card) that has δ on its card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
          def toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card from your hand in order to play ${thisCard}.")
          toDiscard.discard()

          my.deck.search(max: 1, "Select a [M] or a Pokemon card with δ in its card.", {
            (it.cardTypes.is(ENERGY) && it.asEnergyCard().containsTypePlain(M)) ||
            (it.cardTypes.is(POKEMON) && it.cardTypes.is(DELTA))
          }).showToOpponent("Opponent's used Holon Researcher, and will put this card into their hand.").moveTo(my.hand)

          shuffleDeck()
        }
        playRequirement{
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert hand : "One other card in hand is required to play this card."
          assert my.deck : "Deck is empty."
        }
      };
      case HOLON_RUINS_96:
      return stadium (this) {
        text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
          "Each player that has any Pokémon in play that has DELTA on its card may draw a card once during his or her turn. If the player does, he or she discards a card from his or her hand."
        def lastTurn=0
        def actions=[]
        onPlay {
          actions=action("Stadium: Holon Ruins") {
            assert lastTurn != bg().turnCount : "Already used Holon Ruins"
            assert my.deck : "Deck is empty."
            assert my.all.any{it.topPokemonCard.cardTypes.is(DELTA)} : "No Delta Pokemon in play."
            bc "Used Holon Ruins effect"
            lastTurn = bg().turnCount

            draw 1
            my.hand.select("Discard a card from your hand").discard()
          }
        }
        onRemoveFromPlay{
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case HOLON_SCIENTIST_97:
      return supporter (this) {
        text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
          "Discard a card from your hand. If you can't discard a card from your hand, you can't play this card.If you have less cards in your hand than your opponent, draw cards until you have the same number of cards as your opponent."
        onPlay {
          def toDiscard = my.hand.getExcludedList(thisCard).select(count:1, "Discard a card from your hand in order to play ${thisCard}.")
          toDiscard.discard()

          draw opp.hand.size() - my.hand.getExcludedList(thisCard).size()
        }
        playRequirement{
          def hand = my.hand.getExcludedList(thisCard).size() >= 1
          assert hand : "One other card in hand is required to play this card."
          assert (my.hand.size()-2 < opp.hand.size()) : "You must be able to draw at least one card after you have paid the discard cost"
        }
      };
      case HOLON_TRANSCEIVER_98:
      return itemCard (this) {
        text "Search your deck for a Supporter card that has Holon in its name, show it to your opponent, and put it into your hand. Shuffle your deck afterward. Or, search your discard pile for a Supporter card that has Holon in its name, show it to your opponent, and put it into your hand."
        onPlay {
          // Choice 1 = Search deck
          // Choice 2 = Search discard
          def choice = 2
          if (!my.discard || !my.discard.any{it.cardTypes.is(SUPPORTER) && it.name.contains("Holon")}) {
            choice = 1
          }
          else {
            choice = choose([1,2],["Search the deck", "Search the Discard pile"], "Where to search for a Supporter card that has Holon in its name?")
          }
          if (choice == 1) {
            def tar = my.deck.search(max: 1, "Search for a Holon Supporter", {
              it.cardTypes.is(SUPPORTER) &&
              it.name.contains("Holon")
            })
            if (tar) {
              tar.showToOpponent("Opponent played Holon Transceiver, and will move this Holon Supporter from their deck to their hand.").moveTo(my.hand)
            }
            shuffleDeck()
          }
          else {
            my.discard.findAll{
              it.cardTypes.is(SUPPORTER) &&
              it.name.contains("Holon")
            }.select("Which card to move to hand?").showToOpponent("Opponent moved this Holon Supporter to their hand.").moveTo(my.hand)
          }
        }
        playRequirement {
          assert my.discard.any{
            it.cardTypes.is(SUPPORTER) && it.name.contains("Holon")
          } || my.deck.notEmpty : "Deck is empty and your discard pile does not have any Holon Supporters"
        }
      };
      case MASTER_BALL_99:
        return copy(Deoxys.MASTER_BALL_88, this);
      case SUPER_SCOOP_UP_100:
        return copy(FireRedLeafGreen.SUPER_SCOOP_UP_99, this);
      case POTION_101:
        return copy(FireRedLeafGreen.POTION_101, this);
      case SWITCH_102:
        return copy(FireRedLeafGreen.SWITCH_102, this);
      case DARKNESS_ENERGY_103:
        return copy (Emerald.DARKNESS_ENERGY_86, this);
      case HOLON_ENERGY_FF_104:
      return specialEnergy (this, [[C]]) {
        text "Holon Energy FF provides [C] Energy. If the Pokémon that Holon Energy FF is attached to also has a basic [R] Energy card attached to it, that Pokémon has no Weakness. If the Pokémon that Holon Energy FF is attached to also has a basic [F] Energy card attached to it, damage done by that Pokémon's attack isn't affected by Resistance. Ignore these effects if Holon Energy FF is attached to Pokémon-ex."
        def eff
        def eff2
        onPlay {reason->
          eff = getter (GET_WEAKNESSES, self) { h->
            if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(R)) {
              h.object.clear()
            }
          }
          eff2 = delayed {
            before APPLY_RESISTANCE, {
              bg.dm().each {
                if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(F) && it.from==self) {
                  prevent()
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
          eff2.unregister()
        }
        onMove {to->
        }
      };
      case HOLON_ENERGY_GL_105:
      return specialEnergy (this, [[C]]) {
        text "Holon Energy GL provides [C] Energy. If the Pokémon that Holon Energy GL is attached to also has a basic [G] Energy card attached to it, that Pokémon can't be affected by any Special Conditions. If the Pokémon that Holon Energy GL is attached to also has a basic [L] Energy card attached to it, damage done by your opponent's Pokémon-ex is reduced by 10. Ignore these effects if Holon Energy GL is attached to Pokémon-ex."
        def eff
        def eff2
        onPlay {reason->
          if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G)) {
            clearSpecialCondition(self)
          }
          eff = delayed {
            before APPLY_SPECIAL_CONDITION, {
              if(e.getTarget(bg)==self && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G)){
                bc "Holon Energy GL prevents special conditions"
                prevent()
              }
            }
            after ATTACH_ENERGY, {
              if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G)) {
                clearSpecialCondition(self)
              }
            }
            after ENERGY_SWITCH, {
              if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G)) {
                clearSpecialCondition(self)
              }
            }
          }
          eff2=delayed {
            before APPLY_ATTACK_DAMAGES, {
              if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(L)){
                bg.dm().each {
                  if(it.to==self && it.from.owner!=self.owner && it.from.EX && it.dmg.value && it.notNoEffect){
                    it.dmg -= hp(10)
                    bc "Holon Energy GL -10"
                  }
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
          eff2.unregister()
        }
        onMove {to->
          if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G)) {
            clearSpecialCondition(self)
          }
        }
      };
      case HOLON_ENERGY_WP_106:
      return specialEnergy (this, [[C]]) {
        text "Holon Energy WP provides [C] Energy. If the Pokémon that Holon Energy WP is attached to also has a basic [W] Energy card attached to it, prevent all effects, excluding damage, done to that Pokémon by your opponent's Pokémon. If the Pokémon that Holon Energy WP is attached to also has a basic [P] Energy card attached to it, that Pokémon's Retreat Cost is 0. Ignore these effects if Holon Energy WP is attached to Pokémon-ex."
        def eff
        def eff2
        onPlay {reason->
          eff = getter (GET_RETREAT_COST, self) {h->
            if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(P)) {
              h.object = 0
            }
          }
          eff2 = delayed {
            before null, self, Source.ATTACK, {
              if (self != null && !self.EX && self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(W) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)) {
                bc "Holon Energy WP prevented effect"
                prevent()
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
          eff2.unregister()
        }
        onMove {to->
        }
      };
      case METAL_ENERGY_107:
      return copy (RubySapphire.METAL_ENERGY_94, this);
      case FLAREON_EX_108:
      return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:1) {
        weakness W
        pokePower "Evolutionary Flame", {
          text "Once during your turn, when you play Flareon ex from your hand to evolve 1 of your Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Burned and Confused."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Evolutionary Flame?")) {
              powerUsed()
              apply BURNED, opp.active, SRC_ABILITY
              apply CONFUSED, opp.active, SRC_ABILITY
            }
          }
        }
        move "Flame Screen", {
          text "30 damage. During your opponent's next turn, any damage done to Flareon ex by attacks is reduced by 20 (after applying Weakness and Resistance)."
          energyCost R, C
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(20),thisMove)
          }
        }
        move "Heat Tackle", {
          text "70 damage. Flareon ex does 10 damage to itself."
          energyCost R, C, C
          onAttack {
            damage 70
            damage 10, self
          }
        }
      };
      case JOLTEON_EX_109:
      return evolution (this, from:"Eevee", hp:HP100, type:L, retreatCost:0) {
        weakness F
        resistance M, MINUS30
        pokePower "Evolutionary Thunder", {
          text "Once during your turn, when you play Jolteon ex from your hand to evolve 1 of your Pokémon, you may put 1 damage counter on each of your opponent's Pokémon."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Evolutionary Thunder?")) {
              powerUsed()
              opp.all.each {
                directDamage 10, it, SRC_ABILITY
              }
            }
          }
        }
        move "Second Bite", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost L, C
          onAttack {
            damage 20+10*opp.active.numberOfDamageCounters
          }
        }
        move "Thunder Blast", {
          text "70 damage. Discard a [L] Energy card attached to Jolteon ex."
          energyCost L, C, C
          onAttack {
            damage 70
            discardSelfEnergy L
          }
        }
      };
      case VAPOREON_EX_110:
      return evolution (this, from:"Eevee", hp:HP120, type:W, retreatCost:1) {
        weakness L
        pokePower "Evolutionary Swirl", {
          text "Once during your turn, when you play Vaporeon ex from your hand to evolve 1 of your Pokémon, you may have your opponent shuffle his or her hand into his or her deck. Then, your opponent draws up to 4 cards."
          onActivate {
            if (it==PLAY_FROM_HAND && (opp.hand || opp.deck) && confirm("Use Evolutionary Swirl?")) {
              powerUsed()
              opp.hand.moveTo(hidden:true, opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              draw 4, TargetPlayer.OPPONENT
            }
          }
        }
        move "Fastwave", {
          text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost W, C
          onAttack {
            noResistanceOrAnyEffectDamage(40, defending)
          }
        }
        move "Hydrosplash", {
          text "60 damage."
          energyCost W, C, C
          onAttack {
            damage 60
          }
        }
      };
      case GROUDON_STAR_111:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
        weakness W
        move "Critical Collection", {
          text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [F] Energy cards and attach them to Groudon Star."
          energyCost F
          onAttack {
            damage 10

            def takenPrizes = opp.prizeCardSet.takenCount
            def energies = my.discard.filterByType(ENERGY).size()
            if (takenPrizes && energies) {
              def count = Math.min(takenPrizes, energies)
              (1..count).each {
                attachEnergyFrom(type:F, my.discard, self)
              }
            }
          }
        }
        move "Ground Slash", {
          text "80 damage. Discard a [F] Energy card attached to Groudon Star."
          energyCost F, F, F, C, C
          onAttack {
            damage 80
            discardSelfEnergy F
          }
        }
      };
      case KYOGRE_STAR_112:
      return basic (this, hp:HP090, type:W, retreatCost:3) {
        weakness L
        move "Critical Collection", {
          text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [W] Energy cards and attach them to Kyogre Star."
          energyCost W
          onAttack {
            damage 10
            def takenPrizes = opp.prizeCardSet.takenCount
            def energies = my.discard.filterByType(ENERGY).size()
            if (takenPrizes && energies) {
              def count = Math.min(takenPrizes, energies)
              (1..count).each {
                attachEnergyFrom(type:W, my.discard, self)
              }
            }
          }
        }
        move "Sheer Cold", {
          text "60 damage. Flip a coin. If heads, each Defending Pokémon can't attack during your opponent's next turn."
          energyCost W, W, W, C, C
          onAttack {
            damage 60
            flip { cantAttackNextTurn defending }
          }
        }
      };
      case METAGROSS_STAR_113:
      return basic (this, hp:HP070, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Critical Collection", {
          text "10 damage. Count the number of Prize cards your opponent has taken. Search your discard pile for up to that many [M] Energy cards and attach them to Metagross Star."
          energyCost M
          onAttack {
            damage 10

            def takenPrizes = opp.prizeCardSet.takenCount
            def energies = my.discard.filterByType(ENERGY).size()
            if (takenPrizes && energies) {
              def count = Math.min(takenPrizes, energies)
              (1..count).each {
                attachEnergyFrom(type:M, my.discard, self)
              }
            }
          }
        }
        move "Hyper Beam", {
          text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost M, M, M, C, C
          onAttack {
            damage 50
            flip { discardDefendingEnergy() }
          }
        }
      };
      case AZUMARILL_114:
      return evolution (this, from:"Marill", hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Thick Fat", {
          text "Any damage done to Azumarill by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner != self.owner && (ef.attacker.types.contains(R) || ef.attacker.types.contains(W))) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Thick Fat -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
        }
        move "Bubblebeam", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C
          onAttack {
            damage 40
            flip { apply PARALYZED }
          }
        }
      };
      default:
      return null;
    }
  }
}
