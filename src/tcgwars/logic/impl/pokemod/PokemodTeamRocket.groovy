package tcgwars.logic.impl.pokemod

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
        break
      case DARK_ARBOK_2:
        break
      case DARK_BLASTOISE_3:
        break
      case DARK_CHARIZARD_4:
        break
      case DARK_DRAGONITE_5:
        break
      case DARK_DUGTRIO_6:
        break
      case DARK_GOLBAT_7:
        break
      case DARK_GYARADOS_8:
        break
      case DARK_HYPNO_9:
        break
      case DARK_MACHAMP_10:
        break
      case DARK_MAGNETON_11:
        break
      case DARK_SLOWBRO_12:
        break
      case DARK_VILEPLUME_13:
        return evolution (this, from:"Dark Gloom", hp:HP060, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokemonBody "Hay Fever", {
            text "No Trainer cards can be played. This power stops working while Dark Vileplume is Asleep, Confused, or Paralyzed."
            delayedA { /*{it.cardTypes.is(TRAINER) && !it.cardTypes.is(SUPPORTER)}*/
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
        break
      case HERE_COMES_TEAM_ROCKET_15:
        break
      case ROCKETS_SNEAK_ATTACK_16:
        case ROCKETS_SNEAK_ATTACK_16:
        return basicTrainer (this) {
          text "Look at your opponent’s hand. If he or she has any Trainer cards, choose 1 of them. Your opponent shuffles that card into his or her deck."
          onPlay {
            def list = opp.hand.shuffledCopy().showToMe("Opponent's hand").{it.cardTypes.is(TRAINER) && !it.cardTypes.is(SUPPORTER)}
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
        break
      case DARK_ALAKAZAM_18:
        break
      case DARK_ARBOK_19:
        break
      case DARK_BLASTOISE_20:
        break
      case DARK_CHARIZARD_21:
        break
      case DARK_DRAGONITE_22:
        return copy (DARK_DRAGONITE_5, this);
      case DARK_DUGTRIO_23:
        return copy (DARK_DUGTRIO_6, this);
      case DARK_GOLBAT_24:
        break
      case DARK_GYARADOS_25:
        return copy (DARK_GYARADOS_8, this);
      case DARK_HYPNO_26:
        return copy (DARK_HYPNO_9, this);
      case DARK_MACHAMP_27:
        return copy (DARK_MACHAMP_10, this);
      case DARK_MAGNETON_28:
        return copy (DARK_MAGNETON_11, this);
      case DARK_SLOWBRO_29:
        return copy (DARK_SLOWBRO_12, this);
      case DARK_VILEPLUME_30:
        return copy (DARK_VILEPLUME_13, this);
      case DARK_WEEZING_31:
        return copy (DARK_WEEZING_14, this);
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

        };
      case DARK_DRAGONAIR_33:
        break
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

        };
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

        };
      case DARK_GLOOM_36:
        break
      case DARK_GOLDUCK_37:
        break
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

        };
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

        };
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

        };
      case DARK_MUK_41:
        return evolution (this, from:"Grimer", hp:HP060, type:GRASS, retreatCost:2) {
          weakness PSYCHIC
          pokemonBody "Sticky Goo", {
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

        };
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
              afterDamage {flipThenApplySC POISONED}
            }
          }

        };
      case DARK_PRIMEAPE_43:
        return evolution (this, from:"Mankey", hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          pokemonBody "Frenzy", {
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

        };
      case DARK_RAPIDASH_44:
        return evolution (this, from:"Ponyta", hp:HP060, type:FIRE, retreatCost:0) {
          weakness WATER
          move "Rear Kick", {
            text "20 damage."
            energyCost R
            attackRequirement {}
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
        };
      case DARK_VAPOREON_45:
        return evolution (this, from:"Eevee", hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Bite", {
            text "30 damage."
            energyCost W, C,
            attackRequirement {}
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

        };
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
                after EVOLVE, self, {unregister()}
                after DEVOLVE, self, {unregister()}

                unregisterAfter 2
              }
            }
          }

        };
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
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }

        };
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
                    after EVOLVE, defending, {unregister()}
                    after DEVOLVE, defending, {unregister()}
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
              afterDamage {flipThenApplySC CONFUSED}
            }
          }

        };
      case ABRA_49:
        break
      case CHARMANDER_50:
        break
      case DARK_RATICATE_51:
        break
      case DIGLETT_52:
        break
      case DRATINI_53:
        break
      case DROWZEE_54:
        break
      case EEVEE_55:
        break
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
              afterDamage {flipThenApplySC POISONED}
            }
          }

        };
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

        };
      case KOFFING_58:
        break
      case MACHOP_59:
        break
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

        };
      case MANKEY_61:
        break
      case MEOWTH_62:
        break
      case ODDISH_63:
        break
      case PONYTA_64:
        break
      case PSYDUCK_65:
        break
      case RATTATA_66:
        break
      case SLOWPOKE_67:
        break
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

        };
      case VOLTORB_69:
        break
      case ZUBAT_70:
        break
      case HERE_COMES_TEAM_ROCKET_71:
        break
      case ROCKETS_SNEAK_ATTACK_72:
        return copy (ROCKETS_SNEAK_ATTACK_16, this);
      case THE_BOSSS_WAY_73:
        break
      case CHALLENGE_74:
        break
      case DIGGER_75:
        break
      case IMPOSTER_OAKS_REVENGE_76:
        break
      case NIGHTLY_GARBAGE_RUN_77:
        break
      case GOOP_GAS_ATTACK_78:
        break
      case SLEEP_79:
        break
      case RAINBOW_ENERGY_80:
        break
      case FULL_HEAL_ENERGY_81:
        break
      case POTION_ENERGY_82:
        break
      case DARK_RAICHU_83:
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
        };
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
        };
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
        return null;
    }
  }

}
