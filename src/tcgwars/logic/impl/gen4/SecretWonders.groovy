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
public enum SecretWonders implements CardInfo {

	AMPHAROS_1 ("Ampharos", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	BLASTOISE_2 ("Blastoise", 2, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	CHARIZARD_3 ("Charizard", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	ENTEI_4 ("Entei", 4, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
	FLYGON_5 ("Flygon", 5, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	GALLADE_6 ("Gallade", 6, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	GARDEVOIR_7 ("Gardevoir", 7, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	GASTRODON_EAST_SEA_8 ("Gastrodon East Sea", 8, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GASTRODON_WEST_SEA_9 ("Gastrodon West Sea", 9, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	HO_OH_10 ("Ho-Oh", 10, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	JUMPLUFF_11 ("Jumpluff", 11, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	LICKILICKY_12 ("Lickilicky", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	LUDICOLO_13 ("Ludicolo", 13, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	LUGIA_14 ("Lugia", 14, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	MEW_15 ("Mew", 15, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	RAIKOU_16 ("Raikou", 16, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	ROSERADE_17 ("Roserade", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	SALAMENCE_18 ("Salamence", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	SUICUNE_19 ("Suicune", 19, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	VENUSAUR_20 ("Venusaur", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	ABSOL_21 ("Absol", 21, Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
	ARCANINE_22 ("Arcanine", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	BANETTE_23 ("Banette", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	DUGTRIO_24 ("Dugtrio", 24, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ELECTIVIRE_25 ("Electivire", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	ELECTRODE_26 ("Electrode", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FURRET_27 ("Furret", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	GOLDUCK_28 ("Golduck", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GOLEM_29 ("Golem", 29, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	JYNX_30 ("Jynx", 30, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	MAGMORTAR_31 ("Magmortar", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	MINUN_32 ("Minun", 32, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	MOTHIM_33 ("Mothim", 33, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	NIDOKING_34 ("Nidoking", 34, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	PIDGEOT_35 ("Pidgeot", 35, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PLUSLE_36 ("Plusle", 36, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	SHARPEDO_37 ("Sharpedo", 37, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
	SUNFLORA_38 ("Sunflora", 38, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	UNOWN_S_39 ("Unown S", 39, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	WEAVILE_40 ("Weavile", 40, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	WORMADAM_PLANT_CLOAK_41 ("Wormadam Plant Cloak", 41, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	WORMADAM_SANDY_CLOAK_42 ("Wormadam Sandy Cloak", 42, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	WORMADAM_TRASH_CLOAK_43 ("Wormadam Trash Cloak", 43, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	XATU_44 ("Xatu", 44, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	BRELOOM_45 ("Breloom", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	CHARMELEON_46 ("Charmeleon", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	CLOYSTER_47 ("Cloyster", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DONPHAN_48 ("Donphan", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	FARFETCH_D_49 ("Farfetch'd", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	FLAAFFY_50 ("Flaaffy", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	IVYSAUR_51 ("Ivysaur", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	KECLEON_52 ("Kecleon", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	KIRLIA_53 ("Kirlia", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	LOMBRE_54 ("Lombre", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	MILTANK_55 ("Miltank", 55, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	MUK_56 ("Muk", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	NIDORINO_57 ("Nidorino", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	PIDGEOTTO_58 ("Pidgeotto", 58, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PINSIR_59 ("Pinsir", 59, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	QUAGSIRE_60 ("Quagsire", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	RATICATE_61 ("Raticate", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ROSELIA_62 ("Roselia", 62, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	SABLEYE_63 ("Sableye", 63, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
	SHELGON_64 ("Shelgon", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	SKIPLOOM_65 ("Skiploom", 65, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	SMEARGLE_66 ("Smeargle", 66, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	SMOOCHUM_67 ("Smoochum", 67, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_K_68 ("Unown K", 68, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_N_69 ("Unown N", 69, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_O_70 ("Unown O", 70, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_X_71 ("Unown X", 71, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	UNOWN_Z_72 ("Unown Z", 72, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	VENOMOTH_73 ("Venomoth", 73, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VIBRAVA_74 ("Vibrava", 74, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	WARTORTLE_75 ("Wartortle", 75, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	BAGON_76 ("Bagon", 76, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	BULBASAUR_77 ("Bulbasaur", 77, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BURMY_PLANT_CLOAK_78 ("Burmy Plant Cloak", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BURMY_SANDY_CLOAK_79 ("Burmy Sandy Cloak", 79, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BURMY_TRASH_CLOAK_80 ("Burmy Trash Cloak", 80, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CARVANHA_81 ("Carvanha", 81, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	CHARMANDER_82 ("Charmander", 82, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	CLEFAIRY_83 ("Clefairy", 83, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	CORSOLA_84 ("Corsola", 84, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	DIGLETT_85 ("Diglett", 85, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DUSKULL_86 ("Duskull", 86, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	ELECTABUZZ_87 ("Electabuzz", 87, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	GRIMER_88 ("Grimer", 88, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GROWLITHE_89 ("Growlithe", 89, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	HOPPIP_90 ("Hoppip", 90, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	LICKITUNG_91 ("Lickitung", 91, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	LOTAD_92 ("Lotad", 92, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	MAGMAR_93 ("Magmar", 93, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	MAREEP_94 ("Mareep", 94, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	MURKROW_95 ("Murkrow", 95, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
	NATU_96 ("Natu", 96, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	NIDORAN_MALE_97 ("Nidoran Male", 97, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	PHANPY_98 ("Phanpy", 98, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PIDGEY_99 ("Pidgey", 99, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PSYDUCK_100 ("Psyduck", 100, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	QWILFISH_101 ("Qwilfish", 101, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	RALTS_102 ("Ralts", 102, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	RATTATA_103 ("Rattata", 103, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SENTRET_104 ("Sentret", 104, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SHELLDER_105 ("Shellder", 105, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHELLOS_EAST_SEA_106 ("Shellos East Sea", 106, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHELLOS_WEST_SEA_107 ("Shellos West Sea", 107, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHROOMISH_108 ("Shroomish", 108, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SHUCKLE_109 ("Shuckle", 109, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	SHUPPET_110 ("Shuppet", 110, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	SPINDA_111 ("Spinda", 111, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SQUIRTLE_112 ("Squirtle", 112, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	STANTLER_113 ("Stantler", 113, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SUNKERN_114 ("Sunkern", 114, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TRAPINCH_115 ("Trapinch", 115, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	VENONAT_116 ("Venonat", 116, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	VOLTORB_117 ("Voltorb", 117, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	WOOPER_118 ("Wooper", 118, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BEBE_S_SEARCH_119 ("Bebe's Search", 119, Rarity.UNCOMMON, [TRAINER]),
	NIGHT_MAINTENANCE_120 ("Night Maintenance", 120, Rarity.UNCOMMON, [TRAINER]),
	PLUSPOWER_121 ("PlusPower", 121, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_OAK_S_VISIT_122 ("Professor Oak's Visit", 122, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_ROWAN_123 ("Professor Rowan", 123, Rarity.UNCOMMON, [TRAINER]),
	RIVAL_124 ("Rival", 124, Rarity.UNCOMMON, [TRAINER]),
	ROSEANNE_S_RESEARCH_125 ("Roseanne's Research", 125, Rarity.UNCOMMON, [TRAINER]),
	TEAM_GALACTIC_S_MARS_126 ("Team Galactic's Mars", 126, Rarity.UNCOMMON, [TRAINER]),
	POTION_127 ("Potion", 127, Rarity.COMMON, [TRAINER]),
	SWITCH_128 ("Switch", 128, Rarity.COMMON, [TRAINER]),
	DARKNESS_ENERGY_129 ("Darkness Energy", 129, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	METAL_ENERGY_130 ("Metal Energy", 130, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	GARDEVOIR_LV_X_131 ("Gardevoir LV.X", 131, Rarity.HOLORARE, [POKEMON_LVX, EVOLUTION, POKEMON, _PSYCHIC_]),
	HONCHKROW_LV_X_132 ("Honchkrow LV.X", 132, Rarity.HOLORARE, [POKEMON_LVX, EVOLUTION, POKEMON, _DARKNESS_]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	SecretWonders(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.SECRET_WONDERS;
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
			return evolution (this, from:"Flaffy", hp:HP130, type:LIGHTNING, retreatCost:3) {
				weakness F, PLUS30
				resistance M, MINUS20
				pokeBody "Jamming", {
					text "After your opponent plays a Supporter card from his or her hand, put 1 damage counter on each of your opponent’s Pokémon. You can’t you more than 1 Jamming Poké-Body each turn."
					delayedA {
					}
				}
				move "Cluster Bolt", {
					text "70 damage. Energy attached to Ampharos. If you do, this attack does 20 damage to each of your opponent’s Benched Pokémon that has any Energy cards attached to it."
					energyCost L, C, C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BLASTOISE_2:
			return evolution (this, from:"Wartortle", hp:HP120, type:WATER, retreatCost:2) {
				weakness L, PLUS30
				pokePower "Waterlog", {
					text "Once during your turn , you may attach as many basic Energy cards from your hand to any of your Pokémon in any way you like. If you do, you turn ends. This power can’t be used if Blastoise is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Pump", {
					text "50+ damage. Energy attached to Blastoise but not used to pay for this attack’s Energy cost. You can’t add more than 40 damage in this way."
					energyCost W, W, C, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARIZARD_3:
			return evolution (this, from:"Charmeleon", hp:HP130, type:FIRE, retreatCost:3) {
				weakness W
				resistance F, MINUS20
				pokeBody "Fury Blaze", {
					text "If your opponent has 3 or less Prize cards left, each of Charizard’s attacks does 50 more damage to the Active Pokémon ."
					delayedA {
					}
				}
				move "Blast Burn", {
					text "120 damage. Flip a coin. If heads, discard 2 Energy cards attached to Charizard. If tails, discard 4 Energy cards attached to Charizard. (If you can’t, this attack does nothing.)"
					energyCost R, R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ENTEI_4:
			return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
				weakness W, PLUS20
				pokeBody "Burning Coat", {
					text "Whenever 1 of your opponent’s Pokémon is Knocked Out by damage from Entei’s attacks, discard the top 3 cards from your opponent’s deck."
					delayedA {
					}
				}
				move "Blaze Roar", {
					text "60 damage. Energy attached to Entei."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLYGON_5:
			return evolution (this, from:"Vibrava", hp:HP120, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS30
				resistance L, MINUS20
				pokeBody "Irritating Buzz", {
					text "As long as Flygon is your Active Pokémon, put 1 damage counter on each of your opponent’s Active Pokémon between turn, excluding Pokémon."
					delayedA {
					}
				}
				move "Sand Sonic", {
					text "60+ damage. Energy card from you hand to Flygon during this turn, this attack does 60 damage plus 20 more damage."
					energyCost F, C, C, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GALLADE_6:
			return evolution (this, from:"Kirlia", hp:HP130, type:FIGHTING, retreatCost:2) {
				weakness P
				move "Sonic Blade", {
					text "Put damage counters on the Defending Pokémon until it is 50 HP away from being Knocked Out. If you do, your opponent switch the Defending Pokémon with 1 of this or her Benched Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psychic Cut", {
					text "60+ damage. You may choose as many of your face-down Prize cards as you like and put them face up. If you do, this attack does 60 damage plus 20 more damage for each Prize card you chose. (These remain face up for the rest of the game.)"
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GARDEVOIR_7:
			return evolution (this, from:"Kirlia", hp:HP110, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS30
				pokePower "Telepass", {
					text "Once during your turn , you may search your opponent’s discard pile for a Supporter card and use the effect of that card as the effect of this power. (This Supporter card remains in you opponent’s discard pile.) You can’t use more than 1 Telepass Poké-Power each turn. This power can’t be used if Gardevoir is affected by a Special Condition."
					actionA {
					}
				}
				move "Psychic Lock", {
					text "60 damage. During your opponent’s next turn, your opponent can’t use any Poké-Powers on his or her Pokémon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTRODON_EAST_SEA_8:
			return evolution (this, from:"Shellos East Sea", hp:HP100, type:WATER, retreatCost:4) {
				weakness G, PLUS30
				resistance L, MINUS20
				pokePower "Osmotic Pressure", {
					text "Once during your turn , if you have Gastrodon West Sea in play, you may move up to 3 damage counters from Gastodon East Sea to 1 of your Gastrodon West Sea."
					actionA {
					}
				}
				move "Dwindling Wave", {
					text "80- damage. Does 80 damage minus 10 damage for each damage counter on Gastrodon East Sea."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTRODON_WEST_SEA_9:
			return evolution (this, from:"Shellos West Sea", hp:HP100, type:FIGHTING, retreatCost:4) {
				weakness G, PLUS30
				resistance L, MINUS20
				move "Raging Flood", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Gastrodon West Sea. Then, remove 2 damage counters from Gastrodon West Sea."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wild Waves", {
					text "80 damage. ."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HO_OH_10:
			return basic (this, hp:HP090, type:FIRE, retreatCost:2) {
				weakness W
				resistance F, MINUS20
				pokePower "Phoenix Turn", {
					text "Once during your opponent’s turn, if Ho-Oh would be Knocked Out by damage from an attack, you may flip a coin. If heads, Ho-Oh isn’t discarded. Instead, remove all damage counter, Special Conditions, and other effects from Ho-Oh. Then, discard all cards attached to Ho-Oh (except for Energy cards). This counts as Ho-Oh being Knocked Out and your opponent takes a Prize card."
					actionA {
					}
				}
				move "Rainbow Wing", {
					text "20× damage. This attack does 20 damage time the number of different types of basic Energy cards attached to Ho-Oh."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JUMPLUFF_11:
			return evolution (this, from:"Skiploom", hp:HP090, type:GRASS, retreatCost:0) {
				weakness R, PLUS30
				resistance F, MINUS20
				pokeBody "Cotton Spore", {
					text "Whenever Jumpluff would be damaged by your opponent’s attack, flip a coin. If heads, prevent all damage done to Jumpluff by that attack."
					delayedA {
					}
				}
				move "Cottonweed Punch", {
					text "Flip 2 coins. Choose 1 of your opponent’s Pokémon. For each heads, this attack does 30 damage to that Pokémon."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKILICKY_12:
			return evolution (this, from:"Lickitung", hp:HP110, type:COLORLESS, retreatCost:4) {
				weakness F, PLUS30
				move "Tongue Reel", {
					text "Choose 1 of your opponent’s Pokémon. If you choose a Benched Pokémon, switch the Defending Pokémon with that Pokémon. This attack does 20 damage to the Pokémon you chose. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Boundless Power", {
					text "80 damage. During your next turn, Lickilicky can’t attack."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUDICOLO_13:
			return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
				weakness L, PLUS30
				pokeBody "Rain Dish", {
					text "At any time between turns, remove 1 damage counter from Ludicolo."
					delayedA {
					}
				}
				move "Nature Power", {
					text "60+ damage. If you have a Stadium Card in play, this attack does 60 damage plus 20 more damage. If your opponent has a Stadium card in play, the Defending Pokémon is now Confused."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUGIA_14:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness P, PLUS20
				resistance F, MINUS20
				move "Silver Wing", {
					text "20 damage. Flip a coin. If heads, choose an Energy card attached to the Defending Pokémon and return it to your opponent’s hand."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psychic Destruction", {
					text "120 damage. If the Defending Pokémon has any Energy cards attached to it, this attack’s base damage is 40 instead of 120."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEW_15:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS20
				move "Psychic Balance", {
					text "If you have less cards in your hand than your opponent, draw cards until you have the same number of cards as your opponent. (If you have more or the same number of cards in your hand as your opponent, this attack does nothing.)"
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Re-creation", {
					text "Choose an attack on 1 of your opponent’s Pokémon in his or her discard pile. Re-creation copies that attack except for its Energy cost. (You must still do anything else required for that attack.) Mew performs that attack."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAIKOU_16:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
				weakness F, PLUS20
				resistance M, MINUS20
				pokePower "Thunder Rumble", {
					text "Once during your turn , when you attach a Energy card from your hand to Raikou, you may put 1 damage counter on 1 of your opponent’s Benched Pokémon."
					actionA {
					}
				}
				move "Thunder Climb", {
					text "50+ damage. Energy cards to 1 of your Pokémon."
					energyCost L, L, L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROSERADE_17:
			return evolution (this, from:"Roselia", hp:HP090, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				move "Sleep Poison", {
					text "20 damage. The Defending Pokémon is now Asleep and Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magical Leaf", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage and remove 3 damage counters from Roserade."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SALAMENCE_18:
			return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:3) {
				weakness C, PLUS30
				resistance F, MINUS20
				move "Direct Hit", {
					text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dragon Finish", {
					text "(If you can’t discard cards, this attack does nothing.)"
					energyCost R, R, W, R, W, R, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUICUNE_19:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				pokePower "Aqua Recover", {
					text "Once during your turn, when you put Suicune from your hand onto your Bench, you may search you discard pile for up to 3 Pokémon, show them to your opponent, and put them into your hand."
					actionA {
					}
				}
				move "Cure Stream", {
					text "60 damage. ."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENUSAUR_20:
			return evolution (this, from:"Ivysaur", hp:HP130, type:GRASS, retreatCost:3) {
				weakness R, PLUS30
				pokePower "Miracle Aroma", {
					text "Once during your turn , you may flip a coin. If heads, choose either Asleep, Burned, or Poisoned. The Defending Pokémon is now affected by that Special Condition. This power can’t be used if Venusaur is affected by a Special Condition."
					actionA {
					}
				}
				move "Giant Bloom", {
					text "60 damage. Flip a coin. If heads, remove 4 damage counters from Venusaur."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ABSOL_21:
			return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
				weakness F, PLUS20
				resistance P, MINUS20
				move "Baleful Wind", {
					text "Choose a card from you opponent’s hand without looking and discard it. If you discarded a Trainer, Support, or Stadium card, choose 1 more card from your opponent’s hand without looking and discard it."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Raid", {
					text "10 damage. If you played Absol from your hand during this turn, this attack’s base damage is 40 instead of 10."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCANINE_22:
			return evolution (this, from:"Growlithe", hp:HP100, type:FIRE, retreatCost:2) {
				weakness W, PLUS30
				pokePower "Flame Dash", {
					text "Once during your turn, when you play Arcanine from you hand to evolve 1 of your Benched Pokémon, you may switch Arcanine with 1 of your Active Pokémon. If you do, you may move any number of Energy cards attached to that Pokémon to Arcanine."
					actionA {
					}
				}
				move "Inferno Onrush", {
					text "120 damage. Arcanine does 40 damage to itself."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BANETTE_23:
			return evolution (this, from:"Shuppet", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness D, PLUS20
				resistance C, MINUS20
				move "Ghost Head", {
					text "Put as many damage counters as you like on Banette. (You can’t put more than Banette’s remaining HP.) Put that many damage counters on the Defending Pokémon."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spiteful Pain", {
					text "40+ damage. If Banette is in your discard pile, this attack does 40 damage plus 40 more damage, then search your discard pile for Banette, show it to your opponent, and shuffle it into your deck."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUGTRIO_24:
			return evolution (this, from:"Diglett", hp:HP090, type:FIGHTING, retreatCost:0) {
				weakness W, PLUS20
				resistance L, MINUS20
				move "Dig Trap", {
					text "Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Dugtrio during your opponent’s next turn. If Dugtrio is your Active Pokémon at the end of your opponent’s next turn, put 6 damage counters on 1 of your opponent’s Bench Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pit Trap", {
					text "50+ damage. Your opponent flips a coin. If tails, this attack does 50 damage plus 50 more damage."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTIVIRE_25:
			return evolution (this, from:"Electabuzz", hp:HP100, type:LIGHTNING, retreatCost:3) {
				weakness F, PLUS30
				resistance M, MINUS20
				pokePower "Motor Drive", {
					text "Once during your turn , you may search your discard pile for a Energy card and attach it to Elective. This power can’t be used if Elective is affected by a Special Condition."
					actionA {
					}
				}
				move "Discharge", {
					text "50× damage. Energy you discarded. This attack does 50 damage times the number of heads."
					energyCost L, C, C, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE_26:
			return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS20
				resistance M, MINUS20
				pokePower "Energy Shift", {
					text "Once during your turn, if Electrode would be Knocked Out by damage from an attack, you may use this power. Electrode isn’t discarded. Instead, attach it as an Energy card to 1 of your Pokémon. While attached, this card is a Special Energy card and provides every type of Energy but provides on 1 Energy at a time."
					actionA {
					}
				}
				move "Ion Blast", {
					text "40+ damage. You may do 40 damage plus 60 more damage. If you do, Electrode does 100 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FURRET_27:
			return evolution (this, from:"Sentret", hp:HP090, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				move "Keen Eye", {
					text "Search your deck for up to 2 cards and put them into your hand. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Baton Pass", {
					text "40 damage. You may switch Furret with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Furret as you like to the new Active Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLDUCK_28:
			return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				move "Encore", {
					text "20 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can use only that attack during your opponent’s next turn."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Break Beam", {
					text "40+ damage. You may do 40 damage plus 20 more damage. If you do, Golduck is now Confused."
					energyCost W, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLEM_29:
			return evolution (this, from:"Graveler", hp:HP130, type:FIGHTING, retreatCost:4) {
				weakness G
				resistance L, MINUS20
				move "Double Throw", {
					text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Megaton Rock", {
					text "80 damage. ."
					energyCost F, F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JYNX_30:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS20
				move "Icy Kiss", {
					text "30 damage. If Jynx was damaged by an attack during your opponent’s last turn, the Defending Pokémon is now Paralyzed."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lovely Kiss", {
					text "Move 2 damage counter from Jynx to the Defending Pokémon. If Smoochum is anywhere under Jynx, move 4 damage counters instead."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMORTAR_31:
			return evolution (this, from:"Magmar", hp:HP110, type:FIRE, retreatCost:3) {
				weakness W, PLUS30
				pokeBody "Flame Body", {
					text "When you attach a Energy card from your hand to Magmortar, remove 2 damage counters from Magmortar."
					delayedA {
					}
				}
				move "Flame Blast", {
					text "20× damage. Energy attached to Magmortar."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fireball Bazooka", {
					text "40 damage. Does 20 damage to 2 of your opponent’s Benched Pokémon."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MINUN_32:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				pokePower "Minus Charge", {
					text "Once during your turn , if any Pokémon were Knocked Out during your opponent’s last turn, you may draw 2 cards. You can’t use more than 1 Minus Charge Poké-Power each turn. This power can’t be used if Minun is affected by a Special Condition."
					actionA {
					}
				}
				move "Tag Play —", {
					text "20 damage. If you have Plusle on your Bench, you may move an Energy card attached to Minum to 1 of your Benched Pokémon."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MOTHIM_33:
			return evolution (this, from:"Evolves from Burmy", hp:HP080, type:GRASS, retreatCost:0) {
				weakness R, PLUS20
				resistance F, MINUS20
				move "Silver Wind", {
					text ", that attack does 40 more damage."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Raging Scales", {
					text "30+ damage. If Mothim has any damage counters on it, this attack does 30 damage plus 40 more damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOKING_34:
			return evolution (this, from:"Nidorino", hp:HP130, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS30
				move "Poison Rub", {
					text "20 damage. The Defending Pokémon is now Poisoned. Before doing damage, you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Poisoned."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pride Attack", {
					text "60+ damage. Flip a coin for each Nidoqueen on your Bench. This attack does 60 damage plus 30 more damage for each heads."
					energyCost P, P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOT_35:
			return evolution (this, from:"Pidgeotto", hp:HP120, type:COLORLESS, retreatCost:0) {
				weakness L, PLUS30
				resistance F, MINUS20
				move "Mirror Move", {
					text "If Pidgeot was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Pidgeot to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Whirlwind", {
					text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PLUSLE_36:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				pokePower "Plus Charge", {
					text "Once during your turn , if any of your Pokémon were Knocked Out during your opponent’s last turn, you may search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. You can’t use more then 1 Plus Charge Poké-Power each turn. This power can’t be used if Plusle is affected by a Special Condition."
					actionA {
					}
				}
				move "Tag Play +", {
					text "20 damage. If you have Minun on your Bench, you may do 20 damage to any 1 Benched Pokémon instead."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHARPEDO_37:
			return evolution (this, from:"Carvanha", hp:HP080, type:DARKNESS, retreatCost:0) {
				weakness L, PLUS20
				resistance P, MINUS20
				pokeBody "Rough Skin", {
					text "If Sharpedo is your Active Pokémon and is damaged by an opponent’s attack , put 2 damage counter on the Attacking Pokémon."
					delayedA {
					}
				}
				move "Strike Wound", {
					text "60+ damage. If the Defending Pokémon has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage. This attack damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects of that Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUNFLORA_38:
			return evolution (this, from:"Sunkern", hp:HP080, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				resistance W, MINUS20
				pokePower "Grass Whistle", {
					text "Once during your turn , you may remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Grass Whistle Poké-Power each turn. This power can’t be used if Sunflora is affected by a Special Condition."
					actionA {
					}
				}
				move "Petal Dance", {
					text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads. If you get 2 or more heads, Sunflora is now Confused."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_S_39:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "Set", {
					text "Once during your turn , if you have Unown S, Unown E, and Unown T on your Bench, you may flip a coin. If heads, search your discard pile for an Energy card, show it to your opponent, and put it on top of your deck."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEAVILE_40:
			return evolution (this, from:"Sneasel", hp:HP080, type:WATER, retreatCost:0) {
				weakness M, PLUS20
				pokePower "Dark Engage", {
					text "Once during your turn , you may use this power. Each of your Active Pokémon’s type is until the end of your turn. If that Pokémon is no longer your Active Pokémon, this effect ends."
					actionA {
					}
				}
				move "Shadow Charge", {
					text "Energy cards and attach them to any of your Pokémon is any way you like. Shuffle your deck afterward."
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Chip Off", {
					text "40 damage. If you opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
					energyCost D, D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_PLANT_CLOAK_41:
			return evolution (this, from:"Burmy Plant Cloak", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				pokeBody "Plant Cloak", {
					text "If Wormadam Plant Cload has 2 or more Energy attached to it, Wormadam Plant Cloak gets +40 HP."
					delayedA {
					}
				}
				move "Leaf Hurricane", {
					text "60 damage. If the Defending Pokémon has fewer remaining HP than Wormadam Plant Cloak, the Defending Pokémon is now Confused."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_SANDY_CLOAK_42:
			return evolution (this, from:"Burmy Sandy Cloak", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness R, PLUS20
				resistance L, MINUS20
				pokeBody "Sandy Cloak", {
					text "Prevent all effects of attacks, excluding damage, done to Wormadam Sandy Cloak."
					delayedA {
					}
				}
				move "Push Over", {
					text "40+ damage. Energy attached to Wormadam Sandy Cloak."
					energyCost F, C, C, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_TRASH_CLOAK_43:
			return evolution (this, from:"Burmy Trash Cloak", hp:HP070, type:METAL, retreatCost:1) {
				weakness R, PLUS20
				resistance P, MINUS20
				pokeBody "Trash Cloak", {
					text "If Wormadam Trash Cloak has a Pokémon Tool Card attached to it, any damage done to Wormadam Trash Cloak by attacks is reduced by 20 ."
					delayedA {
					}
				}
				move "Iron Tackle", {
					text "70 damage. Wormadam Trash Cloak does 20 damage to itself."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case XATU_44:
			return evolution (this, from:"Natu", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				resistance F, MINUS20
				pokePower "Psychic Shift", {
					text "Once during your turn, if Xatu is on you Bench, you may choose 1 Special Condition from 1 of your Active Pokémon and remove that Special Condition. Then, 1 of the Defending Pokémon is now affected by that Special Condition that you chose."
					actionA {
					}
				}
				move "Energy Singe", {
					text "Choose 1 of you opponent’s Pokémon. This attack does 20 damage plus 10 more damage for each Energy attached to that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRELOOM_45:
			return evolution (this, from:"Shroomish", hp:HP100, type:GRASS, retreatCost:2) {
				weakness R
				move "Darin Punch", {
					text "40 damage. Remove from Breloom a number of damage counters equal to the amount of Energy attached to the Defending Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Homing Uppercut", {
					text "60+ damage. If the Defending Pokémon’s Retreat Cost is 0, this attack does 60 damage plus 60 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMELEON_46:
			return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
				weakness W, PLUS20
				move "Fire Fang", {
					text "20 damage. The Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flare Tail", {
					text "50+ damage. Energy attached to Charmeleon and this attack does 50 damage plus 20 more damage."
					energyCost R, R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLOYSTER_47:
			return evolution (this, from:"Shellder", hp:HP080, type:WATER, retreatCost:2) {
				weakness L, PLUS20
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage done to Cloyster by attacks during your opponent’s next turn."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spine Missile", {
					text "Flip 4 coins. For each heads, choose an opponent’s Pokémon in play and this attack does 20 damage to those Pokémon. (You may choose the same Pokémon more than once.)"
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DONPHAN_48:
			return evolution (this, from:"Phanpy", hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness W, PLUS20
				resistance L, MINUS20
				move "Rapid Spin", {
					text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch Donphan with 1 of your Benched Pokémon, if any."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bash In", {
					text "70+ damage. If the Defending Pokémon has a Pokémon Tool card attached to it, this attack does 70 damage plus 60 more damage."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FARFETCH_D_49:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness L, PLUS20
				resistance F, MINUS20
				move "Swords Dance", {
					text "During your next turn, Farfetch’d’s Leek Slap attack’s base damage is 60."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Leek Slap", {
					text "30 damage. During your next turn, Farfetch’d can’t use Leek Slap."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FLAAFFY_50:
			return evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Attract Current", {
					text "10 damage. Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Electromagnetic Kick", {
					text "60 damage. Flip a coin. If tails, Flaffy does 10 damage to itself."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case IVYSAUR_51:
			return evolution (this, from:"Bulbasaur", hp:HP080, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				move "Leech Seed", {
					text "20 damage. Remove 1 damage counter from Ivysaur."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "60 damage. "
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KECLEON_52:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				pokeBody "Camouflage", {
					text "If any basic Energy card attached to Kecleon is the same as the Attacking Pokémon’s type, any damage done by attacks from the Pokémon to Kecleon is reduced by 40 ."
					delayedA {
					}
				}
				move "Blind Scratch", {
					text "60 damage. Flip a coin. If tails, this attack does no damage to the Defending Pokémon. Instead, this attack does 20 damage to 1 of your Pokémon. (Don’t apply Weakness and Resistance fo Benched Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KIRLIA_53:
			return evolution (this, from:"Ralts", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS20
				move "Psychic Research", {
					text "Search your discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your discard pile.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Telekinesis", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOMBRE_54:
			return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				move "Torment", {
					text "20 damage. Flip a coin. If heads, your opponent can’t play any Supporter cards from his or her hand during his or her next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Absorb", {
					text "40 damage. Remove 2 damage counters from Lombre."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MILTANK_55:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness F, PLUS20
				move "Healing Milk", {
					text "Flip 2 coins. For each heads, remove 3 damage counters from 1 of your Pokémon."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Continuous Tumble", {
					text "20× damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MUK_56:
			return evolution (this, from:"Grimer", hp:HP080, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS20
				pokeBody "Toxic Sludge", {
					text "At the end of each player’s turn, each of your opponent’s Active Pokémon that has any Energy attached to it is now Poisoned. If that Pokémon is already Poisoned, Toxic Sludge Poké-Body does nothing to that Pokémon."
					delayedA {
					}
				}
				move "Panic Liquid", {
					text "50 damage. The Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINO_57:
			return evolution (this, from:"Nidoran Male", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS20
				move "Spirited Drill", {
					text "20 damage. ."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Horn", {
					text "40 damage. The Defending Pokémon is now Poisoned."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOTTO_58:
			return evolution (this, from:"Pidgey", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness L, PLUS20
				resistance F, MINUS20
				move "Wing Attack", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Quick Attack", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PINSIR_59:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				move "Grip and Squeeze", {
					text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Power Guillotine", {
					text "100 damage. Flip 2 coins. If either of them is tails, this attack’s base damage is 10 instead of 100."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QUAGSIRE_60:
			return evolution (this, from:"Wooper", hp:HP090, type:WATER, retreatCost:3) {
				weakness G
				resistance L, MINUS20
				pokePower "Aqua Healing", {
					text "Once during your turn , if Quagsire is your Active Pokémon and the Defending Pokémon has any Energy attached to it, you may remove 3 damage counters from Quagsire."
					actionA {
					}
				}
				move "Muddy Water", {
					text "60 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATICATE_61:
			return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness F, PLUS20
				move "Gnaw Off", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 60 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sneaky Attack", {
					text "20+ damage. Energy attached to it, this attack does 20 damage plus 20 more damage."
					energyCost C, D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROSELIA_62:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				move "Sleep Powder", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "10 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SABLEYE_63:
			return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
				resistance C, MINUS20
				move "Rummage", {
					text "Look at the top 5 cards of your deck. Choose as many Trainer cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shadow Sneak", {
					text "20+ damage. If you and your opponent have a different number of Prize cards left, this attack does 20 damage plus 20 more damage."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELGON_64:
			return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:2) {
				weakness C, PLUS20
				resistance F, MINUS20
				move "Focus Energy", {
					text "During your next turn, Shelgon’s Protect Charge attack’s base damage is 80."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Protect Charge", {
					text "30 damage. ."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SKIPLOOM_65:
			return evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
				weakness R, PLUS20
				resistance F, MINUS20
				pokeBody "Cotton Balloon", {
					text "If Skiploom has any Energy attached to it, any damage done to Skiploom by attacks from your opponent’s Evolved Pokémon is reduced by 20 ."
					delayedA {
					}
				}
				move "U-turn", {
					text "20 damage. Switch Skiploom with 1 of your Benched Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SMEARGLE_66:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Color Pick", {
					text "Search your deck for up to 3 basic Energy cards, show them to your opponent, and put them into you hand. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Trace", {
					text "Flip a coin. If heads, choose an attack on 1 of your opponent’s Benched Pokémon. Trace copies that attack except for its Energy cost. (You must still do anything else required for that attack.) Smeargle performs that attack."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SMOOCHUM_67:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Jynx from your hand onto Smoochum (this counts as evolving Smoochum) and remove all damage counters from Smoochum."
					actionA {
					}
				}
				move "Psykiss", {
					text "Flip a coin. If heads, choose a Special Energy card attached to 1 of your opponent’s Pokémon and have your opponent shuffle that card into his or her deck."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_K_68:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "Kind", {
					text "Once during your turn , you may remove 2 damage counters from 1 of the Defending Pokémon."
					actionA {
					}
				}
				move "Hidden Power", {
					text "20 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_N_69:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "Nod", {
					text "Once during your turn , if you have Unown N, Unown O, and Unown D on your Bench, you may ask your opponent to take a Prize card. If he or she does, you take a Prize card. If he or she doesn’t, draw a card."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_O_70:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "ONE", {
					text "Once during your turn , if you have Unown O, Unown N, and Unown E on your Bench and you have 1 card left in your hand, you may draw cards until you have 7 cards in your hand."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_X_71:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P
				pokePower "X-RAY", {
					text "Once during your turn , if you have Unown X on your Bench, you may look at the top card of your opponent’s deck and put it back on top of his or her deck."
					actionA {
					}
				}
				move "Hidden Power", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case UNOWN_Z_72:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "ZERO", {
					text "Once during your turn , if Unown Z is on your Bench and you have no cards in you deck, you may discard all cards attached to Unown Z and put Unown Z on top of your deck."
					actionA {
					}
				}
				move "Hidden Power", {
					text "Remove as many damage counters as you like from each Unown you have in play. Put that many damage counters on the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENOMOTH_73:
			return evolution (this, from:"Venonat", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				resistance F, MINUS20
				pokeBody "Dangerous Scales", {
					text "If Venomoth is your Active Pokémon and is damaged by an opponent’s attack (even is Venomoth is Knocked Out), the Attacking Pokémon is now Asleep and Poisoned."
					delayedA {
					}
				}
				move "Disturbance Dive", {
					text "50 damage. Prevent all effects of an attack, excluding damage, done to Venomoth during your opponent’s next turn."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VIBRAVA_74:
			return evolution (this, from:"Trapinch", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS20
				resistance L, MINUS20
				move "Sand Wind", {
					text "Does 10 damage to each of your opponent’s Pokémon."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Beam", {
					text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WARTORTLE_75:
			return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				move "Giant Wave", {
					text "40 damage. Wartortle can’t use Giant Wave during your next turn."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shell Attack", {
					text "50 damage. "
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAGON_76:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS10
				resistance F, MINUS20
				move "Bite", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rage", {
					text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Bagon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BULBASAUR_77:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				move "Shake Vine", {
					text "The Defending Pokémon is now Asleep."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bullet Seed", {
					text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_PLANT_CLOAK_78:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokePower "Wear Cloak", {
					text "Once during your turn , if Burmy Plant Cloak is your Active Pokémon, you may search your discard for a basic Energy card and attach it to Burmy Plant Cloak."
					actionA {
					}
				}
				move "Plant Cloak Tackle", {
					text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
					energyCost C, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_SANDY_CLOAK_79:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokePower "Wear Cloak", {
					text "Once during your turn , if Burmy Sandy Cloak is your Active Pokémon, you may search your discard for a basic Energy card and attach it to Burmy Sandy Cloak."
					actionA {
					}
				}
				move "Sandy Cloak Tackle", {
					text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
					energyCost C, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_TRASH_CLOAK_80:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokePower "Wear Cloak", {
					text "Once during your turn , if Burmy Trash Cloak is your Active Pokémon, you may search your discard for a basic Energy card and attach it to Burmy Trash Cloak."
					actionA {
					}
				}
				move "Trash Cloak Tackle", {
					text "10+ damage. Energy attached to it, this attack does 10 damage plus 10 more damage."
					energyCost C, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARVANHA_81:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness L, PLUS10
				resistance P, MINUS20
				move "Slash", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite Away", {
					text "20 damage. Flip a coin. If heads, choose a card from your opponent’s hand without looking and discard it."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER_82:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				move "Gnaw", {
					text "10 damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lava Burn", {
					text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY_83:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "", {
					text "Clefairy damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Slap", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CORSOLA_84:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness G, PLUS20
				move "Rally", {
					text "Search your deck for up to 3 different types of Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hook", {
					text "30 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIGLETT_85:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS10
				resistance L, MINUS20
				move "Down Draw", {
					text "Draw a card from the bottom of your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mud Spatter", {
					text "30 damage. "
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUSKULL_86:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness D, PLUS10
				resistance C, MINUS20
				move "", {
					text "Duskull damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Astonish", {
					text "Flip a coin. If heads, choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTABUZZ_87:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder", {
					text "60 damage. Flip a coin. If heads, Electabuzz does 30 damage to itself."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRIMER_88:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS10
				move "Mud Bomb", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gunky", {
					text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips coin. If tails, that attack does nothing."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROWLITHE_89:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness W, PLUS20
				move "Roar", {
					text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dig Claws", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HOPPIP_90:
			return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance F, MINUS20
				pokeBody "Cottonweed", {
					text "If Hoppip has any Energy attached to it, the Retreat Cost for Hoppip is 0."
					delayedA {
					}
				}
				move "Hover Heal", {
					text "10 damage. Remove all Special Conditions from Hoppip."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LICKITUNG_91:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:3) {
				weakness F, PLUS20
				move "Lick", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stomp", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOTAD_92:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Water Sport", {
					text "10+ damage. If Lotad has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 20 more damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ram", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMAR_93:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness W, PLUS20
				move "Fire Punch", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Smog", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAREEP_94:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Static Shock", {
					text "20 damage. "
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MURKROW_95:
			return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
				weakness L, PLUS10
				resistance F, MINUS20
				move "", {
					text "Murkrow damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Feint Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NATU_96:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				resistance F, MINUS20
				move "Bothering Wave", {
					text "20 damage. Flip a coin. If tails, this attack does nothing. If heads, discard an energy card attached to the Defending Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Future Sight", {
					text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_MALE_97:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Skin", {
					text "Flip 2 coins. If either of them is heads, the Defending Pokémon is now Poisoned."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PHANPY_98:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness W
				resistance L, MINUS20
				move "Flail", {
					text "10× damage. Does 10 damage times the number of damage counter on Phanpy."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Take Down", {
					text "30 damage. Phanpy does 10 damage to itself."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEY_99:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness L, PLUS10
				resistance F, MINUS20
				move "Growl", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Peck", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PSYDUCK_100:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Delusion", {
					text "If Psyduck is Confused, draw 2 cards."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Migraine", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, Psyduck is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case QWILFISH_101:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				pokePower "Balloon Sting", {
					text "Once during your opponent’s, if Qwilfish is your Active Pokémon and is damage by an attack (even if Qwilfish is Knocked Out), you may flip a coin. If heads, the Attacking Pokémon is now Poisoned. Put 2 damage counter instead of 1 on that Pokémon between turns."
					actionA {
					}
				}
				move "Nerve Shot", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RALTS_102:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				move "Smack", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Confuse Ray", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA_103:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				weakness F, PLUS10
				move "Tail Whip", {
					text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SENTRET_104:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Grope", {
					text "Look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck."
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
			case SHELLDER_105:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Shell Rest", {
					text "Remove 2 damage counters from Shellder."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tongue Slap", {
					text "20 damage. "
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELLOS_EAST_SEA_106:
			return basic (this, hp:HP060, type:WATER, retreatCost:2) {
				weakness L, PLUS10
				move "Shell Hunting", {
					text "Search your deck for up to 2 in any combination of Shellos West Sea and Shellos East Sea and put them on your Bench. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sprinkle Water", {
					text "10 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELLOS_WEST_SEA_107:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Mud Spatter", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Recover", {
					text "Energy attached to Shellos West Sea and remove all damage counter from Shellos West Sea."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHROOMISH_108:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Headbutt", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Toxic Spore", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHUCKLE_109:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				pokeBody "Pot Shell", {
					text "Prevent all effects of attacks, including damage, done to Shuckle by your opponent’s Pokémon that has any Special Energy cards attached to it."
					delayedA {
					}
				}
				move "Ferment Poison", {
					text "10 damage. The Defending Pokémon is now Poisoned. As long as the Defending Pokémon remains Poisoned by this attack, it can’t use any Poké-Body."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHUPPET_110:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness D, PLUS10
				resistance C, MINUS20
				move "Gossip", {
					text "Put 1 damage counter on 1 of your opponent’s Pokémon."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hang Down", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPINDA_111:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				move "Dish Out", {
					text "Draw a card from the top and the bottom of your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Synchro Punch", {
					text "10+ damage. If any basic Energy card attached to Spinda is the same type as any Energy attached to the Defending Pokémon, this attack does 10 damage plus 30 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SQUIRTLE_112:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Bubble", {
					text "Flip a coin. If heads the Defending Pokémon is now Paralyzed."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Aqua Tail", {
					text "20+ damage. Energy attached to Squirtle. This attack does 20 damage plus 10 more damage for each heads."
					energyCost W, C, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STANTLER_113:
			return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				move "Lead", {
					text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Frighten Horn", {
					text "20 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SUNKERN_114:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Sun Soak", {
					text "Flip a coin. If heads, remove all damage counter from Sunkern, search your deck for an Evolution card that evolves from Sunkern, and put it onto Sunkern. (This counts as evolving Sunkern.) Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Seed Bomb", {
					text "20 damage. "
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TRAPINCH_115:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS10
				resistance L, MINUS20
				move "Inviting Trap", {
					text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sand Tomb", {
					text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENONAT_116:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				move "Stun Spore", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Signal Beam", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB_117:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Speed Ball", {
					text "20 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Big Explosion", {
					text "50 damage. Voltorb does 50 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WOOPER_118:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness G, PLUS20
				resistance L, MINUS20
				move "Yawn", {
					text "The Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Splatter", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEBE_S_SEARCH_119:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose a card from your hand and put it on top of your deck. Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case NIGHT_MAINTENANCE_120:
			return basicTrainer (this) {
				text "Search your discard pile for up to 3 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case PLUSPOWER_121:
			return basicTrainer (this) {
				text "Attach Plus Power to 1 of your Pokémon. Discard this card at the end of your turn.\nIf the Pokémon PlusPower is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance)."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_OAK_S_VISIT_122:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 3 cards. Then, choose a card from your hand and put it on the bottom of your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_ROWAN_123:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose 1 card in your hand and shuffle the rest of your cards into your deck. Then, draw 4 cards. (If this is the only card in your hand, you can’t play this card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case RIVAL_124:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nReveal the top 5 cards of your deck. Your opponent chooses 3 of those cards. Put those cards into your hand and put other 2 cards on top of your deck. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case ROSEANNE_S_RESEARCH_125:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 2 in any combination of Basic Pokémon and basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case TEAM_GALACTIC_S_MARS_126:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards. Then, choose a card from your opponent’s hand without looking and put it on the bottom of his or her deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case POTION_127:
			return basicTrainer (this) {
				text "Remove 2 damage counter from 1 of your Pokémon (remove 1 damage counter if that Pokémon has only 1)."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWITCH_128:
			return basicTrainer (this) {
				text "Switch 1 of your Active Pokémon with 1 of your Benched Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DARKNESS_ENERGY_129:
			return specialEnergy (this, [[C]]) {
				text "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect if the Pokémon that Darkness Energy is attached to isn’t [D]. Darkness Energy provides [D] Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case METAL_ENERGY_130:
			return specialEnergy (this, [[C]]) {
				text "Damage done by attacks to the Pokémon that Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that Metal Energy is attached to isn’t [M]. Metal Energy provides [M] Energy. (Doesn’t count as a basic Energy card.)"
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case GARDEVOIR_LV_X_131:
			return evolution (this, from:"Gardevoir", hp:HP130, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokePower "Teleportation", {
					text "Once during your turn , choose 1 of your Active Pokémon or 1 or your Benched Pokémon and switch Gardevoir with that Pokémon. This power can’t be used if Gardevoir is affected by a Special Condition."
					actionA {
					}
				}
				move "Bring Down", {
					text "Choose 1 Pokémon (your or your opponent’s) with the fewest remaining HP (excluding Gardevoir) and that Pokémon is now Knocked Out."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Gardevoir. Gardevoir LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HONCHKROW_LV_X_132:
			return evolution (this, from:"Honchkrow", hp:HP110, type:DARKNESS, retreatCost:0) {
				weakness L, PLUS30
				resistance F, MINUS20
				move "Feint Attack", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Darkness Wing", {
					text "60 damage. If the Defending Pokémon would be Knocked Out by damage from this attack, you may search your discard pile for any 1 card, show it to your opponent, and put it into your hand."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Honchkrow. Honchkrow LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
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
