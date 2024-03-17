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
  MEOWTH_VMAX_SWSH05 ("Meowth VMAX", "SWSH005", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _COLORLESS_]),
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
  ETERNATUS_VMAX_SWSH45 ("Eternatus VMAX", "SWSH045", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
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
  GALARIAN_MR_RIME_SWSH79 ("Galarian Mr. Rime", "SWSH079", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DEDENNE_SWSH80 ("Dedenne", "SWSH080", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_SWSH81 ("Polteageist", "SWSH081", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  BUNNELBY_SWSH82 ("Bunnelby", "SWSH082", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  ALAKAZAM_V_SWSH83 ("Alakazam V", "SWSH083", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ELDEGOSS_V_SWSH84 ("Eldegoss V", "SWSH084", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
  BOLTUND_V_SWSH85 ("Boltund V", "SWSH085", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
  CRAMORANT_V_SWSH86 ("Cramorant V", "SWSH086", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _COLORLESS_]),
  EEVEE_VMAX_SWSH87 ("Eevee VMAX", "SWSH087", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, NOT_IMPLEMENTED, _COLORLESS_]),
  CHERRIM_SWSH88 ("Cherrim", "SWSH088", Rarity.PROMO, [POKEMON, STAGE1, EVOLUTION, _GRASS_]),
  OCTILLERY_SWSH89 ("Octillery", "SWSH089", Rarity.PROMO, [POKEMON, STAGE1, EVOLUTION, RAPID_STRIKE, _WATER_]),
  HOUNDOOM_SWSH90 ("Houndoom", "SWSH090", Rarity.PROMO, [POKEMON, STAGE1, EVOLUTION, SINGLE_STRIKE, _DARKNESS_]),
  BRONZONG_SWSH91 ("Bronzong", "SWSH091", Rarity.PROMO, [POKEMON, STAGE1, EVOLUTION, _METAL_]),
  CHARMANDER_SWSH92 ("Charmander", "SWSH092", Rarity.PROMO, [POKEMON, BASIC, _FIRE_]),
  ARROKUDA_SWSH93 ("Arrokuda", "SWSH093", Rarity.PROMO, [POKEMON, BASIC, _WATER_]),
  JOLTEON_SWSH94 ("Jolteon", "SWSH094", Rarity.PROMO, [POKEMON, STAGE1, EVOLUTION, _LIGHTNING_]),
  EEVEE_SWSH95 ("Eevee", "SWSH095", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  DRAGAPULT_V_SWSH96 ("Dragapult V", "SWSH096", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
  DRAGAPULT_VMAX_SWSH97 ("Dragapult VMAX", "SWSH097", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _PSYCHIC_]),
  CROBAT_V_SWSH98 ("Crobat V", "SWSH098", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  CROBAT_VMAX_SWSH99 ("Crobat VMAX", "SWSH099", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _DARKNESS_]),
  VENUSAUR_V_SWSH100 ("Venusaur V", "SWSH100", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  BLASTOISE_V_SWSH101 ("Blastoise V", "SWSH101", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  VENUSAUR_VMAX_SWSH102 ("Venusaur VMAX", "SWSH102", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _GRASS_]),
  BLASTOISE_VMAX_SWSH103 ("Blastoise VMAX", "SWSH103", Rarity.PROMO, [POKEMON, EVOLUTION, POKEMON_V, VMAX, _WATER_]),
  VICTINI_V_SWSH104 ("Victini V", "SWSH104", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  GARDEVOIR_V_SWSH105 ("Gardevoir V", "SWSH105", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SINGLE_STRIKE_URSHIFU_V_SWSH106 ("Single Strike Urshifu V", "SWSH106", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _FIGHTING_]),
  RAPID_STRIKE_URSHIFU_V_SWSH107 ("Rapid Strike Urshifu V", "SWSH107", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _FIGHTING_]),
  EMPOLEON_V_SWSH108 ("Empoleon V", "SWSH108", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, RAPID_STRIKE, _WATER_]),
  TYRANITAR_V_SWSH109 ("Tyranitar V", "SWSH109", Rarity.PROMO, [POKEMON, BASIC, POKEMON_V, SINGLE_STRIKE, _DARKNESS_]),
  GALARIAN_RAPIDASH_V_SWSH111 ("Galarian Rapidash V", "SWSH111", Rarity.PROMO, [POKEMON, POKEMON_V, BASIC, POKEMON_V, _PSYCHIC_]),
  CINDERACE_SWSH112 ("Cinderace", "SWSH112", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, SINGLE_STRIKE, _FIRE_]),
  INTELEON_SWSH113 ("Inteleon", "SWSH113", Rarity.PROMO, [POKEMON, EVOLUTION, STAGE2, RAPID_STRIKE, _WATER_]),
  CRESSELIA_SWSH114 ("Cresselia", "SWSH114", Rarity.PROMO, [POKEMON, BASIC, _PSYCHIC_]),
  PASSIMIAN_SWSH115 ("Passimian", "SWSH115", Rarity.PROMO, [POKEMON, BASIC, RAPID_STRIKE, _FIGHTING_]),
  MORPEKO_SWSH116 ("Morpeko", "SWSH116", Rarity.PROMO, [POKEMON, BASIC, _LIGHTNING_]),
  PHANPY_SWSH117 ("Phanpy", "SWSH117", Rarity.PROMO, [POKEMON, BASIC, _FIGHTING_]),
  EEVEE_SWSH118 ("Eevee", "SWSH118", Rarity.PROMO, [POKEMON, BASIC, _COLORLESS_]),
  SNORLAX_SWSH119 ("Snorlax", "SWSH119", Rarity.PROMO, [POKEMON, BASIC, SINGLE_STRIKE, _COLORLESS_]),

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
    return this.name();
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
            flip { applyAfterDamage BURNED }
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
            flip { applyAfterDamage PARALYZED }
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
            flip { applyAfterDamage PARALYZED }
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
            applyAfterDamage POISONED
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
          ifActiveAndDamagedByAttackBody(delegate) {
            def opponent = self.owner.opposite.pbg
            if (opponent.hand.size() > 0) {
              bc "Teapot of Surprises activates"
              opponent.hand.select(hidden: true, count:1).showToOpponent("Chosen card").showToMe("Teapot of Surprises: this card will be put on the bottom of your deck").moveTo(opponent.deck) //Inverted showTo effects, but should work fine now
            }
          }
        }
        move "Mind Bend", {
          text "100 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C, C
          onAttack {
            damage 100
            applyAfterDamage CONFUSED
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
            flip { applyAfterDamage PARALYZED }
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
                if(!self.active && it.to == self && it.dmg.value && it.notNoEffect){
                  bc "$thisAbility prevents all damage"
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
      case GALARIAN_MR_RIME_SWSH79:
      return copy (DarknessAblaze.GALARIAN_MR_RIME_36, this)
      case DEDENNE_SWSH80:
      return copy (DarknessAblaze.DEDENNE_78, this)
      case POLTEAGEIST_SWSH81:
      return copy (DarknessAblaze.POLTEAGEIST_83, this)
      case BUNNELBY_SWSH82:
      return copy (DarknessAblaze.BUNNELBY_150, this)
      case ALAKAZAM_V_SWSH83:
      return copy (AmazingVoltTackle.ALAKAZAM_V_41, this)
      case ELDEGOSS_V_SWSH84:
      return copy (RebelClash.ELDEGOSS_V_19, this)
      case BOLTUND_V_SWSH85:
      return copy (RebelClash.BOLTUND_V_67, this)
      case CRAMORANT_V_SWSH86:
      return copy (SwordShield.CRAMORANT_V_155, this)
      case EEVEE_VMAX_SWSH87:
      return evolution (this, from: "Eevee V", hp:HP300, type:C, retreatCost:2) {
        weakness F
        move "G-Max Cuddle", {
          text "During your opponent’s next turn, if the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack doesn’t happen."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            // TODO
          }
        }
      }
      case CHERRIM_SWSH88:
      return copy (BattleStyles.CHERRIM_8, this)
      case OCTILLERY_SWSH89:
      return copy (BattleStyles.OCTILLERY_37, this)
      case HOUNDOOM_SWSH90:
      return copy (BattleStyles.HOUNDOOM_96, this)
      case BRONZONG_SWSH91:
      return copy (BattleStyles.BRONZONG_102, this)
      case CHARMANDER_SWSH92:
      return copy (VividVoltage.CHARMANDER_23, this)
      case ARROKUDA_SWSH93:
      return copy (VividVoltage.ARROKUDA_41, this)
      case JOLTEON_SWSH94:
      return evolution (this, from: "Eevee", hp:HP100, type:L, retreatCost:0) {
        weakness F
        move "Energize", {
            text "Attach a [L] Energy card from your discard pile to this Pokémon."
            energyCost L
            attackRequirement {
              assert my.discard.filterByEnergyType(L) : "No [L] Energy in your discard pile."
            }
            onAttack {
              afterDamage {
                attachEnergyFrom(type: L, my.discard, self)
              }
            }
          }
        move "Thunder", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
            damage 30, self
          }
        }
      }
      case EEVEE_SWSH95:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "First Step", {
          text "Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "There are no cards in your deck."
          }
          onAttack {
            draw 1
          }
        }
        move "Tail Whap", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case DRAGAPULT_V_SWSH96:
      return copy (RebelClash.DRAGAPULT_V_92, this)
      case DRAGAPULT_VMAX_SWSH97:
      return copy (RebelClash.DRAGAPULT_VMAX_93, this)
      case CROBAT_V_SWSH98:
      return copy (DarknessAblaze.CROBAT_V_104, this)
      case CROBAT_VMAX_SWSH99:
      return copy (ShinyStarV.CROBAT_VMAX_7, this)
      case VENUSAUR_V_SWSH100:
      return basic (this, hp:HP220, type:G, retreatCost:3) {
        weakness R
        move "Leaf Drain", {
          text "50 damage. Heal 30 damage from this Pokemon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 50
            heal 30, self
          }
        }
        move "Double-Edge", {
          text "190 damage. This Pokemon also does 30 damage to itself."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 190
            damage 30, self
          }
        }
      }
      case BLASTOISE_V_SWSH101:
      return basic (this, hp:HP220, type:W, retreatCost:3) {
        weakness L
        move "Water Gun", {
          text "30 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Torrential Cannon", {
          text "200 damage. During your next turn, this Pokémon can’t use Torrential Cannon."
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 200
            cantUseAttack(thisMove, self)
          }
        }
      }
      case VENUSAUR_VMAX_SWSH102:
      return evolution (this, from: "Venusaur V", hp:HP330, type:G, retreatCost:4) {
        weakness R
        move "Forest Storm", {
          text "30x damage. This attack does 30 damage for each [G] Energy attached to all of your Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            my.all.each { damage 30*it.cards.energyCount(G) }
          }
        }
        move "G-Max Bloom", {
          text "210 damage. Heal 30 damage from this Pokemon."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 210
            heal 30, self
          }
        }
      }
      case BLASTOISE_VMAX_SWSH103:
      return evolution (this, from: "Blastoise V", hp:HP330, type:W, retreatCost:3) {
        weakness L
        move "Grand Falls", {
          text "120 damage. Search your deck for up to 3 [W] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck."
          energyCost W, W, W
          attackRequirement {
            assert my.bench : "You have no Benched Pokémon."
            assert my.deck : "You have no cards in deck."
          }
          onAttack {
            damage 120
            deck.search (max:3,basicEnergyFilter(W)).each {
              attachEnergy(my.bench.select("Attach $it to"), it)
            }
            shuffleDeck()
          }
        }
        move "G-Max Bombard", {
          text "220 damage. This attack also does 30 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W, W
          attackRequirement {}
          onAttack {
            damage 220
            multiDamage(opp.bench, 2, 30)
          }
        }
      }
      case VICTINI_V_SWSH104:
      return copy (SwordShield.VICTINI_V_25, this)
      case GARDEVOIR_V_SWSH105:
      return copy (ChampionsPath.GARDEVOIR_V_16, this)
      case SINGLE_STRIKE_URSHIFU_V_SWSH106:
      return basic (this, hp:HP220, type:F, retreatCost:2) {
        weakness P
        move "Low Kick", {
          text "30 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Brawny Knuckle", {
          text "180 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, F, F, F
          attackRequirement {}
          onAttack {
            damage 180
            dontApplyResistance()
          }
        }
      }
      case RAPID_STRIKE_URSHIFU_V_SWSH107:
      return basic (this, hp:HP220, type:F, retreatCost:2) {
        weakness P
        move "Spiral Kick", {
          text "40 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Sonic Legs", {
          text "90 damage. This attack also does 20 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 90
            multiDamage(opp.bench, 2, 20)
          }
        }
      }
      case EMPOLEON_V_SWSH108:
      return copy (BattleStyles.EMPOLEON_V_40, this)
      case TYRANITAR_V_SWSH109:
      return copy (BattleStyles.TYRANITAR_V_97, this)
      case GALARIAN_RAPIDASH_V_SWSH111:
      return copy (ChillingReign.GALARIAN_RAPIDASH_V_167, this)
      case CINDERACE_SWSH112:
      return copy (ChillingReign.CINDERACE_28, this)
      case INTELEON_SWSH113:
      return copy (ChillingReign.INTELEON_43, this)
      case CRESSELIA_SWSH114:
      return copy (ChillingReign.CRESSELIA_64, this)
      case PASSIMIAN_SWSH115:
      return copy (ChillingReign.PASSIMIAN_88, this)
      case MORPEKO_SWSH116:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Famished", {
          text "Draw a card."
          energyCost C
          attackRequirement {
            assert my.deck : "You have no cards in deck."
          }
          onAttack {
            draw 1
          }
        }
        move "Thunder Shock", {
          text "40 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { applyAfterDamage PARALYZED }
          }
        }
      }
      case PHANPY_SWSH117:
      return copy (AmazingVoltTackle.PHANPY_56, this)
      case EEVEE_SWSH118:
      return copy (EEVEE_SWSH42, this)
      case SNORLAX_SWSH119:
      return basic (this, hp:HP140, type:C, retreatCost:4) {
        weakness F
        move "Slap Push", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Single Strike Tackle", {
          text "This Pokémon also does 30 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            damage 30, self
          }
        }
      }
      default:
      return null;
    }
  }
}