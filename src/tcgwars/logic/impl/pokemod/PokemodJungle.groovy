package tcgwars.logic.impl.pokemod

import tcgwars.logic.impl.gen1.Jungle

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodJungle implements LogicCardInfo {

  CLEFABLE_1 ("Clefable", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ELECTRODE_2 ("Electrode", "2", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FLAREON_3 ("Flareon", "3", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_4 ("Jolteon", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KANGASKHAN_5 ("Kangaskhan", "5", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  MR_MIME_6 ("Mr. Mime", "6", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN_7 ("Nidoqueen", "7", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  PIDGEOT_8 ("Pidgeot", "8", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR_9 ("Pinsir", "9", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SCYTHER_10 ("Scyther", "10", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SNORLAX_11 ("Snorlax", "11", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  VAPOREON_12 ("Vaporeon", "12", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VENOMOTH_13 ("Venomoth", "13", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL_14 ("Victreebel", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_15 ("Vileplume", "15", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF_16 ("Wigglytuff", "16", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),

  CLEFABLE_17 ("Clefable", "17", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ELECTRODE_18 ("Electrode", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FLAREON_19 ("Flareon", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_20 ("Jolteon", "20", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KANGASKHAN_21 ("Kangaskhan", "21", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MR_MIME_22 ("Mr. Mime", "22", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN_23 ("Nidoqueen", "23", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  PIDGEOT_24 ("Pidgeot", "24", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR_25 ("Pinsir", "25", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SCYTHER_26 ("Scyther", "26", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SNORLAX_27 ("Snorlax", "27", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  VAPOREON_28 ("Vaporeon", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VENOMOTH_29 ("Venomoth", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL_30 ("Victreebel", "30", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_31 ("Vileplume", "31", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF_32 ("Wigglytuff", "32", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BUTTERFREE_33 ("Butterfree", "33", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DODRIO_34 ("Dodrio", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  EXEGGUTOR_35 ("Exeggutor", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  FEAROW_36 ("Fearow", "36", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GLOOM_37 ("Gloom", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKITUNG_38 ("Lickitung", "38", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MAROWAK_39 ("Marowak", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDORINA_40 ("Nidorina", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PARASECT_41 ("Parasect", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PERSIAN_42 ("Persian", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PRIMEAPE_43 ("Primeape", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RAPIDASH_44 ("Rapidash", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RHYDON_45 ("Rhydon", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEAKING_46 ("Seaking", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TAUROS_47 ("Tauros", "47", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WEEPINBELL_48 ("Weepinbell", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BELLSPROUT_49 ("Bellsprout", "49", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CUBONE_50 ("Cubone", "50", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  EEVEE_51 ("Eevee", "51", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EXEGGCUTE_52 ("Exeggcute", "52", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOLDEEN_53 ("Goldeen", "53", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  JIGGLYPUFF_54 ("Jigglypuff", "54", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MANKEY_55 ("Mankey", "55", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEOWTH_56 ("Meowth", "56", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NIDORAN_FEMALE_57 ("Nidoran♀", "57", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ODDISH_58 ("Oddish", "58", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PARAS_59 ("Paras", "59", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIKACHU_60 ("Pikachu", "60", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RHYHORN_61 ("Rhyhorn", "61", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SPEAROW_62 ("Spearow", "62", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  VENONAT_63 ("Venonat", "63", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  POKE_BALL_64 ("Poké Ball", "64", Rarity.COMMON, [TRAINER]),
  ENERGY_RESTORE_65 ("Energy Restore", "65", Rarity.UNCOMMON, [TRAINER]),
  LEVEL_BALL_66 ("Level Ball", "66", Rarity.UNCOMMON, [TRAINER]),
  SAMURAI_67 ("Samurai", "67", Rarity.RARE, [TRAINER, SUPPORTER]),
  THE_EEVEE_BROTHERS_WAGER_68 ("The Eevee Brother's Wager", "68", Rarity.RARE, [TRAINER, SUPPORTER]),
  HEALING_FIELDS_69 ("Healing Fields", "69", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  POKEMON_POOL_PARTY_70 ("Pokémon Pool Party", "70", Rarity.RARE, [TRAINER, STADIUM]),
  MASTER_BALL_71 ("Master Ball", "71", Rarity.SECRET, [TRAINER]),
  SCOOP_UP_CYCLONE_72 ("Scoop Up Cyclone", "72", Rarity.SECRET, [TRAINER]),
  SCRAMBLE_SWITCH_73 ("Scramble Switch", "73", Rarity.SECRET, [TRAINER]),
  KANGASKHAN_74 ("Kangaskhan", "74", Rarity.SECRET, [BASIC, POKEMON, _COLORLESS_]),
  HUNGRY_SNORLAX_75 ("Hungry Snorlax", "75", Rarity.SECRET, [BASIC, POKEMON, _COLORLESS_]),
  SCYTHER_76 ("Scyther", "76", Rarity.SECRET, [BASIC, POKEMON, _GRASS_]),
  WIGGLYTUFF_EX_77 ("Wigglytuff ex", "77", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VILEPLUME_EX_78 ("Vileplume ex", "78", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CLEFABLE_EX_79 ("Clefable ex", "79", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  FLAREON_EX_80 ("Flareon ex", "80", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VAPOREON_EX_81 ("Vaporeon ex", "81", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  JOLTEON_EX_82 ("Jolteon ex", "82", Rarity.SECRET, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodJungle(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_JUNGLE;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case CLEFABLE_1:
        return evolution (this, from:"Clefairy", hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Metronome", {
            text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable’s type is still Colorless.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              def move=choose(moveList, labelList, "Which move do you want to use")
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, DISCARD_SELF_ENERGY, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }
          move "Minimize", {
            text "All damage done by attacks to Clefable during your opponent’s next turn is reduced by 20 (after applying Weakness and Resistance)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }

        };
      case ELECTRODE_2:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Tackle", {
            text "20 damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Chain Lightning", {
            text "20 damage. If the Defending Pokémon isn’t Colorless, this attack does 10 damage to each Benched Pokémon of the same type as the Defending Pokémon (including your own)."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 20
              def defendingTypes = (defending.types as List<Type>)
              if(!defending.types.contains(C)){
                [opp.bench, my.bench].each{
                  it.findAll{it.types.any{defendingTypes.contains(it)}}.each{damage 10, it}
                }
              }
            }
          }

        };
      case FLAREON_3:
        return evolution (this, from:"Eevee", hp:HP080, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Flamethrower", {
            text "60 damage. Discard 1 [R] Energy card attached to Flareon in order to use this attack."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 60
              discardSelfEnergy R
            }
          }

        };
      case JOLTEON_4:
        return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Pin Missile", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              flip 4, {damage 20}
            }
          }

        };
      case KANGASKHAN_5:
        return copy (Jungle.KANGASKHAN_5, this);
      case MR_MIME_6:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokemonBody "Invisible Wall", {
            text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can’t be used if Mr. Mime is Asleep, Confused, or Paralyzed."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(!(self.specialConditions)){
                  bg.dm().each {
                    if(it.to == self & it.dmg.value > 20) {
                      bc "Invisible Wall prevents damage"
                      it.dmg = hp(0)
                    }
                  }
                }
              }
            }
          }
          move "Meditate", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10+10*defending.numberOfDamageCounters
            }
          }

        };
      case NIDOQUEEN_7:
        return evolution (this, from:"Nidorina", hp:HP100, type:GRASS, retreatCost:3) {
          weakness PSYCHIC
          move "Boyfriends", {
            text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              my.all.each{
                if(it.name == "Nidoking") damage 20
              }
            }
          }
          move "Mega Punch", {
            text "50 damage."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case PIDGEOT_8:
        return evolution (this, from:"Pidgeotto", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokemonPower "Quick Search", {
            text "Once during your turn (before your attack), you may choose any 1 card from your deck and put it into your hand. Shuffle your deck afterward. You can’t use more than 1 Quick Search Poké-Power each turn. This power can’t be used if Pidgeot is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert bg.em().retrieveObject("Quick_Search") != bg.turnCount : "You cannot use Quick Search more than once per turn!"
              assert my.deck
              bg.em().storeObject("Quick_Search",bg.turnCount)
              powerUsed()
              my.deck.select(count:1).moveTo(hidden:true, my.hand)
              shuffleDeck()
            }
          }
          move "Hurricane", {
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case PINSIR_9:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Irongrip", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage {flipThenApplySC PARALYZED}
            }
          }
          move "Guillotine", {
            text "50 damage."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case SCYTHER_10:
        return copy (Jungle.SCYTHER_10, this);
      case SNORLAX_11:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:4) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          pokemonBody "Thick Skinned", {
            text "Snorlax can't be affected by Special Conditions"
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(!(self.specialConditions)){
                  bc (self+"is thick Skinned!")
                  prevent()
                }
              }
            }
          }
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case VAPOREON_12:
        return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Water Gun", {
            text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Vaporeon but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd doesn’t count."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              extraEnergyDamage(2,hp(10),W,thisMove)
            }
          }

        };
      case VENOMOTH_13:
        break
      case VICTREEBEL_14:
        return evolution (this, from:"Weepinbell", hp:HP090, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Lure", {
            text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              def pcs = opp.bench.select("Switch")
              sw opp.active, pcs
            }
          }
          move "Acid", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon can’t retreat during your next turn."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip {cantRetreat defending}
            }
          }

        };
      case VILEPLUME_15:
        return copy (Jungle.VILEPLUME_15, this);
      case WIGGLYTUFF_16:
        return copy (Jungle.WIGGLYTUFF_16, this);
      case CLEFABLE_17:
        return copy (CLEFABLE_1, this);
      case ELECTRODE_18:
        return copy (ELECTRODE_2, this);
      case FLAREON_19:
        return copy (FLAREON_3, this);
      case JOLTEON_20:
        return copy (JOLTEON_4, this);
      case KANGASKHAN_21:
        return copy (Jungle.KANGASKHAN_5, this);
      case MR_MIME_22:
        return copy (MR_MIME_6, this);
      case NIDOQUEEN_23:
        return copy (NIDOQUEEN_7, this);
      case PIDGEOT_24:
        return copy (PIDGEOT_8, this);
      case PINSIR_25:
        return copy (PINSIR_9, this);
      case SCYTHER_26:
        return copy (Jungle.SCYTHER_10, this);
      case SNORLAX_27:
        return copy (SNORLAX_11, this);
      case VAPOREON_28:
        return copy (VAPOREON_12, this);
      case VENOMOTH_29:
        return copy (VENOMOTH_13, this);
      case VICTREEBEL_30:
        return copy (VICTREEBEL_14, this);
      case VILEPLUME_31:
        return copy (Jungle.VILEPLUME_15, this);
      case WIGGLYTUFF_32:
        return copy (Jungle.WIGGLYTUFF_16, this);
      case BUTTERFREE_33:
        return evolution (this, from:"Metapod", hp:HP080, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance FIGHTING, MINUS30
          move "Whirlwind", {
            text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage{
                whirlwind()
              }
            }
          }
          move "Mega Drain", {
            text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
            energyCost G, G, G, C
            attackRequirement {}
            onAttack {
              damage 40
              removeDamageCounterEqualToHalfDamageDone()
            }
          }

        };
      case DODRIO_34:
        return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokemonBody "Retreat Aid", {
            text "As long as Dodrio is Benched, pay 1 less to retreat your Active Pokémon."
            getterA GET_RETREAT_COST ,{ h->
              if(my.bench.find{it == self} && h.effect.target.owner == self.owner){
                h.object = Math.max(0,h.object-1)
              }
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case EXEGGUTOR_35:
        return copy (Jungle.EXEGGUTOR_35, this);
      case FEAROW_36:
        return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Agility", {
            text "20 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Fearow."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }
          move "Drill Peck", {
            text "40 damage."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case GLOOM_37:
        return copy (Jungle.GLOOM_37, this);
      case LICKITUNG_38:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Tongue Wrap", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage PARALYZED}
            }
          }
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC CONFUSED
            }
          }

        };
      case MAROWAK_39:
        return evolution (this, from:"Cubone", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Bonemerang", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 30}
            }
          }
          move "Call for Friend", {
            text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your bench is full.)"
            energyCost F
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(F)}).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }

        };
      case NIDORINA_40:
        return evolution (this, from:"Nidoran♀", hp:HP080, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              flipThenApplySC CONFUSED
            }
          }
          move "Double Kick", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 30}
            }
          }

        };
      case PARASECT_41:
        return evolution (this, from:"Paras", hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Slash", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case PERSIAN_42:
        return evolution (this, from:"Meowth", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Scratch", {
            text "20 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Pounce", {
            text "30 damage. If the Defending Pokémon attacks Persian during your next turn, any damage done by the attack is reduced by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  if(ef.attacker.owner == self.owner.opposite) {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect && it.dmg.value) {
                        bc "Pounce -10"
                        it.dmg -= hp(10)
                      }
                    }
                  }
                }
                unregisterAfter 2
                after CHANGE_STAGE,defending, {unregister()}
                after FALL_BACK,defending, {unregister()}
              }
            }
          }

        };
      case PRIMEAPE_43:
        return copy (Jungle.PRIMEAPE_43, this);
      case RAPIDASH_44:
        return evolution (this, from:"Ponyta", hp:HP070, type:FIRE, retreatCost:0) {
          weakness WATER
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Rapidash."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }

        };
      case RHYDON_45:
        return evolution (this, from:"Rhyhorn", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Horn Attack", {
            text "30 damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Ram", {
            text "50 damage. Rhydon does 20 damage to itself. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon. Switch the Pokémon even if Rhydon is knocked out.)"
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 50
              damage 20, self
              afterDamage{
                if(opp.bench){
                  whirlwind()
                }
              }
            }
          }

        };
      case SEAKING_46:
        return evolution (this, from:"Goldeen", hp:HP070, type:WATER, retreatCost:0) {
          weakness LIGHTNING
          move "Horn Attack", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Waterfall", {
            text "30 damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case TAUROS_47:
        return copy (Jungle.TAUROS_47, this);
      case WEEPINBELL_48:
        return evolution (this, from:"Bellsprout", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Poisonpowder", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage POISONED}
            }
          }
          move "Razor Leaf", {
            text "30 damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case BELLSPROUT_49:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Vine Whip", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon named Bellsprout and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
            energyCost G
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && it.name == "Bellsprout"}).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
        };
      case CUBONE_50:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Snivel", {
            text "If the Defending Pokémon attacks Cubone during your opponent’s next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
            energyCost C
            attackRequirement {}
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  if(ef.attacker.owner == self.owner.opposite) {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect && it.dmg.value) {
                        bc "Snivel -20"
                        it.dmg -= hp(20)
                      }
                    }
                  }
                }
                unregisterAfter 2
                after FALL_BACK,defending, {unregister()}
                after CHANGE_STAGE,defending, {unregister()}
                after FALL_BACK,self, {unregister()}
                after CHANGE_STAGE,self, {unregister()}
              }
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case EEVEE_51:
        return copy (Jungle.EEVEE_51, this);
      case EXEGGCUTE_52:
        return copy (Jungle.EXEGGCUTE_52, this);
      case GOLDEEN_53:
        return basic (this, hp:HP040, type:WATER, retreatCost:0) {
          weakness LIGHTNING
          move "Horn Attack", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case JIGGLYPUFF_54:
        return copy (Jungle.JIGGLYPUFF_54, this);
      case MANKEY_55:
        return basic (this, hp:HP040, type:FIGHTING, retreatCost:0) {
          weakness PSYCHIC
          pokemonPower "Peek", {
            text "Once during your turn (before your attack), you may look at one of the following: the top card of either player’s deck, a random card from your opponent’s hand, or one of either player’s Prizes. This power can’t be used if Mankey is Asleep, Confused, or Paralyzed."
            actionA {
              checkLastTurn()
              assert !(self.specialConditions) : "This pokemon has a special condition"
              powerUsed()
              def choice = choose([0,1,2,3,4],["Top of your deck", "Top of your opponent's deck", "Your opponent’s hand ", "Your Prizes", "Opponent's Prizes"])
              switch (choice){
                case 0: my.deck.subList(0,1).showToMe("Top of your deck"); break;
                case 1: opp.deck.subList(0,1).showToMe("Top of your opponent's deck"); break;
                case 2: opp.hand.shuffledCopy().select(hidden: true, "Select a random card from opponent's hand").showToMe("Selected card"); break;
                case 3: my.prizeCardSet.select(hidden: true, "Select a random card from your prizes").showToMe("Selected card"); break;
                case 4: opp.prizeCardSet.select(hidden: true, "Select a random card from your opponent's prizes").showToMe("Selected card"); break;
              }
            }
          }
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case MEOWTH_56:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Pay Day", {
            text "10 damage. Flip a coin. If heads, draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {draw 1}
            }
          }

        };
      case NIDORAN_FEMALE_57:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Fury Swipes", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost G
            attackRequirement {}
            onAttack {
              flip 3 , {damage 10}
            }
          }
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon named Nidoran♂ or Nidoran♀ and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
            energyCost G
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && (it.name == "Nidoran♂" || it.name == "Nidoran♀")}).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }

        };
      case ODDISH_58:
        return copy (Jungle.ODDISH_58, this);
      case PARAS_59:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Scratch", {
            text "20 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }

        };
      case PIKACHU_60:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Spark", {
            text "20 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench) damage 10, opp.bench.select()
            }
          }

        };
      case RHYHORN_61:
        return copy (Jungle.RHYHORN_61, this);
      case SPEAROW_62:
        return copy (Jungle.SPEAROW_62, this);
      case VENONAT_63:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Stun Spore", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage PARALYZED}
            }
          }
          move "Leech Life", {
            text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
              removeDamageCounterEqualToDamageDone()
            }
          }

        };
      case POKE_BALL_64:
        return copy (Jungle.POKE_BALL_64, this);
      case ENERGY_RESTORE_65:
       return copy(RubySapphire.ENERGY_RESTORE_81, this);
      case LEVEL_BALL_66:
       return basicTrainer(this) {
          text "Search your deck for a Pokémon with 50 HP or less, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay{
            my.deck.search("Search your deck for a Pokémon with 50 hp or less and put it in your hand.",{it.cardTypes.is(POKEMON) && it.asPokemonCard().hp.value <= 50}).showToOpponent("Chosen Pokémon cards.").moveTo(my.hand)
          }
          playRequirement{
            assert my.deck : "There are no more cards in your deck"
          }
        };
      case SAMURAI_67:
       return copy(SunMoon.HAU_120, this);
      case HEALING_FIELDS_69:
       break
      case POKEMON_POOL_PARTY_70:
       return copy(BlackWhitePromos.TROPICAL_BEACH_BW28, this);
      case MASTER_BALL_71:
       return basicTrainer (this) {
          text "Search your deck for up to 3 Basic Pokémon. Show them to your opponent, and put them into your hand. Shuffle your deck afterward"
          onPlay{
            my.deck.search(max : 3, "Choose up to 3 Basic Pokémon",{cardTypeFilter(BASIC)}).showToOpponent("Chosen Pokémon cards.").moveTo(my.hand)
          }
          playRequirement{
            assert my.deck : "There are no more cards in your deck"
          }
        };
      case SCOOP_UP_CYCLONE_72:
       return basicTrainer (this) {
          text "Put 1 of your Pokémon in play and all cards attached to it into your hand."
          onPlay {
              def pcs = my.all.select()
              scoopUpPokemon(pcs, delegate)

          }
          playRequirement{
            confirmScoopLastPokemon()
          }
        };
      case SCRAMBLE_SWITCH_73:
       return copy(PlasmaStorm.SCRAMBLE_SWITCH_129, this);
      case KANGASKHAN_74:
       return copy (Jungle.KANGASKHAN_5, this);
      case HUNGRY_SNORLAX_75:
       break
      case SCYTHER_76:
       return copy (Jungle.SCYTHER_10, this);
      case WIGGLYTUFF_EX_77:
       return evolution (this, from: "Jigglypuff", hp:100, type:COLORLESS, retreatCost:2) {
         weakness FIGHTING
         resistance PSYCHIC, MINUS30
         move "Sleepy Song", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              apply ASLEEP
            }
          }
          move "Do the Wave", {
            text "20+ damage. Does 0 damage plus 10 more damage for each of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20 + 10* my.bench.size()
            }
          }

        };
      case VILEPLUME_EX_78:
       return evolution (this, from: "Gloom", hp:120, type:GRASS, retreatCost:2) {
         weakness PSYCHIC, FIRE
         pokeBody "Block Dust", {
           text "As long as Vileplume ex is your Active Pokémon, your opponent can't play any Trainer cards (except for Supporter cards) from his or her hand."
                      delayedA {
              before PLAY_TRAINER, {
                if(!self.active){
                  wcu "Block Dust prevents playing this card"
                  prevent()
                }
              }
            }
          }
          move "Special Formula", {
            text "Flip a coin. If heads, the Defending Pokémon is now Asleep and Poisoned. If tails, the Defending Pokémon is now Confused."
           energyCost G, G, G
           onAttack {
             damage 30
             flip 1,{applyAfterDamage POISONED,
             applyAfterDamage ASLEEP
             },{
             applyAfterDamage PARALYZED
             }
           }
          }
       };
      case CLEFABLE_EX_79:
       return evolution (this, from:"Clefairy", hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Metronome", {
            text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) (No matter what type that Pokémon is, Clefable ex’s type is still [C].) Clefable ex performs that attack."
            energyCost C, C
            attackRequirement {}
            onAttack {
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              def move=choose(moveList, labelList, "Which move do you want to use")
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, DISCARD_SELF_ENERGY, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }
          move "Moon Impact", {
            text "40 damage."
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }

        };
      case FLAREON_EX_80:
       return evolution (this, from:"Eevee", hp:HP100, type:R, retreatCost:1) {
        weakness W
        pokePower "Evolutionary Flame", {
          text "Once during your turn, when you play Flareon ex from your hand to evolve 1 of your Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Burned."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Evolutionary Flame?")) {
              powerUsed()
              apply BURNED, opp.active, SRC_ABILITY
            }
          }
        }
        move "Flame Screen", {
          text "20 damage. During your opponent's next turn, any damage done to Flareon ex by attacks is reduced by 20 (after applying Weakness and Resistance)."
          energyCost R, C
          onAttack {
            damage 20
            reduceDamageNextTurn(hp(20),thisMove)
          }
        }
        move "Heat Tackle", {
          text "60 damage. Flareon ex does 20 damage to itself."
          energyCost R, C, C
          onAttack {
            damage 60
            damage 20, self
          }
        }
      };
      case VAPOREON_EX_81:
       return evolution (this, from:"Eevee", hp:HP100, type:W, retreatCost:1) {
        weakness L
        pokePower "Evolutionary Swirl", {
          text "Once during your turn, when you play Vaporeon ex from your hand to evolve 1 of your Pokémon, you may have your opponent shuffle his or her hand into his or her deck. Then, your opponent draws up to 4 cards."
          onActivate {
            if (it==PLAY_FROM_HAND && (opp.hand || opp.deck) && confirm("Use Evolutionary Swirl?")) {
              powerUsed()
              opp.hand.moveTo(hidden:true, opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              draw(oppChoose(1..4,"Evolutionary Swirl - How many cards would you like to draw?"),TargetPlayer.OPPONENT)
            }
          }
        }
        move "Fastwave", {
          text "30 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost W, C
          onAttack {
            noResistanceOrAnyEffectDamage(30, defending)
          }
        }
        move "Hydrosplash", {
          text "50 damage."
          energyCost W, C, C
          onAttack {
            damage 50
          }
        }
      };
      case JOLTEON_EX_82:
       return evolution (this, from:"Eevee", hp:HP100, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        pokePower "Evolutionary Thunder", {
          text "Once during your turn, when you play Jolteon ex from your hand to evolve 1 of your Pokémon, you may put 1 damage counter on each of your opponent's Pokémon."
          onActivate {r->
            if (r==PLAY_FROM_HAND && confirm("Use Evolutionary Thunder?")) {
              powerUsed()
              opp.active {
                directDamage 10, it, SRC_ABILITY
              }
            }
          }
        }
        move "Second Bite", {
          text "10+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
          energyCost C, C
          onAttack {
            damage 10+10*opp.active.numberOfDamageCounters
          }
        }
        move "Thunder Blast", {
          text "70 damage. Discard a [L] Energy card attached to Jolteon ex."
          energyCost L, C, C
          onAttack {
            damage 60
            discardSelfEnergy L
          }
        }
      };
      default:
        return null;
    }
  }

}
