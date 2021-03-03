package tcgwars.logic.impl.gen4

import tcgwars.logic.impl.gen3.FireRedLeafGreen;
import tcgwars.logic.impl.gen7.CelestialStorm;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.gm.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum Platinum implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  BLASTOISE_2 ("Blastoise", "2", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  BLAZIKEN_3 ("Blaziken", "3", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DELCATTY_4 ("Delcatty", "4", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIALGA_5 ("Dialga", "5", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  DIALGA_6 ("Dialga", "6", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  DIALGA_G_7 ("Dialga G", "7", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  GARDEVOIR_8 ("Gardevoir", "8", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GIRATINA_9 ("Giratina", "9", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  GIRATINA_10 ("Giratina", "10", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  MANECTRIC_11 ("Manectric", "11", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  PALKIA_G_12 ("Palkia G", "12", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  RAMPARDOS_13 ("Rampardos", "13", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  SHAYMIN_14 ("Shaymin", "14", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SHAYMIN_15 ("Shaymin", "15", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SLAKING_16 ("Slaking", "16", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  WEAVILE_G_17 ("Weavile G", "17", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  ALTARIA_18 ("Altaria", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BANETTE_19 ("Banette", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  BASTIODON_20 ("Bastiodon", "20", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  BEAUTIFLY_21 ("Beautifly", "21", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BLISSEY_22 ("Blissey", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DIALGA_23 ("Dialga", "23", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  DUGTRIO_24 ("Dugtrio", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  DUSTOX_25 ("Dustox", "25", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_26 ("Empoleon", "26", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  GIRATINA_27 ("Giratina", "27", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GIRATINA_28 ("Giratina", "28", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GOLDUCK_29 ("Golduck", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GYARADOS_G_30 ("Gyarados G", "30", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  INFERNAPE_31 ("Infernape", "31", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  KRICKETUNE_32 ("Kricketune", "32", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKILICKY_33 ("Lickilicky", "33", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LUDICOLO_34 ("Ludicolo", "34", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  LUVDISC_35 ("Luvdisc", "35", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  NINETALES_36 ("Ninetales", "36", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PALKIA_37 ("Palkia", "37", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  SHAYMIN_38 ("Shaymin", "38", Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  TORTERRA_39 ("Torterra", "39", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TOXICROAK_G_40 ("Toxicroak G", "40", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  BRONZONG_G_41 ("Bronzong G", "41", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  CACTURNE_42 ("Cacturne", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CARNIVINE_43 ("Carnivine", "43", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  CASCOON_44 ("Cascoon", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  COMBUSKEN_45 ("Combusken", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CRANIDOS_46 ("Cranidos", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CROBAT_G_47 ("Crobat G", "47", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  FLAAFFY_48 ("Flaaffy", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  GROTLE_49 ("Grotle", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HOUNDOOM_G_50 ("Houndoom G", "50", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  KIRLIA_51 ("Kirlia", "51", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LOMBRE_52 ("Lombre", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LUCARIO_53 ("Lucario", "53", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MIGHTYENA_54 ("Mightyena", "54", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  MISMAGIUS_55 ("Mismagius", "55", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MONFERNO_56 ("Monferno", "56", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MUK_57 ("Muk", "57", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  OCTILLERY_58 ("Octillery", "58", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PRINPLUP_59 ("Prinplup", "59", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PROBOPASS_60 ("Probopass", "60", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEVIPER_61 ("Seviper", "61", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SHIELDON_62 ("Shieldon", "62", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SILCOON_63 ("Silcoon", "63", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VIGOROTH_64 ("Vigoroth", "64", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WARTORTLE_65 ("Wartortle", "65", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ZANGOOSE_66 ("Zangoose", "66", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  CACNEA_67 ("Cacnea", "67", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CARNIVINE_68 ("Carnivine", "68", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHANSEY_69 ("Chansey", "69", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIMCHAR_70 ("Chimchar", "70", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  COMBEE_71 ("Combee", "71", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DIGLETT_72 ("Diglett", "72", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DUNSPARCE_73 ("Dunsparce", "73", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_74 ("Electrike", "74", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GRIMER_75 ("Grimer", "75", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAPPINY_76 ("Happiny", "76", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HONCHKROW_G_77 ("Honchkrow G", "77", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  KRICKETOT_78 ("Kricketot", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LAPRAS_79 ("Lapras", "79", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  LICKITUNG_80 ("Lickitung", "80", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  LOTAD_81 ("Lotad", "81", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MAREEP_82 ("Mareep", "82", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MISDREAVUS_83 ("Misdreavus", "83", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NOSEPASS_84 ("Nosepass", "84", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIPLUP_85 ("Piplup", "85", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  POOCHYENA_86 ("Poochyena", "86", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  PSYDUCK_87 ("Psyduck", "87", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PURUGLY_G_88 ("Purugly G", "88", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  RALTS_89 ("Ralts", "89", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  REMORAID_90 ("Remoraid", "90", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RIOLU_91 ("Riolu", "91", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SHUPPET_92 ("Shuppet", "92", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKITTY_93 ("Skitty", "93", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SKUNTANK_G_94 ("Skuntank G", "94", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  SLAKOTH_95 ("Slakoth", "95", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_96 ("Squirtle", "96", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SWABLU_97 ("Swablu", "97", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TAUROS_98 ("Tauros", "98", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TORCHIC_99 ("Torchic", "99", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TORKOAL_100 ("Torkoal", "100", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  TURTWIG_101 ("Turtwig", "101", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VULPIX_102 ("Vulpix", "102", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WURMPLE_103 ("Wurmple", "103", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BROKEN_TIME_SPACE_104 ("Broken Time-Space", "104", Rarity.UNCOMMON, [STADIUM, TRAINER]),
  CYRUS_S_CONSPIRACY_105 ("Cyrus's Conspiracy", "105", Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  GALACTIC_HQ_106 ("Galactic HQ", "106", Rarity.UNCOMMON, [STADIUM, TRAINER]),
  LEVEL_MAX_107 ("Level Max", "107", Rarity.UNCOMMON, [ITEM, TRAINER]),
  LIFE_HERB_108 ("Life Herb", "108", Rarity.UNCOMMON, [ITEM, TRAINER]),
  LOOKER_S_INVESTIGATION_109 ("Looker's Investigation", "109", Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MEMORY_BERRY_110 ("Memory Berry", "110", Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  MIASMA_VALLEY_111 ("Miasma Valley", "111", Rarity.UNCOMMON, [STADIUM, TRAINER]),
  PLUSPOWER_112 ("PlusPower", "112", Rarity.UNCOMMON, [ITEM, TRAINER]),
  POKE_BALL_113 ("Poké Ball", "113", Rarity.UNCOMMON, [ITEM, TRAINER]),
  POKEDEX_HANDY910IS_114 ("Pokédex HANDY910is", "114", Rarity.UNCOMMON, [ITEM, TRAINER]),
  POKEMON_RESCUE_115 ("Pokémon Rescue", "115", Rarity.UNCOMMON, [ITEM, TRAINER]),
  ENERGY_GAIN_116 ("Team Galactic's Invention G-101 Energy Gain", "116", Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  POWER_SPRAY_117 ("Team Galactic's Invention G-103 Power Spray", "117", Rarity.UNCOMMON, [ITEM, TRAINER]),
  POKE_TURN_118 ("Team Galactic's Invention G-105 Poké Turn", "118", Rarity.UNCOMMON, [ITEM, TRAINER]),
  ARMOR_FOSSIL_119 ("Armor Fossil", "119", Rarity.COMMON, [ITEM, TRAINER]),
  SKULL_FOSSIL_120 ("Skull Fossil", "120", Rarity.COMMON, [ITEM, TRAINER]),
  RAINBOW_ENERGY_121 ("Rainbow Energy", "121", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DIALGA_G_LV_X_122 ("Dialga G Lv.X", "122", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _METAL_]),
  DRAPION_LV_X_123 ("Drapion Lv.X", "123", Rarity.HOLORARE, [LVL_X, POKEMON, _DARKNESS_]),
  GIRATINA_LV_X_124 ("Giratina Lv.X", "124", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  PALKIA_G_LV_X_125 ("Palkia G Lv.X", "125", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _WATER_]),
  SHAYMIN_LV_X_126 ("Shaymin Lv.X", "126", Rarity.HOLORARE, [LVL_X, POKEMON, _GRASS_]),
  SHAYMIN_LV_X_127 ("Shaymin Lv.X", "127", Rarity.HOLORARE, [LVL_X, POKEMON, _GRASS_]),
  ELECTABUZZ_128 ("Electabuzz", "128", Rarity.SECRET, [BASIC, POKEMON, _LIGHTNING_]),
  HITMONCHAN_129 ("Hitmonchan", "129", Rarity.SECRET, [BASIC, POKEMON, _FIGHTING_]),
  SCYTHER_130 ("Scyther", "130", Rarity.SECRET, [BASIC, POKEMON, _GRASS_]),
  LOTAD_SH4 ("Lotad", "SH4", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SWABLU_SH5 ("Swablu", "SH5", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  VULPIX_SH6 ("Vulpix", "SH6", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Platinum(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.PLATINUM;
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
      case AMPHAROS_1:
        return evolution (this, from:"Flaaffy", hp:HP130, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Damage Bind", {
            text "Each Pokémon that has any damage counters on it can’t use any Poké-Powers."
            delayedA {
              after DIRECT_DAMAGE, {
                new CheckAbilities().run(bg)
              }
              after REMOVE_DAMAGE_COUNTER, {
                new CheckAbilities().run(bg)
              }
            }
            getterA IS_ABILITY_BLOCKED, { Holder h ->
              if (h.effect.target.numberOfDamageCounters && h.effect.target.pokemonGX && h.effect.ability instanceof PokePower) {
                targeted(h.effect.target, SRC_ABILITY) {
                  h.object = true
                }
              }
            }
            onActivate {
              new CheckAbilities().run(bg)
            }
            onDeactivate {
              new CheckAbilities().run(bg)
            }
          }
          move "Gigavolt", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage. If tails, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 30
              flip 1, {
                damage 30
              }, {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Reflect Energy", {
            text "70 damage. Move an Energy card attached to Ampharos to 1 of your Benched Pokémon."
            energyCost L, C, C
            onAttack {
              damage 30
              if(my.bench && self.cards.filterByType(ENERGY)) {
                moveEnergy(self,my.bench)
              }
            }
          }

        };
      case BLASTOISE_2:
        return evolution (this, from:"Wartortle", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Dig Well", {
            text "Once during your turn , you may look at the top 3 cards of your deck, choose as many [W] Energy cards as you like, and attach them to your Pokémon in any way you like. Discard the other cards. This power can’t be used if Blastoise is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              def top = my.deck.subList(0,3)
              if(top.filterByEnergyType(W)) {
                def max = top.filterByEnergyType(w).size()
                top.select(max:max, "Choose any number of [W] Energy cards", energyFilter(W)).each {
                  def tar = my.all.select("Attach $it to")
                  attachEnergy(tar,it)
                  top.remove(it)
                }
              }
              top.discard()
            }
          }
          move "Aqua Press", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Water Energy attached to all Pokémon (both yours and your opponent's)."
            energyCost W, C
            onAttack {
              damage 20
              int extraDamage = 0
              all.each {
                extraDamage += it.cards.energyCount(W)
              }
              damage 10 * extraDamage
            }
          }
          move "Double Launcher", {
            text "Discard 2 [W] Energy attached to Blastoise. Choose 2 of your opponent's Benched Pokémon. This attack does 60 damage to each of them. Blastoise can’t use Double Launcher during your next turn."
            energyCost W, W, C, C
            attackRequirement {
              assert opp.bench : "Your opponent's bench is emtpy"
            }
            onAttack {
              multiSelect(opp.bench, 2, text).each{
                damage 60, it
              }
              discardSelfEnergyAfterDamage W, W
              cantUseAttack thisMove, self
            }
          }

        };
      case BLAZIKEN_3:
        return evolution (this, from:"Combusken", hp:HP130, type:FIRE, retreatCost:1) {
          weakness W, PLUS30
          pokePower "Fire Breath", {
            text "Once during your turn , you may choose 1 of the Defending Pokémon. That Pokémon is now Burned. This power can’t be used if Blaziken is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              apply BURNED, opp.active, SRC_ABILITY
            }
          }
          move "Clutch", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 40
              cantRetreat defending
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy attached to Blaziken."
            energyCost R, R, C
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage C, C
            }
          }

        };
      case DELCATTY_4:
        return evolution (this, from:"Skitty", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokePower "Power Circulation", {
            text "Once during your turn , you may search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put those cards on top of your deck in any order. If you do, put 2 damage counters on Delcatty. This power can’t be used if Delcatty is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByType(BASIC_ENERGY) : "You have no basic Energy cards in your discard"
              powerUsed()
              def list = rearrange(my.discard.select(max:2, cardTypeFilter(BASIC_ENERGY)))
              list.moveTo(addToTop : true, my.deck)
              directDamage 20, self, SRC_ABILITY
            }
          }
          move "Power Heal", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Delcatty. Then, remove 2 damage counters from Delcatty."
            energyCost C
            onAttack {
              damage 10 + 10 * self.numberOfDamageCounters
              heal 20, self
            }
          }
          move "Rear Kick", {
            text "60 damage. "
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }

        };
      case DIALGA_5:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          pokePower "Reverse Time", {
            text "Once during your turn, when you put Dialga from your hand onto your Bench, you may search your discard pile for up to 3 in any combination of Pokémon (excluding Pokémon LV.X) and basic Energy cards. Show them to your opponent and put them on top of your deck in any order."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.discard.find{(it.cardTypes.is(POKEMON) && !it.cardTypes.is(LVL_X)) || it.cardTypes.is(BASIC_ENERGY)} && confirm("Use Reverse Time?")) {
                powerUsed()
                def list = rearrange(my.discard.select(max:3, "Search your discard pile for up to 3 in any combination of Pokémon (excluding Pokémon LV.X) and basic Energy cards", {(it.cardTypes.is(POKEMON) && !it.cardTypes.is(LVL_X)) || it.cardTypes.is(BASIC_ENERGY)}))
                list.showToOpponent("Selected Cards").moveTo(addToTop : true, my.deck)
              }
            }
          }
          move "Time-Space Traveling", {
            text "50 damage. Draw cards until you have 7 cards in your hand."
            energyCost M, C, C
            onAttack {
              damage 50
              if(my.hand.size() < 7) {
                draw 7 - my.hand.size()
              }
            }
          }

        };
      case DIALGA_6:
        return basic (this, hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokeBody "Time Aura", {
            text "As long as Dialga is your Active Pokémon, your opponent can’t play any Pokémon from his or her hand to evolve his or her Active Pokémon."
            delayedA {
              def warnAndPrevent = {
                if (self.active && bg.currentTurn == self.owner.opposite) {
                  wcu "$self's Time Aura prevents playing Pokémon from your hand to evolve your Pokémon"
                  prevent()
                }
              }
              before EVOLVE, {
                if ((ef as Evolve).evolutionCard.player.pbg.hand.contains(ef.evolutionCard)) {
                  warnAndPrevent()
                }
              }
              before EVOLVE_STANDARD, {
                if ((ef as EvolveStandard).evolutionCard.player.pbg.hand.contains(ef.evolutionCard)) {
                  warnAndPrevent()
                }
              }
              before PLAY_EVOLUTION, {
                if ((ef as PlayEvolution).cardToPlay.player.pbg.hand.contains(ef.cardToPlay)) {
                  warnAndPrevent()
                }
              }
            }
          }
          move "Metal Burn", {
            text "100 damage. Discard all [M] Energy attached to Dialga."
            energyCost M, M, C, C
            onAttack {
              damage 100
              afterDamage {
                discardAllSelfEnergy(M)
              }
            }
          }

        };
      case DIALGA_G_7:
        return basic (this, hp:HP100, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Deafen", {
            text "10 damage. Your opponent can’t play any Trainer cards or Stadium cards from his or her hand during your opponent’s next turn."
            energyCost M, C
            onAttack {
              damage 10
              delayed {
                before PLAY_TRAINER, {
                  if ((ef.cardToPlay.cardTypes.is(ITEM) || ef.cardToPlay.cardTypes.is(STADIUM)) && bg.currentTurn == self.owner.opposite) {
                    wcu "Deafen prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Second Strike", {
            text "50+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost M, C, C
            onAttack {
              if (defending.numberOfDamageCounters >=2) {
                damage 20
              }
              damage 50
            }
          }

        };
      case GARDEVOIR_8:
        return evolution (this, from:"Kirlia", hp:HP120, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS30
          pokePower "Psychic Connect", {
            text "As often as you like during your turn , you may move a [P] Energy attached to 1 of your Benched Pokémon to your Active Pokémon. This power can’t be used if Gardevoir is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.bench.find{it.cards.filterByEnergyType(P)} : "You have no [P] Energy attached to your Benched Pokémon"
              powerUsed()
              moveEnergy(type: P, my.bench, my.active)
            }
          }
          move "Energy Burst", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to Gardevoir and the Defending Pokémon."
            energyCost P
            onAttack {
              damage 20 + 10 * self.cards.energyCount(C) + 10 * defending.cards.energyCount(C)
            }
          }
          move "Psychic Protection", {
            text "60 damage. Gardevoir has no Weakness during your opponent’s next turn."
            energyCost P, C, C
            onAttack {
              damage 60
              delayed {
                def eff
                register {
                  eff = getter (GET_WEAKNESSES, self) {h->
                    h.object.clear()
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 2
                after FALL_BACK, self, { unregister() }
                after EVOLVE, self, { unregister() }
                after DEVOLVE, self, { unregister() }
              }
            }
          }

        };
      case GIRATINA_9:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokePower "Let Loose", {
            text "Once during your turn, when you put Giratina from your hand onto your Bench, you may use this power. Each player shuffles his or her hand into his or her deck and draws up to 4 cards. (You draw your cards first.)"
            onActivate {r->
              if(r == PLAY_FROM_HAND && confirm("Use Let Loose?")) {
                powerUsed()
                my.hand.moveTo(hidden: true, my.deck)
                opp.hand.moveTo(hidden: true, opp.deck)
                shuffleDeck()
                shuffleDeck(null, TargetPlayer.OPPONENT)
                draw choose(1..4,"Let Loose: Draw how many cards?", 4)
                draw oppChoose(1..4,"Let Loose: Draw how many cards?", 4), TargetPlayer.OPPONENT
              }
            }
          }
          move "Earth Power", {
            text "60 damage. Flip 2 coins. This attack does 10 damage times the number of heads to each of your opponent’s Benched Pokémon."
            energyCost P, P, C
            onAttack {
              damage 60
              flip 2, {
                opp.bench.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case GIRATINA_10:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Over Slash", {
            text "This attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
            energyCost C, C
            onAttack {
              opp.all.each {
                damage 10, it
              }
            }
          }
          move "Dark Wing Flaps", {
            text "20 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost P, P
            onAttack {
              damage 20
              afterDamage {
                astonish()
              }
            }
          }
          move "Wrack Down", {
            text "60 damage. "
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        };
      case MANECTRIC_11:
        return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokeBody "Electric Barrier", {
            text "Prevent all damage done to your Benched Pokémon (excluding any Manectric) by attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.to.owner==self.owner && it.from.owner!=self.owner && it.to.benched && !it.to.name == "Manectric" && it.dmg.value && it.notNoEffect){
                  bc "Electric Barrier reduces damage"
                  it.dmg=hp(0)
                }}
              }
            }
          }
          move "Power Wave", {
            text "This attack does 30 damage to each Pokémon that has any Poké-Powers (both yours and your opponent's)."
            energyCost L
            onAttack {
              all.each {
                if(it.hasPokePower) {
                  damage 30, it
                }
              }
            }
          }
          move "Attract Current", {
            text "40 damage. Search your deck for a [L] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost C, C
            onAttack {
              damage 40
              attachEnergyFrom(type:L, my.deck, my.all)
            }
          }

        };
      case PALKIA_G_12:
        return basic (this, hp:HP100, type:WATER, retreatCost:2) {
          weakness L
          move "Splashing Turn", {
            text "20 damage. You may switch Palkia G with 1 of your Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 20
              switchYourActive(may:true)
            }
          }
          move "Pearl Breath", {
            text "50 damage. Does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, C, C
            onAttack {
              damage 50
              opp.bench.each {
                damage 10, it
              }
            }
          }

        };
      case RAMPARDOS_13:
        return evolution (this, from:"Cranidos", hp:HP130, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS30
          pokeBody "Iron Skull", {
            text "Rampardos’s attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            delayedA {
              before PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self){
                  bg.dm().each{
                    if (it.to.owner != self.owner && it.to.active) {
                      it.flags.addAll(DamageManager.DamageFlag.NO_DEFENDING_EFFECT, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS)
                    }
                  }
                }
              }
            }
          }
          move "Head Smash", {
            text "80 damage. If the Defending Pokémon would be Knocked Out by this attack, Rampardos does 40 damage to itself."
            energyCost F
            onAttack {
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs {
                  damage 40, self
                }
                unregisterAfter 1
              }
              damage 80
            }
          }
          move "Mold Breaker", {
            text "40 damage. Any damage done to Rampardos by attacks is reduced by 20 (after applying Weakness and Resistance) until the end of your next turn."
            energyCost F, C
            onAttack {
              damage 40
              afterDamage {// Can't use reduceDamageNextTurn as this effect needs to reduce recoil damage done by Head Smash
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.to == self && it.dmg.value && it.notNoEffect){
                        bc "${thisMove.name} : -20"
                        it.dmg-=hp(20)
                      }
                    }
                  }
                  unregisterAfter 3
                  after FALL_BACK, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()}
                }
              }
            }
          }

        };
      case SHAYMIN_14:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Flower Aroma", {
            text "10 damage. Remove 2 damage counters from Shaymin. The Defending Pokémon is now Asleep."
            energyCost G
            onAttack {
              damage 10
              heal 20, self
              applyAfterDamage ASLEEP
            }
          }
          move "Damage Aid", {
            text "30+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 30 damage plus 50 more damage. Then, remove all Special Conditions from the Defending Pokémon."
            energyCost G, C
            onAttack {
              damage 30
              if(defending.specialConditions) {
                damage 50
                clearSpecialCondition defending
              }
            }
          }

        };
      case SHAYMIN_15:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Growth", {
            text "Attach a [G] Energy card from your hand to Shaymin."
            energyCost G
            attackRequirement {
              assert my.hand.filterByEnergyType(G) : "You have no [G] Energy cards in your hand"
            }
            onAttack {
              attachEnergyFrom(type:G, my.hand, self)
            }
          }
          move "Air Slash", {
            text "40 damage. Flip a coin. If tails, discard an Energy attached to Shaymin."
            energyCost C, C
            onAttack {
              damage 40
              flip 1, {}, {
                discardSelfEnergyAfterDamage C
              }
            }
          }

        };
      case SLAKING_16:
        return evolution (this, from:"Vigoroth", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS30
          def flag = -1
          customAbility {
            delayed {
              before ATTACK_MAIN, {
                if(ef.attacker == self) {
                  flag = bg.turnCount + 2
                }
              }
            }
          }
          pokeBody "Lazy Paunch", {
            text "If Slaking used any attacks during your last turn, Slaking can’t attack."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if(ef.attacker == self && flag == bg.turnCount) {
                  wcu "Lazy Paunch prevents attacking"
                  prevent()
                }
              }
            }
          }
          move "Best Dash", {
            text "150 damage. During your opponent's next turn, any damage done to Slaking by attacks is increased by 50 (after applying Weakness and Resistance)."
            energyCost C, C, C, C
            onAttack {
              damage 150
              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.to == self && it.dmg.value && it.notNoEffect){
                        bc "${thisMove.name} +50"
                        it.dmg+=hp(50)
                      }
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()}
                }
              }
            }
          }

        };
      case WEAVILE_G_17:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:0) {
          weakness F
          resistance P, MINUS20
          move "Call for Family", {
            text "Search your deck for up to 2 basic Pokémon SP and put them onto your Bench. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount,2)
              my.deck.search (max: maxSpace,{it.cardTypes.is(BASIC) && it.cardTypes.is(POKEMON_SP)}).each{
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Team Attack", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Pokémon SP you have in play."
            energyCost D, C, C
            onAttack {
              damage 10 + 10 * my.all.findAll{it.topPokemonCard.cardTypes.is(POKEMON_SP)}.size()
            }
          }

        };
      case ALTARIA_18:
        return evolution (this, from:"Swablu", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          def pokeFlag = false
          def turnFlag = -1
          move "Midnight Eyes", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              damage 20
              turn flag = bg.turnCount + 2
              pokeFlag = true
              delayed {
                unregisterAfter 3
                after FALL_BACK, pcs, {
                  pokeFlag = false
                  unregister()
                }
                after EVOLVE, pcs, {
                  pokeFlag = false
                  unregister()
                }
                after DEVOLVE, pcs, {
                  pokeFlag = false
                  unregister()
                }
              }
            }
          }
          move "Perish Song", {
            text "If the Defending Pokémon is Asleep and was damaged or affected by Midnight Eyes during your last turn, the Defending Pokémon is Knocked Out."
            energyCost C, C
            attackRequirement {
              assert defending.isSPC(ASLEEP) : "The defending Pokémon is not asleep"
              assert pokeFlag && turnFlag == bg.turnCount : "The defending Pokémon was not damaged or affected by Midnight Eyes during your last turn"
            }
            onAttack {
              targeted (defending) {
                new Knockout(defending).run(bg)
              }
            }
          }
          move "Healing Song", {
            text "40 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost C, C
            onAttack {
              damage 40
              my.all.each {
                heal 10, it
              }
            }
          }

        };
      case BANETTE_19:
        return evolution (this, from:"Shuppet", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Temper Tantrum", {
            text "Once during your turn , you may discard as many cards as you like from your hand. If you do, put that many damage counters on Banette. This power can’t be used if Banette is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand : "Your hand is empty"
              powerUsed()
              directDamage 10 * my.hand.select(min:0,max:my.hand.size(),"Discard as many cardsas you like from your hand").discard().size(), self, SRC_ABILITY
            }
          }
          move "Darkness Switch", {
            text "Discard an Energy card attached to Banette, and then switch all damage counters on Banette with those on the Defending Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost P
            attackRequirement {
              assert self.cards.filterByType(ENERGY) : "You have no Energy cards to discard"
            }
            onAttack {
              targeted (opp.active) {
                def tmp = opp.active.damage;
                opp.active.damage = self.damage;
                self.damage = tmp;
                checkFaint()
              }
            }
          }
          move "Loneliness", {
            text "30+ damage. You may show your hand to your opponent. If you do and if you don’t have any Pokémon in your hand, this attack does 30 damage plus 30 more damage."
            energyCost P, C
            onAttack {
              damage 30
              if(confirm("Show your hand to your opponent?")) {
                my.hand.showToOpponent("Your opponent's hand")
                if(!my.hand.filterByType(POKEMON)) {
                  damage 30
                }
              }
            }
          }

        };
      case BASTIODON_20:
        return evolution (this, from:"Shieldon", hp:HP130, type:METAL, retreatCost:4) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokeBody "Metal Trait", {
            text "As long as Bastiodon has a Pokémon Tool card attached to it, remove 1 damage counter from Bastiodon between turns."
            delayedA{
              before BEGIN_TURN, {
                if (self.numberOfDamageCounters && self.cards.filterByType(POKEMON_TOOL)) {
                  bc "Metal Trait activates"
                  heal 10, self
                }
              }
            }
          }
          move "Iron Defense", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Bastiodon during your opponent’s next turn."
            energyCost M, M, C
            onAttack {
              damage 30
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Iron Tackle", {
            text "80 damage. Bastiodon does 30 damage to itself."
            energyCost M, M, C, C
            onAttack {
              damage 80
              damage 30, self
            }
          }

        };
      case BEAUTIFLY_21:
        return evolution (this, from:"Silcoon", hp:HP120, type:GRASS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Colorful Powder", {
            text "20+ damage. If Beautifly has 2 or less Energy attached to it, the Defending Pokémon is now Poisoned. If Beautifly has 3 Energy attached to it, the Defending Pokémon is now Burned and Poisoned. If Beautifly has 4 or more Energy attached to it, this attack does 20 damage plus 40 more damage and the Defending Pokémon is now Asleep, Burned, and Poisoned."
            energyCost G
            onAttack {
              damage 20
              applyAfterDamage POISONED
              if(self.cards.energyCount(C) >= 3) {
                applyAfterDamage BURNED
              }
              if(self.cards.energyCount(C) >= 4) {
                damage 40
                applyAfterDamage ASLEEP
              }
            }
          }
          move "Silver Scale", {
            text "30 damage. If the Defending Pokémon has any Resistance, this attack’s base damage is 60 damage instead of 30."
            energyCost G
            onAttack {
              damage 30
              if(defending.resistances) {
                damage 30
              }
            }
          }

        };
      case BLISSEY_22:
        return evolution (this, from:"Chansey", hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS30
          pokePower "Nurse Call", {
            text "Once during your turn , you may discard a card from your hand. If you do, remove 2 damage counters from 1 of your Pokémon. You can’t use more than 1 Nurse Call Poké-Power each turn. This power can’t be used if Blissey is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand : "Your hand is empty"
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
              assert bg.em().retrieveObject("Nurse_Call") != bg.turnCount : "You cannot use Nurse Call more than once per turn"
              powerUsed()
              my.hand.select("Choose a card to discard").discard()
              heal 20, my.all.findAll(it.numberOfDamageCounters).select("Heal which Pokémon"), SRC_ABILITY
            }
          }
          move "Return", {
            text "20 damage. Draw cards until you have 6 cards in your hand."
            energyCost C
            onAttack {
              damage 20
              if(my.hand.size() < 6) {
                draw 6 - my.hand.size()
              }
            }
          }
          move "Double-edge", {
            text "100 damage. Blissey does 60 damage to itself."
            energyCost C, C, C, C
            onAttack {
              damage 100
              damage 60, self
            }
          }

        };
      case DIALGA_23:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Energy Stream", {
            text "20 damage. Flip a coin. If heads, search your discard pile for a basic Energy card and attach it to Dialga."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                afterDamage {
                  attachEnergyFrom(basic: true, my.discard, self)
                }
              }
            }
          }
          move "Diamond Blow", {
            text "100 damage. Dialga can’t attack during your next turn."
            energyCost M, M, M, C
            onAttack {
              damage 100
              cantAttackNextTurn self
            }
          }

        };
      case DUGTRIO_24:
        return evolution (this, from:"Diglett", hp:HP090, type:FIGHTING, retreatCost:0) {
          weakness W, PLUS20
          resistance L, MINUS20
          pokeBody "Sinkhole", {
            text "If your opponent’s Active Pokémon retreats, put 2 damage counters on that Pokémon."
            delayedA {
              after RETREAT, {
                if(ef.retreater.owner == self.owner.opposite && ef.newActive != null){
                  directDamage 20, ef.retreater, SRC_ABILITY
                }
              }
            }
          }
          move "Push Down", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C
            onAttack {
              damage 30
              whirlwind()
            }
          }
          move "Magnitude", {
            text "70 damage. Does 10 damage to each Benched Pokémon (both yours and your opponent's)."
            energyCost F, F, C
            onAttack {
              damage 70
              my.bench.each {
                damage 10, it
              }
              opp.bench.each {
                damage 10, it
              }
            }
          }

        };
      case DUSTOX_25:
        return evolution (this, from:"Cascoon", hp:HP130, type:PSYCHIC, retreatCost:0) {
          weakness R, PLUS30
          pokeBody "Camouflage Pattern", {
            text "Prevent all effects of attacks, including damage, done to Dustox by your opponent’s Pokémon that is affected by 2 or more Special Conditions."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.specialConditions.size() >= 2 && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.specialConditions.size() >= 2){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(efs.from.specialConditions.size() >= 2 && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
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
          move "Chemical Scale", {
            text "60 damage. If the Defending Pokémon has any Poké-Powers or Poké-Bodies, the Defending Pokémon is now Burned and Confused."
            energyCost G, C, C
            onAttack {
              damage 60
              if(defending.hasPokePower || defending.hasPokeBody) {
                applyAfterDamage BURNED
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case EMPOLEON_26:
        return evolution (this, from:"Prinplup", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Knock Off", {
            text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost W, C
            onAttack {
              damage 40
              afterDamage {
                discardRandomCardFromOpponentsHand()
              }
            }
          }
          move "Jet Smash", {
            text "Choose 1 of your opponent's Pokémon. This attack does 70 damage to that Pokémon. Empoleon can’t use Jet Smash during your next turn."
            energyCost W, C, C
            onAttack {
              damage 70, opp.all.select()
              cantUseAttack thisMove, self
            }
          }

        };
      case GIRATINA_27:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Strafe", {
            text "20 damage. You may switch Giratina with 1 of your Benched Pokémon."
            energyCost P, C
            onAttack {
              damage 20
              switchYourActive(may: true)
            }
          }
          move "Broken-space Blow", {
            text "50 damage. If the Defending Pokémon is Knocked Out by this attack, put the Defending Pokémon and all cards attached to in the Lost Zone instead of the discard pile."
            energyCost P, C, C
            onAttack {
              damage 50
              delayed {
                def knockedOut = null
                before KNOCKOUT, {
                  if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner && self.active && ef.pokemonToBeKnockedOut == defending ) {
                    knockedOut = ef.pokemonToBeKnockedOut.cards.copy()
                  }
                }
                after KNOCKOUT, {
                  if (knockedOut) {
                    bc "Broken-space Blow puts all cards into the Lost Zone."
                    knockedOut.moveTo(self.owner.opposite.pbg.lostZone)
                    knockedOut = null
                  }
                }
                unregisterAfter 1
              }
            }
          }

        };
      case GIRATINA_28:
        return basic (this, hp:HP110, type:PSYCHIC, retreatCost:2) {
          weakness D
          resistance C, MINUS20
          move "Dragon Claw", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Dragonbreath", {
            text "80 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P, P, C
            onAttack {
              flip {
                damage 80
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case GOLDUCK_29:
        return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          move "Swim", {
            text "30 damage. If your opponent has any [W] Energy attached to any of his or her Pokémon, you may do 30 damage to any 1 Benched Pokémon instead."
            energyCost W
            onAttack {
              if(opp.all.find{it.cards.filterByEnergyType(W)}) {
                damage 30, opp.all.select()
              } else {
                damage 30
              }
            }
          }
          move "Water Slide", {
            text "40+ damage. You may move all Energy cards attached to Golduck to 1 of your Benched Pokémon. If you do, this attack does 40 damage plus 20 more damage."
            energyCost W, C
            onAttack {
              damage 40
              if(confirm("Move all Energy cards attached to $self to 1 of your benched Pokémon?")) {
                damage 20
                afterDamage {
                  def tar = my.all.select("Move all Energy cards to")
                  self.cards.filterByType(ENERGY).each {
                    energySwitch(self,tar,it)
                  }
                }
              }
            }
          }

        };
      case GYARADOS_G_30:
        return basic (this, hp:HP110, type:WATER, retreatCost:3) {
          weakness L
          move "Wriggle", {
            text "Flip a coin for each of your opponent’s Pokémon. If that coin flip is heads, this attack does 30 damage to that Pokémon."
            energyCost W, C, C
            onAttack {
              opp.all.each {tar ->
                bc "$tar"
                flip {
                  damage 30, tar
                }
              }
            }
          }
          move "Dwindling Wave", {
            text "100- damage. Does 100 damage minus 10 damage for each damage counter on Gyarados G."
            energyCost W, W, C, C
            attackRequirement {
              assert self.numberOfDamageCounters < 10 : "Dwindling Wave will deal no damage"
            }
            onAttack {
              damage 100 - 10 * self.numberOfDamageCounters
            }
          }

        };
      case INFERNAPE_31:
        return evolution (this, from:"Monferno", hp:HP110, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          move "Rushing Flames", {
            text "80× damage. Discard as many [R] Energy cards as you like attached to your Pokémon in play. Flip a coin for each Energy card you discarded. This attack does 80 damage times the number of heads."
            energyCost R, R
            attackRequirement {
              assert my.all.find{it.cards.filterByEnergyType(R)} : "You have no [R] Energy cards attached to your Pokémon in play"
            }
            onAttack {
              def count = 0
              def toBeMoved = new CardList()
              while (1) {
                def tar = my.all.findAll { it.cards.filterByEnergyType(R).find { !toBeMoved.contains(it) } }
                if (!tar) break
                def pcs = tar.select("Pokémon that has [R] energy to discard. Cancel to stop", false)
                if (!pcs) break
                def dd = pcs.cards.filterByEnergyType(R).findAll { !toBeMoved.contains(it) }.select("[R] Energy to discard")
                toBeMoved.addAll(dd)
                count++
              }
              flip count, {
                damage 80
              }
              afterDamage { toBeMoved.discard() }
            }
          }
          move "Rage", {
            text "30+ damage. Does 30 damage plus 10 more damage for each damage counter on Infernape."
            energyCost C, C
            onAttack {
              damage 30 + 10 * self.numberOfDamageCounters
            }
          }

        };
      case KRICKETUNE_32:
        return evolution (this, from:"Kricketot", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Revenge Melody", {
            text "20× damage. Does 20 damage times the number of Kricketot and Kricketune in your discard pile."
            energyCost C, C
            attackRequirement {
              assert my.discard.find{it.name == "Kricketot" || it.name == "Kricketune"} : "You have no Kricketot or Kricketune in your discard pile"
            }
            onAttack {
              damage 20 * my.discard.findAll{it.name == "Kricketot" || it.name == "Kricketune"}.size()
            }
          }
          move "Bug Buzz", {
            text "50+ damage. If the Defending Pokémon is Asleep, this attack does 50 damage plus 30 more damage. Remove the Special Condition Asleep from the Defending Pokémon."
            energyCost G, G
            onAttack {
              damage 50
              if(defending.isSPC(ASLEEP)) {
                damage 30
                clearSpecialCondition(defending, ATTACK, [ASLEEP])
              }
            }
          }

        };
      case LICKILICKY_33:
        return evolution (this, from:"Lickitung", hp:HP120, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS20
          move "Harrumph", {
            text "Choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Before doing damage, discard all Trainer cards attached to that Pokémon."
            energyCost C, C, C
            onAttack {
              def tar = opp.all.select()
              targeted(tar) {
                tar.cards.filterByType(ITEM).discard()
              }
              damage 40, tar
            }
          }
          move "Body Press", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C, C
            onAttack {
              damage 60
              flip {
                applyAfterDamage PARALYZED
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case LUDICOLO_34:
        return evolution (this, from:"Lombre", hp:HP120, type:GRASS, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Cheerful Voice", {// TODO: Use a stored object to end the turn if the effect is blocked https://compendium.pokegym.net/compendium-bw.html#4
            text "Once during your turn , you may use this power. If you do, your turn ends. During your next turn, each of Ludicolo’s attacks does 60 more damage to the Defending Pokémon . This power can’t be used if Ludicolo is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              delayed {
                def registeredOn=0
                after PROCESS_ATTACK_EFFECTS, {
                  if(bg.turnCount!=registeredOn){
                    bg.dm().each {if(it.from==self && it.dmg.value){
                      bc "Cheerfull Voice does +60 to ${it.to}"
                      it.dmg+=hp(60)
                    }}
                  }
                }
                unregisterAfter 3
                after FALL_BACK, self, {unregister()}
                after EVOLVE, self, {unregister()}
                after DEVOLVE, self, {unregister()}
                register{registeredOn=bg.turnCount}
              }
            }
          }
          move "Mad Dance", {
            text "20 damage. The Defending Pokémon is now Confused."
            energyCost W, C
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Best Dance", {
            text "60 damage. After doing damage, remove from Ludicolo the number of damage counters equal to the damage you did to the Defending Pokémon. Ludicolo can’t use Best Dance during your next turn."
            energyCost G, C, C
            onAttack {
              damage 60
              removeDamageCounterEqualToDamageDone()
              cantUseAttack thisMove, self
            }
          }

        };
      case LUVDISC_35:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Love Call", {
            text "Choose 1 of your opponent’s Pokémon. Search your deck for a Pokémon that is the same type as the Pokémon you chose, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def tar = opp.all.select()
              def info
              TypeSet ts = new TypeSet()
              ts.addAll(tar.types)
              if(tar.types.size() == 1) {
                info = "Search your deck for a ${tar.types[0]} Pokémon"
              } else if(tar.types.size() == 2) {
                info = "Search your deck for a ${tar.types[0]}, or ${tar.types[1]} Pokémon"
              } else {
                info = "Search your deck for a "
                (1..tar.types.size()-1).each {
                  info += "${tar.types[it-1]}, "
                }
                info += "or ${tar.types[tar.types.size()-1]} Pokémon"
              }
              my.deck.search(info, {it.cardTypes.is(POKEMON) && it.asPokemonCard().types.containsAny(ts)}).showToOpponent("Opponent used love call").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Sweet Kiss", {
            text "30 damage. Your opponent may draw a card."
            energyCost W
            onAttack {
              damage 30
              afterDamage {
                if (opp.deck && oppConfirm("Sweet Kiss: Draw a card")) {
                  draw(1, TargetPlayer.OPPONENT)
                }
              }
            }
          }

        };
      case NINETALES_36:
        return evolution (this, from:"Vulpix", hp:HP090, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Flame Bash", {
            text "Flip a coin until you get tails. Search your deck for a number of basic [R] Energy cards up to the number of heads and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost R
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def count = 0
              flipUntilTails {
                count ++
              }
              if(count > 0) {
                def energys = my.deck.search(max:count,"Search your deck for up to $count basic [R] Energy cards",basicEnergyFilter(R))
                count = 1
                energys.each {
                  def tar = my.all.select("Attach [R] Energy ($count/${energys.size()}) to")
                  attachEnergy(tar, it)
                }
              }
              shuffleDeck()
            }
          }
          move "Mysterious Flames", {
            text "40 damage. If you have more Energy in play than your opponent, the Defending Pokémon is now Burned and Confused."
            energyCost R, C
            onAttack {
              damage 40
              def myCount = 0
              def oppCount = 0
              my.all.each {
                myCount += it.cards.energyCount(C)
              }
              opp.all.each {
                oppCount += it.cards.energyCount(C)
              }
              if(myCount > oppCount) {
                applyAfterDamage BURNED
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case PALKIA_37:
        return basic (this, hp:HP100, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Tsunami", {
            text "10 damage. Does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 10
              opp.bench.each {
                damage 10, it
              }
            }
          }
          move "Water Pulse", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, W, C
            onAttack {
              damage 60
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case SHAYMIN_38:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Energy Blow", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Shaymin."
            energyCost ()
            onAttack {
              damage 10 + 10 * self.cards.energyCount(C)
            }
          }
          move "Aromatherapy", {
            text "40 damage. Remove 2 damage counters from each of your Pokémon."
            energyCost G, C, C
            onAttack {
              damage 40
              my.all.each {
                heal 20, it
              }
            }
          }

        };
      case TORTERRA_39:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          move "Green Blast", {
            text "40+ damage. Does 40 damage plus 10 more damage for each [G] Energy attached to all of your Pokémon."
            energyCost G, C, C
            onAttack {
              damage 40
              def count = 0
              my.all.each {
                count += it.cards.energyCount(G)
              }
            }
          }
          move "Soothing Scent", {
            text "80 damage. The Defending Pokémon is now Asleep."
            energyCost G, G, C, C
            onAttack {
              damage 80
              applyAfterDamage ASLEEP
            }
          }

        };
      case TOXICROAK_G_40:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Anticipation", {
            text "Prevent all effects of attacks, excluding damage, done to Toxicroak ."
            delayedA {
              before null, null, ATTACK, {
                if (ef instanceof TargetedEffect && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && (ef as TargetedEffect).getResolvedTarget(bg, e) == self) {
                  bc "Anticipation prevents all effects done to $self."
                  prevent()
                }
              }
            }
          }
          move "Deep Poison", {
            text "20+ damage. If the Defending Pokémon is Poisoned, this attack does 20 damage plus 40 more damage."
            energyCost P, C
            onAttack {
              damage 20
              if(defending.isSPC(POISONED)) {
                damage 40
              }
            }
          }

        };
      case BRONZONG_G_41:
        return basic (this, hp:HP090, type:METAL, retreatCost:3) {
          weakness P
          resistance R, MINUS20
          pokeBody "Galactic Switch", {
            text "Once during your turn (before your attack), you may move an Energy card attached to one of your Pokémon SP to another of your Pokémon. Then, put 2 damage counters on Bronzong G. This power can't be used if Bronzong G is affected by a Special Condition. "
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.findAll{it.topPokemonCard.cardTypes.is(POKEMON_SP) && it.cards.filterByType(ENERGY)}: "You have no Energy cards attached to your Pokémon SP"
              powerUsed()
              def src = my.all.findAll{it.topPokemonCard.cardTypes.is(POKEMON_SP) && it.cards.filterByType(ENERGY)}.select("Move an Energy card from")
              def card = src.cards.select("Choose the Energy card to move",cardTypeFilter(ENERGY)).first()
              def tar = my.all.findAll{it!=src}.select("Move $card to")
              energySwitch(src, tar, card)
              directDamage 20, self, SRC_ABILITY
            }
          }
          move "Psychic Pulse", {
            text "40 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost M, C, C
            onAttack {
              damage 40
              opp.bench.each {
                if(it.numberOfDamageCounters) {
                  damage 10, it
                }
              }
            }
          }

        };
      case CACTURNE_42:
        return evolution (this, from:"Cacnea", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Spike Wound", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 50 damage to that Pokémon."
            energyCost C, C
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "Your opponent's Pokémon have no damage counters on them"
            }
            onAttack {
              damage 50, opp.all.findAll{it.numberOfDamageCounters}.select("Choose 1 of your opponent's Pokémon that has any damage counters on it")
            }
          }
          move "Poison Experiment", {
            text "20 damage. You may discard a [G] or [D] Energy attached to Cacturne. If you discard a [G] Energy, the Defending Pokémon is now Poisoned. If you discard a [D] Energy, the Defending Pokémon is now Paralyzed."
            energyCost G, D
            onAttack {
              damage 20
              if(self.cards.filterByEnergyType(G) || self.cards.filterByEnergyType(G) && confirm("Discard a [G] or [D] Energy attached to Cacturne?")) {
                def energy = self.cards.select("Choose an Energy to discard", {it.cardTypes.is(ENERGY) && (it.asEnergyCard().containsType(G) || it.asEnergyCard().containsType(D))}).first()
                if(energy.asEnergyCard().containsType(G)) {
                  applyAfterDamage POISONED
                }
                if(energy.asEnergyCard().containsType(D)) {
                  applyAfterDamage PARALYZED
                }
                afterDamage {
                  discard(energy)
                }
              }
            }
          }

        };
      case CARNIVINE_43:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Stretch Vine", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them."
            energyCost G
            attackRequirement {
              assert opp.bench : "Your opponent has no benched Pokémon"
            }
            onAttack {
              multiSelect(opp.bench, 2, text).each {
                damage 10, it
              }
            }
          }
          move "Absorb", {
            text "20 damage. Remove 2 damage counters from Carnivine."
            energyCost C, C
            onAttack {
              damage 20
              heal 20, self
            }
          }
          move "Vine Extract", {
            text "30 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Burned and Poisoned."
            energyCost G, G
            onAttack {
              if(defending.numberOfDamageCounters) {
                applyAfterDamage BURNED
                applyAfterDamage POISONED
              }
              damage 30
            }
          }

        };
      case CASCOON_44:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          move "Ascension", {
            text "Search your deck for a card that evolves from Cascoon and put it onto Cascoon. (This counts as evolving Cascoon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
          move "Poison Thread", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }

        };
      case COMBUSKEN_45:
        return evolution (this, from:"Torchic", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Firebreathing", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost R, C
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
          move "High Jump Kick", {
            text "60 damage. "
            energyCost R, C, C
            onAttack {
              damage 60
            }
          }

        };
      case CRANIDOS_46:
        return evolution (this, from:"Skull Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Rock Smash", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F
            onAttack {
              damage 20
              flip { damage 20 }
            }
          }
          move "Knock Over", {
            text "40 damage. You may discard any Stadium card in play."
            energyCost F, C
            onAttack {
              damage 40
              if(bg.stadiumInfoStruct && confirm("Discard $bg.stadiumInfoStruct.stadiumCard.name")) {
                afterDamage {
                  discard(bg.stadiumInfoStruct.stadiumCard)
                }
              }
            }
          }

        };
      case CROBAT_G_47:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          pokePower "Flash Bite", {
            text "Once during your turn, when you put Crobat from your hand onto your Bench, you may put 1 damage counter on 1 of your opponent’s Pokémon."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm("Use Flash Bite?")) {
                directDamage 10, opp.all.select(), SRC_ABILITY
              }
            }
          }
          move "Toxic Fang", {
            text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost P, C
            onAttack {
              apply POISONED
              extraPoison 1
            }
          }

        };
      case FLAAFFY_48:
        return evolution (this, from:"Flaaffy", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Spark", {
            text "10 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost L
            onAttack {
              damage 10
              if(opp.bench) {
                multiSelect(opp.bench,2,text).each {
                  damage 10, it
                }
              }
            }
          }
          move "Tail Code", {
            text "30 damage. Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost L, C
            onAttack {
              damage 30
              def card = defending.cards.select("Choose an Energy card to move",cardTypeFilter(ENERGY))
              def tar = opp.bench.select("Choose the pokémon to receive the energy")
              energySwitch(defending,tar,card)
            }
          }

        };
      case GROTLE_49:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Absorb", {
            text "30 damage. Remove 1 damage counter from Grotle."
            energyCost G, C
            onAttack {
              damage 30
              heal 10, self
            }
          }
          move "Razor Leaf", {
            text "60 damage. "
            energyCost G, G, C
            onAttack {
              damage 60
            }
          }

        };
      case HOUNDOOM_G_50:
        return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Black Cry", {
            text "20 damage. The Defending Pokémon can’t retreat or use any Poké-Powers during your opponent’s next turn."
            energyCost D, C
            onAttack {
              damage 20
              cantRetreat defending
              delayed {
                def eff
                register{
                  eff = getter (IS_ABILITY_BLOCKED) { Holder h ->
                    if (h.effect.target.owner == self.owner.opposite && h.effect.ability instanceof PokePower) {
                      h.object=true
                    }
                  }
                  new CheckAbilities().run(bg)
                }
                unregister{
                  eff.unregister()
                  new CheckAbilities().run(bg)
                }
                unregisterAfter 2
              }
            }
          }
          move "Dark Slash", {
            text "40+ damage. You may discard a [D] Energy attached to Houndoom G. If you do, this attack does 40 damage plus 20 more damage."
            energyCost D, C, C
            onAttack {
              damage 40
              if(confirm("Discard a [D] Energy attached to Houndoom G?")) {
                damage 20
                discardSelfEnergyAfterDamage D
              }
            }
          }

        };
      case KIRLIA_51:
        return evolution (this, from:"Ralts", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Teleportation Burst", {
            text "30 damage. You may switch Kirlia with 1 of your Benched Pokémon."
            energyCost P, C
            onAttack {
              damage 30
              switchYourActive(may:true)
            }
          }
          move "Super Psy Bolt", {
            text "60 damage. "
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        };
      case LOMBRE_52:
        return evolution (this, from:"Lotad", hp:HP080, type:GRASS, retreatCost:1) {
          weakness L, PLUS20
          move "Interrupt", {
            text "20 damage. Flip a coin. If heads, look at your opponent's hand and choose 1 card, then have your opponent shuffle that card into his or her deck."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                opp.hand.shuffledCopy().select("Choose a card to shuffle into your opponent's deck").moveTo(opp.deck)
                shuffleDeck null, TargetPlayer.OPPONENT
              }
            }
          }
          move "Gentle Slap", {
            text "60 damage. "
            energyCost G, C, C
            onAttack {
              damage 60
            }
          }

        };
      case LUCARIO_53:
        return evolution (this, from:"Riolu", hp:HP090, type:METAL, retreatCost:0) {
          weakness R, PLUS20
          move "Aura Sphere", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost M
            onAttack {
              damage 30
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }
          move "Do the Wave", {
            text "20+ damage. Does 20 damage plus 10 more damage for each of your Benched Pokémon."
            energyCost M, C
            onAttack {
              damage 20 + 10 * my.bench.size()
            }
          }

        };
      case MIGHTYENA_54:
        return evolution (this, from:"Poochyena", hp:HP090, type:DARKNESS, retreatCost:0) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokeBody "Cold Feet", {
            text "If Mightyena is affected by a Special Condition, ignore all Energy necessary to use Mightyena’s attacks."
            getterA GET_MOVE_LIST, BEFORE_LAST, self, {h->
              def list=[]
              for(move in h.object){
                def copy=move.shallowCopy()
                if(self.specialConditions){
                  copy.energyCost.retainAll()
                }
                list.add(copy)
              }
              h.object=list
            }
          }
          move "Collude", {
            text "20+ damage. If you played any Supporter card from your hand during this turn, this attack does 20 damage plus 20 more damage."
            energyCost D, C
            onAttack {
              damage 20
              if (bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) {
                damage 20
              }
            }
          }
          move "Desperate Attack", {
            text "50+ damage. If Mightyena has less Energy attached to it than the Defending Pokémon, this attack does 50 damage plus 30 more damage."
            energyCost D, D, C
            onAttack {
              damage 50
              if(self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 30
              }
            }
          }

        };
      case MISMAGIUS_55:
        return evolution (this, from:"Misdreavus", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Upper Hand", {
            text "30 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost P
            onAttack {
              damage 30
              amnesia delegate
            }
          }
          move "Psybeam", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P, C, C
            onAttack {
              damage 60
              flip {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case MONFERNO_56:
        return evolution (this, from:"Chimchar", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Fire Tail Slap", {
            text "40 damage. Flip a coin. If tails, discard a [R] Energy attached to Monferno."
            energyCost R, R
            onAttack {
              damage 40
              flip {
                discardSelfEnergyAfterDamage R
              }
            }
          }
          move "Paralyzing Gaze", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                apply PARALYZED
              }
            }
          }

        };
      case MUK_57:
        return evolution (this, from:"Grimer", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          pokeBody "Sludge Cell", {
            text "If Muk remains affected by any Special Conditions between turns, remove 2 damage counters from Muk."
            delayedA {
              before BEGIN_TURN, {
                if(self.specialCondition) {
                  heal 20, self, SRC_ABILITY
                }
              }
            }
          }
          move "Strange Poison", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, Muk is now Poisoned."
            energyCost P, C
            onAttack {
              damage 30
              flip 1, {
                applyAfterDamage POISONED
              }, {
                afterDamage {
                  apply POISONED, self
                }
              }
            }
          }
          move "Strange Sludge", {
            text "50+ damage. If Muk is Poisoned, this attack does 50 damage plus 20 more damage and the Defending Pokémon is now Confused."
            energyCost P, P, C
            onAttack {
              damage 50
              if(self.isSPC(POISONED)) {
                damage 20
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case OCTILLERY_58:
        return evolution (this, from:"Remoraid", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Water Vein", {
            text "50× damage. Reveal the top 5 cards of your deck. Flip a coin for each Energy card you find there. This attack does 50 damage times the number of heads. Shuffle the revealed cards back into your deck."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              damage 50 * my.deck.subList(0,5).showToMe("Top 5 cards of your deck").showToOpponent("Top 5 cards of your opponent's deck").filterByType(ENERGY).size()
              shuffleDeck()
            }
          }
          move "Octazooka", {
            text "40 damage. Any time the Defending Pokémon tries to attack, your opponent flips a coin. If tails, that attack does nothing. (If the Defending Pokémon is no longer your opponent’s Active Pokémon, this effect ends.)"
            energyCost W, W
            onAttack {
              damage 40
              sandAttack(thisMove)
            }
          }

        };
      case PRINPLUP_59:
        return evolution (this, from:"Piplup", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Surf", {
            text "30 damage. "
            energyCost W
            onAttack {
              damage 30
            }
          }
          move "Bubblebeam", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            onAttack {
              damage 50
              flip {
                apply PARALYZED
              }
            }
          }

        };
      case PROBOPASS_60:
        return evolution (this, from:"Nosepass", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          move "Stealth Rock", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost F, C
            onAttack {
              damage 30, opp.all.select()
            }
          }
          move "Hyper Beam", {
            text "70 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 70
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case SEVIPER_61:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Shed Skin", {
            text "Remove 4 damage counters from Seviper."
            energyCost ()
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              heal 40, self
            }
          }
          move "Bite and Escape", {
            text "20 damage. You may switch Seviper with 1 of your Benched Pokémon."
            energyCost P
            onAttack {
              damage 20
              switchYourActive(may: true)
            }
          }
          move "Paralyze Poison", {
            text "40 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost P, C, C
            onAttack {
              damage 40
              applyAfterDamage POISONED
              flip {
                PARALYZED
              }
            }
          }

        };
      case SHIELDON_62:
        return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Endure", {
            text "Flip a coin. If heads, during your opponent’s next turn, if Shieldon would be Knocked Out by damage from an attack, Shieldon is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost C
            onAttack {
              flip{
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
                  after DEVOLVE, self, {unregister()}
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
          move "Rock Slide", {
            text "30 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }

        };
      case SILCOON_63:
        return evolution (this, from:"Wurmple", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Ascension", {
            text "Search your deck for a card that evolves from Silcoon and put it onto Silcoon. (This counts as evolving Silcoon.) Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
          move "Sticky String", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case VIGOROTH_64:
        return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Reckless Charge", {
            text "30 damage. Flip a coin. If tails, Vigoroth does 10 damage to itself."
            energyCost C
            onAttack {
              damage 30
              flip 1, {}, {
                damage 10, self
              }
            }
          }
          move "Fight Back", {
            text "50+ damage. If Vigoroth has any damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost C, C, C
            onAttack {
              damage 50
              if(self.numberOfDamageCounters) {
                damage 20
              }
            }
          }

        };
      case WARTORTLE_65:
        return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Double Slap", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }
          move "Rocket Tackle", {
            text "30 damage. Wartortle does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Wartortle by attacks during your opponent’s next turn."
            energyCost W, C
            onAttack {
              damage 30
              damage 10, self
              flip {
                preventAllDamageNextTurn()
              }
            }
          }

        };
      case ZANGOOSE_66:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Thick Skin", {
            text "Zangoose can’t be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION, self, {
                bc ("$self is thick Skinned!")
                prevent()
              }
            }
            onActivate {
              if(self.specialConditions){
                bc "Thick Skin clears special conditions"
                clearSpecialCondition(self, SRC_ABILITY)
              }
            }
          }
          move "Invite and Strike", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. This attack does 20 damage to the new Defending Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              def target = opp.bench.select("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon.")
              if (sw2(target)) {
                damage 20
              }
            }
          }
          move "Chop Up", {
            text "50 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost C, C, C
            onAttack {
              damage 50
              opp.bench.each {
                if(it.numberOfDamageCounters) {
                  damage 10, it
                }
              }
            }
          }

        };
      case CACNEA_67:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sneaky Attack", {
            text "10+ damage. If Cacnea has any [D] Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C
            onAttack {
              damage 10
              if(self.cards.filterByEnergyType(D)) {
                damage 10
              }
            }
          }
          move "Shoot Needle", {
            text "Flip 2 coins. For each heads, choose 1 of your opponent's Pokémon and this attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can choose the same Pokémon more than once, but you can't do more than 10 damage to that Pokémon in this way.)"
            energyCost G
            onAttack {
              flip 2, {}, {}, [2:{multiSelect(opp.all, 1, 2, "Choose up to 2 of your opponent's Pokémon").each{damage 10, it}},1:{damage 10, opp.all.select()}]
            }
          }

        };
      case CARNIVINE_68:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Poison Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost ()
            onAttack {
              flip {
                apply POISONED
              }
            }
          }
          move "Sweet Saliva", {
            text "20 damage. Remove 1 damage counter from each of your Benched Pokémon."
            energyCost G, C
            onAttack {
              damage 20
              my.bench.each {
                heal 10, it
              }
            }
          }

        };
      case CHANSEY_69:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Healing Trial", {
            text "Flip a coin. If heads, remove 3 damage counters from Chansey. If tails, remove 3 damage counters from the Defending Pokémon."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters || defending.numberOfDamageCounters : "Both active Pokémon are healthy"
            }
            onAttack {
              flip 1, {
                heal 30, self
              }, {
                heal 30, defending
              }
            }
          }
          move "Pulled Punch", {
            text "40 damage. If the Defending Pokémon already has any damage counters on it, this attack’s base damage is 10 instead of 40."
            energyCost C, C
            onAttack {
              damage 10
              if(!defending.numberOfDamageCounters) {
                damage 30
              }
            }
          }

        };
      case CHIMCHAR_70:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Bite", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Fire Punch", {
            text "20 damage. "
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case COMBEE_71:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Shoot Through", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }

        };
      case DIGLETT_72:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Dig Under", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost F
            attackRequirement {
              assert oppp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              damage 10, oopp.bench.select()
            }
          }
          move "Trip Over", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip {
                damage 20
              }
            }
          }

        };
      case DUNSPARCE_73:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily(basic:true, 1, delegate)
          }
          move "Spring Out", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 10 damage to that Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              damage 10, opp.bench.select()
            }
          }

        };
      case ELECTRIKE_74:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {
              switchYourOpponentsBenchedWithActive()
            }
            onAttack {
              whirlwind()
            }
          }
          move "Thunder Fang", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case GRIMER_75:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Division", {
            text "Search your deck for Grimer and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily(name:"Grimer",1,delegate)
          }
          move "Poison Gas", {
            text "The Defending Pokémon is now Poisoned."
            energyCost P
            onAttack {
              apply POISONED
            }
          }

        };
      case HAPPINY_76:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chansey from your hand onto Happiny (this counts as evolving Happiny) and remove all damage counters from Happiny."
            actionA {
              assert my.hand.findAll{it.name.contains("Chansey")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Chansey") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Hospitality", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon. Remove 2 damage counters from the new Defending Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              def target = opp.bench.select("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon.")
              if (sw2(target)) {
                heal 20, target
              }
            }
          }

        };
      case HONCHKROW_G_77:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Honcho’s Command", {
            text "Search your deck for up to 2 in any combination of Stadium cards or Trainer cards that has Team Galactic’s Invention in its name, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:2, "Search your deck for up to 2 Stadium or Trainer cards with Team Galactic's Invention in its name", {it.cardTypes.is(STADIUM) || (it.cardTypes.is(ITEM) && it.name.conatins("Team Galactic's Invention"))}).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Target Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. If that Pokémon already has any damage counters on it, this attack does 20 damage plus 20 more damage."
            energyCost D, C
            onAttack {
              def tar = opp.all.select()
              if(tar.numberOfDamageCounters) {
                damage 20, tar
              }
              damage 20, tar
            }
          }

        };
      case KRICKETOT_78:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Lullaby", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost G
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Rollout", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case LAPRAS_79:
        return basic (this, hp:HP080, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          move "Grind", {
            text "10× damage. Does 10 damage times the amount of Energy attached to Lapras."
            energyCost C
            onAttack {
              damage 10*self.cards.energyCount(C)
            }
          }
          move "Ice Beam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case LICKITUNG_80:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS20
          move "Stretch Tongue", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            onAttack {
              noWrDamage 10, opp.all.select()
            }
          }
          move "Knock Off", {
            text "40 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost C, C, C
            onAttack {
              damage 40
              discardRandomCardFromOpponentsHand()
            }
          }

        };
      case LOTAD_81:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          move "Energy Ball", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Lotad but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost C
            onAttack {
              damage 10
              extraEnergyDamage(2,hp(10),C,thisMove)
            }
          }
          move "Synthesis", {
            text "Flip a coin. If heads, search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              attachEnergyFrom(type: G, my.deck, my.all)
            }
          }

        };
      case MAREEP_82:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Minor Errand-Running", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a basic Energy card", cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Expand", {
            text "10 damage. During your opponent's next turn, any damage done to Mareep by attacks is reduced by 10 (after applying Weakness and Resistance)."
            energyCost L
            onAttack {
              damage 10
              reduceDamageNextTurn(hp(10), thisMove)
            }
          }

        };
      case MISDREAVUS_83:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Take Back", {
            text "Flip a coin. If heads, search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(ITEM) : "You have no Trainer cards in your discard pile"
            }
            onAttack {
              flip {
                my.discard.select("Choose a Trainer to put into your hand",cardTypeFilter(ITEM)).showToOpponent("Selected Cards").moveTo(my.hand)
              }
            }
          }
          move "Tackle", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case NOSEPASS_84:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          move "Pull", {
            text "Switch the Defending Pokémon with one of your opponent’s Benched Pokémon."
            energyCost C
            attackRequirement {
              assertOppBench()
            }
            onAttack {
              switchYourOpponentsBenchedWithActive()
            }
          }
          move "Rollout", {
            text "20 damage. "
            energyCost F, C
            onAttack {
              damage 20
            }
          }

        };
      case PIPLUP_85:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Muddy Water", {
            text "10 damage. Does 10 damage to one of your opponent’s Benched Pokémon."
            energyCost W
            onAttack {
              damage 10
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }
          move "Pound", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case POOCHYENA_86:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Howl", {
            text "Search your deck for Poochyena and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily(name:"Poochyena",1,delegate)
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost D
            onAttack {
              flip {
                damage 20
              }
            }
          }

        };
      case PSYDUCK_87:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Headache", {
            text "Flip a coin. If heads, your opponent can’t play any Trainer, Supporter, or Stadium cards from his or her during his or her next turn."
            energyCost ()
            onAttack {
              flip {
                delayed {
                  before PLAY_TRAINER, {
                    if ((ef.cardToPlay.cardTypes.is(ITEM) || ef.cardToPlay.cardTypes.is(SUPPORTER) || ef.cardToPlay.cardTypes.is(STADIUM)) && bg.currentTurn == self.owner.opposite) {
                      wcu "Headache prevents you from playing Item cards."
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
          move "Latent Power", {
            text "30 damage. Flip a coin. If tails, this attack does no damage to the Defending Pokémon. Instead, Psyduck is now Confused."
            energyCost W
            onAttack {
              flip 1, {
                damage 30
              }, {
                apply CONFUSED, self
              }
            }
          }

        };
      case PURUGLY_G_88:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F
          move "Chip Off", {
            text "20 damage. If your opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.hand.size() > 5) {
                def count = opp.hand.size() - 5
                opp.hand.shuffledCopy().select(hidden: true, count: count, "Choose ${count==1?'a':count} random ${count==1?'card':'cards'} from your opponent's hand to discard").discard()
              }
            }
          }
          move "Poor Sleep", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage and Purugly is now Asleep."
            energyCost C, C, C, C
            onAttack {
              damage 50
              flip {
                damage 30
                afterDamage {
                  apply ASLEEP, self
                }
              }
            }
          }

        };
      case RALTS_89:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Future Sight", {
            text "Look at the top 5 cards in either player’s deck and put them back on top of that player’s deck in any order."
            energyCost ()
            foresight(5, delegate)
          }
          move "Hypnoblast", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost P
            onAttack {
              damage 10
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case REMORAID_90:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Splash", {
            text "10 damage. "
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Trickle", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }

        };
      case RIOLU_91:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Light Punch", {
            text "10 damage. "
            energyCost ()
            onAttack {
              damage 10
            }
          }
          move "Steady Punch", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                damage 10
              }
            }
          }

        };
      case SHUPPET_92:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Hypnotic Gaze", {
            text "The Defending Pokémon is now Asleep."
            energyCost ()
            onAttack {
              apply ASLEEP
            }
          }
          move "Fade Out", {
            text "30 damage. Return Shuppet and all cards attached to it to your hand. (If you don’t have any Benched Pokémon, this attack does nothing.)"
            energyCost P
            attackRequirement {
              assert my.bench : "You don't have any Benched Pokémon"
            }
            onAttack {
              if (my.bench.notEmpty) {
                damage 30
                scoopUpPokemon(self, delegate)
              }
            }
          }

        };
      case SKITTY_93:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Heal Bell", {
            text "Remove 1 damage counter from each of your Pokémon."
            energyCost ()
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healty"
            }
            onAttack {
              my.all.each {
                heal 10, it
              }
            }
          }
          move "Take Down", {
            text "20 damage. Skitty does 10 damage to itself."
            energyCost C
            onAttack {
              damage 20
              damage 10, self
            }
          }

        };
      case SKUNTANK_G_94:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness F
          pokePower "Poison Structure", {
            text "Once during your turn (before your attack), if you have a Stadium card in play, you may use this power. Each Active Pokémon (both your's and your opponent's) (excluding Pokémon SP) is now Poisoned. This power can't be used if Skuntank G is affected by a Special Condition. "
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert bg.stadiumInfoStruct : "There is no Stadium in play"
              assert bg.stadiumInfoStruct.stadiumCard.player == self.owner : "You don't have a Stadium card in play"
              assert !opp.active.topPokemonCard.cardTypes.is(POKEMON_SP) || !my.active.topPokemonCard.cardTypes.is(POKEMON_SP) : "Both active Pokémon are Pokémon SP"
              powerUsed()
              if(!opp.active.topPokemonCard.cardTypes.is(POKEMON_SP)) {
                apply POISONED, opp.active, SRC_ABILITY
              }
              if(!my.active.topPokemonCard.cardTypes.is(POKEMON_SP)) {
                apply POISONED, my.active, SRC_ABILITY
              }
            }
          }
          move "Smokescreen", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              damage 20
              sandAttack(thisMove)
            }
          }

        };
      case SLAKOTH_95:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Slakoth."
            energyCost C
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Slack Off", {
            text "Remove all damage counters from Slakoth. Slakoth can’t attack during your next turn."
            energyCost C, C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              healAll self
              cantAttackNextTurn self
            }
          }

        };
      case SQUIRTLE_96:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Skull Bash", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Bite", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case SWABLU_97:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Sing", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Run Around", {
            text "10 damage. You may switch Swablu with one of your Benched Pokémon."
            energyCost C
            onAttack {
              damage 10
              switchYourActive(may:true)
            }
          }

        };
      case TAUROS_98:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Show Off", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a basic Energy card", cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            }
          }
          move "Take Down", {
            text "20 damage. Flip a coin. If tails, Tauros does 10 damage to itself."
            energyCost C
            onAttack {
              damage 20
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case TORCHIC_99:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Focus Energy", {
            text "During your next turn, Torchic’s Fire Shard attack’s base damage is 80."
            energyCost ()
            onAttack {
              increasedBaseDamageNextTurn("Fire Shard",hp(60))
            }
          }
          move "Fire Shard", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost R
            onAttack {
              flip {
                damage 20
              }
            }
          }

        };
      case TORKOAL_100:
        return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Super Singe", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 10
              flip {
                applyAfterDamage BURNED
              }
            }
          }
          move "Flame Ball", {
            text "40 damage. Move an Energy card attached to Torkoal to 1 of your Benched Pokémon."
            energyCost R, C, C
            onAttack {
              damage 40
              if(my.bench && self.cards.filterByType(ENERGY)) {
                afterDamage {
                  moveEnergy(self, my.bench)
                }
              }
            }
          }

        };
      case TURTWIG_101:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Ram", {
            text "10 damage. "
            energyCost G
            onAttack {
              damage 10
            }
          }
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case VULPIX_102:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Reheat", {
            text "Discard up to 2 Energy cards from your hand. For each card you discarded, draw 2 cards."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.hand.filterByType(ENERGY) : "You have no Energy cards in your hand"
            }
            onAttack {
              draw 2 * my.hand.select(max:2, "Discard up to 2 Energy cards from your hand", cardTypeFilter(ENERGY)).discard().size()
            }
          }
          move "Confuse Ray", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost R, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case WURMPLE_103:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Ram", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Poison Sting", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage POISONED
              }
            }
          }

        };
      case BROKEN_TIME_SPACE_104:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach player may evolve a Pokémon that he or she just played or evolved during that turn."
          def eff
          onPlay {
            eff = delayed {
              before PREVENT_EVOLVE, null, null, EVOLVE_STANDARD, {
                prevent()
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case CYRUS_S_CONSPIRACY_105:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for a Supporter card, a basic Energy card, and a Trainer card that has Team Galactic’s Invention in its name, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          onPlay {
            my.deck.search(max:3,"Search your deck for a Supporter card, a basic Energy card, and a Trainer card with Team Galactic's Invention in its name",{it.cardTypes.is(SUPPORTER) || it.cardTypes.is(BASIC_ENERGY) || (it.cardTypes.is(ITEM) && it.name.contains("Team Galactic's Invention"))}, {!(it.filterByType(SUPPORTER).size() > 1 || it.filterByType(BASIC_ENERGY).size() > 1 || it.filterByType(ITEM).size() > 1)}).showToOpponent("Selected Cards").moveTo(my.hand)
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case GALACTIC_HQ_106:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player plays any Pokémon from his or her hand to evolve his or her Pokémon, put 2 damage counters on that Pokémon."
          def eff
          onPlay {
            eff = delayed {
              boolean flag = false
              before EVOLVE, {
                flag = (ef.evolutionCard as Card).player.pbg.hand.contains(ef.evolutionCard)
              }
              after EVOLVE, { if(flag) {
                bc "Galactic HQ activates"
                directDamage(20, ef.pokemonToBeEvolved, TRAINER_CARD)
              } }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case LEVEL_MAX_107:
        return itemCard (this) {
          text "Flip a coin. If heads, search your deck for a Pokémon LV.X that levels up from 1 of your Pokémon, and put it onto that Pokémon (this counts as leveling up that Pokémon). Shuffle your deck afterward."
          onPlay {
            flip {
              def names = my.all.collect{ it.name }
              def sel_1 = deck.search ("Select a Pokémon that Levels up from $names.", {it.cardTypes.is(LVL_X) && names.contains(it.predecessor)}).first()
              // TODO: Level up a Pokémon. Im guessing evolve won't work but I'll give it a shot once the rest of this is released
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case LIFE_HERB_108:
        return copy(FireRedLeafGreen.LIFE_HERB_93, this);
      case LOOKER_S_INVESTIGATION_109:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nLook at your opponent’s hand, then choose you or your opponent. That player shuffles his or her hand into his or her deck and draws up to 5 cards."
          onPlay {
            opp.hand.shuffledCopy().showToMe("Opponent's hand")
            def choice = choose([0,1],["${thisCard.player.getPlayerUsername(bg)}","${thisCard.player.opposite.getPlayerUsername(bg)}"],"Choose a player")
            if(choice) {
              opp.hand.moveTo(hidden:true, opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              draw oppChoose(1..5,"Looker's Investigation: Draw how many cards?", 5), TargetPlayer.OPPONENT
            } else {
              my.hand.getExcludedList(thisCard).moveTo(my.deck)
              shuffleDeck()
              draw choose(1..5, "Looker's Investigation: Draw how many cards?", 5)
            }
          }
        };
      case MEMORY_BERRY_110:
        return pokemonTool (this) {
          text "Attach Memory Berry to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nThe Pokémon this card is attached to can use any attack from its Basic Pokémon or its Stage 1 Evolution card. (You still have to pay for that attack’s Energy cost.)"
          def eff
          onPlay {
            eff = getter (GET_MOVE_LIST) { holder->
              if(holder.effect.target.active && holder.effect.target.evolution) {
                for(card in holder.effect.target.cards.filterByType(STAGE1, BASIC)) {
                  if(card!=holder.effect.target.topPokemonCard){
                    holder.object.addAll(card.moves)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case MIASMA_VALLEY_111:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player puts a Basic Pokémon (excluding [G] or [P] Pokémon) from his or hand onto his or her Bench, put 2 damage counters on that Pokémon."
          def eff
          onPlay {
            eff = delayed {
              after PLAY_BASIC_POKEMON, {
                if(!(ef.cardToPlay.types.contains(G) || ef.cardToPlay.types.contains(P))){
                  bc "Miasma Valley activates"
                  ef.place.damage += 20
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case PLUSPOWER_112:
        return copy (DiamondPearl.PLUSPOWER_109, this);
      case POKE_BALL_113:
        return copy(FireRedLeafGreen.POKE_BALL_95, this);
      case POKEDEX_HANDY910IS_114:
        return copy(DiamondPearl.POKEDEX_HANDY910IS_111, this);
      case POKEMON_RESCUE_115:
        return itemCard (this) {
          text "Search your discard pile for a Pokémon, show it to your opponent, and put it into your hand."
          onPlay {
            my.discard.select("Choose a Pokémon to put into your hand", cardTypeFilter(POKEMON)).showToOpponent("Selected Cards").moveTo(my.hand)
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON) : "You have no Pokémon in your discard pile"
          }
        };
      case ENERGY_GAIN_116:
        return pokemonTool (this) {
          text "Attach Energy Gain to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAttach Team Galactic’s Invention G-101 Energy Gain to 1 of your Pokémon SP that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card. When the Pokémon this card is attached to is no longer a Pokémon SP, discard this card.\nAs long as Team Galactic’s Invention G-101 Energy Gain is attached to a Pokémon, the attack cost of that Pokémon’s attacks is [C] less."
          def eff1
          onPlay {reason->
            eff1=getter GET_MOVE_LIST, self, {h->
              def list=[]
              for(move in h.object){
                def copy=move.shallowCopy()
                copy.energyCost.remove(C)
                list.add(copy)
              }
              h.object=list
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
          }
          allowAttach { to->
            to.topPokemonCard.cardTypes.is(POKEMON_SP)
          }
        };
      case POWER_SPRAY_117:
        return itemCard (this) {
          text "You may play this card during your opponent’s turn when your opponent’s Pokémon uses any Poké-Power. Prevent all effects of that Poké-Power. (This counts as that Pokémon using its Poké-Power.) If you have 2 or less Pokémon SP in play, you can’t play this card."
          def once
          globalAbility {
            delayed {
              once = false
              before USE_ABILITY, {
                PokemonCardSet pcs = ef.getResolvedTarget(bg, e)
                Ability ability = ef.ability
                if(!(bg.em().retrieveObject("Power_Spray_Once_$thisCard.player"))) {
                  bg.em().storeObject("Power_Spray_Once_$thisCard.player", true)
                  once = true
                }
                def bluffing = true
                def tempIgnoreList = []
                def permIgnoreList = []
                def ignoreList = []
                if(bg.em().retrieveObject("This_Turn_Ignore_List_$thisCard.player") && bg.em().retrieveObject("This_Turn_Ignore_List_$thisCard.player").get(0) == bg.turnCount) {
                  ignoreList.addAll(bg.em().retrieveObject("This_Turn_Ignore_List_$thisCard.player").get(1))
                  tempIgnoreList.addAll(bg.em().retrieveObject("This_Turn_Ignore_List_$thisCard.player").get(1))
                }
                if(bg.em().retrieveObject("Always_Ignore_List_$thisCard.player")) {
                  ignoreList.addAll(bg.em().retrieveObject("Always_Ignore_List_$thisCard.player"))
                  permIgnoreList.addAll(bg.em().retrieveObject("Always_Ignore_List_$thisCard.player"))
                }
                if(bg.em().retrieveObject("Dont_Bluff_This_Turn_$thisCard.player") == bg.turnCount) {
                  bluffing = false
                }
                if(bg.em().retrieveObject("Dont_Bluff_Ever_$thisCard.player")) {
                  bluffing = false
                }
                if(
                  (once) &&
                  (!ignoreList.contains(ability.name) &&
                  (thisCard.player.pbg.hand.find{it.name == "Team Galactic's Invention G-103 Power Spray"} || bluffing)) &&
                  (thisCard.player.pbg.all.findAll{it.topPokemonCard.cardTypes.is(POKEMON_SP)}.size() >= 3) &&
                  (ability instanceof PokePower) &&
                  (bg.currentThreadPlayerType != thisCard.player) &&
                  (pcs.owner != thisCard.player)
                ) {// Display allow for selection
                  while(1) {
                    def options = []
                    def text = []
                    if(thisCard.player.pbg.hand.find{it.name == "Team Galactic's Invention G-103 Power Spray"}) {
                      options += [1]
                      text += ["Play Power Spray"]
                    }
                    options += [2]
                    text += ["Don't play Power Spray"]
                    if(!ignoreList.contains(ability.name)) {
                      options += [3,4]
                      text += ["Allow ${ability.name} for the remainder of the turn", "Allow ${ability.name} for the remainder of the game"]
                    }
                    if(bluffing) {
                      options += [5,6]
                      text += ["Only ask if Power Spray is in my hand this turn", "Only ask if Power Spray is in my hand this game"]
                    }
                    def choice = oppChoose(options, text, "Play power spray to block ${pcs.name}'s ${ability.name}?", options.get(0)) //oppChoose works since this only triggers if the active player thread is the opponent's
                    if(choice == 1) {
                      bg.em().storeObject("Power_Spray_Can_Play_$thisCard.player", true)
                      bg.deterministicCurrentThreadPlayerType=thisCard.player
                      bg.em().run(new PlayTrainer(thisCard.player.pbg.hand.findAll{it.name == "Team Galactic's Invention G-103 Power Spray"}.first()))
                      bg.clearDeterministicCurrentThreadPlayerType()
                      if(bg.em().retrieveObject("Power_Spray_Played_$thisCard.player")) {
                        bc "Power Spray blocks ${ability.name}!"
                        prevent()
                      }
                      bg.em().storeObject("Power_Spray_Can_Play_$thisCard.player", false)
                      bg.em().storeObject("Power_Spray_Played_$thisCard.player", false)
                      break
                    } else if(choice == 3) {
                      tempIgnoreList.add(ability.name)
                      ignoreList.add(ability.name)
                      bg.em().storeObject("This_Turn_Ignore_List_$thisCard.player",[bg.turnCount,tempIgnoreList])
                    } else if(choice == 4) {
                      permIgnoreList.add(ability.name)
                      ignoreList.add(ability.name)
                      bg.em().storeObject("Always_Ignore_List_$thisCard.player",permIgnoreList)
                    } else if(choice == 5) {
                      bluffing = false
                      bg.em().storeObject("Dont_Bluff_This_Turn_$thisCard.player",bg.turnCount)
                    } else if(choice == 5) {
                      bluffing = false
                      bg.em().storeObject("Dont_Bluff_Ever_$thisCard.player",true)
                    } else {
                      break
                    }
                  }
                }
              }
              after USE_ABILITY, {
                bg.em().storeObject("Power_Spray_Once_$thisCard.player", false)
                once = false
              }
            }
          }
          onPlay {
            bg.em().storeObject("Power_Spray_Played_$thisCard.player", true)
          }
          playRequirement{
            assert bg.em().retrieveObject("Power_Spray_Can_Play_$thisCard.player") : "Play this card during your opponent’s turn when your opponent’s Pokémon uses any Poké-Power"
          }
        };
      case POKE_TURN_118:
        return itemCard (this) {
          text "Return 1 of your Pokémon SP and all cards attached to it to your hand."
          onPlay {
            def pcs = my.all.findAll { it.topPokemonCard.cardTypes.is(POKEMON_SP) }.select("Which Pokémon SP to return to hand?")
            scoopUpPokemon(pcs, delegate)
          }
          playRequirement{
            my.bench.any { it.topPokemonCard.cardTypes.is(POKEMON_SP) }
          }
        };
      case ARMOR_FOSSIL_119:
        return copy(MysteriousTreasures.ARMOR_FOSSIL_116, this);
      case SKULL_FOSSIL_120:
        return copy(MysteriousTreasures.SKULL_FOSSIL_117, this);
      case RAINBOW_ENERGY_121:
        return copy (CelestialStorm.RAINBOW_ENERGY_151, this)
      case DIALGA_G_LV_X_122:
        return levelUp (this, from:"Dialga G", hp:HP120, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          pokeBody "Time Crystal", {
            text "Each Pokémon (both yours and your opponent's) (excluding Pokémon SP) can't use any Poké-Bodies."
            getterA (IS_ABILITY_BLOCKED) { Holder h ->
              def pcs = h.effect.target
              if (!pcs.topPokemonCard.cardTypes.is(POKEMON_SP)) {
                if (h.effect.ability instanceof PokeBody) {
                  h.object=true
                }
              }
            }
            onActivate {
              new CheckAbilities().run(bg)
            }
            onDeactivate{
              new CheckAbilities().run(bg)
            }
          }
          move "Remove Lost", {
            text "80 damage. Flip a coin until you get tails. For each heads, remove an Energy card attached to the Defending Pokémon and put it in the Lost Zone."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 80
              int heads = 0;
              flipUntilTails { heads += 1 }
              if (heads && opp.active.cards.filterByType(ENERGY)) {
                afterDamage {
                  opp.active.cards.filterByType(ENERGY).select(count:heads,"Choose the energy cards to put in the Lost Zone").moveTo(opp.lostZone)
                }
              }
            }
          }
        };
      case DRAPION_LV_X_123:
        return levelUp (this, from:"Drapion", hp:HP130, type:DARKNESS, retreatCost:3) {
          weakness P
          pokePower "Tri-Poison", {
            text "Once during your turn , you may flip a coin. If heads, choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. Put 3 damage counters instead of 1 on that Pokémon between turns. This power can’t be used if Drapion is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              flip {
                apply POISONED, defending, SRC_ABILITY
                extraPoison 2
              }
            }
          }
          move "Sniping Tail", {
            text "40 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D, D, C, C
            onAttack {
              damage 40
              cantRetreat defending
            }
          }
        };
      case GIRATINA_LV_X_124:
        return levelUp (this, from:"Giratina", hp:HP130, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          pokeBody "Invisible Tentacles", {
            text "Whenever your opponent’s Pokémon tries to attack, your opponent discards 1 card from his or her hand. (If your opponent can’t discard 1 card, your opponent’s Pokémon can’t attack.) You can’t use more than 1 Invisible Tentacles Poké-Body each turn."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if(opp.hand.empty) {
                  wcu "Invisible Tentacles prevents attacking"
                  prevent()
                }
              }
              before ATTACK_MAIN, {
                if(bg.em().retrieveObject("Invisible_Tentacles") != bg.turnCount) {
                  bg.em().storeObject("Invisible_Tentacles", bt.turnCount)
                  opp.hand.oppSelect("Choose a card to discard").discard()
                }
              }
            }
          }
          move "Darkness Lost", {
            text "This attack does 30 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If any of your opponent's Pokémon would be Knocked Out by damage from this attack, put that Pokémon and all cards attached to it in the Lost Zone instead of discarding it. "
            energyCost P, P, C, C
            onAttack {
              opp.all.each {
                damage 30, it
              }
              delayed {
                def knockedOut = null
                before KNOCKOUT, {
                  if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner && self.active && ef.pokemonToBeKnockedOut.owner != self.owner ) {
                    knockedOut = ef.pokemonToBeKnockedOut.cards.copy()
                  }
                }
                after KNOCKOUT, {
                  if (knockedOut) {
                    bc "Lost Boomerang GX sends Knocked Out Pokémon to the Lost Zone."
                    knockedOut.moveTo(self.owner.opposite.pbg.lostZone)
                    knockedOut = null
                  }
                }
                unregisterAfter 1
              }
            }
          }
        };
      case PALKIA_G_LV_X_125:
        return levelUp (this, from:"Palkia G", hp:HP120, type:WATER, retreatCost:2) {
          weakness L
          pokePower "Lost Cyclone", {
            text "Once during your turn , you may use this power. Any player who has 4 or more Benched Pokémon chooses 3 of his or her Benched Pokémon. Put the other Benched Pokémon and all cards attached to them in the Lost Zone. This power can’t be used it Palkia is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.bench.size >=4 || opp.bench.size() >= 4 : "Neither player has 4 or more Benched Pokémon"
              powerUsed()
              def list = LUtils.selectMultiPokemon(bg.oppClient(), opp.bench, "Opponent used Lost Cyclone. Select 3 pokemon to KEEP on your bench.", 3)
              opp.bench.findAll{!list.contains(it)}.each{
                it.cards.moveTo(opp.lostZone)
                removePCS(it)
              }
            }
          }
          move "Hydro Shot", {
            text "Discard 2 Energy attached to Palkia G. Choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon."
            energyCost W, W, C, C
            onAttack {
              damage 80, opp.all.select()
              discardSelfEnergyAfterDamage C, C
            }
          }
        };
      case SHAYMIN_LV_X_126:
        return levelUp (this, from:"Shaymin", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R
          resistance W, MINUS20
          pokeBody "Thankfulness", {
            text "Each of your Pokémon (excluding any Shaymin) gets +40 HP. You can’t use more than 1 Thankfulness Poké-Body each turn."
            delayedA {
              def target = []
              def source = []
              bg.em().storeObject("Thankfulness_target", target)
              bg.em().storeObject("Thankfulness_source", source)
              def eff
              onActivate {
                eff = getter (GET_FULL_HP) {h->
                  def pcs = h.effect.target
                  if (pcs.owner == self.owner && !pcs.name.contains("Shaymin")){
                    target = bg.em().retrieveObject("Thankfulness_target")
                    source = bg.em().retrieveObject("Thankfulness_source")
                    if(!target.contains(pcs)){
                      h.object += hp(40)
                      target.add(pcs)
                      bg.em().storeObject("Thankfulness_target", target)
                      source.add(self)
                      bg.em().storeObject("Thankfulness_source", source)
                    } else if(source.get(target.indexOf(pcs)) == self){
                      h.object += hp(40)
                    }
                  }
                }
              }
              onDeactivate {
                eff.unregister()
                target = []
                source = []
                bg.em().storeObject("Thankfulness_target", target)
                bg.em().storeObject("Thankfulness_source", source)
              }
            }
          }
          move "Seed Flare", {
            text "40+ damage. Choose as many [G] Energy cards from your hand as you like and attach them to your Pokémon in any way you like. If you do, this attack does 40 damage plus 20 more damage for each [G] Energy attached in this way."
            energyCost G, C, C
            onAttack {
              damage 40
              my.hand.select(min:0, max:my.hand.filterByEnergyType(G).size(), "Choose any number of [G] Energy cards to attach to your Pokémon", energyFilter(G)).each {
                damage 20
                attachEnergy(my.all.select("Attach $it to"), it)
              }
            }
          }
        };
      case SHAYMIN_LV_X_127:
        return levelUp (this, from:"Shaymin", hp:HP110, type:GRASS, retreatCost:0) {
          weakness R
          resistance F, MINUS20
          globalAbility {Card thisCard->
            delayed {
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                  bg.em().storeObject("Revenge_Seed", bg.turnCount)
                }
              }
            }
          }
          pokeBody "Revenge Seed", {
            text "If any of your Pokémon were Knocked Out by damage from an opponent’s attack during his or her last turn, each of Shaymin’s attacks does 60 more damage to the Active Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self && bg.em().retrieveObject("Revenge_Seed") == bg.turnCount-1) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
                    bc "Revenge seed +60"
                    it.dmg += hp(60)
                  }
                }
              }
            }
          }
          move "Energy Flare", {
            text "50 damage. You may move any number of Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            energyCost G, C
            onAttack {
              damage 50
              afterDamage {
                while(1) {
                  def src=my.all.findAll {it.cards.filterByType(ENERGY)}.select("Source for Energy (Cancel to stop)", false)
                  if(!src) break
                  def cards = src.cards.select(min:0, max:src.cards.filterByType(ENERGY).size(),"Card to move", cardTypeFilter(ENERGY))
                  def tar=my.all
                  tar.remove(src)
                  tar=tar.select("Target for Energies")
                  cards.each {
                    energySwitch(src, tar, it)
                  }
                }
              }
            }
          }
        };
      case ELECTABUZZ_128:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              damage 10
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Thunderpunch", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage and Electabuzz does 10 damage to itself."
            energyCost L, C
            onAttack {
              damage 30
              flip 1, {
                damage 10
              }, {
                damage 10, self
              }
            }
          }

        };
      case HITMONCHAN_129:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Jab", {
            text "20 damage. "
            energyCost F
            onAttack {
              damage 20
            }
          }
          move "Special Punch", {
            text "40 damage. "
            energyCost F, F, C
            onAttack {
              damage 40
            }
          }

        };
      case SCYTHER_130:
        return basic (this, hp:HP070, type:GRASS, retreatCost:0) {
          weakness R
          resistance F, MINUS30
          move "Swords Dance", {
            text "During your next turn, Scyther’s Slash attack’s base damage is 60 instead of 30."
            energyCost G
            onAttack {
              increasedBaseDamageNextTurn("Slash", hp(30))
            }
          }
          move "Slash", {
            text "30 damage. "
            energyCost C, C, C
            onAttack {
              damage 30
            }
          }

        };
      case LOTAD_SH4:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness L, PLUS10
          pokeBody "Swift Swim", {
            text "If Lotad has any Energy attached to it, Lotad’s Retreat Cost is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST, self) { h->
              if (self.cards.filterByType(ENERGY)) {
                h.object = 0
              }
            }
          }
          move "Blot", {
            text "10 damage. Remove 1 damage counter from Lotad."
            energyCost C
            onAttack {
              damage 10
              heal 10, self
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage"
            energyCost G, C
            onAttack {
              damage 10
              flip {
                damage 20
              }
            }
          }

        };
      case SWABLU_SH5:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          def turnCount = -1
          HP lastDamage = null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg().currentTurn==self.owner.opposite) {
                  turnCount=bg.turnCount
                  lastDamage=bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
                }
              }
            }
          }
          move "Roost", {
            text "Remove 4 damage counters from Swablu. Swablu can't retreat during your next turn."
            energyCost ()
            onAttack {
              heal 4, self
              cantRetreat(self)
            }
          }
          move "Mirror Move", {
            text "If Swablu was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Swablu to the Defending Pokémon."
            energyCost C
            attackRequirement {
              assert bg.turnCount == turnCount + 1 : "$self was not damaged by an attack last turn"
            }
            onAttack {
              damage lastDamage.value
            }
          }
          move "Fury Attack", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 3, {
                damage 10
              }
            }
          }

        };
      case VULPIX_SH6:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W
          move "Find Wildfire", {
            text "Search your deck for up to 2 [R] Energy cards, show them to your opponent, and put them in your hand. Shuffle your deck afterward."
            energyCost R
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 [R] Energy cards",energyFilter(R)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Brushfire", {
            text "10 damage. Does 10 damage to each of your opponent's [G] Benched Pokémon."
            energyCost R, G
            onAttack {
              damage 10
              opp.bench.each {
                if(it.types.contains(G)) {
                  damage 10, it
                }
              }
            }
          }
          move "Inflame", {
            text "30 damage. Discard a [R] Energy card from your hand. (If you can’t discard a card from your hand, this attack does nothing.)"
            energyCost R, C
            attackRequirement {
              assert my.hand.filterByEnergyType(R)
            }
            onAttack {
              damage 30
              afterDamage {
                my.hand.select("Discard a [R] Energy card from your hand")
              }
            }
          }

        };
      default:
        return null;
    }
  }

}
