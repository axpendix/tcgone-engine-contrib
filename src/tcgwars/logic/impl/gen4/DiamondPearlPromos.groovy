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
public enum DiamondPearlPromos implements CardInfo {

	TURTWIG_& ("Turtwig", &, Rarity.PEARL, [BASIC, POKEMON, _GRASS_]),
	CHIMCHAR_& ("Chimchar", &, Rarity.PEARL, [BASIC, POKEMON, _FIRE_]),
	PIPLUP_& ("Piplup", &, Rarity.PEARL, [BASIC, POKEMON, _WATER_]),
	PACHIRISU_& ("Pachirisu", &, Rarity.PEARL, [BASIC, POKEMON, _LIGHTNING_]),
	TROPICAL_WIND_& ("Tropical Wind", &, Rarity.PEARL, [TRAINER]),
	BUNEARY_& ("Buneary", &, Rarity.PEARL, [BASIC, POKEMON, _COLORLESS_]),
	CRANIDOS_& ("Cranidos", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	SHIELDON_& ("Shieldon", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	TORTERRA_LV_X_& ("Torterra LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _GRASS_]),
	INFERNAPE_LV_X_& ("Infernape LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _FIRE_]),
	EMPOLEON_LV_X_& ("Empoleon LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _WATER_]),
	LUCARIO_LV_X_& ("Lucario LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _FIGHTING_]),
	BUIZEL_& ("Buizel", &, Rarity.PEARL, [BASIC, POKEMON, _WATER_]),
	CHATOT_& ("Chatot", &, Rarity.PEARL, [BASIC, POKEMON, _COLORLESS_]),
	SHINX_& ("Shinx", &, Rarity.PEARL, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_& ("Pikachu", &, Rarity.PEARL, [BASIC, POKEMON, _LIGHTNING_]),
	DIALGA_LV_X_& ("Dialga LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _METAL_]),
	PALKIA_LV_X_& ("Palkia LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _WATER_]),
	DARKRAI_LV_X_& ("Darkrai LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _DARKNESS_]),
	MAGMORTAR_& ("Magmortar", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	RAICHU_& ("Raichu", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MIME_JR__& ("Mime Jr.", &, Rarity.PEARL, [BASIC, POKEMON, _PSYCHIC_]),
	GLAMEOW_& ("Glameow", &, Rarity.PEARL, [BASIC, POKEMON, _COLORLESS_]),
	DARKRAI_& ("Darkrai", &, Rarity.PEARL, [BASIC, POKEMON, _DARKNESS_]),
	TROPICAL_WIND_& ("Tropical Wind", &, Rarity.PEARL, [TRAINER]),
	DIALGA_& ("Dialga", &, Rarity.PEARL, [BASIC, POKEMON, _METAL_]),
	PALKIA_& ("Palkia", &, Rarity.PEARL, [BASIC, POKEMON, _WATER_]),
	MEWTWO_LV_X_& ("Mewtwo LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _PSYCHIC_]),
	RHYPERIOR_LV_X_& ("Rhyperior LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _FIGHTING_]),
	REGIGIGAS_LV_X_& ("Regigigas LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _COLORLESS_]),
	HEATRAN_LV_X_& ("Heatran LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _FIRE_]),
	MAGNEZONE_& ("Magnezone", &, Rarity.PEARL, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
	DUSKNOIR_& ("Dusknoir", &, Rarity.PEARL, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	DRIFBLIM_& ("Drifblim", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	PORYGON_Z_& ("Porygon-Z", &, Rarity.PEARL, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	GLISCOR_& ("Gliscor", &, Rarity.PEARL, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DIALGA_LV_X_& ("Dialga LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _METAL_]),
	GIRATINA_LV_X_& ("Giratina LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _PSYCHIC_]),
	SHAYMIN_LV_X_& ("Shaymin LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _GRASS_]),
	REGIGIGAS_& ("Regigigas", &, Rarity.PEARL, [BASIC, POKEMON, _COLORLESS_]),
	TOXICROAK_G_& ("Toxicroak G", &, Rarity.PEARL, [BASIC, POKEMON, _FIGHTING_]),
	CARNIVINE_G_& ("Carnivine G", &, Rarity.PEARL, [BASIC, POKEMON, _GRASS_]),
	PROBOPASS_G_& ("Probopass G", &, Rarity.PEARL, [BASIC, POKEMON, _FIGHTING_]),
	MAGNEZONE_& ("Magnezone", &, Rarity.PEARL, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	CHARIZARD_G_LV_X_& ("Charizard G LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _FIRE_]),
	GARCHOMP_C_LV_X_& ("Garchomp C LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _COLORLESS_]),
	RAYQUAZA_C_LV_X_& ("Rayquaza C LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _COLORLESS_]),
	TROPICAL_WIND_& ("Tropical Wind", &, Rarity.PEARL, [TRAINER]),
	DIALGA_& ("Dialga", &, Rarity.PEARL, [BASIC, POKEMON, _METAL_]),
	ARCEUS_& ("Arceus", &, Rarity.PEARL, [BASIC, POKEMON, _COLORLESS_]),
	CRESSELIA_& ("Cresselia", &, Rarity.PEARL, [BASIC, POKEMON, _PSYCHIC_]),
	DARKRAI_& ("Darkrai", &, Rarity.PEARL, [BASIC, POKEMON, _DARKNESS_]),
	ARCEUS_LV_X_& ("Arceus LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _COLORLESS_]),
	BEGINNING_DOOR_& ("Beginning Door", &, Rarity.PEARL, [TRAINER]),
	ULTIMATE_ZONE_& ("Ultimate Zone", &, Rarity.PEARL, [TRAINER]),
	ARCEUS_LV_X_& ("Arceus LV.X", &, Rarity.PEARL, [POKEMON_LVX, EVOLUTION, POKEMON, _COLORLESS_]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	DiamondPearlPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.DIAMOND_PEARL_PROMOS;
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
			case TURTWIG_&:
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
			case CHIMCHAR_&:
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
			case PIPLUP_&:
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
			case PACHIRISU_&:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Minor Errand-Running", {
					text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Jolt", {
					text "20 damage. Flip a coin. If tails, Pachirisu does 10 damage to itself."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPICAL_WIND_&:
			return basicTrainer (this) {
				text "Flip a coin. If heads, remove 2 damage counters from each Active Pokémon (remove 1 damage counter if a Pokémon has only 1). If tails, each Active Pokémon is now Asleep."
				onPlay {
				}
				playRequirement{
				}
			};
			case BUNEARY_&:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Splash", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Jump Kick", {
					text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CRANIDOS_&:
			return evolution (this, from:"Skull Fossil", hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness G, PLUS20
				move "Headbutt", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Steamroll", {
					text "30 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHIELDON_&:
			return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:2) {
				weakness R, PLUS20
				resistance P, MINUS20
				move "Hard Face", {
					text "20 damage. ."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shield Attack", {
					text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TORTERRA_LV_X_&:
			return evolution (this, from:"Torterra", hp:HP160, type:GRASS, retreatCost:4) {
				weakness R, PLUS30
				pokePower "Forest Murmurs", {
					text "Once during your turn , if you have more Prize cards left than your opponent, you may choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. This power can’t be used if Torterra is affected by a Special Condition."
					actionA {
					}
				}
				move "Vigorous Dash", {
					text "100 damage. Torterra does 30 damage to itself."
					energyCost G, G, G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Torterra. Torterra LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case INFERNAPE_LV_X_&:
			return evolution (this, from:"Infernape", hp:HP120, type:FIRE, retreatCost:0) {
				weakness W, PLUS30
				pokePower "Burning Head", {
					text "Once during your turn , you may look at the top 3 cards of your deck, choose 1 of them, and put it into your hand. Discard the other 2 cards. This power can’t be used if Infernape is affected by a Special Condition."
					actionA {
					}
				}
				move "Flare Up", {
					text "150 damage. Energy cards in your discard pile.)"
					energyCost R, R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Infernape. Infernape LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case EMPOLEON_LV_X_&:
			return evolution (this, from:"Empoleon", hp:HP140, type:WATER, retreatCost:2) {
				weakness L, PLUS30
				pokePower "Supreme Command", {
					text "Once during your turn , you may choose up to 2 cards from your opponent’s hand without looking and put them face down next to the Defending Pokémon. (These cards are not in play or in your opponent’s hand.) At the end of your opponent’s next turn, return those cards to your opponent’s hand. This power can’t be used if Empoleon is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Impact", {
					text "Empoleon can’t attack during your next turn."
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Empoleon. Empoleon LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUCARIO_LV_X_&:
			return evolution (this, from:"Lucario", hp:HP110, type:FIGHTING, retreatCost:1) {
				weakness P
				pokePower "Stance", {
					text "Once during your turn , when you put Lucario LV. from your hand onto your Active Lucario, you may use this power. Prevent all effects of an attack, including damage, done to Lucario during your opponent’s next turn. (If Lucario is no longer your Active Pokémon, this effect ends.)"
					actionA {
					}
				}
				move "Close Combat", {
					text "80 damage. ."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Lucario. Lucario LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BUIZEL_&:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				move "Splash About", {
					text "10+ damage. If Buizel has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHATOT_&:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness L, PLUS10
				resistance F, MINUS20
				move "Me First", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tone-Deaf", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHINX_&:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Spark", {
					text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_&:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				pokePower "Electro Recycle", {
					text "Once during your turn , if Pichu is anywhere under Pikachu, you may search your discard pile for a Energy card, show it to your opponent, and put it into your hand. This power can’t be used if Pikachu is affecte by a Special Condition."
					actionA {
					}
				}
				move "BikaBika", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIALGA_LV_X_&:
			return evolution (this, from:"Dialga", hp:HP110, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				pokePower "Time Skip", {
					text "Once during your turn , you may have your opponent flip 2 coins. If both of them are heads, your turn ends. If both of them are tails, after your opponent draws a card at the beginning of his or her next turn, his or her turn ends. This power can’t be used if Dialga is affected by a Special Condition."
					actionA {
					}
				}
				move "Metal Flash", {
					text "80 damage. During your next turn, Dialga can’t use Metal Flash."
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Dialga. Dialga LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PALKIA_LV_X_&:
			return evolution (this, from:"Palkia", hp:HP120, type:WATER, retreatCost:3) {
				weakness L
				pokePower "Restructure", {
					text "Once during your turn , you may have your opponent switch 1 of your Active Pokémon with 1 of your Bench Pokémon. Then, you switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. This power can’t be used if Palkia is affected by a Special Condition."
					actionA {
					}
				}
				move "Hydro Reflect", {
					text "60 damage. You may move all Energy cards attached to Palkia to your Benched Pokémon in any way you like (Ignore this effect if you don’t have any Benched Pokémon.)"
					energyCost W, W, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Palkia. Palkia LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_LV_X_&:
			return evolution (this, from:"Darkrai", hp:HP100, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				pokeBody "Dark Shadow", {
					text "Each basic Energy card attached to your Pokémon now has the effect “If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon .” You can’t use more than 1 Dark Shadow Poké-Body each turn."
					delayedA {
					}
				}
				move "Endless Darkness", {
					text "40 damage. The Defending Pokémon is now Asleep. Flip 2 coins instead of 1 between turns. If either of this is tails, the Defending Pokémon is still Asleep. If both of them are tails, the Defending Pokémon is Knocked Out."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Darkrai. Darkrai LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGMORTAR_&:
			return evolution (this, from:"Magmar", hp:HP100, type:FIRE, retreatCost:3) {
				weakness W, PLUS30
				move "Smoke Bomb", {
					text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flame Drum", {
					text "80 damage. If Magby isn’t anywhere under Magmortar, discard 2 Energy cards from your hand. (If you can’t discard 2 Energy cards from your hand, this attack does nothing.)"
					energyCost R, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU_&:
			return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Electromagnetic Induction", {
					text "Energy cards and attach them to 1 of your Pokémon. Shuffle your deck afterward."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Explosive Thunder", {
					text "30× damage. Energy cards you discarded."
					energyCost L, C, L, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MIME_JR__&:
			return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Mr. Mime from your hand onto Mime Jr. (this counts as evolving Mime Jr.) and remove all damage counters from Mime Jr."
					actionA {
					}
				}
				move "Mime", {
					text "Shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLAMEOW_&:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Charm", {
					text "."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pose", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_&:
			return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "", {
					text "If damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spacial Rend", {
					text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Roar of Time", {
					text "80 damage. Search your discard pile for 3 Pokémon, show them to your opponent, and put them on top of your deck. Shuffle your deck afterward. (If you don’t have 3 Pokémon in your discard pile, this attack does nothing.)"
					energyCost M, M, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPICAL_WIND_&:
			return copy (TROPICAL_WIND_&, this)
			/*basicTrainer (this) {
				text "Flip a coin. If heads, remove 2 damage counters from each Active Pokémon (remove 1 damage counter if a Pokémon has only 1). If tails, each Active Pokémon is now Asleep."
				onPlay {
				}
				playRequirement{
				}
			}*/;
			case DIALGA_&:
			return basic (this, hp:HP090, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Time Bellow", {
					text "10 damage. "
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flash Cannon", {
					text "40 damage. You may return all Energy cards attached to Dialga to your hand. If you do, remove the highest Stage Evolution card from the Defending Pokémon and shuffle that card into your opponent’s deck."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PALKIA_&:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness L, PLUS20
				move "Spacial Rend", {
					text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Transback", {
					text "40 damage. You may flip a coin. If heads, discard all Energy attached to Palkia and put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MEWTWO_LV_X_&:
			return evolution (this, from:"Mewtwo", hp:HP120, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokeBody "Psybarrier", {
					text "Prevent all effects of attacks, including damage, done to Mewtwo by your opponent’s Pokémon that isn’t an Evolved Pokémon."
					delayedA {
					}
				}
				move "Giga Burn", {
					text "120 damage. Discard all Energy attached to Mewtwo."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Mewtwo. Mewtwo LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RHYPERIOR_LV_X_&:
			return evolution (this, from:"Rhyperior", hp:HP170, type:FIGHTING, retreatCost:4) {
				weakness W
				resistance L, MINUS20
				move "Hard Crush", {
					text "50× damage. Discard the top 5 cards from your deck. This attack does 50 damage for each Energy card you discarded."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Upthrow", {
					text "60 damage. Energy cards, show them to your opponent, and shuffle them into your deck."
					energyCost F, F, C, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Rhyperior. Rhyperior LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case REGIGIGAS_LV_X_&:
			return evolution (this, from:"Regigigas", hp:HP150, type:COLORLESS, retreatCost:4) {
				weakness F
				pokePower "Sacrifice", {
					text "Once during your turn , you may choose 1 of your Pokémon and that Pokémon is Knocked Out. Then, search your discard pile for up to 2 basic Energy cards, attach them to Regigigas, and remove 8 damage counters from Regigigas. This power can’t be used if Regigigas is affected by a Special Condition."
					actionA {
					}
				}
				move "Giga Blaster", {
					text "100 damage. Discard the top card from your opponent’s deck. Then, choose 1 card from your opponent’s hand without looking and discard it. Regigigas can’t use Giga Blaster during your next turn."
					energyCost W, F, M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Regigigas. Regigigas LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HEATRAN_LV_X_&:
			return evolution (this, from:"Heatran", hp:HP120, type:FIRE, retreatCost:4) {
				weakness W
				pokeBody "Heat Metal", {
					text "Your opponent can’t remove the Special Condition Burned by evolving or devolving his or her Burned Pokémon. (This also includes putting a Pokémon Level-Up card onto the Burned Pokémon.) Whenever your opponent flips a coin for the Special Condition Burned between turns, treat it as tails."
					delayedA {
					}
				}
				pokePower "Heat Wave", {
					text "Once at the end of your turn, if Heatran is on your Bench, you may use this power. If you discarded basic Energy cards attached to your or Active Pokémon by that Pokémon’s attack this turn, attach up to 2 of those Energy cards to that Pokémon."
					actionA {
					}
				}
				move "", {
					text "Put this card onto your Active Heatran. Heatran LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEZONE_&:
			return evolution (this, from:"Magneton", hp:HP130, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Mirror Shot", {
					text "40 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnet Slash", {
					text "100 damage. Energy attached to Magnezone."
					energyCost L, M, C, C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DUSKNOIR_&:
			return evolution (this, from:"Dusclops", hp:HP130, type:PSYCHIC, retreatCost:2) {
				weakness D, PLUS30
				resistance C, MINUS20
				pokePower "Dark Hide", {
					text "Once during your turn , you may flip a coin. If heads, look at your opponent’s hand, choose a Pokémon you find there, and put it on the bottom of his or her deck. This power can’t be used if Dusknoir is affected by a Special Condition."
					actionA {
					}
				}
				move "Reaper Pulse", {
					text "70 damage. Move up to 2 damage counters from Dusknoir to 1 of your opponent’s Benched Pokémon."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DRIFBLIM_&:
			return evolution (this, from:"Drifloon", hp:HP080, type:PSYCHIC, retreatCost:0) {
				weakness D
				resistance C, MINUS20
				move "Wind Wave", {
					text "Search your discard pile for up to 5 in any combination of Pokémon and Supporter cards. Show them to your opponent and shuffle them into your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Explosive Smoke", {
					text "60 damage. ."
					energyCost P, P, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_Z_&:
			return evolution (this, from:"Porygon2", hp:HP120, type:COLORLESS, retreatCost:2) {
				weakness F, PLUS30
				pokePower "Install", {
					text "As often as you like during your turn , move a Technical Machine card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Porygon-Z is affected by a Special Condition."
					actionA {
					}
				}
				move "Learning", {
					text "that levels up from 1 of your Pokémon, and put it onto that Pokémon. (This counts as leveling up that Pokémon.) Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Overload", {
					text "40+ damage. Does 40 damage plus 20 more damage for each Technical Machine card attached to Porygon-Z."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLISCOR_&:
			return evolution (this, from:"Gligar", hp:HP090, type:FIGHTING, retreatCost:0) {
				weakness W, PLUS20
				resistance F, MINUS20
				pokeBody "Blind Eye", {
					text "As long as Gliscor is your Active Pokémon, your opponent can’t remove any Special Conditions by evolving or devolving his or her Pokémon. (This also including putting a Pokémon Level-Up card onto that Pokémon.)"
					delayedA {
					}
				}
				move "Cutting Turn", {
					text "Flip a coin. If heads, put damage counters on the Defending Pokémon until it is 10HP away from being Knocked Out. If you do, shuffle Gliscor and all cards attached to it back into your deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Friction Heat", {
					text "20 damage. The Defending Pokémon is now Burned."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DIALGA_LV_X_&:
			return evolution (this, from:"Dialga", hp:HP110, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				pokePower "Time Skip", {
					text "Once during your turn , you may have your opponent flip 2 coins. If both of them are heads, your turn ends. If both of them are tails, after your opponent draws a card at the beginning of his or her next turn, his of her turn ends. This power can’t be used if Dialga is affected by a Special Condition."
					actionA {
					}
				}
				move "Metal Flash", {
					text "80 damage. During your next turn, Dialga can’t use Metal Flash."
					energyCost M, M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Dialga. Dialga LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GIRATINA_LV_X_&:
			return evolution (this, from:"Giratina", hp:HP130, type:PSYCHIC, retreatCost:3) {
				weakness D
				resistance C, MINUS20
				pokeBody "Invisible Tentacles", {
					text "Whenever your opponent’s Pokémon tries to attack, your opponent discards 1 card from his or her hand. (If your opponent can’t discard 1 card, your opponent’s Pokémon can’t attack.) You can’t use more than 1 Invisible Tentacles Poké-Body each turn."
					delayedA {
					}
				}
				move "Darkness Lost", {
					text "If any of your opponent’s Pokémon would be Knocked Out by damage from this attack, put that Pokémon and all cards attached to it in the Lost Zone instead of discarding it."
					energyCost P, P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Giratina. Giratina LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHAYMIN_LV_X_&:
			return evolution (this, from:"Shaymin", hp:HP110, type:GRASS, retreatCost:0) {
				weakness R
				resistance F, MINUS20
				pokeBody "Revenge Seed", {
					text "If any of your Pokémon were Knocked Out by damage from an opponent’s attack during his or her last turn, each of Shaymin’s attack does 60 more damage to the Active Pokémon ."
					delayedA {
					}
				}
				move "Energy Flare", {
					text "50 damage. You may move any number of Energy cards attached to your Pokémon to your other Pokémon is any way you like."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Shaymin. Shaymin LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case REGIGIGAS_&:
			return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
				weakness F
				move "Drag Off", {
					text "30 damage. Before doing damage, you may choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Giga Hammer", {
					text "80 damage. Regigigas can’t use Giga Hammer during your next turn."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOXICROAK_G_&:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
				weakness P
				pokePower "Leap Away", {
					text "Once during your turn , if Toxicroak is your Active Pokémon, you may flip a coin. If heads, return Toxicroak and all cards attached to it to your hand. This power can’t be used if Toxicroak is affected by a Special Condition."
					actionA {
					}
				}
				move "Poison Revenge", {
					text "20+ damage. If any of your Pokémon were Knocked Out by damage from an opponent’s attack during his of her last turn, this attack does 20 damage plus 40 more damage and the Defending Pokémon is now Poisoned."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CARNIVINE_G_&:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				resistance W, MINUS20
				move "Power Whip", {
					text "to that Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Grass Knot", {
					text "20+ damage. Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PROBOPASS_G_&:
			return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
				weakness W
				move "Nose Unit", {
					text "This attack does 20 damage to each of your opponent’s Pokémon that has any Poké-Bodies."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Loud Snort", {
					text "70 damage. ‘s Retreat Cost is 0 until the end of your next turn."
					energyCost M, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAGNEZONE_&:
			return evolution (this, from:"Magneton", hp:HP130, type:LIGHTNING, retreatCost:2) {
				weakness F
				resistance M, MINUS20
				move "Charge Beam", {
					text "30 damage. Search your discard pile for an Energy card and attach it to Magnezone."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Metallic Bolt", {
					text "60 damage. Energy attached to Magnezone. If you do, this attack’s base damage is 120 instead of 60."
					energyCost L, M, C, C, L, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARIZARD_G_LV_X_&:
			return evolution (this, from:"Charizard G", hp:HP120, type:FIRE, retreatCost:3) {
				weakness W
				resistance F, MINUS20
				pokePower "Call for Power", {
					text "As often as you like during your turn , you may move an Energy attached to 1 of your Pokémon to Charizard . This power can’t be used if Charizard is affected by a Special Condition."
					actionA {
					}
				}
				move "Malevolent Fire", {
					text "150 damage. ."
					energyCost R, R, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Charizard . Charizard LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GARCHOMP_C_LV_X_&:
			return evolution (this, from:"Garchomp C", hp:HP110, type:COLORLESS, retreatCost:0) {
				weakness C
				pokePower "Healing Breath", {
					text "Once during your turn , when you put Garchomp LV. from your hand onto your Active Garchomp , you may remove all damage counters from each of your Pokémon ."
					actionA {
					}
				}
				move "Dragon Rush", {
					text "can’t use Dragon Rush during your next turn."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Garchomp . Garchomp LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAYQUAZA_C_LV_X_&:
			return evolution (this, from:"Rayquaza C", hp:HP120, type:COLORLESS, retreatCost:3) {
				weakness C
				resistance F, MINUS20
				pokeBody "Dragon Spirit", {
					text "If Rayquaza is your Active Pokémon and is damaged but not Knocked Out by an opponent’s attack, you may search your discard pile for an Energy card and attach it to Rayquaza ."
					delayedA {
					}
				}
				move "Final Blowup", {
					text "200 damage. . Ignore this effect if you have no cards in your hand."
					energyCost W, P, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Rayquaza . Rayquaza LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TROPICAL_WIND_&:
			return copy (TROPICAL_WIND_&, this)
			/*basicTrainer (this) {
				text "Flip a coin. If heads, remove 2 damage counters from each Active Pokémon (remove 1 damage counter if a Pokémon has only 1). If tails, each Active Pokémon is now Asleep."
				onPlay {
				}
				playRequirement{
				}
			}*/;
			case DIALGA_&:
			return basic (this, hp:HP100, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Time Call", {
					text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Time Wager", {
					text "100 damage. Flip 2 coins. If either of them is tails, this attack’s base damage is 50 instead of 100."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_&:
			return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
				weakness F
				move "Judgement", {
					text "80 damage. Discard all Energy cards attached to Arceus and this attack does 10 damage to each of your opponent’s Benched Pokémon."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CRESSELIA_&:
			return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
				weakness P
				pokeBody "Lunar Aura", {
					text "If you have Darkrai in play, remove 1 damage counter from Cresselia between turns."
					delayedA {
					}
				}
				move "Lunar Flight", {
					text "80- damage. Does 80 damage minus 10 damage for each damage counter on Cresselia."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case DARKRAI_&:
			return basic (this, hp:HP090, type:DARKNESS, retreatCost:2) {
				weakness F
				resistance P, MINUS20
				pokeBody "Darkness Aura", {
					text "If you have Cresselia in play, each of Darkrai’s attack does 20 more damage to the Defending Pokémon ."
					delayedA {
					}
				}
				move "Hypnoblast", {
					text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_LV_X_&:
			return evolution (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
				pokeBody "Multitype", {
					text "Arceus LV.‘s type is the same type as its previous Level."
					delayedA {
					}
				}
				pokeBody "Omniscient", {
					text "Arceus can use the attacks of all Arceus you have in play as its own."
					delayedA {
					}
				}
				move "", {
					text "You may have as many of this card in your deck as you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Arceus. Arceus LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEGINNING_DOOR_&:
			return basicTrainer (this) {
				text "Search your deck for Arceus, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case ULTIMATE_ZONE_&:
			return basicTrainer (this) {
				text "During each player’s turn, the player may move an Energy card attached to 1 of his or her Benched Pokémon to his or her Active Arceus as often as he or she likes.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
				}
				playRequirement{
				}
			};
			case ARCEUS_LV_X_&:
			return evolution (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
				pokeBody "Multitype", {
					text "Arceus LV.‘s type is the same as its previous Level."
					delayedA {
					}
				}
				move "", {
					text "You may have as many of this card in your deck as you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Meteor Blast", {
					text "100 damage. Flip a coin. If tails, this attack’s base damage is 50 instead of 100."
					energyCost G, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Arceus. Arceus LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
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
