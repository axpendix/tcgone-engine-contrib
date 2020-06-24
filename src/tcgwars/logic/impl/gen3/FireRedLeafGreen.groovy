package tcgwars.logic.impl.gen3;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum FireRedLeafGreen implements LogicCardInfo {

  BEEDRILL_1 ("Beedrill", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BUTTERFREE_2 ("Butterfree", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DEWGONG_3 ("Dewgong", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DITTO_4 ("Ditto", 4, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  EXEGGUTOR_5 ("Exeggutor", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KANGASKHAN_6 ("Kangaskhan", 6, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  MAROWAK_7 ("Marowak", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDOKING_8 ("Nidoking", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDOQUEEN_9 ("Nidoqueen", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  PIDGEOT_10 ("Pidgeot", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  POLIWRATH_11 ("Poliwrath", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  RAICHU_12 ("Raichu", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RAPIDASH_13 ("Rapidash", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SLOWBRO_14 ("Slowbro", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SNORLAX_15 ("Snorlax", 15, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  TAUROS_16 ("Tauros", 16, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  VICTREEBEL_17 ("Victreebel", 17, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ARCANINE_18 ("Arcanine", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHANSEY_19 ("Chansey", 19, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  CLOYSTER_20 ("Cloyster", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DODRIO_21 ("Dodrio", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUGTRIO_22 ("Dugtrio", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  FARFETCH_D_23 ("Farfetch'd", 23, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  FEAROW_24 ("Fearow", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  HYPNO_25 ("Hypno", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KINGLER_26 ("Kingler", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGNETON_27 ("Magneton", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  PRIMEAPE_28 ("Primeape", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SCYTHER_29 ("Scyther", 29, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  TANGELA_30 ("Tangela", 30, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  CHARMELEON_31 ("Charmeleon", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DROWZEE_32 ("Drowzee", 32, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EXEGGCUTE_33 ("Exeggcute", 33, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAUNTER_34 ("Haunter", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  IVYSAUR_35 ("Ivysaur", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KAKUNA_36 ("Kakuna", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKITUNG_37 ("Lickitung", 37, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MANKEY_38 ("Mankey", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  METAPOD_39 ("Metapod", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINA_40 ("Nidorina", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINO_41 ("Nidorino", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ONIX_42 ("Onix", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  PARASECT_43 ("Parasect", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PERSIAN_44 ("Persian", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PIDGEOTTO_45 ("Pidgeotto", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  POLIWHIRL_46 ("Poliwhirl", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PORYGON_47 ("Porygon", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  RATICATE_48 ("Raticate", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  VENOMOTH_49 ("Venomoth", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WARTORTLE_50 ("Wartortle", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WEEPINBELL_51 ("Weepinbell", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF_52 ("Wigglytuff", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BELLSPROUT_53 ("Bellsprout", 53, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BULBASAUR_54 ("Bulbasaur", 54, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BULBASAUR_55 ("Bulbasaur", 55, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CATERPIE_56 ("Caterpie", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHARMANDER_57 ("Charmander", 57, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHARMANDER_58 ("Charmander", 58, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CLEFAIRY_59 ("Clefairy", 59, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CUBONE_60 ("Cubone", 60, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DIGLETT_61 ("Diglett", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DODUO_62 ("Doduo", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GASTLY_63 ("Gastly", 63, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GROWLITHE_64 ("Growlithe", 64, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  JIGGLYPUFF_65 ("Jigglypuff", 65, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  KRABBY_66 ("Krabby", 66, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGIKARP_67 ("Magikarp", 67, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGNEMITE_68 ("Magnemite", 68, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MEOWTH_69 ("Meowth", 69, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NIDORAN_FEMALE_70 ("Nidoran♀", 70, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  NIDORAN_MALE_71 ("Nidoran♂", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PARAS_72 ("Paras", 72, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIDGEY_73 ("Pidgey", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PIKACHU_74 ("Pikachu", 74, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  POLIWAG_75 ("Poliwag", 75, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PONYTA_76 ("Ponyta", 76, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  RATTATA_77 ("Rattata", 77, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SEEL_78 ("Seel", 78, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLDER_79 ("Shellder", 79, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLOWPOKE_80 ("Slowpoke", 80, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SPEAROW_81 ("Spearow", 81, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_82 ("Squirtle", 82, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SQUIRTLE_83 ("Squirtle", 83, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VENONAT_84 ("Venonat", 84, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_85 ("Voltorb", 85, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  WEEDLE_86 ("Weedle", 86, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BILL_S_MAINTENANCE_87 ("Bill's Maintenance", 87, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  CELIO_S_NETWORK_88 ("Celio's Network", 88, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  ENERGY_REMOVAL_2_89 ("Energy Removal 2", 89, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_SWITCH_90 ("Energy Switch", 90, Rarity.UNCOMMON, [TRAINER]),
  EXP_ALL_91 ("EXP.ALL", 91, Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
  GREAT_BALL_92 ("Great Ball", 92, Rarity.UNCOMMON, [TRAINER]),
  LIFE_HERB_93 ("Life Herb", 93, Rarity.UNCOMMON, [TRAINER]),
  MT__MOON_94 ("Mt. Moon", 94, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  POKE_BALL_95 ("Poké Ball", 95, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_HANDY909_96 ("PokéDex Handy909", 96, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_REVERSAL_97 ("Pokémon Reversal", 97, Rarity.UNCOMMON, [TRAINER]),
  PROF__OAK_S_RESEARCH_98 ("Prof. Oak's Research", 98, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  SUPER_SCOOP_UP_99 ("Super Scoop Up", 99, Rarity.UNCOMMON, [TRAINER]),
  VS_SEEKER_100 ("VS Seeker", 100, Rarity.UNCOMMON, [TRAINER]),
  POTION_101 ("Potion", 101, Rarity.COMMON, [TRAINER]),
  SWITCH_102 ("Switch", 102, Rarity.COMMON, [TRAINER]),
  MULTI_ENERGY_103 ("Multi Energy", 103, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  BLASTOISE_EX_104 ("Blastoise ex", 104, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_, EX]),
  CHARIZARD_EX_105 ("Charizard ex", 105, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_, EX]),
  CLEFABLE_EX_106 ("Clefable ex", 106, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_, EX]),
  ELECTRODE_EX_107 ("Electrode ex", 107, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_, EX]),
  GENGAR_EX_108 ("Gengar ex", 108, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_, EX]),
  GYARADOS_EX_109 ("Gyarados ex", 109, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_, EX]),
  MR__MIME_EX_110 ("Mr. Mime ex", 110, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  MR__MIME_EX_111 ("Mr. Mime ex", 111, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  VENUSAUR_EX_112 ("Venusaur ex", 112, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_, EX]),
  CHARMANDER_113 ("Charmander", 113, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  ARTICUNO_EX_114 ("Articuno ex", 114, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, EX]),
  MOLTRES_EX_115 ("Moltres ex", 115, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_, EX]),
  ZAPDOS_EX_116 ("Zapdos ex", 116, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_, EX]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  FireRedLeafGreen(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.FIRERED_LEAFGREEN;
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
      case BEEDRILL_1:
        return evolution (this, from:"Kakuna", hp:HP090, type:GRASS, retreatCost:0) {
          weakness FIRE
          move "Poison Sting", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }
          move "Link Needle", {
            text "50+ damage. This attack does 50 damage plus 30 more damage for each Beedrill (excluding this one) you have in play."
            energyCost G, C, C
            onAttack {
              damage 50
              my.all.findAll{it != self && it.name == "Beedrill"}.each{
                damage 30
              }
            }
          }

        };
      case BUTTERFREE_2:
        return evolution (this, from:"Metapod", hp:HP100, type:GRASS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Smooth Dust", {
            text "As long as Butterfree is your Active Pokémon, remove 1 damage counter from each of your Pokémon between turns."
            delayedA {
              before BEGIN_TURN, {
                if(self.active){
                  self.owner.pbg.all.each{
                    if(it.numberOfDamageCounters){
                      heal 10, it
                    }
                  }
                }
              }
            }
          }
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              whirlwind()
            }
          }
          move "Gust", {
            text "50 damage."
            energyCost G, C, C
            onAttack {
              damage 50
            }
          }

        };
      case DEWGONG_3:
        return evolution (this, from:"Seel", hp:HP080, type:WATER, retreatCost:2) {
          weakness METAL
          pokeBody "Safeguard", {
            text "Prevent all effects of attacks, including damage, done to Dewgong by your opponent’s Pokémon-ex."
            safeguard(self,delegate)
          }
          move "Cold Breath", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost W
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Aurora Beam", {
            text "40 damage."
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }

        };
      case DITTO_4:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          pokePower "Form Variation", {
            text "Once during your turn (before your attack), you may search you discard pile for a Basic Pokémon (excluding Pokémon-ex and Ditto) and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Place Ditto in the discard pile."
            actionA {
              checkLastTurn()
              assert my.discard.findAll {it.cardTypes.is(BASIC)} : "No basic in discard"
              powerUsed()
              def ditto = self.topPokemonCard
              my.discard.findAll{it.cardTypes.is(BASIC)}.select().moveTo(self.cards)
              discard(ditto)
              checkFaint()
            }
          }
          move "Energy Ball", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Ditto but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost C
            onAttack {
              damage 10
              extraEnergyDamage(2,hp(10),C,thisMove)
            }
          }

        };
      case EXEGGUTOR_5:
        return evolution (this, from:"Exeggcute", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Psychic Exchange", {
            text "Shuffle your hand into your deck. Draw up to 8 cards."
            energyCost C
            attackRequirement {
              assert my.hand.notEmpty && my.deck.notEmpty
            }
            onAttack {
              my.hand.moveTo(my.deck)
              shuffleDeck()
              draw 8
            }
          }
          move "Big Eggsplosion", {
            text "40× damage. Flip a coin for each Energy attached to Exeggutor. This attack does 40 damage times the number of heads."
            energyCost P, C
            onAttack {
              flip self.cards.energyCount(C), {
                damage 40
              }
            }
          }
        };
      case KANGASKHAN_6:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Fetch", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Headbutt", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "One-Two Punch", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
            energyCost C, C, C
            onAttack {
              damage 30
              flip {damage 20}
            }
          }

        };
      case MAROWAK_7:
        return evolution (this, from:"Cubone", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C
            onAttack {
              damage 30 ,opp.all.select()
            }
          }
          move "Vengeance", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Basic Pokémon and each Evolution card in your discard pile. You can’t add more than 60 damage in this way."
            energyCost F, C, C
            onAttack {
              damage 30
              def addDmg = Math.min(my.discard.filterByType(BASIC, EVOLUTION).size(),6)
              damage 10*addDmg
            }
          }

        };
      case NIDOKING_8:
        return evolution (this, from:"Nidorino", hp:HP120, type:FIGHTING, retreatCost:3) {
          weakness WATER
          pokeBody "Power Gene", {
            text "As long as Nidoking is in play, your attacks by Nidoran Female, Nidorina, Nidoqueen, Nidoran Male, and Nidorino do 10 more damage to the Defending Pokémon."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.from.owner == self.owner && (it.from.name == "Nidoran♂" || it.from.name == "Nidoran♀" || it.from.name == "Nidorino" || it.from.name == "Nidorina"|| it.from.name == "Nidoqueen")) {
                    bc "Power Gene +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
          move "Earth Poison", {
            text "40 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Poisoned."
            energyCost F, C
            onAttack {
              damage 40
              if(defending.numberOfDamageCounters) applyAfterDamage POISONED
            }
          }
          move "Bound Crush", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Nidoking can’t use Bound Crush during your next turn."
            energyCost F, F, C, C
            onAttack {
              damage 60, opp.all.select()
              cantUseAttack(thisMove, self)
            }
          }

        };
      case NIDOQUEEN_9:
        return evolution (this, from:"Nidorina", hp:HP120, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          def eff
          pokeBody "Family Bonds", {
            text "As long as Nidoqueen is in play, the Retreat Cost for Nidoran Female, Nidorina, Nidoran Male, Nidorino and Nidoking is 0."
            delayedA {
              eff = getter (GET_RETREAT_COST, BEFORE_LAST) {
                if (it.effect.target.name == "Nidoran♂" || it.effect.target.name == "Nidoran♀" || it.effect.target.name == "Nidorino" || it.effect.target.name == "Nidorina" || it.effect.target.name == "Nidoking") {
                  it.object = 0
                }
              }
            }
          }
          move "Toxic", {
            text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost G
            onAttack {
              apply POISONED
              extraPoison 1
            }
          }
          move "Power Lariat", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Evolved Pokémon you have in play."
            energyCost F, C, C
            onAttack {
              damage 40
              my.all.each{
                if(it.evolution) damage 10
              }
            }
          }

        };
      case PIDGEOT_10:
        return evolution (this, from:"Pidgeotto", hp:HP100, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokePower "Quick Search", {
            text "Once during your turn (before your attack), you may choose any 1 card from your deck and put it into your hand. Shuffle your deck afterward. You can’t use more than 1 Quick Search Poké-Power each turn. This power can’t be used if Pidgeot is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert bg.em().retrieveObject("Quick_Search") != bg.turnCount : "You cannot use Quick Search more than once per turn!"
              assert my.deck
              bg.em().storeObject("Quick_Search",bg.turnCount)
              powerUsed()
              my.deck.select(count:1).moveTo(hidden:true, my.hand)
              shuffleDeck()
            }
          }
          move "Clutch", {
            text "40 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 40
              cantRetreat defending
            }
          }

        };
      case POLIWRATH_11:
        return evolution (this, from:"Poliwhirl", hp:HP120, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          pokeBody "Spiral", {
            text "As long as Poliwrath is your Active Pokémon, your opponent’s Confused Pokémon can’t retreat."
            delayedA {
              before RETREAT,{
                if(ef.retreater.owner==self.owner.opposite && self.active && ef.retreater.isSPC(CONFUSED)){
                  wcu "Spiral prevents retreating"
                  prevent()
                }
              }
            }
          }
          move "Split Spiral Punch", {
            text "20 damage. The Defending Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Mega Throw", {
            text "50+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 50 damage plus 30 more damage."
            energyCost W, C, C
            onAttack {
              damage 50
              if (defending.EX) {
                damage 30
              }
            }
          }

        };
      case RAICHU_12:
        return evolution (this, from:"Pikachu", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Recharge", {
            text "Search your deck for up to 2 [L] Energy cards and attach them to Raichu. Shuffle your deck afterward."
            energyCost C
            onAttack {
              attachEnergyFrom(type: L, my.deck, self)
              attachEnergyFrom(type: L, my.deck, self)
            }
          }
          move "Thunder Reflection", {
            text "50 damage. You may move any number of [L] Energy cards attached to Raichu to another of your Pokémon."
            energyCost L, L, C
            onAttack {
              damage 50
              if(confirm("move any number of [L] Energy cards attached to Raichu to another of your Pokémon?"))
              {
                def pcs = my.bench.select()
                self.cards.filterByEnergyType(L).select(max : self.cards.filterByEnergyType(L).size()).each{
                  energySwitch(self,pcs,it)
                }
              }
            }
          }

        };
      case RAPIDASH_13:
        return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:1) {
          weakness WATER
          pokeBody "Fiery Aura", {
            text "As long as Rapidash is your Active Pokémon, put 4 damage counters instead of 2 on Burned Pokémon between turns."
            getterA (GET_BURN_DAMAGE) {h->
              if(self.active){
                bc "Fiery Aura increases burn damage to 40"
                h.object = hp(40)
              }
            }
          }
          move "Searing Flame", {
            text "10 damage. The Defending Pokémon is now Burned."
            energyCost R, C
            onAttack {
              damage 10
              applyAfterDamage BURNED
            }
          }
          move "Rear Kick", {
            text "40 damage."
            energyCost R, C, C
            onAttack {
              damage 40
            }
          }

        };
      case SLOWBRO_14:
        return evolution (this, from:"Slowpoke", hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Strange Behavior", {
            text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to Slowbro as long as you don’t Knock Out Slowbro. This power can’t be used if Slowbro is affected by a Special Condition."
            actionA {
              assert !self.specialConditions
              assert self.damage != self.fullHP - hp(10) : "Slowbro can't be Knocked Out by Strange Behavior!"
              def tar = my.all.findAll{it != self && it.numberOfDamageCounters}
              assert tar : "There is no Pokemon with damage counter outside Slowbro"
              def pcs = tar.select()

              self.damage+=hp(10)
              pcs.damage-=hp(10)
            }
          }
          move "Psyshock", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P, C
            onAttack {
              damage 30
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case SNORLAX_15:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          customAbility {
            delayedA {
              before ASLEEP_SPC, self, null, CHECK_ATTACK_REQUIREMENTS, {
                if(e.parentEvent.effect.move.name=="Toss and Turn")
                  prevent()
              }
            }
          }
          pokeBody "Rest Up", {
            text "If Snorlax remains Asleep between turns, remove 2 damage counters from Snorlax (remove 1 of there is only 1)."
            delayedA {
              before BEGIN_TURN, {
                if(self.isSPC(ASLEEP)){
                  heal 20, self
                }
              }
            }
          }
          move "Collapse", {
            text "10 damage. Snorlax is now Asleep."
            energyCost C
            onAttack {
              damage 10
              afterDamage {apply ASLEEP, self}
            }
          }
          move "Toss and Turn", {
            text "30+ damage. If Snorlax is Asleep, this attack does 30 damage plus 30 more damage. (This attack can be used even if Snorlax is Asleep.)"
            energyCost C, C, C
            onAttack {
              damage 30
              if(self.isSPC(ASLEEP)) damage 30
            }
          }

        };
      case TAUROS_16:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Knock Over", {
            text "10 damage. You may discard any Stadium card in play."
            energyCost C
            onAttack {
              damage 10
              if(bg.stadiumInfoStruct) {
                if(confirm("discard the Stadium card?")) afterDamage {discard(bg.stadiumInfoStruct.stadiumCard)}
              }
            }
          }
          move "Rampage", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. After doing damage, flip a coin. If tails, Tauros is now Confused."
            energyCost C, C, C
            onAttack {
              damage 20+10*self.numberOfDamageCounters
              flip 1, {}, {afterDamage {apply CONFUSED, self}}
            }
          }

        };
      case VICTREEBEL_17:
        return evolution (this, from:"Weepinbell", hp:HP110, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokeBody "Acid Sampler", {
            text "As long as Victreebel is your Active Pokémon, put 1 damage counter on each Defending Pokémon between turns. Acid Sampler stops working if your other Active Pokémon is not a Victreebel."
            // The "stops working" is only for 2v2 format, works fine in singles.
            // TODO: Handle same time effects like Butterfree (FRLG 2)
            delayedA {
              before BEGIN_TURN, {
                if(self.active){
                  directDamage 10, self.owner.opposite.pbg.active, SRC_ABILITY
                }
              }
            }
          }
          move "Acid", {
            text "50 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost G, C, C
            onAttack {
              damage 50
              cantRetreat defending
            }
          }

        };
      case ARCANINE_18:
        return evolution (this, from:"Growlithe", hp:HP090, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Flare", {
            text "20 damage."
            energyCost R
            onAttack {
              damage 20
            }
          }
          move "Heat Tackle", {
            text "70 damage. Arcanine does 10 damage to itself."
            energyCost R, C, C, C
            onAttack {
              damage 70
              damage 10, self
            }
          }

        };
      case CHANSEY_19:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Sing", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Egg Surprise", {
            text "Flip a coin. If heads, Chansey does 50 damage to the Defending Pokémon. If tails, remove 5 damage counters from Chansey. (All if there are less than 5.)"
            energyCost C, C, C
            onAttack {
              flip 1,{
                damage 50
              },{
                heal 50, self
              }

            }
          }

        };
      case CLOYSTER_20:
        return evolution (this, from:"Shellder", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Exoskeleton", {
            text "Any damage done to Cloyster by attacks is reduced by 20 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Exoskeleton -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Double Bubble", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads. If either of the coins is heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              flip 2,{
                damage 10
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Shell Attack", {
            text "50 damage."
            energyCost W, C, C
            onAttack {
              damage 50
            }
          }

        };
      case DODRIO_21:
        return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Retreat Aid", {
            text "As long as Dodrio is on your Bench, you pay [C][C] less to retreat your Active Pokémon (excluding Pokémon-ex and Baby Pokémon.)"
            getterA GET_RETREAT_COST ,{ h->
              if(self.benched && h.effect.target.owner == self.owner && !(h.effect.target.EX || h.effect.target.topPokemonCard.cardTypes.is(BABY))){
                h.object = Math.max(0,h.object-2)
              }
            }
          }
          move "Tri Attack", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 3,{damage 20}
            }
          }

        };
      case DUGTRIO_22:
        return evolution (this, from:"Diglett", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Sonicboom", {
            text "30 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost F, C
            onAttack {
              noWrDamage(30,defending)
            }
          }
          move "Rumble", {
            text "50 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost F, C, C
            onAttack {
              damage 50
              cantRetreat defending
            }
          }

        };
      case FARFETCH_D_23:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Hoard", {
            text "Search your deck for up to 2 Pokémon Tool cards and attach them to any of your Pokémon (excluding Pokémon that already have a Pokémon Tool attached to them). Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.all.findAll({!(it.cards.filterByType(POKEMON_TOOL))})
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
          move "Cross-Cut", {
            text "10+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 10 damage plus 20 more damage."
            energyCost C
            onAttack {
              damage 10
              if(defending.evolution) damage 20
            }
          }

        };
      case FEAROW_24:
        return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Free Flight", {
            text "If Fearow has no Energy attached to it, Fearow’s Retreat Cost is 0."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.energyCount(C) == 0) {
                h.object = 0
              }
            }
          }
          move "Shot Air", {
            text "10 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
            energyCost C, C
            onAttack {
              damage 10
              damage 20, opp.bench.select()
            }
          }
          move "Drill Peck", {
            text "50 damage."
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }

        };
      case HYPNO_25:
        return evolution (this, from:"Drowzee", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Eerie Aura", {
            text "As long as Hypno is your Active Pokémon, put 2 damage counters on each Pokémon that remains Asleep between turns."
            delayedA {
              before BEGIN_TURN, {
                if(my.active.isSPC(ASLEEP)){
                  my.active.damage += hp(20)
                }
                if(opp.active.isSPC(ASLEEP)){
                  opp.active.damage += hp(20)
                }
              }
            }
          }
          move "Hypnotic Ray", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost P, C
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }

        };
      case KINGLER_26:
        return evolution (this, from:"Krabby", hp:HP080, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Salt Water", {
            text "Search your deck for up to 2 [W] Energy cards and attach them to Kingler. Shuffle your deck afterward."
            energyCost C
            onAttack {
              my.deck.search(max : 2,"Search your deck for up to 2 [W] Energy cards",basicEnergyFilter(W)).each{
                attachEnergy(self, it)
              }
            }
          }
          move "Hyper Pump", {
            text "30+ damage. Does 30 damage plus 20 more damage for each basic Energy attached to Kingler but not used to pay for this attack’s Energy cost. You can’t add more than 40 damage in this way."
            energyCost W, C
            onAttack {
              damage 30
              extraEnergyDamage(2,hp(20),W,thisMove)
            }
          }

        };
      case MAGNETON_27:
        return evolution (this, from:"Magnemite", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              afterDamage {flipThenApplySC PARALYZED}
            }
          }
          move "Speed Shot", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C, C
            onAttack {
              directDamage 40, opp.all.select()
            }
          }

        };
      case PRIMEAPE_28:
        return evolution (this, from:"Mankey", hp:HP070, type:FIGHTING, retreatCost:0) {
          weakness PSYCHIC
          move "Toss", {
            text "30× damage. You may discard from your hand as many Technical Machine and Pokémon Tool cards as you like. This attack does 30 damage times the number of cards your discarded."
            energyCost C, C
            onAttack {
              def tar = my.hand.filterByType(POKEMON_TOOL,TECHNICAL_MACHINE).select(max:my.hand.filterByType(POKEMON_TOOL,TECHNICAL_MACHINE).size())
              damage 30*tar.size()
              tar.discard()
            }
          }
          move "Low Kick", {
            text "40 damage."
            energyCost F, C
            onAttack {
              damage 40
            }
          }

        };
      case SCYTHER_29:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokeBody "Leaf Ride", {
            text "If Scyther has any Energy attached to it, Scyther’s Retreat Cost is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(C)) {
                h.object = 0
              }
            }
          }
          move "Fury Cutter", {
            text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
            energyCost G, C
            onAttack {
              damage 10
              flip 3,{},{},[1:{damage 10},2:{damage 20},3:{damage 40}]
            }
          }

        };
      case TANGELA_30:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Vine Tease", {
            text "Look at your Prize cards without showing your opponent. Choose 1 of the Prize cards and switch it with the top card of your deck without looking at the top card of your deck. If you have no cards in your deck, this attack does nothing."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def tar = my.prizeCardSet.select(hidden: false, "Prize to replace with the top card of your deck").first()
              my.prizeCardSet.set(my.prizeCardSet.indexOf(tar),my.deck.remove(0))
              my.deck.add(0,tar)
            }
          }
          move "Wiggle", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              flip 1,{apply CONFUSED}, {apply POISONED}
            }
          }

        };
      case CHARMELEON_31:
        return evolution (this, from:"Charmander", hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Flare", {
            text "30 damage."
            energyCost R, C
            onAttack {
              damage 30
            }
          }
          move "Damage Burn", {
            text "40+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 40 damage plus 20 more damage."
            energyCost R, C, C
            onAttack {
              damage 40
              if(defending.numberOfDamageCounters) damage 20
            }
          }

        };
      case DROWZEE_32:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Ambush", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost P
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case EXEGGCUTE_33:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Psybeam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            onAttack {
              damage 10
              afterDamage {flipThenApplySC CONFUSED}
            }
          }
          move "Double Spin", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {damage 20}
            }
          }

        };
      case HAUNTER_34:
        return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          pokePower "Head Trip", {
            text "Once during your turn (before your attack), if Haunter is on your Bench, you may use this power. One of your Active Pokémon is now Confused."
            actionA {
              checkLastTurn()
              assert self.benched
              powerUsed()
              apply CONFUSED, my.active
            }
          }
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 20
              afterDamage {flipThenApplySC CONFUSED}
            }
          }

        };
      case IVYSAUR_35:
        return evolution (this, from:"Bulbasaur", hp:HP080, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Poison Seed", {
            text "The Defending Pokémon is now Poisoned."
            energyCost C
            onAttack {
              apply POISONED
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
      case KAKUNA_36:
        return evolution (this, from:"Weedle", hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokeBody "Poison Payback", {
            text "If Kakuna is your Active Pokémon and is damaged by an opponent’s attack (even if Kakuna is Knocked Out), the Attacking Pokémon is now Poisoned."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner != self.owner) {
                  bg.dm().each{
                    if(it.to == self && self.active && it.notNoEffect && it.dmg.value) {
                      bc "Kakuna's Poison Payback poison your Pokémon!"
                      apply POISONED,ef.attacker
                    }
                  }
                }
              }
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
      case LICKITUNG_37:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Lick", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 10
              afterDamage {flipThenApplySC PARALYZED}
            }
          }
          move "Tongue Whip", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            onAttack {
              damage 20, opp.all.select()
            }
          }

        };
      case MANKEY_38:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Mischief", {
            text "Shuffle your opponent’s deck."
            energyCost C
            onAttack {
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
          move "Light Punch", {
            text "30 damage."
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case METAPOD_39:
        return evolution (this, from:"Caterpie", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokeBody "Energy Protection", {
            text "Any damage done to Metapod by attacks is reduced by 10 for each Energy attached to Metapod. You can’t reduce more than 30 damage in this way."
            delayedA {
              before APPLY_ATTACK_DAMAGES,{
                def dmgRed = Math.min(3,self.cards.energyCount())
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Energy Protection -${10*dmgRed}"
                    it.dmg -= hp(10*dmgRed)
                  }
                }
              }
            }
          }
          move "Sharpen", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case NIDORINA_40:
        return evolution (this, from:"Nidoran♀", hp:HP080, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Scratch", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Fast Evolution", {
            text "Search your deck for up to 2 Evolution cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 Evolution cards",cardTypeFilter(EVOLUTION)).showToOpponent("Selected cards").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case NIDORINO_41:
        return evolution (this, from:"Nidoran♂", hp:HP070, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Double Stab", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2,{damage 20}
            }
          }
          move "Rend", {
            text "30+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 30 damage plus 30 more damage."
            energyCost C, C, C
            onAttack {
              damage 30
              if(defending.numberOfDamageCounters) damage 30
            }
          }

        };
      case ONIX_42:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
          weakness WATER
          move "Rock Throw", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
          move "Tunneling", {
            text "Choose up to 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.) Onix can’t attack during your next turn."
            energyCost F, C
            onAttack {
              if (opp.bench) {
                multiSelect(opp.bench, 2).each{
                  targeted(it){
                    damage 10, it
                  }
                }
              }
              cantAttackNextTurn self
            }
          }

        };
      case PARASECT_43:
        return evolution (this, from:"Paras", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Energy Powder", {
            text "Search your deck for up to 2 basic Energy cards and attach them to any of your Pokémon (excluding Pokémon-ex) in any way you like. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max : 2, "Search your deck for up to 2 basic Energy cards", cardTypeFilter(BASIC_ENERGY)).each{
                def pcs = my.all.findAll{!(it.pokemonEX)}.select("Attach $it to one of thos Pokémon")
                attachEnergy(pcs, it)
              }
            }
          }
          move "Toxic Spore", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }

        };
      case PERSIAN_44:
        return evolution (this, from:"Meowth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          pokeBody "Thick Skin", {
            text "Persian can’t be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                bc ("$self is thick Skinned!")
                prevent()
              }
            }
          }
          move "Poison Claws", {
            text "The Defending Pokémon is now Poisoned."
            energyCost C
            onAttack {
              apply POISONED
            }
          }
          move "Shining Claws", {
            text "30 damage. The Defending Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 30
              applyAfterDamage CONFUSED
            }
          }

        };
      case PIDGEOTTO_45:
        return evolution (this, from:"Pidgey", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Clutch", {
            text "10 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost C
            onAttack {
              damage 10
              cantRetreat defending
            }
          }
          move "Cutting Wind", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case POLIWHIRL_46:
        return evolution (this, from:"Poliwag", hp:HP080, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Energy Stream", {
            text "10 damage. Search your discard pile for a basic Energy card and attach it to Poliwhirl."
            energyCost C
            onAttack {
              damage 10
              def tar = my.discard.filterByType(BASIC_ENERGY)
              if(tar){
                attachEnergyFrom(basic: true, my.discard, self)
              }
            }
          }
          move "Bubble", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C
            onAttack {
              damage 20
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case PORYGON_47:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Data Retrieval", {
            text "If you have less than 4 cards in your hand, draw cards until you have 4 cards in your hand."
            energyCost C
            onAttack {
              if(my.hand.size() < 4){
                draw 4 - my.hand.size()
              }
            }
          }
          move "Confuse Ray", {
            text "10 damage. The Defending Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 10
              applyAfterDamage CONFUSED
            }
          }

        };
      case RATICATE_48:
        return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness FIGHTING
          pokeBody "Thick Skin", {
            text "Raticate can’t be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                bc ("$self is thick Skinned!")
                prevent()
              }
            }
          }
          move "Pickup", {
            text "Search your discard pile for a Basic Pokémon (or Evolution card), a Trainer card, and an Energy card. Show them to your opponent and put them into your hand."
            energyCost C
            onAttack {
              if(my.discard){
                def selectedCard = new CardList();
                if(my.discard.filterByType(POKEMON)) selectedCard.add(my.discard.filterByType(POKEMON).select(count : 1, "Search your discard pile for a Basic Pokémon (or Evolution card)").first())
                if(my.discard.filterByType(TRAINER)) selectedCard.add(my.discard.filterByType(TRAINER).select(count : 1, "Search your discard pile for a Trainer card").first())
                if(my.discard.filterByType(ENERGY)) selectedCard.add(my.discard.filterByType(ENERGY).select(count : 1, "Search your discard pile for an Energy card)").first())
                selectedCard.showToOpponent("Your opponent selected those cards").moveTo(my.hand)
              }
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 40 more damage."
            energyCost C
            onAttack {
              damage 10
              flip {damage 40}
            }
          }

        };
      case VENOMOTH_49:
        return evolution (this, from:"Venonat", hp:HP070, type:GRASS, retreatCost:0) {
          weakness FIRE
          pokeBody "Protective Dust", {
            text "Prevent all effects of attacks, except damage, done to Venomoth by the Attacking Pokémon."
            delayedA {
              before null, self, Source.ATTACK, {
                if(bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)){
                  bc "Protective Dust prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Sleep Poison", {
            text "The Defending Pokémon is now Asleep and Poisoned."
            energyCost G
            onAttack {
              apply ASLEEP
              apply POISONED
            }
          }
          move "Razor Wind", {
            text "60 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip {damage 60}
            }
          }

        };
      case WARTORTLE_50:
        return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Water Gun", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Wartortle but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost W
            onAttack {
              damage 20
              extraEnergyDamage(2,hp(10),W,thisMove)
            }
          }
          move "Smash Turn", {
            text "40 damage. After your attack, you may switch Wartortle with 1 of your Benched Pokémon."
            energyCost W, C, C
            onAttack {
              damage 40
              afterDamage{
                if(my.bench){
                  if(confirm("switch Wartortle with 1 of your Benched Pokémon?")){
                    sw self, my.bench.select()
                  }
                }
              }
            }
          }

        };
      case WEEPINBELL_51:
        return evolution (this, from:"Bellsprout", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Razor Leaf", {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
          move "Corrosive Acid", {
            text "10 damage. The Defending Pokémon is now Burned."
            energyCost C, C
            onAttack {
              damage 10
              applyAfterDamage BURNED
            }
          }

        };
      case WIGGLYTUFF_52:
        return evolution (this, from:"Jigglypuff", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          pokePower "Assistance", {
            text "Once during your turn (before your attack), if Wigglytuff is on your Bench, you may choose 1 of your Active Pokémon and remove 1 Special Condition from it."
            actionA {
              checkLastTurn()
              assert self.benched : "Wigglytuff is not benched"
              assert my.active.specialConditions : "your active does not have any Special Condition"
              powerUsed()
              def scpList = new ArrayList<SpecialConditionType>()
              scpList.addAll(my.active.specialConditions)
              def spcCleared = choose(scpList,"choose the Special Condition to remove from your active")
              clearSpecialCondition(self.owner.pbg.active, Source.SRC_ABILITY, [spcCleared])
            }
          }
          move "Expand", {
            text "30 damage. During your opponent’s next turn, any damage done to Wigglytuff by attacks is reduced by 10 (after applying Weakness and Resistance)."
            energyCost C, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }

        };
      case BELLSPROUT_53:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Vine Whip", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case BULBASAUR_54:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Sleep Poison", {
            text "Flip a coin. If heads, the Defending Pokémon is now Alseep and Poisoned."
            energyCost C
            onAttack {
              flip {
                apply ASLEEP
                apply POISONED
              }
            }
          }
          move "Razor Leaf", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case BULBASAUR_55:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Gouge", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost G, C
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case CATERPIE_56:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Signs of Evolution", {
            text "Search your deck for a Metapod and a Butterfree card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C
            onAttack {
              my.deck.search(max: 2, "Select a Metapod and a Butterfree", {it.name == "Metapod" || it.name == "Butterfree"}, {CardList list ->
                list.filterByNameEquals("Metapod").size() <= 1 && list.filterByNameEquals("Butterfree").size() <= 1
              }).moveTo(my.hand)
            }
          }
          move "String Shot", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            onAttack {
              damage 10
              afterDamage {
                apply PARALYZED
              }
            }
          }
        };
      case CHARMANDER_57:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Singe", {
            text "The Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              apply BURNED
            }
          }

        };
      case CHARMANDER_58:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Headbutt", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Slash", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case CLEFAIRY_59:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Gesture", {
            text "Choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
            energyCost C
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw defending, opp.bench.select()
            }
          }
          move "Moon Kick", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case CUBONE_60:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Beat", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C
            onAttack {
              damage 20, opp.all.select()
            }
          }

        };
      case DIGLETT_61:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Dig Under", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            onAttack {
              noWrDamage(10,opp.all.select())
            }
          }

        };
      case DODUO_62:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Run Around", {
            text "Switch Doduo with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.bench : "No pokemon to switch Doduo with"
            }
            onAttack {
              sw self, my.bench.select()
            }
          }
          move "Random Peck", {
            text "10× damage. Flip 2 coins. This attack does 10 damage plus 10 more damage for each heads."
            energyCost C, C
            onAttack {
              flip 2, {damage 10}
            }
          }

        };
      case GASTLY_63:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Slow Trip Gas", {
            text "At the end of your opponent’s next turn, the Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              delayed{
                before BETWEEN_TURNS, {
                  if(bg.currentTurn == self.owner.opposite){
                    apply CONFUSED, self.owner.opposite.pbg.active
                  }
                }
                unregisterAfter 2
                after SWITCH, self.owner.opposite.pbg.active, {unregister()}
                after EVOLVE, self.owner.opposite.pbg.active, {unregister()}
              }
            }
          }

        };
      case GROWLITHE_64:
        return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Bite", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Flame Tail", {
            text "40 damage."
            energyCost R, C, C
            onAttack {
              damage 40
            }
          }

        };
      case JIGGLYPUFF_65:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Sleep Inducer", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert opp.bench : "There is no Pokémon to switch"
            }
            onAttack {
              def pcs = opp.bench.select("New active")
              sw defending, pcs
              apply ASLEEP, pcs
            }
          }
          move "Quick Blow", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 10
              flip {damage 20}
            }
          }

        };
      case KRABBY_66:
        return basic (this, hp:HP050, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Irongrip", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Nap", {
            text "Remove 2 damage counters from Krabby (remove 1 of there is only 1)."
            energyCost W
            attackRequirement {
              assert self.numberOfDamageCounters : "your Krabby does not have any damage counters"
            }
            onAttack {
              heal 20, self
            }
          }

        };
      case MAGIKARP_67:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Surprise Attack", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {damage 10}
            }
          }
          move "Ascension", {
            text "Search your deck for a card that evolves from Magikarp and put it on Magikarp. (This counts as evolving Magikarp.) Shuffle your deck afterward."
            energyCost W, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }

        };
      case MAGNEMITE_68:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              flipThenApplySC CONFUSED
            }
          }
          move "Speed Ball", {
            text "20 damage."
            energyCost L, C
            onAttack {
              damage 20
            }
          }

        };
      case MEOWTH_69:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 1
            }
          }
          move "Cat Kick", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case NIDORAN_FEMALE_70:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Look for Friends", {
            text "Reveal cards from your deck until you reveal a Basic Pokémon. Show that card to your opponent and put it into your hand. Shuffle the other revealed cards into your deck. (If you don’t reveal a Basic Pokémon, shuffle all the revealed cards back into your deck.)"
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def revealCard = new CardList();
              def ind = 0
              def curCard
              while(ind < my.deck.size()){
                curCard = my.deck.get(ind)
                ind+=1
                revealCard.add(curCard)
                if(curCard.cardTypes.is(BASIC))
                  break
              }
              revealCard.showToMe("Drawn cards")
              revealCard.showToOpponent("revealed cards")
              revealCard.clear()
              revealCard.add(curCard)
              revealCard.moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Bite", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case NIDORAN_MALE_71:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Call for Family", {
            text "Search your deck for a Nidoran Female or Nidoran Male card and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && (it.name == "Nidoran♀" || it.name == "Nidoran♂")}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Double Stab", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2,{damage 10}
            }
          }

        };
      case PARAS_72:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 2, delegate)
          }
          move "Toxic SPore", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              damage 10
              afterDamage {flipThenApplySC POISONED}
            }
          }

        };
      case PIDGEY_73:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Corner", {
            text "The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
            energyCost C
            onAttack {
              cantRetreat defending
            }
          }
          move "Gust", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case PIKACHU_74:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Plasma", {
            text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Pikachu."
            energyCost C
            onAttack {
              damage 10
              flip {
                afterDamage{attachEnergyFrom(type : L, my.discard, self)}
              }
            }
          }

        };
      case POLIWAG_75:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Spiral Attack", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              flipThenApplySC CONFUSED
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
      case PONYTA_76:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case RATTATA_77:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 1
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
      case SEEL_78:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Horn Hazzard", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost W
            onAttack {
              flip {damage 30}
            }
          }

        };
      case SHELLDER_79:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Minimize", {
            text "During your opponent’s next turn, any damage done to Shellder by attacks in reduced by 20 (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              reduceDamageNextTurn(hp(20),thisMove)
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
      case SLOWPOKE_80:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Confusion Wave", {
            text "Both Slowpoke and the Defending Pokémon are now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
              apply CONFUSED, self
            }
          }

        };
      case SPEAROW_81:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Claw", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {damage 10}
            }
          }
          move "Wing Attack", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case SQUIRTLE_82:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Sleepy Ball", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W
            onAttack {
              damage 10
              afterDamage {flipThenApplySC ASLEEP}
            }
          }

        };
      case SQUIRTLE_83:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Bubble", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
          move "Smash Turn", {
            text "20 damage. After your attack, you may switch Squirtle with 1 of your Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 20
              afterDamage{
                if(my.bench){
                  if(confirm("switch Squirtle with 1 of your Benched Pokémon?")){
                    sw self, my.bench.select("New active")
                  }
                }
              }
            }
          }

        };
      case VENONAT_84:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Psycho Waves", {
            text "Discard an Energy card attached to Venonat. The Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              discardSelfEnergy C
              apply CONFUSED
            }
          }
          move "Bite", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case VOLTORB_85:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          pokeBody "Floating Electrons", {
            text "As long as Voltorb has any Energy attached to it, Voltorb’s Retreat Cost is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(C)) {
                h.object = 0
              }
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case WEEDLE_86:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Call for Family", {
            text "Search your deck for up to 2 [G] Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert bench.notFull
              assert deck.notEmpty
            }
            onAttack {
              int count = bench.freeBenchCount>=2?2:1
              deck.search (max: count, {it.cardTypes.is(BASIC) && it.types.contains(G)}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Poison Spurt", {
            text "Discard a [G] Energy card attached to Weedle. The Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              discardSelfEnergy G
              apply POISONED
            }
          }

        };
      case BILL_S_MAINTENANCE_87:
        return supporter (this) {
          text "If you have any cards in your hand, shuffle 1 of them into your deck, then draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).select("card to shuffle into your deck").moveTo(hidden: true, my.deck)
            shuffleDeck()
            draw 3
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard)
          }
        };
      case CELIO_S_NETWORK_88:
        return supporter (this) {
          text "Search your deck for a Basic Pokémon or Evolution card (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.deck.search(count: 1,"Search your deck for a Basic Pokémon or Evolution card",{(it.cardTypes.is(BASIC) || it.cardTypes.is(EVOLUTION)) && !(it.cardTypes.is(EX))}).showToOpponent("Selected card").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case ENERGY_REMOVAL_2_89:
        return basicTrainer (this) {
          text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent’s Pokémon and discard it."
          onPlay {
            flip {
              discardOpponentEnergy(Target.OPP_ALL)
            }
          }
          playRequirement{
          }
        };
      case ENERGY_SWITCH_90:
        return basicTrainer (this) {
          text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
          onPlay {
            if(my.bench && my.all.findAll{it.cards.filterByType(BASIC_ENERGY)}){
              def pcs = my.all.findAll{it.cards.filterByType(BASIC_ENERGY)}.select("Move energy from")
              def tar = my.all.findAll{it != pcs}.select("Move energy to")
              moveEnergy(basic: true, pcs, tar)
            }
          }
          playRequirement{
          }
        };
      case EXP_ALL_91:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAttach EXP.ALL to 1 of your Pokémon (excluding Pokémon-ex and Pokémon that has an owner in its name) that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nDuring your opponent’s turn, if 1 of your Active Pokémon would be Knocked Out by your opponent’s attack, you may take 1 basic Energy card attached to that Knocked Out Pokémon and attach it to the Pokémon with EXP.ALL attached to it. If you do, discard EXP.ALL."
          def eff
          onPlay {reason->
            eff = delayed {
              before KNOCKOUT, {
                if (!self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.bench.notEmpty && self.owner.pbg.active.cards.filterByType(BASIC_ENERGY)) {
                  bc "EXP.ALL activates"
                  if (oppConfirm("EXP.ALL: Move an Energy from ${self.owner.pbg.active} to $self ?")) {
                    def energy = self.owner.pbg.active.cards.filterByType(BASIC_ENERGY).oppSelect("Select an Energy from the Active Pokemon to move to the holder of EXP.ALL").first()
                    energySwitch(self.owner.pbg.active, self, energy)
                    discard thisCard
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          allowAttach {to->
            to.topPokemonCard.cardTypes.isNot(OWNERS_POKEMON) && to.topPokemonCard.cardTypes.isNot(EX)
          }
        };
      case GREAT_BALL_92:
        return basicTrainer (this) {
          text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and put it onto your Bench. Shuffle your deck afterward."
          onPlay {
            my.deck.search(count : 1,"Search your deck for a Basic Pokémon (excluding Pokémon-ex)",{it.cardTypes.is(BASIC) && it.cardTypes.isNot(EX)}).each{
              deck.remove(it)
              benchPCS(it)
            }
          }
          playRequirement{
            assert my.bench.notFull
          }
        };
      case LIFE_HERB_93:
        return basicTrainer (this) {
          text "Flip a coin. If heads, choose 1 of your Pokémon (excluding Pokémon-ex), and remove all Special Conditions and 6 damage counters from that Pokémon (all if there are less than 6)."
          onPlay {
            flip {
              def tar = my.all.findAll{(it.numberOfDamageCounters || !(it.noSPC())) && it.topPokemonCard.cardTypes.isNot(EX)}
              if(tar){
                def pcs = tar.select("select 1 of your Pokémon (excluding Pokémon-ex) to remove all Special Conditions and 6 damage counters")
                clearSpecialCondition(pcs,Source.TRAINER_CARD)
                heal 60, pcs
              }
            }
          }
          playRequirement{
            assert my.all.findAll{(it.numberOfDamageCounters || !(it.noSPC())) && it.topPokemonCard.cardTypes.isNot(EX)}
          }
        };
      case MT__MOON_94:
        return stadium (this) {
          text "Any Pokémon (both yours and your opponent’s) with maximum HP less than 70 can’t use any Poké-Powers.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def effect1
          def effect2
          onPlay {
            effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
              if (h.effect.target.fullHP.value < 70 && h.effect.ability instanceof PokePower) {
                h.object=true
              }
            }
            effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if ((h.effect.target as Card).fullHP.value < 70) {
                h.object=true
              }
            }
            new CheckAbilities().run(bg)
          }
          onRemoveFromPlay{
            effect1.unregister()
            effect2.unregister()
            new CheckAbilities().run(bg)
          }
        };
      case POKE_BALL_95:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your deck for a Basic Pokémon or Evolution card, show it to your opponent and put it into your hand. Shuffle your deck afterward."
          onPlay {
            flip{
              my.deck.search(count : 1,"Basic Pokémon or Evolution card", {it.cardTypes.is(BASIC) || it.cardTypes.is(EVOLUTION)}).moveTo(my.hand)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      case POKEDEX_HANDY909_96:
        return basicTrainer (this) {
          text "Shuffle your deck. Look at 6 cards from the top of your deck, then put them back on top of your deck in any order."
          onPlay {
            def list=rearrange(my.deck.subList(0,6), "Rearrange top 6 cards in your deck")
            my.deck.setSubList(0, list)
          }
          playRequirement{
            assert my.deck

          }
        };
      case POKEMON_REVERSAL_97:
        return basicTrainer (this) {
          text "Flip a coin. If heads, choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          onPlay {
            if(opp.bench){
              flip{
                sw opp.active, opp.bench.select(), TRAINER_CARD
              }
            }
          }
          playRequirement{
            assert opp.bench : "Opponent has no benched Pokemon"
          }
        };
      case PROF__OAK_S_RESEARCH_98:
        return supporter (this) {
          text "Shuffle your hand into your deck, then draw 5 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).moveTo(hidden: true, my.deck)
            shuffleDeck()
            draw 5
          }
          playRequirement{
            assert my.deck.notEmpty || (my.hand.getExcludedList(thisCard).size() >0)
          }
        };
      case SUPER_SCOOP_UP_99:
        return basicTrainer (this) {
          text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
          onPlay {
            flip{
              def pcs = my.all.select()
              pcs.cards.moveTo(hand)
              removePCS(pcs)
            }
          }
          playRequirement{
            assert my.bench : "you don't have pokemon to return to your hand"
          }
        };
      case VS_SEEKER_100:
        return basicTrainer (this) {
          text "Search your discard pile for a Supporter card, show it to your opponent, and put it into your hand."
          def thisTurnSupporter
          globalAbility{
            delayed {
              after PLAY_TRAINER, {
                bc "after PLAY_TRAINER"
                if(ef.cardToPlay.cardTypes.is(SUPPORTER)){
                  bc "thisTurnSupporter"
                  thisTurnSupporter = ef.cardToPlay
                  bc "$thisTurnSupporter"
                }
              }
              after BETWEEN_TURNS, {
                thisTurnSupporter = null
              }
            }
          }
          onPlay {
            if(thisTurnSupporter){
              my.discard.getExcludedList(thisTurnSupporter).filterByType(SUPPORTER).select("Select one Supporter card").showToOpponent("Selected supporter (Supporters you play remain in play untill your turn ends)").moveTo(my.hand)
            } else {
              my.discard.filterByType(SUPPORTER).select("Select one Supporter card").showToOpponent("Selected supporter").moveTo(my.hand)
            }
          }
          playRequirement{
            if(thisTurnSupporter){
              assert my.discard.getExcludedList(thisTurnSupporter).filterByType(SUPPORTER) : "You have no Supporters in your discard (Supporters you play remain in play untill your turn ends)"
            } else {
              assert my.discard.filterByType(SUPPORTER) : "You have no Supporters in your discard"
            }
          }
        };
      case POTION_101:
        return basicTrainer (this) {
          text "Remove 2 damage counters from 1 of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
          onPlay {
            def tar = my.all.findAll{it.numberOfDamageCounters}
            if(tar){
              def pcs = tar.select()
              heal 20, pcs
            }
          }
          playRequirement{
          }
        };
      case SWITCH_102:
        return basicTrainer (this) {
          text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
          onPlay {
            sw my.active, my.bench.select()
          }
          playRequirement{
            assert my.bench : "No benched Pokémon"
          }
        };
      case MULTI_ENERGY_103:
        return specialEnergy (this, [[C]]) {
          text "Attach Multi Energy to 1 of your Pokémon. While in play, Multi Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) Multi Energy provides [C] Energy when attached to a Pokémon that already has Special Energy cards attached to it."
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          getEnergyTypesOverride{
            if(self == null || self.cards.filterByType(SPECIAL_ENERGY).size() > 1) {
              return [[C] as Set]
            }
            else {
              return [[R, D, F, G, W, Y, L, M, P] as Set]
            }
          }
        };
      case BLASTOISE_EX_104:
        return evolution (this, from:"Wartortle", hp:HP150, type:WATER, retreatCost:3) {
          weakness LIGHTNING
          pokePower "Energy Rain", {
            text "As often as you like during your turn (before your attack), you may attach a [W] Energy card from your hand to 1 of your Pokémon. Put 1 damage counter on that Pokémon. This power can’t be used if Blastoise ex is affected by a Special Condition."
            actionA {
            checkNoSPC()
            assert my.hand.filterByBasicEnergyType(W) : "No [W] in hand"
            powerUsed()
            def card = my.hand.filterByBasicEnergyType(W).first()
            def tar = my.all.select("To?")
            attachEnergy(tar, card)
            directDamage 10, tar, SRC_ABILITY
          }
          }
          move "Hyper Whirlpool", {
            text "80 damage. Flip a coin until you get tails. For each heads, your opponent discards an Energy card attached to the Defending Pokémon."
            energyCost W, W, W, C
            onAttack {
              damage 80
              flipUntilTails {
                discardDefendingEnergy()
              }
            }
          }

        };
      case CHARIZARD_EX_105:
        return evolution (this, from:"Charmeleon", hp:HP160, type:FIRE, retreatCost:2) {
          weakness LIGHTNING
          weakness WATER
          pokeBody "Energy Flame", {
            text "All Energy attached to Charizard ex are [R] Energy instead of its usual type."
            getterA GET_ENERGY_TYPES, { holder->
              if(holder.effect.target == self) {
                int count = holder.object.size()
                holder.object = (1..count).collect{[FIRE] as Set}
              }
            }
          }
          move "Slash", {
            text "50 damage."
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }
          move "Burn Down", {
            text "200 damage. Discard 5 [R] Energy attached to Charizard ex. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, and any other effects on the Defending Pokémon."
            energyCost R, R, R, R, R
            onAttack {
              swiftDamage(200, defending)
              discardSelfEnergy R,R,R,R,R
            }
          }

        };
      case CLEFABLE_EX_106:
        return evolution (this, from:"Clefairy", hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Metronome", {
            text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) (No matter what type that Pokémon is, Clefable ex’s type is still [C].) Clefable ex performs that attack."
            energyCost C, C
            onAttack {
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              def move=choose(moveList, labelList)
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }
          move "Moon Impact", {
            text "40 damage."
            energyCost C, C
            onAttack {
              damage 40
            }
          }

        };
      case ELECTRODE_EX_107:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          pokePower "Extra Energy Bomb", {
            text "Once during your turn (before your attack), you may discard Electrode ex and all the cards attached to it (this counts as Knocking Out Electrode ex). If you do, search your discard pile for 5 Energy cards and attach them to any of your Pokémon (excluding Pokémon-ex) in any way you like. This power can’t be used if Electrode ex is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              powerUsed()
              new Knockout(self).run(bg)
              5.times{ attachEnergyFrom(my.discard, my.all.findAll{!it.EX}) }
            }
          }
          move "Crush and Burn", {
            text "30+ damage. You may discard as many Energy as you like attached to your Pokémon in play. If you do, this attack does 30 damage plus 20 more damage for each Energy you discarded."
            energyCost L, C
            onAttack {
              def count=0
              while(1){
                def pl=(my.all.findAll {it.cards.filterByType(ENERGY)})
                if(!pl) break;
                def src=pl.select("Source for energy (cancel to stop)", false)
                if(!src) break;
                def card=src.cards.filterByType(ENERGY).select("Card to discard").first()
                discard card
                count++
              }
              damage 30+20*count
            }
          }

        };
      case GENGAR_EX_108:
        return evolution (this, from:"Haunter", hp:HP150, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          weakness PSYCHIC
          resistance COLORLESS
          resistance FIGHTING
          move "Poltergeist", {
            text "40+ damage. Look at your opponent’s hand. This attack does 40 damage plus 10 more damage for each Trainer card in your opponent’s hand."
            energyCost P, C
            onAttack {
              damage 40
              opp.hand.showToMe("Opponent’s hand")
              damage 10*opp.hand.findAll{it.cardTypes.is(TRAINER)}.size()
            }
          }
          move "Prize Count", {
            text "60+ damage. If you have more Prize cards left than your opponent, this attack does 60 damage plus 40 more damage."
            energyCost P, P, C
            onAttack {
              damage 60
              if(my.prizeCardSet.size() > opp.prizeCardSet.size()) damage 40
            }
          }

        };
      case GYARADOS_EX_109:
        return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
          weakness LIGHTNING
          move "Twister", {
            text "40 damage. Flip 2 coins. For each heads, choose 1 Energy attached to the Defending Pokémon, if any, and discard it. If both are tails, this attack does nothing."
            energyCost W, C
            onAttack {
              def discardTimes = 0

              flip 2, { discardTimes += 1}
              if (discardTimes) damage 40 else bc "$thisMove failed due to 2 TAILS."

              afterDamage {
                discardTimes.times{ discardDefendingEnergy() }
              }
            }
          }
          move "Dragon Rage", {
            text "100 damage."
            energyCost W, W, C, C, C
            onAttack {
              damage 100
            }
          }

        };
      case MR__MIME_EX_110:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          pokeBody "Magic Odds", {
            text "If Mr. Mime ex would be damaged by an attack, prevent that attack’s damage done to Mr. Mime ex if that damage is 10, 30, 50, 70, 90, 110, 130, 150, or 170."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && (it.dmg.value == 10 || it.dmg.value == 30 || it.dmg.value == 50 || it.dmg.value == 70 || it.dmg.value == 90 || it.dmg.value == 110 || it.dmg.value == 130 || it.dmg.value == 150  || it.dmg.value == 170)) {
                    bc "Magic Odds prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Breakdown", {
            text "Count the number of cards in your opponent’s hand. Put that many damage counters on the Defending Pokémon."
            energyCost P, C
            onAttack {
              directDamage 10*opp.hand.size(), defending
            }
          }

        };
      case MR__MIME_EX_111:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          pokeBody "Magic Evens", {
            text "If Mr. Mime ex would be damaged by an attack, prevent that attack’s damage done to Mr. Mime ex if that damage is 20, 40, 60, 80, 100, 120, 140, 160, or 180."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && (it.dmg.value == 20 || it.dmg.value == 40 || it.dmg.value == 60 || it.dmg.value == 80 || it.dmg.value == 100 || it.dmg.value == 130 || it.dmg.value == 140 || it.dmg.value == 160  || it.dmg.value == 180)) {
                    bc "Magic Evens prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Breakdown", {
            text "Count the number of cards in your opponent’s hand. Put that many damage counters on the Defending Pokémon."
            energyCost P, C
            onAttack {
              directDamage 10*opp.hand.size(), defending
            }
          }

        };
      case VENUSAUR_EX_112:
        return evolution (this, from:"Ivysaur", hp:HP150, type:GRASS, retreatCost:3) {
          weakness FIRE
          weakness PSYCHIC
          pokePower "Energy Trans", {
            text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Venusaur ex is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.findAll {it.cards.energyCount(G)>0}
              assert my.all.size()>=2

              powerUsed()
              def src=my.all.findAll {it.cards.energyCount(G)>0}.select("Source for [G]")
              def card=src.cards.filterByEnergyType(G).select("Card to move").first()
              def tar=my.all
              tar.remove(src)
              tar=tar.select("Target for [G]")
              energySwitch(src, tar, card)
            }
          }
          move "Pollen Hazard", {
            text "20 damage. The Defending Pokémon is now Poisoned, Burned, and Confused."
            energyCost G, C, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
              applyAfterDamage BURNED
              applyAfterDamage CONFUSED

            }
          }
          move "Solarbeam", {
            text "90 damage."
            energyCost G, G, G, C, C
            onAttack {
              damage 90
            }
          }

        };
      case CHARMANDER_113:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Flare", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Charmander."
            energyCost C, C
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case ARTICUNO_EX_114:
        return basic (this, hp:HP110, type:WATER, retreatCost:2) {
          weakness METAL
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Articuno ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Articuno ex. If you do, you may also move any number of basic [W] Energy cards attached to your Pokémon to Articuno ex."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")){
                powerUsed()
                sw my.active, self
                while(1){
                  def pl=(my.all.findAll {it.cards.filterByEnergyType(W) && it!=self})
                  if(!pl) break;
                  def src=pl.select("Source for [W] energy (cancel to stop moving)", false)
                  if(!src) break;
                  def card=src.cards.filterByEnergyType(W).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Cold Crush", {
            text "50 damage. You may discard an Energy card attached to Articuno ex. If you do, your opponent discards an Energy card attached to the Defending Pokémon."
            energyCost W, W, C
            onAttack {
              damage 50
              if(confirm("Discard an Energy card attached to $self?")){
                discardSelfEnergy C
                discardDefendingEnergy()
              }
            }
          }

        };
      case MOLTRES_EX_115:
        return basic (this, hp:HP110, type:FIRE, retreatCost:2) {
          weakness WATER
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Moltres ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Moltres ex. If you do, you may also move any number of basic [R] Energy cards attached to your Pokémon to Moltres ex."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")) {
                powerUsed()
                sw my.active, self
                while (1) {
                  def pl = (my.all.findAll { it.cards.filterByEnergyType(R) && it != self })
                  if (!pl) break;
                  def src = pl.select("Source for [R] energy (cancel to stop moving)", false)
                  if (!src) break;
                  def card = src.cards.filterByEnergyType(R).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }

          move "Crushing Flames", {
            text "60 damage. You may discard an Energy card attached to Moltres ex. If you do, the Defending Pokémon is now Confused."
            energyCost R, R, C
            onAttack {
              damage 60
              if(confirm("Discard an Energy card attached to $self?")){
                discardSelfEnergy C
                applyAfterDamage CONFUSED
              }
            }
          }
        };
      case ZAPDOS_EX_116:
        return basic (this, hp:HP110, type:LIGHTNING, retreatCost:2) {
          weakness LIGHTNING
          pokePower "Legendary Ascent", {
            text "Once during your turn, when you put Zapdos ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Zapdos ex. If you do, you may also move any number of basic [L] Energy cards attached to your Pokémon to Zapdos ex."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")) {
                powerUsed()
                sw my.active, self
                while (1) {
                  def pl = (my.all.findAll { it.cards.filterByEnergyType(L) && it != self })
                  if (!pl) break;
                  def src = pl.select("Source for [L] energy (cancel to stop moving)", false)
                  if (!src) break;
                  def card = src.cards.filterByEnergyType(L).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Electron Crush", {
            text "50+ damage. You may discard an Energy card attached to Zapdos ex. If you do, this attack does 50 damage plus 20 more damage."
            energyCost L, L, C
            onAttack {
              damage 50
              if(confirm("Discard an Energy card attached to $self for +20?")){
                discardSelfEnergy C
                damage 20
              }
            }
          }
        };
      default:
        return null;
    }
  }

}
