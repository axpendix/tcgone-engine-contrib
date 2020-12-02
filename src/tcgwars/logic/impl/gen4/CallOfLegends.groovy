package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.RubySapphire
import tcgwars.logic.impl.gen3.TeamRocketReturns;
import tcgwars.logic.impl.gen3.DeltaSpecies;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum CallOfLegends implements LogicCardInfo {

  CLEFABLE_1 ("Clefable", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DEOXYS_2 ("Deoxys", "2", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DIALGA_3 ("Dialga", "3", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  ESPEON_4 ("Espeon", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FORRETRESS_5 ("Forretress", "5", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  GROUDON_6 ("Groudon", "6", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  GYARADOS_7 ("Gyarados", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HITMONTOP_8 ("Hitmontop", "8", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  HO_OH_9 ("Ho-Oh", "9", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  HOUNDOOM_10 ("Houndoom", "10", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  JIRACHI_11 ("Jirachi", "11", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  KYOGRE_12 ("Kyogre", "12", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  LEAFEON_13 ("Leafeon", "13", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LUCARIO_14 ("Lucario", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LUGIA_15 ("Lugia", "15", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MAGMORTAR_16 ("Magmortar", "16", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  NINETALES_17 ("Ninetales", "17", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PACHIRISU_18 ("Pachirisu", "18", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  PALKIA_19 ("Palkia", "19", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  RAYQUAZA_20 ("Rayquaza", "20", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  SMEARGLE_21 ("Smeargle", "21", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  UMBREON_22 ("Umbreon", "22", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  AMPHAROS_23 ("Ampharos", "23", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  CLEFFA_24 ("Cleffa", "24", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  FERALIGATR_25 ("Feraligatr", "25", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  GRANBULL_26 ("Granbull", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MEGANIUM_27 ("Meganium", "27", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  MISMAGIUS_28 ("Mismagius", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MR__MIME_29 ("Mr. Mime", "29", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  PIDGEOT_30 ("Pidgeot", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SKARMORY_31 ("Skarmory", "31", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  SLOWKING_32 ("Slowking", "32", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SNORLAX_33 ("Snorlax", "33", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  TANGROWTH_34 ("Tangrowth", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TYPHLOSION_35 ("Typhlosion", "35", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  TYROGUE_36 ("Tyrogue", "36", Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  URSARING_37 ("Ursaring", "37", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WEEZING_38 ("Weezing", "38", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ZANGOOSE_39 ("Zangoose", "39", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  BAYLEEF_40 ("Bayleef", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CROCONAW_41 ("Croconaw", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DONPHAN_42 ("Donphan", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  FLAAFFY_43 ("Flaaffy", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FLAREON_44 ("Flareon", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_45 ("Jolteon", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAGBY_46 ("Magby", "46", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MIME_JR__47 ("Mime Jr.", "47", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PIDGEOTTO_48 ("Pidgeotto", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  QUILAVA_49 ("Quilava", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RIOLU_50 ("Riolu", "50", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SEVIPER_51 ("Seviper", "51", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VAPOREON_52 ("Vaporeon", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  CHIKORITA_53 ("Chikorita", "53", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CLEFAIRY_54 ("Clefairy", "54", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CYNDAQUIL_55 ("Cyndaquil", "55", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  EEVEE_56 ("Eevee", "56", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HITMONCHAN_57 ("Hitmonchan", "57", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_58 ("Hitmonlee", "58", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HOUNDOUR_59 ("Houndour", "59", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  KOFFING_60 ("Koffing", "60", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MAGIKARP_61 ("Magikarp", "61", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGMAR_62 ("Magmar", "62", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MAREEP_63 ("Mareep", "63", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MAWILE_64 ("Mawile", "64", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MISDREAVUS_65 ("Misdreavus", "65", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PHANPY_66 ("Phanpy", "66", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIDGEY_67 ("Pidgey", "67", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PINECO_68 ("Pineco", "68", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  RELICANTH_69 ("Relicanth", "69", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SLOWPOKE_70 ("Slowpoke", "70", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SNUBBULL_71 ("Snubbull", "71", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TANGELA_72 ("Tangela", "72", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TEDDIURSA_73 ("Teddiursa", "73", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TOTODILE_74 ("Totodile", "74", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VULPIX_75 ("Vulpix", "75", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHEERLEADER_S_CHEER_76 ("Cheerleader's Cheer", "76", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  COPYCAT_77 ("Copycat", "77", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  DUAL_BALL_78 ("Dual Ball", "78", Rarity.UNCOMMON, [TRAINER,ITEM]),
  INTERVIEWER_S_QUESTIONS_79 ("Interviewer's Questions", "79", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  LOST_REMOVER_80 ("Lost Remover", "80", Rarity.UNCOMMON, [TRAINER,ITEM]),
  LOST_WORLD_81 ("Lost World", "81", Rarity.UNCOMMON, [TRAINER,STADIUM]),
  PROFESSOR_ELM_S_TRAINING_METHOD_82 ("Professor Elm's Training Method", "82", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  PROFESSOR_OAK_S_NEW_THEORY_83 ("Professor Oak's New Theory", "83", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  RESEARCH_RECORD_84 ("Research Record", "84", Rarity.UNCOMMON, [TRAINER,ITEM]),
  SAGE_S_TRAINING_85 ("Sage's Training", "85", Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  DARKNESS_ENERGY_86 ("Darkness Energy", "86", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_87 ("Metal Energy", "87", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  GRASS_ENERGY_88 ("Grass Energy", "88", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_89 ("Fire Energy", "89", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_90 ("Water Energy", "90", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_91 ("Lightning Energy", "91", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_92 ("Psychic Energy", "92", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIGHTING_ENERGY_93 ("Fighting Energy", "93", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  DARKNESS_ENERGY_94 ("Darkness Energy", "94", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  METAL_ENERGY_95 ("Metal Energy", "95", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  DEOXYS_SL1 ("Deoxys", "SL1", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DIALGA_SL2 ("Dialga", "SL2", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  ENTEI_SL3 ("Entei", "SL3", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  GROUDON_SL4 ("Groudon", "SL4", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  HO_OH_SL5 ("Ho-Oh", "SL5", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  KYOGRE_SL6 ("Kyogre", "SL6", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  LUGIA_SL7 ("Lugia", "SL7", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  PALKIA_SL8 ("Palkia", "SL8", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  RAIKOU_SL9 ("Raikou", "SL9", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  RAYQUAZA_SL10 ("Rayquaza", "SL10", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  SUICUNE_SL11 ("Suicune", "SL11", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  CallOfLegends(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.CALL_OF_LEGENDS;
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
      case CLEFABLE_1:
        return copy(HeartgoldSoulsilver.CLEFABLE_3, this);
      case DEOXYS_2:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Cell Storm", {
            text "60 damage. Discard 2 [P] energy attached to Deoxys and remove 6 damage counters from Deoxys."
            energyCost P, P, P
            onAttack {
              damage 60
              discardSelfEnergyAfterDamage P,P
              heal 60, self
            }
          }

        };
      case DIALGA_3:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Time Rewind", {
            text "70 damage. Shuffle your hand into your deck."
            energyCost M, M, M, M
            onAttack {
              damage 70
              afterDamage{
                my.hand.moveTo(hidden:true, my.deck)
                shuffleDeck()
              }
            }
          }
        };
      case ESPEON_4:
        return copy(Undaunted.ESPEON_2, this);
      case FORRETRESS_5:
        return copy(Undaunted.FORRETRESS_3, this);
      case GROUDON_6:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:4) {
          weakness G
          move "Volcano Stomp", {
            text "80 damage. Flip a coin. If heads, discard the top 4 cards of your opponent’s deck. If tails, discard the top 4 cards of your deck."
            energyCost F, F, F, F
            onAttack {
              damage 80
              afterDamage{
                flip 1, {
                  opp.deck.subList(0,4).discard()
                }, {
                  my.deck.subList(0,4).discard()
                }
              }
            }
          }

        };
      case GYARADOS_7:
        return copy(HeartgoldSoulsilver.GYARADOS_4, this);
      case HITMONTOP_8:
        return copy(HeartgoldSoulsilver.HITMONTOP_5, this);
      case HO_OH_9:
        return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          move "Combustion", {
            text "50 damage. "
            energyCost R, C, C
            onAttack {
              damage 50
            }
          }
          move "Scorching Wing", {
            text "100 damage. Flip a coin. If tails, discard all [R] energy attached to Ho-Oh."
            energyCost R, R, R, C, C
            onAttack {
              damage 100
              afterDamage{
                flip 1, {}, {
                  discardAllSelfEnergy(R)
                }
              }
            }
          }

        };
      case HOUNDOOM_10:
        return copy(Undaunted.HOUNDOOM_5, this);
      case JIRACHI_11:
        return copy(Unleashed.JIRACHI_1, this);
      case KYOGRE_12:
        return basic (this, hp:HP100, type:WATER, retreatCost:4) {
          weakness L
          move "Destructive Tsunami", {
            text "Flip a coin. If heads, this attack does 40 damage to each of your opponent’s Pokémon. If tails, this attack does 40 damage to each of your Pokémon."
            energyCost W, W, W, W
            onAttack {
              flip 1, {
                opp.all.each{
                  damage 40, it
                }
              },{
                my.all.each{
                  damage 40, it
                }
              }
            }
          }

        };
      case LEAFEON_13:
        return copy(Undaunted.LEAFEON_17, this);
      case LUCARIO_14:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Dimension Sphere", {
            text "30+ damage. Does 30 damage plus 20 more damage for each of your Pokémon in the Lost Zone."
            energyCost C, C
            onAttack {
              damage 30+20*my.lostZone.filterByType(POKEMON).size()
            }
          }
          move "Sky Uppercut", {
            text "70 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, F, C
            onAttack {
              damage 70
              dontApplyResistance()
            }
          }

        };
      case LUGIA_15:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness L
          resistance F, MINUS20
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W, C, C
            onAttack {
              damage 30, opp.bench.select()
            }
          }
          move "Hydro Splash", {
            text "80 damage. "
            energyCost W, W, W, C, C
            onAttack {
              damage 80
            }
          }

        };
      case MAGMORTAR_16:
        return copy(Unleashed.MAGMORTAR_2, this);
      case NINETALES_17:
        return copy(HeartgoldSoulsilver.NINETALES_7, this);
      case PACHIRISU_18:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          pokePower "Self-Generation", {
            text "Once during your turn, when you put Pachirisu from your hand onto your Bench, you may attach up to 2 [L] Energy cards from your hand to Pachirisu."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(L) && confirm("Use Self-Generation?")){
                powerUsed()
                attachEnergyFrom(type: L, my.hand, self)
              }
            }
          }
          move "Shocking Bolt", {
            text "50 damage. Put all Energy cards attached to Pachirisu in the Lost Zone."
            energyCost L, L
            onAttack {
              damage 50
              afterDamage{
                self.cards.filterByType(ENERGY).moveTo(my.lostZone)
              }
            }
          }

        };
      case PALKIA_19:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness L
          move "Wormhole", {
            text "60 damage. Switch Palkia with 1 of your Benched Pokémon. Then, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost W, W, W, W
            onAttack {
              damage 60
              afterDamage{
                switchYourActive()
                whirlwind()
              }
            }
          }

        };
      case RAYQUAZA_20:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness C
          resistance F, MINUS20
          move "Inferno Spear", {
            text "100 damage. Discard a [R] and a [L] energy attached to Rayquaza."
            energyCost R, R, L, L
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage R,L
            }
          }

        };
      case SMEARGLE_21:
        return copy(Undaunted.SMEARGLE_8, this);
      case UMBREON_22:
        return copy(Undaunted.UMBREON_10, this);
      case AMPHAROS_23:
        return copy(HeartgoldSoulsilver.AMPHAROS_14, this);
      case CLEFFA_24:
        return copy(HeartgoldSoulsilver.CLEFFA_17, this);
      case FERALIGATR_25:
        return copy(HeartgoldSoulsilver.FERALIGATR_20, this);
      case GRANBULL_26:
        return copy(HeartgoldSoulsilver.GRANBULL_22, this);
      case MEGANIUM_27:
        return copy(HeartgoldSoulsilver.MEGANIUM_26, this);
      case MISMAGIUS_28:
        return copy(Undaunted.MISMAGIUS_19, this);
      case MR__MIME_29:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Trick Reveal", {
            text "Once during your turn , you may have both you and your opponent reveal your hands. This power can’t be used if Mr. Mime is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              powerUsed()
              opp.hand.shuffledCopy().showToMe("Opponent’s hand")
              my.hand.shuffledCopy().showToOpponent("Opponent's hand")
            }
          }
          move "Juggling", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost P, C
            onAttack {
              flip 4, {
                damage 10
              }
            }
          }

        };
      case PIDGEOT_30:
        return copy(Triumphant.PIDGEOT_29, this);
      case SKARMORY_31:
        return copy(Undaunted.SKARMORY_21, this);
      case SLOWKING_32:
        return copy(HeartgoldSoulsilver.SLOWKING_12, this);
      case SNORLAX_33:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          move "Layabout", {
            text "Remove all damage counters from Snorlax. Snorlax can’t use Layabout during your next turn."
            energyCost C, C, C
            attackRequirement {self.numberOfDamageCounters}
            onAttack {
              healAll self
              cantUseAttack(thisMove, self)
            }
          }
          move "Clomp Clomp Clobber", {
            text "80 damage. Put 1 Energy card attached to Snorlax in the Lost Zone."
            energyCost C, C, C, C
            onAttack {
              damage 80
              moveSelfEnergyAfterDamage my.lostZone
            }
          }

        };
      case TANGROWTH_34:
        return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:4) {
          weakness R
          resistance W, MINUS20
          move "Grind", {
            text "20× damage. Does 20 damage times the amount of Energy attached to Tangrowth."
            energyCost C
            onAttack {
              damage 20*self.cards.energyCount(C)
            }
          }
          move "Plow Over", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, put 1 Energy card attached to the Defending Pokémon in the Lost Zone."
            energyCost G, C, C
            onAttack {
              damage 30
              flip 1, {
                applyAfterDamage PARALYZED
              }, {
                defending.cards.filterByType(ENERGY).select("Choose an energy to put into the Lost Zone").moveTo(opp.lostZone)
              }
            }
          }

        };
      case TYPHLOSION_35:
        return copy(HeartgoldSoulsilver.TYPHLOSION_32, this);
      case TYROGUE_36:
        return copy(HeartgoldSoulsilver.TYROGUE_33, this);
      case URSARING_37:
        return copy(Unleashed.URSARING_27, this);
      case WEEZING_38:
        return copy(HeartgoldSoulsilver.WEEZING_34, this);
      case ZANGOOSE_39:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness F
          move "Swords Dance", {
            text "During you next turn, Zangoose’s Lost Claw attack’s base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Lost Claw", hp(50))
            }
          }
          move "Lost Claw", {
            text "30 damage. Choose 1 card from your opponent’s hand without looking and put it in the Lost Zone."
            energyCost C, C, C
            onAttack {
              damage 30
              afterDamage{
                opp.hand.shuffledCopy().select(hidden: true, "Choose 1 card to put in the Lost Zone.").moveTo(opp.lostZone)
              }
            }
          }

        };
      case BAYLEEF_40:
        return copy(HeartgoldSoulsilver.BAYLEEF_35, this);
      case CROCONAW_41:
        return copy(HeartgoldSoulsilver.CROCONAW_38, this);
      case DONPHAN_42:
        return copy(HeartgoldSoulsilver.DONPHAN_40, this);
      case FLAAFFY_43:
        return copy(HeartgoldSoulsilver.FLAAFFY_42, this);
      case FLAREON_44:
        return copy(Undaunted.FLAREON_26, this);
      case JOLTEON_45:
        return copy(Undaunted.JOLTEON_28, this);
      case MAGBY_46:
        return copy(Triumphant.MAGBY_41, this);
      case MIME_JR__47:
        return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
          pokeBody "Sweet Sleeping Face", {
            text "As long as Mime Jr. is Asleep, prevent all damage done to Mime Jr. by attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(self.isSPC(ASLEEP) && it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Sleepy Lost", {
            text "Put the top card of your opponent’s deck in the Lost Zone. Mime Jr. is now Asleep."
            energyCost ()
            onAttack {
              opp.deck.first().moveTo(opp.lostZone)
              apply ASLEEP, self
            }
          }

        };
      case PIDGEOTTO_48:
        return copy(Triumphant.PIDGEOTTO_47, this);
      case QUILAVA_49:
        return copy(HeartgoldSoulsilver.QUILAVA_49, this);
      case RIOLU_50:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Tumble Over", {
            text "20 damage. Riolu can’t attack during your next turn."
            energyCost F
            onAttack {
              damage 20
              cantAttackNextTurn self
            }
          }

        };
      case SEVIPER_51:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Poison Buildup", {
            text "Seviper is now Poisoned."
            energyCost C
            onAttack {
              apply POISONED, self
            }
          }
          move "Poison Effect", {
            text "20+ damage. If Seviper is Poisoned, this attack does 20 damage plus 60 more damage and remove the Special Condition Poisoned from Seviper."
            energyCost P, C
            onAttack {
              damage 20
              if(self.isSPC(POISONED)){
                damage 60
                afterDamage {
                  clearSpecialCondition(self, ATTACK, [POISONED])
                }
              }
            }
          }

        };
      case VAPOREON_52:
        return copy(Undaunted.VAPOREON_41, this);
      case CHIKORITA_53:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Nap", {
            text "Remove 1 damage counter from Chikorita."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              heal 10, self
            }
          }
          move "Reckless Charge", {
            text "30 damage. Chikorita does 10 damage to itself."
            energyCost G, C
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case CLEFAIRY_54:
        return copy(HeartgoldSoulsilver.CLEFAIRY_60, this);
      case CYNDAQUIL_55:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W
          move "Fireworks", {
            text "20 damage. Flip a coin. If tails discard a [R] Energy attached to Cyndaquil."
            energyCost R
            onAttack {
              damage 20
              flip 1, {} , {discardSelfEnergyAfterDamage(R)}
            }
          }

        };
      case EEVEE_56:
        return copy(Undaunted.EEVEE_47, this);
      case HITMONCHAN_57:
        return copy(Undaunted.HITMONCHAN_51, this);
      case HITMONLEE_58:
        return copy(Undaunted.HITMONLEE_52, this);
      case HOUNDOUR_59:
        return copy(Undaunted.HOUNDOUR_54, this);
      case KOFFING_60:
        return copy(HeartgoldSoulsilver.KOFFING_70, this);
      case MAGIKARP_61:
        return copy(HeartgoldSoulsilver.MAGIKARP_72, this);
      case MAGMAR_62:
        return copy(Unleashed.MAGMAR_52, this);
      case MAREEP_63:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Static Shock", {
            text "10 damage. "
            energyCost L
            onAttack {
              damage 10
            }
          }

        };
      case MAWILE_64:
        return copy(Undaunted.MAWILE_56, this);
      case MISDREAVUS_65:
        return copy(Undaunted.MISDREAVUS_57, this);
      case PHANPY_66:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness W
          resistance L, MINUS20
          pokeBody "Ultra-Thick Skin", {
            text "As long as Phanpy has Energy attached to it, any damage done to Phanpy by attacks is reduced by 10 ."
            delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.to==self && it.from.owner==self.owner.opposite && it.notZero && it.notNoEffect){
                  bc "$thisAbility -10"
                  it.dmg-=hp(10)
                }}
              }
            }
          }
          move "Rock Smash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }

        };
      case PIDGEY_67:
        return copy(Triumphant.PIDGEY_71, this);
      case PINECO_68:
        return copy(Undaunted.PINECO_63, this);
      case RELICANTH_69:
        return basic (this, hp:HP080, type:WATER, retreatCost:2) {
          weakness G
          move "Prehistoric Wisdom", {
            text "Choose a card from your hand and put it in the Lost Zone. Then, draw 3 cards."
            energyCost C
            attackRequirement {
              assert my.deck|my.hand : "You have no cards in your hand or deck!"
            }
            onAttack {
              my.hand.select("Choose a card to put in the Lost Zone").first().moveTo(my.lostZone)
              draw 3
            }
          }
          move "Granite Head", {
            text "30 damage. During your opponent's next turn, any damage done to Relicanth by an opponent's attack is reduced by 30."
            energyCost W, C, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(30), thisMove)
            }
          }

        };
      case SLOWPOKE_70:
        return copy(HeartgoldSoulsilver.SLOWPOKE_81, this);
      case SNUBBULL_71:
        return copy(HeartgoldSoulsilver.SNUBBULL_82, this);
      case TANGELA_72:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Nutritional Support", {
            text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck : "Your deck is empty!"
            }
            onAttack {
              attachEnergyFrom(type: G, my.deck, my.all)
              shuffleDeck()
            }
          }
          move "Poisonpowder", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C, C
            onAttack {
              damage 30
              apply POISONED
            }
          }

        };
      case TEDDIURSA_73:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Fake Tears", {
            text "Flip a coin. If heads, your opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn, and any damage done to Teddiursa by attack is reduced by 30 (after applying weakness and resistance)."
            energyCost C
            onAttack {
              flip {
                delayed {
                  before PLAY_TRAINER, {
                    if (bg.currentTurn == self.owner.opposite && ef.cardToPlay.cardTypes.is(ITEM) && ef.reason == PLAY_FROM_HAND) {
                      wcu "Fake Tears prevents you from playing Trainer cards."
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
                reduceDamageNextTurn(hp(30), thisMove)
              }
            }
          }

        };
      case TOTODILE_74:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L
          move "Aqua Tail", {
            text "30+ damage. Flip a coin for each [W] Energy attached to Totodile. This attack does 30 damage plus 20 more damage for each heads."
            energyCost W, C, C
            onAttack {
              damage 30
              flip self.cards.energyCount(W), {
                damage 20
              } 
            }
          }

        };
      case VULPIX_75:
        return copy(HeartgoldSoulsilver.VULPIX_87, this);
      case CHEERLEADER_S_CHEER_76:
      return copy(Unleashed.CHEERLEADER_S_CHEER_71, this);
      case COPYCAT_77:
        return copy(TeamRocketReturns.COPYCAT_83, this);
      case DUAL_BALL_78:
        return copy(DeltaSpecies.DUAL_BALL_89, this);
      case INTERVIEWER_S_QUESTIONS_79:
        return copy(Unleashed.INTERVIEWER_S_QUESTIONS_77, this)
      case LOST_REMOVER_80:
        return basicTrainer (this) {
          text "Put 1 Special Energy card attached to 1 of your opponent’s Pokémon in the Lost Zone."
          onPlay {
            def pcs = opp.all.findAll{it.cards.filterByType(SPECIAL_ENERGY)}.select("Remove special energy from which Pokémon?")
            pcs.cards.filterByTYpe(SPECIAL_ENERGY).select("Put which special energy in the Lost Zone?").first().moveTo(opp.lostZone)
          }
          playRequirement{
            assert opp.all.find{it.cards.filterByType(SPECIAL_ENERGY)}
          }
        };
      case LOST_WORLD_81:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, if this player’s opponent has 6 or more Pokémon in the Lost Zone, the player may choose to win the game."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Lost World") {
              assert lastTurn != bg().turnCount : "You've already used Lost World this turn."
              assert opp.lostZone.filterByType(POKEMON).size<6 : "Your opponent has fewer than 6 Pokémon in the Lost Zone"
              bc "Used Lost World."
              lastTurn = bg().turnCount
              bg.getGame().endGame(bg.currentTurn, WinCondition.OTHER);
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case PROFESSOR_ELM_S_TRAINING_METHOD_82:
        return copy(HeartgoldSoulsilver.PROFESSOR_ELM_S_TRAINING_METHOD_100, this);
      case PROFESSOR_OAK_S_NEW_THEORY_83:
        return copy(HeartgoldSoulsilver.PROFESSOR_OAK_S_NEW_THEORY_101, this);
      case RESEARCH_RECORD_84:
        return basicTrainer (this) {
          text "Look at the top 4 cards of your deck and put as many of them as you like back on top of your deck in any order. Then, put the remaining cards on the bottom of your deck in any order."
          onPlay {
            def tar = my.deck.subList(0,5)
            def sel = tar.select(min:0, max:tar.size(), "Choose any number of cards to put on top of your deck(unselected cards will be put on the bottom of your deck)")
            if(sel){
              tar.remove(sel)
              deck.setSublist(0,rearrange(sel,"Arrange the top of your deck"))
            }
            if(tar){
              rearrange(tar,"Arrange the bottom of your deck").moveTo(my.deck)
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      case SAGE_S_TRAINING_85:
        return copy(Undaunted.SAGE_S_TRAINING_77, this);
      case DARKNESS_ENERGY_86:
        return copy (MysteriousTreasures.DARKNESS_ENERGY_119, this);
      case METAL_ENERGY_87:
        return copy (RubySapphire.METAL_ENERGY_94, this);
      case GRASS_ENERGY_88:
        return basicEnergy (this, GRASS);
      case FIRE_ENERGY_89:
        return basicEnergy (this, FIRE);
      case WATER_ENERGY_90:
        return basicEnergy (this, WATER);
      case LIGHTNING_ENERGY_91:
        return basicEnergy (this, LIGHTNING);
      case PSYCHIC_ENERGY_92:
        return basicEnergy (this, PSYCHIC);
      case FIGHTING_ENERGY_93:
        return basicEnergy (this, FIGHTING);
      case DARKNESS_ENERGY_94:
        return basicEnergy (this, DARKNESS);
      case METAL_ENERGY_95:
        return basicEnergy (this, METAL);
      case DEOXYS_SL1:
        return copy (DEOXYS_2, this);
      case DIALGA_SL2:
        return copy (DIALGA_3, this);
      case ENTEI_SL3:
        return basic (this, hp:HP090, type:FIRE, retreatCost:2) {
          weakness W
          pokeBody "Extreme Speed", {
            text "Entei’s Retreat Cost is [C] Energy less for each [R] Energy attached to Entei."
            getterA (GET_RETREAT_COST) { h->
              if (h.effect.target == self) {
                h.object -= self.cards.energyCount(R)
              }
            }
          }
          move "Wild Blaze", {
            text "70 damage. Discard the top 3 cards of your deck."
            energyCost R, R, C
            onAttack {
              damage 70
              my.deck.subList(0,3).discard()
            }
          }

        };
      case GROUDON_SL4:
        return copy (GROUDON_6, this);
      case HO_OH_SL5:
        return copy (HO_OH_9, this);
      case KYOGRE_SL6:
        return copy (KYOGRE_12, this);
      case LUGIA_SL7:
        return copy (LUGIA_15, this);
      case PALKIA_SL8:
        return copy (PALKIA_19, this);
      case RAIKOU_SL9:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness F
          resistance M, MINUS20
          pokeBody "Extreme Speed", {
            text "Raikou’s Retreat Cost is [C] less for each [L] Energy attached to Raikou."
            getterA (GET_RETREAT_COST) { h->
              if (h.effect.target == self) {
                h.object -= self.cards.energyCount(L)
              }
            }
          }
          move "Raging Thunder", {
            text "70 damage. Does 20 damage to 1 of your Pokémon and don’t apply Weakness and Resistance to this damage."
            energyCost L, L, C
            onAttack {
              damage 70
              noWrDamage(40,my.all.select())
            }
          }

        };
      case RAYQUAZA_SL10:
        return copy (RAYQUAZA_20, this);
      case SUICUNE_SL11:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          pokeBody "Extreme Speed", {
            text "Suicune’s Retreat Cost is [C] less for each [W] Energy attached to Suicune."
            getterA (GET_RETREAT_COST) { h->
              if (h.effect.target == self) {
                h.object -= self.cards.energyCount(W)
              }
            }
          }
          move "Tsunami", {
            text "This attack does 20 damage to each of your opponent’s Pokémon."
            energyCost W, W, C
            onAttack {
              opp.all.each{
                damage 20, it
              }
            }
          }

        };
      default:
        return null;
    }
  }

}
