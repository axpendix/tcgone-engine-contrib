package tcgwars.logic.impl.pokemod

import tcgwars.logic.card.*
import tcgwars.logic.impl.gen1.BaseSet
import tcgwars.logic.impl.gen1.Jungle
import tcgwars.logic.util.CardTypeSet

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.basicEnergy
import static tcgwars.logic.groovy.TcgBuilders.copy

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodBaseSet2 implements CardInfo {

  ALAKAZAM_1 ("Alakazam", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  BLASTOISE_2 ("Blastoise", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  CHANSEY_3 ("Chansey", 3, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  CHARIZARD_4 ("Charizard", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  CLEFABLE_5 ("Clefable", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  CLEFAIRY_6 ("Clefairy", 6, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  GYARADOS_7 ("Gyarados", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HITMONCHAN_8 ("Hitmonchan", 8, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  MAGNETON_9 ("Magneton", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MEWTWO_10 ("Mewtwo", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOKING_11 ("Nidoking", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  NIDOQUEEN_12 ("Nidoqueen", 12, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  NINETALES_13 ("Ninetales", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  PIDGEOT_14 ("Pidgeot", 14, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  POLIWRATH_15 ("Poliwrath", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  RAICHU_16 ("Raichu", 16, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SCYTHER_17 ("Scyther", 17, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  VENUSAUR_18 ("Venusaur", 18, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF_19 ("Wigglytuff", 19, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ZAPDOS_20 ("Zapdos", 20, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  BEEDRILL_21 ("Beedrill", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DRAGONAIR_22 ("Dragonair", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUGTRIO_23 ("Dugtrio", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ELECTABUZZ_24 ("Electabuzz", 24, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRODE_25 ("Electrode", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KANGASKHAN_26 ("Kangaskhan", 26, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MR__MIME_27 ("Mr. Mime", 27, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  PIDGEOTTO_28 ("Pidgeotto", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR_29 ("Pinsir", 29, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SNORLAX_30 ("Snorlax", 30, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  VENOMOTH_31 ("Venomoth", 31, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL_32 ("Victreebel", 32, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ARCANINE_33 ("Arcanine", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  BUTTERFREE_34 ("Butterfree", 34, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CHARMELEON_35 ("Charmeleon", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DEWGONG_36 ("Dewgong", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DODRIO_37 ("Dodrio", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DRATINI_38 ("Dratini", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  EXEGGUTOR_39 ("Exeggutor", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  FARFETCH_D_40 ("Farfetch'd", 40, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  FEAROW_41 ("Fearow", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GROWLITHE_42 ("Growlithe", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  HAUNTER_43 ("Haunter", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  IVYSAUR_44 ("Ivysaur", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  JYNX_45 ("Jynx", 45, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  KADABRA_46 ("Kadabra", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KAKUNA_47 ("Kakuna", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKITUNG_48 ("Lickitung", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MACHOKE_49 ("Machoke", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGIKARP_50 ("Magikarp", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  MAGMAR_51 ("Magmar", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MAROWAK_52 ("Marowak", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDORINA_53 ("Nidorina", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINO_54 ("Nidorino", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PARASECT_55 ("Parasect", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PERSIAN_56 ("Persian", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  POLIWHIRL_57 ("Poliwhirl", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RATICATE_58 ("Raticate", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  RHYDON_59 ("Rhydon", 59, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEAKING_60 ("Seaking", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SEEL_61 ("Seel", 61, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  TAUROS_62 ("Tauros", 62, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WARTORTLE_63 ("Wartortle", 63, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WEEPINBELL_64 ("Weepinbell", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ABRA_65 ("Abra", 65, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BELLSPROUT_66 ("Bellsprout", 66, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BULBASAUR_67 ("Bulbasaur", 67, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CATERPIE_68 ("Caterpie", 68, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHARMANDER_69 ("Charmander", 69, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CUBONE_70 ("Cubone", 70, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DIGLETT_71 ("Diglett", 71, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DODUO_72 ("Doduo", 72, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DROWZEE_73 ("Drowzee", 73, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EXEGGCUTE_74 ("Exeggcute", 74, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GASTLY_75 ("Gastly", 75, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GOLDEEN_76 ("Goldeen", 76, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  JIGGLYPUFF_77 ("Jigglypuff", 77, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MACHOP_78 ("Machop", 78, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEMITE_79 ("Magnemite", 79, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MEOWTH_80 ("Meowth", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  METAPOD_81 ("Metapod", 81, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORAN_FEMALE_82 ("Nidoran♀", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  NIDORAN_MALE_83 ("Nidoran♂", 83, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ONIX_84 ("Onix", 84, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PARAS_85 ("Paras", 85, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIDGEY_86 ("Pidgey", 86, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PIKACHU_87 ("Pikachu", 87, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  POLIWAG_88 ("Poliwag", 88, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RATTATA_89 ("Rattata", 89, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  RHYHORN_90 ("Rhyhorn", 90, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SANDSHREW_91 ("Sandshrew", 91, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SPEAROW_92 ("Spearow", 92, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_93 ("Squirtle", 93, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARMIE_94 ("Starmie", 94, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  STARYU_95 ("Staryu", 95, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TANGELA_96 ("Tangela", 96, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VENONAT_97 ("Venonat", 97, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_98 ("Voltorb", 98, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  VULPIX_99 ("Vulpix", 99, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WEEDLE_100 ("Weedle", 100, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  COMPUTER_SEARCH_101 ("Computer Search", 101, Rarity.RARE, [TRAINER]),
  IMPOSTER_PROFESSOR_OAK_102 ("Imposter Professor Oak", 102, Rarity.RARE, [TRAINER]),
  ITEM_FINDER_103 ("Item Finder", 103, Rarity.RARE, [TRAINER]),
  LASS_104 ("Lass", 104, Rarity.RARE, [TRAINER]),
  POKEMON_BREEDER_105 ("Pokémon Breeder", 105, Rarity.RARE, [TRAINER]),
  POKEMON_TRADER_106 ("Pokémon Trader", 106, Rarity.RARE, [TRAINER]),
  SCOOP_UP_107 ("Scoop Up", 107, Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_REMOVAL_108 ("Super Energy Removal", 108, Rarity.RARE, [TRAINER]),
  DEFENDER_109 ("Defender", 109, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETRIEVAL_110 ("Energy Retrieval", 110, Rarity.COMMON, [TRAINER]),
  FULL_HEAL_111 ("Full Heal", 111, Rarity.UNCOMMON, [TRAINER]),
  MAINTENANCE_112 ("Maintenance", 112, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_113 ("PlusPower", 113, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CENTER_114 ("Pokémon Center", 114, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_115 ("Pokédex", 115, Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_OAK_116 ("Professor Oak", 116, Rarity.UNCOMMON, [TRAINER]),
  SUPER_POTION_117 ("Super Potion", 117, Rarity.UNCOMMON, [TRAINER]),
  BILL_118 ("Bill", 118, Rarity.COMMON, [TRAINER]),
  ENERGY_REMOVAL_119 ("Energy Removal", 119, Rarity.COMMON, [TRAINER]),
  GUST_OF_WIND_120 ("Gust of Wind", 120, Rarity.COMMON, [TRAINER]),
  POKE_BALL_121 ("Poké Ball", 121, Rarity.COMMON, [TRAINER]),
  POTION_122 ("Potion", 122, Rarity.COMMON, [TRAINER]),
  SWITCH_123 ("Switch", 123, Rarity.COMMON, [TRAINER]),
  DOUBLE_COLORLESS_ENERGY_124 ("Double Colorless Energy", 124, Rarity.UNCOMMON, [CardType.SPECIAL_ENERGY, ENERGY]),
  FIGHTING_ENERGY_125 ("Fighting Energy", 125, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_126 ("Fire Energy", 126, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  GRASS_ENERGY_127 ("Grass Energy", 127, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_128 ("Lightning Energy", 128, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_129 ("Psychic Energy", 129, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_130 ("Water Energy", 130, Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodBaseSet2(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.POKEMOD_BASE_SET_2;
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
    switch (this){
      case ALAKAZAM_1:
        return copy(BaseSet.ALAKAZAM, this)
      case BLASTOISE_2:
        return copy(BaseSet.BLASTOISE, this)
      case CHANSEY_3:
        return copy(BaseSet.CHANSEY, this)
      case CHARIZARD_4:
        return copy(BaseSet.CHARIZARD, this)
      case CLEFABLE_5:
        return copy(Jungle.CLEFABLE, this)
      case CLEFAIRY_6:
        return copy(BaseSet.CLEFAIRY, this)
      case GYARADOS_7:
        return copy(BaseSet.GYARADOS, this)
      case HITMONCHAN_8:
        return copy(BaseSet.HITMONCHAN, this)
      case MAGNETON_9:
        return copy(BaseSet.MAGNETON, this)
      case MEWTWO_10:
        return copy(BaseSet.MEWTWO, this)
      case NIDOKING_11:
        return copy(BaseSet.NIDOKING, this)
      case NIDOQUEEN_12:
        return copy(Jungle.NIDOQUEEN, this)
      case NINETALES_13:
        return copy(BaseSet.NINETALES, this)
      case PIDGEOT_14:
        return copy(Jungle.PIDGEOT, this)
      case POLIWRATH_15:
        return copy(BaseSet.POLIWRATH, this)
      case RAICHU_16:
        return copy(BaseSet.RAICHU, this)
      case SCYTHER_17:
        return copy(Jungle.SCYTHER, this)
      case VENUSAUR_18:
        return copy(BaseSet.VENUSAUR, this)
      case WIGGLYTUFF_19:
        return copy(Jungle.WIGGLYTUFF, this)
      case ZAPDOS_20:
        return copy(BaseSet.ZAPDOS, this)
      case BEEDRILL_21:
        return copy(BaseSet.BEEDRILL, this)
      case DRAGONAIR_22:
        return copy(BaseSet.DRAGONAIR, this)
      case DUGTRIO_23:
        return copy(BaseSet.DUGTRIO, this)
      case ELECTABUZZ_24:
        return copy(BaseSet.ELECTABUZZ, this)
      case ELECTRODE_25:
        return copy(BaseSet.ELECTRODE, this)
      case KANGASKHAN_26:
        return copy(Jungle.KANGASKHAN, this)
      case MR__MIME_27:
        return copy(Jungle.MR_MIME, this)
      case PIDGEOTTO_28:
        return copy(BaseSet.PIDGEOTTO, this)
      case PINSIR_29:
        return copy(Jungle.PINSIR, this)
      case SNORLAX_30:
        return copy(Jungle.SNORLAX, this)
      case VENOMOTH_31:
        return copy(Jungle.VENOMOTH, this)
      case VICTREEBEL_32:
        return copy(Jungle.VICTREEBEL, this)
      case ARCANINE_33:
        return copy(BaseSet.ARCANINE, this)
      case BUTTERFREE_34:
        return copy(Jungle.BUTTERFREE, this)
      case CHARMELEON_35:
        return copy(BaseSet.CHARMELEON, this)
      case DEWGONG_36:
        return copy(BaseSet.DEWGONG, this)
      case DODRIO_37:
        return copy(Jungle.DODRIO, this)
      case DRATINI_38:
        return copy(BaseSet.DRATINI, this)
      case EXEGGUTOR_39:
        return copy(Jungle.EXEGGUTOR, this)
      case FARFETCH_D_40:
        return copy(BaseSet.FARFETCHD, this)
      case FEAROW_41:
        return copy(Jungle.FEAROW, this)
      case GROWLITHE_42:
        return copy(BaseSet.GROWLITHE, this)
      case HAUNTER_43:
        return copy(BaseSet.HAUNTER, this)
      case IVYSAUR_44:
        return copy(BaseSet.IVYSAUR, this)
      case JYNX_45:
        return copy(BaseSet.JYNX, this)
      case KADABRA_46:
        return copy(BaseSet.KADABRA, this)
      case KAKUNA_47:
        return copy(BaseSet.KAKUNA, this)
      case LICKITUNG_48:
        return copy(Jungle.LICKITUNG, this)
      case MACHOKE_49:
        return copy(BaseSet.MACHOKE, this)
      case MAGIKARP_50:
        return copy(BaseSet.MAGIKARP, this)
      case MAGMAR_51:
        return copy(BaseSet.MAGMAR, this)
      case MAROWAK_52:
        return copy(Jungle.MAROWAK, this)
      case NIDORINA_53:
        return copy(Jungle.NIDORINA, this)
      case NIDORINO_54:
        return copy(BaseSet.NIDORINO, this)
      case PARASECT_55:
        return copy(Jungle.PARASECT, this)
      case PERSIAN_56:
        return copy(Jungle.PERSIAN, this)
      case POLIWHIRL_57:
        return copy(BaseSet.POLIWHIRL, this)
      case RATICATE_58:
        return copy(BaseSet.RATICATE, this)
      case RHYDON_59:
        return copy(Jungle.RHYDON, this)
      case SEAKING_60:
        return copy(Jungle.SEAKING, this)
      case SEEL_61:
        return copy(BaseSet.SEEL, this)
      case TAUROS_62:
        return copy(Jungle.TAUROS, this)
      case WARTORTLE_63:
        return copy(BaseSet.WARTORTLE, this)
      case WEEPINBELL_64:
        return copy(Jungle.WEEPINBELL, this)
      case ABRA_65:
        return copy(BaseSet.ABRA, this)
      case BELLSPROUT_66:
        return copy(Jungle.BELLSPROUT, this)
      case BULBASAUR_67:
        return copy(BaseSet.BULBASAUR, this)
      case CATERPIE_68:
        return copy(BaseSet.CATERPIE, this)
      case CHARMANDER_69:
        return copy(BaseSet.CHARMANDER, this)
      case CUBONE_70:
        return copy(Jungle.CUBONE, this)
      case DIGLETT_71:
        return copy(BaseSet.DIGLETT, this)
      case DODUO_72:
        return copy(BaseSet.DODUO, this)
      case DROWZEE_73:
        return copy(BaseSet.DROWZEE, this)
      case EXEGGCUTE_74:
        return copy(Jungle.EXEGGCUTE, this)
      case GASTLY_75:
        return copy(BaseSet.GASTLY, this)
      case GOLDEEN_76:
        return copy(Jungle.GOLDEEN, this)
      case JIGGLYPUFF_77:
        return copy(Jungle.JIGGLYPUFF, this)
      case MACHOP_78:
        return copy(BaseSet.MACHOP, this)
      case MAGNEMITE_79:
        return copy(BaseSet.MAGNEMITE, this)
      case MEOWTH_80:
        return copy(Jungle.MEOWTH, this)
      case METAPOD_81:
        return copy(BaseSet.METAPOD, this)
      case NIDORAN_FEMALE_82:
        return copy(Jungle.NIDORAN_FEMALE, this)
      case NIDORAN_MALE_83:
        return copy(BaseSet.NIDORAN_MALE, this)
      case ONIX_84:
        return copy(BaseSet.ONIX, this)
      case PARAS_85:
        return copy(Jungle.PARAS, this)
      case PIDGEY_86:
        return copy(BaseSet.PIDGEY, this)
      case PIKACHU_87:
        return copy(BaseSet.PIKACHU, this)
      case POLIWAG_88:
        return copy(BaseSet.POLIWAG, this)
      case RATTATA_89:
        return copy(BaseSet.RATTATA, this)
      case RHYHORN_90:
        return copy(Jungle.RHYHORN, this)
      case SANDSHREW_91:
        return copy(BaseSet.SANDSHREW, this)
      case SPEAROW_92:
        return copy(Jungle.SPEAROW, this)
      case SQUIRTLE_93:
        return copy(BaseSet.SQUIRTLE, this)
      case STARMIE_94:
        return copy(BaseSet.STARMIE, this)
      case STARYU_95:
        return copy(BaseSet.STARYU, this)
      case TANGELA_96:
        return copy(BaseSet.TANGELA, this)
      case VENONAT_97:
        return copy(Jungle.VENONAT, this)
      case VOLTORB_98:
        return copy(BaseSet.VOLTORB, this)
      case VULPIX_99:
        return copy(BaseSet.VULPIX, this)
      case WEEDLE_100:
        return copy(BaseSet.WEEDLE, this)
      case COMPUTER_SEARCH_101:
        return copy(BaseSet.COMPUTER_SEARCH, this)
      case IMPOSTER_PROFESSOR_OAK_102:
        return copy(BaseSet.IMPOSTER_PROFESSOR_OAK, this)
      case ITEM_FINDER_103:
        return copy(BaseSet.ITEM_FINDER, this)
      case LASS_104:
        return copy(BaseSet.LASS, this)
      case POKEMON_BREEDER_105:
        return copy(BaseSet.POKEMON_BREEDER, this)
      case POKEMON_TRADER_106:
        return copy(BaseSet.POKEMON_TRADER, this)
      case SCOOP_UP_107:
        return copy(BaseSet.SCOOP_UP, this)
      case SUPER_ENERGY_REMOVAL_108:
        return copy(BaseSet.SUPER_ENERGY_REMOVAL, this)
      case DEFENDER_109:
        return copy(BaseSet.DEFENDER, this)
      case ENERGY_RETRIEVAL_110:
        return copy(BaseSet.ENERGY_RETRIEVAL, this)
      case FULL_HEAL_111:
        return copy(BaseSet.FULL_HEAL, this)
      case MAINTENANCE_112:
        return copy(BaseSet.MAINTENANCE, this)
      case PLUSPOWER_113:
        return copy(BaseSet.PLUSPOWER, this)
      case POKEMON_CENTER_114:
        return copy(BaseSet.POKEMON_CENTER, this)
      case POKEDEX_115:
        return copy(BaseSet.POKEDEX, this)
      case PROFESSOR_OAK_116:
        return copy(BaseSet.PROFESSOR_OAK, this)
      case SUPER_POTION_117:
        return copy(BaseSet.SUPER_POTION, this)
      case BILL_118:
        return copy(BaseSet.BILL, this)
      case ENERGY_REMOVAL_119:
        return copy(BaseSet.ENERGY_REMOVAL, this)
      case GUST_OF_WIND_120:
        return copy(BaseSet.GUST_OF_WIND, this)
      case POKE_BALL_121:
        return copy(Jungle.POKE_BALL, this)
      case POTION_122:
        return copy(BaseSet.POTION, this)
      case SWITCH_123:
        return copy(BaseSet.SWITCH, this)
      case DOUBLE_COLORLESS_ENERGY_124:
        return copy(BaseSet.DOUBLE_COLORLESS_ENERGY, this)
      case FIGHTING_ENERGY_125:
        return basicEnergy (this, F);
      case FIRE_ENERGY_126:
        return basicEnergy (this, R);
      case GRASS_ENERGY_127:
        return basicEnergy (this, G);
      case LIGHTNING_ENERGY_128:
        return basicEnergy (this, L);
      case PSYCHIC_ENERGY_129:
        return basicEnergy (this, P);
      case WATER_ENERGY_130:
        return basicEnergy (this, W);
      default:
        return null;

    }

  }

}