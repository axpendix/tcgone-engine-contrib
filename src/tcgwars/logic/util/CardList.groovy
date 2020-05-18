package tcgwars.logic.util

import org.codehaus.groovy.runtime.DefaultGroovyMethods
import tcgwars.logic.PlayerType
import tcgwars.logic.card.energy.BasicEnergyCard
import tcgwars.logic.effect.basic.EnergySufficientGetter
import tcgwars.logic.effect.basic.MoveCard
import tcgwars.logic.groovy.TcgStatics
import org.springframework.data.annotation.PersistenceConstructor;

import tcgwars.logic.Battleground;
import tcgwars.logic.card.Card;
import tcgwars.logic.card.CardType;
import tcgwars.logic.card.Type;
import tcgwars.logic.card.energy.EnergyCard;
import tcgwars.logic.effect.advanced.ExtraEnergyCalculator;
import tcgwars.logic.effect.basic.Discard;
import tcgwars.logic.client.CardSelectUIRequestBuilder;
import tcgwars.logic.client.CardSelectUIRequestBuilder.CustomCardFilter;
import tcgwars.logic.client.CardSelectUIRequestBuilder.CustomPassFilter

/**
 * @author axpendix@hotmail.com
 */
public class CardList extends ArrayList<Card> {

  private static final long serialVersionUID = 1167669133955381848L;

  public enum CardListType{
    PERSISTENT, TEMPORARY;
  }

  private boolean autosort = false;
  protected CardListType type = CardListType.TEMPORARY;
  protected String persistentName;

  @PersistenceConstructor
  public CardList() {
    super();
  }

  public CardList(Collection<? extends Card> c) {
    super(c);
  }

  public CardList(Card...cards){
    this(Arrays.asList(cards));
  }

  public CardList(String persistentName) {
    this.persistentName = persistentName
    this.type = CardListType.PERSISTENT
  }

  public CardList(String persistentName, int initialSize) {
    super(initialSize)
    this.persistentName = persistentName
    this.type = CardListType.PERSISTENT
  }

  public CardList copy(){
    return new CardList(this);
  }

  List<String> getFullNames(){
    this.collect {it.fullName}
  }

  String getPersistentName() {
    return persistentName
  }

  boolean isPersistent(){
    type == CardListType.PERSISTENT
  }

  public CardList setAutosort(boolean autosort) {
    this.autosort = autosort;
    if(autosort){
      Collections.sort(this);
    }
    return this;
  }

  public CardList setType(CardListType type) {
    this.type = type;
    return this;
  }

  public boolean hasTrainer() {
    for (Card c : this) {
      if (c.getCardTypes().isTrainer()) {
        return true;
      }
    }
    return false;
  }

  public boolean hasPokemon() {
    for (Card c : this) {
      if (c.getCardTypes().isPokemon()) {
        return true;
      }
    }
    return false;
  }

  public boolean hasEnergy() {
    for (Card c : this) {
      if (c.getCardTypes().isEnergy()) {
        return true;
      }
    }
    return false;
  }

  public boolean hasEvolution() {
    for (Card c : this) {
      if (c.getCardTypes().isEvolution()) {
        return true;
      }
    }
    return false;
  }

  public boolean hasType(CardType type){
    for (Card c : this) {
      if (c.getCardTypes().is(type)) {
        return true;
      }
    }
    return false;
  }

  public boolean hasEnergyType(Type type){
    return !filterByEnergyType(type).isEmpty();
  }

  public CardList filterByEnergyType(Type type){
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card c : this.filterByType(CardType.BASIC_ENERGY, CardType.SPECIAL_ENERGY)) {
      if (((EnergyCard)c).containsType(type)) {
        newlist.add(c);
      }
    }
    return newlist;
  }

  public CardList filterByBasicEnergyType(Type type){
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card c : this.filterByType(CardType.BASIC_ENERGY)) {
      if (((BasicEnergyCard)c).containsTypePlain(type)) {
        newlist.add(c);
      }
    }
    return newlist;
  }

  public CardList filterByType(CardType... type){
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card card : this) {
      if (card.getCardTypes().isIn(type)) {
        newlist.add(card);
      }
    }
    return newlist;
  }

  public CardList filterByAllType(CardType... type){
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card card : this) {
      if (card.getCardTypes().isAll(type)) {
        newlist.add(card);
      }
    }
    return newlist;
  }

  public CardList filterByNameEquals(String... names){
    List<String> namess = Arrays.asList(names);
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card card : this) {
      if (namess.contains(card.getName())) {
        newlist.add(card);
      }
    }
    return newlist;
  }

  public CardList filterByNameLike(String... names){
    List<String> namess = Arrays.asList(names);
    CardList newlist =new CardList().setType(CardListType.TEMPORARY)
    for (Card card : this) {
      for (String string : namess) {
        if (card.getName().contains(string)) {
          newlist.add(card);
        }
      }
    }
    return newlist;
  }

  public CardList getExcludedList(Card...exclusion){
    return getExcludedList(new CardList(exclusion))
  }
  public CardList getExcludedList(CardList exclusion){
    CardList newlist = new CardList(this).setType(CardListType.TEMPORARY)
    for (Card card : exclusion) {
      newlist.remove(card);
    }
    return newlist;
  }

  public ArrayList<EnergyCard> getAsEnergyCards(){
    ArrayList<EnergyCard> l = new ArrayList<EnergyCard>();
    for(Card c:this) {
      if(c.getCardTypes().isEnergy()) {
        l.add((EnergyCard) c);
      }
    }
    return l;
  }
  @Override
  public boolean removeAll(Collection<?> c) {
    return super.removeAll(c);
//		for (Object o : c) {
//			this.remove(o);
//		}
//		return true;
  }

  @Override
  public CardList subList(int from, int to) {
    if (this.size() <= from) {
      throw new IllegalArgumentException("CardList.subList() out of bounds. Size: "+this.size()+", from: "+from+", to: "+to);
    }
    while (this.size() < to) {
      to--;
    }
    return new CardList(super.subList(from, to));
  }

  public void addSubList(int from, CardList added){
    for (int i=from; i<added.size()+from; i++){
      this.add(i, added.get(i-from));
    }
  }

  public void setSubList(int from, CardList replacement){
    if (this.size() < from) {
      throw new IllegalArgumentException();
    }
    for (int i=from; i<replacement.size()+from; i++){
      this.set(i, replacement.get(i-from));
    }
  }

  @Override
  public boolean equals(Object arg0) {
    if (arg0 instanceof CardList) {
      CardList cl = ((CardList)arg0);
      if (cl.size() == this.size()) {
        for (Card card : cl) {
          if (!this.contains(card)) {
            return false;
          }
        }
      }
      else{
        return false;
      }
      return true;
    }
    return false;
  }

  public boolean isNotEmpty(){
    return !isEmpty();
  }
  public boolean notEmpty(){
    return !isEmpty();
  }
  def CardList select(Closure filter={true}, PlayerType playerType=TcgStatics.bg().currentThreadPlayerType){
    select([:], "Select", filter, playerType)
  }
  def CardList select(Map params, Closure filter={true}, PlayerType playerType=TcgStatics.bg().currentThreadPlayerType){
    select(params, "Select", filter, playerType)
  }
  def CardList select(String info, Closure filter={true}, PlayerType playerType=TcgStatics.bg().currentThreadPlayerType){
    select([:], info, filter, playerType)
  }
  def CardList select (Map params, String info, Closure filter={true}, PlayerType playerType=TcgStatics.bg().currentThreadPlayerType, Closure passFilter={true}){
    int min=params.get("min")!=null?params.get("min"):1
    int max=params.get("max")!=null?params.get("max"):1
    int count=params.get("count")?:0
    if(count){
      count=Math.min(this.size(),count)
      min=count
      max=count
    }
    boolean hidden=params.hidden?:false
    if(playerType!=TcgStatics.bg().currentThreadPlayerType){
      TcgStatics.block()
    }
    def ret= TcgStatics.bg().getClient(playerType).selectCard(new CardSelectUIRequestBuilder()
      .setMinMax(min,max).setInfo(info).setCards(this).setCustomCardFilter(filter as CardSelectUIRequestBuilder.CustomCardFilter).setCustomPassFilter(passFilter as CardSelectUIRequestBuilder.CustomPassFilter)
      .setShowAsHidden(hidden))
      .setType(CardListType.TEMPORARY)
    if(playerType!=TcgStatics.bg().currentThreadPlayerType){
      TcgStatics.unblock()
    }
    return ret
  }
  def CardList select (String info, int min, int max, PlayerType playerType, CustomCardFilter cardFilter, CustomPassFilter passFilter){
    select(min:min, max:max, info, cardFilter?{cardFilter.isSelectable(it)}:{true},	playerType?:TcgStatics.bg().currentThreadPlayerType, passFilter?{passFilter.isAcceptable(it)}:{true});
  }
  def CardList oppSelect (String info="Select", Closure filter={true}){
    select(info, filter, TcgStatics.bg().currentThreadPlayerType.getOpposite())
  }
  def CardList oppSelect (Map params, String info="Select", Closure filter={true}){
    select(params, info, filter, TcgStatics.bg().currentThreadPlayerType.getOpposite())
//		int min=params.get("min")!=null?params.get("min"):1
//		int max=params.get("max")!=null?params.get("max"):1
//		boolean hidden=params.hidden?:false
//		return TcgStatics.bg().oppClient().selectCard(new CardSelectUIRequestBuilder()
//				.setMinMax(min,max).setInfo(info).setCards(this).setCustomCardFilter(filter as CardSelectUIRequestBuilder.CustomCardFilter)
//				.setShowAsHidden(hidden))
//				.setType(CardListType.TEMPORARY)
  }

  public CardList ownSelect(Battleground bg, String info, int min, int max, CardType... filters){
    return bg.ownClient().selectCard(new CardSelectUIRequestBuilder().setCards(this).setMinMax(min, max).setInfo(info).addCardType(filters))
      .setType(CardListType.TEMPORARY)
  }
  public CardList oppSelect(Battleground bg, String info, int min, int max, CardType... filters){
    return bg.oppClient().selectCard(new CardSelectUIRequestBuilder().setCards(this).setMinMax(min, max).setInfo(info).addCardType(filters))
      .setType(CardListType.TEMPORARY)
  }
  public CardList showToMe(Battleground bg=TcgStatics.bg(), String info){
    if (this.notEmpty()){
      bg.oppClient().block();
      bg.ownClient().selectCard(new CardSelectUIRequestBuilder().setCards(this).setMinMax(0, 0).setInfo(info));
      bg.oppClient().unblock();
    }
    return this;
  }
  public CardList showToOpponent(Battleground bg=TcgStatics.bg(), String info){
    if (this.notEmpty()){
      bg.ownClient().block();
      bg.oppClient().selectCard(new CardSelectUIRequestBuilder().setCards(this).setMinMax(0, 0).setInfo(info));
      bg.ownClient().unblock();
    }
    return this;
  }

//	@Override
//	public Object[] toArray(){
//		Card[] arr = new Card[size()];
//		for (int i = 0; i < size(); i++) {
//			arr[i]=get(i);
//		}
//		return arr;
//	}
  public CardList addAllReturn(CardList cardList){
    addAll(cardList);
    return this;
  }
  public Card first(){
    if(isEmpty()) return null;
    else return get(0);
  }

  public void add(int index, Card element) {
    if (autosort) {
      throw new IllegalStateException("Autosort is active, use add(element) instead.");
    }
    element.containerAddTime=System.currentTimeMillis()
    super.add(index, element);
    if (autosort) {
      Collections.sort(this);
    }
  }
  public boolean add(Card e) {
    if(e) e.containerAddTime=System.currentTimeMillis()
    boolean ret = super.add(e);
    if (autosort) {
      Collections.sort(this);
    }
    return ret;
  }
  public boolean addAll(int index, Collection<? extends Card> c) {
    if (autosort) {
      throw new IllegalStateException("Autosort is active, use addAll(c) instead.");
    }
    for(e in c){
      if(e) e.containerAddTime=System.currentTimeMillis()
    }
    boolean ret = super.addAll(index, c);
    if (autosort) {
      Collections.sort(this);
    }
    return ret;
  }
  public boolean addAll(Collection<? extends Card> c) {
    boolean ret = super.addAll(c);
    for(e in c){
      if(e) e.containerAddTime=System.currentTimeMillis()
    }
    if (autosort) {
      Collections.sort(this);
    }
    return ret;
  }
  public CardList discard(){
    for (Card c:new CardList(this)) {
      Battleground.getInstance().em().activateEffect(new Discard(c));
    }
    return this
  }
  public CardList moveTo(params=[:], CardList newLocation){
    MoveCard effect = new MoveCard(copyWithoutNulls(this), newLocation)
    if(params.hidden)
      effect.hidden = params.hidden
    if(params.suppressLog)
      effect.suppressLog = params.suppressLog
    if(params.addToTop)
      effect.addToTop = params.addToTop
    effect.run(Battleground.getInstance())
    return this
  }
  public static CardList copyWithoutNulls(CardList list){
    CardList list1 = new CardList()
    for(Card card : list){
      list1.add(card) // iterator doesn't produce null values
    }
    return list1
  }
  public int energyCount(Type type=Type.COLORLESS){
    ArrayList<EnergyCard> asEnergyCards = getAsEnergyCards();
    return Battleground.getInstance().em().activateGetter(new ExtraEnergyCalculator(asEnergyCards, new ArrayList<Type>(), type));
  }
  public int energyCardCount(Type type=Type.COLORLESS){
    return type == Type.COLORLESS ?
      filterByType(CardType.ENERGY).size() :
      filterByEnergyType(type).size();
  }
  public boolean energySufficient(Type ... types){
    return Battleground.getInstance().em().activateGetter(new EnergySufficientGetter(getAsEnergyCards(), types))
  }
  public boolean energySufficient(List<Type> types){
    return Battleground.getInstance().em().activateGetter(new EnergySufficientGetter(getAsEnergyCards(), types))
  }
  public CardList findAll(Closure c){
    CardList nl=new CardList();
    this.each {if(c(it)) nl.add(it)}
    nl
  }
  public void shuffle(){
    if(autosort) throw new IllegalStateException("Autosort is active");
    Collections.shuffle(this, Battleground.getInstance().rng);
  }
  public CardList reverse(){
    return new CardList(DefaultGroovyMethods.reverse(this));
  }
}
