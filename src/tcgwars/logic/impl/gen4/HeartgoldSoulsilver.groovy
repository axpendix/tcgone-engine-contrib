package tcgwars.logic.impl.gen4;

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
import static tcgwars.logic.card.Weakness.*

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
 * @author axpendix@hotmail.com
 */
public enum HeartgoldSoulsilver implements CardInfo {

	ARCANINE_1 ("Arcanine", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	AZUMARILL_2 ("Azumarill", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	CLEFABLE_3 ("Clefable", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	GYARADOS_4 ("Gyarados", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	HITMONTOP_5 ("Hitmontop", 5, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	JUMPLUFF_6 ("Jumpluff", 6, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	NINETALES_7 ("Ninetales", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	NOCTOWL_8 ("Noctowl", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	QUAGSIRE_9 ("Quagsire", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	RAICHU_10 ("Raichu", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	SHUCKLE_11 ("Shuckle", 11, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SLOWKING_12 ("Slowking", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	WOBBUFFET_13 ("Wobbuffet", 13, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	AMPHAROS_14 ("Ampharos", 14, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	ARIADOS_15 ("Ariados", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BUTTERFREE_16 ("Butterfree", 16, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	CLEFFA_17 ("Cleffa", 17, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	EXEGGUTOR_18 ("Exeggutor", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	FARFETCH_D_19 ("Farfetch'd", 19, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	FERALIGATR_20 ("Feraligatr", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	FURRET_21 ("Furret", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	GRANBULL_22 ("Granbull", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	HYPNO_23 ("Hypno", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	LAPRAS_24 ("Lapras", 24, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	LEDIAN_25 ("Ledian", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	MEGANIUM_26 ("Meganium", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PERSIAN_27 ("Persian", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	PICHU_28 ("Pichu", 28, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	SANDSLASH_29 ("Sandslash", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	SMOOCHUM_30 ("Smoochum", 30, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	SUNFLORA_31 ("Sunflora", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TYPHLOSION_32 ("Typhlosion", 32, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	TYROGUE_33 ("Tyrogue", 33, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	WEEZING_34 ("Weezing", 34, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	BAYLEEF_35 ("Bayleef", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BLISSEY_36 ("Blissey", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	CORSOLA_37 ("Corsola", 37, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	CROCONAW_38 ("Croconaw", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DELIBIRD_39 ("Delibird", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	DONPHAN_40 ("Donphan", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DUNSPARCE_41 ("Dunsparce", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	FLAAFFY_42 ("Flaaffy", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	HERACROSS_43 ("Heracross", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	IGGLYBUFF_44 ("Igglybuff", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	MANTINE_45 ("Mantine", 45, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	METAPOD_46 ("Metapod", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	MILTANK_47 ("Miltank", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	PARASECT_48 ("Parasect", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	QUILAVA_49 ("Quilava", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	QWILFISH_50 ("Qwilfish", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	SKIPLOOM_51 ("Skiploom", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	SLOWBRO_52 ("Slowbro", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	STARMIE_53 ("Starmie", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	UNOWN_54 ("Unown", 54, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_55 ("Unown", 55, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	WIGGLYTUFF_56 ("Wigglytuff", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	CATERPIE_57 ("Caterpie", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CHANSEY_58 ("Chansey", 58, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	CHIKORITA_59 ("Chikorita", 59, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CLEFAIRY_60 ("Clefairy", 60, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	CYNDAQUIL_61 ("Cyndaquil", 61, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	DROWZEE_62 ("Drowzee", 62, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	EXEGGCUTE_63 ("Exeggcute", 63, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GIRAFARIG_64 ("Girafarig", 64, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	GROWLITHE_65 ("Growlithe", 65, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	HOOTHOOT_66 ("Hoothoot", 66, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	HOPPIP_67 ("Hoppip", 67, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	JIGGLYPUFF_68 ("Jigglypuff", 68, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	JYNX_69 ("Jynx", 69, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	KOFFING_70 ("Koffing", 70, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	LEDYBA_71 ("Ledyba", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MAGIKARP_72 ("Magikarp", 72, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAREEP_73 ("Mareep", 73, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MARILL_74 ("Marill", 74, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MEOWTH_75 ("Meowth", 75, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PARAS_76 ("Paras", 76, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PHANPY_77 ("Phanpy", 77, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PIKACHU_78 ("Pikachu", 78, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	SANDSHREW_79 ("Sandshrew", 79, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SENTRET_80 ("Sentret", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SLOWPOKE_81 ("Slowpoke", 81, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SNUBBULL_82 ("Snubbull", 82, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SPINARAK_83 ("Spinarak", 83, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	STARYU_84 ("Staryu", 84, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SUNKERN_85 ("Sunkern", 85, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TOTODILE_86 ("Totodile", 86, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	VULPIX_87 ("Vulpix", 87, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	WOOPER_88 ("Wooper", 88, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BILL_89 ("Bill", 89, Rarity.UNCOMMON, [TRAINER]),
	COPYCAT_90 ("Copycat", 90, Rarity.UNCOMMON, [TRAINER]),
	ENERGY_SWITCH_91 ("Energy Switch", 91, Rarity.UNCOMMON, [TRAINER]),
	FISHERMAN_92 ("Fisherman", 92, Rarity.UNCOMMON, [TRAINER]),
	FULL_HEAL_93 ("Full Heal", 93, Rarity.UNCOMMON, [TRAINER]),
	MOOMOO_MILK_94 ("Moomoo Milk", 94, Rarity.UNCOMMON, [TRAINER]),
	POKE_BALL_95 ("Poké Ball", 95, Rarity.UNCOMMON, [TRAINER]),
	POKEGEAR_3_0_96 ("Pokégear 3.0", 96, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_COLLECTOR_97 ("Pokémon Collector", 97, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_COMMUNICATION_98 ("Pokémon Communication", 98, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_REVERSAL_99 ("Pokémon Reversal", 99, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_ELM_S_TRAINING_METHOD_100 ("Professor Elm's Training Method", 100, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_OAK_S_NEW_THEORY_101 ("Professor Oak's New Theory", 101, Rarity.UNCOMMON, [TRAINER]),
	SWITCH_102 ("Switch", 102, Rarity.UNCOMMON, [TRAINER]),
	DOUBLE_COLORLESS_ENERGY_103 ("Double Colorless Energy", 103, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	RAINBOW_ENERGY_104 ("Rainbow Energy", 104, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	AMPHAROS_PRIME_105 ("Ampharos Prime", 105, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	BLISSEY_PRIME_106 ("Blissey Prime", 106, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DONPHAN_PRIME_107 ("Donphan Prime", 107, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	FERALIGATR_PRIME_108 ("Feraligatr Prime", 108, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	MEGANIUM_PRIME_109 ("Meganium Prime", 109, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	TYPHLOSION_PRIME_110 ("Typhlosion Prime", 110, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	HO_OH_LEGEND_111 ("Ho-Oh LEGEND", 111, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_, LEGEND]),
	HO_OH_LEGEND_112 ("Ho-Oh LEGEND", 112, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_, LEGEND]),
	LUGIA_LEGEND_113 ("Lugia LEGEND", 113, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
	LUGIA_LEGEND_114 ("Lugia LEGEND", 114, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
	GRASS_ENERGY_115 ("Grass Energy", 115, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIRE_ENERGY_116 ("Fire Energy", 116, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	WATER_ENERGY_117 ("Water Energy", 117, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	LIGHTNING_ENERGY_118 ("Lightning Energy", 118, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	PSYCHIC_ENERGY_119 ("Psychic Energy", 119, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIGHTING_ENERGY_120 ("Fighting Energy", 120, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	DARKNESS_ENERGY_121 ("Darkness Energy", 121, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	METAL_ENERGY_122 ("Metal Energy", 122, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	GYARADOS_123 ("Gyarados", 123, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	ALPH_LITHOGRAPH_ONE ("Alph Lithograph", 124, Rarity.HOLORARE, [TRAINER]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	HeartgoldSoulsilver(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.HEARTGOLD_SOULSILVER;
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
			case ARCANINE_1:
			return evolution (this, from:"Growlithe", hp:HP110, type:FIRE, retreatCost:2) {
				weakness W
				move "Sharp Fang", {
					text "50 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Fire Mane", {
					text "90 damage. "
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
						damage 90
					}
				}
				
			};
			case AZUMARILL_2:
			return evolution (this, from:"Marill", hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				move "Waterfall", {
					text "40 damage. "
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				move "Bubblebeam", {
					text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 60
						flipThenApplySC PARALYZED
					}
				}
				
			};
			case CLEFABLE_3:
			return evolution (this, from:"Clefairy", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Fairy Power", {
					text "Return 1 of your Pokémon and all cards attached to it to your hand."
					energyCost C, C
					attackRequirement {}
					onAttack {
						def pcs = my.all.findAll.select()
						pcs.cards.moveTo(hand)
						removePCS(pcs)
					}
				}
				move "Moon Impact", {
					text "40 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
				
			};
			case GYARADOS_4:
			return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
				weakness L
				resistance F, MINUS30
				move "Hydro Splash", {
					text "50 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
				move "Hyper Beam", {
					text "80 damage. Discard an Energy card attached to the Defending Pokémon."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 80
						discardDefendingEnergy
					}
				}
				
			};
			case HITMONTOP_5:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness P
				move "Triple Kick", {
					text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost F
					attackRequirement {}
					onAttack {
						flip 3,{damage 20}
					}
				}
				move "Close Combat", {
					text "60 damage. ."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case JUMPLUFF_6:
			return evolution (this, from:"Skiploom", hp:HP090, type:GRASS, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Mass Attack", {
					text "10x damage. Does 10 damage times the number of Pokémon in play (both yours and your opponent's). "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10*all.size()
					}
				}
				move "Leaf Guard", {
					text "30 damage. ."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				
			};
			case NINETALES_7:
			return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:1) {
				weakness W
				pokePower "Roast Reveal", {
					text "Once during your turn , you may discard a Energy card from your hand. If you do, draw 3 cards. This power can’t be used if Ninetales is affected by a Special Condition."
					actionA {
						checkLastTurn()
						checkNoSPC()
						assert my.hand.filterByType(ENERGY)
						powerUsed()
						my.hand.filterByType(ENERGY).select("Discard an Energy card").discard()
						draw 3
					}
				}
				move "Will-o’-the-wisp", {
					text "60 damage. "
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case NOCTOWL_8:
			return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				pokePower "Night Sight", {
					text "Once during your turn , you may draw a card. This power can’t be used if Noctowl is affected by a Special Condition."
					actionA {
						checkLastTurn()
						checkNoSPC()
						powerUsed()
						draw 1
					}
				}
				move "Extrasensory", {
					text "40 damage. If you have the same number of cards in your hand as your opponent, this attack does 40 damage plus 40 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 40
						if(my.hand.size() == opp.hand.size()) {
							damage 40
						}
					}
				}
				
			};
			case QUAGSIRE_9:
			return evolution (this, from:"Wooper", hp:HP100, type:WATER, retreatCost:3) {
				weakness G
				resistance L, MINUS30
				move "Muddy Water", {
					text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 40
						damage(20,opp.bench.select("20 damage to "))
					}
				}
				move "Mud Shot", {
					text "60 damage. "
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				
			};
			case RAICHU_10:
			return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:0) {
				weakness F
				resistance M, MINUS30
				move "Iron Tail", {
					text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						flipUntilTails {damage 30} 
					}
				}
				move "Thunderbolt", {
					text "100 damage. Discard all Energy attached to Raichu."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 100
						discardAllSelfEnergy
					}
				}
				
			};
			case SHUCKLE_11:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R
				pokeBody "Shell Barricade", {
					text " As long as Shuckle is on your Bench, prevent all damage done to Shuckle by attacks (both yours and your opponent's)."
					delayedA {
						assert my.bench.select(this)
						before APPLY_ATTACK_DAMAGES, {
							it.dmg = hp(0)
						}
					}
				}
				move "Poison Jab", {
					text "30 damage. The Defending Pokémon is now Poisoned."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 30
						applyAfterDamage POISONED
					}
				}
				
			};
			case SLOWKING_12:
			return evolution (this, from:"Slowpoke", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokePower "Second Sight", {
					text " Once during your turn (before your attack), you may look at the top 3 cards in either player's deck and put them back on top of that player's deck in any order. This power can't be used if Slowking is affected by a Special Condition."
					actionA {
						checkLastTurn()
						checkNoSPC()
						powerUsed()
						//TODO: actually implement SLOWKING_12's Second Sight
					}
				}
				move "Psyshock", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 30
						flipThenApplySC PARALYZED
					}
				}
				
			};
			case WOBBUFFET_13:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Double Return", {
					text "Flip a coin. If heads, this attack does 20 damage times the number of damage counters on Wobbuffet."
					energyCost P, C
					attackRequirement {}
					onAttack {
						flip{damage 20*ef.attacker.numberOfDamageCounters}
					}
				}
				
			};
			case AMPHAROS_14:
			return evolution (this, from:"Flaaffy", hp:HP120, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Acceleration Bolt", {
					text "30 damage. Search your deck for up to 2 basic Energy cards and attach them to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost L
					onAttack {
						damage 30
						afterDamage{
							if(my.deck) {
								def list = my.deck.search (max: 2, cardTypeFilter(BASIC_ENERGY))
								def tar = my.all.select("Choose target")
								list.each {attachEnergy(tar, it)}
								shuffleDeck()
							  	}
							}
						}
					}
				}
				move "Thunder", {
					text "80 damage. Flip a coin. If tails, Ampharos does 20 damage to itself."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 80
						flipTails{
							damage 20 self
						}
					}
				}
				
			};
			case ARIADOS_15:
			return evolution (this, from:"Spinarak", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Leech Life", {
					text "30 damage. Remove from Ariados the number of damage counters equal to the damage you did to the Defending Pokémon."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 30
						removeDamageCounterEqualToDamageDone()
					}
				}
				move "Poisonous Saliva", {
					text "50 damage. The Defending Pokémon is now Poisoned."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
						applyAfterDamage POISONED
					}
				}
				
			};
			case BUTTERFREE_16:
			return evolution (this, from:"Metapod", hp:HP120, type:GRASS, retreatCost:0) {
				weakness L
				resistance F, MINUS30
				move "Cure Powder", {
					text "Remove 3 damage counters from each of your Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						heal 30 my.all.each
					}
				}
				move "Whirlwind", {
					text "60 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 60
						if(opp.bench){
					    afterDamage{
					      sw defending, opp.bench.oppSelect("New active")
					    }
					  }
					}
				}
				
			};
			case CLEFFA_17:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Cleffa is Asleep, prevent all damage done to Cleffa by attacks."
					delayedA {
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each {
								if(self.isSPC(ASLEEP) && it.to == self && it.dmg.value && it.notNoEffect) {
									bc "Damage is prevented because $self is Asleep"
									it.dmg = hp(0)
								}
							}
						}
					}
				}
				move "Eeeeeeek", {
					text "Shuffle your hand into your deck, then draw 6 cards. Cleffa is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						shuffleDeck(hand)
						hand.clear()
						draw 6
						apply ASLEEP, self
					}
				}
				
			};
			case EXEGGUTOR_18:
			return evolution (this, from:"Exeggcute", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Energy Absorbtion", {
					text "Search your discard pile for up to 2 Energy cards and attach them to Exeggutor."
					energyCost C
					attackRequirement {}
					onAttack {
						attachEnergyFrom(my.discard,self)
						attachEnergyFrom(my.discard,self)
					}
				}
				move "Big Eggsplosion", {
					text "40× damage. Flip a coin for each Energy attached to Exeggutor. This attack does 40 damage times the number of heads."
					energyCost P
					attackRequirement {}
					onAttack {
						flip self.cards.energyCount(C), {damage 40}
					}
				}
				
			};
			case FARFETCH_D_19:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Collect", {
					text "Draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						draw 2
					}
				}
				move "Spin Turn", {
					text "20 damage. Switch Farfetch’d with 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 20
						if(my.bench) {
							def pcs = my.bench.select("Select the new active pokemon")
           					sw my.active, pcs
						}
					}
				}
				
			};
			case FERALIGATR_20:
			return evolution (this, from:"Croconaw", hp:HP130, type:WATER, retreatCost:2) {
				weakness G
				move "Spinning Tail", {
					text "This attack does 20 damage to each of your opponent’s Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						opp.all.each {damage 20,it}
					}
				}
				move "Surf", {
					text "80 damage. "
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 80
					}
				}
				
			};
			case FURRET_21:
			return evolution (this, from:"Sentret", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Find a Friend", {
					text "Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {
						assert deck.notEmpty
					}
					onAttack {
						my.deck.search(count : 1, "Search your deck for a Pokémon", cardTypeFilter(POKEMON)).showToOpponent("Selected Pokémon").moveTo(my.hand)
						shuffleDeck()
					}

				}
				move "Quick Blow", {
					text "Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
						flip {damage 20}
					}
				}	
			};
			case GRANBULL_22:
			return evolution (this, from:"Snubbull", hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Timid Tackle", {
					text "50 damage. Granbull does 20 damage to itself. Switch Granbull with 1 of your Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 50
						damage 20, self
						if(my.bench) {
							def pcs = my.bench.select("Select the new active pokemon")
           					sw my.active, pcs
						}
					}
				}
				move "Chomp", {
					text "40+ damage. Does 40 damage plus 10 more damage for each damage counter on Granbull."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 40+10*self.numberOfDamageCounters
					}
				}
				
			};
			case HYPNO_23:
			return evolution (this, from:"Drowzee", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokePower "Sleep Pendulum", {
					text "Once during your turn , you may flip a coin. If heads, the Defending Pokémon is now Asleep. This power can’t be used if Hypno is affected by a Special Condition."
					actionA {
						checkLastTurn()
						assert !(self.specialConditions) : "$self is affected by a Special Condition."
						powerUsed()
						flipThenApplySC ASLEEP
					}
				}
				move "Psychic Shot", {
					text "30 damage. Does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance to Benched Pokémon.)"
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 30
						if(opp.bench) damage 30, opp.bench.select()
					}
				}
				
			};
			case LAPRAS_24:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness M
				move "Ice Beam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
						flipThenApplySC PARALYZED
					}
				}
				move "Ice Blade", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 30, opp.all.select()
					}
				}
				
			};
			case LEDIAN_25:
			return evolution (this, from:"Ledyba", hp:HP080, type:GRASS, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Quick Draw", {
					text "10 damage. Draw 3 cards."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "40 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEGANIUM_26:
			return evolution (this, from:"Bayleef", hp:HP130, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS30
				move "Sleep Powder", {
					text "30 damage. The Defending Pokémon is now Asleep."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Giant Bloom", {
					text "60 damage. Remove 2 damage counters from Meganium."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PERSIAN_27:
			return evolution (this, from:"Meowth", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Sharpen Claws", {
					text "Flip 3 coins. For each heads, discard a card from your opponent’s hand without looking."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sneaky Attack", {
					text "30 damage. Energy attached to it, this attack does 30 damage plus 30 more damage."
					energyCost C, C, D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PICHU_28:
			return basic (this, hp:HP030, type:LIGHTNING, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Pichu is Asleep, prevent all damage done to Pichu by attacks."
					delayedA {
					}
				}
				move "Playground", {
					text "Each player may search his or her deck for as many Basic Pokémon as he or she likes, put them onto his or her Bench, and shuffle his or her deck afterward. (You put your Pokémon on the Bench first.) Pichu is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SANDSLASH_29:
			return evolution (this, from:"Sandshrew", hp:HP080, type:FIGHTING, retreatCost:0) {
				weakness W
				resistance L, MINUS30
				move "Poison Sting", {
					text "30 damage. The Defending Pokémon is now Poisoned."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fury Swipes", {
					text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SMOOCHUM_30:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Smoochum is Asleep, prevent all damage done to Smoochum by attacks."
					delayedA {
					}
				}
				move "Energy Antics", {
					text "Move an Energy card attached to 1 of your opponent’s Pokémon to another of your opponent’s Pokémon. Smoochum is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUNFLORA_31:
			return evolution (this, from:"Sunkern", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				pokePower "Sunshine Grace", {
					text "Once during your turn , you may search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Sunflora is affected by a Special Condition."
					actionA {
					}
				}
				move "Blade Arms", {
					text "40 damage. "
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYPHLOSION_32:
			return evolution (this, from:"Quilava", hp:HP130, type:FIRE, retreatCost:1) {
				weakness W
				move "Magma Punch", {
					text "50 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Spin", {
					text "120 damage. Discard 2 Energy attached to Typhlosion."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYROGUE_33:
			return basic (this, hp:HP030, type:FIGHTING, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Tyrogue is Asleep, prevent all damage done to Tyrogue by attacks."
					delayedA {
					}
				}
				move "Mischievous Punch", {
					text "30 damage. This attack’s damage isn’t affected by Weakness or Resistance. Tyrogue is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEZING_34:
			return evolution (this, from:"Koffing", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Super Poison Breath", {
					text "The Defending Pokémon is now Poisoned."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Explosion", {
					text "90 damage. Weezing does 90 damage to itself, and don’t apply Weakness to this damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAYLEEF_35:
			return evolution (this, from:"Chikorita", hp:HP090, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Hammer In", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "50 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BLISSEY_36:
			return evolution (this, from:"Chansey", hp:HP130, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Energy Link", {
					text "10 damage. Search your discard pile for an Energy card and attach it to Blissey."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double-edge", {
					text "80 damage. Blissey does 40 damage to itself."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CORSOLA_37:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness G
				move "Recover", {
					text "Energy attached to Corsola and remove all damage counters from Corsola."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Cannon", {
					text "20 damage. Flip 2 coins. If both of them are heads, this attack does 20 damage plus 50 more damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CROCONAW_38:
			return evolution (this, from:"Totodile", hp:HP080, type:WATER, retreatCost:2) {
				weakness G
				move "Wave Splash", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Big Bite", {
					text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DELIBIRD_39:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness M
				resistance F, MINUS30
				move "Snowy Present", {
					text "Energy attached to all of your Pokémon."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hail", {
					text "This attack does 10 damage to each of your opponent’s Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DONPHAN_40:
			return evolution (this, from:"Phanpy", hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness W
				resistance L, MINUS30
				move "Rock Hurl", {
					text "50 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Spin", {
					text "Flip 2 coins. This attack does 70 damage times the number of heads."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUNSPARCE_41:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Glare", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fade Out", {
					text "20 damage. Return Dunsparce and all cards attached to it to your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAAFFY_42:
			return evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Thunder Spear", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thundershock", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HERACROSS_43:
			return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
				weakness R
				move "Green Draw", {
					text "Pokémon in play."
					energyCost G, C, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Headbutt", {
					text "30 damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case IGGLYBUFF_44:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				pokeBody "Sweet Sleeping Face", {
					text "As long as Igglybuff is Asleep, prevent all damage done to Igglybuff by attacks."
					delayedA {
					}
				}
				move "Graffiti", {
					text "Igglybuff is now Asleep. During your opponent’s next turn, the attack cost of each of the Defending Pokémon’s attacks is 1 Colorless Energy more."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANTINE_45:
			return basic (this, hp:HP080, type:WATER, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Group Swim", {
					text "Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Slash", {
					text "40 damage. Mantine can’t attack during your next turn."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case METAPOD_46:
			return evolution (this, from:"Caterpie", hp:HP080, type:GRASS, retreatCost:2) {
				weakness R
				pokeBody "Green Shield", {
					text "Each of your Pokémon has no Weakness."
					delayedA {
					}
				}
				move "Sharpen", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MILTANK_47:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness F
				move "Moomoo Squeeze", {
					text "Search your deck for a Moomoo Milk card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Body Slam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARASECT_48:
			return evolution (this, from:"Paras", hp:HP090, type:GRASS, retreatCost:2) {
				weakness R
				move "Sleep Drain", {
					text "The Defending Pokémon is now Asleep. Remove 4 damage counters from Parasect."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "60 damage. "
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QUILAVA_49:
			return evolution (this, from:"Cydnaquil", hp:HP080, type:FIRE, retreatCost:1) {
				weakness W
				move "Flare", {
					text "30 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "60 damage. Discard an Energy attached to Quilava."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QWILFISH_50:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness L
				move "Offensive Needle", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKIPLOOM_51:
			return evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
				weakness R
				resistance F, MINUS30
				move "Knock Away", {
					text "20 damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWBRO_52:
			return evolution (this, from:"Slowpoke", hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				move "Big Yawn", {
					text "30 damage. Both Slowbro and the Defending Pokémon are now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Madkinesis", {
					text "Does 30 damage plus 20 more damage for each Psychic Energy attached to Slowbro."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARMIE_53:
			return evolution (this, from:"Staryu", hp:HP090, type:WATER, retreatCost:0) {
				weakness L
				move "Cosmic Cyclone", {
					text "20× damage. Energy attached to your Pokémon as you like. This attack does 20 damage times the number of Energy you chose. Shuffle those cards back into your deck."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_54:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "RETURN", {
					text "Once during your turn, when you put Unown from your hand onto your Bench, you may return all Energy attached to 1 of your Pokémon to your hand."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_55:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "FLASH", {
					text "Once during your turn, when you put Unown from your hand onto your Bench, you may look at the top 5 cards of your deck and put them back on top of your deck in any order."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WIGGLYTUFF_56:
			return evolution (this, from:"Jigglypuff", hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Double Slap", {
					text "Flip 2 coins. This attack does 40 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Expand", {
					text "50 damage. ."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CATERPIE_57:
			return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
				weakness R
				move "Tackle", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHANSEY_58:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Pound", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Happy Punch", {
					text "30 damage. Flip a coin. If heads, remove 3 damage counters from Chansey."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHIKORITA_59:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Tackle", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY_60:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Minimize", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CYNDAQUIL_61:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness W
				move "Beat", {
					text "10 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flare", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DROWZEE_62:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness P
				move "Sleep Inducer", {
					text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gentle Slap", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EXEGGCUTE_63:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Continuous Eggsplosion", {
					text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GIRAFARIG_64:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness P
				move "Show Off", {
					text "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psyshot", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROWLITHE_65:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness W
				move "Bite", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "40 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOOTHOOT_66:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOPPIP_67:
			return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
				weakness R
				resistance F, MINUS30
				move "Bounce", {
					text "10 damage. You may switch Hoppip with 1 of your Benched Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIGGLYPUFF_68:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Hypnoblast", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JYNX_69:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Mimic", {
					text "Shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lick", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING_70:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Suffocating Gas", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LEDYBA_71:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				resistance F, MINUS30
				move "Ram", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Comet Punch", {
					text "Flip 4 coins. This attack does 10 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP_72:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness L
				move "Splash", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAREEP_73:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Static Electricity", {
					text "and attach them to Mareep. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ram", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MARILL_74:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L
				move "Water Splash", {
					text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Slap", {
					text "30 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEOWTH_75:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Pay Day", {
					text "10 damage. Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dig Claws", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARAS_76:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				move "Scratch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double-edge Claw", {
					text "30 damage. Paras does 10 damage to itself."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PHANPY_77:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
				weakness W
				resistance L, MINUS30
				move "Flail", {
					text "10× damage. Does 10 damage times the number of damage counters on Phanpy."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_78:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS30
				move "Tail Slap", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "20 damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SANDSHREW_79:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance L, MINUS30
				move "Defense Curl", {
					text "Flip a coin. If heads, prevent all damage done to Sandshrew by attacks during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rollout", {
					text "10 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SENTRET_80:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Scout", {
					text "Look at your opponent’s hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scratch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWPOKE_81:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness L
				move "Whimsy Tackle", {
					text "20 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNUBBULL_82:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Roar", {
					text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sharp Fang", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPINARAK_83:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R
				move "Hang Down", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spider Web", {
					text "The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARYU_84:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L
				move "Spinning Attack", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUNKERN_85:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Cure Kernels", {
					text "Remove 2 damage counters from 1 of your Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Seed Bomb", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOTODILE_86:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness G
				move "Gnaw", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wave Splash", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VULPIX_87:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness W
				move "Singe", {
					text "Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ember", {
					text "30 damage. Energy attached to Vulpix."
					energyCost R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WOOPER_88:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness G
				resistance L, MINUS30
				move "Tail Whip", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Watering", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BILL_89:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case COPYCAT_90:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_SWITCH_91:
			return basicTrainer (this) {
				text "Move a basic Energy card attached 1 of your Pokémon to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case FISHERMAN_92:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for 4 basic Energy cards, show them to your opponent, and put them into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case FULL_HEAL_93:
			return basicTrainer (this) {
				text "Remove all Special Conditions from your Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case MOOMOO_MILK_94:
			return basicTrainer (this) {
				text "Choose 1 of your Pokémon. Flip 2 coins. For each heads, remove 3 damage counters from that Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKE_BALL_95:
			return basicTrainer (this) {
				text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEGEAR_3_0_96:
			return basicTrainer (this) {
				text "Look at the top 7 cards of your deck. Choose a Supporter card you find there, show it to your opponent, and put it into your hand. Shuffle the other cards back into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_COLLECTOR_97:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 3 Basic Pokémon, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_COMMUNICATION_98:
			return basicTrainer (this) {
				text "Choose 1 Pokémon in your hand, show it to your opponent, and put it on top of your deck. If you do, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_REVERSAL_99:
			return basicTrainer (this) {
				text "Flip a coin. If heads, choose 1 of your opponent’s Benched Pokémon, and switch it with your opponent’s Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_ELM_S_TRAINING_METHOD_100:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_OAK_S_NEW_THEORY_101:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, draw 6 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWITCH_102:
			return basicTrainer (this) {
				text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DOUBLE_COLORLESS_ENERGY_103:
			return specialEnergy (this, [[C]]) {
				text "Double Colorless Energy Provides 2 Colorless Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case RAINBOW_ENERGY_104:
			return specialEnergy (this, [[C]]) {
				text "Attach Rainbow Energy to 1 of your Pokémon. While in play, Rainbow Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) When you attach this card from your hand to 1 of your Pokémon, put 1 damage counter on that Pokémon. (While not in play, Rainbow Energy counts as Colorless Energy.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case AMPHAROS_PRIME_105:
			return evolution (this, from:"Flaaffy", hp:HP140, type:LIGHTNING, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				pokeBody "Conductivity", {
					text "Whenever your opponent attaches an Energy card from his or her hand to 1 of his or her Pokémon, put 1 damage counter on that Pokémon."
					delayedA {
					}
				}
				move "Lightning Crush", {
					text "40 damage. Flip a coin. If heads, this attack does 40 damage plus 40 more damage. If tails, discard an Energy attached to the Defending Pokémon."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BLISSEY_PRIME_106:
			return evolution (this, from:"Chansey", hp:HP130, type:COLORLESS, retreatCost:2) {
				weakness F
				pokePower "Blissful Nurse", {
					text "Once during your turn, when you play Blissey from your hand to evolve 1 of your Pokémon, you may remove all damage counters from all your Pokémon. If you do, discard all Energy attached to those Pokémon that had any damage counters on them."
					actionA {
					}
				}
				move "Strength", {
					text "60 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DONPHAN_PRIME_107:
			return evolution (this, from:"Phanpy", hp:HP120, type:FIGHTING, retreatCost:2) {
				weakness W
				resistance L, MINUS30
				pokeBody "Exoskeleton", {
					text "Any damage done to Donphan by attacks is reduced by 20 ."
					delayedA {
					}
				}
				move "Earthquake", {
					text "60 damage. Does 10 damage to each of your Benched Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Impact", {
					text "90 damage. "
					energyCost F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FERALIGATR_PRIME_108:
			return evolution (this, from:"Croconaw", hp:HP140, type:WATER, retreatCost:3) {
				weakness G
				pokePower "Rain Dance", {
					text "As often as you like during your turn , you may attach a Energy card from your hand to 1 of your Pokémon. This power can’t be used if Feraligatr is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Crunch", {
					text "Does 60 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEGANIUM_PRIME_109:
			return evolution (this, from:"Bayleef", hp:HP150, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS30
				pokePower "Leaf Trans", {
					text "As often as you like during your turn , you may move a Energy attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Meganium is affected by a Special Condition."
					actionA {
					}
				}
				move "Solarbeam", {
					text "80 damage. "
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TYPHLOSION_PRIME_110:
			return evolution (this, from:"Quilava", hp:HP140, type:FIRE, retreatCost:2) {
				weakness W
				pokePower "Afterburner", {
					text "Once during your turn , you may search your discard pile for a Fire Energy card and attach it to 1 of your Pokémon. If you do, put 1 damage counter on that Pokémon. This power can’t be used if Typhlosion is affected by a Special Condition."
					actionA {
					}
				}
				move "Flare Destroy", {
					text "70 damage. Discard an Energy card attached to Typhlosion and discard an Energy card attached to the Defending Pokémon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HO_OH_LEGEND_111:
			return basic (this, hp:HP140, type:FIRE, retreatCost:2) {
				weakness W
				resistance F, MINUS30
				pokeBody "Sacred Rainbow", {
					text "All Energy attached to Ho-Oh LEGEND are Energy instead of their usual type."
					delayedA {
					}
				}
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Ho-Oh LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bright Wing", {
					text "100 damage. Discard an Energy attached to Ho-Oh LEGEND."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HO_OH_LEGEND_112:
			return copy (HO_OH_LEGEND_111, this)
			/*basic (this, hp:HP140, type:FIRE, retreatCost:2) {
				weakness W
				resistance F, MINUS30
				pokeBody "Sacred Rainbow", {
					text "All Energy attached to Ho-Oh LEGEND are Energy instead of their usual type."
					delayedA {
					}
				}
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Ho-Oh LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bright Wing", {
					text "100 damage. Discard an Energy attached to Ho-Oh LEGEND."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case LUGIA_LEGEND_113:
			return basic (this, hp:HP130, type:WATER, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				pokePower "Ocean Grow", {
					text "Once during your turn, when you put Lugia LEGEND into play, you may look at the top 5 cards of your deck and attach all Energy cards you find there to Lugia LEGEND. Discard the other cards."
					actionA {
					}
				}
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Lugia LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Elemental Blast", {
					text "200 damage. Discard a Fire Energy, a Water Energy, and a Lightning Energy attached to Lugia LEGEND."
					energyCost F, W, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUGIA_LEGEND_114:
			return copy (LUGIA_LEGEND_113, this)
			/*basic (this, hp:HP130, type:WATER, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				pokePower "Ocean Grow", {
					text "Once during your turn, when you put Lugia LEGEND into play, you may look at the top 5 cards of your deck and attach all Energy cards you find there to Lugia LEGEND. Discard the other cards."
					actionA {
					}
				}
				move "", {
					text "Put this card from your hand onto your Bench only with the other half of Lugia LEGEND."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Elemental Blast", {
					text "200 damage. Discard a Fire Energy, a Water Energy, and a Lightning Energy attached to Lugia LEGEND."
					energyCost F, W, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case GRASS_ENERGY_115:
			return basicEnergy (this, GRASS);
			case FIRE_ENERGY_116:
			return basicEnergy (this, FIRE);
			case WATER_ENERGY_117:
			return basicEnergy (this, WATER);
			case LIGHTNING_ENERGY_118:
			return basicEnergy (this, LIGHTNING);
			case PSYCHIC_ENERGY_119:
			return basicEnergy (this, PSYCHIC);
			case FIGHTING_ENERGY_120:
			return basicEnergy (this, FIGHTING);
			case DARKNESS_ENERGY_121:
			return basicEnergy (this, DARKNESS);
			case METAL_ENERGY_122:
			return basicEnergy (this, METAL);
			case GYARADOS_123:
			return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
				weakness L
				resistance F, MINUS30
				move "Thrash", {
					text "30+ damage. If heads, this attack does 30 damage plus 20 more damage. If tails, Gyarados does 20 damage to itself."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heavy Storm", {
					text "70 damage. "
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ALPH_LITHOGRAPH_ONE:
			return basicTrainer (this) {
				text "LOOK AT YOUR OPPONENTS HAND!"
				onPlay {
				}
				playRequirement{
				}
			};
				default:
			return null;
		}
	}

}
