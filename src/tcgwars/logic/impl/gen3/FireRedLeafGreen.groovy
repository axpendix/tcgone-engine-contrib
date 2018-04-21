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
 * @author axpendix@hotmail.com
 */
public enum FireredLeafgreen implements CardInfo {
	
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
	NIDORAN_FEMALE_70 ("Nidoran ♀", 70, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	NIDORAN_MALE_71 ("Nidoran ♂", 71, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
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
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	FireredLeafgreen(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Link Needle", {
					text "50+ damage. This attack does 50 damage plus 30 more damage for each Beedrill (excluding this one) you have in play."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					}
				}
				move "Whirlwind", {
					text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gust", {
					text "50 damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEWGONG_3:
			return evolution (this, from:"Seel", hp:HP080, type:WATER, retreatCost:2) {
				weakness METAL
				pokeBody "Safeguard", {
					text "Prevent all effects of attacks, including damage, done to Dewgong by your opponent’s Pokémon-ex."
					delayedA {
					}
				}
				move "Cold Breath", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aurora Beam", {
					text "40 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DITTO_4:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				pokePower "Form Variation", {
					text "Once during your turn (before your attack), you may search you discard pile for a Basic Pokémon (excluding Pokémon-ex and Ditto) and switch it with Ditto. (Any cards attached to Ditto, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Place Ditto in the discard pile."
					actionA {
					}
				}
				move "Energy Ball", {
					text "10+ damage. Does 10 damage lus 10 more damage for each Energy attached to Ditto but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EXEGGUTOR_5:
			return evolution (this, from:"Exeggcute", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				move "Psychic Exchange", {
					text "Shuffle your hand into your deck. Draw up to 8 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Big Eggsplosion", {
					text "40× damage. Flip a coin for each Energy attached to Exeggutor. This attack does 40 damage times the number of heads."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KANGASKHAN_6:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Fetch", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Headbutt", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "One-Two Punch", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAROWAK_7:
			return evolution (this, from:"Cubone", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Vengeance", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Basic Pokémon and each Evolution card in your discard pile. You can’t add more than 60 damage in this way."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOKING_8:
			return evolution (this, from:"Nidorino", hp:HP120, type:FIGHTING, retreatCost:3) {
				weakness WATER
				pokeBody "Power Gene", {
					text "As long as Nidoking is in play, your attacks by Nidoran Female, Nidorina, Nidoqueen, Nidoran Male, and Nidorino do 10 more damage to the Defending Pokémon."
					delayedA {
					}
				}
				move "Earth Poison", {
					text "40 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Poisoned."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bound Crush", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Nidoking can’t use Bound Crush during your next turn."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOQUEEN_9:
			return evolution (this, from:"Nidorina", hp:HP120, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				pokeBody "Family Bonds", {
					text "As long as Nidoqueen is in play, the Retreat Cost for Nidoran Female, Nidorina, Nidoran Male, Nidorino and Nidoking is 0."
					delayedA {
					}
				}
				move "Toxic", {
					text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Power Lariat", {
					text "40+ damage. Does 40 damage plus 10 more damage for each Evolved Pokémon you have in play."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					}
				}
				move "Clutch", {
					text "40 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWRATH_11:
			return evolution (this, from:"Poliwhirl", hp:HP120, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				pokeBody "Spiral", {
					text "As long as Poliwrath is your Active Pokémon, your opponent’s Confused Pokémon can’t retreat."
					delayedA {
					}
				}
				move "Split Spiral Punch", {
					text "20 damage. The Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Throw", {
					text "50+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 50 damage plus 30 more damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU_12:
			return evolution (this, from:"Pikachu", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Recharge", {
					text "Search your deck for up to 2 [L] Energy cards and attach them to Raichu. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Reflection", {
					text "50 damage. You may move any number of [L] Energy cards attached to Raichu to another of your Pokémon."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_13:
			return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:1) {
				weakness WATER
				pokeBody "Fiery Aura", {
					text "As long as Rapidash is your Active Pokémon, put 4 damage counters instead of 2 on Burned Pokémon between turns."
					delayedA {
					}
				}
				move "Searing Flame", {
					text "10 damage. The Defending Pokémon is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rear Kick", {
					text "40 damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWBRO_14:
			return evolution (this, from:"Slowpoke", hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokePower "Strange Behavior", {
					text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to Slowbro as long as you don’t Knock Out Slowbro. This power can’t be used if Slowbro is affected by a Special Condition."
					actionA {
					}
				}
				move "Psyshock", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORLAX_15:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
				weakness FIGHTING
				pokeBody "Rest Up", {
					text "If Snorlax remains Asleep between turns, remove 2 damage counters from Snorlax (remove 1 of there is only 1)."
					delayedA {
					}
				}
				move "Collapse", {
					text "10 damage. Snorlax is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Toss and Turn", {
					text "30+ damage. If Snorlax is Asleep, this attack does 30 damage plus 30 more damage. (This attack can be used even if Snorlax is Asleep.)"
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TAUROS_16:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Knock Over", {
					text "10 damage. You may discard any Stadium card in play."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rampage", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. After doing damage, flip a coin. If tails, Tauros is now Confused."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VICTREEBEL_17:
			return evolution (this, from:"Weepinbell", hp:HP110, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokeBody "Acid Sampler", {
					text "As long as Victreebel is your Active Pokémon, put 1 damage counter on each Defending Pokémon between turns. Acid Sampler stops working if your other Active Pokémon is not a Victreebel."
					delayedA {
					}
				}
				move "Acid", {
					text "50 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCANINE_18:
			return evolution (this, from:"Growlithe", hp:HP090, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Flare", {
					text "20 damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Heat Tackle", {
					text "70 damage. Arcanine does 10 damage to itself."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHANSEY_19:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Sing", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Egg Surprise", {
					text "Flip a coin. If heads, Chansey does 50 damage to the Defending Pokémon. If tails, remove 5 damage counters from Chansey. (All if there are less than 5.)"
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLOYSTER_20:
			return evolution (this, from:"Shellder", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				pokeBody "Exoskeleton", {
					text "Any damage done to Cloyster by attacks is reduced by 20 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Double Bubble", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads. If either of the coins is heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shell Attack", {
					text "50 damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DODRIO_21:
			return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Retreat Aid", {
					text "As long as Dodrio is on your Bench, you pay [C][C] less to retreat your Active Pokémon (excluding Pokémon-ex and Baby Pokémon.)"
					delayedA {
					}
				}
				move "Tri Attack", {
					text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUGTRIO_22:
			return evolution (this, from:"Diglett", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Sonicboom", {
					text "30 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rumble", {
					text "50 damage. The Defending Pokémon can’t retreat until the end of your opponent’s next turn."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cross-Cut", {
					text "10+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 10 damage plus 20 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FEAROW_24:
			return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				pokeBody "Free Flight", {
					text "If Fearow has no Energy attached to it, Fearow’s Retreat Cost is 0."
					delayedA {
					}
				}
				move "Shot Air", {
					text "10 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Drill Peck", {
					text "50 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HYPNO_25:
			return evolution (this, from:"Drowzee", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokeBody "Eerie Aura", {
					text "As long as Hypno is your Active Pokémon, put 2 damage counters on each Pokémon that remains Asleep between turns."
					delayedA {
					}
				}
				move "Hypnotic Ray", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KINGLER_26:
			return evolution (this, from:"Krabby", hp:HP080, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Salt Water", {
					text "Search your deck for up to 2 [W] Energy cards and attach them to Kingler. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Pump", {
					text "30+ damage. Does 30 damage plus 20 more damage for each basic Energy attached to Kingler but not used to pay for this attack’s Energy cost. You can’t add more than 40 damage in this way."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Speed Shot", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PRIMEAPE_28:
			return evolution (this, from:"Mankey", hp:HP070, type:FIGHTING, retreatCost:0) {
				weakness PSYCHIC
				move "Toss", {
					text "30× damage. You may discard from your hand as many Technical Machine and Pokémon Tool cards as you like. This attack does 30 damage times the number of cards your discarded."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Low Kick", {
					text "40 damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SCYTHER_29:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				pokeBody "Leaf Ride", {
					text "If Scyther has any Energy attached to it, Scyther’s Retreat Cost is 0."
					delayedA {
					}
				}
				move "Fury Cutter", {
					text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wiggle", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMELEON_31:
			return evolution (this, from:"Charmander", hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Flare", {
					text "30 damage."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Damage Burn", {
					text "40+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 40 damage plus 20 more damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DROWZEE_32:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ambush", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EXEGGCUTE_33:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Psybeam", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Spin", {
					text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					}
				}
				move "Confuse Ray", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case IVYSAUR_35:
			return evolution (this, from:"Bulbasaur", hp:HP080, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Poison Seed", {
					text "The Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "50 damage."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KAKUNA_36:
			return evolution (this, from:"Weedle", hp:HP070, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokeBody "Poison Payback", {
					text "If Kakuna is your Active Pokémon and is damaged by an opponent’s attack (even if Kakuna is Knocked Out), the Attacking Pokémon is now Poisoned."
					delayedA {
					}
				}
				move "Headbutt", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKITUNG_37:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Lick", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tongue Whip", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANKEY_38:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Mischief", {
					text "Shuffle your opponent’s deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Light Punch", {
					text "30 damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case METAPOD_39:
			return evolution (this, from:"Caterpie", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokeBody "Energy Protection", {
					text "Any damage done to Metapod by attacks is reduced by 10 for each Energy attached to Metapod. You can’t reduce more than 30 damage in this way."
					delayedA {
					}
				}
				move "Sharpen", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINA_40:
			return evolution (this, from:"Nidoran ♀", hp:HP080, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Scratch", {
					text "20 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fast Evolution", {
					text "Search your deck for up to 2 Evolution cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINO_41:
			return evolution (this, from:"Nidoran ♂", hp:HP070, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Double Stab", {
					text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rend", {
					text "30+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 30 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ONIX_42:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
				weakness WATER
				move "Rock Throw", {
					text "10 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tunneling", {
					text "Choose up to 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.) Onix can’t attack during your next turn."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARASECT_43:
			return evolution (this, from:"Paras", hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Energy Powder", {
					text "Search your deck for up to 2 basic Energy cards and attach them to any of your Pokémon (excluding Pokémon-ex) in any way you like. Shuffle your deck afterward."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Toxic Spore", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PERSIAN_44:
			return evolution (this, from:"Meowth", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				pokeBody "Thick Skin", {
					text "Persian can’t be affected by any Special Conditions."
					delayedA {
					}
				}
				move "Poison Claws", {
					text "The Defending Pokémon is now Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shining Claws", {
					text "30 damage. The Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cutting Wind", {
					text "30 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWHIRL_46:
			return evolution (this, from:"Poliwag", hp:HP080, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Energy Stream", {
					text "10 damage. Search your discard pile for a basic Energy card and attach it to Poliwhirl."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bubble", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_47:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Data Retrieval", {
					text "If you have less than 4 cards in your hand, draw cards until you have 4 cards in your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Confuse Ray", {
					text "10 damage. The Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATICATE_48:
			return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				pokeBody "Thick Skin", {
					text "Raticate can’t be affected by any Special Conditions."
					delayedA {
					}
				}
				move "Pickup", {
					text "Search your discard pile for a Basic Pokémon (or Evolution card), a Trainer card, and an Energy card. Show them to your opponent and put them into your hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 40 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENOMOTH_49:
			return evolution (this, from:"Venonat", hp:HP070, type:GRASS, retreatCost:0) {
				weakness FIRE
				pokeBody "Protective Dust", {
					text "Prevent all effects of attacks, except damage, done to Venomoth by the Attacking Pokémon."
					delayedA {
					}
				}
				move "Sleep Poison", {
					text "The Defending Pokémon is now Asleep and Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Wind", {
					text "60 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WARTORTLE_50:
			return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Water Gun", {
					text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Wartortle but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smash Turn", {
					text "40 damage. After your attack, you may switch Wartortle with 1 of your Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEPINBELL_51:
			return evolution (this, from:"Bellsprout", hp:HP070, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Razor Leaf", {
					text "20 damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Corrosive Acid", {
					text "10 damage. The Defending Pokémon is now Burned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WIGGLYTUFF_52:
			return evolution (this, from:"Jigglypuff", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				pokePower "Assistance", {
					text "Once during your turn (before your attack), if Wigglytuff is on your Bench, you may choose 1 of your Active Pokémon and remove 1 Special Condition from it."
					actionA {
					}
				}
				move "Expand", {
					text "30 damage. During your opponent’s next turn, any damage done to Wigglytuff by attacks is reduced by 10 (after applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BELLSPROUT_53:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Vine Whip", {
					text "10 damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BULBASAUR_54:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Sleep Poison", {
					text "Flip a coin. If heads, the Defending Pokémon is now Alseep and Poisoned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BULBASAUR_55:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Ram", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gouge", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CATERPIE_56:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Signs of Evolution", {
					text "Search your deck for a Metapod and a Butterfree card, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "String Shot", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER_57:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Singe", {
					text "The Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER_58:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Headbutt", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY_59:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Gesture", {
					text "Choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Moon Kick", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CUBONE_60:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Beat", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Linear Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIGLETT_61:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Dig Under", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Random Peck", {
					text "10× damage. Flip 2 coins. This attack does 10 damage plus 10 more damage for each heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROWLITHE_64:
			return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Bite", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flame Tail", {
					text "40 damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JIGGLYPUFF_65:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Sleep Inducer", {
					text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. The new Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Blow", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KRABBY_66:
			return basic (this, hp:HP050, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Irongrip", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Nap", {
					text "Remove 2 damage counters from Krabby (remove 1 of there is only 1)."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP_67:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Surprise Attack", {
					text "10 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ascension", {
					text "Search your deck for a card that evolves from Magikarp and put it on Magikarp. (This counts as evolving Magikarp.) Shuffle your deck afterward."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Speed Ball", {
					text "20 damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEOWTH_69:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cat Kick", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_FEMALE_70:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Look for Friends", {
					text "Reveal cards from your deck until you reveal a Basic Pokémon. Show that card to your opponent and put it into your hand. Shuffle the other revealed cards into your deck. (If you don’t reveal a Basic Pokémon, shuffle all the revealed cards back into your deck.)"
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_MALE_71:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Call for Family", {
					text "Search your deck for a Nidoran Female or Nidoran Male card and put it onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Stab", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PARAS_72:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Call for Family", {
					text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Toxic SPore", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gust", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_74:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Plasma", {
					text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Pikachu."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWAG_75:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Spiral Attack", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tail Whap", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA_76:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Stomp", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA_77:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Scratch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEEL_78:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Horn Hazzard", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELLDER_79:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Minimize", {
					text "During your opponent’s next turn, any damage done to Shellder by attacks in reduced by 20 (after applying Weakness and Resistance)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wave Splash", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SLOWPOKE_80:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Confusion Wave", {
					text "Both Slowpoke and the Defending Pokémon are now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
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
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wing Attack", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SQUIRTLE_82:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Sleepy Ball", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SQUIRTLE_83:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Bubble", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smash Turn", {
					text "20 damage. After your attack, you may switch Squirtle with 1 of your Benched Pokémon."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENONAT_84:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Psycho Waves", {
					text "Discard an Energy card attached to Venonat. The Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "10 damage."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB_85:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				pokeBody "Floating Electrons", {
					text "As long as Voltorb has any Energy attached to it, Voltorb’s Retreat Cost is 0."
					delayedA {
					}
				}
				move "Thundershock", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEDLE_86:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Call for Family", {
					text "Search your deck for up to 2 [G] Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Spurt", {
					text "Discard a [G] Energy card attached to Weedle. The Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BILL_S_MAINTENANCE_87:
			return supporter (this) {
				text "If you have any cards in your hand, shuffle 1 of them into your deck, then draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
			case CELIO_S_NETWORK_88:
			return supporter (this) {
				text "Search your deck for a Basic Pokémon or Evolution card (excluding Pokémon-ex), show it to your opponent, and put it into your hand. Shuffle your deck afterward.\nYou may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_REMOVAL_2_89:
			return basicTrainer (this) {
				text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent’s Pokémon and discard it."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_SWITCH_90:
			return basicTrainer (this) {
				text "Move a basic Energy card attached to 1 of your Pokémon to another of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case EXP_ALL_91:
			return pokemonTool (this) {
				text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAttach EXP.ALL to 1 of your Pokémon (excluding Pokémon-ex and Pokémon that has an owner in its name) that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nDuring your opponent’s turn, if 1 of your Active Pokémon would be Knocked Out by your opponent’s attack, you may take 1 basic Energy card attached to that Knocked Out Pokémon and attach it to the Pokémon with EXP.ALL attached to it. If you do, discard EXP.ALL."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case GREAT_BALL_92:
			return basicTrainer (this) {
				text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and put it onto your Bench. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case LIFE_HERB_93:
			return basicTrainer (this) {
				text "Flip a coin. If heads, choose 1 of your Pokémon (excluding Pokémon-ex), and remove all Special Conditions and 6 damage counters from that Pokémon (all if there are less than 6)."
				onPlay {
				}
				playRequirement{
				}
			};
			case MT__MOON_94:
			return stadium (this) {
				text "Any Pokémon (both yours and your opponent’s) with maximum HP less than 70 can’t use any Poké-Powers.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				onRemoveFromPlay{
				}
			};
			case POKE_BALL_95:
			return basicTrainer (this) {
				text "Flip a coin. If heads, search your deck for a Basic Pokémon or Evolution card, show it to your opponent and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEDEX_HANDY909_96:
			return basicTrainer (this) {
				text "Shuffle your deck. Look at 6 cards from the top of your deck, then put them back on top of your deck in any order."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_REVERSAL_97:
			return basicTrainer (this) {
				text "Flip a coin. If heads, choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROF__OAK_S_RESEARCH_98:
			return supporter (this) {
				text "Shuffle your hand into your deck, then draw 5 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
				}
				playRequirement{
				}
			};
			case SUPER_SCOOP_UP_99:
			return basicTrainer (this) {
				text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case VS_SEEKER_100:
			return basicTrainer (this) {
				text "Search your discard pile for a Supporter card, show it to your opponent, and put it into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case POTION_101:
			return basicTrainer (this) {
				text "Remove 2 damage counters from 1 of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
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
			case MULTI_ENERGY_103:
			return specialEnergy (this, [[C]]) {
				text "Attach Multi Energy to 1 of your Pokémon. While in play, Multi Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.) Multi Energy provides [C] Energy when attached to a Pokémon that already has Special Energy cards attached to it."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case BLASTOISE_EX_104:
			return evolution (this, from:"Wartortle", hp:HP150, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				pokePower "Energy Rain", {
					text "As often as you like during your turn (before your attack), you may attach a [W] Energy card from your hand to 1 of your Pokémon. Put 1 damage counter on that Pokémon. This power can’t be used if Blastoise ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Hyper Whirlpool", {
					text "80 damage. Flip a coin until you get tails. For each heads, your opponent discards an Energy card attached to the Defending Pokémon."
					energyCost W, W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARIZARD_EX_105:
			return evolution (this, from:"Charmeleon", hp:HP160, type:FIRE, retreatCost:2) {
				weakness LIGHTNING
				pokeBody "Energy Flame", {
					text "All Energy attached to Charizard ex are [R] Energy instead of its usual type."
					delayedA {
					}
				}
				move "Slash", {
					text "50 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Burn Down", {
					text "200 damage. Discard 5 [R] Energy attached to Charizard ex. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, and any other effects on the Defending Pokémon."
					energyCost R, R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFABLE_EX_106:
			return evolution (this, from:"Clefairy", hp:HP100, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Metronome", {
					text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) (No matter what type that Pokémon is, Clefable ex’s type is still [C].) Clefable ex performs that attack."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Moon Impact", {
					text "40 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_EX_107:
			return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				pokePower "Extra Energy Bomb", {
					text "Once during your turn (before your attack), you may discard Electrode ex and all the cards attached to it (this counts as Knocking Out Electrode ex). If you do, search your discard pile for 5 Energy cards and attach them to any of your Pokémon (excluding Pokémon-ex) in any way you like. This power can’t be used if Electrode ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Crush and Burn", {
					text "30+ damage. You may discard as many Energy as you like attached to your Pokémon in play. If you do, this attack does 30 damage plus 20 more damage for each Energy you discarded."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_EX_108:
			return evolution (this, from:"Haunter", hp:HP150, type:PSYCHIC, retreatCost:2) {
				weakness DARKNESS
				resistance COLORLESS
				move "Poltergeist", {
					text "40+ damage. Look at your opponent’s hand. This attack does 40 damage plus 10 more damage for each Trainer card in your opponent’s hand."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Prize Count", {
					text "60+ damage. If you have more Prize cards left than your opponent, this attack does 60 damage plus 40 more damage."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GYARADOS_EX_109:
			return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				move "Twister", {
					text "40 damage. Flip 2 coins. For each heads, choose 1 Energy attached to the Defending Pokémon, if any, and discard it. If both are tails, this attack does nothing."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dragon Rage", {
					text "100 damage."
					energyCost W, W, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_EX_110:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				pokeBody "Magic Odds", {
					text "If Mr. Mime ex would be damaged by an attack, prevent that attack’s damage done to Mr. Mime ex if that damage is 10, 30, 50, 70, 90, 110, 130, 150, or 170."
					delayedA {
					}
				}
				move "Breakdown", {
					text "Count the number of cards in your opponent’s hand. Put that many damage counters on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MR__MIME_EX_111:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				pokeBody "Magic Evens", {
					text "If Mr. Mime ex would be damaged by an attack, prevent that attack’s damage done to Mr. Mime ex if that damage is 20, 40, 60, 80, 100, 120, 140, 160, or 180."
					delayedA {
					}
				}
				move "Breakdown", {
					text "Count the number of cards in your opponent’s hand. Put that many damage counters on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENUSAUR_EX_112:
			return evolution (this, from:"Ivysaur", hp:HP150, type:GRASS, retreatCost:3) {
				weakness FIRE
				pokePower "Energy Trans", {
					text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Venusaur ex is affected by a Special Condition."
					actionA {
					}
				}
				move "Pollen Hazard", {
					text "20 damage. The Defending Pokémon is now Poisoned, Burned, and Confused."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Solarbeam", {
					text "90 damage."
					energyCost G, G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER_113:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Flare", {
					text "10 damage."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Charmander."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARTICUNO_EX_114:
			return basic (this, hp:HP110, type:WATER, retreatCost:2) {
				weakness METAL
				pokePower "Legendary Ascent", {
					text "Once during your turn, when you put Articuno ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Articuno ex. If you do, you may also move any number of basic [W] Energy cards attached to your Pokémon to Articuno ex."
					actionA {
					}
				}
				move "Cold Crush", {
					text "50 damage. You may discard an Energy card attached to Articuno ex. If you do, your opponent discards an Energy card attached to the Defending Pokémon."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MOLTRES_EX_115:
			return basic (this, hp:HP110, type:FIRE, retreatCost:2) {
				weakness WATER
				pokePower "Legendary Ascent", {
					text "Once during your turn, when you put Moltres ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Moltres ex. If you do, you may also move any number of basic [R] Energy cards attached to your Pokémon to Moltres ex."
					actionA {
					}
				}
				move "Crushing Flames", {
					text "60 damage. You may discard an Energy card attached to Moltres ex. If you do, the Defending Pokémon is now Confused."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZAPDOS_EX_116:
			return basic (this, hp:HP110, type:LIGHTNING, retreatCost:2) {
				weakness LIGHTNING
				pokePower "Legendary Ascent", {
					text "Once during your turn, when you put Zapdos ex from your hand onto your Bench, you may switch 1 of your Active Pokémon with Zapdos ex. If you do, you may also move any number of basic [L] Energy cards attached to your Pokémon to Zapdos ex."
					actionA {
					}
				}
				move "Electron Crush", {
					text "50+ damage. You may discard an Energy card attached to Zapdos ex. If you do, this attack does 50 damage plus 20 more damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
				default:
			return null;
		}
	}
	
}