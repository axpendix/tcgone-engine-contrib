package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen8.SwordShield;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PopSeries7 implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", "1", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  GALLADE_2 ("Gallade", "2", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LATIAS_3 ("Latias", "3", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  LATIOS_4 ("Latios", "4", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MOTHIM_5 ("Mothim", "5", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DELIBIRD_6 ("Delibird", "6", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  FLAAFFY_7 ("Flaaffy", "7", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KIRLIA_8 ("Kirlia", "8", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  STANTLER_9 ("Stantler", "9", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WORMADAM_SANDY_CLOAK_10 ("Wormadam Sandy Cloak", "10", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  BURMY_PLANT_CLOAK_11 ("Burmy Plant Cloak", "11", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_SANDY_CLOAK_12 ("Burmy Sandy Cloak", "12", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CORSOLA_13 ("Corsola", "13", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAREEP_14 ("Mareep", "14", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RALTS_15 ("Ralts", "15", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SENTRET_16 ("Sentret", "16", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SPINDA_17 ("Spinda", "17", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PopSeries7(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POP_SERIES_7;
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
      case AMPHAROS_1:
        return copy (SecretWonders.AMPHAROS_1, this);
      case GALLADE_2:
        return copy (SecretWonders.GALLADE_6, this);
      case LATIAS_3:
        return copy (GreatEncounters.LATIAS_22, this);
      case LATIOS_4:
        return copy (GreatEncounters.LATIOS_23, this);
      case MOTHIM_5:
        return copy (SecretWonders.MOTHIM_33, this);
      case DELIBIRD_6:
        return copy (GreatEncounters.DELIBIRD_36, this);
      case FLAAFFY_7:
        return copy (SecretWonders.FLAAFFY_50, this);
      case KIRLIA_8:
        return copy (SecretWonders.KIRLIA_53, this);
      case STANTLER_9:
        return copy (SecretWonders.STANTLER_113, this);
      case WORMADAM_SANDY_CLOAK_10:
        return copy (SecretWonders.WORMADAM_SANDY_CLOAK_42, this);
      case BURMY_PLANT_CLOAK_11:
        return copy (SecretWonders.BURMY_PLANT_CLOAK_78, this);
      case BURMY_SANDY_CLOAK_12:
        return copy (SecretWonders.BURMY_SANDY_CLOAK_79, this);
      case CORSOLA_13:
        return copy (SecretWonders.CORSOLA_84, this);
      case MAREEP_14:
        return copy (SecretWonders.MAREEP_94, this);
      case RALTS_15:
        return copy (SecretWonders.RALTS_102, this);
      case SENTRET_16:
        return copy (SecretWonders.SENTRET_104, this);
      case SPINDA_17:
        return copy (SecretWonders.SPINDA_111, this);
      default:
        return null;
    }
  }

}
