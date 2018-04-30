package tcgwars.logic.impl.gen7;

import tcgwars.logic.impl.gen2.Aquapolis

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
 * @author itrezad@gmail.com
 * @author axpendix@hotmail.com
 */
public enum CrimsonInvasion implements CardInfo {

  WEEDLE_1 ("Weedle", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  KAKUNA_2 ("Kakuna", 2, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BEEDRILL_3 ("Beedrill", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  EXEGGCUTE_4 ("Exeggcute", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CACNEA_5 ("Cacnea", 5, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CACTURNE_6 ("Cacturne", 6, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KARRABLAST_7 ("Karrablast", 7, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHELMET_8 ("Shelmet", 8, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ACCELGOR_9 ("Accelgor", 9, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SKIDDO_10 ("Skiddo", 10, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOGOAT_11 ("Gogoat", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ALOLAN_MAROWAK_12 ("Alolan Marowak", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  NUMEL_13 ("Numel", 13, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CAMERUPT_14 ("Camerupt", 14, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  STARYU_15 ("Staryu", 15, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARMIE_16 ("Starmie", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGIKARP_17 ("Magikarp", 17, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GYARADOS_GX_18 ("Gyarados-GX", 18, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  SWINUB_19 ("Swinub", 19, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PILOSWINE_20 ("Piloswine", 20, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAMOSWINE_21 ("Mamoswine", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  REMORAID_22 ("Remoraid", 22, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  OCTILLERY_23 ("Octillery", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  CORPHISH_24 ("Corphish", 24, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CRAWDAUNT_25 ("Crawdaunt", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  FEEBAS_26 ("Feebas", 26, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MILOTIC_27 ("Milotic", 27, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  REGICE_28 ("Regice", 28, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  SHELLOS_29 ("Shellos", 29, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PIKACHU_30 ("Pikachu", 30, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ALOLAN_RAICHU_31 ("Alolan Raichu", 31, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ALOLAN_GEODUDE_32 ("Alolan Geodude", 32, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ALOLAN_GRAVELER_33 ("Alolan Graveler", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ALOLAN_GOLEM_GX_34 ("Alolan Golem-GX", 34, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  EMOLGA_35 ("Emolga", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GASTLY_36 ("Gastly", 36, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAUNTER_37 ("Haunter", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GENGAR_38 ("Gengar", 38, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  MISDREAVUS_39 ("Misdreavus", 39, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MISMAGIUS_40 ("Mismagius", 40, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SPOINK_41 ("Spoink", 41, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GRUMPIG_42 ("Grumpig", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CHIMECHO_43 ("Chimecho", 43, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PUMPKABOO_44 ("Pumpkaboo", 44, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GOURGEIST_45 ("Gourgeist", 45, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SALANDIT_46 ("Salandit", 46, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SALAZZLE_47 ("Salazzle", 47, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  ORANGURU_48 ("Oranguru", 48, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIHILEGO_GX_49 ("Nihilego-GX", 49, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  MANKEY_50 ("Mankey", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PRIMEAPE_51 ("Primeape", 51, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CUBONE_52 ("Cubone", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  REGIROCK_53 ("Regirock", 53, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  GASTRODON_54 ("Gastrodon", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  STUFFUL_55 ("Stufful", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BEWEAR_56 ("Bewear", 56, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  BUZZWOLE_GX_57 ("Buzzwole-GX", 57, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  HOUNDOUR_58 ("Houndour", 58, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  HOUNDOOM_59 ("Houndoom", 59, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DEINO_60 ("Deino", 60, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ZWEILOUS_61 ("Zweilous", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  HYDREIGON_62 ("Hydreigon", 62, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  GUZZLORD_GX_63 ("Guzzlord-GX", 63, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  MAWILE_64 ("Mawile", 64, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  ARON_65 ("Aron", 65, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  LAIRON_66 ("Lairon", 66, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  AGGRON_67 ("Aggron", 67, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  REGISTEEL_68 ("Registeel", 68, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  ESCAVALIER_69 ("Escavalier", 69, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  KARTANA_GX_70 ("Kartana-GX", 70, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  JIGGLYPUFF_71 ("Jigglypuff", 71, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  WIGGLYTUFF_72 ("Wigglytuff", 72, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  XERNEAS_73 ("Xerneas", 73, Rarity.HOLORARE, [BASIC, POKEMON, _FAIRY_]),
  ALOLAN_EXEGGUTOR_GX_74 ("Alolan Exeggutor-GX", 74, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  JANGMO_O_75 ("Jangmo-o", 75, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  HAKAMO_O_76 ("Hakamo-o", 76, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  KOMMO_O_77 ("Kommo-o", 77, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DRAGON_]),
  MILTANK_78 ("Miltank", 78, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  SWABLU_79 ("Swablu", 79, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ALTARIA_80 ("Altaria", 80, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  STARLY_81 ("Starly", 81, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STARAVIA_82 ("Staravia", 82, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  STARAPTOR_83 ("Staraptor", 83, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  REGIGIGAS_84 ("Regigigas", 84, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  MINCCINO_85 ("Minccino", 85, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CINCCINO_86 ("Cinccino", 86, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BUNNELBY_87 ("Bunnelby", 87, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DIGGERSBY_88 ("Diggersby", 88, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  TYPE__NULL_89 ("Type: Null", 89, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  SILVALLY_GX_90 ("Silvally-GX", 90, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
  COUNTER_CATCHER_91 ("Counter Catcher", 91, Rarity.UNCOMMON, [ITEM, TRAINER]),
  DASHING_POUCH_92 ("Dashing Pouch", 92, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  DEVOURED_FIELD_93 ("Devoured Field", 93, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  FIGHTING_MEMORY_94 ("Fighting Memory", 94, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  GLADION_95 ("Gladion", 95, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LUSAMINE_96 ("Lusamine", 96, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  PEEKING_RED_CARD_97 ("Peeking Red Card", 97, Rarity.UNCOMMON, [ITEM, TRAINER]),
  PSYCHIC_MEMORY_98 ("Psychic Memory", 98, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  SEA_OF_NOTHINGNESS_99 ("Sea of Nothingness", 99, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  COUNTER_ENERGY_100 ("Counter Energy", 100, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  GYARADOS_GX_101 ("Gyarados-GX", 101, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  ALOLAN_GOLEM_GX_102 ("Alolan Golem-GX", 102, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  NIHILEGO_GX_103 ("Nihilego-GX", 103, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  BUZZWOLE_GX_104 ("Buzzwole-GX", 104, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  GUZZLORD_GX_105 ("Guzzlord-GX", 105, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  KARTANA_GX_106 ("Kartana-GX", 106, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  ALOLAN_EXEGGUTOR_GX_107 ("Alolan Exeggutor-GX", 107, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  SILVALLY_GX_108 ("Silvally-GX", 108, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
  GLADION_109 ("Gladion", 109, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LUSAMINE_110 ("Lusamine", 110, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  OLIVIA_111 ("Olivia", 111, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  GYARADOS_GX_112 ("Gyarados-GX", 112, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  ALOLAN_GOLEM_GX_113 ("Alolan Golem-GX", 113, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  NIHILEGO_GX_114 ("Nihilego-GX", 114, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  BUZZWOLE_GX_115 ("Buzzwole-GX", 115, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  GUZZLORD_GX_116 ("Guzzlord-GX", 116, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  KARTANA_GX_117 ("Kartana-GX", 117, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  ALOLAN_EXEGGUTOR_GX_118 ("Alolan Exeggutor-GX", 118, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  SILVALLY_GX_119 ("Silvally-GX", 119, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
  COUNTER_CATCHER_120 ("Counter Catcher", 120, Rarity.SECRET, [ITEM, TRAINER]),
  WISHFUL_BATON_121 ("Wishful Baton", 121, Rarity.SECRET, [POKEMON_TOOL,ITEM, TRAINER]),
  COUNTER_ENERGY_122 ("Counter Energy", 122, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]),
  WARP_ENERGY_123 ("Warp Energy", 123, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]),
  WATER_ENERGY_124 ("Water Energy", 124, Rarity.SECRET, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  CrimsonInvasion(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.CRIMSON_INVASION;
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
      case WEEDLE_1:
      return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Poison Sting", {
          text "Your opponent's Active Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            apply POISONED
          }
        }

      };
      case KAKUNA_2:
      return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
        weakness FIRE
        move "Multiply", {
          text "Search your deck for up to 3 Kakuna and put them onto your Bench. Then, shuffle your deck."
          energyCost G
          attackRequirement {
              assert bench.notFull
              assert deck.notEmpty
          }
          onAttack {
            int count = Math.min(3, my.bench.freeBenchCount)
            deck.search (max: count,  {it.name=="Kakuna"}).each {
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }

      };
      case BEEDRILL_3:
      return evolution (this, from:"Kakuna", hp:HP120, type:GRASS, retreatCost:0) {
        weakness FIRE
        move "Sudden Sting", {
          text "10 damage. If this Pokémon evolved from Kakuna during this turn, your opponent's Active Pokémon is now Paralyzed and Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            if(self.lastEvolved == bg.turnCount){
              applyAfterDamage POISONED
              applyAfterDamage PARALYZED
            }
          }
        }
        move "Sharp Sting", {
          text "60 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 60
          }
        }

      };
      case EXEGGCUTE_4:
      return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Hypnosis", {
          text "Your opponent's Active Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
        move "Ram", {
          text "10 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case CACNEA_5:
      return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Sucker Punch", {
          text "10+ damage. If this Pokémon has any [D] Energy attached to it, this attack does 30 more damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            if(self.cards.energyCount(D))
              damage 30
          }
        }

      };
      case CACTURNE_6:
      return evolution (this, from:"Cacnea", hp:HP110, type:GRASS, retreatCost:2) {
        weakness FIRE
        move "Spike Rend", {
          text "30+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 60 more damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
            if(defending.numberOfDamageCounters)
              damage 60
          }
        }
        move "Hunt", {
          text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 40 damage to the new Active Pokémon."
          energyCost G, C
          attackRequirement {
             assert opp.bench.notEmpty : "Empty bench"
          }
          onAttack {
            def pcs = opp.bench.select("Switch")
                  sw opp.active, pcs
            damage 40
          }
        }

      };
      case KARRABLAST_7:
      return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
        weakness FIRE
        bwAbility "Shell On", {
          text "Once during your turn (before your attack), you may discard a Shelmet from your hand. If you do, search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          actionA {
            assert my.hand.find{it.name=='Shelmet'}
            checkLastTurn()
            powerUsed()
            my.hand.findAll{it.name=='Shelmet'}.select().discard()
            def sel=self.owner.pbg.deck.search(count:1, "Shell On : search a pokemon evolving from Karrablast",
                        {it.cardTypes.is(EVOLUTION) && it.predecessor==self.name})
            if(sel){
              evolve(self, sel.first(), OTHER)
            }
            shuffleDeck(null, self.owner.toTargetPlayer())
          }
        }
        move "Peck", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case SHELMET_8:
      return basic (this, hp:HP060, type:GRASS, retreatCost:3) {
        weakness FIRE
        move "Absorb", {
          text "10 damage. Heal 10 damage from this Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
            heal 10, self
          }
        }

      };
      case ACCELGOR_9:
      return evolution (this, from:"Shelmet", hp:HP090, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Recover", {
          text "Discard an Energy from this Pokémon and heal all damage from it."
          energyCost C
          attackRequirement {}
          onAttack {
            discardSelfEnergy(C)
            heal self.damage.value, self
          }
        }
        move "Speed Attack", {
          text "70 damage."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }

      };
      case SKIDDO_10:
      return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Seed Bomb", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case GOGOAT_11:
      return evolution (this, from:"Skiddo", hp:HP120, type:GRASS, retreatCost:2) {
        weakness FIRE
        bwAbility "Sap Sipper", {
          text "This Pokémon's attacks do 80 more damage to your opponent's [G] Pokémon (before applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(it.from == self && it.to.owner == self.owner.opposite && it.to.types.contains(G) && it.dmg.value){
                    bc "Sap Sipper +80"
                    it.dmg += hp(80)
                }
              }
            }
          }
        }
        move "Horn Leech", {
          text "80 damage. Heal 20 damage from this Pokémon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 80
            heal 20, self
          }
        }

      };
      case ALOLAN_MAROWAK_12:
      return evolution (this, from:"Cubone", hp:HP100, type:FIRE, retreatCost:2) {
        weakness WATER
        move "Dance of Flames", {
          text "For each Energy attached to your opponent's Pokémon, attach a [R] Energy card from your discard pile to your Pokémon in any way you like."
          attackRequirement {}
          onAttack {
            //TODO : more efecient way?
            opp.active.cards.filterByType(ENERGY).each{
                if(my.discard.findAll(energyFilter(FIRE)))
                  my.discard.findAll(energyFilter(FIRE)).select().moveTo(my.all.select())
            }
          }
        }
        move "Burning Bonemerang", {
          text "70× damage. Flip 2 coins. This attack does 70 damage for each heads. If either of them is heads, your opponent's Active Pokémon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            flip 2,{
              damage 70
              applyAfterDamage BURNED
            }
          }
        }

      };
      case NUMEL_13:
      return basic (this, hp:HP080, type:FIRE, retreatCost:3) {
        weakness WATER
        move "Continuous Headbutt", {
          text "30× damage. Flip a coin until you get tails. This attack does 30 damage for each heads."
          energyCost R, C
          attackRequirement {}
          onAttack {
            flipUntilTails{damage 30}
          }
        }

      };
      case CAMERUPT_14:
      return evolution (this, from:"Numel", hp:HP140, type:FIRE, retreatCost:4) {
        weakness WATER
        move "Continuous Headbutt", {
          text "80× damage. Flip a coin until you get tails. This attack does 80 damage for each heads."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            flipUntilTails{damage 80}
          }
        }
        move "Searing Flame", {
          text "120 damage. Your opponent's Active Pokémon is now Burned."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 120
            applyAfterDamage BURNED
          }
        }

      };
      case STARYU_15:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Spinning Attack", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case STARMIE_16:
      return evolution (this, from:"Staryu", hp:HP090, type:WATER, retreatCost:1) {
        weakness GRASS
        bwAbility "Escape", {
          text "Once during your turn (before your attack), you may shuffle this Pokémon and all cards attached to it into your deck."
          actionA {
            assert bench.notEmpty
            checkLastTurn()
            powerUsed()
            shuffleDeck(self.cards)
            removePCS(self)
          }
        }
        move "Spinning Attack", {
          text "40 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }

      };
      case MAGIKARP_17:
      return basic (this, hp:HP030, type:WATER, retreatCost:1) {
        weakness LIGHTNING
        bwAbility "Submerge", {
          text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(!self.active && it.to == self){
                  bc "Submerge prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Waterfall Evolution", {
          text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost W, C, C
          attackRequirement {
            assert deck.notEmpty
          }
          onAttack {
            def sel=self.owner.pbg.deck.select(min:0, "Waterfall Evolution",
                        {it.cardTypes.is(EVOLUTION) && it.predecessor==self.name}, self.owner)
            if(sel){
              evolve(self, sel.first(), OTHER)
            }
            shuffleDeck(null, self.owner.toTargetPlayer())
          }
        }

      };
      case GYARADOS_GX_18:
      return evolution (this, from:"Magikarp", hp:HP240, type:WATER, retreatCost:4) {
        weakness LIGHTNING
        move "Waterfall", {
          text "70 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Draconic Disaster", {
          text "100+ damage. If there is any Stadium card in play, this attack does 100 more damage. Then, discard that Stadium card."
          energyCost W, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 100
            if(bg.stadiumInfoStruct) {
              damage 100
              discard bg.stadiumInfoStruct.stadiumCard
            }
          }
        }
        move "Dread Storm GX", {
          text "Discard an Energy from each of your opponent's Pokémon. (You can't use more than 1 GX attack in a game.)"
          energyCost W
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            opp.all.each{
              //TODO : check if the pokemon has energy attached?
              if(it.cards.filterByType(ENERGY))
                it.cards.filterByType(ENERGY).select("Discard").discard()
            }
          }
        }

      };
      case SWINUB_19:
      return basic (this, hp:HP060, type:WATER, retreatCost:3) {
        weakness METAL
        move "Gnaw", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case PILOSWINE_20:
      return evolution (this, from:"Swinub", hp:HP100, type:WATER, retreatCost:4) {
        weakness METAL
        move "Stampede", {
          text "20 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rest", {
          text "This Pokémon is now Asleep. Heal 90 damage from it."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            apply ASLEEP, self
            heal 90, self
          }
        }

      };
      case MAMOSWINE_21:
      return evolution (this, from:"Piloswine", hp:HP180, type:WATER, retreatCost:4) {
        weakness METAL
        move "Double Stomp", {
          text "60+ damage. Flip 2 coins. This attack does 30 more damage for each heads."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 60
            flip 2,{
              damage 30
            }
          }
        }
        move "Forceful Tackle", {
          text "90+ damage. You may put up to 9 damage counters on this Pokémon. This attack does 10 more damage for each damage counter you placed in this way."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 90
            if(confirm("Add damage counters to Mamoswine for 10 more damage with each damage counter put that way?"))
            {
              def num = choose([1,2,3,4,5,6,7,8,9])
              damage 10*num
              directDamage 10*num, self
            }
          }
        }
      };
      case REMORAID_22:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Water Gun", {
          text "30 damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case OCTILLERY_23:
      return evolution (this, from:"Remoraid", hp:HP100, type:WATER, retreatCost:2) {
        weakness GRASS
        move "Ink Spit", {
          text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            sandAttack(thisMove)
          }
        }
        move "Special Artillery", {
          text "40+ damage. You may discard a Special Energy from this Pokémon. If you do, this attack does 80 more damage."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 40
            def list = self.cards.filterByType(SPECIAL_ENERGY)
            if(list && confirm ("You may discard a Special Energy from this Pokémon. If you do, this attack does 60 more damage.")){
                list.select().discard()
                damage 60
            }
          }
        }

      };
      case CORPHISH_24:
      return basic (this, hp:HP070, type:WATER, retreatCost:2) {
        weakness GRASS
        move "Crabhammer", {
          text "30 damage."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case CRAWDAUNT_25:
      return evolution (this, from:"Corphish", hp:HP110, type:WATER, retreatCost:2) {
        weakness GRASS
        move "Double Claws", {
          text "80 damage. Discard 2 Energy from your opponent's Active Pokémon."
          energyCost W, W, W, C
          attackRequirement {}
          onAttack {
            damage 80
            discardDefendingEnergy()
            discardDefendingEnergy()
          }
        }

      };
      case FEEBAS_26:
      return basic (this, hp:HP030, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Splashing Dodge", {
          text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
            flip {preventAllEffectsNextTurn()}
          }
        }

      };
      case MILOTIC_27:
      return evolution (this, from:"Feebas", hp:HP120, type:WATER, retreatCost:2) {
        weakness GRASS
        move "TLC", {
          text "Shuffle 1 of your opponent's Benched Pokémon that has any damage counters on it and all cards attached to it into their deck."
          energyCost W
          attackRequirement {
            assert opp.bench.findAll {it.numberOfDamageCounters}
          }
          onAttack {
            def tar = opp.bench.findAll {it.numberOfDamageCounters}.select()
            tar.cards.moveTo(opp.deck)
            removePCS(tar)
          }
        }
        move "Ocean Cyclone", {
          text "80 damage. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 80
            opp.bench.each {damage 10, it}
          }
        }

      };
      case REGICE_28:
      return basic (this, hp:HP130, type:WATER, retreatCost:3) {
        weakness METAL
        bwAbility "Iceberg Shield", {
          text "If you have Regirock in play, prevent all effects of attacks, including damage, done to this Pokémon by your opponent's Stage 2 Pokémon."
          delayedA {
            before null, self, Source.ATTACK, {
              if(self.owner.pbg.all.findAll{it.name=="Regirock"}){
                if (self.owner.opposite.pbg.active.is(STAGE2) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "Safeguard prevents effect"
                  prevent()
                }
              }
            }
            before APPLY_ATTACK_DAMAGES, {
              if(self.owner.pbg.all.findAll{it.name=="Regirock"}){
                bc "Regirock is in play"
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.topPokemonCard.cardTypes.is(STAGE2)){
                    it.dmg = hp(0)
                    bc "Safeguard prevents damage"
                  }
                }
              }
            }
            after ENERGY_SWITCH, {
              def efs = (ef as EnergySwitch)
              if(self.owner.pbg.all.findAll{it.name=="Regirock"}){
                if(it.from.topPokemonCard.cardTypes.is(STAGE2) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }

        }
        move "Frost Smash", {
          text "70 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }

      };
      case SHELLOS_29:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Regeneration", {
          text "Heal 30 damage from this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            heal 30, self
          }
        }
        move "Mud-Slap", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case PIKACHU_30:
      return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Pika Draw", {
          text "Draw a card."
          energyCost C
          attackRequirement
          {
            assert deck.notEmpty
          }
          onAttack {
            draw 1
          }
        }
        move "Quick Attack", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
            flip {damage 20}
          }
        }

      };
      case ALOLAN_RAICHU_31:
      return evolution (this, from:"Pikachu", hp:HP110, type:LIGHTNING, retreatCost:2) {
        weakness FIGHTING
        resistance METAL, MINUS20
        bwAbility "Surge Surfer", {
          text "If there is any Stadium card in play, this Pokémon has no Retreat Cost."
          getterA GET_RETREAT_COST, self, {h->
            if(bg.stadiumInfoStruct) {
              h.object = 0
            }
          }
        }
        move "Psychic", {
          text "70+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70 + 20*defending.cards.energyCount(C)
          }
        }

      };
      case ALOLAN_GEODUDE_32:
      return basic (this, hp:HP060, type:LIGHTNING, retreatCost:2) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Defense Curl", {
          text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
          attackRequirement {}
          onAttack {
            flip{preventAllEffectsNextTurn()}
          }
        }
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case ALOLAN_GRAVELER_33:
      return evolution (this, from:"Alolan Geodude", hp:HP100, type:LIGHTNING, retreatCost:3) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Corkscrew Punch", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Self-Destruct", {
          text "100 damage. This Pokémon does 100 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 100
            damage 100, self
          }
        }

      };
      case ALOLAN_GOLEM_GX_34:
      return evolution (this, from:"Alolan Graveler", hp:HP250, type:LIGHTNING, retreatCost:4) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Hammer In", {
          text "80 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Super Electromagnetic Tackle", {
          text "200 damage. This Pokémon does 50 damage to itself."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {
            damage 200
            damage 50, self
          }
        }
        move "Heavy Rock GX", {
          text "100 damage. Your opponent can't play any cards from their hand during their next turn. (You can't use more than 1 GX attack in a game.)"
          energyCost L, L, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 100
             delayed {
              before PLAY_TRAINER, {
                if(bg.currentTurn == self.owner.opposite)
                {
                  wcu "Heavy Rock GX prevent you playing this card"
                  prevent()
                }
              }
              before ATTACH_ENERGY, {
                if(ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner.opposite){
                  wcu "Heavy Rock GX prevent you playing this card"
                  prevent()
                }
              }
              before EVOLVE_STANDARD, {
                if(bg.currentTurn == self.owner.opposite){
                  wcu "Heavy Rock GX prevent you playing this card"
                  prevent()
                }
              }
              before PLAY_BASIC_POKEMON, {
                if(bg.currentTurn == self.owner.opposite){
                  wcu "Heavy Rock GX prevent you playing this card"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }

      };
      case EMOLGA_35:
      return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Energy Catch", {
          text "Put 3 basic Energy cards from your discard pile into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.find(cardTypeFilter(BASIC_ENERGY))
          }
          onAttack {
            my.discard.findAll(cardTypeFilter(BASIC_ENERGY)).select(count:3).moveTo(my.hand)
          }
        }
        move "Volt Switch", {
          text "30 damage. Switch this Pokémon with 1 of your Benched [L] Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
            if(my.bench.findAll{it.types.contains(L)}) {
              def tar = my.bench.findAll{it.types.contains(L)}
              sw self, tar.select()
            }
          }
        }

      };
      case GASTLY_36:
      return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Ominous Eyes", {
          text "Put 1 damage counter on 1 of your opponent's Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            directDamage 10,  opp.all.select()
          }
        }

      };
      case HAUNTER_37:
      return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Pain Amplifier", {
          text "Put 2 damage counters on each of your opponent's Pokémon that has any damage counters on it."
          energyCost P
          attackRequirement {
            assert opp.all.findAll{it.numberOfDamageCounters}
          }
          onAttack {
            opp.all.findAll{it.numberOfDamageCounters}.each {
              directDamage 20, it
            }
          }
        }

      };
      case GENGAR_38:
      return evolution (this, from:"Haunter", hp:HP130, type:PSYCHIC, retreatCost:0) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        bwAbility "Gnawing Curse", {
          text "Whenever your opponent attaches an Energy card from their hand to 1 of their Pokémon, put 2 damage counters on that Pokémon."
          delayedA {
            after ATTACH_ENERGY, {
              if(ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite)
                directDamage 20, ef.resolvedTarget
            }
          }
        }
        move "Fade to Black", {
          text "70 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 70
            applyAfterDamage CONFUSED
          }
        }

      };
      case MISDREAVUS_39:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Confuse Ray", {
          text "Your opponent's Active Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            apply CONFUSED
          }
        }

      };
      case MISMAGIUS_40:
      return evolution (this, from:"Misdreavus", hp:HP110, type:PSYCHIC, retreatCost:1) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Chaos Wheel", {
          text "30 damage. Your opponent can't play any Pokémon Tool, Special Energy, or Stadium cards from their hand during their next turn."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
            delayed{
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && ef.card instanceof SpecialEnergyCard){
                  wcu "Chaos Wheel prevents playing this card"
                  prevent()
                }
              }
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.is(STADIUM) || ef.cardToPlay.cardTypes.is(POKEMON_TOOL)){
                  wcu "Chaos Wheel prevents playing this card"
                  prevent()
                }
              }
            }
          }
        }
        move "Dark Arts", {
          text "20× damage. This attack does 20 damage for each card in your opponent's hand."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20 * opp.hand.size()
          }
        }

      };
      case SPOINK_41:
      return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Splash", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case GRUMPIG_42:
      return evolution (this, from:"Spoink", hp:HP120, type:PSYCHIC, retreatCost:2) {
        weakness PSYCHIC
        bwAbility "Own Tempo", {
          text "This Pokémon can't be Confused."
          delayedA {
            after APPLY_SPECIAL_CONDITION, {
              if(self.active){
                if(self.isSPC(CONFUSED)){
                  bc "Own Tempo prevents from being Confused."
                  clearSpecialCondition(self, SRC_ABILITY, [CONFUSED])
                }
              }
            }
          }
        }
        move "Psych Up", {
          text "60 damage. During your next turn, this Pokémon's Psych Up attack does 60 more damage (before applying Weakness and Resistance)."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 60
            increasedBaseDamageNextTurn("Psych Up", hp(60))
          }
        }

      };
      case CHIMECHO_43:
      return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Bell of Silence", {
          text "10 damage. Your opponent can't play any Pokémon that has an Ability from their hand during their next turn."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            delayed {
              before PLAY_BASIC_POKEMON, {
                def tar = ef.cardToPlay.topPokemonCard
                if(tar.hasModernAbility()) {
                    wcu "Bell of Silence: Can't play Pokémon that has an Ability"
                    prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }

      };
      case PUMPKABOO_44:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Astonish", {
          text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
          energyCost P
          attackRequirement {
            assert opp.hand
          }
          onAttack {
            astonish()
          }
        }

      };
      case GOURGEIST_45:
      return evolution (this, from:"Pumpkaboo", hp:HP120, type:PSYCHIC, retreatCost:3) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Confuse Ray", {
          text "Your opponent's Active Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            apply CONFUSED
          }
        }
        move "Pumpkin Bomb", {
          text "10+ damage. Before doing damage, you may discard any number of Pokémon Tool cards from your Pokémon. This attack does 40 more damage for each card you discarded in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
            def tar = my.all.findAll{it.cards.filterByType(POKEMON_TOOL)}
            if(tar){

              tar.each {
                def poktool = new CardList(it.topPokemonCard);
                poktool.add(it.cards.filterByType(POKEMON_TOOL).first())
                poktool.showToMe("Pokemon with tool")

                if(confirm("discard this tool for 40 more damages?")){
                  it.cards.filterByType(POKEMON_TOOL).discard()
                  damage 40
                }
              }
            }
          }
        }

      };
      case SALANDIT_46:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Singe", {
          text "Your opponent's Active Pokémon is now Burned."
          energyCost P
          attackRequirement {}
          onAttack {
            apply BURNED
          }
        }

      };
      case SALAZZLE_47:
      return evolution (this, from:"Salandit", hp:HP110, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Nasty Plot", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost P
          attackRequirement {
            assert deck.notEmpty
          }
          onAttack {
            deck.select(max: 2).moveTo(hidden: true, hand)
            shuffleDeck()
          }
        }
        move "Severe Poison", {
          text "Your opponent's Active Pokémon is now Poisoned. Put 4 damage counters instead of 1 on that Pokémon between turns."
          energyCost P
          attackRequirement {}
          onAttack {
            apply POISONED
            extraPoison 3
          }
        }

      };
      case ORANGURU_48:
      return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
        weakness PSYCHIC
        move "Fixer of the Forest", {
          text "Put 3 Pokémon Tool cards from your discard pile into your hand."
          energyCost P
          attackRequirement {
            assert my.discard.find(cardTypeFilter(POKEMON_TOOL))
          }
          onAttack {
            my.discard.findAll(cardTypeFilter(POKEMON_TOOL)).select(count:3,"Search for 3 pokemon tool").moveTo(hand)
          }
        }
        move "Zen Headbutt", {
          text "70 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }

      };
      case NIHILEGO_GX_49:
      return basic (this, hp:HP180, type:PSYCHIC, retreatCost:2) {
        weakness PSYCHIC
        bwAbility "Empty Light", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may leave both Active Pokémon Confused and Poisoned."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && self.benched && confirm("Use Empty Light?")){
              powerUsed()
              apply CONFUSED
              apply POISONED
              apply CONFUSED, my.active
              apply POISONED, my.active
            }
          }
        }
        move "Lock Up", {
          text "120 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost P, P, P
          attackRequirement {}
          onAttack {
            damage 120
            cantRetreat defending
          }
        }
        move "Symbiont GX", {
          text "Add the top 2 cards of your opponent's deck to their Prize cards. (You can't use more than 1 GX attack in a game.)"
          energyCost P, P, P
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            def newPrizelist = new CardList(opp.prizeAsList);
            def cnt = opp.prizeAsList.size()
            newPrizelist.add(opp.deck.remove(0))
            newPrizelist.add(opp.deck.remove(0))
            opp.prize= newPrizelist.toArray()
          }
        }

      };
      case MANKEY_50:
      return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
        weakness PSYCHIC
        move "Three-Step Strike", {
          text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
          energyCost F
          attackRequirement {}
          onAttack {
            flip 3,{damage 10}
          }
        }

      };
      case PRIMEAPE_51:
      return evolution (this, from:"Mankey", hp:HP090, type:FIGHTING, retreatCost:1) {
        weakness PSYCHIC
        move "Low Kick", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Lucha Fight", {
          text "90 damage. During your opponent's next turn, the Defending Pokémon's attacks do 30 more damage (before applying Weakness and Resistance)."
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 90
            delayed{
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner == self.owner.opposite) {
                  bg.dm().each{
                    if(it.to == self && it.notNoEffect && it.dmg.value) {
                       bc "Lucha Fight +30"
                       it.dmg += hp(30)
                    }
                  }
                }
              }
              unregisterAfter 2
              after EVOLVE,defending, {unregister()}
              after SWITCH,defending, {unregister()}
            }
          }
        }

      };
      case CUBONE_52:
      return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
        weakness GRASS
        move "Leer", {
          text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            flip {apply PARALYZED}
          }
        }
        move "Headbutt", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case REGIROCK_53:
      return basic (this, hp:HP130, type:FIGHTING, retreatCost:3) {
        weakness GRASS
        bwAbility "Rock Peak Growl", {
          text "Your Registeel's attacks do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              if(ef.attacker.owner == self.owner && (ef.attacker.name=="Registeel")){
                bg.dm().each {
                  if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    bc "Rock Peak Growl +10"
                    it.dmg += hp(10)
                  }
                }
              }
            }
          }
        }
        move "Tough Swing", {
          text "110 damage. This attack's damage isn't affected by Resistance."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 110
            dontApplyResistance()
          }
        }

      };
      case GASTRODON_54:
      return evolution (this, from:"Shellos", hp:HP120, type:FIGHTING, retreatCost:3) {
        weakness GRASS
        move "Eerie Fluid", {
          text "30 damage. Your opponent's Active Pokémon is now Confused."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
            applyAfterDamage CONFUSED
          }
        }
        move "Earthquake", {
          text "120 damage. This attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 120
            my.bench.each{
              damage 10, it
            }
          }
        }

      };
      case STUFFUL_55:
      return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
        weakness PSYCHIC
        move "Flop", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case BEWEAR_56:
      return evolution (this, from:"Stufful", hp:HP130, type:FIGHTING, retreatCost:3) {
        weakness PSYCHIC
        bwAbility "Fluffy", {
          text "This Pokémon takes 30 less damage from the attacks of your opponent's non-[R] Pokémon (after applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              if(ef.attacker.owner == self.owner.opposite && !(ef.attacker.types.contains(R))) {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                     bc "Fluffy -30"
                    it.dmg -= hp(30)
                  }
                 }
              }
            }
          }
        }
        move "Cross-Cut", {
          text "60+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 60 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
            if(defending.evolution) damage 60
          }
        }

      };
      case BUZZWOLE_GX_57:
      return basic (this, hp:HP190, type:FIGHTING, retreatCost:2) {
        weakness PSYCHIC
        move "Jet Punch", {
          text "30 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
            if(opp.bench) damage 30, opp.bench.select()
          }
        }
        move "Knuckle Impact", {
          text "160 damage. This Pokémon can't attack during your next turn."
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 160
            cantAttackNextTurn self
          }
        }
        move "Absorption GX", {
          text "40× damage. This attack does 40 damage for each of your remaining Prize cards. (You can't use more than 1 GX attack in a game.)"
          energyCost F, F, F
          attackRequirement {gxCheck()}
          onAttack {
            gxPerform()
            damage 40 * my.prizeAsList.size()
          }
        }

      };
      case HOUNDOUR_58:
      return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Rear Kick", {
          text "10 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Darkness Fang", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case HOUNDOOM_59:
      return evolution (this, from:"Houndour", hp:HP110, type:DARKNESS, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Fire Fang", {
          text "30 damage. Your opponent's Active Pokémon is now Burned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
            applyAfterDamage BURNED
          }
        }
        move "Puncturing Fangs", {
          text "90 damage. This attack's damage isn't affected by Resistance."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
            dontApplyResistance()
          }
        }

      };
      case DEINO_60:
      return basic (this, hp:HP070, type:DARKNESS, retreatCost:2) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Headbutt", {
          text "20 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Surprise Attack", {
          text "60 damage. Flip a coin. If tails, this attack does nothing."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            flip {damage 60}
          }
        }

      };
      case ZWEILOUS_61:
      return evolution (this, from:"Deino", hp:HP090, type:DARKNESS, retreatCost:2) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Headbutt", {
          text "30 damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Double Hit", {
          text "60× damage. Flip 2 coins. This attack does 60 damage for each heads."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            flip 2, {damage 60}
          }
        }

      };
      case HYDREIGON_62:
      return evolution (this, from:"Zweilous", hp:HP160, type:DARKNESS, retreatCost:2) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        bwAbility "Weed Out", {
          text "Once during your turn (before your attack), you may choose 3 of your Benched Pokémon. Then, discard your other Benched Pokémon."
          actionA {
            assert (my.bench.size()>3)
            checkLastTurn()
            powerUsed()
            def num = 0
            while(my.bench.size()>3){
              num = my.bench.size()-3
              def tar = my.bench.select("select a pokemon to discard ($num remaining to discard)")
              shuffleDeck(tar.cards)
              removePCS(tar)
            }
          }
        }
        move "Dark Destruction", {
          text "120 damage. You may discard an Energy from this Pokémon. If you do, discard an Energy from your opponent's Active Pokémon."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 120
            def tar = self.cards.filterByType(ENERGY).select()
            if(tar){
              tar.discard()
              discardDefendingEnergy()
            }
          }
        }

      };
      case GUZZLORD_GX_63:
      return basic (this, hp:HP210, type:DARKNESS, retreatCost:4) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Eat Sloppily", {
          text "Discard the top 5 cards of your deck. If any of those cards are Energy cards, attach them to this Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {
            def list = my.deck.subList(0,5).findAll(cardTypeFilter(ENERGY))
            //TODO : show the 5 top card before discard
            def num = list.size()
            if(num){
              list.each{attachEnergy(self, it)}
            }
            my.deck.subList(0,5-num).discard()
          }
        }
        move "Tyrannical Hole", {
          text "180 damage."
          energyCost D, D, D, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
        move "Glutton GX", {
          text "100 damage. If your opponent's Pokémon is Knocked Out by damage from this attack, take 2 more Prize cards. (You can't use more than 1 GX attack in a game.)"
          energyCost D, D, D, D, D
          attackRequirement {
            gxCheck()
          }
          onAttack {
            damage 100
            gxPerform()
            delayed {
              def pcs = defending
              after KNOCKOUT, pcs, {
                bg.em().run(new TakePrize(self.owner, pcs))
                bg.em().run(new TakePrize(self.owner, pcs))
              }
              unregisterAfter 1
            }
          }
        }

      };
      case MAWILE_64:
      return basic (this, hp:HP080, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert deck.notEmpty
            assert my.bench.notFull
          }
          onAttack {
            int count = bench.freeBenchCount>=2?2:1
            deck.search (max: count, cardTypeFilter(BASIC)).each {
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }
        move "Crunch", {
          text "30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flip {discardDefendingEnergy()}
          }
        }

      };
      case ARON_65:
      return basic (this, hp:HP060, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Tackle", {
          text "10 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Metal Claw", {
          text "30 damage."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case LAIRON_66:
      return evolution (this, from:"Aron", hp:HP100, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Metal Claw", {
          text "20 damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hammer In", {
          text "80 damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }

      };
      case AGGRON_67:
      return evolution (this, from:"Lairon", hp:HP170, type:METAL, retreatCost:4) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Revenge Cannon", {
          text "10+ damage. This attack does 10 more damage for each damage counter on all of your Benched Pokémon."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 10
            my.bench.each{
              damage it.numberOfDamageCounters*10
            }
          }
        }
        move "Buster Swing", {
          text "120 damage. This attack's damage isn't affected by Resistance."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 120
            dontApplyResistance()
          }
        }

      };
      case REGISTEEL_68:
      return basic (this, hp:HP130, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Turbo Arm", {
          text "30 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 30
            attachEnergyFrom(my.discard, my.bench)
          }
        }
        move "Iron Fist", {
          text "90 damage. If Regice is on your Bench, heal 30 damage from this Pokémon."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 90
            if(my.bench.find({it.name=="Regice"}))
              heal 30, self
          }
        }

      };
      case ESCAVALIER_69:
      return evolution (this, from:"Karrablast", hp:HP120, type:METAL, retreatCost:2) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Fury Attack", {
          text "30× damage. Flip 3 coins. This attack does 30 damage for each heads."
          energyCost M
          attackRequirement {}
          onAttack {
            flip 3,{damage 30}
          }
        }
        move "Iron Tackle", {
          text "130 damage. This Pokémon does 30 damage to itself."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 130
            directDamage 30, self
          }
        }

      };
      case KARTANA_GX_70:
      return basic (this, hp:HP170, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        bwAbility "Slice Off", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard a Special Energy from your opponent's Pokémon."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && self.benched && confirm("Use Slice Off?")){
              powerUsed()
              def tar = opp.all.findAll({it.cards.filterByType(SPECIAL_ENERGY)})
              if(tar){
                tar.select().cards.filterByType(SPECIAL_ENERGY).select().discard()
              }
            }
          }
        }
        move "Gale Blade", {
          text "70 damage. You may shuffle this Pokémon and all cards attached to it into your deck."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 70
            assert bench.notEmpty
            if(confirm("shuffle this Pokémon and all cards attached to it into your deck?")){
              shuffleDeck(self.cards)
              removePCS(self)
            }
          }
        }
        move "Blade GX", {
          text "Take a Prize card. (You can't use more than 1 GX attack in a game.)"
          energyCost M
          attackRequirement {gxCheck()}
          onAttack {
            gxPerform()
            bg.em().run(new TakePrize(self.owner,self))
          }
        }

      };
      case JIGGLYPUFF_71:
      return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
        weakness METAL
        resistance DARKNESS, MINUS20
        move "Rollout", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Slap", {
          text "20× damage. Flip 2 coins. This attack does 20 damage for each heads."
          energyCost Y, C
          attackRequirement {}
          onAttack {
            flip 2,{damage 20}
          }
        }

      };
      case WIGGLYTUFF_72:
      return evolution (this, from:"Jigglypuff", hp:HP120, type:FAIRY, retreatCost:2) {
        weakness METAL
        resistance DARKNESS, MINUS20
        move "Hypnoblast", {
          text "30 damage. Your opponent's Active Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            applyAfterDamage ASLEEP
          }
        }
        move "Punishing Slap", {
          text "60+ damage. If any of your opponent's Pokémon have any [D] Energy attached to them, this attack does 60 more damage."
          energyCost Y, C, C
          attackRequirement {}
          onAttack {
            damage 60
            if(opp.all.findAll {it.cards.energyCount(D)})
              damage 60
          }
        }

      };
      case XERNEAS_73:
      return basic (this, hp:HP130, type:FAIRY, retreatCost:2) {
        weakness METAL
        resistance DARKNESS, MINUS20
        move "Lead", {
          text "Search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            deck.search(cardTypeFilter(SUPPORTER)).moveTo(hand)
            shuffleDeck()
          }
        }
        move "Bright Horns", {
          text "130 damage. This Pokémon can't use Bright Horns during your next turn."
          energyCost Y, Y, Y
          attackRequirement {}
          onAttack {
            damage 130
            cantUseAttack thisMove, self
          }
        }

      };
      case ALOLAN_EXEGGUTOR_GX_74:
      return evolution (this, from:"Exeggcute", hp:HP220, type:DRAGON, retreatCost:3) {
        weakness FAIRY
        move "Tropical Head", {
          text "This attack does 20 damage times the amount of Energy attached to this Pokémon to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G
          attackRequirement {}
          onAttack {
            def tar = opp.all.select()
            damage 20 * self.cards.energyCount(C), tar
          }
        }
        move "Dragon Hammer", {
          text "120 damage. Your opponent's Active Pokémon is now Confused."
          energyCost G, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            applyAfterDamage CONFUSED
          }
        }
        move "Tower-Go-Round GX", {
          text "180 damage. Move any number of Energy from your Pokémon to your other Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)"
          energyCost G, C, C, C
          attackRequirement {gxCheck()}
          onAttack {
            gxPerform()
            damage 180
            while(1){
              def pl=(my.all.findAll {it.cards.energyCount(C)})
              if(!pl) break;
              def src =pl.select("source for energy (cancel to stop)", false)
              if(!src) break;
              def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()

              def tar=my.all.select("Target for energy (cancel to stop)", false)
              if(!tar) break;
              energySwitch(src, tar, card)
            }
          }
        }

      };
      case JANGMO_O_75:
      return basic (this, hp:HP060, type:DRAGON, retreatCost:1) {
        weakness FAIRY
        move "Headbutt", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Gentle Slap", {
          text "20 damage."
          energyCost L, F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case HAKAMO_O_76:
      return evolution (this, from:"Jangmo-o", hp:HP090, type:DRAGON, retreatCost:1) {
        weakness FAIRY
        move "Noble Roar", {
          text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            whirlwind()
          }
        }
        move "Dragon Claw", {
          text "40 damage."
          energyCost L, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }

      };
      case KOMMO_O_77:
      return evolution (this, from:"Hakamo-o", hp:HP160, type:DRAGON, retreatCost:2) {
        weakness FAIRY
        move "War Cry", {
          text "30+ damage. If you have fewer Pokémon in play than your opponent, this attack does 90 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            if(my.bench.size() < opp.bench.size())
              damage 90
          }
        }
        move "Clanging Scales", {
          text "130 damage. During your opponent's next turn, this Pokémon takes 30 more damage from attacks (after applying Weakness and Resistance)."
          energyCost L, F, C
          attackRequirement {}
          onAttack {
            damage 130
            delayed{
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to==self && it.dmg.value){
                    bc "+30 to kommo-o (Clanging Scales)"
                    it.dmg+=hp(30)
                  }
                }
                unregisterAfter 2
                after SWITCH, self, {unregister()}
                after EVOLVE, self, {unregister()}
              }
            }
          }
        }
      };
      case MILTANK_78:
      return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        bwAbility "Moo Moo Ale", {
          text "As long as this Pokémon is your Active Pokémon, whenever you attach an Energy card from your hand to 1 of your Pokémon, heal 90 damage from that Pokémon."
          delayedA {
            after ATTACH_ENERGY,{
              if(self.active && ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner && ef.resolvedTarget.owner == self.owner)
                 heal 90, ef.resolvedTarget
            }
          }
        }
        move "Sitdown Splash", {
          text "60+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
            flip {damage 30}
          }
        }

      };
      case SWABLU_79:
      return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Peck", {
          text "10 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case ALTARIA_80:
      return evolution (this, from:"Swablu", hp:HP090, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Draco Melody", {
          text "Flip a coin. If heads, search your deck for a [N] Pokémon and put it onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            flip {
              deck.search ({it.asPokemonCard().types.contains(N)}).each {
                deck.remove(it)
                benchPCS(it)
              }

            }
          }
        }
        move "Cotton Guard", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(30), thisMove)
          }
        }

      };
      case STARLY_81:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Bug Search", {
          text "Your opponent reveals their hand."
          energyCost C
          attackRequirement {}
          onAttack {
            opp.hand.showToMe("Opponent's hand")
            opp.hand.shuffle()
          }
        }
        move "Flap", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }

      };
      case STARAVIA_82:
      return evolution (this, from:"Starly", hp:HP080, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Flap", {
          text "20 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Wing Attack", {
          text "60 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }

      };
      case STARAPTOR_83:
      return evolution (this, from:"Staravia", hp:HP140, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Clutch", {
          text "50 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 50
            cantRetreat defending
          }
        }
        move "Sky Hunting", {
          text "120 damage. If your opponent's Pokémon is Knocked Out by the damage from this attack, switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            afterDamage{
              delayed{
                before KNOCKOUT, {
                  if(my.bench && ef.pokemonToBeKnockedOut.owner==self.owner.opposite){
                      def tar = my.bench.select("Select the Pokémon to switch with Staraptor")
                      sw self, tar
                  }
                }
                unregisterAfter 3
                after SWITCH,self, {unregister()}
                after EVOLVE,self, {unregister()}
              }
            }
          }
        }

      };
      case REGIGIGAS_84:
      return basic (this, hp:HP180, type:COLORLESS, retreatCost:4) {
        weakness FIGHTING
        bwAbility "Seal of Antiquity", {
          text "This Pokémon can't attack unless Regirock, Regice, and Registeel are on your Bench."
          delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if(ef.attacker == self && !(self.owner.pbg.bench.findAll({it.name=="Regirock"}) && self.owner.pbg.bench.findAll({it.name=="Regice"}) && self.owner.pbg.bench.findAll({it.name=="Registeel"})))
              {
                wcu "Seal of Antiquity prevent Regigigas from attacking"
                prevent()
              }
            }
          }
        }
        move "Giant Stomp", {
          text "160 damage. Discard any Stadium card in play."
          energyCost C, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 160
            afterDamage{
              if(bg.stadiumInfoStruct)
                discard bg.stadiumInfoStruct.stadiumCard
            }
          }
        }

      };
      case MINCCINO_85:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Tickle", {
          text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip {applyAfterDamage PARALYZED}
          }
        }

      };
      case CINCCINO_86:
      return evolution (this, from:"Minccino", hp:HP090, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Amazing Plea", {
          text "Choose 2 cards from your discard pile. Then, ask your opponent if you may put them into your hand. If no, this attack does 80 damage to your opponent's Active Pokémon."
          energyCost C
          attackRequirement {
            assert my.discard
          }
          onAttack {
            def tar = my.discard.select(count : Math.min(2,my.discard.size()))
            tar.showToOpponent("Cards selected")
            if(oppConfirm("allow your opponent to put those cards in their hand?")){
              tar.moveTo(my.hand)
            }
            else{
              damage 80
            }
          }
        }

      };
      case BUNNELBY_87:
      return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Mud Shot", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }

      };
      case DIGGERSBY_88:
      return evolution (this, from:"Bunnelby", hp:HP130, type:COLORLESS, retreatCost:3) {
        weakness FIGHTING
        move "Dig", {
          text "60 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
            flip {preventAllEffectsNextTurn()}
          }
        }
        move "Hammer Arm", {
          text "90 damage. Discard the top card of your opponent's deck."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 90
            opp.deck.subList(0,1).discard()
          }
        }

      };
      case TYPE__NULL_89:
      return basic (this, hp:HP110, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Armor Press", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(30), thisMove)
          }
        }
        move "Slashing Claw", {
          text "70 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }

      };
      case SILVALLY_GX_90:
      return evolution (this, from:"Type: Null", hp:HP210, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        bwAbility "Gyro Unit", {
          text "Your Basic Pokémon in play have no Retreat Cost."
          getterA GET_RETREAT_COST, {h->
            if(h.effect.target.owner == self.owner && h.effect.target.topPokemonCard.cardTypes.is(BASIC)) {
              h.object = 0
            }
          }
        }
        move "Turbo Drive", {
          text "120 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
            attachEnergyFrom(basic : true, my.discard, my.bench)
          }
        }
        move "Rebel GX", {
          text "50× damage. This attack does 50 damage for each of your opponent's Benched Pokémon. (You can't use more than 1 GX attack in a game.)"
          energyCost C, C, C
          attackRequirement {gxCheck()}
          onAttack {
            gxPerform()
            damage 50*opp.bench.size()
          }
        }

      };
      case COUNTER_CATCHER_91:
      return itemCard (this) {
        text "You can play this card only if you have more Prize cards remaining than your opponent.\nSwitch 1 of your opponent's Benched Pokémon with their Active Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          def pcs = opp.bench.select("Switch")
          sw opp.active, pcs
        }
        playRequirement{
          assert my.prizeAsList.size() > opp.prizeAsList.size()
        }
      };
      case DASHING_POUCH_92:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf the Pokémon this card is attached to discards Energy for its Retreat Cost, put that Energy into your hand instead of the discard pile.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          bg.em().storeObject("dashing_pouch_"+self.hashCode(), 1)
        }
        onRemoveFromPlay {
          bg.em().storeObject("dashing_pouch_"+self.hashCode(), null)
        }
      };
      case DEVOURED_FIELD_93:
      return stadium (this) {
        text "The attacks of [D] Pokémon and [N] Pokémon (both yours and your opponent's) do 10 more damage to the opponent's Active Pokémon (before applying Weakness and Resistance).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
        def eff
        onPlay {
          eff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if((it.from.types.contains(D) || it.from.types.contains(N)) && it.dmg.value && it.notNoEffect && it.from.owner == it.to.owner.opposite && it.to.active){
                  bc "Devoured Field +10"
                  it.dmg += hp(10)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case FIGHTING_MEMORY_94:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe Silvally-GX this card is attached to is a [F] Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff=getter GET_POKEMON_TYPE, self, {h ->
            if(h.effect.target.name == "Silvally-GX")
            {
              h.object.retainAll()
              h.object.add(FIGHTING)
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case GLADION_95:
      return supporter (this) {
        text "Look at your face-down Prize cards and put 1 of them into your hand. Then, shuffle this Gladion into your remaining Prize cards and put them back face down. If you didn't play this Gladion from your hand, it does nothing.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          if(my.hand.find{it == thisCard}){
            def tar = my.prizeAsList.select(hidden: false, "Prize to replace with Gladion")
            def ind = my.prizeAsList.indexOf(tar.first())
            tar.moveTo(my.hand)
            def thisCardAsList = new CardList(thisCard)
            my.prize[ind] = thisCard
            my.hand.removeAll(thisCardAsList)
          }
        }
        playRequirement{
        }
      };
      case LUSAMINE_96:
      return supporter (this) {
        text "Put 2 in any combination of Supporter and Stadium cards from your discard pile into your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          if(my.discard.findAll({it.cardTypes.is(SUPPORTER) || it.cardTypes.is(STADIUM)})) my.discard.select(count :2,"Search your discard pile for 2 supporter or stadium", {it.cardTypes.is(SUPPORTER) || it.cardTypes.is(STADIUM)}).moveTo(hand)
        }
        playRequirement{
          assert deck
        }
      };
      case PEEKING_RED_CARD_97:
      return itemCard (this) {
        text "Your opponent reveals their hand. You may have your opponent count the cards in their hand, shuffle those cards into their deck, then draw that many cards.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          opp.hand.showToMe("Opponent's hand")
          if(confirm("Replace opponent hand?")){
            def nbc = opp.hand.size()
            opp.hand.moveTo(opp.deck)
            shuffleDeck(null, TargetPlayer.OPPONENT)
            opp.deck.subList(0, nbc).each{
              moveCard(it,opp.hand)
            }
          }

        }
        playRequirement{
          assert opp.hand
        }
      };
      case PSYCHIC_MEMORY_98:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe Silvally-GX this card is attached to is a [P] Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff=getter GET_POKEMON_TYPE, self, {h ->
            if(h.effect.target.name == "Silvally-GX")
            {
              h.object.retainAll()
              h.object.add(PSYCHIC)
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case SEA_OF_NOTHINGNESS_99:
      return stadium (this) {
        text "Special Conditions are not removed when Pokémon (both yours and your opponent's) evolve or devolve.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
        def eff
        onPlay {
          //TODO : implement this stadium
          eff = delayed {
            before ASLEEP_SPC, null, null, EVOLVE, {
              prevent()
            }
            before CONFUSED_SPC, null, null, EVOLVE, {
              prevent()
            }
            before PARALYZED_SPC, null, null, EVOLVE, {
              prevent()
            }
            before BURNED_SPC, null, null, EVOLVE, {
              prevent()
            }
            before POISONED_SPC, null, null, EVOLVE, {
              prevent()
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case COUNTER_ENERGY_100:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy.\nIf you have more Prize cards remaining than your opponent, and if this card is attached to a Pokémon that isn't a Pokémon-GX or Pokémon-EX, this card provides every type of Energy but provides only 2 Energy at a time"
        onPlay {reason->
              }
              onRemoveFromPlay {
              }
              onMove {to->
              }
              getEnergyTypesOverride{
                  if(self.owner.pbg.prizeAsList.size() > self.owner.opposite.pbg.prizeAsList.size())
                      return  [[W,W],[G,W],[D,W],[M,W],[F,W],[R,W],[P,W],[L,W],[Y,W],[W,G],[G,G],[D,G],[M,G],[F,G],[R,G],[P,G],[L,G],[Y,G],[W,D],[G,D],[D,D],[M,D],[F,D],[R,D],[P,D],[L,D],[Y,D],[W,M],[G,M],[D,M],[M,M],[F,M],[R,M],[P,M],[L,M],[Y,M],[W,F],[G,F],[D,F],[M,F],[F,F],[R,F],[P,F],[L,F],[Y,F],[W,R],[G,R],[D,R],[M,R],[F,R],[R,R],[P,R],[L,R],[Y,R],[W,P],[G,P],[D,P],[M,P],[F,P],[R,P],[P,P],[L,P],[Y,P],[W,L],[G,L],[D,L],[M,L],[F,L],[R,L],[P,L],[L,L],[Y,L],[W,Y],[G,Y],[D,Y],[M,Y],[F,Y],[R,Y],[P,Y],[L,Y],[Y,Y]]
                  else
                      return [[C]]
              }
          };
      case GYARADOS_GX_101:
      return copy (GYARADOS_GX_18, this);
      case ALOLAN_GOLEM_GX_102:
      return copy (ALOLAN_GOLEM_GX_34, this);
      case NIHILEGO_GX_103:
      return copy (NIHILEGO_GX_49, this);
      case BUZZWOLE_GX_104:
      return copy (BUZZWOLE_GX_57, this);
      case GUZZLORD_GX_105:
      return copy (GUZZLORD_GX_63, this);
      case KARTANA_GX_106:
      return copy (KARTANA_GX_70, this);
      case ALOLAN_EXEGGUTOR_GX_107:
      return copy (ALOLAN_EXEGGUTOR_GX_74, this);
      case SILVALLY_GX_108:
      return copy (SILVALLY_GX_90, this);
      case GLADION_109:
      return copy (GLADION_95, this);
      case LUSAMINE_110:
      return copy (LUSAMINE_96, this);
      case OLIVIA_111:
      return copy (BurningShadows.OLIVIA_119, this);
      case GYARADOS_GX_112:
      return copy (GYARADOS_GX_18, this);
      case ALOLAN_GOLEM_GX_113:
      return copy (ALOLAN_GOLEM_GX_34, this);
      case NIHILEGO_GX_114:
      return copy (NIHILEGO_GX_49, this);
      case BUZZWOLE_GX_115:
      return copy (BUZZWOLE_GX_57, this);
      case GUZZLORD_GX_116:
      return copy (GUZZLORD_GX_63, this);
      case KARTANA_GX_117:
      return copy (KARTANA_GX_70, this);
      case ALOLAN_EXEGGUTOR_GX_118:
      return copy (ALOLAN_EXEGGUTOR_GX_74, this);
      case SILVALLY_GX_119:
      return copy (SILVALLY_GX_90, this);
      case COUNTER_CATCHER_120:
      return copy (COUNTER_CATCHER_91, this);
      case WISHFUL_BATON_121:
      return copy(BurningShadows.WISHFUL_BATON_128, this)
      case COUNTER_ENERGY_122:
      return copy (COUNTER_ENERGY_100, this);
      case WARP_ENERGY_123:
      return copy (Aquapolis.WARP_ENERGY_147, this);
      case WATER_ENERGY_124:
      return basicEnergy (this, W);
        default:
      return null;
    }
  }

}
