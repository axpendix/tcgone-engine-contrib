package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.NintendoBlackStarPromos
import tcgwars.logic.impl.gen4.MysteriousTreasures

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
  TOXICROAK_G_DP41 ("Toxicroak G", "DP41", Rarity.PROMO, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  CARNIVINE_G_DP42 ("Carnivine G", "DP42", Rarity.PROMO, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  PROBOPASS_G_DP43 ("Probopass G", "DP43", Rarity.PROMO, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  MAGNEZONE_DP44 ("Magnezone", "DP44", Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  CHARIZARD_G_LV_X_DP45 ("Charizard G Lv.X", "DP45", Rarity.PROMO, [LVL_X, POKEMON, POKEMON_SP, _FIRE_]),
  GARCHOMP_C_LV_X_DP46 ("Garchomp C Lv.X", "DP46", Rarity.PROMO, [LVL_X, POKEMON, POKEMON_SP, _COLORLESS_]),
  RAYQUAZA_C_LV_X_DP47 ("Rayquaza C Lv.X", "DP47", Rarity.PROMO, [LVL_X, POKEMON, POKEMON_SP, _COLORLESS_]),
  TROPICAL_WIND_DP48 ("Tropical Wind", "DP48", Rarity.PROMO, [TRAINER]),
  DIALGA_DP49 ("Dialga", "DP49", Rarity.PROMO, [BASIC, POKEMON, _METAL_]),
  ARCEUS_DP50 ("Arceus", "DP50", Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
  CRESSELIA_DP51 ("Cresselia", "DP51", Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
  DARKRAI_DP52 ("Darkrai", "DP52", Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
  ARCEUS_LV_X_DP53 ("Arceus Lv.X", "DP53", Rarity.PROMO, [LVL_X, POKEMON, _COLORLESS_]),
  BEGINNING_DOOR_DP54 ("Beginning Door", "DP54", Rarity.PROMO, [TRAINER, STADIUM]),
  ULTIMATE_ZONE_DP55 ("Ultimate Zone", "DP55", Rarity.PROMO, [TRAINER, STADIUM]),
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
        return copy(MysteriousTreasures.CRANIDOS_43, this);
      case SHIELDON_DP08:
        return copy(MysteriousTreasures.SHIELDON_63, this);
      case TORTERRA_LV_X_DP09:
        return copy(DiamondPearl.TORTERRA_LV_X_122, this);
      case INFERNAPE_LV_X_DP10:
        return copy(DiamondPearl.INFERNAPE_LV_X_121, this);
      case EMPOLEON_LV_X_DP11:
        return copy(DiamondPearl.EMPOLEON_LV_X_120, this);
      case LUCARIO_LV_X_DP12:
        return copy(MysteriousTreasures.LUCARIO_LV_X_122, this);
      case BUIZEL_DP13:
        return copy(DiamondPearl.BUIZEL_72, this);
      case CHATOT_DP14:
        return copy(DiamondPearl.CHATOT_74, this);
      case SHINX_DP15:
        return copy(DiamondPearl.SHINX_98, this);
      case PIKACHU_DP16:
        return copy(MysteriousTreasures.PIKACHU_94, this);
      case DIALGA_LV_X_DP17:
        return copy(GreatEncounters.DIALGA_LV_X_105, this);
      case PALKIA_LV_X_DP18:
        return copy(GreatEncounters.PALKIA_LV_X_106, this);
      case DARKRAI_LV_X_DP19:
        return copy(GreatEncounters.DARKRAI_LV_X_104, this);
      case MAGMORTAR_DP20:
        return copy(MysteriousTreasures.MAGMORTAR_12, this);
      case RAICHU_DP21:
        return copy(MysteriousTreasures.RAICHU_15, this);
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
              //https://bulbapedia.bulbagarden.net/wiki/Darkrai_(DP_Promo_24)
              // TODO
            }
          }
          move "Spacial Rend", {
            text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
          move "Roar of Time", {
            text "80 damage. Search your discard pile for 3 Pok�mon, show them to your opponent, and put them on top of your deck. Shuffle your deck afterward. (If you don�t have 3 Pok�mon in your discard pile, this attack does nothing.)"
            energyCost M, M, M
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
        };
      case TROPICAL_WIND_DP25:
        return copy (TROPICAL_WIND_DP05, this)
      case DIALGA_DP26:
        return copy(DiamondPearl.DIALGA_1, this);
      case PALKIA_DP27:
        return copy(DiamondPearl.PALKIA_11, this);
      case MEWTWO_LV_X_DP28:
        return copy(LegendsAwakened.MEWTWO_LV_X_144, this);
      case RHYPERIOR_LV_X_DP29:
        return copy(LegendsAwakened.RHYPERIOR_LV_X_145, this);
      case REGIGIGAS_LV_X_DP30:
        return copy(Stormfront.REGIGIGAS_LV_X_100, this);
      case HEATRAN_LV_X_DP31:
        return copy(Stormfront.HEATRAN_LV_X_97, this);
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
              // https://bulbapedia.bulbagarden.net/wiki/Magnezone_(DP_Promo_32)
              // TODO
            }
          }
          move "Magnet Slash", {
            text "100 damage. Energy attached to Magnezone."
            energyCost L, M, C, C, L
            attackRequirement {}
            onAttack {
              damage 0
              // https://bulbapedia.bulbagarden.net/wiki/Magnezone_(DP_Promo_32)
              // TODO
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
              // TODO
            }
          }
          move "Reaper Pulse", {
            text "70 damage. Move up to 2 damage counters from Dusknoir to 1 of your opponent�s Benched Pok�mon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
              // TODO
            }
          }
          move "Learning", {
            text "that levels up from 1 of your Pok�mon, and put it onto that Pok�mon. (This counts as leveling up that Pok�mon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
          move "Overload", {
            text "40+ damage. Does 40 damage plus 20 more damage for each Technical Machine card attached to Porygon-Z."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
              // TODO
            }
          }
          move "Cutting Turn", {
            text "Flip a coin. If heads, put damage counters on the Defending Pok�mon until it is 10HP away from being Knocked Out. If you do, shuffle Gliscor and all cards attached to it back into your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
          move "Friction Heat", {
            text "20 damage. The Defending Pok�mon is now Burned."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }

        };
      case DIALGA_LV_X_DP37:
        return copy(GreatEncounters.DIALGA_LV_X_105, this);
      case GIRATINA_LV_X_DP38:
        return copy(Platinum.GIRATINA_LV_X_124, this);
      case SHAYMIN_LV_X_DP39:
        return copy(Platinum.SHAYMIN_LV_X_127, this);
      case REGIGIGAS_DP40:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          move "Drag Off", {
            text "30 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with the Defending Pokémon."
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
              // TODO
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
              // TODO
            }
          }
        };
      case CARNIVINE_G_DP42:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Power Whip", {
            text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each Energy attached to Carnivine Pokémon G to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
          move "Grass Knot", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [C] Energy in the Defending Pokémon's Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
              // TODO
            }
          }
          move "Loud Snort", {
            text "70 damage. �s Retreat Cost is 0 until the end of your next turn."
            energyCost M, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
            text "60 damage. You may discard a [L] Energy and a [M] Energy attached to Magnezone. If you do, this attack's base damage is 120 instead of 60."
            energyCost L, M, C, C, L, M
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }

        };
      case CHARIZARD_G_LV_X_DP45:
        return copy(SupremeVictors.CHARIZARD_G_LV_X_143, this);
      case GARCHOMP_C_LV_X_DP46:
        return copy(SupremeVictors.GARCHOMP_C_LV_X_145, this);
      case RAYQUAZA_C_LV_X_DP47:
        return copy(SupremeVictors.RAYQUAZA_C_LV_X_146, this);
      case TROPICAL_WIND_DP48:
        return copy (TROPICAL_WIND_DP05, this)
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
              // TODO
            }
          }
          move "Time Wager", {
            text "100 damage. Flip 2 coins. If either of them is tails, this attack�s base damage is 50 instead of 100."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
              // TODO
            }
          }

        };
      case CRESSELIA_DP51:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Lunar Aura", {
            text "If you have Darkrai in play, remove 1 damage counter from Cresselia between turns."
            delayedA {
              // TODO
            }
          }
          move "Lunar Flight", {
            text "80- damage. Does 80 damage minus 10 damage for each damage counter on Cresselia."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
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
            // TODO
          }
          move "Hypnoblast", {
            text "60 damage. Flip a coin. If heads, the Defending Pok�mon is now Asleep."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
              // TODO
            }
          }
        };
      case ARCEUS_LV_X_DP53:
        return copy(Arceus.ARCEUS_LV_X_94, this);
      case BEGINNING_DOOR_DP54:
        return copy(Arceus.BEGINNING_DOOR_82, this);
      case ULTIMATE_ZONE_DP55:
        return copy(Arceus.ULTIMATE_ZONE_91, this);
      case ARCEUS_LV_X_DP56:
        return copy(Arceus.ARCEUS_LV_X_95, this);
      default:
        return null;
    }
  }
}
