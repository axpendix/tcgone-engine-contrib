package tcgwars.logic.impl.gen3;

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

import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum Deoxys implements LogicCardInfo {

  ALTARIA_1 ("Altaria", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BEAUTIFLY_2 ("Beautifly", "2", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BRELOOM_3 ("Breloom", "3", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CAMERUPT_4 ("Camerupt", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CLAYDOL_5 ("Claydol", "5", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CRAWDAUNT_6 ("Crawdaunt", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DUSCLOPS_7 ("Dusclops", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GYARADOS_8 ("Gyarados", "8", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  JIRACHI_9 ("Jirachi", "9", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  LUDICOLO_10 ("Ludicolo", "10", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  METAGROSS_11 ("Metagross", "11", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  MIGHTYENA_12 ("Mightyena", "12", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  NINJASK_13 ("Ninjask", "13", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SHEDINJA_14 ("Shedinja", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SLAKING_15 ("Slaking", "15", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  DEOXYS_16 ("Deoxys", "16", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DEOXYS_17 ("Deoxys", "17", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DEOXYS_18 ("Deoxys", "18", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  LUDICOLO_19 ("Ludicolo", "19", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  MAGCARGO_20 ("Magcargo", "20", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PELIPPER_21 ("Pelipper", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAYQUAZA_22 ("Rayquaza", "22", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  SABLEYE_23 ("Sableye", "23", Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
  SEAKING_24 ("Seaking", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SHIFTRY_25 ("Shiftry", "25", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SKARMORY_26 ("Skarmory", "26", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  TROPIUS_27 ("Tropius", "27", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  WHISCASH_28 ("Whiscash", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  XATU_29 ("Xatu", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DONPHAN_30 ("Donphan", "30", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  GOLBAT_31 ("Golbat", "31", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GRUMPIG_32 ("Grumpig", "32", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LOMBRE_33 ("Lombre", "33", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  LOMBRE_34 ("Lombre", "34", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  LOTAD_35 ("Lotad", "35", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  LUNATONE_36 ("Lunatone", "36", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGCARGO_37 ("Magcargo", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MANECTRIC_38 ("Manectric", "38", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MASQUERAIN_39 ("Masquerain", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  METANG_40 ("Metang", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MINUN_41 ("Minun", "41", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  NOSEPASS_42 ("Nosepass", "42", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  NUZLEAF_43 ("Nuzleaf", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PLUSLE_44 ("Plusle", "44", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SHELGON_45 ("Shelgon", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SILCOON_46 ("Silcoon", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SOLROCK_47 ("Solrock", "47", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  STARMIE_48 ("Starmie", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SWELLOW_49 ("Swellow", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  VIGOROTH_50 ("Vigoroth", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WEEZING_51 ("Weezing", "51", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BAGON_52 ("Bagon", "52", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BALTOY_53 ("Baltoy", "53", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BARBOACH_54 ("Barboach", "54", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BELDUM_55 ("Beldum", "55", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CARVANHA_56 ("Carvanha", "56", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  CORPHISH_57 ("Corphish", "57", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  DUSKULL_58 ("Duskull", "58", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ELECTRIKE_59 ("Electrike", "59", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRIKE_60 ("Electrike", "60", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GOLDEEN_61 ("Goldeen", "61", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  KOFFING_62 ("Koffing", "62", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LOTAD_63 ("Lotad", "63", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGIKARP_64 ("Magikarp", "64", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAKUHITA_65 ("Makuhita", "65", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  NATU_66 ("Natu", "66", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NINCADA_67 ("Nincada", "67", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  NUMEL_68 ("Numel", "68", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PHANPY_69 ("Phanpy", "69", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  POOCHYENA_70 ("Poochyena", "70", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SEEDOT_71 ("Seedot", "71", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHROOMISH_72 ("Shroomish", "72", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SLAKOTH_73 ("Slakoth", "73", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SLUGMA_74 ("Slugma", "74", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SLUGMA_75 ("Slugma", "75", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SPOINK_76 ("Spoink", "76", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  STARYU_77 ("Staryu", "77", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SURSKIT_78 ("Surskit", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SWABLU_79 ("Swablu", "79", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TAILLOW_80 ("Taillow", "80", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  WINGULL_81 ("Wingull", "81", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  WURMPLE_82 ("Wurmple", "82", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ZUBAT_83 ("Zubat", "83", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BALLOON_BERRY_84 ("Balloon Berry", "84", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
  CRYSTAL_SHARD_85 ("Crystal Shard", "85", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
  ENERGY_CHARGE_86 ("Energy Charge", "86", Rarity.UNCOMMON, [TRAINER, ITEM]),
  LADY_OUTING_87 ("Lady Outing", "87", Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MASTER_BALL_88 ("Master Ball", "88", Rarity.UNCOMMON, [TRAINER, ITEM]),
  METEOR_FALLS_89 ("Meteor Falls", "89", Rarity.UNCOMMON, [STADIUM, TRAINER]),
  PROFESSOR_COZMO_S_DISCOVERY_90 ("Professor Cozmo's Discovery", "90", Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  SPACE_CENTER_91 ("Space Center", "91", Rarity.UNCOMMON, [STADIUM, TRAINER]),
  STRENGTH_CHARM_92 ("Strength Charm", "92", Rarity.UNCOMMON, [POKEMON_TOOL, TRAINER]),
  BOOST_ENERGY_93 ("Boost Energy", "93", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  HEAL_ENERGY_94 ("Heal Energy", "94", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  SCRAMBLE_ENERGY_95 ("Scramble Energy", "95", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  CROBAT_EX_96 ("Crobat ex", "96", Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_, EX]),
  DEOXYS_EX_97 ("Deoxys ex", "97", Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  DEOXYS_EX_98 ("Deoxys ex", "98", Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  DEOXYS_EX_99 ("Deoxys ex", "99", Rarity.ULTRARARE, [BASIC, POKEMON, _PSYCHIC_, EX]),
  HARIYAMA_EX_100 ("Hariyama ex", "100", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_, EX]),
  MANECTRIC_EX_101 ("Manectric ex", "101", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_, EX]),
  RAYQUAZA_EX_102 ("Rayquaza ex", "102", Rarity.ULTRARARE, [BASIC, POKEMON, _COLORLESS_, EX]),
  SALAMENCE_EX_103 ("Salamence ex", "103", Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_, EX]),
  SHARPEDO_EX_104 ("Sharpedo ex", "104", Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_, EX]),
  LATIAS_STAR_105 ("Latias Star", "105", Rarity.SECRET, [POKEMON_STAR, BASIC, POKEMON, _COLORLESS_]),
  LATIOS_STAR_106 ("Latios Star", "106", Rarity.SECRET, [POKEMON_STAR, BASIC, POKEMON, _COLORLESS_]),
  RAYQUAZA_STAR_107 ("Rayquaza Star", "107", Rarity.SECRET, [POKEMON_STAR, BASIC, POKEMON, _COLORLESS_]),
  ROCKET_S_RAIKOU_EX_108 ("Rocket's Raikou ex", "108", Rarity.ULTRARARE, [BASIC, POKEMON, _DARKNESS_, EX]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Deoxys(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.DEOXYS;
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
      case ALTARIA_1:
        return evolution (this, from:"Swablu", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Safeguard", {
            text "Prevent all effects of attacks, including damage, done to Altaria by your opponent’s Pokémon-ex."
            //TODO: Change static safeguard so it's configurable.
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                  bc "Safeguard prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.EX ) {
                    it.dmg = hp(0)
                    bc "Safeguard prevents damage"
                  }
                }
              }
            }
          }
          move "Double Wing Attack", {
            text "Does 20 Damage to each Defending Pokémon."
            energyCost L
            onAttack {
              damage 20
            }
          }
          move "Dive", {
            text "50 damage."
            energyCost W, C, C
            onAttack {
              damage 50
            }
          }

        };
      case BEAUTIFLY_2:
        return evolution (this, from:"Silcoon", hp:HP100, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokeBody "Hunch", {
            text "As long as Beautifly’s remaining HP is 40 or less, Beautifly does 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES,{
                if(self.getRemainingHP().value <= 40){
                  bg.dm().each{
                    if(it.from == self){
                      bc "Hunch +40"
                      it.dmg+=hp(40)
                    }
                  }
                }
              }
            }
          }
          move "Luring Antenna", {
            text "20 damage. Before doing damage, you may choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
            energyCost G
            onAttack {
              if (opp.bench && confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon before doing damage?")) {
                switchYourOpponentsBenchedWithActive()
              }
              damage 20
            }
          }
          move "Cutting Wind", {
            text "50 damage."
            energyCost G, C, C
            onAttack {
              damage 50
            }
          }

        };
      case BRELOOM_3:
        return evolution (this, from:"Shroomish", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Leaf Poison", {
            text "20 damage. If Breloom has any [G] Energy attached to it, the Defending Pokémon is now Poisoned."
            energyCost C
            onAttack {
              damage 20
              if(self.cards.energyCount(G)) applyAfterDamage POISONED
            }
          }
          move "Hustle Punch", {
            text "70- damage. During your next turn, Hustle Punch attack’s base damage is 50 instead of 70."
            energyCost F, C, C
            onAttack {
              damage 70
              afterDamage{decreasedBaseDamageNextTurn(self,"Hustle Punch",hp(20))}
            }
          }

        };
      case CAMERUPT_4:
        return evolution (this, from:"Numel", hp:HP090, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Back Burner", {
            text "Search your discard pile for up to 2 basic Energy cards and attach them to your Pokémon in any way you like."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(BASIC_ENERGY) : "You don't have any Basic Energy cards in your discard pile"
            }
            onAttack {
              attachEnergyFrom(basic: true,my.discard,my.all)
              attachEnergyFrom(basic: true,my.discard,my.all)

            }
          }
          move "Split Bomb", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C, C
            onAttack {
              multiSelect(opp.all, 2).each{ damage 30, it }
            }
          }

        };
      case CLAYDOL_5:
        return evolution (this, from:"Baltoy", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness WATER
          pokePower "Psychic Trance", {
            text "Once during your turn (before you attack), if Claydol is your Active Pokémon, you may shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand. This power can’t be used if Claydol is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your Active Pokémon"
              powerUsed()
              my.hand.moveTo(hidden:true, my.deck)
              shuffleDeck()
              draw opp.hand.size()
            }
          }
          move "Ancient Mantra", {
            text "20+ damage. If Claydol has any [P] Energy attached to it, the Defending Pokémon is now Confused. If Claydol has any [F] Energy attached to it, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(self.cards.energyCount(F)) damage 20
              if(self.cards.energyCount(P)) applyAfterDamage CONFUSED
            }
          }

        };
      case CRAWDAUNT_6:
        return evolution (this, from:"Corphish", hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness GRASS
          resistance PSYCHIC, MINUS30
          pokeBody "Dark Protection", {
            text "Any damage done to Crawdaunt by your opponent’s attacks is reduced by 10 for each [D] Energy attached to Crawdaunt (after applying Weakness and Resistance). You can’t reduce more than 20 damage in this way."
            delayedA {
              before APPLY_ATTACK_DAMAGES,{
                def dmgRed = Math.min(2,self.cards.energyCount(D))
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Dark Protection -${10*dmgRed}"
                    it.dmg -= hp(10*dmgRed)
                  }
                }
              }
            }
          }
          move "Bubblebeam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Cross-Cut", {
            text "40+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 40 damage plus 20 more damage."
            energyCost D, C, C
            onAttack {
              damage 40
              if(defending.evolution) damage 20
            }
          }

        };
      case DUSCLOPS_7:
        return evolution (this, from:"Duskull", hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance F, MINUS30
          move "Psychic Removal", {
            text "20 damage. Flip 2 coins. If both of them are heads, discard all Energy attached to the Defending Pokémon."
            energyCost P
            onAttack {
              damage 20
              afterDamage{
                flip 2, {}, {}, [2:{
                  targeted (defending) {
                    opp.active.cards.filterByType(ENERGY).discard()
                  }
                }]
              }
            }
          }
          move "Powerful Hand", {
            text "Count the number of cards in your hand. Put that many damage counters on the Defending Pokémon. You can’t put more than 7 damage counters in this way."
            energyCost P, P, C
            onAttack {
              directDamage 10*Math.min(7,my.hand.size()), defending
            }
          }

        };
      case GYARADOS_8:
        return evolution (this, from:"Magikarp", hp:HP090, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          move "Dragon Spark", {
            text "This attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              opp.all.each{
                damage 10, it
              }
            }
          }
          move "Full Retaliation", {
            text "20× damage. Does 20 damage times the number of damage counters on all of your Magikarp."
            energyCost C, C
            onAttack {
              def totalDmg = 0
              my.all.each{
                if(it.name == "Magikarp") totalDmg += it.numberOfDamageCounters
              }
              damage 20*totalDmg
            }
          }
          move "Pulverize", {
            text "50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 50 more damage."
            energyCost W, W, C, C
            onAttack {
              damage 50
              if(defending.numberOfDamageCounters >= 2) damage 50
            }
          }

        };
      case JIRACHI_9:
        return basic (this, hp:HP060, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance GRASS, MINUS30
          pokePower "Wishing Star", {
            text "Once during your turn (before your attack), if Jirachi is your Active Pokémon, you may look at the top 5 cards of your deck, choose one of them, and put it into your hand. Shuffle your deck afterward. Jirachi and your other Active Pokémon, if any, are now Asleep. This power can’t be used if Jirachi is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your Active Pokémon."
              assert my.deck : "There is no cards remaining."
              powerUsed()
              my.deck.subList(0,Math.min(5,my.deck.size())).select("Select one card to put into your hand.").moveTo(hidden:true, my.hand)
              shuffleDeck()
              apply ASLEEP, self, SRC_ABILITY
            }
          }
          move "Metallic Blow", {
            text "20+ damage. If the Defending Pokémon has any Poké-Bodies, this attack does 20 damage plus 30 more damage."
            energyCost M, C
            onAttack {
              damage 20
              def hasPokeBody = false
              for (Ability ability : defending.getAbilities().keySet()) {
                if (ability instanceof PokeBody) hasPokeBody = true;
              }
              if(hasPokeBody) damage 30
            }
          }

        };
      case LUDICOLO_10:
        return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          pokePower "Swing Dance", {
            text "Once during your turn (before your attack), you may draw a card. This power can’t be used if Ludicolo is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "There is no cards remaining."
              powerUsed()
              draw 1
            }
          }
          move "Healing Steps", {
            text "30 damage. You may discard as many cards as you like from your hand. If you do, remove that many damage counters from Ludicolo."
            energyCost W
            onAttack {
              damage 30
              if(my.hand) {
                if(confirm("Discard cards from your hand to remove damage counter on Ludicolo?")){
                  heal 10 * my.hand.select(max: my.hand.size(), "For each card discarded you will remove 1 damage counter").discard().size(), self
                }
              }
            }
          }
          move "Circular Steps", {
            text "10× damage. Does 10× damage times the number of Pokémon in play (both yours and your opponent’s), excluding Ludicolo."
            energyCost W, C, C
            onAttack {
              damage 10*(my.bench.size()+opp.all.size())
            }
          }

        };
      case METAGROSS_11:
        return evolution (this, from:"Metang", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokePower "Super Connectivity", {
            text "Once during your turn (before you attack), you may search your discard pile for a [P] or [M] Energy card and attach it to your Active Pokémon. Then, put 1 damage counter on that Pokémon. This power can’t be used if Metagross is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByType(ENERGY).any{it.asEnergyCard().containsTypePlain(P) || it.asEnergyCard().containsTypePlain(M)} : "There are no [P] or [M] Energy card in your discard."
              powerUsed()
              attachEnergy(my.active,my.discard.filterByType(ENERGY).findAll{it.asEnergyCard().containsTypePlain(P) || it.asEnergyCard().containsTypePlain(M)}.select().first())
              directDamage 10, my.active, SRC_ABILITY
            }
          }
          move "Link Blast", {
            text "70 damage. If Metagross and the Defending Pokémon have a different amount of Energy attached to them, this attack’s base damage is 40 instead of 70."
            energyCost P, C
            onAttack {
              if (self.cards.energyCount(C) == defending.cards.energyCount(C)){
                damage 70
              } else {
                damage 40
              }
            }
          }

        };
      case MIGHTYENA_12:
        return evolution (this, from:"Poochyena", hp:HP070, type:DARKNESS, retreatCost:0) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Seek Out", {
            text "Search your deck for 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.select().moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Pull Away", {
            text "30 damage. If your opponent has 5 or more cards in his or her hand, your opponent discards a number of cards until your opponent has 4 cards left in his or her hand."
            energyCost C, C
            onAttack {
              damage 30
              afterDamage {
                if(opp.hand.size() >= 5){
                  opp.hand.oppSelect(count: opp.hand.size() - 4, "Select cards to discard until you end up with 4 left").discard()
                }
              }
            }
          }

        };
      case NINJASK_13:
        return evolution (this, from:"Nincada", hp:HP070, type:GRASS, retreatCost:0) {
          weakness LIGHTNING
          pokeBody "Fast Protection", {
            text "Prevent all effects, including damage, done to Ninjask by your opponent’s attacks from his or her Basic Pokémon."
            delayedA {
              before null, self, Source.ATTACK, {
                if (!self.owner.opposite.pbg.active.evolution && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "Fast Protection prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.owner != self.owner && !it.from.evolution ){
                    it.dmg = hp(0)
                    bc "Fast Protection prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(!efs.from.evolution && efs.from.owner != self.owner && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Swords Dance", {
            text "During your next turn, Ninjask’s Slash attack’s base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Slash",hp(50))
            }
          }
          move "Slash", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }

        };
      case SHEDINJA_14:
        return evolution (this, from:"Nincada", hp:HP050, type:PSYCHIC, retreatCost:0) {

          pokeBody "Empty Shell", {
            text "When Shedinja is Knocked Out, your opponent doesn’t take any Prize cards."
            delayedA {
              before KNOCKOUT, self, {
                def eff=blockingEffect(TAKE_PRIZE)
                eff.unregisterImmediately=true
                bc "Empty Shell blocks taking a prize card"
              }
            }
          }
          move "Extra Curse", {
            text "Put 2 damage counters on the Defending Pokémon. If the Defending Pokémon is Pokémon-ex, put 4 damage counters instead."
            energyCost C
            onAttack {
              if(defending.EX){
                directDamage 40, defending
              }
              else{
                directDamage 20, defending
              }
            }
          }

        };
      case SLAKING_15:
        return evolution (this, from:"Vigoroth", hp:HP120, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          pokeBody "Lazy Aura", {
            text "As long as Slaking is your Active Pokémon, any damage done by attacks from your opponent’s Pokémon-ex is reduced by 30 (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value && it.from.EX) {
                    bc "Lazy Aura -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Amnesia", {
            text "20 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 20
              amnesia delegate
            }
          }
          move "Lazy Headbutt", {
            text "70 damage. Slaking is now Asleep."
            energyCost C, C, C, C
            onAttack {
              damage 70
              afterDamage{
                apply ASLEEP, self
              }
            }
          }

        };
      case DEOXYS_16:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Link Blast", {
            text "40 damage. If Deoxys and the Defending Pokémon have a different amount of Energy attached to them, this attack’s base damage is 20 instead of 40."
            energyCost P, C
            onAttack {
              if(self.cards.energyCount(C) == defending.cards.energyCount(C)){
                damage 40
              }
              else{
                damage 20
              }
            }
          }

        };
      case DEOXYS_17:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Energy Crush", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to all of your opponent’s Pokémon."
            energyCost P, C, C
            onAttack {
              def addDmg = 0
              opp.all.each{
                addDmg += it.cards.energyCount(C)
              }
              damage 10+10*addDmg
            }
          }

        };
      case DEOXYS_18:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys and switch it with Deoxys. (Any cards attached to Deoxys, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Barrier Attack", {
            text "20 damage. During your opponent’s next turn, any damage done to Deoxys by attacks is reduced by 30 (after applying Weakness and Resistance)."
            energyCost P, C
            onAttack {
              damage 20
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }

        };
      case LUDICOLO_19:
        return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          pokePower "Happy Dance", {
            text "Once during your turn (before your attack), you may remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Happy Dance Poké-Power each turn. This power can’t be used if Ludicolo is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert bg.em().retrieveObject("Happy_Dance") != bg.turnCount : "You cannot use Happy Dance more than once per turn!"
              powerUsed()
              bg.em().storeObject("Happy_Dance",bg.turnCount)
              my.all.each{
                heal 10, it
              }
            }
          }
          move "Water Punch", {
            text "40+ damage. Flip a coin for each [W] Energy attached to Ludicolo. This attack does 40 damage plus 20 more damage for each heads."
            energyCost C, C, C
            onAttack {
              damage 40
              flip self.cards.energyCount(W), {damage 20}
            }
          }

        };
      case MAGCARGO_20:
        return evolution (this, from:"Slugma", hp:HP080, type:FIRE, retreatCost:3) {
          weakness WATER
          pokePower "Smooth Over", {
            text "Once during your turn (before your attack), you may search your deck for a card. Shuffle your deck, then put that card on top of your deck. This power can’t be used if Magcargo is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "There is no card in your deck"
              powerUsed()
              def tar = my.deck.select("Select 1 card").each{my.deck.remove(it)}
              shuffleDeck()
              my.deck.addAll(0, tar)
            }
          }
          move "Knock Over", {
            text "10 damage. You may discard any Stadium card in play."
            energyCost C
            onAttack {
              damage 10
              if(bg.stadiumInfoStruct) afterDamage {
                if(confirm("Discard the Stadium card")) discard(bg.stadiumInfoStruct.stadiumCard)
              }
            }
          }
          move "Combustion", {
            text "50 damage."
            energyCost R, C, C
            onAttack {
              damage 50
            }
          }

        };
      case PELIPPER_21:
        return evolution (this, from:"Wingull", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Bay Dance", {
            text "10 damage. During your next turn, if any of your current Active Pokémon does damage to any Defending Pokémon, the attack does 30 more damage (before applying Weakness and Resistance)."
            energyCost C
            onAttack {
              damage 10
              afterDamage{
                doMoreDamageNextTurn(thisMove, 30, self)
              }
            }
          }
          move "Aqua Sonic", {
            text "50 damage. This attack’s damage is not affected by Resistance."
            energyCost W, C, C
            onAttack {
              damage 50
              dontApplyResistance()
            }
          }

        };
      case RAYQUAZA_22:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness COLORLESS
          pokeBody "Dragon Aura", {
            text "As long as Rayquaza has any basic [R] Energy cards and any basic [L] Energy cards attached to it, prevent all effects, except damage, by an opponent’s attack done to Rayquaza."
            delayedA {
              before null, self, Source.ATTACK, {
                if(ef.attacker.owner != self && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages) && self.cards.energyCount(L) && self.cards.energyCount(R)){
                  bc "Dragon Aura prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Tumbling Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {damage 20}
            }
          }

        };
      case SABLEYE_23:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance COLORLESS, MINUS30
          pokePower "Night Vision", {
            text "Once during your turn (before you attack), if Sableye is your Active Pokémon, you may look at your opponent’s hand. This power can’t be used if Sableye is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your active Pokémon."
              assert opp.hand : "There are no cards in your opponent's hand"
              powerUsed()
              opp.hand.shuffledCopy().showToMe("Opponent's hand")
            }
          }
          move "Slash", {
            text "10 damage"
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Limitation", {
            text "Your opponent can’t play any Supporter Cards from his or hand during your opponent’s next turn."
            energyCost D
            onAttack {
              opponentCantPlaySupporterNextTurn(delegate)
            }
          }

        };
      case SEAKING_24:
        return evolution (this, from:"Goldeen", hp:HP070, type:WATER, retreatCost:0) {
          weakness LIGHTNING
          move "Triple Breach", {
            text "Choose 3 of your opponent’s Pokémon. This attack does 10 damage to each of those Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              multiSelect(opp.all, 3).each{ damage 10, it }
            }
          }
          move "Rend", {
            text "30+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 30 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 30
              if(defending.numberOfDamageCounters) damage 20
            }
          }

        };
      case SHIFTRY_25:
        return evolution (this, from:"Nuzleaf", hp:HP110, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokePower "Fan Action", {
            text "Once during your turn (before your attack), you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. You opponent chooses the Benched Pokémon to switch. This power can’t be used if Shiftry is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert opp.bench : "There is no benched Pokemon"
              powerUsed()

              sw opp.active, opp.bench.oppSelect(), SRC_ABILITY
            }
          }
          move "Stadium Power", {
            text "50+ damage. If there is any Stadium card in play, this attack does 50 damage plus 20 more damage."
            energyCost G, C, C
            onAttack {
              damage 50
              if(bg.stadiumInfoStruct) damage 20
            }
          }
        };
      case SKARMORY_26:
        return basic (this, hp:HP070, type:METAL, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Metallic Lift", {
            text "If Skarmory has any [M] Energy attached to it, the Retreat Cost for Skarmory is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(M)) {
                h.object = 0
              }
            }
          }
          move "Spearhead", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Heavy Metal", {
            text "10+ damage. Flip a coin for each [M] Energy attached to Skarmory. This attack does 10 damage plus 20 more damage for each heads."
            energyCost C, C
            onAttack {
              damage 10
              flip self.cards.energyCount(M), {damage 20}
            }
          }

        };
      case TROPIUS_27:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokeBody "Tropical Motion", {
            text "As long as Tropius is your Active Pokémon, your opponent’s Active Pokémon have no Resistance."
            getterA (GET_RESISTANCES) {h->
              if(h.effect.target.owner == self.owner.opposite && self.active) {
                h.object.clear()
              }
            }
          }
          move "Miracle Blow", {
            text "Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
            energyCost G
            onAttack {
              flip {
                apply choose([POISONED,ASLEEP,CONFUSED,BURNED,PARALYZED],"Choose 1 Special Condition to apply to the defending pokemon")
              }
            }
          }
          move "Stomp", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost C, C, C, C
            onAttack {
              damage 40
              flip {damage 20}
            }
          }

        };
      case WHISCASH_28:
        return evolution (this, from:"Barboach", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Raging Tremble", {
            text "Flip a coin. If heads, this attack does 10 damage for each damage counter on Whiscash to each Defending Pokémon. If tails, this attack does 10 damage for each damage counter on Whiscash to the Defending Pokémon."
            energyCost C
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Dwindling Wave", {
            text "70- damage. Does 70 damage minus 10 damage for each damage counter on Whiscash."
            energyCost F, F, C
            onAttack {
              damage 70-10*self.numberOfDamageCounters
            }
          }

        };
      case XATU_29:
        return evolution (this, from:"Natu", hp:HP070, type:PSYCHIC, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Mirror Coat", {
            text "If Xatu is Burned or Poisoned by an opponent’s attack (even if Xatu is Knocked Out), the Attacking Pokémon is now affected by the same Special Conditions (1 if there is only 1)."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(ef.type == POISONED || ef.type == BURNED){
                  bc "Mirror Coat : ${ef.type}"
                  apply ef.type, self.owner.opposite.pbg.active, SRC_ABILITY
                }
              }
            }
          }
          move "Dazzle Dance", {
            text "Each Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
            }
          }
          move "Psyloop", {
            text "30+ damage. Does 30 damage plus 30 more damage for each Trainer card your opponent has in play."
            energyCost P, C
            onAttack {
              def addDmg = 0
              damage 30
              opp.all.each{
                if(it.cards.filterByType(POKEMON_TOOL)) addDmg += 1
                //TODO: Maybe improve this detection... Is the benched fossil/doll/usbsitute still detected as a trainer?
                it.cards.each{
                  thatCard -> ["Amber", " Doll", "Robo Substitute"].each{
                    thatTrainer -> if (thatCard.name.contains(thatTrainer)) { addDmg += 1 }
                  }
                  if (
                    thatCard.name.contains("Fossil") && thatCard.name != "Buried Fossil"
                  ) { addDmg += 1 }
                }
                //TODO: Detect attached non-tools (see: Pluspower, Defender, etc.)
              }
              if(bg.stadiumInfoStruct){
                if(bg.stadiumInfoStruct.stadiumCard.player != self.owner){
                  addDmg += 1
                }
              }
              damage 30 * addDmg
            }
          }
        };
      case DONPHAN_30:
        return evolution (this, from:"Phanpy", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Spinning Horn", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            onAttack {
              opp.all.each{
                damage 10, it
              }
            }
          }
          move "Rock Hurl", {
            text "50 damage. This attack’s damage is not affected by Resistance."
            energyCost F, C, C
            onAttack {
              damage 50
              dontApplyResistance()
            }
          }

        };
      case GOLBAT_31:
        return evolution (this, from:"Zubat", hp:HP070, type:GRASS, retreatCost:0) {
          weakness PSYCHIC
          pokeBody "Self-control", {
            text "Golbat can’t be Paralyzed."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(ef.type == PARALYZED){
                  bc "$self Self-control pervent it to be Paralyzed"
                  prevent()
                }
              }
            }
          }
          move "Spiral Drain", {
            text "20 damage. Remove 1 damage counter from Golbat."
            energyCost G, C
            onAttack {
              damage 20
              heal 10,self
            }
          }

        };
      case GRUMPIG_32:
        return evolution (this, from:"Spoink", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Carefree", {
            text "Grumpig can’t be Confused."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                bc "$self Carefree pervent it to be Confused"
                if(ef.type == CONFUSED){
                  prevent()
                }
              }
            }
          }
          move "Hypnoblast", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost P, C
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Extra Ball", {
            text "50+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 50 damage plus 30 more damage."
            energyCost P, C, C
            onAttack {
              damage 50
              if(defending.EX) damage 30
            }
          }

        };
      case LOMBRE_33:
        return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Aqua Lift", {
            text "If Lombre has any [W] Energy attached to it, the Retreat Cost for Lombre is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(W)) {
                h.object = 0
              }
            }
          }
          move "Ambush", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {damage 20}
            }
          }

        };
      case LOMBRE_34:
        return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Natural Cure", {
            text "When you attach a [W] Energy card from your hand to Lombre, remove all Special Conditions from Lombre."
            delayedA {
              after ATTACH_ENERGY, self, {
                if(ef.reason==PLAY_FROM_HAND && ef.card instanceof BasicEnergyCard && ef.card.basicType == W){
                  clearSpecialCondition(self,Source.SRC_ABILITY)
                }
              }
            }
          }
          move "Blot", {
            text "20 damage. Remove 2 damage counters from Lombre."
            energyCost C, C
            onAttack {
              damage 20
              heal 20, self
            }
          }

        };
      case LOTAD_35:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Surprise", {
            text "10 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his her deck."
            energyCost W
            onAttack {
              damage 10
              afterDamage { astonish() }
            }
          }

        };
      case LUNATONE_36:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness WATER
          pokeBody "Moonglow", {
            text "The Retreat Cost for each Solrock you have in play is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST) {holder->
              def pcs = holder.effect.target
              if(pcs.name == "Solrock" && pcs.owner == self.owner){
                holder.object = 0
              }
            }
          }
          move "Foresight", {
            text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
            energyCost C
            foresight(5, delegate)
          }
          move "Target Beam", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Solrock you have in play."
            energyCost F, C
            onAttack {
              damage 20
              my.all.each{
                if(it.name == "Solrock") damage 10
              }
            }
          }

        };
      case MAGCARGO_37:
        return evolution (this, from:"Slugma", hp:HP080, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Headbutt", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Burning Ball", {
            text "50 damage. If Magcargo has at least 2 [R] Energy attached to it, the Defending Pokémon is now Burned."
            energyCost R, C, C
            onAttack {
              damage 50
              if(self.cards.energyCount(R) >= 2) applyAfterDamage BURNED
            }
          }

        };
      case MANECTRIC_38:
        return evolution (this, from:"Electrike", hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Thunder Spear", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L
            onAttack {
              damage 20, opp.all.select("20 damage to?")
            }
          }
          move "Magnetic Tackle", {
            text "40+ damage. You may do 40 damage plus 10 more damage for each [L] Energy attached to Manetric. If you do, Manetric does 10 damage to itself."
            energyCost C, C, C
            onAttack {
              damage 40
              //TODO: Could this choice be done regardless of having [L] Energy attached or not? May want the self damage for some reason.
              if(self.cards.energyCount(L)){
                if(confirm("Do 10 more damage for each [L] Energy attached to Manetric. (Manetric will do 10 damage to itself)")){
                  damage 10*self.cards.energyCount(L)
                  damage 10, self
                }
              }
            }
          }

        };
      case MASQUERAIN_39:
        return evolution (this, from:"Surskit", hp:HP060, type:GRASS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Intimidating Pattern", {
            text "As long as Masquerain is your Active Pokémon, any damage done by an opponent’s attack is reduced by 20 (before applying Weakness and Resistance). You can’t use more than 1 Intimidating Pattern Poké-Body each turn."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(it.from.owner == self.owner.opposite && self.active) {
                    bc "Intimidating Pattern -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Stun Spore", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case METANG_40:
        return evolution (this, from:"Beldum", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Psychic Boom", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C
            onAttack {
              damage 10 + 10*defending.cards.energyCount(C)
            }
          }
          move "Quick Blow", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost P, C, C
            onAttack {
              damage 40
              flip {damage 20}
            }
          }

        };
      case MINUN_41:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Sniff Out", {
            text "Put any 1 card from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard : "There are no cards in your discard pile"
            }
            onAttack {
              my.discard.select("Select 1 card to put into your hand.").showToOpponent("Opponent used Sniff Out").moveTo(my.hand)
            }
          }
          move "Negative Spark", {
            text "Does 20 damage to each of your opponent’s Pokémon that has any Poké-Bodies. Don’t apply Weakness and Resistance."
            energyCost L
            onAttack {
              def hasPokeBody
              opp.all.each{
                hasPokeBody = false
                for (Ability ability : it.getAbilities().keySet()) {
                  if (ability instanceof PokeBody) hasPokeBody = true;
                }
                if(hasPokeBody) noWrDamage 20,it
              }
            }
          }
        };
      case NOSEPASS_42:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness WATER
          pokePower "Magnetic Reversal", {
            text "Once during your turn (before your attack), if Nosepass is your Active Pokémon, you may flip a coin. If heads, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch. This power can’t be used if Nosepass is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your active Pokémon."
              assert opp.bench : "There is no Pokémon to switch"
              powerUsed()
              flip {
                switchYourOpponentsBenchedWithActive(SRC_ABILITY)
              }
            }
          }
          move "Sharpen", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case NUZLEAF_43:
        return evolution (this, from:"Seedot", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Eerie Light", {
            text "The Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
            }
          }
          move "One-Two Strike", {
            text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
            energyCost G, C, C
            onAttack {
              damage 30
              flip 2, {damage 20}
            }
          }

        };
      case PLUSLE_44:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Call for Family", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 2, delegate)
          }
          move "Positive Spark", {
            text "Does 20 damage to each of your opponent’s Pokémon that has any Poké-Powers. Don’t apply Weakness and Resistance."
            energyCost L
            onAttack {
              def hasPokePower = false
              opp.all.each{
                hasPokePower = false
                for (Ability ability : it.getAbilities().keySet()) {
                  if (ability instanceof PokePower) hasPokePower = true;
                }
                if(hasPokePower) noWrDamage 20,it
              }
            }
          }

        };
      case SHELGON_45:
        return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness COLORLESS
          resistance FIGHTING, MINUS30
          resistance FIRE, MINUS30
          pokeBody "Hard Protection", {
            text "Prevent all damage done to Shelgon by attacks from your Pokémon."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.from.owner == self.owner && it.to == self) {
                    bc "Hard Protection prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Rock Smash", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
            energyCost R, W
            onAttack {
              damage 30
              flip {damage 10}
            }
          }

        };
      case SILCOON_46:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Advanced Armor", {
            text "During your opponent’s next turn, prevent all effects of attacks, including damage, done to Silcoon by your opponent’s Evolved Pokémon."
            energyCost G, C
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each{
                    if(it.from.evolution && it.to == self) {
                      bc "Advanced Armor prevent damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }
        };
      case SOLROCK_47:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          weakness GRASS
          pokeBody "Sunbeam", {
            text "The maximum HP for each Lunatone you have in play is now 80."
            getterA GET_FULL_HP ,{h->
              if(h.effect.target.name == "Lunatone" && h.effect.target.owner == self.owner) {
                h.object = hp(80)
              }
            }
          }
          move "Scorching Light", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Burned."
            energyCost C
            onAttack {
              flip 1, {apply PARALYZED}, {apply BURNED}
            }
          }
          move "Reflected Beam", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon for each Lunatone you have in play. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P
            attackRequirement {
              assert opp.bench : "There is no Pokémon on your opponent's bench."
            }
            onAttack {
              def pcs = opp.bench.select("Select the Pokémon to attack.")
              my.all.each{
                if(it.name == "Lunatone") damage 10, pcs
              }
            }
          }

        };
      case STARMIE_48:
        return evolution (this, from:"Staryu", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Core Guard", {
            text "As long as Starmie has any [P] Energy attached to it, damage done to Starmie by attacks is reduced by 10 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && self.cards.energyCount(P)) {
                    bc "Core Guard -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Energy Flip", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) You may move an Energy attached to that Pokémon to another of your opponent’s Pokémon."
            energyCost W
            attackRequirement {
              assert opp.bench : "There is no Pokémon on your opponent's bench."
            }
            onAttack {
              def pcs = opp.bench.select("Select the Pokémon to attack.")
              damage 10, pcs
              if(pcs.cards.energyCount(C)){
                if(confirm("Move 1 energy from that Pokémon to another of your opponent’s Pokémon?")){
                  moveEnergy(pcs,opp.all)
                }
              }
            }
          }
          move "Psychic Boom", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P
            onAttack {
              damage 10+10*opp.active.cards.energyCount(C)
            }
          }

        };
      case SWELLOW_49:
        return evolution (this, from:"Taillow", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Mid-air Crush", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Flip a coin. If heads, your opponent discards 1 Energy card, if any, attached to that Pokémon."
            energyCost C, C
            onAttack {
              def pcs = opp.all.select("Select the Pokémon to attack.")
              damage 20, pcs
              afterDamage{
                if (pcs.cards.energyCount(C)) {
                  flip { targeted (pcs, ATTACK) { pcs.cards.filterByType(ENERGY).oppSelect("Select the Energy to discard.").discard() } }
                }
              }
            }
          }
          move "Nosedive", {
            text "40 damage. Flip a coin. If tails, Swallow does 10 damage to itself."
            energyCost C, C
            onAttack {
              damage 40
              flip 1, {}, {damage 10, self}
            }
          }

        };
      case VIGOROTH_50:
        return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          pokeBody "Vigorous Aura", {
            text "As long as Vigoroth is your Active Pokémon, attacks by each player’s Active Pokémon (both if there are 2) do 10 more damage to any Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(self.active && it.from.active && it.to.active) {
                    bc "Vigorous Aura +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
          move "Scratch", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }

        };
      case WEEZING_51:
        return evolution (this, from:"Koffing", hp:HP070, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Liability", {
            text "Put damage counters on the Defending Pokémon until it is 10 HP away from being Knocked Out. Weezing does 70 damage to itself."
            energyCost C
            onAttack {
              directDamage defending.remainingHP.value - 10, defending
              damage 70, self
            }
          }
          move "Smogscreen", {
            text "20 damage. The Defending Pokémon is now Poisoned. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost G, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
              sandAttack(thisMove)
            }
          }

        };
      case BAGON_52:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness COLORLESS
          resistance FIRE, MINUS30
          resistance FIGHTING, MINUS30
          move "Singe", {
            text "Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              flip{apply BURNED}
            }
          }
          move "Doubleslap", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost W
            onAttack {
              flip 2,{damage 10}
            }
          }

        };
      case BALTOY_53:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness WATER
          move "Spinning Attack", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Selfdestruct", {
            text "40 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent’s). (Don’t apply weakness and Resistance for Benched Pokémon.) Baltoy does 50 damage to itself."
            energyCost F, C
            onAttack {
              damage 40
              opp.bench.each{
                damage 10,it
              }
              my.bench.each{
                damage 10,it
              }
              damage 50, self
            }
          }

        };
      case BARBOACH_54:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Amnesia", {
            text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost C
            onAttack {
              amnesia delegate
            }
          }
          move "Tackle", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }

        };
      case BELDUM_55:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Flip Over", {
            text "30 damage. Beldum does 10 damage to itself, and don’t apply Weakness and Resistance to this damage."
            energyCost C, C
            onAttack {
              damage 30
              noWrDamage(10, self)
            }
          }

        };
      case CARVANHA_56:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness GRASS
          resistance PSYCHIC, MINUS30
          move "Sharp Fin", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Carvanha."
            energyCost D, C
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case CORPHISH_57:
        return basic (this, hp:HP040, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Exoskeleton", {
            text "Any damage done to Corphish by attacks is reduced by 10 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Exoskeleton -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Double Chop", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2,{damage 10}
            }
          }

        };
      case DUSKULL_58:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          move "Paralyzing Gaze", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {apply PARALYZED}
            }
          }
          move "Will-o’-the-wisp", {
            text "20 damage."
            energyCost P, C
            onAttack {
              damage 20
            }
          }

        };
      case ELECTRIKE_59:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "High Voltage", {
            text "Flip a coin. If heads, your opponent can’t play Trainer cards from his or her hand during his or her next turn."
            energyCost L
            onAttack {
              flip {
                delayed{
                  def flag = false
                  before PROCESS_ATTACK_EFFECTS, {
                    flag = true
                  }
                  before BETWEEN_TURNS, {
                    flag = false
                  }
                  before USE_ABILITY, {
                    flag = true
                  }
                  after POKEPOWER, {
                    flag = false
                  }
                  after ACTIVATE_ABILITY, {
                    flag = false
                  }
                  before PLAY_TRAINER, {
                    if (bg.currentTurn == self.owner.opposite && !flag) {
                      wcu "High Voltage prevents playing this card"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
          move "Gnaw", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case ELECTRIKE_60:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Recharge", {
            text "Search your deck for a [L] Energy card and attach it to Electrike. Shuffle your deck afterward."
            energyCost L
            onAttack {
              attachEnergyFrom(type : L, my.deck, self)
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            onAttack {
              damage 10
              flip {damage 20}
            }
          }

        };
      case GOLDEEN_61:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              flip {apply CONFUSED}
            }
          }
          move "Waterfall", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case KOFFING_62:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Smog", {
            text "The Defending Pokémon is now Poisoned."
            energyCost G
            onAttack {
              apply POISONED
            }
          }

        };
      case LOTAD_63:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Rain Splash", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Aqua Wave", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost W, C
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case MAGIKARP_64:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Leap Out", {
            text "Switch Magikarp with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.bench : "There is no Pokémon on your bench."
            }
            onAttack {
              switchYourActive()
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Magikarp."
            energyCost W, C
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case MAKUHITA_65:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Thrust", {
            text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, discard 1 Energy card attached to the Defending Pokémon."
            energyCost C
            onAttack {
              flip {
                damage 10
                afterDamage { discardDefendingEnergy() }
              }

            }
          }
          move "Rising Lunge", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case NATU_66:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Mirror Coat", {
            text "If Natu if Burned or Poisoned by an opponent’s attack (even if Natu is Knocked Out), the Attacking Pokémon is now affected by the same Special Conditions (1 if there is only 1)."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                bc "Mirror Coat : ${ef.type}"
                if(ef.type == POISONED || ef.type == BURNED){
                  apply ef.type, self.owner.opposite.pbg.active, SRC_ABILITY
                }
              }
            }
          }

          move "Razor Wind", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {damage 20}
            }
          }

        };
      case NINCADA_67:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Dig Under", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost G
            onAttack {
              noWrDamage 10, opp.all.select()
            }
          }
          move "Scratch", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case NUMEL_68:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness WATER
          pokeBody "Dense", {
            text "Any damage done to Numel by attacks from Evolved Pokémon (both yours and your opponent’s) is reduced by 20 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.from.evolution && it.notNoEffect && it.dmg.value) {
                    bc "Dense -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case PHANPY_69:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Corkscrew Punch", {
            text "10 damage"
            energyCost F
            onAttack {
              damage 10
            }
          }
          move "Double Spin", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {damage 20}
            }
          }

        };
      case POOCHYENA_70:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Surprise", {
            text "Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C
            onAttack {
              astonish()
            }
          }
          move "Sharp Fang", {
            text "20 damage."
            energyCost D, C
            onAttack {
              damage 20
            }
          }

        };
      case SEEDOT_71:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case SHROOMISH_72:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {apply PARALYZED}
            }
          }
          move "Trip Over", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case SLAKOTH_73:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Slakoth."
            energyCost C
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }

        };
      case SLUGMA_74:
        return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
            }
          }
          move "Combustion", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }

        };
      case SLUGMA_75:
        return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Magma Ring", {
            text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 10
              cantRetreat defending
            }
          }
          move "Flare", {
            text "20 damage."
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case SPOINK_76:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hypnotic Gaze", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Flop", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case STARYU_77:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Rapid Spin", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch Staryu with 1 of your Benched Pokémon, if any."
            energyCost C
            onAttack {
              damage 10
              if(opp.bench) sw defending, opp.bench.oppSelect("Select new active.")
              switchYourActive()
            }
          }

        };
      case SURSKIT_78:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Agility", {
            text "10 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Surskit during your opponent’s next turn."
            energyCost G
            onAttack {
              damage 10
              flip{preventAllEffectsNextTurn()}
            }
          }

        };
      case SWABLU_79:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Fluff", {
            text "Whenever Swablu would be damaged or affected by an opponent’s attack and already has at least 1 damage counter on it, flip a coin. If heads, prevent all effects of that attack, including damage, done to Swablu."
            def lastDamageTurn = -1
            def flipResult = false
            delayedA {

              before null, self, Source.ATTACK, {
                if(lastDamageTurn != bg.turnCount && self.numberOfDamageCounters){
                  flip 1,{flipResult = true}, {flipResult = false}
                  lastDamageTurn = bg.turnCount
                }
                if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && self.numberOfDamageCounters && flipResult){
                  bc "Fluff prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                if(lastDamageTurn != bg.turnCount && self.numberOfDamageCounters){
                  flip 1,{flipResult = true}, {flipResult = false}
                  lastDamageTurn = bg.turnCount
                }
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && self.numberOfDamageCounters && flipResult){
                    it.dmg = hp(0)
                    bc "Fluff prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(lastDamageTurn != bg.turnCount && self.numberOfDamageCounters){
                  flip 1,{flipResult = true}, {flipResult = false}
                  lastDamageTurn = bg.turnCount
                }
                if(self.owner.pbg.all.findAll{it.name=="Regirock"}){
                  if(efs.to == self && bg.currentState == Battleground.BGState.ATTACK && self.numberOfDamageCounters && self.numberOfDamageCounters && flipResult){
                    discard efs.card
                  }
                }
              }
            }
          }
          move "Peck", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case TAILLOW_80:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Fly", {
            text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Taillow during your opponent’s next turn."
            energyCost C
            onAttack {

              flip {
                damage 10
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case WINGULL_81:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C, C
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case WURMPLE_82:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Ascension", {
            text "Search your deck for a card that evolves from Wurmple and put it on Wurmple. (This counts as evolving Wurmple.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def tar = my.deck.search("Evolves from $self", {it.cardTypes.is(EVOLUTION) && self.name == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
          move "Miracle Essence", {
            text "Flip a coin. If heads, choose 1 Special Condition. Each Defending Pokémon is now affected by that Special Condition."
            energyCost G
            onAttack {
              flip {
                apply choose([POISONED,ASLEEP,CONFUSED,BURNED,PARALYZED],"Choose 1 Special Condition to apply to the defending pokemon")
              }
            }
          }

        };
      case ZUBAT_83:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Self-control", {
            text "Zubat can’t be Paralyzed."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(ef.type == PARALYZED){
                  prevent()
                }
              }
            }
          }
          move "Bite", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case BALLOON_BERRY_84:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAs long as Balloon Berry is attached to a Pokémon, that Pokémon’s Retreat Cost is 0. When this Pokémon retreats, discard Balloon Berry."
          def eff1
          def eff2
          onPlay {reason->
            eff1=getter (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              h.object = 0
            }
            eff2 = delayed{
              after RETREAT, self, {
                discard thisCard
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
            eff2.unregister()
          }
        };
      case CRYSTAL_SHARD_85:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nAs long as this card is attached to a Pokémon, that Pokémon’s type is [C]. If that Pokémon attacks, discard this card at the end of the turn."
          def eff1
          def eff2
          def flag = false
          onPlay {reason->
            eff1 = getter GET_POKEMON_TYPE, BEFORE_LAST, self, {h ->
              h.object.clear()
              h.object.add(C)
            }
            eff2 = delayed{
              before ATTACK_MAIN, {
                flag = (ef.attacker == self)
              }
              before BETWEEN_TURNS, {
                if (flag) { discard thisCard }
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
            eff2.unregister()
          }
        };
      case ENERGY_CHARGE_86:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your discard pile for 2 Energy cards (1 if there is only 1), show them to your opponent, and shuffle them into your deck."
          onPlay {
            flip {
              def tar = my.discard.filterByType(ENERGY)
              def enCnt = Math.min(2, tar.size())
              tar.select(count: enCnt,"Select $enCnt Energy ${enCnt>1 ? "cards" : "card"}.").showToOpponent("Selected card${enCnt>1 ? "s" : ''}.").moveTo(my.deck)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.discard.filterByType(ENERGY) : "There are no Energy cards in your discard"
          }
        };
      case LADY_OUTING_87:
        return copy (RubySapphire.LADY_OUTING_83, this);
      case MASTER_BALL_88:
        return basicTrainer (this) {
          text "Look at the top 7 cards from your deck. Choose a Basic Pokémon or Evolution card from those cards, show it to your opponent, and put it into your hand. Put the other 6 cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
            my.deck.subList(0,7).select(min:0,"Select a Basic Pokémon or Evolution card to put to hand",cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "There are no cards left in your deck."
          }
        };
      case METEOR_FALLS_89:
        return stadium (this) {
          text "Each player’s Active Evolved Pokémon (excluding Pokémon-ex) can use any attack from its Basic Pokémon or its Stage 1 Evolution card. (You still have to pay for that attack’s Energy cost.)\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def eff
          onPlay {
            eff = getter (GET_MOVE_LIST) {holder->
              def pcs = holder.effect.target
              if(!(pcs.EX) && pcs.active && pcs.evolution){
                for(card in pcs.cards.filterByType(BASIC,STAGE1)){
                  if(card!=pcs.topPokemonCard){
                    holder.object.addAll(card.moves)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case PROFESSOR_COZMO_S_DISCOVERY_90:
        return supporter (this) {
          text "Flip a coin. If heads, draw the bottom 3 cards of your deck. If tails, draw the top 2 cards of your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            flip 1 ,{
              if(my.deck.size() < 3) {draw 3}
              else {my.deck.subList(my.deck.size() - 3, my.deck.size()).moveTo(hidden:true, my.hand)}
            },{
              draw 2
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      case SPACE_CENTER_91:
        return stadium (this) {
          text "Ignore Poké-Bodies for all Basic Pokémon in play (both yours and your opponent’s) (excluding Pokémon-ex and Pokémon that has an owner in its name).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def eff1
          def eff2
          onPlay {
            eff1 = getter IS_ABILITY_BLOCKED, { Holder h->
              if (h.effect.ability instanceof PokeBody && h.effect.target.notEvolution && !h.effect.target.EX && !h.effect.target.topPokemonCard.cardTypes.is(OWNERS_POKEMON)) {
                h.object=true
              }
            }
            eff2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if (h.effect.ability instanceof PokeBody && h.effect.target.notEvolution && !h.effect.target.EX && !h.effect.target.topPokemonCard.cardTypes.is(OWNERS_POKEMON)) {
                h.object=true
              }
            }
            new CheckAbilities().run(bg)
          }
          onRemoveFromPlay{
            eff1.unregister()
            eff2.unregister()
            new CheckAbilities().run(bg)
          }
        };
      case STRENGTH_CHARM_92:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nWhenever an attack from the Pokémon that Strength Charm is attached to does damage to the Active Pokémon, the attack does 10 more damage (before applying Weakness and Resistance). Discard Strength Charm at the end of the turn in which this Pokémon attacks."
          //TODO: Check for older non-groovy prints to apply the correct effect of this card. Got errata'd, used to increase damage after W/R (current behaviour: before W/R)
          def eff1
          def attackUsed = false
          onPlay {reason->
            eff1=delayed {
              before ATTACK_MAIN, {
                attackUsed = (ef.attacker == self)
              }
              after PROCESS_ATTACK_EFFECTS, {
                if(attackUsed) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
                    it.dmg += hp(10)
                    attackUsed=true
                    bc "Strength Charm +10"
                  }
                }
              }
              before BETWEEN_TURNS, {
                if(attackUsed) {discard thisCard}
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
          }
        };
      case BOOST_ENERGY_93:
        return specialEnergy (this, [[C],[C],[C]]) {
          text "Boost Energy can be attached only to an Evolved Pokémon. Discard Boost Energy at the end of the turn it was attached. Boost Energy provides [C][C][C] Energy. The Pokémon Boost Energy is attached to can’t retreat. If the Pokémon Boost Energy is attached to isn’t an Evolved Pokémon, discard Boost Energy."
          def eff
          def check = {
            if(!it.evolution){discard thisCard}
          }
          onPlay {reason->
            eff = delayed {
              before RETREAT, self, {
                wcu "$self can't retreat due to having Boost Energy attached."
                prevent()
              }
              before BETWEEN_TURNS, {
                discard thisCard
                unregister()
              }
              after EVOLVE, self, {check(self)} //some pokemon evolve into different type
              after DEVOLVE, self, {check(self)}
              after ATTACH_ENERGY, self, {check(self)}
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
            check(to)
          }
          allowAttach {to->
            to.evolution
          }
        };
      case HEAL_ENERGY_94:
        return specialEnergy (this, [[C]]) {
          text "Heal Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove 1 damage counter and all Special Conditions from that Pokémon. If heal Energy is attached to Pokémon-ex, Heal Energy has no effect other than providing Energy."
          onPlay {reason->
            if(!self.EX && reason == PLAY_FROM_HAND){
              heal (10, self, SRC_SPENERGY)
              clearSpecialCondition(self)
            }
          }
          onRemoveFromPlay {
          }
        };
      case SCRAMBLE_ENERGY_95:
        return specialEnergy (this, [[C]]) {
          text "Scramble Energy can be attached only to an Evolved Pokémon (excluding Pokémon-ex). Scramble Energy provides [C] Energy. While in play, if you have more prizes left than your opponent, Scramble Energy provides every type of Energy but provides only 3 in any combination at a time. If the Pokémon Scramble Energy is attached to isn’t an Evolved Pokémon (or evolves into Pokémon-ex), discard Scramble Energy."
          def eff
          def check = {
            if(!it.evolution || it.EX){discard thisCard}
          }
          onPlay {reason->
            eff = delayed {
              after EVOLVE, self, {check(self)}
              after DEVOLVE, self, {check(self)}
              after ATTACH_ENERGY, self, {check(self)}
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
            check(to)
          }
          allowAttach {to->
            to.evolution && !to.EX
          }
          getEnergyTypesOverride{
            if(self && self.owner.pbg.prizeCardSet.size() > self.owner.opposite.pbg.prizeCardSet.size()) {
              return [[R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set]
            }
            else {
              return [[C] as Set]
            }
          }

        };
      case CROBAT_EX_96:
        return evolution (this, from:"Golbat", hp:HP130, type:GRASS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokePower "Distortion", {
            text "Once during your turn (before you attack), if Crobat ex is your active pokemon, you may put 1 damage counter on 1 of your opponent’s Pokémon. This power can’t be used if Crobat ex is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your Active Pokémon"
              powerUsed()
              directDamage 10, opp.all.select(), SRC_ABILITY
            }
          }
          move "Cross Attack", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads. If you get 2 or more heads, the Defending Pokémon is now Confused."
            energyCost C, C
            onAttack {
              def headCnt = 0
              flip 4, {
                damage 20
                headCnt += 1
              }
              if(headCnt>=2) applyAfterDamage CONFUSED
            }
          }
          move "Pester", {
            text "60+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 60 damage plus 40 more damage."
            energyCost G, G, C
            onAttack {
              damage 60
              if(defending.specialConditions) damage 40
            }
          }

        };
      case DEOXYS_EX_97:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys ex"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Energy Burst", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Deoxys ex and the Defending Pokémon."
            energyCost P, C
            onAttack {
              damage 10 + 10 * (self.cards.energyCount(C) + defending.cards.energyCount(C))
            }
          }

        };
      case DEOXYS_EX_98:
        return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys ex"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Psyburst", {
            text "50+ damage. You may discard 2 Energy attached to Deoxys ex. If you do, this attack does 50 damage plus 20 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C, C
            onAttack {
              damage 50
              if(confirm("discard 2 Energy attached to Deoxys ex? If you do deal 20 more damage for every energy attached to the Defending Pokémon")){
                damage 20*defending.cards.energyCount(C)
                afterDamage{
                  discardSelfEnergy C,C
                }
              }
            }
          }

        };
      case DEOXYS_EX_99:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          pokePower "Form Change", {
            text "Once during your turn (before you attack), you may search your deck for another Deoxys ex and switch it with Deoxys ex. (Any cards attached to Deoxys ex, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys ex on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def oldDeoxys = self.topPokemonCard
              def newDeoxys = my.deck.search(min:0, max: 1, {
                it.name == "Deoxys ex"
              })

              if (newDeoxys) {
                newDeoxys.moveTo(self.cards)
                my.deck.add(oldDeoxys)
                self.cards.remove(oldDeoxys)
                checkFaint()
              }

              shuffleDeck()
            }
          }
          move "Psychic Shield", {
            text "50 damage. Prevent all effects of attacks, including damage, done to Deoxys ex by your opponent’s Pokémon-ex during your opponent’s next turn."
            energyCost P, C, C
            onAttack {
              damage 50
              delayed{
                before null, self, Source.ATTACK, {
                  //TODO: Should prevent stuff like Turtonator-GX's Shell Trap
                  if (self.owner.opposite.pbg.active.EX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                    bc "Psychic Shield effect"
                    prevent()
                  }
                }
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && it.from.EX ){
                      it.dmg = hp(0)
                      bc "Psychic Shield damage"
                    }
                  }
                }
                after ENERGY_SWITCH, {
                  def efs = (ef as EnergySwitch)
                  if(efs.from.EX && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                    discard efs.card
                  }
                }
                before FALL_BACK, self, {unregister()}
                before EVOLVE, self, {unregister()}
                before DEVOLVE, self, {unregister()}
                unregisterAfter 2
              }
            }
          }

        };
      case HARIYAMA_EX_100:
        return evolution (this, from:"Makuhita", hp:HP110, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          pokeBody "Commanding Aura", {
            text "As long as Hariyama ex is your Active Pokémon, your opponent can’t play any Stadium cards from his or her hand."
            delayedA {
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.is(STADIUM) && bg.currentTurn == self.owner.opposite && self.active) {
                  wcu "Commanding Aura prevents playing this card"
                  prevent()
                }
              }
            }
          }
          move "Knock Off", {
            text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost F, C
            onAttack {
              damage 40
              afterDamage{
                discardRandomCardFromOpponentsHand()
              }
            }
          }
          move "Pivot Throw", {
            text "80 damage. During your opponent’s next turn, any damage done to Hariyama ex by attacks is increased by 10 (before applying Weakness and Resistance)."
            energyCost F, F, C
            onAttack {
              damage 80
              delayed {
                after PROCESS_ATTACK_EFFECTS, {
                  bg.dm().each {
                    if(it.from.owner==self.owner.opposite && it.to==self && it.dmg.value && it.notNoEffect){
                      bc "Pivot Throw increases damage"
                      it.dmg+=hp(10)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE, self, {unregister()}
                after DEVOLVE, self, {unregister()}
                after FALL_BACK, self, {unregister()}
              }
            }
          }

        };
      case MANECTRIC_EX_101:
        return evolution (this, from:"Electrike", hp:HP100, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS30
          move "Disconnect", {
            text "40 damage. Your opponent can’t play any Trainer cards (except for Supporter cards) from his or her hand during your opponent’s next turn."
            energyCost L, C
            onAttack {
              damage 40
              delayed {
                before PLAY_TRAINER, {
                  if (!ef.cardToPlay.cardTypes.is(SUPPORTER) && bg.currentTurn == self.owner.opposite) {
                    wcu "Disconnect prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Mega Shot", {
            text "Discard all [L] Energy attached to Manetric ex and then choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L, C
            onAttack {
              discardAllSelfEnergy(L)
              damage 80, opp.all.select("Select the target of this attack.")
            }
          }

        };
      case RAYQUAZA_EX_102:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness COLORLESS
          resistance WATER, MINUS30
          resistance FIGHTING, MINUS30
          pokePower "Dragon Boost", {
            text "Once during your turn, when you put Rayquaza ex from your hand onto your Bench, you may move any number of basic Energy cards attached to your Pokémon to Rayquaza ex."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm("Use Dragon Boost to move any number of basic Energy cards attached to your Pokémon to Rayquaza ex?")) {
                powerUsed()
                while(1){
                  def pl = (my.all.findAll{ it.cards.filterByType(BASIC_ENERGY) && it != self })
                  if (pl.empty) break;
                  def src = pl.select("source for energy (cancel to stop)", false)
                  if (!src) break;
                  def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Spiral Blast", {
            text "20× damage. Does 20 damage for each basic Energy card attached to Rayquaza ex."
            energyCost R, L
            onAttack {
              damage 20*self.cards.filterByType(BASIC_ENERGY).size()
            }
          }

        };
      case SALAMENCE_EX_103:
        return evolution (this, from:"Shelgon", hp:HP160, type:COLORLESS, retreatCost:2) {
          weakness COLORLESS
          resistance FIRE, MINUS30
          resistance FIGHTING, MINUS30
          pokeBody "Dragon Lift", {
            text "The Retreat Cost for each of your Pokémon (excluding Pokémon-ex and Baby Pokémon) is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST) {h->
              if(h.effect.target.owner == self.owner && !h.effect.target.topPokemonCard.cardTypes.is(BABY) &&  !h.effect.target.EX) {
                h.object = 0
              }
            }
          }
          move "Flame Jet", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost R, C
            onAttack {
              noWrDamage 40, opp.all.select()
            }
          }
          move "Bright Flame", {
            text "120 damage. Discard 2 Energy attached to Salamence ex."
            energyCost R, W, C, C
            onAttack {
              damage 120
              afterDamage{
                discardSelfEnergy C,C
              }
            }
          }

        };
      case SHARPEDO_EX_104:
        return evolution (this, from:"Carvanha", hp:HP100, type:DARKNESS, retreatCost:0) {
          weakness GRASS
          resistance PSYCHIC, MINUS30
          move "Drag Off", {
            text "20 damage. Before doing damage, you may switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon. If you do, this attack does 20 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
            energyCost C, C
            onAttack {
              if (opp.bench && confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon before doing damage?")) {
                switchYourOpponentsBenchedWithActive()
              }
              damage 20
            }
          }
          move "Darkness Blast", {
            text "60+ damage. You may discard a [D] Energy attached to Sharpedo ex. If you do, this attack does 60 damage plus 20 more damage and discard 1 Energy card attached to the Defending Pokémon."
            energyCost D, D, C
            onAttack {
              damage 60
              if(confirm("Discard a [D] Energy attached to Sharpedo ex? You will do 20 more damage and discard 1 Energy card attached to the Defending Pokémon.")){
                damage 20
                afterDamage{
                  discardSelfEnergy D
                  discardDefendingEnergy()
                }
              }
            }
          }

        };
      case LATIAS_STAR_105:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness COLORLESS
          resistance PSYCHIC, MINUS30
          resistance FIGHTING, MINUS30
          move "Healing Light", {
            text "10 damage. Remove 1 damage counter from each of your Pokémon (including Latias Star)."
            energyCost C
            onAttack {
              damage 10
              afterDamage{
                my.all.each{
                  heal 10, it
                }
              }
            }
          }
          move "Shooting Star", {
            text "50+ damage. If the Defending Pokémon is Pokémon-ex, discard all Energy cards attached to Latias Star and this attack does 50 damage plus 100 more damage."
            energyCost R, W, P
            onAttack {
              damage 50
              if(defending.EX){
                damage 100
                discardAllSelfEnergy(null)
              }
            }
          }

        };
      case LATIOS_STAR_106:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness COLORLESS
          resistance GRASS, MINUS30
          resistance FIGHTING, MINUS30
          move "Miraculous Light", {
            text "10 damage. Remove 1 damage counter and all special Conditions from Latios Star."
            energyCost C
            onAttack {
              damage 10
              afterDamage{
                heal 10, self
                clearSpecialCondition(self, ATTACK)
              }
            }
          }
          move "Shining Star", {
            text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, discard all Energy cards attached to Latios Star and this attack does 50 damage plus 100 more damage."
            energyCost G, L, P
            onAttack {
              damage 50
              if(defending.evolution && defending.topPokemonCard.cardTypes.is(STAGE2)){
                damage 100
                discardAllSelfEnergy(null)
              }
            }
          }

        };
      case RAYQUAZA_STAR_107:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness COLORLESS
          resistance WATER, MINUS30
          resistance FIGHTING, MINUS30
          move "Spiral Rush", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
            energyCost R, L
            onAttack {
              flipUntilTails {damage 30}
            }
          }
          move "Holy Star", {
            text "Discard all Energy cards attached to Rayquaza Star. This attack does 100 damage to each of your opponent’s Pokémon-ex. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, R, L, L
            onAttack {
              discardAllSelfEnergy(null)
              opp.all.each{
                if(it.EX) damage 100, it
              }
            }
          }

        };
      case ROCKET_S_RAIKOU_EX_108:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          pokePower "Lightning Burst", {
            text "Whenever you attach a [D] Energy card from your hand to Rocket’s Raikou ex, you may choose 1 of the Defending Pokémon and switch it with 1 of your opponent’s Benched Pokémon. Your opponent chooses the Benched Pokémon to switch. This power can’t be used if Rocket’s Raikou ex is affected by a Special Condition."
            delayedA {
              after ATTACH_ENERGY, self, {
                if(!self.specialConditions && ef.reason == PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(D))
                  def oppPlayer = self.owner.opposite
                  if(oppPlayer){
                    if (confirm("Make your opponent switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon? (Your opponent chooses the Benched Pokémon to switch)")) {
                      sw oppPlayer.pbg.active, oppPlayer.pbg.bench.select("Select the new active Pokémon.", oppPlayer)
                    }
                  }
              }
            }

          }
          move "Thunderous Blow", {
            text "40+ damage. Does 40 damage plus 10 more damage for each [L] Energy attached to Rocket’s Raikou ex."
            energyCost L, C, C
            onAttack {
              damage 40+10*self.cards.energyCount(L)
            }
          }

        };
      default:
        return null;
    }
  }

}
