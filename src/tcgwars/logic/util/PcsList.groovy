package tcgwars.logic.util

import tcgwars.logic.groovy.TcgStatics
import tcgwars.logic.Battleground;
import tcgwars.logic.PlayerType
import tcgwars.logic.client.PokemonSelectUIRequestBuilder;

/**
 * @author axpendix@hotmail.com
 */
public class PcsList extends ArrayList<PokemonCardSet> implements PokemonStack {

  public PcsList() {
  }
  public PcsList(PokemonCardSet ...pcs) {
    this(Arrays.asList(pcs));
  }
  public PcsList(List<PokemonCardSet> list){
    super(list);
  }
  public PokemonCardSet select (String info, PlayerType playerType){
    return select(info,true,playerType)
  }
  public PokemonCardSet select (String info="Select", boolean required=true, PlayerType playerType=TcgStatics.bg().currentThreadPlayerType){
    if(playerType!=TcgStatics.bg().currentThreadPlayerType){
      TcgStatics.block()
    }
    def ret=TcgStatics.bg().getClient(playerType).selectPokemon(new PokemonSelectUIRequestBuilder().setInfo(info).setTargets(this).setRequired(required));
    if(playerType!=TcgStatics.bg().currentThreadPlayerType){
      TcgStatics.unblock()
    }
    return ret
  }
  public PokemonCardSet oppSelect (String info="Select"){
    TcgStatics.block()
    def ret=TcgStatics.bg().oppClient().selectPokemon(new PokemonSelectUIRequestBuilder().setInfo(info).setTargets(this));
    TcgStatics.unblock()
    return ret
  }
  public PokemonCardSet ownSelect(Battleground bg, String info){
    return bg.ownClient().selectPokemon(new PokemonSelectUIRequestBuilder().setInfo(info).setTargets(this));
  }
  public PokemonCardSet oppSelect(Battleground bg, String info){
    TcgStatics.block()
    def ret=bg.oppClient().selectPokemon(new PokemonSelectUIRequestBuilder().setInfo(info).setTargets(this));
    TcgStatics.unblock()
    return ret
  }
  public boolean isNotEmpty(){
    return !isEmpty();
  }
  public boolean notEmpty(){
    return !isEmpty();
  }
  public static PcsList unmodifiableList(List<PokemonCardSet> list){
    return new PcsList(Collections.unmodifiableList(list));
  }
  public PcsList findAll(Closure c){
    PcsList nl=new PcsList();
    this.each {if(c(it)) nl.add(it)}
    nl
  }
  public int sum(Closure closure){
    int total = 0
    each {total+=closure.call(it)}
    return total
  }

}
