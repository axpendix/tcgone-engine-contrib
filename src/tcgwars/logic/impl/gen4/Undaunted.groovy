package tcgwars.logic.impl.gen4

import tcgwars.logic.effect.special.SpecialConditionType
import tcgwars.logic.impl.gen3.RubySapphire;

import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.effect.ability.Ability
import tcgwars.logic.effect.ability.PokeBody
import tcgwars.logic.effect.ability.PokePower

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author ufodynsaty12@gmail.com
 */
public enum Undaunted implements LogicCardInfo {

  BELLOSSOM_1 ("Bellossom", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ESPEON_2 ("Espeon", "2", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FORRETRESS_3 ("Forretress", "3", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  GLISCOR_4 ("Gliscor", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HOUNDOOM_5 ("Houndoom", "5", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  MAGCARGO_6 ("Magcargo", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SCIZOR_7 ("Scizor", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SMEARGLE_8 ("Smeargle", "8", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  TOGEKISS_9 ("Togekiss", "9", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  UMBREON_10 ("Umbreon", "10", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DODRIO_11 ("Dodrio", "11", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DRIFBLIM_12 ("Drifblim", "12", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FORRETRESS_13 ("Forretress", "13", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  HARIYAMA_14 ("Hariyama", "14", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HONCHKROW_15 ("Honchkrow", "15", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  HONCHKROW_16 ("Honchkrow", "16", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  LEAFEON_17 ("Leafeon", "17", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  METAGROSS_18 ("Metagross", "18", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MISMAGIUS_19 ("Mismagius", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ROTOM_20 ("Rotom", "20", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SKARMORY_21 ("Skarmory", "21", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  TROPIUS_22 ("Tropius", "22", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  VESPIQUEN_23 ("Vespiquen", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_24 ("Vileplume", "24", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WEAVILE_25 ("Weavile", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  FLAREON_26 ("Flareon", "26", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GLOOM_27 ("Gloom", "27", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  JOLTEON_28 ("Jolteon", "28", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LAIRON_29 ("Lairon", "29", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  METANG_30 ("Metang", "30", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MUK_31 ("Muk", "31", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  PINSIR_32 ("Pinsir", "32", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  RAICHU_33 ("Raichu", "33", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RATICATE_34 ("Raticate", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SABLEYE_35 ("Sableye", "35", Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  SCYTHER_36 ("Scyther", "36", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SKUNTANK_37 ("Skuntank", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SLOWBRO_38 ("Slowbro", "38", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TOGETIC_39 ("Togetic", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  UNOWN_40 ("Unown", "40", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VAPOREON_41 ("Vaporeon", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ARON_42 ("Aron", "42", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BELDUM_43 ("Beldum", "43", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  COMBEE_44 ("Combee", "44", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DODUO_45 ("Doduo", "45", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRIFLOON_46 ("Drifloon", "46", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_47 ("Eevee", "47", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EEVEE_48 ("Eevee", "48", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GLIGAR_49 ("Gligar", "49", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GRIMER_50 ("Grimer", "50", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HITMONCHAN_51 ("Hitmonchan", "51", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_52 ("Hitmonlee", "52", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HOUNDOUR_53 ("Houndour", "53", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  HOUNDOUR_54 ("Houndour", "54", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  MAKUHITA_55 ("Makuhita", "55", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAWILE_56 ("Mawile", "56", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MISDREAVUS_57 ("Misdreavus", "57", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MURKROW_58 ("Murkrow", "58", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  MURKROW_59 ("Murkrow", "59", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ODDISH_60 ("Oddish", "60", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIKACHU_61 ("Pikachu", "61", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PINECO_62 ("Pineco", "62", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PINECO_63 ("Pineco", "63", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  RATTATA_64 ("Rattata", "64", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SCYTHER_65 ("Scyther", "65", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SLOWPOKE_66 ("Slowpoke", "66", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLUGMA_67 ("Slugma", "67", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SNEASEL_68 ("Sneasel", "68", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  STUNKY_69 ("Stunky", "69", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  TOGEPI_70 ("Togepi", "70", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BURNED_TOWER_71 ("Burned Tower", "71", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DEFENDER_72 ("Defender", "72", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_EXCHANGER_73 ("Energy Exchanger", "73", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FLOWER_SHOP_LADY_74 ("Flower Shop Lady", "74", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEGEND_BOX_75 ("Legend Box", "75", Rarity.UNCOMMON, [TRAINER, ITEM]),
  RUINS_OF_ALPH_76 ("Ruins of Alph", "76", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SAGE_S_TRAINING_77 ("Sage's Training", "77", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TEAM_ROCKET_S_TRICKERY_78 ("Team Rocket's Trickery", "78", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DARKNESS_ENERGY_79 ("Darkness Energy", "79", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_80 ("Metal Energy", "80", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ESPEON_81 ("Espeon", "81", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HOUNDOOM_82 ("Houndoom", "82", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  RAICHU_83 ("Raichu", "83", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SCIZOR_84 ("Scizor", "84", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SLOWKING_85 ("Slowking", "85", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UMBREON_86 ("Umbreon", "86", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  KYOGRE_AND_GROUDON_LEGEND_87 ("Kyogre & Groudon LEGEND", "87", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  KYOGRE_AND_GROUDON_LEGEND_88 ("Kyogre & Groudon LEGEND", "88", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  RAYQUAZA_AND_DEOXYS_LEGEND_89 ("Rayquaza & Deoxys LEGEND", "89", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
  RAYQUAZA_AND_DEOXYS_LEGEND_90 ("Rayquaza & Deoxys LEGEND", "90", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
  ALPH_LITHOGRAPH_THREE ("Alph Lithograph", "THREE", Rarity.HOLORARE, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Undaunted(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.UNDAUNTED;
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
      case BELLOSSOM_1:
        return evolution (this, from:"Gloom", hp:HP110, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          pokePower "Hustle Step", {
            text "Once during your turn , you may remove 1 damage counter from each of your Pokémon. This power can’t be used if Bellossom is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.findAll{it.numberOfDamageCounters} : "No damage on your Pokémon"
              powerUsed()
              my.all.each{ heal 10, it, SRC_ABILITY }
            }
          }
          move "Dance ’til Dawn", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads. Bellossom is now Asleep."
            energyCost G, C
            onAttack {
              flip 3, {damage 30}
              afterDamage{ apply ASLEEP, self }
            }
          }

        };
      case ESPEON_2:
        return evolution (this, from:"Eevee", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Solar Suggestion", {
            text "Move up to 4 damage counters from any of your Pokémon to any of your opponent’s Pokémon in any way you like."
            energyCost P
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "You have no damage counters to move"
            }
            onAttack {
              def numMoved = 0
              while(1) {
                def pcs = my.all.findAll{it.numberOfDamageCounters}.select("Choose the pokémon to move the damage counter from", false)
                if(!pcs) break;
                def tar = opp.all.select("Select the pokémon to recieve the damage counter", false)
                if(!tar) break;
                pcs.damage-=hp(10)
                tar.damage+=hp(10)
                numMoved++
                if(numMoved >= 4) break;
              }
            }
          }
          move "Psybeam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 30
              afterDamage{ flipThenApplySC CONFUSED }
            }
          }

        };
      case FORRETRESS_3:
        return evolution (this, from:"Pineco", hp:HP090, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Mirror Shot", {
            text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost M, C
            onAttack {
              damage 30
              sandAttack(thisMove)
            }
          }
          move "Everyone Explode Now", {
            text "Does 30 damage times the number of Pineco and Forretress you have in play. This attack does 30 damage to each of your Pineco and Forretress in play."
            energyCost M, C, C
            onAttack {
              damage 30*my.all.findAll{it.name=='Pineco' || it.name=='Forretress'}.size()
              my.all.findAll{it.name=='Pineco' || it.name=='Forretress'}.each{
                damage 30, it
              }
            }
          }

        };
      case GLISCOR_4:
        return evolution (this, from:"Gligar", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Ninja Fang", {
            text "30 damage. If, before Gliscor does damage, the Defending Pokémon has no damage counters on it and is then damaged by this attack (after applying Weakness and Resistance), the Defending Pokémon is now Paralyzed."
            energyCost F
            onAttack {
              def startingDamage = defending.numberOfDamageCounters
              damage 30
              afterDamage {
                if(startingDamage == 0 && defending.numberOfDamageCounters > 0) apply PARALYZED
              }
            }
          }
          move "Poison Jab", {
            text "50 damage. The Defending Pokémon is now Poisoned."
            energyCost F, C, C
            onAttack {
              damage 50
              applyAfterDamage POISONED
            }
          }

        };
      case HOUNDOOM_5:
        return evolution (this, from:"Houndour", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Fire Counterattack", {
            text "20 damage. If your opponent has any [F] Pokémon in play, this attack does 20 damage plus 60 more damage."
            energyCost D
            onAttack {
              damage 20
              if(opp.all.findAll{it.types.contains(F)}.size()) damage 60
            }
          }
          move "Dark Roar", {
            text "50 damage. Your opponent discards a card from his or her hand."
            energyCost D, D
            onAttack {
              damage 50
              afterDamage {
                if(opp.hand){
                  opp.hand.oppSelect(count:1, "Which cards to discard?").discard()
                }
              }
            }
          }

        };
      case MAGCARGO_6:
        return evolution (this, from:"Slugma", hp:HP100, type:FIRE, retreatCost:3) {
          weakness W
          move "Searing Flame", {
            text "20 damage. The Defending Pokémon is now Burned."
            energyCost R, C
            onAttack {
              damage 20
              applyAfterDamage BURNED
            }
          }
          move "Lava Flow", {
            text "60 damage. You may discard any number of [R] Energy cards attached to Magcargo. If you do , this attack does 60 damage plus 20 more damage for each [R] Energy card you discarded."
            energyCost R, R, C
            onAttack {
              damage 60
              def fireToDiscard = self.cards.filterByEnergyType(R).select(min:0, max:self.cards.filterByEnergyType(R).size())
              damage 20*fireToDiscard.size()
              afterDamage{ fireToDiscard.discard() }
            }
          }

        };
      case SCIZOR_7:
        return evolution (this, from:"Scyther", hp:HP090, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Cut", {
            text "50 damage. "
            energyCost M, C
            onAttack {
              damage 50
            }
          }
          move "Metal Claw", {
            text "80 damage. "
            energyCost M, M, C
            onAttack {
              damage 80
            }
          }

        };
      case SMEARGLE_8:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F
          pokePower "Portrait", {
            text "Once during your turn , if Smeargle is your Active Pokémon, you may look at your opponent’s hand. If you do, choose a Supporter card you find there and use the effect of that card as the effect of this power. This power can’t be used if Smeargle is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.isActive() : "$self is not active"
              assert opp.hand : "Your opponent has no cards in their hand"
              powerUsed()
              def randomOppHand = opp.hand.shuffledCopy()
              if(randomOppHand.hasType(SUPPORTER)){
                def card = randomOppHand.select(min:1, "Opponent's hand. Select a Supporter.", cardTypeFilter(SUPPORTER)).first()
                bg.deterministicCurrentThreadPlayerType=self.owner
                bg.em().run(new PlayTrainer(card))
                bg.clearDeterministicCurrentThreadPlayerType()
              } else {
                randomOppHand.showToMe("Opponent's hand. No supporter there.")
              }
            }
          }
          move "Tail Rap", {
            text "Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {damage 20}
            }
          }

        };
      case TOGEKISS_9:
        return evolution (this, from:"Togetic", hp:HP120, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Blessed Wings", {
            text "Remove all damage counters from each of your Pokémon. Shuffle Togekiss and all cards attached to it back into your deck."
            energyCost C, C
            onAttack {
              my.all.findAll{ it.numberOfDamageCounters }.each {
                healAll it
              }
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
            }
          }
          move "Air Cutter", {
            text "80 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C
            onAttack {
              flip {
                damage 80
              }
            }
          }

        };
      case UMBREON_10:
        return evolution (this, from:"Eevee", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Moonlight Fang", {
            text "30 damage. During your opponent’s next turn, prevent all effects, including damage, done to Umbreon by attacks from your opponent’s Pokémon that has any Poké-Powers or Poké-Bodies."
            energyCost D
            onAttack {
              damage 30
              delayed {
                before null, self, Source.ATTACK, {
                  if ((opp.active.hasPokePower() || opp.active.hasPokeBody()) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                    bc "Moonlight Fang prevents effect"
                    prevent()
                  }
                }
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && (it.from.hasPokePower() || it.from.hasPokeBody())){
                      it.dmg = hp(0)
                      bc "Moonlight Fang prevents damage"
                    }
                  }
                }
                after FALL_BACK, self, {unregister()}
                after EVOLVE, self, {unregister()}
                after DEVOLVE, self, {unregister()}
                unregisterAfter 2
              }
            }
          }
          move "Quick Blow", {
            text "30 damage. Flip a coin. If heads, this attack does 30 damage plus 30 damage."
            energyCost D, C
            onAttack {
              damage 30
              flip {
                damage 30
              }
            }
          }

        };
      case DODRIO_11:
        return evolution (this, from:"Doduo", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokeBody "Retreat Aid", {
            text "As long as Dodrio is on your Bench, your Active Pokémon’s Retreat Cost is [C][C] less."
            getterA (GET_RETREAT_COST) { h->
              if (!self.active && h.effect.target.owner == self.owner && h.effect.target.active) {
                h.object -= 2
              }
            }
          }
          move "Incessant Peck", {
            text "20 damage. Flip a coin until you get tails. This attack does 20 damage plus 20 more damage for each heads."
            energyCost C, C
            onAttack {
              damage 20
              flipUntilTails{
                damage 20
              }
            }
          }

        };
      case DRIFBLIM_12:
        return evolution (this, from:"Drifloon", hp:HP090, type:PSYCHIC, retreatCost:0) {
          weakness D
          resistance C, MINUS20
          move "Balloon Tackle", {
            text "60 damage. Drifblim does 20 damage to itself."
            energyCost P, C
            onAttack {
              damage 60
              damage 20, self
            }
          }
          move "Take Away", {
            text "Shuffle Drifblim and all cards attached to it back into your deck. Then, your opponent shuffles the Defending Pokémon and all cards attached to it into his or her deck. (You choose your new Active Pokémon first.)"
            energyCost C, C, C
            onAttack {
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
              opp.active.cards.moveTo(opp.deck)
              removePCS(opp.active)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }

        };
      case FORRETRESS_13:
        return evolution (this, from:"Pineco", hp:HP080, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Spike Spread", {
            text "This attack does 10 damage to each of your opponent’s Pokémon."
            energyCost M
            onAttack {
              opp.all.each{
                damage 10, it
              }
            }
          }
          move "Gyro Ball", {
            text "30 damage. You may switch Forretress with 1 of your Benched Pokémon. If you do, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost M, C
            onAttack {
              damage 30
              afterDamage{
                if(my.bench && confirm("Switch $self with 1 of your Benched Pokémon")){
                  if(sw2(my.bench.select("Select the new active"))){
                    whirlwind()
                  }
                }
              }
            }
          }

        };
      case HARIYAMA_14:
        return evolution (this, from:"Makuhita", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness P
          move "Hammer In", {
            text "60 damage. "
            energyCost F, C, C
            onAttack {
              damage 60
            }
          }
          move "Backward Belt Throw", {
            text "80 damage. You may do 80 damage plus 20 more damage. If you do, Hariyama does 20 damage to itself."
            energyCost F, F, C, C
            onAttack {
              damage 80
              if(confirm("Deal 20 damage to $self in order to deal 20 more damage?")){
                damage 20
                damage 20, self
              }
            }
          }

        };
      case HONCHKROW_15:
        return evolution (this, from:"Murkrow", hp:HP090, type:DARKNESS, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Whirlwind", {
            text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              afterDamage{
                whirlwind()
              }
            }
          }
          move "Blindside", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 50 damage to that Pokémon."
            energyCost D, D
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "None of your opponent's Pokémon have any damage counters"
            }
            onAttack {
              damage 50, opp.all.findAll{it.numberOfDamageCounters}.select("Choose 1 of your opponent’s Pokémon that has any damage counters on it.")
            }
          }

        };
      case HONCHKROW_16:
        return evolution (this, from:"Murkrow", hp:HP090, type:DARKNESS, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Shadow Bind", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D, C
            onAttack {
              damage 30
              cantRetreat defending
            }
          }
          move "Vengeance", {
            text "10+ damage. Deals 10 more damage for each [D] Pokémon in your discard pile."
            energyCost D, C, C
            onAttack {
              damage 10 + 10 * my.discard.filterByType(POKEMON).findAll{it.types.contains(D)}.size()
            }
          }

        };
      case LEAFEON_17:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Miasma Wind", {
            text "Does 50 damage damage times the number of Special Conditions affecting the Defending Pokémon."
            energyCost C
            attackRequirement {
              assert defending.specialConditions : "The defending Pokémon is not affected by a Special Condition"
            }
            onAttack {
              damage 50 * defending.specialConditions.size()
            }
          }
          move "Soothing Scent", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost G
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }

        };
      case METAGROSS_18:
        return evolution (this, from:"Metang", hp:HP130, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          move "Strength", {
            text "70 damage. "
            energyCost M, M, C
            onAttack {
              damage 70
            }
          }
          move "Quad Smash", {
            text "Flip 4 coins. This attack does 50 damage times the number of heads."
            energyCost M, M, C, C
            onAttack {
              flip 4, {
                damage 50
              }
            }
          }

        };
      case MISMAGIUS_19:
        return evolution (this, from:"Misdreavus", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Sleeping Spell", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost P
            onAttack {
              damage 30
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }
          move "Poltergeist", {
            text "Look at your opponent’s hand. This attack does 30 damage times the number of Trainer, Supporter, and Stadium cards in your opponent’s hand.]"
            energyCost P, C
            attackRequirement {
              assert opp.hand : "Your opponent's hand is empty"
            }
            onAttack {
              damage 30 * opp.hand.shuffledCopy().showToMe("Your opponent's hand").filterByType(ITEM,SUPPORTER,STADIUM).size()
            }
          }

        };
      case ROTOM_20:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          pokePower "Mischievous Trick", {
            text "Once during your turn , you may switch 1 of your face-down Prize cards with the top card of your deck. This power can’t be used if Rotom is affected by a Special Condition."
            actionA {
              assert my.deck : "Your deck is empty"
              assert my.prizeCardSet.faceDownCards : "You have no face down prizes"
              checkNoSPC()
              checkLastTurn()
              powerUsed()
              def tar = my.prizeCardSet.faceDownCards.select(hidden: true, "Prize to replace with the top card of your deck").first()
              def ind = my.prizeCardSet.indexOf(tar)
              my.prizeCardSet.set(ind, my.deck.remove(0))
              my.deck.add(0,tar)
            }
          }
          move "Plasma Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage for each Energy attached to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost L
            attackRequirement {
              assert opp.all.find{it.cards.energyCount(C)} : "None of your opponent's Pokémon have any energy attached"
            }
            onAttack {
              def tar = opp.all.findAll{it.cards.energyCount(C)}.select()
              noWrDamage 20 * tar.cards.energyCount(C), tar
            }
          }

        };
      case SKARMORY_21:
        return basic (this, hp:HP080, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Steel Coat", {
            text "Search your deck for a [M] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost M
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              attachEnergyFrom(type: M, my.deck, my.all)
            }
          }
          move "Razor Wing", {
            text "40 damage. "
            energyCost M, C, C
            onAttack {
              damage 40
            }
          }

        };
      case TROPIUS_22:
        return basic (this, hp:HP090, type:GRASS, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Fresh-Picked Fruit", {
            text "Remove 6 damage counters from 1 of your Benched Pokémon."
            energyCost G
            attackRequirement {
              assert my.bench.find{it.numberOfDamageCounters} : "Your bench is healthy"
            }
            onAttack {
              heal 60, my.bench.findAll{it.numberOfDamageCounters}.select("Choose 1 of your Benched Pokémon to remove 6 damage counters from")
            }
          }
          move "Cutting Wind", {
            text "40 damage. "
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }
        };
      case VESPIQUEN_23:
        return evolution (this, from:"Combee", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R
          pokeBody "Defense Sign", {
            text "Prevent all damage done to your [G] Benched Pokémon by attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.from.owner != self.owner && it.to.owner==self.owner && it.to.benched && it.to.types.contains(G) && it.dmg.value && it.notNoEffect){
                    bc "$thisAbility prevents damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Mach Wind", {
            text "60 damage. During your next turn, Vespiquen’s Retreat Cost is 0."
            energyCost G, C, C
            onAttack {
              damage 60
              afterDamage{
                delayed {
                  def eff
                  register {
                    eff = getter GET_RETREAT_COST, LAST, self, { h ->
                      h.object = 0
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  unregisterAfter 3
                  after FALL_BACK, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()}
                }
              }
            }
          }

        };
      case VILEPLUME_24:
        return evolution (this, from:"Gloom", hp:HP120, type:GRASS, retreatCost:2) {
          weakness P
          pokeBody "Allergy Flower", {
            text "Each player can’t play any Trainer cards from his or her hand."
            delayedA {
              before PLAY_TRAINER, {
                if(ef.cardToPlay.cardTypes.is(ITEM)){
                  wcu "$thisAbility prevents playing trainer cards"
                  prevent()
                }
              }
            }
          }
          move "Dazzling Pollen", {
            text "50 damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage. If tails, the Defending Pokémon is now Confused."
            energyCost G, G, C
            onAttack {
              damage 50
              flip 1, {
                damage 20
              }, {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case WEAVILE_25:
        return evolution (this, from:"Sneasel", hp:HP080, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          pokePower "Claw Snag", {
            text "Once during your turn, when you play Weavile from your hand to evolve 1 of your Pokémon, you may look at your opponent’s hand. Choose a card from your opponent’s hand and discard it."
            onActivate { reason ->
              if(reason == PLAY_FROM_HAND && opp.hand && confirm("Use $thisAbility?")){
                powerUsed()
                opp.hand.shuffledCopy().select("Choose a card to discard").discard()
              }
            }
          }
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost D, C
            onAttack {
              swiftDamage(30, opp.all.select())
            }
          }

        };
      case FLAREON_26:
        return evolution (this, from:"Eevee", hp:HP090, type:FIRE, retreatCost:1) {
          weakness W
          move "Flame Tail", {
            text "30 damage. "
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy attached to Flareon."
            energyCost R, R, C
            onAttack {
              damage 90
              discardSelfEnergyAfterDamage C
            }
          }

        };
      case GLOOM_27:
        return evolution (this, from:"Oddish", hp:HP080, type:GRASS, retreatCost:1) {
          weakness P
          move "Miracle Powder", {
            text "30 damage. Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
            energyCost G, C
            onAttack {
              damage 30
              flip {
                def list=[ASLEEP,CONFUSED,PARALYZED,POISONED,BURNED]
                SpecialConditionType spc = choose(list, list.collect({it.toString()})) as SpecialConditionType
                applyAfterDamage spc
              }
            }
          }

        };
      case JOLTEON_28:
        return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to Jolteon during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 20
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Mach Bolt", {
            text "70 damage. "
            energyCost L, L, C
            onAttack {
              damage 70
            }
          }

        };
      case LAIRON_29:
        return evolution (this, from:"Aron", hp:HP090, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Scrap Attack", {
            text "20 damage. Flip a coin. If heads, search your discard pile for a [M] Energy card and attach it to Lairon."
            energyCost M
            onAttack {
              damage 20
              afterDamage{
                attachEnergyFrom(type:M,my.discard,self)
              }
            }
          }
          move "Tackle", {
            text "60 damage. "
            energyCost M, M, C
            onAttack {
              damage 60
            }
          }

        };
      case METANG_30:
        return evolution (this, from:"Beldum", hp:HP080, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Hammer In", {
            text "30 damage. "
            energyCost M, C
            onAttack {
              damage 30
            }
          }
          move "Double Smash", {
            text "Flip 2 coins. This attack does 50 damage times the number of heads."
            energyCost M, C, C
            onAttack {
              flip 2, {
                damage 50
              }
            }
          }

        };
      case MUK_31:
        return evolution (this, from:"Grimer", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P
          move "Sludge Drag", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Confused and Poisoned."
            energyCost P
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              if(sw2(opp.bench.select("Choose the new Active Pokémon"))) {
                apply CONFUSED
                apply POISONED
              }
            }
          }
          move "Pester", {
            text "50 damage. If the Defending Pokémon is affected by a Special Condition, this attack does 50 damage plus 30 more damage."
            energyCost P, C, C
            onAttack {
              damage 50
              if(defending.specialConditions) {
                damage 30
              }
            }
          }

        };
      case PINSIR_32:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R
          move "Charging Horn", {
            text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost G
            onAttack {
              damage 10
              flip {
                damage 20
              }
            }
          }
          move "Guillotine", {
            text "60 damage. "
            energyCost G, G, C
            onAttack {
              damage 60
            }
          }

        };
      case RAICHU_33:
        return evolution (this, from:"Pikachu", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          move "Pain-full Punch", {
            text "30 damage. "
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Spark", {
            text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L, C
            onAttack {
              damage 40
              if(opp.bench){
                damage 20, opp.bench.select("Choose 1 of your opponent’s Benched Pokémon to deal 20 damage to.")
              }
            }
          }

        };
      case RATICATE_34:
        return evolution (this, from:"Rattata", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness F
          move "Razor-Sharp Incisors", {
            text "Does 10 damage times the number of damage counters on the Defending Pokémon."
            energyCost C
            attackRequirement {
              assert defending.numberOfDamageCounters : "The defending Pokémon is healthy"
            }
            onAttack {
              damage 10 * defending.numberOfDamageCounters
            }
          }
          move "Gnaw Up", {
            text "30 damage. Discard a Special Energy card attached to the Defending Pokémon."
            energyCost C
            onAttack {
              damage 30
              discardDefendingSpecialEnergy(delegate)
            }
          }

        };
      case SABLEYE_35:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          move "Pull Out", {
            text "Search your discard pile for any 1 card, show it to your opponent, and put it on top of your deck."
            energyCost D
            attackRequirement {
              assert my.discard
            }
            onAttack {
              my.discard.select("Put a card from your discard pile on top of your deck").showToOpponent("Pull out -- This Card will be put on top of your opponent's deck.").moveTo(addToTop: true, my.deck)
            }
          }
          move "Dark Hand", {
            text "20 damage. If you have more cards in your hand than your opponent, this attack does 20 damage plus 30 more damage."
            energyCost D, C
            onAttack {
              damage 20
              if(my.hand.size()>opp.hand.size()){
                damage 30
              }
            }
          }

        };
      case SCYTHER_36:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R
          move "Afterimage Strike", {
            text "20 damage. During your opponent’s next turn, if Scyther would be damaged by an attack, flip a coin. If heads, prevent that attack’s damage done to Scyther."
            energyCost C, C
            onAttack {
              damage 20
              afterDamage{
                delayed (priority: BEFORE_LAST) {
                  before APPLY_ATTACK_DAMAGES, {
                    def entry=bg.dm().find({it.to==self && it.dmg.value && it.notNoEffect})
                    if (entry) {
                      flip "Afterimage Strike", self.owner, {
                        entry.dmg=hp(0)
                      }
                    }
                  }
                }
              }
            }
          }

        };
      case SKUNTANK_37:
        return evolution (this, from:"Stunky", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Stun Gas", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
            energyCost D
            onAttack {
              flip 1, {
                apply POISONED
              }, {
                apply PARALYZED
              }
            }
          }
          move "Fury Swipes", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost D, C
            onAttack {
              flip 3, {
                damage 30
              }
            }
          }

        };
      case SLOWBRO_38:
        return evolution (this, from:"Slowpoke", hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          move "Full-Belly Refresh", {
            text "Remove all Special Conditions and 3 damage counters from Slowbro."
            energyCost C
            attackRequirement {
              assert self.specialConditions || self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              clearSpecialCondition self, ATTACK
              heal 30, self
            }
          }
          move "Startling Trip", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, Slowbro is now Confused."
            energyCost P, C, C
            onAttack {
              damage 50
              afterDamage {
                flip 1, {
                  apply CONFUSED
                }, {
                  apply CONFUSED, self
                }
              }
            }
          }

        };
      case TOGETIC_39:
        return evolution (this, from:"Togepi", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Chase Up", {
            text "Search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.select().moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Fly", {
            text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of attacks, including damage done to Togetic during your opponent’s next turn."
            energyCost C, C
            onAttack {
              flip {
                damage 30
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case UNOWN_40:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "DARK", {
            text "Once during your turn, when you put Unown from your hand onto your Bench, you may search your deck for a [D] Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            onActivate { reason ->
              if(reason == PLAY_FROM_HAND && my.deck && confirm("Use $thisAbility?")){
                powerUsed()
                my.deck.search("Search your deck for a [D]",{it.cardTypes.energy && it.containsTypePlain(D)}).showToOpponent("Selected card").showToOpponent("Selected Cards").moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost P
            onAttack {
              damage 0
            }
          }

        };
      case VAPOREON_41:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          move "Spiral Drain", {
            text "20 damage. Remove 2 damage counters from Vaporeon."
            energyCost C
            onAttack {
              damage 20
              heal 20, self
            }
          }
          move "Dual Splash", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
            energyCost W, W, C
            onAttack {
              multiDamage(opp.all,2,30)
            }
          }

        };
      case ARON_42:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Metal Sound", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost M
            onAttack {
              flip{
                apply CONFUSED
              }
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost M, C
            onAttack {
              damage 20
            }
          }

        };
      case BELDUM_43:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Lunge Out", {
            text "10 damage. "
            energyCost M
            onAttack {
              damage 10
            }
          }
          move "Single Smash", {
            text "50 damage. Flip a coin. If tails, this attack does nothing."
            energyCost M, M, C
            onAttack {
              flip {
                damage 50
              }
            }
          }

        };
      case COMBEE_44:
        return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
          weakness R
          move "Enraged Assault", {
            text "20 damage. If Vespiquen is on your Bench, and has any damage counters on it, this attack does 20 damage plus 60 more damage, and the Defending Pokémon is now Poisoned."
            energyCost C
            onAttack {
              damage 20
              if(my.bench.find{it.name=="Vespiquen" && it.numberOfDamageCounters}) {
                damage 60
                applyAfterDamage POISONED
              }
            }
          }

        };
      case DODUO_45:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Peck", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Double Headstrike", {
            text "50 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip 2,{},{},[2:{damage 50}]
            }
          }

        };
      case DRIFLOON_46:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Minimize", {
            text "During your opponent's next turn, any damage done to Drifloon by attacks is reduced by 20."
            energyCost C
            onAttack {
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Pull", {
            text "Flip a coin. If heads, switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent's bench is not empty"
            }
            onAttack {
              flip{
                def pcs = opp.bench.select("Choose the new Active Pokémon")
                sw(opp.active,pcs)
              }
            }
          }

        };
      case EEVEE_47:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Tackle", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Bite", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case EEVEE_48:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Tickle", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 10
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case GLIGAR_49:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Stun Poison", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost F, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
                applyAfterDamage POISONED
              }
            }
          }

        };
      case GRIMER_50:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Sticky Liquid", {
            text "more."
            energyCost P
            onAttack {
              defendingRetreatsCostsMore (defending, [C])
            }
          }
          move "Sludge Toss", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case HITMONCHAN_51:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Detect", {
            text "Flip a coin. If heads, prevent all effects of attack, including damage, done to Hitmonchan during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Sky Uppercut", {
            text "30 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, C
            onAttack {
              damage 30
              dontApplyResistance()
            }
          }

        };
      case HITMONLEE_52:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Kick", {
            text "20 damage. "
            energyCost F
            onAttack {
              damage 20
            }
          }
          move "High Jump Kick", {
            text "60 damage. "
            energyCost F, F, C
            onAttack {
              damage 60
            }
          }

        };
      case HOUNDOUR_53:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Sharp Fang", {
            text "30 damage. "
            energyCost D, C
            onAttack {
              damage 30
            }
          }

        };
      case HOUNDOUR_54:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Jump On", {
            text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost D
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }

        };
      case MAKUHITA_55:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Slap Down", {
            text "Flip 2 coins. This attack does 20 damage plus 10 more damage for each heads."
            energyCost F, C
            onAttack {
              damage 20
              flip 2, {
                damage 10
              }
            }
          }
          move "Slap Push", {
            text "40 damage. "
            energyCost F, C, C
            onAttack {
              damage 40
            }
          }

        };
      case MAWILE_56:
        return basic (this, hp:HP060, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Selfish Draw", {
            text "Look at the top card of your deck. You may put it into your hand. If not, discard it and draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def top = my.deck.subList(0,1).showToMe("Top card of your deck")
              def choice = choose([0,1], ["Draw ${top.first().name}.", "Discard ${top.first().name} and draw a card"], "What do you want to do?")
              if(choice){
                top.discard()
              }
              draw 1
            }
          }
          move "Destructive Jaw", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost M, C, C
            onAttack {
              damage 30
              afterDamage{
                flip{
                  apply PARALYZED
                  discardDefendingEnergy()
                }
              }
            }
          }

        };
      case MISDREAVUS_57:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Mumble", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Dual Draw", {
            text "Each player draws 3 cards."
            energyCost P
            attackRequirement {
              assert my.deck || opp.deck : "Both decks are empty"
            }
            onAttack {
              draw 3
              draw 3, TargetPlayer.OPPONENT
            }
          }

        };
      case MURKROW_58:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Astonish", {
            text "10 damage. Flip a coin. If heads, choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost D
            onAttack {
              damage 10
              afterDamage{
                flip{
                  astonish()
                }
              }
            }
          }

        };
      case MURKROW_59:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Glide", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Dark Cutter", {
            text "30 damage. "
            energyCost D, C, C
            onAttack {
              damage 30
            }
          }

        };
      case ODDISH_60:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness P
          move "Ram", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Find a Friend", {
            text "Flip a coin. If heads, search your deck for a [G] Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              flip{
                my.deck.search("Select a [G] Pokémon to put into your hand.", pokemonTypeFilter(G)).showToOpponent("Selected Cards").moveTo(my.hand)
                shuffleDeck()
              }
            }
          }

        };
      case PIKACHU_61:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Slam", {
            text "Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }

        };
      case PINECO_62:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R
          move "Rollout", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case PINECO_63:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R
          move "Focus Energy", {
            text "During your next turn, Pineco’s Surprise Attack attack’s base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Surprise Attack",hp(40))
            }
          }
          move "Surprise Attack", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost G, C
            onAttack {
              flip{
                damage 40
              }
            }
          }

        };
      case RATTATA_64:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Gnaw", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }

        };
      case SCYTHER_65:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R
          move "Cut", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Slashing Strike", {
            text "50 damage. During your next turn, Scyther can’t use Slashing Strike."
            energyCost G, C, C
            onAttack {
              damage 50
              cantUseAttack(thisMove,self)
            }
          }

        };
      case SLOWPOKE_66:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L
          move "Rambunctious Party", {
            text "Look at the top 5 cards of your deck. Choose as many Basic Pokémon as you like and put them onto your Bench. Shuffle the other cards back into your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull
            }
            onAttack {
              def top = my.deck.subList(0,5)
              def max = Math.min(my.bench.freeBenchCount, top.filterByType(BASIC).size())
              top.select(min:0,max:max,"Choose any number of Basic Pokémon to put on your bench",cardTypeFilter(BASIC)).each{
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Rain Splash", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case SLUGMA_67:
        return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
          weakness W
          pokePower "Active Volcano", {
            text "Once during your turn , you may discard the top card of your deck. If that card is a [R] Energy card, attach it to Slugma. This power can’t be used if Slugma is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "Your deck is empty"
              powerUsed()
              if(my.deck.subList(0,1).filterByBasicEnergyType(R)) {
                attachEnergyFrom(my.deck.subList(0,1),my.all)
              }
              else{
                my.deck.subList(0,1).discard()
              }
            }
          }
          move "Combustion", {
            text "40 damage. "
            energyCost R, R, C
            onAttack {
              damage 40
            }
          }

        };
      case SNEASEL_68:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          move "Fury Swipes", {
            text "Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 3, {
                damage 10
              }
            }
          }
          move "Beat Up", {
            text "Flip a coin for each of your Pokémon in play. This attack does 20 damage times the number of heads."
            energyCost D, D
            onAttack {
              flip my.all.size(), {
                damage 20
              }
            }
          }

        };
      case STUNKY_69:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Double Scratch", {
            text "Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }

        };
      case TOGEPI_70:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Plead", {
            text "Ask your opponent if you may draw 2 cards. If yes, draw 2 cards. If no, this attack does 20 damage to the Defending Pokémon."
            energyCost C
            onAttack {
              def choice = oppChoose([0,1],["Your opponent draws 2 cards","Plead deals 20 damage"],"Plead",0)
              if(choice) {
                damage 20
              } else {
                draw 2
              }
            }
          }

        };
      case BURNED_TOWER_71:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, that player may flip a coin. If heads, the player searches his or her discard pile for a basic Energy card, shows it to his or her opponent, and put it into his or her hand."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Burned Tower") {
              assert my.discard.find(cardTypeFilter(BASIC_ENERGY)) : "No Basic Energies in your discard pile."
              assert lastTurn != bg().turnCount : "Already used this turn."
              bc "Used Training Court effect."
              lastTurn = bg().turnCount
              my.discard.findAll(cardTypeFilter(BASIC_ENERGY)).select("Which Basic Energy to move to your hand?").moveTo(my.hand)
            }
          }
          onRemoveFromPlay {
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case DEFENDER_72:
        return basicTrainer (this) {
          text "Attach Defender to 1 of your Pokémon. Discard this card at the end of your opponent’s next turn. Any damage done to the Pokémon Defender is attached to by an opponent’s attack is reduced by 20 (after applying Weakness and Resistance)."
          def eff
          def turns = 1
          onPlay {
            def pcs = my.active
            if (my.bench) {
              pcs = my.all.select("Which Pokémon will you attach $thisCard to?")
            }
            pcs.cards.add(thisCard)
            my.hand.remove(thisCard)

            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.to == pcs && it.dmg.value) {
                    bc "Defender -20"
                    it.dmg -= hp(20)
                  }
                }
              }
              before BETWEEN_TURNS, {
                if(turns-- == 0){
                  discard thisCard
                }
              }
              after REMOVE_FROM_PLAY, pcs, null, {
                if(ef.removedCards.contains(thisCard)) {
                  eff.unregister()
                }
              }
            }
          }
        };
      case ENERGY_EXCHANGER_73:
        return basicTrainer (this) {
          text "Choose an Energy card from you hand, show it to your opponent, and put it on top of your deck. Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
            my.hand.filterByType(ENERGY).select().showToOpponent("Energy Exchanger: This card will be shuffled into your opponent's deck").moveTo(my.deck)
            my.deck.search(max: 1, "Select a basic Energy card.", cardTypeFilter(ENERGY)).showToOpponent("Energy Exchanger: Your opponent found this card").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.filterByType(ENERGY) : "You have no energy cards in your hand"
          }
        };
      case FLOWER_SHOP_LADY_74:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for 3 Pokémon and 3 basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
            if(my.discard.filterByType(POKEMON)) {
              def cnt = Math.min(3,my.discard.filterByType(POKEMON).size())
              my.discard.select(count:cnt,"Select 3 Pokémon cards to shuffle into your deck",cardTypeFilter(POKEMON)).showToOpponent("Selected Pokémon").moveTo(my.deck)
            }
            if(my.discard.filterByType(BASIC_ENERGY)) {
              def cnt = Math.min(3,my.discard.filterByType(BASIC_ENERGY).size())
              my.discard.select(count:cnt,"Select 3 basic Energy cards to shuffle into your deck",cardTypeFilter(BASIC_ENERGY)).showToOpponent("Selected Energy cards").moveTo(my.deck)
            }
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON) || my.discard.filterByType(BASIC_ENERGY) : "Your discard pile has no Pokémon or basic Energy cards"
          }
        };
      case LEGEND_BOX_75:
        return basicTrainer (this) {
          text "Reveal the top 10 cards of your deck. If you reveal both halves of a Pokémon LEGEND, put those cards onto your Bench and attach all revealed Energy cards to that Pokémon LEGEND. Shuffle the other cards back into your deck. (You can play only 1 Pokémon LEGEND in this way.)"
          onPlay {
            def top = my.deck.subList(0,10).showToOpponent("Top 10 cards of your opponent's deck")
            def hasMatch = top.find { Card card->
              card.cardTypes.is(LEGEND) && top.getExcludedList(card).find{it.cardTypes.is(LEGEND) && card.getName().equals(it.getName()) && !card.getNumber().equals(it.getNumber())}
            }
            if(!hasMatch) {
              top.showToMe("Top 10 cards of your deck")
            } else {
              def legendPair = top.select(count:2 , "Select both halves of a Pokémon LEGEND.", cardTypeFilter(LEGEND), thisCard.player, { CardList list ->
                list[0].name == list[1].name && list[0].number != list[1].number
              })
              def topLegendCard = legendPair.get(0).getNumber() < legendPair.get(1).getNumber() ? legendPair.get(0) : legendPair.get(1)
              def bottomLegendCard = legendPair.find { it != topLegendCard }
              def legendPokemon = benchPCS(topLegendCard)
              legendPokemon.cards.add(bottomLegendCard)
              my.deck.remove(bottomLegendCard)
              top.getExcludedList(legendPair).filterByType(ENERGY).each{
                attachEnergy(legendPokemon, it)
              }
            }
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
            assert my.bench.notFull : "Your bench is full"
          }
        };
      case RUINS_OF_ALPH_76:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach Pokémon in play has no Resistance."
          def eff
          onPlay {
            eff = getter (GET_RESISTANCES) {h->
              h.object.clear()
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case SAGE_S_TRAINING_77:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the top 5 cards of your deck. Choose any 2 cards you find there and put them into your hand. Discard the other cards."
          onPlay {
            def top = my.deck.subList(0,5)
            def cnt = Math.min(2,top.size())
            def sel = top.select(count:cnt,"Choose $cnt cards to put into your hand")
            top.getExcludedList(sel).discard()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case TEAM_ROCKET_S_TRICKERY_78:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards. Then, your opponent discards a card from his or her hand."
          onPlay {
            draw 2
            if(opp.hand) {
              opp.hand.oppSelect("Team Rocket's Trickery - Choose a card to discard").discard()
            }
          }
          playRequirement{
            assert my.deck || opp.hand : "Your deck is empty and your opponent has no cards in hand"
          }
        };
      case DARKNESS_ENERGY_79:
        return copy (MysteriousTreasures.DARKNESS_ENERGY_119, this);
      case METAL_ENERGY_80:
        return copy (RubySapphire.METAL_ENERGY_94, this)
      case ESPEON_81:
        return evolution (this, from:"Eevee", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokeBody "Evolution Memories", {
            text "Espeon can use the attacks of all Pokémon you have in play that evolve from Eevee as its own."
            getterA (GET_MOVE_LIST, self) {holder->
              my.all.each {
                if(it!=self && it.realEvolution && it.topPokemonCard.predecessor == "Eevee") {
                  holder.object.addAll(it.topPokemonCard.moves)
                }
              }
            }
          }
          move "Solar Ray", {
            text "30 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost P, C
            onAttack {
              damage 30
              my.all.each{
                heal 10, it
              }
            }
          }

        };
      case HOUNDOOM_82:
        return evolution (this, from:"Houndour", hp:HP110, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokePower "Fire Breath", {
            text "Once during your turn , you may flip a coin. If heads, the Defending Pokémon is now Burned. This power can’t be used if Houndoom is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              powerUsed()
              flip{
                apply BURNED
              }
            }
          }
          move "Dark Clamp", {
            text "70 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D, D, C
            onAttack {
              damage 70
              cantRetreat defending
            }
          }

        };
      case RAICHU_83:
        return evolution (this, from:"Pikachu", hp:HP100, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          pokePower "Voltage Increase", {
            text "As often as you like during your turn , you may move a [L] Energy attached to 1 of your Pokémon to Raichu. This power can’t be used if Raichu is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.find {it.cards.filterByEnergyType(L) && it!=self} : "No energy to move"
              powerUsed()
              def pl=my.all.findAll {it.cards.filterByEnergyType(L) && it!=self}
              def src=pl.select("Source for [L] Energy.")
              def card=src.cards.filterByEnergyType(L).select("Select a [L] Energy to move.").first()
              energySwitch(src, self, card)
            }
          }
          move "Mega Thunderbolt", {
            text "120 damage. Discard all Energy attached to Raichu."
            energyCost L, L, C
            onAttack {
              damage 120
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }
        };
      case SCIZOR_84:
        return evolution (this, from:"Scyther", hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokeBody "Red Armor", {
            text "Prevent all damage done to Scizor by attacks from your opponent’s Pokémon that have any Special Energy cards attached to them."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.from.cards.filterByType(SPECIAL_ENERGY) && it.from.owner == self.owner.opposite){
                    bc "Red Armor prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Metal Scissors", {
            text "30+ damage. Does 30 damage plus 20 more damage for each [M] Energy attacked to Scizor."
            energyCost M, C
            onAttack {
              damage 30 + 20 * self.cards.energyCount(M)
            }
          }

        };
      case SLOWKING_85:
        return evolution (this, from:"Slowpoke", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Opponent’s Choice", {
            text "Once during your turn , you may reveal the top 2 cards of your deck and your opponent chooses 1 of them. Put that card into your hand and the other card on the bottom of your deck. This power can’t be used if Slowking is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "Your deck is empty"
              powerUsed()
              def cards = my.deck.subList(0,2)
              def sel = cards.showToMe("Top 2 cards of your deck").oppSelect("Choose a card to for your opponent to draw. (Put the other card on the bottom of your opponent's deck)").moveTo(my.hand)
              cards.getExcludedList(sel).moveTo(my.deck)
            }
          }
          move "Super Psy Bolt", {
            text "60 damage. "
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        };
      case UMBREON_86:
        return evolution (this, from:"Eevee", hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokePower "Cloud-Covered Moon", {
            text "Once during your turn , if Umbreon is your Active Pokémon, you may flip a coin. If heads, return Umbreon and all cards attached to it to your hand. This power can’t be used if Umbreon is affected by a Special Condition."
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
          move "Evoblast", {
            text "Does 50 damage plus 10 more damage for each of your Pokémon in play that evolves from Eevee."
            energyCost D, C, C
            onAttack {
              damage 50 + 10 * my.all.findAll{it.realEvolution && it.topPokemonCard.predecessor == "Eevee"}.size()
            }
          }

        };
      case KYOGRE_AND_GROUDON_LEGEND_87:
        return basic (this, hp:HP150, type:[WATER, F], retreatCost:3) {
          weakness G
          weakness L
          move "Mega Tidal Wave", {
            text "Discard the top 5 cards from your opponent’s deck. This attack does 30 damage times the number of Energy cards you discarded to each of your opponent’s Benched Pokémon."
            energyCost W, W, C, C
            attackRequirement {
              assert opp.deck : "Your opponent's deck is empty"
            }
            onAttack {
              def top = opp.deck.subList(0,5)
              opp.bench.each{
                damage 30 * top.filterByType(ENERGY).size(), it
              }
              afterDamage{
                top.discard()
              }
            }
          }
          move "Massive Eruption", {
            text "Discard the top 5 cards from your deck. This attack does 100 damage times the number of Energy cards you discarded."
            energyCost F, F, C, C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def top = my.deck.sublist(0,5)
              damage 100 * top.filterByType(ENERGY).size()
              top.discard()
            }
          }

        };
      case KYOGRE_AND_GROUDON_LEGEND_88:
        return copy (KYOGRE_AND_GROUDON_LEGEND_87, this);
      case RAYQUAZA_AND_DEOXYS_LEGEND_89:
        return basic (this, hp:HP140, type:[PSYCHIC, C], retreatCost:3) {
          weakness P
          weakness C
          pokeBody "Space Virus", {
            text "If your opponent’s Pokémon is Knocked Out by damage from an attack of Rayquaza & Deoxys LEGEND, take 1 more Prize card."
            getterA GET_GIVEN_PRIZES, BEFORE_LAST, {Holder holder ->
              def pcs = holder.effect.target
              if (self.active && pcs.owner != self.owner && pcs.KOBYDMG == bg.turnCount && holder.object > 0) {
                bc "Space Virus gives the player an additional prize."
                holder.object += 1
              }
            }
          }
          move "Ozone Buster", {
            text "150 damage. Discard all [R] Energy attached to Rayquaza & Deoxys LEGEND."
            energyCost R, R, L, C
            onAttack {
              damage 150
              afterDamage{
                discardAllSelfEnergy(R)
              }
            }
          }

        };
      case RAYQUAZA_AND_DEOXYS_LEGEND_90:
        return copy (RAYQUAZA_AND_DEOXYS_LEGEND_89, this);
      case ALPH_LITHOGRAPH_THREE:
        return basicTrainer (this) {
          text "RETURN ANY STADIUM CARD IN PLAY TO ITS PLAYERS HAND!"
          onPlay {
            new CardList(bg.stadiumInfoStruct.stadiumCard).moveTo(bg.stadiumInfoStruct.stadiumCard.player.pbg.hand)
          }
          playRequirement{
            assert bg.stadiumInfoStruct : "There is no stadium card in play"
            assert stadiumCanBeAffectedByItemAndSupporter() : "The stadium in play can't be affected by trainer cards"
          }
        };
      default:
        return null;
    }
  }

}
