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
public enum PopSeries4 implements LogicCardInfo {
    
  CHIMECHO_DELTA_SPECIES__1 ("Chimecho (Delta Species)", 1, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  DEOXYS_Δ_2 ("Deoxys δ", 2, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  FLYGON_3 ("Flygon", 3, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MEW_4 ("Mew", 4, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  SCEPTILE_5 ("Sceptile", 5, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  COMBUSKEN_6 ("Combusken", 6, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GROVYLE_7 ("Grovyle", 7, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  HEAL_ENERGY_8 ("Heal Energy", 8, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  POKEMON_FAN_CLUB_9 ("Pokémon Fan Club", 9, Rarity.UNCOMMON, [TRAINER]),
  SCRAMBLE_ENERGY_10 ("Scramble Energy", 10, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  MUDKIP_11 ("Mudkip", 11, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PIDGEY_12 ("Pidgey", 12, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_13 ("Pikachu", 13, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SQUIRTLE_14 ("Squirtle", 14, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TREECKO_DELTA_SPECIES__15 ("Treecko (Delta Species)", 15, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOBBUFFET_16 ("Wobbuffet", 16, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DEOXYS_EX_17 ("Deoxys ex", 17, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
;
    
  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
  
  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PopSeries4(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_4;
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
      case CHIMECHO_DELTA_SPECIES__1:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
				weakness P
				move "Wrap", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						
					}
				}
				move "Sonicboom", {
					text "30 damage. This attack's damage isn't affected by Weakness or Resistance."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
			};
      case DEOXYS_Δ_2:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
				weakness P
				pokePower "Form Change", {
					text "Once during your turn (before your attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Crystal Laser", {
					text "20 damage. During your next turn, Deoxys's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case FLYGON_3:
      return evolution (this, from:"Vibrava", hp:HP120, type:F, retreatCost:2) {
				weakness W
				pokeBody "Levitate", {
					text "As long as Flygon has any Energy attached to it, the Retreat Cost for Flygon is 0."
					delayedA {
					}
				}
				move "Bite", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Sand Pit", {
					text "70 damage. The Defending Pokémon can't retreat during your opponent's next turn."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
						damage 70
					}
				}
			};
      case MEW_4:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
				weakness P
				pokeBody "Reactive Barrier", {
					text "As long as Mew has any React Energy cards attached to it, prevent all effects, excluding damage, done to Mew by attacks from your opponent's Pokémon."
					delayedA {
					}
				}
				move "Psyshock", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case SCEPTILE_5:
      return evolution (this, from:"Grovyle", hp:HP100, type:G, retreatCost:3) {
				weakness R
				resistance W, MINUS30
				pokePower "Energy Trans", {
					text "As often as you like during your turn (before your attack), move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Sceptile is affected by a Special Condition."
					actionA {
					}
				}
				move "Tail Rap", {
					text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
      case COMBUSKEN_6:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
				weakness W
				move "Smokescreen", {
					text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Sky Uppercut", {
					text "40 damage. This attack's damage isn't affected by Resistance."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 40
					}
				}
			};
      case GROVYLE_7:
      return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Quick Attack", {
					text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Blot", {
					text "20 damage. Remove 2 damage counters from Grovyle."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case HEAL_ENERGY_8:
      return specialEnergy (this, [[C]]) {
				text "Heal Energy provides Energy. When you attach this card from your hand to 1 of your Pokémon, remove 1 damage counter and all Special Conditions from that Pokémon. If Heal Energy is attached to Pokémon-ex, Heal Energy has no effect other than providing Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case POKEMON_FAN_CLUB_9:
      return basicTrainer (this) {
				text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
      case SCRAMBLE_ENERGY_10:
      return specialEnergy (this, [[C]]) {
				text "Scramble Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). Scramble Energy provides Energy. While in play, if you have more Prize cards left than your opponent, Scramble Energy provides every type of Energy but provides only 3 in any combination at a time. If the Pokémon Scramble Energy is attached to isn't an Evolved Pokémon (or evolves into Pokémon-ex), discard Scramble Energy."
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
      case MUDKIP_11:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness G
				move "Super Hypno Wave", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case PIDGEY_12:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS30
				move "Quick Attack", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case PIKACHU_13:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				move "Spark", {
					text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case SQUIRTLE_14:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
				weakness L
				pokeBody "Shell Retreat", {
					text "As long as Squirtle has any Energy cards attached to it, damage done to Squirtle by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
					delayedA {
					}
				}
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case TREECKO_DELTA_SPECIES__15:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
				weakness R
				resistance W, MINUS30
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
				move "Shining Claws", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 10
					}
				}
			};
      case WOBBUFFET_16:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
				weakness P
				move "Nap", {
					text "Remove 2 damage counters from Wobbuffet."
					energyCost C
					attackRequirement {}
					onAttack {
						
					}
				}
				move "Expand", {
					text "20 damage. During your opponent's next turn, any damage done to Wobbuffet is reduced by 20 (after applying Weakness and Resistance)."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 20
					}
				}
			};
      case DEOXYS_EX_17:
      return basic (this, hp:HP110, type:P, retreatCost:1) {
				weakness P
				pokePower "Form Change", {
					text "Once during your turn (before your attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
					actionA {
					}
				}
				move "Fastwave", {
					text "50 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 50
					}
				}
			};
        default:
      return null;
    }
  }
}