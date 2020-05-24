package tcgwars.logic.util;

import static tcgwars.logic.card.CardType.*;

import java.util.Set;
import java.util.TreeSet;

import gnu.trove.set.hash.THashSet;
import tcgwars.logic.card.CardType;
import tcgwars.logic.card.CardType.CardTypeComparator;
import tcgwars.logic.card.Type;
import tcgwars.logic.Battleground;
import tcgwars.logic.PlayerType;

/**
 * @author axpendix@hotmail.com
 */
public class CardTypeSet extends TreeSet<CardType>{

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
  public boolean is(CardType o){
    List<PlayerType> Holon_Veil = TcgStatics.bg().em().retrieveObject("Holon_Veil");
    return (contains(o) || (o == CardType.DELTA && contains(CardType.POKEMON) && Holon_Veil.contains(player)));
  }
  public boolean isNot(CardType o){
    return !contains(o);
  }
  public boolean isIn(CardType...o){
    for (CardType cardType : o) {
      if (is(cardType)) {
        return true;
      }
    }
    return false;
  }
  public boolean isAll(CardType...o){
    for (CardType cardType : o) {
      if (!is(cardType)) {
        return false;
      }
    }
    return true;
  }

  public boolean isIn(CardTypeSet cts){
    for (CardType cardType : cts) {
      if (is(cardType)) {
        return true;
      }
    }
    return false;
  }

  public int getHighestPriority(){
    int min = Integer.MAX_VALUE;
    for (CardType ct : this) {
      if (ct.getPriority() < min) {
        min = ct.getPriority();
      }
    }
    return min;
  }
  public void add(CardType...cardTypes){
    for (CardType cardType : cardTypes) {
      add(cardType);
    }
  }
  public CardType getSignificantType(){
    int highestPriority = getHighestPriority();
    for (CardType ct : this) {
      if (ct.getPriority() == highestPriority) {
        return ct;
      }
    }
    return null;
  }
  public CardType getMainlineType(){
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
  public CardTypeSet getSignificantTypes(){
    CardTypeSet newset = new CardTypeSet();
    for (CardType ct : this) {
      if (ct!=POKEMON && ct!=ENERGY) {
        newset.add(ct);
      }
    }
    return newset;
  }
  public Set<Type> getElementalTypes(){
    Set<Type> ts = new THashSet<>();
    for(CardType ct:this){
      Type type = ct.toElementalType();
      if (type!=null) {
        ts.add(type);
      }
    }
    return ts;
  }
  public boolean isTrainer(){
    return is(CardType.TRAINER);
  }
  public boolean isEnergy(){
    return is(CardType.ENERGY);
  }
  public boolean isPokemon(){
    return is(CardType.POKEMON);
  }
  public boolean isEvolution(){
    return is(CardType.EVOLUTION);
  }
  public static CardTypeSet all(){
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
