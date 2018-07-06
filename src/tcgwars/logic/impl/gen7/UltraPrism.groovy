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
 * @author thebellis618@gmail.com
 * @author axpendix@hotmail.com
 */
public enum UltraPrism implements CardInfo {

  EXEGGCUTE_1 ("Exeggcute", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  YANMA_2 ("Yanma", 2, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  YANMEGA_3 ("Yanmega", 3, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ROSELIA_4 ("Roselia", 4, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ROSERADE_5 ("Roserade", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TURTWIG_6 ("Turtwig", 6, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TURTWIG_7 ("Turtwig", 7, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GROTLE_8 ("Grotle", 8, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TORTERRA_9 ("Torterra", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CHERUBI_10 ("Cherubi", 10, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHERRIM_11 ("Cherrim", 11, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CARNIVINE_12 ("Carnivine", 12, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LEAFEON_GX_13 ("Leafeon-GX", 13, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  MOW_ROTOM_14 ("Mow Rotom", 14, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SHAYMIN_15 ("Shaymin", 15, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  DEWPIDER_16 ("Dewpider", 16, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ARAQUANID_17 ("Araquanid", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MAGMAR_18 ("Magmar", 18, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MAGMORTAR_19 ("Magmortar", 19, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHIMCHAR_20 ("Chimchar", 20, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHIMCHAR_21 ("Chimchar", 21, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MONFERNO_22 ("Monferno", 22, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  INFERNAPE_23 ("Infernape", 23, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  HEAT_ROTOM_24 ("Heat Rotom", 24, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  SALANDIT_25 ("Salandit", 25, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SALAZZLE_26 ("Salazzle", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  TURTONATOR_27 ("Turtonator", 27, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  ALOLAN_SANDSHREW_28 ("Alolan Sandshrew", 28, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ALOLAN_SANDSLASH_29 ("Alolan Sandslash", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ALOLAN_VULPIX_30 ("Alolan Vulpix", 30, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PIPLUP_31 ("Piplup", 31, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PIPLUP_32 ("Piplup", 32, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PRINPLUP_33 ("Prinplup", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  EMPOLEON_34 ("Empoleon", 34, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  BUIZEL_35 ("Buizel", 35, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FLOATZEL_36 ("Floatzel", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SNOVER_37 ("Snover", 37, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ABOMASNOW_38 ("Abomasnow", 38, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GLACEON_GX_39 ("Glaceon-GX", 39, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  WASH_ROTOM_40 ("Wash Rotom", 40, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  FROST_ROTOM_41 ("Frost Rotom", 41, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MANAPHY_42 ("Manaphy", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  ELECTABUZZ_43 ("Electabuzz", 43, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTIVIRE_44 ("Electivire", 44, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SHINX_45 ("Shinx", 45, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SHINX_46 ("Shinx", 46, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  LUXIO_47 ("Luxio", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LUXRAY_48 ("Luxray", 48, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  PACHIRISU_49 ("Pachirisu", 49, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ROTOM_50 ("Rotom", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  DRIFLOON_51 ("Drifloon", 51, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DRIFBLIM_52 ("Drifblim", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SPIRITOMB_53 ("Spiritomb", 53, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SKORUPI_54 ("Skorupi", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DRAPION_55 ("Drapion", 55, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CROAGUNK_56 ("Croagunk", 56, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  TOXICROAK_57 ("Toxicroak", 57, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GIRATINA_PRISM_STAR_58 ("Giratina Prism Star", 58, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _PSYCHIC_]),
  CRESSELIA_59 ("Cresselia", 59, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  COSMOG_60 ("Cosmog", 60, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  COSMOEM_61 ("Cosmoem", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LUNALA_PRISM_STAR_62 ("Lunala Prism Star", 62, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DAWN_WINGS_NECROZMA_GX_63 ("Dawn Wings Necrozma-GX", 63, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, PRISM_STAR, ULTRA_BEAST, _PSYCHIC_]),
  CRANIDOS_64 ("Cranidos", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RAMPARDOS_65 ("Rampardos", 65, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  RIOLU_66 ("Riolu", 66, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LUCARIO_67 ("Lucario", 67, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HIPPOPOTAS_68 ("Hippopotas", 68, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HIPPOWDON_69 ("Hippowdon", 69, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PASSIMIAN_70 ("Passimian", 70, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MURKROW_71 ("Murkrow", 71, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  HONCHKROW_72 ("Honchkrow", 72, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SNEASEL_73 ("Sneasel", 73, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  WEAVILE_74 ("Weavile", 74, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  STUNKY_75 ("Stunky", 75, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SKUNTANK_76 ("Skuntank", 76, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARKRAI_PRISM_STAR_77 ("Darkrai Prism Star", 77, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _DARKNESS_]),
  ALOLAN_DIGLETT_78 ("Alolan Diglett", 78, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  ALOLAN_DUGTRIO_79 ("Alolan Dugtrio", 79, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGNEMITE_80 ("Magnemite", 80, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MAGNEMITE_81 ("Magnemite", 81, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  MAGNETON_82 ("Magneton", 82, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGNEZONE_83 ("Magnezone", 83, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  SHIELDON_84 ("Shieldon", 84, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  BASTIODON_85 ("Bastiodon", 85, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  BRONZOR_86 ("Bronzor", 86, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BRONZONG_87 ("Bronzong", 87, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  HEATRAN_88 ("Heatran", 88, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  SOLGALEO_PRISM_STAR_89 ("Solgaleo Prism Star", 89, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _METAL_]),
  DUSK_MANE_NECROZMA_GX_90 ("Dusk Mane Necrozma-GX", 90, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  MAGEARNA_91 ("Magearna", 91, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  MORELULL_92 ("Morelull", 92, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  SHIINOTIC_93 ("Shiinotic", 93, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  TAPU_LELE_94 ("Tapu Lele", 94, Rarity.RARE, [BASIC, POKEMON, _FAIRY_]),
  ALOLAN_EXEGGUTOR_95 ("Alolan Exeggutor", 95, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  GIBLE_96 ("Gible", 96, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  GIBLE_97 ("Gible", 97, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  GABITE_98 ("Gabite", 98, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  GARCHOMP_99 ("Garchomp", 99, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DRAGON_]),
  DIALGA_GX_100 ("Dialga-GX", 100, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  PALKIA_GX_101 ("Palkia-GX", 101, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  LICKITUNG_102 ("Lickitung", 102, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  LICKILICKY_103 ("Lickilicky", 103, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  EEVEE_104 ("Eevee", 104, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EEVEE_105 ("Eevee", 105, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BUNEARY_106 ("Buneary", 106, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  LOPUNNY_107 ("Lopunny", 107, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GLAMEOW_108 ("Glameow", 108, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PURUGLY_109 ("Purugly", 109, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FAN_ROTOM_110 ("Fan Rotom", 110, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  SHAYMIN_111 ("Shaymin", 111, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  YUNGOOS_112 ("Yungoos", 112, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GUMSHOOS_113 ("Gumshoos", 113, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ORANGURU_114 ("Oranguru", 114, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  TYPE__NULL_115 ("Type: Null", 115, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  SILVALLY_GX_116 ("Silvally-GX", 116, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
  DRAMPA_117 ("Drampa", 117, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  ANCIENT_CRYSTAL_118 ("Ancient Crystal", 118, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM,  TRAINER]),
  CYNTHIA_119 ("Cynthia", 119, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  CYRUS_PRISM_STAR_120 ("Cyrus Prism Star", 120, Rarity.HOLORARE, [SUPPORTER, TRAINER, PRISM_STAR]),
  ELECTRIC_MEMORY_121 ("Electric Memory", 121, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM,  TRAINER]),
  ESCAPE_BOARD_122 ("Escape Board", 122, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM, TRAINER]),
  FIRE_MEMORY_123 ("Fire Memory", 123, Rarity.UNCOMMON, [POKEMON_TOOL, ITEM,  TRAINER]),
  GARDENIA_124 ("Gardenia", 124, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LILLIE_125 ("Lillie", 125, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LOOKER_126 ("Looker", 126, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LOOKER_WHISTLE_127 ("Looker Whistle", 127, Rarity.UNCOMMON, [ITEM, TRAINER]),
  MARS_128 ("Mars", 128, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  MISSING_CLOVER_129 ("Missing Clover", 129, Rarity.UNCOMMON, [ITEM, TRAINER]),
  MT__CORONET_130 ("Mt. Coronet", 130, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  ORDER_PAD_131 ("Order Pad", 131, Rarity.UNCOMMON, [ITEM, TRAINER]),
  PAL_PAD_132 ("Pal Pad", 132, Rarity.UNCOMMON, [ITEM, TRAINER]),
  POKEMON_FAN_CLUB_133 ("Pokémon Fan Club", 133, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  UNIDENTIFIED_FOSSIL_134 ("Unidentified Fossil", 134, Rarity.UNCOMMON, [ITEM, TRAINER]),
  VOLKNER_135 ("Volkner", 135, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  SUPER_BOOST_ENERGY_PRISM_STAR_136 ("Super Boost Energy Prism Star", 136, Rarity.HOLORARE, [SPECIAL_ENERGY, ENERGY, PRISM_STAR]),
  UNIT_ENERGY_GRW_137 ("Unit Energy GRW", 137, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  UNIT_ENERGY_LPM_138 ("Unit Energy LPM", 138, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  LEAFEON_GX_139 ("Leafeon-GX", 139, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  PHEROMOSA_GX_140 ("Pheromosa-GX", 140, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _GRASS_]),
  GLACEON_GX_141 ("Glaceon-GX", 141, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, ULTRA_BEAST, _WATER_]),
  XURKITREE_GX_142 ("Xurkitree-GX", 142, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _LIGHTNING_]),
  DAWN_WINGS_NECROZMA_GX_143 ("Dawn Wings Necrozma-GX", 143, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  CELESTEELA_GX_144 ("Celesteela-GX", 144, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  DUSK_MANE_NECROZMA_GX_145 ("Dusk Mane Necrozma-GX", 145, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  DIALGA_GX_146 ("Dialga-GX", 146, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  PALKIA_GX_147 ("Palkia-GX", 147, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  CYNTHIA_148 ("Cynthia", 148, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  GARDENIA_149 ("Gardenia", 149, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LANA_150 ("Lana", 150, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LILLIE_151 ("Lillie", 151, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LOOKER_152 ("Looker", 152, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LUSAMINE_153 ("Lusamine", 153, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  MARS_154 ("Mars", 154, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  POKEMON_FAN_CLUB_155 ("Pokémon Fan Club", 155, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  VOLKNER_156 ("Volkner", 156, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  LEAFEON_GX_157 ("Leafeon-GX", 157, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
  PHEROMOSA_GX_158 ("Pheromosa-GX", 158, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _GRASS_]),
  GLACEON_GX_159 ("Glaceon-GX", 159, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, ULTRA_BEAST, _WATER_]),
  XURKITREE_GX_160 ("Xurkitree-GX", 160, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _LIGHTNING_]),
  DAWN_WINGS_NECROZMA_GX_161 ("Dawn Wings Necrozma-GX", 161, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  CELESTEELA_GX_162 ("Celesteela-GX", 162, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  DUSK_MANE_NECROZMA_GX_163 ("Dusk Mane Necrozma-GX", 163, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _METAL_]),
  DIALGA_GX_164 ("Dialga-GX", 164, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  PALKIA_GX_165 ("Palkia-GX", 165, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _DRAGON_]),
  CRUSHING_HAMMER_166 ("Crushing Hammer", 166, Rarity.SECRET, [ITEM, TRAINER]),
  ESCAPE_BOARD_167 ("Escape Board", 167, Rarity.SECRET, [POKEMON_TOOL, ITEM, TRAINER]),
  MISSING_CLOVER_168 ("Missing Clover", 168, Rarity.SECRET, [ITEM, TRAINER]),
  PEEKING_RED_CARD_169 ("Peeking Red Card", 169, Rarity.SECRET, [ITEM, TRAINER]),
  UNIT_ENERGY_GRW_170 ("Unit Energy GRW", 170, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]),
  UNIT_ENERGY_LPM_171 ("Unit Energy LPM", 171, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]),
  LUNALA_GX_172 ("Lunala-GX", 172, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
  SOLGALEO_GX_173 ("Solgaleo-GX", 173, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  UltraPrism(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.ULTRA_PRISM;
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
      case EXEGGCUTE_1:
      return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Continuous Eggsplosion", {
          text "20× damage. Flip a coin until you get tails. This attack does 20 damage for each heads."
          energyCost G
          onAttack {
            flipUntilTails{damage 20}
          }
        }

      };
      case YANMA_2:
      return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Super Speed", {
          text "20 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
          energyCost C, C
          onAttack {
            damage 20
            flip{preventAllEffectsNextTurn()}
          }
        }

      };
      case YANMEGA_3:
      return evolution (this, from:"Yanma", hp:HP120, type:GRASS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Supersonic", {
          text "30 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost G
          onAttack {
            damage 30
            afterDamage {
              apply CONFUSED
            }
          }
        }
        move "Cutting Wind", {
          text "120 damage."
          energyCost C, C, C, C
          onAttack {
            damage 120
          }
        }

      };
      case ROSELIA_4:
      return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Petal Dance", {
          text "30× damage. Flip 3 coins. This attack does 30 damage for each heads. This Pokémon is now Confused."
          energyCost G, C
          onAttack {
            flip 3,{damage 30}
            afterDamage {apply CONFUSED, self}
          }
        }

      };
      case ROSERADE_5:
      return evolution (this, from:"Roselia", hp:HP100, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Inviting Poison", {
          text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Poisoned."
          energyCost G
          attackRequirement {
            assert opp.bench.notEmpty
          }
          onAttack {
            def pcs = opp.bench.select("Switch")
            targeted(pcs) {
              sw opp.active, pcs
              apply POISONED, pcs
            }
          }
        }
        move "Flower Tornado", {
          text "100 damage. Move any number of [G] Energy from your Pokémon to your other Pokémon in any way you like."
          energyCost G, G, C
          onAttack {
            damage 100
            while(1){
              def pl=(my.all.findAll {it.cards.energyCount(G)})
              if(!pl) break;
              def src =pl.select("Source for energy (cancel to stop)", false)
              if(!src) break;
              def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()
              def tar=my.all.select("Target for energy (cancel to stop)", false)
              if(!tar) break;
              energySwitch(src, tar, card)
            }
          }
        }
      };
      case TURTWIG_6:
      return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
        weakness FIRE
        move "Synthesis", {
          text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck."
          energyCost G
          attackRequirement {
            assert my.deck
          }
          onAttack {
            my.deck.search(count : 1, "Search for a [G] Energy card" ,basicEnergyFilter(G)).each {attachEnergy(my.all.select(),it)}
            shuffleDeck()
          }
        }
        move "Headbutt Bounce", {
          text "30 damage."
          energyCost G, C
          onAttack {
            damage 30
          }
        }

      };
      case TURTWIG_7:
      return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
        weakness FIRE
        move "Tackle", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }
        move "Razor Leaf", {
          text "50 damage."
          energyCost G, G, C
          onAttack {
            damage 50
          }
        }

      };
      case GROTLE_8:
      return evolution (this, from:"Turtwig", hp:HP110, type:GRASS, retreatCost:4) {
        weakness FIRE
        move "Mega Drain", {
          text "30 damage. Heal 30 damage from this Pokémon."
          energyCost G, C
          onAttack {
            damage 30
            afterDamage {heal 30,self}
          }
        }
        move "Razor Leaf", {
          text "80 damage."
          energyCost G, G, G, C
          onAttack {
            damage 80
          }
        }

      };
      case TORTERRA_9:
      return evolution (this, from:"Grotle", hp:HP180, type:GRASS, retreatCost:4) {
        weakness FIRE
        move "Giga Drain", {
          text "50 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
          energyCost G, G, C
          onAttack {
            damage 50
            removeDamageCounterEqualToDamageDone()
          }
        }
        move "Earthquake", {
          text "180 damage. This attack does 20 damage to each of your Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost G, G, G, C
          onAttack {
            damage 180
            my.bench.each {damage 20, it}
          }
        }

      };
      case CHERUBI_10:
      return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Surprise Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost G
          onAttack {
            flip {damage 30}
          }
        }

      };
      case CHERRIM_11:
      return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
        weakness FIRE
        bwAbility "Weather Guard", {
          text "Your [G] Pokémon have no Weakness."
          getterA GET_WEAKNESSES, { h ->
            if (h.effect.target.types.contains(G) && h.effect.target.owner == self.owner) {
              h.object.clear()
            }
          }
        }
        move "Seed Bomb", {
          text "30 damage."
          energyCost G
          onAttack {
            damage 30
          }
        }

      };
      case CARNIVINE_12:
      return basic (this, hp:HP090, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Chomp Chomp", {
          text "20 damage. Heal 20 damage from this Pokémon."
          energyCost C, C
          onAttack {
            damage 20
            healAfterDamage(20, self)
          }
        }
        move "Loom Over", {
          text "90- damage. This attack does 10 less damage for each damage counter on this Pokémon."
          energyCost G, G
          onAttack {
            damage 90 - 10*self.numberOfDamageCounters
          }
        }

      };
      case LEAFEON_GX_13:
      return evolution (this, from:"Eevee", hp:HP200, type:GRASS, retreatCost:2) {
        weakness FIRE
        bwAbility "Breath of the Leaves", {
          text "If this Pokémon is your Active Pokémon, once during your turn (before your attack), you may heal 50 damage from 1 of your Pokémon that has any Energy attached to it."
          actionA {
            checkLastTurn() // check whether it has already been used this turn
            assert self.active : "Leafeon GX is not your active pokemon"
            def tar = my.all.findAll{it.numberOfDamageCounters && it.cards.energyCount(C)}
            assert tar

            // power is going through
            powerUsed()

            // now do the main effect:
            heal 50, tar.select(), SRC_ABILITY

          }
        }
        move "Solar Beam", {
          text "110 damage."
          energyCost G, C, C
          onAttack {
            damage 110
          }
        }
        move "Grand Bloom GX", {
          text "For each of your Benched Basic Pokémon, search your deck for a card that evolves from that Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck. (You can’t use more than 1 GX attack in a game.)"
          energyCost G
          attackRequirement {
            gxCheck()
            assert my.bench.notEmpty : "This is your only pokemon"
            assert my.deck.notEmpty
          }
          onAttack {
            gxPerform()
            my.bench.findAll{it.basic}.each{pcs->
              def nam = pcs.name
              def sel=self.owner.pbg.deck.search(count:1, "Search for a card that evolve from $nam",
                          {it.cardTypes.is(EVOLUTION) && it.predecessor==pcs.name})
              if(sel){
                evolve(pcs, sel.first(), OTHER)
              }
            }
            shuffleDeck()
          }
        }

      };
      case MOW_ROTOM_14:
      return basic (this, hp:HP090, type:GRASS, retreatCost:1) {
        weakness FIRE
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, NORMAL,self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.clear()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Special Mow", {
          text "60 damage. Discard a Special Energy from your opponent’s Active Pokémon."
          energyCost G, C, C
          onAttack {
            damage 60
            discardDefendingSpecialEnergy(delegate)
          }
        }

      };
      case SHAYMIN_15:
      return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Coax", {
          text "Search your deck for up to 3 Basic Pokémon of different types and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            my.bench.notFull
          }
          onAttack {
            my.deck.select(min:0, max:3, "Select up to 3 Basic Pokémon of different types", cardTypeFilter(BASIC), self.owner,
              {CardList list->
                TypeSet typeSet=new TypeSet()
                for(card in list){
                  if(typeSet.containsAny(card.asPokemonCard().types)){
                    return false
                  }
                  typeSet.addAll(card.asPokemonCard().types)
                }
                return true
              }).each {
                my.deck.remove(it)
                benchPCS(it)
              }
            shuffleDeck()
          }
        }
        move "Soothing Scent", {
          text "30 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost G, C
          onAttack {
            damage 30
            applyAfterDamage ASLEEP
          }
        }

      };
      case DEWPIDER_16:
      return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Bubble", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost G
          onAttack {
            damage 10
            flip {apply PARALYZED}
          }
        }

      };
      case ARAQUANID_17:
      return evolution (this, from:"Dewpider", hp:HP100, type:GRASS, retreatCost:2) {
        weakness FIRE
        bwAbility "Water Bubble", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent’s [R] Pokémon."
          delayedA {
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each {
								if(it.to == self && it.from.types.contains(R) && it.dmg.value && it.notNoEffect) {
									bc "Water Bubble prevents damage from Fire Pokémon"
									it.dmg = hp(0)
								}
							}
						}
					}
        }
        move "Aqua Edge", {
          text "70 damage."
          energyCost G, C, C
          onAttack {
            damage 70
          }
        }

      };
      case MAGMAR_18:
      return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
        weakness WATER
        move "Controlled Burn", {
          text "Discard the top card of your opponent’s deck."
          energyCost R
          attackRequirement {
            assert opp.deck
          }
          onAttack {
            discard opp.deck.first()
          }
        }
        move "Flamethrower", {
          text "80 damage. Discard an Energy from this Pokémon."
          energyCost R, R, C
          onAttack {
            damage 80
            discardSelfEnergy(C)
          }
        }

      };
      case MAGMORTAR_19:
      return evolution (this, from:"Magmar", hp:HP130, type:FIRE, retreatCost:3) {
        weakness WATER
        bwAbility "Incandescent Body", {
          text "If this Pokémon is your Active Pokémon and is damaged by an opponent’s attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Burned."
          damage 20
          delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                bc "Incandescent Body burns attacker"
                bg.dm().each{apply BURNED, it.from}
              }
            }
          }
        }
        move "Fire Blaster", {
          text "80+ damage. You may discard 2 Energy from this Pokémon. If you do, this attack does 80 more damage."
          energyCost R, R, C
          onAttack {
            damage 80
            if(confirm("You may discard 2 Energy from this Pokémon. If you do, this attack does 80 more damage.")){
              discardSelfEnergy C, C //This isn't after the damage, right?
              damage 80
            }
          }
        }

      };
      case CHIMCHAR_20:
      return basic (this, hp:HP040, type:FIRE, retreatCost:0) {
        weakness WATER
        move "Flare", {
          text "20 damage."
          energyCost R
          onAttack {
            damage 20
          }
        }

      };
      case CHIMCHAR_21:
      return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
        weakness WATER
        move "Fury Swipes", {
          text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
          energyCost C
          onAttack {
            flip 3,{damage 10}
          }
        }

      };
      case MONFERNO_22:
      return evolution (this, from:"Chimchar", hp:HP080, type:FIRE, retreatCost:1) {
        weakness WATER
        move "Super Singe", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 20
            applyAfterDamage(BURNED)
          }
        }

      };
      case INFERNAPE_23:
      return evolution (this, from:"Monferno", hp:HP130, type:FIRE, retreatCost:1) {
        weakness WATER
        bwAbility "Flaming Fighter", {
          text "Put 6 damage counters instead of 2 on your opponent’s Burned Pokémon between turns."
          getterA (GET_BURN_DAMAGE) {h->
            if(h.effect.target.owner != self.owner){
              bc "Flaming Fighter increases burn damage to 60"
              h.object = hp(60)
            }
          }
        }
        move "Burst Punch", {
          text "50 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C
          onAttack {
            damage 50
            applyAfterDamage(BURNED)
          }
        }

      };
      case HEAT_ROTOM_24:
      return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
        weakness WATER
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.retainAll()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Heat Blast", {
          text "80 damage."
          energyCost R, C, C
          onAttack {
            damage 80
          }
        }

      };
      case SALANDIT_25:
      return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
        weakness WATER
        move "Live Coal", {
          text "10 damage."
          energyCost R
          onAttack {
            damage 10
          }
        }
        move "Combustion", {
          text "30 damage."
          energyCost R, C
          onAttack {
            damage 30
          }
        }

      };
      case SALAZZLE_26:
      return evolution (this, from:"Salandit", hp:HP110, type:FIRE, retreatCost:1) {
        weakness WATER
        move "Panic Poison", {
          text "Your opponent’s Active Pokémon is now Burned, Confused, and Poisoned."
          energyCost R
          onAttack {
            afterDamage {
              apply BURNED
              apply CONFUSED
              apply POISONED
            }
          }
        }
        move "Hunter’s Nails", {
          text "60+ damage. If your opponent’s Active Pokémon is affected by a Special Condition, this attack does 60 more damage."
          energyCost R, C
          onAttack {
            damage 60
            if(defending.specialConditions){
              damage 60
            }
          }
        }

      };
      case TURTONATOR_27:
      return basic (this, hp:HP130, type:FIRE, retreatCost:4) {
        weakness WATER
        move "Searing Flame", {
          text "10 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          onAttack {
            damage 10
            applyAfterDamage(BURNED)
          }
        }
        move "Steam Artillery", {
          text "100 damage."
          energyCost R, C, C, C
          onAttack {
            damage 100
          }
        }

      };
      case ALOLAN_SANDSHREW_28:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness METAL
        move "Fury Swipes", {
          text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
          onAttack {
            flip 3,{damage 10}
          }
        }

      };
      case ALOLAN_SANDSLASH_29:
      return evolution (this, from:"Alolan Sandshrew", hp:HP120, type:WATER, retreatCost:1) {
        weakness METAL
        move "Spike Armor", {
          text "30 damage. During your opponent’s next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out), put 6 damage counters on the Attacking Pokémon."
          onAttack {
            damage 30
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Spike Armor activates"
                  directDamage(60, ef.attacker as PokemonCardSet)
                }
              }
              unregisterAfter 2
              after SWITCH, self, {unregister()}
            }
          }
        }
        move "Frost Breath", {
          text "90 damage."
          energyCost W, C, C
          onAttack {
            damage 90
          }
        }

      };
      case ALOLAN_VULPIX_30:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness METAL
        move "Roar", {
          text "Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          onAttack {
            whirlwind()
          }
        }
        move "Icy Snow", {
          text "10 damage."
          energyCost W
          onAttack {
            damage 10
          }
        }

      };
      case PIPLUP_31:
      return basic (this, hp:HP060, type:WATER, retreatCost:1) {
        weakness LIGHTNING
        move "Splatter", {
          text "This attack does 20 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          onAttack {
            damage 20,opp.all.select()
          }
        }

      };
      case PIPLUP_32:
      return basic (this, hp:HP070, type:WATER, retreatCost:1) {
        weakness LIGHTNING
        move "Peck", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }
        move "Wave Splash", {
          text "20 damage."
          energyCost W, C
          onAttack {
            damage 20
          }
        }

      };
      case PRINPLUP_33:
      return evolution (this, from:"Piplup", hp:HP090, type:WATER, retreatCost:2) {
        weakness LIGHTNING
        move "Bubble Beam", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          onAttack {
            damage 20
            flip{applyAfterDamage(PARALYZED)}
          }
        }
        move "Wave Splash", {
          text "40 damage."
          energyCost W, C
          onAttack {
            damage 40
          }
        }

      };
      case EMPOLEON_34:
      return evolution (this, from:"Prinplup", hp:HP160, type:WATER, retreatCost:2) {
        weakness LIGHTNING
        move "Total Command", {
          text "20× damage. This attack does 20 damage for each Benched Pokémon (both yours and your opponent’s)."
          energyCost W, C
          onAttack {
            damage 20*(my.bench.size()+opp.bench.size())
          }
        }
        move "Whirlpool", {
          text "90 damage. Discard an Energy from your opponent’s Active Pokémon."
          energyCost W, W, C
          onAttack {
            damage 90
            discardDefendingEnergy()
          }
        }

      };
      case BUIZEL_35:
      return basic (this, hp:HP070, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Water Gun", {
          text "30 damage."
          energyCost W, C
          onAttack {
            damage 30
          }
        }

      };
      case FLOATZEL_36:
      return evolution (this, from:"Buizel", hp:HP100, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Agility", {
          text "30 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
          energyCost W
          onAttack {
            damage 30
            flip{preventAllEffectsNextTurn()}
          }
        }
        move "Aqua Blast", {
          text "80 damage. Discard a [W] Energy from this Pokémon."
          energyCost W, C
          onAttack {
            damage 80
            discardSelfEnergy W
          }
        }

      };
      case SNOVER_37:
      return basic (this, hp:HP080, type:WATER, retreatCost:3) {
        weakness METAL
        move "Ice Shard", {
          text "20+ damage. If your opponent’s Active Pokémon is a [F] Pokémon, this attack does 40 more damage."
          energyCost W, C
          onAttack {
            damage 20
            if(defending.types.contains(F)) damage 40
          }
        }

      };
      case ABOMASNOW_38:
      return evolution (this, from:"Snover", hp:HP130, type:WATER, retreatCost:3) {
        weakness METAL
        bwAbility "Blessings of the Frost", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may attach a [W] Energy card from your discard pile to 1 of your Pokémon."
          onActivate {reason ->
            if(reason == PLAY_FROM_HAND && confirm("Blessings of the Frost")){
              powerUsed()
              attachEnergyFrom(type:W,my.discard,my.all.select())
            }
          }
        }
        move "Hypno Hammer", {
          text "80 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost W, C, C, C
          onAttack {
            damage 80
            applyAfterDamage ASLEEP
          }
        }

      };
      case GLACEON_GX_39:
      return evolution (this, from:"Eevee", hp:HP200, type:WATER, retreatCost:2) {
        weakness METAL
        bwAbility "Freezing Gaze", {
          text "As long as this Pokémon is your Active Pokémon, your opponent’s Pokémon-GX and Pokémon-EX in play, in their hand, and in their discard pile have no Abilities, except for Freezing Gaze."
          def effect1
          def effect2
          onActivate {
            effect1 = getter IS_ABILITY_BLOCKED, { Holder h->
              if (self.active && h.effect.ability.name != "Freezing Gaze" && h.effect.target.owner != self.owner && (h.effect.target.pokemonEX || h.effect.target.pokemonGX) && h.effect.ability instanceof BwAbility) {
                h.object=true
              }
            }
            effect2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
              if (self.active && h.effect.target.player != self.player && ((h.effect.target as Card).cardTypes.is(POKEMON_EX) || (h.effect.target as Card).cardTypes.is(POKEMON_GX))) {
                h.object=true
              }
            }
          }
          onDeactivate {
            effect1.unregister()
            effect2.unregister()
          }
        }
        move "Frost Bullet", {
          text "90 damage. This attack does 30 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          onAttack {
            damage 90
            if(opp.bench) damage 30, opp.bench.select('30 damage')
          }
        }
        move "Polar Spear GX", {
          text "50× damage. This attack does 50 damage for each damage counter on your opponent’s Active Pokémon. (You can’t use more than 1 GX attack in a game.)"
          energyCost W, C, C
          onAttack {
            gxPerform()
            damage 50*defending.numberOfDamageCounters
          }
        }

      };
      case WASH_ROTOM_40:
      return basic (this, hp:HP090, type:WATER, retreatCost:1) {
        weakness GRASS
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.retainAll()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Wash Arrow", {
          text "This attack does 50 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {
            assert opp.bench.notEmpty
          }
          onAttack {
            damage 50, opp.bench.select()
          }
        }

      };
      case FROST_ROTOM_41:
      return basic (this, hp:HP090, type:WATER, retreatCost:1) {
        weakness METAL
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.retainAll()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Frost Crush", {
          text "10+ damage. This attack does 20 more damage times the amount of Energy attached to all of your opponent’s Pokémon."
          energyCost W, C
          onAttack {
            int c=0
            opp.all.each {c+=it.cards.energyCount(C)}
            damage 10+20*c
          }
        }

      };
      case MANAPHY_42:
      return basic (this, hp:HP070, type:WATER, retreatCost:1) {
        weakness GRASS
        move "Deep Currents", {
          text "Shuffle 5 [W] Energy cards from your discard pile into your deck."
          energyCost W
          attackRequirement {
            assert my.discard.filterByEnergyType(WATER)
          }
          onAttack {
            my.discard.filterByEnergyType(WATER).select(count: 5).moveTo(my.deck)
            shuffleDeck()
          }
        }
        move "Water Pulse", {
          text "20 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost W
          onAttack {
            damage 20
            applyAfterDamage ASLEEP
          }
        }

      };
      case ELECTABUZZ_43:
      return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Low Kick", {
          text "30 damage."
          energyCost L, C
          onAttack {
            damage 30
          }
        }
        move "Thunder", {
          text "90 damage. This Pokémon does 30 damage to itself."
          energyCost L, L, C
          onAttack {
            damage 90
            damage 30,self
          }
        }

      };
      case ELECTIVIRE_44:
      return evolution (this, from:"Electabuzz", hp:HP140, type:LIGHTNING, retreatCost:4) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Steel Short", {
          text "60 damage. If your opponent’s Active Pokémon is a [M] Pokémon, it is now Paralyzed."
          energyCost L, C, C
          onAttack {
            damage 60
            if(defending.types.contains(M)) applyAfterDamage PARALYZED
          }
        }
        move "Volt Knuckle", {
          text "130 damage."
          energyCost L, L, C, C
          onAttack {
            damage 130
          }
        }

      };
      case SHINX_45:
      return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        bwAbility "Evolutionary Advantage", {
          text "If you go second, this Pokémon can evolve during your first turn."
          delayedA {
						before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
							if(bg.turnCount == 2) prevent()
						}
					}
        }
        move "Static Shock", {
          text "10 damage."
          energyCost L
          onAttack {
            damage 10
          }
        }

      };
      case SHINX_46:
      return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Charge", {
          text "Search your deck for a [L] Energy card and attach it to this Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert deck
          }
          onAttack {
            attachEnergyFrom(type:L, my.deck, self)
            shuffleDeck()
          }
        }

      };
      case LUXIO_47:
      return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Disconnect", {
          text "30 damage. Your opponent can’t play any Item cards from their hand during their next turn."
          energyCost C
          onAttack {
            damage 30
            delayed {
              before PLAY_TRAINER, {
                if (ef.cardToPlay.cardTypes.is(ITEM) && bg.currentTurn == self.owner.opposite) {
                  wcu "Disconnect prevents playing this card"
                  prevent()
                }
              }
              unregisterAfter 2
            }
          }
        }

      };
      case LUXRAY_48:
      return evolution (this, from:"Luxio", hp:HP150, type:LIGHTNING, retreatCost:0) {
        weakness FIGHTING
        resistance METAL, MINUS20
        bwAbility "Intimidating Fang", {
          text "As long as this Pokémon is your Active Pokémon, your opponent’s Active Pokémon’s attacks do 30 less damage (before applying Weakness and Resistance)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {if(self.active && it.to==self && it.dmg.value && it.notNoEffect){
                bc "Intimidating Fang -30"
                it.dmg -= hp(30)
              }}
            }
          }
        }
        move "Volt Bolt", {
          text "Discard all [L] Energy from this Pokémon. This attack does 150 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness or Resistance for Benched Pokémon.)"
          energyCost L, L, C
          onAttack {
            discardAllSelfEnergy(L) //Should this come before or after the damage step?
            damage 150, opp.all.select()
          }
        }

      };
      case PACHIRISU_49:
      return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        move "Snuggly Generator", {
          text "For each of your Benched Pokémon that has the Nuzzle attack, search your deck for a [L] Energy card and attach it to that Pokémon. Then, shuffle your deck."
          energyCost L
          attackRequirement {
            assert my.bench.findAll{it.topPokemonCard.moves.findAll{it.name=="Nuzzle"}}
            assert my.deck
          }
          onAttack {
            my.bench.each{pcs->
              pcs.topPokemonCard.moves.each{
                if(it.name=="Nuzzle"){
                  attachEnergyFrom(type:L,my.deck,pcs)
                }
              }
            }
            shuffleDeck()
          }
        }
        move "Nuzzle", {
          text "Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost L
          onAttack {
            flip{ apply PARALYZED}
          }
        }

      };
      case ROTOM_50:
      return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
        weakness FIGHTING
        resistance METAL, MINUS20
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.retainAll()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Plasma Slice", {
          text "120 damage. This Pokémon can’t attack during your next turn."
          energyCost L, L, L
          onAttack {
            damage 120
            cantAttackNextTurn self
          }
        }

      };
      case DRIFLOON_51:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Creepy Wind", {
          text "Your opponent’s Active Pokémon is now Confused."
          energyCost P
          onAttack {
            apply CONFUSED
          }
        }
        move "Hang Down", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }

      };
      case DRIFBLIM_52:
      return evolution (this, from:"Drifloon", hp:HP110, type:PSYCHIC, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Damage Transport", {
          text "Move 4 damage counters from each of your Pokémon to your opponent’s Active Pokémon."
          energyCost C, C
          onAttack {
            my.all.each{
              def dmcm = Math.min(4,it.numberOfDamageCounters)
              it.damage-=hp(dmcm*10)
              opp.active.damage+=hp(dmcm*10)
            }
          }
        }
        move "Wind Wheel", {
          text "80 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
          energyCost P, C, C
          onAttack {
            damage 80
            afterDamage{
              whirlwind()
            }
          }
        }

      };
      case SPIRITOMB_53:
      return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
        move "Lightless World", {
          text "Put 2 Supporter cards from your discard pile into your hand."
          energyCost C
          attackRequirement {
            assert my.discard.filterByType(SUPPORTER) : "There is no Supporter cards in your discard"
          }
          onAttack {
            my.discard.filterByType(SUPPORTER).select(count: 2, "Put to hand").moveTo(my.hand)
          }
        }
        move "Terrify", {
          text "10 damage. If the Defending Pokémon is a Basic Pokémon, it can’t attack during your opponent’s next turn."
          energyCost C
          onAttack {
            damage 10
            if(defending.basic) cantAttackNextTurn defending
          }
        }

      };
      case SKORUPI_54:
      return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
        weakness PSYCHIC
        move "Hone Claws", {
          text "During your next turn, this Pokémon’s Pierce attack’s base damage is 90."
          energyCost P
          onAttack {
            increasedBaseDamageNextTurn("Pierce", hp(60))
          }
        }
        move "Pierce", {
          text "30 damage."
          energyCost P, P
          onAttack {
            damage 30
          }
        }

      };
      case DRAPION_55:
      return evolution (this, from:"Skorupi", hp:HP130, type:PSYCHIC, retreatCost:3) {
        weakness PSYCHIC
        move "Dangerous Stinger", {
          text "100 damage. Your opponent’s Active Pokémon is now Paralyzed and Poisoned."
          energyCost P, P, P, P
          onAttack {
            damage 100
            afterDamage{ //Is this the general way to format multiple special conditions? A: yes
              apply POISONED
              apply PARALYZED
            }
          }
        }

      };
      case CROAGUNK_56:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Swagger", {
          text "10 damage. Flip a coin. If heads, discard an Energy from your opponent’s Active Pokémon."
          energyCost P
          onAttack {
            damage 10
            flip{afterDamage{discardDefendingEnergy()}}
          }
        }

      };
      case TOXICROAK_57:
      return evolution (this, from:"Croagunk", hp:HP100, type:PSYCHIC, retreatCost:2) {
        weakness PSYCHIC
        move "Poison Jab", {
          text "30 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost P
          onAttack {
            damage 30
            applyAfterDamage POISONED
          }
        }
        move "Exact Revenge", {
          text "50+ damage. If any of your [F] Pokémon were Knocked Out by damage from an opponent’s attack during their last turn, this attack does 70 more damage."
          energyCost C, C
          onAttack {
            damage 50
            if(my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1 && my.lastKnockoutTypes && my.lastKnockoutTypes.contains(F)) damage 70
          }
        }

      };
      case GIRATINA_PRISM_STAR_58:
      return basic (this, hp:HP160, type:PSYCHIC, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        bwAbility "Chaotic Star", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach 2 [P] Energy cards from your hand to it."
          onActivate {r->
            if(r==PLAY_FROM_HAND && my.hand.filterByEnergyType(PSYCHIC) && confirm('Use Chaotic Star?')){
              attachEnergyFrom(type:P,my.hand,self)
              attachEnergyFrom(type:P,my.hand,self)
            }
          }
        }

        move "Crisis Dive", {
          text "160 damage. Discard 2 Energy from this Pokémon."
          energyCost P, P, P, P
          onAttack {
            damage 160
            discardSelfEnergy(C,C)
          }
        }

      };
      case CRESSELIA_59:
      return basic (this, hp:HP120, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Lunar Payback", {
          text "Discard an Energy from this Pokémon. If you do, switch all damage counters on this Pokémon with those on your opponent’s Active Pokémon."
          energyCost P
          onAttack {
            discardSelfEnergy(C)
            //TODO: Make a damage counter switch consequential of discarding the energy.
            targeted (defending) { //What does targeted do?
              def oldDamage = defending.damage
              defending.damage = self.damage
              self.damage = oldDamage
            }
          }
        }
        move "Psychic", {
          text "60+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent’s Active Pokémon."
          energyCost P, C, C
          onAttack {
            damage 60+20*defending.cards.energyCount(C)
          }
        }

      };
      case COSMOG_60:
      return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
        weakness PSYCHIC
        move "Teleport", {
          text "Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost C
          onAttack {
            switchYourActive()
          }
        }

      };
      case COSMOEM_61:
      return copy (SunMoon.COSMOEM_65, this);
      case LUNALA_PRISM_STAR_62:
      return basic (this, hp:HP160, type:PSYCHIC, retreatCost:3) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        move "Full Moon Star", {
          text "For each of your opponent’s Pokémon in play, attach a [P] Energy card from your discard pile to your Pokémon in any way you like."
          energyCost P
          attackRequirement {
            assert my.discard.filterByEnergyType(PSYCHIC) : "There is no [P] Energy card in your discard pile."
          }
          onAttack {
            (1..opp.all.size()).each{attachEnergyFrom(type:P,my.discard,my.all)}
          }
        }
        move "Psystorm", {
          text "20× damage. This attack does 20 damage times the amount of Energy attached to all Pokémon."
          energyCost P, P, P, P
          onAttack {
            int c=0
            opp.all.each {c+=it.cards.energyCount(C)}
            my.all.each {c+=it.cards.energyCount(C)}
            damage 20*c
          }
        }

      };
      case DAWN_WINGS_NECROZMA_GX_63:
      return basic (this, hp:HP180, type:PSYCHIC, retreatCost:2) {
        weakness DARKNESS
        resistance FIGHTING, MINUS20
        bwAbility "Invasion", {
          text "Once during your turn (before your attack), if this Pokémon is on your Bench, you may switch it with your Active Pokémon."
            actionA {
              checkLastTurn()
              assert self.benched
              powerUsed()
              sw my.active, self
            }
        }
        move "Dark Flash", {
          text "120 damage. This attack’s damage isn’t affected by Resistance."
          energyCost P, P, P
          onAttack {
            dontApplyResistance()
            damage 120
          }
        }
        move "Moon’s Eclipse GX", {
          text "180 damage. You can use this attack only if you have more Prize cards remaining than your opponent. Prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn. (You can’t use more than 1 GX attack in a game.)"
          energyCost P, P, P
          attackRequirement {
            gxCheck()
            assert my.prizeAsList.size() > opp.prizeAsList.size() : "you don't have more Prize cards remaining"
          }
          onAttack {
            gxPerform()
            damage 180
            preventAllEffectsNextTurn()
          }
        }

      };
      case CRANIDOS_64:
      return evolution (this, from:"Unidentified Fossil", hp:HP090, type:FIGHTING, retreatCost:1) {
        //TODO: Does the evolution from unidentified fossil take extra checks?
        weakness GRASS
        move "Corkscrew Punch", {
          text "30 damage."
          energyCost F
          onAttack {
            damage 30
          }
        }
        move "Headstrike", {
          text "50 damage."
          energyCost F, F
          onAttack {
            damage 50
          }
        }

      };
      case RAMPARDOS_65:
      return evolution (this, from:"Cranidos", hp:HP150, type:FIGHTING, retreatCost:2) {
        weakness GRASS
        move "Clean Hit", {
          text "60+ damage. If your opponent’s Active Pokémon is an Evolution Pokémon, this attack does 60 more damage."
          energyCost F
          onAttack {
            damage 60
            if(defending.evolution) damage 60
          }
        }
        move "Wild Crash", {
          text "If your opponent’s Active Pokémon is a Basic Pokémon, it is Knocked Out."
          energyCost F, F, F
          attackRequirement {
            assert opp.active.basic : "Defending is not basic"
          }
          onAttack {
            new Knockout(defending).run(bg)
          }
        }

      };
      case RIOLU_66:
      return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
        weakness PSYCHIC
        move "Detect", {
          text "Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
          energyCost C
          onAttack {
            flip{preventAllEffectsNextTurn()}
          }
        }
        move "Jab", {
          text "10 damage."
          energyCost F
          onAttack {
            damage 10
          }
        }

      };
      case LUCARIO_67:
      return evolution (this, from:"Riolu", hp:HP110, type:FIGHTING, retreatCost:1) {
        weakness PSYCHIC
        bwAbility "Precognitive Aura", {
          text "Once during your turn (before your attack), if you have Garchomp in play, you may search your deck for a card and put it into your hand. Then, shuffle your deck."
          actionA {
            checkLastTurn()
						assert my.deck
            assert my.all.findAll({it.name.contains("Garchomp")})
						powerUsed()
            my.deck.select(count:1).moveTo(hidden: true,my.hand)
            shuffleDeck()
          }
        }
        move "Missile Jab", {
          text "70 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C
          onAttack {
            dontApplyResistance()
            damage 70
          }
        }

      };
      case HIPPOPOTAS_68:
      return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
        weakness GRASS
        move "Eleventh Hour Tackle", {
          text "50+ damage. If there are 3 or fewer cards in your deck, this attack does 130 more damage."
          energyCost F, C, C
          onAttack {
            damage 50
            if(my.deck.size()<4)
              damage 130
          }
        }

      };
      case HIPPOWDON_69:
      return evolution (this, from:"Hippopotas", hp:HP140, type:FIGHTING, retreatCost:4) {
        weakness GRASS
        move "Sand Tomb", {
          text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost F, C, C
          onAttack {
            damage 50
            cantRetreat(defending)
          }
        }
        move "Dust Cannon", {
          text "100+ damage. This attack does 10 more damage for each [C] in your opponent’s Active Pokémon’s Retreat Cost."
          energyCost F, F, C, C
          onAttack {
            damage 100+10*defending.retreatCost
          }
        }

      };
      case PASSIMIAN_70:
      return basic (this, hp:HP110, type:FIGHTING, retreatCost:1) {
        weakness PSYCHIC
        bwAbility "Power Huddle", {
          text "As long as this Pokémon is on your Bench, your Passimian’s attacks do 30 more damage to your opponent’s Active Evolution Pokémon (before applying Weakness and Resistance)."
          delayedA {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each {
                if (self.benched && it.from.owner == self.owner && my.active.name=="Passimian" && it.to.active && it.to.evolution && it.to.owner != self.owner && it.dmg.value) {
                  //TODO: Compare by name to boost passiman damage
                  it.dmg += hp(30)
                  bc "Power Huddle +30"
                }
              }
            }
          }
        }
        move "Rock Hurl", {
          text "40 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C
          onAttack {
            dontApplyResistance()
            damage 40
          }
        }

      };
      case MURKROW_71:
      return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Mean Look", {
          text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost D
          onAttack {
            damage 10
            cantRetreat(defending)
          }
        }

      };
      case HONCHKROW_72:
      return evolution (this, from:"Murkrow", hp:HP110, type:DARKNESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Rip and Run", {
          text "Discard a random card from your opponent’s hand. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost D
          onAttack {
            discardRandomCardFromOpponentsHand()
            switchYourActive()
          }
        }
        move "Speed Dive", {
          text "90 damage."
          energyCost D, C, C
          onAttack {
            damage 90
          }
        }

      };
      case SNEASEL_73:
      return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Sneaky Smash", {
          text "You can use this attack only if you go second, and only on your first turn. Discard an Energy from 1 of your opponent’s Pokémon."
          energyCost C
          attackRequirement {
            //TODO : is second turn 1 or 2?
            assert bg.turnCount==2
          }
          onAttack {
            def tar = opp.all.findAll {it.cards.energyCount(C)}
            if(tar) {
              def pcs = tar.select("Discard energy from")
              targeted (pcs, ATTACK) { //TODO: Change Attack to whatever the correct action-doer may be
                pcs.cards.filterByType(ENERGY).select("Discard").discard()
              }
            }
          }
        }
        move "Ambush", {
          text "10+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost D
          onAttack {
            damage 10
            flip {damage 20}
          }
        }

      };
      case WEAVILE_74:
      return evolution (this, from:"Sneasel", hp:HP090, type:DARKNESS, retreatCost:1) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Icy Wind", {
          text "10 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost C
          onAttack {
            damage 10
            applyAfterDamage ASLEEP
          }
        }
        move "Evil Admonition", {
          text "50× damage. This attack does 50 damage for each of your opponent’s Pokémon that has an Ability."
          energyCost D
          onAttack {
            opp.all.each {if(it.hasModernAbility()) damage 50}
          }
        }

      };
      case STUNKY_75:
      return basic (this, hp:HP070, type:DARKNESS, retreatCost:2) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Gas Bond", {
          text "10 damage. Both Active Pokémon are now Confused."
          energyCost D
          onAttack {
            damage 10
            applyAfterDamage CONFUSED
            afterDamage{apply CONFUSED, self}
          }
        }

      };
      case SKUNTANK_76:
      return evolution (this, from:"Stunky", hp:HP120, type:DARKNESS, retreatCost:3) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        move "Sticky Smokescreen", {
          text "50 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips 2 coins. If either of them is tails, that attack does nothing."
          energyCost D, C
          onAttack {
            damage 50
            sandAttack(thisMove)
            sandAttack(thisMove)
          }
        }
        move "Hammer In", {
          text "100 damage."
          energyCost D, D, C
          onAttack {
            damage 100
          }
        }

      };
      case DARKRAI_PRISM_STAR_77:
      return basic (this, hp:HP160, type:DARKNESS, retreatCost:2) {
        weakness FIGHTING
        resistance PSYCHIC, MINUS20
        bwAbility "Nightmare Star", {
          text "When you play this Pokémon from your hand onto your Bench during your turn, you may attach 2 [D] Energy cards from your hand to it."
          onActivate {r->
            if(r==PLAY_FROM_HAND && confirm('Use Nightmare Star?')){
              if(my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(DARKNESS)){
                my.hand.select(max:2,"Search for 2 Dark Energy",basicEnergyFilter(DARKNESS)).each{
                  attachEnergy(self,it)
                }
              }
            }
          }
        }

        move "Abyssal Sleep", {
          text "120 damage. Your opponentâ€™s Active PokÃ©mon is now Asleep. Your opponent flips 2 coins instead of 1 between turns. If either of them is tails, that PokÃ©mon is still Asleep."
          energyCost D, D, D, D
          onAttack {
            damage 120
            afterDamage{apply ASLEEP, defending}
            delayed {
              after CLEAR_SPECIAL_CONDITION, defending, {
                if(ef.types.contains(ASLEEP)){
                  unregister()
                }
              }
              before ASLEEP_SPC, null, null, BETWEEN_TURNS, {
                if(ef.target == defending){ //MARK parentEvent
                  flip "Asleep (Abyssal Sleep)", 2, {}, {}, [2:{
                    ef.unregisterItself(bg.em());
                  },1:{
                    bc "$self is still asleep."
                  },0:{
                    bc "$self is still asleep."
                  }]
                  prevent()
                }
              }
            }
          }
        }

      };
      case ALOLAN_DIGLETT_78:
      return basic (this, hp:HP050, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Iron Head", {
          text "10× damage. Flip a coin until you get tails. This attack does 10 damage for each heads."
          onAttack {
            flipUntilTails{damage 10}
          }
        }

      };
      case ALOLAN_DUGTRIO_79:
      return evolution (this, from:"Alolan Diglett", hp:HP060, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Gold Rush", {
          text "30× damage. Discard any number of [M] Energy cards from your hand. This attack does 30 damage for each card you discarded in this way."
          attackRequirement {
            assert my.hand.filterByEnergyType(M)
          }
          onAttack {
            damage 30*my.hand.filterByEnergyType(M).select(max: 60).discard().size()
          }
        }

      };
      case MAGNEMITE_80:
      return basic (this, hp:HP060, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Searching Magnet", {
          text "Search your deck for up to 3 [M] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert deck
          }
          onAttack {
            my.deck.search(max : 3, "Search for 3 metal energy",energyFilter(M)).moveTo(my.hand)
          }
        }
        move "Tackle", {
          text "10 damage."
          energyCost M
          onAttack {
            damage 10
          }
        }

      };
      case MAGNEMITE_81:
      return basic (this, hp:HP060, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        bwAbility "Solid Unit", {
          text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent’s)."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(!self.active && it.to == self){
                  bc "Solid Unit prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
        }
        move "Ram", {
          text "20 damage."
          energyCost M, C
          onAttack {
            damage 20
          }
        }

      };
      case MAGNETON_82:
      return evolution (this, from:"Magnemite", hp:HP090, type:METAL, retreatCost:2) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Ram", {
          text "20 damage."
          energyCost M
          onAttack {
            damage 20
          }
        }
        move "Zap Cannon", {
          text "80 damage. This Pokémon can’t use Zap Cannon during your next turn."
          energyCost M, M, C
          onAttack {
            damage 80
            cantUseAttack thisMove, self
          }
        }

      };
      case MAGNEZONE_83:
      return evolution (this, from:"Magneton", hp:HP150, type:METAL, retreatCost:2) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        bwAbility "Magnetic Circuit", {
          text "As often as you like during your turn (before your attack), you may attach a [M] Energy card from your hand to 1 of your Pokémon."
          actionA {
            assert my.hand.findAll(basicEnergyFilter(METAL))
            attachEnergyFrom(may: true, type: METAL, my.hand, my.all)
          }
        }
        move "Zap Cannon", {
          text "130 damage. This Pokémon can’t use Zap Cannon during your next turn."
          energyCost M, M, M, C
          onAttack {
            damage 130
            cantUseAttack thisMove, self
          }
        }

      };
      case SHIELDON_84:
      return evolution (this, from:"Unidentified Fossil", hp:HP100, type:METAL, retreatCost:2) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Take Down", {
          text "50 damage. This Pokémon does 10 damage to itself."
          energyCost M, C
          onAttack {
            damage 50
            damage 10, self
          }
        }
        move "Confront", {
          text "80 damage."
          energyCost M, M, C
          onAttack {
            damage 80
          }
        }

      };
      case BASTIODON_85:
      return evolution (this, from:"Shieldon", hp:HP160, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        bwAbility "Earthen Shield", {
          text "Prevent all damage done to your [M] Pokémon by attacks from your opponent’s Pokémon that have any Special Energy attached to them."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(it.to.types.contains(M) && it.from.cards.filterByType(SPECIAL_ENERGY) && it.to.owner == self.owner && it.from.owner == self.owner.opposite){
                    it.dmg = hp(0)
                }
              }
            }
          }
        }
        move "Push Down", {
          text "110 damage. You may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon."
          energyCost M, M, C
          onAttack {
            damage 110
            if(confirm("Your opponent switch their pokemon with 1 of their bench?"))
              whirlwind()
          }
        }

      };
      case BRONZOR_86:
      return basic (this, hp:HP060, type:METAL, retreatCost:2) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Hypnosis", {
          text "Your opponent’s Active Pokémon is now Asleep."
          energyCost M
          onAttack {
            apply ASLEEP
          }
        }
        move "Spinning Attack", {
          text "20 damage."
          energyCost C, C
          onAttack {
            damage 20
          }
        }

      };
      case BRONZONG_87:
      return evolution (this, from:"Bronzor", hp:HP110, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Psy Bolt", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost M
          onAttack {
            damage 20
            flip {applyAfterDamage PARALYZED}
          }
        }
        move "Psychic Resonance", {
          text "60+ damage. If your opponent has any [P] Pokémon in play, this attack does 60 more damage."
          energyCost M, C, C
          onAttack {
            damage 60
            if(opp.all.findAll{it.types.contains(P)})
              damage 60
          }
        }

      };
      case HEATRAN_88:
      return basic (this, hp:HP130, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Guard Press", {
          text "30 damage. During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost M, C
          onAttack {
            damage 30
            reduceDamageNextTurn(hp(30),thisMove)
          }
        }
        move "Boiling Impact", {
          text "130 damage. Discard 2 Energy from this Pokémon."
          energyCost M, M, C
          onAttack {
            damage 130
            discardSelfEnergy(C,C)
          }
        }

      };
      case SOLGALEO_PRISM_STAR_89:
      return basic (this, hp:HP160, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Radiant Star", {
          text "For each of your opponent’s Pokémon in play, attach a [M] Energy card from your discard pile to your Pokémon in any way you like."
          energyCost M
          attackRequirement {
            assert my.discard.filterByEnergyType(METAL) : "There is no [M] Energy card in your discard pile."
          }
          onAttack {
            opp.all.each{
              attachEnergyFrom(type:M,my.discard,my.all.select())
            }
          }
        }
        move "Corona Impact", {
          text "160 damage. This Pokémon can’t attack during your next turn."
          energyCost M, M, M, M
          onAttack {
            damage 160
            cantAttackNextTurn self
          }
        }

      };
      case DUSK_MANE_NECROZMA_GX_90:
      return basic (this, hp:HP190, type:METAL, retreatCost:3) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        move "Claw Slash", {
          text "60 damage."
          energyCost C, C, C
          onAttack {
            damage 60
          }
        }
        move "Meteor Tempest", {
          text "220 damage. Discard 3 Energy from this Pokémon."
          energyCost M, M, M, C
          onAttack {
            damage 220
            discardSelfEnergy(C,C,C)
          }
        }
        move "Sun’s Eclipse GX", {
          text "250 damage. You can use this attack only if you have more Prize cards remaining than your opponent. (You can’t use more than 1 GX attack in a game.)"
          energyCost M, M, M
          attackRequirement {
            gxCheck()
            assert my.prizeAsList.size() > opp.prizeAsList.size()
          }
          onAttack {
            gxPerform()
            damage 250
          }
        }

      };
      case MAGEARNA_91:
      return basic (this, hp:HP090, type:METAL, retreatCost:1) {
        weakness FIRE
        resistance PSYCHIC, MINUS20
        bwAbility "Change Clothes", {
          text "Once your turn (before your attack), you may put a Pokémon Tool card attached to 1 of your Pokémon into your hand."
          actionA {
            checkLastTurn()
            def tar = my.all.findAll{it.cards.filterByType(POKEMON_TOOL)}
            assert tar : "None of your pokemon have a Pokémon Tool card attached to it"
            powerUsed()
            tar.select().cards.filterByType(POKEMON_TOOL).moveTo(my.hand)
          }
        }
        move "Rolling Attack", {
          text "60 damage."
          energyCost M, C, C
          onAttack {
            damage 60
          }
        }

      };
      case MORELULL_92:
      return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
        weakness METAL
        resistance DARKNESS, MINUS20
        move "Flickering Spores", {
          text "Your opponent’s Active Pokémon is now Asleep."
          energyCost C
          onAttack {
            apply ASLEEP
          }
        }
        move "Ram", {
          text "10 damage."
          energyCost Y
          onAttack {
            damage 10
          }
        }

      };
      case SHIINOTIC_93:
      return evolution (this, from:"Morelull", hp:HP100, type:FAIRY, retreatCost:2) {
        weakness METAL
        resistance DARKNESS, MINUS20
        bwAbility "Illuminate", {
          text "Once during your turn (before your attack), you may search your deck for a [Y] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          actionA {
            checkLastTurn()
            assert my.deck
            powerUsed()
            my.deck.search(count: 1, "search for a fairy pokemon", {it.types.contains(Y)}).moveTo(my.hand)
            shuffleDeck()
          }
        }
        move "Flickering Spores", {
          text "30 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost Y, C
          onAttack {
            damage 30
            applyAfterDamage ASLEEP
          }
        }

      };
      case TAPU_LELE_94:
      return basic (this, hp:HP110, type:FAIRY, retreatCost:1) {
        weakness METAL
        resistance DARKNESS, MINUS20
        move "Psywave", {
          text "20× damage. This attack does 20 damage times the amount of Energy attached to your opponent’s Active Pokémon."
          energyCost Y
          onAttack {
            damage 20*opp.active.cards.energyCount(C)
          }
        }
        move "Magical Swap", {
          text "Move any number of damage counters on your opponent’s Pokémon to their other Pokémon in any way you like."
          energyCost Y, C
          attackRequirement {
            assert opp.bench
          }
          onAttack {
            while(1){
              def pl=(opp.all.findAll {it.numberOfDamageCounters})
              if(!pl) break;
              def src =pl.select("source for damage counter (cancel to stop)", false)
              if(!src) break;
              def tar=opp.all.select("Target for damage counter (cancel to stop)", false)
              if(!tar) break;

              src.damage-=hp(10)
              tar.damage+=hp(10)
            }
          }
        }

      };
      case ALOLAN_EXEGGUTOR_95:
      return evolution (this, from:"Exeggcute", hp:HP130, type:DRAGON, retreatCost:3) {
        weakness FAIRY
        move "Exeggutor’s Paradise", {
          text "For each of your Benched Exeggcute, search your deck for an Alolan Exeggutor or Alolan Exeggutor-GX and put it onto that Exeggcute to evolve it. Then, shuffle your deck."
          attackRequirement {
            assert my.deck
          }
          onAttack {
            my.bench.each{
              if(it.name=="Exeggcute"){
                def nam=it.name
                def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
                if(tar) evolve(it, tar.first(), OTHER)
              }
            }
            shuffleDeck()
          }
        }
        move "Draco Meteor Barrage", {
          text "80× damage. Flip a coin for each [G] Energy attached to this Pokémon. This attack does 80 damage for each heads."
          energyCost G, C, C
          onAttack {
            flip self.cards.energyCount(G),{damage 80}
          }
        }

      };
      case GIBLE_96:
      return basic (this, hp:HP050, type:DRAGON, retreatCost:1) {
        weakness FAIRY
        move "Ascension", {
          text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost F
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

      };
      case GIBLE_97:
      return basic (this, hp:HP060, type:DRAGON, retreatCost:1) {
        weakness FAIRY
        bwAbility "Rock Hiding", {
          text "If this Pokémon has any [F] Energy attached to it, it has no Retreat Cost."
          getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
            if(h.effect.target.cards.energyCount(F)) {
              h.object = 0
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
      case GABITE_98:
      return evolution (this, from:"Gible", hp:HP080, type:DRAGON, retreatCost:1) {
        weakness FAIRY
        move "Ascension", {
          text "Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost F
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
        move "Slash", {
          text "40 damage."
          energyCost C, C
          onAttack {
            damage 40
          }
        }

      };
      case GARCHOMP_99:
      return evolution (this, from:"Gabite", hp:HP150, type:DRAGON, retreatCost:0) {
        weakness FAIRY
        move "Quick Dive", {
          text "This attack does 50 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C
          onAttack {
            def tar = opp.all.select()
            damage 50,tar
          }
        }
        move "Royal Blades", {
          text "100+ damage. If you played Cynthia from your hand during this turn, this attack does 100 more damage."
          energyCost F, C, C
          onAttack {
            damage 100
            if(bg.em().retrieveObject("Cynthia_"+bg.turnCount)){
              damage 100
            }
          }
        }

      };
      case DIALGA_GX_100:
      return basic (this, hp:HP180, type:DRAGON, retreatCost:3) {
        weakness FAIRY
        move "Overclock", {
          text "Draw cards until you have 6 cards in your hand."
          energyCost M
          attackRequirement {
            assert my.deck
            assert my.hand.size()<6
          }
          onAttack {
            draw (6-my.hand.size())
          }
        }
        move "Shred", {
          text "80 damage. This attack’s damage isn’t affected by any effects on your opponent’s Active Pokémon."
          energyCost M, C, C
          onAttack {
            shredDamage 80
          }
        }
        move "Timeless GX", {
          text "150 damage. Take another turn after this one. (Skip the between-turns step.) (You can’t use more than 1 GX attack in a game.)"
          energyCost M, M, M, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 150
            afterDamage{
              bg.turnCount += 1
              delayed{
                before BETWEEN_TURNS, {
                  prevent()
                  unregister()
                }
              }
              draw 1
            }
          }
        }

      };
      case PALKIA_GX_101:
      return basic (this, hp:HP180, type:DRAGON, retreatCost:3) {
        weakness FAIRY
        move "Spatial Control", {
          text "Move any number of Energy from your Benched Pokémon to this Pokémon."
          energyCost W
          onAttack {
            while(1){
              def pl=(my.bench.findAll {it.cards.energyCount(C)})
              if(!pl) break;
              def src =pl.select("source for energy (cancel to stop)", false)
              if(!src) break;
              def card=src.cards.select("Card to move",cardTypeFilter(ENERGY)).first()
              energySwitch(src, self, card)
            }
          }
        }
        move "Hydro Pressure", {
          text "60+ damage. This attack does 20 more damage times the amount of [W] Energy attached to this Pokémon."
          energyCost C, C, C
          onAttack {
            damage 60+20*self.cards.energyCount(W)
          }
        }
        move "Zero Vanish GX", {
          text "150 damage. Shuffle all Energy from each of your opponent’s Pokémon into their deck. (You can’t use more than 1 GX attack in a game.)"
          energyCost W, W, W, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 150
            afterDamage{
              opp.all.each{
                it.cards.filterByType(ENERGY).moveTo(opp.deck)
              }
            }
          }
        }

      };
      case LICKITUNG_102:
      return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Lap Up", {
          text "Draw 3 cards."
          energyCost C, C
          onAttack {
            draw 3
          }
        }
        move "Slam", {
          text "50× damage. Flip 2 coins. This attack does 50 damage for each heads."
          energyCost C, C, C
          onAttack {
            flip 2, {damage 50}
          }
        }

      };
      case LICKILICKY_103:
      return evolution (this, from:"Lickitung", hp:HP130, type:COLORLESS, retreatCost:3) {
        weakness FIGHTING
        move "Dangerous Lick", {
          text "50+ damage. Flip a coin until you get tails. This attack does 50 more damage for each heads. If the first flip is tails, your opponent’s Active Pokémon is now Paralyzed."
          energyCost C, C, C
          onAttack {
            damage 50
            flipUntilTails {damage 50}
          }
        }
        move "Rolling Tackle", {
          text "110 damage."
          energyCost C, C, C, C
          onAttack {
            damage 110
          }
        }

      };
      case EEVEE_104:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Gnaw", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }

      };
      case EEVEE_105:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Palette of Friends", {
          text "10× damage. This attack does 10 damage for each different type of Pokémon on your Bench."
          energyCost C, C
          attackRequirement {
            assert my.bench.notEmpty
          }
          onAttack {
            //TODO : less hardcoding? does it work properly?
            for(Type t1:Type.values()){
              if(my.bench.findAll{it.types.contains(t1)})
                damage 10
            }
          }
        }

      };
      case BUNEARY_106:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Weak Kneed", {
          text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
          energyCost C
          onAttack {
            sandAttack(thisMove)
          }
        }
        move "Skip", {
          text "10 damage."
          energyCost C
          onAttack {
            damage 10
          }
        }

      };
      case LOPUNNY_107:
      return evolution (this, from:"Buneary", hp:HP090, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Stompy Stomp", {
          text "40× damage. Flip 2 coins. This attack does 40 damage for each heads."
          energyCost C
          onAttack {
            flip 2, {damage 40}
          }
        }
        move "Happy Turn", {
          text "60 damage. You may shuffle this Pokémon and all cards attached to it into your deck."
          energyCost C, C
          onAttack {
            damage 60
            if(my.bench){
              if(confirm("Shuffle this Pokémon and all cards attached to it into your deck?"))
              {
                shuffleDeck(self.cards)
                removePCS(self)
              }
            }
          }
        }

      };
      case GLAMEOW_108:
      return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Gentle Bite", {
          text "10 damage. During your opponent’s next turn, the Defending Pokémon’s attacks do 40 less damage (before applying Weakness and Resistance)."
          energyCost C
          onAttack {
            damage 10
            reduceDamageFromDefendingNextTurn(hp(40),thisMove,defending)
          }
        }

      };
      case PURUGLY_109:
      return evolution (this, from:"Glameow", hp:HP110, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Own the Place", {
          text "20 damage. If your opponent has a Stadium card in play, discard it. If you do, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
          energyCost C
          onAttack {
            damage 20
            if(bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
              discard bg.stadiumInfoStruct.stadiumCard
              preventAllEffectsNextTurn()
            }
          }
        }
        move "Toss Aside", {
          text "60 damage. Discard random cards from your opponent’s hand until they have 3 cards in their hand."
          energyCost C, C, C
          onAttack {
            damage 60
            if(opp.hand.size()>3)
              opp.hand.select(hidden: true, count: opp.hand.size()-3).discard()
          }
        }

      };
      case FAN_ROTOM_110:
      return basic (this, hp:HP070, type:COLORLESS, retreatCost:0) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        bwAbility "Roto Motor", {
          text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
          getterA GET_MOVE_LIST, self, {h->
            def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>=9)
            def list=[]
            for(move in h.object){
              def copy=move.shallowCopy()
              if(toolReq){
                copy.energyCost.retainAll()
              }
              list.add(copy)
            }
            h.object=list
          }
        }
        move "Spinning Fan", {
          text "This attack does 20 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          onAttack {
            opp.all.each{damage 20, it}
          }
        }

      };
      case SHAYMIN_111:
      return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {
            assert bench.notFull
            assert deck.notEmpty
          }
          onAttack {
            int count = bench.freeBenchCount>=2?2:1
            deck.search(max: count, cardTypeFilter(BASIC)).each{
              deck.remove(it)
              benchPCS(it)
            }
            shuffleDeck()
          }
        }

        move "Glide", {
          text "20 damage."
          energyCost C
          onAttack {
            damage 20
          }
        }

      };
      case YUNGOOS_112:
      return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
        weakness FIGHTING
        move "Scout", {
          text "Your opponent reveals their hand."
          energyCost C
          onAttack {
            opp.hand.showToMe("Opponent's hand")
          }
        }
        move "Take Down", {
          text "30 damage. This Pokémon does 10 damage to itself."
          energyCost C, C
          onAttack {
            damage 30
            damage 10, self
          }
        }

      };
      case GUMSHOOS_113:
      return evolution (this, from:"Yungoos", hp:HP110, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Identify", {
          text "20+ damage. Your opponent reveals their hand. If you find a Pokémon there, this attack does 80 more damage."
          energyCost C, C
          onAttack {
            damage 20
            opp.hand.showToMe("Opponent's hand")
            if(opp.hand.filterByType(POKEMON)){
              damage 80
            }
          }
        }
        move "Whap Down", {
          text "70 damage."
          energyCost C, C, C
          onAttack {
            damage 70
          }
        }

      };
      case ORANGURU_114:
      return basic (this, hp:HP120, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Resource Management", {
          text "Put 3 cards from your discard pile on the bottom of your deck in any order."
          energyCost C
          attackRequirement {
            assert my.discard.notEmpty
          }
          onAttack {
            my.discard.select(count : 3).moveTo(my.deck)
          }
        }
        move "Profound Knowledge", {
          text "60 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost C, C, C
          onAttack {
            damage 60
            applyAfterDamage CONFUSED
          }
        }

      };
      case TYPE__NULL_115:
      return basic (this, hp:HP110, type:COLORLESS, retreatCost:2) {
        weakness FIGHTING
        move "Merciless Strike", {
          text "30+ damage. If your opponent’s Active Pokémon already has any damage counters on it, this attack does 30 more damage."
          energyCost C, C
          onAttack {
            damage 30
            if(opp.active.numberOfDamageCounters)
              damage 30
          }
        }
        move "Headbang", {
          text "70 damage."
          energyCost C, C, C
          onAttack {
            damage 70
          }
        }

      };
      case SILVALLY_GX_116:
      return copy (CrimsonInvasion.SILVALLY_GX_90, this);

      case DRAMPA_117:
      return basic (this, hp:HP130, type:COLORLESS, retreatCost:3) {
        weakness FIGHTING
        move "Outrage", {
          text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
          energyCost C, C
          onAttack {
            damage 20+10*self.numberOfDamageCounters
          }
        }
        move "Dragon Pulse", {
          text "100 damage. Discard the top 2 cards of your deck."
          energyCost C, C, C
          onAttack {
            damage 100
            def list = my.deck.subList(0, 2).discard()
          }
        }

      };
      case ANCIENT_CRYSTAL_118:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nThe Regirock, Regice, Registeel, or Regigigas this card is attached to takes 30 less damage from your opponent’s attacks (after applying Weakness and Resistance).\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff = delayed{
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if(it.to == self && it.from.owner == self.owner.opposite && (self.name=="Regirock" || self.name=="Regice" || self.name=="Registeel" || self.name=="Regigigas")){
                  bc "ancient crystal -30"
                  it.dmg-=hp(30)
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case CYNTHIA_119:
      return supporter (this) {
        text "Shuffle your hand into your deck. Then, draw 6 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
          shuffleDeck()
          draw 6
          bg.em().storeObject("Cynthia_"+bg.turnCount, 1)
        }
        playRequirement{
          assert my.deck.notEmpty || (my.hand.getExcludedList(thisCard).size() != 0)
        }
      };
      case CYRUS_PRISM_STAR_120:
      return supporter (this) {
        text "♢ (Prism Star) Rule: You can’t have more than 1 ♢ card with the same name in your deck. If a ♢ card would go to the discard pile, put it in the Lost Zone instead.\nYou can’t play this card if you don’t have any [W] or [M] Pokémon in play.\nYour opponent chooses 2 Benched Pokémon and shuffles the others, and all cards attached to them, into their deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          def list = LUtils.selectMultiPokemon(bg.oppClient(), opp.bench, "Opponent played Cyrus. Select 2 pokemon to keep on your bench. Rest will be shuffled to your deck", 2)
          opp.bench.findAll{!list.contains(it)}.each{
            it.cards.moveTo(opp.deck)
            removePCS(it)
            shuffleDeck()
          }
        }
        playRequirement{
          assert my.all.findAll{it.types.contains(W) || it.types.contains(M)} : "You don’t have any [W] or [M] Pokémon in play"
          assert opp.bench.size() > 2 : "Opponent needs to have more than 2 benched Pokemon"
        }
      };
      case ELECTRIC_MEMORY_121:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nThe Silvally-GX this card is attached to is a Lightning Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff=getter GET_POKEMON_TYPE, self, {h ->
            if(h.effect.target.name == "Silvally-GX")
            {
              h.object.retainAll()
              h.object.add(LIGHTNING)
            }
          }
        }

        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case ESCAPE_BOARD_122:
      return pokemonTool (this) {
        text "The Retreat Cost of the Pokémon this card is attached to is [C] less, and it can retreat even if it’s Asleep or Paralyzed.\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff1
        def eff2
        onPlay {reason->
          eff1 = getter GET_RETREAT_COST, self, {h ->
              h.object -= 1
          }
          eff2 = delayed{
            before ASLEEP_SPC, self, null, RETREAT, {if(e.parentEvent.effect.retreater == self) prevent() }
            before PARALYZED_SPC, self, null, RETREAT, {if(e.parentEvent.effect.retreater == self) prevent() }
          }
        }
        onRemoveFromPlay {
          eff1.unregister()
          eff2.unregister()
        }
      };
      case FIRE_MEMORY_123:
      return pokemonTool (this) {
        text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nThe Silvally-GX this card is attached to is a [R] Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
        def eff
        onPlay {reason->
          eff=getter GET_POKEMON_TYPE, self, {h ->
            if(h.effect.target.name == "Silvally-GX")
            {
              h.object.retainAll()
              h.object.add(FIRE)
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case GARDENIA_124:
      return supporter (this) {
        text "Heal 80 damage from 1 of your Pokémon that has any [G] Energy attached to it.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          heal 80, my.all.findAll({it.cards.energyCount(G)}).select()
        }
        playRequirement{
          assert my.all.findAll({it.cards.energyCount(G)})
        }
      };
      case LILLIE_125:
      return copy(SunMoon.LILLIE_122,this);
      case LOOKER_126:
      return supporter (this) {
        text "Draw 3 cards from the bottom of your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          if(my.deck.size() < 3) {draw 3}
          else {my.deck.subList(my.deck.size() - 3, my.deck.size()).moveTo(hidden:true, my.hand)}
        }
        playRequirement{
          assert my.deck
        }
      };
      case LOOKER_WHISTLE_127:
      return itemCard (this) {
        text "Search your deck for up to 2 cards named Looker, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          my.deck.search(max:2, "Search your deck for up to 2 cards named Looker", {it.name == "Looker"}).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck
        }
      };
      case MARS_128:
      return supporter (this) {
        text "Draw 2 cards. If you do, discard a random card from your opponent’s hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          draw 2
          astonish()
        }
        playRequirement{
          assert my.deck
        }
      };
      case MISSING_CLOVER_129:
      return itemCard (this) {
        text "You may play 4 Missing Clover cards at once. \n-If you played 1 card, look at the top card of your deck \n if you played 4 cards, take a prize card \nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          if(my.hand.findAll({it.name=="Missing Clover"}).size()>=4) {
            if(confirm("Use your 4 Missing Clover and take a prize card?")){
              bg.em().run(new TakePrize(thisCard.player, null))
              my.hand.findAll({it.name=="Missing Clover"}).subList(0,4).discard()
            }
          } else {
            my.deck.subList(0,1).showToMe("Top card")
          }
        }
        playRequirement{
        }
      };
      case MT__CORONET_130:
      return stadium (this) {
        text "Once during each player’s turn, that player may put 2 [M] Energy cards from their discard pile into their hand.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
        def lastTurn=0
        def actions=[]
        onPlay {
          actions=action("Stadium: Mt Coronet"){
            assert my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(METAL)
            assert lastTurn != bg().turnCount : "Already used"
            bc "Used Mt. Coronet effect"
            lastTurn = bg().turnCount
            my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(METAL).select(count:2,"Search for 2 Metal Energy card to put into your hand").moveTo(my.hand)
          }
        }
        onRemoveFromPlay{
          actions.each { bg().gm().unregisterAction(it) }
        }
      };
      case ORDER_PAD_131:
      return itemCard (this) {
        text "Flip a coin. If heads, search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          flip{
            my.deck.search("Search your deck for an Item card", cardTypeFilter(ITEM)).moveTo(my.hand)
            shuffleDeck()
          }
        }
        playRequirement{
          assert my.deck.notEmpty
        }
      };
      case PAL_PAD_132:
      return itemCard (this) {
        text "Shuffle 2 Supporter cards from your discard pile into your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
          my.discard.filterByType(SUPPORTER).select(count:2,"Search for 2 Supporter cards to shuffle into your deck").moveTo(my.deck)
          shuffleDeck()
        }
        playRequirement{
          assert my.discard.filterByType(SUPPORTER) : "No supporter in discard"
        }
      };
      case POKEMON_FAN_CLUB_133:
      return copy(Aquapolis.POKEMON_FAN_CLUB_130,this);
      case UNIDENTIFIED_FOSSIL_134:
      return itemCard (this) {
        text "Play this card as if it were a 60-HP [C] Basic Pokémon. At any time during your turn (before your attack), you may discard this card from play.\nThis card can’t retreat.\nYou may play as many Item cards as you like during your turn (before your attack)."
        onPlay {
        Card pokemonCard, trainerCard = thisCard
        pokemonCard = basic (new CustomCardInfo(UNIDENTIFIED_FOSSIL_134).setCardTypes(BASIC, POKEMON), hp:HP060, type:COLORLESS, retreatCost:0) {
            customAbility{
                def ef2, acl
                onActivate{
                    delayed {
                        before RETREAT, self, {
                            wcu "Cannot retreat"
                            prevent()
                        }
                    }
                    if(!ef2){
                        ef2 = delayed {
                            after REMOVE_FROM_PLAY, {
                                if(ef.removedCards.contains(pokemonCard)){
                                    bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                                    unregister()
                                    ef2 = null
                                }
                            }
                        }
                    }
                    acl = action("Discard unidentified fossil", [TargetPlayer.SELF]){
                        delayed{
                          before TAKE_PRIZE, {
                            if(ef.pcs==self){
                                prevent()
                            }
                          }
                        }
                        new Knockout(self).run(bg)
                    }
                }
                onDeactivate{
                    acl.each{bg.gm().unregisterAction(it)}
                }
            }
        }
        pokemonCard.player = trainerCard.player
        bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
        hand.remove(pokemonCard)
        benchPCS(pokemonCard)
        }
        playRequirement{
            assert bench.notFull
        }
      };
      case VOLKNER_135:
      return supporter (this) {
        text "Search your deck for an Item card and a [L] Energy card, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
        onPlay {
          my.deck.search("Search your deck for an Item card",cardTypeFilter(ITEM)).moveTo(my.hand)
          my.deck.search("Search your deck for a [L] Energy card",basicEnergyFilter(L)).moveTo(my.hand)
          shuffleDeck()
        }
        playRequirement{
          assert my.deck.notEmpty
        }
      };
      case SUPER_BOOST_ENERGY_PRISM_STAR_136:
      return specialEnergy (this, [[C]]) {
        text "♢ (Prism Star) Rule: You can’t have more than 1 ♢ card with the same name in your deck. If a ♢ card would go to the discard pile, put it in the Lost Zone instead.\n" +
                "This card provides [C] Energy.\n" +
                "While this card is attached to a Stage 2 Pokémon, it provides every type of Energy but provides only 1 Energy at a time. If you have 3 or more Stage 2 Pokémon in play, it provides every type of Energy but provides 4 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        getEnergyTypesOverride {
          if(!self || !self.topPokemonCard)
            return [[C] as Set]
          boolean cond1 = self.topPokemonCard.cardTypes.is(STAGE2)
          boolean cond2 = self.owner.pbg.all.findAll{it.topPokemonCard.cardTypes.is(STAGE2)}.size() >= 3
          if(cond1 && cond2)
            return [[R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set, [R, D, F, G, W, Y, L, M, P] as Set]
          else if(cond1)
            return [[R, D, F, G, W, Y, L, M, P] as Set]
          else
            return [[C] as Set]
        }

      };
      case UNIT_ENERGY_GRW_137:
      return specialEnergy (this,[[G, R, W]]) {
        text "This card provides [C] Energy.\n While this card is attached to a Pokémon, it provides [G], [W], and [R] Energy but provides only 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
      };
      case UNIT_ENERGY_LPM_138:
      return specialEnergy (this, [[L, P, M]]) {
        text "is card provides [C] Energy.\n While this card is attached to a Pokémon, it provides [L], [P], and [M] Energy but provides only 1 Energy at a time."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
      };
      case LEAFEON_GX_139:
      return copy (LEAFEON_GX_13, this);
      case PHEROMOSA_GX_140:
      return basic (this, hp:HP170, type:GRASS, retreatCost:1) {
        weakness FIRE
        move "Fast Raid", {
          text "30 damage. If you go first, you can use this attack on your first turn."
          energyCost G
          onAttack {
            // "Fast Raid" is hardcoded in Attack to be able to go first
            damage 30
          }
        }
        move "Cruel Spike", {
          text "60 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost G, G
          onAttack {
            damage 60
            applyAfterDamage CONFUSED
          }
        }
        move "Beauty GX", {
          text "50× damage. This attack does 50 damage for each Prize card your opponent has taken. (You can’t use more than 1 GX attack in a game.)"
          energyCost G, G
          attackRequirement {
            gxCheck()
            assert (6-opp.prizeAsList.size()) : "No prize taken"
          }
          onAttack {
            damage 50*(6-opp.prizeAsList.size())
            gxPerform()
          }
        }

      };
      case GLACEON_GX_141:
      return copy (GLACEON_GX_39, this);
      case XURKITREE_GX_142:
      return basic (this, hp:HP180, type:LIGHTNING, retreatCost:2) {
        weakness FIGHTING
        resistance METAL, MINUS20
        bwAbility "Flashing Heal", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent’s Pokémon that have any Special Energy attached to them."
          delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.from.cards.filterByType(SPECIAL_ENERGY) && it.dmg.value && it.notNoEffect) {
                  bc "Flashing Heal prevents damage"
                  it.dmg = hp(0)
                }
              }
            }
          }
        }
        move "Rumbling Wires", {
          text "100 damage. Discard the top card of your opponent’s deck."
          energyCost L, L, C
          onAttack {
            damage 100
            if(opp.deck){
              opp.deck.subList(0,1).discard()
            }
          }
        }
        move "Lighting GX", {
          text "Your opponent reveals their hand. Add a card you find there to their Prize cards face down. (You can’t use more than 1 GX attack in a game.)"
          energyCost L
          attackRequirement {
            assert opp.hand.notEmpty
            gxCheck()
          }
          onAttack {
            gxPerform()
            def card = opp.hand.select("Opponent's hand. Put one card as opponent prize")
            opp.hand.remove(card)
            def found = false
            for(int i=0;i<opp.prize.length;i++){
              if(opp.prize[i]==null){
                opp.prize[i]=card
                found=true
                break
              }
            }
            if(!found){
              def newPrizelist = new CardList(opp.prizeAsList)
              newPrizelist.add(card)
              opp.prize = newPrizelist.toArray()
            }
          }
        }

      };
      case DAWN_WINGS_NECROZMA_GX_143:
      return copy (DAWN_WINGS_NECROZMA_GX_63, this);
      case CELESTEELA_GX_144:
      return basic (this, hp:HP200, type:METAL, retreatCost:4) {
        weakness LIGHTNING
        resistance FIGHTING, MINUS20
        move "Rocket Fall", {
          text "30+ damage. This attack does 30 more damage for each [C] in your opponent’s Active Pokémon’s Retreat Cost."
          energyCost M, C, C
          onAttack {
            damage 30+30*opp.active.retreatCost
          }
        }
        move "Moon Press", {
          text "130 damage."
          energyCost M, C, C, C
          onAttack {
            damage 130
          }
        }
        move "Blaster GX", {
          text "180 damage. Turn all your Prize cards face up. (Those Prize cards remain face up for the rest of the game.) (You can’t use more than 1 GX attack in a game.)"
          energyCost M, C, C, C
          attackRequirement {
            gxCheck()
          }
          onAttack {
            gxPerform()
            damage 180
            afterDamage{
              for(int i=0; i<my.prizeIsTurnedUp.length; i++){
                my.prizeIsTurnedUp[i] = true
              }
            }
          }
        }

      };
      case DUSK_MANE_NECROZMA_GX_145:
      return copy (DUSK_MANE_NECROZMA_GX_90, this);
      case DIALGA_GX_146:
      return copy (DIALGA_GX_100, this);
      case PALKIA_GX_147:
      return copy (PALKIA_GX_101, this);
      case CYNTHIA_148:
      return copy (CYNTHIA_119, this);
      case GARDENIA_149:
      return copy (GARDENIA_124, this);
      case LANA_150:
      return copy (BurningShadows.LANA_117,this);
      case LILLIE_151:
      return copy (LILLIE_125, this);
      case LOOKER_152:
      return copy (LOOKER_126, this);
      case LUSAMINE_153:
      return copy (CrimsonInvasion.LUSAMINE_96,this);
      case MARS_154:
      return copy (MARS_128, this);
      case POKEMON_FAN_CLUB_155:
      return copy (POKEMON_FAN_CLUB_133, this);
      case VOLKNER_156:
      return copy (VOLKNER_135, this);
      case LEAFEON_GX_157:
      return copy (LEAFEON_GX_13, this);
      case PHEROMOSA_GX_158:
      return copy (PHEROMOSA_GX_140, this);
      case GLACEON_GX_159:
      return copy (GLACEON_GX_39, this);
      case XURKITREE_GX_160:
      return copy (XURKITREE_GX_142, this);
      case CELESTEELA_GX_162:
      return copy (CELESTEELA_GX_144, this);
      case DUSK_MANE_NECROZMA_GX_163:
      return copy (DUSK_MANE_NECROZMA_GX_90, this);
      case PALKIA_GX_165:
      return copy (PALKIA_GX_101, this);
      case CRUSHING_HAMMER_166:
      return copy (SunMoon.CRUSHING_HAMMER_115, this);
      case ESCAPE_BOARD_167:
      return copy (ESCAPE_BOARD_122, this);
      case MISSING_CLOVER_168:
      return copy (MISSING_CLOVER_129, this);
      case PEEKING_RED_CARD_169:
      return copy (CrimsonInvasion.PEEKING_RED_CARD_97,this);
      case UNIT_ENERGY_GRW_170:
      return copy (UNIT_ENERGY_GRW_137, this);
      case UNIT_ENERGY_LPM_171:
      return copy (UNIT_ENERGY_LPM_138, this);
      case LUNALA_GX_172:
      return copy (SunMoonPromos.LUNALA_GX_SM17, this);
      case SOLGALEO_GX_173:
      return copy (SunMoonPromos.SOLGALEO_GX_SM16, this);
        default:
      return null;
    }
  }

}
