package tcgwars.logic.impl.gen4

import tcgwars.logic.card.*
import tcgwars.logic.impl.gen4.DiamondPearl
import tcgwars.logic.impl.gen4.MysteriousTreasures
import tcgwars.logic.util.CardTypeSet

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.copy

/**
 * @author axpendix@hotmail.com
 * @author wertercatt@wertercatt.com
 */
public enum DiamondPearlTrainerKit implements LogicCardInfo {

  BUIZEL_MANAPHY_1 ("Buizel", "1", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FLOATZEL_MANAPHY_2 ("Floatzel", "2", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOLDEEN_MANAPHY_3 ("Goldeen", "3", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MANAPHY_MANAPHY_4 ("Manaphy", "4", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PIPLUP_MANAPHY_5 ("Piplup", "5", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PRINPLUP_MANAPHY_6 ("Prinplup", "6", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SEAKING_MANAPHY_7 ("Seaking", "7", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TOTODILE_MANAPHY_8 ("Totodile", "8", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  DUSK_BALL_MANAPHY_9 ("Dusk Ball", "9", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_MANAPHY_10 ("Energy Search", "10", Rarity.COMMON, [TRAINER, ITEM]),
  POTION_MANAPHY_11 ("Potion", "11", Rarity.COMMON, [TRAINER, ITEM]),
  WATER_ENERGY_MANAPHY_12 ("Water Energy", "12", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  GEODUDE_LUCARIO_1 ("Geodude", "1", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GRAVELER_LUCARIO_2 ("Graveler", "2", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LUCARIO_LUCARIO_3 ("Lucario", "3", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MACHOKE_LUCARIO_4 ("Machoke", "4", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MACHOP_LUCARIO_5 ("Machop", "5", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  RIOLU_LUCARIO_6 ("Riolu", "6", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  STARLY_LUCARIO_7 ("Starly", "7", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ENERGY_SEARCH_LUCARIO_8 ("Energy Search", "9", Rarity.COMMON, [TRAINER, ITEM]),
  POTION_LUCARIO_9 ("Potion", "10", Rarity.COMMON, [TRAINER, ITEM]),
  QUICK_BALL_LUCARIO_10 ("Quick Ball", "11", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FIGHTING_ENERGY_LUCARIO_11 ("Fighting Energy", "12", Rarity.COMMON, [BASIC_ENERGY, ENERGY]);


  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DiamondPearlTrainerKit(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DIAMOND_PEARL_TRAINER_KIT;
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
      case BUIZEL_MANAPHY_1:
        return copy(DiamondPearl.BUIZEL_72, this);
      case FLOATZEL_MANAPHY_2:
        return copy(DiamondPearl.FLOATZEL_26, this);
      case GOLDEEN_MANAPHY_3:
        return copy(DiamondPearl.GOLDEEN_84, this);
      case MANAPHY_MANAPHY_4:
        return copy(DiamondPearl.MANAPHY_9, this);
      case PIPLUP_MANAPHY_5:
        return copy(DiamondPearl.PIPLUP_93, this);
      case PRINPLUP_MANAPHY_6:
        return copy(DiamondPearl.PRINPLUP_58, this);
      case SEAKING_MANAPHY_7:
        return copy(DiamondPearl.SEAKING_62, this);
      case TOTODILE_MANAPHY_8:
        return copy(MysteriousTreasures.TOTODILE_106, this);
      case DUSK_BALL_MANAPHY_9:
        return copy(MysteriousTreasures.DUSK_BALL_110, this);
      case ENERGY_SEARCH_MANAPHY_10:
        return copy(DiamondPearl.ENERGY_SEARCH_117, this);
      case POTION_MANAPHY_11:
        return copy(DiamondPearl.POTION_118, this);
      case WATER_ENERGY_MANAPHY_12:
        return copy(DiamondPearl.WATER_ENERGY_125, this);
      case GEODUDE_LUCARIO_1:
        return copy(MysteriousTreasures.GEODUDE_84, this);
      case GRAVELER_LUCARIO_2:
        return copy(MysteriousTreasures.GRAVELER_51, this);
      case LUCARIO_LUCARIO_3:
        return copy(DiamondPearl.LUCARIO_6, this);
      case MACHOKE_LUCARIO_4:
        return copy(DiamondPearl.MACHOKE_53, this);
      case MACHOP_LUCARIO_5:
        return copy(DiamondPearl.MACHOP_86, this);
      case RIOLU_LUCARIO_6:
        return copy(DiamondPearl.RIOLU_61, this);
      case STARLY_LUCARIO_7:
        return copy(DiamondPearl.STARLY_101, this);
      case ENERGY_SEARCH_LUCARIO_8:
        return copy(DiamondPearl.ENERGY_SEARCH_117, this);
      case POTION_LUCARIO_9:
        return copy(DiamondPearl.POTION_118, this);
      case QUICK_BALL_LUCARIO_10:
        return copy(MysteriousTreasures.QUICK_BALL_114, this);
      case FIGHTING_ENERGY_LUCARIO_11:
        return copy(DiamondPearl.FIGHTING_ENERGY_128, this);
      default:
        return null;
    }
  }

}
