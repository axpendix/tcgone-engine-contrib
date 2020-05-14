package tcgwars.logic.impl.gen3;

import tcgwars.logic.impl.gen3.Deoxys;
import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen3.DeltaSpecies;
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
 * @author lithogenn@gmail.com
 */
public enum CrystalGuardians implements LogicCardInfo {

  BANETTE_1 ("Banette", 1, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  BLASTOISE_DELTA_2 ("Blastoise", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _FIGHTING_, _METAL_]),
  CAMERUPT_3 ("Camerupt", 3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_DELTA_4 ("Charizard", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, DELTA, _LIGHTNING_, _METAL_]),
  DUGTRIO_5 ("Dugtrio", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LUDICOLO_DELTA_6 ("Ludicolo", 6, Rarity.HOLORARE, [POKEMON, EVOLUTION, DELTA, STAGE2, _FIRE_]),
  LUVDISC_7 ("Luvdisc", 7, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MANECTRIC_8 ("Manectric", 8, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAWILE_9 ("Mawile", 9, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  SABLEYE_10 ("Sableye", 10, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SWALOT_11 ("Swalot", 11, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TAUROS_12 ("Tauros", 12, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  WIGGLYTUFF_13 ("Wigglytuff", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BLASTOISE_14 ("Blastoise", 14, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CACTURNE_DELTA_15 ("Cacturne", 15, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIGHTING_]),
  COMBUSKEN_16 ("Combusken", 16, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DUSCLOPS_17 ("Dusclops", 17, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  FEAROW_DELTA_18 ("Fearow", 18, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  GROVYLE_DELTA_19 ("Grovyle", 19, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _PSYCHIC_]),
  GRUMPIG_20 ("Grumpig", 20, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  IGGLYBUFF_21 ("Igglybuff", 21, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  KINGLER_DELTA_22 ("Kingler", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _FIRE_, _METAL_]),
  LOUDRED_23 ("Loudred", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  MARSHTOMP_24 ("Marshtomp", 24, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MEDICHAM_25 ("Medicham", 25, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  PELIPPER_DELTA_26 ("Pelipper", 26, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  SWAMPERT_27 ("Swampert", 27, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  VENUSAUR_28 ("Venusaur", 28, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHARMELEON_29 ("Charmeleon", 29, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARMELEON_DELTA_30 ("Charmeleon", 30, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, DELTA, _LIGHTNING_]),
  COMBUSKEN_31 ("Combusken", 31, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GROVYLE_32 ("Grovyle", 32, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GULPIN_33 ("Gulpin", 33, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  IVYSAUR_34 ("Ivysaur", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  IVYSAUR_35 ("Ivysaur", 35, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LAIRON_36 ("Lairon", 36, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  LOMBRE_37 ("Lombre", 37, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MARSHTOMP_38 ("Marshtomp", 38, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  NUZLEAF_39 ("Nuzleaf", 39, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SHUPPET_40 ("Shuppet", 40, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SKITTY_41 ("Skitty", 41, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  WARTORTLE_42 ("Wartortle", 42, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WARTORTLE_43 ("Wartortle", 43, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ARON_44 ("Aron", 44, Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BULBASAUR_45 ("Bulbasaur", 45, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BULBASAUR_46 ("Bulbasaur", 46, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CACNEA_47 ("Cacnea", 47, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHARMANDER_48 ("Charmander", 48, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMANDER_DELTA_49 ("Charmander", 49, Rarity.COMMON, [POKEMON, BASIC, DELTA, _LIGHTNING_]),
  DIGLETT_50 ("Diglett", 50, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DUSKULL_51 ("Duskull", 51, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ELECTRIKE_52 ("Electrike", 52, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  JIGGLYPUFF_53 ("Jigglypuff", 53, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  KRABBY_54 ("Krabby", 54, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LOTAD_55 ("Lotad", 55, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MEDITITE_56 ("Meditite", 56, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MUDKIP_57 ("Mudkip", 57, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MUDKIP_58 ("Mudkip", 58, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  NUMEL_59 ("Numel", 59, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SEEDOT_60 ("Seedot", 60, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SPEAROW_61 ("Spearow", 61, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SPOINK_62 ("Spoink", 62, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  SQUIRTLE_63 ("Squirtle", 63, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SQUIRTLE_64 ("Squirtle", 64, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TORCHIC_65 ("Torchic", 65, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TORCHIC_66 ("Torchic", 66, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  TREECKO_67 ("Treecko", 67, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  TREECKO_DELTA_68 ("Treecko", 68, Rarity.COMMON, [POKEMON, BASIC, DELTA, _PSYCHIC_]),
  WHISMUR_69 ("Whismur", 69, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  WINGULL_70 ("Wingull", 70, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  BILL_S_MAINTENANCE_71 ("Bill's Maintenance", 71, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CASTAWAY_72 ("Castaway", 72, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CELIO_S_NETWORK_73 ("Celio's Network", 73, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CESSATION_CRYSTAL_74 ("Cessation Crystal", 74, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  CRYSTAL_BEACH_75 ("Crystal Beach", 75, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  CRYSTAL_SHARD_76 ("Crystal Shard", 76, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  DOUBLE_FULL_HEAL_77 ("Double Full Heal", 77, Rarity.UNCOMMON, [TRAINER, ITEM]),
  DUAL_BALL_78 ("Dual Ball", 78, Rarity.UNCOMMON, [TRAINER, ITEM]),
  HOLON_CIRCLE_79 ("Holon Circle", 79, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  MEMORY_BERRY_80 ("Memory Berry", 80, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  MYSTERIOUS_SHARD_81 ("Mysterious Shard", 81, Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  POKE_BALL_82 ("Poké Ball", 82, Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKENAV_83 ("PokéNav", 83, Rarity.UNCOMMON, [TRAINER, ITEM]),
  WARP_POINT_84 ("Warp Point", 84, Rarity.UNCOMMON, [TRAINER, ITEM]),
  WINDSTORM_85 ("Windstorm", 85, Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_86 ("Energy Search", 86, Rarity.COMMON, [TRAINER, ITEM]),
  POTION_87 ("Potion", 87, Rarity.COMMON, [TRAINER, ITEM]),
  DOUBLE_RAINBOW_ENERGY_88 ("Double Rainbow Energy", 88, Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  AGGRON_EX_89 ("Aggron ex", 89, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _METAL_]),
  BLAZIKEN_EX_90 ("Blaziken ex", 90, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _FIGHTING_]),
  DELCATTY_EX_91 ("Delcatty ex", 91, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE1, _COLORLESS_]),
  EXPLOUD_EX_92 ("Exploud ex", 92, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _COLORLESS_]),
  GROUDON_EX_93 ("Groudon ex", 93, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _FIGHTING_]),
  JIRACHI_EX_94 ("Jirachi ex", 94, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _PSYCHIC_]),
  KYOGRE_EX_95 ("Kyogre ex", 95, Rarity.ULTRARARE, [POKEMON, BASIC, EX, _WATER_]),
  SCEPTILE_EX_DELTA_96 ("Sceptile ex", 96, Rarity.ULTRARARE, [POKEMON, EVOLUTION, STAGE2, DELTA, EX, _PSYCHIC_]),
  SHIFTRY_EX_97 ("Shiftry ex", 97, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _DARKNESS_]),
  SWAMPERT_EX_98 ("Swampert ex", 98, Rarity.ULTRARARE, [POKEMON, EVOLUTION, EX, STAGE2, _WATER_]),
  ALAKAZAM_STAR_99 ("Alakazam Star", 99, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  CELEBI_STAR_100 ("Celebi Star", 100, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  CrystalGuardians(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.CRYSTAL_GUARDIANS;
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
      case BANETTE_1:
      return evolution (this, from:"Shuppet", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokeBody "Safeguard", {
          text "Prevent all effects of attacks, including damage, done to Banette by your opponent's Pokémon-ex."
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
        move "Night Murmurs", {
          text "30 damage. If the Defending Pokémon is a Basic Pokémon, that Pokémon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
            if (defending.basic) {
              apply CONFUSED
            }
          }
        }
      };
      case BLASTOISE_DELTA_2:
      return evolution (this, from:"Wartortle", hp:HP110, type:[F, M], retreatCost:3) {
        weakness L
        pokeBody "Shield Veil", {
          text "Each of your Active Pokémon has no Weakness."
          getterA (GET_WEAKNESSES) { h->
            if(h.effect.target.owner == self.owner && h.effect.target.active) {
              def list = h.object as List<Weakness>
              list.clear()
            }
          }
        }
        move "Enraged Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 10 damage for each damage counter on Blastoise to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters, opp.all.select("Deal damage to?")
          }
        }
        move "Skull Bash", {
          text "60 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CAMERUPT_3:
      return evolution (this, from:"Numel", hp:HP080, type:R, retreatCost:2) {
        weakness W
        pokeBody "Delta Protection", {
          text "Any damage done to Camerupt by attacks from your opponent's Pokémon that has δ on its card is reduced by 40 (after applying Weakness and Resistance)."
          delayedA{
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.from.topPokemonCard.cardTypes.is(DELTA) && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect) {
                  bc "Delta Protection reduces damage from δ Pokemon by 40"
                  it.dmg -= hp(40)
                }
              }
            }
          }
        }
        move "Linear Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30, opp.all.select()
          }
        }
        move "Combustion", {
          text "50 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CHARIZARD_DELTA_4:
      return evolution (this, from:"Charmeleon", hp:HP120, type:[L, M], retreatCost:2) {
        weakness W
        pokePower "Peal of Thunder", {
          text "Once during your turn, when you play Charizard from your hand to evolve 1 of your Pokémon, you may look at the top 5 cards of your deck, choose as many Energy cards as you like, and attach them to 1 of your Pokémon. Discard the other cards."
          onActivate {r->
            if (r==PLAY_FROM_HAND && bg.em().retrieveObject("Peal_Of_Thunder") != bg.turnCount && my.deck && confirm("Use Peal of Thunder?")) {
              powerUsed()
              bg.em().storeObject("Peal_Of_Thunder", bg.turnCount)
              my.deck.subList(0,5).showToMe("Top 5 cards of your deck.")
              if (my.deck.subList(0,5).filterByType(ENERGY)) {
                def tar = my.all.select("Attach Energies to?")
                my.deck.subList(0,5).filterByType(ENERGY).each {
                  if (it.cardTypes.is(ENERGY)) {
                    attachEnergy(self,it)
                  } else {
                    discard it
                  }
                }
              }
            }
          }
        }
        move "Metal Burn", {
          text "120 damage. Discard all [M] Energy attached to Charizard."
          energyCost L, M, M, C
          attackRequirement {}
          onAttack {
            damage 120
            discardAllSelfEnergy(M)
          }
        }
      };
      case DUGTRIO_5:
      return evolution (this, from:"Diglett", hp:HP070, type:F, retreatCost:1) {
        weakness G
        pokeBody "Sand Veil", {
          text "Prevent all damage done to your Benched Pokémon by your opponent's attacks."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {if(it.to.owner==self.owner && it.to.benched && it.dmg.value){
                bc "Sand Veil reduces damage"
                it.dmg=hp(0)
              }}
            }
          }
        }
        move "Dig Under", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30, opp.all.select()
          }
        }
        move "Double-edge", {
          text "60 damage. Dugtrio does 10 damage to itself."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
            damage 10, self
          }
        }
      };
      case LUDICOLO_DELTA_6:
      return evolution (this, from:"Lombre", hp:HP100, type:R, retreatCost:2) {
        weakness L
        pokeBody "Overzealous", {
          text "If your opponent has any Pokémon-ex in play, each of Ludicolo's attacks does 30 more damage to the Defending Pokémon."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if (ef.attacker == self && it.notNoEffect && it.dmg.value && it.to.active) {
                if (opp.all.findAll { it.EX }) {
                  bc "Overzealous +30"
                  it.dmg += hp(30)
                }
              }
            }
          }
        }
        move "Knock Off", {
          text "30 damage. Choose 1 card from your opponent's hand without looking and discard it."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
            discardRandomCardFromOpponentsHand()
          }
        }
        move "Fire Punch", {
          text "60 damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case LUVDISC_7:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Even Game", {
          text "Count the number of your opponent's Pokémon. Search your deck for up to that number of Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
            assert my.bench.notFull : "Bench is full"
          }
          onAttack {
            def maxSpace = Math.min(opp.all.size(), my.bench.freeBenchCount)
            deck.search (min: 0,max:maxSpace, cardTypeFilter(BASIC)).each {
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Stadium Play", {
          text "10 damage. If you have a Stadium card in play, remove 1 damage counter from each of your Pokémon. If your opponent has a Stadium card in play, this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            if (bg.stadiumInfoStruct) {
              if (bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                my.all.each {
                  heal 10, it
                }
              } else {
                opp.all.each {
                  damage 10, it
                }
              }
            }
          }
        }
      };
      case MANECTRIC_8:
      return evolution (this, from:"Electrike", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Kick Away", {
          text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              whirlwind()
            }
          }
        }
        move "Strong Current", {
          text "50 damage. If Manectric has a Pokémon Tool card attached to it, this attack does 20 damage to each of your opponent's Benched Pokémon-ex. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
            if (self.cards.hasType(POKEMON_TOOL)) {
              opp.bench.each {
                damage 20, it
              }
            }
          }
        }
      };
      case MAWILE_9:
      return basic (this, hp:HP060, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Mining", {
          text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. If that card is a Pokémon Tool card, you may attach it to 1 of your Pokémon instead. Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck : "Deck is empty"
          }
          onAttack {
            def trainer = my.deck.search(count:1, "Select an Trainer card",cardTypeFilter(ITEM))
            trainer.each {
              if (it.cardTypes.is(POKEMON_TOOL)) {
                if (my.all.findAll{!it.cards.filterByType(POKEMON_TOOL)} && confirm("Attach this tool to one of your pokémon?")) {
                  trainer.moveTo(my.all.findAll{!it.cards.filterByType(POKEMON_TOOL)}.select("Attach $it to which pokémon?").cards)
                }
                else {
                  trainer.moveTo(my.hand)
                }
              }
              else {
                trainer.moveTo(my.hand)
              }
            }
            shuffleDeck()
          }
        }
        move "Bite Off", {
          text "20+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 20 damage plus 30 more damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
            if (defending.EX) {
              damage 30
            }
          }
        }
      };
      case SABLEYE_10:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        resistance C, MINUS30
        pokePower "Excavate", {
          text "Once during your turn (before your attack), you may look at the card on top of your deck. Put that card on top of your deck, or discard that card. This power can't be used if Sableye is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert my.deck : "Deck is empty"
            powerUsed()
            my.deck.subList(0,1).showToMe("Top card")
            if (confirm("Discard the top card of your deck?")) {
              discard my.deck.first()
            }
          }
        }
        move "Disable", {
          text "10 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            amnesia delegate
          }
        }
      };
      case SWALOT_11:
      return evolution (this, from:"Gulpin", hp:HP080, type:G, retreatCost:1) {
        weakness P
        move "Pick and Choose", {
          text "Choose either Burned or Poisoned, and either Asleep or Confused. The Defending Pokémon is now affected by both Special Conditions."
          energyCost C, C
          attackRequirement {}
          onAttack {
            def choice1 = choose([1,2], ['Apply Burn', 'Apply Poison'], "Choose 1")
            def choice2 = choose([3,4], ['Apply Asleep', 'Apply Confusion'], "Choose 1")

            if (choice1 == 1) {
              apply BURNED
            } else {
              apply POISONED
            }
            if (choice2 == 3) {
              apply ASLEEP
            } else {
              apply CONFUSED
            }
          }
        }
        move "Reactive Poison", {
          text "50+ damage. Does 50 damage plus 20 more damage for each Special Condition affecting the Defending Pokémon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 50+20*defending.specialConditions.size()
          }
        }
      };
      case TAUROS_12:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "Crush Chance", {
          text "Once during your turn, when you put Tauros from your hand onto your Bench, you may discard a Stadium card in play."
          onActivate {r->
            if (r==PLAY_FROM_HAND && bg.stadiumInfoStruct && bg.em().retrieveObject("Crush_Chance")!=bg.turnCount && confirm('Use Crush Chance to discard the current Stadium Card?')) {
              bg.em().storeObject("Crush_Chance", bg.turnCount)
              powerUsed()
              discard bg.stadiumInfoStruct.stadiumCard
            }
          }
        }
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic: true, 2, delegate)
        }
        move "Horn Attack", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WIGGLYTUFF_13:
      return evolution (this, from:"Jigglypuff", hp:HP090, type:C, retreatCost:2) {
        weakness F
        pokeBody "Fluffy Fur", {
          text "If Wigglytuff is your Active Pokémon and is damaged by an opponent's attack (even if Wigglytuff is Knocked Out), the Attacking Pokémon is now Asleep."
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({it.to==self && it.dmg.value})) {
                bc "Fluffy Fur"
                apply ASLEEP, (ef.attacker as PokemonCardSet)
              }
            }
            after SWITCH, self, {unregister()}
          }
        }
        move "Collect", {
          text "Draw 3 cards."
          energyCost C
          attackRequirement { assert my.deck : "Deck is empty"}
          onAttack {
            draw 3
          }
        }
        move "Pester", {
          text "30+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 30 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            if(defending.specialConditions) damage 20
          }
        }
      };
      case BLASTOISE_14:
      return evolution (this, from:"Wartortle", hp:HP120, type:W, retreatCost:2) {
        weakness L
        pokeBody "Water Pressure", {
          text "As long as Blastoise's remaining HP is 40 or less, Blastoise does 40 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (it.from == self && self.getRemainingHP().value <= 40 && it.dmg.value && it.notNoEffect) {
                  bc "Water Pressure +40"
                  it.dmg += hp(40)
                }
              }
            }
          }
        }
        move "Hydro Pump", {
          text "50+ damage. Does 50 damage plus 20 more damage for each [W] Energy attached to Blastoise but not used to pay for this attack's Energy cost. You can't add more than 40 damage in this way."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
            extraEnergyDamage(2, hp(20), W, thisMove)
          }
        }
      };
      case CACTURNE_DELTA_15:
      return evolution (this, from:"Cacnea", hp:HP080, type:F, retreatCost:1) {
        weakness R
        pokePower "Spike Storm", {
          text "Once during your turn (before your attack), if Cacturne is your Active Pokémon, you may put 1 damage counter on 1 of your opponent's Pokémon that already has any damage counters on it. This power can't be used if Cacturne is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            assert self.active : "Cacturne is not an Active Pokemon"
            powerUsed()
            directDamage 10, opp.all.findAll { it.numberOfDamageCounters }.select()
          }
        }
        move "Triple Needle", {
          text "Choose 3 of your opponent's Pokémon. This attack does 10 damage to each of those Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            multiSelect(opp.all, 3).each {
              targeted(it) {
                damage 10, it
              }
            }
          }
        }
        move "Light Punch", {
          text "50 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case COMBUSKEN_16:
      return evolution (this, from:"Torchic", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Focus Energy", {
          text "During your next turn, Combusken's High Jump Kick attack's base damage is 70."
          energyCost F
          attackRequirement {}
          onAttack {
            increasedBaseDamageNextTurn("High Jump Kick", hp(40))
          }
        }
        move "High Jump Kick", {
          text "30 damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DUSCLOPS_17:
      return evolution (this, from:"Duskull", hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        pokeBody "Cursed Glare", {
          text "As long as Dusclops is your Active Pokémon, your opponent can't attach any Special Energy cards (except for Darkness and [M] Energy cards) from his or her hand to his or her Active Pokémon."
          delayedA {
            before PLAY_ENERGY, {
              if (self.active && ef.cardToPlay.cardTypes.is(SPECIAL_ENERGY) && bg.currentTurn == self.owner.opposite) {
                if (!ef.cardToPlay.name.contains("Metal") || !ef.cardToPlay.name.contains("Darkness")) {
                  wcu "Cursed Glare prevents playing this card"
                  prevent()
                }
              }
            }
          }
        }
        move "Will-o'-the-wisp", {
          text "30 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Psychic Shield", {
          text "50 damage. Prevent all effects of attacks, including damage, done to Dusclops by your opponent's Pokémon-ex during your opponent's next turn."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 50
            preventAllEffectsFromCustomPokemonNextTurn(thisMove, self, {it.EX})
          }
        }
      };
      case FEAROW_DELTA_18:
      return evolution (this, from:"Spearow", hp:HP060, type:L, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        pokePower "Delta Sign", {
          text "Once during your turn (before your attack), you may search your deck for a Pokémon that has δ on its card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. You can't use more than 1 Delta Sign Poké-Power each turn. This power can't be used if Fearow is affected by a Special Condition."
          actionA {
            assert my.deck : "Deck is empty"
            checkNoSPC()
            checkLastTurn()
            powerUsed()
            deck.search("Search your deck for a δ Pokemon", {it.cardTypes.pokemon && it.topPokemonCard.cardTypes.is(DELTA) }).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Pierce", {
          text "30 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GROVYLE_DELTA_19:
      return evolution (this, from:"Treecko", hp:HP070, type:P, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Scratch", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Agility", {
          text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Grovyle during your opponent's next turn."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { preventAllEffectsNextTurn() }
          }
        }
      };
      case GRUMPIG_20:
      return evolution (this, from:"Spoink", hp:HP080, type:P, retreatCost:2) {
        weakness P
        pokeBody "Thick Fat", {
          text "Any damage done to Grumpig by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner != self.owner && (ef.attacker.types.contains(R) || ef.attacker.types.contains(W))) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Thick Fat -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
        }
        move "Circular Steps", {
          text "10x damage. Does 10 damage times the number of Pokémon in play (both yours and your opponent's), excluding Grumpig."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 10*(all.size() - 1)
          }
        }
      };
      case IGGLYBUFF_21:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokeBody "Hover Lift", {
          text "You pay [C] less to retreat your Jigglypuff, Wigglytuff, Wigglytuff ex, and Igglybuff."
          getterA GET_RETREAT_COST ,{ h->
            if (h.effect.target.owner == self.owner && (h.effect.target.name == "Jigglypuff" || h.effect.target.name == "Wigglytuff" || h.effect.target.name == "Wigglytuff ex" || h.effect.target.name == "Igglybuff")) {
              h.object = Math.max(0, h.object-1)
            }
          }
        }
      };
      case KINGLER_DELTA_22:
      return evolution (this, from:"Krabby", hp:HP080, type:[R, M], retreatCost:3) {
        weakness L
        move "Body Slam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { apply PARALYZED }
          }
        }
        move "Prop-up Pinchers", {
          text "40+ damage. If Kingler has a Pokémon Tool card attached to it, this attack does 40 damage plus 40 more damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
            if (self.cards.hasType(POKEMON_TOOL)) damage 40
          }
        }
      };
      case LOUDRED_23:
      return evolution (this, from:"Whismur", hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Surprise", {
          text "20 damage. Choose 1 card from your opponent's hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            afterDamage { astonish() }
          }
        }
        move "Bass Control", {
          text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40, opp.all.select()
          }
        }
      };
      case MARSHTOMP_24:
      return evolution (this, from:"Mudkip", hp:HP070, type:W, retreatCost:1) {
        weakness G
        move "Rain Splash", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mud Splash", {
          text "30 damage. Does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
            if (opp.bench) {
              damage 30, opp.all.bench()
            }
          }
        }
      };
      case MEDICHAM_25:
      return evolution (this, from:"Meditite", hp:HP080, type:F, retreatCost:1) {
        weakness P
        pokeBody "Dual Armor", {
          text "As long as Medicham has any [P] Energy cards attached to it, Medicham is both Psychic and Fighting type."
          getterA GET_POKEMON_TYPE, self, { h->
            if (self.cards.energyCount(P)) h.object.add(P)
          }
        }
        move "Psyshock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Sky Uppercut", {
          text "50 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
            dontApplyResistance()
          }
        }
      };
      case PELIPPER_DELTA_26:
      return evolution (this, from:"Wingull", hp:HP070, type:L, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        pokePower "Delta Transport", {
          text "Once during your turn (before your attack), if Pelipper is on your Bench, you may switch 1 of your Active Pokémon that has δ on its card with 1 of your Benched Pokémon."
          actionA {
            assert my.active.topPokemonCard.cardTypes.is(DELTA) : "Active is not Delta Pokemon"
            checkLastTurn()
            assert self.benched : "Pelipper not on Bench"
            powerUsed()
            sw my.active, my.bench.select("Select a new active Pokemon.")
          }
        }
        move "Supersonic", {
          text "20 damage. The Defending Pokémon is now Confused."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
            apply CONFUSED
          }
        }
        move "Wing Attack", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SWAMPERT_27:
      return evolution (this, from:"Marshtomp", hp:HP120, type:F, retreatCost:2) {
        weakness G
        pokePower "Echo Draw", {
          text "Once during your turn (before your attack), you may draw a card. This power can't be used if Swampert is affected by a Special Condition."
          actionA {
            assert my.deck : "Deck is empty"
            checkNoSPC()
            checkLastTurn()
            powerUsed()
            draw 1
          }
        }
        move "Rock Hurl", {
          text "60 damage. This attack's damage isn't affected by Resistance."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
            dontApplyResistance()
          }
        }
      };
      case VENUSAUR_28:
      return evolution (this, from:"Ivysaur", hp:HP110, type:G, retreatCost:3) {
        weakness R
        pokeBody "Chlorophyll", {
          text "All Energy cards that provide only [C] Energy attached to your [G] Pokémon provide [G] Energy instead."
          getterA GET_ENERGY_TYPES, { holder ->
            if(holder.effect.target.owner == self.owner
              && holder.effect.card.containsTypePlain(C)
              && holder.effect.card.cardTypes.is(BASIC_ENERGY)) {
              holder.object = [[G] as Set]
            }
          }
        }
        move "Green Blast", {
          text "20+ damage. Does 20 damage plus 10 more damage for each [G] Energy attached to all of your Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            my.all.each {
              damage 10*it.cards.energyCount(G)
            }
          }
        }
        move "Toxic Sleep", {
          text "The Defending Pokémon is now Asleep and Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            apply ASLEEP
            apply POISONED
            extraPoison 1
          }
        }
      };
      case CHARMELEON_29:
      return evolution (this, from:"Charmander", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Rage", {
          text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Charmeleon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10+10*self.numberOfDamageCounters
          }
        }
        move "Flamethrower", {
          text "60 damage. Discard a [R] Energy attached to Charmeleon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 60
            discardSelfEnergy R
          }
        }
      };
      case CHARMELEON_DELTA_30:
      return evolution (this, from:"Charmander", hp:HP070, type:L, retreatCost:1) {
        weakness W
        move "Slash", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder Jolt", {
          text "50 damage. Flip a coin. If tails, Charmeleon does 10 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
            flip 1, {}, { damage 10, self }
          }
        }
      };
      case COMBUSKEN_31:
      return evolution (this, from:"Torchic", hp:HP080, type:R, retreatCost:2) {
        weakness W
        move "Searing Flame", {
          text "10 damage. The Defending Pokémon is now Burned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            apply BURNED
          }
        }
        move "Firebreathing", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip { damage 20 }
          }
        }
      };
      case GROVYLE_32:
      return evolution (this, from:"Treecko", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Detect", {
          text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Grovyle during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            flip { preventAllEffectsNextTurn() }
          }
        }
        move "Smash Kick", {
          text "30 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GULPIN_33:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Amnesia", {
          text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            amnesia delegate
          }
        }
        move "Sludge Toss", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case IVYSAUR_34:
      return evolution (this, from:"Bulbasaur", hp:HP080, type:G, retreatCost:1) {
        weakness P
        move "Sleep Powder", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            apply ASLEEP
          }
        }
        move "Vine Whip", {
          text "40 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case IVYSAUR_35:
      return evolution (this, from:"Bulbasaur", hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Stretch Vine", {
          text "Choose 1 of your opponent's Benched Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            if (opp.bench) {
              damage 30, opp.bench.select()
            }
          }
        }
        move "Sharp Leaf", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
            flip { damage 20 }
          }
        }
      };
      case LAIRON_36:
      return evolution (this, from:"Aron", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Roar", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {
            whirlwind()
          }
        }
        move "Metal Charge", {
          text "50 damage. Put 1 damage counter on Lairon."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
            damage 10, self
          }
        }
      };
      case LOMBRE_37:
      return evolution (this, from:"Lotad", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Plunder", {
          text "20 damage. Before doing damage, discard all Trainer cards attached to the Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            if (defending.cards.filterByType(TRAINER)){
              defending.cards.filterByType(TRAINER).discard()
            }
            damage 20
          }
        }
        move "Wave Splash", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MARSHTOMP_38:
      return evolution (this, from:"Mudkip", hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Hug", {
          text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            cantRetreat defending
          }
        }
        move "Mud Shot", {
          text "50 damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case NUZLEAF_39:
      return evolution (this, from:"Seedot", hp:HP080, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Self Charge", {
          text "Attach a [D] Energy card from your hand to Nuzleaf."
          energyCost C
          attackRequirement {}
          onAttack {
            attachEnergyFrom(type:D, my.hand, self)
          }
        }
        move "Corkscrew Punch", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SHUPPET_40:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Ascension", {
          text "Search your deck for a card that evolves from Shuppet and put it onto Shuppet. (This counts as evolving Shuppet.) Shuffle your deck afterward."
          energyCost C
          attackRequirement {
            assert my.deck
          }
          onAttack {
            def nam=self.name
            def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
            if(tar) evolve(self, tar.first(), OTHER)
            shuffleDeck()
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SKITTY_41:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Tail Whap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Feint Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            swiftDamage(20, opp.all.select())
          }
        }
      };
      case WARTORTLE_42:
      return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
            flip { apply PARALYZED }
          }
        }
        move "Tackle", {
          text "50 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case WARTORTLE_43:
      return evolution (this, from:"Squirtle", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokémon can't attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { cantAttackNextTurn defending }
          }
        }
        move "Bite", {
          text "40 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ARON_44:
      return basic (this, hp:HP050, type:M, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        move "Flail", {
          text "10x damage. Does 10 damage times the number of damage counters on Aron."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10*self.numberOfDamageCounters
          }
        }
      };
      case BULBASAUR_45:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Tackle", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poisonpowder", {
          text "The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            apply POISONED
          }
        }
      };
      case BULBASAUR_46:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Growth", {
          text "Attach a [G] Energy card from your hand to Bulbasaur."
          energyCost C
          attackRequirement {}
          onAttack {
            attachEnergyFrom(type:G, my.hand, self)
          }
        }
        move "Vine Whip", {
          text "20 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CACNEA_47:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
          energyCost C
          callForFamily(basic: true, 1, delegate)
        }
        move "Rising Lunge", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 20 }
          }
        }
      };
      case CHARMANDER_48:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Retaliate", {
          text "10x damage. Does 10 damage times the number of damage counters on Charmander."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Flame Tail", {
          text "20 damage."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CHARMANDER_DELTA_49:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness W
        move "Scratch", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DIGLETT_50:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Mud Slap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sand Pit", {
          text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
            cantRetreat defending
          }
        }
      };
      case DUSKULL_51:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Collect", {
          text "Draw a card."
          energyCost C
          attackRequirement { assert my.deck : "Deck is empty" }
          onAttack {
            draw 1
          }
        }
        move "Super Psy Bolt", {
          text "10 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELECTRIKE_52:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS30
        move "Sniff Out", {
          text "Put any 1 card from your discard pile into your hand."
          energyCost C
          attackRequirement { assert my.discard : "Discard is empty"}
          onAttack {
            my.discard.select().moveTo(my.hand)
          }
        }
        move "Quick Blow", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
      };
      case JIGGLYPUFF_53:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Hypnoblast", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            apply ASLEEP
          }
        }
      };
      case KRABBY_54:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Vital Pinchers", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { damage 10 }
          }
        }
      };
      case LOTAD_55:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        pokeBody "Aqua Lift", {
          text "If Lotad has any [W] Energy attached to it, the Retreat Cost for Lotad is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST, self) {h->
            if (self.cards.energyCount(W)) {
              h.object = 0
            }
          }
        }
        move "Rolling Tackle", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEDITITE_56:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Kick", {
          text "10 damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pure Power", {
          text "Put 2 damage counters on your opponent's Pokémon in any way you like."
          energyCost C, C
          attackRequirement {}
          onAttack {
            (1..2).each {
              if (opp.all) directDamage(10, opp.all.select("Put a damage counter on - $it out of 2"))
            }
          }
        }
      };
      case MUDKIP_57:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        pokeBody "Submerge", {
          text "As long as Mudkip is on your Bench, prevent all damage done to Mudkip by attacks (both yours and your opponent's)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (!self.active && it.to == self) {
                  bc "Submerge prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Mud Slap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MUDKIP_58:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Nap", {
          text "Remove 2 damage counters from Mudkip."
          energyCost C
          attackRequirement {}
          onAttack {
            heal 20, self
          }
        }
        move "Waterfall", {
          text "20 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NUMEL_59:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Take Down", {
          text "30 damage. Numel does 10 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            damage 10, self
          }
        }
      };
      case SEEDOT_60:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SPEAROW_61:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Spearhead", {
          text "Draw a card."
          energyCost C
          attackRequirement { assert my.deck : "Deck is empty" }
          onAttack {
            draw 1
          }
        }
      };
      case SPOINK_62:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Psywave", {
          text "10x damage. Does 10 damage times the amount of Energy attached to the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10*defending.cards.energyCount(C)
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SQUIRTLE_63:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Bite", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Skull Bash", {
          text "30 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SQUIRTLE_64:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        pokeBody "Solid Shell", {
          text "Any damage done to Squirtle by attacks is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to == self && it.dmg.value && it.notNoEffect) {
                  bc "Solid Shell -10"
                  it.dmg -= hp(10)
                }
              }
            }
          }
        }
        move "Bubblebeam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case TORCHIC_65:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Claw", {
          text "20 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { damage 20 }
          }
        }
      };
      case TORCHIC_66:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Sand Attack", {
          text "10 damage. If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            sandAttack(thisMove)
          }
        }
      };
      case TREECKO_67:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply PARALYZED }
          }
        }
        move "Scratch", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TREECKO_DELTA_68:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Pound", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Shining Claws", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            flip { apply PARALYZED }
          }
        }
      };
      case WHISMUR_69:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Supersonic", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {
            flip { apply CONFUSED }
          }
        }
        move "Hyper Voice", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WINGULL_70:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Wing Attack", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case BILL_S_MAINTENANCE_71:
      return copy(FireRedLeafGreen.BILL_S_MAINTENANCE_87, this)
      case CASTAWAY_72:
      return supporter (this) {
        text "Search your deck for a Supporter card, a Pokémon Tool card, and a basic Energy card. Show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
          my.deck.search(max: 3, "Select a Supporter card, a Pokémon Tool card and a Basic Energy card", {it.cardTypes.is(SUPPORTER) || it.cardTypes.is(POKEMON_TOOL) || it.cardTypes.is(BASIC_ENERGY)}, { CardList list ->
            list.filterByType(SUPPORTER).size() <= 1 && list.filterByType(POKEMON_TOOL).size() <= 1 && list.filterByType(BASIC_ENERGY).size() <= 1
          }).moveTo(my.hand)

          shuffleDeck()
        }
        playRequirement{
          assert my.deck : "Deck is empty"
        }
      };
      case CELIO_S_NETWORK_73:
      return copy(FireRedLeafGreen.CELIO_S_NETWORK_88, this)
      case CESSATION_CRYSTAL_74:
      return pokemonTool (this) {
        text "Attach Cessation Crystal to 1 of your Pokémon (excluding Pokémon-ex) that doesn't already have a Pokémon Tool attached to it. If the Pokémon Cessation Crystal is attached to is a Pokémon-ex, discard this card." +
          "As long as Cessation Crystal is attached to an Active Pokémon, each player's Pokémon (both yours and your opponent's) can't use any Poké-Powers or Poké-Bodies."
        def eff
        onPlay {reason->
          eff = getter IS_ABILITY_BLOCKED, { Holder h->
            if (self.active && (h.effect.ability instanceof PokeBody || h.effect.ability instanceof PokePower)) {
              h.object=true
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
        allowAttach { to->
          !to.EX
        }
      };
      case CRYSTAL_BEACH_75:
      return stadium (this) {
        text "Each Special Energy card that provides 2 or more Energy (both yours and your opponent's) now provides only 1 [C] Energy. This isn't affected by any Poké-Powers or Poké-Bodies."
        def eff
        onPlay {
          eff = getter GET_ENERGY_TYPES, { holder->
            if (holder.effect.card.containsTypePlain(G) && holder.object.size() >= 2
              && holder.effect.card.cardTypes.is(SPECIAL_ENERGY)) {
              holder.object = [[C] as Set]
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case CRYSTAL_SHARD_76:
      return copy(Deoxys.CRYSTAL_SHARD_85, this)
      case DOUBLE_FULL_HEAL_77:
      return copy (Sandstorm.DOUBLE_FULL_HEAL_86, this)
      case DUAL_BALL_78:
      return copy(DeltaSpecies.DUAL_BALL_89, this)
      case HOLON_CIRCLE_79:
      return stadium (this) {
        text "Prevent all effects of an attack, including damage, done by either player's Active Pokémon. If an Active Pokémon uses an attack, that attack ends, and discard this card."
        def eff
        onPlay {
          eff = delayed {
            before null, null, Source.ATTACK, {
              bc "Holon Circle prevents the attack"
              prevent()
              discard ef.cardToPlay
              unregister()
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case MEMORY_BERRY_80:
      return pokemonTool (this) {
        text "The Pokémon this card is attached to can use any attack from its Basic Pokémon or its Stage 1 Evolution card. (You still have to pay for that attack's Energy cost.) If that Pokémon attacks, discard this card at the end of the turn."
        def eff
        onPlay { reason ->
          eff = getter (GET_MOVE_LIST) { holder->
            if(holder.effect.target.active && holder.effect.target.evolution) {
              for(card in holder.effect.target.cards.filterByType(POKEMON)) {
                if(card!=holder.effect.target.topPokemonCard){
                  holder.object.addAll(card.moves)
                }
              }
            }
            unregisterAfter 1
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case MYSTERIOUS_SHARD_81:
      return pokemonTool (this) {
        text "Prevent all effects of attacks, including damage, done to the Pokémon that Mysterious Shard is attached to by your opponent's Pokémon-ex. Discard this card at the end of your opponent's next turn."
        def eff1
        def eff2
        onPlay {reason->
          eff1=delayed {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if (it.to == self && it.from.owner != self.owner && it.from.cardTypes.is(EX) && it.notZero && it.notNoEffect) {
                  it.dmg=hp(0)
                  bc "$name prevents damage"
                }
              }
            }
            before null, null, Source.ATTACK, {
              if (self.owner.opposite.pbg.active.cardTypes.is(EX) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && ef.target == self.owner) {
                bc "$name prevents effect"
                prevent()
              }
            }
          }
          eff2 = delayed {
            after BETWEEN_TURNS, {
              discard thisCard
              unregisterAfter 2
            }
          }
        }
      };
      case POKE_BALL_82:
      return copy(FireRedLeafGreen.POKE_BALL_95, this)
      case POKENAV_83:
      return copy(RubySapphire.POKENAV_88, this);
      case WARP_POINT_84:
      return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case WINDSTORM_85:
      return itemCard (this) {
        text "Choose up to 2 in any combination of Pokémon Tool cards and Stadium cards in play (both yours and your opponent's) and discard them."
        onPlay {
          def i = 2
          while(i-- > 0) {
            if (bg.stadiumInfoStruct && stadiumCanBeAffectedByItemAndSupporter() && confirm("Would you like to discard stadium in play (${bg.stadiumInfoStruct.stadiumCard})? If not, you can select a Pokemon Tool in play")) {
              discard bg.stadiumInfoStruct.stadiumCard
              continue
            }
            def tar = all.findAll {it.cards.hasType(POKEMON_TOOL)}
            if(tar) {
              def sel = tar.select("Select Pokemon to discard a Pokemon Tool from (cancel to stop)", i == 1)
              if (sel) {
                def list = sel.cards.filterByType(POKEMON_TOOL).select("Discard a Pokemon Tool from $sel")
                targeted (sel, TRAINER_CARD) {
                  list.discard()
                }
              }
            }
          }
        }
        playRequirement{
          assert all.findAll {it.cards.hasType(POKEMON_TOOL)} || (bg.stadiumInfoStruct && stadiumCanBeAffectedByItemAndSupporter())
        }
      };
      case ENERGY_SEARCH_86:
      return copy(BlackWhite.ENERGY_SEARCH_93, this);
      case POTION_87:
      return copy (FireRedLeafGreen.POTION_101, this)
      case DOUBLE_RAINBOW_ENERGY_88:
      return copy (TeamMagmaVsTeamAqua.DOUBLE_RAINBOW_ENERGY_88, this);
      case AGGRON_EX_89:
      return evolution (this, from:"Lairon", hp:HP150, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        pokeBody "Intimidating Armor", {
          text "As long as Aggron ex is your Active Pokémon, your opponent's Basic Pokémon can't attack or use any Poké-Powers or Poké-Bodies."
          def eff1,eff2,eff3
          onActivate {
            eff1 = delayed{
              before CHECK_ATTACK_REQUIREMENTS, {
                if(self.active && ef.attacker.basic) {
                  wcu "Intimidating Armor prevents attack"
                  prevent()
                }
              }
            }
            eff2 = getter IS_ABILITY_BLOCKED, { Holder h->
              if (self.active && h.effect.target.basic && h.effect.target.owner == self.owner.opposite && (h.effect.ability instanceof PokePower || h.effect.ability instanceof PokeBody)) {
                h.object=true
              }
            }
            eff3 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if (self.active && (h.effect.target as Card).cardTypes.is(BASIC) && h.effect.target.owner == self.owner.opposite) {
                h.object=true
              }
            }
            new CheckAbilities().run(bg)
          }
          onDeactivate {
            eff1.unregister()
            eff2.unregister()
            eff3.unregister()
            new CheckAbilities().run(bg)
          }
        }
        move "Split Bomb", {
          text "Choose 2 of your opponent's Pokémon. This attack does 30 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            multiSelect(opp.all, 2).each {
              targeted(it) {
                damage 30, it
              }
            }
          }
        }
        move "Mega Burn", {
          text "100 damage. During your next turn, Aggron ex can't use Mega Burn."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 100
            cantUseAttack(thisMove, self)
          }
        }
      };
      case BLAZIKEN_EX_90:
      return evolution (this, from:"Combusken", hp:HP150, type:F, retreatCost:2) {
        weakness P
        move "Drag Off", {
          text "30 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          energyCost F, C
          attackRequirement {}
          onAttack {
            def target = defending
            if (opp.bench) {
              target = opp.bench.oppSelect("Select the new active")
              sw defending, target
            }
            damage 30, target
          }
        }
        move "Burn Away", {
          text "100 damage. Before doing damage, count the remaining HP of the Defending Pokémon. If that Pokémon is Knocked Out by this attack, Blaziken ex does damage to itself equal to this attack's damage minus the remaining HP of the Defending Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
          energyCost R, F, C, C
          attackRequirement {}
          onAttack {
            if (defending.getRemainingHP().value <= 100) {
              damage 100-defending.getRemainingHP().value, self
            }
            swiftDamage(100, defending)
          }
        }
      };
      case DELCATTY_EX_91:
      return evolution (this, from:"Skitty", hp:HP090, type:C, retreatCost:0) {
        weakness F
        pokePower "Constrain", {
          text "Once during your turn (before your attack), you may use this power. Each player discards cards until that player has 6 cards in his or her hand. (You discard first.) This power can't be used if Delcatty ex is affected by a Special Condition."
          actionA {
            checkNoSPC()
            checkLastTurn()
            powerUsed()

            def amountToDiscard = Math.max(my.hand.size() - 6, 0)
            my.hand.select(count: amountToDiscard, "Discard until 6 cards left in hand").discard()

            def oppAmountToDiscard = Math.max(opp.hand.size() - 6, 0)
            opp.hand.select(count: oppAmountToDiscard, "Discard until 6 cards left in hand").discard()
          }
        }
        move "Upstream", {
          text "10x damage. Search your discard pile for all Energy cards. This attack does 10 damage times the number of Energy cards you find there. Show them to your opponent, and put them on top of your deck. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {
            def energies = my.discard.filterByType(BASIC_ENERGY)
            damage 10*energies.size()
            afterDamage {
              energies.moveTo(my.deck)
              shuffleDeck()
            }
          }
        }
        move "Tail Slap", {
          text "60 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case EXPLOUD_EX_92:
      return evolution (this, from:"Loudred", hp:HP150, type:C, retreatCost:3) {
        weakness F
        pokeBody "Extra Noise", {
          text "As long as Exploud ex is your Active Pokémon, put 1 damage counter on each of your opponent's Pokémon-ex between turns."
          delayedA {
            before BEGIN_TURN, {
              if (self.active) {
                def once = true
                opp.all.each {
                  if (it.EX) {
                    if (once) {
                      bc "Extra Noise"
                      once = false
                    }
                    directDamage(10, it, TRAINER_CARD)
                  }
                }
              }
            }
          }
        }
        move "Derail", {
          text "40 damage. Discard a Special Energy card, if any, attached to the Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
            discardDefendingSpecialEnergy(delegate)
          }
        }
        move "Hyper Tail", {
          text "60+ damage. If the Defending Pokémon has any Poké-Powers or Poké-Bodies, this attack does 60 damage plus 20 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
            def hasPokeBody = false
            def hasPokePower = false
            for (Ability ability : defending.getAbilities().keySet()) {
              if (ability instanceof PokeBody) hasPokeBody = true;
              if (ability instanceof PokePower) hasPokePower = true;
            }
            if (hasPokeBody || hasPokePower) damage 20
          }
        }
      };
      case GROUDON_EX_93:
      return basic (this, hp:HP100, type:F, retreatCost:2) {
        weakness G
        pokeBody "Hard Rock", {
          text "As long as Groudon ex has 1 Energy or less attached to it, damage done to any of your Groudon ex in play by attacks is reduced by 20 (after applying Weakness and Resistance). You can't use more than 1 Hard Rock Poké-Body each turn."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if (it.to.name == "Groudon ex" && it.dmg.value && it.notNoEffect && bg.em().retrieveObject("Hard Rock") != bg.turnCount) {
                  if (self.cards.energyCount(C) < 2) {
                    bg.em().storeObject("Hard Rock", bg.turnCount)
                    bc "Hard Rock -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
        }
        move "Power Blast", {
          text "100 damage. Discard 2 Energy attached to Groudon ex."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 100
            discardSelfEnergy C,C
          }
        }
      };
      case JIRACHI_EX_94:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        pokeBody "Star Light", {
          text "As long as your opponent has any Pokémon-ex or Stage 2 Evolved Pokémon in play, Jirachi ex pays [C] less Energy to use Shield Beam or Super Psy Bolt."
          getterA (GET_MOVE_LIST, BEFORE_LAST, self) {h->
						if (opp.all.findAll { it.EX || it.topPokemonCard.cardTypes.is(STAGE2) }) {
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
        move "Shield Beam", {
          text "30 damage. During your opponent's next turn, your opponent can't use any Poké-Powers on his or her Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
            afterDamage {
              delayed {
                getter (IS_ABILITY_BLOCKED) { Holder h ->
                  if (h.effect.target == self) {
                    if (h.effect.ability instanceof PokePower) {
                      h.object=true
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }
        }
        move "Super Psy Bolt", {
          text "50 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case KYOGRE_EX_95:
      return basic (this, hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokeBody "Flotation", {
          text "As long as Kyogre ex has 1 Energy or less attached to it, the Retreat Cost for each of your Kyogre ex is 0."
          getterA (GET_RETREAT_COST, BEFORE_LAST) {holder->
            if (self.cards.energyCount(C) <= 1) {
              if (holder.effect.target.name == "Kyogre ex") {
                holder.object = 0
              }
            }
          }
        }
        move "Hydro Shot", {
          text "Discard 2 Energy attached to Kyogre ex. Choose 1 of your opponent's Pokémon. This attack does 70 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            if (confirm("Hydro Shot - Discard 2 Energies?")) {
              discardSelfEnergy C,C
              damage 70, opp.all.select()
            }
          }
        }
      };
      case SCEPTILE_EX_DELTA_96:
      return evolution (this, from:"Grovyle", hp:HP140, type:P, retreatCost:1) {
        weakness G
        resistance W, MINUS30
        pokeBody "Extra Liquid", {
          text "Each player's Pokémon-ex can't use any Poké-Powers and pays [C] more Energy to use its attacks. Each Pokémon can't be affected by more than 1 Extra Liquid Poké-Body."
          getterA (IS_ABILITY_BLOCKED) { Holder h ->
            if (self.active && !h.effect.target.topPokemonCard.cardTypes.is(EX)) {
              if (h.effect.ability instanceof PokePower) {
                h.object=true
              }
            }
          }
          getterA GET_MOVE_LIST, { h ->
            if (h.effect.target.topPokemonCard.cardTypes.is(EX) && bg.em().retrieveObject("Extra_Liquid") != (h.effect.target.id+bg.turnCount)) {
              def list = []
              for (move in h.object) {
                def copy = move.shallowCopy()
                copy.energyCost.add(C)
                list.add(copy)
              }
              h.object=list
              bg.em().storeObject("Extra_Liquid", h.effect.target.id+bg.turnCount)
            }
          }
        }
        move "Power Revenge", {
          text "60+ damage. Does 60 damage plus 10 more damage for each Prize card your opponent has taken."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60+10*opp.prizeCardSet.takenCount
          }
        }
      };
      case SHIFTRY_EX_97:
      return evolution (this, from:"Nuzleaf", hp:HP140, type:D, retreatCost:0) {
        weakness G
        resistance P, MINUS30
        pokeBody "Dark Eyes", {
          text "After your opponent's Pokémon uses a Poké-Power, put 2 damage counters on that Pokémon."
          delayedA {
            after USE_POKEPOWER, {
              if (ef.pcs.owner == self.owner.opposite)
                directDamage 20, ef.pcs
            }
          }
        }
        move "Target Attack", {
          text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. If that Pokémon already has any damage counters on it, this attack does 50 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, C
          attackRequirement {}
          onAttack {
            def target = opp.all.select("Deal damage to?")
            if (target.numberOfDamageCounters) {
              damage 50, target
            } else {
              damage 30, target
            }
          }
        }
        move "Blade Arms", {
          text "70 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SWAMPERT_EX_98:
      return evolution (this, from:"Marshtomp", hp:HP150, type:W, retreatCost:3) {
        weakness G
        pokePower "Energy Recycle", {
          text "Once during your turn (before your attack), you may search your discard pile for 3 Energy cards and attach them to your Pokémon in any way you like. If you do, your turn ends. This power can't be used if Swampert ex is affected by a Special Condition."
          actionA {
            checkLastTurn()
            checkNoSPC()
            assert my.discard.filterByType(ENERGY) : "No Energies in discard"
            powerUsed()
            def energies = my.discard.filterByType(ENERGY).size()
            (1..energies).each {
              attachEnergy(my.all.select("Target"), my.discard.filterByType(ENERGY).select("Energy").first())
            }
          }
        }
        move "Ultra Pump", {
          text "60+ damage. You may discard 2 cards from your hand. If you do, this attack does 60 damage plus 20 more damage and does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 60
            if (confirm("Ultra Pump - Discard 2 cards from hand?")) {
              damage 20
              if (opp.bench) {
                damage 20, opp.bench.select()
              }
            }
          }
        }
      };
      case ALAKAZAM_STAR_99:
      return basic (this, hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Psychic Select", {
          text "Put any 1 card from your discard pile into your hand."
          energyCost P
          attackRequirement { assert my.discard : "Discard is empty"}
          onAttack {
            my.discard.select("Choose the card to put in your hand").moveTo(my.hand)
          }
        }
        move "Skill Copy", {
          text "Discard a Basic Pokémon or Evolution card from your hand. Choose 1 of that card's attacks. Skill Copy copies that attack. This attack does nothing if Alakazam Star doesn't have the Energy necessary to use that attack. (You must still do anything else required for that attack.) Alakazam Star performs that attack."
          energyCost C, C, C
          attackRequirement {
            assert my.hand.filterByType(BASIC,STAGE1,STAGE2) : "No valid Pokemon in hand"
          }
          onAttack {
            def tmp = my.hand.filterByType(BASIC,STAGE1,STAGE2).select(min:0, max:1, "Discard a Pokémon and use one of that Pokémon’s attacks as this attack.")
            if (tmp) {
              def card = tmp.first()
              bc "$card was chosen"
              discard card
              def moves = card.asPokemonCard().moves
              if (moves) {
                def move = choose(moves, "Choose attack")
                bc "$move was chosen"
                def bef=blockingEffect(BETWEEN_TURNS)
                attack (move as Move)
                bef.unregisterItself(bg().em())
              }
            }
          }
        }
      };
      case CELEBI_STAR_100:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        pokePower "Time Travel", {
          text "If Celebi Star would be Knocked Out by damage from an opponent's attack, you may flip a coin. If heads, Celebi Star is not Knocked Out, discard all cards attached to Celebi Star, and put Celebi Star on the bottom of your deck."
          delayedA {
            before KNOCKOUT, self, {
              if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                bc "$self - Time Travel activated"
                flip 1, {
                  bc "$self is not knocked out and moved to the deck"
                  prevent()
                  self.cards.getExcludedList(self.topPokemonCard).discard()
                  self.cards.moveTo(my.deck)
                  removePCS(self)
                }
              }
            }
          }
        }
        move "Leaf Shade", {
          text "Count the amount of Energy attached to Celebi Star. Put that many damage counters on 1 of your opponent's Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            def count = self.cards.energyCount(C)
            directDamage count*10, opp.all.select()
          }
        }
      };
      default:
      return null;
    }
  }

}
