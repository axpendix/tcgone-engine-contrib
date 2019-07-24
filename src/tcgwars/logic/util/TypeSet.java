package tcgwars.logic.util;

import gnu.trove.set.hash.THashSet;
import tcgwars.logic.card.Type;

import java.util.Collection;

/**
 * @author axpendix@hotmail.com
 */
public class TypeSet extends THashSet<Type> {

  public TypeSet() {
  }
  public TypeSet(Collection<Type> types){
    super(types);
  }
  public TypeSet(Type...types){
    this();
    for (Type type : types) {
      add(type);
    }
  }
  public Type getFirst(){
    for (Type type : this) {
      return type;
    }
    return null;
  }

  public boolean containsAny(TypeSet o){
    for (Type type : o) {
      if(this.contains(type)){
        return true;
      }
    }
    return false;
  }
}
