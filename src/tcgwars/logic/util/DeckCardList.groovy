package tcgwars.logic.util

import tcgwars.logic.PlayerType
import tcgwars.logic.card.Card
import tcgwars.logic.groovy.TcgStatics
import tcgwars.logic.client.CardSelectUIRequestBuilder
import tcgwars.logic.client.CardSelectUIRequestBuilder.CustomCardFilter
import tcgwars.logic.util.CardList

/**
 * @author axpendix@hotmail.com
 * @since 25.12.2013
 */
class DeckCardList extends CardList {
  DeckCardList(PlayerType playerType) {
    this(playerType, new ArrayList<Card>())
  }

  DeckCardList(PlayerType playerType, Collection<? extends Card> contents) {
    super(contents, ZoneType.DECK, playerType)
  }

  def CardList search(Closure filter) {
    search("Search", filter)
  }

  def CardList search(String info, Closure filter) {
    search([:], info, filter)
  }

  def CardList search(Map params, Closure filter) {
    search(params, "Search", filter)
  }

  def CardList search(Map params, String info, Closure filter) {
    int min = params.get("min") != null ? params.get("min") : 0
    int max = params.get("max") != null ? params.get("max") : 1
    return TcgStatics.bg().ownClient().selectCard(new CardSelectUIRequestBuilder()
      .setMinMax(min, max).setInfo(info).setCards(this).setCustomCardFilter(filter as CustomCardFilter))
  }

  def CardList search(Map params, String info, Closure filter, Closure passFilter) {
    int min = params.get("min") != null ? params.get("min") : 0
    int max = params.get("max") != null ? params.get("max") : 1
    return TcgStatics.bg().ownClient().selectCard(new CardSelectUIRequestBuilder()
      .setMinMax(min, max).setInfo(info).setCards(this).setCustomCardFilter(filter as CustomCardFilter)
      .setCustomPassFilter(passFilter as CardSelectUIRequestBuilder.CustomPassFilter))
  }

}
