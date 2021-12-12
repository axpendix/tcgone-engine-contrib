package tcgwars.logic.impl.gen1;

import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen4.Unleashed;

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

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.card.pokemon.*
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
 * @author frozenLake
 */
public enum IntroPack implements LogicCardInfo {
	BLASTOISE_1 ("Blastoise", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	PIKACHU_2 ("Pikachu", "2", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	VENUSAUR_3 ("Venusaur", "3", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	ARCANINE_4 ("Arcanine", "4", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	ELECTABUZZ_5 ("Electabuzz", "5", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	RAICHU_6 ("Raichu", "6", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]);
	BULBASAUR_7 ("Bulbasaur", "7", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	GROWLITHE_8 ("Growlithe", "8", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	GROWLITHE_9 ("Growlithe", "9", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	IVYSAUR_10 ("Ivysaur", "10", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	JYNX_11 ("Jynx", "11", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	MAGMAR_12 ("Magmar", "12", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	SQUIRTLE_13 ("Squirtle", "13", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	WARTORTLE_14 ("Wartortle", "14", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	BULBASAUR_15 ("Bulbasaur", "15", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	DIGLETT_16 ("Diglett", "16", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	DODUO_17 ("Doduo", "17", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	DROWZEE_18 ("Drowzee", "18", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),\
	JIGGLYPUFF_19 ("Jigglypuff", "19", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	KOFFING_20 ("Koffing", "20", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	MACHOP_21 ("Machop", "21", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MEOWTH_22 ("Meowth", "22", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PIKACHU_23 ("Pikachu", "23", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	POLIWAG_24 ("Poliwag", "24", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	SPEAROW_25 ("Spearow", "25", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SQUIRTLE_26 ("Squirtle", "26", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BILL_S_TELEPORTER_27 ("Bill's Teleporter", "27", Rarity.UNCOMMON, [TRAINER]),
	FULL_HEAL_28 ("Full Heal", "28", Rarity.UNCOMMON, [TRAINER]),
	SUPER_SCOOP_UP_29 ("Super Scoop Up", "29", Rarity.UNCOMMON, [TRAINER]),
	ENERGY_REMOVAL_30 ("Energy Removal", "30", Rarity.COMMON, [TRAINER]),
	GUST_OF_WIND_31 ("Gust of Wind", "31", Rarity.COMMON, [TRAINER]);
	POTION_32 ("Potion", "32", Rarity.COMMON, [TRAINER]),
	SWITCH_33 ("Switch", "33", Rarity.COMMON, [TRAINER]),


static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected String collectionLineNo;

	IntroPack(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
	public String getNumber() {
		return collectionLineNo;
	}

	@Override
	public tcgwars.logic.card.Collection getCollection() {
		return tcgwars.logic.card.Collection.INTRO_PACK;
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
			case BLASTOISE_1:
				return copy(BaseSetNG.BLASTOISE, this);
			case PIKACHU_2:
				return copy(WizardsBlackStarPromosNG.PIKACHU_1 , this);
			case VENUSAUR_3:
				return copy(BaseSetNG.VENUSAUR, this);
			case ARCANINE_4:
				return evolution (this, from:"Growlithe", hp:HP070, type:FIRE, retreatCost:2) {
					weakness WATER
					move "Take Down", {
						text "50 damage. Arcanine does 20 damage to itself."
						energyCost R, R, C
						attackRequirement {}
						onAttack {
							damage 50
							damage 20, self
						}
					}
				}
			case ELECTABUZZ_5:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
					weakness FIGHTING
					move "Thundershock", {
						text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
						energyCost L, L, C
						attackRequirement {}
						onAttack {
							damage 30
							flip(applyAfterDamage(PARALYZED))
						}
					}
				}
			case RAICHU_6:
				return evolution (this, from:"Pikachu", hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					move "Quick Attack", {
						text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
						energyCost C, C
						attackRequirement {}
						onAttack {
							damage 10
							flip 1, {damage 20}
						}
					}
					move "Thunderbolt", {
						text "60 damage. Discard all Energy cards attached to Raichu."
						energyCost L, L, L
						attackRequirement {}
						onAttack {
							discardAllSelfEnergyInOrderTo()
							damage 60
						}
					}
				}
			case BULBASAUR_7:
				/** return copy(Vending_S1.BULBASAUR, this); */
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "First Aid", {
						text "Remove 1 damage counter from Bulbasaur."
						energyCost C
						attackRequirement {}
						onAttack {
							heal 10, self
						}
					}
					move "Poison Seed", {
						text "The Defending Pokémon is now Poisoned."
						energyCost G
						attackRequirement {}
						onAttack {
							apply POISONED
						}
					}
				}
			case GROWLITHE_8:
				return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Lunge", {
						text "20 damage. Flip a coin. If tails, this attack does nothing."
						energyCost C
						attackRequirement {}
						onAttack {
							flip{damage 20}
						}
					}
					move "Ember", {
						text "30 damage. Discard a [R] Energy card attached to Growlithe or this attack does nothing."
						energyCost R, C
						attackRequirement {}
						onAttack {
							discardSelfEnergyInOrderTo(R)
							damage 30
						}
					}
				}
			case GROWLITHE_9:
				return copy(BaseSetNG.GROWLITHE, this);
			case IVYSAUR_10:
				return evolution (this, from:"Bulbasaur", hp:HP070, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Leech Seed", {
						text "20 damage. Unless all damage from this attack is prevented, you may remove one damage counter from Ivysaur."
						energyCost G, G
						attackRequirement {}
						onAttack {
							damage 20
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
			case JYNX_11:
				return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					move "Pound", {
						text "10 damage."
						energyCost C
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
					move "Double Slap", {
						text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
						energyCost P, C
						attackRequirement {}
						onAttack {
							flip 2, {damage 20}
						}
					}
				}
			case MAGMAR_12:
				return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Fire Punch", {
						text "20 damage."
						energyCost R
						attackRequirement {}
						onAttack {
							damage 20
						}
					}
					move "Smog", {
						text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
						energyCost R, R
						attackRequirement {}
						onAttack {
							damage 20
							flip{applyAfterDamage(POISONED)}
						}
					}
				}
			case SQUIRTLE_13:
				/** return copy(Vending_S1.SQUIRTLE, this); */
				return basic (this, hp:HP050, type:WATER, retreatCost:1) {
					weakness LIGHTNING
					move "Water Power", {
						text "During your next turn, this Pokémon's Pound attack's base damage is tripled."
						energyCost W
						attackRequirement {}
						onAttack {
							increasedBaseDamageNextTurn("Pound",hp(20))
						}
					}
					move "Pound", {
						text "10 damage."
						energyCost C
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
				}
			case WARTORTLE_14:
				return evolution (this, from:"Squirtle", hp:HP070, type:WATER, retreatCost:2) {
					weakness LIGHTNING
					move "Bubble", {
						text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
						energyCost W
						attackRequirement {}
						onAttack {
							damage 10
							flip{applyAfterDamage(PARALYZED)}
						}
					}
					move "Surf", {
						text "30 damage."
						energyCost W, W
						attackRequirement {}
						onAttack {
							damage 30
						}
					}
				}
			case BULBASAUR_15:
				return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Tackle", {
						text "10 damage."
						energyCost C
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
					move "Razor Leaf", {
						text "30 damage."
						energyCost G, G
						attackRequirement {}
						onAttack {
							damage 30
						}
					}
				}
			case DIGLETT_16:
				return copy(BaseSetNG.DIGLETT, this);
			case DODUO_17:
				return copy(BaseSetNG.DODUO, this);
			case DROWZEE_18:
				return copy(BaseSetNG.DROWZEE, this);
			case JIGGLYPUFF_19:
				return copy(JungleNG.JIGGLYPUFF, this);
			case KOFFING_20:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness PSYCHIC
					move "Poison Gas", {
						text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
						energyCost G
						attackRequirement {}
						onAttack {
							damage 10
							flip(applyAfterDamage(POISONED))
						}
					}
					move "Confusion Gas", {
						text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
						energyCost G, G
						attackRequirement {}
						onAttack {
							damage 10
							flip(applyAfterDamage(CONFUSED))
						}
					}
				}
			case MACHOP_21:
				return copy(BaseSetNG.MACHOP, this);
			case MEOWTH_22:
				return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS30
					move "Bite", {
						text "10 damage."
						energyCost C
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
					move "Fury Swipes", {
						text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
						energyCost C, C
						attackRequirement {}
						onAttack {
							flip 3, {damage 10}
						}
					}
				}
					move "Vine Whip", {
						text "40 damage."
						energyCost G, G, C
						attackRequirement {}
						onAttack {
							damage 40
						}
					}
				}
			case PIKACHU_23:
				return copy(BaseSetNG.PIKACHU, this);
			case POLIWAG_24:
				return copy(BaseSetNG.POLIWAG, this);
			case SPEAROW_25:
				return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS30
					move "Peck", {
						text "10 damage."
						energyCost C
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
					move "Wing Attack", {
						text "20 damage."
						energyCost C, C
						attackRequirement {}
						onAttack {
							damage 20
						}
					}
				}
			case SQUIRTLE_26:
				return basic (this, hp:HP050, type:WATER, retreatCost:1) {
					weakness LIGHTNING
					move "BITE", {
						text "10 damage."
						energyCost W
						attackRequirement {}
						onAttack {
							damage 10
						}
					}
					move "Skull Bash", {
						text "20 damage."
						energyCost W, C
						attackRequirement {}
						onAttack {
							damage 20
						}
					}
				}
			case BILL_S_TELEPORTER_27:
				return copy(NeoGenesis.BILL_S_TELEPORTER_91, this);
			case FULL_HEAL_28:
				return copy(BaseSetNG.FULL_HEAL, this);
			case SUPER_SCOOP_UP_29:
				return basicTrainer (this) {
					text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
					onPlay {
						flip {
							def pcs = my.all.select()
							scoopUpPokemon(pcs, delegate)
						}
					}
					playRequirement{
						confirmScoopLastPokemon()
					}
				};
			case ENERGY_REMOVAL_30:
				return copy(BaseSetNG.ENERGY_REMOVAL, this);
			case GUST_OF_WIND_31:
				return copy(BaseSetNG.GUST_OF_WIND, this);
			case POTION_32:
				return copy(BaseSetNG.POTION, this);
			case SWITCH_33:
				return copy(BaseSetNG.SWITCH, this);
			}
		}
	}