package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen3.FireRedLeafGreen
import tcgwars.logic.impl.gen3.TeamRocketReturns;
import tcgwars.logic.impl.gen5.DarkExplorers
import tcgwars.logic.impl.gen6.Xy

import tcgwars.logic.impl.gen5.BlackWhite
import tcgwars.logic.impl.gen6.Breakthrough
import tcgwars.logic.impl.gen2.Skyridge
import tcgwars.logic.impl.gen6.PrimalClash
import tcgwars.logic.impl.gen3.Dragon
import tcgwars.logic.impl.gen3.RubySapphire

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
import tcgwars.logic.card.*
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author itrezad@gmail.com
 */
public enum CelestialStorm implements LogicCardInfo {

  BELLSPROUT_1("Bellsprout", 1, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  WEEPINBELL_2("Weepinbell", 2, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  VICTREEBEL_3("Victreebel", 3, Rarity.HOLORARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
  SCYTHER_4("Scyther", 4, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
  SPINARAK_5("Spinarak", 5, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  ARIADOS_6("Ariados", 6, Rarity.HOLORARE, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  TREECKO_7("Treecko", 7, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  TREECKO_8("Treecko", 8, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  GROVYLE_9("Grovyle", 9, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  SCEPTILE_10("Sceptile", 10, Rarity.RARE, [POKEMON,_GRASS_,STAGE2,EVOLUTION]),
  SEEDOT_11("Seedot", 11, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  SEEDOT_12("Seedot", 12, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  NUZLEAF_13("Nuzleaf", 13, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  SHIFTRY_GX_14("Shiftry-GX", 14, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
  SURSKIT_15("Surskit", 15, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  MASQUERAIN_16("Masquerain", 16, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  VOLBEAT_17("Volbeat", 17, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
  ILLUMISE_18("Illumise", 18, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
  CACNEA_19("Cacnea", 19, Rarity.COMMON, [POKEMON,_GRASS_,BASIC]),
  CACTURNE_20("Cacturne", 20, Rarity.UNCOMMON, [POKEMON,_GRASS_,STAGE1,EVOLUTION]),
  TROPIUS_21("Tropius", 21, Rarity.UNCOMMON, [POKEMON,_GRASS_,BASIC]),
  DHELMISE_22("Dhelmise", 22, Rarity.RARE, [POKEMON,_GRASS_,BASIC]),
  SLUGMA_23("Slugma", 23, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
  MAGCARGO_24("Magcargo", 24, Rarity.RARE, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
  TORCHIC_25("Torchic", 25, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
  TORCHIC_26("Torchic", 26, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
  COMBUSKEN_27("Combusken", 27, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
  BLAZIKEN_GX_28("Blaziken-GX", 28, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,STAGE2,EVOLUTION]),
  TORKOAL_29("Torkoal", 29, Rarity.UNCOMMON, [POKEMON,_FIRE_,BASIC]),
  ORICORIO_30("Oricorio", 30, Rarity.UNCOMMON, [POKEMON,_FIRE_,BASIC]),
  ARTICUNO_GX_31("Articuno-GX", 31, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
  MUDKIP_32("Mudkip", 32, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  MUDKIP_33("Mudkip", 33, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  MARSHTOMP_34("Marshtomp", 34, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
  SWAMPERT_35("Swampert", 35, Rarity.RARE, [POKEMON,_WATER_,STAGE2,EVOLUTION]),
  LOTAD_36("Lotad", 36, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  LOMBRE_37("Lombre", 37, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
  LUDICOLO_38("Ludicolo", 38, Rarity.HOLORARE, [POKEMON,_WATER_,STAGE2,EVOLUTION]),
  WAILMER_39("Wailmer", 39, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  WAILORD_40("Wailord", 40, Rarity.RARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
  CLAMPERL_41("Clamperl", 41, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  HUNTAIL_42("Huntail", 42, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
  GOREBYSS_43("Gorebyss", 43, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
  LUVDISC_44("Luvdisc", 44, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
  REGICE_45("Regice", 45, Rarity.RARE, [POKEMON,_WATER_,BASIC]),
  KYOGRE_46("Kyogre", 46, Rarity.HOLORARE, [POKEMON,_WATER_,BASIC]),
  VOLTORB_47("Voltorb", 47, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
  ELECTRODE_GX_48("Electrode-GX", 48, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
  CHINCHOU_49("Chinchou", 49, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
  LANTURN_50("Lanturn", 50, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
  ELECTRIKE_51("Electrike", 51, Rarity.COMMON, [POKEMON,_LIGHTNING_,BASIC]),
  MANECTRIC_52("Manectric", 52, Rarity.RARE, [POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
  PLUSLE_53("Plusle", 53, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,BASIC]),
  MINUN_54("Minun", 54, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,BASIC]),
  ORICORIO_55("Oricorio", 55, Rarity.UNCOMMON, [POKEMON,_LIGHTNING_,BASIC]),
  MR_MIME_GX_56("Mr. Mime-GX", 56, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
  GULPIN_57("Gulpin", 57, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
  SWALOT_58("Swalot", 58, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  SPOINK_59("Spoink", 59, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
  GRUMPIG_60("Grumpig", 60, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  LUNATONE_61("Lunatone", 61, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
  SOLROCK_62("Solrock", 62, Rarity.UNCOMMON, [POKEMON,_PSYCHIC_,BASIC]),
  SHUPPET_63("Shuppet", 63, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
  SHUPPET_64("Shuppet", 64, Rarity.COMMON, [POKEMON,_PSYCHIC_,BASIC]),
  BANETTE_65("Banette", 65, Rarity.RARE, [POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  BANETTE_GX_66("Banette-GX", 66, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  DEOXYS_67("Deoxys", 67, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,BASIC]),
  DEOXYS_68("Deoxys", 68, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
  DEOXYS_69("Deoxys", 69, Rarity.RARE, [POKEMON,_PSYCHIC_,BASIC]),
  LUNALA_70("Lunala", 70, Rarity.HOLORARE, [POKEMON,_PSYCHIC_,STAGE2,EVOLUTION]),
  ONIX_71("Onix", 71, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
  PHANPY_72("Phanpy", 72, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
  DONPHAN_73("Donphan", 73, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
  LARVITAR_74("Larvitar", 74, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
  PUPITAR_75("Pupitar", 75, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
  MEDITITE_76("Meditite", 76, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
  MEDICHAM_77("Medicham", 77, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
  BALTOY_78("Baltoy", 78, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
  CLAYDOL_79("Claydol", 79, Rarity.RARE, [POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
  REGIROCK_80("Regirock", 80, Rarity.RARE, [POKEMON,_FIGHTING_,BASIC]),
  GROUDON_81("Groudon", 81, Rarity.HOLORARE, [POKEMON,_FIGHTING_,BASIC]),
  PALOSSAND_GX_82("Palossand-GX", 82, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIGHTING_,STAGE1,EVOLUTION]),
  MINIOR_83("Minior", 83, Rarity.UNCOMMON, [POKEMON,_FIGHTING_,BASIC]),
  ALOLAN_RATTATA_84("Alolan Rattata", 84, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
  ALOLAN_RATICATE_GX_85("Alolan Raticate-GX", 85, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DARKNESS_,STAGE1,EVOLUTION]),
  SNEASEL_86("Sneasel", 86, Rarity.COMMON, [POKEMON,_DARKNESS_,BASIC]),
  TYRANITAR_87("Tyranitar", 87, Rarity.HOLORARE, [POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
  SABLEYE_88("Sableye", 88, Rarity.UNCOMMON, [POKEMON,_DARKNESS_,BASIC]),
  STEELIX_89("Steelix", 89, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
  SCIZOR_GX_90("Scizor-GX", 90, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,STAGE1,EVOLUTION]),
  MAWILE_91("Mawile", 91, Rarity.UNCOMMON, [POKEMON,_METAL_,BASIC]),
  BELDUM_92("Beldum", 92, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
  BELDUM_93("Beldum", 93, Rarity.COMMON, [POKEMON,_METAL_,BASIC]),
  METANG_94("Metang", 94, Rarity.UNCOMMON, [POKEMON,_METAL_,STAGE1,EVOLUTION]),
  METAGROSS_95("Metagross", 95, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE2,EVOLUTION]),
  REGISTEEL_96("Registeel", 96, Rarity.RARE, [POKEMON,_METAL_,BASIC]),
  JIRACHI_PRISM_STAR_97("Jirachi Prism Star", 97, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_METAL_,BASIC]),
  HEATRAN_98("Heatran", 98, Rarity.HOLORARE, [POKEMON,_METAL_,BASIC]),
  SOLGALEO_99("Solgaleo", 99, Rarity.HOLORARE, [POKEMON,_METAL_,STAGE2,EVOLUTION]),
  CELESTEELA_100("Celesteela", 100, Rarity.HOLORARE, [POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
  KARTANA_101("Kartana", 101, Rarity.RARE, [POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
  STAKATAKA_GX_102("Stakataka-GX", 102, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
  BAGON_103("Bagon", 103, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
  BAGON_104("Bagon", 104, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
  SHELGON_105("Shelgon", 105, Rarity.UNCOMMON, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
  SALAMENCE_106("Salamence", 106, Rarity.HOLORARE, [POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
  LATIAS_PRISM_STAR_107("Latias Prism Star", 107, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_DRAGON_,BASIC]),
  LATIOS_PRISM_STAR_108("Latios Prism Star", 108, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_DRAGON_,BASIC]),
  RAYQUAZA_GX_109("Rayquaza-GX", 109, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
  DUNSPARCE_110("Dunsparce", 110, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
  WINGULL_111("Wingull", 111, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
  PELIPPER_112("Pelipper", 112, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
  SLAKOTH_113("Slakoth", 113, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
  VIGOROTH_114("Vigoroth", 114, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
  SLAKING_115("Slaking", 115, Rarity.HOLORARE, [POKEMON,_COLORLESS_,STAGE2,EVOLUTION]),
  WHISMUR_116("Whismur", 116, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
  WHISMUR_117("Whismur", 117, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
  LOUDRED_118("Loudred", 118, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
  EXPLOUD_119("Exploud", 119, Rarity.RARE, [POKEMON,_COLORLESS_,STAGE2,EVOLUTION]),
  SKITTY_120("Skitty", 120, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
  DELCATTY_121("Delcatty", 121, Rarity.HOLORARE, [POKEMON,_COLORLESS_,STAGE1,EVOLUTION]),
  KECLEON_122("Kecleon", 122, Rarity.UNCOMMON, [POKEMON,_COLORLESS_,BASIC]),
  ACRO_BIKE_123("Acro Bike", 123, Rarity.UNCOMMON, [TRAINER,ITEM]),
  APRICORN_MAKER_124("Apricorn Maker", 124, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  BEAST_BALL_125("Beast Ball", 125, Rarity.UNCOMMON, [TRAINER,ITEM]),
  BILLS_MAINTENANCE_126("Bill's Maintenance", 126, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  COPYCAT_127("Copycat", 127, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  ENERGY_RECYCLE_SYSTEM_128("Energy Recycle System", 128, Rarity.UNCOMMON, [TRAINER,ITEM]),
  ENERGY_SWITCH_129("Energy Switch", 129, Rarity.UNCOMMON, [TRAINER,ITEM]),
  FISHERMAN_130("Fisherman", 130, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  FRIEND_BALL_131("Friend Ball", 131, Rarity.UNCOMMON, [TRAINER,ITEM]),
  HAU_132("Hau", 132, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  HIKER_133("Hiker", 133, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  HUSTLE_BELT_134("Hustle Belt", 134, Rarity.UNCOMMON, [TRAINER,ITEM,POKEMON_TOOL]),
  LAST_CHANCE_POTION_135("Last Chance Potion", 135, Rarity.UNCOMMON, [TRAINER,ITEM]),
  LIFE_HERB_136("Life Herb", 136, Rarity.UNCOMMON, [TRAINER,ITEM]),
  LISIA_137("Lisia", 137, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  LURE_BALL_138("Lure Ball", 138, Rarity.UNCOMMON, [TRAINER,ITEM]),
  THE_MASKED_ROYAL_139("The Masked Royal", 139, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  POKENAV_140("PokéNav", 140, Rarity.UNCOMMON, [TRAINER,ITEM]),
  RAINBOW_BRUSH_141("Rainbow Brush", 141, Rarity.UNCOMMON, [TRAINER,ITEM]),
  RARE_CANDY_142("Rare Candy", 142, Rarity.UNCOMMON, [TRAINER,ITEM]),
  SHRINE_OF_PUNISHMENT_143("Shrine of Punishment", 143, Rarity.UNCOMMON, [TRAINER,STADIUM]),
  SKY_PILLAR_144("Sky Pillar", 144, Rarity.UNCOMMON, [TRAINER,STADIUM]),
  STEVENS_RESOLVE_145("Steven's' Resolve", 145, Rarity.HOLORARE, [TRAINER,SUPPORTER]),
  SUPER_SCOOP_UP_146("Super Scoop Up", 146, Rarity.UNCOMMON, [TRAINER,ITEM]),
  SWITCH_147("Switch", 147, Rarity.UNCOMMON, [TRAINER,ITEM]),
  TATE_LIZA_148("Tate & Liza", 148, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  TV_REPORTER_149("TV Reporter", 149, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  UNDERGROUND_EXPEDITION_150("Underground Expedition", 150, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
  RAINBOW_ENERGY_151("Rainbow Energy", 151, Rarity.UNCOMMON, [ENERGY,SPECIAL_ENERGY]),
  SHIFTRY_GX_152("Shiftry-GX", 152, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
  BLAZIKEN_GX_153("Blaziken-GX", 153, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,STAGE2,EVOLUTION]),
  ARTICUNO_GX_154("Articuno-GX", 154, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
  ELECTRODE_GX_155("Electrode-GX", 155, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
  MR_MIME_GX_156("Mr. Mime-GX", 156, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
  BANETTE_GX_157("Banette-GX", 157, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  SCIZOR_GX_158("Scizor-GX", 158, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,STAGE1,EVOLUTION]),
  STAKATAKA_GX_159("Stakataka-GX", 159, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
  RAYQUAZA_GX_160("Rayquaza-GX", 160, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
  APRICORN_MAKER_161("Apricorn Maker", 161, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  BILLS_MAINTENANCE_162("Bill's Maintenance", 162, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  COPYCAT_163("Copycat", 163, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  LISIA_164("Lisia", 164, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  STEVENS_RESOLVE_165("Steven's Resolve", 165, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  TATE_LIZA_166("Tate & Liza", 166, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  TV_REPORTER_167("TV Reporter", 167, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  UNDERGROUND_EXPEDITION_168("Underground Expedition", 168, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
  SHIFTRY_GX_169("Shiftry-GX", 169, Rarity.SECRET, [POKEMON_GX,POKEMON,_GRASS_,STAGE2,EVOLUTION]),
  BLAZIKEN_GX_170("Blaziken-GX", 170, Rarity.SECRET, [POKEMON_GX,POKEMON,_FIRE_,STAGE2,EVOLUTION]),
  ARTICUNO_GX_171("Articuno-GX", 171, Rarity.SECRET, [POKEMON_GX,POKEMON,_WATER_,BASIC]),
  ELECTRODE_GX_172("Electrode-GX", 172, Rarity.SECRET, [POKEMON_GX,POKEMON,_LIGHTNING_,STAGE1,EVOLUTION]),
  MR_MIME_GX_173("Mr. Mime-GX", 173, Rarity.SECRET, [POKEMON_GX,POKEMON,_PSYCHIC_,BASIC]),
  BANETTE_GX_174("Banette-GX", 174, Rarity.SECRET, [POKEMON_GX,POKEMON,_PSYCHIC_,STAGE1,EVOLUTION]),
  SCIZOR_GX_175("Scizor-GX", 175, Rarity.SECRET, [POKEMON_GX,POKEMON,_METAL_,STAGE1,EVOLUTION]),
  STAKATAKA_GX_176("Stakataka-GX", 176, Rarity.SECRET, [POKEMON_GX,POKEMON,_METAL_,BASIC,ULTRA_BEAST]),
  RAYQUAZA_GX_177("Rayquaza-GX", 177, Rarity.SECRET, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
  ACRO_BIKE_178("Acro Bike", 178, Rarity.SECRET, [TRAINER,ITEM]),
  HUSTLE_BELT_179("Hustle Belt", 179, Rarity.SECRET, [TRAINER,ITEM,POKEMON_TOOL]),
  LIFE_HERB_180("Life Herb", 180, Rarity.SECRET, [TRAINER,ITEM]),
  POKENAV_181("PokéNav", 181, Rarity.SECRET, [TRAINER,ITEM]),
  RAINBOW_BRUSH_182("Rainbow Brush", 182, Rarity.SECRET, [TRAINER,ITEM]);


  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  CelestialStorm(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.CELESTIAL_STORM;
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
      case BELLSPROUT_1:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Blot" , {
            text "20 damage."
            energyCost G,C
            onAttack {
              damage 20
              afterDamage{
                heal 10, self
              }
            }
          }
        };
      case WEEPINBELL_2:
        return 	evolution (this, from:"Bellsprout", hp:HP080, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Growth" , {
            text "Attach up to 2 [G] Energy cards from your hand to this Pokémon."
            energyCost C
            onAttack {
              attachEnergyFrom(type: GRASS, my.hand, self)
              attachEnergyFrom(may: true, type: GRASS, my.hand, self)
            }
          }
          move "Double Razor Leaf" , {
            text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost G,C
            onAttack {
              flip 2,{damage 30}
            }
          }
        };
      case VICTREEBEL_3:
        return 	evolution (this, from:"Weepinbell", hp:HP140, type:GRASS, retreatCost:2) {
          weakness FIRE
          bwAbility "Fragrance Trap" , {
            text "Once during your turn (before your attack), you may flip a coin. If heads, switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            actionA {
              checkLastTurn()
              assert opp.bench
              powerUsed()
              flip {
                sw opp.active, opp.bench.select("New active."), SRC_ABILITY
              }
            }
          }
          move "Corrosive Acid" , {
            text "80 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Burned."
            energyCost G,G,C
            onAttack {
              damage 80
              flipThenApplySC BURNED
            }
          }
        };
      case SCYTHER_4:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Twin Play" , {
            text "Search your deck for up to 2 Scyther and put them onto your Bench. Then, shuffle your deck."
            energyCost C
            callForFamily(name:"Scyther",2,delegate)
          }
          move "Agility" , {
            text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost C,C
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }
        };
      case SPINARAK_5:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Stun Poison" , {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed and Poisoned."
            energyCost G
            onAttack {
              flip {
                apply POISONED
                apply PARALYZED
              }
            }
          }
          move "Pierce" , {
            text "20 damage."
            energyCost C,C
            onAttack {
              damage 20
            }
          }
        };
      case ARIADOS_6:
        return 	evolution (this, from:"Spinarak", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Reactive Poison" , {
            text "20+ damage. This attack does 50 more damage for each Special Condition affecting your opponent's Active Pokémon."
            energyCost C
            onAttack {
              damage 20 + 50*defending.specialConditions.size()
            }
          }
          move "Spider Trap" , {
            text "You may switch 1 of your opponent's Benched Pokémon with their Active Pokémon. Your opponent's Active Pokémon is now Asleep and Poisoned."
            energyCost G
            attackRequirement {
            }
            onAttack {
              def pcs = defending
              if(opp.bench && confirm("Switch the defending pokémon with 1 of your opponent's benched pokémon?")){
                pcs = opp.bench.select("Switch")
                sw opp.active, pcs
              }
              targeted(pcs) {
                apply POISONED, pcs
                apply ASLEEP, pcs
              }
            }
          }
        };
      case TREECKO_7:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Sleep Poison" , {
            text "Your opponent's Active Pokémon is now Asleep and Poisoned."
            energyCost G
            onAttack {
              apply POISONED
              apply ASLEEP
            }
          }
        };
      case TREECKO_8:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Smack" , {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }
          move "Tail Whap" , {
            text "20 damage."
            energyCost G,C
            onAttack {
              damage 20
            }
          }
        };
      case GROVYLE_9:
        return 	evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Leaf Blade" , {
            text "20+ damage. Flip a coin. If heads, this attack does 40 more damage."
            energyCost G
            onAttack {
              damage 20
              flip {damage 40}
            }
          }
        };
      case SCEPTILE_10:
        return 	evolution (this, from:"Grovyle", hp:HP140, type:GRASS, retreatCost:1) {
          weakness FIRE
          bwAbility "Power of Nature" , {
            text "Prevent all damage done to your Pokémon that have any [G] Energy attached to them by attacks from your opponent's Ultra Beasts."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to.cards.energyCount(G) && it.to.owner == self.owner && it.from.topPokemonCard.cardTypes.is(ULTRA_BEAST) && it.dmg.value && it.notNoEffect) {
                    bc "Power of nature prevents damage from Ultra Beasts"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Powerful Storm" , {
            text "20× damage. This attack does 20 damage times the amount of Energy attached to all of your Pokémon."
            energyCost G
            onAttack {
              my.all.each{damage 20*it.cards.energyCount(C)}
            }
          }
        };
      case SEEDOT_11:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Hang Down" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Harden" , {
            text "During your opponent's next turn, prevent all damage done to this Pokémon by attacks if that damage is 40 or less."
            energyCost G
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 40 && it.notNoEffect) {
                      bc "Harden prevent those damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,self, {unregister()}
                after SWITCH,self, {unregister()}
              }
            }
          }
        };
      case SEEDOT_12:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Stampede" , {
            text "30 damage."
            energyCost C,C
            onAttack {
              damage 30
            }
          }
        };
      case NUZLEAF_13:
        return 	evolution (this, from:"Seedot", hp:HP090, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Pound" , {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
          move "Clear the Room" , {
            text "Your opponent reveals their hand. Choose a Supporter card you find there. Your opponent shuffles that card into their deck."
            energyCost C,C
            attackRequirement {
              assert opp.hand : "Your opponent have no cards in hand"
            }
            onAttack {
              opp.hand.showToMe("opponent's hand")
              if(opp.hand.filterByType(SUPPORTER)){
                opp.hand.filterByType(SUPPORTER).select("select a supporter to put back in deck.").moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
        };
      case SHIFTRY_GX_14:
        return 	evolution (this, from:"Nuzleaf", hp:HP240, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Perplex" , {
            text "40 damage. Your opponent's Active Pokémon is now Confused."
            energyCost G
            onAttack {
              damage 40
              applyAfterDamage CONFUSED
            }
          }
          move "Extrasensory" , {
            text "90+ damage. If you have the same number of cards in your hand as your opponent, this attack does 90 more damage."
            energyCost G,C,C
            onAttack {
              damage 90
              if(my.hand.size() == opp.hand.size()) damage 90
            }
          }
          move "Den of Iniquity GX" , {
            text "Choose 1 of your opponent's Pokémon. Your opponent shuffles that Pokémon and all cards attached to it into their deck. (You can't use more than 1 GX attack in a game.)"
            energyCost G,C,C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              def pcs = opp.all.select("Choose the Pokémon to put back in deck.")
              pcs.cards.moveTo(opp.deck)
              removePCS(pcs)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
        };
      case SURSKIT_15:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Bubble" , {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
        };
      case MASQUERAIN_16:
        return evolution (this, from:"Surskit", hp:HP090, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Surprising Pattern" , {
            text "Discard all Special Energy from each of your opponent's Pokémon."
            energyCost G
            onAttack {
              opp.all.each{
                it.cards.filterByType(SPECIAL_ENERGY).discard()
              }
            }
          }
          move "Hurricane Wing" , {
            text "40× damage. Flip 4 coins. This attack does 40 damage for each heads."
            energyCost C,C,C
            onAttack {
              flip 4, {damage 40}
            }
          }
        };
      case VOLBEAT_17:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Pheromone Catch" , {
            text "20+ damage. If your Illumise used Pheromone Signals during your last turn, this attack does 100 more damage."
            energyCost G
            onAttack {
              damage 20
              if(bg.em().retrieveObject("Pheromone_Signal") == bg.turnCount - 2) damage 100
            }
          }
        };
      case ILLUMISE_18:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Pheromone Signals" , {
            text "20 damage. Your opponent's Active Pokémon is now Confused."
            energyCost G
            onAttack {
              damage 20
              bg.em().storeObject("Pheromone_Signal", bg.turnCount)
              applyAfterDamage CONFUSED
            }
          }
        };
      case CACNEA_19:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          bwAbility "Poison Payback" , {
            text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Poisoned."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Poison Point"
                  apply POISONED, (ef.attacker as PokemonCardSet), SRC_ABILITY
                }
              }
              after SWITCH, self, {unregister()}
            }
          }
          move "Light Punch" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
        };
      case CACTURNE_20:
        return 	evolution (this, from:"Cacnea", hp:HP110, type:GRASS, retreatCost:1) {
          weakness FIRE
          bwAbility "Poison Payback" , {
            text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Poisoned."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Poison Point"
                  apply POISONED, (ef.attacker as PokemonCardSet), SRC_ABILITY
                }
              }
              after SWITCH, self, {unregister()}
            }
          }
          move "Feint Attack" , {
            text "This attack does 50 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness, Resistance, or any other effects on that Pokémon."
            energyCost C,C,C
            onAttack {
              swiftDamage(50,opp.all.select("50 damage to "))
            }
          }
        };
      case TROPIUS_21:
        return basic (this, hp:HP110, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Find a Friend" , {
            text "Search your deck for up to 2 Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost G
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max:2,"Choose up to 2 pokemon to put in your hand.",cardTypeFilter(POKEMON)).showToOpponent("Cards moved to hand").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Solar Beam" , {
            text "70 damage."
            energyCost G,C,C
            onAttack {
              damage 70
            }
          }
        };
      case DHELMISE_22:
        return basic (this, hp:HP130, type:GRASS, retreatCost:3) {
          weakness FIRE
          move "Giga Drain" , {
            text "30 damage. Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon."
            energyCost G,C
            onAttack {
              damage 30
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Powerful Spin" , {
            text "130 damage. This Pokémon can't attack during your next turn."
            energyCost G,G,C
            onAttack {
              damage 130
              cantAttackNextTurn self
            }
          }
        };
      case SLUGMA_23:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Magma Ring" , {
            text "10 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              damage 10
              cantRetreat defending
            }
          }
          move "Flare" , {
            text "20 damage."
            energyCost R,C
            onAttack {
              damage 20
            }
          }
        };
      case MAGCARGO_24:
        return 	evolution (this, from:"Slugma", hp:HP090, type:FIRE, retreatCost:3) {
          weakness WATER
          bwAbility "Smooth Over" , {
            text "Once during your turn (before your attack), you may search your deck for a card, shuffle your deck, then put that card on top of it."
            actionA {
              checkLastTurn()
              assert my.deck
              powerUsed()
              def tar = my.deck.select("Choose 1 card to put on top of your deck").first()
              my.deck.remove(tar)
              my.deck.add(0, tar)
            }
          }
          move "Combustion" , {
            text "50 damage."
            energyCost R,C,C
            onAttack {
              damage 50
            }
          }
        };
      case TORCHIC_25:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Ember" , {
            text "30 damage. Discard an Energy from this Pokémon."
            energyCost R
            onAttack {
              damage 30
              afterDamage{
                discardSelfEnergy C
              }
            }
          }
        };
      case TORCHIC_26:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Peck" , {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Live Coal" , {
            text "20 damage."
            energyCost R,C
            onAttack {
              damage 20
            }
          }
        };
      case COMBUSKEN_27:
        return 	evolution (this, from:"Torchic", hp:HP080, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Double Kick" , {
            text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost C,C
            onAttack {
              flip 2,{damage 30}
            }
          }
          move "Flamethrower" , {
            text "80 damage. Discard an Energy from this Pokémon."
            energyCost R,R,C
            onAttack {
              damage 80
              afterDamage{
                discardSelfEnergy C
              }
            }
          }
        };
      case BLAZIKEN_GX_28:
        return 	evolution (this, from:"Combusken", hp:HP240, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Slash" , {
            text "60 damage."
            energyCost C,C
            onAttack {
              damage 60
            }
          }
          move "Explosive Kick" , {
            text "210 damage. Discard 2 [R] Energy from this Pokémon."
            energyCost R,R,C
            onAttack {
              damage 210
              afterDamage{
                discardSelfEnergy R,R
              }
            }
          }
          move "Blaze Out GX" , {
            text "Discard 2 Energy from your opponent's Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost R
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              discardOpponentEnergy(Target.OPP_ALL)
              discardOpponentEnergy(Target.OPP_ALL)
            }
          }
        };
      case TORKOAL_29:
        return basic (this, hp:HP120, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Flaming Honk" , {
            text "30 damage. Discard the top 4 cards of your deck. If any of those cards are [R] Energy cards, attach them to your Pokémon in any way you like."
            energyCost C,C
            onAttack {
              damage 30
              for (int i = 0; i<4; i++) {
                if(my.deck){
                  if(my.deck.subList(0,1).filterByType(BASIC_ENERGY).filterByEnergyType(R)) {
                    attachEnergyFrom(my.deck.subList(0,1),my.all)
                  }
                  else{
                    my.deck.subList(0,1).discard()
                  }
                }
              }
            }
          }
          move "Searing Flame" , {
            text "80 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R,R,C
            onAttack {
              damage 80
              applyAfterDamage BURNED
            }
          }
        };
      case ORICORIO_30:
        return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Captivating Salsa" , {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Burned and Confused."
            energyCost R
            attackRequirement {
              assert opp.bench.notEmpty
            }
            onAttack {
              def pcs = opp.bench.select("Switch")
              targeted(pcs) {
                sw opp.active, pcs
                apply BURNED, pcs
                apply CONFUSED, pcs
              }
            }
          }
          move "Heat Blast" , {
            text "70 damage."
            energyCost R,C,C
            onAttack {
              damage 70
            }
          }
        };
      case ARTICUNO_GX_31:
        return basic (this, hp:HP170, type:WATER, retreatCost:2) {
          weakness METAL
          bwAbility "Legendary Ascent" , {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may switch it with your Active Pokémon. If you do, move any number of [W] Energy from your other Pokémon to this Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && self.benched && confirm("Use Legendary Ascent to switch your active with $self ?")){
                powerUsed()
                sw my.active, self
                while(1){
                  def pl=(my.all.findAll {it.cards.filterByEnergyType(W) && it!=self})
                  if(!pl) break;
                  def src=pl.select("Source for [W] energy (cancel to stop moving)", false)
                  if(!src) break;
                  def card=src.cards.filterByEnergyType(W).select("Card to move").first()
                  energySwitch(src, self, card)
                }
              }
            }
          }
          move "Ice Wing" , {
            text "130 damage."
            energyCost W,W,C
            onAttack {
              damage 130
            }
          }
          move "Cold Crush GX" , {
            text "Discard all Energy from both Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost W
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              discardAllSelfEnergy(null)
              opp.active.cards.filterByType(ENERGY).discard()
            }
          }
        };
      case MUDKIP_32:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Reserve" , {
            text "Search your deck for up to 3 [W] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              my.deck.search(max:3,"Choose up to 3 [W] energy to put in your hand",basicEnergyFilter(W)).moveTo(my.hand)
            }
          }
        };
      case MUDKIP_33:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Tackle" , {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Wave Splash" , {
            text "20 damage."
            energyCost W,C
            onAttack {
              damage 20
            }
          }
        };
      case MARSHTOMP_34:
        return 	evolution (this, from:"Mudkip", hp:HP090, type:WATER, retreatCost:3) {
          weakness GRASS
          move "Muddy Water" , {
            text "20 damage. This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W,C
            attackRequirement {
            }
            onAttack {
              damage 20
              if(opp.bench) damage 20, opp.bench.select("Target for 20 damage")
            }
          }
          move "Surf" , {
            text "70 damage."
            energyCost W,W,C
            onAttack {
              damage 70
            }
          }
        };
      case SWAMPERT_35:
        return 	evolution (this, from:"Marshtomp", hp:HP160, type:WATER, retreatCost:3) {
          weakness GRASS
          bwAbility "Power Draw" , {
            text "Once during your turn (before your attack), you may discard a card from your hand. If you do, draw 3 cards."
            actionA {
              checkLastTurn()
              assert my.hand : "You don't have any card in your hand to discard"
              powerUsed()
              my.hand.select("Discard").discard()
              draw 3
            }
          }
          move "Hydro Pump" , {
            text "80+ damage. This attack does 20 more damage times the amount of [W] Energy attached to this Pokémon."
            energyCost C,C,C
            onAttack {
              damage 80+20*self.cards.energyCount(W)
            }
          }
        };
      case LOTAD_36:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Surprise" , {
            text "10 damage. Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
            energyCost W
            onAttack {
              damage 10
              afterDamage{
                astonish()
              }
            }
          }
        };
      case LOMBRE_37:
        return 	evolution (this, from:"Lotad", hp:HP080, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          bwAbility "Aqua Lift" , {
            text "If this Pokémon has any [W] Energy attached to it, it has no Retreat Cost."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.energyCount(W)) {
                h.object = 0
              }
            }
          }
          move "Ambush" , {
            text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost C,C
            onAttack {
              damage 20
              flip {damage 20}
            }
          }
        };
      case LUDICOLO_38:
        return 	evolution (this, from:"Lombre", hp:HP140, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          bwAbility "Swing Dance" , {
            text "Once during your turn (before your attack), you may draw a card."
            actionA {
              checkLastTurn()
              assert my.deck : "There is no more card to draw in your deck"
              powerUsed()
              draw 1
            }
          }
          move "Circular Steps" , {
            text "70+ damage. This attack does 10 more damage for each other Pokémon in play (both yours and your opponent's)."
            energyCost W,C,C
            onAttack {
              damage 70+10*(my.bench.size()+opp.all.size())
            }
          }
        };
      case WAILMER_39:
        return basic (this, hp:HP120, type:WATER, retreatCost:3) {
          weakness GRASS
          move "Wave Swallower" , {
            text "50 damage. Flip a coin until you get tails. For each heads, heal 50 damage from this Pokémon."
            energyCost W,W,W
            onAttack {
              damage 50
              afterDamage{
                flipUntilTails {heal 50, self}
              }
            }
          }
        };
      case WAILORD_40:
        return 	evolution (this, from:"Wailmer", hp:HP220, type:WATER, retreatCost:4) {
          weakness GRASS
          move "Dwindling Wave" , {
            text "200- damage. This attack does 40 less damage for each damage counter on this Pokémon."
            energyCost W,W,W,W
            onAttack {
              damage 200-40*self.numberOfDamageCounters
            }
          }
        };
      case CLAMPERL_41:
        return basic (this, hp:HP050, type:WATER, retreatCost:3) {
          weakness GRASS
          bwAbility "Evolutionary Advantage" , {
            text "If you go second, this Pokémon can evolve during your first turn."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if(bg.turnCount == 2) prevent()
              }
            }
          }
          move "Sparkling Pearl" , {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
        };
      case HUNTAIL_42:
        return 	evolution (this, from:"Clamperl", hp:HP110, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Big Bite" , {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost W
            onAttack {
              damage 30
              cantRetreat defending
            }

          }
          move "Dangerous Bite" , {
            text "40+ damage. If your opponent's Active Pokémon is a Basic Pokémon, this attack does 80 more damage."
            energyCost W,C,C
            onAttack {
              damage 40
              if(defending.basic) damage 80
            }
          }
        };
      case GOREBYSS_43:
        return 	evolution (this, from:"Clamperl", hp:HP090, type:WATER, retreatCost:0) {
          weakness GRASS
          move "Deflecting Splash" , {
            text "30 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Evolution Pokémon."
            energyCost W
            onAttack {
              damage 30
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.from.realEvolution && it.dmg.value <= 40 && it.notNoEffect) {
                      bc "Deflecting Splash prevents damage from Evolution Pokémon"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,self, {unregister()}
              }
            }
          }
        };
      case LUVDISC_44:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Even Game" , {
            text "Search your deck for a number of Basic Pokémon up to the number of your opponent's Benched Pokémon and put those Pokémon onto your Bench. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.bench.size() < opp.bench.size() : "You have more pokémon than your opponent"
            }
            onAttack {
              my.deck.search(max:(opp.bench.size() - my.bench.size()),"Choose ${opp.bench.size() - my.bench.size()} basic pokémon",cardTypeFilter(BASIC)).each{
                my.deck.remove(it)
                benchPCS(it)
              }
            }
          }
          move "Water Pulse" , {
            text "20 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost C,C
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
        };
      case REGICE_45:
        return basic (this, hp:HP120, type:WATER, retreatCost:3) {
          weakness METAL
          bwAbility "Icy Barrier" , {
            text "As long as this Pokémon is your Active Pokémon, your opponent can't play any Stadium cards from their hand."
            delayedA {
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.is(STADIUM) && bg.currentTurn == self.owner.opposite && self.active) {
                  wcu "Icy Barrier prevents playing this card"
                  prevent()
                }
              }
            }
          }
          move "Icy Wind" , {
            text "60 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost W,C,C
            onAttack {
              damage 60
              applyAfterDamage ASLEEP
            }
          }
        };
      case KYOGRE_46:
        return basic (this, hp:HP130, type:WATER, retreatCost:4) {
          weakness GRASS
          move "Dual Splash" , {
            text "This attack does 30 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W,C
            onAttack {
              multiSelect(opp.all, 2).each{
                targeted(it){
                  damage 30, it
                }
              }
            }
          }
          move "Grand Wave" , {
            text "120 damage. This Pokémon can't use Grand Wave during your next turn."
            energyCost W,W,C
            onAttack {
              damage 120
              cantUseAttack thisMove, self
            }
          }
        };
      case VOLTORB_47:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Floating Electrons" , {
            text "If this Pokémon has any Energy attached to it, it has no Retreat Cost."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.energyCount(C)) {
                h.object = 0
              }
            }
          }
          move "Thunder Shock" , {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L,C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
        };
      case ELECTRODE_GX_48:
        return 	evolution (this, from:"Voltorb", hp:HP190, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          bwAbility "Extra Energy Bomb" , {
            text "Once during your turn (before your attack), you may attach 5 Energy cards from your discard pile to your Pokémon, except Pokémon-GX or Pokémon-EX, in any way you like. If you do, this Pokémon is Knocked Out."
            actionA {
              checkLastTurn()
              powerUsed()
              new Knockout(self).run(bg)
              attachEnergyFrom(may : true ,my.discard, my.all.findAll{!(it.pokemonEX) && !(it.pokemonGX)})
              attachEnergyFrom(may : true,my.discard, my.all.findAll{!(it.pokemonEX) && !(it.pokemonGX)})
              attachEnergyFrom(may : true,my.discard, my.all.findAll{!(it.pokemonEX) && !(it.pokemonGX)})
              attachEnergyFrom(may : true,my.discard, my.all.findAll{!(it.pokemonEX) && !(it.pokemonGX)})
              attachEnergyFrom(may : true,my.discard, my.all.findAll{!(it.pokemonEX) && !(it.pokemonGX)})
            }
          }
          move "Electro Ball" , {
            text "50 damage."
            energyCost L,C
            onAttack {
              damage 50
            }
          }
          move "Crush and Burn GX" , {
            text "30+ damage. Discard any amount of Energy from your Pokémon. This attack does 50 more damage for each card you discarded in this way. (You can't use more than 1 GX attack in a game.)"
            energyCost L,C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 30
              def bonusDmg = 0
              while(my.all.findAll{it.cards.energyCount(C)}){
                if(confirm("discard energy from one pokémon for 50 more damage by energy discarded?")){
                  def tar = my.all.findAll{it.cards.energyCount(C)}.select("Choose the pokémon to discard energy")
                  bonusDmg += 50*tar.cards.filterByType(ENERGY).select(min:1,max : tar.cards.filterByType(ENERGY).size()).discard().size()
                }
                else{
                  break
                }
              }
              damage bonusDmg
            }
          }
        };
      case CHINCHOU_49:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Pound" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Spark" , {
            text "10 damage. This attack does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L,C
            onAttack {
              damage 10
              if(opp.bench){
                multiSelect(opp.bench, 2).each{
                  targeted(it){
                    damage 10, it
                  }
                }
              }
            }
          }
        };
      case LANTURN_50:
        return 	evolution (this, from:"Chinchou", hp:HP110, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          bwAbility "Energy Grounding" , {
            text "When 1 of your Pokémon is Knocked Out by damage from an opponent's attack, you may move a basic Energy card from that Pokémon to this Pokémon."
            delayedA{
              before KNOCKOUT, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && ef.pokemonToBeKnockedOut!=self  && ef.pokemonToBeKnockedOut.cards.energyCount(C)){
                  if(confirm("Move an energy from ${ef.pokemonToBeKnockedOut} to $self ?")){
                    moveEnergy(basic:true,ef.pokemonToBeKnockedOut,self)
                  }
                }
              }
            }
          }
          move "Lightning Strike" , {
            text "70+ damage. You may discard all [L] Energy from this Pokémon. If you do, this attack does 70 more damage."
            energyCost L,L,C
            onAttack {
              damage 70
              if(confirm("discard all [L] energy for 70 more damage?")){
                damage 70
                discardAllSelfEnergy(L)
              }
            }
          }
        };
      case ELECTRIKE_51:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Zap Kick" , {
            text "20 damage."
            energyCost L
            onAttack {
              damage 20
            }
          }
        };
      case MANECTRIC_52:
        return 	evolution (this, from:"Electrike", hp:HP110, type:LIGHTNING, retreatCost:0) {
          weakness FIGHTING
          resistance METAL, MINUS20
          bwAbility "Electric Start" , {
            text "If you go second, and if this Pokémon is in your hand when you are setting up to play, you may put it face down as your Active Pokémon or on your Bench."
            // Impl handled in GameManager
          }
          move "Double Charge" , {
            text "40 damage. You may attach up to 2 basic Energy cards from your hand to 1 of your Benched Pokémon."
            energyCost L
            onAttack {
              damage 40
              if(my.hand.filterByType(BASIC_ENERGY) && my.bench){
                if(confirm("Attach a basic energy from your hand to one of your benched pokémon? (up to 2)")){
                  def tar = my.bench.select("which pokémon?")
                  attachEnergyFrom(basic:true,my.hand,tar)
                  if(my.hand.filterByType(BASIC_ENERGY)){
                    if(confirm("Attach another energy to $tar ?")){
                      attachEnergyFrom(basic:true,my.hand,tar)
                    }
                  }
                }
              }
            }
          }
        };
      case PLUSLE_53:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Draw for Everybody" , {
            text "Shuffle your hand into your deck. Then, draw a card for each Benched Pokémon (both yours and your opponent's)."
            energyCost C
            attackRequirement {
              assert my.deck : "There is no more card to draw in your deck"
            }
            onAttack {
              my.hand.moveTo(my.deck)
              shuffleDeck()
              draw my.bench.size() + opp.bench.size()
            }
          }
          move "Electro Ball" , {
            text "30 damage."
            energyCost L,C
            onAttack {
              damage 30
            }
          }
        };
      case MINUN_54:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Ditch and Draw" , {
            text "You may discard any number of cards from your hand. Then, draw cards until you have 5 cards in your hand."
            energyCost C
            attackRequirement {
              assert my.deck : "There is no more card to draw in your deck"
            }
            onAttack {
              if(my.hand){
                my.hand.select(min: 0,max : my.hand.size(),"Select the cards you want to discard").discard()
              }
              if(my.hand.size() < 5){
                draw 5-my.hand.size()
              }
            }
          }
          move "Electro Ball" , {
            text "30 damage."
            energyCost L,C
            onAttack {
              damage 30
            }
          }
        };
      case ORICORIO_55:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Zappy Pom-Poms" , {
            text "This attack does 30 damage to each Pokémon-GX and Pokémon-EX (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L
            onAttack {
              my.all.each{
                if(it.pokemonEX || it.pokemonGX) damage 30, it
              }
              opp.all.each{
                if(it.pokemonEX || it.pokemonGX) damage 30, it
              }
            }
          }
          move "Electric Ball" , {
            text "70 damage."
            energyCost L,C,C
            onAttack {
              damage 70
            }
          }
        };
      case MR_MIME_GX_56:
        return basic (this, hp:HP150, type:PSYCHIC, retreatCost:2) {
          bwAbility "Magic Evens" , {
            text "Prevent all damage done to this Pokémon by your opponent's attacks if that damage is exactly 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, or 260."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && (it.dmg.value == 20 || it.dmg.value == 40 || it.dmg.value == 60 || it.dmg.value == 80 || it.dmg.value == 100 || it.dmg.value == 120 || it.dmg.value == 140 || it.dmg.value == 160  || it.dmg.value == 180  || it.dmg.value == 200  || it.dmg.value == 220  || it.dmg.value == 240  || it.dmg.value == 260)) {
                    bc "Magic Evens prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Breakdown" , {
            text "For each card in your opponent's hand, put 1 damage counter on their Active Pokémon."
            energyCost P,C
            onAttack {
              directDamage 10*opp.hand.size(), defending
            }
          }
          move "Life Trick GX" , {
            text "Heal all damage from this Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement{
              gxCheck()
            }
            onAttack{
              gxPerform()
              heal self.numberOfDamageCounters*10, self
            }
          }
        };
      case GULPIN_57:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Yawn" , {
            text "Your opponent's Active Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Spit Poison" , {
            text "Your opponent's Active Pokémon is now Poisoned."
            energyCost P
            onAttack {
              apply POISONED
            }
          }
        };
      case SWALOT_58:
        return 	evolution (this, from:"Gulpin", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Amnesia" , {
            text "30 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost C
            onAttack {
              damage 30
              amnesia delegate
            }
          }
          move "Swallow Up" , {
            text "40+ damage. If, before doing damage, your opponent's Active Pokémon has less remaining HP than this Pokémon, this attack does 80 more damage."
            energyCost P,C,C
            onAttack {
              damage 40
              if(defending.getRemainingHP() < self.getRemainingHP()) damage 80
            }
          }
        };
      case SPOINK_59:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Bounce" , {
            text "Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.bench : "There is no pokémon on your bench"
            }
            onAttack {
              switchYourActive(now: 1)
            }
          }
        };
      case GRUMPIG_60:
        return 	evolution (this, from:"Spoink", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Mirror Step" , {
            text "10+ damage. If 1 of your opponent's Pokémon in play has the same name as 1 of your Pokémon in play, this attack does 70 more damage."
            energyCost C
            onAttack {
              damage 10
              def addDmg = false
              my.all.each{pcs->
                opp.all.each{tar->
                  if(tar.name == pcs.name){
                    addDmg = true
                  }
                }
              }
              if(addDmg) damage 70
            }
          }
        };
      case LUNATONE_61:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Sol Shade" , {
            text "If you have Solrock in play, [R] Pokémon in play (both yours and your opponent's) have no Abilities, except Pokémon-GX and Pokémon-EX."
            def effect1
            def effect2
            onActivate {
              effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
                if (h.effect.target.types.contains(R) && !h.effect.target.pokemonEX && !h.effect.target.pokemonGX && h.effect.ability instanceof BwAbility) {
                  h.object=true
                }
              }
              effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
                if (!(h.effect.target as Card).cardTypes.is(POKEMON_GX) && !(h.effect.target as Card).cardTypes.is(POKEMON_EX) && (h.effect.target as Card).cardTypes.is(FIRE)) {
                  h.object=true
                }
              }
              new CheckAbilities().run(bg)
            }
            onDeactivate {
              effect1.unregister()
              effect2.unregister()
              new CheckAbilities().run(bg)
            }
          }
          move "Psyshock" , {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost P
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
        };
      case SOLROCK_62:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Sunbeam" , {
            text "The maximum HP of each of your Lunatone in play is 130."
            getterA GET_FULL_HP ,{h->
              if(h.effect.target.name == "Lunatone" && h.effect.target.owner == self.owner) {
                h.object = hp(130)
              }
            }
          }
          move "Scorching Light" , {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed. If tails, your opponent's Active Pokémon is now Burned."
            energyCost C
            onAttack {
              flip 1, {apply PARALYZED}, {apply BURNED}
            }
          }
        };
      case SHUPPET_63:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Headbutt" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Will-O-Wisp" , {
            text "20 damage."
            energyCost P,C
            onAttack {
              damage 20
            }
          }
        };
      case SHUPPET_64:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Perplex" , {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost P
            onAttack {
              apply CONFUSED
            }
          }
        };
      case BANETTE_65:
        return 	evolution (this, from:"Shuppet", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Red Eyes" , {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put a Basic Pokémon from your opponent's discard pile onto their Bench."
            onActivate {r->
              if(r==PLAY_FROM_HAND && opp.discard.filterByType(BASIC) && opp.bench.notFull && confirm('Use Red Eyes?')){
                def pcs = opp.discard.filterByType(BASIC).select("Select the pokémon to put on the bench").first()
                opp.discard.remove(pcs)
                benchPCS(pcs, OTHER, TargetPlayer.OPPONENT)
              }
            }
          }
          move "Enemy Show" , {
            text "For each of your opponent's Pokémon in play, put 1 damage counter on your opponent's Pokémon in any way you like."
            energyCost P,C
            onAttack {
              opp.all.each{
                directDamage 10, opp.all.select("Put one damage counter on which pokémon?")
              }
            }
          }
        };
      case BANETTE_GX_66:
        return 	evolution (this, from:"Shuppet", hp:HP190, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Shady Move" , {
            text "Once during your turn (before your attack), if this Pokémon is your Active Pokémon, you may move 1 damage counter from 1 Pokémon to another Pokémon."
            actionA {
              checkLastTurn()
              assert self.active : "$self is not your active"
              assert my.all.findAll{it.numberOfDamageCounters} || opp.all.findAll{it.numberOfDamageCounters} : "There is no pokémon with damage counter on them"
              powerUsed()
              def bothAll = new PcsList();
              my.all.each{
                bothAll.add(it)
              }
              opp.all.each{
                bothAll.add(it)
              }
              def pcs = bothAll.findAll{it.numberOfDamageCounters}.select("Choose the pokémon to move the damage counter from")
              def tar = bothAll.findAll{it != pcs}.select("Select the pokémon to recieve the damage counter")
              pcs.damage-=hp(10)
              tar.damage+=hp(10)
            }
          }
          move "Shadow Chant" , {
            text "30+ damage. This attack does 10 more damage for each Supporter card in your discard pile. You can't add more than 100 damage in this way."
            energyCost P
            onAttack {
              damage 30+ Math.min(my.discard.filterByType(SUPPORTER).size(),10)*10
            }
          }
          move "Tomb Hunt GX" , {
            text "Put 3 cards from your discard pile into your hand. (You can't use more than 1 GX attack in a game.)"
            energyCost P
            attackRequirement {
              gxCheck()
              assert my.discard
            }
            onAttack {
              gxPerform()
              my.discard.select(max:3,"select the card you want to put in your hand.").moveTo(my.hand)
            }
          }
        };
      case DEOXYS_67:
        return basic (this, hp:HP120, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Psychic" , {
            text "20+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
            energyCost C,C
            onAttack {
              damage 20
              damage 20*defending.cards.energyCount(C)
            }
          }
          move "Power Blast" , {
            text "120 damage. Discard an Energy from this Pokémon."
            energyCost P,P,C
            onAttack {
              damage 120
              afterDamage{
                discardSelfEnergy C
              }
            }
          }
        };
      case DEOXYS_68:
        return basic (this, hp:HP130, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Reflect" , {
            text "During your opponent's next turn, this Pokémon takes 40 less damage from attacks (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              reduceDamageNextTurn(hp(40),thisMove)
            }
          }
          move "Psychic Corkscrew" , {
            text "80 damage. This attack's damage isn't affected by Resistance."
            energyCost P,C,C
            onAttack {
              damage 80
              dontApplyResistance()
            }
          }
        };
      case DEOXYS_69:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Teleportation Burst" , {
            text "20 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost P
            onAttack {
              damage 20
              switchYourActive(may: true)
            }
          }
          move "Spear Dive" , {
            text "This attack does 50 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness or Resistance."
            energyCost C,C,C
            onAttack {
              noWrDamage(50,opp.all.select())
            }
          }
        };
      case LUNALA_70:
        return 	evolution (this, from:"Cosmoem", hp:HP160, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Shadow Shield" , {
            text "If this Pokémon has any [P] Energy attached to it, it takes 20 less damage from attacks (after applying Weakness and Resistance)."
            delayedA{
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && self.cards.energyCount(P) && it.dmg.value && it.notNoEffect) {
                    bc "Shadow Shield -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Full Moon Ray" , {
            text "80+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
            energyCost P,P,P
            onAttack {
              damage 80+20*defending.cards.energyCount(C)
            }
          }
        };
      case ONIX_71:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Screech" , {
            text "During your next turn, the Defending Pokémon takes 20 more damage from attacks (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES,{
                  bg.dm().each {
                    if(it.to == defending && it.dmg.value && it.notNoEffect) {
                      bc "screech +20"
                      it.dmg += hp(20)
                    }
                  }
                }
                unregisterAfter 3
                after SWITCH,defending, {unregister()}
                after EVOLVE,defending, {unregister()}
              }
            }
          }
          move "Rage" , {
            text "10+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost F,F
            onAttack {
              damage 10+10*(self.numberOfDamageCounters)
            }
          }
        };
      case PHANPY_72:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Tackle" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Endure" , {
            text "Flip a coin. If heads, if this Pokémon would be Knocked Out by damage from an attack during your opponent's next turn, it is not Knocked Out, and its remaining HP becomes 10."
            energyCost F
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
                  after SWITCH, self, {unregister()}
                }
              }
            }
          }
        };
      case DONPHAN_73:
        return 	evolution (this, from:"Phanpy", hp:HP130, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Flail" , {
            text "10× damage. This attack does 10 damage for each damage counter on this Pokémon."
            energyCost F
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Rapid Spin" , {
            text "50 damage. Switch this Pokémon with 1 of your Benched Pokémon. If you do, your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost F,C,C
            onAttack {
              damage 50
              afterDamage{
                if(my.bench){
                  sw self, my.bench.select()
                  if(opp.bench){
                    sw defending, opp.bench.oppSelect()
                  }
                }
              }
            }
          }
        };
      case LARVITAR_74:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Leer" , {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {apply PARALYZED}
            }
          }
          move "Rock Throw" , {
            text "20 damage. "
            energyCost F,C
            onAttack {
              damage 20
            }
          }
        };
      case PUPITAR_75:
        return 	evolution (this, from:"Larvitar", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Skull Bash" , {
            text "20 damage."
            energyCost C,C

            onAttack {
              damage 20
            }
          }
          move "Dust Devil" , {
            text "This attack does 20 damage to each non-[F] Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F,F
            onAttack {
              my.all.each{
                if(!it.types.contains(F)){
                  damage 20, it
                }
              }
              opp.all.each{
                if(!it.types.contains(F)){
                  damage 20, it
                }
              }
            }
          }
        };
      case MEDITITE_76:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Bide" , {
            text "Flip a coin. If heads, if this Pokémon would be Knocked Out by damage from an attack during your opponent's next turn, it is not Knocked Out, and its remaining HP becomes 10."
            energyCost F
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
                  after SWITCH, self, {unregister()}
                }
              }
            }
          }
          move "Kick" , {
            text "30 damage."
            energyCost F,F
            onAttack {
              damage 30
            }
          }
        };
      case MEDICHAM_77:
        return 	evolution (this, from:"Meditite", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Strike of Enlightenment" , {
            text "10+ damage. If this Pokémon's remaining HP is 30 or less, this attack does 160 more damage."
            energyCost F,F
            onAttack {
              damage 10
              if(self.getRemainingHP().value <= 30) damage 160
            }
          }
          move "Spinning Kick" , {
            text "90 damage. This Pokémon does 30 damage to itself."
            energyCost F,F
            onAttack {
              damage 90
              damage 30,self
            }
          }
        };
      case BALTOY_78:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Psy Bolt" , {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C,C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
        };
      case CLAYDOL_79:
        return 	evolution (this, from:"Baltoy", hp:HP110, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Psy Bolt" , {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Miraculous Spin" , {
            text "40× damage. This attack does 40 damage for each Steven's Resolve card in your discard pile."
            energyCost F,C,C
            onAttack {
              damage 40*my.discard.findAll{it.name.contains("Steven's Resolve")}.size()
            }
          }
        };
      case REGIROCK_80:
        return basic (this, hp:HP120, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Enhanced Stomp" , {
            text "20+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 20 more damage."
            energyCost F
            onAttack {
              damage 20
              if(self.cards.filterByType(POKEMON_TOOL)) damage 20
            }
          }
          move "Hammer Arm" , {
            text "100 damage. Discard the top card of your opponent's deck."
            energyCost F,F,C
            onAttack {
              damage 100
              if(opp.deck) {
                opp.deck.subList(0,1).discard()
              }
            }
          }
        };
      case GROUDON_81:
        return basic (this, hp:HP130, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          move "Wreck" , {
            text "50+ damage. If there is any Stadium card in play, this attack does 50 more damage. Then, discard that Stadium card."
            energyCost F,C,C
            onAttack {
              damage 50
              if(bg.stadiumInfoStruct) {
                damage 50
                discard bg.stadiumInfoStruct.stadiumCard
              }
            }
          }
          move "Ground Slash" , {
            text "130 damage. Discard an Energy from this Pokémon."
            energyCost F,F,C,C
            onAttack {
              damage 130
              afterDamage{
                discardSelfEnergy C
              }
            }
          }
        };
      case PALOSSAND_GX_82:
        return 	evolution (this, from:"Sandygast", hp:HP210, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          move "Eerie Light" , {
            text "60 damage. Your opponent's Active Pokémon is now Confused."
            energyCost F,C,C
            onAttack {
              damage 60
              applyAfterDamage CONFUSED
            }
          }
          move "Absorb Life" , {
            text "100 damage. Heal 20 damage from this Pokémon."
            energyCost F,F,C,C
            onAttack {
              damage 100
              heal 20, self
            }
          }
          move "Sandy Fear GX" , {
            text "60× damage. Look at the top 13 cards of your opponent's deck and discard any number of Pokémon you find there. This attack does 60 damage for each card you discarded in this way. Your opponent shuffles the other cards back into their deck. (You can't use more than 1 GX attack in a game.)"
            energyCost F,F,C,C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              opp.deck.subList(0,13).showToMe("The 13 top cards of your opponent's deck")
              damage 60*opp.deck.subList(0,13).filterByType(POKEMON).select(min:0,max:opp.deck.subList(0,13).filterByType(POKEMON).size(),"Select the cards you want to discard.").discard().size()
            }
          }
        };
      case MINIOR_83:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          bwAbility "Falling Star" , {
            text "Once during your turn (before your attack), if this Pokémon is in your hand and your Bench isn't full, you may move your Active Pokémon to your Bench and play this Pokémon as your new Active Pokémon."
            onActivate {r->
              if(r==PLAY_FROM_HAND && !self.active && confirm('Use Falling Star?')){
                powerUsed()
                sw my.active, self
              }
            }
          }
          move "Swift" , {
            text "30 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
            energyCost F
            onAttack {
              swiftDamage 30, defending
            }
          }
        };
      case ALOLAN_RATTATA_84:
        return basic (this, hp:HP040, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Call for the Boss" , {
            text "Search your deck for Alolan Raticate or Alolan Raticate-GX, reveal it, and put it into your hand. Then, shuffle your deck."
            attackRequirement {
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              my.deck.search(count:1,"Search 1 Alolan Raticate or Alolan Raticate-GX",{it.name.contains("Alolan Raticate") || it.name.contains("Alolan Raticate-GX")}).showToOpponent("Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Gnaw" , {
            text "20 damage."
            energyCost C,C
            onAttack {
              damage 20
            }
          }
        };
      case ALOLAN_RATICATE_GX_85:
        return 	evolution (this, from:"Alolan Rattata", hp:HP200, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Chuck Away" , {
            text "40× damage. Discard up to 2 cards from your hand. This attack does 40 damage for each card you discarded in this way."
            attackRequirement {
              assert my.hand : "you have no card to discard in your hand"
            }
            onAttack {
              damage 40*my.hand.select(max:2).discard().size()
            }
          }
          move "Hyper Fang" , {
            text "150 damage. Flip a coin. If tails, this attack does nothing."
            energyCost D,C,C
            onAttack {
              flip {damage 150}
            }
          }
          move "Item Maniac GX" , {
            text "Search your deck for up to 6 Item cards, reveal them, and put them into your hand. Then, shuffle your deck. (You can't use more than 1 GX attack in a game.)"
            attackRequirement {
              gxCheck()
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              gxPerform()
              my.deck.search(min:0,max:6,"Select up to 6 item cards",cardTypeFilter(ITEM)).showToOpponent("Selected cards").moveTo(my.hand)
            }
          }
        };
      case SNEASEL_86:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Fury Swipers" , {
            text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
            energyCost C
            onAttack {
              flip 3,{damage 10}
            }
          }
          move "Beat Up" , {
            text "30× damage. Flip a coin for each Pokémon you have in play. This attack does 30 damage for each heads."
            energyCost D,D
            onAttack {
              flip my.all.size(),{damage 30}
            }
          }
        };
      case TYRANITAR_87:
        return 	evolution (this, from:"Pupitar", hp:HP170, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Slam" , {
            text "60× damage. Flip 2 coins. This attack does 60 damage for each heads."
            energyCost C,C,C
            onAttack {
              flip 2,{damage 60}
            }
          }
          move "Trample" , {
            text "120 damage. For each Benched Pokémon (both yours and your opponent's), flip a coin. If heads, this attack does 60 damage to that Pokémon. This attack's damage isn't affected by Weakness or Resistance."
            energyCost D,D,C,C
            onAttack {
              damage 120
              def dmgPkmn = false
              my.bench.each{
                flip 1,{dmgPkmn = true},{dmgPkmn = false}
                if(dmgPkmn) damage 60,it
              }
              opp.bench.each{
                flip 1,{dmgPkmn = true},{dmgPkmn = false}
                if(dmgPkmn) damage 60,it
              }
            }
          }
        };
      case SABLEYE_88:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          bwAbility "Excavate" , {
            text "Once during your turn (before your attack), you may look at the top card of your deck. You may discard that card."
            actionA {
              checkLastTurn()
              assert my.deck : "There is no more card in your deck"
              powerUsed()
              my.deck.subList(0,1).showToMe("top card of your deck")
              if(confirm("Discard ${my.deck.subList(0,1).first()}?")){
                my.deck.subList(0,1).discard()
              }
            }
          }
          move "Disable" , {
            text "10 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost C
            onAttack {
              damage 10
              amnesia delegate
            }
          }
        };
      case STEELIX_89:
        return 	evolution (this, from:"Onix", hp:HP190, type:METAL, retreatCost:4) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Tackle" , {
            text "30 damage."
            energyCost C,C
            onAttack {
              damage 30
            }
          }
          move "Tail Crush" , {
            text "80+ damage. Flip a coin. If heads, this attack does 40 more damage."
            energyCost M,C,C
            onAttack {
              damage 80
              flip {damage 40}
            }
          }
        };
      case SCIZOR_GX_90:
        return 	evolution (this, from:"Scyther", hp:HP210, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Danger Perception" , {
            text "If this Pokémon's remaining HP is 100 or less, its attacks do 80 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
            delayedA{
              after PROCESS_ATTACK_EFFECTS,{
                if(self.remainingHP.value <= 100){
                  bg.dm().each{
                    if(it.from == self && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                      bc "Danger Perception +80"
                      it.dmg += hp(80)
                    }
                  }
                }
              }
            }
          }
          move "Steel Wing" , {
            text "80 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost M,C
            onAttack {
              damage 80
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }
          move "Cross-Cut GX" , {
            text "100+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 100 more damage. (You can't use more than 1 GX attack in a game.)"
            energyCost C,C,C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 100
              if(defending.evolution) damage 100
            }
          }
        };
      case MAWILE_91:
        return basic (this, hp:HP070, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Mining" , {
            text "Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck. If that card is a Pokémon Tool card, instead of putting it into your hand, you may attach it to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it."
            energyCost C
            attackRequirement {
              assert my.deck : "There is no more card in your deck"
            }
            onAttack {
              def selCrd = my.deck.search(count:1,"Select an item card",cardTypeFilter(ITEM))
              selCrd.each{
                if(it.cardTypes.is(POKEMON_TOOL)){
                  if(my.all.findAll{!it.cards.filterByType(POKEMON_TOOL)} && confirm("Attach this tool to one of your pokémon?")){
                    selCrd.moveTo(my.all.findAll{!it.cards.filterByType(POKEMON_TOOL)}.select("Attach $it to which pokémon?").cards)
                  }
                  else{
                    selCrd.moveTo(my.hand)
                  }
                }
                else{
                  selCrd.moveTo(my.hand)
                }
              }
              shuffleDeck()
            }
          }
          move "Bite Off" , {
            text "20+ damage. If your opponent's Active Pokémon is a Pokémon-GX or a Pokémon-EX, this attack does 30 more damage (before applying Weakness and Resistance)."
            energyCost M,C
            onAttack {
              damage 20
              if(defending.pokemonGX || defending.pokemonEX) damage 30
            }
          }
        };
      case BELDUM_92:
        return basic (this, hp:HP060, type:METAL, retreatCost:2) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Conductive Body" , {
            text "As long as this Pokémon is your Active Pokémon, its Retreat Cost is [C] less for each Beldum on your Bench."
            getterA (GET_RETREAT_COST, self) {h->
              if(self.active) {
                h.object -= self.owner.pbg.bench.findAll{it.name == "Beldum"}.size()
              }
            }
          }
          move "Ram" , {
            text "10 damage."
            energyCost M
            onAttack {
              damage 10
            }
          }
        };
      case BELDUM_93:
        return basic (this, hp:HP070, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Single Smash" , {
            text "50 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C,C
            onAttack {
              flip {damage 50}
            }
          }
        };
      case METANG_94:
        return 	evolution (this, from:"Beldum", hp:HP090, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Bullet Punch" , {
            text "20+ damage. Flip 2 coins. This attack does 20 more damage for each heads."
            energyCost M
            onAttack {
              damage 20
              flip 2,{damage 20}
            }
          }
        };
      case METAGROSS_95:
        return 	evolution (this, from:"Metang", hp:HP170, type:METAL, retreatCost:4) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Extend" , {
            text "As long as this Pokémon is your Active Pokémon, your turn does not end when you play Steven's Resolve."
            delayedA {
              before PLAY_TRAINER, {
                bg.em().storeObject("Extend_"+self.owner, self.active ? 1 : null)
              }
              unregister {
                bg.em().storeObject("Extend_"+self.owner, null)
              }
            }
          }
          move "Meteor Mash" , {
            text "60 damage. During your next turn, this Pokémon's Meteor Mash attack does 60 more damage (before applying Weakness and Resistance)."
            energyCost M
            onAttack {
              damage 60
              increasedBaseDamageNextTurn("Meteor Mash",hp(60))
            }
          }
        };
      case REGISTEEL_96:
        return basic (this, hp:HP120, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Exoskeleton" , {
            text "This Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
            delayedA{
              before APPLY_ATTACK_DAMAGES,{
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Exoskeleton -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Silver Fist" , {
            text "60+ damage. If your opponent's Active Pokémon has an Ability, this attack does 60 more damage."
            energyCost M,C,C
            onAttack {
              damage 60
              if(defending.hasModernAbility()) damage 60
            }
          }
        };
      case JIRACHI_PRISM_STAR_97:
        return basic (this, hp:HP080, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          globalAbility{
            delayed{
              after TAKE_PRIZE, {
                if(thisCard.player.pbg.prizeCardSet.notEmpty && ef.card != null && ef.card == thisCard
                  && thisCard.player.pbg.bench.notFull && bg.currentTurn == thisCard.player
                  && thisCard.player.pbg.hand.contains(thisCard)
                  && checkGlobalAbility(thisCard)
                  && confirm("You've picked ${thisCard}. Would you like to use Wish Upon a Star?")){
                  bc "${thisCard} used Wish Upon a Star"
                  thisCard.player.pbg.hand.remove(thisCard)
                  benchPCS(thisCard, OTHER, thisCard.player.toTargetPlayer())
                  bg.em().run(new TakePrize(thisCard.player, ef.pcs))
                }
              }
            }
          }
          bwAbility "Wish Upon a Star" , {
            text "If you took this Pokémon as a face-down Prize card during your turn and your Bench isn't full, before you put it into your hand, you may put it onto your Bench and take 1 more Prize card."
          }
          move "Perish Dream" , {
            text "10 damage. This Pokémon is now Asleep. At the end of your opponent's next turn, the Defending Pokémon will be Knocked Out."
            energyCost C,C,C
            onAttack {
              damage 10
              afterDamage{apply ASLEEP, self}
              delayed{
                before BETWEEN_TURNS, {
                  if(bg.currentTurn == self.owner.opposite){
                    new Knockout(defending).run(bg)
                  }
                }
                after SWITCH, self, {unregister()}
                after EVOLVE, self, {unregister()}
                after SWITCH, defending, {unregister()}
                after EVOLVE, defending, {unregister()}
                unregisterAfter 2
              }
            }
          }
        };
      case HEATRAN_98:
        return basic (this, hp:HP130, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Steelworks" , {
            text "Look at the top 4 cards of your deck and attach any number of [M] Energy cards you find there to 1 of your Pokémon. Shuffle the other cards back into your deck."
            energyCost M
            attackRequirement {
              assert my.deck : "There is no card in your deck"
            }
            onAttack {
              my.deck.subList(0,4).showToMe("top 4 cards of your deck")
              def eneNb = my.deck.subList(0,4).filterByType(BASIC_ENERGY).filterByEnergyType(M).size()
              if(eneNb != 0){
                def pcs = my.all.select("Attach energy to which pokémon?")
                my.deck.subList(0,4).filterByType(BASIC_ENERGY).filterByEnergyType(M).select(max:eneNb,"select the energy to attach to $pcs").moveTo(pcs.cards)
                shuffleDeck()
              }
            }
          }
          move "Steel Tackle" , {
            text "120 damage. This Pokémon does 30 damage to itself."
            energyCost M,C,C,C
            onAttack {
              damage 120
              damage 30, self
            }
          }
        };
      case SOLGALEO_99:
        return 	evolution (this, from:"Cosmoem", hp:HP160, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Full Metal Body" , {
            text "If this Pokémon has any [M] Energy attached to it, it has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target == self && self.cards.energyCount(M)) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Rising Dash" , {
            text "130 damage. This attack's damage isn't affected by Resistance."
            energyCost M,M,C
            onAttack {
              damage 130
              dontApplyResistance()
            }
          }
        };
      case CELESTEELA_100:
        return basic (this, hp:HP140, type:METAL, retreatCost:4) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          // customAbility{
          //   getter GET_MOVE_LIST, {h->
          //     if(h.effect.target == self && (my.prizeCardSet.size() + opp.prizeCardSet.size() == 6)){
          //       def list=[]
          //       for(move in h.object){
          //         def copy=move.shallowCopy()
          //         copy.energyCost.clear()
          //         copy.energyCost.add(M)
          //         list.add(copy)
          //       }
          //       h.object=list
          //     }
          //   }
          // }
          move "Moon Raker", {
            text "160 damage. If the total of both players' remaining Prize cards is exactly 6, this attack can be used for [M]."
            energyCost M
            attackRequirement {
              def i = my.prizeCardSet.size() + opp.prizeCardSet.size()
              if(i != 6) assert self.cards.energySufficient(M,C,C,C,C) : "Not enough energy. Total prize count was $i"
            }
            onAttack {
              damage 160
            }
          }
        };
      case KARTANA_101:
        return basic (this, hp:HP060, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Divine Paper" , {
            text "40+ damage. If your opponent has exactly 6 Prize cards remaining, this attack does 90 more damage."
            energyCost M,M
            onAttack {
              damage 40
              if(opp.prizeCardSet.size() == 6) damage 90
            }
          }
        };
      case STAKATAKA_GX_102:
        return basic (this, hp:HP180, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Ultra Wall" , {
            text "Your Ultra Beasts take 10 less damage from your opponent's attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to.owner == self.owner && it.to.topPokemonCard.cardTypes.is(ULTRA_BEAST) && it.dmg.value && it.notNoEffect) {
                    bc "Ultra Wall -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Gigaton Stomp" , {
            text "120 damage."
            energyCost M,M,C
            onAttack {
              damage 120
            }
          }
          move "Assembly GX" , {
            text "50+ damage. This attack does 50 more damage for each Prize card you have taken. (You can't use more than 1 GX attack in a game.)"
            energyCost M,M,C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 50
              damage 50*my.prizeCardSet.takenCount
            }
          }
        };
      case BAGON_103:
        return basic (this, hp:HP060, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          move "Rock Head" , {
            text "10 damage. During your opponent's next turn, this Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
            energyCost W
            onAttack {
              damage 10
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }
        };
      case BAGON_104:
        return basic (this, hp:HP070, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          move "Reckless Charge" , {
            text "40 damage. This Pokémon does 10 damage to itself."
            energyCost R,C
            onAttack {
              damage 40
              damage 10, self
            }
          }
        };
      case SHELGON_105:
        return 	evolution (this, from:"Bagon", hp:HP090, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          move "Raging Blade" , {
            text "30+ damage. If this Pokémon has any damage counters on it, this attack does 50 more damage."
            energyCost R,W
            onAttack {
              damage 30
              if(self.numberOfDamageCounters) damage 50
            }
          }
        };
      case SALAMENCE_106:
        return 	evolution (this, from:"Shelgon", hp:HP150, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          bwAbility "Dragon Wind" , {
            text "If this Pokémon is your Active Pokémon, once during your turn (before your attack), you may switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            actionA{
              checkLastTurn()
              assert self.active : "$self is not your active pokémon"
              assert opp.bench : "There is no pokémon on your opponent's bench to switch"
              powerUsed()
              sw self.owner.opposite.pbg.active, self.owner.opposite.pbg.bench.select("Choose the new active"), SRC_ABILITY
            }
          }
          move "Dragon Claw" , {
            text "100 damage."
            energyCost R,W,C,C
            onAttack {
              damage 100
            }
          }
        };
      case LATIAS_PRISM_STAR_107:
        return basic (this, hp:HP130, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          move "Dreamy Mist" , {
            text "30 damage. Attach a basic Energy card from your discard pile to each of your Basic Benched [N] Pokémon."
            energyCost C
            onAttack {
              damage 30
              afterDamage{
                my.bench.each{
                  if(it.types.contains(N) && it.basic){
                    attachEnergyFrom(may:true,basic:true,my.discard,it)
                  }
                }
              }
            }
          }
        };
      case LATIOS_PRISM_STAR_108:
        return basic (this, hp:HP140, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          move "Dragon Fleet" , {
            text "50× damage. This attack does 50 damage for each of your Evolution [N] Pokémon in play."
            energyCost C,C
            onAttack {
              my.all.each{
                if(it.types.contains(N) && it.topPokemonCard.cardTypes.is(EVOLUTION)) damage 50
              }
            }
          }
        };
      case RAYQUAZA_GX_109:
        return basic (this, hp:HP180, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          bwAbility "Stormy Winds" , {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may discard the top 3 cards of your deck. If you do, attach a basic Energy card from your discard pile to this Pokémon."
            onActivate {r->
              if(r==PLAY_FROM_HAND && my.deck && confirm('Use Stormy Winds?')){
                powerUsed()
                my.deck.subList(0,3).discard()
                attachEnergyFrom(basic:true,may:true,my.discard,self)
              }
            }
          }
          move "Dragon Break" , {
            text "30× damage. This attack does 30 damage times the amount of basic [G] and basic [L] Energy attached to your Pokémon."
            energyCost G,L,C
            onAttack {
              my.all.each{
                damage 30*(it.cards.filterByType(BASIC_ENERGY).filterByEnergyType(G).size() + it.cards.filterByType(BASIC_ENERGY).filterByEnergyType(L).size())
              }
            }
          }
          move "Tempest GX" , {
            text "Discard your hand and draw 10 cards. (You can't use more than 1 GX attack in a game.)"
            energyCost G
            attackRequirement {
              gxCheck()
              assert my.deck : "There is no card in your deck to draw"
            }
            onAttack {
              gxPerform()
              my.hand.discard()
              draw 10
            }
          }
        };
      case DUNSPARCE_110:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Strike and Run" , {
            text "Search your deck for up to 3 Basic Pokémon and put them onto your Bench. Then, shuffle your deck. If you put any Pokémon onto your Bench in this way, you may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount,3)
              def hasBenched = false
              deck.search (min: 0,max:maxSpace,cardTypeFilter(BASIC)).each {
                deck.remove(it)
                benchPCS(it)
                hasBenched = true
              }
              shuffleDeck()
              if(hasBenched && confirm("Switch $self with one of your benched pokémon?")){
                sw self,my.bench.select("New active")
              }
            }
          }
          move "Sudden Flash" , {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
        };
      case WINGULL_111:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Glide" , {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
        };
      case PELIPPER_112:
        return 	evolution (this, from:"Wingull", hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Firefighting" , {
            text "30 damage. Discard a [R] Energy from your opponent's Active Pokémon."
            energyCost C
            onAttack {
              damage 30
              if(defending.cards.filterByType(ENERGY).filterByEnergyType(R)) defending.cards.filterByType(ENERGY).filterByEnergyType(R).select("Choose the energy to discard").discard()
            }
          }
          move "Water Pulse" , {
            text "80 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost C,C,C
            onAttack {
              damage 80
              applyAfterDamage ASLEEP
            }
          }
        };
      case SLAKOTH_113:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Claw" , {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {damage 20}
            }
          }
          move "Slack Off" , {
            text "Heal all damage from this Pokémon. It can't attack during your next turn."
            energyCost C,C
            onAttack {
              heal 10*self.numberOfDamageCounters, self
              cantAttackNextTurn self
            }
          }
        };
      case VIGOROTH_114:
        return 	evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Fury Swipes" , {
            text "20× damage. Flip 3 coins. This attack does 20 damage for each heads."
            energyCost C,C
            onAttack {
              flip 3,{damage 20}
            }
          }
          move "Rage" , {
            text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
            energyCost C,C,C
            onAttack {
              damage 20+10*self.numberOfDamageCounters
            }
          }
        };
      case SLAKING_115:
        return 	evolution (this, from:"Vigoroth", hp:HP160, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          bwAbility "Lazy" , {
            text "As long as this Pokémon is your Active Pokémon, your opponent's Pokémon in play have no Abilities, except for Lazy."
            def effect1
//					def effect2
            onActivate {
              effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
                if (self.active && h.effect.ability.name != "Lazy" && h.effect.target.owner != self.owner && h.effect.ability instanceof BwAbility) {
                  h.object=true
                }
              }
//					  effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
//					    if (self.active && h.effect.target.player != self.owner) {
//					      h.object=true
//					    }
//					  }
            }
            onDeactivate {
              effect1.unregister()
//					  effect2.unregister()
            }
          }
          move "Critical Move" , {
            text "160 damage. Discard an Energy from this Pokémon. It can't attack during your next turn."
            energyCost C,C,C
            onAttack {
              damage 160
              afterDamage{
                discardSelfEnergy C
                cantAttackNextTurn self
              }
            }
          }
        };
      case WHISMUR_116:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Bawl" , {
            text "You can use this attack only if you go second, and only on your first turn. Your opponent can't play any Trainer cards from their hand during their next turn."
            energyCost C
            attackRequirement {
              assert bg.turnCount == 2 : "You can use this attack only on your first turn"
            }
            onAttack {
              delayed{
                before PLAY_TRAINER, {
                  if (bg.currentTurn == self.owner.opposite) {
                    wcu "Bawl prevents playing trainer cards"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Pound" , {
            text "20 damage."
            energyCost C,C
            onAttack {
              damage 20
            }
          }
        };
      case WHISMUR_117:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Wail" , {
            text "40 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C,C,C
            onAttack {
              damage 40
              if(opp.bench){
                afterDamage{
                  sw defending, opp.bench.oppSelect("New active")
                }
              }
            }
          }
        };
      case LOUDRED_118:
        return 	evolution (this, from:"Whismur", hp:HP100, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          move "Cracking Voice" , {
            text "60 damage. Your opponent's Active Pokémon is now Confused."
            energyCost C,C,C
            onAttack {
              damage 60
              applyAfterDamage CONFUSED
            }
          }
        };
      case EXPLOUD_119:
        return 	evolution (this, from:"Loudred", hp:HP150, type:COLORLESS, retreatCost:4) {
          weakness FIGHTING
          move "Dangerous Concert" , {
            text "80 damage. This attack does 30 damage to each of your opponent's Benched Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C,C,C
            onAttack {
              damage 80
              opp.bench.each{
                if(it.numberOfDamageCounters) damage 30, it
              }
            }
          }
          move "Heavy Impact" , {
            text "100 damage."
            energyCost C,C,C,C
            onAttack {
              damage 100
            }
          }
        };
      case SKITTY_120:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Fake Out" , {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
        };
      case DELCATTY_121:
        return 	evolution (this, from:"Skitty", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Search for Friends" , {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 2 Supporter cards from your discard pile into your hand."
            onActivate {r->
              if(r==PLAY_FROM_HAND && self.evolution && my.discard.filterByType(SUPPORTER) && confirm('Use Search for Friends?')){
                powerUsed()
                my.discard.filterByType(SUPPORTER).select(max:2,"Select up to 2 supporter cards.").moveTo(my.hand)
              }
            }
          }
          move "Cat Kick" , {
            text "40 damage."
            energyCost C,C
            onAttack {
              damage 40
            }
          }
        };
      case KECLEON_122:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          bwAbility "Unit Color 2" , {
            text "As long as this Pokémon has Unit Energy LPM attached to it, it is a [L], [P], and [M] Pokémon."
            getterA (GET_POKEMON_TYPE,self){h->
              if(self.cards.findAll{it.name=="Unit Energy LPM"}){
                h.object.clear()
                h.object.add(LIGHTNING)
                h.object.add(PSYCHIC)
                h.object.add(METAL)
              }
            }
          }
          move "Slash" , {
            text "80 damage."
            energyCost C,C,C
            onAttack {
              damage 80
            }
          }
        };
      case ACRO_BIKE_123:
        return copy(PrimalClash.ACRO_BIKE_122, this);
      case APRICORN_MAKER_124:
        return copy(Skyridge.APRICORN_MAKER_121, this);
      case BEAST_BALL_125:
        return 	itemCard (this) {
          text "Look at your face-down Prize cards. You may reveal an Ultra Beast card you find there, put it into your hand, and put this Beast Ball in its place. (If you don't reveal an Ultra Beast card, put this card in the discard pile.) Then, shuffle your face-down Prize cards.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
          onPlay {
            my.prizeCardSet.showToMe("Your prize")
            if(my.prizeCardSet.filterByType(ULTRA_BEAST)){
              def tar = my.prizeCardSet.filterByType(ULTRA_BEAST).select(min:0,"Replace $thisCard with one of those prize?")
              if(tar){
                tar.showToOpponent("Your opponent put this card in his hand")
                my.hand.remove(thisCard)
                my.prizeCardSet.set(my.prizeCardSet.indexOf(tar.first()), thisCard)
                my.hand.add(tar.first())
                my.prizeCardSet.shuffle()
                bc "Took $tar and shuffled $thisCard into prizes"
              }
            }
          }
          playRequirement{
          }
        };
      case BILLS_MAINTENANCE_126:
        return copy(FireRedLeafGreen.BILL_S_MAINTENANCE_87, this);
      case COPYCAT_127:
        return copy(TeamRocketReturns.COPYCAT_83, this);
      case ENERGY_RECYCLE_SYSTEM_128:
        return copy(Dragon.ENERGY_RECYCLE_SYSTEM_84, this);
      case ENERGY_SWITCH_129:
        return copy(BlackWhite.ENERGY_SWITCH_94, this);
      case FISHERMAN_130:
        return copy(Breakthrough.FISHERMAN_136, this);
      case FRIEND_BALL_131:
        return copy(Skyridge.FRIEND_BALL_126, this);
      case HAU_132:
        return supporter(this) {
          text "Draw 3 cards.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            draw 3
          }
          playRequirement{
            assert my.deck.notEmpty
          }
        };
      case HIKER_133:
        return supporter(this) {
          text "Look at the top 5 cards of either players deck and choose 1 of them. That player shuffles the other cards back into their deck. Then, put the card you chose on top of that deck.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            if(!my.deck){
              def tar = opp.deck.subList(0,5).select("Choose the card to put at the top of the deck")
              opp.deck.remove(tar)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              opp.deck.addAll(0, tar)
            }
            else if(!opp.deck){
              def tar = my.deck.subList(0,5).select("Choose the card to put at the top of the deck")
              my.deck.remove(tar)
              shuffleDeck()
              my.deck.addAll(0, tar)
            }
            else{
              my.deck.subList(0,5).showToMe("The 5 top cards of your deck")
              opp.deck.subList(0,5).showToMe("The 5 top cards of your opponent's deck")
              def cl=[1,2]
              def c=choose(cl,["Your deck", "Your opponent's deck"], "Choose 1 card from which deck?")
              if(c==1){
                def tar = my.deck.subList(0,5).select("Choose the card to put at the top of the deck")
                my.deck.remove(tar)
                shuffleDeck()
                my.deck.addAll(0, tar)
              }
              else {
                def tar = opp.deck.subList(0,5).select("Choose the card to put at the top of the deck")
                opp.deck.remove(tar)
                shuffleDeck(null, TargetPlayer.OPPONENT)
                opp.deck.addAll(0, tar)
              }
            }
          }
          playRequirement{
            assert my.deck.notEmpty && opp.deck.notEmpty
          }
        };
      case HUSTLE_BELT_134:
        return 	pokemonTool(this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesnt already have a Pokémon Tool attached to it.\nIf the Pokémon this card is attached to has 30 HP or less remaining and has any damage counters on it, its attacks do 60 more damage to your opponents Active Pokémon (before applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack).\n"
          def eff
          onPlay {reason->
            eff=delayed{
              after PROCESS_ATTACK_EFFECTS, {
                if(self.getRemainingHP().value <= 30 && self.numberOfDamageCounters){
                  bg.dm().each{
                    if(it.from == self && it.notNoEffect && it.dmg.value) {
                      bc "Hustle Belt +60"
                      it.dmg += hp(60)
                    }
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case LAST_CHANCE_POTION_135:
        return 	itemCard (this) {
          text "Heal 120 damage from 1 of your Pokémon that has 30 HP or less remaining.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
          onPlay {
            def pcs = my.all.findAll{it.numberOfDamageCounters && it.getRemainingHP().value <= 30}.select("Choose the pokémon to heal")
            heal 120, pcs
          }
          playRequirement{
            assert my.all.findAll{it.numberOfDamageCounters && it.getRemainingHP().value <= 30}
          }
        };
      case LIFE_HERB_136:
        return 	itemCard (this) {
          text "You may play as many Item cards as you like during your turn (before your attack).\n"
          onPlay {
            flip {
              def tar = my.all.findAll{(it.numberOfDamageCounters !=0 || !(it.noSPC()))}
              if(tar){
                def pcs = tar.select("select 1 of your Pokémon to remove all Special Conditions and 6 damage counters")
                clearSpecialCondition(pcs,Source.TRAINER_CARD)
                heal 60, pcs
              }
            }
          }
          playRequirement{
            assert my.all.findAll{(it.numberOfDamageCounters !=0 || !(it.noSPC()))}
          }
        };
      case LISIA_137:
        return supporter(this) {
          text "Search your deck for up to 2 Prism Star cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            my.deck.search(max:2,"Select up to 2 Prism Star cards",cardTypeFilter(PRISM_STAR)).showToOpponent("Selected cards.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case LURE_BALL_138:
        return copy(Skyridge.LURE_BALL_128, this);
      case THE_MASKED_ROYAL_139:
        return supporter(this) {
          text "Attach a basic Energy card from your hand to one of your Stage 2 [G], [R], or [W] Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            attachEnergyFrom(basic:true,my.hand,my.all.findAll{it.topPokemonCard.cardTypes.is(STAGE2) && (it.types.contains(G) || it.types.contains(R) || it.types.contains(W))})
          }
          playRequirement{
            assert my.all.findAll{it.topPokemonCard.cardTypes.is(STAGE2) && (it.types.contains(G) || it.types.contains(R) || it.types.contains(W))} && my.hand.filterByType(BASIC_ENERGY)
          }
        };
      case POKENAV_140:
        return copy(RubySapphire.POKENAV_88, this);
      case RAINBOW_BRUSH_141:
        return 	itemCard (this) {
          text "Choose an Energy card attached to 1 of your Pokémon. Search your deck for a basic Energy card and switch it with that card. Shuffle the first Energy card into your deck.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
          onPlay {
            def pcs = my.all.findAll{it.cards.filterByType(ENERGY)}.select("Choose 1 pokémon with an energy to switch with another basic energy")
            def tar = pcs.cards.filterByType(ENERGY).select("Choose the energy to switch")
            def src = my.deck.search(min:0,"Choose the new basic energy to switch with $tar on $pcs",cardTypeFilter(BASIC_ENERGY))
            if(src){
              tar.moveTo(my.deck)
              attachEnergyFrom(src,pcs)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.all.findAll{it.cards.filterByType(ENERGY)} && my.deck
          }
        };
      case RARE_CANDY_142:
        return copy(DarkExplorers.RARE_CANDY_100, this);
      case SHRINE_OF_PUNISHMENT_143:
        return stadium(this) {
          text "Between turns, put 1 damage counter on each Pokémon-GX and Pokémon-EX (both yours and your opponents).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you cant play this card.\n"
          def eff
          onPlay {
            eff = delayed {
              before BETWEEN_TURNS, {
                def once = true
                all.each {
                  if(it.pokemonEX || it.pokemonGX){
                    if(once) {
                      bc "Shrine of Punishment"
                      once = false
                    }
                    directDamage(10, it, TRAINER_CARD)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case SKY_PILLAR_144:
        return stadium(this) {
          text "Prevent all effects of the opponents attacks, including damage, done to Benched Pokémon (both yours and your opponents).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you cant play this card.\n"
          def eff
          onPlay {
            eff = delayed {
              before null, null, Source.ATTACK, {
                if (ef.effectType != DAMAGE){
                  def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
                  if(pcs != null && pcs.benched && pcs.owner != bg.currentTurn){
                    bc "Sky Pillars prevents effect to Benched Pokémon"
                    prevent()
                  }
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.notNoEffect && it.to.benched && it.to.owner != bg.currentTurn && it.dmg.value){
                    it.dmg = hp(0)
                    bc "Sky Pillars prevents damage to ${it.to}"
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case STEVENS_RESOLVE_145:
        return supporter(this) {
          text "Search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck. Your turn ends.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            my.deck.search(max:3,"Select up to 3 cards",{true}).moveTo(hidden:true,my.hand)
            if(!bg.em().retrieveObject("Extend_"+thisCard.player)){
              bg.gm().betweenTurns()
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      case SUPER_SCOOP_UP_146:
        return copy(BlackWhite.SUPER_SCOOP_UP_103, this);
      case SWITCH_147:
        return copy(BlackWhite.SWITCH_104, this);
      case TATE_LIZA_148:
        return supporter(this) {
          text "Choose 1:\nShuffle your hand into your deck. Then, draw 5 cards.\nSwitch your Active Pokémon with 1 of your Benched Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            def a1 = {
              my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
              shuffleDeck()
              draw 5
            }
            def a2 = {
              sw my.active, my.bench.select("New active"), TRAINER_CARD
            }
            if(!my.bench){
              a1()
            }
            else if(!my.deck.notEmpty && (my.hand.size() <= 1)){
              a2()
            }
            else{
              def cl=[1,2]
              def c=choose(cl,["Shuffle your hand into your deck. Then, draw 5 cards.", "Switch your Active Pokémon with 1 of your Benched Pokémon."], "What do you want to do?")
              if(c==1) a1()
              if(c==2) a2()
            }
          }
          playRequirement{
            assert my.deck.notEmpty || (my.hand.size() > 1) || my.bench
          }
        };
      case TV_REPORTER_149:
        return supporter(this) {
          text "Draw 3 cards. Then, discard a card from your hand. If you have no cards in your deck, you can't play this card.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
          onPlay {
            draw 3
            my.hand.getExcludedList(thisCard).select("Choose the card to discard").discard()
          }
          playRequirement{
            assert my.deck
          }
        };
      case UNDERGROUND_EXPEDITION_150:
        return copy(Skyridge.UNDERGROUND_EXPEDITION_140, this);
      case RAINBOW_ENERGY_151:
        return copy(Xy.RAINBOW_ENERGY_131, this);
      case SHIFTRY_GX_152:
        return copy(SHIFTRY_GX_14,this);
      case BLAZIKEN_GX_153:
        return copy(BLAZIKEN_GX_28,this);
      case ARTICUNO_GX_154:
        return copy(ARTICUNO_GX_31,this);
      case ELECTRODE_GX_155:
        return copy(ELECTRODE_GX_48,this)
      case MR_MIME_GX_156:
        return copy(MR_MIME_GX_56,this);
      case BANETTE_GX_157:
        return copy(BANETTE_GX_66,this);
      case SCIZOR_GX_158:
        return copy(SCIZOR_GX_90,this);
      case STAKATAKA_GX_159:
        return copy(STAKATAKA_GX_102,this);
      case RAYQUAZA_GX_160:
        return copy(RAYQUAZA_GX_109,this);
      case APRICORN_MAKER_161:
        return copy(APRICORN_MAKER_124,this);
      case BILLS_MAINTENANCE_162:
        return copy(BILLS_MAINTENANCE_126,this);
      case COPYCAT_163:
        return copy(COPYCAT_127,this);
      case LISIA_164:
        return copy(LISIA_137,this);
      case STEVENS_RESOLVE_165:
        return copy(STEVENS_RESOLVE_145,this);
      case TATE_LIZA_166:
        return copy(TATE_LIZA_148,this);
      case TV_REPORTER_167:
        return copy(TV_REPORTER_149,this);
      case UNDERGROUND_EXPEDITION_168:
        return copy(UNDERGROUND_EXPEDITION_150,this);
      case SHIFTRY_GX_169:
        return copy(SHIFTRY_GX_14,this);
      case BLAZIKEN_GX_170:
        return copy(BLAZIKEN_GX_28,this);
      case ARTICUNO_GX_171:
        return copy(ARTICUNO_GX_31,this);
      case ELECTRODE_GX_172:
        return copy(ELECTRODE_GX_48,this);
      case MR_MIME_GX_173:
        return copy(MR_MIME_GX_56,this);
      case BANETTE_GX_174:
        return copy(BANETTE_GX_66,this);
      case SCIZOR_GX_175:
        return copy(SCIZOR_GX_90,this);
      case STAKATAKA_GX_176:
        return copy(STAKATAKA_GX_102,this);
      case RAYQUAZA_GX_177:
        return copy(RAYQUAZA_GX_109,this);
      case ACRO_BIKE_178:
        return copy(ACRO_BIKE_123,this);
      case HUSTLE_BELT_179:
        return copy(HUSTLE_BELT_134,this);
      case LIFE_HERB_180:
        return copy(LIFE_HERB_136,this);
      case POKENAV_181:
        return copy(POKENAV_140,this);
      case RAINBOW_BRUSH_182:
        return copy(RAINBOW_BRUSH_141,this);
      default:
        return null;
    }
  }

}
