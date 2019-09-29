package tcgwars.logic.impl.gen7;

import tcgwars.logic.impl.gen7.TeamUp;
import tcgwars.logic.impl.gen7.DragonMajesty;
import tcgwars.logic.impl.gen7.UnbrokenBonds;
import tcgwars.logic.impl.gen6.Evolutions;
import tcgwars.logic.impl.gen6.Flashfire;
import tcgwars.logic.impl.gen6.Breakpoint;

import java.util.*;

import org.apache.commons.lang.WordUtils;

import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

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
 * @author luongthomasdev@gmail.com
 */
public enum HiddenFates implements CardInfo {

  CATERPIE_1 ("Caterpie", 1, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  METAPOD_2 ("Metapod", 2, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BUTTERFREE_3 ("Butterfree", 3, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  PARAS_4 ("Paras", 4, Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SCYTHER_5 ("Scyther", 5, Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  PINSIR_GX_6 ("Pinsir-GX", 6, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
  CHARMANDER_7 ("Charmander", 7, Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMELEON_8 ("Charmeleon", 8, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CHARIZARD_GX_9 ("Charizard-GX", 9, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE2, _FIRE_]),
  MAGMAR_10 ("Magmar", 10, Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  PSYDUCK_11 ("Psyduck", 11, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SLOWPOKE_12 ("Slowpoke", 12, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARYU_13 ("Staryu", 13, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARMIE_GX_14 ("Starmie-GX", 14, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _WATER_]),
  MAGIKARP_15 ("Magikarp", 15, Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  GYARADOS_GX_16 ("Gyarados-GX", 16, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _WATER_]),
  LAPRAS_17 ("Lapras", 17, Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  VAPOREON_18 ("Vaporeon", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PIKACHU_19 ("Pikachu", 19, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_GX_20 ("Raichu-GX", 20, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _LIGHTNING_]),
  VOLTORB_21 ("Voltorb", 21, Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_22 ("Electrode", 22, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTEON_23 ("Jolteon", 23, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ZAPDOS_24 ("Zapdos", 24, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  EKANS_25 ("Ekans", 25, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EKANS_26 ("Ekans", 26, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ARBOK_27 ("Arbok", 27, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KOFFING_28 ("Koffing", 28, Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  WEEZING_29 ("Weezing", 29, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  JYNX_30 ("Jynx", 30, Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  MEWTWO_GX_31 ("Mewtwo-GX", 31, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
  MEW_32 ("Mew", 32, Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  GEODUDE_33 ("Geodude", 33, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GRAVELER_34 ("Graveler", 34, Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GOLEM_35 ("Golem", 35, Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  ONIX_GX_36 ("Onix-GX", 36, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
  CUBONE_37 ("Cubone", 37, Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CLEFAIRY_38 ("Clefairy", 38, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  CLEFAIRY_39 ("Clefairy", 39, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  CLEFABLE_40 ("Clefable", 40, Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
  JIGGLYPUFF_41 ("Jigglypuff", 41, Rarity.COMMON, [POKEMON, BASIC, _FAIRY_]),
  WIGGLYTUFF_GX_42 ("Wigglytuff-GX", 42, Rarity.ULTRARARE, [POKEMON, EVOLUTION, POKEMON_GX, STAGE1, _FAIRY_]),
  MR_MIME_43 ("Mr. Mime", 43, Rarity.RARE, [POKEMON, BASIC, _FAIRY_]),
  MOLTRES_ZAPDOS_ARTICUNO_GX_44 ("Moltres & Zapdos & Articuno-GX", 44, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  FARFETCH_D_45 ("Farfetch'd", 45, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHANSEY_46 ("Chansey", 46, Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  KANGASKHAN_47 ("Kangaskhan", 47, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_48 ("Eevee", 48, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_49 ("Eevee", 49, Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNORLAX_50 ("Snorlax", 50, Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  BILL_S_ANALYSIS_51 ("Bill's Analysis", 51, Rarity.RARE, [TRAINER, SUPPORTER]),
  BLAINE_S_LAST_STAND_52 ("Blaine's Last Stand", 52, Rarity.RARE, [TRAINER, SUPPORTER]),
  BROCK_S_GRIT_53 ("Brock's Grit", 53, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BROCK_S_PEWTER_CITY_GYM_54 ("Brock's Pewter City Gym", 54, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  BROCK_S_TRAINING_55 ("Brock's Training", 55, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ERIKA_S_HOSPITALITY_56 ("Erika's Hospitality", 56, Rarity.RARE, [TRAINER, SUPPORTER]),
  GIOVANNI_S_EXILE_57 ("Giovanni's Exile", 57, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  JESSIE_JAMES_58 ("Jessie & James", 58, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  KOGA_S_TRAP_59 ("Koga's Trap", 59, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LT_SURGE_S_STRATEGY_60 ("Lt. Surge's Strategy", 60, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MISTY_S_CERULEAN_CITY_GYM_61 ("Misty's Cerulean City Gym", 61, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  MISTY_S_DETERMINATION_62 ("Misty's Determination", 62, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MISTY_S_WATER_COMMAND_63 ("Misty's Water Command", 63, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  POKEMON_CENTER_LADY_64 ("Pokémon Center Lady", 64, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  SABRINA_S_SUGGESTION_65 ("Sabrina's Suggestion", 65, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MOLTRES_ZAPDOS_ARTICUNO_GX_66 ("Moltres & Zapdos & Articuno-GX", 66, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]),
  GIOVANNI_S_EXILE_67 ("Giovanni's Exile", 67, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  JESSIE_JAMES_68 ("Jessie & James", 68, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  MOLTRES_ZAPDOS_ARTICUNO_GX_69 ("Moltres & Zapdos & Articuno-GX", 69, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, TAG_TEAM, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  HiddenFates(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.HIDDEN_FATES;
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
      case CATERPIE_1:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }

      };
      case METAPOD_2:
      return evolution (this, from:"Caterpie", hp:HP090, type:G, retreatCost:2) {
        weakness R
        move "Tackle", {
          text "30 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BUTTERFREE_3:
      return evolution (this, from:"Metapod", hp:HP130, type:G, retreatCost:1) {
        weakness R
        move "Gust", {
          text "80 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case PARAS_4:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slash", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SCYTHER_5:
      return basic (this, hp:HP100, type:G, retreatCost:1) {
        weakness R
        move "Slash", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sharp Scythe", {
          text "30 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PINSIR_GX_6:
      return basic (this, hp:HP180, type:G, retreatCost:2) {
        weakness R
        move "Superpowered Horns", {
          text "110 damage. "
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
        move "Guillotine GX", {
          text "160 damage. (You can’t use more than 1 GX attack in a game.)"
          energyCost G, G, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 160
          }
        }
      };
      case CHARMANDER_7:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Gnaw", {
          text "10 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Flare", {
          text "20 damage. "
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CHARMELEON_8:
      return evolution (this, from:"Charmander", hp:HP100, type:R, retreatCost:1) {
        weakness W
        move "Slash", {
          text "30 damage. "
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Flamethrower", {
          text "80 damage. "
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case CHARIZARD_GX_9:
      return evolution (this, from:"Charmeleon", hp:HP250, type:R, retreatCost:3) {
        weakness W
        move "Flamethrower", {
          text "140 damage. "
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
        move "Flare Blitz GX", {
          text "300 damage. (You can’t use more than 1 GX attack in a game.)"
          energyCost R, R, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 300
          }
        }
      };
      case MAGMAR_10:
      return basic (this, hp:HP090, type:R, retreatCost:2) {
        weakness W
        move "Fire Punch", {
          text "50 damage. "
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PSYDUCK_11:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness G
        move "Headache", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SLOWPOKE_12:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness G
        move "Yawn", {
          text "Your opponent's Active Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            apply ASLEEP
          }
        }
      };
      case STARYU_13:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness G
        move "Numbing Water", {
          text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
            flip{ applyAfterDamage PARALYZED }
          }
        }
      };
      case STARMIE_GX_14:
      return evolution (this, from:"Staryu", hp:HP190, type:W, retreatCost:0) {
        weakness G
        move "Star Stream", {
          text "40 damage. Attach 2 [W] Energy cards from your discard pile to 1 of your Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 40
            afterDamage{
              if(my.discard.filterByEnergyType(W)) { attachEnergyFrom(type:W, my.discard, my.all.select()) }
              if(my.discard.filterByEnergyType(W)) { attachEnergyFrom(type:W, my.discard, my.all.select()) }
            }
          }
        }
        move "Spinning Attack", {
          text "100 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
        move "Hydro Pump GX", {
          text "40+ damage. This attack does 40 more damage times the amount of [W] Energy attached to this Pokémon. (You can't use more than 1 GX attack in a game.)"
          energyCost C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 40+40*self.cards.energyCount(W)
          }
        }
      };
      case MAGIKARP_15:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Splash", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GYARADOS_GX_16:
      return evolution (this, from:"Magikarp", hp:HP230, type:W, retreatCost:3) {
        weakness L
        move "Dragon Rage", {
          text "130 damage. "
          energyCost W, W, W, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
        move "Hyper Beam GX", {
          text "240 damage. (You can’t use more than 1 GX attack in a game.)"
          energyCost W, W, W, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 240
          }
        }
      };
      case LAPRAS_17:
      return basic (this, hp:HP120, type:W, retreatCost:2) {
        weakness G
        move "Aqua Wave", {
          text "80 damage. "
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case VAPOREON_18:
      return evolution (this, from:"Eevee", hp:HP120, type:W, retreatCost:3) {
        weakness G
        move "Water Gun", {
          text "30 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Bubble Drain", {
          text "80 damage. Heal 30 damage from this Pokémon."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 80
            heal 30, self
          }
        }
      };
      case PIKACHU_19:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS20
        move "Quick Attack", {
          text "10 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Electro Ball", {
          text "60 damage. "
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case RAICHU_GX_20:
      return evolution (this, from:"Pikachu", hp:HP210, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS20
        move "Thunderbolt", {
          text "120 damage. "
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
        move "Spark Ball GX", {
          text "200 damage. (You can’t use more than 1 GX attack in a game.)"
          energyCost L, L, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 200
          }
        }
      };
      case VOLTORB_21:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS20
        move "Lightning Ball", {
          text "20 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ELECTRODE_22:
      return evolution (this, from:"Voltorb", hp:HP100, type:L, retreatCost:1) {
        weakness F
        resistance M, MINUS20
        move "Lightning Ball", {
          text "30 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Electroblast", {
          text "60+ damage. Flip 2 coins. This attack does 30 more damage for each heads."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 60
            flip 2, {damage 30}
          }
        }
      };
      case JOLTEON_23:
      return evolution (this, from:"Eevee", hp:HP090, type:L, retreatCost:0) {
        weakness F
        resistance M, MINUS20
        bwAbility "Electromagnetic Wall", {
          text "As long as this Pokémon is your Active Pokémon, whenever your opponent attaches an Energy from his or her hand to 1 of his or her Pokémon, put 3 damage counters on that Pokémon."
          delayedA {
            after ATTACH_ENERGY, {
              if(self.active && ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite)
                directDamage 20, ef.resolvedTarget
            }
          }
        }
        move "Thunderbolt", {
          text "90 damage. Discard all Energy from this Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 90
            afterDamage{
              discardAllSelfEnergy(null)
            }
          }
        }
      };
      case ZAPDOS_24:
      return basic (this, hp:HP120, type:L, retreatCost:2) {
        weakness L
        resistance F, MINUS20
        move "Hurricane Call", {
          text "Flip 4 coins. For each heads, search your deck for a [L] Energy card and attach it to 1 of your Pokémon-GX or Pokémon-EX. Then, shuffle your deck."
          energyCost C, C
          attackRequirement {
            assert deck
          }
          onAttack {
            if(my.all.findAll {it.pokemonGX || it.pokemonEX}) {
              flip 4, {
                deck.search (basicEnergyFilter(L)).each {
                  attachEnergy(my.all.findAll {it.pokemonGX || it.pokemonEX}.select("Attach energy to?"),it)
                }
              }
              shuffleDeck()
            }
          }
        }
        move "Sky-High Claws", {
          text "100 damage. "
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case EKANS_25:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Wrap", {
          text "10 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
            flip { discardDefendingEnergy() }
          }
        }
      };
      case EKANS_26:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Tail Whap", {
          text "30 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARBOK_27:
      return evolution (this, from:"Ekans", hp:HP120, type:P, retreatCost:2) {
        weakness P
        bwAbility "Last Pattern", {
          text "If this Pokémon is Knocked Out by damage from an opponent's attack, discard 2 random cards from your opponent's hand."
          delayedA {
            after (KNOCKOUT, self) {
              bc "Last Pattern activates"
              bg.deterministicCurrentThreadPlayerType = self.owner
              astonish()
              astonish()
              bg.clearDeterministicCurrentThreadPlayerType()
            }
          }
        }
        move "Rocket Tail", {
          text "50+ damage. If Jessie & James is in your discard pile, this attack does 80 more damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
            if(my.discard.find{it.name=="Jessie & James"}) {
              damage 80
            }
          }
        }
      };
      case KOFFING_28:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Tackle", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WEEZING_29:
      return evolution (this, from:"Koffing", hp:HP120, type:P, retreatCost:3) {
        weakness P
        bwAbility "Surrender Now", {
          text "Once during your turn, if this Pokémon is discarded with the effect of Jessie & James, you may have your opponent discard a card from their hand. (They discard that card after the effect of Jessie & James.)"
          actionA {
            // TODO:
          }
        }
        move "Tackle", {
          text "40 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case JYNX_30:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
        weakness P
        move "Slap", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Lovely Kiss", {
          text "30 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MEWTWO_GX_31:
      return basic (this, hp:HP180, type:P, retreatCost:2) {
        weakness P
        move "Super Psy Bolt", {
          text "110 damage. "
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
        move "Psycrush GX", {
          text "120 damage. Discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
          energyCost P, P, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 120
            targeted (defending) {
              opp.active.cards.filterByType(ENERGY).discard()
            }
          }
        }
      };
      case MEW_32:
      return basic (this, hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Psyshot", {
          text "50 damage. "
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GEODUDE_33:
      return basic (this, hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GRAVELER_34:
      return evolution (this, from:"Geodude", hp:HP100, type:F, retreatCost:3) {
        weakness G
        move "Tackle", {
          text "30 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Mudslide", {
          text "Discard 2 [F] Energy from this Pokémon. This attack does 80 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            discardSelfEnergy F,F
            damage 80, opp.all.select()
          }
        }
      };
      case GOLEM_35:
      return evolution (this, from:"Graveler", hp:HP170, type:F, retreatCost:4) {
        weakness G
        move "Rock Slide", {
          text "60 damage. This attack does 20 damage to 3 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 60
            if(opp.bench){
              multiSelect(opp.bench, 3).each{
                targeted(it){ damage 20, it }
              }
            }
          }
        }
        move "Land Crush", {
          text "140 damage. "
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case ONIX_GX_36:
      return basic (this, hp:HP200, type:F, retreatCost:4) {
        weakness G
        move "Bind", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
            flip{ applyAfterDamage PARALYZED }
          }
        }
        move "Heavy Impact", {
          text "150 damage. "
          energyCost F, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
        move "Rocky Avalanche GX", {
          text "200 damage. During your opponent's next turn, this Pokémon takes 100 less damage from attacks (after applying Weakness and Resistance). (You can’t use more than 1 GX attack in a game.)"
          energyCost F, C, C, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 200
            reduceDamageNextTurn(hp(100), thisMove)
          }
        }
      };
      case CUBONE_37:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness G
        move "Sharpshooting", {
          text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20, opp.all.select()
          }
        }
      };
      case CLEFAIRY_38:
      return basic (this, hp:HP060, type:Y, retreatCost:1) {
        weakness M
        resistance D, MINUS20
        move "Lead", {
          text "Flip a coin. If heads, search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            flip {
              my.deck.search(count:1,"Choose a Supporter card",cardTypeFilter(SUPPORTER)).showToOpponent("Chosen card").moveTo(my.hand)
              shuffleDeck()
            }
          }
        }
        move "Pound", {
          text "10 damage. "
          energyCost Y
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CLEFAIRY_39:
      return basic (this, hp:HP060, type:Y, retreatCost:1) {
        weakness M
        resistance D, MINUS20
        move "Pound", {
          text "10 damage. "
          energyCost Y
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Moon Dance", {
          text "30 damage. "
          energyCost Y, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CLEFABLE_40:
      return evolution (this, from:"Clefairy", hp:HP120, type:Y, retreatCost:2) {
        weakness M
        resistance D, MINUS20
        move "Pound", {
          text "40 damage. "
          energyCost Y, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Moon Impact", {
          text "90 damage. "
          energyCost Y, Y, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case JIGGLYPUFF_41:
      return basic (this, hp:HP070, type:Y, retreatCost:1) {
        weakness M
        resistance D, MINUS20
        move "Singing Voice", {
          text "10 damage. "
          energyCost Y
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rollout", {
          text "30 damage. "
          energyCost Y, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WIGGLYTUFF_GX_42:
      return evolution (this, from:"Jigglypuff", hp:HP210, type:Y, retreatCost:2) {
        weakness M
        resistance D, MINUS20
        move "Rolling Rush", {
          text "100+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
          energyCost Y, Y, C
          attackRequirement {}
          onAttack {
            damage 100
            flipUntilTails{damage 30}
          }
        }
        move "Lovely Star GX", {
          text "130 damage. Heal all damage from this Pokémon. (You can't use more than 1 GX attack in a game.)"
          energyCost Y, Y, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 130
            healAll self
          }
        }
      };
      case MR_MIME_43:
      return basic (this, hp:HP090, type:Y, retreatCost:1) {
        weakness M
        resistance D, MINUS20
        move "Happy Mime", {
          text "Each player draws a card."
          energyCost Y
          attackRequirement {}
          onAttack {
            draw self
            draw OPPONENT
          }
        }
        move "Double Slap", {
          text "40x damage. Flip 2 coins. This attack does 40 damage for each heads."
          energyCost Y, Y
          attackRequirement {}
          onAttack {
            flip 2, { damage 40 }
          }
        }
      };
      case MOLTRES_ZAPDOS_ARTICUNO_GX_44:
      return basic (this, hp:HP300, type:C, retreatCost:3) {
        weakness L
        resistance F, MINUS20
        move "Trinity Burn", {
          text "210 damage. "
          energyCost R, L, W, C
          attackRequirement {}
          onAttack {
            damage 210
          }
        }
        move "Sky Legends GX", {
          text "Shuffle this Pokémon and all cards attached to it into your deck. If this Pokémon has at least 1 extra [R], [W], and [L] Energy attached to it (in addition to this attack's cost), this attack does 110 damage to 3 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
          energyCost C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            if (self.cards.energySufficient(thisMove.energyCost + [R,W,L])) {
              if(opp.bench){
                multiSelect(opp.bench, 3).each{
                  targeted(it){ damage 110, it }
                }
              }
            }

            afterDamage{
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
            }
          }
        }
      };
      case FARFETCH_D_45:
      return basic (this, hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS20
        move "Leek Slap", {
          text "30 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CHANSEY_46:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Double-Edge", {
          text "80 damage. This Pokémon does 20 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
            damage 20, self
          }
        }
      };
      case KANGASKHAN_47:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness F
        move "Parental Fury", {
          text "40x damage. Flip a coin until you get tails. This attack does 40 damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
            flipUntilTails { damage 40 }
          }
        }
      };
      case EEVEE_48:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Curiosity", {
          text "Your opponent reveals their hand."
          energyCost C
          attackRequirement {}
          onAttack {
            opp.hand.showToMe("Opponent's hand")
          }
        }
        move "Spin Tackle", {
          text "30 damage. Flip a coin. If tails, this Pokémon does 10 damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
            flipTails {damage 10, self}
          }
        }
      };
      case EEVEE_49:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Gnaw", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SNORLAX_50:
      return basic (this, hp:HP150, type:C, retreatCost:3) {
        weakness F
        move "Incredible Snore", {
          text "100 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case BILL_S_ANALYSIS_51:
      return copy (TeamUp.BILL_S_ANALYSIS_133, this);
      case BLAINE_S_LAST_STAND_52:
      return copy (DragonMajesty.BLAINE_S_LAST_STAND_58, this);
      case BROCK_S_GRIT_53:
      return copy (TeamUp.BROCKS_GRIT_135, this);
      case BROCK_S_PEWTER_CITY_GYM_54:
      return stadium (this) {
        text "Onix-GX (both yours and your opponent's) take 40 less damage from the opponent's attacks (after applying Weakness and Resistance)."
        def eff
        onPlay {
          eff = delayed {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if((it.to.name == "Onix-GX" && it.dmg.value && it.notNoEffect && it.from.owner != it.to.owner ){
                  bc "Brock's Pewter City Gym -40"
                  it.dmg -= hp(40)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case BROCK_S_TRAINING_55:
      return supporter (this) {
        text "Attach an Energy card from your hand to 1 of your Geodude, Graveler, Golem, Onix-GX, Cubone, Rhyhorn, Rhydon, or Sudowoodo."
        onPlay {
          def tar = my.all.findAll{['Geodude', 'Graveler', 'Golem', 'Onix-GX', 'Cubone', 'Rhyhorn', 'Rhydon', 'Sudowoodo'].contains(it.topPokemonCard.name)}.select("Select the Pokémon to which you want to attach Energy.")
            attachEnergyFrom(my.hand, tar)
        }
        playRequirement{
          assert my.all.findAll{['Geodude', 'Graveler', 'Golem', 'Onix-GX', 'Cubone', 'Rhyhorn', 'Rhydon', 'Sudowoodo'].contains(it.topPokemonCard.name)} : "No valid targets"
          assert my.hand.filterByType(ENERGY) : "No energy in hand"
        }
      };
      case ERIKA_S_HOSPITALITY_56:
      return copy (TeamUp.ERIKAS_HOSPITALITY_140, this);
      case GIOVANNI_S_EXILE_57:
      return copy(UnbrokenBonds.GIOVANNI_S_EXILE_174, this);
      case JESSIE_JAMES_58:
      return supporter (this) {
        text "Each player discards 2 cards from their hand. Your opponent discards first."
        onPlay {
          opp.hand.select(count:2, "Choose two cards to discard").showToMe("Opponent's discarded cards").discard()
          my.hand.select(count:2, "Choose teo cards to discard").showToOpp("Opponent's discarded cards").discard()
          // Todo: add src so that it can work with Weezing
        }
        playRequirement{
          assert opp.hand || my.hand.getExcludedList(thisCard) : "No cards to discard"
        }
      };
      case KOGA_S_TRAP_59:
      return copy(UnbrokenBonds.KOGA_S_TRAP_177, this);
      case LT_SURGE_S_STRATEGY_60:
      return copy(UnbrokenBonds.LT_SURGE_S_STRATEGY_178, this);
      case MISTY_S_CERULEAN_CITY_GYM_61:
      return stadium (this) {
        text "The attacks of Starmie-GX (both yours and your opponent's) do 40 more damage to the opponent's Active Pokémon (before applying Weakness and Resistance)."
        def eff
        onPlay {
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each{
                if(it.from.name == "Starmie-GX" && it.dmg.value && it.from.owner == it.to.owner.opposite && it.to.active){
                  bc "Misty's Cerulean City Gym +40"
                  it.dmg += hp(40)
                }
              }
            }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
      };
      case MISTY_S_DETERMINATION_62:
      return copy(BreakPoint.MISTY_S_DETERMINATION_104, this);
      case MISTY_S_WATER_COMMAND_63:
      return supporter (this) {
        text "Move any number of [W] Energy from your Pokémon to your Psyduck, Horsea, Staryu, Starmie-GX, Magikarp, Gyarados, or Lapras in any way you like."
        def eligible = ["Psyduck", "Horsea", "Staryu", "Starmie-GX", "Magikarp", "Gyarados", "Lapras"]
        onPlay {
          while(1){
            def pl=(my.all.findAll {it.cards.energyCount(W)})
            if(!pl) break;
            def src =pl.select("Source for energy (cancel to stop)", false)
            if(!src) break;
            def card=src.cards.select.filterByEnergyType(W)("Energy to move").first()

            def tar=my.all.findAll{ eligible.contains(it.name) }.select("Target for energy (cancel to stop)", false)
            if(!tar) break;
            energySwitch(src, tar, card)
          }
        }
        playRequirement{
          assert my.all.findAll{ eligible.contains(it.name) } : "No valid targets"
          assert my.all.findAll {it.cards.energyCount(W)} : "No Water energy in play"
        }
      };
      case POKEMON_CENTER_LADY_64:
      return copy(FlashFire.POKEMON_CENTER_LADY_93, this);
      case SABRINA_S_SUGGESTION_65:
      return copy(TeamUp.SABRINAS_SUGGESTION_154, this);
      case MOLTRES_ZAPDOS_ARTICUNO_GX_66:
      return copy (MOLTRES_ZAPDOS_ARTICUNO_GX_44, this);
      case GIOVANNI_S_EXILE_67:
      return copy (GIOVANNI_S_EXILE_57, this);
      case JESSIE_JAMES_68:
      return copy (JESSIE_JAMES_58, this);
      case MOLTRES_ZAPDOS_ARTICUNO_GX_69:
      return copy (MOLTRES_ZAPDOS_ARTICUNO_GX_44, this);
        default:
      return null;
    }
  }

}
