package tcgwars.logic.util

public enum AssertString {
    MY_DECK('my.deck', "Your deck is empty"),
    MY_HAND('my.hand', "Your hand is empty"),
    OPP_DECK('opp.deck', "Your opponent's deck is empty"),
    OPP_HAND('opp.hand', "Your opponent's hand is empty"),
    MY_HAND_OPP_HAND('my.hand.or.opp.hand', "There are no cards in either hand"),
    MY_DECK_OPP_DECK('my.deck.or.opp.deck', "There are no cards in either deck"),
    MY_DECK_MY_HAND('my.deck.or.my.hand', "There are no cards in your deck or hand"),
    MY_DISCARD('my.discard', "Your discard pile is empty"),
    OPP_DISCARD('opp.discard', "Your opponent's discard pile is empty"),
    MY_HAND_FILTER('my.hand.filter', "Not in hand"),
    MY_DISCARD_FILTER('my.discard.filter', "Not in discard pile"),
    OPP_DISCARD_FILTER('opp.discard.filter', "Not in opponent's discard pile"),
    OPP_ACTIVE_DAMAGE('opp.active.numberOfDamageCounters', "The defending Pokémon has no damage counters on it"),
    MY_ACTIVE_DAMAGE('my.active.numberOfDamageCounters', "Your active Pokémon has no damage counters on it"),
    SELF_ACTIVE('self.active', "This is not your active Pokémon"),
    ATTACHED_ENERGY('energy.energyCount', "Required energy not attached"),
    ALREADY_USED('already.used', "Already used"),
    FIRST_TURN('first.turn', "You cannot do this on your first turn")

    final String id
    final String text
    static final Map map

    static {
        map = [:]
        values().each { string ->
            map.put(string.id, string)
        }
    }
    private AssertString(String id, String text) {
        this.id = id;
        this.text = text;
    }
    static getAssertString(id) {
        map[id].text
    }
    static getAssertString(id, addInfo) {
        "${map[id].text}: $addInfo"
    }
}
