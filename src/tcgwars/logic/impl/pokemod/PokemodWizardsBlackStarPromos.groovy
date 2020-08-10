package tcgwars.logic.impl.pokemod


import tcgwars.logic.card.*
import tcgwars.logic.util.*

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodWizardsBlackStarPromos implements LogicCardInfo {

  PIKACHU_1 ("Pikachu", "1", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  ELECTABUZZ_2 ("Electabuzz", "2", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MEWTWO_3 ("Mewtwo", "3", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  PIKACHU_4 ("Pikachu", "4", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  DRAGONITE_5 ("Dragonite", "5", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _COLORLESS_),
  ARCANINE_6 ("Arcanine", "6", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _FIRE_),
  JIGGLYPUFF_7 ("Jigglypuff", "7", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  MEW_8 ("Mew", "8", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MEW_9 ("Mew", "9", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MEOWTH_10 ("Meowth", "10", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  EEVEE_11 ("Eevee", "11", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  MEWTWO_12 ("Mewtwo", "12", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  VENUSAUR_13 ("Venusaur", "13", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _GRASS_),
  MEWTWO_14 ("Mewtwo", "14", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  COOL_PORYGON_15 ("Cool Porygon", "15", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  COMPUTER_ERROR_16 ("Computer Error", "16", Rarity.PROMO, TRAINER),
  DARK_PERSIAN_17 ("Dark Persian", "17", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _COLORLESS_),
  TEAM_ROCKET_S_MEOWTH_18 ("Team Rocket's Meowth", "18", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  SABRINA_S_ABRA_19 ("Sabrina's Abra", "19", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  PSYDUCK_20 ("Psyduck", "20", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  MOLTRES_21 ("Moltres", "21", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  ARTICUNO_22 ("Articuno", "22", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  ZAPDOS_23 ("Zapdos", "23", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  BIRTHDAY_PIKACHU_24 ("Birthday Pikachu", "24", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  FLYING_PIKACHU_25 ("Flying Pikachu", "25", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  PIKACHU_26 ("Pikachu", "26", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  PIKACHU_27 ("Pikachu", "27", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  SURFING_PIKACHU_28 ("Surfing Pikachu", "28", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MARILL_29 ("Marill", "29", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  TOGEPI_30 ("Togepi", "30", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  CLEFFA_31 ("Cleffa", "31", Rarity.PROMO, BASIC, BABY, POKEMON, _COLORLESS_),
  SMEARGLE_32 ("Smeargle", "32", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  SCIZOR_33 ("Scizor", "33", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _METAL_),
  ENTEI_34 ("Entei", "34", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  PICHU_35 ("Pichu", "35", Rarity.PROMO, BASIC, BABY, POKEMON, _LIGHTNING_),
  IGGLYBUFF_36 ("Igglybuff", "36", Rarity.PROMO, BASIC, BABY, POKEMON, _COLORLESS_),
  HITMONTOP_37 ("Hitmontop", "37", Rarity.PROMO, BASIC, POKEMON, _FIGHTING_),
  UNOWN_J_38 ("Unown J", "38", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  MISDREAVUS_39 ("Misdreavus", "39", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  POKEMON_CENTER_40 ("Pokémon Center", "40", Rarity.PROMO, TRAINER),
  LUCKY_STADIUM_41 ("Lucky Stadium", "41", Rarity.PROMO, STADIUM, TRAINER),
  POKEMON_TOWER_42 ("Pokémon Tower", "42", Rarity.PROMO, STADIUM, TRAINER, NOT_IMPLEMENTED),
  MACHAMP_43 ("Machamp", "43", Rarity.PROMO, STAGE2, EVOLUTION, POKEMON, _FIGHTING_),
  MAGMAR_44 ("Magmar", "44", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  SCYTHER_45 ("Scyther", "45", Rarity.PROMO, BASIC, POKEMON, _GRASS_),
  ELECTABUZZ_46 ("Electabuzz", "46", Rarity.PROMO, BASIC, POKEMON, _LIGHTNING_),
  MEW_47 ("Mew", "47", Rarity.PROMO, BASIC, POKEMON, _PSYCHIC_),
  ARTICUNO_48 ("Articuno", "48", Rarity.PROMO, BASIC, POKEMON, _WATER_),
  SNORLAX_49 ("Snorlax", "49", Rarity.PROMO, BASIC, POKEMON, _COLORLESS_),
  CELEBI_50 ("Celebi", "50", Rarity.PROMO, BASIC, POKEMON, _GRASS_),
  RAPIDASH_51 ("Rapidash", "51", Rarity.PROMO, STAGE1, EVOLUTION, POKEMON, _FIRE_),
  HO_OH_52 ("Ho-oh", "52", Rarity.PROMO, BASIC, POKEMON, _FIRE_),
  SUICUNE_53 ("Suicune", "53", Rarity.PROMO, BASIC, POKEMON, _WATER_);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  private WizardsBlackStarPromos(String name, String collectionLineNo, Rarity rarity, CardType... cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes);
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
  public Collection getCollection() {
    return Collection.POKEMOD_PROMOS;
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
    return null;
  }

}