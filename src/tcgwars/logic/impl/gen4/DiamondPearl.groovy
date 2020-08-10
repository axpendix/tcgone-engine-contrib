package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen1.BaseSet;
import tcgwars.logic.impl.gen2.Expedition;
import tcgwars.logic.impl.gen3.Sandstorm;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen5.PlasmaStorm;
import tcgwars.logic.impl.gen5.BlackWhite;

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

/**
 * @author axpendix
 * @author wertercatt
 * @author lithogen
 * @author starg09
 */
public enum DiamondPearl implements LogicCardInfo {

  DIALGA_1 ("Dialga", "1", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  DUSKNOIR_2 ("Dusknoir", "2", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  ELECTIVIRE_3 ("Electivire", "3", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  EMPOLEON_4 ("Empoleon", "4", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  INFERNAPE_5 ("Infernape", "5", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  LUCARIO_6 ("Lucario", "6", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LUXRAY_7 ("Luxray", "7", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAGNEZONE_8 ("Magnezone", "8", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MANAPHY_9 ("Manaphy", "9", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MISMAGIUS_10 ("Mismagius", "10", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  PALKIA_11 ("Palkia", "11", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  RHYPERIOR_12 ("Rhyperior", "12", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  ROSERADE_13 ("Roserade", "13", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SHIFTRY_14 ("Shiftry", "14", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  SKUNTANK_15 ("Skuntank", "15", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  STARAPTOR_16 ("Staraptor", "16", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  TORTERRA_17 ("Torterra", "17", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  AZUMARILL_18 ("Azumarill", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BEAUTIFLY_19 ("Beautifly", "19", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BIBAREL_20 ("Bibarel", "20", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  CARNIVINE_21 ("Carnivine", "21", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  CLEFABLE_22 ("Clefable", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DRAPION_23 ("Drapion", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DRIFBLIM_24 ("Drifblim", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSTOX_25 ("Dustox", "25", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  FLOATZEL_26 ("Floatzel", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GENGAR_27 ("Gengar", "27", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  HERACROSS_28 ("Heracross", "28", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  HIPPOWDON_29 ("Hippowdon", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LOPUNNY_30 ("Lopunny", "30", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MACHAMP_31 ("Machamp", "31", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  MEDICHAM_32 ("Medicham", "32", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MUNCHLAX_33 ("Munchlax", "33", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  NOCTOWL_34 ("Noctowl", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PACHIRISU_35 ("Pachirisu", "35", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  PURUGLY_36 ("Purugly", "36", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SNORLAX_37 ("Snorlax", "37", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  STEELIX_38 ("Steelix", "38", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  VESPIQUEN_39 ("Vespiquen", "39", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WEAVILE_40 ("Weavile", "40", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  WOBBUFFET_41 ("Wobbuffet", "41", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  WYNAUT_42 ("Wynaut", "42", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  BUDEW_43 ("Budew", "43", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  CASCOON_44 ("Cascoon", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CHERRIM_45 ("Cherrim", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DRIFLOON_46 ("Drifloon", "46", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSCLOPS_47 ("Dusclops", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ELEKID_48 ("Elekid", "48", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GROTLE_49 ("Grotle", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HAUNTER_50 ("Haunter", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HIPPOPOTAS_51 ("Hippopotas", "51", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUXIO_52 ("Luxio", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MACHOKE_53 ("Machoke", "53", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGNETON_54 ("Magneton", "54", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MANTYKE_55 ("Mantyke", "55", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  MONFERNO_56 ("Monferno", "56", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  NUZLEAF_57 ("Nuzleaf", "57", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  PRINPLUP_58 ("Prinplup", "58", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAPIDASH_59 ("Rapidash", "59", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RHYDON_60 ("Rhydon", "60", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RIOLU_61 ("Riolu", "61", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  SEAKING_62 ("Seaking", "62", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SILCOON_63 ("Silcoon", "63", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  STARAVIA_64 ("Staravia", "64", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  UNOWN_A_65 ("Unown A", "65", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_B_66 ("Unown B", "66", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_C_67 ("Unown C", "67", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_D_68 ("Unown D", "68", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AZURILL_69 ("Azurill", "69", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BIDOOF_70 ("Bidoof", "70", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BONSLY_71 ("Bonsly", "71", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BUIZEL_72 ("Buizel", "72", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BUNEARY_73 ("Buneary", "73", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHATOT_74 ("Chatot", "74", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHERUBI_75 ("Cherubi", "75", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHIMCHAR_76 ("Chimchar", "76", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CLEFAIRY_77 ("Clefairy", "77", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CLEFFA_78 ("Cleffa", "78", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  COMBEE_79 ("Combee", "79", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DUSKULL_80 ("Duskull", "80", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ELECTABUZZ_81 ("Electabuzz", "81", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GASTLY_82 ("Gastly", "82", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GLAMEOW_83 ("Glameow", "83", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GOLDEEN_84 ("Goldeen", "84", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  HOOTHOOT_85 ("Hoothoot", "85", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MACHOP_86 ("Machop", "86", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEMITE_87 ("Magnemite", "87", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MARILL_88 ("Marill", "88", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MEDITITE_89 ("Meditite", "89", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MIME_JR__90 ("Mime Jr.", "90", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MISDREAVUS_91 ("Misdreavus", "91", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ONIX_92 ("Onix", "92", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIPLUP_93 ("Piplup", "93", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PONYTA_94 ("Ponyta", "94", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  RHYHORN_95 ("Rhyhorn", "95", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ROSELIA_96 ("Roselia", "96", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SEEDOT_97 ("Seedot", "97", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHINX_98 ("Shinx", "98", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SKORUPI_99 ("Skorupi", "99", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SNEASEL_100 ("Sneasel", "100", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  STARLY_101 ("Starly", "101", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUNKY_102 ("Stunky", "102", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  TURTWIG_103 ("Turtwig", "103", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WURMPLE_104 ("Wurmple", "104", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DOUBLE_FULL_HEAL_105 ("Double Full Heal", "105", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_RESTORE_106 ("Energy Restore", "106", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SWITCH_107 ("Energy Switch", "107", Rarity.UNCOMMON, [TRAINER, ITEM]),
  NIGHT_POKEMON_CENTER_108 ("Night Pokémon Center", "108", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PLUSPOWER_109 ("PlusPower", "109", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_BALL_110 ("Poké Ball", "110", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKEDEX_HANDY910IS_111 ("Pokédex HANDY910is", "111", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PROFESSOR_ROWAN_112 ("Professor Rowan", "112", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RIVAL_113 ("Rival", "113", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SPEED_STADIUM_114 ("Speed Stadium", "114", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SUPER_SCOOP_UP_115 ("Super Scoop Up", "115", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WARP_POINT_116 ("Warp Point", "116", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_117 ("Energy Search", "117", Rarity.COMMON, [TRAINER, ITEM]),
  POTION_118 ("Potion", "118", Rarity.COMMON, [TRAINER, ITEM]),
  SWITCH_119 ("Switch", "119", Rarity.COMMON, [TRAINER, ITEM]),
  EMPOLEON_LV_X_120 ("Empoleon", "120", Rarity.HOLORARE, [STAGE2, /* <- TODO: Remove that*/LEVEL_UP, EVOLUTION, POKEMON, _WATER_]),
  INFERNAPE_LV_X_121 ("Infernape", "121", Rarity.HOLORARE, [STAGE2, /* <- TODO: Remove that*/LEVEL_UP, EVOLUTION, POKEMON, _FIRE_]),
  TORTERRA_LV_X_122 ("Torterra", "122", Rarity.HOLORARE, [STAGE2, /* <- TODO: Remove that*/LEVEL_UP, EVOLUTION, POKEMON, _GRASS_]),
  GRASS_ENERGY_123 ("Grass Energy", "123", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_124 ("Fire Energy", "124", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_125 ("Water Energy", "125", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_126 ("Lightning Energy", "126", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_127 ("Psychic Energy", "127", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIGHTING_ENERGY_128 ("Fighting Energy", "128", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  DARKNESS_ENERGY_129 ("Darkness Energy", "129", Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  METAL_ENERGY_130 ("Metal Energy", "130", Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  DiamondPearl(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DIAMOND_PEARL;
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
      case DIALGA_1:
        return basic (this, hp:HP090, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Time Bellow", {
            text "10 damage. Draw a card."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 10
              draw 1
            }
          }
          move "Flash Cannon", {
            text "40 damage. You may return all Energy cards attached to Dialga to your hand. If you do, remove the highest Stage Evolution card from the Defending Pokémon and shuffle that card into your opponent’s deck."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                if(defending.evolution && confirm ("You may return all Energy cards attached to Dialga to your hand. If you do, remove the highest Stage Evolution card from the Defending Pokémon and shuffle that card into your opponent’s deck.")) {
                  self.cards.filterByType(ENERGY).moveTo(my.hand)
                  def top=defending.topPokemonCard
                  //
                  // [Temporary LV.X workaround]
                  if (top.cardTypes.is(LEVEL_UP) && defending.cards.filterByType(POKEMON).size() > 2){
                    bc "${top}'s Level-Up card will be moved wherever the top evolution ends up at."
                    moveCard(top, opp.hand)
                    devolve(defending, top)
                    top = defending.topPokemonCard
                  }
                  // [End of LV.X workaround] TODO: Remove this when no longer needed
                  //
                  bc "$top Devolved"
                  moveCard(top, opp.hand)
                  devolve(defending, top)
                }
              }
            }
          }

        };
      case DUSKNOIR_2:
        return evolution (this, from:"Dusclops", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Dark Palm", {
            text "Once during your turn (before your attack), if your opponent has 4 or more Benched Pokémon, you may choose 1 of them and shuffle that Pokémon and all cards attached to it into his or her deck. This power can’t be used if Dusknoir is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert opp.bench.size() >= 4 : "Opponent needs to have 4 or more Benched Pokémon"
              powerUsed()
              def tar = opp.bench.select("Choose a Pokémon to return to your opponent's deck.")
              tar.cards.moveTo(opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              removePCS(tar)
            }
          }
          move "Hard Feelings", {
            text "Put 5 damage counters on the Defending Pokémon. Then, count the number of Prize cards your opponent has taken and put that many damage counters on the Defending Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              directDamage 50, opp.active
              def takenPrizes = opp.prizeCardSet.takenCount
              if (takenPrizes)
                directDamage 10 * takenPrizes, opp.active
            }
          }

        };
      case ELECTIVIRE_3:
        return evolution (this, from:"Electabuzz", hp:HP100, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokePower "Intense Voltage", {
            text "As often as you like during your turn (before your attack), if Elekid is anywhere under Electivire, you may move a [L] Energy attached to your Pokémon to Electivire. This power can’t be used if Electivire is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert self.getPokemonCards().findAll {it.name.contains("Elekid")} : "Elekid is not found under $self, you can't use this Poké-Power"
              def pl=(my.all.findAll {it.cards.filterByEnergyType(L) && it!=self})
              assert pl : "There are no Pokémon other than $self with [L] energy attached."
              powerUsed()
              def src=pl.select("Source for [L] energy")
              def card=src.cards.filterByEnergyType(L).select("Card to move").first()
              energySwitch(src, self, card)
            }
          }
          move "Giga Impact", {
            text "60 damage. You may discard all [L] Energy attached to Electivire. If you do, this attack’s base damage is 120 instead of 60."
            energyCost L, L, L, C
            attackRequirement {}
            onAttack {
              if(confirm("You may discard all [L] Energy attached to Electivire. If you do, this attack’s base damage is 120 instead of 60.")){
                discardAllSelfEnergy(L)
                damage 120
              } else {
                damage 60
              }
            }
          }

        };
      case EMPOLEON_4:
        return evolution (this, from:"Prinplup", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Ice Blade", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 40, opp.all.select()
            }
          }
          move "Aqua Jet", {
            text "70 damage. Flip a coin. If heads, this attack does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 70
              if (opp.bench) flip{damage 20, opp.bench.select()}
            }
          }

        };
      case INFERNAPE_5:
        return evolution (this, from:"Monferno", hp:HP100, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          move "Meteor Punch", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flipUntilTails {damage 30}
            }
          }
          move "Flare Blitz", {
            text "90 damage. Discard all [R] Energy attached to Infernape."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 90
              afterDamage{
                discardAllSelfEnergy(R)
              }
            }
          }

        };
      case LUCARIO_6:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Feint", {
            text "30 damage. This attack’s damage isn’t affected by Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              dontApplyResistance()
              damage 30
            }
          }
          move "Aura Sphere", {
            text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 40
              if (opp.bench)
                damage 20, opp.bench.select()
            }
          }

        };
      case LUXRAY_7:
        return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokePower "Gleam Eyes", {
            text "Once during your turn, when you play Luxray from your hand to evolve 1 of your Pokémon, you may look at your opponent’s hand. If your opponent’s Bench isn’t full, choose 1 Basic Pokémon from your opponent’s hand, and put it onto his or her Bench. Then, switch it with the Defending Pokémon."
            onActivate {reason ->
              if(reason==PLAY_FROM_HAND && opp.hand && opp.bench.notFull && confirm('Use Gleam Eyes?')){
                powerUsed()
                def list = opp.hand.shuffledCopy().showToMe("Opponent's hand").filterByType(BASIC)
                if(list){
                  def card = list.select("Put a Basic Pokémon you find there onto your opponent's Bench").first()
                  opp.hand.remove(card)
                  def pcs = benchPCS(card, OTHER, TargetPlayer.OPPONENT)
                  sw opp.active, pcs, SRC_ABILITY
                }
              }
            }
          }
          move "Lightning Star", {
            text "80 damage. Move all [L] Energy attached to Luxray to 1 of your Benched Pokémon. (Ignore this effect if you don’t have any Benched Pokémon.)"
            energyCost L, L, L, L
            attackRequirement {}
            onAttack {
              damage 80
              if (my.bench.notEmpty) {
                def pcs = my.bench.select()
                self.cards.filterByEnergyType(L).each{energySwitch(self,pcs,it)}
              }
            }
          }

        };
      case MAGNEZONE_8:
        return evolution (this, from:"Magneton", hp:HP120, type:METAL, retreatCost:4) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokeBody "Magnetize", {
            text "If you have any [M] Energy attached to your Active Pokémon, the Retreat Cost for that Pokémon is 0."
            getterA (GET_RETREAT_COST,BEFORE_LAST) {h->
              def rec = h.effect.target
              if(rec.owner == self.owner && rec.active && rec.cards.energyCount(M)) {
                h.object = 0
              }
            }
          }
          move "Metal Blast", {
            text "50+ damage. Does 50 damage plus 10 more damage for each [M] Energy attached to Magnezone."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50+10*self.cards.energyCount(M)
            }
          }

        };
      case MANAPHY_9:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Aqua Ring", {
            text "30 damage. Switch Manaphy with 1 of your Benched Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                if (my.bench) {
                  sw self, my.bench.select("Select the new active")
                }
              }
            }
          }

        };
      case MISMAGIUS_10:
        return evolution (this, from:"Misdreavus", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Avenge", {
            text "Count the number of your Pokémon that have any damage counters on them. Put that many damage counters on the Defending Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              directDamage 10 * my.all.findAll{it.numberOfDamageCounters}.size(), defending
            }
          }
          move "Psywave", {
            text "30+ damage. Does 30 damage plus 20 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 30 + 20 * defending.cards.energyCount(C)
            }
          }

        };
      case PALKIA_11:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Spacial Rend", {
            text "10 damage. Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. If there is any Stadium card in play, discard it."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage{
                my.deck.search(cardTypeFilter(STADIUM)).moveTo(hand)
                shuffleDeck()
                if(bg.stadiumInfoStruct) {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
          move "Transback", {
            text "40 damage. You may flip a coin. If heads, discard all Energy attached to Palkia and put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                if(confirm ("You may flip a coin. If heads, discard all Energy attached to Palkia and put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward.")) {
                  flip {
                    discardAllSelfEnergy()
                    defending.cards.moveTo(opp.deck)
                    removePCS(defending)
                    shuffleDeck(null, TargetPlayer.OPPONENT)
                  }
                }
              }
            }
          }

        };
      case RHYPERIOR_12:
        return evolution (this, from:"Rhydon", hp:HP140, type:FIGHTING, retreatCost:4) {
          weakness W, PLUS30
          resistance L, MINUS20
          pokePower "Earth Fissure", {
            text "Once during your turn, when you play Rhyperior from your hand to evolve 1 of your Pokémon, you may discard the top 3 cards from your opponent’s deck."
            onActivate {reason->
              if(reason==PLAY_FROM_HAND && opp.deck && confirm("Use Earth Fissure?")){
                powerUsed()
                opp.deck.subList(0, 3).discard()
              }
            }
          }
          move "Rock Wrecker", {
            text "80 damage. This attack’s damage isn’t affected by Weakness or Resistance. Rhyperior can’t attack during your next turn."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              noWrDamage(80, defending)
              cantAttackNextTurn self
            }
          }

        };
      case ROSERADE_13:
        return evolution (this, from:"Roselia", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Poison Sting", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 30
              apply POISONED
            }
          }
          move "Spike Whip", {
            text "50 damage. If Budew is anywhere under Roserade, choose 1 of your opponent’s Benched Pokémon. This attack does 30 damage to that Pokémon."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 50
              if (self.getPokemonCards().findAll {it.name.contains("Budew")}){
                damage 30, opp.bench.select()
              }
            }
          }

        };
      case SHIFTRY_14:
        return evolution (this, from:"Nuzleaf", hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness F, PLUS30
          resistance P, MINUS20
          pokePower "Darkness Fan", {
            text "Once during your turn (before your attack), if Shiftry is your Active Pokémon, you may flip a coin. If heads, choose 1 Evolved Pokémon on your opponent’s Bench, remove the highest Stage Evolution card from that Pokémon, and put it back into his or her hand. This power can’t be used if Shiftry is affected by a Special Condition."
            actionA {
              checkLastTurn()
              assert self.active : "$self is not your active Pokémon."
              checkNoSPC()
              def list = opp.bench.findAll { it.evolution }
              assert list : "Your opponent has no evolved Pokémon."
              powerUsed()
              flip {
                def pcs = list.select("Devolve one of your opponent's evolved Benched Pokémon.")
                def top = pcs.topPokemonCard
                //
                // [Temporary LV.X workaround]
                if (top.cardTypes.is(LEVEL_UP) && pcs.cards.filterByType(POKEMON).size() > 2){
                  bc "${top}'s Level-Up card will be moved wherever the top evolution ends up at."
                  moveCard(top, opp.hand)
                  devolve(pcs, top)
                  top = pcs.topPokemonCard
                }
                // [End of LV.X workaround] TODO: Remove this when no longer needed
                //
                bc "$top devolved."
                moveCard(top, opp.hand)
                devolve(pcs, top)
              }
            }
          }
          move "Spirit Dance", {
            text "50+ damage. Flip 2 coins. This attack does 50 damage plus 20 more damage for each heads."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 50
              flip 2,{damage 20}
            }
          }

        };
      case SKUNTANK_15:
        return evolution (this, from:"Stunky", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Frustration", {
            text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 30 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost D, D
            attackRequirement {
              assert opp.all.findAll{!it.numberOfDamageCounters}
            }
            onAttack {
              damage 30, opp.all.findAll{!it.numberOfDamageCounters}.select()
            }
          }
          move "Toxic Cloud", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                apply POISONED
                extraPoison 1
               }
            }
          }

        };
      case STARAPTOR_16:
        return evolution (this, from:"Staravia", hp:HP100, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Accelerative Dive", {
            text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all damage done to Staraptor by attacks (both yours and your opponent’s) until the end of your next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                //TODO: preventAllDamageNextTurn() won't cut it here sadly.
                preventAllDamageNextTurn()
              }
            }
          }
          move "Brave Heart", {
            text "100 damage. Flip a coin. If tails, Staraptor does 100 damage to itself."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 100
              flip 1, {}, {damage 100, self}
            }
          }

        };
      case TORTERRA_17:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { apply PARALYZED }
            }
          }
          move "Leaf Storm", {
            text "60 damage. Remove 2 damage counters from each of your [G] Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 60
              my.all.findAll{it.types.contains(G)}.each{heal 20, it}
            }
          }

        };
      case AZUMARILL_18:
        return evolution (this, from:"Marill", hp:HP080, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Defense Curl", {
            text "Flip a coin. If heads, prevent all damage done to Azumarill during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip{preventAllDamageNextTurn()}
            }
          }
          move "Bubble Pump", {
            text "40+ damage. If Azumarill has 3 or more Energy attached to it, this attack does 40 damage plus 20 more damage. If Azurill is anywhere under Azumarill, flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 40
              if(self.cards.energyCount(W) >= 3){
                damage 20
              }
              if (self.getPokemonCards().findAll {it.name.contains("Azurill")})
                flip { apply PARALYZED }
            }
          }
        };
      case BEAUTIFLY_19:
        return evolution (this, from:"Silcoon", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              whirlwind()
            }
          }
          move "Giga Drain", {
            text "50 damage. After your attack, remove from Beautifly the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              removeDamageCounterEqualToDamageDone()
            }
          }

        };
      case BIBAREL_20:
        return evolution (this, from:"Bidoof", hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Rest", {
            text "Remove all Special Conditions and 4 damage counters from Bibarel. Bibarel is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              clearSpecialCondition(self)
              heal 40, self
              apply ASLEEP, self
            }
          }
          move "Take Down", {
            text "60 damage. Bibarel does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              damage 10, self
            }
          }

        };
      case CARNIVINE_21:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Swallow Up", {
            text "30 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Carnivine. If the Defending Pokémon has fewer remaining HP than Carnivine’s, this attack does 60 damage instead."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              if(defending.getRemainingHP() < self.getRemainingHP())
                damage 30
            }
          }
          move "Wring Out", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                apply PARALYZED
                discardDefendingEnergy()
              }
            }
          }

        };
      case CLEFABLE_22:
        return evolution (this, from:"Clefairy", hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Double Slap", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 30 }
            }
          }
          move "Metronome", {
            text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy cost. (You must still do anything else in order to use that attack.) Clefable performs that attack."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              //TODO: Maybe generalize into a metronome() or exMetronome() method? Taken from FRLG CLEFABLE_EX_106
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              //
              // [Temporary LV.X workaround]
              if (defending.topPokemonCard.cardTypes.is(CardType.LEVEL_UP)){
                //Only 3 LV.Xs right now, all stage 2 so this should do
                def tpc = defending.cards.find{car -> car.cardTypes.is(STAGE2) && car != defending.topPokemonCard}
                moveList.addAll(tpc.moves)
                labelList.addAll(tpc.moves.collect{it.name})
              }
              // [End of LV.X workaround] TODO: Remove this when no longer needed
              //

              def move=choose(moveList, labelList)
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }

        };
      case DRAPION_23:
        return evolution (this, from:"Skorupi", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
          move "Poison Claws", {
            text "50 damage. The Defending Pokémon is now Poisoned."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 50
              apply POISONED
            }
          }

        };
      case DRIFBLIM_24:
        return evolution (this, from:"Drifloon", hp:HP080, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Wind Wave", {
            text "Search your discard pile for up to 5 in any combination of Pokémon and Supporter cards. Show them to your opponent and shuffle them into your deck."
            energyCost C
            attackRequirement {}
            onAttack {
              def tar = my.discard.findAll{it.cardTypes.is(SUPPORTER) || it.cardTypes.is(POKEMON)}
              tar.select(min: 0, max: 5,"Choose up to 5 in any combination of Pokémon and Supporter cards to put back into your deck").moveTo(my.deck)
              shuffleDeck()
            }
          }
          move "Explosive Smoke", {
            text "60 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent’s). (Don’t apply Weakness and Resistance for Benched Pokémon.)."
            energyCost P, P, P
            attackRequirement {}
            onAttack {
              damage 60
              all.each {
                if (it.benched) {
                  damage 10, it
                }
              }
            }
          }

        };
      case DUSTOX_25:
        return evolution (this, from:"Cascoon", hp:HP120, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          move "Stun Spore", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {apply PARALYZED}
            }
          }
          move "Toxic Dust", {
            text "50 damage. The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              apply POISONED
              extraPoison 1
            }
          }

        };
      case FLOATZEL_26:
        return evolution (this, from:"Buizel", hp:HP090, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Screw Tail", {
            text "30 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {discardDefendingEnergy()}
            }
          }
          move "Water Gun", {
            text "40+ damage. Does 40 damage plus 20 more damage for each [W] Energy attached to Floatzel but not used to pay for this attack’s Energy cost. You can’t add more than 40 damage in this way."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 40
              extraEnergyDamage(2,hp(20),W,thisMove)
            }
          }

        };
      case GENGAR_27:
        return evolution (this, from:"Haunter", hp:HP110, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS30
          resistance C, MINUS20
          move "Life Drain", {
            text "Flip a coin. If heads, put damage counters on the Defending Pokémon until it is 10 HP away from being Knocked Out."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                directDamage defending.remainingHP.value - 10, defending
              }
            }
          }
          move "Shadow Dance", {
            text "Put 4 damage counters on your opponent’s Pokémon in any way you like. Then, switch Gengar with 1 of your Benched Pokémon."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              def eff = delayed {
                before KNOCKOUT, {
                  prevent()
                }
              }

              4.times{ directDamage 10, opp.all.select("Put 1 damage counter to which pokémon? ${it}/4 counters placed") }

              if (my.bench) {
                sw self, my.bench.select("Select your new active.")
              }

              eff.unregister()
              checkFaint()
            }
          }

        };
      case HERACROSS_28:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Pitch", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              whirlwind()
            }
          }
          move "Horn Slash", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 30
              flip { damage 30 }
            }
          }

        };
      case HIPPOWDON_29:
        return evolution (this, from:"Hippopotas", hp:HP110, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Vacuum Up", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              cantRetreat defending
            }
          }
          move "Sand Eject", {
            text "60 damage. During your next turn, if an attack does damage to the Defending Pokémon (after applying Weakness and Resistance), that attack does 40 more damage."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              //TODO: Could be generalized into a method (adapted from LM DUSTOX_EX_86). Do some other cards use a similar effect under a different attack name/description?
              afterDamage{
                targeted (defending){
                  bc "During ${my.owner.getPlayerUsername(bg)}'s next turn, if an attack does damage to the Defending ${defending} that attack will do 40 more damage (after W/R). (This effect can be removed by evolving or benching ${defending}.)"
                  def pcs = defending
                  delayed {
                    before APPLY_ATTACK_DAMAGES, {
                      bg.dm().each{
                        if(it.to == pcs && it.notNoEffect && it.dmg.value && bg.currentTurn == self.owner) {
                          bc "Sand Eject +40"
                          it.dmg += hp(40)
                        }
                      }
                    }
                    after FALL_BACK, pcs, {unregister()}
                    after EVOLVE, pcs, {unregister()}
                    after DEVOLVE, pcs, {unregister()}
                    unregisterAfter 3
                  }
                }
              }
            }
          }

        };
      case LOPUNNY_30:
        return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Healing Wish", {
            text "Flip a coin until you get tails. Remove a number of damage counters equal to the number of heads from 1 of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.all.findAll { it.numberOfDamageCounters }: "No damaged Pokemon"
            }
            onAttack {
              def healAmount = 0
              flipUntilTails { healAmount += 10 }
              if (healAmount && my.all.findAll { it.numberOfDamageCounters }) {
                def pcs = my.all.findAll { it.numberOfDamageCounters }.select()
                heal healAmount, pcs
              }
            }
          }
          move "Flop", {
            text "30 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) You may switch Lopunny with 1 of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench)
                damage 20, opp.bench.select()
              afterDamage {
                switchYourActive(may: true)
              }
            }
          }

        };
      case MACHAMP_31:
        return evolution (this, from:"Machoke", hp:HP130, type:FIGHTING, retreatCost:3) {
          weakness P, PLUS30
          move "Revenge", {
            text "20+ damage. If any of your Pokémon were Knocked Out by damage from an opponent’s attack during his or her last turn, this attack does 20 damage plus 50 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
              if(my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1) damage 50
            }
          }
          move "Dynamic Punch", {
            text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 30 more damage and the Defending Pokémon is now Confused."
            energyCost F, F, F
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                damage 30
                apply CONFUSED
              }
            }
          }
        };
      case MEDICHAM_32:
        return evolution (this, from:"Meditite", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS20
          move "Force Palm", {
            text "Count the number of damage counters on Medicham. Put that many damage counters on 1 of your opponent’s Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              directDamage 10 * self.numberOfDamageCounters, opp.all.select()
            }
          }
          move "Spinning Kick", {
            text "80 damage. Medicham does 20 damage to itself."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 80
              damage 20, self
            }
          }

        };
      case MUNCHLAX_33:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
            actionA {
              checkCanBabyEvolve("Snorlax", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Snorlax", self)
            }
          }
          move "Heave", {
            text "30× damage. Discard 2 cards from your hand. (If you can’t discard 2 cards, this attack does nothing.) Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost C
            attackRequirement {
              assert my.hand.size() >= 2 : "You can’t discard 2 cards from your hand, so you can't use this attack."
            }
            onAttack {
              my.hand.select(count:2,"Discard 2 cards from your hand.").discard()
              flip 2, { damage 30 }
            }
          }

        };
      case NOCTOWL_34:
        return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "See Beyond", {
            text "Choose a card from your hand and put it as a Prize card face up. Then, choose 1 of your face-down Prize cards without looking and put it into your hand. This attack does nothing if all of your Prize cards are face up."
            energyCost C
            attackRequirement {
              assert my.prizeCardSet.faceDownCards : "All prizes are face up"
            }
            onAttack {
              def newPrize = my.hand.select(hidden: false, "Card to put into Prizes").first()

              def tar = my.prizeCardSet.faceDownCards.select(hidden: true, "Choose a Prize card to replace with one in your hand.").first()
              my.hand.add(tar)

              def indexOfOldPrize = my.prizeCardSet.indexOf(tar)
              my.prizeCardSet.set(indexOfOldPrize, newPrize)
              my.prizeCardSet.setVisible(newPrize, true)
              my.hand.remove(newPrize)
            }
          }
          move "Extrasensory", {
            text "30+ damage. If you have the same number of cards in your hand as your opponent, this attack does 30 damage plus 50 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(my.hand.size() == opp.hand.size()) damage 50
            }
          }

        };
      case PACHIRISU_35:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Minor Errand-Running", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              //TODO: Convert this attack effect into a method, used in multiple gen 3/4 cards
              my.deck.search(max : 1, "Select a basic Energy card.", cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Thunder Jolt", {
            text "20 damage. Flip a coin. If tails, Pachirisu does 10 damage to itself."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              flip 1, {}, {damage 10, self}
            }
          }

        };
      case PURUGLY_36:
        return evolution (this, from:"Glameow", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "High Hat", {
            text "Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost C
            attackRequirement {}
            onAttack {
              discardRandomCardFromOpponentsHand()
            }
          }
          move "Body Slam", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {apply PARALYZED}
            }
          }

        };
      case SNORLAX_37:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS20
          move "Block", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              cantRetreat defending
            }
          }
          move "Ease Up", {
            text "40+ damage. Snorlax is now Asleep. If Snorlax is evolved from Munchlax, this attack does 40 damage plus 30 more damage."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if (self.getPokemonCards().findAll {it.name.contains("Munchlax")}) damage 30
              apply ASLEEP, self
            }
          }

        };
      case STEELIX_38:
        return evolution (this, from:"Onix", hp:HP110, type:METAL, retreatCost:4) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Slam", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost M
            attackRequirement {}
            onAttack {
              flip 2, { damage 30 }
            }
          }
          move "Metal Slash", {
            text "100 damage. Steelix can’t attack during your next turn."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 100
              cantAttackNextTurn self
            }
          }

        };
      case VESPIQUEN_39:
        return evolution (this, from:"Combee", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Leaf Honey", {
            text "Discard a [G] Energy attached to Vespiquen and remove all damage counters from 1 of your Benched [G] Pokémon."
            energyCost G
            attackRequirement { my.bench.findAll{it.types.contains(G) && it.numberOfDamageCounters} }
            onAttack {
              discardSelfEnergy G
              def pcs = my.bench.findAll{it.types.contains(G) && it.numberOfDamageCounters}.select()
              heal pcs.numberOfDamageCounters*10, pcs
            }
          }
          move "Attack Order", {
            text "Does 10 damage times the number of [G] Pokémon in play (both yours and your opponent’s)."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 10 * (
                my.all.findAll{it.types.contains(G)}.size() + opp.all.findAll{it.types.contains(G)}.size()
              )
            }
          }

        };
      case WEAVILE_40:
        return evolution (this, from:"Sneasel", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Nasty Plot", {
            text "Search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost D
            attackRequirement {
              assert my.deck : "There are no more cards in your deck."
            }
            onAttack {
              my.deck.select().moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Dark Pulse", {
            text "10× damage. Does 10 damage times the total amount of [D] Energy attached to all of your Pokémon."
            energyCost D, D, D
            attackRequirement {}
            onAttack {
              my.all.each{damage 10*it.cards.energyCount(D)}
            }
          }

        };
      case WOBBUFFET_41:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          move "Countercharge", {
            text "Flip a coin. If heads, move all damage counters from Wobbuffet to the Defending Pokémon."
            energyCost P, C
            attackRequirement {
              assert self.numberOfDamageCounters
            }
            onAttack {
              flip {
                targeted (defending) {
                  //TODO: Solve this not being blocked by stuff like Metal Goggles (blockers of "putting damage counters"). Problem also affects Xerneas-GX.
                  defending.damage += self.damage
                  self.damage = hp(0)
                  bc "Moved damage counters from $self to $defending."
                }
              }
            }
          }

        };
      case WYNAUT_42:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Wobbuffet from your hand onto Wynaut (this counts as evolving Wynaut) and remove all damage counters from Wynaut."
            actionA {
              checkCanBabyEvolve("Wobbuffet", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Wobbuffet", self)
            }
          }
          move "Astonish", {
            text "Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost ()
            attackRequirement {}
            onAttack {
              astonish()
            }
          }

        };
      case BUDEW_43:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Roselia from your hand onto Budew (this counts as evolving Budew) and remove all damage counters from Budew."
            actionA {
              checkCanBabyEvolve("Roselia", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Roselia", self)
            }
          }
          move "Errand-Running", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search("Search your deck for a Trainer card (excluding Supporter and Stadium cards)", {it.cardTypes.is(ITEM)}).moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case CASCOON_44:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          move "Harden", {
            text "During your opponent’s next turn, if Cascoon would be damaged by an attack, prevent that attack’s damage done to Cascoon if that damage is 30 or less."
            energyCost G
            attackRequirement {}
            onAttack {
              //TODO: Check for a harden() method in Statics
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 30 && it.notNoEffect) {
                      bc "Harden prevents that damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,self, {unregister()}
                after DEVOLVE,self, {unregister()}
                after FALL_BACK,self, {unregister()}
              }
            }
          }
          move "Gooey Thread", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat defending
            }
          }

        };
      case CHERRIM_45:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Worry Seed", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }
          move "Magical Leaf", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage and remove 3 damage counters from Cherrim."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                damage 20
                heal 30, self
              }
            }
          }

        };
      case DRIFLOON_46:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Blowing Wind", {
            text "Flip a coin. If heads, put 1 of your Benched Pokémon and all cards attached to on top of your deck. Shuffle your deck afterward."
            energyCost P
            attackRequirement {
              assert my.bench.notEmpty
            }
            onAttack {
              flip {
                def pcs = my.bench.select()
                pcs.cards.moveTo(my.deck)
                shuffleDeck()
                removePCS(pcs)
              }
            }
          }
          move "Ominous Wind", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                apply CONFUSED
                cantRetreat defending
              }
            }
          }

        };
      case DUSCLOPS_47:
        return evolution (this, from:"Duskull", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Roam", {
            text "Flip a coin. If heads, put 2 damage counters on each of your opponent’s Pokémon. If tails, put 2 damage counters on 1 of your Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              flip 1,{
                opp.all.each{ directDamage 20, it }
              },{
                directDamage 20, my.all.select("Select a Pokémon to put 2 damage counters on.")
              }
            }
          }
          move "Gravity Wave", {
            text "30 damage. Does 10 damage to each of your opponent’s Benched Pokémon that doesn’t have a Retreat Cost. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 30
              opp.bench.findAll{ it.retreatCost == 0 }.each{damage 10, it}
            }
          }

        };
      case ELEKID_48:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Electabuzz from you hand onto Elekid (this counts as evolving Elekid) and remove all damage counters from Elekid."
            actionA {
              checkCanBabyEvolve("Electabuzz", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Electabuzz", self)
            }
          }
          move "Outlet", {
            text "Search your deck for a [L] Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max : 1, "Select a [L] Energy card.", basicEnergyFilter(L)).moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case GROTLE_49:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Synthesis", {
            text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck
            }
            onAttack {
              attachEnergyFrom(basic:1, type:G, my.deck, my.all)
              shuffleDeck()
            }
          }
          move "Cut", {
            text "50 damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case HAUNTER_50:
        return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Dream Eater", {
            text "60 damage. If the Defending Pokémon is not Asleep, this attack does nothing."
            energyCost P, P
            attackRequirement {assert defending.isSPC(ASLEEP) : "The Defending Pokémon is not Asleep."}
            onAttack {
              damage 60
            }
          }

        };
      case HIPPOPOTAS_51:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Sand Attack", {
            text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              sandAttack(thisMove)
            }
          }

        };
      case LUXIO_52:
        return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Fasten Claws", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }
          move "Thunder Fang", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 30
              flip {apply PARALYZED}
            }
          }

        };
      case MACHOKE_53:
        return evolution (this, from:"Machop", hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS20
          move "Karate Chop", {
            text "40- damage. Does 40 damage minus 10 damage for each damage counter on Machoke."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 40 - 10 * self.numberOfDamageCounters
            }
          }
          move "Seismic Toss", {
            text "60 damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case MAGNETON_54:
        return evolution (this, from:"Magnemite", hp:HP070, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Tri Attack", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 3, {damage 20}
            }
          }
          move "Magnetic Ray", {
            text "40 damage. Before doing damage, you may choose 1 of your opponent’s Benched Pokémon that has any Energy attached to it and switch that Pokémon with 1 of the Defending Pokémon."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              //TODO: Generalize on Statics, with "may" and "filter" params. See "Drag Off" (BLAZIKEN_EX_90 in CG) as a similar attack for base.
              def target = defending
              def tar = opp.bench.findAll{ it.cards.energyCount() }
              if (tar && confirm("Before doing damage, you may choose 1 of your opponent’s Benched Pokémon that has any Energy attached to it and switch that Pokémon with 1 of the Defending Pokémon.")) {
                target = tar.select("Select the new active")
                sw defending, target
              }
              damage 40, target
            }
          }

        };
      case MANTYKE_55:
        return basic (this, hp:HP040, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Mantine from your hand onto Mantyke (this counts as evolving Mantyke) and remove all damage counters from Mantyke."
            actionA {
              checkCanBabyEvolve("Mantine", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Mantine", self)
            }
          }
          move "Call for Friends", {
            text "Search your deck for a [W] Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              my.deck.search("Choose a [W] Basic Pokémon to put into your hand.",{it.cardTypes.is(BASIC) && it.types.contains(W)}).showToOpponent("Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case MONFERNO_56:
        return evolution (this, from:"Chimchar", hp:HP070, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Flame Dance", {
            text "30 damage. Search your discard pile for a [R] Energy card and attach it to Monferno."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                attachEnergyFrom(type: R, my.discard, self)
              }
            }
          }
          move "Fury Swipes", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 3, {damage 20}
            }
          }

        };
      case NUZLEAF_57:
        return evolution (this, from:"Seedot", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Dirty Trick", {
            text "Flip a coin. If heads, discard an Energy card attached to 1 of your opponent’s Pokémon."
            energyCost D
            attackRequirement {}
            onAttack {
              flip {
                //TODO: Check Statics for a general method to do this, beyond the coinflip.
                def tar = opp.all.findAll {it.cards.energyCount(C)}
                if(tar) {
                  def pcs = tar.select("Discard energy from")
                  targeted (pcs, ATTACK) {
                    pcs.cards.filterByType(ENERGY).select("Discard").discard()
                  }
                }
              }
            }
          }
          move "Razor Wind", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost D, D
            attackRequirement {}
            onAttack {
              flip {damage 40}
            }
          }

        };
      case PRINPLUP_58:
        return evolution (this, from:"Piplup", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Aqua Shower", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {}
            onAttack {
              opp.all.each{
                damage 10, it
              }
            }
          }
          move "Brine", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 40 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W
            attackRequirement {
              assert opp.all.findAll{it.numberOfDamageCounters}
            }
            onAttack {
              damage 40, opp.all.findAll{it.numberOfDamageCounters}.select()
            }
          }

        };
      case RAPIDASH_59:
        return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Overrun", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }
          move "Blaze Up", {
            text "50 damage. Flip a coin. If tails, discard a [R] Energy attached to Rapidash and this attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 50
              flip 1, {}, {
                discardSelfEnergy R
                opp.bench.each{damage 10, it}
              }
            }
          }

        };
      case RHYDON_60:
        return evolution (this, from:"Rhyhorn", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Storm Up", {
            text "30+ damage. If there is any Stadium card in play, this attack does 30 damage plus 20 more damage. Discard that Stadium card."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              if (bg.stadiumInfoStruct) {
                damage 20
                afterDamage {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
          move "Crash Impact", {
            text "60 damage. Rhydon does 10 damage to itself. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
              damage 10, self
              afterDamage{
                //TODO: Remove "opp.active == pcs && ", once KOs aren't checked during attack.
                if (opp.active == pcs && opp.bench) {
                  sw opp.active, opp.bench.oppSelect("Choose your new Active Pokémon.")
                }
              }
            }
          }

        };
      case RIOLU_61:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Wild Kick", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              flip {damage 30}
            }
          }

        };
      case SEAKING_62:
        return evolution (this, from:"Goldeen", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Seaking."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10 * self.numberOfDamageCounters
            }
          }
          move "Horn Drill", {
            text "50 damage. "
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case SILCOON_63:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          move "Harden", {
            text "During your opponent’s next turn, If Silcoon would be damaged by an attack, prevent that attack’s damage done to Silcoon if that damage is 30 or less."
            energyCost G
            attackRequirement {}
            onAttack {
              //TODO: Check for a harden() method in Statics
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 30 && it.notNoEffect) {
                      bc "Harden prevents that damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,self, {unregister()}
                after DEVOLVE,self, {unregister()}
                after FALL_BACK,self, {unregister()}
              }
            }
          }
          move "Entangling String", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {cantAttackNextTurn defending}
            }
          }

        };
      case STARAVIA_64:
        return evolution (this, from:"Starly", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Whirlwind", {
            text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              whirlwind()
            }
          }
          move "Clutch", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat defending
            }
          }

        };
      case UNOWN_A_65:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "ANALYZE", {
            text "Once during your turn (before your attack), if Unown A is on your Bench, you may look at the top 2 cards of your deck and put them back on top of your deck in any order."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on the Bench"
              assert my.deck
              powerUsed()
              def list=rearrange(deck.subList(0,2), "Rearrange top 2 cards in your deck")
              deck.setSubList(0, list)
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case UNOWN_B_66:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "BOUNCE", {
            text "Once during your turn (before your attack), if Unown B is on your Bench, you may flip a coin. If heads, discard all cards attached to any 1 of your Unown and shuffle that Pokémon back into your deck."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on the Bench"
              powerUsed()
              flip {
                def pcs = my.all.findAll{it.name.contains("Unown")}.select("Choose an Unown to shuffle back into your deck. All cards attached to it will be discarded.")
                pcs.cards.getExcludedList(pcs.topPokemonCard).discard()
                moveCard(pcs.topPokemonCard, my.deck)
                shuffleDeck()
                removePCS(pcs)
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case UNOWN_C_67:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "CALL", {
            text "Once during your turn , if Unown C is on your Bench, you may flip a coin. If heads, search your deck for any 1 Unown and put it onto your Bench. Shuffle your deck afterward."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on the Bench"
              assert my.bench.notFull : "Your bench is full"
              powerUsed()
              flip {
                deck.search (count: 1,{it.name.contains("Unown")}).each {
                  deck.remove(it)
                  benchPCS(it)
                }
                shuffleDeck()
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case UNOWN_D_68:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "DRAW", {
            text "Once during your turn , if Unown D is on your Bench, you may flip a coin. If heads, each player may draw a card. (You draw your card first.)"
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on the Bench"
              powerUsed()
              flip {
                if (confirm("Do you want to draw a card?"))
                  draw 1
                if (confirm("Your opponent used $self's Poké-Power \"DRAW\". Do you want to draw a card?"))
                  draw 1, TargetPlayer.OPPONENT
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case AZURILL_69:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Marill from your hand onto Azurill (this counts a evolving Azurill) and remove all damage counters from Azurill."
            actionA {
              checkCanBabyEvolve("Marill", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Marill", self)
            }
          }
          move "Delivery", {
            text "Put any 1 card from your discard pile into your hand."
            energyCost ()
            attackRequirement { assert my.discard : "Discard is empty"}
            onAttack {
              my.discard.select().moveTo(my.hand)
            }
          }

        };
      case BIDOOF_70:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Amnesia", {
            text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              amnesia delegate
            }
          }
          move "Scavenge", {
            text "Search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(ITEM) : "There are no Trainer [Item] cards in your discard pile."
            }
            onAttack {
              my.discard.filterByType(ITEM).select("Choose a Trainer [Item] card to put into your hand.").moveTo(my.hand)
            }
          }

        };
      case BONSLY_71:
        return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Sudowoodo from your hand onto Bonsly (this counts as evolving Bonsly) and remove all damage counters from Bonsly."
            actionA {
              checkCanBabyEvolve("Sudowoodo", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Sudowoodo", self)
            }
          }
          move "Fake Tears", {
            text "Flip a coin. If heads, your opponent can’t play any Trainer cards from his or her hand during your opponent’s next turn, and any damage done to Bonsly by attacks is reduced by 30 (after applying Weakness and Resistance)"
            energyCost ()
            attackRequirement {}
            onAttack {
              flip {
                reduceDamageNextTurn(hp(30),thisMove)
                //This could be generalized into a Statics method.
                delayed {
                  before PLAY_TRAINER, {
                    if (ef.cardToPlay.cardTypes.is(ITEM) && bg.currentTurn == self.owner.opposite) {
                      wcu "Fake Tears prevents you from playing Trainer [Item] cards."
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }

        };
      case BUIZEL_72:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Splash About", {
            text "10+ damage. If Buizel has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              if (self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 10
              }
            }
          }

        };
      case BUNEARY_73:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Splash", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Jump Kick", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }

        };
      case CHATOT_74:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Me First", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Tone-Deaf", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply CONFUSED }
            }
          }

        };
      case CHERUBI_75:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sleep Powder", {
            text "The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Leech Seed", {
            text "20 Damage. If this attack does any damage to the Defending Pokémon (after applying Weakness and Resistance), remove 1 damage counter from Cherubi."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              delayed (priority: LAST){ //Taken from BS1 BULBASAUR
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.dm().find{it.to == defending && it.from == self && it.dmg.value}) {
                    heal 10, self
                  }
                }
                unregisterAfter 1
              }
            }
          }

        };
      case CHIMCHAR_76:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Scratch", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Ember", {
            text "30 damage. Flip a coin. If tails, discard a [R] Energy attached to Chimchar."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                flip 1, {}, {discardSelfEnergy(R)}
              }
            }
          }

        };
      case CLEFAIRY_77:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Sing", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Moon Impact", {
            text "20+ damage. If Clefairy is evolved from Cleffa, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if (self.getPokemonCards().findAll {it.name.contains("Cleffa")}){
                damage 20
              }
            }
          }

        };
      case CLEFFA_78:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Clefairy from your hand onto Cleffa (this counts as evolving Cleffa) and remove all damage counters from Cleffa."
            actionA {
              checkCanBabyEvolve("Clefairy", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Clefairy", self)
            }
          }
          move "Eeek", {
            text "Draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              draw 1
            }
          }

        };
      case COMBEE_79:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Soliciting Nectar", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. The new Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              def target = opp.bench.select("Select the new Active Pokémon.")
              if ( sw2(target) ) { apply ASLEEP, target }
            }
          }
          move "Gust", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case DUSKULL_80:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Disable", {
            text "Flip a coin. If heads, choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { amnesia delegate }
            }
          }
          move "Night Shade", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }

        };
      case ELECTABUZZ_81:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Thunderpunch", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, Electabuzz does 10 damage to itself."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {damage 10}, {damage 10, self}
            }
          }
          move "Shock Wave", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If Electabuzz is evolved from Elekid, this attack does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 20
              flip {apply PARALYZED}
              if (self.getPokemonCards().findAll {it.name.contains("Elekid")} && opp.bench){
                damage 20, opp.bench.select()
              }
            }
          }

        };
      case GASTLY_82:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Pain Payback", {
            text "Move 1 damage counter from Gastly to 1 of your opponent’s Pokémon."
            energyCost P
            attackRequirement {
              assert self.numberOfDamageCounters
            }
            onAttack {
              //TODO. Won't work properly, see Wobbuffet.
              self.damage -= hp(10)
              opp.all.select().damage += hp(10)
            }
          }

        };
      case GLAMEOW_83:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Charm", {
            text "During your opponent’s next turn, any damage done by attacks from the Defending Pokémon is reduced by 20 (before applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Pose", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip {damage 30}
            }
          }

        };
      case GOLDEEN_84:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Horn Attack", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Take Down", {
            text "30 damage. Goldeen does 10 damage to itself."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case HOOTHOOT_85:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Kick Shot", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip {damage 30}
            }
          }

        };
      case MACHOP_86:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS10
          move "Low Kick", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MAGNEMITE_87:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Metal Sound", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost M
            attackRequirement {}
            onAttack {
              flip { apply CONFUSED }
            }
          }
          move "Resonance", {
            text "20+ damage. If the Defending Pokémon is Confused, this attack does 20 damage plus 20 more damage."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.active.isSPC(CONFUSED)) damage 20
            }
          }

        };
      case MARILL_88:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Rollout", {
            text "10+ damage. If Marill is evolved from Azurill, this attack does 10 damage plus 20 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if (self.getPokemonCards().findAll {it.name.contains("Azurill")})
                damage 20
            }
          }
          move "Splashing Turn", {
            text "20 damage. Switch Marill with 1 of your Benched Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              switchYourActive()
            }
          }

        };
      case MEDITITE_89:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Detect", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Meditite during your opponent’s next turn."
            energyCost F
            attackRequirement {}
            onAttack {
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Meditate", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 10 + 10 * defending.numberOfDamageCounters
            }
          }

        };
      case MIME_JR__90:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Mr. Mime from your hand onto Mime Jr. (this counts as evolving Mime Jr.) and remove all damage counters from Mime Jr."
            actionA {
              checkCanBabyEvolve("Mr. Mime", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Mr. Mime", self)
            }
          }
          move "Mime", {
            text "Shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
            energyCost P
            attackRequirement {}
            onAttack {
              my.hand.moveTo(hidden:true,my.deck)
              shuffleDeck()
              draw opp.hand.size()
            }
          }

        };
      case MISDREAVUS_91:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Astonish", {
            text "Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C
            attackRequirement {}
            onAttack {
              astonish()
            }
          }
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }

        };
      case ONIX_92:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          move "Tunneling", {
            text "Choose up to 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.) Onix can’t attack during your next turn."
            energyCost F
            attackRequirement {}
            onAttack {
              if (opp.bench) {
                multiSelect(opp.bench, 2).each{
                  targeted(it){
                    damage 10, it
                  }
                }
              }
              cantAttackNextTurn self
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case PIPLUP_93:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Peck", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Water Splash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }

        };
      case PONYTA_94:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Flame Tail", {
            text "30 damage. "
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case RHYHORN_95:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Horn Attack", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Take Down", {
            text "30 damage. Rhyhorn does 10 damage to itself."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case ROSELIA_96:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Toxic Spikes", {
            text "The Defending Pokémon is now Poisoned. If Roselia is evolved from Budew, this attack does 10 damage to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              apply POISONED
              if (self.getPokemonCards().findAll{it.name.contains("Budew")})
                damage 10
            }
          }
          move "Sweet Spike", {
            text "10 damage. The Defending Pokémon is now Asleep. Remove 2 damage counters from 1 of your Pokémon."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 10
              apply ASLEEP
              heal 20, my.all.select()
            }
          }

        };
      case SEEDOT_97:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Bide", {
            text "Flip a coin. If heads, during your opponent’s next turn, if Seedot would be Knocked Out by damage from an attack, Seedot is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost C
            attackRequirement {}
            onAttack {
              //This *definitely* can be added to statics, matches multiple attacks in DP and SM eras.
              flip {
                delayed {
                  before KNOCKOUT, self, {
                    if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                      self.damage = self.fullHP - hp(10)
                      bc "$self endured the hit!"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()} //This attack could be copied by an evolution.
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
          move "Rollout", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case SHINX_98:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Spark", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }

        };
      case SKORUPI_99:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Poison Sting", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }
          move "Pin Missile", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 4, {damage 10}
            }
          }

        };
      case SNEASEL_100:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Double Slap", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to the Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost D, C
            attackRequirement {}
            onAttack {
              swiftDamage(20, opp.all.select())
            }
          }

        };
      case STARLY_101:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Gust", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 20 }
            }
          }

        };
      case STUNKY_102:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Severe Gas", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 10
              apply POISONED
            }
          }

        };
      case TURTWIG_103:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Tackle", {
            text "10 damage."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Razor Leaf", {
            text "20 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case WURMPLE_104:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Needling Sting", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
          move "String Shot", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {apply PARALYZED}
            }
          }

        };
      case DOUBLE_FULL_HEAL_105:
        return copy (Sandstorm.DOUBLE_FULL_HEAL_86, this);
      case ENERGY_RESTORE_106:
        return copy (Expedition.ENERGY_RESTORE_141, this);
      case ENERGY_SWITCH_107:
        return copy(FireRedLeafGreen.ENERGY_SWITCH_90, this);
      case NIGHT_POKEMON_CENTER_108:
        return itemCard (this) {
          text "Choose 1 of your Pokémon. Flip 2 coins. If both are heads, remove all damage counters from that Pokémon. If both are tails, discard all Energy cards attached to that Pokémon."
          onPlay {
            def pcs = my.all.findAll{it.numberOfDamageCounters || it.cards.energyCount()}.select("Select 1 of you Pokémon with either damage counters, energy attached, or both.")
            flip 1, {
              if (pcs.numberOfDamageCounters) healAll pcs
            }, {
              pcs.cards.filterByType(ENERGY).discard()
            }
          }
          playRequirement {
            assert my.all.findAll{it.numberOfDamageCounters || it.cards.energyCount()} : "You have no Pokémon with either damage counters, energy attached, or both."
          }
        };
      case PLUSPOWER_109:
      // TODO this has to be implemented here again because base set version has a multiplying bug (also, this print increases before W/R when the old prints do it after W/R - starg)
      return itemCard (this) {
        text "Attach PlusPower to 1 of your Pokémon. Discard this card at the end of your turn.\nIf the Pokémon PlusPower is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay {reason->
          def pcs = my.active
          if (my.bench) {
            pcs = my.all.select("Which Pokémon will you attach $thisCard to?")
          }
          pcs.cards.add(thisCard)
          my.hand.remove(thisCard)

          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker == pcs) {
                bg.dm().each {
                  if (it.to.active && it.dmg.value) {
                    bc "PlusPower +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
            after DISCARD, {
              if(ef.card == thisCard){
                eff.unregister()
              }
            }
            before BETWEEN_TURNS, {
              discard thisCard
            }
            after REMOVE_FROM_PLAY, pcs, null, {
              if(ef.removedCards.contains(thisCard)) {
                eff.unregister()
              }
            }
          }
        }
      };
      case POKE_BALL_110:
      return itemCard (this) {
          text "Flip a coin. If heads, search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
            flip{
              my.deck.search(count: 1, "Select a Pokémon card", {it.cardTypes.is(POKEMON)}).moveTo(my.hand)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.deck: "There are no more cards in your deck."
          }
        };
      case POKEDEX_HANDY910IS_111:
        return basicTrainer (this) {
          text "Look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck."
          onPlay {
              def sel = my.deck.subList(0,2).select("Choose 1 card to put into your hand")
              my.deck.subList(0,2).getExcludedList(sel).moveTo(suppressLog: true, my.deck)
              sel.moveTo(hidden: true, my.hand)
          }
          playRequirement{
            assert my.deck : "There are no more cards in your deck."
          }
        };
      case PROFESSOR_ROWAN_112:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose 1 card in your hand and shuffle the rest of your cards into your deck. Then, draw 4 cards. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            def availCards = my.hand.getExcludedList(thisCard)
            def chosenCard = availCards.select("Choose a card to keep in your hand.")
            availCards.getExcludedList(chosenCard).moveTo(hidden:true, my.deck)
            shuffleDeck()
            draw 4
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) : "This is the only card in your hand."
          }
        };
      case RIVAL_113:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nReveal the top 5 cards of your deck. Your opponent choose 3 of those cards. Put those cards into your hand and put other 2 cards on top of your deck. Shuffle your deck afterward."
          onPlay {
            def cards = my.deck.subList(0,5)
            cards.showToMe("The top 5 cards of your deck.")
            cards.oppSelect(count:3,"The top 5 cards of your opponent's deck. Choose 3 of them to put in your opponent's hand. The rest will be shuffled back into their deck.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "There are no more cards in your deck."
          }
        };
      case SPEED_STADIUM_114:
        return stadium(this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player's turn, the player may flip a coin until he or she gets tails. For each heads, that player draws a card."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Speed Stadium") {
              assert my.deck : "There are no more cards in your deck."
              assert lastTurn != bg().turnCount : "Already used Stadium"
              bc "Used Speed Stadium"
              lastTurn = bg().turnCount

              flipUntilTails { draw 1 }
            }
          }
          onRemoveFromPlay{
            actions.each { bg.gm().unregisterAction(it) }
          }
        };
      case SUPER_SCOOP_UP_115:
        return copy (BlackWhite.SUPER_SCOOP_UP_103, this);
      case WARP_POINT_116:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this);
      case ENERGY_SEARCH_117:
        return copy(BlackWhite.ENERGY_SEARCH_93, this);
      case POTION_118:
        return copy(FireRedLeafGreen.POTION_101, this);
      case SWITCH_119:
        return copy(FireRedLeafGreen.SWITCH_102, this);
      case EMPOLEON_LV_X_120:
        //TODO: Find how to mark these cards as "LEVEL_UP" cards instead of evolutions.
        return evolution (this, from:"Empoleon", hp:HP140, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          globalAbility {Card thisCard->
            delayed {
              before EVOLVE, {
                if ( (ef.evolutionCard as Card) == thisCard && ["Piplup", "Prinplup"].contains(ef.pokemonToBeEvolved.name)  ) {
                  wcu "You cannot evolve ${ef.pokemonToBeEvolved} into $thisCard.name LV.X"
                  bc "[ERROR] Level-Up cards are not yet fully implemented, try to avoid using Rare Candy or Wally's Training as they will fail and be discarded with no use."
                  prevent()
                }
              }
              before PLAY_CARD, {
                if(ef.cardToPlay == thisCard){
                  def currentActive = thisCard.player.pbg.active
                  if (thisCard.predecessor != currentActive.name){
                    wcu "You can only level-up a ${thisCard.name} placed as your Active Pokémon"
                  } else if (currentActive.topPokemonCard.cardTypes.is(LEVEL_UP)) {
                    wcu "You can't level-up a ${thisCard.name} LV.X"
                  } else if (currentActive.turnCount >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was put in play during this turn."
                  } else if (currentActive.lastEvolved >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was evolved during this turn."
                  } else {
                    //All is good, evolve the active
                    evolve(currentActive, thisCard, PLAY_FROM_HAND)
                    bc "$currentActive is now LV.X!"
                  }
                  prevent()
                }
              }
            }
          }
          customAbility {
            //Temp workaround for Worlds 2007 format.
            //TODO: Remove this once Lv.X are properly implemented.
            getterA (GET_MOVE_LIST,self) {holder->
              for(card in holder.effect.target.cards.filterByType(POKEMON)){
                if(!card.cardTypes.is(LEVEL_UP) && card.name == self.name){
                  holder.object.addAll(card.moves)
                }
              }
            }
          }
          pokePower "Supreme Command", {
            text "Once during your turn (before your attack), you may choose up to 2 cards from your opponent’s hand without looking and put them face down next to the Defending Pokémon. (These cards are not in play or in your opponent’s hand.) At the end of your opponent’s next turn, return those cards to your opponent’s hand. This power can’t be used if Empoleon is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert opp.hand : "Your Opponent has no cards in their hand."
              powerUsed()

              def chosenCards = opp.hand.shuffledCopy().select(hidden: true, max: 2).showToOpponent("Cards randomly put aside by Supreme Command. They'll return to your hand at the end of your next turn.")
              def supremeCommandBundles = bg.em().retrieveObject("supremeCommandBundles")
              if (!supremeCommandBundles)
                supremeCommandBundles = [ : ]
              supremeCommandBundles.put(self.id, chosenCards)
              opp.hand.removeAll(chosenCards)
              bg.em().storeObject("supremeCommandBundles",supremeCommandBundles)

              delayed{
                  before BETWEEN_TURNS, {
                    if(bg().currentTurn == self.owner.opposite) {
                      def bundles = bg().em().retrieveObject("supremeCommandBundles")
                      if(bundles) {
                        self.owner.opposite.pbg.hand.addAll(bundles.get(self.id))
                        bc "Supreme Command's effect has ended, taken cards have been put back to their owner's hand."
                      }
                      unregister()
                    }
                  }
                }
            }
          }
          move "Hydro Impact", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon (Don’t apply Weakness and Resistance for Benched Pokémon.) Empoleon can’t attack during your next turn."
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 80, opp.all.select()
              cantAttackNextTurn self
            }
          }

        };
      case INFERNAPE_LV_X_121:
        return evolution (this, from:"Infernape", hp:HP120, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          def validPokemon
          globalAbility {Card thisCard->
            delayed {
              before EVOLVE, {
                if ( (ef.evolutionCard as Card) == thisCard && ["Chimchar", "Monferno"].contains(ef.pokemonToBeEvolved.name)  ) {
                  wcu "You cannot evolve ${ef.pokemonToBeEvolved} into $thisCard.name LV.X"
                  bc "[ERROR] Level-Up cards are not yet fully implemented, try to avoid using Rare Candy or Wally's Training as they will fail and be discarded with no use."
                  prevent()
                }
              }
              before PLAY_CARD, {
                if(ef.cardToPlay == thisCard){
                  def currentActive = thisCard.player.pbg.active
                  if (thisCard.predecessor != currentActive.name){
                    wcu "You can only level-up a ${thisCard.name} placed as your Active Pokémon"
                  } else if (currentActive.topPokemonCard.cardTypes.is(LEVEL_UP)) {
                    wcu "You can't level-up a ${thisCard.name} LV.X"
                  } else if (currentActive.turnCount >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was put in play during this turn."
                  } else if (currentActive.lastEvolved >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was evolved during this turn."
                  } else {
                    //All is good, evolve the active
                    evolve(currentActive, thisCard, PLAY_FROM_HAND)
                    bc "$currentActive is now LV.X!"
                  }
                  prevent()
                }
              }
            }
          }
          customAbility {
            //Temp workaround for Worlds 2007 format.
            //TODO: Remove this once Lv.X are properly implemented.
            getterA (GET_MOVE_LIST,self) {holder->
              for(card in holder.effect.target.cards.filterByType(POKEMON)){
                if(!card.cardTypes.is(LEVEL_UP) && card.name == self.name){
                  holder.object.addAll(card.moves)
                }
              }
            }
          }
          pokePower "Burning Head", {
            text "Once during your turn (before your attack), you may look at the top 3 cards of your deck, choose 1 of them, and put it into your hand. Discard the other 2 cards. This power can’t be used if Infernape is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "Your deck is empty."
              powerUsed()
              def cards = my.deck.subList(0,3)
              def moved = cards.select(count:1,"Choose a card to put in your hand. The rest will be discarded.").moveTo(my.hand)
              cards.removeAll(moved)
              cards.discard()
            }
          }
          move "Flare Up", {
            text "150 damage. Search your discard pile for 8 [R] Energy cards, show them to your opponent, and shuffle them into your deck. (This attack does nothing if you don’t have 8 [R] Energy cards in your discard pile.)"
            energyCost R, R
            attackRequirement {
              assert my.discard.filterByBasicEnergyType(R).size() >= 8 : "You don't have enough [R] Energy cards in your discard pile to use this attack."
            }
            onAttack {
              damage 150
              afterDamage {
                def fireInDiscard = my.discard.filterByBasicEnergyType(R)
                fireInDiscard.subList(0,Math.min(fireInDiscard.size(), 8)).moveTo(my.deck)
                shuffleDeck()
              }
            }
          }

        };
      case TORTERRA_LV_X_122:
        return evolution (this, from:"Torterra", hp:HP160, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          globalAbility {Card thisCard->
            delayed {
              before EVOLVE, {
                if ( (ef.evolutionCard as Card) == thisCard && ["Turtwig", "Grotle"].contains(ef.pokemonToBeEvolved.name)  ) {
                  wcu "You cannot evolve ${ef.pokemonToBeEvolved} into $thisCard.name LV.X"
                  bc "[ERROR] Level-Up cards are not yet fully implemented, try to avoid using Rare Candy or Wally's Training as they will fail and be discarded with no use."
                  prevent()
                }
              }
              before PLAY_CARD, {
                if(ef.cardToPlay == thisCard){
                  def currentActive = thisCard.player.pbg.active
                  if (thisCard.predecessor != currentActive.name){
                    wcu "You can only level-up a ${thisCard.name} placed as your Active Pokémon"
                  } else if (currentActive.topPokemonCard.cardTypes.is(LEVEL_UP)) {
                    wcu "You can't level-up a ${thisCard.name} LV.X"
                  } else if (currentActive.turnCount >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was put in play during this turn."
                  } else if (currentActive.lastEvolved >= bg.turnCount) {
                    wcu "You can't level-up a ${thisCard.name} that was evolved during this turn."
                  } else {
                    //All is good, evolve the active
                    evolve(currentActive, thisCard, PLAY_FROM_HAND)
                    bc "$currentActive is now LV.X!"
                  }
                  prevent()
                }
              }
            }
          }
          customAbility {
            //Temp workaround for Worlds 2007 format.
            //TODO: Remove this once Lv.X are properly implemented.
            getterA (GET_MOVE_LIST,self) {holder->
              for(card in holder.effect.target.cards.filterByType(POKEMON)){
                if(!card.cardTypes.is(LEVEL_UP) && card.name == self.name){
                  holder.object.addAll(card.moves)
                }
              }
            }
          }
          pokePower "Forest Murmurs", {
            text "Once during your turn (before your attack), if you have more Prize cards left than your opponent, you may choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. This power can’t be used if Torterra is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.prizeCardSet.size() > opp.prizeCardSet.size() : "You need to have more Prize cards left than your opponent in order to use this Poké-Power"
              assert opp.bench : "Your opponent has no benched Pokémon."
              powerUsed()
              def pcs = opp.bench.select('Choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon.')
              //TODO: This should switch the benched with the defending, not the other way around. Check against inmune to pokébody cards to see if this properly blocks only when the blocker is benched.
              sw opp.active, pcs, SRC_ABILITY
            }
          }
          move "Vigorous Dash", {
            text "100 damage. Does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Torterra does 30 damage to itself."
            energyCost G, G, G, C
            attackRequirement {}
            onAttack {
              damage 100
              if (opp.bench)
                damage 30, opp.bench.select()
              damage 30, self
            }
          }

        };
      case GRASS_ENERGY_123:
        return basicEnergy (this, GRASS);
      case FIRE_ENERGY_124:
        return basicEnergy (this, FIRE);
      case WATER_ENERGY_125:
        return basicEnergy (this, WATER);
      case LIGHTNING_ENERGY_126:
        return basicEnergy (this, LIGHTNING);
      case PSYCHIC_ENERGY_127:
        return basicEnergy (this, PSYCHIC);
      case FIGHTING_ENERGY_128:
        return basicEnergy (this, FIGHTING);
      case DARKNESS_ENERGY_129:
        return basicEnergy (this, DARKNESS);
      case METAL_ENERGY_130:
        return basicEnergy (this, METAL);
      default:
        return null;
    }
  }

}
