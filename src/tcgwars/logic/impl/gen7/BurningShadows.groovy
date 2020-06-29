package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen5.BlackWhite
import tcgwars.logic.impl.gen5.PlasmaStorm
import tcgwars.logic.impl.gen6.PrimalClash;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.*;
import tcgwars.logic.card.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum BurningShadows implements LogicCardInfo {

  CATERPIE_1 ("Caterpie", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  METAPOD_2 ("Metapod", 2, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BUTTERFREE_3 ("Butterfree", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ODDISH_4 ("Oddish", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GLOOM_5 ("Gloom", 5, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_6 ("Vileplume", 6, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TANGELA_7 ("Tangela", 7, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TANGROWTH_8 ("Tangrowth", 8, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LEDYBA_9 ("Ledyba", 9, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LEDIAN_10 ("Ledian", 10, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  HERACROSS_11 ("Heracross", 11, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  PANSAGE_12 ("Pansage", 12, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SIMISAGE_13 ("Simisage", 13, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DEWPIDER_14 ("Dewpider", 14, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ARAQUANID_15 ("Araquanid", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WIMPOD_16 ("Wimpod", 16, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOLISOPOD_GX_17 ("Golisopod-GX", 17, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  CHARMANDER_18 ("Charmander", 18, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHARMELEON_19 ("Charmeleon", 19, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHARIZARD_GX_20 ("Charizard-GX", 20, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  HO_OH_GX_21 ("Ho-Oh-GX", 21, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  PANSEAR_22 ("Pansear", 22, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SIMISEAR_23 ("Simisear", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  HEATMOR_24 ("Heatmor", 24, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  SALAZZLE_GX_25 ("Salazzle-GX", 25, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  TURTONATOR_26 ("Turtonator", 26, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  ALOLAN_VULPIX_27 ("Alolan Vulpix", 27, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ALOLAN_NINETALES_28 ("Alolan Ninetales", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HORSEA_29 ("Horsea", 29, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SEADRA_30 ("Seadra", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KINGDRA_31 ("Kingdra", 31, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  MAGIKARP_32 ("Magikarp", 32, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GYARADOS_33 ("Gyarados", 33, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MARILL_34 ("Marill", 34, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  AZUMARILL_35 ("Azumarill", 35, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PANPOUR_36 ("Panpour", 36, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SIMIPOUR_37 ("Simipour", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BRUXISH_38 ("Bruxish", 38, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  TAPU_FINI_GX_39 ("Tapu Fini-GX", 39, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  PIKACHU_40 ("Pikachu", 40, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RAICHU_41 ("Raichu", 41, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ELECTABUZZ_42 ("Electabuzz", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTIVIRE_43 ("Electivire", 43, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  TYNAMO_44 ("Tynamo", 44, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  EELEKTRIK_45 ("Eelektrik", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  EELEKTROSS_46 ("Eelektross", 46, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  TOGEDEMARU_47 ("Togedemaru", 47, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SLOWKING_48 ("Slowking", 48, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  WOBBUFFET_49 ("Wobbuffet", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SEVIPER_50 ("Seviper", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSKULL_51 ("Duskull", 51, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DUSCLOPS_52 ("Dusclops", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUSKNOIR_53 ("Dusknoir", 53, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  CROAGUNK_54 ("Croagunk", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  TOXICROAK_55 ("Toxicroak", 55, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  VENIPEDE_56 ("Venipede", 56, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  WHIRLIPEDE_57 ("Whirlipede", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SCOLIPEDE_58 ("Scolipede", 58, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  ESPURR_59 ("Espurr", 59, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MEOWSTIC_60 ("Meowstic", 60, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SANDYGAST_61 ("Sandygast", 61, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PALOSSAND_62 ("Palossand", 62, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  NECROZMA_GX_63 ("Necrozma-GX", 63, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  MACHAMP_GX_64 ("Machamp-GX", 64, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  RHYHORN_65 ("Rhyhorn", 65, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  RHYDON_66 ("Rhydon", 66, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RHYPERIOR_67 ("Rhyperior", 67, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LUNATONE_68 ("Lunatone", 68, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  SOLROCK_69 ("Solrock", 69, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  RIOLU_70 ("Riolu", 70, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUCARIO_71 ("Lucario", 71, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SAWK_72 ("Sawk", 72, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  CRABRAWLER_73 ("Crabrawler", 73, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  CRABOMINABLE_74 ("Crabominable", 74, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LYCANROC_75 ("Lycanroc", 75, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LYCANROC_76 ("Lycanroc", 76, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MUDBRAY_77 ("Mudbray", 77, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MUDSDALE_78 ("Mudsdale", 78, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PASSIMIAN_79 ("Passimian", 79, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  MARSHADOW_GX_80 ("Marshadow-GX", 80, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  ALOLAN_RATTATA_81 ("Alolan Rattata", 81, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ALOLAN_RATICATE_82 ("Alolan Raticate", 82, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  ALOLAN_GRIMER_83 ("Alolan Grimer", 83, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  ALOLAN_MUK_GX_84 ("Alolan Muk-GX", 84, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
  SNEASEL_85 ("Sneasel", 85, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  WEAVILE_86 ("Weavile", 86, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARKRAI_87 ("Darkrai", 87, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  DARKRAI_GX_88 ("Darkrai-GX", 88, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  INKAY_89 ("Inkay", 89, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  MALAMAR_90 ("Malamar", 90, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  RALTS_91 ("Ralts", 91, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  KIRLIA_92 ("Kirlia", 92, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  GARDEVOIR_GX_93 ("Gardevoir-GX", 93, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  DIANCIE_94 ("Diancie", 94, Rarity.HOLORARE, [BASIC, POKEMON, _FAIRY_]),
  CUTIEFLY_95 ("Cutiefly", 95, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  RIBOMBEE_96 ("Ribombee", 96, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  MORELULL_97 ("Morelull", 97, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  SHIINOTIC_98 ("Shiinotic", 98, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  NOIVERN_GX_99 ("Noivern-GX", 99, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  ZYGARDE_100 ("Zygarde", 100, Rarity.HOLORARE, [BASIC, POKEMON, _DRAGON_]),
  MEOWTH_101 ("Meowth", 101, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PERSIAN_102 ("Persian", 102, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PORYGON_103 ("Porygon", 103, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PORYGON2_104 ("Porygon2", 104, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PORYGON_Z_105 ("Porygon-Z", 105, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  HOOTHOOT_106 ("Hoothoot", 106, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NOCTOWL_107 ("Noctowl", 107, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BOUFFALANT_108 ("Bouffalant", 108, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  NOIBAT_109 ("Noibat", 109, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUFFUL_110 ("Stufful", 110, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BEWEAR_111 ("Bewear", 111, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ACEROLA_112 ("Acerola", 112, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  BODYBUILDING_DUMBBELLS_113 ("Bodybuilding Dumbbells", 113, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  ESCAPE_ROPE_114 ("Escape Rope", 114, Rarity.UNCOMMON, [ITEM, TRAINER]),
  GUZMA_115 ("Guzma", 115, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  KIAWE_116 ("Kiawe", 116, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LANA_117 ("Lana", 117, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MOUNT_LANAKILA_118 ("Mount Lanakila", 118, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  OLIVIA_119 ("Olivia", 119, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  PLUMERIA_120 ("Plumeria", 120, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  PO_TOWN_121 ("Po Town", 121, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  ROTOM_DEX_POKE_FINDER_MODE_122 ("Rotom Dex Poké Finder Mode", 122, Rarity.UNCOMMON, [ITEM, TRAINER]),
  SOPHOCLES_123 ("Sophocles", 123, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  SUPER_SCOOP_UP_124 ("Super Scoop Up", 124, Rarity.UNCOMMON, [ITEM, TRAINER]),
  TORMENTING_SPRAY_125 ("Tormenting Spray", 125, Rarity.UNCOMMON, [ITEM, TRAINER]),
  WEAKNESS_POLICY_126 ("Weakness Policy", 126, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  WICKE_127 ("Wicke", 127, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  WISHFUL_BATON_128 ("Wishful Baton", 128, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  GOLISOPOD_GX_129 ("Golisopod-GX", 129, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  TAPU_BULU_GX_130 ("Tapu Bulu-GX", 130, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _GRASS_]),
  HO_OH_GX_131 ("Ho-Oh-GX", 131, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  SALAZZLE_GX_132 ("Salazzle-GX", 132, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  TAPU_FINI_GX_133 ("Tapu Fini-GX", 133, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  NECROZMA_GX_134 ("Necrozma-GX", 134, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  MACHAMP_GX_135 ("Machamp-GX", 135, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  LYCANROC_GX_136 ("Lycanroc-GX", 136, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  MARSHADOW_GX_137 ("Marshadow-GX", 137, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  ALOLAN_MUK_GX_138 ("Alolan Muk-GX", 138, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
  DARKRAI_GX_139 ("Darkrai-GX", 139, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  GARDEVOIR_GX_140 ("Gardevoir-GX", 140, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  NOIVERN_GX_141 ("Noivern-GX", 141, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  ACEROLA_142 ("Acerola", 142, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  GUZMA_143 ("Guzma", 143, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  KIAWE_144 ("Kiawe", 144, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  PLUMERIA_145 ("Plumeria", 145, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  SOPHOCLES_146 ("Sophocles", 146, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  WICKE_147 ("Wicke", 147, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  GOLISOPOD_GX_148 ("Golisopod-GX", 148, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  TAPU_BULU_GX_149 ("Tapu Bulu-GX", 149, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _GRASS_]),
  CHARIZARD_GX_150 ("Charizard-GX", 150, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  SALAZZLE_GX_151 ("Salazzle-GX", 151, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  TAPU_FINI_GX_152 ("Tapu Fini-GX", 152, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  NECROZMA_GX_153 ("Necrozma-GX", 153, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  MACHAMP_GX_154 ("Machamp-GX", 154, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  LYCANROC_GX_155 ("Lycanroc-GX", 155, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  MARSHADOW_GX_156 ("Marshadow-GX", 156, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  ALOLAN_MUK_GX_157 ("Alolan Muk-GX", 157, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
  DARKRAI_GX_158 ("Darkrai-GX", 158, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  GARDEVOIR_GX_159 ("Gardevoir-GX", 159, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  NOIVERN_GX_160 ("Noivern-GX", 160, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  BODYBUILDING_DUMBBELLS_161 ("Bodybuilding Dumbbells", 161, Rarity.SECRET, [POKEMON_TOOL, ITEM, TRAINER]),
  CHOICE_BAND_162 ("Choice Band", 162, Rarity.SECRET, [POKEMON_TOOL, ITEM, TRAINER]),
  ESCAPE_ROPE_163 ("Escape Rope", 163, Rarity.SECRET, [ITEM, TRAINER]),
  MULTI_SWITCH_164 ("Multi Switch", 164, Rarity.SECRET, [ITEM, TRAINER]),
  RESCUE_STRETCHER_165 ("Rescue Stretcher", 165, Rarity.SECRET, [ITEM, TRAINER]),
  SUPER_SCOOP_UP_166 ("Super Scoop Up", 166, Rarity.SECRET, [ITEM, TRAINER]),
  FIRE_ENERGY_167 ("Fire Energy", 167, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
  DARKNESS_ENERGY_168 ("Darkness Energy", 168, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
  FAIRY_ENERGY_169 ("Fairy Energy", 169, Rarity.SECRET, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  BurningShadows(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.BURNING_SHADOWS;
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
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Surprise Attack", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost G
            onAttack {
              flip {damage 20}
            }
          }

        };
      case METAPOD_2:
        return evolution (this, from:"Caterpie", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Ram", {
            text "20 damage."
            energyCost G
            onAttack {
              damage 20
            }
          }
          move "Shed Skin", {
            text "Heal 40 damage from this Pokémon."
            energyCost C, C
            onAttack {
              healAfterDamage(40, self)
            }
          }

        };
      case BUTTERFREE_3:
        return evolution (this, from:"Metapod", hp:HP120, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Bye-Bye Heal", {
            text "Heal all damage from all of your Pokémon. Shuffle this Pokémon and all cards attached to it into your deck."
            energyCost G
            attackRequirement {
              assert my.bench.notEmpty : "This is your only pokemon"
            }
            onAttack {
              my.all.each {heal(it.damage.value, it)}
              self.cards.moveTo(my.deck)
              removePCS(self)
              shuffleDeck()
            }
          }
          move "Stun Spore", {
            text "60 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost G, C, C
            onAttack {
              damage 60
              flipThenApplySC PARALYZED
            }
          }

        };
      case ODDISH_4:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Poison Powder", {
            text "Your opponent's Active Pokémon is now Poisoned."
            energyCost G
            onAttack {
              apply POISONED
            }
          }

        };
      case GLOOM_5:
        return evolution (this, from:"Oddish", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Stinky Scent", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost G
            onAttack {
              apply CONFUSED
            }
          }
          move "Razor Leaf", {
            text "30 damage."
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case VILEPLUME_6:
        return evolution (this, from:"Gloom", hp:HP140, type:GRASS, retreatCost:3) {
          weakness FIRE
          bwAbility "Disgusting Pollen", {
            text "As long as this Pokémon is your Active Pokémon, your opponent's Basic Pokémon can't attack."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                //TODO: Remove workaround for stealthy hood whenever that's fixed.
                if(self.active && ef.attacker.owner != self.owner && ef.attacker.basic && ef.attacker.cards.any{it.name == "Stealthy Hood"}) {
                  wcu "Disgusting Pollen prevents attack"
                  prevent()
                }
              }
            }
          }
          move "Downer Shock", {
            text "60 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Asleep. If tails, your opponent's Active Pokémon is now Confused."
            energyCost G, G, C
            onAttack {
              damage 60
              flip 1, {
                applyAfterDamage ASLEEP
              }, {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case TANGELA_7:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Bind Down", {
            text "10 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost G
            onAttack {
              damage 10
              cantRetreat defending
            }
          }

        };
      case TANGROWTH_8:
        return evolution (this, from:"Tangela", hp:HP140, type:GRASS, retreatCost:4) {
          weakness FIRE
          move "Giga Drain", {
            text "30 damage. Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon."
            energyCost G
            onAttack {
              damage 30
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Crosswise Whip", {
            text "50× damage. Flip 4 coins. This attack does 50 damage times the number of heads."
            energyCost C, C, C, C
            onAttack {
              flip 4,{damage 50}
            }
          }

        };
      case LEDYBA_9:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Agility", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost G
            onAttack {
              damage 10
              flip{preventAllEffectsNextTurn()}
            }
          }

        };
      case LEDIAN_10:
        return evolution (this, from:"Ledyba", hp:HP090, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Swift", {
            text "30 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
            energyCost G
            onAttack {
              swiftDamage 30, defending
            }
          }
          move "Comet Punch", {
            text "40× damage. Flip 4 coins. This attack does 40 damage for each heads."
            energyCost C, C, C
            onAttack {
              flip 4,{damage 40}
            }
          }

        };
      case HERACROSS_11:
        return basic (this, hp:HP110, type:GRASS, retreatCost:2) {
          weakness FIRE
          bwAbility "Guts", {
            text "If this Pokémon would be Knocked Out by damage from an attack, flip a coin. If heads, this Pokémon is not Knocked Out, and its remaining HP becomes 10."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                  flip "Guts", {
                    self.damage = self.fullHP - hp(10)
                    bc "Guts saved $self!"
                    prevent()
                  }
                }
              }
            }
          }
          move "Pitch", {
            text "50 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost G, G
            onAttack {
              damage 50
              whirlwind()
            }
          }

        };
      case PANSAGE_12:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Vine Whip", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case SIMISAGE_13:
        return evolution (this, from:"Pansage", hp:HP090, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Scratch", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Leaf Supply", {
            text "50 damage. You may attach a [G] Energy card from your hand to 1 of your Pokémon."
            energyCost G, C
            onAttack {
              damage 50
              afterDamage {
                attachEnergyFrom(may: true, type: GRASS, my.hand, my.all)
              }
            }
          }

        };
      case DEWPIDER_14:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Ambush", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
            energyCost G
            onAttack {
              damage 10
              flip{damage 10}
            }
          }

        };
      case ARAQUANID_15:
        return evolution (this, from:"Dewpider", hp:HP100, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Bubble Net", {
            text "30 damage. Energy can't be attached to the Defending Pokémon from your opponent's hand during their next turn."
            energyCost C, C
            onAttack {
              damage 30
              afterDamage {
                delayed {
                  before ATTACH_ENERGY, defending, {
                    if(ef.reason == PLAY_FROM_HAND) {
                      wcu "Bubble Net: Can't attach energy"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after SWITCH, defending, {unregister()}
                  after EVOLVE, defending, {unregister()}
                }
              }
            }
          }
          move "Sharp Fang", {
            text "80 damage."
            energyCost G, C, C
            onAttack {
              damage 80
            }
          }

        };
      case WIMPOD_16:
        return basic (this, hp:HP070, type:GRASS, retreatCost:3) {
          weakness FIRE
          bwAbility "Wimp Out", {
            text "During your first turn, this Pokémon's Retreat Cost is 0."
            getterA (GET_RETREAT_COST, self) {h->
              if(bg.turnCount <= 2) {
                h.object = 0
              }
            }
          }
          move "Gnaw", {
            text "30 damage."
            energyCost G, C, C
            onAttack {
              damage 30
            }
          }

        };
      case GOLISOPOD_GX_17:
        return evolution (this, from:"Wimpod", hp:HP210, type:GRASS, retreatCost:3) {
          weakness FIRE
          move "First Impression", {
            text "30+ damage. If this Pokémon was on the Bench and became your Active Pokémon this turn, this attack does 90 more damage."
            energyCost G
            onAttack {
              damage 30
              if(wasSwitchedOutThisTurn(self))
                damage 90
            }
          }
          move "Armor Press", {
            text "100 damage. During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
            energyCost G, C, C
            onAttack {
              damage 100
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Crossing Cut GX", {
            text "150 damage. Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost G, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 150
              switchYourActive()
            }
          }

        };
      case CHARMANDER_18:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Scratch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Flame Tail", {
            text "20 damage."
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case CHARMELEON_19:
        return evolution (this, from:"Charmander", hp:HP090, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Claw Slash", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Heat Blast", {
            text "70 damage."
            energyCost R, R, C
            onAttack {
              damage 70
            }
          }

        };
      case CHARIZARD_GX_20:
        return evolution (this, from:"Charmeleon", hp:HP250, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Wing Attack", {
            text "70 damage."
            energyCost C, C, C
            onAttack {
              damage 70
            }
          }
          move "Crimson Storm", {
            text "300 damage. Discard 3 [R] Energy from this Pokémon."
            energyCost R, R, R, C, C
            onAttack {
              damage 300
              afterDamage{
                discardSelfEnergy R,R,R
              }
            }
          }
          move "Raging Out GX", {
            text "Discard the top 10 cards of your opponent's deck. (You can't use more than 1 GX attack in a game.)"
            energyCost R, C, C
            attackRequirement {
              gxCheck()
              assert opp.deck.notEmpty
            }
            onAttack {
              gxPerform()
              opp.deck.subList(0,10).discard()
            }
          }

        };
      case HO_OH_GX_21:
        return basic (this, hp:HP190, type:FIRE, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Sacred Fire", {
            text "This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C, C
            onAttack {
              damage 50, opp.all.select()
            }
          }
          move "Phoenix Burn", {
            text "180 damage. This Pokémon can't use Phoenix Burn during your next turn."
            energyCost R, R, R, C
            onAttack {
              damage 180
              cantUseAttack thisMove, self
            }
          }
          move "Eternal Flame GX", {
            text "Put 3 in any combination of [R] Pokémon-GX or Pokémon-EX from your discard pile to your Bench. (You can't use more than 1 GX attack in a game.)"
            energyCost R, C, C
            attackRequirement {
              gxCheck()
              assert my.bench.notFull : "No room"
              assert my.discard.filterByType(POKEMON_GX, POKEMON_EX).filterByType(_FIRE_) : "No suitable pokemon in discard"
            }
            onAttack {
              gxPerform()
              my.discard.filterByType(POKEMON_GX, POKEMON_EX).filterByType(_FIRE_).select(max: Math.min(3, my.bench.freeBenchCount)).each {
                my.discard.remove(it);
                benchPCS(it);
              }
            }
          }

        };
      case PANSEAR_22:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Flare", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }

        };
      case SIMISEAR_23:
        return evolution (this, from:"Pansear", hp:HP090, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Scratch", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Flare Recharge", {
            text "50 damage. Attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon."
            energyCost R, C
            onAttack {
              damage 50
              afterDamage {
                attachEnergyFrom(type: FIRE, my.discard, my.bench)
              }
            }
          }

        };
      case HEATMOR_24:
        return basic (this, hp:HP110, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Odor Sleuth", {
            text "Flip 2 coins. For each heads, put a card from your discard pile into your hand."
            energyCost C, C
            onAttack {
              flip 2, {if(my.discard) my.discard.select().moveTo(my.hand)}
            }
          }
          move "Searing Flame", {
            text "60 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R, C, C
            onAttack {
              damage 60
              applyAfterDamage BURNED
            }
          }

        };
      case SALAZZLE_GX_25:
        return evolution (this, from:"Salandit", hp:HP200, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Diabolical Claws", {
            text "50× damage. This attack does 50 damage for each Prize card you have taken."
            energyCost R, R
            onAttack {
              damage 50*my.prizeCardSet.takenCount
            }
          }
          move "Heat Blast", {
            text "110 damage."
            energyCost R, R
            onAttack {
              damage 110
            }
          }
          move "Queen's Haze GX", {
            text "Discard all Energy from your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost R, R
            attackRequirement {
              gxCheck()
              assert opp.active.cards.energyCount(C)
            }
            onAttack {
              targeted (defending) {
                opp.active.cards.filterByType(ENERGY).discard()
              }
            }
          }

        };
      case TURTONATOR_26:
        return copy (SunMoonPromos.TURTONATOR_SM27, this)
      case ALOLAN_VULPIX_27:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness METAL
          move "Power Snow", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Asleep."
            onAttack {
              flipThenApplySC ASLEEP
            }
          }
          move "Icy Snow", {
            text "30 damage."
            energyCost W, W
            onAttack {
              damage 30
            }
          }

        };
      case ALOLAN_NINETALES_28:
        return evolution (this, from:"Alolan Vulpix", hp:HP110, type:WATER, retreatCost:1) {
          weakness METAL
          bwAbility "Luminous Barrier", {
            text "Prevent all effects of attacks, including damage, done to this Pokémon by your opponent's Pokémon-GX or Pokémon-EX."
            safeguardForExAndGx("Luminous Barrier", self, delegate)
          }
          move "Aurora Beam", {
            text "80 damage."
            energyCost W, C, C
            onAttack {
              damage 80
            }
          }

        };
      case HORSEA_29:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Arrow", {
            text "This attack does 10 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              damage 10, opp.all.select()
            }
          }

        };
      case SEADRA_30:
        return evolution (this, from:"Horsea", hp:HP080, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Arrow", {
            text "This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              damage 30, opp.all.select()
            }
          }

        };
      case KINGDRA_31:
        return evolution (this, from:"Seadra", hp:HP140, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Brine", {
            text "This attack does 90 damage to 1 of your opponent's Pokémon that has any damage counters on it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {
              assert opp.all.findAll{it.numberOfDamageCounters}
            }
            onAttack {
              damage 90, opp.all.findAll{it.numberOfDamageCounters}.select()
            }
          }
          move "Tornado Shot", {
            text "90 damage. Discard a [W] Energy attached to this Pokémon. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              damage 90
              afterDamage{
                discardSelfEnergy W
              }
              if(opp.bench) damage 30, opp.bench.select()
            }
          }

        };
      case MAGIKARP_32:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Splashing Dodge", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost W
            onAttack {
              damage 10
              flip {preventAllEffectsNextTurn()}
            }
          }

        };
      case GYARADOS_33:
        return evolution (this, from:"Magikarp", hp:HP150, type:WATER, retreatCost:4) {
          weakness LIGHTNING
          move "Venting Anger", {
            text "50× damage. This attack does 50 damage for each Magikarp in your discard pile."
            energyCost C, C
            onAttack {
              damage 50*my.discard.filterByNameEquals("Magikarp").size()
            }
          }
          move "Splash Burn", {
            text "160 damage. This attack does 30 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, C, C
            onAttack {
              damage 160
              my.bench.each {damage 30, it}
            }
          }

        };
      case MARILL_34:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Bubble", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost W
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
          move "Rollout", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case AZUMARILL_35:
        return evolution (this, from:"Marill", hp:HP120, type:WATER, retreatCost:3) {
          weakness GRASS
          bwAbility "Thick Fat", {
            text "This Pokémon takes 30 less damage from the attacks of your opponent's [R] or [W] Pokémon (after applying Weakness and Resistance)."
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
          move "Waterfall", {
            text "80 damage."
            energyCost W, C, C
            onAttack {
              damage 80
            }
          }

        };
      case PANPOUR_36:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Gun", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case SIMIPOUR_37:
        return evolution (this, from:"Panpour", hp:HP090, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Scratch", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Aqua Reflect", {
            text "50 damage. Move a [W] Energy from this Pokémon to 1 of your Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 50
              afterDamage{
                moveEnergy(type: WATER, self, my.bench)
              }
            }
          }

        };
      case BRUXISH_38:
        return basic (this, hp:HP100, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Gnash Teeth", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost W
            onAttack {
              apply CONFUSED
            }
          }
          move "Synchronoise", {
            text "60 damage. This attack does 20 damage to each of your opponent's Benched Pokémon that shares a type with your opponent's Active Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, C, C
            onAttack {
              damage 60
              opp.bench.each {
                if(it.types.containsAny(defending.types))
                  damage 20, it
              }
            }
          }

        };
      case TAPU_FINI_GX_39:
        return basic (this, hp:HP170, type:WATER, retreatCost:1) {
          move "Aqua Ring", {
            text "20 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
            energyCost C
            onAttack {
              damage 20
              switchYourActive(may: true)
            }
          }
          move "Hydro Shot", {
            text "Discard 2 [W] Energy from this Pokémon. This attack does 120 damage to 1 of your opponent's Pokémon. (Don't apply Weakness or Resistance for Benched Pokémon.)"
            energyCost W, W, C
            onAttack {
              discardSelfEnergy W, W
              damage 120, opp.all.select()
            }
          }
          move "Tapu Storm GX", {
            text "Shuffle your opponent's Active Pokémon and all cards attached to it into their deck. If your opponent has no Benched Pokémon, this attack does nothing. (You can't use more than 1 GX attack in a game.)"
            energyCost W
            attackRequirement {
              gxCheck()
              assert opp.bench.notEmpty
            }
            onAttack {
              targeted (defending) {
                gxPerform()
                defending.cards.reverse().moveTo(opp.deck)
                removePCS(defending)
              }
            }
          }

        };
      case PIKACHU_40:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Tail Whap", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Thunder Shock", {
            text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case RAICHU_41:
        return evolution (this, from:"Pikachu", hp:HP110, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          bwAbility "Evoshock", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may leave your opponent's Active Pokémon Paralyzed."
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm('Use Evoshock?')){
                powerUsed()
                apply(PARALYZED, opp.active, SRC_ABILITY)
              }
            }
          }
          move "Volt Tackle", {
            text "130 damage. This Pokémon does 30 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 130
              damage 30, self
            }
          }

        };
      case ELECTABUZZ_42:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Punch", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Thunder Shock", {
            text "40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L, C, C
            onAttack {
              damage 40
              flipThenApplySC PARALYZED
            }
          }

        };
      case ELECTIVIRE_43:
        return evolution (this, from:"Electabuzz", hp:HP140, type:LIGHTNING, retreatCost:4) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Thunder Punch", {
            text "60 damage. Flip a coin. If heads, this attack does 60 more damage. If tails, this Pokémon does 20 damage to itself."
            energyCost L, C, C
            onAttack {
              damage 60
              flip 1, {damage 60}, {damage 20, self}
            }
          }
          move "Giga Impact", {
            text "170 damage. This Pokémon can't attack during your next turn."
            energyCost L, L, C, C
            onAttack {
              damage 170
              cantAttackNextTurn self
            }
          }

        };
      case TYNAMO_44:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Aqua Shock", {
            text "10+ damage. If your opponent's Active Pokémon has any [W] Energy attached to it, this attack does 30 more damage."
            energyCost L
            onAttack {
              damage 10
              if(defending.cards.energyCount(W)) damage 30
            }
          }

        };
      case EELEKTRIK_45:
        return evolution (this, from:"Tynamo", hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Small Appetite", {
            text "50 damage. If your opponent's Active Pokémon's maximum HP is 100 or more, this attack does nothing."
            energyCost L, C
            attackRequirement {
              assert defending.fullHP.value < 90
            }
            onAttack {
              damage 50
            }
          }

        };
      case EELEKTROSS_46:
        return evolution (this, from:"Eelektrik", hp:HP140, type:LIGHTNING, retreatCost:3) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Dark Clamp", {
            text "50 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost L, C
            onAttack {
              damage 50
              cantRetreat defending
            }
          }
          move "Vacuum Bolt", {
            text "80+ damage. You may do 80 more damage. If you do, this attack does 80 damage to 1 of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L, C
            onAttack {
              damage 80
              if(confirm("You may do 80 more damage. If you do, this attack does 80 damage to 1 of your Pokémon.")){
                damage 80
                damage 80, my.all.select("Do 80 damage to")
              }
            }
          }

        };
      case TOGEDEMARU_47:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Rollout", {
            text "20 damage."
            energyCost L
            onAttack {
              damage 20
            }
          }
          move "Electrosmash", {
            text "40 damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost L, C
            onAttack {
              damage 40
              flip {damage 20}
            }
          }

        };
      case SLOWKING_48:
        return evolution (this, from:"Slowpoke", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Drift Ashore", {
            text "Search your deck for a card and put it into your hand. Then, shuffle your deck."
            energyCost P
            attackRequirement {
              assert deck
            }
            onAttack {
              deck.select().moveTo(hidden: true, hand)
              shuffleDeck()
            }
          }
          move "Unarmed", {
            text "110 damage. If you have no cards in your hand, ignore all Energy in this attack's cost."
            energyCost P, P, P
            onAttack {
              damage 110
              // see Attack
            }
          }

        };
      case WOBBUFFET_49:
        return basic (this, hp:HP120, type:PSYCHIC, retreatCost:3) {
          move "Shadowy Knot", {
            text "50× damage. This attack does 50 damage times the number of [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost P, P, P
            onAttack {
              damage 50*defending.retreatCost
            }
          }

        };
      case SEVIPER_50:
        return copy (SunMoonPromos.SEVIPER_SM46, this)
      case DUSKULL_51:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Dark Guidance", {
            text "Put a Basic Pokémon from your discard pile onto your Bench."
            energyCost P
            attackRequirement {
              assert my.discard.filterByType(BASIC)
              assert my.bench.notFull
            }
            onAttack {
              def card = my.discard.filterByType(BASIC).select().first()
              my.discard.remove(card)
              benchPCS(card)
            }
          }
          move "Spooky Shot", {
            text "20 damage."
            energyCost P, C
            onAttack {
              damage 20
            }
          }

        };
      case DUSCLOPS_52:
        return evolution (this, from:"Duskull", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Night Roam", {
            text "Put 1 damage counter on each Pokémon in play (both yours and your opponent's)."
            energyCost P
            onAttack {
              all.each {
                directDamage 10, it
              }
            }
          }
          move "Ambush", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost P, C, C
            onAttack {
              damage 30
              flip{damage 30}
            }
          }

        };
      case DUSKNOIR_53:
        return evolution (this, from:"Dusclops", hp:HP150, type:PSYCHIC, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Dark Invitation", {
            text "Once during your turn (before your attack), you may have your opponent reveal their hand. Put a Basic Pokémon you find there onto your opponent's Bench, and put 3 damage counters on that Pokémon."
            actionA {
              checkLastTurn()
              assert opp.hand && opp.bench.notFull
              powerUsed()
              opp.hand.showToMe("Opponent's hand")
              def list = opp.hand.filterByType(BASIC)
              if(list){
                def card = list.select("Put a Basic Pokémon you find there onto your opponent's Bench").first()
                opp.hand.remove(card)
                def pcs = benchPCS(card, OTHER, TargetPlayer.OPPONENT)
                directDamage(30, pcs, SRC_ABILITY)
              }
            }
          }
          move "Mind Jack", {
            text "30+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon."
            energyCost P, C, C
            onAttack {
              damage 30*opp.all.size()
            }
          }

        };
      case CROAGUNK_54:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Corkscrew Punch", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Frog Hop", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost P, C
            onAttack {
              damage 20
              flip {damage 20}
            }
          }

        };
      case TOXICROAK_55:
        return evolution (this, from:"Croagunk", hp:HP110, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Poison Jab", {
            text "30 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost P, C
            onAttack {
              damage 30
              applyAfterDamage POISONED
            }
          }
          move "Poison Boost", {
            text "80+ damage. If this Pokémon is Poisoned, this attack does 80 more damage. Then, remove that Special Condition from this Pokémon."
            energyCost P, P, C
            onAttack {
              damage 80
              if(self.isSPC(POISONED)) {
                damage 80
                afterDamage {clearSpecialCondition(self, ATTACK, [POISONED])}
              }
            }
          }

        };
      case VENIPEDE_56:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Bug Bite", {
            text "10 damage."
            energyCost P
            onAttack {
              damage 10
            }
          }
          move "Venoshock", {
            text "20+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 40 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(defending.isSPC(POISONED)) damage 40
            }
          }

        };
      case WHIRLIPEDE_57:
        return evolution (this, from:"Venipede", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Spin Turn", {
            text "30 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost P, C
            onAttack {
              damage 30
              switchYourActive()
            }
          }
          move "Rollout", {
            text "60 damage."
            energyCost P, P, C
            onAttack {
              damage 60
            }
          }

        };
      case SCOLIPEDE_58:
        return evolution (this, from:"Whirlipede", hp:HP160, type:PSYCHIC, retreatCost:4) {
          weakness PSYCHIC
          move "Poison Horn", {
            text "80 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost P, P, C
            onAttack {
              damage 80
              applyAfterDamage(POISONED)
            }
          }
          move "Steamroller", {
            text "140 damage. This attack's damage isn't affected by Resistance."
            energyCost P, P, P, C
            onAttack {
              damage 140
              dontApplyResistance()
            }
          }

        };
      case ESPURR_59:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Perplexing Eyes", {
            text "The Defending Pokémon's Weakness is now [P] until the end of your next turn. (The amount of Weakness doesn't change.)"
            energyCost C
            onAttack {
              targeted (defending) {
                delayed {
                  def eff
                  register {
                    eff = getter (GET_WEAKNESSES, defending) {h->
                      def list = h.object as List<Weakness>
                      if(list) {
                        list.get(0).type = PSYCHIC
                      } else {
                        list.add(new Weakness(PSYCHIC))
                      }
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  after SWITCH, defending, {unregister()}
                  after EVOLVE, defending, {unregister()}
                  unregisterAfter 2
                }
              }
            }
          }

        };
      case MEOWSTIC_60:
        return evolution (this, from:"Espurr", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Allure", {
            text "Draw 3 cards."
            energyCost P
            onAttack {
              draw 3
            }
          }
          move "Hand Kinesis", {
            text "10× damage. This attack does 10 damage for each card in your hand."
            energyCost C, C
            onAttack {
              damage 10*my.hand.size()
            }
          }

        };
      case SANDYGAST_61:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:3) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Absorb Life", {
            text "10 damage. Heal 10 damage from this Pokémon."
            energyCost P
            onAttack {
              damage 10
              heal 10, self
            }
          }

        };
      case PALOSSAND_62:
        return evolution (this, from:"Sandygast", hp:HP130, type:PSYCHIC, retreatCost:4) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Sand Tomb", {
            text "80 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost P, C, C
            onAttack {
              damage 80
              cantRetreat defending
            }
          }
          move "Dust Storm", {
            text "100 damage. Discard all cards from both Active Pokémon."
            energyCost C, C, C, C
            onAttack {
              damage 100
              afterDamage{
                discardAllSelfEnergy(null)
                targeted (defending) {
                  defending.cards.filterByType(ENERGY).discard()
                }
              }
            }
          }

        };
      case NECROZMA_GX_63:
        return basic (this, hp:HP180, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          bwAbility "Light's End", {
            text "Prevent all damage done to this Pokémon by attacks from [C] Pokémon."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.from.types.contains(C) && it.dmg.value && it.notNoEffect) {
                    bc "Light's End prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Prismatic Burst", {
            text "10+ damage. Discard all [P] Energy from this Pokémon. This attack does 60 more damage for each card you discarded in this way."
            energyCost C, C, C
            onAttack {
              damage 10
              damage 60*discardAllSelfEnergy(P).size()
            }
          }
          move "Black Ray GX", {
            text "This attack does 100 damage to each of your opponent's Pokémon-GX and Pokémon-EX. This damage isn't affected by Weakness or Resistance. (You can't use more than 1 GX attack in a game.)"
            energyCost C, C, C
            attackRequirement {
              gxCheck()
              assert opp.all.findAll {it.pokemonGX || it.pokemonEX} : "No opponent Pokemon-GX or Pokemon-EX in play"
            }
            onAttack {
              gxPerform()
              opp.all.each {
                if(it.pokemonEX || it.pokemonGX) noWrDamage(100, it)
              }
            }
          }

        };
      case MACHAMP_GX_64:
        return evolution (this, from:"Machoke", hp:HP250, type:FIGHTING, retreatCost:3) {
          weakness PSYCHIC
          move "Cross-Cut", {
            text "60+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 60 more damage."
            energyCost F, F
            onAttack {
              damage 60
              if(defending.realEvolution) damage 60
            }
          }
          move "Bedrock Breaker", {
            text "130 damage. Discard any Stadium card in play."
            energyCost F, F, F
            onAttack {
              damage 130
              if(bg.stadiumInfoStruct) afterDamage {discard(bg.stadiumInfoStruct.stadiumCard)}
            }
          }
          move "Muscle Punch GX", {
            text "180 damage. This attack's damage isn't affected by Resistance. (You can't use more than 1 GX attack in a game.)"
            energyCost F, F, F
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 180
              dontApplyResistance()
            }
          }

        };
      case RHYHORN_65:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Lunge Out", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Horn Drill", {
            text "60 damage."
            energyCost F, F, C
            onAttack {
              damage 60
            }
          }

        };
      case RHYDON_66:
        return evolution (this, from:"Rhyhorn", hp:HP110, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          move "Rock Tumble", {
            text "80 damage. This attack's damage isn't affected by Resistance."
            energyCost F, F, C
            onAttack {
              damage 80
              dontApplyResistance()
            }
          }
          move "Megahorn", {
            text "120 damage. Flip a coin. If tails, this attack does nothing."
            energyCost F, F, F, C
            onAttack {
              flip {damage 120}
            }
          }

        };
      case RHYPERIOR_67:
        return evolution (this, from:"Rhydon", hp:HP160, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          bwAbility "Toppling Wind", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may discard the top 3 cards of your opponent's deck."
            onActivate {reason->
              if(reason==PLAY_FROM_HAND && opp.deck && confirm("Use Toppling Wind?")){
                powerUsed()
                opp.deck.subList(0, 3).discard()
              }
            }
          }
          move "Rock Wrecker", {
            text "170 damage. This attack's damage isn't affected by Weakness or Resistance. This Pokémon can't attack during your next turn."
            energyCost F, F, C, C
            onAttack {
              noWrDamage(170, defending)
              cantAttackNextTurn self
            }
          }

        };
      case LUNATONE_68:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          bwAbility "Heal Block", {
            text "If you have Solrock in play, Pokémon (both yours and your opponent's) can't be healed."
            delayedA {
              before REMOVE_DAMAGE_COUNTER, {
                if(self.owner.pbg.all.findAll {it.name=="Solrock"}) {
                  bc "Heal Blocks prevents heal"
                  prevent()
                }
              }
            }
          }
          move "Lunar Blast", {
            text "30 damage."
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case SOLROCK_69:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Double Draw", {
            text "Draw 2 cards."
            energyCost C
            onAttack {
              draw 2
            }
          }
          move "Solar Heat", {
            text "20 damage. If there is any Stadium card in play, this attack does 20 more damage."
            energyCost F
            onAttack {
              damage 20
              if(bg.stadiumInfoStruct) damage 20
            }
          }

        };
      case RIOLU_70:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Punch", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
          move "Low Kick", {
            text "30 damage."
            energyCost F, F
            onAttack {
              damage 30
            }
          }

        };
      case LUCARIO_71:
        return evolution (this, from:"Riolu", hp:HP120, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Stance", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all effects of your opponent's attacks, including damage, done to this Pokémon until the end of your opponent's next turn."
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm("Use Stance?")){
                powerUsed()
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect){
                        bc "Stance prevents all damage"
                        it.dmg=hp(0)
                      }
                    }
                  }
                  before null, self, Source.ATTACK, {
                    if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                      bc "Stance prevents effects"
                      prevent()
                    }
                  }
                  after ENERGY_SWITCH, {
                    def efs = (ef as EnergySwitch)
                    if(efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                      discard efs.card
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
          move "Submarine Blow", {
            text "120 damage."
            energyCost F, F, F
            onAttack {
              damage 120
            }
          }

        };
      case SAWK_72:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Quick Guard", {
            text "Prevent all damage done to this Pokémon by attacks from Basic Pokémon during your opponent's next turn. This Pokémon can't use Quick Guard during your next turn."
            energyCost F
            onAttack {
              preventAllDamageFromCustomPokemonNextTurn(thisMove, self, {it.basic})
              cantUseAttack(thisMove, self)
            }
          }
          move "Brick Break", {
            text "40 damage. This attack's damage isn't affected by Resistance or any other effects on your opponent's Active Pokémon."
            energyCost F, C
            onAttack {
              noResistanceOrAnyEffectDamage(40, defending)
            }
          }

        };
      case CRABRAWLER_73:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Light Punch", {
            text "40 damage."
            energyCost F, F
            onAttack {
              damage 40
            }
          }

        };
      case CRABOMINABLE_74:
        return copy (SunMoonPromos.CRABOMINABLE_SM47, this)
      case LYCANROC_75:
        return evolution (this, from:"Rockruff", hp:HP110, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Dangerous Claws", {
            text "30+ damage. If your opponent's Active Pokémon is a Basic Pokémon, this attack does 30 more damage."
            energyCost F
            onAttack {
              damage 30
              if(defending.basic) damage 30
            }
          }
          move "Corner", {
            text "90 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost F, C, C
            onAttack {
              damage 90
              cantRetreat defending
            }
          }

        };
      case LYCANROC_76:
        return evolution (this, from:"Rockruff", hp:HP110, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Rock Throw", {
            text "30 damage."
            energyCost F, C
            onAttack {
              damage 30
            }
          }
          move "Accelerock", {
            text "100 damage."
            energyCost F, F, C
            onAttack {
              damage 100
            }
          }

        };
      case MUDBRAY_77:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip {damage 20}
            }
          }

        };
      case MUDSDALE_78:
        return evolution (this, from:"Mudbray", hp:HP130, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Kick Away", {
            text "60 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 60
              whirlwind()
            }
          }
          move "Vigorous Dash", {
            text "130 damage. This Pokémon does 30 damage to itself. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C, C
            onAttack {
              damage 130
              damage 30,self
              if(opp.bench) damage 30,opp.bench.select()
            }
          }

        };
      case PASSIMIAN_79:
        return basic (this, hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Punch", {
            text "30 damage."
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Intentional Grounding", {
            text "90 damage. Discard a Pokémon Tool card from your hand. If you don't, this attack does nothing."
            energyCost F, F
            attackRequirement {
              assert my.hand.filterByType(POKEMON_TOOL) : "No pokemon tool in hand"
            }
            onAttack {
              my.hand.filterByType(POKEMON_TOOL).select().discard()
              damage 90
            }
          }

        };
      case MARSHADOW_GX_80:
        return basic (this, hp:HP150, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Shadow Hunt", {
            text "This Pokémon can use the attacks of Basic Pokémon in your discard pile. (You still need the necessary Energy to use each attack.)"
            getterA (GET_MOVE_LIST, self) {holder->
              self.owner.pbg.discard.each {
                if(it.cardTypes.is(BASIC)) {
                  holder.object.addAll(it.moves)
                }
              }
            }
          }
          move "Beatdown", {
            text "120 damage."
            energyCost F, F, C
            onAttack {
              damage 120
            }
          }
          move "Peerless Hundred Blows GX", {
            text "50× damage. This attack does 50 damage times the number of basic Energy attached to this Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost F
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 50*self.cards.filterByType(BASIC_ENERGY).size()
            }
          }

        };
      case ALOLAN_RATTATA_81:
        return basic (this, hp:HP040, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Focus Energy", {
            text "During your next turn, this Pokémon's Bite attack's base damage is 60."
            onAttack {
              increasedBaseDamageNextTurn("Bite", hp(50))
            }
          }
          move "Bite", {
            text "10 damage."
            energyCost D
            onAttack {
              damage 10
            }
          }

        };
      case ALOLAN_RATICATE_82:
        return evolution (this, from:"Alolan Rattata", hp:HP120, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Enhanced Fang", {
            text "10+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 50 more damage."
            onAttack {
              damage 10
              if(self.cards.filterByType(POKEMON_TOOL)) damage 50
            }
          }
          move "Hyper Fang", {
            text "60 damage. Flip a coin. If tails, this attack does nothing."
            energyCost D
            onAttack {
              flip {damage 60}
            }
          }

        };
      case ALOLAN_GRIMER_83:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Division", {
            text "Search your deck for Alolan Grimer and put it onto your Bench. Then, shuffle your deck."
            attackRequirement {
              assert bench.notFull
              assert deck
            }
            onAttack {
              deck.search ("Alolan Grimer", {it.name=="Alolan Grimer"}).each {
                deck.remove(it)
                def pcs = benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Slippery Sludge", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost C, C
            onAttack {
              apply CONFUSED
            }
          }

        };
      case ALOLAN_MUK_GX_84:
        return evolution (this, from:"Alolan Grimer", hp:HP220, type:DARKNESS, retreatCost:4) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Chemical Breath", {
            text "10+ damage. This attack does 70 more damage for each Special Condition affecting your opponent's Active Pokémon."
            energyCost D, C, C
            onAttack {
              damage 10+70*defending.specialConditions.size()
            }
          }
          move "Crunch", {
            text "120 damage. Discard an Energy attached to your opponent's Active Pokémon."
            energyCost D, D, C, C
            onAttack {
              damage 120
              discardDefendingEnergy()
            }
          }
          move "Tri Hazard GX", {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Burned, Paralyzed, and Poisoned. (You can't use more than 1 GX attack in a game.)"
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              if (opp.bench){
                def target = opp.bench.select("Select the new Active Pokémon.")
                if ( swFromBench (defending, target) ) {
                  apply POISONED, target
                  apply BURNED, target
                  apply PARALYZED, target
                }
              }
            }
          }

        };
      case SNEASEL_85:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Hone Claws", {
            text "During your next turn, this Pokémon's Slash attack's base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Slash", hp(60))
            }
          }
          move "Slash", {
            text "20 damage."
            energyCost D, C
            onAttack {
              damage 20
            }
          }

        };
      case WEAVILE_86:
        return evolution (this, from:"Sneasel", hp:HP090, type:DARKNESS, retreatCost:0) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Rule of Evil", {
            text "This attack does 60 damage to each Pokémon that has an Ability (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            onAttack {
              all.each {if(it.hasModernAbility()) damage 60,it}
            }
          }
          move "Slash", {
            text "70 damage."
            energyCost D, C
            onAttack {
              damage 70
            }
          }

        };
      case DARKRAI_87:
        return basic (this, hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Hypnoblast", {
            text "30 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost D, C
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }
          move "Dark Raid", {
            text "80+ damage. If your opponent has already used their GX Attack, this attack does 80 more damage."
            energyCost D, C, C
            onAttack {
              damage 80
              if(bg.em().retrieveObject("gx_"+opp.owner)) damage 80
            }
          }

        };
      case DARKRAI_GX_88:
        return basic (this, hp:HP180, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          globalAbility {Card thisCard->
            def lastTurn=0
            action("$thisCard: Restoration", [TargetPlayer.fromPlayerType(thisCard.player)]) {
              def text="Once during your turn (before your attack), if this Pokémon is in your discard pile, you may put it onto your Bench. Then, attach a [D] Energy card from your discard pile to this Pokémon."
              assert thisCard.player.pbg.discard.contains(thisCard) : "Not in discard"
              assert thisCard.player.pbg.bench.notFull : "Bench full"
              assert bg.turnCount!=lastTurn : "Already used"
              assert checkGlobalAbility(thisCard) : "Blocked"
              bc "$thisCard used Restoration"
              my.discard.remove(thisCard)
              def pcs = benchPCS(thisCard)
              attachEnergyFrom(type: D, my.discard, pcs)
            }
          }
          bwAbility "Restoration", {
            text "Once during your turn (before your attack), if this Pokémon is in your discard pile, you may put it onto your Bench. Then, attach a [D] Energy card from your discard pile to this Pokémon."
          }
          move "Dark Cleave", {
            text "130 damage. This attack's damage isn't affected by Resistance."
            energyCost D, D, C
            onAttack {
              damage 130
              dontApplyResistance()
            }
          }
          move "Dead End GX", {
            text "If your opponent's Active Pokémon is affected by a Special Condition, that Pokémon is Knocked Out. (You can't use more than 1 GX attack in a game.)"
            energyCost D, D, C
            attackRequirement {
              gxCheck()
              assert defending.specialConditions : "No special conditions"
            }
            onAttack {
              gxPerform()
              targeted (defending) {
                new Knockout(defending).run(bg)
              }
            }
          }

        };
      case INKAY_89:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Constrict", {
            text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost D
            onAttack {
              flipThenApplySC PARALYZED
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case MALAMAR_90:
        return evolution (this, from:"Inkay", hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Psybeam", {
            text "20 damage. Your opponent's Active Pokémon is now Confused."
            energyCost D
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Energy Slosh", {
            text "70 damage. You may move all Energy attached to this Pokémon to 1 of your Benched Pokémon."
            energyCost D, C, C
            onAttack {
              damage 70
              afterDamage {
                if(my.bench.notEmpty && confirm("You may move all Energy attached to this Pokémon to 1 of your Benched Pokémon.")) {
                  def pcs = my.bench.select()
                  self.cards.filterByType(ENERGY).each {energySwitch(self,pcs,it)}
                }
              }
            }
          }

        };
      case RALTS_91:
        return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Draining Kiss", {
            text "10 damage. Heal 10 damage from this Pokémon."
            energyCost Y
            onAttack {
              damage 10
              afterDamage {heal 10, self}
            }
          }

        };
      case KIRLIA_92:
        return evolution (this, from:"Ralts", hp:HP080, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Smack", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Magical Shot", {
            text "30 damage."
            energyCost Y, C
            onAttack {
              damage 30
            }
          }

        };
      case GARDEVOIR_GX_93:
        return evolution (this, from:"Kirlia", hp:HP230, type:FAIRY, retreatCost:2) {
          weakness METAL
          resistance DARKNESS, MINUS20
          bwAbility "Secret Spring", {
            text "Once during your turn (before your attack), you may attach a [Y] Energy card from your hand to 1 of your Pokémon."
            actionA {
              assert hand.filterByType(BASIC_ENERGY).filterByEnergyType(Y)
              checkLastTurn()
              powerUsed()
              attachEnergyFrom(type: Y, hand, my.all)
            }
          }
          move "Infinite Force", {
            text "30× damage. This attack does 30 damage times the amount of Energy attached to both Active Pokémon."
            energyCost Y
            onAttack {
              damage 30*(self.cards.energyCount(C)+defending.cards.energyCount(C))
            }
          }
          move "Twilight GX", {
            text "Shuffle 10 cards from your discard pile into your deck. (You can't use more than 1 GX attack in a game.)"
            energyCost Y
            attackRequirement {
              gxCheck()
              assert my.discard.notEmpty
            }
            onAttack {
              gxPerform()
              my.discard.select(count: 10).moveTo(my.deck)
              shuffleDeck()
            }
          }

        };
      case DIANCIE_94:
        return basic (this, hp:HP090, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Sparkling Wish", {
            text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck."
            energyCost Y
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def names=my.all.collect{it.name}
              def sel=deck.search ("Evolves from $names", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)})
              if(sel){
                def opts=my.all.findAll({it.name==sel.first().predecessor})
                def pcs=opts.select("Evolve which one?")
                evolve(pcs, sel.first(), OTHER)
              }
              shuffleDeck()
            }
          }
          move "Diamond Storm", {
            text "30 damage. Heal 30 damage from each of your [Y] Pokémon."
            energyCost Y, C
            onAttack {
              damage 30
              afterDamage {
                my.all.findAll {it.types.contains(Y) && it.numberOfDamageCounters}.each {heal 30, it}
              }
            }
          }

        };
      case CUTIEFLY_95:
        return basic (this, hp:HP030, type:FAIRY, retreatCost:0) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Fairy Wind", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case RIBOMBEE_96:
        return evolution (this, from:"Cutiefly", hp:HP070, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          bwAbility "Honey Gather", {
            text "Once during your turn (before your attack), you may search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            actionA {
              checkLastTurn()
              assert deck
              powerUsed()
              deck.search(max: 2, cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
              shuffleDeck()
            }
          }
          move "Pollen Ball", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }

        };
      case MORELULL_97:
        return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case SHIINOTIC_98:
        return evolution (this, from:"Morelull", hp:HP100, type:FAIRY, retreatCost:2) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Strength Sap", {
            text "30 damage. Heal from this Pokémon 30 damage times the amount of Energy attached to your opponent's Active Pokémon."
            energyCost Y, C
            onAttack {
              damage 30
              afterDamage {heal 30*defending.cards.energyCount(C), self}
            }
          }
          move "Sleep Pulse", {
            text "60 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost Y, C, C
            onAttack {
              damage 60
              applyAfterDamage ASLEEP
            }
          }

        };
      case NOIVERN_GX_99:
        return evolution (this, from:"Noibat", hp:HP200, type:DRAGON, retreatCost:0) {
          weakness FAIRY
          move "Distort", {
            text "50 damage. Your opponent can't play any Item cards from their hand during their next turn."
            energyCost D, C
            onAttack {
              damage 50
              delayed {
                before PLAY_TRAINER, {
                  if (ef.cardToPlay.cardTypes.is(ITEM) && bg.currentTurn == self.owner.opposite) {
                    wcu "Distort prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Sonic Volume", {
            text "120 damage. Your opponent can't play any Special Energy cards from their hand during their next turn."
            energyCost P, D, C
            onAttack {
              damage 120
              delayed {
                before PLAY_ENERGY, {
                  if (ef.cardToPlay.cardTypes.is(SPECIAL_ENERGY) && bg.currentTurn == self.owner.opposite) {
                    wcu "Sonic Volume prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Boomburst GX", {
            text "This attack does 50 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
            energyCost P, D, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              opp.all.each {damage 50, it}
            }
          }

        };
      case ZYGARDE_100:
        return copy (SunMoonPromos.ZYGARDE_SM48, this)
      case MEOWTH_101:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Fake Out", {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }

        };
      case PERSIAN_102:
        return evolution (this, from:"Meowth", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Screech", {
            text "During your next turn, the Defending Pokémon takes 60 more damage from attacks (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              increasedDamageDoneToDefending(self, defending, 60, thisMove.name)
            }
          }
          move "Slash", {
            text "40 damage."
            energyCost C
            onAttack {
              damage 40
            }
          }

        };
      case PORYGON_103:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Code Check", {
            text "Look at 1 of your opponent's face-down Prize cards."
            energyCost C
            onAttack {
              opp.prizeCardSet.select(hidden: true, "Prize to look at").showToMe("Selected prize")
            }
          }
          move "Beam", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case PORYGON2_104:
        return evolution (this, from:"Porygon", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Calculate", {
            text "Look at the top 6 cards of your deck and put them back in any order."
            energyCost C
            attackRequirement {
              assert deck
            }
            onAttack {
              def list=rearrange(deck.subList(0,6), "Rearrange top 6 cards in your deck")
              deck.setSubList(0, list)
            }
          }
          move "Beam", {
            text "40 damage."
            energyCost C, C, C
            onAttack {
              damage 40
            }
          }

        };
      case PORYGON_Z_105:
        return evolution (this, from:"Porygon2", hp:HP130, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Initialize", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may devolve each of your opponent's evolved Pokémon by putting the highest Stage Evolution card on it into your opponent's hand."
            onActivate {r->
              if(r==PLAY_FROM_HAND) {
                if(confirm("Use Initialize?")) {
                  powerUsed()
                  opp.all.each {
                    def pcs = it
                    if(pcs.evolution) {
                      targeted (pcs, SRC_ABILITY) {
                        def top=pcs.topPokemonCard
                        bc "$top Devolved"
                        moveCard(top, opp.hand)
                        devolve(pcs, top)
                      }
                    }
                  }
                }
              }
            }
          }
          move "Zap Cannon", {
            text "80 damage."
            energyCost C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case HOOTHOOT_106:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "See Through", {
            text "Your opponent reveals their hand."
            energyCost C
            onAttack {
              opp.hand.showToMe("Opponent's hand")
              opp.hand.shuffle()
            }
          }
          move "Peck", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case NOCTOWL_107:
        return evolution (this, from:"Hoothoot", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Hypnoblast", {
            text "30 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost C
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }
          move "Night Raid", {
            text "70 damage. Your opponent reveals their hand. Discard a Pokémon from it."
            energyCost C, C, C
            onAttack {
              damage 70
              afterDamage {
                if(opp.hand) {
                  opp.hand.showToMe("Opponent's hand")
                  def list = opp.hand.filterByType(POKEMON)
                  if(list) {
                    list.select("Discard").discard()
                  }
                }
              }
            }
          }

        };
      case BOUFFALANT_108:
        return basic (this, hp:HP120, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Bouffant Head", {
            text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost C, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }
          move "Knock Over", {
            text "80 damage. You may discard any Stadium card in play."
            energyCost C, C, C
            onAttack {
              damage 80
              afterDamage {
                if(bg.stadiumInfoStruct && confirm("You may discard any Stadium card in play.")){
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }

        };
      case NOIBAT_109:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Agility", {
            text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost C
            onAttack {
              damage 10
              flip {preventAllEffectsNextTurn()}
            }
          }

        };
      case STUFFUL_110:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Baby-Doll Eyes", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C
            onAttack {
              cantRetreat(defending)
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case BEWEAR_111:
        return copy (SunMoonPromos.BEWEAR_SM49, this)
      case ACEROLA_112:
        return supporter (this) {
          text "Put 1 of your Pokémon that has any damage counters on it and all cards attached to it into your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def pcs = my.all.findAll {it.numberOfDamageCounters}.select()
            targeted (pcs, TRAINER_CARD) {
              pcs.cards.moveTo(hand)
              removePCS(pcs)
            }
          }
          playRequirement{
            assert my.all.findAll {it.numberOfDamageCounters} : "No damaged pokemon in play"
          }
        };
      case BODYBUILDING_DUMBBELLS_113:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe Stage 1 Pokémon this card is attached to gets +40 HP.\nYou may play as many Item cards as you like during your turn (before your attack)."
          def eff
          onPlay {reason->
            eff = getter (GET_FULL_HP, self) {h->
              if (self.topPokemonCard.cardTypes.is(STAGE1)) {
                h.object += hp(40)
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case ESCAPE_ROPE_114:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case GUZMA_115:
        return supporter (this) {
          text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. If you do, switch your Active Pokémon with 1 of your Benched Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def target = opp.bench.select("Select the new Active Pokémon.")
            if ( swFromBench (opp.active, target, TRAINER_CARD) && my.bench) {
              sw my.active, my.bench.select("Select your new Active Pokémon."), TRAINER_CARD
            }
          }
          playRequirement{
            assert opp.bench.notEmpty
          }
        };
      case KIAWE_116:
        return supporter (this) {
          text "Search your deck for up to 4 [R] Energy cards and attach them to 1 of your Pokémon. Then, shuffle your deck. Your turn ends.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def list = my.deck.search (max: 4, basicEnergyFilter(R))
            def pcs = my.all.select("To?")
            list.each {attachEnergy(pcs, it)}
            shuffleDeck()
            bg.gm().betweenTurns()
          }
          playRequirement{
            assert my.deck
          }
        };
      case LANA_117:
        return supporter (this) {
          text "Heal 50 damage from each of your Pokémon that has any [W] Energy attached to it.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.all.findAll {it.numberOfDamageCounters && it.cards.energyCount(W)}.each {heal(50, it, TRAINER_CARD)}
          }
          playRequirement{
            assert my.all.findAll {it.numberOfDamageCounters && it.cards.energyCount(W)}
          }
        };
      case MOUNT_LANAKILA_118:
        return stadium (this) {
          text "The Retreat Cost of each Basic Pokémon in play (both yours and your opponent's) is [C] more.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = getter (GET_RETREAT_COST) {
              if (it.effect.target.basic) {
                it.object += 1
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case OLIVIA_119:
        return supporter (this) {
          text "Search your deck for up to 2 Pokémon-GX, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.deck.search (max: 2, cardTypeFilter(POKEMON_GX)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case PLUMERIA_120:
        return supporter (this) {
          text "Discard 2 cards from your hand. If you do, discard an Energy attached to 1 of your opponent's Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).select(count: 2, "Discard").discard()
            def tar = opp.all.findAll {it.cards.energyCount(C)}
            if(tar) {
              def pcs = tar.select("Discard energy from")
              targeted (pcs, TRAINER_CARD) {
                pcs.cards.filterByType(ENERGY).select("Discard").discard()
              }
            }
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard).size() >= 2 : "You can't play $thisCard if you can't discard 2 cards from your hand"
            assert opp.all.any{it.cards.energyCount(C)} : "You can't play $thisCard if your Opponent has no Energy attached to any of their Pokémon"
          }
        };
      case PO_TOWN_121:
        return stadium (this) {
          text "Whenever any player plays a Pokémon from their hand to evolve 1 of their Pokémon, put 3 damage counters on that Pokémon.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = delayed {
              boolean flag = false
              before EVOLVE, {
                flag = (ef.evolutionCard as Card).player.pbg.hand.contains(ef.evolutionCard)
              }
              after EVOLVE, { if(flag) {
                bc "PO Town"
                directDamage(30, ef.pokemonToBeEvolved, TRAINER_CARD)
              } }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case ROTOM_DEX_POKE_FINDER_MODE_122:
        return itemCard (this) {
          text "Look at the top 4 cards of your deck and put them back in any order or shuffle them into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def list = rearrange(deck.subList(0,4), "Rearrange top 4 cards in your deck")
            deck.setSubList(0, list)
            if(confirm("Shuffle Deck?")){
              shuffleDeck()
            }
          }
          playRequirement{
            assert deck
          }
        };
      case SOPHOCLES_123:
        return supporter (this) {
          text "Discard 2 cards from your hand. If you do, draw 4 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).select(count: 2, "Discard").discard()
            draw 4
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard).size() >= 2 : "You cannot play $thisCard if you can't discard 2 cards from your hand"
            assert my.deck : "You can't play $thisCard if you don't have cards in deck."
          }
        };
      case SUPER_SCOOP_UP_124:
        return copy (BlackWhite.SUPER_SCOOP_UP_103, this)
      case TORMENTING_SPRAY_125:
        return itemCard (this) {
          text "Choose a random card from your opponent's hand. Your opponent reveals that card. If it's a Supporter card, discard it.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            opp.hand.select(hidden: true, "Select random card from opponent's hand").showToMe("Selected card").showToOpponent("Opponent used Tormenting Spray").each {if(it.cardTypes.is(SUPPORTER)) discard(it)}
          }
          playRequirement{
            assert opp.hand
          }
        };
      case WEAKNESS_POLICY_126:
        return copy (PrimalClash.WEAKNESS_POLICY_142, this)
      case WICKE_127:
        return supporter (this) {
          text "Each player counts the cards in their hand, shuffles those cards into their deck, then draws that many cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            int c1 = my.hand.getExcludedList(thisCard).size()
            my.hand.getExcludedList(thisCard).moveTo(my.deck)
            shuffleDeck()
            draw c1
            int c2 = opp.hand.size()
            opp.hand.moveTo(opp.deck)
            shuffleDeck(null, TargetPlayer.OPPONENT)
            draw c2, TargetPlayer.OPPONENT
          }
          playRequirement{
          }
        };
      case WISHFUL_BATON_128:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf the Pokémon this card is attached to is your Active Pokémon and is Knocked Out by damage from an opponent's attack, move up to 3 basic Energy cards from that Pokémon to 1 of your Benched Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
          def eff
          onPlay {reason->
            eff = delayed {
              before (KNOCKOUT,self) {
                if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.bench.notEmpty && self.cards.filterByType(ENERGY)) {
                  bc "Wishful Baton activates"
                  moveEnergy(basic: true, playerType: self.owner, may: true, count: 3, info: "Wishful Baton", self, self.owner.pbg.bench)
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case GOLISOPOD_GX_129:
        return copy (GOLISOPOD_GX_17, this)
      case TAPU_BULU_GX_130:
        return basic (this, hp:HP180, type:GRASS, retreatCost:3) {
          move "Horn Attack", {
            text "30 damage."
            energyCost G
            onAttack {
              damage 30
            }
          }
          move "Nature’s Judgment", {
            text "120+ damage. You may discard all Energy from this Pokémon. If you do, this attack does 60 more damage."
            energyCost G, G, C
            onAttack {
              damage 120
              if(confirm ("You may discard all Energy from this Pokémon. If you do, this attack does 60 more damage.")){
                discardAllSelfEnergy null
                damage 60
              }
            }
          }
          move "Tapu Wilderness GX", {
            text "150 damage. Heal all damage from this Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost G, G, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 150
              healAfterDamage self.damage.value, self
            }
          }

        };
      case HO_OH_GX_131:
        return copy (SunMoonPromos.HO_OH_GX_SM57, this)
      case SALAZZLE_GX_132:
        return copy (SALAZZLE_GX_25, this)
      case TAPU_FINI_GX_133:
        return copy (TAPU_FINI_GX_39, this)
      case NECROZMA_GX_134:
        return copy (NECROZMA_GX_63, this)
      case MACHAMP_GX_135:
        return copy (MACHAMP_GX_64, this)
      case LYCANROC_GX_136:
        return evolution (this, from:"Rockruff", hp:HP200, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Crunch", {
            text "30 damage. Discard an Energy from your opponent's Active Pokémon."
            energyCost F, C
            onAttack {
              damage 30
              afterDamage{discardDefendingEnergy()}
            }
          }
          move "Accelerock", {
            text "120 damage."
            energyCost F, F, C
            onAttack {
              damage 120
            }
          }
          move "Lycanfang GX", {
            text "200 damage. Discard 2 Energy from this Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost F, F, C
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              damage 200
              afterDamage{
                discardSelfEnergy(C,C)
              }
            }
          }

        };

      case MARSHADOW_GX_137:
        return copy (MARSHADOW_GX_80, this)
      case ALOLAN_MUK_GX_138:
        return copy (ALOLAN_MUK_GX_84, this)
      case DARKRAI_GX_139:
        return copy (DARKRAI_GX_88, this)
      case GARDEVOIR_GX_140:
        return copy (GARDEVOIR_GX_93, this)
      case NOIVERN_GX_141:
        return copy (NOIVERN_GX_99, this)
      case ACEROLA_142:
        return copy (ACEROLA_112, this)
      case GUZMA_143:
        return copy (GUZMA_115, this)
      case KIAWE_144:
        return copy (KIAWE_116, this)
      case PLUMERIA_145:
        return copy (PLUMERIA_120, this)
      case SOPHOCLES_146:
        return copy (SOPHOCLES_123, this)
      case WICKE_147:
        return copy (WICKE_127, this)
      case GOLISOPOD_GX_148:
        return copy (GOLISOPOD_GX_17, this)
      case TAPU_BULU_GX_149:
        return copy (TAPU_BULU_GX_130, this)
      case CHARIZARD_GX_150:
        return copy (CHARIZARD_GX_20, this);
      case SALAZZLE_GX_151:
        return copy (SALAZZLE_GX_25, this);
      case TAPU_FINI_GX_152:
        return copy (TAPU_FINI_GX_39, this)
      case NECROZMA_GX_153:
        return copy (NECROZMA_GX_63, this)
      case MACHAMP_GX_154:
        return copy (MACHAMP_GX_64, this)
      case LYCANROC_GX_155:
        return copy (LYCANROC_GX_136, this)
      case MARSHADOW_GX_156:
        return copy (MARSHADOW_GX_80, this)
      case ALOLAN_MUK_GX_157:
        return copy (ALOLAN_MUK_GX_84, this)
      case DARKRAI_GX_158:
        return copy (DARKRAI_GX_88, this)
      case GARDEVOIR_GX_159:
        return copy (GARDEVOIR_GX_93, this)
      case NOIVERN_GX_160:
        return copy (NOIVERN_GX_99, this)
      case BODYBUILDING_DUMBBELLS_161:
        return copy (BODYBUILDING_DUMBBELLS_113, this)
      case CHOICE_BAND_162:
        return copy(GuardiansRising.CHOICE_BAND_121, this)
      case ESCAPE_ROPE_163:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this)
      case MULTI_SWITCH_164:
        return copy(GuardiansRising.MULTI_SWITCH_129, this)
      case RESCUE_STRETCHER_165:
        return copy(GuardiansRising.RESCUE_STRETCHER_130, this)
      case SUPER_SCOOP_UP_166:
        return copy (SUPER_SCOOP_UP_124, this)
      case FIRE_ENERGY_167:
        return basicEnergy (this, FIRE);
      case DARKNESS_ENERGY_168:
        return basicEnergy (this, DARKNESS);
      case FAIRY_ENERGY_169:
        return basicEnergy (this, FAIRY);
      default:
        return null;
    }
  }

}
