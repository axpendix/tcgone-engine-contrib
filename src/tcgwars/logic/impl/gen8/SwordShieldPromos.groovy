package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author thezipcompany@gmail.com
 */
public enum SwordShieldPromos implements LogicCardInfo {

  GROOKEY_SWSH01 ("Grookey", "SWSH001", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  SCORBUNNY_SWSH02 ("Scorbunny", "SWSH002", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  SOBBLE_SWSH03 ("Sobble", "SWSH003", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  MEOWTH_V_SWSH04 ("Meowth V", "SWSH004", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  MEOWTH_VMAX_SWSH05 ("Meowth VMAX", "SWSH005", Rarity.PROMO, [POKEMON, EVOLUTION, VMAX, _COLORLESS_]),
  RILLABOOM_SWSH06 ("Rillaboom", "SWSH006", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  FROSMOTH_SWSH07 ("Frosmoth", "SWSH007", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GALARIAN_PERRSERKER_SWSH08 ("Galarian Perrserker", "SWSH008", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  CINCCINO_SWSH09 ("Cinccino", "SWSH009", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GOSSIFLEUR_SWSH10 ("Gossifleur", "SWSH010", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  WOOLOO_SWSH11 ("Wooloo", "SWSH011", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  MORPEKO_SWSH12 ("Morpeko", "SWSH012", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  GALARIAN_PONYTA_SWSH13 ("Galarian Ponyta", "SWSH013", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  RILLABOOM_V_SWSH14 ("Rillaboom V", "SWSH014", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  CINDERACE_V_SWSH15 ("Cinderace V", "SWSH015", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  INTELEON_V_SWSH16 ("Inteleon V", "SWSH016", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  TOXTRICITY_V_SWSH17 ("Toxtricity V", "SWSH017", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ZACIAN_V_SWSH18 ("Zacian V", "SWSH018", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_SWSH19 ("Zamazenta V", "SWSH019", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  PIKACHU_SWSH20 ("Pikachu", "SWSH020", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  POLTEAGEIST_V_SWSH21 ("Polteageist V", "SWSH021", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  FLAPPLE_SWSH22 ("Flapple", "SWSH022", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LUXRAY_SWSH23 ("Luxray", "SWSH023", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  COALOSSAL_SWSH24 ("Coalossal", "SWSH024", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  GARBODOR_SWSH25 ("Garbodor", "SWSH025", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  MANTINE_SWSH26 ("Mantine", "SWSH026", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  NOCTOWL_SWSH27 ("Noctowl", "SWSH027", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DURALUDON_SWSH28 ("Duraludon", "SWSH028", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  RAYQUAZA_SWSH29 ("Rayquaza", "SWSH029", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  COPPERAJAH_V_SWSH30 ("Copperajah V", "SWSH030", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  MORPEKO_SWSH31 ("Morpeko", "SWSH031", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SNORLAX_SWSH32 ("Snorlax", "SWSH032", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  ZACIAN_SWSH33 ("Zacian", "SWSH033", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  ZAMAZENTA_SWSH34 ("Zamazenta", "SWSH034", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  DECIDUEYE_SWSH35 ("Decidueye", "SWSH035", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ARCTOZOLT_SWSH36 ("Arctozolt", "SWSH036", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  HYDREIGON_SWSH37 ("Hydreigon", "SWSH037", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  KANGASKHAN_SWSH38 ("Kangaskhan", "SWSH038", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_SWSH39 ("Pikachu", "SWSH039", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  HATENNA_SWSH40 ("Hatenna", "SWSH040", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  FLAREON_SWSH41 ("Flareon", "SWSH041", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  EEVEE_SWSH42 ("Eevee", "SWSH042", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  GALARIAN_SIRFETCH_D_V_SWSH43 ("Galarian Sirfetch'd V", "SWSH043", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  ETERNATUS_V_SWSH44 ("Eternatus V", "SWSH044", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  ETERNATUS_VMAX_SWSH45 ("Eternatus VMAX", "SWSH045", Rarity.PROMO, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  ELDEGOSS_SWSH46 ("Eldegoss", "SWSH046", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DREDNAW_SWSH47 ("Drednaw", "SWSH047", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CENTISKORCH_SWSH48 ("Centiskorch", "SWSH048", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  DUBWOOL_V_SWSH49 ("Dubwool V", "SWSH049", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  CHARIZARD_V_SWSH50 ("Charizard V", "SWSH050", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  LAPRAS_SWSH51 ("Lapras", "SWSH051", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  GENGAR_SWSH52 ("Gengar", "SWSH052", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  MACHAMP_SWSH53 ("Machamp", "SWSH053", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  COALOSSAL_SWSH54 ("Coalossal", "SWSH054", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  HATTERENE_V_SWSH55 ("Hatterene V", "SWSH055", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  MORPEKO_V_SWSH56 ("Morpeko V", "SWSH056", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  GRIMMSNARL_V_SWSH57 ("Grimmsnarl V", "SWSH057", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  ALCREMIE_SWSH58 ("Alcremie", "SWSH058", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_OBSTAGOON_SWSH59 ("Galarian Obstagoon", "SWSH059", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  DURALUDON_SWSH60 ("Duraludon", "SWSH060", Rarity.PROMO, [POKEMON, BASIC, _METAL_]),
  PIKACHU_V_SWSH63 ("Pikachu V", "SWSH063", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ETERNATUS_V_SWSH64 ("Eternatus V", "SWSH064", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  EEVEE_V_SWSH65 ("Eevee V", "SWSH065", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  CHARIZARD_SWSH66 ("Charizard", "SWSH066", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  DONPHAN_SWSH67 ("Donphan", "SWSH067", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SNORLAX_SWSH68 ("Snorlax", "SWSH068", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  LUGIA_SWSH69 ("Lugia", "SWSH069", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  GROOKEY_SWSH70 ("Grookey", "SWSH070", Rarity.PROMO, [POKEMON, BASIC, _GRASS_]),
  SCORBUNNY_SWSH71 ("Scorbunny", "SWSH071", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  VAPOREON_SWSH72 ("Vaporeon", "SWSH072", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SOBBLE_SWSH73 ("Sobble", "SWSH073", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  SPECIAL_DELIVERY_PIKACHU_SWSH74 ("Special Delivery Pikachu", "SWSH074", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  SPECIAL_DELIVERY_CHARIZARD_SWSH75 ("Special Delivery Charizard", "SWSH075", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  ZACIAN_V_SWSH76 ("Zacian V", "SWSH076", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ZAMAZENTA_V_SWSH77 ("Zamazenta V", "SWSH077", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  ORBEETLE_V_SWSH78 ("Orbeetle V", "SWSH078", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _GRASS_]),

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SwordShieldPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
          text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 10
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
            discardSelfEnergyAfterDamage C
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
      return copy (SwordShield.SNORLAX_140, this);
      case ZACIAN_SWSH33:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Crunch", {
          text "60 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost C, C, C
          onAttack {
            damage 60
            flip{ discardDefendingEnergyAfterDamage() }
          }
        }
        move "Metal Blade", {
          text "190 damage. Discard 3 Energy from this Pokémon."
          energyCost M, M, M, C
          onAttack {
            damage 190
            afterDamage{
              discardSelfEnergyAfterDamage(C,C,C)
            }
          }
        }
      };
      case ZAMAZENTA_SWSH34:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        bwAbility "Sturdy Shield", {
          text "This Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to==self && it.dmg.value && it.notNoEffect){
                  bc "Sturdy Shield -20"
                  it.dmg -= hp(20)
                }
              }
            }
          }
        }
        move "Headbang", {
          text "130 damage."
          energyCost M, M, M, C
          onAttack {
            damage 130
          }
        }
      };
      case DECIDUEYE_SWSH35:
      return copy (DarknessAblaze.DECIDUEYE_13, this);
      case ARCTOZOLT_SWSH36:
      return copy (DarknessAblaze.ARCTOZOLT_66, this);
      case HYDREIGON_SWSH37:
      return copy (DarknessAblaze.HYDREIGON_110, this);
      case KANGASKHAN_SWSH38:
      return copy (DarknessAblaze.KANGASKHAN_133, this);
      case PIKACHU_SWSH39:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Tail Whip" , {
          text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
          energyCost C
          onAttack{
            flip{
              cantAttackNextTurn defending
            }
          }
        }
        move "Pika Bolt", {
          text "50 damage."
          energyCost L, C, C
          onAttack {
            damage 50
          }
        }
      };
      case HATENNA_SWSH40:
      return copy (RebelClash.HATENNA_83, this);
      case FLAREON_SWSH41:
      return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            apply BURNED
          }
        }
        move "Kindle", {
          text "120 damage. Discard an Energy from this Pokémon. Then, discard an Energy from your opponent’s Active Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
            if (self.cards.energyCount(C)) {
              discardSelfEnergyAfterDamage C
              discardDefendingEnergyAfterDamage()
            }
          }
        }
      };
      case EEVEE_SWSH42:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Signs of Evolution", {
          text "Search your deck for a Pokémon that evolves from Eevee, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "There are no cards left in your deck"
          }
          onAttack {
            my.deck.search("Select a Pokémon that evolves from Eevee.", {it.cardTypes.is(EVOLUTION) && it.predecessor == "Eevee"}).showToOpponent("Your opponent chose this Pokémon that evolves from Eevee").moveTo(my.hand)
          }
        }
        move "Kick Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            flip { damage 30 }
          }
        }
      };
      case GALARIAN_SIRFETCH_D_V_SWSH43:
      return basic (this, hp:HP210, type:F, retreatCost:2) {
        weakness P
        bwAbility "Resolute Spear", {
          text "Once during your turn, when this Pokémon moves from your Bench to the Active Spot, you may move any amount of [F] Energy from your other Pokémon to it."
          delayedA {
            after SWITCH, {
              if (lastUsedTurn != bg.turnCount && self.active && bg.currentTurn == self.owner && ef.switchedOut==self && confirm("Use $thisAbility?")) {
                powerUsed()
                def energiesToMove = selectCardTypeFromPokemon type:F,
                  cardMsg:"Choose the Energy cards to move to $self", exclude:self, ENERGY
                def pcsMap = [:]
                energiesToMove.each {
                  def pcs = it.findPCS()
                  if (pcsMap.containsKey(pcs)) (pcsMap[pcs] as CardList).add(it)
                  else pcsMap.put(pcs, new CardList(it))
                  energySwitch pcs, self, it, true
                }

                pcsMap.each { key, val ->
                  bc "$val moved from $key to $self"
                }
              }
            }
          }
        }
        move "Meteor Smash", {
          text "200 damage. During your next turn, this Pokémon can't attack."
          energyCost F, F, C
          onAttack {
            damage 200
            cantAttackNextTurn self
          }
        }
      };
      case ETERNATUS_V_SWSH44:
      return copy (DarknessAblaze.ETERNATUS_V_116, this);
      case ETERNATUS_VMAX_SWSH45:
      return copy (DarknessAblaze.ETERNATUS_VMAX_117, this);
      case ELDEGOSS_SWSH46:
      return copy (SwordShield.ELDEGOSS_21, this);
      case DREDNAW_SWSH47:
      return copy (SwordShield.DREDNAW_61, this);
      case CENTISKORCH_SWSH48:
      return copy (SwordShield.CENTISKORCH_39, this);
      case DUBWOOL_V_SWSH49:
      return copy (RebelClash.DUBWOOL_V_153, this);
      case CHARIZARD_V_SWSH50:
      return copy (DarknessAblaze.CHARIZARD_V_19, this);
      case LAPRAS_SWSH51:
      return copy (SwordShield.LAPRAS_48, this);
      case GENGAR_SWSH52:
      return copy (SwordShield.GENGAR_85, this);
      case MACHAMP_SWSH53:
      return copy (ChampionsPath.MACHAMP_26, this);
      case COALOSSAL_SWSH54:
      return copy (RebelClash.COALOSSAL_107, this);
      case HATTERENE_V_SWSH55:
      return basic (this, hp:HP200, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Confounding Pulse", {
          text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Confused."
          energyCost P, C
          attackRequirement {
            assert opp.bench : "Opponent's Bench is empty"
          }
          onAttack {
            if (!opp.bench) return
            switchYourOpponentsBenchedWithActive()
            applyAfterDamage CONFUSED
          }
        }
        move "Mental Crush", {
          text "90 damage. If your opponent's Active Pokémon is Confused, this attack does 90 more damage."
          energyCost P, P, C
          onAttack {
            damage 90
            if (defending.isSPC(CONFUSED)) damage 90
          }
        }
      }
      case MORPEKO_V_SWSH56:
      return copy (SwordShield.MORPEKO_V_79, this)
      case GRIMMSNARL_V_SWSH57:
      return copy (DarknessAblaze.GRIMMSNARL_V_114, this)
      case ALCREMIE_SWSH58:
      return copy (RebelClash.ALCREMIE_87, this)
      case GALARIAN_OBSTAGOON_SWSH59:
      return copy (SwordShield.GALARIAN_OBSTAGOON_119, this)
      case DURALUDON_SWSH60:
      return copy (RebelClash.DURALUDON_138, this)
      case PIKACHU_V_SWSH63:
      return basic (this, hp:HP190, type:L, retreatCost:1) {
        weakness F
        move "Pika Ball", {
          text "30 damage."
          energyCost L
          onAttack {
            damage 30
          }
        }
        move "Circle Circuit", {
          text "30x damage. This attack does 30 damage for each of your Benched Pokémon."
          energyCost L, L
          attackRequirement {
            assert my.bench : "No benched Pokémon"
          }
          onAttack {
            damage 30 * my.bench.size()
          }
        }
      }
      case ETERNATUS_V_SWSH64:
      return copy (DarknessAblaze.ETERNATUS_V_116, this);
      case EEVEE_V_SWSH65:
      return basic (this, hp:HP190, type:C, retreatCost:1) {
        weakness F
        move "Collect", {
          text "Draw 3 cards."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            draw 3
          }
        }
        move "Brave Buddies", {
          text "80+ damage. If you played a Supporter card from your hand during this turn, this attack does 80 more damage."
          energyCost C, C, C
          onAttack {
            damage 80
            // TODO: Handle supporters not played from hand
            if (bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) {
              damage 80
            }
          }
        }
      }
      case CHARIZARD_SWSH66:
      return copy (AmazingVoltTackle.CHARIZARD_12, this)
      case DONPHAN_SWSH67:
      return copy (AmazingVoltTackle.DONPHAN_57, this)
      case SNORLAX_SWSH68:
      return copy (AmazingVoltTackle.SNORLAX_84, this)
      case LUGIA_SWSH69:
      return copy (LegendaryHeartbeat.LUGIA_55, this)
      case GROOKEY_SWSH70:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Full On", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          onAttack {
            flip { damage 30 }
          }
        }
      }
      case SCORBUNNY_SWSH71:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Me First", {
          text "Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            draw 1
          }
        }
        move "Live Coal", {
          text "20 damage."
          energyCost R, R
          onAttack {
            damage 20
          }
        }
      }
      case VAPOREON_SWSH72:
      return evolution (this, from:"Eevee", hp:HP110, type:W, retreatCost:2) {
        weakness L
        // TODO: Static candidate
        bwAbility "Watery Shroud", {
          text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(!self.active && it.to == self){
                  bc "$thisAbility prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Hydro Pump", {
          text "60+ damage. This attack does 20 more damage for each [W] Energy attached to this Pokémon"
          energyCost C, C, C
          onAttack {
            damage 60
            damage 20 * self.cards.energyCount(W)
          }
        }
      }
      case SOBBLE_SWSH73:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Growl", {
          text "During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
          energyCost C
          onAttack {
            reduceDamageFromDefendingNextTurn hp(20), thisMove, defending
          }
        }
        move "Rain Splash", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }
      }
      case SPECIAL_DELIVERY_PIKACHU_SWSH74:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Happy Delivery", {
          text "Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def card = my.deck.search { it.cardTypes.is(ITEM) }
            if (!card) return
            card.showToOpponent("Item card pulled from opponent's deck and put in their hand.")
            card.moveTo my.hand
            shuffleDeck()
          }
        }
        move "Electro Ball", {
          text "Damage 30."
          energyCost L, C
          onAttack {
            damage 30
          }
        }
      }
      case SPECIAL_DELIVERY_CHARIZARD_SWSH75:
      return evolution (this, from: "Charmeleon", hp:HP160, type:R, retreatCost:3) {
        weakness W
        move "Happy Delivery", {
          text "Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def cards = my.deck.search max:2, { it.cardTypes.is(ITEM) }
            if (!cards) return
            cards.showToOpponent("Item card pulled from opponent's deck and put in their hand.")
            cards.moveTo my.hand
            shuffleDeck()
          }
        }
        move "Flamethrower", {
          text "Damage 160."
          energyCost R, R, C
          onAttack {
            damage 160
            discardSelfEnergy C
          }
        }
      }
      case ZACIAN_V_SWSH76:
      return copy (SwordShield.ZACIAN_V_138, this)
      case ZAMAZENTA_V_SWSH77:
      return copy (SwordShield.ZAMAZENTA_V_139, this)
      case ORBEETLE_V_SWSH78:
      return copy (AmazingVoltTackle.ORBEETLE_V_8, this)
      default:
      return null;
    }
  }
}