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
public enum NintendoBlackStarPromos implements LogicCardInfo {

  KYOGRE_EX_1 ("Kyogre ex", 1, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  GROUDON_EX_2 ("Groudon ex", 2, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  TREECKO_3 ("Treecko", 3, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  GROVYLE_4 ("Grovyle", 4, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MUDKIP_5 ("Mudkip", 5, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  TORCHIC_6 ("Torchic", 6, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  TREECKO_7 ("Treecko", 7, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  TORCHIC_8 ("Torchic", 8, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  COMBUSKEN_9 ("Combusken", 9, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MUDKIP_10 ("Mudkip", 10, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  MARSHTOMP_11 ("Marshtomp", 11, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_12 ("Pikachu", 12, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  MEOWTH_13 ("Meowth", 13, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  LATIAS_14 ("Latias", 14, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  LATIOS_15 ("Latios", 15, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  TREECKO_16 ("Treecko", 16, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  TORCHIC_17 ("Torchic", 17, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  MUDKIP_18 ("Mudkip", 18, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  WHISMUR_19 ("Whismur", 19, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  LUDICOLO_20 ("Ludicolo", 20, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  JIRACHI_21 ("Jirachi", 21, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  BELDUM_22 ("Beldum", 22, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  METANG_23 ("Metang", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CHIMECHO_24 ("Chimecho", 24, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  FLYGON_25 ("Flygon", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  TROPICAL_WIND_26 ("Tropical Wind", 26, Rarity.RARE, [TRAINER, ITEM]),
  TROPICAL_TIDAL_WAVE_27 ("Tropical Tidal Wave", 27, Rarity.RARE, [TRAINER, ITEM]),
  CHAMPIONSHIP_ARENA_28 ("Championship Arena", 28, Rarity.RARE, [TRAINER, STADIUM]),
  CELEBI_29 ("Celebi", 29, Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  SUICUNE_30 ("Suicune", 30, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  MOLTRES_EX_31 ("Moltres ex", 31, Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  ARTICUNO_EX_32 ("Articuno ex", 32, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  ZAPDOS_EX_33 ("Zapdos ex", 33, Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  TYPHLOSION_34 ("Typhlosion", 34, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  PIKACHU_Δ_35 ("Pikachu δ", 35, Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  TROPICAL_TIDAL_WAVE_36 ("Tropical Tidal Wave", 36, Rarity.RARE, [TRAINER, ITEM]),
  KYOGRE_EX_37 ("Kyogre ex", 37, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  GROUDON_EX_38 ("Groudon ex", 38, Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  RAYQUAZA_EX_39 ("Rayquaza ex", 39, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  MEW_40 ("Mew", 40, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  NintendoBlackStarPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.NINTENDO_BLACK_STAR_PROMOS;
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
      case KYOGRE_EX_1:
      return basic (this, hp:HP120, type:W, retreatCost:3) {
        weakness L
        move "Major Flood", {
          text "60 damage. Discard a [W] Energy card attached to Kyogre ex. Does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W, W
          onAttack {
            damage 60
          }
        }
      };
      case GROUDON_EX_2:
      return basic (this, hp:HP120, type:F, retreatCost:3) {
        weakness G
        move "Major Earthquake", {
          text "80 damage. Discard a [F] Energy card attached to Groudon ex. Does 10 damage to your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, F, F
          onAttack {
            damage 80
          }
        }
      };
      case TREECKO_3:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Tail Slap", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Razor Leaf", {
          text "20 damage. "
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case GROVYLE_4:
      return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Poison Breath", {
          text "The Defending Pokémon is now Poisoned."
          energyCost C, C
          onAttack {

          }
        }
        move "Swift", {
          text "30 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost G, C, C
          onAttack {
            damage 30
          }
        }
      };
      case MUDKIP_5:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Fury Swipes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C, C
          onAttack {
            damage 10
          }
        }
      };
      case TORCHIC_6:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Peck", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Fireworks", {
          text "30 damage. Flip a coin. If tails, discard a [R] Energy card attached to Torchic."
          energyCost R, C
          onAttack {
            damage 30
          }
        }
      };
      case TREECKO_7:
      return copy (TREECKO_3, this);
      case TORCHIC_8:
      return copy (TORCHIC_6, this);
      case COMBUSKEN_9:
      return evolution (this, from:"Torchic", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "20 damage. "
          energyCost R
          onAttack {
            damage 20
          }
        }
        move "Double Kick", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C
          onAttack {
            damage 40
          }
        }
      };
      case MUDKIP_10:
      return copy (MUDKIP_5, this);
      case MARSHTOMP_11:
      return evolution (this, from:"Mudkip", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Slash", {
          text "40 damage. "
          energyCost C, C, C
          onAttack {
            damage 40
          }
        }
      };
      case PIKACHU_12:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Agility", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Pikachu during your opponent's next turn."
          energyCost C
          onAttack {

          }
        }
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 20
          }
        }
      };
      case MEOWTH_13:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Plunder", {
          text "10 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon (before they affect the damage)."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Scratch", {
          text "20 damage. "
          energyCost C, C
          onAttack {
            damage 20
          }
        }
      };
      case LATIAS_14:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness P
        move "Super Psy", {
          text "10 damage. "
          energyCost P
          onAttack {
            damage 10
          }
        }
        move "Searing Flame", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, W
          onAttack {
            damage 20
          }
        }
      };
      case LATIOS_15:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness P
        move "Super Psy", {
          text "10 damage. "
          energyCost P
          onAttack {
            damage 10
          }
        }
        move "Freeze Dry", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, P, L
          onAttack {
            damage 30
          }
        }
      };
      case TREECKO_16:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Sporadic Sponging", {
          text "10 damage. Flip a coin. If heads, remove 1 damage counter from Treecko."
          energyCost G
          onAttack {
            damage 10
          }
        }
      };
      case TORCHIC_17:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Torchic."
          energyCost R, C
          onAttack {
            damage 30
          }
        }
      };
      case MUDKIP_18:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Surf", {
          text "10 damage. "
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Whirlpool", {
          text "10 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
          energyCost W, C
          onAttack {
            damage 10
          }
        }
      };
      case WHISMUR_19:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          onAttack {

          }
        }
        move "Pound", {
          text "10 damage. "
          energyCost C
          onAttack {
            damage 10
          }
        }
      };
      case LUDICOLO_20:
      return evolution (this, from:"Lombre", hp:HP090, type:W, retreatCost:2) {
        weakness L
        pokeBody "Rain Dish", {
          text "At any time between turns, remove 1 damage counter from Ludicolo."
          delayedA {
          }
        }
        move "Fury Swipes", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost W, C, C
          onAttack {
            damage 30
          }
        }
      };
      case JIRACHI_21:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "The Third Eye", {
          text "Discard an Energy card attached to Jirachi and draw 3 cards."
          energyCost C
          onAttack {

          }
        }
        move "Psywave", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost P
          onAttack {
            damage 10
          }
        }
      };
      case BELDUM_22:
      return basic (this, hp:HP050, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokePower "Magnetic Call", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a Metal Basic Pokémon and put it onto your Bench. Shuffle your deck afterward. This power can't be used if Beldum is affected by a Special Condition."
          actionA {
          }
        }
        move "Metal Charge", {
          text "30 damage. Put 1 damage counter on Beldum."
          energyCost M, C
          onAttack {
            damage 30
          }
        }
      };
      case METANG_23:
      return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Metal Load", {
          text "Search your discard pile for a [M] Energy card and attach it to Metang."
          energyCost C
          onAttack {

          }
        }
        move "Metal Claw", {
          text "30 damage. "
          energyCost M, C
          onAttack {
            damage 30
          }
        }
      };
      case CHIMECHO_24:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Resonate", {
          text "Your opponent switches each Defending Pokémon with his or her Benched Pokémon. If your opponent has only 1 Benched Pokémon, you choose the Defending Pokémon to switch."
          energyCost C
          onAttack {

          }
        }
        move "Healing Sound", {
          text "Remove 3 damage counters from each of your Active Pokémon. Each Defending Pokémon is now Asleep."
          energyCost C, C
          onAttack {

          }
        }
      };
      case FLYGON_25:
      return evolution (this, from:"Vibrava", hp:HP120, type:C, retreatCost:2) {
        weakness C
        resistance L, MINUS30
        resistance F, MINUS30
        move "Sand Pit", {
          text "20 damage. The Defending Pokémon can't retreat until the end of your opponent's next turn."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Dragonbreath", {
          text "80 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, this attack does nothing."
          energyCost G, L, C, C
          onAttack {
            damage 80
          }
        }
      };
      case TROPICAL_WIND_26:
      return itemCard (this) {
        text "Flip a coin. If heads, remove 2 damage counters from each Active Pokémon (remove 1 damage counter if a Pokémon has only 1). If tails, each Active Pokémon is now Asleep."
        onPlay {
        }
        playRequirement{
        }
      };
      case TROPICAL_TIDAL_WAVE_27:
      return itemCard (this) {
        text "Flip a coin. If heads, discard all Trainer cards your opponent has in play. If tails, discard all Trainer cards (excluding Supporter cards) you have in play."
        onPlay {
        }
        playRequirement{
        }
      };
      case CHAMPIONSHIP_ARENA_28:
      return stadium (this) {
        text "At the end of each player's turn, if that player has 8 or more cards in his or her hand, that player discards a number of cards until the player has 7 cards left in his or her hand."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case CELEBI_29:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Leaf Slice", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost G, C
          onAttack {
            damage 20
          }
        }
      };
      case SUICUNE_30:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokemonPower "Pure Body", {
          text "Whenever you attach a [W] Energy card from your hand to Suicune, discard an Energy card attached to Suicune. (You can't attach a [W] Energy card from your hand if Suicune has no Energy cards attached.)"
          actionA {
          }
        }
        move "Hypno Wave", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage and the Defending Pokémon is now Asleep."
          energyCost W, C, C
          onAttack {
            damage 30
          }
        }
      };
      case MOLTRES_EX_31:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokeBody "Synchronized Lift", {
          text "As long as you have Articuno ex and Zapdos ex in play, the Retreat Cost for Moltres ex is 0."
          delayedA {
          }
        }
        move "Flame Gift", {
          text "10 damage. You may move a [R] Energy card attached to Moltres ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Scorching Wing", {
          text "90 damage. Discard all [R] Energy attached to Moltres ex."
          energyCost R, R, C
          onAttack {
            damage 90
          }
        }
      };
      case ARTICUNO_EX_32:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness M
        pokeBody "Synchronized Lift", {
          text "As long as you have Zapdos ex and Moltres ex in play, the Retreat Cost for Articuno ex is 0."
          delayedA {
          }
        }
        move "Ice Gift", {
          text "10 damage. You may move a [W] Energy card attached to Articuno ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Freezing Wing", {
          text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W, W, C
          onAttack {
            damage 50
          }
        }
      };
      case ZAPDOS_EX_33:
      return basic (this, hp:HP100, type:L, retreatCost:2) {
        weakness L
        pokeBody "Synchronized Lift", {
          text "As long as you have Articuno ex and Moltres ex in play, the Retreat Cost for Zapdos ex is 0."
          delayedA {
          }
        }
        move "Thunder Gift", {
          text "10 damage. You may move a [L] Energy card attached to Zapdos ex to 1 of your Pokémon."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Lightning Wing", {
          text "60 damage. Does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          onAttack {
            damage 60
          }
        }
      };
      case TYPHLOSION_34:
      return evolution (this, from:"Quilava", hp:HP110, type:R, retreatCost:1) {
        weakness W
        pokeBody "Burning Aura", {
          text "As long as Typhlosion is your Active Pokémon, put 1 damage counter on each Active Pokémon (both yours and your opponent's) between turns."
          delayedA {
          }
        }
        move "Flickering Flames", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost R
          onAttack {
            damage 20
          }
        }
        move "Rage", {
          text "50+ damage. Does 50 damage plus 10 more damage for each damage counter on Typhlosion."
          energyCost R, C, C
          onAttack {
            damage 50
          }
        }
      };
      case PIKACHU_Δ_35:
      return basic (this, hp:HP040, type:M, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          onAttack {

          }
        }
        move "Iron Tail", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost M, C
          onAttack {
            damage 20
          }
        }
      };
      case TROPICAL_TIDAL_WAVE_36:
      return copy (TROPICAL_TIDAL_WAVE_27, this);
      case KYOGRE_EX_37:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokeBody "Frenzy", {
          text "As long as your opponent has Groudon, Groudon ex, Rayquaza, or Rayquaza ex in play, Kyogre ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Aqua Supply", {
          text "30 damage. You may attach a basic Energy card from your hand to 1 of your Pokémon."
          energyCost W, C
          onAttack {
            damage 30
          }
        }
        move "Tsunami", {
          text "40 damage. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C
          onAttack {
            damage 40
          }
        }
      };
      case GROUDON_EX_38:
      return basic (this, hp:HP100, type:F, retreatCost:2) {
        weakness W
        pokeBody "Frenzy", {
          text "As long as your opponent has Kyogre, Kyogre ex, Rayquaza, or Rayquaza ex in play, Groudon ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Mix-Up", {
          text "30 damage. Flip a coin. If heads, your opponent discards the top card from his or her deck."
          energyCost F, C
          onAttack {
            damage 30
          }
        }
        move "Earthquake", {
          text "60 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          onAttack {
            damage 60
          }
        }
      };
      case RAYQUAZA_EX_39:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness C
        resistance W, MINUS30
        resistance F, MINUS30
        pokeBody "Frenzy", {
          text "As long as your opponent has Kyogre, Kyogre ex, Groudon, or Groudon ex in play, Rayquaza ex's attacks do 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Dragon Bind", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Twister", {
          text "50 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
          energyCost R, L, C
          onAttack {
            damage 50
          }
        }
      };
      case MEW_40:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psywave", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Devolution Beam", {
          text "Flip a coin. If heads, choose 1 of either player's Evolved Pokémon, remove the highest Stage Evolution card from that Pokémon, and put it into that player's hand."
          energyCost P
          onAttack {

          }
        }
      };
        default:
      return null;
    }
  }
}