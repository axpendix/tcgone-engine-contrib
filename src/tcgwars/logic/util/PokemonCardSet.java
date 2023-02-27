package tcgwars.logic.util;


import com.google.common.collect.ImmutableList;
import gnu.trove.map.hash.THashMap;
import gnu.trove.set.hash.THashSet;
import tcgwars.logic.Battleground;
import tcgwars.logic.GameFormat;
import tcgwars.logic.PlayerType;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.EnergyCard;
import tcgwars.logic.card.pokemon.PokemonCard;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.ExtraEnergyCalculator;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.SpecialConditionType;
import tcgwars.logic.groovy.TcgStatics;

import java.io.Serializable;
import java.util.*;

import static tcgwars.logic.card.CardType.*;

/**
 * Models an in-game Pokemon
 *
 * @author axpendix@hotmail.com
 */
public class PokemonCardSet implements Serializable {

  /**
   * This list is automatically sorted (see {@link CardList#setAutosort(boolean)}).
   * The order is roughly: evolution cards, basic pokemon, trainers, energy.
   */
  private CardList set;

  private HP damage;
  private HP lastFullHP = null;

  private PlayerType owner;

  private Set<SpecialConditionType> specialConditions;

  public final String id;
  public final String ref;

  private String lastName = "{?}";
  private PokemonCard lastTopPokemonCard = null;

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
    set = new CardList(Collections.emptyList(), CardList.ZoneType.PCS, owner);
    set.setAutosort(true);
    damage = HP.HP000;
    this.owner = owner;
    this.specialConditions = new THashSet<>();
    this.id = UUID.randomUUID().toString();
    this.ref = owner.getPbg().nextRef();
  }

  /**
   * literally: evolution
   */
  public boolean isRealEvolution() {
    return getTopPokemonCard().getCardTypes().contains(EVOLUTION);
  }

  /**
   * literally: evolved
   */
  public boolean isEvolution() {
    return getPokemonCards().size() > 1;
  }

  /**
   * means it is not an evolved card = basic.
   * but beware that if baby evolution is done, than that is an evolved one even though it writes basic on it.
   *
   * @return
   */
  public boolean isNotEvolution() {
    return !isEvolution();
  }

  /**
   * this will check the top non-level-up card in the PCS being Basic stage.
   *
   * @see #isNotEvolution() for checking EX and earlier definition of "Basic Pokémon" in play.
   */
  public boolean isBasic() {
    return getTopNonLevelUpPokemonCard().getCardTypes().is(CardType.BASIC);
  }
  public boolean isStage1() {
    return getTopNonLevelUpPokemonCard().getCardTypes().is(CardType.STAGE1);
  }
  public boolean isStage2() {
    return getTopNonLevelUpPokemonCard().getCardTypes().is(CardType.STAGE2);
  }

  public PokemonCard getTopPokemonCard() {
    Card card = cards().first();
    if (card == null) {
      RuntimeException exception = new IllegalStateException(String.format("topPokemonCard() called on empty Pokemon. lastName:%s", lastName));
      if (lastTopPokemonCard == null) { // only throw the exception if there were no topCard at all.
        throw exception;
      } else { // otherwise, just report a warning.
        Battleground.getInstance().getGameManager().reportWarning(exception);
        return lastTopPokemonCard;
      }
    }
    if (!(card instanceof PokemonCard)) { // (!card.getStaticCardTypes().isPokemon())
      throw new IllegalStateException("Top card is not a PokemonCard. lastName:" + lastName);
    }
    lastTopPokemonCard = (PokemonCard) card;
    return lastTopPokemonCard;
  }

  public PokemonCard getTopNonBreakPokemonCard() {
    for (Card card : cards().filterByType(POKEMON)) {
      if (card.getStaticCardTypes().is(CardType.BREAK)) continue;
      return card.asPokemonCard();
    }
    return null; //Should an IllegalStateException be thrown here, same as above?
  }

  public PokemonCard getTopNonLevelUpPokemonCard() {
    for (Card card : cards().filterByType(POKEMON)) {
      if (card.getStaticCardTypes().is(CardType.LVL_X)) continue;
      return card.asPokemonCard();
    }
    return null;
  }

  public CardList getCards() {
    return set;
  }

  public CardList cards() {
    return set;
  }

  public List<Type> generateEnergyTypeImages() {
    List<EnergyCard> energyCards = getEnergyCards();
    ImmutableList.Builder<Type> listBuilder = ImmutableList.builder();
    for (EnergyCard card : energyCards) {
      List<Type> typeImagesOverride = card.getTypeImagesOverride();
      List<Set<Type>> effectiveEnergyTypes = card.getEffectiveEnergyTypes();
      List<Set<Type>> nonModifiedEnergyTypes = card.getEnergyTypes();
      if (effectiveEnergyTypes.equals(nonModifiedEnergyTypes) && typeImagesOverride != null) {
        // only use the override when energy types are not altered
        listBuilder.addAll(typeImagesOverride);
      } else {
        // otherwise disregard the override and always generate the images
        listBuilder.addAll(LUtils.generateTypeImages(effectiveEnergyTypes));
      }
    }
    return listBuilder.build();
  }

  public List<EnergyCard> getEnergyCards() {
    List<EnergyCard> list = new ArrayList<EnergyCard>();
    for (Iterator<Card> iterator = cards().iterator(); iterator.hasNext(); ) {
      Card card = iterator.next();
      if (card.getCardTypes().isEnergy()) {
        list.add((EnergyCard) card);
      }
    }
    return Collections.unmodifiableList(list);
  }

  public List<PokemonCard> getPokemonCards() {
    ArrayList<PokemonCard> list = new ArrayList<PokemonCard>();
    for (Iterator<Card> iterator = cards().iterator(); iterator.hasNext(); ) {
      Card card = iterator.next();
      if (card.getCardTypes().isPokemon()) {
        list.add((PokemonCard) card);
      }
    }
    return Collections.unmodifiableList(list);
  }

  public CardList getPokemonCardsExceptTop() {
    Card topCard = cards().first();
    CardList list = new CardList();
    for (Card card : cards()) {
      if (card.getCardTypes().isPokemon() && card != topCard) {
        list.add(card);
      }
    }
    return list;
  }

  public HP getFullHP(Battleground bg) {
    lastFullHP = bg.em().activateGetter(new GetFullHP(this));
    return lastFullHP;
  }

  public HP getFullHP() {
    lastFullHP = TcgStatics.bg().em().activateGetter(new GetFullHP(this));
    return lastFullHP;
  }
  public HP getLastFullHP() {
    return lastFullHP;
  }

  public HP getRemainingHP(Battleground bg) {
    HP fullHP = getFullHP(bg);
    return (HP.valueOf(fullHP.getValue() - damage.getValue()));
  }

  public HP getRemainingHP() {
    HP fullHP = getFullHP(TcgStatics.bg());
    return (HP.valueOf(fullHP.getValue() - damage.getValue()));
  }

  public HP getDamage() {
    return damage;
  }

  public int getNumberOfDamageCounters() {
    return damage.getValue() / 10;
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

  public void addSpecialCondition(SpecialConditionType type) {
    specialConditions.add(type);
  }

  public Set<SpecialConditionType> getSpecialConditions() {
    return specialConditions;
  }

  public String getName() {
    try {
      lastName = getTopPokemonCard().getName();
      return lastName;
    } catch (Exception e) {
      return lastName;
    }
  }


  public boolean isActive() {
    return TcgStatics.bg().getPBG(owner).getActive() == this;
  }

  public boolean isBenched() {
    return TcgStatics.bg().getPBG(owner).getBench().contains(this);
  }

  public boolean isActive(Battleground bg) {
    return bg.getPBG(owner).getActive() == this;
  }

  public boolean isBenched(Battleground bg) {
    return bg.getPBG(owner).getBench().contains(this);
  }

  public boolean isInPlay() {
    return isActive() || isBenched();
  }

  public boolean isEX() {
    return getTopPokemonCard().getCardTypes().is(CardType.EX);
  }

  public boolean isPokemonEX() {
    return getTopPokemonCard().getCardTypes().is(CardType.POKEMON_EX);
  }

  public boolean isPokemonLevelUp() {
    return getTopPokemonCard().getCardTypes().is(CardType.LVL_X);
  }

  public boolean isPokemonSP() { return getTopPokemonCard().getCardTypes().is(CardType.POKEMON_SP); }

  public boolean isPokemonBreak() {
    return getTopPokemonCard().getCardTypes().is(CardType.BREAK);
  }

  public boolean isPokemonGX() {
    return getTopPokemonCard().getCardTypes().is(CardType.POKEMON_GX);
  }

  public boolean isTagTeam() {
    return getTopPokemonCard().getCardTypes().is(CardType.TAG_TEAM);
  }

  public boolean isPokemonV() {
    return getTopPokemonCard().getCardTypes().isIn(CardType.POKEMON_V, CardType.VMAX);
  }

  public boolean isPokemonVMAX() {
    return getTopPokemonCard().getCardTypes().is(CardType.VMAX);
  }

  public boolean isRapidStrike() {
    return getTopPokemonCard().getCardTypes().is(CardType.RAPID_STRIKE);
  }

  public boolean isSingleStrike() {
    return getTopPokemonCard().getCardTypes().is(CardType.SINGLE_STRIKE);
  }

  public boolean isRuleBox() {
    return getTopPokemonCard().getCardTypes().isIn(CardType.POKEMON_EX, CardType.BREAK, CardType.MEGA_POKEMON,
      CardType.PRISM_STAR, CardType.POKEMON_GX, CardType.TAG_TEAM, CardType.POKEMON_V, CardType.VMAX);
  }

  public List<Weakness> getWeaknesses(Battleground bg) {
    return bg.em().activateGetter(new GetWeaknesses(this));
  }

  public List<Weakness> getWeaknesses() {
    return getWeaknesses(Battleground.getInstance());
  }

  public List<Resistance> getResistances(Battleground bg) {
    return bg.em().activateGetter(new GetResistances(this));
  }

  public List<Resistance> getResistances() {
    return getResistances(Battleground.getInstance());
  }

  public TypeSet getTypes(Battleground bg) {
    return bg.em().activateGetter(new GetPokemonType(this));
  }

  public TypeSet getTypes() {
    return Battleground.getInstance().em().activateGetter(new GetPokemonType(this));
  }

  public Integer getEnergyCount(Battleground bg) {
    return bg.em().activateGetter(new ExtraEnergyCalculator(this, Type.COLORLESS));
  }

  public boolean noSPC() {
    return specialConditions.isEmpty();
  }

  public boolean checkSpecialConditionsForClassic() {
    if (Battleground.getInstance().gameFormat == GameFormat.MODIFIED_2002_2003) {
      return specialConditions.isEmpty();
    } else {
      for (SpecialConditionType sct : specialConditions) {
        if (sct == SpecialConditionType.PARALYZED || sct == SpecialConditionType.ASLEEP || sct == SpecialConditionType.CONFUSED) {
          return false;
        }
      }
      return true;
    }
  }

  public boolean isSPC(SpecialConditionType type) {
    return specialConditions.contains(type);
  }

  public boolean isSlatedToKO() {
    return getRemainingHP() == HP.HP000;
  }

  public int getRetreatCost() {
    return Battleground.getInstance().em().activateGetter(new GetRetreatCost(this));
  }

  public Map<Ability, PokemonCard> getAbilities() {
    lastAbilities = Battleground.getInstance().em().activateGetter(new GetAbilities(this));
    return lastAbilities;
  }

  public Map<Ability, PokemonCard> getLastAbilities() {
    // copying this map is very important. If not done, then a second call to CheckAbilities removes the currently processing Ability from the map, leading to ConcurrentModificationException.
    return lastAbilities != null ? new THashMap<>(lastAbilities) : new THashMap<>();
  }

  public boolean isTeamPlasma() {
    return getTopPokemonCard().getCardTypes().is(CardType.TEAM_PLASMA);
  }

  public boolean hasModernAbility() {
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof BwAbility) return true;
    }
    return false;
    // even global abilities need to be defined as regular ability with no effect
  }

  public boolean hasPokePower() {
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof PokePower) return true;
    }
    return false;
  }

  public boolean hasPokeBody() {
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof PokeBody) return true;
    }
    return false;
  }

  public boolean hasPokemonPower() {
    for (Ability ability : getAbilities().keySet()) {
      if (ability instanceof PokemonPower) return true;
    }
    return false;
  }

  public boolean isMegaEvolution() {
    return getTopPokemonCard().getCardTypes().is(CardType.MEGA_POKEMON);
  }

  @Override
  public String toString() {
    if (getTopPokemonCard().getCardTypes().contains(LVL_X)) {
      return getName() + " Lv.X";
    }
    return getName();
  }

  public String getNameWithRef() {
    return getName() + " {" + ref + "}";
  }

  public String toDebugString() {
    return "Pokemon{" +
        ", name='" + toString() + '\'' +
        ", ref='" + ref + '\'' +
        ", owner=" + owner +
        "cards=" + set +
        '}';
  }
}
