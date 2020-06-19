package tcgwars.logic.impl.gen8;

import tcgwars.logic.impl.gen8.*;

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
 * @author thezipcompany@gmail.com
 */
public enum SwordShieldPromos implements LogicCardInfo {

  GROOKEY_SWSH01 ("Grookey", 1, Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  SCORBUNNY_SWSH02 ("Scorbunny", 2, Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  SOBBLE_SWSH03 ("Sobble", 3, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MEOWTH_V_SWSH04 ("Meowth V", 4, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  MEOWTH_VMAX_SWSH05 ("Meowth VMAX", 5, Rarity.PROMO, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  RILLABOOM_SWSH06 ("Rillaboom", 6, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  FROSMOTH_SWSH07 ("Frosmoth", 7, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GALARIAN_PERRSERKER_SWSH08 ("Galarian Perrserker", 8, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CINCCINO_SWSH09 ("Cinccino", 9, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GOSSIFLEUR_SWSH10 ("Gossifleur", 10, Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  WOOLOO_SWSH11 ("Wooloo", 11, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  MORPEKO_SWSH12 ("Morpeko", 12, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  GALARIAN_PONYTA_SWSH13 ("Galarian Ponyta", 13, Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  RILLABOOM_V_SWSH14 ("Rillaboom V", 14, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  CINDERACE_V_SWSH15 ("Cinderace V", 15, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  INTELEON_V_SWSH16 ("Inteleon V", 16, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  TOXTRICITY_V_SWSH17 ("Toxtricity V", 17, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ZACIAN_V_SWSH18 ("Zacian V", 18, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_SWSH19 ("Zamazenta V", 19, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  PIKACHU_SWSH20 ("Pikachu", 20, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  POLTEAGEIST_V_SWSH21 ("Polteageist V", 21, Rarity.PROMO, [POKEMON, NOT_IMPLEMENTED, BASIC, POKEMON_V, _PSYCHIC_]),
  FLAPPLE_SWSH22 ("Flapple", 22, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LUXRAY_SWSH23 ("Luxray", 23, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  COALOSSAL_SWSH24 ("Coalossal", 24, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  GARBODOR_SWSH25 ("Garbodor", 25, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  MANTINE_SWSH26 ("Mantine", 26, Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  NOCTOWL_SWSH27 ("Noctowl", 27, Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DURALUDON_SWSH28 ("Duraludon", 28, Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  RAYQUAZA_SWSH29 ("Rayquaza", 29, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  COPPERAJAH_V_SWSH30 ("Copperajah V", 30, Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  MORPEKO_SWSH31 ("Morpeko", 31, Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SNORLAX_SWSH32 ("Snorlax", 32, Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  SwordShieldPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SWORD_SHIELD_PROMOS;
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
      case GROOKEY_SWSH01:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Branch Poke", {
          text "30 damage."
          energyCost G, C
          onAttack {
            damage 30
          }
        }
      };
      case SCORBUNNY_SWSH02:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Super Singe", {
          text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 30
            flip { apply BURNED }
          }
        }
      };
      case SOBBLE_SWSH03:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Bind", {
          text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost W, C
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
      };
      case MEOWTH_V_SWSH04:
      return basic (this, hp:HP180, type:C, retreatCost:2) {
        weakness F
        move "Pay Day", {
          text "30 damage. Draw a card."
          energyCost C
          onAttack {
            damage 30
            draw 1
          }
        }
        move "Slashing Claw", {
          text "130 damage."
          energyCost C, C, C
          onAttack {
            damage 130
          }
        }
      };
      case MEOWTH_VMAX_SWSH05:
      return evolution (this, from:"Meowth V", hp:HP300, type:C, retreatCost:2) {
        weakness F
        move "G-Max Gold Rush", {
          text "200 damage. Draw 3 cards."
          energyCost C, C, C, C
          onAttack {
            damage 200
            draw 3
          }
        }
      };
      case RILLABOOM_SWSH06:
      return copy (SwordShield.RILLABOOM_14, this);
      case FROSMOTH_SWSH07:
      return copy (SwordShield.FROSMOTH_64, this);
      case GALARIAN_PERRSERKER_SWSH08:
      return copy (SwordShield.GALARIAN_PERRSERKER_128, this);
      case CINCCINO_SWSH09:
     return copy (SwordShield.CINCCINO_147, this);
      case GOSSIFLEUR_SWSH10:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Sing", {
          text "Your opponent's Active Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
      };
      case WOOLOO_SWSH11:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Defense Curl", {
          text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
          energyCost C
          onAttack {
            flip { preventAllDamageNextTurn() }
          }
        }
        move "Headbutt", {
          text "20 damage."
          onAttack {
            damage 20
          }
        }
      };
      case MORPEKO_SWSH12:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Thunder Shock", {
          text "60 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, C, C
          onAttack {
            damage 60
            flip { apply PARALYZED }
          }
        }
      };
      case GALARIAN_PONYTA_SWSH13:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Heal Pulse", {
          text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Flop", {
          text "20 damage."
          energyCost P, C
          onAttack {
            damage 20
          }
        }
      };
      case RILLABOOM_V_SWSH14:
      return copy (RebelClash.RILLABOOM_V_17, this);
      case CINDERACE_V_SWSH15:
      return copy (RebelClash.CINDERACE_V_35, this);
      case INTELEON_V_SWSH16:
      return copy (RebelClash.INTELEON_V_49, this);
      case TOXTRICITY_V_SWSH17:
      return basic (this, hp:HP210, type:L, retreatCost:2) {
        weakness F
        move "Energize", {
          text "Attach a [L] Energy card from your discard pile to this Pokémon."
          energyCost C
          attackRequirement {
            assert my.discard.filterByEnergyType(L) : "There is no [L] Energy in the discard pile."
          }
          onAttack {
            attachEnergyFrom(basic: true, type: L, my.discard, self)
          }
        }
        move "Venom Slap", {
          text "120 damage. Your opponent's Active Pokémon is now Poisoned."
          energyCost L, L, C
          onAttack {
            damage 120
            apply POISONED
          }
        }
      };
      case ZACIAN_V_SWSH18:
      return copy (SwordShield.ZACIAN_V_138, this);
      case ZAMAZENTA_V_SWSH19:
      return copy (SwordShield.ZAMAZENTA_V_139, this);
      case PIKACHU_SWSH20:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Iron Tail", {
          text "30x damage. Flip a coin until you get tails. This attack does 30 damage for each heads."
          energyCost C, C
          onAttack {
            flipUntilTails { damage 30 }
          }
        }
        move "Electro Ball", {
          text "60 damage. "
          energyCost L, L, C
          onAttack {
            damage 60
          }
        }
      };
      case POLTEAGEIST_V_SWSH21:
      return basic (this, hp:HP170, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Teapot of Surprises", {
          text "If this Pokémon is in the Active Spot and is damaged by an opponent's attack (even if it is Knocked Out), choose a random card from your opponent's hand. Your opponent reveals that card and puts it on the bottom of their deck."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              PokemonCardSet pcs = ef.attacker
              if (pcs.owner != self.owner) {
                bg.dm().each{
                  if (it.to == self && self.active && it.dmg.value) {
                    def opponent = self.owner.opposite.pbg
                    if (opponent.hand.size() > 0) {
                      bc "Teapot of Surprises activates"
                      opponent.hand.select(hidden: true, count:1).showToOpponent("Chosen card").showToMe("Teapot of Surprises: this card will be put on the bottom of your deck").moveTo(opponent.deck) //Inverted showTo effects, but should work fine now
                    }
                  }
                }
              }
            }
          }
        }
        move "Mind Bend", {
          text "100 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C, C
          onAttack {
            damage 100
            apply CONFUSED
          }
        }
      };
      case FLAPPLE_SWSH22:
      return copy (RebelClash.FLAPPLE_22, this);
      case LUXRAY_SWSH23:
      return copy (RebelClash.LUXRAY_62, this);
      case COALOSSAL_SWSH24:
      return copy (RebelClash.COALOSSAL_107, this);
      case GARBODOR_SWSH25:
      return copy (RebelClash.GARBODOR_118, this);
      case MANTINE_SWSH26:
      return copy (SwordShield.MANTINE_52, this);
      case NOCTOWL_SWSH27:
      return copy (SwordShield.NOCTOWL_144, this);
      case DURALUDON_SWSH28:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Metal Claw", {
          text "70 damage."
          energyCost M, C, C
          onAttack {
            damage 70
          }
        }
        move "Steel Beam", {
          text "150 damage. This Pokémon also does 40 damage to itself."
          energyCost M, C, C, C
          onAttack {
            damage 150
            damage 40, self
          }
        }
      };
      case RAYQUAZA_SWSH29:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Jaw Lock", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost C, C
          onAttack {
            damage 30
            cantRetreat defending
          }
        }
        move "Power Blast", {
          text "120 damage. Discard an Energy from this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 120
            discardSelfEnergy C
          }
        }
      };
      case COPPERAJAH_V_SWSH30:
      return copy (RebelClash.COPPERAJAH_V_136, this);
      case MORPEKO_SWSH31:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Famished", {
          text "Draw a card."
          energyCost C
          onAttack {
            draw 1
          }
        }
        move "Thunder Shock", {
          text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L, C
          onAttack {
            damage 40
            flip { apply PARALYZED }
          }
        }
      };
      case SNORLAX_SWSH32:
      return copy(SwordShield.SNORLAX_140, this);
        default:
      return null;
    }
  }
}