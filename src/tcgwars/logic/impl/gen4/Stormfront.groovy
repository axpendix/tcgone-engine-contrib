package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen2.Aquapolis
import tcgwars.logic.impl.gen3.UnseenForces
import tcgwars.logic.impl.gen3.FireRedLeafGreen
import tcgwars.logic.impl.gen4.GreatEncounters;
import tcgwars.logic.impl.gen5.BlackWhite;

import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.effect.gm.PlayStadium
import tcgwars.logic.effect.special.SpecialConditionType

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import java.util.*;
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

import tcgwars.logic.effect.ability.Ability.ActivationReason
import tcgwars.logic.effect.gm.*
import tcgwars.logic.client.*

import java.util.function.Predicate

import static tcgwars.logic.groovy.TcgBuilders.delayed
import static tcgwars.logic.groovy.TcgBuilders.getter
import static tcgwars.logic.groovy.TcgBuilders.specialEnergy
import tcgwars.logic.card.Resistance.ResistanceType


/**
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum Stormfront implements LogicCardInfo {

  DUSKNOIR_1 ("Dusknoir", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_2 ("Empoleon", "2", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  INFERNAPE_3 ("Infernape", "3", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LUMINEON_4 ("Lumineon", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGNEZONE_5 ("Magnezone", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MAGNEZONE_6 ("Magnezone", "6", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  MISMAGIUS_7 ("Mismagius", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  RAICHU_8 ("Raichu", "8", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  REGIGIGAS_9 ("Regigigas", "9", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  SCEPTILE_10 ("Sceptile", "10", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TORTERRA_11 ("Torterra", "11", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  ABOMASNOW_12 ("Abomasnow", "12", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BRONZONG_13 ("Bronzong", "13", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CHERRIM_14 ("Cherrim", "14", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DRAPION_15 ("Drapion", "15", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DRIFBLIM_16 ("Drifblim", "16", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSKNOIR_17 ("Dusknoir", "17", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GENGAR_18 ("Gengar", "18", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GYARADOS_19 ("Gyarados", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MACHAMP_20 ("Machamp", "20", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  MAMOSWINE_21 ("Mamoswine", "21", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  RAPIDASH_22 ("Rapidash", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  ROSERADE_23 ("Roserade", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SALAMENCE_24 ("Salamence", "24", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SCIZOR_25 ("Scizor", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SKUNTANK_26 ("Skuntank", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  STARAPTOR_27 ("Staraptor", "27", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  STEELIX_28 ("Steelix", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TANGROWTH_29 ("Tangrowth", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TYRANITAR_30 ("Tyranitar", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  VESPIQUEN_31 ("Vespiquen", "31", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BIBAREL_32 ("Bibarel", "32", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BUDEW_33 ("Budew", "33", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSCLOPS_34 ("Dusclops", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSCLOPS_35 ("Dusclops", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ELECTRODE_36 ("Electrode", "36", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ELECTRODE_37 ("Electrode", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FARFETCH_D_38 ("Farfetch'd", "38", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GROVYLE_39 ("Grovyle", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HAUNTER_40 ("Haunter", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MACHOKE_41 ("Machoke", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGNETON_42 ("Magneton", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGNETON_43 ("Magneton", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MILTANK_44 ("Miltank", "44", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  PICHU_45 ("Pichu", "45", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PILOSWINE_46 ("Piloswine", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PUPITAR_47 ("Pupitar", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SABLEYE_48 ("Sableye", "48", Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  SCYTHER_49 ("Scyther", "49", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SHELGON_50 ("Shelgon", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SKARMORY_51 ("Skarmory", "51", Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  STARAVIA_52 ("Staravia", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BAGON_53 ("Bagon", "53", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BIDOOF_54 ("Bidoof", "54", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_55 ("Bronzor", "55", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CHERUBI_56 ("Cherubi", "56", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  COMBEE_57 ("Combee", "57", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DRIFLOON_58 ("Drifloon", "58", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_59 ("Duskull", "59", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_60 ("Duskull", "60", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  FINNEON_61 ("Finneon", "61", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GASTLY_62 ("Gastly", "62", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  LARVITAR_63 ("Larvitar", "63", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MACHOP_64 ("Machop", "64", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGIKARP_65 ("Magikarp", "65", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGNEMITE_66 ("Magnemite", "66", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MAGNEMITE_67 ("Magnemite", "67", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MISDREAVUS_68 ("Misdreavus", "68", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ONIX_69 ("Onix", "69", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIKACHU_70 ("Pikachu", "70", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PONYTA_71 ("Ponyta", "71", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  ROSELIA_72 ("Roselia", "72", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKORUPI_73 ("Skorupi", "73", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SNOVER_74 ("Snover", "74", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARLY_75 ("Starly", "75", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUNKY_76 ("Stunky", "76", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SWINUB_77 ("Swinub", "77", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TANGELA_78 ("Tangela", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TREECKO_79 ("Treecko", "79", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_80 ("Voltorb", "80", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  VOLTORB_81 ("Voltorb", "81", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  CONDUCTIVE_QUARRY_82 ("Conductive Quarry", "82", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ENERGY_LINK_83 ("Energy Link", "83", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  ENERGY_SWITCH_84 ("Energy Switch", "84", Rarity.UNCOMMON, [TRAINER, ITEM]),
  GREAT_BALL_85 ("Great Ball", "85", Rarity.UNCOMMON, [TRAINER, ITEM]),
  LUXURY_BALL_86 ("Luxury Ball", "86", Rarity.UNCOMMON, [TRAINER, ITEM]),
  MARLEY_S_REQUEST_87 ("Marley's Request", "87", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKE_BLOWER_PLUS_88 ("Poké Blower +", "88", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_DRAWER_PLUS_89 ("Poké Drawer +", "89", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_HEALER_PLUS_90 ("Poké Healer +", "90", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PREMIER_BALL_91 ("Premier Ball", "91", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POTION_92 ("Potion", "92", Rarity.COMMON, [TRAINER, ITEM]),
  SWITCH_93 ("Switch", "93", Rarity.UNCOMMON, [TRAINER, ITEM]),
  CYCLONE_ENERGY_94 ("Cyclone Energy", "94", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  WARP_ENERGY_95 ("Warp Energy", "95", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DUSKNOIR_LV_X_96 ("Dusknoir Lv.X", "96", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  HEATRAN_LV_X_97 ("Heatran Lv.X", "97", Rarity.HOLORARE, [LVL_X, POKEMON, _FIRE_]),
  MACHAMP_LV_X_98 ("Machamp Lv.X", "98", Rarity.HOLORARE, [LVL_X, POKEMON, _FIGHTING_]),
  RAICHU_LV_X_99 ("Raichu Lv.X", "99", Rarity.HOLORARE, [LVL_X, POKEMON, _LIGHTNING_]),
  REGIGIGAS_LV_X_100 ("Regigigas Lv.X", "100", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  CHARMANDER_101 ("Charmander", "101", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  CHARMELEON_102 ("Charmeleon", "102", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHARIZARD_103 ("Charizard", "103", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DRIFLOON_SH1 ("Drifloon", "SH1", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_SH2 ("Duskull", "SH2", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  VOLTORB_SH3 ("Voltorb", "SH3", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Stormfront(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.STORMFRONT;
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
      case DUSKNOIR_1:
        return evolution (this, from:"Dusclops", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Shadow Command", {
            text "Once during your turn , you may draw 2 cards. If you have 7 or more cards in your hand, discard a number of cards until you have 6 cards in your hand. Then, put 2 damage counters on Dusknoir. This power can’t be used if Dusknoir is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              draw 2
              if(my.hand.size() > 6) {
                my.hand.select(count : my.hand.size() - 6, "Discard cards until you have 6 cards in your hand.").discard()
              }
              directDamage 20, self, Source.POKEPOWER
            }
          }
          move "Damage Even", {
            text "Count the number of damage counters on Dusknoir. Put that many damage counters on 1 of your opponent’s Pokémon."
            energyCost P, C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              directDamage 10 * self.numberOfDamageCounters, opp.all.select()
            }
          }
          move "Night Spin", {
            text "50 damage. Prevent all effects of an attack, including damage, done to Dusknoir by your opponent’s Pokémon that has 2 or less Energy attached to it during your opponent’s next turn."
            energyCost P, P, C
            onAttack {
              damage 50
              delayed {
                before null, self, Source.ATTACK, {
                  if (self.owner.opposite.pbg.active.cards.energyCount(C) < 3 && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                    bc "$thisMove prevents effect"
                    prevent()
                  }
                }
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && self.owner.opposite.pbg.active.cards.energyCount(C) < 3 && bg.currentTurn==self.owner.opposite ){
                      it.dmg = hp(0)
                      bc "$thisMove prevents damage"
                    }
                  }
                }
                unregisterAfter(2)
                after CHANGE_STAGE, self, {unregister()}
                after FALL_BACK, self, {unregister()}
              }
            }
          }

        };
      case EMPOLEON_2:
        return evolution (this, from:"Prinplup", hp:HP130, type:METAL, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Emperor Aura", {
            text "Once during your turn , when you play Empoleon from your hand to evolve 1 of your Active Pokémon, you may use this power. Your opponent can’t attach any Energy cards from his or her hand to his or her Pokémon during your opponent’s next turn."
            onActivate {r->
              if (r==PLAY_FROM_HAND && self.active && confirm("Use Emperor Aura?")) {
                powerUsed()
                delayed {
                  before ATTACH_ENERGY, {
                    if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner.opposite && self.active){
                      wcu "Emperor Aura prevents playing this card"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
          move "Steel Wing", {
            text "40 damage. During your opponent's next turn, any damage done to Empoleon by attacks is reduced by 20."
            energyCost C, C
            onAttack {
              damage 40
              reduceDamageNextTurn hp(20), thisMove
            }
          }
          move "Whirlpool", {
            text "60 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case INFERNAPE_3:
        return evolution (this, from:"Monferno", hp:HP120, type:FIGHTING, retreatCost:0) {
          weakness P, PLUS30
          pokePower "Blaze Dance", {
            text "Once during your turn , when you play Infernape from your hand to evolve 1 of your Pokémon, you may flip a coin. If heads, search your deck for up to 4 [R] Energy cards and attach them to your Pokémon in any way you like. Shuffle your deck afterward."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.deck && confirm("Use Blaze Dance?")) {
                powerUsed()
                flip {
                  def energys = my.deck.search(max:4,"Search your deck for up to 4 basic [R] Energy cards",basicEnergyFilter(R))
                  def count = 1
                  energys.each {
                    def tar = my.all.select("Attach [R] Energy ($count/${energys.size()}) to")
                    attachEnergy(tar, it)
                  }
                  shuffleDeck()
                }
              }
            }
          }
          move "Close Combat", {
            text "60 damage. During your opponent's next turn, any damage done to Infernape by attacks is increased by 30 (after applying Weakness and Resistance)."
            energyCost C, C
            onAttack {
              damage 60
              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.to == self && it.dmg.value && it.notNoEffect){
                        bc "${thisMove.name} +30"
                        it.dmg+=hp(30)
                      }
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, self, {unregister()}
                  after CHANGE_STAGE, self, {unregister()}
                }
              }
            }
          }
          move "Spreading Fire", {
            text "80 damage. Discard 2 [R] Energy attached to Infernape and this attack does 20 damage to each of your opponent's Benched Pokémon."
            energyCost R, R, C, C
            onAttack {
              damage 80
              opp.bench.each {
                damage 20, it
              }
              discardSelfEnergyAfterDamage R, R
            }
          }

        };
      case LUMINEON_4:
        return evolution (this, from:"Finneon", hp:HP080, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          pokePower "Fin Luster", {
            text "Once during your turn , if Lumineon is your Active Pokémon, you may look at your opponent’s hand. If your opponent’s Bench isn’t full, choose 1 Basic Pokémon from your opponent’s hand, and put it onto his or her Bench. Then, switch it with the Defending Pokémon. This power can’t be used if Lumineon is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your Active Pokémon"
              assert opp.hand : "Your opponent's hand is empty"
              powerUsed()
              if(opp.bench.notFull && opp.hand.filterByType(BASIC)) {
                def card = opp.hand.select("Choose a Basic Pokémon to put onto your opponent's Bench", cardTypeFilter(BASIC)).first()
                def pcs = benchPCS(card)
                sw opp.active, pcs
              } else {
                opp.hand.showToMe("Opponent's hand")
              }

            }
          }
          move "Quick Swim", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost ()
            onAttack {
              noWrDamage 20, opp.all.select()
            }
          }
          move "Elegant Swim", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Lumineon during your opponent’s next turn."
            energyCost W
            onAttack {
              damage 30
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case MAGNEZONE_5:
        return evolution (this, from:"Magneton", hp:HP120, type:METAL, retreatCost:2) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokePower "Magnetic Search", {
            text "Once during your turn , you may search your deck for a [L] or [M] Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Magnezone is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              my.deck.search("Search your deck for a [L] or [M] Pokémon", {it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(L) || it.asPokemonCard().types.contains(M)}).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Speed Shot", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost L, C
            onAttack {
              swiftDamage 30, opp.all.select()
            }
          }
          move "Crush Volt", {
            text "80 damage. Discard an Energy attached to Magnezone."
            energyCost L, C, C
            onAttack {
              damage 80
              discardSelfEnergyAfterDamage C
            }
          }

        };
      case MAGNEZONE_6:
        return evolution (this, from:"Magneton", hp:HP120, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokePower "Super Connectivity", {
            text "Once during your turn , you may search your discard pile for a [L] or [M] Energy card and attach it to your Active Pokémon. Then, put 1 damage counter on that Pokémon. This power can’t be used if Magnezone is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByType(ENERGY).any{it.asEnergyCard().containsTypePlain(L) || it.asEnergyCard().containsTypePlain(M)} : "There are no [L] or [M] Energy card in your discard."
              powerUsed()
              attachEnergy(my.active,my.discard.filterByType(ENERGY).findAll{it.asEnergyCard().containsTypePlain(L) || it.asEnergyCard().containsTypePlain(M)}.select().first())
              directDamage 10, my.active, Source.POKEPOWER
            }
          }
          move "Gyro Ball", {
            text "60 damage. You may switch Magnezone with 1 of your Benched Pokémon. If you do, your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost L, C, C
            onAttack {
              damage 60
              afterDamage {
                if(confirm("Switch $self with 1 of your Benched Pokémon?")) {
                  if(sw2(my.bench.select("New Active Pokémon"))) {
                    whirlwind()
                  }
                }
              }
            }
          }

        };
      case MISMAGIUS_7:
        return evolution (this, from:"Misdreavus", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Crash Chant", {
            text "20× damage. Choose up to 4 in any combination of Pokémon Tool cards and Technical Machine cards in play (both yours and your opponent's) and discard them. This attack does 20 damage times the number of cards discarded in this way."
            energyCost ()
            attackRequirement {
              assert my.all.find{it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)} || opp.all.find{it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)} : "There are no Pokémon Tool cards or Technical Machine cards in play"
            }
            onAttack {
              def i = 4
              def count = 0 //count will increase if the card is discarded successfully. i will decrease whenever a card is attempted to be discarded
              while (true) {
                def tar
                if(i > 0 && (my.all.find {it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)} || opp.all.find {it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)})){
                  def options = []
                  def text = []
                  if(opp.all.findAll {it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)}){
                    options += [1]
                    text += ["Your opponent's Pokémon"]
                  }
                  if(my.all.findAll {it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)}){
                    options += [2]
                    text += ["Your Pokémon"]
                  }
                  options += [3]
                  text += ["Stop"]
                  def choice = choose(options,text, "Remove a Pokémon Tool or Technical Machine from...? (${5-i}/4)",options.get(0))
                  if(choice == 1){
                    tar = opp.all.findAll {it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)}
                  } else if(choice == 2){
                    tar = my.all.findAll{it.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)}
                  } else{
                    break
                  }
                  if (tar) {
                    def sel = tar.select("Select a Pokémon to discard a Pokémon Tool or Technical Machine from (cancel to stop).", false)
                    if (sel) {
                      def card = sel.cards.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE).select("Discard a Pokémon Tool or Technical Machine from $sel.")
                      i -= 1
                      targeted (sel) {
                        card.discard()
                        count ++
                      }
                    }
                  }
                }else{
                  break
                }
              }//Modified tool scrapper code
              damage 20 * count
            }
          }
          move "Horror Chant", {
            text "40 damage. If your opponent has 4 or more Benched Pokémon, choose 1 of them and return that Pokémon and all cards attached to it to your opponent’s hand."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 40
              if (opp.bench.size() >= 4) {
                def pcs = opp.bench.select("Which Pokémon to return to opponent's hand?")
                scoopUpPokemon(pcs, delegate)
              }
            }
          }

        };
      case RAICHU_8:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Slice", {
            text "30 damage. Raichu can’t use Slice during your next turn."
            energyCost ()
            onAttack {
              damage 30
              cantUseAttack thisMove, self
            }
          }
          move "Split Ball", {
            text "50 damage. Move an Energy card attached to Raichu to 1 of your Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 50
              if(my.bench) {
                def energy = self.cards.select("Choose an energy card to move",cardTypeFilter(ENERGY)).first()
                def tar = my.bench.select("Move $energy to...")
                energySwitch(self,tar,energy)
              }
            }
          }
          move "Burst Ball", {
            text "100 damage. Discard 3 Energy attached to any of your Pokémon in any way you like."
            energyCost L, L, C
            onAttack {
              damage 100
              CardList energyList = []
              while(energyList.energyCount(C) < 3 && my.all.find{it.cards.filterByType(ENERGY).find{!energyList.contains(it)}}) {
                def remaining = 3 - energyList.energyCount(C)
                def src = my.all.findAll{it.cards.filterByType(ENERGY).find{!energyList.contains(it)}}.select("Discard an Energy from which Pokémon $remaining/3 left")
                energyList.add(src.cards.findAll{!energyList.contains(it)}.select("Discard which Energy? $remaining/3 left",cardTypeFilter(ENERGY)).first())
              }
              afterDamage {
                energyList.discard()
              }
            }
          }

        };
      case REGIGIGAS_9:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          pokeBody "Regi Form", {
            text "If you have Regirock, Regice, and Registeel in play, the attack cost of Regigigas’s attacks is [C] less."
            getterA (GET_MOVE_LIST, BEFORE_LAST, self) {h->
              if (my.all.find{it.name == "Regirock"} && my.all.find{it.name == "Regice"} && my.all.find{it.name == "Registeel"}) {
                def list=[]
                for (move in h.object) {
                  def copy = move.shallowCopy()
                  copy.energyCost.remove(C)
                  list.add(copy)
                }
                h.object=list
              }
            }
          }
          move "Mega Punch", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Giga Power", {
            text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Regigigas does 40 damage to itself."
            energyCost W, F, M, C
            onAttack {
              damage 60
              if(confirm("Deal 40 damage to $self in order to deal 40 additional damage?")) {
                damage 40
                damage 40, self
              }
            }
          }

        };
      case SCEPTILE_10:
        return evolution (this, from:"Grovyle", hp:HP110, type:GRASS, retreatCost:1) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokePower "Energy Trans", {
            text "As often as you like during your turn , move a [G] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Sceptile is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.findAll {it.cards.energyCount(G)>0} : "There are no Pokémon with [G] Energy cards"
              assert my.all.size()>=2 : "There is only one Pokémon on the field"

              powerUsed()
              def src=my.all.findAll {it.cards.energyCount(G)>0}.select("Source for [G]")
              def card=src.cards.filterByEnergyType(G).select("Card to move").first()
              def tar=my.all
              tar.remove(src)
              tar=tar.select("Target for [G]")
              energySwitch(src, tar, card)
            }
          }
          move "Poison Leaf", {
            text "40 damage. The Defending Pokémon is now Poisoned."
            energyCost C, C
            onAttack {
              damage 40
              applyAfterDamage POISONED
            }
          }
          move "Slice Drain", {
            text "60 damage. Remove 2 damage counters from Sceptile."
            energyCost G, G, C, C
            onAttack {
              damage 60
              heal 20, self
            }
          }

        };
      case TORTERRA_11:
        return evolution (this, from:"Grotle", hp:HP140, type:FIGHTING, retreatCost:4) {
          weakness W, PLUS30
          resistance L, MINUS20
          pokePower "Sunshine Song", {
            text "Once during your turn, when you play Torterra from your hand to evolve 1 of your Pokémon, you may choose as many of your [G] Pokémon in play as you like. For each [G] Pokémon you choose, search your deck for an Evolution card that evolves from that Pokémon and evolve it. Shuffle your deck afterward."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.all.find{it.types.contains(G)} && my.deck && confirm("Use Sunshine Song?")) {
                powerUsed()
                multiSelect(my.all,0,my.all.findAll{it.types.contains(G)}.size(),"Select as many of you [G] Pokémon in play as you like.").each {pcs->
                  def evolution = deck.search ("Select a Pokémon that evolves from $pcs.", {it.cardTypes.is(EVOLUTION) && it.predecessor == pcs.name}).first()
                  if(evolution) {
                    evolve(pcs, evolution)
                  }
                }
              }
            }
          }
          move "Crash Impact", {
            text "60 damage. Torterra does 20 damage to itself. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
            energyCost C, C
            onAttack {
              damage 60
              damage 20, self
              whirlwind()
            }
          }
          move "Land Shake", {
            text "80 damage. During your opponent’s next turn, whenever your opponent puts a Basic Pokémon from his or her hand onto his or her Bench, put 2 damage counters on that Pokémon."
            energyCost G, G, C, C
            onAttack {
              damage 80
              delayed {
                after PUT_ON_BENCH, {
                  if(ef.basicFromHand && bg.currentTurn == self.owner.opposite){
                    ef.place.damage += 20
                  }
                }
                unregisterAfter 2
              }
            }
          }

        };
      case ABOMASNOW_12:
        return evolution (this, from:"Snover", hp:HP100, type:WATER, retreatCost:3) {
          weakness R, PLUS30
          pokeBody "Snow Veil", {
            text "As long as Abomasnow is your Active Pokémon, any damage done to your Pokémon by an opponent’s attack is reduced by 20 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.active && it.to.owner == self.owner && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Snow Play", {
            text "20 damage. Does 20 damage to each of your opponent's Benched Pokémon, excluding [G] Pokémon and [W] Pokémon.."
            energyCost C, C
            onAttack {
              damage 20
              opp.bench.each {
                if(!it.types.contains(G) && !it.types.contains(W)) {
                  damage 20, it
                }
              }
            }
          }
          move "Below Zero", {
            text "60 damage. If Abomasnow evolved from Snover during this turn, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            onAttack {
              damage 60
              if (self.lastEvolved == bg.turnCount && self.cards.any{it.name == "Snover"}) {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case BRONZONG_13:
        return evolution (this, from:"Bronzor", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          resistance R, MINUS20
          pokePower "Cycler", {
            text "Once during your turn , you may choose a card from your hand and put it on top of your deck. Then, search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. This power can’t be used if Bronzong is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand : "Your hand is empty"
              powerUsed()
              my.hand.select("Choose a card to put on top of your deck").moveTo(hidden:true,my.deck)
              my.deck.search(max:2,cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
              shuffleDeck()
            }
          }
          move "Strange Spin", {
            text "20+ damage. If you have the same number of cards in your hand as your opponent, this attack does 20 damage plus 40 more damage and the Defending Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 20
              if(my.hand.size() == opp.hand.size()) {
                damage 40
                applyAfterDamage CONFUSED
              }
            }
          }
          move "Heavy Potential", {
            text "Put a number of damage counters on each of your opponent's Pokémon equal to the number of [C] Energy in that Pokémon's Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost P, C, C
            attackRequirement {
              assert opp.all.find{it.retreatCost > 0} : "None of your opponents Pokémon have a retreat cost."
            }
            onAttack {
              opp.all.each {
                directDamage it.retreatCost * 10, it
              }
            }
          }

        };
      case CHERRIM_14:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          pokeBody "Sunny Day", {
            text "Each of your [G] Pokémon’s and [R] Pokémon’s attacks does 10 more damage to the Defending Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker && ef.attacker.owner == self.owner && (ef.attacker.types.contains(G) || ef.attacker.types.contains(R))){
                  bg.dm().each {
                    if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                      bc "Sunny Day +10"
                      it.dmg += hp(10)
                    }
                  }
                }
              }
            }
          }
          move "Salty-sweet Pollen", {
            text "20 damage. Remove 2 damage counters from 1 of your Pokémon."
            energyCost ()
            onAttack {
              damage 20
              if(my.all.find{it.numberOfDamageCounters}) {
                heal 20, my.all.findAll{it.numberOfDamageCounters}.select("Remove 2 damage counters from 1 of your Pokémon")
              }
            }
          }
          move "Solarbeam", {
            text "50 damage. "
            energyCost G, C, C
            onAttack {
              damage 50
            }
          }

        };
      case DRAPION_15:
        return evolution (this, from:"Skorupi", hp:HP110, type:DARKNESS, retreatCost:3) {
          weakness P, PLUS20
          move "Scorpion Grapple", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost ()
            onAttack {
              damage 10
              flip 1, {
                applyAfterDamage PARALYZED
              }, {
                cantRetreat defending
              }
            }
          }
          move "Cross Poison", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads. If 2 or more of them are heads, the Defending Pokémon is now Poisoned."
            energyCost C, C
            onAttack {
              int count = 0
              flip 4, {
                damage 20
                count ++
              }
              if(count >= 2) {
                applyAfterDamage POISONED
              }
            }
          }
          move "Derail", {
            text "60 damage. Discard all Special Energy cards attached to the Defending Pokémon."
            energyCost D, D, C
            onAttack {
              damage 60
              afterDamage {
                targeted(defending){
                  defending.cards.filterByType(SPECIAL_ENERGY).discard()
                }
              }
            }
          }

        };
      case DRIFBLIM_16:
        return evolution (this, from:"Drifloon", hp:HP090, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Delivery", {
            text "Put any 1 card from your discard pile into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard : "Your discard pile is empty"
            }
            onAttack {
              my.discard.select("Choose a card to put into your hand").moveTo(my.hand)
            }
          }
          move "Lifting", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. For each Basic Pokémon you put onto your Bench, you may search your deck for a basic Energy card and attach it to that Pokémon. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount,2)
              my.deck.search(max:maxSpace, "Search your deck for " + (maxSpace>1?"up to 2":"a") + " Basic Pokémon",cardTypeFilter(BASIC)).each {
                def pcs = benchPCS(it)
                def energy = my.deck.search("Search your deck for a Basic Energy to attach to $pcs",cardTypeFilter(BASIC_ENERGY)).first()
                if(energy) {
                  attachEnergy(pcs, energy)
                }
              }
              shuffleDeck()
            }
          }
          move "Ominous Wind", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                applyAfterDamage CONFUSED
                cantRetreat defending
              }
            }
          }

        };
      case DUSKNOIR_17:
        return evolution (this, from:"Dusclops", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokeBody "Spirit Pulse", {
            text "As long as Dusknoir is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon that has any Energy attached to it between turns."
            delayedA {
              before BEGIN_TURN, {
                if(self.active) {
                  bc "Spirit Pulse activates"
                  self.owner.opposite.pbg.all.each {
                    if(it.cards.energyCount(C)) {
                      directDamage 10, it, Source.POKEBODY
                    }
                  }
                }
              }
            }
          }
          move "Darkness Mist", {
            text "60+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage."
            energyCost P, C, C
            onAttack {
              damage 60
              if(defending.numberOfDamageCounters >= 2) {
                damage 20
              }
            }
          }

        };
      case GENGAR_18:
        return evolution (this, from:"Haunter", hp:HP110, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Fainting Spell", {
            text "Once during your opponent’s turn, if Gengar would be Knocked Out by damage from an attack, you may flip a coin. If heads, the Defending Pokémon is Knocked Out."
            delayedA (priority: LAST) {
              before (KNOCKOUT, self) {
                if ((ef as Knockout).byDamageFromAttack && self.active && bg.currentTurn==self.owner.opposite && self.owner.opposite.pbg.active != null && self.owner.opposite.pbg.active.inPlay) {
                  powerUsed()
                  flip{
                    targeted (self.owner.opposite.pbg.active, Source.POKEPOWER){
                      new Knockout(self.owner.opposite.pbg.active).run(bg)
                    }
                  }
                }
              }
            }
          }
          move "Shadow Room", {
            text "Put 3 damage counters on 1 of your opponent’s Pokémon. If that Pokémon has any Poké-Powers, put 6 damage counters on that Pokémon instead."
            energyCost P
            onAttack {
              def tar = opp.all.select("Choose 1 of your opponent's Pokémon")
              directDamage 30, tar
              if(tar.hasPokePower()) {
                directDamage 30, tar
              }
            }
          }
          move "Poltergeist", {
            text "30× damage. Look at your opponent’s hand. This attack does 30 damage times the number of Trainer, Supporter and Stadium cards in your opponent’s hand."
            energyCost P, C
            onAttack {
              damage 30 * opp.hand.shuffledCopy().showToMe("Opponent's hand").filterByType(ITEM,SUPPORTER,STADIUM).size()
            }
          }

        };
      case GYARADOS_19:
        return evolution (this, from:"Magikarp", hp:HP130, type:WATER, retreatCost:3) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Tail Revenge", {
            text "30× damage. Does 30 damage times the number of Magikarp in your discard pile."
            energyCost ()
            attackRequirement {
              assert my.discard.find{it.name == "Magikarp"} : "You have no Magikarp in your discard pile"
            }
            onAttack {
              damage 30 * my.discard.findAll{it.name == "Magikarp"}.size()
            }
          }
          move "Wreak Havoc", {
            text "40 damage. Flip a coin until you get tails. For each heads, discard the top card from your opponent’s deck."
            energyCost W, C
            onAttack {
              damage 40
              afterDamage {
                flipUntilTails{
                  discard opp.deck.first()
                }
              }
            }
          }
          move "Dragon Beat", {
            text "100 damage. Flip a coin. If heads, discard an Energy card from each of your opponent’s Pokémon."
            energyCost W, W, C, C, C
            onAttack {
              damage 100
              afterDamage {
                flip {
                  opp.all.each {
                    if(it.cards.filterByType(ENERGY)) {
                      targeted(it) {
                        it.cards.select("Choose an Energy card to discard",cardTypeFilter(ENERGY)).discard()
                      }
                    }
                  }
                }
              }
            }
          }

        };
      case MACHAMP_20:
        return evolution (this, from:"Machoke", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS30
          move "Take Out", {
            text "40 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon is Knocked Out instead of damaged by this attack."
            energyCost F
            attackRequirement {}
            onAttack {
              if(defending.evolution) {
                damage 40
              } else {
                targeted (defending) {
                  new Knockout(defending).run(bg)
                }
              }
            }
          }
          move "Hurricane Punch", {
            text "30× damage. Flip 4 coins. This attack does 30 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 4, {
                damage 30
              }
            }
          }
          move "Rage", {
            text "60+ damage. Does 60 damage plus 10 more damage for each damage counter on Machamp."
            energyCost F, F, C, C
            onAttack {
              damage 60 + 10 * self.numberOfDamageCounters
            }
          }

        };
      case MAMOSWINE_21:
        return evolution (this, from:"Piloswine", hp:HP140, type:FIGHTING, retreatCost:5) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Ramming Strike", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads or you may start again. Each time you start again, put 2 damage counters on Mamoswine. (If Mamoswine would be Knocked Out, you can’t start again.)"
            energyCost F, C, C
            onAttack {
              boolean flag = true
              int count
              while(flag) {
                count = 0
                flipUntilTails {
                  count ++
                }
                if(self.remainingHP.value > 20 && confirm("Put 2 damage counters on $self in order to reflip your coins?")) {
                  directDamage 20, self
                } else {
                  flag = false
                }
              }
              damage 30 * count
            }
          }
          move "Parade", {
            text "60+ damage. Does 60 damage plus 10 more damage for each Swinub on your Bench, plus 20 more damage for each Piloswine on your Bench, and 40 more damage for each Mamoswine on your Bench."
            energyCost W, F, C, C
            onAttack {
              damage 60
              damage 10 * my.bench.findAll{it.name == "Swinub"}.size()
              damage 20 * my.bench.findAll{it.name == "Piloswine"}.size()
              damage 40 * my.bench.findAll{it.name == "Mamoswine"}.size()
            }
          }

        };
      case RAPIDASH_22:
        return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          pokeBody "Burning Mane", {
            text "If Rapidash is your Active Pokémon and is damaged by an opponent’s attack (even if Rapidash is Knocked Out), the Attacking Pokémon is now Burned."
            ifActiveAndDamagedByAttackBody(delegate) {
              bc "Burning Mane activates."
              apply BURNED, ef.attacker, Source.POKEBODY
            }
          }
          move "Rear Kick", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Shooting Fire", {
            text "Discard 2 [R] Energy attached to Rapidash and choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon."
            energyCost R, R
            onAttack {
              damage 60, opp.all.select()
              discardSelfEnergyAfterDamage R, R
            }
          }

        };
      case ROSERADE_23:
        return evolution (this, from:"Roselia", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Hidden Poison", {
            text "If Roserade is your Active Pokémon and is damaged by an opponent’s attack (even if Roserade is Knocked Out), the Defending Pokémon is now Poisoned."
            ifActiveAndDamagedByAttackBody(delegate) {
              bc "Hidden Poison activates."
              apply POISONED, ef.attacker, Source.POKEBODY
            }
          }
          move "Bowed Whip", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Flip a coin. If heads, discard an Energy card attached to that Pokémon."
            energyCost C, C
            onAttack {
              def tar = opp.all.select("Choose 1 of your opponent's Pokémon")
              damage 30, tar
              flip {
                if(tar.cards.filterByType(ENERGY)) {
                  targeted(tar){
                    tar.cards.select("Choose an energy to discard from $tar",cardTypeFilter(ENERGY)).discard()
                  }
                }
              }
            }
          }
          move "Deep Poison", {
            text "50+ damage. If the Defending Pokémon is Poisoned, this attack does 50 damage plus 30 more damage."
            energyCost P, P, C
            onAttack {
              damage 50
              if(defending.isSPC(POISONED)) {
                damage 30
              }
            }
          }

        };
      case SALAMENCE_24:
        return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:3) {
          weakness C, PLUS30
          resistance F, MINUS20
          pokeBody "Battle Rush", {
            text "If your opponent has any Pokémon in play that has maximum HP of 120 or more, ignore all [C] Energy necessary to use Salamence’s attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, {h->
              if(opp.all.find{it.fullHP.value >= 120}) {
                def list=[]
                for(move in h.object){
                  def copy=move.shallowCopy()
                  copy.energyCost.removeAll(C)
                  list.add(copy)
                }
                h.object=list
              }
            }
          }
          move "Combustion", {
            text "50 damage. "
            energyCost R, C
            onAttack {
              damage 50
            }
          }
          move "Steam Twister", {
            text "120 damage. Discard a [R] Energy and a [W] Energy attached to Salamence."
            energyCost R, W, C, C
            onAttack {
              damage 120
              discardSelfEnergyAfterDamage R, W
            }
          }

        };
      case SCIZOR_25:
        return evolution (this, from:"Scyther", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Honeycomb Defender", {
            text "If Scizor has 6 or more damage counters on it, any damage done to Scizor by attacks is reduced by 40 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.numberOfDamageCounters >= 6 && it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -40"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
          move "Accelerate", {
            text "30 damage. If the Defending Pokémon is Knocked Out by this attack, prevent all effects of an attack, including damage, done to Scizor during your opponent’s next turn."
            energyCost C, C
            onAttack {
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs, {
                  preventAllEffectsNextTurn()
                }
                unregisterAfter 1
              }
              damage 30
            }
          }
          move "Pound Down", {
            text "40+ damage. If you don’t have any Pokémon with any Poké-Powers in play, this attack does 40 damage plus 30 more damage."
            energyCost G, G
            onAttack {
              damage 40
              if(!my.all.find{it.hasPokePower()}) {
                damage 30
              }
            }
          }

        };
      case SKUNTANK_26:
        return evolution (this, from:"Stunky", hp:HP100, type:DARKNESS, retreatCost:2) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokePower "Evolutionary Gas", {
            text "Once during your turn , when you play Skuntank from your hand to evolve 1 of your Active Pokémon, you may choose 1 of the Defending Pokémon. If that Pokémon tries to attack during your opponent’s next turn, that attack does nothing."
            onActivate {r->
              if (r==PLAY_FROM_HAND && self.active && confirm("Use Evolutionary Gas?")) {
                powerUsed()
                bc "Evolutionary Gas activates"
                def pcs = opp.active
                targeted (pcs, Source.POKEPOWER) {
                  delayed (priority: FIRST) {
                    before PROCESS_ATTACK_EFFECTS, {
                      if(ef.attacker == pcs) {
                        bc "Evolutionary Gas prevents the attack"
                        prevent()
                      }
                    }
                    unregisterAfter 2
                    after FALL_BACK, pcs, {unregister()}
                    after CHANGE_STAGE, pcs, {unregister()}
                  }
                }
              }
            }
          }
          move "Poison Claws", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost C, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }
          move "Plunder", {
            text "60 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
            energyCost D, C, C
            onAttack {
              if (defending.cards.hasType(TRAINER)){
                defending.cards.filterByType(TRAINER).discard()
              }
              damage 60
            }
          }

        };
      case STARAPTOR_27:
        return evolution (this, from:"Staravia", hp:HP120, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          pokeBody "Protect Wing", {
            text "As long as Staraptor is your Active Pokémon, any damage done by attacks from your opponent’s Stage 2 Evolved Pokémon is reduced by 20 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.active && it.from.stage2 && it.from.evolution && it.to.owner == self.owner && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Strong Breeze", {
            text "Flip a coin. If heads, put 1 of your opponent’s Benched Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              flip {
                def tar = opp.bench.select()
                targeted(tar) {
                  tar.cards.moveTo(opp.deck)
                  shuffleOppDeck()
                  removePCS(tar)
                }
              }
            }
          }
          move "Clutch", {
            text "60 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C, C
            onAttack {
              damage 60
              cantRetreat defending
            }
          }

        };
      case STEELIX_28:
        return evolution (this, from:"Onix", hp:HP130, type:METAL, retreatCost:4) {
          weakness R, PLUS30
          resistance P, MINUS20
          move "Outbreak Power", {
            text "Choose a number of your opponent’s Pokémon up to the amount of Energy attached to Steelix. This attack does 20 damage to each of them."
            energyCost C
            onAttack {
              def maxSelect = Math.min(self.cards.energyCount(C),opp.bench.size())
              multiSelect(opp.all,1,maxSelect,"Choose a number of your opponent's Pokémon up to the amount of Energy attached to $self").each {
                damage 20, it
              }
            }
          }
          move "Iron Tail", {
            text "100× damage. Flip a coin until you get tails. This attack does 100 damage for each heads."
            energyCost M, M, C, C
            onAttack {
              flipUntilTails {
                damage 100
              }
            }
          }

        };
      case TANGROWTH_29:
        return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokeBody "Green Renewal", {
            text "Remove 1 damage counter from Tangrowth between turns."
            delayedA {
              before BEGIN_TURN, {
                heal 10, self, Source.POKEBODY
              }
            }
          }
          move "Green Acid", {
            text "20 damage. Flip 2 coins. If the first coin is heads, the Defending Pokémon is now Confused. If the second coin is heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage CONFUSED
              }
              flip {
                applyAfterDamage POISONED
              }
            }
          }
          move "Reaching Vine", {
            text "60 damage. Does 20 damage to 2 of your opponent’s Benched Pokémon."
            energyCost G, G, C, C
            onAttack {
              damage 60
              if(opp.bench) {
                multiSelect(opp.bench, 2, "Does 20 damage to 2 of your opponent's Benched Pokémon").each {
                  damage 20, it
                }
              }
            }
          }

        };
      case TYRANITAR_30:
        return evolution (this, from:"Pupitar", hp:HP140, type:DARKNESS, retreatCost:4) {
          weakness F, PLUS30
          resistance P, MINUS20
          pokeBody "Darkness Drive", {
            text "After your opponent’s Pokémon uses a Poké-Power, you may search your discard pile for a basic [D] Energy and attach it to Tyranitar."
            delayedA {
              after USE_ABILITY_OUTER, {
                if (ef.targetPokemon.owner != self.owner && ef.ability instanceof PokePower && self.owner.pbg.discard.filterByBasicEnergyType(D) && confirm("Use Darkness Drive?",self.owner)) {
                  bc "Darkness Drive activates"
                  def card = self.owner.pbg.discard.select("Select a basic [D] Energy to attach to $self",basicEnergyFilter(D),self.owner).first()
                  attachEnergy(self,card)
                }
              }
            }
          }
          move "Grind", {
            text "20× damage. Does 20 damage times the amount of Energy attached to Tyranitar."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20*self.cards.energyCount(C)
            }
          }
          move "Spinning Tail", {
            text "This attack does 30 damage to each of your opponent’s Pokémon."
            energyCost D, D, D, D, D
            onAttack {
              opp.all.each{
                damage 30, it
              }
            }
          }

        };
      case VESPIQUEN_31:
        return evolution (this, from:"Combee", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokeBody "Green Dignity", {
            text "As long as you have more Prize cards left than your opponent, Vespiquen’s attacks do 10 more damage for each [G] Pokémon on your Bench to the Active Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if(my.prizeCardSet.size() > opp.prizeCardSet.size() && it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
                    def extraDamage = 10 * my.bench.findAll{it.types.contains(G)}.size()
                    it.dmg += hp(extraDamage)
                    bc "Green Dignity +$extraDamage"
                  }
                }
              }
            }
          }
          move "Bee Drain", {
            text "20 damage. After your attack, remove from Vespiquen the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Bee Powder", {
            text "50 damage. Flip 2 coins. If both are heads, the Defending Pokémon is now Burned, Paralyzed and Poisoned."
            energyCost G, C
            onAttack {
              damage 50
              flip 2, {}, {}, [2:{
                applyAfterDamage BURNED
                applyAfterDamage PARALYZED
                applyAfterDamage POISONED
              }]
            }
          }

        };
      case BIBAREL_32:
        return evolution (this, from:"Bidoof", hp:HP100, type:WATER, retreatCost:3) {
          weakness F, PLUS30
          pokeBody "Unaware", {
            text "Prevent all effects of attacks, excluding damage, done to Bibarel."
            delayedA {
              before null, null, ATTACK, {
                if (ef instanceof TargetedEffect && bg.currentTurn == self.owner.opposite && ef.effectType != DAMAGE && e.getTargetPokemon() == self) {
                  bc "$thisAbility prevents all effects done to $self."
                  prevent()
                }
              }
            }
          }
          move "Amnesia", {
            text "20 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn. "
            energyCost C, C
            onAttack {
              damage 20
              amnesia delegate
            }
          }
          move "Surf", {
            text "60 damage. "
            energyCost W, W
            onAttack {
              damage 60
            }
          }

        };
      case BUDEW_33:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS10
          pokeBody "Poison Enzyme", {
            text "Prevent all effects of attacks, including damage, done to Budew by your opponent’s Poisoned Pokémon."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.isSPC(POISONED) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.isSPC(POISONED)){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(efs.from.isSPC(POISONED) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Roselia from your hand onto Budew (this counts as evolving Budew) and remove all damage counters from Budew."
            actionA {
              assert my.hand.findAll{it.name.contains("Roselia")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Roselia") }.select()
              if (tar) {
                evolve(self, tar.first())
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Buddy-buddy", {
            text "Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a Pokémon",cardTypeFilter(POKEMON)).showToOpponent("Selected Cards").moveTo(my.hand)
            }
          }

        };
      case DUSCLOPS_34:
        return evolution (this, from:"Duskull", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Dark One-eye", {
            text "20 damage. You may discard a card from your hand. If you do, your opponent discards a card from his or her hand."
            energyCost P
            onAttack {
              damage 20
              if(my.hand && confirm("Discard a card from your hand?")) {
                my.hand.select("Choose a card to discard").discard()
                if(opp.hand) {
                  opp.hand.oppSelect("Choose a card to discard").discard()
                }
              }
            }
          }
          move "Ambush", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost P, C, C
            onAttack {
              damage 40
              flip {
                damage 20
              }
            }
          }

        };
      case DUSCLOPS_35:
        return evolution (this, from:"Duskull", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage CONFUSED
              }
            }
          }
          move "Trick Room", {
            text "40+ damage. If you have a Stadium card in play, this attack does 40 damage plus 20 more damage. If your opponent has a Stadium card in play, remove 2 damage counters from Dusclops."
            energyCost P, C, C
            onAttack {
              damage 40
              if(bg.stadiumInfoStruct) {
                if(bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                  damage 20
                } else {
                  heal 20, self
                }
              }
            }
          }

        };
      case ELECTRODE_36:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokeBody "Radiance", {
            text "If Electrode is your Active Pokémon and is damaged by an opponent’s attack (even if Electrode is Knocked Out), put 1 damage counter on each of your opponent’s Pokémon."
            ifActiveAndDamagedByAttackBody(delegate) {
              bc "Radiance activates."
              self.owner.opposite.pbg.all.each {
                directDamage 10, it, Source.POKEBODY
              }
            }
          }
          def turnCount=-1
          HP lastDamage=null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg().currentTurn==self.owner.opposite) {
                  turnCount=bg.turnCount
                  lastDamage=bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
                }
              }
            }
          }
          move "Low Current", {
            text "30 damage. If Electrode was damaged by an attack during your opponent’s last turn, the Defending Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              damage 30
              if(turnCount+1==bg.turnCount && lastDamage > hp(0)) {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Swift", {
            text "60 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C, C
            onAttack {
              swiftDamage(60, defending)
            }
          }

        };
      case ELECTRODE_37:
        return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Flash", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost L
            onAttack {
              damage 20
              sandAttack(thisMove)
            }
          }
          move "Electro Diffusion", {
            text "40+ damage. Does 40 damage plus 10 more damage for each [L] Energy attached to Electrode. Flip a coin. If tails, discard all [L] Energy attached to Electrode."
            energyCost C, C
            onAttack {
              damage 40 + 10 * self.cards.energyCount(L)
              flip 1, {}, {
                afterDamage {
                  discardAllSelfEnergy L
                }
              }
            }
          }

        };
      case FARFETCH_D_38:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Go and Collect", {
            text "Search your deck for a Trainer, Supporter, or Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            onAttack {
              my.deck.search("Search your deck for a Trainer, Supporter, or Stadium card",{it.cardTypes.is(ITEM) || it.cardTypes.is(SUPPORTER) || it.cardTypes.is(STADIUM)}).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Fury Cutter", {
            text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip 3,{},{}, [ 1:{damage 10}, 2:{damage 20}, 3:{damage 40} ]
            }
          }

        };
      case GROVYLE_39:
        return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Tail Shake", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost G
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Slam", {
            text "60× damage. Flip 2 coins. This attack does 60 damage times the number of heads."
            energyCost G, C, C
            onAttack {
              flip 2, {
                damage 60
              }
            }
          }

        };
      case HAUNTER_40:
        return evolution (this, from:"Gastly", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Smog", {
            text "The Defending Pokémon is now Poisoned."
            energyCost ()
            onAttack {
              apply POISONED
            }
          }
          move "Hoodwink", {
            text "30 damage. You may search your opponent’s discard pile for up to 3 in any combination of Trainer, Supporter or Stadium cards and put them into your opponent’s hand."
            energyCost P
            onAttack {
              damage 30
              def maxSelect = Math.min(opp.discard.filterByType(ITEM,SUPPORTER,STADIUM).size(),3)
              if(maxSelect > 0) {
                opp.discard.select(min:0, max:maxSelect, "Select up to 3 Trainer, Supporter, or Stadium cards to put into your opponent's hand",{it.cardTypes.is(ITEM)||it.cardTypes.is(SUPPORTER)||it.cardTypes.is(STADIUM)}).moveTo(opp.hand)
              }
            }
          }

        };
      case MACHOKE_41:
        return evolution (this, from:"Machop", hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS20
          move "Steady Punch", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F
            onAttack {
              damage 20
              flip {
                damage 20
              }
            }
          }
          move "Brick Break", {
            text "30 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, C
            onAttack {
              noResistanceOrAnyEffectDamage(30, defending)
            }
          }

        };
      case MAGNETON_42:
        return evolution (this, from:"Magnemite", hp:HP080, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Magnetic Resonance", {
            text "20 damage. If you have a Stadium card in play, this attack does 20 damage to 2 of your opponent’s Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              if(bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner && opp.bench) {
                multiSelect(opp.bench,2, text).each {
                  damage 20, it
                }
              }
            }
          }
          move "Magnetic Release", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost L, C, C
            onAttack {
              damage 40 + 10 * defending.cards.energyCount(C)
            }
          }

        };
      case MAGNETON_43:
        return evolution (this, from:"Magnemite", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Wave", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Removal Pulse", {
            text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case MILTANK_44:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Energy Milk", {
            text "Flip a coin until you get tails. For each heads, remove 2 damage counters from 1 of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              flipUntilTails{
                def damagedPokemon = my.all.findAll{it.numberOfDamageCounters}
                if(damagedPokemon) {
                  heal 20, damagedPokemon.select("Remove 2 damage counters from 1 of your Pokémon")
                }
              }
            }
          }
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                damage 20
              }
            }
          }

        };
      case PICHU_45:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              assert my.hand.findAll{it.name.contains("Pikachu")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Pikachu") }.select()
              if (tar) {
                evolve(self, tar.first())
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Electric Circuit", {
            text "Search your discard pile for up to 4 [L] Energy cards, show them to your opponent, and put them into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByEnergyType(L) : "There are no [L] Energy cards in your discard"
            }
            onAttack {
              my.discard.select(max:4, "Choose up to 4 [L] Energy cards to put into your hand",energyFilter(L)).moveTo(my.hand)
            }
          }

        };
      case PILOSWINE_46:
        return evolution (this, from:"Swinub", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Rouse", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Piloswine. Then, remove 4 damage counters from Piloswine."
            energyCost F, C, C
            onAttack {
              damage 20 + 10 * self.numberOfDamageCounters
              afterDamage {
                heal 40, self
              }
            }
          }
          move "Overrun", {
            text "60 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost F, C, C, C
            onAttack {
              damage 60
              if(opp.bench) {
                damage 20, opp.bench.select()
              }
            }
          }

        };
      case PUPITAR_47:
        return evolution (this, from:"Larvitar", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          resistance L, MINUS20
          pokeBody "Energy Protection", {
            text "Any damage done to Pupitar by attacks is reduced by 10 for each Energy attached to Pupitar. You can’t reduce more than 30 damage in this way."
            delayedA {
              before APPLY_ATTACK_DAMAGES,{
                def dmgRed = Math.min(3,self.cards.energyCount(C))
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value && dmgRed) {
                    bc "Energy Protection -${10*dmgRed}"
                    it.dmg -= hp(10*dmgRed)
                  }
                }
              }
            }
          }
          move "Rock Smash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                damage 20
              }
            }
          }

        };
      case SABLEYE_48:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          pokeBody "Overeager", {
            text "If Sableye is your Active Pokémon at the beginning of the game, you go first. (If each player’s Active Pokémon has the Overeager Poké-Body, this power does nothing.)"
            //This is hard coded into TcgBuilders
          }
          move "Impersonate", {
            text "Search your deck for a Supporter card and discard it. Shuffle your deck afterward. Then, use the effect of that card as the effect of this attack."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def card = my.deck.search("Search your deck for a Supporter and copy its effect as this attack.",cardTypeFilter(SUPPORTER)).first()
              if(card) {
                discard card
                bg.em().run(new ActivateSimpleTrainer(card))
              }
              shuffleDeck()
            }
          }
          move "Overconfident", {
            text "10 damage. If the Defending Pokémon has fewer remaining HP than Sableye, this attack's base damage is 40."
            energyCost D
            onAttack {
              damage 10
              if(self.remainingHP.value > defending.remainingHP.value) {
                damage 30
              }
            }
          }

        };
      case SCYTHER_49:
        return basic (this, hp:HP060, type:GRASS, retreatCost:0) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Swords Dance", {
            text "During your next turn, Scyther’s Slashing Strike attack’s base damage is 60."
            energyCost C
            attackRequirement {}
            onAttack {
              increasedBaseDamageNextTurn("Slashing Strike", hp(30))
            }
          }
          move "Slashing Strike", {
            text "30 damage. During your next turn, Scyther can’t use Slashing Strike."
            energyCost G, C
            onAttack {
              damage 30
              cantUseAttack(thisMove, self)
            }
          }

        };
      case SHELGON_50:
        return evolution (this, from:"Bagon", hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Rollout", {
            text "50 damage. "
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }

        };
      case SKARMORY_51:
        return basic (this, hp:HP080, type:METAL, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost M
            onAttack {
              damage 10
              flip {
                damage 20
              }
            }
          }
          move "Mach Blade", {
            text "Flip a coin. If heads, this attack does 50 damage to 1 of your opponent’s Pokémon."
            energyCost M, C, C
            onAttack {
              flip {
                damage 50, opp.all.select()
              }
            }
          }

        };
      case STARAVIA_52:
        return evolution (this, from:"Starly", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Wing Attack", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Shot Air", {
            text "20 damage. Does 30 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 20
              if(opp.bench) {
                damage 30, opp.bench.select()
              }
            }
          }

        };
      case BAGON_53:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          resistance F, MINUS20
          move "Scary Face", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                cantRetreat defending
                cantAttackNextTurn defending
              }
            }
          }
          move "Headbutt", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case BIDOOF_54:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Self-abandonment", {
            text "Flip a coin. If heads, this attack does 30 damage to the Defending Pokémon. If tails, Bidoof does 10 damage to itself."
            energyCost C
            onAttack {
              flip 1, {
                damage 30
              }, {
                damage 10, self
              }
            }
          }

        };
      case BRONZOR_55:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          resistance R, MINUS20
          move "Gyro Swap", {
            text "Put a number of damage counters on the Defending Pokémon equal to the number of [C] Energy in Bronzor's Retreat Cost ."
            energyCost P
            attackRequirement {
              assert self.retreatCost > 0 : "$self's retreat cost is 0"
            }
            onAttack {
              directDamage self.retreatCost * 10, defending
            }
          }
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case CHERUBI_56:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Nap", {
            text "Remove 2 damage counters from Cherubi."
            energyCost ()
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              heal 20, self
            }
          }
          move "Bullet Seed", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost G
            onAttack {
              flip 4, {
                damage 10
              }
            }
          }

        };
      case COMBEE_57:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          customAbility {
            //Honey : Once during your turn, when you put Combee from your hand onto your Bench, you may search your discard pile for a Basic Pokémon and put it onto your Bench.
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && self.benched && my.discard.filterByType(BASIC) && my.bench.notFull && confirm("Use Honey?")){
                benchPCS(my.discard.select("Choose a Basic Pokémon to put onto your Bench",cardTypeFilter(BASIC)).first())
              }
            }
          }
          move "Alert", {
            text "Draw a card. Then, you may switch Combee with 1 of your Benched Pokémon."
            energyCost C
            onAttack {
              draw 1
              switchYourActive(may:true)
            }
          }

        };
      case DRIFLOON_58:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Constrict", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {
                apply PARALYZED
              }
            }
          }
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost P
            onAttack {
              damage 10, opp.all.select()
            }
          }

        };
      case DUSKULL_59:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Silhouette", {
            text "Put 1 damage counter on the Defending Pokémon. If the Defending Pokémon already has any damage counters on it, put 2 damage counters on that Pokémon instead."
            energyCost P
            onAttack {
              if(defending.numberOfDamageCounters) {
                directDamage 10, defending
              }
              directDamage 10, defending
            }
          }
          move "Will-o’-the-wisp", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case DUSKULL_60:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Tackle", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Surprise Attack", {
            text "30 damage. Flip a coin. If tails, this attack does nothing"
            energyCost P, C
            onAttack {
              flip {
                damage 30
              }
            }
          }

        };
      case FINNEON_61:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Aqua Liner", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon."
            energyCost ()
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              damage 10, opp.bench.select()
            }
          }
          move "Mouth Pump", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }

        };
      case GASTLY_62:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Pitch-Dark", {
            text "You opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn."
            energyCost ()
            onAttack {
              delayed {
                before PLAY_TRAINER, {
                  if (ef.cardToPlay.cardTypes.is(ITEM) && bg.currentTurn == self.owner.opposite) {
                    wcu "$thisMove prevents you from playing Trainer cards."
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Trick Gas", {
            text "10 damage. You may switch Gastly with 1 of your Benched Pokémon."
            energyCost P
            onAttack {
              damage 10
              switchYourActive(may:true)
            }
          }

        };
      case LARVITAR_63:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Rock Slide", {
            text "20 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost F, C
            onAttack {
              damage 20
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  damage 10, it
                }
              }
            }
          }

        };
      case MACHOP_64:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Kick", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Knock Back", {
            text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C
            onAttack {
              damage 20
              whirlwind()
            }
          }

        };
      case MAGIKARP_65:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Sea Spray", {
            text "Flip a coin until you get tails. For each heads, draw a card."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              flipUntilTails {
                draw 1
              }
            }
          }
          move "Splash", {
            text "10 damage. "
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case MAGNEMITE_66:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          customAbility {
            //Magnet : Magnemite's Retreat Cost is [C] less for each Magnemite on your Bench.
            getterA (GET_RETREAT_COST, self) {h->
              h.object -= self.owner.pbg.bench.findAll{it.name == "Magnemite"}.size()
            }
          }
          move "Magnetic Bomb", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, Magnemite does 10 damage to itself."
            energyCost L, C
            onAttack {
              damage 30
              flip 1, {
                damage 10
              }, {
                damage 10, self
              }
            }
          }

        };
      case MAGNEMITE_67:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Ram", {
            text "10 damage. "
            energyCost ()
            onAttack {
              damage 10
            }
          }
          move "Random Spark", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost L, C
            onAttack {
              damage 20, opp.all.select()
            }
          }

        };
      case MISDREAVUS_68:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Lullaby", {
            text "The Defending Pokémon is now Asleep."
            energyCost ()
            onAttack {
              apply ASLEEP
            }
          }
          move "Nightmare Feast", {
            text "If the Defending Pokémon is Asleep, this attack does 50 damage and remove 5 damage counters from Misdreavus. If the Defending Pokémon is not Asleep, this attack does nothing."
            energyCost P
            attackRequirement {
              assert defending.isSPC(ASLEEP) : "The Defending Pokémon is not Asleep"
            }
            onAttack {
              damage 50
              heal 50, self
            }
          }

        };
      case ONIX_69:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          move "Harden", {
            text "During your opponent’s next turn, if Onix would be damaged by an attack, prevent that attack’s damage done to Onix if that damage is 40 or less."
            energyCost C
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 40 && it.notNoEffect) {
                      bc "Harden prevents damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after CHANGE_STAGE,self, {unregister()}
                after FALL_BACK,self, {unregister()}
              }
            }
          }
          move "Bind", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost F, C, C
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case PIKACHU_70:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Pika Punch", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Speed Bolt", {
            text "40 damage. If Pikachu evolved from Pichu during this turn, prevent all effects of an attack, including damage, done to Pikachu during your opponent’s next turn."
            energyCost L, C, C
            onAttack {
              damage 40
              if (self.lastEvolved == bg.turnCount && self.cards.find{it.name == "Pichu"}) {
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case PONYTA_71:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Smash Kick", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Ponyta during your opponent’s next turn."
            energyCost R, C
            onAttack {
              damage 20
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case ROSELIA_72:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness R, PLUS10
          move "Headbutt", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Petal Spikes", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep and Poisoned. If Budew is anywhere under Roselia, the Defending Pokémon is now Asleep and Poisoned."
            energyCost P, C
            onAttack {
              damage 20
              def flag = false
              flip {
                flag = true
              }
              if(flag || self.cards.find{it.name == "Budew"}) {
                applyAfterDamage ASLEEP
                applyAfterDamage POISONED
              }
            }
          }

        };
      case SKORUPI_73:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness P, PLUS10
          move "Stalk", {
            text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 10
              cantRetreat defending
            }
          }
          move "Dangerous Claw", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              flip 1, {
                applyAfterDamage PARALYZED
              }, {
                applyAfterDamage POISONED
              }
            }
          }

        };
      case SNOVER_74:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness R, PLUS10
          move "Hide", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Snover during your opponent's next turn."
            energyCost C
            onAttack {
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Powder Snow", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost W
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }

        };
      case STARLY_75:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Double Stab", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }

        };
      case STUNKY_76:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Gnaw and Run", {
            text "10 damage. Switch Stunky with 1 of your Benched Pokémon."
            energyCost D
            onAttack {
              damage 10
              switchYourActive()
            }
          }
          move "Double Scratch", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }

        };
      case SWINUB_77:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Freezing Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep"
            energyCost W
            onAttack {
              flip 1, {
                apply PARALYZED
              }, {
                apply ASLEEP
              }
            }
          }
          move "Take Down", {
            text "20 damage. Flip a coin. If tails, Swinub does 10 damage to itself."
            energyCost F
            onAttack {
              damage 20
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case TANGELA_78:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Ingrain", {
            text "Flip a coin. If tails, this attack does nothing. If heads, search your deck for a [G] Energy card and attach it to Tangela. Shuffle your deck afterward. If you do, prevent all effects of an attack, including damage, done to Tangela during your opponent's next turn. "
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              flip {
                def card = my.deck.search("Search your deck for a [G] Energy card",energyFilter(G)).first()
                if(card) {
                  if(!bg.em().run(new AttachEnergy(self, card, ActivationReason.OTHER))) {
                    preventAllEffectsNextTurn()
                  }
                }
                shuffleDeck()
              }
            }
          }
          move "Tickle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case TREECKO_79:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Call for Friends", {
            text "Search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a Basic Pokémon",cardTypeFilter(BASIC)).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Poison Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              flip { apply POISONED }
            }
          }

        };
      case VOLTORB_80:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Screech", {
            text "If an attack does damage to the Defending Pokémon (after applying Weakness and Resistance), that attack does 20 more damage to that Pokémon until the end of your next turn."
            energyCost ()
            onAttack {
              increasedDamageDoneToDefending(self, defending, 20, thisMove.name)
            }
          }
          move "Double Spin", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }

        };
      case VOLTORB_81:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Outlet", {
            text "Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              my.deck.search("Search your deck for a [L] Energy card",energyFilter(L)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Bouncing Ball", {
            text "20 damage. Flip a coin. If tails, Voltorb does 10 damage to itself."
            energyCost L
            onAttack {
              damage 20
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case CONDUCTIVE_QUARRY_82:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, the player may flip a coin. If heads, that player searches his or her discard pile for a [L] or [M] Energy card, shows it to the opponent, and puts it into his or her hand."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action(thisCard, "Stadium: Conductive Quarry") {
              assert my.discard.find{it.cardTypes.is(ENERGY) && (it.asEnergyCard().containsType(L)||it.asEnergyCard().containsType(M))} : "There are no [L] or [M] Energy cards in your discard pile"
              assert lastTurn != bg().turnCount : "You've already used Conductive Quarry this turn."
              bc "Used Conductive Quarry"
              lastTurn = bg().turnCount
              flip {
                my.discard.select("Return a [L] or [M] Energy to your hand",{it.cardTypes.is(ENERGY) && it.asEnergyCard().containsType(L)||it.asEnergyCard().containsType(M)}).moveTo(my.hand)
              }
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case ENERGY_LINK_83:
        return pokemonTool (this) {
          text "Attach Energy Link to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAs long as Energy Link is attached to a Pokémon, you may move an Energy card attached to that Pokémon to another of your Pokémon that has Energy Link attached to it. You may use this effect as often as you like during your turn."
          def actions=[]
          onPlay {reason->
            if(!bg.em().retrieveObject("Energy_Link+$thisCard.player")) {
              actions = action(thisCard, "Energy Link",[TargetPlayer.SELF]) {
                assert my.all.findAll{it.cards.find{it.name == "Energy Link"}}.size() >= 2 : "You don't have 2 Energy Link in play"
                assert my.all.find{it.cards.find{it.name == "Energy Link"} && it.cards.filterByType(ENERGY)} : "You don't have any Energy attached to your Pokémon with Energy Link attached"
                def src=my.all.findAll {it.cards.find{it.name == "Energy Link"} && it.cards.filterByType(ENERGY)}.select("Source for Energy")
                def card=src.cards.filterByType(ENERGY).select("Card to move").first()
                def tar=my.all.findAll {it.cards.find{it.name == "Energy Link"}}
                tar.remove(src)
                tar=tar.select("Target for $card")
                energySwitch(src, tar, card)
              }
              bg.em().storeObject("Energy_Link+$thisCard.player",actions)
            }
          }
          onRemoveFromPlay {
            actions = bg.em().retrieveObject("Energy_Link+$thisCard.player")
            if(!thisCard.player.pbg.all.find{it.cards.find{it.name == "Energy Link"}}) {
              actions.each { bg().gm().unregisterAction(it) }
            }
          }
        };
      case ENERGY_SWITCH_84:
        return copy(FireRedLeafGreen.ENERGY_SWITCH_90, this)
      case GREAT_BALL_85:
        return copy(FireRedLeafGreen.GREAT_BALL_92, this);
      case LUXURY_BALL_86:
        return basicTrainer (this) {
          text "Search your deck for a Pokémon (excluding Pokémon LV.X), show it to your opponent, and put it into your hand. Shuffle your deck afterward. If any Luxury Ball is in your discard pile, you can’t play this card."
          onPlay {
            my.deck.search("Search your deck for a Pokémon (excluding Pokémon LV.X)",{it.cardTypes.is(POKEMON) && !it.cardTypes.is(LVL_X)}).showToOpponent("Selected Cards").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
            assert !my.discard.find{it.name == "Luxury Ball"}
          }
        };
      case MARLEY_S_REQUEST_87:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for 2 different Trainer, Supporter, or Stadium cards, show them to your opponent, and your opponent chooses 1 of them. Put that card into your hand, and discard the other card. (If all Trainer, Supporter, and Stadium cards in your discard pile have the same name, choose 1 of them. Show that card to your opponent and put it into your hand.)"
          onPlay {
            def names = []
            def unique = 0
            for (card in my.discard.filterByType(ITEM,SUPPORTER,STADIUM)) {
              if (!names.contains(card.name)) {
                unique ++
              }
              names.add card.name
            }
            if(unique > 1) {
              my.discard.select(count:2,"Select 2 different Trainer, Supporter, or Stadium cards",{it.cardTypes.is(ITEM)||it.cardTypes.is(SUPPORTER)||it.cardTypes.is(STADIUM)}, thisCard.player, {
                names = []
                for (card in it) {
                  if (names.contains(card.name)) {
                    return false
                  }
                  names.add card.name
                }
                return true
              }).oppSelect("Choose a card to put into your opponent's hand").moveTo(my.hand)
            } else {
              new CardList(my.discard.find{it.cardTypes.is(ITEM)||it.cardTypes.is(SUPPORTER)||it.cardTypes.is(STADIUM)}).showToOpponent("Marley's Request: This card will be put into your opponent's hand").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.discard.filterByType(ITEM,SUPPORTER,STADIUM) : "You have no Trainer, Supporter, or Stadium cards in your discard pile"
          }
        };
      case POKE_BLOWER_PLUS_88:
        return basicTrainer (this) {
          text "You may play 2 Poké Blower + at the same time. If you play 1 Poké Blower +, flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. If you play 2 Poké Blower +, choose 1 of your opponent’s Benched Pokémon and switch it with 1 of your opponent’s Active Pokémon."
          onPlay {
            if(opp.bench && my.hand.findAll({it.name=="Poké Blower +"}).size()>=2 && confirm("Play 2 Poké Blower + at the same time?")) {
              sw2(opp.bench.select("New Active"), null, TRAINER_CARD)
              my.hand.findAll({it.name=="Poké Blower +" && it!= thisCard}).subList(0,1).discard()
            } else {
              flip {
                directDamage 10, opp.all.select(), TRAINER_CARD
              }
            }
          }
          playRequirement{
          }
        };
      case POKE_DRAWER_PLUS_89:
        return basicTrainer (this) {
          text "You may play 2 Poké Drawer + at the same time. If you play 1 Poké Drawer +, draw a card. If you play 2 Poké Drawer +, search your deck for up to 2 cards, and put them into your hand. Shuffle your deck afterward."
          onPlay {
            if(my.hand.findAll({it.name=="Poké Drawer +"}).size()>=2 && confirm("Play 2 Poké Drawer + at the same time?")) {
              my.deck.search(min:1,max:2,"Select up to 2 cards",{true}).moveTo(hidden:true,my.hand)
              shuffleDeck()
              my.hand.findAll({it.name=="Poké Drawer +" && it!= thisCard}).subList(0,1).discard()
            } else {
              draw 1
            }
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case POKE_HEALER_PLUS_90:
        return basicTrainer (this) {
          text "You may play 2 Poké Healer + at the same time. If you play 1 Poké Healer +, remove 1 damage counter and a Special Condition from 1 of your Active Pokémon. If you play 2 Poké Healer +, remove 8 damage counters and all Special Conditions from 1 of your Active Pokémon."
          onPlay {
            if(my.hand.findAll({it.name=="Poké Healer +"}).size()>=2 && confirm("Play 2 Poké Healer + at the same time?")) {
              heal 80, my.active, TRAINER_CARD
              clearSpecialCondition(my.active, TRAINER_CARD)
              my.hand.findAll({it.name=="Poké Healer +" && it!= thisCard}).subList(0,1).discard()
            } else {
              heal 10, my.active, TRAINER_CARD
              if(my.active.specialConditions) {
                SpecialConditionType spc = choose(my.active.specialConditions.asList(), "Which special condition you want to remove")
                clearSpecialCondition(my.active, TRAINER_CARD, [spc])
              }
            }
          }
          playRequirement{
            assert my.active.numberOfDamageCounters || my.active.specialConditions : "$my.active is healthy"
          }
        };
      case PREMIER_BALL_91:
        return copy (GreatEncounters.PREMIER_BALL_101, this);
      case POTION_92:
        return copy (FireRedLeafGreen.POTION_101, this);
      case SWITCH_93:
        return copy(FireRedLeafGreen.SWITCH_102, this);
      case CYCLONE_ENERGY_94:
        return copy (UnseenForces.CYCLONE_ENERGY_99, this)
      case WARP_ENERGY_95:
        return copy (Aquapolis.WARP_ENERGY_147, this)
      case DUSKNOIR_LV_X_96:
        return levelUp (this, from:"Dusknoir", hp:HP140, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokePower "Ectoplasm", {
            text "If Dusknoir is your Active Pokémon and would be Knocked Out by damage from your opponent’s attack, you may discard all cards attached to Dusknoir LV. and put Dusknoir LV. as a Stadium card into play instead of discarding it. This counts as Dusknoir being Knocked Out and your opponent takes a Prize card. As long as you have Dusknoir LV. as a Stadium card in play, put 1 damage counter on each of your opponent’s Pokémon between turns. If another Stadium card comes into play or Dusknoir LV. X is discarded by the effects of any attacks, Poké-Powers, Poké-Bodies, Trainer, or Supporter cards, return Dusknoir LV.X to your hand."
            delayedA priority:BEFORE_LAST, {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && self.active && confirm("Use Ectoplasm?")){
                  powerUsed()

                  // Dusknoir Lv.X violates many of the rules of stadiums due to rulings. https://compendium.pokegym.net/compendium-lvx.html#303
                  // Manually playing the stadium based on those rulings. This is a very unique effect and should not exist elsewhere currently.
                  def pkmnCard = self.topPokemonCard
                  def stadiumCard
                  stadiumCard = stadium(new CustomCardInfo(DUSKNOIR_LV_X_96).setCardTypes(TRAINER, STADIUM)) {
                    def eff
                    onPlay {
                      eff = delayed inline:true, {
                        before BEGIN_TURN, {
                          thisCard.player.opposite.pbg.all.each {
                            directDamage 10, it, TRAINER_CARD
                          }
                        }
                      }
                      delayed inline:true, {
                        after REMOVE_FROM_PLAY, {
                          if (LUtils.isRemoveFromPlayAndContainsCard(e, stadiumCard)) {
                            stadiumCard.onDiscard bg
                            bg.setStadiumInfoStruct null
                            unregister()
                          }
                        }
                      }
                    }
                    onRemoveFromPlay {
                      eff.unregister()
                      bg.em().run(new ChangeImplementation(pkmnCard, stadiumCard))
                      moveCard(pkmnCard, thisCard.player.pbg.hand)
                    }
                  }
                  stadiumCard.initializeFrom thisCard
                  bg.em().run(new ChangeImplementation(stadiumCard, pkmnCard))
                  if (bg.stadiumInfoStruct) {
                    discardStadium()
                  }

                  PlayStadium.StadiumInfoStruct stadiumInfoStruct = new PlayStadium.StadiumInfoStruct()
                  stadiumInfoStruct.stadiumCard = stadiumCard
                  bg.setStadiumInfoStruct(stadiumInfoStruct)
                  bg.em().activateEffect(stadiumCard)

                  self.cards.remove(stadiumCard)

                  bc "$stadiumCard is now a Stadium"
                }
              }
            }
          }
        };
      case HEATRAN_LV_X_97:
        return levelUp (this, from:"Heatran", hp:HP120, type:FIRE, retreatCost:4) {
          weakness W
          def src
          def heatWaveFlag = false
          CardList energyList = []
          customAbility {
            delayed {
              before ATTACK_MAIN, {
                src = ef.attacker
                energyList = ef.attacker.cards.filterByType(ENERGY)
                heatWaveFlag = true
              }
            }
          }
          pokeBody "Heat Metal", {
            text "Your opponent can’t remove the Special Condition Burned by evolving or devolving his or her Burned Pokémon. (This also includes putting a Pokémon Level-Up card onto the Burned Pokémon.) Whenever your opponent flips a coin for the Special Condition Burned between turns, treat it as tails."
            def eff1, eff4, eff5
            onActivate {
              eff1 = delayed {
                before BURNED_SPC, null, null, CHANGE_STAGE, {
                  if (bg.em().currentEffectStack.find{it.effectType == EVOLVE || it.effectType == DEVOLVE || it.effectType == LEVEL_UP}) {
                    bc "Heat Metal prevents removing the Special Condition Burned by evolving or devolving or levelling up"
                    prevent()
                  }
                }
              }
              def heatMetalFlag
              eff4 = getter COIN_FLIP_GETTER, { h ->
                if (heatMetalFlag && h.effect.info == "Burned") {
                  if (h.object) {
                    bc "Heat Metal changes coin flip result to TAILS"
                  }
                  h.object = false
                  heatMetalFlag = false
                }
              }
              eff5 = delayed {
                before BURNED_SPC, null, null, BEGIN_TURN, {
                  if (ef.target.owner == self.owner.opposite) {
                    heatMetalFlag = true
                  }
                }
              }
            }
            onDeactivate {
              eff1.unregister()
              eff4.unregister()
              eff5.unregister()
            }
          }
          pokePower "Heat Wave", {
            text "Once at the end of your turn, if Heatran is on your Bench, you may use this power. If you discarded basic Energy cards attached to your [R] or [M] Active Pokémon by that Pokémon’s attack this turn, attach up to 2 of those Energy cards to that Pokémon."
            delayedA {
              before BETWEEN_TURNS, {
                if(heatWaveFlag) {
                  energyList.removeAll(src.cards.filterByType(ENERGY))
                  if(bg.currentTurn == self.owner && src && (src.types.contains(R) || src.types.contains(M)) && energyList.filterByType(BASIC_ENERGY) && self.benched && confirm("Use Heat Wave?")) {
                    powerUsed()
                    energyList.select(max:2,"Attach up to 2 Basic Energy cards to $src",cardTypeFilter(BASIC_ENERGY)).each {
                      attachEnergy(src, it)
                    }
                  }
                  energyList.retainAll()
                }
                heatWaveFlag = false
              }
            }
          }
        };
      case MACHAMP_LV_X_98:
        return levelUp (this, from:"Machamp", hp:HP150, type:FIGHTING, retreatCost:3) {
          weakness P, PLUS40
          pokeBody "No Guard", {
            text "As long as Machamp is your Active Pokémon, each of Machamp’s attacks does 60 more damage to the Active Pokémon (before applying Weakness and Resistance) and any damage done to Machamp by your opponent’s Pokémon is increased by 60 (after applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
                    bc "No Guard +60"
                    it.dmg += hp(60)
                  }
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && self.active && it.dmg.value && it.notNoEffect){
                    bc "No Guard +60"
                    it.dmg+=hp(60)
                  }
                }
              }
            }
          }
          move "Strong-Willed", {
            text "20 damage. During your opponent’s next turn, if Machamp would be Knocked Out by damage from an attack, flip a coin. If heads, Machamp is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost F, C, C
            onAttack {
              damage 20
              afterDamage {
                delayed {
                  before KNOCKOUT, self, {
                    if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                      flip {
                        self.damage = self.fullHP - hp(10)
                        bc "$self endured the hit!"
                        prevent()
                      }
                    }
                  }
                  unregisterAfter 2
                  after CHANGE_STAGE, self, {unregister()}
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
        };
      case RAICHU_LV_X_99:
        return levelUp (this, from:"Raichu", hp:HP110, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          def flag = false // True when a 2nd move can be used
          def flag2 = false // True when a 2nd move is being used
          customAbility {
            delayed {
              before ATTACK_MAIN, {
                if(ef.move.name == "Voltage Shoot" && !flag2) {
                  if(self.lastEvolved == bg.turnCount) {
                    flag = true
                  }
                }
              }
            }
          }
          pokeBody "Link Lightning", {
            text "Once during your turn, when you put Raichu LV.X onto Raichu and use Voltage Shoot, you may use another attack of Raichu afterward. This power can’t be used if Raichu is affected by a Special Condition."
            delayedA (priority: FIRST) {
              before BETWEEN_TURNS, {
                if (flag && !self.specialConditions) {
                  def moveList = []
                  moveList.add("Don't attack")
                  moveList.addAll(self.topPokemonCard.moves)
                  moveList.addAll(self.topNonLevelUpPokemonCard.moves)//TODO: This breaks with Technical Machines. I wonder if the testers will notice?
                  def move = choose(moveList, "Choose attack", moveList[0])
                  if(move != "Don't attack") {
                    def bef=blockingEffect(BETWEEN_TURNS)
                    flag = false
                    flag2 = move.name
                    attack (move as Move)
                    flag2 = null
                    bef.unregisterItself(bg().em())
                  }
                }
                flag = false
              }
              unregisterAfter 1
            }
          }
          move "Voltage Shoot", {
            text "Discard 2 [L] Energy cards from your hand and choose 1 of your opponent’s Pokémon. This attack does 80 to that Pokémon."
            energyCost L, L, C
            attackRequirement {
              assert (flag2 && flag2 != "Voltage Shoot") || my.hand.filterByEnergyType(L).size() >= 2 : "You can't discard 2 [L] Energy cards from your hand"
            }
            onAttack {
              damage 80, opp.all.select()
              afterDamage {
                my.hand.select(count:2,"Discard 2 [L] Energy cards from your hand",energyFilter(L)).discard()
              }
            }
          }
        };
      case REGIGIGAS_LV_X_100:
        return levelUp (this, from:"Regigigas", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness F
          pokePower "Sacrifice", {
            text "Once during your turn , you may choose 1 of your Pokémon and that Pokémon is Knocked Out. Then, search your discard pile for up to 2 basic Energy cards, attach them to Regigigas, and remove 8 damage counters from Regigigas. This power can’t be used if Regigigas is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              def pcs = my.all.select("Choose one of your Pokémon to knock out")
              new Knockout(pcs).run(bg)
              if (pcs != self) { //Cannot attach to or heal from Regigigas if Regigigas was chosen to be knocked out.
                attachEnergyFrom(basic:true, max:2, my.discard, self)
                heal 80, self
              }
            }
          }
          move "Giga Blaster", {
            text "100 damage. Discard the top card from your opponent’s deck. Then, choose 1 card from your opponent’s hand without looking and discard it. Regigigas can’t use Giga Blaster during your next turn."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              damage 100
              if (opp.deck) {
                opp.deck.subList(0, 1).discard()
              }
              if (opp.hand) {
                opp.hand.shuffledCopy().select(hidden: true, count: 1, "Choose a random card from your opponent's hand to be discarded").showToMe("Selected card").showToOpponent("This card will be discarded").discard()
              }
              cantUseAttack thisMove, self
            }
          }
        };
      case CHARMANDER_101:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W
          move "Scratch", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Ember", {
            text "30 damage. Discard a [R] Energy card attached to Charmander."
            energyCost R, C
            onAttack {
              damage 30
              discardSelfEnergyAfterDamage R
            }
          }

        };
      case CHARMELEON_102:
        return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W
          move "Slash", {
            text "30 damage. "
            energyCost C, C, C
            onAttack {
              damage 30
            }
          }
          move "Flamethrower", {
            text "50 damage. Discard a [R] Energy attached to Charmeleon."
            energyCost R, R, C
            onAttack {
              damage 50
              discardSelfEnergyAfterDamage R
            }
          }

        };
      case CHARIZARD_103:
        return evolution (this, from:"Charmeleon", hp:HP120, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS30
          pokeBody "Energy Burn", {// Taken directly from BaseSetNG
            text "All Energy attached to Charizard are [R] Energy instead of their usual type. "
            getterA GET_ENERGY_TYPES, { holder ->
              if (holder.effect.target == self) {
                int count = holder.object.size()
                holder.object = (1..count).collect { [FIRE] as Set }
              }
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack."
            energyCost R, R, R, R
            attackRequirement {
              assert self.cards.filterByType(ENERGY).size() >= 2 : "You don't have 2 Energy cards to discard"
            }
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage C, C
            }
          }

        };
      case DRIFLOON_SH1:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS10
          resistance C, MINUS20
          pokeBody "Unburden", {
            text "If Drifloon has a Pokémon Tool card attached to it, Drifloon’s Retreat Cost is [C][C] more."
            getterA GET_RETREAT_COST, self, {h ->
              if (self.cards.filterByType(POKEMON_TOOL)) {
                h.object += 2
              }
            }
          }
          move "Tackle", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Big Explosion", {
            text "50 damage. Drifloon does 50 damage to itself."
            energyCost P, C
            onAttack {
              damage 50
              damage 50, self
            }
          }

        };
      case DUSKULL_SH2:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Counting Song", {
            text "Put up to 3 damage counters on Duskull. Then put that many damage counters on the Defending Pokémon. "
            energyCost ()
            onAttack {
              def count = choose(1..3, "Put up to 3 damage counters on $self")
              directDamage 10 * count, self
              directDamage 10 * count, defending
            }
          }
          move "Ram", {
            text "10 damage. "
            energyCost P
            onAttack {
              damage 10
            }
          }
          move "Night Bind", {
            text "20 damage. Flip a coin. If heads, your opponent can’t attach any Energy cards from his or her hand to the Active Pokémon during his or her next turn."
            energyCost P, C
            onAttack {
              damage 20
              afterDamage {
                flip {
                  targeted (defending) {
                    bc "During ${opp.owner.getPlayerUsername(bg)}'s next turn, Energy can't be attached from their hand to the Defending ${defending}. (This effect can be removed by evolving or benching ${defending}.)"
                    def pcs = defending
                    delayed {
                      before ATTACH_ENERGY, pcs, {
                        if(ef.reason == PLAY_FROM_HAND) {
                          wcu "Night Bind: Can't attach energy to ${pcs}"
                          prevent()
                        }
                      }
                      unregisterAfter 2
                      after FALL_BACK, pcs, {unregister()}
                      after CHANGE_STAGE, pcs, {unregister()}
                    }
                  }
                }
              }
            }
          }

        };
      case VOLTORB_SH3:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Fastball", {
            text "Choose 1 of your opponent’s Pokémon. Flip a coin. If heads, this attack does 20 damage to that Pokémon."
            energyCost C
            onAttack {
              def tar = opp.all.select()
              flip {
                damage 20, tar
              }
            }
          }
          move "Charge Beam", {
            text "10 damage. Search your discard pile for a [L] Energy card and attach it to Voltorb. ."
            energyCost L
            onAttack {
              damage 10
              afterDamage {
                attachEnergyFrom(type:L, my.discard, self)
              }
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      default:
        return null;
    }
  }

}
