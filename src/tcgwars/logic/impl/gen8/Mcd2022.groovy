package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum Mcd2022 implements ImplOnlyCardInfo {

  LEDYBA_1,
  ROWLET_2,
  GOSSIFLEUR_3,
  GROWLITHE_4,
  VICTINI_5,
  LAPRAS_6,
  PIKACHU_7,
  CHINCHOU_8,
  FLAAFFY_9,
  TYNAMO_10,
  CUTIEFLY_11,
  BEWEAR_12,
  PANGORO_13,
  DRAMPA_14,
  SMEARGLE_15
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":MCD_2022";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {






























        default:
      return null;
    }
  }
}