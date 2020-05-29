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
  DUGTRIO_19 ("Dugtrio", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ELECTABUZZ_24 ("Electabuzz", 24, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_25 ("Electrode", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  KANGASKHAN_26 ("Kangaskhan", 26, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  MR__MIME_27 ("Mr. Mime", 27, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
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
            reduceDamageNextTurn(hp(20), thisMove)
					}
				}
			};
      case CLEFAIRY_6:
      return copy (PokemodBaseSet.CLEFAIRY_5, this);
      case GYARADOS_7:
      return evolution (this, from:"Magikarp", hp:HP100, type:W, retreatCost:3) {
				weakness L
				resistance F, MINUS30
				move "Dragon Rage", {
					text "50 damage. "
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Bubblebeam", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case HITMONCHAN_8:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
				weakness P
				move "Jab", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Special Punch", {
					text "40 damage. "
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case MAGNETON_9:
      return evolution (this, from:"Magnemite", hp:HP060, type:L, retreatCost:1) {
				weakness F
				move "Thunder Wave", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Selfdestruct", {
					text "80 damage. Does 20 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Magneton does 80 damage to itself."
					energyCost L, L, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case MEWTWO_10:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
				weakness P
				move "Psychic", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Barrier", {
					text "Discard 1 [P] Energy card attached to Mewtwo in order to use this attack. During your opponent's next turn, prevent all effects of attacks, including damage, done to Mewtwo."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case NIDOKING_11:
      return evolution (this, from:"Nidorino", hp:HP100, type:G, retreatCost:3) {
				weakness P
				move "Thrash", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Nidoking does 10 damage to itself."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Toxic", {
					text "40 damage. The Defending Pokémon is now Poisoned. It now takes 20 Poison damage instead of 10 after each player's turn (even if it was already Poisoned)."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case NIDOQUEEN_12:
      return evolution (this, from:"Nidorina", hp:HP100, type:G, retreatCost:3) {
				weakness P
				move "Boyfriends", {
					text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
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
      return evolution (this, from:"Vulpix", hp:HP080, type:R, retreatCost:1) {
				weakness W
				move "Lure", {
					text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon."
					energyCost R
					attackRequirement {}
					onAttack {

					}
				}
				move "Fire Blast", {
					text "80 damage. Discard 2 [R] Energy cards attached to Ninetales in order to use this attack."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case PIDGEOT_14:
      return evolution (this, from:"Pidgeotto", hp:HP080, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				pokemonPower "Quick Search", {
					text "Once during your turn (before your attack), you may choose 1 card from your deck and put it into your hand. If you do, put 2 damage counters on Pidgeot. Shuffle your deck afterward. You can't use more than 1 Quick Search Pokémon Power each turn. This Power can't be used if Pidgeot is affected by a Special Condition."
					actionA {
					}
				}
				move "Hurricane", {
					text "30 damage. Unless this attack Knocks Out the Defending Pokémon, return the Defending Pokémon and all cards attached to it to your opponent's hand."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case POLIWRATH_15:
      return evolution (this, from:"Poliwhirl", hp:HP100, type:W, retreatCost:3) {
				weakness G
				move "Water Gun", {
					text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Poliwrath but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd doesn't count."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Whirlpool", {
					text "40 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case RAICHU_16:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
				weakness F
				move "Agility", {
					text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Raichu."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Thunder", {
					text "60 damage. Flip a coin. If tails, Raichu does 30 damage to itself."
					energyCost L, L, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case SCYTHER_17:
      return basic (this, hp:HP070, type:G, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Swords Dance", {
					text "During your next turn, Scyther's Slash attack's base damage is 60 instead of 30."
					energyCost G
					attackRequirement {}
					onAttack {

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
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:2) {
				weakness R
				pokemonPower "Energy Trans", {
					text "As often as you like during your turn (before your attack), you may take 1 [G] Energy card attached to 1 of your Pokémon and attach it to a different one (excluding Pokémon-ex). This power can't be used if Venusaur is affected by a Special Condition."
					actionA {
					}
				}
				move "Solarbeam", {
					text "60 damage. "
					energyCost G, G, G, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case WIGGLYTUFF_19:
      return evolution (this, from:"Jigglypuff", hp:HP080, type:C, retreatCost:2) {
				weakness F
				resistance P, MINUS30
				move "Lullaby", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Do the Wave", {
					text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case ZAPDOS_20:
      return basic (this, hp:HP090, type:L, retreatCost:3) {
				move "Thunder", {
					text "60 damage. Flip a coin. If tails, Zapdos does 30 damage to itself."
					energyCost L, L, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Thunderbolt", {
					text "100 damage. Discard 3 [L] Energy cards attached to Zapdos in order to use this attack."
					energyCost L, L, L, L
					attackRequirement {}
					onAttack {
						damage 100
					}
				}
			};
      case BEEDRILL_21:
      return evolution (this, from:"Kakuna", hp:HP090, type:G, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Twineedle", {
					text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Poison Sting", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case DRAGONAIR_22:
      return evolution (this, from:"Dratini", hp:HP080, type:C, retreatCost:2) {
				resistance P, MINUS30
				move "Slam", {
					text "Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Hyper Beam", {
					text "20 damage. If the Defending Pokémon has any energy cards attached to it, choose 1 of them and discard it."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 20
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
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Earthquake", {
					text "70 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case ELECTABUZZ_24:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
				weakness F
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Thunderpunch", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Electabuzz does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case ELECTRODE_25:
      return evolution (this, from:"Voltorb", hp:HP080, type:L, retreatCost:1) {
				weakness F
				pokemonPower "Buzzap", {
					text "At any time during your turn (before your attack) you may Knock Out Electrode and attach it to 1 of your other Pokémon. If you do, chose a type of Energy. is now an Energy card (instead of a Pokémon) that provides 2 energy of that type. This power can't be used if Electrode is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Electric Shock", {
					text "50 damage. Flip a coin. If tails, Electrode does 10 damage to itself."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case KANGASKHAN_26:
      return basic (this, hp:HP090, type:C, retreatCost:3) {
				weakness F
				resistance P, MINUS30
				move "Fetch", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Comet Punch", {
					text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case MR__MIME_27:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
				weakness P
				pokemonPower "Invisible Wall", {
					text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can't be used if Mr. Mime is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Meditate", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case PIDGEOTTO_28:
      return evolution (this, from:"Pidgey", hp:HP060, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				move "Whirlwind", {
					text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Mirror Move", {
					text "If Pidgeotto was attacked last turn, do the final result of that attack on Pidgeotto to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case PINSIR_29:
      return basic (this, hp:HP080, type:G, retreatCost:1) {
				weakness R
				move "Irongrip", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
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
				pokemonPower "Thick Skinned", {
					text "Snorlax can't become Asleep, Confused, Paralyzed, or Poisoned. This power can't be used if Snorlax is already Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Body Slam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case VENOMOTH_31:
      return evolution (this, from:"Venonat", hp:HP070, type:G, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				pokemonPower "Shift", {
					text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than [C]. This power can't be used if Venomoth is affected by a Special Condition."
					actionA {
					}
				}
				move "Venom Powder", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 10
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

					}
				}
				move "Acid", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon can't retreat during your opponent's next turn."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case ARCANINE_33:
      return evolution (this, from:"Growlithe", hp:HP100, type:R, retreatCost:3) {
				weakness W
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Arcanine in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Take Down", {
					text "80 damage. Arcanine does 30 damage to itself."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
			};
      case BUTTERFREE_34:
      return evolution (this, from:"Metapod", hp:HP090, type:G, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Whirlwind", {
					text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Mega Drain", {
					text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
					energyCost G, G, G, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case CHARMELEON_35:
      return evolution (this, from:"Charmander", hp:HP080, type:R, retreatCost:1) {
				weakness W
				move "Slash", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Charmander in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case DEWGONG_36:
      return evolution (this, from:"Seel", hp:HP080, type:W, retreatCost:1) {
				weakness L
				move "Aurora Beam", {
					text "50 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Ice Beam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case DODRIO_37:
      return evolution (this, from:"Doduo", hp:HP070, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				pokemonPower "Retreat Aid", {
					text "As long as Dodrio is Benched, pay 1 [C] less to retreat your Active Pokémon."
					actionA {
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case DRATINI_38:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
				resistance P, MINUS30
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case EXEGGUTOR_39:
      return evolution (this, from:"Exeggcute", hp:HP080, type:G, retreatCost:3) {
				weakness R
				move "Teleport", {
					text "Switch Exeggutor with 1 of your Benched Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Big Eggsplosion", {
					text "20x damage. Flip a number of coins equal to the number of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case FARFETCH_D_40:
      return basic (this, hp:HP060, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				move "Leek Slap", {
					text "Flip a coin. If tails, this attack does nothing. Either way, you can't use this attack again as long as Farfetch'd stays in play (even putting Farfetch'd on the Bench won't let you use it again)."
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Pot Smash", {
					text "30 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
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
      return basic (this, hp:HP060, type:R, retreatCost:1) {
				weakness W
				move "Flare", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case HAUNTER_43:
      return evolution (this, from:"Gastly", hp:HP060, type:P, retreatCost:0) {
				weakness D
				resistance F, MINUS30
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Dream Eater", {
					text "You can't use this attack unless the Defending Pokémon is Asleep."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
			};
      case IVYSAUR_44:
      return evolution (this, from:"Bulbasaur", hp:HP070, type:G, retreatCost:1) {
				weakness R
				move "Vine Whip", {
					text "30 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Poisonpowder", {
					text "30 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case JYNX_45:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
				weakness P
				move "Doubleslap", {
					text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Meditate", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case KADABRA_46:
      return evolution (this, from:"Abra", hp:HP060, type:P, retreatCost:3) {
				weakness P
				move "Recover", {
					text "Discard 1 [P] Energy card attached to Kadabra in order to use this attack. Remove all damage counters from Kadabra."
					energyCost P, P
					attackRequirement {}
					onAttack {

					}
				}
				move "Super Psy", {
					text "50 damage. "
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case KAKUNA_47:
      return evolution (this, from:"Weedle", hp:HP080, type:G, retreatCost:2) {
				weakness R
				move "Stiffen", {
					text "Flip a coin. If heads, prevent all damage done to Kakuna during your opponent's next turn. (Any other effects of attacks still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Poisonpowder", {
					text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, C
					attackRequirement {}
					onAttack {

					}
				}
			};
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
					}
				}
				move "Supersonic", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case MACHOKE_49:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:3) {
				weakness P
				move "Karate Chop", {
					text "Does 50 damage minus 10 damage for each Damage Counter on Machoke."
					energyCost F, F, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Submission", {
					text "60 damage. Machoke does 20 damage to itself."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
			};
      case MAGIKARP_50:
      return basic (this, hp:HP030, type:W, retreatCost:0) {
				weakness L
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Flail", {
					text "10x damage. Does 10 damage times the number of damage counters on Magikarp."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case MAGMAR_51:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
				weakness W
				move "Fire Punch", {
					text "30 damage. "
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Magmar in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case MAROWAK_52:
      return evolution (this, from:"Cubone", hp:HP070, type:F, retreatCost:1) {
				weakness G
				resistance L, MINUS30
				move "Bonemerang", {
					text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Call for Friend", {
					text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
					energyCost F
					attackRequirement {}
					onAttack {

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

					}
				}
				move "Double Kick", {
					text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case NIDORINO_54:
      return evolution (this, from:"Nidoran♂", hp:HP070, type:G, retreatCost:1) {
				weakness P
				move "Double Kick", {
					text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Horn Drill", {
					text "50 damage. "
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case PARASECT_55:
      return evolution (this, from:"Paras", hp:HP060, type:G, retreatCost:1) {
				weakness R
				move "Spore", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {

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
					}
				}
			};
      case POLIWHIRL_57:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
				weakness G
				move "Amnesia", {
					text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
					energyCost W, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Doubleslap", {
					text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case RATICATE_58:
      return evolution (this, from:"Rattata", hp:HP060, type:C, retreatCost:1) {
				weakness F
				resistance P, MINUS30
				move "Bite", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Super Fang", {
					text "Does damage to the Defending Pokémon equal to half the Defending Pokémon's remaining HP (rounded up to the nearest 10)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
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
      return basic (this, hp:HP060, type:W, retreatCost:1) {
				weakness L
				move "Headbutt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
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
					}
				}
				move "Rampage", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. Flip a coin. If tails, Tauros is now Confused (after doing damage)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case WARTORTLE_63:
      return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:1) {
				weakness L
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage done to Wartortle during your opponent's next turn. (Any other effects of attacks still happen.)"
					energyCost W, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Bite", {
					text "40 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case WEEPINBELL_64:
      return evolution (this, from:"Bellsprout", hp:HP070, type:G, retreatCost:1) {
				weakness R
				move "Poisonpowder", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
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
      return basic (this, hp:HP030, type:P, retreatCost:0) {
				weakness P
				move "Psyshock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
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
					attackRequirement {}
					onAttack {

					}
				}
			};
      case BULBASAUR_67:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "Leech Seed", {
					text "10 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Bulbasaur."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case CATERPIE_68:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "String Shot", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case CHARMANDER_69:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
				weakness W
				move "Scratch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Ember", {
					text "30 damage. Discard 1 [R] Energy card attached to Charmander in order to use this attack."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case CUBONE_70:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness G
				resistance L, MINUS30
				move "Snivel", {
					text "If the Defending Pokémon attacks Cubone during your opponent's next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
					energyCost C
					attackRequirement {}
					onAttack {

					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case DIGLETT_71:
      return basic (this, hp:HP030, type:F, retreatCost:0) {
				weakness G
				resistance L, MINUS30
				move "Dig", {
					text "10 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Mud Slap", {
					text "30 damage. "
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case DODUO_72:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				move "Fury Attack", {
					text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case DROWZEE_73:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness P
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Confuse Ray", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case EXEGGCUTE_74:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Leech Seed", {
					text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Exeggcute."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case GASTLY_75:
      return basic (this, hp:HP040, type:P, retreatCost:0) {
				weakness D
				resistance F, MINUS30
				move "Sleeping Gas", {
					text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {

					}
				}
				move "Destiny Bond", {
					text "Discard 1 [P] Energy card attached to Gastly in order to use this attack. If a Pokémon Knocks Out Gastly during your opponent's next turn, Knock Out that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {

					}
				}
			};
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
      return basic (this, hp:HP050, type:F, retreatCost:1) {
				weakness P
				move "Low Kick", {
					text "20 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case MAGNEMITE_79:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				move "Thunder Wave", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Selfdestruct", {
					text "40 damage. Does 10 damage to each Pokémon on each player's Bench. (Don't apply Weakness and Resistance for Benched Pokémon.) Magnemite does 40 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
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
					}
				}
			};
      case METAPOD_81:
      return evolution (this, from:"Caterpie", hp:HP070, type:G, retreatCost:2) {
				weakness R
				move "Stiffen", {
					text "Flip a coin. If heads, prevent all damage done to Metapod during your opponent's next turn. (Any other effects of attacks still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {

					}
				}
				move "Stun Spore", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case NIDORAN_FEMALE_82:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness P
				move "Fury Swipes", {
					text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon named Nidoran M or Nidoran F and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
			};
      case NIDORAN_MALE_83:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness P
				move "Horn Hazard", {
					text "Flip a coin. If tails, this attack does nothing."
					energyCost G
					attackRequirement {}
					onAttack {

					}
				}
			};
      case ONIX_84:
      return basic (this, hp:HP090, type:F, retreatCost:3) {
				weakness G
				move "Rock Throw", {
					text "10 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Harden", {
					text "During your opponent's next turn, whenever 30 or less damage is done to Onix (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
					energyCost F, F
					attackRequirement {}
					onAttack {

					}
				}
			};
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

					}
				}
			};
      case PIDGEY_86:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Whirlwind", {
					text "10 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case PIKACHU_87:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
				weakness F
				move "Gnaw", {
					text "20 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case POLIWAG_88:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
				weakness G
				move "Water Gun", {
					text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Poliwag but not used to pay for this attack's Energy cost. Extra [W] Energy after the 2nd don't count."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case RATTATA_89:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
				weakness F
				resistance P, MINUS30
				move "Bite", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case RHYHORN_90:
      return basic (this, hp:HP070, type:F, retreatCost:3) {
				weakness G
				resistance L, MINUS30
				move "Leer", {
					text "Flip a coin. If heads, the Defending Pokémon can't attack Rhyhorn during your opponent's next turn. (Benching either Pokémon ends this effect.)"
					energyCost C
					attackRequirement {}
					onAttack {

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
      return basic (this, hp:HP040, type:F, retreatCost:1) {
				weakness G
				resistance L, MINUS30
				move "Sand-attack", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case SPEAROW_92:
      return basic (this, hp:HP050, type:C, retreatCost:0) {
				weakness L
				resistance F, MINUS30
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
					attackRequirement {}
					onAttack {

					}
				}
			};
      case SQUIRTLE_93:
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
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage done to Squirtle during your opponent's next turn. (Any other effects of attacks still happen.)"
					energyCost W, C
					attackRequirement {}
					onAttack {

					}
				}
			};
      case STARMIE_94:
      return evolution (this, from:"Staryu", hp:HP060, type:W, retreatCost:1) {
				weakness L
				move "Recover", {
					text "Discard 1 [W] Energy card attached to Starmie in order to use this attack. Remove all damage counters from Starmie."
					energyCost W, W
					attackRequirement {}
					onAttack {

					}
				}
				move "Star Freeze", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case STARYU_95:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
				weakness L
				move "Slap", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case TANGELA_96:
      return basic (this, hp:HP060, type:G, retreatCost:2) {
				weakness R
				resistance W, MINUS30
				move "Bind", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Poisonpowder", {
					text "30 damage. The Defending Pokémon is now Poisoned."
					energyCost G, C, G
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case VENONAT_97:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Stun Spore", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Leech Life", {
					text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case VOLTORB_98:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case VULPIX_99:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
				weakness W
				move "Confuse Ray", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case WEEDLE_100:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "Poison Sting", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case COMPUTER_SEARCH_101:
      return basicTrainer (this) {
				text "Discard 2 of the other cards from your hand in order to search your deck for any card and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
      case IMPOSTER_PROFESSOR_OAK_102:
      return basicTrainer (this) {
				text "Your opponent shuffles his or her hand into his or her deck, then draws 7 cards."
				onPlay {
				}
				playRequirement{
				}
			};
      case ITEM_FINDER_103:
      return basicTrainer (this) {
				text "You may choose to Discard 1 card from your hand in order to search your discard pile for a Supporter card. Show it to your opponent and put it into your hand. Or" +
					"you may choose to Discard 2 cards from your hand in order to search your discard pile for a Trainer card (excluding Supporter cards). Show it to your opponent and put it into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
      case LASS_104:
      return supporter (this) {
				text "You and your opponent show each other your hands, then shuffle all the Trainer cards from your hands into your decks."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKEMON_BREEDER_105:
      return basicTrainer (this) {
				text "Put a Stage 2 Evolution card from your hand on the matching Basic Pokémon. You can only play this card when you would be allowed to evolve that Pokémon anyway."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKEMON_TRADER_106:
      return basicTrainer (this) {
				text "Trade 1 of the Basic Pokémon or Evolution cards in your hand for 1 of the Basic Pokémon or Evolution cards from your deck. Show both cards to your opponent. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
      case SCOOP_UP_107:
      return basicTrainer (this) {
				text "Choose 1 of your own Pokémon in play and return its Basic Pokémon card to your hand. (Discard all cards attached to that card.)"
				onPlay {
				}
				playRequirement{
				}
			};
      case SUPER_ENERGY_REMOVAL_108:
      return basicTrainer (this) {
				text "Discard 1 Special Energy attached to 1 of your opponent's Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case DEFENDER_109:
      return basicTrainer (this) {
				text "Attach Defender to 1 of your Pokémon (excluding [M] Pokémon). At the end of your opponent's next turn, discard Defender. Damage done to that Pokémon by attacks is reduced by 20 (after applying Weakness and Resistance)."
				onPlay {
				}
				playRequirement{
				}
			};
      case ENERGY_RETRIEVAL_110:
      return basicTrainer (this) {
				text "Put 2 basic Energy cards from your discard pile into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
      case FULL_HEAL_111:
      return basicTrainer (this) {
				text "Your Active Pokémon is no longer Asleep, Confused, Paralyzed, or Poisoned."
				onPlay {
				}
				playRequirement{
				}
			};
      case MAINTENANCE_112:
      return basicTrainer (this) {
				text "Shuffle 2 of the other cards from your hand into your deck in order to draw a card."
				onPlay {
				}
				playRequirement{
				}
			};
      case PLUSPOWER_113:
      return basicTrainer (this) {
				text "Attach PlusPower to your Active Pokémon (excluding [D] Pokémon). At the end of your turn, discard PlusPower. If this Pokémon's attack does damage to the defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKEMON_CENTER_114:
      return basicTrainer (this) {
				text "Remove all damage counters from 1 of your own Pokémon, then discard all Energy cards attached to those Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKEDEX_115:
      return basicTrainer (this) {
				text "Look at up to 5 cards from the top of your deck and rearrange them as you like."
				onPlay {
				}
				playRequirement{
				}
			};
      case PROFESSOR_OAK_116:
      return supporter (this) {
				text "Discard your hand, then draw 7 cards."
				onPlay {
				}
				playRequirement{
				}
			};
      case SUPER_POTION_117:
      return basicTrainer (this) {
				text "Discard 1 Energy card attached to 1 of your own Pokémon in order to remove up to 4 damage counters from that Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case BILL_118:
      return basicTrainer (this) {
				text "Draw 2 cards."
				onPlay {
				}
				playRequirement{
				}
			};
      case ENERGY_REMOVAL_119:
      return basicTrainer (this) {
				text "Discard 1 Energy card attached to your opponent's Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case GUST_OF_WIND_120:
      return basicTrainer (this) {
				text "Choose 1 of your opponent's Benched Pokémon and switch it with his or her Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case POKE_BALL_121:
      return basicTrainer (this) {
				text "Flip a coin. If heads, you may search your deck for any Basic Pokémon or Evolution card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
      case POTION_122:
      return basicTrainer (this) {
				text "Remove up to 2 damage counters from 1 of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case SWITCH_123:
      return basicTrainer (this) {
				text "Switch 1 of your Benched Pokémon with your Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
      case DOUBLE_COLORLESS_ENERGY_124:
      return specialEnergy (this, [[C]]) {
				text "Provides energy. Doesn't count as a basic energy card."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
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
