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
public enum PopSeries8 implements CardInfo {

	HEATRAN_1 ("Heatran", 1, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
	LUCARIO_2 ("Lucario", 2, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	LUXRAY_3 ("Luxray", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	PROBOPASS_4 ("Probopass", 4, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	YANMEGA_5 ("Yanmega", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	CHERRIM_6 ("Cherrim", 6, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	CARNIVINE_7 ("Carnivine", 7, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
	LUXIO_8 ("Luxio", 8, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	NIGHT_MAINTENANCE_9 ("Night Maintenance", 9, Rarity.UNCOMMON, [TRAINER]),
	RARE_CANDY_10 ("Rare Candy", 10, Rarity.UNCOMMON, [TRAINER]),
	ROSEANNE_S_RESEARCH_11 ("Roseanne's Research", 11, Rarity.UNCOMMON, [TRAINER]),
	CHIMCHAR_12 ("Chimchar", 12, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	CROAGUNK_13 ("Croagunk", 13, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	HAPPINY_14 ("Happiny", 14, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	PIPLUP_15 ("Piplup", 15, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	RIOLU_16 ("Riolu", 16, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	TURTWIG_17 ("Turtwig", 17, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	PopSeries8(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.POP_SERIES_8;
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
			case HEATRAN_1:
			return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
				weakness W, PLUS30
				move "Body Slam", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Spin", {
					text "90 damage. Discard 2 Basic Energy cards attached to Heatran. (If you can’t discard cards, this attack does nothing."
					energyCost R, R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUCARIO_2:
			return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness P, PLUS20
				move "Blocking Punch", {
					text "40 damage. During your opponent’s next turn, any damage done to Lucario by attacks is reduced by 20 (after Weakness and Resistance)."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Striking Kick", {
					text "60 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon"
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXRAY_3:
			return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS30
				resistance M, MINUS20
				pokeBody "Intimidating Fang", {
					text "As long as Luxray is your Active Pokémon, any damage done by an opponent’s attack is reduced by 10 ."
					delayedA {
					}
				}
				move "Thunder", {
					text "120 damage. Flip a coin. If tails, Luxray does 40 damage to itself."
					energyCost L, L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PROBOPASS_4:
			return evolution (this, from:"Nosepass", hp:HP090, type:METAL, retreatCost:3) {
				weakness R, PLUS30
				resistance P, MINUS20
				move "Rock Slide", {
					text "20 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Triple Nose", {
					text "50+ damage. Flip 3 coins. This attack does 50 damage plus 20 more damage for each heads."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case YANMEGA_5:
			return evolution (this, from:"Yanma", hp:HP090, type:GRASS, retreatCost:0) {
				weakness L, PLUS20
				resistance F, MINUS20
				move "Supersonic", {
					text "Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Air Slash", {
					text "70 damage. Flip a coin. If tails, discard an Energy attached to Yanmega."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHERRIM_6:
			return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:2) {
				weakness R, PLUS20
				resistance W, MINUS20
				move "Worry Seed", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magical Leaf", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage and remove 3 damage counters from Cherrim."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARNIVINE_7:
			return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				resistance W, MINUS20
				move "Swallow Up", {
					text "30 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Carnivine. If the Defending Pokémon has fewer remaining HP than Carnivine’s, this attack does 60 damage instead."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wring Out", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXIO_8:
			return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Fasten Claw", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Fang", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NIGHT_MAINTENANCE_9:
			return basicTrainer (this) {
				text "Search your discard pile for up to 3 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case RARE_CANDY_10:
			return basicTrainer (this) {
				text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolves from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.)"
				onPlay {
				}
				playRequirement{
				}
			};
			case ROSEANNE_S_RESEARCH_11:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 2 in any combination of Basic Pokémon and basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case CHIMCHAR_12:
			return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				move "Scratch", {
					text "10 damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Ember", {
					text "30 damage. Energy attached to Chimchar."
					energyCost R, C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CROAGUNK_13:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				move "Ghastly Sound", {
					text "Flip a coin. If heads, your opponent can’t play any Supporter cards from his or her hand during his or her next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Finger Poke", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
					energyCost P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HAPPINY_14:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Chansey from your hand onto Happiny (this counts as evolving Happiny) and remove all damage counters from Happiny."
					actionA {
					}
				}
				move "Lively", {
					text "Remove 2 damage counters from 1 of your Pokémon."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIPLUP_15:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Peck", {
					text "10 damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Water Splash", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RIOLU_16:
			return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
				weakness P, PLUS10
				pokeBody "Inner Focus", {
					text "Riolu can’t be Paralyzed."
					delayedA {
					}
				}
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost F
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
				move "Tackle", {
					text "10 damage. "
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Razor Leaf", {
					text "20 damage. "
					energyCost G
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
