package tcgwars.logic.card;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Locale;

import org.apache.commons.lang.WordUtils;

/**
 * @author axpendix@hotmail.com
 */
public enum CardType {

  TOP(-100),

  POKEMON(10),
  TRAINER(20),
  ENERGY(30),

  MEGA_POKEMON(-6, "MEGA"),
  BREAK(-5, "BREAK"),
  LVL_X(-4, "LV.X"),
  STAGE2(-2, "Stage 2"),
  STAGE1(-1, "Stage 1"),
  EVOLUTION(0),
  RESTORED(4),
  BASIC(7),
  BABY(8),
  BASIC_ENERGY(18),
  SPECIAL_ENERGY(19),
  ITEM(23, "Trainer-Item"),
  SUPPORTER(24, "Trainer-Supporter"),
  STADIUM(25, "Trainer-Stadium"),
  POKEMON_TOOL(26, "Pokémon Tool"),
  TECHNICAL_MACHINE(27),
  FLARE(28, "Team Flare Hyper Gear"),
  ROCKETS_SECRET_MACHINE(29, "Rocket's Secret Machine"),

  _GRASS_(41, "Grass"),
  _FIRE_(42, "Fire"),
  _WATER_(43, "Water"),
  _LIGHTNING_(44, "Lightning"),
  _PSYCHIC_(45, "Psychic"),
  _FIGHTING_(46, "Fighting"),
  _DARKNESS_(47, "Darkness"),
  _METAL_(48, "Metal"),
  _FAIRY_(49, "Fairy"),
  _DRAGON_(50, "Dragon"),
  _COLORLESS_(51, "Colorless"),

  LEGEND(92, "LEGEND"),
  TAG_TEAM(93, "TAG TEAM"),
  ULTRA_BEAST(94),
  PRISM_STAR(95),
  POKEMON_GX(96, "Pokémon-GX"),
  POKEMON_PRIME(97, "Pokémon Prime"),
  POKEMON_STAR(98, "Pokémon Star"),
  POKEMON_EX(99, "Pokémon-EX"), //UPPERCASE
  EX(100, "Pokémon-ex"), //LOWERCASE
  FOSSIL(101),
  TEAM_MAGMA(102),
  TEAM_AQUA(103),
  OWNERS_POKEMON(104, "Owner's"),
  DARK_POKEMON(105, "Dark"),
  LIGHT_POKEMON(106, "Light"),
  SHINING_POKEMON(107, "Shining"), //Note: DO NOT mark SM era Shining Pokémon with this. Those don't follow the "You can’t have more than 1 Shining ______ in your deck" rule from older Shining Pokémon.
  TEAM_PLASMA(108),
  ACE_SPEC(109, "ACE Spec"),
  HAS_ANCIENT_TRAIT(110),
  POKEMON_V(111, "Pokémon V"),
  VMAX(112, "Pokémon VMAX"),
  G_SPEC(113, "G-SPEC"),
  DELTA(114, "Delta Species"),
  POKEMON_SP(115, "Pokémon SP"),
  POKEMON_VSTAR(116, "Pokémon VSTAR"),
  FUSION_STRIKE(117, "Fusion Strike"),
  SINGLE_STRIKE(118, "Single Strike"),
  RAPID_STRIKE(119, "Rapid Strike"),


  NOT_IMPLEMENTED(201),


  //Note: These next values are not meant for use in set definitions.
  EVOLVED(401),
  UNEVOLVED(402),

  ;

  private final String label;
  private final int weight; // determines ordering for cards in PokemonCardSet (ascending)

  CardType(int weight) {
    this.weight = weight;
    this.label = WordUtils.capitalizeFully(this.name().toLowerCase(Locale.ENGLISH), "_".toCharArray()).replaceAll("_", " ");
  }

  CardType(int weight, String label) {
    this.weight = weight;
    this.label = label;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return label;
  }

  public Type toElementalType() {
    switch (this) {
      case _GRASS_:
        return Type.GRASS;
      case _FIRE_:
        return Type.FIRE;
      case _WATER_:
        return Type.WATER;
      case _LIGHTNING_:
        return Type.LIGHTNING;
      case _PSYCHIC_:
        return Type.PSYCHIC;
      case _FIGHTING_:
        return Type.FIGHTING;
      case _DARKNESS_:
        return Type.DARKNESS;
      case _METAL_:
        return Type.METAL;
      case _FAIRY_:
        return Type.FAIRY;
      case _DRAGON_:
        return Type.DRAGON;
      case _COLORLESS_:
        return Type.COLORLESS;
      default:
        return null;
    }
  }

  public static class CardTypeComparator implements Comparator<CardType>, Serializable {

    @Override
    public int compare(CardType o1, CardType o2) {
      return Integer.compare(o1.getWeight(), o2.getWeight());
    }

  }

}
