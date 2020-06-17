package tcgwars.logic.impl.pokemod;

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

import tcgwars.logic.impl.pokemod.PokemodBaseSet;

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
 * @author
 */
public enum PokemodBaseSet2 implements LogicCardInfo {

  ALAKAZAM_1 ("Alakazam", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  BLASTOISE_2 ("Blastoise", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CHANSEY_3 ("Chansey", 3, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CHARIZARD_4 ("Charizard", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CLEFABLE_5 ("Clefable", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CLEFAIRY_6 ("Clefairy", 6, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GYARADOS_7 ("Gyarados", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HITMONCHAN_8 ("Hitmonchan", 8, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MAGNETON_9 ("Magneton", 9, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MEWTWO_10 ("Mewtwo", 10, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  NIDOKING_11 ("Nidoking", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NIDOQUEEN_12 ("Nidoqueen", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NINETALES_13 ("Ninetales", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  PIDGEOT_14 ("Pidgeot", 14, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  POLIWRATH_15 ("Poliwrath", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  RAICHU_16 ("Raichu", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  SCYTHER_17 ("Scyther", 17, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  VENUSAUR_18 ("Venusaur", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WIGGLYTUFF_19 ("Wigglytuff", 19, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ZAPDOS_20 ("Zapdos", 20, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  BEEDRILL_21 ("Beedrill", 21, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DRAGONAIR_22 ("Dragonair", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUGTRIO_23 ("Dugtrio", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ELECTABUZZ_24 ("Electabuzz", 24, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_25 ("Electrode", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  KANGASKHAN_26 ("Kangaskhan", 26, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  MR_MIME_27 ("Mr. Mime", 27, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  PIDGEOTTO_28 ("Pidgeotto", 28, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PINSIR_29 ("Pinsir", 29, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  SNORLAX_30 ("Snorlax", 30, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  VENOMOTH_31 ("Venomoth", 31, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VICTREEBEL_32 ("Victreebel", 32, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ARCANINE_33 ("Arcanine", 33, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BUTTERFREE_34 ("Butterfree", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHARMELEON_35 ("Charmeleon", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DEWGONG_36 ("Dewgong", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DODRIO_37 ("Dodrio", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DRATINI_38 ("Dratini", 38, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  EXEGGUTOR_39 ("Exeggutor", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  FARFETCH_D_40 ("Farfetch'd", 40, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  FEAROW_41 ("Fearow", 41, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GROWLITHE_42 ("Growlithe", 42, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  HAUNTER_43 ("Haunter", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  IVYSAUR_44 ("Ivysaur", 44, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  JYNX_45 ("Jynx", 45, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  KADABRA_46 ("Kadabra", 46, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KAKUNA_47 ("Kakuna", 47, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LICKITUNG_48 ("Lickitung", 48, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  MACHOKE_49 ("Machoke", 49, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAGIKARP_50 ("Magikarp", 50, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  MAGMAR_51 ("Magmar", 51, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  MAROWAK_52 ("Marowak", 52, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  NIDORINA_53 ("Nidorina", 53, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDORINO_54 ("Nidorino", 54, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PARASECT_55 ("Parasect", 55, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PERSIAN_56 ("Persian", 56, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  POLIWHIRL_57 ("Poliwhirl", 57, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RATICATE_58 ("Raticate", 58, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  RHYDON_59 ("Rhydon", 59, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SEAKING_60 ("Seaking", 60, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEEL_61 ("Seel", 61, Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  TAUROS_62 ("Tauros", 62, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  WARTORTLE_63 ("Wartortle", 63, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WEEPINBELL_64 ("Weepinbell", 64, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ABRA_65 ("Abra", 65, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BELLSPROUT_66 ("Bellsprout", 66, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BULBASAUR_67 ("Bulbasaur", 67, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CATERPIE_68 ("Caterpie", 68, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHARMANDER_69 ("Charmander", 69, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CUBONE_70 ("Cubone", 70, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DIGLETT_71 ("Diglett", 71, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DODUO_72 ("Doduo", 72, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DROWZEE_73 ("Drowzee", 73, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EXEGGCUTE_74 ("Exeggcute", 74, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GASTLY_75 ("Gastly", 75, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GOLDEEN_76 ("Goldeen", 76, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  JIGGLYPUFF_77 ("Jigglypuff", 77, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MACHOP_78 ("Machop", 78, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGNEMITE_79 ("Magnemite", 79, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MEOWTH_80 ("Meowth", 80, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  METAPOD_81 ("Metapod", 81, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  NIDORAN_FEMALE_82 ("Nidoran♀", 82, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NIDORAN_MALE_83 ("Nidoran♂", 83, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ONIX_84 ("Onix", 84, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  PARAS_85 ("Paras", 85, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PIDGEY_86 ("Pidgey", 86, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_87 ("Pikachu", 87, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  POLIWAG_88 ("Poliwag", 88, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  RATTATA_89 ("Rattata", 89, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RHYHORN_90 ("Rhyhorn", 90, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSHREW_91 ("Sandshrew", 91, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SPEAROW_92 ("Spearow", 92, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SQUIRTLE_93 ("Squirtle", 93, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARMIE_94 ("Starmie", 94, Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  STARYU_95 ("Staryu", 95, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TANGELA_96 ("Tangela", 96, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VENONAT_97 ("Venonat", 97, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VOLTORB_98 ("Voltorb", 98, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  VULPIX_99 ("Vulpix", 99, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  WEEDLE_100 ("Weedle", 100, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  COMPUTER_SEARCH_101 ("Computer Search", 101, Rarity.RARE, [TRAINER]),
  IMPOSTER_PROFESSOR_OAK_102 ("Imposter Professor Oak", 102, Rarity.RARE, [TRAINER]),
  ITEM_FINDER_103 ("Item Finder", 103, Rarity.RARE, [TRAINER]),
  LASS_104 ("Lass", 104, Rarity.RARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_105 ("Pokémon Breeder", 105, Rarity.RARE, [TRAINER]),
  POKEMON_TRADER_106 ("Pokémon Trader", 106, Rarity.RARE, [TRAINER]),
  SCOOP_UP_107 ("Scoop Up", 107, Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_REMOVAL_108 ("Super Energy Removal", 108, Rarity.RARE, [TRAINER]),
  DEFENDER_109 ("Defender", 109, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETRIEVAL_110 ("Energy Retrieval", 110, Rarity.UNCOMMON, [TRAINER]),
  FULL_HEAL_111 ("Full Heal", 111, Rarity.UNCOMMON, [TRAINER]),
  MAINTENANCE_112 ("Maintenance", 112, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_113 ("PlusPower", 113, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CENTER_114 ("Pokémon Center", 114, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_115 ("Pokédex", 115, Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_OAK_116 ("Professor Oak", 116, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SUPER_POTION_117 ("Super Potion", 117, Rarity.UNCOMMON, [TRAINER]),
  BILL_118 ("Bill", 118, Rarity.COMMON, [TRAINER]),
  ENERGY_REMOVAL_119 ("Energy Removal", 119, Rarity.COMMON, [TRAINER]),
  GUST_OF_WIND_120 ("Gust of Wind", 120, Rarity.COMMON, [TRAINER]),
  POKE_BALL_121 ("Poké Ball", 121, Rarity.COMMON, [TRAINER]),
  POTION_122 ("Potion", 122, Rarity.COMMON, [TRAINER]),
  SWITCH_123 ("Switch", 123, Rarity.COMMON, [TRAINER]),
  DOUBLE_COLORLESS_ENERGY_124 ("Double Colorless Energy", 124, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  FIGHTING_ENERGY_125 ("Fighting Energy", 125, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  FIRE_ENERGY_126 ("Fire Energy", 126, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  GRASS_ENERGY_127 ("Grass Energy", 127, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  LIGHTNING_ENERGY_128 ("Lightning Energy", 128, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  PSYCHIC_ENERGY_129 ("Psychic Energy", 129, Rarity.COMMON, [ENERGY, BASIC_ENERGY]),
  WATER_ENERGY_130 ("Water Energy", 130, Rarity.COMMON, [ENERGY, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodBaseSet2(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_BASE_SET_2;
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
      return copy (PokemodBaseSet.ALAKAZAM_1, this);
      case BLASTOISE_2:
      return copy (PokemodBaseSet.BLASTOISE_2, this);
      case CHANSEY_3:
      return copy (PokemodBaseSet.CHANSEY_3, this);
      case CHARIZARD_4:
      return copy (PokemodBaseSet.CHARIZARD_4, this);
      case CLEFABLE_5:
      return evolution (this, from:"Clefairy", hp:HP070, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Metronome", {
          text "Choose 1 of the Defending Pokémon's attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable's type is still [C].)"
          energyCost C, C
          attackRequirement {}
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
        move "Minimize", {
          text "All damage done by attacks to Clefable during your opponent's next turn is reduce by 20 (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            reduceDamageNextTurn(hp(20), thisMove,self)
          }
        }
      };
      case CLEFAIRY_6:
      return copy (PokemodBaseSet.CLEFAIRY_5, this);
      case GYARADOS_7:
      return copy (PokemodBaseSet.GYARADOS_6, this);
      case HITMONCHAN_8:
      return copy (PokemodBaseSet.HITMONCHAN_7, this);
      case MAGNETON_9:
      return copy (PokemodBaseSet.MAGNETON_9, this);
      case MEWTWO_10:
      return copy (PokemodBaseSet.MEWTWO_10, this);
      case NIDOKING_11:
      return copy (PokemodBaseSet.NIDOKING_11, this);
      case NIDOQUEEN_12:
      return evolution (this, from:"Nidorina", hp:HP100, type:G, retreatCost:3) {
        weakness P
        move "Boyfriends", {
          text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            my.bench.each{
              if(it.name == "Nidoking"){
                damage 20
              }
            }
          }
        }
        move "Mega Punch", {
          text "50 damage. "
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NINETALES_13:
      return copy (PokemodBaseSet.NINETALES_12, this);
      case PIDGEOT_14:
      return evolution (this, from:"Pidgeotto", hp:HP080, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokePower "Quick Search", {
          text "Once during your turn (before your attack), you may choose 1 card from your deck and put it into your hand. Shuffle your deck afterward. You can't use more than 1 Quick Search Pokémon Power each turn. This Power can't be used if Pidgeot is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.deck : "You have no cards in your deck"
            assert bg.em().retrieveObject("Quick_Search") != bg.turnCount : "You can't use more than one Quick Search Pokémon Power each turn"
            bg.em().storeObject("Quick_Search", bg.turnCount)
            my.deck.select(count:1).moveTo(hidden:true,my.hand)
            shuffleDeck()
            powerUsed()
          }
        }
        move "Hurricane", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case POLIWRATH_15:
      return copy (PokemodBaseSet.POLIWRATH_13, this);
      case RAICHU_16:
      return copy (PokemodBaseSet.RAICHU_14, this);
      case SCYTHER_17:
      return basic (this, hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Swords Dance", {
          text "During your next turn, Scyther's Slash attack's base damage is 60 instead of 30."
          energyCost G
          attackRequirement {}
          onAttack {
            increasedBaseDamageNextTurn("Slash",hp(30))
          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VENUSAUR_18:
      return copy (PokemodBaseSet.VENUSAUR_15, this);
      case WIGGLYTUFF_19:
      return evolution (this, from:"Jigglypuff", hp:HP080, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Lullaby", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Do the Wave", {
          text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
            my.bench.each{
              damage 10
            }
          }
        }
      };
      case ZAPDOS_20:
      return copy (PokemodBaseSet.ZAPDOS_16, this);
      case BEEDRILL_21:
      return copy (PokemodBaseSet.BEEDRILL_17, this);
      case DRAGONAIR_22:
      return copy (PokemodBaseSet.DRAGONAIR_18, this);
      case DUGTRIO_23:
      return copy (PokemodBaseSet.DUGTRIO_19, this);
      case ELECTABUZZ_24:
      return copy (PokemodBaseSet.ELECTABUZZ_20, this);
      case ELECTRODE_25:
      return copy (PokemodBaseSet.ELECTRODE_21, this);
      case KANGASKHAN_26:
      return basic (this, hp:HP090, type:C, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Fetch", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            draw 1
          }
        }
        move "Comet Punch", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            flip 4,{
              damage 20
            }
          }
        }
      };
      case MR_MIME_27:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Invisible Wall", {
          text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can't be used if Mr. Mime is Asleep, Confused, or Paralyzed."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner != self.owner) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value >= 30) {
                    bc "Invisible Wall prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
        }
        move "Meditate", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10+10*defending.numberOfDamageCounters
          }
        }
      };
      case PIDGEOTTO_28:
      return copy (PokemodBaseSet.PIGEOTTO_22, this);
      case PINSIR_29:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Irongrip", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
            flip{
              applyAfterDamage(PARALYZED)
            }
          }
        }
        move "Guillotine", {
          text "50 damage. "
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case SNORLAX_30:
      return basic (this, hp:HP090, type:C, retreatCost:4) {
        weakness F
        resistance P, MINUS30
        pokeBody "Thick Skinned", {
          text "Snorlax can't be affected by Special Conditions."
          delayedA {
            before APPLY_SPECIAL_CONDITION,self, {
              if(!(self.specialConditions)){
                bc ("$self is thick Skinned!")
                prevent()
              }
            }
          }
          onActivate {
            clearSpecialCondition(self, SRC_ABILITY)
          }
        }
        move "Body Slam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip{
              applyAfterDamage(PARALYZED)
            }
          }
        }
      };
      case VENOMOTH_31:
      return evolution (this, from:"Venonat", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        pokePower "Shift", {
          text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than [C]. This power can't be used if Venomoth is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            def typeList = []
            all.each{
              for (Type t1:it.types) {
                if(t1 != C && !typeList.contains(t1) && it != self){
                  typeList.add(t1)
                }
              }
            }
            assert typeList : "There is no pokemon in play with a type different than [C]"
            powerUsed()
            def newType = choose(typeList,"Select the new type of Venomoth")
            getter GET_POKEMON_TYPE, self, {h->
              h.object.clear()
              h.object.add(newType)
            }
            bc"$self's type is now $newType"
          }
        }
        move "Venom Powder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              applyAfterDamage POISONED
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case VICTREEBEL_32:
      return evolution (this, from:"Weepinbell", hp:HP090, type:G, retreatCost:2) {
        weakness R
        move "Lure", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            sw opp.active, opp.bench.select("Choose new active pokemon"), ATTACK
          }
        }
        move "Acid", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon can't retreat during your opponent's next turn."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
            flip{
              cantRetreat(defending)
            }
          }
        }
      };
      case ARCANINE_33:
      return copy (PokemodBaseSet.ARCANINE_23, this);
      case BUTTERFREE_34:
      return evolution (this, from:"Metapod", hp:HP080, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Whirlwind", {
          text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage{
              whirlwind()
            }
          }
        }
        move "Mega Drain", {
          text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
          energyCost G, G, G, C
          attackRequirement {}
          onAttack {
            damage 40
            removeDamageCounterEqualToHalfDamageDone()
          }
        }
      };
      case CHARMELEON_35:
      return copy (PokemodBaseSet.CHARMELEON_24, this);
      case DEWGONG_36:
      return copy (PokemodBaseSet.DEWGONG_25, this);
      case DODRIO_37:
      return evolution (this, from:"Doduo", hp:HP070, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        pokeBody "Retreat Aid", {
          text "As long as Dodrio is Benched, pay 1 [C] less to retreat your Active Pokémon."
          getterA (GET_RETREAT_COST) {h->
            if (h.effect.target.owner == self.owner && h.effect.target.active && self.benched) {
              h.object -= 1
            }
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
      };
      case DRATINI_38:
      return copy (PokemodBaseSet.DRATINI_26, this);
      case EXEGGUTOR_39:
      return evolution (this, from:"Exeggcute", hp:HP080, type:G, retreatCost:3) {
        weakness R
        move "Teleport", {
          text "Switch Exeggutor with 1 of your Benched Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            sw self, my.bench.select("Choose new active pokemon"), ATTACK
          }
        }
        move "Big Eggsplosion", {
          text "20x damage. Flip a number of coins equal to the number of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            flip self.cards.energyCount(C), {
              damage 20
            }
          }
        }
      };
      case FARFETCH_D_40:
      return copy (PokemodBaseSet.FARFETCH_D_27, this);
      case FEAROW_41:
      return evolution (this, from:"Spearow", hp:HP080, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Fearow."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip{
              preventAllEffectsNextTurn()
            }
          }
        }
        move "Drill Peck", {
          text "40 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GROWLITHE_42:
      return copy (PokemodBaseSet.GROWLITHE_28, this);
      case HAUNTER_43:
      return copy (PokemodBaseSet.HAUNTER_29, this);
      case IVYSAUR_44:
      return copy (PokemodBaseSet.IVYSAUR_30, this);
      case JYNX_45:
      return copy (PokemodBaseSet.JYNX_31, this);
      case KADABRA_46:
      return copy (PokemodBaseSet.KADABRA_32, this);
      case KAKUNA_47:
      return copy (PokemodBaseSet.KAKUNA_33, this);
      case LICKITUNG_48:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness F
        resistance P, MINUS30
        move "Tongue Wrap", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              applyAfterDamage PARALYZED
            }
          }
        }
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              applyAfterDamage CONFUSED
            }
          }
        }
      };
      case MACHOKE_49:
      return copy (PokemodBaseSet.MACHOKE_34, this);
      case MAGIKARP_50:
      return copy (PokemodBaseSet.MAGIKARP_35, this);
      case MAGMAR_51:
      return copy (PokemodBaseSet.MAGMAR_36, this);
      case MAROWAK_52:
      return evolution (this, from:"Cubone", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Bonemerang", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost F, C
          attackRequirement {}
          onAttack {
            flip 2, {
              damage 30
            }
          }
        }
        move "Call for Friend", {
          text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost F
          attackRequirement {
            assert my.deck : "Your deck is empty"
            assert my.bench.notFull : "Your bench is full"
          }
          onAttack {
            my.deck.search("Choose Basic [f] Pokémon",{(it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(F))}).each{
              my.deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
      };
      case NIDORINA_53:
      return evolution (this, from:"Nidoran♀", hp:HP080, type:G, retreatCost:1) {
        weakness P
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {
            flip{
              applyAfterDamage CONFUSED
            }
          }
        }
        move "Double Kick", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            flip 2, {
              damage 30
            }
          }
        }
      };
      case NIDORINO_54:
      return copy (PokemodBaseSet.NIDORINO_37, this);
      case PARASECT_55:
      return evolution (this, from:"Paras", hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Spore", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Slash", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PERSIAN_56:
      return evolution (this, from:"Meowth", hp:HP070, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Scratch", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Pounce", {
          text "30 damage. If the Defending Pokémon attacks Persian during your opponent's next turn, any damage done by the attack is reduce by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
            reduceDamageFromDefendingNextTurn(hp(10),thisMove,defending)
          }
        }
      };
      case POLIWHIRL_57:
      return copy (PokemodBaseSet.POLIWHIRL_38, this);
      case RATICATE_58:
      return copy (PokemodBaseSet.RATICATE_40, this);
      case RHYDON_59:
      return evolution (this, from:"Rhyhorn", hp:HP100, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Horn Attack", {
          text "30 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Ram", {
          text "50 damage. Rhydon does 20 damage to itself. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon. Switch the Pokémon even if Rhydon is knocked out.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
            damage 20, self
            afterDamage{
              whirlwind()
            }
          }
        }
      };
      case SEAKING_60:
      return evolution (this, from:"Goldeen", hp:HP070, type:W, retreatCost:0) {
        weakness L
        move "Horn Attack", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Waterfall", {
          text "30 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SEEL_61:
      return copy (PokemodBaseSet.SEEL_41, this);
      case TAUROS_62:
      return basic (this, hp:HP060, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        move "Stomp", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip{
              damage 10
            }
          }
        }
        move "Rampage", {
          text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. Flip a coin. If tails, Tauros is now Confused (after doing damage)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20+10*self.numberOfDamageCounters
            flip{
              afterDamage{
                apply CONFUSED, self
              }
            }
          }
        }
      };
      case WARTORTLE_63:
      return copy (PokemodBaseSet.WARTORTLE_42, this);
      case WEEPINBELL_64:
      return evolution (this, from:"Bellsprout", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Poisonpowder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              applyAfterDamage POISONED
            }
          }
        }
        move "Razor Leaf", {
          text "30 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ABRA_65:
      return copy (PokemodBaseSet.ABRA_43, this);
      case BELLSPROUT_66:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Vine Whip", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon named Bellsprout and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost G
          attackRequirement {
            assert my.bench.notFull : "Your bench is full"
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            my.deck.search("Choose Basic Pokémon named Bellsprout",{(it.cardTypes.is(BASIC) && it.name.contains("Bellsprout"))}).each{
              my.deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
      };
      case BULBASAUR_67:
      return copy (PokemodBaseSet.BULBASAUR_44, this);
      case CATERPIE_68:
      return copy (PokemodBaseSet.CATERPIE_45, this);
      case CHARMANDER_69:
      return copy (PokemodBaseSet.CHARMANDER_46, this);
      case CUBONE_70:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Snivel", {
          text "If the Defending Pokémon attacks Cubone during your opponent's next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
          }
        }
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
      };
      case DIGLETT_71:
      return copy (PokemodBaseSet.DIGLETT_47, this);
      case DODUO_72:
      return copy (PokemodBaseSet.DODUO_48, this);
      case DROWZEE_73:
      return copy (PokemodBaseSet.DROWZEE_49, this);
      case EXEGGCUTE_74:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Leech Seed", {
          text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Exeggcute."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 20
            delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == opp.active && it.notNoEffect && it.dmg.value > 0) {
                    heal 10, self
                  }
                }
              }
              unregisterAfter 1
            }
          }
        }
      };
      case GASTLY_75:
      return copy (PokemodBaseSet.GASTLY_50, this);
      case GOLDEEN_76:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Horn Attack", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case JIGGLYPUFF_77:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Lullaby", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Pound", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOP_78:
      return copy (PokemodBaseSet.MACHOP_52, this);
      case MAGNEMITE_79:
      return copy (PokemodBaseSet.MAGNEMITE_53, this);
      case MEOWTH_80:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Pay Day", {
          text "10 damage. Flip a coin. If heads, draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              draw 1
            }
          }
        }
      };
      case METAPOD_81:
      return copy (PokemodBaseSet.METAPOD_54, this);
      case NIDORAN_FEMALE_82:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness P
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            flip 3,{
              damage 10
            }
          }
        }
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon named Nidoran M or Nidoran F and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost G
          attackRequirement {
            assert my.bench.notFull : "Your bench is full"
            assert my.deck : "Your deck is empty"
          }
          onAttack {
            my.deck.search("Choose Basic Pokémon named Nidoran M or Nidoran F",{(it.cardTypes.is(BASIC) && it.name.contains("Nidoran"))}).each{
              my.deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
      };
      case NIDORAN_MALE_83:
      return copy (PokemodBaseSet.NIDORAN_MALE_55, this);
      case ONIX_84:
      return copy (PokemodBaseSet.ONIX_56, this);
      case PARAS_85:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "20 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spore", {
          text "The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
      };
      case PIDGEY_86:
      return copy (PokemodBaseSet.PIDGEY_57, this);
      case PIKACHU_87:
      return copy (PokemodBaseSet.PIKACHU_58, this);
      case POLIWAG_88:
      return copy (PokemodBaseSet.POLIWAG_59, this);
      case RATTATA_89:
      return copy (PokemodBaseSet.RATTATA_61, this);
      case RHYHORN_90:
      return basic (this, hp:HP070, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Leer", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack Rhyhorn during your opponent's next turn. (Benching either Pokémon ends this effect.)"
          energyCost C
          attackRequirement {}
          onAttack {
            flip{
              delayed {
                before CHECK_ATTACK_REQUIREMENTS, {
                  if(self.active && ef.attacker.owner != self.owner) {
                    wcu "Disgusting Pollen prevents attack"
                    prevent()
                  }
                }
                unregisterAfter 2
                after SWITCH, defending, {unregister()}
                after EVOLVE, defending, {unregister()}
                after EVOLVE,self, {unregister()}
                after SWITCH,self, {unregister()}
              }
            }
          }
        }
        move "Horn Attack", {
          text "30 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SANDSHREW_91:
      return copy (PokemodBaseSet.SANDSHREW_62, this);
      case SPEAROW_92:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
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
        move "Peck", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mirror Move", {
          text "If Spearow was attacked last turn, do the final result of that attack on Spearow to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {
            assert lastDamage && turnCount+1==bg.turnCount
          }
          onAttack {
            damage lastDamage.value
          }
        }
      };
      case SQUIRTLE_93:
      return copy (PokemodBaseSet.SQUIRTLE_63, this);
      case STARMIE_94:
      return copy (PokemodBaseSet.STARMIE_64, this);
      case STARYU_95:
      return copy (PokemodBaseSet.STARYU_65, this);
      case TANGELA_96:
      return copy (PokemodBaseSet.TANGELA_66, this);
      case VENONAT_97:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Stun Spore", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            flip{
              applyAfterDamage PARALYZED
            }
          }
        }
        move "Leech Life", {
          text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
            removeDamageCounterEqualToDamageDone()
          }
        }
      };
      case VOLTORB_98:
      return copy (PokemodBaseSet.VOLTORB_67, this);
      case VULPIX_99:
      return copy (PokemodBaseSet.VULPIX_68, this);
      case WEEDLE_100:
      return copy (PokemodBaseSet.WEEDLE_69, this);
      case COMPUTER_SEARCH_101:
      return copy (PokemodBaseSet.COMPUTER_SEARCH_71, this);
      case IMPOSTER_PROFESSOR_OAK_102:
      return copy (PokemodBaseSet.IMPOSTER_PROFESSOR_OAK_73, this);
      case ITEM_FINDER_103:
      return copy (PokemodBaseSet.ITEM_FINDER_74, this);
      case LASS_104:
      return copy (PokemodBaseSet.LASS_75, this);
      case POKEMON_BREEDER_105:
      return copy (PokemodBaseSet.POKEMON_BREEDER_76, this);
      case POKEMON_TRADER_106:
      return copy (PokemodBaseSet.POKEMON_TRADER_77, this);
      case SCOOP_UP_107:
      return copy (PokemodBaseSet.SCOOP_UP_78, this);
      case SUPER_ENERGY_REMOVAL_108:
      return copy (PokemodBaseSet.SUPER_ENERGY_REMOVAL_79, this);
      case DEFENDER_109:
      return copy (PokemodBaseSet.DEFENDER_80, this);
      case ENERGY_RETRIEVAL_110:
      return copy (PokemodBaseSet.ENERGY_RETRIEVAL_81, this);
      case FULL_HEAL_111:
      return copy (PokemodBaseSet.FULL_HEAL_82, this);
      case MAINTENANCE_112:
      return copy (PokemodBaseSet.MAINTENANCE_83, this);
      case PLUSPOWER_113:
      return copy (PokemodBaseSet.PLUSPOWER_84, this);
      case POKEMON_CENTER_114:
      return copy (PokemodBaseSet.POKEMON_CENTER_85, this);
      case POKEDEX_115:
      return copy (PokemodBaseSet.POKEDEX_87, this);
      case PROFESSOR_OAK_116:
      return copy (PokemodBaseSet.PROFESSOR_OAK_88, this);
      case SUPER_POTION_117:
      return copy (PokemodBaseSet.SUPER_POTION_90, this);
      case BILL_118:
      return copy (PokemodBaseSet.BILL_91, this);
      case ENERGY_REMOVAL_119:
      return copy (PokemodBaseSet.ENERGY_REMOVAL_92, this);
      case GUST_OF_WIND_120:
      return copy (PokemodBaseSet.GUST_OF_WIND_93, this);
      case POKE_BALL_121:
      return basicTrainer (this) {
        text "Flip a coin. If heads, you may search your deck for any Basic Pokémon or Evolution card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
        onPlay {
          my.deck.search(cardTypeFilter(POKEMON)).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Your deck is empty"
        }
      };
      case POTION_122:
      return copy (PokemodBaseSet.POTION_94, this);
      case SWITCH_123:
      return copy (PokemodBaseSet.SWITCH_95, this);
      case DOUBLE_COLORLESS_ENERGY_124:
      return copy (PokemodBaseSet.DOUBLE_COLORLESS_ENERGY_96, this);
      case FIGHTING_ENERGY_125:
      return basicEnergy (this, F);
      case FIRE_ENERGY_126:
      return basicEnergy (this, R);
      case GRASS_ENERGY_127:
      return basicEnergy (this, G);
      case LIGHTNING_ENERGY_128:
      return basicEnergy (this, L);
      case PSYCHIC_ENERGY_129:
      return basicEnergy (this, P);
      case WATER_ENERGY_130:
      return basicEnergy (this, W);
        default:
      return null;
    }
  }
}
