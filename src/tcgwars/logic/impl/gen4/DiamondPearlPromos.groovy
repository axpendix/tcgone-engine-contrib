package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.NintendoBlackStarPromos;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*
import static tcgwars.logic.effect.Source.*;

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum DiamondPearlPromos implements LogicCardInfo {

  TURTWIG_DP01 ("Turtwig", "DP01", Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
  CHIMCHAR_DP02 ("Chimchar", "DP02", Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
  PIPLUP_DP03 ("Piplup", "DP03", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  PACHIRISU_DP04 ("Pachirisu", "DP04", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  TROPICAL_WIND_DP05 ("Tropical Wind", "DP05", Rarity.PROMO, [TRAINER, ITEM]),
  BUNEARY_DP06 ("Buneary", "DP06", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  CRANIDOS_DP07 ("Cranidos", "DP07", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SHIELDON_DP08 ("Shieldon", "DP08", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TORTERRA_LV_X_DP09 ("Torterra Lv.X", "DP09", Rarity.PROMO, [LVL_X, POKEMON, _GRASS_]),
  INFERNAPE_LV_X_DP10 ("Infernape Lv.X", "DP10", Rarity.PROMO, [LVL_X, POKEMON, _FIRE_]),
  EMPOLEON_LV_X_DP11 ("Empoleon Lv.X", "DP11", Rarity.PROMO, [LVL_X, POKEMON, _WATER_]),
  LUCARIO_LV_X_DP12 ("Lucario Lv.X", "DP12", Rarity.PROMO, [LVL_X, POKEMON, _FIGHTING_]),
  BUIZEL_DP13 ("Buizel", "DP13", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  CHATOT_DP14 ("Chatot", "DP14", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  SHINX_DP15 ("Shinx", "DP15", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  PIKACHU_DP16 ("Pikachu", "DP16", Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
  DIALGA_LV_X_DP17 ("Dialga Lv.X", "DP17", Rarity.PROMO, [LVL_X, POKEMON, _METAL_]),
  PALKIA_LV_X_DP18 ("Palkia Lv.X", "DP18", Rarity.PROMO, [LVL_X, POKEMON, _WATER_]),
  DARKRAI_LV_X_DP19 ("Darkrai Lv.X", "DP19", Rarity.PROMO, [LVL_X, POKEMON, _DARKNESS_]),
  MAGMORTAR_DP20 ("Magmortar", "DP20", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RAICHU_DP21 ("Raichu", "DP21", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MIME_JR__DP22 ("Mime Jr.", "DP22", Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
  GLAMEOW_DP23 ("Glameow", "DP23", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  DARKRAI_DP24 ("Darkrai", "DP24", Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
  TROPICAL_WIND_DP25 ("Tropical Wind", "DP25", Rarity.PROMO, [TRAINER]),
  DIALGA_DP26 ("Dialga", "DP26", Rarity.PROMO, [BASIC, POKEMON, _METAL_]),
  PALKIA_DP27 ("Palkia", "DP27", Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
  MEWTWO_LV_X_DP28 ("Mewtwo Lv.X", "DP28", Rarity.PROMO, [LVL_X, POKEMON, _PSYCHIC_]),
  RHYPERIOR_LV_X_DP29 ("Rhyperior Lv.X", "DP29", Rarity.PROMO, [LVL_X, POKEMON, _FIGHTING_]),
  REGIGIGAS_LV_X_DP30 ("Regigigas Lv.X", "DP30", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]),
  HEATRAN_LV_X_DP31 ("Heatran Lv.X", "DP31", Rarity.PROMO, [LVL_X, POKEMON, _FIRE_]),
  MAGNEZONE_DP32 ("Magnezone", "DP32", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  DUSKNOIR_DP33 ("Dusknoir", "DP33", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DRIFBLIM_DP34 ("Drifblim", "DP34", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  PORYGON_Z_DP35 ("Porygon-Z", "DP35", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  GLISCOR_DP36 ("Gliscor", "DP36", Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DIALGA_LV_X_DP37 ("Dialga Lv.X", "DP37", Rarity.PROMO, [LVL_X, POKEMON, _METAL_]),
  GIRATINA_LV_X_DP38 ("Giratina Lv.X", "DP38", Rarity.PROMO, [LVL_X, POKEMON, _PSYCHIC_]),
  SHAYMIN_LV_X_DP39 ("Shaymin Lv.X", "DP39", Rarity.PROMO, [LVL_X, POKEMON, _GRASS_]),
  REGIGIGAS_DP40 ("Regigigas", "DP40", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  TOXICROAK_G_DP41 ("Toxicroak G", "DP41", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
  CARNIVINE_G_DP42 ("Carnivine G", "DP42", Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
  PROBOPASS_G_DP43 ("Probopass G", "DP43", Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEZONE_DP44 ("Magnezone", "DP44", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  CHARIZARD_G_LV_X_DP45 ("Charizard G Lv.X", "DP45", Rarity.PROMO, [LVL_X, POKEMON, _FIRE_]),
  GARCHOMP_C_LV_X_DP46 ("Garchomp C Lv.X", "DP46", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]),
  RAYQUAZA_C_LV_X_DP47 ("Rayquaza C Lv.X", "DP47", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]),
  TROPICAL_WIND_DP48 ("Tropical Wind", "DP48", Rarity.PROMO, [TRAINER]),
  DIALGA_DP49 ("Dialga", "DP49", Rarity.PROMO, [BASIC, POKEMON, _METAL_]),
  ARCEUS_DP50 ("Arceus", "DP50", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  CRESSELIA_DP51 ("Cresselia", "DP51", Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
  DARKRAI_DP52 ("Darkrai", "DP52", Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
  ARCEUS_LV_X_DP53 ("Arceus Lv.X", "DP53", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]),
  BEGINNING_DOOR_DP54 ("Beginning Door", "DP54", Rarity.PROMO, [TRAINER]),
  ULTIMATE_ZONE_DP55 ("Ultimate Zone", "DP55", Rarity.PROMO, [TRAINER]),
  ARCEUS_LV_X_DP56 ("Arceus Lv.X", "DP56", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DiamondPearlPromos(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
    this.name = name;
    this.rarity = rarity;
    this.collectionLineNo = collectionLineNo;
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Rarity getRarity() {
    return rarity;
  }

  @Override
  public String getNumber() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.DIAMOND_PEARL_PROMOS;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case TURTWIG_DP01:
        return copy(DiamondPearl.TURTWIG_103, this);
      case CHIMCHAR_DP02:
        return copy(DiamondPearl.CHIMCHAR_76, this);
      case PIPLUP_DP03:
        return copy(DiamondPearl.PIPLUP_93, this);
      case PACHIRISU_DP04:
        return copy(DiamondPearl.PACHIRISU_35, this);
      case TROPICAL_WIND_DP05:
        return copy(NintendoBlackStarPromos.TROPICAL_WIND_26, this);
      case BUNEARY_DP06:
        return copy(DiamondPearl.BUNEARY_73, this);
      case CRANIDOS_DP07:
        return evolution (this, from:"Skull Fossil", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Headbutt", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Steamroll", {
            text "30 damage. Does 20 damage to 1 of your opponent�s Benched Pok�mon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHIELDON_DP08:
        return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Hard Face", {
            text "20 damage. ."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shield Attack", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 20 }
            }
          }

        };
      case TORTERRA_LV_X_DP09:
        return copy(DiamondPearl.TORTERRA_LV_X_122, this);
      case INFERNAPE_LV_X_DP10:
        return copy(DiamondPearl.INFERNAPE_LV_X_121, this);
      case EMPOLEON_LV_X_DP11:
        return copy(DiamondPearl.EMPOLEON_LV_X_120, this);
      case LUCARIO_LV_X_DP12:
        return levelUp (this, from:"Lucario", hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness P
          pokePower "Stance", {
            text "Once during your turn , when you put Lucario LV. from your hand onto your Active Lucario, you may use this power. Prevent all effects of an attack, including damage, done to Lucario during your opponent�s next turn. (If Lucario is no longer your Active Pok�mon, this effect ends.)"
            actionA {
            }
          }
          move "Close Combat", {
            text "80 damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case BUIZEL_DP13:
        return copy(DiamondPearl.BUIZEL_72, this);
      case CHATOT_DP14:
        return copy(DiamondPearl.CHATOT_74, this);
      case SHINX_DP15:
        return copy(DiamondPearl.SHINX_98, this);
      case PIKACHU_DP16:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Electro Recycle", {
            text "Once during your turn , if Pichu is anywhere under Pikachu, you may search your discard pile for a Energy card, show it to your opponent, and put it into your hand. This power can�t be used if Pikachu is affecte by a Special Condition."
            actionA {
            }
          }
          move "BikaBika", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }

        };
      case DIALGA_LV_X_DP17:
        return levelUp (this, from:"Dialga", hp:HP110, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokePower "Time Skip", {
            text "Once during your turn , you may have your opponent flip 2 coins. If both of them are heads, your turn ends. If both of them are tails, after your opponent draws a card at the beginning of his or her next turn, his or her turn ends. This power can�t be used if Dialga is affected by a Special Condition."
            actionA {
            }
          }
          move "Metal Flash", {
            text "80 damage. During your next turn, Dialga can�t use Metal Flash."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case PALKIA_LV_X_DP18:
        return levelUp (this, from:"Palkia", hp:HP120, type:WATER, retreatCost:3) {
          weakness L
          pokePower "Restructure", {
            text "Once during your turn , you may have your opponent switch 1 of your Active Pok�mon with 1 of your Bench Pok�mon. Then, you switch 1 of the Defending Pok�mon with 1 of your opponent�s Benched Pok�mon. This power can�t be used if Palkia is affected by a Special Condition."
            actionA {
            }
          }
          move "Hydro Reflect", {
            text "60 damage. You may move all Energy cards attached to Palkia to your Benched Pok�mon in any way you like (Ignore this effect if you don�t have any Benched Pok�mon.)"
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case DARKRAI_LV_X_DP19:
        return levelUp (this, from:"Darkrai", hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokeBody "Dark Shadow", {
            text "Each basic Energy card attached to your Pok�mon now has the effect �If the Pok�mon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pok�mon .� You can�t use more than 1 Dark Shadow Pok�-Body each turn."
            delayedA {
            }
          }
          move "Endless Darkness", {
            text "40 damage. The Defending Pok�mon is now Asleep. Flip 2 coins instead of 1 between turns. If either of this is tails, the Defending Pok�mon is still Asleep. If both of them are tails, the Defending Pok�mon is Knocked Out."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case MAGMORTAR_DP20:
        return evolution (this, from:"Magmar", hp:HP100, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          move "Smoke Bomb", {
            text "30 damage. If the Defending Pok�mon tries to attack during your opponent�s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flame Drum", {
            text "80 damage. If Magby isn�t anywhere under Magmortar, discard 2 Energy cards from your hand. (If you can�t discard 2 Energy cards from your hand, this attack does nothing.)"
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_DP21:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Electromagnetic Induction", {
            text "Energy cards and attach them to 1 of your Pok�mon. Shuffle your deck afterward."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Explosive Thunder", {
            text "30� damage. Energy cards you discarded."
            energyCost L, C, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MIME_JR__DP22:
        return copy(DiamondPearl.MIME_JR__90, this);
      case GLAMEOW_DP23:
        return copy(DiamondPearl.GLAMEOW_83, this);
      case DARKRAI_DP24:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "", {
            text "If damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spacial Rend", {
            text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Roar of Time", {
            text "80 damage. Search your discard pile for 3 Pok�mon, show them to your opponent, and put them on top of your deck. Shuffle your deck afterward. (If you don�t have 3 Pok�mon in your discard pile, this attack does nothing.)"
            energyCost M, M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TROPICAL_WIND_DP25:
        return copy (TROPICAL_WIND_DP05, this)
        /*basicTrainer (this) {
					text "Flip a coin. If heads, remove 2 damage counters from each Active Pok�mon (remove 1 damage counter if a Pok�mon has only 1). If tails, each Active Pok�mon is now Asleep."
					onPlay {
					}
					playRequirement{
					}
				}*/;
      case DIALGA_DP26:
        return copy(DiamondPearl.DIALGA_1, this);
      case PALKIA_DP27:
        return copy(DiamondPearl.PALKIA_11, this);
      case MEWTWO_LV_X_DP28:
        return levelUp (this, from:"Mewtwo", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Psybarrier", {
            text "Prevent all effects of attacks, including damage, done to Mewtwo by your opponent�s Pok�mon that isn�t an Evolved Pok�mon."
            delayedA {
            }
          }
          move "Giga Burn", {
            text "120 damage. Discard all Energy attached to Mewtwo."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case RHYPERIOR_LV_X_DP29:
        return levelUp (this, from:"Rhyperior", hp:HP170, type:FIGHTING, retreatCost:4) {
          weakness W
          resistance L, MINUS20
          move "Hard Crush", {
            text "50� damage. Discard the top 5 cards from your deck. This attack does 50 damage for each Energy card you discarded."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Upthrow", {
            text "60 damage. Energy cards, show them to your opponent, and shuffle them into your deck."
            energyCost F, F, C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case REGIGIGAS_LV_X_DP30:
        return levelUp (this, from:"Regigigas", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness F
          pokePower "Sacrifice", {
            text "Once during your turn , you may choose 1 of your Pok�mon and that Pok�mon is Knocked Out. Then, search your discard pile for up to 2 basic Energy cards, attach them to Regigigas, and remove 8 damage counters from Regigigas. This power can�t be used if Regigigas is affected by a Special Condition."
            actionA {
            }
          }
          move "Giga Blaster", {
            text "100 damage. Discard the top card from your opponent�s deck. Then, choose 1 card from your opponent�s hand without looking and discard it. Regigigas can�t use Giga Blaster during your next turn."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case HEATRAN_LV_X_DP31:
        return levelUp (this, from:"Heatran", hp:HP120, type:FIRE, retreatCost:4) {
          weakness W
          pokeBody "Heat Metal", {
            text "Your opponent can�t remove the Special Condition Burned by evolving or devolving his or her Burned Pok�mon. (This also includes putting a Pok�mon Level-Up card onto the Burned Pok�mon.) Whenever your opponent flips a coin for the Special Condition Burned between turns, treat it as tails."
            delayedA {
            }
          }
          pokePower "Heat Wave", {
            text "Once at the end of your turn, if Heatran is on your Bench, you may use this power. If you discarded basic Energy cards attached to your or Active Pok�mon by that Pok�mon�s attack this turn, attach up to 2 of those Energy cards to that Pok�mon."
            actionA {
            }
          }
        };
      case MAGNEZONE_DP32:
        return evolution (this, from:"Magneton", hp:HP130, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Mirror Shot", {
            text "40 damage. If the Defending Pok�mon tries to attack during your opponent�s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Magnet Slash", {
            text "100 damage. Energy attached to Magnezone."
            energyCost L, M, C, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DUSKNOIR_DP33:
        return evolution (this, from:"Dusclops", hp:HP130, type:PSYCHIC, retreatCost:2) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Dark Hide", {
            text "Once during your turn , you may flip a coin. If heads, look at your opponent�s hand, choose a Pok�mon you find there, and put it on the bottom of his or her deck. This power can�t be used if Dusknoir is affected by a Special Condition."
            actionA {
            }
          }
          move "Reaper Pulse", {
            text "70 damage. Move up to 2 damage counters from Dusknoir to 1 of your opponent�s Benched Pok�mon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFBLIM_DP34:
        return copy(DiamondPearl.DRIFBLIM_24, this);
      case PORYGON_Z_DP35:
        return evolution (this, from:"Porygon2", hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS30
          pokePower "Install", {
            text "As often as you like during your turn , move a Technical Machine card attached to 1 of your Pok�mon to another of your Pok�mon. This power can�t be used if Porygon-Z is affected by a Special Condition."
            actionA {
            }
          }
          move "Learning", {
            text "that levels up from 1 of your Pok�mon, and put it onto that Pok�mon. (This counts as leveling up that Pok�mon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Overload", {
            text "40+ damage. Does 40 damage plus 20 more damage for each Technical Machine card attached to Porygon-Z."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLISCOR_DP36:
        return evolution (this, from:"Gligar", hp:HP090, type:FIGHTING, retreatCost:0) {
          weakness W, PLUS20
          resistance F, MINUS20
          pokeBody "Blind Eye", {
            text "As long as Gliscor is your Active Pok�mon, your opponent can�t remove any Special Conditions by evolving or devolving his or her Pok�mon. (This also including putting a Pok�mon Level-Up card onto that Pok�mon.)"
            delayedA {
            }
          }
          move "Cutting Turn", {
            text "Flip a coin. If heads, put damage counters on the Defending Pok�mon until it is 10HP away from being Knocked Out. If you do, shuffle Gliscor and all cards attached to it back into your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Friction Heat", {
            text "20 damage. The Defending Pok�mon is now Burned."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DIALGA_LV_X_DP37:
        return levelUp (this, from:"Dialga", hp:HP110, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokePower "Time Skip", {
            text "Once during your turn , you may have your opponent flip 2 coins. If both of them are heads, your turn ends. If both of them are tails, after your opponent draws a card at the beginning of his or her next turn, his of her turn ends. This power can�t be used if Dialga is affected by a Special Condition."
            actionA {
            }
          }
          move "Metal Flash", {
            text "80 damage. During your next turn, Dialga can�t use Metal Flash."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case GIRATINA_LV_X_DP38:
        return levelUp (this, from:"Giratina", hp:HP130, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokeBody "Invisible Tentacles", {
            text "Whenever your opponent�s Pok�mon tries to attack, your opponent discards 1 card from his or her hand. (If your opponent can�t discard 1 card, your opponent�s Pok�mon can�t attack.) You can�t use more than 1 Invisible Tentacles Pok�-Body each turn."
            delayedA {
            }
          }
          move "Darkness Lost", {
            text "If any of your opponent�s Pok�mon would be Knocked Out by damage from this attack, put that Pok�mon and all cards attached to it in the Lost Zone instead of discarding it."
            energyCost P, P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case SHAYMIN_LV_X_DP39:
        return levelUp (this, from:"Shaymin", hp:HP110, type:GRASS, retreatCost:0) {
          weakness R
          resistance F, MINUS20
          pokeBody "Revenge Seed", {
            text "If any of your Pok�mon were Knocked Out by damage from an opponent�s attack during his or her last turn, each of Shaymin�s attack does 60 more damage to the Active Pok�mon ."
            delayedA {
            }
          }
          move "Energy Flare", {
            text "50 damage. You may move any number of Energy cards attached to your Pok�mon to your other Pok�mon is any way you like."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case REGIGIGAS_DP40:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          move "Drag Off", {
            text "30 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokemon and switch it with the Defending Pokemon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              def pcs = defending
              if(opp.bench){
                if(confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon before doing damage?")){
                  pcs = opp.bench.select()
                  sw defending, pcs
                }
              }

              damage 30, pcs
            }
          }
          move "Giga Hammer", {
            text "80 damage. Regigigas can�t use Giga Hammer during your next turn."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOXICROAK_G_DP41:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness P
          pokePower "Leap Away", {
            text "Once during your turn , if Toxicroak is your Active Pok�mon, you may flip a coin. If heads, return Toxicroak and all cards attached to it to your hand. This power can�t be used if Toxicroak is affected by a Special Condition."
            actionA {
              assert self.active : "$self is not your Active Pokémon"
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              flip ({
                scoopUpPokemon([:], self, delegate, POKEPOWER)
              })
            }
          }
          move "Poison Revenge", {
            text "20+ damage. If any of your Pok�mon were Knocked Out by damage from an opponent�s attack during his of her last turn, this attack does 20 damage plus 40 more damage and the Defending Pok�mon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CARNIVINE_G_DP42:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Power Whip", {
            text "to that Pok�mon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Grass Knot", {
            text "20+ damage. Energy in the Defending Pok�mon�s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PROBOPASS_G_DP43:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness W
          move "Nose Unit", {
            text "This attack does 20 damage to each of your opponent�s Pok�mon that has any Pok�-Bodies."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Loud Snort", {
            text "70 damage. �s Retreat Cost is 0 until the end of your next turn."
            energyCost M, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEZONE_DP44:
        return evolution (this, from:"Magneton", hp:HP130, type:LIGHTNING, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          move "Charge Beam", {
            text "30 damage. Search your discard pile for an Energy card and attach it to Magnezone."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 30
              attachEnergyFrom(my.discard, self)
            }
          }
          move "Metallic Bolt", {
            text "60 damage. Energy attached to Magnezone. If you do, this attack�s base damage is 120 instead of 60."
            energyCost L, M, C, C, L, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHARIZARD_G_LV_X_DP45:
        return levelUp (this, from:"Charizard G", hp:HP120, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          pokePower "Call for Power", {
            text "As often as you like during your turn , you may move an Energy attached to 1 of your Pok�mon to Charizard . This power can�t be used if Charizard is affected by a Special Condition."
            actionA {
            }
          }
          move "Malevolent Fire", {
            text "150 damage. ."
            energyCost R, R, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case GARCHOMP_C_LV_X_DP46:
        return levelUp (this, from:"Garchomp C", hp:HP110, type:COLORLESS, retreatCost:0) {
          weakness C
          pokePower "Healing Breath", {
            text "Once during your turn , when you put Garchomp LV. from your hand onto your Active Garchomp , you may remove all damage counters from each of your Pok�mon ."
            actionA {
            }
          }
          move "Dragon Rush", {
            text "can�t use Dragon Rush during your next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case RAYQUAZA_C_LV_X_DP47:
        return levelUp (this, from:"Rayquaza C", hp:HP120, type:COLORLESS, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          pokeBody "Dragon Spirit", {
            text "If Rayquaza is your Active Pok�mon and is damaged but not Knocked Out by an opponent�s attack, you may search your discard pile for an Energy card and attach it to Rayquaza ."
            delayedA {
            }
          }
          move "Final Blowup", {
            text "200 damage. . Ignore this effect if you have no cards in your hand."
            energyCost W, P, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case TROPICAL_WIND_DP48:
        return copy (TROPICAL_WIND_DP05, this)
        /*basicTrainer (this) {
					text "Flip a coin. If heads, remove 2 damage counters from each Active Pok�mon (remove 1 damage counter if a Pok�mon has only 1). If tails, each Active Pok�mon is now Asleep."
					onPlay {
					}
					playRequirement{
					}
				}*/;
      case DIALGA_DP49:
        return basic (this, hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Time Call", {
            text "Search your deck for a card that evolves from 1 of your Pok�mon and put it onto that Pok�mon. (This counts as evolving that Pok�mon.) Shuffle your deck afterward."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Time Wager", {
            text "100 damage. Flip 2 coins. If either of them is tails, this attack�s base damage is 50 instead of 100."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ARCEUS_DP50:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F
          move "Judgement", {
            text "80 damage. Discard all Energy cards attached to Arceus and this attack does 10 damage to each of your opponent�s Benched Pok�mon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRESSELIA_DP51:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Lunar Aura", {
            text "If you have Darkrai in play, remove 1 damage counter from Cresselia between turns."
            delayedA {
            }
          }
          move "Lunar Flight", {
            text "80- damage. Does 80 damage minus 10 damage for each damage counter on Cresselia."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DARKRAI_DP52:
        return basic (this, hp:HP090, type:DARKNESS, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          pokeBody "Darkness Aura", {
            text "If you have Cresselia in play, each of Darkrai�s attack does 20 more damage to the Defending Pok�mon ."
            delayedA {
            }
          }
          move "Hypnoblast", {
            text "60 damage. Flip a coin. If heads, the Defending Pok�mon is now Asleep."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ARCEUS_LV_X_DP53:
        return levelUp (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
          pokeBody "Multitype", {
            text "Arceus LV.�s type is the same type as its previous Level."
            delayedA {
            }
          }
          pokeBody "Omniscient", {
            text "Arceus can use the attacks of all Arceus you have in play as its own."
            delayedA {
            }
          }
          move "", {
            text "You may have as many of this card in your deck as you like."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case BEGINNING_DOOR_DP54:
        return basicTrainer (this) {
          text "Search your deck for Arceus, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case ULTIMATE_ZONE_DP55:
        return basicTrainer (this) {
          text "During each player�s turn, the player may move an Energy card attached to 1 of his or her Benched Pok�mon to his or her Active Arceus as often as he or she likes.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can�t play this card."
          onPlay {
          }
          playRequirement{
          }
        };
      case ARCEUS_LV_X_DP56:
        return levelUp (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
          pokeBody "Multitype", {
            text "Arceus LV.�s type is the same as its previous Level."
            delayedA {
            }
          }
          move "", {
            text "You may have as many of this card in your deck as you like."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Meteor Blast", {
            text "100 damage. Flip a coin. If tails, this attack�s base damage is 50 instead of 100."
            energyCost G, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      default:
        return null;
    }
  }

}
