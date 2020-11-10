package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.gm.PlayCard
import tcgwars.logic.effect.gm.PlayTrainer;

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
 * @author lithogenn@gmail.com
 */
public enum AmazingVoltTackle implements LogicCardInfo {

  SEEDOT_1 ("Seedot", "1", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NUZLEAF_2 ("Nuzleaf", "2", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SHIFTRY_3 ("Shiftry", "3", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  NINCADA_4 ("Nincada", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NINJASK_5 ("Ninjask", "5", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SKIDDO_6 ("Skiddo", "6", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GOGOAT_7 ("Gogoat", "7", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ORBEETLE_V_8 ("Orbeetle V", "8", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  ORBEETLE_VMAX_9 ("Orbeetle VMAX", "9", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  CHARMANDER_10 ("Charmander", "10", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMELEON_11 ("Charmeleon", "11", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_12 ("Charizard", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  FLAREON_13 ("Flareon", "13", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SLUGMA_14 ("Slugma", "14", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MAGCARGO_15 ("Magcargo", "15", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TALONFLAME_V_16 ("Talonflame V", "16", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VAPOREON_17 ("Vaporeon", "17", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WAILMER_18 ("Wailmer", "18", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  WAILORD_19 ("Wailord", "19", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  OSHAWOTT_20 ("Oshawott", "20", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DEWOTT_21 ("Dewott", "21", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SAMUROTT_22 ("Samurott", "22", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  GALARIAN_DARMANITAN_V_23 ("Galarian Darmanitan V", "23", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GALARIAN_DARMANITAN_VMAX_24 ("Galarian Darmanitan VMAX", "24", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  CHEWTLE_25 ("Chewtle", "25", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DREDNAW_26 ("Drednaw", "26", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  CRAMORANT_27 ("Cramorant", "27", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  ARROKUDA_28 ("Arrokuda", "28", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BARRASKEWDA_29 ("Barraskewda", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_V_30 ("Pikachu V", "30", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  PIKACHU_VMAX_31 ("Pikachu VMAX", "31", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  VOLTORB_32 ("Voltorb", "32", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_33 ("Electrode", "33", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTEON_34 ("Jolteon", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ZAPDOS_35 ("Zapdos", "35", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  BLITZLE_36 ("Blitzle", "36", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ZEBSTRIKA_37 ("Zebstrika", "37", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  TYNAMO_38 ("Tynamo", "38", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  EELEKTRIK_39 ("Eelektrik", "39", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  EELEKTROSS_40 ("Eelektross", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ALAKAZAM_V_41 ("Alakazam V", "41", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SHEDINJA_42 ("Shedinja", "42", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DUSKULL_43 ("Duskull", "43", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  DUSCLOPS_44 ("Dusclops", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DUSKNOIR_45 ("Dusknoir", "45", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  CHIMECHO_46 ("Chimecho", "46", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WOOBAT_47 ("Woobat", "47", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SWOOBAT_48 ("Swoobat", "48", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  COTTONEE_49 ("Cottonee", "49", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WHIMSICOTT_50 ("Whimsicott", "50", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MILCERY_51 ("Milcery", "51", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ALCREMIE_52 ("Alcremie", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MACHOP_53 ("Machop", "53", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MACHOKE_54 ("Machoke", "54", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MACHAMP_55 ("Machamp", "55", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  PHANPY_56 ("Phanpy", "56", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DONPHAN_57 ("Donphan", "57", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HITMONTOP_58 ("Hitmontop", "58", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DRILBUR_59 ("Drilbur", "59", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TERRAKION_60 ("Terrakion", "60", Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  MUDBRAY_61 ("Mudbray", "61", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MUDSDALE_62 ("Mudsdale", "62", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CLOBBOPUS_63 ("Clobbopus", "63", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAPPLOCT_64 ("Grapploct", "64", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_SIRFETCH_D_V_65 ("Galarian Sirfetch'd V", "65", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  POOCHYENA_66 ("Poochyena", "66", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MIGHTYENA_67 ("Mightyena", "67", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SABLEYE_68 ("Sableye", "68", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  DRAPION_V_69 ("Drapion V", "69", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  SANDILE_70 ("Sandile", "70", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  KROKOROK_71 ("Krokorok", "71", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  KROOKODILE_72 ("Krookodile", "72", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  TRUBBISH_73 ("Trubbish", "73", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  GARBODOR_74 ("Garbodor", "74", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_MEOWTH_75 ("Galarian Meowth", "75", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  GALARIAN_PERRSERKER_76 ("Galarian Perrserker", "76", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  EXCADRILL_77 ("Excadrill", "77", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  FERROSEED_78 ("Ferroseed", "78", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  FERROTHORN_79 ("Ferrothorn", "79", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AEGISLASH_V_80 ("Aegislash V", "80", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  AEGISLASH_VMAX_81 ("Aegislash VMAX", "81", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  DURALUDON_82 ("Duraludon", "82", Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  EEVEE_83 ("Eevee", "83", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNORLAX_84 ("Snorlax", "84", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TAILLOW_85 ("Taillow", "85", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SWELLOW_86 ("Swellow", "86", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  WHISMUR_87 ("Whismur", "87", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  LOUDRED_88 ("Loudred", "88", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  EXPLOUD_89 ("Exploud", "89", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DRONE_ROTOM_90 ("Drone Rotom", "90", Rarity.UNCOMMON, [TRAINER, ITEM]),
  TELEPHOTO_SCOPE_91 ("Telephoto Scope", "91", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  MEMORY_CAPSULE_92 ("Memory Capsule", "92", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  BEA_93 ("Bea", "93", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_94 ("Leon", "94", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  LEAGUE_STAFF_95 ("League Staff", "95", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  NESSA_96 ("Nessa", "96", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  HERO_S_BATH_97 ("Hero's Bath", "97", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  WYNDON_STADIUM_98 ("Wyndon Stadium", "98", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  WASH_W_ENERGY_99 ("Wash W Energy", "99", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  COATING_M_ENERGY_100 ("Coating M Energy", "100", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  ORBEETLE_V_101 ("Orbeetle V", "101", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  TALONFLAME_V_102 ("Talonflame V", "102", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  GALARIAN_DARMANITAN_V_103 ("Galarian Darmanitan V", "103", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  PIKACHU_V_104 ("Pikachu V", "104", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ALAKAZAM_V_105 ("Alakazam V", "105", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_SIRFETCH_D_V_106 ("Galarian Sirfetch'd V", "106", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIGHTING_]),
  DRAPION_V_107 ("Drapion V", "107", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  AEGISLASH_V_108 ("Aegislash V", "108", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  BEA_109 ("Bea", "109", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_110 ("Leon", "110", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  NESSA_111 ("Nessa", "111", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ORBEETLE_VMAX_112 ("Orbeetle VMAX", "112", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  GALARIAN_DARMANITAN_VMAX_113 ("Galarian Darmanitan VMAX", "113", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  PIKACHU_VMAX_114 ("Pikachu VMAX", "114", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
  AEGISLASH_VMAX_115 ("Aegislash VMAX", "115", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
  BEA_116 ("Bea", "116", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEON_117 ("Leon", "117", Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  NESSA_118 ("Nessa", "118", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GALARIAN_OBSTAGOON_119 ("Galarian Obstagoon", "119", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  TELEPHOTO_SCOPE_120 ("Telephoto Scope", "120", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]),
  MEMORY_CAPSULE_121 ("Memory Capsule", "121", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  AmazingVoltTackle(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.AMAZING_VOLT_TACKLE;
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
      case SEEDOT_1:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Ram", {
          text "10 damage."
          energyCost G
          onAttack {
            damage 10
          }
        }
      };
      case NUZLEAF_2:
      return evolution (this, from:"Seedot", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Razor Leaf", {
          text "40 damage."
          energyCost G
          onAttack {
            damage 40
          }
        }
      };
      case SHIFTRY_3:
      return evolution (this, from:"Nuzleaf", hp:HP150, type:G, retreatCost:3) {
        weakness R
        bwAbility "Tengu Double", {
          /* FIXME: In theory just ChangeImplementation should work here and simplify everything.
               In Practice, just using a ChangeImplementation or trying to use a new Play* effect both use the old
               implementation PlayRequirements for checking if the card can be played. I'm pretty sure it also used the
               old onPlay, but that should be verified as this was a long implementation session and I'm not entirely
               sure anymore.
           */
          text "The effect of each Supporter card in your opponent's hand becomes 'Draw 3 cards'."
          delayedA {
            def playedFromOppHand = false
            def oldImpl = null
            def newImpl = null
            before PLAY_CARD, {
              if (self.owner.opposite.pbg.hand.contains(ef.cardToPlay)) playedFromOppHand = true
            }
            before PLAY_TRAINER, {
              if (!ef.supporter) return
              oldImpl = ef.cardToPlay
              newImpl = supporter(new CustomCardInfo(ef.cardToPlay.customInfo).setCardTypes(TRAINER, SUPPORTER), "Test") {
                onPlay { draw 3 }
                playRequirement { assert my.deck : "Deck is empty" }
              }
              bg.em().run(new ChangeImplementation(newImpl, oldImpl))
              // FIXME
              newImpl.player = oldImpl.player
              ef.cardToPlay = newImpl
            }
            after PLAY_TRAINER, {
              playedFromOppHand = false
              bg.em().run(new ChangeImplementation(oldImpl, newImpl))
              newImpl = null
              oldImpl = null
            }
          }
        }
        move "Fan Tornado", {
          text "110 damage. You may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
          energyCost G, C
          onAttack {
            damage 110
            if (!confirm("Have your opponent switch their Active Pokémon?"))
            whirlwind()
          }
        }
      };
      case NINCADA_4:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Absorb", {
          text "10 damage. Heal 10 damage from this Pokémon."
          energyCost G
          onAttack {
            damage 10
            heal 10, self
          }
        }
      };
      case NINJASK_5:
      return evolution (this, from:"Nincada", hp:HP060, type:G, retreatCost:0) {
        weakness R
        bwAbility "Shell Cast-off", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for a Shedinja and put it onto your Bench. Then, shuffle your deck."
          onActivate { reason ->
            if (reason == PLAY_FROM_HAND && self.evolution && bg.currentTurn == self.owner && my.bench.notFull && deck.notEmpty && confirm("Use $thisAbility?")) {
              def shedinja = deck.search { it.name == "Shedinja" }.first()
              if (shedinja) benchPCS(shedinja)
              shuffleDeck()
            }
          }
        }
        move "Absorb", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost G
          onAttack {
            damage 30
            heal 30, self
          }
        }
      };
      case SKIDDO_6:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Synthesis", {
          text " Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck."
          energyCost G
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            attachEnergyFrom type:G, my.deck, my.all
            shuffleDeck()
          }
        }
        move "Razor Leaf", {
          text "50 damage."
          energyCost G, G, C
          onAttack {
            damage 50
          }
        }
      };
      case GOGOAT_7:
      return evolution (this, from:"Skiddo", hp:HP130, type:G, retreatCost:2) {
        weakness R
        move "Razor Leaf", {
          text "50 damage."
          energyCost G, C
          onAttack {
            damage 50
          }
        }
        move "Take Down", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost G, G, C
          onAttack {
            damage 160
            damage 30, self
          }
        }
      };
      case ORBEETLE_V_8:
      return basic (this, hp:HP180, type:G, retreatCost:1) {
        weakness R
        move "Strafe", {
          text "20 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost G
          onAttack {
            damage 20
            switchYourActive may:true
          }
        }
        move "Mystery Wave", {
          text "50+ damage. This attack does 30 more damage times the amount of Energy attached to your opponent's Active Pokémon."
          energyCost G, C
          onAttack {
            damage 50
            damage 30 * defending.getEnergyCount(bg)
          }
        }
      };
      case ORBEETLE_VMAX_9:
      return evolution (this, from:"Orbeetle V", hp:HP310, type:G, retreatCost:1) {
        weakness R
        bwAbility "Mysterious Beam", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may put 1 damage counter on each of your opponent's Pokémon."
          actionA {
            checkLastTurn()
            assert self.active : "$self is not your active Pokémon"
            powerUsed()
            opp.all.each { directDamage 10, it, SRC_ABILITY }
          }
        }
        move "GMax Wave", {
          text "50+ damage. This attack does 50 more damage times the amount of Energy attached to your opponent's Active Pokémon."
          energyCost G, C
          onAttack {
            damage 50
            damage 50 * defending.getEnergyCount(bg)
          }
        }
      };
      case CHARMANDER_10:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Collect", {
          text " Draw a card."
          energyCost R
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            draw 1
          }
        }
        move "Flare", {
          text "30 damage."
          energyCost R, R
          onAttack {
            damage 30
          }
        }
      };
      case CHARMELEON_11:
      return evolution (this, from:"Charmander", hp:HP090, type:R, retreatCost:2) {
        weakness W
        move "Slash", {
          text "20 damage."
          energyCost R
          onAttack {
            damage 20
          }
        }
        move "Wild Blaze", {
          text "60 damage. Discard the top 3 cards of your deck."
          energyCost R, R
          onAttack {
            damage 60
            if (my.deck) my.deck.subList(0, 3).discard()
          }
        }
      };
      case CHARIZARD_12:
      return evolution (this, from:"Charmeleon", hp:HP170, type:R, retreatCost:3) {
        weakness W
        bwAbility "Battle Sense", {
          text "Once during your turn, you may look at the top 3 cards of your deck and put 1 of them into your hand. Discard the other cards."
          actionA {
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()
            def viewed = my.deck.subList 0, 3
            def selected = viewed.select()
            selected.moveTo my.hand
            viewed.getExcludedList(selected).discard()
          }
        }
        move "King Blaze", {
          text "100 damage. This attack does 50 more damage for each Leon in your discard pile."
          energyCost R, R
          onAttack {
            damage 100
            damage 50 * my.discard.findAll { it.name == "Leon" }.size()
          }
        }
      };
      case FLAREON_13:
      return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:2) {
        weakness W
        bwAbility "Scorching Awakening", {
          text "If this Pokémon has a Memory Capsule card attached to it, each player's Pokémon has no Abilities."
          onActivate {
            bg.em().run(new CheckAbilities())
          }
          onDeactivate {
            bg.em().run(new CheckAbilities())
          }
          getterA GET_ABILITIES, BEFORE_LAST, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" } && holder.effect.target != self) {
              holder.object.keySet().removeIf { it instanceof BwAbility }
            }
          }
          getterA IS_GLOBAL_ABILITY_BLOCKED, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" }) {
              holder.object = true
            }
          }
          delayedA {
            after PLAY_POKEMON_TOOL, {
              bg.em().run(new CheckAbilities())
            }
            after DISCARD, {
              if (ef.card.name == "Memory Capsule") bg.em().run(new CheckAbilities())
            }
          }
        }
        move "Fire Mane", {
          text "100 damage."
          energyCost R, R, C
          onAttack {
            damage 100
          }
        }
      };
      case SLUGMA_14:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Yawn", {
          text " Your opponent's Active Pokémon is now Asleep."
          energyCost C
          attackRequirement {
            assert !defending.isSPC(ASLEEP) : "$defending is already asleep"
          }
          onAttack {
            apply ASLEEP
          }
        }
        move "Flare", {
          text "30 damage."
          energyCost R, C, C
          onAttack {
            damage 30
          }
        }
      };
      case MAGCARGO_15:
      return evolution (this, from:"Slugma", hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Heat Blast", {
          text "60 damage."
          energyCost R, C, C
          onAttack {
            damage 60
          }
        }
        move "Bright Flame", {
          text "180 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, C, C
          onAttack {
            damage 180
            discardSelfEnergy C, C
          }
        }
      };
      case TALONFLAME_V_16:
      return basic (this, hp:HP190, type:R, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Fast Flight", {
          text " If you go first, you can use this attack on your first turn. Discard your hand and draw 6 cards."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            my.hand.discard()
            draw 6
          }
        }
        move "Bright Wing", {
          text "160 damage. Discard an Energy from this Pokémon."
          energyCost R, R, C
          onAttack {
            damage 160
            discardSelfEnergy C
          }
        }
      };
      case VAPOREON_17:
      return evolution (this, from:"Eevee", hp:HP110, type:W, retreatCost:2) {
        weakness L
        bwAbility "Torrent Awakening", {
          text "If this Pokémon has a Memory Capsule card attached to it, each player's Pokémon has no Abilities."
          onActivate {
            bg.em().run(new CheckAbilities())
          }
          onDeactivate {
            bg.em().run(new CheckAbilities())
          }
          getterA GET_ABILITIES, BEFORE_LAST, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" } && holder.effect.target != self) {
              holder.object.keySet().removeIf { it instanceof BwAbility }
            }
          }
          getterA IS_GLOBAL_ABILITY_BLOCKED, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" }) {
              holder.object = true
            }
          }
          delayedA {
            after PLAY_POKEMON_TOOL, {
              bg.em().run(new CheckAbilities())
            }
            after DISCARD, {
              if (ef.card.name == "Memory Capsule") bg.em().run(new CheckAbilities())
            }
          }
        }
        move "Aurora Beam", {
          text "70 damage."
          energyCost W, C
          onAttack {
            damage 70
          }
        }
      };
      case WAILMER_18:
      return basic (this, hp:HP100, type:W, retreatCost:3) {
        weakness L
        move "Hydro Pump", {
          text "10+ damage. This attack does 20 more damage for each Energy attached to this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 10
            damage 20 * self.cards.filterByEnergyType(W).size()
          }
        }
      };
      case WAILORD_19:
      return evolution (this, from:"Wailmer", hp:HP200, type:W, retreatCost:4) {
        weakness L
        bwAbility "Water Veil", {
          text "Whenever you attach an Energy card from your hand to this Pokémon, it recovers from all Special Conditions."
          delayedA {
            after ATTACH_ENERGY, self, {
              if (ef.reason == PLAY_FROM_HAND && self.specialConditions) {
                bc "$thisAbility activates"
                clearSpecialCondition self, SRC_ABILITY
              }
            }
          }
        }
        move "Hydro Pump", {
          text "10+ damage. This attack does 40 more damage for each Energy attached to this Pokémon."
          energyCost C, C, C, C
          onAttack {
            damage 10
            damage 40 * self.cards.filterByEnergyType(W).size()
          }
        }
      };
      case OSHAWOTT_20:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }
        move "Seashell Attack", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case DEWOTT_21:
      return evolution (this, from:"Oshawott", hp:HP090, type:W, retreatCost:2) {
        weakness L
        move "Water Gun", {
          text "20 damage."
          energyCost W
          onAttack {
            damage 20
          }
        }
        move "Aqua Wash", {
          text "50 damage. You may put an Energy attached to your opponent's Active Pokémon into their hand."
          energyCost W, C, C
          onAttack {
            damage 50
            if (!defending.cards.filterByType(ENERGY)) return
            def info = "You may select the Energy to return to the opponent's hand."
            def selectedEnergy = defending.cards.filterByType(ENERGY).select min:0, info
            if (selectedEnergy) selectedEnergy.moveTo opp.hand
          }
        }
      };
      case SAMUROTT_22:
      return evolution (this, from:"Dewott", hp:HP160, type:W, retreatCost:2) {
        weakness L
        bwAbility "Shell Armor", {
          text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          reducedDamageFromAttacksAbility self, 30, delegate
        }
        move "Aqua Wash", {
          text "120 damage. You may put 2 Energy attached to your opponent's Active Pokémon into their hand."
          energyCost W, C, C
          onAttack {
            damage 120
            if (!defending.cards.filterByType(ENERGY)) return
            def info = "You may select up to 2 Energy to return to the opponent's hand."
            def selectedEnergy = defending.cards.filterByType(ENERGY).select min:0, max:2, info
            if (selectedEnergy) selectedEnergy.moveTo opp.hand
          }
        }
      };
      case GALARIAN_DARMANITAN_V_23:
      return basic (this, hp:HP220, type:W, retreatCost:2) {
        weakness M
        move "Freezing Headbutt", {
          text "50 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost W, C
          onAttack {
            damage 50
            flipThenApplySC PARALYZED
          }
        }
        move "Frozen Slice", {
          text "190 damage. This Pokémon also does 30 damage to itself."
          energyCost W, W, C
          onAttack {
            damage 190
            damage 30, self
          }
        }
      };
      case GALARIAN_DARMANITAN_VMAX_24:
      return evolution (this, from:"Darmanitan V", hp:HP320, type:W, retreatCost:3) {
        weakness M
        move "Max Snowfall", {
          text "200 damage. This attack also does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, W, W
          onAttack {
            damage 200
            opp.bench.each { damage 30, it }
          }
        }
      };
      case CHEWTLE_25:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Jaw Lock", {
          text "40 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost W, C
          onAttack {
            damage 40
            cantRetreat defending
          }
        }
      };
      case DREDNAW_26:
      return evolution (this, from:"Chewtle", hp:HP140, type:W, retreatCost:4) {
        weakness L
        move "Vise Wave", {
          text "80 damage. If you played Nessa from your hand during this turn, your opponent's Active Pokémon is now Paralyzed."
          energyCost W, C, C
          onAttack {
            damage 80
            if (bg.em().retrieveObject("NESSA") != bg.turnCount) return
            apply PARALYZED
          }
        }
        move "Surf", {
          text "140 damage."
          energyCost W, C, C, C
          onAttack {
            damage 140
          }
        }
      };
      case CRAMORANT_27:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Continuous Gulp Missile", {
          text "60x damage. Discard any number of Arrokuda from your Bench. This attack does 60 damage for each card you discarded in this way."
          energyCost C, C
          attackRequirement {
            assert my.bench.any { it.name == "Arrokuda" } : "No Arrokuda on your bench"
          }
          onAttack {
            def count = 0
            while (true) {
              def pcs = my.bench.select("Arrokuda to discard?", false)
              if (!pcs) break
              if (pcs.name != "Arrokuda") {
                wcu "Not an Arrokuda"
                continue
              }
              pcs.cards.discard()
              removePCS(pcs)
              count++
              if (!my.bench.any { it.name == "Arrokuda" }) break
            }
            damage 60 * count
          }
        }
      };
      case ARROKUDA_28:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Flock", {
          text " Search your deck for up to 2 Arrokuda and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert my.bench.notFull : "Bench is full"
          }
          onAttack {
            my.deck.search(max:2, {it.name == "Arrokuda"}).each { benchPCS it }
            shuffleDeck()
          }
        }
        move "Peck", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }
      };
      case BARRASKEWDA_29:
      return evolution (this, from:"Arrokuda", hp:HP120, type:W, retreatCost:1) {
        weakness L
        move "Target Skewer", {
          text " This attack does 20 damage to 1 of your opponent's Benched Pokémon for each damage counter on that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {
            assert opp.bench : "Opponent's bench is empty"
            assert opp.bench.any { it.numberOfDamageCounters } : "No Pokémon on opponent's bench are damaged"
          }
          onAttack {
            def pcs = opp.bench.select "Deal 20 damage to which Pokémon for each damage counter already on it?"
            damage 20 * pcs.numberOfDamageCounters, pcs
          }
        }
        move "Jet Headbutt", {
          text "60 damage."
          energyCost W, C
          onAttack {
            damage 60
          }
        }
      };
      case PIKACHU_V_30:
      return basic (this, hp:HP190, type:L, retreatCost:1) {
        weakness F
        move "Charge", {
          text " Search your deck for up to 2 [L] Energy cards and attach them to this Pokémon. Then, shuffle your deck."
          energyCost L
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def info = "Choose up to 2 [L] Energy cards to attach to $self"
            def energies = my.deck.search max:2, info, energyFilter(L)
            energies.each { attachEnergy self, it }
            shuffleDeck()
          }
        }
        move "Thunderbolt", {
          text "200 damage. Discard all Energy from this Pokémon."
          energyCost L, L, C
          onAttack {
            damage 200
            discardAllSelfEnergy()
          }
        }
      };
      case PIKACHU_VMAX_31:
      return evolution (this, from:"Pikachu V", hp:HP310, type:L, retreatCost:2) {
        weakness F
        move "GMax Volt Tackle", {
          text "120+ damage. You may discard all Energy from this Pokémon. If you do, this attack does 150 more damage."
          energyCost L, L, L
          onAttack {
            damage 120
            if (confirm("Discard all Energy from $self to do 150 more damage?")) {
              discardAllSelfEnergy()
              damage 150
            }
          }
        }
      };
      case VOLTORB_32:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Electro Ball", {
          text "40 damage."
          energyCost L, L
          onAttack {
            damage 40
          }
        }
      };
      case ELECTRODE_33:
      return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:1) {
        weakness F
        bwAbility "Ene-Ene Generator", {
          text "Once during your turn, if this Pokémon is on your Bench, you may Knock Out this Pokémon. If you do, search your deck for up to 2 [L] Energy cards and attach them to your [L] Pokémon in any way you like. Then, shuffle your deck."
          actionA {
            checkLastTurn()
            assert self.benched : "$self is not on your Bench"
            assert confirm("$thisAbility: Are you sure?") : "Cancelled $thisAbility"
            powerUsed()
            bg.em().run(new Knockout(self))
            def info = "Choose up to 2 [L] Energy cards to attach to your remaining Pokémon."
            def energies = my.deck.search max:2, info, energyFilter(L)
            energies.each {
              attachEnergy my.all.findAll { it.types.contains L }.select("Pokémon to attach $it to?"), it
            }
            shuffleDeck()
          }
        }
        move "Electric Ball", {
          text "100 damage."
          energyCost L, L, C
          onAttack {
            damage 100
          }
        }
      };
      case JOLTEON_34:
      return evolution (this, from:"Eevee", hp:HP100, type:L, retreatCost:1) {
        weakness F
        bwAbility "Thunderclap Awakening", {
          text "If this Pokémon has a Memory Capsule card attached to it, each player's Pokémon has no Abilities."
          onActivate {
            bg.em().run(new CheckAbilities())
          }
          onDeactivate {
            bg.em().run(new CheckAbilities())
          }
          getterA GET_ABILITIES, BEFORE_LAST, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" } && holder.effect.target != self) {
              holder.object.keySet().removeIf { it instanceof BwAbility }
            }
          }
          getterA IS_GLOBAL_ABILITY_BLOCKED, {Holder holder->
            if (self.cards.any { it.name == "Memory Capsule" }) {
              holder.object = true
            }
          }
          delayedA {
            after PLAY_POKEMON_TOOL, {
              bg.em().run(new CheckAbilities())
            }
            after DISCARD, {
              if (ef.card.name == "Memory Capsule") bg.em().run(new CheckAbilities())
            }
          }
        }
        move "Electric Ball", {
          text "90 damage."
          energyCost L, C, C
          onAttack {
            damage 90
          }
        }
      };
      case ZAPDOS_35:
      return basic (this, hp:HP110, type:L, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Drill Peck", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }
        move "Snipe Thunder", {
          text " Discard all Energy from this Pokémon. This attack does 160 damage to 1 of your opponent's Pokémon V or Pokémon-GX. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {
            assert opp.bench.any { it.pokemonV || it.pokemonGX } : "Opponent has no Pokémon V or Pokémon-GX on their Bench"
          }
          onAttack {
            if (!opp.bench.any {it.pokemonV || it.pokemonGX}) return
            def pcs = null
            while (!pcs) {
              pcs = opp.bench.select"Pokémon V or Pokémon-GX to inflict 160 damage to?"
              if (!pcs) return
              if (!pcs.pokemonGX && !pcs.pokemonV) {
                wcu "$pcs is not a Pokémon V or Pokémon-GX"
                pcs = null
              }
            }
            damage 160, pcs
            afterDamage {
              discardAllSelfEnergy()
            }
          }
        }
      };
      case BLITZLE_36:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Zap Kick", {
          text "20 damage."
          energyCost L
          onAttack {
            damage 20
          }
        }
      };
      case ZEBSTRIKA_37:
      return evolution (this, from:"Blitzle", hp:HP110, type:L, retreatCost:1) {
        weakness F
        move "Low Kick", {
          text "30 damage."
          energyCost L
          onAttack {
            damage 30
          }
        }
        move "Zap Kick", {
          text "70 damage."
          energyCost L, C
          onAttack {
            damage 70
          }
        }
      };
      case TYNAMO_38:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        bwAbility "Floating", {
          text "If this Pokémon has any Energy attached to it, it has no Retreat Cost."
          getterA GET_RETREAT_COST, BEFORE_LAST, self, {h->
            if (self.energyCards) h.object = 0
          }
        }
        move "Mini Electricity", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }
      };
      case EELEKTRIK_39:
      return evolution (this, from:"Tynamo", hp:HP090, type:L, retreatCost:2) {
        weakness F
        move "Stun Crash", {
          text " Flip a coin. If heads, discard an Energy from 1 of your opponent's Pokémon."
          energyCost L
          attackRequirement {
            assert opp.all.any { it.energyCards }
          }
          onAttack {
            if (!opp.all.any {it.energyCards}) return
            flip {
              discardOpponentEnergy Target.OPP_ANY_YOU_SELECT
            }
          }
        }
        move "Head Bolt", {
          text "60 damage."
          energyCost L, C, C
          onAttack {
            damage 60
          }
        }
      };
      case EELEKTROSS_40:
      return evolution (this, from:"Eelektrik", hp:HP160, type:L, retreatCost:3) {
        weakness F
        move "Stun Fang", {
          text "60 damage. During your opponent's next turn, if they attach an Energy card from their hand to the Defending Pokémon, put 6 damage counters on that Pokémon."
          energyCost L
          onAttack {
            damage 60
            targeted defending, {
              bc ("Attaching an Energy from hand to the Defending Pokémon ($defending) during ${self.owner.opposite.getPlayerUsername(bg)}'s next turn"
                + " will place 6 damage counters on the Defending Pokémon. (This effect can be removed by benching/evolving ${defending})")
              def pcs = defending
              delayed {
                after ATTACH_ENERGY, {
                  if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner.opposite && ef.resolvedTarget == pcs) {
                    directDamage 60, pcs
                  }
                }
                unregisterAfter 2
                after FALL_BACK, pcs, {unregister()}
                after EVOLVE, pcs, {unregister()}
                after DEVOLVE, pcs, {unregister()}
              }
            }
          }
        }
        move "Electric Sprinkler", {
          text "120 damage. This attack also does 30 damage to 1 of your Benched Pokémon and 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          onAttack {
            damage 120
            def pokes = []
            if (my.bench) {
              pokes.add my.bench.select("Deal 30 damage to which of your own Pokémon?")
            }
            if (opp.bench) {
              pokes.add opp.bench.select("Deal 30 damage to which of your opponent's Pokémon?")
            }
            if (!pokes) return
            damage 30, pokes
          }
        }
      };
      case ALAKAZAM_V_41:
      return basic (this, hp:HP190, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Zen Spoon", {
          text " Put 3 damage counters on your opponent's Pokémon in any way you like."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Mind Ruler", {
          text "30 damage. This attack does 30 damage for each card in your opponent's hand."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SHEDINJA_42:
      return basic (this, hp:HP030, type:P, retreatCost:1) {
        globalAbility {
          delayed {
            def abilityUsed = false
            before PLAY_CARD, {
              if (ef.cardToPlay == thisCard) {
                def abilityName = "Shell Bind"
                wcu("$abilityName prevents playing $thisCard")
                prevent()
              }
            }
          }
        }
        bwAbility "Shell Bind", {
          text "This card can only be put into play with the effect of Ninjask's Cast-off Shell Ability (you can't play this card when you are setting up to play)."
        }
        move "Squeeze Life", {
          text " Put damage counters on your opponent's Active Pokémon until its remaining HP is 10."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DUSKULL_43:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Future Sight", {
          text " Look at the top 4 cards of either player's deck and put them back in any order."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DUSCLOPS_44:
      return evolution (this, from:"Duskull", hp:HP090, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Confuse Ray", {
          text " Your opponent's Active Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psypunch", {
          text "60 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case DUSKNOIR_45:
      return evolution (this, from:"Dusclops", hp:HP150, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        bwAbility "Ghost Bleach", {
          text "Special Energy cards attached to each player's Pokémon have no effect and only provide Energy instead."
          actionA {
          }
        }
        move "Spooky Shot", {
          text "120 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case CHIMECHO_46:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Vibrating Tone", {
          text " Search your deck for a Pokémon and a Supporter card, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Hypnoblast", {
          text "30 damage. Your opponent's Active Pokémon is now Asleep."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WOOBAT_47:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Unarmed Wave", {
          text " This attack does 30 damage to each of your opponent's Pokémon. If you have any cards in your hand, this attack does nothing. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SWOOBAT_48:
      return evolution (this, from:"Woobat", hp:HP100, type:P, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Airhead", {
          text "Prevent all effects of your opponent's attacks, except damage, done to this Pokémon."
          actionA {
          }
        }
        move "Heart Stamp", {
          text "70 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case COTTONEE_49:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Rolling Tackle", {
          text "10 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WHIMSICOTT_50:
      return evolution (this, from:"Cottonee", hp:HP090, type:P, retreatCost:0) {
        weakness M
        move "Triple Draw", {
          text " Draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fling Rush", {
          text "10 damage. Before doing damage, discard any number of Pokémon Tools from all of your Pokémon. This attack does 40 more damage for each card you discarded in this way."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MILCERY_51:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness M
        move "Sweet Scent", {
          text " Heal 20 damage from 1 of your Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ALCREMIE_52:
      return evolution (this, from:"Milcery", hp:HP090, type:P, retreatCost:1) {
        weakness M
        bwAbility "Sweet Share", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, each player draws a card."
          actionA {
          }
        }
        move "Wonder Shine", {
          text "60 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MACHOP_53:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness P
        move "Low Kick", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Steady Punch", {
          text "20 damage. Flip a coin. If heads, this attack does 40 more damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOKE_54:
      return evolution (this, from:"Machop", hp:HP110, type:F, retreatCost:3) {
        weakness P
        move "Low Kick", {
          text "30 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Pummel", {
          text "50 damage. Flip a coin. If heads, this attack does 70 more damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MACHAMP_55:
      return evolution (this, from:"Machoke", hp:HP170, type:F, retreatCost:3) {
        weakness P
        move "Macho Revenge 20x", {
          text " This attack does 20 damage for each Pokémon in your discard pile."
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dynamite Punch", {
          text "200 damage. This Pokémon also does 50 damage to itself."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case PHANPY_56:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Stampede", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Strike Back", {
          text "30 damage. This attack does 30 damage times the number of damage counters on this Pokémon."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DONPHAN_57:
      return evolution (this, from:"Phanpy", hp:HP150, type:F, retreatCost:4) {
        weakness G
        move "Earthquake", {
          text "120 damage. This attack does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
        move "Heavy Impact", {
          text "90 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case HITMONTOP_58:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness P
        move "Cycle Draw", {
          text " Discard a card from your hand. If you do, draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Twister Kick", {
          text "50 damage. If you played Bea from your hand during this turn, this attack does 80 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case DRILBUR_59:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Focus Fist", {
          text "50 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TERRAKION_60:
      return basic (this, hp:HP140, type:F, retreatCost:4) {
        weakness G
        move "Guard Press", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Ground Power", {
          text "80 damage. If you have a Stadium in play, this attack does 80 more damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case MUDBRAY_61:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness G
        move "Ram", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rear Kick", {
          text "60 damage."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MUDSDALE_62:
      return evolution (this, from:"Mudbray", hp:HP140, type:F, retreatCost:3) {
        weakness G
        move "Mud Bomb", {
          text "50 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Heavy Slam", {
          text "180 damage. This attack does 30 less damage for each in your opponent's Active Pokémon's Retreat Cost."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case CLOBBOPUS_63:
      return basic (this, hp:HP080, type:F, retreatCost:2) {
        weakness P
        move "Beat", {
          text "20 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hammer In", {
          text "40 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GRAPPLOCT_64:
      return evolution (this, from:"Clobbopus", hp:HP130, type:F, retreatCost:2) {
        weakness P
        move "Headlock", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Tentacle Buster", {
          text "50 damage. If this Pokémon used Headlock during your last turn, this attack does 120 more damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GALARIAN_SIRFETCH_D_V_65:
      return basic (this, hp:HP210, type:F, retreatCost:2) {
        weakness P
        bwAbility "Pledge Spear", {
          text "Once during your turn, when this Pokémon moves from your Bench to the Active Spot, you may move any amount of Energy from your other Pokémon to it."
          actionA {
          }
        }
        move "Meteor Smash", {
          text "200 damage. During your next turn, this Pokémon can't attack."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case POOCHYENA_66:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Bite", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rear Kick", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MIGHTYENA_67:
      return evolution (this, from:"Poochyena", hp:HP110, type:D, retreatCost:1) {
        weakness G
        move "Ferocious Bellow", {
          text "20 damage. During your opponent's next turn, the Defending Pokémon's attacks do 50 less damage (before applying Weakness and Resistance)."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "PitchBlack Fangs", {
          text "100 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SABLEYE_68:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Filch", {
          text " Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Torment", {
          text "30 damage. Choose 1 of your opponent's Active Pokémon's attacks. During your opponent's next turn, that Pokémon can't use that attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DRAPION_V_69:
      return basic (this, hp:HP210, type:D, retreatCost:3) {
        weakness F
        move "Wrack Down", {
          text "70 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Hazard Claw", {
          text "130 damage. Discard 2 Energy from this Pokémon. Your opponent's Active Pokémon is now Paralyzed and Poisoned."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case SANDILE_70:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness G
        move "Devastating Dig", {
          text " Discard the top 3 cards of your opponent's deck."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case KROKOROK_71:
      return evolution (this, from:"Sandile", hp:HP090, type:D, retreatCost:2) {
        weakness G
        move "Bite", {
          text "20 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Devastating Dig", {
          text " Discard the top 3 cards of your opponent's deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case KROOKODILE_72:
      return evolution (this, from:"Krokorok", hp:HP150, type:D, retreatCost:3) {
        weakness G
        move "Devastating Dig", {
          text " Discard the top 3 cards of your opponent's deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tantrum", {
          text "180 damage. This Pokémon is now Confused."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case TRUBBISH_73:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness F
        move "Lucky Find", {
          text " Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Sludge Toss", {
          text "30 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GARBODOR_74:
      return evolution (this, from:"Trubbish", hp:HP120, type:D, retreatCost:3) {
        weakness F
        move "Dust Cyclone", {
          text "30 damage. This attack does 30 damage for each Pokémon Tool in your discard pile. Then, shuffle those cards into your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Poison Spray", {
          text "80 damage. Your opponent's Active Pokémon is now Poisoned."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case GALARIAN_MEOWTH_75:
      return basic (this, hp:HP070, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Scratch", {
          text "10 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fury Swipes", {
          text "20 damage. Flip 3 coins. This attack does 20 damage for each heads."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GALARIAN_PERRSERKER_76:
      return evolution (this, from:"Meowth", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Snatch Claw", {
          text "20 damage. Flip 3 coins. If any of them are heads, your opponent reveals their hand. Then, for each heads, discard a Trainer card you find there."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Claw Slash", {
          text "90 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case EXCADRILL_77:
      return evolution (this, from:"Drilbur", hp:HP130, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Drill Run", {
          text "30 damage. Discard an Energy from your opponent's Active Pokémon."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Slashing Claw", {
          text "130 damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case FERROSEED_78:
      return basic (this, hp:HP060, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Reaction", {
          text "10 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case FERROTHORN_79:
      return evolution (this, from:"Ferroseed", hp:HP110, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Buzzing Swing", {
          text "30 damage. This attack does 30 damage for each Energy attached to this Pokémon. Then, switch this Pokémon with 1 of your Benched Pokémon."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case AEGISLASH_V_80:
      return basic (this, hp:HP210, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Slash", {
          text "50 damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Sonic Edge", {
          text "130 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case AEGISLASH_VMAX_81:
      return evolution (this, from:"Aegislash V", hp:HP320, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Max Slash", {
          text "160 damage. This attack does 30 more damage for each Prize card you have taken."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case DURALUDON_82:
      return basic (this, hp:HP130, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Raging Claws", {
          text "20 damage. This attack does 10 more damage for each damage counter on this Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Power Blast", {
          text "120 damage. Discard an Energy from this Pokémon."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case EEVEE_83:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Gnaw", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tail Whap", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SNORLAX_84:
      return basic (this, hp:HP130, type:C, retreatCost:3) {
        weakness F
        bwAbility "Stuff Face", {
          text "Once during your turn, if this Pokémon is in the Active Spot, you may draw cards until you have 7 cards in your hand. If you use this Ability, your turn ends."
          actionA {
          }
        }
        move "Body Slam", {
          text "100 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case TAILLOW_85:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Double Peck", {
          text "20 damage. Flip 2 coins. This attack does 20 damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SWELLOW_86:
      return evolution (this, from:"Taillow", hp:HP090, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Quick Attack", {
          text "20 damage. Flip a coin. If heads, this attack does 40 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Energy Assist", {
          text "40 damage. Attach up to 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WHISMUR_87:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Continuous Tumble", {
          text "40 damage. Flip a coin until you get tails. This attack does 40 damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case LOUDRED_88:
      return evolution (this, from:"Whismur", hp:HP100, type:C, retreatCost:2) {
        weakness F
        move "Round", {
          text "20 damage. This attack does 20 damage for each of your Pokémon that have the Round attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hyper Voice", {
          text "50 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case EXPLOUD_89:
      return evolution (this, from:"Loudred", hp:HP160, type:C, retreatCost:3) {
        weakness F
        move "Round", {
          text "50 damage. This attack does 50 damage for each of your Pokémon that have the Round attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Hyper Voice", {
          text "120 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case DRONE_ROTOM_90:
      return itemCard (this) {
        text "Your opponent reveals their hand. Then" +
          "look at the top card of your opponent's deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case TELEPHOTO_SCOPE_91:
      return pokemonTool (this) {
        text "The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Benched Pokémon V or Benched Pokémon-GX (before applying Weakness and Resistance)."
        onPlay {
        }
        onRemoveFromPlay {
        }
      };
      case MEMORY_CAPSULE_92:
      return pokemonTool (this) {
        text "The Pokémon this card is attached to can use any attack from its previous Evolutions. (You still need the necessary Energy to use each attack.)"
        onPlay {
        }
        onRemoveFromPlay {
        }
      };
      case BEA_93:
      return supporter (this) {
        text "Discard the top 5 cards of your deck. If any of those cards are Energy cards" +
          "attach them to your Benched Pokémon in any way you like."
        onPlay {
        }
        playRequirement{
        }
      };
      case LEON_94:
      return supporter (this) {
        text "During this turn" +
          "your Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
        onPlay {
        }
        playRequirement{
        }
      };
      case LEAGUE_STAFF_95:
      return supporter (this) {
        text "Draw 2 cards. If Wyndon Stadium is in play" +
          "draw 2 more cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case NESSA_96:
      return supporter (this) {
        text "Put up to 4 in any combination of Pokémon and Energy cards from your discard pile into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case HERO_S_BATH_97:
      return stadium (this) {
        text "Basic Pokémon in play (both yours and your opponent's) take 20 less damage from attacks (after applying Weakness and Resistance)."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case WYNDON_STADIUM_98:
      return stadium (this) {
        text "Whenever either player plays a Pokémon VMAX from their hand during their turn to evolve their Pokémon V" +
          "heal 100 damage from that Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case WASH_W_ENERGY_99:
      return specialEnergy (this, [[C]]) {
        text "As long as this card is attached to a Pokémon" +
          "it provides Energy. Prevent all effects of your opponent's attacks" +
          "except damage" +
          "done to the Pokémon this card is attached to. (Existing effects are not removed.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case COATING_M_ENERGY_100:
      return specialEnergy (this, [[C]]) {
        text "As long as this card is attached to a Pokémon" +
          "it provides Energy. The Pokémon this card is attached to has no Weakness."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case ORBEETLE_V_101:
      return copy (ORBEETLE_V_8, this);
      case TALONFLAME_V_102:
      return copy (TALONFLAME_V_16, this);
      case GALARIAN_DARMANITAN_V_103:
      return copy (GALARIAN_DARMANITAN_V_23, this);
      case PIKACHU_V_104:
      return copy (PIKACHU_V_30, this);
      case ALAKAZAM_V_105:
      return copy (ALAKAZAM_V_41, this);
      case GALARIAN_SIRFETCH_D_V_106:
      return copy (GALARIAN_SIRFETCH_D_V_65, this);
      case DRAPION_V_107:
      return copy (DRAPION_V_69, this);
      case AEGISLASH_V_108:
      return copy (AEGISLASH_V_80, this);
      case BEA_109:
      return copy (BEA_93, this);
      case LEON_110:
      return copy (LEON_94, this);
      case NESSA_111:
      return copy (NESSA_96, this);
      case ORBEETLE_VMAX_112:
      return copy (ORBEETLE_VMAX_9, this);
      case GALARIAN_DARMANITAN_VMAX_113:
      return copy (GALARIAN_DARMANITAN_VMAX_24, this);
      case PIKACHU_VMAX_114:
      return copy (PIKACHU_VMAX_31, this);
      case AEGISLASH_VMAX_115:
      return copy (AEGISLASH_VMAX_81, this);
      case BEA_116:
      return copy (BEA_93, this);
      case LEON_117:
      return copy (LEON_94, this);
      case NESSA_118:
      return copy (NESSA_96, this);
      case GALARIAN_OBSTAGOON_119:
      return evolution (this, from:"Linoone", hp:HP160, type:D, retreatCost:2) {
        weakness G
        bwAbility "Wild Shout", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 3 damage counters on 1 of your opponent's Pokémon."
          actionA {
          }
        }
        move "Obstruct", {
          text "90 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case TELEPHOTO_SCOPE_120:
      return copy (TELEPHOTO_SCOPE_91, this);
      case MEMORY_CAPSULE_121:
      return copy (MEMORY_CAPSULE_92, this);
      default:
      return null;
    }
  }
}
