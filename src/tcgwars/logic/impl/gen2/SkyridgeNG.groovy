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
public enum SkyridgeNG implements LogicCardInfo {

  AERODACTYL_1 ("Aerodactyl", "1", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ALAKAZAM_2 ("Alakazam", "2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  ARCANINE_3 ("Arcanine", "3", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ARTICUNO_4 ("Articuno", "4", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  BEEDRILL_5 ("Beedrill", "5", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CROBAT_6 ("Crobat", "6", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DEWGONG_7 ("Dewgong", "7", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  FLAREON_8 ("Flareon", "8", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FORRETRESS_9 ("Forretress", "9", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GENGAR_10 ("Gengar", "10", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GYARADOS_11 ("Gyarados", "11", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HOUNDOOM_12 ("Houndoom", "12", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  JOLTEON_13 ("Jolteon", "13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  KABUTOPS_14 ("Kabutops", "14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  LEDIAN_15 ("Ledian", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MACHAMP_16 ("Machamp", "16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGCARGO_17 ("Magcargo", "17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MAGCARGO_18 ("Magcargo", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAGNETON_19 ("Magneton", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNETON_20 ("Magneton", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MOLTRES_21 ("Moltres", "21", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  NIDOQUEEN_22 ("Nidoqueen", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  OMASTAR_23 ("Omastar", "23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PILOSWINE_24 ("Piloswine", "24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POLITOED_25 ("Politoed", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  POLIWRATH_26 ("Poliwrath", "26", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  RAICHU_27 ("Raichu", "27", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  RAIKOU_28 ("Raikou", "28", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  RHYDON_29 ("Rhydon", "29", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  STARMIE_30 ("Starmie", "30", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  STEELIX_31 ("Steelix", "31", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  UMBREON_32 ("Umbreon", "32", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VAPOREON_33 ("Vaporeon", "33", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WIGGLYTUFF_34 ("Wigglytuff", "34", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  XATU_35 ("Xatu", "35", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  ELECTRODE_36 ("Electrode", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  KABUTO_37 ("Kabuto", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MACHOKE_38 ("Machoke", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MISDREAVUS_39 ("Misdreavus", "39", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  NOCTOWL_40 ("Noctowl", "40", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  OMANYTE_41 ("Omanyte", "41", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PERSIAN_42 ("Persian", "42", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PILOSWINE_43 ("Piloswine", "43", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  STARMIE_44 ("Starmie", "44", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WOBBUFFET_45 ("Wobbuffet", "45", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ABRA_46 ("Abra", "46", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BURIED_FOSSIL_47 ("Buried Fossil", "47", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CLEFFA_48 ("Cleffa", "48", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DELIBIRD_49 ("Delibird", "49", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  DIGLETT_50 ("Diglett", "50", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DITTO_51 ("Ditto", "51", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DUGTRIO_52 ("Dugtrio", "52", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  DUNSPARCE_53 ("Dunsparce", "53", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_54 ("Eevee", "54", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FARFETCH_D_55 ("Farfetch'd", "55", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  FORRETRESS_56 ("Forretress", "56", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GASTLY_57 ("Gastly", "57", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GIRAFARIG_58 ("Girafarig", "58", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GLIGAR_59 ("Gligar", "59", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GOLBAT_60 ("Golbat", "60", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRANBULL_61 ("Granbull", "61", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  GROWLITHE_62 ("Growlithe", "62", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  HAUNTER_63 ("Haunter", "63", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HERACROSS_64 ("Heracross", "64", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  HOOTHOOT_65 ("Hoothoot", "65", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  HOUNDOUR_66 ("Houndour", "66", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  IGGLYBUFF_67 ("Igglybuff", "67", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  JIGGLYPUFF_68 ("Jigglypuff", "68", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  KADABRA_69 ("Kadabra", "69", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  KAKUNA_70 ("Kakuna", "70", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LAPRAS_71 ("Lapras", "71", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  LEDYBA_72 ("Ledyba", "72", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LEDYBA_73 ("Ledyba", "73", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  MACHOP_74 ("Machop", "74", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  MAGIKARP_75 ("Magikarp", "75", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MAGNEMITE_76 ("Magnemite", "76", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  MANTINE_77 ("Mantine", "77", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MEOWTH_78 ("Meowth", "78", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MURKROW_79 ("Murkrow", "79", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  NATU_80 ("Natu", "80", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  NIDORAN_FEMALE_81 ("Nidoran♀", "81", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NIDORAN_FEMALE_82 ("Nidoran♀", "82", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NIDORINA_83 ("Nidorina", "83", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PIKACHU_84 ("Pikachu", "84", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  PINECO_85 ("Pineco", "85", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  PINECO_86 ("Pineco", "86", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  POLIWAG_87 ("Poliwag", "87", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWHIRL_88 ("Poliwhirl", "88", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RATICATE_89 ("Raticate", "89", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  RATTATA_90 ("Rattata", "90", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RHYHORN_91 ("Rhyhorn", "91", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSHREW_92 ("Sandshrew", "92", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SANDSLASH_93 ("Sandslash", "93", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SEEL_94 ("Seel", "94", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SEEL_95 ("Seel", "95", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SHUCKLE_96 ("Shuckle", "96", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SKARMORY_97 ("Skarmory", "97", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  SLUGMA_98 ("Slugma", "98", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SLUGMA_99 ("Slugma", "99", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SNORLAX_100 ("Snorlax", "100", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNUBBULL_101 ("Snubbull", "101", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  STANTLER_102 ("Stantler", "102", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  STARYU_103 ("Staryu", "103", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  STARYU_104 ("Staryu", "104", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SUNFLORA_105 ("Sunflora", "105", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SUNKERN_106 ("Sunkern", "106", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SWINUB_107 ("Swinub", "107", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWINUB_108 ("Swinub", "108", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  TEDDIURSA_109 ("Teddiursa", "109", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_110 ("Ursaring", "110", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  VENOMOTH_111 ("Venomoth", "111", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  VENONAT_112 ("Venonat", "112", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VOLTORB_113 ("Voltorb", "113", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  WEEDLE_114 ("Weedle", "114", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  WEEDLE_115 ("Weedle", "115", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  YANMA_116 ("Yanma", "116", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ZUBAT_117 ("Zubat", "117", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ZUBAT_118 ("Zubat", "118", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ANCIENT_RUINS_119 ("Ancient Ruins", "119", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  RELIC_HUNTER_120 ("Relic Hunter", "120", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  APRICORN_MAKER_121 ("Apricorn Maker", "121", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CRYSTAL_SHARD_122 ("Crystal Shard", "122", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  DESERT_SHAMAN_123 ("Desert Shaman", "123", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FAST_BALL_124 ("Fast Ball", "124", Rarity.UNCOMMON, [TRAINER]),
  FISHERMAN_125 ("Fisherman", "125", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FRIEND_BALL_126 ("Friend Ball", "126", Rarity.UNCOMMON, [TRAINER]),
  HYPER_POTION_127 ("Hyper Potion", "127", Rarity.UNCOMMON, [TRAINER]),
  LURE_BALL_128 ("Lure Ball", "128", Rarity.UNCOMMON, [TRAINER]),
  MIRACLE_SPHERE_ALPHA_129 ("Miracle Sphere Alpha", "129", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MIRACLE_SPHERE_BETA_130 ("Miracle Sphere Beta", "130", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MIRACLE_SPHERE_GAMMA_131 ("Miracle Sphere Gamma", "131", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MIRAGE_STADIUM_132 ("Mirage Stadium", "132", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  MYSTERY_PLATE_ALPHA_133 ("Mystery Plate Alpha", "133", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MYSTERY_PLATE_BETA_134 ("Mystery Plate Beta", "134", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MYSTERY_PLATE_GAMMA_135 ("Mystery Plate Gamma", "135", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MYSTERY_PLATE_DELTA_136 ("Mystery Plate Delta", "136", Rarity.UNCOMMON, [TRAINER, TECHNICAL_MACHINE]),
  MYSTERY_ZONE_137 ("Mystery Zone", "137", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ORACLE_138 ("Oracle", "138", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  STAR_PIECE_139 ("Star Piece", "139", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  UNDERGROUND_EXPEDITION_140 ("Underground Expedition", "140", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  UNDERGROUND_LAKE_141 ("Underground Lake", "141", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  BOUNCE_ENERGY_142 ("Bounce Energy", "142", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CYCLONE_ENERGY_143 ("Cyclone Energy", "143", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  RETRO_ENERGY_144 ("Retro Energy", "144", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CELEBI_145 ("Celebi", "145", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  CHARIZARD_146 ("Charizard", "146", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  CROBAT_147 ("Crobat", "147", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  GOLEM_148 ("Golem", "148", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  HO_OH_149 ("Ho-oh", "149", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  KABUTOPS_150 ("Kabutops", "150", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  ALAKAZAM_H1 ("Alakazam", "H1", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  ARCANINE_H2 ("Arcanine", "H2", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ARTICUNO_H3 ("Articuno", "H3", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  BEEDRILL_H4 ("Beedrill", "H4", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CROBAT_H5 ("Crobat", "H5", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DEWGONG_H6 ("Dewgong", "H6", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  FLAREON_H7 ("Flareon", "H7", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FORRETRESS_H8 ("Forretress", "H8", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GENGAR_H9 ("Gengar", "H9", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  GYARADOS_H10 ("Gyarados", "H10", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  HOUNDOOM_H11 ("Houndoom", "H11", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  JOLTEON_H12 ("Jolteon", "H12", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  KABUTOPS_H13 ("Kabutops", "H13", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  LEDIAN_H14 ("Ledian", "H14", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MACHAMP_H15 ("Machamp", "H15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  MAGCARGO_H16 ("Magcargo", "H16", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  MAGCARGO_H17 ("Magcargo", "H17", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  MAGNETON_H18 ("Magneton", "H18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGNETON_H19 ("Magneton", "H19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MOLTRES_H20 ("Moltres", "H20", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  NIDOQUEEN_H21 ("Nidoqueen", "H21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  PILOSWINE_H22 ("Piloswine", "H22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POLITOED_H23 ("Politoed", "H23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  POLIWRATH_H24 ("Poliwrath", "H24", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  RAICHU_H25 ("Raichu", "H25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  RAIKOU_H26 ("Raikou", "H26", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  RHYDON_H27 ("Rhydon", "H27", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  STARMIE_H28 ("Starmie", "H28", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  STEELIX_H29 ("Steelix", "H29", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  UMBREON_H30 ("Umbreon", "H30", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  VAPOREON_H31 ("Vaporeon", "H31", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  XATU_H32 ("Xatu", "H32", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SkyridgeNG(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SKYRIDGE;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case AERODACTYL_1:
      return evolution (this, from:"null", hp:HP070, type:F, retreatCost:2) {
        weakness W
        pokePower "Ancient Wind", {
          text "Once during your turn (before you attack) if Aerodactyl is your Active Pokémon, you may ignore all Poké-Bodies until the end of your turn. This power can't be used if Aerodactyl is affected by a Special Condition."
          actionA {
          }
        }
        move "Rising Lunge", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ALAKAZAM_2:
      return evolution (this, from:"Kadabra", hp:HP100, type:P, retreatCost:2) {
        weakness P
        pokePower "Energy Jump", {
          text "Once during your turn (before you attack) you may move an energy card from 1 of your Pokémon to another of your Pokémon. This power can't be used if Alakazam is affected by a Special Condition."
          actionA {
          }
        }
        move "Psychic", {
          text "30+ damage. This attack does 30 damage plus 10 more damage for each energy card attached to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ARCANINE_3:
      return evolution (this, from:"Growlithe", hp:HP080, type:R, retreatCost:2) {
        weakness W
        pokePower "Energy Recharge", {
          text "When you play Arcanine from your hand to evolve your Active Pokémon, you may flip 3 coins. For each heads, choose a basic energy card from your discard pile and attach it to Arcanine."
          actionA {
          }
        }
        move "Shake", {
          text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "White Flames", {
          text "70 damage. Discard all [R] Energy cards attached to Arcanine."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ARTICUNO_4:
      return basic (this, hp:HP080, type:W, retreatCost:2) {
        weakness M
        resistance F, MINUS30
        pokeBody "Water Immunity", {
          text "You can't attach [W] Energy cards from your hand to Articuno."
          delayedA {
          }
        }
        move "Freeze Solid", {
          text "10 damage. If there are any [W] Energy cards in your discard pile, flip a coin. If heads, attach 1 of them to Articuno."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ice Cyclone", {
          text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. If tails, this attack does 10 damage to each of your Pokémon in play. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case BEEDRILL_5:
      return evolution (this, from:"Kakuna", hp:HP080, type:G, retreatCost:null) {
        weakness R
        pokePower "Venom Spray", {
          text "When you play Beedrill from your hand to evolve your Active Pokémon, the Defending Pokémon is now Paralyzed and Poisoned."
          actionA {
          }
        }
        move "Needle Rush", {
          text "10+ damage. Flip 4 coins. If you get 1 heads, this attack does 10 damage plus 10 more damage. If you get 2 heads, this attack does 10 damage plus 20 more damage. If you get 3 heads, this attack does 10 damage plus 50 more damage. If you get 4 heads, this attack does 10 damage plus 90 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CROBAT_6:
      return evolution (this, from:"Golbat", hp:HP090, type:G, retreatCost:null) {
        weakness P
        pokePower "Carry Off", {
          text "Once during your turn (before you attack) you may flip a coin. If heads, look at your opponent's hand. If your opponent has and Baby Pokémon, Basic Pokémon, of Evolution cards there, choose 1 of them. Your opponent shuffles that card into his or her deck. This power can't be used if Crobat is affected by a Special Condition."
          actionA {
          }
        }
        move "Double Cross", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads. If both of them are tails, the defending Pokémon is now Confused and Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DEWGONG_7:
      return evolution (this, from:"Seel", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Freeze Lock", {
          text "20 damage. Flip a coin. If heads, your opponent can't attach Energy cards from his or her hand to his or her Active Pokémon during his or her next turn."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Crushing Ice", {
          text "40+ damage. This attack does 40 damage plus 10 more damage for each Energy in the Defending Pokémon's Retreat Cost. Damage is calculated using the Defending Pokémon's Retreat Cost after applying effects to the Retreat Cost."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case FLAREON_8:
      return evolution (this, from:"Eevee", hp:HP070, type:R, retreatCost:1) {
        weakness W
        pokeBody "Self Healing", {
          text "Whenever you attach a [R] Energy card from your hand to Flareon, remove all Special Conditions affecting Flareon."
          delayedA {
          }
        }
        move "Singe", {
          text "The Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Burn Booster", {
          text "40+ damage. Discard an Energy card attached to Flareon in order to use this attack. If the discarded card is a [R] Energy card, this attack does 40 damage plus 10 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case FORRETRESS_9:
      return evolution (this, from:"Pineco", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Spinning Blow", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads. If both coins are heads, switch Forretress with 1 of your Benched Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Scatterbomb", {
          text "40 damage. Flip 2 coins. For each heads, do 10 damage to each of your opponent's Benched Pokémon. For each tails, do 10 damage to each of your own Benched Pokémon. (Don't apply Weakness or Resistance for Benched Pokémon.)"
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GENGAR_10:
      return evolution (this, from:"Haunter", hp:HP100, type:P, retreatCost:2) {
        weakness null
        resistance F, MINUS30
        pokePower "Manipulate", {
          text "When you play Gengar from your hand to evolve your Active Pokémon, you may put a Basic Pokémon (excluding Baby Pokémon) from your discard pile onto your bench. Then flip 3 coins. For each heads, choose a basic Energy card from your discard pile and attach it to that Pokémon."
          actionA {
          }
        }
        move "Hydrokinesis", {
          text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Burned. If tails, the Defending Pokémon is now Confused."
          energyCost P, P, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GYARADOS_11:
      return evolution (this, from:"Magikarp", hp:HP090, type:W, retreatCost:2) {
        weakness L
        pokePower "Flame Vapor", {
          text "When you play Gyarados from your hand to evolve your Active Pokémon, you may flip 2 coins. For each heads, discard an Energy card attached to the Defending Pokémon."
          actionA {
          }
        }
        move "Dragon's Vengeance", {
          text "If Gyarados has 7 or more damage counters on it, this attack's base damage is 100."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HOUNDOOM_12:
      return evolution (this, from:"Houndour", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Ambush", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Lonely Fang", {
          text "30+ damage. This attack does 30 damage plus 20 damage times the number of your opponent's Benched Pokémon minus the number of your Benched Pokémon. (For example, if your opponent has 3 Benched Pokémon and you have 1, this attack will do 30 damage plus 40 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case JOLTEON_13:
      return evolution (this, from:"Eevee", hp:HP070, type:L, retreatCost:null) {
        weakness F
        pokeBody "Self Healing", {
          text "Whenever you attach a [L] Energy card from your hand to Jolteon, remove all Special Conditions affecting Jolteon."
          delayedA {
          }
        }
        move "Thundershock", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Thunderspark", {
          text "40 damage. This attack does 10 damage to each Benched Pokémon with at least 1 Energy card attached to it (yours and your opponent's)."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KABUTOPS_14:
      return evolution (this, from:"Kabuto", hp:HP090, type:F, retreatCost:2) {
        weakness G
        pokeBody "Primal Aura", {
          text "As long as Kabutops is your Active Pokémon, neither player can play Basic Pokémon or Evolution cards from his or her hand to evolve Benched Pokémon."
          delayedA {
          }
        }
        move "Dual Cut", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case LEDIAN_15:
      return evolution (this, from:"Ledyba", hp:HP070, type:G, retreatCost:null) {
        weakness R
        move "Pollen Shield", {
          text "10 damage. During your opponent's next turn, Ledian can't become affected by a Special Condition. (Any other effect of attacks, Poké"
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Swift", {
          text "50 damage. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MACHAMP_16:
      return evolution (this, from:"Machoke", hp:HP120, type:F, retreatCost:2) {
        weakness P
        pokeBody "Immunity", {
          text "Prevent all effects of your opponent's attacks done to Machamp."
          delayedA {
          }
        }
        move "Drag Off", {
          text "20 damage. Before doing damage, if your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon. If your opponent has no Benched Pokémon, ignore this effect."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hurricane Punch", {
          text "30x damage. Flip 4 coins. This attack does 30 damage times the number of heads."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MAGCARGO_17:
      return evolution (this, from:"Slugma", hp:HP080, type:R, retreatCost:3) {
        weakness W
        move "Eruption", {
          text "20+ damage. Each player discards the top card of his or her deck. This attack does 20 damage plus 20 more damage for each Energy card discarded in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Fire Stream", {
          text "60 damage. Discard a [R] Energy card attached to Magcargo in order to use this attack. If your opponent has any Benched Pokémon, this attack does 10 damage to each of them. (Don't apply Weakness or Resistance for Benched Pokémon.)"
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MAGCARGO_18:
      return evolution (this, from:"Slugma", hp:HP080, type:F, retreatCost:3) {
        weakness W
        pokePower "Streaming Mantle", {
          text "When you play Magcargo from your hand to evolve your Active Pokémon, you may discard the top 3 cards of your deck and then shuffle 3 basic energy cards from your discard pile into your deck. If you do, your opponent must do the same."
          actionA {
          }
        }
        move "Crushing Lava", {
          text "40+ damage. You may discard a Fire or Fighting basic Energy card attached to Magcargo. If you discard a [R] Energy card in this way, the Defending Pokémon is now Burned. If you discard a [F] Energy card in this way, this attack does 40 damage plus 20 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MAGNETON_19:
      return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:1) {
        weakness F
        pokePower "Attract Energy", {
          text "When you play Magneton from your hand to evolve 1 of your Pokémon, you may move any number of basic Energy cards attached to your other Pokémon to Magneton."
          actionA {
          }
        }
        move "Electric Blast", {
          text "40 damage. You may discard all [L] Energy cards attached to Magneton when you use this attack. If you do, put damage counters equal to the amount of Energy cards removed in this way on any number of your opponent's Benched Pokémon in the way you like. (For example, if you discard 3 [L] Energy cards, you can put 1 damage counter on 1 of your opponent's Benched Pokémon and 2 on another.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MAGNETON_20:
      return evolution (this, from:"Magnemite", hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Bounce Off", {
          text "20 damage. If Magneton and the Defending Pokémon don't have the same number of Energy cards attached to them, the player controlling the Active Pokémon with the fewest number of Energy cards attached to it switches 1 of his or her Benched Pokémon with his or her Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnetic Wave", {
          text "30+ damage. This attack does 30 damage plus 10 more damage times the number of your Benched Pokémon minus the number of your opponent's Benched Pokémon. (For example, if your opponent has 1 Benched Pokémon and you have 3, this attack will do 30 damage plus 20 more damage.)"
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MOLTRES_21:
      return basic (this, hp:HP080, type:R, retreatCost:2) {
        weakness W
        resistance F, MINUS30
        pokeBody "Fire Immunity", {
          text "You can't attach [R] Energy cards from your hand to Moltres."
          delayedA {
          }
        }
        move "Collect Fire", {
          text "10 damage. If there are any [R] Energy cards in your discard pile, flip a coin. If heads, attach 1 of them to Moltres."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Burning Tail", {
          text "60 damage. Flip a coin. If tails, discard a [R] Energy card attached to Moltres."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case NIDOQUEEN_22:
      return evolution (this, from:"Nidorina", hp:HP110, type:G, retreatCost:3) {
        weakness P
        pokePower "Evolution Helper", {
          text "Once during your turn (before you attack) if Nidoqueen is on your bench, you may search your deck for a card that evolves from your Active Pokémon and attach it to your Active Pokémon. (this counts as evolving that Pokémon) Shuffle your deck afterward."
          actionA {
          }
        }
        move "Double Claw", {
          text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case OMASTAR_23:
      return evolution (this, from:"Omanyte", hp:HP090, type:W, retreatCost:2) {
        weakness L
        pokeBody "Primal Stare", {
          text "As long as Omastar is your Active Pokémon, your opponent can't play Basic Pokémon or Evolution cards from his or her hand to evolve his or her Active Pokémon."
          delayedA {
          }
        }
        move "Spook", {
          text "50 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case PILOSWINE_24:
      return evolution (this, from:"Swinub", hp:HP090, type:W, retreatCost:3) {
        weakness M
        move "Freezing Breath", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Trample", {
          text "40 damage. For each Benched Pokémon (yours and your opponent's), flip a coin. If heads, this attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case POLITOED_25:
      return evolution (this, from:"Poliwhirl", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Sudden Growth", {
          text "Attach any number of basic Energy cards from your hand to Politoed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Frog Hop", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Energy Splash", {
          text "70 damage. Move 2 [W] Energy cards attached to Politoed to 1 or 2 of your Benched Pokémon. (You may put both on the same Pokémon, or 1 each on 2 different Pokémon.) If you have no Benched Pokémon, ignore this effect."
          energyCost W, W, C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case POLIWRATH_26:
      return evolution (this, from:"Poliwhirl", hp:HP110, type:F, retreatCost:2) {
        weakness P
        pokePower "Strange Spiral", {
          text "Once during your turn (before you attack), if Poliwrath if your Active Pokémon, you may discard a basic Energy card attached to Poliwrath. If you do, the Defending Pokémon is now Confused. This power can't be used if Poliwrath is affected by a Special Condition."
          actionA {
          }
        }
        move "Spiral Punch", {
          text "40+ damage. Flip a coin until you get tails. This attack does 40 damage plus 20 more damage for each heads."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case RAICHU_27:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Zzzap", {
          text "This attack does 20 damage to each Pokémon with a Poké-Body or Poké-Power (yours and your opponent's). (Don't apply Weakness or Resistance.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lightning Storm", {
          text "50 damage. Flip a coin. If tails, put 2 damage counters on Raichu."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAIKOU_28:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness R
        pokeBody "Pure Body", {
          text "To attach a [L] Energy card from your hand to Raikou, you must discard an Energy card attached to Raikou. (Attach the Lightning energy, and then discard an Energy card from Raikou.)"
          delayedA {
          }
        }
        move "Lightning Sphere", {
          text "40+ damage. You may flip a coin. If heads, discard all [L] Energy cards attached to Raikou. This attack does 40 damage plus 20 more damage for each Energy card discarded in this way."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case RHYDON_29:
      return evolution (this, from:"Rhyhorn", hp:HP090, type:F, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Stomp", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giant Tail", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost F, F, C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case STARMIE_30:
      return evolution (this, from:"Staryu", hp:HP080, type:P, retreatCost:1) {
        weakness P
        move "Energy Burst", {
          text "10x damage. Flip a coin. If heads, this attack does 10 damage times the number of Energy cards attached to Starmie and the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Star Back", {
          text "40 damage. Attach a basic Energy card from your discard pile to 1 of your Pokémon."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case STEELIX_31:
      return evolution (this, from:"Onix", hp:HP100, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        pokeBody "Rare Metal", {
          text "All basic Energy cards attached to Steelix provide [M] Energy instead of their usual types."
          delayedA {
          }
        }
        move "Squeeze", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage and the Defending Pokémon is now Paralyzed."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Metal Tail", {
          text "Before doing damage, you may flip a coin. If heads, this attack does 80 damage. If tails, this attack does nothing."
          energyCost M, M, M, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case UMBREON_32:
      return evolution (this, from:"Eevee", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokeBody "Dark Gaze", {
          text "As long as Umbreon is your Active Pokémon, Benched Pokémon (yours and your opponent's) can't use Poké-Powers."
          delayedA {
          }
        }
        move "Sharp Claws", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VAPOREON_33:
      return evolution (this, from:"Eevee", hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Self Healing", {
          text "Whenever you attach a [W] Energy card from your hand to Vaporeon, remove all Special Conditions affecting Vaporeon."
          delayedA {
          }
        }
        move "Hypnosplash", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Trick", {
          text "40 damage. If the Defending Pokémon has any Energy cards attached to it, flip a coin. If heads, choose 1 of those Energy cards and move it to 1 of your opponent's Benched Pokémon. If your opponent has no Benched Pokémon, ignore this effect."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case WIGGLYTUFF_34:
      return evolution (this, from:"Jigglypuff", hp:HP070, type:C, retreatCost:1) {
        weakness F
        pokePower "Good Neighbor", {
          text "Once during your turn (before you attack), if Wigglytuff is on your bench, you may flip a coin. If heads, each player removes up to 2 damage counters from his or her Active Pokémon. This power can't be used if you have already used another Wigglytuff's Good Neighbor Poké-Power this turn."
          actionA {
          }
        }
        move "Do the Wave", {
          text "10x damage. Flip a coin. If heads, this attack does 10 damage times the number of Pokémon you have in play."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case XATU_35:
      return evolution (this, from:"Natu", hp:HP080, type:P, retreatCost:1) {
        weakness P
        pokeBody "Synchronicity", {
          text "You may attach any Technical Machine to Xatu."
          delayedA {
          }
        }
        move "Warp Hole", {
          text "30 damage. Flip a coin. If heads, choose a card from your discard pile and put it on top of your deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ELECTRODE_36:
      return evolution (this, from:"Voltorb", hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Plasma", {
          text "20 damage. If there are any [L] Energy cards in your discard pile, flip a coin. If heads, attach 1 of them to Electrode."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Self destruct", {
          text "100 damage. This attack does 20 damage to each Pokémon on each player's bench. (Don't apply Weakness and Resistance for Benched Pokémon) Electrode does 100 damage to itself."
          energyCost L, L, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case KABUTO_37:
      return evolution (this, from:"null", hp:HP050, type:F, retreatCost:1) {
        weakness G
        pokeBody "Thick Shell", {
          text "All damage done by attacks to Kabuto from Evolved Pokémon is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Scratch", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MACHOKE_38:
      return evolution (this, from:"Machop", hp:HP080, type:F, retreatCost:1) {
        weakness P
        move "Focus Energy", {
          text "During your next turn, Machoke's Mega Punch attack's base damage is 80."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Mega Punch", {
          text "40 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case MISDREAVUS_39:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        move "Hypnoblast", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Gift of Spite", {
          text "Count the number of your Pokémon in play with damage counters on them. Put that many damage counters on the Defending Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case NOCTOWL_40:
      return evolution (this, from:"Hoothoot", hp:HP070, type:C, retreatCost:null) {
        weakness L
        resistance F, MINUS30
        pokePower "Investigate", {
          text "Once during your turn (before you attack) you may look at the top 2 cards of any player's deck or at to up 2 of any player's Prizes. Put any cards you looked at back in the same order. This power can't be used if Noctowl is affected by a Special Condition."
          actionA {
          }
        }
        move "Triple Smash", {
          text "10+ damage. Flip 3 coins. This attack does 10 damage plus 10 more damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case OMANYTE_41:
      return evolution (this, from:"null", hp:HP060, type:W, retreatCost:null) {
        weakness L
        resistance W, MINUS30
        move "Water of Evolution", {
          text "Put an Omastar from your hand onto Omanyte. This counts as evolving Omanyte."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Drag Off", {
          text "20 damage. Before doing damage, you may choose 1 of your opponent's Benched Pokémon and switch it with the Defending Pokémon."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PERSIAN_42:
      return evolution (this, from:"Meowth", hp:HP070, type:C, retreatCost:null) {
        weakness F
        move "Surprise Slash", {
          text "20 damage. Flip a coin. If heads look at your opponent's hand. If he or she has any Trainer cards there, choose 1 of them. Your opponent shuffles that card into his or her deck."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lunge", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PILOSWINE_43:
      return evolution (this, from:"Swinub", hp:HP080, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Impaling Tusk", {
          text "40 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Continuous Charge", {
          text "30+ damage. Flip 4 coins. This attack foes 30 damage plus 20 more damage for each heads. Put a damage counter on Piloswine for each heads."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case STARMIE_44:
      return evolution (this, from:"Staryu", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "10+ damage. This attack does 10 damage plus 20 more damage for each Energy attached to Starmie but not used to pay for this attack's energy cost. You can't add more than 40 damage in this way."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Core Blast", {
          text "30+ damage. This attack does 30 damage plus 20 more damage for each Special Energy card attached to the Defending Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WOBBUFFET_45:
      return basic (this, hp:HP070, type:P, retreatCost:2) {
        weakness P
        pokeBody "Mirror Coat", {
          text "If Wobbuffet becomes Poisoned or Burned by the Defending Pokémon's attack during your opponent's turn, the Defending Pokémon becomes affected by the same Special Condition."
          delayedA {
          }
        }
        move "Return Attack", {
          text "10x damage. Flip 2 coins. If either is heads, this attack does 10 damage times the number of damage counters on Wobbuffet."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ABRA_46:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Psychoflow", {
          text "As long as there is a [P] Energy card attached to Abra, its Retreat Cost is 0."
          delayedA {
          }
        }
        move "Headbutt", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case BURIED_FOSSIL_47:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        pokePower "Reconstruction", {
          text "Once during your turn (before your attack), if you have a basic Energy card in your hand, you may search your deck for an Omanyte or Kabuto card, show it to your opponent, and put it into your hand. Then put a basic Energy card from your hand into your deck. Shuffle your deck afterward."
          actionA {
          }
        }

      };
      case CLEFFA_48:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        move "Energy Recycle", {
          text "Shuffle a basic Energy card from your discard pile into your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DELIBIRD_49:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Limited Delivery", {
          text "Search your deck for a Technical Machine or Pokémon Tool card show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Kick Away", {
          text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. (Do the damage before switching Pokémon.)"
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DIGLETT_50:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Burrow", {
          text "10 damage. Flip a coin. If heads, prevent all damage done by attacks to Diglett during your opponent's next turn. (Any other effects of attack still happen.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case DITTO_51:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        pokeBody "Prismatic Body", {
          text "Each basic Energy card attached to Ditto provides every type of Energy but provides only 1 Energy at a time."
          delayedA {
            getterA GET_ENERGY_TYPES, self, { holder->
              if ((holder.effect as GetEnergyTypes).card instanceof BasicEnergyCard) {
                holder.object = [valuesPokemon() as Set]
              }
            }
          }
        }
        move "Copy", {
          text "Choose 1 of the Defending Pokémon's attacks. Copy copies that attack. This attack does nothing if Ditto doesn't have the Energy necessary to use that attack. (You must still do anything else required in order to use that attack.)"
          energyCost C
          onAttack {
            metronome keepEnergyRequirement: true, defending, delegate
          }
        }
      };
      case DUGTRIO_52:
      return evolution (this, from:"Diglett", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Burrow", {
          text "20 damage. Flip a coin. If heads, prevent all damage done by attacks to Dugtrio during your opponent's next turn. (any other effects of attacks still happen.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Dig Under", {
          text "30 damage. Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. Don't apply Weakness or Resistance. (any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case DUNSPARCE_53:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        pokeBody "Slippery Skin", {
          text "As long as the Defending Pokémon is an Evolved Pokémon, Dunsparce's Retreat Cost is 0."
          delayedA {
          }
        }
        move "Tail Shake", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case EEVEE_54:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Smash Kick", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "30 damage. Eevee does 10 damage to itself"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FARFETCH_D_55:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Whirlwind", {
          text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Leek Rush", {
          text "10x damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case FORRETRESS_56:
      return evolution (this, from:"Pineco", hp:HP070, type:G, retreatCost:2) {
        weakness R
        pokeBody "Exoskeleton", {
          text "All damage done by attacks to Forretress is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Shell Rupture", {
          text "10 damage. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Spin", {
          text "40x damage. Flip 2 coins. This attack does 40 damage times the number of heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GASTLY_57:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        move "Haunt", {
          text "10 damage. Put a damage counter on the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GIRAFARIG_58:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness P
        move "Energy Patch", {
          text "Take a basic Energy card attached to 1 of your Pokémon and attach it to another of your Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Syncroblast", {
          text "If Girafarig and the Defending Pokémon don't have the same number of Energy cards attached to them, this attack's base damage is 10 instead of 40."
          energyCost P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GLIGAR_59:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Irongrip", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sharp Stinger", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
          energyCost F, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case GOLBAT_60:
      return evolution (this, from:"Zubat", hp:HP070, type:G, retreatCost:1) {
        weakness P
        move "Poison Sound Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Strength in Numbers", {
          text "30+ damage. This attack does 30 damage plus 10 more damage for each Zubat, Golbat, and Crobat on your bench."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRANBULL_61:
      return evolution (this, from:"Snubbull", hp:HP080, type:C, retreatCost:1) {
        weakness F
        move "Fling", {
          text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mega Punch", {
          text "50 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GROWLITHE_62:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "10 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Kick", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case HAUNTER_63:
      return evolution (this, from:"Gastly", hp:HP070, type:P, retreatCost:1) {
        weakness null
        resistance F, MINUS30
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Shadow Hand", {
          text "30 damage. You may discard up to 2 cards from your hand. If you do, draw that many cards."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HERACROSS_64:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Slash", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Angry Horn", {
          text "If there are 4 or more damage counters on Heracross, this attack's base damage is 50 instead of 30."
          energyCost G, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HOOTHOOT_65:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Hypnosis", {
          text "The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Eerie Light", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case HOUNDOUR_66:
      return basic (this, hp:HP050, type:R, retreatCost:1) {
        weakness W
        move "Retaliate", {
          text "10x damage. This attack does 10 damage times the number of damage counters on Houndour."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fireworks", {
          text "20 damage. Flip a coin. If tails, discard a [R] Energy card attached to Houndour."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case IGGLYBUFF_67:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        move "Energy Heal", {
          text "Choose 1 of your Pokémon with an Energy card attached to it. Remove 1 damage counter from that Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case JIGGLYPUFF_68:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Nap", {
          text "Remove 1 damage counter from Jigglypuff"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lullaby", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case KADABRA_69:
      return evolution (this, from:"Abra", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Nightmare", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Mind Shock", {
          text "40 damage. Don't apply Weakness and Resistance."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KAKUNA_70:
      return evolution (this, from:"Weedle", hp:HP070, type:G, retreatCost:2) {
        weakness R
        pokeBody "Exoskeleton", {
          text "All damage done to Kakuna is reduced by 10 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Poisonpowder", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LAPRAS_71:
      return basic (this, hp:HP060, type:W, retreatCost:2) {
        weakness M
        move "Assist", {
          text "Search your deck for a Supporter card, show it to your opponent and put it into your hand. Shuffle your deck afterward."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Hypnoblast", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case LEDYBA_72:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Teary Eyes", {
          text "During your opponent's next turn, any damage done to Ledyba is reduced by 20."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Turn", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case LEDYBA_73:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Gnaw", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Slam", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MACHOP_74:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness P
        move "Smash Punch", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Fling", {
          text "20 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. (Do the damage before switching the Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGIKARP_75:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Signs of Evolution", {
          text "Flip a coin. If heads, search your deck for a card that evolves from Magikarp, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Splash", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MAGNEMITE_76:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Magnetic Lines", {
          text "10 damage. If the Defending Pokémon has any basic Energy cards attached to it, flip a coin. If heads, choose 1 of those Energy cards and move it to 1 of your opponent's Benched Pokémon. If your opponent has no Benched Pokémon, ignore this effect."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MANTINE_77:
      return basic (this, hp:HP060, type:W, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Fin Smack", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Aqua Sonic", {
          text "30 damage. Don't apply Weakness and Resistance."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MEOWTH_78:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Sudden Swipe", {
          text "10 damage. Flip a coin. If heads, look at your opponent's hand. If he or she has any Energy cards there, choose 1 of them. Your opponent shuffles that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MURKROW_79:
      return basic (this, hp:HP050, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Evil Eye", {
          text "10 damage. Choose 1 of your opponent's Pokémon. Put a damage counter on that Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Blindside", {
          text "Choose 1 of your opponent's Pokémon that has a damage counter on it. This attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case NATU_80:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        move "Foresight", {
          text "Look at the top 3 cards of either player's deck and rearrange them as you like."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Removal Beam", {
          text "20 damage. If the Defending Pokémon has any Energy cards attached to it, flip a coin. If heads, choose one of those Energy cards and discard it."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NIDORAN_FEMALE_81:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon card named Nidoran M or Nidoran F and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your bench is full.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Scratch", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case NIDORAN_FEMALE_82:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Poison Sting", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case NIDORINA_83:
      return evolution (this, from:"Nidoran♀", hp:HP080, type:G, retreatCost:2) {
        weakness P
        move "Tackle", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Poison Claws", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PIKACHU_84:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Max Voltage", {
          text "20+ damage. Discard all [L] Energy cards attached to Pikachu. This attack does 20 damage plus 10 more damage for each Energy card discarded in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PINECO_85:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Surprise Attack", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case PINECO_86:
      return basic (this, hp:HP050, type:G, retreatCost:null) {
        weakness R
        move "Double-edge", {
          text "30 damage. Pineco does 10 damage to itself."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case POLIWAG_87:
      return basic (this, hp:HP040, type:W, retreatCost:null) {
        weakness L
        move "Sleep Bubble", {
          text "10 damage. The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
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
      case POLIWHIRL_88:
      return evolution (this, from:"Poliwag", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Twiddle", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Double Kick", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RATICATE_89:
      return evolution (this, from:"Rattata", hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Scratch", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Continuous Bite", {
          text "10+ damage. Flip 3 coins. If you get 1 heads, this attack does 10 damage plus 10 more damage. If you get 2 heads, this attack does 10 damage plus 30 more damage. If you get 3 heads, this attack does 10 damage plus 60 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case RATTATA_90:
      return basic (this, hp:HP030, type:C, retreatCost:1) {
        weakness F
        move "Call for Friends", {
          text "Search your deck for a Baby Pokémon or Basic Pokémon and put it onto your bench. Shuffle your deck afterward. (You can't use this attack it your bench is full.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Body Slam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case RHYHORN_91:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Horn Attack", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Retaliate", {
          text "10x damage. This attack does 10 damage times the number of damage counters on Rhyhorn."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SANDSHREW_92:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Double Scratch", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Dig Under", {
          text "10 damage. Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. Don't apply Weakness and Resistance. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SANDSLASH_93:
      return evolution (this, from:"Sandshrew", hp:HP070, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Sand Trap", {
          text "10 damage. If your opponent has any Benched Pokémon, choose up to 2 of them. This attack does 10 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Needle Rush", {
          text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads. If you get at least 1 heads, the Defending Pokémon is now Poisoned."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SEEL_94:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Cold Breath", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SEEL_95:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Double Headbutt", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ice Beam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SHUCKLE_96:
      return basic (this, hp:HP030, type:G, retreatCost:2) {
        weakness R
        pokeBody "Vase Body", {
          text "All damage done to Shuckle is reduced by 20 (after applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Poisonous Saliva", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SKARMORY_97:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Double Peck", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Spinning Head", {
          text "30 damage. Flip a coin. If heads, switch Skarmory with 1 of your Benched Pokémon."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SLUGMA_98:
      return basic (this, hp:HP050, type:R, retreatCost:2) {
        weakness W
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Scorching Lava", {
          text "Discard a [R] Energy card attached to Slugma in order to use this attack. The Defending Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SLUGMA_99:
      return basic (this, hp:HP050, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "10 damage. The Defending Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SNORLAX_100:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness F
        pokePower "Lolling About", {
          text "Once during your turn (before you attack) if Snorlax is your Active Pokémon, you may remove 1 damage counter from Snorlax. Snorlax is now Asleep. This power can't be used if Snorlax is affected by a Special Condition."
          actionA {
          }
        }
        move "Continuous Tumble", {
          text "30x damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SNUBBULL_101:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        move "Scary Face", {
          text "Flip a coin. If heads, until the end of your opponent's next turn the Defending Pokémon can't Retreat."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case STANTLER_102:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Threaten", {
          text "Flip a coin. If heads, look at your opponent's hand. If he or she has any Trainer cards there, choose 1 of them. Your opponent shuffles that card back into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Antler Swipe", {
          text "Flip a coin. If heads, this attack does 20 damage to the Defending Pokémon (Don't apply Weakness and Resistance) If tails, your and opponent has any Benched Pokémon, choose 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case STARYU_103:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Energy Healing", {
          text "Remove 2 damage counters from Staryu for each energy attached to it. If it has fewer damage counters than that, remove all of them."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Doubleslap", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case STARYU_104:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Slap", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SUNFLORA_105:
      return evolution (this, from:"Sunkern", hp:HP070, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Energy Plant", {
          text "Search your deck for a basic Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
          energyCost G, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Trip Over", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SUNKERN_106:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        resistance W, MINUS30
        move "Rollout", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Blot", {
          text "10 damage. If there are any damage counters on Sunkern, remove 1 of them."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SWINUB_107:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness M
        move "Ram", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Freezing Breath", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed. If tails, the Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      };
      case SWINUB_108:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Mud Slap", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Overrun", {
          text "10 damage. If your opponent has nay Benched Pokémon, flip a coin. If heads, choose 1 of them and this attack does 10 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case TEDDIURSA_109:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Surprise Attack", {
          text "Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rage", {
          text "10+ damage. This attack does 10 damage plus 10 more damage for each damage counter on Teddiursa."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case URSARING_110:
      return evolution (this, from:"Teddiursa", hp:HP080, type:C, retreatCost:2) {
        weakness F
        move "Bear Hug", {
          text "30 damage. The Defending Pokémon can't Retreat during your opponent's next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Rend", {
          text "40+ damage. If the Defending Pokémon has any damage counters on it, this attack does 40 damage plus 20 more damage. If not, this attack does 40 damage."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case VENOMOTH_111:
      return evolution (this, from:"Venonat", hp:HP070, type:G, retreatCost:null) {
        weakness R
        move "Healing Dust", {
          text "Flip 2 coins. For each heads, remove 1 damage counter from each of your Pokémon. If a Pokémon has fewer damage counters than the number of heads, remove all of them."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Miracle Powder", {
          text "Flip a coin. If heads, choose a Special Condition (Asleep, Burned, Confused, Paralyzed, or Poisoned). The Defending Pokémon is now affected by that Special Condition."
          energyCost G, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case VENONAT_112:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Double Spin", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Supersonic", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VOLTORB_113:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Magnetic Pull", {
          text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Spin Tackle", {
          text "30 damage. Voltorb does 10 damage to itself."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case WEEDLE_114:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Fury Attack", {
          text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case WEEDLE_115:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Entangling Thread", {
          text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Horn", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
      };
      case YANMA_116:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Agility", {
          text "10 damage. Flip a coin. If heads, during your opponent's next turn prevent all effects of attacks, including damage, done to Yanma."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Triple Smash", {
          text "20+ damage. Flip 3 coins. This attack does 20 damage plus 10 more damage for each heads."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ZUBAT_117:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Sound Waves", {
          text "Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flitter", {
          text "10 damage. Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. Don't apply Weakness and Resistance. (Any other effects that would happen after applying Weakness and Resistance still happen.)"
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ZUBAT_118:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness P
        move "Wing Attack", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Spray", {
          text "20 damage. The Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ANCIENT_RUINS_119:
      return stadium (this) {
        text "Once during each player's turn (before he or she attacks), if he or she has not played a Supporter card, that player may reveal his or her hand to his or her opponent. If that player reveals his or her hand and there is no Supporter card there, that player draws a card."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case RELIC_HUNTER_120:
      return supporter (this) {
        text "Search your deck for up to 2 Supporter and/or Stadium cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case APRICORN_MAKER_121:
      return supporter (this) {
        text "Search your deck for up to 2 Trainer cards with Ball in their names, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case CRYSTAL_SHARD_122:
      return pokemonTool (this) {
        text "As long as this card is attached to a Pokémon, that Pokémon's type (color) is [C]. If that Pokémon attacks, discard this card at the end of the turn."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case DESERT_SHAMAN_123:
      return supporter (this) {
        text "Shuffle your hand into your deck and draw up to 4 cards. You opponent does the same."
        onPlay {
        }
        playRequirement{
        }
      };
      case FAST_BALL_124:
      return basicTrainer (this) {
        text "Reveal cards from your deck until you reveal an Evolution card. Show that card to your opponent and put it into your hand. Shuffle the other revealed cards into your deck. (If you don't reveal an Evolution card, shuffle all the revealed cards back into your deck.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case FISHERMAN_125:
      return supporter (this) {
        text "Choose 4 basic Energy cards from your discard pile (if there are fewer basic Energy cards than 4, take all of them), show them to your opponent, and put them into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case FRIEND_BALL_126:
      return basicTrainer (this) {
        text "Choose 1 of your opponent's Pokémon. Search your deck for a Baby Pokémon, Basic Pokémon, of Evolution card of the same type (color), show it to your opponent, and put it into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      };
      case HYPER_POTION_127:
      return basicTrainer (this) {
        text "Choose 1 of your Pokémon. Discard 1 or 2 basic Energy cards attached to that Pokémon. If you discarded 1 Energy card, remove up to 3 damage counters from that Pokémon. If you discarded 2 Energy cards, remove up to 5 damage counters from that Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case LURE_BALL_128:
      return basicTrainer (this) {
        text "Flip 3 coins. For each heads, choose an Evolution card from your discard pile, show it to your opponent, and put it into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case MIRACLE_SPHERE_ALPHA_129:
      return basicTrainer (this) {
        text "If the Pokémon using this attack has and Energy cards attached to it, the Defending Pokémon is now Confused. If the Pokémon using this attack has and basic Energy cards attached to it, this attack does 30 damage plus 10 more damage and removes 3 damage counters from the Pokémon that Miracle Sphere alpha is attached to."
        onPlay {
        }
        playRequirement{
        }
      };
      case MIRACLE_SPHERE_BETA_130:
      return basicTrainer (this) {
        text "If the Pokémon using this attack has and basic Energy cards attached to it, this attack does 30 damage plus 10 more damage and the Defending Pokémon is now Burned. If the Pokémon using this attack has and basic Energy cards attached to it, choose an Energy card attached to the Defending Pokémon, if any, and your opponent shuffles that card into his or her deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case MIRACLE_SPHERE_GAMMA_131:
      return basicTrainer (this) {
        text "If the Pokémon using this attack has and basic Energy cards attached to it, the Defending Pokémon is now Asleep and Poisoned. If the Pokémon using this attack has and basic Energy cards attached to it, this attack does 30 damage plus 10 more damage and lets you put 1 damage counter on each of your opponent's Benched Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case MIRAGE_STADIUM_132:
      return stadium (this) {
        text "Whenever a player tries to Retreat a Pokémon during his or her turn, that player flips a coin. If heads, that player retreats that Pokémon (and discards Energy normally). If tails, that Pokémon can't Retreat this turn (the player doesn't discard any Energy)."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case MYSTERY_PLATE_ALPHA_133:
      return basicTrainer (this) {
        text "If your opponent has 5 or more Prizes, search your deck for a Trainer card, show it to your opponent, and put it into your hand. If your opponent has only 1 Prize, the Defending Pokémon is now Burned, Paralyzed, and Poisoned."
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERY_PLATE_BETA_134:
      return basicTrainer (this) {
        text "If your opponent has 5 or more Prizes, draw 3 cards. If your opponent has only 1 Prize, choose 2 Energy cards attached to the Defending Pokémon (1 if it has only 1). Your opponent shuffles those cards into his or her deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERY_PLATE_GAMMA_135:
      return basicTrainer (this) {
        text "If your opponent has 5 or more Prizes, shuffle your hand into your deck and then draw 6 cards. If your opponent has exactly 2 Prizes, choose 1 of your opponent's Evolved Pokémon. Your opponent puts the top card on that Evolved Pokémon on the bottom of his or her deck. (This counts as devolving that Pokémon.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERY_PLATE_DELTA_136:
      return basicTrainer (this) {
        text "If your opponent has 5 or more Prizes, search your deck for up to 3 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward. If your opponent has exactly 2 Prizes, remove all damage counters from 1 of your Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case MYSTERY_ZONE_137:
      return stadium (this) {
        text "Once during each player's turn (before he or she attacks), if that player has an Evolution card in his or her hand, he or she may search his or her deck for a basic Energy card, show it to his or her opponent, and put it into his or her hand. Then that player chooses an Evolution card from his or her hand, shows it to his or her opponent, and puts it into his or her deck. That player shuffles his or her deck afterward."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case ORACLE_138:
      return supporter (this) {
        text "Choose 2 cards from your deck and shuffle the rest of your deck. Put the chosen cards in top of your deck in any order."
        onPlay {
        }
        playRequirement{
        }
      };
      case STAR_PIECE_139:
      return pokemonTool (this) {
        text "At any time between turns, if the Pokémon this card is attached to is Benched and has 2 or more damage counters in it, search your deck for an Evolution card that Pokémon evolves into and put it on top of that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward. Then, discard Star Piece."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case UNDERGROUND_EXPEDITION_140:
      return supporter (this) {
        text "Look at the bottom 4 cards if your deck. Put 2 of those cards into your hand, and then return the remaining cards to the bottom of your deck in any order."
        onPlay {
        }
        playRequirement{
        }
      };
      case UNDERGROUND_LAKE_141:
      return stadium (this) {
        text "Once during each player's turn, that player may put an Omanyte or Kabuto card from his or her discard pile onto his or her Bench. (Cards put on the Bench in this way are considered Basic Pokémon.)"
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case BOUNCE_ENERGY_142:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] [C] Energy. You can attach this card to your Pokémon that has basic Energy cards attached to it. When you play this card from your hand and attach it to 1 of your Pokémon, return a basic Energy card attached to that Pokémon to your hand."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CYCLONE_ENERGY_143:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy. When you play this card from your hand and attach it to your Active Pokémon, your opponent switches his or her Active Pokémon with 1 of his or her Benched Pokémon."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case RETRO_ENERGY_144:
      return specialEnergy (this, [[C]]) {
        text "This card provides [C] Energy. When you play this card from your hand and attach it to 1 of your Evolved Pokémon, you may remove up to 2 damage counters from that Pokémon and discard the top card from it. (This counts as devolving it.)"
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case CELEBI_145:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness R
        pokeBody "Crystal Type", {
          text "Whenever you attach a Grass, Water, or Psychic basic Energy card from your hand to Celebi, Celebi's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Empathetic Healing", {
          text "Remove 2 damage counters from Celebi and each Pokémon that's the same type (color) as Celebi."
          energyCost G, W
          attackRequirement {}
          onAttack {

          }
        }
        move "Mind Bend", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G, P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case CHARIZARD_146:
      return evolution (this, from:"Charmeleon", hp:HP110, type:C, retreatCost:4) {
        weakness W
        pokeBody "Crystal Type", {
          text "Whenever you attach a Fire, Lightning, or Fighting basic Energy card from your hand to Charizard, Charizard's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Fireblast", {
          text "40 damage. Discard an Energy card attached to Charizard."
          energyCost F, R, R
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Dragon Tail", {
          text "50x damage. Flip 2 coins. This attack does 50 damage times the number of heads."
          energyCost L, L, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case CROBAT_147:
      return evolution (this, from:"Golbat", hp:HP080, type:C, retreatCost:null) {
        weakness P
        pokeBody "Crystal Type", {
          text "Whenever you attach a Grass, Fire, or Psychic basic Energy card from your hand to Crobat, Crobat's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Poison Flame", {
          text "Flip a coin. If heads, the Defending Pokémon is now Burned and Poisoned."
          energyCost G, R, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Squared Attack", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
          energyCost G, P, P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLEM_148:
      return evolution (this, from:"Graveler", hp:HP100, type:C, retreatCost:4) {
        weakness W
        pokeBody "Crystal Type", {
          text "Whenever you attach a Grass, Fire, or Fighting basic Energy card from your hand to Golem, Golem's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Rock Throw", {
          text "30 damage. "
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Earth Bomb", {
          text "50 damage. Golem does 20 damage to itself. This attack also does 10 damage to each Benched Pokémon (yours and your opponents). (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, G, R, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case HO_OH_149:
      return basic (this, hp:HP080, type:C, retreatCost:3) {
        weakness W
        pokeBody "Crystal Type", {
          text "Whenever you attach a Fire, Water, or Lightning basic Energy card from your hand to Ho-oh, Ho-oh's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Holy Flame", {
          text "20 damage. "
          energyCost L, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Scalding Steam", {
          text "40 damage. Discard an Energy card attached to Ho-oh and flip a coin. If heads, the Defending Pokémon is now Burned."
          energyCost R, W, W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case KABUTOPS_150:
      return evolution (this, from:"Kabuto", hp:HP090, type:C, retreatCost:3) {
        weakness G
        pokeBody "Crystal Type", {
          text "Whenever you attach a Water, Lightning, or Fighting basic Energy card from your hand to Kabutops, Kabutop's type (color) becomes the same as that type of energy until the end of the turn."
          delayedA {
          }
        }
        move "Draining Cut", {
          text "20 damage. Remove a damage counter from Kabutops."
          energyCost W, F, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Triple Cutter", {
          text "30x damage. Flip 3 coins. This attack does 30 damage times the number of heads."
          energyCost F, L, L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ALAKAZAM_H1:
      return copy (ALAKAZAM_2, this);
      case ARCANINE_H2:
      return copy (ARCANINE_3, this);
      case ARTICUNO_H3:
      return copy (ARTICUNO_4, this);
      case BEEDRILL_H4:
      return copy (BEEDRILL_5, this);
      case CROBAT_H5:
      return copy (CROBAT_6, this);
      case DEWGONG_H6:
      return copy (DEWGONG_7, this);
      case FLAREON_H7:
      return copy (FLAREON_8, this);
      case FORRETRESS_H8:
      return copy (FORRETRESS_9, this);
      case GENGAR_H9:
      return copy (GENGAR_10, this);
      case GYARADOS_H10:
      return copy (GYARADOS_11, this);
      case HOUNDOOM_H11:
      return copy (HOUNDOOM_12, this);
      case JOLTEON_H12:
      return copy (JOLTEON_13, this);
      case KABUTOPS_H13:
      return copy (KABUTOPS_14, this);
      case LEDIAN_H14:
      return copy (LEDIAN_15, this);
      case MACHAMP_H15:
      return copy (MACHAMP_16, this);
      case MAGCARGO_H16:
      return copy (MAGCARGO_17, this);
      case MAGCARGO_H17:
      return copy (MAGCARGO_18, this);
      case MAGNETON_H18:
      return copy (MAGNETON_19, this);
      case MAGNETON_H19:
      return evolution (this, from:"Magnemite", hp:HP080, type:L, retreatCost:1) {
        weakness F
        resistance G, MINUS30
        move "Bounce Off", {
          text "20 damage. If Magneton and the Defending Pokémon don't have the same number of Energy cards attached to them, the player controlling the Active Pokémon with the fewest number of Energy cards attached to it switches 1 of his or her Benched Pokémon with his or her Active Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Magnetic Wave", {
          text "30+ damage. This attack does 30 damage plus 10 more damage times the number of your Benched Pokémon minus the number of your opponent's Benched Pokémon. (For example, if your opponent has 1 Benched Pokémon and you have 3, this attack will do 30 damage plus 20 more damage.)"
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MOLTRES_H20:
      return copy (MOLTRES_21, this);
      case NIDOQUEEN_H21:
      return copy (NIDOQUEEN_22, this);
      case PILOSWINE_H22:
      return copy (PILOSWINE_24, this);
      case POLITOED_H23:
      return evolution (this, from:"Poliwhirl", hp:HP110, type:W, retreatCost:2) {
        weakness L
        move "Sudden Growth", {
          text "Attach any number of basic Energy cards from your hand to Politoed."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Frog Hop", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Energy Splash", {
          text "70 damage. Move 2 Energy cards attached to Politoed to 1 or 2 of your Benched Pokémon. (You may put both on the same Pokémon, or 1 each on 2 different Pokémon.) If you have no Benched Pokémon, ignore this effect."
          energyCost W, W, C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case POLIWRATH_H24:
      return copy (POLIWRATH_26, this);
      case RAICHU_H25:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Zzzap", {
          text "This attack does 20 damage to each Pokémon with a Poké"
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lightning Storm", {
          text "50 damage. Flip a coin. If tails, put 2 damage counters on Raichu."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case RAIKOU_H26:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness R
        pokeBody "Pure Body", {
          text "To attach a [L] Energy card from your hand to Raikou, you must discard an Energy card attached to Raikou. (Attach the Lightning energy, and then discard an Energy card from Raikou.)"
          delayedA {
          }
        }
        move "Lightning Sphere", {
          text "40+ damage. You may flip a coin. If heads, discard all Energy cards attached to Raikou. This attack does 40 damage plus 20 more damage for each Energy card discarded in this way."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case RHYDON_H27:
      return copy (RHYDON_29, this);
      case STARMIE_H28:
      return copy (STARMIE_30, this);
      case STEELIX_H29:
      return copy (STEELIX_31, this);
      case UMBREON_H30:
      return copy (UMBREON_32, this);
      case VAPOREON_H31:
      return copy (VAPOREON_33, this);
      case XATU_H32:
      return copy (XATU_35, this);
      default:
      return null;
    }
  }
}
