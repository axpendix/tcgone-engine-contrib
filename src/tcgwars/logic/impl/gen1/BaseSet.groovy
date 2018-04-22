package tcgwars.logic.impl.gen1;

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
public enum BaseSet implements CardInfo {
	
	ALAKAZAM ("Alakazam", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	BLASTOISE ("Blastoise", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	CHANSEY ("Chansey", 3, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	CHARIZARD ("Charizard", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	CLEFAIRY ("Clefairy", 5, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	GYARADOS ("Gyarados", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	HITMONCHAN ("Hitmonchan", 7, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	MACHAMP ("Machamp", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	MAGNETON ("Magneton", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MEWTWO ("Mewtwo", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOKING ("Nidoking", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	NINETALES ("Ninetales", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	POLIWRATH ("Poliwrath", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	RAICHU ("Raichu", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	VENUSAUR ("Venusaur", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	ZAPDOS ("Zapdos", 16, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	BEEDRILL ("Beedrill", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DRAGONAIR ("Dragonair", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	DUGTRIO ("Dugtrio", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ELECTABUZZ ("Electabuzz", 20, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	ELECTRODE ("Electrode", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	PIDGEOTTO ("Pidgeotto", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ARCANINE ("Arcanine", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	CHARMELEON ("Charmeleon", 24, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	DEWGONG ("Dewgong", 25, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	DRATINI ("Dratini", 26, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	FARFETCHD ("Farfetch'd", 27, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	GROWLITHE ("Growlithe", 28, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	HAUNTER ("Haunter", 29, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	IVYSAUR ("Ivysaur", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	JYNX ("Jynx", 31, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	KADABRA ("Kadabra", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	KAKUNA ("Kakuna", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	MACHOKE ("Machoke", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	MAGIKARP ("Magikarp", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	MAGMAR ("Magmar", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	NIDORINO ("Nidorino", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	POLIWHIRL ("Poliwhirl", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PORYGON ("Porygon", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	RATICATE ("Raticate", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	SEEL ("Seel", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	WARTORTLE ("Wartortle", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	ABRA ("Abra", 43, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	BULBASAUR ("Bulbasaur", 44, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CATERPIE ("Caterpie", 45, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CHARMANDER ("Charmander", 46, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	DIGLETT ("Diglett", 47, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DODUO ("Doduo", 48, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	DROWZEE ("Drowzee", 49, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GASTLY ("Gastly", 50, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	KOFFING ("Koffing", 51, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MACHOP ("Machop", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MAGNEMITE ("Magnemite", 53, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	METAPOD ("Metapod", 54, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	NIDORAN_MALE ("Nidoran ♂", 55, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	ONIX ("Onix", 56, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	PIDGEY ("Pidgey", 57, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PIKACHU ("Pikachu", 58, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	POLIWAG ("Poliwag", 59, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	PONYTA ("Ponyta", 60, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	RATTATA ("Rattata", 61, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SANDSHREW ("Sandshrew", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SQUIRTLE ("Squirtle", 63, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	STARMIE ("Starmie", 64, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	STARYU ("Staryu", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	TANGELA ("Tangela", 66, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	VOLTORB ("Voltorb", 67, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	VULPIX ("Vulpix", 68, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	WEEDLE ("Weedle", 69, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CLEFAIRY_DOLL ("Clefairy Doll", 70, Rarity.RARE, [TRAINER]),
	COMPUTER_SEARCH ("Computer Search", 71, Rarity.RARE, [TRAINER]),
	DEVOLUTION_SPRAY ("Devolution Spray", 72, Rarity.RARE, [TRAINER]),
	IMPOSTOR_PROFESSOR_OAK ("Impostor Professor Oak", 73, Rarity.RARE, [TRAINER]),
	ITEM_FINDER ("Item Finder", 74, Rarity.RARE, [TRAINER]),
	LASS ("Lass", 75, Rarity.RARE, [TRAINER]),
	POKEMON_BREEDER ("Pokémon Breeder", 76, Rarity.RARE, [TRAINER]),
	POKEMON_TRADER ("Pokémon Trader", 77, Rarity.RARE, [TRAINER]),
	SCOOP_UP ("Scoop Up", 78, Rarity.RARE, [TRAINER]),
	SUPER_ENERGY_REMOVAL ("Super Energy Removal", 79, Rarity.RARE, [TRAINER]),
	DEFENDER ("Defender", 80, Rarity.UNCOMMON, [TRAINER]),
	ENERGY_RETRIEVAL ("Energy Retrieval", 81, Rarity.UNCOMMON, [TRAINER]),
	FULL_HEAL ("Full Heal", 82, Rarity.UNCOMMON, [TRAINER]),
	MAINTENANCE ("Maintenance", 83, Rarity.UNCOMMON, [TRAINER]),
	PLUSPOWER ("PlusPower", 84, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_CENTER ("Pokémon Center", 85, Rarity.UNCOMMON, [TRAINER]),
	POKEMON_FLUTE ("Pokémon Flute", 86, Rarity.UNCOMMON, [TRAINER]),
	POKEDEX ("Pokédex", 87, Rarity.UNCOMMON, [TRAINER]),
	PROFESSOR_OAK ("Professor Oak", 88, Rarity.UNCOMMON, [TRAINER]),
	REVIVE ("Revive", 89, Rarity.UNCOMMON, [TRAINER]),
	SUPER_POTION ("Super Potion", 90, Rarity.UNCOMMON, [TRAINER]),
	BILL ("Bill", 91, Rarity.COMMON, [TRAINER]),
	ENERGY_REMOVAL ("Energy Removal", 92, Rarity.COMMON, [TRAINER]),
	GUST_OF_WIND ("Gust of Wind", 93, Rarity.COMMON, [TRAINER]),
	POTION ("Potion", 94, Rarity.COMMON, [TRAINER]),
	SWITCH ("Switch", 95, Rarity.COMMON, [TRAINER]),
	DOUBLE_COLORLESS_ENERGY ("Double Colorless Energy", 96, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
	FIGHTING_ENERGY ("Fighting Energy", 97, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	FIRE_ENERGY ("Fire Energy", 98, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	GRASS_ENERGY ("Grass Energy", 99, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	LIGHTNING_ENERGY ("Lightning Energy", 100, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	PSYCHIC_ENERGY ("Psychic Energy", 101, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
	WATER_ENERGY ("Water Energy", 102, Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

	static SimpleDeck blackout() {
		SimpleDeck blackout = new SimpleDeck("Blackout Theme Deck");
		blackout.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(MACHOP, 4);
		map.put(MACHOKE, 2);
		map.put(SANDSHREW, 3);
		map.put(ONIX, 3);
		map.put(HITMONCHAN, 1);
		map.put(STARYU, 3);
		map.put(SQUIRTLE, 4);
		map.put(WARTORTLE, 2);
		map.put(FARFETCHD, 2);
		map.put(ENERGY_REMOVAL, 4);
		map.put(SUPER_ENERGY_REMOVAL, 1);
		map.put(GUST_OF_WIND, 1);
		map.put(PLUSPOWER, 1);
		map.put(PROFESSOR_OAK, 1);
		map.put(FIGHTING_ENERGY, 16);
		map.put(WATER_ENERGY, 12);
		blackout.setMap(map);
		return blackout;
	}
	static SimpleDeck brushfire(){
		SimpleDeck brushfire = new SimpleDeck("Brushfire Theme Deck");
		brushfire.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(CHARMANDER, 4);
		map.put(CHARMELEON, 2);
		map.put(VULPIX, 2);
		map.put(NINETALES, 1);
		map.put(GROWLITHE, 2);
		map.put(ARCANINE, 1);
		map.put(WEEDLE, 4);
		map.put(NIDORAN_MALE, 4);
		map.put(TANGELA, 2);
		map.put(ENERGY_REMOVAL, 1);
		map.put(ENERGY_RETRIEVAL, 2);
		map.put(GUST_OF_WIND, 1);
		map.put(LASS, 1);
		map.put(PLUSPOWER, 1);
		map.put(POTION, 3);
		map.put(SWITCH, 1);
		map.put(FIRE_ENERGY, 18);
		map.put(GRASS_ENERGY, 10);
		brushfire.setMap(map);
		return brushfire;
	}
	static SimpleDeck zap(){
		SimpleDeck zap = new SimpleDeck("Zap! Theme Deck");
		zap.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(PIKACHU, 4);
		map.put(MAGNEMITE, 3);
		map.put(ABRA, 3);
		map.put(KADABRA, 1);
		map.put(GASTLY, 3);
		map.put(HAUNTER, 2);
		map.put(DROWZEE, 2);
		map.put(JYNX, 2);
		map.put(MEWTWO, 1);
		map.put(BILL, 2);
		map.put(COMPUTER_SEARCH, 1);
		map.put(DEFENDER, 1);
		map.put(GUST_OF_WIND, 2);
		map.put(POTION, 1);
		map.put(PROFESSOR_OAK, 1);
		map.put(SUPER_POTION, 1);
		map.put(SWITCH, 2);
		map.put(LIGHTNING_ENERGY, 12);
		map.put(PSYCHIC_ENERGY, 16);
		zap.setMap(map);
		return zap;
	}
	static SimpleDeck overgrowth(){
		SimpleDeck overgrowth = new SimpleDeck("Overgrowth Theme Deck");
		overgrowth.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(BULBASAUR, 4);
		map.put(IVYSAUR, 2);
		map.put(WEEDLE, 4);
		map.put(KAKUNA, 2);
		map.put(BEEDRILL, 1);
		map.put(STARYU, 4);
		map.put(STARMIE, 3);
		map.put(MAGIKARP, 2);
		map.put(GYARADOS, 1);
		map.put(BILL, 2);
		map.put(GUST_OF_WIND, 2);
		map.put(POTION, 1);
		map.put(SUPER_POTION, 2);
		map.put(SWITCH, 2);
		map.put(GRASS_ENERGY, 16);
		map.put(WATER_ENERGY, 12);
		overgrowth.setMap(map);
		return overgrowth;
	}

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	BaseSet(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.BASE_SET;
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
			case ALAKAZAM:
			return evolution (this, from:"Kadabra", hp:HP080, type:PSYCHIC, retreatCost:3) {
				weakness PSYCHIC
				pokemonPower "Damage Swap", {
					text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to another as long as you don’t Knock Out that Pokémon. This power can’t be used if Alakazam is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Confuse Ray", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BLASTOISE:
			return evolution (this, from:"Wartortle", hp:HP100, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				pokemonPower "Rain Dance", {
					text "As often as you like during your turn (before your attack), you may attack 1 [W] Energy card to 1 of your [W] Pokémon. (This doesn’t use up your 1 Energy card attachment for the turn.) This power can’t be used if Blastoise is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Hydro Pump", {
					text "40+ damage. Does 40 damage plus 10 more damage for each [W] Energy attached to Blastoise but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd doesn’t count."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHANSEY:
			return basic (this, hp:HP120, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Scrunch", {
					text "Flip a coin. If heads, prevent all damage done to Chansey during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double-edge", {
					text "80 damage. Chansey does 80 damage to itself."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARIZARD:
			return evolution (this, from:"Charmeleon", hp:HP120, type:FIRE, retreatCost:3) {
				weakness WATER
				resistance FIGHTING, MINUS30
				pokemonPower "Energy Burn", {
					text "As often as you like during your turn (before your attack), you may turn all Energy attached to Charizard into [R] Energy for the rest of the turn. This power can’t be used if Charizard is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Fire Spin", {
					text "100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Sing", {
					text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Metronome", {
					text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except of its Energy costs and anything else required in order to use that attach, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefairy’s type is still Colorless)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GYARADOS:
			return evolution (this, from:"Magikarp", hp:HP100, type:WATER, retreatCost:3) {
				weakness GRASS
				resistance FIGHTING, MINUS30
				move "Dragon Rage", {
					text "50 damage."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bubblebeam", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HITMONCHAN:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
				weakness PSYCHIC
				move "Jab", {
					text "20 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Special Punch", {
					text "40 damage."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHAMP:
			return evolution (this, from:"Machoke", hp:HP100, type:FIGHTING, retreatCost:3) {
				weakness PSYCHIC
				pokemonPower "Strikes Back", {
					text "Whenever your opponent’s attack damages Machamp <em>(even if Machamp is Knocked Out)</em>, this power does 10 damage to the attacking Pokémon. (Don’t apply Weakness and Resistance.) This power can’t be used if Machamp is Asleep, Confused, or Paralyzed when your opponent attacks."
					actionA {
					}
				}
				move "Seismic Toss", {
					text "60 damage."
					energyCost F, F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNETON:
			return evolution (this, from:"Magnemite", hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Thunder Wave", {
					text "30 damage. Flip a coin. If heads, the Defendind Pokémon is now Paralyzed."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Selfdestruct", {
					text "80 damage. Does 20 damage to each player’s Bench. (Don’t apply Weakness and Resistance for Benched Pokémon.) Magneton does 80 damage to itself."
					energyCost L, L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEWTWO:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:3) {
				weakness PSYCHIC
				move "Psychic", {
					text "10+ damage. Does 10 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Barrier", {
					text "Discard 1 [P] Energy card attached to Mewtwo in order to use this attack. During your opponent’s next turn, prevent all effects of attacks, including damage, done to Mewtwo."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDOKING:
			return evolution (this, from:"Nidorino", hp:HP090, type:GRASS, retreatCost:3) {
				weakness PSYCHIC
				move "Thrash", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage; if tails, this attack does 30 damage and Nidoking does 10 damage to itself."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Toxic", {
					text "20 damage. The Defending Pokémon is now Poisoned. It now takes 20 Poison damage instead of 10 after each player’s turn (even if it was already Poisoned)."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NINETALES:
			return evolution (this, from:"Vulpix", hp:HP080, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Lure", {
					text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Blast", {
					text "80 damage. Discard 1 [R] Energy card attached to Ninetales in order to use this attack."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWRATH:
			return evolution (this, from:"Poliwhirl", hp:HP090, type:WATER, retreatCost:3) {
				weakness GRASS
				move "Water Gun", {
					text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Poliwrath but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd don’t count."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Whirlpool", {
					text "40 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU:
			return evolution (this, from:"Pikachu", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Agility", {
					text "20 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Raichu."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder", {
					text "60 damage. Flip a coin. If tails, Raichu does 30 damage to itself."
					energyCost L, L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VENUSAUR:
			return evolution (this, from:"Ivysaur", hp:HP100, type:GRASS, retreatCost:2) {
				weakness FIRE
				pokemonPower "Energy Trans", {
					text "As often as you like during your turn (before you attack), you may take 1 [G] Energy card attached to 1 of your Pokémon and attach it to a different one. This power can’t be used if Venusaur is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Solarbeam", {
					text "60 damage."
					energyCost G, G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZAPDOS:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:3) {
				resistance FIGHTING, MINUS30
				move "Thunder", {
					text "60 damage. Flip a coin. If tails, Zapdos does 30 damage to itself."
					energyCost L, L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "100 damage. Discard all Energy cards attached to Zapdos in order to use this attack."
					energyCost L, L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEEDRILL:
			return evolution (this, from:"Kakuna", hp:HP080, type:GRASS, retreatCost:0) {
				weakness FIRE
				resistance FIGHTING, MINUS30
				move "Twineedle", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Sting", {
					text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRAGONAIR:
			return evolution (this, from:"Dratini", hp:HP080, type:COLORLESS, retreatCost:2) {
				resistance PSYCHIC, MINUS30
				move "Slam", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Beam", {
					text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUGTRIO:
			return evolution (this, from:"Diglett", hp:HP070, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Slash", {
					text "40 damage."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Earthquake", {
					text "70 damage. Does 10 damage to each of your own Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTABUZZ:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				move "Thundershock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderpunch", {
					text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage plus Electabuzz does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRODE:
			return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				pokemonPower "Buzzap", {
					text "At any time during your turn (before your attack), you may Knock Out Electrode and attach it to 1 of your other Pokémon. If you do, choose a type of Energy. Electrode is now an Energy card (instead of a Pokémon) that provides 2 energy of that type. You can’t use this power if Electrode is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}
				move "Electric Shock", {
					text "50 damage. Flip a coin. If tails, Electrode does 10 damage to itself."
					energyCost L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEOTTO:
			return evolution (this, from:"Pidgey", hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Whirlwind", {
					text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mirror Move", {
					text "If Pidgeotto was attacked last turn, do the final result of that attack on Pidgeotto to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCANINE:
			return evolution (this, from:"Growlithe", hp:HP100, type:FIRE, retreatCost:3) {
				weakness WATER
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Arcanine in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Take Down", {
					text "80 damage. Arcanine does 30 damage to itself."
					energyCost R, R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMELEON:
			return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Slash", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Charmeleon in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DEWGONG:
			return evolution (this, from:"Seel", hp:HP080, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				move "Aurora Beam", {
					text "50 damage."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ice Beam", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRATINI:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				resistance PSYCHIC, MINUS30
				move "Pound", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case FARFETCHD:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Leek Slap", {
					text "30 damage. Flip a coin. If tails, this attack does nothing. Either way, you can’t use this attack again as long as Farfetch’d stays in play (even putting Farfetch’d on the Bench won’t let you use it again)."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pot Smash", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROWLITHE:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Flare", {
					text "20 damage."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HAUNTER:
			return evolution (this, from:"Gastly", hp:HP060, type:PSYCHIC, retreatCost:1) {
				resistance FIGHTING, MINUS30
				move "Hypnosis", {
					text "The Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dream Eater", {
					text "50 damage. You can’t use this attack unless the Defending Pokémon is Asleep."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case IVYSAUR:
			return evolution (this, from:"Bulbasaur", hp:HP060, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Vine Whip", {
					text "30 damage."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poisonpowder", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case JYNX:
			return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				move "Doubleslap", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Meditate", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KADABRA:
			return evolution (this, from:"Abra", hp:HP060, type:PSYCHIC, retreatCost:3) {
				weakness PSYCHIC
				move "Recover", {
					text "Discard 1 [P] Energy card attached to Kadabra in order to use this attack. Remove all damage counters from Kadabra."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Psy", {
					text "50 damage."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KAKUNA:
			return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Stiffen", {
					text "Flip a coin. If heads, prevent all damage done to Kakuna during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poisonpowder", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHOKE:
			return evolution (this, from:"Machoke", hp:HP080, type:FIGHTING, retreatCost:3) {
				weakness PSYCHIC
				move "Karate Chop", {
					text "50- damage. Does 50 damage minus 10 damage for each damage counter on Machoke."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Submission", {
					text "60 damage. Machoke does 20 damage to itself."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGIKARP:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flail", {
					text "10× damage. Does 10 damage times the number of damage counters on Magikarp."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMAR:
			return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Fire Punch", {
					text "30 damage."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flamethrower", {
					text "50 damage. Discard 1 [R] Energy card attached to Magmar in order to use this attack."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORINO:
			return evolution (this, from:"Nidoran ♂", hp:HP060, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Double Kick", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Horn Drill", {
					text "50 damage."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWHIRL:
			return evolution (this, from:"Poliwag", hp:HP060, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Amnesia", {
					text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Doubleslap", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Conversion 1", {
					text "If the Defending Pokémon has a Weakness, you may change it to a type of your choice other than Colorless."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Conversion 2", {
					text "Change Porygon’s Resistance to a type of your choice other than Colorless."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATICATE:
			return evolution (this, from:"Rattata", hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Bite", {
					text "20 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Fang", {
					text "? damage. Does damage to the Defending Pokémon equal to half the Defending Pokémon’s remaining HP (rounded up to the nearest 10)."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SEEL:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Headbutt", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WARTORTLE:
			return evolution (this, from:"Squirtle", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage done to Wartortle during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Bite", {
					text "40 damage."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ABRA:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				weakness PSYCHIC
				move "Psyshock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BULBASAUR:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Leech Seed", {
					text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Bulbasaur."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CATERPIE:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "String Shot", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Scratch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ember", {
					text "30 damage. Discard 1 [R] Energy card attached to Charmander in order to use this attack."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIGLETT:
			return basic (this, hp:HP030, type:FIGHTING, retreatCost:0) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Dig", {
					text "10 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mud Slap", {
					text "30 damage."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DODUO:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:0) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Fury Attack", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DROWZEE:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Pound", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Confuse Ray", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTLY:
			return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
				resistance FIGHTING, MINUS30
				move "Sleeping Gas", {
					text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Destiny Bond", {
					text "Discard 1 [P] Energy card attached to Gastly in order to use this attack. If a Pokémon Knocks Out Gastly during your opponent’s next turn, Knock Out that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KOFFING:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Foul Gas", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned; if tails, it is now Confused."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MACHOP:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Low Kick", {
					text "20 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEMITE:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Thunder Wave", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Selfdestruct", {
					text "40 damage. Does 10 damage to each Pokémon on each player’s Bench. <em>(Don’t apply Weakness and Resistance for Benched Pokémon.)</em> Magnemite does 40 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case METAPOD:
			return evolution (this, from:"Caterpie", hp:HP070, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Stiffen", {
					text "Flip a coin. If heads, prevent all damage done to Metapod during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stun Spore", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIDORAN_MALE:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Horn Hazard", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ONIX:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
				weakness GRASS
				move "Rock Throw", {
					text "10 damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Harden", {
					text "During your opponent’s next turn, whenever 30 or less damage is done to Onix (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIDGEY:
			return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS30
				move "Whirlwind", {
					text "10 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Gnaw", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case POLIWAG:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Water Gun", {
					text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Poliwag but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd don’t count."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Smash Kick", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flame Tail", {
					text "30 damage."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				move "Bite", {
					text "20 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SANDSHREW:
			return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Sand-attack", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SQUIRTLE:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Bubble", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage done to Squirtle during your opponent’s next turn. (Any other effects of opponent’s attacks still happen.)"
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARMIE:
			return evolution (this, from:"Staryu", hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Recover", {
					text "Discard 1 [W] Energy card attached to Starmie in order to use this attack. Remove all damage counters from Starmie."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Star Freeze", {
					text "20 Damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case STARYU:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Slap", {
					text "20 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGELA:
			return basic (this, hp:HP050, type:GRASS, retreatCost:2) {
				weakness FIRE
				move "Bind", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poisonpowder", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VOLTORB:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case VULPIX:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Confuse Ray", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WEEDLE:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness FIRE
				move "Poison Sting", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CLEFAIRY_DOLL:
			return basicTrainer (this) {
				text "Play Clefairy Doll as if it were a Basic Pokémon. While in play, Clefairy Doll counts a a Pokémon (instead of a Trainer card). Clefairy Doll has no attacks, can’t retreat, and can’t be Asleep, Confused, Paralyzed, or Poisoned. If Clefairy Doll is Knocked Out, it doesn’t count as a Knocked Out Pokémon. At any time during your turn before your attack, you may discard Clefairy Doll."
				onPlay {
				}
				playRequirement{
				}
			};
			case COMPUTER_SEARCH:
			return basicTrainer (this) {
				text "Discard 2 of the other cards from you hand in order to search your deck for any card and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case DEVOLUTION_SPRAY:
			return basicTrainer (this) {
				text "Choose 1 of your own Pokémon in play and a Stage of Evolution. Discard all Evolution cards of that Stage or higher attached to that Pokémon. That Pokémon is no longer Asleep, Confused, Paralyzed, Poisoned, or anything else that might be the result of an attack (just as if you had evolved it)."
				onPlay {
				}
				playRequirement{
				}
			};
			case IMPOSTOR_PROFESSOR_OAK:
			return basicTrainer (this) {
				text "Your opponent shuffles his or her hand into his or her deck, then draws 7 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case ITEM_FINDER:
			return basicTrainer (this) {
				text "Discard 2 of the other cards from your hand in order to put a Trainer card from your discard pile into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case LASS:
			return basicTrainer (this) {
				text "You and your opponent show each other your hands, then shuffle all the Trainer cards from your hands into your decks."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_BREEDER:
			return basicTrainer (this) {
				text "Put a Stage 2 Evolution card from your hand on the matching Basic Pokémon. You can only play this card when you would be allowed to evolve that Pokémon anyway."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_TRADER:
			return basicTrainer (this) {
				text "Trade 1 of the Basic Pokémon or Evolution cards in your hand for 1 of the Basic Pokémon or Evolution cards from your deck. Show both cards to your opponent. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case SCOOP_UP:
			return basicTrainer (this) {
				text "Choose 1 of your Pokémon in play and return its Basic Pokémon card to your hand. (Discard all cards attached to that card.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case SUPER_ENERGY_REMOVAL:
			return basicTrainer (this) {
				text "Discard 1 Energy card attached to 1 of your Pokémon in order to choose 1 of your opponent’s Pokémon and up to 2 Energy cards attached to it. Discard those Energy cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case DEFENDER:
			return basicTrainer (this) {
				text "Attach Defender to 1 of your Pokémon. At the end of your opponent’s next turn, discard Defender. Damage done to that Pokémon by attacks is reduced by 20 (after applying Weakness and Resistance)."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_RETRIEVAL:
			return basicTrainer (this) {
				text "Trade 1 of the other cards in your hand for up to 2 basic Energy cards from your discard pile."
				onPlay {
				}
				playRequirement{
				}
			};
			case FULL_HEAL:
			return basicTrainer (this) {
				text "Your Active Pokémon is no longer Asleep, Confused, Paralyzed, or Poisoned."
				onPlay {
				}
				playRequirement{
				}
			};
			case MAINTENANCE:
			return basicTrainer (this) {
				text "Shuffle 2 of the other cards from your hand into your deck in order to draw a card."
				onPlay {
				}
				playRequirement{
				}
			};
			case PLUSPOWER:
			return basicTrainer (this) {
				text "Attach PlusPower to your Active Pokémon. At the end of your turn, discard PlusPower. If this Pokémon’s attack does damage to the Defending Pokémon (after applying Weakness and Resistance), the attack does 10 more damage to the Defending Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_CENTER:
			return basicTrainer (this) {
				text "Remove all damage counters from all of your own Pokémon with damage counters on them, then discard all Energy cards attached to those Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEMON_FLUTE:
			return basicTrainer (this) {
				text "Choose 1 Basic Pokémon card from your opponent’s discard pile and put it onto his or her Bench. (You can’t play Pokémon Flute if your opponent’s Bench is full.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case POKEDEX:
			return basicTrainer (this) {
				text "Look at up to 5 cards from the top of your deck and rearrange them as you like."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_OAK:
			return basicTrainer (this) {
				text "Discard your hand, then draw 7 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case REVIVE:
			return basicTrainer (this) {
				text "Put 1 Basic Pokémon card from your discard pile onto your Bench. Put damage counters on that Pokémon equal to half its HP (rounded down to the nearest 10). (You can’t play Revive if your Bench is full.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case SUPER_POTION:
			return basicTrainer (this) {
				text "Discard 1 Energy card attached to your own Pokémon in order to remove up to 4 damage counters from that Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case BILL:
			return basicTrainer (this) {
				text "Draw 2 cards."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_REMOVAL:
			return basicTrainer (this) {
				text "Choose 1 Energy card attached to 1 of your opponent’s Pokémon and discard it."
				onPlay {
				}
				playRequirement{
				}
			};
			case GUST_OF_WIND:
			return basicTrainer (this) {
				text "Choose 1 of your opponent’s Benched Pokémon and switch it with his or her Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case POTION:
			return basicTrainer (this) {
				text "Remove up to 2 damage counters from 1 of your Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case SWITCH:
			return basicTrainer (this) {
				text "Switch 1 of your own Benched Pokémon with your Active Pokémon."
				onPlay {
				}
				playRequirement{
				}
			};
			case DOUBLE_COLORLESS_ENERGY:
			return specialEnergy (this) {
				text "Provides [C][C] energy. Doesn’t count as a basic Energy card."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case FIGHTING_ENERGY:
			return basicEnergy (this, FIGHTING);
			case FIRE_ENERGY:
			return basicEnergy (this, FIRE);
			case GRASS_ENERGY:
			return basicEnergy (this, GRASS);
			case LIGHTNING_ENERGY:
			return basicEnergy (this, LIGHTNING);
			case PSYCHIC_ENERGY:
			return basicEnergy (this, PSYCHIC);
			case WATER_ENERGY:
			return basicEnergy (this, WATER);
				default:
			return null;
		}
	}
	
}