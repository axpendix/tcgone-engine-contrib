package tcgwars.logic.impl.pokemod

import tcgwars.logic.effect.gm.PlayCard
import tcgwars.logic.effect.gm.PlayStadium
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
public enum PokemodBaseSet implements LogicCardInfo {

  ALAKAZAM_1 ("Alakazam", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  BLASTOISE_2 ("Blastoise", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BLASTOISE_111 ("Blastoise", 2, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CHANSEY_3 ("Chansey", 3, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CHARIZARD_4 ("Charizard", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CHARIZARD_112 ("Charizard", 4, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CLEFAIRY_5 ("Clefairy", 5, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GYARADOS_6 ("Gyarados", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HITMONCHAN_7 ("Hitmonchan", 7, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MACHAMP_8 ("Machamp", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGNETON_9 ("Magneton", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MEWTWO_10 ("Mewtwo", 10, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  NIDOKING_11 ("Nidoking", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NINETALES_12 ("Ninetales", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  POLIWRATH_13 ("Poliwrath", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  RAICHU_14 ("Raichu", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VENUSAUR_15 ("Venusaur", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VENUSAUR_113 ("Venusaur", 15, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ZAPDOS_16 ("Zapdos", 16, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  BEEDRILL_17 ("Beedrill", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DRAGONAIR_18 ("Dragonair", 18, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUGTRIO_19 ("Dugtrio", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ELECTABUZZ_20 ("Electabuzz", 20, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_21 ("Electrode", 21, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  PIDGEOTTO_22 ("Pidgeotto", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ARCANINE_23 ("Arcanine", 23, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARMELEON_24 ("Charmeleon", 24, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DEWGONG_25 ("Dewgong", 25, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRATINI_26 ("Dratini", 26, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  FARFETCH_D_27 ("Farfetch'd", 27, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  GROWLITHE_28 ("Growlithe", 28, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  HAUNTER_29 ("Haunter", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  IVYSAUR_30 ("Ivysaur", 30, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  JYNX_31 ("Jynx", 31, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KADABRA_32 ("Kadabra", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KAKUNA_33 ("Kakuna", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MACHOKE_34 ("Machoke", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAGIKARP_35 ("Magikarp", 35, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MAGMAR_36 ("Magmar", 36, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  NIDORINO_37 ("Nidorino", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  POLIWHIRL_38 ("Poliwhirl", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PORYGON_39 ("Porygon", 39, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  RATICATE_40 ("Raticate", 40, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SEEL_41 ("Seel", 41, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  WARTORTLE_42 ("Wartortle", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ABRA_43 ("Abra", 43, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BULBASAUR_44 ("Bulbasaur", 44, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CATERPIE_45 ("Caterpie", 45, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHARMANDER_46 ("Charmander", 46, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DIGLETT_47 ("Diglett", 47, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DODUO_48 ("Doduo", 48, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DROWZEE_49 ("Drowzee", 49, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GASTLY_50 ("Gastly", 50, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KOFFING_51 ("Koffing", 51, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  MACHOP_52 ("Machop", 52, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGNEMITE_53 ("Magnemite", 53, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  METAPOD_54 ("Metapod", 54, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDORAN_MALE_55 ("Nidoran♂", 55, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ONIX_56 ("Onix", 56, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PIDGEY_57 ("Pidgey", 57, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_58 ("Pikachu", 58, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  POLIWAG_59 ("Poliwag", 59, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PONYTA_60 ("Ponyta", 60, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  RATTATA_61 ("Rattata", 61, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SANDSHREW_62 ("Sandshrew", 62, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SQUIRTLE_63 ("Squirtle", 63, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARMIE_64 ("Starmie", 64, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  STARYU_65 ("Staryu", 65, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TANGELA_66 ("Tangela", 66, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VOLTORB_67 ("Voltorb", 67, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  VULPIX_68 ("Vulpix", 68, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  WEEDLE_69 ("Weedle", 69, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CLEFAIRY_DOLL_70 ("Clefairy Doll", 70, Rarity.RARE, [TRAINER]),
  COMPUTER_SEARCH_71 ("Computer Search", 71, Rarity.RARE, [TRAINER]),
  DEVOLUTION_SPRAY_72 ("Devolution Spray", 72, Rarity.RARE, [TRAINER]),
  IMPOSTER_PROFESSOR_OAK_73 ("Impostor Professor Oak", 73, Rarity.RARE, [TRAINER]),
  ITEM_FINDER_74 ("Item Finder", 74, Rarity.RARE, [TRAINER]),
  LASS_75 ("Lass", 75, Rarity.RARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_76 ("Pokémon Breeder", 76, Rarity.RARE, [TRAINER]),
  POKEMON_TRADER_77 ("Pokémon Trader", 77, Rarity.RARE, [TRAINER]),
  SCOOP_UP_78 ("Scoop Up", 78, Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_REMOVAL_79 ("Super Energy Removal", 79, Rarity.RARE, [TRAINER]),
  DEFENDER_80 ("Defender", 80, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETRIEVAL_81 ("Energy Retrieval", 81, Rarity.UNCOMMON, [TRAINER]),
  FULL_HEAL_82 ("Full Heal", 82, Rarity.UNCOMMON, [TRAINER]),
  MAINTENANCE_83 ("Maintenance", 83, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_84 ("PlusPower", 84, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CENTER_85 ("Pokémon Center", 85, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_FLUTE_86 ("Pokémon Flute", 86, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_87 ("Pokédex", 87, Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_OAK_88 ("Professor Oak", 88, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  REVIVE_89 ("Revive", 89, Rarity.UNCOMMON, [TRAINER]),
  SUPER_POTION_90 ("Super Potion", 90, Rarity.UNCOMMON, [TRAINER]),
  BILL_91 ("Bill", 91, Rarity.COMMON, [TRAINER]),
  ENERGY_REMOVAL_92 ("Energy Removal", 92, Rarity.COMMON, [TRAINER]),
  GUST_OF_WIND_93 ("Gust of Wind", 93, Rarity.COMMON, [TRAINER]),
  POTION_94 ("Potion", 94, Rarity.COMMON, [TRAINER]),
  SWITCH_95 ("Switch", 95, Rarity.COMMON, [TRAINER]),
  DOUBLE_COLORLESS_ENERGY_96 ("Double Colorless Energy", 96, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  FIGHTING_ENERGY ("Fighting Energy_97", 97, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_98 ("Fire Energy", 98, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  GRASS_ENERGY_99 ("Grass Energy", 99, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_100 ("Lightning Energy", 100, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_101 ("Psychic Energy", 101, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_102 ("Water Energy", 102, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  DUAL_BALL_103 ("Dual Ball", 103, Rarity.COMMON, [TRAINER]),
  ENERGY_SWITCH_104 ("Energy Switch", 104, Rarity.UNCOMMON, [TRAINER]),
  SUPER_ENERGY_RETRIEVAL_105 ("Super Energy Retrieval", 105, Rarity.RARE, [TRAINER]),
  SUPER_SCOOP_UP_106 ("Super Scoop Up", 106, Rarity.UNCOMMON, [TRAINER]),
  CRUSHING_HAMMER_107 ("Crushing Hammer", 107, Rarity.SECRET, [TRAINER, G_SPEC]),
  DOWSING_MACHINE_108 ("Dowsing Machine", 108, Rarity.SECRET, [TRAINER, G_SPEC]),
  Elixir_109 ("Elixir", 109, Rarity.SECRET, [TRAINER, G_SPEC]),
  Hacker_110 ("Hacker", 110, Rarity.SECRET, [TRAINER, G_SPEC]),
  MEWTWO_114 ("Mewtwo", 114, Rarity.SECRET, [POKEMON, BASIC, _PSYCHIC_]),
  SQUIRTLE_115 ("Squirtle", 115, Rarity.SECRET, [POKEMON, BASIC, _WATER_]),
  KOFFING_116 ("Koffing", 116, Rarity.SECRET, [POKEMON, BASIC, _GRASS_]),
  ARCANINE_117 ("Arcanine", 117, Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_EX_118 ("Charizard ex", 118, Rarity.SECRET, [POKEMON, EVOLUTION, EX, STAGE2, _FIRE_]),
  BLASTOISE_EX_119 ("Blastoise ex", 119, Rarity.SECRET, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  VENUSAUR_EX_120 ("Venusaur ex", 120, Rarity.SECRET, [POKEMON, EVOLUTION, EX, STAGE2, _GRASS_]),
  MIRACLE_ENERGY_OPTION_1 ("Miracle Energy", 121, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  MIRACLE_ENERGY_OPTION_2 ("Miracle Energy", 122, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodBaseSet(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_BASE_SET;
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
      case ALAKAZAM_1:
      return evolution (this, from:"Kadabra", hp:HP080, type:P, retreatCost:3) {
        weakness P
        pokePower "Damage Swap", {
          text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to another as long as you don't Knock Out that Pokémon. This power can't be used if Alakazam is affected by a Special Condition."
          actionA {
            checkNoSPC()
            assert my.all.find({it.numberOfDamageCounters>0})
            assert my.all.find{it.numberOfDamageCounters < (it.fullHP.value - 10)/10}
            assert my.all.size() > 1

            powerUsed()
            def src=my.all.findAll {it.numberOfDamageCounters>0}.select("Source for damage counter")
            def tar=my.all.findAll {it.numberOfDamageCounters < (it.fullHP.value - 10)/10}
            tar.remove(src)
            tar=tar.select("Target for damage counter")
            src.damage-=hp(10)
            tar.damage+=hp(10)
            bc "Swapped a damage counter from $src to $tar"
            checkFaint()
          }
        }
        move "Confuse Ray", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P, P
          onAttack {
            damage 30
            flip { applyAfterDamage(CONFUSED) }
          }
        }
      };
      case BLASTOISE_2:
      return evolution (this, from:"Wartortle", hp:HP100, type:W, retreatCost:3) {
        weakness L
        pokePower "Rain Dance", {
          text "As often as you like during your turn (before your attack), you may attach 1 [W] Energy Card to 1 of your [W] Pokémon (excluding Pokémon-ex). (This doesn't use up your 1 Energy card attachment for the turn.) This power can't be used if Blastoise is affected by a Special Condition."
          actionA {
            checkNoSPC()
            assert my.hand.filterByBasicEnergyType(W) : "No [W] in hand"
            assert my.all.find{it.types.contains(W) && !it.EX} : "No [W] pokemon"

            powerUsed()
            def card = my.hand.filterByBasicEnergyType(W).first()
            attachEnergy(my.all.findAll {
              it.types.contains(W) && !it.EX
            }.select("To?"), card)
          }
        }
        move "Hydro Pump", {
          text "40+ damage. Does 40 damage plus 10 more damage for each [W] Energy attached to Blastoise but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W, W, W
          onAttack {
            damage 40
            extraEnergyDamage(2, hp(10), W, thisMove)
          }
        }
      };
      case BLASTOISE_111:
      return copy (BLASTOISE_2, this);
      case CHANSEY_3:
      return basic (this, hp:HP120, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Scrunch", {
          text "Flip a coin. If heads, prevent all damage done to Chansey during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
        move "Double-edge", {
          text "80 damage. Chansey does 80 damage to itself."
          energyCost C, C, C, C
          onAttack {
            damage 80
            damage 80, self
          }
        }
      };
      case CHARIZARD_4:
      return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:3) {
        weakness W
        resistance F, MINUS30
        pokePower "Energy Burn", {
          text "As often as you like during your turn (before your attack), you may turn all Basic Energy attached to Charizard into [R] Energy for the rest of the turn. This power can't be used if Charizard is affected by a Special Condition."
          actionA{
            checkNoSPC()
            powerUsed()
            def eff = getter GET_ENERGY_TYPES, { holder->
              if(holder.effect.target == self && holder.effect.card.cardTypes.is(BASIC_ENERGY)) {
                holder.object = [[R] as Set]
              }
            }
            delayed {
              before BETWEEN_TURNS, {
                eff.unregister()
              }
              unregisterAfter 1
            }
          }
        }
        move "Fire Spin", {
          text "100 damage. Discard 2 [R] Energy attached to Charizard in order to use this attack."
          energyCost R, R, R, R
          onAttack {
            damage 100
            discardSelfEnergyInOrderTo(R)
            discardSelfEnergyInOrderTo(R)
          }
        }
      };
      case CHARIZARD_112:
      return copy (CHARIZARD_4, this);
      case CLEFAIRY_5:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Sing", {
          text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost C
          onAttack {
            flip { applyAfterDamage(ASLEEP) }
          }
        }
        move "Metronome", {
          text "Choose 1 of Defending Pokémon's attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding energy cards. (No matter what type the defender is, Clefairy's type is still [C].)"
          energyCost C, C, C
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
      };
      case GYARADOS_6:
      return evolution (this, from:"Magikarp", hp:HP100, type:W, retreatCost:3) {
        weakness L
        resistance F, MINUS30
        move "Dragon Rage", {
          text "50 damage. "
          energyCost W, W, C
          onAttack {
            damage 50
          }
        }
        move "Bubblebeam", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C, C
          onAttack {
            damage 40
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case HITMONCHAN_7:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness P
        move "Jab", {
          text "20 damage. "
          energyCost F
          onAttack {
            damage 20
          }
        }
        move "Special Punch", {
          text "40 damage. "
          energyCost F, F, C
          onAttack {
            damage 40
          }
        }
      };
      case MACHAMP_8:
      return evolution (this, from:"Machoke", hp:HP100, type:F, retreatCost:3) {
        weakness P
        pokePower "Strikes Back", {
          text "Whenever your opponent's attack damages Machamp (even if Machamp is Knoced Out), this power does 10 damage to the attacking Pokémon. (Don't apply Weakness and Resistance.) This power can't be used if Machamp is already Asleep, Confused, or Paralyzed when your opponent attacks."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(bg.currentTurn == self.owner.opposite && !(self.specialConditions) && bg.dm().find({it.to==self && it.dmg.value})){
                bc "Strikes Back activates"
                directDamage(10, ef.attacker as PokemonCardSet)
              }
            }
          }
        }
        move "Seismic Toss", {
          text "60 damage. "
          energyCost F, F, F, C
          onAttack {
            damage 60
          }
        }
      };
      case MAGNETON_9:
      return evolution (this, from:"Magnemite", hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, L, C
          onAttack {
            damage 30
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Selfdestruct", {
          text "80 damage. Does 20 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Magneton does 80 damage to itself."
          energyCost L, L, C, C
          onAttack {
            damage 80
            opp.bench.each({ damage 20, it})
            my.bench.each({ damage 20, it})
            damage 80, self
          }
        }
      };
      case MEWTWO_10:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Psychic", {
          text "10+ damage. Does 10 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
          energyCost P, C
          onAttack {
            damage 10+(10*opp.active.cards.filterByType(ENERGY).size())
          }
        }
        move "Barrier", {
          text "Discard 1 [P] Energy card attached to Mewtwo in order to use this attack. During your opponent's next turn, prevent all effects of attacks, including damage, done to Mewtwo."
          energyCost P, P
          onAttack {
            discardSelfEnergyInOrderTo(P)
            preventAllEffectsNextTurn()
          }
        }
      };
      case NIDOKING_11:
      return evolution (this, from:"Nidorino", hp:HP100, type:G, retreatCost:3) {
        weakness P
        move "Thrash", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Nidoking does 10 damage to itself."
          energyCost G, C
          onAttack {
            damage 30
            flip 1, {damage 10}, {damage 10, self}
          }
        }
        move "Toxic", {
          text "40 damage. The Defending Pokémon is now Poisoned. It now takes 20 Poison damage instead of 10 after each player's turn (even if it was already Poisoned)."
          energyCost G, G, C
          onAttack {
            damage 40
            afterDamage {
              apply POISONED
              extraPoison 1
            }
          }
        }
      };
      case NINETALES_12:
      return evolution (this, from:"Vulpix", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Lure", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon."
          energyCost R
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            def pcs = opp.bench.select("New active")
            targeted (pcs, ATTACK) {
              sw opp.active, pcs
            }
          }
        }
        move "Fire Blast", {
          text "80 damage. Discard 2 [R] Energy cards attached to Ninetales in order to use this attack."
          energyCost R, R, C, C
          onAttack {
            discardSelfEnergyInOrderTo(R)
            discardSelfEnergyInOrderTo(R)
            damage 80
          }
        }
      };
      case POLIWRATH_13:
      return evolution (this, from:"Poliwhirl", hp:HP100, type:W, retreatCost:3) {
        weakness G
        move "Water Gun", {
          text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Poliwrath but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W, C
          onAttack {
            damage 30
            extraEnergyDamage(2, hp(10), W, thisMove)
          }
        }
        move "Whirlpool", {
          text "40 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost W, W, C, C
          onAttack {
            damage 40
            afterDamage { discardDefendingEnergy() }
          }
        }
      };
      case RAICHU_14:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Raichu."
          energyCost L, C, C
          onAttack {
            damage 20
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Thunder", {
          text "60 damage. Flip a coin. If tails, Raichu does 30 damage to itself."
          energyCost L, L, C, C
          onAttack {
            damage 60
            flip 1, {}, {damage 30, self}
          }
        }
      };
      case VENUSAUR_15:
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:2) {
        weakness R
        pokePower "Energy Trans", {
          text "As often as you like during your turn (before your attack), you may take 1 [G] Energy card attached to 1 of your Pokémon and attach it to a different one (excluding Pokémon-ex). This power can't be used if Venusaur is affected by a Special Condition."
          actionA {
            checkNoSPC()
            assert my.all.findAll {it.cards.energyCount(G)>0}
            assert my.all.size()>=2

            powerUsed()
            def src=my.all.findAll {it.cards.energyCount(G)>0}.select("Select source pokemon for grass energy")
            def list = src.cards.filterByEnergyType(G)
            list = list.select(max:list.size(), "Select any amount of grass energy to move")
            def tar=my.all
            tar.remove(src)
            def tars=tar.select("Target for [G]")
            list.each {energySwitch(src, tars, it)}
          }
        }
        move "Solarbeam", {
          text "60 damage. "
          energyCost G, G, G, C
          onAttack {
            damage 60
          }
        }
      };
      case VENUSAUR_113:
      return copy (VENUSAUR_15, this);
      case ZAPDOS_16:
      return basic (this, hp:HP090, type:L, retreatCost:3) {
        resistance F, MINUS30
        move "Thunder", {
          text "60 damage. Flip a coin. If tails, Zapdos does 30 damage to itself."
          energyCost L, L, C, C
          onAttack {
            damage 60
            flip 1, {}, {damage 30, self}
          }
        }
        move "Thunderbolt", {
          text "100 damage. Discard 3 [L] Energy cards attached to Zapdos in order to use this attack."
          energyCost L, L, L, L
          onAttack {
            discardSelfEnergyInOrderTo(L)
            discardSelfEnergyInOrderTo(L)
            discardSelfEnergyInOrderTo(L)
            damage 100
          }
        }
      };
      case BEEDRILL_17:
      return evolution (this, from:"Kakuna", hp:HP090, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Twineedle", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          onAttack {
            flip 2, {damage 30}
          }
        }
        move "Poison Sting", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C, C
          onAttack {
            damage 40
            flip { applyAfterDamage(POISONED) }
          }
        }
      };
      case DRAGONAIR_18:
      return evolution (this, from:"Dratini", hp:HP080, type:C, retreatCost:2) {
        resistance P, MINUS30
        move "Slam", {
          text "Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          onAttack {
            flip 2, { damage 30 }
          }
        }
        move "Hyper Beam", {
          text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost C, C, C, C
          onAttack {
            damage 20
            discardDefendingEnergy()
          }
        }
      };
      case DUGTRIO_19:
      return evolution (this, from:"Diglett", hp:HP080, type:F, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Slash", {
          text "40 damage. "
          energyCost F, F, C
          onAttack {
            damage 40
          }
        }
        move "Earthquake", {
          text "70 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, F
          onAttack {
            damage 70
            my.bench.each({ damage 10, it})
          }
        }
      };
      case ELECTABUZZ_20:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Thunderpunch", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage and Electabuzz does 10 damage to itself."
          energyCost L, C
          onAttack {
            damage 30
            flip 1, {damage 10}, {damage 10, self}
          }
        }
      };
      case ELECTRODE_21:
      return evolution (this, from:"Voltorb", hp:HP080, type:L, retreatCost:1) {
        weakness F
        pokePower "Buzzap", {
          text "At any time during your turn (before your attack) you may Knock Out Electrode and attach it to 1 of your other Pokémon. If you do, choose a type of Energy. Electrode is now an Energy card (instead of a Pokémon) that provides 2 energy of that type. This power can't be used if Electrode is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.bench.notEmpty : "$self is your last pokemon"
            powerUsed()
            new Knockout(self).run(bg)
            def type = choose([R, W, G, L, F, P, M, D, Y],["Fire","Water","Grass","Lightning","Fighting","Psychic","Metal","Darkness","Fairy"],"What type of energy?")
            def pkmnCard = self.topPokemonCard
            def pcs = my.all.findAll{it != self}.select("Choose a pokemon to attach $self to")
            def energyCard
            energyCard = specialEnergy(new CustomCardInfo(ELECTRODE_21).setCardTypes(ENERGY, SPECIAL_ENERGY), [[type],[type]]) {
              onPlay {}
              onRemoveFromPlay {
                bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
              }
            }
            energyCard.player = thisCard.player
            bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
            attachEnergy(pcs, energyCard)
            bc "$energyCard is now a Special Energy Card that provides 2 [$type] energy attached to $pcs"
          }
        }
        move "Electric Shock", {
          text "50 damage. Flip a coin. If tails, Electrode does 10 damage to itself."
          energyCost L, L, C
          onAttack {
            damage 50
            flip 1, {}, {damage 10, self}
          }
        }
      };
      case PIDGEOTTO_22:
      return evolution (this, from:"Pidgey", hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        def turnCount=-1
        HP lastDamage=null
        customAbility {
          delayed (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if(bg().currentTurn==self.owner.opposite) {
                turnCount=bg.turnCount
                lastDamage=bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
              }
            }
          }
        }
        move "Whirlwind", {
          text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          onAttack {
            damage 20
            whirlwind()
          }
        }
        move "Mirror Move", {
          text "If Pidgeotto was attacked last turn, do the final result of that attack on Pidgeotto to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {
            assert lastDamage && turnCount+1==bg.turnCount
          }
          onAttack {
            damage lastDamage.value
          }
        }
      };
      case ARCANINE_23:
      return evolution (this, from:"Growlithe", hp:HP100, type:R, retreatCost:3) {
        weakness W
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Arcanine in order to use this attack."
          energyCost R, R, C
          onAttack {
            damage 50
            discardSelfEnergyInOrderTo(R)
          }
        }
        move "Take Down", {
          text "80 damage. Arcanine does 30 damage to itself."
          energyCost R, R, C, C
          onAttack {
            damage 80
            damage 30, self
          }
        }
      };
      case CHARMELEON_24:
      return evolution (this, from:"Charmander", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Slash", {
          text "30 damage. "
          energyCost R, C
          onAttack {
            damage 30
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Charmeleon in order to use this attack."
          energyCost R, R, C
          onAttack {
            damage 50
            discardSelfEnergyInOrderTo(R)
          }
        }
      };
      case DEWGONG_25:
      return evolution (this, from:"Seel", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Aurora Beam", {
          text "40 damage. "
          energyCost W, C, C
          onAttack {
            damage 40
          }
        }
        move "Ice Beam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W, C, C
          onAttack {
            damage 30
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case DRATINI_26:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        resistance P, MINUS30
        move "Pound", {
          text "20 damage. "
          energyCost C
          onAttack {
            damage 20
          }
        }
      };
      case FARFETCH_D_27:
      return basic (this, hp:HP060, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        def Leek_Slap = 0
        move "Leek Slap", {
          text "30 damage. Flip a coin. If tails, this attack does nothing. Either way, you can't use this attack again as long as Farfetch'd stays in play (even putting Farfetch'd on the Bench won't let you use it again)."
          energyCost C
          attackRequirement {
            assert Leek_Slap != 1 : "You have already used Leek Slap"
          }
          onAttack {
            flip { damage 30 }
            Leek_Slap = 1
          }
        }
        move "Pot Smash", {
          text "30 damage. "
          energyCost C, C, C
          onAttack {
            damage 30
          }
        }
      };
      case GROWLITHE_28:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "20 damage. "
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case HAUNTER_29:
      return evolution (this, from:"Gastly", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost P
          onAttack {
            apply ASLEEP
          }
        }
        move "Dream Eater", {
          text "You can't use this attack unless the Defending Pokémon is Asleep."
          energyCost P, P
          attackRequirement {
            assert opp.active.isSPC(ASLEEP)
          }
          onAttack {
            damage 50
          }
        }
      };
      case IVYSAUR_30:
      return evolution (this, from:"Bulbasaur", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Vine Whip", {
          text "30 damage. "
          energyCost G, C, C
          onAttack {
            damage 30
          }
        }
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, G
          onAttack {
            damage 20
            applyAfterDamage(POISONED)
          }
        }
      };
      case JYNX_31:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost P
          onAttack {
            damage 10
            flip 2, {damage 10}
          }
        }
        move "Meditate", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost P, P, C
          onAttack {
            damage 20+10*opp.active.numberOfDamageCounters
          }
        }
      };
      case KADABRA_32:
      return evolution (this, from:"Abra", hp:HP060, type:P, retreatCost:3) {
        weakness P
        move "Recover", {
          text "Discard 1 [P] Energy card attached to Kadabra in order to use this attack. Remove all damage counters from Kadabra."
          energyCost P, P
          attackRequirement {
            assert self.numberOfDamageCounters
          }
          onAttack {
            discardSelfEnergyInOrderTo P
            healAll self
          }
        }
        move "Super Psy", {
          text "50 damage. "
          energyCost P, P, C
          onAttack {
            damage 50
          }
        }
      };
      case KAKUNA_33:
      return evolution (this, from:"Weedle", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Stiffen", {
          text "Flip a coin. If heads, prevent all damage done to Kakuna during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
        move "Poisonpowder", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C
          onAttack {
            flip { applyAfterDamage(POISONED) }
          }
        }
      };
      case MACHOKE_34:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:3) {
        weakness P
        move "Karate Chop", {
          text "Does 50 damage minus 10 damage for each damage counter on Machoke."
          energyCost F, F, C
          onAttack {
            damage 50 - 10*self.numberOfDamageCounters
          }
        }
        move "Submission", {
          text "60 damage. Machoke does 20 damage to itself."
          energyCost F, F, C, C
          onAttack {
            damage 60
            damage 20, self
          }
        }
      };
      case MAGIKARP_35:
      return basic (this, hp:HP030, type:W, retreatCost:0) {
        weakness L
        move "Tackle", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Magikarp."
          energyCost W
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case MAGMAR_36:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Fire Punch", {
          text "30 damage. "
          energyCost R, R
          onAttack {
            damage 30
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Magmar in order to use this attack."
          energyCost R, R, C
          onAttack {
            discardSelfEnergyInOrderTo(R)
            damage 50
          }
        }
      };
      case NIDORINO_37:
      return evolution (this, from:"Nidoran♂", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Double Kick", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          onAttack {
            damage 30
            flip 2, {damage 30}
          }
        }
        move "Horn Drill", {
          text "50 damage. "
          energyCost G, G, C, C
          onAttack {
            damage 50
          }
        }
      };
      case POLIWHIRL_38:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
        weakness G
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost W, C
          onAttack {
            amnesia delegate
          }
        }
        move "Doubleslap", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost W, C, C
          onAttack {
            flip 2, {damage 30}
          }
        }
      };
      case PORYGON_39:
      return basic (this, hp:HP030, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Conversion 1", {
          text "If the Defending Pokémon has a Weakness, you may change it to a type of your choice other than [C]."
          energyCost C
          onAttack {
            // TODO:
          }
        }
        move "Conversion 2", {
          text "Change Porygon's Resistance to a type of your choice other than [C]."
          energyCost C, C
          onAttack {
            // TODO:
          }
        }
      };
      case RATICATE_40:
      return evolution (this, from:"Rattata", hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "20 damage. "
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Super Fang", {
          text "Does damage to the Defending Pokémon equal to half the Defending Pokémon's remaining HP (rounded up to the nearest 10)."
          energyCost C, C, C
          onAttack {
            damage ceil((defending.hp/10)/2)*10
          }
        }
      };
      case SEEL_41:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case WARTORTLE_42:
      return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Withdraw", {
          text "Flip a coin. If heads, prevent all damage done to Wartortle during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost W, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
        move "Bite", {
          text "40 damage. "
          energyCost W, C, C
          onAttack {
            damage 40
          }
        }
      };
      case ABRA_43:
      return basic (this, hp:HP030, type:P, retreatCost:0) {
        weakness P
        move "Psyshock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost P
          onAttack {
            damage 10
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case BULBASAUR_44:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Leech Seed", {
          text "10 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Bulbasaur."
          energyCost G
          onAttack {
            damage 10
            delayed { //TODO: Make sure this effect unregisters
              before APPLY_ATTACK_DAMAGES, {
                if(bg.dm().find{it.to == defending && it.from == self && it.dmg.value}) {
                  heal 10, self
                }
              }
              unregisterAfter 1
            }
          }
        }
      };
      case CATERPIE_45:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "String Shot", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          onAttack {
            damage 10
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case CHARMANDER_46:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Ember", {
          text "30 damage. Discard 1 [R] Energy card attached to Charmander in order to use this attack."
          energyCost R, C
          onAttack {
            discardSelfEnergyInOrderTo(R)
            damage 30
          }
        }
      };
      case DIGLETT_47:
      return basic (this, hp:HP030, type:F, retreatCost:0) {
        weakness G
        resistance L, MINUS30
        move "Dig", {
          text "10 damage. "
          energyCost F
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "30 damage. "
          energyCost F, F
          onAttack {
            damage 30
          }
        }
      };
      case DODUO_48:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Fury Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C
          onAttack {
            damage 10
            flip 3, {damage 10}
          }
        }
      };
      case DROWZEE_49:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, P
          onAttack {
            damage 20
            flip { applyAfterDamage(CONFUSED) }
          }
        }
      };
      case GASTLY_50:
      return basic (this, hp:HP040, type:P, retreatCost:0) {
        weakness D
        resistance F, MINUS30
        move "Sleeping Gas", {
          text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost P
          onAttack {
            flip { applyAfterDamage(ASLEEP) }
          }
        }
        move "Destiny Bond", {
          text "Discard 1 [P] Energy card attached to Gastly in order to use this attack. If a Pokémon Knocks Out Gastly during your opponent's next turn, Knock Out that Pokémon."
          energyCost P, C
          onAttack {
            discardSelfEnergyInOrderTo(P)
            delayed {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.opposite.pbg.active.inPlay){
                  bc "Destiny Bond activates"
                  new Knockout(self.owner.opposite.pbg.active).run(bg)
                }
              }
              after EVOLVE, self, {unregister()}
              after SWITCH, self, {unregister()}
              unregisterAfter 2
            }
          }
        }
      };
      case KOFFING_51:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Foul Gas", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned; if tails, it is now Confused."
          energyCost G
          onAttack {
            flip 1, {
              apply POISONED
            }, {
              apply CONFUSED
            }
          }
        }
      };
      case MACHOP_52:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Low Kick", {
          text "20 damage. "
          energyCost F
          onAttack {
            damage 20
          }
        }
      };
      case MAGNEMITE_53:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            damage 10
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Selfdestruct", {
          text "40 damage. Does 10 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Magnemite does 40 damage to itself."
          energyCost L, C
          onAttack {
            damage 40
            opp.bench.each({ damage 10, it})
            my.bench.each({ damage 10, it})
            damage 40, self
          }
        }
      };
      case METAPOD_54:
      return evolution (this, from:"Caterpie", hp:HP070, type:G, retreatCost:2) {
        weakness R
        move "Stiffen", {
          text "Flip a coin. If heads, prevent all damage done to Metapod during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost C, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
        move "Stun Spore", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, G
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case NIDORAN_MALE_55:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness P
        move "Horn Hazard", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case ONIX_56:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
        weakness G
        move "Rock Throw", {
          text "10 damage. "
          energyCost F
          onAttack {
            damage 10
          }
        }
        move "Harden", {
          text "During your opponent's next turn, whenever 30 or less damage is done to Onix (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
          energyCost F, F
          onAttack {
            bg.em().run(new Harden("Harden", hp(30)))
          }
        }
      };
      case PIDGEY_57:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "10 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          onAttack {
            damage 10
            whirlwind()
          }
        }
      };
      case PIKACHU_58:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Gnaw", {
          text "20 damage. "
          energyCost L
          onAttack {
            damage 20
          }
        }
        move "Thunder Jolt", {
          text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
          energyCost L, C
          onAttack {
            damage 30
            flip 1, {}, {damage 10, self}
          }
        }
      };
      case POLIWAG_59:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness G
        move "Water Gun", {
          text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Poliwag but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
          energyCost W
          onAttack {
            damage 10
            extraEnergyDamage(2,hp(10),W,thisMove)
          }
        }
      };
      case PONYTA_60:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Smash Kick", {
          text "20 damage. "
          energyCost R
          onAttack {
            damage 20
          }
        }
        move "Flame Tail", {
          text "30 damage. "
          energyCost R, R
          onAttack {
            damage 30
          }
        }
      };
      case RATTATA_61:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "20 damage. "
          energyCost C
          onAttack {
            damage 20
          }
        }
      };
      case SANDSHREW_62:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Sand-attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost F
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
      };
      case SQUIRTLE_63:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
        move "Withdraw", {
          text "Flip a coin. If heads, prevent all damage done to Squirtle during your opponent's next turn. (Any other effects of attacks still happen.)"
          energyCost W, C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
      };
      case STARMIE_64:
      return evolution (this, from:"Staryu", hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Recover", {
          text "Discard 1 [W] Energy card attached to Starmie in order to use this attack. Remove all damage counters from Starmie."
          energyCost W, W
          onAttack {
            discardSelfEnergyInOrderTo(W)
            healAll self
          }
        }
        move "Star Freeze", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C, C
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
      };
      case STARYU_65:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Slap", {
          text "20 damage. "
          energyCost W
          onAttack {
            damage 20
          }
        }
      };
      case TANGELA_66:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
        weakness R
        move "Bind", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, C
          onAttack {
            damage 20
            flip { applyAfterDamage(PARALYZED) }
          }
        }
        move "Poisonpowder", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C, C
          onAttack {
            damage 20
            applyAfterDamage(POISONED)
          }
        }
      };
      case VOLTORB_67:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Tackle", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case VULPIX_68:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost R
          onAttack {
            damage 10
            flip { applyAfterDamage(CONFUSED) }
          }
        }
      };
      case WEEDLE_69:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Poison Sting", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          onAttack {
            damage 10
            flip { applyAfterDamage(POISONED) }
          }
        }
      };
      case CLEFAIRY_DOLL_70:
      return basicTrainer (this) {
        text "Play Clefairy Doll as if it were a Basic Pokémon. While in play, Clefairy Doll counts as a Pokémon (instead of a Trainer card.) Clefairy Doll has no attacks, can''t retreat, and can''t be Asleep, Confused, Paralyzed, or Poisoned. If Clefairy Doll is Knocked Out, it doesn''t count as a Knocked Out Pokémon. At any time during tyour turn before your attack, you may discard Clefairy Doll."
        onPlay {
          Card pokemonCard, trainerCard = thisCard
          pokemonCard = basic (new CustomCardInfo(CLEFAIRY_DOLL).setCardTypes(BASIC, POKEMON), hp:HP010, type:COLORLESS, retreatCost:0) {
            customAbility{
              def ef2, acl
              onActivate{
                delayed {
                  before RETREAT, self, {
                    wcu "Cannot retreat"
                    prevent()
                  }
                  before APPLY_SPECIAL_CONDITION, {
                    def pcs=e.getTarget(bg)
                    if(pcs==self){
                      bc "Clefairy Doll is unaffected by Special Conditions"
                      prevent()
                    }
                  }
                  before TAKE_PRIZE, {
                    if(ef.pcs==self){
                      prevent()
                    }
                  }
                }
                if(!ef2){
                  ef2 = delayed {
                    after REMOVE_FROM_PLAY, {
                      if(ef.removedCards.contains(pokemonCard)){
                        bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                        unregister()
                        ef2 = null
                      }
                    }
                  }
                }
                acl = action("Discard Clefairy Doll", [TargetPlayer.SELF]){
                  new Knockout(self).run(bg)
                }
              }
              onDeactivate{
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
      case COMPUTER_SEARCH_71:
      return basicTrainer (this) {
        text "Discard 2 of the other cards from your hand in order to search your deck for any card and put it into your hand. Shuffle your deck afterward."
        onPlay {
          my.hand.getExcludedList(thisCard).select(count: 2, "Discard").discard()
          my.deck.select(count:1).moveTo(hidden:true,my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.hand.getExcludedList(thisCard).size() >= 2
          assert my.deck
        }
      };
      case DEVOLUTION_SPRAY_72:
      return basicTrainer (this) {
        text "Choose 1 of your own Pokémon in play and a Stage of Evolution. Discard all Evolution cards of that Stage or higher attached to that Pokémon. That Pokémon is no longer Asleep, Confused, Paralyzed, Poisoned, or anything else that might be the result of an attack (just as if you had evolved it)."
        onPlay {
          def pcs = my.all.findAll{it.evolution}.select("Pokemon to devolve")
          def pkmn = []
          pkmn.addAll(pcs.pokemonCards)
          pkmn.remove(pcs.topPokemonCard)
          def stage = pkmn.size()>1 ? pkmn.select("Choose stage to devolve to").first() : pkmn.first()
          for(PokemonCard t7:pcs.pokemonCards){
            if (t7 == stage) break
            discard(t7)
            devolve(pcs, t7)
          }
        }
        playRequirement{
          assert my.all.findAll{it.evolution} : "You have no evolved pokemon in play"
        }
      };
      case IMPOSTER_PROFESSOR_OAK_73:
      return basicTrainer (this) {
        text "Your opponent shuffles his or her hand into his or her deck, then draws 7 cards."
        onPlay {
          opp.hand.moveTo(hidden:true, opp.deck)
          shuffleDeck(null, TargetPlayer.OPPONENT)
          draw 7, TargetPlayer.OPPONENT
        }
        playRequirement{
          assert opp.deck
        }
      };
      case ITEM_FINDER_74:
      return basicTrainer (this) {
        text "Discard 2 of the other cards from your hand in order to put a Trainer card from your discard pile into your hand."
        onPlay {
          def selection = my.hand.getExcludedList(thisCard).select(count: 2, "Discard")
          my.discard.filterByType(TRAINER).select().moveTo(my.hand)
          selection.discard()
        }
        playRequirement{
          assert my.hand.getExcludedList(thisCard).size() >= 2
          assert my.discard.hasType(TRAINER)
        }
      };
      case LASS_75:
      return supporter (this) {
        text "You and your opponent show each other your hands, then shuffle all the Trainer cards from your hands into your decks."
        onPlay {
          opp.hand.showToMe("Opponent's hand")
          my.hand.showToOpponent("Opponent's hand")
          def tarOpp = opp.hand.filterByType(TRAINER)
          def tarMy = my.hand.filterByType(TRAINER)
          opp.hand.removeAll(tarOpp)
          my.hand.removeAll(tarMy)
          shuffleDeck(tarOpp, TargetPlayer.OPPONENT)
          shuffleDeck(tarMy)
        }
        playRequirement{
        }
      };
      case POKEMON_BREEDER_76: //TODO: Use the implementation of Rare Candy (admin: they are not the same!)
      return basicTrainer (this) {
        text "Put a Stage 2 Evolution card from your hand on the matching Basic Pokémon. You can only play this card when you would be allowed to evolve that Pokémon anyway."
        def stage2_to_basic = {
          def map = [:]
          my.hand.filterByType(STAGE2).each{
            def basic_names = bg.gm().getBasicsFromStage2(it.name)
            def basics = my.all.findAll{basic_names.contains(it.name)}
            if(basics) map.put(it, basics)
          }
          map
        }
        onPlay {
          def map = stage2_to_basic()
          def stage2 = new CardList(map.keySet()).select().first()
          def basic = map.get(stage2).select("To Evolve?")
          evolve(basic, stage2)
        }
        playRequirement{
          assert stage2_to_basic : "No matching Stage 2 card in hand"
        }
      };
      case POKEMON_TRADER_77:
      return basicTrainer (this) {
        text "Trade 1 of the Basic Pokémon or Evolution cards in your hand for 1 of the Basic Pokémon or Evolution cards from your deck. Show both cards to your opponent. Shuffle your deck afterward."
        onPlay {
          my.hand.select("Choose a Pokemon", cardTypeFilter(POKEMON)).select().moveTo(my.deck)
          my.deck.search (max: 1, cardTypeFilter(POKEMON)).moveTo(hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.hand.find(cardTypeFilter(POKEMON))
        }
      };
      case SCOOP_UP_78:
      return basicTrainer (this) {
        text "Choose 1 of your own Pokémon in play and return its Basic Pokémon card to your hand. (Discard all cards attached to that card.)"
        onPlay {
          def pcs = my.all.select()
          targeted(pcs, Source.TRAINER_CARD) {
            def temp = pcs.cards
            def tar = temp.get(0)
            while(temp.getExcludedList(tar).findAll{it.cardTypes.is(POKEMON)}){
              temp = temp.getExcludedList(tar)
              tar = temp.get(0)
            }
            pcs.cards.findAll{it==tar}.moveTo(my.hand)
            pcs.cards.discard()
            removePCS pcs
          }
        }
      };
      case SUPER_ENERGY_REMOVAL_79:
      return basicTrainer (this) {
        text "Discard 1 Special Energy attached to 1 of your opponent's Pokémon."
        onPlay {
          def tar = opp.all.findAll {it.cards.energyCount(C)}
          if(tar) {
            def pcs = tar.select("Discard energy from")
            targeted (pcs, TRAINER_CARD) {
              pcs.cards.filterByType(SPECIAL_ENERGY).select("Discard").discard()
            }
          }
        }
        playRequirement{
          assert opp.all.findAll {it.cards.filterByType(SPECIAL_ENERGY)}
        }
      };
      case DEFENDER_80:
      return basicTrainer (this) {
        text "Attach Defender to 1 of your Pokémon. At the end of your opponent''s next turn, discard Defender. Damage done to that Pokémon by attacks is reduced by 20 (after applying Weakness and Resistance)."
        onPlay {
          // TODO:
        }
        playRequirement{
        }
      };
      case ENERGY_RETRIEVAL_81:
      return basicTrainer (this) {
        text "Trade 1 of the other cards in your hand for up to 2 basic Energy cards from your discard pile."
        onPlay {
        }
        playRequirement{
        }
      };
      case FULL_HEAL_82:
      return basicTrainer (this) {
        text "Remove all Special Conditions from your Active Pokemon"
        onPlay {
          clearSpecialCondition(my.active, TRAINER_CARD)
        }
        playRequirement{
          assert !my.active.specialConditions.isEmpty()
        }
      };
      case MAINTENANCE_83:
      return basicTrainer (this) {
        text "Shuffle 2 of the other cards from your hand into your deck in order to draw 2 cards."
        onPlay {
          def list = hand.getExcludedList(thisCard).select(count:2, "Shuffle to deck")
          hand.removeAll(list)
          shuffleDeck(list)
          draw 2
        }
        playRequirement{
          assert hand.getExcludedList(thisCard).size() >= 2
        }
      };
      case PLUSPOWER_84:
      return basicTrainer (this) {
        text "Attach PlusPower to your Active Pokémonn. At the end of your turn, discard PlusPower. If this Pokémon''s attack does damage to the defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon."
        onPlay {
          // TODO
        }
        playRequirement{
        }
      };
      case POKEMON_CENTER_85:
      return basicTrainer (this) {
        text "Remove all damage counters from 1 of your own Pokémon, then discard all Energy cards attached to those Pokémon."
        onPlay {
          def tar = my.all.findAll {it.numberOfDamageCounters}
          healAll tar, TRAINER_CARD
          tar.cards.filterByType(ENERGY).discard()
        }
        playRequirement{
          assert my.all.findAll{it.numberOfDamageCounters}
        }
      };
      case POKEMON_FLUTE_86:
      return basicTrainer (this) {
        text "Choose 1 Basic Pokémon card from your opponent's discard pile and put it onto his or her Bench. (You can't play Pokémon Flute if your opponent's Bench is full.)"
        onPlay {
          opp.discard.findAll(cardTypeFilter(BASIC)).select().each {
            opp.discard.remove(it)
            benchPCS(it, OTHER, TargetPlayer.OPPONENT)
          }
        }
        playRequirement{
          assert opp.discard.find(cardTypeFilter(BASIC)) : "No basic in opponent's discard"
          assert opp.bench.notFull : "Opponent bench is full"
        }
      };
      case POKEDEX_87:
      return basicTrainer (this) {
        text "Look at up to 5 cards from the top of your deck and rearrange them as you like."
        onPlay {
          def list=rearrange(my.deck.subList(0,5), "Rearrange top 5 cards in your deck")
          my.deck.setSubList(0, list)
        }
        playRequirement{
          assert my.deck : "Your deck is empty"
        }
      };
      case PROFESSOR_OAK_88:
      return supporter (this) {
        text "Discard your hand, then draw 7 cards."
        onPlay {
          my.hand.discard()
          draw 7
        }
        playRequirement{
          assert my.deck
        }
      };
      case REVIVE_89:
      return basicTrainer (this) {
        text "Put 1 Basic Pokémon card (excluding Pokémon-ex) from your discard pile onto your Bench. Put damage counters on that Pokémon equal to half its HP (rounded down to the nearest 10). (You can't play Revive if your Bench is full.)"
        onPlay {
          my.discard.findAll(cardTypeFilter(BASIC) && !it.asPokemonCard().types.contains(EX)).select().each {
            my.discard.remove(it)
            def pcs = benchPCS(it)
            pcs.hp = ceil((pcs.fullHp/10)/2)*10
          }
        }
        playRequirement{
          assert my.discard.find(cardTypeFilter(BASIC) && !it.asPokemonCard().types.contains(EX)) && my.bench.notFull
        }
      };
      case SUPER_POTION_90:
      return basicTrainer (this) {
        text "Discard 1 Energy card attached to 1 of your own Pokémon (excluding Pokémon-ex) in order to remove up to 4 damage counters from that Pokémon."
        onPlay {
          def tar = my.all.findAll { it.cards.energyCount(C) && it.numberOfDamageCounters && !it.EX }
          if(tar) {
            def pcs = tar.select("Heal which Pokemon?")
            targeted (pcs, TRAINER_CARD) {
              pcs.cards.filterByType(ENERGY).select("Discard which Energy?").discard()
              heal 40, pcs
            }
          }
        }
        playRequirement{
          assert my.all.findAll { it.cards.energyCount(C) && it.numberOfDamageCounters && !it.EX }
        }
      };
      case BILL_91:
      return basicTrainer (this) {
        text "Draw 2 cards."
        onPlay {
          draw 2
        }
        playRequirement{
          assert my.deck
        }
      };
      case ENERGY_REMOVAL_92:
      return basicTrainer (this) {
        text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent's Pokémon and discard it."
        onPlay {
          flip {
            def tar = opp.all.findAll {it.cards.energyCount(C)}
            if(tar) {
              def pcs = tar.select("Discard energy from")
              targeted (pcs, TRAINER_CARD) {
                pcs.cards.filterByType(ENERGY).select("Discard").discard()
              }
            }
          }
        }
        playRequirement{
          assert opp.all.findAll {it.cards.energyCount(C)}
        }
      };
      case GUST_OF_WIND_93:
      return basicTrainer (this) {
        text "Choose 1 of your opponent's Benched Pokémon and switch it with his or her Active Pokémon."
        onPlay {
          def pcs = opp.bench.select("New active")
          targeted (pcs, TRAINER_CARD) {
            sw opp.active, pcs, TRAINER_CARD
          }
        }
        playRequirement{
          assert opp.bench
        }
      };
      case POTION_94:
      return basicTrainer (this) {
        text "Remove up to 2 damage counters from 1 of your Pokémon."
        onPlay {
          def pcs = my.all.findAll{it.numberOfDamageCounters}.select()
          heal 20, pcs
        }
        playRequirement{
          assert my.all.findAll{it.numberOfDamageCounters}
        }
      };
      case SWITCH_95:
      return basicTrainer (this) {
        text "Switch 1 of your Benched Pokémon with your Active Pokémon."
        return basicTrainer (this) {
          text "Switch your Active Pokémon with 1 of your Benched Pokémon."
          onPlay {
            sw my.active, my.bench.select()
          }
          playRequirement{
            assert bench.notEmpty
          }
        };
      };
      case DOUBLE_COLORLESS_ENERGY_96:
      return specialEnergy (this, [[C],[C]]) {
        text "Double Colorless Energy provides [C][C] Energy."
        onPlay {}
      };
      case FIGHTING_ENERGY:
      return basicEnergy (this, F);
      case FIRE_ENERGY_98:
      return basicEnergy (this, R);
      case GRASS_ENERGY_99:
      return basicEnergy (this, G);
      case LIGHTNING_ENERGY_100:
      return basicEnergy (this, L);
      case PSYCHIC_ENERGY_101:
      return basicEnergy (this, P);
      case WATER_ENERGY_102:
      return basicEnergy (this, W);
      case DUAL_BALL_103:
      return basicTrainer (this) {
        text "Flip 2 coins. For each heads, search your deck for a basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
          def i=0
          flip 2, {
            i++
          }
          if(i>0){
            my.deck.search (min:0,max:i,"Search your deck for $i Basic Pokémon and put them in your hand.", cardTypeFilter(BASIC)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        playRequirement{
          assert my.deck : "Your deck is empty"
        }
      };
      case ENERGY_SWITCH_104:
      return basicTrainer (this) {
        text "Move a basic Energy card from 1 of your Pokémon to another of your Pokémon"
        onPlay {
          def src = my.all.findAll{it.cards.filterByType(BASIC_ENERGY)}.select("Move Energy from which pokemon?")
          def tar = my.all.findAll {it != src}.select("Move Energy to which Pokémon?")
          src.cards.filterByType(BASIC_ENERGY).select("Select a Basic Energy card to move to the target.").each{energySwitch(src,tar,it)}
        }
        playRequirement{
          assert my.all.findAll{it.cards.filterByType(BASIC_ENERGY)} : "You have no basic Energy attached to your pokemon"
          assert my.all.size() >= 2 : "You only have one Pokémon in play."
        }
      };
      case SUPER_ENERGY_RETRIEVAL_105:
      return basicTrainer (this) {
        text "Trade 2 of the other cards in your hand for up to 4 basic Energy cards from your discard pile."
        onPlay {
          def disc = my.hand.getExcludedList(thisCard).select(count:2, "Discard")
          def tar = my.discard.filterByType(BASIC_ENERGY).select(min:0, max:4, "Return to hand")
          disc.discard()
          tar.moveTo(my.hand)
        }
        playRequirement{
          assert my.hand.getExcludedList(thisCard).size() >= 2 : "You don't have 2 other cards to discard"
          assert my.discard.filterByType(BASIC_ENERGY) : "You don't have any basic Energy in your discard"
        }
      };
      case SUPER_SCOOP_UP_106:
      return basicTrainer (this) {
        text "Flip a coin. If heads, return 1 of your Pokémon in play and all cards attached to it to your hand."
        onPlay {
          flip{
            def pcs = my.all.select("Choose a Pokémon to return to your hand")
            targeted(pcs, Source.TRAINER_CARD) {
              pcs.cards.moveTo(my.hand)
              removePCS pcs
            }
          }
        }
        playRequirement{
        }
      };
      case CRUSHING_HAMMER_107:
      return basicTrainer (this) {
        text "Discard 1 Energy card attached to 1 of your Pokémon in order to choose 1 of your opponent's Pokémon and up to 2 Energy cards attached to it. Discard those Energy cards."
        onPlay {
          bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          def src = my.all.findAll{it.cards.filterByType(ENERGY)}.select("Discard an energy from")
          src.cards.filterByType(ENERGY).select("Discard which energy").discard()
          def tar = opp.all.findAll{it.cards.filterByType(ENERGY)}.select("Discard up to 2 energy from")
          tar.cards.filterByType(ENERGY).select(min:0,max:2,"Discard which energies?").discard()
        }
        playRequirement{
          assert !bg.em().retrieveObject("G_SPEC_"+thisCard.player) : "You have already used your G-SPEC card"
          assert my.all.findAll{it.cards.filterByType(ENERGY)} : "You have no energy attached to your pokemon"
          assert opp.all.findAll{it.cards.filterByType(ENERGY)} : "Your opponent has no energy attached to their pokemon"
        }
      };
      case DOWSING_MACHINE_108:
      return basicTrainer (this) {
        text "Search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
        onPlay {
          bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          my.discard.filterByType(TRAINER).select().moveTo(my.hand)
        }
        playRequirement{
          assert my.discard.filterByType(TRAINER) : "You have no trainers in your discard pile."
          assert !bg.em().retrieveObject("G_SPEC_"+thisCard.player) : "You have already used your G-SPEC card"
        }
      };
      case Elixir_109:
      return basicTrainer (this) {
        text "Remove up to 6 damage counters from 1 of your Pokémon."
        onPlay {
          bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          def pcs = my.all.findAll{it.numberOfDamageCounters}.select()
          targeted (pcs, TRAINER_CARD) {
            heal 60, pcs
          }
        }
        playRequirement{
          assert my.all.findAll{it.numberOfDamageCounters}
          assert !bg.em().retrieveObject("G_SPEC_"+thisCard.player) : "You have already used your G-SPEC card"
        }
      };
      case Hacker_110:
      return basicTrainer (this) {
        text "Search your deck for a card and put it into your hand. Shuffle your deck afterward."
        onPlay {
          bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          my.deck.select(count:1).moveTo(hidden:true,my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
          assert !bg.em().retrieveObject("G_SPEC_"+thisCard.player) : "You have already used your G-SPEC card"
        }
      };
      case MEWTWO_114:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Energy Absorption", {
          text "Choose up to 2 Energy cards from your discard pile and attach them to Mewtwo."
          energyCost P
          onAttack {
            attachEnergyFrom(min:0,max:2, my.discard, self)
          }
        }
        move "Psyburn", {
          text "40 damage. "
          energyCost P, P, C
          onAttack {
            damage 40
          }
        }
      };
      case SQUIRTLE_115:
      return copy (SQUIRTLE_63, this);
      case KOFFING_116:
      return copy (KOFFING_51, this);
      case ARCANINE_117:
      return copy (ARCANINE_23, this);
      case CHARIZARD_EX_118:
      return evolution (this, from:"Charmeleon", hp:HP150, type:R, retreatCost:2) {
        weakness W
        weakness L
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
          text "50 damage. "
          energyCost R, C, C
          onAttack {
            damage 50
          }
        }
        move "Burn Down", {
          text "200 damage. Discard 5 [R] Energy attached to Charizard ex. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, and any other effects on the Defending Pokémon."
          energyCost R, R, R, R, R
          onAttack {
            discardSelfEnergy(R,R,R,R,R)
            new ResolvedDamage(hp(200), my.active, opp.active, Source.ATTACK, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS, DamageManager.DamageFlag.NO_DEFENDING_EFFECT).run(bg)
          }
        }
      };
      case BLASTOISE_EX_119:
      return evolution (this, from:"Wartortle", hp:HP150, type:W, retreatCost:3) {
        weakness G
        weakness L
        pokePower "Energy Rain", {
          text "As often as you like during your turn (before your attack), you may attach a [W] Energy card from your hand to 1 of your Pokémon. Put 1 damage counter on that Pokémon. This power can't be used if Blastoise ex is affected by a Special Condition."
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
          text "40 damage. Flip a coin until you get tails. For each heads, your opponent discards an Energy card attached to the Defending Pokémon."
          energyCost W, W, C, C
          onAttack {
            damage 40
            flipUntilTails {
              discardDefendingEnergy()
            }
          }
        }
      };
      case VENUSAUR_EX_120:
      return evolution (this, from:"Ivysaur", hp:HP150, type:G, retreatCost:3) {
        weakness R
        weakness P
        pokePower "Energy Trans", {
          text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Venusaur ex is affected by a Special Condition."
          actionA {
            checkNoSPC()
            assert my.all.findAll{it.cards.filterByEnergyType(G)} : "You have no [G] Energy attached to your pokemon"
            assert my.all.size() >= 2 : "You only have one Pokémon in play."
            powerUsed()
            def src = my.all.findAll{it.cards.filterByEnergyType(G)}.select("Move Energy from which pokemon?")
            def tar = my.all.findAll {it != src}.select("Move Energy to which Pokémon?")
            src.cards.filterByEnergyType(G).select("Select a Basic Energy card to move to the target.").each{energySwitch(src,tar,it)}
          }
        }
        move "Pollen Hazard", {
          text "20 damage. The Defending Pokémon is now Poisoned, and Confused."
          energyCost G, C, C
          onAttack {
            damage 20
            apply POISONED
            apply CONFUSED
          }
        }
        move "Solarbeam", {
          text "70 damage. "
          energyCost G, G, G, C, C
          onAttack {
            damage 70
          }
        }
      };
      case MIRACLE_ENERGY_OPTION_1:
      return specialEnergy (this, [[]]) {
        def check = {
          if(it && !it.topPokemonCard.cardTypes.is(STAGE2)){discard thisCard}
        }
        typeImagesOverride = [RAINBOW, RAINBOW]
        def eff
        def flag
        onPlay {reason->
          if(!bg.em().retrieveObject("G_SPEC_"+thisCard.player)){
            bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          } else{
            discard thisCard
          }
          eff = delayed {
            before null, self, Source.TRAINER_CARD,{
              flag = true
            }
            after null, self, Source.TRAINER_CARD,{
              flag = false
              check(self)
            }
            before DISCARD, {
              if(ef.card == thisCard && bg.currentTurn == self.owner.opposite && flag){
                prevent()
                bc "Miracle Energy isn't discarded by ${self.owner.opposite.getPlayerUsername(bg)}'s trainer cards"
              }
            }
            after EVOLVE, self, {check(self)}
            after DEVOLVE, self, {check(self)}
            after ATTACH_ENERGY, self, {check(self)}
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        onMove {to->
          check(to)
        }
        allowAttach {to->
          to.topPokemonCard.cardTypes.is(STAGE2) && !bg.em().retrieveObject("G_SPEC_"+thisCard.player)
        }
        getEnergyTypesOverride{
          return [[R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set]
        }
      };
      case MIRACLE_ENERGY_OPTION_2:
      return specialEnergy (this, [[]]) {
        def check = {
          if(!it.topPokemonCard.cardTypes.is(STAGE2)){discard thisCard}
        }
        typeImagesOverride = [RAINBOW, RAINBOW]
        def eff
        def subeff
        onPlay {reason->
          bg.em().storeObject("G_SPEC_"+thisCard.player, 1)
          eff = delayed {
            before null, self, Source.TRAINER_CARD,{
              flag = true
            }
            after null, self, Source.TRAINER_CARD,{
              flag = false
              check(self)
            }
            before DISCARD, {
              if(ef.card == thisCard && bg.currentTurn == self.owner.opposite && flag){
                prevent()
                bc "Miracle Energy isn't discarded by ${self.owner.opposite.getPlayerUsername(bg)}'s trainer cards"
              }
            }
            after EVOLVE, self, {check(self)}
            after DEVOLVE, self, {check(self)}
            after ATTACH_ENERGY, self, {check(self)}
          }
        }
        onRemoveFromPlay {
          eff.unregister()
          thisCard.moveTo(suppressLog: true, my.lostZone)
        }
        onMove {to->
          check(to)
        }
        allowAttach {to->
          to.topPokemonCard.cardTypes.is(STAGE2) && !bg.em().retrieveObject("G_SPEC_"+thisCard.player)
        }
        getEnergyTypesOverride{
          return [[R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set]
        }
      };
        default:
      return null;
    }
  }
}
