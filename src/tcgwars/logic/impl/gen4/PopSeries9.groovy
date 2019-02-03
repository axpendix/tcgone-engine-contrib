package tcgwars.logic.impl.gen;

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
public enum PopSeries9 implements CardInfo {

	GARCHOMP_1 ("Garchomp", 1, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	MANAPHY_2 ("Manaphy", 2, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
	RAICHU_3 ("Raichu", 3, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	REGIGIGAS_4 ("Regigigas", 4, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	ROTOM_5 ("Rotom", 5, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	BUIZEL_6 ("Buizel", 6, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
	CROAGUNK_7 ("Croagunk", 7, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GABITE_8 ("Gabite", 8, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	LOPUNNY_9 ("Lopunny", 9, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	PACHIRISU_10 ("Pachirisu", 10, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PICHU_11 ("Pichu", 11, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
	BUNEARY_12 ("Buneary", 12, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	CHIMCHAR_13 ("Chimchar", 13, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	GIBLE_14 ("Gible", 14, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PIKACHU_15 ("Pikachu", 15, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIPLUP_16 ("Piplup", 16, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	TURTWIG_17 ("Turtwig", 17, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	PopSeries9(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.POP_SERIES_9;
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
			case GARCHOMP_1:
			return evolution (this, from:"Gabite", hp:HP130, type:COLORLESS, retreatCost:0) {
				weakness C, PLUS30
				move "Dragon Rage", {
					text "80 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Jet Sword", {
					text "100 damage. Discard 2 Energy attached to Garchomp and this attack does 10 damage to each of your opponent’s Benched Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANAPHY_2:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness L, PLUS20
				move "Dive", {
					text "Look at the top 7 cards of your deck, choose 1 of them, and put it into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Water Glow", {
					text "Remove from Manaphy the number of damage counters equal to the damage you did to that Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU_3:
			return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Slam", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "High Volt", {
					text "60 damage. If Raichu evolved from Pikachu during this turn, this attack’s base damage is 100 instead of 60."
					energyCost L, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case REGIGIGAS_4:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
				weakness F
				move "Body Slam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Stomp", {
					text "50+ damage. Flip 2 coins. This attack does 50 damage plus 20 damage for heads."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ROTOM_5:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokePower "Type Shift", {
					text "Once during your turn (before your attack, you may use this power. Rotom’s type is until the end of your turn."
					actionA {
					}
				}
				move "Poltergeist", {
					text "30+ damage. Look at your opponent’s hand. This attack does 30 damage plus 10 more damage for each Trainer, Supporter, and Stadium card in your opponent’s hand."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BUIZEL_6:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Whirlpool", {
					text "Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Fast", {
					text "30 damage. If you have Pachirisu in play, flip a coin. If heads, prevent all effects of an attack, including damage, done to Buizel during your opponent’s next turn."
					energyCost W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CROAGUNK_7:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS10
				move "Knock Off", {
					text "Flip a coin. If heads, choose 1 card from your opponent’s hand without looking and discard it."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Nimble", {
					text "30 damage. If you have Turtwig in play, remove from Croagunk the number of damage counters equal to the damage you did to the Defending Pokémon."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GABITE_8:
			return evolution (this, from:"Gible", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS20
				move "Burrow", {
					text "Flip a coin. If heads, prevent all damage done to Gabite by attacks during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Distored Wave", {
					text "60 damage. Before doing damage, remove 2 damage counters from the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOPUNNY_9:
			return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				move "Jump Kick", {
					text "20 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Jazzed", {
					text "50 damage. If Lopunny evolved from Buneary during this turn, remove all damage counters from Lopunny."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PACHIRISU_10:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Thunder Wave", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Berry", {
					text "20+ damage. If you have Croagunk in play, this attack does 20 damage plus 20 more damage and the Defending Pokémon is now Poisoned."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PICHU_11:
			return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
					actionA {
					}
				}
				move "Find a Friend", {
					text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BUNEARY_12:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Dizzy Punch", {
					text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Defense Curl", {
					text "Flip a coin. If heads, prevent all damage done to Buneary by attacks during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHIMCHAR_13:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				move "Serial Swipes", {
					text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sleepy", {
					text "40+ damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GIBLE_14:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS10
				move "Push Down", {
					text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_15:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Growl", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Numb", {
					text "30 damage. If Pikachu evolved from Pichu during this turn, the Defending Pokémon is now Paralyzed."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIPLUP_16:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Water Sport", {
					text "10+ damage. If Piplup has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus more 10 more damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wavelet", {
					text "40 damage. If you have Buizel in play, this attack does 10 damage to each of your opponent’s Benched Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TURTWIG_17:
			return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Absorb", {
					text "10 damage. Remove 1 damage counter from Turtwig."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Parboil", {
					text "40+ damage. If you have Chimchar in play, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Burned."
					energyCost G, C, C
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
