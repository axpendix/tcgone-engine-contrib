package tcgwars.logic.util;

import static tcgwars.logic.card.CardType.*;

import java.util.*;
import java.util.stream.Collectors;

import gnu.trove.set.hash.THashSet;
import tcgwars.logic.card.CardType;
import tcgwars.logic.card.CardType.CardTypeComparator;
import tcgwars.logic.card.Type;

/**
 * @author axpendix@hotmail.com
 */
public class CardTypeSet extends TreeSet<CardType> {

  public CardTypeSet() {
    super(new CardTypeComparator());
  }

  public CardTypeSet(CardTypeSet oldset) {
    this();
    for (CardType cardType : oldset) {
      add(cardType);
    }
  }

  public CardTypeSet(CardType... cardTypes) {
    this();
    for (CardType cardType : cardTypes) {
      add(cardType);
    }
  }

  public boolean is(CardType o) {
    return contains(o);
  }

  public boolean isNot(CardType o) {
    return !contains(o);
  }

  public boolean isIn(CardType... o) {
    for (CardType cardType : o) {
      if (is(cardType)) {
        return true;
      }
    }
    return false;
  }

  public boolean isAll(CardType... o) {
    for (CardType cardType : o) {
      if (!is(cardType)) {
        return false;
      }
    }
    return true;
  }

  public boolean isIn(CardTypeSet cts) {
    for (CardType cardType : cts) {
      if (is(cardType)) {
        return true;
      }
    }
    return false;
  }

  public int getHighestPriority() {
    int min = Integer.MAX_VALUE;
    for (CardType ct : this) {
      if (ct.getPriority() < min) {
        min = ct.getPriority();
      }
    }
    return min;
  }

  public void add(CardType... cardTypes) {
    for (CardType cardType : cardTypes) {
      add(cardType);
    }
  }

  public CardType getSignificantType() {
    int highestPriority = getHighestPriority();
    for (CardType ct : this) {
      if (ct.getPriority() == highestPriority) {
        return ct;
      }
    }
    return null;
  }

  public CardType getMainlineType() {
    if (is(POKEMON)) {
      return POKEMON;
    }
    if (is(TRAINER)) {
      return TRAINER;
    }
    if (is(ENERGY)) {
      return ENERGY;
    }
    return null;
  }
  public String toPcsStageString() {
    return toPcsStageString(false);
  }

  public String toPcsStageString(boolean includeSecondaryTypes) {
    CardType mainStage = null;
    CardType mainType = null;
    List<CardType> secondaryTypes = new ArrayList<>();
    //TODO: Remove BASIC from Pokémon LEGEND, as they are not. Checking LEGEND first as to print the correct type, need to move it to the back once this is fixed.
    for ( CardType stage : Arrays.asList(LEGEND, BASIC, STAGE1, STAGE2, RESTORED, VMAX, BREAK, MEGA_POKEMON)) {
      if (is(stage)) {
        mainStage = stage;
        break;
      }
    }

    // mainStage should never be null
    switch(Objects.requireNonNull(mainStage)) {
      case LEGEND:
      case RESTORED:
        break;
      case MEGA_POKEMON:
        mainType = POKEMON_EX;
        break;
      case VMAX:
        mainType = POKEMON_V;
        break;
      default:
        for (CardType stage : Arrays.asList(POKEMON_V, POKEMON_GX, PRISM_STAR, POKEMON_EX, LVL_X, EX, POKEMON_STAR)){
          if (is(stage)){
            mainType = stage;
           break;
          }
        }
        break;
    }
    if (includeSecondaryTypes) {
      List<CardType> secTypesToCheck = new ArrayList<>(Arrays.asList(TEAM_PLASMA, DELTA)); //Always needs to be checked.
      if (mainType != null) //Prevents needless checks for LEGEND and Restored Pokémon.
        switch(mainType) {
          case POKEMON_V:
            secTypesToCheck.addAll(Arrays.asList(SINGLE_STRIKE, RAPID_STRIKE));
            break;
          case POKEMON_GX:
            secTypesToCheck.addAll(Arrays.asList(TAG_TEAM, ULTRA_BEAST));
            break;
          case PRISM_STAR: case POKEMON_STAR: case POKEMON_EX:
            break;
          default:
            secTypesToCheck.addAll(Arrays.asList(SINGLE_STRIKE, RAPID_STRIKE, ULTRA_BEAST, POKEMON_PRIME, POKEMON_SP));
            break;
        }
      for (CardType secType : secTypesToCheck)
        if (is(secType))
          secondaryTypes.add(secType);
    }

    String res = mainStage.toString();
    if (mainType != null)
      res += " - " + mainType.toString();
    if (!secondaryTypes.isEmpty())
      res += " [" + secondaryTypes.stream().map(CardType::toString).collect(Collectors.joining("-")) + "]";
    return res;
  }

  public CardTypeSet getSignificantTypes() {
    CardTypeSet newset = new CardTypeSet();
    for (CardType ct : this) {
      if (ct != POKEMON && ct != ENERGY) {
        newset.add(ct);
      }
    }
    return newset;
  }

  public Set<Type> getElementalTypes() {
    Set<Type> ts = new THashSet<>();
    for (CardType ct : this) {
      Type type = ct.toElementalType();
      if (type != null) {
        ts.add(type);
      }
    }
    return ts;
  }

  public boolean isTrainer() {
    return is(CardType.TRAINER);
  }

  public boolean isEnergy() {
    return is(CardType.ENERGY);
  }

  public boolean isPokemon() {
    return is(CardType.POKEMON);
  }

  public boolean isEvolution() {
    return is(CardType.EVOLUTION);
  }

  public boolean isLevelUp() {
    return is(CardType.LVL_X);
  }

  public static CardTypeSet all() {
    return new CardTypeSet(CardType.values());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (CardType ct : this) {
      if (!sb.toString().isEmpty()) {
        sb.append(", ");
      }
      sb.append(ct);
    }
    return sb.toString();

  }

}
