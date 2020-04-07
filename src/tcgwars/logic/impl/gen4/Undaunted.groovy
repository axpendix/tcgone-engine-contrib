package tcgwars.logic.impl.gen4;

import tcgwars.logic.effect.gm.PlayTrainer

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum Undaunted implements LogicCardInfo {

  BELLOSSOM_1 ("Bellossom", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ESPEON_2 ("Espeon", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FORRETRESS_3 ("Forretress", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  GLISCOR_4 ("Gliscor", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HOUNDOOM_5 ("Houndoom", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  MAGCARGO_6 ("Magcargo", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SCIZOR_7 ("Scizor", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SMEARGLE_8 ("Smeargle", 8, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  TOGEKISS_9 ("Togekiss", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  UMBREON_10 ("Umbreon", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DODRIO_11 ("Dodrio", 11, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DRIFBLIM_12 ("Drifblim", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FORRETRESS_13 ("Forretress", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  HARIYAMA_14 ("Hariyama", 14, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HONCHKROW_15 ("Honchkrow", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  HONCHKROW_16 ("Honchkrow", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  LEAFEON_17 ("Leafeon", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  METAGROSS_18 ("Metagross", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MISMAGIUS_19 ("Mismagius", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ROTOM_20 ("Rotom", 20, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SKARMORY_21 ("Skarmory", 21, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  TROPIUS_22 ("Tropius", 22, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  VESPIQUEN_23 ("Vespiquen", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_24 ("Vileplume", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WEAVILE_25 ("Weavile", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  FLAREON_26 ("Flareon", 26, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GLOOM_27 ("Gloom", 27, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  JOLTEON_28 ("Jolteon", 28, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LAIRON_29 ("Lairon", 29, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  METANG_30 ("Metang", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MUK_31 ("Muk", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  PINSIR_32 ("Pinsir", 32, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  RAICHU_33 ("Raichu", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RATICATE_34 ("Raticate", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SABLEYE_35 ("Sableye", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  SCYTHER_36 ("Scyther", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SKUNTANK_37 ("Skuntank", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SLOWBRO_38 ("Slowbro", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TOGETIC_39 ("Togetic", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  UNOWN_40 ("Unown", 40, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VAPOREON_41 ("Vaporeon", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ARON_42 ("Aron", 42, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BELDUM_43 ("Beldum", 43, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  COMBEE_44 ("Combee", 44, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DODUO_45 ("Doduo", 45, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRIFLOON_46 ("Drifloon", 46, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_47 ("Eevee", 47, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EEVEE_48 ("Eevee", 48, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GLIGAR_49 ("Gligar", 49, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GRIMER_50 ("Grimer", 50, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HITMONCHAN_51 ("Hitmonchan", 51, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_52 ("Hitmonlee", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HOUNDOUR_53 ("Houndour", 53, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  HOUNDOUR_54 ("Houndour", 54, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  MAKUHITA_55 ("Makuhita", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAWILE_56 ("Mawile", 56, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MISDREAVUS_57 ("Misdreavus", 57, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MURKROW_58 ("Murkrow", 58, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  MURKROW_59 ("Murkrow", 59, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ODDISH_60 ("Oddish", 60, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIKACHU_61 ("Pikachu", 61, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PINECO_62 ("Pineco", 62, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PINECO_63 ("Pineco", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  RATTATA_64 ("Rattata", 64, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SCYTHER_65 ("Scyther", 65, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SLOWPOKE_66 ("Slowpoke", 66, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLUGMA_67 ("Slugma", 67, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SNEASEL_68 ("Sneasel", 68, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  STUNKY_69 ("Stunky", 69, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  TOGEPI_70 ("Togepi", 70, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BURNED_TOWER_71 ("Burned Tower", 71, Rarity.UNCOMMON, [TRAINER]),
  DEFENDER_72 ("Defender", 72, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_EXCHANGER_73 ("Energy Exchanger", 73, Rarity.UNCOMMON, [TRAINER]),
  FLOWER_SHOP_LADY_74 ("Flower Shop Lady", 74, Rarity.UNCOMMON, [TRAINER]),
  LEGEND_BOX_75 ("Legend Box", 75, Rarity.UNCOMMON, [TRAINER]),
  RUINS_OF_ALPH_76 ("Ruins of Alph", 76, Rarity.UNCOMMON, [TRAINER]),
  SAGE_S_TRAINING_77 ("Sage's Training", 77, Rarity.UNCOMMON, [TRAINER]),
  TEAM_ROCKET_S_TRICKERY_78 ("Team Rocket's Trickery", 78, Rarity.UNCOMMON, [TRAINER]),
  DARKNESS_ENERGY_79 ("Darkness Energy", 79, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_80 ("Metal Energy", 80, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ESPEON_81 ("Espeon", 81, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HOUNDOOM_82 ("Houndoom", 82, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  RAICHU_83 ("Raichu", 83, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SCIZOR_84 ("Scizor", 84, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SLOWKING_85 ("Slowking", 85, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UMBREON_86 ("Umbreon", 86, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  KYOGRE_AND_GROUDON_LEGEND_87 ("Kyogre & Groudon LEGEND", 87, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  KYOGRE_AND_GROUDON_LEGEND_88 ("Kyogre & Groudon LEGEND", 88, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  RAYQUAZA_AND_DEOXYS_LEGEND_89 ("Rayquaza & Deoxys LEGEND", 89, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
  RAYQUAZA_AND_DEOXYS_LEGEND_90 ("Rayquaza & Deoxys LEGEND", 90, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_, LEGEND]),
  ALPH_LITHOGRAPH_THREE ("Alph Lithograph", 91, Rarity.HOLORARE, [TRAINER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Undaunted(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  public int getCollectionLineNo() {
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
              assert my.all.findAll{it.numberOfDamageCounters} : "No damage on your Pokemon"
              powerUsed()
              my.all.each{ heal 10, it, SRC_ABILITY }
            }
          }
          move "Dance ’til Dawn", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads. Bellossom is now Asleep."
            energyCost G, C
            attackRequirement {}
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
            attackRequirement {}
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
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              damage 30
              sandAttack(thisMove)
            }
          }
          move "Everyone Explode Now", {
            text "Does 30 damage times the number of Pineco and Forretress you have in play. This attack does 30 damage to each of your Pineco and Forretress in play."
            energyCost M, C, C
            attackRequirement {}
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
            attackRequirement {}
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
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.all.findAll{it.types.contains(F)}.size()) damage 60
            }
          }
          move "Dark Roar", {
            text "50 damage. Your opponent discards a card from his or her hand."
            energyCost D, D
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                opp.hand.oppSelect(count:1, "Which cards to discard?").discard()
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
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage BURNED
            }
          }
          move "Lava Flow", {
            text "60 damage. You may discard any number of [R] Energy cards attached to Magcargo. If you do , this attack does 60 damage plus 20 more damage for each [R] Energy card you discarded."
            energyCost R, R, C
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Metal Claw", {
            text "80 damage. "
            energyCost M, M, C
            attackRequirement {}
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
              powerUsed()
              if(opp.hand.hasType(SUPPORTER)){
                def card=opp.hand.select(min:1, "Opponent's hand. Select a supporter.", cardTypeFilter(SUPPORTER)).first()
                bg.deterministicCurrentThreadPlayerType=self.owner
                bg.em().run(new PlayTrainer(card))
                bg.clearDeterministicCurrentThreadPlayerType()
              } else {
                opp.hand.showToMe("Opponent's hand")
              }
            }
          }
          move "Tail Rap", {
            text "Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              my.all.findAll{ it.numberOfDamageCounters }.each {
                heal it.numberOfDamageCounters, it
              }
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
            }
          }
          move "Air Cutter", {
            text "80 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip 1, {damage 80}
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
            attackRequirement {}
            onAttack {
              damage 30
              // TODO
            }
          }
          move "Quick Blow", {
            text "30 damage. Flip a coin. If heads, this attack does 30 damage plus 30 damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {damage 30}
            }
          }

        };
      case DODRIO_11:
        return evolution (this, from:"Doduo", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokeBody "Retreat Aid", {
            text "As long as Dodrio is on your Bench, your Active Pokémon’s Retreat Cost is [C][C] less."
            delayedA {
            }
          }
          move "Incessant Peck", {
            text "20 damage. Flip a coin until you get tails. This attack does 20 damage plus 20 more damage for each heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Take Away", {
            text "Shuffle Drifblim and all cards attached to it back into your deck. Then, your opponent shuffles the Defending Pokémon and all cards attached to it into his or her deck. (You choose your new Active Pokémon first.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gyro Ball", {
            text "30 damage. You may switch Forretress with 1 of your Benched Pokémon. If you do, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HARIYAMA_14:
        return evolution (this, from:"Makuhita", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness P
          move "Hammer In", {
            text "60 damage. "
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Backward Belt Throw", {
            text "80 damage. You may do 80 damage plus 20 more damage. If you do, Hariyama does 20 damage to itself."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Blindside", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 50 damage to that Pokémon."
            energyCost D, D
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Vengeance", {
            text "Pokémon in your discard pile."
            energyCost D, C, C, D
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Soothing Scent", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Quad Smash", {
            text "Flip 4 coins. This attack does 50 damage times the number of heads."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Poltergeist", {
            text "Look at your opponent’s hand. This attack does 30 damage times the number of Trainer, Supporter, and Stadium cards in your opponent’s hand.]"
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
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
            }
          }
          move "Plasma Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage for each Energy attached to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKARMORY_21:
        return basic (this, hp:HP080, type:METAL, retreatCost:1) {
          weakness R
          resistance P, MINUS20
          move "Steel Coat", {
            text "Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Razor Wing", {
            text "40 damage. "
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Cutting Wind", {
            text "40 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VESPIQUEN_23:
        return evolution (this, from:"Combee", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R
          pokeBody "Defense Sign", {
            text "Prevent all damage done to your Benched Pokémon by attacks."
            delayedA {
            }
          }
          move "Mach Wind", {
            text "60 damage. During your next turn, Vespiquen’s Retreat Cost is 0."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VILEPLUME_24:
        return evolution (this, from:"Gloom", hp:HP120, type:GRASS, retreatCost:2) {
          weakness P
          pokeBody "Allergy Flower", {
            text "Each player can’t play any Trainer cards from his or her hand."
            delayedA {
            }
          }
          move "Dazzling Pollen", {
            text "50 damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage. If tails, the Defending Pokémon is now Confused."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WEAVILE_25:
        return evolution (this, from:"Sneasel", hp:HP080, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          pokePower "Claw Snag", {
            text "Once during your turn, when you play Weavile from your hand to evolve 1 of your Pokémon, you may look at your opponent’s hand. Choose a card from your opponent’s hand and discard it."
            actionA {
            }
          }
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost D, C
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy attached to Flareon."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLOOM_27:
        return evolution (this, from:"Oddish", hp:HP080, type:GRASS, retreatCost:1) {
          weakness P
          move "Miracle Powder", {
            text "30 damage. Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mach Bolt", {
            text "70 damage. "
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LAIRON_29:
        return evolution (this, from:"Aron", hp:HP090, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Scrap Attack", {
            text "20 damage. Energy card and attach it to Lairon."
            energyCost M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tackle", {
            text "60 damage. "
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Smash", {
            text "Flip 2 coins. This attack does 50 damage times the number of heads."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MUK_31:
        return evolution (this, from:"Grimer", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P
          move "Sludge Drag", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Confused and Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pester", {
            text "50 damage. If the Defending Pokémon is affected by a Special Condition, this attack does 50 damage plus 30 more damage."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PINSIR_32:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R
          move "Charging Horn", {
            text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Guillotine", {
            text "60 damage. "
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spark", {
            text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RATICATE_34:
        return evolution (this, from:"Rattata", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness F
          move "Razor-Sharp Incisors", {
            text "Does 10 damage times the number of damage counters on the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gnaw Up", {
            text "30 damage. Discard a Special Energy card attached to the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SABLEYE_35:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          move "Pull Out", {
            text "Search your discard pile for any 1 card, show it to your opponent, and put it on top of your deck."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dark Hand", {
            text "20 damage. If you have more cards in your hand than your opponent, this attack does 20 damage plus 30 more damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCYTHER_36:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R
          move "Afterimage Strike", {
            text "20 damage. During your opponent’s next turn, if Scyther would be damaged by an attack, flip a coin. If heads, prevent that attack’s damage done to Scyther."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Swipes", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWBRO_38:
        return evolution (this, from:"Slowpoke", hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          move "Full-Belly Refresh", {
            text "Remove all Special Conditions and 3 damage counters from Slowbro."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Startling Trip", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, Slowbro is now Confused."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fly", {
            text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of attacks, including damage done to Togetic during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_40:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "DARK", {
            text "Once during your turn, when you put Unown from your hand onto your Bench, you may search your deck for a Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            actionA {
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost P
            attackRequirement {}
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dual Splash", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Single Smash", {
            text "50 damage. Flip a coin. If tails, this attack does nothing."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case COMBEE_44:
        return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
          weakness R
          move "Enraged Assault", {
            text "20 damage. If Vespiquen is on your Bench, and has any damage counters on it, this attack does 20 damage plus 60 more damage, and the Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Headstrike", {
            text "50 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFLOON_46:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Minimize", {
            text "."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pull", {
            text "Flip a coin. If heads, switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EEVEE_47:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EEVEE_48:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Tickle", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GRIMER_50:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Sticky Liquid", {
            text "more."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sludge Toss", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HITMONCHAN_51:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Detect", {
            text "Flip a coin. If heads, prevent all effects of attack, including damage, done to Hitmonchan during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sky Uppercut", {
            text "30 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HITMONLEE_52:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Kick", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "High Jump Kick", {
            text "60 damage. "
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAKUHITA_55:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Slap Down", {
            text "Flip 2 coins. This attack does 20 damage plus 10 more damage for each heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slap Push", {
            text "40 damage. "
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Destructive Jaw", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dual Draw", {
            text "Each player draws 3 cards."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dark Cutter", {
            text "30 damage. "
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ODDISH_60:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness P
          move "Ram", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Find a Friend", {
            text "Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PINECO_62:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R
          move "Rollout", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PINECO_63:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R
          move "Focus Energy", {
            text "During your next turn, Pineco’s Surprise Attack attack’s base damage is 80."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Surprise Attack", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RATTATA_64:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Gnaw", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SCYTHER_65:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R
          move "Cut", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slashing Strike", {
            text "50 damage. During your next turn, Scyther can’t use Slashing Strike."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWPOKE_66:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L
          move "Rambunctious Party", {
            text "Look at the top 5 cards of your deck. Choose as many Basic Pokémon as you like and put them onto your Bench. Shuffle the other cards back into your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Rain Splash", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLUGMA_67:
        return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
          weakness W
          pokePower "Active Volcano", {
            text "Once during your turn , you may discard the top card of your deck. If that card is a Fire Energy card, attach it to Slugma. This power can’t be used if Slugma is affected by a Special Condition."
            actionA {
            }
          }
          move "Combustion", {
            text "40 damage. "
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SNEASEL_68:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          move "Fury Swipes", {
            text "Flip 3 coins. This attack does 10 more damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Beat Up", {
            text "Flip a coin for each of your Pokémon in play. This attack does 20 damage times the number of heads."
            energyCost D, D
            attackRequirement {}
            onAttack {
              damage 0
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
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TOGEPI_70:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Plead", {
            text "Ask your opponent if you may draw 2 cards. If yes, draw 2 cards. If no, this attack does 20 damage to the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BURNED_TOWER_71:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, that player may flip a coin. If heads, the player searches his or her discard pile for a basic Energy card, shows it to his or her opponent, and put it into his or her hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case DEFENDER_72:
        return basicTrainer (this) {
          text "Attach Defender to 1 of your Pokémon. Discard this card at the end of your opponent’s next turn. Any damage done to the Pokémon Defender is attached to by an opponent’s attack is reduced by 20 (after applying Weakness and Resistance)."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_EXCHANGER_73:
        return basicTrainer (this) {
          text "Choose an Energy card from you hand, show it to your opponent, and put it on top of your deck. Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case FLOWER_SHOP_LADY_74:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for 3 Pokémon and 3 basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case LEGEND_BOX_75:
        return basicTrainer (this) {
          text "Reveal the top 10 cards of your deck. If you reveal both halves of a Pokémon LEGEND, put those cards onto your Bench and attach all revealed Energy cards to that Pokémon LEGEND. Shuffle the other cards back into your deck. (You can play only 1 Pokémon LEGEND in this way.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case RUINS_OF_ALPH_76:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach Pokémon in play has no Resistance."
          onPlay {
          }
          playRequirement{
          }
        };
      case SAGE_S_TRAINING_77:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the top 5 cards of your deck. Choose any 2 cards you find there and put them into your hand. Discard the other cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case TEAM_ROCKET_S_TRICKERY_78:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards. Then, your opponent discards a card from his or her hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case DARKNESS_ENERGY_79:
        return specialEnergy (this, [[C]]) {
          text "If the Pokémon Darkness Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). Ignore this effect if the Pokémon that Darkness Energy is attached to isn’t [D]. Darkness Energy provides [D] Energy. (Doesn’t count as a basic Energy card.)"
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case METAL_ENERGY_80:
        return specialEnergy (this, [[C]]) {
          text "Damage done by attacks to the Pokémon that Metal Energy is attached to is reduced by 10 (after applying Weakness and Resistance). Ignore this effect if the Pokémon that Metal Energy is attached to isn’t [M]. Metal Energy provides [M] Energy. (Doesn’t count as a basic Energy card.)"
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          onMove {to->
          }
          allowAttach {to->
          }
        };
      case ESPEON_81:
        return evolution (this, from:"Eevee", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokeBody "Evolution Memories", {
            text "Espeon can use the attacks of all Pokémon you have in play that evolve from Eevee as its own."
            delayedA {
            }
          }
          move "Solar Ray", {
            text "30 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
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
            }
          }
          move "Dark Clamp", {
            text "70 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAICHU_83:
        return evolution (this, from:"Pikachu", hp:HP100, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          pokePower "Voltage Increase", {
            text "As often as you like during your turn , you may move a Energy attached to 1 of your Pokémon to Raichu. This power can’t be used if Raichu is affected by a Special Condition."
            actionA {
            }
          }
          move "Mega Thunderbolt", {
            text "120 damage. Discard all Energy attached to Raichu."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
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
            }
          }
          move "Metal Scissors", {
            text "Energy attacked to Scizor."
            energyCost M, C, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SLOWKING_85:
        return evolution (this, from:"Slowpoke", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Opponent’s Choice", {
            text "Once during your turn , you may reveal the top 2 cards of your deck and your opponent chooses 1 of them. Put that card into your hand and the other card on the bottom of your deck. This power can’t be used if Slowking is affected by a Special Condition."
            actionA {
            }
          }
          move "Super Psy Bolt", {
            text "60 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
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
            }
          }
          move "Evoblast", {
            text "Does 50 damage plus 10 more damage for each of your Pokémon in play that evolves from Eevee."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KYOGRE_AND_GROUDON_LEGEND_87:
        return basic (this, hp:HP150, type:[WATER, F], retreatCost:3) {
          weakness G
          weakness L
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Kyogre & Groudon LEGEND."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mega Tidal Wave", {
            text "Discard the top 5 cards from your opponent’s deck. This attack does 30 damage times the number of Energy cards you discarded to each of your opponent’s Benched Pokémon."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Massive Eruption", {
            text "Discard the top 5 cards from your deck. This attack does 100 damage times the number of Energy cards you discarded."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KYOGRE_AND_GROUDON_LEGEND_88:
        return copy (KYOGRE_AND_GROUDON_LEGEND_87, this)
        /*basic (this, hp:HP150, type:[WATER, F], retreatCost:3) {
					weakness G
					weakness L
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Kyogre & Groudon LEGEND."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Mega Tidal Wave", {
						text "Discard the top 5 cards from your opponent’s deck. This attack does 30 damage times the number of Energy cards you discarded to each of your opponent’s Benched Pokémon."
						energyCost W, W, C, C
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Massive Eruption", {
						text "Discard the top 5 cards from your deck. This attack does 100 damage times the number of Energy cards you discarded."
						energyCost F, F, C, C
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "", {
						text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}

				}*/;
      case RAYQUAZA_AND_DEOXYS_LEGEND_89:
        return basic (this, hp:HP140, type:[PSYCHIC, C], retreatCost:3) {
          weakness P
          weakness C
          pokeBody "Space Virus", {
            text "If your opponent’s Pokémon is Knocked Out by damage from an attack of Rayquaza & Deoxys LEGEND, take 1 more Prize card."
            delayedA {
            }
          }
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Rayquaza & Deoxys LEGEND."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ozone Buster", {
            text "150 damage. Energy attached to Rayquaza & Deoxys LEGEND."
            energyCost R, R, L, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAYQUAZA_AND_DEOXYS_LEGEND_90:
        return copy (RAYQUAZA_AND_DEOXYS_LEGEND_89, this)
        /*basic (this, hp:HP140, type:[PSYCHIC, C], retreatCost:3) {
					weakness P
					weakness C
					pokeBody "Space Virus", {
						text "If your opponent’s Pokémon is Knocked Out by damage from an attack of Rayquaza & Deoxys LEGEND, take 1 more Prize card."
						delayedA {
						}
					}
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Rayquaza & Deoxys LEGEND."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Ozone Buster", {
						text "150 damage. Energy attached to Rayquaza & Deoxys LEGEND."
						energyCost R, R, L, C, R
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "", {
						text "When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}

				}*/;
      case ALPH_LITHOGRAPH_THREE:
        return basicTrainer (this) {
          text "RETURN ANY STADIUM CARD IN PLAY TO ITS PLAYERS HAND!"
          onPlay {
          }
          playRequirement{
          }
        };
      default:
        return null;
    }
  }

}
