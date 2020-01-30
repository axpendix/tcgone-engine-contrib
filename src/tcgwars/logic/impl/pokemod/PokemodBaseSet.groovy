package tcgwars.logic.impl.pokemod;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum PokemodBaseSet implements LogicCardInfo {

  ALAKAZAM_1 ("Alakazam", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  BLASTOISE_2 ("Blastoise", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  CHANSEY_3 ("Chansey", 3, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  CHARIZARD_4 ("Charizard", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  CLEFAIRY_5 ("Clefairy", 5, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  GYARADOS_6 ("Gyarados", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HITMONCHAN_7 ("Hitmonchan", 7, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  MACHAMP_8 ("Machamp", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGNETON_9 ("Magneton", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MEWTWO_10 ("Mewtwo", 10, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOKING_11 ("Nidoking", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  NINETALES_12 ("Ninetales", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  POLIWRATH_13 ("Poliwrath", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAICHU_14 ("Raichu", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  VENUSAUR_15 ("Venusaur", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ZAPDOS_16 ("Zapdos", 16, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  BEEDRILL_17 ("Beedrill", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DRAGONAIR_18 ("Dragonair", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUGTRIO_19 ("Dugtrio", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ELECTABUZZ_20 ("Electabuzz", 20, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRODE_21 ("Electrode", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  PIDGEOTTO_22 ("Pidgeotto", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ARCANINE_23 ("Arcanine", 23, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CHARMELEON_24 ("Charmeleon", 24, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  DEWGONG_25 ("Dewgong", 25, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DRATINI_26 ("Dratini", 26, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  FARFETCHD_27 ("Farfetch'd", 27, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GROWLITHE_28 ("Growlithe", 28, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  HAUNTER_29 ("Haunter", 29, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  IVYSAUR_30 ("Ivysaur", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  JYNX_31 ("Jynx", 31, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  KADABRA_32 ("Kadabra", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  KAKUNA_33 ("Kakuna", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MACHOKE_34 ("Machoke", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGIKARP_35 ("Magikarp", 35, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  MAGMAR_36 ("Magmar", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  NIDORINO_37 ("Nidorino", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  POLIWHIRL_38 ("Poliwhirl", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PORYGON_39 ("Porygon", 39, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  RATICATE_40 ("Raticate", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SEEL_41 ("Seel", 41, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  WARTORTLE_42 ("Wartortle", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ABRA_43 ("Abra", 43, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BULBASAUR_44 ("Bulbasaur", 44, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CATERPIE_45 ("Caterpie", 45, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHARMANDER_46 ("Charmander", 46, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  DIGLETT_47 ("Diglett", 47, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DODUO_48 ("Doduo", 48, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DROWZEE_49 ("Drowzee", 49, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GASTLY_50 ("Gastly", 50, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  KOFFING_51 ("Koffing", 51, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MACHOP_52 ("Machop", 52, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGNEMITE_53 ("Magnemite", 53, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  METAPOD_54 ("Metapod", 54, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORAN_MALE_55 ("Nidoran♂", 55, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ONIX_56 ("Onix", 56, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIDGEY_57 ("Pidgey", 57, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PIKACHU_58 ("Pikachu", 58, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  POLIWAG_59 ("Poliwag", 59, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PONYTA_60 ("Ponyta", 60, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  RATTATA_61 ("Rattata", 61, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SANDSHREW_62 ("Sandshrew", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SQUIRTLE_63 ("Squirtle", 63, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARMIE_64 ("Starmie", 64, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  STARYU_65 ("Staryu", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TANGELA_66 ("Tangela", 66, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_67 ("Voltorb", 67, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  VULPIX_68 ("Vulpix", 68, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WEEDLE_69 ("Weedle", 69, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CLEFAIRY_DOLL_70 ("Clefairy Doll", 70, Rarity.RARE, [TRAINER]),
  COMPUTER_SEARCH_71 ("Computer Search", 71, Rarity.RARE, [TRAINER]),
  DEVOLUTION_SPRAY_72 ("Devolution Spray", 72, Rarity.RARE, [TRAINER]),
  IMPOSTOR_PROFESSOR_OAK_73 ("Impostor Professor Oak", 73, Rarity.RARE, [TRAINER]),
  ITEM_FINDER_74 ("Item Finder", 74, Rarity.RARE, [TRAINER]),
  LASS_75 ("Lass", 75, Rarity.RARE, [TRAINER]),
  POKEMON_BREEDER_76 ("Pokémon Breeder", 76, Rarity.RARE, [TRAINER]),
  POKEMON_TRADER_77 ("Pokémon Trader", 77, Rarity.RARE, [TRAINER]),
  SCOOP_UP_78 ("Scoop Up", 78, Rarity.RARE, [TRAINER]),
  SUPER_ENERGY_REMOVAL_79 ("Super Energy Removal", 79, Rarity.RARE, [TRAINER]),
  DEFENDER_80 ("Defender", 80, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_RETRIEVAL_81 ("Energy Retrieval", 81, Rarity.UNCOMMON, [TRAINER]),
  FULL_HEAL_82 ("Full Heal", 82, Rarity.UNCOMMON, [TRAINER]),
  MAINTENANCE_83 ("Maintenance", 83, Rarity.UNCOMMON, [TRAINER]),
  PLUSPOWER_84 ("PlusPower", 84, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_CENTER_85 ("Pokémon Center", 85, Rarity.UNCOMMON, [TRAINER]),
  POKEMON_FLUTE_86 ("Pokémon Flute", 86, Rarity.UNCOMMON, [TRAINER]),
  POKEDEX_87 ("Pokédex", 87, Rarity.UNCOMMON, [TRAINER]),
  PROFESSOR_OAK_88 ("Professor Oak", 88, Rarity.UNCOMMON, [TRAINER]),
  REVIVE_89 ("Revive", 89, Rarity.UNCOMMON, [TRAINER]),
  SUPER_POTION_90 ("Super Potion", 90, Rarity.UNCOMMON, [TRAINER]),
  BILL_91 ("Bill", 91, Rarity.COMMON, [TRAINER]),
  ENERGY_REMOVAL_92 ("Energy Removal", 92, Rarity.COMMON, [TRAINER]),
  GUST_OF_WIND_93 ("Gust of Wind", 93, Rarity.COMMON, [TRAINER]),
  POTION_94 ("Potion", 94, Rarity.COMMON, [TRAINER]),
  SWITCH_95 ("Switch", 95, Rarity.COMMON, [TRAINER]),
  DOUBLE_COLORLESS_ENERGY_96 ("Double Colorless Energy", 96, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  FIGHTING_ENERGY_97 ("Fighting Energy", 97, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  FIRE_ENERGY_98 ("Fire Energy", 98, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  GRASS_ENERGY_99 ("Grass Energy", 99, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  LIGHTNING_ENERGY_100 ("Lightning Energy", 100, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  PSYCHIC_ENERGY_101 ("Psychic Energy", 101, Rarity.COMMON, [BASIC_ENERGY, ENERGY]),
  WATER_ENERGY_102 ("Water Energy", 102, Rarity.COMMON, [BASIC_ENERGY, ENERGY]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  PokemodBaseSet(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.BASE_SET;
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
        return copy(BaseSet.ALAKAZAM, this)
      case BLASTOISE_2:
        return copy(BaseSet.BLASTOISE, this)
      case CHANSEY_3:
        return copy(BaseSet.CHANSEY, this)
      case CHARIZARD_4:
        return evolution (this, from:"Charmeleon", hp:HP120, type:FIRE, retreatCost:3) {
          weakness WATER
          resistance FIGHTING, MINUS30
          pokemonPower "Energy Burn", {
            text "As often as you like during your turn (before your attack), you may turn all Energy attached to Charizard into [R] Energy for the rest of the turn. This power can’t be used if Charizard is Asleep, Confused, or Paralyzed or has at least one Special Energy card attached."
            def set = [] as Set
            def eff1, eff2
            onActivate {
              if(eff1) eff1.unregister()
              if(eff2) eff2.unregister()
              eff1 = delayed {
                before BETWEEN_TURNS, {
                  set.clear()
                }
              }
              eff2 = getter GET_ENERGY_TYPES, { holder->
                if(set.contains(holder.effect.card)) {
                  int count = holder.object.size()
                  holder.object = [(1..count).collect{[FIRE] as Set}]
                }
              }
            }
            actionA {
              assert !(self.specialConditions) : "$self is affected by a special condition"
              assert self.cards.filterByType(SPECIAL_ENERGY).empty : "$self has Special Energy"
              def newSet = [] as Set
              newSet.addAll(self.cards.filterByType(ENERGY))
              if(newSet != set){
                powerUsed()
                set.clear()
                set.addAll(newSet)
              } else {
                wcu "Nothing to burn more"
              }
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              damage 100
              discardSelfEnergy(C) // one energy card
              discardSelfEnergy(C) // one energy card
            }
          }

        };

      case CLEFAIRY_5:
        break
      case GYARADOS_6:
        break
      case HITMONCHAN_7:
        break
      case MACHAMP_8:
        break
      case MAGNETON_9:
        break
      case MEWTWO_10:
        break
      case NIDOKING_11:
        break
      case NINETALES_12:
        break
      case POLIWRATH_13:
        break
      case RAICHU_14:
        break
      case VENUSAUR_15:
        break
      case ZAPDOS_16:
        break
      case BEEDRILL_17:
        break
      case DRAGONAIR_18:
        break
      case DUGTRIO_19:
        break
      case ELECTABUZZ_20:
        break
      case ELECTRODE_21:
        break
      case PIDGEOTTO_22:
        break
      case ARCANINE_23:
        break
      case CHARMELEON_24:
        break
      case DEWGONG_25:
        break
      case DRATINI_26:
        break
      case FARFETCHD_27:
        break
      case GROWLITHE_28:
        break
      case HAUNTER_29:
        break
      case IVYSAUR_30:
        break
      case JYNX_31:
        break
      case KADABRA_32:
        break
      case KAKUNA_33:
        break
      case MACHOKE_34:
        break
      case MAGIKARP_35:
        break
      case MAGMAR_36:
        break
      case NIDORINO_37:
        break
      case POLIWHIRL_38:
        break
      case PORYGON_39:
        break
      case RATICATE_40:
        break
      case SEEL_41:
        break
      case WARTORTLE_42:
        break
      case ABRA_43:
        break
      case BULBASAUR_44:
        break
      case CATERPIE_45:
        break
      case CHARMANDER_46:
        break
      case DIGLETT_47:
        break
      case DODUO_48:
        break
      case DROWZEE_49:
        break
      case GASTLY_50:
        break
      case KOFFING_51:
        break
      case MACHOP_52:
        break
      case MAGNEMITE_53:
        break
      case METAPOD_54:
        break
      case NIDORAN_MALE_55:
        break
      case ONIX_56:
        break
      case PIDGEY_57:
        break
      case PIKACHU_58:
        break
      case POLIWAG_59:
        break
      case PONYTA_60:
        break
      case RATTATA_61:
        break
      case SANDSHREW_62:
        break
      case SQUIRTLE_63:
        break
      case STARMIE_64:
        break
      case STARYU_65:
        break
      case TANGELA_66:
        break
      case VOLTORB_67:
        break
      case VULPIX_68:
        break
      case WEEDLE_69:
        break
      case CLEFAIRY_DOLL_70:
        break
      case COMPUTER_SEARCH_71:
        break
      case DEVOLUTION_SPRAY_72:
        break
      case IMPOSTOR_PROFESSOR_OAK_73:
        break
      case ITEM_FINDER_74:
        break
      case LASS_75:
        break
      case POKEMON_BREEDER_76:
        break
      case POKEMON_TRADER_77:
        break
      case SCOOP_UP_78:
        break
      case SUPER_ENERGY_REMOVAL_79:
        break
      case DEFENDER_80:
        break
      case ENERGY_RETRIEVAL_81:
        break
      case FULL_HEAL_82:
        break
      case MAINTENANCE_83:
        break
      case PLUSPOWER_84:
        break
      case POKEMON_CENTER_85:
        break
      case POKEMON_FLUTE_86:
        break
      case POKEDEX_87:
        break
      case PROFESSOR_OAK_88:
        break
      case REVIVE_89:
        break
      case SUPER_POTION_90:
        break
      case BILL_91:
        break
      case ENERGY_REMOVAL_92:
        break
      case GUST_OF_WIND_93:
        break
      case POTION_94:
        break
      case SWITCH_95:
        break
      case DOUBLE_COLORLESS_ENERGY_96:
        break
      case FIGHTING_ENERGY_97:
        break
      case FIRE_ENERGY_98:
        break
      case GRASS_ENERGY_99:
        break
      case LIGHTNING_ENERGY_100:
        break
      case PSYCHIC_ENERGY_101:
        break
      case WATER_ENERGY_102:
        break
        return null;
    }
  }

}
