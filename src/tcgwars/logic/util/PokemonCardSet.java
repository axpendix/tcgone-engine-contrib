package tcgwars.logic.util;





import com.google.common.collect.ImmutableList;
import gnu.trove.map.hash.THashMap;
import gnu.trove.set.hash.THashSet;
import tcgwars.common.TWCommon;
import tcgwars.logic.Battleground;
import tcgwars.logic.GameFormat;
import tcgwars.logic.PlayerType;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.EnergyCard;
import tcgwars.logic.card.pokemon.PokemonCard;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.SpecialConditionType;
import tcgwars.logic.groovy.TcgStatics;

import java.io.Serializable;
import java.util.*;

import static tcgwars.logic.card.CardType.EVOLUTION;

/**
 * Models an in-game pokemon
 * @author axpendix@hotmail.com
 */
public class PokemonCardSet implements PokemonStack, Serializable {

  /**
   * This list is automatically sorted (see {@link CardList#setAutosort(boolean)}).
   * The order is roughly: evolution cards, basic pokemon, trainers, energy.
   */
  private CardList set;

  private HP damage;

  private PlayerType owner;

  private Set<SpecialConditionType> specialConditions;

  //to, from. ex: <charizard, charmeleon> and <charmeleon, charmander>
//	private Map<PokemonCard, PokemonCard> evolutionChain;

  public final String id;

  //turn played
  public final int turnCount = Battleground.getInstance().getTurnCount();
  //turn last evolved or put to play
  public int lastEvolved = Battleground.getInstance().getTurnCount();
  //turn last made active (switched out)
  public int lastSwitchedOut = -1;
  //the pokemon name during the last switch out
  public String lastSwitchedOutName = "";
  //turn last healed by a non-zero amount
  public int lastHealedTurn = -1;
  //turn of last pokemon tool attachment
  public int lastPokemonToolAttachedTurn = -1;
  //equals to bg.tc if is slated to knockout by damage of an attack
  public int KOBYDMG = 0;
  //last abilities map
  Map<Ability, PokemonCard> lastAbilities;

  public PokemonCardSet(PlayerType owner) {
    set = new CardList("PCS");
    set.setAutosort(true);
    damage = HP.HP000;
    this.owner = owner;
    this.specialConditions = new THashSet<>();
    this.id = UUID.randomUUID().toString();
//		this.evolutionChain = new HashMap<PokemonCard, PokemonCard>();
  }

  /**
   * literally: evolution
   */
  public boolean isRealEvolution(){
    return getTopPokemonCard().getCardTypes().contains(EVOLUTION);
  }
  /**
   * literally: evolved
   */
  public boolean isEvolution(){
    return getPokemonCards().size()>1;
//		return getTopPokemonCard().getCardTypes().is(CardType.EVOLUTION);
  }
  /**
   * means it is not an evolved card = basic.
   * but beware that if baby evolution is done, than that is an evolved one even though it writes basic on it.
   * @return
   */
  public boolean isNotEvolution(){
    return !isEvolution();
  }

  /**
   * this will check the top card being a basic or evolution
   * @see #isNotEvolution()
   */
  public boolean isBasic() {
    return getTopPokemonCard().getCardTypes().is(CardType.BASIC);
  }

  public PokemonCard getTopPokemonCard(){
    Card card = cards().first();
    if(card == null){
      throw new NullPointerException("topPokemonCard. lastName:" + lastName);
    }
    if (!card.getCardTypes().isPokemon()){
      throw new IllegalStateException("Top card is not a pokemon card. lastName:" + lastName);
    }
    return (PokemonCard) card;
  }

  public PokemonCard getTopNonBreakPokemonCard(){
    for (Card card : cards().filterByType(CardType.POKEMON)) {
      if(card.getCardTypes().is(CardType.BREAK)) continue;
      return card.asPokemonCard();
    }
    return null;
  }

  public CardList getCards(){
    return set;
  }

  public CardList cards() {
    return set;
  }

  private List<Type> energyTypeImages = Collections.emptyList();

  // can be called from UI
  public List<Type> getEnergyTypeImages(){
    return energyTypeImages;
  }

  // can be ONLY called inside Future thus no concurrent modification can occur
  public void generateEnergyTypeImages() {
    List<EnergyCard> energyCards = getEnergyCards();
    ImmutableList.Builder<Type> listBuilder = ImmutableList.builder();
    for (EnergyCard card : energyCards) {
      List<Type> typeImagesOverride = card.getTypeImagesOverride();
      if(typeImagesOverride != null){
        listBuilder.addAll(typeImagesOverride);
        continue;
      }
      List<Set<Type>> energyTypes = card.getEffectiveEnergyTypes();
      listBuilder.addAll(TWCommon.generateTypeImages(energyTypes));
    }
    energyTypeImages = listBuilder.build();
  }

  public List<EnergyCard> getEnergyCards(){
    List<EnergyCard> list = new ArrayList<EnergyCard>();
    for (Iterator<Card> iterator = cards().iterator(); iterator.hasNext();) {
      Card card = iterator.next();
      if(card.getCardTypes().isEnergy()){
        list.add((EnergyCard) card);
      }
    }
    return Collections.unmodifiableList(list);
  }

  public List<PokemonCard> getPokemonCards(){
    ArrayList<PokemonCard> list = new ArrayList<PokemonCard>();
    for (Iterator<Card> iterator = cards().iterator(); iterator.hasNext();) {
      Card card = iterator.next();
      if(card.getCardTypes().isPokemon()){
        list.add((PokemonCard) card);
      }
    }
    return Collections.unmodifiableList(list);
  }

  public HP getFullHP(Battleground bg){
    return bg.em().activateGetter(new GetFullHP(this));
  }
  public HP getFullHP(){
    return TcgStatics.bg().em().activateGetter(new GetFullHP(this));
  }

  public HP getRemainingHP(Battleground bg){
    HP fullHP = getFullHP(bg);
    return (HP.valueOf(fullHP.getValue() - damage.getValue()));
  }

  public HP getRemainingHP(){
    HP fullHP = getFullHP(TcgStatics.bg());
    return (HP.valueOf(fullHP.getValue() - damage.getValue()));
  }

  public HP getDamage(){
    return damage;
  }

  public int getNumberOfDamageCounters(){
    return damage.getValue()/10;
  }

  public PlayerType getOwner() {
    return owner;
  }

  public void setOwner(PlayerType owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PokemonCardSet that = (PokemonCardSet) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public void setDamage(HP damage) {
    this.damage = damage;
  }

  public void addSpecialCondition(SpecialConditionType type){
    specialConditions.add(type);
  }

  public Set<SpecialConditionType> getSpecialConditions() {
    return specialConditions;
  }

//	public void addEvolutionChain(PokemonCard evolution) {
//		evolutionChain.put(getTopPokemonCard(), evolution);
//		set.add(evolution);
//	}
//
//	public PokemonCard removeTopEvolutionChain(){
//		PokemonCard pokemonCard = getTopPokemonCard();
//		evolutionChain.remove(pokemonCard);
//		set.remove(pokemonCard);
//		return pokemonCard;
//	}
//
//	public Map<PokemonCard, PokemonCard> getEvolutionChain() {
//		return evolutionChain;
//	}

  private String lastName = "?";

  public String getName(){
    try {
      lastName = getTopPokemonCard().getName();
      return lastName;
    } catch (Exception e) {
      return lastName;
    }
  }

  public boolean isActive(){
    return TcgStatics.bg().getPBG(owner).getActive() == this;
  }

  public boolean isBenched(){
    return TcgStatics.bg().getPBG(owner).getBench().contains(this);
  }

  public boolean isActive(Battleground bg){
    return bg.getPBG(owner).getActive() == this;
  }

  public boolean isBenched(Battleground bg){
    return bg.getPBG(owner).getBench().contains(this);
  }

  public boolean isInPlay(){
    return isActive() || isBenched();
  }

  public boolean isEX() {
    return getTopPokemonCard().getCardTypes().is(CardType.EX);
  }
  
  public boolean isPokemonDelta() {
    List<PlayerType> Holon_Veil = TcgStatics.bg().em().retrieveObject("Holon_Veil")
    return getCardTypes().is(CardType.DELTA) || (getCardTypes().is(CardType.POKEMON) && Holon_Veil.contains(this.player));
  }

  public boolean isPokemonEX(){
    return getTopPokemonCard().getCardTypes().is(CardType.POKEMON_EX);
  }

  public boolean isPokemonBreak(){
    return getTopPokemonCard().getCardTypes().is(CardType.BREAK);
  }

  public boolean isPokemonGX(){
    return getTopPokemonCard().getCardTypes().is(CardType.POKEMON_GX);
  }

  public boolean isTagTeam(){
    return getTopPokemonCard().getCardTypes().is(CardType.TAG_TEAM);
  }

  public List<Weakness> getWeaknesses(Battleground bg){
    return bg.em().activateGetter(new GetWeaknesses(this));
  }
  public List<Weakness> getWeaknesses(){
    return getWeaknesses(Battleground.getInstance());
  }
  public List<Resistance> getResistances(Battleground bg){
    return bg.em().activateGetter(new GetResistances(this));
  }
  public List<Resistance> getResistances(){
    return getResistances(Battleground.getInstance());
  }

  public TypeSet getTypes(Battleground bg){
    return bg.em().activateGetter(new GetPokemonType(this));
  }
  public TypeSet getTypes(){
    return Battleground.getInstance().em().activateGetter(new GetPokemonType(this));
  }
  public Integer getEnergyCount(Battleground bg){
    return bg.em().activateGetter(new GetEnergyCount(this));
  }
  public boolean noSPC(){
    return specialConditions.isEmpty();
  }
  public boolean checkSpecialConditionsForClassic() {
    if(Battleground.getInstance().getGame().getFormat() == GameFormat.MODIFIED_2002_2003) {
      return specialConditions.isEmpty();
    } else {
      for (SpecialConditionType sct : specialConditions) {
        if(sct == SpecialConditionType.PARALYZED || sct == SpecialConditionType.ASLEEP || sct == SpecialConditionType.CONFUSED) {
          return false;
        }
      }
      return true;
    }
  }
  public boolean isSPC(SpecialConditionType type){
    return specialConditions.contains(type);
  }
  public boolean isSlatedToKO(){
    return getRemainingHP()==HP.HP000;
  }
  public int getRetreatCost(){
    return Battleground.getInstance().em().activateGetter(new GetRetreatCost(this));
  }
  public Map<Ability, PokemonCard> getAbilities(){
    lastAbilities = Battleground.getInstance().em().activateGetter(new GetAbilities(this));
    return lastAbilities;
  }
  public Map<Ability, PokemonCard> getLastAbilities() {
    // copying this map is very important. If not done, then a second call to CheckAbilities removes the currently processing Ability from the map, leading to ConcurrentModificationException.
    return lastAbilities != null ? new THashMap<>(lastAbilities) : new THashMap<>();
  }

  public boolean isTeamPlasma(){
    return cards().filterByNameEquals("Team Plasma Badge").notEmpty() || getTopPokemonCard().getCardTypes().is(CardType.TEAM_PLASMA);
  }
  public boolean hasModernAbility(){
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof BwAbility) return true;
    }
    return false;
    // even global abilities need to be defined as regular ability with no effect
//		return getTopPokemonCard().getGlobalAbilities().size() > 0;
  }
  public boolean hasPokePower(){
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof PokePower) return true;
    }
    return false;
  }
  public boolean hasPokeBody(){
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof PokeBody) return true;
    }
    return false;
  }
  public boolean isMegaEvolution(){
    return getTopPokemonCard().getCardTypes().is(CardType.MEGA_POKEMON);
  }

  @Override
  public String toString() {
    return getName();
//		return "\n\tPokemonCardSet [set=" + cards() + ", damage=" + damage + "]" ;
  }

  public String getShortId(){
    return id.substring(0,6);
  }
  public String getNameWithShortId(){
    return getName()+" ("+getShortId()+")";
  }

//	public void setCards(CardList set) {
//		this.set = set;
//	}

}
