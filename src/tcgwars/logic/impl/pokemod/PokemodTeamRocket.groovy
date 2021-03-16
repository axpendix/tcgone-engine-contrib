package tcgwars.logic.impl.pokemod

import tcgwars.logic.impl.gen1.Rocket

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
public enum PokemodTeamRocket implements LogicCardInfo {

  DARK_ALAKAZAM_1 ("Dark Alakazam", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_ARBOK_2 ("Dark Arbok", "2", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_BLASTOISE_3 ("Dark Blastoise", "3", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  DARK_CHARIZARD_4 ("Dark Charizard", "4", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONITE_5 ("Dark Dragonite", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_DUGTRIO_6 ("Dark Dugtrio", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_GOLBAT_7 ("Dark Golbat", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GYARADOS_8 ("Dark Gyarados", "8", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_HYPNO_9 ("Dark Hypno", "9", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHAMP_10 ("Dark Machamp", "10", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MAGNETON_11 ("Dark Magneton", "11", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_SLOWBRO_12 ("Dark Slowbro", "12", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_VILEPLUME_13 ("Dark Vileplume", "13", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_WEEZING_14 ("Dark Weezing", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HERE_COMES_TEAM_ROCKET_15 ("Here Comes Team Rocket!", "15", Rarity.HOLORARE, [TRAINER]),
  ROCKETS_SNEAK_ATTACK_16 ("Rocket's Sneak Attack", "16", Rarity.HOLORARE, [TRAINER]),
  RAINBOW_ENERGY_17 ("Rainbow Energy", "17", Rarity.HOLORARE, [SPECIAL_ENERGY, ENERGY]),

  DARK_ALAKAZAM_18 ("Dark Alakazam", "18", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_ARBOK_19 ("Dark Arbok", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_BLASTOISE_20 ("Dark Blastoise", "20", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  DARK_CHARIZARD_21 ("Dark Charizard", "21", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONITE_22 ("Dark Dragonite", "22", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_DUGTRIO_23 ("Dark Dugtrio", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_GOLBAT_24 ("Dark Golbat", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GYARADOS_25 ("Dark Gyarados", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_HYPNO_26 ("Dark Hypno", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHAMP_27 ("Dark Machamp", "27", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MAGNETON_28 ("Dark Magneton", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_SLOWBRO_29 ("Dark Slowbro", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_VILEPLUME_30 ("Dark Vileplume", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_WEEZING_31 ("Dark Weezing", "31", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_CHARMELEON_32 ("Dark Charmeleon", "32", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_DRAGONAIR_33 ("Dark Dragonair", "33", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_ELECTRODE_34 ("Dark Electrode", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_FLAREON_35 ("Dark Flareon", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_GLOOM_36 ("Dark Gloom", "36", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_GOLDUCK_37 ("Dark Golduck", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_JOLTEON_38 ("Dark Jolteon", "38", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_KADABRA_39 ("Dark Kadabra", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_MACHOKE_40 ("Dark Machoke", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_MUK_41 ("Dark Muk", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_PERSIAN_42 ("Dark Persian", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_PRIMEAPE_43 ("Dark Primeape", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DARK_RAPIDASH_44 ("Dark Rapidash", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DARK_VAPOREON_45 ("Dark Vaporeon", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_WARTORTLE_46 ("Dark Wartortle", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGIKARP_47 ("Magikarp", "47", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  PORYGON_48 ("Porygon", "48", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  ABRA_49 ("Abra", "49", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CHARMANDER_50 ("Charmander", "50", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  DARK_RATICATE_51 ("Dark Raticate", "51", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIGLETT_52 ("Diglett", "52", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DRATINI_53 ("Dratini", "53", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DROWZEE_54 ("Drowzee", "54", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_55 ("Eevee", "55", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EKANS_56 ("Ekans", "56", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GRIMER_57 ("Grimer", "57", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  KOFFING_58 ("Koffing", "58", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MACHOP_59 ("Machop", "59", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEMITE_60 ("Magnemite", "60", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MANKEY_61 ("Mankey", "61", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEOWTH_62 ("Meowth", "62", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ODDISH_63 ("Oddish", "63", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PONYTA_64 ("Ponyta", "64", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PSYDUCK_65 ("Psyduck", "65", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RATTATA_66 ("Rattata", "66", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SLOWPOKE_67 ("Slowpoke", "67", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SQUIRTLE_68 ("Squirtle", "68", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VOLTORB_69 ("Voltorb", "69", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ZUBAT_70 ("Zubat", "70", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HERE_COMES_TEAM_ROCKET_71 ("Here Comes Team Rocket!", "71", Rarity.RARE, [TRAINER]),
  ROCKETS_SNEAK_ATTACK_72 ("Rocket's Sneak Attack", "72", Rarity.RARE, [TRAINER]),
  THE_BOSSS_WAY_73 ("The Boss's Way", "73", Rarity.UNCOMMON, [TRAINER]),
  CHALLENGE_74 ("Challenge!", "74", Rarity.UNCOMMON, [TRAINER]),
  DIGGER_75 ("Digger", "75", Rarity.UNCOMMON, [TRAINER]),
  IMPOSTER_OAKS_REVENGE_76 ("Imposter Oak's Revenge", "76", Rarity.UNCOMMON, [TRAINER]),
  NIGHTLY_GARBAGE_RUN_77 ("Nightly Garbage Run", "77", Rarity.UNCOMMON, [TRAINER]),
  GOOP_GAS_ATTACK_78 ("Goop Gas Attack", "78", Rarity.COMMON, [TRAINER]),
  SLEEP_79 ("Sleep!", "79", Rarity.COMMON, [TRAINER]),
  RAINBOW_ENERGY_80 ("Rainbow Energy", "80", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  FULL_HEAL_ENERGY_81 ("Full Heal Energy", "81", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  POTION_ENERGY_82 ("Potion Energy", "82", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DARK_RAICHU_83 ("Dark Raichu", "83", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]);
  BOOST_ENERGY_84 ("Boost Energy", "84", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]);
  SCRAMBLE_ENERGY_85 ("Scramble Energy", "85", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]);
  ROCKETS_ENERGY_RF_86 ("Rocket's Energy RF", "86", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]);
  ROCKETS_ENERGY_GL_87 ("Rocket's Energy GL", "87", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]);
  ROCKETS_ENERGY_WP_88 ("Rocket's Energy WP", "88", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]);
  ROCKET_BALL_89 ("Rocket Ball ", "89", Rarity.UNCOMMON, [TRAINER]);
  POKEMON_RETRIVER_90 ("Pokémon Retriver", "90", Rarity.RARE, [TRAINER]);
  POW_HAND_EXTENTION_91 ("Pow! Hand Extention", "91", Rarity.RARE, [TRAINER]);
  SURPRISE_TIME_MACHINE_92 ("Surprise! Time Machine", "92", Rarity.RARE, [TRAINER]);
  SWOOP_TELEPORTER_93 ("Swoop! Teleporter", "93", Rarity.RARE, [TRAINER]);
  ROCKETS_DUNGEON_94 ("Rocket's Dungeon", "94", Rarity.UNCOMMON, [TRAINER, STADIUM]);
  ROCKETS_HIDEOUT_95 ("Rocket's Hideout", "95", Rarity.UNCOMMON, [TRAINER, STADIUM]);
  ROCKETS_ACE_IN_THE_HOLE_96 ("Rocket's Ace in the Hole", "96", Rarity.RARE, [TRAINER]);
  SUPER_ENERGY_CHARGE_97 ("Super Energy Charge", "97", Rarity.SECRET, [TRAINER, G_SPEC]);
  IMPOSTER_OAKS_MADNESS_98 ("Imposter Oak's Revenge", "98", Rarity.SECRET, [TRAINER, G_SPEC]);
  CELEBI_99 ("Celebi", "99", Rarity.SECRET, [BASIC, POKEMON, G_SPEC, _GRASS_]);
  MIRACLE_ENERGY_100 ("Miracle Energy", "100", Rarity.SECRET, [SPECIAL_ENERGY, ENERGY, G_SPEC]);
  DARK_CHARIZARD_101 ("Dark Charizard", "101", Rarity.SECRET, [STAGE2, POKEMON, EVOLUTION, _FIRE_]);
  DARK_DRAGONITE_102 ("Dark Dragonite", "102", Rarity.SECRET, [STAGE2, POKEMON, EVOLUTION, _COLORLESS_]);
  ROCKETS_ARTICUNO_EX_103 ("Rocket's Articuno ex", "103", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_MOLTRES_EX_104 ("Rocket's Moltres ex", "104", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_ZAPDOS_EX_105 ("Rocket's Zapdos ex", "105", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_MEWTWO_EX_106 ("Rocket's Mewtwo ex", "106", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_HITMONCHAN_EX_107 ("Rocket's Hitmonchan ex", "107", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_SCYTHER_EX_108 ("Rocket's Scyther ex", "108", Rarity.ULTRARARE, [BASIC, ]);
  ROCKETS_SNORLAX_EX_109 ("Rocket's Snorlax ex", "109", Rarity.ULTRARARE, [BASIC, ]);
  
    static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  PokemodTeamRocket(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_TEAM_ROCKET;
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
      case DARK_ALAKAZAM_1:
        return evolution (this, from:"Dark Kadabra", hp:HP080, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Teleport Blast", {
            text "30 damage. You may switch Dark Alakazam with 1 of your Benched Pokémon. (Do the damage before switching the Pokémon.)"
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 30
              if(my.bench){
                if(confirm("Switch Dark Alakazam with 1 of your Benched Pokémon?")) sw self, my.bench.select()
              }
            }
          }
          move "Mind Shock", {
            text "40 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
            energyCost P, P
            attackRequirement {}
            onAttack {
              noWrDamage(40,defending)
            }
          }

        };
      case DARK_ARBOK_2:
        return evolution (this, from:"Ekans", hp:HP060, type:GRASS, retreatCost:2) {
          weakness PSYCHIC
          move "Stare", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.) If that Pokémon has a Pokémon Power, that power stops working until the end of your opponent’s next turn."
            energyCost G
            attackRequirement {}
            onAttack {
              def tar = opp.all.select("Select the target for Stare")
              noWrDamage(10, tar)
              def effect1
              def effect2
              delayed{
                effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
                  if (h.effect.target ==  tar && h.effect.ability instanceof BwAbility) {
                    h.object=true
                  }
                }
                effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
                  if (h.effect.target ==  tar) {
                    h.object=true
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Poison Vapor", {
            text "20 damage. The Defending Pokémon is now Poisoned. This attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISONED
              if(opp.bench) opp.bench.each{damage 10, it}
            }
          }

        };
      case DARK_BLASTOISE_3:
        return evolution (this, from:"Dark Wartortle", hp:HP080, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Hydrocannon", {
            text "30+ damage. Does 30 damage plus 20 more damage for each [W] Energy attached to Dark Blastoise but not used to pay for this attack. You can’t add more than 40 damage in this way."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30
              extraEnergyDamage(2,hp(20),W,thisMove)
            }
          }
          move "Rocket Tackle", {
            text "40 damage. Dark Blastoise does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Dark Blastoise during your opponent’s next turn. (Any other effects of attacks still happen.)"
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              damage 10, self
              afterDamage{
                flip {preventAllDamageNextTurn()}
              }
            }
          }

        };
      case DARK_CHARIZARD_4:
        return copy (Rocket.DARK_CHARIZARD_4, this);
      case DARK_DRAGONITE_5:
        return evolution (this, from:"Dark Dragonair", hp:HP080, type:COLORLESS, retreatCost:2) {
          resistance FIGHTING, MINUS30
          pokemonPower "Summon Minions", {
            text "When you play Dark Dragonite from your hand, search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            onActivate{r->
              if(r==PLAY_FROM_HAND){
                if(my.bench.notFull){
                  def cnt = Math.min(my.bench.getFreeBenchCount(),2)
                  bc "$cnt"
                  my.deck.search (max: cnt,"Search for 2 basic pokemon",{it.cardTypes.is(BASIC)}).each {
                    benchPCS(it)
                  }
                  shuffleDeck()
                }
              }
            }
          }
          move "Giant Tail", {
            text "70 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              flip {damage 70}
            }
          }

        };
      case DARK_DUGTRIO_6:
        return evolution (this, from:"Diglett", hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          pokemonBody "Sinkhole", {
            text "Whenever your opponent’s Active Pokémon retreats, your opponent flips a coin. If tails, this power does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance.) This power stops working while Dark Dugtrio is Asleep, Confused, or Paralyzed."
            delayedA {
              before RETREAT, {
                if(ef.retreater.owner==self.owner.opposite){
                  def applyDmg = true
                  flip {applyDmg = false}
                  if(applyDmg) directDamage(20,ef.retreater)
                }
              }
            }
          }
          move "Knock Down", {
            text "20+ damage. You opponent flips a coin. If tails, this attack does 20 damage plus 20 more damage. If heads, this attack does 20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 1,{damage 20}, {damage 40}
            }
          }

        };
      case DARK_GOLBAT_7:
        return copy (Rocket.DARK_GOLBAT_7, this);
      case DARK_GYARADOS_8:
        return evolution (this, from:"Magikarp", hp:HP070, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokemonBody "Final Beam", {
            text "When Dark Gyarados is Knocked Out by an attack, flip a coin. If heads, this power does 20 damage for each [W] Energy attached to Dark Gyarados to the Pokémon that Knocked Out Dark Gyarados. Apply Weakness and Resistance. This power doesn’t work if Dark Gyarados is Asleep, Confused, or Paralyzed."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && !self.specialConditions){
                  def pcs = bg.currentTurn.pbg.active
                  new ResolvedDamage(hp(20*self.cards.energyCount(W)), self, pcs, Source.POKEMONPOWER, DamageManager.DamageFlag.FORCE_WEAKNESS_RESISTANCE).run(bg)
                  bg.dm().applyWeakness()
                  bg.dm().applyResistance()
                  def damage = bg.dm().getTotalDamage(self, pcs)
                  bg.dm().clearDamages()
                  bg.em().run(new DirectDamage(damage, pcs))
                }
              }
            }
          }
          move "Ice Beam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case DARK_HYPNO_9:
        return evolution (this, from:"Drowzee", hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Psypunch", {
            text "20 damage."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Bench Manipulation", {
            text "20× damage. You opponent flips a number of coins equal to the number of Pokémon on his or her Bench. This attack does 20 damage times the number of tails. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              flip opp.bench.size(),{},{damage 20}
            }
          }

        };
      case DARK_MACHAMP_10:
        return evolution (this, from:"Dark Machoke", hp:HP080, type:FIGHTING, retreatCost:3) {
          weakness PSYCHIC
          move "Mega Punch", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Fling", {
            text "Your opponent shuffles his or her Active Pokémon and all cards attached to it into his or her deck. This attack can’t be used if your opponent has no Benched Pokémon."
            energyCost F, F, F, C
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              shuffleDeck(opp.active.cards)
              removePCS(opp.active)
            }
          }

        };
      case DARK_MAGNETON_11:
        return evolution (this, from:"Magnemite", hp:HP060, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          move "Sonicboom", {
            text "20 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
            energyCost L
            attackRequirement {}
            onAttack {
              noWrDamage(20,defending)
            }
          }
          move "Magnetic Lines", {
            text "30 damage. If the Defending Pokémon has any basic Energy cards attached to it, choose 1 of them. If your opponent have any Benched Pokémon, choose 1 of them and attach that Energy card to it."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 30
              if(defending.cards.filterByType(BASIC_ENERGY) && opp.bench){
                def pcs = opp.bench.select()
                moveEnergy(basic : true, defending, pcs)
              }
            }
          }

        };
      case DARK_SLOWBRO_12:
        return evolution (this, from:"Slowpoke", hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokemonPower "Real In", {
            text "When you play Dark Slowbro from your hand, choose up to 3 Basic Pokémon and/or Evolution cards from you discard pile and put them into your hand."
            onActivate {r->
              if(r==PLAY_FROM_HAND && my.discard.filterByType(POKEMON)){
                my.discard.filterByType(POKEMON).select(count : 3).moveTo(my.hand)
              }
            }
          }
          move "Fickle Attack", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P, C
            attackRequirement {}
            onAttack {
              flip {damage 40}
            }
          }

        };
      case DARK_VILEPLUME_13:
        return evolution (this, from:"Dark Gloom", hp:HP060, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokemonBody "Hay Fever", {
            text "No Trainer cards can be played. This power stops working while Dark Vileplume is Asleep, Confused, or Paralyzed."
            delayedA {
              before PLAY_TRAINER, {
                if(!self.specialConditions){
                  wcu "Hay Fever prevents playing this card"
                  prevent()
                }
              }
            }
          }
          move "Petal Whirlwind", {
            text "30× damage. Flip a coins. This attack does 30 damage times the number of heads. If you get 2 or more heads, Dark Vileplume is now Confused (after doing damage)."
            energyCost G, G, G
            attackRequirement {}
            onAttack {
              def hdCnt = 0
              flip 3,{
                damage 30
                hdCnt += 1
              }
              if(hdCnt > 1){
                afterDamage {apply CONFUSED, self}
              }
            }
          }

        };
      case DARK_WEEZING_14:
        case DARK_WEEZING_14:
        return evolution (this, from:"Koffing", hp:HP060, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Mass Explosion", {
            text "20× damage. Does 20 damage times the number of Koffings, Weezings, and Dark Weezings in play. (Apply Weakness and Resistance.) Then, this attack does 20 damage to each Koffing, Weezing, and Dark Weezing (even your own). Don’t apply Weakness and Resistance."
            energyCost G, C
            attackRequirement {}
            onAttack {
              my.all.each{
                if(it.name == "Koffing" || it.name == "Weezing" || it.name == "Dark Weezing"){
                  damage 20
                  damage 20, it
                }
              }
              opp.all.each{
                if(it.name == "Koffing" || it.name == "Weezing" || it.name == "Dark Weezing"){
                  damage 20
                  damage 20, it
                }
              }
            }
          }
          move "Stun Gas", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
            energyCost G, G, Comes
            attackRequirement {}
            onAttack {
              damage 20
              flip 1,{applyAfterDamage POISONED},{applyAfterDamage PARALYZED}
            }
          }

        };
      case HERE_COMES_TEAM_ROCKET_15:
        return copy (Rocket.HERE_COMES_TEAM_ROCKET_15, this);
      case ROCKETS_SNEAK_ATTACK_16:
        breakcase ROCKETS_SNEAK_ATTACK_16:
        return basicTrainer (this) {
          text "Look at your opponent’s hand. If he or she has any Trainer cards, choose 1 of them. Your opponent shuffles that card into his or her deck."
          onPlay {
            def list = opp.hand.shuffledCopy().showToMe("Opponent's hand").filterByType(TRAINER)
            if(list){
              list.select(count: 1, "Discard").moveTo(opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
          playRequirement{
            assert opp.hand
          }
        };
      case RAINBOW_ENERGY_17:
        return copy (Rocket.RAINBOW_ENERGY_17, this);
      case DARK_ALAKAZAM_18:
        return copy (DARK_ALAKAZAM_1, this);
      case DARK_ARBOK_19:
        return copy (DARK_ARBOK_2, this);
      case DARK_BLASTOISE_20:
        return copy (DARK_BLASTOISE_3, this);
      case DARK_CHARIZARD_21:
        return copy (Rocket.DARK_CHARIZARD_4, this);
      case DARK_DRAGONITE_22:
        break
      case DARK_DUGTRIO_23:
        break
      case DARK_GOLBAT_24:
        return copy (Rocket.DARK_GOLBAT_7, this);
      case DARK_GYARADOS_25:
        break
      case DARK_HYPNO_26:
        break
      case DARK_MACHAMP_27:
        break
      case DARK_MAGNETON_28:
        break
      case DARK_SLOWBRO_29:
        break
      case DARK_VILEPLUME_30:
        break
      case DARK_WEEZING_31:
        break
      case DARK_CHARMELEON_32:
        break
      case DARK_DRAGONAIR_33:
        return copy (Rocket.DARK_DRAGONAIR_33, this);
      case DARK_ELECTRODE_34:
        break
      case DARK_FLAREON_35:
        break
      case DARK_GLOOM_36:
        return copy (Rocket.DARK_GLOOM_36, this);
      case DARK_GOLDUCK_37:
        return copy (Rocket.DARK_GOLDUCK_37, this);
      case DARK_JOLTEON_38:
        break
      case DARK_KADABRA_39:
        break
      case DARK_MACHOKE_40:
        break
      case DARK_MUK_41:
        break
      case DARK_PERSIAN_42:
        break
      case DARK_PRIMEAPE_43:
        break
      case DARK_RAPIDASH_44:
        break
      case DARK_VAPOREON_45:
        break
      case DARK_WARTORTLE_46:
        break
      case MAGIKARP_47:
        break
      case PORYGON_48:
        break
      case ABRA_49:
        return copy (Rocket.ABRA_49, this);
      case CHARMANDER_50:
        return copy (Rocket.CHARMANDER_50, this);
      case DARK_RATICATE_51:
        return copy (Rocket.DARK_RATICATE_51, this);
      case DIGLETT_52:
        return copy (Rocket.DIGLETT_52, this);
      case DRATINI_53:
        return copy (Rocket.DRATINI_53, this);
      case DROWZEE_54:
        return copy (Rocket.DROWZEE_54, this);
      case EEVEE_55:
        return copy (Rocket.EEVEE_55, this);
      case EKANS_56:
        break
      case GRIMER_57:
        break
      case KOFFING_58:
        return copy (Rocket.KOFFING_58, this);
      case MACHOP_59:
        return copy (Rocket.MACHOP_59, this);
      case MAGNEMITE_60:
        break
      case MANKEY_61:
        return copy (Rocket.MANKEY_61, this);
      case MEOWTH_62:
        return copy (Rocket.MEOWTH_62, this);
      case ODDISH_63:
        return copy (Rocket.ODDISH_63, this);
      case PONYTA_64:
        return copy (Rocket.PONYTA_64, this);
      case PSYDUCK_65:
        return copy (Rocket.PSYDUCK_65, this);
      case RATTATA_66:
        return copy (Rocket.RATTATA_66, this);
      case SLOWPOKE_67:
        return copy (Rocket.SLOWPOKE_67, this);
      case SQUIRTLE_68:
        break
      case VOLTORB_69:
        return copy (Rocket.VOLTORB_69, this);
      case ZUBAT_70:
        return copy (Rocket.ZUBAT_70, this);
      case HERE_COMES_TEAM_ROCKET_71:
        return copy (Rocket.HERE_COMES_TEAM_ROCKET_15, this);
      case ROCKETS_SNEAK_ATTACK_72:
        break
      case THE_BOSSS_WAY_73:
        return copy (Rocket.THE_BOSSS_WAY_73, this);
      case CHALLENGE_74:
        break
      case DIGGER_75:
        return copy (Rocket.DIGGER_75, this);
      case IMPOSTER_OAKS_REVENGE_76:
        break
      case NIGHTLY_GARBAGE_RUN_77:
        return copy (Rocket.NIGHTLY_GARBAGE_RUN_77, this);
      case GOOP_GAS_ATTACK_78:
        break
      case SLEEP_79:
        return copy (Rocket.SLEEP_79, this);
      case RAINBOW_ENERGY_80:
        return copy (Rocket.RAINBOW_ENERGY_17, this);
      case FULL_HEAL_ENERGY_81:
        return copy (Rocket.FULL_HEAL_ENERGY_81, this);
      case POTION_ENERGY_82:
        return copy (Rocket.POTION_ENERGY_82, this);
      case DARK_RAICHU_83:
        return copy (Rocket.DARK_RAICHU_83, this);
      case BOOST_ENERGY_84
        break
      case SCRAMBLE_ENERGY_85
        break
      case ROCKETS_ENERGY_RF_86
        break
      case ROCKETS_ENERGY_GL_87
        break
      case ROCKETS_ENERGY_WP_88
        break
      case ROCKET_BALL_89
        break
      case POKEMON_RETRIVER_90
        break
      case POW_HAND_EXTENTION_91
        break
      case SURPRISE_TIME_MACHINE_92
        break
      case SWOOP_TELEPORTER_93
        break
      case ROCKETS_DUNGEON_94
        break
      case ROCKETS_HIDEOUT_95
        break
      case ROCKETS_ACE_IN_THE_HOLE_96
        break
      case SUPER_ENERGY_CHARGE_97
        break
      case IMPOSTER_OAKS_MADNESS_98
        break
      case CELEBI_99
        break
      case MIRACLE_ENERGY_100
        break
      case DARK_CHARIZARD_101
        break
      case DARK_DRAGONITE_102
        break
      case ROCKETS_ARTICUNO_EX_103
        break
      case ROCKETS_MOLTRES_EX_104
        break
      case ROCKETS_ZAPDOS_EX_105
        break
      case ROCKETS_MEWTWO_EX_106
        break
      case ROCKETS_HITMONCHAN_EX_107
        break
      case ROCKETS_SCYTHER_EX_108
        break
      case ROCKETS_SNORLAX_EX_109
        break
      default:
        return null;
    }
  }

}
