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
public enum Fossil implements CardInfo {

	AERODACTYL_1 ("Aerodactyl", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ARTICUNO_2 ("Articuno", 2, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	DITTO_3 ("Ditto", 3, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	DRAGONITE_4 ("Dragonite", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	GENGAR_5 ("Gengar", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	HAUNTER_6 ("Haunter", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	HITMONLEE_7 ("Hitmonlee", 7, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	HYPNO_8 ("Hypno", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	KABUTOPS_9 ("Kabutops", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	LAPRAS_10 ("Lapras", 10, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	MAGNETON_11 ("Magneton", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MOLTRES_12 ("Moltres", 12, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	MUK_13 ("Muk", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	RAICHU_14 ("Raichu", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	ZAPDOS_15 ("Zapdos", 15, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),

	AERODACTYL ("Aerodactyl", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ARTICUNO ("Articuno", 17, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	DITTO ("Ditto", 18, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	DRAGONITE ("Dragonite", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	GENGAR ("Gengar", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	HAUNTER ("Haunter", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	HITMONLEE ("Hitmonlee", 22, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
	HYPNO ("Hypno", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	KABUTOPS ("Kabutops", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	LAPRAS ("Lapras", 25, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	MAGNETON ("Magneton", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MOLTRES ("Moltres", 27, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
	MUK ("Muk", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	RAICHU ("Raichu", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	ZAPDOS ("Zapdos", 30, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	ARBOK ("Arbok", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	CLOYSTER ("Cloyster", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GASTLY ("Gastly", 33, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GOLBAT ("Golbat", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	GOLDUCK ("Golduck", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GOLEM ("Golem", 36, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	GRAVELER ("Graveler", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	KINGLER ("Kingler", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	MAGMAR ("Magmar", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	OMASTAR ("Omastar", 40, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	SANDSLASH ("Sandslash", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	SEADRA ("Seadra", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	SLOWBRO ("Slowbro", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	TENTACRUEL ("Tentacruel", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	WEEZING ("Weezing", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	EKANS ("Ekans", 46, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	GEODUDE ("Geodude", 47, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	GRIMER ("Grimer", 48, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	HORSEA ("Horsea", 49, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	KABUTO ("Kabuto", 50, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	KRABBY ("Krabby", 51, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	OMANYTE ("Omanyte", 52, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PSYDUCK ("Psyduck", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SHELLDER ("Shellder", 54, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SLOWPOKE ("Slowpoke", 55, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	TENTACOOL ("Tentacool", 56, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	ZUBAT ("Zubat", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),

	MR_FUJI ("Mr. Fuji", 58, Rarity.UNCOMMON, [TRAINER]),
	ENERGY_SEARCH ("Energy Search", 59, Rarity.COMMON, [TRAINER]),
	GAMBLER ("Gambler", 60, Rarity.COMMON, [TRAINER]),
	RECYCLE ("Recycle", 61, Rarity.COMMON, [TRAINER]),
	MYSTERIOUS_FOSSIL ("Mysterious Fossil", 62, Rarity.COMMON, [TRAINER]);

	static SimpleDeck lockdown() {
		SimpleDeck deck = new SimpleDeck("LockDown Theme Deck");
		deck.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(BaseSet.VULPIX, 3);
		map.put(BaseSet.PONYTA, 3);
		map.put(MAGMAR, 2);
		map.put(KRABBY, 4);
		map.put(KINGLER, 2);
		map.put(HORSEA, 4);
		map.put(SEADRA, 2);
		map.put(LAPRAS, 1);
		map.put(BaseSet.BILL, 2);
		map.put(ENERGY_SEARCH, 1);
		map.put(BaseSet.FULL_HEAL, 1);
		map.put(GAMBLER, 1);
		map.put(BaseSet.POTION, 2);
		map.put(BaseSet.SUPER_POTION, 2);
		map.put(BaseSet.SWITCH, 2);
		map.put(BaseSet.FIRE_ENERGY, 14);
		map.put(BaseSet.WATER_ENERGY, 14);
		deck.setMap(map);
		return deck;
	}

	static SimpleDeck bodyguard() {
		SimpleDeck deck = new SimpleDeck("BodyGuard Theme Deck");
		deck.setFormat(GameFormat.CLASSIC_SERIES);
		Map<CardInfo, Integer> map = new HashMap<>();
		map.put(BaseSet.BULBASAUR, 2);
		map.put(ZUBAT, 4);
		map.put(GOLBAT, 2);
		map.put(GRIMER, 4);
		map.put(MUK, 1);
		map.put(BaseSet.KOFFING, 4);
		map.put(GEODUDE, 3);
		map.put(GRAVELER, 2);
		map.put(BaseSet.ONIX, 1);
		map.put(BaseSet.POKEMON_CENTER, 1);
		map.put(BaseSet.POTION, 4);
		map.put(BaseSet.PROFESSOR_OAK, 2);
		map.put(BaseSet.SUPER_POTION, 2);
		map.put(BaseSet.GRASS_ENERGY, 16);
		map.put(BaseSet.FIGHTING_ENERGY, 12);
		// map.put(,);
		deck.setMap(map);
		return deck;
	}

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	Fossil(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.FOSSIL;
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
			case AERODACTYL_1:
			return evolution (this, from:"Mysterious Fossil", hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				resistance FIGHTING, MINUS30
				pokemonPower "Prehistoric Power", {
					text "No more Evolution cards can be played. This power stops working while Aerodactyl is Asleep, Confused, or Paralyzed."
					delayedA {
						before PLAY_EVOLUTION, {
							if(!self.specialConditions){
								wcu "Prehistoric Power prevents you from playing Evolution cards!"
								prevent()
							}
						}
					}
				}
				move "Wing Attack", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}

			};
			case ARTICUNO_2:
			return basic (this, hp:HP070, type:WATER, retreatCost:2) {
				resistance FIGHTING, MINUS30
				move "Freeze Dry", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 30
						flip {apply PARALYZED}
					}
				}
				move "Blizzard", {
					text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon. If tails, this attack does 10 damage to each of your own Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W, W, W, W
					attackRequirement {}
					onAttack {
						damage 50
						flip 1,{
							opp.bench.each{damage 10, it}
						},{
							my.bench.each{damage 10, it}
						}
					}
				}

			};
			case DITTO_3:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness FIGHTING
				resistance PSYCHIC, MINUS30
				pokemonPower "Transform", {
					text "If Ditto is your Active Pokémon, treat it as if it were the same card as the Defending Pokémon, including type, Hit Points, Weakness, and so on, except Ditto can’t evolve, always has this Pokémon Power, and you may treat any Energy attached to Ditto as Energy of any type. Ditto isn’t a copy of any other Pokémon while Ditto is Asleep, Confused, or Paralyzed."
					actionA {
					}
				}

			};
			case DRAGONITE_4:
			return evolution (this, from:"Dragonair", hp:HP100, type:COLORLESS, retreatCost:1) {
				resistance FIGHTING, MINUS30
				pokemonPower "Step In", {
					text "Once during your turn (before your attack), if Dragonite is on your Bench, you may switch it with your Active Pokémon."
					actionA {
						checkLastTurn()
						assert my.bench.find{it == self} : "Dragonite is not on the Bench"
						if (confirm("switch Dragonite with your active pokemon")){
							powerUsed()
							sw my.active, self
						}
					}
				}
				move "Slam", {
					text "40× damage. Flip 2 coins. This attack does 40 damage times the number of heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						flip 2,{damage 40}
					}
				}

			};
			case GENGAR_5:
			return evolution (this, from:"Haunter", hp:HP080, type:PSYCHIC, retreatCost:1) {
				resistance FIGHTING, MINUS30
				pokemonPower "Curse", {
					text "Once during your turn (before your attack), you may move 1 damage counter from 1 of your opponent’s Pokémon to another (even if it would Knock Out the other Pokémon). This power can’t be used if Gengar is Asleep, Confused, or Paralyzed."
					actionA {
						checkLastTurn()
						assert opp.bench : "There is only one Pokémon"
						assert opp.all.find{it.numberOfDamageCounters} : "None of your opponent’s Pokémon have damage counter to move"
						powerUsed()
						def src = opp.all.findAll{it.numberOfDamageCounters}.select().first()
						def tar = opp.all.findAll{it != src}.select().first()
						src.damage-=hp(10)
						tar.damage+=hp(10)
					}
				}
				move "Dark Mind", {
					text "30 damage. If you opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 30
						if(opp.bench) damage 10, opp.bench.select()
					}
				}

			};
			case HAUNTER_6:
			return evolution (this, from:"Gastly", hp:HP050, type:PSYCHIC, retreatCost:0) {
				resistance FIGHTING, MINUS30
				pokemonPower "Transparency", {
					text "Whenever an attack does anything to Haunter, flip a coin. If heads, prevent all effects of that attack, including damage, done to Haunter. This power stops working while Haunter is Asleep, Confused, or Paralyzed."
					delayedA {
						def coinRes = false
						before null, self, Source.ATTACK, {
              if(!self.specialConditions){
								flip 1,{coinRes = true},{coinRes = false}
                if (coinRes&& bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "Safeguard prevents effect"
                  prevent()
                }
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if(!self.specialConditions){
                bg.dm().each {
                  if(coinRes && it.to == self && it.notNoEffect){
                    it.dmg = hp(0)
                    bc "Safeguard prevents damage"
                  }
                }
              }
            }
            after ENERGY_SWITCH, {
              def efs = (ef as EnergySwitch)
              if(!self.specialConditions){
                if(coinRes && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
					}
				}
				move "Nightmare", {
					text "10 damage. The Defending Pokémon is now Asleep."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 10
						apply ASLEEP
					}
				}

			};
			case HITMONLEE_7:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness PSYCHIC
				move "Stretch Kick", {
					text "If you opponent has any Benched Pokémon, choose 1 of them and this attack does 20 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F, F
					attackRequirement {
						assert opp.bench : "There is no Benched Pokémon"
					}
					onAttack {
						damage 20, opp.bench.select()
					}
				}
				move "High Jump Kick", {
					text "50 damage."
					energyCost F, F, F
					attackRequirement {}
					onAttack {
						damage 50
					}
				}

			};
			case HYPNO_8:
			return evolution (this, from:"Drowzee", hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness PSYCHIC
				move "Prophecy", {
					text "Look at up to 3 cards from the top of either player’s deck and rearrange them as you like."
					energyCost P
					attackRequirement {
						assert my.deck || opp.deck
					}
					onAttack {
						def mySize = Math.min(my.deck.size(),3)
						def oppSize = Math.min(opp.deck.size(),3)
						if(mySize) my.deck.setSubList(0,rearrange(my.deck.subList(0,mySize)))
						if(oppSize) opp.deck.setSubList(0,rearrange(opp.deck.subList(0,oppSize)))
					}
				}
				move "Dark Mind", {
					text "30 damage. If you opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 30
						if(opp.bench) damage 10, opp.bench.select()
					}
				}

			};
			case KABUTOPS_9:
			return evolution (this, from:"Kabuto", hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Sharp Sickle", {
					text "30 damage."
					energyCost F, F
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Absorb", {
					text "40 damage. Remove a number of damage counters from Kabutops equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10). If Kabutops has fewer damage counters than that, remove all of them."
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 40
						removeDamageCounterEqualToHalfDamageDone()
					}
				}

			};
			case LAPRAS_10:
			return basic (this, hp:HP080, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Water Gun", {
					text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Lapras but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
						extraEnergyDamage(2,hp(10),W,thisMove)

					}
				}
				move "Confuse Ray", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 10
						flipThenApplySC CONFUSED
					}
				}

			};
			case MAGNETON_11:
			return evolution (this, from:"Magnemite", hp:HP080, type:LIGHTNING, retreatCost:2) {
				weakness FIGHTING
				move "Sonicboom", {
					text "20 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
					energyCost L, C
					attackRequirement {}
					onAttack {
						noWrDamage(20,defending)
					}
				}
				move "Selfdestruct", {
					text "100 damage. Does 20 damage to each Pokémon on each player’s Bench. (Don’t apply Weakness and Resistance for Benched Pokémon.) Magneton does 100 damage to itself."
					energyCost L, L, L, L
					attackRequirement {}
					onAttack {
						damage 100
						if(my.bench) my.bench.each{damage 20, it}
						if(opp.bench) opp.bench.each{damage 20, it}
						damage 100,self
					}
				}

			};
			case MOLTRES_12:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				resistance FIGHTING, MINUS30
				move "Wildfire", {
					text "You may discard any number of [R] Energy cards attached to Moltres when you use this attack. If you do, discard that many cards from the top of your opponent’s deck."
					energyCost R
					attackRequirement {}
					onAttack {
						def src = self.cards.filterByEnergyType(R)
						def tar = src.select(max : src.size())
						if(tar){
							opp.deck.subList(0,tar.size()).moveTo(opp.discard)
							tar.moveTo(my.discard)
						}
					}
				}
				move "Dive Bomb", {
					text "80 damage. Flip a coin. If tails, this attack does nothing."
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						flip {damage 80}
					}
				}

			};
			case MUK_13:
			return evolution (this, from:"Grimer", hp:HP070, type:GRASS, retreatCost:2) {
				weakness PSYCHIC
				pokemonPower "Toxic Gas", {
					text "Ignore all Pokémon Powers other than Toxic Gas. This power stops working while Muk is Asleep, Confused, or Paralyzed."
					def effect1
          def effect2
          onActivate {
            effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
              if (!self.specialConditions && h.effect.ability.name != "Toxic Gas") {
                h.object=true
              }
            }
            effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if (!self.specialConditions && h.effect.ability.name != "Toxic Gas") {
                h.object=true
              }
            }
          }
          onDeactivate {
            effect1.unregister()
            effect2.unregister()
          }
				}
				move "Sludge", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, G, G
					attackRequirement {}
					onAttack {
						damage 30
						flipThenApplySC POISONED
					}
				}

			};
			case RAICHU_14:
			return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness FIGHTING
				move "Gigashock", {
					text "30 damage. Choose 3 of your opponent’s Benched Pokémon and this attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.) If your opponent has fewer than 3 Benched Pokémon, do that damage to each of them."
					energyCost L, L, L, L
					attackRequirement {}
					onAttack {
						damage 30
						if(opp.bench){
							multiSelect(opp.bench, 3).each{
								targeted(it){
									damage 10,it
								}
							}
						}
					}
				}

			};
			case ZAPDOS_15:
			return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
				resistance FIGHTING, MINUS30
				move "Thunderstorm", {
					text "40 damage. For each of your opponent’s Benched Pokémon, flip a coin. If heads, this attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Then, Zapdos does 10 damage times the number of tails to itself."
					energyCost L, L, L, L
					attackRequirement {}
					onAttack {
						damage 40
						def selfDmg = 0
						if(opp.bench){
							opp.bench.each{
								flip 1,{
									targeted(it){
										directDamage 20, it
									}
								},{selfDmg += 1}
							}
							damage 10*selfDmg, self
						}
					}
				}

			};
			case AERODACTYL_16:
			return copy (AERODACTYL_1, this);
			case ARTICUNO:
			return copy (ARTICUNO_2, this);
			case DITTO:
			return copy (DITTO_3, this);
			case DRAGONITE:
			return copy (DRAGONITE_4, this);
			case GENGAR:
			return copy (GENGAR_5, this);
			case HAUNTER:
			return copy (HAUNTER_6, this);
			case HITMONLEE:
			return copy (HITMONLEE_7, this);
			case HYPNO:
			return copy (HYPNO_8, this);
			case KABUTOPS:
			return copy (KABUTOPS_9, this);
			case LAPRAS:
			return copy (LAPRAS_10, this);
			case MAGNETON:
			return copy (MAGNETON_11, this);
			case MOLTRES:
			return copy (MOLTRES_12, this);
			case MUK:
			return copy (MUK_13, this);
			case RAICHU:
			return copy (RAICHU_14, this);
			case ZAPDOS:
			return copy (ZAPDOS_15, this);
			case ARBOK:
			return evolution (this, from:"Ekans", hp:HP060, type:GRASS, retreatCost:2) {
				weakness PSYCHIC
				move "Terror Strike", {
					text "Flip a coin. If heads and if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
					energyCost G
					attackRequirement {
						assert opp.bench
					}
					onAttack {
						flip {whirlwind()}
					}
				}
				move "Poison Fang", {
					text "20 damage. The Defending Pokémon is now Poisoned."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 20
						apply POISONED
					}
				}

			};
			case CLOYSTER:
			return evolution (this, from:"Shellder", hp:HP050, type:WATER, retreatCost:2) {
				weakness LIGHTNING
				move "Clamp", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing (not even damage)."
					energyCost W, W
					attackRequirement {}
					onAttack {
						flip {
							damage 30
							apply PARALYZED
						}
					}
				}
				move "Spike Cannon", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost W, W
					attackRequirement {}
					onAttack {
						flip 2, {damage 30}
					}
				}

			};
			case GASTLY:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:0) {
				resistance FIGHTING, MINUS30
				move "Lick", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
						flipThenApplySC PARALYZED
					}
				}
				move "Energy Conversion", {
					text "Put up to 2 Energy cards from your discard pile into your hand. Gastly does 10 damage to itself."
					energyCost P, P
					attackRequirement {}
					onAttack {
						def tar = my.discard.filterByType(ENERGY)
						if(tar) tar.select(max : 2).moveTo(my.hand)
						damage 10, self
					}
				}

			};
			case GOLBAT:
			return evolution (this, from:"Zubat", hp:HP060, type:GRASS, retreatCost:0) {
				weakness PSYCHIC
				resistance FIGHTING, MINUS30
				move "Wing Attack", {
					text "30 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Leech Life", {
					text "20 damage. Remove a number of damage counters from Golbat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance). If Golbat has fewer damage counters than that, remove all of them."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 20
						removeDamageCounterEqualToHalfDamageDone()
					}
				}

			};
			case GOLDUCK:
			return evolution (this, from:"Psyduck", hp:HP070, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Psyshock", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
						flipThenApplySC PARALYZED
					}
				}
				move "Hyper Beam", {
					text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 20
						discardDefendingEnergy()
					}
				}

			};
			case GOLEM:
			return evolution (this, from:"Graveler", hp:HP080, type:FIGHTING, retreatCost:4) {
				weakness GRASS
				move "Avalanche", {
					text "60 damage."
					energyCost F, F, F, C
					attackRequirement {}
					onAttack {
						damage 60
					}
				}
				move "Selfdestruct", {
					text "100 damage. Does 20 damage to each Pokémon on each player’s Bench. (Don’t apply Weakness and Resistance for Benched Pokémon.) Golem does 100 damage to itself."
					energyCost F, F, F, F
					attackRequirement {}
					onAttack {
						damage 100
						if (my.bench) my.bench.each{damage 20, it}
						if (opp.bench) opp.bench.each{damage 20, it}
						damage 100, self
					}
				}

			};
			case GRAVELER:
			return evolution (this, from:"Geodude", hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness GRASS
				move "Harden", {
					text "During your opponent’s next turn, whenever 30 of less damage is done to Graveler (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.)"
					energyCost F, F
					attackRequirement {}
					onAttack {
						delayed {
							before APPLY_ATTACK_DAMAGES, {
								bg.dm().each {
									if(it.to == self & it.dmg.value <= 30) {
										bc "Graveler Harden prevents damage!"
										it.dmg = hp(0)
									}
								}
							}
							unregisterAfter 2
							after SWITCH, self,{unregister()}
							after EVOLVE, self,{unregister()}

						}
					}
				}
				move "Rock Throw", {
					text "40 damage."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case KINGLER:
			return evolution (this, from:"Krabby", hp:HP060, type:WATER, retreatCost:3) {
				weakness LIGHTNING
				move "Flail", {
					text "10× damage. Does 10 damage times the number of damage counters on Kingler."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10*self.numberOfDamageCounters
					}
				}
				move "Crabhammer", {
					text "40 damage."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}

			};
			case MAGMAR:
			return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, you opponent flips a coin. If tails, that attack does nothing."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
						sandAttack()
					}
				}
				move "Smog", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost R, R
					attackRequirement {}
					onAttack {
						damage 20
						flipThenApplySC POISONED
					}
				}

			};
			case OMASTAR:
			return evolution (this, from:"Omanyte", hp:HP070, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Water Gun", {
					text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Omastar but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
						extraEnergyDamage(2,hp(10),W,thisMove)
					}
				}
				move "Spike Cannon", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost W, W
					attackRequirement {}
					onAttack {
						flip 2,{damage 30}
					}
				}

			};
			case SANDSLASH:
			return evolution (this, from:"Sandshrew", hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				resistance LIGHTNING, MINUS30
				move "Slash", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
				move "Fury Swipes", {
					text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
					energyCost F, F
					attackRequirement {}
					onAttack {
						flip 3, {damage 20}
					}
				}

			};
			case SEADRA:
			return evolution (this, from:"Horsea", hp:HP060, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Water Gun", {
					text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Seadra but not use dto pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
						extraEnergyDamage(2,hp(10),W,thisMove)
					}
				}
				move "Agility", {
					text "20 damage. Flip a coin. If heads, during your opponent’s next turn prevent all effects of attacks, including damage, done to Seadra."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 20
						flip {preventAllEffectsNextTurn()}
					}
				}

			};
			case SLOWBRO:
			return evolution (this, from:"Slowbro", hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				pokemonPower "Strange Behavior", {
					text "As often as you like during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon to Slowbro as long as you don’t Knock Out Slowbro. This power can’t be used if Slowbro is Asleep, Confused, or Paralyzed."
					actionA {
						assert !self.specialConditions
						assert self.damage != self.fullHP - hp(10) : "Slowbro can't be Knocked Out by Strange Behavior!"
						def tar = my.all.findAll{it != self && it.numberOfDamageCounters}
						assert tar : "There is no Pokemon with damage counter outside Slowbro"
						self.damage+=hp(10)
						tar.select().first().damage-=hp(10)
					}
				}
				move "Psyshock", {
					text "20 damage. Flip a coin. If heads, the defending Pokémon is now Paralyzed."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 20
						flipThenApplySC CONFUSED
					}
				}

			};
			case TENTACRUEL:
			return evolution (this, from:"Tentacool", hp:HP060, type:WATER, retreatCost:0) {
				weakness LIGHTNING
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost W
					attackRequirement {}
					onAttack {
						flipThenApplySC CONFUSED
					}
				}
				move "Jellyfish Sting", {
					text "10 damage. The Defending Pokémon is now Poisoned."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 10
						apply POISONED
					}
				}

			};
			case WEEZING:
			return evolution (this, from:"Koffing", hp:HP060, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Smog", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 20
						flipThenApplySC POISONED
					}
				}
				move "Selfdestruct", {
					text "60 damage. Does 10 damage to each Pokémon on each player’s Bench. (Don’t apply Weakness and Resistance for Benched Pokémon.) Weezing does 60 damage to itself."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
						damage 60
						if (my.bench) my.bench.each{damage 10, it}
						if (opp.bench) opp.bench.each{damage 10, it}
						damage 60, self
					}
				}

			};
			case EKANS:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Spit Poison", {
					text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost G
					attackRequirement {}
					onAttack {
						flipThenApplySC POISONED
					}
				}
				move "Wrap", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
						flipThenApplySC PARALYZED
					}
				}

			};
			case GEODUDE:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Stone Barrage", {
					text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
					energyCost F, C
					attackRequirement {}
					onAttack {
						flipUntilTails {damage 10}
					}
				}

			};
			case GRIMER:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness PSYCHIC
				move "Nasty Good", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralzyed."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 10
						flipThenApplySC
					}
				}
				move "Minimize", {
					text "All damage done by attacks to Grimer during your opponent’s next turn is reduced by 20 (after applying Weakness and Resistance)."
					energyCost G
					attackRequirement {}
					onAttack {
						reduceDamageNextTurn(hp(20),thisMove)
					}
				}

			};
			case HORSEA:
			return basic (this, hp:HP040, type:WATER, retreatCost:0) {
				weakness LIGHTNING
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
						sandAttack()
					}
				}

			};
			case KABUTO:
			return evolution (this, from:"Mysterious Fossil", hp:HP030, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				pokemonPower "Kabuto Armor", {
					text "Whenever an attack (even your own) does damage to Kabuto (after applying Weakness and Resistance), that attack does half the damage to Kabuto (rounded down to the nearest 10). (Any other effects of attacks still happen.) This power stops working while Kabuto is Asleep, Confused, or Paralzyed."
					delayedA {
						before APPLY_ATTACK_DAMAGES, {
							if(!(self.specialConditions)){
								bg.dm().each {
									if(it.to == self & it.dmg.value > 20) {
										bc "Kabuto Armor halves damage"
										it.dmg = hp((it.dmg.value - ((it.dmg.value/10)%2)*10)/2)
									}
								}
							}
						}
					}
				}
				move "Scratch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case KRABBY:
			return basic (this, hp:HP050, type:WATER, retreatCost:2) {
				move "Call for Family", {
					text "Search your deck for a Basic Pokémon named Krabby and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench if full.)"
					energyCost W
					attackRequirement {
						assert deck.notEmpty
						assert my.bench.notFull
					}
					onAttack {
						deck.search (count: 1,{it.cardTypes.is(BASIC) && it.name == "Krabby"}).each {
							deck.remove(it)
							benchPCS(it)
						}
						shuffleDeck()
					}
				}
				move "Irongrip", {
					text "20 damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}

			};
			case OMANYTE:
			return evolution (this, from:"Mysterious Fossil", hp:HP040, type:WATER, retreatCost:1) {
				weakness GRASS
				pokemonPower "Clairvoyance", {
					text "Your opponent plays with his or her hand face up. This power stops working while Omanyte is Asleep, Confused, or Paralyzed."
					actionA {
						opp.hand.showToMe("opponent's hand")
					}
				}
				move "Water Gun", {
					text "10+ damage. Does 10 damage plus 10 more damage for each [W] Energy attached to Omanyte but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
						extraEnergyDamage(2,hp(10),W,thisMove)
					}
				}

			};
			case PSYDUCK:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Headache", {
					text "Your opponent can’t play Trainer cards during his or her next turn."
					energyCost P
					attackRequirement {}
					onAttack {
						delayed{
							before PLAY_TRAINER, {
								if (bg.currentTurn == self.owner.opposite) {
									wcu "Disconnect prevents playing this card"
									prevent()
								}
							}
							unregisterAfter 2
						}
					}
				}
				move "Fury Swipes", {
					text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
					energyCost W
					attackRequirement {}
					onAttack {
						flip 3, {damage 10}
					}
				}

			};
			case SHELLDER:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost W
					attackRequirement {}
					onAttack {
						flipThenApplySC CONFUSED
					}
				}
				move "Hide in Shell", {
					text "Flip a coin. If heads, prevent all damage done to Shellder during your opponent’s next turn. (Any other effects of attacks still happen.)"
					energyCost W
					attackRequirement {}
					onAttack {
						flip{preventAllDamageNextTurn()}
					}
				}

			};
			case SLOWPOKE:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness PSYCHIC
				move "Spacing Out", {
					text "Flip a coin. If heads, remove a damage counter from Slowpoke. This attack can’t be used if Slowpoke has no damage counters on it."
					energyCost C
					attackRequirement {
						assert self.numberOfDamageCounters : "there is no damage counter on Slowpoke"
					}
					onAttack {
						self.damage -= hp(10)
					}
				}
				move "Scavenge", {
					text "Discard 1 [P] Energy card attached to Slowpoke in order to use this attack. Put a Trainer card from your discard pile into your hand."
					energyCost P, P
					attackRequirement {}
					onAttack {
						discardSelfEnergy P
						if(my.discard.find(cardTypeFilter(TRAINER))) {
							my.discard.findAll(cardTypeFilter(TRAINER)).select.moveTo(my.hand)
						}
					}
				}

			};
			case TENTACOOL:
			return basic (this, hp:HP030, type:WATER, retreatCost:0) {
				weakness LIGHTNING
				pokemonPower "Cowardice", {
					text "At any time during your turn (before your attack), you may return Tentacool to your hand. (Discard all cards attached to Tentacool.) This power can’t be used the turn you put Tentacool into play or if Tentacool is Asleep, Confused, or Paralyzed."
					actionA {
						assert !self.specialConditions : "Cowardice can't be used if Tentacool has a status"
						assert self.lastEvolved != bg.turnCount : "Cowardice can't be used the turn you put Tentacool into play"
						assert my.bench : "You have no other Pokémon"
						self.cards.discard()
            removePCS(self)
					}
				}
				move "Acid", {
					text "10 damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 10
					}
				}

			};
			case ZUBAT:
			return basic (this, hp:HP040, type:GRASS, retreatCost:0) {
				weakness PSYCHIC
				resistance FIGHTING, MINUS30
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
						flipThenApplySC CONFUSED
					}
				}
				move "Leech Life", {
					text "10 damage. Remove a number of damage counters from Zubat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance). If Zubat has fewer damage counters than that, remove all of them."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 10
						removeDamageCounterEqualToDamageDone()
					}
				}

			};
			case MR_FUJI:
			return basicTrainer (this) {
				text "Choose a Pokémon on your Bench. Shuffle it any any cards attached to it into your deck."
				onPlay {
					def tar = my.bench.select().first()
					shuffleDeck(tar.cards)
					removePCS(tar)
				}
				playRequirement{
					assert my.bench : "There is no Benched Pokémon"
				}
			};
			case ENERGY_SEARCH:
			return basicTrainer (this) {
				text "Search your deck for a basic Energy card and put it into your hand. Shuffle your deck afterward."
				onPlay {
					my.deck.search(cardTypeFilter(ENERGY)).moveTo(my.hand)
					shuffleDeck()
				}
				playRequirement{
					assert my.deck
				}
			};
			case GAMBLER:
			return basicTrainer (this) {
				text "Shuffle your hand into your deck. Flip a coin. If heads, draw 8 cards. If tails, draw 1 card."
				onPlay {
					my.hand.moveTo(hidden:true, my.deck)
          shuffleDeck()
          flip 1,{draw 8},{draw 1}
				}
				playRequirement{
				}
			};
			case RECYCLE:
			return basicTrainer (this) {
				text "Flip a coin. If heads, put a card in your discard pile on top of your deck."
				onPlay {
					flip{my.deck.addAll(0, my.discard.select())}
				}
				playRequirement{
					assert my.discard
				}
			};
			case MYSTERIOUS_FOSSIL:
			return basicTrainer (this) {
				text "Play Mysterious Fossil as if it were a Basic Pokémon. While in play, Mysterious Fossil counts as a Pokémon (instead of a Trainer card). Mysterious Fossil has no attacks, can’t retreat, and can’t be Asleep, Confused, Paralyzed, or Poisoned. If Mysterious Fossil is Knocked Out, it doesn’t count as a Knocked Out Pokémon. (Discard it anyway.) At any time during your turn, before your attack, you may discard Mysterious Fossil from play."
				onPlay {
				Card pokemonCard, trainerCard = thisCard
				pokemonCard = basic (new CustomCardInfo(MYSTERIOUS_FOSSIL).setCardTypes(BASIC, POKEMON), hp:HP010, type:COLORLESS, retreatCost:0) {
						customAbility{
								def ef2, acl
								onActivate{
										delayed {
											before RETREAT, self, {
													wcu "Cannot retreat"
													prevent()
											}
											before TAKE_PRIZE, {
												if(ef.pcs==self){
														bc "No prize card for Mysterious Fossil"
														prevent()
												}
											}
											before APPLY_SPECIAL_CONDITION, self, {
													wcu "Mysterious Fossil can't have special conditions"
													prevent()
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
										acl = action("Discard Mysterious Fossil", [TargetPlayer.SELF]){
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

				default:
			return null;
		}
	}

}
