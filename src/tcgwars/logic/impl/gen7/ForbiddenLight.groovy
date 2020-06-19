package tcgwars.logic.impl.gen7;

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.effect.gm.PlayTrainer

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
import tcgwars.logic.effect.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum ForbiddenLight implements LogicCardInfo {

  EXEGGCUTE_1 ("Exeggcute", 1, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ALOLAN_EXEGGUTOR_2 ("Alolan Exeggutor", 2, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SNOVER_3 ("Snover", 3, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ABOMASNOW_4 ("Abomasnow", 4, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SCATTERBUG_5 ("Scatterbug", 5, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SCATTERBUG_6 ("Scatterbug", 6, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SPEWPA_7 ("Spewpa", 7, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VIVILLON_8 ("Vivillon", 8, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SKIDDO_9 ("Skiddo", 9, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOGOAT_10 ("Gogoat", 10, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PHEROMOSA_11 ("Pheromosa", 11, Rarity.HOLORARE, [BASIC, POKEMON, ULTRA_BEAST, _GRASS_]),
  ALOLAN_MAROWAK_12 ("Alolan Marowak", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  HEATRAN_13 ("Heatran", 13, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  FENNEKIN_14 ("Fennekin", 14, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  FENNEKIN_15 ("Fennekin", 15, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  BRAIXEN_16 ("Braixen", 16, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DELPHOX_17 ("Delphox", 17, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  LITLEO_18 ("Litleo", 18, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  PYROAR_19 ("Pyroar", 19, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PALKIA_GX_20 ("Palkia-GX", 20, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  FROAKIE_21 ("Froakie", 21, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FROAKIE_22 ("Froakie", 22, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  FROGADIER_23 ("Frogadier", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GRENINJA_GX_24 ("Greninja-GX", 24, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  CLAUNCHER_25 ("Clauncher", 25, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CLAWITZER_26 ("Clawitzer", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  AMAURA_27 ("Amaura", 27, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  AURORUS_28 ("Aurorus", 28, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  BERGMITE_29 ("Bergmite", 29, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  AVALUGG_30 ("Avalugg", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VOLCANION_PRISM_STAR_31 ("Volcanion Prism Star", 31, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _WATER_]),
  DEWPIDER_32 ("Dewpider", 32, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ARAQUANID_33 ("Araquanid", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGNEMITE_34 ("Magnemite", 34, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MAGNETON_35 ("Magneton", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAGNEZONE_36 ("Magnezone", 36, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  HELIOPTILE_37 ("Helioptile", 37, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  HELIOLISK_38 ("Heliolisk", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  XURKITREE_39 ("Xurkitree", 39, Rarity.RARE, [BASIC, POKEMON, ULTRA_BEAST, _LIGHTNING_]),
  ROTOM_40 ("Rotom", 40, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  UXIE_41 ("Uxie", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MESPRIT_42 ("Mesprit", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AZELF_43 ("Azelf", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ESPURR_44 ("Espurr", 44, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MEOWSTIC_45 ("Meowstic", 45, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HONEDGE_46 ("Honedge", 46, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HONEDGE_47 ("Honedge", 47, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DOUBLADE_48 ("Doublade", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  AEGISLASH_49 ("Aegislash", 49, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  INKAY_50 ("Inkay", 50, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MALAMAR_51 ("Malamar", 51, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SKRELP_52 ("Skrelp", 52, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DRAGALGE_53 ("Dragalge", 53, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HOOPA_54 ("Hoopa", 54, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  POIPOLE_55 ("Poipole", 55, Rarity.UNCOMMON, [BASIC, POKEMON, ULTRA_BEAST, _PSYCHIC_]),
  NAGANADEL_GX_56 ("Naganadel-GX", 56, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, ULTRA_BEAST, POKEMON_GX, _PSYCHIC_]),
  CUBONE_57 ("Cubone", 57, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TORTERRA_58 ("Torterra", 58, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  INFERNAPE_59 ("Infernape", 59, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  GIBLE_60 ("Gible", 60, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GABITE_61 ("Gabite", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  GARCHOMP_62 ("Garchomp", 62, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  CROAGUNK_63 ("Croagunk", 63, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TOXICROAK_64 ("Toxicroak", 64, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  PANCHAM_65 ("Pancham", 65, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BINACLE_66 ("Binacle", 66, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BARBARACLE_67 ("Barbaracle", 67, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  TYRUNT_68 ("Tyrunt", 68, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  TYRANTRUM_69 ("Tyrantrum", 69, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  HAWLUCHA_70 ("Hawlucha", 70, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  ZYGARDE_71 ("Zygarde", 71, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  ZYGARDE_72 ("Zygarde", 72, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  ZYGARDE_GX_73 ("Zygarde-GX", 73, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  DIANCIE_PRISM_STAR_74 ("Diancie Prism Star", 74, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _FIGHTING_]),
  ROCKRUFF_75 ("Rockruff", 75, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LYCANROC_76 ("Lycanroc", 76, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  BUZZWOLE_77 ("Buzzwole", 77, Rarity.RARE, [BASIC, POKEMON, ULTRA_BEAST, _FIGHTING_]),
  PANGORO_78 ("Pangoro", 78, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  YVELTAL_GX_79 ("Yveltal-GX", 79, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  GUZZLORD_80 ("Guzzlord", 80, Rarity.HOLORARE, [BASIC, POKEMON, ULTRA_BEAST, _DARKNESS_]),
  EMPOLEON_81 ("Empoleon", 81, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  DIALGA_GX_82 ("Dialga-GX", 82, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  FLABEBE_83 ("Flabébé", 83, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  FLABEBE_84 ("Flabébé", 84, Rarity.COMMON, [BASIC, POKEMON, _FAIRY_]),
  FLOETTE_85 ("Floette", 85, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  FLORGES_86 ("Florges", 86, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FAIRY_]),
  SYLVEON_87 ("Sylveon", 87, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FAIRY_]),
  DEDENNE_88 ("Dedenne", 88, Rarity.UNCOMMON, [BASIC, POKEMON, _FAIRY_]),
  KLEFKI_89 ("Klefki", 89, Rarity.UNCOMMON, [BASIC, POKEMON, _FAIRY_]),
  XERNEAS_GX_90 ("Xerneas-GX", 90, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FAIRY_]),
  GOOMY_91 ("Goomy", 91, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  GOOMY_92 ("Goomy", 92, Rarity.COMMON, [BASIC, POKEMON, _DRAGON_]),
  SLIGGOO_93 ("Sliggoo", 93, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DRAGON_]),
  GOODRA_94 ("Goodra", 94, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DRAGON_]),
  ULTRA_NECROZMA_GX_95 ("Ultra Necrozma-GX", 95, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _DRAGON_]),
  ARCEUS_PRISM_STAR_96 ("Arceus Prism Star", 96, Rarity.HOLORARE, [BASIC, POKEMON, PRISM_STAR, _COLORLESS_]),
  BUNNELBY_97 ("Bunnelby", 97, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DIGGERSBY_98 ("Diggersby", 98, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FURFROU_99 ("Furfrou", 99, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NOIBAT_100 ("Noibat", 100, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NOIVERN_101 ("Noivern", 101, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BEAST_RING_102 ("Beast Ring", 102, Rarity.RARE, [ITEM, TRAINER]),
  BONNIE_103 ("Bonnie", 103, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  CRASHER_WAKE_104 ("Crasher Wake", 104, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  DIANTHA_105 ("Diantha", 105, Rarity.HOLORARE, [SUPPORTER, TRAINER]),
  ENEPORTER_106 ("Eneporter", 106, Rarity.UNCOMMON, [ITEM, TRAINER]),
  FOSSIL_EXCAVATION_MAP_107 ("Fossil Excavation Map", 107, Rarity.UNCOMMON, [ITEM, TRAINER]),
  JUDGE_108 ("Judge", 108, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LADY_109 ("Lady", 109, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  LYSANDRE_PRISM_STAR_110 ("Lysandre Prism Star", 110, Rarity.HOLORARE, [SUPPORTER, TRAINER, PRISM_STAR]),
  LYSANDRE_LABS_111 ("Lysandre Labs", 111, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  METAL_FRYING_PAN_112 ("Metal Frying Pan", 112, Rarity.UNCOMMON, [ITEM,POKEMON_TOOL, TRAINER]),
  MYSTERIOUS_TREASURE_113 ("Mysterious Treasure", 113, Rarity.UNCOMMON, [ITEM, TRAINER]),
  ULTRA_RECON_SQUAD_114 ("Ultra Recon Squad", 114, Rarity.UNCOMMON, [SUPPORTER, TRAINER]),
  ULTRA_SPACE_115 ("Ultra Space", 115, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  UNIDENTIFIED_FOSSIL_116 ("Unidentified Fossil", 116, Rarity.UNCOMMON, [ITEM, TRAINER]),
  BEAST_ENERGY_PRISM_STAR_117 ("Beast Energy Prism Star", 117, Rarity.HOLORARE, [SPECIAL_ENERGY, ENERGY, PRISM_STAR]),
  UNIT_ENERGY_FDY_118 ("Unit Energy FDY", 118, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  PALKIA_GX_119 ("Palkia-GX", 119, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  GRENINJA_GX_120 ("Greninja-GX", 120, Rarity.ULTRARARE, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  NAGANADEL_GX_121 ("Naganadel-GX", 121, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  LUCARIO_GX_122 ("Lucario-GX", 122, Rarity.ULTRARARE, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  ZYGARDE_GX_123 ("Zygarde-GX", 123, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  YVELTAL_GX_124 ("Yveltal-GX", 124, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  DIALGA_GX_125 ("Dialga-GX", 125, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  XERNEAS_GX_126 ("Xerneas-GX", 126, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, _FAIRY_]),
  ULTRA_NECROZMA_GX_127 ("Ultra Necrozma-GX", 127, Rarity.ULTRARARE, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _DRAGON_]),
  BONNIE_128 ("Bonnie", 128, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  CRASHER_WAKE_129 ("Crasher Wake", 129, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  DIANTHA_130 ("Diantha", 130, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  ULTRA_RECON_SQUAD_131 ("Ultra Recon Squad", 131, Rarity.ULTRARARE, [SUPPORTER, TRAINER]),
  PALKIA_GX_132 ("Palkia-GX", 132, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _WATER_]),
  GRENINJA_GX_133 ("Greninja-GX", 133, Rarity.SECRET, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
  NAGANADEL_GX_134 ("Naganadel-GX", 134, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, ULTRA_BEAST, _PSYCHIC_]),
  LUCARIO_GX_135 ("Lucario-GX", 135, Rarity.SECRET, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
  ZYGARDE_GX_136 ("Zygarde-GX", 136, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
  YVELTAL_GX_137 ("Yveltal-GX", 137, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _DARKNESS_]),
  DIALGA_GX_138 ("Dialga-GX", 138, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _METAL_]),
  XERNEAS_GX_139 ("Xerneas-GX", 139, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, _FAIRY_]),
  ULTRA_NECROZMA_GX_140 ("Ultra Necrozma-GX", 140, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _DRAGON_]),
  BEAST_RING_141 ("Beast Ring", 141, Rarity.SECRET, [ITEM, TRAINER]),
  ENEPORTER_142 ("Eneporter", 142, Rarity.SECRET, [ITEM, TRAINER]),
  ENERGY_RECYCLER_143 ("Energy Recycler", 143, Rarity.SECRET, [ITEM, TRAINER]),
  METAL_FRYING_PAN_144 ("Metal Frying Pan", 144, Rarity.SECRET, [ITEM,POKEMON_TOOL, TRAINER]),
  MYSTERIOUS_TREASURE_145 ("Mysterious Treasure", 145, Rarity.SECRET, [ITEM, TRAINER]),
  UNIT_ENERGY_FDY_146 ("Unit Energy FDY", 146, Rarity.SECRET, [SPECIAL_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  ForbiddenLight(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.FORBIDDEN_LIGHT;
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
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Multiply", {
            text "Search your deck for Exeggcute and put it onto your Bench. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
              assert my.bench.notFull
            }
            onAttack {
              my.deck.search("Exeggcute", {it.name=="Exeggcute"}).each{
                my.deck.remove(it)
                benchPCS(it)
              }
            }
          }

        };
      case ALOLAN_EXEGGUTOR_2:
        return evolution (this, from:"Exeggcute", hp:HP160, type:GRASS, retreatCost:3) {
          weakness FIRE
          move "Tropical Shake", {
            text "20+ damage. This attack does 20 more damage for each type of basic Energy card in your discard pile. You can’t add more than 100 damage in this way."
            energyCost G
            onAttack {
              damage 20
              def addDmg = 0
              for(Type t1:Type.values()){
                if(my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                  addDmg += 20
              }
              addDmg = Math.min(100,addDmg)
              damage addDmg
            }
          }

        };
      case SNOVER_3:
        return basic (this, hp:HP080, type:GRASS, retreatCost:3) {
          weakness FIRE
          move "Ice Shard", {
            text "20+ damage. If your opponent’s Active Pokémon is a [F] Pokémon, this attack does 40 more damage."
            energyCost G, C
            onAttack {
              damage 20
              if(defending.types.contains(F)) damage 40
            }
          }

        };
      case ABOMASNOW_4:
        return evolution (this, from:"Snover", hp:HP130, type:GRASS, retreatCost:3) {
          weakness FIRE
          bwAbility "Blessings of the Forest", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may attach a [G] Energy card from your discard pile to 1 of your Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && confirm("Blessings of the Frost")){
                powerUsed()
                attachEnergyFrom(type:G,my.discard,my.all.select())
              }
            }
          }
          move "Hypno Hammer", {
            text "80 damage. Your opponent’s Active Pokémon is now Asleep."
            energyCost G, C, C, C
            onAttack {
              damage 80
              applyAfterDamage ASLEEP
            }
          }

        };
      case SCATTERBUG_5:
        return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
          weakness FIRE
          bwAbility "Outbreak", {
            text "Once during your first turn (before your attack), you may search your deck for a Spewpa and a Vivillon, reveal them, and put them into your hand. Then, shuffle your deck."
            actionA {
              assert bg.turnCount == 2 : "this is not your first turn"
              assert my.deck //would be an achievment to deck out first turn
              my.deck.search(max: 2, "Select a Spewpa and a Vivillon", {it.name == "Spewpa" || it.name == "Vivillon"}, {CardList list ->
                list.filterByNameEquals("Spewpa").size() <= 1 && list.filterByNameEquals("Vivillon").size() <= 1
              }).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Tackle", {
            text "10 damage."
            energyCost C, C
            onAttack {
              damage 10
            }
          }

        };
      case SCATTERBUG_6:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Ultra Evolution", {
            text "Flip a coin. If heads, search your deck for Vivillon and put it onto this Scatterbug to evolve it. Then, shuffle your deck."
            energyCost G
            attackRequirement {
              assert my.deck
            }
            onAttack {
              flip {
                my.deck.search("Select a Vivillon",{it.name == "Vivillon"}).each{
                  evolve(self,it,OTHER)
                }
              }
            }
          }

        };
      case SPEWPA_7:
        return evolution (this, from:"Scatterbug", hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "String Shot", {
            text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost G
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }

        };
      case VIVILLON_8:
        return evolution (this, from:"Spewpa", hp:HP130, type:GRASS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Vivid Powder", {
            text "50 damage. Your opponent’s Active Pokémon is now Asleep and Poisoned."
            energyCost G
            onAttack {
              damage 50
              afterDamage{
                apply ASLEEP
                apply POISONED
              }
            }
          }

        };
      case SKIDDO_9:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Growth", {
            text "Attach a [G] Energy card from your hand to this Pokémon."
            energyCost G
            attackRequirement {
              assert my.hand
            }
            onAttack {
              attachEnergyFrom(type:G, my.hand, self)
            }
          }
          move "Razor Leaf", {
            text "40 damage."
            energyCost G, C, C
            onAttack {
              damage 40
            }
          }

        };
      case GOGOAT_10:
        return evolution (this, from:"Skiddo", hp:HP120, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Drink Milk", {
            text "Flip 2 coins. For each heads, heal 40 damage from this Pokémon."
            energyCost G
            onAttack {
              flip 2, {heal 40, self}
            }
          }
          move "Double-Edge", {
            text "120 damage. This Pokémon does 30 damage to itself."
            energyCost G, C, C
            onAttack {
              damage 120
              damage 30, self
            }
          }

        };
      case PHEROMOSA_11:
        return basic (this, hp:HP110, type:GRASS, retreatCost:0) {
          weakness FIRE
          move "High Jump Kick", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "White Ray", {
            text "90+ damage. If you have only 1 Prize card remaining, this attack does 90 more damage."
            energyCost G, G, C
            onAttack {
              damage 90
              if(my.prizeCardSet.size() == 1) damage 90
            }
          }

        };
      case ALOLAN_MAROWAK_12:
        return evolution (this, from:"Cubone", hp:HP120, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Limbo Limbo", {
            text "Search your deck for up to 2 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            attackRequirement {
              assert my.deck
            }
            onAttack {
              attachEnergyFrom(basic : true, my.deck, my.all)
              attachEnergyFrom(basic : true, my.deck, my.all)
            }
          }
          move "Alolan Club", {
            text "20× damage. This attack does 20 damage for each of your Pokémon in play that has Alolan in its name."
            energyCost C, C
            onAttack {
              damage my.all.findAll({it.name.contains("Alolan")}).size() * 20
            }
          }

        };
      case HEATRAN_13:
        return basic (this, hp:HP130, type:FIRE, retreatCost:3) {
          weakness WATER
          move "Guard Press", {
            text "30 damage. During your opponent’s next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
            energyCost R, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(30),thisMove, self)
            }
          }
          move "Boiling Impact", {
            text "130 damage. Discard 2 Energy from this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 130
              afterDamage{
                discardSelfEnergy C,C
              }
            }
          }

        };
      case FENNEKIN_14:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Ember", {
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
      case FENNEKIN_15:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Live Coal", {
            text "10 damage."
            energyCost R
            onAttack {
              damage 10
            }
          }
          move "Rear Kick", {
            text "20 damage."
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case BRAIXEN_16:
        return evolution (this, from:"Fennekin", hp:HP090, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Flare", {
            text "20 damage."
            energyCost R
            onAttack {
              damage 20
            }
          }
          move "Flamethrower", {
            text "80 damage. Discard an Energy from this Pokémon."
            energyCost R, R, C
            onAttack {
              damage 80
              afterDamage{
                discardSelfEnergy C
              }
            }
          }

        };
      case DELPHOX_17:
        return evolution (this, from:"Braixen", hp:HP150, type:FIRE, retreatCost:2) {
          weakness WATER
          bwAbility "Mystical Torch", {
            text "Once during your turn (before your attack), you may leave your opponent’s Active Pokémon Burned."
            actionA {
              checkLastTurn()
              powerUsed()
              apply BURNED, opp.active, SRC_ABILITY
            }
          }
          move "Fire Spin", {
            text "150 damage. Discard 2 Energy from this Pokémon."
            energyCost R, R, C, C
            onAttack {
              damage 150
              afterDamage{
                discardSelfEnergy C,C
              }
            }
          }

        };
      case LITLEO_18:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Headbutt", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case PYROAR_19:
        return evolution (this, from:"Litleo", hp:HP120, type:FIRE, retreatCost:2) {
          weakness WATER
          bwAbility "Unnerve", {
            text "Whenever your opponent plays an Item or Supporter card from their hand, prevent all effects of that card done to this Pokémon."
            delayedA {
              def power=false
              before PLAY_TRAINER, {
                if ((ef.item || ef.supporter) && bg.currentTurn==self.owner.opposite && bg.currentTurn.pbg.hand.contains(ef.cardToPlay)) {
                  power=true
                }
              }
              after PLAY_TRAINER, {
                power=false
              }
              before null, self, Source.TRAINER_CARD, {
                if (power) {
                  bc "Unnerve prevents effects from Supporter or Item cards done to $self."
                  prevent()
                }
              }
            }
          }
          move "Dominating Fangs", {
            text "80+ damage. If Lysandre Labs is in play, this attack does 60 more damage."
            energyCost R, C, C
            onAttack {
              damage 80
              if(bg.stadiumInfoStruct){
                if(bg.stadiumInfoStruct.stadiumCard.name == "Lysandre Labs") damage 60
              }
            }
          }

        };
      case PALKIA_GX_20:
        return basic (this, hp:HP180, type:WATER, retreatCost:3) {
          weakness GRASS
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
      case FROAKIE_21:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness GRASS
          bwAbility "Frubbles", {
            text "If this Pokémon has any [W] Energy attached to it, it has no Retreat Cost."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.energyCount(W)) {
                h.object = 0
              }
            }
          }
          move "Flop", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case FROAKIE_22:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Rain Splash", {
            text "10 damage."
            energyCost W
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
      case FROGADIER_23:
        return evolution (this, from:"Froakie", hp:HP080, type:WATER, retreatCost:1) {
          weakness GRASS
          bwAbility "Gale Shuriken", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 2 damage counters on 1 of your opponent’s Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && confirm("Gale Shuriken")){
                powerUsed()
                directDamage 20, opp.all.select(), SRC_ABILITY
              }
            }
          }
          move "Water Drip", {
            text "20 damage."
            energyCost W
            onAttack {
              damage 20
            }
          }

        };
      case GRENINJA_GX_24:
        return evolution (this, from:"Frogadier", hp:HP230, type:WATER, retreatCost:2) {
          weakness GRASS
          bwAbility "Shuriken Flurry", {
            text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put 3 damage counters on 1 of your opponent’s Pokémon."
            onActivate {reason ->
              if(reason == PLAY_FROM_HAND && confirm("Shuriken Flurry")){
                powerUsed()
                directDamage 30, opp.all.select(), SRC_ABILITY
              }
            }
          }
          move "Haze Slash", {
            text "110 damage. You may shuffle this Pokémon and all cards attached to it into your deck."
            energyCost W, C, C
            onAttack {
              damage 110
              afterDamage{
                if(confirm("Shuffle this Pokémon and all cards attached to it into your deck?")){
                  self.cards.moveTo(my.deck)
                  removePCS(self)
                  shuffleDeck()
                }
              }
            }
          }
          move "Shadowy Hunter GX", {
            text "This attack does 130 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) (You can’t use more than 1 GX attack in a game.)"
            energyCost W, C, C
            attackRequirement {
              assert opp.bench
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 130, opp.bench.select()
            }
          }

        };
      case CLAUNCHER_25:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Water Gun", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case CLAWITZER_26:
        return evolution (this, from:"Clauncher", hp:HP100, type:WATER, retreatCost:2) {
          weakness GRASS
          move "Standing By", {
            text "During your next turn, this Pokémon’s Sharpshooting attack does 120 damage instead of 40."
            energyCost W
            onAttack {
              increasedBaseDamageNextTurn("Sharpshooting",hp(80))
            }
          }
          move "Sharpshooting", {
            text "This attack does 40 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            onAttack {
              damage 40, opp.all.select()
            }
          }

        };
      case AMAURA_27:
        return evolution (this, from:"Unidentified Fossil", hp:HP090, type:WATER, retreatCost:3) {
          weakness METAL
          move "Powder Snow", {
            text "30 damage. Your opponent’s Active Pokémon is now Asleep."
            energyCost W, C
            onAttack {
              damage 30
              apply ASLEEP
            }
          }
          move "Aurora Beam", {
            text "60 damage."
            energyCost W, W, C
            onAttack {
              damage 60
            }
          }

        };
      case AURORUS_28:
        return evolution (this, from:"Amaura", hp:HP160, type:WATER, retreatCost:4) {
          weakness METAL
          move "Frost Wall", {
            text "50 damage. During your opponent’s next turn, prevent all damage done to this Pokémon by attacks from Evolution Pokémon."
            energyCost W, C, C
            onAttack {
              damage 50
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.from.realEvolution && it.dmg.value && it.notNoEffect) {
                      bc "Frost Wall"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Blizzard Burn", {
            text "150 damage. This Pokémon can’t attack during your next turn."
            energyCost W, W, C, C
            onAttack {
              damage 150
              cantAttackNextTurn self
            }
          }

        };
      case BERGMITE_29:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness METAL
          move "Break Open", {
            text "10 damage. If your opponent has a Stadium card in play, discard it. If you do, your opponent’s Active Pokémon is now Paralyzed."
            energyCost W
            onAttack {
              damage 10
              if(bg.stadiumInfoStruct){
                afterDamage {
                  if(bg.stadiumInfoStruct.stadiumCard.player != self.owner) {
                    discard(bg.stadiumInfoStruct.stadiumCard)
                    apply PARALYZED
                  }
                }
              }
            }
          }

        };
      case AVALUGG_30:
        return evolution (this, from:"Bergmite", hp:HP140, type:WATER, retreatCost:4) {
          weakness METAL
          move "Frozen Ground", {
            text "80 damage. Your opponent can’t play any Stadium cards from their hand during their next turn."
            energyCost W, C, C
            onAttack {
              damage 80
              delayed{
                before PLAY_TRAINER, {
                  if (ef.cardToPlay.cardTypes.is(STADIUM) && bg.currentTurn == self.owner.opposite) {
                    wcu "Frozen Ground prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Skull Bash", {
            text "100 damage."
            energyCost W, C, C, C
            onAttack {
              damage 100
            }
          }

        };
      case VOLCANION_PRISM_STAR_31:
        return basic (this, hp:HP160, type:WATER, retreatCost:3) {
          weakness LIGHTNING
          bwAbility "Jet Geyser", {
            text "Once during your turn (before your attack), you may discard a [W] Energy card from your hand. If you do, your opponent switches their Active Pokémon with 1 of their Benched Pokémon."
            actionA {
              checkLastTurn()
              assert my.hand.filterByEnergyType(W) : "There is no [W] energy in your hand"
              powerUsed()
              my.hand.filterByEnergyType(W).select().discard()
              if(opp.bench) sw opp.active, opp.bench.oppSelect("New active"), SRC_ABILITY
            }
          }
          move "Sauna Blast", {
            text "100 damage. This attack does 20 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, W
            onAttack {
              damage 100
              opp.bench.each{
                damage 20, it
              }
            }
          }

        };
      case DEWPIDER_32:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness GRASS
          move "Gnaw", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Spider Web", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost W
            onAttack {
              cantRetreat(defending)
            }
          }

        };
      case ARAQUANID_33:
        return evolution (this, from:"Dewpider", hp:HP100, type:WATER, retreatCost:1) {
          weakness GRASS
          globalAbility {Card thisCard->
            delayed (priority: LAST) {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner==thisCard.player && (ef as Attack).move.name == "Bubble"){
                  bg.em().storeObject("Bubble_Trap", bg.turnCount)
                }
              }
            }
          }
          move "Bubble", {
            text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost W
            onAttack {
              damage 30
              flipThenApplySC PARALYZED
            }
          }
          move "Bubble Trap", {
            text "40+ damage. If 1 of your Pokémon used Bubble during your last turn, this attack does 80 more damage."
            energyCost C, C
            onAttack {
              damage 40
              if(bg.em().retrieveObject("Bubble_Trap") == bg.turnCount - 2) damage 80
            }
          }

        };
      case MAGNEMITE_34:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Searching Magnet", {
            text "Search your deck for up to 3 [L] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max : 3,"Search your deck for up to 3 [L] Energy cards",basicEnergyFilter(L)).showToOpponent("Chosen cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Tackle", {
            text "10 damage."
            energyCost L
            onAttack {
              damage 10
            }
          }

        };
      case MAGNETON_35:
        return evolution (this, from:"Magnemite", hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Ram", {
            text "20 damage."
            energyCost L
            onAttack {
              damage 20
            }
          }
          move "Zap Cannon", {
            text "80 damage. This Pokémon can’t use Zap Cannon during your next turn."
            energyCost L, L, C
            onAttack {
              damage 80
              cantUseAttack thisMove, self
            }
          }

        };
      case MAGNEZONE_36:
        return evolution (this, from:"Magneton", hp:HP150, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          bwAbility "Magnetic Circuit", {
            text "As often as you like during your turn (before your attack), you may attach a [L] Energy card from your hand to 1 of your Pokémon."
            actionA {
              assert my.hand.findAll(basicEnergyFilter(L))
              attachEnergyFrom(may: true, type: L, my.hand, my.all)
            }
          }
          move "Zap Cannon", {
            text "130 damage. This Pokémon can’t use Zap Cannon during your next turn."
            energyCost L, L, L, C
            onAttack {
              damage 130
              cantUseAttack thisMove, self
            }
          }

        };
      case HELIOPTILE_37:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Gnaw", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Tail Whap", {
            text "20 damage."
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case HELIOLISK_38:
        return evolution (this, from:"Helioptile", hp:HP100, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Gnaw", {
            text "20 damage."
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Volt Wave", {
            text "80 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost C, C, C
            onAttack {
              damage 80
              flipThenApplySC PARALYZED
            }
          }

        };
      case XURKITREE_39:
        return basic (this, hp:HP120, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          resistance METAL, MINUS20
          move "Dazzle Blast", {
            text "20 damage. Your opponent’s Active Pokémon is now Confused."
            energyCost L
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Cablegram", {
            text "100 damage. If you have exactly 3 Prize cards remaining, your opponent’s Active Pokémon is now Paralyzed."
            energyCost L, L, C
            onAttack {
              damage 100
              if(my.prizeCardSet.size() == 3) applyAfterDamage PARALYZED
            }
          }

        };
      case ROTOM_40:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Roto Motor", {
            text "If you have 9 or more Pokémon Tool cards in your discard pile, ignore all Energy in the attack cost of each of this Pokémon’s attacks."
            getterA GET_MOVE_LIST, self, {h->
              def toolReq = (my.discard.filterByType(POKEMON_TOOL).size()>8)
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
            energyCost P, P, P
            onAttack {
              damage 120
              cantAttackNextTurn self
            }
          }

        };
      case UXIE_41:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Memory Skip", {
            text "30 damage. Choose 1 of your opponent’s Active Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost P
            onAttack {
              damage 30
              amnesia delegate
            }
          }

        };
      case MESPRIT_42:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Silent Waves", {
            text "If you have Azelf in play, your opponent’s Pokémon in play have no Resistance."
            getterA (GET_RESISTANCES) {h->
              if(h.effect.target.owner == self.owner.opposite && my.all.find({it.name == "Azelf"})) {
                h.object.clear()
              }
            }
          }
          move "Mind Splash", {
            text "20+ damage. If Uxie is on your Bench, this attack does 50 more damage."
            energyCost C, C
            onAttack {
              damage 20
              if(my.all.find({it.name == "Uxie"})) damage 50
            }
          }

        };
      case AZELF_43:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Psychic Abduction", {
            text "You can use this attack only if you go second, and only on your first turn. Shuffle 1 of your opponent’s Benched Pokémon and all cards attached to it into their deck."
            energyCost C
            attackRequirement {
              assert bg.turnCount == 2 : "You can use this attack only on your first turn"
              assert opp.bench
            }
            onAttack {
              def pcs = opp.bench.select()
              pcs.cards.moveTo(opp.deck)
              removePCS(pcs)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
          move "Hypnoblast", {
            text "10 damage. Your opponent’s Active Pokémon is now Asleep."
            energyCost C
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }

        };
      case ESPURR_44:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Energy Teaser", {
            text "Move an Energy from 1 of your opponent’s Benched Pokémon to another of their Pokémon."
            energyCost P
            attackRequirement {
              assert opp.bench.findAll{it.cards.energyCount(C)}
            }
            onAttack {
              def pcs = opp.bench.findAll{it.cards.energyCount(C)}.select("select the Benched Pokémon from which you remove energy")
              def tar = opp.all.findAll{it != pcs}.select("select the Pokémon receiving an energy from $pcs ")
              moveEnergy(basic: false, pcs, tar)
            }
          }

        };
      case MEOWSTIC_45:
        return evolution (this, from:"Espurr", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Teleportation Burst", {
            text "20 damage. Switch this Pokémon with 1 of your Benched Pokémon."
            energyCost P
            onAttack {
              damage 20
              sw self, my.bench.select()
            }
          }
          move "Psychic", {
            text "30+ damage. This attack does 30 more damage times the amount of Energy attached to your opponent’s Active Pokémon."
            energyCost P, C
            onAttack {
              damage 30+30*defending.cards.energyCount(C)

            }
          }

        };
      case HONEDGE_46:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          bwAbility "Final Hour", {
            text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent’s attack, put 3 damage counters on 1 of your opponent’s Pokémon."
            delayedA {
              before (KNOCKOUT,self) {
                if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                  def pcs = self.owner.opposite.pbg.all.oppSelect("choose the Pokémon to put 3 damage counters on")
                  directDamage 30, pcs, SRC_ABILITY
                }
              }
            }
          }
          move "Slash", {
            text "50 damage."
            energyCost P, P, P
            onAttack {
              damage 50
            }
          }

        };
      case HONEDGE_47:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Metal Sound", {
            text "Your opponent’s Active Pokémon is now Confused."
            energyCost P
            onAttack {
              apply CONFUSED
            }
          }

        };
      case DOUBLADE_48:
        return evolution (this, from:"Honedge", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness DRAGON
          resistance FIGHTING, MINUS20
          move "Curse of the Blade", {
            text "Put 3 damage counters on each of your opponent’s Pokémon that has a Pokémon Tool card attached to it."
            energyCost P
            onAttack {
              opp.all.each{
                if(it.cards.filterByType(POKEMON_TOOL)) directDamage 30, it
              }
            }
          }

        };
      case AEGISLASH_49:
        return evolution (this, from:"Doublade", hp:HP150, type:PSYCHIC, retreatCost:2) {
          weakness DARKNESS
          resistance FIGHTING, MINUS20
          move "Ticking Knock Out", {
            text "During your next turn, if the Defending Pokémon is damaged by an attack, it will be Knocked Out."
            energyCost C
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == opp.active && it.dmg.value && it.notNoEffect) {
                      bc "Ticking Knock Out"
                      new Knockout(opp.active).run(bg)
                    }
                  }
                }
                before EVOLVE, defending, {unregister()}
                before SWITCH, defending, {unregister()}
                unregisterAfter 3
              }
            }
          }
          move "Draining Blade", {
            text "90 damage. Heal 30 damage from this Pokémon."
            energyCost P, P, P
            onAttack {
              damage 90
              afterDamage{
                heal 30, self
              }
            }
          }

        };
      case INKAY_50:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hypnosis", {
            text "Your opponent’s Active Pokémon is now Asleep."
            energyCost P
            onAttack {
              apply ASLEEP
            }
          }

        };
      case MALAMAR_51:
        return evolution (this, from:"Inkay", hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness PSYCHIC
          bwAbility "Psychic Recharge", {
            text "Once during your turn (before your attack), you may attach a [P] Energy card from your discard pile to 1 of your Benched Pokémon."
            actionA {
              checkLastTurn()
              assert my.bench
              assert my.discard.filterByBasicEnergyType(P)
              powerUsed()
              attachEnergyFrom(basic: true, type : P, my.discard, my.bench)
            }
          }
          move "Psychic Sphere", {
            text "60 damage."
            energyCost P, P, C
            onAttack {
              damage 60
            }
          }

        };
      case SKRELP_52:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hook", {
            text "10 damage."
            energyCost P
            onAttack {
              damage 10
            }
          }

        };
      case DRAGALGE_53:
        return evolution (this, from:"Skrelp", hp:HP120, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Poison Point", {
            text "If this Pokémon is your Active Pokémon and is damaged by an opponent’s attack (even if this Pokémon is Knocked Out), the Attacking Pokémon is now Poisoned."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Poison Point"
                  apply POISONED, (ef.attacker as PokemonCardSet), SRC_ABILITY
                }
              }
              after SWITCH, self, {unregister()}
            }
          }
          move "Twister", {
            text "60 damage. Flip 2 coins. For each heads, discard an Energy from your opponent’s Active Pokémon. If both of them are tails, this attack does nothing."
            energyCost P, C
            onAttack {
              def discardTimes = 0

              flip 2, { discardTimes += 1}
              if (discardTimes) damage 60 else bc "$thisMove failed due to 2 TAILS."

              afterDamage {
                discardTimes.times{ discardDefendingEnergy() }
              }
            }
          }
        };
      case HOOPA_54:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Hyperspace Ring", {
            text "Search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck."
            energyCost P
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 Item cards",cardTypeFilter(ITEM)).showToOpponent("Chosen cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Psy Bolt", {
            text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost P
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }

        };
      case POIPOLE_55:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Spit Poison", {
            text "Your opponent’s Active Pokémon is now Poisoned."
            energyCost C
            onAttack {
              apply POISONED
            }
          }
          move "Knockout Reviver", {
            text "During your opponent’s next turn, if this Pokémon is Knocked Out, your opponent can’t take any Prize cards for it."
            energyCost P, C
            onAttack {
              delayed{
                before TAKE_PRIZE, {
                  if(ef.pcs==self){
                    bc "No prize card for Mysterious Fossil"
                    prevent()
                  }
                }
                before EVOLVE, self, {unregister()}
                before SWITCH, self, {unregister()}
                unregisterAfter 2
              }
            }
          }

        };
      case NAGANADEL_GX_56:
        return evolution (this, from:"Poipole", hp:HP210, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          move "Beast Raid", {
            text "20× damage. This attack does 20 damage for each of your Ultra Beasts in play."
            energyCost C
            onAttack {
              damage 20*my.all.findAll{it.topPokemonCard.cardTypes.is(ULTRA_BEAST)}.size()
            }
          }
          move "Jet Needle", {
            text "110 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C, C
            onAttack {
              noWrDamage(110,defending)
            }
          }
          move "Stinger-GX", {
            text "Both players shuffle their Prize cards into their decks. Then, each player puts the top 3 cards of their deck face down as their Prize cards. (You can’t use more than 1 GX attack in a game.)"
            energyCost C, C, C
            onAttack {
              my.prizeCardSet.moveTo(my.deck)
              opp.prizeCardSet.moveTo(opp.deck)
              shuffleDeck()
              shuffleDeck(null, TargetPlayer.OPPONENT)
              for(int i=0;i<3;i++){
                my.prizeCardSet.add(my.deck.remove(0))
                opp.prizeCardSet.add(opp.deck.remove(0))
              }
            }
          }

        };
      case CUBONE_57:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Burdensome Bone", {
            text "40 damage. This Pokémon can’t attack during your next turn."
            energyCost C, C
            onAttack {
              damage 40
              cantAttackNextTurn self
            }
          }

        };
      case TORTERRA_58:
        return evolution (this, from:"Grotle", hp:HP180, type:FIGHTING, retreatCost:4) {
          weakness GRASS
          move "Giga Drain", {
            text "50 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
            energyCost F, F, C
            onAttack {
              damage 50
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Earthquake", {
            text "180 damage. This attack does 20 damage to each of your Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, F, F, C
            onAttack {
              damage 180
              my.bench.each{damage 20, it}
            }
          }

        };
      case INFERNAPE_59:
        return evolution (this, from:"Monferno", hp:HP130, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          bwAbility "Flaming Fighter", {
            text "Put 6 damage counters instead of 2 on your opponent’s Burned Pokémon between turns."
            getterA (GET_BURN_DAMAGE) {h->
              bc "${h.effect.target} : ${h.effect.target.owner} / $self : ${self.owner}"
              if(h.effect.target.owner != self.owner){
                bc "Scorching Scales increases burn damage to 40"
                h.object = hp(60)
              }
            }
          }
          move "Burst Punch", {
            text "50 damage. Your opponent’s Active Pokémon is now Burned."
            energyCost F, C
            onAttack {
              damage 50
              applyAfterDamage BURNED
            }
          }

        };
      case GIBLE_60:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
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
      case GABITE_61:
        return evolution (this, from:"Gible", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness GRASS
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
      case GARCHOMP_62:
        return evolution (this, from:"Gabite", hp:HP150, type:FIGHTING, retreatCost:0) {
          weakness GRASS
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

      case CROAGUNK_63:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Swagger", {
            text "10 damage. Flip a coin. If heads, discard an Energy from your opponent’s Active Pokémon."
            energyCost F
            onAttack {
              damage 10
              flip {afterDamage{discardDefendingEnergy()}}
            }
          }

        };
      case TOXICROAK_64:
        return evolution (this, from:"Croagunk", hp:HP100, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Poison Jab", {
            text "30 damage. Your opponent’s Active Pokémon is now Poisoned."
            energyCost F
            onAttack {
              damage 30
              applyAfterDamage POISONED
            }
          }
          move "Exact Revenge", {
            text "50+ damage. If any of your [P] Pokémon were Knocked Out by damage from an opponent’s attack during their last turn, this attack does 70 more damage."
            energyCost C, C
            onAttack {
              damage 50
              if(my.lastKnockoutByOpponentDamageTurn == bg.turnCount-1 && my.lastKnockoutTypes && my.lastKnockoutTypes.contains(P)) damage 70
            }
          }

        };
      case PANCHAM_65:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Act Tough", {
            text "10+ damage. If this Pokémon has any [D] Energy attached to it, this attack does 30 more damage."
            energyCost F
            onAttack {
              damage 10
              if(self.cards.energyCount(D)) damage 30
            }
          }

        };
      case BINACLE_66:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Allotment", {
            text "10 damage. Draw a card."
            energyCost F
            onAttack {
              damage 10
              draw 1
            }
          }

        };
      case BARBARACLE_67:
        return evolution (this, from:"Binacle", hp:HP130, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Seven Shock", {
            text "30 damage. If you have exactly 7 cards in your hand, your opponent’s Active Pokémon is now Paralyzed."
            energyCost F, C
            onAttack {
              damage 30
              if(my.hand.size() == 7) applyAfterDamage PARALYZED
            }
          }
          move "Claw Slash", {
            text "90 damage."
            energyCost F, C, C
            onAttack {
              damage 90
            }
          }

        };
      case TYRUNT_68:
        return evolution (this, from:"Unidentified Fossil", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Crunch", {
            text "20 damage. Flip a coin. If heads, discard an Energy from your opponent’s Active Pokémon."
            energyCost F
            onAttack {
              damage 20
              flip {afterDamage{discardDefendingEnergy()}}
            }
          }
          move "Hammer In", {
            text "40 damage."
            energyCost F, C
            onAttack {
              damage 40
            }
          }

        };
      case TYRANTRUM_69:
        return evolution (this, from:"Tyrunt", hp:HP160, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          bwAbility "Tyrannical Heart", {
            text "As long as you don’t have more Pokémon in play than your opponent, this Pokémon’s attacks do 60 more damage (before applying Weakness and Resistance), and it takes 30 less damage from attacks (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(self.owner.pbg.all.size() <= self.owner.opposite.pbg.all.size()){
                  bg.dm().each{
                    if(it.from==self && it.dmg.value && it.notNoEffect){
                      bc "+60 from Tyrantrum (Tyrannical Heart)"
                      it.dmg+=hp(60)
                    }
                    if(it.to==self && it.dmg.value && it.notNoEffect){
                      bc "-30 to Tyrantrum (Tyrannical Heart)"
                      it.dmg-=hp(30)
                    }
                  }
                }
              }
            }
          }
          move "Crunch", {
            text "100 damage. Discard an Energy from your opponent’s Active Pokémon."
            energyCost F, F, C
            onAttack {
              damage 100
              discardDefendingEnergy()
            }
          }

        };
      case HAWLUCHA_70:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "High Jump Kick", {
            text "20 damage."
            energyCost F
            onAttack {
              damage 20
            }
          }
          move "Sky Drop", {
            text "80- damage. This attack does 20 less damage for each [C] in your opponent’s Active Pokémon’s Retreat Cost."
            energyCost C, C, C
            onAttack {
              damage 80-20*opp.active.retreatCost
            }
          }

        };
      case ZYGARDE_71:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          bwAbility "Earthen Aura", {
            text "Damage from this Pokémon’s attacks isn’t affected by Weakness or Resistance."
            delayedA {
              before APPLY_WEAKNESS, {
                bg.dm().each{
                  if(it.from==self){
                    prevent()
                  }
                }
              }
              before APPLY_RESISTANCE, {
                bg.dm().each{
                  if(it.from==self){
                    prevent()
                  }
                }
              }
            }
          }
          move "Peace Maker", {
            text "30+ damage. If your opponent has an Ultra Beast in play, this attack does 30 more damage."
            energyCost F
            onAttack {
              damage 30
              if(opp.all.findAll{it.topPokemonCard.cardTypes.is(ULTRA_BEAST)}) damage 30
            }
          }

        };
      case ZYGARDE_72:
        return basic (this, hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Glare", {
            text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Calm Strike", {
            text "60+ damage. If you have used your GX attack, this attack does 60 more damage."
            energyCost F, C, C
            onAttack {
              damage 60
              if(bg.em().retrieveObject("gx_"+my.owner)) damage 60
            }
          }

        };
      case ZYGARDE_GX_73:
        return basic (this, hp:HP200, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          move "Cell Connector", {
            text "50 damage. Attach 2 [F] Energy cards from your discard pile to this Pokémon."
            energyCost C, C
            onAttack {
              damage 50
              attachEnergyFromDiscardPile(F)
              attachEnergyFromDiscardPile(F)
            }
          }
          move "Land’s Wrath", {
            text "130 damage."
            energyCost F, F, C, C
            onAttack {
              damage 130
            }
          }
          move "Verdict GX", {
            text "150 damage. Prevent all damage done to this Pokémon by attacks from Pokémon-GX and Pokémon-EX during your opponent’s next turn. (You can’t use more than 1 GX attack in a game.)"
            energyCost F, F, C, C
            attackRequirement {
              assert !bg.em().retrieveObject("gx_"+my.owner) || bg.em().retrieveObject("Bonnie")==bg.turnCount
            }
            onAttack {
              gxPerform()
              damage 150
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && (it.from.pokemonGX || it.from.pokemonEX)){
                      it.dmg = hp(0)
                      bc "Verdict GX prevents damage from Pokémon-GX and Pokémon-EX"
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }

        };
      case DIANCIE_PRISM_STAR_74:
        return basic (this, hp:HP120, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          bwAbility "Princess’s Cheers", {
            text "As long as this Pokémon is on your Bench, your [F] Pokémon’s attacks do 20 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker.owner == self.owner && self.benched) {
                  bg.dm().each {
                    if (it.from.types.contains(F) && it.to.active && it.to != self.owner && it.notNoEffect && it.dmg.value) {
                      bc "Princess’s Cheers +20"
                      it.dmg += hp(20)
                    }
                  }
                }
              }
            }
          }
          move "Diamond Rain", {
            text "90 damage. Heal 30 damage from each of your Benched Pokémon."
            energyCost F, F, F
            onAttack {
              damage 90
              afterDamage{
                my.bench.each{
                  heal 30, it
                }
              }
            }
          }

        };
      case ROCKRUFF_75:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Surprise Attack", {
            text "50 damage. Flip a coin. If tails, this attack does nothing."
            energyCost F, C
            onAttack {
              flip {damage 50}
            }
          }

        };
      case LYCANROC_76:
        return evolution (this, from:"Rockruff", hp:HP120, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Dangerous Rogue", {
            text "20+ damage. This attack does 20 more damage for each of your opponent’s Benched Pokémon."
            energyCost F, C
            onAttack {
              damage 20 + 20*opp.bench.size()
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
      case BUZZWOLE_77:
        return basic (this, hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Sledgehammer", {
            text "30+ damage. If your opponent has exactly 4 Prize cards remaining, this attack does 90 more damage."
            energyCost F
            onAttack {
              damage 30
              if(opp.prizeCardSet.size() == 4) damage 90
            }
          }
          move "Swing Around", {
            text "80+ damage. Flip 2 coins. This attack does 20 more damage for each heads."
            energyCost F, F, C
            onAttack {
              damage 80
              flip 2,{damage 20}
            }
          }

        };
      case PANGORO_78:
        return evolution (this, from:"Pancham", hp:HP130, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Untamed Punch", {
            text "50+ damage. If this Pokémon has any damage counters on it, this attack does 50 more damage, and both Active Pokémon are now Confused."
            energyCost D, C
            onAttack {
              damage 50
              if(self.numberOfDamageCounters) {
                damage 50
                afterDamage{
                  apply CONFUSED
                  apply CONFUSED, self
                }
              }
            }
          }
          move "Double Stomp", {
            text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
            energyCost D, D, C
            onAttack {
              damage 80
              flip 2,{damage 40}
            }
          }

        };
      case YVELTAL_GX_79:
        return basic (this, hp:HP180, type:DARKNESS, retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Absorb Vitality", {
            text "20 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
            energyCost D
            onAttack {
              damage 20
              removeDamageCounterEqualToDamageDone()
            }
          }
          move "Sonic Evil", {
            text "100 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C, C, C
            onAttack {
              noWrDamage(100,defending)
            }
          }
          move "Doom Count GX", {
            text "If your opponent’s Active Pokémon has exactly 4 damage counters on it, that Pokémon is Knocked Out. (You can’t use more than 1 GX attack in a game.)"
            energyCost D
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              if(defending.numberOfDamageCounters == 4){
                new Knockout(opp.active).run(bg)
              }
            }
          }

        };
      case GUZZLORD_80:
        return basic (this, hp:HP160, type:DARKNESS, retreatCost:4) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS20
          move "Lord’s Valley", {
            text "160 damage. If you have exactly 2, 4, or 6 Prize cards remaining, discard the top 10 cards of your deck."
            energyCost D, D, D, D
            attackRequirement {
              assert my.deck
            }
            onAttack {
              damage 160
              if(my.prizeCardSet.size() == 2 || my.prizeCardSet.size() == 4 || my.prizeCardSet.size() == 6) my.deck.subList(0, 10).discard()
            }
          }

        };
      case EMPOLEON_81:
        return evolution (this, from:"Prinplup", hp:HP160, type:METAL, retreatCost:2) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
          move "Total Command", {
            text "20× damage. This attack does 20 damage for each Benched Pokémon (both yours and your opponent’s)."
            energyCost M, C
            onAttack {
              damage 20 * (my.bench.size()+opp.bench.size())
            }
          }
          move "Whirlpool", {
            text "90 damage. Discard an Energy from your opponent’s Active Pokémon."
            energyCost M, M, C
            onAttack {
              damage 90
              discardDefendingEnergy()
            }
          }

        };
      case DIALGA_GX_82:
        return basic (this, hp:HP180, type:METAL, retreatCost:3) {
          weakness FIRE
          resistance PSYCHIC, MINUS20
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
            text "150 damage. Take another turn after this one. (Skip the between turns step.) (You can’t use more than 1 GX attack in a game.)"
            energyCost M, M, M, C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 150
              afterDamage{
                delayed (priority: BEFORE_LAST) {
                  before BETWEEN_TURNS, {
                    prevent()
                    bg.turnCount += 1
                    draw 1
                    bc "Timeless GX started a new turn!"
                    unregister()
                  }
                }
              }
            }
          }

        };
      case FLABEBE_83:
        return basic (this, hp:HP030, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          bwAbility "Evolutionary Advantage", {
            text "If you go second, this Pokémon can evolve during your first turn."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if(bg.turnCount == 2) prevent()
              }
            }
          }
          move "Tackle", {
            text "10 damage."
            energyCost Y
            onAttack {
              damage 10
            }
          }

        };
      case FLABEBE_84:
        return basic (this, hp:HP040, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Secret Blessings", {
            text "Shuffle 3 in any combination of Pokémon and basic Energy cards from your discard pile into your deck."
            energyCost Y
            onAttack {
              def tar = my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)}
              if(tar) tar.select(count : 3).moveTo(my.deck)
              shuffleDeck()
            }
          }

        };
      case FLOETTE_85:
        return evolution (this, from:"Flabébé", hp:HP070, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Swirling Petals", {
            text "Switch 1 of your opponent’s Benched Pokémon with their Active Pokémon. If you do, switch this Pokémon with 1 of your Benched Pokémon."
            energyCost Y
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw defending, opp.bench.select("New opponent’s Active")
              if(my.bench) sw self, my.bench.select("Your new Active")
            }
          }

        };
      case FLORGES_86:
        return evolution (this, from:"Floette", hp:HP120, type:FAIRY, retreatCost:2) {
          weakness METAL
          resistance DARKNESS, MINUS20
          bwAbility "Wondrous Gift", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, put an Item card from your discard pile on top of your deck."
            actionA {
              checkLastTurn()
              assert my.discard.filterByType(ITEM)
              powerUsed()
              flip {
                def tar = my.discard.filterByType(ITEM).select().first()
                my.discard.remove(tar)
                my.deck.add(0, tar)
              }
            }
          }
          move "Mist Guard", {
            text "70 damage. Prevent all damage done to this Pokémon by attacks from [N] Pokémon during your opponent’s next turn."
            energyCost Y, Y, C
            onAttack {
              damage 70
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.notNoEffect && (it.from.types.contains(N))){
                      it.dmg = hp(0)
                      bc "Mist Guard prevents damage from Dragon Pokémon"
                    }
                  }
                }
                unregisterAfter 2
              }
            }
          }

        };
      case SYLVEON_87:
        return evolution (this, from:"Eevee", hp:HP090, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Wink Wink", {
            text "Your opponent reveals their hand. You may discard a Supporter card you find there and use the effect of that card as the effect of this attack."
            energyCost C
            attackRequirement {
              assert opp.hand
            }
            onAttack {
              if(opp.hand.hasType(SUPPORTER)){
                def card=opp.hand.select("Opponent's hand. Select a supporter.", cardTypeFilter(SUPPORTER)).first()
                discard card
                bg.deterministicCurrentThreadPlayerType=self.owner
                bg.em().run(new PlayTrainer(card))
                bg.clearDeterministicCurrentThreadPlayerType()
              } else {
                opp.hand.showToMe("Opponent's hand. No supporter in there.")
              }
            }
          }
          move "Magical Shot", {
            text "40 damage."
            energyCost Y, C
            onAttack {
              damage 40
            }
          }

        };
      case DEDENNE_88:
        return basic (this, hp:HP060, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Find a Friend", {
            text "Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
            energyCost Y
            attackRequirement {
              assert deck.notEmpty
            }
            onAttack {
              my.deck.search(count : 1, cardTypeFilter(POKEMON)).showToOpponent("Selected Pokémon").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Electrichain", {
            text "30+ damage. If you have any [L] Pokémon on your Bench, this attack does 30 more damage."
            energyCost C, C
            onAttack {
              damage 30
              if(my.bench.findAll{it.types.contains(L)}) damage 30
            }
          }

        };
      case KLEFKI_89:
        return basic (this, hp:HP070, type:FAIRY, retreatCost:1) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Metal Sound", {
            text "Your opponent’s Active Pokémon is now Confused."
            energyCost C
            onAttack {
              apply CONFUSED
            }
          }
          move "Fairy Lock", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 20
              cantRetreat(defending)
            }
          }

        };
      case XERNEAS_GX_90:
        return basic (this, hp:HP180, type:FAIRY, retreatCost:2) {
          weakness METAL
          resistance DARKNESS, MINUS20
          move "Overrun", {
            text "20 damage. This attack does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            onAttack {
              damage 20
              if(opp.bench) damage 20, opp.bench.select()
            }
          }
          move "Aurora Horns", {
            text "120 damage."
            energyCost Y, Y, C
            onAttack {
              damage 120
            }
          }
          move "Sanctuary GX", {
            text "Move all damage counters from each of your Pokémon to your opponent’s Active Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost Y, Y, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              my.all.each{
                defending.damage+=it.damage
                it.damage-=it.damage
              }
            }
          }

        };
      case GOOMY_91:
        return basic (this, hp:HP040, type:DRAGON, retreatCost:1) {
          weakness FAIRY
          bwAbility "Sticky Membrane", {
            text "As long as this Pokémon is your Active Pokémon, your opponent’s Pokémon’s attacks cost [C] more."
            getterA GET_MOVE_LIST, {h->
              if(self.active && h.effect.target.owner == self.owner.opposite){
                def list=[]
                for(move in h.object){
                  def copy=move.shallowCopy()
                  copy.energyCost.add(C)
                  list.add(copy)
                }
                h.object=list
              }
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
      case GOOMY_92:
        return basic (this, hp:HP050, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          move "Rain Splash", {
            text "10 damage."
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Flail", {
            text "10× damage. This attack does 10 damage for each damage counter on this Pokémon."
            energyCost C, C
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }

        };
      case SLIGGOO_93:
        return evolution (this, from:"Goomy", hp:HP080, type:DRAGON, retreatCost:2) {
          resistance FAIRY, MINUS20
          move "Absorb", {
            text "30 damage. Heal 30 damage from this Pokémon."
            energyCost W, C
            onAttack {
              damage 30
              afterDamage{heal 30, self}
            }
          }
          move "Hammer In", {
            text "50 damage."
            energyCost W, Y, C
            onAttack {
              damage 50
            }
          }

        };
      case GOODRA_94:
        return evolution (this, from:"Sliggoo", hp:HP160, type:DRAGON, retreatCost:3) {
          weakness FAIRY
          bwAbility "Hydration", {
            text "Whenever you attach a [W] Energy card from your hand to this Pokémon, heal 20 damage from it."
            delayedA{
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(W) && bg.currentTurn == self.owner) {
                  wcu "Hydration"
                  heal 20, ef.resolvedTarget
                }
              }
            }
          }
          move "Soaking Horn", {
            text "80+ damage. If this Pokémon was healed during this turn, this attack does 80 more damage."
            energyCost W, Y, C
            onAttack {
              damage 80
              if(self.lastHealedTurn == bg.turnCount) damage 80
            }
          }

        };
      case ULTRA_NECROZMA_GX_95:
        return basic (this, hp:HP190, type:DRAGON, retreatCost:2) {
          weakness FAIRY
          move "Photon Geyser", {
            text "20+ damage. Discard all basic [P] Energy from this Pokémon. This attack does 80 more damage for each card you discarded in this way."
            energyCost P, M
            onAttack {
              damage 20
              damage 80*self.cards.filterByBasicEnergyType(P).discard().size()
            }
          }
          move "Sky-Scorching Light GX", {
            text "You can use this attack only if the total of both players’ remaining Prize cards is 6 or less. Put 6 damage counters on each of your opponent’s Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost P, M
            attackRequirement {
              gxCheck()
              assert (my.prizeCardSet.size() + opp.prizeCardSet.size())<= 6
            }
            onAttack {
              gxPerform()
              opp.bench.each{ // this ordering ensures the bench receive damage first to not conflict with Sky Pillar
                directDamage 60, it
              }
              directDamage 60, opp.active
            }
          }

        };
      case ARCEUS_PRISM_STAR_96:
        return basic (this, hp:HP160, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          bwAbility "First Law", {
            text "Prevent all effects of your opponent’s attacks, except damage, done to this Pokémon."
            delayedA {
              before null, self, Source.ATTACK, {
                if(bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)){
                  bc "First Law prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Trinity Star", {
            text "30 damage. You can use this attack only if you have [G], [W], and [L] Pokémon on your Bench. Search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck."
            energyCost C
            attackRequirement {
              assert my.bench.findAll{it.types.contains(G)}.notEmpty && my.bench.findAll{it.types.contains(W)}.notEmpty && my.bench.findAll{it.types.contains(L)}.notEmpty
            }
            onAttack {
              damage 30
              attachEnergyFrom(basic : true, my.deck, my.all)
              attachEnergyFrom(basic : true, my.deck, my.all)
              attachEnergyFrom(basic : true, my.deck, my.all)
            }
          }

        };
      case BUNNELBY_97:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          move "Collect", {
            text "Draw a card."
            energyCost C
            onAttack {
              draw 1
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
      case DIGGERSBY_98:
        return evolution (this, from:"Bunnelby", hp:HP130, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          move "Mountaintop Mining", {
            text "60+ damage. You may do 40 more damage. If you do, discard the top 2 cards of your deck."
            energyCost C, C, C
            onAttack {
              damage 60
              if(confirm("Discard the top 2 cards of your deck and do 40 more damage?")){
                my.deck.subList(0,2).discard()
                damage 40
              }
            }
          }
          move "Rock Cannon", {
            text "80× damage. Flip a coin until you get tails. This attack does 80 damage for each heads."
            energyCost C, C, C, C
            onAttack {
              flipUntilTails {damage 80}
            }
          }

        };
      case FURFROU_99:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Return", {
            text "20 damage. You may draw cards until you have 5 cards in your hand."
            energyCost C
            onAttack {
              damage 20
              if(my.hand.size() < 5 && my.deck.notEmpty){
                if(confirm("draw cards until you have 5 cards in your hand?")){
                  draw 5-my.hand.size()
                }
              }
            }
          }

        };
      case NOIBAT_100:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Ram", {
            text "10 damage."
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Destructive Sound", {
            text "Your opponent reveals their hand. Discard all Item cards you find there."
            energyCost C, C
            onAttack {
              opp.hand.showToMe("Opponent's hand").filterByType(ITEM).discard()
            }
          }

        };
      case NOIVERN_101:
        return evolution (this, from:"Noibat", hp:HP120, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS20
          move "Supersonic", {
            text "20 damage. Your opponent’s Active Pokémon is now Confused."
            energyCost C
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
            }
          }
          move "Resonance", {
            text "70+ damage. If your opponent’s Active Pokémon is Confused, this attack does 70 more damage."
            energyCost C, C, C
            onAttack {
              damage 70
              if(opp.active.isSPC(CONFUSED)) damage 70
            }
          }

        };
      case BEAST_RING_102:
        return itemCard (this) {
          text "You can play this card only if your opponent has exactly 3 or 4 Prize cards remaining.\nSearch your deck for up to 2 basic Energy cards and attach them to 1 of your Ultra Beasts. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def pcs = my.all.findAll{it.topPokemonCard.cardTypes.is(ULTRA_BEAST)}.select("Attach To?")
            attachEnergyFrom(basic: true, my.deck, pcs)
            attachEnergyFrom(basic: true, my.deck, pcs)
          }
          playRequirement{
            assert (opp.prizeCardSet.size() == 3 || opp.prizeCardSet.size() == 4) : " Your opponent need to have exactly 3 or 4 Prize cards remaining"
            assert my.all.findAll{it.topPokemonCard.cardTypes.is(ULTRA_BEAST)} : "No Ultra Beast in play."
          }
        };
      case BONNIE_103:
        return supporter (this) {
          text "You can play this card only if there is any Stadium card in play.\nDiscard that Stadium card. During this turn, your Zygarde-GX can use its GX attack even if you have used your GX attack.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            discard bg.stadiumInfoStruct.stadiumCard
            bg.em().storeObject("Bonnie",bg.turnCount)
          }
          playRequirement{
            assert bg.stadiumInfoStruct && stadiumCanBeAffectedByItemAndSupporter()
          }
        };
      case CRASHER_WAKE_104:
        return supporter (this) {
          text "Discard 2 [W] Energy cards from your hand. If you do, search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.filterByEnergyType(W).select(count : 2).discard()
            my.deck.search(max : 2,"Select 2 cards",{true}).moveTo(hidden:true,my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.filterByEnergyType(W).size() >= 2
            assert my.deck
          }
        };
      case DIANTHA_105:
        return supporter (this) {
          text "You can play this card only if 1 of your [Y] Pokémon was Knocked Out during your opponent’s last turn.\nPut 2 cards from your discard pile into your hand.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.discard.select(count : Math.min(2,my.discard.size())).moveTo(my.hand)
          }
          playRequirement{
            assert bg.turnCount
            assert my.lastKnockoutByOpponentDamageTurn == bg.turnCount - 1: "No Pokémon has been Knocked Out during your opponent’s last turn"
            assert my.knockoutTypesPerTurn.get(bg.turnCount - 1)?.contains(Y) : "The Pokémon Knocked Out was not Fairy"
          }
        };
      case ENEPORTER_106:
        return itemCard (this) {
          text "Move a Special Energy from 1 of your opponent’s Pokémon to another of their Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def src = opp.all.findAll{it.cards.filterByType(SPECIAL_ENERGY)}.select("Select the source pokémon for the Special Energy")
            def tar = opp.all.findAll{it != src}.select("Select the Pokémon that will recieve the Special Energy")
            energySwitch(src, tar, src.cards.filterByType(SPECIAL_ENERGY).select().first())
          }
          playRequirement{
            assert opp.bench
            assert opp.all.findAll{it.cards.filterByType(SPECIAL_ENERGY)}
          }
        };
      case FOSSIL_EXCAVATION_MAP_107:
        return itemCard (this) {
          text "Choose 1:\n Search your deck for an Unidentified Fossil card, reveal it, and put it into your hand. Then, shuffle your deck.\n Put an Unidentified Fossil card from your discard pile into your hand. \nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            def choice = 1
            if(my.discard.findAll{it.name== "Unidentified Fossil"}){
              choice = choose([1,2],['Search your deck for an Unidentified Fossil card, reveal it, and put it into your hand. Then, shuffle your deck.', 'Put an Unidentified Fossil card from your discard pile into your hand.'], "Choose 1")
            }
            if(choice == 1){
              my.deck.search(count : 1,"Search for an Unidentified Fossil card",{it.name == "Unidentified Fossil"}).showToOpponent("Unidentified Fossil").moveTo(my.hand)
              shuffleDeck()
            }
            if(choice == 2){
              my.discard.findAll{it.name== "Unidentified Fossil"}.select().moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.deck.notEmpty || my.discard.findAll{it.name== "Unidentified Fossil"}
          }
        };
      case JUDGE_108:
        return supporter (this) {
          text "Each player shuffles their hand into their deck and draws 4 cards.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).moveTo(hidden:true,my.deck)
            opp.hand.moveTo(hidden:true,opp.deck)
            shuffleDeck()
            shuffleDeck(null, TargetPlayer.OPPONENT)
            draw 4
            draw(4, TargetPlayer.OPPONENT)
          }
          playRequirement{
          }
        };
      case LADY_109:
        return supporter (this) {
          text "Search your deck for up to 4 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.deck.search(max : 4,"Search for up to 4 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand
          }
        };
      case LYSANDRE_PRISM_STAR_110:
        return supporter (this) {
          text "♢ (Prism Star) Rule: You can’t have more than 1 ♢ card with the same name in your deck. If a ♢ card would go to the discard pile, put it in the Lost Zone instead.\nFor each of your [R] Pokémon in play, put a card from your opponent’s discard pile in the Lost Zone.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            my.all.each{
              if(it.types.contains(R) && opp.discard) opp.discard.select("choose a card to send to the lost zone").moveTo(opp.lostZone)
            }
          }
          playRequirement{
            assert my.all.findAll{it.types.contains(R)}
          }
        };
      case LYSANDRE_LABS_111:
        return stadium (this) {
          text "Pokémon Tool cards in play (both yours and your opponent’s) have no effect.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def eff
          onPlay {
            eff = delayed {
              def disable={card,pcs->
                def dset = bg.em().retrieveObject("Tool Concealment dset") as Set
                if(!dset.contains(card)){
                  card.removeFromPlay(bg, pcs)
                  dset.add(card)
                }
              }
              after PLAY_POKEMON_TOOL, {disable(ef.cardToPlay,ef.target)}
              after PLAY_POKEMON_TOOL_FLARE, {disable(ef.cardToPlay,ef.target)}
            }

            def count = (bg.em().retrieveObject("Tool Concealment count") ?: 0) + 1
            if (count == 1){
              def dset = bg.em().retrieveObject("Tool Concealment dset") as Set ?: [] as Set
              all.each {
                def pcs = it
                it.cards.filterByType(POKEMON_TOOL).each {
                  if(!dset.contains(it)){
                    it.removeFromPlay(bg, pcs)
                    dset.add(it)
                  }
                }
              }
              bg.em().storeObject("Tool Concealment dset", dset)
            }
            bg.em().storeObject("Tool Concealment count", count)
          }
          onRemoveFromPlay{
            eff.unregister()

            def count = (bg.em().retrieveObject("Tool Concealment count") ?: 0) - 1
            if(count == 0){
              def dset = bg.em().retrieveObject("Tool Concealment dset") as Set
              all.each {
                def pcs = it
                it.cards.filterByType(POKEMON_TOOL).each {
                  if(dset.contains(it)){
                    it.play(bg, pcs)
                    dset.remove(it)
                  }
                }
              }
            }
            if(count >= 0) bg.em().storeObject("Tool Concealment count", count)
          }
        };
      case METAL_FRYING_PAN_112:
        return pokemonTool (this) {
          text "Attach a Pokémon Tool to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it.\nThe [M] Pokémon this card is attached to takes 30 less damage from your opponent’s attacks (after applying Weakness and Resistance) and has no Weakness.\nYou may play as many Item cards as you like during your turn (before your attack)."
          def eff1
          def eff2
          onPlay {reason->
            eff1 = getter GET_WEAKNESSES, self, {h ->
              if(self.types.contains(M)){
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
            eff2 = delayed{
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && self.types.contains(M)){
                    bc "Metal Frying Pan -30"
                    it.dmg-=hp(30)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
            eff2.unregister()
          }
        };
      case MYSTERIOUS_TREASURE_113:
        return itemCard (this) {
          text "Discard a card from your hand. If you do, search your deck for a [P] or [N] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack)."
          onPlay {
            my.hand.getExcludedList(thisCard).select("Select a card to discard.").discard()
            my.deck.search("Select a [P] or [N] Pokémon.", {it.cardTypes.is(POKEMON) && (it.types.contains(P) || it.types.contains(N))}).moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard)
          }
        };
      case ULTRA_RECON_SQUAD_114:
        return supporter (this) {
          text "Discard up to 2 Ultra Beast cards from your hand. Draw 3 cards for each card you discarded in this way.\nYou may play only 1 Supporter card during your turn (before your attack)."
          onPlay {
            def tar = my.hand.filterByType(ULTRA_BEAST).select(max : 2)
            draw 3*tar.size()
            tar.discard()
          }
          playRequirement{
          }
        };
      case ULTRA_SPACE_115:
        return stadium (this) {
          text "Once during each player’s turn, that player may search their deck for an Ultra Beast card, reveal it, put it into their hand, and shuffle their deck.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Ultra Space") {
              assert my.deck
              assert lastTurn != bg().turnCount : "Already used"
              bc "Used Ultra Space effect"
              lastTurn = bg().turnCount
              deck.search {Card c->c.cardTypes.is(ULTRA_BEAST)}.moveTo(my.hand)
              shuffleDeck()
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case UNIDENTIFIED_FOSSIL_116:
        return copy (UltraPrism.UNIDENTIFIED_FOSSIL_134, this);
      case BEAST_ENERGY_PRISM_STAR_117:
        return specialEnergy (this, [[C]]) {
          text "♢ (Prism Star) Rule: You can’t have more than 1 ♢ card with the same name in your deck. If a ♢ card would go to the discard pile, put it in the Lost Zone instead.\nThis card provides [C] Energy.\nWhile this card is attached to an Ultra Beast, it provides every type of Energy but provides only 1 Energy at a time. The attacks of the Ultra Beast this card is attached to do 30 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
          def eff
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(it.from == self && it.to.active && it.to.owner != self.owner && self.topPokemonCard.cardTypes.is(ULTRA_BEAST) && it.dmg.value) {
                    bc "Beast Energy +30"
                    it.dmg += hp(30)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
          }
          getEnergyTypesOverride{
            if(self != null && self.topPokemonCard.cardTypes.is(ULTRA_BEAST)) {
              return [[R, D, F, G, W, Y, L, M, P] as Set]
            }
            else {
              return [[C] as Set]
            }
          }
        };
      case UNIT_ENERGY_FDY_118:
        return specialEnergy (this, [[C]]) {
          text "This card provides [C] Energy.\nWhile this card is attached to a Pokémon, it provides [F], [D], and [Y] Energy but provides only 1 Energy at a time."
          // TODO: Request appropriate typeImageOverride be added
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          getEnergyTypesOverride {
            self != null ? [[F,D,Y] as Set] : [[C] as Set]
          }
        };

      case PALKIA_GX_119:
        return copy (PALKIA_GX_20, this);
      case GRENINJA_GX_120:
        return copy (GRENINJA_GX_24, this);
      case NAGANADEL_GX_121:
        return copy (NAGANADEL_GX_56, this);
      case LUCARIO_GX_122:
        return evolution (this, from:"Riolu", hp:HP210, type:FIGHTING, retreatCost:2) {
          weakness PSYCHIC
          move "Aura Strike", {
            text "30+ damage. If this Pokémon evolved from Riolu during this turn, this attack does 90 more damage."
            energyCost F
            onAttack {
              damage 30
              if(self.lastEvolved == bg.turnCount){
                damage 90
              }
            }
          }
          move "Cyclone Kick", {
            text "130 damage."
            energyCost F, F, C
            onAttack {
              damage 130
            }
          }
          move "Cantankerous Beatdown GX", {
            text "30× damage. This attack does 30 damage for each damage counter on this Pokémon. (You can’t use more than 1 GX attack in a game.)"
            energyCost C, C
            attackRequirement {
              gxCheck()
            }
            onAttack {
              gxPerform()
              damage 30*self.numberOfDamageCounters
            }
          }

        };
      case ZYGARDE_GX_123:
        return copy (ZYGARDE_GX_73, this);
      case YVELTAL_GX_124:
        return copy (YVELTAL_GX_79, this);
      case DIALGA_GX_125:
        return copy (DIALGA_GX_82, this);
      case XERNEAS_GX_126:
        return copy (XERNEAS_GX_90, this);
      case ULTRA_NECROZMA_GX_127:
        return copy (ULTRA_NECROZMA_GX_95, this);
      case BONNIE_128:
        return copy (BONNIE_103, this);
      case CRASHER_WAKE_129:
        return copy (CRASHER_WAKE_104, this);
      case DIANTHA_130:
        return copy (DIANTHA_105, this);
      case ULTRA_RECON_SQUAD_131:
        return copy (ULTRA_RECON_SQUAD_114, this);
      case PALKIA_GX_132:
        return copy (PALKIA_GX_20, this);
      case GRENINJA_GX_133:
        return copy (GRENINJA_GX_24, this);
      case NAGANADEL_GX_134:
        return copy (NAGANADEL_GX_56, this);
      case LUCARIO_GX_135:
        return copy (LUCARIO_GX_122, this);
      case ZYGARDE_GX_136:
        return copy (ZYGARDE_GX_73, this);
      case YVELTAL_GX_137:
        return copy (YVELTAL_GX_79, this);
      case DIALGA_GX_138:
        return copy (DIALGA_GX_82, this);
      case XERNEAS_GX_139:
        return copy (XERNEAS_GX_90, this);
      case ULTRA_NECROZMA_GX_140:
        return copy (ULTRA_NECROZMA_GX_95, this);
      case BEAST_RING_141:
        return copy (BEAST_RING_102, this);
      case ENEPORTER_142:
        return copy (ENEPORTER_106, this);
      case ENERGY_RECYCLER_143:
        return copy (GuardiansRising.ENERGY_RECYCLER_123, this);
      case METAL_FRYING_PAN_144:
        return copy (METAL_FRYING_PAN_112, this);
      case MYSTERIOUS_TREASURE_145:
        return copy (MYSTERIOUS_TREASURE_113, this);
      case UNIT_ENERGY_FDY_146:
        return copy (UNIT_ENERGY_FDY_118, this);
      default:
        return null;
    }
  }

}
