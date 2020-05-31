package tcgwars.logic.impl.gen7

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.impl.gen5.DarkExplorers
import tcgwars.logic.impl.gen5.EmergingPowers
import tcgwars.logic.impl.gen6.PhantomForces
import tcgwars.logic.impl.gen6.Xy;

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
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum GuardiansRising implements LogicCardInfo {

  BELLSPROUT_1 ("Bellsprout", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WEEPINBELL_2 ("Weepinbell", 2, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL_3 ("Victreebel", 3, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  PETILIL_4 ("Petilil", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LILLIGANT_5 ("Lilligant", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PHANTUMP_6 ("Phantump", 6, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TREVENANT_7 ("Trevenant", 7, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WIMPOD_8 ("Wimpod", 8, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOLISOPOD_9 ("Golisopod", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTINI_10 ("Victini", 10, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  LITWICK_11 ("Litwick", 11, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  LAMPENT_12 ("Lampent", 12, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHANDELURE_13 ("Chandelure", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  ORICORIO_14 ("Oricorio", 14, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  SALANDIT_15 ("Salandit", 15, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SALAZZLE_16 ("Salazzle", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  TURTONATOR_17 ("Turtonator", 17, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  TURTONATOR_GX_18 ("Turtonator-GX", 18, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  ALOLAN_SANDSHREW_19 ("Alolan Sandshrew", 19, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ALOLAN_SANDSLASH_20 ("Alolan Sandslash", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ALOLAN_VULPIX_21 ("Alolan Vulpix", 21, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ALOLAN_NINETALES_GX_22 ("Alolan Ninetales-GX", 22, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  TENTACOOL_23 ("Tentacool", 23, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TENTACRUEL_24 ("Tentacruel", 24, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  POLITOED_25 ("Politoed", 25, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  DELIBIRD_26 ("Delibird", 26, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CARVANHA_27 ("Carvanha", 27, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHARPEDO_28 ("Sharpedo", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WAILMER_29 ("Wailmer", 29, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  WAILORD_30 ("Wailord", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SNORUNT_31 ("Snorunt", 31, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GLALIE_32 ("Glalie", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VANILLITE_33 ("Vanillite", 33, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VANILLISH_34 ("Vanillish", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VANILLUXE_35 ("Vanilluxe", 35, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  ALOMOMOLA_36 ("Alomomola", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  WISHIWASHI_37 ("Wishiwashi", 37, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  WISHIWASHI_GX_38 ("Wishiwashi-GX", 38, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  MAREANIE_39 ("Mareanie", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  ALOLAN_GEODUDE_40 ("Alolan Geodude", 40, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ALOLAN_GRAVELER_41 ("Alolan Graveler", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ALOLAN_GOLEM_42 ("Alolan Golem", 42, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  HELIOPTILE_43 ("Helioptile", 43, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  HELIOLISK_44 ("Heliolisk", 44, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  VIKAVOLT_GX_45 ("Vikavolt-GX", 45, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  ORICORIO_46 ("Oricorio", 46, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  TAPU_KOKO_GX_47 ("Tapu Koko-GX", 47, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
  SLOWPOKE_48 ("Slowpoke", 48, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SLOWBRO_49 ("Slowbro", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  TRUBBISH_50 ("Trubbish", 50, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GARBODOR_51 ("Garbodor", 51, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GOTHITA_52 ("Gothita", 52, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GOTHORITA_53 ("Gothorita", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GOTHITELLE_54 ("Gothitelle", 54, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  ORICORIO_55 ("Oricorio", 55, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  ORICORIO_56 ("Oricorio", 56, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  TOXAPEX_GX_57 ("Toxapex-GX", 57, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
  MIMIKYU_58 ("Mimikyu", 58, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DHELMISE_59 ("Dhelmise", 59, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  TAPU_LELE_GX_60 ("Tapu Lele-GX", 60, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  LUNALA_61 ("Lunala", 61, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  MACHOP_62 ("Machop", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MACHOP_63 ("Machop", 63, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MACHOKE_64 ("Machoke", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MACHAMP_65 ("Machamp", 65, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  SUDOWOODO_66 ("Sudowoodo", 66, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  GLIGAR_67 ("Gligar", 67, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GLISCOR_68 ("Gliscor", 68, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NOSEPASS_69 ("Nosepass", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BARBOACH_70 ("Barboach", 70, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  WHISCASH_71 ("Whiscash", 71, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PANCHAM_72 ("Pancham", 72, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ROCKRUFF_73 ("Rockruff", 73, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LYCANROC_GX_74 ("Lycanroc-GX", 74, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  MUDBRAY_75 ("Mudbray", 75, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MUDSDALE_76 ("Mudsdale", 76, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MINIOR_77 ("Minior", 77, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  MURKROW_78 ("Murkrow", 78, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  HONCHKROW_79 ("Honchkrow", 79, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SABLEYE_80 ("Sableye", 80, Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  ABSOL_81 ("Absol", 81, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  PANGORO_82 ("Pangoro", 82, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  BELDUM_83 ("Beldum", 83, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  METANG_84 ("Metang", 84, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  METAGROSS_GX_85 ("Metagross-GX", 85, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
  PROBOPASS_86 ("Probopass", 86, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SOLGALEO_87 ("Solgaleo", 87, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  CLEFAIRY_88 ("Clefairy", 88, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  CLEFABLE_89 ("Clefable", 89, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  COTTONEE_90 ("Cottonee", 90, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  WHIMSICOTT_91 ("Whimsicott", 91, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  SYLVEON_GX_92 ("Sylveon-GX", 92, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  COMFEY_93 ("Comfey", 93, Rarity.HOLORARE, [BASIC, POKEMON, _FAIRY_]),
  GOOMY_94 ("Goomy", 94, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  SLIGGOO_95 ("Sliggoo", 95, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  GOODRA_96 ("Goodra", 96, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DRAGON_]),
  DRAMPA_97 ("Drampa", 97, Rarity.HOLORARE, [BASIC, POKEMON, _DRAGON_]),
  JANGMO_O_98 ("Jangmo-o", 98, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  HAKAMO_O_99 ("Hakamo-o", 99, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  KOMMO_O_GX_100 ("Kommo-o-GX", 100, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  CHANSEY_101 ("Chansey", 101, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BLISSEY_102 ("Blissey", 102, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  TAILLOW_103 ("Taillow", 103, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SWELLOW_104 ("Swellow", 104, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  CASTFORM_105 ("Castform", 105, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  RAYQUAZA_106 ("Rayquaza", 106, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  PATRAT_107 ("Patrat", 107, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  WATCHOG_108 ("Watchog", 108, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FLETCHLING_109 ("Fletchling", 109, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  FLETCHINDER_110 ("Fletchinder", 110, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  TALONFLAME_111 ("Talonflame", 111, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  STUFFUL_112 ("Stufful", 112, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BEWEAR_113 ("Bewear", 113, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  KOMALA_114 ("Komala", 114, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRAMPA_GX_115 ("Drampa-GX", 115, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
  AETHER_PARADISE_CONSERVATION_AREA_116 ("Aether Paradise Conservation Area", 116, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  ALTAR_OF_THE_MOONE_117 ("Altar of the Moone", 117, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  ALTAR_OF_THE_SUNNE_118 ("Altar of the Sunne", 118, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  AQUA_PATCH_119 ("Aqua Patch", 119, Rarity.UNCOMMON, [ITEM, TRAINER]),
  BROOKLET_HILL_120 ("Brooklet Hill", 120, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  CHOICE_BAND_121 ("Choice Band", 121, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  ENERGY_LOTO_122 ("Energy Loto", 122, Rarity.UNCOMMON, [ITEM, TRAINER]),
  ENERGY_RECYCLER_123 ("Energy Recycler", 123, Rarity.UNCOMMON, [ITEM, TRAINER]),
  ENHANCED_HAMMER_124 ("Enhanced Hammer", 124, Rarity.UNCOMMON, [ITEM, TRAINER]),
  FIELD_BLOWER_125 ("Field Blower", 125, Rarity.UNCOMMON, [ITEM, TRAINER]),
  HALA_126 ("Hala", 126, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MALLOW_127 ("Mallow", 127, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MAX_POTION_128 ("Max Potion", 128, Rarity.UNCOMMON, [ITEM, TRAINER]),
  MULTI_SWITCH_129 ("Multi Switch", 129, Rarity.UNCOMMON, [ITEM, TRAINER]),
  RESCUE_STRETCHER_130 ("Rescue Stretcher", 130, Rarity.UNCOMMON, [ITEM, TRAINER]),
  TURTONATOR_GX_131 ("Turtonator-GX", 131, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  ALOLAN_NINETALES_GX_132 ("Alolan Ninetales-GX", 132, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  WISHIWASHI_GX_133 ("Wishiwashi-GX", 133, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  VIKAVOLT_GX_134 ("Vikavolt-GX", 134, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  TAPU_KOKO_GX_135 ("Tapu Koko-GX", 135, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
  TOXAPEX_GX_136 ("Toxapex-GX", 136, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
  TAPU_LELE_GX_137 ("Tapu Lele-GX", 137, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  LYCANROC_GX_138 ("Lycanroc-GX", 138, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  METAGROSS_GX_139 ("Metagross-GX", 139, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
  SYLVEON_GX_140 ("Sylveon-GX", 140, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  KOMMO_O_GX_141 ("Kommo-o-GX", 141, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  DRAMPA_GX_142 ("Drampa-GX", 142, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
  HALA_143 ("Hala", 143, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  HAU_144 ("Hau", 144, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  MALLOW_145 ("Mallow", 145, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  DECIDUEYE_GX_146 ("Decidueye-GX", 146, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  INCINEROAR_GX_147 ("Incineroar-GX", 147, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
  TURTONATOR_GX_148 ("Turtonator-GX", 148, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
  PRIMARINA_GX_149 ("Primarina-GX", 149, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  ALOLAN_NINETALES_GX_150 ("Alolan Ninetales-GX", 150, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  WISHIWASHI_GX_151 ("Wishiwashi-GX", 151, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  VIKAVOLT_GX_152 ("Vikavolt-GX", 152, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _LIGHTNING_]),
  TAPU_KOKO_GX_153 ("Tapu Koko-GX", 153, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
  TOXAPEX_GX_154 ("Toxapex-GX", 154, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
  TAPU_LELE_GX_155 ("Tapu Lele-GX", 155, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
  LYCANROC_GX_156 ("Lycanroc-GX", 156, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  METAGROSS_GX_157 ("Metagross-GX", 157, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
  SYLVEON_GX_158 ("Sylveon-GX", 158, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FAIRY_]),
  KOMMO_O_GX_159 ("Kommo-o-GX", 159, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
  DRAMPA_GX_160 ("Drampa-GX", 160, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
  AQUA_PATCH_161 ("Aqua Patch", 161, Rarity.SECRET, [ITEM, TRAINER]),
  ENHANCED_HAMMER_162 ("Enhanced Hammer", 162, Rarity.SECRET, [ITEM, TRAINER]),
  FIELD_BLOWER_163 ("Field Blower", 163, Rarity.SECRET, [ITEM, TRAINER]),
  MAX_POTION_164 ("Max Potion", 164, Rarity.SECRET, [ITEM, TRAINER]),
  RARE_CANDY_165 ("Rare Candy", 165, Rarity.SECRET, [ITEM, TRAINER]),
  DOUBLE_COLORLESS_ENERGY_166 ("Double Colorless Energy", 166, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]),
  GRASS_ENERGY_167 ("Grass Energy", 167, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_168 ("Lightning Energy", 168, Rarity.SECRET, [BASIC_ENERGY, ENERGY]),
  FIGHTING_ENERGY_169 ("Fighting Energy", 169, Rarity.SECRET, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  GuardiansRising(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.GUARDIANS_RISING;
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
          move "Vine Whip", {
            text "30 damage."
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case WEEPINBELL_2:
        return evolution (this, from:"Bellsprout", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Muddy Acid", {
            text "40 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
            energyCost G, C
            onAttack {
              damage 40
              flip{afterDamage{discardDefendingEnergy()}}
            }
          }

        };
      case VICTREEBEL_3:
        return evolution (this, from:"Weepinbell", hp:HP140, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Pollen Hazard", {
            text "20 damage. Your opponent's Active Pokémon is now Burned, Confused, and Poisoned."
            energyCost G
            onAttack {
              damage 20
              afterDamage {
                apply BURNED
                apply CONFUSED
                apply POISONED
              }
            }
          }
          move "Stick and Absorb", {
            text "80 damage. Heal 20 damage from this Pokémon. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost G, C, C
            onAttack {
              damage 80
              healAfterDamage(20, self)
              cantRetreat(defending)
            }
          }

        };
      case PETILIL_4:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Blot", {
            text "10 damage. Heal 10 damage from this Pokémon."
            energyCost C
            onAttack {
              damage 10
              healAfterDamage(10, self)
            }
          }

        };
      case LILLIGANT_5:
        return evolution (this, from:"Petilil", hp:HP090, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Petal Blizzard", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            onAttack {
              opp.all.each {damage 10,it}
            }
          }
          move "Petal Dance", {
            text "40× damage. Flip 3 coins. This attack does 40 damage for each heads. This Pokémon is now Confused."
            energyCost G, C
            onAttack {
              flip 3,{damage 40}
              afterDamage {apply CONFUSED, self}
            }
          }

        };
      case PHANTUMP_6:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Tackle", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }
          move "Confuse Ray", {
            text "Your opponent's Active Pokémon is now Confused."
            energyCost C, C
            onAttack {
              apply CONFUSED
            }
          }

        };
      case TREVENANT_7:
        return evolution (this, from:"Phantump", hp:HP120, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Poltergeist", {
            text "30× damage. Your opponent reveals their hand. This attack does 30 damage for each Trainer card you find there."
            energyCost C, C
            onAttack {
              opp.hand.showToMe("Opponent's hand")
              damage 30*opp.hand.findAll {it.cardTypes.is(TRAINER)}.size()
            }
          }
          move "Horn Leech", {
            text "90 damage. Heal 30 damage from this Pokémon."
            energyCost G, G, C
            onAttack {
              damage 90
              healAfterDamage(30,self)
            }
          }

        };
      case WIMPOD_8:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Scamper Away", {
            text "Shuffle this Pokémon and all cards attached to it into your deck."
            energyCost C
            onAttack {
              shuffleDeck(self.cards)
              removePCS(self)
            }
          }
          move "Ram", {
            text "10 damage."
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case GOLISOPOD_9:
        return evolution (this, from:"Wimpod", hp:HP130, type:GRASS, retreatCost:2) {
          weakness FIRE
          bwAbility "Armor", {
            text "This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.to==self && it.dmg.value && it.notNoEffect){
                  bc "Armor -30"
                  it.dmg -= hp(30)
                }}
              }
            }
          }
          move "Resolute Claws", {
            text "80+ damage. If your opponent's Active Pokémon is a Pokémon-GX or a Pokémon-EX, this attack does 70 more damage (before applying Weakness and Resistance)."
            energyCost G, C, C
            onAttack {
              damage 80
              if(defending.pokemonEX || defending.pokemonGX) damage 70
            }
          }

        };
      case VICTINI_10:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          bwAbility "Victory Star", {
            text "Once during your turn, after you flip any coins for an attack, you may ignore all results of those coin flips and begin flipping those coins again. You can't use more than 1 Victory Star Ability each turn."
            def key = "VICTINI_14 Victory Star"
            delayedA {
              def act = false
              before PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner == self.owner){
                  act = true
                }
              }
              after APPLY_ATTACK_DAMAGES, {
                act = false
              }
              before COIN_FLIP_BETWEEN_EXECUTION, {
                def lastTurn=bg.em().retrieveObject(key)
                if(act && bg.currentThreadPlayerType == self.owner && lastTurn!=bg.turnCount) {
                  if(confirm("Victory Star: Result: "+ef.object.lastResultString +". Do you want to reflip? ")){
                    bg.em().storeObject(key, bg.turnCount)
                    bc "$self used Victory Star and discarded those flips"
                    ef.object.run(bg) //flip again
                    prevent()
                  }
                }
              }

            }
          }
          move "V-Flame", {
            text "50 damage."
            energyCost R, C
            onAttack {
              damage 50
            }
          }

        };
      case LITWICK_11:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Flickering Flames", {
            text "10 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost R
            onAttack {
              damage 10
              applyAfterDamage(ASLEEP)
            }
          }

        };
      case LAMPENT_12:
        return evolution (this, from:"Litwick", hp:HP080, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Will-O-Wisp", {
            text "30 damage."
            energyCost R
            onAttack {
              damage 30
            }
          }

        };
      case CHANDELURE_13:
        return evolution (this, from:"Lampent", hp:HP140, type:FIRE, retreatCost:1) {
          weakness WATER
          bwAbility "Shady Move", {
            text "Once during your turn (before your attack), you may move 1 damage counter from 1 Pokémon to another Pokémon."
            actionA {
              assert all.find({it.numberOfDamageCounters>0})
              checkLastTurn()
              powerUsed()
              def src=all.findAll {it.numberOfDamageCounters>0}.select("Source for damage counter")
              def tar=all
              all.remove(src)
              tar=tar.select("Target for damage counter")
              src.damage-=hp(10)
              tar.damage+=hp(10)
              bc "Swapped a damage counter from $src to $tar"
              checkFaint()
            }
          }
          move "Super Singe", {
            text "50 damage. Your opponent's Active Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 50
              applyAfterDamage(BURNED)
            }
          }

        };
      case ORICORIO_14:
        return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Passionate Dance", {
            text "Search your deck for up to 3 Basic [R] Pokémon and put them onto your Bench. Then, shuffle your deck."
            energyCost R
            attackRequirement {
              assert bench.notFull
              assert deck.notEmpty
            }
            onAttack {
              int count = Math.min(bench.freeBenchCount, 3)
              deck.search (max: count, "Search your deck for up to 3 Basic [R] Pokémon and put them onto your Bench", {it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(R)}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Kindle", {
            text "30 damage. Discard an Energy from this Pokémon. If you do, discard an Energy from your opponent's Active Pokémon."
            energyCost R, R
            onAttack {
              damage 30
              afterDamage {
                discardSelfEnergy(C)
                discardDefendingEnergy()
              }
            }
          }

        };
      case SALANDIT_15:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Scratch", {
            text "10 damage."
            energyCost R
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
      case SALAZZLE_16:
        return evolution (this, from:"Salandit", hp:HP110, type:FIRE, retreatCost:1) {
          weakness WATER
          bwAbility "Hot Poison", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may leave your opponent's Active Pokémon Burned and Poisoned."
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm('Use Hot Poison?')){
                powerUsed()
                apply(BURNED, opp.active, SRC_ABILITY)
                apply(POISONED, opp.active, SRC_ABILITY)
              }
            }
          }
          move "Flamethrower", {
            text "90 damage. Discard an Energy from this Pokémon."
            energyCost R, C, C
            onAttack {
              damage 90
              afterDamage{
                discardSelfEnergy(C)
              }
            }
          }

        };
      case TURTONATOR_17:
        return basic (this, hp:HP110, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 30
              flip{
                applyAfterDamage(PARALYZED)
              }
            }
          }
          move "Heat Blast", {
            text "90 damage."
            energyCost R, R, C
            onAttack {
              damage 90
            }
          }

        };
      case TURTONATOR_GX_18:
        return basic (this, hp:HP190, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Shell Trap", {
            text "20 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out), put 8 damage counters on the Attacking Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              delayed (priority: LAST) {
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                    bc "Counter Head activates"
                    directDamage(80, ef.attacker as PokemonCardSet)
                  }
                }
                unregisterAfter 2
                after SWITCH, self, {unregister()}
              }
            }
          }
          move "Bright Flame", {
            text "160 damage. Discard 2 [R] Energy from this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 160
              afterDamage{
                discardSelfEnergy(R, R)
              }
            }
          }
          move "Nitro Tank GX", {
            text "Attach 5 [R] Energy cards from your discard pile to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)"
            energyCost R
            attackRequirement {
              gxCheck()
              assert my.discard.filterByEnergyType(R)
            }
            onAttack {
              gxPerform()
              my.discard.filterByEnergyType(R).select(max: 5).each{
                attachEnergy(my.all.select("Attach"), it)
              }
            }
          }

        };
      case ALOLAN_SANDSHREW_19:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness METAL
          move "Defense Curl", {
            text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
            onAttack {
              flip{preventAllDamageNextTurn()}
            }
          }
          move "Ice Ball", {
            text "30 damage."
            energyCost W, C, C
            onAttack {
              damage 30
            }
          }

        };
      case ALOLAN_SANDSLASH_20:
        return evolution (this, from:"Alolan Sandshrew", hp:HP110, type:WATER, retreatCost:2) {
          weakness METAL
          bwAbility "Slush Rush", {
            text "Once during your turn (before your attack), you may draw a card."
            actionA {
              assert my.deck : "Deck is empty"
              checkLastTurn()
              powerUsed()
              draw 1
            }
          }
          move "Smash Turn", {
            text "50 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost W, C, C
            onAttack {
              damage 50
              switchYourActive()
            }
          }

        };
      case ALOLAN_VULPIX_21:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness METAL
          move "Beacon", {
            text "Search your deck for up to 2 Pokémon, reveal them, and put them into your hand. Then, shuffle your deck."
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search (max: 2, cardTypeFilter(POKEMON)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Icy Snow", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case ALOLAN_NINETALES_GX_22:
        return evolution (this, from:"Alolan Vulpix", hp:HP210, type:WATER, retreatCost:1) {
          weakness METAL
          move "Ice Blade", {
            text "This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon)."
            energyCost C, C
            onAttack {
              damage 50, opp.all.select()
            }
          }
          move "Blizzard Edge", {
            text "160 damage. Discard 2 Energy from this Pokémon."
            energyCost W, W, C
            onAttack {
              damage 160
              afterDamage{
                discardSelfEnergy(C, C)
              }
            }
          }
          move "Ice Path GX", {
            text "Move all damage counters from this Pokémon to your opponent's Active Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost C, C
            attackRequirement {
              gxCheck()
              assert self.numberOfDamageCounters
            }
            onAttack {
              gxPerform()
              targeted (defending) {
                defending.damage += self.damage
                self.damage = hp(0)
              }
            }
          }

        };
      case TENTACOOL_23:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Sludge Shock", {
            text "10 damage. The Defending Pokémon can't be healed during your opponent's next turn."
            energyCost C
            onAttack {
              damage 10
              cantBeHealed(defending)
            }
          }

        };
      case TENTACRUEL_24:
        return evolution (this, from:"Tentacool", hp:HP110, type:WATER, retreatCost:2) {
          weakness GRASS
          move "Poison Sting", {
            text "30 damage. Your opponent's Active Pokémon is now Poisoned."
            energyCost C, C
            onAttack {
              damage 30
              applyAfterDamage POISONED
            }
          }
          move "Seething Tentacles", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 more damage. If tails, your opponent's Active Pokémon is now Paralyzed."
            energyCost C, C, C
            onAttack {
              damage 40
              flip 1,{damage 40},{applyAfterDamage PARALYZED}
            }
          }

        };
      case POLITOED_25:
        return evolution (this, from:"Poliwhirl", hp:HP130, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Roll Call", {
            text "Search your deck for a Poliwag, a Poliwhirl, and a Poliwrath, and put them onto your Bench. Then, shuffle your deck."
            energyCost W
            onAttack {
              int count = Math.min(bench.freeBenchCount, 3)
              my.deck.search(max: count, "Select a Poliwag, a Poliwhirl and a Poliwrath", {it.name == "Poliwag" || it.name == "Poliwhirl" || it.name == "Poliwrath"}, {CardList list ->
                list.filterByNameEquals("Poliwag").size() <= 1 && list.filterByNameEquals("Poliwhirl").size() <= 1 && list.filterByNameEquals("Poliwrath").size() <= 1
              }).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Hyper Jump", {
            text "100 damage. You may shuffle this Pokémon and all cards attached to it into your deck."
            energyCost W, C, C
            onAttack {
              damage 100
              if (confirm('You may shuffle this Pokémon and all cards attached to it into your deck.')) {
                afterDamage {
                  shuffleDeck(self.cards)
                  removePCS(self)
                }
              }
            }
          }

        };
      case DELIBIRD_26:
        return basic (this, hp:HP090, type:WATER, retreatCost:1) {
          weakness METAL
          move "All the Presents", {
            text "Flip a coin until you get tails. For each heads, you may search your deck for a card and put it into your hand. Then, shuffle your deck."
            energyCost C
            onAttack {
              int c=0
              flipUntilTails {c++}
              if(c && my.deck){
                my.deck.select(min: 0, max: c).moveTo(hidden:true, my.hand)
                shuffleDeck()
              }
            }
          }
          move "Surprise Attack", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost W
            onAttack {
              flip{damage 40}
            }
          }

        };
      case CARVANHA_27:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Bite", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case SHARPEDO_28:
        return evolution (this, from:"Carvanha", hp:HP090, type:WATER, retreatCost:0) {
          weakness GRASS
          move "Jet Headbutt", {
            text "70 damage."
            energyCost W, C
            onAttack {
              damage 70
            }
          }

        };
      case WAILMER_29:
        return basic (this, hp:HP120, type:WATER, retreatCost:3) {
          weakness GRASS
          move "Splash", {
            text "20 damage."
            energyCost W, C
            onAttack {
              damage 20
            }
          }
          move "Surf", {
            text "70 damage."
            energyCost W, W, W, C
            onAttack {
              damage 70
            }
          }

        };
      case WAILORD_30:
        return evolution (this, from:"Wailmer", hp:HP200, type:WATER, retreatCost:4) {
          weakness GRASS
          move "Dive", {
            text "40 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost W, W, C
            onAttack {
              damage 40
              flip{preventAllEffectsNextTurn()}
            }
          }
          move "Open Sea", {
            text "80 damage. Heal 30 damage from each of your [W] Pokémon."
            energyCost W, W, W, C
            onAttack {
              damage 80
              afterDamage{
                my.all.findAll{it.types.contains(W) && it.numberOfDamageCounters}.each{heal 30, it}
              }
            }
          }

        };
      case SNORUNT_31:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness METAL
          move "Chilly", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Frost Breath", {
            text "20 damage."
            energyCost W, W
            onAttack {
              damage 20
            }
          }

        };
      case GLALIE_32:
        return evolution (this, from:"Snorunt", hp:HP120, type:WATER, retreatCost:3) {
          weakness METAL
          move "Crunch", {
            text "40 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
            energyCost W, W
            onAttack {
              damage 40
              flip{afterDamage{discardDefendingEnergy()}}
            }
          }
          move "Raging Floe", {
            text "70+ damage. If this Pokémon has any damage counters on it, this attack does 80 more damage."
            energyCost W, W, W
            onAttack {
              damage 70
              if(self.numberOfDamageCounters)damage 80
            }
          }

        };
      case VANILLITE_33:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness METAL
          move "Triple Spin", {
            text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
            energyCost W
            onAttack {
              flip 3,{damage 10}
            }
          }

        };
      case VANILLISH_34:
        return evolution (this, from:"Vanillite", hp:HP080, type:WATER, retreatCost:2) {
          weakness METAL
          move "Ice Shard", {
            text "30+ damage. If your opponent's Active Pokémon is a [F] Pokémon, this attack does 30 more damage."
            energyCost W
            onAttack {
              damage 30
              if(defending.types.contains(F)) damage 30
            }
          }

        };
      case VANILLUXE_35:
        return evolution (this, from:"Vanillish", hp:HP140, type:WATER, retreatCost:2) {
          weakness METAL
          move "Hail", {
            text "This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              opp.all.each{damage 20,it}
            }
          }
          move "Frozen Breath", {
            text "80 damage. You may discard 2 [W] Energy from this Pokémon. If you do, your opponent's Active Pokémon is now Paralyzed."
            energyCost W, W, W
            onAttack {
              damage 80
              if(confirm("You may discard 2 [W] Energy from this Pokémon. If you do, your opponent's Active Pokémon is now Paralyzed.")){
                afterDamage {
                  discardSelfEnergy W, W
                  apply PARALYZED, defending
                }
              }
            }
          }

        };
      case ALOMOMOLA_36:
        return basic (this, hp:HP110, type:WATER, retreatCost:2) {
          weakness GRASS
          move "Borne Ashore", {
            text "Put a Basic Pokémon from either player's discard pile onto its owner's Bench."
            energyCost C
            attackRequirement {
              assert (my.discard.find(cardTypeFilter(BASIC)) && my.bench.notFull) ||
                (opp.discard.find(cardTypeFilter(BASIC)) && opp.bench.notFull)
            }
            onAttack {
              boolean b1 = my.discard.find(cardTypeFilter(BASIC)) && my.bench.notFull
              boolean b2 = opp.discard.find(cardTypeFilter(BASIC)) && opp.bench.notFull
              def cl = []
              if(b1) cl += TargetPlayer.SELF
              if(b2) cl += TargetPlayer.OPPONENT
              def tar = choose(cl)
              tar.pbg.discard.findAll(cardTypeFilter(BASIC)).select().each {
                tar.pbg.discard.remove(it)
                benchPCS(it, OTHER, tar)
              }
            }
          }
          move "Hydro Splash", {
            text "60 damage."
            energyCost W, C, C
            onAttack {
              damage 60
            }
          }

        };
      case WISHIWASHI_37:
        return basic (this, hp:HP030, type:WATER, retreatCost:0) {
          weakness LIGHTNING
          bwAbility "Schooling", {
            text "Once during your turn (before your attack), you may switch this Pokémon with a Wishiwashi-GX in your hand. Any attached cards, damage counters, Special Conditions, turns in play, and any other effects remain on the new Pokémon."
            actionA {
              assert my.hand.find{it.name=='Wishiwashi-GX'}
              checkLastTurn()
              powerUsed()
              def card = my.hand.findAll{it.name=='Wishiwashi-GX'}.select().first()
              def pcs = self
              def top = pcs.topPokemonCard
              pcs.cards.remove(top)
              my.hand.add(top)
              my.hand.remove(card)
              pcs.cards.add(card)
              bc "$top was switched with $card"
              checkFaint()
              bg.em().run(new CheckAbilities(OTHER, new PcsList(pcs))) //need to remove existing abilities?
            }
          }
          move "Sharpshooting", {
            text "This attack does 10 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              damage 10, opp.all.select()
            }
          }

        };
      case WISHIWASHI_GX_38:
        return basic (this, hp:HP210, type:WATER, retreatCost:3) {
          weakness LIGHTNING
          move "Water Gun", {
            text "20 damage."
            energyCost W
            onAttack {
              damage 20
            }
          }
          move "Torrential Vortex", {
            text "120 damage. Discard a Special Energy from your opponent's Active Pokémon."
            energyCost W, W, W, C, C
            onAttack {
              damage 120
              discardDefendingSpecialEnergy(delegate)
            }
          }
          move "Blue Surge GX", {
            text "220 damage. Move all Energy from this Pokémon to your Benched Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)"
            energyCost W, W, W, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 220
              afterDamage { if(my.bench.notEmpty)
                self.cards.filterByType(ENERGY).each {
                  energySwitch(self, my.bench.select("Move $it to?"), it)
                }
              }
            }
          }

        };
      case MAREANIE_39:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Bail Out", {
            text "Put a Pokémon from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.find(cardTypeFilter(POKEMON))
            }
            onAttack {
              my.discard.findAll(cardTypeFilter(POKEMON)).select().moveTo(my.hand)
            }
          }
          move "Rain Splash", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case ALOLAN_GEODUDE_40:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Rock Polish", {
            text "During your next turn, this Pokémon has no Retreat Cost."
            onAttack {
              delayed {
                def eff = getter (GET_RETREAT_COST, BEFORE_LAST, self) {h->
                  h.object=0
                }
                unregisterAfter 3
                unregister {
                  eff.unregister()
                }
              }
            }
          }
          move "Rollout", {
            text "40 damage."
            energyCost L, C, C
            onAttack {
              damage 40
            }
          }

        };
      case ALOLAN_GRAVELER_41:
        return evolution (this, from:"Alolan Geodude", hp:HP110, type:LIGHTNING, retreatCost:4) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Thunder Punch", {
            text "50+ damage. Flip a coin. If heads, this attack does 20 more damage. If tails, this Pokémon does 20 damage to itself."
            energyCost L, C, C
            onAttack {
              damage 50
              flip 1,{damage 20},{damage 20,self}
            }
          }
          move "Electrobullet", {
            text "80 damage. This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L, L, C
            onAttack {
              damage 80
              if(opp.bench) damage 20, opp.bench.select()
            }
          }

        };
      case ALOLAN_GOLEM_42:
        return evolution (this, from:"Alolan Graveler", hp:HP160, type:LIGHTNING, retreatCost:4) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Electromagnetic Rock Wrecker", {
            text "80× damage. Flip a coin for each [L] Energy attached to this Pokémon. This attack does 80 damage for each heads."
            energyCost L, C, C
            onAttack {
              flip self.cards.energyCount(L), {damage 80}
            }
          }
          move "Heavy Slam", {
            text "200- damage. This attack does 30 less damage for each [C] in your opponent's Active Pokémon's Retreat Cost."
            energyCost L, C, C, C
            onAttack {
              damage 200-30*defending.retreatCost
            }
          }

        };
      case HELIOPTILE_43:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Thunder Shock", {
            text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }

        };
      case HELIOLISK_44:
        return evolution (this, from:"Helioptile", hp:HP100, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 more damage."
            energyCost C
            onAttack {
              damage 20
              flip{damage 20}
            }
          }
          move "Raging Thunder", {
            text "120 damage. This attack does 30 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, C, C
            onAttack {
              damage 120
              if(my.bench) damage 30, my.bench.select()
            }
          }

        };
      case VIKAVOLT_GX_45:
        return evolution (this, from:"Charjabug", hp:HP240, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Charge Beam", {
            text "50 damage. Attach an Energy card from your discard pile to this Pokémon."
            energyCost L
            onAttack {
              damage 50
              afterDamage {
                def list = my.discard.findAll(cardTypeFilter(ENERGY))
                if(list) list.select("Attach").each{attachEnergy(self, it)}
              }
            }
          }
          move "Super Zap Cannon", {
            text "180 damage. Discard 2 Energy from this Pokémon."
            energyCost L, C, C, C
            onAttack {
              damage 180
              afterDamage{
                discardSelfEnergy C, C
              }
            }
          }
          move "Gigatron GX", {
            text "This attack does 60 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
            energyCost L, C, C, C
            attackRequirement {
              gxCheck()
              assert opp.bench
            }
            onAttack {
              gxPerform()
              opp.bench.each {damage 60, it}
            }
          }

        };
      case ORICORIO_46:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Feather Dance", {
            text "During your next turn, this Pokémon's Pom-Pom Punch attack's base damage is 100 (before applying Weakness and Resistance)."
            energyCost L
            onAttack {
              increasedBaseDamageNextTurn("Pom-Pom Punch", hp(80))
            }
          }
          move "Pom-Pom Punch", {
            text "20 damage."
            energyCost L
            onAttack {
              damage 20
            }
          }

        };
      case TAPU_KOKO_GX_47:
        return basic (this, hp:HP170, type:LIGHTNING, retreatCost:2) {
          bwAbility "Aero Trail", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may move any number of [L] Energy from your other Pokémon to this Pokémon. If you do, switch this Pokémon with your Active Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && self.benched && confirm("Use Aero Trail?")){
                powerUsed()
                while(1){
                  def pl=(my.all.findAll {it.cards.filterByEnergyType(L) && it!=self})
                  if(!pl) break;
                  def src=pl.select("Source for energy (cancel to stop)", false)
                  if(!src) break;
                  def card=src.cards.filterByEnergyType(L).select("Card to move").first()
                  energySwitch(src, self, card)
                }
                sw my.active, self
              }
            }
          }
          move "Sky-High Claws", {
            text "130 damage."
            energyCost L, L, C
            onAttack {
              damage 130
            }
          }
          move "Tapu Thunder GX", {
            text "50× damage. This attack does 50 damage times the amount of Energy attached to all of your opponent's Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost L, L, C
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              int c=0
              opp.all.each {c+=it.cards.energyCount(C)}
              damage 50*c
            }
          }

        };
      case SLOWPOKE_48:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Headbutt", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Whimsy Tackle", {
            text "60 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P, C, C
            onAttack {
              flip{damage 60}
            }
          }

        };
      case SLOWBRO_49:
        return evolution (this, from:"Slowpoke", hp:HP110, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Amnesia", {
            text "20 damage. Choose 1 of your opponent's Active Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost C
            onAttack {
              damage 20
              amnesia delegate
            }
          }
          move "Facade", {
            text "50+ damage. If this Pokémon is Burned or Poisoned, this attack does 80 more damage."
            energyCost P, C, C
            onAttack {
              damage 50
              if(self.isSPC(BURNED) || self.isSPC(POISONED)) damage 80
            }
          }

        };
      case TRUBBISH_50:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Stomp Off", {
            text "Discard the top card of your opponent's deck."
            energyCost P
            attackRequirement {
              assert opp.deck
            }
            onAttack {
              discard opp.deck.first()
            }
          }
          move "Drool", {
            text "30 damage."
            energyCost P, C, C
            onAttack {
              damage 30
            }
          }

        };
      case GARBODOR_51:
        return evolution (this, from:"Trubbish", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Trashalanche", {
            text "20× damage. This attack does 20 damage for each Item card in your opponent's discard pile."
            energyCost P
            onAttack {
              damage 20*opp.discard.filterByType(ITEM).size()
            }
          }
          move "Acid Spray", {
            text "70 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
            energyCost P, C, C
            onAttack {
              damage 70
              flip{afterDamage{discardDefendingEnergy()}}
            }
          }

        };
      case GOTHITA_52:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Blown Kiss", {
            text "Put 1 damage counter on 1 of your opponent's Pokémon."
            energyCost P
            onAttack {
              directDamage 10, opp.all.select()
            }
          }

        };
      case GOTHORITA_53:
        return evolution (this, from:"Gothita", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Slap", {
            text "20 damage."
            energyCost P
            onAttack {
              damage 20
            }
          }
          move "Psybeam", {
            text "30 damage. Your opponent's Active Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 30
              applyAfterDamage CONFUSED
            }
          }

        };
      case GOTHITELLE_54:
        return evolution (this, from:"Gothorita", hp:HP140, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          move "Tractorbeam", {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 30 damage to the new Active Pokémon."
            energyCost P
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw opp.active, opp.bench.select("Switch")
              damage 30, opp.active
            }
          }
          move "Link Blast", {
            text "50+ damage. If this Pokémon and your opponent's Active Pokémon have the same amount of Energy attached to them, this attack does 80 more damage."
            energyCost P, C
            onAttack {
              damage 50
              if(self.cards.energyCount(C) == defending.cards.energyCount(C)) damage 80
            }
          }

        };
      case ORICORIO_55:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Vital Dance", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            onActivate {r->
              if(r==PLAY_FROM_HAND && my.deck.notEmpty && confirm('Use Vital Dance?')){
                powerUsed()
                my.deck.search(max: 2, cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Casual Slap", {
            text "30 damage."
            energyCost P, C
            onAttack {
              damage 30
            }
          }

        };
      case ORICORIO_56:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Supernatural Dance", {
            text "For each Pokémon in your opponent's discard pile, but 1 damage counter on your opponent's Pokémon in any way you like."
            energyCost C
            attackRequirement {
              assert opp.discard.filterByType(POKEMON)
            }
            onAttack {
              int c = opp.discard.filterByType(POKEMON).size()
              (1..c).each {
                if(opp.all) directDamage 10, opp.all.select("Put 1 damage counter on")
              }
            }
          }
          move "Revelation Dance", {
            text "30 damage. If there is no Stadium card in play, this attack does nothing."
            energyCost C
            attackRequirement {
              assert bg.stadiumInfoStruct
            }
            onAttack {
              damage 30
            }
          }

        };
      case TOXAPEX_GX_57:
        return evolution (this, from:"Mareanie", hp:HP210, type:PSYCHIC, retreatCost:3) {
          weakness PSYCHIC
          move "Spike Cannon", {
            text "30× damage. Flip 4 coins. This attack does 30 damage for each heads."
            energyCost P
            onAttack {
              flip 4, {damage 30}
            }
          }
          move "Super Intense Poison", {
            text "Your opponent's Active Pokémon is now Poisoned. Put 10 damage counters instead of 1 on that Pokémon between turns."
            energyCost P, P, P
            onAttack {
              apply POISONED
              extraPoison 9
            }
          }
          move "Total Shelter GX", {
            text "150 damage. Prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn. (You can't use more than 1 GX attack in a game.)"
            energyCost P, P, P
            attackRequirement {gxCheck()}
            onAttack {
              gxPerform()
              damage 150
              preventAllEffectsNextTurn()
            }
          }

        };
      case MIMIKYU_58:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          globalAbility {Card thisCard->
            delayed (priority: LAST) {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner!=thisCard.player && !(ef as Attack).move.name.endsWith("-GX")){
                  bg.em().storeObject("MimiCopycatMove_${thisCard.hashCode()}", ef.move)
                  bg.em().storeObject("MimiCopycatTC_${thisCard.hashCode()}", bg.turnCount)
                }
              }
            }
          }
          move "Filch", {
            text "Draw 2 cards."
            energyCost C
            onAttack {
              draw 2
            }
          }
          move "Copycat", {
            text "If your opponent's Pokémon used an attack that isn't a GX attack during their last turn, use it as this attack."
            energyCost P, C
            attackRequirement {
              def tc = bg.em().retrieveObject("MimiCopycatTC_${self.topPokemonCard.hashCode()}") ?: -1
              assert tc+1 == bg.turnCount : "Opponent did not used a valid move last turn"
            }
            onAttack {
              def lastMove = bg.em().retrieveObject("MimiCopycatMove_${self.topPokemonCard.hashCode()}") as Move
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              bc "Copycat copies ${lastMove.name}"
              attack (lastMove)
              bef.unregisterItself(bg().em())
            }
          }

        };
      case DHELMISE_59:
        return basic (this, hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Steelworker", {
            text "Your [M] Pokémon's attacks do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from.owner == self.owner && it.from.types.contains(M) && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                    it.dmg += hp(10)
                    bc "Steelworker +10"
                  }
                }
              }
            }
          }
          move "Anchor Shot", {
            text "70 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost P, C, C
            onAttack {
              damage 70
              cantRetreat(defending)
            }
          }

        };
      case TAPU_LELE_GX_60:
        return basic (this, hp:HP170, type:PSYCHIC, retreatCost:1) {
          bwAbility "Wonder Tag", {
            text "When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && self.benched && my.deck.notEmpty && confirm("Use Wonder Tag?")){
                powerUsed()
                deck.search (cardTypeFilter(SUPPORTER)).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Energy Drive", {
            text "20× damage. This attack does 20 damage times the amount of Energy attached to both Active Pokémon. This damage isn't affected by Weakness or Resistance."
            energyCost C, C
            onAttack {
              noWrDamage(20*(self.cards.energyCount(C)+defending.cards.energyCount(C)), defending)
            }
          }
          move "Tapu Cure GX", {
            text "Heal all damage from 2 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost P
            attackRequirement {
              gxCheck()
              assert my.bench.findAll {it.numberOfDamageCounters}
            }
            onAttack {
              gxPerform()
              healAll my.bench.findAll {it.numberOfDamageCounters}.select("Fully heal")
              if(my.bench.findAll {it.numberOfDamageCounters}){
                healAll my.bench.findAll {it.numberOfDamageCounters}.select("Fully heal")
              }
            }
          }

        };
      case LUNALA_61:
        return evolution (this, from:"Cosmoem", hp:HP160, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Shatter Shot", {
            text "40× damage. This attack does 40 damage times the number of [P] Energy attached to this Pokémon."
            energyCost P
            onAttack {
              damage 40*self.cards.energyCount(P)
            }
          }
          move "Wings of the Moone", {
            text "130 damage. Move all Energy attached to this Pokémon to your Benched Pokémon in any way you like."
            energyCost P, P, P
            onAttack {
              damage 130
              afterDamage { if(my.bench.notEmpty)
                self.cards.filterByType(ENERGY).each {
                  energySwitch(self, my.bench.select("Move $it to?"), it)
                }
              }
            }
          }

        };
      case MACHOP_62:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Dual Chop", {
            text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost F, F
            onAttack {
              flip 2, {damage 30}
            }
          }

        };
      case MACHOP_63:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Dynamic Chop", {
            text "50 damage."
            energyCost F, C
            onAttack {
              damage 50
            }
          }

        };
      case MACHOKE_64:
        return evolution (this, from:"Machop", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness PSYCHIC
          bwAbility "Daunting Pose", {
            text "Prevent all damage done to your Benched Pokémon by your opponent's attacks. Your opponent's attacks and Abilities can't place damage counters on your Benched Pokémon."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.from.owner != self.owner && it.to.owner==self.owner && it.to.benched && it.dmg.value){
                  bc "Daunting Pose reduces damage"
                  it.dmg=hp(0)
                  // TODO needs source refactoring to work correctly
                }}
              }
            }
          }
          move "Cross Chop", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost F, F
            onAttack {
              damage 30
              flip {damage 30}
            }
          }

        };
      case MACHAMP_65:
        return evolution (this, from:"Machoke", hp:HP160, type:FIGHTING, retreatCost:3) {
          weakness PSYCHIC
          move "Settle the Score", {
            text "20+ damage. This attack does 80 more damage for each Prize card your opponent took on their last turn."
            energyCost F, F
            onAttack {
              damage 20
              damage 80*bg.lastTurnTakePrize
            }
          }
          move "Submission", {
            text "150 damage. This Pokémon does 30 damage to itself."
            energyCost F, F, F
            onAttack {
              damage 150
              damage 30,self
            }
          }

        };
      case SUDOWOODO_66:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:2) {
          weakness WATER
          bwAbility "Roadblock", {
            text "Your opponent can't have more than 4 Benched Pokémon. If they have 5 or more Benched Pokémon, they discard Benched Pokémon until they have 4 Pokémon on the Bench. If more than one effect changes the number of Benched Pokémon allowed, use the smaller number."
            getterA (GET_BENCH_SIZE) {h->
              if(h.effect.playerType == self.owner.opposite) {
                h.object = 4
              }
            }
            onActivate {
              self.owner.opposite.pbg.triggerBenchSizeCheck()
            }
            onDeactivate {
              self.owner.opposite.pbg.triggerBenchSizeCheck()
            }
          }
          move "Rock Throw", {
            text "40 damage."
            energyCost F, C
            onAttack {
              damage 40
            }
          }

        };
      case GLIGAR_67:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Double Shot", {
            text "This attack does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            onAttack {
              multiDamage opp.bench, 2, 10
            }
          }

        };
      case GLISCOR_68:
        return evolution (this, from:"Gligar", hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Finishing Stinger", {
            text "70 damage. If your opponent's Active Pokémon has no damage counters on it before this attack does damage, this attack does nothing."
            energyCost F
            attackRequirement {
              assert defending.numberOfDamageCounters
            }
            onAttack {
              damage 70
            }
          }
          move "Guillotine", {
            text "90 damage."
            energyCost F, C, C
            onAttack {
              damage 90
            }
          }

        };
      case NOSEPASS_69:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Ram", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }
          move "Rising Lunge", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
            energyCost F, C, C
            onAttack {
              damage 30
              flip{damage 30}
            }
          }

        };
      case BARBOACH_70:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Hook", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Mud-Slap", {
            text "20 damage."
            energyCost F, C
            onAttack {
              damage 20
            }
          }

        };
      case WHISCASH_71:
        return evolution (this, from:"Barboach", hp:HP130, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Water Pulse", {
            text "60 damage. You opponent's Active Pokémon is now Asleep."
            energyCost F, C, C
            onAttack {
              damage 60
              applyAfterDamage ASLEEP
            }
          }
          move "Landslip", {
            text "100× damage. Discard the top 3 cards of your deck. This attack does 100 damage for each Energy card you discarded in this way."
            energyCost F, C, C, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def list = my.deck.subList(0, 3).discard()
              damage 100 * list.filterByType(ENERGY).size()
            }
          }

        };
      case PANCHAM_72:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Karate Chop", {
            text "60- damage. This attack does 10 less damage for each damage counter on this Pokémon."
            energyCost F, F
            onAttack {
              damage 60 - 10*self.numberOfDamageCounters
            }
          }

        };
      case ROCKRUFF_73:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Corner", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost F
            onAttack {
              cantRetreat defending
            }
          }
          move "Wild Kick", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip{damage 30}
            }
          }

        };
      case LYCANROC_GX_74:
        return evolution (this, from:"Rockruff", hp:HP200, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          bwAbility "Bloodthirsty Eyes", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn you may switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            onActivate {r->
              if(r==PLAY_FROM_HAND && opp.bench.notEmpty && confirm('Use Bloodthirsty Eyes?')) {
                powerUsed()
                def pcs = opp.bench.select('New defending')
                sw opp.active, pcs, SRC_ABILITY
              }
            }
          }
          move "Claw Slash", {
            text "110 damage."
            energyCost F, C, C
            onAttack {
              damage 110
            }
          }
          move "Dangerous Rogue GX", {
            text "50× damage. This attack does 50 damage for each of your opponent's Benched Pokémon. (You can't use more than 1 GX attack in a game.)"
            energyCost F, C
            attackRequirement {
              gxCheck()
              assert opp.bench.size() : "No opponent bench"
            }
            onAttack {
              gxPerform()
              damage 50*opp.bench.size()
            }
          }

        };
      case MUDBRAY_75:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Double Kick", {
            text "30× damage. Flip 2 coins. This attack does 30 damage for each heads."
            energyCost F, F
            onAttack {
              flip 2,{damage 30}
            }
          }

        };
      case MUDSDALE_76:
        return evolution (this, from:"Mudbray", hp:HP140, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          move "Enhanced Stomp", {
            text "60+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 60 more damage."
            energyCost F, F, C
            onAttack {
              damage 60
              if(self.cards.filterByType(POKEMON_TOOL)) damage 60
            }
          }
          move "High Horsepower", {
            text "180 damage. This Pokémon does 40 damage to itself."
            energyCost F, F, F, C
            onAttack {
              damage 180
              damage 40,self
            }
          }

        };
      case MINIOR_77:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Swift", {
            text "20 damage. This attack's damage isn't affected by Weakness, Resistance, or any other effects on your opponent's Active Pokémon."
            energyCost C
            onAttack {
              swiftDamage(20,defending)
            }
          }
          move "Cosmicsplosion", {
            text "190 damage. This Pokémon is Knocked Out."
            energyCost F, F, F
            onAttack {
              damage 190
              afterDamage {
                new Knockout(self).run(bg)
              }
            }
          }

        };
      case MURKROW_78:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Whirlwind", {
            text "10 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost D
            onAttack {
              damage 10
              whirlwind()
            }
          }

        };
      case HONCHKROW_79:
        return evolution (this, from:"Murkrow", hp:HP110, type:DARKNESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Feint Attack", {
            text "This attack does 30 damage to 1 of your opponent's Pokémon. This damage isn't affected by Weakness, Resistance, or any other effects on that Pokémon."
            energyCost D
            onAttack {
              swiftDamage(30, opp.all.select())
            }
          }
          move "Raven's Claw", {
            text "10+ damage. This attack does 10 more damage for each damage counter on all of your opponent's Pokémon."
            energyCost C, C
            onAttack {
              damage 10
              opp.all.findAll {damage 10*it.numberOfDamageCounters}
            }
          }

        };
      case SABLEYE_80:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          move "Limitation", {
            text "Your opponent can't play any Supporter cards from their hand during their next turn."
            energyCost D
            onAttack {
              opponentCantPlaySupporterNextTurn(delegate)
            }
          }
          move "Scratch", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }

        };
      case ABSOL_81:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Future Sight", {
            text "Look at the top 4 cards of either player's deck and put them back in any order."
            energyCost D
            rearrangeEitherPlayersDeck(delegate, 4)
          }
          move "Doom News", {
            text "Put all Energy attached to this Pokémon into your hand. At the end of your opponent's next turn, the Defending Pokémon will be Knocked Out."
            energyCost D, C
            onAttack {
              self.cards.filterByType(ENERGY).moveTo(my.hand)
              def pcs = defending
              delayed {
                before BETWEEN_TURNS, {
                  if(turnCount + 1 <= bg.turnCount){
                    if(all.contains(pcs)){
                      bc "Doom News kicks in"
                      new Knockout(pcs).run(bg)
                    }
                  }
                }
                unregisterAfter 2
                after SWITCH, pcs, {unregister()}
                after EVOLVE, pcs, {unregister()}
              }
            }
          }

        };
      case PANGORO_82:
        return evolution (this, from:"Pancham", hp:HP130, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Sky Uppercut", {
            text "70 damage. This attack's damage isn't affected by Resistance."
            energyCost D, C, C
            onAttack {
              damage 70
              dontApplyResistance()
            }
          }
          move "Magnum Punch", {
            text "130 damage."
            energyCost D, C, C, C
            onAttack {
              damage 130
            }
          }

        };
      case BELDUM_83:
        return basic (this, hp:HP060, type:METAL, retreatCost:1) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Core Beam", {
            text "20 damage. Discard a [M] Energy from this Pokémon."
            energyCost M
            onAttack {
              damage 20
              afterDamage{
                discardSelfEnergy M
              }
            }
          }

        };
      case METANG_84:
        return evolution (this, from:"Beldum", hp:HP090, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Ram", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Core Beam", {
            text "80 damage. Discard a [M] Energy from this Pokémon."
            energyCost M, M, C
            onAttack {
              damage 80
              afterDamage{
                discardSelfEnergy M
              }
            }
          }

        };
      case METAGROSS_GX_85:
        return evolution (this, from:"Metang", hp:HP250, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          bwAbility "Geotech System", {
            text "Once during your turn (before your attack), you may attach a [P] or [M] Energy card from your discard pile to your Active Pokémon."
            actionA {
              checkLastTurn()
              assert my.discard.filterByEnergyType(M) || my.discard.filterByEnergyType(P)
              powerUsed()
              my.discard.findAll{it.cardTypes.isEnergy() && (it.asEnergyCard().containsTypePlain(M) || it.asEnergyCard().containsTypePlain(P))}.select("Attach").each{
                attachEnergy(my.active, it)
              }
            }
          }
          move "Giga Hammer", {
            text "150 damage. This Pokémon can't use Giga Hammer during your next turn."
            energyCost M, M, C
            onAttack {
              damage 150
              cantUseAttack(thisMove, self)
            }
          }
          move "Algorithm GX", {
            text "Search your deck for up to 5 cards and put them into your hand. Then, shuffle your deck. (You can't use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
              assert my.deck
            }
            onAttack {
              gxPerform()
              my.deck.select(max: 5).moveTo(hidden:true, my.hand);
              shuffleDeck()
            }
          }

        };
      case PROBOPASS_86:
        return evolution (this, from:"Nosepass", hp:HP130, type:METAL, retreatCost:4) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Energy Link", {
            text "30 damage. Attach an Energy card from your discard pile to this Pokémon."
            energyCost M
            onAttack {
              damage 30
              afterDamage {
                attachEnergyFrom(my.discard, self)
              }
            }
          }
          move "Power Gem", {
            text "120 damage."
            energyCost C, C, C, C
            onAttack {
              damage 120
            }
          }

        };
      case SOLGALEO_87:
        return evolution (this, from:"Cosmoem", hp:HP160, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Shining Arrow", {
            text "This attack does 50 damage to one of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, C
            onAttack {
              damage 50, opp.all.select()
            }
          }
          move "Fangs of the Sunne", {
            text "170 damage. This Pokémon can't use Fangs of the Sunne during your next turn."
            energyCost M, M, C
            onAttack {
              damage 170
              cantUseAttack(thisMove, self)
            }
          }

        };
      case CLEFAIRY_88:
        return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Slap", {
            text "10 damage."
            energyCost Y
            onAttack {
              damage 10
            }
          }
          move "Follow Me", {
            text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
            energyCost C, C
            attackRequirement {
              assert opp.bench.notEmpty
            }
            onAttack {
              def pcs = opp.bench.select()
              targeted (pcs) {
                sw opp.active, pcs
              }
            }
          }

        };
      case CLEFABLE_89:
        return evolution (this, from:"Clefairy", hp:HP100, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Lullaby", {
            text "20 damage. Your opponent's Active Pokémon is now Asleep."
            energyCost C
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Meteor Mash", {
            text "60 damage. During your next turn, this Pokémon's Meteor Mash attack does 60 more damage (before applying Weakness and Resistance)."
            energyCost Y, C, C
            onAttack {
              damage 60
              increasedBaseDamageNextTurn("Meteor Mash", hp(60))
            }
          }

        };
      case COTTONEE_90:
        return basic (this, hp:HP050, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Continuous Tumble", {
            text "10× damage. Flip a coin until you get tails. This attack does 10 damage for each heads."
            energyCost C
            onAttack {
              flipUntilTails{damage 10}
            }
          }

        };
      case WHIMSICOTT_91:
        return evolution (this, from:"Cottonee", hp:HP080, type:FAIRY, retreatCost:0) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "The Wages of Fluff", {
            text "If the Defending Pokémon is Knocked Out during your next turn, take 2 more Prize cards."
            energyCost C
            onAttack {
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs, {
                  if(turnCount + 2 == bg.turnCount) {
                    bc "The Wages of Fluff kicks in"
                    bg.em().run(new TakePrize(self.owner, pcs))
                    bg.em().run(new TakePrize(self.owner, pcs))
                  }
                }
                after SWITCH, pcs, {unregister()}
                after EVOLVE, pcs, {unregister()}
                unregisterAfter 3
              }
            }
          }
          move "Fairy Wind", {
            text "30 damage."
            energyCost Y
            onAttack {
              damage 30
            }
          }

        };
      case SYLVEON_GX_92:
        return evolution (this, from:"Eevee", hp:HP200, type:FAIRY, retreatCost:2) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Magical Ribbon", {
            text "Search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck."
            energyCost Y
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.select(max: 3).moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Fairy Wind", {
            text "110 damage."
            energyCost Y, C, C
            onAttack {
              damage 110
            }
          }
          move "Plea GX", {
            text "Put 2 of your opponent's Benched Pokémon and all cards attached to them into your opponent's hand. (You can't use more than 1 GX attack in a game.)"
            energyCost Y, C, C
            attackRequirement {
              gxCheck()
              assert opp.bench.notEmpty
            }
            onAttack {
              gxPerform()
              multiSelect(opp.bench, 2).each{
                targeted(it){
                  it.cards.moveTo(opp.hand)
                  removePCS(it)
                }
              }
            }
          }

        };
      case COMFEY_93:
        return basic (this, hp:HP070, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          bwAbility "Flower Shield", {
            text "Each of your Pokémon that has any [Y] Energy attached to it can't be affected by any Special Conditions. Remove any Special Conditions affecting those Pokémon."
            def verdantWind={
              for(pcs in all){
                if(pcs.specialConditions && pcs.owner==self.owner && pcs.cards.energyCount(Y)){
                  bc "Flower Shield clears special conditions"
                  clearSpecialCondition(pcs, SRC_ABILITY)
                }
              }
            }
            delayedA {
              after ATTACH_ENERGY, {
                verdantWind()
              }
              after ENERGY_SWITCH, {
                verdantWind()
              }
              before APPLY_SPECIAL_CONDITION, {
                def pcs=e.getTarget(bg)
                if(pcs.owner==self.owner && pcs.cards.energyCount(Y)){
                  bc "Flower Shield prevents special conditions"
                  prevent()
                }
              }
            }
            onActivate {
              verdantWind()
            }
          }
          move "Sweet Kiss", {
            text "30 damage. Your opponent draws a card."
            energyCost Y, C
            onAttack {
              damage 30
              draw 1, TargetPlayer.OPPONENT
            }
          }

        };
      case GOOMY_94:
        return basic (this, hp:HP050, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          move "Bubble", {
            text "Flip a coin. If head, your opponent's Active Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {apply PARALYZED}
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost W, Y
            onAttack {
              damage 20
            }
          }

        };
      case SLIGGOO_95:
        return evolution (this, from:"Goomy", hp:HP070, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          move "Division", {
            text "Search your deck for up to 2 Sliggoo and put them onto your Bench. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert bench.notFull
              assert deck.notEmpty
            }
            onAttack {
              int count = Math.min(bench.freeBenchCount, 2)
              deck.search (max: count, "Search your deck for up to 2 Sliggoo and put them onto your Bench", {it.name=="Sliggoo"}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost W, Y
            onAttack {
              damage 20
            }
          }

        };
      case GOODRA_96:
        return evolution (this, from:"Sliggoo", hp:HP160, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          move "Power Whip", {
            text "This attack does 20 damage times the amount of Energy attached to this Pokémon to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            onAttack {
              damage 20*self.cards.energyCount(c), opp.all.select()
            }
          }
          move "Beat Slider", {
            text "130 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            energyCost W, Y, C
            onAttack {
              damage 130
              whirlwind()
            }
          }

        };
      case DRAMPA_97:
        return basic (this, hp:HP120, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          move "Amass", {
            text "Search your deck for a basic Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost C
            onAttack {
              attachEnergyFrom(basic: true, my.deck, self)
            }
          }
          move "Power Cyclone", {
            text "80 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 80
              afterDamage {
                moveEnergy(self, my.bench)
              }
            }
          }

        };
      case JANGMO_O_98:
        return basic (this, hp:HP060, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          bwAbility "Bulletproof", {
            text "This Pokémon takes 10 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {if(it.to==self && it.dmg.value && it.notNoEffect){
                  bc "Bulletproof -10"
                  it.dmg -= hp(10)
                }}
              }
            }
          }
          move "Dragon Claw", {
            text "30 damage."
            energyCost L, F
            onAttack {
              damage 30
            }
          }

        };
      case HAKAMO_O_99:
        return evolution (this, from:"Jangmo-o", hp:HP090, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          move "Headbutt", {
            text "30 damage."
            energyCost C
            onAttack {
              damage 30
            }
          }
          move "Dragon Claw", {
            text "80 damage."
            energyCost L, F, C
            onAttack {
              damage 80
            }
          }

        };
      case KOMMO_O_GX_100:
        return evolution (this, from:"Hakamo-o", hp:HP240, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          move "Adamantine Press", {
            text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }
          move "Shred", {
            text "130 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
            energyCost L, F, C, C
            onAttack {
              shredDamage 130
            }
          }
          move "Ultra Uppercut GX", {
            text "240 damage. You can't use more than 1 GX attack in a game."
            energyCost L, F, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              damage 240
              gxPerform()
            }
          }

        };
      case CHANSEY_101:
        return basic (this, hp:HP110, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Bind Wound", {
            text "Flip a coin. If heads, heal 30 damage from 1 of your Pokémon."
            energyCost C, C
            attackRequirement {
              assert my.all.findAll{it.numberOfDamageCounters}
            }
            onAttack {
              flip{heal 30, my.all.findAll{it.numberOfDamageCounters}.select()}
            }
          }
          move "Hammer In", {
            text "80 damage."
            energyCost C, C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case BLISSEY_102:
        return evolution (this, from:"Chansey", hp:HP160, type:COLORLESS, retreatCost:4) {
          weakness FIGHTING
          bwAbility "Fresh Egg", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may heal 80 damage from your Active Pokémon."
            onActivate{
              if(it==PLAY_FROM_HAND && my.active.numberOfDamageCounters && confirm("Use Fresh Egg?")){
                powerUsed()
                heal 80, my.active
              }
            }
          }
          move "Double Edge", {
            text "160 damage. This Pokémon does 80 damage to itself."
            energyCost C, C, C, C
            onAttack {
              damage 160
              damage 80,self
            }
          }

        };
      case TAILLOW_103:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Reckless Charge", {
            text "20 damage. This Pokémon does 10 damage to itself."
            energyCost C
            onAttack {
              damage 20
              damage 10,self
            }
          }

        };
      case SWELLOW_104:
        return evolution (this, from:"Taillow", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn."
            energyCost C
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }
          move "Swallow Dive", {
            text "40+ damage. If this Pokémon used Agility during your last turn, this attack does 80 more damage."
            energyCost C
            onAttack {
              damage 40
              increasedBaseDamageNextTurn("Agility", hp(80))
            }
          }

        };
      case CASTFORM_105:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Weather Teller", {
            text "Search your deck for up to 2 Stadium cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max:2, cardTypeFilter(STADIUM)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Water Pulse", {
            text "30 damage. You opponent's Active Pokémon is now Asleep."
            energyCost C, C
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }

        };
      case RAYQUAZA_106:
        return basic (this, hp:HP120, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Turbo Storm", {
            text "30 damage. Attach 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              afterDamage{
                if(my.bench){
                  def pcs = my.bench.select("Attach to?")
                  attachEnergyFrom(basic:true, my.discard, pcs)
                  attachEnergyFrom(basic:true, my.discard, pcs)
                }
              }
            }
          }
          move "Dragon Claw", {
            text "80 damage."
            energyCost C, C, C
            onAttack {
              damage 80
            }
          }

        };
      case PATRAT_107:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Glance", {
            text "Look at the top card of your opponent's deck."
            energyCost C
            attackRequirement {
              assert opp.deck.notEmpty
            }
            onAttack {
              opp.deck.subList(0,1).showToMe("Top card")
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
      case WATCHOG_108:
        return evolution (this, from:"Patrat", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Scrutinize", {
            text "Look at the top 2 cards of your opponent's deck, discard 1 of them, and put the other card back."
            energyCost C
            attackRequirement {
              assert opp.deck.notEmpty
            }
            onAttack {
              opp.deck.subList(0,2).select("Top 2 cards of opponent's deck. Discard 1 of them").discard()
            }
          }
          move "Slam", {
            text "60× damage. Flip 2 coins. This attack does 60 damage for each heads."
            energyCost C, C, C
            onAttack {
              flip 2,{damage 60}
            }
          }

        };
      case FLETCHLING_109:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Growl", {
            text "During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance)."
            energyCost C
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20),thisMove,defending)
            }
          }
          move "Flap", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case FLETCHINDER_110:
        return evolution (this, from:"Fletchling", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Flap", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Razor Wind", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip{damage 40}
            }
          }

        };
      case TALONFLAME_111:
        return evolution (this, from:"Fletchinder", hp:HP130, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Flame Charge", {
            text "30 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
            energyCost C
            onAttack {
              damage 30
              attachEnergyFrom(type:R, my.deck, self)
            }
          }
          move "Loop-the-Loop", {
            text "90 damage. Put all Energy attached to this Pokémon into your hand."
            energyCost C, C
            onAttack {
              damage 90
              afterDamage{
                self.cards.filterByType(ENERGY).moveTo(my.hand)
              }
            }
          }

        };
      case STUFFUL_112:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Tackle", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Hammer In", {
            text "60 damage."
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }

        };
      case BEWEAR_113:
        return evolution (this, from:"Stufful", hp:HP130, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          bwAbility "Rake It In", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may draw 3 cards."
            onActivate{
              if(it==PLAY_FROM_HAND && confirm("Use Rake It In?")){
                powerUsed()
                draw 3
              }
            }
          }
          move "Dangerous Blow", {
            text "60+ damage. If your opponent's Active Pokémon is a Basic Pokémon, this attack does 60 more damage."
            energyCost C, C, C
            onAttack {
              damage 60
              if(defending.basic) damage 60
            }
          }

        };
      case KOMALA_114:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          customAbility {
            delayedA {
              before ASLEEP_SPC, self, null, CHECK_ATTACK_REQUIREMENTS, {
                if(e.parentEvent.effect.move.name=="Hypno Roll")
                  prevent()
              }
            }
          }
          bwAbility "Comatose", {
            text "As long as this Pokémon is your Active Pokémon, whenever you attach an Energy from your hand to it, it is now Asleep."
            delayedA {
              after ATTACH_ENERGY, self, {
                if(self.active && ef.reason == PLAY_FROM_HAND){
                  bc "Comatose kicks in"
                  apply ASLEEP, self, SRC_ABILITY
                }
              }
            }
          }
          move "Hypno Roll", {
            text "100 damage. This attack can be used if this Pokémon is Asleep. If it is not Asleep, this attack does nothing."
            energyCost C, C, C
            attackRequirement {
              assert self.isSPC(ASLEEP) : "Not asleep"
            }
            onAttack {
              damage 100
            }
          }

        };
      case DRAMPA_GX_115:
        return basic (this, hp:HP180, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Righteous Edge", {
            text "20 damage. Discard a Special Energy from your opponent's Active Pokémon."
            energyCost C
            onAttack {
              damage 20
              afterDamage {
                discardDefendingSpecialEnergy(delegate)
              }
            }
          }
          move "Berserk", {
            text "80+ damage. If your Benched Pokémon have any damage counters on them, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 80
              if(my.bench.find{it.numberOfDamageCounters}) damage 70
            }
          }
          move "Big Wheel GX", {
            text "Shuffle your hand into your deck. Then, draw 10 cards. (You can't use more than 1 GX attack in a game.)"
            energyCost C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              my.hand.moveTo(hidden:true, my.deck)
              shuffleDeck()
              draw 10
            }
          }

        };
      case AETHER_PARADISE_CONSERVATION_AREA_116:
        return stadium (this) {
          text "Basic [G] and Basic [L] Pokémon (both yours and your opponent's) take 30 less damage from the opponent's attacks (after applying Weakness and Resistance).\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if((it.to.types.contains(G) || it.to.types.contains(L)) && it.to.basic && it.dmg.value && it.notNoEffect && it.from.owner != it.to.owner){
                    bc "Aether Paradise Convervation Area -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case ALTAR_OF_THE_MOONE_117:
        return stadium (this) {
          text "The Retreat Cost of each Pokémon (both yours and your opponent's) that has any [P] or [D] Energy attached to it is [C][C] less.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = getter (GET_RETREAT_COST) {Holder h->
              def pcs = h.effect.target
              if(pcs.cards.energyCount(P) + pcs.cards.energyCount(D) > 0){
                h.object -= 2
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case ALTAR_OF_THE_SUNNE_118:
        return stadium (this) {
          text "[R] Pokémon and [M] Pokémon (both yours and your opponent's) have no Weakness.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def eff
          onPlay {
            eff = getter (GET_WEAKNESSES) {h->
              if(h.effect.target.types.contains(R) || h.effect.target.types.contains(M)){
                h.object = []
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case AQUA_PATCH_119:
        return itemCard (this) {
          text "Attach a [W] Energy card from your discard pile to 1 of your Benched [W] Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            attachEnergyFrom(type: W, my.discard, my.bench.findAll {it.types.contains(W)})
          }
          playRequirement{
            assert my.discard.filterByEnergyType(W) && my.bench.findAll {it.types.contains(W)}
          }
        };
      case BROOKLET_HILL_120:
        return stadium (this) {
          text "Once during each player's turn, that player may search their deck for a Basic [W] Pokémon or Basic [F] Pokémon and, put it onto their Bench, and shuffle their deck.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Brooklet Hill") {
              assert my.deck
              assert my.bench.notFull
              assert lastTurn != bg().turnCount : "Already used"
              bc "Used Brooklet Hill effect"
              lastTurn = bg().turnCount
              deck.search {Card c->c.cardTypes.is(BASIC) && (c.asPokemonCard().types.contains(W) || c.asPokemonCard().types.contains(F))}.each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case CHOICE_BAND_121:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nThe attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active Pokémon-GX or Active Pokémon-EX (before applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
          def eff1
          onPlay {reason->
            eff1=delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && (it.to.pokemonGX || it.to.pokemonEX) && it.dmg.value){
                    it.dmg += hp(30)
                    bc "Choice Band +30"
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
          }
        };
      case ENERGY_LOTO_122:
        return itemCard (this) {
          text "Look at the top 7 cards of your deck. You may reveal an Energy card you find there and put it into your hand. Shuffle the other cards back into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            deck.subList(0,7).select(min:0, "You may reveal an Energy card you find there and put it into your hand", {it.cardTypes.isEnergy()}).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case ENERGY_RECYCLER_123:
        return itemCard (this) {
          text "Shuffle 5 basic Energy cards from your discard pile into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            my.discard.filterByType(BASIC_ENERGY).select(count: 5).moveTo(deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.filterByType(BASIC_ENERGY)
          }
        };
      case ENHANCED_HAMMER_124:
        return copy(PhantomForces.ENHANCED_HAMMER_94, this);
      case FIELD_BLOWER_125:
        return itemCard (this) {
          text "Choose up to 2 in any combination of Pokémon Tool cards and Stadium cards in play (yours or your opponent's) and discard them.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def i = 2
            while(i-- > 0){
              if (bg.stadiumInfoStruct && stadiumCanBeAffectedByItemAndSupporter() && confirm("Would you like to discard stadium in play (${bg.stadiumInfoStruct.stadiumCard})? If not, you can select a Pokemon Tool in play")) {
                discard bg.stadiumInfoStruct.stadiumCard
                continue
              }
              def tar = all.findAll {it.cards.hasType(POKEMON_TOOL)}
              if(tar) {
                def sel = tar.select("Select Pokemon to discard a Pokemon Tool from (cancel to stop)", i == 1)
                if(sel){
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
      case HALA_126:
        return supporter (this) {
          text "Shuffle your hand into your deck. If you have used your GX attack, draw 7 cards. If not, draw 4 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            shuffleDeck(hand.getExcludedList(thisCard))
            hand.removeAll(hand.getExcludedList(thisCard))
            draw(isGxPerformed() ? 7 : 4)
          }
          playRequirement{
          }
        };
      case MALLOW_127:
        return supporter (this) {
          text "Search your deck for 2 cards, shuffle your deck, and put those cards on top of your deck in any order.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def list = my.deck.select(count:2)
            list = rearrange(list)
            my.deck.removeAll(list)
            shuffleDeck()
            my.deck.addAll(0, list)
          }
          playRequirement{
            assert my.deck
          }
        };
      case MAX_POTION_128:
        return copy(EmergingPowers.MAX_POTION_94, this);
      case MULTI_SWITCH_129:
        return itemCard (this) {
          text "Move an Energy from 1 of your Benched Pokémon to your Active Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            moveEnergy(my.bench, my.active)
          }
          playRequirement{
            assert my.bench.find {it.cards.filterByType(ENERGY)}
          }
        };
      case RESCUE_STRETCHER_130:
        return itemCard (this) {
          text "Choose 1:\n" +
            "Put a Pokémon from your discard pile into your hand.\n" +
            "Shuffle 3 Pokémon from your discard pile into your deck.\n" +
            "You may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def cl=[1,2]
            def c=choose(cl,['Put a Pokémon from your discard pile into your hand', 'Shuffle 3 Pokémon from your discard pile into your deck'], "Choose 1")
            if(c==1){
              my.discard.filterByType(POKEMON).select("Put to hand").moveTo(my.hand)
            } else {
              my.discard.filterByType(POKEMON).select(count: 3, "Shuffle 3 to deck").moveTo(my.deck)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON)
          }
        };
      case TURTONATOR_GX_131:
        return copy (TURTONATOR_GX_18, this)
      case ALOLAN_NINETALES_GX_132:
        return copy (ALOLAN_NINETALES_GX_22, this)
      case WISHIWASHI_GX_133:
        return copy (WISHIWASHI_GX_38, this)
      case VIKAVOLT_GX_134:
        return copy (VIKAVOLT_GX_45, this)
      case TAPU_KOKO_GX_135:
        return copy (TAPU_KOKO_GX_47, this)
      case TOXAPEX_GX_136:
        return copy (TOXAPEX_GX_57, this)
      case TAPU_LELE_GX_137:
        return copy (TAPU_LELE_GX_60, this)
      case LYCANROC_GX_138:
        return copy (LYCANROC_GX_74, this)
      case METAGROSS_GX_139:
        return copy (METAGROSS_GX_85, this)
      case SYLVEON_GX_140:
        return copy (SYLVEON_GX_92, this)
      case KOMMO_O_GX_141:
        return copy (KOMMO_O_GX_100, this)
      case DRAMPA_GX_142:
        return copy (DRAMPA_GX_115, this)
      case HALA_143:
        return copy (HALA_126, this)
      case HAU_144:
        return copy(SunMoon.HAU_120, this)
      case MALLOW_145:
        return copy(MALLOW_127, this)
      case DECIDUEYE_GX_146:
        return copy (SunMoon.DECIDUEYE_GX_12, this)
      case INCINEROAR_GX_147:
        return copy (SunMoon.INCINEROAR_GX_27, this)
      case TURTONATOR_GX_148:
        return copy (TURTONATOR_GX_18, this)
      case PRIMARINA_GX_149:
        return copy (SunMoon.PRIMARINA_GX_42, this)
      case ALOLAN_NINETALES_GX_150:
        return copy (ALOLAN_NINETALES_GX_22, this)
      case WISHIWASHI_GX_151:
        return copy (WISHIWASHI_GX_38, this)
      case VIKAVOLT_GX_152:
        return copy (VIKAVOLT_GX_45, this)
      case TAPU_KOKO_GX_153:
        return copy (TAPU_KOKO_GX_47, this)
      case TOXAPEX_GX_154:
        return copy (TOXAPEX_GX_57, this)
      case TAPU_LELE_GX_155:
        return copy (TAPU_LELE_GX_60, this)
      case LYCANROC_GX_156:
        return copy (LYCANROC_GX_74, this)
      case METAGROSS_GX_157:
        return copy (METAGROSS_GX_85, this)
      case SYLVEON_GX_158:
        return copy (SYLVEON_GX_92, this)
      case KOMMO_O_GX_159:
        return copy (KOMMO_O_GX_100, this)
      case DRAMPA_GX_160:
        return copy (DRAMPA_GX_115, this)
      case AQUA_PATCH_161:
        return copy (AQUA_PATCH_119, this)
      case ENHANCED_HAMMER_162:
        return copy (ENHANCED_HAMMER_124, this)
      case FIELD_BLOWER_163:
        return copy (FIELD_BLOWER_125, this)
      case MAX_POTION_164:
        return copy (MAX_POTION_128, this)
      case RARE_CANDY_165:
        return copy(DarkExplorers.RARE_CANDY_100, this)
      case DOUBLE_COLORLESS_ENERGY_166:
        return copy(Xy.DOUBLE_COLORLESS_ENERGY_130, this)
      case GRASS_ENERGY_167:
        return basicEnergy (this, G);
      case LIGHTNING_ENERGY_168:
        return basicEnergy (this, L);
      case FIGHTING_ENERGY_169:
        return basicEnergy (this, F);
      default:
        return null;
    }
  }

}
