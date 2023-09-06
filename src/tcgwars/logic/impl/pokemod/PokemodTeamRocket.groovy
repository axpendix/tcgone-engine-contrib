package tcgwars.logic.impl.pokemod

import tcgwars.logic.effect.gm.PlayCard
import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.impl.gen1.TeamRocket

import static tcgwars.logic.card.HP.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*
import org.apache.commons.lang.WordUtils
import tcgwars.entity.*
import tcgwars.logic.*
import tcgwars.logic.card.*
import tcgwars.logic.card.energy.*
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.card.trainer.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.advanced.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.blocking.*
import tcgwars.logic.effect.event.*
import tcgwars.logic.effect.getter.*
import tcgwars.logic.effect.special.*
import tcgwars.logic.util.*

/**
 * @author TheAquaPiplup
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
  DARK_RAICHU_83 ("Dark Raichu", "83", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  BOOST_ENERGY_84 ("Boost Energy", "84", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  SCRAMBLE_ENERGY_85 ("Scramble Energy", "85", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  ROCKETS_ENERGY_RF_86 ("Rocket's Energy RF", "86", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  ROCKETS_ENERGY_GL_87 ("Rocket's Energy GL", "87", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  ROCKETS_ENERGY_WP_88 ("Rocket's Energy WP", "88", Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  ROCKET_BALL_89 ("Rocket Ball ", "89", Rarity.UNCOMMON, [TRAINER]),
  POKEMON_RETRIVER_90 ("Pokémon Retriver", "90", Rarity.RARE, [TRAINER]),
  POW_HAND_EXTENTION_91 ("Pow! Hand Extention", "91", Rarity.RARE, [TRAINER]),
  SURPRISE_TIME_MACHINE_92 ("Surprise! Time Machine", "92", Rarity.RARE, [TRAINER]),
  SWOOP_TELEPORTER_93 ("Swoop! Teleporter", "93", Rarity.RARE, [TRAINER]),
  ROCKETS_DUNGEON_94 ("Rocket's Dungeon", "94", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ROCKETS_HIDEOUT_95 ("Rocket's Hideout", "95", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ROCKETS_ACE_IN_THE_HOLE_96 ("Rocket's Ace in the Hole", "96", Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_CHARGE_97 ("Super Energy Charge", "97", Rarity.SECRET, [TRAINER, G_SPEC]),
  IMPOSTER_OAKS_MADNESS_98 ("Imposter Oak's Revenge", "98", Rarity.SECRET, [TRAINER, G_SPEC]),
  CELEBI_99 ("Celebi", "99", Rarity.SECRET, [BASIC, POKEMON, G_SPEC, _GRASS_]),
  MIRACLE_ENERGY_100 ("Miracle Energy", "100", Rarity.SECRET, [SPECIAL_ENERGY, ENERGY, G_SPEC]),
  DARK_CHARIZARD_101 ("Dark Charizard", "101", Rarity.SECRET, [STAGE2, POKEMON, EVOLUTION, _FIRE_]),
  DARK_DRAGONITE_102 ("Dark Dragonite", "102", Rarity.SECRET, [STAGE2, POKEMON, EVOLUTION, _COLORLESS_]),
  ROCKETS_ARTICUNO_EX_103 ("Rocket's Articuno ex", "103", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_MOLTRES_EX_104 ("Rocket's Moltres ex", "104", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_ZAPDOS_EX_105 ("Rocket's Zapdos ex", "105", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_MEWTWO_EX_106 ("Rocket's Mewtwo ex", "106", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_HITMONCHAN_EX_107 ("Rocket's Hitmonchan ex", "107", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_SCYTHER_EX_108 ("Rocket's Scyther ex", "108", Rarity.ULTRARARE, [BASIC, ]),
  ROCKETS_SNORLAX_EX_109 ("Rocket's Snorlax ex", "109", Rarity.ULTRARARE, [BASIC, ]);

    static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  PokemodTeamRocket(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[])
    this.name = name
    this.rarity = rarity
    this.collectionLineNo = collectionLineNo
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes
  }

  @Override
  public String getName() {
    return name
  }

  @Override
  public Rarity getRarity() {
    return rarity
  }

  @Override
  public String getNumber() {
    return collectionLineNo
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.POKEMOD_TEAM_ROCKET
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name())
  }

  @Override
  public String getEnumName() {
    return this.name()
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

        }
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

        }
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

        }
      case DARK_CHARIZARD_4:
        return copy (TeamRocket.DARK_CHARIZARD_4, this)
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

        }
      case DARK_DUGTRIO_6:
        return evolution (this, from:"Diglett", hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          pokeBody "Sinkhole", {
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

        }
      case DARK_GOLBAT_7:
        return copy (TeamRocket.DARK_GOLBAT_7, this)
      case DARK_GYARADOS_8:
        return evolution (this, from:"Magikarp", hp:HP070, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Final Beam", {
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
              flipThenApplySC PARALYZED
            }
          }

        }
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

        }
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

        }
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

        }
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

        }
      case DARK_VILEPLUME_13:
        return evolution (this, from:"Dark Gloom", hp:HP060, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokeBody "Hay Fever", {
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

        }
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

        }
      case HERE_COMES_TEAM_ROCKET_15:
        return copy (TeamRocket.HERE_COMES_TEAM_ROCKET_15, this)
      case ROCKETS_SNEAK_ATTACK_16:
        return basicTrainer (this) {
          text "Look at your opponent’s hand. If he or she has any Trainer cards, choose 1 of them. Your opponent shuffles that card into his or her deck."
          onPlay {
            def list = opp.hand.shuffledCopy().showToMe("Opponent's hand").{it.cardTypes.is(TRAINER) && !it.cardTypes.is(SUPPORTER)}
            if(list){
              list.select(count: 1, "Discard").moveTo(opp.deck)
              shuffleOppDeck()
            }
          }
          playRequirement{
            assert opp.hand
          }
        }
      case RAINBOW_ENERGY_17:
        return copy (TeamRocket.RAINBOW_ENERGY_17, this)
      case DARK_ALAKAZAM_18:
        return copy (DARK_ALAKAZAM_1, this)
      case DARK_ARBOK_19:
        return copy (DARK_ARBOK_2, this)
      case DARK_BLASTOISE_20:
        return copy (DARK_BLASTOISE_3, this)
      case DARK_CHARIZARD_21:
        return copy (TeamRocket.DARK_CHARIZARD_4, this)
      case DARK_DRAGONITE_22:
        return copy (DARK_DRAGONITE_5, this)
      case DARK_DUGTRIO_23:
        return copy (DARK_DUGTRIO_6, this)
      case DARK_GOLBAT_24:
        return copy (TeamRocket.DARK_GOLBAT_7, this)
      case DARK_GYARADOS_25:
        return copy (DARK_GYARADOS_8, this)
      case DARK_HYPNO_26:
        return copy (DARK_HYPNO_9, this)
      case DARK_MACHAMP_27:
        return copy (DARK_MACHAMP_10, this)
      case DARK_MAGNETON_28:
        return copy (DARK_MAGNETON_11, this)
      case DARK_SLOWBRO_29:
        return copy (DARK_SLOWBRO_12, this)
      case DARK_VILEPLUME_30:
        return copy (DARK_VILEPLUME_13, this)
      case DARK_WEEZING_31:
        return copy (DARK_WEEZING_14, this)
      case DARK_CHARMELEON_32:
        return evolution (this, from:"Charmander", hp:HP060, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Tail Slap", {
            text "20 damage."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Fireball", {
            text "70 damage. Use this attack only if there are any [R] Energy cards attached to Dark Charmeleon. Flip a coin. If heads, discard 1 of those Energy cards. If tails, this attack does nothing (not even damage)."
            energyCost R, R, R
            attackRequirement {
              assert self.cards.energyCount(R)
            }
            onAttack {
              flip {
                damage 70
                discardSelfEnergy R
              }
            }
          }

        }
      case DARK_DRAGONAIR_33:
        return copy (TeamRocket.DARK_DRAGONAIR, this)
      case DARK_ELECTRODE_34:
        return evolution (this, from:"Voltorb", hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Rolling Tackle", {
            text "20 damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Energy Bomb", {
            text "30 damage. Take all Energy cards attached to Dark Electrode and attach them to your Benched Pokémon (in any way you choose). If you have no Benched Pokémon, discard all Energy cards attached to Dark Electrode."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 30
              if(my.bench){
                while(self.cards.energyCount(C)){
                  moveEnergy(self,my.bench)
                }
              }
              else{
                discardAllSelfEnergy null
              }
            }
          }

        }
      case DARK_FLAREON_35:
        return evolution (this, from:"Eevee", hp:HP060, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dark Flareon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }
          move "Flaying with Fire", {
            text "30+ damage. Use this attack only if there are any [R] Energy cards attached to Dark Flareon. Flip a coin. If heads, discard 1 of those Energy cards and this attack does 30 damage plus 20 more damage. If tails, this attack does 30 damage."
            energyCost R, R
            attackRequirement {
              assert self.cards.energyCount(R)
            }
            onAttack {
              flip 1,{
                damage 50
                discardSelfEnergy R
              },{
                damage 30
              }
            }
          }

        }
      case DARK_GLOOM_36:
        return copy (TeamRocket.DARK_GLOOM, this)
      case DARK_GOLDUCK_37:
        return copy (TeamRocket.DARK_GOLDUCK, this)
      case DARK_JOLTEON_38:
        return evolution (this, from:"Eevee", hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Lightning Flash", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              sandAttack(thisMove)
            }
          }
          move "Thunder Attack", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, Dark Jolteon does 10 damage to itself."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1,{applyAfterDamage PARALYZED},{damage 10, self}
            }
          }

        }
      case DARK_KADABRA_39:
        return evolution (this, from:"Abra", hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokemonPower "Matter Exchange", {
            text "Once during your turn (before your attack), you may discard a card from your hand in order to draw a card. This power can’t be used if Dark Kadabra is Asleep, Confused, or Paralyzed."
            actionA {
              checkLastTurn()
              assert my.deck
              assert my.hand
              assert !self.specialConditions
              powerUsed()
              my.hand.select().discard()
              draw 1
            }
          }
          move "Mind Shock", {
            text "30 damage. Don’t apply Weakness and Resistance for this attack. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
            energyCost P, P
            attackRequirement {}
            onAttack {
              noWrDamage(30,defending)

            }
          }

        }
      case DARK_MACHOKE_40:
        return evolution (this, from:"Machop", hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Drag Off", {
            text "20 damage. Before doing damage, choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. Do the damage to the new Defending Pokémon. This attack can’t be used if your opponent has not Benched Pokémon."
            energyCost F, C, C
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              def pcs = opp.bench.select("Switch")
              sw opp.active, pcs
              damage 20
            }
          }
          move "Knock Back", {
            text "30 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              if(opp.bench){
                def pcs = opp.bench.oppSelect("Switch")
                sw opp.active, pcs
              }
              damage 30
            }
          }

        }
      case DARK_MUK_41:
        return evolution (this, from:"Grimer", hp:HP060, type:GRASS, retreatCost:2) {
          weakness PSYCHIC
          pokeBody "Sticky Goo", {
            text "As long as Dark Muk is your Active Pokémon, your opponent pays [C][C] more to retreat his or her Active Pokémon. This power stops working while Dark Muk is Asleep, Confused, or Paralyzed."
            getterA (GET_RETREAT_COST) { h->
              if(h.effect.target.owner == self.owner.opposite && self.active) {
                h.object += 2
              }
            }
          }
          move "Sludge Punch", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }

        }
      case DARK_PERSIAN_42:
        return evolution (this, from:"Meowth", hp:HP060, type:COLORLESS, retreatCost:0) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Fascinate", {
            text "Flip a coin. If heads, choose 1 of your opponent’s Benched Pokémon and switch it with the Defending Pokémon. This attack can’t be used if your opponent has no Benched Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "There is no Benched Pokémon"
            }
            onAttack {
              flip{
                def pcs = opp.bench.select("Switch")
                sw opp.active, pcs
              }
            }
          }
          move "Poison Claws", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC POISONED
            }
          }

        }
      case DARK_PRIMEAPE_43:
        return evolution (this, from:"Mankey", hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Frenzy", {
            text "If Dark Primeape does any damage while it’s Confused (even to itself), it does 30 more damage."
            delayedA {
              before APPLY_DAMAGES, {
                if(self.isSPC(CONFUSED)){
                  bg.dm().each {
                    if(it.from == self && it.dmg.value) {
                      bc "Frenzy +30"
                      it.dmg += hp(30)
                    }
                  }
                }
              }
            }
          }
          move "Frenzied Attack", {
            text "40 damage. Dark Primeape is now Confused (after doing damage)."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage{apply CONFUSED, self}
            }
          }

        }
      case DARK_RAPIDASH_44:
        return evolution (this, from:"Ponyta", hp:HP060, type:FIRE, retreatCost:0) {
          weakness WATER
          move "Rear Kick", {
            text "20 damage."
            energyCost R
            onAttack {
              damage 20
            }
          }
          move "Flame Pillar", {
            text "30 damage. You may discard 1 [R] Energy card attached to Dark Rapidash when you use this attack. If you do and your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              if(confirm("discard 1 [R] Energy card attached to Dark Rapidash to do 10 damage to one of your opponent's Benched Pokémon")){
                discardSelfEnergy R
                if(opp.bench){
                  damage 10, opp.bench.select()
                }
              }
            }
          }
        }
      case DARK_VAPOREON_45:
        return evolution (this, from:"Eevee", hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Bite", {
            text "30 damage."
            energyCost W, C
            onAttack {
              damage 30
            }
          }
          move "Whirlpool", {
            text "20 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 20
              discardDefendingEnergy()
            }
          }

        }
      case DARK_WARTORTLE_46:
        return evolution (this, from:"Squirtle", hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Doubleslap", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost W
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }
          move "Mirror Shell", {
            text "If an attack does damage to Dark Wartortle during your opponent’s next turn (even if Dark Wartortle is Knocked Out), Dark Wartortle attacks the Defending Pokémon for an equal amount of damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  def pcs
                  def dmgVal = 0
                  bg.dm().each {
                    if(bg.currentTurn==self.owner.opposite && it.to == self) {
                      pcs = it.from
                      dmgVal = it.dmg.value
                    }
                  }
                  if(dmgVal){
                    new ResolvedDamage(hp(dmgVal), self, pcs, Source.ATTACK, DamageManager.DamageFlag.FORCE_WEAKNESS_RESISTANCE).run(bg)
                    bg.dm().applyWeakness()
                    bg.dm().applyResistance()
                    /*def damage = bg.dm().getTotalDamage(self, pcs)
										bg.dm().clearDamages()
										bg.em().run(new DirectDamage(damage, pcs))*/
                  }
                }
                after FALL_BACK, self, {unregister()}
                after CHANGE_STAGE, self, {unregister()}

                unregisterAfter 2
              }
            }
          }

        }
      case MAGIKARP_47:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Flop", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Rapid Evolution", {
            text "Search your deck for an Evolution card named Gyarados or Dark Gyarados and put it on Magikarp. (This counts as evolving Magikarp.) Shuffle your deck afterward."
            energyCost W
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor && (it.name == "Gyarados" || it.name == "Dark Gyarados")})
              if(tar) evolve(self, tar.first())
              shuffleDeck()
            }
          }

        }
      case PORYGON_48:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
          resistance PSYCHIC, MINUS30
          move "Conversion 1", {
            text "If the Defending Pokémon has a Weakness, you may change it to a type of your choice other than Colorless."
            energyCost C
            attackRequirement {
            }
            onAttack {
              targeted (defending) {
                delayed {
                  if(opp.active.weaknesses)
                  {
                    def newWeakness = choose([R,F,G,W,P,L,M,D,Y,N],"Select the new weakness")
                    bc "${defending}'s Weakness is now ${newWeakness}"
                    def eff
                    register {
                      eff = getter (GET_WEAKNESSES, defending) {h->
                        def list = h.object as List<Weakness>
                        if(list) {
                          list.get(0).type = newWeakness
                        }
                      }
                    }
                    unregister {
                      eff.unregister()
                    }
                    after FALL_BACK, defending, {unregister()}
                    after CHANGE_STAGE, defending, {unregister()}
                  }
                }
              }
            }
          }
          move "Psybeam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC CONFUSED
            }
          }

        }
      case ABRA_49:
        return copy (TeamRocket.ABRA, this)
      case CHARMANDER_50:
        return copy (TeamRocket.CHARMANDER, this)
      case DARK_RATICATE_51:
        return copy (TeamRocket.DARK_RATICATE, this)
      case DIGLETT_52:
        return copy (TeamRocket.DIGLETT, this)
      case DRATINI_53:
        return copy (TeamRocket.DRATINI, this)
      case DROWZEE_54:
        return copy (TeamRocket.DROWZEE, this)
      case EEVEE_55:
        return copy (TeamRocket.EEVEE, this)
      case EKANS_56:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Bite", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Poison Sting", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC POISONED
            }
          }

        }
      case GRIMER_57:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Poison Gas", {
            text "The Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }
          move "Sticky Hands", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage and the Defending Pokémon is now Paralyzed. If tails, this attack does 10 damage."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 20
                applyAfterDamage PARALYZED
              }
            }
          }

        }
      case KOFFING_58:
        return copy (TeamRocket.KOFFING, this)
      case MACHOP_59:
        return copy (TeamRocket.MACHOP, this)
      case MAGNEMITE_60:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Tackle", {
            text "20 damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Magnetism", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Magnemite, Magneton, and Dark Magneton on your Bench."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 10+10*my.bench.findAll({it.name == "Magnemite" || it.name == "Magneton" || it.name == "Dark Magneton"}).size()
            }
          }

        }
      case MANKEY_61:
        return copy (TeamRocket.MANKEY, this)
      case MEOWTH_62:
        return copy (TeamRocket.MEOWTH, this)
      case ODDISH_63:
        return copy (TeamRocket.ODDISH, this)
      case PONYTA_64:
        return copy (TeamRocket.PONYTA, this)
      case PSYDUCK_65:
        return copy (TeamRocket.PSYDUCK, this)
      case RATTATA_66:
        return copy (TeamRocket.RATTATA, this)
      case SLOWPOKE_67:
        return copy (TeamRocket.SLOWPOKE, this)
      case SQUIRTLE_68:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Shell Attack", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        }
      case VOLTORB_69:
        return copy (TeamRocket.VOLTORB, this)
      case ZUBAT_70:
        return copy (TeamRocket.ZUBAT, this)
      case HERE_COMES_TEAM_ROCKET_71:
        return copy (TeamRocket.HERE_COMES_TEAM_ROCKET_15, this)
      case ROCKETS_SNEAK_ATTACK_72:
        return copy (ROCKETS_SNEAK_ATTACK_16, this)
      case THE_BOSSS_WAY_73:
        return copy (TeamRocket.THE_BOSSS_WAY, this)
      case CHALLENGE_74:
        break
      case DIGGER_75:
        return copy (TeamRocket.DIGGER, this)
      case IMPOSTER_OAKS_REVENGE_76:
        break
      case NIGHTLY_GARBAGE_RUN_77:
        return copy (TeamRocket.NIGHTLY_GARBAGE_RUN, this)
      case GOOP_GAS_ATTACK_78:
        break
      case SLEEP_79:
        return copy (TeamRocket.SLEEP, this)
      case RAINBOW_ENERGY_80:
        return copy (TeamRocket.RAINBOW_ENERGY_17, this)
      case FULL_HEAL_ENERGY_81:
        return copy (TeamRocket.FULL_HEAL_ENERGY, this)
      case POTION_ENERGY_82:
        return copy (TeamRocket.POTION_ENERGY, this)
      case DARK_RAICHU_83:
        return copy (TeamRocket.DARK_RAICHU, this)
      case BOOST_ENERGY_84:
        break
      case SCRAMBLE_ENERGY_85:
        break
      case ROCKETS_ENERGY_RF_86:
        break
      case ROCKETS_ENERGY_GL_87:
        break
      case ROCKETS_ENERGY_WP_88:
        break
      case ROCKET_BALL_89:
        return basicTrainer (this) {
          text "Flip 2 coins. For each heads, search your deck for a Pokémon with Dark in its name. Show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          def searchCnt = 0
          flip 2, { searchCnt++ }
          if (searchCnt) {
            my.deck.search(max: searchCnt, "Select a Pokémon with Dark in its name",{it.cardTypes.is(POKEMON) && it.name.contains("Dark ")}).showToOpponent("Selected card.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        }
        //make so coinflip
      case POKEMON_RETRIVER_90:
        return basicTrainer (this) {
          text "Flip 2 coins. If you get a heads, search your discard pile for Basic Pokémon and Evolution cards. You may either show up to 2 Basic Pokémon and/or Evolution cards to your opponent and put them into your hand, or show a combination of up to 4 Basic Pokémon and/or Evolution cards to your opponent and shuffle them into your deck."
          onPlay {
            def choice = choose([0,1],["Select 2 card : put it in your hand","Select 4 cards : shuffle them in your deck"],"What do you want to do?")
            if(choice){
              my.discard.filterByType(BASIC, EVOLUTION).select(count : 4,"Select a combination of 4 Basic Pokémon or Evolution cards.").showToOpponent("Opponent used Pokemon Retriever to shuffle these cards into their deck").moveTo(my.deck)
              shuffleDeck()
            }
            else{
              my.discard.filterByType(BASIC, EVOLUTION).select(count : 1,"Select 1 Basic Pokémon or Evolution").showToOpponent("Opponent used Pokemon Retriever to put this card into their hand").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.discard.filterByType(BASIC, EVOLUTION)
          }
        }
      case POW_HAND_EXTENTION_91:
        break
      case SURPRISE_TIME_MACHINE_92:
        break
      case SWOOP_TELEPORTER_93:
        break
      case ROCKETS_DUNGEON_94:
        break
      case ROCKETS_HIDEOUT_95:
        break
      case ROCKETS_ACE_IN_THE_HOLE_96:
        break
      case SUPER_ENERGY_CHARGE_97:
        break
      case IMPOSTER_OAKS_MADNESS_98:
        break
      case CELEBI_99:
        break
      case MIRACLE_ENERGY_100:
        break
      case DARK_CHARIZARD_101:
        break
      case DARK_DRAGONITE_102:
        break
      case ROCKETS_ARTICUNO_EX_103:
        break
      case ROCKETS_MOLTRES_EX_104:
        break
      case ROCKETS_ZAPDOS_EX_105:
        break
      case ROCKETS_MEWTWO_EX_106:
        break
      case ROCKETS_HITMONCHAN_EX_107:
        break
      case ROCKETS_SCYTHER_EX_108:
        break
      case ROCKETS_SNORLAX_EX_109:
        break
      default:
        return null
    }
  }

}
