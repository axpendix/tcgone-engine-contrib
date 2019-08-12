package tcgwars.logic.impl.gen4;

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
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
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
public enum Unleashed implements CardInfo {

  JIRACHI_1 ("Jirachi", 1, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  MAGMORTAR_2 ("Magmortar", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MANAPHY_3 ("Manaphy", 3, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  METAGROSS_4 ("Metagross", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  MISMAGIUS_5 ("Mismagius", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  OCTILLERY_6 ("Octillery", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  POLITOED_7 ("Politoed", 7, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  SHAYMIN_8 ("Shaymin", 8, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SUDOWOODO_9 ("Sudowoodo", 9, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  TORTERRA_10 ("Torterra", 10, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  XATU_11 ("Xatu", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  BEEDRILL_12 ("Beedrill", 12, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BLASTOISE_13 ("Blastoise", 13, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  CROBAT_14 ("Crobat", 14, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  FEAROW_15 ("Fearow", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FLOATZEL_16 ("Floatzel", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KINGDRA_17 ("Kingdra", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  LANTURN_18 ("Lanturn", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LUCARIO_19 ("Lucario", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NINETALES_20 ("Ninetales", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  POLIWRATH_21 ("Poliwrath", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PRIMEAPE_22 ("Primeape", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ROSERADE_23 ("Roserade", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  STEELIX_24 ("Steelix", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TORKOAL_25 ("Torkoal", 25, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  TYRANITAR_26 ("Tyranitar", 26, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  URSARING_27 ("Ursaring", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  CHERRIM_28 ("Cherrim", 28, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DUNSPARCE_29 ("Dunsparce", 29, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GOLBAT_30 ("Golbat", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GROTLE_31 ("Grotle", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KAKUNA_32 ("Kakuna", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  METANG_33 ("Metang", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MINUN_34 ("Minun", 34, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  NUMEL_35 ("Numel", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  PLUSLE_36 ("Plusle", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  POLIWHIRL_37 ("Poliwhirl", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PUPITAR_38 ("Pupitar", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PUPITAR_39 ("Pupitar", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEADRA_40 ("Seadra", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TAUROS_41 ("Tauros", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WARTORTLE_42 ("Wartortle", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  AIPOM_43 ("Aipom", 43, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BELDUM_44 ("Beldum", 44, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BUIZEL_45 ("Buizel", 45, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CARNIVINE_46 ("Carnivine", 46, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHERUBI_47 ("Cherubi", 47, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHINCHOU_48 ("Chinchou", 48, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  HORSEA_49 ("Horsea", 49, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  LARVITAR_50 ("Larvitar", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LARVITAR_51 ("Larvitar", 51, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGMAR_52 ("Magmar", 52, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MANKEY_53 ("Mankey", 53, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MISDREAVUS_54 ("Misdreavus", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NATU_55 ("Natu", 55, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ONIX_56 ("Onix", 56, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ONIX_57 ("Onix", 57, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  POLIWAG_58 ("Poliwag", 58, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  REMORAID_59 ("Remoraid", 59, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RIOLU_60 ("Riolu", 60, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ROSELIA_61 ("Roselia", 61, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SPEAROW_62 ("Spearow", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_63 ("Squirtle", 63, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STANTLER_64 ("Stantler", 64, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TEDDIURSA_65 ("Teddiursa", 65, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TROPIUS_66 ("Tropius", 66, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TURTWIG_67 ("Turtwig", 67, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VULPIX_68 ("Vulpix", 68, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WEEDLE_69 ("Weedle", 69, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ZUBAT_70 ("Zubat", 70, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CHEERLEADER_S_CHEER_71 ("Cheerleader's Cheer", 71, Rarity.UNCOMMON, [TRAINER]),
  DUAL_BALL_72 ("Dual Ball", 72, Rarity.UNCOMMON, [TRAINER]),
  EMCEE_S_CHATTER_73 ("Emcee's Chatter", 73, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETURNER_74 ("Energy Returner", 74, Rarity.UNCOMMON, [TRAINER]),
  ENGINEER_S_ADJUSTMENTS_75 ("Engineer's Adjustments", 75, Rarity.UNCOMMON, [TRAINER]),
  GOOD_ROD_76 ("Good Rod", 76, Rarity.UNCOMMON, [TRAINER]),
  INTERVIEWER_S_QUESTIONS_77 ("Interviewer's Questions", 77, Rarity.UNCOMMON, [TRAINER]),
  JUDGE_78 ("Judge", 78, Rarity.UNCOMMON, [TRAINER]),
  LIFE_HERB_79 ("Life Herb", 79, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_80 ("PlusPower", 80, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CIRCULATOR_81 ("Pokémon Circulator", 81, Rarity.UNCOMMON, [TRAINER]),
  RARE_CANDY_82 ("Rare Candy", 82, Rarity.UNCOMMON, [TRAINER]),
  SUPER_SCOOP_UP_83 ("Super Scoop Up", 83, Rarity.UNCOMMON, [TRAINER]),
  CROBAT_84 ("Crobat", 84, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  KINGDRA_85 ("Kingdra", 85, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  LANTURN_86 ("Lanturn", 86, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  STEELIX_87 ("Steelix", 87, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TYRANITAR_88 ("Tyranitar", 88, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  URSARING_89 ("Ursaring", 89, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ENTEI_AND_RAIKOU_LEGEND_90 ("Entei & Raikou LEGEND", 90, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_, LEGEND]),
  ENTEI_AND_RAIKOU_LEGEND_91 ("Entei & Raikou LEGEND", 91, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_, LEGEND]),
  RAIKOU_AND_SUICUNE_LEGEND_92 ("Raikou & Suicune LEGEND", 92, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  RAIKOU_AND_SUICUNE_LEGEND_93 ("Raikou & Suicune LEGEND", 93, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  SUICUNE_AND_ENTEI_LEGEND_94 ("Suicune & Entei LEGEND", 94, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  SUICUNE_AND_ENTEI_LEGEND_95 ("Suicune & Entei LEGEND", 95, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_, LEGEND]),
  ALPH_LITHOGRAPH_TWO ("Alph Lithograph", 96, Rarity.HOLORARE, [TRAINER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Unleashed(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.UNLEASHED;
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
      case JIRACHI_1:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Stardust Song", {
            text "Once during your turn, when you put Jirachi from you hand onto your Bench, you may flip 3 coins. For each heads, search your discard pile for a [P] Energy card and attach it to Jirachi."
            actionA {
              onActivate {reason ->
                if(reason == PLAY_FROM_HAND && my.discard.findAll{it.cards.filterByEnergyType(P)}.size() && confirm("Use Stardust Song?")){
                  powerUsed()
                  flip 3, {attachEnergyFrom(type: P, my.discard, self)}
                }
              }
            }
          }
          move "Time Hollow", {
            text "Choose a number of your opponent’s Stage 1 or Stage 2 Evolved Pokémon up to the amount of Energy attached to Jirachi. Remove the highest Stage Evolution card from each of those Pokémon and put those cards back into your opponent’s hand."
            energyCost P
            attackRequirement {}
            onAttack {
              opp.all.findAll{ it.evolution }.select(min:0, max:self.cards.energyCount(C), "Choose which Pokemon to devolve").each{
                def top=defending.topPokemonCard
                bc "$top Devolved"
                moveCard(top, opp.hand)
                devolve(defending, top)
              }
            }
          }

        };
      case MAGMORTAR_2:
        return evolution (this, from:"Magmar", hp:HP110, type:FIRE, retreatCost:2) {
          weakness W
          move "Hard Crush", {
            text "Discard the top 3 cards from your deck. This attack does 50 damage times the number of Energy cards you discarded."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              def list = my.deck.subList(0,3).discard()
              def numEnergy = list.filterByType(ENERGY).size()
              damage 50*numEnergy
              bc "Discarded $numEnergy Energy cards"
            }
          }
          move "Mantle Bazooka", {
            text "100 damage. Discard 2 [R] Energy attached to Magmortar."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 100
              discardSelfEnergy R, R
            }
          }

        };
      case MANAPHY_3:
        return basic (this, hp:HP060, type:WATER, retreatCost:0) {
          weakness L
          move "Deep Sea Swirl", {
            text "Shuffle your hand into your deck. Then, draw 5 cards."
            energyCost C
            attackRequirement {}
            onAttack {
              shuffleDeck(hand)
              hand.clear()
              draw 5
            }
          }
          move "Wave Splash", {
            text "20 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case METAGROSS_4:
        return evolution (this, from:"Metang", hp:HP130, type:PSYCHIC, retreatCost:4) {
          weakness P
          pokeBody "Psychic Float", {
            text "If you have any [P] Energy attached to your Active Pokémon, the Retreat Cost for that Pokémon is 0."
            delayedA {
              getterA (GET_RETREAT_COST,BEFORE_LAST) {h->
                if(h.effect.target.owner == self.owner && h.effect.target.cards.energyCount(P)) {
                  h.object = 0
                }
              }
            }
          }
          move "Pulse Blast", {
            text "60 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Double Leg Hammer", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 40 damage to each of them."
            energyCost P, P, P
            attackRequirement {
              assert opp.bench : "No Pokemon on your opponent's bench"
            }
            onAttack {
              damage 40, opp.bench.select(min: 1, max: 2)
            }
          }

        };
      case MISMAGIUS_5:
        return evolution (this, from:"Misdreavus", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          pokePower "Magical Trans", {
            text "Once during your turn , you may move a [P] Energy attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Mismagius is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.size() > 1 && my.all.findAll{ it.cards.filterByEnergyType(P) } : "Insufficent targets"
              powerUsed()
              moveEnergy(type: P, my.all, my.all)
            }
          }
          move "Psychic Pulse", {
            text "30 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              opp.bench.findAll{ it.cards.numberOfDamageCounters }.each{ damage 10 }
            }
          }

        };
      case OCTILLERY_6:
        return evolution (this, from:"Remoraid", hp:HP080, type:WATER, retreatCost:2) {
          weakness L
          move "Switch Cannon", {
            text "Switch Octillery with 1 of your Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              switchYourActive()
            }
          }
          move "Ink Bomb", {
            text "50 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              sandAttack(thisMove)
            }
          }

        };
      case POLITOED_7:
        return evolution (this, from:"Poliwhirl", hp:HP120, type:WATER, retreatCost:2) {
          weakness L
          pokePower "Leap Frog", {
            text "Once during your turn , you may choose a [W] Pokémon on your Bench and switch it with your Active Pokémon. This power can’t be used if Politoed is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.bench.findAll{it.types.contains(W)} : "No benched Water Pokemon"
              powerUsed()
              sw my.active, my.bench.findAll{it.types.contains(W)}.select()
            }
          }
          move "Big Chorus", {
            text "Flip a coin for each [W] Pokémon you have in play. This attack does 30 damage times the number of heads."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              flip my.all.findAll{it.types.contains(W)}.size(), {damage 30}
            }
          }

        };
      case SHAYMIN_8:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R
          resistance F, MINUS20
          pokePower "Celebration Wind", {
            text "Once during your turn, when you put Shaymin from you hand onto your Bench, you may move as many Energy cards attached to your Pokémon as you like to any of your other Pokémon."
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm('Use Celebration Wind?')){
                powerUsed()
                while(1){
                  def pl=(my.all.findAll {it.cards.filterByType(ENERGY)})
                  if(!pl) break;
                  def src =pl.select("Source for energy (cancel to stop)", false)
                  if(!src) break;
                  def card=src.cards.filterByType(ENERGY).select("Energy to move").first()

                  def tar=my.all.select("Target for energy (cancel to stop)", false)
                  if(!tar) break;
                  energySwitch(src, tar, card)
                }
              }
            }
          }
          move "Energy Bloom", {
            text "30 damage. Remove 3 damage counters from each of your Pokémon that has any Energy attached to it."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              my.all.findAll{it.cards.energyCount()}.each {heal 30, it}
            }
          }

        };
      case SUDOWOODO_9:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness W
          move "Push Over", {
            text "Does 20 damage times the amount of [F] Energy attached to Sudowoodo."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20*self.cards.energyCount(F)
            }
          }
          move "Rumble", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              cantRetreat defending
            }
          }

        };
      case TORTERRA_10:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R
          move "Giga Drain", {
            text "40 damage. Remove from Torterra the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 40
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Land Crush", {
            text "80 damage. "
            energyCost G, C, C, C
            attackRequirement {}
            onAttack {
              damage 80
            }
          }

        };
      case XATU_11:
        return evolution (this, from:"Natu", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Psywave", {
            text "20× damage. Does 20 damage times the amount of Energy attached to the Defending Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20*defending.cards.energyCount()
            }
          }
          move "Confuse Ray", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {applyAfterDamage CONFUSED}
            }
          }

        };
      case BEEDRILL_12:
        return evolution (this, from:"Kakuna", hp:HP110, type:GRASS, retreatCost:0) {
          weakness R
          move "Twineedle", {
            text "50× damage. Flip 2 coins. This attack does 50 damage times the number of heads."
            energyCost G
            attackRequirement {}
            onAttack {
              flip 2, {damage 50}
            }
          }
          move "Paralyze Poison", {
            text "20 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon is also Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISONED
              flip {applyAfterDamage PARALYZED}
            }
          }

        };
      case BLASTOISE_13:
        return evolution (this, from:"Wartortle", hp:HP130, type:WATER, retreatCost:3) {
          weakness L
          pokePower "Wash Out", {
            text "As often as you like (before your attack), you may move a [W] Energy attached to 1 of your Benched Pokémon to your Active Pokémon. This power can’t be used if Blastoise is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.bench : "You don't have Pokémon on your bench"
              moveEnergy(type:W, my.bench, my.active)
            }
          }
          move "Hydro Launcher", {
            text "Return 2 [W] Energy attached to Blastoise to your hand. Choose 1 of your opponent’s Pokémon. This attack does 100 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 100, opp.all.select()
              afterDamage{
                //TODO: return 2 [W] energy
              }
            }
          }

        };
      case CROBAT_14:
        return evolution (this, from:"Golbat", hp:HP110, type:PSYCHIC, retreatCost:0) {
          weakness P
          resistance F, MINUS20
          move "Supersonic", {
            text "30 damage. The Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage CONFUSED
            }
          }
          move "Hurricane Wing", {
            text "Flip 4 coins. This attack does 30 damage times the number of heads."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              flip 4, {damage 30}
            }
          }

        };
      case FEAROW_15:
        return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Wing Attack", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Repeating Drill", {
            text "20× damage. Flip 5 coins. This attack does 20 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip 5, {damage 20}
            }
          }

        };
      case FLOATZEL_16:
        return evolution (this, from:"Buizel", hp:HP080, type:WATER, retreatCost:0) {
          weakness L
          pokePower "Water Acceleration", {
            text "Once during your turn (before your attack), you may attach a [W] Energy card from your hand to Floatzel. This power can’t be used if Floatzel is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand.filterByEnergyType(W) : "No Water Energy in your hand"
              powerUsed()
              attachEnergyFrom(type: W, my.hand, self)
            }
          }
          move "Waterfall", {
            text "60 damage. "
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case KINGDRA_17:
        return evolution (this, from:"Seadra", hp:HP130, type:WATER, retreatCost:1) {
          weakness L
          move "Water Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select()
            }
          }
          move "Stream Pump", {
            text "50 damage. You may do 50 damage plus 30 more damage. If you do, return an Energy card attached to Kingdra to your hand."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if(confirm("Return an Energy card from $self to your hand?")) {
                damage 30
                afterDamage{self.cards.filterByType(ENERGY).select(count:1).moveTo(my.hand)}
              }
            }
          }

        };
      case LANTURN_18:
        return evolution (this, from:"Chinchou", hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness F
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              flip {applyAfterDamage CONFUSED}
            }
          }
          move "Reflect Energy", {
            text "60 damage. Move an Energy card attached to Lanturn to 1 of your Benched Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                moveEnergy(self, my.bench)
              }
            }
          }

        };
      case LUCARIO_19:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Bulk Up", {
            text "30 damage. During your next turn, each of Lucario’s attacks does 30 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
              delayed {
                doMoreDamageNextTurn(thisMove, 30, self)
              }
            }
          }
          move "Magnum Punch", {
            text "50 damage. "
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case NINETALES_20:
        return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:1) {
          weakness W
          move "Heat Acceleration", {
            text "Search your discard pile for up to 3 [R] Energy cards and attach them to 1 of your Pokémon."
            energyCost R
            attackRequirement {}
            onAttack {
              def tar = my.all.select("Attach energy to?")
              my.discard.filterByEnergyType(R).select(min:0,max:3).each{
                attachEnergy(tar, it)
              }
            }
          }
          move "Searing Flame", {
            text "30 damage. The Defending Pokémon is now Burned."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage BURNED
            }
          }

        };
      case POLIWRATH_21:
        return evolution (this, from:"Poliwhirl", hp:HP130, type:WATER, retreatCost:3) {
          weakness L
          move "Steamroll", {
            text "40 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 40
              damage 20, opp.bench.select()
            }
          }
          move "Dynamic Punch", {
            text "60 damage. Flip a coin. If heads, this attack does 60 damage plus 40 more damage and the Defending Pokémon is now Confused."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                damage 40
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case PRIMEAPE_22:
        return evolution (this, from:"Mankey", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Low Kick", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Bebop Punch", {
            text "Choose 1 of your opponent’s Pokémon. Flip a coin until you get tails. This attack does 50 damage times the number of heads to that Pokémon."
            energyCost F, F
            attackRequirement {}
            onAttack {
              tar = opp.all.select()
              flipUntilTails {damage 50, tar}
            }
          }

        };
      case ROSERADE_23:
        return evolution (this, from:"Roselia", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R
          pokePower "Energy Signal", {
            text "When you attach a [G] Energy card or [P] Energy card from your hand to Roserade during your turn, you may use this power. If you attach a [G] Energy card, the Defending Pokémon is now Confused. If you attach a [P] Energy card, the Defending Pokémon is now Poisoned. This power can’t be used if Roserade is affected by a Special Condition."
            delayedA{
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && (ef.card.asEnergyCard().containsType(G) || ef.card.asEnergyCard().containsType(P)) && bg.currentTurn == self.owner && checkNoSPC() && confirm("Use Energy Signal?")) {
                  if (ef.card.asEnergyCard().containsType(G)) {
                    bc "Energy Signal inflicts Confusion"
                    apply CONFUSED, defending
                  }
                  if (ef.card.asEnergyCard().containsType(P)) {
                    bc "Energy Signal inflicts Poison"
                    apply POISONED, defending
                  }
                }
              }
            }
          }
          move "Power Blow", {
            text "Does 20 damage times the amount of Energy attached to Roserade."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20*self.cards.energyCount()
            }
          }

        };
      case STEELIX_24:
        return evolution (this, from:"Onix", hp:HP120, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          move "Guard Press", {
            text "40 damage. During your opponent’s next turn, any damage done to Steelix by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Steel Swing", {
            text "Flip 2 coins. This attack does 80 damage times the number of heads."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 80}
            }
          }

        };
      case TORKOAL_25:
        return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
          weakness W
          pokePower "Hot Snort", {
            text "Once during your turn, when you put Torkoal from you hand onto your Bench, you may flip a coin. If heads, the Defending Pokémon is now Burned."
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm('Use Hot Snort?')){
                flip {apply BURNED, defending}
              }
            }
          }
          move "Flare", {
            text "30 damage. "
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case TYRANITAR_26:
        return evolution (this, from:"Pupitar", hp:HP140, type:DARKNESS, retreatCost:3) {
          weakness F
          resistance P, MINUS20
          move "Tail Crush", {
            text "40 damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {damage 20}
            }
          }
          move "Hyper Beam", {
            text "80 damage. Discard an Energy card attached to the Defending Pokémon."
            energyCost D, D, C, C
            attackRequirement {}
            onAttack {
              damage 80
              discardDefendingEnergy()
            }
          }

        };
      case URSARING_27:
        return evolution (this, from:"Teddiursa", hp:HP100, type:COLORLESS, retreatCost:3) {
          weakness F
          move "Confront", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Cross Chop", {
            text "50 damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {damage 30}
            }
          }

        };
      case CHERRIM_28:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          pokePower "Sunny Heal", {
            text "Once during your turn , you may remove 1 damage counter from your Active Pokémon. This power can’t be used if Cherrim is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.active.numberOfDamageCounters()
              powerUsed()
              heal 10, my.active
            }
          }
          move "Seed Bomb", {
            text "30 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case DUNSPARCE_29:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Return", {
            text "10 damage. Draw cards until you have 6 cards in your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              draw 6 - my.hand.size
            }
          }

        };
      case GOLBAT_30:
        return evolution (this, from:"Zubat", hp:HP080, type:PSYCHIC, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Mean Look", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat defending
            }
          }

        };
      case GROTLE_31:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Razor Leaf", {
            text "30 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Sleep Powder", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {applyAfterDamage ASLEEP}
            }
          }

        };
      case KAKUNA_32:
        return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          move "Speed Evolution", {
            text "Search your deck for a card that evolves from Kakuna and put it onto Kakuna. (This counts as evolving Kakuna.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              deck.search ("Evolves from ${self.name}", {it.cardTypes.is(EVOLUTION) && self.name==it.predecessor}).each { evolve(self, it, OTHER) }
              shuffleDeck()
            }
          }
          move "Poison Sting", {
            text "The Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }

        };
      case METANG_33:
        return evolution (this, from:"Beldum", hp:HP080, type:PSYCHIC, retreatCost:3) {
          weakness P
          move "Energy Crane", {
            text "Search your discard pile for up to 2 [P] Energy cards and attach them to your Pokémon in any way you like."
            energyCost P
            attackRequirement {}
            onAttack {
              (1..2).each {attachEnergyFrom(may: true, type: P, my.discard, my.all)}
            }
          }
          move "Psypunch", {
            text "50 damage. "
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case MINUN_34:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Call for Family", {
            text "Search you deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              callForFamily(basic:true,2,delegate)
            }
          }
          move "Tag Team Boost", {
            text "10 damage. If Plusle is on your Bench, this attack does 10 damage plus 20 more damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              if(my.bench.findAll{it.name == "Plusle"}) damage 20
            }
          }

        };
      case NUMEL_35:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W
          move "Flare Bonus", {
            text "Discard a [R] Energy card from your hand. Then, draw 3 cards."
            energyCost C
            attackRequirement {}
            onAttack {
              if (my.hand.filterByBasicEnergyType(R)) {
                my.hand.filterByBasicEnergyType(R).select("Discard").discard()
                draw 3
              }
            }
          }
          move "Combustion", {
            text "40 damage. "
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case PLUSLE_36:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Collect", {
            text "Draw 2 cards."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 2
            }
          }
          move "Thunder Jolt", {
            text "20 damage. Flip a coin. If tails, Plusle does 10 damage to itself."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 20
              flip 1, {}, {damage 10, self}
            }
          }

        };
      case POLIWHIRL_37:
        return evolution (this, from:"Poliwag", hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Hypnoblast", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Light Punch", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case PUPITAR_38:
        return evolution (this, from:"Larvitar", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          pokeBody "Boost Gas", {
            text "If Pupitar has any Energy attached to it, the Retreat Cost of Pupitar is 0."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.filterByType(ENERGY)) {
                h.object = 0
              }
            }
          }
          move "Rage", {
            text "Does 20 damage plus 10 more damage for each damage counter on Pupitar."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20 + 10*self.numberOfDamageCounters()
            }
          }
        };
      case PUPITAR_39:
        return evolution (this, from:"Larvitar", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Hammer In", {
            text "30 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Speed Attack", {
            text "50 damage. "
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case SEADRA_40:
        return evolution (this, from:"Horsea", hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Muddy Water", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
              damage 10, opp.bench.select()
            }
          }
          move "Razor Fin", {
            text "50 damage. "
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case TAUROS_41:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F
          move "Smash Kick", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Crimson Bull", {
            text "Flip 3 coins. This attack does 30 damage times the number of heads. Tauros is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 3, {damage 30}
              afterDamage {apply CONFUSED, self}
            }
          }

        };
      case WARTORTLE_42:
        return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Water Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20, opp.all.select()
            }
          }
          move "Surf", {
            text "50 damage. "
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case AIPOM_43:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Tail Code", {
            text "Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              if (defending.cards.energyCount()) {
                moveEnergy(defending, opp.bench)
              }
            }
          }
          move "Tail Smash", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip {damage 30}
            }
          }

        };
      case BELDUM_44:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Reaction", {
            text "10 damage. You may switch Beldum with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              switchYourActive(may: true)
            }
          }

        };
      case BUIZEL_45:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L
          move "Muddy Water", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              damage 10, opp.bench.select()
            }
          }

        };
      case CARNIVINE_46:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Drawup Power", {
            text "Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              my.deck.search(max: 1, cardTypeFilter(ENERGY)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Spit Up", {
            text "20 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case CHERUBI_47:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case CHINCHOU_48:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          move "Ram", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Lightning Ball", {
            text "20 damage. "
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case HORSEA_49:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L
          move "Beat", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Fin Smack", {
            text "Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost W, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 20}
            }
          }

        };
      case LARVITAR_50:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Mountain Eater", {
            text "Discard the top card of your opponent’s deck. Then, remove 2 damage counters from Larvitar."
            energyCost C
            attackRequirement {}
            onAttack {
              opp.deck.subList(0,1).discard()
              heal 20, self
            }
          }
          move "Reckless Charge", {
            text "20 damage. Larvitar does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              damage 10, self
            }
          }

        };
      case LARVITAR_51:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Knuckle Punch", {
            text "20 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MAGMAR_52:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness W
          move "Live Coal", {
            text "10 damage. "
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Magma Punch", {
            text "20 damage. "
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MANKEY_53:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Punch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Karate Chop", {
            text "40- damage. Does 40 damage minus 10 damage for each damage counter on Mankey."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 40 - 10*self.numberOfDamageCounters()
            }
          }

        };
      case MISDREAVUS_54:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Sharpshooting", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select()
            }
          }

        };
      case NATU_55:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Peck", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Teleport", {
            text "Switch Natu with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              switchYourActive()
            }
          }

        };
      case ONIX_56:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:4) {
          weakness G
          pokeBody "Energy Healer", {
            text "Whenever you attach an Energy card from you hand to 1 of your Pokémon, remove 1 damage counter from that Pokémon."
            delayedA{
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner) {
                  heal 10, it
                }
              }
            }
          }
          move "Boundless Power", {
            text "80 damage. Onix can’t attack during your next turn."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 80
              cantAttackNextTurn self
            }
          }

        };
      case ONIX_57:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G
          move "Swing Around", {
            text "20 damage. Flip 2 coins. This attack does 20 damage plus 20 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip 2, {damage 20}
            }
          }

        };
      case POLIWAG_58:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              callForFamily(basic: true, 1, delegate)
            }
          }
          move "Razor Fin", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case REMORAID_59:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L
          move "Rain Splash", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Water Arrow", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20, opp.all.select()
            }
          }

        };
      case RIOLU_60:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P
          move "Kick", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Double Chop", {
            text "Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 20}
            }
          }

        };
      case ROSELIA_61:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R
          move "Petal Dance", {
            text "Flip 3 coins. This attack does 20 damage times the number of heads. Roselia is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              flip 3, {damage 20}
              applyAfterDamage CONFUSED
            }
          }

        };
      case SPEAROW_62:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Roost", {
            text "Remove 4 damage counters from Spearow. Spearow can’t retreat during you next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Flap", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SQUIRTLE_63:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L
          move "Rain Splash", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shell Attack", {
            text "40 damage. "
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STANTLER_64:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mystifying Horns", {
            text "30 damage. The Defending Pokémon is now Confused."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TEDDIURSA_65:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Take Down", {
            text "20 damage. Teddiursa does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TROPIUS_66:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          resistance F, MINUS20
          move "Green Call", {
            text "Pokémon, show it to your opponent, and put it into your hand. If you do, shuffle your deck afterward."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gust", {
            text "20 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TURTWIG_67:
        return basic (this, hp:HP050, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Leech Seed", {
            text "10 damage. , remove 1 damage counter from Turtwig."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Ram", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VULPIX_68:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W
          move "Fireworks", {
            text "20 damage. Energy attached to Vulpix."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case WEEDLE_69:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R
          move "Speed Evolution", {
            text "Search your deck for a card that evolves from Weedle and put it onto Weedle. (This counts as evolving Weedle.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Sting", {
            text "10 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZUBAT_70:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          resistance F, MINUS20
          move "Glide", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Attack", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHEERLEADER_S_CHEER_71:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 3 cards. Your opponent may draw a card."
          onPlay {
          }
          playRequirement{
          }
        };
      case DUAL_BALL_72:
        return basicTrainer (this) {
          text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon, show it to your opponent, and put it into your hand. If you do, shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case EMCEE_S_CHATTER_73:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nFlip a coin. If heads, draw 3 cards. If tails, draw 2 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_RETURNER_74:
        return basicTrainer (this) {
          text "Search your discard pile for 4 basic Energy cards, show them to your opponent, ans shuffle them into your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENGINEER_S_ADJUSTMENTS_75:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDiscard an Energy card from your hand. Then, draw 4 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case GOOD_ROD_76:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your discard pile for a Pokémon, show it to your opponent, and put it on top of your deck. If tails, search your discard pile for a Trainer card, show it to your opponent, and put it on top of your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case INTERVIEWER_S_QUESTIONS_77:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at the top 8 cards of your deck. Choose as many Energy cards as you like, show them to your opponent, and put them into your hand. Shuffle the other cards back into your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case JUDGE_78:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player shuffles his or her hand into his or her deck and draws 4 cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case LIFE_HERB_79:
        return basicTrainer (this) {
          text "Flip a coin. If heads, choose 1 of your Pokémon, and remove all Special Conditions and 6 damage counters from that Pokémon (all if there are less than 6)."
          onPlay {
          }
          playRequirement{
          }
        };
      case PLUSPOWER_80:
        return basicTrainer (this) {
          text "Attach PlusPower to 1 of your Pokémon. Discard this card at the end of your turn.\nIf the Pokémon PlusPower is attached to attacks, the attack does 10 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKEMON_CIRCULATOR_81:
        return basicTrainer (this) {
          text "Your opponent switches his or her Active Pokémon with 1 of his or her Benched Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case RARE_CANDY_82:
        return basicTrainer (this) {
          text "Choose 1 of your Basic Pokémon in play. If you have a Stage 1 or Stage 2 card that evolve from that Pokémon in your hand, put that card on the Basic Pokémon. (This counts as evolving that Pokémon.) (If you choose a Stage 2 Pokémon in your hand, put that Pokémon on the Basic Pokémon instead of a Stage 1 Pokémon.)"
          onPlay {
          }
          playRequirement{
          }
        };
      case SUPER_SCOOP_UP_83:
        return basicTrainer (this) {
          text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case CROBAT_84:
        return evolution (this, from:"Golbat", hp:HP130, type:PSYCHIC, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Severe Poison", {
            text "The Defending Pokémon is now Poisoned. Put 4 damage counters instead of 1 on that Pokémon between turns."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Skill Dive", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. (Dont’ apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KINGDRA_85:
        return evolution (this, from:"Seadra", hp:HP130, type:WATER, retreatCost:1) {
          weakness L
          pokePower "Spray Splash", {
            text "Once during your turn , you may put 1 damage counter on 1 of your opponent’s Pokémon. This power can’t be used if Kingdra is affected by a Special Condition."
            actionA {
            }
          }
          move "Dragon Steam", {
            text "60 damage. Pokémon in play, this attack’s base damage is 20 instead of 60."
            energyCost W, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LANTURN_86:
        return evolution (this, from:"Chinchou", hp:HP110, type:LIGHTNING, retreatCost:2) {
          weakness F
          pokePower "Underwater Dive", {
            text "Once during your turn , you may use this power. Lanturn’s type is until the end of your turn. This power can’t be used if Lanturn is affected by a Special Condition."
            actionA {
            }
          }
          move "Powerful Spark", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to all of your Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STEELIX_87:
        return evolution (this, from:"Onix", hp:HP140, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          pokeBody "Perfect Metal", {
            text "Steelix can’t be affected by any Special Conditions"
            delayedA {
            }
          }
          move "Energy Stream", {
            text "30 damage. Search your discard pile for an Energy card and attach it to Steelix."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gaia Crush", {
            text "100 damage. You may discard any Stadium card in play."
            energyCost M, M, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TYRANITAR_88:
        return evolution (this, from:"Pupitar", hp:HP160, type:DARKNESS, retreatCost:3) {
          weakness F
          resistance P, MINUS20
          move "Darkness Howl", {
            text "Pokémon)."
            energyCost D, D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Power Claw", {
            text "60 damage. This attack’s damage isn’t affected by Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Megaton Tail", {
            text "120 damage. Discard the top 3 cards of your deck."
            energyCost D, D, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case URSARING_89:
        return evolution (this, from:"Teddiursa", hp:HP110, type:COLORLESS, retreatCost:3) {
          weakness F
          pokeBody "Berserk", {
            text "If Ursaring has any damage counters on it, each of Ursaring’s attacks does 60 more damage ."
            delayedA {
            }
          }
          move "Hammer Arm", {
            text "30 damage. Discard the top card from your opponent’s deck."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Megaton Lariat", {
            text "60 damage. "
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ENTEI_AND_RAIKOU_LEGEND_90:
        return basic (this, hp:HP140, type:[FIRE, L], retreatCost:0) {
          weakness W
          weakness F
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Entei & Raikou LEGEND."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Detonation Spin", {
            text "90 damage. Discard a Fire Energy attached to Entei & Raikou LEGEND."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunder Fall", {
            text ". This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost L, C
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
      case ENTEI_AND_RAIKOU_LEGEND_91:
        return copy (ENTEI_AND_RAIKOU_LEGEND_90, this)
        /*basic (this, hp:HP140, type:[FIRE, L], retreatCost:0) {
					weakness W
					weakness F
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Entei & Raikou LEGEND."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Detonation Spin", {
						text "90 damage. Discard a Fire Energy attached to Entei & Raikou LEGEND."
						energyCost F, C
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Thunder Fall", {
						text ". This attack’s damage isn’t affected by Weakness or Resistance."
						energyCost L, C
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
      case RAIKOU_AND_SUICUNE_LEGEND_92:
        return basic (this, hp:HP160, type:[WATER, L], retreatCost:1) {
          weakness L
          weakness F
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Raikou & Suicune LEGEND."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunderbolt Spear", {
            text "150 damage. Raikou & Suicune LEGEND does 50 damage to itself and don’t apply Weakness to this damage."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aurora Gain", {
            text "50 damage. Remove 5 damage counters from Raikou & Suicune LEGEND."
            energyCost W, C, C
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
      case RAIKOU_AND_SUICUNE_LEGEND_93:
        return copy (RAIKOU_AND_SUICUNE_LEGEND_92, this)
        /*basic (this, hp:HP160, type:[WATER, L], retreatCost:1) {
					weakness L
					weakness F
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Raikou & Suicune LEGEND."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Thunderbolt Spear", {
						text "150 damage. Raikou & Suicune LEGEND does 50 damage to itself and don’t apply Weakness to this damage."
						energyCost L, L, C
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Aurora Gain", {
						text "50 damage. Remove 5 damage counters from Raikou & Suicune LEGEND."
						energyCost W, C, C
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
      case SUICUNE_AND_ENTEI_LEGEND_94:
        return basic (this, hp:HP160, type:[WATER, R], retreatCost:1) {
          weakness W
          weakness L
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Suicune & Entei LEGEND."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card from your hand onto your Bench only with the other half of Suicune & Entei LEGEND. When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards"
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Torrent Blade", {
            text "Energy attached to Suicune & Entei LEGEND to your hand. Choose 1 of your opponent’s Benched Pokémon. This attack does 100 damage to that Pokémon."
            energyCost W, W, C, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bursting Inferno", {
            text "80 damage. The Defending Pokémon is now Burned."
            energyCost F, C, C
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
      case SUICUNE_AND_ENTEI_LEGEND_95:
        return copy (SUICUNE_AND_ENTEI_LEGEND_94, this)
        /*basic (this, hp:HP160, type:[WATER, R], retreatCost:1) {
					weakness W
					weakness L
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Suicune & Entei LEGEND."
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "", {
						text "Put this card from your hand onto your Bench only with the other half of Suicune & Entei LEGEND. When this Pokémon has been Knocked Out, your opponent takes 2 Prize cards"
						energyCost ()
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Torrent Blade", {
						text "Energy attached to Suicune & Entei LEGEND to your hand. Choose 1 of your opponent’s Benched Pokémon. This attack does 100 damage to that Pokémon."
						energyCost W, W, C, W
						attackRequirement {}
						onAttack {
							damage 0
						}
					}
					move "Bursting Inferno", {
						text "80 damage. The Defending Pokémon is now Burned."
						energyCost F, C, C
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
      case ALPH_LITHOGRAPH_TWO:
        return basicTrainer (this) {
          text "SHUFFLE YOUR DECK!"
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
