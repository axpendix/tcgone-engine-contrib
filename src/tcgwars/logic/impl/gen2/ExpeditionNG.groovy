package tcgwars.logic.impl.gen2;

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
public enum ExpeditionNG implements LogicCardInfo {

  ALAKAZAM_1 ("Alakazam", "1", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  AMPHAROS_2 ("Ampharos", "2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ARBOK_3 ("Arbok", "3", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BLASTOISE_4 ("Blastoise", "4", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BUTTERFREE_5 ("Butterfree", "5", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHARIZARD_6 ("Charizard", "6", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CLEFABLE_7 ("Clefable", "7", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CLOYSTER_8 ("Cloyster", "8", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRAGONITE_9 ("Dragonite", "9", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUGTRIO_10 ("Dugtrio", "10", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FEAROW_11 ("Fearow", "11", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  FERALIGATR_12 ("Feraligatr", "12", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  GENGAR_13 ("Gengar", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GOLEM_14 ("Golem", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  KINGLER_15 ("Kingler", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MACHAMP_16 ("Machamp", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGBY_17 ("Magby", "17", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  MEGANIUM_18 ("Meganium", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MEW_19 ("Mew", "19", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEWTWO_20 ("Mewtwo", "20", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  NINETALES_21 ("Ninetales", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  PICHU_22 ("Pichu", "22", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  PIDGEOT_23 ("Pidgeot", "23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  POLIWRATH_24 ("Poliwrath", "24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  RAICHU_25 ("Raichu", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  RAPIDASH_26 ("Rapidash", "26", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SKARMORY_27 ("Skarmory", "27", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  TYPHLOSION_28 ("Typhlosion", "28", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  TYRANITAR_29 ("Tyranitar", "29", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  VENUSAUR_30 ("Venusaur", "30", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VILEPLUME_31 ("Vileplume", "31", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WEEZING_32 ("Weezing", "32", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ALAKAZAM_33 ("Alakazam", "33", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  AMPHAROS_34 ("Ampharos", "34", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ARBOK_35 ("Arbok", "35", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BLASTOISE_36 ("Blastoise", "36", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BLASTOISE_37 ("Blastoise", "37", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  BUTTERFREE_38 ("Butterfree", "38", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CHARIZARD_39 ("Charizard", "39", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CHARIZARD_40 ("Charizard", "40", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CLEFABLE_41 ("Clefable", "41", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CLOYSTER_42 ("Cloyster", "42", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRAGONITE_43 ("Dragonite", "43", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUGTRIO_44 ("Dugtrio", "44", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FEAROW_45 ("Fearow", "45", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  FERALIGATR_46 ("Feraligatr", "46", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  FERALIGATR_47 ("Feraligatr", "47", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  GENGAR_48 ("Gengar", "48", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GOLEM_49 ("Golem", "49", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  KINGLER_50 ("Kingler", "50", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MACHAMP_51 ("Machamp", "51", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGBY_52 ("Magby", "52", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  MEGANIUM_53 ("Meganium", "53", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MEGANIUM_54 ("Meganium", "54", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MEW_55 ("Mew", "55", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  MEWTWO_56 ("Mewtwo", "56", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  NINETALES_57 ("Ninetales", "57", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  PICHU_58 ("Pichu", "58", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  PIDGEOT_59 ("Pidgeot", "59", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  POLIWRATH_60 ("Poliwrath", "60", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  RAICHU_61 ("Raichu", "61", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  RAPIDASH_62 ("Rapidash", "62", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  SKARMORY_63 ("Skarmory", "63", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  TYPHLOSION_64 ("Typhlosion", "64", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  TYPHLOSION_65 ("Typhlosion", "65", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  TYRANITAR_66 ("Tyranitar", "66", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  VENUSAUR_67 ("Venusaur", "67", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VENUSAUR_68 ("Venusaur", "68", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VILEPLUME_69 ("Vileplume", "69", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WEEZING_70 ("Weezing", "70", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  BAYLEEF_71 ("Bayleef", "71", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CHANSEY_72 ("Chansey", "72", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHARMELEON_73 ("Charmeleon", "73", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CROCONAW_74 ("Croconaw", "74", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRAGONAIR_75 ("Dragonair", "75", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  ELECTABUZZ_76 ("Electabuzz", "76", Rarity.UNCOMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FLAAFFY_77 ("Flaaffy", "77", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  GLOOM_78 ("Gloom", "78", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRAVELER_79 ("Graveler", "79", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HAUNTER_80 ("Haunter", "80", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HITMONLEE_81 ("Hitmonlee", "81", Rarity.UNCOMMON, [POKEMON, BASIC, _FIGHTING_]),
  IVYSAUR_82 ("Ivysaur", "82", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  JYNX_83 ("Jynx", "83", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  KADABRA_84 ("Kadabra", "84", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MACHOKE_85 ("Machoke", "85", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAGMAR_86 ("Magmar", "86", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  METAPOD_87 ("Metapod", "87", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PIDGEOTTO_88 ("Pidgeotto", "88", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  POLIWHIRL_89 ("Poliwhirl", "89", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PUPITAR_90 ("Pupitar", "90", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  QUILAVA_91 ("Quilava", "91", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  WARTORTLE_92 ("Wartortle", "92", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ABRA_93 ("Abra", "93", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BULBASAUR_94 ("Bulbasaur", "94", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BULBASAUR_95 ("Bulbasaur", "95", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CATERPIE_96 ("Caterpie", "96", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHARMANDER_97 ("Charmander", "97", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHARMANDER_98 ("Charmander", "98", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CHIKORITA_99 ("Chikorita", "99", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CHIKORITA_100 ("Chikorita", "100", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  CLEFAIRY_101 ("Clefairy", "101", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CORSOLA_102 ("Corsola", "102", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CUBONE_103 ("Cubone", "103", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  CYNDAQUIL_104 ("Cyndaquil", "104", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  CYNDAQUIL_105 ("Cyndaquil", "105", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  DIGLETT_106 ("Diglett", "106", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DRATINI_107 ("Dratini", "107", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EKANS_108 ("Ekans", "108", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  GASTLY_109 ("Gastly", "109", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GEODUDE_110 ("Geodude", "110", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GOLDEEN_111 ("Goldeen", "111", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  HOPPIP_112 ("Hoppip", "112", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HOUNDOUR_113 ("Houndour", "113", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  KOFFING_114 ("Koffing", "114", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  KRABBY_115 ("Krabby", "115", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LARVITAR_116 ("Larvitar", "116", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MACHOP_117 ("Machop", "117", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGIKARP_118 ("Magikarp", "118", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAREEP_119 ("Mareep", "119", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MARILL_120 ("Marill", "120", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MEOWTH_121 ("Meowth", "121", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  ODDISH_122 ("Oddish", "122", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PIDGEY_123 ("Pidgey", "123", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PIKACHU_124 ("Pikachu", "124", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  POLIWAG_125 ("Poliwag", "125", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  PONYTA_126 ("Ponyta", "126", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  QWILFISH_127 ("Qwilfish", "127", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  RATTATA_128 ("Rattata", "128", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SHELLDER_129 ("Shellder", "129", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SPEAROW_130 ("Spearow", "130", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SQUIRTLE_131 ("Squirtle", "131", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SQUIRTLE_132 ("Squirtle", "132", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TAUROS_133 ("Tauros", "133", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TOTODILE_134 ("Totodile", "134", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TOTODILE_135 ("Totodile", "135", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  VULPIX_136 ("Vulpix", "136", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  BILL_S_MAINTENANCE_137 ("Bill's Maintenance", "137", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  COPYCAT_138 ("Copycat", "138", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DUAL_BALL_139 ("Dual Ball", "139", Rarity.UNCOMMON, [TRAINER]),
  ENERGY_REMOVAL_2_140 ("Energy Removal 2", "140", Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RESTORE_141 ("Energy Restore", "141", Rarity.UNCOMMON, [TRAINER]),
  MARY_S_IMPULSE_142 ("Mary's Impulse", "142", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MASTER_BALL_143 ("Master Ball", "143", Rarity.UNCOMMON, [TRAINER]),
  MULTI_TECHNICAL_MACHINE_01_144 ("Multi Technical Machine 01", "144", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  POKEMON_NURSE_145 ("Pokémon Nurse", "145", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_REVERSAL_146 ("Pokémon Reversal", "146", Rarity.UNCOMMON, [TRAINER]),
  POWER_CHARGE_147 ("Power Charge", "147", Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_ELM_S_TRAINING_METHOD_148 ("Professor Elm's Training Method", "148", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROFESSOR_OAK_S_RESEARCH_149 ("Professor Oak's Research", "149", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STRENGTH_CHARM_150 ("Strength Charm", "150", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  SUPER_SCOOP_UP_151 ("Super Scoop Up", "151", Rarity.UNCOMMON, [TRAINER]),
  WARP_POINT_152 ("Warp Point", "152", Rarity.UNCOMMON, [TRAINER]),
  ENERGY_SEARCH_153 ("Energy Search", "153", Rarity.COMMON, [TRAINER]),
  FULL_HEAL_154 ("Full Heal", "154", Rarity.COMMON, [TRAINER]),
  MOO_MOO_MILK_155 ("Moo-Moo Milk", "155", Rarity.COMMON, [TRAINER]),
  POTION_156 ("Potion", "156", Rarity.COMMON, [TRAINER]),
  SWITCH_157 ("Switch", "157", Rarity.COMMON, [TRAINER]),
  DARKNESS_ENERGY_158 ("Darkness Energy", "158", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  METAL_ENERGY_159 ("Metal Energy", "159", Rarity.RARE, [ENERGY, SPECIAL_ENERGY]),
  FIGHTING_ENERGY_160 ("Fighting Energy", "160", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
  FIRE_ENERGY_161 ("Fire Energy", "161", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
  GRASS_ENERGY_162 ("Grass Energy", "162", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
  LIGHTNING_ENERGY_163 ("Lightning Energy", "163", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
  PSYCHIC_ENERGY_164 ("Psychic Energy", "164", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]),
  WATER_ENERGY_165 ("Water Energy", "165", Rarity.COMMON, [ENERGY, BASIC, BASIC_ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  ExpeditionNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.EXPEDITION;
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
      case ALAKAZAM_1:
      return evolution (this, from:"Kadabra", hp:HP100, type:P, retreatCost:2) {
        weakness P
        pokePower "Psymimic", {
          text "Once during your turn, instead of Alakazam's normal attack, you may choose 1 of your opponent's Pokémon's attack. Alakazam copies that attack including its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type that Pokémon is, Alakazam's type is still Psychic.) This power can't be used if Alakazam is affected by a Special Condition."
          actionA {
            assert self.specialConditions.empty : "$self is affected by a Special Condition"
            assert self.active : "$self is not the Active Pokémon"
            metronome unblockEndTurn: true, keepEnergyRequirement: true, opp.all, delegate
          }
        }
        move "Syncroblast", {
          text "If Alakazam and the Defending Pokémon don't have the same number of Energy cards on them, this attack's base damage is 20 instead of 80."
          energyCost P, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case AMPHAROS_2:
      return evolution (this, from:"Flaaffy", hp:HP100, type:L, retreatCost:2) {
        weakness F
        pokePower "Energy Connect", {
          text "Once during your turn (before you attack), you make take one basic Energy cards attached to one of your Benched Pokémon and attach it to your Active Pokémon. This power can't be used if Ampharos is affected by a Special Condition."
          actionA {
          }
        }
        move "Lightning Strike", {
          text "You may discard all [L] Energy cards attached to Ampharos. If you do, this attack's base damage is 80 instead of 40."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case ARBOK_3:
      return evolution (this, from:"Ekans", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Poison Spray", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Reaction", {
          text "20+ damage. If the Defending Pokémon is Poisoned, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BLASTOISE_4:
      return evolution (this, from:"Wartortle", hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokePower "Jet Stream", {
          text "Once during your turn (before you attack), if Blastoise is your Active Pokémon, you may flip a coin. If heads, discard an Energy card attached to Blastoise, if any. Then, if there are any Energy cards attached to the Defending Pokémon, choose one of them and discard it. This power can't be used if Blastoise is affected by a Special Condition."
          actionA {
          }
        }
        move "Energy Cannon", {
          text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to Blastoise but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BUTTERFREE_5:
      return evolution (this, from:"Metapod", hp:HP080, type:G, retreatCost:null) {
        weakness R
        pokePower "Miraculous Powder", {
          text "Once during your turn (before you attack), you may remove all Special Conditions from your Active Pokémon. This power can't be used if Butterfree is affected by a Special Condition."
          actionA {
          }
        }
        move "Spiral Drain", {
          text "40 damage. Flip a coin. If heads, remove 2 damage counters from Butterfree."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CHARIZARD_6:
      return evolution (this, from:"Charmeleon", hp:HP120, type:R, retreatCost:3) {
        weakness W
        pokePower "Burning Energy", {
          text "Once during your turn (before you attack), you may turn all basic Energy attached to all of your Pokémon into [R] Energy for the rest of the turn. This power can't be used if Charizard is affected by a Special Condition."
          actionA {
          }
        }
        move "Scorching Whirlwind", {
          text "120 damage. Flip 2 coins. If 1 of them is tails, discards 3 Energy cards attached to Charizard. If both of them are tails, discard all Energy cards attached to Charizard."
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case CLEFABLE_7:
      return evolution (this, from:"Clefairy", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "Moonlight", {
          text "Once during your turn (before you attack), you may put a card from your hand back on your deck. If you do so, search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Clefable is affected by a Special Condition."
          actionA {
          }
        }
        move "Doubleslap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CLOYSTER_8:
      return evolution (this, from:"Shellder", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Lick", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Auto Fire", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DRAGONITE_9:
      return evolution (this, from:"Dragonair", hp:HP100, type:C, retreatCost:2) {
        pokePower "Tailwind", {
          text "Once during your turn (before you attack), if Dragonite is on your Bench, you may reduce your Active Pokémon's Retreat cost to 0."
          actionA {
          }
        }
        move "Dragon Tail", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost W, L, F
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DUGTRIO_10:
      return evolution (this, from:"Diglett", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Mud Slap", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnitude", {
          text "40 damage. Does 10 damage to each Benched Pokémon (yours and your opponent's). (Don't apply Weakness and resistance for Benched Pokémon.)"
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case FEAROW_11:
      return evolution (this, from:"Spearow", hp:HP070, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        move "Clutch", {
          text "20 damage. The Defending Pokémon can't retreat during you opponent's next turn."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Supersonic Flight", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FERALIGATR_12:
      return evolution (this, from:"Croconaw", hp:HP120, type:W, retreatCost:3) {
        weakness L
        pokePower "Major Tsunami", {
          text "Once during your turn (before you attack), if Feraligatr is your Active Pokémon and if your opponent has any Benched Pokémon, your opponent switches his or her Active Pokémon with 1 of his or her Benched Pokémon. Either way, if you have any Benched Pokémon, switch Feraligatr with 1 of them. This power can't be used if Feraligatr is affected by a Special Condition."
          actionA {
          }
        }
        move "Rending Jaws", {
          text "If there are no damage counters on the Defending Pokémon, this attack's base damage is 40 instead of 70."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GENGAR_13:
      return evolution (this, from:"Haunter", hp:HP090, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        pokePower "Chaos Move", {
          text "Once during your turn (before you attack), if your opponent has 3 or fewer Prizes, you may move 1 damage counter from 1 Pokémon (yours or your opponent's) to another (even if it would Knock Out the other Pokémon). This power can't be used if Gengar is affected by a Special Condition."
          actionA {
          }
        }
        move "Hide in Shadows", {
          text "40 damage. Switch Gengar with one of your Benched Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GOLEM_14:
      return evolution (this, from:"Graveler", hp:HP100, type:F, retreatCost:4) {
        weakness W
        pokeBody "Rock Body", {
          text "All Damage done by attacks to Golem is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Rock Tumble", {
          text "60 damage. Don't apply Resistance."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KINGLER_15:
      return evolution (this, from:"Krabby", hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Giant Claw", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost W, W, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MACHAMP_16:
      return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
        weakness P
        pokePower "Terraforming", {
          text "Once during your turn (before you attack), you may look at the top 4 cards of your deck and rearrange them as you like. This power can't be used if Machamp is affected by a Special Condition."
          actionA {
          }
        }
        move "Iron Fist", {
          text "50+ damage. Count the number of Pokémon you have in play with damage counters on them. Flip a coin. If heads, this attack does 50 damage plus 10 more damage for each of those Pokémon."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MAGBY_17:
      return basic (this, hp:HP030, type:R, retreatCost:1) {
        move "Energy Catch", {
          text "Flip a coin. If heads, put a basic Energy cards from your discard pile into your hand."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEGANIUM_18:
      return evolution (this, from:"Bayleef", hp:HP100, type:G, retreatCost:2) {
        weakness R
        resistance W, MINUS30
        pokePower "Soothing Aroma", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, remove 1 damage counter from each of your Pokémon that has any. This power can't be used if Meganium is affected by a Special Condition."
          actionA {
          }
        }
        move "Poisonpowder", {
          text "40 damage. The Defending Pokémon is now Poisoned."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MEW_19:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Super Psywave", {
          text "Choose one of you opponent's Pokémon. Count the number of Energy cards attached to that Pokémon. Put that many damage counters on the Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MEWTWO_20:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        move "Hypnosis", {
          text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psychic", {
          text "20+ damage. This attack does 20 damage plus 10 more damage for each Energy card attached to the Defending Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NINETALES_21:
      return evolution (this, from:"Vulpix", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Mislead", {
          text "Flip 2 coins. If either of them is heads, the Defending Pokémon is now Confused."
          energyCost R, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Ethereal Flame", {
          text "30+ damage. Discard all [R] Energy cards attached to Ninetales. This attack does 30 damage plus 10 more damage for each cards discarded this way."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PICHU_22:
      return basic (this, hp:HP030, type:L, retreatCost:1) {
        move "Energy Patch", {
          text "Take an Energy card attached to one of your Pokémon and attach it to another of your Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIDGEOT_23:
      return evolution (this, from:"Pidgeotto", hp:HP080, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        pokePower "Beating Wings", {
          text "Once during your turn (before your attack), If Pidgeot is your Active Pokémon, you may shuffle 1 of your Benched Pokémon and all cards attached to it in your deck. This power can't be used if Pidgeot is affected by a Special Condition."
          actionA {
          }
        }
        move "Sharp Beak", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 30 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case POLIWRATH_24:
      return evolution (this, from:"Poliwhirl", hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokePower "Plunge", {
          text "Once during your turn (before you attack), if Poliwrath is on your Bench, you may flip a coin. If heads, take all Energy cards attached to your Active Pokémon, if any, and attach them to Poliwrath. Then switch Poliwrath with your Active Pokémon."
          actionA {
          }
        }
        move "Water Punch", {
          text "40+ damage. Flip a number of coins equal to the amount of [W] Energy cards attached to Poliwrath. This attack does 40 damage plus 10 more damage for each heads."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case RAICHU_25:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Plasma", {
          text "10 damage. If there are any [L] Energy cards in your discard pile, flip a coin. If heads, attach one of them to Raichu."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Shock Bolt", {
          text "60 damage. Discard all [L] Energy cards attached to Raichu or this attack does nothing."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case RAPIDASH_26:
      return evolution (this, from:"Ponyta", hp:HP070, type:R, retreatCost:null) {
        weakness W
        move "Overrun", {
          text "20 damage. If your opponent has any Benched Pokémon, flip a coin. If heads, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flame Tail", {
          text "40 damage. "
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case SKARMORY_27:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Steel Beak", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Air Cutter", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case TYPHLOSION_28:
      return evolution (this, from:"Quilava", hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokePower "Heat Up", {
          text "Once during your turn (before you attack), You may count the total number of Energy cards attached to all of your Pokémon and all of your opponent's Pokémon. If your opponent has more total energy cards attached, you may search your deck for 1 [R] Energy card and attach it to one of your Benched Pokémon, if any. Shuffle your deck afterward. This power can't be used if Typhlosion is affected by a Special Condition."
          actionA {
          }
        }
        move "Super Singe", {
          text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case TYRANITAR_29:
      return evolution (this, from:"Pupitar", hp:HP120, type:D, retreatCost:4) {
        weakness F
        resistance P, MINUS30
        pokeBody "Dark Aura", {
          text "All Energy attached to Tyranitar is Dark instead of its usual type."
          delayedA {
          }
        }
        move "Stamp", {
          text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 10 more damage and does 10 damage to each of your opponent's Benched Pokémon, if any. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost D, D, D, D
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case VENUSAUR_30:
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:2) {
        weakness R
        pokePower "Harvest Bounty", {
          text "Once during your turn (before you attack), If you attach an Energy card from your hand to your Active Pokémon as part of your turn, you may attach an additional Energy card to that Pokémon at the same time. This power can't be used if Venusaur is affected by a Special Condition."
          actionA {
          }
        }
        move "Body Slam", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost G, G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VILEPLUME_31:
      return evolution (this, from:"Gloom", hp:HP090, type:G, retreatCost:2) {
        weakness P
        pokePower "Poison Pollen", {
          text "Once during your turn (before you attack), you may flip a coin. If heads, the Defending Pokémon is now Poisoned. This power can't be used if Vileplume is affected by a Special Condition."
          actionA {
          }
        }
        move "Petal Dance", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads. Vileplume is now Confused."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WEEZING_32:
      return evolution (this, from:"Koffing", hp:HP080, type:G, retreatCost:2) {
        weakness P
        move "Foul Gas", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Confused."
          energyCost G, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Misfire", {
          text "60 damage. Flip a coin. If tails, put 6 damage counters on Weezing."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ALAKAZAM_33:
      return copy (ALAKAZAM_1, this);
      case AMPHAROS_34:
      return copy (AMPHAROS_2, this);
      case ARBOK_35:
      return evolution (this, from:"null", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Poison Spray", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Reaction", {
          text "20+ damage. If the Defending Pokémon is Poisoned, this attack does 20 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BLASTOISE_36:
      return evolution (this, from:"Wartortle", hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Bubble", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Cannon", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BLASTOISE_37:
      return evolution (this, from:"null", hp:HP100, type:W, retreatCost:2) {
        weakness L
        pokePower "Jet Stream", {
          text "Once during your turn (before you attack), if Blastoise is your Active Pokémon, you may flip a coin. If heads, discard an Energy card attached to Blastoise, if any. Then, if there are any Energy cards attached to the Defending Pokémon, choose one of them and discard it. This power can't be used if Blastoise is affected by a Special Condition."
          actionA {
          }
        }
        move "Energy Cannon", {
          text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to Blastoise but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BUTTERFREE_38:
      return copy (BUTTERFREE_5, this);
      case CHARIZARD_39:
      return evolution (this, from:"Charmeleon", hp:HP100, type:R, retreatCost:2) {
        weakness W
        move "Tail Smash", {
          text "Flip a coin. If heads, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flamethrower", {
          text "60 damage. Discard 1 [R] Energy card attached to Charizard."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CHARIZARD_40:
      return copy (CHARIZARD_6, this);
      case CLEFABLE_41:
      return copy (CLEFABLE_7, this);
      case CLOYSTER_42:
      return copy (CLOYSTER_8, this);
      case DRAGONITE_43:
      return copy (DRAGONITE_9, this);
      case DUGTRIO_44:
      return copy (DUGTRIO_10, this);
      case FEAROW_45:
      return copy (FEAROW_11, this);
      case FERALIGATR_46:
      return evolution (this, from:"Croconaw", hp:HP100, type:W, retreatCost:2) {
        weakness L
        move "Slash", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Claw", {
          text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FERALIGATR_47:
      return copy (FERALIGATR_12, this);
      case GENGAR_48:
      return copy (GENGAR_13, this);
      case GOLEM_49:
      return copy (GOLEM_14, this);
      case KINGLER_50:
      return copy (KINGLER_15, this);
      case MACHAMP_51:
      return copy (MACHAMP_16, this);
      case MAGBY_52:
      return copy (MAGBY_17, this);
      case MEGANIUM_53:
      return evolution (this, from:"Bayleef", hp:HP100, type:G, retreatCost:3) {
        weakness R
        resistance W, MINUS30
        move "Sleep Powder", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Solarbeam", {
          text "50 damage. "
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MEGANIUM_54:
      return copy (MEGANIUM_18, this);
      case MEW_55:
      return copy (MEW_19, this);
      case MEWTWO_56:
      return copy (MEWTWO_20, this);
      case NINETALES_57:
      return copy (NINETALES_21, this);
      case PICHU_58:
      return copy (PICHU_22, this);
      case PIDGEOT_59:
      return copy (PIDGEOT_23, this);
      case POLIWRATH_60:
      return copy (POLIWRATH_24, this);
      case RAICHU_61:
      return copy (RAICHU_25, this);
      case RAPIDASH_62:
      return copy (RAPIDASH_26, this);
      case SKARMORY_63:
      return copy (SKARMORY_27, this);
      case TYPHLOSION_64:
      return evolution (this, from:"Quilava", hp:HP100, type:R, retreatCost:2) {
        weakness W
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thermal Blast", {
          text "40 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon, if any. (Don't apply Weakness and Resistance for Benched Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TYPHLOSION_65:
      return copy (TYPHLOSION_28, this);
      case TYRANITAR_66:
      return copy (TYRANITAR_29, this);
      case VENUSAUR_67:
      return evolution (this, from:"Ivysaur", hp:HP100, type:G, retreatCost:2) {
        weakness R
        move "Leech Seed", {
          text "20 damage. If this attack damages the Defending Pokémon (after applying Weakness and Resistance), remove 1 damage counter from Venusaur, is it has any."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fury Swipes", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VENUSAUR_68:
      return copy (VENUSAUR_30, this);
      case VILEPLUME_69:
      return copy (VILEPLUME_31, this);
      case WEEZING_70:
      return copy (WEEZING_32, this);
      case BAYLEEF_71:
      return evolution (this, from:"Chikorita", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Mysterious Powder", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "30 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CHANSEY_72:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness F
        move "Bind Wound", {
          text "Flip a coin. If heads, remove 2 damage counters from 1 of your Pokémon (1 if it has only 1)."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dogpile", {
          text "Count the number for Pokémon on your Bench. This attack does 10 times that number to the Defending Pokémon, and Chansey does 10 times that number of damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CHARMELEON_73:
      return evolution (this, from:"Charmander", hp:HP080, type:R, retreatCost:1) {
        weakness W
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Flamethrower", {
          text "50 damage. Discard 1 [R] Energy card attached to Charmeleon."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CROCONAW_74:
      return evolution (this, from:"Totodile", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Take Down", {
          text "40 damage. Croconaw does 10 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DRAGONAIR_75:
      return evolution (this, from:"Dratini", hp:HP070, type:C, retreatCost:2) {
        move "Spiral Wave", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
          energyCost W, L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ELECTABUZZ_76:
      return basic (this, hp:HP060, type:L, retreatCost:2) {
        weakness F
        move "Energy Draw", {
          text "Search your deck for a basic Energy card and attach it to Electabuzz. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Reflect Energy", {
          text "20 damage. If you have any Benched Pokémon and if there are any basic Energy cards attached to Electabuzz, take 1 of those Energy cards and attach it to 1 of those Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLAAFFY_77:
      return evolution (this, from:"Mareep", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Headbutt", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder Jolt", {
          text "50 damage. Flip a coin. If tails, Flaaffy does 20 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GLOOM_78:
      return evolution (this, from:"Oddish", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Razor Leaf", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Foul Odor", {
          text "30 damage. Both the Defending Pokémon and Gloom are now Confused (after doing damage)."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRAVELER_79:
      return evolution (this, from:"Geodude", hp:HP080, type:F, retreatCost:3) {
        weakness W
        move "Rock Hurl", {
          text "20 damage. Don't apply Resistance."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rock Slide", {
          text "30 damage. Chose 2 of your opponent's Pokémon (1 if he or she has only 1). This attack does 10 damage to each of those Pokémon. (Don't apply Weakness and Resistance for those Pokémon."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HAUNTER_80:
      return evolution (this, from:"Gastly", hp:HP070, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        move "Nightmare", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Dream Eater", {
          text "If the Defending Pokémon isn't Asleep, this attack does nothing."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HITMONLEE_81:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness P
        move "Smash Kick", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Stretch Kick", {
          text "30 damage. If your opponent has any Benched Pokémon, chose 1 of them and this attack does 30 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case IVYSAUR_82:
      return evolution (this, from:"Bulbasaur", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Sleep Seed", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Vine Whip", {
          text "40 damage. "
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case JYNX_83:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness M
        move "Ice Punch", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Powder Snow", {
          text "20 damage. The Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case KADABRA_84:
      return evolution (this, from:"Abra", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Energy Recall", {
          text "Attach 2 basic Energy cards from your discard pile to Kadabra (1 if you have only 1)."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Confuse Ray", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOKE_85:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Punch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Kick", {
          text "50 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MAGMAR_86:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Flaming Punch", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thrash", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, Magmar does 10 damage to itself."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case METAPOD_87:
      return evolution (this, from:"Caterpie", hp:HP060, type:G, retreatCost:2) {
        weakness R
        pokeBody "Exoskeleton", {
          text "All damage done to Metapod is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Rollout", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIDGEOTTO_88:
      return evolution (this, from:"Pidgey", hp:HP090, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches the Defending Pokémon with it. (Do the damage before switching the Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case POLIWHIRL_89:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Punch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Bubblebeam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PUPITAR_90:
      return evolution (this, from:"Larvitar", hp:HP070, type:F, retreatCost:1) {
        weakness W
        move "Headbutt", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case QUILAVA_91:
      return evolution (this, from:"Cyndaquil", hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Super Singe", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Tackle", {
          text "30 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WARTORTLE_92:
      return evolution (this, from:"Squirtle", hp:HP080, type:W, retreatCost:1) {
        weakness L
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Giant Wave", {
          text "40 damage. Wartortle can't attack during your next turn."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case ABRA_93:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        move "Scratch", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BULBASAUR_94:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Seed", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case BULBASAUR_95:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Sleep Seed", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Vine Whip", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CATERPIE_96:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Entangling Thread", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHARMANDER_97:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Tail Rap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
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
      case CHARMANDER_98:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Gnaw", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Searing Flame", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CHIKORITA_99:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Hypnotic Gaze", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CHIKORITA_100:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Razor Leaf", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sleep Powder", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CLEFAIRY_101:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Shining Fingers", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Slap", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CORSOLA_102:
      return basic (this, hp:HP060, type:W, retreatCost:2) {
        weakness G
        move "Tackle", {
          text "20 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Spike Cannon", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CUBONE_103:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Beat", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bone Smash", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case CYNDAQUIL_104:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CYNDAQUIL_105:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ember", {
          text "30 damage. Discard a [R] Energy card attached to Cyndaquil."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DIGLETT_106:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Fury Headbutt", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DRATINI_107:
      return basic (this, hp:HP040, type:C, retreatCost:null) {
        move "Dragon Smash", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost W, L
          attackRequirement {}
          onAttack {

          }
        }
      };
      case EKANS_108:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Poison Sting", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GASTLY_109:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        move "Bad Dream", {
          text "Flip a coin. If heads the Defending Pokémon is now Asleep. If tails, the Defending Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GEODUDE_110:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Rock Hurl", {
          text "10 damage. Don't apply Resistance."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GOLDEEN_111:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
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
      case HOPPIP_112:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Sleep Powder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case HOUNDOUR_113:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KOFFING_114:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Ram", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confusion Gas", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case KRABBY_115:
      return basic (this, hp:HP050, type:W, retreatCost:2) {
        weakness L
        move "Crabhammer", {
          text "30 damage. "
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LARVITAR_116:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness W
        move "Bite", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mud Slap", {
          text "20 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOP_117:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Punch", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Chop", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGIKARP_118:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Flail", {
          text "10x damage. This attack does 10 damage times the number of damage counters on Magikarp."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAREEP_119:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MARILL_120:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Tail Slap", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MEOWTH_121:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Double Scratch", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pay Day", {
          text "10 damage. Flip a coin. If heads, draw a card."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ODDISH_122:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sleep Seed", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIDGEY_123:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fury Strikes", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PIKACHU_124:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Lightning Tail", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tackle", {
          text "20 damage. "
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case POLIWAG_125:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Rollout", {
          text "20 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PONYTA_126:
      return basic (this, hp:HP040, type:R, retreatCost:1) {
        weakness W
        move "Singe", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Smash Kick", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case QWILFISH_127:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Stun Needle", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case RATTATA_128:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        weakness F
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHELLDER_129:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Irongrip", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Lick", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SPEAROW_130:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Razor Wind", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SQUIRTLE_131:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Doubleslap", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SQUIRTLE_132:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Headbutt", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bubblebeam", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TAUROS_133:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        move "Horn Hazard", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Take Down", {
          text "30 damage. Tauros does 20 Damage to itself."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TOTODILE_134:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Surf", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Scratch", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOTODILE_135:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Paralyzing Gaze", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case VULPIX_136:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Tail Shake", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

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
      case BILL_S_MAINTENANCE_137:
      return supporter (this) {
        text "If you have any cards in your hand, shuffle 1 of them into your deck, then draw 3 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case COPYCAT_138:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, count the number of cards in your opponent's hand and draw that many cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case DUAL_BALL_139:
      return basicTrainer (this) {
        text "Flip 2 coins. For each heads, search your deck for a Basic Pokémon card other than a Baby Pokémon card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_REMOVAL_2_140:
      return basicTrainer (this) {
        text "Flip a coin. If heads, choose 1 Energy card attached to 1 of your opponent's Pokémon and discard it."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_RESTORE_141:
      return basicTrainer (this) {
        text "Flip 3 coins. For each heads, put a basic Energy card from your discard pile into your hand. If you don't have that many basic Energy cards in your discard pile, put all of them into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case MARY_S_IMPULSE_142:
      return supporter (this) {
        text "Flip a coin until you get tails. For each heads, draw 2 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case MASTER_BALL_143:
      return basicTrainer (this) {
        text "Look at 7 cards from the top of your deck. You may choose a Basic Pokémon or Evolution card from those cards, show it to your opponent, and put it into your hand. Shuffle the rest into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case MULTI_TECHNICAL_MACHINE_01_144:
      return basicTrainer (this) {
        text "The Defending Pokémon is now Paralyzed."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_NURSE_145:
      return supporter (this) {
        text "Remove all damage counters from one of your Pokémon. Then discard all Energy cards attached to it, if any."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_REVERSAL_146:
      return basicTrainer (this) {
        text "Choose one of your opponent's Benched Pokémon. Flip a coin. If heads, switch that Pokémon with the Defending Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case POWER_CHARGE_147:
      return basicTrainer (this) {
        text "Flip a coin. If heads, shuffle 2 Energy cards from your discard pile into your deck (1 if you have only 1)."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_ELM_S_TRAINING_METHOD_148:
      return supporter (this) {
        text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case PROFESSOR_OAK_S_RESEARCH_149:
      return supporter (this) {
        text "Shuffle your hand into your deck, then draw 5 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case STRENGTH_CHARM_150:
      return pokemonTool (this) {
        text "Whenever an attack from the Pokémon that Strength Charm is attached to does damage (after applying Weakness and Resistance), the attack does 10 more damage. At the end of the turn in which this happens, discard Strength Charm."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case SUPER_SCOOP_UP_151:
      return basicTrainer (this) {
        text "Flip a coin. If heads, return 1 of your Pokémon and all cards attached to it to your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case WARP_POINT_152:
      return basicTrainer (this) {
        text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any; then you switch your Active Pokémon with 1 of your Benched Pokémon, if any."
        onPlay {
        }
        playRequirement{
        }
      };
      case ENERGY_SEARCH_153:
      return basicTrainer (this) {
        text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case FULL_HEAL_154:
      return basicTrainer (this) {
        text "Remove all Special Conditions from your Active Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case MOO_MOO_MILK_155:
      return basicTrainer (this) {
        text "Choose 1 of your Pokémon. Flip 2 coins. Remove 2 damage counters times the number of heads from that Pokémon. If the Pokémon has fewer damage counters than that, remove all of them."
        onPlay {
        }
        playRequirement{
        }
      };
      case POTION_156:
      return basicTrainer (this) {
        text "Remove 2 damage counters from 1 of your Pokémon (1 if it has only 1)."
        onPlay {
        }
        playRequirement{
        }
      };
      case SWITCH_157:
      return basicTrainer (this) {
        text "Switch your Active Pokémon with 1 of your Benched Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case DARKNESS_ENERGY_158:
      return specialEnergy (this, [[C]]) {
        text "If the Pokémon [D] Energy is attached to does damage with an attack (after applying Weakness and Resistance), the attack does 10 more damage. At the end of every turn, put 1 damage counter on the Pokémon [D] Energy is attached to, unless it's Darkness or has Dark in its name. [D] Energy provides [D] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case METAL_ENERGY_159:
      return specialEnergy (this, [[C]]) {
        text "Damage done by attacks to the Pokémon [M] Energy is attached to is reduced by 10 (after applying Weakness and Resistance). If the Pokémon [M] Energy is attached to isn't Metal, whenever it damages a Pokémon by an attack, reduce that damage by 10 (after applying Weakness and Resistance). [M] Energy provides [M] Energy. (Doesn't count as a basic Energy card.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case FIGHTING_ENERGY_160:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case FIRE_ENERGY_161:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case GRASS_ENERGY_162:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case LIGHTNING_ENERGY_163:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case PSYCHIC_ENERGY_164:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      case WATER_ENERGY_165:
      return basic (this, hp:null, type:null, retreatCost:null) {

      };
      default:
      return null;
    }
  }
}
